package com.modularwarfare.common.guns;

import java.util.HashMap;

import com.modularwarfare.client.model.ModelBullet;
import com.modularwarfare.common.type.BaseType;
import com.modularwarfare.ModularWarfare;

public class BulletType extends BaseType {
	
	// Bullet Type 
	public HashMap<String, BulletProperty> bulletProperties = new HashMap<String, BulletProperty>();
	
	// AmmoType Overrides
	/** Base value for Upwards cursor/view recoil */
	public float recoilPitch = 0.0F;
	/** Base value for Left/Right cursor/view recoil */
	public float recoilYaw = 0.0F;
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
		model = ModularWarfare.PROXY.loadModel(modelName, internalName, ModelBullet.class);
	}
	
	@Override
	public String getAssetDir()
	{
		return "bullets";
	}

}
