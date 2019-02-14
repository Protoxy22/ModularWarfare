package com.modularwarfare.client.anim;

import com.modularwarfare.client.model.RenderGun;
import com.modularwarfare.utility.NumberHelper;

public class StateEntry {
	
	public float stateTime = 0;
	public float currentValue = 0f;
	public float lastValue = 0f;
	
	public StateType stateType;
	private MathType mathType;
	private float minValue;
	private float incrementValue;
	public float cutOffTime;
	
	public static float smoothing = 1f;
	
	public StateEntry(StateType stateType, float stateTime, float cutOffTime, float startingValue, MathType mathType)
	{
		this.stateTime = stateTime;
		this.cutOffTime = cutOffTime;
		this.currentValue = lastValue = startingValue;
		this.mathType = mathType;
		this.stateType = stateType;
		this.minValue = 0;
		this.incrementValue = 1f;
	}
	
	public void onTick(float reloadTime)
	{
		lastValue = currentValue;
		if(mathType == MathType.Add)
			currentValue += incrementValue * smoothing / (reloadTime*stateTime);
		else if(mathType == MathType.Sub)
			currentValue -= incrementValue * smoothing / (reloadTime*stateTime);
		currentValue = NumberHelper.clamp(currentValue, minValue, 1f);
	}
	
	public static enum MathType
	{
		Add,
		Sub;	
	}

}
