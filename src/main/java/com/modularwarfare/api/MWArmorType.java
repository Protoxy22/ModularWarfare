package com.modularwarfare.api;

import com.google.gson.annotations.SerializedName;

public enum MWArmorType {
	
    @SerializedName("head") Head,
    @SerializedName("chest") Chest,
    @SerializedName("legs") Legs,
    @SerializedName("feet") Feet,
	@SerializedName("upperface") UpperFace(0),
	@SerializedName("lowerface") LowerFace(4),
	@SerializedName("vest") Vest(1),
	@SerializedName("backpack") Backpack(5),
	@SerializedName("gloves") Gloves(2),
	@SerializedName("arms") Arms(6),
	@SerializedName("accessory") Accessory(3),
	@SerializedName("any") Any(0,1,2,3,4,5,6);

	int[] validSlots;

	private MWArmorType(int ... validSlots) {
		this.validSlots = validSlots;
	}

	public boolean hasSlot(int slot) {
		for (int s:validSlots) {
			if (s == slot) return true;
		}
		return false; 
	}

	public int[] getValidSlots() {
		return validSlots;
	}
	
	public static boolean isVanilla(MWArmorType type)
	{
		return type == Head || type == Chest || type == Legs || type == Feet;
	}
	
}
