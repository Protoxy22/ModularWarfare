package com.modularwarfare.client.handler;

import java.util.ArrayList;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.input.KeyEntry;
import com.modularwarfare.client.input.KeyType;
import com.modularwarfare.utility.event.ForgeEvent;
import com.modularwarfare.utility.event.SubscribeType;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;

public class KeyInputHandler extends ForgeEvent {

	private ArrayList<KeyEntry> keyBinds;
	
	public KeyInputHandler() 
	{
		super(SubscribeType.FML);
		
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
		case ClientReload:
			if(Minecraft.getMinecraft().thePlayer != null)
			{
				if(Minecraft.getMinecraft().thePlayer.isSneaking())
				{
					ModularWarfare.PROXY.reloadModels(true);
				} else
				{
					ModularWarfare.PROXY.reloadModels(false);
				}
			}
			break;
			
		case GunReload:
			System.out.println("Gun Reload");
			break;
			
		case DebugMode:
			System.out.println("debug mode");
			break;
			
		default:
			ModularWarfare.LOGGER.warn("Default case called on handleKeyInput for " + keyType.toString());
			break;
		}
	}

}
