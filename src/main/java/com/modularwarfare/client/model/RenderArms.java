package com.modularwarfare.client.model;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimation;
import com.modularwarfare.client.AnimStateMachine;
import com.modularwarfare.utility.NumberHelper;

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
	public static void renderArmPump(ModelGun model, AnimStateMachine anim, float smoothing, Vector3f reloadRot, Vector3f reloadPos)
	{
		GL11.glTranslatef(-(reloadPos.x - Math.abs(anim.lastPumped + (anim.pumped - anim.lastPumped) * smoothing) * (model.pumpHandleDistance * model.modelScale)), reloadPos.y, reloadPos.z);
		handleRotate(reloadRot);
	}
	
	// This moves the right hand if leftHandAmmo & handCharge are true (For left
	// hand reload with right hand charge)
	public static void renderArmCharge(ModelGun model, AnimStateMachine anim, float smoothing, Vector3f reloadRot, Vector3f reloadPos, Vector3f defaultRot, Vector3f defaultPos)
	{
		Vector3f offsetPosition = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadPos, defaultPos), anim.chargeTrigger);
		//GL11.glTranslatef((reloadPos.x + Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing) * (model.chargeHandleDistance * model.modelScale)), 0F, 0F);
		GL11.glTranslatef(defaultPos.x + offsetPosition.x + Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing) * (model.chargeHandleDistance * model.modelScale), 0F, 0F);
		GL11.glTranslatef(0F, defaultPos.y + offsetPosition.y, 0F);
		GL11.glTranslatef(0F, 0F, defaultPos.z + offsetPosition.z);
		
		//Rotation
		Vector3f offsetRotation = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadRot, defaultRot), anim.chargeTrigger);
		GL11.glRotatef(defaultRot.x + offsetRotation.x, 1F, 0F, 0F);
		GL11.glRotatef(defaultRot.y + offsetRotation.y, 0F, 1F, 0F);
		GL11.glRotatef(defaultRot.z + offsetRotation.z, 0F, 0F, 1F);
	}
	
	// This moves the right hand if leftHandAmmo & handBolt are true (For left hand
	// reload with right hand bolt action)
	public static void renderArmBolt(ModelGun model, AnimStateMachine anim, float smoothing, Vector3f reloadRot, Vector3f reloadPos)
	{
		GL11.glTranslatef(reloadPos.x + (Math.abs(anim.lastPumped + (anim.pumped - anim.lastPumped) * smoothing) * (model.chargeModifier.x * model.modelScale)), 0F, 0F);
		GL11.glTranslatef(0F, reloadPos.y + (Math.abs(anim.lastPumped + (anim.pumped - anim.lastPumped) * smoothing) * (model.chargeModifier.y * model.modelScale)), 0F);
		GL11.glTranslatef(0F, 0F, reloadPos.z + (Math.abs(anim.lastPumped + (anim.pumped - anim.lastPumped) * smoothing) * (model.chargeModifier.z * model.modelScale)));

		handleRotate(reloadRot);
	}
	
	public static void renderArmDefault(ModelGun model, AnimStateMachine anim, float smoothing, Vector3f reloadRot, Vector3f reloadPos, boolean firingHand)
	{
		GL11.glTranslatef(reloadPos.x - (firingHand ? RenderGun.triggerPullSwitch : 0f), reloadPos.y, reloadPos.z);
		handleRotate(reloadRot);
	}
	
	public static void renderArmReload(ModelGun model, AnimStateMachine anim, float smoothing, float tiltProgress, Vector3f reloadRot, Vector3f reloadPos, Vector3f defaultRot, Vector3f defaultPos)
	{
		//Translation
		Vector3f offsetPosition = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadPos, defaultPos), tiltProgress);
		GL11.glTranslatef(defaultPos.x + offsetPosition.x, defaultPos.y + offsetPosition.y, defaultPos.z + offsetPosition.z);
		
		//Rotation
		Vector3f offsetRotation = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadRot, defaultRot), tiltProgress);
		GL11.glRotatef(defaultRot.x + offsetRotation.x, 1F, 0F, 0F);
		GL11.glRotatef(defaultRot.y + offsetRotation.y, 0F, 1F, 0F);
		GL11.glRotatef(defaultRot.z + offsetRotation.z, 0F, 0F, 1F);
	}
	
	public static void renderArmLoad(ModelGun model, AnimStateMachine anim, WeaponAnimation animation, float smoothing, float tiltProgress, Vector3f reloadRot, Vector3f reloadPos, Vector3f defaultRot, Vector3f defaultPos)
	{
		//Translation
		Vector3f offsetPosition = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadPos, defaultPos), tiltProgress);
		Vector3f ammoLoadOffset = animation.ammoLoadOffset != null ? animation.ammoLoadOffset : new Vector3f(0f, 0f, 0f);
		GL11.glTranslatef(defaultPos.x + offsetPosition.x + (ammoLoadOffset.x * tiltProgress), 0F, 0F);
		GL11.glTranslatef(0F, defaultPos.y + offsetPosition.y + (ammoLoadOffset.y * tiltProgress), 0F);
		GL11.glTranslatef(0F, 0F, defaultPos.z + offsetPosition.z + (ammoLoadOffset.z * tiltProgress));
		//Rotation
		Vector3f offsetRotation = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadRot, defaultRot), tiltProgress);
		GL11.glRotatef(defaultRot.x + offsetRotation.x, 1F, 0F, 0F);
		GL11.glRotatef(defaultRot.y + offsetRotation.y, 0F, 1F, 0F);
		GL11.glRotatef(defaultRot.z + offsetRotation.z, 0F, 0F, 1F);
	}
	
	public static void renderArmUnload(ModelGun model, AnimStateMachine anim, WeaponAnimation animation, float smoothing, float tiltProgress, Vector3f reloadRot, Vector3f reloadPos, Vector3f defaultRot, Vector3f defaultPos)
	{
		//Translation
		Vector3f offsetPosition = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadPos, defaultPos), tiltProgress);
		Vector3f ammoLoadOffset = animation.ammoLoadOffset != null ? animation.ammoLoadOffset : new Vector3f(0f, 0f, 0f);
		GL11.glTranslatef(defaultPos.x + offsetPosition.x + (ammoLoadOffset.x * tiltProgress), 0F, 0F);
		GL11.glTranslatef(0F, defaultPos.y + offsetPosition.y + (ammoLoadOffset.y * tiltProgress), 0F);
		GL11.glTranslatef(0F, 0F, defaultPos.z + offsetPosition.z + (ammoLoadOffset.z * tiltProgress));
		System.out.println(animation.ammoLoadOffset);
		//Rotation
		Vector3f offsetRotation = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadRot, defaultRot), tiltProgress);
		GL11.glRotatef(defaultRot.x + offsetRotation.x, 1F, 0F, 0F);
		GL11.glRotatef(defaultRot.y + offsetRotation.y, 0F, 1F, 0F);
		GL11.glRotatef(defaultRot.z + offsetRotation.z, 0F, 0F, 1F);
	}
	
	private static void handleRotate(Vector3f reloadRot)
	{
		GL11.glRotatef(reloadRot.x, 1F, 0F, 0F);
		GL11.glRotatef(reloadRot.y, 0F, 1F, 0F);
		GL11.glRotatef(reloadRot.z, 0F, 0F, 1F);

	}

}
