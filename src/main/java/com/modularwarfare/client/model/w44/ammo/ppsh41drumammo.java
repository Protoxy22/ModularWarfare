//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.04.2019 - 20:21:56
// Last changed on: 18.04.2019 - 20:21:56

package com.modularwarfare.client.model.w44.ammo; //Path where the model is located

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelAmmo;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class ppsh41drumammo extends ModelAmmo //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ppsh41drumammo() //Same as Filename
	{
		ammoModel = new ModelRendererTurbo[12];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 3, textureX, textureY); // Box 4
		ammoModel[1] = new ModelRendererTurbo(this, 30, 4, textureX, textureY); // Box 5
		ammoModel[2] = new ModelRendererTurbo(this, 31, 17, textureX, textureY); // Box 188
		ammoModel[3] = new ModelRendererTurbo(this, 58, 3, textureX, textureY); // Box 189
		ammoModel[4] = new ModelRendererTurbo(this, 51, 39, textureX, textureY); // Box 190
		ammoModel[5] = new ModelRendererTurbo(this, 23, 44, textureX, textureY); // Box 191
		ammoModel[6] = new ModelRendererTurbo(this, 3, 27, textureX, textureY); // Box 192
		ammoModel[7] = new ModelRendererTurbo(this, 66, 28, textureX, textureY); // Box 163
		ammoModel[8] = new ModelRendererTurbo(this, 3, 50, textureX, textureY); // Box 170
		ammoModel[9] = new ModelRendererTurbo(this, 35, 35, textureX, textureY); // Box 171
		ammoModel[10] = new ModelRendererTurbo(this, 13, 39, textureX, textureY); // Box 172
		ammoModel[11] = new ModelRendererTurbo(this, 27, 50, textureX, textureY); // Box 173

		ammoModel[0].addShapeBox(20F, -4.5F, -7.5F, 6, 5, 14, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 4
		ammoModel[0].setRotationPoint(-1F, 2F, 0.5F);
		ammoModel[0].rotateAngleZ = 0.06981317F;

		ammoModel[1].addShapeBox(20F, -9.5F, -5F, 6, 1, 9, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		ammoModel[1].setRotationPoint(-1F, 2F, 0.5F);
		ammoModel[1].rotateAngleZ = 0.06981317F;

		ammoModel[2].addShapeBox(20F, -8.5F, -7F, 6, 2, 13, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		ammoModel[2].setRotationPoint(-1F, 2F, 0.5F);
		ammoModel[2].rotateAngleZ = 0.06981317F;

		ammoModel[3].addShapeBox(20F, -6.5F, -7F, 6, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 189
		ammoModel[3].setRotationPoint(-1F, 2F, 0.5F);
		ammoModel[3].rotateAngleZ = 0.06981317F;

		ammoModel[4].addShapeBox(20F, 0.5F, -7F, 6, 2, 13, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		ammoModel[4].setRotationPoint(-1F, 2F, 0.5F);
		ammoModel[4].rotateAngleZ = 0.06981317F;

		ammoModel[5].addShapeBox(20F, 2.5F, -7F, 6, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 191
		ammoModel[5].setRotationPoint(-1F, 2F, 0.5F);
		ammoModel[5].rotateAngleZ = 0.06981317F;

		ammoModel[6].addShapeBox(20F, 4.5F, -5F, 6, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 192
		ammoModel[6].setRotationPoint(-1F, 2F, 0.5F);
		ammoModel[6].rotateAngleZ = 0.06981317F;

		ammoModel[7].addShapeBox(19.5F, -4.5F, -3F, 7, 5, 5, 0F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F); // Box 163
		ammoModel[7].setRotationPoint(-1F, 2F, 0.5F);
		ammoModel[7].rotateAngleZ = 0.06981317F;

		ammoModel[8].addShapeBox(19.5F, -2.5F, -1F, 7, 1, 1, 0F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F); // Box 170
		ammoModel[8].setRotationPoint(-1F, 2F, 0.5F);
		ammoModel[8].rotateAngleZ = 0.06981317F;

		ammoModel[9].addShapeBox(19.5F, -2.5F, -3.4F, 7, 1, 6, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 171
		ammoModel[9].setRotationPoint(-1F, 2F, 0.5F);
		ammoModel[9].rotateAngleZ = 0.06981317F;

		ammoModel[10].addShapeBox(19.5F, -9.55F, -2.5F, 7, 2, 4, 0F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F); // Box 172
		ammoModel[10].setRotationPoint(-1F, 2F, 0.5F);
		ammoModel[10].rotateAngleZ = 0.06981317F;

		ammoModel[11].addShapeBox(22F, -9.5F, -3.5F, 2, 1, 1, 0F, 0.1F, 0.6F, -0.1F, 0.1F, 0.6F, -0.1F, 0.1F, 0.2F, -0.1F, 0.1F, 0.2F, -0.1F, 0.1F, 0.2F, -0.1F, 0.1F, 0.2F, -0.1F, 0.1F, 0.2F, -0.1F, 0.1F, 0.2F, -0.1F); // Box 173
		ammoModel[11].setRotationPoint(-1F, 2F, 0.5F);
		ammoModel[11].rotateAngleX = -0.54105207F;
		ammoModel[11].rotateAngleZ = 0.06981317F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}