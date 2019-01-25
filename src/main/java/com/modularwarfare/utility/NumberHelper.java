package com.modularwarfare.utility;

public class NumberHelper {
		
	public static float clamp(float val, float min, float max) {
	    return Math.max(min, Math.min(max, val));
	}
	
	public static boolean isNegative(float val)
	{
		if(val < 0)
			return true;
		return false;
	}
	
	public static boolean isTargetMet(float target, float current)
	{
		if(isNegative(target))
		{
			return current <= target;
		} else
		{
			return current >= target;
		}
	}
	
	public static float addTowards(float target, float current, float value)
	{
		if(isNegative(target))
		{
			return current - value;
		} else
		{
			return current + value;
		}
	}
	
	public static float generateInRange(float val)
	{
		return (float) ((Math.random() * val) - val/2);
	}

}
