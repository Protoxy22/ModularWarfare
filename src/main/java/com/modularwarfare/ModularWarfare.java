package com.modularwarfare;

import java.io.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import com.google.gsonapi.Gson;
import com.google.gsonapi.GsonBuilder;
import com.google.gsonapi.stream.JsonReader;
import com.modularwarfare.api.IArmor;
import com.modularwarfare.api.MWArmorType;
import com.modularwarfare.api.cap.ArmorCapabilities;
import com.modularwarfare.api.cap.ArmorContainer;
import com.modularwarfare.api.cap.IArmorItemHandler;
import com.modularwarfare.api.cap.SpecialArmorItem;
import com.modularwarfare.common.entity.EntityBot;
import com.modularwarfare.common.entity.decals.EntityBulletHole;
import com.modularwarfare.common.guns.*;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import org.apache.logging.log4j.Logger;

import com.modularwarfare.common.CommonProxy;
import com.modularwarfare.common.MWTab;
import com.modularwarfare.common.armor.ArmorType;
import com.modularwarfare.common.armor.ItemMWArmor;
import com.modularwarfare.common.armor.ItemSpecialArmor;
import com.modularwarfare.common.handler.ServerTickHandler;
import com.modularwarfare.common.network.NetworkHandler;
import com.modularwarfare.common.type.BaseType;
import com.modularwarfare.common.type.ContentTypes;
import com.modularwarfare.common.type.TypeEntry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;

@Mod(modid = ModularWarfare.MOD_ID, name = ModularWarfare.MOD_NAME, version = ModularWarfare.MOD_VERSION)
public class ModularWarfare {

	// Mod Info
	public static final String MOD_ID = "modularwarfare";
	public static final String MOD_NAME = "ModularWarfare";
	public static final String MOD_VERSION = "1.0.0";
	// Main instance
	@Instance(ModularWarfare.MOD_ID)
	public static ModularWarfare INSTANCE;
	// Proxy
	@SidedProxy(clientSide = "com.modularwarfare.client.ClientProxy", serverSide = "com.modularwarfare.common.CommonProxy")
	public static CommonProxy PROXY;
	// Development Environment
	public static boolean DEV_ENV = true;
	// Creative Tabs
	public static MWTab MOD_TAB = new MWTab();
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
	public static LinkedHashMap<String, ItemSpecialArmor> specialArmorTypes = new LinkedHashMap<String, ItemSpecialArmor>();
	public static HashMap<String, ItemBullet> bulletTypes = new HashMap<String, ItemBullet>();
	public static HashMap<String, ItemSpray> sprayTypes = new HashMap<String, ItemSpray>();

	public static ArrayList<BaseType> baseTypes = new ArrayList<BaseType>();

	static int entityID = -1;

	public static boolean isPropsFeaturesEnabled = false;

	/**
	 * Registers items, blocks, renders, etc
	 *
	 * @param event
	 */
	@EventHandler
	public void onPreInitialization(FMLPreInitializationEvent event) {
		LOGGER = event.getModLog();
		PROXY.preload();
		// Creates directory if doesn't exist
		MOD_DIR = new File(event.getModConfigurationDirectory().getParentFile(), "ModularWarfare");
		if (!MOD_DIR.exists()) {
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

		CapabilityManager.INSTANCE.register(IArmorItemHandler.class, new ArmorCapabilities.CapabilityBaubles(), ArmorContainer.class);
		CapabilityManager.INSTANCE.register(IArmor.class, new ArmorCapabilities.CapabilityItemBaubleStorage(), () -> new SpecialArmorItem(MWArmorType.Any));

		PROXY.registerEventHandlers();

		MinecraftForge.EVENT_BUS.register(this);
	}

	/**
	 * Register events, imc, and world stuff
	 *
	 * @param event
	 */
	@EventHandler
	public void onInitialization(FMLInitializationEvent event) {
		new ServerTickHandler();

		PROXY.load();

		NETWORK = new NetworkHandler();
		NETWORK.initialise();

		NetworkRegistry.INSTANCE.registerGuiHandler(ModularWarfare.INSTANCE, ModularWarfare.PROXY);

		PROXY.init();
	}

	/**
	 * Last loading things
	 *
	 * @param event
	 */
	@EventHandler
	public void onPostInitialization(FMLPostInitializationEvent event) {
		NETWORK.postInitialise();
		if (Loader.isModLoaded("modelloader")) {
			isPropsFeaturesEnabled = true;
			LOGGER.info("[ModularWarfare] Modelloader has been registered.");
		} else {
			LOGGER.info("[ModularWarfare] Modelloader missing, disabling props.");
		}
	}

	/**
	 * Registers commands and server sided regions
	 *
	 * @param event
	 */
	@EventHandler
	public void onServerStarting(FMLServerStartingEvent event) {
	}

	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		List<Item> tabOrder = new ArrayList<Item>();
		for (ItemGun itemGun : gunTypes.values()) {
			event.getRegistry().register(itemGun);
			tabOrder.add(itemGun);
		}
		for (ItemAmmo itemAmmo : ammoTypes.values()) {
			event.getRegistry().register(itemAmmo);
			tabOrder.add(itemAmmo);
		}
		for (ItemBullet itemBullet : bulletTypes.values()) {
			event.getRegistry().register(itemBullet);
			tabOrder.add(itemBullet);
		}
		for (ItemMWArmor itemArmor : armorTypes.values()) {
			event.getRegistry().register(itemArmor);
			tabOrder.add(itemArmor);
		}
		for (ItemSpecialArmor itemSpecialArmor : specialArmorTypes.values()) {
			event.getRegistry().register(itemSpecialArmor);
			tabOrder.add(itemSpecialArmor);
		}
		for (ItemAttachment itemAttachment : attachmentTypes.values()) {
			event.getRegistry().register(itemAttachment);
			tabOrder.add(itemAttachment);
		}
		for (ItemSpray itemAttachment : sprayTypes.values()) {
			event.getRegistry().register(itemAttachment);
			tabOrder.add(itemAttachment);
		}

		MOD_TAB.preInitialize(tabOrder);
	}

	@SubscribeEvent
	public void registerEntities(RegistryEvent.Register<EntityEntry> event) {
		EntityRegistry.registerModEntity(new ResourceLocation(ModularWarfare.MOD_ID, "bot"), EntityBot.class, "bot", 2, this, 64, 1, false);
		EntityRegistry.registerModEntity(new ResourceLocation(ModularWarfare.MOD_ID, "bullethole"), EntityBulletHole.class, "bullethole", 3, this, 80, 10, false);

	}


	private ItemBlock createItemBlock(Block block) {
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		item.setCreativeTab(MOD_TAB);
		return item;
	}

	private static <E extends Entity> EntityEntryBuilder<E> createEntityBuilder(String name) {
		EntityEntryBuilder<E> builder = EntityEntryBuilder.create();
		ResourceLocation regName = new ResourceLocation(MOD_ID, name);
		return builder.id(regName, ID()).name(regName.toString());
	}

	private static EntityEntry registerEntity(String name, Class<? extends Entity> cl, int trackRange, int frequency, boolean velocityUpdates) {
		return createEntityBuilder(name).entity(cl).tracker(trackRange, frequency, velocityUpdates).build();
	}

	private static int ID() {
		++entityID;
		return entityID;
	}

	/**
	 * Sorts all type files into their proper arraylist
	 */
	public static void loadContentPacks(boolean reload) {
		ClassLoader classloader = (net.minecraft.server.MinecraftServer.class).getClassLoader();
		Method method = null;
		try {
			method = (java.net.URLClassLoader.class).getDeclaredMethod("addURL", java.net.URL.class);
			method.setAccessible(true);
		} catch (Exception e) {
			LOGGER.error("Failed to get class loader. All content loading will now fail.");
			e.printStackTrace();
		}

		List<File> contentPacks = PROXY.getContentList(method, classloader);
		getTypeFiles(contentPacks);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		for (BaseType baseType : baseTypes) {
			baseType.loadExtraValues();
			ContentTypes.values.get(baseType.id).typeAssignFunction.accept(baseType, reload);
		}


		if (DEV_ENV) {
			PROXY.generateJsonModels(baseTypes);
			// TODO: Fix content pack file reload
			if (reload)
				return;
			//PROXY.generateJsonSounds(gunTypes.values(), DEV_ENV);
			PROXY.generateLangFiles(baseTypes, DEV_ENV);

		}
	}

	/**
	 * Gets all type files from the content packs
	 *
	 * @param contentPacks
	 */
	private static void getTypeFiles(List<File> contentPacks) {
		Gson gson = new Gson();

		for (File file : contentPacks) {
			if (file.isDirectory()) {
				for (TypeEntry type : ContentTypes.values) {
					File subFolder = new File(file, "/" + type.name + "/");
					if (subFolder.exists()) {
						for (File typeFile : subFolder.listFiles()) {
							try {
								JsonReader jsonReader = new JsonReader(new FileReader(typeFile));
								BaseType parsedType = (BaseType) gson.fromJson(jsonReader, type.typeClass);
								parsedType.id = type.id;
								parsedType.contentPack = file.getName();
								baseTypes.add(parsedType);
							} catch (Exception exception) {
								exception.printStackTrace();
							}
						}
					}
				}
			} else {
				try {
					ZipFile zipFile = new ZipFile(file);
					ZipInputStream zipStream = new ZipInputStream(new FileInputStream(file));
					ZipEntry zipEntry;
					while ((zipEntry = zipStream.getNextEntry()) != null) {
						for (TypeEntry type : ContentTypes.values) {
							String zipName = zipEntry.getName();
							String typeName = type.toString();
							if (zipName.startsWith(typeName + "/") && zipName.split(typeName + "/").length > 1 && zipName.split(typeName + "/")[1].length() > 0) {
								InputStream stream = zipFile.getInputStream(zipEntry);
								JsonReader jsonReader = new JsonReader(new InputStreamReader(stream));
								BaseType parsedType = (BaseType) gson.fromJson(jsonReader, type.typeClass);
								parsedType.id = type.id;
								parsedType.contentPack = file.getName();
								baseTypes.add(parsedType);
							}
						}
					}
					zipFile.close();
					zipStream.close();
				} catch (Exception exception) {
					exception.printStackTrace();
				}
			}
		}
	}
}
