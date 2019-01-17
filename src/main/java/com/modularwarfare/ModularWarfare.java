package com.modularwarfare;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
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
import com.modularwarfare.common.handler.ServerTickHandler;
import com.modularwarfare.common.network.NetworkHandler;
import com.modularwarfare.common.type.BaseType;
import com.modularwarfare.common.type.ContentTypes;
import com.modularwarfare.common.type.TypeEntry;

import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = ModularWarfare.MOD_ID, name = ModularWarfare.MOD_NAME, version = ModularWarfare.MOD_VERSION)
public class ModularWarfare {

	public static final String MOD_ID = "modularwarfare";
	public static final String MOD_NAME = "Modular Warfare";
	public static final String MOD_VERSION = "1.0.0";
	public static MWTab MOD_TAB = new MWTab();

	@SidedProxy(clientSide = "com.modularwarfare.client.ClientProxy", serverSide = "com.modularwarfare.common.CommonProxy")
	public static CommonProxy PROXY;
	
	// Logger
	public static Logger LOGGER;
	// Network Handler
	public static NetworkHandler NETWORK;
	// The ModularWarfare directory
	public static File MOD_DIR;
	
	// Arrays for the varied types
	public static HashMap<String, ItemGun> gunTypes = new HashMap<String, ItemGun>();
	public static HashMap<String, ItemAmmo> ammoTypes = new HashMap<String, ItemAmmo>();
	public static ArrayList<BaseType> baseTypes = new ArrayList<BaseType>();
	

	/**
	 * Registers items, blocks, renders, etc
	 * @param event
	 */
	@EventHandler
	public void onPreInitialization(FMLPreInitializationEvent event) {
		LOGGER = event.getModLog();
		
		// Creates directory if doesn't exist
		 MOD_DIR = new File(event.getModConfigurationDirectory().getParentFile(), "ModularWarfare");
		if(!MOD_DIR.exists())
		{
			MOD_DIR.mkdir();
			LOGGER.info("Created ModularWarfare folder, it's recommended to install content packs.");
			LOGGER.info("As the mod itself doesn't come with any content.");
		}
		
		// Loads Content Packs
		ContentTypes.registerTypes();
		loadContentPacks(false);
		
		// Client side loading
		PROXY.load();
		PROXY.forceReload();
		
		MinecraftForge.EVENT_BUS.register(this);
	}

	/**
	 * Register events, imc, and world stuff
	 * @param event
	 */
	@EventHandler
	public void onInitialization(FMLInitializationEvent event) {
		new ServerTickHandler();
		
		NETWORK = new NetworkHandler();
		NETWORK.initialise();
	}
	
	/**
	 * Last loading things
	 * @param event
	 */
	@EventHandler
	public void onPostInitialization(FMLPostInitializationEvent event) {
		NETWORK.postInitialise();
	}

	/**
	 * Registers commands and server sided regions
	 * @param event
	 */
	@EventHandler
	public void onServerStarting(FMLServerStartingEvent event) {
		
	}
	
	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) 
	{
		List<Item> tabOrder = new ArrayList<Item>();
		for(ItemGun itemGun : gunTypes.values()) 
		{
			event.getRegistry().register(itemGun);
			tabOrder.add(itemGun);
		}	
	    for(ItemAmmo itemAmmo : ammoTypes.values()) 
	    {
	    	event.getRegistry().register(itemAmmo);
	    	tabOrder.add(itemAmmo);
	    }
	    MOD_TAB.preInitialize(tabOrder);
	}
	
	/**
	 * Sorts all type files into their proper arraylist
	 */
	public static void loadContentPacks(boolean reload) {
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
		
		if(reload)
		{
			for(BaseType baseType : baseTypes)
			{
				switch(baseType.id)
				{
					case 0: {gunTypes.get(baseType.internalName).setType((GunType) baseType); break;}
					case 1: {ammoTypes.get(baseType.internalName).setType((AmmoType) baseType); break;}
				}
			}
		} else
		{
			for(BaseType baseType : baseTypes)
			{
				switch(baseType.id)
				{
					case 0: {gunTypes.put(baseType.internalName, new ItemGun((GunType) baseType));break;}
					case 1: {ammoTypes.put(baseType.internalName, new ItemAmmo((AmmoType) baseType));break;}
				}
			}
		}
		
		PROXY.generateJsonModels(baseTypes);
	}
	
	/**
	 * Gets all type files from the content packs
	 * @param contentPacks
	 */
	private static void getTypeFiles(List<File> contentPacks)
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
								parsedType.contentPack = file.getName();
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
