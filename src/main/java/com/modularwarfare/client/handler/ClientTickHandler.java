package com.modularwarfare.client.handler;

import java.util.Random;

import com.modularwarfare.client.model.InstantBulletRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent;
import org.lwjgl.input.Mouse;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.ClientRenderHooks;
import com.modularwarfare.client.StateMachine;
import com.modularwarfare.client.anim.AnimStateMachine;
import com.modularwarfare.client.anim.StateEntry;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.RenderGun;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.utility.NumberHelper;
import com.modularwarfare.utility.event.ForgeEvent;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ClientTickHandler extends ForgeEvent {
		
	// Recoil variables
	/** The recoil applied to the player view by shooting */
	public static float playerRecoilPitch;
	public static float playerRecoilYaw;
	/** The amount of compensation applied to recoil in order to bring it back to normal */
	public static float antiRecoilPitch;
	public static float antiRecoilYaw;

	private int tickCount = 0;
	private int maxTickCount = 20;
	
	private final Random random;

	private float prevFov;
	private float mouseSens;

	public ClientTickHandler() {
		super();
		this.mouseSens = Minecraft.getMinecraft().gameSettings.mouseSensitivity;
		ModularWarfare.LOGGER.info("Set original sensibility to: "+this.mouseSens);
		random = new Random();
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
				break;
		}
	}
	
	@SubscribeEvent
	public void renderTick(TickEvent.RenderTickEvent event)
	{
		switch(event.phase)
		{
			case START:
			{
				float renderTick = event.renderTickTime;
				renderTick *= 60d / (double) Minecraft.getDebugFPS();
				StateEntry.smoothing = renderTick;
				onRenderTickStart(Minecraft.getMinecraft(), renderTick);
				break;
			}
			case END:
			{
				float renderTick = NumberHelper.clamp(event.renderTickTime, 0.019998193f, 0.99999803f);
				renderTick *= 60d / (double) Minecraft.getDebugFPS();
				break;
			}
		}
	}
	
	public void onRenderTickStart(Minecraft minecraft, float renderTick)
	{	
		if (minecraft.player == null || minecraft.world == null)
			return;
			
		EntityPlayerSP player = minecraft.player;
		
		if(player.getHeldItemMainhand() != null && player.getHeldItemMainhand().getItem() instanceof ItemGun)
		{
			ModelGun model = (ModelGun) ((ItemGun) player.getHeldItemMainhand().getItem()).type.model;
			if(!RenderGun.lastModel.equalsIgnoreCase(model.getClass().getName()))
			{
				RenderGun.resetRenderMods();
				RenderGun.lastModel = model.getClass().getName(); 
			}
			
			AnimStateMachine anim = ClientRenderHooks.getAnimMachine(player);
			
			float adsSpeed = (0.15f + model.adsSpeed) * renderTick;
			boolean aimChargeMisc = !anim.reloading;
			float value = Minecraft.getMinecraft().inGameHasFocus && Mouse.isButtonDown(1) && aimChargeMisc ? RenderGun.adsSwitch + adsSpeed : RenderGun.adsSwitch - adsSpeed;
			RenderGun.adsSwitch = Math.max(0, Math.min(1, value));;
			
			float sprintSpeed = 0.15f * renderTick;
			float sprintValue = player.isSprinting() ? RenderGun.sprintSwitch + sprintSpeed : RenderGun.sprintSwitch - sprintSpeed;
			RenderGun.sprintSwitch = Math.max(0, Math.min(1, sprintValue));;
			
			float crouchSpeed = 0.15f * renderTick;
			float crouchValue = player.isSneaking() ? RenderGun.crouchSwitch + crouchSpeed : RenderGun.crouchSwitch - crouchSpeed;
			RenderGun.crouchSwitch = Math.max(0, Math.min(1, crouchValue));;
			
			float reloadSpeed = 0.15f * renderTick;
			float reloadValue = anim.reloading ? RenderGun.reloadSwitch - reloadSpeed : RenderGun.reloadSwitch + reloadSpeed;
			RenderGun.reloadSwitch = Math.max(0, Math.min(1, reloadValue));;
			
			float triggerPullSpeed = 0.03f * renderTick;
			float triggerPullValue = Minecraft.getMinecraft().inGameHasFocus && Mouse.isButtonDown(0) ? RenderGun.triggerPullSwitch + triggerPullSpeed : RenderGun.triggerPullSwitch - triggerPullSpeed;
			RenderGun.triggerPullSwitch = Math.max(0, Math.min(model.triggerDistance, triggerPullValue));
			
			float modeSwitchSpeed = 0.03f * renderTick;
			float modeSwitchValue = Minecraft.getMinecraft().inGameHasFocus && Mouse.isButtonDown(0) ? RenderGun.triggerPullSwitch + triggerPullSpeed : RenderGun.triggerPullSwitch - triggerPullSpeed;
			RenderGun.triggerPullSwitch = Math.max(0, Math.min(model.triggerDistance, triggerPullValue));
			
//			float maxHorizontal = 3.0f;
//			float maxVertical = 1.5f;
//			float swaySpeed = 0.003f * renderTick;
//			if(RenderGun.swayHorizontalEP == null || Float.isNaN(RenderGun.swayHorizontalEP)) RenderGun.swayHorizontalEP = NumberHelper.generateInRange(maxHorizontal);
//			if(RenderGun.swayVerticalEP == null || Float.isNaN(RenderGun.swayVerticalEP)) RenderGun.swayVerticalEP = NumberHelper.generateInRange(maxVertical);
//			RenderGun.swayHorizontal = !Float.isNaN(RenderGun.swayHorizontal) ? NumberHelper.isInRange(maxHorizontal, RenderGun.swayHorizontal) ? NumberHelper.addTowards(RenderGun.swayHorizontalEP, RenderGun.swayHorizontal, swaySpeed) : 0 : 0;
//			RenderGun.swayVertical = !Float.isNaN(RenderGun.swayVertical) ? NumberHelper.isInRange(maxVertical, RenderGun.swayVertical) ? NumberHelper.addTowards(RenderGun.swayVerticalEP, RenderGun.swayVertical, swaySpeed/2) : 0 : 0;
//			RenderGun.swayHorizontalEP = NumberHelper.isTargetMet(RenderGun.swayHorizontalEP, RenderGun.swayHorizontal) ? NumberHelper.generateInRange(maxHorizontal) : RenderGun.swayHorizontalEP;
//			RenderGun.swayVerticalEP = NumberHelper.isTargetMet(RenderGun.swayVerticalEP, RenderGun.swayVertical) ? NumberHelper.generateInRange(maxVertical) : RenderGun.swayVerticalEP;
			
			for(AnimStateMachine stateMachine : ClientRenderHooks.weaponAnimations.values())
			{
				stateMachine.onRenderTickUpdate();
			}
		} else
		{
			RenderGun.resetRenderMods();
		}
	}
	
	public void onClientTickStart(Minecraft minecraft) {
		if (minecraft.player == null || minecraft.world == null)
			return;

		EntityPlayerSP player = minecraft.player;

		if (ModularWarfare.DEV_ENV) {
			if (tickCount == maxTickCount) {
				if (player.getHeldItemMainhand() != null && player.getHeldItemMainhand().getItem() instanceof ItemGun) {
					GunType gunType = (GunType) ((ItemGun) player.getHeldItemMainhand().getItem()).type;
					//IDK WHY YOU RELOAD THE MODEL
					//gunType.reloadModel();
				}
			}

			if (tickCount >= maxTickCount)
				tickCount = 0;
			else
				tickCount++;
		}

		if (ClientRenderHooks.isAimingScope) {
			if (minecraft.gameSettings.thirdPersonView == 0 && player.getHeldItemMainhand().getItem() instanceof ItemGun) {
				ItemGun gun = (ItemGun) player.getHeldItemMainhand().getItem();
				switch (gun.type.scopeType) {
					case TWO:
						if (Minecraft.getMinecraft().gameSettings.fovSetting != 45) {
							Minecraft.getMinecraft().gameSettings.fovSetting = 45;
							Minecraft.getMinecraft().gameSettings.mouseSensitivity *= 0.95f;
						}
						break;
					case FOUR:
						if (Minecraft.getMinecraft().gameSettings.fovSetting != 25) {
							Minecraft.getMinecraft().gameSettings.fovSetting = 25;
							Minecraft.getMinecraft().gameSettings.mouseSensitivity *= 0.65f;
						}
						break;
					case EIGHT:
						if (Minecraft.getMinecraft().gameSettings.fovSetting != 10) {
							Minecraft.getMinecraft().gameSettings.fovSetting = 10;
							Minecraft.getMinecraft().gameSettings.mouseSensitivity *= 0.2f;
						}
						break;
					case FIFTEEN:
						if (Minecraft.getMinecraft().gameSettings.fovSetting != 3) {
							Minecraft.getMinecraft().gameSettings.fovSetting = 3;
							Minecraft.getMinecraft().gameSettings.mouseSensitivity *= 0.1f;
						}
						break;
					default:
						break;
				}
			}
		} else {
			if(Minecraft.getMinecraft().gameSettings.fovSetting != this.prevFov){
				Minecraft.getMinecraft().gameSettings.fovSetting = this.prevFov;
			}
			if(Minecraft.getMinecraft().gameSettings.mouseSensitivity != this.mouseSens){
				Minecraft.getMinecraft().gameSettings.mouseSensitivity = this.mouseSens;
			}
		}
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
		
		for(AnimStateMachine stateMachine : ClientRenderHooks.weaponAnimations.values()) {
			stateMachine.onTickUpdate();
		}

		InstantBulletRenderer.UpdateAllTrails();

	}

}
