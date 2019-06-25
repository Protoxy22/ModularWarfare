package com.modularwarfare.common.network;

import com.modularwarfare.ModularWarfare;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.IThreadListener;
import net.minecraft.world.WorldServer;

public class PacketOpenBaublesInventory extends PacketBase {
	
	public PacketOpenBaublesInventory() {}
		
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		
	}

	@Override
	public void handleServerSide(EntityPlayerMP entityPlayer) {
		IThreadListener mainThread = (WorldServer) entityPlayer.world;
		mainThread.addScheduledTask(new Runnable(){ public void run() {
			entityPlayer.openContainer.onContainerClosed(entityPlayer);
			entityPlayer.openGui(ModularWarfare.INSTANCE, ModularWarfare.GUI, entityPlayer.world, 0, 0, 0);
		}});
	}

	@Override
	public void handleClientSide(EntityPlayer entityPlayer) {
		// UNUSED
	}

}
