package com.modularwarfare.client;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.common.CommonProxy;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLModContainer;
import cpw.mods.fml.common.MetadataCollection;
import cpw.mods.fml.common.discovery.ContainerType;
import cpw.mods.fml.common.discovery.ModCandidate;

public class ClientProxy extends CommonProxy {

	public List<File> contentPacks;
	
	@Override
	public List<File> getContentList(Method method, ClassLoader classloader) {
		contentPacks = new ArrayList<File>();
		for (File file : ModularWarfare.MOD_DIR.listFiles())
		{
			if (file.isDirectory() || zipJar.matcher(file.getName()).matches())
			{
				try
				{
					method.invoke(classloader, file.toURI().toURL());					
					HashMap<String, Object> map = new HashMap<String, Object>();
					map.put("modid", ModularWarfare.MOD_ID);
					map.put("name", ModularWarfare.MOD_NAME + " : " + file.getName());
					map.put("version", "1");
					FMLModContainer container = new FMLModContainer("com.modularwarfare.ModularWarfare", new ModCandidate(file, file, file.isDirectory() ? ContainerType.DIR : ContainerType.JAR), map);
					container.bindMetadata(MetadataCollection.from(null, ""));
					FMLClientHandler.instance().addModAsResource(container);	
				} catch (Exception e)
				{
					ModularWarfare.LOGGER.error("Failed to load assets for content pack : " + file.getName());
					e.printStackTrace();
				}
				ModularWarfare.LOGGER.info("Loaded content pack : " + file.getName());
				contentPacks.add(file);
			}
		}
		ModularWarfare.LOGGER.info(String.format("Loaded textures and models for %s content pack(s).", contentPacks.size()));
		return contentPacks;
	}
	
}
