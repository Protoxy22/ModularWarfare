//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.04.2019 - 11:33:40
// Last changed on: 19.04.2019 - 11:33:40

package com.modularwarfare.client.model.w44.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class americanbackpack extends ModelArmor //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public americanbackpack() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[12];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 12
		bodyModel[1] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 13
		bodyModel[2] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 14
		bodyModel[3] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 3
		bodyModel[7] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 4
		bodyModel[8] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 5
		bodyModel[9] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 6
		bodyModel[10] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 8
		bodyModel[11] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 9

		bodyModel[0].addShapeBox(-3F, 1.5F, 1.5F, 6, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3F, 7.5F, 1.5F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, -0.3F, -0.5F, -0.7F, -0.3F); // Box 13
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3F, 0.5F, 1.5F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 14
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3F, 0.5F, 3.3F, 6, 1, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3F, 4F, 3.4F, 6, 1, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 1
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3F, 1.5F, 3.3F, 6, 3, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 2
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1.4F, 4.5F, 2.7F, 1, 3, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 3
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0.4F, 4.5F, 2.7F, 1, 3, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F); // Box 4
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-1.5F, 1.5F, 4.05F, 3, 3, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 5
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1.5F, 0.5F, 4.05F, 3, 1, 1, 0F, -1.3F, 0F, -0.4F, -1.3F, 0F, -0.4F, -1.3F, 0F, -0.4F, -1.3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 6
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.5F, 4.5F, 3.9F, 1, 6, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1F, 10.25F, 3.9F, 2, 1, 1, 0F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 9
		bodyModel[11].setRotationPoint(0F, 0F, 0F);


	}
}