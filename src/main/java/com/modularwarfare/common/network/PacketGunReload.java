package com.modularwarfare.common.network;

import java.util.ArrayList;

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
	
	public PacketGunReload() {}
		
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		
	}

	@Override
	public void handleServerSide(EntityPlayerMP entityPlayer) {
		if(entityPlayer.getHeldItemMainhand() != null && entityPlayer.getHeldItemMainhand().getItem() instanceof ItemGun)
		{
			ItemStack heldStack = entityPlayer.getHeldItemMainhand();
			ItemGun itemGun = (ItemGun) entityPlayer.getHeldItemMainhand().getItem();
			GunType gunType = itemGun.type;
			InventoryPlayer inventory = entityPlayer.inventory;
			
			ItemStack bestAmmoStack = null;
			int bestAmmoCount = 0;
			int bestSlot = 0;
			boolean isOffhandReload = false;
						
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
							isOffhandReload = true;
							bestAmmoStack = itemStack;
						}
					}
				}
			}
			
			if(!isOffhandReload)
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
			
			WeaponReloadEvent.Pre preReloadEvent = new WeaponReloadEvent.Pre(entityPlayer, heldStack, itemGun, isOffhandReload);
			MinecraftForge.EVENT_BUS.post(preReloadEvent);
			if(preReloadEvent.isCanceled())
				return;
			
			NBTTagCompound nbtTagCompound = heldStack.getTagCompound();	
			if(nbtTagCompound.hasKey("ammo"))
			{
				ItemStack oldAmmo = new ItemStack(nbtTagCompound.getCompoundTag("ammo"));
				ItemAmmo oldAmmoItem = (ItemAmmo) oldAmmo.getItem();
				inventory.addItemStackToInventory(oldAmmo);
				nbtTagCompound.removeTag("ammo");
			}
			
			if(bestAmmoStack != null)
			{
				if(!isOffhandReload)
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
				} else
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
				}
			} else
			{
				return;
			}
			
			WeaponReloadEvent.Post postReloadEvent = new WeaponReloadEvent.Post(entityPlayer, heldStack, itemGun, isOffhandReload);
			MinecraftForge.EVENT_BUS.post(postReloadEvent);
			
			gunType.playSound(entityPlayer, WeaponSoundType.Reload);
			//ServerTickHandler.playerShootCooldown.put(entityPlayer.getUniqueID(), preReloadEvent.getReloadTime());
		}
	}

	@Override
	public void handleClientSide(EntityPlayer entityPlayer) {
		// UNUSED
	}

}