//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: C96
// Model Creator: 
// Created on: 18.01.2016 - 15:54:15
// Last changed on: 18.01.2016 - 15:54:15

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class c96 extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 256;

	public c96() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[53];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 18
		gunModel[18] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 19
		gunModel[19] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 20
		gunModel[20] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 21
		gunModel[21] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 22
		gunModel[22] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 23
		gunModel[23] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 25
		gunModel[24] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 26
		gunModel[25] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 27
		gunModel[26] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 28
		gunModel[27] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		gunModel[28] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 30
		gunModel[29] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 31
		gunModel[30] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 32
		gunModel[31] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 33
		gunModel[32] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 34
		gunModel[33] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 35
		gunModel[34] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 37
		gunModel[35] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 38
		gunModel[36] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 42
		gunModel[37] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 43
		gunModel[38] = new ModelRendererTurbo(this, 40, 89, textureX, textureY); // Box 44
		gunModel[39] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 46
		gunModel[40] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 47
		gunModel[41] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 48
		gunModel[42] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 52
		gunModel[43] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 81
		gunModel[44] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 83
		gunModel[45] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 84
		gunModel[46] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 88
		gunModel[47] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 89
		gunModel[48] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 88
		gunModel[49] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 89
		gunModel[50] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 90
		gunModel[51] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 91
		gunModel[52] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 93

		gunModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F, -1F, 2F, -1.25F, 0F, 1F, -1.25F, 0F, 1F, -1.25F, -1F, 2F, -1.25F, -1.5F, -1F, -1.25F, -1F, 1F, -1.25F, -1F, 1F, -1.25F, -1.5F, -1F, -1.25F); // Box 0
		gunModel[0].setRotationPoint(-14F, 3F, -3F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F, -1.5F, 1F, -1.25F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, -1.5F, 1F, -1.25F, -3F, 0F, -1.25F, -2F, 1F, -1.25F, -2F, 1F, -1.25F, -3F, 0F, -1.25F); // Box 1
		gunModel[1].setRotationPoint(-14F, 4F, -3F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 12, 12, 6, 0F, -3.5F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, -3.5F, -1F, -1.25F, 3F, 2F, -1.25F, -4F, 3F, -1.25F, -4F, 3F, -1.25F, 3F, 2F, -1.25F); // Box 2
		gunModel[2].setRotationPoint(-10F, -13F, -3F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -3.5F, -1F, 0F, -3.5F, -1F, 0F, 0F, -1F, 0F); // Box 3
		gunModel[3].setRotationPoint(-6.5F, -12F, -3F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 13, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(-6.5F, -21F, -3F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 6
		gunModel[5].setRotationPoint(6.5F, -21F, -2.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[6].setRotationPoint(10.5F, -21F, -2.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 3, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[7].setRotationPoint(7.5F, -21F, -2.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 9
		gunModel[8].setRotationPoint(6.5F, -15F, -3F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[9].setRotationPoint(7.5F, -15F, -3F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[10].setRotationPoint(10.5F, -15F, -3F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 12
		gunModel[11].setRotationPoint(-7.5F, -22F, -3F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 9, 13, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[12].setRotationPoint(12.5F, -21F, -3F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 14
		gunModel[13].setRotationPoint(21.5F, -21F, -3F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 15
		gunModel[14].setRotationPoint(12.5F, -8F, -3F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0.2F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0F, 0F, 0.2F); // Box 16
		gunModel[15].setRotationPoint(21.5F, -8F, -3F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.6F, 0.3F, 0F, -0.6F, 0.3F, 0F, -0.6F, 0.3F, 0F, -0.6F, 0.3F); // Box 17
		gunModel[16].setRotationPoint(-7.5F, -22F, -3F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.6F, 0.3F, 0F, -0.6F, 0.3F, 0F, -0.6F, 0.3F, 0F, -0.6F, 0.3F); // Box 18
		gunModel[17].setRotationPoint(-7.5F, -21.3F, -3F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -0.01F, -0.35F, 0.3F, -0.01F, -0.35F, 0.3F, -0.01F, -0.35F, 0.3F, -0.01F, -0.35F, 0.3F, -0.01F, -0.35F, 0.3F, -0.01F, -0.35F, 0.3F, -0.01F, -0.35F, 0.3F, -0.01F, -0.35F, 0.3F); // Box 19
		gunModel[18].setRotationPoint(-7.5F, -22F, -3F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, -0.35F, 0.3F, 0F, -0.35F, 0.3F, 0F, -0.35F, 0.3F, 0F, -0.35F, 0.3F, 0F, -0.35F, 0.3F, 0F, -0.35F, 0.3F, 0F, -0.35F, 0.3F, 0F, -0.35F, 0.3F); // Box 20
		gunModel[19].setRotationPoint(5.5F, -22F, -3F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0.1F, -0.35F, 0.3F, 0.1F, -0.35F, 0.3F, 0.1F, -0.35F, 0.3F, 0.1F, -0.35F, 0.3F, 0.1F, -0.35F, 0.3F, 0.1F, -0.35F, 0.3F, 0.1F, -0.35F, 0.3F, 0.1F, -0.35F, 0.3F); // Box 21
		gunModel[20].setRotationPoint(20.5F, -22F, -3F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 6, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[21].setRotationPoint(-2.5F, -26F, -3F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 23
		gunModel[22].setRotationPoint(3.5F, -26F, -3F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[23].setRotationPoint(4.5F, -26F, -2F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 26
		gunModel[24].setRotationPoint(12.5F, -26F, -2.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 27
		gunModel[25].setRotationPoint(14.5F, -26F, -2.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 28
		gunModel[26].setRotationPoint(17.5F, -25F, -2.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 29
		gunModel[27].setRotationPoint(16.5F, -24F, -2.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 2F, 0.3F); // Box 30
		gunModel[28].setRotationPoint(19.5F, -25F, -2.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 2F, 0.3F); // Box 31
		gunModel[29].setRotationPoint(19.5F, -25F, 1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 32
		gunModel[30].setRotationPoint(17.5F, -25F, 1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 33
		gunModel[31].setRotationPoint(16.5F, -24F, 1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 34
		gunModel[32].setRotationPoint(14.5F, -26F, 1.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.4F); // Box 35
		gunModel[33].setRotationPoint(12.5F, -26F, 1.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 37
		gunModel[34].setRotationPoint(20.5F, -26F, -2F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 1F, -0.3F); // Box 38
		gunModel[35].setRotationPoint(21.5F, -24F, -1.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 42
		gunModel[36].setRotationPoint(7.5F, -8F, -2F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, 1.8F, 0F, 0.5F, -2.2F, 0F, 0.5F, -2.2F, 0F, -0.5F, 1.8F, 0F, 0F, -2.2F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, -2.2F, 0F); // Box 43
		gunModel[37].setRotationPoint(3.5F, -11F, -2F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 44
		gunModel[38].setRotationPoint(-8.5F, -21F, -3F);

		gunModel[39].addShapeBox(-2F, -6F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 46
		gunModel[39].setRotationPoint(-5.5F, -18F, -1F);
		gunModel[39].rotateAngleZ = 0.99483767F;

		gunModel[40].addShapeBox(-2F, -7F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[40].setRotationPoint(-5.5F, -18F, -1F);
		gunModel[40].rotateAngleZ = 0.99483767F;

		gunModel[41].addShapeBox(0F, -5F, 0F, 1, 5, 2, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[41].setRotationPoint(-5.5F, -18F, -1F);
		gunModel[41].rotateAngleZ = 0.99483767F;

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		gunModel[42].setRotationPoint(7.5F, -13.5F, -1F);
		gunModel[42].rotateAngleZ = 0.17453293F;

		gunModel[43].addShapeBox(0F, 0F, 0F, 12, 12, 6, 0F, -3.5F, -1F, -2.25F, 0F, -1F, -2.25F, -2F, -1F, -2.25F, -5.5F, -1F, -2.25F, 3F, 2F, -2.25F, -4F, 3F, -2.25F, -6F, 3F, -2.25F, 1F, 2F, -2.25F); // Box 81
		gunModel[43].setRotationPoint(-10F, -13F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F, -1F, 2F, -2.25F, 0F, 1F, -2.25F, -2F, 1F, -2.25F, -3F, 2F, -2.25F, -1.5F, -1F, -2.25F, -1F, 1F, -2.25F, -3F, 1F, -2.25F, -3.5F, -1F, -2.25F); // Box 83
		gunModel[44].setRotationPoint(-14F, 3F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F, -1.5F, 1F, -2.25F, 0F, -1F, -2.25F, -2F, -1F, -2.25F, -3.5F, 1F, -2.25F, -3F, 0F, -2.25F, -2F, 1F, -2.25F, -4F, 0F, -2.25F, -5F, 0F, -2.25F); // Box 84
		gunModel[45].setRotationPoint(-14F, 4F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F, -3F, 2F, -2.25F, -2F, 1F, -2.25F, 0F, 1F, -2.25F, -1F, 2F, -2.25F, -3.5F, -1F, -2.25F, -3F, 1F, -2.25F, -1F, 1F, -2.25F, -1.5F, -1F, -2.25F); // Box 88
		gunModel[46].setRotationPoint(-14F, 3F, -5.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F, -3.5F, 1F, -2.25F, -2F, -1F, -2.25F, 0F, -1F, -2.25F, -1.5F, 1F, -2.25F, -5F, 0F, -2.25F, -4F, 0F, -2.25F, -2F, 1F, -2.25F, -3F, 0F, -2.25F); // Box 89
		gunModel[47].setRotationPoint(-14F, 4F, -5.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0F); // Box 88
		gunModel[48].setRotationPoint(5.5F, -8F, -2F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 89
		gunModel[49].setRotationPoint(10.5F, -8F, -2F);

		gunModel[50].addShapeBox(-2F, -8F, 0F, 3, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		gunModel[50].setRotationPoint(-5.5F, -18F, -1F);
		gunModel[50].rotateAngleZ = 0.99483767F;

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		gunModel[51].setRotationPoint(-10.5F, -21.5F, 1F);
		gunModel[51].rotateAngleZ = 0.99483767F;

		gunModel[52].addShapeBox(0F, 0F, 0F, 12, 12, 6, 0F, -5.5F, -1F, -2.25F, -2F, -1F, -2.25F, 0F, -1F, -2.25F, -3.5F, -1F, -2.25F, 1F, 2F, -2.25F, -6F, 3F, -2.25F, -4F, 3F, -2.25F, 3F, 2F, -2.25F); // Box 93
		gunModel[52].setRotationPoint(-10F, -13F, -5.5F);


		defaultBarrelModel = new ModelRendererTurbo[4];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 40
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 41
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 58
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 59

		defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F, 0F, 0.7F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.7F, 0.7F); // Box 40
		defaultBarrelModel[0].setRotationPoint(23.5F, -25F, -1.5F);

		defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F, 0F, -0.3F, -0.3F, 12F, -0.3F, -0.3F, 12F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 12F, -0.3F, -0.3F, 12F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 41
		defaultBarrelModel[1].setRotationPoint(31.5F, -25F, -1.5F);

		defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 58
		defaultBarrelModel[2].setRotationPoint(53F, -27.5F, -0.5F);

		defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 59
		defaultBarrelModel[3].setRotationPoint(53F, -25.8F, -0.5F);


		defaultScopeModel = new ModelRendererTurbo[7];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 53
		defaultScopeModel[1] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 54
		defaultScopeModel[2] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 55
		defaultScopeModel[3] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 56
		defaultScopeModel[4] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 57
		defaultScopeModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 60
		defaultScopeModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 61

		defaultScopeModel[0].addShapeBox(-1F, -0.5F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 53
		defaultScopeModel[0].setRotationPoint(10.5F, -26.3F, -2F);
		defaultScopeModel[0].rotateAngleZ = -0.01745329F;

		defaultScopeModel[1].addShapeBox(-12F, -0.5F, 0F, 9, 1, 3, 0F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F); // Box 54
		defaultScopeModel[1].setRotationPoint(12.5F, -26.3F, -1.5F);
		defaultScopeModel[1].rotateAngleZ = -0.01745329F;

		defaultScopeModel[2].addShapeBox(-14F, -0.55F, 0F, 2, 1, 3, 0F, 0.1F, -0.05F, 0.4F, 0.1F, -0.05F, 0.4F, 0.1F, -0.05F, 0.4F, 0.1F, -0.05F, 0.4F, 0.1F, -0.05F, 0.4F, 0.1F, -0.05F, 0.4F, 0.1F, -0.05F, 0.4F, 0.1F, -0.05F, 0.4F); // Box 55
		defaultScopeModel[2].setRotationPoint(12.5F, -26.3F, -1.5F);
		defaultScopeModel[2].rotateAngleZ = -0.01745329F;

		defaultScopeModel[3].addShapeBox(-14F, -1.5F, 0F, 2, 1, 1, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 56
		defaultScopeModel[3].setRotationPoint(12.5F, -26.2F, -1.5F);
		defaultScopeModel[3].rotateAngleZ = -0.01745329F;

		defaultScopeModel[4].addShapeBox(-14F, -1.5F, 0F, 2, 1, 1, 0F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 57
		defaultScopeModel[4].setRotationPoint(12.5F, -26.2F, 0.5F);
		defaultScopeModel[4].rotateAngleZ = -0.01745329F;

		defaultScopeModel[5].addShapeBox(-1F, -0.5F, 0F, 1, 1, 1, 0F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F); // Box 60
		defaultScopeModel[5].setRotationPoint(10.5F, -26.3F, -2F);
		defaultScopeModel[5].rotateAngleZ = -0.01745329F;

		defaultScopeModel[6].addShapeBox(-1F, -0.5F, 0F, 1, 1, 1, 0F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F); // Box 61
		defaultScopeModel[6].setRotationPoint(10.5F, -26.3F, 1F);
		defaultScopeModel[6].rotateAngleZ = -0.01745329F;


		ammoModel = new ModelRendererTurbo[20];
		ammoModel[0] = new ModelRendererTurbo(this, 3, 103, textureX, textureY); // Box 65
		ammoModel[1] = new ModelRendererTurbo(this, 3, 103, textureX, textureY); // Box 66
		ammoModel[2] = new ModelRendererTurbo(this, 3, 103, textureX, textureY); // Box 67
		ammoModel[3] = new ModelRendererTurbo(this, 3, 103, textureX, textureY); // Box 68
		ammoModel[4] = new ModelRendererTurbo(this, 3, 103, textureX, textureY); // Box 69
		ammoModel[5] = new ModelRendererTurbo(this, 3, 103, textureX, textureY); // Box 70
		ammoModel[6] = new ModelRendererTurbo(this, 3, 103, textureX, textureY); // Box 71
		ammoModel[7] = new ModelRendererTurbo(this, 3, 103, textureX, textureY); // Box 72
		ammoModel[8] = new ModelRendererTurbo(this, 3, 107, textureX, textureY); // Box 81
		ammoModel[9] = new ModelRendererTurbo(this, 3, 103, textureX, textureY); // Box 82
		ammoModel[10] = new ModelRendererTurbo(this, 3, 103, textureX, textureY); // Box 83
		ammoModel[11] = new ModelRendererTurbo(this, 3, 103, textureX, textureY); // Box 84
		ammoModel[12] = new ModelRendererTurbo(this, 3, 103, textureX, textureY); // Box 85
		ammoModel[13] = new ModelRendererTurbo(this, 3, 103, textureX, textureY); // Box 86
		ammoModel[14] = new ModelRendererTurbo(this, 3, 103, textureX, textureY); // Box 87
		ammoModel[15] = new ModelRendererTurbo(this, 3, 103, textureX, textureY); // Box 88
		ammoModel[16] = new ModelRendererTurbo(this, 3, 103, textureX, textureY); // Box 89
		ammoModel[17] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 94
		ammoModel[18] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 92
		ammoModel[19] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 93

		ammoModel[0].addShapeBox(13.4F, -10F, -1F, 7, 2, 2, 0F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F); // Box 65
		ammoModel[0].setRotationPoint(0F, 0F, 0F);

		ammoModel[1].addShapeBox(16.4F, -10F, -1F, 7, 2, 2, 0F, -3F, -0.2F, -0.2F, -2F, -0.8F, -0.8F, -2F, -0.8F, -0.8F, -3F, -0.2F, -0.2F, -3F, -0.2F, -0.2F, -2F, -0.8F, -0.8F, -2F, -0.8F, -0.8F, -3F, -0.2F, -0.2F); // Box 66
		ammoModel[1].setRotationPoint(0F, 0F, 0F);

		ammoModel[2].addShapeBox(16.4F, -12F, -1F, 7, 2, 2, 0F, -3F, -0.2F, -0.2F, -2F, -0.8F, -0.8F, -2F, -0.8F, -0.8F, -3F, -0.2F, -0.2F, -3F, -0.2F, -0.2F, -2F, -0.8F, -0.8F, -2F, -0.8F, -0.8F, -3F, -0.2F, -0.2F); // Box 67
		ammoModel[2].setRotationPoint(0F, 0F, 0F);

		ammoModel[3].addShapeBox(13.4F, -12F, -1F, 7, 2, 2, 0F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F); // Box 68
		ammoModel[3].setRotationPoint(0F, 0F, 0F);

		ammoModel[4].addShapeBox(13.4F, -14F, -1F, 7, 2, 2, 0F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F); // Box 69
		ammoModel[4].setRotationPoint(0F, 0F, 0F);

		ammoModel[5].addShapeBox(16.4F, -14F, -1F, 7, 2, 2, 0F, -3F, -0.2F, -0.2F, -2F, -0.8F, -0.8F, -2F, -0.8F, -0.8F, -3F, -0.2F, -0.2F, -3F, -0.2F, -0.2F, -2F, -0.8F, -0.8F, -2F, -0.8F, -0.8F, -3F, -0.2F, -0.2F); // Box 70
		ammoModel[5].setRotationPoint(0F, 0F, 0F);

		ammoModel[6].addShapeBox(16.4F, -16F, -1F, 7, 2, 2, 0F, -3F, -0.2F, -0.2F, -2F, -0.8F, -0.8F, -2F, -0.8F, -0.8F, -3F, -0.2F, -0.2F, -3F, -0.2F, -0.2F, -2F, -0.8F, -0.8F, -2F, -0.8F, -0.8F, -3F, -0.2F, -0.2F); // Box 71
		ammoModel[6].setRotationPoint(0F, 0F, 0F);

		ammoModel[7].addShapeBox(13.4F, -16F, -1F, 7, 2, 2, 0F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F); // Box 72
		ammoModel[7].setRotationPoint(0F, 0F, 0F);

		ammoModel[8].addShapeBox(13.4F, -24.5F, -1F, 1, 17, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 81
		ammoModel[8].setRotationPoint(0F, 0F, 0F);

		ammoModel[9].addShapeBox(13.4F, -18F, -1F, 7, 2, 2, 0F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F); // Box 82
		ammoModel[9].setRotationPoint(0F, 0F, 0F);

		ammoModel[10].addShapeBox(16.4F, -18F, -1F, 7, 2, 2, 0F, -3F, -0.2F, -0.2F, -2F, -0.8F, -0.8F, -2F, -0.8F, -0.8F, -3F, -0.2F, -0.2F, -3F, -0.2F, -0.2F, -2F, -0.8F, -0.8F, -2F, -0.8F, -0.8F, -3F, -0.2F, -0.2F); // Box 83
		ammoModel[10].setRotationPoint(0F, 0F, 0F);

		ammoModel[11].addShapeBox(13.4F, -20F, -1F, 7, 2, 2, 0F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F); // Box 84
		ammoModel[11].setRotationPoint(0F, 0F, 0F);

		ammoModel[12].addShapeBox(16.4F, -20F, -1F, 7, 2, 2, 0F, -3F, -0.2F, -0.2F, -2F, -0.8F, -0.8F, -2F, -0.8F, -0.8F, -3F, -0.2F, -0.2F, -3F, -0.2F, -0.2F, -2F, -0.8F, -0.8F, -2F, -0.8F, -0.8F, -3F, -0.2F, -0.2F); // Box 85
		ammoModel[12].setRotationPoint(0F, 0F, 0F);

		ammoModel[13].addShapeBox(13.4F, -24F, -1F, 7, 2, 2, 0F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F); // Box 86
		ammoModel[13].setRotationPoint(0F, 0F, 0F);

		ammoModel[14].addShapeBox(16.4F, -24F, -1F, 7, 2, 2, 0F, -3F, -0.2F, -0.2F, -2F, -0.8F, -0.8F, -2F, -0.8F, -0.8F, -3F, -0.2F, -0.2F, -3F, -0.2F, -0.2F, -2F, -0.8F, -0.8F, -2F, -0.8F, -0.8F, -3F, -0.2F, -0.2F); // Box 87
		ammoModel[14].setRotationPoint(0F, 0F, 0F);

		ammoModel[15].addShapeBox(16.4F, -22F, -1F, 7, 2, 2, 0F, -3F, -0.2F, -0.2F, -2F, -0.8F, -0.8F, -2F, -0.8F, -0.8F, -3F, -0.2F, -0.2F, -3F, -0.2F, -0.2F, -2F, -0.8F, -0.8F, -2F, -0.8F, -0.8F, -3F, -0.2F, -0.2F); // Box 88
		ammoModel[15].setRotationPoint(0F, 0F, 0F);

		ammoModel[16].addShapeBox(13.4F, -22F, -1F, 7, 2, 2, 0F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F); // Box 89
		ammoModel[16].setRotationPoint(0F, 0F, 0F);

		ammoModel[17].addShapeBox(13F, -9.9F, -3F, 9, 12, 6, 0F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F); // Box 94
		ammoModel[17].setRotationPoint(0F, -9F, 0F);

		ammoModel[18].addShapeBox(0F, 0.8F, 0F, 1, 1, 6, 0F, 0F, -0.3F, 0.1F, 0.1F, -0.3F, -0.9F, 0.1F, -0.3F, -0.9F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0.1F, -0.3F, -0.9F, 0.1F, -0.3F, -0.9F, 0F, -0.3F, 0.1F); // Box 92
		ammoModel[18].setRotationPoint(21.5F, -8F, -3F);

		ammoModel[19].addShapeBox(0F, 0.8F, 0F, 9, 1, 6, 0F, 0.2F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F); // Box 93
		ammoModel[19].setRotationPoint(12.5F, -8F, -3F);


		slideModel = new ModelRendererTurbo[6];
		slideModel[0] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 36
		slideModel[1] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 50
		slideModel[2] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 62
		slideModel[3] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 63
		slideModel[4] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 92
		slideModel[5] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 95

		slideModel[0].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 36
		slideModel[0].setRotationPoint(12.5F, -25.5F, -1.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 50
		slideModel[1].setRotationPoint(-4.5F, -26F, -3F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 62
		slideModel[2].setRotationPoint(12.5F, -25.6F, -1.1F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 63
		slideModel[3].setRotationPoint(12.5F, -25.6F, 0.1F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 92
		slideModel[4].setRotationPoint(-3.5F, -26F, -3F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 95
		slideModel[5].setRotationPoint(-2.5F, -25.5F, -1.5F);


		this.modelScale = 0.15F;

		translateAll = new Vector3f(0F, -15F, 0.0F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = 0.7F;
	    reloadAnimation = WeaponAnimations.PISTOL;
	    
		hasFlash = false;
	    
        leftArmPos = new Vector3f(-0.1F, -0.65F, 0.12F);
        leftArmRot = new Vector3f(75.0F, 15.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.1F, -0.60F, 0.1F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -35.0F);
 
        rightArmPos = new Vector3f(0.4F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.4F, -0.52F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -85.0F);
        
        rightArmChargePos = new Vector3f(0.2F, -0.42F, 0.0F);
        rightArmChargeRot = new Vector3f(0.0F, 0.0F, -85.0F);
        
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
		sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
		sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);
		
	    chargeHandleDistance = 0.7F;
	    chargeDelay = 0;
	    chargeDelayAfterReload = 65;
	    chargeTime = 20;
	    
	    actionArm = EnumArm.Right;
	    actionType = EnumAction.Charge;
	    
	    chargeModifier = new Vector3f (0.0F, 0.0F, 0.0F);
	    
		flipAll();
	}
}