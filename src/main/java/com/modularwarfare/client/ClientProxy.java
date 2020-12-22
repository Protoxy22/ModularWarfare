package com.modularwarfare.client;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.google.gsonapi.Gson;
import com.google.gsonapi.GsonBuilder;
import com.modularwarfare.ModConfig;
import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.anim.ReloadType;
import com.modularwarfare.client.export.ItemModelExport;
import com.modularwarfare.client.gui.GuiEvents;
import com.modularwarfare.client.gui.GuiPlayerExpanded;
import com.modularwarfare.client.handler.ClientTickHandler;
import com.modularwarfare.client.handler.ClientWeaponHandler;
import com.modularwarfare.client.handler.KeyInputHandler;
import com.modularwarfare.client.handler.RenderGuiHandler;
import com.modularwarfare.client.hands.HandsConfig;
import com.modularwarfare.client.model.*;
import com.modularwarfare.client.model.animations.*;
import com.modularwarfare.common.CommonProxy;
import com.modularwarfare.common.armor.ArmorType;
import com.modularwarfare.common.armor.ArmorType.ArmorInfo;
import com.modularwarfare.common.armor.ItemMWArmor;
import com.modularwarfare.common.armor.ItemSpecialArmor;
import com.modularwarfare.common.entity.EntityBot;
import com.modularwarfare.common.entity.decals.EntityBulletHole;
import com.modularwarfare.common.entity.decals.EntityShell;
import com.modularwarfare.common.guns.*;
import com.modularwarfare.common.particle.EntityBloodFX;
import com.modularwarfare.common.type.BaseType;
import com.modularwarfare.objects.SoundEntry;
import com.modularwarfare.utility.MWSound;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.FMLModContainer;
import net.minecraftforge.fml.common.MetadataCollection;
import net.minecraftforge.fml.common.discovery.ContainerType;
import net.minecraftforge.fml.common.discovery.ModCandidate;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.registries.IForgeRegistry;

public class ClientProxy extends CommonProxy {

	public List<File> contentPacks;
	public static String modelDir = "com.modularwarfare.client.model.";
	public static RenderGun gunRenderer;
	public static RenderAmmo ammoRenderer;
	public static RenderAttachment attachmentRenderer;
	public static HashMap<String, SoundEvent> modSounds = new HashMap<String, SoundEvent>();

	@Override
	public void preload() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@Override
	public void load() {
		new KeyInputHandler();
		new ClientRenderHooks();
		new ClientTickHandler();
		new ClientWeaponHandler();
		new RenderGuiHandler();

		WeaponAnimations.registerAnimation("rifle", new AnimationRifle());
		WeaponAnimations.registerAnimation("rifle2", new AnimationRifle2());
		WeaponAnimations.registerAnimation("rifle3", new AnimationRifle3());
		WeaponAnimations.registerAnimation("rifle4", new AnimationRifle4());
		WeaponAnimations.registerAnimation("pistol", new AnimationPistol());
		WeaponAnimations.registerAnimation("shotgun", new AnimationShotgun());
		WeaponAnimations.registerAnimation("sniper", new AnimationSniperBottom());
		WeaponAnimations.registerAnimation("sniper_top", new AnimationSniperTop());
		WeaponAnimations.registerAnimation("sideclip", new AnimationSideClip());
		WeaponAnimations.registerAnimation("toprifle", new AnimationTopRifle());
		RenderGun.rotateToolModel = new rotatetool();

		final RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
		for (final RenderPlayer rp : renderManager.getSkinMap().values()) {
			ClientEventHandler.setupLayers(rp);
		}
	}

	@SubscribeEvent
	public void onModelRegistry(ModelRegistryEvent event) {
		for (ItemGun itemGun : ModularWarfare.gunTypes.values()) {
			ModelLoader.setCustomModelResourceLocation(itemGun, 0, new ModelResourceLocation(ModularWarfare.MOD_ID + ":" + itemGun.type.internalName));
		}

		for (ItemAmmo itemAmmo : ModularWarfare.ammoTypes.values()) {
			ModelLoader.setCustomModelResourceLocation(itemAmmo, 0, new ModelResourceLocation(ModularWarfare.MOD_ID + ":" + itemAmmo.type.internalName));
		}

		for (ItemAttachment itemAttachment : ModularWarfare.attachmentTypes.values()) {
			ModelLoader.setCustomModelResourceLocation(itemAttachment, 0, new ModelResourceLocation(ModularWarfare.MOD_ID + ":" + itemAttachment.type.internalName));
		}

		for (ItemBullet itemBullet : ModularWarfare.bulletTypes.values()) {
			ModelLoader.setCustomModelResourceLocation(itemBullet, 0, new ModelResourceLocation(ModularWarfare.MOD_ID + ":" + itemBullet.type.internalName));
		}

		for (ItemMWArmor itemArmor : ModularWarfare.armorTypes.values()) {
			ModelLoader.setCustomModelResourceLocation(itemArmor, 0, new ModelResourceLocation(ModularWarfare.MOD_ID + ":" + itemArmor.internalName));
		}

		for (ItemSpecialArmor itemArmor : ModularWarfare.specialArmorTypes.values()) {
			ModelLoader.setCustomModelResourceLocation(itemArmor, 0, new ModelResourceLocation(ModularWarfare.MOD_ID + ":" + itemArmor.type.internalName));
		}
		for (ItemSpray itemSpray : ModularWarfare.sprayTypes.values()) {
			ModelLoader.setCustomModelResourceLocation(itemSpray, 0, new ModelResourceLocation(ModularWarfare.MOD_ID + ":" + itemSpray.type.internalName));
		}
	}

	@Override
	public void forceReload() {
		FMLClientHandler.instance().refreshResources();
	}

	@Override
	public List<File> getContentList(Method method, ClassLoader classloader) {
		contentPacks = new ArrayList<File>();
		for (File file : ModularWarfare.MOD_DIR.listFiles()) {
			if (file.isDirectory() || zipJar.matcher(file.getName()).matches()) {
				try {
					method.invoke(classloader, file.toURI().toURL());
					HashMap<String, Object> map = new HashMap<String, Object>();
					map.put("modid", ModularWarfare.MOD_ID);
					map.put("name", ModularWarfare.MOD_NAME + " : " + file.getName());
					map.put("version", "1");
					FMLModContainer container = new FMLModContainer("com.modularwarfare.ModularWarfare", new ModCandidate(file, file, file.isDirectory() ? ContainerType.DIR : ContainerType.JAR), map);
					container.bindMetadata(MetadataCollection.from(null, ""));
					FMLClientHandler.instance().addModAsResource(container);
				} catch (Exception e) {
					ModularWarfare.LOGGER.error("Failed to load assets for content pack : " + file.getName());
					e.printStackTrace();
				}
				ModularWarfare.LOGGER.info("Loaded content pack : " + file.getName());
				contentPacks.add(file);
			}
		}
		ModularWarfare.LOGGER.info(String.format("Loaded textures and models for %s content pack(s).", contentPacks.size()));
		return contentPacks;
	}

	/**
	 * Helper method that sorts out packages with model name input
	 * For example, the model class "com.modularwarfare.client.model.mw.ModelMP5"
	 * is referenced in the type file by the string "mw.MP5"
	 */
	private String getModelName(String in) {
		//Split about dots
		String[] split = in.split("\\.");
		//If there is no dot, our model class is in the default model package
		if (split.length == 1)
			return in;
			//Otherwise, we need to slightly rearrange the wording of the string for it to make sense
		else if (split.length > 1) {
			String out = split[split.length - 1];
			for (int i = split.length - 2; i >= 0; i--) {
				out = split[i] + "." + out;
			}
			return out;
		}
		return in;
	}

	/**
	 * Generic model loader method for getting model classes and casting them to the required class type
	 */
	@Override
	public <T> T loadModel(String s, String shortName, Class<T> typeClass) {
		if (s == null || shortName == null)
			return null;
		try {
			return typeClass.cast(Class.forName(modelDir + getModelName(s)).getConstructor().newInstance());
		} catch (Exception e) {
			ModularWarfare.LOGGER.error("Failed to load model : " + shortName + " (" + s + ")");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void reloadModels(boolean reloadSkins) {
		for (BaseType baseType : ModularWarfare.baseTypes) {
			if (baseType.hasModel()) {
				baseType.reloadModel();
			}
		}
		if (reloadSkins)
			forceReload();
	}

	@Override
	public Object getClientGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
		if (world instanceof WorldClient) {
			switch (ID) {
				case 0: {
					return new GuiPlayerExpanded(player);
				}
			}
		}
		return null;
	}

	@Override
	public void generateJsonModels(ArrayList<BaseType> types) {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		for (BaseType type : types) {
			if (type.contentPack == null)
				continue;

			File contentPackDir = new File(ModularWarfare.MOD_DIR, type.contentPack);
			if (contentPackDir.exists() && contentPackDir.isDirectory()) {
				File itemModelsDir = new File(contentPackDir, "/assets/modularwarfare/models/item");
				//File handsConfigDir = new File(contentPackDir, "/hands");

				if (!itemModelsDir.exists())
					itemModelsDir.mkdirs();

				//if (!handsConfigDir.exists())
				//	handsConfigDir.mkdirs();

				File typeModel = new File(itemModelsDir, type.internalName + ".json");
				//File typeHand = new File(handsConfigDir, type.internalName + ".json");

				if (ModularWarfare.DEV_ENV ? /*true*/ !typeModel.exists() : !typeModel.exists()) {
					if (type instanceof ArmorType) {
						ArmorType armorType = (ArmorType) type;
						for (ArmorInfo armorInfo : armorType.armorTypes.values()) {
							String internalName = armorInfo.internalName != null ? armorInfo.internalName : armorType.internalName;
							typeModel = new File(itemModelsDir, internalName + ".json");

							try {
								FileWriter fileWriter = new FileWriter(typeModel, false);
								gson.toJson(createJson(type, internalName), fileWriter);
								fileWriter.flush();
								fileWriter.close();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					} else {
						try {
							FileWriter fileWriter = new FileWriter(typeModel, false);
							gson.toJson(createJson(type), fileWriter);
							fileWriter.flush();
							fileWriter.close();

						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
				/*
				if (ModularWarfare.DEV_ENV && !typeHand.exists()) {
					if (type instanceof GunType) {
						try {
							FileWriter fileWriter = new FileWriter(typeHand, false);
							gson.toJson(new HandsConfig(), fileWriter);
							fileWriter.flush();
							fileWriter.close();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
				*/
			}
		}
	}

	@Override
	public void generateJsonSounds(Collection<ItemGun> types, boolean replace) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		HashMap<String, ArrayList<String>> cpSounds = new HashMap<String, ArrayList<String>>();

		for (ItemGun itemGun : types) {
			GunType type = itemGun.type;
			if (type.contentPack == null)
				continue;

			String contentPack = type.contentPack;

			if (!cpSounds.containsKey(contentPack))
				cpSounds.put(contentPack, new ArrayList<String>());

			for (WeaponSoundType weaponSoundType : type.weaponSoundMap.keySet()) {
				ArrayList<SoundEntry> soundEntries = type.weaponSoundMap.get(weaponSoundType);
				for (SoundEntry soundEntry : soundEntries) {
					if (soundEntry.soundName != null && !cpSounds.get(contentPack).contains(soundEntry.soundName))
						cpSounds.get(contentPack).add(soundEntry.soundName);

					if (soundEntry.soundNameDistant != null && !cpSounds.get(contentPack).contains(soundEntry.soundNameDistant))
						cpSounds.get(contentPack).add(soundEntry.soundNameDistant);
				}
			}
		}

		for (String contentPack : cpSounds.keySet()) {
			try {
				File contentPackDir = new File(ModularWarfare.MOD_DIR, contentPack);
				if (contentPackDir.exists() && contentPackDir.isDirectory()) {
					ArrayList<String> soundEntries = cpSounds.get(contentPack);
					if (soundEntries != null && !soundEntries.isEmpty()) {
						Path assetsDir = Paths.get(ModularWarfare.MOD_DIR.getAbsolutePath() + "/" + contentPack + "/assets/modularwarfare/");
						if (!Files.exists(assetsDir))
							Files.createDirectories(assetsDir);
						Path soundsFile = Paths.get(assetsDir + "/sounds.json");

						boolean soundsExists = Files.exists(soundsFile);
						boolean shouldCreate = soundsExists ? replace : true;
						if (shouldCreate) {
							if (!soundsExists)
								Files.createFile(soundsFile);

							ArrayList<String> jsonEntries = new ArrayList<String>();
							String format = "\"%s\":{\"category\": \"player\",\"subtitle\": \"MW Sound\",\"sounds\": [\"modularwarfare:%s\"]}";
							jsonEntries.add("{");
							for (int i = 0; i < soundEntries.size(); i++) {
								if (i + 1 < soundEntries.size()) {
									// add comma
									jsonEntries.add(format.replaceAll("%s", soundEntries.get(i)) + ",");
								} else {
									// no comma
									jsonEntries.add(format.replaceAll("%s", soundEntries.get(i)));
								}
							}
							jsonEntries.add("}");
							Files.write(soundsFile, jsonEntries, Charset.forName("UTF-8"));
						}
					}
				}
			} catch (Exception exception) {
				if (ModularWarfare.DEV_ENV) {
					exception.printStackTrace();
				} else {
					ModularWarfare.LOGGER.error(String.format("Failed to create sounds.json for content pack '%s'", contentPack));
				}
			}
		}
	}

	@Override
	public void generateLangFiles(ArrayList<BaseType> types, boolean replace) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		HashMap<String, ArrayList<BaseType>> langEntryMap = new HashMap<String, ArrayList<BaseType>>();

		for (BaseType baseType : types) {
			if (baseType.contentPack == null)
				continue;

			String contentPack = baseType.contentPack;

			if (!langEntryMap.containsKey(contentPack))
				langEntryMap.put(contentPack, new ArrayList<BaseType>());

			if (baseType.displayName != null && !langEntryMap.get(contentPack).contains(baseType))
				langEntryMap.get(contentPack).add(baseType);

			if (baseType instanceof ArmorType)
				langEntryMap.get(contentPack).add(baseType);
		}

		for (String contentPack : langEntryMap.keySet()) {
			try {
				File contentPackDir = new File(ModularWarfare.MOD_DIR, contentPack);
				if (contentPackDir.exists() && contentPackDir.isDirectory()) {
					ArrayList<BaseType> langEntries = langEntryMap.get(contentPack);
					if (langEntries != null && !langEntries.isEmpty()) {
						Path langDir = Paths.get(ModularWarfare.MOD_DIR.getAbsolutePath() + "/" + contentPack + "/assets/modularwarfare/lang/");
						if (!Files.exists(langDir))
							Files.createDirectories(langDir);
						Path langPath = Paths.get(langDir + "/en_US.lang");

						boolean soundsExists = Files.exists(langPath);
						boolean shouldCreate = soundsExists ? replace : true;
						if (shouldCreate) {
							if (!soundsExists)
								Files.createFile(langPath);

							ArrayList<String> jsonEntries = new ArrayList<String>();
							String format = "item.%s.name=%s";
							for (int i = 0; i < langEntries.size(); i++) {
								BaseType type = langEntries.get(i);
								if (type instanceof ArmorType) {
									ArmorType armorType = (ArmorType) type;
									for (ArmorInfo armorInfo : armorType.armorTypes.values()) {
										String internalName = armorInfo.internalName != null ? armorInfo.internalName : armorType.internalName;
										jsonEntries.add(String.format(format, internalName, armorInfo.displayName));
									}
								} else {
									jsonEntries.add(String.format(format, type.internalName, type.displayName));
								}
							}
							Files.write(langPath, jsonEntries, Charset.forName("UTF-8"));
						}
					}
				}
			} catch (Exception exception) {
				if (ModularWarfare.DEV_ENV) {
					exception.printStackTrace();
				} else {
					ModularWarfare.LOGGER.error(String.format("Failed to create sounds.json for content pack '%s'", contentPack));
				}
			}
		}
	}

	private ItemModelExport createJson(BaseType type) {
		ItemModelExport exportedModel = new ItemModelExport();
		exportedModel.setBaseLayer(type.getAssetDir() + "/" + (type.iconName != null ? type.iconName : type.internalName));
		return exportedModel;
	}

	private ItemModelExport createJson(BaseType type, String iconName) {
		ItemModelExport exportedModel = new ItemModelExport();
		exportedModel.setBaseLayer(type.getAssetDir() + "/" + iconName);
		return exportedModel;
	}

	@Override
	public void playSound(MWSound sound) {
		SoundEvent soundEvent = modSounds.get(sound.soundName);
		if (soundEvent == null) {
			ModularWarfare.LOGGER.error(String.format("The sound named '%s' does not exist. Skipping playSound", sound.soundName));
			return;
		}

		Minecraft.getMinecraft().world.playSound(Minecraft.getMinecraft().player, sound.blockPos, soundEvent, SoundCategory.PLAYERS, sound.volume, sound.pitch);
	}

	@Override
	public void registerSound(String soundName) {
		ResourceLocation resourceLocation = new ResourceLocation(ModularWarfare.MOD_ID, soundName);
		modSounds.put(soundName, new SoundEvent(resourceLocation).setRegistryName(resourceLocation));
	}

	@SubscribeEvent
	public void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		IForgeRegistry<SoundEvent> registry = event.getRegistry();
		for (SoundEvent soundEvent : modSounds.values()) {
			registry.register(soundEvent);
		}

		for (WeaponSoundType weaponSoundType : WeaponSoundType.values()) {
			if (weaponSoundType.defaultSound != null) {
				registerSound(weaponSoundType.defaultSound);
				registry.register(modSounds.get(weaponSoundType.defaultSound));
			}
		}
	}

	@SubscribeEvent
	public void registerEntities(RegistryEvent.Register<EntityEntry> event) {

		if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {

			//RENDER PLAYER BOT
			RenderingRegistry.registerEntityRenderingHandler(EntityBot.class, RenderBot::new);
			RenderingRegistry.registerEntityRenderingHandler(EntityBulletHole.class, RenderDecal.FACTORY);

			//RENDER SHELL EJECTION
			RenderingRegistry.registerEntityRenderingHandler(EntityShell.class, RenderShell.FACTORY);
		}

	}

	@Override
	public void onShootAnimation(EntityPlayer player, String wepType, int fireDelay, float recoilPitch, float recoilYaw) {
		GunType gunType = ModularWarfare.gunTypes.get(wepType).type;
		if (gunType != null) {
			ClientRenderHooks.getAnimMachine(player).triggerShoot((ModelGun) gunType.model, gunType, fireDelay);
			if (!ClientRenderHooks.isAiming) {
				ClientTickHandler.playerRecoilPitch += recoilPitch * new Random().nextFloat();
				ClientTickHandler.playerRecoilYaw += recoilYaw * new Random().nextFloat();
			} else {
				ClientTickHandler.playerRecoilPitch += recoilPitch *gunType.recoilAimReducer* new Random().nextFloat();
				ClientTickHandler.playerRecoilYaw += recoilYaw *gunType.recoilAimReducer* new Random().nextFloat();
			}
		}
	}

	@Override
	public void onReloadAnimation(EntityPlayer player, String wepType, int reloadTime, int reloadCount, int reloadType) {
		ItemGun gunType = ModularWarfare.gunTypes.get(wepType);
		if (gunType != null) {
			ClientRenderHooks.getAnimMachine(player).triggerReload(reloadTime, reloadCount, (ModelGun) gunType.type.model, ReloadType.getTypeFromInt(reloadType), player.isSprinting());
		}
	}

	@Override
	public World getClientWorld() {
		return FMLClientHandler.instance().getClient().world;
	}

	@Override
	public void registerEventHandlers() {
		super.registerEventHandlers();
		MinecraftForge.EVENT_BUS.register(new ClientEventHandler());
		MinecraftForge.EVENT_BUS.register(new GuiEvents());
	}


	@Override
	public void addBlood(final EntityLivingBase living, final int amount, final boolean onhit) {
		if (onhit) {
			this.addBlood(living, amount);
		}
	}

	@Override
	public void playHitmarker(boolean headshot) {
		if (ModConfig.INSTANCE.hitmarkerenabled) {
			Minecraft.getMinecraft().getSoundHandler().playSound(PositionedSoundRecord.getRecord(ClientProxy.modSounds.get("hitmarker"), 1f, 4f));
			ClientRenderHooks.AddHitMarker(headshot);
		}
	}

	@Override
	public void addBlood(final EntityLivingBase living, final int amount) {
		for (int k = 0; k < amount; ++k) {
			float attenuator = 0.3f;
			double mX = -MathHelper.sin(living.rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(living.rotationPitch / 180.0f * 3.1415927f) * attenuator;
			double mZ = MathHelper.cos(living.rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(living.rotationPitch / 180.0f * 3.1415927f) * attenuator;
			double mY = -MathHelper.sin(living.rotationPitch / 180.0f * 3.1415927f) * attenuator + 0.1f;
			attenuator = 0.02f;
			final float var5 = living.getRNG().nextFloat() * 3.1415927f * 2.0f;
			attenuator *= living.getRNG().nextFloat();
			mX += Math.cos(var5) * attenuator;
			mY += (living.getRNG().nextFloat() - living.getRNG().nextFloat()) * 0.1f;
			mZ += Math.sin(var5) * attenuator;
			final Particle blood = new EntityBloodFX(living.getEntityWorld(), living.posX, living.posY + 0.5 + living.getRNG().nextDouble() * 0.7, living.posZ, living.motionX * 2.0 + mX, living.motionY + mY, living.motionZ * 2.0 + mZ, 0.0);
			Minecraft.getMinecraft().effectRenderer.addEffect(blood);
		}
	}

	@Override
	public void resetSens() {
		ClientRenderHooks.isAimingScope = false;
		ClientRenderHooks.isAiming = false;
		Minecraft.getMinecraft().gameSettings.mouseSensitivity = ClientTickHandler.mouseSens;
		Minecraft.getMinecraft().gameSettings.mouseSensitivity = ClientTickHandler.prevFov;
	}

}
