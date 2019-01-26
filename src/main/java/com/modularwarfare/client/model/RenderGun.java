package com.modularwarfare.client.model;

import java.util.Random;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.AnimStateMachine;
import com.modularwarfare.client.ClientRenderHooks;
import com.modularwarfare.common.guns.AmmoType;
import com.modularwarfare.common.guns.AttachmentEnum;
import com.modularwarfare.common.guns.AttachmentType;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemAmmo;
import com.modularwarfare.common.guns.ItemAttachment;
import com.modularwarfare.common.guns.ItemGun;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderGun implements CustomItemRenderer {

	private static TextureManager renderEngine;
	public static float smoothing;

	public static String lastModel = "";
	public static float adsSwitch = 0f;
	public static float sprintSwitch = 0f;
	public static float crouchSwitch = 0f;
	public static float reloadSwitch = 1f;
	public static float swayVertical = 0f;
	public static float swayHorizontal = 0f;
	public static Float swayVerticalEP;
	public static Float swayHorizontalEP;
	public static int shotState = 0;
	
	private int direction = 0;
	
	private float lastReloadProgress = 0f;
	
	@Override
	public void renderItem(CustomItemRenderType type, EnumHand hand, ItemStack item, Object... data) {
		if (!(item.getItem() instanceof ItemGun))
			return;
		
		GunType gunType = ((ItemGun) item.getItem()).type;
		if (gunType == null)
			return;

		ModelGun model = (ModelGun) gunType.model;
		if (model == null)
			return;
		{
			AnimStateMachine animations = data.length >= 2 ? (EntityLivingBase) data[1] instanceof EntityPlayer ? ClientRenderHooks.getAnimations((EntityPlayer) data[1]) : new AnimStateMachine() : new AnimStateMachine();
			renderGun(type, item, animations, gunType, data);
		}
	}

	private void renderGun(CustomItemRenderType renderType, ItemStack item, AnimStateMachine animations, GunType gunType, Object... data) {

		ModelGun model = (ModelGun) gunType.model;
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
				int isCrouching = entityLivingBase.isSneaking() && adsSwitch >= 0.5F ? 1 : 0;
				float hipRecover = reloadSwitch;
								
				//Store the model settings as local variables to reduce calls
				Vector3f customHipRotation = new Vector3f(model.rotateHipPosition.x + (model.sprintRotate.x * sprintSwitch * hipRecover), model.rotateHipPosition.y + (model.sprintRotate.y * sprintSwitch * hipRecover), model.rotateHipPosition.z + (model.sprintRotate.z * sprintSwitch * hipRecover));
				Vector3f customHipTranslate = new Vector3f(model.translateHipPosition.x + (model.sprintTranslate.x * sprintSwitch * hipRecover), model.translateHipPosition.y + (model.sprintTranslate.y * sprintSwitch * hipRecover), model.translateHipPosition.z + (model.sprintTranslate.z * sprintSwitch * hipRecover));
				Vector3f customAimRotation = new Vector3f(model.rotateAimPosition.x, model.rotateAimPosition.y, model.rotateAimPosition.z);
				Vector3f customAimTranslate = new Vector3f(model.translateAimPosition.x, model.translateAimPosition.y, model.translateAimPosition.z);
				
				//Default render position calculation, set up to be compatible with existing gun configuration
				adsSwitch = animations.reloading ? 0f : adsSwitch;
				rotateX = (0 + customHipRotation.x) - (0F + customAimRotation.x + customHipRotation.x * adsSwitch);
				rotateY = (46F + customHipRotation.y + swayHorizontal) - (1F + customAimRotation.y + customHipRotation.y + swayHorizontal) * adsSwitch;
				rotateZ = (1 + customHipRotation.z + swayVertical) - (1.0F + customAimRotation.z + customHipRotation.z + swayVertical) * adsSwitch;
				translateX = (-1.3F + customHipTranslate.x) - (0.0F + customAimTranslate.x + customHipTranslate.x) * adsSwitch; //-1.3
				translateY = (0.834F + customAimTranslate.y + customHipTranslate.y) - (-0.064F + customHipTranslate.y) * adsSwitch;//0.898
				translateZ = (-1.05F + customHipTranslate.z) - (0.35F + customAimTranslate.z + customHipTranslate.z) * adsSwitch;//-1.4
			
				float bobModifier = !entityLivingBase.isSprinting() ? adsSwitch == 0F ? !animations.reloading ? 0.7F : 0.2F: 0F : !animations.reloading ? adsSwitch == 0 ? 0.75F : 0.15F : 0.4F;
				EntityPlayer entityplayer = (EntityPlayer)Minecraft.getMinecraft().getRenderViewEntity();
				float f1 = (entityplayer.distanceWalkedModified - entityplayer.prevDistanceWalkedModified) * bobModifier;
				float f2 = -(entityplayer.distanceWalkedModified + f1 * smoothing) * bobModifier;
				float f3 = (entityplayer.prevCameraYaw + (entityplayer.cameraYaw - entityplayer.prevCameraYaw) * smoothing) * bobModifier;
				float f4 = (entityplayer.prevCameraPitch + (entityplayer.cameraPitch - entityplayer.prevCameraPitch) * smoothing) * bobModifier;
				GlStateManager.translate(MathHelper.sin(f2 * (float)Math.PI) * f3 * 0.5F, -Math.abs(MathHelper.cos(f2 * (float)Math.PI) * f3), 0.0F);
				GlStateManager.rotate(MathHelper.sin(f2 * (float)Math.PI) * f3 * 3.0F, 0.0F, 0.0F, 1.0F);
				GlStateManager.rotate(Math.abs(MathHelper.cos(f2 * (float)Math.PI - 0.2F) * f3) * 5.0F, 1.0F, 0.0F, 0.0F);
				GlStateManager.rotate(f4, 1.0F, 0.0F, 0.0F);
				
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
						"skins/guns/" + gunType.modelSkins[0].getSkin() + ".png"));

				GL11.glScalef(modelScale, modelScale, modelScale);
				
				model.renderGun(f);
				model.renderDefaultScope(f);
				model.renderDefaultBarrel(f);
				model.renderDefaultStock(f);
				model.renderDefaultGrip(f);
				model.renderDefaultGadget(f);
				model.renderSlide(f);
				
				if(!gunType.dynamicAmmo && ItemGun.hasAmmoLoaded(item))
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
					
					model.renderAmmo(f);
				}
			}
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			{
				float f = 1F / 16F;
				
				if (renderType == CustomItemRenderType.EQUIPPED_FIRST_PERSON && model.hasArms)
					renderFirstPersonArm(Minecraft.getMinecraft().player, model, animations);
				
				
				ItemStack pumpAttachment = null;
				if (pumpAttachment == null)
				{
					GL11.glPushMatrix();
					{
						GL11.glTranslatef(-(animations.lastGunSlide + (animations.gunSlide - animations.lastGunSlide) * smoothing) * model.gunSlideDistance, 0F, 0F);
						GL11.glTranslatef(-(1 - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * smoothing)) * model.pumpHandleDistance, 0F, 0F);
						model.renderPump(f);
					}
					GL11.glPopMatrix();
				}
				
				if (model.chargeHandleDistance != 0F)
				{
					GL11.glPushMatrix();
					{
						GL11.glTranslatef(-(1 - Math.abs(animations.lastCharged + (animations.charged - animations.lastCharged) * smoothing)) * model.chargeHandleDistance, 0F, 0F);
						model.renderCharge(f);
					}
					GL11.glPopMatrix();
				}
				
				GL11.glPushMatrix();
				{
					if(ItemGun.hasAmmoLoaded(item))
					{
						ItemStack stackAmmo =  new ItemStack(item.getTagCompound().getCompoundTag("ammo"));
						ItemAmmo itemAmmo = (ItemAmmo) stackAmmo.getItem();
						AmmoType ammoType = itemAmmo.type;
						boolean shouldNormalRender = true;
						
						if (animations.reloading && model.reloadAnimation != null && WeaponAnimations.getAnimation(model.reloadAnimation) != null) {
							float effectiveReloadAnimationProgress = getEffectiveReloadAnimProgress(animations);
							float reloadRotate = getReloadAnimRotate(effectiveReloadAnimationProgress, model);	
							float clipPosition = getReloadAnimClipPos(effectiveReloadAnimationProgress, model);
							WeaponAnimations.getAnimation(model.reloadAnimation).onAmmoAnimation(model, clipPosition, reloadRotate);
						}
						
						if(gunType.dynamicAmmo && ammoType.model != null)
						{
							ModelAmmo modelAmmo = (ModelAmmo) ammoType.model;
							if(model.ammoMap.containsKey(ammoType.internalName))
							{
								Vector3f ammoOffset = model.ammoMap.get(ammoType.internalName).offset;
								Vector3f ammoScale = model.ammoMap.get(ammoType.internalName).scale;
								
								GL11.glTranslatef(ammoOffset.x, ammoOffset.y, ammoOffset.z);
								if(ammoType.magazineCount != null)
								{
									// TODO: Investigate mag count in animation
									int magCount = stackAmmo.getTagCompound().getInteger("magcount");
									float effectiveReloadAnimationProgress = animations.lastReloadAnimationProgress + (animations.reloadAnimationProgress - animations.lastReloadAnimationProgress) * smoothing;
									if(animations.reloading && effectiveReloadAnimationProgress < 0.5f)
										 magCount -= 1;
									if(modelAmmo.magCountOffset.containsKey(magCount))
									{
										shouldNormalRender = false;
										GL11.glPushMatrix();
										{
											RenderVariables magRenderVar = modelAmmo.magCountOffset.get(magCount);
											Vector3f magOffset = magRenderVar.offset;
											Vector3f magRotate = magRenderVar.rotation;
											GL11.glTranslatef(magOffset.x, magOffset.y, magOffset.z);
											if(magRotate != null && magRenderVar.angle != null)
											{
												GL11.glRotatef(magRenderVar.angle, magRotate.x, magRotate.y, magRotate.z);
											}
											
											Vector3f adjustedScale = new Vector3f(ammoScale.x, ammoScale.y, ammoScale.z);
											GL11.glScalef(adjustedScale.x, adjustedScale.y, adjustedScale.z);
											renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID,
													"skins/ammo/" + ammoType.modelSkins[0].getSkin() + ".png"));
											modelAmmo.renderAmmo(f);
										}
										GL11.glPopMatrix();
									}
								}
								
								if(shouldNormalRender)
								{
									Vector3f adjustedScale = new Vector3f(ammoScale.x, ammoScale.y, ammoScale.z);
									GL11.glScalef(adjustedScale.x, adjustedScale.y, adjustedScale.z);
								}
							}
							
							if(shouldNormalRender)
							{
								renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID,
										"skins/ammo/" + ammoType.modelSkins[0].getSkin() + ".png"));
								modelAmmo.renderAmmo(f);
							}
						}
					}
				}
				if (renderType == CustomItemRenderType.EQUIPPED_FIRST_PERSON && model.hasArms) {
					 Minecraft mc = Minecraft.getMinecraft(); 
					 renderAnimArm(mc.player, model, gunType, animations); 
				}
				GL11.glPopMatrix();
				
				for(AttachmentEnum attachment : AttachmentEnum.values())
				{
					ItemStack itemStack = GunType.getAttachment(item, attachment);
					if(itemStack != null && itemStack.getItem() != Items.AIR)
					{
						AttachmentType attachmentType = ((ItemAttachment)itemStack.getItem()).type;
						ModelAttachment attachmentModel = (ModelAttachment) attachmentType.model;
						GL11.glPushMatrix();
						{
							renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID,
									"skins/attachments/" + attachmentType.modelSkins[0].getSkin() + ".png"));
							Vector3f attachmentVec = model.attachmentPointMap.get(attachment);
							Vector3f adjustedScale = new Vector3f(attachmentModel.modelScale, attachmentModel.modelScale, attachmentModel.modelScale);
							GL11.glScalef(adjustedScale.x, adjustedScale.y, adjustedScale.z);
							GL11.glTranslatef(attachmentVec.x / attachmentModel.modelScale, attachmentVec.y / attachmentModel.modelScale, attachmentVec.z / attachmentModel.modelScale);
							
							if (attachmentModel != null)
								attachmentModel.renderAttachment(f);
						}
						GL11.glPopMatrix();
					}
				}
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
	
	public static void resetRenderMods()
	{
		RenderGun.swayHorizontal = 0f;
		RenderGun.swayVertical = 0f;
		RenderGun.swayHorizontalEP = 0f;
		RenderGun.swayVerticalEP = 0f;
		RenderGun.reloadSwitch = 0f;
		RenderGun.sprintSwitch = 0f;
		RenderGun.adsSwitch = 0f;
		RenderGun.crouchSwitch = 0f;
	}
	
	private void renderFirstPersonArm(EntityPlayer player, ModelGun model, AnimStateMachine anim) {
		Minecraft mc = Minecraft.getMinecraft();
		ModelPlayer modelplayer = new ModelPlayer(0.0F, false);
		float f = 1.0F;
		//System.out.println("called");
		// TODO: find out if still needed?
		//modelBipedMain.onGround = 0.0F;
		
		GL11.glPushMatrix();
		{
			GL11.glColor3f(f, f, f);
			mc.renderEngine.bindTexture(mc.player.getLocationSkin());
			if (!anim.reloading && model.righthandPump) {
				//System.out.println("1a");
				RenderArms.renderArmPump(model, anim, smoothing, model.rightArmRot, model.rightArmPos);
			} 
			else if (anim.charged < 0.9 && model.leftHandAmmo && model.rightHandCharge && anim.charged != -1.0F) {
				//System.out.println("1b");
				RenderArms.renderArmCharge(model, anim, smoothing, model.rightArmChargeRot, model.rightArmChargePos);
			}
			else if (anim.pumped < 0.9 && model.rightHandBolt && model.leftHandAmmo) {
				//System.out.println("1c");
				RenderArms.renderArmBolt(model, anim, smoothing, model.rightArmChargeRot, model.rightArmChargePos);
			}
			else if (!anim.reloading && !model.righthandPump) {
				//System.out.println("1d");
				RenderArms.renderArmDefault(model, anim, smoothing, model.rightArmRot, model.rightArmPos);
			}
			else {
				//System.out.println("1e");
				RenderArms.renderArmReload(model, anim, smoothing, model.rightArmReloadRot, model.rightArmReloadPos);
			}
			
//			GL11.glScalef(model.rightArmScale.x, model.rightArmScale.y, model.rightArmScale.z);
//			modelBipedMain.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, player);
//			modelBipedMain.bipedRightArm.offsetY = 0F;
//			if (model.leftHandAmmo) {
//				modelBipedMain.bipedRightArm.render(0.0625F);
//			}
			GL11.glScalef(model.rightArmScale.x, model.rightArmScale.y, model.rightArmScale.z);
			GlStateManager.color(1.0F, 1.0F, 1.0F);
			float f1 = 0.0625F;
			GlStateManager.enableBlend();
			modelplayer.swingProgress = 0.0F;
			modelplayer.isSneak = false;
			modelplayer.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, player);
			modelplayer.bipedRightArm.rotateAngleX = 0.0F;
			modelplayer.bipedRightArmwear.rotateAngleX = 0.0F;
			//modelBipedMain.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, player);
			//modelBipedMain.bipedRightArm.offsetY = 0F;
			if (model.leftHandAmmo) {
				modelplayer.bipedRightArm.render(0.0625F);
			}
			GlStateManager.disableBlend();
		}
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		if (!anim.reloading && model.lefthandPump) {
			//System.out.println("2a");
			RenderArms.renderArmPump(model, anim, smoothing, model.leftArmRot, model.leftArmPos);
		}
		else if (anim.charged < 0.9 && model.rightHandCharge && model.leftHandAmmo && anim.charged != -1.0F) {
			//System.out.println("2b");
			RenderArms.renderArmCharge(model, anim, smoothing, model.leftArmChargeRot, model.leftArmChargePos);
		}
		else if (anim.pumped < 0.9 && model.rightHandBolt && model.leftHandAmmo) {
			//System.out.println("2c");
			RenderArms.renderArmBolt(model, anim, smoothing, model.leftArmChargeRot, model.leftArmChargePos);
		} else if (!anim.reloading && !model.lefthandPump) {
			//System.out.println("2d");
			RenderArms.renderArmDefault(model, anim, smoothing, model.leftArmRot, model.leftArmPos);
		} else {
			//System.out.println("2e");
			RenderArms.renderArmReload(model, anim, smoothing, model.leftArmReloadRot, model.leftArmReloadPos);
		}

//		GL11.glScalef(model.leftArmScale.x, model.leftArmScale.y, model.leftArmScale.z);
//		modelBipedMain.bipedLeftArm.offsetY = 0F;
//		if (!model.leftHandAmmo) {
//			modelBipedMain.bipedLeftArm.render(0.0625F);
//		}
		GL11.glScalef(model.leftArmScale.x, model.leftArmScale.y, model.leftArmScale.z);
		GlStateManager.color(1.0F, 1.0F, 1.0F);
		GlStateManager.enableBlend();
		modelplayer.swingProgress = 0.0F;
		modelplayer.isSneak = false;
		modelplayer.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, player);
		modelplayer.bipedLeftArm.rotateAngleX = 0.0F;
		modelplayer.bipedLeftArmwear.rotateAngleX = 0.0F;
		//modelBipedMain.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, player);
		//modelBipedMain.bipedRightArm.offsetY = 0F;
		if (!model.leftHandAmmo) {
			modelplayer.bipedLeftArm.render(0.0625F);
		}
		GlStateManager.disableBlend();
		GL11.glPopMatrix();
	}

	private void renderAnimArm(EntityPlayer player, ModelGun model, GunType type, AnimStateMachine anim) {
		Minecraft mc = Minecraft.getMinecraft();
		ModelPlayer modelplayer = new ModelPlayer(0.0F, false);
		mc.renderEngine.bindTexture(mc.player.getLocationSkin());
		GL11.glPushMatrix();
		GL11.glScalef(1 / model.modelScale, 1 / model.modelScale, 1 / model.modelScale);
		float f = 1.0F;
		GL11.glColor3f(f, f, f);
		//modelBipedMain.onGround = 0.0F;
		GL11.glPushMatrix();
		float effectiveReloadAnimationProgress = anim.lastReloadAnimationProgress
				+ (anim.reloadAnimationProgress - anim.lastReloadAnimationProgress) * smoothing;

		if (anim.charged < 0.9 && model.rightHandCharge && !model.leftHandAmmo && anim.charged != -1.0F) {
			//System.out.println("3a");
			RenderArms.renderArmPump(model, anim, smoothing, model.rightArmRot, model.rightArmPos);
		}
		else if (anim.pumped < 0.9 && model.rightHandBolt && !model.leftHandAmmo) {
			//System.out.println("3b");
			RenderArms.renderArmBolt(model, anim, smoothing, model.rightArmChargeRot, model.rightArmChargePos);
		}
		else if (!anim.reloading) {
			//System.out.println("3c");	
			RenderArms.renderArmDefault(model, anim, smoothing, model.rightArmRot, model.rightArmPos);
		}
		else {
			//System.out.println("3d");
			RenderArms.renderArmReload(model, anim, smoothing, model.rightArmReloadRot, model.rightArmReloadPos);
		}

		GL11.glScalef(model.rightArmScale.x, model.rightArmScale.y, model.rightArmScale.z);
		GlStateManager.color(1.0F, 1.0F, 1.0F);
		float f1 = 0.0625F;
		GlStateManager.enableBlend();
		modelplayer.swingProgress = 0.0F;
		modelplayer.isSneak = false;
		modelplayer.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, player);
		modelplayer.bipedRightArm.rotateAngleX = 0.0F;
		modelplayer.bipedRightArmwear.rotateAngleX = 0.0F;
		//modelBipedMain.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, player);
		//modelBipedMain.bipedRightArm.offsetY = 0F;
		if (!model.leftHandAmmo) {
			modelplayer.bipedRightArm.render(0.0625F);
		}
		GlStateManager.disableBlend();
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		if (anim.charged < 0.9 && model.leftHandCharge && model.leftHandAmmo && anim.charged != -1.0F) {
			//System.out.println("4a");
			RenderArms.renderArmCharge(model, anim, smoothing, model.leftArmChargeRot, model.leftArmChargePos);
		}

		else if (!anim.reloading && model.lefthandPump) {
			//System.out.println("4b");
			RenderArms.renderArmPump(model, anim, smoothing, model.leftArmRot, model.leftArmPos);
		}

		else if (!anim.reloading) {
			//System.out.println("4c");
			RenderArms.renderArmDefault(model, anim, smoothing, model.leftArmRot, model.leftArmPos);
		}
		else {
			//System.out.println("4d");
			RenderArms.renderArmReload(model, anim, smoothing, model.leftArmReloadRot, model.leftArmReloadPos);
		}

		/*GL11.glScalef(model.leftArmScale.x, model.leftArmScale.y, model.leftArmScale.z);
		modelplayer.bipedLeftArm.offsetY = 0F;
		if (model.leftHandAmmo) {
			modelplayer.bipedLeftArm.render(0.0625F);
		}*/
		GL11.glScalef(model.leftArmScale.x, model.leftArmScale.y, model.leftArmScale.z);
		GlStateManager.color(1.0F, 1.0F, 1.0F);
		GlStateManager.enableBlend();
		modelplayer.swingProgress = 0.0F;
		modelplayer.isSneak = false;
		modelplayer.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, player);
		modelplayer.bipedLeftArm.rotateAngleX = 0.0F;
		modelplayer.bipedLeftArmwear.rotateAngleX = 0.0F;
		//modelBipedMain.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, player);
		//modelBipedMain.bipedRightArm.offsetY = 0F;
		if (model.leftHandAmmo) {
			modelplayer.bipedLeftArm.render(0.0625F);
		}
		GlStateManager.disableBlend();
		GL11.glPopMatrix();

		GL11.glPopMatrix();
	}

}
