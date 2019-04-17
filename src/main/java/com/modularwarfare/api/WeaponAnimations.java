package com.modularwarfare.api;

import java.util.HashMap;

import org.apache.logging.log4j.Level;

import com.modularwarfare.ModularWarfare;

public class WeaponAnimations {
	
	private static HashMap<String, WeaponAnimation> animationMap = new HashMap<String, WeaponAnimation>();
	
	// Prefabs
	public static String RIFLE = "rifle";
	public static String RIFLE2 = "rifle2";
	public static String RIFLE3 = "rifle3";
	public static String RIFLE4 = "rifle4";
	public static String PISTOL = "pistol";
	public static String SHOTGUN = "shotgun";
	public static String SNIPER = "sniper";
	public static String SIDE_CLIP = "sideclip";
	public static String TOP_RIFLE = "toprifle";
	
	public static String registerAnimation(String internalName, WeaponAnimation animation)
	{
		animationMap.put(internalName, animation);
		return internalName;
	}
	
	public static WeaponAnimation getAnimation(String internalName)
	{
		WeaponAnimation weaponAnimation = animationMap.get(internalName);
		if(weaponAnimation == null)
			ModularWarfare.LOGGER.log(Level.ERROR, String.format("Animation named '%s' does not exist in animation registry.", internalName));
		return animationMap.get(internalName);
	}

}
