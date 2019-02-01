package com.modularwarfare.client.handler;

import java.util.Random;

import org.lwjgl.input.Mouse;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.AnimStateMachine;
import com.modularwarfare.client.ClientRenderHooks;
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
	
	public ClientTickHandler()
	{
		super();
		random = new Random();
	}
	
	@SubscribeEvent
	public void clientTick(TickEvent.ClientTickEvent event)
	{
		switch(event.phase)
		{
		case START :
			onClientTickStart(Minecraft.getMinecraft());
			ModularWarfare.NETWORK.handleClientPackets();
			break;
		case END :
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
				onRenderTickStart(Minecraft.getMinecraft(), event.renderTickTime);
				break;
			}
			case END:
			{
				
				break;
			}
		}
	}
	
	public void onRenderTickStart(Minecraft minecraft, float renderTick)
	{	
		if (minecraft.player == null || minecraft.world == null)
			return;
	
		AnimStateMachine.renderTick = renderTick;
		
		EntityPlayerSP player = minecraft.player;
		
		if(player.getHeldItemMainhand() != null && player.getHeldItemMainhand().getItem() instanceof ItemGun)
		{
			ModelGun model = (ModelGun) ((ItemGun) player.getHeldItemMainhand().getItem()).type.model;
			if(!RenderGun.lastModel.equalsIgnoreCase(model.getClass().getName()))
			{
				RenderGun.resetRenderMods();
				RenderGun.lastModel = model.getClass().getName(); 
			}
			
			AnimStateMachine anim = ClientRenderHooks.getAnimations(player);
			
			float adsSpeed = (0.15f + model.adsSpeed) * renderTick;
			float value = Minecraft.getMinecraft().inGameHasFocus && Mouse.isButtonDown(1) && !anim.reloading && !anim.charging && !(anim.timeUntilCharge > 0) && anim.chargeTriggerTrigger == 3 ? RenderGun.adsSwitch + adsSpeed : RenderGun.adsSwitch - adsSpeed;
			RenderGun.adsSwitch = Math.max(0, Math.min(1, value));;
			
			float sprintSpeed = 0.15f * renderTick;
			float sprintValue = player.isSprinting() ? RenderGun.sprintSwitch + sprintSpeed : RenderGun.sprintSwitch - sprintSpeed;
			RenderGun.sprintSwitch = Math.max(0, Math.min(1, sprintValue));;
			
			float crouchSpeed = 0.15f * renderTick;
			float crouchValue = player.isSneaking() ? RenderGun.crouchSwitch + crouchSpeed : RenderGun.crouchSwitch - crouchSpeed;
			RenderGun.crouchSwitch = Math.max(0, Math.min(1, crouchValue));;
			
			float reloadSpeed = 0.15f * renderTick;
			float reloadValue = ClientRenderHooks.getAnimations(player).reloading ? RenderGun.reloadSwitch - reloadSpeed : RenderGun.reloadSwitch + reloadSpeed;
			RenderGun.reloadSwitch = Math.max(0, Math.min(1, reloadValue));;
			
			float triggerPullSpeed = 0.03f * renderTick;
			float triggerPullValue = Minecraft.getMinecraft().inGameHasFocus && Mouse.isButtonDown(0) ? RenderGun.triggerPullSwitch + triggerPullSpeed : RenderGun.triggerPullSwitch - triggerPullSpeed;
			RenderGun.triggerPullSwitch = Math.max(0, Math.min(model.triggerDistance, triggerPullValue));
			
			float modeSwitchSpeed = 0.03f * renderTick;
			float modeSwitchValue = Minecraft.getMinecraft().inGameHasFocus && Mouse.isButtonDown(0) ? RenderGun.triggerPullSwitch + triggerPullSpeed : RenderGun.triggerPullSwitch - triggerPullSpeed;
			RenderGun.triggerPullSwitch = Math.max(0, Math.min(model.triggerDistance, triggerPullValue));
			
			float maxHorizontal = 3.0f;
			float maxVertical = 1.5f;
			float swaySpeed = 0.003f * renderTick;
			if(RenderGun.swayHorizontalEP == null) RenderGun.swayHorizontalEP = NumberHelper.generateInRange(maxHorizontal);
			if(RenderGun.swayVerticalEP == null) RenderGun.swayVerticalEP = NumberHelper.generateInRange(maxVertical);
			RenderGun.swayHorizontal = NumberHelper.addTowards(RenderGun.swayHorizontalEP, RenderGun.swayHorizontal, swaySpeed);
			RenderGun.swayVertical = NumberHelper.addTowards(RenderGun.swayVerticalEP, RenderGun.swayVertical, swaySpeed/2);
			RenderGun.swayHorizontalEP = NumberHelper.isTargetMet(RenderGun.swayHorizontalEP, RenderGun.swayHorizontal) ? NumberHelper.generateInRange(maxHorizontal) : RenderGun.swayHorizontalEP;
			RenderGun.swayVerticalEP = NumberHelper.isTargetMet(RenderGun.swayVerticalEP, RenderGun.swayVertical) ? NumberHelper.generateInRange(maxVertical) : RenderGun.swayVerticalEP;
			
			if(anim.chargeTriggerTrigger == 0 && anim.timeUntilCharge <= anim.chargeDelayAfterReload-65)
				anim.chargeTriggerTrigger = 1;
			
			if(anim.chargeTriggerTrigger == 1) {
				anim.chargeTrigger = NumberHelper.clamp(anim.chargeTrigger + 0.15f * renderTick, 0, 1);
			}
			
			if(anim.charging && anim.charged >= 0.66)
			{
				anim.chargeTriggerTrigger = 2;
			}
			if(anim.chargeTriggerTrigger == 2)
			{
				
				anim.chargeTrigger -= 0.15f * renderTick;
				if(anim.chargeTrigger <= 0)
				{
					anim.chargeTriggerTrigger = 3;
					anim.chargeTrigger = 0;
					anim.timeUntilCharge = 0;
				}
			}
			if(anim.chargeTriggerTrigger == 3 && anim.timeUntilCharge != 0) {
				anim.chargeTriggerTrigger = 0;
			}	
		} else
		{
			RenderGun.resetRenderMods();
		}
	}
	
	public void onClientTickStart(Minecraft minecraft)
	{
		if (minecraft.player == null || minecraft.world == null)
			return;
		
		EntityPlayerSP player = minecraft.player;
		
		if(ModularWarfare.DEV_ENV)
		{
			if(tickCount == maxTickCount)
			{
				if(player.getHeldItemMainhand() != null && player.getHeldItemMainhand().getItem() instanceof ItemGun)
				{
					GunType gunType = (GunType) ((ItemGun) player.getHeldItemMainhand().getItem()).type;
					gunType.reloadModel();
				}
			}
			
			if(tickCount >= maxTickCount)
				tickCount = 0;
			else
				tickCount++;
		}
		
		ItemGun.fireButtonHeld = Mouse.isButtonDown(0);
	}
	
	public void onClientTickEnd(Minecraft minecraft)
	{
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
		
		// Gun Animation State Machine
		for(AnimStateMachine gunAnimation : ClientRenderHooks.gunAnimations.values())
		{
			gunAnimation.onUpdate();
		}		
	}

}
