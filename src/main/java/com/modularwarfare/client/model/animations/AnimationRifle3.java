package com.modularwarfare.client.model.animations;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimation;
import com.modularwarfare.client.model.ModelGun;

import net.minecraft.util.math.MathHelper;

public class AnimationRifle3 extends WeaponAnimation {
	
	@Override
	public void onGunAnimation(float reloadRotate, float adsSwitch)
	{
		//Translate X - Forwards/Backwards
		GL11.glTranslatef(0.0F * reloadRotate, 0F, 0F);
		//Translate Y - Up/Down
		GL11.glTranslatef(0F, 0.0F * reloadRotate + (-0.064F * adsSwitch * reloadRotate), 0F);
		//Translate Z - Left/Right
		GL11.glTranslatef(0F, 0F, 0.0F * reloadRotate + (0.35F * adsSwitch * reloadRotate));
		//Rotate X axis - Rolls Left/Right
		GL11.glRotatef(10F * reloadRotate, 1F, 0F, 0F);
		//Rotate Y axis - Angle Left/Right
		GL11.glRotatef(-15F * reloadRotate + (1F * adsSwitch), 0F, 1F, 0F);
		//Rotate Z axis - Angle Up/Down
		GL11.glRotatef(25F * reloadRotate + (1F * adsSwitch), 0F, 0F, 1F);

	}
	
	@Override
	public void onAmmoAnimation(ModelGun gunModel, float clipPosition, float reloadRotate)
	{
		float ammoPosition = clipPosition * 1/*getNumBulletsInReload(animations, gripAttachment, type, item)*/;
		int bulletNum = MathHelper.floor(ammoPosition);
		float bulletProgress = ammoPosition - bulletNum;
		
		//Translate X - Forwards/Backwards
		GL11.glTranslatef(bulletProgress * -2.75F, 0F, 0F);
		//Translate Y - Up/Down
		GL11.glTranslatef(0F, bulletProgress * -2F, 0F);
		//Translate Z - Left/Right
		GL11.glTranslatef(0F, 0F, bulletProgress * 0F);
		//Rotate X axis - Rolls Left/Right
		GL11.glRotatef(30F * clipPosition, 1F, 0F, 0F);
		//Rotate Y axis - Angle Left/Right
		GL11.glRotatef(0F * clipPosition, 0F, 1F, 0F);
		//Rotate Z axis - Angle Up/Down
		GL11.glRotatef(-150F * clipPosition, 0F, 0F, 1F);

	}

}
