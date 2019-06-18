package com.modularwarfare.common.network;

import com.modularwarfare.common.guns.*;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import org.lwjgl.util.vector.Vector3f;

public class PacketGunUnloadAttachment extends PacketBase {

	public PacketGunUnloadAttachment() {
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
	}

	@Override
	public void handleServerSide(EntityPlayerMP entityPlayer) {
		if (entityPlayer.getHeldItemMainhand() != null) {
			if (entityPlayer.getHeldItemMainhand().getItem() instanceof ItemGun) {
				ItemStack gunStack = entityPlayer.getHeldItemMainhand();
				InventoryPlayer inventory = entityPlayer.inventory;
				for(AttachmentEnum attachment : AttachmentEnum.values()) {
					ItemStack itemStack = GunType.getAttachment(gunStack, attachment);
					if (itemStack != null && itemStack.getItem() != Items.AIR) {
						ItemAttachment itemAttachment = (ItemAttachment) itemStack.getItem();
						AttachmentType attachType = itemAttachment.type;
						GunType.removeAttachment(gunStack, attachType.attachmentType);
						inventory.addItemStackToInventory(itemStack);
					}
				}
			}
		}
	}


	@Override
	public void handleClientSide(EntityPlayer entityPlayer) {
		// UNUSED
	}

}