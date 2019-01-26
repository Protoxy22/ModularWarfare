package com.modularwarfare.common.guns;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.common.type.BaseType;

public class AttachmentType extends BaseType {
	
	@Override
	public void loadExtraValues()
	{
		
	}
	
	@Override
	public void reloadModel()
	{
		model = ModularWarfare.PROXY.loadModel(modelName != null ? modelName : internalName, internalName, ModelGun.class);
	}

}
