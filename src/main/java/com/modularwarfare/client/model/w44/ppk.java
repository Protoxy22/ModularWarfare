//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.11.2017 - 20:38:31
// Last changed on: 07.11.2017 - 20:38:31

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class ppk extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 256;

	public ppk() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[64];
		gunModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 22
		gunModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 23
		gunModel[2] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 24
		gunModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 25
		gunModel[4] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 26
		gunModel[5] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 27
		gunModel[6] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 28
		gunModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 29
		gunModel[8] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 30
		gunModel[9] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 34
		gunModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 35
		gunModel[11] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 36
		gunModel[12] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 37
		gunModel[13] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 38
		gunModel[14] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 39
		gunModel[15] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 40
		gunModel[16] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 41
		gunModel[17] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 42
		gunModel[18] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 43
		gunModel[19] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 44
		gunModel[20] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 45
		gunModel[21] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 46
		gunModel[22] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 47
		gunModel[23] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 48
		gunModel[24] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 63
		gunModel[25] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 64
		gunModel[26] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 65
		gunModel[27] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 66
		gunModel[28] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 67
		gunModel[29] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 68
		gunModel[30] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 71
		gunModel[31] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 76
		gunModel[32] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 77
		gunModel[33] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 78
		gunModel[34] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 79
		gunModel[35] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 80
		gunModel[36] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 81
		gunModel[37] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 82
		gunModel[38] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 83
		gunModel[39] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 84
		gunModel[40] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 85
		gunModel[41] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 86
		gunModel[42] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 62
		gunModel[43] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 63
		gunModel[44] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 64
		gunModel[45] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 65
		gunModel[46] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 66
		gunModel[47] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 65
		gunModel[48] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 66
		gunModel[49] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 67
		gunModel[50] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 68
		gunModel[51] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 69
		gunModel[52] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 70
		gunModel[53] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 71
		gunModel[54] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 72
		gunModel[55] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 73
		gunModel[56] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 74
		gunModel[57] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 75
		gunModel[58] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 78
		gunModel[59] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 79
		gunModel[60] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 80
		gunModel[61] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 99
		gunModel[62] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 100
		gunModel[63] = new ModelRendererTurbo(this, 84, 120, textureX, textureY); // Box 101

		gunModel[0].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 22
		gunModel[0].setRotationPoint(-9.5F, -9F, -2.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, -2.5F, 0F, 0F, 4F, 0F, 0F); // Box 23
		gunModel[1].setRotationPoint(-9.5F, 1F, -2.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 3F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, -3.5F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F); // Box 24
		gunModel[2].setRotationPoint(-9.5F, 3F, -2.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 3F, 0F, 0F, -2.8F, 0F, 0F, -1.8F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 25
		gunModel[3].setRotationPoint(-5.5F, -10F, -2.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 3F, 0F, 0F, -2.55F, 0F, 0F, -1.55F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -2.8F, 0F, 0F, -1.8F, 0F, 0F, 4F, 0F, 0F); // Box 26
		gunModel[4].setRotationPoint(-5.5F, -11F, -2.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 2.7F, 0F, 0F, -2.55F, 0F, 0F, -1.55F, 0F, 0F, 3.7F, 0F, 0F, 2.25F, 0F, 0F, -2.8F, 0F, 0F, -1.8F, 0F, 0F, 3.25F, 0F, 0F); // Box 27
		gunModel[5].setRotationPoint(-6.25F, -12F, -2.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 3.7F, 0F, 0F, -2.55F, 0F, 0F, -1.55F, 0F, 0F, 4.7F, 0F, 0F, 2.95F, 0F, 0F, -2.8F, 0F, 0F, -1.8F, 0F, 0F, 3.95F, 0F, 0F); // Box 28
		gunModel[6].setRotationPoint(-6F, -13F, -2.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 3.7F, 0F, 0F, -2.25F, 0F, 0F, -1.55F, 0F, 0F, 4.7F, 0F, 0F, 3.95F, 0F, 0F, -2.8F, 0F, 0F, -1.8F, 0F, 0F, 4.95F, 0F, 0F); // Box 29
		gunModel[7].setRotationPoint(-5.75F, -14F, -2.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 30
		gunModel[8].setRotationPoint(-8F, -18F, -2.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[9].setRotationPoint(1F, -15F, -2.5F);

		gunModel[10].addBox(0F, 0F, 0F, 18, 2, 3, 0F); // Box 35
		gunModel[10].setRotationPoint(-1F, -14F, -1.5F);

		gunModel[11].addBox(0F, 0F, 0F, 5, 6, 3, 0F); // Box 36
		gunModel[11].setRotationPoint(-2F, -12F, -1.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 10, 3, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F); // Box 37
		gunModel[12].setRotationPoint(-2F, -6F, -1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[13].setRotationPoint(3F, -12F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 2F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F); // Box 39
		gunModel[14].setRotationPoint(0F, -8F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 40
		gunModel[15].setRotationPoint(3F, -9F, -1.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[16].setRotationPoint(3F, -11F, -1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[17].setRotationPoint(3F, -7.5F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[18].setRotationPoint(3F, -7F, -1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[19].setRotationPoint(14F, -12F, -1.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 45
		gunModel[20].setRotationPoint(10F, -12F, -1.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[21].setRotationPoint(12F, -12F, -1.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[22].setRotationPoint(17F, -14F, -1.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 48
		gunModel[23].setRotationPoint(20F, -14F, -1.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		gunModel[24].setRotationPoint(0F, -6.5F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[25].setRotationPoint(3F, -7.5F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[26].setRotationPoint(5F, -6.5F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 66
		gunModel[27].setRotationPoint(12F, -11F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 67
		gunModel[28].setRotationPoint(12F, -9F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F); // Box 68
		gunModel[29].setRotationPoint(11F, -7F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 23, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[30].setRotationPoint(1F, -18.9F, -1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 76
		gunModel[31].setRotationPoint(-14F, -14F, -1.5F);

		gunModel[32].addShapeBox(0F, -1F, 0F, 2, 3, 3, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		gunModel[32].setRotationPoint(-12F, -17F, -1.5F);

		gunModel[33].addShapeBox(0F, -1F, 0F, 3, 1, 3, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		gunModel[33].setRotationPoint(-14F, -14F, -1.5F);

		gunModel[34].addShapeBox(-9F, -22F, -1F, 2, 1, 2, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		gunModel[34].setRotationPoint(-16.95F, 4.5F, 0F);
		gunModel[34].rotateAngleZ = -0.62831853F;

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 80
		gunModel[35].setRotationPoint(5F, -12F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 81
		gunModel[36].setRotationPoint(5F, -11F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 82
		gunModel[37].setRotationPoint(7F, -12F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 83
		gunModel[38].setRotationPoint(6F, -10F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 84
		gunModel[39].setRotationPoint(6.5F, -10F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 85
		gunModel[40].setRotationPoint(6F, -9F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 86
		gunModel[41].setRotationPoint(7F, -8F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 9, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 62
		gunModel[42].setRotationPoint(-10F, -9F, -1.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 4F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 63
		gunModel[43].setRotationPoint(-6F, -10F, -1.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 4F, 0F, 0F, -1.55F, 0F, 0F, -1.55F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 4F, 0F, 0F); // Box 64
		gunModel[44].setRotationPoint(-6F, -11F, -1.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 4.7F, 0F, 0F, -1.55F, 0F, 0F, -1.55F, 0F, 0F, 4.7F, 0F, 0F, 3.95F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 3.95F, 0F, 0F); // Box 65
		gunModel[45].setRotationPoint(-6.5F, -13F, -1.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 4.7F, 0F, 0F, -1.55F, 0F, 0F, -1.55F, 0F, 0F, 4.7F, 0F, 0F, 4.95F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 4.95F, 0F, 0F); // Box 66
		gunModel[46].setRotationPoint(-6.25F, -14F, -1.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 4F, 0F, 0F); // Box 65
		gunModel[47].setRotationPoint(-10F, 1F, -1.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 3.7F, 0F, 0F, -1.55F, 0F, 0F, -1.55F, 0F, 0F, 3.7F, 0F, 0F, 3.25F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 3.25F, 0F, 0F); // Box 66
		gunModel[48].setRotationPoint(-6.75F, -12F, -1.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 3F, 0F, 0F); // Box 67
		gunModel[49].setRotationPoint(-10F, 3F, -1.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 68
		gunModel[50].setRotationPoint(-9.5F, -9F, 1.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F); // Box 69
		gunModel[51].setRotationPoint(-9.5F, 1F, 1.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 4F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, 0F, 0F, 2F, 0F, 0F); // Box 70
		gunModel[52].setRotationPoint(-9.5F, 3F, 1.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 4F, 0F, 0F, -1.8F, 0F, 0F, -2.8F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 71
		gunModel[53].setRotationPoint(-5.5F, -10F, 1.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 4F, 0F, 0F, -1.55F, 0F, 0F, -2.55F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, -1.8F, 0F, 0F, -2.8F, 0F, 0F, 3F, 0F, 0F); // Box 72
		gunModel[54].setRotationPoint(-5.5F, -11F, 1.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 3.7F, 0F, 0F, -1.55F, 0F, 0F, -2.55F, 0F, 0F, 2.7F, 0F, 0F, 3.25F, 0F, 0F, -1.8F, 0F, 0F, -2.8F, 0F, 0F, 2.25F, 0F, 0F); // Box 73
		gunModel[55].setRotationPoint(-6.25F, -12F, 1.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 4.7F, 0F, 0F, -1.55F, 0F, 0F, -2.55F, 0F, 0F, 3.7F, 0F, 0F, 3.95F, 0F, 0F, -1.8F, 0F, 0F, -2.8F, 0F, 0F, 2.95F, 0F, 0F); // Box 74
		gunModel[56].setRotationPoint(-6F, -13F, 1.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 4.7F, 0F, 0F, -1.55F, 0F, 0F, -2.25F, 0F, 0F, 3.7F, 0F, 0F, 4.95F, 0F, 0F, -1.8F, 0F, 0F, -2.8F, 0F, 0F, 3.95F, 0F, 0F); // Box 75
		gunModel[57].setRotationPoint(-5.75F, -14F, 1.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 78
		gunModel[58].setRotationPoint(0F, -15F, -2.5F);

		gunModel[59].addShapeBox(-9F, -20F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 79
		gunModel[59].setRotationPoint(-16.95F, 4.5F, 0F);
		gunModel[59].rotateAngleZ = -0.62831853F;

		gunModel[60].addShapeBox(-9F, -21F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 80
		gunModel[60].setRotationPoint(-16.95F, 4.5F, 0F);
		gunModel[60].rotateAngleZ = -0.62831853F;

		gunModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F); // Box 99
		gunModel[61].setRotationPoint(-0.25F, -12.2F, -2F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 100
		gunModel[62].setRotationPoint(-0.25F, -12.85F, -2F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F); // Box 101
		gunModel[63].setRotationPoint(-0.25F, -13.5F, -2F);


		ammoModel = new ModelRendererTurbo[4];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		ammoModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		ammoModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		ammoModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 3

		ammoModel[0].addShapeBox(-5.5F, -17F, -2F, 7, 18, 3, 0F, 0.5F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0.5F, -2F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F); // Box 0
		ammoModel[0].setRotationPoint(-3F, 3F, 0.5F);
		ammoModel[0].rotateAngleZ = -0.06981317F;

		ammoModel[1].addShapeBox(-5.5F, -6.05F, -2.5F, 6, 7, 4, 0F, 1.5F, -7F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 1.5F, -7F, 0F, 1.5F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1.5F, 1F, 0F); // Box 1
		ammoModel[1].setRotationPoint(-4F, 3F, 0.5F);
		ammoModel[1].rotateAngleZ = -0.06981317F;

		ammoModel[2].addShapeBox(-5F, -18F, -1.5F, 4, 4, 2, 0F, 0.5F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 2
		ammoModel[2].setRotationPoint(-3F, 3F, 0.5F);
		ammoModel[2].rotateAngleZ = -0.06981317F;

		ammoModel[3].addShapeBox(-1.5F, -18F, -1.5F, 2, 4, 2, 0F, 0.5F, -2F, 0F, -1F, -2.5F, -0.5F, -1F, -2.5F, -0.5F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0.5F, 0F, 0F); // Box 3
		ammoModel[3].setRotationPoint(-3F, 3F, 0.5F);
		ammoModel[3].rotateAngleZ = -0.06981317F;


		slideModel = new ModelRendererTurbo[34];
		slideModel[0] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 3
		slideModel[1] = new ModelRendererTurbo(this, 1, 30, textureX, textureY); // Box 31
		slideModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 32
		slideModel[3] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 33
		slideModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 4
		slideModel[5] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 49
		slideModel[6] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 5
		slideModel[7] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 6
		slideModel[8] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 69
		slideModel[9] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 74
		slideModel[10] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 75
		slideModel[11] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 88
		slideModel[12] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 89
		slideModel[13] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 90
		slideModel[14] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 81
		slideModel[15] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 82
		slideModel[16] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 83
		slideModel[17] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 84
		slideModel[18] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 85
		slideModel[19] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 86
		slideModel[20] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 87
		slideModel[21] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 88
		slideModel[22] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 89
		slideModel[23] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 92
		slideModel[24] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 93
		slideModel[25] = new ModelRendererTurbo(this, 88, 95, textureX, textureY); // Box 94
		slideModel[26] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 95
		slideModel[27] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 96
		slideModel[28] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 97
		slideModel[29] = new ModelRendererTurbo(this, 37, 89, textureX, textureY); // Box 102
		slideModel[30] = new ModelRendererTurbo(this, 5, 89, textureX, textureY); // Box 103
		slideModel[31] = new ModelRendererTurbo(this, 59, 118, textureX, textureY); // Box 104
		slideModel[32] = new ModelRendererTurbo(this, 13, 118, textureX, textureY); // Box 105
		slideModel[33] = new ModelRendererTurbo(this, 37, 117, textureX, textureY); // Box 106

		slideModel[0].addShapeBox(0F, 0F, 0F, 31, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		slideModel[0].setRotationPoint(-8F, -20F, 0.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 31, 2, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		slideModel[1].setRotationPoint(-8F, -20F, -2.5F);

		slideModel[2].addBox(0F, 0F, 0F, 21, 3, 1, 0F); // Box 32
		slideModel[2].setRotationPoint(0F, -18F, -2.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 33
		slideModel[3].setRotationPoint(21F, -18F, -2.5F);

		slideModel[4].addBox(0F, 0F, 0F, 21, 3, 1, 0F); // Box 4
		slideModel[4].setRotationPoint(0F, -18F, 1.5F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 31, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		slideModel[5].setRotationPoint(-8F, -20F, -0.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 5
		slideModel[6].setRotationPoint(21F, -18F, 1.5F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		slideModel[7].setRotationPoint(1F, -15F, 1.5F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 69
		slideModel[8].setRotationPoint(21F, -17F, -1.5F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		slideModel[9].setRotationPoint(-12F, -18F, -2.5F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 75
		slideModel[10].setRotationPoint(-11F, -20F, -2.5F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		slideModel[11].setRotationPoint(-7F, -21.25F, 0.25F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 89
		slideModel[12].setRotationPoint(20F, -21.25F, -0.5F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		slideModel[13].setRotationPoint(-7F, -21.25F, -1.25F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.35F, 0.5F, 0.2F, -0.35F, 0.5F, 0.2F, -0.35F, 0.5F, 0.2F, -0.35F, 0.5F); // Box 81
		slideModel[14].setRotationPoint(-7F, -20.5F, -1F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2.8F, 0F, -0.3F, -2.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 82
		slideModel[15].setRotationPoint(-7.4F, -18F, -2.5F);

		slideModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2.5F, 0F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 83
		slideModel[16].setRotationPoint(-8F, -18F, -2.5F);

		slideModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -3F, 0F, -0.3F, -3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 84
		slideModel[17].setRotationPoint(-6.8F, -18F, -2.5F);

		slideModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2.5F, 0F, -0.3F, -2.8F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 85
		slideModel[18].setRotationPoint(-6.2F, -18F, -2.5F);

		slideModel[19].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1.5F, 0F, -0.3F, -1.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 86
		slideModel[19].setRotationPoint(-4.4F, -18F, -2.5F);

		slideModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1.5F, 0F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 87
		slideModel[20].setRotationPoint(-5F, -18F, -2.5F);

		slideModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 88
		slideModel[21].setRotationPoint(-3.8F, -18F, -2.5F);

		slideModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2F, 0F, -0.3F, -2.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 89
		slideModel[22].setRotationPoint(-5.6F, -18F, -2.5F);

		slideModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 92
		slideModel[23].setRotationPoint(-2F, -18F, -2.5F);

		slideModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 93
		slideModel[24].setRotationPoint(-2.6F, -18F, -2.5F);

		slideModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 94
		slideModel[25].setRotationPoint(-3.2F, -18F, -2.5F);

		slideModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 95
		slideModel[26].setRotationPoint(-7.25F, -17.85F, 1.7F);

		slideModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 96
		slideModel[27].setRotationPoint(-7.25F, -17.2F, 1.7F);

		slideModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 97
		slideModel[28].setRotationPoint(-7.25F, -18.5F, 1.7F);

		slideModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F); // Box 102
		slideModel[29].setRotationPoint(0.25F, -16.2F, -3F);

		slideModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 103
		slideModel[30].setRotationPoint(0.25F, -16.85F, -3F);

		slideModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F); // Box 104
		slideModel[31].setRotationPoint(0.25F, -17.5F, -3F);

		slideModel[32].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 105
		slideModel[32].setRotationPoint(-0.8F, -18F, -2.5F);

		slideModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 106
		slideModel[33].setRotationPoint(-1.4F, -18F, -2.5F);

		this.modelScale = 0.15F;

		translateAll = new Vector3f(0F, -22F, 0.0F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = 0.7F;
	    reloadAnimation = WeaponAnimations.PISTOL;
	    
		hasFlash = false;
	    
        leftArmPos = new Vector3f(-0.1F, -0.7F, 0.12F);
        leftArmRot = new Vector3f(75.0F, 15.0F, -45.0F);
		leftArmReloadPos = new Vector3f(-0.1F, -0.7F, 0.12F);
        leftArmReloadRot = new Vector3f(75.0F, 15.0F, -45.0F);
 
        leftArmChargePos = new Vector3f(-0.27F, -0.55F, 0.07F);
        leftArmChargeRot = new Vector3f(75.0F, 15.0F, -45.0F);       
        
        rightArmPos = new Vector3f(0.45F, -0.5F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.45F, -0.5F, 0.03F);
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
		
	    chargeHandleDistance = 0.7F;
	    chargeDelay = 0;
	    chargeDelayAfterReload = 65;
	    chargeTime = 20;
	    
	    actionArm = EnumArm.Left;
	    actionType = EnumAction.Charge;
	    
	    chargeModifier = new Vector3f (0.0F, 0.0F, 0.0F);
	    
		flipAll();
	}
}