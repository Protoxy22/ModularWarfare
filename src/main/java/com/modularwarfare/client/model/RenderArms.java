package com.modularwarfare.client.model;

import java.util.Optional;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimation;
import com.modularwarfare.client.anim.AnimStateMachine;
import com.modularwarfare.client.anim.ReloadType;
import com.modularwarfare.client.anim.StateEntry;
import com.modularwarfare.client.anim.StateType;
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
	public static void renderArmPump(ModelGun model, AnimStateMachine anim, float smoothing, Vector3f reloadRot, Vector3f reloadPos, boolean leftHand)
	{
		Optional<StateEntry> currentShootState = anim.getShootState();
		float pumpCurrent = currentShootState.isPresent() ? (currentShootState.get().stateType == StateType.PumpOut || currentShootState.get().stateType == StateType.PumpIn) ? currentShootState.get().currentValue : 1f : 1f;
		float pumpLast = currentShootState.isPresent() ? (currentShootState.get().stateType == StateType.PumpOut || currentShootState.get().stateType == StateType.PumpIn) ? currentShootState.get().lastValue : 1f : 1f;
		
		GL11.glTranslatef((reloadPos.x + Math.abs(pumpLast + (pumpCurrent - pumpLast) * smoothing) * (model.pumpHandleDistance * model.modelScale)), reloadPos.y, reloadPos.z);
		if(leftHand)
			handleRotateLeft(reloadRot);
		else
			handleRotateRight(reloadRot);
	}
	
	// This moves the right hand if leftHandAmmo & handCharge are true (For left
	// hand reload with right hand charge)
	public static void renderArmCharge(ModelGun model, AnimStateMachine anim, float smoothing, Vector3f reloadRot, Vector3f reloadPos, Vector3f defaultRot, Vector3f defaultPos, boolean leftHand)
	{
		Vector3f offsetPosition = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadPos, defaultPos), 1f);
		Optional<StateEntry> currentReloadState = anim.getReloadState();
		float chargeCurrent = currentReloadState.isPresent() ? (currentReloadState.get().stateType == StateType.Charge || currentReloadState.get().stateType == StateType.Uncharge) ? currentReloadState.get().currentValue : 1f : 1f;
		float chargeLast = currentReloadState.isPresent() ? (currentReloadState.get().stateType == StateType.Charge || currentReloadState.get().stateType == StateType.Uncharge) ? currentReloadState.get().lastValue : 1f : 1f;
		
		//GL11.glTranslatef((reloadPos.x + Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing) * (model.chargeHandleDistance * model.modelScale)), 0F, 0F);
		GL11.glTranslatef(defaultPos.x + offsetPosition.x + Math.abs(chargeLast + (chargeCurrent - chargeLast) * smoothing) * (model.chargeHandleDistance * model.modelScale), 0F, 0F);
		
		GL11.glTranslatef(0F, defaultPos.y + offsetPosition.y, 0F);
		GL11.glTranslatef(0F, 0F, defaultPos.z + offsetPosition.z);
		
		//Rotation
		Vector3f offsetRotation = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadRot, defaultRot), 1f);
		if(leftHand) {
			GL11.glTranslatef(0.225F, 0.75F, 0);
			GL11.glRotatef(defaultRot.x + offsetRotation.x, 1F, 0F, 0F);
			GL11.glRotatef(defaultRot.y + offsetRotation.y, 0F, 1F, 0F);
			GL11.glRotatef(defaultRot.z + offsetRotation.z, 0F, 0F, 1F);
			GL11.glTranslatef(-0.225F, -0.75F, 0);
		}
		else {
			GL11.glTranslatef(-0.225F, 0.75F, 0);
			GL11.glRotatef(defaultRot.x + offsetRotation.x, 1F, 0F, 0F);
			GL11.glRotatef(defaultRot.y + offsetRotation.y, 0F, 1F, 0F);
			GL11.glRotatef(defaultRot.z + offsetRotation.z, 0F, 0F, 1F);
			GL11.glTranslatef(0.225F, -0.75F, 0);
		}
	}
	
	// This moves the right hand if leftHandAmmo & handBolt are true (For left hand
	// reload with right hand bolt action)
	public static void renderArmBolt(ModelGun model, AnimStateMachine anim, float smoothing, Vector3f reloadRot, Vector3f reloadPos, boolean leftHand)
	{
		Optional<StateEntry> currentShootState = anim.getShootState();
		float pumpCurrent = currentShootState.isPresent() ? (currentShootState.get().stateType == StateType.PumpOut || currentShootState.get().stateType == StateType.PumpIn) ? currentShootState.get().currentValue : 1f : 1f;
		float pumpLast = currentShootState.isPresent() ? (currentShootState.get().stateType == StateType.PumpOut || currentShootState.get().stateType == StateType.PumpIn) ? currentShootState.get().lastValue : 1f : 1f;
		
		GL11.glTranslatef(reloadPos.x + (Math.abs(pumpLast + (pumpCurrent - pumpLast) * smoothing) * (model.chargeModifier.x * model.modelScale)), 0F, 0F);
		GL11.glTranslatef(0F, reloadPos.y + (Math.abs(pumpLast + (pumpCurrent - pumpLast) * smoothing) * (model.chargeModifier.y * model.modelScale)), 0F);
		GL11.glTranslatef(0F, 0F, reloadPos.z + (Math.abs(pumpLast + (pumpCurrent - pumpLast) * smoothing) * (model.chargeModifier.z * model.modelScale)));
		if(leftHand)
			handleRotateLeft(reloadRot);
		else
			handleRotateRight(reloadRot);
	}
	
	public static void renderArmDefault(ModelGun model, AnimStateMachine anim, float smoothing, Vector3f reloadRot, Vector3f reloadPos, boolean firingHand, boolean leftHand)
	{
		GL11.glTranslatef(reloadPos.x - (firingHand ? RenderGun.triggerPullSwitch : 0f), reloadPos.y, reloadPos.z);
		if(leftHand)
			handleRotateLeft(reloadRot);
		else
			handleRotateRight(reloadRot);
	}
	
	public static void renderArmReload(ModelGun model, AnimStateMachine anim, WeaponAnimation animation, float smoothing, float tiltProgress, Vector3f reloadRot, Vector3f reloadPos, Vector3f defaultRot, Vector3f defaultPos, boolean leftHand)
	{
		//Translation
		Vector3f offsetPosition = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadPos, defaultPos), tiltProgress);
		Optional<StateEntry> currentState = anim.getReloadState();
		Vector3f ammoLoadOffset = anim.isReloadType(ReloadType.Load) && currentState.isPresent() && currentState.get().stateType != StateType.Load && currentState.get().stateType != StateType.Untilt ? animation.ammoLoadOffset != null ? animation.ammoLoadOffset : new Vector3f(0f, 0f, 0f) : new Vector3f(0f, 0f, 0f);
		//System.out.println(tiltProgress);
		//System.out.println(anim.isLoadOnly());
		GL11.glTranslatef(defaultPos.x + offsetPosition.x + (ammoLoadOffset.x * tiltProgress), 0F, 0F);
		GL11.glTranslatef(0F, defaultPos.y + offsetPosition.y + (ammoLoadOffset.y * tiltProgress), 0F);
		GL11.glTranslatef(0F, 0F, defaultPos.z + offsetPosition.z + (ammoLoadOffset.z * tiltProgress));
		//Rotation
		Vector3f offsetRotation = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadRot, defaultRot), tiltProgress);
		if(leftHand) {
			GL11.glTranslatef(0.225F, 0.75F, 0);
			GL11.glRotatef(defaultRot.x + offsetRotation.x, 1F, 0F, 0F);
			GL11.glRotatef(defaultRot.y + offsetRotation.y, 0F, 1F, 0F);
			GL11.glRotatef(defaultRot.z + offsetRotation.z, 0F, 0F, 1F);
			GL11.glTranslatef(-0.225F, -0.75F, 0);
		}
		else {
			GL11.glTranslatef(-0.225F, 0.75F, 0);
			GL11.glRotatef(defaultRot.x + offsetRotation.x, 1F, 0F, 0F);
			GL11.glRotatef(defaultRot.y + offsetRotation.y, 0F, 1F, 0F);
			GL11.glRotatef(defaultRot.z + offsetRotation.z, 0F, 0F, 1F);
			GL11.glTranslatef(0.225F, -0.75F, 0);
		}
	}
	
	public static void renderStaticArmReload(ModelGun model, AnimStateMachine anim, float smoothing, float tiltProgress, Vector3f reloadRot, Vector3f reloadPos, Vector3f defaultRot, Vector3f defaultPos, boolean leftHand)
	{
		//Translation
		Vector3f offsetPosition = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadPos, defaultPos), tiltProgress);
		GL11.glTranslatef(defaultPos.x + offsetPosition.x, defaultPos.y + offsetPosition.y, defaultPos.z + offsetPosition.z);
		
		//Rotation
		Vector3f offsetRotation = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadRot, defaultRot), tiltProgress);
		if(leftHand) {
			GL11.glTranslatef(0.225F, 0.75F, 0);
			GL11.glRotatef(defaultRot.x + offsetRotation.x, 1F, 0F, 0F);
			GL11.glRotatef(defaultRot.y + offsetRotation.y, 0F, 1F, 0F);
			GL11.glRotatef(defaultRot.z + offsetRotation.z, 0F, 0F, 1F);
			GL11.glTranslatef(-0.225F, -0.75F, 0);
		}
		else {
			GL11.glTranslatef(-0.225F, 0.75F, 0);
			GL11.glRotatef(defaultRot.x + offsetRotation.x, 1F, 0F, 0F);
			GL11.glRotatef(defaultRot.y + offsetRotation.y, 0F, 1F, 0F);
			GL11.glRotatef(defaultRot.z + offsetRotation.z, 0F, 0F, 1F);
			GL11.glTranslatef(0.225F, -0.75F, 0);
		}
		
	}
	
	public static void renderArmLoad(ModelGun model, AnimStateMachine anim, WeaponAnimation animation, float smoothing, float tiltProgress, Vector3f reloadRot, Vector3f reloadPos, Vector3f defaultRot, Vector3f defaultPos, boolean leftHand)
	{
		//Translation
		Vector3f offsetPosition = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadPos, defaultPos), tiltProgress);
		Optional<StateEntry> currentState = anim.getReloadState();
		Vector3f ammoLoadOffset = anim.isReloadType(ReloadType.Load) && currentState .isPresent() && currentState.get().stateType != StateType.Load ? animation.ammoLoadOffset != null ? animation.ammoLoadOffset : new Vector3f(0f, 0f, 0f) : new Vector3f(0f, 0f, 0f);
		//System.out.println(ammoLoadOffset);
		//System.out.println(anim.isLoadOnly());
		GL11.glTranslatef(defaultPos.x + offsetPosition.x + (ammoLoadOffset.x * tiltProgress), 0F, 0F);
		GL11.glTranslatef(0F, defaultPos.y + offsetPosition.y + (ammoLoadOffset.y * tiltProgress), 0F);
		GL11.glTranslatef(0F, 0F, defaultPos.z + offsetPosition.z + (ammoLoadOffset.z * tiltProgress));
		//Rotation
		Vector3f offsetRotation = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadRot, defaultRot), tiltProgress);
		if(leftHand) {
			GL11.glTranslatef(0.225F, 0.75F, 0);
			GL11.glRotatef(defaultRot.x + offsetRotation.x, 1F, 0F, 0F);
			GL11.glRotatef(defaultRot.y + offsetRotation.y, 0F, 1F, 0F);
			GL11.glRotatef(defaultRot.z + offsetRotation.z, 0F, 0F, 1F);
			GL11.glTranslatef(-0.225F, -0.75F, 0);
		}
		else {
			GL11.glTranslatef(-0.225F, 0.75F, 0);
			GL11.glRotatef(defaultRot.x + offsetRotation.x, 1F, 0F, 0F);
			GL11.glRotatef(defaultRot.y + offsetRotation.y, 0F, 1F, 0F);
			GL11.glRotatef(defaultRot.z + offsetRotation.z, 0F, 0F, 1F);
			GL11.glTranslatef(0.225F, -0.75F, 0);
		}
	}
	
	public static void renderArmUnload(ModelGun model, AnimStateMachine anim, WeaponAnimation animation, float smoothing, float tiltProgress, Vector3f reloadRot, Vector3f reloadPos, Vector3f defaultRot, Vector3f defaultPos, boolean leftHand)
	{
		//Translation
		Vector3f offsetPosition = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadPos, defaultPos), tiltProgress);
		Vector3f ammoLoadOffset = anim.isReloadType(ReloadType.Load) ? animation.ammoLoadOffset != null ? animation.ammoLoadOffset : new Vector3f(0f, 0f, 0f) : new Vector3f(0f, 0f, 0f);
		GL11.glTranslatef(defaultPos.x + offsetPosition.x + (ammoLoadOffset.x * tiltProgress), 0F, 0F);
		GL11.glTranslatef(0F, defaultPos.y + offsetPosition.y + (ammoLoadOffset.y * tiltProgress), 0F);
		GL11.glTranslatef(0F, 0F, defaultPos.z + offsetPosition.z + (ammoLoadOffset.z * tiltProgress));
		//Rotation
		Vector3f offsetRotation = NumberHelper.multiplyVector(NumberHelper.subtractVector(reloadRot, defaultRot), tiltProgress);
		if(leftHand) {
			GL11.glTranslatef(0.225F, 0.75F, 0);
			GL11.glRotatef(defaultRot.x + offsetRotation.x, 1F, 0F, 0F);
			GL11.glRotatef(defaultRot.y + offsetRotation.y, 0F, 1F, 0F);
			GL11.glRotatef(defaultRot.z + offsetRotation.z, 0F, 0F, 1F);
			GL11.glTranslatef(-0.225F, -0.75F, 0);
		}
		else {
			GL11.glTranslatef(-0.225F, 0.75F, 0);
			GL11.glRotatef(defaultRot.x + offsetRotation.x, 1F, 0F, 0F);
			GL11.glRotatef(defaultRot.y + offsetRotation.y, 0F, 1F, 0F);
			GL11.glRotatef(defaultRot.z + offsetRotation.z, 0F, 0F, 1F);
			GL11.glTranslatef(0.225F, -0.75F, 0);
		}
	}
	
	private static void handleRotateLeft(Vector3f reloadRot)
	{
			GL11.glTranslatef(0.225F, 0.75F, 0);
			GL11.glRotatef(reloadRot.x, 1F, 0F, 0F);
			GL11.glRotatef(reloadRot.y, 0F, 1F, 0F);
			GL11.glRotatef(reloadRot.z, 0F, 0F, 1F);
			GL11.glTranslatef(-0.225F, -0.75F, 0);

	}
	
	private static void handleRotateRight(Vector3f reloadRot)
	{
			GL11.glTranslatef(-0.225F, 0.75F, 0);
			GL11.glRotatef(reloadRot.x, 1F, 0F, 0F);
			GL11.glRotatef(reloadRot.y, 0F, 1F, 0F);
			GL11.glRotatef(reloadRot.z, 0F, 0F, 1F);
			GL11.glTranslatef(0.225F, -0.75F, 0);

	}

}
