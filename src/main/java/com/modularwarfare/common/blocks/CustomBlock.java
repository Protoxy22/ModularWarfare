package com.modularwarfare.common.blocks;

import com.modularwarfare.ModularWarfare;

import net.minecraft.block.Block;

public class CustomBlock extends Block {
	
	public BlockType type;
	
	public CustomBlock(BlockType blockType)
	{
		super(blockType.material.toMaterial());
		type = blockType;
		type.loadExtraValues();
		
		setUnlocalizedName(type.internalName);
		setRegistryName(type.internalName);
		setCreativeTab(ModularWarfare.MOD_TAB);
	}

}
