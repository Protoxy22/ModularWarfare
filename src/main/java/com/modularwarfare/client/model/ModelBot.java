package com.modularwarfare.client.model;

import com.modularwarfare.client.model.omw.armor.uniform;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelBot extends ModelBiped {


    public ModelBot() {
        this(0.0F, false);
    }

    public ModelBot(float modelSize, boolean useSmallTexture) {
        super(modelSize, 0.0F, 64, useSmallTexture ? 32 : 64);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
    }
}
