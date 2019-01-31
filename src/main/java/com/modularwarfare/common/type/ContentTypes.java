package com.modularwarfare.common.type;

import java.util.ArrayList;

import com.modularwarfare.common.armor.ArmorType;
import com.modularwarfare.common.guns.AmmoType;
import com.modularwarfare.common.guns.AttachmentType;
import com.modularwarfare.common.guns.BulletType;
import com.modularwarfare.common.guns.GunType;

public class ContentTypes {
	
	public static ArrayList<TypeEntry> values = new ArrayList<TypeEntry>();
	private static int typeId = 0;
	
	public static void registerTypes()
	{
		registerType("guns", GunType.class);
		registerType("ammo", AmmoType.class);
		registerType("attachments", AttachmentType.class);
		registerType("armor", ArmorType.class);
		registerType("bullets", BulletType.class);
	}
	
	private static void registerType(String name, Class<? extends BaseType> typeClass)
	{
		values.add(new TypeEntry(name, typeClass, typeId));
		typeId += 1;
	}

}
