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

		final double dx = entityPlayer.getLookVec().x * 100;
		final double dy = entityPlayer.getLookVec().y * 100;
		final double dz = entityPlayer.getLookVec().z * 100;
		Vector3f vec = new Vector3f((float) entityPlayer.posX, (float) (entityPlayer.getEntityBoundingBox().minY + entityPlayer.getEyeHeight()), (float) entityPlayer.posZ);
		vec.translate(0.5F, 0F, 0.5F);
		InstantBulletRenderer.AddTrail(new InstantBulletRenderer.InstantShotTrail(vec, new Vector3f((float) (entityPlayer.posX + dx), (float) (entityPlayer.posY + entityPlayer.getEyeHeight() + dy), (float) (entityPlayer.posZ + dz))));
	}
}
