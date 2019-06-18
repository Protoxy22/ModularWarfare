package com.modularwarfare.common.handler;

import com.modularwarfare.ModularWarfare;
import net.minecraft.entity.Entity;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandlerEntity {


	@SubscribeEvent
	public void onLivingHurt(final LivingAttackEvent event) {
		if (!event.getEntityLiving().world.isRemote)
			return;
		final Entity entity = event.getEntity();
		if (entity.getEntityWorld().isRemote) {
			ModularWarfare.PROXY.addBlood(event.getEntityLiving(), 10, true);
		}
	}

}
