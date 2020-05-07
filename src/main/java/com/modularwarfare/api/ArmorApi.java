package com.modularwarfare.api;

import com.modularwarfare.api.cap.ArmorCapabilities;
import com.modularwarfare.api.cap.IArmorItemHandler;
import com.modularwarfare.api.inv.ArmorInventoryWrapper;
import net.minecraft.entity.player.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;

public class ArmorApi
{
    public static IArmorItemHandler getArmorHandler(final EntityPlayer player) {
        final IArmorItemHandler handler = player.getCapability( ArmorCapabilities.CAPABILITY_BAUBLES, null);
        handler.setPlayer(player);
        return handler;
    }
    
    @Deprecated
    public static IInventory getArmors(final EntityPlayer player) {
        final IArmorItemHandler handler = player.getCapability(ArmorCapabilities.CAPABILITY_BAUBLES, null);
        handler.setPlayer(player);
        return new ArmorInventoryWrapper(handler, player);
    }
    
    public static int isArmorEquipped(final EntityPlayer player, final Item armor) {
        final IArmorItemHandler handler = getArmorHandler(player);
        for (int a = 0; a < handler.getSlots(); ++a) {
            if (!handler.getStackInSlot(a).isEmpty() && handler.getStackInSlot(a).getItem() == armor) {
                return a;
            }
        }
        return -1;
    }
    
    public static ItemStack getArmorInSlot(final EntityPlayer player, final int slot) {
        final IArmorItemHandler handler = getArmorHandler(player);
        for (int a = 0; a < handler.getSlots(); ++a) {
            if (!handler.getStackInSlot(a).isEmpty()) {
                return handler.getStackInSlot(slot);
            }
        }
        return ItemStack.EMPTY;
    }
    
    public static void setArmorInSlot(final EntityPlayer player, final int slot, final ItemStack itemStack) {
        final IArmorItemHandler handler = getArmorHandler(player);
        handler.setStackInSlot(slot, itemStack);
        handler.setChanged(slot, true);
    }
}
