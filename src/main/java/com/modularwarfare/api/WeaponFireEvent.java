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
import net.minecraftforge.fml.common.eventhandler.Event;

import javax.annotation.Nullable;

public class WeaponFireEvent extends WeaponEvent {
	
	public WeaponFireEvent(EntityPlayer entityPlayer, ItemStack stackWeapon, ItemGun itemWeapon)
	{
		super(entityPlayer, stackWeapon, itemWeapon);
	}
	
    /** WeaponFireEvent.Pre is fired before the weapon actually fires. Canceling this event will stop the weapon firing.<br>
     * <br>
     * This event is {@link Cancelable}.<br>
     * This event does not use {@link HasResult}.<br>
     * This event is fired on the {@link MinecraftForge#EVENT_BUS}.<br>
     */
	@Cancelable
	public static class Pre extends WeaponFireEvent
	{
		private int weaponRange;
		
		public Pre(EntityPlayer entityPlayer, ItemStack stackWeapon, ItemGun itemWeapon, int weaponRange) 
		{
			super(entityPlayer, stackWeapon, itemWeapon);
			this.weaponRange = weaponRange;
		}

		public int getWeaponRange() 
		{
			return weaponRange;
		}
		
		public void setWeaponRange(int updatedRange)
		{
			this.weaponRange = updatedRange;
		}
	}
		
    /** WeaponFireEvent.Post is fired once the weapon has fired with a list of affected objects. These lists can be modified to change the outcome.<br>
     * <br>
     * This event is not {@link Cancelable}.<br>
     * This event does not use {@link HasResult}.<br>
     * This event is fired on the {@link MinecraftForge#EVENT_BUS}.<br>
     */
	public static class Post extends WeaponFireEvent
	{
		private List<Entity> affectedEntities;
		private int affectiveWeaponRange;
		private int fireDelay;
		private float damage;
		private float pitchRecoil;
		private float yawRecoil;
		
		public Post(EntityPlayer entityPlayer, ItemStack stackWeapon, ItemGun itemWeapon, List<Entity> affectedEntities, boolean isHeadshot) {
			super(entityPlayer, stackWeapon, itemWeapon);
			this.affectedEntities = affectedEntities;

			Random rand = new Random();
			GunType type = itemWeapon.type;
			
			pitchRecoil = type.recoilPitch + (rand.nextFloat() * (type.randomRecoilPitch*2) - type.randomRecoilPitch);
			yawRecoil = type.recoilYaw + (rand.nextFloat() * (type.randomRecoilYaw*2) - type.randomRecoilYaw);
			damage = type.gunDamage;
			if(isHeadshot){
				damage = damage + type.gunDamageHeadshotBonus;
			}
			fireDelay = type.fireTickDelay;
		}

		public List<Entity> getAffectedEntities() {
			return affectedEntities;
		}
		
		public void setAffectedEntities(List<Entity> updatedList) {
			this.affectedEntities = updatedList;
		}
		
		public float getRecoilPitch()
		{
			return pitchRecoil;
		}
		
		public void setRecoilPitch(float updatedPitch)
		{
			this.pitchRecoil = updatedPitch;
		}

		public float getRecoilYaw()
		{
			return yawRecoil;
		}
		
		public void setRecoilYaw(float updatedYaw)
		{
			this.yawRecoil = updatedYaw;
		}
		
		public float getDamage()
		{
			return damage;
		}
		
		public void setDamage(float updatedDamage)
		{
			this.damage = updatedDamage;
		}
		
		public int getFireDelay()
		{
			return fireDelay;
		}
		
		public void setFireDelay(int updatedFireDelay)
		{
			this.fireDelay = updatedFireDelay;
		}
	}

}
