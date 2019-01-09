package com.modularwarfare.client.model;

import org.lwjgl.opengl.GL11;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemGun;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderGun implements IItemRenderer {
	
	private static TextureManager renderEngine;
	public static float smoothing;
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch (type) {
		case ENTITY:
			if (!Minecraft.getMinecraft().gameSettings.fancyGraphics)
				return false;
		case EQUIPPED:
		case EQUIPPED_FIRST_PERSON:
			return item != null && item.getItem() instanceof ItemGun && ((ItemGun) item.getItem()).type.model != null;
		default:
			break;
		}
		return false;
	}
	
	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return false;
	}
	
	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		// Avoid any broken cases by returning
		if (!(item.getItem() instanceof ItemGun))
			return;
		
		GunType gunType = ((ItemGun) item.getItem()).type;
		if (gunType == null)
			return;

		ModelGun model = gunType.model;
		if (model == null)
			return;
		
		{
			renderGun(type, item, gunType, data);
		}
		
	}
	
	private void renderGun(ItemRenderType type, ItemStack item, GunType gunType, Object... data) {
		
		ModelGun model = gunType.model;
		
		if (renderEngine == null)
			renderEngine = Minecraft.getMinecraft().renderEngine;
		
		GL11.glPushMatrix();
		{
			float f = 1F / 16F;
			float modelScale = 1f;
			
			renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/" + gunType + "_" + gunType.weaponSkins[0] + ".png"));
			
			GL11.glScalef(modelScale, modelScale, modelScale);

			model.renderGun(f);
			model.renderDefaultScope(f);
			model.renderDefaultBarrel(f);
			model.renderDefaultStock(f);
			model.renderDefaultGrip(f);
			model.renderDefaultGadget(f);
		}
		GL11.glPopMatrix();
	}

}
