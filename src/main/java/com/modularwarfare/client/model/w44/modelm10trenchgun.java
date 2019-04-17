//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.11.2017 - 20:15:26
// Last changed on: 08.11.2017 - 20:15:26

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class modelm10trenchgun extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public modelm10trenchgun() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[221];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 40
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 44
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 46
		gunModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 48
		gunModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 50
		gunModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 51
		gunModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 53
		gunModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 55
		gunModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 56
		gunModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 60
		gunModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 61
		gunModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 144
		gunModel[12] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 151
		gunModel[13] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 152
		gunModel[14] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 153
		gunModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 154
		gunModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 158
		gunModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 160
		gunModel[18] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 33
		gunModel[19] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 34
		gunModel[20] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 38
		gunModel[21] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 39
		gunModel[22] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 42
		gunModel[23] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 43
		gunModel[24] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 44
		gunModel[25] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 45
		gunModel[26] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 46
		gunModel[27] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 47
		gunModel[28] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 48
		gunModel[29] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 49
		gunModel[30] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 50
		gunModel[31] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 51
		gunModel[32] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 52
		gunModel[33] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 53
		gunModel[34] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 54
		gunModel[35] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 108
		gunModel[36] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 109
		gunModel[37] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 110
		gunModel[38] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 111
		gunModel[39] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 112
		gunModel[40] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 113
		gunModel[41] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 131
		gunModel[42] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 150
		gunModel[43] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 169
		gunModel[44] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 170
		gunModel[45] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 171
		gunModel[46] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 172
		gunModel[47] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 173
		gunModel[48] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 174
		gunModel[49] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 175
		gunModel[50] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 176
		gunModel[51] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 177
		gunModel[52] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 178
		gunModel[53] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 179
		gunModel[54] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 180
		gunModel[55] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 181
		gunModel[56] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 182
		gunModel[57] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 183
		gunModel[58] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 184
		gunModel[59] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 185
		gunModel[60] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 186
		gunModel[61] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 187
		gunModel[62] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 188
		gunModel[63] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 189
		gunModel[64] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 190
		gunModel[65] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 191
		gunModel[66] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 192
		gunModel[67] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 193
		gunModel[68] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 194
		gunModel[69] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 195
		gunModel[70] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 196
		gunModel[71] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 197
		gunModel[72] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 198
		gunModel[73] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 199
		gunModel[74] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 200
		gunModel[75] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 201
		gunModel[76] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 202
		gunModel[77] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 203
		gunModel[78] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 98
		gunModel[79] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 99
		gunModel[80] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 100
		gunModel[81] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 101
		gunModel[82] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 102
		gunModel[83] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 103
		gunModel[84] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 104
		gunModel[85] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 105
		gunModel[86] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 106
		gunModel[87] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 107
		gunModel[88] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 108
		gunModel[89] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 109
		gunModel[90] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 110
		gunModel[91] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 111
		gunModel[92] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 112
		gunModel[93] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 113
		gunModel[94] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 114
		gunModel[95] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 115
		gunModel[96] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 116
		gunModel[97] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 117
		gunModel[98] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 118
		gunModel[99] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 119
		gunModel[100] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 120
		gunModel[101] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 121
		gunModel[102] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 122
		gunModel[103] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 123
		gunModel[104] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 124
		gunModel[105] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 125
		gunModel[106] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 126
		gunModel[107] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 127
		gunModel[108] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 128
		gunModel[109] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 129
		gunModel[110] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 130
		gunModel[111] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 131
		gunModel[112] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 132
		gunModel[113] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 133
		gunModel[114] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 134
		gunModel[115] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 135
		gunModel[116] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 136
		gunModel[117] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 137
		gunModel[118] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 138
		gunModel[119] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 139
		gunModel[120] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 140
		gunModel[121] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 141
		gunModel[122] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 142
		gunModel[123] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 162
		gunModel[124] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 163
		gunModel[125] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 164
		gunModel[126] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 169
		gunModel[127] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 170
		gunModel[128] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 171
		gunModel[129] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 172
		gunModel[130] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 173
		gunModel[131] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 174
		gunModel[132] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 175
		gunModel[133] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 176
		gunModel[134] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 177
		gunModel[135] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 178
		gunModel[136] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 179
		gunModel[137] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 180
		gunModel[138] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 181
		gunModel[139] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 182
		gunModel[140] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 183
		gunModel[141] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 184
		gunModel[142] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 185
		gunModel[143] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 186
		gunModel[144] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 187
		gunModel[145] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 188
		gunModel[146] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 189
		gunModel[147] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 190
		gunModel[148] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 191
		gunModel[149] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 192
		gunModel[150] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 193
		gunModel[151] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 194
		gunModel[152] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 195
		gunModel[153] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 196
		gunModel[154] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 197
		gunModel[155] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 198
		gunModel[156] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 199
		gunModel[157] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 200
		gunModel[158] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 201
		gunModel[159] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 202
		gunModel[160] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 203
		gunModel[161] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 204
		gunModel[162] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 205
		gunModel[163] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 206
		gunModel[164] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 207
		gunModel[165] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 208
		gunModel[166] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 209
		gunModel[167] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 210
		gunModel[168] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 211
		gunModel[169] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 212
		gunModel[170] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 213
		gunModel[171] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 214
		gunModel[172] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 215
		gunModel[173] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 216
		gunModel[174] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 217
		gunModel[175] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 218
		gunModel[176] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 219
		gunModel[177] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 220
		gunModel[178] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 221
		gunModel[179] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 222
		gunModel[180] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 223
		gunModel[181] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 224
		gunModel[182] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 225
		gunModel[183] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 226
		gunModel[184] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 227
		gunModel[185] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 228
		gunModel[186] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 229
		gunModel[187] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 230
		gunModel[188] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 231
		gunModel[189] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 232
		gunModel[190] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 233
		gunModel[191] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 234
		gunModel[192] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 237
		gunModel[193] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 238
		gunModel[194] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 239
		gunModel[195] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 240
		gunModel[196] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 242
		gunModel[197] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 243
		gunModel[198] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 244
		gunModel[199] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 245
		gunModel[200] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 246
		gunModel[201] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 247
		gunModel[202] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 208
		gunModel[203] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 210
		gunModel[204] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 211
		gunModel[205] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 251
		gunModel[206] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 252
		gunModel[207] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 253
		gunModel[208] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 254
		gunModel[209] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 255
		gunModel[210] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 256
		gunModel[211] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 257
		gunModel[212] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 258
		gunModel[213] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 259
		gunModel[214] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 260
		gunModel[215] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 261
		gunModel[216] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 262
		gunModel[217] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 263
		gunModel[218] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 264
		gunModel[219] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 265
		gunModel[220] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 266

		gunModel[0].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 40
		gunModel[0].setRotationPoint(-2F, -11.5F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[1].setRotationPoint(-4F, -9.5F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 46
		gunModel[2].setRotationPoint(-4F, -8.5F, 0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 48
		gunModel[3].setRotationPoint(-6F, -8.5F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 50
		gunModel[4].setRotationPoint(-6F, -7.5F, 0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 51
		gunModel[5].setRotationPoint(-2F, -11.5F, 0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 53
		gunModel[6].setRotationPoint(-14F, -6.5F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[7].setRotationPoint(-14F, -5.5F, 0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 21, 12, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 56
		gunModel[8].setRotationPoint(-35F, -6.5F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 21, 11, 1, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 1F, 0F); // Box 60
		gunModel[9].setRotationPoint(-35F, -5.5F, 0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F, -2F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -2F, 0.1F, 0.1F, -2F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -2F, 0.1F, 0.1F); // Box 61
		gunModel[10].setRotationPoint(-41F, -5.5F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F, -2F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -1F, 0.1F, -2F, -1F, 0.1F, -2F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -2F, 0F, -2F, -2F, 0F); // Box 144
		gunModel[11].setRotationPoint(-41F, -5.5F, 0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 151
		gunModel[12].setRotationPoint(-8F, -7.5F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 152
		gunModel[13].setRotationPoint(-8F, -6.5F, 0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 153
		gunModel[14].setRotationPoint(-10F, -5.5F, 0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F); // Box 154
		gunModel[15].setRotationPoint(-10F, -6.5F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 158
		gunModel[16].setRotationPoint(-13F, -6.5F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 160
		gunModel[17].setRotationPoint(-13F, -5.5F, 0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[18].setRotationPoint(2F, -11.5F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[19].setRotationPoint(2F, -11.5F, 0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 38
		gunModel[20].setRotationPoint(3F, -11.5F, 0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		gunModel[21].setRotationPoint(3F, -11.5F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[22].setRotationPoint(-4F, -8.5F, -1.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 43
		gunModel[23].setRotationPoint(-6F, -7.5F, -1.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 44
		gunModel[24].setRotationPoint(-2F, -11.5F, -1.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 45
		gunModel[25].setRotationPoint(-14F, -5.5F, -1.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 21, 11, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 46
		gunModel[26].setRotationPoint(-35F, -5.5F, -1.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F, -2F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, 0.1F, -0.1F, -2F, 0.1F, -0.1F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0.1F, -0.1F, -2F, 0.1F, -0.1F); // Box 47
		gunModel[27].setRotationPoint(-41F, -5.5F, -1.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 48
		gunModel[28].setRotationPoint(-8F, -6.5F, -1.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F); // Box 49
		gunModel[29].setRotationPoint(-10F, -5.5F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[30].setRotationPoint(-13F, -5.5F, -1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 51
		gunModel[31].setRotationPoint(2F, -11.5F, -1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 52
		gunModel[32].setRotationPoint(3F, -8.5F, -1.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 57, 2, 2, 0F, 0F, -0.2F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.3F); // Box 53
		gunModel[33].setRotationPoint(21F, -11F, -1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 67, 2, 2, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 54
		gunModel[34].setRotationPoint(-1F, -7.5F, -1F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 108
		gunModel[35].setRotationPoint(8F, -4.3F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 109
		gunModel[36].setRotationPoint(2F, -4.3F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[37].setRotationPoint(2F, -6.3F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[38].setRotationPoint(8F, -6.3F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[39].setRotationPoint(3.5F, -2.3F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.15F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 113
		gunModel[40].setRotationPoint(3.5F, -5.8F, -0.5F);
		gunModel[40].rotateAngleZ = 0.26179939F;

		gunModel[41].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 131
		gunModel[41].setRotationPoint(34F, -10.5F, 0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 150
		gunModel[42].setRotationPoint(34F, -10.5F, -1.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		gunModel[43].setRotationPoint(37F, -11.5F, 0.25F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		gunModel[44].setRotationPoint(37F, -11.5F, -1.25F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		gunModel[45].setRotationPoint(39F, -11.5F, 0.25F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		gunModel[46].setRotationPoint(39F, -11.5F, -1.25F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		gunModel[47].setRotationPoint(41F, -11.5F, 0.25F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		gunModel[48].setRotationPoint(41F, -11.5F, -1.25F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		gunModel[49].setRotationPoint(47F, -11.5F, 0.25F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		gunModel[50].setRotationPoint(47F, -11.5F, -1.25F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		gunModel[51].setRotationPoint(45F, -11.5F, 0.25F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		gunModel[52].setRotationPoint(45F, -11.5F, -1.25F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		gunModel[53].setRotationPoint(43F, -11.5F, -1.25F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		gunModel[54].setRotationPoint(43F, -11.5F, 0.25F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		gunModel[55].setRotationPoint(53F, -11.5F, 0.25F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		gunModel[56].setRotationPoint(53F, -11.5F, -1.25F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		gunModel[57].setRotationPoint(51F, -11.5F, 0.25F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		gunModel[58].setRotationPoint(51F, -11.5F, -1.25F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		gunModel[59].setRotationPoint(49F, -11.5F, -1.25F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		gunModel[60].setRotationPoint(49F, -11.5F, 0.25F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 187
		gunModel[61].setRotationPoint(37F, -11.5F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 188
		gunModel[62].setRotationPoint(52F, -11.5F, 0.25F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 189
		gunModel[63].setRotationPoint(50F, -11.5F, 0.25F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 190
		gunModel[64].setRotationPoint(46F, -11.5F, 0.25F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 191
		gunModel[65].setRotationPoint(48F, -11.5F, 0.25F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 192
		gunModel[66].setRotationPoint(42F, -11.5F, 0.25F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 193
		gunModel[67].setRotationPoint(44F, -11.5F, 0.25F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 194
		gunModel[68].setRotationPoint(38F, -11.5F, 0.25F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 195
		gunModel[69].setRotationPoint(40F, -11.5F, 0.25F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 196
		gunModel[70].setRotationPoint(52F, -11.5F, -1.25F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 197
		gunModel[71].setRotationPoint(50F, -11.5F, -1.25F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 198
		gunModel[72].setRotationPoint(46F, -11.5F, -1.25F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 199
		gunModel[73].setRotationPoint(48F, -11.5F, -1.25F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 200
		gunModel[74].setRotationPoint(42F, -11.5F, -1.25F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 201
		gunModel[75].setRotationPoint(44F, -11.5F, -1.25F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 202
		gunModel[76].setRotationPoint(38F, -11.5F, -1.25F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 203
		gunModel[77].setRotationPoint(40F, -11.5F, -1.25F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 98
		gunModel[78].setRotationPoint(39F, -11.5F, -0.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 99
		gunModel[79].setRotationPoint(41F, -11.5F, -0.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 100
		gunModel[80].setRotationPoint(45F, -11.5F, -0.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 101
		gunModel[81].setRotationPoint(47F, -11.5F, -0.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 102
		gunModel[82].setRotationPoint(43F, -11.5F, -0.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 103
		gunModel[83].setRotationPoint(51F, -11.5F, -0.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 104
		gunModel[84].setRotationPoint(53F, -11.5F, -0.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 105
		gunModel[85].setRotationPoint(49F, -11.5F, -0.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 106
		gunModel[86].setRotationPoint(34F, -10.5F, 0.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[87].setRotationPoint(34F, -10.5F, -1.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 108
		gunModel[88].setRotationPoint(58F, -11.5F, 0.25F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 109
		gunModel[89].setRotationPoint(58F, -11.5F, -1.25F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[90].setRotationPoint(59F, -11.5F, 0.25F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 111
		gunModel[91].setRotationPoint(59F, -11.5F, -0.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[92].setRotationPoint(59F, -11.5F, -1.25F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		gunModel[93].setRotationPoint(57F, -11.5F, 0.25F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 114
		gunModel[94].setRotationPoint(57F, -11.5F, -0.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		gunModel[95].setRotationPoint(57F, -11.5F, -1.25F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
		gunModel[96].setRotationPoint(56F, -11.5F, -1.25F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 117
		gunModel[97].setRotationPoint(56F, -11.5F, 0.25F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		gunModel[98].setRotationPoint(55F, -11.5F, -1.25F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 119
		gunModel[99].setRotationPoint(55F, -11.5F, -0.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		gunModel[100].setRotationPoint(55F, -11.5F, 0.25F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 121
		gunModel[101].setRotationPoint(54F, -11.5F, 0.25F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 122
		gunModel[102].setRotationPoint(54F, -11.5F, -1.25F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 123
		gunModel[103].setRotationPoint(64F, -11.5F, 0.25F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 124
		gunModel[104].setRotationPoint(64F, -11.5F, -1.25F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		gunModel[105].setRotationPoint(65F, -11.5F, 0.25F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 126
		gunModel[106].setRotationPoint(65F, -11.5F, -0.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		gunModel[107].setRotationPoint(65F, -11.5F, -1.25F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		gunModel[108].setRotationPoint(63F, -11.5F, 0.25F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 129
		gunModel[109].setRotationPoint(63F, -11.5F, -0.5F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		gunModel[110].setRotationPoint(63F, -11.5F, -1.25F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 131
		gunModel[111].setRotationPoint(62F, -11.5F, -1.25F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 132
		gunModel[112].setRotationPoint(62F, -11.5F, 0.25F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		gunModel[113].setRotationPoint(61F, -11.5F, -1.25F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 134
		gunModel[114].setRotationPoint(61F, -11.5F, -0.5F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		gunModel[115].setRotationPoint(61F, -11.5F, 0.25F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 136
		gunModel[116].setRotationPoint(60F, -11.5F, 0.25F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 137
		gunModel[117].setRotationPoint(60F, -11.5F, -1.25F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 138
		gunModel[118].setRotationPoint(66F, -11.5F, 0.25F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 139
		gunModel[119].setRotationPoint(66F, -11.5F, -1.25F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		gunModel[120].setRotationPoint(67F, -11.5F, -1.25F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 141
		gunModel[121].setRotationPoint(67F, -11.5F, -0.5F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		gunModel[122].setRotationPoint(67F, -11.5F, 0.25F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 67, 2, 2, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 162
		gunModel[123].setRotationPoint(-1F, -9.6F, -1F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 163
		gunModel[124].setRotationPoint(53F, -7.5F, -1F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F); // Box 164
		gunModel[125].setRotationPoint(53.5F, -8.5F, -0.5F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169
		gunModel[126].setRotationPoint(66F, -9.5F, 0.25F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 170
		gunModel[127].setRotationPoint(65F, -9.5F, 0.25F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F); // Box 171
		gunModel[128].setRotationPoint(38F, -9.5F, -0.5F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 172
		gunModel[129].setRotationPoint(67F, -9.5F, -1.25F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 173
		gunModel[130].setRotationPoint(66F, -9.5F, -1.25F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 174
		gunModel[131].setRotationPoint(65F, -9.5F, -1.25F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 175
		gunModel[132].setRotationPoint(63F, -9.5F, 0.25F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		gunModel[133].setRotationPoint(64F, -9.5F, 0.25F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 177
		gunModel[134].setRotationPoint(62F, -9.5F, 0.25F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 178
		gunModel[135].setRotationPoint(61F, -9.5F, 0.25F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 179
		gunModel[136].setRotationPoint(60F, -9.5F, 0.25F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 180
		gunModel[137].setRotationPoint(58F, -9.5F, 0.25F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 181
		gunModel[138].setRotationPoint(59F, -9.5F, 0.25F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 182
		gunModel[139].setRotationPoint(57F, -9.5F, 0.25F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 183
		gunModel[140].setRotationPoint(56F, -9.5F, 0.25F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 184
		gunModel[141].setRotationPoint(55F, -9.5F, 0.25F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 185
		gunModel[142].setRotationPoint(54F, -9.5F, 0.25F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 186
		gunModel[143].setRotationPoint(53F, -9.5F, 0.25F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 187
		gunModel[144].setRotationPoint(52F, -9.5F, 0.25F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 188
		gunModel[145].setRotationPoint(51F, -9.5F, 0.25F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 189
		gunModel[146].setRotationPoint(50F, -9.5F, 0.25F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 190
		gunModel[147].setRotationPoint(49F, -9.5F, 0.25F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 191
		gunModel[148].setRotationPoint(48F, -9.5F, 0.25F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		gunModel[149].setRotationPoint(47F, -9.5F, 0.25F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 193
		gunModel[150].setRotationPoint(46F, -9.5F, 0.25F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 194
		gunModel[151].setRotationPoint(45F, -9.5F, 0.25F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 195
		gunModel[152].setRotationPoint(44F, -9.5F, 0.25F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 196
		gunModel[153].setRotationPoint(42F, -9.5F, 0.25F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 197
		gunModel[154].setRotationPoint(41F, -9.5F, 0.25F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 198
		gunModel[155].setRotationPoint(40F, -9.5F, 0.25F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 199
		gunModel[156].setRotationPoint(39F, -9.5F, 0.25F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 200
		gunModel[157].setRotationPoint(38F, -9.5F, 0.25F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 201
		gunModel[158].setRotationPoint(37F, -9.5F, 0.25F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 202
		gunModel[159].setRotationPoint(43F, -9.5F, 0.25F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 203
		gunModel[160].setRotationPoint(63F, -9.5F, -1.25F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 204
		gunModel[161].setRotationPoint(64F, -9.5F, -1.25F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 205
		gunModel[162].setRotationPoint(62F, -9.5F, -1.25F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 206
		gunModel[163].setRotationPoint(61F, -9.5F, -1.25F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 207
		gunModel[164].setRotationPoint(60F, -9.5F, -1.25F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 208
		gunModel[165].setRotationPoint(58F, -9.5F, -1.25F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 209
		gunModel[166].setRotationPoint(59F, -9.5F, -1.25F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 210
		gunModel[167].setRotationPoint(57F, -9.5F, -1.25F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 211
		gunModel[168].setRotationPoint(56F, -9.5F, -1.25F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 212
		gunModel[169].setRotationPoint(55F, -9.5F, -1.25F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 213
		gunModel[170].setRotationPoint(54F, -9.5F, -1.25F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 214
		gunModel[171].setRotationPoint(53F, -9.5F, -1.25F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 215
		gunModel[172].setRotationPoint(52F, -9.5F, -1.25F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 216
		gunModel[173].setRotationPoint(51F, -9.5F, -1.25F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 217
		gunModel[174].setRotationPoint(50F, -9.5F, -1.25F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 218
		gunModel[175].setRotationPoint(49F, -9.5F, -1.25F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 219
		gunModel[176].setRotationPoint(48F, -9.5F, -1.25F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 220
		gunModel[177].setRotationPoint(47F, -9.5F, -1.25F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 221
		gunModel[178].setRotationPoint(46F, -9.5F, -1.25F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 222
		gunModel[179].setRotationPoint(45F, -9.5F, -1.25F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 223
		gunModel[180].setRotationPoint(44F, -9.5F, -1.25F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 224
		gunModel[181].setRotationPoint(42F, -9.5F, -1.25F);

		gunModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 225
		gunModel[182].setRotationPoint(41F, -9.5F, -1.25F);

		gunModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 226
		gunModel[183].setRotationPoint(40F, -9.5F, -1.25F);

		gunModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 227
		gunModel[184].setRotationPoint(39F, -9.5F, -1.25F);

		gunModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 228
		gunModel[185].setRotationPoint(38F, -9.5F, -1.25F);

		gunModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 229
		gunModel[186].setRotationPoint(37F, -9.5F, -1.25F);

		gunModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 230
		gunModel[187].setRotationPoint(43F, -9.5F, -1.25F);

		gunModel[188].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 231
		gunModel[188].setRotationPoint(21F, -11F, -1F);

		gunModel[189].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 232
		gunModel[189].setRotationPoint(21.5F, -11.5F, 0.5F);

		gunModel[190].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		gunModel[190].setRotationPoint(21.5F, -11.5F, -0.5F);

		gunModel[191].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 234
		gunModel[191].setRotationPoint(21.5F, -11.5F, -1.5F);

		gunModel[192].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		gunModel[192].setRotationPoint(20.75F, -11.25F, -0.5F);

		gunModel[193].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 238
		gunModel[193].setRotationPoint(20.75F, -11.25F, 0.5F);

		gunModel[194].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 239
		gunModel[194].setRotationPoint(20.75F, -11.25F, -1.5F);

		gunModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 240
		gunModel[195].setRotationPoint(67F, -9.5F, 0.25F);

		gunModel[196].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 242
		gunModel[196].setRotationPoint(66F, -8.5F, -0.5F);

		gunModel[197].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.15F, 0F, -0.2F, -0.15F, 0F, -0.2F, -0.15F, 0F, -0.2F, -0.15F, 0F, -0.2F, -1F, 0.5F, -0.2F, -1F, 0.5F, -0.2F, -1F, 0.5F, -0.2F, -1F, 0.5F, -0.2F); // Box 243
		gunModel[197].setRotationPoint(66F, -4.5F, -0.5F);

		gunModel[198].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 244
		gunModel[198].setRotationPoint(69F, -9F, -0.5F);

		gunModel[199].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		gunModel[199].setRotationPoint(74.15F, -8F, -0.5F);

		gunModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 246
		gunModel[200].setRotationPoint(77.5F, -8F, -0.5F);

		gunModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 247
		gunModel[201].setRotationPoint(75F, -12.5F, -0.5F);

		gunModel[202].addShapeBox(0F, 0F, 0F, 52, 1, 2, 0F, 0F, -0.25F, -0.25F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -0.25F, -0.25F); // Box 208
		gunModel[202].setRotationPoint(-32F, 6F, -1F);

		gunModel[203].addShapeBox(0F, 0F, 0F, 25, 1, 2, 0F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, 1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.75F, 0F); // Box 210
		gunModel[203].setRotationPoint(20F, 6F, -1F);

		gunModel[204].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F, 0F, -2.25F, -0.25F, 0F, 8.75F, -0.25F, 0F, 8.75F, 0F, 0F, -2.25F, 0F, 0F, 1.75F, 0F, 0F, -9.25F, -0.25F, 0F, -9.25F, -0.25F, 0F, 1.75F, 0F); // Box 211
		gunModel[204].setRotationPoint(45F, 4F, -1F);

		gunModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 251
		gunModel[205].setRotationPoint(65F, -4.5F, -1F);
		gunModel[205].rotateAngleZ = 0.48869219F;

		gunModel[206].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F); // Box 252
		gunModel[206].setRotationPoint(65F, -4.5F, -1F);
		gunModel[206].rotateAngleZ = 0.48869219F;

		gunModel[207].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 253
		gunModel[207].setRotationPoint(3F, -11.5F, -1.5F);

		gunModel[208].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 254
		gunModel[208].setRotationPoint(3F, -10.5F, -1.5F);

		gunModel[209].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 255
		gunModel[209].setRotationPoint(19F, -10.5F, -1.5F);

		gunModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		gunModel[210].setRotationPoint(34F, -11.5F, -1.25F);

		gunModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		gunModel[211].setRotationPoint(34F, -11.5F, 0.25F);

		gunModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 258
		gunModel[212].setRotationPoint(34F, -11.5F, -0.5F);

		gunModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 259
		gunModel[213].setRotationPoint(36F, -11.5F, -1.25F);

		gunModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 260
		gunModel[214].setRotationPoint(36F, -11.5F, 0.25F);

		gunModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 261
		gunModel[215].setRotationPoint(34F, -9.5F, 0.25F);

		gunModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F); // Box 262
		gunModel[216].setRotationPoint(34F, -9.5F, -0.5F);

		gunModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 263
		gunModel[217].setRotationPoint(34F, -9.5F, -1.25F);

		gunModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 264
		gunModel[218].setRotationPoint(36F, -9.5F, 0.25F);

		gunModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 265
		gunModel[219].setRotationPoint(36F, -9.5F, -1.25F);

		gunModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 266
		gunModel[220].setRotationPoint(75F, -11F, -1F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 222, 117, textureX, textureY); // Box 260

		ammoModel[0].addShapeBox(13F, -10F, -1F, 6, 2, 2, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 260
		ammoModel[0].setRotationPoint(0F, 0F, 0F);


		pumpModel = new ModelRendererTurbo[39];
		pumpModel[0] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 143
		pumpModel[1] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 144
		pumpModel[2] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 145
		pumpModel[3] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 146
		pumpModel[4] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 147
		pumpModel[5] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 148
		pumpModel[6] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 149
		pumpModel[7] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 150
		pumpModel[8] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 151
		pumpModel[9] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 152
		pumpModel[10] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 153
		pumpModel[11] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 154
		pumpModel[12] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 155
		pumpModel[13] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 156
		pumpModel[14] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 157
		pumpModel[15] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 158
		pumpModel[16] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 159
		pumpModel[17] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 160
		pumpModel[18] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 161
		pumpModel[19] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 162
		pumpModel[20] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 163
		pumpModel[21] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 164
		pumpModel[22] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 165
		pumpModel[23] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 166
		pumpModel[24] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 167
		pumpModel[25] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 168
		pumpModel[26] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 169
		pumpModel[27] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 170
		pumpModel[28] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 171
		pumpModel[29] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 172
		pumpModel[30] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 173
		pumpModel[31] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 174
		pumpModel[32] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 175
		pumpModel[33] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 176
		pumpModel[34] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 177
		pumpModel[35] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 178
		pumpModel[36] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 159
		pumpModel[37] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 160
		pumpModel[38] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 161

		pumpModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		pumpModel[0].setRotationPoint(34F, -7.5F, -2F);

		pumpModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		pumpModel[1].setRotationPoint(34F, -8.5F, -2F);

		pumpModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 145
		pumpModel[2].setRotationPoint(34F, -4.5F, -2F);

		pumpModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 146
		pumpModel[3].setRotationPoint(35.5F, -4.5F, -2F);

		pumpModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		pumpModel[4].setRotationPoint(35.5F, -8.5F, -2F);

		pumpModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		pumpModel[5].setRotationPoint(35.5F, -7.5F, -2F);

		pumpModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 149
		pumpModel[6].setRotationPoint(38.5F, -4.5F, -2F);

		pumpModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		pumpModel[7].setRotationPoint(38.5F, -8.5F, -2F);

		pumpModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		pumpModel[8].setRotationPoint(38.5F, -7.5F, -2F);

		pumpModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		pumpModel[9].setRotationPoint(37F, -8.5F, -2F);

		pumpModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		pumpModel[10].setRotationPoint(37F, -7.5F, -2F);

		pumpModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 154
		pumpModel[11].setRotationPoint(37F, -4.5F, -2F);

		pumpModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 155
		pumpModel[12].setRotationPoint(41.5F, -4.5F, -2F);

		pumpModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		pumpModel[13].setRotationPoint(41.5F, -8.5F, -2F);

		pumpModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		pumpModel[14].setRotationPoint(41.5F, -7.5F, -2F);

		pumpModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		pumpModel[15].setRotationPoint(40F, -8.5F, -2F);

		pumpModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		pumpModel[16].setRotationPoint(40F, -7.5F, -2F);

		pumpModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 160
		pumpModel[17].setRotationPoint(40F, -4.5F, -2F);

		pumpModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 161
		pumpModel[18].setRotationPoint(44.5F, -4.5F, -2F);

		pumpModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		pumpModel[19].setRotationPoint(44.5F, -8.5F, -2F);

		pumpModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		pumpModel[20].setRotationPoint(44.5F, -7.5F, -2F);

		pumpModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		pumpModel[21].setRotationPoint(43F, -8.5F, -2F);

		pumpModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		pumpModel[22].setRotationPoint(43F, -7.5F, -2F);

		pumpModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 166
		pumpModel[23].setRotationPoint(43F, -4.5F, -2F);

		pumpModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		pumpModel[24].setRotationPoint(47.5F, -4.5F, -2F);

		pumpModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		pumpModel[25].setRotationPoint(47.5F, -8.5F, -2F);

		pumpModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		pumpModel[26].setRotationPoint(47.5F, -7.5F, -2F);

		pumpModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		pumpModel[27].setRotationPoint(46F, -8.5F, -2F);

		pumpModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		pumpModel[28].setRotationPoint(46F, -7.5F, -2F);

		pumpModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 172
		pumpModel[29].setRotationPoint(46F, -4.5F, -2F);

		pumpModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 173
		pumpModel[30].setRotationPoint(50.5F, -4.5F, -2F);

		pumpModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		pumpModel[31].setRotationPoint(50.5F, -8.5F, -2F);

		pumpModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		pumpModel[32].setRotationPoint(50.5F, -7.5F, -2F);

		pumpModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		pumpModel[33].setRotationPoint(49F, -8.5F, -2F);

		pumpModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		pumpModel[34].setRotationPoint(49F, -7.5F, -2F);

		pumpModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 178
		pumpModel[35].setRotationPoint(49F, -4.5F, -2F);

		pumpModel[36].addShapeBox(0F, 0F, 0F, 19, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		pumpModel[36].setRotationPoint(33F, -7.5F, -1.5F);

		pumpModel[37].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F, 0F, 0.01F, -1F, 0F, 0.01F, -1F, 0F, 0.01F, -1F, 0F, 0.01F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		pumpModel[37].setRotationPoint(33F, -8.5F, -1.5F);

		pumpModel[38].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, -1F, 0F, 0.01F, -1F, 0F, 0.01F, -1F, 0F, 0.01F, -1F); // Box 161
		pumpModel[38].setRotationPoint(33F, -4.5F, -1.5F);

		this.modelScale = 0.25F;

//		scopeAttachPoint = new Vector3f(15 /16F, 48F /16F, 0F /16F);
		translateAll = new Vector3f(0F, -13F, -0.15F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.05F, 0F);//forward/up/? 

	    actionArm = EnumArm.Left;
	    actionType = EnumAction.Bolt;
		rotationHelper = new Vector3f(0, 0.85F, 0);
		boltRotationPoint = new Vector3f(0, 0.85F, 0);
		boltRotation = 0F;
		
		gunSlideDistance = 0F;
		reloadAnimation = WeaponAnimations.SNIPER;
		translateAimPosition = new Vector3f(0.05F, 0F, 0F);
		rotateGunVertical = 05F;
		rotateGunHorizontal = 21F;
		tiltGun = -05F;
		/*tiltGunTime = 0.20F;
		unloadClipTime = 0.30F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.15F;*/
		translateGun = new Vector3f(3 /16F, -1F /16F, -2F /16F);
		rotateClipVertical = -90F;
		rotateClipHorizontal = -1F;
		tiltClip = -08F;
		translateClip = new Vector3f(-0 /16F, -20F /16F, 1F /16F);

		hasFlash = false;
        
        leftArmPos = new Vector3f(0.450F, -0.68F, 0.07F);
        leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.450F, -0.68F, 0.07F);
        leftArmReloadRot = new Vector3f(65.0F, 30.0F, -45.0F);
 
        leftArmChargePos = new Vector3f(0.450F, -0.68F, 0.07F);
        leftArmChargeRot = new Vector3f(65.0F, 30.0F, -45.0F);
        
        rightArmPos = new Vector3f(0.43F, -0.59F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.27F, -0.59F, 0.04F);
        rightArmReloadRot = new Vector3f(15F, 15F, -90.0F);

        
        rightArmScale = new Vector3f(0.7F, 0.8F, 0.7F);
        leftArmScale = new Vector3f(0.7F, 1.0F, 0.7F);
 
        leftHandAmmo = true;
        
		//RecoilSlideDistance = 0.16F;
		//RotateSlideDistance = -1F;
        
		pumpDelayAfterReload = 65;
		pumpDelay = 10;
		pumpTime = 20;
		gripIsOnPump = false;
		pumpHandleDistance = 0.45F;
		
		chargeModifier = new Vector3f (0.25F, -0.25F, -0.095F);
		
		crouchZoom = -0.45F;
		fancyStance = true;
		sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
		sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);

		flipAll();
	}
}