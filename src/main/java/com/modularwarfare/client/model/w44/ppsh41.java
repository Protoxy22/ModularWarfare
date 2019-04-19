//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.07.2017 - 16:43:18
// Last changed on: 18.07.2017 - 16:43:18

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.model.objects.RenderVariables;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class ppsh41 extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ppsh41() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[163];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 38
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 40
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 43
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 44
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 46
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 48
		gunModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 49
		gunModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 50
		gunModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 51
		gunModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 53
		gunModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 54
		gunModel[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 55
		gunModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 56
		gunModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 58
		gunModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 60
		gunModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 61
		gunModel[16] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 62
		gunModel[17] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 144
		gunModel[18] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 150
		gunModel[19] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 151
		gunModel[20] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 152
		gunModel[21] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 153
		gunModel[22] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 154
		gunModel[23] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 156
		gunModel[24] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 157
		gunModel[25] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 158
		gunModel[26] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 160
		gunModel[27] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 55
		gunModel[28] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 56
		gunModel[29] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 57
		gunModel[30] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 58
		gunModel[31] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 59
		gunModel[32] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 60
		gunModel[33] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 61
		gunModel[34] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 62
		gunModel[35] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 66
		gunModel[36] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 67
		gunModel[37] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 68
		gunModel[38] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 70
		gunModel[39] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 71
		gunModel[40] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 73
		gunModel[41] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 74
		gunModel[42] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 75
		gunModel[43] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 76
		gunModel[44] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 77
		gunModel[45] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 79
		gunModel[46] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 80
		gunModel[47] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 81
		gunModel[48] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 82
		gunModel[49] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 83
		gunModel[50] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 84
		gunModel[51] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 85
		gunModel[52] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 86
		gunModel[53] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 89
		gunModel[54] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 90
		gunModel[55] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 91
		gunModel[56] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 92
		gunModel[57] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 93
		gunModel[58] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 94
		gunModel[59] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 95
		gunModel[60] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 96
		gunModel[61] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 97
		gunModel[62] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 98
		gunModel[63] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 99
		gunModel[64] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 100
		gunModel[65] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 101
		gunModel[66] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 102
		gunModel[67] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 103
		gunModel[68] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 104
		gunModel[69] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 105
		gunModel[70] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 106
		gunModel[71] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 107
		gunModel[72] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 108
		gunModel[73] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 109
		gunModel[74] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 110
		gunModel[75] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 129
		gunModel[76] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 131
		gunModel[77] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 132
		gunModel[78] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 133
		gunModel[79] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 134
		gunModel[80] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 137
		gunModel[81] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 138
		gunModel[82] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 139
		gunModel[83] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 140
		gunModel[84] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 141
		gunModel[85] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 142
		gunModel[86] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 143
		gunModel[87] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 144
		gunModel[88] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 145
		gunModel[89] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 146
		gunModel[90] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 147
		gunModel[91] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 148
		gunModel[92] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 149
		gunModel[93] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 150
		gunModel[94] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 151
		gunModel[95] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 152
		gunModel[96] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 153
		gunModel[97] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 154
		gunModel[98] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 155
		gunModel[99] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 156
		gunModel[100] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 157
		gunModel[101] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 158
		gunModel[102] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 159
		gunModel[103] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 160
		gunModel[104] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 161
		gunModel[105] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 162
		gunModel[106] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 163
		gunModel[107] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 164
		gunModel[108] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 165
		gunModel[109] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 166
		gunModel[110] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 167
		gunModel[111] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 168
		gunModel[112] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 169
		gunModel[113] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 170
		gunModel[114] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 171
		gunModel[115] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 173
		gunModel[116] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 174
		gunModel[117] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 175
		gunModel[118] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 176
		gunModel[119] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 177
		gunModel[120] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 178
		gunModel[121] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 179
		gunModel[122] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 180
		gunModel[123] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 184
		gunModel[124] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 193
		gunModel[125] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 194
		gunModel[126] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 195
		gunModel[127] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 196
		gunModel[128] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 197
		gunModel[129] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 198
		gunModel[130] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 199
		gunModel[131] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 200
		gunModel[132] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 201
		gunModel[133] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 202
		gunModel[134] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 203
		gunModel[135] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 204
		gunModel[136] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 205
		gunModel[137] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 206
		gunModel[138] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 207
		gunModel[139] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 208
		gunModel[140] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 209
		gunModel[141] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 210
		gunModel[142] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 211
		gunModel[143] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 212
		gunModel[144] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 213
		gunModel[145] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 214
		gunModel[146] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 215
		gunModel[147] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 217
		gunModel[148] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 218
		gunModel[149] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 219
		gunModel[150] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 220
		gunModel[151] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 221
		gunModel[152] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 222
		gunModel[153] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 223
		gunModel[154] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 224
		gunModel[155] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 225
		gunModel[156] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 164
		gunModel[157] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 165
		gunModel[158] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 166
		gunModel[159] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 110
		gunModel[160] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 143
		gunModel[161] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 145
		gunModel[162] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 174

		gunModel[0].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 38
		gunModel[0].setRotationPoint(-4F, -13F, -1.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 40
		gunModel[1].setRotationPoint(-4F, -13F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[2].setRotationPoint(-6F, -10F, -1.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[3].setRotationPoint(-6F, -11F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 46
		gunModel[4].setRotationPoint(-6F, -10F, 0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 48
		gunModel[5].setRotationPoint(-8F, -10F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 49
		gunModel[6].setRotationPoint(-8F, -9F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 50
		gunModel[7].setRotationPoint(-8F, -9F, 0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 51
		gunModel[8].setRotationPoint(-4F, -13F, 0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 53
		gunModel[9].setRotationPoint(-15F, -8F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 54
		gunModel[10].setRotationPoint(-15F, -7F, -1.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[11].setRotationPoint(-15F, -7F, 0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 24, 13, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 56
		gunModel[12].setRotationPoint(-39F, -8F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 24, 12, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 58
		gunModel[13].setRotationPoint(-39F, -7F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 24, 12, 1, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 1F, 0F); // Box 60
		gunModel[14].setRotationPoint(-39F, -7F, 0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F, -2F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -2F, 0.1F, 0.1F, -2F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -2F, 0.1F, 0.1F); // Box 61
		gunModel[15].setRotationPoint(-42F, -7F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F, -2F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, 0.1F, -0.1F, -2F, 0.1F, -0.1F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0.1F, -0.1F, -2F, 0.1F, -0.1F); // Box 62
		gunModel[16].setRotationPoint(-42F, -7F, -1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 15, 1, 0F, -2F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -1F, 0.1F, -2F, -1F, 0.1F, -2F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -2F, 0F, -2F, -2F, 0F); // Box 144
		gunModel[17].setRotationPoint(-42F, -7F, 0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 150
		gunModel[18].setRotationPoint(-9F, -8F, -1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 151
		gunModel[19].setRotationPoint(-9F, -9F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 152
		gunModel[20].setRotationPoint(-9F, -8F, 0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 153
		gunModel[21].setRotationPoint(-11F, -7F, 0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 154
		gunModel[22].setRotationPoint(-11F, -8F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 156
		gunModel[23].setRotationPoint(-11F, -7F, -1.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 157
		gunModel[24].setRotationPoint(-14F, -7F, -1.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 158
		gunModel[25].setRotationPoint(-14F, -8F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 160
		gunModel[26].setRotationPoint(-14F, -7F, 0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 55
		gunModel[27].setRotationPoint(0F, -14F, 0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 14, 7, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 56
		gunModel[28].setRotationPoint(0F, -14F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 57
		gunModel[29].setRotationPoint(0F, -14F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 4, 6, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 58
		gunModel[30].setRotationPoint(14F, -13F, -1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F); // Box 59
		gunModel[31].setRotationPoint(24.75F, -13F, -1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 60
		gunModel[32].setRotationPoint(24.5F, -12F, -1.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 32, 2, 1, 0F, 0F, -0.2F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.2F, 0.1F, 0F, 1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 1F, 0.1F); // Box 61
		gunModel[33].setRotationPoint(-3F, -14F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 62
		gunModel[34].setRotationPoint(26F, -10F, -1.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[35].setRotationPoint(26F, -11F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 67
		gunModel[36].setRotationPoint(29F, -14.5F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 68
		gunModel[37].setRotationPoint(-4F, -14F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 32, 2, 1, 0F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, 1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 1F, -0.1F); // Box 70
		gunModel[38].setRotationPoint(-3F, -14F, 0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -1F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, -0.2F, -1F, -0.3F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 71
		gunModel[39].setRotationPoint(-4F, -14F, 0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 32, 2, 1, 0F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, 1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 1F, -0.1F); // Box 73
		gunModel[40].setRotationPoint(-3F, -14F, -1.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.2F, -1F, -0.3F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -1F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 74
		gunModel[41].setRotationPoint(-4F, -14F, -1.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 75
		gunModel[42].setRotationPoint(26F, -12F, -1.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F, -3F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, -3F, -0.6F, -0.6F, 0F, 0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.1F); // Box 76
		gunModel[43].setRotationPoint(-3F, -15F, -1.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 77
		gunModel[44].setRotationPoint(29F, -14.5F, -1.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 79
		gunModel[45].setRotationPoint(29F, -14.7F, -1.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 32, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 80
		gunModel[46].setRotationPoint(29F, -11.8F, -1.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[47].setRotationPoint(29F, -11F, -1.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F); // Box 82
		gunModel[48].setRotationPoint(29F, -14.5F, 0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 83
		gunModel[49].setRotationPoint(29F, -14.7F, 0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 32, 2, 1, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F); // Box 84
		gunModel[50].setRotationPoint(29F, -11.8F, 0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 85
		gunModel[51].setRotationPoint(29F, -11F, 0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.05F, -0.6F, 0.5F, -0.05F, -0.6F, 0.5F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, 0.5F, -0.05F, -0.6F, 0.5F, -0.05F, -0.25F, 0F, -0.05F, -0.25F); // Box 86
		gunModel[52].setRotationPoint(29F, -13.75F, 0.4F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F); // Box 89
		gunModel[53].setRotationPoint(36.5F, -13.75F, 0.4F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F); // Box 90
		gunModel[54].setRotationPoint(35.5F, -13.75F, 0.4F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F, -0.6F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F); // Box 91
		gunModel[55].setRotationPoint(35.5F, -12.75F, 0.4F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F, -0.6F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F); // Box 92
		gunModel[56].setRotationPoint(30.5F, -13.75F, 0.4F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F, -0.6F, -0.05F, -0.25F, 0F, -0.05F, -0.25F); // Box 93
		gunModel[57].setRotationPoint(30.5F, -12.75F, 0.4F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F, -0.6F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F); // Box 94
		gunModel[58].setRotationPoint(37.5F, -13.75F, 0.4F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F, -0.6F, -0.05F, -0.25F, 0F, -0.05F, -0.25F); // Box 95
		gunModel[59].setRotationPoint(37.5F, -12.75F, 0.4F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F, -0.6F, -0.05F, -0.25F, 0F, -0.05F, -0.25F); // Box 96
		gunModel[60].setRotationPoint(45.5F, -12.75F, 0.4F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F); // Box 97
		gunModel[61].setRotationPoint(44.5F, -13.75F, 0.4F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F, -0.6F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F); // Box 98
		gunModel[62].setRotationPoint(43.5F, -12.75F, 0.4F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F); // Box 99
		gunModel[63].setRotationPoint(43.5F, -13.75F, 0.4F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F, -0.6F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F); // Box 100
		gunModel[64].setRotationPoint(45.5F, -13.75F, 0.4F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F, -0.6F, -0.05F, -0.25F, 0F, -0.05F, -0.25F); // Box 101
		gunModel[65].setRotationPoint(51.5F, -12.75F, 0.4F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.09F, -0.6F, 0F, 0.12F, -0.6F, 0F, 0.12F, -0.25F, 0F, 0.09F, -0.25F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F); // Box 102
		gunModel[66].setRotationPoint(50.5F, -13.75F, 0.4F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F, -0.6F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F); // Box 103
		gunModel[67].setRotationPoint(49.5F, -12.75F, 0.4F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, 0.05F, -0.6F, 0F, 0.05F, -0.6F, 0F, 0.05F, -0.25F, -0.6F, 0.05F, -0.25F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F); // Box 104
		gunModel[68].setRotationPoint(49.5F, -13.75F, 0.4F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.14F, -0.6F, -0.6F, 0.15F, -0.6F, -0.6F, 0.15F, -0.25F, 0F, 0.14F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F); // Box 105
		gunModel[69].setRotationPoint(51.5F, -13.75F, 0.4F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F, -0.6F, -0.05F, -0.25F, 0F, -0.05F, -0.25F); // Box 106
		gunModel[70].setRotationPoint(58.5F, -12.75F, 0.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F); // Box 107
		gunModel[71].setRotationPoint(57.5F, -13.75F, 0.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F, -0.6F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F); // Box 108
		gunModel[72].setRotationPoint(56.5F, -12.75F, 0.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F); // Box 109
		gunModel[73].setRotationPoint(56.5F, -13.95F, 0.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F, -0.6F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F); // Box 110
		gunModel[74].setRotationPoint(58.5F, -13.95F, 0.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.6F, 0F, -0.05F, -0.6F); // Box 129
		gunModel[75].setRotationPoint(58.5F, -12.75F, -1.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F, -0.6F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F); // Box 131
		gunModel[76].setRotationPoint(56.5F, -12.75F, -1.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F); // Box 132
		gunModel[77].setRotationPoint(56.5F, -13.95F, -1.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F); // Box 133
		gunModel[78].setRotationPoint(58.5F, -13.95F, -1.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 134
		gunModel[79].setRotationPoint(26F, -13.25F, -0.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.6F, 0F); // Box 137
		gunModel[80].setRotationPoint(49F, -14.5F, -0.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.25F, 0F, -0.6F, -0.25F); // Box 138
		gunModel[81].setRotationPoint(49F, -14.5F, 0.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.6F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.25F, 0F, -0.6F, -0.25F, 0F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.25F, 0F, 0F, -0.25F); // Box 139
		gunModel[82].setRotationPoint(49F, -14.7F, 0.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, 0F, 0F, -0.6F, 0F); // Box 140
		gunModel[83].setRotationPoint(49F, -14.5F, -1.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.6F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F); // Box 141
		gunModel[84].setRotationPoint(49F, -14.7F, -1.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 142
		gunModel[85].setRotationPoint(52F, -14.9F, 0.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F); // Box 143
		gunModel[86].setRotationPoint(52F, -14.7F, 0.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 144
		gunModel[87].setRotationPoint(57.5F, -14.7F, -0.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 145
		gunModel[88].setRotationPoint(52F, -14.7F, -1.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 146
		gunModel[89].setRotationPoint(52F, -14.9F, -1.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.05F, -0.25F, 0.5F, -0.05F, -0.25F, 0.5F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, 0.5F, -0.05F, -0.25F, 0.5F, -0.05F, -0.6F, 0F, -0.05F, -0.6F); // Box 147
		gunModel[90].setRotationPoint(29F, -13.75F, -1.4F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.6F); // Box 148
		gunModel[91].setRotationPoint(36.5F, -13.75F, -1.4F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F); // Box 149
		gunModel[92].setRotationPoint(35.5F, -13.75F, -1.4F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F, -0.6F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F); // Box 150
		gunModel[93].setRotationPoint(35.5F, -12.75F, -1.4F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F); // Box 151
		gunModel[94].setRotationPoint(30.5F, -13.75F, -1.4F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.6F, 0F, -0.05F, -0.6F); // Box 152
		gunModel[95].setRotationPoint(30.5F, -12.75F, -1.4F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F); // Box 153
		gunModel[96].setRotationPoint(37.5F, -13.75F, -1.4F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.6F, 0F, -0.05F, -0.6F); // Box 154
		gunModel[97].setRotationPoint(37.5F, -12.75F, -1.4F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.6F, 0F, -0.05F, -0.6F); // Box 155
		gunModel[98].setRotationPoint(45.5F, -12.75F, -1.4F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.6F); // Box 156
		gunModel[99].setRotationPoint(44.5F, -13.75F, -1.4F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F, -0.6F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F); // Box 157
		gunModel[100].setRotationPoint(43.5F, -12.75F, -1.4F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F); // Box 158
		gunModel[101].setRotationPoint(43.5F, -13.75F, -1.4F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F); // Box 159
		gunModel[102].setRotationPoint(45.5F, -13.75F, -1.4F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.05F, -0.25F, -0.6F, -0.05F, -0.6F, 0F, -0.05F, -0.6F); // Box 160
		gunModel[103].setRotationPoint(51.5F, -12.75F, -1.4F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.09F, -0.25F, 0F, 0.12F, -0.25F, 0F, 0.12F, -0.6F, 0F, 0.09F, -0.6F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.6F); // Box 161
		gunModel[104].setRotationPoint(50.5F, -13.75F, -1.4F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F, -0.6F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.05F, -0.6F); // Box 162
		gunModel[105].setRotationPoint(49.5F, -12.75F, -1.4F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, 0.05F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0.05F, -0.6F, -0.6F, 0.05F, -0.6F, -0.6F, -0.8F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, -0.6F, -0.8F, -0.6F); // Box 163
		gunModel[106].setRotationPoint(49.5F, -13.75F, -1.4F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.14F, -0.25F, -0.6F, 0.15F, -0.25F, -0.6F, 0.15F, -0.6F, 0F, 0.14F, -0.6F, 0F, -0.05F, -0.25F, -0.6F, -0.8F, -0.25F, -0.6F, -0.8F, -0.6F, 0F, -0.05F, -0.6F); // Box 164
		gunModel[107].setRotationPoint(51.5F, -13.75F, -1.4F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.6F, 0F, 0.15F, -0.6F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.6F); // Box 165
		gunModel[108].setRotationPoint(57.5F, -13.75F, -1.5F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 166
		gunModel[109].setRotationPoint(36F, -14.5F, -0.5F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 167
		gunModel[110].setRotationPoint(44F, -14.5F, -0.5F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		gunModel[111].setRotationPoint(36F, -11F, -0.5F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		gunModel[112].setRotationPoint(44F, -11F, -0.5F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		gunModel[113].setRotationPoint(50F, -11F, -0.5F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 171
		gunModel[114].setRotationPoint(57F, -11F, -0.5F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0.1F, -0.6F, 0F, 0.3F, -0.6F, 0F, 0.3F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.6F, -0.6F, -1F, -0.6F, -0.6F, -1F, -0.6F, -0.25F, 0F, -0.6F, -0.25F); // Box 173
		gunModel[115].setRotationPoint(61F, -13.8F, 0.5F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.25F, 0F, -0.6F, -0.25F); // Box 174
		gunModel[116].setRotationPoint(61F, -14.7F, 0.5F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.6F, 0F); // Box 175
		gunModel[117].setRotationPoint(61F, -14.7F, -0.5F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, 0F, 0F, -0.6F, 0F); // Box 176
		gunModel[118].setRotationPoint(61F, -14.7F, -1.5F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.25F, 0F, -0.6F, -0.25F, 0F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.25F, 0F, 0F, -0.25F); // Box 177
		gunModel[119].setRotationPoint(61F, -14.9F, 0.5F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.6F, 0F, 0F, -0.6F); // Box 178
		gunModel[120].setRotationPoint(61F, -14.9F, -1.5F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0.1F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.6F, 0F, 0.1F, -0.6F, 0F, -0.6F, -0.25F, -1F, -0.6F, -0.25F, -1F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 179
		gunModel[121].setRotationPoint(61F, -13.8F, -1.5F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0.1F, -0.6F, 0F, 0.3F, -0.6F, 0F, 0.3F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.6F, -0.6F, -1F, -0.6F, -0.6F, -1F, -0.6F, -0.25F, 0F, -0.6F, -0.25F); // Box 180
		gunModel[122].setRotationPoint(61.2F, -13.8F, -1.65F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F); // Box 184
		gunModel[123].setRotationPoint(61.2F, -14.45F, -1.65F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F); // Box 193
		gunModel[124].setRotationPoint(19F, -13F, -1.5F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 194
		gunModel[125].setRotationPoint(18F, -13F, -1.5F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 195
		gunModel[126].setRotationPoint(-1.5F, -6.5F, -0.5F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 196
		gunModel[127].setRotationPoint(-1.5F, -2.5F, -0.5F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		gunModel[128].setRotationPoint(-1.5F, -4.5F, -0.5F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		gunModel[129].setRotationPoint(6.5F, -6.5F, -0.5F);

		gunModel[130].addShapeBox(0F, -0.2F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		gunModel[130].setRotationPoint(0.25F, -6.5F, -0.5F);
		gunModel[130].rotateAngleZ = 0.26179939F;

		gunModel[131].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 200
		gunModel[131].setRotationPoint(-1.5F, -6.5F, -0.5F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F); // Box 201
		gunModel[132].setRotationPoint(2.25F, -5.9F, -0.5F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 202
		gunModel[133].setRotationPoint(3.55F, -5.5F, -0.5F);
		gunModel[133].rotateAngleZ = -0.01745329F;

		gunModel[134].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F); // Box 203
		gunModel[134].setRotationPoint(12.25F, -6.1F, -0.5F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		gunModel[135].setRotationPoint(5.5F, -15F, -1F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		gunModel[136].setRotationPoint(9.5F, -15F, -1F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		gunModel[137].setRotationPoint(4.5F, -15F, -1F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 207
		gunModel[138].setRotationPoint(6.5F, -16.2F, -1.2F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.3F, -0.25F, -1F, -0.3F, -0.25F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 208
		gunModel[139].setRotationPoint(8.5F, -16.2F, -1.2F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, -1F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F); // Box 209
		gunModel[140].setRotationPoint(5.5F, -16.2F, -1.2F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 210
		gunModel[141].setRotationPoint(6.5F, -16.2F, 0.2F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.3F, -0.25F, -1F, -0.3F, -0.25F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 211
		gunModel[142].setRotationPoint(8.5F, -16.2F, 0.2F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, -1F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F); // Box 212
		gunModel[143].setRotationPoint(5.5F, -16.2F, 0.2F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 213
		gunModel[144].setRotationPoint(51.75F, -16.75F, -1.2F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 214
		gunModel[145].setRotationPoint(51.75F, -16.75F, 0.2F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 215
		gunModel[146].setRotationPoint(51.75F, -17.42F, -1F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 217
		gunModel[147].setRotationPoint(53.75F, -16.75F, 0.2F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 218
		gunModel[148].setRotationPoint(53.75F, -16.75F, -1.2F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 219
		gunModel[149].setRotationPoint(50.75F, -15.5F, 0.2F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 220
		gunModel[150].setRotationPoint(54.75F, -15.75F, 0.2F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 221
		gunModel[151].setRotationPoint(50.75F, -15.5F, -1.2F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 222
		gunModel[152].setRotationPoint(54.75F, -15.75F, -1.2F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 223
		gunModel[153].setRotationPoint(51.75F, -15.75F, -1F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 224
		gunModel[154].setRotationPoint(52.75F, -16.5F, -0.5F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F); // Box 225
		gunModel[155].setRotationPoint(6.5F, -15.5F, -1F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 164
		gunModel[156].setRotationPoint(14.5F, -8.5F, -1.5F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 1F, 0.15F, 0F, 1F, 0.15F, 0F, 1F, 0.15F, 0F, 1F, 0.15F); // Box 165
		gunModel[157].setRotationPoint(27.5F, -12.5F, -1.5F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F); // Box 166
		gunModel[158].setRotationPoint(13F, -12.5F, -1.5F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F); // Box 110
		gunModel[159].setRotationPoint(29F, -10.2F, -0.5F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F); // Box 143
		gunModel[160].setRotationPoint(-29F, -4.2F, -2F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0.15F, 0.15F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0.15F, 0.15F, -0.3F); // Box 145
		gunModel[161].setRotationPoint(-26.7F, -4.2F, -2F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0.15F, -0.12F, 0F, 0.15F, -0.12F, 0F, 0.15F, -0.12F, 0F, 0.15F, -0.12F, 0F, 0.15F, -0.12F, 0F, 0.15F, -0.12F, 0F, 0.15F, -0.12F, 0F, 0.15F, -0.12F); // Box 174
		gunModel[162].setRotationPoint(-28F, -4F, -2F);


		ammoModel = new ModelRendererTurbo[12];
		ammoModel[0] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 4
		ammoModel[1] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 5
		ammoModel[2] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 188
		ammoModel[3] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 189
		ammoModel[4] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 190
		ammoModel[5] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 191
		ammoModel[6] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 192
		ammoModel[7] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 163
		ammoModel[8] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 170
		ammoModel[9] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 171
		ammoModel[10] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 172
		ammoModel[11] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 173

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


		this.modelScale = 0.25F;

		translateAll = new Vector3f(0F, -9.8F, -0.01F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.RIFLE2;
	    
		hasFlash = false;
	    
	    leftArmPos = new Vector3f(0.15F, -0.7F, -0.04F);
	    leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.15F, -0.7F, -0.04F);
	    leftArmReloadRot = new Vector3f(45.0F, 50.0F, -25.0F);
	    
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
	    
        ammoMap.put("w44.pps4143stickammo", new RenderVariables(new Vector3f(0.6F, 0.12F, 0F), 0.3F));
	    
		flipAll();
	}
}