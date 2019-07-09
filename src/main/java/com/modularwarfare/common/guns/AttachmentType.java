package com.modularwarfare.common.guns;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelAttachment;
import com.modularwarfare.common.type.BaseType;

public class AttachmentType extends BaseType {

	public AttachmentEnum attachmentType;

	@Override
	public void loadExtraValues() {
		if (maxStackSize == null)
			maxStackSize = 1;

		loadBaseValues();
	}

	@Override
	public void reloadModel() {
		model = ModularWarfare.PROXY.loadModel(modelName != null ? modelName : internalName, internalName, ModelAttachment.class);
	}

	@Override
	public String getAssetDir() {
		return "attachments";
	}

}
