package com.modularwarfare.client.model;

import java.util.Optional;
import java.util.Random;

import com.modularwarfare.api.ArmorApi;
import com.modularwarfare.client.handler.ClientTickHandler;
import com.modularwarfare.client.model.omw.OmwModelFlash;
import com.modularwarfare.common.armor.ArmorType;
import com.modularwarfare.common.armor.ItemMWArmor;
import com.modularwarfare.common.armor.ItemSpecialArmor;
import com.modularwarfare.common.guns.*;
import com.modularwarfare.common.network.PacketAimingRequest;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.util.Timer;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.api.WeaponAnimation;
import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.ClientRenderHooks;
import com.modularwarfare.client.anim.AnimStateMachine;
import com.modularwarfare.client.anim.ReloadType;
import com.modularwarfare.client.anim.StateEntry;
import com.modularwarfare.client.anim.StateType;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.model.objects.BreakActionData;
import com.modularwarfare.client.model.objects.CustomItemRenderType;
import com.modularwarfare.client.model.objects.CustomItemRenderer;
import com.modularwarfare.client.model.objects.RenderVariables;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiInventory;
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
	private Timer timer;


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
			AnimStateMachine anim = data.length >= 2 ? (EntityLivingBase) data[1] instanceof EntityPlayer ? ClientRenderHooks.getAnimMachine((EntityPlayer) data[1]) : new AnimStateMachine() : new AnimStateMachine();
			renderGun(type, item, anim, gunType, data);
		}

	}

    private float interpolateRotation(float x, float y, float dT) {
        float f3;

        for (f3 = y - x; f3 < -180.0F; f3 += 360.0F) {
        }
        for (; f3 >= 180.0F; f3 -= 360.0F) {
        }

        return x + dT * f3;
    }


    private void renderGun(CustomItemRenderType renderType, ItemStack item, AnimStateMachine anim, GunType gunType, Object... data) {
		Minecraft mc = Minecraft.getMinecraft();
		ModelGun model = (ModelGun) gunType.model;

		/** Random Shake */
		float min = -1.5f;
		float max = 1.5f;
		float randomNum = new Random().nextFloat();
		float randomShake = min + (randomNum * (max - min));

		/** Current States */
		Optional<StateEntry> currentReloadState = anim.getReloadState();
		Optional<StateEntry> currentShootState = anim.getShootState();

		float tiltProgress = currentReloadState.isPresent() ? (currentReloadState.get().stateType == StateType.Tilt || currentReloadState.get().stateType == StateType.Untilt) ? currentReloadState.get().currentValue : anim.tiltHold ? 1f : 0f : 0f;
		float worldScale = 1F / 16F;

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

					GL11.glScalef(model.thirdPersonScale, model.thirdPersonScale, model.thirdPersonScale);
					GL11.glTranslatef(model.thirdPersonOffset.x, model.thirdPersonOffset.y + crouchOffset, model.thirdPersonOffset.z);
					break;
				}

				case BACK: {
					EntityLivingBase entityLivingBase = (EntityLivingBase) data[1];

					GL11.glScalef(model.thirdPersonScale, model.thirdPersonScale, model.thirdPersonScale);
					GL11.glTranslatef(-0.32F, 1.3F, -0.23F);
					GL11.glTranslatef(model.backPersonOffset.x, model.backPersonOffset.y, model.backPersonOffset.z);
					if (entityLivingBase.isSneaking())
					{
						GlStateManager.rotate(20, 1, 0,0);
						GlStateManager.translate(0, -0.3f, -0.2f);
					}
					GL11.glRotatef(90.0f, 0.0f, 20.0f, 0.0f);
					GL11.glRotatef(270.0f, 0.0f, 0.0f, -90.0f);
					GL11.glRotatef(90.0f, 20.0f, 0.0f, 0.0f);

					GL11.glRotatef(20.0f, 0.0f, 0.0f, 20.0f);

					break;
				}

				case EQUIPPED_FIRST_PERSON: {


					EntityLivingBase entityLivingBase = (EntityLivingBase) data[1];
					float modelScale = model.modelScale;
					float rotateX = 0;
					float rotateY = 0;
					float rotateZ = 0;
					float translateX = 0;
					float translateY = 0;
					float translateZ = 0;
					float crouchZoom = anim.reloading ? 0f : anim.isReloadState(StateType.Charge) ? 0f : model.crouchZoom;
					float hipRecover = reloadSwitch;

					// Store the model settings as local variables to reduce calls
					Vector3f customHipRotation = new Vector3f(model.rotateHipPosition.x + (model.sprintRotate.x * sprintSwitch * hipRecover), model.rotateHipPosition.y + (model.sprintRotate.y * sprintSwitch * hipRecover), model.rotateHipPosition.z + (model.sprintRotate.z * sprintSwitch * hipRecover));
					Vector3f customHipTranslate = new Vector3f(model.translateHipPosition.x + (model.sprintTranslate.x * sprintSwitch * hipRecover), model.translateHipPosition.y + (model.sprintTranslate.y * sprintSwitch * hipRecover), model.translateHipPosition.z + (model.sprintTranslate.z * sprintSwitch * hipRecover));

					for (AttachmentEnum attachment : AttachmentEnum.values()) {
						ItemStack itemStack = GunType.getAttachment(item, attachment);
						if (itemStack != null && itemStack.getItem() != Items.AIR) {
							AttachmentType attachmentType = ((ItemAttachment) itemStack.getItem()).type;
							if (attachmentType.attachmentType == AttachmentEnum.Sight) {
								GL11.glTranslatef(model.translateSight.x * worldScale, -model.translateSight.y * worldScale, -model.translateSight.z * worldScale);
							}
						}
					}

					Vector3f customAimRotation = new Vector3f(model.rotateAimPosition.x, model.rotateAimPosition.y, model.rotateAimPosition.z);

					if (GunType.getAttachment(item, AttachmentEnum.Sight) != null) {
						customAimRotation = new Vector3f(model.rotateSight.x, model.rotateSight.y, model.rotateSight.z);

					}

					Vector3f customAimTranslate = new Vector3f(model.translateAimPosition.x, model.translateAimPosition.y, model.translateAimPosition.z);

					// Default render position calculation, set up to be compatible with existing gun configuration
					adsSwitch = anim.reloading ? 0f : adsSwitch;
					rotateX = (0 + customHipRotation.x) - (0F + customAimRotation.x + customHipRotation.x * adsSwitch);
					rotateY = (46F + customHipRotation.y + swayHorizontal) - (1F + customAimRotation.y + customHipRotation.y + swayHorizontal) * adsSwitch;
					rotateZ = (1 + customHipRotation.z + swayVertical) - (1.0F + customAimRotation.z + customHipRotation.z + swayVertical) * adsSwitch;
					translateX = (-1.3F + customHipTranslate.x) - (0.0F + customAimTranslate.x + customHipTranslate.x) * adsSwitch; //-1.3
					translateY = (0.834F + customHipTranslate.y) - (-0.064F + customAimTranslate.y + customHipTranslate.y) * adsSwitch;//0.898
					translateZ = (-1.05F + customHipTranslate.z) - (0.35F + customAimTranslate.z + customHipTranslate.z) * adsSwitch;//-1.4


					// Custom view bobbing applies to gun models
					float bobModifier = !entityLivingBase.isSprinting() ? adsSwitch == 0F ? !anim.reloading ? 0.7F : 0.2F : 0F : !anim.reloading ? adsSwitch == 0 ? 0.75F : 0.15F : 0.4F;
					EntityPlayer entityplayer = (EntityPlayer) Minecraft.getMinecraft().getRenderViewEntity();
					float f1 = (entityplayer.distanceWalkedModified - entityplayer.prevDistanceWalkedModified) * bobModifier;
					float f2 = -(entityplayer.distanceWalkedModified + f1 * smoothing) * bobModifier;
					float f3 = (entityplayer.prevCameraYaw + (entityplayer.cameraYaw - entityplayer.prevCameraYaw) * smoothing) * bobModifier;
					float f4 = (entityplayer.prevCameraPitch + (entityplayer.cameraPitch - entityplayer.prevCameraPitch) * smoothing) * bobModifier;
					GlStateManager.translate(MathHelper.sin(f2 * (float) Math.PI) * f3 * 0.5F, -Math.abs(MathHelper.cos(f2 * (float) Math.PI) * f3), 0.0F);
					GlStateManager.rotate(MathHelper.sin(f2 * (float) Math.PI) * f3 * 3.0F, 0.0F, 0.0F, 1.0F);
					GlStateManager.rotate(Math.abs(MathHelper.cos(f2 * (float) Math.PI - 0.2F) * f3) * 5.0F, 1.0F, 0.0F, 0.0F);
					GlStateManager.rotate(f4, 1.0F, 0.0F, 0.0F);


					// Position calls and apply a special position if player is sprinting or crouching
					GL11.glRotatef(rotateX, 1F, 0F, 0F); //ROLL LEFT-RIGHT
					GL11.glRotatef(rotateY, 0F, 1F, 0F); //ANGLE LEFT-RIGHT
					GL11.glRotatef(rotateZ, 0F, 0F, 1F); //ANGLE UP-DOWN
					GL11.glTranslatef(translateX + (crouchZoom * crouchSwitch), 0F, 0F);
					GL11.glTranslatef(0F, translateY, 0F);
					GL11.glTranslatef(0F, 0F, translateZ);

					if (this.timer == null) {
						this.timer = ReflectionHelper.getPrivateValue(Minecraft.class, mc, "timer", "field_71428_T");
					}

					float partialTicks = this.timer.renderPartialTicks;


					float gunRotX = ClientTickHandler.GUN_ROT_X_LAST + (ClientTickHandler.GUN_ROT_X - ClientTickHandler.GUN_ROT_X_LAST) * partialTicks;
					float gunRotY = ClientTickHandler.GUN_ROT_Y_LAST + (ClientTickHandler.GUN_ROT_Y - ClientTickHandler.GUN_ROT_Y_LAST) * partialTicks;
					GL11.glRotatef(gunRotX,0,-1,0);
					GL11.glRotatef(gunRotY,0,0,-1);

					//Render Scope

					WeaponScopeType scopeType = gunType.scopeType;

					if(GunType.getAttachment(item, AttachmentEnum.Sight) != null) {
						ItemAttachment attachmentSight = (ItemAttachment) GunType.getAttachment(item, AttachmentEnum.Sight).getItem();
						if (attachmentSight != null && attachmentSight.type.scopeType != WeaponScopeType.DEFAULT) {
							scopeType = attachmentSight.type.scopeType;
						}
					}


					if (scopeType != WeaponScopeType.DEFAULT) {
						if (adsSwitch == 1.0F) {
							if(scopeType != WeaponScopeType.REDDOT) {
								GL11.glTranslatef(model.gunOffsetScoping, 0F, 0F);
							}
							if (!ClientRenderHooks.isAimingScope) {
								ClientRenderHooks.isAimingScope = true;
								ModularWarfare.NETWORK.sendToServer(new PacketAimingRequest(entityplayer.getDisplayNameString(), true));
							}
						} else {
							if (ClientRenderHooks.isAimingScope) {
								ClientRenderHooks.isAimingScope = false;
								ModularWarfare.NETWORK.sendToServer(new PacketAimingRequest(entityplayer.getDisplayNameString(), false));
							}
						}
					} else {
						if (adsSwitch == 1.0F) {
							if (!ClientRenderHooks.isAiming) {
								ClientRenderHooks.isAiming = true;
								ModularWarfare.NETWORK.sendToServer(new PacketAimingRequest(entityplayer.getDisplayNameString(), true));
							}
						} else {
							if (ClientRenderHooks.isAiming) {
								ClientRenderHooks.isAiming = false;
								ModularWarfare.NETWORK.sendToServer(new PacketAimingRequest(entityplayer.getDisplayNameString(), false));
							}
						}
					}

					// Calls reload animation from the specified animation file
					if (anim.reloading && WeaponAnimations.getAnimation(model.reloadAnimation) != null) {
						WeaponAnimations.getAnimation(model.reloadAnimation).onGunAnimation(tiltProgress, anim);
					}

					// Recoil
					GL11.glTranslatef(-(anim.lastGunRecoil + (anim.gunRecoil - anim.lastGunRecoil) * smoothing) * model.modelRecoilBackwards, 0F, 0F);
					GL11.glRotatef((anim.lastGunRecoil + (anim.gunRecoil - anim.lastGunRecoil) * smoothing) * model.modelRecoilUpwards, 0F, 0F, 1F);
					GL11.glRotatef(((-anim.lastGunRecoil + (anim.gunRecoil - anim.lastGunRecoil) * smoothing) * randomShake * model.modelRecoilShake), 0.0f, 1.0f, 0.0f);
					GL11.glRotatef(((-anim.lastGunRecoil + (anim.gunRecoil - anim.lastGunRecoil) * smoothing) * randomShake * model.modelRecoilShake), 1.0f, 0.0f, 0.0f);


					if (anim.gunRecoil > 0.1F && entityplayer.isSprinting()) {
						RenderGun.swayHorizontal = 0f;
						RenderGun.swayVertical = 0f;
						RenderGun.swayHorizontalEP = 0f;
						RenderGun.swayVerticalEP = 0f;
						RenderGun.reloadSwitch = 0f;
						RenderGun.sprintSwitch = 0f;
					}
					break;
				}
				default:
					break;
			}

			//Render call for the static arm
			if (renderType == CustomItemRenderType.EQUIPPED_FIRST_PERSON && model.hasArms()) {
				renderStaticArm(mc.player, model, anim, currentReloadState);
			}

			GL11.glPushMatrix();
			{
				float modelScale = model.modelScale;

				/** Weapon Texture */
				int skinId = 0;
				if(item.hasTagCompound()) {
                    if (item.getTagCompound().hasKey("skinId")) {
                        skinId = item.getTagCompound().getInteger("skinId");
                    }
                }

				if(renderType == CustomItemRenderType.ENTITY){
					GL11.glColor3f(0.7f, 0.7f, 0.7f);
					renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/gray.png"));
				} else {
					String path = skinId > 0 ? gunType.modelSkins[skinId].getSkin() : gunType.modelSkins[0].getSkin();
					bindTexture("guns", path);
				}

				GL11.glScalef(modelScale, modelScale, modelScale);
				GL11.glTranslatef(model.translateAll.x * worldScale, -model.translateAll.y * worldScale, -model.translateAll.z * worldScale);


				// Item frame rendering properties
				if (renderType == CustomItemRenderType.ENTITY) {
					if (!(Minecraft.getMinecraft().currentScreen instanceof GuiInventory)) {
						GlStateManager.enableRescaleNormal();
						RenderHelper.enableStandardItemLighting();
						GlStateManager.enableLighting();
						GlStateManager.enableDepth();
					}
				}

				model.renderGun(worldScale);


				//Render any attachments
				if (GunType.getAttachment(item, AttachmentEnum.Sight) == null && !model.scopeIsOnSlide)
					model.renderDefaultScope(worldScale);
				model.renderDefaultBarrel(worldScale);
				model.renderDefaultStock(worldScale);
				model.renderDefaultGrip(worldScale);
				model.renderDefaultGadget(worldScale);

				//Render pump action
				ItemStack pumpAttachment = null;
				if (pumpAttachment == null) {
					GL11.glPushMatrix();
					{
						float pumpCurrent = currentShootState.isPresent() ? (currentShootState.get().stateType == StateType.PumpOut || currentShootState.get().stateType == StateType.PumpIn) ? currentShootState.get().currentValue : 1f : 1f;
						float pumpLast = currentShootState.isPresent() ? (currentShootState.get().stateType == StateType.PumpOut || currentShootState.get().stateType == StateType.PumpIn) ? currentShootState.get().lastValue : 1f : 1f;

						GL11.glTranslatef(-(anim.lastGunSlide + (anim.gunSlide - anim.lastGunSlide) * smoothing) * model.gunSlideDistance, 0F, 0F);

						//Doubles as bolt action animation if set
						if (model.actionType == EnumAction.Bolt) {
							if (anim.isReloadState(StateType.Charge) || anim.isReloadState(StateType.Uncharge)) {
								StateEntry boltState = anim.getReloadState().get();
								pumpCurrent = boltState.currentValue;
								pumpLast = boltState.lastValue;
							}

							if (anim.isShootState(StateType.Charge) || anim.isShootState(StateType.Uncharge)) {
								StateEntry boltState = anim.getShootState().get();
								pumpCurrent = boltState.currentValue;
								pumpLast = boltState.lastValue;
							}

							GL11.glTranslatef(model.boltRotationPoint.x, model.boltRotationPoint.y, model.boltRotationPoint.z);
							GL11.glRotatef(model.boltRotation * (1 - Math.abs(pumpLast + (pumpCurrent - pumpLast) * smoothing)), 1, 0, 0);
							GL11.glTranslatef(-model.boltRotationPoint.x, -model.boltRotationPoint.y, -model.boltRotationPoint.z);
						}

						GL11.glTranslatef(-(1 - Math.abs(pumpLast + (pumpCurrent - pumpLast) * smoothing)) * model.pumpHandleDistance, 0F, 0F);
						model.renderPump(worldScale);
					}
					GL11.glPopMatrix();
				}

				//Render charge handle
				if (model.chargeHandleDistance != 0F) {
					GL11.glPushMatrix();
					{
						float pumpCurrent = currentShootState.isPresent() ? (currentShootState.get().stateType == StateType.PumpOut || currentShootState.get().stateType == StateType.PumpIn) ? currentShootState.get().currentValue : 1f : 1f;
						float pumpLast = currentShootState.isPresent() ? (currentShootState.get().stateType == StateType.PumpOut || currentShootState.get().stateType == StateType.PumpIn) ? currentShootState.get().lastValue : 1f : 1f;
						GL11.glTranslatef(-(1 - Math.abs(pumpLast + (pumpCurrent - pumpLast) * smoothing)) * model.chargeHandleDistance, 0F, 0F);
						model.renderCharge(worldScale);
					}
					GL11.glPopMatrix();
				}

				//Render Slide
				if (GunType.getAttachment(item, AttachmentEnum.Slide) == null) {
					GL11.glPushMatrix();
					{
						float currentCharge = currentReloadState.isPresent() ? (currentReloadState.get().stateType == StateType.Charge || currentReloadState.get().stateType == StateType.Uncharge) ? currentReloadState.get().currentValue : 1f : 1f;
						float lastCharge = currentReloadState.isPresent() ? (currentReloadState.get().stateType == StateType.Charge || currentReloadState.get().stateType == StateType.Uncharge) ? currentReloadState.get().lastValue : 1f : 1f;

						GL11.glTranslatef(-(anim.lastGunSlide + (anim.gunSlide - anim.lastGunSlide) * smoothing) * model.gunSlideDistance, 0F, 0F);
						GL11.glTranslatef(-(1 - Math.abs(lastCharge + (currentCharge - lastCharge) * smoothing)) * model.chargeHandleDistance, 0F, 0F);
						model.renderSlide(worldScale);
						if (GunType.getAttachment(item, AttachmentEnum.Sight) == null && model.scopeIsOnSlide)
							model.renderDefaultScope(worldScale);

						//Render the scope on the slide, if its set on slide
						if (model.switchIsOnSlide) {
							GL11.glPushMatrix();
							{
								WeaponFireMode fireMode = gunType.getFireMode(item);
								float switchAngle = fireMode == WeaponFireMode.SEMI ? model.switchSemiRot : fireMode == WeaponFireMode.FULL ? model.switchAutoRot : fireMode == WeaponFireMode.BURST ? model.switchBurstRot : 0F;
								GL11.glTranslatef(model.switchRotationPoint.x, model.switchRotationPoint.y, model.switchRotationPoint.z);
								GL11.glRotatef(switchAngle, 0, 0, 1);
								GL11.glTranslatef(-model.switchRotationPoint.x, -model.switchRotationPoint.y, -model.switchRotationPoint.z);
								model.renderSwitch(worldScale);
							}
							GL11.glPopMatrix();
						}
					}
					GL11.glPopMatrix();
				}

				//Render break action, uses an array system to allow multiple different break action types on a gun
				for (BreakActionData breakAction : model.breakActions) {
					float breakProgress = currentReloadState.isPresent() ? (currentReloadState.get().stateType == StateType.Tilt || currentReloadState.get().stateType == StateType.Untilt) ? currentReloadState.get().currentValue : anim.tiltHold ? 1f : 0f : 0f;
					GL11.glPushMatrix();
					{
						GL11.glTranslatef(breakAction.breakPoint.x, breakAction.breakPoint.y, breakAction.breakPoint.z);
						GL11.glRotatef(breakProgress * -breakAction.angle, 0F, 0F, 1F);
						GL11.glTranslatef(-breakAction.breakPoint.x, -breakAction.breakPoint.y, -breakAction.breakPoint.z);
						model.render(breakAction.modelGroup, worldScale);
						if (GunType.getAttachment(item, AttachmentEnum.Sight) == null && model.scopeIsOnBreakAction && breakAction.scopePart)
							model.renderDefaultScope(worldScale);
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
					model.renderHammer(worldScale);
				}
				GL11.glPopMatrix();

				// Render lever action
				GL11.glPushMatrix();
				{
					float pumpCurrent = currentShootState.isPresent() ? (currentShootState.get().stateType == StateType.PumpOut || currentShootState.get().stateType == StateType.PumpIn) ? currentShootState.get().currentValue : 1f : 1f;
					float pumpLast = currentShootState.isPresent() ? (currentShootState.get().stateType == StateType.PumpOut || currentShootState.get().stateType == StateType.PumpIn) ? currentShootState.get().lastValue : 1f : 1f;
					GL11.glTranslatef(model.leverRotationPoint.x, model.leverRotationPoint.y, model.leverRotationPoint.z);
					GL11.glRotatef(model.leverRotation * (1 - Math.abs(pumpLast + (pumpCurrent - pumpLast) * smoothing)), 0, 0, 1);
					GL11.glTranslatef(-model.leverRotationPoint.x, -model.leverRotationPoint.y, -model.leverRotationPoint.z);
					model.renderLeverAction(worldScale);
				}
				GL11.glPopMatrix();

				// Render trigger
				GL11.glPushMatrix();
				{
					GL11.glTranslatef(model.triggerRotationPoint.x, model.triggerRotationPoint.y, model.triggerRotationPoint.z);
					GL11.glRotatef(model.triggerRotation * (triggerPullSwitch * 50), 0, 0, 1);
					GL11.glTranslatef(-model.triggerRotationPoint.x, -model.triggerRotationPoint.y, -model.triggerRotationPoint.z);
					model.renderTrigger(worldScale);
				}
				GL11.glPopMatrix();

				// Render fire mode switch
				if (!model.switchIsOnSlide) {
					GL11.glPushMatrix();
					{
						WeaponFireMode fireMode = gunType.getFireMode(item);
						float switchAngle = fireMode == WeaponFireMode.SEMI ? model.switchSemiRot : fireMode == WeaponFireMode.FULL ? model.switchAutoRot : fireMode == WeaponFireMode.BURST ? model.switchBurstRot : 0F;
						GL11.glTranslatef(model.switchRotationPoint.x, model.switchRotationPoint.y, model.switchRotationPoint.z);
						GL11.glRotatef(switchAngle, 0, 0, 1);
						GL11.glTranslatef(-model.switchRotationPoint.x, -model.switchRotationPoint.y, -model.switchRotationPoint.z);
						model.renderSwitch(worldScale);
					}
					GL11.glPopMatrix();
				}

				// Render the revolver barrel
				GL11.glPushMatrix();
				{
					float updatedTiltProgress = currentReloadState.isPresent() ? (currentReloadState.get().stateType == StateType.Tilt || currentReloadState.get().stateType == StateType.Untilt) ? currentReloadState.get().currentValue : anim.tiltHold ? 1f : 0f : 0f;
					GL11.glTranslatef(model.cylinderRotationPoint.x, model.cylinderRotationPoint.y, model.cylinderRotationPoint.z);
					GL11.glRotatef(updatedTiltProgress * model.cylinderRotation, 1F, 0F, 0F);
					GL11.glTranslatef(-model.cylinderRotationPoint.x, -model.cylinderRotationPoint.y, -model.cylinderRotationPoint.z);
					model.renderRevolverBarrel(worldScale);
				}
				GL11.glPopMatrix();

				// Slide lock - Keeps slide in the back position when empty if true
				boolean isAmmoEmpty = !ItemGun.hasNextShot(item);
				if (model.slideLockOnEmpty) {
					if (isAmmoEmpty)
						anim.isGunEmpty = true;
					else if (!isAmmoEmpty && !anim.reloading)
						anim.isGunEmpty = false;
				}

				// Ammo
				GL11.glPushMatrix();
				{
					boolean cachedUnload = (anim.isReloadType(ReloadType.Unload) && anim.cachedAmmoStack != null);
					if (ItemGun.hasAmmoLoaded(item) || cachedUnload) {
						ItemStack stackAmmo = cachedUnload ? anim.cachedAmmoStack : new ItemStack(item.getTagCompound().getCompoundTag("ammo"));
						ItemAmmo itemAmmo = (ItemAmmo) stackAmmo.getItem();
						AmmoType ammoType = itemAmmo.type;
						boolean shouldNormalRender = true;

						if (anim.reloading && model.reloadAnimation != null && WeaponAnimations.getAnimation(model.reloadAnimation) != null) {
							//Unload/Load ammo
							float ammoProgress = currentReloadState.isPresent() ? (currentReloadState.get().stateType == StateType.Unload || currentReloadState.get().stateType == StateType.Load) ? currentReloadState.get().currentValue : 0f : 1f;
							WeaponAnimations.getAnimation(model.reloadAnimation).onAmmoAnimation(model, ammoProgress, anim.reloadAmmoCount, anim);
						}

						if (gunType.dynamicAmmo && ammoType.model != null) {
							ModelAmmo modelAmmo = (ModelAmmo) ammoType.model;
							if (model.ammoMap.containsKey(ammoType.internalName)) {
								Vector3f ammoOffset = model.ammoMap.get(ammoType.internalName).offset;
								Vector3f ammoScale = model.ammoMap.get(ammoType.internalName).scale;

								GL11.glTranslatef(ammoOffset.x, ammoOffset.y, ammoOffset.z);
								if (ammoType.magazineCount != null) {
									int magCount = stackAmmo.getTagCompound().getInteger("magcount");
									if (!anim.reloading)
										oldMagCount = magCount;
									else if (anim.reloading)
										magCount = oldMagCount;

									if (modelAmmo.magCountOffset.containsKey(magCount)) {
										shouldNormalRender = false;
										GL11.glPushMatrix();
										{
											RenderVariables magRenderVar = modelAmmo.magCountOffset.get(magCount);
											Vector3f magOffset = magRenderVar.offset;
											Vector3f magRotate = magRenderVar.rotation;
											GL11.glTranslatef(magOffset.x, magOffset.y, magOffset.z);
											if (magRotate != null && magRenderVar.angle != null) {
												GL11.glRotatef(magRenderVar.angle, magRotate.x, magRotate.y, magRotate.z);
											}

											Vector3f adjustedScale = new Vector3f(ammoScale.x / modelScale, ammoScale.y / modelScale, ammoScale.z / modelScale);
											GL11.glScalef(adjustedScale.x, adjustedScale.y, adjustedScale.z);

											int skinIdAmmo = 0;

											if(stackAmmo.hasTagCompound()) {
												if (stackAmmo.getTagCompound().hasKey("skinId")) {
													skinIdAmmo = stackAmmo.getTagCompound().getInteger("skinId");
												}
											}
											String pathAmmo = skinIdAmmo > 0 ? ammoType.modelSkins[skinIdAmmo].getSkin() : ammoType.modelSkins[0].getSkin();
											bindTexture("ammo", pathAmmo);

											if (anim.shouldRenderAmmo()) {
												if (!cachedUnload)
													anim.cachedAmmoStack = stackAmmo;

												modelAmmo.renderAmmo(worldScale);
											}
										}
										GL11.glPopMatrix();
									}
								}

								if (shouldNormalRender) {
									Vector3f adjustedScale = new Vector3f(ammoScale.x / modelScale, ammoScale.y / modelScale, ammoScale.z / modelScale);
									GL11.glScalef(adjustedScale.x, adjustedScale.y, adjustedScale.z);
								}
							}
							if (shouldNormalRender && anim.shouldRenderAmmo()) {
								if (!cachedUnload)
									anim.cachedAmmoStack = stackAmmo;

								int skinIdAmmo = 0;

								if(stackAmmo.hasTagCompound()) {
									if (stackAmmo.getTagCompound().hasKey("skinId")) {
										skinIdAmmo = stackAmmo.getTagCompound().getInteger("skinId");
									}
								}
								String pathAmmo = skinIdAmmo > 0 ? ammoType.modelSkins[skinIdAmmo].getSkin() : ammoType.modelSkins[0].getSkin();
								bindTexture("ammo", pathAmmo);
								modelAmmo.renderAmmo(worldScale);
							}
						} else {
							if (anim.shouldRenderAmmo()) {
								if (!cachedUnload)
									anim.cachedAmmoStack = stackAmmo;
								//These translates/rotate was just a test but seems to work well for moving ammo with revolver cylinder
								float updatedTiltProgress = currentReloadState.isPresent() ? (currentReloadState.get().stateType == StateType.Tilt || currentReloadState.get().stateType == StateType.Untilt) ? currentReloadState.get().currentValue : anim.tiltHold ? 1f : 0f : 0f;
								GL11.glTranslatef(model.cylinderRotationPoint.x, model.cylinderRotationPoint.y, model.cylinderRotationPoint.z);
								GL11.glRotatef(updatedTiltProgress * model.cylinderRotation, 1F, 0F, 0F);
								GL11.glTranslatef(-model.cylinderRotationPoint.x, -model.cylinderRotationPoint.y, -model.cylinderRotationPoint.z);
								model.renderAmmo(worldScale);
							}
						}
					} else if (ItemGun.getUsedBullet(item, gunType) != null) {
						ItemBullet itemBullet = ItemGun.getUsedBullet(item, gunType);

						if (anim.reloading && model.reloadAnimation != null && WeaponAnimations.getAnimation(model.reloadAnimation) != null) {
							if (anim.reloading && model.reloadAnimation != null && WeaponAnimations.getAnimation(model.reloadAnimation) != null) {
								//Unload/Load ammo
								float ammoProgress = currentReloadState.isPresent() ? (currentReloadState.get().stateType == StateType.Unload || currentReloadState.get().stateType == StateType.Load) ? currentReloadState.get().currentValue : 0f : 0f;
								WeaponAnimations.getAnimation(model.reloadAnimation).onAmmoAnimation(model, ammoProgress, anim.reloadAmmoCount, anim);
							}
						}

						if (itemBullet.type.model != null && anim.reloading) {
							GL11.glPushMatrix();
							{
								ModelBullet bulletModel = (ModelBullet) itemBullet.type.model;
								if (model.bulletMap.containsKey(itemBullet.baseType.internalName)) {
									RenderVariables renderVar = model.bulletMap.get(itemBullet.type.internalName);
									Vector3f offset = renderVar.offset;
									GL11.glTranslatef(offset.x, offset.y, offset.z);
									if (renderVar.scale != null) {
										Vector3f scale = renderVar.scale;
										GL11.glScalef(scale.x, scale.y, scale.z);
									}
								}
								bindTexture("bullets", itemBullet.type.modelSkins[0].getSkin());
								bulletModel.renderBullet(worldScale);
							}
							GL11.glPopMatrix();
						}
					}
				}


				if (anim.muzzleFlashTime > 0 && model.hasFlash && (GunType.getAttachment(item, AttachmentEnum.Barrel) == null)) {
					GL11.glPushMatrix();
					final ModelFlash flash = model.flashModel;
					GL11.glScalef(model.flashScale, model.flashScale, model.flashScale);
					{
						if (adsSwitch != 1.0F) {
							GL11.glTranslatef(model.muzzleFlashPointNormal.x, model.muzzleFlashPointNormal.y, model.muzzleFlashPointNormal.z);
						} else {
							GL11.glTranslatef(model.muzzleFlashPointScoping.x, model.muzzleFlashPointScoping.y, model.muzzleFlashPointScoping.z);
						}
						/** Weapon Texture */
						boolean punched = false;
						if(item.hasTagCompound()) {
							if (item.getTagCompound().hasKey("punched")) {
								punched = item.getTagCompound().getBoolean("punched");
							}
						}
						if(!punched) {
							RenderGun.renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/" + model.flashTexture +".png"));
						} else {
							RenderGun.renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "skins/" + model.flashTexture + "_punched.png"));
						}
						ModelGun.glowOn();
						flash.renderFlash(worldScale, anim.flashInt);
						ModelGun.glowOff();
					}
					GL11.glPopMatrix();
				}


				// Render moving arm
				if (!ModularWarfare.DEV_ENV && model.hasArms() && renderType == CustomItemRenderType.EQUIPPED_FIRST_PERSON) {
					GL11.glPushMatrix();
					{
						//GL11.glTranslatef(-model.translateAll.x * worldScale, model.translateAll.y * worldScale, model.translateAll.z * worldScale);
						renderMovingArm(mc.player, model, anim, currentReloadState);
					}
					GL11.glPopMatrix();
				} else if (renderType == CustomItemRenderType.EQUIPPED_FIRST_PERSON && model.hasArms()) {
					renderMovingArm(mc.player, model, anim, currentReloadState);
				}

				GL11.glPopMatrix();

				// Rotation point dev tool
				if (ModularWarfare.DEV_ENV && renderType == CustomItemRenderType.ENTITY) {
					GL11.glPushMatrix();
					{
						//ModelRotateTool tool = rotateToolModel;
						//GL11.glTranslatef(model.rotationHelper.x, model.rotationHelper.y, model.rotationHelper.z);
						//renderEngine.bindTexture(new ResourceLocation(ModularWarfare.MOD_ID, "rotatetool.png"));
						//tool.renderRotateTool(worldScale);
					}
					GL11.glPopMatrix();
				}

			}
			GL11.glPopMatrix();

			GL11.glPushMatrix();
			{
				for (AttachmentEnum attachment : AttachmentEnum.values()) {
					ItemStack itemStack = GunType.getAttachment(item, attachment);
					if (itemStack != null && itemStack.getItem() != Items.AIR) {
						AttachmentType attachmentType = ((ItemAttachment) itemStack.getItem()).type;
						ModelAttachment attachmentModel = (ModelAttachment) attachmentType.model;
						if (attachmentModel != null) {
							GL11.glPushMatrix();
							{
								int skinId = 0;
								if(itemStack.hasTagCompound()) {
									if (itemStack.getTagCompound().hasKey("skinId")) {
										skinId = itemStack.getTagCompound().getInteger("skinId");
									}
								}

								String path = skinId > 0 ? attachmentType.modelSkins[skinId].getSkin() : attachmentType.modelSkins[0].getSkin();
								bindTexture("attachments", path);
								Vector3f attachmentVecTranslate = model.attachmentPointMap.get(attachment).get(0);
								Vector3f attachmentVecRotate = model.attachmentPointMap.get(attachment).get(1);

								Vector3f adjustedScale = new Vector3f(attachmentModel.modelScale, attachmentModel.modelScale, attachmentModel.modelScale);
								GL11.glScalef(adjustedScale.x, adjustedScale.y, adjustedScale.z);

								GL11.glTranslatef(attachmentVecTranslate.x / attachmentModel.modelScale, attachmentVecTranslate.y / attachmentModel.modelScale, attachmentVecTranslate.z / attachmentModel.modelScale);

								GL11.glRotatef(attachmentVecRotate.x, 1F, 0F, 0F); //ROLL LEFT-RIGHT
								GL11.glRotatef(attachmentVecRotate.y, 0F, 1F, 0F); //ANGLE LEFT-RIGHT
								GL11.glRotatef(attachmentVecRotate.z, 0F, 0F, 1F); //ANGLE UP-DOWN
								attachmentModel.renderAttachment(worldScale);
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
	public static String getStaticArmState(ModelGun model, AnimStateMachine anim) {
		Optional<StateEntry> currentShootState = anim.getShootState();
		Optional<StateEntry> currentReloadState = anim.getReloadState();
		float pumpCurrent = currentShootState.isPresent() ? (currentShootState.get().stateType == StateType.PumpOut || currentShootState.get().stateType == StateType.PumpIn) ? currentShootState.get().currentValue : 1f : 1f;
		float chargeCurrent = currentReloadState.isPresent() ? (currentReloadState.get().stateType == StateType.Charge || currentReloadState.get().stateType == StateType.Uncharge) ? currentReloadState.get().currentValue : 1f : currentShootState.isPresent() ? (currentShootState.get().stateType == StateType.Charge || currentShootState.get().stateType == StateType.Uncharge) ? currentShootState.get().currentValue : 1f : 1f;

		if (model.leftHandAmmo) {
			if ((anim.isReloadState(StateType.MoveHands) || anim.isReloadState(StateType.ReturnHands))) return "ToFrom";
			else if ((anim.isShootState(StateType.MoveHands) || anim.isShootState(StateType.ReturnHands)))
				return "ToFrom";
			else if (!anim.reloading && model.isType(EnumArm.Right, EnumAction.Pump)) return "Pump";
			else if (chargeCurrent < 0.66 && model.isType(EnumArm.Right, EnumAction.Charge) && chargeCurrent != -1.0F)
				return "Charge";
			else if ((anim.isReloadState(StateType.Charge) || anim.isReloadState(StateType.Uncharge)) && model.isType(EnumArm.Right, EnumAction.Bolt))
				return "Bolt";
			else if ((anim.isShootState(StateType.Charge) || anim.isShootState(StateType.Uncharge)) && model.isType(EnumArm.Right, EnumAction.Bolt))
				return "Bolt";
			else if (!anim.reloading && !model.isType(EnumArm.Right, EnumAction.Pump)) return "Default";
			else return "Reload";
		} else {
			if (!anim.reloading && model.isType(EnumArm.Left, EnumAction.Pump)) return "Pump";
			else if (chargeCurrent < 0.9 && model.isType(EnumArm.Right, EnumAction.Charge) && chargeCurrent != -1.0F)
				return "Charge";
			else if (chargeCurrent < 0.9 && model.isType(EnumArm.Right, EnumAction.Bolt)) return "Bolt";
			else if (!anim.reloading && !model.isType(EnumArm.Left, EnumAction.Pump)) return "Default";
			else return "Reload";
		}
	}

	//Determine the state of the moving arm
	public static String getMovingArmState(ModelGun model, AnimStateMachine anim) {
		WeaponAnimation wepAnim = WeaponAnimations.getAnimation(model.reloadAnimation);
		Optional<StateEntry> currentShootState = anim.getShootState();
		Optional<StateEntry> currentReloadState = anim.getReloadState();
		float pumpCurrent = currentShootState.isPresent() ? (currentShootState.get().stateType == StateType.PumpOut || currentShootState.get().stateType == StateType.PumpIn) ? currentShootState.get().currentValue : 1f : 1f;
		float chargeCurrent = currentReloadState.isPresent() ? (currentReloadState.get().stateType == StateType.Charge || currentReloadState.get().stateType == StateType.Uncharge) ? currentReloadState.get().currentValue : 1f : 1f;

		//Calls reload animation from the specified animation file
		if (!model.leftHandAmmo) {
			if ((anim.isShootState(StateType.PumpIn) || anim.isShootState(StateType.PumpOut)) && pumpCurrent < 0.9 && model.isType(EnumArm.Right, EnumAction.Charge) && pumpCurrent != -1.0F)
				return "Pump";
			else if (anim.isReloadState(StateType.Charge) && chargeCurrent < 0.9 && model.isType(EnumArm.Right, EnumAction.Bolt))
				return "Bolt";
			else if (!anim.reloading) return "Default";
			else if (anim.isReloadState(StateType.Load)) return "Load";
				//else if() movingArmState = "Unload";
			else return "Reload";
		} else {
			if (anim.isReloadState(StateType.Charge) && model.isType(EnumArm.Left, EnumAction.Charge) && chargeCurrent != -1.0F)
				return "Charge";
			else if ((anim.isShootState(StateType.PumpIn) || anim.isShootState(StateType.PumpOut)) && !anim.reloading && model.isType(EnumArm.Left, EnumAction.Pump))
				return "Pump";
			else if (!anim.reloading) return "Default";
			else if (anim.isReloadState(StateType.Load)) return "Load";
			else if (anim.isReloadState(StateType.Unload)) return "Unload";
			else return "Reload";
		}
	}

	// Resets render modifiers
	public static void resetRenderMods() {
		RenderGun.swayHorizontal = 0f;
		RenderGun.swayVertical = 0f;
		RenderGun.swayHorizontalEP = 0f;
		RenderGun.swayVerticalEP = 0f;
		RenderGun.reloadSwitch = 0f;
		RenderGun.sprintSwitch = 0f;
		RenderGun.adsSwitch = 0f;
		RenderGun.crouchSwitch = 0f;
		ClientRenderHooks.isAimingScope = false;
		ClientRenderHooks.isAiming = false;
	}

	//Renders the static left or right hand that does not move with the ammo depending on leftHandAmmo setting
	private void renderStaticArm(EntityPlayer player, ModelGun model, AnimStateMachine anim, Optional<StateEntry> currentState) {
		Minecraft mc = Minecraft.getMinecraft();
		mc.getTextureManager().bindTexture(Minecraft.getMinecraft().player.getLocationSkin());
		Render<AbstractClientPlayer> render = Minecraft.getMinecraft().getRenderManager().<AbstractClientPlayer>getEntityRenderObject(Minecraft.getMinecraft().player);
		RenderPlayer renderplayer = (RenderPlayer) render;

		float tiltProgress = currentState.isPresent() ? (currentState.get().stateType == StateType.Tilt || currentState.get().stateType == StateType.Untilt) ? currentState.get().currentValue : anim.tiltHold ? 1f : 0f : 0f;
		String staticArmState = getStaticArmState(model, anim);
		GL11.glPushMatrix();
		{

			boolean rightArm = model.leftHandAmmo && model.rightArmPos != null;
			if (staticArmState == "ToFrom" && rightArm && model.actionArm == EnumArm.Left) {
				rightArm = false;
			}
			Vector3f armScale = rightArm ? model.rightArmScale : model.leftArmScale;
			Vector3f armRot = rightArm ? model.rightArmRot : model.leftArmRot;
			Vector3f armPos = rightArm ? model.rightArmPos : model.leftArmPos;
			Vector3f chargeArmRot = model.actionArm == EnumArm.Right ? model.rightArmChargeRot : model.leftArmChargeRot;
			Vector3f chargeArmPos = model.actionArm == EnumArm.Right ? model.rightArmChargePos : model.leftArmChargePos;
			Vector3f reloadArmRot = rightArm ? model.rightArmReloadRot : model.leftArmReloadRot;
			Vector3f reloadArmPos = rightArm ? model.rightArmReloadPos : model.leftArmReloadPos;

			if (staticArmState == "Pump")
				RenderArms.renderArmPump(model, anim, smoothing, armRot, armPos, !model.leftHandAmmo);
			else if (staticArmState == "Charge")
				RenderArms.renderArmCharge(model, anim, smoothing, chargeArmRot, chargeArmPos, armRot, armPos, !model.leftHandAmmo);
			else if (staticArmState == "Bolt")
				RenderArms.renderArmBolt(model, anim, smoothing, chargeArmRot, chargeArmPos, !model.leftHandAmmo);
			else if (staticArmState == "Default")
				RenderArms.renderArmDefault(model, anim, smoothing, armRot, armPos, rightArm, !model.leftHandAmmo);
			else if (staticArmState == "Reload")
				RenderArms.renderStaticArmReload(model, anim, smoothing, tiltProgress, reloadArmRot, reloadArmPos, armRot, armPos, !model.leftHandAmmo);
			else if (staticArmState == "ToFrom")
				RenderArms.renderToFrom(model, anim, smoothing, chargeArmRot, chargeArmPos, armRot, armPos, !model.leftHandAmmo);

			//Render the armor model on the arm
			GL11.glScalef(armScale.x, armScale.y, armScale.z);
			renderplayer.getMainModel().setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, player);
			renderplayer.getMainModel().bipedRightArm.offsetX = 0F;
			if (rightArm) {
				renderplayer.renderRightArm(Minecraft.getMinecraft().player);
				renderRightSleeve(player, renderplayer.getMainModel());
			} else {
				renderplayer.renderLeftArm(Minecraft.getMinecraft().player);
				renderLeftSleeve(player, renderplayer.getMainModel());
			}
		}
		GL11.glPopMatrix();
	}

	// Renders a left or right hand that moves with ammo depending on leftHandAmmo setting
	private void renderMovingArm(EntityPlayer player, ModelGun model, AnimStateMachine anim, Optional<StateEntry> currentState) {
		Minecraft mc = Minecraft.getMinecraft();
		mc.getTextureManager().bindTexture(Minecraft.getMinecraft().player.getLocationSkin());
		Render<AbstractClientPlayer> render = Minecraft.getMinecraft().getRenderManager().<AbstractClientPlayer>getEntityRenderObject(Minecraft.getMinecraft().player);
		RenderPlayer renderplayer = (RenderPlayer) render;

		boolean rightArm = model.leftHandAmmo && model.rightArmPos != null;
		String movingArmState = getMovingArmState(model, anim);
		WeaponAnimation weaponAnimation = WeaponAnimations.getAnimation(model.reloadAnimation);
		float tiltProgress = currentState.isPresent() ? (currentState.get().stateType == StateType.Tilt || currentState.get().stateType == StateType.Untilt) ? currentState.get().currentValue : anim.tiltHold ? 1f : 0f : 0f;
		GL11.glPushMatrix();
		{
			GL11.glScalef(1 / model.modelScale, 1 / model.modelScale, 1 / model.modelScale);

			if (!model.leftHandAmmo && model.rightArmPos != null && model.rightArmReloadPos != null) {
				GL11.glPushMatrix();
				{
					if (movingArmState == "Pump") {
						RenderArms.renderArmPump(model, anim, smoothing, model.rightArmRot, model.rightArmPos, model.leftHandAmmo);
					} else if (movingArmState == "Bolt") {
						RenderArms.renderArmBolt(model, anim, smoothing, model.rightArmChargeRot, model.rightArmChargePos, model.leftHandAmmo);
					} else if (movingArmState == "Default") {
						RenderArms.renderArmDefault(model, anim, smoothing, model.rightArmRot, model.rightArmPos, true, model.leftHandAmmo);
					} else if (movingArmState == "Load") {
						RenderArms.renderArmLoad(model, anim, weaponAnimation, smoothing, tiltProgress, model.rightArmReloadRot, model.rightArmReloadPos, model.rightArmRot, model.rightArmPos, model.leftHandAmmo);
					} else if (movingArmState == "Reload") {
						RenderArms.renderArmReload(model, anim, weaponAnimation, smoothing, tiltProgress, model.rightArmReloadRot, model.rightArmReloadPos, model.rightArmRot, model.rightArmPos, model.leftHandAmmo);
					}
					GL11.glScalef(model.rightArmScale.x, model.rightArmScale.y, model.rightArmScale.z);
					renderplayer.getMainModel().setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, player);
					renderplayer.getMainModel().bipedRightArm.offsetX = 0F;
					renderplayer.renderRightArm(mc.player);
					renderRightSleeve(player, renderplayer.getMainModel());
				}
				GL11.glPopMatrix();
			}

			if (model.leftHandAmmo && model.leftArmPos != null && model.leftArmReloadPos != null) {
				GL11.glPushMatrix();
				{
					if (movingArmState == "Charge") {
						RenderArms.renderArmCharge(model, anim, smoothing, model.leftArmChargeRot, model.leftArmChargePos, model.leftArmRot, model.leftArmPos, model.leftHandAmmo);
					} else if (movingArmState == "Pump") {
						RenderArms.renderArmPump(model, anim, smoothing, model.leftArmRot, model.leftArmPos, model.leftHandAmmo);
					} else if (movingArmState == "Default") {
						RenderArms.renderArmDefault(model, anim, smoothing, model.leftArmRot, model.leftArmPos, false, model.leftHandAmmo);
					} else if (movingArmState == "Load") {
						RenderArms.renderArmLoad(model, anim, weaponAnimation, smoothing, tiltProgress, model.leftArmReloadRot, model.leftArmReloadPos, model.leftArmRot, model.leftArmPos, model.leftHandAmmo);
					} else if (movingArmState == "Unload") {
						RenderArms.renderArmUnload(model, anim, weaponAnimation, smoothing, tiltProgress, model.leftArmReloadRot, model.leftArmReloadPos, model.leftArmRot, model.leftArmPos, model.leftHandAmmo);
					} else if (movingArmState == "Reload") {
						RenderArms.renderArmReload(model, anim, weaponAnimation, smoothing, tiltProgress, model.leftArmReloadRot, model.leftArmReloadPos, model.leftArmRot, model.leftArmPos, model.leftHandAmmo);
					}

					GL11.glScalef(model.leftArmScale.x, model.leftArmScale.y, model.leftArmScale.z);
					renderplayer.getMainModel().bipedLeftArm.offsetY = 0F;
					renderplayer.renderLeftArm(mc.player);
					renderLeftSleeve(player, renderplayer.getMainModel());
				}
				GL11.glPopMatrix();
			}
		}
		GL11.glPopMatrix();
	}


	public void renderLeftSleeve(EntityPlayer player, ModelBiped modelplayer) {
		if (player.inventory.armorItemInSlot(2) != null) {
			ItemStack armorStack = player.inventory.armorItemInSlot(2);
			if (armorStack.getItem() instanceof ItemMWArmor) {
				ModelArmor modelArmor = ((ModelArmor) ((ItemMWArmor) armorStack.getItem()).type.bipedModel);
				int skinId = 0;
				String path = skinId > 0 ? ((ItemMWArmor) armorStack.getItem()).type.modelSkins[skinId].getSkin() : ((ItemMWArmor) armorStack.getItem()).type.modelSkins[0].getSkin();
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
		final int[] array;
		final int[] slots = array = new int[] { 1, 2, 6, 3 };
		for (final int slot : array) {
			final ItemStack itemStack = ArmorApi.getArmorInSlot(player, slot);
			if (!itemStack.isEmpty()) {
				final ArmorType armorType = ((ItemSpecialArmor)itemStack.getItem()).type;
				if (armorType.hasModel()) {
					final ModelArmor armorModel = (ModelArmor)armorType.bipedModel;
					GlStateManager.pushMatrix();
					final int skinId2 = 0;
					final String path2 = ((ItemSpecialArmor)itemStack.getItem()).type.modelSkins[0].getSkin();
					this.bindTexture("armor", path2);
					GL11.glPushMatrix();
					final float modelScale2 = armorModel.modelScale;
					GL11.glScalef(modelScale2, modelScale2, modelScale2);
					armorModel.render(armorModel.leftArmModel, modelplayer.bipedLeftArm, 0.0625f, modelScale2);
					GL11.glPopMatrix();
					GlStateManager.popMatrix();
				}
			}
		}
	}

	public void renderRightSleeve(EntityPlayer player, ModelBiped modelplayer) {
		if (player.inventory.armorItemInSlot(2) != null) {
			ItemStack armorStack = player.inventory.armorItemInSlot(2);
			if (armorStack.getItem() instanceof ItemMWArmor) {
				ModelArmor modelArmor = ((ModelArmor) ((ItemMWArmor) armorStack.getItem()).type.bipedModel);
				int skinId = 0;
				String path = skinId > 0 ? ((ItemMWArmor) armorStack.getItem()).type.modelSkins[skinId].getSkin() : ((ItemMWArmor) armorStack.getItem()).type.modelSkins[0].getSkin();
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
		final int[] array;
		final int[] slots = array = new int[] { 1, 2, 6, 3 };
		for (final int slot : array) {
			final ItemStack itemStack = ArmorApi.getArmorInSlot(player, slot);
			if (!itemStack.isEmpty()) {
				final ArmorType armorType = ((ItemSpecialArmor)itemStack.getItem()).type;
				if (armorType.hasModel()) {
					final ModelArmor armorModel = (ModelArmor)armorType.bipedModel;
					GlStateManager.pushMatrix();
					final int skinId2 = 0;
					final String path2 = ((ItemSpecialArmor)itemStack.getItem()).type.modelSkins[0].getSkin();
					this.bindTexture("armor", path2);
					GL11.glPushMatrix();
					final float modelScale2 = armorModel.modelScale;
					GL11.glScalef(modelScale2, modelScale2, modelScale2);
					armorModel.render(armorModel.rightArmModel, modelplayer.bipedRightArm, 0.0625f, modelScale2);
					GL11.glPopMatrix();
					GlStateManager.popMatrix();
				}
			}
		}

	}
}