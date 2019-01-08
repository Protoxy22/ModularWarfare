package com.modularwarfare.common.guns;

import com.modularwarfare.common.type.BaseType;

public class GunType extends BaseType {

	public int gunDamage;
	public String[] acceptedAmmo;
	
	@Override
	public String toString()
	{
		return internalName + " " + gunDamage;
	}
	
}
