package com.modularwarfare.common.type;

import java.util.Map;

public class BaseType {
	
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
		return false;
	}
	
	/**
	 * Returns internal name if not overridden by sub-type
	 */
	@Override
	public String toString()
	{
		return internalName;
	}

}
