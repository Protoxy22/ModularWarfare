package com.modularwarfare.client;

import java.util.Random;

import com.modularwarfare.client.anim.AnimState;
import com.modularwarfare.client.anim.AnimStateMachine;
import com.modularwarfare.client.anim.AnimationType;
import com.modularwarfare.client.anim.StateType;
import com.modularwarfare.client.model.ModelGun;

import net.minecraft.item.ItemStack;

public class StateMachine {
	
	public static StateMachine defaultStateMachine = new StateMachine();
	
	private AnimStateMachine animStateMachine;
	
	public boolean isGunEmpty;
	
	/** Reload */
	public boolean reloading = false;
	public float reloadAnimationTime = 0;
	public float reloadAnimationProgress = 0F, lastReloadAnimationProgress = 0F;
	public int reloadAmmoCount = 1;
	public boolean unloadOnly = false;
	public boolean loadOnly = false;
	public boolean renderAmmo = true;
//	
	/** Recoil */
	public float gunRecoil = 0F, lastGunRecoil = 0F;
//	
	/** Slide */
	public float gunSlide = 0F, lastGunSlide = 0F;
//	/** Delayed Reload Animations */
//	public int timeUntilPump = 0, timeToPumpFor = 0;
//	/** Delayed Reload Animations : -1, 1 = At rest, 0 = Mid Animation */
//	public float pumped = 0.91F, lastPumped = 0.91F;
//	/** Delayed Reload Animations : Doing the delayed animation */
//	public boolean pumping = false;
//	/** Charge handle variables */
//	public int timeUntilCharge = 0, timeToChargeFor = 0;
//	public float charged = -1F, lastCharged = -1F;
//	public boolean charging = false;
//	
//	public int muzzleFlashTime = 0;
//	public int flashInt = 0;
//
//	/** Casing mechanics */
//	public int timeUntilCasing = 0;
//	public int casingStage = 0;
//	public int lastCasingStage = 0;
//
	/** Hammer model mechanics */
	/** If in single action, the model will play a modified animation and delay hammer reset */
	public float hammerRotation = 0F;
	public int timeUntilPullback = 0;
	public float gunPullback = -1F, lastGunPullback = -1F;
	public boolean isFired = false;
//	
//	public Vector3f casingRandom = new Vector3f(0F, 0F, 0F);
//		
//	public float chargeTrigger = 0f;
//	public int chargeTriggerTrigger = 0;
//
//	public int chargeDelayAfterReload;
//	
	public ItemStack cachedAmmoStack;
//	public static float renderTick;
//	
//	boolean playedLoadSound = false;
	
	public void onUpdate()
	{
		
		lastReloadAnimationProgress = reloadAnimationProgress;
		if(reloading)
			reloadAnimationProgress += 1F / reloadAnimationTime;
		if(reloading && reloadAnimationProgress >= 0.9F)
			isGunEmpty = false;

		if(reloading && animStateMachine != null && animStateMachine.tick(reloadAnimationProgress, reloadAnimationTime))
		{
			reloading = false;
		}
		
		//System.out.println(reloading);
		
		//Assign values
//		lastPumped = pumped;
//		lastCharged = charged;
//		lastGunPullback = gunPullback;
//		lastCasingStage = casingStage;
//
//		// Time until pump-action
//		if (timeUntilPump > 0) {
//			timeUntilPump--;
//			if (timeUntilPump == 0) {
//				// Pump it!
//				pumping = true;
//				lastPumped = pumped = -1F;
//				RenderGun.shotState = 1;
//			}
//
//		}
//
//		// Timer until pulling back the charge handle/bolt
//		if (timeUntilCharge >= 0 && !charging) {
//			timeUntilCharge -= timeUntilCharge >= 1 ? 1 : 0;
//			if (timeUntilCharge == 0 && chargeTrigger >= 1f) {
//				// Pump it!
//				charging = true;
//				//System.out.println("called");
//				ModularWarfare.NETWORK.sendToServer(new PacketGunReloadSound(WeaponSoundType.Charge));
//				lastCharged = charged = -1F;
//			}
//		}	
//		
//		//System.out.println(chargeTrigger);
		// Time until hammer pullback
		if (timeUntilPullback > 0) {
			timeUntilPullback--;
			if (timeUntilPullback == 0) {
				// Reset the hammer
				isFired = true;
				lastGunPullback = gunPullback = -1F;
			}
		} else {
			// Automatically reset hammer
			hammerRotation *= 0.6F;
		}
//
//		// Time until bullet casing ejection
//		if (timeUntilCasing > 0) {
//			timeUntilCasing--;
//			if (timeUntilCasing == 0)
//				casingStage++;
//		} else {
//			casingStage++;
//		}
//
//		if (muzzleFlashTime > 0)
//			muzzleFlashTime--;
//
//		if (pumping) {
//			pumped += 2F / timeToPumpFor;
//			if (pumped >= 0.999F) {
//				pumped = 1f;
//				lastPumped = 1f;
//				pumping = false;
//			}
//		}
//		
//		if (charging) {
//			charged += 2F / (timeToChargeFor * 0.51);
//			charged = NumberHelper.clamp(charged, -1F, 1F);
//			if (charged >= 0.999F) {
//				charging = false;
//			}
//		}
//
//		if (isFired) {
//			gunPullback += 2F / 4;
//			if (gunPullback >= 0.999F)
//				isFired = false;
//		}
//
		// Slide model
		lastGunSlide = gunSlide;
		if (isGunEmpty)
			lastGunSlide = gunSlide = 0.5F;
		if (!isGunEmpty && gunSlide > 0.9) // Add one extra frame to slide
			gunSlide -= 0.1F;
		else if (gunSlide > 0 && !isGunEmpty)
			gunSlide *= 0.5F;
//		
		if(unloadOnly && reloadAnimationProgress >= 0.5f) {
			renderAmmo = false;
		}
//		
//		if(reloadAnimationProgress >= 0.75f && !playedLoadSound && !unloadOnly && !loadOnly)
//		{
//			ModularWarfare.NETWORK.sendToServer(new PacketGunReloadSound(WeaponSoundType.Load));
//			playedLoadSound = true;
//		}
//		
//		//Reload
//		lastReloadAnimationProgress = reloadAnimationProgress;
//		if(reloading)
//			reloadAnimationProgress += 1F / reloadAnimationTime;
//		if(reloading && reloadAnimationProgress >= 0.9F)	//reset if slide locked
//			isGunEmpty = false;
//		if(reloading && reloadAnimationProgress >= 1F)
//		{
//			//renderAmmo = true;
//			reloading = false;
//			loadOnly = false;
//			unloadOnly = false;
//			cachedAmmoStack = null;
//			lastReloadAnimationProgress = reloadAnimationProgress = 0;
//		}
//				
//		//Recoil model
		lastGunRecoil = gunRecoil;
		if (gunRecoil > 0)
			gunRecoil *= 0.5F;
	}
	
	public void triggerShoot(ModelGun model)
	{
		Random r = new Random();
		
		lastGunRecoil = gunRecoil = 1F;
		
		lastGunSlide = gunSlide = 1F;
		hammerRotation = model.hammerAngle;
		/*timeUntilPump = model.pumpDelay;
		timeToPumpFor = model.pumpTime;
		timeUntilPullback = model.hammerDelay;
		timeUntilCasing = model.casingDelay;
		muzzleFlashTime = 2;

		int Low = -1;
		int High = 3;
		int result = r.nextInt(High-Low) + Low;
		if(result == -1) result = 0;
		if(result == 3) result = 2;
        flashInt = result;
        
        casingRandom.x = ((r.nextFloat()*2)-1);
        casingRandom.y = ((r.nextFloat()*2)-1);
        casingRandom.z = ((r.nextFloat()*2)-1);
		casingStage = 0;
		
		if(model.pumpDelay == 0)
		{
			RenderGun.shotState = 1;
		}*/
	}
	
	public void triggerReload(int reloadTime, ModelGun model, boolean isLoadOnly, boolean isUnload, int reloadCount)
	{
		reloading = true;
		
		animStateMachine = model.animationStates.build(isLoadOnly ? AnimationType.Load : isUnload ? AnimationType.Unload : AnimationType.All);
		
		lastReloadAnimationProgress = reloadAnimationProgress = 0F;
		reloadAnimationTime = isLoadOnly || isUnload ? reloadTime*0.65f : reloadTime;
		
		/*timeUntilPump = model.pumpDelayAfterReload;
		timeToPumpFor = model.pumpTime;
		timeUntilCharge = model.chargeDelay model.chargeDelayAfterReload;
		chargeDelayAfterReload = model.chargeDelayAfterReload;
		timeToChargeFor = model.chargeTime;*/
		loadOnly = isLoadOnly;
		renderAmmo = !loadOnly;
		unloadOnly = isUnload;
		//playedLoadSound = false;
		reloadAmmoCount = reloadCount;
		//FlansModClient.lastBulletReload = ammoCount - 1;
	}
	
	public void triggerEmpty()
	{
		isGunEmpty = true;
	}
	
	public boolean isAnimState(StateType stateType)
	{
		if(animStateMachine == null || animStateMachine.currentState == null)
			return false;
		
		if(animStateMachine.currentState.stateType != stateType)
			return false;
		return true;
	}
	
	public AnimState getState(StateType stateType)
	{
		if(animStateMachine == null)
			return null;
		
		for(AnimState anim : animStateMachine.states)
		{
			if(anim.stateType == stateType)
				return anim;
		}
		return null;
	}

}
