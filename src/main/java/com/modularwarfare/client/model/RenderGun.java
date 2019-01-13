package com.modularwarfare.client.model;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

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
				
				boolean debugAiming = false;
				
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
					adsSwitch = 0f;
				}

				float modelScale = model.modelScale;
				float rotateX = 0;
				float rotateY = 0;
				float rotateZ = 0;
				Vector3f translateXYZ;
				
				if(model.renderPreset == 1)
				{
					rotateX = 0; //ROLL LEFT-RIGHT
					rotateY = 46F - 1F * adsSwitch; //ANGLE LEFT-RIGHT
					rotateZ = -0.25F * adsSwitch; //ANGLE UP-DOWN
					translateXYZ = new Vector3f(-1F, 0.875F + 0.06F * adsSwitch, -1F - 0.395F * adsSwitch);
				}
				//TODO; Create preset
				else if(model.renderPreset == 2)
				{
					rotateX = 0; //ROLL LEFT-RIGHT
					rotateY = 46F - 1F * adsSwitch; //ANGLE LEFT-RIGHT
					rotateZ = -0.25F * adsSwitch; //ANGLE UP-DOWN
					translateXYZ = new Vector3f(-1F, 0.775F + 0.16F * adsSwitch, -0.5F - 0.895F * adsSwitch);
				}
				//TODO; Create preset
				else//(3)
				{
					rotateX = 47F - 2F * adsSwitch;
					rotateY = -4F - 1F * adsSwitch;
					rotateZ = 4.5F * adsSwitch;
					translateXYZ = new Vector3f(-1F, 0.675F + 0.180F * adsSwitch, -1F - 0.395F * adsSwitch);
				}

					// NEW Render Position, based on renderPreset
					GL11.glRotatef(rotateX, 1F, 0F, 0F); //ROLL LEFT-RIGHT
					GL11.glRotatef(rotateY, 0F, 1F, 0F); //ANGLE LEFT-RIGHT
					GL11.glRotatef(rotateZ, 0F, 0F, 1F); //ANGLE UP-DOWN
					GL11.glTranslatef(translateXYZ.x, translateXYZ.y, translateXYZ.z);
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
				model.renderSlide(f);

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
