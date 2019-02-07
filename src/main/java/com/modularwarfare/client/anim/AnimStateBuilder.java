package com.modularwarfare.client.anim;

import java.util.ArrayList;

public class AnimStateBuilder {
	
	private ArrayList<AnimState> states = new ArrayList<AnimState>();
	private float animationTime = 0f;
	
	public AnimStateBuilder addState(StateType stateType, AnimationType animType)
	{
		states.add(new AnimState(stateType, animType));
		return this;
	}
	
	public AnimStateBuilder addState(StateType stateType, float stateTime, AnimationType animType)
	{
		states.add(new AnimState(stateType, animType, stateTime));
		return this;
	}
	
	public AnimStateMachine build(AnimationType type)
	{
		ArrayList<AnimState> filteredStates = new ArrayList<AnimState>();
		for(AnimState state : states)
		{
			animationTime += state.timeForState;
			switch(type)
			{
			case All:
				filteredStates.add(state);
				break;
				
			default:
				if(state.animType == type || state.animType == AnimationType.All)
					filteredStates.add(state);
				break;		
			}
		}
		return new AnimStateMachine(animationTime, states);
	}

}
