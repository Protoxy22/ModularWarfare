package com.modularwarfare.client;

import com.modularwarfare.common.guns.GunType;

public class AnimStateMachine {
	
	public static AnimStateMachine defaultStateMachine = new AnimStateMachine();
	
	public boolean isGunEmpty;
	
	/** Reload */
	public boolean reloading = false;
	public float reloadAnimationTime = 0;
	public float reloadAnimationProgress = 0F, lastReloadAnimationProgress = 0F;
	
	/** Recoil */
	public float gunRecoil = 0F, lastGunRecoil = 0F;
	
	public void onUpdate()
	{
		//Reload
		lastReloadAnimationProgress = reloadAnimationProgress;
		if(reloading)
			reloadAnimationProgress += 1F / reloadAnimationTime;
		if(reloading && reloadAnimationProgress >= 0.9F)	//reset if slide locked
			isGunEmpty = false;
		if(reloading && reloadAnimationProgress >= 1F)
			reloading = false;
				
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
		reloadAnimationTime = 100;
	}
	
	public void triggerEmpty()
	{
		isGunEmpty = true;
	}

}
