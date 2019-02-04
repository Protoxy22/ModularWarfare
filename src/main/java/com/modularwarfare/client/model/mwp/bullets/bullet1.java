//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.12.2018 - 12:41:02
// Last changed on: 21.12.2018 - 12:41:02

package com.modularwarfare.client.model.mwp.bullets; //Path where the model is located

import com.modularwarfare.client.model.ModelBullet;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class bullet1 extends ModelBullet //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public bullet1() //Same as Filename
	{
		bulletModel = new ModelRendererTurbo[25];

		initbulletModel_1();

		flipAll();
	}

	private void initbulletModel_1()
	{
		bulletModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 414
		bulletModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 415
		bulletModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 416
		bulletModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 417
		bulletModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 418
		bulletModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 419
		bulletModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 420
		bulletModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 421
		bulletModel[8] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 422
		bulletModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 423
		bulletModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 424
		bulletModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 425
		bulletModel[12] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 426
		bulletModel[13] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 427
		bulletModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 428
		bulletModel[15] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 429
		bulletModel[16] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 430
		bulletModel[17] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 431
		bulletModel[18] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 438
		bulletModel[19] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 439
		bulletModel[20] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 440
		bulletModel[21] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 443
		bulletModel[22] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 444
		bulletModel[23] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 445
		bulletModel[24] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 24

		bulletModel[0].addShapeBox(-10F, -3.5F, -3.5F, 2, 3, 4, 0F,0F, -1.45F, -0.35F, 0F, -1.45F, -0.35F, 0F, -0.2F, -2.8F, 0F, -0.2F, -2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bulletModel[0].setRotationPoint(0F, 0F, 0F);

		bulletModel[1].addShapeBox(-11F, -5.5F, -3.5F, 1, 5, 4, 0F,0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.15F, -0.85F, 0F, -3.15F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bulletModel[1].setRotationPoint(0F, 0F, 0F);

		bulletModel[2].addShapeBox(-11F, -4.5F, -4.5F, 1, 4, 5, 0F,0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.85F, -3.15F, 0F, -0.85F, -3.15F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bulletModel[2].setRotationPoint(0F, 0F, 0F);

		bulletModel[3].addShapeBox(-11F, -5.5F, 0.5F, 1, 5, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.15F, -0.85F, 0F, -3.15F, -0.85F); // Box 417
		bulletModel[3].setRotationPoint(0F, 0F, 0F);

		bulletModel[4].addShapeBox(-11F, -4.5F, 0.5F, 1, 4, 5, 0F,0F, -0.85F, -3.15F, 0F, -0.85F, -3.15F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 418
		bulletModel[4].setRotationPoint(0F, 0F, 0F);

		bulletModel[5].addShapeBox(-11F, -0.5F, -3.5F, 1, 5, 4, 0F,0F, -3.15F, -0.85F, 0F, -3.15F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 419
		bulletModel[5].setRotationPoint(0F, 0F, 0F);

		bulletModel[6].addShapeBox(-11F, -0.5F, -4.5F, 1, 4, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.85F, -3.15F, 0F, -0.85F, -3.15F); // Box 420
		bulletModel[6].setRotationPoint(0F, 0F, 0F);

		bulletModel[7].addShapeBox(-9F, -5.5F, 0.5F, 17, 5, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -3.15F, -0.85F, 0F, -3.15F, -0.85F); // Box 421
		bulletModel[7].setRotationPoint(0F, 0F, 0F);

		bulletModel[8].addShapeBox(-9F, -5.5F, -3.5F, 17, 5, 4, 0F,0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.15F, -0.85F, 0F, -3.15F, -0.85F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bulletModel[8].setRotationPoint(0F, 0F, 0F);

		bulletModel[9].addShapeBox(-10F, -4.5F, 0.5F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -1.45F, 0F, -0.35F, -1.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.8F, -0.2F, 0F, -2.8F, -0.2F); // Box 423
		bulletModel[9].setRotationPoint(0F, 0F, 0F);

		bulletModel[10].addShapeBox(-10F, -3.5F, 0.5F, 2, 3, 4, 0F,0F, -0.2F, -2.8F, 0F, -0.2F, -2.8F, 0F, -1.45F, -0.35F, 0F, -1.45F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bulletModel[10].setRotationPoint(0F, 0F, 0F);

		bulletModel[11].addShapeBox(-9F, -4.5F, 0.5F, 17, 4, 5, 0F,0F, -0.85F, -3.15F, 0F, -0.85F, -3.15F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 425
		bulletModel[11].setRotationPoint(0F, 0F, 0F);

		bulletModel[12].addShapeBox(-10F, -0.5F, -2.5F, 2, 4, 3, 0F,0F, -2.8F, -0.2F, 0F, -2.8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -1.45F, 0F, -0.35F, -1.45F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bulletModel[12].setRotationPoint(0F, 0F, 0F);

		bulletModel[13].addShapeBox(-9F, -0.5F, -3.5F, 17, 5, 4, 0F,0F, -3.15F, -0.85F, 0F, -3.15F, -0.85F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 427
		bulletModel[13].setRotationPoint(0F, 0F, 0F);

		bulletModel[14].addShapeBox(-9F, -0.5F, -4.5F, 17, 4, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.85F, -3.15F, 0F, -0.85F, -3.15F); // Box 428
		bulletModel[14].setRotationPoint(0F, 0F, 0F);

		bulletModel[15].addShapeBox(-10F, -0.5F, -3.5F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.45F, -0.35F, 0F, -1.45F, -0.35F, 0F, -0.2F, -2.8F, 0F, -0.2F, -2.8F); // Box 429
		bulletModel[15].setRotationPoint(0F, 0F, 0F);

		bulletModel[16].addShapeBox(-9F, -4.5F, -4.5F, 17, 4, 5, 0F,0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.85F, -3.15F, 0F, -0.85F, -3.15F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bulletModel[16].setRotationPoint(0F, 0F, 0F);

		bulletModel[17].addShapeBox(-10F, -4.5F, -2.5F, 2, 4, 3, 0F,0F, -0.35F, -1.45F, 0F, -0.35F, -1.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.8F, -0.2F, 0F, -2.8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bulletModel[17].setRotationPoint(0F, 0F, 0F);

		bulletModel[18].addShapeBox(-9F, -0.5F, 0.5F, 17, 4, 5, 0F,0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.85F, -3.15F, 0F, -0.85F, -3.15F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F); // Box 438
		bulletModel[18].setRotationPoint(0F, 0F, 0F);

		bulletModel[19].addShapeBox(-9F, -0.5F, 0.5F, 17, 5, 4, 0F,0F, 0F, 0F, -9F, 0F, 0F, 0F, -3.15F, -0.85F, 0F, -3.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F); // Box 439
		bulletModel[19].setRotationPoint(0F, 0F, 0F);

		bulletModel[20].addShapeBox(-10F, -0.5F, 0.5F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.8F, -0.2F, 0F, -2.8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -1.45F, 0F, -0.35F, -1.45F); // Box 440
		bulletModel[20].setRotationPoint(0F, 0F, 0F);

		bulletModel[21].addShapeBox(-11F, -0.5F, 0.5F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.15F, -0.85F, 0F, -3.15F, -0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F); // Box 443
		bulletModel[21].setRotationPoint(0F, 0F, 0F);

		bulletModel[22].addShapeBox(-11F, -0.5F, 0.5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.85F, -3.15F, 0F, -0.85F, -3.15F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F); // Box 444
		bulletModel[22].setRotationPoint(0F, 0F, 0F);

		bulletModel[23].addShapeBox(-10F, -0.5F, 0.5F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -2.8F, 0F, -0.2F, -2.8F, 0F, -1.45F, -0.35F, 0F, -1.45F, -0.35F); // Box 445
		bulletModel[23].setRotationPoint(0F, 0F, 0F);

		bulletModel[24].addShapeBox(-11.25F, -1.5F, -0.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bulletModel[24].setRotationPoint(0F, 0F, 0F);
	}
}