package com.modularwarfare.common.guns;

import com.modularwarfare.common.type.BaseItem;
import com.modularwarfare.common.type.BaseType;

public class ItemAttachment extends BaseItem {

	public AttachmentType type;
	
	public ItemAttachment(AttachmentType type) {
		super(type);
		this.type = type;
		this.render3d = false;
	}
	
}
