package com.modularwarfare.common.guns;

import com.google.gson.annotations.SerializedName;

public enum WeaponType {
	
	/** enum weaponType
	 * CUSTOM, PISTOL, MP, SMG, CARBINE, RIFLE, AR, DMR, SNIPER, SHOTGUN, etc 
	 */
	@SerializedName("custom") Custom("custom", 30),
	@SerializedName("pistol") Pistol("pistol", 15),
	@SerializedName("mp") MP("mp", 40),
	@SerializedName("smg") SMG("smg", 40),
	@SerializedName("carbine") Carbine("carbine", 60),
	@SerializedName("rifle") RIFLE("rifle", 70),
	@SerializedName("ar") AR("ar", 70),
	@SerializedName("dmr") DMR("dmr", 70),
	@SerializedName("semisniper") SemiSniper("semisniper", 80),
	@SerializedName("boltsniper") BoltSniper("boltsniper", 90),
	@SerializedName("shotgun") Shotgun("shotgun", 15);
	
	
	public String typeName;
	public int botDistance;

	WeaponType(String typeName, int botDistance) {
		this.typeName = typeName;
		this.botDistance = botDistance;
	}
	
	public static WeaponType fromEventName(String typeName)
	{
		if(typeName != null)
		{
			for(WeaponType soundType : values())
			{
				if(soundType.typeName.equalsIgnoreCase(typeName))
				{
					return soundType;
				}
			}
		}
		return null;
	}

}