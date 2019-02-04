package com.modularwarfare.client.model;

import java.util.HashMap;

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.client.model.objects.RenderVariables;
import com.modularwarfare.client.model.objects.TurboBase;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBase;

public class ModelBullet extends TurboBase {
	
	public ModelRendererTurbo[] bulletModel = new ModelRendererTurbo[0];
	public Vector3f thirdPersonOffset = new Vector3f();
	/** The amount of attached mags, 0 default, 1 = 1+1 (default + extra) */
	public int attachedMagCount = 0;
	/** Offset by this amount */
	
	//public HashMap<Integer, RenderVariables> magCountOffset = new HashMap<Integer, RenderVariables>();
	
	public void renderBullet(float f)
	{
		render(bulletModel, f);
	}
	
	@Override
	public void translateAll(float x, float y, float z)
	{
		translate(bulletModel, x, y, z);
	}
	
	@Override
	public void flipAll()
	{
		flip(bulletModel);
	}

}
