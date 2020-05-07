package com.modularwarfare.common.container;

import com.modularwarfare.api.IArmor;
import com.modularwarfare.api.cap.ArmorCapabilities;
import com.modularwarfare.api.cap.IArmorItemHandler;
import net.minecraft.entity.player.*;
import net.minecraftforge.items.*;
import net.minecraft.item.*;


public class SlotArmor extends SlotItemHandler
{
    int armorSlot;
    EntityPlayer player;
    
    public SlotArmor(final EntityPlayer player, final IArmorItemHandler itemHandler, final int slot, final int par4, final int par5) {
        super(itemHandler, slot, par4, par5);
        this.armorSlot = slot;
        this.player = player;
    }
    
    public boolean isItemValid(final ItemStack stack) {
        return ((IArmorItemHandler)this.getItemHandler()).isItemValidForSlot(this.armorSlot, stack, this.player);
    }
    
    public boolean canTakeStack(final EntityPlayer player) {
        final ItemStack stack = this.getStack();
        if (stack.isEmpty()) {
            return false;
        }
        final IArmor bauble = stack.getCapability( ArmorCapabilities.CAPABILITY_ITEM_ARMOR, null);
        return bauble.canUnequip(stack, player);
    }
    
    public ItemStack onTake(final EntityPlayer playerIn, final ItemStack stack) {
        if (!this.getHasStack() && !((IArmorItemHandler)this.getItemHandler()).isEventBlocked() && stack.hasCapability(ArmorCapabilities.CAPABILITY_ITEM_ARMOR, null)) {
            (stack.getCapability(ArmorCapabilities.CAPABILITY_ITEM_ARMOR, null)).onUnequipped(stack, playerIn);
        }
        super.onTake(playerIn, stack);
        return stack;
    }
    
    public void putStack(final ItemStack stack) {
        if (this.getHasStack() && !ItemStack.areItemStacksEqual(stack, this.getStack()) && !((IArmorItemHandler)this.getItemHandler()).isEventBlocked() && this.getStack().hasCapability(ArmorCapabilities.CAPABILITY_ITEM_ARMOR, null)) {
            (this.getStack().getCapability(ArmorCapabilities.CAPABILITY_ITEM_ARMOR, null)).onUnequipped(this.getStack(), this.player);
        }
        final ItemStack oldstack = this.getStack().copy();
        super.putStack(stack);
        if (this.getHasStack() && !ItemStack.areItemStacksEqual(oldstack, this.getStack()) && !((IArmorItemHandler)this.getItemHandler()).isEventBlocked() && this.getStack().hasCapability(ArmorCapabilities.CAPABILITY_ITEM_ARMOR, null)) {
            (this.getStack().getCapability(ArmorCapabilities.CAPABILITY_ITEM_ARMOR, null)).onEquipped(this.getStack(), this.player);
        }
    }
    
    public int getSlotStackLimit() {
        return 1;
    }
}
