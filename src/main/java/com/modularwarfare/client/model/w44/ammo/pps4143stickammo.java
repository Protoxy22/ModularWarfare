//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.04.2019 - 20:21:56
// Last changed on: 18.04.2019 - 20:21:56

package com.modularwarfare.client.model.w44.ammo; //Path where the model is located

import com.modularwarfare.client.model.ModelAmmo;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class pps4143stickammo extends ModelAmmo //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public pps4143stickammo() //Same as Filename
	{
		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 153
		ammoModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 154
		ammoModel[2] = new ModelRendererTurbo(this, 9, 16, textureX, textureY); // Box 156

		ammoModel[0].addShapeBox(0F, 0F, 0F, 4, 9, 2, 0F, 0.5F, 0F, 0.15F, 0F, 1F, 0.15F, 0F, 1F, 0.15F, 0.5F, 0F, 0.15F, -2F, 0F, 0.15F, 2F, -2F, 0.15F, 2F, -2F, 0.15F, -2F, 0F, 0.15F); // Box 153
		ammoModel[0].setRotationPoint(-0.5F, 9F, -1F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 4, 9, 2, 0F, 0F, 0F, 0.15F, 0F, 2F, 0.15F, 0F, 2F, 0.15F, 0F, 0F, 0.15F, -3F, -0.5F, 0.15F, 3F, -3.25F, 0.15F, 3F, -3.25F, 0.15F, -3F, -0.5F, 0.15F); // Box 154
		ammoModel[1].setRotationPoint(1.5F, 18F, -1F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 4, 9, 2, 0F, -1F, 1F, 0.15F, 1.5F, 1F, 0.15F, 1.5F, 1F, 0.15F, -1F, 1F, 0.15F, -2F, 0F, 0.15F, 2.5F, -1F, 0.15F, 2.5F, -1F, 0.15F, -2F, 0F, 0.15F); // Box 156
		ammoModel[2].setRotationPoint(-3F, 0F, -1F);

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}