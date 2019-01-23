package com.modularwarfare.common.network;

import com.modularwarfare.api.WeaponReloadEvent;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemAmmo;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.common.handler.ServerTickHandler;
import com.modularwarfare.objects.WeaponSoundType;

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
			ItemStack heldStack = entityPlayer.getHeldItemMainhand();
			ItemGun itemGun = (ItemGun) entityPlayer.getHeldItemMainhand().getItem();
			GunType gunType = itemGun.type;
			InventoryPlayer inventory = entityPlayer.inventory;
			
			if(!unload)
			{
				NBTTagCompound nbtTagCompound = heldStack.getTagCompound();	
				ItemStack bestAmmoStack = null;
				int bestAmmoCount = 0;
				int bestSlot = 0;
				boolean offhandReload = false;
				boolean multiMagReload = false;
				
				if(nbtTagCompound.hasKey("ammo"))
				{
					ItemStack ammo = new ItemStack(nbtTagCompound.getCompoundTag("ammo"));
					NBTTagCompound ammoTag = ammo.getTagCompound();
					if(ammoTag.hasKey("magcount"))
					{
						if(ammoTag.getInteger("magcount") > 1)
						{
							ItemAmmo ammoItem = (ItemAmmo) ammo.getItem();
							int magsLeft = ammoTag.getInteger("magcount") - 1;
							ammoTag.setInteger("magcount", magsLeft);
							ammoTag.setInteger("ammocount", ammoItem.type.ammoCapacity);
							ammo.setTagCompound(ammoTag);
							bestAmmoStack = ammo;
							multiMagReload = true;
						}
					}
				}
						
				if(!multiMagReload && inventory.offHandInventory.get(0) != ItemStack.EMPTY)
				{
					ItemStack itemStack = inventory.offHandInventory.get(0);
					if(itemStack != null && itemStack.getItem() instanceof ItemAmmo)
					{
						ItemAmmo itemAmmo = (ItemAmmo) itemStack.getItem();
						for(String ammoName : gunType.acceptedAmmo)
						{
							if(ammoName.equalsIgnoreCase(itemAmmo.baseType.internalName))
							{
								offhandReload = true;
								bestAmmoStack = itemStack;
							}
						}
					}
				}
				
				if(!multiMagReload && !offhandReload)
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
									if(bestAmmoStack != null)
									{
										int ammoCount = itemStack.getTagCompound().getInteger("ammocount");
										if(ammoCount > bestAmmoCount)
										{
											bestAmmoStack = itemStack;
											bestAmmoCount = ammoCount;
											bestSlot = i;	
										}
									} else
									{
										bestAmmoStack = itemStack;
										bestSlot = i;
									}
								}
							}
						}
					}
				}
				
				WeaponReloadEvent.Pre preReloadEvent = new WeaponReloadEvent.Pre(entityPlayer, heldStack, itemGun, offhandReload, multiMagReload);
				MinecraftForge.EVENT_BUS.post(preReloadEvent);
				if(preReloadEvent.isCanceled())
					return;
				
				if(nbtTagCompound.hasKey("ammo"))
				{
					ItemStack oldAmmo = new ItemStack(nbtTagCompound.getCompoundTag("ammo"));
					ItemAmmo oldAmmoItem = (ItemAmmo) oldAmmo.getItem();
					inventory.addItemStackToInventory(oldAmmo);
					nbtTagCompound.removeTag("ammo");
				}
				
				if(bestAmmoStack != null)
				{
					if(multiMagReload)
					{
						nbtTagCompound.setTag("ammo", bestAmmoStack.writeToNBT(new NBTTagCompound()));
					} else if(offhandReload)
					{
						if(bestAmmoStack.getCount() > 1)
						{
							ItemStack loadingItemStack = bestAmmoStack.copy();
							loadingItemStack.setCount(1);
							nbtTagCompound.setTag("ammo", loadingItemStack.writeToNBT(new NBTTagCompound()));
							
							bestAmmoStack.setCount(bestAmmoStack.getCount()-1);
							inventory.offHandInventory.set(bestSlot, bestAmmoStack);
						} else
						{
							nbtTagCompound.setTag("ammo", bestAmmoStack.writeToNBT(new NBTTagCompound()));
							inventory.offHandInventory.set(bestSlot, ItemStack.EMPTY);
						}
					} else
					{
						if(bestAmmoStack.getCount() > 1)
						{
							ItemStack loadingItemStack = bestAmmoStack.copy();
							loadingItemStack.setCount(1);
							nbtTagCompound.setTag("ammo", loadingItemStack.writeToNBT(new NBTTagCompound()));
							
							bestAmmoStack.setCount(bestAmmoStack.getCount()-1);
							inventory.setInventorySlotContents(bestSlot, bestAmmoStack);
						} else
						{
							nbtTagCompound.setTag("ammo", bestAmmoStack.writeToNBT(new NBTTagCompound()));
							inventory.setInventorySlotContents(bestSlot, ItemStack.EMPTY);
						}
					}
				} else
				{
					return;
				}
				
				WeaponReloadEvent.Post postReloadEvent = new WeaponReloadEvent.Post(entityPlayer, heldStack, itemGun, offhandReload, multiMagReload);
				MinecraftForge.EVENT_BUS.post(postReloadEvent);
				
				gunType.playSound(entityPlayer, WeaponSoundType.Reload);
				ServerTickHandler.playerShootCooldown.put(entityPlayer.getUniqueID(), preReloadEvent.getReloadTime());
			} else
			{
				NBTTagCompound nbtTagCompound = heldStack.getTagCompound();	
				if(nbtTagCompound.hasKey("ammo"))
				{
					ItemStack oldAmmo = new ItemStack(nbtTagCompound.getCompoundTag("ammo"));
					ItemAmmo oldAmmoItem = (ItemAmmo) oldAmmo.getItem();
					inventory.addItemStackToInventory(oldAmmo);
					nbtTagCompound.removeTag("ammo");
				}
			}
		}
	}

	@Override
	public void handleClientSide(EntityPlayer entityPlayer) {
		// UNUSED
	}

}