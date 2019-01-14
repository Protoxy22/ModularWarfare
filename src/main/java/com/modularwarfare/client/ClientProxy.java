package com.modularwarfare.client;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.export.ItemModelExport;
import com.modularwarfare.client.handler.ClientTickHandler;
import com.modularwarfare.client.handler.KeyInputHandler;
import com.modularwarfare.client.handler.MouseInputHandler;
import com.modularwarfare.client.model.RenderGun;
import com.modularwarfare.common.CommonProxy;
import com.modularwarfare.common.guns.ItemAmmo;
import com.modularwarfare.common.guns.ItemGun;
import com.modularwarfare.common.type.BaseType;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.FMLModContainer;
import net.minecraftforge.fml.common.MetadataCollection;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.discovery.ContainerType;
import net.minecraftforge.fml.common.discovery.ModCandidate;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT)
public class ClientProxy extends CommonProxy {

	public List<File> contentPacks;
	public static String modelDir = "com.modularwarfare.client.model.";
	public static RenderGun gunRenderer;
	
	@Override
	public void load() 
	{
		new ClientTickHandler();
		new KeyInputHandler();
		new MouseInputHandler();
		new ClientRenderHooks();
	}
	
	@SubscribeEvent
	public static void onModelRegistry(ModelRegistryEvent event) 
	{
		for(ItemGun itemGun : ModularWarfare.gunTypes.values())
		{
			//MinecraftForgeClient.registerItemRenderer(itemGun, gunRenderer);
			ModelLoader.setCustomModelResourceLocation(itemGun, 0, new ModelResourceLocation(ModularWarfare.MOD_ID + ":" + itemGun.type.internalName));
		}
		
		for(ItemAmmo itemAmmo : ModularWarfare.ammoTypes.values())
		{
			//MinecraftForgeClient.registerItemRenderer(itemAmmo, ammoRenderer);
			ModelLoader.setCustomModelResourceLocation(itemAmmo, 0, new ModelResourceLocation(ModularWarfare.MOD_ID + ":" + itemAmmo.type.internalName));
		}
	}
	
	@Override
	public void forceReload()
	{
		// OLD: Minecraft.getMinecraft().refreshResources();
		FMLClientHandler.instance().refreshResources();
	}
	
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
	
	/** Helper method that sorts out packages with model name input
	 * For example, the model class "com.flansmod.client.model.mw.ModelMP5"
	 * is referenced in the type file by the string "mw.MP5" */
	private String getModelName(String in)
	{
		//Split about dots
		String[] split = in.split("\\.");
		//If there is no dot, our model class is in the default model package
		if(split.length == 1)
			return in;
		//Otherwise, we need to slightly rearrange the wording of the string for it to make sense
		else if(split.length > 1)
		{
			String out = split[split.length - 1];
			for(int i = split.length - 2; i >= 0; i--)
			{
				out = split[i] + "." + out;
			}
			return out;
		}
		return in;
	}
	
	/** Generic model loader method for getting model classes and casting them to the required class type */
	@Override
	public <T> T loadModel(String s, String shortName, Class<T> typeClass)
	{
		if(s == null || shortName == null)
			return null;
		try 
		{	
			return typeClass.cast(Class.forName(modelDir + getModelName(s)).getConstructor().newInstance());
		}
		catch(Exception e)
		{
			ModularWarfare.LOGGER.error("Failed to load model : " + shortName + " (" + s + ")");
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void reloadModels(boolean reloadSkins)
	{
		for(BaseType baseType : ModularWarfare.baseTypes)
		{
			baseType.reloadModel();
		}
		if(reloadSkins)
			forceReload();
	}
	
	@Override
	public void generateJsonModels(ArrayList<BaseType> types)
	{
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		for(BaseType type : types)
		{
			if(type.contentPack == null)
				continue;
			
			File contentPackDir = new File(ModularWarfare.MOD_DIR, type.contentPack);
			if(contentPackDir.exists() && contentPackDir.isDirectory())
			{
				File itemModelsDir = new File(contentPackDir, "/assets/modularwarfare/models/item");
				if(!itemModelsDir.exists())
					itemModelsDir.mkdirs();
				
				File typeModel = new File(itemModelsDir, type.internalName + ".json");
				
				if(!typeModel.exists())
				{
					try {
						FileWriter fileWriter = new FileWriter(typeModel);
						gson.toJson(createJson(type), fileWriter);
						fileWriter.flush();
						fileWriter.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}	
			}
		}
	}
	
	private ItemModelExport createJson(BaseType type)
	{
		ItemModelExport exportedModel = new ItemModelExport();
		exportedModel.setBaseLayer(type.iconName != null ? type.iconName : type.internalName);
		return exportedModel;
	}
	
}