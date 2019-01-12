package com.modularwarfare.client.input;

public enum KeyType {

	GunReload("Reload Gun", 0x13), // R
	ClientReload("Reload Client", 0x43), // F9
	DebugMode("Debug Mode", 0x44); // F10
	
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
