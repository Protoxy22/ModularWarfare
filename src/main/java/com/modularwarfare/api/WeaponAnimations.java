package com.modularwarfare.api;

import java.util.HashMap;

public class WeaponAnimations {
	
	private static HashMap<String, WeaponAnimation> animationMap = new HashMap<String, WeaponAnimation>();
	
	// Prefabs
	public static String RIFLE = "rifle";
	public static String RIFLE2 = "rifle2";
	public static String PISTOL = "pistol";
	
	public static String registerAnimation(String internalName, WeaponAnimation animation)
	{
		animationMap.put(internalName, animation);
		return internalName;
	}
	
	public static WeaponAnimation getAnimation(String internalName)
	{
		return animationMap.get(internalName);
	}

}
