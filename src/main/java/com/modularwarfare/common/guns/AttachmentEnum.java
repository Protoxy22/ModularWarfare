package com.modularwarfare.common.guns;

import com.google.gson.annotations.SerializedName;

public enum AttachmentEnum {
	
	@SerializedName("sight") Sight("sight"),
	@SerializedName("slide") Slide("slide");
	
	
	public String typeName;
	
	AttachmentEnum(String typeName)
	{
		this.typeName = typeName;
	}

}
