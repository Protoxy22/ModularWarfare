package com.modularwarfare.client;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class TickHandlerClient {
	
	private static AnimStateMachine gunAnimations;
	
	// Recoil variables
	/** The recoil applied to the player view by shooting */
	public static float playerRecoilPitch;
	public static float playerRecoilYaw;
	/** The amount of compensation applied to recoil in order to bring it back to normal */
	public static float antiRecoilPitch;
	public static float antiRecoilYaw;
	
	public TickHandlerClient()
	{
		FMLCommonHandler.instance().bus().register(this);
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public void clientTick(TickEvent.ClientTickEvent event)
	{
		switch(event.phase)
		{
		case START :
			onClientTickStart(Minecraft.getMinecraft());
			break;
		case END :
			onClientTickEnd(Minecraft.getMinecraft());
			break;
		}
	}
	
	public void onClientTickStart(Minecraft minecraft)
	{
		
	}
	
	public void onClientTickEnd(Minecraft minecraft)
	{
		if (minecraft.thePlayer == null || minecraft.theWorld == null)
			return;
		
		if (playerRecoilPitch > 0)
			playerRecoilPitch *= 0.8F;
		
		minecraft.thePlayer.rotationPitch -= playerRecoilPitch;
		minecraft.thePlayer.rotationYaw -= playerRecoilYaw;
		antiRecoilPitch += playerRecoilPitch;
		antiRecoilYaw += playerRecoilYaw;

		minecraft.thePlayer.rotationPitch += antiRecoilPitch * 0.2F;
		minecraft.thePlayer.rotationYaw += antiRecoilYaw * 0.2F;
		antiRecoilPitch *= 0.8F;
		antiRecoilYaw *= 0.8F;
		
		// Gun Animation State Machine
		if(gunAnimations == null)
			gunAnimations = AnimStateMachine.defaultStateMachine;
		
		gunAnimations.onUpdate();
	}

}
