package com.modularwarfare.common.armor;

import com.modularwarfare.api.MWArmorType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import com.modularwarfare.api.IArmor;
import com.modularwarfare.common.type.BaseItem;
import com.modularwarfare.common.type.BaseType;

public class ItemSpecialArmor extends BaseItem implements IArmor
{
	public ArmorType type;
	public MWArmorType armorType;
	public BaseType baseType;

	public ItemSpecialArmor(final ArmorType type, final MWArmorType armorType) {
		super(type);
		type.loadExtraValues();
		this.baseType = type;
		this.type = type;
		this.armorType = armorType;
	}

	@Override
	public MWArmorType getArmorType(final ItemStack itemstack) {
		return this.armorType;
	}

	@Override
	public void setType(final BaseType type) {
		this.type = (ArmorType)type;
	}

	public void onUpdate(final ItemStack unused, final World world, final Entity holdingEntity, final int intI, final boolean flag) {
		if (holdingEntity instanceof EntityPlayer) {
			final EntityPlayer entityPlayer = (EntityPlayer)holdingEntity;
			if (unused != null && unused.getItem() instanceof ItemMWArmor && unused.getTagCompound() == null) {
				final NBTTagCompound nbtTagCompound = new NBTTagCompound();
				nbtTagCompound.setInteger("skinId", 0);
				unused.setTagCompound(nbtTagCompound);
			}
		}
	}

	public boolean getShareTag() {
		return true;
	}
}

