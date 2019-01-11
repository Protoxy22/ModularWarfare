package com.modularwarfare.common.guns;

public class SkinType {
	
	public String internalName;
	public String displayName;
	public String skinAsset;
	public String[] requiredItems;
	
	public String getSkin(GunType gunType)
	{
		return skinAsset != null ? skinAsset : gunType + internalName;
	}

}
