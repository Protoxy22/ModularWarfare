package com.modularwarfare.client.anim;

public enum StateType {
	
	Tilt(0f, 0f, 0f),
	Unload(0f, 0f, 0f),
	Load(0f, 0f, 0f),
	Untilt(0f, 0f, 0f),
	Charge(-1F, 1f, 2F);
	
	public float startingValue;
	public float endingValue;
	public float incremeter;
	
	StateType(float startingValue, float endingValue, float incremeter)
	{
		this.startingValue = startingValue;
		this.endingValue = endingValue;
		this.incremeter = incremeter;
	}

}
