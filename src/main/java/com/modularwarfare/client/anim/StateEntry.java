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
	
	public static float smoothing = 1f;
	
	public StateEntry(StateType stateType, float stateTime, float startingValue, MathType mathType)
	{
		this.stateTime = stateTime;
		this.currentValue = lastValue = startingValue;
		this.mathType = mathType;
		this.stateType = stateType;
		this.minValue = 0;
		this.incrementValue = 1f;
	}
	
	public boolean onTick(float reloadTime)
	{
		lastValue = currentValue;
		if(mathType == MathType.Add)
			currentValue += incrementValue * smoothing / (reloadTime*stateTime);
		else if(mathType == MathType.Sub)
			currentValue -= incrementValue * smoothing / (reloadTime*stateTime);
		currentValue = NumberHelper.clamp(currentValue, minValue, 1f);
		if((mathType == MathType.Add && currentValue == 1.0) || (mathType == MathType.Sub && currentValue == 0))
			return true;
		return false;
	}
	
	public static enum MathType
	{
		Add,
		Sub;	
	}

}
