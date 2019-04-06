//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.02.2018 - 18:38:55
// Last changed on: 25.02.2018 - 18:38:55

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class stg44 extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;
	
	public stg44() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[184];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 18
		gunModel[18] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 19
		gunModel[19] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 21
		gunModel[20] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 22
		gunModel[21] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 23
		gunModel[22] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 24
		gunModel[23] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 25
		gunModel[24] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 26
		gunModel[25] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 27
		gunModel[26] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 28
		gunModel[27] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 29
		gunModel[28] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 30
		gunModel[29] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 31
		gunModel[30] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 32
		gunModel[31] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 33
		gunModel[32] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 34
		gunModel[33] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 35
		gunModel[34] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 36
		gunModel[35] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 37
		gunModel[36] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 38
		gunModel[37] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 39
		gunModel[38] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 40
		gunModel[39] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 41
		gunModel[40] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 42
		gunModel[41] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 43
		gunModel[42] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 44
		gunModel[43] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 45
		gunModel[44] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 46
		gunModel[45] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 47
		gunModel[46] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 48
		gunModel[47] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 49
		gunModel[48] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 50
		gunModel[49] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 51
		gunModel[50] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 52
		gunModel[51] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 53
		gunModel[52] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 54
		gunModel[53] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 55
		gunModel[54] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 56
		gunModel[55] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 57
		gunModel[56] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 58
		gunModel[57] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 59
		gunModel[58] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 60
		gunModel[59] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 61
		gunModel[60] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 62
		gunModel[61] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 63
		gunModel[62] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 64
		gunModel[63] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 66
		gunModel[64] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 67
		gunModel[65] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 68
		gunModel[66] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 69
		gunModel[67] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 70
		gunModel[68] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 71
		gunModel[69] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 72
		gunModel[70] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 73
		gunModel[71] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 74
		gunModel[72] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 75
		gunModel[73] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 76
		gunModel[74] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 77
		gunModel[75] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 77
		gunModel[76] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 78
		gunModel[77] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 79
		gunModel[78] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 80
		gunModel[79] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 81
		gunModel[80] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 82
		gunModel[81] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 83
		gunModel[82] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 84
		gunModel[83] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 85
		gunModel[84] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 86
		gunModel[85] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 87
		gunModel[86] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 88
		gunModel[87] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 89
		gunModel[88] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 90
		gunModel[89] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 91
		gunModel[90] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 92
		gunModel[91] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 93
		gunModel[92] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 94
		gunModel[93] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 95
		gunModel[94] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 96
		gunModel[95] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 97
		gunModel[96] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 103
		gunModel[97] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 105
		gunModel[98] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 106
		gunModel[99] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 107
		gunModel[100] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 108
		gunModel[101] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 110
		gunModel[102] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 111
		gunModel[103] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 112
		gunModel[104] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 113
		gunModel[105] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 114
		gunModel[106] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 115
		gunModel[107] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 116
		gunModel[108] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 117
		gunModel[109] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 120
		gunModel[110] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 121
		gunModel[111] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 122
		gunModel[112] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 123
		gunModel[113] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 125
		gunModel[114] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 126
		gunModel[115] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 127
		gunModel[116] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 128
		gunModel[117] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 129
		gunModel[118] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 130
		gunModel[119] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 131
		gunModel[120] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 132
		gunModel[121] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 133
		gunModel[122] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 134
		gunModel[123] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 135
		gunModel[124] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 136
		gunModel[125] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 137
		gunModel[126] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 138
		gunModel[127] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 139
		gunModel[128] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 140
		gunModel[129] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 141
		gunModel[130] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 142
		gunModel[131] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 143
		gunModel[132] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 144
		gunModel[133] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 145
		gunModel[134] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 146
		gunModel[135] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 147
		gunModel[136] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 148
		gunModel[137] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 149
		gunModel[138] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 150
		gunModel[139] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 153
		gunModel[140] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 154
		gunModel[141] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 155
		gunModel[142] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 156
		gunModel[143] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 157
		gunModel[144] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 158
		gunModel[145] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 160
		gunModel[146] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 161
		gunModel[147] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 162
		gunModel[148] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 163
		gunModel[149] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 164
		gunModel[150] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 165
		gunModel[151] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 166
		gunModel[152] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 167
		gunModel[153] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 168
		gunModel[154] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 201
		gunModel[155] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 202
		gunModel[156] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 203
		gunModel[157] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 204
		gunModel[158] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 205
		gunModel[159] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 206
		gunModel[160] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 207
		gunModel[161] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 212
		gunModel[162] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 213
		gunModel[163] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 214
		gunModel[164] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 215
		gunModel[165] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 216
		gunModel[166] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 217
		gunModel[167] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 218
		gunModel[168] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 219
		gunModel[169] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 220
		gunModel[170] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 221
		gunModel[171] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 222
		gunModel[172] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 223
		gunModel[173] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 224
		gunModel[174] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 225
		gunModel[175] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 226
		gunModel[176] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 227
		gunModel[177] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 228
		gunModel[178] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 216
		gunModel[179] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 217
		gunModel[180] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 218
		gunModel[181] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 219
		gunModel[182] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 220
		gunModel[183] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 219

		gunModel[0].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 1
		gunModel[0].setRotationPoint(51.5F, -13F, -1F);

		gunModel[1].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 2
		gunModel[1].setRotationPoint(51.5F, -16.6F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[2].setRotationPoint(43.5F, -16.75F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[3].setRotationPoint(37.8F, -16.75F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[4].setRotationPoint(28.1F, -16.75F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 6
		gunModel[5].setRotationPoint(50.5F, -13F, -1F);

		gunModel[6].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 7
		gunModel[6].setRotationPoint(69.5F, -13F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 8
		gunModel[7].setRotationPoint(36.5F, -16.6F, -1F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.2F, -0.2F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0F, -0.2F, -0.2F); // Box 9
		gunModel[8].setRotationPoint(56.5F, -16.2F, -1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 10
		gunModel[9].setRotationPoint(51.5F, -14.8F, -1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 11
		gunModel[10].setRotationPoint(51.5F, -15F, -1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 12
		gunModel[11].setRotationPoint(51.5F, -13.6F, -1F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 18, 1, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 13
		gunModel[12].setRotationPoint(28.8F, -15.6F, -1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 14
		gunModel[13].setRotationPoint(28.8F, -15.1F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 15
		gunModel[14].setRotationPoint(28.8F, -14.6F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 16
		gunModel[15].setRotationPoint(49.8F, -14.6F, -1.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 22, 3, 3, 0F, 0F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 17
		gunModel[16].setRotationPoint(28.8F, -14.1F, -1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F, 0F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.6F, 0F, 0.3F, -0.6F, 0F, 0.3F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 18
		gunModel[17].setRotationPoint(28.8F, -11.6F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 22, 1, 3, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 19
		gunModel[18].setRotationPoint(28.8F, -11.2F, -1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F, 0F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 21
		gunModel[19].setRotationPoint(31.8F, -11F, -1.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F, 0F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.6F, 0F, 0.3F, -0.6F, 0F, 0.3F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 22
		gunModel[20].setRotationPoint(31.8F, -12.6F, -1.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F, 0F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.5F, 0.4F, 0.3F, -0.5F, 0.4F, 0.3F, -0.5F, 0.4F, 0F, -0.5F, 0.4F); // Box 23
		gunModel[21].setRotationPoint(28.8F, -11.9F, -1.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F, 0F, -0.2F, 0.4F, 0.3F, -0.2F, 0.4F, 0.3F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.5F, 0.4F, 0.3F, -0.5F, 0.4F, 0.3F, -0.5F, 0.4F, 0F, -0.5F, 0.4F); // Box 24
		gunModel[22].setRotationPoint(28.8F, -12.4F, -1.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F, 0F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 25
		gunModel[23].setRotationPoint(33.8F, -12F, -1F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F); // Box 26
		gunModel[24].setRotationPoint(28.8F, -12.7F, -1.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F, 0F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 27
		gunModel[25].setRotationPoint(28.8F, -13.6F, -1.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -2F, 0F, 0.4F, -2F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 28
		gunModel[26].setRotationPoint(28.8F, -11F, -1.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F); // Box 29
		gunModel[27].setRotationPoint(28.8F, -10F, -1.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0.4F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0F, 0F, 0.4F, 0F, -0.6F, 0.1F, 0F, -1.6F, 0.1F, 0F, -1.6F, 0.1F, 0F, -0.6F, 0.1F); // Box 30
		gunModel[28].setRotationPoint(29.8F, -10F, -1F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.1F, 0.4F, 0.5F, -0.1F, 0.4F, 0.5F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F); // Box 31
		gunModel[29].setRotationPoint(28.8F, -11.5F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0.4F, -0.5F, 0.4F, 0.4F, -0.5F, 0.4F, 0.4F, 0F, 0F, 0.4F, 0F, -0.6F, 0.1F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, 0F, -0.6F, 0.1F); // Box 32
		gunModel[30].setRotationPoint(31.8F, -11F, -1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.3F, -0.2F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.3F, 0F, 0.4F); // Box 33
		gunModel[31].setRotationPoint(47.8F, -13.6F, -1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.3F, 0.1F, 0.4F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, -0.3F, 0.1F, 0.4F, -0.3F, 0.1F, 0.4F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, -0.3F, 0.1F, 0.4F); // Box 34
		gunModel[32].setRotationPoint(47.8F, -12.5F, -1.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.3F, 0F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.3F, 0F, 0.4F, -0.3F, -0.6F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.3F, -0.6F, 0F); // Box 35
		gunModel[33].setRotationPoint(47.8F, -11.4F, -1.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.3F, -0.4F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, -0.4F, -0.3F, -0.4F, -0.6F, -0.3F, -0.4F, -0.6F, -0.3F, -0.2F, -0.4F); // Box 36
		gunModel[34].setRotationPoint(47.8F, -11.4F, -1.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[35].setRotationPoint(62.5F, -15.7F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 38
		gunModel[36].setRotationPoint(57.5F, -15.7F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F); // Box 39
		gunModel[37].setRotationPoint(-14F, -16.9F, -1F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 23, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.8F, 0F, 0F, -10.8F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[38].setRotationPoint(-37F, -11.9F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[39].setRotationPoint(-38F, -14.9F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[40].setRotationPoint(-30F, -14.9F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[41].setRotationPoint(-26F, -14.9F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -0.6F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[42].setRotationPoint(-20F, -14.9F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 1.8F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[43].setRotationPoint(-15F, -14.9F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 46
		gunModel[44].setRotationPoint(-39F, -7.9F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 47
		gunModel[45].setRotationPoint(-39F, -11.9F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 48
		gunModel[46].setRotationPoint(-39F, -1.9F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F); // Box 49
		gunModel[47].setRotationPoint(-39F, 0.1F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 50
		gunModel[48].setRotationPoint(-40F, -15F, -0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.7F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		gunModel[49].setRotationPoint(-40F, -12.9F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F); // Box 52
		gunModel[50].setRotationPoint(-14F, -16.9F, 1F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 1.8F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[51].setRotationPoint(-15F, -14.9F, 0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -0.6F, 0F, 0F, 1.8F, 0F, 0F, 0.8F, 0F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[52].setRotationPoint(-20F, -14.9F, 0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 23, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.8F, 0F, 0F, -11.2F, 0F, 0F, -0.4F, 0F); // Box 55
		gunModel[53].setRotationPoint(-37F, -11.9F, 0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[54].setRotationPoint(-26F, -14.9F, 0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[55].setRotationPoint(-38F, -14.9F, 0.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0.2F, 0F, 0F, -0.6F, 0F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		gunModel[56].setRotationPoint(-30F, -14.9F, 0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 59
		gunModel[57].setRotationPoint(-40F, -15F, 0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.7F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		gunModel[58].setRotationPoint(-40F, -12.9F, 0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 61
		gunModel[59].setRotationPoint(-39F, -11.9F, 0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 62
		gunModel[60].setRotationPoint(-39F, -7.9F, 0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 63
		gunModel[61].setRotationPoint(-39F, -1.9F, 0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.8F, 0F); // Box 64
		gunModel[62].setRotationPoint(-39F, 0.1F, 0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0.8F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[63].setRotationPoint(-15F, -14.9F, -1.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -1.6F, 0F, 0F, 0.8F, 0F, 0F, 1.8F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		gunModel[64].setRotationPoint(-20F, -14.9F, -1.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 23, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -11.2F, 0F, 0F, -10.8F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[65].setRotationPoint(-37F, -11.9F, -1.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[66].setRotationPoint(-26F, -14.9F, -1.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		gunModel[67].setRotationPoint(-38F, -14.9F, -1.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -0.6F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[68].setRotationPoint(-30F, -14.9F, -1.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 72
		gunModel[69].setRotationPoint(-40F, -15F, -1.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.7F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		gunModel[70].setRotationPoint(-40F, -12.9F, -1.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 74
		gunModel[71].setRotationPoint(-39F, -11.9F, -1.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 75
		gunModel[72].setRotationPoint(-39F, -7.9F, -1.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 76
		gunModel[73].setRotationPoint(-39F, -1.9F, -1.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F); // Box 77
		gunModel[74].setRotationPoint(-39F, 0.1F, -1.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F, 0F, -0.6F, 0F, 0.3F, -0.6F, 0F, 0.3F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 77
		gunModel[75].setRotationPoint(31.8F, -13.2F, -1.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 78
		gunModel[76].setRotationPoint(-12F, -16.9F, 1F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 79
		gunModel[77].setRotationPoint(-12F, -16.9F, -1F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 80
		gunModel[78].setRotationPoint(-12F, -16.9F, -2F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 81
		gunModel[79].setRotationPoint(-10F, -14.5F, -1F);

		gunModel[80].addShapeBox(0F, -0.01F, 0F, 33, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		gunModel[80].setRotationPoint(-4F, -14.5F, -1F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 83
		gunModel[81].setRotationPoint(-4F, -8.5F, -1F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[82].setRotationPoint(-4F, -9.5F, -1F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		gunModel[83].setRotationPoint(-3F, -7.5F, -1F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 86
		gunModel[84].setRotationPoint(-3F, -6.5F, -1F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 87
		gunModel[85].setRotationPoint(8F, -5.5F, -1F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, -0.3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 88
		gunModel[86].setRotationPoint(-4F, -5.5F, -1F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 1F, 0F, 0F); // Box 89
		gunModel[87].setRotationPoint(-5.3F, -3.5F, -1F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 7, 6, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2.7F, -2F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 2.7F, -2F, 0F); // Box 90
		gunModel[88].setRotationPoint(-6.3F, -1.5F, -1F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, -2F, 0F); // Box 91
		gunModel[89].setRotationPoint(-9F, 2.5F, -1F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		gunModel[90].setRotationPoint(-5.8F, 3.5F, -1F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, -0.2F, -1.3F, -1F, -0.2F, 1F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 93
		gunModel[91].setRotationPoint(-4F, -5.5F, 1F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.2F, -1.3F, 0F, -0.2F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 94
		gunModel[92].setRotationPoint(-5.3F, -3.5F, 1F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -0.2F, -1F, 0F, -0.2F, 2.7F, -2F, 0F, -4.5F, -0.5F, 0F, -5.5F, -0.5F, -0.2F, 1.7F, -2F, -0.2F); // Box 95
		gunModel[93].setRotationPoint(-6.3F, -1.5F, 1F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0.2F, -1.5F, 0F, -0.8F, -1.5F, -0.2F, -1F, 0F, -0.2F, 0F, -2F, 0F, -1.8F, 0F, 0F, -2.8F, -0.5F, -0.2F, -1F, -1.3F, -0.2F); // Box 96
		gunModel[94].setRotationPoint(-9F, 2.5F, 1F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.2F, 1F, -0.5F, -0.2F); // Box 97
		gunModel[95].setRotationPoint(-5.8F, 3.5F, 1F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gunModel[96].setRotationPoint(-10F, -16.9F, -1F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 105
		gunModel[97].setRotationPoint(-10F, -16.9F, 1F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		gunModel[98].setRotationPoint(-10F, -16.9F, -2F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 107
		gunModel[99].setRotationPoint(-10F, -13.5F, 1F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 108
		gunModel[100].setRotationPoint(-6F, -13.5F, 1F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 110
		gunModel[101].setRotationPoint(-10F, -13.5F, -2F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[102].setRotationPoint(-6F, -13.5F, -2F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0.5F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 112
		gunModel[103].setRotationPoint(-10F, -11.5F, -2F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 113
		gunModel[104].setRotationPoint(-8F, -10.5F, -2F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.2F, -0.2F, 0.5F, 0.2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 114
		gunModel[105].setRotationPoint(-10F, -11.5F, 1F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 115
		gunModel[106].setRotationPoint(-4F, -16.8F, -1.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 116
		gunModel[107].setRotationPoint(-4F, -15F, -1.5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		gunModel[108].setRotationPoint(12F, -17F, -2F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 120
		gunModel[109].setRotationPoint(12F, -14.8F, 0F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 121
		gunModel[110].setRotationPoint(17F, -16F, 1F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 122
		gunModel[111].setRotationPoint(24F, -16F, -2F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 123
		gunModel[112].setRotationPoint(-4F, -16F, -1.5F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 125
		gunModel[113].setRotationPoint(12F, -16F, -2F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		gunModel[114].setRotationPoint(12F, -14F, -2F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		gunModel[115].setRotationPoint(12F, -13F, -2F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		gunModel[116].setRotationPoint(12F, -10F, -2F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 129
		gunModel[117].setRotationPoint(12F, -9F, -2F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 130
		gunModel[118].setRotationPoint(23.5F, -9F, -2F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 131
		gunModel[119].setRotationPoint(24.5F, -10.5F, -2F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 132
		gunModel[120].setRotationPoint(23.5F, -10F, -2F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		gunModel[121].setRotationPoint(12F, -13F, 1F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 134
		gunModel[122].setRotationPoint(12F, -10F, 1F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 135
		gunModel[123].setRotationPoint(12F, -9F, 1F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0.2F); // Box 136
		gunModel[124].setRotationPoint(23F, -8F, -1.5F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F); // Box 137
		gunModel[125].setRotationPoint(23F, -6F, -1.5F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 138
		gunModel[126].setRotationPoint(15F, -8F, -1.5F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.3F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, 0.3F, 0.2F); // Box 139
		gunModel[127].setRotationPoint(14F, -8F, -1.5F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, -1F, 0.3F, 0.2F); // Box 140
		gunModel[128].setRotationPoint(12F, -8F, -1.5F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		gunModel[129].setRotationPoint(-4F, -13.5F, -1.9F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.3F, 0F, -1.3F, 0.3F, 0F); // Box 142
		gunModel[130].setRotationPoint(-4F, -8.5F, -2F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		gunModel[131].setRotationPoint(-4F, -10.5F, -2F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		gunModel[132].setRotationPoint(3F, -8.5F, -2F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.7F, 0.2F, -0.3F, -0.5F, 0.2F, -0.3F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 145
		gunModel[133].setRotationPoint(3F, -7.5F, -2F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 146
		gunModel[134].setRotationPoint(-4F, -13.5F, 0.9F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -1.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.3F, -1.5F, 0F, -0.3F); // Box 147
		gunModel[135].setRotationPoint(-4F, -8.5F, 1F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 148
		gunModel[136].setRotationPoint(-4F, -10.5F, 1F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 149
		gunModel[137].setRotationPoint(3F, -8.5F, 1F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.2F, -0.3F, -0.7F, 0.2F, -0.3F); // Box 150
		gunModel[138].setRotationPoint(3F, -7.5F, 1F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F); // Box 153
		gunModel[139].setRotationPoint(7F, -16F, -0.2F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F); // Box 154
		gunModel[140].setRotationPoint(5F, -16F, -0.2F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F); // Box 155
		gunModel[141].setRotationPoint(-1F, -16F, -0.2F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F); // Box 156
		gunModel[142].setRotationPoint(1F, -16F, -0.2F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F); // Box 157
		gunModel[143].setRotationPoint(3F, -16F, -0.2F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F); // Box 158
		gunModel[144].setRotationPoint(-3F, -16F, -0.2F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, -0.6F); // Box 160
		gunModel[145].setRotationPoint(8F, -16F, -0.6F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, -0.6F); // Box 161
		gunModel[146].setRotationPoint(6F, -16F, -0.6F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, -0.6F); // Box 162
		gunModel[147].setRotationPoint(0F, -16F, -0.6F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, -0.6F); // Box 163
		gunModel[148].setRotationPoint(2F, -16F, -0.6F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, -0.6F); // Box 164
		gunModel[149].setRotationPoint(4F, -16F, -0.6F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, -0.6F); // Box 165
		gunModel[150].setRotationPoint(-2F, -16F, -0.6F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, -0.6F, -0.3F, 0.2F, -0.6F); // Box 166
		gunModel[151].setRotationPoint(-4F, -16F, -0.6F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		gunModel[152].setRotationPoint(-4F, -15.8F, -0.5F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 168
		gunModel[153].setRotationPoint(-4F, -16F, -0.5F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 201
		gunModel[154].setRotationPoint(9F, -3.5F, -1F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		gunModel[155].setRotationPoint(4F, -1F, -1F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 203
		gunModel[156].setRotationPoint(2F, -1F, -1F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, -1.2F, 0.5F, 0F, -1.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, 0F, 0F, 0F); // Box 204
		gunModel[157].setRotationPoint(8F, -1F, -1F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.2F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.2F, 0.5F, 0F, -0.2F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, -1.5F, 0F); // Box 205
		gunModel[158].setRotationPoint(4F, -2F, -0.5F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 206
		gunModel[159].setRotationPoint(4F, -4.5F, -0.5F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 207
		gunModel[160].setRotationPoint(4F, -5.5F, -0.5F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 212
		gunModel[161].setRotationPoint(15.5F, -17F, -2F);
		gunModel[161].rotateAngleX = -0.2268928F;

		gunModel[162].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 213
		gunModel[162].setRotationPoint(17F, -17F, -2F);
		gunModel[162].rotateAngleX = -0.2268928F;

		gunModel[163].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 214
		gunModel[163].setRotationPoint(17F, -17.5F, -2.2F);

		gunModel[164].addShapeBox(0F, -1.8F, -0.4F, 7, 2, 1, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 215
		gunModel[164].setRotationPoint(17F, -17.3F, -1.8F);
		gunModel[164].rotateAngleX = -0.36651914F;

		gunModel[165].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 216
		gunModel[165].setRotationPoint(14F, -7.5F, -2F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 217
		gunModel[166].setRotationPoint(13F, -5F, -2F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Box 218
		gunModel[167].setRotationPoint(19F, -7.5F, -2F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Box 219
		gunModel[168].setRotationPoint(17F, -6.5F, -2F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Box 220
		gunModel[169].setRotationPoint(2F, -9F, -2F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Box 221
		gunModel[170].setRotationPoint(3F, -10.2F, -2F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Box 222
		gunModel[171].setRotationPoint(-3F, -10.2F, -2F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Box 223
		gunModel[172].setRotationPoint(6F, -7.8F, -2F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Box 224
		gunModel[173].setRotationPoint(3.5F, -7.8F, -2F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 225
		gunModel[174].setRotationPoint(0F, -8.8F, -2F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -0.2F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Box 226
		gunModel[175].setRotationPoint(8F, -10.2F, -2F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 227
		gunModel[176].setRotationPoint(13F, -10.5F, -2F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F); // Box 228
		gunModel[177].setRotationPoint(-14F, -16.9F, -2F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -1.3F, -1F, -0.2F, -2F, -1F, -0.2F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0.7F, 0F, 0F, 1F, 0F, 0F); // Box 216
		gunModel[178].setRotationPoint(-4F, -5.5F, -2F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, -1.3F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0.5F, 0F, 0F, 1F, 0F, 0F); // Box 217
		gunModel[179].setRotationPoint(-5.3F, -3.5F, -2F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, -1F, 0F, -0.2F, -1.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.7F, -2F, -0.2F, -5.5F, -0.5F, -0.2F, -4.5F, -0.5F, 0F, 2.7F, -2F, 0F); // Box 218
		gunModel[180].setRotationPoint(-6.3F, -1.5F, -2F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, -1F, 0F, -0.2F, -0.8F, -1.5F, -0.2F, 0.2F, -1.5F, 0F, 0F, 0F, 0F, -1F, -1.3F, -0.2F, -2.8F, -0.5F, -0.2F, -1.8F, 0F, 0F, 0F, -2F, 0F); // Box 219
		gunModel[181].setRotationPoint(-9F, 2.5F, -2F);

		gunModel[182].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 1F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		gunModel[182].setRotationPoint(-5.8F, 3.5F, -2F);

		gunModel[183].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 219
		gunModel[183].setRotationPoint(-4F, -17.1F, -0.5F);


		defaultScopeModel = new ModelRendererTurbo[22];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 172
		defaultScopeModel[1] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 176
		defaultScopeModel[2] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 177
		defaultScopeModel[3] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 178
		defaultScopeModel[4] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 180
		defaultScopeModel[5] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 181
		defaultScopeModel[6] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 182
		defaultScopeModel[7] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 186
		defaultScopeModel[8] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 187
		defaultScopeModel[9] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 188
		defaultScopeModel[10] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 189
		defaultScopeModel[11] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 190
		defaultScopeModel[12] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 192
		defaultScopeModel[13] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 193
		defaultScopeModel[14] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 194
		defaultScopeModel[15] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 195
		defaultScopeModel[16] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 196
		defaultScopeModel[17] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 198
		defaultScopeModel[18] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 200
		defaultScopeModel[19] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 216
		defaultScopeModel[20] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 217
		defaultScopeModel[21] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 218

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 172
		defaultScopeModel[0].setRotationPoint(18F, -18.5F, -1.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 176
		defaultScopeModel[1].setRotationPoint(19F, -19F, -1.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 177
		defaultScopeModel[2].setRotationPoint(24F, -19.7F, -1.5F);

		defaultScopeModel[3].addShapeBox(-6F, 0F, 0F, 7, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 178
		defaultScopeModel[3].setRotationPoint(25F, -19.7F, -1F);
		defaultScopeModel[3].rotateAngleZ = -0.06981317F;

		defaultScopeModel[4].addShapeBox(-4F, -0.1F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 180
		defaultScopeModel[4].setRotationPoint(25F, -19.7F, -1F);
		defaultScopeModel[4].rotateAngleZ = -0.06981317F;

		defaultScopeModel[5].addShapeBox(-4F, -0.1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 181
		defaultScopeModel[5].setRotationPoint(25F, -19.7F, 0F);
		defaultScopeModel[5].rotateAngleZ = -0.06981317F;

		defaultScopeModel[6].addShapeBox(-4F, 0F, -0.5F, 1, 1, 1, 0F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 182
		defaultScopeModel[6].setRotationPoint(25F, -19.7F, 0F);
		defaultScopeModel[6].rotateAngleZ = -0.06981317F;

		defaultScopeModel[7].addShapeBox(-6.5F, -0.25F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 186
		defaultScopeModel[7].setRotationPoint(25F, -19.7F, -1F);
		defaultScopeModel[7].rotateAngleZ = -0.06981317F;

		defaultScopeModel[8].addShapeBox(-6.5F, 0F, -0.5F, 1, 1, 1, 0F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 187
		defaultScopeModel[8].setRotationPoint(25F, -19.7F, 0F);
		defaultScopeModel[8].rotateAngleZ = -0.06981317F;

		defaultScopeModel[9].addShapeBox(-6.5F, -0.25F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 188
		defaultScopeModel[9].setRotationPoint(25F, -19.7F, 0F);
		defaultScopeModel[9].rotateAngleZ = -0.06981317F;

		defaultScopeModel[10].addShapeBox(-6.5F, -0.25F, 0F, 1, 1, 1, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F); // Box 189
		defaultScopeModel[10].setRotationPoint(25F, -19.7F, 1.5F);
		defaultScopeModel[10].rotateAngleZ = -0.06981317F;

		defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0.5F, -0.7F, 0F, 0.5F, -0.7F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F); // Box 190
		defaultScopeModel[11].setRotationPoint(70.5F, -20.75F, -1.5F);

		defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0.05F, -0.2F, 0F, 0.05F, -0.2F, 0F, 0.05F, -0.2F, 0F, 0.05F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F); // Box 192
		defaultScopeModel[12].setRotationPoint(70.5F, -19.2F, -1F);

		defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 193
		defaultScopeModel[13].setRotationPoint(69.5F, -14.2F, -1F);

		defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F); // Box 194
		defaultScopeModel[14].setRotationPoint(72.5F, -17.2F, -1F);

		defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -1F, 0.2F, -0.2F, 0.6F, 0.2F, -0.2F, 0.6F, 0.2F, -0.2F, -1F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 195
		defaultScopeModel[15].setRotationPoint(69.5F, -17.2F, -1F);

		defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -0.6F, 0.2F, -0.4F, 0.4F, 0.2F, -0.4F, 0.4F, 0.2F, -0.4F, -0.6F, 0.2F, -0.4F, 0.4F, 0.2F, -0.4F, 0.4F, 0.2F, -0.4F, 0.4F, 0.2F, -0.4F, 0.4F, 0.2F, -0.4F); // Box 196
		defaultScopeModel[16].setRotationPoint(70.5F, -17.2F, -1F);

		defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 198
		defaultScopeModel[17].setRotationPoint(70.5F, -22.25F, -1F);

		defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 200
		defaultScopeModel[18].setRotationPoint(71.5F, -20.65F, -0.5F);

		defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F); // Box 216
		defaultScopeModel[19].setRotationPoint(70.5F, -21.75F, -1.5F);

		defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, -0.7F, 0F, 0.5F, -0.7F); // Box 217
		defaultScopeModel[20].setRotationPoint(70.5F, -20.75F, 0.5F);

		defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F); // Box 218
		defaultScopeModel[21].setRotationPoint(70.5F, -21.75F, 0.5F);


		ammoModel = new ModelRendererTurbo[4];
		ammoModel[0] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 173
		ammoModel[1] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 174
		ammoModel[2] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 175
		ammoModel[3] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 229

		ammoModel[0].addShapeBox(0F, 6F, 0F, 9, 6, 3, 0F, -0.5F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -1.5F, 1F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1.5F, 1F, -0.2F); // Box 173
		ammoModel[0].setRotationPoint(16F, -11F, -1.5F);

		ammoModel[1].addShapeBox(0F, 6F, 0F, 9, 7, 3, 0F, -0.5F, 0F, -0.2F, -2F, 1F, -0.2F, -2F, 1F, -0.2F, -0.5F, 0F, -0.2F, -3F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -3F, 2F, -0.2F); // Box 174
		ammoModel[1].setRotationPoint(17F, -4F, -1.5F);

		ammoModel[2].addShapeBox(0F, 6F, 0F, 9, 7, 3, 0F, -1F, -1F, -0.2F, -2F, 1F, -0.2F, -2F, 1F, -0.2F, -1F, -1F, -0.2F, -4.8F, 3F, -0.2F, 1.5F, 0.5F, -0.2F, 1.5F, 0.5F, -0.2F, -4.8F, 3F, -0.2F); // Box 175
		ammoModel[2].setRotationPoint(19F, 4F, -1.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 9, 6, 3, 0F, -0.5F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 229
		ammoModel[3].setRotationPoint(16F, -11F, -1.5F);


		slideModel = new ModelRendererTurbo[8];
		slideModel[0] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 151
		slideModel[1] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 169
		slideModel[2] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 170
		slideModel[3] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 171
		slideModel[4] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 208
		slideModel[5] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 209
		slideModel[6] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 210
		slideModel[7] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 211

		slideModel[0].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F); // Box 151
		slideModel[0].setRotationPoint(10F, -16F, -1F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		slideModel[1].setRotationPoint(16.5F, -16F, 1F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.23F, -0.5F, 0.2F, 0.2F, -0.5F); // Box 170
		slideModel[2].setRotationPoint(16.5F, -16F, 4F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F); // Box 171
		slideModel[3].setRotationPoint(16.5F, -16F, 4.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 208
		slideModel[4].setRotationPoint(18F, -16F, -1F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 1F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0.3F, 1F, 0F, 0.3F); // Box 209
		slideModel[5].setRotationPoint(20F, -15.5F, -1F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		slideModel[6].setRotationPoint(19F, -15.5F, -1F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.2F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.2F, 0.3F); // Box 211
		slideModel[7].setRotationPoint(17F, -16F, -1F);

		this.modelScale = 0.18F;

		translateAll = new Vector3f(0F, -15.25F, 0.0F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.RIFLE;
	    
		hasFlash = false;
	    
	    leftArmPos = new Vector3f(0.280F, -0.65F, 0.02F);
	    leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.150F, -0.72F, 0.02F);
	    leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);
	    
	    rightArmPos = new Vector3f(0.28F, -0.59F, 0.0F);
	    rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    rightArmReloadPos = new Vector3f(0.27F, -0.59F, 0.04F);
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
		sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
		sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);
		
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