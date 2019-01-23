package com.modularwarfare.client;

public class AnimStateMachine {
	
	public static AnimStateMachine defaultStateMachine = new AnimStateMachine();
	
	/** Recoil */
	public float gunRecoil = 0F, lastGunRecoil = 0F, recoilAmount = 0.33F;
	
	public void onUpdate()
	{
		//Recoil model
		lastGunRecoil = gunRecoil;
		if (gunRecoil > 0)
			gunRecoil *= 0.7F;
	}
	
	public void doShoot()
	{
		lastGunRecoil = gunRecoil += recoilAmount;
	}

}
