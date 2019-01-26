package com.modularwarfare.common.armor;

import javax.annotation.Nullable;

import com.modularwarfare.client.model.ModelArmor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMWArmor extends ItemArmor {

	public ArmorType type;
	
	public ItemMWArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, ArmorType type) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.type = type;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof ItemMWArmor)
			{
				ArmorType armorType = ((ItemMWArmor)stack.getItem()).type;
				ModelArmor armorModel = (ModelArmor) armorType.bipedModel;
				armorModel.showHead(slot == EntityEquipmentSlot.HEAD);
				armorModel.showChest(slot == EntityEquipmentSlot.CHEST);
				armorModel.showLegs(slot == EntityEquipmentSlot.LEGS);
				armorModel.showFeet(slot == EntityEquipmentSlot.FEET);
				return armorModel;
			}
		}
		return null;
	}

}
