//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.05.2017 - 08:10:02
// Last changed on: 01.05.2017 - 08:10:02

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class g43 extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public g43() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[81];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 6
		gunModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 8
		gunModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 12
		gunModel[6] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 15
		gunModel[7] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 23
		gunModel[8] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 30
		gunModel[9] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 38
		gunModel[10] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 40
		gunModel[11] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 42
		gunModel[12] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 43
		gunModel[13] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 44
		gunModel[14] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 46
		gunModel[15] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 48
		gunModel[16] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 49
		gunModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 50
		gunModel[18] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 51
		gunModel[19] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 53
		gunModel[20] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 54
		gunModel[21] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 55
		gunModel[22] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 56
		gunModel[23] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 58
		gunModel[24] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 60
		gunModel[25] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 61
		gunModel[26] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 62
		gunModel[27] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 78
		gunModel[28] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 81
		gunModel[29] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 88
		gunModel[30] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 89
		gunModel[31] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 90
		gunModel[32] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 102
		gunModel[33] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 106
		gunModel[34] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 108
		gunModel[35] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 109
		gunModel[36] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 110
		gunModel[37] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 111
		gunModel[38] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 112
		gunModel[39] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 113
		gunModel[40] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 110
		gunModel[41] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 141
		gunModel[42] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 142
		gunModel[43] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 143
		gunModel[44] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 144
		gunModel[45] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 145
		gunModel[46] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 150
		gunModel[47] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 152
		gunModel[48] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 153
		gunModel[49] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 154
		gunModel[50] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 71
		gunModel[51] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 72
		gunModel[52] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 73
		gunModel[53] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 75
		gunModel[54] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 99
		gunModel[55] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 100
		gunModel[56] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 102
		gunModel[57] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 104
		gunModel[58] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 107
		gunModel[59] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 108
		gunModel[60] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 109
		gunModel[61] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 110
		gunModel[62] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 111
		gunModel[63] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 112
		gunModel[64] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 113
		gunModel[65] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 114
		gunModel[66] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 116
		gunModel[67] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 117
		gunModel[68] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 118
		gunModel[69] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 119
		gunModel[70] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 120
		gunModel[71] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 121
		gunModel[72] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 123
		gunModel[73] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 124
		gunModel[74] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 126
		gunModel[75] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 127
		gunModel[76] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 128
		gunModel[77] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 129
		gunModel[78] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 146
		gunModel[79] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 149
		gunModel[80] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 129

		gunModel[0].addShapeBox(0F, 0F, 0F, 30, 5, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 1
		gunModel[0].setRotationPoint(24F, -13F, 1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 30, 5, 2, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[1].setRotationPoint(24F, -13F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[2].setRotationPoint(33F, -15F, 1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[3].setRotationPoint(33F, -15F, -2F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 22, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[4].setRotationPoint(32F, -15F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 12
		gunModel[5].setRotationPoint(10F, -13F, 1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 7, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[6].setRotationPoint(3F, -13F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 23
		gunModel[7].setRotationPoint(54F, -15F, -1F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 30
		gunModel[8].setRotationPoint(54F, -13F, -2F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 38
		gunModel[9].setRotationPoint(-4F, -13F, -2F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 7, 6, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 40
		gunModel[10].setRotationPoint(-4F, -13F, -1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 42
		gunModel[11].setRotationPoint(3F, -13F, 1F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[12].setRotationPoint(-9F, -11F, -2F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[13].setRotationPoint(-9F, -12F, -1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 46
		gunModel[14].setRotationPoint(-9F, -11F, 1F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 48
		gunModel[15].setRotationPoint(-12F, -10F, -1F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 49
		gunModel[16].setRotationPoint(-12F, -9F, -2F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 50
		gunModel[17].setRotationPoint(-12F, -9F, 1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 51
		gunModel[18].setRotationPoint(-4F, -13F, 1F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 53
		gunModel[19].setRotationPoint(-16F, -10F, -1F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 54
		gunModel[20].setRotationPoint(-16F, -9F, -2F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[21].setRotationPoint(-16F, -9F, 1F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 20, 12, 2, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 56
		gunModel[22].setRotationPoint(-36F, -10F, -1F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 20, 11, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 58
		gunModel[23].setRotationPoint(-36F, -9F, -2F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 20, 11, 1, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 1F, 0F); // Box 60
		gunModel[24].setRotationPoint(-36F, -9F, 1F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 4, 14, 2, 0F, 0F, -0.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.9F, 0.1F, -2F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -2F, 0.1F, 0.1F); // Box 61
		gunModel[25].setRotationPoint(-40F, -9F, -1F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F, 0F, -2F, 0.1F, 0F, -1F, 0.1F, 0F, 0.1F, -0.1F, 0F, -0.9F, -0.1F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0.1F, -0.1F, -2F, 0.1F, -0.1F); // Box 62
		gunModel[26].setRotationPoint(-40F, -9F, -2F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		gunModel[27].setRotationPoint(31F, -14F, 0F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[28].setRotationPoint(31F, -14F, -2F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 1F, 0F); // Box 88
		gunModel[29].setRotationPoint(-4F, -14F, 0F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.95F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.95F, 0F); // Box 89
		gunModel[30].setRotationPoint(3F, -14F, 0F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.3F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F); // Box 90
		gunModel[31].setRotationPoint(8F, -14F, 0F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 102
		gunModel[32].setRotationPoint(52F, -13F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F); // Box 106
		gunModel[33].setRotationPoint(72F, -13F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 108
		gunModel[34].setRotationPoint(6F, -6F, 0F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 109
		gunModel[35].setRotationPoint(-2F, -6F, 0F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[36].setRotationPoint(-2F, -8F, 0F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[37].setRotationPoint(6F, -8F, 0F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[38].setRotationPoint(-0.5F, -4F, 0F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.15F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 113
		gunModel[39].setRotationPoint(0F, -7.5F, 0F);
		gunModel[39].rotateAngleZ = 0.26179939F;

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F); // Box 110
		gunModel[40].setRotationPoint(31F, -12F, -1F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F); // Box 141
		gunModel[41].setRotationPoint(73.5F, -13F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F); // Box 142
		gunModel[42].setRotationPoint(75F, -13F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F); // Box 143
		gunModel[43].setRotationPoint(-20F, -8F, -2.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F, 0F, -0.9F, -0.1F, 0F, 0.1F, -0.1F, 0F, -1F, 0.1F, 0F, -2F, 0.1F, -2F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -2F, 0F, -2F, -2F, 0F); // Box 144
		gunModel[44].setRotationPoint(-40F, -9F, 1F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.15F, 0.15F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0.15F, 0.15F, -0.3F); // Box 145
		gunModel[45].setRotationPoint(-18.7F, -8F, -2.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.3F, 0F); // Box 150
		gunModel[46].setRotationPoint(8F, -14F, -2F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		gunModel[47].setRotationPoint(10F, -14F, -2F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 30, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 153
		gunModel[48].setRotationPoint(24F, -13F, -2F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 154
		gunModel[49].setRotationPoint(10F, -13F, -2F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 71
		gunModel[50].setRotationPoint(54F, -11F, -1F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 72
		gunModel[51].setRotationPoint(-13F, -8F, -2F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 73
		gunModel[52].setRotationPoint(-13F, -9F, -1F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		gunModel[53].setRotationPoint(-13F, -8F, 1F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 99
		gunModel[54].setRotationPoint(18F, -13F, 1F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		gunModel[55].setRotationPoint(18F, -13F, -2F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		gunModel[56].setRotationPoint(3F, -13F, -2F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		gunModel[57].setRotationPoint(10F, -14F, 0F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[58].setRotationPoint(15F, -15F, 1F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gunModel[59].setRotationPoint(15F, -15F, -2F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		gunModel[60].setRotationPoint(15F, -15F, -1F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[61].setRotationPoint(32F, -15F, 1F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[62].setRotationPoint(23.75F, -15F, -1F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[63].setRotationPoint(32F, -15F, -2F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		gunModel[64].setRotationPoint(7F, -14.75F, -1F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -0.15F, -0.2F); // Box 114
		gunModel[65].setRotationPoint(7F, -14.5F, 1F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		gunModel[66].setRotationPoint(-3F, -15F, 0.75F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 117
		gunModel[67].setRotationPoint(-3F, -15F, -1F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		gunModel[68].setRotationPoint(-3F, -15F, -1.75F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F); // Box 119
		gunModel[69].setRotationPoint(-4F, -15F, -1F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 1F, 0F); // Box 120
		gunModel[70].setRotationPoint(-4F, -14F, -2F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F); // Box 121
		gunModel[71].setRotationPoint(-3F, -14F, 0F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.95F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.95F, 0F); // Box 123
		gunModel[72].setRotationPoint(3F, -14F, -2F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F); // Box 124
		gunModel[73].setRotationPoint(-3F, -14F, -2F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.15F, 0F); // Box 126
		gunModel[74].setRotationPoint(7F, -14.5F, -2F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 127
		gunModel[75].setRotationPoint(55F, -13.5F, -1.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 128
		gunModel[76].setRotationPoint(55F, -11.5F, -0.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 129
		gunModel[77].setRotationPoint(55F, -14.5F, -0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		gunModel[78].setRotationPoint(24F, -14.5F, -1.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, 0F, 0F, 0F); // Box 149
		gunModel[79].setRotationPoint(10F, -8F, -1F);

		gunModel[80].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 129
		gunModel[80].setRotationPoint(-4.2F, -14.5F, -0.5F);


		defaultScopeModel = new ModelRendererTurbo[22];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 91
		defaultScopeModel[1] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 92
		defaultScopeModel[2] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 94
		defaultScopeModel[3] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 95
		defaultScopeModel[4] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 96
		defaultScopeModel[5] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 97
		defaultScopeModel[6] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 98
		defaultScopeModel[7] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 99
		defaultScopeModel[8] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 100
		defaultScopeModel[9] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 101
		defaultScopeModel[10] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 103
		defaultScopeModel[11] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 104
		defaultScopeModel[12] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 105
		defaultScopeModel[13] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 106
		defaultScopeModel[14] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 146
		defaultScopeModel[15] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 147
		defaultScopeModel[16] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 148
		defaultScopeModel[17] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 150
		defaultScopeModel[18] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 151
		defaultScopeModel[19] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 152
		defaultScopeModel[20] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 153
		defaultScopeModel[21] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 150

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, 0.5F, 0.8F, -0.35F, -0.9F, 0.8F, -0.35F, -0.9F, 0.8F, -0.35F, 0.5F, 0.8F, -0.35F); // Box 91
		defaultScopeModel[0].setRotationPoint(73.5F, -15F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		defaultScopeModel[1].setRotationPoint(73.5F, -16.1F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F); // Box 94
		defaultScopeModel[2].setRotationPoint(73.5F, -16.6F, -0.7F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		defaultScopeModel[3].setRotationPoint(73.5F, -18F, -0.5F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		defaultScopeModel[4].setRotationPoint(73.5F, -16.6F, -0.3F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 97
		defaultScopeModel[5].setRotationPoint(25F, -15.25F, -1F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F); // Box 98
		defaultScopeModel[6].setRotationPoint(26F, -15.05F, -1F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F); // Box 99
		defaultScopeModel[7].setRotationPoint(30F, -15.05F, -1F);

		defaultScopeModel[8].addShapeBox(-6F, -0.7F, 0F, 6, 1, 2, 0F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F); // Box 100
		defaultScopeModel[8].setRotationPoint(31.5F, -14.95F, -1F);
		defaultScopeModel[8].rotateAngleZ = -0.06981317F;

		defaultScopeModel[9].addShapeBox(-0.5F, -0.7F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F); // Box 101
		defaultScopeModel[9].setRotationPoint(31.5F, -14.95F, -1F);
		defaultScopeModel[9].rotateAngleZ = -0.06981317F;

		defaultScopeModel[10].addShapeBox(-6F, -1.1F, -0.1F, 2, 1, 1, 0F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 103
		defaultScopeModel[10].setRotationPoint(31.5F, -14.95F, -0.9F);
		defaultScopeModel[10].rotateAngleZ = -0.06981317F;

		defaultScopeModel[11].addShapeBox(-6F, -1.1F, 0.1F, 2, 1, 1, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 104
		defaultScopeModel[11].setRotationPoint(31.5F, -14.95F, -0.1F);
		defaultScopeModel[11].rotateAngleZ = -0.06981317F;

		defaultScopeModel[12].addShapeBox(-6F, -0.9F, 0F, 6, 1, 2, 0F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F); // Box 105
		defaultScopeModel[12].setRotationPoint(31.5F, -14.95F, -1F);
		defaultScopeModel[12].rotateAngleZ = -0.06981317F;

		defaultScopeModel[13].addShapeBox(-6F, -0.8F, 0F, 6, 1, 2, 0F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F); // Box 106
		defaultScopeModel[13].setRotationPoint(31.5F, -14.95F, -1F);
		defaultScopeModel[13].rotateAngleZ = -0.06981317F;

		defaultScopeModel[14].addShapeBox(-5.5F, -0.95F, 0F, 1, 1, 2, 0F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F); // Box 146
		defaultScopeModel[14].setRotationPoint(31.5F, -14.95F, -1F);
		defaultScopeModel[14].rotateAngleZ = -0.06981317F;

		defaultScopeModel[15].addShapeBox(-3.5F, -0.95F, 0F, 1, 1, 2, 0F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F); // Box 147
		defaultScopeModel[15].setRotationPoint(31.5F, -14.95F, -1F);
		defaultScopeModel[15].rotateAngleZ = -0.06981317F;

		defaultScopeModel[16].addShapeBox(-1.5F, -0.95F, 0F, 1, 1, 2, 0F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F); // Box 148
		defaultScopeModel[16].setRotationPoint(31.5F, -14.95F, -1F);
		defaultScopeModel[16].rotateAngleZ = -0.06981317F;

		defaultScopeModel[17].addShapeBox(-2.5F, -0.95F, 0F, 1, 1, 2, 0F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F); // Box 150
		defaultScopeModel[17].setRotationPoint(31.5F, -14.95F, -1F);
		defaultScopeModel[17].rotateAngleZ = -0.06981317F;

		defaultScopeModel[18].addShapeBox(-4.5F, -0.95F, 0F, 1, 1, 2, 0F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F); // Box 151
		defaultScopeModel[18].setRotationPoint(31.5F, -14.95F, -1F);
		defaultScopeModel[18].rotateAngleZ = -0.06981317F;

		defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F); // Box 152
		defaultScopeModel[19].setRotationPoint(30F, -15.05F, -1F);

		defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F); // Box 153
		defaultScopeModel[20].setRotationPoint(26F, -15.05F, -1F);

		defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F); // Box 150
		defaultScopeModel[21].setRotationPoint(73.5F, -16F, -0.5F);


		ammoModel = new ModelRendererTurbo[22];
		ammoModel[0] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 76
		ammoModel[1] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 77
		ammoModel[2] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 78
		ammoModel[3] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 79
		ammoModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 81
		ammoModel[5] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 82
		ammoModel[6] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 83
		ammoModel[7] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 84
		ammoModel[8] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 85
		ammoModel[9] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 86
		ammoModel[10] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 87
		ammoModel[11] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 88
		ammoModel[12] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 89
		ammoModel[13] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 90
		ammoModel[14] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 91
		ammoModel[15] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 92
		ammoModel[16] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 93
		ammoModel[17] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 94
		ammoModel[18] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 95
		ammoModel[19] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 96
		ammoModel[20] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 97
		ammoModel[21] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 98

		ammoModel[0].addShapeBox(-0.500000000000001F, 1F, 0F, 9, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		ammoModel[0].setRotationPoint(15F, -10F, -0.5F);
		ammoModel[0].rotateAngleZ = 0.13962634F;

		ammoModel[1].addShapeBox(-0.500000000000001F, 1F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 77
		ammoModel[1].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[1].rotateAngleZ = 0.13962634F;

		ammoModel[2].addShapeBox(7.5F, 1F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		ammoModel[2].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[2].rotateAngleZ = 0.13962634F;

		ammoModel[3].addShapeBox(0.499999999999999F, 6F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		ammoModel[3].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[3].rotateAngleZ = 0.13962634F;

		ammoModel[4].addShapeBox(6.5F, 1F, -0.25F, 1, 5, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 81
		ammoModel[4].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[4].rotateAngleZ = 0.13962634F;

		ammoModel[5].addShapeBox(5.5F, 1F, -0.25F, 1, 5, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 82
		ammoModel[5].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[5].rotateAngleZ = 0.13962634F;

		ammoModel[6].addShapeBox(3.5F, 1F, -0.25F, 1, 5, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 83
		ammoModel[6].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[6].rotateAngleZ = 0.13962634F;

		ammoModel[7].addShapeBox(4.5F, 1F, -0.25F, 1, 5, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 84
		ammoModel[7].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[7].rotateAngleZ = 0.13962634F;

		ammoModel[8].addShapeBox(1.5F, 1F, -0.25F, 1, 5, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 85
		ammoModel[8].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[8].rotateAngleZ = 0.13962634F;

		ammoModel[9].addShapeBox(2.5F, 1F, -0.25F, 1, 5, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 86
		ammoModel[9].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[9].rotateAngleZ = 0.13962634F;

		ammoModel[10].addShapeBox(0.499999999999999F, 1F, -0.25F, 1, 5, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 87
		ammoModel[10].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[10].rotateAngleZ = 0.13962634F;

		ammoModel[11].addShapeBox(7.5F, 1F, -2F, 1, 6, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		ammoModel[11].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[11].rotateAngleZ = 0.13962634F;

		ammoModel[12].addShapeBox(0.499999999999999F, 6F, -2F, 7, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		ammoModel[12].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[12].rotateAngleZ = 0.13962634F;

		ammoModel[13].addShapeBox(-0.500000000000001F, 1F, -2F, 1, 6, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		ammoModel[13].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[13].rotateAngleZ = 0.13962634F;

		ammoModel[14].addShapeBox(6.5F, 1F, -1.75F, 1, 5, 1, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 91
		ammoModel[14].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[14].rotateAngleZ = 0.13962634F;

		ammoModel[15].addShapeBox(5.5F, 1F, -1.75F, 1, 5, 1, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 92
		ammoModel[15].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[15].rotateAngleZ = 0.13962634F;

		ammoModel[16].addShapeBox(4.5F, 1F, -1.75F, 1, 5, 1, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 93
		ammoModel[16].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[16].rotateAngleZ = 0.13962634F;

		ammoModel[17].addShapeBox(3.5F, 1F, -1.75F, 1, 5, 1, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 94
		ammoModel[17].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[17].rotateAngleZ = 0.13962634F;

		ammoModel[18].addShapeBox(2.5F, 1F, -1.75F, 1, 5, 1, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 95
		ammoModel[18].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[18].rotateAngleZ = 0.13962634F;

		ammoModel[19].addShapeBox(1.5F, 1F, -1.75F, 1, 5, 1, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 96
		ammoModel[19].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[19].rotateAngleZ = 0.13962634F;

		ammoModel[20].addShapeBox(0.499999999999999F, 1F, -1.75F, 1, 5, 1, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 97
		ammoModel[20].setRotationPoint(15F, -10F, 0.5F);
		ammoModel[20].rotateAngleZ = 0.13962634F;

		ammoModel[21].addShapeBox(-0.500000000000001F, 1F, -1F, 9, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		ammoModel[21].setRotationPoint(15F, -11F, 0F);
		ammoModel[21].rotateAngleZ = 0.13962634F;


		slideModel = new ModelRendererTurbo[5];
		slideModel[0] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 105
		slideModel[1] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 106
		slideModel[2] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 147
		slideModel[3] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 148
		slideModel[4] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 151

		slideModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		slideModel[0].setRotationPoint(16F, -15.5F, -1F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		slideModel[1].setRotationPoint(16F, -15F, -1.5F);

		slideModel[2].addShapeBox(0F, 0F, -0.5F, 1, 1, 3, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F); // Box 147
		slideModel[2].setRotationPoint(16F, -14.8F, 0.5F);
		slideModel[2].rotateAngleX = 0.34906585F;

		slideModel[3].addShapeBox(0F, 0F, 1.7F, 1, 1, 1, 0F, -0.05F, -0.05F, -0.2F, -0.05F, -0.05F, -0.2F, -0.05F, -0.05F, -0.2F, -0.05F, -0.05F, -0.2F, -0.05F, -0.05F, -0.2F, -0.05F, -0.05F, -0.2F, -0.05F, -0.05F, -0.2F, -0.05F, -0.05F, -0.2F); // Box 148
		slideModel[3].setRotationPoint(16F, -14.8F, 0.5F);
		slideModel[3].rotateAngleX = 0.34906585F;

		slideModel[4].addShapeBox(0F, 0F, 1.75F, 1, 1, 1, 0F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F); // Box 151
		slideModel[4].setRotationPoint(16F, -14.8F, 0.5F);
		slideModel[4].rotateAngleX = 0.34906585F;

		this.modelScale = 0.25F;

		translateAll = new Vector3f(0F, -9.4F, -0.15F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.SNIPER;
	    
		hasFlash = false;
	    
        leftArmPos = new Vector3f(0.450F, -0.6F, 0.02F);
        leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.1F, -0.7F, 0.02F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);
	    
	    rightArmPos = new Vector3f(0.28F, -0.55F, 0.0F);
	    rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    rightArmReloadPos = new Vector3f(0.28F, -0.55F, 0.0F);
	    rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    
	    leftArmChargePos = new Vector3f(0.47F, -0.39F, 0.14F);
	    leftArmChargeRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    
	    rightArmScale = new Vector3f(0.60F, 1.0F, 0.60F);
	    leftArmScale = new Vector3f(0.60F, 1.0F, 0.60F);

	    leftHandAmmo = true;
	    
		casingAnimDistance = new Vector3f(-5, -1, 12);
	    casingAnimSpread = new Vector3f(2, 2, 0);
	    casingAnimTime = 8;  
	    casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);
	    
		crouchZoom = -0.35F;
		fancyStance = true;
		sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
		sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);
		
	    chargeHandleDistance = 0.9F;
	    chargeDelay = 0;
	    chargeDelayAfterReload = 65;
	    chargeTime = 20;
	    
	    actionArm = EnumArm.Left;
	    actionType = EnumAction.Charge;
	    
	    chargeModifier = new Vector3f (0.0F, 0.0F, 0.0F);
		    
		flipAll();
	}
}