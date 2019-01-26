package com.modularwarfare.common.guns;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelAttachment;
import com.modularwarfare.common.type.BaseType;

public class AttachmentType extends BaseType {
	
	@Override
	public void loadExtraValues()
	{
		loadBaseValues();
	}
	
	@Override
	public void reloadModel()
	{
		model = ModularWarfare.PROXY.loadModel(modelName != null ? modelName : internalName, internalName, ModelAttachment.class);
	}

}
