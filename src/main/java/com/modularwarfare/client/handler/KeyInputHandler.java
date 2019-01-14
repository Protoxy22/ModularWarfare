package com.modularwarfare.client.handler;

import java.util.ArrayList;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.input.KeyEntry;
import com.modularwarfare.client.input.KeyType;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.utility.event.ForgeEvent;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeyInputHandler extends ForgeEvent {

	private ArrayList<KeyEntry> keyBinds;
	
	public KeyInputHandler() 
	{
		keyBinds = new ArrayList<KeyEntry>();
		keyBinds.add(new KeyEntry(KeyType.GunReload));
		keyBinds.add(new KeyEntry(KeyType.ClientReload));
		keyBinds.add(new KeyEntry(KeyType.DebugMode));
		
		for(KeyEntry keyEntry : keyBinds)
		{
			ClientRegistry.registerKeyBinding(keyEntry.keyBinding);
		}
	}
	
	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event)
	{
		for(KeyEntry keyEntry : keyBinds)
		{
			if(keyEntry.keyBinding.isPressed())
			{
				handleKeyInput(keyEntry.keyType);
				break;
			}
		}
	}
	
	public void handleKeyInput(KeyType keyType)
	{
		switch(keyType)
		{
		// F9 Reloads Models /// SHIFT + F9 Reloads Textures & Icons
		case ClientReload:
			if(Minecraft.getMinecraft().player != null)
			{
				if(Minecraft.getMinecraft().player.isSneaking())
				{
					ModularWarfare.PROXY.reloadModels(true);
				} else
				{
					ModularWarfare.PROXY.reloadModels(false);
				}
			}
			break;
			
		case GunReload:
			if(Minecraft.getMinecraft().player != null)
			{
				EntityPlayerSP player = Minecraft.getMinecraft().player;
				if(player.getHeldItemMainhand() != null && player.getHeldItemMainhand().getItem() instanceof ItemGun)
				{
					// TODO: TRIGGER RELOAD
				}
			}
			break;
		case DebugMode:
			if(Minecraft.getMinecraft().player != null)
			{
				if(Minecraft.getMinecraft().player.isSneaking())
				{
					ModularWarfare.loadContentPacks(true);
					ModularWarfare.PROXY.reloadModels(true);
				}
			}
			break;
			
		default:
			ModularWarfare.LOGGER.warn("Default case called on handleKeyInput for " + keyType.toString());
			break;
		}
	}

}
