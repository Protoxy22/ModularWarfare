package com.modularwarfare.client.model.animations;

import java.util.Optional;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimation;
import com.modularwarfare.client.anim.AnimStateMachine;
import com.modularwarfare.client.anim.StateEntry;
import com.modularwarfare.client.anim.StateType;
import com.modularwarfare.client.model.ModelGun;

import net.minecraft.util.math.MathHelper;

public class AnimationRifle extends WeaponAnimation {
	
	public AnimationRifle()
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
		//System.out.println(tiltProgress);
		
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
	public void onAmmoAnimation(ModelGun gunModel, float ammoProgress, int reloadAmmoCount, AnimStateMachine animation)
	{
		//System.out.println(ammoProgress);
		float multiAmmoPosition = ammoProgress * 1;
		int bulletNum = MathHelper.floor(multiAmmoPosition);
		float bulletProgress = multiAmmoPosition - bulletNum;
		
		System.out.println(bulletNum);
		
		//System.out.println(bulletProgress);
		//Translate X - Forwards/Backwards
		GL11.glTranslatef(ammoProgress * -0.75F, 0F, 0F);
		//Translate Y - Up/Down
		GL11.glTranslatef(0F, ammoProgress * -8F, 0F);
		//Translate Z - Left/Right
		GL11.glTranslatef(0F, 0F, ammoProgress * 0F);
		//Rotate X axis - Rolls Left/Right
		GL11.glRotatef(30F * ammoProgress, 1F, 0F, 0F);
		//Rotate Y axis - Angle Left/Right
		GL11.glRotatef(0F * ammoProgress, 0F, 1F, 0F);
		//Rotate Z axis - Angle Up/Down
		GL11.glRotatef(-90F * ammoProgress, 0F, 0F, 1F);
	}

}
