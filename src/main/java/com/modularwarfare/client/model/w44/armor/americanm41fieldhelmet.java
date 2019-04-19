//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 31.10.2017 - 02:30:46
// Last changed on: 31.10.2017 - 02:30:46

package com.modularwarfare.client.model.w44.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class americanm41fieldhelmet extends ModelArmor //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public americanm41fieldhelmet() //Same as Filename
	{
		headModel = new ModelRendererTurbo[12];
		headModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box3
		headModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box3
		headModel[2] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import Box3
		headModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box3
		headModel[4] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box3
		headModel[5] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 13
		headModel[6] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 14
		headModel[7] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 198
		headModel[8] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 199
		headModel[9] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 201
		headModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 202
		headModel[11] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 203

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 4, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.4F, -0.1F, 0.6F, 0.4F, -0.1F, 0.6F, 0.4F, 1.2F, 0.1F, 0.4F, 1.2F, 0.1F); // Import Box3
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0.3F, -1.4F, -0.9F, 0.3F, -1.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Import Box3
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -8F, 0.2F, 8, 3, 4, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.4F, 1.2F, 0.1F, 0.4F, 1.2F, 0.1F, 0.4F, 0.8F, 0.4F, 0.4F, 0.8F, 0.4F); // Import Box3
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -4F, 0.4F, 8, 1, 4, 0F, 0.4F, -0.2F, 0.3F, 0.4F, -0.2F, 0.3F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.9F, -0.3F, 0.3F, 0.9F, -0.3F, 0.3F, 0.6F, -0.7F, 0.7F, 0.6F, -0.7F, 0.7F); // Import Box3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -4F, -4.2F, 8, 1, 4, 0F, 0.4F, 1.1F, 0.4F, 0.4F, 1.1F, 0.4F, 0.4F, -0.2F, 0.3F, 0.4F, -0.2F, 0.3F, 0.6F, -1.6F, 1.3F, 0.6F, -1.6F, 1.3F, 0.9F, -0.3F, 0.3F, 0.9F, -0.3F, 0.3F); // Import Box3
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -4F, -4.5F, 9, 4, 4, 0F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Box 13
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Box 14
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-2F, -5.2F, -5.5F, 4, 1, 1, 0F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 198
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -5.2F, -5.8F, 2, 1, 1, 0F, 0F, -0.5F, -0.3F, 0F, -0.25F, -0.6F, 0F, 0F, 0F, 0F, -0.35F, -0.4F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, -0.4F); // Box 199
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(2F, -5.2F, -5.8F, 2, 1, 1, 0F, 0F, -0.25F, -0.6F, 0F, -0.5F, -0.3F, 0F, -0.35F, -0.4F, 0F, 0F, 0F, 0F, -0.5F, -0.6F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F); // Box 201
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4.6F, -4.7F, -5.5F, 1, 1, 2, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 202
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(3.6F, -4.7F, -5.5F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F); // Box 203
		headModel[11].setRotationPoint(0F, 0F, 0F);


	}
}