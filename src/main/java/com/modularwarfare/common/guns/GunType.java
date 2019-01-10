package com.modularwarfare.common.guns;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.common.type.BaseType;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GunType extends BaseType {
	
	//Recoil Variables
	/** Base value for Upwards cursor/view recoil */
	public float recoilPitch = 0.0F;
	/** Base value for Left/Right cursor/view recoil */
	public float recoilYaw = 0.0F;
	/** Modifier for setting the maximum pitch divergence when randomizing recoil (Recoil 2 + rndRecoil 0.5 == 1.5-2.5 Recoil range) */
	public float rndRecoilPitchRange = 0.5F;
	/** Modifier for setting the maximum yaw divergence when randomizing recoil (Recoil 2 + rndRecoil 0.5 == 1.5-2.5 Recoil range) */
	public float rndRecoilYawRange = 0.5F;
	
	//Munition variables
	/** Damage inflicted per bullet. Multiplied by the bullet damage value. */
	public float gunDamage = 0;
	/** The number of bullet entities created by each shot */
	public int numBullets = 1;
	/** The speed of bullets upon leaving this gun */
	public float bulletSpeed = 5.0F;
	/** Ammo types which can be used in the gun */
	public String[] acceptedAmmo;
	/** # of items to load - used for guns with internal storage / singular ammo items such as shotguns */
	public int numPrimaryAmmoItems = 1;
	/** The time (in ticks) it takes to reload this gun */
	public int reloadTime;
	/** The amount that bullets spread out when fired from this gun */
	public float bulletSpread;
	/** The fire rate of the gun in RPM, 1200 = MAX */
	public int roundsPerMin = 0;
	/** The number of bullets to fire per burst in burst mode */
	public int numBurstRounds = 3;
	/** For one shot items like a panzerfaust */
	public boolean consumeGunUponUse = false;
	
	/** The firing modes of the gun. SEMI, FULL, BURST */
	//TODO; Deltric
	public String[] fireMode;
	
	//Ammo Override variables
	/** If true, numBullets determined by loaded ammo type */
	public boolean ammoNumBullets = false;
	/** If true, spread is determined by loaded ammo type */
	public boolean ammoBulletSpread = false;
	/** If true, reload time is determined by loaded ammo type */
	public boolean ammoReloadTime = false;
	/** If true, recoil pitch is determined by loaded ammo type */
	public float ammoRecoilPitch = 0.0F;
	/** If true, recoil yaw is determined by loaded ammo type */
	public float ammoRecoilYaw = 0.0F;
	
	//Visual variables
	/** The model file for this gun */
	public String modelName;
	/** Weapon model skins/textures */
	public SkinType[] weaponSkins;
	
	//Sounds
	/** The sound played upon shooting */
	public String shootSound;
	/** Bullet insert reload sound */
	public String bulletInsert;
	/** The sound to play upon shooting on last round */
    public String lastShootSound;
	/** The sound played upon shooting with a suppressor */
	public String suppressedShootSound;
	/** Whether to distort the sound or not. Generally only set to false for looping sounds */
	public String reloadSound;
	/** The sound to play upon reloading when empty */
	public String reloadSoundOnEmpty;
	/** The sound to play open firing when empty(once) */
	public String clickSoundOnEmpty;
	
	//Sound Modifiers
	/** The block range for reload sounds */
	public int reloadSoundRange = 50;
	/** The block range for gunshots sounds  */
	public int gunSoundRange = 50;
	
	@SideOnly(Side.CLIENT)
	public transient ModelGun model;
	
	@Override
	public void loadExtraValues()
	{
		model = ModularWarfare.PROXY.loadModel(modelName, internalName, ModelGun.class);
	}
	
}
