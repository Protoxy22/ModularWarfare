package com.modularwarfare.client.handler;

import java.lang.reflect.Field;
import java.util.Random;

import com.modularwarfare.client.model.InstantBulletRenderer;
import com.modularwarfare.common.guns.ItemSpray;
import com.modularwarfare.utility.MWSound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.lwjgl.input.Mouse;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.ClientRenderHooks;
import com.modularwarfare.client.anim.AnimStateMachine;
import com.modularwarfare.client.anim.StateEntry;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.RenderGun;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.utility.NumberHelper;
import com.modularwarfare.utility.event.ForgeEvent;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ClientTickHandler extends ForgeEvent {

	// Recoil variables
	/**
	 * The recoil applied to the player view by shooting
	 */
	public static float playerRecoilPitch;
	public static float playerRecoilYaw;
	/**
	 * The amount of compensation applied to recoil in order to bring it back to normal
	 */
	public static float antiRecoilPitch;
	public static float antiRecoilYaw;

	private final Random random;

	public static float prevFov;
	public static float mouseSens;

	private boolean hasChangedFOV;
	private boolean hasChangedSens;

	private static Item oldItem;

	public static float GUN_ROT_X = 0;
	public static float GUN_ROT_Y = 0;
	public static float GUN_ROT_Z = 0;

	public static float GUN_ROT_X_LAST = 0;
	public static float GUN_ROT_Y_LAST = 0;
	public static float GUN_ROT_Z_LAST = 0;

	public static float prevPitch = 0;

	private static Field sprintToggleTimer = null;

	public ClientTickHandler() {
		super();
		this.mouseSens = Minecraft.getMinecraft().gameSettings.mouseSensitivity;
		ModularWarfare.LOGGER.info("Set original sensibility to: " + this.mouseSens);
		random = new Random();
		try {
			sprintToggleTimer = ReflectionHelper.findField(EntityPlayerSP.class, "sprintToggleTimer", "field_71156_d");
		} catch (Exception e) {
			ModularWarfare.LOGGER.error("Unable to find field 'sprintToggleTimer'");
			e.printStackTrace();
		}
	}


	@SubscribeEvent
	public void onInitialize(EntityEvent.EntityConstructing e) {
		if (e.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) e.getEntity();
			if (player.world.isRemote) {

				//Your fov cannot be under the "Normal" setting since it would be overpowered in some cases
				//Purely balance stuff
				float prevfov = Minecraft.getMinecraft().gameSettings.fovSetting;

				if (prevfov < 70) {
					prevfov = 70;
					Minecraft.getMinecraft().gameSettings.fovSetting = 70f;
				}

				//We set the base value to this if the previous value didn't meet our requirements
				this.prevFov = prevfov;
			}
		}
	}


	@SubscribeEvent
	public void clientTick(TickEvent.ClientTickEvent event) {
		switch (event.phase) {
			case START:
				onClientTickStart(Minecraft.getMinecraft());
				ModularWarfare.NETWORK.handleClientPackets();
				break;
			case END:
				onClientTickEnd(Minecraft.getMinecraft());

		}
	}

	@SubscribeEvent
	public void renderTick(TickEvent.RenderTickEvent event) {
		switch (event.phase) {
			case START: {
				float renderTick = event.renderTickTime;
				renderTick *= 60d / (double) Minecraft.getDebugFPS();
				StateEntry.smoothing = renderTick;
				onRenderTickStart(Minecraft.getMinecraft(), renderTick);
				break;
			}
			case END: {
				float renderTick = NumberHelper.clamp(event.renderTickTime, 0.019998193f, 0.99999803f);
				renderTick *= 60d / (double) Minecraft.getDebugFPS();
				break;
			}
		}
	}

	public void onRenderTickStart(Minecraft minecraft, float renderTick) {
		if (minecraft.player == null || minecraft.world == null)
			return;

		EntityPlayerSP player = minecraft.player;

		if (player.getHeldItemMainhand() != null && player.getHeldItemMainhand().getItem() instanceof ItemGun) {
			ModelGun model = (ModelGun) ((ItemGun) player.getHeldItemMainhand().getItem()).type.model;
			if (!RenderGun.lastModel.equalsIgnoreCase(model.getClass().getName())) {
				RenderGun.resetRenderMods();
				RenderGun.lastModel = model.getClass().getName();
			}

			AnimStateMachine anim = ClientRenderHooks.getAnimMachine(player);

			float adsSpeed = (0.15f + model.adsSpeed) * renderTick;
			boolean aimChargeMisc = !anim.reloading;
			float value = Minecraft.getMinecraft().inGameHasFocus && Mouse.isButtonDown(1) && aimChargeMisc ? RenderGun.adsSwitch + adsSpeed : RenderGun.adsSwitch - adsSpeed;
			RenderGun.adsSwitch = Math.max(0, Math.min(1, value));
			;

			float sprintSpeed = 0.15f * renderTick;
			float sprintValue = player.isSprinting() ? RenderGun.sprintSwitch + sprintSpeed : RenderGun.sprintSwitch - sprintSpeed;
			RenderGun.sprintSwitch = Math.max(0, Math.min(1, sprintValue));
			;

			float crouchSpeed = 0.15f * renderTick;
			float crouchValue = player.isSneaking() ? RenderGun.crouchSwitch + crouchSpeed : RenderGun.crouchSwitch - crouchSpeed;
			RenderGun.crouchSwitch = Math.max(0, Math.min(1, crouchValue));
			;

			float reloadSpeed = 0.15f * renderTick;
			float reloadValue = anim.reloading ? RenderGun.reloadSwitch - reloadSpeed : RenderGun.reloadSwitch + reloadSpeed;
			RenderGun.reloadSwitch = Math.max(0, Math.min(1, reloadValue));
			;

			float triggerPullSpeed = 0.03f * renderTick;
			float triggerPullValue = Minecraft.getMinecraft().inGameHasFocus && Mouse.isButtonDown(0) ? RenderGun.triggerPullSwitch + triggerPullSpeed : RenderGun.triggerPullSwitch - triggerPullSpeed;
			RenderGun.triggerPullSwitch = Math.max(0, Math.min(model.triggerDistance, triggerPullValue));

			float modeSwitchSpeed = 0.03f * renderTick;
			float modeSwitchValue = Minecraft.getMinecraft().inGameHasFocus && Mouse.isButtonDown(0) ? RenderGun.triggerPullSwitch + triggerPullSpeed : RenderGun.triggerPullSwitch - triggerPullSpeed;
			RenderGun.triggerPullSwitch = Math.max(0, Math.min(model.triggerDistance, triggerPullValue));



			//Guns animations
			float maxHorizontal = 3.0f;
			float maxVertical = 1.5f;
			float swaySpeed = 0.006f * renderTick;
			if(RenderGun.swayHorizontalEP == null || Float.isNaN(RenderGun.swayHorizontalEP)) RenderGun.swayHorizontalEP = NumberHelper.generateInRange(maxHorizontal);
			if(RenderGun.swayVerticalEP == null || Float.isNaN(RenderGun.swayVerticalEP)) RenderGun.swayVerticalEP = NumberHelper.generateInRange(maxVertical);
			RenderGun.swayHorizontal = !Float.isNaN(RenderGun.swayHorizontal) ? NumberHelper.isInRange(maxHorizontal, RenderGun.swayHorizontal) ? NumberHelper.addTowards(RenderGun.swayHorizontalEP, RenderGun.swayHorizontal, swaySpeed) : 0 : 0;
			RenderGun.swayVertical = !Float.isNaN(RenderGun.swayVertical) ? NumberHelper.isInRange(maxVertical, RenderGun.swayVertical) ? NumberHelper.addTowards(RenderGun.swayVerticalEP, RenderGun.swayVertical, swaySpeed/2) : 0 : 0;
			RenderGun.swayHorizontalEP = NumberHelper.isTargetMet(RenderGun.swayHorizontalEP, RenderGun.swayHorizontal) ? NumberHelper.generateInRange(maxHorizontal) : RenderGun.swayHorizontalEP;
			RenderGun.swayVerticalEP = NumberHelper.isTargetMet(RenderGun.swayVerticalEP, RenderGun.swayVertical) ? NumberHelper.generateInRange(maxVertical) : RenderGun.swayVerticalEP;

			for (AnimStateMachine stateMachine : ClientRenderHooks.weaponAnimations.values()) {
				stateMachine.onRenderTickUpdate();
			}
		} else {
			RenderGun.resetRenderMods();
		}
	}

	public void onClientTickStart(Minecraft minecraft) {
		if (minecraft.player == null || minecraft.world == null)
			return;

		EntityPlayerSP player = minecraft.player;


		if (ClientRenderHooks.isAimingScope) {
			if (minecraft.gameSettings.thirdPersonView == 0 && player.getHeldItemMainhand().getItem() instanceof ItemGun) {
				ItemGun gun = (ItemGun) player.getHeldItemMainhand().getItem();
				switch (gun.type.scopeType) {
					case DEFAULT:
						break;
					case TWO:
						if (Minecraft.getMinecraft().gameSettings.fovSetting != 45) {
							Minecraft.getMinecraft().gameSettings.fovSetting = 45;
							Minecraft.getMinecraft().gameSettings.mouseSensitivity = this.mouseSens * 0.95f;
							hasChangedSens = false;
							hasChangedFOV = false;
						}
						break;
					case FOUR:
						if (Minecraft.getMinecraft().gameSettings.fovSetting != 25) {
							Minecraft.getMinecraft().gameSettings.fovSetting = 25;
							Minecraft.getMinecraft().gameSettings.mouseSensitivity = this.mouseSens * 0.65f;
							hasChangedSens = false;
							hasChangedFOV = false;
						}
						break;
					case EIGHT:
						if (Minecraft.getMinecraft().gameSettings.fovSetting != 10) {
							Minecraft.getMinecraft().gameSettings.fovSetting = 10;
							Minecraft.getMinecraft().gameSettings.mouseSensitivity = this.mouseSens * 0.2f;
							hasChangedSens = false;
							hasChangedFOV = false;
						}
						break;
					case FIFTEEN:
						if (Minecraft.getMinecraft().gameSettings.fovSetting != 3) {
							Minecraft.getMinecraft().gameSettings.fovSetting = 3;
							Minecraft.getMinecraft().gameSettings.mouseSensitivity = this.mouseSens * 0.1f;
							hasChangedSens = false;
							hasChangedFOV = false;
						}
						break;
					default:
						break;
				}
			}
		} else {
			if (hasChangedFOV == false) {
				Minecraft.getMinecraft().gameSettings.fovSetting = this.prevFov;
				hasChangedFOV = true;
			}
			if (hasChangedSens == false) {
				Minecraft.getMinecraft().gameSettings.mouseSensitivity = this.mouseSens;
				hasChangedSens = true;
			} else {
				this.mouseSens = Minecraft.getMinecraft().gameSettings.mouseSensitivity;
				this.prevFov = Minecraft.getMinecraft().gameSettings.fovSetting;
			}
		}

		GUN_ROT_X_LAST = GUN_ROT_X;
		GUN_ROT_Y_LAST = GUN_ROT_Y;
		GUN_ROT_Z_LAST = GUN_ROT_Z;

		Minecraft mc = FMLClientHandler.instance().getClient();

		if (mc.getRenderViewEntity() != null) {
			if (mc.getRenderViewEntity().getRotationYawHead() > mc.getRenderViewEntity().prevRotationYaw) {
				GUN_ROT_X += (mc.getRenderViewEntity().getRotationYawHead() - mc.getRenderViewEntity().prevRotationYaw) / 2;
			} else if (mc.getRenderViewEntity().getRotationYawHead() < mc.getRenderViewEntity().prevRotationYaw) {
				GUN_ROT_X -= (mc.getRenderViewEntity().prevRotationYaw - mc.getRenderViewEntity().getRotationYawHead()) / 2;
			}
			if (mc.getRenderViewEntity().rotationPitch > prevPitch) {
				GUN_ROT_Y += (mc.getRenderViewEntity().rotationPitch - prevPitch) / 2;
			} else if (mc.getRenderViewEntity().rotationPitch < prevPitch) {
				GUN_ROT_Y -= (prevPitch - mc.getRenderViewEntity().rotationPitch) / 2;
			}
			prevPitch = mc.getRenderViewEntity().rotationPitch;
		}

		GUN_ROT_X *= .2F;
		GUN_ROT_Y *= .2F;
		GUN_ROT_Z *= .2F;

		if (GUN_ROT_X > 20) {
			GUN_ROT_X = 20;
		} else if (GUN_ROT_X < -20) {
			GUN_ROT_X = -20;
		}

		if (GUN_ROT_Y > 20) {
			GUN_ROT_Y = 20;
		} else if (GUN_ROT_Y < -20) {
			GUN_ROT_Y = -20;
		}


		this.playEquipSound();
		ItemGun.fireButtonHeld = Mouse.isButtonDown(0);
	}

	public void onClientTickEnd(Minecraft minecraft) {
		if (minecraft.player == null || minecraft.world == null)
			return;

		EntityPlayerSP player = minecraft.player;

		if (playerRecoilPitch > 0)
			playerRecoilPitch *= 0.8F;

		if (playerRecoilYaw > 0)
			playerRecoilYaw *= 0.8F;

		player.rotationPitch -= playerRecoilPitch;
		player.rotationYaw -= playerRecoilYaw;
		antiRecoilPitch += playerRecoilPitch;
		antiRecoilYaw += playerRecoilYaw;

		player.rotationPitch += antiRecoilPitch * 0.2F;
		player.rotationYaw += antiRecoilYaw * 0.2F;
		antiRecoilPitch *= 0.8F;
		antiRecoilYaw *= 0.8F;

		for (AnimStateMachine stateMachine : ClientRenderHooks.weaponAnimations.values()) {
			stateMachine.onTickUpdate();
		}

		AnimStateMachine anim = ClientRenderHooks.getAnimMachine(player);
		if(anim.reloading){
			try {
				sprintToggleTimer.setInt(player, 7);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}

		InstantBulletRenderer.UpdateAllTrails();
	}


	public void playEquipSound() {
		final EntityPlayer player = Minecraft.getMinecraft().player;
		if (player.getHeldItemMainhand().getItem() != this.oldItem) {
			if (player.getHeldItemMainhand().getItem() instanceof ItemGun) {
				ModularWarfare.PROXY.playSound(new MWSound(player.getPosition(), "equip", 1f, 1f));
				ItemGun.delay = 20;
			} else if (player.getHeldItemMainhand().getItem() instanceof ItemSpray) {
				ModularWarfare.PROXY.playSound(new MWSound(player.getPosition(), "shake", 1f, 1f));
				ItemGun.delay = 20;
			}
		}
		if (this.oldItem != player.getHeldItemMainhand().getItem()) {
			this.oldItem = player.getHeldItemMainhand().getItem();
		}
	}
}
