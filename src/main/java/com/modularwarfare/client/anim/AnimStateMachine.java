package com.modularwarfare.client.anim;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

import com.modularwarfare.api.WeaponAnimation;
import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.anim.StateEntry.MathType;
import com.modularwarfare.client.model.ModelGun;

import net.minecraft.item.ItemStack;

public class AnimStateMachine {

	public boolean tiltHold = false;
	public boolean reloading = false;
	public float reloadProgress = 0f;
	private int stateIndex = 0;
	
	private ArrayList<StateEntry> stateEntries;
	private StateEntry currentState;
	private float reloadTime;
	private ReloadType reloadType;
	/** Recoil */
	public float gunRecoil = 0F, lastGunRecoil = 0F;
	/** Slide */
	public float gunSlide = 0F, lastGunSlide = 0F;
	public float hammerRotation = 0F;
	public int timeUntilPullback = 0;
	public float gunPullback = -1F, lastGunPullback = -1F;
	//THESE ARE ALL AUTOGENED TO TEMP FIX ERRORS

	public boolean isGunEmpty = false;
	public boolean unloadOnly = false;
	public ItemStack cachedAmmoStack;
	public boolean renderAmmo = true;
	public int reloadAmmoCount = 1;
	public boolean isFired = false;
	
	public void onTickUpdate()
	{	
		if(reloading)
		{	
			if(stateEntries != null)
			{
				if(currentState == null)
					currentState = stateEntries.get(0);
												
				if(currentState.stateType == StateType.Tilt)
					tiltHold = true;
				if(currentState.stateType == StateType.Untilt)
					tiltHold = false;
				
				if(reloadProgress >= currentState.cutOffTime)
				{
					if(stateIndex+1 < stateEntries.size())
					{
						stateIndex++;
						currentState = stateEntries.get(stateIndex);
					} else
					{
						stateEntries = null;
						currentState = null;
						stateIndex = 0;
						tiltHold = false;
					}
				}
			}
			
			reloadProgress += 1F / reloadTime;
			if(reloadProgress >= 0.9F)
				isGunEmpty = false;
			if(reloadProgress >= 1F) {
				reloading = false;
				reloadProgress = 0f;
				stateEntries = null;
				currentState = null;
				stateIndex = 0;
				tiltHold = false;
			}
		}
		
		// Slide model
		lastGunSlide = gunSlide;
		if (isGunEmpty)
			lastGunSlide = gunSlide = 0.5F;
		if (!isGunEmpty && gunSlide > 0.9) // Add one extra frame to slide
			gunSlide -= 0.1F;
		else if (gunSlide > 0 && !isGunEmpty)
			gunSlide *= 0.5F;		
		
		
		// Recoil
		lastGunRecoil = gunRecoil;
		if (gunRecoil > 0)
			gunRecoil *= 0.5F;
		
		// Time until hammer pullback
		if (isFired) {
			gunPullback += 2F / 4;
		if (gunPullback >= 0.999F)
			isFired = false;
		}
		
		if (timeUntilPullback > 0) {
			timeUntilPullback--;
			if (timeUntilPullback == 0) {
				// Reset the hammer
				isFired = true;
				lastGunPullback = gunPullback = -1F;
			}
		} else {
			hammerRotation *= 0.6F;
		}
	}
	
	public void onRenderTickUpdate()
	{
		if(reloading && currentState != null)
		{
			currentState.onTick(reloadTime);
		}
	}
	
	public ArrayList<StateEntry> getDefaultEntries(int reloadCount)
	{
		ArrayList<StateEntry> states = new ArrayList<StateEntry>();		
		states.add(new StateEntry(StateType.Tilt, 0.15f, 0.15f, 0f, MathType.Add));
		states.add(new StateEntry(StateType.Unload, 0.35f, 0.50f, 0f, MathType.Add));
		states.add(new StateEntry(StateType.Load, 0.35f, 0.85f, 1f, MathType.Sub, reloadCount));
		states.add(new StateEntry(StateType.Untilt, 0.15f, 1f, 1f, MathType.Sub));
		return states;
	}
	
	public void triggerShoot(ModelGun model)
	{
		Random r = new Random();
		
		lastGunRecoil = gunRecoil = 1F;
		//System.out.println("called2");
		lastGunSlide = gunSlide = 1F;
		hammerRotation = model.hammerAngle;
		timeUntilPullback = model.hammerDelay;
		/*timeUntilPump = model.pumpDelay;
		timeToPumpFor = model.pumpTime;
		timeUntilCasing = model.casingDelay;
		muzzleFlashTime = 2;

		int Low = -1;
		int High = 3;
		int result = r.nextInt(High-Low) + Low;
		if(result == -1) result = 0;
		if(result == 3) result = 2;
        flashInt = result;
        
        casingRandom.x = ((r.nextFloat()*2)-1);
        casingRandom.y = ((r.nextFloat()*2)-1);
        casingRandom.z = ((r.nextFloat()*2)-1);
		casingStage = 0;
		
		if(model.pumpDelay == 0)
		{
			RenderGun.shotState = 1;
		}*/
	}
	
	public void triggerReload(int reloadTime, int reloadCount, ModelGun model, ReloadType reloadType)
	{
		ArrayList<StateEntry> animEntries = WeaponAnimations.getAnimation(model.reloadAnimation).getAnimStates();
		stateEntries = animEntries != null ? animEntries : getDefaultEntries(reloadCount);
				
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
