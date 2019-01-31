package com.modularwarfare.common.guns;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelAmmo;
import com.modularwarfare.common.type.BaseType;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AmmoType extends BaseType {
		
	// Ammo Variables
	/** The number of bullet entities created by each shot */
	public int numBullets = 1;
	/** Ammo Capacity Amount */
	public int ammoCapacity = 30;
	/** Magazine Count */
	public Integer magazineCount;
	/** The time (in seconds) it takes to reload this gun */
	public float reloadTime;
	
	// Non-Sub Ammo Overrides
	/** Base value for Upwards cursor/view recoil */
	public float recoilPitch = 0.0F;
	/** Base value for Left/Right cursor/view recoil */
	public float recoilYaw = 0.0F;
	/** Damage inflicted per bullet. Multiplied by the gun damage value. */
	public float bulletDamage = 1;
	/** The amount that bullets spread out when fired from this gun */
	public float bulletSpread;
	
	// Dynamic Ammo Stuff
	/** Will this ammo item be loaded or empty when crafted, default loaded */
	public boolean emptyOnCraft = false;
	/** Override ammo deletion, to allow for enabling or disabling of returned empty mags */
	public boolean allowEmptyMagazines = false;
	
	// Sub Ammo 
	/** The ammo type(s) that can be loaded into this item */
	public String[] subAmmo;
	
	@Override
	public void loadExtraValues()
	{
		if(maxStackSize == null)
			maxStackSize = 4;
		
		loadBaseValues();
	}
	
	@Override
	public void reloadModel()
	{
		model = ModularWarfare.PROXY.loadModel(modelName, internalName, ModelAmmo.class);
	}
	
	@Override
	public String getAssetDir()
	{
		return "ammo";
	}
	
}