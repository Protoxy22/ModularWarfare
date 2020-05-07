package com.modularwarfare.common.armor;

import java.util.HashMap;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.MWArmorType;
import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.common.type.BaseType;

public class ArmorType extends BaseType
{
	public Integer durability;
	public double defense;
	public HashMap<MWArmorType, ArmorInfo> armorTypes;

	public ArmorType() {
		this.armorTypes = new HashMap<MWArmorType, ArmorInfo>();
	}

	public void initializeArmor(final String slot) {
		for (final MWArmorType armorType : this.armorTypes.keySet()) {
			if (armorType.name().toLowerCase().equalsIgnoreCase(slot)) {
				this.armorTypes.get(armorType).internalName = this.internalName + ((this.armorTypes.size() > 1) ? ("_" + slot) : "");
			}
		}
	}

	@Override
	public void loadExtraValues() {
		if (this.maxStackSize == null) {
			this.maxStackSize = 1;
		}
		this.loadBaseValues();
	}

	@Override
	public void reloadModel() {
		this.bipedModel = ModularWarfare.PROXY.loadModel((this.modelName != null) ? this.modelName : this.internalName, this.internalName, ModelArmor.class);
	}

	@Override
	public String getAssetDir() {
		return "armor";
	}

	public static class ArmorInfo
	{
		public String displayName;
		public transient String internalName;
	}
}
