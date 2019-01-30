package com.modularwarfare.client.model;

import com.modularwarfare.client.model.objects.TurboBase;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class ModelAttachment extends TurboBase {
	
	public ModelRendererTurbo[] attachmentModel = new ModelRendererTurbo[0];
	
	/** For big scopes, so that the player actually looks through them properly */
	public float renderOffset = 0F;
	
	public void renderAttachment(float f)
	{
		for(ModelRendererTurbo model : attachmentModel)
			if(model != null)
				model.render(f);
	}
	
	@Override
	public void flipAll()
	{
		flip(attachmentModel);
	}
	
	@Override
	public void translateAll(float x, float y, float z) {
		translate(attachmentModel, x , y, z);
	}

}
