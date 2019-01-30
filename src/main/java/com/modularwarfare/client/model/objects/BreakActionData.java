package com.modularwarfare.client.model.objects;

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class BreakActionData {
	
	public ModelRendererTurbo[] modelGroup;
	public Vector3f breakPoint;
	public float angle;
	public boolean scopePart;
	
	public BreakActionData(ModelRendererTurbo[] modelGroup, Vector3f breakPoint, float angle, boolean scopePart)
	{
		this.modelGroup = modelGroup;
		this.breakPoint = breakPoint;
		this.angle = angle;
		this.scopePart = scopePart;
	}

}
