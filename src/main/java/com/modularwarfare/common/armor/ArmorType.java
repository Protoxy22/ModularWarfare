package com.modularwarfare.common.armor;

import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.MWArmorType;
import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.common.type.BaseType;

import net.minecraft.inventory.EntityEquipmentSlot;

public class ArmorType extends BaseType {
	
	public Integer durability;
	public double defense = 0;
	
	public HashMap<MWArmorType, ArmorInfo> armorTypes = new HashMap<MWArmorType, ArmorInfo>();
	
	
	public void initializeArmor(String slot)
	{	
		for(MWArmorType armorType : armorTypes.keySet())
		{
			if(armorType.name().toLowerCase().equalsIgnoreCase(slot))
			{
				armorTypes.get(armorType).internalName = internalName + (armorTypes.size() > 1 ? "_" + slot : "");
			}
		}
	}
	
	@Override
	public void loadExtraValues()
	{
		if(maxStackSize == null)
			maxStackSize = 1;
		
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
	
	public static class ArmorInfo
	{
		public String displayName;
		public transient String internalName;
	}
	
}
