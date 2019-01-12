package com.modularwarfare.client.model;

import org.lwjgl.opengl.GL11;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemGun;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;

public class RenderGun implements CustomItemRenderer {

	private static TextureManager renderEngine;
	public static float smoothing;

	private float adsSwitch = 1f;
	private int direction = 0;
	
	@Override
	public void renderItem(CustomItemRenderType type, EnumHand hand, ItemStack item, Object... data) {
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

	private void renderGun(CustomItemRenderType renderType, ItemStack item, GunType gunType, Object... data) {

		ModelGun model = gunType.model;

		if (renderEngine == null)
			renderEngine = Minecraft.getMinecraft().renderEngine;

		if (model == null)
			return;

		GL11.glPushMatrix();
		{
			switch (renderType) {

			case ENTITY: {
				GL11.glTranslatef(-0.45F + model.itemFrameOffset.x, -0.05F + model.itemFrameOffset.y, model.itemFrameOffset.z);
				break;
			}

			case EQUIPPED: {
				GL11.glRotatef(35F, 0F, 0F, 1F);
				GL11.glRotatef(-5F, 0F, 1F, 0F);
				GL11.glTranslatef(0.75F, -0.22F, -0.08F);
				GL11.glScalef(1F, 1F, -1F);
				GL11.glTranslatef(model.thirdPersonOffset.x, model.thirdPersonOffset.y, model.thirdPersonOffset.z);
				break;
			}

			case EQUIPPED_FIRST_PERSON: {
				
				boolean debugAiming = true;
				
				if(debugAiming)
				{
					float smoothing = 1f;
					float defaultSpeed = 0.05f;
									
					if(adsSwitch - defaultSpeed*smoothing >= 0f && direction == 0)
					{
						adsSwitch -= defaultSpeed*smoothing;
					} else if(!(adsSwitch - defaultSpeed*smoothing >= 0f) && direction == 0)
					{
						direction = 1;
					} 
					
					if(adsSwitch + defaultSpeed*smoothing <= 1f && direction == 1)
					{
						adsSwitch += defaultSpeed*smoothing;
					} else if(!(adsSwitch + defaultSpeed*smoothing <= 1f) && direction == 1)
					{
						direction = 0;
					}
				} else
				{
					adsSwitch = 1f;
				}
				
				float modelScale = model.modelScale;
				GL11.glRotatef(45F, 0F, 1F, 0F);
				GL11.glRotatef(0F - 5F * adsSwitch, 0F, 0F, 1F);
				
				GL11.glTranslatef(-1F, 0.675F + 0.180F * adsSwitch, -1F - 0.395F * adsSwitch);
				/*if(gunType.hasScopeOverlay)
					GL11.glTranslatef(-0.7F * adsSwitch, -0.12F * adsSwitch, -0.05F * adsSwitch);*/
				GL11.glRotatef(4.5F * adsSwitch, 0F, 0F, 1F);
				GL11.glTranslatef(0, -0.03F * modelScale * adsSwitch, 0.5f*modelScale*(1f-adsSwitch));
				break;
			}

			default:
				break;

			}

			GL11.glPushMatrix();
			{
				float f = 1F / 16F;
				float modelScale = model.modelScale;

				renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID,
						"skins/" + gunType.weaponSkins[0].getSkin(gunType) + ".png"));

				GL11.glScalef(modelScale, modelScale, modelScale);
				// GL11.glRotatef(25F - 5F * 1f, 0F, 0F, 1F);
				// GL11.glRotatef(-5F, 0F, 1F, 0F);
				// GL11.glTranslatef(3.5f, -0.3f, 0);

				model.renderGun(f);
				model.renderDefaultScope(f);
				model.renderDefaultBarrel(f);
				model.renderDefaultStock(f);
				model.renderDefaultGrip(f);
				model.renderDefaultGadget(f);

				// TODO ARM RENDER CALL

				/*
				 * if (renderType == ItemRenderType.EQUIPPED_FIRST_PERSON && model.hasArms) {
				 * Minecraft mc = Minecraft.getMinecraft(); renderAnimArm(mc.thePlayer, model,
				 * renderType, animations); }
				 */
			}
			GL11.glPopMatrix();
		}
		GL11.glPopMatrix();
	}

}
