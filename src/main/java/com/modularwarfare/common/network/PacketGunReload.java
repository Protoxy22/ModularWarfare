package com.modularwarfare.common.network;

import java.util.HashMap;

import com.modularwarfare.api.WeaponReloadEvent;
import com.modularwarfare.common.guns.AmmoType;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemAmmo;
import com.modularwarfare.common.guns.ItemBullet;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.common.guns.WeaponSoundType;
import com.modularwarfare.common.handler.ServerTickHandler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.MinecraftForge;

public class PacketGunReload extends PacketBase {
	
	public boolean unload = false;
	
	public PacketGunReload() {}
	
	public PacketGunReload(boolean unload) {
		this.unload = unload;
	}
		
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		data.writeBoolean(unload);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		unload = data.readBoolean();
	}

	@Override
	public void handleServerSide(EntityPlayerMP entityPlayer) {
		if(entityPlayer.getHeldItemMainhand() != null)
		{
			if(entityPlayer.getHeldItemMainhand().getItem() instanceof ItemGun)
			{
				handleGunReload(entityPlayer);
			} else if(entityPlayer.getHeldItemMainhand().getItem() instanceof ItemAmmo)
			{
				handleAmmoReload(entityPlayer);
			}
		}
	}
	
	public void handleAmmoReload(EntityPlayerMP entityPlayer)
	{
		ItemStack ammoStack = entityPlayer.getHeldItemMainhand();
		ItemAmmo itemAmmo = (ItemAmmo) entityPlayer.getHeldItemMainhand().getItem();
		AmmoType ammoType = itemAmmo.type;
		InventoryPlayer inventory = entityPlayer.inventory;
		
		if(ServerTickHandler.playerReloadCooldown.containsKey(entityPlayer.getUniqueID()))
			return;
		
		if(ammoType.subAmmo != null)
		{
			if(!unload)
			{
				NBTTagCompound nbtTagCompound = ammoStack.getTagCompound();
				boolean offhandedReload = false;
				int highestBulletCount = 0;
				ItemStack bulletStackToLoad = null;
				Integer bulletStackSlotToLoad = null;
				
				/** Offhand Reload */
				if(inventory.offHandInventory.get(0) != ItemStack.EMPTY)
				{
					ItemStack itemStack = inventory.offHandInventory.get(0);
					if(itemStack != null && itemStack.getItem() instanceof ItemBullet)
					{
						ItemBullet itemBullet = (ItemBullet) itemStack.getItem();
						for(String ammoName : ammoType.subAmmo)
						{
							if(ammoName.equalsIgnoreCase(itemBullet.baseType.internalName))
							{
								offhandedReload = true;
								bulletStackToLoad = itemStack;
								break;
							}
						}
					}
				}
				
				/** Search for bullets */
				if(!offhandedReload)
				{
					for(int i = 0; i < inventory.getSizeInventory(); i++)
					{
						ItemStack itemStack = inventory.getStackInSlot(i);
						if(itemStack != null && itemStack.getItem() instanceof ItemBullet)
						{
							ItemBullet itemBullet = (ItemBullet) itemStack.getItem();
							for(String bulletName : ammoType.subAmmo)
							{
								if(bulletName.equalsIgnoreCase(itemBullet.baseType.internalName))
								{
									int count = itemStack.getCount();
									if(count > highestBulletCount)
									{
										bulletStackToLoad = itemStack;
										highestBulletCount = count;
										bulletStackSlotToLoad = i;	
									}
								}
							}
						}
					}
				}
								
				/** End of search, start to reload */
				if(bulletStackToLoad == null)
					return;
				
				ItemBullet bulletItemToLoad = (ItemBullet) bulletStackToLoad.getItem();
				
				if(nbtTagCompound.hasKey("bullet"))
				{
					ItemStack currentBullet = new ItemStack(nbtTagCompound.getCompoundTag("bullet"));
					ItemBullet currentBulletItem = (ItemBullet) currentBullet.getItem();
					if(!currentBulletItem.baseType.internalName.equalsIgnoreCase(bulletItemToLoad.baseType.internalName)) 
						unloadBullets(entityPlayer, ammoStack);
				}
				
				ItemStack loadingItemStack = bulletStackToLoad.copy();
				int reserve = bulletStackToLoad.getCount();

				if(!nbtTagCompound.hasKey("magcount"))
				{
					int ammoCount = ammoStack.getTagCompound().getInteger("ammocount");
					int amountToLoad = ammoType.ammoCapacity - ammoCount;
					int loadingCount;
					if(amountToLoad >= loadingItemStack.getCount()) {
						loadingCount = loadingItemStack.getCount();
						reserve = 0;
					} else 
					{
						loadingCount = amountToLoad;
						reserve = loadingItemStack.getCount() - loadingCount;
					}
					ammoStack.getTagCompound().setInteger("ammocount", ammoCount + loadingCount);
				} else
				{
					for(int i = 1; i < ammoType.magazineCount + 1; i++)
					{
						int ammoCount = ammoStack.getTagCompound().getInteger("ammocount" + i);
						if(ammoCount < ammoType.ammoCapacity)
						{
							int amountToLoad = ammoType.ammoCapacity - ammoCount;
							int loadingCount;
							if(amountToLoad >= reserve) {
								loadingCount = reserve;
								reserve = 0;
							} else 
							{
								loadingCount = amountToLoad;
								reserve = reserve - loadingCount;
							}
							ammoStack.getTagCompound().setInteger("ammocount" + i, ammoCount + loadingCount);
							if(reserve == 0)
								break;
						}
					}
				}
				
				ammoStack.getTagCompound().setTag("bullet", loadingItemStack.writeToNBT(new NBTTagCompound()));
				bulletStackToLoad.setCount(reserve);
				
				if(!entityPlayer.capabilities.isCreativeMode)
				{
					if(offhandedReload)
						inventory.offHandInventory.set(0, reserve >= 1 ? bulletStackToLoad : ItemStack.EMPTY);
					else
						inventory.setInventorySlotContents(bulletStackSlotToLoad, reserve >= 1 ? bulletStackToLoad : ItemStack.EMPTY);
				}
			} else
			{
				unloadBullets(entityPlayer, ammoStack);
			}
		}
	}
	
	public void handleGunReload(EntityPlayerMP entityPlayer)
	{
		ItemStack gunStack = entityPlayer.getHeldItemMainhand();
		ItemGun itemGun = (ItemGun) entityPlayer.getHeldItemMainhand().getItem();
		GunType gunType = itemGun.type;
		InventoryPlayer inventory = entityPlayer.inventory;
		
		if(ServerTickHandler.playerReloadCooldown.containsKey(entityPlayer.getUniqueID()))
			return;
					
		if(!unload)
		{				
			NBTTagCompound nbtTagCompound = gunStack.getTagCompound();
			boolean hasAmmoLoaded = ItemGun.hasAmmoLoaded(gunStack);
			boolean offhandedReload = false;
			ItemStack ammoStackToLoad = null;
			Integer ammoStackSlotToLoad = null;
			Integer highestAmmoCount = 0;
			Integer multiMagToLoad = null;
							
			/** Offhand Reload */
			if(inventory.offHandInventory.get(0) != ItemStack.EMPTY)
			{
				ItemStack itemStack = inventory.offHandInventory.get(0);
				if(itemStack != null && itemStack.getItem() instanceof ItemAmmo)
				{
					ItemAmmo itemAmmo = (ItemAmmo) itemStack.getItem();
					for(String ammoName : gunType.acceptedAmmo)
					{
						if(ammoName.equalsIgnoreCase(itemAmmo.baseType.internalName))
						{
							offhandedReload = true;
							ammoStackToLoad = itemStack;
							break;
						}
					}
				}
			}
			
			/** Compounded Magazines */
			if(hasAmmoLoaded)
			{
				ItemStack currentAmmoStack = new ItemStack(nbtTagCompound.getCompoundTag("ammo"));
				ItemAmmo currentAmmoItem = (ItemAmmo) currentAmmoStack.getItem();
				NBTTagCompound currentAmmoTag = currentAmmoStack.getTagCompound();
				
				if(currentAmmoTag.hasKey("magcount"))
				{
					Integer selectedMagazine = null;
					int highestAmmo = -1;
					
					for(int j = 1; j < currentAmmoItem.type.magazineCount+1; j++)
					{
						int ammoCount = currentAmmoTag.getInteger("ammocount" + j);
						if(ammoCount > highestAmmo)
						{
							selectedMagazine = j;
							highestAmmo = ammoCount;
						}
					}

					if(selectedMagazine != null)
					{
						currentAmmoTag.setInteger("magcount", selectedMagazine);
						ammoStackToLoad = currentAmmoStack;
						highestAmmoCount = highestAmmo;
					}
				}
			}
			
			/** Scan inventory  */
			if(!offhandedReload)
			{
				for(int i = 0; i < inventory.getSizeInventory(); i++)
				{
					ItemStack itemStack = inventory.getStackInSlot(i);
					if(itemStack != null && itemStack.getItem() instanceof ItemAmmo)
					{
						ItemAmmo itemAmmo = (ItemAmmo) itemStack.getItem();
						for(String ammoName : gunType.acceptedAmmo)
						{
							if(ammoName.equalsIgnoreCase(itemAmmo.baseType.internalName))
							{
								if(itemAmmo.type.magazineCount != null)
								{
									for(int j = 1; j < itemAmmo.type.magazineCount+1; j++)
									{
										int ammoCount = itemStack.getTagCompound().getInteger("ammocount" + j);
										if(ammoCount > highestAmmoCount)
										{
											ammoStackToLoad = itemStack;
											ammoStackSlotToLoad = i;
											highestAmmoCount = ammoCount;
											multiMagToLoad = j;
										}
									}
								} else
								{
									int ammoCount = itemStack.getTagCompound().getInteger("ammocount");
									if(ammoCount > highestAmmoCount)
									{
										ammoStackToLoad = itemStack;
										highestAmmoCount = ammoCount;
										ammoStackSlotToLoad = i;	
									}
								}
							}
						}
					}
				}
			}
							
			/** End of search, start to reload */
			if(ammoStackToLoad == null)
				return;
			
			/** If not a multi mag ammo set to null if one was spotted */
			if(!ammoStackToLoad.getTagCompound().hasKey("magcount"))
				multiMagToLoad = null;
							
			/** Weapon Pre-Reload event */
			boolean multiMagReload = hasAmmoLoaded && ammoStackToLoad.getTagCompound().hasKey("magcount");
			boolean loadOnly = false;
			WeaponReloadEvent.Pre preReloadEvent = new WeaponReloadEvent.Pre(entityPlayer, gunStack, itemGun, offhandedReload, multiMagReload);
			MinecraftForge.EVENT_BUS.post(preReloadEvent);
			if(preReloadEvent.isCanceled())
				return;
							
			/** Unload old ammo stack */
			if(!multiMagReload || multiMagToLoad != null) {
				if(ItemGun.hasAmmoLoaded(gunStack)) {
					unloadAmmo(entityPlayer, gunStack);
				} else
				{
					loadOnly = true;
				}
			}
			
			/** Loading of new ammo stack */
			if(multiMagReload & hasAmmoLoaded & multiMagToLoad == null)
			{
				
			} else
			{
				ItemStack loadingItemStack = ammoStackToLoad.copy();
				loadingItemStack.setCount(1);
				
				if(multiMagReload && multiMagToLoad != null)
					loadingItemStack.getTagCompound().setInteger("magcount", multiMagToLoad);
				
				nbtTagCompound.setTag("ammo", loadingItemStack.writeToNBT(new NBTTagCompound()));
				
				ammoStackToLoad.setCount(ammoStackToLoad.getCount()-1);
				
				if(!entityPlayer.capabilities.isCreativeMode)
				{
					if(offhandedReload)
						inventory.offHandInventory.set(0, ammoStackToLoad.getCount() >= 1 ? ammoStackToLoad : ItemStack.EMPTY);
					else
						inventory.setInventorySlotContents(ammoStackSlotToLoad, ammoStackToLoad.getCount() >= 1 ? ammoStackToLoad : ItemStack.EMPTY);
				}
			}
			
			/** Post Reload */
			WeaponReloadEvent.Post postReloadEvent = new WeaponReloadEvent.Post(entityPlayer, gunStack, itemGun, offhandedReload, multiMagReload, loadOnly, false, preReloadEvent.getReloadTime());
			MinecraftForge.EVENT_BUS.post(postReloadEvent);
			
			if(postReloadEvent.isLoadOnly())
				gunType.playSound(entityPlayer, WeaponSoundType.Load);				
			else if(!postReloadEvent.isLoadOnly() && !postReloadEvent.isUnload())
				gunType.playSound(entityPlayer, WeaponSoundType.Unload);

			ServerTickHandler.playerReloadCooldown.put(entityPlayer.getUniqueID(), preReloadEvent.getReloadTime());
		} else
		{
			WeaponReloadEvent.Pre preReloadEvent = new WeaponReloadEvent.Pre(entityPlayer, gunStack, itemGun, false, false);
			MinecraftForge.EVENT_BUS.post(preReloadEvent);
			if(preReloadEvent.isCanceled())
				return;
			
			if(unloadAmmo(entityPlayer, gunStack))
			{
				WeaponReloadEvent.Post postReloadEvent = new WeaponReloadEvent.Post(entityPlayer, gunStack, itemGun, false, false, false, true, preReloadEvent.getReloadTime());
				MinecraftForge.EVENT_BUS.post(postReloadEvent);
				
				if(postReloadEvent.isUnload())
					gunType.playSound(entityPlayer, WeaponSoundType.Unload);
			}
		}
	}
	
	public boolean unloadAmmo(EntityPlayerMP entityPlayer, ItemStack gunStack)
	{
		NBTTagCompound nbtTagCompound = gunStack.getTagCompound();	
		if(ItemGun.hasAmmoLoaded(gunStack))
		{
			ItemStack returningAmmo = new ItemStack(nbtTagCompound.getCompoundTag("ammo"));
			ItemAmmo returningAmmoItem = (ItemAmmo) returningAmmo.getItem();
			if(returningAmmoItem.type.subAmmo != null || ItemAmmo.hasAmmo(returningAmmo) || returningAmmoItem.type.allowEmptyMagazines)
			{
				entityPlayer.inventory.addItemStackToInventory(returningAmmo);
			}
			nbtTagCompound.removeTag("ammo");
			return true;
		}
		return false;
	}
	
	public boolean unloadBullets(EntityPlayerMP entityPlayer, ItemStack ammoStack)
	{
		NBTTagCompound nbtTagCompound = ammoStack.getTagCompound();
		if(nbtTagCompound.hasKey("bullet"))
		{
			ItemStack returningBullet = new ItemStack(nbtTagCompound.getCompoundTag("bullet"));
			AmmoType ammoType = ((ItemAmmo)ammoStack.getItem()).type;
			int bulletsToUnload = 0;
			
			if(!nbtTagCompound.hasKey("magcount"))
			{
				bulletsToUnload = ammoStack.getTagCompound().getInteger("ammocount");
				nbtTagCompound.setInteger("ammocount", 0);
			} else
			{
				for(int i = 1; i < ammoType.magazineCount + 1; i++)
				{
					bulletsToUnload += nbtTagCompound.getInteger("ammocount" + i);
					nbtTagCompound.setInteger("ammocount" + i, 0);
				}
			}
			
			while(bulletsToUnload > 0)
			{
				if(bulletsToUnload <= 64)
				{
					ItemStack clonedBullet = returningBullet;
					clonedBullet.setCount(bulletsToUnload);
					entityPlayer.inventory.addItemStackToInventory(clonedBullet);
					bulletsToUnload -= bulletsToUnload;
				} else {
					ItemStack clonedBullet = returningBullet;
					clonedBullet.setCount(64);
					entityPlayer.inventory.addItemStackToInventory(clonedBullet);
					bulletsToUnload -= 64;
				}
			}
			
			nbtTagCompound.removeTag("bullet");
			return true;
		}
		return false;
	}

	@Override
	public void handleClientSide(EntityPlayer entityPlayer) {
		// UNUSED
	}

}