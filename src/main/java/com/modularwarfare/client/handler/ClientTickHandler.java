package com.modularwarfare.client.handler;

import java.util.Random;

import org.lwjgl.input.Mouse;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.AnimStateMachine;
import com.modularwarfare.client.ClientRenderHooks;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.RenderGun;
import com.modularwarfare.common.guns.ItemGun;
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
	
	public ClientTickHandler()
	{
		super();
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
		
		EntityPlayerSP player = minecraft.player;
		
		if(player.getHeldItemMainhand() != null && player.getHeldItemMainhand().getItem() instanceof ItemGun)
		{
			ModelGun model = (ModelGun) ((ItemGun) player.getHeldItemMainhand().getItem()).type.model;
			float adsSpeed = (0.15f + model.adsSpeed) * renderTick;
			float value = Mouse.isButtonDown(1) ? RenderGun.adsSwitch + adsSpeed : RenderGun.adsSwitch - adsSpeed;
			RenderGun.adsSwitch = Math.max(0, Math.min(1, value));;
			
			float sprintSpeed = (0.15f) * renderTick;
			float sprintValue = player.isSprinting() ? RenderGun.sprintSwitch + sprintSpeed : RenderGun.sprintSwitch - sprintSpeed;
			RenderGun.sprintSwitch = Math.max(0, Math.min(1, sprintValue));;
			
			float crouchSpeed = (0.15f) * renderTick;
			float crouchValue = player.isSneaking() ? RenderGun.crouchSwitch + crouchSpeed : RenderGun.crouchSwitch - crouchSpeed;
			RenderGun.crouchSwitch = Math.max(0, Math.min(1, crouchValue));;
			
			float reloadSpeed = (0.15f) * renderTick;
			float reloadValue = ClientRenderHooks.getAnimations(player).reloading ? RenderGun.reloadSwitch - reloadSpeed : RenderGun.reloadSwitch + reloadSpeed;
			RenderGun.reloadSwitch = Math.max(0, Math.min(1, reloadValue));;
		} else
		{
			RenderGun.swayHorizontal = 0f;
			RenderGun.swayVertical = 0f;
			RenderGun.reloadSwitch = 0f;
			RenderGun.sprintSwitch = 0f;
			RenderGun.adsSwitch = 0f;
			RenderGun.crouchSwitch = 0f;
		}
	}
	
	public void onClientTickStart(Minecraft minecraft)
	{
		if (minecraft.player == null || minecraft.world == null)
			return;
		
		EntityPlayerSP player = minecraft.player;
		
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
