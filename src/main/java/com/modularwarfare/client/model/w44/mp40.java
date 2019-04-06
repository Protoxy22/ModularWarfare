//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.04.2017 - 15:39:07
// Last changed on: 26.04.2017 - 15:39:07

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class mp40 extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public mp40() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[93];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 4
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 10
		gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 11
		gunModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 12
		gunModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 13
		gunModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 14
		gunModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 15
		gunModel[9] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 16
		gunModel[10] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 17
		gunModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 18
		gunModel[12] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 19
		gunModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20
		gunModel[14] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 21
		gunModel[15] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 22
		gunModel[16] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 23
		gunModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 24
		gunModel[18] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 25
		gunModel[19] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 27
		gunModel[20] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 28
		gunModel[21] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 29
		gunModel[22] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 30
		gunModel[23] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 31
		gunModel[24] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 32
		gunModel[25] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 33
		gunModel[26] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 34
		gunModel[27] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 35
		gunModel[28] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 36
		gunModel[29] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 37
		gunModel[30] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 38
		gunModel[31] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 43
		gunModel[32] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 44
		gunModel[33] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 45
		gunModel[34] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 54
		gunModel[35] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 55
		gunModel[36] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 56
		gunModel[37] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 82
		gunModel[38] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 83
		gunModel[39] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 84
		gunModel[40] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 85
		gunModel[41] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 86
		gunModel[42] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 87
		gunModel[43] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 88
		gunModel[44] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 89
		gunModel[45] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 90
		gunModel[46] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 91
		gunModel[47] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 92
		gunModel[48] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 94
		gunModel[49] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 95
		gunModel[50] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 96
		gunModel[51] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 97
		gunModel[52] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 98
		gunModel[53] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 99
		gunModel[54] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 100
		gunModel[55] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 101
		gunModel[56] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 102
		gunModel[57] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 103
		gunModel[58] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 104
		gunModel[59] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 105
		gunModel[60] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 106
		gunModel[61] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 107
		gunModel[62] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 108
		gunModel[63] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 109
		gunModel[64] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 111
		gunModel[65] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 112
		gunModel[66] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 113
		gunModel[67] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 114
		gunModel[68] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 115
		gunModel[69] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 116
		gunModel[70] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 91
		gunModel[71] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 92
		gunModel[72] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 94
		gunModel[73] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 95
		gunModel[74] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 96
		gunModel[75] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 97
		gunModel[76] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 98
		gunModel[77] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 99
		gunModel[78] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 152
		gunModel[79] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 153
		gunModel[80] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 138
		gunModel[81] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 139
		gunModel[82] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 140
		gunModel[83] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 141
		gunModel[84] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 142
		gunModel[85] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 143
		gunModel[86] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 144
		gunModel[87] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 147
		gunModel[88] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 148
		gunModel[89] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 149
		gunModel[90] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 150
		gunModel[91] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 151
		gunModel[92] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 152

		gunModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 3
		gunModel[0].setRotationPoint(-3F, -7F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 6, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 5F, -3F, 0F, -7F, 0F, 0F, -8F, -1F, 0F, 4F, -3F, 0F); // Box 4
		gunModel[1].setRotationPoint(-3F, -6F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -3F, -2F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -4F, -1F, 0F, -1F, -2F, 0F); // Box 9
		gunModel[2].setRotationPoint(-8F, 2F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[3].setRotationPoint(-3F, -7F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 6, 11, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, -8F, -1F, 0F, -7F, 0F, 0F, 5F, -3F, 0F); // Box 11
		gunModel[4].setRotationPoint(-3F, -6F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, -1F, 0F, 0F, -3F, -2F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -4F, -1F, 0F, -3F, 0F, 0F, 0F, -2F, 0F); // Box 12
		gunModel[5].setRotationPoint(-8F, 2F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[6].setRotationPoint(-3F, -8F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 26, 1, 2, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 14
		gunModel[7].setRotationPoint(-4F, -9F, -1F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 32, 2, 2, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 15
		gunModel[8].setRotationPoint(-4F, -14F, -1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 48, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 16
		gunModel[9].setRotationPoint(-3F, -15F, -1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 32, 3, 2, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 17
		gunModel[10].setRotationPoint(-5F, -12F, -1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 47, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 18
		gunModel[11].setRotationPoint(-2F, -16.5F, -1F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 17, 3, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 19
		gunModel[12].setRotationPoint(1F, -13.9F, -2F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[13].setRotationPoint(23F, -9F, -1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 21
		gunModel[14].setRotationPoint(22F, -9F, -1F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[15].setRotationPoint(28F, -13.99F, -1.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 26, 1, 5, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 23
		gunModel[16].setRotationPoint(1F, -16.25F, -2.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 33, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[17].setRotationPoint(1F, -17.5F, -2.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 44, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 25
		gunModel[18].setRotationPoint(1F, -14F, -2.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F); // Box 27
		gunModel[19].setRotationPoint(47F, -16.25F, -2F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F); // Box 28
		gunModel[20].setRotationPoint(47F, -17F, -2F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F); // Box 29
		gunModel[21].setRotationPoint(47F, -14.5F, -2F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.5F); // Box 30
		gunModel[22].setRotationPoint(-2F, -14.25F, -2F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 31
		gunModel[23].setRotationPoint(-2F, -16.25F, -2F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 32
		gunModel[24].setRotationPoint(-2F, -17.25F, -2F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[25].setRotationPoint(18F, -13.9F, -2F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 34
		gunModel[26].setRotationPoint(29F, -13.9F, -2F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[27].setRotationPoint(30F, -10.9F, -2F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[28].setRotationPoint(33.5F, -14F, -2F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 37
		gunModel[29].setRotationPoint(33.5F, -8F, -2F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, -0.2F); // Box 38
		gunModel[30].setRotationPoint(48F, -16.25F, -1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 43
		gunModel[31].setRotationPoint(51.5F, -15.5F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -1F, 0.25F, -0.25F, -1F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F); // Box 44
		gunModel[32].setRotationPoint(58.5F, -14F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 45
		gunModel[33].setRotationPoint(58.5F, -13F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 54
		gunModel[34].setRotationPoint(-4F, -11.25F, -1.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 55
		gunModel[35].setRotationPoint(-4F, -10F, -1.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[36].setRotationPoint(-4F, -12.75F, -1.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 82
		gunModel[37].setRotationPoint(67F, -16.25F, -1F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.5F, -0.5F); // Box 83
		gunModel[38].setRotationPoint(64F, -16.25F, -1F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0F, 0.15F); // Box 84
		gunModel[39].setRotationPoint(18F, -11.9F, -2F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 85
		gunModel[40].setRotationPoint(1F, -10.9F, -2F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F); // Box 86
		gunModel[41].setRotationPoint(-1F, -16.25F, -2F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F); // Box 87
		gunModel[42].setRotationPoint(-1F, -17.25F, -2F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -1F); // Box 88
		gunModel[43].setRotationPoint(-1F, -14.25F, -2F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, -0.5F); // Box 89
		gunModel[44].setRotationPoint(45F, -14.25F, -2F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F); // Box 90
		gunModel[45].setRotationPoint(45F, -16.25F, -2F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F); // Box 91
		gunModel[46].setRotationPoint(45F, -17.25F, -2F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 92
		gunModel[47].setRotationPoint(2F, -16.25F, -2.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 94
		gunModel[48].setRotationPoint(2F, -17.75F, -2.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 95
		gunModel[49].setRotationPoint(2F, -13.75F, -2.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 96
		gunModel[50].setRotationPoint(29.5F, -13.75F, -2.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 97
		gunModel[51].setRotationPoint(29.5F, -16.25F, -2.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 98
		gunModel[52].setRotationPoint(29.5F, -17.75F, -2.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 99
		gunModel[53].setRotationPoint(38.5F, -13.75F, -2.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 100
		gunModel[54].setRotationPoint(38.5F, -16.25F, -2.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 101
		gunModel[55].setRotationPoint(38.5F, -17.75F, -2.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 102
		gunModel[56].setRotationPoint(41.5F, -13.75F, -2.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 103
		gunModel[57].setRotationPoint(41.5F, -16.25F, -2.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 104
		gunModel[58].setRotationPoint(41.5F, -17.75F, -2.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 105
		gunModel[59].setRotationPoint(38F, -16.25F, -2.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		gunModel[60].setRotationPoint(38F, -17.5F, -2.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 107
		gunModel[61].setRotationPoint(34F, -15.25F, -2.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gunModel[62].setRotationPoint(34F, -17.5F, -1.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 109
		gunModel[63].setRotationPoint(42F, -17.25F, -4.25F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[64].setRotationPoint(42F, -14.25F, -4.25F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 112
		gunModel[65].setRotationPoint(42F, -16.75F, -4.25F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		gunModel[66].setRotationPoint(1F, -15F, -2.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		gunModel[67].setRotationPoint(29F, -16F, -2.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		gunModel[68].setRotationPoint(7F, -15F, -2.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 116
		gunModel[69].setRotationPoint(27F, -16.25F, -2.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.8F, -0.35F, -0.2F, 0.8F, -0.35F, -0.2F, 0.8F, -0.35F, -0.2F, 0.8F, -0.35F); // Box 91
		gunModel[70].setRotationPoint(64.5F, -19F, -0.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		gunModel[71].setRotationPoint(64.5F, -19.1F, -0.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 94
		gunModel[72].setRotationPoint(64.5F, -19.3F, -0.7F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		gunModel[73].setRotationPoint(64.5F, -20.7F, -0.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		gunModel[74].setRotationPoint(64.5F, -19.3F, -0.3F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 97
		gunModel[75].setRotationPoint(10F, -18.5F, -1.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F); // Box 98
		gunModel[76].setRotationPoint(11F, -17.8F, -1.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F); // Box 99
		gunModel[77].setRotationPoint(15F, -17.8F, -1.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F); // Box 152
		gunModel[78].setRotationPoint(15F, -17.8F, -1.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F); // Box 153
		gunModel[79].setRotationPoint(11F, -17.8F, -1.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		gunModel[80].setRotationPoint(13F, -18.5F, -1F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F); // Box 139
		gunModel[81].setRotationPoint(14F, -19.5F, -1F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Box 140
		gunModel[82].setRotationPoint(14F, -19.5F, 0F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F); // Box 141
		gunModel[83].setRotationPoint(14F, -19F, -0.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F); // Box 142
		gunModel[84].setRotationPoint(12.8F, -18.9F, -1F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.8F, -0.55F, 0F, 0.8F, -0.55F, 0F, 0.8F, -0.55F, 0F, 0.8F, -0.55F); // Box 143
		gunModel[85].setRotationPoint(64.5F, -18F, -1F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -1.8F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, -1.8F, -0.6F, 0F, 0.8F, -0.6F, 0F, 0.8F, -0.6F, 0F, 0.8F, -0.6F, 0F, 0.8F, -0.6F); // Box 144
		gunModel[86].setRotationPoint(62.5F, -18F, -1F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 147
		gunModel[87].setRotationPoint(3F, -8.5F, -0.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		gunModel[88].setRotationPoint(9F, -7F, -0.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 149
		gunModel[89].setRotationPoint(7F, -5F, -0.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 150
		gunModel[90].setRotationPoint(1F, -5F, -0.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 151
		gunModel[91].setRotationPoint(2F, -4F, -0.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 152
		gunModel[92].setRotationPoint(4.5F, -8.5F, -0.5F);
		gunModel[92].rotateAngleZ = 0.08726646F;


		defaultStockModel = new ModelRendererTurbo[18];
		defaultStockModel[0] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 57
		defaultStockModel[1] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 58
		defaultStockModel[2] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 59
		defaultStockModel[3] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 60
		defaultStockModel[4] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 61
		defaultStockModel[5] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 62
		defaultStockModel[6] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 63
		defaultStockModel[7] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 64
		defaultStockModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 65
		defaultStockModel[9] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 67
		defaultStockModel[10] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 68
		defaultStockModel[11] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 69
		defaultStockModel[12] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 70
		defaultStockModel[13] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 71
		defaultStockModel[14] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 73
		defaultStockModel[15] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 79
		defaultStockModel[16] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 80
		defaultStockModel[17] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 81

		defaultStockModel[0].addShapeBox(-28.5F, -0.5F, 0F, 30, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		defaultStockModel[0].setRotationPoint(-2F, -10.5F, -2.25F);
		defaultStockModel[0].rotateAngleZ = 0.08726646F;

		defaultStockModel[1].addShapeBox(-1F, -1F, 0.25F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		defaultStockModel[1].setRotationPoint(-2F, -10.5F, -2F);
		defaultStockModel[1].rotateAngleZ = 0.08726646F;

		defaultStockModel[2].addShapeBox(-1F, -1F, 2.75F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		defaultStockModel[2].setRotationPoint(-2F, -10.5F, -2F);
		defaultStockModel[2].rotateAngleZ = 0.08726646F;

		defaultStockModel[3].addShapeBox(-28.5F, -0.5F, 3.5F, 30, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 60
		defaultStockModel[3].setRotationPoint(-2F, -10.5F, -2.25F);
		defaultStockModel[3].rotateAngleZ = 0.08726646F;

		defaultStockModel[4].addShapeBox(-29.5F, -0.5F, 3.5F, 3, 1, 1, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 61
		defaultStockModel[4].setRotationPoint(-2F, -10.5F, -2.25F);
		defaultStockModel[4].rotateAngleZ = 0.08726646F;

		defaultStockModel[5].addShapeBox(-29.5F, -0.5F, 0F, 3, 1, 1, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 62
		defaultStockModel[5].setRotationPoint(-2F, -10.5F, -2.25F);
		defaultStockModel[5].rotateAngleZ = 0.08726646F;

		defaultStockModel[6].addShapeBox(-30.25F, -0.25F, 3.5F, 1, 8, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F); // Box 63
		defaultStockModel[6].setRotationPoint(-2F, -10.5F, -2.25F);

		defaultStockModel[7].addShapeBox(-30.25F, -0.25F, 0F, 1, 8, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F); // Box 64
		defaultStockModel[7].setRotationPoint(-2F, -10.5F, -2.25F);

		defaultStockModel[8].addShapeBox(-30.25F, -2.5F, 3.5F, 1, 2, 1, 0F, 1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, 1F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F); // Box 65
		defaultStockModel[8].setRotationPoint(-2F, -10.5F, -2.25F);

		defaultStockModel[9].addShapeBox(-30.25F, -2.5F, 0F, 1, 2, 1, 0F, 1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, 1F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F); // Box 67
		defaultStockModel[9].setRotationPoint(-2F, -10.5F, -2.25F);

		defaultStockModel[10].addShapeBox(-30.25F, 8F, 3.5F, 1, 2, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, 1F, 0.15F, 0.1F); // Box 68
		defaultStockModel[10].setRotationPoint(-2F, -10.5F, -2.25F);

		defaultStockModel[11].addShapeBox(-30.25F, 8F, 0F, 1, 2, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, 1F, 0.15F, 0.1F); // Box 69
		defaultStockModel[11].setRotationPoint(-2F, -10.5F, -2.25F);

		defaultStockModel[12].addShapeBox(-31.25F, 10.25F, 3.5F, 1, 1, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 1F, 0.15F, 1.1F, -1F, 0.15F, 1.1F, -1F, 0.15F, -0.9F, 1F, 0.15F, -0.9F); // Box 70
		defaultStockModel[12].setRotationPoint(-2F, -10.5F, -2.25F);

		defaultStockModel[13].addShapeBox(-31.25F, 10.25F, 0F, 1, 1, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 1F, 0.15F, -0.9F, -1F, 0.15F, -0.9F, -1F, 0.15F, 1.1F, 1F, 0.15F, 1.1F); // Box 71
		defaultStockModel[13].setRotationPoint(-2F, -10.5F, -2.25F);

		defaultStockModel[14].addShapeBox(-32.25F, 11.5F, 1.25F, 1, 1, 2, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 73
		defaultStockModel[14].setRotationPoint(-2F, -10.6F, -2.25F);

		defaultStockModel[15].addShapeBox(-31.25F, -3.8F, 3.5F, 1, 1, 1, 0F, 1F, 0.15F, 1.1F, -1F, 0.15F, 1.1F, -1F, 0.15F, -0.9F, 1F, 0.15F, -0.9F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F); // Box 79
		defaultStockModel[15].setRotationPoint(-2F, -10.5F, -2.25F);

		defaultStockModel[16].addShapeBox(-31.25F, -3.8F, 0F, 1, 1, 1, 0F, 1F, 0.15F, -0.9F, -1F, 0.15F, -0.9F, -1F, 0.15F, 1.1F, 1F, 0.15F, 1.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F); // Box 80
		defaultStockModel[16].setRotationPoint(-2F, -10.5F, -2.25F);

		defaultStockModel[17].addShapeBox(-32.25F, -4.85F, 1.25F, 1, 1, 2, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F); // Box 81
		defaultStockModel[17].setRotationPoint(-2F, -10.6F, -2.25F);


		ammoModel = new ModelRendererTurbo[8];
		ammoModel[0] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 46
		ammoModel[1] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 47
		ammoModel[2] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 48
		ammoModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 49
		ammoModel[4] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 50
		ammoModel[5] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 51
		ammoModel[6] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 52
		ammoModel[7] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 53

		ammoModel[0].addShapeBox(16.5F, -5F, -2F, 1, 22, 4, 0F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F); // Box 46
		ammoModel[0].setRotationPoint(17F, -3F, 0F);
		ammoModel[0].rotateAngleZ = -0.01745329F;

		ammoModel[1].addShapeBox(20.5F, -5F, -2F, 1, 22, 4, 0F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F); // Box 47
		ammoModel[1].setRotationPoint(17F, -3F, 0F);
		ammoModel[1].rotateAngleZ = -0.01745329F;

		ammoModel[2].addShapeBox(17F, -5F, -2F, 4, 4, 4, 0F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F); // Box 48
		ammoModel[2].setRotationPoint(17F, -3F, 0F);
		ammoModel[2].rotateAngleZ = -0.01745329F;

		ammoModel[3].addShapeBox(17F, 16F, -2F, 4, 1, 4, 0F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F); // Box 49
		ammoModel[3].setRotationPoint(17F, -3F, 0F);
		ammoModel[3].rotateAngleZ = -0.01745329F;

		ammoModel[4].addShapeBox(17F, -1F, -2F, 4, 17, 4, 0F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F); // Box 50
		ammoModel[4].setRotationPoint(17F, -3F, 0F);
		ammoModel[4].rotateAngleZ = -0.01745329F;

		ammoModel[5].addShapeBox(19.5F, -1F, -2F, 1, 17, 4, 0F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F); // Box 51
		ammoModel[5].setRotationPoint(17F, -3F, 0F);
		ammoModel[5].rotateAngleZ = -0.01745329F;

		ammoModel[6].addShapeBox(18.5F, -1F, -2F, 1, 17, 4, 0F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F); // Box 52
		ammoModel[6].setRotationPoint(17F, -3F, 0F);
		ammoModel[6].rotateAngleZ = -0.01745329F;

		ammoModel[7].addShapeBox(17.5F, -1F, -2F, 1, 17, 4, 0F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F); // Box 53
		ammoModel[7].setRotationPoint(17F, -3F, 0F);
		ammoModel[7].rotateAngleZ = -0.01745329F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 145
		slideModel[1] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 146

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 145
		slideModel[0].setRotationPoint(19F, -15F, 0F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 146
		slideModel[1].setRotationPoint(19F, -15F, 3.8F);

		this.modelScale = 0.2F;

		translateAll = new Vector3f(0F, -13F, -0.01F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.RIFLE2;
	    
		hasFlash = false;
	    
	    leftArmPos = new Vector3f(0.28F, -0.74F, 0.05F);
	    leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.350F, -0.80F, 0.02F);
	    leftArmReloadRot = new Vector3f(35.0F, 0.0F, -45.0F);
	    
	    rightArmPos = new Vector3f(0.3F, -0.57F, 0.0F);
	    rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    rightArmReloadPos = new Vector3f(0.3F, -0.57F, 0.0F);
	    rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    
	    rightArmChargePos = new Vector3f(0.47F, -0.39F, 0.14F);
	    rightArmChargeRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    
	    rightArmScale = new Vector3f(0.60F, 1.0F, 0.60F);
	    leftArmScale = new Vector3f(0.60F, 1.0F, 0.60F);

	    leftHandAmmo = true;
	    
		casingAnimDistance = new Vector3f(-5, -1, 12);
	    casingAnimSpread = new Vector3f(2, 2, 0);
	    casingAnimTime = 8;  
	    casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);
	    
		crouchZoom = -0.35F;
		fancyStance = true;
		sprintRotate = new Vector3f(10.0F, 30.0F, -0.0F);
		sprintTranslate = new Vector3f(0.9F, -0.10F, -0.65F);
		
	    chargeHandleDistance = 0.9F;
	    chargeDelay = 0;
	    chargeDelayAfterReload = 65;
	    chargeTime = 20;
	    
	    actionArm = EnumArm.Right;
	    actionType = EnumAction.Charge;
	    
	    chargeModifier = new Vector3f (0.0F, 0.0F, 0.0F);
	    
		flipAll();
	}
}