//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.12.2017 - 07:19:01
// Last changed on: 12.12.2017 - 07:19:01

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class webleymkvi extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public webleymkvi() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[36];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 14
		gunModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 15
		gunModel[12] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 16
		gunModel[13] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 17
		gunModel[14] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 18
		gunModel[15] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 22
		gunModel[16] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 23
		gunModel[17] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 24
		gunModel[18] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 25
		gunModel[19] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 56
		gunModel[20] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 57
		gunModel[21] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 58
		gunModel[22] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 59
		gunModel[23] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 60
		gunModel[24] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 61
		gunModel[25] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 65
		gunModel[26] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 66
		gunModel[27] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 67
		gunModel[28] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 70
		gunModel[29] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 72
		gunModel[30] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 73
		gunModel[31] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 74
		gunModel[32] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 76
		gunModel[33] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 73
		gunModel[34] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 74
		gunModel[35] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 75

		gunModel[0].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(-9F, 3F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 8, 7, 2, 0F, -1F, -4F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(-9F, -4F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 8, 7, 2, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-9F, -7F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 3
		gunModel[3].setRotationPoint(-8F, -4F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(-7F, -11F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(0F, -11F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -3F, 0F, -0.2F); // Box 6
		gunModel[6].setRotationPoint(0F, -11F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 7
		gunModel[7].setRotationPoint(-2F, -12F, -1.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 8
		gunModel[8].setRotationPoint(4F, -15F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 9
		gunModel[9].setRotationPoint(0F, -15F, -1.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F); // Box 14
		gunModel[10].setRotationPoint(-7F, -11F, 1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -2F, -4F, 0F, -1F, 0F, 0F); // Box 15
		gunModel[11].setRotationPoint(-9F, -7F, 1F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F); // Box 16
		gunModel[12].setRotationPoint(-8F, -4F, 1F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F, -1F, -4F, 0F, -1F, -2F, 0F, -2F, -2F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 17
		gunModel[13].setRotationPoint(-9F, -4F, 1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 18
		gunModel[14].setRotationPoint(-9F, 3F, 1F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 22
		gunModel[15].setRotationPoint(-8F, -4F, -2F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F, -1F, -4F, 0F, -2F, -2F, 0F, -1F, -2F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[16].setRotationPoint(-9F, -4F, -2F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[17].setRotationPoint(-9F, 3F, -2F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 25
		gunModel[18].setRotationPoint(0F, -8F, -1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[19].setRotationPoint(-2F, -14.5F, -0.5F);
		gunModel[19].rotateAngleZ = -0.34906585F;

		gunModel[20].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 57
		gunModel[20].setRotationPoint(-0.5F, -14.8F, -1F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 58
		gunModel[21].setRotationPoint(-2.5F, -11.8F, -1F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 59
		gunModel[22].setRotationPoint(3F, -15.5F, -1.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 60
		gunModel[23].setRotationPoint(3F, -16F, -1.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 61
		gunModel[24].setRotationPoint(3F, -16F, 0.5F);

		gunModel[25].addShapeBox(0F, -3F, -3F, 2, 2, 4, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[25].setRotationPoint(3F, -11F, 1F);

		gunModel[26].addBox(0F, -1F, -3F, 2, 2, 4, 0F); // Box 66
		gunModel[26].setRotationPoint(3F, -11F, 1F);

		gunModel[27].addShapeBox(0F, 1F, -3F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 67
		gunModel[27].setRotationPoint(3F, -11F, 1F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 70
		gunModel[28].setRotationPoint(1.5F, -7.5F, -1F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 72
		gunModel[29].setRotationPoint(3.5F, -3.5F, -1F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, 1F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, 1F, 0F, -0.2F); // Box 73
		gunModel[30].setRotationPoint(9F, -4.5F, -1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 74
		gunModel[31].setRotationPoint(9.5F, -7.5F, -1F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F); // Box 76
		gunModel[32].setRotationPoint(4F, -7F, -1F);
		gunModel[32].rotateAngleZ = 0.29670597F;

		gunModel[33].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, -3F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		gunModel[33].setRotationPoint(-7F, -11F, -2F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F); // Box 74
		gunModel[34].setRotationPoint(-9F, -7F, -2F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, -1.5F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, -1.5F, 0F, -0.2F); // Box 75
		gunModel[35].setRotationPoint(2F, -4.5F, -1F);


		ammoModel = new ModelRendererTurbo[6];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 47
		ammoModel[1] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 51
		ammoModel[2] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 52
		ammoModel[3] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 53
		ammoModel[4] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 54
		ammoModel[5] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 55

		ammoModel[0].addShapeBox(-0.5F, -1F, -3.2F, 6, 2, 2, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 47
		ammoModel[0].setRotationPoint(5.5F, -11F, 0F);
		ammoModel[0].rotateAngleX = 0.61086524F;

		ammoModel[1].addShapeBox(-0.5F, -1F, -3.2F, 6, 2, 2, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 51
		ammoModel[1].setRotationPoint(5.5F, -11F, 0F);
		ammoModel[1].rotateAngleX = -0.61086524F;

		ammoModel[2].addShapeBox(-0.5F, -1F, -3.2F, 6, 2, 2, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 52
		ammoModel[2].setRotationPoint(5.5F, -11F, 0F);
		ammoModel[2].rotateAngleX = -1.57079633F;

		ammoModel[3].addShapeBox(-0.5F, -1F, -3.2F, 6, 2, 2, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 53
		ammoModel[3].setRotationPoint(5.5F, -11F, 0F);
		ammoModel[3].rotateAngleX = 1.57079633F;

		ammoModel[4].addShapeBox(-0.5F, -1F, -3.2F, 6, 2, 2, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 54
		ammoModel[4].setRotationPoint(5.5F, -11F, 0F);
		ammoModel[4].rotateAngleX = 2.61799388F;

		ammoModel[5].addShapeBox(-0.5F, -1F, -3.2F, 6, 2, 2, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 55
		ammoModel[5].setRotationPoint(5.5F, -11F, 0F);
		ammoModel[5].rotateAngleX = 3.75245789F;


		breakActionModel = new ModelRendererTurbo[19];
		breakActionModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 10
		breakActionModel[1] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 11
		breakActionModel[2] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 12
		breakActionModel[3] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 26
		breakActionModel[4] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 27
		breakActionModel[5] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 28
		breakActionModel[6] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 29
		breakActionModel[7] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 30
		breakActionModel[8] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 31
		breakActionModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 32
		breakActionModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 37
		breakActionModel[11] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 38
		breakActionModel[12] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 44
		breakActionModel[13] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 45
		breakActionModel[14] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 46
		breakActionModel[15] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 62
		breakActionModel[16] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 76
		breakActionModel[17] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 77
		breakActionModel[18] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 78

		breakActionModel[0].addShapeBox(-0.5F, -9F, -1.5F, 2, 1, 3, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F); // Box 10
		breakActionModel[0].setRotationPoint(12F, -6F, 0F);

		breakActionModel[1].addShapeBox(-1F, -8F, -1.5F, 9, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 11
		breakActionModel[1].setRotationPoint(12F, -6F, 0F);

		breakActionModel[2].addShapeBox(4F, -8.5F, -1F, 12, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		breakActionModel[2].setRotationPoint(12F, -6F, 0F);

		breakActionModel[3].addShapeBox(-1F, -7F, -1.5F, 9, 1, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		breakActionModel[3].setRotationPoint(12F, -6F, 0F);

		breakActionModel[4].addShapeBox(-1F, -5F, -1.5F, 5, 1, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		breakActionModel[4].setRotationPoint(12F, -6F, 0F);

		breakActionModel[5].addShapeBox(-1F, -6F, -1.5F, 5, 1, 3, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 28
		breakActionModel[5].setRotationPoint(12F, -6F, 0F);

		breakActionModel[6].addShapeBox(-1F, -4F, -1F, 3, 1, 2, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		breakActionModel[6].setRotationPoint(12F, -6F, 0F);

		breakActionModel[7].addShapeBox(-1F, -3F, -1.5F, 3, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 30
		breakActionModel[7].setRotationPoint(12F, -6F, 0F);

		breakActionModel[8].addShapeBox(4F, -7.5F, -1F, 12, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		breakActionModel[8].setRotationPoint(12F, -6F, 0F);

		breakActionModel[9].addShapeBox(4F, -8F, -1F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		breakActionModel[9].setRotationPoint(12F, -6F, 0F);

		breakActionModel[10].addShapeBox(15.2F, -8F, -0.5F, 1, 1, 1, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 37
		breakActionModel[10].setRotationPoint(12F, -6F, 0F);

		breakActionModel[11].addShapeBox(3.5F, -9F, -0.5F, 12, 1, 1, 0F, 0F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 38
		breakActionModel[11].setRotationPoint(12F, -6F, 0F);

		breakActionModel[12].addBox(-6.5F, -6F, -3F, 5, 2, 6, 0F); // Box 44
		breakActionModel[12].setRotationPoint(12F, -6F, 0F);

		breakActionModel[13].addShapeBox(-6.5F, -8F, -3F, 5, 2, 6, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		breakActionModel[13].setRotationPoint(12F, -6F, 0F);

		breakActionModel[14].addShapeBox(-6.5F, -4F, -3F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 46
		breakActionModel[14].setRotationPoint(12F, -6F, 0F);

		breakActionModel[15].addShapeBox(13F, -10F, -0.5F, 2, 1, 1, 0F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 62
		breakActionModel[15].setRotationPoint(12F, -6F, 0F);

		breakActionModel[16].addShapeBox(-7.5F, -9F, -1.5F, 7, 1, 3, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 76
		breakActionModel[16].setRotationPoint(12F, -6F, 0F);

		breakActionModel[17].addShapeBox(1.5F, -9F, -1.5F, 4, 1, 3, 0F, 0F, 0F, -0.9F, -1F, -0.1F, -1F, -1F, -0.1F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.4F, 1.5F, 0F, -0.2F, 1.5F, 0F, -0.2F, 0F, 0F, -0.4F); // Box 77
		breakActionModel[17].setRotationPoint(12F, -6F, 0F);

		breakActionModel[18].addShapeBox(8F, -8F, -1.5F, 7, 1, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 78
		breakActionModel[18].setRotationPoint(12F, -6F, 0F);


		this.modelScale = 0.25F;

		translateAll = new Vector3f(0F, -2.95F, 0.0F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = 0.15F;
	    reloadAnimation = WeaponAnimations.PISTOL;
	    
		hasFlash = false;
	    
        leftArmPos = new Vector3f(0F, -0.65F, 0.12F);
        leftArmRot = new Vector3f(75.0F, 15.0F, -45.0F);
		leftArmReloadPos = new Vector3f(-0.1F, -0.60F, 0.1F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -35.0F);
 
        leftArmChargePos = new Vector3f(-0.27F, -0.40F, 0.07F);
        leftArmChargeRot = new Vector3f(75.0F, 15.0F, -45.0F);       
        
        rightArmPos = new Vector3f(0.5F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.53F, -0.5F, 0.015F);
        rightArmReloadRot = new Vector3f(0.0F, 8.0F, -85.0F);
        
        leftHandAmmo = true;
        
        rightArmScale = new Vector3f(0.6F, 0.8F, 0.6F);
        leftArmScale = new Vector3f(0.6F, 0.8F, 0.6F);
		//RecoilSlideDistance = 0.1F;
		//RotateSlideDistance = -2F;

		scopeIsOnSlide = false;
		slideLockOnEmpty = false;
	    
		casingAnimDistance = new Vector3f(-5, -1, 12);
	    casingAnimSpread = new Vector3f(2, 2, 0);
	    casingAnimTime = 8;  
	    casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);
	    
		crouchZoom = -0.15F;
		fancyStance = true;
		sprintRotate = new Vector3f(0.0F, -10.0F, 30.0F);
		sprintTranslate = new Vector3f(0.7F, 0.60F, 0.1F);
		
	    chargeHandleDistance = 0.15F;
	    chargeDelay = 0;
	    chargeDelayAfterReload = 65;
	    chargeTime = 20;
	    
	    actionArm = EnumArm.Left;
	    actionType = EnumAction.Charge;
	    
	    chargeModifier = new Vector3f (0.0F, 0.0F, 0.0F);
	    
		flipAll();
	}
}