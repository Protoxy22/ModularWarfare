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

public class PacketGunReloadSound extends PacketBase {
		
	public PacketGunReloadSound() {}
		
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		
	}

	@Override
	public void handleServerSide(EntityPlayerMP entityPlayer) {
		if(entityPlayer.getHeldItemMainhand() != null)
		{
			if(entityPlayer.getHeldItemMainhand().getItem() instanceof ItemGun)
			{
				ItemStack gunStack = entityPlayer.getHeldItemMainhand();
				ItemGun itemGun = (ItemGun) entityPlayer.getHeldItemMainhand().getItem();
				GunType gunType = itemGun.type;
				InventoryPlayer inventory = entityPlayer.inventory;
				
				if(!ServerTickHandler.playerReloadCooldown.containsKey(entityPlayer.getUniqueID()))
					return;
				
				gunType.playSound(entityPlayer, WeaponSoundType.Load);
			}
		}
	}

	
	
	@Override
	public void handleClientSide(EntityPlayer entityPlayer) {
		// UNUSED
	}

}