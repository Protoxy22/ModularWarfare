package com.modularwarfare.client.model;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

public class RenderArms {
	
	/*
	 * GL Calls are run from the bottom up
	 * For ease of use the following order should be followed at all times;
	 * glScale
	 * glTranslate
	 * glRotate
	 * This will allow for translations without having to account for rotation
	 */
	
	// right hand pump action animation
	/*public static void renderArmPump(ModelGun model, GunAnimations anim, float smoothing, Vector3f rotationPoint, Vector3f armPosition)
	{
		GL11.glTranslatef(-(armPosition.x
				- Math.abs(anim.lastPumped + (anim.pumped - anim.lastPumped) * smoothing) / model.pumpModifier),
				armPosition.y, armPosition.z);
		handleRotate(rotationPoint);
	}
	
	// This moves the right hand if leftHandAmmo & handCharge are true (For left
	// hand reload with right hand charge)
	public static void renderArmCharge(ModelGun model, GunAnimations anim, float smoothing, Vector3f rotationPoint, Vector3f armPosition)
	{
		GL11.glTranslatef(
				-(armPosition.x
						- Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing)
								/ model.chargeModifier.x),
				(-(armPosition.y
						- Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing)
								/ model.chargeModifier.y)),
				(-(armPosition.z
						- Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing)
								/ model.chargeModifier.z)));
		handleRotate(rotationPoint);
	}
	
	// This moves the right hand if leftHandAmmo & handBolt are true (For left hand
	// reload with right hand bolt action)
	public static void renderArmBolt(ModelGun model, GunAnimations anim, float smoothing, Vector3f rotationPoint, Vector3f armPosition)
	{
		GL11.glTranslatef(
				(armPosition.x + Math.abs(anim.lastPumped + (anim.pumped - anim.lastPumped) * smoothing)
						/ model.chargeModifier.x),
				((armPosition.y
						+ Math.abs(anim.lastPumped + (anim.pumped - anim.lastPumped) * smoothing)
								/ model.chargeModifier.y)),
				(-(armPosition.z
						- Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing)
								/ model.chargeModifier.z)));
		handleRotate(rotationPoint);
	}
	
	public static void renderArmDefault(ModelGun model, GunAnimations anim, float smoothing, Vector3f rotationPoint, Vector3f armPosition)
	{
		GL11.glTranslatef(armPosition.x, armPosition.y, armPosition.z);
		handleRotate(rotationPoint);
	}
	
	public static void renderArmReload(ModelGun model, GunAnimations anim, float smoothing, Vector3f rotationPoint, Vector3f armPosition)
	{
		GL11.glTranslatef(armPosition.x, armPosition.y, armPosition.z);
		handleRotate(rotationPoint);
	}
	
	private static void handleRotate(Vector3f rotationPoint)
	{
		GL11.glRotatef(rotationPoint.y, 0F, 1F, 0F);
		GL11.glRotatef(rotationPoint.z, 0F, 0F, 1F);
		GL11.glRotatef(rotationPoint.x, 1F, 0F, 0F);
	}*/

}
