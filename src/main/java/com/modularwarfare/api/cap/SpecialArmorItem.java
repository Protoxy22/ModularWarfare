package com.modularwarfare.api.cap;

import com.modularwarfare.api.IArmor;
import com.modularwarfare.api.MWArmorType;
import net.minecraft.item.*;

public class SpecialArmorItem implements IArmor
{
    private MWArmorType baubleType;
    
    public SpecialArmorItem(final MWArmorType type) {
        this.baubleType = type;
    }
    
    @Override
    public MWArmorType getArmorType(final ItemStack itemstack) {
        return this.baubleType;
    }
}
