package com.modularwarfare.api.cap;

import com.modularwarfare.api.IArmor;
import net.minecraftforge.common.capabilities.*;
import net.minecraft.util.*;
import net.minecraft.nbt.*;

public class ArmorCapabilities
{
    @CapabilityInject(IArmorItemHandler.class)
    public static final Capability<IArmorItemHandler> CAPABILITY_BAUBLES;
    @CapabilityInject(IArmor.class)
    public static final Capability<IArmor> CAPABILITY_ITEM_ARMOR;
    
    static {
        CAPABILITY_BAUBLES = null;
        CAPABILITY_ITEM_ARMOR = null;
    }
    
    public static class CapabilityBaubles<T extends IArmorItemHandler> implements Capability.IStorage<IArmorItemHandler>
    {
        public NBTBase writeNBT(final Capability<IArmorItemHandler> capability, final IArmorItemHandler instance, final EnumFacing side) {
            return null;
        }
        
        public void readNBT(final Capability<IArmorItemHandler> capability, final IArmorItemHandler instance, final EnumFacing side, final NBTBase nbt) {
        }
    }
    
    public static class CapabilityItemBaubleStorage implements Capability.IStorage<IArmor>
    {
        public NBTBase writeNBT(final Capability<IArmor> capability, final IArmor instance, final EnumFacing side) {
            return null;
        }
        
        public void readNBT(final Capability<IArmor> capability, final IArmor instance, final EnumFacing side, final NBTBase nbt) {
        }
    }
}
