package com.modularwarfare.common.network;

import com.modularwarfare.common.guns.AttachmentType;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemAttachment;
import com.modularwarfare.common.guns.ItemGun;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class PacketGunAddAttachment extends PacketBase {

	public PacketGunAddAttachment() {
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
				ItemGun itemGun = (ItemGun) entityPlayer.getHeldItemMainhand().getItem();
				GunType gunType = itemGun.type;
				InventoryPlayer inventory = entityPlayer.inventory;

				if (inventory.offHandInventory.get(0) != ItemStack.EMPTY) {
					ItemStack offhandStack = inventory.offHandInventory.get(0);
					if (offhandStack.getItem() instanceof ItemAttachment) {
						ItemAttachment itemAttachment = (ItemAttachment) offhandStack.getItem();
						AttachmentType attachType = itemAttachment.type;
						if (gunType.acceptedAttachments.get(attachType.attachmentType) != null && gunType.acceptedAttachments.get(attachType.attachmentType).size() >= 1) {
							if (gunType.acceptedAttachments.get(attachType.attachmentType).contains(attachType.internalName)) {
								ItemStack attachmentStack = new ItemStack(itemAttachment);
								NBTTagCompound tag = new NBTTagCompound();
								tag.setInteger("skinId", 0);
								attachmentStack.setTagCompound(tag);
								GunType.addAttachment(gunStack, attachType.attachmentType, attachmentStack);
								inventory.offHandInventory.get(0).shrink(1);
							}
						}
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