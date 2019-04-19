package com.modularwarfare.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.relauncher.Side;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.IArmor;
import com.modularwarfare.api.MWArmorType;
import com.modularwarfare.api.cap.BaublesCapabilities;
import com.modularwarfare.common.network.PacketOpenBaublesInventory;

public class ClientEventHandler
{
	@SubscribeEvent
	public void registerItemModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(ItemRing.RING, 0, new ModelResourceLocation("baubles:ring", "inventory"));
	}

	@SubscribeEvent
	public void playerTick(PlayerTickEvent event) {
//		if (event.side == Side.CLIENT && event.phase == Phase.START ) {
//			if (ClientProxy.KEY_BAUBLES.isPressed() && FMLClientHandler.instance().getClient().inGameHasFocus) {
//				ModularWarfare.NETWORK.sendToServer(new PacketOpenBaublesInventory());
//			}
//		}
	}

	@SubscribeEvent
	public void tooltipEvent(ItemTooltipEvent event) {
		if (!event.getItemStack().isEmpty() && event.getItemStack().hasCapability(BaublesCapabilities.CAPABILITY_ITEM_BAUBLE, null)) {
			IArmor bauble = event.getItemStack().getCapability(BaublesCapabilities.CAPABILITY_ITEM_BAUBLE, null);
			MWArmorType bt = bauble.getArmorType(event.getItemStack());
			event.getToolTip().add(TextFormatting.GOLD + I18n.format("name."+bt));
		}
	}
}
