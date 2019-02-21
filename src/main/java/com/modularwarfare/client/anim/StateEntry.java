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
	private float startingValue;
	private float operationCount;
	public float cutOffTime;
	public boolean finished = false;
	
	public static float smoothing = 1f;
	
	public StateEntry(StateType stateType, float stateTime, float startingValue, MathType mathType)
	{
		this(stateType, stateTime, startingValue, mathType, 1);
	}
	
	public StateEntry(StateType stateType, float stateTime, float startingValue, MathType mathType, int operationCount)
	{
		this.stateTime = stateTime;
		this.startingValue = currentValue = lastValue = startingValue;
		this.mathType = mathType;
		this.stateType = stateType;
		this.minValue = 0;
		this.incrementValue = 1f;
		this.operationCount = operationCount;
	}
	
	public void onTick(float reloadTime)
	{
		lastValue = currentValue;
		if(mathType == MathType.Add)
			currentValue += (incrementValue * smoothing / (reloadTime*stateTime)) * operationCount;
		else if(mathType == MathType.Sub)
			currentValue -= (incrementValue * smoothing / (reloadTime*stateTime)) * operationCount;
		currentValue = NumberHelper.clamp(currentValue, minValue, 0.999f);
		if(currentValue != startingValue && (currentValue == 1f || currentValue == 0f) && operationCount > 1)
		{
			currentValue = startingValue;
			operationCount--;
		}		
	}
	
	public static enum MathType
	{
		Add,
		Sub;	
	}

}
