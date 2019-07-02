package com.modularwarfare.common.network;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.common.guns.*;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.ByteBufUtils;

public class PacketGunFastReload extends PacketBase {

	public boolean unload = false;
	public String weapon;
	public int slot;

	public PacketGunFastReload() {
	}

	public PacketGunFastReload(Boolean unload, String weapon, int slot) {
		this.unload = unload;
		this.weapon = weapon;
		this.slot = slot;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		data.writeBoolean(unload);
		ByteBufUtils.writeUTF8String(data, weapon);
		data.writeInt(slot);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		unload = data.readBoolean();
		weapon = ByteBufUtils.readUTF8String(data);
		slot = data.readInt();
	}

	@Override
	public void handleServerSide(EntityPlayerMP entityPlayer) {
		ItemStack gunStack = new ItemStack(ModularWarfare.gunTypes.get(weapon));

		if(gunStack.getItem() instanceof ItemGun){
			ItemGun itemGun = (ItemGun) gunStack.getItem();
			GunType gunType = itemGun.type;

			if (gunStack.getTagCompound() == null) {
				NBTTagCompound nbtTagCompound = new NBTTagCompound();
				nbtTagCompound.setString("firemode", gunType.fireModes[0].name().toLowerCase());
				nbtTagCompound.setInteger("skinId", 0);
				gunStack.setTagCompound(nbtTagCompound);
			}

			InventoryPlayer inventory = entityPlayer.inventory;

			if (gunType.acceptedAmmo != null)
				handleMagGunReload(entityPlayer, gunStack, itemGun, gunType, inventory);
			else
				handleBulletGunReload(entityPlayer, gunStack, itemGun, gunType, inventory);
			inventory.setInventorySlotContents(slot, gunStack);

		}
	}


	public void handleBulletGunReload(EntityPlayerMP entityPlayer, ItemStack gunStack, ItemGun itemGun, GunType gunType, InventoryPlayer inventory) {

		if (gunType.acceptedBullets != null) {
			if (!unload) {
				NBTTagCompound nbtTagCompound = gunStack.getTagCompound();
				boolean offhandedReload = false;
				int highestBulletCount = 0;
				ItemStack bulletStackToLoad = null;
				Integer bulletStackSlotToLoad = null;

				/** Offhand Reload */
				if (inventory.offHandInventory.get(0) != ItemStack.EMPTY) {
					ItemStack itemStack = inventory.offHandInventory.get(0);
					if (itemStack != null && itemStack.getItem() instanceof ItemBullet) {
						ItemBullet itemBullet = (ItemBullet) itemStack.getItem();
						for (String bulletName : gunType.acceptedBullets) {
							if (bulletName.equalsIgnoreCase(itemBullet.baseType.internalName)) {
								offhandedReload = true;
								bulletStackToLoad = itemStack;
								break;
							}
						}
					}
				}

				/** Search for bullets */
				if (!offhandedReload) {
					for (int i = 0; i < inventory.getSizeInventory(); i++) {
						ItemStack itemStack = inventory.getStackInSlot(i);
						if (itemStack != null && itemStack.getItem() instanceof ItemBullet) {
							ItemBullet itemBullet = (ItemBullet) itemStack.getItem();
							for (String bulletName : gunType.acceptedBullets) {
								if (bulletName.equalsIgnoreCase(itemBullet.baseType.internalName)) {
									int count = itemStack.getCount();
									if (count > highestBulletCount) {
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
				if (bulletStackToLoad == null)
					return;

				boolean loadOnly = false;

				ItemBullet bulletItemToLoad = (ItemBullet) bulletStackToLoad.getItem();

				if (nbtTagCompound.hasKey("bullet")) {
					ItemStack currentBullet = new ItemStack(nbtTagCompound.getCompoundTag("bullet"));
					ItemBullet currentBulletItem = (ItemBullet) currentBullet.getItem();
					if (!currentBulletItem.baseType.internalName.equalsIgnoreCase(bulletItemToLoad.baseType.internalName))
						unloadBullets(entityPlayer, gunStack);
				} else {
					loadOnly = true;
				}

				ItemStack loadingItemStack = bulletStackToLoad.copy();
				int reserve = bulletStackToLoad.getCount();
				int ammoCount = gunStack.getTagCompound().getInteger("ammocount");
				int amountToLoad = gunType.internalAmmoStorage - ammoCount;
				int loadingCount;
				if (amountToLoad >= loadingItemStack.getCount()) {
					loadingCount = loadingItemStack.getCount();
					reserve = 0;
				} else {
					loadingCount = amountToLoad;
					reserve = loadingItemStack.getCount() - loadingCount;
				}
				gunStack.getTagCompound().setInteger("ammocount", ammoCount + loadingCount);
				gunStack.getTagCompound().setTag("bullet", loadingItemStack.writeToNBT(new NBTTagCompound()));
				bulletStackToLoad.setCount(reserve);

				if (!entityPlayer.capabilities.isCreativeMode) {
					if (offhandedReload)
						inventory.offHandInventory.set(0, reserve >= 1 ? bulletStackToLoad : ItemStack.EMPTY);
					else
						inventory.setInventorySlotContents(bulletStackSlotToLoad, reserve >= 1 ? bulletStackToLoad : ItemStack.EMPTY);
				}

			}
		}
	}
	
	public void handleMagGunReload(EntityPlayerMP entityPlayer, ItemStack gunStack, ItemGun itemGun, GunType gunType, InventoryPlayer inventory) {

		if (!unload) {
			NBTTagCompound nbtTagCompound = gunStack.getTagCompound();
			boolean hasAmmoLoaded = ItemGun.hasAmmoLoaded(gunStack);
			boolean offhandedReload = false;
			ItemStack ammoStackToLoad = null;
			Integer ammoStackSlotToLoad = null;
			Integer highestAmmoCount = 0;
			Integer multiMagToLoad = null;

			/** Offhand Reload */
			if (inventory.offHandInventory.get(0) != ItemStack.EMPTY) {
				ItemStack itemStack = inventory.offHandInventory.get(0);
				if (itemStack != null && itemStack.getItem() instanceof ItemAmmo) {
					ItemAmmo itemAmmo = (ItemAmmo) itemStack.getItem();
					for (String ammoName : gunType.acceptedAmmo) {
						if (ammoName.equalsIgnoreCase(itemAmmo.baseType.internalName)) {
							offhandedReload = true;
							ammoStackToLoad = itemStack;
							break;
						}
					}
				}
			}

			/** Compounded Magazines */
			if (hasAmmoLoaded) {
				ItemStack currentAmmoStack = new ItemStack(nbtTagCompound.getCompoundTag("ammo"));
				ItemAmmo currentAmmoItem = (ItemAmmo) currentAmmoStack.getItem();
				NBTTagCompound currentAmmoTag = currentAmmoStack.getTagCompound();

				if (currentAmmoTag.hasKey("magcount")) {
					Integer selectedMagazine = null;
					int highestAmmo = -1;

					for (int j = 1; j < currentAmmoItem.type.magazineCount + 1; j++) {
						int ammoCount = currentAmmoTag.getInteger("ammocount" + j);
						if (ammoCount > highestAmmo) {
							selectedMagazine = j;
							highestAmmo = ammoCount;
						}
					}

					if (selectedMagazine != null) {
						currentAmmoTag.setInteger("magcount", selectedMagazine);
						ammoStackToLoad = currentAmmoStack;
						highestAmmoCount = highestAmmo;
					}
				}
			}

			/** Scan inventory  */
			if (!offhandedReload) {
				for (int i = 0; i < inventory.getSizeInventory(); i++) {
					ItemStack itemStack = inventory.getStackInSlot(i);
					if (itemStack != null && itemStack.getItem() instanceof ItemAmmo) {
						ItemAmmo itemAmmo = (ItemAmmo) itemStack.getItem();
						for (String ammoName : gunType.acceptedAmmo) {
							if (ammoName.equalsIgnoreCase(itemAmmo.baseType.internalName)) {
								if (itemAmmo.type.magazineCount != null) {
									for (int j = 1; j < itemAmmo.type.magazineCount + 1; j++) {
										int ammoCount = itemStack.getTagCompound().getInteger("ammocount" + j);
										if (ammoCount > highestAmmoCount) {
											ammoStackToLoad = itemStack;
											ammoStackSlotToLoad = i;
											highestAmmoCount = ammoCount;
											multiMagToLoad = j;
										}
									}
								} else {
									int ammoCount = itemStack.getTagCompound().getInteger("ammocount");
									if (ammoCount > highestAmmoCount) {
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
			if (ammoStackToLoad == null)
				return;

			/** If not a multi mag ammo set to null if one was spotted */
			if (!ammoStackToLoad.getTagCompound().hasKey("magcount"))
				multiMagToLoad = null;

			/** Weapon Pre-Reload event */
			boolean multiMagReload = hasAmmoLoaded && ammoStackToLoad.getTagCompound().hasKey("magcount");
			boolean loadOnly = false;


			/** Unload old ammo stack */
			if (!multiMagReload || multiMagToLoad != null) {
				if (ItemGun.hasAmmoLoaded(gunStack)) {
					unloadAmmo(entityPlayer, gunStack);
				} else {
					loadOnly = true;
				}
			}

			/** Loading of new ammo stack */
			if (multiMagReload & hasAmmoLoaded & multiMagToLoad == null) {

			} else {
				ItemStack loadingItemStack = ammoStackToLoad.copy();
				loadingItemStack.setCount(1);

				if (multiMagReload && multiMagToLoad != null)
					loadingItemStack.getTagCompound().setInteger("magcount", multiMagToLoad);


				nbtTagCompound.setTag("ammo", loadingItemStack.writeToNBT(new NBTTagCompound()));

				ammoStackToLoad.setCount(ammoStackToLoad.getCount() - 1);

				if (!entityPlayer.capabilities.isCreativeMode) {
					if (offhandedReload)
						inventory.offHandInventory.set(0, ammoStackToLoad.getCount() >= 1 ? ammoStackToLoad : ItemStack.EMPTY);
					else
						inventory.setInventorySlotContents(ammoStackSlotToLoad, ammoStackToLoad.getCount() >= 1 ? ammoStackToLoad : ItemStack.EMPTY);
				}
			}
		}
	}
	
	public boolean unloadAmmo(EntityPlayerMP entityPlayer, ItemStack gunStack) {
		NBTTagCompound nbtTagCompound = gunStack.getTagCompound();
		if(ItemGun.hasAmmoLoaded(gunStack)) {
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
	
	public Integer unloadBullets(EntityPlayerMP entityPlayer, ItemStack targetStack)
	{
		NBTTagCompound nbtTagCompound = targetStack.getTagCompound();
		//boolean isAmmo = targetStack.getItem() instanceof ItemAmmo;
		
		if(nbtTagCompound.hasKey("bullet"))
		{
			ItemStack returningBullet = new ItemStack(nbtTagCompound.getCompoundTag("bullet"));
			int bulletsToUnload = 0;
			
			if(!nbtTagCompound.hasKey("magcount"))
			{
				bulletsToUnload = targetStack.getTagCompound().getInteger("ammocount");
				nbtTagCompound.setInteger("ammocount", 0);
			} else
			{
				AmmoType ammoType = ((ItemAmmo)targetStack.getItem()).type;
				for(int i = 1; i < ammoType.magazineCount + 1; i++)
				{
					bulletsToUnload += nbtTagCompound.getInteger("ammocount" + i);
					nbtTagCompound.setInteger("ammocount" + i, 0);
				}
			}
			
			int animBulletsToReload = bulletsToUnload;
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
			return animBulletsToReload;
		}
		return null;
	}

	@Override
	public void handleClientSide(EntityPlayer entityPlayer) {
		// UNUSED
	}

}