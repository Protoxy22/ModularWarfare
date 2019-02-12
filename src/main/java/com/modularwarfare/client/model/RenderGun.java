package com.modularwarfare.client.model;

import java.util.Optional;
import java.util.Random;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.WeaponAnimation;
import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.ClientRenderHooks;
import com.modularwarfare.client.StateMachine;
import com.modularwarfare.client.anim.AnimStateMachine;
import com.modularwarfare.client.anim.StateEntry;
import com.modularwarfare.client.anim.StateType;
import com.modularwarfare.client.model.objects.BreakActionData;
import com.modularwarfare.client.model.objects.CustomItemRenderType;
import com.modularwarfare.client.model.objects.CustomItemRenderer;
import com.modularwarfare.client.model.objects.RenderVariables;
import com.modularwarfare.common.armor.ItemMWArmor;
import com.modularwarfare.common.guns.AmmoType;
import com.modularwarfare.common.guns.AttachmentEnum;
import com.modularwarfare.common.guns.AttachmentType;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemAmmo;
import com.modularwarfare.common.guns.ItemAttachment;
import com.modularwarfare.common.guns.ItemBullet;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.common.guns.WeaponFireMode;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderGun extends CustomItemRenderer {

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
	public static ModelRotateTool rotateToolModel;
	public int oldMagCount;
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
			//StateMachine animations = data.length >= 2 ? (EntityLivingBase) data[1] instanceof EntityPlayer ? ClientRenderHooks.getAnimations((EntityPlayer) data[1]) : new StateMachine() : new StateMachine();
			AnimStateMachine anim = data.length >= 2 ? (EntityLivingBase) data[1] instanceof EntityPlayer ? ClientRenderHooks.getAnimMachine((EntityPlayer) data[1]) : new AnimStateMachine() : new AnimStateMachine();
			renderGun(type, item, anim, gunType, data);
		}
	}

	private void renderGun(CustomItemRenderType renderType, ItemStack item, AnimStateMachine anim, GunType gunType, Object... data) {
		Minecraft mc = Minecraft.getMinecraft(); 
		ModelGun model = (ModelGun) gunType.model;
		float min = -1.5f;
        float max = 1.5f;
        float randomNum = new Random().nextFloat();
        float randomShake = min + (randomNum * (max - min));
        //float reloadProgress = getReloadProgress(animations);
        //float tiltProgress = getReloadTiltProgress(reloadProgress, model);
        float tiltProgress =1;
        float f = 1F / 16F;
		
		if (renderEngine == null)
			renderEngine = Minecraft.getMinecraft().renderEngine;

		if (model == null)
			return;

		GL11.glPushMatrix();
		{
			switch (renderType) {

			case ENTITY: {
				
				GL11.glTranslatef(-0.5F + model.itemFrameOffset.x, model.itemFrameOffset.y, model.itemFrameOffset.z);
				GL11.glRotatef(0, 0F, 0F, 1F); //ANGLE UP-DOWN
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
				float crouchZoom = anim.reloading ? 0f : anim.isState(StateType.Charge) ? 0f : model.crouchZoom;
				float hipRecover = reloadSwitch;
								
				//Store the model settings as local variables to reduce calls
				Vector3f customHipRotation = new Vector3f(model.rotateHipPosition.x + (model.sprintRotate.x * sprintSwitch * hipRecover), model.rotateHipPosition.y + (model.sprintRotate.y * sprintSwitch * hipRecover), model.rotateHipPosition.z + (model.sprintRotate.z * sprintSwitch * hipRecover));
				Vector3f customHipTranslate = new Vector3f(model.translateHipPosition.x + (model.sprintTranslate.x * sprintSwitch * hipRecover), model.translateHipPosition.y + (model.sprintTranslate.y * sprintSwitch * hipRecover), model.translateHipPosition.z + (model.sprintTranslate.z * sprintSwitch * hipRecover));
				Vector3f customAimRotation = new Vector3f(model.rotateAimPosition.x, model.rotateAimPosition.y, model.rotateAimPosition.z);
				Vector3f customAimTranslate = new Vector3f(model.translateAimPosition.x, model.translateAimPosition.y, model.translateAimPosition.z);
				
				//Default render position calculation, set up to be compatible with existing gun configuration
				adsSwitch = anim.reloading ? 0f : adsSwitch;
				rotateX = (0 + customHipRotation.x) - (0F + customAimRotation.x + customHipRotation.x * adsSwitch);
				rotateY = (46F + customHipRotation.y + swayHorizontal) - (1F + customAimRotation.y + customHipRotation.y + swayHorizontal) * adsSwitch;
				rotateZ = (1 + customHipRotation.z + swayVertical) - (1.0F + customAimRotation.z + customHipRotation.z + swayVertical) * adsSwitch;
				translateX = (-1.3F + customHipTranslate.x) - (0.0F + customAimTranslate.x + customHipTranslate.x) * adsSwitch; //-1.3
				translateY = (0.834F + customHipTranslate.y) - (-0.064F + customAimTranslate.y + customHipTranslate.y) * adsSwitch;//0.898
				translateZ = (-1.05F + customHipTranslate.z) - (0.35F + customAimTranslate.z + customHipTranslate.z) * adsSwitch;//-1.4
			
				//Custom view bobbing applies to gun models
				float bobModifier = !entityLivingBase.isSprinting() ? adsSwitch == 0F ? !anim.reloading ? 0.7F : 0.2F: 0F : !anim.reloading ? adsSwitch == 0 ? 0.75F : 0.15F : 0.4F;
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
				
				
				//Calls reload animation from the specified animation file
				if (anim.reloading && WeaponAnimations.getAnimation(model.reloadAnimation) != null) {
					Optional<StateEntry> currentState = anim.getCurrentState();
					float test = currentState.isPresent() ? (currentState.get().stateType == StateType.Tilt || currentState.get().stateType == StateType.Untilt) ? currentState.get().currentValue : anim.tiltHold ? 1f : 0f : 0f;
					WeaponAnimations.getAnimation(model.reloadAnimation).onGunAnimation(test, anim);
					//System.out.println(test);
					//System.out.println("Anim is null");
				}
				else
					//System.out.println("2" + currentState.isPresent());
				
				//Recoil
				GL11.glTranslatef(-(anim.lastGunRecoil + (anim.gunRecoil - anim.lastGunRecoil) * smoothing) * model.modelRecoilBackwards, 0F, 0F);
				GL11.glRotatef((anim.lastGunRecoil + (anim.gunRecoil - anim.lastGunRecoil) * smoothing) * model.modelRecoilUpwards, 0F, 0F, 1F);
				GL11.glRotatef(((-anim.lastGunRecoil + (anim.gunRecoil - anim.lastGunRecoil) * smoothing) * randomShake * model.modelRecoilShake), 0.0f, 1.0f, 0.0f);
		        GL11.glRotatef(((-anim.lastGunRecoil + (anim.gunRecoil - anim.lastGunRecoil) * smoothing) * randomShake * model.modelRecoilShake), 1.0f, 0.0f, 0.0f);
				break;	
			}

			default:
				break;

			}
			
			//Render call for the static arm
			if (renderType == CustomItemRenderType.EQUIPPED_FIRST_PERSON && model.hasArms()) {
				 renderStaticArm(mc.player, model, anim); 
			}
			
			GL11.glPushMatrix();
			{
				float modelScale = model.modelScale;
				
				/** Weapon Texture */
				int skinId = item.getTagCompound().getInteger("skinId");
				String path = skinId > 0 ? "skins/" + gunType.modelSkins[skinId].getSkin() : gunType.modelSkins[0].getSkin();
				bindTexture("guns", path);

				GL11.glScalef(modelScale, modelScale, modelScale);
				GL11.glTranslatef(model.translateAll.x * f, -model.translateAll.y * f, -model.translateAll.z * f);
				
				//Item frame rendering properties
				//TODO Issue with item frame lighting and entities
				if(renderType == CustomItemRenderType.ENTITY)
				{
					if(!(Minecraft.getMinecraft().currentScreen instanceof GuiInventory))
					{
						/** Gun Xray
						GlStateManager.disableRescaleNormal();
			            RenderHelper.disableStandardItemLighting();
			            GlStateManager.disableLighting();
			            GlStateManager.disableDepth();*/
						GlStateManager.enableRescaleNormal();
						RenderHelper.enableStandardItemLighting();
						GlStateManager.enableLighting();
						GlStateManager.enableDepth();
					}
				}
				
				model.renderGun(f);
				
				//Render any attachments
				if(GunType.getAttachment(item, AttachmentEnum.Sight) == null && !model.scopeIsOnSlide)
					model.renderDefaultScope(f);
				model.renderDefaultBarrel(f);
				model.renderDefaultStock(f);
				model.renderDefaultGrip(f);
				model.renderDefaultGadget(f);
				
				
				//Render pump action
				ItemStack pumpAttachment = null;
				if (pumpAttachment == null)
				{
					GL11.glPushMatrix();
					{
						// TODO: Pumping current and last
						float pumpCurrent = 1f;
						float pumpLast = 1f;
						GL11.glTranslatef(-(anim.lastGunSlide + (anim.gunSlide - anim.lastGunSlide) * smoothing) * model.gunSlideDistance, 0F, 0F);
						GL11.glTranslatef(-(1 - Math.abs(pumpLast + (pumpCurrent - pumpLast) * smoothing)) * model.pumpHandleDistance, 0F, 0F);
						//Doubles as bolt action animation if set
						if(model.rightHandBolt)
						{
							GL11.glTranslatef(model.boltRotationPoint.x, model.boltRotationPoint.y, model.boltRotationPoint.z);
							GL11.glRotatef(model.boltRotation * (1 - Math.abs(pumpLast + (pumpCurrent - pumpLast) * smoothing)), 1, 0, 0);
							GL11.glTranslatef(-model.boltRotationPoint.x, -model.boltRotationPoint.y, -model.boltRotationPoint.z);
						}
						model.renderPump(f);
					}
					GL11.glPopMatrix();
				}
				
				//Render charge handle
				if (model.chargeHandleDistance != 0F)
				{
					GL11.glPushMatrix();
					{
						// TODO: Pumping current and last
						float pumpCurrent = 1f;
						float pumpLast = 1f;
						GL11.glTranslatef(-(1 - Math.abs(pumpLast + (pumpCurrent - pumpLast) * smoothing)) * model.chargeHandleDistance, 0F, 0F);
						model.renderCharge(f);
					}
					GL11.glPopMatrix();
				}
				
				//Render Slide
				if(GunType.getAttachment(item, AttachmentEnum.Slide) == null)
				{
					GL11.glPushMatrix();
					{
						Optional<StateEntry> chargeEntry = anim.getCurrentState();
						float currentCharge = chargeEntry.isPresent() ? (chargeEntry.get().stateType == StateType.Charge || chargeEntry.get().stateType == StateType.Uncharge) ? chargeEntry.get().currentValue : 1f : 1f;
						float lastCharge = chargeEntry.isPresent() ? (chargeEntry.get().stateType == StateType.Charge || chargeEntry.get().stateType == StateType.Uncharge) ? chargeEntry.get().lastValue : 1f : 1f;

						GL11.glTranslatef(-(anim.lastGunSlide + (anim.gunSlide - anim.lastGunSlide) * smoothing) * model.gunSlideDistance, 0F, 0F);
						GL11.glTranslatef(-(1 - Math.abs(lastCharge + (currentCharge - lastCharge) * smoothing)) * model.chargeHandleDistance, 0F, 0F);
						model.renderSlide(f);
						if (GunType.getAttachment(item, AttachmentEnum.Sight) == null && model.scopeIsOnSlide)
							model.renderDefaultScope(f);
						//Render the scope on the slide, if its set on slide
						if(model.switchIsOnSlide) 
						{
							GL11.glPushMatrix();
							{
								WeaponFireMode fireMode = gunType.getFireMode(item);
								float switchAngle = fireMode == WeaponFireMode.SEMI ? model.switchSemiRot : fireMode == WeaponFireMode.FULL ? model.switchAutoRot : fireMode == WeaponFireMode.BURST ? model.switchBurstRot : 0F;
								GL11.glTranslatef(model.switchRotationPoint.x, model.switchRotationPoint.y, model.switchRotationPoint.z);
								GL11.glRotatef(switchAngle, 0, 0, 1);
								GL11.glTranslatef(-model.switchRotationPoint.x, -model.switchRotationPoint.y, -model.switchRotationPoint.z);
								model.renderSwitch(f);
							}
							GL11.glPopMatrix();
						}
					}
					GL11.glPopMatrix();
				}
				
				//Render break action, uses an array system to allow multiple different break action types on a gun
				for(BreakActionData breakAction : model.breakActions)
				{
					Optional<StateEntry> breakState = anim.getCurrentState();
					float breakProgress = breakState.isPresent() ? (breakState.get().stateType == StateType.Tilt || breakState.get().stateType == StateType.Untilt) ? breakState.get().currentValue : anim.tiltHold ? 1f : 0f : 0f;
					GL11.glPushMatrix();
					{
						GL11.glTranslatef(breakAction.breakPoint.x, breakAction.breakPoint.y, breakAction.breakPoint.z);
						GL11.glRotatef(breakProgress * -breakAction.angle, 0F, 0F, 1F);
						GL11.glTranslatef(-breakAction.breakPoint.x, -breakAction.breakPoint.y, -breakAction.breakPoint.z);
						model.render(breakAction.modelGroup, f);
						if (GunType.getAttachment(item, AttachmentEnum.Sight) == null && model.scopeIsOnBreakAction && breakAction.scopePart)
							model.renderDefaultScope(f);
					}
					GL11.glPopMatrix();
				}
				
				//Render hammer actions
				GL11.glPushMatrix();
				{
					GL11.glTranslatef(model.hammerRotationPoint.x, model.hammerRotationPoint.y, model.hammerRotationPoint.z);
					GL11.glRotatef(50F, 0F, 0F, 1F);
					GL11.glRotatef(-anim.hammerRotation * 2, 0F, 0F, 1F);
					GL11.glTranslatef(-model.hammerRotationPoint.x, -model.hammerRotationPoint.y, -model.hammerRotationPoint.z);
					model.renderHammer(f);
				}
				GL11.glPopMatrix();
				
				//Render lever action
				GL11.glPushMatrix();
				{
					// TODO: Pumping current and last
					float pumpCurrent = 1f;
					float pumpLast = 1f;
					GL11.glTranslatef(model.leverRotationPoint.x, model.leverRotationPoint.y, model.leverRotationPoint.z);
					GL11.glRotatef(model.leverRotation * (1 - Math.abs(pumpLast + (pumpCurrent - pumpLast) * smoothing)), 0, 0, 1);
					GL11.glTranslatef(-model.leverRotationPoint.x, -model.leverRotationPoint.y, -model.leverRotationPoint.z);
					model.renderLeverAction(f);
				}
				GL11.glPopMatrix();
				
				//Render trigger
				GL11.glPushMatrix();
				{
					GL11.glTranslatef(model.triggerRotationPoint.x, model.triggerRotationPoint.y, model.triggerRotationPoint.z);
					GL11.glRotatef(model.triggerRotation * (triggerPullSwitch * 50), 0, 0, 1);
					GL11.glTranslatef(-model.triggerRotationPoint.x, -model.triggerRotationPoint.y, -model.triggerRotationPoint.z);
					model.renderTrigger(f);
				}
				GL11.glPopMatrix();
				
				//Render fire mode switch
				if(!model.switchIsOnSlide) {
				GL11.glPushMatrix();
				{
					WeaponFireMode fireMode = gunType.getFireMode(item);
					float switchAngle = fireMode == WeaponFireMode.SEMI ? model.switchSemiRot : fireMode == WeaponFireMode.FULL ? model.switchAutoRot : fireMode == WeaponFireMode.BURST ? model.switchBurstRot : 0F;
					GL11.glTranslatef(model.switchRotationPoint.x, model.switchRotationPoint.y, model.switchRotationPoint.z);
					GL11.glRotatef(switchAngle, 0, 0, 1);
					GL11.glTranslatef(-model.switchRotationPoint.x, -model.switchRotationPoint.y, -model.switchRotationPoint.z);
					model.renderSwitch(f);
				}
				GL11.glPopMatrix();
				}
				
				// Render the revolver barrel
				GL11.glPushMatrix();
				{
					GL11.glTranslatef(model.cylinderRotationPoint.x, model.cylinderRotationPoint.y, model.cylinderRotationPoint.z);
					GL11.glRotatef(tiltProgress * model.cylinderRotation, 1F, 0F, 0F);
					GL11.glTranslatef(-model.cylinderRotationPoint.x, -model.cylinderRotationPoint.y, -model.cylinderRotationPoint.z);
					model.renderRevolverBarrel(f);
				}
				GL11.glPopMatrix();
				
				//Slide lock - Keeps slide in the back position when empty if true
				boolean empty = !ItemGun.hasNextShot(item);
				if (model.slideLockOnEmpty)
				{
					if (empty)
						anim.isGunEmpty = true;
					else if (!empty && !anim.reloading)
						anim.isGunEmpty = false;
				}
				
				GL11.glPushMatrix();
				{
					boolean cachedUnload = (anim.unloadOnly && anim.cachedAmmoStack != null);
					if(ItemGun.hasAmmoLoaded(item) || cachedUnload)
					{
						ItemStack stackAmmo =  cachedUnload ? anim.cachedAmmoStack : new ItemStack(item.getTagCompound().getCompoundTag("ammo"));
						ItemAmmo itemAmmo = (ItemAmmo) stackAmmo.getItem();
						AmmoType ammoType = itemAmmo.type;
						boolean shouldNormalRender = true;
						
						if (anim.reloading && model.reloadAnimation != null && WeaponAnimations.getAnimation(model.reloadAnimation) != null) 
						{
							if (anim.reloading && model.reloadAnimation != null && WeaponAnimations.getAnimation(model.reloadAnimation) != null) 
							{
								//Unload/Load ammo
								Optional<StateEntry> unload = anim.getCurrentState();
								float ammoProgress = unload.isPresent() ? (unload.get().stateType == StateType.Unload || unload.get().stateType == StateType.Load) ? unload.get().currentValue :  0f : 0f;	
								WeaponAnimations.getAnimation(model.reloadAnimation).onAmmoAnimation(model, ammoProgress, anim.reloadAmmoCount, anim);
								//WeaponAnimations.getAnimation(model.reloadAnimation).onGunAnimation(test, anim);
							}
							//This is old
							//float ammoPosition = getReloadAmmoPosition(reloadProgress, model, animations);
							//WeaponAnimations.getAnimation(model.reloadAnimation).onAmmoAnimation(model, ammoPosition, animations.reloadAmmoCount, anim);
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
									int magCount = stackAmmo.getTagCompound().getInteger("magcount");
									if(!anim.reloading)
										oldMagCount = magCount;
									//else if(animations.reloading && reloadProgress < 0.5f)
									else if(anim.reloading) 
										 magCount = oldMagCount;
																		
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
											int skinIdAmmo = stackAmmo.getTagCompound().getInteger("skinId");
											String pathAmmo = skinIdAmmo > 0 ? "skins/" + ammoType.modelSkins[skinIdAmmo].getSkin() : ammoType.modelSkins[0].getSkin();
											bindTexture("ammo", pathAmmo);
											
											if(anim.renderAmmo) 
											{
												if(!cachedUnload)
													anim.cachedAmmoStack = stackAmmo;
												
												modelAmmo.renderAmmo(f); 
											}
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
							
							if(shouldNormalRender && anim.renderAmmo)
							{
								if(!cachedUnload)
									anim.cachedAmmoStack = stackAmmo;							
								int skinIdAmmo = stackAmmo.getTagCompound().getInteger("skinId");
								String pathAmmo = skinIdAmmo > 0 ? "skins/" + ammoType.modelSkins[skinIdAmmo].getSkin() : ammoType.modelSkins[0].getSkin();
								bindTexture("ammo", pathAmmo);
								modelAmmo.renderAmmo(f);
							}
						} else
						{
							if(anim.renderAmmo) 
							{
								if(!cachedUnload)
									anim.cachedAmmoStack = stackAmmo;
								//These translates/rotate was just a test but seems to work well for moving ammo with revolver cylinder
								GL11.glTranslatef(model.cylinderRotationPoint.x, model.cylinderRotationPoint.y, model.cylinderRotationPoint.z);
								GL11.glRotatef(tiltProgress * model.cylinderRotation, 1F, 0F, 0F);
								GL11.glTranslatef(-model.cylinderRotationPoint.x, -model.cylinderRotationPoint.y, -model.cylinderRotationPoint.z);
								model.renderAmmo(f);
							}
						}
					} 
					else if(ItemGun.getUsedBullet(item, gunType) != null)
					{
						ItemBullet itemBullet = ItemGun.getUsedBullet(item, gunType);
						
						if (anim.reloading && model.reloadAnimation != null && WeaponAnimations.getAnimation(model.reloadAnimation) != null) 
						{
							if (anim.reloading && model.reloadAnimation != null && WeaponAnimations.getAnimation(model.reloadAnimation) != null) 
							{
								//Unload/Load ammo
								Optional<StateEntry> unload = anim.getCurrentState();
								float ammoProgress = unload.isPresent() ? (unload.get().stateType == StateType.Unload || unload.get().stateType == StateType.Load) ? unload.get().currentValue :  0f : 0f;	
								WeaponAnimations.getAnimation(model.reloadAnimation).onAmmoAnimation(model, ammoProgress, anim.reloadAmmoCount, anim);
								//WeaponAnimations.getAnimation(model.reloadAnimation).onGunAnimation(test, anim);
							}
							//This is old
							//float ammoPosition = getReloadAmmoPosition(reloadProgress, model, animations);
							//WeaponAnimations.getAnimation(model.reloadAnimation).onAmmoAnimation(model, ammoPosition, animations.reloadAmmoCount, anim);
						}
						
						if(itemBullet.type.model != null && anim.reloading)
						{
							// TODO: Render bullet
							GL11.glPushMatrix();
							{
								ModelBullet bulletModel = (ModelBullet) itemBullet.type.model;
								bulletModel.renderBullet(f);
							}
							GL11.glPopMatrix();
						}
					}
				}
				
				//Render moving arm
				if(ModularWarfare.DEV_ENV && model.hasArms() && renderType != CustomItemRenderType.ENTITY){
					
					GL11.glPushMatrix();
					{
						GL11.glTranslatef(-model.translateAll.x * f, model.translateAll.y * f, model.translateAll.z * f);
						renderMovingArm(mc.player, model, anim); 
					}
					GL11.glPopMatrix();
				}
				else if (renderType == CustomItemRenderType.EQUIPPED_FIRST_PERSON && model.hasArms()) {
					renderMovingArm(mc.player, model, anim); 
				}
				
				GL11.glPopMatrix();
				
				//Rotation point dev tool
				if(ModularWarfare.DEV_ENV && renderType == CustomItemRenderType.ENTITY) {
				GL11.glPushMatrix();
				{
					ModelRotateTool tool = rotateToolModel;
					GL11.glTranslatef(model.rotationHelper.x, model.rotationHelper.y, model.rotationHelper.z);
					renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/" + "rotatetool.png"));
					tool.renderRotateTool(f);
				}
				
				GL11.glPopMatrix();
				}
				
				//Test gun xray stuff
				if(renderType == CustomItemRenderType.ENTITY)
				{
					if(!(Minecraft.getMinecraft().currentScreen instanceof GuiInventory))
					{
						/** Gun Xray
			            GlStateManager.enableLighting();
			            GlStateManager.enableDepth();
			            RenderHelper.enableStandardItemLighting();
			            GlStateManager.enableRescaleNormal();*/
					}
				}
			}
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			{
				
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
								int skinId = itemStack.getTagCompound().getInteger("skinId");
								String path = skinId > 0 ? "skins/" + attachmentType.modelSkins[skinId].getSkin() : attachmentType.modelSkins[0].getSkin();
								bindTexture("attachments", path);
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
	
	//Determine the state of the static arm
	public static String getStaticArmState(ModelGun model, AnimStateMachine anim)
	{
		String staticArmState;
		// TODO: Pumping current and last
		float pumpCurrent = 1f;
		float pumpLast = 1f;
		
		if(model.leftHandAmmo) 
		{
			if(!anim.reloading && model.righthandPump) staticArmState = "Pump";
			else if(pumpCurrent < 0.66 && model.rightHandCharge && pumpCurrent != -1.0F) staticArmState = "Charge";
			else if(pumpCurrent < 0.9 && model.rightHandBolt) staticArmState = "Bolt";
			else if(!anim.reloading && !model.righthandPump) staticArmState = "Default";
			else staticArmState = "Reload";
			//System.out.println("Static Right Arm" + " - " + staticArmState);
		}
		else 
		{
			if (!anim.reloading && model.lefthandPump) staticArmState = "Pump";
			else if (pumpCurrent < 0.9 && model.rightHandCharge && pumpCurrent != -1.0F) staticArmState = "Charge";
			else if (pumpCurrent < 0.9 && model.rightHandBolt) staticArmState = "Bolt";
			else if (!anim.reloading && !model.lefthandPump) staticArmState = "Default";
			else staticArmState = "Reload";
			//System.out.println("Static Left Arm" + " - " + staticArmState);
		}
		return staticArmState;
	}
	
	//Determine the state of the moving arm
	public static String getMovingArmState(ModelGun model, AnimStateMachine anim)
	{
		WeaponAnimation wepAnim = WeaponAnimations.getAnimation(model.reloadAnimation);
		// TODO: Pumping current and last
		float pumpCurrent = 1f;
		float pumpLast = 1f;
		//float reloadProgress = getReloadProgress(anim);
		
		//Calls reload animation from the specified animation file
		String movingArmState;
		if(!model.leftHandAmmo) 
		{
			if(/*anim.isAnimState(StateType.Charge) && */pumpCurrent < 0.9 && model.rightHandCharge && pumpCurrent != -1.0F) movingArmState = "Pump";
			else if(/*anim.isAnimState(StateType.Charge) && */ pumpCurrent < 0.9 && model.rightHandBolt) movingArmState = "Bolt";
			else if(!anim.reloading) movingArmState = "Default";
			else if(anim.isState(StateType.Load)) movingArmState = "Load";
			//else if() movingArmState = "Unload";
			else movingArmState = "Reload";
			//System.out.println("Moving Right Arm" + " - " + movingArmState);
		}
		else 
		{
			if (/*anim.isAnimState(StateType.Charge) && */ model.leftHandCharge && pumpCurrent != -1.0F) movingArmState = "Charge";
			else if (/*anim.isAnimState(StateType.Charge) && */ !anim.reloading && model.lefthandPump) movingArmState = "Pump";
			else if (!anim.reloading) movingArmState = "Default";
			else if(anim.isState(StateType.Load)) movingArmState = "Load";
			else if(anim.isState(StateType.Unload)) movingArmState = "Unload";
			else movingArmState = "Reload";
			//System.out.println("Moving Left Arm" + " - " + movingArmState);
		}
		return movingArmState;
	}
	
	// Resets render modifiers
	public static void resetRenderMods()
	{
		//RenderGun.swayHorizontal = 0f;
		//RenderGun.swayVertical = 0f;
		//RenderGun.swayHorizontalEP = 0f;
		//RenderGun.swayVerticalEP = 0f;
		RenderGun.reloadSwitch = 0f;
		RenderGun.sprintSwitch = 0f;
		RenderGun.adsSwitch = 0f;
		RenderGun.crouchSwitch = 0f;
	}
	
	//Renders the static left or right hand that does not move with the ammo depending on leftHandAmmo setting
	private void renderStaticArm(EntityPlayer player, ModelGun model, AnimStateMachine anim) {
		Minecraft mc = Minecraft.getMinecraft();
		ModelPlayer modelplayer = new ModelPlayer(0.0F, false);
		//float tiltProgress = getReloadTiltProgress(getReloadProgress(anim), model);
		float tiltProgress = 1;
		String staticArmState = getStaticArmState(model, anim);
		GL11.glPushMatrix();
		{
			if(mc.player.getSkinType() != "slim")
				mc.renderEngine.bindTexture(mc.player.getLocationSkin());
			else bindTexture("arms", "armskin");
			
			boolean rightArm = model.leftHandAmmo && model.rightArmPos != null;
			Vector3f armScale = rightArm ? model.rightArmScale : model.leftArmScale;
			Vector3f armRot = rightArm ? model.rightArmRot : model.leftArmRot;
			Vector3f armPos = rightArm ? model.rightArmPos : model.leftArmPos;
			Vector3f chargeArmRot = rightArm ? model.rightArmChargeRot : model.leftArmChargeRot;
			Vector3f chargeArmPos = rightArm ? model.rightArmChargePos : model.leftArmChargePos;
			Vector3f reloadArmRot = rightArm ? model.rightArmReloadRot : model.leftArmReloadRot;
			Vector3f reloadArmPos = rightArm ? model.rightArmReloadPos : model.leftArmReloadPos;
			
			if (staticArmState == "Pump") RenderArms.renderArmPump(model, anim, smoothing, armRot, armPos, !model.leftHandAmmo);
			else if (staticArmState == "Charge") RenderArms.renderArmCharge(model, anim, smoothing, chargeArmRot, chargeArmPos, armRot, armPos, !model.leftHandAmmo);
			else if (staticArmState == "Bolt") RenderArms.renderArmBolt(model, anim, smoothing, chargeArmRot, chargeArmPos, !model.leftHandAmmo);
			else if (staticArmState == "Default") RenderArms.renderArmDefault(model, anim, smoothing, armRot, armPos, rightArm, !model.leftHandAmmo);
			else if (staticArmState == "Reload") RenderArms.renderArmReload(model, anim, smoothing, tiltProgress, reloadArmRot, reloadArmPos, armRot, armPos, !model.leftHandAmmo);
			
			//Render the armor model on the arm
			GL11.glScalef(armScale.x, armScale.y, armScale.z);
			if(rightArm) 
			{
				modelplayer.bipedRightArm.render(0.0625F);
				renderRightSleeve(player, modelplayer);
			} else
			{
				modelplayer.bipedLeftArm.render(0.0625F);
				renderLeftSleeve(player, modelplayer);
			}
		}
		GL11.glPopMatrix();
	}

	//Renders a left or right hand that moves with ammo depending on leftHandAmmo setting
	private void renderMovingArm(EntityPlayer player, ModelGun model, AnimStateMachine anim) {
		Minecraft mc = Minecraft.getMinecraft();
		ModelPlayer modelplayer = new ModelPlayer(0.0F, false);
		if(mc.player.getSkinType() != "slim") mc.renderEngine.bindTexture(mc.player.getLocationSkin());
		else bindTexture("arms", "armSkin");
		//float tiltProgress = getReloadTiltProgress(getReloadProgress(anim), model);	
		float tiltProgress = 1;
		boolean rightArm = model.leftHandAmmo && model.rightArmPos != null;
		String movingArmState = getMovingArmState(model, anim);
		WeaponAnimation weaponAnimation = WeaponAnimations.getAnimation(model.reloadAnimation);
		GL11.glPushMatrix();
		{
			GL11.glScalef(1 / model.modelScale, 1 / model.modelScale, 1 / model.modelScale);
			
			if (!model.leftHandAmmo && model.rightArmPos != null && model.rightArmReloadPos != null) 
			{
				GL11.glPushMatrix();
				{
					if (movingArmState == "Pump") {RenderArms.renderArmPump(model, anim, smoothing, model.rightArmRot, model.rightArmPos, model.leftHandAmmo);}
					else if (movingArmState == "Bolt") {RenderArms.renderArmBolt(model, anim, smoothing, model.rightArmChargeRot, model.rightArmChargePos, model.leftHandAmmo);}
					else if (movingArmState == "Default") {RenderArms.renderArmDefault(model, anim, smoothing, model.rightArmRot, model.rightArmPos, true, model.leftHandAmmo);}
					else if (movingArmState == "Load") {RenderArms.renderArmLoad(model, anim, weaponAnimation, smoothing, tiltProgress, model.rightArmReloadRot, model.rightArmReloadPos, model.rightArmRot, model.rightArmPos, model.leftHandAmmo);}
					else if (movingArmState == "Reload") {RenderArms.renderArmReload(model, anim, smoothing, tiltProgress, model.rightArmReloadRot, model.rightArmReloadPos, model.rightArmRot, model.rightArmPos, model.leftHandAmmo);}
					GL11.glScalef(model.rightArmScale.x, model.rightArmScale.y, model.rightArmScale.z);
					modelplayer.bipedRightArm.render(0.0625F);
					renderRightSleeve(player, modelplayer);
				}
				GL11.glPopMatrix();
			}
			
			if (model.leftHandAmmo && model.leftArmPos != null && model.leftArmReloadPos != null) 
			{
				GL11.glPushMatrix();
				{
					if (movingArmState == "Charge") {RenderArms.renderArmCharge(model, anim, smoothing, model.leftArmChargeRot, model.leftArmChargePos, model.leftArmRot, model.leftArmPos, model.leftHandAmmo);}
					else if (movingArmState == "Pump") {RenderArms.renderArmPump(model, anim, smoothing, model.leftArmRot, model.leftArmPos, model.leftHandAmmo);}
					else if (movingArmState == "Default") {RenderArms.renderArmDefault(model, anim, smoothing, model.leftArmRot, model.leftArmPos, false, model.leftHandAmmo);}
					else if (movingArmState == "Load") {RenderArms.renderArmLoad(model, anim, weaponAnimation, smoothing, tiltProgress, model.leftArmReloadRot, model.leftArmReloadPos, model.leftArmRot, model.leftArmPos, model.leftHandAmmo);}
					else if (movingArmState == "Unload") {RenderArms.renderArmUnload(model, anim, weaponAnimation, smoothing, tiltProgress, model.leftArmReloadRot, model.leftArmReloadPos, model.leftArmRot, model.leftArmPos, model.leftHandAmmo);}
					else if (movingArmState == "Reload") {RenderArms.renderArmReload(model, anim, smoothing, tiltProgress, model.leftArmReloadRot, model.leftArmReloadPos, model.leftArmRot, model.leftArmPos, model.leftHandAmmo);}

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
				modelArmor.showChest(true);
				int skinId = armorStack.getTagCompound().getInteger("skinId");
				String path = skinId > 0 ? "skins/" + ((ItemMWArmor) armorStack.getItem()).type.modelSkins[skinId].getSkin() : ((ItemMWArmor) armorStack.getItem()).type.modelSkins[0].getSkin();
				bindTexture("armor", path);
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
				modelArmor.showChest(true);
				int skinId = armorStack.getTagCompound().getInteger("skinId");
				String path = skinId > 0 ? "skins/" + ((ItemMWArmor) armorStack.getItem()).type.modelSkins[skinId].getSkin() : ((ItemMWArmor) armorStack.getItem()).type.modelSkins[0].getSkin();
				bindTexture("armor", path);
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
