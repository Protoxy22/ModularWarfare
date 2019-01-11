package com.modularwarfare.client.input;

public enum KeyType {
	
	GunReload("Reload Gun", 0x13),
	ClientReload("Reload Client", 0x43),
	DebugMode("Debug Mode", 0x44);
	
	//Keyboard
	public String displayName;
	public int keyCode;
	
	KeyType(String displayName, int keyCode)
	{
		this.displayName = displayName;
		this.keyCode = keyCode;
	}
	
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}

}
