package com.modularwarfare.common.type;

import com.modularwarfare.ModularWarfare;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;

public class BaseItem extends Item {
	
	public BaseType baseType;
	public boolean render3d = true;
	
	public BaseItem(BaseType type)
	{
		type.loadExtraValues();
		
		setUnlocalizedName(type.internalName);
		setRegistryName(type.internalName);
		setCreativeTab(ModularWarfare.MOD_TAB);
		
		this.baseType = type;
		this.setMaxStackSize(type.maxStackSize);
	}
	
	public void setType(BaseType type)
	{
		
	}
	
	public String generateLoreLine(String prefix, String value)
	{
		String baseDisplayLine = "%b%s: %g%s";
    	baseDisplayLine = baseDisplayLine.replaceAll("%b", TextFormatting.BLUE.toString());
    	baseDisplayLine = baseDisplayLine.replaceAll("%g", TextFormatting.GRAY.toString());
    	return String.format(baseDisplayLine, prefix, value);
	}
	
	public String generateLoreLineAlt(String prefix, String current, String max)
	{
		String baseDisplayLine = "%b%s: %g%s%dg/%g%s";
    	baseDisplayLine = baseDisplayLine.replaceAll("%b", TextFormatting.BLUE.toString());
    	baseDisplayLine = baseDisplayLine.replaceAll("%g", TextFormatting.GRAY.toString());
    	baseDisplayLine = baseDisplayLine.replaceAll("%dg", TextFormatting.DARK_GRAY.toString());
    	return String.format(baseDisplayLine, prefix, current, max);
	}
	
}
