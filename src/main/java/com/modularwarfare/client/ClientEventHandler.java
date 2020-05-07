package com.modularwarfare.client;

import com.modularwarfare.client.layers.MWLayerArm;
import com.modularwarfare.client.layers.MWLayerBody;
import com.modularwarfare.client.layers.MWLayerHead;
import com.modularwarfare.client.layers.MWLayerLeg;
import com.modularwarfare.client.model.InstantBulletRenderer;
import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.model.ModelGun;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

public class ClientEventHandler {

	@SubscribeEvent
	public void renderWorld(RenderWorldLastEvent event) {
		InstantBulletRenderer.RenderAllTrails(event.getPartialTicks());
	}


	public static void setupLayers(final RenderPlayer rp) {
		rp.addLayer(new MWLayerBody(rp, rp.getMainModel().bipedBodyWear));
		rp.addLayer(new MWLayerArm(rp, rp.getMainModel().bipedLeftArm, ModelGun.EnumArm.Left));
		rp.addLayer(new MWLayerArm(rp, rp.getMainModel().bipedRightArm, ModelGun.EnumArm.Right));
		rp.addLayer(new MWLayerLeg(rp, rp.getMainModel().bipedLeftLeg, ModelArmor.EnumLeg.Left));
		rp.addLayer(new MWLayerLeg(rp, rp.getMainModel().bipedRightLeg, ModelArmor.EnumLeg.Right));
		rp.addLayer(new MWLayerHead(rp, rp.getMainModel().bipedHead));
	}


}

