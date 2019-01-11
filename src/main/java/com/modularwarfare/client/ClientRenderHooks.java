package com.modularwarfare.client;

import com.modularwarfare.client.model.CustomItemRenderType;
import com.modularwarfare.client.model.CustomItemRenderer;
import com.modularwarfare.client.model.RenderGun;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.utility.event.ForgeEvent;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.util.EnumHand;
import net.minecraftforge.client.event.RenderItemInFrameEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

public class ClientRenderHooks extends ForgeEvent {
	
	private CustomItemRenderer[] customRenderers = new CustomItemRenderer[2];
	
	public ClientRenderHooks()
	{
		customRenderers[0] = ClientProxy.gunRenderer = new RenderGun();
	}
	
	@SubscribeEvent
	public void renderItemFrame(RenderItemInFrameEvent event)
	{
		if(event.getItem().getItem() instanceof ItemGun)
		{
			GunType type = ((ItemGun)event.getItem().getItem()).type;
			if(type.model != null)
			{
				event.setCanceled(true);
				
				int rotation = event.getEntityItemFrame().getRotation();
				GlStateManager.rotate(-rotation * 45F, 0F, 0F, 1F);
				RenderHelper.enableStandardItemLighting();
				GlStateManager.rotate(rotation * 45F, 0F, 0F, 1F);
				GlStateManager.pushMatrix();
				float scale = 0.75F;
				GlStateManager.scale(scale, scale, scale);
				GlStateManager.translate(0.15F, -0.15F, 0F);
				customRenderers[0].renderItem(CustomItemRenderType.ENTITY, EnumHand.MAIN_HAND, event.getItem());
				GlStateManager.popMatrix();
			}
		}
	}

}
