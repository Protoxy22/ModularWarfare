package com.modularwarfare.common.type;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelGun;

public class BaseType {
	
	public String internalName;
	public String iconName;
	public transient int id;
	
	@Override
	public String toString()
	{
		return internalName;
	}
	
	public void loadExtraValues()
	{
		System.out.println("base type class");
	}

}
