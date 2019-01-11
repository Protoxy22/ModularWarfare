package com.modularwarfare.utility.event;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;

public class ForgeEvent {
	
	/**
	 * Event registration helper class
	 * @param subType
	 */
	public ForgeEvent(SubscribeType subType)
	{
		switch(subType)
		{
		case Both:
			MinecraftForge.EVENT_BUS.register(this);
			FMLCommonHandler.instance().bus().register(this);
			break;
			
		case FML:
			FMLCommonHandler.instance().bus().register(this);
			break;
			
		case Forge:
			MinecraftForge.EVENT_BUS.register(this);
			break;	
		}
	}

}
