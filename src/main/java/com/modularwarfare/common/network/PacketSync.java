package com.modularwarfare.common.network;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.ArmorApi;
import com.modularwarfare.api.cap.IArmorItemHandler;
import net.minecraft.item.*;
import io.netty.channel.*;
import io.netty.buffer.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;

public class PacketSync extends PacketBase
{
    int playerId;
    byte slot;
    ItemStack bauble;
    
    public PacketSync() {
        this.slot = 0;
    }
    
    public PacketSync(final EntityPlayer p, final int slot, final ItemStack bauble) {
        this.slot = 0;
        this.slot = (byte)slot;
        this.bauble = bauble;
        this.playerId = p.getEntityId();
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.playerId);
        data.writeByte((int)this.slot);
        ByteBufUtils.writeItemStack(data, this.bauble);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.playerId = data.readInt();
        this.slot = data.readByte();
        this.bauble = ByteBufUtils.readItemStack(data);
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP entityPlayer) {
    }
    
    @Override
    public void handleClientSide(final EntityPlayer entityPlayer) {
        Minecraft.getMinecraft().addScheduledTask((Runnable)new Runnable() {
            @Override
            public void run() {
                final World world = ModularWarfare.PROXY.getClientWorld();
                if (world == null) {
                    return;
                }
                final Entity p = world.getEntityByID(PacketSync.this.playerId);
                if (p != null && p instanceof EntityPlayer) {
                    final IArmorItemHandler baubles = ArmorApi.getArmorHandler((EntityPlayer)p);
                    baubles.setStackInSlot((int)PacketSync.this.slot, PacketSync.this.bauble);
                }
            }
        });
    }
}
