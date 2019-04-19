package com.modularwarfare.common.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.IArmor;
import com.modularwarfare.api.MWArmorType;
import com.modularwarfare.common.type.BaseItem;
import com.modularwarfare.common.type.BaseType;

public class ItemSpecialArmor extends BaseItem implements IArmor {

	public ArmorType type;
	public MWArmorType armorType;
	public BaseType baseType;
	
	public ItemSpecialArmor(ArmorType type, MWArmorType armorType) {
		super(type);
		type.loadExtraValues();
		this.baseType = type;
		this.type = type;
		this.armorType = armorType;
	}

	@Override
	public MWArmorType getArmorType(ItemStack itemstack) {
		return armorType;
	}
	
	@Override
	public void setType(BaseType type)
	{
		this.type = (ArmorType) type;
	}
	
	@Override
    public void onUpdate(ItemStack unused, World world, Entity holdingEntity, int intI, boolean flag)
    {
		if(holdingEntity instanceof EntityPlayer)
		{
			EntityPlayer entityPlayer = (EntityPlayer) holdingEntity;

			if(unused != null && unused.getItem() instanceof ItemMWArmor)
			{				
				if(unused.getTagCompound() == null)
				{
					NBTTagCompound nbtTagCompound = new NBTTagCompound();
					nbtTagCompound.setInteger("skinId", 0);
					unused.setTagCompound(nbtTagCompound);
				}
			}	
		}
    }
	
	@Override
    public boolean getShareTag()
    {
        return true;
    }

}
