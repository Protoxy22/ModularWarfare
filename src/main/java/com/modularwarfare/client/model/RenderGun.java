package com.modularwarfare.client.model;

import java.util.Random;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.AnimStateMachine;
import com.modularwarfare.client.ClientRenderHooks;
import com.modularwarfare.common.guns.AmmoType;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemAmmo;
import com.modularwarfare.common.guns.ItemGun;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;

public class RenderGun implements CustomItemRenderer {

	private static TextureManager renderEngine;
	public static float smoothing;

	public static float adsSwitch = 0f;
	public static float sprintSwitch = 0f;
	public static float crouchSwitch = 0f;
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
			AnimStateMachine animations = data.length >= 2 ? (EntityLivingBase) data[1] instanceof EntityPlayer ? ClientRenderHooks.getAnimations((EntityPlayer) data[1]) : new AnimStateMachine() : new AnimStateMachine();
			renderGun(type, item, animations, gunType, data);
		}
	}

	private void renderGun(CustomItemRenderType renderType, ItemStack item, AnimStateMachine animations, GunType gunType, Object... data) {

		ModelGun model = gunType.model;
		float min = -1.5f;
        float max = 1.5f;
        float randomNum = new Random().nextFloat();
        float randomShake = min + (randomNum * (max - min));
		
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
				EntityLivingBase entityLivingBase = (EntityLivingBase) data[1];
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
				EntityLivingBase entityLivingBase = (EntityLivingBase) data[1];
				float modelScale = model.modelScale;
				float rotateX = 0;
				float rotateY = 0;
				float rotateZ = 0;
				float translateX= 0;
				float translateY = 0;
				float translateZ = 0;
				float crouchZoom = model.crouchZoom;
				//int sprintSwitch = entityLivingBase.isSprinting() && adsSwitch <= 0.5F ? 1 : 0;
				int isCrouching = entityLivingBase.isSneaking() && adsSwitch >= 0.5F ? 1 : 0;
				
				//Store the model settings as local variables to reduce calls
				Vector3f customHipRotation = new Vector3f(model.rotateHipPosition.x + (model.sprintRotate.x * sprintSwitch), model.rotateHipPosition.y + (model.sprintRotate.y * sprintSwitch), model.rotateHipPosition.z + (model.sprintRotate.z * sprintSwitch));
				Vector3f customHipTranslate = new Vector3f(model.translateHipPosition.x + (model.sprintTranslate.x * sprintSwitch), model.translateHipPosition.y + (model.sprintTranslate.y * sprintSwitch), model.translateHipPosition.z + (model.sprintTranslate.z * sprintSwitch));
				Vector3f customAimRotation = new Vector3f(model.rotateAimPosition.x, model.rotateAimPosition.y, model.rotateAimPosition.z);
				Vector3f customAimTranslate = new Vector3f(model.translateAimPosition.x, model.translateAimPosition.y, model.translateAimPosition.z);
				Vector3f sprintRotate = new Vector3f(model.sprintRotate.x, model.sprintRotate.y, model.sprintRotate.z);
				Vector3f sprintTranslate = new Vector3f(model.sprintTranslate.x, model.sprintTranslate.y, model.sprintTranslate.z);
				
				//Default render position calculation, set up to be compatible with existing gun configuration
				rotateX = (0 + customHipRotation.x) - (0F + customAimRotation.x + customHipRotation.x * adsSwitch);
				rotateY = (46F + customHipRotation.y) - (1F + customAimRotation.y + customHipRotation.y) * adsSwitch;
				rotateZ = (1 + customHipRotation.z) - (1.0F + customAimRotation.z + customHipRotation.z) * adsSwitch;
				translateX = (-1.3F + customHipTranslate.x) - (0.0F + customAimTranslate.x + customHipTranslate.x) * adsSwitch; //-1.3
				translateY = (0.834F + customAimTranslate.y + customHipTranslate.y) - (-0.064F + customHipTranslate.y) * adsSwitch;//0.898
				translateZ = (-1.05F + customHipTranslate.z) - (0.35F + customAimTranslate.z + customHipTranslate.z) * adsSwitch;//-1.4
			
				
				//Position calls and apply a special position if player is sprinting or crouching
				GL11.glRotatef(rotateX, 1F, 0F, 0F); //ROLL LEFT-RIGHT
				GL11.glRotatef(rotateY, 0F, 1F, 0F); //ANGLE LEFT-RIGHT
				GL11.glRotatef(rotateZ, 0F, 0F, 1F); //ANGLE UP-DOWN
				GL11.glTranslatef(translateX + (crouchZoom * crouchSwitch), 0F, 0F);
				GL11.glTranslatef(0F, translateY, 0F);
				GL11.glTranslatef(0F, 0F, translateZ);
				
				if (animations.reloading && model.reloadAnimation != null && WeaponAnimations.getAnimation(model.reloadAnimation) != null) {
					float effectiveReloadAnimationProgress = getEffectiveReloadAnimProgress(animations);
					float reloadRotate = getReloadAnimRotate(effectiveReloadAnimationProgress, model);					
					WeaponAnimations.getAnimation(model.reloadAnimation).onGunAnimation(reloadRotate, adsSwitch);
				}
				
				//Recoil
				GL11.glTranslatef(-(animations.lastGunRecoil + (animations.gunRecoil - animations.lastGunRecoil) * smoothing) * model.modelRecoilBackwards, 0F, 0F);
				GL11.glRotatef(-(animations.lastGunRecoil + (animations.gunRecoil - animations.lastGunRecoil) * smoothing) * model.modelRecoilUpwards, 0F, 0F, 1F);
				GL11.glRotatef(((-animations.lastGunRecoil + (animations.gunRecoil - animations.lastGunRecoil) * smoothing) * randomShake * model.modelRecoilShake), 0.0f, 1.0f, 0.0f);
		        GL11.glRotatef(((-animations.lastGunRecoil + (animations.gunRecoil - animations.lastGunRecoil) * smoothing) * randomShake * model.modelRecoilShake), 1.0f, 0.0f, 0.0f);

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
				
				GL11.glPushMatrix();
				{
					if(ItemGun.hasAmmoLoaded(item))
					{
						ItemStack stackAmmo =  new ItemStack(item.getTagCompound().getCompoundTag("ammo"));
						ItemAmmo itemAmmo = (ItemAmmo) stackAmmo.getItem();
						AmmoType ammoType = itemAmmo.type;
						
						if (animations.reloading && model.reloadAnimation != null && WeaponAnimations.getAnimation(model.reloadAnimation) != null) {
							float effectiveReloadAnimationProgress = getEffectiveReloadAnimProgress(animations);
							float reloadRotate = getReloadAnimRotate(effectiveReloadAnimationProgress, model);	
							float clipPosition = getReloadAnimClipPos(effectiveReloadAnimationProgress, model);
							WeaponAnimations.getAnimation(model.reloadAnimation).onAmmoAnimation(model, clipPosition, reloadRotate);
						}
						
						if(gunType.dynamicAmmo && ammoType.model != null)
						{
							if(model.ammoMap.containsKey(ammoType.internalName))
							{
								Vector3f ammoOffset = model.ammoMap.get(ammoType.internalName).offset;
								Vector3f ammoScale = model.ammoMap.get(ammoType.internalName).scale;
								
								GL11.glTranslatef(ammoOffset.x, ammoOffset.y, ammoOffset.z);
								if(ammoType.magazineCount != null)
								{
									int magCount = stackAmmo.getTagCompound().getInteger("magcount");
									float effectiveReloadAnimationProgress = animations.lastReloadAnimationProgress + (animations.reloadAnimationProgress - animations.lastReloadAnimationProgress) * smoothing;
									if(animations.reloading && effectiveReloadAnimationProgress < 0.5f)
										 magCount -= 1;
									if(ammoType.model.magCountOffset.containsKey(magCount))
									{
										RenderVariables magRenderVar = ammoType.model.magCountOffset.get(magCount);
										Vector3f magOffset = magRenderVar.offset;
										Vector3f magRotate = magRenderVar.rotation;
										GL11.glTranslatef(magOffset.x, magOffset.y, magOffset.z);
										if(magRotate != null && magRenderVar.angle != null)
										{
											GL11.glRotatef(magRenderVar.angle, magRotate.x, magRotate.y, magRotate.z);
										}
									}
								}
								Vector3f adjustedScale = new Vector3f(ammoScale.x / modelScale, ammoScale.y / modelScale, ammoScale.z / modelScale);
								GL11.glScalef(adjustedScale.x, adjustedScale.y, adjustedScale.z);
							}
							ammoType.model.renderAmmo(f);
						} else
						{
							model.renderAmmo(f);
						}
					}
				}
				GL11.glPopMatrix();
				/*
				 * TODO: Arm render call
				 * if (renderType == ItemRenderType.EQUIPPED_FIRST_PERSON && model.hasArms) {
				 * Minecraft mc = Minecraft.getMinecraft(); renderAnimArm(mc.thePlayer, model,
				 * renderType, animations); }
				 */
			}
			GL11.glPopMatrix();
		}
		GL11.glPopMatrix();
	}
	
	private float getReloadAnimClipPos(float effectiveReloadAnimationProgress, ModelGun model) {
		float tiltGunTime = model.tiltGunTime, unloadClipTime = model.unloadClipTime, loadClipTime = model.loadClipTime;
		float clipPosition = 0F;
		if (effectiveReloadAnimationProgress > tiltGunTime && effectiveReloadAnimationProgress < tiltGunTime + unloadClipTime)
			clipPosition = (effectiveReloadAnimationProgress - tiltGunTime) / unloadClipTime;
		if (effectiveReloadAnimationProgress >= tiltGunTime + unloadClipTime && effectiveReloadAnimationProgress < tiltGunTime + unloadClipTime + loadClipTime)
			clipPosition = 1F - (effectiveReloadAnimationProgress - (tiltGunTime + unloadClipTime)) / loadClipTime;
		float loadOnlyClipPosition = Math.max(0F, Math.min(1F, 1F - ((effectiveReloadAnimationProgress - tiltGunTime) / (unloadClipTime + loadClipTime))));
		return clipPosition;
	}

	private float getReloadAnimRotate(float effectiveReloadAnimationProgress, ModelGun model) {
		float reloadRotate = 1f;
		if (effectiveReloadAnimationProgress < model.tiltGunTime)
			reloadRotate = effectiveReloadAnimationProgress / model.tiltGunTime;
		if (effectiveReloadAnimationProgress > model.tiltGunTime + model.unloadClipTime
				+ model.loadClipTime)
			reloadRotate = 1F - (effectiveReloadAnimationProgress
					- (model.tiltGunTime + model.unloadClipTime + model.loadClipTime))
					/ model.untiltGunTime;
		return reloadRotate;
	}

	private float getEffectiveReloadAnimProgress(AnimStateMachine animations) {
		return animations.lastReloadAnimationProgress
				+ (animations.reloadAnimationProgress - animations.lastReloadAnimationProgress) * smoothing;
	}

}
