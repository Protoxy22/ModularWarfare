package com.modularwarfare.client.anim;

import java.util.ArrayList;
import java.util.Optional;

import com.modularwarfare.client.anim.StateEntry.MathType;
import com.modularwarfare.client.model.ModelGun;

public class AnimStateMachine {

	public boolean reloading = true;
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
			if(stateEntries == null)
				stateEntries = getDefaultEntries();
				
			if(currentState == null)
				currentState = stateEntries.get(0);
			
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
					}
				} else
				{
					while(tickAgain)
					{	
						if(stateIndex+1 < stateEntries.size())
						{
							stateIndex++;
							currentState = stateEntries.get(stateIndex);
							
							if(currentState.stateTime != 0)
								tickAgain = false;
						} else
						{
							reloading = false;
							stateEntries = null;
							currentState = null;
							stateIndex = 0;
						}
					}
				}
			}
		}
	}
	
	public ArrayList<StateEntry> getDefaultEntries()
	{
		ArrayList<StateEntry> states = new ArrayList<StateEntry>();
		states.add(new StateEntry(StateType.Tilt, 0.20f, 0f, MathType.Add));
		states.add(new StateEntry(StateType.Unload, 0.20f, 0f, MathType.Add));
		states.add(new StateEntry(StateType.Load, 0.20f, 1f, MathType.Sub));
		states.add(new StateEntry(StateType.Untilt, 0.20f, 1f, MathType.Sub));
		states.add(new StateEntry(StateType.Charge, 0.20f, -1f, MathType.Add, -1f, 2f));
		return states;
	}
	
	public void triggerReload(int reloadTime, ModelGun model, ReloadType reloadType)
	{
		reloading = true;
				
		this.reloadTime = reloadType != ReloadType.Full ? reloadTime*0.65f : reloadTime;
		this.reloadType = reloadType;
	}
	
	public Optional<StateEntry> getState(StateType stateType)
	{
		StateEntry stateEntry = null;
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
	
}
