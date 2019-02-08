package com.modularwarfare.client.model.animations;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimation;
import com.modularwarfare.client.anim.AnimStateMachine;
import com.modularwarfare.client.model.ModelGun;

import net.minecraft.util.math.MathHelper;

public class AnimationRifle4 extends WeaponAnimation {
	
	public AnimationRifle4()
	{
		ammoLoadOffset = new Vector3f(-2, 0, 0);
		tiltGunTime = 0.15F;
		unloadAmmoTime = 0.35F;
		loadAmmoTime = 0.35F;
		untiltGunTime = 0.15F;
	}
	
	@Override
	public void onGunAnimation(float tiltProgress, AnimStateMachine animation)
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
	public void onAmmoAnimation(ModelGun gunModel, float ammoPosition, int reloadAmmoCount, AnimStateMachine animation)
	{
		float multiAmmoPosition = ammoPosition * 1/*getNumBulletsInReload(animations, gripAttachment, type, item)*/;
		int bulletNum = MathHelper.floor(ammoPosition);
		float bulletProgress = multiAmmoPosition - bulletNum;
		
		//Translate X - Forwards/Backwards
		GL11.glTranslatef(bulletProgress * -12.75F, 0F, 0F);
		//Translate Y - Up/Down
		GL11.glTranslatef(0F, bulletProgress * -5F, 0F);
		//Translate Z - Left/Right
		GL11.glTranslatef(0F, 0F, bulletProgress * -3F);
		//Rotate X axis - Rolls Left/Right
		GL11.glRotatef(0F * ammoPosition, 1F, 0F, 0F);
		//Rotate Y axis - Angle Left/Right
		GL11.glRotatef(-50F * ammoPosition, 0F, 1F, 0F);
		//Rotate Z axis - Angle Up/Down
		GL11.glRotatef(-150F * ammoPosition, 0F, 0F, 1F);

	}

}
