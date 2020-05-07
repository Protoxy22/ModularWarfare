package com.modularwarfare.client.model;

import com.modularwarfare.common.entity.EntityBot;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.util.ResourceLocation;

public class RenderBot extends RenderBiped<EntityBot> {

    private static final ResourceLocation ZOMBIE_TEXTURES = new ResourceLocation("textures/entity/zombie/zombie.png");

    public RenderBot(RenderManager manager) {
        super(manager, new ModelBot(), 1.0F);
        this.addLayer(new LayerBipedArmor(this));

    }

}
