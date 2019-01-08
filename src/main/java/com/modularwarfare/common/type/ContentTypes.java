package com.modularwarfare.common.type;

import java.util.ArrayList;

import com.modularwarfare.common.guns.GunType;

public class ContentTypes {
	
	public static ArrayList<TypeEntry> values = new ArrayList<TypeEntry>();
	
	public static void registerTypes()
	{
		int id = 0;
		values.add(new TypeEntry("guns", GunType.class, id));
	}

}
