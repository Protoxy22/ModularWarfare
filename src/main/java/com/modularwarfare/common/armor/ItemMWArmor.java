package com.modularwarfare.common.armor;

import javax.annotation.Nullable;

import com.modularwarfare.ModConfig;
import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.common.type.BaseType;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMWArmor extends ItemArmor {

	public ArmorType type;
	public BaseType baseType;
	public String internalName;
	
	public ItemMWArmor(ArmorType type, EntityEquipmentSlot slot) {
		super(ItemArmor.ArmorMaterial.LEATHER, 0, slot);
		type.initializeArmor(slot);
		type.loadExtraValues();
		internalName = type.armorInfoMap.get(slot.getName()).internalName;
		setUnlocalizedName(internalName);
		setRegistryName(internalName);
		setCreativeTab(ModularWarfare.MOD_TAB);
		this.baseType = type;
		this.type = type;
	}
	
	public void setType(BaseType type)
	{
		this.type = (ArmorType) type;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String armourType)
	{
		return ModularWarfare.MOD_ID + ":skins/" + (ModConfig.INSTANCE.detailedSkins ? "hd" : "default") + "/armor/" + type.modelSkins[0].getSkin() + ".png";
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
				
				armorModel.isSneak = defaultModel.isSneak;
				armorModel.isRiding = defaultModel.isRiding;
				armorModel.isChild = defaultModel.isChild;
				armorModel.rightArmPose = defaultModel.rightArmPose;
				armorModel.leftArmPose = defaultModel.leftArmPose;
				
				return armorModel;
			}
		}
		return null;
	}

}
