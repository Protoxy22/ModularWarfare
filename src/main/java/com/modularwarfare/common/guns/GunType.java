package com.modularwarfare.common.guns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.mwp.akm;
import com.modularwarfare.common.network.PacketPlaySound;
import com.modularwarfare.common.type.BaseType;
import com.modularwarfare.objects.SoundEntry;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GunType extends BaseType {
	
	/** Weapon Classification for later use with default animations etc */
	public WeaponType weaponType;
	
	//Munition variables
	/** Damage inflicted per bullet. Multiplied by the bullet damage value. */
	public float gunDamage = 0;
	/** Weapon block range */
	public int weaponMaxRange = 100;
	/** Weapon effective max block range */
	public int weaponEffectiveRange = 50;
	/** The number of bullet entities created by each shot */
	public int numBullets = 1;
	/** The speed of bullets upon leaving this gun */
	public float bulletSpeed = 5.0F;
	/** The amount that bullets spread out when fired from this gun */
	public float bulletSpread;
	/** The fire rate of the gun in RPM, 1200 = MAX */
	public int roundsPerMin = 1;
	/** For when RPM is converted to ticks - Do not use */
	public transient int fireTickDelay = 0;
	/** The number of bullets to fire per burst in burst mode */
	public int numBurstRounds = 3;
	/** For one shot items like a panzerfaust */
	public boolean consumeGunUponUse = false;
	
	//Recoil Variables
	/** Base value for Upwards cursor/view recoil */
	public float recoilPitch = 10.0F;
	/** Base value for Left/Right cursor/view recoil */
	public float recoilYaw = 1.0F;
	/** Modifier for setting the maximum pitch divergence when randomizing recoil (Recoil 2 + rndRecoil 0.5 == 1.5-2.5 Recoil range) */
	public float randomRecoilPitch = 0.5F;
	/** Modifier for setting the maximum yaw divergence when randomizing recoil (Recoil 2 + rndRecoil 0.5 == 1.5-2.5 Recoil range) */
	public float randomRecoilYaw = 0.5F;
	
	/** The firing modes of the gun. SEMI, FULL, BURST */
	public WeaponFireMode[] fireModes = new WeaponFireMode[] {WeaponFireMode.SEMI};
	
	/** Attachment Types */
	public HashMap<AttachmentEnum, ArrayList<String>> acceptedAttachments = new HashMap<AttachmentEnum, ArrayList<String>>();
	
	// Reload Variables
	/** The time (in ticks) it takes to reload this gun */
	public int reloadTime = 60;
	/** The time (in ticks) it takes to offhand reload this gun */
	public Integer offhandReloadTime;
	
	// Shared Ammo/Bullet Variables
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
	
	// Ammo Variables
	/** Ammo types which can be used in the gun */
	public String[] acceptedAmmo;
	/** If true && != null, ammo model will be set by ammo type used. Used built-in ammo model by default */
	public boolean dynamicAmmo = false;
	
	// Bullet Variables
	public Integer internalAmmoStorage;
	public String[] acceptedBullets;
	
	// Misc Settings
	public boolean allowSprintFiring = false;
	public boolean allowDefaultSounds = true;
	
	//Sound Variables
	private SoundEntry[] weaponSounds;
	public HashMap<WeaponSoundType, ArrayList<SoundEntry>> weaponSoundMap;
	
	@Override
	public void loadExtraValues()
	{
		if(maxStackSize == null)
			maxStackSize = 1;
		
		loadBaseValues();
		fireTickDelay = 1200 / roundsPerMin;
		
		weaponSoundMap = new HashMap<WeaponSoundType, ArrayList<SoundEntry>>();
		if(weaponSounds != null)
		{
			for(SoundEntry soundEntry : weaponSounds)
			{
				WeaponSoundType weaponSoundType = soundEntry.soundEvent;
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
	}
	
	@Override
	public void reloadModel()
	{
		model = ModularWarfare.PROXY.loadModel(modelName != null ? modelName : internalName, internalName, ModelGun.class);
	}
	
	public void playSound(EntityPlayer entityPlayer, WeaponSoundType weaponSoundType, ItemStack gunStack)
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
							//Send sound packet for guns using advanced audio settings
							float customPitch = ((random.nextFloat() / soundEntry.soundRandomPitch) + soundEntry.soundPitch);
							float test = ItemGun.getMagazineBullets(gunStack) <= 5 ? 0.30f - (0.05f * ItemGun.getMagazineBullets(gunStack)) : 0f;
							System.out.println(test);
							customPitch += test;
							ModularWarfare.NETWORK.sendTo(new PacketPlaySound(originPos, soundName, volume, customPitch), (EntityPlayerMP) hearingPlayer);
						}
					} else 
					{
						for(EntityPlayer hearingPlayer : world.getEntities(EntityPlayer.class, e -> e.getPosition().getDistance(originPos.getX(), originPos.getY(), originPos.getZ()) <= soundRange))
						{
							//Send sound packet for simple sounds (no distant sound effect)
							ModularWarfare.NETWORK.sendTo(new PacketPlaySound(originPos, soundEntry.soundName, (soundRange / 16) * soundEntry.soundVolumeMultiplier, (random.nextFloat() / soundEntry.soundRandomPitch) + soundEntry.soundPitch), (EntityPlayerMP) hearingPlayer);
						}
					}
				}
			} else
			{
				if(allowDefaultSounds && weaponSoundType.defaultSound != null)
				{
					BlockPos originPos = entityPlayer.getPosition();
					World world = entityPlayer.world;
					Random random = new Random();
					
					String soundName = weaponSoundType.defaultSound;
					float soundRange = weaponSoundType.defaultRange;
					
					for(EntityPlayer hearingPlayer : world.getEntities(EntityPlayer.class, e -> e.getPosition().getDistance(originPos.getX(), originPos.getY(), originPos.getZ()) <= soundRange))
					{
						//Send sound packet for simple sounds (no distant sound effect)
						ModularWarfare.NETWORK.sendTo(new PacketPlaySound(originPos, soundName, (soundRange / 16) * 1f, (random.nextFloat() / 5) + 1), (EntityPlayerMP) hearingPlayer);
					}					
				}
			}
		}
	}
	
	public boolean hasFireMode(WeaponFireMode fireMode)
	{
		if(fireModes != null)
		{
			for(int i = 0; i < fireModes.length; i++)
			{
				if(fireModes[i] == fireMode)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public static WeaponFireMode getFireMode(ItemStack heldStack)
	{
		if(heldStack.getTagCompound() != null)
		{
			NBTTagCompound nbtTagCompound = heldStack.getTagCompound();
			return nbtTagCompound.hasKey("firemode") ? WeaponFireMode.fromString(nbtTagCompound.getString("firemode")) : null;
		}	
		return null;
	}
	
	public static void setFireMode(ItemStack heldStack, WeaponFireMode fireMode)
	{
		if(heldStack.getTagCompound() != null)
		{
			NBTTagCompound nbtTagCompound = heldStack.getTagCompound();
			nbtTagCompound.setString("firemode", fireMode.name().toLowerCase());
			heldStack.setTagCompound(nbtTagCompound);
		}	
	}
	
	public static ItemStack getAttachment(ItemStack heldStack, AttachmentEnum type)
	{
		if(heldStack.getTagCompound() != null)
		{
			NBTTagCompound nbtTagCompound = heldStack.getTagCompound();
			return nbtTagCompound.hasKey("attachment_" + type.typeName) ? new ItemStack(nbtTagCompound.getCompoundTag("attachment_" + type.typeName)) : null;
		}
		return null;
	}
	
	public static void addAttachment(ItemStack heldStack, AttachmentEnum type, ItemStack attachment)
	{
		if(heldStack.getTagCompound() != null)
		{
			NBTTagCompound nbtTagCompound = heldStack.getTagCompound();
			nbtTagCompound.setTag("attachment_" + type.typeName, attachment.writeToNBT(new NBTTagCompound()));
		}
	}
	
	@Override
	public String getAssetDir()
	{
		return "guns";
	}
		
}