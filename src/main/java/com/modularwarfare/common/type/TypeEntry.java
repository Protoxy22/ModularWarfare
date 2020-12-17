package com.modularwarfare.common.type;

public class TypeEntry {
	
	public String name;
	public Class<? extends BaseType> typeClass;
	public int id;
	
	public TypeEntry(String name, Class<? extends BaseType> typeClass, int id)
	{
		this.name = name;
		this.typeClass = typeClass;
		this.id = id;
	}
	
	@Override
	public String toString()
	{
		return name;
	}

}
