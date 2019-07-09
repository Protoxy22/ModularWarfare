package com.modularwarfare.common.network;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.InstantBulletRenderer;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.common.guns.WeaponFireMode;

import com.modularwarfare.common.vector.Vector3f;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketGunFire extends PacketBase {

	public PacketGunFire() {
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {

	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {

	}

	@Override
	public void handleServerSide(EntityPlayerMP entityPlayer) {
		if (entityPlayer.getHeldItemMainhand() != null && entityPlayer.getHeldItemMainhand().getItem() instanceof ItemGun) {
			ItemGun itemGun = (ItemGun) entityPlayer.getHeldItemMainhand().getItem();
			WeaponFireMode fireMode = GunType.getFireMode(entityPlayer.getHeldItemMainhand());
			if (fireMode == null)
				return;

			itemGun.onGunFire(entityPlayer, entityPlayer.world, entityPlayer.getHeldItemMainhand(), itemGun, fireMode);
   		}
	}

	@Override
	public void handleClientSide(EntityPlayer entityPlayer) {

	}
}
