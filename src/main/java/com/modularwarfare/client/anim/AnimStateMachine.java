package com.modularwarfare.client.anim;

import java.util.ArrayList;
import java.util.Optional;

import com.modularwarfare.api.WeaponAnimation;
import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.anim.StateEntry.MathType;
import com.modularwarfare.client.model.ModelGun;

public class AnimStateMachine {

	public boolean tiltHold = false;
	public boolean reloading = false;
	public float reloadProgress = 0f;
	private int stateIndex = 0;
	
	private ArrayList<StateEntry> stateEntries;
	private StateEntry currentState;
	private float reloadTime;
	private ReloadType reloadType;
	
	public void onUpdate()
	{	
		if(reloading)
		{		
			if(currentState == null)
				currentState = stateEntries.get(0);
			
			if(currentState.stateType == StateType.Tilt)
				tiltHold = true;
			if(currentState.stateType == StateType.Untilt)
				tiltHold = false;
			
			if(currentState.onTick(reloadTime))
			{
				boolean tickAgain = false;
				if(currentState.stateTime == 0.0f)
					tickAgain = true;
				
				if(!tickAgain)
				{
					if(stateIndex+1 < stateEntries.size())
					{
						stateIndex++;
						currentState = stateEntries.get(stateIndex);
					} else
					{
						reloading = false;
						stateEntries = null;
						currentState = null;
						stateIndex = 0;
						tiltHold = false;
					}
				} else
				{
					while(tickAgain)
					{	
						if(stateIndex+1 < stateEntries.size())
						{
							stateIndex++;
							currentState = stateEntries.get(stateIndex);
							
							if(currentState.stateTime != 0) {
								tickAgain = false;
							}
						} else
						{
							reloading = false;
							stateEntries = null;
							currentState = null;
							stateIndex = 0;
							tiltHold = false;
						}
					}
				}
			}
		}
	}
	
	public ArrayList<StateEntry> getDefaultEntries()
	{
		ArrayList<StateEntry> states = new ArrayList<StateEntry>();
		states.add(new StateEntry(StateType.Tilt, 0.15f, 0f, MathType.Add));
		states.add(new StateEntry(StateType.Unload, 0.35f, 0f, MathType.Add));
		states.add(new StateEntry(StateType.Load, 0.35f, 1f, MathType.Sub));
		states.add(new StateEntry(StateType.Untilt, 0.15f, 1f, MathType.Sub));
		return states;
	}
	
	public void triggerReload(int reloadTime, int reloadCount, ModelGun model, ReloadType reloadType)
	{
		ArrayList<StateEntry> animEntries = WeaponAnimations.getAnimation(model.reloadAnimation).getAnimStates();
		stateEntries = animEntries != null ? animEntries : getDefaultEntries();
				
		this.reloadTime = reloadType != ReloadType.Full ? reloadTime*0.65f : reloadTime;
		this.reloadType = reloadType;
		this.reloading = true;
	}
	
	public Optional<StateEntry> getState(StateType stateType)
	{
		StateEntry stateEntry = null;
		
		if(stateEntries == null)
			return Optional.ofNullable(stateEntry);
		
		for(StateEntry entry : stateEntries)
		{
			if(entry.stateType == stateType)
			{
				stateEntry = entry;
				break;
			}
		}
		return Optional.ofNullable(stateEntry);
	}
	
	public Optional<StateEntry> getCurrentState()
	{
		return Optional.ofNullable(currentState);
	}
	
	public boolean isState(StateType stateType)
	{
		return currentState != null ? currentState.stateType == stateType : false;
	}
	
}
