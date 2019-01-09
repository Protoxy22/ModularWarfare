package com.modularwarfare.common.type;

import com.modularwarfare.ModularWarfare;

import net.minecraft.item.Item;

public class BaseItem extends Item {
	
	public BaseItem(BaseType type)
	{
		setUnlocalizedName(type.internalName);
		setCreativeTab(ModularWarfare.MOD_TAB);
		String iconName = type.iconName != null ? type.iconName : type.internalName;
		this.setTextureName(ModularWarfare.MOD_ID + ":" + iconName);
	}

}
