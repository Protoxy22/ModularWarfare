//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.11.2017 - 03:22:34
// Last changed on: 08.11.2017 - 03:22:34

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class mg15 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public mg15() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[121];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 32
		gunModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 44
		gunModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 45
		gunModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 46
		gunModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 47
		gunModel[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 48
		gunModel[9] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 49
		gunModel[10] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 18
		gunModel[18] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 19
		gunModel[19] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 20
		gunModel[20] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 21
		gunModel[21] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 22
		gunModel[22] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 23
		gunModel[23] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 24
		gunModel[24] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 25
		gunModel[25] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 26
		gunModel[26] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 27
		gunModel[27] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 28
		gunModel[28] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 30
		gunModel[29] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 31
		gunModel[30] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 32
		gunModel[31] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 33
		gunModel[32] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 34
		gunModel[33] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 36
		gunModel[34] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 37
		gunModel[35] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 38
		gunModel[36] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 39
		gunModel[37] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 40
		gunModel[38] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 41
		gunModel[39] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 42
		gunModel[40] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 43
		gunModel[41] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 44
		gunModel[42] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 45
		gunModel[43] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 46
		gunModel[44] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 47
		gunModel[45] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 48
		gunModel[46] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 49
		gunModel[47] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 50
		gunModel[48] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 51
		gunModel[49] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 52
		gunModel[50] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 53
		gunModel[51] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 54
		gunModel[52] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 56
		gunModel[53] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 58
		gunModel[54] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 59
		gunModel[55] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 60
		gunModel[56] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 61
		gunModel[57] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 64
		gunModel[58] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 65
		gunModel[59] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 66
		gunModel[60] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 67
		gunModel[61] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 68
		gunModel[62] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 71
		gunModel[63] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 72
		gunModel[64] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 73
		gunModel[65] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 74
		gunModel[66] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 75
		gunModel[67] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 78
		gunModel[68] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 85
		gunModel[69] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 86
		gunModel[70] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 87
		gunModel[71] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 88
		gunModel[72] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 89
		gunModel[73] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 90
		gunModel[74] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 91
		gunModel[75] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 92
		gunModel[76] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 93
		gunModel[77] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 94
		gunModel[78] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 95
		gunModel[79] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 96
		gunModel[80] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 97
		gunModel[81] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 98
		gunModel[82] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 99
		gunModel[83] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 100
		gunModel[84] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 101
		gunModel[85] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 102
		gunModel[86] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 103
		gunModel[87] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 104
		gunModel[88] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 105
		gunModel[89] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 106
		gunModel[90] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 107
		gunModel[91] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 109
		gunModel[92] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 136
		gunModel[93] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 137
		gunModel[94] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 139
		gunModel[95] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 140
		gunModel[96] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 141
		gunModel[97] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 142
		gunModel[98] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 143
		gunModel[99] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 144
		gunModel[100] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 145
		gunModel[101] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 153
		gunModel[102] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 154
		gunModel[103] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 156
		gunModel[104] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 157
		gunModel[105] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 166
		gunModel[106] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 167
		gunModel[107] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 168
		gunModel[108] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 169
		gunModel[109] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 170
		gunModel[110] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 174
		gunModel[111] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 175
		gunModel[112] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 176
		gunModel[113] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 177
		gunModel[114] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 178
		gunModel[115] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 179
		gunModel[116] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 180
		gunModel[117] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 181
		gunModel[118] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 215
		gunModel[119] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 216
		gunModel[120] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 217

		gunModel[0].addShapeBox(0F, 0F, 0F, 8, 11, 7, 0F, 0F, 1F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 0F, 1F, -1.5F, 4F, -1F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 4F, -1F, -1.5F); // Box 0
		gunModel[0].setRotationPoint(-7F, -9F, -3.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 8, 7, 7, 0F, 3F, 1F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 3F, 1F, -1.5F, 5F, -1F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 5F, -1F, -1.5F); // Box 1
		gunModel[1].setRotationPoint(-8F, 2F, -3.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F, 2F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 2F, 1F, -1.5F, 1F, -1F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 1F, -1F, -1.5F); // Box 2
		gunModel[2].setRotationPoint(-6F, -13F, -3.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 32
		gunModel[3].setRotationPoint(5F, -13.5F, -1.5F);
		gunModel[3].rotateAngleZ = 0.20943951F;

		gunModel[4].addShapeBox(0F, 0F, 0F, 8, 7, 7, 0F, 3F, 1F, -3F, -1F, 0F, -3F, -3F, 0F, -3F, 1F, 1F, -3F, 5F, -1F, -3F, -2F, 0F, -3F, -4F, -2F, -3F, 3F, -3F, -3F); // Box 44
		gunModel[4].setRotationPoint(-8F, 2F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 8, 11, 7, 0F, 0F, 1F, -3F, 1F, 0F, -3F, -1F, 0F, -3F, -2F, 1F, -3F, 4F, -1F, -3F, -2F, 0F, -3F, -4F, 0F, -3F, 2F, -1F, -3F); // Box 45
		gunModel[5].setRotationPoint(-7F, -9F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F, 2F, 1F, -3F, 0F, 1F, -3F, -2F, 1F, -3F, 0F, 1F, -3F, 1F, -1F, -3F, -1F, 0F, -3F, -3F, 0F, -3F, -1F, -1F, -3F); // Box 46
		gunModel[6].setRotationPoint(-6F, -13F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 8, 7, 7, 0F, 1F, 1F, -3F, -3F, 0F, -3F, -1F, 0F, -3F, 3F, 1F, -3F, 3F, -3F, -3F, -4F, -2F, -3F, -2F, 0F, -3F, 5F, -1F, -3F); // Box 47
		gunModel[7].setRotationPoint(-8F, 2F, -6F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 8, 11, 7, 0F, -2F, 1F, -3F, -1F, 0F, -3F, 1F, 0F, -3F, 0F, 1F, -3F, 2F, -1F, -3F, -4F, 0F, -3F, -2F, 0F, -3F, 4F, -1F, -3F); // Box 48
		gunModel[8].setRotationPoint(-7F, -9F, -6F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F, 0F, 1F, -3F, -2F, 1F, -3F, 0F, 1F, -3F, 2F, 1F, -3F, -1F, -1F, -3F, -3F, 0F, -3F, -1F, 0F, -3F, 1F, -1F, -3F); // Box 49
		gunModel[9].setRotationPoint(-6F, -13F, -6F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[10].setRotationPoint(1F, -13F, -2F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 12
		gunModel[11].setRotationPoint(1F, -8F, -2F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 13
		gunModel[12].setRotationPoint(3F, -6F, -2F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 14
		gunModel[13].setRotationPoint(15F, -8F, -2F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[14].setRotationPoint(15F, -13F, -2F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[15].setRotationPoint(-6F, -19F, -5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 51, 3, 10, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[16].setRotationPoint(-8F, -22F, -5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 51, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 18
		gunModel[17].setRotationPoint(-8F, -15F, -5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 34, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 19
		gunModel[18].setRotationPoint(43F, -15F, -4F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 34, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[19].setRotationPoint(43F, -19F, -4F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 21
		gunModel[20].setRotationPoint(48F, -21F, -4F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[21].setRotationPoint(66F, -19F, -5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 23
		gunModel[22].setRotationPoint(66F, -15F, -5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[23].setRotationPoint(66F, -22F, -5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[24].setRotationPoint(68F, -19F, -5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 26
		gunModel[25].setRotationPoint(68F, -15F, -5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[26].setRotationPoint(68F, -22F, -5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 28
		gunModel[27].setRotationPoint(70F, -19F, -5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 30
		gunModel[28].setRotationPoint(70F, -22F, -5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F); // Box 31
		gunModel[29].setRotationPoint(70F, -15F, -5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 32
		gunModel[30].setRotationPoint(27F, -14.5F, -5.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[31].setRotationPoint(27F, -19.5F, -5.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[32].setRotationPoint(27F, -22.5F, -5.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 15, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[33].setRotationPoint(62F, -21F, -4F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[34].setRotationPoint(48F, -21F, 0F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[35].setRotationPoint(43F, -21F, -4F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 41, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		gunModel[36].setRotationPoint(-6F, -16F, -5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 51, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[37].setRotationPoint(-8F, -19F, -3F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[38].setRotationPoint(27F, -15.5F, -5.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[39].setRotationPoint(27F, -19.5F, 2.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[40].setRotationPoint(35F, -19F, -5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[41].setRotationPoint(-8F, -19F, -5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 14, 3, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 45
		gunModel[42].setRotationPoint(-22F, -14.5F, -5.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 14, 5, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[43].setRotationPoint(-22F, -19.5F, -5.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 14, 3, 11, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[44].setRotationPoint(-22F, -22.5F, -5.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[45].setRotationPoint(77F, -18.5F, -3F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[46].setRotationPoint(77F, -16.5F, -3F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[47].setRotationPoint(77F, -18.5F, 2F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		gunModel[48].setRotationPoint(77F, -16.5F, 2F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		gunModel[49].setRotationPoint(77F, -20F, -1.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[50].setRotationPoint(77F, -20F, 0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 53, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[51].setRotationPoint(77F, -15F, -1.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[52].setRotationPoint(80F, -17.5F, 2F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		gunModel[53].setRotationPoint(86F, -17.5F, 2F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[54].setRotationPoint(92F, -17.5F, 2F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		gunModel[55].setRotationPoint(98F, -17.5F, 2F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[56].setRotationPoint(104F, -17.5F, 2F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[57].setRotationPoint(80F, -17.5F, -3F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[58].setRotationPoint(86F, -17.5F, -3F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[59].setRotationPoint(92F, -17.5F, -3F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		gunModel[60].setRotationPoint(98F, -17.5F, -3F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[61].setRotationPoint(104F, -17.5F, -3F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[62].setRotationPoint(80F, -20F, -0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		gunModel[63].setRotationPoint(86F, -20F, -0.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		gunModel[64].setRotationPoint(92F, -20F, -0.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		gunModel[65].setRotationPoint(98F, -20F, -0.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		gunModel[66].setRotationPoint(104F, -20F, -0.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		gunModel[67].setRotationPoint(83F, -19.5F, -3F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		gunModel[68].setRotationPoint(89F, -19.5F, -3F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		gunModel[69].setRotationPoint(95F, -19.5F, -3F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		gunModel[70].setRotationPoint(101F, -19.5F, -3F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		gunModel[71].setRotationPoint(107F, -19.5F, -3F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		gunModel[72].setRotationPoint(113F, -19.5F, -3F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		gunModel[73].setRotationPoint(83F, -19.5F, 2F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		gunModel[74].setRotationPoint(89F, -19.5F, 2F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		gunModel[75].setRotationPoint(95F, -19.5F, 2F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		gunModel[76].setRotationPoint(101F, -19.5F, 2F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		gunModel[77].setRotationPoint(107F, -19.5F, 2F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		gunModel[78].setRotationPoint(113F, -19.5F, 2F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 96
		gunModel[79].setRotationPoint(83F, -15.5F, 2F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 97
		gunModel[80].setRotationPoint(89F, -15.5F, 2F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 98
		gunModel[81].setRotationPoint(95F, -15.5F, 2F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 99
		gunModel[82].setRotationPoint(101F, -15.5F, 2F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 100
		gunModel[83].setRotationPoint(107F, -15.5F, 2F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 101
		gunModel[84].setRotationPoint(113F, -15.5F, 2F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 102
		gunModel[85].setRotationPoint(113F, -15.5F, -3F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 103
		gunModel[86].setRotationPoint(107F, -15.5F, -3F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 104
		gunModel[87].setRotationPoint(101F, -15.5F, -3F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 105
		gunModel[88].setRotationPoint(95F, -15.5F, -3F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 106
		gunModel[89].setRotationPoint(89F, -15.5F, -3F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 107
		gunModel[90].setRotationPoint(83F, -15.5F, -3F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 65, 3, 3, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 109
		gunModel[91].setRotationPoint(77F, -18.5F, -1.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 43, 4, 4, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 136
		gunModel[92].setRotationPoint(-65F, -18F, -2F);
		gunModel[92].rotateAngleZ = 0.02617994F;

		gunModel[93].addShapeBox(0F, 0F, 0F, 2, 13, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		gunModel[93].setRotationPoint(-67F, -21F, -2.5F);

		gunModel[94].addShapeBox(-2F, 0F, 0F, 2, 9, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		gunModel[94].setRotationPoint(-65F, -8F, -2.5F);
		gunModel[94].rotateAngleZ = -0.34906585F;

		gunModel[95].addShapeBox(-2F, -9F, 0F, 2, 9, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		gunModel[95].setRotationPoint(-65F, -21F, -2.5F);
		gunModel[95].rotateAngleZ = 0.41887902F;

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 141
		gunModel[96].setRotationPoint(-65F, -18F, -2F);

		gunModel[97].addShapeBox(4F, 0F, 0F, 18, 4, 4, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 142
		gunModel[97].setRotationPoint(-65F, -18F, -2F);
		gunModel[97].rotateAngleZ = 0.02617994F;

		gunModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		gunModel[98].setRotationPoint(110F, -17.5F, 2F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		gunModel[99].setRotationPoint(110F, -17.5F, -3F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		gunModel[100].setRotationPoint(110F, -20F, -0.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		gunModel[101].setRotationPoint(125F, -19.5F, 2F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		gunModel[102].setRotationPoint(119F, -19.5F, 2F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		gunModel[103].setRotationPoint(122F, -17.5F, 2F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		gunModel[104].setRotationPoint(128F, -17.5F, 2F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		gunModel[105].setRotationPoint(125F, -19.5F, -3F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		gunModel[106].setRotationPoint(119F, -19.5F, -3F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		gunModel[107].setRotationPoint(116F, -17.5F, -3F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		gunModel[108].setRotationPoint(122F, -17.5F, -3F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		gunModel[109].setRotationPoint(128F, -17.5F, -3F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 174
		gunModel[110].setRotationPoint(119F, -15.5F, 2F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 175
		gunModel[111].setRotationPoint(125F, -15.5F, 2F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 176
		gunModel[112].setRotationPoint(119F, -15.5F, -3F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 177
		gunModel[113].setRotationPoint(125F, -15.5F, -3F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		gunModel[114].setRotationPoint(77F, -19.5F, -3F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		gunModel[115].setRotationPoint(77F, -19.5F, 2F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 180
		gunModel[116].setRotationPoint(77F, -15.5F, -3F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 181
		gunModel[117].setRotationPoint(77F, -15.5F, 2F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		gunModel[118].setRotationPoint(116F, -20F, -0.5F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		gunModel[119].setRotationPoint(122F, -20F, -0.5F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		gunModel[120].setRotationPoint(128F, -20F, -0.5F);


		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 190

		defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, -0.3F, 0F, -4.75F, -0.3F, 0F, -4.75F, -0.3F, 0F, -4.75F, -0.3F, 0F, -4.75F, -0.3F, 5F, -4.4F, -0.3F, 5F, -4.4F, -0.3F, 5F, -4.4F, -0.3F, 5F, -4.4F); // Box 190
		defaultBarrelModel[0].setRotationPoint(76.2F, -29F, -5F);


		defaultGripModel = new ModelRendererTurbo[22];
		defaultGripModel[0] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 111
		defaultGripModel[1] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 113
		defaultGripModel[2] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 114
		defaultGripModel[3] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 116
		defaultGripModel[4] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 117
		defaultGripModel[5] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 119
		defaultGripModel[6] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 120
		defaultGripModel[7] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 121
		defaultGripModel[8] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 122
		defaultGripModel[9] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 123
		defaultGripModel[10] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 124
		defaultGripModel[11] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 125
		defaultGripModel[12] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 126
		defaultGripModel[13] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 127
		defaultGripModel[14] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 128
		defaultGripModel[15] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 129
		defaultGripModel[16] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 130
		defaultGripModel[17] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 131
		defaultGripModel[18] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 132
		defaultGripModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 133
		defaultGripModel[20] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 134
		defaultGripModel[21] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 135

		defaultGripModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		defaultGripModel[0].setRotationPoint(130F, -20F, -4.5F);

		defaultGripModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 113
		defaultGripModel[1].setRotationPoint(131F, -15.5F, -4F);

		defaultGripModel[2].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		defaultGripModel[2].setRotationPoint(131F, -19.5F, -4F);

		defaultGripModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 116
		defaultGripModel[3].setRotationPoint(135F, -15F, -4.5F);

		defaultGripModel[4].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		defaultGripModel[4].setRotationPoint(135F, -20F, -4.5F);

		defaultGripModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 119
		defaultGripModel[5].setRotationPoint(130F, -15F, -4.5F);

		defaultGripModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		defaultGripModel[6].setRotationPoint(130F, -22F, -4.5F);

		defaultGripModel[7].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		defaultGripModel[7].setRotationPoint(131F, -21.5F, -4F);

		defaultGripModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		defaultGripModel[8].setRotationPoint(135F, -22F, -4.5F);

		defaultGripModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		defaultGripModel[9].setRotationPoint(95F, -14.5F, -5F);

		defaultGripModel[10].addShapeBox(-0.5F, 0F, -3.5F, 1, 40, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		defaultGripModel[10].setRotationPoint(96.5F, -12.5F, 0F);
		defaultGripModel[10].rotateAngleX = -0.36651914F;

		defaultGripModel[11].addShapeBox(0.5F, 0F, -4F, 1, 40, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 125
		defaultGripModel[11].setRotationPoint(96.5F, -12.5F, 0F);
		defaultGripModel[11].rotateAngleX = -0.36651914F;

		defaultGripModel[12].addShapeBox(-1.5F, 0F, -4F, 1, 40, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 126
		defaultGripModel[12].setRotationPoint(96.5F, -12.5F, 0F);
		defaultGripModel[12].rotateAngleX = -0.36651914F;

		defaultGripModel[13].addShapeBox(0.5F, 0F, 1F, 1, 40, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 127
		defaultGripModel[13].setRotationPoint(96.5F, -12.5F, 0F);
		defaultGripModel[13].rotateAngleX = 0.36651914F;

		defaultGripModel[14].addShapeBox(-0.5F, 0F, 1.5F, 1, 40, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		defaultGripModel[14].setRotationPoint(96.5F, -12.5F, 0F);
		defaultGripModel[14].rotateAngleX = 0.36651914F;

		defaultGripModel[15].addShapeBox(-1.5F, 0F, 1F, 1, 40, 3, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 129
		defaultGripModel[15].setRotationPoint(96.5F, -12.5F, 0F);
		defaultGripModel[15].rotateAngleX = 0.36651914F;

		defaultGripModel[16].addShapeBox(0.5F, 0F, -4F, 3, 3, 5, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 130
		defaultGripModel[16].setRotationPoint(94.5F, -12.5F, 1.5F);

		defaultGripModel[17].addShapeBox(0.5F, 0F, -4F, 1, 5, 5, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 3F, -0.25F, 0F, 3F, -0.25F, 0F, 3F, -0.25F, 0F, 3F); // Box 131
		defaultGripModel[17].setRotationPoint(95.5F, -9.5F, 1.5F);

		defaultGripModel[18].addShapeBox(-1.5F, 40F, 0.5F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, 2F, 0F, 1F, 2F); // Box 132
		defaultGripModel[18].setRotationPoint(96.5F, -12.5F, 0F);
		defaultGripModel[18].rotateAngleX = 0.36651914F;

		defaultGripModel[19].addShapeBox(-0.5F, 38F, 17.5F, 1, 3, 1, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		defaultGripModel[19].setRotationPoint(96.5F, -12.5F, 0F);

		defaultGripModel[20].addShapeBox(-1.5F, 40F, -4.5F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, -2F, 1F, 0F, -2F, 1F); // Box 134
		defaultGripModel[20].setRotationPoint(96.5F, -12.5F, 0F);
		defaultGripModel[20].rotateAngleX = -0.36651914F;

		defaultGripModel[21].addShapeBox(-0.5F, 38F, -18.5F, 1, 3, 1, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		defaultGripModel[21].setRotationPoint(96.5F, -12.5F, 0F);


		ammoModel = new ModelRendererTurbo[26];
		ammoModel[0] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 185
		ammoModel[1] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 186
		ammoModel[2] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 187
		ammoModel[3] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 191
		ammoModel[4] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 192
		ammoModel[5] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 193
		ammoModel[6] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 194
		ammoModel[7] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 195
		ammoModel[8] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 196
		ammoModel[9] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 197
		ammoModel[10] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 198
		ammoModel[11] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 199
		ammoModel[12] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 200
		ammoModel[13] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 201
		ammoModel[14] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 203
		ammoModel[15] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 204
		ammoModel[16] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 205
		ammoModel[17] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 206
		ammoModel[18] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 207
		ammoModel[19] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 208
		ammoModel[20] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 209
		ammoModel[21] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 210
		ammoModel[22] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 211
		ammoModel[23] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 212
		ammoModel[24] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 213
		ammoModel[25] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 214

		ammoModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 185
		ammoModel[0].setRotationPoint(49.5F, -21.5F, -2F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 13, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		ammoModel[1].setRotationPoint(49F, -25.5F, -2F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 13, 29, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		ammoModel[2].setRotationPoint(49F, -25.5F, -20F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 13, 11, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		ammoModel[3].setRotationPoint(49F, -7.5F, -24F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		ammoModel[4].setRotationPoint(49F, -7.5F, -31F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 13, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		ammoModel[5].setRotationPoint(49F, -7.5F, -28F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 13, 9, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		ammoModel[6].setRotationPoint(49F, -23.5F, -28F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		ammoModel[7].setRotationPoint(49F, -19.5F, -31F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 13, 11, 4, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		ammoModel[8].setRotationPoint(49F, -25.5F, -24F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 13, 7, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		ammoModel[9].setRotationPoint(49F, -14.5F, -31F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 13, 11, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 198
		ammoModel[10].setRotationPoint(49F, -7.5F, -13F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 199
		ammoModel[11].setRotationPoint(49F, -7.5F, -5F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 13, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 200
		ammoModel[12].setRotationPoint(49F, -7.5F, -9F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 13, 18, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		ammoModel[13].setRotationPoint(49F, -25.5F, -13F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 13, 29, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		ammoModel[14].setRotationPoint(49F, -25.5F, 13F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 13, 11, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 204
		ammoModel[15].setRotationPoint(49F, -7.5F, 20F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9F, 0F, 0F, -4.9F, 0F); // Box 205
		ammoModel[16].setRotationPoint(49F, -7.5F, 28F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 13, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 206
		ammoModel[17].setRotationPoint(49F, -7.5F, 24F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 13, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		ammoModel[18].setRotationPoint(49F, -23.5F, 24F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9F, 0F, 0F, -4.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		ammoModel[19].setRotationPoint(49F, -19.5F, 28F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 13, 11, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		ammoModel[20].setRotationPoint(49F, -25.5F, 20F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 13, 7, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		ammoModel[21].setRotationPoint(49F, -14.5F, 20F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 13, 11, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		ammoModel[22].setRotationPoint(49F, -7.5F, 9F);

		ammoModel[23].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		ammoModel[23].setRotationPoint(49F, -7.5F, 2F);

		ammoModel[24].addShapeBox(0F, 0F, 0F, 13, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		ammoModel[24].setRotationPoint(49F, -7.5F, 5F);

		ammoModel[25].addShapeBox(0F, 0F, 0F, 13, 18, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		ammoModel[25].setRotationPoint(49F, -25.5F, 2F);


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 182
		slideModel[1] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 183
		slideModel[2] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 184

		slideModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Box 182
		slideModel[0].setRotationPoint(17F, -18F, -9F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Box 183
		slideModel[1].setRotationPoint(14F, -18F, -4F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		slideModel[2].setRotationPoint(17F, -18F, -11F);

		
		this.modelScale = 0.15F;

		translateAll = new Vector3f(0F, -15.1F, 0.0F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.TOP_RIFLE;
	    
		hasFlash = false;
	    
	    leftArmPos = new Vector3f(0.2F, -0.5F, 0.02F);
	    leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.10F, -0.52F, 0.02F);
	    leftArmReloadRot = new Vector3f(65.0F, 12.0F, -55.0F);
	    
	    rightArmPos = new Vector3f(0.28F, -0.7F, 0.0F);
	    rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    rightArmReloadPos = new Vector3f(0.75F, -0.55F, 0.1F);
	    rightArmReloadRot = new Vector3f(5.0F, 15.0F, -100.0F);
	    
	    rightArmChargePos = new Vector3f(0.47F, -0.39F, 0.14F);
	    rightArmChargeRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    
	    rightArmScale = new Vector3f(0.60F, 1.0F, 0.60F);
	    leftArmScale = new Vector3f(0.60F, 1.0F, 0.60F);

	    leftHandAmmo = false;
	    
		casingAnimDistance = new Vector3f(-5, -1, 12);
	    casingAnimSpread = new Vector3f(2, 2, 0);
	    casingAnimTime = 8;  
	    casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);
	    
		crouchZoom = -0.15F;
		fancyStance = true;
		sprintRotate = new Vector3f(10.0F, 60.0F, -0.0F);
		sprintTranslate = new Vector3f(1.75F, -0.10F, -0.65F);
		
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