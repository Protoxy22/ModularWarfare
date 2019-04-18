//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.08.2017 - 17:47:56
// Last changed on: 07.08.2017 - 17:47:56

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class pps43 extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public pps43() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[124];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 4
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 9
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 10
		gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
		gunModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 12
		gunModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 13
		gunModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 15
		gunModel[8] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 16
		gunModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 18
		gunModel[10] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 19
		gunModel[11] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 22
		gunModel[12] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 23
		gunModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 24
		gunModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 30
		gunModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 31
		gunModel[16] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 32
		gunModel[17] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 33
		gunModel[18] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 36
		gunModel[19] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 37
		gunModel[20] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 54
		gunModel[21] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 55
		gunModel[22] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 56
		gunModel[23] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 84
		gunModel[24] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 86
		gunModel[25] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 87
		gunModel[26] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 88
		gunModel[27] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 92
		gunModel[28] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 94
		gunModel[29] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 95
		gunModel[30] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 97
		gunModel[31] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 98
		gunModel[32] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 100
		gunModel[33] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 101
		gunModel[34] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 103
		gunModel[35] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 104
		gunModel[36] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 105
		gunModel[37] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 106
		gunModel[38] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 107
		gunModel[39] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 108
		gunModel[40] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 113
		gunModel[41] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 114
		gunModel[42] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 115
		gunModel[43] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 116
		gunModel[44] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 148
		gunModel[45] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 149
		gunModel[46] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 150
		gunModel[47] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 151
		gunModel[48] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 152
		gunModel[49] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 98
		gunModel[50] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 99
		gunModel[51] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 100
		gunModel[52] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 101
		gunModel[53] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 102
		gunModel[54] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 103
		gunModel[55] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 104
		gunModel[56] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 105
		gunModel[57] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 106
		gunModel[58] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 107
		gunModel[59] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 108
		gunModel[60] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 109
		gunModel[61] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 110
		gunModel[62] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 111
		gunModel[63] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 112
		gunModel[64] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 113
		gunModel[65] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 114
		gunModel[66] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 115
		gunModel[67] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 116
		gunModel[68] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 117
		gunModel[69] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 118
		gunModel[70] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 119
		gunModel[71] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 120
		gunModel[72] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 121
		gunModel[73] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 122
		gunModel[74] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 123
		gunModel[75] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 124
		gunModel[76] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 125
		gunModel[77] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 126
		gunModel[78] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 127
		gunModel[79] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 128
		gunModel[80] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 129
		gunModel[81] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 130
		gunModel[82] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 131
		gunModel[83] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 132
		gunModel[84] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 133
		gunModel[85] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 134
		gunModel[86] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 135
		gunModel[87] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 136
		gunModel[88] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 137
		gunModel[89] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 138
		gunModel[90] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 139
		gunModel[91] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 140
		gunModel[92] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 141
		gunModel[93] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 142
		gunModel[94] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 143
		gunModel[95] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 144
		gunModel[96] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 145
		gunModel[97] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 146
		gunModel[98] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 147
		gunModel[99] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 148
		gunModel[100] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 149
		gunModel[101] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 150
		gunModel[102] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 151
		gunModel[103] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 152
		gunModel[104] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 204
		gunModel[105] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 205
		gunModel[106] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 206
		gunModel[107] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 207
		gunModel[108] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 208
		gunModel[109] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 209
		gunModel[110] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 210
		gunModel[111] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 211
		gunModel[112] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 212
		gunModel[113] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 213
		gunModel[114] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 214
		gunModel[115] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 215
		gunModel[116] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 217
		gunModel[117] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 218
		gunModel[118] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 219
		gunModel[119] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 220
		gunModel[120] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 221
		gunModel[121] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 222
		gunModel[122] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 223
		gunModel[123] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 224

		gunModel[0].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 3
		gunModel[0].setRotationPoint(-3F, -11F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 7, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, -3F, 0F, -5F, 0F, 0F, -6F, -1F, 0F, 2F, -3F, 0F); // Box 4
		gunModel[1].setRotationPoint(-3F, -10F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -3F, -2F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -4F, -1F, 0F, -1F, -2F, 0F); // Box 9
		gunModel[2].setRotationPoint(-6F, 0F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[3].setRotationPoint(-3F, -11F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 7, 13, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, -6F, -1F, 0F, -5F, 0F, 0F, 3F, -3F, 0F); // Box 11
		gunModel[4].setRotationPoint(-3F, -10F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, -1F, 0F, 0F, -3F, -2F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -4F, -1F, 0F, -3F, 0F, 0F, 0F, -2F, 0F); // Box 12
		gunModel[5].setRotationPoint(-6F, 0F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[6].setRotationPoint(-3F, -12F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 32, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 15
		gunModel[7].setRotationPoint(-5.5F, -14F, -1F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 48, 1, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[8].setRotationPoint(-5.5F, -15F, -1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 48, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[9].setRotationPoint(-5.5F, -16.5F, -1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 15, 3, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 19
		gunModel[10].setRotationPoint(1F, -13.9F, -2F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[11].setRotationPoint(28F, -13.99F, -1.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 26, 1, 5, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 23
		gunModel[12].setRotationPoint(1F, -16.25F, -2.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 33, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[13].setRotationPoint(1F, -17.5F, -2.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.5F); // Box 30
		gunModel[14].setRotationPoint(-3F, -14.25F, -2F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 31
		gunModel[15].setRotationPoint(-3F, -16.25F, -2F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 32
		gunModel[16].setRotationPoint(-3F, -17.25F, -2F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, 0F, 0F); // Box 33
		gunModel[17].setRotationPoint(16F, -13.9F, -2F);

		gunModel[18].addShapeBox(44.5F, -14F, -2F, 6, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[18].setRotationPoint(-9.5F, 6.5F, 0F);
		gunModel[18].rotateAngleZ = 0.12217305F;

		gunModel[19].addShapeBox(44.5F, -8F, -2F, 6, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 37
		gunModel[19].setRotationPoint(-9.5F, 6.5F, 0F);
		gunModel[19].rotateAngleZ = 0.12217305F;

		gunModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 54
		gunModel[20].setRotationPoint(-5F, -15.25F, -1.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 55
		gunModel[21].setRotationPoint(-5F, -14F, -1.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[22].setRotationPoint(-5F, -16.75F, -1.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0F, 0.15F); // Box 84
		gunModel[23].setRotationPoint(16F, -11.9F, -2F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F); // Box 86
		gunModel[24].setRotationPoint(-1F, -16.25F, -2F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F); // Box 87
		gunModel[25].setRotationPoint(-1F, -17.25F, -2F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -1F); // Box 88
		gunModel[26].setRotationPoint(-1F, -14.25F, -2F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 92
		gunModel[27].setRotationPoint(2F, -16.25F, -2.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 94
		gunModel[28].setRotationPoint(2F, -17.75F, -2.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 95
		gunModel[29].setRotationPoint(2F, -13.75F, -2.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 97
		gunModel[30].setRotationPoint(29.5F, -16.25F, -2.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 98
		gunModel[31].setRotationPoint(29.5F, -17.75F, -2.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 100
		gunModel[32].setRotationPoint(38.5F, -16.25F, -2.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 101
		gunModel[33].setRotationPoint(38.5F, -17.75F, -2.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 103
		gunModel[34].setRotationPoint(41.5F, -16.25F, -2.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 104
		gunModel[35].setRotationPoint(41.5F, -17.75F, -2.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 105
		gunModel[36].setRotationPoint(38F, -16.25F, -2.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		gunModel[37].setRotationPoint(38F, -17.5F, -2.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 107
		gunModel[38].setRotationPoint(34F, -15.25F, -2.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gunModel[39].setRotationPoint(34F, -17.5F, -1.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		gunModel[40].setRotationPoint(1F, -15F, -2.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		gunModel[41].setRotationPoint(29F, -16F, -2.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		gunModel[42].setRotationPoint(7F, -15F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 116
		gunModel[43].setRotationPoint(27F, -16.25F, 0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		gunModel[44].setRotationPoint(13F, -11F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.9F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F); // Box 149
		gunModel[45].setRotationPoint(11F, -9F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 150
		gunModel[46].setRotationPoint(2F, -8F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 151
		gunModel[47].setRotationPoint(3F, -7F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 152
		gunModel[48].setRotationPoint(6.5F, -12.75F, -0.5F);
		gunModel[48].rotateAngleZ = 0.08726646F;

		gunModel[49].addShapeBox(0F, 0F, 0F, 19, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 98
		gunModel[49].setRotationPoint(31F, -14F, -2.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 99
		gunModel[50].setRotationPoint(50F, -15F, -1.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 100
		gunModel[51].setRotationPoint(50F, -17F, -1.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 101
		gunModel[52].setRotationPoint(50F, -16.5F, -2F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 102
		gunModel[53].setRotationPoint(53F, -16.5F, -2F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		gunModel[54].setRotationPoint(55F, -16.5F, -2F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 104
		gunModel[55].setRotationPoint(57F, -16.5F, -2F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 105
		gunModel[56].setRotationPoint(59F, -16.5F, -2F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 106
		gunModel[57].setRotationPoint(61F, -16.5F, -2F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[58].setRotationPoint(50F, -16.5F, 1F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gunModel[59].setRotationPoint(53F, -16.5F, 1F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		gunModel[60].setRotationPoint(55F, -16.5F, 1F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[61].setRotationPoint(57F, -16.5F, 1F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[62].setRotationPoint(59F, -16.5F, 1F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[63].setRotationPoint(61F, -16.5F, 1F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		gunModel[64].setRotationPoint(63F, -16.5F, 1F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
		gunModel[65].setRotationPoint(63F, -16.5F, -2F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		gunModel[66].setRotationPoint(65F, -16.5F, 1F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 116
		gunModel[67].setRotationPoint(65F, -16.5F, -2F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 117
		gunModel[68].setRotationPoint(64F, -16.5F, 1F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		gunModel[69].setRotationPoint(64F, -15.5F, 1F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 119
		gunModel[70].setRotationPoint(64F, -16.5F, -2F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 120
		gunModel[71].setRotationPoint(64F, -15.5F, -2F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 121
		gunModel[72].setRotationPoint(62F, -16.5F, 1F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		gunModel[73].setRotationPoint(62F, -15.5F, 1F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 123
		gunModel[74].setRotationPoint(62F, -16.5F, -2F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 124
		gunModel[75].setRotationPoint(62F, -15.5F, -2F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 125
		gunModel[76].setRotationPoint(60F, -16.5F, 1F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		gunModel[77].setRotationPoint(60F, -15.5F, 1F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 127
		gunModel[78].setRotationPoint(60F, -16.5F, -2F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		gunModel[79].setRotationPoint(60F, -15.5F, -2F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 129
		gunModel[80].setRotationPoint(58F, -16.5F, 1F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		gunModel[81].setRotationPoint(58F, -15.5F, 1F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 131
		gunModel[82].setRotationPoint(58F, -16.5F, -2F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 132
		gunModel[83].setRotationPoint(58F, -15.5F, -2F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 133
		gunModel[84].setRotationPoint(56F, -16.5F, 1F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		gunModel[85].setRotationPoint(56F, -15.5F, 1F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 135
		gunModel[86].setRotationPoint(56F, -16.5F, -2F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 136
		gunModel[87].setRotationPoint(56F, -15.5F, -2F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 137
		gunModel[88].setRotationPoint(54F, -16.5F, 1F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		gunModel[89].setRotationPoint(54F, -15.5F, 1F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 139
		gunModel[90].setRotationPoint(54F, -16.5F, -2F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 140
		gunModel[91].setRotationPoint(54F, -15.5F, -2F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 141
		gunModel[92].setRotationPoint(52F, -16.5F, 1F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		gunModel[93].setRotationPoint(52F, -15.5F, 1F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 143
		gunModel[94].setRotationPoint(52F, -16.5F, -2F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 144
		gunModel[95].setRotationPoint(52F, -15.5F, -2F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 145
		gunModel[96].setRotationPoint(66F, -17F, -1.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0.5F); // Box 146
		gunModel[97].setRotationPoint(67F, -17F, -0.5F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 147
		gunModel[98].setRotationPoint(69F, -17.5F, -1.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		gunModel[99].setRotationPoint(69F, -14.5F, -1.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 149
		gunModel[100].setRotationPoint(72F, -17.5F, -1.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 150
		gunModel[101].setRotationPoint(72F, -17.5F, 0.5F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 151
		gunModel[102].setRotationPoint(72F, -17.5F, -1F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 152
		gunModel[103].setRotationPoint(72F, -14.5F, -1F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		gunModel[104].setRotationPoint(18.5F, -18F, -1F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		gunModel[105].setRotationPoint(22.5F, -18F, -1F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		gunModel[106].setRotationPoint(17.5F, -18F, -1F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 207
		gunModel[107].setRotationPoint(19.5F, -19.2F, -1.4F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.3F, -0.25F, -1F, -0.3F, -0.25F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 208
		gunModel[108].setRotationPoint(21.5F, -19.2F, -1.4F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, -1F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F); // Box 209
		gunModel[109].setRotationPoint(18.5F, -19.2F, -1.4F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 210
		gunModel[110].setRotationPoint(19.5F, -19.2F, 0.4F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.3F, -0.25F, -1F, -0.3F, -0.25F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 211
		gunModel[111].setRotationPoint(21.5F, -19.2F, 0.4F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, -1F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F); // Box 212
		gunModel[112].setRotationPoint(18.5F, -19.2F, 0.4F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F); // Box 213
		gunModel[113].setRotationPoint(63.75F, -19.15F, -1.2F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F); // Box 214
		gunModel[114].setRotationPoint(63.75F, -19.15F, 0.2F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 215
		gunModel[115].setRotationPoint(63.75F, -19.82F, -1F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F); // Box 217
		gunModel[116].setRotationPoint(65.75F, -19.15F, 0.2F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, -0.3F); // Box 218
		gunModel[117].setRotationPoint(65.75F, -19.15F, -1.2F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 219
		gunModel[118].setRotationPoint(62.75F, -17.9F, 0.2F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 220
		gunModel[119].setRotationPoint(66.75F, -18.15F, 0.2F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 221
		gunModel[120].setRotationPoint(62.75F, -17.9F, -1.2F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 222
		gunModel[121].setRotationPoint(66.75F, -18.15F, -1.2F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 1F, 0.25F, -0.5F, 1F, 0.25F, -0.5F, 1F, 0.25F, -0.5F, 1F, 0.25F, -0.5F); // Box 223
		gunModel[122].setRotationPoint(63.75F, -18.15F, -1F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 224
		gunModel[123].setRotationPoint(64.75F, -18.9F, -0.5F);


		defaultStockModel = new ModelRendererTurbo[18];
		defaultStockModel[0] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 57
		defaultStockModel[1] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 58
		defaultStockModel[2] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 59
		defaultStockModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 60
		defaultStockModel[4] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 61
		defaultStockModel[5] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 62
		defaultStockModel[6] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 63
		defaultStockModel[7] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 64
		defaultStockModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 65
		defaultStockModel[9] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 67
		defaultStockModel[10] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 68
		defaultStockModel[11] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 69
		defaultStockModel[12] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 70
		defaultStockModel[13] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 71
		defaultStockModel[14] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 73
		defaultStockModel[15] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 79
		defaultStockModel[16] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 80
		defaultStockModel[17] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 81

		defaultStockModel[0].addShapeBox(-29F, -0.5F, 0F, 30, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		defaultStockModel[0].setRotationPoint(-3F, -14.5F, -2.25F);
		defaultStockModel[0].rotateAngleZ = 0.19198622F;

		defaultStockModel[1].addShapeBox(-1F, -1F, 0.25F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		defaultStockModel[1].setRotationPoint(-3F, -14.5F, -2F);
		defaultStockModel[1].rotateAngleZ = 0.08726646F;

		defaultStockModel[2].addShapeBox(-1F, -1F, 2.75F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		defaultStockModel[2].setRotationPoint(-3F, -14.5F, -2F);
		defaultStockModel[2].rotateAngleZ = 0.08726646F;

		defaultStockModel[3].addShapeBox(-29F, -0.5F, 3.5F, 30, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 60
		defaultStockModel[3].setRotationPoint(-3F, -14.5F, -2.25F);
		defaultStockModel[3].rotateAngleZ = 0.19198622F;

		defaultStockModel[4].addShapeBox(-30F, -0.5F, 3.5F, 3, 1, 1, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 61
		defaultStockModel[4].setRotationPoint(-3F, -14.5F, -2.25F);
		defaultStockModel[4].rotateAngleZ = 0.19198622F;

		defaultStockModel[5].addShapeBox(-30F, -0.5F, 0F, 3, 1, 1, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 62
		defaultStockModel[5].setRotationPoint(-3F, -14.5F, -2.25F);
		defaultStockModel[5].rotateAngleZ = 0.19198622F;

		defaultStockModel[6].addShapeBox(-30.25F, -0.25F, 3.5F, 1, 8, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F); // Box 63
		defaultStockModel[6].setRotationPoint(-3F, -12.5F, -2.25F);

		defaultStockModel[7].addShapeBox(-30.25F, -0.25F, 0F, 1, 8, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F); // Box 64
		defaultStockModel[7].setRotationPoint(-3F, -12.5F, -2.25F);

		defaultStockModel[8].addShapeBox(-30.25F, -2.5F, 3.5F, 1, 2, 1, 0F, 1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, 1F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F); // Box 65
		defaultStockModel[8].setRotationPoint(-3F, -12.5F, -2.25F);

		defaultStockModel[9].addShapeBox(-30.25F, -2.5F, 0F, 1, 2, 1, 0F, 1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, 1F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F); // Box 67
		defaultStockModel[9].setRotationPoint(-3F, -12.5F, -2.25F);

		defaultStockModel[10].addShapeBox(-30.25F, 8F, 3.5F, 1, 2, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, 1F, 0.15F, 0.1F); // Box 68
		defaultStockModel[10].setRotationPoint(-3F, -12.5F, -2.25F);

		defaultStockModel[11].addShapeBox(-30.25F, 8F, 0F, 1, 2, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, 1F, 0.15F, 0.1F); // Box 69
		defaultStockModel[11].setRotationPoint(-3F, -12.5F, -2.25F);

		defaultStockModel[12].addShapeBox(-31.25F, 10.25F, 3.5F, 1, 1, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 1F, 0.15F, 1.1F, -1F, 0.15F, 1.1F, -1F, 0.15F, -0.9F, 1F, 0.15F, -0.9F); // Box 70
		defaultStockModel[12].setRotationPoint(-3F, -12.5F, -2.25F);

		defaultStockModel[13].addShapeBox(-31.25F, 10.25F, 0F, 1, 1, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 1F, 0.15F, -0.9F, -1F, 0.15F, -0.9F, -1F, 0.15F, 1.1F, 1F, 0.15F, 1.1F); // Box 71
		defaultStockModel[13].setRotationPoint(-3F, -12.5F, -2.25F);

		defaultStockModel[14].addShapeBox(-32.25F, 11.5F, 1.25F, 1, 1, 2, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 73
		defaultStockModel[14].setRotationPoint(-3F, -12.6F, -2.25F);

		defaultStockModel[15].addShapeBox(-31.25F, -3.8F, 3.5F, 1, 1, 1, 0F, 1F, 0.15F, 1.1F, -1F, 0.15F, 1.1F, -1F, 0.15F, -0.9F, 1F, 0.15F, -0.9F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F); // Box 79
		defaultStockModel[15].setRotationPoint(-3F, -12.5F, -2.25F);

		defaultStockModel[16].addShapeBox(-31.25F, -3.8F, 0F, 1, 1, 1, 0F, 1F, 0.15F, -0.9F, -1F, 0.15F, -0.9F, -1F, 0.15F, 1.1F, 1F, 0.15F, 1.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F); // Box 80
		defaultStockModel[16].setRotationPoint(-3F, -12.5F, -2.25F);

		defaultStockModel[17].addShapeBox(-32.25F, -4.85F, 1.25F, 1, 1, 2, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F); // Box 81
		defaultStockModel[17].setRotationPoint(-3F, -12.6F, -2.25F);


		ammoModel = new ModelRendererTurbo[4];
		ammoModel[0] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 153
		ammoModel[1] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 154
		ammoModel[2] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 155
		ammoModel[3] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 156

		ammoModel[0].addShapeBox(35.25F, -1.5F, -3.5F, 5, 6, 3, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -2F, 0F, 0F); // Box 153
		ammoModel[0].setRotationPoint(0.5F, 2.5F, 2F);
		ammoModel[0].rotateAngleZ = 0.05235988F;

		ammoModel[1].addShapeBox(37.25F, 4.5F, -3.5F, 5, 6, 3, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.5F, -3F, 0F, 2.5F, -3F, 0F, -3F, 0F, 0F); // Box 154
		ammoModel[1].setRotationPoint(0.5F, 2.5F, 2F);
		ammoModel[1].rotateAngleZ = 0.05235988F;

		ammoModel[2].addShapeBox(40.25F, 10.5F, -3.5F, 5, 6, 3, 0F, 0F, 0F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3.25F, -4F, 0F, 3.25F, -4F, 0F, -4F, 0F, 0F); // Box 155
		ammoModel[2].setRotationPoint(0.5F, 2.5F, 2F);
		ammoModel[2].rotateAngleZ = 0.05235988F;

		ammoModel[3].addShapeBox(32.75F, -7.5F, -3.5F, 5, 6, 3, 0F, -1F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, 2.5F, -1F, 0F, 2.5F, -1F, 0F, -2F, 0F, 0F); // Box 156
		ammoModel[3].setRotationPoint(0.5F, 2.5F, 2F);
		ammoModel[3].rotateAngleZ = 0.05235988F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 145
		slideModel[1] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 146

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 145
		slideModel[0].setRotationPoint(25F, -15F, -3.75F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 146
		slideModel[1].setRotationPoint(25F, -15F, -3.95F);


		this.modelScale = 0.25F;

		translateAll = new Vector3f(0F, -7F, -0.01F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.RIFLE2;
	    
		hasFlash = false;
	    
	    leftArmPos = new Vector3f(0.18F, -0.57F, 0.0F);
	    leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.450F, -0.80F, 0.02F);
	    leftArmReloadRot = new Vector3f(35.0F, 0.0F, -45.0F);
	    
	    rightArmPos = new Vector3f(0.34F, -0.55F, 0.02F);
	    rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    rightArmReloadPos = new Vector3f(0.34F, -0.55F, 0.02F);
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