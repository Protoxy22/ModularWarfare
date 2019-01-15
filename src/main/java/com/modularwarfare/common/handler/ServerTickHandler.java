package com.modularwarfare.common.handler;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.utility.event.ForgeEvent;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ServerTickEvent;

public class ServerTickHandler extends ForgeEvent {
	
	public static ConcurrentHashMap<UUID, Integer> playerShootCooldown = new ConcurrentHashMap<UUID, Integer>();
	
	int i = 0;
	
	@SubscribeEvent
	public void onServerTick(ServerTickEvent event)
	{
		ModularWarfare.NETWORK.handleServerPackets();
		
		// Player shoot cooldown
		for(UUID uuid : playerShootCooldown.keySet())
		{
			i += 1;
			System.out.println("i " + i);
			int value = playerShootCooldown.get(uuid) - 1;
			if(value <= 0)
			{
				playerShootCooldown.remove(uuid);
			} else
			{
				playerShootCooldown.replace(uuid, value);
			}
		}
	}
	
}
