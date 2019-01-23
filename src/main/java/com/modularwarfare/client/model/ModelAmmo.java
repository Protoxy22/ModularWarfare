package com.modularwarfare.client.model;

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBase;

public class ModelAmmo extends TurboBase {
	
	public ModelRendererTurbo[] ammoModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] fullAmmoModel = new ModelRendererTurbo[0];
	public Vector3f thirdPersonOffset = new Vector3f();
	/** The amount of attached mags, 0 default, 1 = 1+1 (default + extra) */
	public int attachedMagCount = 0;
	/** Offset by this amount */
	public Vector3f attachedMagOffset = new Vector3f();
	
	public void renderAmmo(float f)
	{
		render(ammoModel, f);
	}
	
	@Override
	public void translateAll(float x, float y, float z)
	{
		translate(ammoModel, x, y, z);
		translate(fullAmmoModel, x, y, z);
	}
	
	@Override
	public void flipAll()
	{
		flip(ammoModel);
		flip(fullAmmoModel);
	}

}
