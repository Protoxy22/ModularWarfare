package com.modularwarfare.common;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.google.common.collect.Ordering;
import com.modularwarfare.ModularWarfare;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class MWTab extends CreativeTabs {

	static Comparator<ItemStack> tabSorter;
	
	public MWTab() {
		super(ModularWarfare.MOD_ID + "Tab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModularWarfare.gunTypes.size() > 0 ? (Item) ModularWarfare.gunTypes.values().toArray()[0] : Items.IRON_AXE);
	}
	
	@Override
    public void displayAllRelevantItems(NonNullList<ItemStack> items) {
        super.displayAllRelevantItems(items);
        items.sort(tabSorter);
    }
	
	public void preInitialize(List<Item> order)
	{
        tabSorter = Ordering.explicit(order).onResultOf(ItemStack::getItem);
	}

}
