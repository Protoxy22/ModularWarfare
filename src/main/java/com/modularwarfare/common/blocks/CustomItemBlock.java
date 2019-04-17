package com.modularwarfare.common.blocks;

import com.modularwarfare.ModularWarfare;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class CustomItemBlock extends ItemBlock {

	public BlockType type;
	
	public CustomItemBlock(CustomBlock block) {
		super(block);
		this.type = block.type;
		
		setUnlocalizedName(type.internalName);
		setRegistryName(type.internalName);
	}

}
