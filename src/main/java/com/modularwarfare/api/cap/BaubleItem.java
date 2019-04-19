package com.modularwarfare.api.cap;

import com.modularwarfare.api.IArmor;
import com.modularwarfare.api.MWArmorType;

import net.minecraft.item.ItemStack;

public class BaubleItem implements IArmor
{
	private MWArmorType baubleType;

	public BaubleItem(MWArmorType type) {
		baubleType = type;
	}

	@Override
	public MWArmorType getArmorType(ItemStack itemstack) {
		return baubleType;
	}
}
