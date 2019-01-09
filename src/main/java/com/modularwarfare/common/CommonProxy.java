package com.modularwarfare.common;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.modularwarfare.ModularWarfare;

public class CommonProxy {

	protected static Pattern zipJar = Pattern.compile("(.+).(zip|jar)$");
	
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

}
