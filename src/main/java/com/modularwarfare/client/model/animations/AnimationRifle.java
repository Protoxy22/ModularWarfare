package com.modularwarfare.client.model.animations;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimation;
import com.modularwarfare.client.model.ModelGun;

import net.minecraft.util.math.MathHelper;

public class AnimationRifle extends WeaponAnimation {
	
	@Override
	public void onGunAnimation(float reloadRotate)
	{
		GL11.glRotatef(30F * reloadRotate, 0F, 0F, 1F);
		GL11.glRotatef(-30F * reloadRotate * 1, 1F, 0F, 0F);
		GL11.glTranslatef(0.5F * reloadRotate, 0F, -0.5F * reloadRotate);
	}
	
	@Override
	public void onAmmoAnimation(ModelGun gunModel, float clipPosition, float reloadRotate)
	{
		float ammoPosition = clipPosition * 1/*getNumBulletsInReload(animations, gripAttachment, type, item)*/;
		int bulletNum = MathHelper.floor(ammoPosition);
		float bulletProgress = ammoPosition - bulletNum;

		GL11.glRotatef(bulletProgress * 15F, 0F, 1F, 0F);
		GL11.glRotatef(bulletProgress * 15F, 0F, 0F, 1F);
		GL11.glTranslatef(bulletProgress * -1F * 1 / gunModel.modelScale, 0F, bulletProgress * 0.5F * 1 / gunModel.modelScale);
	}

}
