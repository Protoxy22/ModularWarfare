package com.modularwarfare.common.guns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.common.network.PacketPlaySound;
import com.modularwarfare.common.type.BaseType;
import com.modularwarfare.objects.SoundEntry;
import com.modularwarfare.objects.WeaponFireMode;
import com.modularwarfare.objects.WeaponSoundType;
import com.modularwarfare.objects.WeaponType;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GunType extends BaseType {
	
	//Weapon Classification for later use with default animations etc
	//TODO Set this up
	/** enum weaponType
	 * CUSTOM, PISTOL, MP, SMG, CARBINE, RIFLE, AR, DMR, SNIPER, SHOTGUN, etc 
	 */
	public WeaponType weaponType;
	
	//Visual variables
	/** The model file for this gun */
	public String modelName;
	/** Weapon model skins/textures */
	public SkinType[] weaponSkins;
	
	//Munition variables
	/** Damage inflicted per bullet. Multiplied by the bullet damage value. */
	public float gunDamage = 0;
	/** The number of bullet entities created by each shot */
	public int numBullets = 1;
	/** The speed of bullets upon leaving this gun */
	public float bulletSpeed = 5.0F;
	/** The amount that bullets spread out when fired from this gun */
	public float bulletSpread;
	/** # of items to load - used for guns with internal storage / singular ammo items such as shotguns */
	public int numPrimaryAmmoItems = 1;
	/** The time (in ticks) it takes to reload this gun */
	public int reloadTime;
	/** The fire rate of the gun in RPM, 1200 = MAX */
	public int roundsPerMin = 1;
	/** For when RPM is converted to ticks - Do not use */
	public transient int fireTickDelay = 0;
	/** The number of bullets to fire per burst in burst mode */
	public int numBurstRounds = 3;
	/** For one shot items like a panzerfaust */
	public boolean consumeGunUponUse = false;
	/** Ammo types which can be used in the gun */
	public String[] acceptedAmmo;
	
	//Recoil Variables
	/** Base value for Upwards cursor/view recoil */
	public float recoilPitch = 0.0F;
	/** Base value for Left/Right cursor/view recoil */
	public float recoilYaw = 0.0F;
	/** Modifier for setting the maximum pitch divergence when randomizing recoil (Recoil 2 + rndRecoil 0.5 == 1.5-2.5 Recoil range) */
	public float randomRecoilPitch = 0.5F;
	/** Modifier for setting the maximum yaw divergence when randomizing recoil (Recoil 2 + rndRecoil 0.5 == 1.5-2.5 Recoil range) */
	public float randomRecoilYaw = 0.5F;
	
	/** The firing modes of the gun. SEMI, FULL, BURST */
	public WeaponFireMode[] fireModes;
	
	//Ammo Override variables
	/** If true, numBullets determined by loaded ammo type */
	public boolean ammoNumBullets = false;
	/** If true, bulletSpeed determined by loaded ammo type */
	public boolean ammoBulletSpeed = false;
	/** If true, spread is determined by loaded ammo type */
	public boolean ammoBulletSpread = false;
	/** If true, reload time is determined by loaded ammo type */
	public boolean ammoReloadTime = false;
	/** If true, recoil pitch is determined by loaded ammo type */
	public boolean ammoRecoilPitch = false;
	/** If true, recoil yaw is determined by loaded ammo type */
	public boolean ammoRecoilYaw = false;
	//Dynamic ammo models
	/** If true && != null, ammo model will be set by ammo type used. Used built-in ammo model by default */
	public boolean dynamicAmmo = false;
	
	public boolean allowSprintFiring = true;
	
	//Sound Variables
	private SoundEntry[] weaponSounds;
	public HashMap<WeaponSoundType, ArrayList<SoundEntry>> weaponSoundMap;
	
	@SideOnly(Side.CLIENT)
	public transient ModelGun model;
	
	@Override
	public void loadExtraValues()
	{
		reloadModel();
		
		fireTickDelay = 1200 / roundsPerMin;
		
		weaponSoundMap = new HashMap<WeaponSoundType, ArrayList<SoundEntry>>();
		if(weaponSounds != null)
		{
			for(SoundEntry soundEntry : weaponSounds)
			{
				WeaponSoundType weaponSoundType = WeaponSoundType.fromEventName(soundEntry.soundEvent);
				if(weaponSoundType != null)
				{
					if(soundEntry.soundName != null)
					{
						if(weaponSoundMap.containsKey(weaponSoundType))
						{
							weaponSoundMap.get(weaponSoundType).add(soundEntry);
						} else
						{
							ArrayList<SoundEntry> soundEntries = new ArrayList<>(Arrays.asList(soundEntry));
							weaponSoundMap.put(weaponSoundType, soundEntries);
						}
						ModularWarfare.PROXY.registerSound(soundEntry.soundName);
						if(soundEntry.soundNameDistant != null)
							ModularWarfare.PROXY.registerSound(soundEntry.soundNameDistant);
					} else
					{
						ModularWarfare.LOGGER.error(String.format("Sound entry event '%s' has null soundName for type '%s'", soundEntry.soundEvent, internalName));
					}
				} else
				{
					ModularWarfare.LOGGER.error(String.format("Sound event '%s' is not a valid weapon sound event for type '%s'", soundEntry.soundEvent != null ? soundEntry.soundEvent : "null", internalName));
				}
			}
		}
		
		if(weaponType != null)
		{
			ModularWarfare.LOGGER.info(weaponType.name());
		}
		
		if(fireModes != null)
		{
			for(int i = 0; i < fireModes.length; i++)
			{
				ModularWarfare.LOGGER.info(fireModes[i].name());
			}
		}
	}
	
	@Override
	public void reloadModel()
	{
		model = ModularWarfare.PROXY.loadModel(modelName, internalName, ModelGun.class);
	}
	
	@Override
	public boolean hasModel()
	{
		return model != null;
	}
	
	public void playSound(EntityPlayer entityPlayer, WeaponSoundType weaponSoundType)
	{
		if(weaponSoundType != null)
		{
			if(weaponSoundMap.containsKey(weaponSoundType))
			{
				BlockPos originPos = entityPlayer.getPosition();
				World world = entityPlayer.world;
				Random random = new Random();
				
				for(SoundEntry soundEntry : weaponSoundMap.get(weaponSoundType))
				{
					int soundRange = soundEntry.soundRange != null ? soundEntry.soundRange : weaponSoundType.defaultRange;
					if(soundEntry.soundNameDistant != null && soundEntry.soundMaxRange != null)
					{
						int maxSoundRange = soundEntry.soundMaxRange;
						for(EntityPlayer hearingPlayer : world.getEntities(EntityPlayer.class, e -> e.getPosition().getDistance(originPos.getX(), originPos.getY(), originPos.getZ()) <= maxSoundRange))
						{
							//float volume = (float) (((distance + maxSoundRange/6) / 16) * soundEntry.soundVolumeMultiplier);
							double distance = hearingPlayer.getPosition().getDistance(originPos.getX(), originPos.getY(), originPos.getZ());
							float volume = 0f;
							String soundName = "";

							if(distance > soundRange & distance <= maxSoundRange)
							{
								// For distant sound range
								soundName = soundEntry.soundNameDistant;
								volume = (float) (((distance + maxSoundRange/6) / 16) * soundEntry.soundFarVolumeMultiplier);
							} else
							{
								// For non distant
								soundName = soundEntry.soundName;
								volume = (float) (((distance + maxSoundRange/6) / 16) * soundEntry.soundVolumeMultiplier);
							}							
							ModularWarfare.NETWORK.sendTo(new PacketPlaySound(originPos, soundName, volume, (random.nextFloat() / 10) + soundEntry.soundPitch), (EntityPlayerMP) hearingPlayer);
						}
					} else 
					{
						for(EntityPlayer hearingPlayer : world.getEntities(EntityPlayer.class, e -> e.getPosition().getDistance(originPos.getX(), originPos.getY(), originPos.getZ()) <= soundRange))
						{
							ModularWarfare.NETWORK.sendTo(new PacketPlaySound(originPos, soundEntry.soundName, (soundRange / 16) * soundEntry.soundVolumeMultiplier, (random.nextFloat() / 10) + soundEntry.soundPitch), (EntityPlayerMP) hearingPlayer);
						}
					}
				}
			}
		}
	}
		
}
