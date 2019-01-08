package com.modularwarfare;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.modularwarfare.common.CommonProxy;
import com.modularwarfare.common.guns.GunType;
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

@Mod(modid = ModularWarfare.MOD_ID, name = ModularWarfare.MOD_NAME, version = ModularWarfare.MOD_VERSION)
public class ModularWarfare {

	public static final String MOD_ID = "modularwarfare";
	public static final String MOD_NAME = "Modular Warfare";
	public static final String MOD_VERSION = "1.0.0";

	@SidedProxy(clientSide = "com.modularwarfare.client.ClientProxy", serverSide = "com.modularwarfare.common.CommonProxy")
	public static CommonProxy PROXY;
	
	public static Logger LOGGER;
	
	public static ArrayList<ItemGun> gunTypes = new ArrayList<ItemGun>();

	// REGISTER ITEMS AND STUFF
	@EventHandler
	public void onPreInitialization(FMLPreInitializationEvent event) {
		ContentTypes.registerTypes();
		LOGGER = event.getModLog();
		
		// Creates directory if doesn't exist
		File contentDir = new File(event.getModConfigurationDirectory().getParentFile(), "ModularWarfare");
		if(!contentDir.exists())
		{
			contentDir.mkdir();
			LOGGER.info("Created ModularWarfare folder, it's recommended to install content packs.");
			LOGGER.info("As the mod itself doesn't come with any content.");
		}
		
		loadContentPacks(contentDir);
		
		for(ItemGun itemGun : gunTypes)
		{
			System.out.println(itemGun.type.toString());
		}
	}

	// REGISTER EVENTS, IMC, AND WORLD STUFF
	@EventHandler
	public void onInitialization(FMLInitializationEvent event) {
	}

	// REGISTER COMMANDS AND SERVER SIDED REGIONS
	@EventHandler
	public void onServerStarting(FMLServerStartingEvent event) {
		
	}

	public void loadContentPacks(File contentDir) {
		ArrayList<BaseType> baseTypes = getTypeFiles(contentDir);
		
		for(BaseType baseType : baseTypes)
		{
			switch(baseType.id)
			{
				case 0: {gunTypes.add(new ItemGun((GunType) baseType));break;}
			}
		}
	}
	
	public ArrayList<BaseType> getTypeFiles(File contentDir)
	{
		ArrayList<BaseType> baseTypes = new ArrayList<BaseType>();
		Gson gson = new Gson();
		
		for(File file : contentDir.listFiles())
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
		
		return baseTypes;
	}

}
