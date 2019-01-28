package com.modularwarfare.utility;

import org.lwjgl.util.vector.Vector3f;

public class Vector4f {
	
	public float x = 0f;
	public float y = 0f;
	public float z = 0f;
	public float w = 0f;
	
	public Vector4f(float x, float y, float z, float w)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public void multiply(Vector4f vector)
	{
		x *= vector.x;
		y *= vector.y;
		z *= vector.z;
		w *= vector.w;
	}
	
	public void multiply(Vector3f vector)
	{
		multiply(new Vector4f(vector.x, vector.y, vector.z, 0f));
	}

}
