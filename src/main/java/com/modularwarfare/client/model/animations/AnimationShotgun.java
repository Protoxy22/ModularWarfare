package com.modularwarfare.client.model.animations;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimation;
import com.modularwarfare.client.anim.AnimStateMachine;
import com.modularwarfare.client.model.ModelGun;

import net.minecraft.util.math.MathHelper;

public class AnimationShotgun extends WeaponAnimation {
	
	public AnimationShotgun()
	{
		ammoLoadOffset = new Vector3f(0, -0.5F, 0);
		tiltGunTime = 0.15F;
		unloadAmmoTime = 0F;
		loadAmmoTime = 0.70F;
		untiltGunTime = 0.15F;
	}
	
	@Override
	public void onGunAnimation(float tiltProgress, AnimStateMachine animation)
	{
		//Translate X - Forwards/Backwards
		GL11.glTranslatef(0.0F * tiltProgress, 0F, 0F);
		//Translate Y - Up/Down
		GL11.glTranslatef(0F, 0.0F * tiltProgress, 0F);
		//Translate Z - Left/Right
		GL11.glTranslatef(0F, 0F, -0.2F * tiltProgress);
		//Rotate X axis - Rolls Left/Right
		GL11.glRotatef(10F * tiltProgress, 1F, 0F, 0F);
		//Rotate Y axis - Angle Left/Right
		GL11.glRotatef(-10F * tiltProgress, 0F, 1F, 0F);
		//Rotate Z axis - Angle Up/Down
		GL11.glRotatef(15F * tiltProgress, 0F, 0F, 1F);
	}
	
	@Override
	public void onAmmoAnimation(ModelGun gunModel, float ammoPosition, int reloadAmmoCount, AnimStateMachine animation)
	{
		float multiAmmoPosition = ammoPosition * reloadAmmoCount;
		int bulletNum = MathHelper.floor(multiAmmoPosition);
		float bulletProgress = multiAmmoPosition - bulletNum;

		
		//Translate X - Forwards/Backwards
		GL11.glTranslatef(bulletProgress * (-2F /16F) / gunModel.modelScale, 0F, 0F);
		//Translate Y - Up/Down
		GL11.glTranslatef(0F, bulletProgress * (-8F /16F) / gunModel.modelScale, 0F);
		//Translate Z - Left/Right
		GL11.glTranslatef(0F, 0F, bulletProgress * (-1F /16F) / gunModel.modelScale);
		//Rotate X axis - Rolls Left/Right
		GL11.glRotatef(1F * bulletProgress, 1F, 0F, 0F);
		//Rotate Y axis - Angle Left/Right
		GL11.glRotatef(1F * bulletProgress, 0F, 1F, 0F);
		//Rotate Z axis - Angle Up/Down
		GL11.glRotatef(20F * bulletProgress, 0F, 0F, 1F);
	}

}
