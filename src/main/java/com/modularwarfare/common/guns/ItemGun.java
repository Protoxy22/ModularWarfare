package com.modularwarfare.common.guns;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.common.type.BaseItem;

public class ItemGun extends BaseItem {
	
	public GunType type;
	
	public ItemGun(GunType type)
	{
		super(type);
		this.type = type;
	}

}