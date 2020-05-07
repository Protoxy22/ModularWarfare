package com.modularwarfare.api.cap;

import net.minecraftforge.common.util.*;
import net.minecraftforge.common.capabilities.*;
import net.minecraft.util.*;
import net.minecraft.nbt.*;

public class ArmorContainerProvider implements INBTSerializable<NBTTagCompound>, ICapabilityProvider
{
    private final ArmorContainer container;
    
    public ArmorContainerProvider(final ArmorContainer container) {
        this.container = container;
    }
    
    public boolean hasCapability(final Capability<?> capability, final EnumFacing facing) {
        return capability == ArmorCapabilities.CAPABILITY_BAUBLES;
    }
    
    public <T> T getCapability(final Capability<T> capability, final EnumFacing facing) {
        if (capability == ArmorCapabilities.CAPABILITY_BAUBLES) {
            return (T)this.container;
        }
        return null;
    }
    
    public NBTTagCompound serializeNBT() {
        return this.container.serializeNBT();
    }
    
    public void deserializeNBT(final NBTTagCompound nbt) {
        this.container.deserializeNBT(nbt);
    }
}
