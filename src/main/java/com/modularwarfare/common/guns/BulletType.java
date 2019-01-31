package com.modularwarfare.common.guns;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelAmmo;
import com.modularwarfare.common.type.BaseType;

public class BulletType extends BaseType {
	
	// AmmoType Overrides
	/** Base value for Upwards cursor/view recoil */
	public float recoilPitch = 0.0F;
	/** Base value for Left/Right cursor/view recoil */
	public float recoilYaw = 0.0F;
	/** Damage inflicted per bullet. Multiplied by the gun damage value. */
	public float bulletDamage = 1;
	/** The amount that bullets spread out when fired from this gun */
	public float bulletSpread;
	
	@Override
	public void loadExtraValues()
	{
		if(maxStackSize == null)
			maxStackSize = 64;
		
		loadBaseValues();
	}
	
	@Override
	public void reloadModel()
	{
		//model = ModularWarfare.PROXY.loadModel(modelName, internalName, ModelAmmo.class);
	}
	
	@Override
	public String getAssetDir()
	{
		return "bullets";
	}

}
