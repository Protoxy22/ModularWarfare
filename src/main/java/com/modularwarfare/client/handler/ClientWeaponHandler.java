package com.modularwarfare.client.handler;

import java.util.Random;

import com.modularwarfare.api.WeaponFireEvent;
import com.modularwarfare.api.WeaponReloadEvent;
import com.modularwarfare.client.ClientRenderHooks;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.utility.event.ForgeEvent;

import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientWeaponHandler extends ForgeEvent {
	
	@SubscribeEvent(priority = EventPriority.LOWEST)
	public void onWeaponFire(WeaponFireEvent.Post event)
	{
		ClientRenderHooks.getAnimations(event.getWeaponUser()).triggerShoot((ModelGun) event.getWeaponItem().type.model);
		ClientTickHandler.playerRecoilPitch += 2 * new Random().nextFloat();
		ClientTickHandler.playerRecoilYaw += 2 * new Random().nextFloat();
	}
	
	@SubscribeEvent
	public void onWeaponReload(WeaponReloadEvent.Post event)
	{
		ClientRenderHooks.getAnimations(event.getWeaponUser()).triggerReload(event.getReloadTime(), (ModelGun) event.getWeaponItem().type.model, event.isLoadOnly(), event.isUnload());
	}

}

