package com.modularwarfare.common.guns;

import com.google.gsonapi.annotations.SerializedName;

public enum WeaponSoundType {
	
	/** The sound played upon dry firing */
	@SerializedName("weaponDryFire") DryFire("weaponDryFire", 8, "defemptyclick"),
	
	/** The sound played upon shooting */
	@SerializedName("weaponFire") Fire("weaponFire", 64, null),

	/** The sound played upon shooting with a silencer */
	@SerializedName("weaponFireSuppressed") FireSuppressed("weaponFireSuppressed", 32, null),
	
	/** The sound to play upon shooting on last round */
	@SerializedName("weaponFireLast") FireLast("weaponFireLast", 16, null),

	/** The sound to play upon reloading */
	@SerializedName("weaponReload") Reload("weaponReload", 16, null),

	/** The sound to play when a bullet hit a block */
	@SerializedName("impact") Impact("impact", 16, "impact"),

	/** The sound to play when a bullet hit a block */
	@SerializedName("hit") Hit("hit", 16, "hit"),

	/** The sound to play when equip a gun */
	@SerializedName("equip") Equip("equip", 8, "equip"),


	/** The sound to play when a bullet hit an entity (played to the shooter) */
	@SerializedName("hitmarker") Hitmarker("hitmarker", 8, "hitmarker"),

	/** The sound to play when an entity is damaged */
	@SerializedName("penetration") Penetration("penetration", 20, "penetration"),

	/** The sound to play upon reloading */
	@SerializedName("weaponLoad") Load("weaponLoad", 12, null),
	
	/** The sound to play upon reloading */
	@SerializedName("weaponUnload") Unload("weaponUnload", 12, null),
	
	/** The sound to play upon reloading when empty */ 
	@SerializedName("weaponReloadEmpty") ReloadEmpty("weaponReloadEmpty", 12, null),
	
	/** The sound to play upon charging */
	@SerializedName("weaponCharge") Charge("weaponCharge", 16, null),
	
	/** The sound to play upon switching fire modes */
	@SerializedName("weaponModeSwitch") ModeSwitch("weaponModeSwitch", 8, "defweaponmodeswitch"),

	/** The sound of flyby */
	@SerializedName("bulletFlyBy") FlyBy("bulletFlyBy", 8, "flyby"),

	/** The sound of spray */
	@SerializedName("spray") Spray("spray", 8, "spray"),

	/** The sound of heli */
	@SerializedName("sound_heli") Heli_Background("sound_heli", 64, "sound_heli"),
	@SerializedName("heli1") Heli1("heli1", 32, "heli1"),
	@SerializedName("heli2") Heli2("heli2", 32, "heli2"),
	@SerializedName("heli3") Heli3("heli3", 32, "heli3"),
	@SerializedName("heli4") Heli4("heli4", 32, "heli4"),
	@SerializedName("heli5") Heli5("heli5", 32, "heli5"),

	@SerializedName("punched") Punched("punched", 64, "punched");


	public String eventName;
	public Integer defaultRange;
	public String defaultSound;
	
	WeaponSoundType(String eventName, int defaultRange, String defaultSound)
	{
		this.eventName = eventName;
		this.defaultRange = defaultRange;
		this.defaultSound = defaultSound;
	}
	
	public static WeaponSoundType fromString(String input)
	{
		for(WeaponSoundType soundType : values())
		{
			if(soundType.toString().equalsIgnoreCase(input))
			{
				return soundType;
			}
		}
		return null;
	}
	
	@Override
	public String toString()
	{
		return eventName;
	}
	
}
