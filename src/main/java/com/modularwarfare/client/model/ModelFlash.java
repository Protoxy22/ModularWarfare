package com.modularwarfare.client.model;

import com.modularwarfare.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelFlash extends ModelBase
{
	public transient ModelRendererTurbo[][] flashModel = new ModelRendererTurbo[0][0];

	public void renderFlash(float f, int i)
	{
		if(flashModel[i] != null)
			render(flashModel[i], f);
	}

	public void render(ModelRendererTurbo[] flash, float f)
	{
		for(ModelRendererTurbo model : flash)
			if(model != null)
				model.render(f);
	}

	protected void flipAll()
	{
		for(ModelRendererTurbo[] model : flashModel)
		{
			for (ModelRendererTurbo flash : model)
			{
				flash.doMirror(false, true, true);
				flash.setRotationPoint(flash.rotationPointX, -flash.rotationPointY, -flash.rotationPointZ);
			}
		}
	}
}
