package com.modularwarfare.common.type;

import java.util.Map;

import com.modularwarfare.client.model.objects.TurboBase;
import com.modularwarfare.client.model.objects.TurboBipedBase;
import com.modularwarfare.common.guns.SkinType;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BaseType {
	
	/** The model file for this gun */
	public String modelName;
	public TurboBase model;
	public TurboBipedBase bipedModel;
	/** Max stack size */
	public Integer maxStackSize;
	/** Weapon model skins/textures */
	public SkinType[] modelSkins;
	public String internalName;
	/** Used to generate .lang files automatically */
	public String displayName;
	public String iconName;
	public transient int id;
	public transient String contentPack;
	public Map<String, Object> customVariables;
	
	/**
	 * Method for sub types to use for loading extra values
	 */
	public void loadExtraValues()
	{
		
	}
	
	public void loadBaseValues()
	{
		if(FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT)
			reloadModel();
		
		if(modelSkins == null)
			modelSkins = new SkinType[]{SkinType.getDefaultSkin(this)};
		
		if(iconName == null)
			iconName = internalName;
	}
	
	/**
	 * Method for sub types to use for handling model reloading
	 */
	public void reloadModel()
	{
		
	}
	
	/**
	 * Method for sub types to use for having models
	 */
	public boolean hasModel()
	{
		return model != null;
	}
	
	/**
	 * Returns internal name if not overridden by sub-type
	 */
	@Override
	public String toString()
	{
		return internalName;
	}
	
	@SideOnly(value=Side.CLIENT)
	public static BaseType fromModel(TurboBase model)
	{
		return null;
	}
	
	public String getAssetDir()
	{
		//System.out.println("called");
		return "";
	}

}
