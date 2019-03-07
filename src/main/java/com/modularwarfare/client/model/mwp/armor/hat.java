//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 02.10.2016 - 10:56:12
// Last changed on: 02.10.2016 - 10:56:12

package com.modularwarfare.client.model.mwp.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class hat extends ModelArmor //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public hat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[11];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		headModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		headModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 40
		headModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 41
		headModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 42
		headModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 43
		headModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 44
		headModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 45
		headModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 46
		headModel[9] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 47
		headModel[10] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 48

		headModel[0].addShapeBox(-4F, -6F, -6F, 8, 1, 2, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 7
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 3
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-2F, -4F, -4.2F, 1, 1, 1, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 40
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(1F, -4F, -4.2F, 1, 1, 1, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 41
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-1F, -4F, -4.2F, 1, 1, 1, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F); // Box 42
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(0F, -4F, -4.2F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.2F, 0F); // Box 43
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -4F, -4.2F, 2, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.2F, 0F); // Box 44
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(2F, -4F, -4.2F, 2, 1, 1, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F); // Box 45
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-0.5F, -4.1F, -4.25F, 1, 1, 1, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 46
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4.5F, -4.3F, -4.2F, 1, 1, 5, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 47
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(3.5F, -4.3F, -4.2F, 1, 1, 5, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 48
		headModel[10].setRotationPoint(0F, 0F, 0F);


	}
}