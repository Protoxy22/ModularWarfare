package com.modularwarfare.common.type;

import com.modularwarfare.ModularWarfare;

import net.minecraft.item.Item;

public class BaseItem extends Item {
	
	public BaseType baseType;
	
	public BaseItem(BaseType type)
	{
		setUnlocalizedName(type.internalName);
		setRegistryName(type.internalName);
		setCreativeTab(ModularWarfare.MOD_TAB);
		type.loadExtraValues();
		this.baseType = type;
	}
	
	public void setType(BaseType type)
	{
		
	}

}
