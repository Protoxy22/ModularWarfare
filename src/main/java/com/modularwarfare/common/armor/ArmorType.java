package com.modularwarfare.common.armor;

import javax.annotation.Nullable;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.common.guns.AttachmentType;
import com.modularwarfare.common.type.BaseType;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmorType extends BaseType {
	
	@Override
	public void loadExtraValues()
	{
		loadBaseValues();
	}
	
	@Override
	public void reloadModel()
	{
		bipedModel = ModularWarfare.PROXY.loadModel(modelName != null ? modelName : internalName, internalName, ModelArmor.class);
	}
	
	@Override
	public String getAssetDir()
	{
		return "armor";
	}
	
}
