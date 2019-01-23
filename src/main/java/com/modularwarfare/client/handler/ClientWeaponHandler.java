package com.modularwarfare.client.handler;

import com.modularwarfare.api.WeaponFireEvent;
import com.modularwarfare.api.WeaponReloadEvent;
import com.modularwarfare.client.ClientRenderHooks;
import com.modularwarfare.utility.event.ForgeEvent;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientWeaponHandler extends ForgeEvent {
	
	@SubscribeEvent
	public void onWeaponFire(WeaponFireEvent.Post event)
	{
		ClientRenderHooks.getAnimations(event.getWeaponUser()).doShoot();
	}
	
	@SubscribeEvent
	public void onWeaponReload(WeaponReloadEvent.Post event)
	{
		
	}

}

