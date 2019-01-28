package com.modularwarfare.client.model;

import java.util.Random;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.AnimStateMachine;
import com.modularwarfare.client.ClientRenderHooks;
import com.modularwarfare.common.armor.ItemMWArmor;
import com.modularwarfare.common.guns.AmmoType;
import com.modularwarfare.common.guns.AttachmentEnum;
import com.modularwarfare.common.guns.AttachmentType;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemAmmo;
import com.modularwarfare.common.guns.ItemAttachment;
import com.modularwarfare.common.guns.ItemGun;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
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
	
	public static float triggerPullSwitch;
	
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
		Minecraft mc = Minecraft.getMinecraft(); 
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
				float crouchZoom = animations.reloading ? 0f : model.crouchZoom;
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
					float reloadProgress = getReloadProgress(animations);
					float tiltProgress = getReloadTiltProgress(reloadProgress, model);					
					WeaponAnimations.getAnimation(model.reloadAnimation).onGunAnimation(tiltProgress);
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
			
			if (renderType == CustomItemRenderType.EQUIPPED_FIRST_PERSON) {
				 renderStaticArm(mc.player, model, animations); 
			}
			
			GL11.glPushMatrix();
			{
				float f = 1F / 16F;
				float modelScale = model.modelScale;

				renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID,
						"skins/guns/" + gunType.modelSkins[0].getSkin() + ".png"));

				GL11.glScalef(modelScale, modelScale, modelScale);
				
				model.renderGun(f);
				if(GunType.getAttachment(item, AttachmentEnum.Sight) == null)
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
						boolean shouldNormalRender = true;
						
						if (animations.reloading && model.reloadAnimation != null && WeaponAnimations.getAnimation(model.reloadAnimation) != null) {
							float reloadProgress = getReloadProgress(animations);
							float tiltProgress = getReloadTiltProgress(reloadProgress, model);	
							float clipPosition = getReloadClipPosition(reloadProgress, model);
							WeaponAnimations.getAnimation(model.reloadAnimation).onAmmoAnimation(model, clipPosition);
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
									float reloadProgress = animations.lastReloadAnimationProgress + (animations.reloadAnimationProgress - animations.lastReloadAnimationProgress) * smoothing;
									if(animations.reloading && reloadProgress < 0.5f)
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
											
											Vector3f adjustedScale = new Vector3f(ammoScale.x / modelScale, ammoScale.y / modelScale, ammoScale.z / modelScale);
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
									Vector3f adjustedScale = new Vector3f(ammoScale.x / modelScale, ammoScale.y / modelScale, ammoScale.z / modelScale);
									GL11.glScalef(adjustedScale.x, adjustedScale.y, adjustedScale.z);
								}
							}
							
							if(shouldNormalRender)
							{
								renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID,
										"skins/ammo/" + ammoType.modelSkins[0].getSkin() + ".png"));
								modelAmmo.renderAmmo(f);
							}
						} else
						{
							model.renderAmmo(f);
						}
					}
				}
				
				if(ModularWarfare.DEV_ENV){
					renderMovingArm(mc.player, model, animations); 
				}
				else if (renderType == CustomItemRenderType.EQUIPPED_FIRST_PERSON) {
					renderMovingArm(mc.player, model, animations); 
				}
				
				GL11.glPopMatrix();
			}
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			{
				float f = 1F / 16F;
				
				
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
				
				for(AttachmentEnum attachment : AttachmentEnum.values())
				{
					ItemStack itemStack = GunType.getAttachment(item, attachment);
					if(itemStack != null && itemStack.getItem() != Items.AIR)
					{
						AttachmentType attachmentType = ((ItemAttachment)itemStack.getItem()).type;
						ModelAttachment attachmentModel = (ModelAttachment) attachmentType.model;
						if(attachmentModel != null)
						{
							GL11.glPushMatrix();
							{
								renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID,
										"skins/attachments/" + attachmentType.modelSkins[0].getSkin() + ".png"));
								Vector3f attachmentVec = model.attachmentPointMap.get(attachment);
								Vector3f adjustedScale = new Vector3f(attachmentModel.modelScale, attachmentModel.modelScale, attachmentModel.modelScale);
								GL11.glScalef(adjustedScale.x, adjustedScale.y, adjustedScale.z);
								GL11.glTranslatef(attachmentVec.x / attachmentModel.modelScale, attachmentVec.y / attachmentModel.modelScale, attachmentVec.z / attachmentModel.modelScale);
								attachmentModel.renderAttachment(f);
							}
							GL11.glPopMatrix();
						}
					}
				}
			}
			GL11.glPopMatrix();
		}
		GL11.glPopMatrix();
	}
	
	//Calculates the ammo position during the unloadClip and loadClip stages of the reload
	private float getReloadClipPosition(float reloadProgress, ModelGun model) 
	{
		float clipPosition = 0F;
		//These values must always add up to 1.0 and control which of the 4 states the reload animation is in by comparing their value to reloadProgress
		float tiltGunTime = model.tiltGunTime, unloadClipTime = model.unloadClipTime, loadClipTime = model.loadClipTime, untiltGunTime = model.untiltGunTime;
		//Unload half of animation (Starts moving after Progress passes tiltGunTime, moves until Progress reaches tiltGunTime + unloadClipTime)
		if (reloadProgress > tiltGunTime && reloadProgress < tiltGunTime + unloadClipTime)
			//Moves the ammo down 0 to 2.4
			clipPosition = (reloadProgress - tiltGunTime) / unloadClipTime;

		//Load half of animation (Starts moving after Progress passes tiltGunTime + unloadClipTime, moves until Progress reaches 1.0 - untiltGunTime (Back to original position))
		if (reloadProgress >= tiltGunTime + unloadClipTime && reloadProgress < 1 - untiltGunTime)
			//Moves the ammo up -2.4 to 0
			clipPosition = 1F - (reloadProgress - (tiltGunTime + unloadClipTime)) / loadClipTime;

		//WIP LOAD ONLY
		float loadOnlyClipPosition = Math.max(0F, Math.min(1F, 1F - ((reloadProgress - tiltGunTime) / (unloadClipTime + loadClipTime))));
		
		return clipPosition;
	}
	
	//Calculates the tilt and untilt at the start and end of the reload animation
	private float getReloadTiltProgress(float reloadProgress, ModelGun model) {
		float tiltProgress = 1f;
		if (reloadProgress < model.tiltGunTime)
			tiltProgress = reloadProgress / model.tiltGunTime;
		if (reloadProgress > model.tiltGunTime + model.unloadClipTime
				+ model.loadClipTime)
			tiltProgress = 1F - (reloadProgress
					- (model.tiltGunTime + model.unloadClipTime + model.loadClipTime))
					/ model.untiltGunTime;
		return tiltProgress;
	}

	private float getReloadProgress(AnimStateMachine animations) {
		return animations.lastReloadAnimationProgress
				+ (animations.reloadAnimationProgress - animations.lastReloadAnimationProgress) * smoothing;
	}
	
	private String getStaticArmState(ModelGun model, AnimStateMachine anim)
	{
		String staticArmState;
		if(model.leftHandAmmo) 
		{
			if(!anim.reloading && model.righthandPump) staticArmState = "Pump";
			else if(anim.charged < 0.9 && model.rightHandCharge && anim.charged != -1.0F) staticArmState = "Charge";
			else if(anim.pumped < 0.9 && model.rightHandBolt) staticArmState = "Bolt";
			else if(!anim.reloading && !model.righthandPump) staticArmState = "Default";
			else staticArmState = "Reload";
			//System.out.println("Static Right Arm" + " - " + staticArmState);
		}
		else 
		{
			if (!anim.reloading && model.lefthandPump) staticArmState = "Pump";
			else if (anim.charged < 0.9 && model.rightHandCharge && anim.charged != -1.0F) staticArmState = "Charge";
			else if (anim.pumped < 0.9 && model.rightHandBolt) staticArmState = "Bolt";
			else if (!anim.reloading && !model.lefthandPump) staticArmState = "Default";
			else staticArmState = "Reload";
			//System.out.println("Static Left Arm" + " - " + staticArmState);
		}
		return staticArmState;
	}
	private String getMovingArmState(ModelGun model, AnimStateMachine anim)
	{
		String movingArmState;
		if(!model.leftHandAmmo) 
		{
			if(anim.charged < 0.9 && model.rightHandCharge && anim.charged != -1.0F) movingArmState = "Pump";
			else if(anim.pumped < 0.9 && model.rightHandBolt) movingArmState = "Bolt";
			else if(!anim.reloading) movingArmState = "Default";
			else movingArmState = "Reload";
			//System.out.println("Moving Right Arm" + " - " + movingArmState);
		}
		else 
		{
			if (anim.charged < 0.9 && model.leftHandCharge && anim.charged != -1.0F) movingArmState = "Charge";
			else if (!anim.reloading && model.lefthandPump) movingArmState = "Pump";
			else if (!anim.reloading) movingArmState = "Default";
			else movingArmState = "Reload";
			//System.out.println("Moving Left Arm" + " - " + movingArmState);
		}
		return movingArmState;
	}
	// Resets render modifiers
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
	//Renders the static left or right hand that does not move with the ammo depending on leftHandAmmo setting
	private void renderStaticArm(EntityPlayer player, ModelGun model, AnimStateMachine anim) {
		Minecraft mc = Minecraft.getMinecraft();
		ModelPlayer modelplayer = new ModelPlayer(0.0F, false);
		float tiltProgress = getReloadTiltProgress(getReloadProgress(anim), model);	
		String staticArmState = getStaticArmState(model, anim);
		
		if (model.leftHandAmmo) 
		{
			GL11.glPushMatrix();
			{
				if(mc.player.getSkinType() != "slim")
					mc.renderEngine.bindTexture(mc.player.getLocationSkin());
				else
					mc.renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/armSkin.png"));
				
				if (staticArmState == "Pump") RenderArms.renderArmPump(model, anim, smoothing, model.rightArmRot, model.rightArmPos);
				else if (staticArmState == "Charge") RenderArms.renderArmCharge(model, anim, smoothing, model.rightArmChargeRot, model.rightArmChargePos);
				else if (staticArmState == "Bolt") RenderArms.renderArmBolt(model, anim, smoothing, model.rightArmChargeRot, model.rightArmChargePos);
				else if (staticArmState == "Default") RenderArms.renderArmDefault(model, anim, smoothing, model.rightArmRot, model.rightArmPos, true);
				else if (staticArmState == "Reload") RenderArms.renderArmReload(model, anim, smoothing, tiltProgress, model.rightArmReloadRot, model.rightArmReloadPos, model.rightArmRot, model.rightArmPos);
				
				GL11.glScalef(model.rightArmScale.x, model.rightArmScale.y, model.rightArmScale.z);
				modelplayer.bipedRightArm.render(0.0625F);
				renderRightSleeve(player, modelplayer);
			}
			GL11.glPopMatrix();
		}

		if (!model.leftHandAmmo) 
		{
			GL11.glPushMatrix();
			{
				if(mc.player.getSkinType() != "slim")
					mc.renderEngine.bindTexture(mc.player.getLocationSkin());
				else
					mc.renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/armSkin.png"));
				
				if (staticArmState == "Pump") RenderArms.renderArmPump(model, anim, smoothing, model.leftArmRot, model.leftArmPos);
				else if (staticArmState == "Charge") RenderArms.renderArmCharge(model, anim, smoothing, model.leftArmChargeRot, model.leftArmChargePos);
				else if (staticArmState == "Bolt") RenderArms.renderArmBolt(model, anim, smoothing, model.leftArmChargeRot, model.leftArmChargePos);
				else if (staticArmState == "Default") RenderArms.renderArmDefault(model, anim, smoothing, model.leftArmRot, model.leftArmPos, true);
				else if (staticArmState == "Reload") RenderArms.renderArmReload(model, anim, smoothing, tiltProgress, model.leftArmReloadRot, model.leftArmReloadPos, model.leftArmRot, model.leftArmPos);

				GL11.glScalef(model.leftArmScale.x, model.leftArmScale.y, model.leftArmScale.z);
				modelplayer.bipedLeftArm.render(0.0625F);
				renderLeftSleeve(player, modelplayer);
			}
			GL11.glPopMatrix();
		}
	}

	//Renders a left or right hand that moves with ammo depending on leftHandAmmo setting
	private void renderMovingArm(EntityPlayer player, ModelGun model, AnimStateMachine anim) {
		Minecraft mc = Minecraft.getMinecraft();
		ModelPlayer modelplayer = new ModelPlayer(0.0F, false);
		if(mc.player.getSkinType() != "slim") mc.renderEngine.bindTexture(mc.player.getLocationSkin());
		else mc.renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/armSkin.png"));
		float tiltProgress = getReloadTiltProgress(getReloadProgress(anim), model);	
		String movingArmState = getMovingArmState(model, anim);
		
		GL11.glPushMatrix();
		{
			//TODO Why the fuck is this required on this but not the other?
			GL11.glScalef(1 / model.modelScale, 1 / model.modelScale, 1 / model.modelScale);
			
			if (!model.leftHandAmmo) 
			{
				GL11.glPushMatrix();
				{			
					if (movingArmState == "Pump") {RenderArms.renderArmPump(model, anim, smoothing, model.rightArmRot, model.rightArmPos);}
					else if (movingArmState == "Bolt") {RenderArms.renderArmBolt(model, anim, smoothing, model.rightArmChargeRot, model.rightArmChargePos);}
					else if (movingArmState == "Default") {RenderArms.renderArmDefault(model, anim, smoothing, model.rightArmRot, model.rightArmPos, false);}
					else if (movingArmState == "Reload") {RenderArms.renderArmReload(model, anim, smoothing, tiltProgress, model.rightArmReloadRot, model.rightArmReloadPos, model.rightArmRot, model.rightArmPos);}

					GL11.glScalef(model.rightArmScale.x, model.rightArmScale.y, model.rightArmScale.z);
					modelplayer.bipedRightArm.render(0.0625F);
					renderRightSleeve(player, modelplayer);
				}
				GL11.glPopMatrix();
			}
			
			if (model.leftHandAmmo) 
			{
				GL11.glPushMatrix();
				{
					if (movingArmState == "Charge") {RenderArms.renderArmCharge(model, anim, smoothing, model.leftArmChargeRot, model.leftArmChargePos);}
					else if (movingArmState == "Pump") {RenderArms.renderArmPump(model, anim, smoothing, model.leftArmRot, model.leftArmPos);}
					else if (movingArmState == "Default") {RenderArms.renderArmDefault(model, anim, smoothing, model.leftArmRot, model.leftArmPos, false);}
					else if (movingArmState == "Reload") {RenderArms.renderArmReload(model, anim, smoothing, tiltProgress, model.leftArmReloadRot, model.leftArmReloadPos, model.leftArmRot, model.leftArmPos);}

					GL11.glScalef(model.leftArmScale.x, model.leftArmScale.y, model.leftArmScale.z);
					modelplayer.bipedLeftArm.render(0.0625F);
					renderLeftSleeve(player, modelplayer);
				}
				GL11.glPopMatrix();
			}
		}
		GL11.glPopMatrix();
	}
	
	public void renderLeftSleeve(EntityPlayer player, ModelBiped modelplayer)
	{
		if(player.inventory.armorItemInSlot(2) != null)
		{
			ItemStack armorStack = player.inventory.armorItemInSlot(2);
			if(armorStack.getItem() instanceof ItemMWArmor) {
				ModelArmor modelArmor = ((ModelArmor) ((ItemMWArmor) armorStack.getItem()).type.bipedModel);
				renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID,
						"skins/armor/" + ((ItemMWArmor) armorStack.getItem()).type.modelSkins[0].getSkin() + ".png"));
				GL11.glPushMatrix();
				{
					float modelScale = modelArmor.modelScale;
					GL11.glScalef(modelScale, modelScale, modelScale);
					modelArmor.render(modelArmor.leftArmModel, modelplayer.bipedLeftArm, 0.0625F, modelScale);
				}
				GL11.glPopMatrix();
			}
		}
	}
	
	public void renderRightSleeve(EntityPlayer player, ModelBiped modelplayer)
	{
		if(player.inventory.armorItemInSlot(2) != null)
		{
			ItemStack armorStack = player.inventory.armorItemInSlot(2);
			if(armorStack.getItem() instanceof ItemMWArmor) {
				ModelArmor modelArmor = ((ModelArmor) ((ItemMWArmor) armorStack.getItem()).type.bipedModel);
				renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID,
						"skins/armor/" + ((ItemMWArmor) armorStack.getItem()).type.modelSkins[0].getSkin() + ".png"));
				GL11.glPushMatrix();
				{
					float modelScale = modelArmor.modelScale;
					GL11.glScalef(modelScale, modelScale, modelScale);
					modelArmor.render(modelArmor.rightArmModel, modelplayer.bipedRightArm, 0.0625F, modelScale);
				}
				GL11.glPopMatrix();
			}
		}
	}

}
