package com.modularwarfare.common.guns;

import net.minecraft.item.Item;

public class ItemGun extends Item {
	
	public GunType type;
	
	public ItemGun(GunType type)
	{
		this.type = type;
	}

}