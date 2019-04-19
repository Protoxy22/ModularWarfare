//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.11.2017 - 23:57:31
// Last changed on: 08.11.2017 - 23:57:31

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class mg26t extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public mg26t() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[172];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 18
		gunModel[18] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 19
		gunModel[19] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 20
		gunModel[20] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 22
		gunModel[21] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 23
		gunModel[22] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 24
		gunModel[23] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 25
		gunModel[24] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 26
		gunModel[25] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 27
		gunModel[26] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 28
		gunModel[27] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 29
		gunModel[28] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 30
		gunModel[29] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 31
		gunModel[30] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 32
		gunModel[31] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 33
		gunModel[32] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 34
		gunModel[33] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 35
		gunModel[34] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 36
		gunModel[35] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 37
		gunModel[36] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 38
		gunModel[37] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 39
		gunModel[38] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 40
		gunModel[39] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 41
		gunModel[40] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 42
		gunModel[41] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 43
		gunModel[42] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 44
		gunModel[43] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 45
		gunModel[44] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 46
		gunModel[45] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 47
		gunModel[46] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 48
		gunModel[47] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 49
		gunModel[48] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 50
		gunModel[49] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 51
		gunModel[50] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 52
		gunModel[51] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 53
		gunModel[52] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 54
		gunModel[53] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 55
		gunModel[54] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 56
		gunModel[55] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 57
		gunModel[56] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 58
		gunModel[57] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 59
		gunModel[58] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 60
		gunModel[59] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 61
		gunModel[60] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 62
		gunModel[61] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 63
		gunModel[62] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 64
		gunModel[63] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 65
		gunModel[64] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 66
		gunModel[65] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 67
		gunModel[66] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 68
		gunModel[67] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 69
		gunModel[68] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 70
		gunModel[69] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 71
		gunModel[70] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 72
		gunModel[71] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 73
		gunModel[72] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 74
		gunModel[73] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 75
		gunModel[74] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 76
		gunModel[75] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 77
		gunModel[76] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 78
		gunModel[77] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 79
		gunModel[78] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 80
		gunModel[79] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 81
		gunModel[80] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 82
		gunModel[81] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 83
		gunModel[82] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 84
		gunModel[83] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 85
		gunModel[84] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 86
		gunModel[85] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 87
		gunModel[86] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 88
		gunModel[87] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 89
		gunModel[88] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 90
		gunModel[89] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 91
		gunModel[90] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 92
		gunModel[91] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 93
		gunModel[92] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 94
		gunModel[93] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 95
		gunModel[94] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 96
		gunModel[95] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 97
		gunModel[96] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 98
		gunModel[97] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 100
		gunModel[98] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 101
		gunModel[99] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 102
		gunModel[100] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 103
		gunModel[101] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 105
		gunModel[102] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 113
		gunModel[103] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 114
		gunModel[104] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 115
		gunModel[105] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 116
		gunModel[106] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 117
		gunModel[107] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 118
		gunModel[108] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 119
		gunModel[109] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 120
		gunModel[110] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 121
		gunModel[111] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 122
		gunModel[112] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 123
		gunModel[113] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 124
		gunModel[114] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 125
		gunModel[115] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 126
		gunModel[116] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 127
		gunModel[117] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 128
		gunModel[118] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 129
		gunModel[119] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 130
		gunModel[120] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 131
		gunModel[121] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 132
		gunModel[122] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 133
		gunModel[123] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 134
		gunModel[124] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 135
		gunModel[125] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 136
		gunModel[126] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 137
		gunModel[127] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 138
		gunModel[128] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 139
		gunModel[129] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 140
		gunModel[130] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 141
		gunModel[131] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 142
		gunModel[132] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 143
		gunModel[133] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 144
		gunModel[134] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 145
		gunModel[135] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 146
		gunModel[136] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 147
		gunModel[137] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 148
		gunModel[138] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 149
		gunModel[139] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 150
		gunModel[140] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 151
		gunModel[141] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 24
		gunModel[142] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 25
		gunModel[143] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 26
		gunModel[144] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 27
		gunModel[145] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 28
		gunModel[146] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 29
		gunModel[147] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 65
		gunModel[148] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 66
		gunModel[149] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 67
		gunModel[150] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 68
		gunModel[151] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 69
		gunModel[152] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 70
		gunModel[153] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 71
		gunModel[154] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 72
		gunModel[155] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 73
		gunModel[156] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 74
		gunModel[157] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 75
		gunModel[158] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 177
		gunModel[159] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 178
		gunModel[160] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 179
		gunModel[161] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 180
		gunModel[162] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 185
		gunModel[163] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 186
		gunModel[164] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 187
		gunModel[165] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 188
		gunModel[166] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 206
		gunModel[167] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 207
		gunModel[168] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 208
		gunModel[169] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 209
		gunModel[170] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 210
		gunModel[171] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 189

		gunModel[0].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(18.25F, -6.5F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(22.25F, -6.5F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.1F, 0F); // Box 3
		gunModel[2].setRotationPoint(22.25F, -6.5F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[3].setRotationPoint(4.25F, -6.5F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 5
		gunModel[4].setRotationPoint(6.25F, -8F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, -0.68F, 0F, 0F, -0.68F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.25F, -0.68F, 0F, -0.25F, -0.68F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 6
		gunModel[5].setRotationPoint(5.25F, -10.3F, 0F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 7
		gunModel[6].setRotationPoint(6.25F, -9.55F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 8
		gunModel[7].setRotationPoint(13.25F, -9F, -1F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F); // Box 9
		gunModel[8].setRotationPoint(13.25F, -9.75F, -1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F); // Box 10
		gunModel[9].setRotationPoint(13.25F, -8.25F, -1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 24, 1, 2, 0F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F); // Box 11
		gunModel[10].setRotationPoint(-5.85F, -5.25F, -1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 12
		gunModel[11].setRotationPoint(14.75F, -7.1F, -1F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 13
		gunModel[12].setRotationPoint(14.75F, -8.1F, -1F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 14
		gunModel[13].setRotationPoint(14.75F, -8.1F, -1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.15F, 0.25F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.25F); // Box 15
		gunModel[14].setRotationPoint(18.15F, -5.25F, -1F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.15F, 0.1F); // Box 16
		gunModel[15].setRotationPoint(19.15F, -5.25F, -1F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.19F, 0F, -0.6F, -0.19F, 0F, -0.6F, -0.19F, 0F, -0.4F, -0.19F); // Box 17
		gunModel[16].setRotationPoint(13.25F, -10.3F, -1F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 39, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 18
		gunModel[17].setRotationPoint(18.25F, -8.8F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F); // Box 19
		gunModel[18].setRotationPoint(18.25F, -8.8F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F); // Box 20
		gunModel[19].setRotationPoint(19.25F, -8.8F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.4F, 0.4F, -0.35F, 0.26F, 0.264F, -0.35F, 0.26F, 0.26F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.26F, 0.26F, -0.35F, 0.26F, 0.26F, -0.35F, 0.4F, 0.4F); // Box 22
		gunModel[20].setRotationPoint(20.25F, -8.8F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F); // Box 23
		gunModel[21].setRotationPoint(19.75F, -8.8F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F); // Box 24
		gunModel[22].setRotationPoint(18.75F, -8.8F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F); // Box 25
		gunModel[23].setRotationPoint(17.75F, -8.8F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 26
		gunModel[24].setRotationPoint(21.25F, -8.8F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 27
		gunModel[25].setRotationPoint(20.75F, -8.8F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 28
		gunModel[26].setRotationPoint(21.75F, -8.8F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 29
		gunModel[27].setRotationPoint(22.25F, -8.8F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 30
		gunModel[28].setRotationPoint(23.75F, -8.8F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 31
		gunModel[29].setRotationPoint(24.25F, -8.8F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 32
		gunModel[30].setRotationPoint(23.25F, -8.8F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 33
		gunModel[31].setRotationPoint(22.75F, -8.8F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 34
		gunModel[32].setRotationPoint(25.75F, -8.8F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 35
		gunModel[33].setRotationPoint(26.25F, -8.8F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 36
		gunModel[34].setRotationPoint(25.25F, -8.8F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 37
		gunModel[35].setRotationPoint(24.75F, -8.8F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 38
		gunModel[36].setRotationPoint(31.75F, -8.8F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 39
		gunModel[37].setRotationPoint(32.25F, -8.8F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 40
		gunModel[38].setRotationPoint(31.25F, -8.8F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 41
		gunModel[39].setRotationPoint(30.75F, -8.8F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 42
		gunModel[40].setRotationPoint(30.25F, -8.8F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 43
		gunModel[41].setRotationPoint(29.75F, -8.8F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 44
		gunModel[42].setRotationPoint(29.25F, -8.8F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 45
		gunModel[43].setRotationPoint(28.75F, -8.8F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 46
		gunModel[44].setRotationPoint(28.25F, -8.8F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 47
		gunModel[45].setRotationPoint(27.75F, -8.8F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 48
		gunModel[46].setRotationPoint(27.25F, -8.8F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 49
		gunModel[47].setRotationPoint(26.75F, -8.8F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 50
		gunModel[48].setRotationPoint(37.75F, -8.8F, -0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 51
		gunModel[49].setRotationPoint(38.25F, -8.8F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 52
		gunModel[50].setRotationPoint(37.25F, -8.8F, -0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 53
		gunModel[51].setRotationPoint(36.75F, -8.8F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 54
		gunModel[52].setRotationPoint(36.25F, -8.8F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 55
		gunModel[53].setRotationPoint(35.75F, -8.8F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 56
		gunModel[54].setRotationPoint(35.25F, -8.8F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 57
		gunModel[55].setRotationPoint(34.75F, -8.8F, -0.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 58
		gunModel[56].setRotationPoint(34.25F, -8.8F, -0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 59
		gunModel[57].setRotationPoint(33.75F, -8.8F, -0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 60
		gunModel[58].setRotationPoint(33.25F, -8.8F, -0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 61
		gunModel[59].setRotationPoint(32.75F, -8.8F, -0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 62
		gunModel[60].setRotationPoint(43.75F, -8.8F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 63
		gunModel[61].setRotationPoint(44.25F, -8.8F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 64
		gunModel[62].setRotationPoint(43.25F, -8.8F, -0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 65
		gunModel[63].setRotationPoint(42.75F, -8.8F, -0.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 66
		gunModel[64].setRotationPoint(42.25F, -8.8F, -0.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 67
		gunModel[65].setRotationPoint(41.75F, -8.8F, -0.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 68
		gunModel[66].setRotationPoint(41.25F, -8.8F, -0.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 69
		gunModel[67].setRotationPoint(40.75F, -8.8F, -0.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 70
		gunModel[68].setRotationPoint(40.25F, -8.8F, -0.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 71
		gunModel[69].setRotationPoint(39.75F, -8.8F, -0.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 72
		gunModel[70].setRotationPoint(39.25F, -8.8F, -0.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 73
		gunModel[71].setRotationPoint(38.75F, -8.8F, -0.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 74
		gunModel[72].setRotationPoint(49.75F, -8.8F, -0.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 75
		gunModel[73].setRotationPoint(50.25F, -8.8F, -0.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 76
		gunModel[74].setRotationPoint(49.25F, -8.8F, -0.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 77
		gunModel[75].setRotationPoint(48.75F, -8.8F, -0.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 78
		gunModel[76].setRotationPoint(48.25F, -8.8F, -0.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 79
		gunModel[77].setRotationPoint(47.75F, -8.8F, -0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 80
		gunModel[78].setRotationPoint(47.25F, -8.8F, -0.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 81
		gunModel[79].setRotationPoint(46.75F, -8.8F, -0.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 82
		gunModel[80].setRotationPoint(46.25F, -8.8F, -0.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 83
		gunModel[81].setRotationPoint(45.75F, -8.8F, -0.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 84
		gunModel[82].setRotationPoint(45.25F, -8.8F, -0.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 85
		gunModel[83].setRotationPoint(44.75F, -8.8F, -0.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 86
		gunModel[84].setRotationPoint(51.75F, -8.8F, -0.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 87
		gunModel[85].setRotationPoint(51.25F, -8.8F, -0.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 88
		gunModel[86].setRotationPoint(50.75F, -8.8F, -0.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 89
		gunModel[87].setRotationPoint(53.25F, -8.8F, -0.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 90
		gunModel[88].setRotationPoint(52.75F, -8.8F, -0.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 91
		gunModel[89].setRotationPoint(52.25F, -8.8F, -0.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.45F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.45F, 0.15F); // Box 92
		gunModel[90].setRotationPoint(24.75F, -6.5F, -0.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F, 0F, 0F, -0.11F, 0.5F, 0F, -0.11F, 0.5F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 1F, -0.11F, 0.5F, -0.5F, -0.11F, 0.5F, -0.5F, -0.11F, 0F, 1F, -0.11F); // Box 93
		gunModel[91].setRotationPoint(18.25F, -7.5F, -1F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F, -0.75F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 0F, -0.11F, -0.75F, 0F, -0.11F, -0.75F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 0F, -0.11F, -0.75F, 0F, -0.11F); // Box 94
		gunModel[92].setRotationPoint(14.25F, -7.5F, -1F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F); // Box 95
		gunModel[93].setRotationPoint(25.75F, -7.68F, -0.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 96
		gunModel[94].setRotationPoint(-5.75F, -9F, -1F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0F, -0.1F); // Box 97
		gunModel[95].setRotationPoint(3.25F, -10.55F, 0F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0F, -0.1F); // Box 98
		gunModel[96].setRotationPoint(3.25F, -10.55F, -1F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.68F, 0F, 0F, -0.68F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.68F, 0F, -0.25F, -0.68F); // Box 100
		gunModel[97].setRotationPoint(5.25F, -10.3F, -1F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 101
		gunModel[98].setRotationPoint(5.25F, -10.3F, -0.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.8F, -0.25F, 0F); // Box 102
		gunModel[99].setRotationPoint(11.25F, -10.3F, -0.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 103
		gunModel[100].setRotationPoint(12.25F, -10.3F, -1F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 105
		gunModel[101].setRotationPoint(4.25F, -10.3F, -1F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 113
		gunModel[102].setRotationPoint(50.25F, -6.5F, -0.5F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 114
		gunModel[103].setRotationPoint(50.75F, -6.5F, -0.5F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 115
		gunModel[104].setRotationPoint(51.25F, -6.5F, -0.5F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 116
		gunModel[105].setRotationPoint(51.75F, -6.5F, -0.5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 117
		gunModel[106].setRotationPoint(52.25F, -6.5F, -0.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 118
		gunModel[107].setRotationPoint(52.75F, -6.5F, -0.5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 119
		gunModel[108].setRotationPoint(53.25F, -6.5F, -0.5F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F, -0.35F, 0.25F, 0.25F); // Box 120
		gunModel[109].setRotationPoint(53.75F, -6.5F, -0.5F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.2F, 0.2F); // Box 121
		gunModel[110].setRotationPoint(57.25F, -8.8F, -0.5F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0.1F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.1F, 0.1F); // Box 122
		gunModel[111].setRotationPoint(59.25F, -8.8F, -0.5F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F); // Box 123
		gunModel[112].setRotationPoint(61.25F, -8.8F, -0.5F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 124
		gunModel[113].setRotationPoint(4.25F, -9.55F, -1F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 125
		gunModel[114].setRotationPoint(-2.75F, -2F, -0.5F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0.6F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.6F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 126
		gunModel[115].setRotationPoint(-2.75F, -4F, -0.5F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.1F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.1F, 0F, 0.05F, 0.1F, 0F, 0.05F); // Box 127
		gunModel[116].setRotationPoint(-2.75F, -1F, -0.5F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0.1F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.1F, 0F, 0.05F, 0.1F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 128
		gunModel[117].setRotationPoint(-2.75F, 1F, -0.5F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0.6F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 129
		gunModel[118].setRotationPoint(-2.75F, -4F, 0.25F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 130
		gunModel[119].setRotationPoint(-2.75F, -2F, 0.25F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -1.1F, 0F, -0.3F, -0.9F, 0F, -0.3F); // Box 131
		gunModel[120].setRotationPoint(-2.75F, -1F, 0.25F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -1.1F, 0F, -0.3F, -0.9F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, -1F, -0.3F, -1F, -1F, -0.3F); // Box 132
		gunModel[121].setRotationPoint(-2.75F, 1F, 0.25F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -0.4F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0.6F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 133
		gunModel[122].setRotationPoint(-2.75F, -4F, -1.25F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 134
		gunModel[123].setRotationPoint(-2.75F, -2F, -1.25F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.9F, 0F, -0.3F, -1.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Box 135
		gunModel[124].setRotationPoint(-2.75F, -1F, -1.25F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, -0.9F, 0F, -0.3F, -1.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, -1F, -1F, -0.3F, -1F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 136
		gunModel[125].setRotationPoint(-2.75F, 1F, -1.25F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0.05F, 0.6F, 0F, 0.05F, 0.6F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.5F, 0.05F, 0F, 0.5F, 0.05F, 0F, 0.5F, 0.05F, 0F, 0.5F, 0.05F); // Box 137
		gunModel[126].setRotationPoint(1.25F, -4F, -0.5F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.05F, 0.6F, -0.5F, 0.05F, 0.6F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 138
		gunModel[127].setRotationPoint(1.25F, -3F, -0.5F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, 0.05F, 0.4F, 0F, 0.05F, -0.6F, -0.5F, 0.05F, 0.6F, -0.5F, 0.05F, 0.6F, -0.5F, 0.05F, -0.6F, -0.5F, 0.05F); // Box 139
		gunModel[128].setRotationPoint(1.25F, -1F, -0.5F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 140
		gunModel[129].setRotationPoint(1.25F, -2F, -0.5F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.4F, -0.5F, 0.05F, 0.6F, -0.5F, 0.05F, 0.6F, -0.5F, 0.05F, 0.4F, -0.5F, 0.05F, -0.6F, 0F, 0.05F, -0.4F, 0F, -0.95F, -0.4F, 0F, 0.05F, -0.6F, 0F, 0.05F); // Box 141
		gunModel[130].setRotationPoint(2.25F, -1F, -0.5F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.4F, 0F, 0.05F); // Box 142
		gunModel[131].setRotationPoint(4.25F, -2F, -0.5F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.4F, 0F, 0.05F, 0F, -0.5F, 0.05F, -0.4F, -0.5F, 0.05F, -0.4F, -0.5F, 0.05F, 0F, -0.5F, 0.05F); // Box 143
		gunModel[132].setRotationPoint(4.25F, -1F, -0.5F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.6F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0.6F, -0.5F, 0.05F, -0.4F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.4F, 0F, 0.05F); // Box 144
		gunModel[133].setRotationPoint(4.25F, -3F, -0.5F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F); // Box 145
		gunModel[134].setRotationPoint(2F, -3F, -0.5F);
		gunModel[134].rotateAngleZ = 0.15707963F;

		gunModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 1.32F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 1.32F, -0.2F); // Box 146
		gunModel[135].setRotationPoint(54.75F, -7.68F, -0.5F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		gunModel[136].setRotationPoint(6.25F, -8.75F, -0.15F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		gunModel[137].setRotationPoint(6.25F, -9.75F, -0.15F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 149
		gunModel[138].setRotationPoint(6.25F, -7.75F, -0.15F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 150
		gunModel[139].setRotationPoint(5.35F, -9.05F, 0F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 151
		gunModel[140].setRotationPoint(9.15F, -9.05F, 0F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -1.5F, 0F); // Box 24
		gunModel[141].setRotationPoint(-23.75F, -1F, 0F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F); // Box 25
		gunModel[142].setRotationPoint(-23.75F, -1F, 0F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[143].setRotationPoint(-23.75F, -7F, 0F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[144].setRotationPoint(-12.75F, -7.5F, 0F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 28
		gunModel[145].setRotationPoint(-9.75F, -8.5F, 0F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[146].setRotationPoint(-7.75F, -8.5F, 0F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[147].setRotationPoint(27.25F, -9.25F, -1F);

		gunModel[148].addShapeBox(0.5F, -4.05F, -0.5F, 1, 1, 1, 0F, 0.1F, 0.15F, -0.25F, -0.5F, 0.15F, -0.25F, -0.5F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F); // Box 66
		gunModel[148].setRotationPoint(27.25F, -8.25F, -1F);
		gunModel[148].rotateAngleX = -1.79768913F;

		gunModel[149].addShapeBox(0.5F, -2.75F, -0.5F, 2, 1, 1, 0F, 0.1F, 0.15F, -0.25F, -0.5F, 0.15F, -0.25F, -0.5F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F); // Box 67
		gunModel[149].setRotationPoint(27.25F, -8.25F, -1F);
		gunModel[149].rotateAngleX = -1.79768913F;

		gunModel[150].addShapeBox(-5.5F, -5.5F, -0.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[150].setRotationPoint(27.25F, -8.25F, -1F);
		gunModel[150].rotateAngleX = -1.79768913F;
		gunModel[150].rotateAngleY = -0.36651914F;

		gunModel[151].addShapeBox(-1.5F, -5.5F, -0.5F, 1, 1, 1, 0F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F); // Box 69
		gunModel[151].setRotationPoint(27.25F, -8.25F, -1F);
		gunModel[151].rotateAngleX = -1.79768913F;
		gunModel[151].rotateAngleY = -0.36651914F;

		gunModel[152].addShapeBox(-2F, -5.5F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F); // Box 70
		gunModel[152].setRotationPoint(27.25F, -8.25F, -1F);
		gunModel[152].rotateAngleX = -1.79768913F;
		gunModel[152].rotateAngleY = -0.36651914F;

		gunModel[153].addShapeBox(-1F, -5.5F, -0.5F, 1, 1, 1, 0F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F); // Box 71
		gunModel[153].setRotationPoint(27.25F, -8.25F, -1F);
		gunModel[153].rotateAngleX = -1.79768913F;
		gunModel[153].rotateAngleY = -0.36651914F;

		gunModel[154].addShapeBox(-6F, -5.5F, -0.5F, 1, 1, 1, 0F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F); // Box 72
		gunModel[154].setRotationPoint(27.25F, -8.25F, -1F);
		gunModel[154].rotateAngleX = -1.79768913F;
		gunModel[154].rotateAngleY = -0.36651914F;

		gunModel[155].addShapeBox(-6.5F, -5.5F, -0.5F, 1, 1, 1, 0F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F); // Box 73
		gunModel[155].setRotationPoint(27.25F, -8.25F, -1F);
		gunModel[155].rotateAngleX = -1.79768913F;
		gunModel[155].rotateAngleY = -0.36651914F;

		gunModel[156].addShapeBox(-7F, -5.5F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F); // Box 74
		gunModel[156].setRotationPoint(27.25F, -8.25F, -1F);
		gunModel[156].rotateAngleX = -1.79768913F;
		gunModel[156].rotateAngleY = -0.36651914F;

		gunModel[157].addShapeBox(0.75F, -2.75F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Box 75
		gunModel[157].setRotationPoint(27.25F, -8.25F, -1F);
		gunModel[157].rotateAngleX = -1.79768913F;

		gunModel[158].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -0.5F, 0F); // Box 177
		gunModel[158].setRotationPoint(-23.75F, -1F, -1F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F); // Box 178
		gunModel[159].setRotationPoint(-23.75F, -1F, -1F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		gunModel[160].setRotationPoint(-23.75F, -7F, -1F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 180
		gunModel[161].setRotationPoint(-12.75F, -7.5F, -1F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.5F); // Box 185
		gunModel[162].setRotationPoint(-7.75F, -8.5F, -0.5F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 186
		gunModel[163].setRotationPoint(-9.75F, -8.5F, -1F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 187
		gunModel[164].setRotationPoint(-7.75F, -8.5F, -1F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 188
		gunModel[165].setRotationPoint(-0.850000000000001F, -5.25F, -2.5F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 206
		gunModel[166].setRotationPoint(37.75F, -6.3F, -0.5F);

		gunModel[167].addShapeBox(0F, -0.25F, 0F, 1, 16, 1, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 207
		gunModel[167].setRotationPoint(39.75F, -6F, 0F);
		gunModel[167].rotateAngleX = 0.26179939F;
		gunModel[167].rotateAngleZ = -1.23918377F;

		gunModel[168].addShapeBox(-0.2F, 15.75F, 0F, 2, 1, 1, 0F, 0F, 0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 208
		gunModel[168].setRotationPoint(39.75F, -6F, 0F);
		gunModel[168].rotateAngleX = 0.26179939F;
		gunModel[168].rotateAngleZ = -1.23918377F;

		gunModel[169].addShapeBox(-0.2F, 15.75F, -1F, 2, 1, 1, 0F, 0F, 0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 209
		gunModel[169].setRotationPoint(39.75F, -6F, 0F);
		gunModel[169].rotateAngleX = -0.26179939F;
		gunModel[169].rotateAngleZ = -1.23918377F;

		gunModel[170].addShapeBox(0F, -0.25F, -1F, 1, 16, 1, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 210
		gunModel[170].setRotationPoint(39.75F, -6F, 0F);
		gunModel[170].rotateAngleX = -0.26179939F;
		gunModel[170].rotateAngleZ = -1.23918377F;

		gunModel[171].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.19F, 0F, -0.6F, -0.19F, 0F, -0.6F, -0.19F, 0F, -0.4F, -0.19F); // Box 189
		gunModel[171].setRotationPoint(-23.75F, -6.7F, -1F);
		gunModel[171].rotateAngleZ = 0.13962634F;


		defaultScopeModel = new ModelRendererTurbo[9];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 189
		defaultScopeModel[1] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 190
		defaultScopeModel[2] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 191
		defaultScopeModel[3] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 192
		defaultScopeModel[4] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 195
		defaultScopeModel[5] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 185
		defaultScopeModel[6] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 186
		defaultScopeModel[7] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 187
		defaultScopeModel[8] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 188

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 189
		defaultScopeModel[0].setRotationPoint(54.25F, -10.15F, 1.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 190
		defaultScopeModel[1].setRotationPoint(54.25F, -10.65F, 1.9F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 191
		defaultScopeModel[2].setRotationPoint(54.25F, -10.65F, 0.9F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 192
		defaultScopeModel[3].setRotationPoint(54.25F, -10.65F, 1.4F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.15F, -1.2F, 0F, -0.15F, -1.2F, 0F, -0.7F, 0.2F, 0F, -0.7F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 195
		defaultScopeModel[4].setRotationPoint(54.25F, -10F, 0.1F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 185
		defaultScopeModel[5].setRotationPoint(9F, -10.65F, 0.9F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 186
		defaultScopeModel[6].setRotationPoint(9F, -10.65F, 1.9F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 187
		defaultScopeModel[7].setRotationPoint(9F, -10.15F, 1.5F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.15F, -1.2F, 0F, -0.15F, -1.2F, 0F, -0.7F, 0.2F, 0F, -0.7F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 188
		defaultScopeModel[8].setRotationPoint(9F, -10F, 0.1F);


		ammoModel = new ModelRendererTurbo[6];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 104
		ammoModel[1] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 106
		ammoModel[2] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 107
		ammoModel[3] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 108
		ammoModel[4] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 110
		ammoModel[5] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 112

		ammoModel[0].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F, -0.2F, 1.5F, -0.05F, -0.2F, 0.25F, -0.05F, -0.2F, 0.25F, -0.05F, -0.2F, 1.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 104
		ammoModel[0].setRotationPoint(5.25F, -18.55F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F, -0.3F, 0.25F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0.25F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 106
		ammoModel[1].setRotationPoint(6.25F, -19.55F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F, -0.3F, -0.3F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 107
		ammoModel[2].setRotationPoint(9.25F, -19.55F, -0.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, -0.3F, 0F, 0.1F, -0.5F, -0.75F, 0.1F, -0.5F, -0.75F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 108
		ammoModel[3].setRotationPoint(7.65F, -19.55F, -0.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, -0.5F, -0.8F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.5F, -0.8F, 0.1F, -0.5F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.5F, 0F, 0.1F); // Box 110
		ammoModel[4].setRotationPoint(8.85F, -19.55F, -0.5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, -0.5F, 0F, 0.1F, -0.3F, 0.25F, 0.1F, -0.3F, 0.25F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.5F, 0F, 0.1F); // Box 112
		ammoModel[5].setRotationPoint(5.85F, -19.55F, -0.5F);

	
		this.modelScale = 0.4F;

		translateAimPosition = new Vector3f(0F, 0F, -0.05F);
		
		translateAll = new Vector3f(0F, -6F, 0F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.TOP_RIFLE;
	    
		hasFlash = false;
	    
	    leftArmPos = new Vector3f(0.2F, -0.5F, 0.02F);
	    leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.10F, -0.52F, 0.02F);
	    leftArmReloadRot = new Vector3f(65.0F, 12.0F, -55.0F);
	    
	    rightArmPos = new Vector3f(0.28F, -0.76F, 0.0F);
	    rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    rightArmReloadPos = new Vector3f(0.5F, -0.45F, 0.07F);
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