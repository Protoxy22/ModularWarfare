package com.modularwarfare.api.cap;

import net.minecraftforge.items.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;

public interface IArmorItemHandler extends IItemHandlerModifiable
{
    boolean isItemValidForSlot(final int p0, final ItemStack p1, final EntityLivingBase p2);
    
    boolean isEventBlocked();
    
    void setEventBlock(final boolean p0);
    
    boolean isChanged(final int p0);
    
    void setChanged(final int p0, final boolean p1);
    
    void setPlayer(final EntityLivingBase p0);
}
