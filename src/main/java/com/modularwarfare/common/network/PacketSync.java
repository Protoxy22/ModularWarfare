package com.modularwarfare.common.network;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.BaublesApi;
import com.modularwarfare.api.cap.IBaublesItemHandler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.ByteBufUtils;

public class PacketSync extends PacketBase {
	
	int playerId;
	byte slot=0;
	ItemStack bauble;

	public PacketSync() {}

	public PacketSync(EntityPlayer p, int slot, ItemStack bauble) {
		this.slot = (byte) slot;
		this.bauble = bauble;
		this.playerId = p.getEntityId();
	}
		
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		data.writeInt(playerId);
		data.writeByte(slot);
		ByteBufUtils.writeItemStack(data, bauble);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		playerId = data.readInt();
		slot = data.readByte();
		bauble = ByteBufUtils.readItemStack(data);
	}

	@Override
	public void handleServerSide(EntityPlayerMP entityPlayer) {
		// UNUSED
	}

	@Override
	public void handleClientSide(EntityPlayer entityPlayer) {
		Minecraft.getMinecraft().addScheduledTask(new Runnable(){ public void run() {
			World world = ModularWarfare.PROXY.getClientWorld();
			if (world==null) return;
			Entity p = world.getEntityByID(playerId);
			if (p !=null && p instanceof EntityPlayer) {
				IBaublesItemHandler baubles = BaublesApi.getBaublesHandler((EntityPlayer) p);
				baubles.setStackInSlot(slot, bauble);
			}
		}});
	}

}
