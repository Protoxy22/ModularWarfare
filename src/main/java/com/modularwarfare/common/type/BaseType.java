package com.modularwarfare.common.type;

public class BaseType {
	
	public String internalName;
	public transient int id;
	
	@Override
	public String toString()
	{
		return internalName;
	}

}
