package com.modularwarfare.client.model.animations;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimation;
import com.modularwarfare.client.anim.AnimStateMachine;
import com.modularwarfare.client.model.ModelGun;

import net.minecraft.util.math.MathHelper;

public class AnimationRifle2 extends WeaponAnimation {
	
	public AnimationRifle2()
	{
		ammoLoadOffset = new Vector3f(0, -0.5F, 0);
		tiltGunTime = 0.15F;
		unloadAmmoTime = 0.35F;
		loadAmmoTime = 0.35F;
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
		GL11.glTranslatef(0F, 0F, 0.0F * tiltProgress);
		//Rotate X axis - Rolls Left/Right
		GL11.glRotatef(10F * tiltProgress, 1F, 0F, 0F);
		//Rotate Y axis - Angle Left/Right
		GL11.glRotatef(-15F * tiltProgress, 0F, 1F, 0F);
		//Rotate Z axis - Angle Up/Down
		GL11.glRotatef(25F * tiltProgress, 0F, 0F, 1F);
	}
	
	@Override
	public void onAmmoAnimation(ModelGun gunModel, float ammoPosition, int reloadAmmoCount, AnimStateMachine animation)
	{
		float multiAmmoPosition = ammoPosition * 1/*getNumBulletsInReload(animations, gripAttachment, type, item)*/;
		int bulletNum = MathHelper.floor(ammoPosition);
		float bulletProgress = multiAmmoPosition - bulletNum;
		
		//System.out.println("bp" + bulletProgress);
		//System.out.println("cp" + ammoPosition);
		//Translate X - Forwards/Backwards
		GL11.glTranslatef(bulletProgress * -2.75F, 0F, 0F);
		//Translate Y - Up/Down
		GL11.glTranslatef(0F, bulletProgress * -2F, 0F);
		//Translate Z - Left/Right
		GL11.glTranslatef(0F, 0F, bulletProgress * 0F);
		//Rotate X axis - Rolls Left/Right
		GL11.glRotatef(30F * ammoPosition, 1F, 0F, 0F);
		//Rotate Y axis - Angle Left/Right
		GL11.glRotatef(0F * ammoPosition, 0F, 1F, 0F);
		//Rotate Z axis - Angle Up/Down
		GL11.glRotatef(-150F * ammoPosition, 0F, 0F, 1F);

	}

}
