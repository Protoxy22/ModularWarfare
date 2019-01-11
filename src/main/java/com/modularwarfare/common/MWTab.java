package com.modularwarfare.common;

import com.modularwarfare.ModularWarfare;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class MWTab extends CreativeTabs {

	public MWTab() {
		super(ModularWarfare.MOD_ID + "Tab");
	}

	@Override
	public Item getTabIconItem() {
		return ModularWarfare.gunTypes.size() > 0 ? (Item) ModularWarfare.gunTypes.values().toArray()[0] : Items.iron_axe;
	}

}
