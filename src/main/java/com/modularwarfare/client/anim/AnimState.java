package com.modularwarfare.client.anim;

public class AnimState {
	
	public StateType stateType;
	public AnimationType animType;
	public float timeForState;
	
	public float lastValue = 0f;
	public float currentValue;
	public float maxValue;
	
	public AnimState(StateType stateType, AnimationType animType)
	{
		this.stateType = stateType;
		this.animType = animType;
	}
	
	public AnimState(StateType stateType, AnimationType animType, float timeForState)
	{
		this.stateType = stateType;
		this.animType = animType;
		this.timeForState = timeForState;
	}
	
	/**
	 * Runs calculations on state and returns true when finished.
	 * @return Whether this state is finished
	 */
	public boolean tickState(float reloadProgress, float reloadTime)
	{
		lastValue = currentValue;
		currentValue += 1F / reloadTime;
		System.out.println(String.format("Current Time: %s Reload Time: %s", reloadProgress, reloadTime));
		if (currentValue >= timeForState) {
			currentValue = 1f;
			lastValue = 1f;
			return true;
		}
		return false;
	}

}
