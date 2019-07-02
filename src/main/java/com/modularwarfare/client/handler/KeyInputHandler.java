package com.modularwarfare.client.handler;

import java.util.ArrayList;

import com.modularwarfare.ModConfig;
import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.input.KeyEntry;
import com.modularwarfare.client.input.KeyType;
import com.modularwarfare.common.guns.ItemAmmo;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.common.network.*;
import com.modularwarfare.utility.event.ForgeEvent;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeyInputHandler extends ForgeEvent {

	private ArrayList<KeyEntry> keyBinds;

	public KeyInputHandler() {
		keyBinds = new ArrayList<KeyEntry>();
		keyBinds.add(new KeyEntry(KeyType.GunReload));
		keyBinds.add(new KeyEntry(KeyType.ClientReload));
		keyBinds.add(new KeyEntry(KeyType.FireMode));
		keyBinds.add(new KeyEntry(KeyType.GunUnload));
		keyBinds.add(new KeyEntry(KeyType.AddAttachment));
		keyBinds.add(new KeyEntry(KeyType.HitmarkerMode));

		if (ModularWarfare.DEV_ENV) {
			keyBinds.add(new KeyEntry(KeyType.DebugMode));
		}

		for (KeyEntry keyEntry : keyBinds) {
			ClientRegistry.registerKeyBinding(keyEntry.keyBinding);
		}
	}

	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		for (KeyEntry keyEntry : keyBinds) {
			if (keyEntry.keyBinding.isPressed()) {
				handleKeyInput(keyEntry.keyType);
				break;
			}
		}
	}

	public void handleKeyInput(KeyType keyType) {
		if (Minecraft.getMinecraft().player != null) {
			EntityPlayerSP entityPlayer = Minecraft.getMinecraft().player;

			switch (keyType) {
				// F9 Reloads Models /// SHIFT + F9 Reloads Textures & Icons
				case ClientReload:
					if (entityPlayer.isSneaking()) {
						ModularWarfare.PROXY.reloadModels(true);
					} else {
						ModularWarfare.PROXY.reloadModels(false);
					}
					break;

				case FireMode:
					if (entityPlayer.getHeldItemMainhand() != null && entityPlayer.getHeldItemMainhand().getItem() instanceof ItemGun) {
						ModularWarfare.NETWORK.sendToServer(new PacketGunSwitchMode());
					}
					break;

				case GunReload:
					ItemStack reloadStack = entityPlayer.getHeldItemMainhand();
					if (reloadStack != null && (reloadStack.getItem() instanceof ItemGun || reloadStack.getItem() instanceof ItemAmmo)) {
						ModularWarfare.NETWORK.sendToServer(new PacketGunReload());
					}
					break;

				case GunUnload:
					ItemStack unloadStack = entityPlayer.getHeldItemMainhand();
					if (unloadStack != null && (unloadStack.getItem() instanceof ItemGun || unloadStack.getItem() instanceof ItemAmmo)) {
						ModularWarfare.NETWORK.sendToServer(new PacketGunReload(true));
						ModularWarfare.NETWORK.sendToServer(new PacketGunUnloadAttachment());
					}
					break;

				case DebugMode:
					if (entityPlayer.isSneaking()) {
						ModularWarfare.loadContentPacks(true);
						ModularWarfare.PROXY.reloadModels(true);
					}
					break;

				case AddAttachment:
					if (entityPlayer.getHeldItemMainhand() != null && entityPlayer.getHeldItemMainhand().getItem() instanceof ItemGun) {
						ModularWarfare.NETWORK.sendToServer(new PacketGunAddAttachment());
					}
					break;
				case HitmarkerMode:
					ModConfig.INSTANCE.hitmarkerenabled = !ModConfig.INSTANCE.hitmarkerenabled;
					if (ModConfig.INSTANCE.hitmarkerenabled) {
						entityPlayer.sendMessage(new TextComponentString("Hitmarker enabled"));
					} else {
						entityPlayer.sendMessage(new TextComponentString("Hitmarker disabled"));
					}
					break;
				default:
					ModularWarfare.LOGGER.warn("Default case called on handleKeyInput for " + keyType.toString());
					break;
			}
		}
	}
}