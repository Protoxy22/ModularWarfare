package com.modularwarfare.client.anim;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.anim.StateEntry.MathType;
import com.modularwarfare.client.model.ModelGun;

import net.minecraft.item.ItemStack;

public class AnimStateMachine {

	/** Reload State Machine */
	public boolean reloading = false;
	private float reloadTime;
	private ReloadType reloadType;
	private float reloadProgress = 0f;
	private ArrayList<StateEntry> reloadStateEntries;
	private StateEntry currentReloadState;
	private int reloadStateIndex = 0;
	public boolean tiltHold = false;
	
	/** Shoot State Machine */
	public boolean shooting = false;
	private float shootTime;
	private float shootProgress = 0f;
	private ArrayList<StateEntry> shootStateEntries;
	private StateEntry currentShootState;
	private int shootStateIndex = 0;
	
	/** Recoil */
	public float gunRecoil = 0F, lastGunRecoil = 0F;
	
	/** Slide */
	public float gunSlide = 0F, lastGunSlide = 0F;
	
	/** Hammer */
	public float hammerRotation = 0F;
	public int timeUntilPullback = 0;
	public float gunPullback = -1F, lastGunPullback = -1F;
	public boolean isFired = false;
	
	/** Misc */
	public ItemStack cachedAmmoStack;
	public int reloadAmmoCount = 1;
	public boolean isGunEmpty = false;
	
	public void onTickUpdate()
	{	
		if(reloading)
		{	
			if(currentReloadState == null)
				currentReloadState = reloadStateEntries.get(0);
															
			if(currentReloadState.stateType == StateType.Tilt)
				tiltHold = true;
			if(currentReloadState.stateType == StateType.Untilt)
				tiltHold = false;
			
			if(reloadProgress >= currentReloadState.cutOffTime)
			{
				if(reloadStateIndex+1 < reloadStateEntries.size())
				{
					reloadStateIndex++;
					currentReloadState.finished = true;
					currentReloadState = reloadStateEntries.get(reloadStateIndex);
				}
			}
			
			reloadProgress += 1F / reloadTime;
			if(reloadProgress >= 0.9F)
				isGunEmpty = false;
			if(reloadProgress >= 1F) {
				reloading = false;
				reloadProgress = 0f;
				reloadStateEntries = null;
				currentReloadState = null;
				reloadStateIndex = 0;
				reloadType = null;
			}
		}
		
		if(shooting)
		{
			if(currentShootState == null)
				currentShootState = shootStateEntries.get(0);
			
			if(shootProgress >= currentShootState.cutOffTime)
			{
				if(shootStateIndex+1 < shootStateEntries.size())
				{
					shootStateIndex++;
					currentShootState.finished = true;
					currentShootState = shootStateEntries.get(shootStateIndex);
				}
			}
			
			shootProgress += 1F / shootTime;

			if(shootProgress >= 1F) {
				shooting = false;
				shootProgress = 0f;
				shootStateEntries = null;
				currentShootState = null;
				shootStateIndex = 0;
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
		if(reloading && currentReloadState != null)
			currentReloadState.onTick(reloadTime);
		
		if(shooting && currentShootState != null)
			currentShootState.onTick(shootTime);
	}
	
	public void triggerShoot(ModelGun model, int shootDelay)
	{
		Random r = new Random();
		
		lastGunRecoil = gunRecoil = 1F;
		//System.out.println("called2");
		lastGunSlide = gunSlide = 1F;
		hammerRotation = model.hammerAngle;
		timeUntilPullback = model.hammerDelay;
		
		ArrayList<StateEntry> animEntries = WeaponAnimations.getAnimation(model.reloadAnimation).getShootStates(model);
		if(animEntries.size() > 0)
		{
			shootStateEntries = adjustTiming(animEntries);
			shooting = true;
			shootTime = shootDelay;
		}
				
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
		ArrayList<StateEntry> animEntries = WeaponAnimations.getAnimation(model.reloadAnimation).getReloadStates(reloadType, reloadCount);
		reloadStateEntries = adjustTiming(animEntries);
		
		this.reloadTime = reloadType != ReloadType.Full ? reloadTime*0.65f : reloadTime;
		this.reloadTime += 20;
		//this.reloadTime = 200;
		this.reloadType = reloadType;
		this.reloading = true;
	}
	
	public Optional<StateEntry> getReloadState()
	{
		return Optional.ofNullable(currentReloadState);
	}
	
	public boolean isReloadState(StateType stateType)
	{
		return currentReloadState != null ? currentReloadState.stateType == stateType : false;
	}
	
	public Optional<StateEntry> getShootState()
	{
		return Optional.ofNullable(currentShootState);
	}
	
	public boolean isShootState(StateType stateType)
	{
		return currentShootState != null ? currentShootState.stateType == stateType : false;
	}
	
	public boolean shouldRenderAmmo()
	{
		if(reloading)
		{
			switch(reloadType)
			{
			case Load:
			{
				Optional<StateEntry> state = getState(StateType.Load);
				return state.isPresent() ? state.get().currentValue < 1f : false;
			}
			case Unload:
			{
				Optional<StateEntry> state = getState(StateType.Unload);
				return state.isPresent() ? state.get().currentValue < 0.99 : false;
			}
			
			default:
				break;
			}
		}
		return true;
	}
	
	public boolean isReloadType(ReloadType type)
	{
		return reloadType != null && reloadType == type; 
	}
	
	// Internal Methods
	private ArrayList<StateEntry> adjustTiming(ArrayList<StateEntry> animEntries)
	{
		float currentTiming = 0f;
		float dividedAmount = 0f;
		float cutOffTime = 0f;
		for(StateEntry entry : animEntries)
			currentTiming += entry.stateTime;
		if(currentTiming < 1f)
			dividedAmount = (1f-currentTiming) / animEntries.size();
		if(dividedAmount > 0f)
		{
			for(StateEntry entry : animEntries) {
				entry.stateTime += dividedAmount;
			}
		}
		for(StateEntry entry : animEntries)
		{
			cutOffTime += entry.stateTime;
			entry.cutOffTime += cutOffTime;
		}
		return animEntries;
	}
	
	private Optional<StateEntry> getState(StateType stateType)
	{
		StateEntry stateEntry = null;
		
		if(reloadStateEntries == null)
			return Optional.ofNullable(stateEntry);
		
		for(StateEntry entry : reloadStateEntries)
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
