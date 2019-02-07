package com.modularwarfare.client.anim;

import java.util.ArrayList;

public class AnimStateMachine {
	
	public ArrayList<AnimState> states = new ArrayList<AnimState>();
	private float animationTime = 0f;
	
	public AnimState currentState = null;
	private int stateIndex = 0;
	
	public AnimStateMachine(float animationTime, ArrayList<AnimState> states)
	{
		this.animationTime = animationTime;
		this.states = states;
	}
	
	public boolean tick(float currentTime, float reloadTime)
	{
		if(currentState == null)
		{
			currentState = states.get(stateIndex);
		}
		//System.out.println(currentState.stateType.name());
		if(currentState.tickState(currentTime, reloadTime))
		{
			if(stateIndex+1 < states.size()) {
				stateIndex++;
				currentState = states.get(stateIndex);
			} 
			else {
				currentState = null;
				return true;
			}
		}
		return false;
	}

}
