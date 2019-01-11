package com.modularwarfare.common.guns;

import com.modularwarfare.common.type.BaseItem;
import com.modularwarfare.common.type.BaseType;

public class ItemAmmo extends BaseItem {
	
	public AmmoType type;
	
	public ItemAmmo(AmmoType type)
	{
		super(type);
		this.type = type;
	}
	
	@Override
	public void setType(BaseType type)
	{
		this.type = (AmmoType) type;
	}

}