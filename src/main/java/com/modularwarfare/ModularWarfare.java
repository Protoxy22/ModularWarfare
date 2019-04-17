package com.modularwarfare;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.jadarstudios.developercapes.DevCapes;
import com.modularwarfare.common.CommonProxy;
import com.modularwarfare.common.MWTab;
import com.modularwarfare.common.armor.ArmorType;
import com.modularwarfare.common.armor.ArmorType.ArmorInfo;
import com.modularwarfare.common.armor.ItemMWArmor;
import com.modularwarfare.common.blocks.BlockType;
import com.modularwarfare.common.blocks.CustomBlock;
import com.modularwarfare.common.blocks.CustomItemBlock;
import com.modularwarfare.common.guns.AmmoType;
import com.modularwarfare.common.guns.AttachmentType;
import com.modularwarfare.common.guns.BulletType;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemAmmo;
import com.modularwarfare.common.guns.ItemAttachment;
import com.modularwarfare.common.guns.ItemBullet;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.common.handler.ServerTickHandler;
import com.modularwarfare.common.network.NetworkHandler;
import com.modularwarfare.common.type.BaseType;
import com.modularwarfare.common.type.ContentTypes;
import com.modularwarfare.common.type.TypeEntry;

import net.minecraft.block.Block;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.launchwrapper.Launch;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = ModularWarfare.MOD_ID, name = ModularWarfare.MOD_NAME, version = ModularWarfare.MOD_VERSION)
public class ModularWarfare {

	public static final String MOD_ID = "modularwarfare";
	public static final String MOD_NAME = "Modular Warfare";
	public static final String MOD_VERSION = "1.0.0";
	public static MWTab MOD_TAB = new MWTab();

	@SidedProxy(clientSide = "com.modularwarfare.client.ClientProxy", serverSide = "com.modularwarfare.common.CommonProxy")
	public static CommonProxy PROXY;
	
	// Development Environment
	public static boolean DEV_ENV = false;
	// Logger
	public static Logger LOGGER;
	// Network Handler
	public static NetworkHandler NETWORK;
	// The ModularWarfare directory
	public static File MOD_DIR;
	
	// Arrays for the varied types
	public static HashMap<String, ItemGun> gunTypes = new HashMap<String, ItemGun>();
	public static HashMap<String, ItemAmmo> ammoTypes = new HashMap<String, ItemAmmo>();
	public static HashMap<String, ItemAttachment> attachmentTypes = new HashMap<String, ItemAttachment>();
	public static LinkedHashMap<String, ItemMWArmor> armorTypes = new LinkedHashMap<String, ItemMWArmor>();
	public static HashMap<String, ItemBullet> bulletTypes = new HashMap<String, ItemBullet>();
	public static ArrayList<BaseType> baseTypes = new ArrayList<BaseType>();
	public static HashMap<String, CustomBlock> blockTypes = new HashMap<String, CustomBlock>();

	/**
	 * Registers items, blocks, renders, etc
	 * @param event
	 */
	@EventHandler
	public void onPreInitialization(FMLPreInitializationEvent event) {
		DEV_ENV = (Boolean) Launch.blackboard.get("fml.deobfuscatedEnvironment");
		LOGGER = event.getModLog();
		
		// Creates directory if doesn't exist
		 MOD_DIR = new File(event.getModConfigurationDirectory().getParentFile(), "ModularWarfare");
		if(!MOD_DIR.exists())
		{
			MOD_DIR.mkdir();
			LOGGER.info("Created ModularWarfare folder, it's recommended to install content packs.");
			LOGGER.info("As the mod itself doesn't come with any content.");
		}
		new ModConfig(new File(MOD_DIR, "mod_config.json"));
		
		// Loads Content Packs
		ContentTypes.registerTypes();
		loadContentPacks(false);
		
		// Client side loading
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
		
		PROXY.load();
		
		if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
			DevCapes.getInstance().registerConfig("http://192.99.154.186/capes.json");
		}
		
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
	    for(ItemBullet itemBullet : bulletTypes.values()) 
	    {
	    	event.getRegistry().register(itemBullet);
	    	tabOrder.add(itemBullet);
	    }
	    for(ItemMWArmor itemArmor : armorTypes.values())
	    {
	    	event.getRegistry().register(itemArmor);
	    	tabOrder.add(itemArmor);
	    }
	    for(ItemAttachment itemAttachment : attachmentTypes.values()) 
	    {
	    	event.getRegistry().register(itemAttachment);
	    	tabOrder.add(itemAttachment);
	    }
	    for(CustomBlock block : blockTypes.values())
	    {
	    	ItemBlock itemBlock = new CustomItemBlock(block);
	    	event.getRegistry().register(itemBlock);
	    	tabOrder.add(itemBlock);
	    }
	    MOD_TAB.preInitialize(tabOrder);
	}
	
	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event)
	{
		for(CustomBlock block : blockTypes.values())
		{
			event.getRegistry().register(block);
		}
	}
	
	@SubscribeEvent
	public void registerEntities(RegistryEvent.Register<EntityEntry> event)
	{
		
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
				baseType.loadExtraValues();
				switch(baseType.id)
				{
					case 0: {gunTypes.get(baseType.internalName).setType((GunType) baseType); break;}
					case 1: {ammoTypes.get(baseType.internalName).setType((AmmoType) baseType); break;}
					case 2: {attachmentTypes.get(baseType.internalName).setType((AttachmentType) baseType); break;}
					case 3: {armorTypes.get(baseType.internalName).setType((ArmorType) baseType); break;}
					case 4: {bulletTypes.get(baseType.internalName).setType((BulletType) baseType); break;}
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
					case 2: {attachmentTypes.put(baseType.internalName, new ItemAttachment((AttachmentType) baseType));break;}
					case 3: {
						ArmorType armorType = (ArmorType) baseType;
						for(ArmorInfo armorInfo : armorType.armorTypes)
						{
							String armorSlot = armorInfo.armorType.toString();
							armorTypes.put(baseType.internalName + "_" + armorSlot, new ItemMWArmor(armorType, EntityEquipmentSlot.fromString(armorSlot)));
						}
						break;
					}
					case 4: {bulletTypes.put(baseType.internalName, new ItemBullet((BulletType) baseType));break;}
					case 5: {blockTypes.put(baseType.internalName, new CustomBlock((BlockType) baseType));break;}
				}
			}
		}
		
		if(DEV_ENV)
		{
			PROXY.generateJsonModels(baseTypes);
			// TODO: Fix content pack file reload
			if(reload)
				return;
			PROXY.generateJsonSounds(gunTypes.values(), DEV_ENV);
			PROXY.generateLangFiles(baseTypes, DEV_ENV);
		}
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
								parsedType.id = type.id;
								parsedType.contentPack = file.getName();
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
