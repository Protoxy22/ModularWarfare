package com.modularwarfare.utility.event;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class ForgeEvent {
	
	/**
	 * Event registration helper class
	 * @param subType
	 */
	public ForgeEvent()
	{
		MinecraftForge.EVENT_BUS.register(this);
	}

}
