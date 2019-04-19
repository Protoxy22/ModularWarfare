//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.11.2017 - 00:59:36
// Last changed on: 01.11.2017 - 00:59:36

package com.modularwarfare.client.model.w44.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class americangreatcoat extends ModelArmor //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public americangreatcoat() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[15];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 11
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 34
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 18

		bodyModel[0].addShapeBox(-4F, 2F, -2F, 8, 10, 4, 0F, 0.05F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0.1F, 0.2F, 0.05F, 0.1F, 0.2F, 0.05F, 0.1F, 0.2F, 0.05F, 0.1F, 0.2F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, -2.3F, 3, 3, 1, 0F, -0.75F, 0F, 0.15F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0.4F, -3F, 1F, 0F, -3F, 1F, 0F, 2F, 0F, 0F); // Box 11
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3F, 0F, -2.35F, 3, 2, 1, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0.15F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, -1F, 1.5F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, -1F, 1.5F, 0F); // Box 12
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F, 0.05F, 0F, 0.2F, -1.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0.05F, 0.1F, 0.2F); // Box 1
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F, -1.5F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.1F, 0.2F, 0.05F, 0.1F, 0.2F, 0.05F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 34
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.5F, 2.5F, -2F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F); // Box 9
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3.5F, 4.5F, -2F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F); // Box 10
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3.5F, 6.5F, -2F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F); // Box 11
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.5F, 8.5F, -2F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F); // Box 12
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.5F, 10.5F, -2F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F); // Box 13
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(2.5F, 10.5F, -2F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F); // Box 14
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(2.5F, 8.5F, -2F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F); // Box 15
		bodyModel[11].setRotationPoint(0F, 2F, 0F);

		bodyModel[12].addShapeBox(2.5F, 6.5F, -2F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F); // Box 16
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(2.5F, 4.5F, -2F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F); // Box 17
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(2.5F, 2.5F, -2F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0.3F); // Box 18
		bodyModel[14].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[2];
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 3
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 3

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 9, 4, 0F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6.9F, -2F, 4, 2, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 3
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[2];
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 9, 4, 0F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F, 0.12F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 6.9F, -2F, 4, 2, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[1];
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 43

		leftLegModel[0].addShapeBox(-2F, -0.5F, -2F, 4, 8, 4, 0F, 0F, 0.25F, 0.2F, 0.05F, 0.25F, 0.2F, 0.05F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, -0.1F, 0F, 0.65F, 0.8F, 1F, 0.65F, 0.8F, 1F, 0.65F, -0.1F, 0F, 0.65F); // Box 43
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[1];
		rightLegModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1

		rightLegModel[0].addShapeBox(-2F, -0.5F, -2F, 4, 8, 4, 0F, 0.05F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0.05F, 0.25F, 0.2F, 0.8F, 1F, 0.65F, -0.1F, 0F, 0.65F, -0.1F, 0F, 0.65F, 0.8F, 1F, 0.65F); // Box 1
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);


	}
}