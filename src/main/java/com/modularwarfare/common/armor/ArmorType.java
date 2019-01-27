package com.modularwarfare.common.armor;

import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.common.type.BaseType;

import net.minecraft.inventory.EntityEquipmentSlot;

public class ArmorType extends BaseType {
	
	public ArmorInfo[] armorTypes;
	public HashMap<String, ArmorInfo> armorInfoMap = new HashMap<String, ArmorInfo>();
	
	
	public void initializeArmor(EntityEquipmentSlot slot)
	{
		for(ArmorInfo armorInfo : armorTypes)
		{
			if(armorInfo.armorType.toString().equalsIgnoreCase(slot.getName()))
			{
				armorInfo.internalName = internalName + "_" + armorInfo.armorType.toString();
				armorInfoMap.put(slot.getName(), armorInfo);
			}
		}
	}
	
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
	
	public static class ArmorInfo
	{
		public ArmorTypeEnum armorType;
		public String displayName;
		public transient String internalName;
	}
	
	public static enum ArmorTypeEnum
	{
		
		@SerializedName("head") Head(4),
		
		@SerializedName("chest") Chest(3),
		
		@SerializedName("legs") Legs(2),
		
		@SerializedName("feet") Feet(1);
		
		public int slot;
		
		ArmorTypeEnum(int slot)
		{
			this.slot = slot;
		}
		
		@Override
		public String toString()
		{
			return name().toLowerCase();
		}
		
	}
	
}
