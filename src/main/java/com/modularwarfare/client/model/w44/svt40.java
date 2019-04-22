//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 03.08.2017 - 18:00:56
// Last changed on: 03.08.2017 - 18:00:56

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class svt40 extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public svt40() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[182];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 8
		gunModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 12
		gunModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 15
		gunModel[6] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 23
		gunModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 30
		gunModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 38
		gunModel[9] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 40
		gunModel[10] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 42
		gunModel[11] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 43
		gunModel[12] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 44
		gunModel[13] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 46
		gunModel[14] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 48
		gunModel[15] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 49
		gunModel[16] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 50
		gunModel[17] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 51
		gunModel[18] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 53
		gunModel[19] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 54
		gunModel[20] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 55
		gunModel[21] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 56
		gunModel[22] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 58
		gunModel[23] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 60
		gunModel[24] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 61
		gunModel[25] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 62
		gunModel[26] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 78
		gunModel[27] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 81
		gunModel[28] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 88
		gunModel[29] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 89
		gunModel[30] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 90
		gunModel[31] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 102
		gunModel[32] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 106
		gunModel[33] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 108
		gunModel[34] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 109
		gunModel[35] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 110
		gunModel[36] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 111
		gunModel[37] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 112
		gunModel[38] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 113
		gunModel[39] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 110
		gunModel[40] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 141
		gunModel[41] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 142
		gunModel[42] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 143
		gunModel[43] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 144
		gunModel[44] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 145
		gunModel[45] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 150
		gunModel[46] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 152
		gunModel[47] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 154
		gunModel[48] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 71
		gunModel[49] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 72
		gunModel[50] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 73
		gunModel[51] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 75
		gunModel[52] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 98
		gunModel[53] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 99
		gunModel[54] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 100
		gunModel[55] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 102
		gunModel[56] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 104
		gunModel[57] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 107
		gunModel[58] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 108
		gunModel[59] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 109
		gunModel[60] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 110
		gunModel[61] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 111
		gunModel[62] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 112
		gunModel[63] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 113
		gunModel[64] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 114
		gunModel[65] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 116
		gunModel[66] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 117
		gunModel[67] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 118
		gunModel[68] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 119
		gunModel[69] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 120
		gunModel[70] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 121
		gunModel[71] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 123
		gunModel[72] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 124
		gunModel[73] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 126
		gunModel[74] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 146
		gunModel[75] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 149
		gunModel[76] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 129
		gunModel[77] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 131
		gunModel[78] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 132
		gunModel[79] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 133
		gunModel[80] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 134
		gunModel[81] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 135
		gunModel[82] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 136
		gunModel[83] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 137
		gunModel[84] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 138
		gunModel[85] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 139
		gunModel[86] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 140
		gunModel[87] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 141
		gunModel[88] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 142
		gunModel[89] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 143
		gunModel[90] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 144
		gunModel[91] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 145
		gunModel[92] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 146
		gunModel[93] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 147
		gunModel[94] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 149
		gunModel[95] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 150
		gunModel[96] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 152
		gunModel[97] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 153
		gunModel[98] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 154
		gunModel[99] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 155
		gunModel[100] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 156
		gunModel[101] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 157
		gunModel[102] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 158
		gunModel[103] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 159
		gunModel[104] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 160
		gunModel[105] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 161
		gunModel[106] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 162
		gunModel[107] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 163
		gunModel[108] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 164
		gunModel[109] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 165
		gunModel[110] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 166
		gunModel[111] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 167
		gunModel[112] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 168
		gunModel[113] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 169
		gunModel[114] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 170
		gunModel[115] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 171
		gunModel[116] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 172
		gunModel[117] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 173
		gunModel[118] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 174
		gunModel[119] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 175
		gunModel[120] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 176
		gunModel[121] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 177
		gunModel[122] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 178
		gunModel[123] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 179
		gunModel[124] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 180
		gunModel[125] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 181
		gunModel[126] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 182
		gunModel[127] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 183
		gunModel[128] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 184
		gunModel[129] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 185
		gunModel[130] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 186
		gunModel[131] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 187
		gunModel[132] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 188
		gunModel[133] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 189
		gunModel[134] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 190
		gunModel[135] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 191
		gunModel[136] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 192
		gunModel[137] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 193
		gunModel[138] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 194
		gunModel[139] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 195
		gunModel[140] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 196
		gunModel[141] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 197
		gunModel[142] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 198
		gunModel[143] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 199
		gunModel[144] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 200
		gunModel[145] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 201
		gunModel[146] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 202
		gunModel[147] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 203
		gunModel[148] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 204
		gunModel[149] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 205
		gunModel[150] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 206
		gunModel[151] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 207
		gunModel[152] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 208
		gunModel[153] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 209
		gunModel[154] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 210
		gunModel[155] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 211
		gunModel[156] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 212
		gunModel[157] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 213
		gunModel[158] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 214
		gunModel[159] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 215
		gunModel[160] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 216
		gunModel[161] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 217
		gunModel[162] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 218
		gunModel[163] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 219
		gunModel[164] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 220
		gunModel[165] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 221
		gunModel[166] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 222
		gunModel[167] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 223
		gunModel[168] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 224
		gunModel[169] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 225
		gunModel[170] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 226
		gunModel[171] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 227
		gunModel[172] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 228
		gunModel[173] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 229
		gunModel[174] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 230
		gunModel[175] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 231
		gunModel[176] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 232
		gunModel[177] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 233
		gunModel[178] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 234
		gunModel[179] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 235
		gunModel[180] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 236
		gunModel[181] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 239

		gunModel[0].addShapeBox(0F, 0F, 0F, 30, 4, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 1
		gunModel[0].setRotationPoint(24F, -12F, 1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 30, 5, 2, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[1].setRotationPoint(24F, -13F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[2].setRotationPoint(33F, -15F, 1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 22, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[3].setRotationPoint(32F, -15F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 12
		gunModel[4].setRotationPoint(10F, -13F, 1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 7, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[5].setRotationPoint(3F, -13F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 23
		gunModel[6].setRotationPoint(54F, -15F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 30
		gunModel[7].setRotationPoint(54F, -13F, -2F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 38
		gunModel[8].setRotationPoint(-4F, -13F, -2F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 7, 6, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 40
		gunModel[9].setRotationPoint(-4F, -13F, -1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 42
		gunModel[10].setRotationPoint(3F, -13F, 1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[11].setRotationPoint(-9F, -11F, -2F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[12].setRotationPoint(-9F, -12F, -1F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 46
		gunModel[13].setRotationPoint(-9F, -11F, 1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 7, 6, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 48
		gunModel[14].setRotationPoint(-16F, -10F, -1F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 49
		gunModel[15].setRotationPoint(-16F, -9F, -2F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 50
		gunModel[16].setRotationPoint(-16F, -9F, 1F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 51
		gunModel[17].setRotationPoint(-4F, -13F, 1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 53
		gunModel[18].setRotationPoint(-20F, -10F, -1F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 54
		gunModel[19].setRotationPoint(-20F, -9F, -2F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[20].setRotationPoint(-20F, -9F, 1F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 20, 12, 2, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 56
		gunModel[21].setRotationPoint(-40F, -10F, -1F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 20, 11, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 58
		gunModel[22].setRotationPoint(-40F, -9F, -2F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 20, 11, 1, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 1F, 0F); // Box 60
		gunModel[23].setRotationPoint(-40F, -9F, 1F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 61
		gunModel[24].setRotationPoint(-42F, -9F, -1F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F); // Box 62
		gunModel[25].setRotationPoint(-42F, -9F, -2F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		gunModel[26].setRotationPoint(31F, -14F, 0F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[27].setRotationPoint(31F, -14F, -2F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 1F, 0F); // Box 88
		gunModel[28].setRotationPoint(-4F, -14F, 0F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.95F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.95F, 0F); // Box 89
		gunModel[29].setRotationPoint(3F, -14F, 0F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.3F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F); // Box 90
		gunModel[30].setRotationPoint(8F, -14F, 0F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 102
		gunModel[31].setRotationPoint(71F, -13.5F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 106
		gunModel[32].setRotationPoint(72F, -13.5F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 108
		gunModel[33].setRotationPoint(5F, -6.5F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 109
		gunModel[34].setRotationPoint(-4F, -6.5F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[35].setRotationPoint(-4F, -8.25F, 0F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[36].setRotationPoint(5F, -8.5F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 112
		gunModel[37].setRotationPoint(-2.5F, -4.5F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.15F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 113
		gunModel[38].setRotationPoint(-1F, -7.75F, -0.5F);
		gunModel[38].rotateAngleZ = 0.26179939F;

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F); // Box 110
		gunModel[39].setRotationPoint(30F, -11.75F, -1F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.24F, 0.24F, 0F, 0.24F, 0.24F, 0F, 0.24F, 0.24F, 0F, 0.24F, 0.24F, 0F, 0.24F, 0.24F, 0F, 0.24F, 0.24F, 0F, 0.24F, 0.24F, 0F, 0.24F, 0.24F); // Box 141
		gunModel[40].setRotationPoint(77.25F, -13.5F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.24F, 0.24F, 0F, 0.24F, 0.24F, 0F, 0.24F, 0.24F, 0F, 0.24F, 0.24F, 0F, 0.24F, 0.24F, 0F, 0.24F, 0.24F, 0F, 0.24F, 0.24F, 0F, 0.24F, 0.24F); // Box 142
		gunModel[41].setRotationPoint(78.75F, -13.5F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F); // Box 143
		gunModel[42].setRotationPoint(-24F, -8F, -2.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 144
		gunModel[43].setRotationPoint(-42F, -9F, 1F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.15F, 0.15F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0.15F, 0.15F, -0.3F); // Box 145
		gunModel[44].setRotationPoint(-22.7F, -8F, -2.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.3F, 0F); // Box 150
		gunModel[45].setRotationPoint(8F, -14F, -2F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		gunModel[46].setRotationPoint(10F, -14F, -2F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 154
		gunModel[47].setRotationPoint(10F, -13F, -2F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 71
		gunModel[48].setRotationPoint(54F, -11F, -1F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 72
		gunModel[49].setRotationPoint(-17F, -8F, -2F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 73
		gunModel[50].setRotationPoint(-17F, -9F, -1F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		gunModel[51].setRotationPoint(-17F, -8F, 1F);

		gunModel[52].addShapeBox(-0.8F, 5.25F, -1F, 9, 1, 2, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 98
		gunModel[52].setRotationPoint(15F, -13F, 0F);
		gunModel[52].rotateAngleZ = 0.13962634F;

		gunModel[53].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 99
		gunModel[53].setRotationPoint(18F, -13F, 1F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		gunModel[54].setRotationPoint(18F, -13F, -2F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		gunModel[55].setRotationPoint(3F, -13F, -2F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		gunModel[56].setRotationPoint(10F, -14F, 0F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[57].setRotationPoint(18F, -15F, 1F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gunModel[58].setRotationPoint(18F, -15F, -2F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		gunModel[59].setRotationPoint(18F, -15F, -1F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[60].setRotationPoint(32F, -15F, 1F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[61].setRotationPoint(23.75F, -15F, -1F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[62].setRotationPoint(32F, -15F, -2F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		gunModel[63].setRotationPoint(7F, -14.75F, -1.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -0.15F, -0.2F); // Box 114
		gunModel[64].setRotationPoint(34F, -13.4F, 1F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		gunModel[65].setRotationPoint(-3F, -15F, 0.75F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 117
		gunModel[66].setRotationPoint(-5.01F, -14.5F, -1F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		gunModel[67].setRotationPoint(-3F, -15F, -1.75F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F); // Box 119
		gunModel[68].setRotationPoint(-4F, -15F, -1F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 1F, 0F); // Box 120
		gunModel[69].setRotationPoint(-4F, -14F, -2F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F); // Box 121
		gunModel[70].setRotationPoint(-3F, -14F, 0F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.95F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.95F, 0F); // Box 123
		gunModel[71].setRotationPoint(3F, -14F, -2F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F); // Box 124
		gunModel[72].setRotationPoint(-3F, -14F, -2F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, -0.15F, 0F); // Box 126
		gunModel[73].setRotationPoint(34F, -13.4F, -2F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		gunModel[74].setRotationPoint(24F, -14.5F, -1.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, 0F, 0F, 0F); // Box 149
		gunModel[75].setRotationPoint(10F, -8F, -1F);

		gunModel[76].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 129
		gunModel[76].setRotationPoint(-5.21F, -14.3F, -0.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 131
		gunModel[77].setRotationPoint(52F, -13.5F, 0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0.3F, -0.5F); // Box 132
		gunModel[78].setRotationPoint(52F, -12.5F, 0.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		gunModel[79].setRotationPoint(55F, -13.5F, 0.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 134
		gunModel[80].setRotationPoint(56.5F, -13.5F, 0.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 135
		gunModel[81].setRotationPoint(57.5F, -13.5F, 0.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 136
		gunModel[82].setRotationPoint(59.5F, -13.5F, 0.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 137
		gunModel[83].setRotationPoint(58.5F, -13.5F, 0.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 138
		gunModel[84].setRotationPoint(61.5F, -13.5F, 0.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 139
		gunModel[85].setRotationPoint(60.5F, -13.5F, 0.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 140
		gunModel[86].setRotationPoint(63.5F, -13.5F, 0.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 141
		gunModel[87].setRotationPoint(62.5F, -13.5F, 0.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 142
		gunModel[88].setRotationPoint(65.5F, -13.5F, 0.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 143
		gunModel[89].setRotationPoint(64.5F, -13.5F, 0.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 144
		gunModel[90].setRotationPoint(67.5F, -13.5F, 0.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 145
		gunModel[91].setRotationPoint(66.5F, -13.5F, 0.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 146
		gunModel[92].setRotationPoint(69.5F, -13.5F, 0.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 147
		gunModel[93].setRotationPoint(68.5F, -13.5F, 0.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F); // Box 149
		gunModel[94].setRotationPoint(70.5F, -13.5F, 0.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 150
		gunModel[95].setRotationPoint(52F, -13.5F, -1.5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		gunModel[96].setRotationPoint(55F, -13.5F, -1.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 153
		gunModel[97].setRotationPoint(56.5F, -13.5F, -1.5F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 154
		gunModel[98].setRotationPoint(57.5F, -13.5F, -1.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 155
		gunModel[99].setRotationPoint(59.5F, -13.5F, -1.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 156
		gunModel[100].setRotationPoint(58.5F, -13.5F, -1.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 157
		gunModel[101].setRotationPoint(61.5F, -13.5F, -1.5F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 158
		gunModel[102].setRotationPoint(60.5F, -13.5F, -1.5F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 159
		gunModel[103].setRotationPoint(63.5F, -13.5F, -1.5F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 160
		gunModel[104].setRotationPoint(62.5F, -13.5F, -1.5F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 161
		gunModel[105].setRotationPoint(65.5F, -13.5F, -1.5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 162
		gunModel[106].setRotationPoint(64.5F, -13.5F, -1.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 163
		gunModel[107].setRotationPoint(67.5F, -13.5F, -1.5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 164
		gunModel[108].setRotationPoint(66.5F, -13.5F, -1.5F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 165
		gunModel[109].setRotationPoint(69.5F, -13.5F, -1.5F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 166
		gunModel[110].setRotationPoint(68.5F, -13.5F, -1.5F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.3F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F); // Box 167
		gunModel[111].setRotationPoint(70.5F, -13.5F, -1.5F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F); // Box 168
		gunModel[112].setRotationPoint(52F, -12.5F, -0.5F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		gunModel[113].setRotationPoint(55F, -14.5F, 0.25F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		gunModel[114].setRotationPoint(55F, -14.5F, -1.25F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		gunModel[115].setRotationPoint(57F, -14.5F, 0.25F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		gunModel[116].setRotationPoint(57F, -14.5F, -1.25F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		gunModel[117].setRotationPoint(59F, -14.5F, 0.25F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		gunModel[118].setRotationPoint(59F, -14.5F, -1.25F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		gunModel[119].setRotationPoint(65F, -14.5F, 0.25F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		gunModel[120].setRotationPoint(65F, -14.5F, -1.25F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		gunModel[121].setRotationPoint(63F, -14.5F, 0.25F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		gunModel[122].setRotationPoint(63F, -14.5F, -1.25F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		gunModel[123].setRotationPoint(61F, -14.5F, -1.25F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		gunModel[124].setRotationPoint(61F, -14.5F, 0.25F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		gunModel[125].setRotationPoint(71F, -14.5F, 0.25F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		gunModel[126].setRotationPoint(71F, -14.5F, -1.25F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		gunModel[127].setRotationPoint(69F, -14.5F, 0.25F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		gunModel[128].setRotationPoint(69F, -14.5F, -1.25F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		gunModel[129].setRotationPoint(67F, -14.5F, -1.25F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		gunModel[130].setRotationPoint(67F, -14.5F, 0.25F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 187
		gunModel[131].setRotationPoint(52F, -14.5F, -0.5F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 188
		gunModel[132].setRotationPoint(70F, -14.5F, 0.25F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 189
		gunModel[133].setRotationPoint(68F, -14.5F, 0.25F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 190
		gunModel[134].setRotationPoint(64F, -14.5F, 0.25F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 191
		gunModel[135].setRotationPoint(66F, -14.5F, 0.25F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 192
		gunModel[136].setRotationPoint(60F, -14.5F, 0.25F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 193
		gunModel[137].setRotationPoint(62F, -14.5F, 0.25F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 194
		gunModel[138].setRotationPoint(56F, -14.5F, 0.25F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 195
		gunModel[139].setRotationPoint(58F, -14.5F, 0.25F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 196
		gunModel[140].setRotationPoint(70F, -14.5F, -1.25F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 197
		gunModel[141].setRotationPoint(68F, -14.5F, -1.25F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 198
		gunModel[142].setRotationPoint(64F, -14.5F, -1.25F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 199
		gunModel[143].setRotationPoint(66F, -14.5F, -1.25F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 200
		gunModel[144].setRotationPoint(60F, -14.5F, -1.25F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 201
		gunModel[145].setRotationPoint(62F, -14.5F, -1.25F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 202
		gunModel[146].setRotationPoint(56F, -14.5F, -1.25F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 203
		gunModel[147].setRotationPoint(58F, -14.5F, -1.25F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F, 0F, -0.9F, -0.3F, -1F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0.3F, -0.3F, -1F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, 0F, 0.3F, -0.3F); // Box 204
		gunModel[148].setRotationPoint(52F, -11.6F, -0.5F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F); // Box 205
		gunModel[149].setRotationPoint(78F, -12F, -0.5F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.5F, 0F); // Box 206
		gunModel[150].setRotationPoint(52F, -12.5F, -1.5F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		gunModel[151].setRotationPoint(24F, -13F, 1F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		gunModel[152].setRotationPoint(43F, -13F, 1F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 30, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 209
		gunModel[153].setRotationPoint(24F, -12F, -2F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		gunModel[154].setRotationPoint(24F, -13F, -2F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		gunModel[155].setRotationPoint(43F, -13F, -2F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		gunModel[156].setRotationPoint(47F, -15F, 1F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		gunModel[157].setRotationPoint(49F, -15F, 1F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		gunModel[158].setRotationPoint(51F, -15F, 1F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		gunModel[159].setRotationPoint(53F, -15F, 1F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		gunModel[160].setRotationPoint(52F, -14F, 1F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		gunModel[161].setRotationPoint(50F, -14F, 1F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		gunModel[162].setRotationPoint(46F, -14F, 1F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		gunModel[163].setRotationPoint(48F, -14F, 1F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 220
		gunModel[164].setRotationPoint(52F, -15F, 1F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 221
		gunModel[165].setRotationPoint(50F, -15F, 1F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 222
		gunModel[166].setRotationPoint(48F, -15F, 1F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 223
		gunModel[167].setRotationPoint(46F, -15F, 1F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		gunModel[168].setRotationPoint(33F, -15F, -2F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		gunModel[169].setRotationPoint(47F, -15F, -2F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		gunModel[170].setRotationPoint(49F, -15F, -2F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		gunModel[171].setRotationPoint(51F, -15F, -2F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		gunModel[172].setRotationPoint(53F, -15F, -2F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		gunModel[173].setRotationPoint(52F, -14F, -2F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		gunModel[174].setRotationPoint(50F, -14F, -2F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		gunModel[175].setRotationPoint(46F, -14F, -2F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		gunModel[176].setRotationPoint(48F, -14F, -2F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 233
		gunModel[177].setRotationPoint(52F, -15F, -2F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 234
		gunModel[178].setRotationPoint(50F, -15F, -2F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 235
		gunModel[179].setRotationPoint(48F, -15F, -2F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 236
		gunModel[180].setRotationPoint(46F, -15F, -2F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 239
		gunModel[181].setRotationPoint(-5.01F, -15.5F, -1F);


		defaultScopeModel = new ModelRendererTurbo[22];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 91
		defaultScopeModel[1] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 92
		defaultScopeModel[2] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 94
		defaultScopeModel[3] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 95
		defaultScopeModel[4] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 96
		defaultScopeModel[5] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 97
		defaultScopeModel[6] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 98
		defaultScopeModel[7] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 99
		defaultScopeModel[8] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 100
		defaultScopeModel[9] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 101
		defaultScopeModel[10] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 103
		defaultScopeModel[11] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 104
		defaultScopeModel[12] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 105
		defaultScopeModel[13] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 106
		defaultScopeModel[14] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 146
		defaultScopeModel[15] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 147
		defaultScopeModel[16] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 148
		defaultScopeModel[17] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 150
		defaultScopeModel[18] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 151
		defaultScopeModel[19] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 152
		defaultScopeModel[20] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 153
		defaultScopeModel[21] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 150

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0.2F, -0.35F, -0.1F, 0.2F, -0.35F, -0.1F, 0.2F, -0.35F, -0.1F, 0.2F, -0.35F, -0.1F, 0.8F, -0.35F, -0.1F, 0.8F, -0.35F, -0.1F, 0.8F, -0.35F, -0.1F, 0.8F, -0.35F); // Box 91
		defaultScopeModel[0].setRotationPoint(78F, -14.5F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 92
		defaultScopeModel[1].setRotationPoint(78F, -15.6F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.6F, -0.8F, 0.2F, 0.6F, -0.8F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, -0.8F, 0.2F, 0.5F, -0.8F); // Box 94
		defaultScopeModel[2].setRotationPoint(78F, -16.1F, -0.7F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 95
		defaultScopeModel[3].setRotationPoint(78F, -17.5F, -0.5F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0.6F, -0.8F, 0.2F, 0.6F, -0.8F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, -0.8F, 0.2F, 0.5F, -0.8F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 96
		defaultScopeModel[4].setRotationPoint(78F, -16.1F, -0.3F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 97
		defaultScopeModel[5].setRotationPoint(25F, -15.25F, -1F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F, 0.3F); // Box 98
		defaultScopeModel[6].setRotationPoint(26F, -15.05F, -1F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F, 0.3F, -0.15F, -0.15F, 0.3F); // Box 99
		defaultScopeModel[7].setRotationPoint(30F, -15.05F, -1F);

		defaultScopeModel[8].addShapeBox(-6F, -0.7F, 0F, 6, 1, 2, 0F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F); // Box 100
		defaultScopeModel[8].setRotationPoint(31.5F, -14.95F, -1F);
		defaultScopeModel[8].rotateAngleZ = -0.06981317F;

		defaultScopeModel[9].addShapeBox(-0.5F, -0.7F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F); // Box 101
		defaultScopeModel[9].setRotationPoint(31.5F, -14.95F, -1F);
		defaultScopeModel[9].rotateAngleZ = -0.06981317F;

		defaultScopeModel[10].addShapeBox(-6F, -1.1F, -0.15F, 2, 1, 1, 0F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 103
		defaultScopeModel[10].setRotationPoint(31.5F, -14.95F, -0.9F);
		defaultScopeModel[10].rotateAngleZ = -0.06981317F;

		defaultScopeModel[11].addShapeBox(-6F, -1.1F, 0.15F, 2, 1, 1, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 104
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

		defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F); // Box 152
		defaultScopeModel[19].setRotationPoint(30F, -15.05F, -1F);

		defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F); // Box 153
		defaultScopeModel[20].setRotationPoint(26F, -15.05F, -1F);

		defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F); // Box 150
		defaultScopeModel[21].setRotationPoint(78F, -15.5F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 76
		ammoModel[1] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 130

		ammoModel[0].addShapeBox(-0.500000000000001F, 2F, 0F, 9, 4, 1, 0F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F); // Box 76
		ammoModel[0].setRotationPoint(15F, -11F, -0.5F);
		ammoModel[0].rotateAngleZ = 0.13962634F;

		ammoModel[1].addShapeBox(-0.500000000000001F, 6F, 0F, 9, 4, 1, 0F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, -0.2F, 0.2F, 0.45F, 0.2F, 0F, 0.45F, 0.2F, 0F, 0.45F, -0.2F, 0.2F, 0.45F); // Box 130
		ammoModel[1].setRotationPoint(15F, -11F, -0.5F);
		ammoModel[1].rotateAngleZ = 0.13962634F;


		slideModel = new ModelRendererTurbo[4];
		slideModel[0] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 105
		slideModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 106
		slideModel[2] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 147
		slideModel[3] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 238

		slideModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		slideModel[0].setRotationPoint(19F, -15.5F, -1F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		slideModel[1].setRotationPoint(19F, -15F, -1.5F);

		slideModel[2].addShapeBox(0F, -1F, -3F, 1, 1, 2, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 147
		slideModel[2].setRotationPoint(15F, -13.8F, 0.5F);

		slideModel[3].addShapeBox(-0.5F, -1F, -6F, 3, 1, 3, 0F, -0.1F, -0.1F, -1F, -1.1F, -0.1F, -1F, -1.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -1F, -1.1F, -0.1F, -1F, -1.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 238
		slideModel[3].setRotationPoint(15F, -13.8F, 0.5F);

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