//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.12.2017 - 01:20:35
// Last changed on: 10.12.2017 - 01:20:35

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class sterling extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public sterling() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[153];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 15
		gunModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 16
		gunModel[7] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 17
		gunModel[8] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 23
		gunModel[9] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 24
		gunModel[10] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 25
		gunModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 26
		gunModel[12] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 27
		gunModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 32
		gunModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 34
		gunModel[15] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 40
		gunModel[16] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 55
		gunModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 56
		gunModel[18] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 94
		gunModel[19] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 95
		gunModel[20] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 96
		gunModel[21] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 97
		gunModel[22] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 98
		gunModel[23] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 99
		gunModel[24] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 100
		gunModel[25] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 101
		gunModel[26] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 102
		gunModel[27] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 103
		gunModel[28] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 104
		gunModel[29] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 105
		gunModel[30] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 106
		gunModel[31] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 107
		gunModel[32] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 108
		gunModel[33] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 109
		gunModel[34] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 110
		gunModel[35] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 111
		gunModel[36] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 112
		gunModel[37] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 113
		gunModel[38] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 114
		gunModel[39] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 115
		gunModel[40] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 116
		gunModel[41] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 117
		gunModel[42] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 118
		gunModel[43] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 119
		gunModel[44] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 91
		gunModel[45] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 92
		gunModel[46] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 93
		gunModel[47] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 94
		gunModel[48] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 95
		gunModel[49] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 96
		gunModel[50] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 97
		gunModel[51] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 98
		gunModel[52] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 99
		gunModel[53] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 100
		gunModel[54] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 101
		gunModel[55] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 102
		gunModel[56] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 103
		gunModel[57] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 104
		gunModel[58] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 105
		gunModel[59] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 106
		gunModel[60] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 107
		gunModel[61] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 108
		gunModel[62] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 109
		gunModel[63] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 110
		gunModel[64] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 111
		gunModel[65] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 112
		gunModel[66] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 113
		gunModel[67] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 125
		gunModel[68] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 126
		gunModel[69] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 127
		gunModel[70] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 128
		gunModel[71] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 129
		gunModel[72] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 130
		gunModel[73] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 131
		gunModel[74] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 132
		gunModel[75] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 133
		gunModel[76] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 134
		gunModel[77] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 135
		gunModel[78] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 136
		gunModel[79] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 137
		gunModel[80] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 138
		gunModel[81] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 139
		gunModel[82] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 140
		gunModel[83] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 141
		gunModel[84] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 142
		gunModel[85] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 143
		gunModel[86] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 144
		gunModel[87] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 145
		gunModel[88] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 146
		gunModel[89] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 147
		gunModel[90] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 148
		gunModel[91] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 149
		gunModel[92] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 150
		gunModel[93] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 151
		gunModel[94] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 152
		gunModel[95] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 153
		gunModel[96] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 154
		gunModel[97] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 155
		gunModel[98] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 156
		gunModel[99] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 157
		gunModel[100] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 158
		gunModel[101] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 159
		gunModel[102] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 160
		gunModel[103] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 161
		gunModel[104] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 162
		gunModel[105] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 163
		gunModel[106] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 164
		gunModel[107] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 165
		gunModel[108] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 168
		gunModel[109] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 170
		gunModel[110] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 171
		gunModel[111] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 172
		gunModel[112] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 173
		gunModel[113] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 174
		gunModel[114] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 10
		gunModel[115] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 11
		gunModel[116] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 12
		gunModel[117] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 183
		gunModel[118] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 184
		gunModel[119] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 185
		gunModel[120] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 186
		gunModel[121] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 187
		gunModel[122] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 188
		gunModel[123] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 189
		gunModel[124] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 190
		gunModel[125] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 191
		gunModel[126] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 192
		gunModel[127] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 193
		gunModel[128] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 194
		gunModel[129] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 195
		gunModel[130] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 196
		gunModel[131] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 197
		gunModel[132] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 199
		gunModel[133] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 201
		gunModel[134] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 202
		gunModel[135] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 203
		gunModel[136] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 204
		gunModel[137] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 205
		gunModel[138] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 206
		gunModel[139] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 207
		gunModel[140] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 208
		gunModel[141] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 209
		gunModel[142] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 210
		gunModel[143] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 212
		gunModel[144] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 213
		gunModel[145] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 214
		gunModel[146] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 215
		gunModel[147] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 216
		gunModel[148] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 217
		gunModel[149] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 218
		gunModel[150] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 155
		gunModel[151] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 156
		gunModel[152] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 157

		gunModel[0].addShapeBox(36F, -7.5F, -1F, 1, 6, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Box 0
		gunModel[0].setRotationPoint(-24F, -4F, 0F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addShapeBox(31F, -2.5F, -1F, 1, 1, 2, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 1
		gunModel[1].setRotationPoint(-24F, -4F, 0F);
		gunModel[1].rotateAngleZ = -0.08726646F;

		gunModel[2].addShapeBox(30F, -3.5F, -1F, 1, 2, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Box 2
		gunModel[2].setRotationPoint(-24F, -4F, 0F);
		gunModel[2].rotateAngleZ = -0.08726646F;

		gunModel[3].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(5F, -8.5F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F); // Box 6
		gunModel[4].setRotationPoint(8.5F, -7F, -1F);
		gunModel[4].rotateAngleZ = 0.13962634F;

		gunModel[5].addShapeBox(0F, 0F, 0F, 33, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 15
		gunModel[5].setRotationPoint(-10.5F, -9.5F, -2.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 33, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[6].setRotationPoint(-10.5F, -12.5F, -2.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 33, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[7].setRotationPoint(-10.5F, -13.5F, -2.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F); // Box 23
		gunModel[8].setRotationPoint(-14.5F, -9.5F, -2.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 24
		gunModel[9].setRotationPoint(-14.5F, -12.5F, -2.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 25
		gunModel[10].setRotationPoint(-14.5F, -13.5F, -2.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 24, 3, 3, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 26
		gunModel[11].setRotationPoint(21.5F, -12.5F, -1.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 27
		gunModel[12].setRotationPoint(14.5F, -12F, 2.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[13].setRotationPoint(23F, -12.5F, 1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 34
		gunModel[14].setRotationPoint(22.5F, -13.5F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[15].setRotationPoint(22.5F, -11.5F, -2.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 55
		gunModel[16].setRotationPoint(23.5F, -13.5F, -1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 56
		gunModel[17].setRotationPoint(23.5F, -13.5F, 0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 94
		gunModel[18].setRotationPoint(26.5F, -13.5F, -1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 95
		gunModel[19].setRotationPoint(26.5F, -13.5F, 0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 96
		gunModel[20].setRotationPoint(24.5F, -13.5F, -1.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 97
		gunModel[21].setRotationPoint(27.5F, -13.5F, -1.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 98
		gunModel[22].setRotationPoint(29.5F, -13.5F, 0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 99
		gunModel[23].setRotationPoint(29.5F, -13.5F, -1.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 100
		gunModel[24].setRotationPoint(30.5F, -13.5F, -1.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		gunModel[25].setRotationPoint(24.5F, -11.5F, -2.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		gunModel[26].setRotationPoint(30.5F, -11.5F, -2.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gunModel[27].setRotationPoint(27.5F, -11.5F, -2.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		gunModel[28].setRotationPoint(22.5F, -11.5F, 1.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		gunModel[29].setRotationPoint(24.5F, -11.5F, 1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		gunModel[30].setRotationPoint(30.5F, -11.5F, 1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[31].setRotationPoint(27.5F, -11.5F, 1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gunModel[32].setRotationPoint(24.5F, -9.5F, -1.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		gunModel[33].setRotationPoint(23.5F, -9.5F, -1.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[34].setRotationPoint(23.5F, -9.5F, 0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[35].setRotationPoint(22.5F, -9.5F, -1.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[36].setRotationPoint(26.5F, -9.5F, -1.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		gunModel[37].setRotationPoint(26.5F, -9.5F, 0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		gunModel[38].setRotationPoint(27.5F, -9.5F, -1.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		gunModel[39].setRotationPoint(29.5F, -9.5F, 0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		gunModel[40].setRotationPoint(30.5F, -9.5F, -1.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		gunModel[41].setRotationPoint(29.5F, -9.5F, -1.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.6F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.6F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 118
		gunModel[42].setRotationPoint(43.5F, -15F, 0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 119
		gunModel[43].setRotationPoint(-9.5F, -14.5F, -1.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		gunModel[44].setRotationPoint(26F, -12.5F, 1.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		gunModel[45].setRotationPoint(29F, -12.5F, 1.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		gunModel[46].setRotationPoint(26F, -10.5F, 1.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		gunModel[47].setRotationPoint(23F, -10.5F, 1.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		gunModel[48].setRotationPoint(29F, -10.5F, 1.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		gunModel[49].setRotationPoint(23F, -12.5F, -2.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		gunModel[50].setRotationPoint(26F, -12.5F, -2.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		gunModel[51].setRotationPoint(29F, -12.5F, -2.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		gunModel[52].setRotationPoint(26F, -10.5F, -2.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		gunModel[53].setRotationPoint(23F, -10.5F, -2.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		gunModel[54].setRotationPoint(29F, -10.5F, -2.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		gunModel[55].setRotationPoint(32.5F, -9.5F, -1.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gunModel[56].setRotationPoint(32.5F, -9.5F, 0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		gunModel[57].setRotationPoint(33.5F, -9.5F, -1.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		gunModel[58].setRotationPoint(35.5F, -9.5F, -1.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		gunModel[59].setRotationPoint(35.5F, -9.5F, 0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[60].setRotationPoint(36.5F, -9.5F, -1.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gunModel[61].setRotationPoint(38.5F, -9.5F, -1.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		gunModel[62].setRotationPoint(38.5F, -9.5F, 0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[63].setRotationPoint(39.5F, -9.5F, -1.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[64].setRotationPoint(41.5F, -9.5F, -1.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[65].setRotationPoint(41.5F, -9.5F, 0.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		gunModel[66].setRotationPoint(42.5F, -9.5F, -1.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 125
		gunModel[67].setRotationPoint(33.5F, -13.5F, -1.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 126
		gunModel[68].setRotationPoint(32.5F, -13.5F, 0.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 127
		gunModel[69].setRotationPoint(32.5F, -13.5F, -1.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		gunModel[70].setRotationPoint(32F, -12.5F, 1.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		gunModel[71].setRotationPoint(32F, -10.5F, 1.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		gunModel[72].setRotationPoint(33.5F, -11.5F, 1.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		gunModel[73].setRotationPoint(32F, -10.5F, -2.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		gunModel[74].setRotationPoint(32F, -12.5F, -2.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		gunModel[75].setRotationPoint(33.5F, -11.5F, -2.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 134
		gunModel[76].setRotationPoint(36.5F, -13.5F, -1.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 135
		gunModel[77].setRotationPoint(35.5F, -13.5F, 0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 136
		gunModel[78].setRotationPoint(35.5F, -13.5F, -1.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		gunModel[79].setRotationPoint(35F, -12.5F, 1.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		gunModel[80].setRotationPoint(35F, -10.5F, 1.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		gunModel[81].setRotationPoint(36.5F, -11.5F, 1.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		gunModel[82].setRotationPoint(35F, -10.5F, -2.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		gunModel[83].setRotationPoint(35F, -12.5F, -2.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		gunModel[84].setRotationPoint(36.5F, -11.5F, -2.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 143
		gunModel[85].setRotationPoint(39.5F, -13.5F, -1.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 144
		gunModel[86].setRotationPoint(38.5F, -13.5F, 0.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 145
		gunModel[87].setRotationPoint(38.5F, -13.5F, -1.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		gunModel[88].setRotationPoint(38F, -12.5F, 1.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		gunModel[89].setRotationPoint(38F, -10.5F, 1.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		gunModel[90].setRotationPoint(39.5F, -11.5F, 1.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		gunModel[91].setRotationPoint(38F, -10.5F, -2.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		gunModel[92].setRotationPoint(38F, -12.5F, -2.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		gunModel[93].setRotationPoint(39.5F, -11.5F, -2.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 152
		gunModel[94].setRotationPoint(42.5F, -13.5F, -1.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 153
		gunModel[95].setRotationPoint(41.5F, -13.5F, 0.5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 154
		gunModel[96].setRotationPoint(41.5F, -13.5F, -1.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		gunModel[97].setRotationPoint(41F, -12.5F, 1.5F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		gunModel[98].setRotationPoint(41F, -10.5F, 1.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		gunModel[99].setRotationPoint(42.5F, -11.5F, 1.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		gunModel[100].setRotationPoint(41F, -10.5F, -2.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		gunModel[101].setRotationPoint(41F, -12.5F, -2.5F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		gunModel[102].setRotationPoint(42.5F, -11.5F, -2.5F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		gunModel[103].setRotationPoint(43.5F, -12.5F, 1.5F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		gunModel[104].setRotationPoint(43.5F, -12.5F, -2.5F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		gunModel[105].setRotationPoint(43.5F, -10.5F, 1.5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		gunModel[106].setRotationPoint(43.5F, -10.5F, -2.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 165
		gunModel[107].setRotationPoint(12.5F, -12F, 2.5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 168
		gunModel[108].setRotationPoint(45F, -12F, -1F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F); // Box 170
		gunModel[109].setRotationPoint(42.15F, -16F, 0.5F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.6F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.6F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 171
		gunModel[110].setRotationPoint(43.5F, -15F, -1.5F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, -0.2F, 0.6F, 0F, -0.2F, 0.6F, 0F, -0.2F, -1F, 0F, -0.2F, -0.4F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F); // Box 172
		gunModel[111].setRotationPoint(40.8F, -15F, -1.5F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F); // Box 173
		gunModel[112].setRotationPoint(42.15F, -16F, -1.5F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, -0.2F, 0.6F, 0F, -0.2F, 0.6F, 0F, -0.2F, -1F, 0F, -0.2F, -0.4F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F); // Box 174
		gunModel[113].setRotationPoint(40.8F, -15F, 0.5F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 10
		gunModel[114].setRotationPoint(1F, -9F, -2F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 7, 11, 1, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -4F, -1F, 0F, -3F, 0F, 0F, 1F, -3F, 0F); // Box 11
		gunModel[115].setRotationPoint(0F, -8F, -2F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, -1F, 0F, 0F, -3F, -2F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -4F, -1F, 0F, -3F, 0F, 0F, 0F, -2F, 0F); // Box 12
		gunModel[116].setRotationPoint(-1F, 0F, -2F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 7, 11, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 1F, -3F, 0F, -3F, 0F, 0F, -4F, -1F, 0F, 0F, -3F, 0F); // Box 183
		gunModel[117].setRotationPoint(0F, -8F, 1F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -3F, -2F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -4F, -1F, 0F, -1F, -2F, 0F); // Box 184
		gunModel[118].setRotationPoint(-1F, 0F, 1F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 7, 11, 2, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, -3F, 0F); // Box 185
		gunModel[119].setRotationPoint(0F, -8F, -1F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F); // Box 186
		gunModel[120].setRotationPoint(-1F, 0F, -1F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 187
		gunModel[121].setRotationPoint(-9.5F, -15.5F, -1.5F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 188
		gunModel[122].setRotationPoint(-9.5F, -14.5F, 0.5F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 189
		gunModel[123].setRotationPoint(-9.5F, -15.5F, 0.5F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		gunModel[124].setRotationPoint(5F, -6.5F, -1F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 191
		gunModel[125].setRotationPoint(7F, -6.5F, -1F);

		gunModel[126].addShapeBox(35F, -2.5F, -1F, 1, 1, 2, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 192
		gunModel[126].setRotationPoint(-24F, -4F, 0F);
		gunModel[126].rotateAngleZ = -0.08726646F;

		gunModel[127].addShapeBox(31F, -1.5F, -1F, 5, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F); // Box 193
		gunModel[127].setRotationPoint(-24F, -4F, 0F);
		gunModel[127].rotateAngleZ = -0.08726646F;

		gunModel[128].addBox(0F, 0F, 0F, 2, 2, 7, 0F); // Box 194
		gunModel[128].setRotationPoint(-2F, -10F, -3.5F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 195
		gunModel[129].setRotationPoint(-2F, -10F, -3F);

		gunModel[130].addShapeBox(-15F, 0F, 0F, 15, 2, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 196
		gunModel[130].setRotationPoint(-2F, -10F, -3.4F);
		gunModel[130].rotateAngleZ = 0.13962634F;

		gunModel[131].addShapeBox(-15F, 0F, 0F, 15, 2, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 197
		gunModel[131].setRotationPoint(-2F, -10F, 2.4F);
		gunModel[131].rotateAngleZ = 0.13962634F;

		gunModel[132].addShapeBox(-18F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, -2.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 1.8F, 0F, 0F, -2.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 1.8F); // Box 199
		gunModel[132].setRotationPoint(-2F, -10F, -3.4F);
		gunModel[132].rotateAngleZ = 0.13962634F;

		gunModel[133].addShapeBox(-38F, 0F, 0F, 20, 2, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 201
		gunModel[133].setRotationPoint(-2F, -10F, -1.4F);
		gunModel[133].rotateAngleZ = 0.13962634F;

		gunModel[134].addShapeBox(-38F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 202
		gunModel[134].setRotationPoint(-2F, -10F, -0.5F);
		gunModel[134].rotateAngleZ = 0.13962634F;

		gunModel[135].addShapeBox(-18F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 1.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -2.2F, 0F, 0F, 1.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -2.2F); // Box 203
		gunModel[135].setRotationPoint(-2F, -10F, 2.4F);
		gunModel[135].rotateAngleZ = 0.13962634F;

		gunModel[136].addShapeBox(-38F, 0F, 0F, 20, 2, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 204
		gunModel[136].setRotationPoint(-2F, -10F, 0.4F);
		gunModel[136].rotateAngleZ = 0.13962634F;

		gunModel[137].addShapeBox(-35F, 0.1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 205
		gunModel[137].setRotationPoint(-2F, -10F, -0.5F);
		gunModel[137].rotateAngleZ = 0.13962634F;

		gunModel[138].addShapeBox(-29F, 0.1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 206
		gunModel[138].setRotationPoint(-2F, -10F, -0.5F);
		gunModel[138].rotateAngleZ = 0.13962634F;

		gunModel[139].addShapeBox(-32F, 0.1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 207
		gunModel[139].setRotationPoint(-2F, -10F, -0.5F);
		gunModel[139].rotateAngleZ = 0.13962634F;

		gunModel[140].addShapeBox(-23F, 0.1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 208
		gunModel[140].setRotationPoint(-2F, -10F, -0.5F);
		gunModel[140].rotateAngleZ = 0.13962634F;

		gunModel[141].addShapeBox(-26F, 0.1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 209
		gunModel[141].setRotationPoint(-2F, -10F, -0.5F);
		gunModel[141].rotateAngleZ = 0.13962634F;

		gunModel[142].addShapeBox(-20F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 210
		gunModel[142].setRotationPoint(-2F, -10F, -0.5F);
		gunModel[142].rotateAngleZ = 0.13962634F;

		gunModel[143].addShapeBox(-39F, 0F, 0F, 1, 13, 2, 0F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F); // Box 212
		gunModel[143].setRotationPoint(-2F, -10F, -1F);
		gunModel[143].rotateAngleZ = 0.13962634F;

		gunModel[144].addShapeBox(-38F, 0F, 0F, 1, 13, 1, 0F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0.25F, 0F, -0.9F, 0.25F, 0F, -0.9F, -0.5F, 0F, 0.1F, -0.5F); // Box 213
		gunModel[144].setRotationPoint(-2F, -10F, -1F);
		gunModel[144].rotateAngleZ = 0.13962634F;

		gunModel[145].addShapeBox(-38F, 0F, 0F, 1, 13, 1, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, 0.25F, 0F, 0.1F, 0.25F); // Box 214
		gunModel[145].setRotationPoint(-2F, -10F, 0F);
		gunModel[145].rotateAngleZ = 0.13962634F;

		gunModel[146].addShapeBox(-22F, -1F, 0F, 22, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 215
		gunModel[146].setRotationPoint(-20F, -6F, -0.5F);
		gunModel[146].rotateAngleZ = 0.64577182F;

		gunModel[147].addShapeBox(-22F, -0.6F, 0F, 22, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 216
		gunModel[147].setRotationPoint(-20F, -6F, -0.5F);
		gunModel[147].rotateAngleZ = 0.64577182F;

		gunModel[148].addShapeBox(-22F, -1.4F, 0F, 22, 1, 1, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 217
		gunModel[148].setRotationPoint(-20F, -6F, -0.5F);
		gunModel[148].rotateAngleZ = 0.64577182F;

		gunModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 218
		gunModel[149].setRotationPoint(14F, -12.5F, 3F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 155
		gunModel[150].setRotationPoint(42.5F, -15F, -0.5F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 156
		gunModel[151].setRotationPoint(-14.75F, -12.5F, -1.5F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 33, 1, 3, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 157
		gunModel[152].setRotationPoint(-10.5F, -13.75F, -1.5F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 63
		ammoModel[1] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 166
		ammoModel[2] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 167

		ammoModel[0].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 63
		ammoModel[0].setRotationPoint(15.75F, -12F, 2.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 2.25F, 0.25F, -2F, -2F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 2.25F, 0.25F, -2F, -2F, 0.25F, 0F); // Box 166
		ammoModel[1].setRotationPoint(15.75F, -12F, 10.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F, 2.25F, 0.25F, -2F, -2F, 0.25F, 0F, 2.25F, 0.25F, 0F, -2.75F, 0.25F, 3F, 2.25F, 0.25F, -2F, -2F, 0.25F, 0F, 2.25F, 0.25F, 0F, -2.75F, 0.25F, 3F); // Box 167
		ammoModel[2].setRotationPoint(20F, -12F, 21.5F);


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 68
		slideModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 69

		slideModel[0].addShapeBox(0F, -0.5F, -3F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		slideModel[0].setRotationPoint(6.5F, -12.2F, -1.5F);
		slideModel[0].rotateAngleX = -0.9424778F;

		slideModel[1].addShapeBox(0F, -0.5F, -3F, 1, 1, 1, 0F, 0.3F, 0.3F, -0.15F, 0.3F, 0.3F, -0.15F, 0.3F, 0.3F, -0.15F, 0.3F, 0.3F, -0.15F, 0.3F, 0.3F, -0.15F, 0.3F, 0.3F, -0.15F, 0.3F, 0.3F, -0.15F, 0.3F, 0.3F, -0.15F); // Box 69
		slideModel[1].setRotationPoint(6.5F, -12.2F, -1.5F);
		slideModel[1].rotateAngleX = -0.9424778F;


		this.modelScale = 0.22F;

		translateAll = new Vector3f(0F, -14.5F, -0.01F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.SIDE_CLIP;
	    
		hasFlash = false;
	    
	    leftArmPos = new Vector3f(0.1F, -0.61F, -0.2F);
	    leftArmRot = new Vector3f(75.0F, 10.0F, -70.0F);
		leftArmReloadPos = new Vector3f(0.05F, -0.585F, -0.15F);
	    leftArmReloadRot = new Vector3f(25.0F, 0.0F, -55.0F);
	    
	    rightArmPos = new Vector3f(0.35F, -0.535F, 0.0F);
	    rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    rightArmReloadPos = new Vector3f(0.35F, -0.535F, 0.0F);
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
	    
		crouchZoom = -0.15F;
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