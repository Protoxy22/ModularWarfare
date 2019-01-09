package com.modularwarfare;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.modularwarfare.common.CommonProxy;
import com.modularwarfare.common.MWTab;
import com.modularwarfare.common.guns.AmmoType;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemAmmo;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.common.type.BaseType;
import com.modularwarfare.common.type.ContentTypes;
import com.modularwarfare.common.type.TypeEntry;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = ModularWarfare.MOD_ID, name = ModularWarfare.MOD_NAME, version = ModularWarfare.MOD_VERSION)
public class ModularWarfare {

	public static final String MOD_ID = "modularwarfare";
	public static final String MOD_NAME = "Modular Warfare";
	public static final String MOD_VERSION = "1.0.0";
	public static CreativeTabs MOD_TAB;

	@SidedProxy(clientSide = "com.modularwarfare.client.ClientProxy", serverSide = "com.modularwarfare.common.CommonProxy")
	public static CommonProxy PROXY;
	
	public static Logger LOGGER;
	public static File MOD_DIR;
	
	public static ArrayList<ItemGun> gunTypes = new ArrayList<ItemGun>();
	public static ArrayList<ItemAmmo> ammoTypes = new ArrayList<ItemAmmo>();
	public static ArrayList<BaseType> baseTypes = new ArrayList<BaseType>();

	// REGISTER ITEMS AND STUFF
	@EventHandler
	public void onPreInitialization(FMLPreInitializationEvent event) {
		ContentTypes.registerTypes();
		MOD_TAB = new MWTab();
		LOGGER = event.getModLog();
		
		// Creates directory if doesn't exist
		 MOD_DIR = new File(event.getModConfigurationDirectory().getParentFile(), "ModularWarfare");
		if(!MOD_DIR.exists())
		{
			MOD_DIR.mkdir();
			LOGGER.info("Created ModularWarfare folder, it's recommended to install content packs.");
			LOGGER.info("As the mod itself doesn't come with any content.");
		}
		
		loadContentPacks();
		registerItems();
		
		PROXY.load();
		PROXY.forceReload();
	}

	// REGISTER EVENTS, IMC, AND WORLD STUFF
	@EventHandler
	public void onInitialization(FMLInitializationEvent event) {
	}

	// REGISTER COMMANDS AND SERVER SIDED REGIONS
	@EventHandler
	public void onServerStarting(FMLServerStartingEvent event) {
		
	}
	
	public void registerItems()
	{
		for(ItemGun itemGun : gunTypes)
			GameRegistry.registerItem(itemGun, itemGun.type.internalName);
		
		for(ItemAmmo itemAmmo : ammoTypes)
			GameRegistry.registerItem(itemAmmo, itemAmmo.type.internalName);
	}

	public void loadContentPacks() {
		ClassLoader classloader = (net.minecraft.server.MinecraftServer.class).getClassLoader();
		Method method = null;
		try
		{
			method = (java.net.URLClassLoader.class).getDeclaredMethod("addURL", java.net.URL.class);
			method.setAccessible(true);
		} catch (Exception e)
		{
			LOGGER.error("Failed to get class loader. All content loading will now fail.");
			e.printStackTrace();
		}
		
		List<File> contentPacks = PROXY.getContentList(method, classloader);
		getTypeFiles(contentPacks);
				
		for(BaseType baseType : baseTypes)
		{
			switch(baseType.id)
			{
				case 0: {gunTypes.add(new ItemGun((GunType) baseType));break;}
				case 1: {ammoTypes.add(new ItemAmmo((AmmoType) baseType));break;}
			}
		}
	}
	
	public void getTypeFiles(List<File> contentPacks)
	{
		Gson gson = new Gson();
		
		for(File file : contentPacks)
		{
			if(file.isDirectory())
			{
				for(TypeEntry type : ContentTypes.values)
				{
					File subFolder = new File(file, "/" + type.name + "/");
					if(subFolder.exists())
					{
						for(File typeFile : subFolder.listFiles())
						{
							try
							{
								JsonReader jsonReader = new JsonReader(new FileReader(typeFile));
								BaseType parsedType = gson.fromJson(jsonReader, type.typeClass);
								parsedType.id = type.id;
								baseTypes.add(parsedType);
							} catch(Exception exception)
							{
								exception.printStackTrace();
							}
						}
					}
				}
			} else
			{
				try
				{
					ZipFile zipFile = new ZipFile(file);
					ZipInputStream zipStream = new ZipInputStream(new FileInputStream(file));
					ZipEntry zipEntry;
					while((zipEntry = zipStream.getNextEntry()) != null)
					{
						for(TypeEntry type : ContentTypes.values)
						{
							String zipName = zipEntry.getName();
							String typeName = type.toString();
							if (zipName.startsWith(typeName + "/") && zipName.split(typeName + "/").length > 1 && zipName.split(typeName + "/")[1].length() > 0) 
							{
								InputStream stream = zipFile.getInputStream(zipEntry);
								JsonReader jsonReader = new JsonReader(new InputStreamReader(stream));
								BaseType parsedType = gson.fromJson(jsonReader, type.typeClass);
								baseTypes.add(parsedType);
							}
						}
					}
					zipFile.close();
					zipStream.close();
				} catch(Exception exception)
				{
					exception.printStackTrace();
				}
			}
		}
	}

}
