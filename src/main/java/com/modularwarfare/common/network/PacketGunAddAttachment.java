package com.modularwarfare.common.network;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.common.guns.*;

import com.modularwarfare.utility.MWSound;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;

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
								GunType.addAttachment(gunStack, attachType.attachmentType, attachType.scopeType, attachmentStack);
								inventory.offHandInventory.get(0).shrink(1);
							}
						}
					} else if (offhandStack.getItem() instanceof ItemSpray) {
						ItemSpray itemSpray = (ItemSpray) offhandStack.getItem();
						if (gunStack.getTagCompound() != null) {
							for(int i=0; i<gunType.modelSkins.length; i++) {
								if (gunType.modelSkins[i].internalName.equalsIgnoreCase(itemSpray.type.skinName)) {
									NBTTagCompound nbtTagCompound = gunStack.getTagCompound();
									nbtTagCompound.setInteger("skinId", i);
									gunStack.setTagCompound(nbtTagCompound);
									inventory.offHandInventory.get(0).damageItem(1, entityPlayer);
									ModularWarfare.NETWORK.sendTo(new PacketPlaySound(entityPlayer.getPosition(), "spray", 1f, 1f), entityPlayer);
								}
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