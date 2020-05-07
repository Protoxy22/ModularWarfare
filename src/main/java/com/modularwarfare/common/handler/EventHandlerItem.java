package com.modularwarfare.common.handler;

import com.modularwarfare.api.IArmor;
import com.modularwarfare.api.cap.ArmorCapabilities;
import net.minecraftforge.event.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraftforge.common.capabilities.*;
import javax.annotation.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class EventHandlerItem
{
    private static ResourceLocation capabilityResourceLocation = new ResourceLocation("modularwarfare", "bauble_cap");
    
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void itemCapabilityAttach(final AttachCapabilitiesEvent<ItemStack> event) {
        final ItemStack stack = event.getObject();
        if (stack.isEmpty() || !(stack.getItem() instanceof IArmor) || stack.hasCapability(ArmorCapabilities.CAPABILITY_ITEM_ARMOR, null) || event.getCapabilities().values().stream().anyMatch(c -> c.hasCapability((Capability)ArmorCapabilities.CAPABILITY_ITEM_ARMOR, null))) {
            return;
        }
        event.addCapability(EventHandlerItem.capabilityResourceLocation, new ICapabilityProvider() {
            public boolean hasCapability(@Nonnull final Capability<?> capability, @Nullable final EnumFacing facing) {
                return capability == ArmorCapabilities.CAPABILITY_ITEM_ARMOR;
            }

            @Nullable
            public <T> T getCapability(@Nonnull final Capability<T> capability, @Nullable final EnumFacing facing) {
                return (T)((capability == ArmorCapabilities.CAPABILITY_ITEM_ARMOR) ? ArmorCapabilities.CAPABILITY_ITEM_ARMOR.cast((IArmor)stack.getItem()) : null);
            }
        });
    }

}
