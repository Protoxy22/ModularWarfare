package com.modularwarfare.common.network;

import com.modularwarfare.api.WeaponReloadEvent;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemAmmo;
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
		if(entityPlayer.getHeldItemMainhand() != null && entityPlayer.getHeldItemMainhand().getItem() instanceof ItemGun)
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
					ammoStackToLoad.setCount(ammoStackToLoad.getCount()-1);
					
					if(multiMagReload && multiMagToLoad != null)
						loadingItemStack.getTagCompound().setInteger("magcount", multiMagToLoad);
					
					nbtTagCompound.setTag("ammo", loadingItemStack.writeToNBT(new NBTTagCompound()));
					
					if(offhandedReload)
						inventory.offHandInventory.set(0, ammoStackToLoad.getCount() > 1 ? ammoStackToLoad : ItemStack.EMPTY);
					else
						inventory.setInventorySlotContents(ammoStackSlotToLoad, ammoStackToLoad.getCount() > 1 ? ammoStackToLoad : ItemStack.EMPTY);					
				}
				
				/** Post Reload */
				WeaponReloadEvent.Post postReloadEvent = new WeaponReloadEvent.Post(entityPlayer, gunStack, itemGun, offhandedReload, multiMagReload, loadOnly, preReloadEvent.getReloadTime());
				MinecraftForge.EVENT_BUS.post(postReloadEvent);
				
				gunType.playSound(entityPlayer, WeaponSoundType.Reload);
				ServerTickHandler.playerReloadCooldown.put(entityPlayer.getUniqueID(), preReloadEvent.getReloadTime());
			} else
			{
				unloadAmmo(entityPlayer, gunStack);
			}
		}
	}
	
	public void unloadAmmo(EntityPlayerMP entityPlayer, ItemStack gunStack)
	{
		NBTTagCompound nbtTagCompound = gunStack.getTagCompound();	
		if(ItemGun.hasAmmoLoaded(gunStack))
		{
			ItemStack returningAmmo = new ItemStack(nbtTagCompound.getCompoundTag("ammo"));
			ItemAmmo returningAmmoItem = (ItemAmmo) returningAmmo.getItem();
			entityPlayer.inventory.addItemStackToInventory(returningAmmo);
			nbtTagCompound.removeTag("ammo");
		}
	}

	@Override
	public void handleClientSide(EntityPlayer entityPlayer) {
		// UNUSED
	}

}