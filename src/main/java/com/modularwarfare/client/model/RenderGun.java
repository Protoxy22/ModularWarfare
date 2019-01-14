package com.modularwarfare.client.model;

import java.util.Random;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemGun;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;

public class RenderGun implements CustomItemRenderer {

	private static TextureManager renderEngine;
	public static float smoothing;
	public static float randomOffset;
	public static float randomRotateOffset;

	public static float adsSwitch = 0f;
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
				GL11.glRotatef(0F, 1F, 0F, 0F);
				GL11.glRotatef(-90F, 0F, 1F, 0F);
				GL11.glRotatef(90F, 0F, 0F, 1F);
				GL11.glTranslatef(0.25F, 0F, 0F);
				GL11.glScalef(1F, 1F, 1F);
				GL11.glTranslatef(model.thirdPersonOffset.x, model.thirdPersonOffset.y, model.thirdPersonOffset.z);
				break;
			}

			case EQUIPPED_FIRST_PERSON: {
				
				/*boolean debugAiming = false;
				
				if(debugAiming)
				{
					float smoothing = 1f;
					float adsSpeed = 0.05f + model.adsSpeed;
									
					if(adsSwitch - adsSpeed*smoothing >= 0f && direction == 0)
					{
						adsSwitch -= adsSpeed*smoothing;
					} else if(!(adsSwitch - adsSpeed*smoothing >= 0f) && direction == 0)
					{
						direction = 1;
					} 
					
					if(adsSwitch + adsSpeed*smoothing <= 1f && direction == 1)
					{
						adsSwitch += adsSpeed*smoothing;
					} else if(!(adsSwitch + adsSpeed*smoothing <= 1f) && direction == 1)
					{
						direction = 0;
					}
				} else
				{
					adsSwitch = 1f;
				}*/

				float modelScale = model.modelScale;
				float rotateX = 0;
				float rotateY = 0;
				float rotateZ = 0;
				float crouchZoom = model.crouchZoom;
				Vector3f translateXYZ;
				//Stores the model settings as local variables to reduce calls
				Vector3f customRotation = new Vector3f(model.rotateCarryPosition.x, model.rotateCarryPosition.y, model.rotateCarryPosition.z);
				Vector3f customTranslate = new Vector3f(model.translateCarryPosition.x, model.translateCarryPosition.y, model.translateCarryPosition.z);
				Vector3f sprintRotate = new Vector3f(model.sprintRotate.x, model.sprintRotate.y, model.sprintRotate.z);
				Vector3f sprintTranslate = new Vector3f(model.sprintTranslate.x, model.sprintTranslate.y, model.sprintTranslate.z);
				
				//Default render calculation, set up to be compatible with existing gun configuration
				if(model.renderPreset == 1)
				{
					rotateX = 0; //ROLL LEFT-RIGHT (0 Total ADS Default)
					rotateY = 46F - 1F * adsSwitch; //ANGLE LEFT-RIGHT (45 Total ADS Default)
					rotateZ = 1 + (-1.0F * adsSwitch); //ANGLE UP-DOWN (0 Total ADS Default)
					translateXYZ = new Vector3f(0.05F + -1.35F, 0.835F - -0.065F * adsSwitch, -1.05F - 0.35F * adsSwitch); //(-1.3F, 0.9F, -1.4F Total ADS Defaults)
				}
				//TODO; Create preset
				else if(model.renderPreset == 2)
				{
					//Should probably just remove/replace this system if we add sway in hand
					rotateX = (0 + randomRotateOffset) - (randomRotateOffset * adsSwitch);
					rotateY = (46F + randomRotateOffset) - (1F + randomRotateOffset) * adsSwitch;
					rotateZ = (1 + randomRotateOffset) - (1.0F + randomRotateOffset) * adsSwitch;
					translateXYZ = new Vector3f((-1.3F + randomOffset) - (0 + randomOffset) * adsSwitch, (0.835F + randomOffset) - (-0.065F + randomOffset) * adsSwitch, (-1.05F + randomOffset) - (0.35F + randomOffset) * adsSwitch);
				}
				//Custom render, modified through gun model with rotateCarryPosition & translateCarryPosition
				else//(3)
				{
					rotateX = (0 + customRotation.x) - (customRotation.x * adsSwitch);
					rotateY = (46F + customRotation.y) - (1F + customRotation.y) * adsSwitch;
					rotateZ = (1 + customRotation.z) - (1.0F + customRotation.z) * adsSwitch;
					translateXYZ = new Vector3f((-1.3F + customTranslate.x) - (0 + customTranslate.x) * adsSwitch, (0.835F + customTranslate.y) - (-0.065F + customTranslate.y) * adsSwitch, (-1.05F + customTranslate.z) - (0.35F + customTranslate.z) * adsSwitch);
				}
				//Apply rotation and translation to model, based on renderPreset and player state
				//Applies a special position if player is sprinting and not ADS
				if(ItemGun.isSprinting && adsSwitch <= 0.5)
				{	
					GL11.glRotatef(rotateX + sprintRotate.x, 1F, 0F, 0F); //ROLL LEFT-RIGHT
					GL11.glRotatef(rotateY + sprintRotate.y, 0F, 1F, 0F); //ANGLE LEFT-RIGHT
					GL11.glRotatef(rotateZ + sprintRotate.z, 0F, 0F, 1F); //ANGLE UP-DOWN
					GL11.glTranslatef(translateXYZ.x + sprintTranslate.x, translateXYZ.y + sprintTranslate.y, translateXYZ.z + sprintTranslate.z);
				break;	
				}
				//Applies a special position if player is crouching and ADS
				else if(ItemGun.isCrouching && crouchZoom != 0 && adsSwitch >= 0.5)
				{
					GL11.glRotatef(rotateX, 1F, 0F, 0F); //ROLL LEFT-RIGHT
					GL11.glRotatef(rotateY, 0F, 1F, 0F); //ANGLE LEFT-RIGHT
					GL11.glRotatef(rotateZ, 0F, 0F, 1F); //ANGLE UP-DOWN
					GL11.glTranslatef(translateXYZ.x + crouchZoom, translateXYZ.y, translateXYZ.z);
					break;	
				}
				//Default position
				else
				{
					GL11.glRotatef(rotateX, 1F, 0F, 0F); //ROLL LEFT-RIGHT
					GL11.glRotatef(rotateY, 0F, 1F, 0F); //ANGLE LEFT-RIGHT
					GL11.glRotatef(rotateZ, 0F, 0F, 1F); //ANGLE UP-DOWN
					GL11.glTranslatef(translateXYZ.x, translateXYZ.y, translateXYZ.z);
					break;	
				}
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
