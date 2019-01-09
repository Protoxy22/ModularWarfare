package com.modularwarfare.common.guns;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelAmmo;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.common.type.BaseType;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AmmoType extends BaseType {
	
	public String modelName;
	public String skinAsset;
	
	@SideOnly(Side.CLIENT)
	public transient ModelAmmo model;

	public void loadExtraValues()
	{
		model = ModularWarfare.PROXY.loadModel(modelName, internalName, ModelAmmo.class);
	}
	
}
