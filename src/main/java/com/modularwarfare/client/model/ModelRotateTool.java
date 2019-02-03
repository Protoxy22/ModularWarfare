package com.modularwarfare.client.model;

import com.modularwarfare.client.model.objects.TurboBase;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class ModelRotateTool extends TurboBase {
	
	public ModelRendererTurbo[] rotateToolModel = new ModelRendererTurbo[0];
	
	public float renderOffset = 0F;
	
	public void renderRotateTool(float f)
	{
		for(ModelRendererTurbo model : rotateToolModel)
			if(model != null)
				model.render(f);
	}
	
	@Override
	public void flipAll()
	{
		//flip(rotateToolModel);
	}
	
	@Override
	public void translateAll(float x, float y, float z) {
		//translate(attachmentModel, x , y, z);
	}

}
