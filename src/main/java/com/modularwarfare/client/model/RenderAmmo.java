package com.modularwarfare.client.model;

import org.lwjgl.opengl.GL11;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.common.guns.AmmoType;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemAmmo;
import com.modularwarfare.common.guns.ItemGun;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderAmmo implements IItemRenderer {
	
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
			return item != null && item.getItem() instanceof ItemAmmo && ((ItemAmmo) item.getItem()).type.model != null;
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
		if (!(item.getItem() instanceof ItemAmmo))
			return;
		
		AmmoType ammoType = ((ItemAmmo) item.getItem()).type;
		if (ammoType == null)
			return;

		ModelAmmo model = ammoType.model;
		if (model == null)
			return;
		{
			renderAmmo(type, item, ammoType, data);
		}
		
	}
	
	private void renderAmmo(ItemRenderType type, ItemStack item, AmmoType ammoType, Object... data) {
		
		ModelAmmo model = ammoType.model;
		
		if (renderEngine == null)
			renderEngine = Minecraft.getMinecraft().renderEngine;
		
		GL11.glPushMatrix();
		{
			float f = 1F / 16F;
			float modelScale = 0.2f;
			
			renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/" + ammoType + ".png"));
			GL11.glScalef(modelScale, modelScale, modelScale);
			GL11.glRotatef(25F - 5F * 1f, 0F, 0F, 1F);
			GL11.glRotatef(-5F, 0F, 1F, 0F);
			GL11.glTranslatef(3.5f, -0.3f, 0);
			model.renderAmmo(f);
		}
		GL11.glPopMatrix();
	}

}