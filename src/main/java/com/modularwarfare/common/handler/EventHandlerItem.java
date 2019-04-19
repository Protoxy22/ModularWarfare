package com.modularwarfare.common.handler;

import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.IArmor;
import com.modularwarfare.api.cap.BaublesCapabilities;

public class EventHandlerItem
{
	private static ResourceLocation capabilityResourceLocation = new ResourceLocation(ModularWarfare.MOD_ID, "bauble_cap");

	/**
	* Handles backwards compatibility with items that implement IBauble instead of exposing it as a capability.
	* This adds a IBauble capability wrapper for all items, if the item:
	* - does implement the IBauble interface
	* - does not already have the capability
	* - did not get the capability by another event handler earlier in the chain
	* @param event
	*/
	@SubscribeEvent(priority = EventPriority.LOWEST)
 	public void itemCapabilityAttach(AttachCapabilitiesEvent<ItemStack> event)
 	{
		ItemStack stack = event.getObject();
		if (stack.isEmpty() || !(stack.getItem() instanceof IArmor) || stack.hasCapability(BaublesCapabilities.CAPABILITY_ITEM_BAUBLE, null)
				|| event.getCapabilities().values().stream().anyMatch(c -> c.hasCapability(BaublesCapabilities.CAPABILITY_ITEM_BAUBLE, null)))
			return;

		event.addCapability(capabilityResourceLocation, new ICapabilityProvider() {

			@Override
			public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
				return capability == BaublesCapabilities.CAPABILITY_ITEM_BAUBLE;
			}

			@Nullable
			@Override
			public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
				return capability == BaublesCapabilities.CAPABILITY_ITEM_BAUBLE
						? BaublesCapabilities.CAPABILITY_ITEM_BAUBLE.cast((IArmor) stack.getItem())
						: null;
			}
		});
	}
}
