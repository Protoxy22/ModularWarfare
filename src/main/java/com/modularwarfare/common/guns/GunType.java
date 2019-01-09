package com.modularwarfare.common.guns;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.common.type.BaseType;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GunType extends BaseType {

	public int gunDamage;
	public String[] acceptedAmmo;
	
	public String modelName;
	public SkinType[] weaponSkins;
	
	@SideOnly(Side.CLIENT)
	public transient ModelGun model;
	
	@Override
	public void loadExtraValues()
	{
		model = ModularWarfare.PROXY.loadModel(modelName, internalName, ModelGun.class);
	}
	
}
