//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.05.2017 - 22:22:40
// Last changed on: 14.05.2017 - 22:22:40

package com.modularwarfare.client.model.w44.ammo; //Path where the model is located

import com.modularwarfare.client.model.ModelAmmo;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class m1a1thompsonstickammo extends ModelAmmo //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public m1a1thompsonstickammo() //Same as Filename
	{
		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 0, 3, textureX, textureY); // Box 30
		ammoModel[1] = new ModelRendererTurbo(this, 26, 3, textureX, textureY); // Box 40
		ammoModel[2] = new ModelRendererTurbo(this, 15, 3, textureX, textureY); // Box 81

		ammoModel[0].addShapeBox(0F, 0F, 0F, 4, 19, 2, 0F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 30
		ammoModel[0].setRotationPoint(8.5F, -9.01F, -1F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 40
		ammoModel[1].setRotationPoint(8.47F, -9.02F, -1F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 81
		ammoModel[2].setRotationPoint(10.5F, -8.99F, -1F);

		modelScale = 0.3F;

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}