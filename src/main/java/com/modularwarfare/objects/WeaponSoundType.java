package com.modularwarfare.objects;

public enum WeaponSoundType {
	
	/** The sound played upon dry firing */
	DryFire("weaponDryFire", 8),
	
	/** The sound played upon shooting */
	Fire("weaponFire", 64),
	
	/** The sound played upon shooting with a silencer */
	FireSuppressed("weaponFireSuppressed", 32),
	
	/** The sound to play upon shooting on last round */
	FireLast("weaponFireLast", 16),
	
	/** The sound to play upon reloading */
	Reload("weaponReload", 16),
	
	/** The sound to play upon reloading when empty */ 
	ReloadEmpty("weaponReloadEmpty", 16),
	
	/** The sound to play upon charging */
	Charge("weaponCharge", 16);
	
	public String eventName;
	public Integer defaultRange;
	
	WeaponSoundType(String eventName, int defaultRange)
	{
		this.eventName = eventName;
		this.defaultRange = defaultRange;
	}
	
	public static WeaponSoundType fromEventName(String eventName)
	{
		if(eventName != null)
		{
			for(WeaponSoundType soundType : values())
			{
				if(soundType.eventName.equalsIgnoreCase(eventName))
				{
					return soundType;
				}
			}
		}
		return null;
	}
	
}
