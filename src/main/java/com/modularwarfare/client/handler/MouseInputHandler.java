package com.modularwarfare.client.handler;

import org.lwjgl.input.Mouse;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.RenderGun;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.utility.event.ForgeEvent;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.MouseInputEvent;

public class MouseInputHandler extends ForgeEvent {
	
	@SubscribeEvent
	public void onKeyInput(MouseInputEvent event)
	{
		
	}

}
