package com.modularwarfare.client;

import com.modularwarfare.client.model.InstantBulletRenderer;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientEventHandler {


	@SubscribeEvent
	public void renderWorld(RenderWorldLastEvent event) {
		InstantBulletRenderer.RenderAllTrails(event.getPartialTicks());
	}

}

