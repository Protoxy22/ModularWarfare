package com.modularwarfare.client;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelGun;

import com.modularwarfare.common.guns.WeaponSoundType;
import com.modularwarfare.common.network.PacketGunReloadSound;
import net.minecraft.item.ItemStack;

public class StateMachine {
	
	public static StateMachine defaultStateMachine = new StateMachine();
		
	public boolean isGunEmpty;
	
	/** Reload */
	public boolean reloading = false;
	public float reloadAnimationTime = 0;
	public float reloadAnimationProgress = 0F, lastReloadAnimationProgress = 0F;
	public int reloadAmmoCount = 1;
	public boolean unloadOnly = false;
	public boolean loadOnly = false;
	public boolean renderAmmo = true;

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
	boolean playedLoadSound = false;

	public void onUpdate()
	{




//		lastReloadAnimationProgress = reloadAnimationProgress;
//		if(reloading)
//			reloadAnimationProgress += 1F / reloadAnimationTime;
//		if(reloading && reloadAnimationProgress >= 0.9F)
//			isGunEmpty = false;
//		if(reloadAnimationProgress >= 1f)
//			reloadAnimationProgress -= Math.random()/2;



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
		if(unloadOnly && reloadAnimationProgress >= 0.5f) {
			renderAmmo = false;
		}

		if(reloadAnimationProgress >= 0.75f && !playedLoadSound && !unloadOnly && !loadOnly)
		{
			ModularWarfare.NETWORK.sendToServer(new PacketGunReloadSound(WeaponSoundType.Load));
			playedLoadSound = true;
		}

		//Reload
		lastReloadAnimationProgress = reloadAnimationProgress;
		if(reloading)
			reloadAnimationProgress += 1F / reloadAnimationTime;
		if(reloading && reloadAnimationProgress >= 0.9F)	//reset if slide locked
			isGunEmpty = false;
		if(reloading && reloadAnimationProgress >= 1F)
		{
			//renderAmmo = true;
			reloading = false;
			loadOnly = false;
			unloadOnly = false;
			cachedAmmoStack = null;
			lastReloadAnimationProgress = reloadAnimationProgress = 0;
		}

	}

	public void triggerReload(int reloadTime, ModelGun model, boolean isLoadOnly, boolean isUnload, int reloadCount) {
		reloading = true;

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
		playedLoadSound = false;
		reloadAmmoCount = reloadCount;
		//FlansModClient.lastBulletReload = ammoCount - 1;
	}
	
	public void triggerEmpty()
	{
		isGunEmpty = true;
	}

}
