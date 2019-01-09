package com.modularwarfare.common.guns;

public class SkinType {
	
	public String skinName;
	public String skinAsset;
	public String[] requiredItems;
	
	@Override
	public String toString()
	{
		String reqItemString = "";
		for(String reqItem : requiredItems)
		{
			reqItemString += reqItem;
		}
		
		return skinAsset;
	}

}
