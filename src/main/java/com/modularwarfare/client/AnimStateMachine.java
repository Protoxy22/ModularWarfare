package com.modularwarfare.client;

public class AnimStateMachine {
	
	public static AnimStateMachine defaultStateMachine = new AnimStateMachine();
	
	/** Recoil */
	public float gunRecoil = 0F, lastGunRecoil = 0F;
	
	public void onUpdate()
	{
		//Recoil model
		lastGunRecoil = gunRecoil;
		if (gunRecoil > 0)
			gunRecoil *= 0.5F;
	}
	
	public void doShoot()
	{
		lastGunRecoil = gunRecoil = 1F;
	}

}
