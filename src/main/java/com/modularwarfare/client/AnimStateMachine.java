package com.modularwarfare.client;

import com.modularwarfare.common.guns.GunType;

public class AnimStateMachine {
	
	public static AnimStateMachine defaultStateMachine = new AnimStateMachine();
	
	public boolean isGunEmpty;
	
	/** Reload */
	public boolean reloading = false;
	public float reloadAnimationTime = 0;
	public float reloadAnimationProgress = 0F, lastReloadAnimationProgress = 0F;
	public int reloadAmmoCount = 1;
	
	/** Recoil */
	public float gunRecoil = 0F, lastGunRecoil = 0F;
	
	/** Slide */
	public float gunSlide = 0F, lastGunSlide = 0F;
	/** Delayed Reload Animations */
	public int timeUntilPump = 0, timeToPumpFor = 0;
	/** Delayed Reload Animations : -1, 1 = At rest, 0 = Mid Animation */
	public float pumped = -1F, lastPumped = -1F;
	/** Delayed Reload Animations : Doing the delayed animation */
	public boolean pumping = false;
	/** Charge handle variables */
	public int timeUntilCharge = 0, timeToChargeFor = 0;
	public float charged = -1F, lastCharged = -1F;
	public boolean charging = false;
	


	public float minigunBarrelRotation = 0F;
	public float minigunBarrelRotationSpeed = 0F;
	
	public int muzzleFlashTime = 0;
	public int flashInt = 0;

	/** Casing mechanics */
	public int timeUntilCasing = 0;
	public int casingStage = 0;
	public int lastCasingStage = 0;

	/** Hammer model mechanics */
	/** If in single action, the model will play a modified animation and delay hammer reset */
	public float hammerRotation = 0F;
	public float althammerRotation = 0F;
	public int timeUntilPullback = 0;
	public float gunPullback = -1F, lastGunPullback = -1F;
	public boolean isFired = false;
	
	public void onUpdate()
	{
		//Reload
		lastReloadAnimationProgress = reloadAnimationProgress;
		if(reloading)
			reloadAnimationProgress += 1F / reloadAnimationTime;
		if(reloading && reloadAnimationProgress >= 0.9F)	//reset if slide locked
			isGunEmpty = false;
		if(reloading && reloadAnimationProgress >= 1F)
		{
			reloading = false;
			lastReloadAnimationProgress = reloadAnimationProgress = 0;
		}		
		//Recoil model
		lastGunRecoil = gunRecoil;
		if (gunRecoil > 0)
			gunRecoil *= 0.5F;
	}
	
	public void triggerShoot()
	{
		lastGunRecoil = gunRecoil = 1F;
	}
	
	public void triggerReload(int reloadTime)
	{
		reloading = true;
		lastReloadAnimationProgress = reloadAnimationProgress = 0F;
		reloadAnimationTime = reloadTime;
	}
	
	public void triggerEmpty()
	{
		isGunEmpty = true;
	}

}
