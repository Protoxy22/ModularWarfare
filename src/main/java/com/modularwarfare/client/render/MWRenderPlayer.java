package com.modularwarfare.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EnumPlayerModelParts;

public class MWRenderPlayer extends RenderPlayer {
	
	public MWRenderPlayer(RenderManager renderManager) {
        super(renderManager);
    }

    public MWRenderPlayer(RenderManager renderManager, boolean useSmallArms) {
        super(renderManager, useSmallArms);
    }

    @Override
    public void doRender(AbstractClientPlayer abstractClientPlayer, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(abstractClientPlayer, x, y, z, entityYaw, partialTicks);
    }

}
