package com.modularwarfare.client.model;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

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
		GL11.glTranslatef(-(reloadPos.x
				- Math.abs(anim.lastPumped + (anim.pumped - anim.lastPumped) * smoothing) / model.pumpModifier),
				reloadPos.y, reloadPos.z);
		handleRotate(reloadRot);
	}
	
	// This moves the right hand if leftHandAmmo & handCharge are true (For left
	// hand reload with right hand charge)
	public static void renderArmCharge(ModelGun model, AnimStateMachine anim, float smoothing, Vector3f reloadRot, Vector3f reloadPos)
	{
		GL11.glTranslatef(
				-(reloadPos.x
						- Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing)
								/ model.chargeModifier.x),
				(-(reloadPos.y
						- Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing)
								/ model.chargeModifier.y)),
				(-(reloadPos.z
						- Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing)
								/ model.chargeModifier.z)));
		handleRotate(reloadRot);
	}
	
	// This moves the right hand if leftHandAmmo & handBolt are true (For left hand
	// reload with right hand bolt action)
	public static void renderArmBolt(ModelGun model, AnimStateMachine anim, float smoothing, Vector3f reloadRot, Vector3f reloadPos)
	{
		GL11.glTranslatef(
				(reloadPos.x + Math.abs(anim.lastPumped + (anim.pumped - anim.lastPumped) * smoothing)
						/ model.chargeModifier.x),
				((reloadPos.y
						+ Math.abs(anim.lastPumped + (anim.pumped - anim.lastPumped) * smoothing)
								/ model.chargeModifier.y)),
				(-(reloadPos.z
						- Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing)
								/ model.chargeModifier.z)));
		handleRotate(reloadRot);
	}
	
	public static void renderArmDefault(ModelGun model, AnimStateMachine anim, float smoothing, Vector3f reloadRot, Vector3f reloadPos)
	{
		GL11.glTranslatef(reloadPos.x, reloadPos.y, reloadPos.z);
		handleRotate(reloadRot);
	}
	
	public static void renderArmReload(ModelGun model, AnimStateMachine anim, float smoothing, float tiltProgress, Vector3f reloadRot, Vector3f reloadPos, Vector3f defaultRot, Vector3f defaultPos)
	{
		Vector3f offsetVector = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadPos, defaultPos), tiltProgress);
		GL11.glTranslatef(defaultPos.x + offsetVector.x, defaultPos.y + offsetVector.y, defaultPos.z + offsetVector.z);
		
		handleRotate(reloadRot);
	}
	
	private static void handleRotate(Vector3f reloadRot)
	{
		GL11.glRotatef(reloadRot.y, 0F, 1F, 0F);
		GL11.glRotatef(reloadRot.z, 0F, 0F, 1F);
		GL11.glRotatef(reloadRot.x, 1F, 0F, 0F);
	}

}
