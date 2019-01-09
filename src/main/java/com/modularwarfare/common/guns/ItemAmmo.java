package com.modularwarfare.common.guns;

import com.modularwarfare.common.type.BaseItem;

public class ItemAmmo extends BaseItem {
	
	public AmmoType type;
	
	public ItemAmmo(AmmoType type)
	{
		super(type);
		this.type = type;
	}

}