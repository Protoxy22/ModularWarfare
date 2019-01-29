package com.modularwarfare.api;

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.client.model.ModelGun;

public class WeaponAnimation {
	
	public Vector3f ammoLoadOffset;
	
	public Vector3f getAmmoLoadOffset()
	{
	    return new Vector3f(0, 0, 0);
	}
	
	public float tiltGunTime = 0.15F, unloadClipTime = 0.35F, loadClipTime = 0.35F, untiltGunTime = 0.15F;
	
	public void onGunAnimation(float reloadRotate) 
	{
		
	}
	
	public void onAmmoAnimation(ModelGun gunModel, float clipPosition)
	{
		
	}
	
}
