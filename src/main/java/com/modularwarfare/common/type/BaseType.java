package com.modularwarfare.common.type;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelGun;

public class BaseType {
	
	public String internalName;
	public String iconName;
	public transient int id;
	
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
	 * Returns internal name if not overridden by sub-type
	 */
	@Override
	public String toString()
	{
		return internalName;
	}

}
