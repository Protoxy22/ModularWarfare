package com.modularwarfare.client.handler;

import com.modularwarfare.client.AnimStateMachine;
import com.modularwarfare.utility.event.ForgeEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ClientTickHandler extends ForgeEvent {
	
	private static AnimStateMachine gunAnimations;
	
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
		if (minecraft.player == null || minecraft.world == null)
			return;
		
		if (playerRecoilPitch > 0)
			playerRecoilPitch *= 0.8F;
		
		minecraft.player.rotationPitch -= playerRecoilPitch;
		minecraft.player.rotationYaw -= playerRecoilYaw;
		antiRecoilPitch += playerRecoilPitch;
		antiRecoilYaw += playerRecoilYaw;

		minecraft.player.rotationPitch += antiRecoilPitch * 0.2F;
		minecraft.player.rotationYaw += antiRecoilYaw * 0.2F;
		antiRecoilPitch *= 0.8F;
		antiRecoilYaw *= 0.8F;
		
		// Gun Animation State Machine
		if(gunAnimations == null)
			gunAnimations = AnimStateMachine.defaultStateMachine;
		
		gunAnimations.onUpdate();
	}

}
