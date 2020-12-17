package com.modularwarfare.client.tmt;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.modularwarfare.ModularWarfare;
import net.minecraftforge.fml.common.Loader;

public class ModelPool {
	public static ModelPoolEntry addFile(String file, String objGroup, Class modelClass, Map<String, TransformGroup> group, Map<String, TextureGroup> textureGroup) {
		ModelPoolEntry entry = null;

		try {
			entry = (ModelPoolEntry) modelClass.newInstance();
		} catch (Exception e) {
			ModularWarfare.LOGGER.info("A new " + entry.getClass().getName() + " could not be initialized.");
			ModularWarfare.LOGGER.info(e.getMessage());
			return null;
		}
		File modelFile = null;
		for (int i = 0; i < resourceDir.length && (modelFile == null || !modelFile.exists()); i++) {
			String absPath = new File(Loader.instance().getConfigDir().getParent(), resourceDir[i]).getAbsolutePath();
			if (!absPath.endsWith("/") || !absPath.endsWith("\\"))
				absPath += "/";
			modelFile = entry.checkValidPath(absPath + file);
		}
		if (modelFile == null || !modelFile.exists()) {
			ModularWarfare.LOGGER.info("The model with the name " + file + " does not exist.");
			return null;
		}
		entry.groups = new HashMap<>();
		entry.textures = new HashMap<>();
		entry.name = file;
		entry.setGroup("0");
		entry.setTextureGroup("0");
		entry.getModel(modelFile, objGroup);
		entry.applyGroups(group, textureGroup);
		return entry;
	}

	private static String[] resourceDir = new String[]{
			"/resources/models/",
			"/resources/mod/models/",
			"/ModularWarfare/"
	};
	public static final Class OBJ = ModelPoolObjEntry.class;
}
