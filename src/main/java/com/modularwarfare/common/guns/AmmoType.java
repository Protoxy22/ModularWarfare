package com.modularwarfare.common.guns;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelAmmo;
import com.modularwarfare.common.type.BaseType;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AmmoType extends BaseType {
	
	public String modelName;
	public String skinAsset;
	
	//Ammo Override variables
	/** The number of bullet entities created by each shot */
	public int numBullets = 1;
	/** Ammo Capacity Amount */
	public int ammoCapacity = 30;
	/** Max stack size */
	public int maxStackSize = 4;
	/** Magazine Count */
	public int magazineCount = 1;
	/** The amount that bullets spread out when fired from this gun */
	public float bulletSpread;
	/** The time (in seconds) it takes to reload this gun */
	public float reloadTime;
	/** Base value for Upwards cursor/view recoil */
	public float recoilPitch = 0.0F;
	/** Base value for Left/Right cursor/view recoil */
	public float recoilYaw = 0.0F;
	/** Damage inflicted per bullet. Multiplied by the gun damage value. */
	public float bulletDamage = 1;
	
	//Dynamic Ammo Stuff
	/** Will this ammo item be loaded or empty when crafted, default loaded */
	public boolean emptyOnCraft = false;
	
	//TODO; Deltric check this
	//If subAmmo != null, ammo is to use submunition reload system
	/** The ammo type(s) that can be loaded into this item */
	public String[] subAmmo;
	
	
	@SideOnly(Side.CLIENT)
	public transient ModelAmmo model;

	@Override
	public void loadExtraValues()
	{
		if(FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT)
		{
			reloadModel();
		}
	}
	
	@Override
	public void reloadModel()
	{
		model = ModularWarfare.PROXY.loadModel(modelName, internalName, ModelAmmo.class);
	}
	
	@Override
	public boolean hasModel()
	{
		return model != null;
	}
	
}
