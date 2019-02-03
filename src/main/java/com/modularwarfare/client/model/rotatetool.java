//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 03.02.2019 - 12:19:47
// Last changed on: 03.02.2019 - 12:19:47

package com.modularwarfare.client.model; //Path where the model is located

import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class rotatetool extends ModelRotateTool //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public rotatetool() //Same as Filename
	{
		rotateToolModel = new ModelRendererTurbo[3];

		initrotateToolModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initrotateToolModel_1()
	{
		rotateToolModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 584
		rotateToolModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 585
		rotateToolModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2

		rotateToolModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 33F, 0F, 0F, 33F, 0F, 0F, 24F, 0F, 0F, 24F, 0F, 0F, 33F, 0F, 0F, 33F, 0F, 0F, 24F, 0F, 0F, 24F); // Box 584
		rotateToolModel[0].setRotationPoint(-0.5F, -0.5F, 0F);

		rotateToolModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 87F, 0.5F, 0F, 87F, 0.5F, 0F, 87F, -8.5F, 0F, 87F, -8.5F, 0F, 60F, 0.5F, 0F, 60F, 0.5F, 0F, 60F, -8.5F, 0F, 60F, -8.5F); // Box 585
		rotateToolModel[1].setRotationPoint(-0.5F, -0.5F, 0F);

		rotateToolModel[2].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		rotateToolModel[2].setRotationPoint(-26.5F, -0.5F, -0.5F);
	}
}