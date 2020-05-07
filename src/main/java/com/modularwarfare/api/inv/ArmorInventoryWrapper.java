package com.modularwarfare.api.inv;

import com.modularwarfare.api.cap.IArmorItemHandler;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.text.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;

public class ArmorInventoryWrapper implements IInventory
{
    final IArmorItemHandler handler;
    final EntityPlayer player;
    
    public ArmorInventoryWrapper(final IArmorItemHandler handler) {
        this.handler = handler;
        this.player = null;
    }
    
    public ArmorInventoryWrapper(final IArmorItemHandler handler, final EntityPlayer player) {
        this.handler = handler;
        this.player = player;
    }
    
    public String getName() {
        return "modularwarfareInventory";
    }
    
    public boolean hasCustomName() {
        return false;
    }
    
    public ITextComponent getDisplayName() {
        return new TextComponentString(this.getName());
    }
    
    public int getSizeInventory() {
        return this.handler.getSlots();
    }
    
    public boolean isEmpty() {
        return false;
    }
    
    public ItemStack getStackInSlot(final int index) {
        return this.handler.getStackInSlot(index);
    }
    
    public ItemStack decrStackSize(final int index, final int count) {
        return this.handler.extractItem(index, count, false);
    }
    
    public ItemStack removeStackFromSlot(final int index) {
        final ItemStack out = this.getStackInSlot(index);
        this.handler.setStackInSlot(index, ItemStack.EMPTY);
        return out;
    }
    
    public void setInventorySlotContents(final int index, final ItemStack stack) {
        this.handler.setStackInSlot(index, stack);
    }
    
    public int getInventoryStackLimit() {
        return 64;
    }
    
    public void markDirty() {
    }
    
    public boolean isUsableByPlayer(final EntityPlayer player) {
        return true;
    }
    
    public void openInventory(final EntityPlayer player) {
    }
    
    public void closeInventory(final EntityPlayer player) {
    }
    
    public boolean isItemValidForSlot(final int index, final ItemStack stack) {
        return this.handler.isItemValidForSlot(index, stack, this.player);
    }
    
    public int getField(final int id) {
        return 0;
    }
    
    public void setField(final int id, final int value) {
    }
    
    public int getFieldCount() {
        return 0;
    }
    
    public void clear() {
        for (int i = 0; i < this.getSizeInventory(); ++i) {
            this.setInventorySlotContents(i, ItemStack.EMPTY);
        }
    }
}
