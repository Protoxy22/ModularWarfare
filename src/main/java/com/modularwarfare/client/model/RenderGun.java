package com.modularwarfare.client.model;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemAmmo;
import com.modularwarfare.common.guns.ItemGun;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;

public class RenderGun implements CustomItemRenderer {

	private static TextureManager renderEngine;
	public static float smoothing;

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
		//EntityPlayerSP player = Minecraft.getMinecraft().player;
		EntityLivingBase entityLivingBase = (EntityLivingBase) data[1];
		
		if (renderEngine == null)
			renderEngine = Minecraft.getMinecraft().renderEngine;

		if (model == null)
			return;

		GL11.glPushMatrix();
		{
			switch (renderType) {

			case ENTITY: {
				//GL11.glRotatef(180F, 0F, 1F, 0F);
				GL11.glTranslatef(-0.45F + model.itemFrameOffset.x, -0.05F + model.itemFrameOffset.y, model.itemFrameOffset.z);
				break;
			}

			case EQUIPPED: {
				float crouchOffset = entityLivingBase.isSneaking() ? -0.18f : 0.0f;
				GL11.glRotatef(0F, 1F, 0F, 0F);
				GL11.glRotatef(-90F, 0F, 1F, 0F);
				GL11.glRotatef(90F, 0F, 0F, 1F);
				GL11.glTranslatef(0.25F, 0F, -0.05F);
				GL11.glScalef(1F, 1F, 1F);
				GL11.glTranslatef(model.thirdPersonOffset.x, model.thirdPersonOffset.y + crouchOffset, model.thirdPersonOffset.z);
				break;
			}

			case EQUIPPED_FIRST_PERSON: {
				float modelScale = model.modelScale;
				float rotateX = 0;
				float rotateY = 0;
				float rotateZ = 0;
				float crouchZoom = model.crouchZoom;
				Vector3f translateXYZ;
				int isSprinting = entityLivingBase.isSprinting() && adsSwitch <= 0.5F ? 1 : 0;
				int isCrouching = entityLivingBase.isSneaking() && adsSwitch >= 0.5F ? 1 : 0;
				
				//Store the model settings as local variables to reduce calls
				Vector3f customHipRotation = new Vector3f(model.rotateHipPosition.x, model.rotateHipPosition.y, model.rotateHipPosition.z);
				Vector3f customHipTranslate = new Vector3f(model.translateHipPosition.x, model.translateHipPosition.y, model.translateHipPosition.z);
				Vector3f customAimRotation = new Vector3f(model.rotateAimPosition.x, model.rotateAimPosition.y, model.rotateAimPosition.z);
				Vector3f customAimTranslate = new Vector3f(model.translateAimPosition.x, model.translateAimPosition.y, model.translateAimPosition.z);
				Vector3f sprintRotate = new Vector3f(model.sprintRotate.x, model.sprintRotate.y, model.sprintRotate.z);
				Vector3f sprintTranslate = new Vector3f(model.sprintTranslate.x, model.sprintTranslate.y, model.sprintTranslate.z);
				
				//Default render position calculation, set up to be compatible with existing gun configuration
				rotateX = (0 + customHipRotation.x) - (0F + customAimRotation.x + customHipRotation.x * adsSwitch);
				rotateY = (46F + customHipRotation.y) - (1F + customAimRotation.y + customHipRotation.y) * adsSwitch;
				rotateZ = (1 + customHipRotation.z) - (1.0F + customAimRotation.z + customHipRotation.z) * adsSwitch;
				translateXYZ = new Vector3f((-1.3F + customHipTranslate.x) - (0.0F + customAimTranslate.x + customHipTranslate.x) * adsSwitch, (0.834F + customAimTranslate.y + customHipTranslate.y) - (-0.064F + customHipTranslate.y) * adsSwitch, (-1.05F + customHipTranslate.z) - (0.35F + customAimTranslate.z + customHipTranslate.z) * adsSwitch);

				//Position calls and apply a special position if player is sprinting or crouching
				GL11.glRotatef(rotateX + (sprintRotate.x * isSprinting), 1F, 0F, 0F); //ROLL LEFT-RIGHT
				GL11.glRotatef(rotateY + (sprintRotate.y * isSprinting), 0F, 1F, 0F); //ANGLE LEFT-RIGHT
				GL11.glRotatef(rotateZ + (sprintRotate.z * isSprinting), 0F, 0F, 1F); //ANGLE UP-DOWN
				GL11.glTranslatef(translateXYZ.x + (sprintTranslate.x * isSprinting) + (crouchZoom * isCrouching), 0F, 0F);
				GL11.glTranslatef(0F, translateXYZ.y + (sprintTranslate.y * isSprinting), 0F);
				GL11.glTranslatef(0F, 0F, translateXYZ.z + (sprintTranslate.z * isSprinting));
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

				model.renderGun(f);
				model.renderDefaultScope(f);
				model.renderDefaultBarrel(f);
				model.renderDefaultStock(f);
				model.renderDefaultGrip(f);
				model.renderDefaultGadget(f);
				model.renderSlide(f);
				
				if(ItemGun.hasAmmoLoaded(item))
				{
					ItemAmmo itemAmmo = (ItemAmmo) new ItemStack(item.getTagCompound().getCompoundTag("ammo")).getItem();
					itemAmmo.type.model.renderAmmo(f);
				}

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
