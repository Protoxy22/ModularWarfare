package com.modularwarfare.client.model.animations;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimation;
import com.modularwarfare.client.model.ModelGun;

import net.minecraft.util.math.MathHelper;

public class AnimationRifle4 extends WeaponAnimation {
	
	@Override
	public void onGunAnimation(float tiltProgress)
	{
		//Translate X - Forwards/Backwards
		GL11.glTranslatef(0.1F * tiltProgress, 0F, 0F);
		//Translate Y - Up/Down
		GL11.glTranslatef(0F, 0.2F * tiltProgress, 0F);
		//Translate Z - Left/Right
		GL11.glTranslatef(0F, 0F, -0.25F * tiltProgress);
		//Rotate X axis - Rolls Left/Right
		GL11.glRotatef(-60F * tiltProgress, 1F, 0F, 0F);
		//Rotate Y axis - Angle Left/Right
		GL11.glRotatef(-10F * tiltProgress, 0F, 1F, 0F);
		//Rotate Z axis - Angle Up/Down
		GL11.glRotatef(70F * tiltProgress, 0F, 0F, 1F);
	}
	
	@Override
	public void onAmmoAnimation(ModelGun gunModel, float clipPosition)
	{
		float ammoPosition = clipPosition * 1/*getNumBulletsInReload(animations, gripAttachment, type, item)*/;
		int bulletNum = MathHelper.floor(ammoPosition);
		float bulletProgress = ammoPosition - bulletNum;
		
		//Translate X - Forwards/Backwards
		GL11.glTranslatef(bulletProgress * -12.75F, 0F, 0F);
		//Translate Y - Up/Down
		GL11.glTranslatef(0F, bulletProgress * -5F, 0F);
		//Translate Z - Left/Right
		GL11.glTranslatef(0F, 0F, bulletProgress * -3F);
		//Rotate X axis - Rolls Left/Right
		GL11.glRotatef(0F * clipPosition, 1F, 0F, 0F);
		//Rotate Y axis - Angle Left/Right
		GL11.glRotatef(-50F * clipPosition, 0F, 1F, 0F);
		//Rotate Z axis - Angle Up/Down
		GL11.glRotatef(-150F * clipPosition, 0F, 0F, 1F);

	}

}
