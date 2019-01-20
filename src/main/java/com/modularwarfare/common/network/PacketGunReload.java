package com.modularwarfare.common.network;

import java.util.ArrayList;

import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemAmmo;
import com.modularwarfare.common.guns.ItemGun;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;

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
			ItemGun itemGun = (ItemGun) entityPlayer.getHeldItemMainhand().getItem();
			GunType gunType = itemGun.type;
			InventoryPlayer inventory = entityPlayer.inventory;
			
			ArrayList<ItemStack> acceptedAmmos = new ArrayList<ItemStack>();
			for(int i = 0; i < inventory.getSizeInventory(); i++)
			{
				ItemStack itemStack = inventory.getStackInSlot(i);
				if(itemStack != null && itemStack.getItem() instanceof ItemAmmo)
				{
					System.out.println(itemStack.getDisplayName());
					ItemAmmo itemAmmo = (ItemAmmo) itemStack.getItem();
					for(String ammoName : gunType.acceptedAmmo)
					{
						if(ammoName.equalsIgnoreCase(itemAmmo.baseType.internalName))
						{
							// found stack
							System.out.println("suitable ammo found " + itemAmmo.baseType.internalName);
						}
					}
				} else
				{
					continue;
				}
			}
			
			//itemGun.onGunSwitchMode(entityPlayer, entityPlayer.world, entityPlayer.getHeldItemMainhand(), itemGun, gunType.fireModes[spot]);
		}
	}

	@Override
	public void handleClientSide(EntityPlayer entityPlayer) {
		// UNUSED
	}

}