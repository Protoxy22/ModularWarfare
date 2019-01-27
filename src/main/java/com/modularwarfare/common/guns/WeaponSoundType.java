package com.modularwarfare.common.guns;

import com.google.gson.annotations.SerializedName;

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
	
	/** The sound to play upon reloading when empty */ 
	@SerializedName("weaponReloadEmpty") ReloadEmpty("weaponReloadEmpty", 16, null),
	
	/** The sound to play upon charging */
	@SerializedName("weaponCharge") Charge("weaponCharge", 16, null),
	
	/** The sound to play upon switching fire modes */
	@SerializedName("weaponModeSwitch") ModeSwitch("weaponModeSwitch", 8, "defWeaponModeSwitch");
	
	public String eventName;
	public Integer defaultRange;
	public String defaultSound;
	
	WeaponSoundType(String eventName, int defaultRange, String defaultSound)
	{
		this.eventName = eventName;
		this.defaultRange = defaultRange;
		this.defaultSound = defaultSound;
	}
	
}
