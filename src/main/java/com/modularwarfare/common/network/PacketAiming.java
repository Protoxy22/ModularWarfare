package com.modularwarfare.common.network;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.common.guns.ItemGun;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketAiming extends PacketBase {

	public boolean aiming;

	public PacketAiming() {
	}

	public PacketAiming(boolean aiming) {
		this.aiming = aiming;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		data.writeBoolean(aiming);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		aiming = data.readBoolean();
	}

	@Override
	public void handleServerSide(EntityPlayerMP entityPlayer) {
		if(entityPlayer.getHeldItemMainhand().getItem() instanceof ItemGun){
			((ItemGun) entityPlayer.getHeldItemMainhand().getItem()).isAiming = aiming;
			ModularWarfare.LOGGER.info("AIMING: "+aiming);
		}
	}

	@Override
	public void handleClientSide(EntityPlayer entityPlayer) {
	}

}