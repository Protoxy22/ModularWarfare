package com.modularwarfare.client.model;

import com.modularwarfare.client.tmt.ModelRendererTurbo;

import net.minecraft.client.model.ModelBase;

public class TurboBase extends ModelBase {
	
	protected void render(ModelRendererTurbo[] models, float f)
	{
		for(ModelRendererTurbo model : models)
			if(model != null)
				model.render(f);
	}
	
	protected void translate(ModelRendererTurbo[] model, float x, float y, float z)
	{
		for(ModelRendererTurbo mod : model)
		{
			mod.rotationPointX += x;
			mod.rotationPointY += y;
			mod.rotationPointZ += z;
		}
	}
	
	protected void flip(ModelRendererTurbo[] model)
	{
		for(ModelRendererTurbo part : model)
		{
			part.doMirror(false, true, true);
			part.setRotationPoint(part.rotationPointX, - part.rotationPointY, - part.rotationPointZ);
		}
	}

	public void translateAll(float x, float y, float z) {
		
	}

	public void flipAll() {
		
	}

}
