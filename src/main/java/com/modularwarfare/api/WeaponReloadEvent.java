package com.modularwarfare.api;

import java.util.List;
import java.util.Random;

import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemGun;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import net.minecraftforge.fml.common.eventhandler.Event.HasResult;

public class WeaponReloadEvent extends WeaponEvent {
	
	public WeaponReloadEvent(EntityPlayer entityPlayer, ItemStack stackWeapon, ItemGun itemWeapon)
	{
		super(entityPlayer, stackWeapon, itemWeapon);
	}
	
	/** WeaponReloadEvent.Pre is fired before the weapon actually reloads. Canceling this event will stop the weapon reload.<br>
     * <br>
     * This event is {@link Cancelable}.<br>
     * This event does not use {@link HasResult}.<br>
     * This event is fired on the {@link MinecraftForge#EVENT_BUS}.<br>
     */
	@Cancelable
	public static class Pre extends WeaponReloadEvent
	{
		private final boolean offhandReload;
		private int reloadTime;
		
		public Pre(EntityPlayer entityPlayer, ItemStack stackWeapon, ItemGun itemWeapon, boolean offhandReload) 
		{
			super(entityPlayer, stackWeapon, itemWeapon);
			this.offhandReload = offhandReload;
			
			GunType type = itemWeapon.type;
			this.reloadTime = (int) (offhandReload ? type.offhandReloadTime != null ? (int) type.offhandReloadTime * 0.8f  : type.reloadTime : type.reloadTime);
		}

		public int getReloadTime() 
		{
			return reloadTime;
		}
		
		public void setReloadTime(int updatedReloadTime)
		{
			this.reloadTime = updatedReloadTime;
		}
		
		public boolean isOffhandReload()
		{
			return offhandReload;
		}
	}
	
    /** WeaponReloadEvent.Post is fired once the weapon has started reloading.<br>
     * <br>
     * This event is not {@link Cancelable}.<br>
     * This event does not use {@link HasResult}.<br>
     * This event is fired on the {@link MinecraftForge#EVENT_BUS}.<br>
     */
	public static class Post extends WeaponReloadEvent
	{
		private final boolean offhandReload;
		
		public Post(EntityPlayer entityPlayer, ItemStack stackWeapon, ItemGun itemWeapon, boolean offhandReload) 
		{
			super(entityPlayer, stackWeapon, itemWeapon);
			this.offhandReload = offhandReload;
		}
		
		public boolean isOffhandReload()
		{
			return offhandReload;
		}
	}

}
