package com.modularwarfare.common;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.common.type.BaseType;
import com.modularwarfare.utility.MWSound;
import com.modularwarfare.utility.event.ForgeEvent;

public class CommonProxy extends ForgeEvent {

	protected static Pattern zipJar = Pattern.compile("(.+).(zip|jar)$");
	
	public void load() {}
	
	public void forceReload() {}
	
	public List<File> getContentList(Method method, ClassLoader classloader) {
		List<File> contentPacks = new ArrayList<File>();
		for (File file : ModularWarfare.MOD_DIR.listFiles())
		{
			//Load folders and valid zip files
			if (file.isDirectory() || zipJar.matcher(file.getName()).matches())
			{
				contentPacks.add(file);
			}
		}
		ModularWarfare.LOGGER.info("Loaded content pack list server side.");
		return contentPacks;
	}
	
	public <T> T loadModel(String s, String shortName, Class<T> typeClass) {return null;}
	
	public void reloadModels(boolean reloadSkins) {}
	
	public void generateJsonModels(ArrayList<BaseType> types) {}
	
	public void playSound(MWSound sound) {}
	
	public void registerSound(String soundName) {}

}