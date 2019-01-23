package com.modularwarfare.client.model;

import org.lwjgl.util.vector.Vector3f;

public class RenderVariables {
	
	public Vector3f offset;
	public Vector3f scale;
	
	public RenderVariables(Vector3f offset, Vector3f scale)
	{
		this.offset = offset;
		this.scale = scale;
	}
	
	public RenderVariables(Vector3f offset, float scale)
	{
		this(offset, new Vector3f(scale, scale, scale));
	}

}
