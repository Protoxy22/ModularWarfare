package com.modularwarfare.common.type;

import com.modularwarfare.ModularWarfare;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

public class BaseItem extends Item {
	
	public BaseType baseType;
	public boolean render3d = true;
	
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
