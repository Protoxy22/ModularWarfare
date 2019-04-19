//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.04.2019 - 01:09:12
// Last changed on: 17.04.2019 - 01:09:12

package com.modularwarfare.client.model.w44.ammo; //Path where the model is located

import com.modularwarfare.client.model.ModelAmmo;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class m1a1thompsondrumammo extends ModelAmmo //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public m1a1thompsondrumammo() //Same as Filename
	{
		ammoModel = new ModelRendererTurbo[11];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		ammoModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 5
		ammoModel[2] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 188
		ammoModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 189
		ammoModel[4] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 190
		ammoModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 191
		ammoModel[6] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 192
		ammoModel[7] = new ModelRendererTurbo(this, 45, 34, textureX, textureY); // Box 163
		ammoModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 170
		ammoModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 171
		ammoModel[10] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 172

		ammoModel[0].addShapeBox(0F, 4F, -0.5F, 3, 5, 14, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 4
		ammoModel[0].setRotationPoint(-0.5F, -6F, -6.5F);

		ammoModel[1].addShapeBox(0F, -1F, 2F, 3, 1, 9, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		ammoModel[1].setRotationPoint(-0.5F, -6F, -6.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		ammoModel[2].setRotationPoint(-0.5F, -6F, -6.5F);

		ammoModel[3].addShapeBox(0F, 2F, 0F, 3, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 189
		ammoModel[3].setRotationPoint(-0.5F, -6F, -6.5F);

		ammoModel[4].addShapeBox(0F, 9F, 0F, 3, 2, 13, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		ammoModel[4].setRotationPoint(-0.5F, -6F, -6.5F);

		ammoModel[5].addShapeBox(0F, 11F, 0F, 3, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 191
		ammoModel[5].setRotationPoint(-0.5F, -6F, -6.5F);

		ammoModel[6].addShapeBox(0F, 13F, 2F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 192
		ammoModel[6].setRotationPoint(-0.5F, -6F, -6.5F);

		ammoModel[7].addShapeBox(-0.5F, 4F, 4F, 4, 5, 5, 0F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F); // Box 163
		ammoModel[7].setRotationPoint(-0.5F, -6F, -6.5F);

		ammoModel[8].addShapeBox(-0.5F, 6F, 6F, 4, 1, 1, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 170
		ammoModel[8].setRotationPoint(-0.5F, -6F, -6.5F);

		ammoModel[9].addShapeBox(-0.5F, 6F, 3.6F, 4, 1, 6, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 171
		ammoModel[9].setRotationPoint(-0.5F, -6F, -6.5F);

		ammoModel[10].addShapeBox(-0.5F, -1.05F, 4.5F, 4, 2, 4, 0F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F); // Box 172
		ammoModel[10].setRotationPoint(-0.5F, -6F, -6.5F);

		modelScale = 0.3F;

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}