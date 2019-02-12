//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Navid
// Model Creator: 
// Created on: 19.02.2017 - 01:42:21
// Last changed on: 19.02.2017 - 01:42:21

package com.modularwarfare.client.model.mwp; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class navid extends ModelGun //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public navid() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[439];
		defaultGripModel = new ModelRendererTurbo[60];
		ammoModel = new ModelRendererTurbo[217];
		breakActionModel = new ModelRendererTurbo[116];

		initgunModel_1();
		initdefaultGripModel_1();
		initammoModel_1();
		initbreakActionModel_1();

		thirdPersonOffset = new Vector3f(1 /16F, -1F /16F, 0F /16F);
		translateAll = new Vector3f(170F, 100F, -0.25F);

		gunSlideDistance = 4.25F;


		//animationType = EnumAnimationType.CUSTOM;


		//tiltGunTime = 0.1F;


		//unloadClipTime = 0.4F;


		//loadClipTime = 0.4F;


		//untiltGunTime = 0.1F;


		//barrelBreakPoint = new Vector3f(163 /16F, 131F /16F, 0F /16F);


		//breakAngle = 110F;


		rotateGunVertical = 1F;


		rotateGunHorizontal = 1F;


		tiltGun = 1F;


		translateGun = new Vector3f(1 /16F, 1F /16F, 1F /16F);


		rotateClipVertical = 1F;


		rotateClipHorizontal = 1F;


		tiltClip = -61F;


		translateClip = new Vector3f(1 /16F, -200F /16F, -200F /16F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 68
		gunModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 71
		gunModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 72
		gunModel[3] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 73
		gunModel[4] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 74
		gunModel[5] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 75
		gunModel[6] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 76
		gunModel[7] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 77
		gunModel[8] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 78
		gunModel[9] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 79
		gunModel[10] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 80
		gunModel[11] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 82
		gunModel[12] = new ModelRendererTurbo(this, 1049, 1, textureX, textureY); // Box 74
		gunModel[13] = new ModelRendererTurbo(this, 1081, 1, textureX, textureY); // Box 75
		gunModel[14] = new ModelRendererTurbo(this, 1121, 1, textureX, textureY); // Box 8
		gunModel[15] = new ModelRendererTurbo(this, 1169, 1, textureX, textureY); // Box 9
		gunModel[16] = new ModelRendererTurbo(this, 1225, 1, textureX, textureY); // Box 10
		gunModel[17] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 11
		gunModel[18] = new ModelRendererTurbo(this, 1329, 1, textureX, textureY); // Box 12
		gunModel[19] = new ModelRendererTurbo(this, 1377, 1, textureX, textureY); // Box 13
		gunModel[20] = new ModelRendererTurbo(this, 1433, 1, textureX, textureY); // Box 14
		gunModel[21] = new ModelRendererTurbo(this, 1489, 1, textureX, textureY); // Box 15
		gunModel[22] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Box 86
		gunModel[23] = new ModelRendererTurbo(this, 1569, 1, textureX, textureY); // Box 87
		gunModel[24] = new ModelRendererTurbo(this, 1609, 1, textureX, textureY); // Box 88
		gunModel[25] = new ModelRendererTurbo(this, 1649, 1, textureX, textureY); // Box 89
		gunModel[26] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Box 90
		gunModel[27] = new ModelRendererTurbo(this, 1721, 1, textureX, textureY); // Box 91
		gunModel[28] = new ModelRendererTurbo(this, 1753, 1, textureX, textureY); // Box 92
		gunModel[29] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 110
		gunModel[30] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Box 112
		gunModel[31] = new ModelRendererTurbo(this, 1961, 1, textureX, textureY); // Box 114
		gunModel[32] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 115
		gunModel[33] = new ModelRendererTurbo(this, 673, 25, textureX, textureY); // Box 116
		gunModel[34] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Box 117
		gunModel[35] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Box 119
		gunModel[36] = new ModelRendererTurbo(this, 1121, 25, textureX, textureY); // Box 121
		gunModel[37] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 190
		gunModel[38] = new ModelRendererTurbo(this, 1281, 33, textureX, textureY); // Box 191
		gunModel[39] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 192
		gunModel[40] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 193
		gunModel[41] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 194
		gunModel[42] = new ModelRendererTurbo(this, 545, 297, textureX, textureY); // Box 195
		gunModel[43] = new ModelRendererTurbo(this, 1105, 305, textureX, textureY); // Box 196
		gunModel[44] = new ModelRendererTurbo(this, 825, 313, textureX, textureY); // Box 197
		gunModel[45] = new ModelRendererTurbo(this, 825, 25, textureX, textureY); // Box 193
		gunModel[46] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Box 194
		gunModel[47] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 195
		gunModel[48] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 196
		gunModel[49] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 197
		gunModel[50] = new ModelRendererTurbo(this, 1561, 33, textureX, textureY); // Box 198
		gunModel[51] = new ModelRendererTurbo(this, 1617, 33, textureX, textureY); // Box 199
		gunModel[52] = new ModelRendererTurbo(this, 1673, 33, textureX, textureY); // Box 200
		gunModel[53] = new ModelRendererTurbo(this, 1761, 33, textureX, textureY); // Box 151
		gunModel[54] = new ModelRendererTurbo(this, 1825, 33, textureX, textureY); // Box 152
		gunModel[55] = new ModelRendererTurbo(this, 1889, 33, textureX, textureY); // Box 153
		gunModel[56] = new ModelRendererTurbo(this, 1105, 41, textureX, textureY); // Box 154
		gunModel[57] = new ModelRendererTurbo(this, 1225, 41, textureX, textureY); // Box 155
		gunModel[58] = new ModelRendererTurbo(this, 1273, 41, textureX, textureY); // Box 156
		gunModel[59] = new ModelRendererTurbo(this, 1321, 41, textureX, textureY); // Box 157
		gunModel[60] = new ModelRendererTurbo(this, 1369, 41, textureX, textureY); // Box 158
		gunModel[61] = new ModelRendererTurbo(this, 1417, 41, textureX, textureY); // Box 159
		gunModel[62] = new ModelRendererTurbo(this, 1465, 41, textureX, textureY); // Box 160
		gunModel[63] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 161
		gunModel[64] = new ModelRendererTurbo(this, 961, 49, textureX, textureY); // Box 162
		gunModel[65] = new ModelRendererTurbo(this, 1705, 49, textureX, textureY); // Box 163
		gunModel[66] = new ModelRendererTurbo(this, 1993, 49, textureX, textureY); // Box 164
		gunModel[67] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 165
		gunModel[68] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 166
		gunModel[69] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 167
		gunModel[70] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 168
		gunModel[71] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 169
		gunModel[72] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 170
		gunModel[73] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 171
		gunModel[74] = new ModelRendererTurbo(this, 625, 57, textureX, textureY); // Box 172
		gunModel[75] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 173
		gunModel[76] = new ModelRendererTurbo(this, 1561, 57, textureX, textureY); // Box 174
		gunModel[77] = new ModelRendererTurbo(this, 1641, 65, textureX, textureY); // Box 175
		gunModel[78] = new ModelRendererTurbo(this, 1105, 73, textureX, textureY); // Box 176
		gunModel[79] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 177
		gunModel[80] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 178
		gunModel[81] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Box 179
		gunModel[82] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Box 180
		gunModel[83] = new ModelRendererTurbo(this, 1737, 65, textureX, textureY); // Box 181
		gunModel[84] = new ModelRendererTurbo(this, 1785, 65, textureX, textureY); // Box 182
		gunModel[85] = new ModelRendererTurbo(this, 1833, 65, textureX, textureY); // Box 183
		gunModel[86] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Box 184
		gunModel[87] = new ModelRendererTurbo(this, 1945, 81, textureX, textureY); // Box 185
		gunModel[88] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Box 186
		gunModel[89] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 187
		gunModel[90] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 80
		gunModel[91] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 81
		gunModel[92] = new ModelRendererTurbo(this, 1041, 81, textureX, textureY); // Box 82
		gunModel[93] = new ModelRendererTurbo(this, 1705, 81, textureX, textureY); // Box 83
		gunModel[94] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 84
		gunModel[95] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 85
		gunModel[96] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 86
		gunModel[97] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 87
		gunModel[98] = new ModelRendererTurbo(this, 1105, 89, textureX, textureY); // Box 227
		gunModel[99] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 97
		gunModel[100] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 98
		gunModel[101] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 247
		gunModel[102] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 248
		gunModel[103] = new ModelRendererTurbo(this, 601, 89, textureX, textureY); // Box 249
		gunModel[104] = new ModelRendererTurbo(this, 1289, 89, textureX, textureY); // Box 250
		gunModel[105] = new ModelRendererTurbo(this, 1345, 89, textureX, textureY); // Box 251
		gunModel[106] = new ModelRendererTurbo(this, 1401, 89, textureX, textureY); // Box 252
		gunModel[107] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Box 253
		gunModel[108] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 254
		gunModel[109] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Box 255
		gunModel[110] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Box 256
		gunModel[111] = new ModelRendererTurbo(this, 1457, 89, textureX, textureY); // Box 257
		gunModel[112] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 259
		gunModel[113] = new ModelRendererTurbo(this, 1785, 97, textureX, textureY); // Box 261
		gunModel[114] = new ModelRendererTurbo(this, 1841, 97, textureX, textureY); // Box 263
		gunModel[115] = new ModelRendererTurbo(this, 1897, 105, textureX, textureY); // Box 264
		gunModel[116] = new ModelRendererTurbo(this, 1497, 89, textureX, textureY); // Box 277
		gunModel[117] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 278
		gunModel[118] = new ModelRendererTurbo(this, 665, 97, textureX, textureY); // Box 279
		gunModel[119] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 280
		gunModel[120] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 281
		gunModel[121] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Box 282
		gunModel[122] = new ModelRendererTurbo(this, 1041, 105, textureX, textureY); // Box 283
		gunModel[123] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 284
		gunModel[124] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 285
		gunModel[125] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 286
		gunModel[126] = new ModelRendererTurbo(this, 1385, 305, textureX, textureY); // Box 287
		gunModel[127] = new ModelRendererTurbo(this, 1385, 329, textureX, textureY); // Box 288
		gunModel[128] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 289
		gunModel[129] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 290
		gunModel[130] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Box 291
		gunModel[131] = new ModelRendererTurbo(this, 1105, 113, textureX, textureY); // Box 292
		gunModel[132] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 293
		gunModel[133] = new ModelRendererTurbo(this, 1105, 153, textureX, textureY); // Box 295
		gunModel[134] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 296
		gunModel[135] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 297
		gunModel[136] = new ModelRendererTurbo(this, 1737, 33, textureX, textureY); // Box 298
		gunModel[137] = new ModelRendererTurbo(this, 2025, 33, textureX, textureY); // Box 299
		gunModel[138] = new ModelRendererTurbo(this, 665, 121, textureX, textureY); // Box 192
		gunModel[139] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 193
		gunModel[140] = new ModelRendererTurbo(this, 1297, 153, textureX, textureY); // Box 194
		gunModel[141] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 195
		gunModel[142] = new ModelRendererTurbo(this, 1849, 161, textureX, textureY); // Box 196
		gunModel[143] = new ModelRendererTurbo(this, 1105, 177, textureX, textureY); // Box 197
		gunModel[144] = new ModelRendererTurbo(this, 1561, 177, textureX, textureY); // Box 198
		gunModel[145] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 199
		gunModel[146] = new ModelRendererTurbo(this, 545, 185, textureX, textureY); // Box 200
		gunModel[147] = new ModelRendererTurbo(this, 1721, 201, textureX, textureY); // Box 201
		gunModel[148] = new ModelRendererTurbo(this, 825, 209, textureX, textureY); // Box 202
		gunModel[149] = new ModelRendererTurbo(this, 1273, 209, textureX, textureY); // Box 203
		gunModel[150] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 204
		gunModel[151] = new ModelRendererTurbo(this, 1105, 217, textureX, textureY); // Box 205
		gunModel[152] = new ModelRendererTurbo(this, 1561, 217, textureX, textureY); // Box 206
		gunModel[153] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Box 207
		gunModel[154] = new ModelRendererTurbo(this, 1385, 369, textureX, textureY); // Box 209
		gunModel[155] = new ModelRendererTurbo(this, 1441, 113, textureX, textureY); // Box 210
		gunModel[156] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Box 211
		gunModel[157] = new ModelRendererTurbo(this, 705, 193, textureX, textureY); // Box 212
		gunModel[158] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 213
		gunModel[159] = new ModelRendererTurbo(this, 985, 177, textureX, textureY); // Box 214
		gunModel[160] = new ModelRendererTurbo(this, 825, 129, textureX, textureY); // Box 215
		gunModel[161] = new ModelRendererTurbo(this, 1929, 201, textureX, textureY); // Box 216
		gunModel[162] = new ModelRendererTurbo(this, 545, 225, textureX, textureY); // Box 217
		gunModel[163] = new ModelRendererTurbo(this, 633, 241, textureX, textureY); // Box 218
		gunModel[164] = new ModelRendererTurbo(this, 1721, 241, textureX, textureY); // Box 219
		gunModel[165] = new ModelRendererTurbo(this, 1265, 249, textureX, textureY); // Box 220
		gunModel[166] = new ModelRendererTurbo(this, 1433, 217, textureX, textureY); // Box 221
		gunModel[167] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 222
		gunModel[168] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Box 223
		gunModel[169] = new ModelRendererTurbo(this, 545, 297, textureX, textureY); // Box 258
		gunModel[170] = new ModelRendererTurbo(this, 1361, 257, textureX, textureY); // Box 259
		gunModel[171] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 260
		gunModel[172] = new ModelRendererTurbo(this, 617, 113, textureX, textureY); // Box 274
		gunModel[173] = new ModelRendererTurbo(this, 633, 113, textureX, textureY); // Box 275
		gunModel[174] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Box 276
		gunModel[175] = new ModelRendererTurbo(this, 1105, 113, textureX, textureY); // Box 277
		gunModel[176] = new ModelRendererTurbo(this, 1121, 113, textureX, textureY); // Box 278
		gunModel[177] = new ModelRendererTurbo(this, 1457, 113, textureX, textureY); // Box 279
		gunModel[178] = new ModelRendererTurbo(this, 1481, 113, textureX, textureY); // Box 280
		gunModel[179] = new ModelRendererTurbo(this, 1497, 113, textureX, textureY); // Box 283
		gunModel[180] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 284
		gunModel[181] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 285
		gunModel[182] = new ModelRendererTurbo(this, 665, 121, textureX, textureY); // Box 286
		gunModel[183] = new ModelRendererTurbo(this, 681, 121, textureX, textureY); // Box 287
		gunModel[184] = new ModelRendererTurbo(this, 825, 121, textureX, textureY); // Box 288
		gunModel[185] = new ModelRendererTurbo(this, 825, 313, textureX, textureY); // Box 289
		gunModel[186] = new ModelRendererTurbo(this, 841, 121, textureX, textureY); // Box 290
		gunModel[187] = new ModelRendererTurbo(this, 897, 121, textureX, textureY); // Box 291
		gunModel[188] = new ModelRendererTurbo(this, 913, 121, textureX, textureY); // Box 292
		gunModel[189] = new ModelRendererTurbo(this, 929, 121, textureX, textureY); // Box 293
		gunModel[190] = new ModelRendererTurbo(this, 1001, 121, textureX, textureY); // Box 294
		gunModel[191] = new ModelRendererTurbo(this, 1017, 121, textureX, textureY); // Box 295
		gunModel[192] = new ModelRendererTurbo(this, 2025, 121, textureX, textureY); // Box 296
		gunModel[193] = new ModelRendererTurbo(this, 873, 129, textureX, textureY); // Box 297
		gunModel[194] = new ModelRendererTurbo(this, 1033, 129, textureX, textureY); // Box 298
		gunModel[195] = new ModelRendererTurbo(this, 1049, 129, textureX, textureY); // Box 299
		gunModel[196] = new ModelRendererTurbo(this, 1065, 129, textureX, textureY); // Box 300
		gunModel[197] = new ModelRendererTurbo(this, 1417, 129, textureX, textureY); // Box 301
		gunModel[198] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 302
		gunModel[199] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 303
		gunModel[200] = new ModelRendererTurbo(this, 1561, 257, textureX, textureY); // Box 304
		gunModel[201] = new ModelRendererTurbo(this, 1097, 313, textureX, textureY); // Box 305
		gunModel[202] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Box 308
		gunModel[203] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 310
		gunModel[204] = new ModelRendererTurbo(this, 545, 153, textureX, textureY); // Box 311
		gunModel[205] = new ModelRendererTurbo(this, 1017, 153, textureX, textureY); // Box 312
		gunModel[206] = new ModelRendererTurbo(this, 1497, 153, textureX, textureY); // Box 313
		gunModel[207] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 316
		gunModel[208] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 317
		gunModel[209] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 318
		gunModel[210] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 319
		gunModel[211] = new ModelRendererTurbo(this, 1473, 169, textureX, textureY); // Box 320
		gunModel[212] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Box 321
		gunModel[213] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 325
		gunModel[214] = new ModelRendererTurbo(this, 1385, 433, textureX, textureY); // Box 326
		gunModel[215] = new ModelRendererTurbo(this, 1, 441, textureX, textureY); // Box 327
		gunModel[216] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 328
		gunModel[217] = new ModelRendererTurbo(this, 2017, 153, textureX, textureY); // Box 330
		gunModel[218] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 332
		gunModel[219] = new ModelRendererTurbo(this, 865, 177, textureX, textureY); // Box 334
		gunModel[220] = new ModelRendererTurbo(this, 1593, 1, textureX, textureY); // Box 336
		gunModel[221] = new ModelRendererTurbo(this, 1633, 1, textureX, textureY); // Box 338
		gunModel[222] = new ModelRendererTurbo(this, 1801, 1, textureX, textureY); // Box 340
		gunModel[223] = new ModelRendererTurbo(this, 1657, 369, textureX, textureY); // Box 341
		gunModel[224] = new ModelRendererTurbo(this, 585, 169, textureX, textureY); // Box 342
		gunModel[225] = new ModelRendererTurbo(this, 705, 185, textureX, textureY); // Box 343
		gunModel[226] = new ModelRendererTurbo(this, 1721, 185, textureX, textureY); // Box 344
		gunModel[227] = new ModelRendererTurbo(this, 985, 225, textureX, textureY); // Box 345
		gunModel[228] = new ModelRendererTurbo(this, 1433, 209, textureX, textureY); // Box 346
		gunModel[229] = new ModelRendererTurbo(this, 1841, 241, textureX, textureY); // Box 347
		gunModel[230] = new ModelRendererTurbo(this, 977, 249, textureX, textureY); // Box 348
		gunModel[231] = new ModelRendererTurbo(this, 1681, 385, textureX, textureY); // Box 349
		gunModel[232] = new ModelRendererTurbo(this, 1385, 441, textureX, textureY); // Box 358
		gunModel[233] = new ModelRendererTurbo(this, 993, 313, textureX, textureY); // Box 359
		gunModel[234] = new ModelRendererTurbo(this, 1, 449, textureX, textureY); // Box 360
		gunModel[235] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Box 362
		gunModel[236] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 363
		gunModel[237] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 364
		gunModel[238] = new ModelRendererTurbo(this, 1105, 177, textureX, textureY); // Box 365
		gunModel[239] = new ModelRendererTurbo(this, 1561, 177, textureX, textureY); // Box 366
		gunModel[240] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 367
		gunModel[241] = new ModelRendererTurbo(this, 545, 185, textureX, textureY); // Box 368
		gunModel[242] = new ModelRendererTurbo(this, 1993, 201, textureX, textureY); // Box 369
		gunModel[243] = new ModelRendererTurbo(this, 385, 449, textureX, textureY); // Box 370
		gunModel[244] = new ModelRendererTurbo(this, 1225, 313, textureX, textureY); // Box 373
		gunModel[245] = new ModelRendererTurbo(this, 825, 337, textureX, textureY); // Box 374
		gunModel[246] = new ModelRendererTurbo(this, 1105, 281, textureX, textureY); // Box 375
		gunModel[247] = new ModelRendererTurbo(this, 609, 361, textureX, textureY); // Box 376
		gunModel[248] = new ModelRendererTurbo(this, 1097, 353, textureX, textureY); // Box 379
		gunModel[249] = new ModelRendererTurbo(this, 1945, 321, textureX, textureY); // Box 399
		gunModel[250] = new ModelRendererTurbo(this, 177, 281, textureX, textureY); // Box 400
		gunModel[251] = new ModelRendererTurbo(this, 1, 497, textureX, textureY); // Box 401
		gunModel[252] = new ModelRendererTurbo(this, 1, 521, textureX, textureY); // Box 402
		gunModel[253] = new ModelRendererTurbo(this, 1, 569, textureX, textureY); // Box 403
		gunModel[254] = new ModelRendererTurbo(this, 785, 585, textureX, textureY); // Box 404
		gunModel[255] = new ModelRendererTurbo(this, 1, 601, textureX, textureY); // Box 405
		gunModel[256] = new ModelRendererTurbo(this, 793, 609, textureX, textureY); // Box 406
		gunModel[257] = new ModelRendererTurbo(this, 1, 625, textureX, textureY); // Box 407
		gunModel[258] = new ModelRendererTurbo(this, 793, 633, textureX, textureY); // Box 408
		gunModel[259] = new ModelRendererTurbo(this, 1265, 217, textureX, textureY); // Box 409
		gunModel[260] = new ModelRendererTurbo(this, 489, 281, textureX, textureY); // Box 410
		gunModel[261] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 411
		gunModel[262] = new ModelRendererTurbo(this, 1273, 313, textureX, textureY); // Box 412
		gunModel[263] = new ModelRendererTurbo(this, 1273, 417, textureX, textureY); // Box 429
		gunModel[264] = new ModelRendererTurbo(this, 713, 441, textureX, textureY); // Box 430
		gunModel[265] = new ModelRendererTurbo(this, 777, 193, textureX, textureY); // Box 432
		gunModel[266] = new ModelRendererTurbo(this, 1905, 457, textureX, textureY); // Box 366
		gunModel[267] = new ModelRendererTurbo(this, 1385, 465, textureX, textureY); // Box 367
		gunModel[268] = new ModelRendererTurbo(this, 1289, 457, textureX, textureY); // Box 368
		gunModel[269] = new ModelRendererTurbo(this, 1017, 449, textureX, textureY); // Box 369
		gunModel[270] = new ModelRendererTurbo(this, 449, 465, textureX, textureY); // Box 370
		gunModel[271] = new ModelRendererTurbo(this, 521, 465, textureX, textureY); // Box 371
		gunModel[272] = new ModelRendererTurbo(this, 593, 465, textureX, textureY); // Box 372
		gunModel[273] = new ModelRendererTurbo(this, 1489, 465, textureX, textureY); // Box 373
		gunModel[274] = new ModelRendererTurbo(this, 1561, 465, textureX, textureY); // Box 374
		gunModel[275] = new ModelRendererTurbo(this, 1633, 465, textureX, textureY); // Box 375
		gunModel[276] = new ModelRendererTurbo(this, 825, 473, textureX, textureY); // Box 376
		gunModel[277] = new ModelRendererTurbo(this, 1769, 465, textureX, textureY); // Box 377
		gunModel[278] = new ModelRendererTurbo(this, 1097, 473, textureX, textureY); // Box 378
		gunModel[279] = new ModelRendererTurbo(this, 1305, 353, textureX, textureY); // Box 379
		gunModel[280] = new ModelRendererTurbo(this, 1169, 473, textureX, textureY); // Box 380
		gunModel[281] = new ModelRendererTurbo(this, 1977, 345, textureX, textureY); // Box 381
		gunModel[282] = new ModelRendererTurbo(this, 945, 473, textureX, textureY); // Box 382
		gunModel[283] = new ModelRendererTurbo(this, 1857, 489, textureX, textureY); // Box 383
		gunModel[284] = new ModelRendererTurbo(this, 1945, 489, textureX, textureY); // Box 384
		gunModel[285] = new ModelRendererTurbo(this, 753, 417, textureX, textureY); // Box 385
		gunModel[286] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 386
		gunModel[287] = new ModelRendererTurbo(this, 1441, 169, textureX, textureY); // Box 387
		gunModel[288] = new ModelRendererTurbo(this, 633, 225, textureX, textureY); // Box 388
		gunModel[289] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 389
		gunModel[290] = new ModelRendererTurbo(this, 545, 265, textureX, textureY); // Box 390
		gunModel[291] = new ModelRendererTurbo(this, 969, 265, textureX, textureY); // Box 391
		gunModel[292] = new ModelRendererTurbo(this, 169, 329, textureX, textureY); // Box 392
		gunModel[293] = new ModelRendererTurbo(this, 1097, 337, textureX, textureY); // Box 393
		gunModel[294] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 436
		gunModel[295] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 437
		gunModel[296] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 439
		gunModel[297] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 440
		gunModel[298] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 441
		gunModel[299] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 442
		gunModel[300] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 443
		gunModel[301] = new ModelRendererTurbo(this, 1041, 1, textureX, textureY); // Box 444
		gunModel[302] = new ModelRendererTurbo(this, 1617, 553, textureX, textureY); // Box 454
		gunModel[303] = new ModelRendererTurbo(this, 1945, 529, textureX, textureY); // Box 455
		gunModel[304] = new ModelRendererTurbo(this, 1729, 553, textureX, textureY); // Box 456
		gunModel[305] = new ModelRendererTurbo(this, 1809, 553, textureX, textureY); // Box 457
		gunModel[306] = new ModelRendererTurbo(this, 321, 481, textureX, textureY); // Box 476
		gunModel[307] = new ModelRendererTurbo(this, 1753, 513, textureX, textureY); // Box 477
		gunModel[308] = new ModelRendererTurbo(this, 1849, 513, textureX, textureY); // Box 478
		gunModel[309] = new ModelRendererTurbo(this, 1137, 545, textureX, textureY); // Box 479
		gunModel[310] = new ModelRendererTurbo(this, 1233, 545, textureX, textureY); // Box 480
		gunModel[311] = new ModelRendererTurbo(this, 1729, 593, textureX, textureY); // Box 481
		gunModel[312] = new ModelRendererTurbo(this, 1825, 593, textureX, textureY); // Box 482
		gunModel[313] = new ModelRendererTurbo(this, 1577, 601, textureX, textureY); // Box 483
		gunModel[314] = new ModelRendererTurbo(this, 1633, 97, textureX, textureY); // Box 24
		gunModel[315] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box 25
		gunModel[316] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Box 26
		gunModel[317] = new ModelRendererTurbo(this, 825, 201, textureX, textureY); // Box 27
		gunModel[318] = new ModelRendererTurbo(this, 1361, 249, textureX, textureY); // Box 28
		gunModel[319] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Box 29
		gunModel[320] = new ModelRendererTurbo(this, 601, 265, textureX, textureY); // Box 30
		gunModel[321] = new ModelRendererTurbo(this, 1721, 281, textureX, textureY); // Box 31
		gunModel[322] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 474
		gunModel[323] = new ModelRendererTurbo(this, 73, 305, textureX, textureY); // Box 475
		gunModel[324] = new ModelRendererTurbo(this, 545, 321, textureX, textureY); // Box 476
		gunModel[325] = new ModelRendererTurbo(this, 617, 321, textureX, textureY); // Box 477
		gunModel[326] = new ModelRendererTurbo(this, 1177, 337, textureX, textureY); // Box 478
		gunModel[327] = new ModelRendererTurbo(this, 1953, 401, textureX, textureY); // Box 479
		gunModel[328] = new ModelRendererTurbo(this, 1009, 433, textureX, textureY); // Box 480
		gunModel[329] = new ModelRendererTurbo(this, 1009, 441, textureX, textureY); // Box 481
		gunModel[330] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 482
		gunModel[331] = new ModelRendererTurbo(this, 1505, 217, textureX, textureY); // Box 483
		gunModel[332] = new ModelRendererTurbo(this, 777, 241, textureX, textureY); // Box 484
		gunModel[333] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Box 485
		gunModel[334] = new ModelRendererTurbo(this, 1993, 537, textureX, textureY); // Box 486
		gunModel[335] = new ModelRendererTurbo(this, 481, 545, textureX, textureY); // Box 487
		gunModel[336] = new ModelRendererTurbo(this, 1705, 553, textureX, textureY); // Box 488
		gunModel[337] = new ModelRendererTurbo(this, 825, 209, textureX, textureY); // Box 489
		gunModel[338] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 490
		gunModel[339] = new ModelRendererTurbo(this, 1105, 217, textureX, textureY); // Box 491
		gunModel[340] = new ModelRendererTurbo(this, 1777, 553, textureX, textureY); // Box 492
		gunModel[341] = new ModelRendererTurbo(this, 1857, 553, textureX, textureY); // Box 493
		gunModel[342] = new ModelRendererTurbo(this, 1673, 609, textureX, textureY); // Box 494
		gunModel[343] = new ModelRendererTurbo(this, 1273, 177, textureX, textureY); // Box 495
		gunModel[344] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 496
		gunModel[345] = new ModelRendererTurbo(this, 1209, 1, textureX, textureY); // Box 497
		gunModel[346] = new ModelRendererTurbo(this, 2025, 1, textureX, textureY); // Box 498
		gunModel[347] = new ModelRendererTurbo(this, 961, 25, textureX, textureY); // Box 499
		gunModel[348] = new ModelRendererTurbo(this, 1417, 1, textureX, textureY); // Box 500
		gunModel[349] = new ModelRendererTurbo(this, 1705, 1, textureX, textureY); // Box 501
		gunModel[350] = new ModelRendererTurbo(this, 1601, 33, textureX, textureY); // Box 502
		gunModel[351] = new ModelRendererTurbo(this, 1657, 33, textureX, textureY); // Box 503
		gunModel[352] = new ModelRendererTurbo(this, 1873, 1, textureX, textureY); // Box 504
		gunModel[353] = new ModelRendererTurbo(this, 1585, 617, textureX, textureY); // Box 505
		gunModel[354] = new ModelRendererTurbo(this, 1705, 257, textureX, textureY); // Box 506
		gunModel[355] = new ModelRendererTurbo(this, 1625, 633, textureX, textureY); // Box 507
		gunModel[356] = new ModelRendererTurbo(this, 1033, 273, textureX, textureY); // Box 508
		gunModel[357] = new ModelRendererTurbo(this, 1945, 345, textureX, textureY); // Box 509
		gunModel[358] = new ModelRendererTurbo(this, 1673, 633, textureX, textureY); // Box 510
		gunModel[359] = new ModelRendererTurbo(this, 1433, 217, textureX, textureY); // Box 511
		gunModel[360] = new ModelRendererTurbo(this, 1721, 633, textureX, textureY); // Box 512
		gunModel[361] = new ModelRendererTurbo(this, 1705, 33, textureX, textureY); // Box 514
		gunModel[362] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 515
		gunModel[363] = new ModelRendererTurbo(this, 1753, 633, textureX, textureY); // Box 516
		gunModel[364] = new ModelRendererTurbo(this, 825, 433, textureX, textureY); // Box 517
		gunModel[365] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 518
		gunModel[366] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 519
		gunModel[367] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 520
		gunModel[368] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 521
		gunModel[369] = new ModelRendererTurbo(this, 1097, 393, textureX, textureY); // Box 522
		gunModel[370] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 523
		gunModel[371] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Box 558
		gunModel[372] = new ModelRendererTurbo(this, 329, 649, textureX, textureY); // Box 560
		gunModel[373] = new ModelRendererTurbo(this, 753, 625, textureX, textureY); // Box 561
		gunModel[374] = new ModelRendererTurbo(this, 1545, 633, textureX, textureY); // Box 562
		gunModel[375] = new ModelRendererTurbo(this, 441, 649, textureX, textureY); // Box 563
		gunModel[376] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 564
		gunModel[377] = new ModelRendererTurbo(this, 897, 177, textureX, textureY); // Box 565
		gunModel[378] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 566
		gunModel[379] = new ModelRendererTurbo(this, 545, 225, textureX, textureY); // Box 567
		gunModel[380] = new ModelRendererTurbo(this, 1489, 521, textureX, textureY); // Box 568
		gunModel[381] = new ModelRendererTurbo(this, 521, 545, textureX, textureY); // Box 569
		gunModel[382] = new ModelRendererTurbo(this, 825, 545, textureX, textureY); // Box 570
		gunModel[383] = new ModelRendererTurbo(this, 1385, 553, textureX, textureY); // Box 571
		gunModel[384] = new ModelRendererTurbo(this, 1353, 577, textureX, textureY); // Box 572
		gunModel[385] = new ModelRendererTurbo(this, 1001, 657, textureX, textureY); // Box 574
		gunModel[386] = new ModelRendererTurbo(this, 593, 761, textureX, textureY); // Box 821
		gunModel[387] = new ModelRendererTurbo(this, 1, 809, textureX, textureY); // Box 822
		gunModel[388] = new ModelRendererTurbo(this, 105, 809, textureX, textureY); // Box 823
		gunModel[389] = new ModelRendererTurbo(this, 209, 809, textureX, textureY); // Box 824
		gunModel[390] = new ModelRendererTurbo(this, 1033, 25, textureX, textureY); // Box 825
		gunModel[391] = new ModelRendererTurbo(this, 313, 809, textureX, textureY); // Box 826
		gunModel[392] = new ModelRendererTurbo(this, 777, 721, textureX, textureY); // Box 832
		gunModel[393] = new ModelRendererTurbo(this, 73, 737, textureX, textureY); // Box 833
		gunModel[394] = new ModelRendererTurbo(this, 1761, 129, textureX, textureY); // Box 834
		gunModel[395] = new ModelRendererTurbo(this, 1817, 289, textureX, textureY); // Box 835
		gunModel[396] = new ModelRendererTurbo(this, 249, 329, textureX, textureY); // Box 836
		gunModel[397] = new ModelRendererTurbo(this, 513, 553, textureX, textureY); // Box 837
		gunModel[398] = new ModelRendererTurbo(this, 1489, 745, textureX, textureY); // Box 878
		gunModel[399] = new ModelRendererTurbo(this, 385, 681, textureX, textureY); // Box 879
		gunModel[400] = new ModelRendererTurbo(this, 2017, 689, textureX, textureY); // Box 880
		gunModel[401] = new ModelRendererTurbo(this, 1185, 697, textureX, textureY); // Box 881
		gunModel[402] = new ModelRendererTurbo(this, 97, 705, textureX, textureY); // Box 882
		gunModel[403] = new ModelRendererTurbo(this, 1657, 49, textureX, textureY); // Box 883
		gunModel[404] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 885
		gunModel[405] = new ModelRendererTurbo(this, 545, 809, textureX, textureY); // Box 886
		gunModel[406] = new ModelRendererTurbo(this, 297, 825, textureX, textureY); // Box 887
		gunModel[407] = new ModelRendererTurbo(this, 1433, 825, textureX, textureY); // Box 894
		gunModel[408] = new ModelRendererTurbo(this, 1673, 825, textureX, textureY); // Box 895
		gunModel[409] = new ModelRendererTurbo(this, 1801, 833, textureX, textureY); // Box 896
		gunModel[410] = new ModelRendererTurbo(this, 1, 857, textureX, textureY); // Box 897
		gunModel[411] = new ModelRendererTurbo(this, 129, 865, textureX, textureY); // Box 898
		gunModel[412] = new ModelRendererTurbo(this, 673, 873, textureX, textureY); // Box 899
		gunModel[413] = new ModelRendererTurbo(this, 1529, 745, textureX, textureY); // Box 900
		gunModel[414] = new ModelRendererTurbo(this, 1753, 745, textureX, textureY); // Box 901
		gunModel[415] = new ModelRendererTurbo(this, 777, 753, textureX, textureY); // Box 902
		gunModel[416] = new ModelRendererTurbo(this, 1, 761, textureX, textureY); // Box 903
		gunModel[417] = new ModelRendererTurbo(this, 297, 761, textureX, textureY); // Box 904
		gunModel[418] = new ModelRendererTurbo(this, 353, 761, textureX, textureY); // Box 905
		gunModel[419] = new ModelRendererTurbo(this, 57, 769, textureX, textureY); // Box 906
		gunModel[420] = new ModelRendererTurbo(this, 1249, 801, textureX, textureY); // Box 907
		gunModel[421] = new ModelRendererTurbo(this, 1273, 801, textureX, textureY); // Box 908
		gunModel[422] = new ModelRendererTurbo(this, 1809, 745, textureX, textureY); // Box 909
		gunModel[423] = new ModelRendererTurbo(this, 281, 809, textureX, textureY); // Box 911
		gunModel[424] = new ModelRendererTurbo(this, 425, 825, textureX, textureY); // Box 912
		gunModel[425] = new ModelRendererTurbo(this, 73, 809, textureX, textureY); // Box 913
		gunModel[426] = new ModelRendererTurbo(this, 177, 809, textureX, textureY); // Box 914
		gunModel[427] = new ModelRendererTurbo(this, 1561, 825, textureX, textureY); // Box 915
		gunModel[428] = new ModelRendererTurbo(this, 1633, 825, textureX, textureY); // Box 916
		gunModel[429] = new ModelRendererTurbo(this, 1705, 825, textureX, textureY); // Box 917
		gunModel[430] = new ModelRendererTurbo(this, 1801, 825, textureX, textureY); // Box 918
		gunModel[431] = new ModelRendererTurbo(this, 473, 833, textureX, textureY); // Box 919
		gunModel[432] = new ModelRendererTurbo(this, 1481, 825, textureX, textureY); // Box 922
		gunModel[433] = new ModelRendererTurbo(this, 1233, 521, textureX, textureY); // Box 923
		gunModel[434] = new ModelRendererTurbo(this, 1985, 705, textureX, textureY); // Box 924
		gunModel[435] = new ModelRendererTurbo(this, 1913, 585, textureX, textureY); // Box 925
		gunModel[436] = new ModelRendererTurbo(this, 1249, 473, textureX, textureY); // Box 926
		gunModel[437] = new ModelRendererTurbo(this, 1745, 97, textureX, textureY); // Box 927
		gunModel[438] = new ModelRendererTurbo(this, 1193, 721, textureX, textureY); // Box 928

		gunModel[0].addShapeBox(0F, 0F, 0F, 43, 8, 11, 0F,0F, -0.6F, -7.4F, 0F, -0.6F, -7.4F, 0F, -3.95F, -1.35F, 0F, -3.95F, -1.35F, 0F, -4.6F, -4.6F, 0F, -4.6F, -4.6F, 0F, -2.5F, -5.05F, 0F, -2.5F, -5.05F); // Box 68
		gunModel[0].setRotationPoint(370F, -210F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 43, 8, 11, 0F,0F, -4.6F, -4.6F, 0F, -4.6F, -4.6F, 0F, -2.5F, -5.05F, 0F, -2.5F, -5.05F, 0F, -0.6F, -7.4F, 0F, -0.6F, -7.4F, 0F, -3.95F, -1.35F, 0F, -3.95F, -1.35F); // Box 71
		gunModel[1].setRotationPoint(370F, -202F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 43, 11, 8, 0F,0F, -5.05F, -2.5F, 0F, -5.05F, -2.5F, 0F, -1.35F, -3.95F, 0F, -1.35F, -3.95F, 0F, -4.6F, -4.6F, 0F, -4.6F, -4.6F, 0F, -7.4F, -0.6F, 0F, -7.4F, -0.6F); // Box 72
		gunModel[2].setRotationPoint(370F, -213F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 13, 11, 8, 0F,0F, -0.5F, 0F, -6F, -0.5F, 0F, 11F, -1.35F, -3.95F, 0F, -1.35F, -3.95F, 0F, -6.5F, 0F, -6F, -6.5F, 0F, 11F, -5.95F, -5.5F, 0F, -5.95F, -5.5F); // Box 73
		gunModel[3].setRotationPoint(370F, -213F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 13, 11, 8, 0F,0F, -1.35F, -3.95F, 11F, -1.35F, -3.95F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -5.95F, -5.5F, 11F, -5.95F, -5.5F, -6F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 74
		gunModel[4].setRotationPoint(370F, -213F, -8F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 43, 11, 8, 0F,0F, -1.35F, -3.95F, 0F, -1.35F, -3.95F, 0F, -5.05F, -2.5F, 0F, -5.05F, -2.5F, 0F, -7.4F, -0.6F, 0F, -7.4F, -0.6F, 0F, -4.6F, -4.6F, 0F, -4.6F, -4.6F); // Box 75
		gunModel[5].setRotationPoint(370F, -213F, -8F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 43, 8, 11, 0F,0F, -3.95F, -1.35F, 0F, -3.95F, -1.35F, 0F, -0.6F, -7.4F, 0F, -0.6F, -7.4F, 0F, -2.5F, -5.05F, 0F, -2.5F, -5.05F, 0F, -4.6F, -4.6F, 0F, -4.6F, -4.6F); // Box 76
		gunModel[6].setRotationPoint(370F, -210F, -11F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 4, 8, 11, 0F,11F, -3.95F, -1.35F, 0F, -3.95F, -1.35F, 0F, -5.5F, -5.95F, 11F, -5.5F, -5.95F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F); // Box 77
		gunModel[7].setRotationPoint(405F, -210F, -11F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 13, 8, 11, 0F,0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, -3.95F, -1.35F, 11F, -3.95F, -1.35F, 11F, -5.5F, -5.95F, 0F, -5.5F, -5.95F); // Box 78
		gunModel[8].setRotationPoint(370F, -202F, -11F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 43, 8, 11, 0F,0F, -2.5F, -5.05F, 0F, -2.5F, -5.05F, 0F, -4.6F, -4.6F, 0F, -4.6F, -4.6F, 0F, -3.95F, -1.35F, 0F, -3.95F, -1.35F, 0F, -0.6F, -7.4F, 0F, -0.6F, -7.4F); // Box 79
		gunModel[9].setRotationPoint(370F, -202F, -11F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 43, 11, 8, 0F,0F, -7.4F, -0.6F, 0F, -7.4F, -0.6F, 0F, -4.6F, -4.6F, 0F, -4.6F, -4.6F, 0F, -1.35F, -3.95F, 0F, -1.35F, -3.95F, 0F, -5.05F, -2.5F, 0F, -5.05F, -2.5F); // Box 80
		gunModel[10].setRotationPoint(370F, -202F, -8F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 43, 11, 8, 0F,0F, -4.6F, -4.6F, 0F, -4.6F, -4.6F, 0F, -7.4F, -0.6F, 0F, -7.4F, -0.6F, 0F, -5.05F, -2.5F, 0F, -5.05F, -2.5F, 0F, -1.35F, -3.95F, 0F, -1.35F, -3.95F); // Box 82
		gunModel[11].setRotationPoint(370F, -202F, 0F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 16, 11, 0F,0F, -6.35F, -4.05F, 0F, -6.35F, -4.05F, 0F, -1.75F, -5.1F, 0F, -1.75F, -5.1F, 0F, -7.4F, -7.4F, 0F, -7.4F, -7.4F, 0F, -10.95F, -0.05F, 0F, -10.95F, -0.05F); // Box 74
		gunModel[12].setRotationPoint(298F, -219F, 0F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 11, 16, 0F,0F, -6.95F, -9.65F, 0F, -6.95F, -9.65F, 0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 0F, 0F, -10.5F, 0F, 0F, -10.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 75
		gunModel[13].setRotationPoint(298F, -214F, 0F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 13, 11, 8, 0F,0F, -1.35F, -3.95F, 0F, -1.35F, -3.95F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -7.4F, -0.6F, 0F, -7.4F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[14].setRotationPoint(238F, -184F, -8F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 13, 8, 11, 0F,0F, -3.95F, -1.35F, 0F, -3.95F, -1.35F, 0F, -0.6F, -7.4F, 0F, -0.6F, -7.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[15].setRotationPoint(238F, -181F, -11F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 13, 8, 11, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.95F, -1.35F, 0F, -3.95F, -1.35F, 0F, -0.6F, -7.4F, 0F, -0.6F, -7.4F); // Box 10
		gunModel[16].setRotationPoint(238F, -173F, -11F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 13, 11, 8, 0F,0F, -7.4F, -0.6F, 0F, -7.4F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, -3.95F, 0F, -1.35F, -3.95F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		gunModel[17].setRotationPoint(238F, -173F, -8F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 13, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.4F, -0.6F, 0F, -7.4F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.35F, -3.95F, 0F, -1.35F, -3.95F); // Box 12
		gunModel[18].setRotationPoint(238F, -173F, 0F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 13, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, -7.4F, 0F, -0.6F, -7.4F, 0F, -3.95F, -1.35F, 0F, -3.95F, -1.35F); // Box 13
		gunModel[19].setRotationPoint(238F, -173F, 0F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 13, 8, 11, 0F,0F, -0.6F, -7.4F, 0F, -0.6F, -7.4F, 0F, -3.95F, -1.35F, 0F, -3.95F, -1.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 14
		gunModel[20].setRotationPoint(238F, -181F, 0F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 13, 11, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.35F, -3.95F, 0F, -1.35F, -3.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.4F, -0.6F, 0F, -7.4F, -0.6F); // Box 15
		gunModel[21].setRotationPoint(238F, -184F, 0F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 16, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.75F, -5.1F, 0F, -1.75F, -5.1F, 0F, -10.5F, 0F, 0F, -10.5F, 0F, 0F, -9.65F, -6.95F, 0F, -9.65F, -6.95F); // Box 86
		gunModel[22].setRotationPoint(298F, -219F, 0F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 11, 16, 0F,0F, -0.05F, -10.95F, 0F, -0.05F, -10.95F, 0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 0F, -7.4F, -7.4F, 0F, -7.4F, -7.4F, 0F, -4.05F, -6.35F, 0F, -4.05F, -6.35F); // Box 87
		gunModel[23].setRotationPoint(298F, -214F, 0F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 11, 16, 0F,0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 0F, -6.95F, -9.65F, 0F, -6.95F, -9.65F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -10.5F, 0F, 0F, -10.5F); // Box 88
		gunModel[24].setRotationPoint(298F, -214F, -16F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 11, 16, 0F,0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 0F, -0.05F, -10.95F, 0F, -0.05F, -10.95F, 0F, -4.05F, -6.35F, 0F, -4.05F, -6.35F, 0F, -7.4F, -7.4F, 0F, -7.4F, -7.4F); // Box 89
		gunModel[25].setRotationPoint(298F, -214F, -16F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 16, 11, 0F,0F, -1.75F, -5.1F, 0F, -1.75F, -5.1F, 0F, -6.35F, -4.05F, 0F, -6.35F, -4.05F, 0F, -10.95F, -0.05F, 0F, -10.95F, -0.05F, 0F, -7.4F, -7.4F, 0F, -7.4F, -7.4F); // Box 90
		gunModel[26].setRotationPoint(298F, -219F, -11F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 16, 11, 0F,0F, -1.75F, -5.1F, 0F, -1.75F, -5.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -9.65F, -6.95F, 0F, -9.65F, -6.95F, 0F, -10.5F, 0F, 0F, -10.5F, 0F); // Box 91
		gunModel[27].setRotationPoint(298F, -219F, -11F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 26, 6, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		gunModel[28].setRotationPoint(298F, -208F, -15.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 154, 16, 11, 0F,0F, -3.15F, -5.4F, 0F, -3.15F, -5.4F, 0F, -1.75F, -5.1F, 0F, -1.75F, -5.1F, 0F, -9.9F, -9.9F, 3F, -9.9F, -9.9F, 3F, -10.95F, -0.05F, 0F, -10.95F, -0.05F); // Box 110
		gunModel[29].setRotationPoint(60F, -219F, 0F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 7, 16, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, -1.75F, -5.1F, 0F, -1.75F, -5.1F, 0F, -14F, 0F, 0F, -14F, 0F, 3F, -12.85F, -5.6F, 0F, -12.85F, -5.6F); // Box 112
		gunModel[30].setRotationPoint(60F, -219F, 0F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 21, 11, 16, 0F,0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 3F, -0.05F, -10.95F, 0F, -0.05F, -10.95F, 0F, -5.4F, -3.15F, 0F, -5.4F, -3.15F, 3F, -9.9F, -9.9F, 0F, -9.9F, -9.9F); // Box 114
		gunModel[31].setRotationPoint(60F, -214F, -16F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 154, 16, 11, 0F,0F, -1.75F, -5.1F, 0F, -1.75F, -5.1F, 0F, -3.15F, -5.4F, 0F, -3.15F, -5.4F, 0F, -10.95F, -0.05F, 3F, -10.95F, -0.05F, 3F, -9.9F, -9.9F, 0F, -9.9F, -9.9F); // Box 115
		gunModel[32].setRotationPoint(60F, -219F, -11F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 7, 16, 11, 0F,0F, -1.75F, -5.1F, 3F, -1.75F, -5.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -12.85F, -5.6F, 3F, -12.85F, -5.6F, 0F, -14F, 0F, 0F, -14F, 0F); // Box 116
		gunModel[33].setRotationPoint(60F, -219F, -11F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 21, 11, 16, 0F,0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 0F, -5.6F, -12.85F, 0F, -5.6F, -12.85F, 0F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, -14F, 0F, 0F, -14.05F); // Box 117
		gunModel[34].setRotationPoint(60F, -214F, -16F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 26, 6, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		gunModel[35].setRotationPoint(298F, -208F, 9.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 203, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 121
		gunModel[36].setRotationPoint(60F, -203F, -15.5F);

		gunModel[37].addShapeBox(0F, 0F, 1F, 7, 9, 257, 0F,-3.55F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -0.7F, 0F, -0.65F, -6.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -6.35F, 0F); // Box 190
		gunModel[37].setRotationPoint(14F, -182F, 7F);
		gunModel[37].rotateAngleY = -1.57079633F;

		gunModel[38].addShapeBox(0F, 0F, 1F, 9, 7, 257, 0F,-0.7F, -3.55F, 0F, -6.35F, -0.65F, 0F, -6.35F, -0.65F, 0F, -0.7F, -3.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		gunModel[38].setRotationPoint(14F, -180F, 9F);
		gunModel[38].rotateAngleY = -1.57079633F;

		gunModel[39].addShapeBox(0F, 0F, 1F, 9, 7, 257, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -3.55F, 0F, -6.35F, -0.65F, 0F, -6.35F, -0.65F, 0F, -0.7F, -3.55F, 0F); // Box 192
		gunModel[39].setRotationPoint(14F, -173F, 9F);
		gunModel[39].rotateAngleY = -1.57079633F;

		gunModel[40].addShapeBox(0F, 0F, 1F, 7, 9, 257, 0F,-0.65F, -6.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -6.35F, 0F, -3.55F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -0.7F, 0F); // Box 193
		gunModel[40].setRotationPoint(14F, -173F, 7F);
		gunModel[40].rotateAngleY = -1.57079633F;

		gunModel[41].addShapeBox(0F, 0F, 1F, 7, 9, 257, 0F,0F, 0F, 0F, -0.65F, -6.35F, 0F, -0.65F, -6.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -0.7F, 0F, -3.55F, -0.7F, 0F, 0F, 0F, 0F); // Box 194
		gunModel[41].setRotationPoint(14F, -173F, 0F);
		gunModel[41].rotateAngleY = -1.57079633F;

		gunModel[42].addShapeBox(0F, 0F, 1F, 9, 7, 257, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.35F, -0.65F, 0F, -0.7F, -3.55F, 0F, -0.7F, -3.55F, 0F, -6.35F, -0.65F, 0F); // Box 195
		gunModel[42].setRotationPoint(14F, -173F, 0F);
		gunModel[42].rotateAngleY = -1.57079633F;

		gunModel[43].addShapeBox(0F, 0F, 1F, 9, 7, 257, 0F,-6.35F, -0.65F, 0F, -0.7F, -3.55F, 0F, -0.7F, -3.55F, 0F, -6.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		gunModel[43].setRotationPoint(14F, -180F, 0F);
		gunModel[43].rotateAngleY = -1.57079633F;

		gunModel[44].addShapeBox(0F, 0F, 1F, 7, 9, 257, 0F,0F, 0F, 0F, -3.55F, -0.7F, 0F, -3.55F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -6.35F, 0F, -0.65F, -6.35F, 0F, 0F, 0F, 0F); // Box 197
		gunModel[44].setRotationPoint(14F, -182F, 0F);
		gunModel[44].rotateAngleY = -1.57079633F;

		gunModel[45].addShapeBox(0F, 0F, 0F, 6, 9, 15, 0F,0F, -0.5F, 0F, -2.75F, -1.2F, 0F, -2.75F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 193
		gunModel[45].setRotationPoint(363F, -211F, 0F);
		gunModel[45].rotateAngleY = -1.57079633F;

		gunModel[46].addShapeBox(0F, 0F, 0F, 9, 6, 15, 0F,-6F, 0F, 0F, -1.2F, -2.7F, 0F, -1.2F, -2.7F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 194
		gunModel[46].setRotationPoint(363F, -208F, 0F);
		gunModel[46].rotateAngleY = -1.57079633F;

		gunModel[47].addShapeBox(0F, 0F, 0F, 6, 9, 15, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2.75F, -1.2F, 0F, -2.75F, -1.2F, 0F, 0F, -0.5F, 0F); // Box 195
		gunModel[47].setRotationPoint(363F, -202F, 0F);
		gunModel[47].rotateAngleY = -1.57079633F;

		gunModel[48].addShapeBox(0F, 0F, 0F, 9, 6, 15, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1.2F, -2.7F, 0F, -1.2F, -2.7F, 0F, -6F, 0F, 0F); // Box 196
		gunModel[48].setRotationPoint(363F, -202F, 0F);
		gunModel[48].rotateAngleY = -1.57079633F;

		gunModel[49].addShapeBox(0F, 0F, 0F, 6, 9, 15, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2.75F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.75F, -1.2F, 0F); // Box 197
		gunModel[49].setRotationPoint(363F, -202F, 6F);
		gunModel[49].rotateAngleY = -1.57079633F;

		gunModel[50].addShapeBox(0F, 0F, 0F, 9, 6, 15, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, -2.7F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -1.2F, -2.7F, 0F); // Box 198
		gunModel[50].setRotationPoint(363F, -202F, 9F);
		gunModel[50].rotateAngleY = -1.57079633F;

		gunModel[51].addShapeBox(0F, 0F, 0F, 9, 6, 15, 0F,-1.2F, -2.7F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -1.2F, -2.7F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 199
		gunModel[51].setRotationPoint(363F, -208F, 9F);
		gunModel[51].rotateAngleY = -1.57079633F;

		gunModel[52].addShapeBox(0F, 0F, 0F, 6, 9, 15, 0F,-2.75F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.75F, -1.2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 200
		gunModel[52].setRotationPoint(363F, -211F, 6F);
		gunModel[52].rotateAngleY = -1.57079633F;

		gunModel[53].addShapeBox(0F, 0F, 0F, 17, 16, 11, 0F,3F, -1.75F, -5.1F, 0F, -1.75F, -5.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, -12.85F, -5.6F, 0F, -12.85F, -5.6F, 0F, -14F, 0F, 0F, -14F, 0F); // Box 151
		gunModel[53].setRotationPoint(281F, -219F, -11F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 17, 16, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.75F, -5.1F, 3F, -1.75F, -5.1F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -12.85F, -5.6F, 3F, -12.85F, -5.6F); // Box 152
		gunModel[54].setRotationPoint(281F, -219F, 0F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 48, 16, 11, 0F,0F, -3.15F, -5.4F, 0F, -3.15F, -5.4F, 0F, -1.75F, -5.1F, 0F, -1.75F, -5.1F, 3F, -9.9F, -9.9F, 0F, -9.9F, -9.9F, 0F, -10.95F, -0.05F, 3F, -10.95F, -0.05F); // Box 153
		gunModel[55].setRotationPoint(250F, -219F, 0F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 48, 16, 11, 0F,0F, -1.75F, -5.1F, 0F, -1.75F, -5.1F, 0F, -3.15F, -5.4F, 0F, -3.15F, -5.4F, 3F, -10.95F, -0.05F, 0F, -10.95F, -0.05F, 0F, -9.9F, -9.9F, 3F, -9.9F, -9.9F); // Box 154
		gunModel[56].setRotationPoint(250F, -219F, -11F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 9, 16, 11, 0F,3F, -1.75F, -5.1F, 3F, -1.75F, -5.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, -12.85F, -5.6F, 3F, -12.85F, -5.6F, 0F, -14F, 0F, 0F, -14F, 0F); // Box 155
		gunModel[57].setRotationPoint(92F, -219F, -11F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 9, 16, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, -1.75F, -5.1F, 3F, -1.75F, -5.1F, 0F, -14F, 0F, 0F, -14F, 0F, 3F, -12.85F, -5.6F, 3F, -12.85F, -5.6F); // Box 156
		gunModel[58].setRotationPoint(92F, -219F, 0F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 9, 16, 11, 0F,3F, -1.75F, -5.1F, 3F, -1.75F, -5.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, -12.85F, -5.6F, 3F, -12.85F, -5.6F, 0F, -14F, 0F, 0F, -14F, 0F); // Box 157
		gunModel[59].setRotationPoint(126F, -219F, -11F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 9, 16, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, -1.75F, -5.1F, 3F, -1.75F, -5.1F, 0F, -14F, 0F, 0F, -14F, 0F, 3F, -12.85F, -5.6F, 3F, -12.85F, -5.6F); // Box 158
		gunModel[60].setRotationPoint(126F, -219F, 0F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 10, 16, 11, 0F,3F, -1.75F, -5.1F, 3F, -1.75F, -5.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, -12.85F, -5.6F, 3F, -12.85F, -5.6F, 0F, -14F, 0F, 0F, -14F, 0F); // Box 159
		gunModel[61].setRotationPoint(159F, -219F, -11F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 10, 16, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, -1.75F, -5.1F, 3F, -1.75F, -5.1F, 0F, -14F, 0F, 0F, -14F, 0F, 3F, -12.85F, -5.6F, 3F, -12.85F, -5.6F); // Box 160
		gunModel[62].setRotationPoint(159F, -219F, 0F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 20, 16, 11, 0F,3F, -1.75F, -5.1F, 0F, -1.75F, -5.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, -12.85F, -5.6F, 0F, -12.85F, -5.6F, 0F, -14F, 0F, 0F, -14F, 0F); // Box 161
		gunModel[63].setRotationPoint(194F, -219F, -11F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 20, 16, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.75F, -5.1F, 3F, -1.75F, -5.1F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -12.85F, -5.6F, 3F, -12.85F, -5.6F); // Box 162
		gunModel[64].setRotationPoint(194F, -219F, 0F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 6, 11, 16, 0F,0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 0F, -5.6F, -12.85F, 0F, -5.6F, -12.85F, 3F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, -14F, 3F, 0F, -14.05F); // Box 163
		gunModel[65].setRotationPoint(110F, -214F, -16F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 6, 11, 16, 0F,0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 3F, -0.05F, -10.95F, 3F, -0.05F, -10.95F, 0F, -5.4F, -3.15F, 0F, -5.4F, -3.15F, 3F, -9.9F, -9.9F, 3F, -9.9F, -9.9F); // Box 164
		gunModel[66].setRotationPoint(110F, -214F, -16F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 6, 11, 16, 0F,0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 0F, -5.6F, -12.85F, 0F, -5.6F, -12.85F, 3F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, -14F, 3F, 0F, -14.05F); // Box 165
		gunModel[67].setRotationPoint(144F, -214F, -16F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 6, 11, 16, 0F,0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 3F, -0.05F, -10.95F, 3F, -0.05F, -10.95F, 0F, -5.4F, -3.15F, 0F, -5.4F, -3.15F, 3F, -9.9F, -9.9F, 3F, -9.9F, -9.9F); // Box 166
		gunModel[68].setRotationPoint(144F, -214F, -16F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 6, 11, 16, 0F,0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 0F, -5.6F, -12.85F, 0F, -5.6F, -12.85F, 3F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, -14F, 3F, 0F, -14.05F); // Box 167
		gunModel[69].setRotationPoint(178F, -214F, -16F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 6, 11, 16, 0F,0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 3F, -0.05F, -10.95F, 3F, -0.05F, -10.95F, 0F, -5.4F, -3.15F, 0F, -5.4F, -3.15F, 3F, -9.9F, -9.9F, 3F, -9.9F, -9.9F); // Box 168
		gunModel[70].setRotationPoint(178F, -214F, -16F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 38, 11, 16, 0F,0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 0F, -5.6F, -12.85F, 0F, -5.6F, -12.85F, 3F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, -14F, 3F, 0F, -14.05F); // Box 169
		gunModel[71].setRotationPoint(212F, -214F, -16F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 38, 11, 16, 0F,0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 3F, -0.05F, -10.95F, 3F, -0.05F, -10.95F, 0F, -5.4F, -3.15F, 0F, -5.4F, -3.15F, 3F, -9.9F, -9.9F, 3F, -9.9F, -9.9F); // Box 170
		gunModel[72].setRotationPoint(212F, -214F, -16F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 20, 11, 16, 0F,0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 0F, -5.6F, -12.85F, 0F, -5.6F, -12.85F, 3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -14F, 3F, 0F, -14.05F); // Box 171
		gunModel[73].setRotationPoint(278F, -214F, -16F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 20, 11, 16, 0F,0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 0F, -0.05F, -10.95F, 3F, -0.05F, -10.95F, 0F, -5.4F, -3.15F, 0F, -5.4F, -3.15F, 0F, -9.9F, -9.9F, 3F, -9.9F, -9.9F); // Box 172
		gunModel[74].setRotationPoint(278F, -214F, -16F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 35, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 173
		gunModel[75].setRotationPoint(263F, -203F, -15.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 21, 11, 16, 0F,0F, -0.05F, -10.95F, 3F, -0.05F, -10.95F, 0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 0F, -9.9F, -9.9F, 3F, -9.9F, -9.9F, 0F, -5.4F, -3.15F, 0F, -5.4F, -3.15F); // Box 174
		gunModel[76].setRotationPoint(60F, -214F, 0F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 21, 11, 16, 0F,0F, -5.6F, -12.85F, 0F, -5.6F, -12.85F, 0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 0F, 0F, -14.05F, 3F, 0F, -14F, 3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 175
		gunModel[77].setRotationPoint(60F, -214F, 0F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 203, 6, 2, 0F,0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		gunModel[78].setRotationPoint(60F, -203F, 13.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 6, 11, 16, 0F,0F, -5.6F, -12.85F, 0F, -5.6F, -12.85F, 0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 3F, 0F, -14.05F, 3F, 0F, -14F, 3F, 0F, -0.5F, 3F, 0F, -0.5F); // Box 177
		gunModel[79].setRotationPoint(110F, -214F, 0F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 6, 11, 16, 0F,3F, -0.05F, -10.95F, 3F, -0.05F, -10.95F, 0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 3F, -9.9F, -9.9F, 3F, -9.9F, -9.9F, 0F, -5.4F, -3.15F, 0F, -5.4F, -3.15F); // Box 178
		gunModel[80].setRotationPoint(110F, -214F, 0F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 6, 11, 16, 0F,3F, -0.05F, -10.95F, 3F, -0.05F, -10.95F, 0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 3F, -9.9F, -9.9F, 3F, -9.9F, -9.9F, 0F, -5.4F, -3.15F, 0F, -5.4F, -3.15F); // Box 179
		gunModel[81].setRotationPoint(144F, -214F, 0F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 6, 11, 16, 0F,0F, -5.6F, -12.85F, 0F, -5.6F, -12.85F, 0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 3F, 0F, -14.05F, 3F, 0F, -14F, 3F, 0F, -0.5F, 3F, 0F, -0.5F); // Box 180
		gunModel[82].setRotationPoint(144F, -214F, 0F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 6, 11, 16, 0F,3F, -0.05F, -10.95F, 3F, -0.05F, -10.95F, 0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 3F, -9.9F, -9.9F, 3F, -9.9F, -9.9F, 0F, -5.4F, -3.15F, 0F, -5.4F, -3.15F); // Box 181
		gunModel[83].setRotationPoint(178F, -214F, 0F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 6, 11, 16, 0F,0F, -5.6F, -12.85F, 0F, -5.6F, -12.85F, 0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 3F, 0F, -14.05F, 3F, 0F, -14F, 3F, 0F, -0.5F, 3F, 0F, -0.5F); // Box 182
		gunModel[84].setRotationPoint(178F, -214F, 0F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 38, 11, 16, 0F,3F, -0.05F, -10.95F, 3F, -0.05F, -10.95F, 0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 3F, -9.9F, -9.9F, 3F, -9.9F, -9.9F, 0F, -5.4F, -3.15F, 0F, -5.4F, -3.15F); // Box 183
		gunModel[85].setRotationPoint(212F, -214F, 0F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 38, 11, 16, 0F,0F, -5.6F, -12.85F, 0F, -5.6F, -12.85F, 0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 3F, 0F, -14.05F, 3F, 0F, -14F, 3F, 0F, -0.5F, 3F, 0F, -0.5F); // Box 184
		gunModel[86].setRotationPoint(212F, -214F, 0F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 35, 21, 2, 0F,0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		gunModel[87].setRotationPoint(263F, -203F, 13.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 20, 11, 16, 0F,3F, -0.05F, -10.95F, 0F, -0.05F, -10.95F, 0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 3F, -9.9F, -9.9F, 0F, -9.9F, -9.9F, 0F, -5.4F, -3.15F, 0F, -5.4F, -3.15F); // Box 186
		gunModel[88].setRotationPoint(278F, -214F, 0F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 20, 11, 16, 0F,0F, -5.6F, -12.85F, 0F, -5.6F, -12.85F, 0F, -5.1F, -1.75F, 0F, -5.1F, -1.75F, 3F, 0F, -14.05F, 0F, 0F, -14F, 0F, 0F, -0.5F, 3F, 0F, -0.5F); // Box 187
		gunModel[89].setRotationPoint(278F, -214F, 0F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 5, 7, 13, 0F,-2.5F, -1.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, -1.05F, 0F, -0.4F, -4.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -4.6F, 0F); // Box 80
		gunModel[90].setRotationPoint(266F, -180F, 5F);
		gunModel[90].rotateAngleY = -1.57079633F;

		gunModel[91].addShapeBox(0F, 0F, 0F, 7, 5, 13, 0F,-1.05F, -2.5F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, -1.05F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 81
		gunModel[91].setRotationPoint(266F, -178F, 7F);
		gunModel[91].rotateAngleY = -1.57079633F;

		gunModel[92].addShapeBox(0F, 0F, 0F, 7, 5, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.05F, -2.5F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, -1.05F, -2.5F, 0F); // Box 82
		gunModel[92].setRotationPoint(266F, -173F, 7F);
		gunModel[92].rotateAngleY = -1.57079633F;

		gunModel[93].addShapeBox(0F, 0F, 0F, 5, 7, 13, 0F,-0.4F, -4.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -4.6F, 0F, -2.5F, -1.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, -1.05F, 0F); // Box 83
		gunModel[93].setRotationPoint(266F, -173F, 5F);
		gunModel[93].rotateAngleY = -1.57079633F;

		gunModel[94].addShapeBox(0F, 0F, 0F, 5, 7, 13, 0F,0F, 0F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, 0F, -0.5F, 0F); // Box 84
		gunModel[94].setRotationPoint(266F, -173F, 0F);
		gunModel[94].rotateAngleY = -1.57079633F;

		gunModel[95].addShapeBox(0F, 0F, 0F, 7, 5, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -4.6F, -0.4F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -4.6F, -0.4F, 0F); // Box 85
		gunModel[95].setRotationPoint(266F, -173F, 0F);
		gunModel[95].rotateAngleY = -1.57079633F;

		gunModel[96].addShapeBox(0F, 0F, 0F, 7, 5, 13, 0F,-4.6F, -0.4F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -4.6F, -0.4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 86
		gunModel[96].setRotationPoint(266F, -178F, 0F);
		gunModel[96].rotateAngleY = -1.57079633F;

		gunModel[97].addShapeBox(0F, 0F, 0F, 5, 7, 13, 0F,0F, -0.5F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, 0F, 0F, 0F); // Box 87
		gunModel[97].setRotationPoint(266F, -180F, 0F);
		gunModel[97].rotateAngleY = -1.57079633F;

		gunModel[98].addShapeBox(0F, 0F, 0F, 81, 14, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		gunModel[98].setRotationPoint(129F, -180F, 5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 14, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -5F, 0F, -1.05F, -5F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, -9.2F, -0.8F, 0F, -9.2F, -0.8F); // Box 97
		gunModel[99].setRotationPoint(219F, -186F, 0F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 14, 10, 13, 0F,0F, -0.8F, -9.2F, 0F, -0.8F, -9.2F, 0F, -5F, -1.05F, 0F, -5F, -1.05F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		gunModel[100].setRotationPoint(219F, -183F, 0F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 14, 13, 10, 0F,0F, 0F, 0F, 6F, 0F, 0F, 0F, -9.2F, -0.8F, 0F, -9.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -5F, 0F, -1.05F, -5F); // Box 247
		gunModel[101].setRotationPoint(219F, -173F, 0F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 14, 10, 13, 0F,0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -9.2F, 0F, -0.8F, -9.2F, 0F, -5F, -1.05F, 0F, -5F, -1.05F); // Box 248
		gunModel[102].setRotationPoint(219F, -173F, 0F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 14, 13, 10, 0F,0F, -9.2F, -0.8F, 0F, -9.2F, -0.8F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -5F, 0F, -1.05F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		gunModel[103].setRotationPoint(219F, -173F, -10F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 14, 10, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1.05F, 0F, -5F, -1.05F, 0F, -0.8F, -9.2F, 0F, -0.8F, -9.2F); // Box 250
		gunModel[104].setRotationPoint(219F, -173F, -13F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 14, 10, 13, 0F,0F, -5F, -1.05F, 0F, -5F, -1.05F, 0F, -0.8F, -9.2F, 0F, -0.8F, -9.2F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 251
		gunModel[105].setRotationPoint(219F, -183F, -13F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 14, 13, 10, 0F,0F, -1.05F, -5F, 0F, -1.05F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.2F, -0.8F, 0F, -9.2F, -0.8F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 252
		gunModel[106].setRotationPoint(219F, -186F, -10F);

		gunModel[107].addShapeBox(0F, 0F, 1F, 2, 43, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		gunModel[107].setRotationPoint(120F, -180F, -17F);
		gunModel[107].rotateAngleY = -1.57079633F;

		gunModel[108].addShapeBox(0F, 0F, 1F, 2, 5, 2, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		gunModel[108].setRotationPoint(10F, -190F, -17F);
		gunModel[108].rotateAngleY = -1.57079633F;

		gunModel[109].addShapeBox(0F, 0F, 1F, 2, 2, 93, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		gunModel[109].setRotationPoint(15F, -190F, -17F);
		gunModel[109].rotateAngleY = -1.57079633F;

		gunModel[110].addShapeBox(0F, 0F, 1F, 2, 45, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		gunModel[110].setRotationPoint(10F, -185F, -17F);
		gunModel[110].rotateAngleY = -1.57079633F;

		gunModel[111].addShapeBox(0F, 0F, 1F, 2, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -2F, 0F, 8F, -2F); // Box 257
		gunModel[111].setRotationPoint(108F, -190F, -17F);
		gunModel[111].rotateAngleY = -1.57079633F;

		gunModel[112].addShapeBox(0F, 0F, 0F, 12, 5, 12, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		gunModel[112].setRotationPoint(258F, -184F, 6F);
		gunModel[112].rotateAngleY = -1.57079633F;

		gunModel[113].addShapeBox(0F, 0F, 1F, 17, 35, 8, 0F,0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		gunModel[113].setRotationPoint(16F, -231F, -15F);

		gunModel[114].addShapeBox(0F, 0F, 1F, 17, 35, 8, 0F,0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		gunModel[114].setRotationPoint(16F, -231F, 5F);

		gunModel[115].addShapeBox(0F, 0F, 1F, 49, 37, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		gunModel[115].setRotationPoint(-16F, -233F, -7F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 3, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.2F, -0.8F, 0F, -9.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -5F, 0F, -1.05F, -5F); // Box 277
		gunModel[116].setRotationPoint(32F, -202F, 0F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 3, 13, 10, 0F,0F, -1.05F, -5F, 0F, -1.05F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.2F, -0.8F, 0F, -9.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		gunModel[117].setRotationPoint(32F, -215F, -10F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 3, 10, 13, 0F,0F, -5F, -1.05F, 0F, -5F, -1.05F, 0F, -0.8F, -9.2F, 0F, -0.8F, -9.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		gunModel[118].setRotationPoint(32F, -212F, -13F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 3, 13, 10, 0F,0F, -9.2F, -0.8F, 0F, -9.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -5F, 0F, -1.05F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		gunModel[119].setRotationPoint(32F, -202F, -10F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 3, 10, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1.05F, 0F, -5F, -1.05F, 0F, -0.8F, -9.2F, 0F, -0.8F, -9.2F); // Box 281
		gunModel[120].setRotationPoint(32F, -202F, -13F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 3, 10, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -9.2F, 0F, -0.8F, -9.2F, 0F, -5F, -1.05F, 0F, -5F, -1.05F); // Box 282
		gunModel[121].setRotationPoint(32F, -202F, 0F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 3, 10, 13, 0F,0F, -0.8F, -9.2F, 0F, -0.8F, -9.2F, 0F, -5F, -1.05F, 0F, -5F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		gunModel[122].setRotationPoint(32F, -212F, 0F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 3, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -5F, 0F, -1.05F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.2F, -0.8F, 0F, -9.2F, -0.8F); // Box 284
		gunModel[123].setRotationPoint(32F, -215F, 0F);

		gunModel[124].addShapeBox(0F, 0F, 1F, 14, 67, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 285
		gunModel[124].setRotationPoint(-299F, -221F, -17F);

		gunModel[125].addShapeBox(0F, 0F, 1F, 35, 25, 5, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		gunModel[125].setRotationPoint(-285F, -179F, -17F);

		gunModel[126].addShapeBox(0F, 0F, 1F, 266, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		gunModel[126].setRotationPoint(-255F, -179F, -17F);

		gunModel[127].addShapeBox(0F, 0F, 1F, 263, 6, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		gunModel[127].setRotationPoint(-285F, -198F, -17F);

		gunModel[128].addShapeBox(0F, 0F, 1F, 7, 13, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		gunModel[128].setRotationPoint(4F, -192F, -17F);

		gunModel[129].addShapeBox(0F, 0F, 1F, 289, 13, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		gunModel[129].setRotationPoint(-285F, -192F, -17F);

		gunModel[130].addShapeBox(0F, 0F, 1F, 18, 58, 32, 0F,0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 291
		gunModel[130].setRotationPoint(-317F, -215F, -17F);

		gunModel[131].addShapeBox(0F, 0F, 1F, 121, 6, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		gunModel[131].setRotationPoint(-438F, -171F, -17F);

		gunModel[132].addShapeBox(0F, 0F, 1F, 22, 23, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		gunModel[132].setRotationPoint(-285F, -221F, -17F);

		gunModel[133].addShapeBox(0F, 0F, 1F, 106, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		gunModel[133].setRotationPoint(-100F, -169F, -20F);

		gunModel[134].addShapeBox(0F, 0F, 1F, 25, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		gunModel[134].setRotationPoint(-113F, -153F, -20F);

		gunModel[135].addShapeBox(0F, 0F, 1F, 14, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 297
		gunModel[135].setRotationPoint(-8F, -153F, -20F);

		gunModel[136].addShapeBox(0F, 0F, 1F, 4, 16, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 298
		gunModel[136].setRotationPoint(-117F, -153F, -20F);

		gunModel[137].addShapeBox(0F, 0F, 1F, 4, 14, 4, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 299
		gunModel[137].setRotationPoint(-121F, -152F, -20F);

		gunModel[138].addShapeBox(0F, 0F, 1F, 40, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		gunModel[138].setRotationPoint(-386F, -202F, -17F);

		gunModel[139].addShapeBox(0F, 0F, 1F, 29, 10, 32, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 193
		gunModel[139].setRotationPoint(-346F, -202F, -17F);

		gunModel[140].addShapeBox(0F, 0F, 1F, 52, 18, 32, 0F,0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Box 194
		gunModel[140].setRotationPoint(-438F, -219F, -17F);

		gunModel[141].addShapeBox(0F, 0F, 1F, 12, 61, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		gunModel[141].setRotationPoint(-450F, -219F, -17F);

		gunModel[142].addShapeBox(0F, 0F, 1F, 67, 7, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F); // Box 196
		gunModel[142].setRotationPoint(-438F, -165F, -17F);

		gunModel[143].addShapeBox(0F, 0F, 1F, 66, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 197
		gunModel[143].setRotationPoint(-450F, -158F, -15F);

		gunModel[144].addShapeBox(0F, 0F, 1F, 62, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		gunModel[144].setRotationPoint(-448F, -152F, -15F);

		gunModel[145].addShapeBox(0F, 0F, 1F, 62, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		gunModel[145].setRotationPoint(-448F, -147F, -15F);

		gunModel[146].addShapeBox(0F, 0F, 1F, 62, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		gunModel[146].setRotationPoint(-448F, -142F, -15F);

		gunModel[147].addShapeBox(0F, 0F, 1F, 62, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		gunModel[147].setRotationPoint(-448F, -137F, -15F);

		gunModel[148].addShapeBox(0F, 0F, 1F, 62, 2, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 202
		gunModel[148].setRotationPoint(-448F, -139F, -17F);

		gunModel[149].addShapeBox(0F, 0F, 1F, 62, 2, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 203
		gunModel[149].setRotationPoint(-448F, -144F, -17F);

		gunModel[150].addShapeBox(0F, 0F, 1F, 62, 2, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 204
		gunModel[150].setRotationPoint(-448F, -149F, -17F);

		gunModel[151].addShapeBox(0F, 0F, 1F, 62, 3, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		gunModel[151].setRotationPoint(-448F, -155F, -17F);

		gunModel[152].addShapeBox(0F, 0F, 1F, 62, 2, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 206
		gunModel[152].setRotationPoint(-448F, -134F, -17F);

		gunModel[153].addShapeBox(0F, 0F, 1F, 2, 23, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		gunModel[153].setRotationPoint(-450F, -155F, -17F);

		gunModel[154].addShapeBox(0F, 0F, 1F, 121, 30, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		gunModel[154].setRotationPoint(-438F, -201F, -14F);

		gunModel[155].addShapeBox(0F, 0F, 1F, 2, 23, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		gunModel[155].setRotationPoint(-386F, -155F, -17F);

		gunModel[156].addShapeBox(0F, 0F, 1F, 54, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 211
		gunModel[156].setRotationPoint(-371F, -165F, -17F);

		gunModel[157].addShapeBox(0F, 0F, 1F, 18, 10, 32, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 212
		gunModel[157].setRotationPoint(-317F, -165F, -17F);

		gunModel[158].addShapeBox(0F, 0F, 1F, 13, 10, 32, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 213
		gunModel[158].setRotationPoint(-384F, -165F, -17F);

		gunModel[159].addShapeBox(0F, 0F, 1F, 13, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, 0F, 0F, 0F); // Box 214
		gunModel[159].setRotationPoint(-384F, -155F, -17F);

		gunModel[160].addShapeBox(0F, 0F, 1F, 7, 13, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, -3F, -1F, -6F, -3F, 0F, 0F, 0F); // Box 215
		gunModel[160].setRotationPoint(-384F, -145F, -17F);

		gunModel[161].addShapeBox(0F, 0F, 1F, 12, 87, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 216
		gunModel[161].setRotationPoint(-462F, -219F, -17F);

		gunModel[162].addShapeBox(0F, 0F, 1F, 24, 5, 32, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		gunModel[162].setRotationPoint(-462F, -224F, -17F);

		gunModel[163].addShapeBox(0F, 0F, 1F, 52, 5, 32, 0F,0F, 0F, -3F, 0F, -18F, -3F, 0F, -18F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 17F, 0F, 0F, 17F, 0F, 0F, 0F, 0F); // Box 218
		gunModel[163].setRotationPoint(-438F, -224F, -17F);

		gunModel[164].addShapeBox(0F, 0F, 1F, 40, 4, 32, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		gunModel[164].setRotationPoint(-386F, -206F, -17F);

		gunModel[165].addShapeBox(0F, 0F, 1F, 29, 4, 32, 0F,0F, 0F, -3F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 220
		gunModel[165].setRotationPoint(-346F, -206F, -17F);

		gunModel[166].addShapeBox(0F, 0F, 1F, 18, 4, 32, 0F,0F, 0F, -3F, 0F, 12F, -3F, 0F, 12F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 221
		gunModel[166].setRotationPoint(-317F, -209F, -17F);

		gunModel[167].addShapeBox(0F, 0F, 1F, 64, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -10F, -3F, -3F, -10F, -3F, 0F, 0F, -3F); // Box 222
		gunModel[167].setRotationPoint(-448F, -132F, -17F);

		gunModel[168].addShapeBox(0F, 0F, 1F, 6, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, -3F); // Box 223
		gunModel[168].setRotationPoint(-454F, -132F, -17F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 81, 14, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		gunModel[169].setRotationPoint(129F, -180F, -14F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 81, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 259
		gunModel[170].setRotationPoint(129F, -181F, -16F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		gunModel[171].setRotationPoint(207F, -181F, -18F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		gunModel[172].setRotationPoint(201F, -181F, -18F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		gunModel[173].setRotationPoint(189F, -181F, -18F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		gunModel[174].setRotationPoint(195F, -181F, -18F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		gunModel[175].setRotationPoint(165F, -181F, -18F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		gunModel[176].setRotationPoint(171F, -181F, -18F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		gunModel[177].setRotationPoint(177F, -181F, -18F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		gunModel[178].setRotationPoint(183F, -181F, -18F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		gunModel[179].setRotationPoint(129F, -181F, -18F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		gunModel[180].setRotationPoint(135F, -181F, -18F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		gunModel[181].setRotationPoint(141F, -181F, -18F);

		gunModel[182].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		gunModel[182].setRotationPoint(147F, -181F, -18F);

		gunModel[183].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		gunModel[183].setRotationPoint(153F, -181F, -18F);

		gunModel[184].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		gunModel[184].setRotationPoint(159F, -181F, -18F);

		gunModel[185].addShapeBox(0F, 0F, 0F, 81, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		gunModel[185].setRotationPoint(129F, -181F, 14F);

		gunModel[186].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 290
		gunModel[186].setRotationPoint(207F, -181F, 16F);

		gunModel[187].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 291
		gunModel[187].setRotationPoint(201F, -181F, 16F);

		gunModel[188].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 292
		gunModel[188].setRotationPoint(195F, -181F, 16F);

		gunModel[189].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 293
		gunModel[189].setRotationPoint(189F, -181F, 16F);

		gunModel[190].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 294
		gunModel[190].setRotationPoint(183F, -181F, 16F);

		gunModel[191].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 295
		gunModel[191].setRotationPoint(177F, -181F, 16F);

		gunModel[192].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 296
		gunModel[192].setRotationPoint(171F, -181F, 16F);

		gunModel[193].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 297
		gunModel[193].setRotationPoint(165F, -181F, 16F);

		gunModel[194].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 298
		gunModel[194].setRotationPoint(159F, -181F, 16F);

		gunModel[195].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 299
		gunModel[195].setRotationPoint(153F, -181F, 16F);

		gunModel[196].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 300
		gunModel[196].setRotationPoint(147F, -181F, 16F);

		gunModel[197].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 301
		gunModel[197].setRotationPoint(141F, -181F, 16F);

		gunModel[198].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 302
		gunModel[198].setRotationPoint(135F, -181F, 16F);

		gunModel[199].addShapeBox(0F, 0F, 0F, 3, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 303
		gunModel[199].setRotationPoint(129F, -181F, 16F);

		gunModel[200].addShapeBox(0F, 0F, 0F, 63, 14, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		gunModel[200].setRotationPoint(147F, -174F, -7F);

		gunModel[201].addShapeBox(0F, 0F, 0F, 63, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		gunModel[201].setRotationPoint(147F, -160F, -8F);

		gunModel[202].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 308
		gunModel[202].setRotationPoint(147F, -158F, -8F);

		gunModel[203].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		gunModel[203].setRotationPoint(171F, -158F, -8F);

		gunModel[204].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 311
		gunModel[204].setRotationPoint(165F, -158F, -8F);

		gunModel[205].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 312
		gunModel[205].setRotationPoint(159F, -158F, -8F);

		gunModel[206].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 313
		gunModel[206].setRotationPoint(153F, -158F, -8F);

		gunModel[207].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 316
		gunModel[207].setRotationPoint(207F, -158F, -8F);

		gunModel[208].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 317
		gunModel[208].setRotationPoint(201F, -158F, -8F);

		gunModel[209].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 318
		gunModel[209].setRotationPoint(195F, -158F, -8F);

		gunModel[210].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 319
		gunModel[210].setRotationPoint(189F, -158F, -8F);

		gunModel[211].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 320
		gunModel[211].setRotationPoint(183F, -158F, -8F);

		gunModel[212].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 321
		gunModel[212].setRotationPoint(177F, -158F, -8F);

		gunModel[213].addShapeBox(0F, 0F, 1F, 266, 19, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		gunModel[213].setRotationPoint(-255F, -173F, -15F);

		gunModel[214].addShapeBox(0F, 0F, 1F, 289, 4, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 326
		gunModel[214].setRotationPoint(-285F, -192F, -20F);

		gunModel[215].addShapeBox(0F, 0F, 1F, 289, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		gunModel[215].setRotationPoint(-285F, -183F, -20F);

		gunModel[216].addShapeBox(0F, 0F, 1F, 8, 23, 5, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		gunModel[216].setRotationPoint(-263F, -221F, -17F);

		gunModel[217].addShapeBox(0F, 0F, 1F, 8, 16, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		gunModel[217].setRotationPoint(-255F, -214F, -17F);

		gunModel[218].addShapeBox(0F, 0F, 1F, 8, 13, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		gunModel[218].setRotationPoint(-247F, -211F, -17F);

		gunModel[219].addShapeBox(0F, 0F, 1F, 8, 11, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		gunModel[219].setRotationPoint(-239F, -209F, -17F);

		gunModel[220].addShapeBox(0F, 0F, 1F, 8, 10, 5, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		gunModel[220].setRotationPoint(-231F, -208F, -17F);

		gunModel[221].addShapeBox(0F, 0F, 1F, 8, 9, 5, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		gunModel[221].setRotationPoint(-223F, -207F, -17F);

		gunModel[222].addShapeBox(0F, 0F, 1F, 8, 8, 5, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		gunModel[222].setRotationPoint(-215F, -206F, -17F);

		gunModel[223].addShapeBox(0F, 0F, 1F, 185, 7, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		gunModel[223].setRotationPoint(-207F, -205F, -17F);

		gunModel[224].addShapeBox(0F, 0F, 1F, 28, 7, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		gunModel[224].setRotationPoint(-126F, -197F, -20F);

		gunModel[225].addShapeBox(0F, 0F, 1F, 43, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 343
		gunModel[225].setRotationPoint(-252F, -157F, -12F);

		gunModel[226].addShapeBox(0F, 0F, 1F, 37, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		gunModel[226].setRotationPoint(-249F, -153F, -12F);

		gunModel[227].addShapeBox(0F, 0F, 1F, 37, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 345
		gunModel[227].setRotationPoint(-249F, -143F, -12F);

		gunModel[228].addShapeBox(0F, 0F, 1F, 43, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 346
		gunModel[228].setRotationPoint(-252F, -157F, 7F);

		gunModel[229].addShapeBox(0F, 0F, 1F, 37, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		gunModel[229].setRotationPoint(-249F, -153F, 7F);

		gunModel[230].addShapeBox(0F, 0F, 1F, 37, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 348
		gunModel[230].setRotationPoint(-249F, -143F, 7F);

		gunModel[231].addShapeBox(0F, 0F, 1F, 174, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		gunModel[231].setRotationPoint(-263F, -216F, -14F);

		gunModel[232].addShapeBox(0F, 0F, 1F, 266, 11, 5, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 358
		gunModel[232].setRotationPoint(-255F, -179F, 10F);

		gunModel[233].addShapeBox(0F, 0F, 1F, 35, 25, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 359
		gunModel[233].setRotationPoint(-285F, -179F, 10F);

		gunModel[234].addShapeBox(0F, 0F, 1F, 185, 7, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		gunModel[234].setRotationPoint(-207F, -205F, 10F);

		gunModel[235].addShapeBox(0F, 0F, 1F, 8, 8, 5, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		gunModel[235].setRotationPoint(-215F, -206F, 10F);

		gunModel[236].addShapeBox(0F, 0F, 1F, 8, 9, 5, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		gunModel[236].setRotationPoint(-223F, -207F, 10F);

		gunModel[237].addShapeBox(0F, 0F, 1F, 8, 10, 5, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		gunModel[237].setRotationPoint(-231F, -208F, 10F);

		gunModel[238].addShapeBox(0F, 0F, 1F, 8, 11, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		gunModel[238].setRotationPoint(-239F, -209F, 10F);

		gunModel[239].addShapeBox(0F, 0F, 1F, 8, 13, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		gunModel[239].setRotationPoint(-247F, -211F, 10F);

		gunModel[240].addShapeBox(0F, 0F, 1F, 8, 23, 5, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		gunModel[240].setRotationPoint(-263F, -221F, 10F);

		gunModel[241].addShapeBox(0F, 0F, 1F, 8, 16, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		gunModel[241].setRotationPoint(-255F, -214F, 10F);

		gunModel[242].addShapeBox(0F, 0F, 1F, 22, 23, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		gunModel[242].setRotationPoint(-285F, -221F, 10F);

		gunModel[243].addShapeBox(0F, 0F, 1F, 174, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		gunModel[243].setRotationPoint(-263F, -216F, 10F);

		gunModel[244].addShapeBox(0F, 0F, 1F, 7, 35, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		gunModel[244].setRotationPoint(11F, -192F, -17F);

		gunModel[245].addShapeBox(0F, 0F, 1F, 38, 31, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		gunModel[245].setRotationPoint(-22F, -231F, -15F);

		gunModel[246].addShapeBox(0F, 0F, 1F, 67, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		gunModel[246].setRotationPoint(-89F, -211F, -14F);

		gunModel[247].addShapeBox(0F, 0F, 1F, 56, 18, 32, 0F,0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		gunModel[247].setRotationPoint(-22F, -210F, -17F);

		gunModel[248].addShapeBox(0F, 0F, 1F, 36, 4, 32, 0F,-9F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -9F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		gunModel[248].setRotationPoint(-299F, -225F, -17F);

		gunModel[249].addShapeBox(0F, 0F, 1F, 37, 5, 12, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		gunModel[249].setRotationPoint(-10F, -238F, -7F);

		gunModel[250].addShapeBox(0F, 0F, 1F, 8, 7, 24, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		gunModel[250].setRotationPoint(-10F, -238F, -13F);

		gunModel[251].addShapeBox(0F, 0F, 0F, 384, 8, 11, 0F,0F, -0.6F, -7.4F, 0F, -0.6F, -7.4F, 0F, -3.95F, -1.35F, 0F, -3.95F, -1.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 401
		gunModel[251].setRotationPoint(-21F, -210F, 0F);

		gunModel[252].addShapeBox(0F, 0F, 0F, 384, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.6F, -7.4F, 0F, -0.6F, -7.4F, 0F, -3.95F, -1.35F, 0F, -3.95F, -1.35F); // Box 402
		gunModel[252].setRotationPoint(-21F, -202F, 0F);

		gunModel[253].addShapeBox(0F, 0F, 0F, 384, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.4F, -0.6F, 0F, -7.4F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.35F, -3.95F, 0F, -1.35F, -3.95F); // Box 403
		gunModel[253].setRotationPoint(-21F, -202F, 0F);

		gunModel[254].addShapeBox(0F, 0F, 0F, 384, 11, 8, 0F,0F, -7.4F, -0.6F, 0F, -7.4F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, -3.95F, 0F, -1.35F, -3.95F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 404
		gunModel[254].setRotationPoint(-21F, -202F, -8F);

		gunModel[255].addShapeBox(0F, 0F, 0F, 384, 8, 11, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.95F, -1.35F, 0F, -3.95F, -1.35F, 0F, -0.6F, -7.4F, 0F, -0.6F, -7.4F); // Box 405
		gunModel[255].setRotationPoint(-21F, -202F, -11F);

		gunModel[256].addShapeBox(0F, 0F, 0F, 384, 8, 11, 0F,0F, -3.95F, -1.35F, 0F, -3.95F, -1.35F, 0F, -0.6F, -7.4F, 0F, -0.6F, -7.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		gunModel[256].setRotationPoint(-21F, -210F, -11F);

		gunModel[257].addShapeBox(0F, 0F, 0F, 384, 11, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.35F, -3.95F, 0F, -1.35F, -3.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.4F, -0.6F, 0F, -7.4F, -0.6F); // Box 407
		gunModel[257].setRotationPoint(-21F, -213F, 0F);

		gunModel[258].addShapeBox(0F, 0F, 0F, 384, 11, 8, 0F,0F, -1.35F, -3.95F, 0F, -1.35F, -3.95F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -7.4F, -0.6F, 0F, -7.4F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		gunModel[258].setRotationPoint(-21F, -213F, -8F);

		gunModel[259].addShapeBox(0F, 0F, 0F, 3, 6, 16, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		gunModel[259].setRotationPoint(215F, -194F, -8F);

		gunModel[260].addShapeBox(0F, 0F, 0F, 3, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 410
		gunModel[260].setRotationPoint(215F, -188F, -8F);

		gunModel[261].addShapeBox(0F, 0F, 0F, 8, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		gunModel[261].setRotationPoint(260F, -189F, 4F);
		gunModel[261].rotateAngleY = -1.57079633F;

		gunModel[262].addShapeBox(0F, 0F, 0F, 12, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 412
		gunModel[262].setRotationPoint(258F, -194F, 6F);
		gunModel[262].rotateAngleY = -1.57079633F;

		gunModel[263].addShapeBox(0F, 0F, 1F, 18, 9, 26, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		gunModel[263].setRotationPoint(-263F, -225F, -14F);

		gunModel[264].addShapeBox(0F, 0F, 1F, 4, 21, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		gunModel[264].setRotationPoint(2F, -158F, -16F);

		gunModel[265].addShapeBox(0F, 0F, 1F, 10, 16, 4, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		gunModel[265].setRotationPoint(-4F, -169F, 14F);

		gunModel[266].addShapeBox(0F, 0F, 1F, 26, 7, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		gunModel[266].setRotationPoint(-189F, -125F, -13F);

		gunModel[267].addShapeBox(0F, 0F, 1F, 26, 60, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 34F, 0F, 0F, -34F, 0F, 0F, -34F, 0F, 0F, 34F, 0F, 0F); // Box 367
		gunModel[267].setRotationPoint(-189F, -118F, -13F);

		gunModel[268].addShapeBox(0F, 0F, 1F, 9, 60, 24, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 34F, -3F, -2F, -34F, 0F, 0F, -34F, 0F, 0F, 34F, -3F, -2F); // Box 368
		gunModel[268].setRotationPoint(-198F, -118F, -13F);

		gunModel[269].addShapeBox(0F, 0F, 1F, 8, 60, 24, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 34F, 0F, 0F, -30F, 0F, -2F, -30F, 0F, -2F, 34F, 0F, 0F); // Box 369
		gunModel[269].setRotationPoint(-163F, -118F, -13F);

		gunModel[270].addShapeBox(0F, 0F, 1F, 9, 7, 24, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 370
		gunModel[270].setRotationPoint(-198F, -125F, -13F);

		gunModel[271].addShapeBox(0F, 0F, 1F, 8, 7, 24, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 371
		gunModel[271].setRotationPoint(-163F, -125F, -13F);

		gunModel[272].addShapeBox(0F, 0F, 1F, 26, 7, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		gunModel[272].setRotationPoint(-189F, -132F, -13F);

		gunModel[273].addShapeBox(0F, 0F, 1F, 9, 7, 24, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 373
		gunModel[273].setRotationPoint(-198F, -132F, -13F);

		gunModel[274].addShapeBox(0F, 0F, 1F, 8, 7, 24, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 374
		gunModel[274].setRotationPoint(-163F, -132F, -13F);

		gunModel[275].addShapeBox(0F, 0F, 1F, 42, 8, 24, 0F,-38F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -38F, 0F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -8F, 0F); // Box 375
		gunModel[275].setRotationPoint(-223F, -58F, -13F);

		gunModel[276].addShapeBox(0F, 0F, 1F, 48, 22, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		gunModel[276].setRotationPoint(-207F, -154F, -11F);

		gunModel[277].addShapeBox(0F, 0F, 1F, 32, 21, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		gunModel[277].setRotationPoint(-136F, -154F, -11F);

		gunModel[278].addShapeBox(0F, 0F, 1F, 23, 32, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F); // Box 378
		gunModel[278].setRotationPoint(-159F, -154F, -11F);

		gunModel[279].addShapeBox(0F, 0F, 1F, 4, 17, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		gunModel[279].setRotationPoint(-108F, -133F, -8F);

		gunModel[280].addShapeBox(0F, 0F, 1F, 32, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		gunModel[280].setRotationPoint(-149F, -107F, -8F);

		gunModel[281].addShapeBox(0F, 0F, 1F, 13, 4, 14, 0F,0F, 0F, 0F, -4F, 9F, 0F, -4F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F); // Box 381
		gunModel[281].setRotationPoint(-117F, -107F, -8F);

		gunModel[282].addShapeBox(0F, 0F, 1F, 19, 4, 14, 0F,0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 382
		gunModel[282].setRotationPoint(-168F, -107F, -8F);

		gunModel[283].addShapeBox(0F, 0F, 1F, 20, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 383
		gunModel[283].setRotationPoint(-227F, -134F, -11F);

		gunModel[284].addShapeBox(0F, 0F, 1F, 20, 20, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		gunModel[284].setRotationPoint(-227F, -154F, -10F);

		gunModel[285].addShapeBox(0F, 0F, 1F, 4, 20, 18, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 385
		gunModel[285].setRotationPoint(-231F, -154F, -10F);

		gunModel[286].addShapeBox(0F, 0F, 1F, 11, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F); // Box 386
		gunModel[286].setRotationPoint(-141F, -112F, -5F);

		gunModel[287].addShapeBox(0F, 0F, 1F, 14, 3, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 387
		gunModel[287].setRotationPoint(-146F, -115F, -5F);

		gunModel[288].addShapeBox(0F, 0F, 1F, 16, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F); // Box 388
		gunModel[288].setRotationPoint(-150F, -118F, -5F);

		gunModel[289].addShapeBox(0F, 0F, 1F, 18, 3, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F); // Box 389
		gunModel[289].setRotationPoint(-153F, -121F, -5F);

		gunModel[290].addShapeBox(0F, 0F, 1F, 20, 3, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 390
		gunModel[290].setRotationPoint(-155F, -124F, -5F);

		gunModel[291].addShapeBox(0F, 0F, 1F, 23, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F); // Box 391
		gunModel[291].setRotationPoint(-155F, -127F, -5F);

		gunModel[292].addShapeBox(0F, 0F, 1F, 26, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 392
		gunModel[292].setRotationPoint(-150F, -130F, -5F);

		gunModel[293].addShapeBox(0F, 0F, 1F, 32, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 393
		gunModel[293].setRotationPoint(-145F, -133F, -5F);

		gunModel[294].addShapeBox(0F, 0F, 1F, 3, 4, 2, 0F,0F, -2F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		gunModel[294].setRotationPoint(-279F, -229F, 11F);

		gunModel[295].addShapeBox(0F, 0F, 1F, 3, 4, 2, 0F,2F, -3F, -0.5F, -5F, -0.5F, -1F, -5F, -0.5F, 1F, 2F, -3F, 0.5F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 437
		gunModel[295].setRotationPoint(-279F, -231F, 12F);

		gunModel[296].addShapeBox(0F, 0F, 1F, 3, 4, 2, 0F,-5F, -0.5F, -1F, 2F, -3F, -0.5F, 2F, -3F, 0.5F, -5F, -0.5F, 1F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 439
		gunModel[296].setRotationPoint(-286F, -231F, 12F);

		gunModel[297].addShapeBox(0F, 0F, 1F, 3, 4, 2, 0F,-0.5F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		gunModel[297].setRotationPoint(-286F, -229F, 11F);

		gunModel[298].addShapeBox(0F, 0F, 1F, 3, 4, 2, 0F,2F, -3F, 0.5F, -5F, -0.5F, 1F, -5F, -0.5F, -1F, 2F, -3F, -0.5F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 441
		gunModel[298].setRotationPoint(-279F, -231F, -16F);

		gunModel[299].addShapeBox(0F, 0F, 1F, 3, 4, 2, 0F,-5F, -0.5F, 1F, 2F, -3F, 0.5F, 2F, -3F, -0.5F, -5F, -0.5F, -1F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 442
		gunModel[299].setRotationPoint(-286F, -231F, -16F);

		gunModel[300].addShapeBox(0F, 0F, 1F, 3, 4, 2, 0F,-0.5F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		gunModel[300].setRotationPoint(-286F, -229F, -15F);

		gunModel[301].addShapeBox(0F, 0F, 1F, 3, 4, 2, 0F,0F, -2F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		gunModel[301].setRotationPoint(-279F, -229F, -15F);

		gunModel[302].addShapeBox(0F, 0F, 1F, 30, 25, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		gunModel[302].setRotationPoint(-285F, -179F, -12F);

		gunModel[303].addShapeBox(-12F, 3F, -14F, 8, 87, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		gunModel[303].setRotationPoint(-458F, -222F, -1F);
		gunModel[303].rotateAngleZ = 0.08726646F;

		gunModel[304].addShapeBox(-12F, 0F, -14F, 8, 4, 30, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		gunModel[304].setRotationPoint(-458F, -223F, -1F);
		gunModel[304].rotateAngleZ = 0.08726646F;

		gunModel[305].addShapeBox(-12F, 90F, -14F, 8, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, -2F, -3F); // Box 457
		gunModel[305].setRotationPoint(-458F, -222F, -1F);
		gunModel[305].rotateAngleZ = 0.08726646F;

		gunModel[306].addShapeBox(9F, 0F, 0F, 41, 4, 5, 0F,0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		gunModel[306].setRotationPoint(-107F, -149F, -29F);
		gunModel[306].rotateAngleY = 1.57079633F;

		gunModel[307].addShapeBox(9F, 0F, 0F, 41, 5, 4, 0F,0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		gunModel[307].setRotationPoint(-108F, -150F, -29F);
		gunModel[307].rotateAngleY = 1.57079633F;

		gunModel[308].addShapeBox(9F, 0F, 0F, 41, 5, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F); // Box 478
		gunModel[308].setRotationPoint(-112F, -150F, -29F);
		gunModel[308].rotateAngleY = 1.57079633F;

		gunModel[309].addShapeBox(9F, 0F, 0F, 41, 4, 5, 0F,0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 479
		gunModel[309].setRotationPoint(-112F, -149F, -29F);
		gunModel[309].rotateAngleY = 1.57079633F;

		gunModel[310].addShapeBox(9F, 0F, 0F, 41, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F); // Box 480
		gunModel[310].setRotationPoint(-112F, -145F, -29F);
		gunModel[310].rotateAngleY = 1.57079633F;

		gunModel[311].addShapeBox(9F, 0F, 0F, 41, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F); // Box 481
		gunModel[311].setRotationPoint(-112F, -145F, -29F);
		gunModel[311].rotateAngleY = 1.57079633F;

		gunModel[312].addShapeBox(9F, 0F, 0F, 41, 5, 4, 0F,0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 482
		gunModel[312].setRotationPoint(-108F, -145F, -29F);
		gunModel[312].rotateAngleY = 1.57079633F;

		gunModel[313].addShapeBox(9F, 0F, 0F, 41, 4, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F); // Box 483
		gunModel[313].setRotationPoint(-107F, -145F, -29F);
		gunModel[313].rotateAngleY = 1.57079633F;

		gunModel[314].addShapeBox(0F, 0F, 0F, 26, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.525F, -2.475F, 0F, -0.525F, -2.475F, 0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F); // Box 24
		gunModel[314].setRotationPoint(-222F, -145F, -13F);
		gunModel[314].rotateAngleY = 1.57079633F;

		gunModel[315].addShapeBox(0F, 0F, 0F, 26, 3, 4, 0F,0F, -0.525F, -2.475F, 0F, -0.525F, -2.475F, 0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 25
		gunModel[315].setRotationPoint(-222F, -148F, -13F);
		gunModel[315].rotateAngleY = 1.57079633F;

		gunModel[316].addShapeBox(0F, 0F, 0F, 26, 4, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.475F, -0.525F, 0F, -2.475F, -0.525F); // Box 26
		gunModel[316].setRotationPoint(-222F, -149F, -13F);
		gunModel[316].rotateAngleY = 1.57079633F;

		gunModel[317].addShapeBox(0F, 0F, 0F, 26, 3, 4, 0F,0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, -0.525F, -2.475F, 0F, -0.525F, -2.475F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[317].setRotationPoint(-218F, -148F, -13F);
		gunModel[317].rotateAngleY = 1.57079633F;

		gunModel[318].addShapeBox(0F, 0F, 0F, 26, 4, 3, 0F,0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.475F, -0.525F, 0F, -2.475F, -0.525F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[318].setRotationPoint(-219F, -149F, -13F);
		gunModel[318].rotateAngleY = 1.57079633F;

		gunModel[319].addShapeBox(0F, 0F, 0F, 26, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, -0.525F, -2.475F, 0F, -0.525F, -2.475F); // Box 29
		gunModel[319].setRotationPoint(-218F, -145F, -13F);
		gunModel[319].rotateAngleY = 1.57079633F;

		gunModel[320].addShapeBox(0F, 0F, 0F, 26, 4, 3, 0F,0F, -2.475F, -0.525F, 0F, -2.475F, -0.525F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 30
		gunModel[320].setRotationPoint(-219F, -145F, -13F);
		gunModel[320].rotateAngleY = 1.57079633F;

		gunModel[321].addShapeBox(0F, 0F, 0F, 26, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.475F, -0.525F, 0F, -2.475F, -0.525F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F); // Box 31
		gunModel[321].setRotationPoint(-222F, -145F, -13F);
		gunModel[321].rotateAngleY = 1.57079633F;

		gunModel[322].addShapeBox(0F, 0F, 0F, 30, 4, 3, 0F,0F, -2.475F, -0.525F, 0F, -2.475F, -0.525F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 474
		gunModel[322].setRotationPoint(-238F, -145F, -15F);
		gunModel[322].rotateAngleY = 1.57079633F;

		gunModel[323].addShapeBox(0F, 0F, 0F, 30, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.475F, -0.525F, 0F, -2.475F, -0.525F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F); // Box 475
		gunModel[323].setRotationPoint(-241F, -145F, -15F);
		gunModel[323].rotateAngleY = 1.57079633F;

		gunModel[324].addShapeBox(0F, 0F, 0F, 30, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.525F, -2.475F, 0F, -0.525F, -2.475F, 0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F); // Box 476
		gunModel[324].setRotationPoint(-241F, -145F, -15F);
		gunModel[324].rotateAngleY = 1.57079633F;

		gunModel[325].addShapeBox(0F, 0F, 0F, 30, 3, 4, 0F,0F, -0.525F, -2.475F, 0F, -0.525F, -2.475F, 0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 477
		gunModel[325].setRotationPoint(-241F, -148F, -15F);
		gunModel[325].rotateAngleY = 1.57079633F;

		gunModel[326].addShapeBox(0F, 0F, 0F, 30, 4, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.475F, -0.525F, 0F, -2.475F, -0.525F); // Box 478
		gunModel[326].setRotationPoint(-241F, -149F, -15F);
		gunModel[326].rotateAngleY = 1.57079633F;

		gunModel[327].addShapeBox(0F, 0F, 0F, 30, 4, 3, 0F,0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.475F, -0.525F, 0F, -2.475F, -0.525F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		gunModel[327].setRotationPoint(-238F, -149F, -15F);
		gunModel[327].rotateAngleY = 1.57079633F;

		gunModel[328].addShapeBox(0F, 0F, 0F, 30, 3, 4, 0F,0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, -0.525F, -2.475F, 0F, -0.525F, -2.475F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		gunModel[328].setRotationPoint(-237F, -148F, -15F);
		gunModel[328].rotateAngleY = 1.57079633F;

		gunModel[329].addShapeBox(0F, 0F, 0F, 30, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, -0.525F, -2.475F, 0F, -0.525F, -2.475F); // Box 481
		gunModel[329].setRotationPoint(-237F, -145F, -15F);
		gunModel[329].rotateAngleY = 1.57079633F;

		gunModel[330].addShapeBox(0F, 0F, 0F, 8, 11, 8, 0F,11F, -1.35F, -3.95F, 0F, -1.35F, -3.95F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 11F, -5.95F, -5.5F, 0F, -5.95F, -5.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 482
		gunModel[330].setRotationPoint(405F, -213F, -8F);

		gunModel[331].addShapeBox(0F, 0F, 0F, 8, 11, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.35F, -3.95F, 11F, -1.35F, -3.95F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -5.95F, -5.5F, 11F, -5.95F, -5.5F); // Box 483
		gunModel[331].setRotationPoint(405F, -213F, 0F);

		gunModel[332].addShapeBox(0F, 0F, 0F, 8, 11, 8, 0F,0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -5.95F, -5.5F, 11F, -5.95F, -5.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.35F, -3.95F, 11F, -1.35F, -3.95F); // Box 484
		gunModel[332].setRotationPoint(405F, -202F, 0F);

		gunModel[333].addShapeBox(0F, 0F, 0F, 8, 11, 8, 0F,11F, -5.95F, -5.5F, 0F, -5.95F, -5.5F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 11F, -1.35F, -3.95F, 0F, -1.35F, -3.95F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 485
		gunModel[333].setRotationPoint(405F, -202F, -8F);

		gunModel[334].addShapeBox(0F, 0F, 0F, 13, 11, 8, 0F,0F, -6.5F, 0F, -6F, -6.5F, 0F, 11F, -5.95F, -5.5F, 0F, -5.95F, -5.5F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, 11F, -1.35F, -3.95F, 0F, -1.35F, -3.95F); // Box 486
		gunModel[334].setRotationPoint(370F, -202F, 0F);

		gunModel[335].addShapeBox(0F, 0F, 0F, 13, 11, 8, 0F,0F, -5.95F, -5.5F, 11F, -5.95F, -5.5F, -6F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -1.35F, -3.95F, 11F, -1.35F, -3.95F, -6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 487
		gunModel[335].setRotationPoint(370F, -202F, -8F);

		gunModel[336].addShapeBox(0F, 0F, 0F, 13, 8, 11, 0F,0F, -3.95F, -1.35F, 11F, -3.95F, -1.35F, 11F, -5.5F, -5.95F, 0F, -5.5F, -5.95F, 0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -6.5F, 0F, 0F, -6.5F); // Box 488
		gunModel[336].setRotationPoint(370F, -210F, -11F);

		gunModel[337].addShapeBox(0F, 0F, 0F, 4, 8, 11, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 11F, -3.95F, -1.35F, 0F, -3.95F, -1.35F, 0F, -5.5F, -5.95F, 11F, -5.5F, -5.95F); // Box 489
		gunModel[337].setRotationPoint(405F, -202F, -11F);

		gunModel[338].addShapeBox(0F, 0F, 0F, 4, 8, 11, 0F,0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 11F, -5.5F, -5.95F, 0F, -5.5F, -5.95F, 0F, -3.95F, -1.35F, 11F, -3.95F, -1.35F); // Box 490
		gunModel[338].setRotationPoint(405F, -202F, 0F);

		gunModel[339].addShapeBox(0F, 0F, 0F, 4, 8, 11, 0F,11F, -5.5F, -5.95F, 0F, -5.5F, -5.95F, 0F, -3.95F, -1.35F, 11F, -3.95F, -1.35F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 491
		gunModel[339].setRotationPoint(405F, -210F, 0F);

		gunModel[340].addShapeBox(0F, 0F, 0F, 13, 8, 11, 0F,0F, -5.5F, -5.95F, 11F, -5.5F, -5.95F, 11F, -3.95F, -1.35F, 0F, -3.95F, -1.35F, 0F, 0F, -6.5F, -6F, 0F, -6.5F, -6F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		gunModel[340].setRotationPoint(370F, -210F, 0F);

		gunModel[341].addShapeBox(0F, 0F, 0F, 13, 8, 11, 0F,0F, 0F, -6.5F, -6F, 0F, -6.5F, -6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -5.5F, -5.95F, 11F, -5.5F, -5.95F, 11F, -3.95F, -1.35F, 0F, -3.95F, -1.35F); // Box 493
		gunModel[341].setRotationPoint(370F, -202F, 0F);

		gunModel[342].addShapeBox(0F, 0F, 1F, 119, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		gunModel[342].setRotationPoint(-113F, -153F, 14F);

		gunModel[343].addShapeBox(0F, 0F, 1F, 4, 16, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 495
		gunModel[343].setRotationPoint(-117F, -153F, 14F);

		gunModel[344].addShapeBox(0F, 0F, 1F, 4, 14, 4, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 496
		gunModel[344].setRotationPoint(-121F, -152F, 14F);

		gunModel[345].addShapeBox(0F, 0F, 1F, 9, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.35F, -0.65F, 0F, -0.7F, -3.55F, 0F, -0.7F, -3.55F, 0F, -6.35F, -0.65F, 0F); // Box 497
		gunModel[345].setRotationPoint(-112F, -145F, 19F);

		gunModel[346].addShapeBox(0F, 0F, 1F, 7, 9, 3, 0F,0F, 0F, 0F, -0.65F, -6.35F, 0F, -0.65F, -6.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -0.7F, 0F, -3.55F, -0.7F, 0F, 0F, 0F, 0F); // Box 498
		gunModel[346].setRotationPoint(-112F, -145F, 19F);

		gunModel[347].addShapeBox(0F, 0F, 1F, 7, 9, 3, 0F,-0.65F, -6.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -6.35F, 0F, -3.55F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -0.7F, 0F); // Box 499
		gunModel[347].setRotationPoint(-119F, -145F, 19F);

		gunModel[348].addShapeBox(0F, 0F, 1F, 9, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -3.55F, 0F, -6.35F, -0.65F, 0F, -6.35F, -0.65F, 0F, -0.7F, -3.55F, 0F); // Box 500
		gunModel[348].setRotationPoint(-121F, -145F, 19F);

		gunModel[349].addShapeBox(0F, 0F, 1F, 9, 7, 3, 0F,-0.7F, -3.55F, 0F, -6.35F, -0.65F, 0F, -6.35F, -0.65F, 0F, -0.7F, -3.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		gunModel[349].setRotationPoint(-121F, -152F, 19F);

		gunModel[350].addShapeBox(0F, 0F, 1F, 7, 9, 3, 0F,-3.55F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -0.7F, 0F, -0.65F, -6.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -6.35F, 0F); // Box 502
		gunModel[350].setRotationPoint(-119F, -154F, 19F);

		gunModel[351].addShapeBox(0F, 0F, 1F, 7, 9, 3, 0F,0F, 0F, 0F, -3.55F, -0.7F, 0F, -3.55F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -6.35F, 0F, -0.65F, -6.35F, 0F, 0F, 0F, 0F); // Box 503
		gunModel[351].setRotationPoint(-112F, -154F, 19F);

		gunModel[352].addShapeBox(0F, 0F, 1F, 9, 7, 3, 0F,-6.35F, -0.65F, 0F, -0.7F, -3.55F, 0F, -0.7F, -3.55F, 0F, -6.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		gunModel[352].setRotationPoint(-112F, -152F, 19F);

		gunModel[353].addShapeBox(0F, 0F, 1F, 18, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		gunModel[353].setRotationPoint(-121F, -157F, -14F);

		gunModel[354].addShapeBox(0F, 0F, 1F, 18, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 506
		gunModel[354].setRotationPoint(-121F, -142F, -14F);

		gunModel[355].addShapeBox(0F, 0F, 1F, 18, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		gunModel[355].setRotationPoint(-121F, -157F, 9F);

		gunModel[356].addShapeBox(0F, 0F, 1F, 18, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 508
		gunModel[356].setRotationPoint(-121F, -142F, 9F);

		gunModel[357].addShapeBox(0F, 0F, 1F, 13, 5, 5, 0F,-1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 509
		gunModel[357].setRotationPoint(-9F, -188F, -22F);

		gunModel[358].addShapeBox(0F, 0F, 0F, 15, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		gunModel[358].setRotationPoint(254F, -225F, -3F);

		gunModel[359].addShapeBox(0F, 0F, 0F, 4, 16, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		gunModel[359].setRotationPoint(250F, -225F, -3F);

		gunModel[360].addShapeBox(0F, 0F, 0F, 10, 42, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		gunModel[360].setRotationPoint(259F, -251F, 3F);

		gunModel[361].addShapeBox(0F, 0F, 0F, 10, 10, 3, 0F,-3F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		gunModel[361].setRotationPoint(259F, -270F, 4F);

		gunModel[362].addShapeBox(0F, 0F, 0F, 10, 10, 3, 0F,-3F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		gunModel[362].setRotationPoint(259F, -270F, -7F);

		gunModel[363].addShapeBox(0F, 0F, 0F, 10, 42, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		gunModel[363].setRotationPoint(259F, -251F, -6F);

		gunModel[364].addShapeBox(0F, 0F, 0F, 4, 25, 12, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 517
		gunModel[364].setRotationPoint(255F, -251F, -6F);

		gunModel[365].addShapeBox(0F, 0F, 0F, 4, 13, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 518
		gunModel[365].setRotationPoint(255F, -222F, -6F);

		gunModel[366].addShapeBox(0F, 0F, 0F, 4, 13, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 519
		gunModel[366].setRotationPoint(255F, -222F, 3F);

		gunModel[367].addShapeBox(0F, 0F, 0F, 10, 9, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		gunModel[367].setRotationPoint(259F, -260F, -6F);

		gunModel[368].addShapeBox(0F, 0F, 0F, 10, 9, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		gunModel[368].setRotationPoint(259F, -260F, 3F);

		gunModel[369].addShapeBox(0F, 0F, 0F, 10, 25, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		gunModel[369].setRotationPoint(259F, -251F, -3F);

		gunModel[370].addShapeBox(0F, 0F, 0F, 6, 9, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		gunModel[370].setRotationPoint(261F, -260F, -2F);

		gunModel[371].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		gunModel[371].setRotationPoint(-8F, -234F, 0F);

		gunModel[372].addShapeBox(0F, 0F, 1F, 67, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		gunModel[372].setRotationPoint(-89F, -211F, 10F);

		gunModel[373].addShapeBox(0F, 0F, 1F, 2, 16, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		gunModel[373].setRotationPoint(-24F, -226F, -13F);

		gunModel[374].addShapeBox(0F, 0F, 1F, 2, 14, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		gunModel[374].setRotationPoint(-91F, -224F, -13F);

		gunModel[375].addShapeBox(0F, 0F, 1F, 69, 2, 34, 0F,0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, 0F, 0F, 0F, 0F); // Box 563
		gunModel[375].setRotationPoint(-91F, -212F, -14F);

		gunModel[376].addShapeBox(0F, 0F, 1F, 2, 23, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 564
		gunModel[376].setRotationPoint(-24F, -226F, 20F);

		gunModel[377].addShapeBox(0F, 0F, 1F, 2, 23, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 565
		gunModel[377].setRotationPoint(-22F, -226F, 24F);

		gunModel[378].addShapeBox(0F, 0F, 1F, 2, 23, 4, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		gunModel[378].setRotationPoint(-97F, -226F, 24F);

		gunModel[379].addShapeBox(0F, 0F, 1F, 2, 23, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, 2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		gunModel[379].setRotationPoint(-93F, -226F, 20F);

		gunModel[380].addShapeBox(0F, 0F, 1F, 69, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 568
		gunModel[380].setRotationPoint(-91F, -212F, 20F);

		gunModel[381].addShapeBox(0F, 0F, 1F, 77, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 569
		gunModel[381].setRotationPoint(-95F, -210F, 24F);

		gunModel[382].addShapeBox(0F, 0F, 1F, 77, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
		gunModel[382].setRotationPoint(-95F, -206F, 26F);

		gunModel[383].addShapeBox(0F, 0F, 1F, 77, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 571
		gunModel[383].setRotationPoint(-95F, -196F, 20F);

		gunModel[384].addShapeBox(0F, 0F, 1F, 77, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 572
		gunModel[384].setRotationPoint(-95F, -198F, 24F);

		gunModel[385].addShapeBox(0F, 0F, 1F, 84, 16, 2, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		gunModel[385].setRotationPoint(-94F, -169F, 14F);

		gunModel[386].addShapeBox(0F, -2F, 0F, 15, 8, 36, 0F,-4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 821
		gunModel[386].setRotationPoint(-284F, -216F, -18F);

		gunModel[387].addShapeBox(0F, -2F, 0F, 15, 8, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F); // Box 822
		gunModel[387].setRotationPoint(-284F, -208F, -18F);

		gunModel[388].addShapeBox(0F, -2F, 0F, 15, 8, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F); // Box 823
		gunModel[388].setRotationPoint(-284F, -164F, -18F);

		gunModel[389].addShapeBox(0F, -2F, 0F, 15, 8, 36, 0F,-4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 824
		gunModel[389].setRotationPoint(-284F, -172F, -18F);

		gunModel[390].addShapeBox(0F, 0F, 1F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 825
		gunModel[390].setRotationPoint(-163F, -204F, 15F);

		gunModel[391].addShapeBox(0F, 0F, 1F, 4, 4, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 826
		gunModel[391].setRotationPoint(1F, -165F, -22F);

		gunModel[392].addShapeBox(0F, 0F, 1F, 3, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.05F, -3F, 0F, -0.05F); // Box 832
		gunModel[392].setRotationPoint(250F, -173F, 11F);
		gunModel[392].rotateAngleY = -1.57079633F;

		gunModel[393].addShapeBox(0F, 0F, 1F, 3, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.05F, 3F, 0F, -0.05F); // Box 833
		gunModel[393].setRotationPoint(250F, -173F, -8F);
		gunModel[393].rotateAngleY = -1.57079633F;

		gunModel[394].addShapeBox(0F, 0F, 1F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 834
		gunModel[394].setRotationPoint(237F, -175F, 13F);
		gunModel[394].rotateAngleY = -1.57079633F;

		gunModel[395].addShapeBox(0F, 0F, 1F, 5, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 835
		gunModel[395].setRotationPoint(237F, -166F, 10F);
		gunModel[395].rotateAngleY = -1.57079633F;

		gunModel[396].addShapeBox(0F, 0F, 1F, 5, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 836
		gunModel[396].setRotationPoint(237F, -166F, -5F);
		gunModel[396].rotateAngleY = -1.57079633F;

		gunModel[397].addShapeBox(0F, 0F, 1F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 837
		gunModel[397].setRotationPoint(237F, -175F, -9F);
		gunModel[397].rotateAngleY = -1.57079633F;

		gunModel[398].addShapeBox(0F, 0F, 0F, 8, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 878
		gunModel[398].setRotationPoint(41F, -220F, -10F);

		gunModel[399].addShapeBox(0F, 0F, 0F, 2, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		gunModel[399].setRotationPoint(49F, -220F, -13F);

		gunModel[400].addShapeBox(0F, 0F, 0F, 2, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 880
		gunModel[400].setRotationPoint(39F, -220F, -13F);

		gunModel[401].addShapeBox(0F, 0F, 0F, 2, 7, 12, 0F,0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 881
		gunModel[401].setRotationPoint(49F, -220F, -22F);

		gunModel[402].addShapeBox(0F, 0F, 0F, 2, 7, 12, 0F,0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 882
		gunModel[402].setRotationPoint(39F, -220F, -22F);

		gunModel[403].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 883
		gunModel[403].setRotationPoint(49F, -216F, -29F);

		gunModel[404].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 885
		gunModel[404].setRotationPoint(39F, -216F, -29F);

		gunModel[405].addShapeBox(0F, 0F, 0F, 7, 5, 112, 0F,-4.6F, -0.4F, 0F, -1.05F, -2.5F, 0F, -1.8F, -2.75F, 0F, -3.85F, -1.15F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 886
		gunModel[405].setRotationPoint(-59F, -214F, -33F);
		gunModel[405].rotateAngleY = -1.57079633F;

		gunModel[406].addShapeBox(0F, 0F, 0F, 5, 7, 112, 0F,0F, -0.5F, 0F, -2.5F, -1.05F, 0F, -2.75F, -1.8F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.4F, -4.6F, 0F, -1.15F, -3.85F, 0F, 0F, 0F, 0F); // Box 887
		gunModel[406].setRotationPoint(-59F, -216F, -33F);
		gunModel[406].rotateAngleY = -1.57079633F;

		gunModel[407].addShapeBox(0F, 0F, 0F, 7, 5, 112, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -4.6F, -0.4F, 0F, -1.05F, -2.5F, 0F, -1.8F, -2.75F, 0F, -3.85F, -1.15F, 0F); // Box 894
		gunModel[407].setRotationPoint(-59F, -209F, -33F);
		gunModel[407].rotateAngleY = -1.57079633F;

		gunModel[408].addShapeBox(0F, 0F, 0F, 5, 7, 112, 0F,0F, 0F, 0F, -0.4F, -4.6F, 0F, -1.15F, -3.85F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2.5F, -1.05F, 0F, -2.75F, -1.8F, 0F, 0F, -1.5F, 0F); // Box 895
		gunModel[408].setRotationPoint(-59F, -209F, -33F);
		gunModel[408].rotateAngleY = -1.57079633F;

		gunModel[409].addShapeBox(0F, 0F, 0F, 5, 7, 112, 0F,-0.4F, -4.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.15F, -3.85F, 0F, -2.5F, -1.05F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -2.75F, -1.8F, 0F); // Box 896
		gunModel[409].setRotationPoint(-59F, -209F, -28F);
		gunModel[409].rotateAngleY = -1.57079633F;

		gunModel[410].addShapeBox(0F, 0F, 0F, 7, 5, 112, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.05F, -2.5F, 0F, -4.6F, -0.4F, 0F, -3.85F, -1.15F, 0F, -1.8F, -2.75F, 0F); // Box 897
		gunModel[410].setRotationPoint(-59F, -209F, -26F);
		gunModel[410].rotateAngleY = -1.57079633F;

		gunModel[411].addShapeBox(0F, 0F, 0F, 7, 5, 112, 0F,-1.05F, -2.5F, 0F, -4.6F, -0.4F, 0F, -3.85F, -1.15F, 0F, -1.8F, -2.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 898
		gunModel[411].setRotationPoint(-59F, -214F, -26F);
		gunModel[411].rotateAngleY = -1.57079633F;

		gunModel[412].addShapeBox(0F, 0F, 0F, 5, 7, 112, 0F,-2.5F, -1.05F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -2.75F, -1.8F, 0F, -0.4F, -4.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.15F, -3.85F, 0F); // Box 899
		gunModel[412].setRotationPoint(-59F, -216F, -28F);
		gunModel[412].rotateAngleY = -1.57079633F;

		gunModel[413].addShapeBox(0F, 0F, 0F, 14, 10, 13, 0F,0F, -0.8F, -9.2F, 0F, -0.8F, -9.2F, 0F, -5F, -1.05F, 0F, -5F, -1.05F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 900
		gunModel[413].setRotationPoint(18F, -225F, 22F);
		gunModel[413].rotateAngleY = -1.57079633F;

		gunModel[414].addShapeBox(0F, 0F, 0F, 14, 10, 13, 0F,0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -9.2F, 0F, -0.8F, -9.2F, 0F, -5F, -1.05F, 0F, -5F, -1.05F); // Box 901
		gunModel[414].setRotationPoint(18F, -215F, 22F);
		gunModel[414].rotateAngleY = -1.57079633F;

		gunModel[415].addShapeBox(0F, 0F, 0F, 14, 13, 10, 0F,0F, 0F, 0F, 6F, 0F, 0F, 0F, -9.2F, -0.8F, 0F, -9.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -5F, 0F, -1.05F, -5F); // Box 902
		gunModel[415].setRotationPoint(18F, -215F, 22F);
		gunModel[415].rotateAngleY = -1.57079633F;

		gunModel[416].addShapeBox(0F, 0F, 0F, 14, 13, 10, 0F,0F, -9.2F, -0.8F, 0F, -9.2F, -0.8F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -5F, 0F, -1.05F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 903
		gunModel[416].setRotationPoint(8F, -215F, 22F);
		gunModel[416].rotateAngleY = -1.57079633F;

		gunModel[417].addShapeBox(0F, 0F, 0F, 14, 10, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1.05F, 0F, -5F, -1.05F, 0F, -0.8F, -9.2F, 0F, -0.8F, -9.2F); // Box 904
		gunModel[417].setRotationPoint(5F, -215F, 22F);
		gunModel[417].rotateAngleY = -1.57079633F;

		gunModel[418].addShapeBox(0F, 0F, 0F, 14, 10, 13, 0F,0F, -5F, -1.05F, 0F, -5F, -1.05F, 0F, -0.8F, -9.2F, 0F, -0.8F, -9.2F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 905
		gunModel[418].setRotationPoint(5F, -225F, 22F);
		gunModel[418].rotateAngleY = -1.57079633F;

		gunModel[419].addShapeBox(0F, 0F, 0F, 14, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -5F, 0F, -1.05F, -5F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, -9.2F, -0.8F, 0F, -9.2F, -0.8F); // Box 906
		gunModel[419].setRotationPoint(18F, -228F, 22F);
		gunModel[419].rotateAngleY = -1.57079633F;

		gunModel[420].addShapeBox(0F, 0F, 0F, 14, 13, 10, 0F,0F, -1.05F, -5F, 0F, -1.05F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.2F, -0.8F, 0F, -9.2F, -0.8F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 907
		gunModel[420].setRotationPoint(8F, -228F, 22F);
		gunModel[420].rotateAngleY = -1.57079633F;

		gunModel[421].addShapeBox(0F, 0F, 0F, 2, 7, 30, 0F,-0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F); // Box 908
		gunModel[421].setRotationPoint(23F, -218F, 22F);
		gunModel[421].rotateAngleY = -1.57079633F;

		gunModel[422].addShapeBox(0F, 0F, 0F, 8, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 909
		gunModel[422].setRotationPoint(50F, -205F, 25F);
		gunModel[422].rotateAngleY = -1.57079633F;

		gunModel[423].addShapeBox(0F, -2F, 0F, 8, 6, 26, 0F,-1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 911
		gunModel[423].setRotationPoint(-193F, -146F, -13F);

		gunModel[424].addShapeBox(0F, -2F, 0F, 8, 6, 26, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F); // Box 912
		gunModel[424].setRotationPoint(-193F, -140F, -13F);

		gunModel[425].addShapeBox(0F, -2F, 0F, 6, 8, 26, 0F,-3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F); // Box 913
		gunModel[425].setRotationPoint(-191F, -148F, -13F);

		gunModel[426].addShapeBox(0F, -2F, 0F, 6, 8, 26, 0F,-0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F); // Box 914
		gunModel[426].setRotationPoint(-191F, -140F, -13F);

		gunModel[427].addShapeBox(0F, -2F, 0F, 8, 6, 26, 0F,-5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 915
		gunModel[427].setRotationPoint(-185F, -146F, -13F);

		gunModel[428].addShapeBox(0F, -2F, 0F, 8, 6, 26, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F); // Box 916
		gunModel[428].setRotationPoint(-185F, -140F, -13F);

		gunModel[429].addShapeBox(0F, -2F, 0F, 6, 8, 26, 0F,0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F); // Box 917
		gunModel[429].setRotationPoint(-185F, -148F, -13F);

		gunModel[430].addShapeBox(0F, -2F, 0F, 6, 8, 26, 0F,0F, 0F, 0F, -0.75F, -5.25F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F); // Box 918
		gunModel[430].setRotationPoint(-185F, -140F, -13F);

		gunModel[431].addShapeBox(-18F, -3F, -3F, 12, 6, 26, 0F,0F, -1.75F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -1.75F, -0.05F, 0F, -1.75F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -1.75F, -0.05F); // Box 919
		gunModel[431].setRotationPoint(-185F, -142F, -10F);
		gunModel[431].rotateAngleZ = 0.33161256F;

		gunModel[432].addShapeBox(6F, -3F, -3F, 5, 6, 26, 0F,0F, 0F, -0.05F, 0F, -1.75F, -0.05F, 0F, -1.75F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -1.75F, -0.05F, 0F, -1.75F, -0.05F, 0F, 0F, -0.05F); // Box 922
		gunModel[432].setRotationPoint(-185F, -142F, -10F);
		gunModel[432].rotateAngleZ = 0.33161256F;

		gunModel[433].addShapeBox(0F, 0F, 1F, 6, 7, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 923
		gunModel[433].setRotationPoint(-115F, -197F, -23F);

		gunModel[434].addShapeBox(0F, 0F, 1F, 9, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 924
		gunModel[434].setRotationPoint(-126F, -188F, -24F);

		gunModel[435].addShapeBox(0F, 0F, 1F, 9, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 925
		gunModel[435].setRotationPoint(-142F, -188F, -27F);

		gunModel[436].addShapeBox(0F, 0F, 1F, 25, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 0F); // Box 926
		gunModel[436].setRotationPoint(-142F, -186.5F, -26.5F);

		gunModel[437].addShapeBox(0F, 0F, 1F, 11, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 927
		gunModel[437].setRotationPoint(-117F, -186.5F, -24.5F);

		gunModel[438].addShapeBox(0F, 0F, 1F, 6, 26, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 928
		gunModel[438].setRotationPoint(-109F, -198F, -30F);
	}

	private void initdefaultGripModel_1()
	{
		defaultGripModel[0] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 204
		defaultGripModel[1] = new ModelRendererTurbo(this, 1065, 33, textureX, textureY); // Box 205
		defaultGripModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 206
		defaultGripModel[3] = new ModelRendererTurbo(this, 1521, 41, textureX, textureY); // Box 207
		defaultGripModel[4] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 208
		defaultGripModel[5] = new ModelRendererTurbo(this, 1561, 105, textureX, textureY); // Box 258
		defaultGripModel[6] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 224
		defaultGripModel[7] = new ModelRendererTurbo(this, 785, 57, textureX, textureY); // Box 225
		defaultGripModel[8] = new ModelRendererTurbo(this, 2025, 81, textureX, textureY); // Box 226
		defaultGripModel[9] = new ModelRendererTurbo(this, 1529, 89, textureX, textureY); // Box 227
		defaultGripModel[10] = new ModelRendererTurbo(this, 521, 105, textureX, textureY); // Box 228
		defaultGripModel[11] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 229
		defaultGripModel[12] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 230
		defaultGripModel[13] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Box 231
		defaultGripModel[14] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 232
		defaultGripModel[15] = new ModelRendererTurbo(this, 1105, 33, textureX, textureY); // Box 233
		defaultGripModel[16] = new ModelRendererTurbo(this, 1561, 129, textureX, textureY); // Box 234
		defaultGripModel[17] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 235
		defaultGripModel[18] = new ModelRendererTurbo(this, 1561, 89, textureX, textureY); // Box 236
		defaultGripModel[19] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 237
		defaultGripModel[20] = new ModelRendererTurbo(this, 665, 169, textureX, textureY); // Box 238
		defaultGripModel[21] = new ModelRendererTurbo(this, 1641, 57, textureX, textureY); // Box 239
		defaultGripModel[22] = new ModelRendererTurbo(this, 825, 249, textureX, textureY); // Box 240
		defaultGripModel[23] = new ModelRendererTurbo(this, 1105, 257, textureX, textureY); // Box 240
		defaultGripModel[24] = new ModelRendererTurbo(this, 1385, 113, textureX, textureY); // Box 241
		defaultGripModel[25] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 242
		defaultGripModel[26] = new ModelRendererTurbo(this, 665, 89, textureX, textureY); // Box 243
		defaultGripModel[27] = new ModelRendererTurbo(this, 665, 177, textureX, textureY); // Box 244
		defaultGripModel[28] = new ModelRendererTurbo(this, 273, 273, textureX, textureY); // Box 245
		defaultGripModel[29] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 246
		defaultGripModel[30] = new ModelRendererTurbo(this, 273, 297, textureX, textureY); // Box 247
		defaultGripModel[31] = new ModelRendererTurbo(this, 1897, 97, textureX, textureY); // Box 248
		defaultGripModel[32] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 249
		defaultGripModel[33] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 250
		defaultGripModel[34] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 251
		defaultGripModel[35] = new ModelRendererTurbo(this, 785, 113, textureX, textureY); // Box 252
		defaultGripModel[36] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Box 253
		defaultGripModel[37] = new ModelRendererTurbo(this, 1513, 113, textureX, textureY); // Box 254
		defaultGripModel[38] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 255
		defaultGripModel[39] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 256
		defaultGripModel[40] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 257
		defaultGripModel[41] = new ModelRendererTurbo(this, 1721, 177, textureX, textureY); // Box 322
		defaultGripModel[42] = new ModelRendererTurbo(this, 1929, 65, textureX, textureY); // Box 323
		defaultGripModel[43] = new ModelRendererTurbo(this, 825, 273, textureX, textureY); // Box 380
		defaultGripModel[44] = new ModelRendererTurbo(this, 1473, 193, textureX, textureY); // Box 381
		defaultGripModel[45] = new ModelRendererTurbo(this, 1081, 1, textureX, textureY); // Box 413
		defaultGripModel[46] = new ModelRendererTurbo(this, 1305, 313, textureX, textureY); // Box 415
		defaultGripModel[47] = new ModelRendererTurbo(this, 1041, 241, textureX, textureY); // Box 416
		defaultGripModel[48] = new ModelRendererTurbo(this, 1105, 1, textureX, textureY); // Box 417
		defaultGripModel[49] = new ModelRendererTurbo(this, 1569, 1, textureX, textureY); // Box 418
		defaultGripModel[50] = new ModelRendererTurbo(this, 1673, 1, textureX, textureY); // Box 419
		defaultGripModel[51] = new ModelRendererTurbo(this, 1017, 345, textureX, textureY); // Box 420
		defaultGripModel[52] = new ModelRendererTurbo(this, 937, 337, textureX, textureY); // Box 421
		defaultGripModel[53] = new ModelRendererTurbo(this, 761, 345, textureX, textureY); // Box 422
		defaultGripModel[54] = new ModelRendererTurbo(this, 1009, 393, textureX, textureY); // Box 423
		defaultGripModel[55] = new ModelRendererTurbo(this, 1777, 1, textureX, textureY); // Box 424
		defaultGripModel[56] = new ModelRendererTurbo(this, 1841, 1, textureX, textureY); // Box 425
		defaultGripModel[57] = new ModelRendererTurbo(this, 1097, 433, textureX, textureY); // Box 426
		defaultGripModel[58] = new ModelRendererTurbo(this, 593, 433, textureX, textureY); // Box 427
		defaultGripModel[59] = new ModelRendererTurbo(this, 321, 465, textureX, textureY); // Box 428

		defaultGripModel[0].addShapeBox(0F, 0F, 1F, 2, 2, 93, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		defaultGripModel[0].setRotationPoint(15F, -190F, 19F);
		defaultGripModel[0].rotateAngleY = -1.57079633F;

		defaultGripModel[1].addShapeBox(0F, 0F, 1F, 2, 45, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		defaultGripModel[1].setRotationPoint(10F, -185F, 19F);
		defaultGripModel[1].rotateAngleY = -1.57079633F;

		defaultGripModel[2].addShapeBox(0F, 0F, 1F, 2, 5, 2, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		defaultGripModel[2].setRotationPoint(10F, -190F, 19F);
		defaultGripModel[2].rotateAngleY = -1.57079633F;

		defaultGripModel[3].addShapeBox(0F, 0F, 1F, 2, 43, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		defaultGripModel[3].setRotationPoint(120F, -180F, 19F);
		defaultGripModel[3].rotateAngleY = -1.57079633F;

		defaultGripModel[4].addShapeBox(0F, 0F, 1F, 2, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -2F, 0F, 8F, -2F); // Box 208
		defaultGripModel[4].setRotationPoint(108F, -190F, 19F);
		defaultGripModel[4].rotateAngleY = -1.57079633F;

		defaultGripModel[5].addShapeBox(0F, 0F, 1F, 110, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		defaultGripModel[5].setRotationPoint(12F, -180F, 16F);

		defaultGripModel[6].addShapeBox(0F, 0F, 1F, 2, 36, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		defaultGripModel[6].setRotationPoint(111F, -177F, 19F);
		defaultGripModel[6].rotateAngleY = -1.57079633F;

		defaultGripModel[7].addShapeBox(0F, 0F, 1F, 2, 36, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		defaultGripModel[7].setRotationPoint(100F, -177F, 19F);
		defaultGripModel[7].rotateAngleY = -1.57079633F;

		defaultGripModel[8].addShapeBox(0F, 0F, 1F, 2, 36, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		defaultGripModel[8].setRotationPoint(90F, -177F, 19F);
		defaultGripModel[8].rotateAngleY = -1.57079633F;

		defaultGripModel[9].addShapeBox(0F, 0F, 1F, 2, 36, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		defaultGripModel[9].setRotationPoint(80F, -177F, 19F);
		defaultGripModel[9].rotateAngleY = -1.57079633F;

		defaultGripModel[10].addShapeBox(0F, 0F, 1F, 2, 36, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		defaultGripModel[10].setRotationPoint(70F, -177F, 19F);
		defaultGripModel[10].rotateAngleY = -1.57079633F;

		defaultGripModel[11].addShapeBox(0F, 0F, 1F, 2, 36, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		defaultGripModel[11].setRotationPoint(60F, -177F, 19F);
		defaultGripModel[11].rotateAngleY = -1.57079633F;

		defaultGripModel[12].addShapeBox(0F, 0F, 1F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		defaultGripModel[12].setRotationPoint(50F, -177F, 19F);
		defaultGripModel[12].rotateAngleY = -1.57079633F;

		defaultGripModel[13].addShapeBox(0F, 0F, 1F, 2, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		defaultGripModel[13].setRotationPoint(40F, -177F, 19F);
		defaultGripModel[13].rotateAngleY = -1.57079633F;

		defaultGripModel[14].addShapeBox(0F, 0F, 1F, 2, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		defaultGripModel[14].setRotationPoint(29F, -177F, 19F);
		defaultGripModel[14].rotateAngleY = -1.57079633F;

		defaultGripModel[15].addShapeBox(0F, 0F, 1F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		defaultGripModel[15].setRotationPoint(19F, -177F, 19F);
		defaultGripModel[15].rotateAngleY = -1.57079633F;

		defaultGripModel[16].addShapeBox(0F, 0F, 1F, 104, 9, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		defaultGripModel[16].setRotationPoint(17F, -189F, 16F);

		defaultGripModel[17].addShapeBox(0F, 0F, 1F, 5, 9, 1, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		defaultGripModel[17].setRotationPoint(12F, -189F, 16F);

		defaultGripModel[18].addShapeBox(0F, 0F, 1F, 34, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 236
		defaultGripModel[18].setRotationPoint(17F, -158F, 16F);

		defaultGripModel[19].addShapeBox(0F, 0F, 1F, 6, 5, 1, 0F,0F, -1F, 0F, 0F, -2.94F, 0F, 0F, -2.94F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 237
		defaultGripModel[19].setRotationPoint(17F, -158F, 16F);

		defaultGripModel[20].addShapeBox(0F, 0F, 1F, 71, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F); // Box 238
		defaultGripModel[20].setRotationPoint(51F, -137F, 16F);

		defaultGripModel[21].addShapeBox(0F, 0F, 1F, 5, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		defaultGripModel[21].setRotationPoint(12F, -158F, 16F);

		defaultGripModel[22].addShapeBox(0F, 0F, 1F, 71, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		defaultGripModel[22].setRotationPoint(51F, -158F, 16F);

		defaultGripModel[23].addShapeBox(0F, 0F, 1F, 71, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		defaultGripModel[23].setRotationPoint(51F, -158F, -19F);

		defaultGripModel[24].addShapeBox(0F, 0F, 1F, 34, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 241
		defaultGripModel[24].setRotationPoint(17F, -158F, -19F);

		defaultGripModel[25].addShapeBox(0F, 0F, 1F, 6, 5, 1, 0F,0F, -1F, 0F, 0F, -2.94F, 0F, 0F, -2.94F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 242
		defaultGripModel[25].setRotationPoint(17F, -158F, -19F);

		defaultGripModel[26].addShapeBox(0F, 0F, 1F, 5, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		defaultGripModel[26].setRotationPoint(12F, -158F, -19F);

		defaultGripModel[27].addShapeBox(0F, 0F, 1F, 71, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F); // Box 244
		defaultGripModel[27].setRotationPoint(51F, -137F, -19F);

		defaultGripModel[28].addShapeBox(0F, 0F, 1F, 110, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		defaultGripModel[28].setRotationPoint(12F, -180F, -19F);

		defaultGripModel[29].addShapeBox(0F, 0F, 1F, 5, 9, 1, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		defaultGripModel[29].setRotationPoint(12F, -189F, -19F);

		defaultGripModel[30].addShapeBox(0F, 0F, 1F, 104, 9, 1, 0F,0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		defaultGripModel[30].setRotationPoint(17F, -189F, -19F);

		defaultGripModel[31].addShapeBox(0F, 0F, 1F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		defaultGripModel[31].setRotationPoint(19F, -177F, -17F);
		defaultGripModel[31].rotateAngleY = -1.57079633F;

		defaultGripModel[32].addShapeBox(0F, 0F, 1F, 2, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		defaultGripModel[32].setRotationPoint(29F, -177F, -17F);
		defaultGripModel[32].rotateAngleY = -1.57079633F;

		defaultGripModel[33].addShapeBox(0F, 0F, 1F, 2, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		defaultGripModel[33].setRotationPoint(40F, -177F, -17F);
		defaultGripModel[33].rotateAngleY = -1.57079633F;

		defaultGripModel[34].addShapeBox(0F, 0F, 1F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		defaultGripModel[34].setRotationPoint(50F, -177F, -17F);
		defaultGripModel[34].rotateAngleY = -1.57079633F;

		defaultGripModel[35].addShapeBox(0F, 0F, 1F, 2, 36, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		defaultGripModel[35].setRotationPoint(60F, -177F, -17F);
		defaultGripModel[35].rotateAngleY = -1.57079633F;

		defaultGripModel[36].addShapeBox(0F, 0F, 1F, 2, 36, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		defaultGripModel[36].setRotationPoint(70F, -177F, -17F);
		defaultGripModel[36].rotateAngleY = -1.57079633F;

		defaultGripModel[37].addShapeBox(0F, 0F, 1F, 2, 36, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		defaultGripModel[37].setRotationPoint(80F, -177F, -17F);
		defaultGripModel[37].rotateAngleY = -1.57079633F;

		defaultGripModel[38].addShapeBox(0F, 0F, 1F, 2, 36, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		defaultGripModel[38].setRotationPoint(90F, -177F, -17F);
		defaultGripModel[38].rotateAngleY = -1.57079633F;

		defaultGripModel[39].addShapeBox(0F, 0F, 1F, 2, 36, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		defaultGripModel[39].setRotationPoint(100F, -177F, -17F);
		defaultGripModel[39].rotateAngleY = -1.57079633F;

		defaultGripModel[40].addShapeBox(0F, 0F, 1F, 2, 36, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		defaultGripModel[40].setRotationPoint(111F, -177F, -17F);
		defaultGripModel[40].rotateAngleY = -1.57079633F;

		defaultGripModel[41].addShapeBox(0F, 0F, 1F, 62, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		defaultGripModel[41].setRotationPoint(34F, -196F, -17F);

		defaultGripModel[42].addShapeBox(0F, 0F, 1F, 17, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 323
		defaultGripModel[42].setRotationPoint(-39F, -210F, -17F);

		defaultGripModel[43].addShapeBox(0F, 0F, 1F, 62, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		defaultGripModel[43].setRotationPoint(34F, -196F, 13F);

		defaultGripModel[44].addShapeBox(0F, 0F, 1F, 25, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 381
		defaultGripModel[44].setRotationPoint(-47F, -210F, 12F);

		defaultGripModel[45].addShapeBox(0F, 0F, 1F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 413
		defaultGripModel[45].setRotationPoint(92F, -192F, -14F);
		defaultGripModel[45].rotateAngleY = -1.57079633F;

		defaultGripModel[46].addShapeBox(0F, 0F, 1F, 3, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 415
		defaultGripModel[46].setRotationPoint(93F, -184F, -12F);

		defaultGripModel[47].addShapeBox(0F, 0F, 1F, 2, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 416
		defaultGripModel[47].setRotationPoint(93F, -169F, -10F);

		defaultGripModel[48].addShapeBox(0F, 0F, 1F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 417
		defaultGripModel[48].setRotationPoint(92F, -192F, 16F);
		defaultGripModel[48].rotateAngleY = -1.57079633F;

		defaultGripModel[49].addShapeBox(0F, 0F, 1F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 418
		defaultGripModel[49].setRotationPoint(62F, -192F, 16F);
		defaultGripModel[49].rotateAngleY = -1.57079633F;

		defaultGripModel[50].addShapeBox(0F, 0F, 1F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 419
		defaultGripModel[50].setRotationPoint(62F, -192F, -14F);
		defaultGripModel[50].rotateAngleY = -1.57079633F;

		defaultGripModel[51].addShapeBox(0F, 0F, 1F, 3, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 420
		defaultGripModel[51].setRotationPoint(63F, -184F, -12F);

		defaultGripModel[52].addShapeBox(0F, 0F, 1F, 2, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 421
		defaultGripModel[52].setRotationPoint(64F, -169F, -10F);

		defaultGripModel[53].addShapeBox(0F, 0F, 1F, 2, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 422
		defaultGripModel[53].setRotationPoint(36F, -169F, -10F);

		defaultGripModel[54].addShapeBox(0F, 0F, 1F, 3, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 423
		defaultGripModel[54].setRotationPoint(35F, -184F, -12F);

		defaultGripModel[55].addShapeBox(0F, 0F, 1F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 424
		defaultGripModel[55].setRotationPoint(34F, -192F, 16F);
		defaultGripModel[55].rotateAngleY = -1.57079633F;

		defaultGripModel[56].addShapeBox(0F, 0F, 1F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 425
		defaultGripModel[56].setRotationPoint(34F, -192F, -14F);
		defaultGripModel[56].rotateAngleY = -1.57079633F;

		defaultGripModel[57].addShapeBox(0F, 0F, 1F, 69, 2, 36, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 426
		defaultGripModel[57].setRotationPoint(52F, -162F, -19F);

		defaultGripModel[58].addShapeBox(0F, 0F, 1F, 69, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		defaultGripModel[58].setRotationPoint(52F, -160F, -3F);

		defaultGripModel[59].addShapeBox(0F, 0F, 1F, 69, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 428
		defaultGripModel[59].setRotationPoint(52F, -150F, -3F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 705, 657, textureX, textureY); // Box 573
		ammoModel[1] = new ModelRendererTurbo(this, 1121, 657, textureX, textureY); // Box 575
		ammoModel[2] = new ModelRendererTurbo(this, 1761, 665, textureX, textureY); // Box 576
		ammoModel[3] = new ModelRendererTurbo(this, 1, 673, textureX, textureY); // Box 577
		ammoModel[4] = new ModelRendererTurbo(this, 617, 649, textureX, textureY); // Box 578
		ammoModel[5] = new ModelRendererTurbo(this, 1489, 681, textureX, textureY); // Box 579
		ammoModel[6] = new ModelRendererTurbo(this, 417, 689, textureX, textureY); // Box 580
		ammoModel[7] = new ModelRendererTurbo(this, 649, 681, textureX, textureY); // Box 581
		ammoModel[8] = new ModelRendererTurbo(this, 1001, 681, textureX, textureY); // Box 582
		ammoModel[9] = new ModelRendererTurbo(this, 1857, 729, textureX, textureY); // Box 583
		ammoModel[10] = new ModelRendererTurbo(this, 1385, 681, textureX, textureY); // Box 584
		ammoModel[11] = new ModelRendererTurbo(this, 593, 697, textureX, textureY); // Box 585
		ammoModel[12] = new ModelRendererTurbo(this, 1121, 801, textureX, textureY); // Box 586
		ammoModel[13] = new ModelRendererTurbo(this, 1297, 801, textureX, textureY); // Box 587
		ammoModel[14] = new ModelRendererTurbo(this, 1, 593, textureX, textureY); // Box 588
		ammoModel[15] = new ModelRendererTurbo(this, 129, 593, textureX, textureY); // Box 589
		ammoModel[16] = new ModelRendererTurbo(this, 257, 593, textureX, textureY); // Box 590
		ammoModel[17] = new ModelRendererTurbo(this, 1913, 649, textureX, textureY); // Box 591
		ammoModel[18] = new ModelRendererTurbo(this, 385, 593, textureX, textureY); // Box 592
		ammoModel[19] = new ModelRendererTurbo(this, 513, 593, textureX, textureY); // Box 593
		ammoModel[20] = new ModelRendererTurbo(this, 689, 649, textureX, textureY); // Box 594
		ammoModel[21] = new ModelRendererTurbo(this, 1385, 657, textureX, textureY); // Box 595
		ammoModel[22] = new ModelRendererTurbo(this, 1617, 657, textureX, textureY); // Box 599
		ammoModel[23] = new ModelRendererTurbo(this, 337, 665, textureX, textureY); // Box 600
		ammoModel[24] = new ModelRendererTurbo(this, 1953, 665, textureX, textureY); // Box 601
		ammoModel[25] = new ModelRendererTurbo(this, 2001, 33, textureX, textureY); // Box 603
		ammoModel[26] = new ModelRendererTurbo(this, 1257, 41, textureX, textureY); // Box 606
		ammoModel[27] = new ModelRendererTurbo(this, 1305, 41, textureX, textureY); // Box 607
		ammoModel[28] = new ModelRendererTurbo(this, 1353, 41, textureX, textureY); // Box 608
		ammoModel[29] = new ModelRendererTurbo(this, 1401, 41, textureX, textureY); // Box 609
		ammoModel[30] = new ModelRendererTurbo(this, 1217, 41, textureX, textureY); // Box 610
		ammoModel[31] = new ModelRendererTurbo(this, 1449, 41, textureX, textureY); // Box 611
		ammoModel[32] = new ModelRendererTurbo(this, 1497, 41, textureX, textureY); // Box 612
		ammoModel[33] = new ModelRendererTurbo(this, 1785, 281, textureX, textureY); // Box 613
		ammoModel[34] = new ModelRendererTurbo(this, 1241, 289, textureX, textureY); // Box 614
		ammoModel[35] = new ModelRendererTurbo(this, 689, 321, textureX, textureY); // Box 615
		ammoModel[36] = new ModelRendererTurbo(this, 961, 345, textureX, textureY); // Box 616
		ammoModel[37] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Box 618
		ammoModel[38] = new ModelRendererTurbo(this, 825, 25, textureX, textureY); // Box 621
		ammoModel[39] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 622
		ammoModel[40] = new ModelRendererTurbo(this, 1049, 33, textureX, textureY); // Box 623
		ammoModel[41] = new ModelRendererTurbo(this, 1, 681, textureX, textureY); // Box 624
		ammoModel[42] = new ModelRendererTurbo(this, 297, 681, textureX, textureY); // Box 625
		ammoModel[43] = new ModelRendererTurbo(this, 1, 697, textureX, textureY); // Box 626
		ammoModel[44] = new ModelRendererTurbo(this, 297, 697, textureX, textureY); // Box 627
		ammoModel[45] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 628
		ammoModel[46] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 629
		ammoModel[47] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Box 630
		ammoModel[48] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 631
		ammoModel[49] = new ModelRendererTurbo(this, 1041, 65, textureX, textureY); // Box 632
		ammoModel[50] = new ModelRendererTurbo(this, 1769, 65, textureX, textureY); // Box 633
		ammoModel[51] = new ModelRendererTurbo(this, 1817, 65, textureX, textureY); // Box 634
		ammoModel[52] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 635
		ammoModel[53] = new ModelRendererTurbo(this, 961, 369, textureX, textureY); // Box 636
		ammoModel[54] = new ModelRendererTurbo(this, 761, 377, textureX, textureY); // Box 637
		ammoModel[55] = new ModelRendererTurbo(this, 1233, 417, textureX, textureY); // Box 638
		ammoModel[56] = new ModelRendererTurbo(this, 753, 457, textureX, textureY); // Box 639
		ammoModel[57] = new ModelRendererTurbo(this, 1561, 33, textureX, textureY); // Box 640
		ammoModel[58] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 641
		ammoModel[59] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 642
		ammoModel[60] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 643
		ammoModel[61] = new ModelRendererTurbo(this, 1001, 697, textureX, textureY); // Box 644
		ammoModel[62] = new ModelRendererTurbo(this, 1097, 697, textureX, textureY); // Box 645
		ammoModel[63] = new ModelRendererTurbo(this, 1385, 697, textureX, textureY); // Box 646
		ammoModel[64] = new ModelRendererTurbo(this, 1481, 697, textureX, textureY); // Box 647
		ammoModel[65] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 648
		ammoModel[66] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 649
		ammoModel[67] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 650
		ammoModel[68] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 651
		ammoModel[69] = new ModelRendererTurbo(this, 1281, 89, textureX, textureY); // Box 652
		ammoModel[70] = new ModelRendererTurbo(this, 1337, 89, textureX, textureY); // Box 653
		ammoModel[71] = new ModelRendererTurbo(this, 1025, 97, textureX, textureY); // Box 654
		ammoModel[72] = new ModelRendererTurbo(this, 1385, 129, textureX, textureY); // Box 655
		ammoModel[73] = new ModelRendererTurbo(this, 1273, 457, textureX, textureY); // Box 656
		ammoModel[74] = new ModelRendererTurbo(this, 1881, 465, textureX, textureY); // Box 657
		ammoModel[75] = new ModelRendererTurbo(this, 1921, 489, textureX, textureY); // Box 658
		ammoModel[76] = new ModelRendererTurbo(this, 2009, 489, textureX, textureY); // Box 659
		ammoModel[77] = new ModelRendererTurbo(this, 689, 57, textureX, textureY); // Box 660
		ammoModel[78] = new ModelRendererTurbo(this, 1561, 57, textureX, textureY); // Box 661
		ammoModel[79] = new ModelRendererTurbo(this, 1625, 57, textureX, textureY); // Box 662
		ammoModel[80] = new ModelRendererTurbo(this, 889, 81, textureX, textureY); // Box 663
		ammoModel[81] = new ModelRendererTurbo(this, 1, 713, textureX, textureY); // Box 664
		ammoModel[82] = new ModelRendererTurbo(this, 297, 713, textureX, textureY); // Box 665
		ammoModel[83] = new ModelRendererTurbo(this, 593, 713, textureX, textureY); // Box 666
		ammoModel[84] = new ModelRendererTurbo(this, 689, 713, textureX, textureY); // Box 667
		ammoModel[85] = new ModelRendererTurbo(this, 1433, 129, textureX, textureY); // Box 668
		ammoModel[86] = new ModelRendererTurbo(this, 1441, 89, textureX, textureY); // Box 669
		ammoModel[87] = new ModelRendererTurbo(this, 1481, 89, textureX, textureY); // Box 670
		ammoModel[88] = new ModelRendererTurbo(this, 825, 145, textureX, textureY); // Box 671
		ammoModel[89] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 672
		ammoModel[90] = new ModelRendererTurbo(this, 1513, 177, textureX, textureY); // Box 673
		ammoModel[91] = new ModelRendererTurbo(this, 1857, 177, textureX, textureY); // Box 674
		ammoModel[92] = new ModelRendererTurbo(this, 2017, 177, textureX, textureY); // Box 675
		ammoModel[93] = new ModelRendererTurbo(this, 1121, 529, textureX, textureY); // Box 676
		ammoModel[94] = new ModelRendererTurbo(this, 1249, 529, textureX, textureY); // Box 677
		ammoModel[95] = new ModelRendererTurbo(this, 1025, 537, textureX, textureY); // Box 678
		ammoModel[96] = new ModelRendererTurbo(this, 689, 545, textureX, textureY); // Box 679
		ammoModel[97] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 680
		ammoModel[98] = new ModelRendererTurbo(this, 1065, 105, textureX, textureY); // Box 681
		ammoModel[99] = new ModelRendererTurbo(this, 2009, 105, textureX, textureY); // Box 682
		ammoModel[100] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 683
		ammoModel[101] = new ModelRendererTurbo(this, 1001, 713, textureX, textureY); // Box 684
		ammoModel[102] = new ModelRendererTurbo(this, 1097, 713, textureX, textureY); // Box 685
		ammoModel[103] = new ModelRendererTurbo(this, 1385, 713, textureX, textureY); // Box 686
		ammoModel[104] = new ModelRendererTurbo(this, 1481, 713, textureX, textureY); // Box 687
		ammoModel[105] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 688
		ammoModel[106] = new ModelRendererTurbo(this, 1721, 217, textureX, textureY); // Box 689
		ammoModel[107] = new ModelRendererTurbo(this, 2025, 233, textureX, textureY); // Box 690
		ammoModel[108] = new ModelRendererTurbo(this, 633, 241, textureX, textureY); // Box 691
		ammoModel[109] = new ModelRendererTurbo(this, 2025, 249, textureX, textureY); // Box 692
		ammoModel[110] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 693
		ammoModel[111] = new ModelRendererTurbo(this, 1841, 257, textureX, textureY); // Box 694
		ammoModel[112] = new ModelRendererTurbo(this, 1897, 257, textureX, textureY); // Box 695
		ammoModel[113] = new ModelRendererTurbo(this, 729, 545, textureX, textureY); // Box 696
		ammoModel[114] = new ModelRendererTurbo(this, 985, 545, textureX, textureY); // Box 697
		ammoModel[115] = new ModelRendererTurbo(this, 1097, 553, textureX, textureY); // Box 698
		ammoModel[116] = new ModelRendererTurbo(this, 1553, 553, textureX, textureY); // Box 699
		ammoModel[117] = new ModelRendererTurbo(this, 2033, 137, textureX, textureY); // Box 700
		ammoModel[118] = new ModelRendererTurbo(this, 545, 145, textureX, textureY); // Box 701
		ammoModel[119] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 702
		ammoModel[120] = new ModelRendererTurbo(this, 1881, 145, textureX, textureY); // Box 703
		ammoModel[121] = new ModelRendererTurbo(this, 1, 729, textureX, textureY); // Box 704
		ammoModel[122] = new ModelRendererTurbo(this, 297, 729, textureX, textureY); // Box 705
		ammoModel[123] = new ModelRendererTurbo(this, 593, 729, textureX, textureY); // Box 706
		ammoModel[124] = new ModelRendererTurbo(this, 689, 729, textureX, textureY); // Box 707
		ammoModel[125] = new ModelRendererTurbo(this, 2025, 265, textureX, textureY); // Box 708
		ammoModel[126] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 709
		ammoModel[127] = new ModelRendererTurbo(this, 601, 273, textureX, textureY); // Box 710
		ammoModel[128] = new ModelRendererTurbo(this, 1897, 273, textureX, textureY); // Box 711
		ammoModel[129] = new ModelRendererTurbo(this, 2025, 281, textureX, textureY); // Box 712
		ammoModel[130] = new ModelRendererTurbo(this, 2025, 297, textureX, textureY); // Box 713
		ammoModel[131] = new ModelRendererTurbo(this, 1337, 313, textureX, textureY); // Box 714
		ammoModel[132] = new ModelRendererTurbo(this, 241, 329, textureX, textureY); // Box 715
		ammoModel[133] = new ModelRendererTurbo(this, 1593, 553, textureX, textureY); // Box 716
		ammoModel[134] = new ModelRendererTurbo(this, 1897, 553, textureX, textureY); // Box 717
		ammoModel[135] = new ModelRendererTurbo(this, 1905, 569, textureX, textureY); // Box 718
		ammoModel[136] = new ModelRendererTurbo(this, 1569, 577, textureX, textureY); // Box 719
		ammoModel[137] = new ModelRendererTurbo(this, 1041, 153, textureX, textureY); // Box 720
		ammoModel[138] = new ModelRendererTurbo(this, 1521, 153, textureX, textureY); // Box 721
		ammoModel[139] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 722
		ammoModel[140] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 723
		ammoModel[141] = new ModelRendererTurbo(this, 1001, 729, textureX, textureY); // Box 724
		ammoModel[142] = new ModelRendererTurbo(this, 1097, 729, textureX, textureY); // Box 725
		ammoModel[143] = new ModelRendererTurbo(this, 1385, 729, textureX, textureY); // Box 726
		ammoModel[144] = new ModelRendererTurbo(this, 1481, 729, textureX, textureY); // Box 727
		ammoModel[145] = new ModelRendererTurbo(this, 1385, 329, textureX, textureY); // Box 728
		ammoModel[146] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Box 729
		ammoModel[147] = new ModelRendererTurbo(this, 825, 337, textureX, textureY); // Box 730
		ammoModel[148] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 731
		ammoModel[149] = new ModelRendererTurbo(this, 1017, 345, textureX, textureY); // Box 732
		ammoModel[150] = new ModelRendererTurbo(this, 1385, 345, textureX, textureY); // Box 733
		ammoModel[151] = new ModelRendererTurbo(this, 2025, 345, textureX, textureY); // Box 734
		ammoModel[152] = new ModelRendererTurbo(this, 825, 353, textureX, textureY); // Box 735
		ammoModel[153] = new ModelRendererTurbo(this, 1633, 617, textureX, textureY); // Box 736
		ammoModel[154] = new ModelRendererTurbo(this, 1889, 633, textureX, textureY); // Box 737
		ammoModel[155] = new ModelRendererTurbo(this, 1585, 641, textureX, textureY); // Box 738
		ammoModel[156] = new ModelRendererTurbo(this, 657, 649, textureX, textureY); // Box 739
		ammoModel[157] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 740
		ammoModel[158] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 741
		ammoModel[159] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 742
		ammoModel[160] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 743
		ammoModel[161] = new ModelRendererTurbo(this, 1753, 729, textureX, textureY); // Box 744
		ammoModel[162] = new ModelRendererTurbo(this, 1, 745, textureX, textureY); // Box 745
		ammoModel[163] = new ModelRendererTurbo(this, 297, 745, textureX, textureY); // Box 746
		ammoModel[164] = new ModelRendererTurbo(this, 593, 745, textureX, textureY); // Box 747
		ammoModel[165] = new ModelRendererTurbo(this, 1097, 353, textureX, textureY); // Box 748
		ammoModel[166] = new ModelRendererTurbo(this, 1329, 353, textureX, textureY); // Box 749
		ammoModel[167] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 750
		ammoModel[168] = new ModelRendererTurbo(this, 609, 361, textureX, textureY); // Box 751
		ammoModel[169] = new ModelRendererTurbo(this, 1097, 369, textureX, textureY); // Box 752
		ammoModel[170] = new ModelRendererTurbo(this, 1385, 369, textureX, textureY); // Box 753
		ammoModel[171] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 754
		ammoModel[172] = new ModelRendererTurbo(this, 1009, 393, textureX, textureY); // Box 755
		ammoModel[173] = new ModelRendererTurbo(this, 737, 649, textureX, textureY); // Box 756
		ammoModel[174] = new ModelRendererTurbo(this, 1177, 657, textureX, textureY); // Box 757
		ammoModel[175] = new ModelRendererTurbo(this, 1481, 657, textureX, textureY); // Box 758
		ammoModel[176] = new ModelRendererTurbo(this, 1521, 657, textureX, textureY); // Box 759
		ammoModel[177] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Box 760
		ammoModel[178] = new ModelRendererTurbo(this, 849, 177, textureX, textureY); // Box 761
		ammoModel[179] = new ModelRendererTurbo(this, 1265, 217, textureX, textureY); // Box 762
		ammoModel[180] = new ModelRendererTurbo(this, 1289, 217, textureX, textureY); // Box 763
		ammoModel[181] = new ModelRendererTurbo(this, 689, 745, textureX, textureY); // Box 764
		ammoModel[182] = new ModelRendererTurbo(this, 1001, 745, textureX, textureY); // Box 765
		ammoModel[183] = new ModelRendererTurbo(this, 1097, 745, textureX, textureY); // Box 766
		ammoModel[184] = new ModelRendererTurbo(this, 1385, 745, textureX, textureY); // Box 767
		ammoModel[185] = new ModelRendererTurbo(this, 825, 401, textureX, textureY); // Box 768
		ammoModel[186] = new ModelRendererTurbo(this, 1385, 385, textureX, textureY); // Box 769
		ammoModel[187] = new ModelRendererTurbo(this, 1657, 385, textureX, textureY); // Box 770
		ammoModel[188] = new ModelRendererTurbo(this, 1, 409, textureX, textureY); // Box 771
		ammoModel[189] = new ModelRendererTurbo(this, 745, 417, textureX, textureY); // Box 772
		ammoModel[190] = new ModelRendererTurbo(this, 1273, 417, textureX, textureY); // Box 773
		ammoModel[191] = new ModelRendererTurbo(this, 1337, 417, textureX, textureY); // Box 774
		ammoModel[192] = new ModelRendererTurbo(this, 1009, 449, textureX, textureY); // Box 775
		ammoModel[193] = new ModelRendererTurbo(this, 433, 665, textureX, textureY); // Box 776
		ammoModel[194] = new ModelRendererTurbo(this, 657, 665, textureX, textureY); // Box 777
		ammoModel[195] = new ModelRendererTurbo(this, 1177, 673, textureX, textureY); // Box 778
		ammoModel[196] = new ModelRendererTurbo(this, 1953, 681, textureX, textureY); // Box 779
		ammoModel[197] = new ModelRendererTurbo(this, 561, 225, textureX, textureY); // Box 780
		ammoModel[198] = new ModelRendererTurbo(this, 689, 225, textureX, textureY); // Box 781
		ammoModel[199] = new ModelRendererTurbo(this, 1065, 233, textureX, textureY); // Box 782
		ammoModel[200] = new ModelRendererTurbo(this, 561, 241, textureX, textureY); // Box 783
		ammoModel[201] = new ModelRendererTurbo(this, 1337, 457, textureX, textureY); // Box 784
		ammoModel[202] = new ModelRendererTurbo(this, 417, 481, textureX, textureY); // Box 785
		ammoModel[203] = new ModelRendererTurbo(this, 1209, 497, textureX, textureY); // Box 786
		ammoModel[204] = new ModelRendererTurbo(this, 1513, 497, textureX, textureY); // Box 787
		ammoModel[205] = new ModelRendererTurbo(this, 1553, 497, textureX, textureY); // Box 788
		ammoModel[206] = new ModelRendererTurbo(this, 1593, 497, textureX, textureY); // Box 790
		ammoModel[207] = new ModelRendererTurbo(this, 1657, 505, textureX, textureY); // Box 791
		ammoModel[208] = new ModelRendererTurbo(this, 1697, 505, textureX, textureY); // Box 793
		ammoModel[209] = new ModelRendererTurbo(this, 849, 521, textureX, textureY); // Box 794
		ammoModel[210] = new ModelRendererTurbo(this, 889, 521, textureX, textureY); // Box 795
		ammoModel[211] = new ModelRendererTurbo(this, 929, 521, textureX, textureY); // Box 796
		ammoModel[212] = new ModelRendererTurbo(this, 969, 521, textureX, textureY); // Box 797
		ammoModel[213] = new ModelRendererTurbo(this, 1193, 521, textureX, textureY); // Box 799
		ammoModel[214] = new ModelRendererTurbo(this, 1329, 545, textureX, textureY); // Box 800
		ammoModel[215] = new ModelRendererTurbo(this, 1985, 681, textureX, textureY); // Box 801
		ammoModel[216] = new ModelRendererTurbo(this, 777, 697, textureX, textureY); // Box 802

		ammoModel[0].addShapeBox(0F, 0F, 1F, 82, 87, 125, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		ammoModel[0].setRotationPoint(-96F, -87F, -82F);

		ammoModel[1].addShapeBox(0F, 0F, 1F, 82, 37, 99, 0F,0F, -33F, 0F, 0F, -33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		ammoModel[1].setRotationPoint(-96F, -124F, -82F);

		ammoModel[2].addShapeBox(0F, 0F, 1F, 82, 37, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		ammoModel[2].setRotationPoint(-96F, -124F, 17F);

		ammoModel[3].addShapeBox(0F, 0F, 1F, 82, 5, 125, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 577
		ammoModel[3].setRotationPoint(-96F, 0F, -82F);

		ammoModel[4].addShapeBox(0F, 0F, 1F, 6, 5, 26, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		ammoModel[4].setRotationPoint(-96F, -129F, 17F);

		ammoModel[5].addShapeBox(0F, 0F, 1F, 82, 38, 99, 0F,-3F, -33F, 0F, -3F, -33F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -33F, 0F, 0F, -33F, 0F); // Box 579
		ammoModel[5].setRotationPoint(-96F, -129F, -82F);

		ammoModel[6].addShapeBox(0F, 0F, 1F, 82, 124, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 580
		ammoModel[6].setRotationPoint(-96F, -124F, 43F);

		ammoModel[7].addShapeBox(0F, 0F, 1F, 82, 5, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 581
		ammoModel[7].setRotationPoint(-96F, -129F, 43F);

		ammoModel[8].addShapeBox(0F, 0F, 1F, 82, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F); // Box 582
		ammoModel[8].setRotationPoint(-96F, 0F, 43F);

		ammoModel[9].addShapeBox(0F, 0F, 1F, 82, 91, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		ammoModel[9].setRotationPoint(-96F, -91F, -87F);

		ammoModel[10].addShapeBox(0F, 0F, 1F, 82, 5, 5, 0F,-6F, -1F, -2F, -6F, -1F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		ammoModel[10].setRotationPoint(-96F, -96F, -87F);

		ammoModel[11].addShapeBox(0F, 0F, 1F, 82, 5, 5, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 585
		ammoModel[11].setRotationPoint(-96F, 0F, -87F);

		ammoModel[12].addShapeBox(0F, 0F, 1F, 42, 38, 42, 0F,0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		ammoModel[12].setRotationPoint(-76F, -132F, -35F);

		ammoModel[13].addShapeBox(0F, 0F, 1F, 58, 3, 62, 0F,0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		ammoModel[13].setRotationPoint(-84F, -136F, -45F);

		ammoModel[14].addShapeBox(0F, 0F, 1F, 62, 6, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		ammoModel[14].setRotationPoint(-86F, -135F, 44F);

		ammoModel[15].addShapeBox(0F, 0F, 1F, 62, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		ammoModel[15].setRotationPoint(-86F, -137F, 40F);

		ammoModel[16].addShapeBox(0F, 0F, 1F, 62, 4, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		ammoModel[16].setRotationPoint(-86F, -141F, 40F);

		ammoModel[17].addShapeBox(0F, 0F, 1F, 62, 10, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		ammoModel[17].setRotationPoint(-86F, -135F, 19F);

		ammoModel[18].addShapeBox(0F, 0F, 1F, 62, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		ammoModel[18].setRotationPoint(-86F, -137F, 23F);

		ammoModel[19].addShapeBox(0F, 0F, 1F, 62, 4, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		ammoModel[19].setRotationPoint(-86F, -141F, 23F);

		ammoModel[20].addShapeBox(0F, 0F, 1F, 7, 5, 26, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		ammoModel[20].setRotationPoint(-21F, -129F, 17F);

		ammoModel[21].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		ammoModel[21].setRotationPoint(-87F, -222F, 7F);

		ammoModel[22].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		ammoModel[22].setRotationPoint(-87F, -217F, 7F);

		ammoModel[23].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 600
		ammoModel[23].setRotationPoint(-87F, -217F, 12F);

		ammoModel[24].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 601
		ammoModel[24].setRotationPoint(-87F, -222F, 12F);

		ammoModel[25].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 603
		ammoModel[25].setRotationPoint(-47F, -222F, 12F);

		ammoModel[26].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		ammoModel[26].setRotationPoint(-43F, -221F, 12F);

		ammoModel[27].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F); // Box 607
		ammoModel[27].setRotationPoint(-43F, -217F, 12F);

		ammoModel[28].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
		ammoModel[28].setRotationPoint(-43F, -217F, 8F);

		ammoModel[29].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		ammoModel[29].setRotationPoint(-43F, -221F, 8F);

		ammoModel[30].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F); // Box 610
		ammoModel[30].setRotationPoint(-47F, -217F, 12F);

		ammoModel[31].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 611
		ammoModel[31].setRotationPoint(-47F, -217F, 7F);

		ammoModel[32].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		ammoModel[32].setRotationPoint(-47F, -222F, 7F);

		ammoModel[33].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F); // Box 613
		ammoModel[33].setRotationPoint(-37F, -221F, 12F);

		ammoModel[34].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F); // Box 614
		ammoModel[34].setRotationPoint(-37F, -217F, 12F);

		ammoModel[35].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F); // Box 615
		ammoModel[35].setRotationPoint(-37F, -217F, 8F);

		ammoModel[36].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		ammoModel[36].setRotationPoint(-37F, -221F, 8F);

		ammoModel[37].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
		ammoModel[37].setRotationPoint(-89F, -222F, 7F);

		ammoModel[38].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 621
		ammoModel[38].setRotationPoint(-89F, -217F, 7F);

		ammoModel[39].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F); // Box 622
		ammoModel[39].setRotationPoint(-89F, -217F, 12F);

		ammoModel[40].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 623
		ammoModel[40].setRotationPoint(-89F, -222F, 12F);

		ammoModel[41].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 624
		ammoModel[41].setRotationPoint(-87F, -218F, 24F);

		ammoModel[42].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 625
		ammoModel[42].setRotationPoint(-87F, -213F, 24F);

		ammoModel[43].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 626
		ammoModel[43].setRotationPoint(-87F, -213F, 29F);

		ammoModel[44].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 627
		ammoModel[44].setRotationPoint(-87F, -218F, 29F);

		ammoModel[45].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 628
		ammoModel[45].setRotationPoint(-47F, -218F, 29F);

		ammoModel[46].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629
		ammoModel[46].setRotationPoint(-43F, -217F, 29F);

		ammoModel[47].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F); // Box 630
		ammoModel[47].setRotationPoint(-43F, -213F, 29F);

		ammoModel[48].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 631
		ammoModel[48].setRotationPoint(-43F, -213F, 25F);

		ammoModel[49].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 632
		ammoModel[49].setRotationPoint(-43F, -217F, 25F);

		ammoModel[50].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F); // Box 633
		ammoModel[50].setRotationPoint(-47F, -213F, 29F);

		ammoModel[51].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 634
		ammoModel[51].setRotationPoint(-47F, -213F, 24F);

		ammoModel[52].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 635
		ammoModel[52].setRotationPoint(-47F, -218F, 24F);

		ammoModel[53].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F); // Box 636
		ammoModel[53].setRotationPoint(-37F, -217F, 29F);

		ammoModel[54].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F); // Box 637
		ammoModel[54].setRotationPoint(-37F, -213F, 29F);

		ammoModel[55].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F); // Box 638
		ammoModel[55].setRotationPoint(-37F, -213F, 25F);

		ammoModel[56].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		ammoModel[56].setRotationPoint(-37F, -217F, 25F);

		ammoModel[57].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		ammoModel[57].setRotationPoint(-89F, -218F, 24F);

		ammoModel[58].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 641
		ammoModel[58].setRotationPoint(-89F, -213F, 24F);

		ammoModel[59].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F); // Box 642
		ammoModel[59].setRotationPoint(-89F, -213F, 29F);

		ammoModel[60].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 643
		ammoModel[60].setRotationPoint(-89F, -218F, 29F);

		ammoModel[61].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		ammoModel[61].setRotationPoint(-87F, -208F, 30F);

		ammoModel[62].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		ammoModel[62].setRotationPoint(-87F, -203F, 30F);

		ammoModel[63].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 646
		ammoModel[63].setRotationPoint(-87F, -203F, 35F);

		ammoModel[64].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
		ammoModel[64].setRotationPoint(-87F, -208F, 35F);

		ammoModel[65].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 648
		ammoModel[65].setRotationPoint(-47F, -208F, 35F);

		ammoModel[66].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 649
		ammoModel[66].setRotationPoint(-43F, -207F, 35F);

		ammoModel[67].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F); // Box 650
		ammoModel[67].setRotationPoint(-43F, -203F, 35F);

		ammoModel[68].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		ammoModel[68].setRotationPoint(-43F, -203F, 31F);

		ammoModel[69].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 652
		ammoModel[69].setRotationPoint(-43F, -207F, 31F);

		ammoModel[70].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F); // Box 653
		ammoModel[70].setRotationPoint(-47F, -203F, 35F);

		ammoModel[71].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 654
		ammoModel[71].setRotationPoint(-47F, -203F, 30F);

		ammoModel[72].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 655
		ammoModel[72].setRotationPoint(-47F, -208F, 30F);

		ammoModel[73].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F); // Box 656
		ammoModel[73].setRotationPoint(-37F, -207F, 35F);

		ammoModel[74].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F); // Box 657
		ammoModel[74].setRotationPoint(-37F, -203F, 35F);

		ammoModel[75].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F); // Box 658
		ammoModel[75].setRotationPoint(-37F, -203F, 31F);

		ammoModel[76].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		ammoModel[76].setRotationPoint(-37F, -207F, 31F);

		ammoModel[77].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		ammoModel[77].setRotationPoint(-89F, -208F, 30F);

		ammoModel[78].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 661
		ammoModel[78].setRotationPoint(-89F, -203F, 30F);

		ammoModel[79].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F); // Box 662
		ammoModel[79].setRotationPoint(-89F, -203F, 35F);

		ammoModel[80].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 663
		ammoModel[80].setRotationPoint(-89F, -208F, 35F);

		ammoModel[81].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 664
		ammoModel[81].setRotationPoint(-87F, -196F, 31F);

		ammoModel[82].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 665
		ammoModel[82].setRotationPoint(-87F, -191F, 31F);

		ammoModel[83].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 666
		ammoModel[83].setRotationPoint(-87F, -191F, 36F);

		ammoModel[84].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		ammoModel[84].setRotationPoint(-87F, -196F, 36F);

		ammoModel[85].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 668
		ammoModel[85].setRotationPoint(-47F, -196F, 36F);

		ammoModel[86].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 669
		ammoModel[86].setRotationPoint(-43F, -195F, 36F);

		ammoModel[87].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F); // Box 670
		ammoModel[87].setRotationPoint(-43F, -191F, 36F);

		ammoModel[88].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 671
		ammoModel[88].setRotationPoint(-43F, -191F, 32F);

		ammoModel[89].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 672
		ammoModel[89].setRotationPoint(-43F, -195F, 32F);

		ammoModel[90].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F); // Box 673
		ammoModel[90].setRotationPoint(-47F, -191F, 36F);

		ammoModel[91].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 674
		ammoModel[91].setRotationPoint(-47F, -191F, 31F);

		ammoModel[92].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 675
		ammoModel[92].setRotationPoint(-47F, -196F, 31F);

		ammoModel[93].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F); // Box 676
		ammoModel[93].setRotationPoint(-37F, -195F, 36F);

		ammoModel[94].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F); // Box 677
		ammoModel[94].setRotationPoint(-37F, -191F, 36F);

		ammoModel[95].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F); // Box 678
		ammoModel[95].setRotationPoint(-37F, -191F, 32F);

		ammoModel[96].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
		ammoModel[96].setRotationPoint(-37F, -195F, 32F);

		ammoModel[97].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
		ammoModel[97].setRotationPoint(-89F, -196F, 31F);

		ammoModel[98].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 681
		ammoModel[98].setRotationPoint(-89F, -191F, 31F);

		ammoModel[99].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F); // Box 682
		ammoModel[99].setRotationPoint(-89F, -191F, 36F);

		ammoModel[100].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 683
		ammoModel[100].setRotationPoint(-89F, -196F, 36F);

		ammoModel[101].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 684
		ammoModel[101].setRotationPoint(-87F, -183F, 32F);

		ammoModel[102].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 685
		ammoModel[102].setRotationPoint(-87F, -178F, 32F);

		ammoModel[103].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 686
		ammoModel[103].setRotationPoint(-87F, -178F, 37F);

		ammoModel[104].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 687
		ammoModel[104].setRotationPoint(-87F, -183F, 37F);

		ammoModel[105].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 688
		ammoModel[105].setRotationPoint(-47F, -183F, 37F);

		ammoModel[106].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		ammoModel[106].setRotationPoint(-43F, -182F, 37F);

		ammoModel[107].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F); // Box 690
		ammoModel[107].setRotationPoint(-43F, -178F, 37F);

		ammoModel[108].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		ammoModel[108].setRotationPoint(-43F, -178F, 33F);

		ammoModel[109].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692
		ammoModel[109].setRotationPoint(-43F, -182F, 33F);

		ammoModel[110].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F); // Box 693
		ammoModel[110].setRotationPoint(-47F, -178F, 37F);

		ammoModel[111].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 694
		ammoModel[111].setRotationPoint(-47F, -178F, 32F);

		ammoModel[112].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 695
		ammoModel[112].setRotationPoint(-47F, -183F, 32F);

		ammoModel[113].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F); // Box 696
		ammoModel[113].setRotationPoint(-37F, -182F, 37F);

		ammoModel[114].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F); // Box 697
		ammoModel[114].setRotationPoint(-37F, -178F, 37F);

		ammoModel[115].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F); // Box 698
		ammoModel[115].setRotationPoint(-37F, -178F, 33F);

		ammoModel[116].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 699
		ammoModel[116].setRotationPoint(-37F, -182F, 33F);

		ammoModel[117].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 700
		ammoModel[117].setRotationPoint(-89F, -183F, 32F);

		ammoModel[118].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 701
		ammoModel[118].setRotationPoint(-89F, -178F, 32F);

		ammoModel[119].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F); // Box 702
		ammoModel[119].setRotationPoint(-89F, -178F, 37F);

		ammoModel[120].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 703
		ammoModel[120].setRotationPoint(-89F, -183F, 37F);

		ammoModel[121].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704
		ammoModel[121].setRotationPoint(-87F, -170F, 29F);

		ammoModel[122].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 705
		ammoModel[122].setRotationPoint(-87F, -165F, 29F);

		ammoModel[123].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 706
		ammoModel[123].setRotationPoint(-87F, -165F, 34F);

		ammoModel[124].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 707
		ammoModel[124].setRotationPoint(-87F, -170F, 34F);

		ammoModel[125].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 708
		ammoModel[125].setRotationPoint(-47F, -170F, 34F);

		ammoModel[126].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 709
		ammoModel[126].setRotationPoint(-43F, -169F, 34F);

		ammoModel[127].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F); // Box 710
		ammoModel[127].setRotationPoint(-43F, -165F, 34F);

		ammoModel[128].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 711
		ammoModel[128].setRotationPoint(-43F, -165F, 30F);

		ammoModel[129].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 712
		ammoModel[129].setRotationPoint(-43F, -169F, 30F);

		ammoModel[130].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F); // Box 713
		ammoModel[130].setRotationPoint(-47F, -165F, 34F);

		ammoModel[131].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 714
		ammoModel[131].setRotationPoint(-47F, -165F, 29F);

		ammoModel[132].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 715
		ammoModel[132].setRotationPoint(-47F, -170F, 29F);

		ammoModel[133].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F); // Box 716
		ammoModel[133].setRotationPoint(-37F, -169F, 34F);

		ammoModel[134].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F); // Box 717
		ammoModel[134].setRotationPoint(-37F, -165F, 34F);

		ammoModel[135].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F); // Box 718
		ammoModel[135].setRotationPoint(-37F, -165F, 30F);

		ammoModel[136].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		ammoModel[136].setRotationPoint(-37F, -169F, 30F);

		ammoModel[137].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 720
		ammoModel[137].setRotationPoint(-89F, -170F, 29F);

		ammoModel[138].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 721
		ammoModel[138].setRotationPoint(-89F, -165F, 29F);

		ammoModel[139].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F); // Box 722
		ammoModel[139].setRotationPoint(-89F, -165F, 34F);

		ammoModel[140].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 723
		ammoModel[140].setRotationPoint(-89F, -170F, 34F);

		ammoModel[141].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 724
		ammoModel[141].setRotationPoint(-87F, -157F, 26F);

		ammoModel[142].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 725
		ammoModel[142].setRotationPoint(-87F, -152F, 26F);

		ammoModel[143].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 726
		ammoModel[143].setRotationPoint(-87F, -152F, 31F);

		ammoModel[144].addShapeBox(0F, 0F, 1F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 727
		ammoModel[144].setRotationPoint(-87F, -157F, 31F);

		ammoModel[145].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 728
		ammoModel[145].setRotationPoint(-47F, -157F, 31F);

		ammoModel[146].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		ammoModel[146].setRotationPoint(-43F, -156F, 31F);

		ammoModel[147].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F); // Box 730
		ammoModel[147].setRotationPoint(-43F, -152F, 31F);

		ammoModel[148].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		ammoModel[148].setRotationPoint(-43F, -152F, 27F);

		ammoModel[149].addShapeBox(0F, 0F, 1F, 6, 4, 4, 0F,0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 732
		ammoModel[149].setRotationPoint(-43F, -156F, 27F);

		ammoModel[150].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F); // Box 733
		ammoModel[150].setRotationPoint(-47F, -152F, 31F);

		ammoModel[151].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 734
		ammoModel[151].setRotationPoint(-47F, -152F, 26F);

		ammoModel[152].addShapeBox(0F, 0F, 1F, 4, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 735
		ammoModel[152].setRotationPoint(-47F, -157F, 26F);

		ammoModel[153].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F); // Box 736
		ammoModel[153].setRotationPoint(-37F, -156F, 31F);

		ammoModel[154].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F); // Box 737
		ammoModel[154].setRotationPoint(-37F, -152F, 31F);

		ammoModel[155].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F); // Box 738
		ammoModel[155].setRotationPoint(-37F, -152F, 27F);

		ammoModel[156].addShapeBox(0F, 0F, 1F, 15, 4, 4, 0F,0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 739
		ammoModel[156].setRotationPoint(-37F, -156F, 27F);

		ammoModel[157].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 740
		ammoModel[157].setRotationPoint(-89F, -157F, 26F);

		ammoModel[158].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 741
		ammoModel[158].setRotationPoint(-89F, -152F, 26F);

		ammoModel[159].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F); // Box 742
		ammoModel[159].setRotationPoint(-89F, -152F, 31F);

		ammoModel[160].addShapeBox(0F, 0F, 1F, 2, 5, 5, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 743
		ammoModel[160].setRotationPoint(-89F, -157F, 31F);

		ammoModel[161].addShapeBox(0F, 0F, 0F, 40, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 744
		ammoModel[161].setRotationPoint(-87F, -144F, 26F);

		ammoModel[162].addShapeBox(0F, 0F, 0F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 745
		ammoModel[162].setRotationPoint(-87F, -139F, 26F);

		ammoModel[163].addShapeBox(0F, 0F, 0F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 746
		ammoModel[163].setRotationPoint(-87F, -139F, 31F);

		ammoModel[164].addShapeBox(0F, 0F, 0F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 747
		ammoModel[164].setRotationPoint(-87F, -144F, 31F);

		ammoModel[165].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 748
		ammoModel[165].setRotationPoint(-47F, -144F, 31F);

		ammoModel[166].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 749
		ammoModel[166].setRotationPoint(-43F, -143F, 31F);

		ammoModel[167].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F); // Box 750
		ammoModel[167].setRotationPoint(-43F, -139F, 31F);

		ammoModel[168].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 751
		ammoModel[168].setRotationPoint(-43F, -139F, 27F);

		ammoModel[169].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 752
		ammoModel[169].setRotationPoint(-43F, -143F, 27F);

		ammoModel[170].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F); // Box 753
		ammoModel[170].setRotationPoint(-47F, -139F, 31F);

		ammoModel[171].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 754
		ammoModel[171].setRotationPoint(-47F, -139F, 26F);

		ammoModel[172].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 755
		ammoModel[172].setRotationPoint(-47F, -144F, 26F);

		ammoModel[173].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F,0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F); // Box 756
		ammoModel[173].setRotationPoint(-37F, -143F, 31F);

		ammoModel[174].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F); // Box 757
		ammoModel[174].setRotationPoint(-37F, -139F, 31F);

		ammoModel[175].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F); // Box 758
		ammoModel[175].setRotationPoint(-37F, -139F, 27F);

		ammoModel[176].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F,0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 759
		ammoModel[176].setRotationPoint(-37F, -143F, 27F);

		ammoModel[177].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		ammoModel[177].setRotationPoint(-89F, -144F, 26F);

		ammoModel[178].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 761
		ammoModel[178].setRotationPoint(-89F, -139F, 26F);

		ammoModel[179].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F); // Box 762
		ammoModel[179].setRotationPoint(-89F, -139F, 31F);

		ammoModel[180].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 763
		ammoModel[180].setRotationPoint(-89F, -144F, 31F);

		ammoModel[181].addShapeBox(0F, 0F, 0F, 40, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 764
		ammoModel[181].setRotationPoint(-87F, -133F, 26F);

		ammoModel[182].addShapeBox(0F, 0F, 0F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 765
		ammoModel[182].setRotationPoint(-87F, -128F, 26F);

		ammoModel[183].addShapeBox(0F, 0F, 0F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F); // Box 766
		ammoModel[183].setRotationPoint(-87F, -128F, 31F);

		ammoModel[184].addShapeBox(0F, 0F, 0F, 40, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		ammoModel[184].setRotationPoint(-87F, -133F, 31F);

		ammoModel[185].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 768
		ammoModel[185].setRotationPoint(-47F, -133F, 31F);

		ammoModel[186].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 769
		ammoModel[186].setRotationPoint(-43F, -132F, 31F);

		ammoModel[187].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F); // Box 770
		ammoModel[187].setRotationPoint(-43F, -128F, 31F);

		ammoModel[188].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 771
		ammoModel[188].setRotationPoint(-43F, -128F, 27F);

		ammoModel[189].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 772
		ammoModel[189].setRotationPoint(-43F, -132F, 27F);

		ammoModel[190].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.2F, -2.2F, 0F, -1.5F, -1.5F); // Box 773
		ammoModel[190].setRotationPoint(-47F, -128F, 31F);

		ammoModel[191].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 774
		ammoModel[191].setRotationPoint(-47F, -128F, 26F);

		ammoModel[192].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, -1.5F, -1.5F, 0F, -2.2F, -2.2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 775
		ammoModel[192].setRotationPoint(-47F, -133F, 26F);

		ammoModel[193].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F,0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F); // Box 776
		ammoModel[193].setRotationPoint(-37F, -132F, 31F);

		ammoModel[194].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, -3.8F, 0F, -1.25F, -1.25F); // Box 777
		ammoModel[194].setRotationPoint(-37F, -128F, 31F);

		ammoModel[195].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F); // Box 778
		ammoModel[195].setRotationPoint(-37F, -128F, 27F);

		ammoModel[196].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F,0F, -1.25F, -1.25F, 0F, -3.8F, -3.8F, 0F, -3.8F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -3.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 779
		ammoModel[196].setRotationPoint(-37F, -132F, 27F);

		ammoModel[197].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 780
		ammoModel[197].setRotationPoint(-89F, -133F, 26F);

		ammoModel[198].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 781
		ammoModel[198].setRotationPoint(-89F, -128F, 26F);

		ammoModel[199].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F); // Box 782
		ammoModel[199].setRotationPoint(-89F, -128F, 31F);

		ammoModel[200].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 783
		ammoModel[200].setRotationPoint(-89F, -133F, 31F);

		ammoModel[201].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 784
		ammoModel[201].setRotationPoint(-82F, -149F, 28F);

		ammoModel[202].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 785
		ammoModel[202].setRotationPoint(-82F, -136F, 28F);

		ammoModel[203].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		ammoModel[203].setRotationPoint(-57F, -136F, 28F);

		ammoModel[204].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 787
		ammoModel[204].setRotationPoint(-57F, -149F, 28F);

		ammoModel[205].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 788
		ammoModel[205].setRotationPoint(-82F, -162F, 29F);

		ammoModel[206].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 790
		ammoModel[206].setRotationPoint(-57F, -162F, 29F);

		ammoModel[207].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		ammoModel[207].setRotationPoint(-82F, -175F, 32F);

		ammoModel[208].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 793
		ammoModel[208].setRotationPoint(-57F, -175F, 32F);

		ammoModel[209].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 794
		ammoModel[209].setRotationPoint(-82F, -188F, 32F);

		ammoModel[210].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 795
		ammoModel[210].setRotationPoint(-57F, -188F, 32F);

		ammoModel[211].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 796
		ammoModel[211].setRotationPoint(-82F, -201F, 34F);

		ammoModel[212].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 797
		ammoModel[212].setRotationPoint(-57F, -201F, 34F);

		ammoModel[213].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 799
		ammoModel[213].setRotationPoint(-82F, -213F, 30F);

		ammoModel[214].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 800
		ammoModel[214].setRotationPoint(-57F, -213F, 30F);

		ammoModel[215].addShapeBox(0F, 0F, 0F, 6, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 801
		ammoModel[215].setRotationPoint(-57F, -220F, 16F);

		ammoModel[216].addShapeBox(0F, 0F, 0F, 6, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 802
		ammoModel[216].setRotationPoint(-82F, -220F, 16F);
	}

	private void initbreakActionModel_1()
	{
		breakActionModel[0] = new ModelRendererTurbo(this, 1561, 145, textureX, textureY); // Box 294
		breakActionModel[1] = new ModelRendererTurbo(this, 1881, 201, textureX, textureY); // Box 350
		breakActionModel[2] = new ModelRendererTurbo(this, 169, 257, textureX, textureY); // Box 351
		breakActionModel[3] = new ModelRendererTurbo(this, 729, 297, textureX, textureY); // Box 352
		breakActionModel[4] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 353
		breakActionModel[5] = new ModelRendererTurbo(this, 1057, 153, textureX, textureY); // Box 354
		breakActionModel[6] = new ModelRendererTurbo(this, 1049, 177, textureX, textureY); // Box 355
		breakActionModel[7] = new ModelRendererTurbo(this, 1657, 401, textureX, textureY); // Box 357
		breakActionModel[8] = new ModelRendererTurbo(this, 1921, 201, textureX, textureY); // Box 371
		breakActionModel[9] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Box 372
		breakActionModel[10] = new ModelRendererTurbo(this, 1841, 257, textureX, textureY); // Box 378
		breakActionModel[11] = new ModelRendererTurbo(this, 1233, 385, textureX, textureY); // Box 383
		breakActionModel[12] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 384
		breakActionModel[13] = new ModelRendererTurbo(this, 705, 193, textureX, textureY); // Box 385
		breakActionModel[14] = new ModelRendererTurbo(this, 825, 401, textureX, textureY); // Box 386
		breakActionModel[15] = new ModelRendererTurbo(this, 1097, 393, textureX, textureY); // Box 388
		breakActionModel[16] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 392
		breakActionModel[17] = new ModelRendererTurbo(this, 961, 345, textureX, textureY); // Box 393
		breakActionModel[18] = new ModelRendererTurbo(this, 825, 433, textureX, textureY); // Box 394
		breakActionModel[19] = new ModelRendererTurbo(this, 1937, 409, textureX, textureY); // Box 395
		breakActionModel[20] = new ModelRendererTurbo(this, 609, 345, textureX, textureY); // Box 396
		breakActionModel[21] = new ModelRendererTurbo(this, 593, 417, textureX, textureY); // Box 397
		breakActionModel[22] = new ModelRendererTurbo(this, 1393, 281, textureX, textureY); // Box 398
		breakActionModel[23] = new ModelRendererTurbo(this, 1489, 529, textureX, textureY); // Box 395
		breakActionModel[24] = new ModelRendererTurbo(this, 1, 545, textureX, textureY); // Box 396
		breakActionModel[25] = new ModelRendererTurbo(this, 1257, 257, textureX, textureY); // Box 397
		breakActionModel[26] = new ModelRendererTurbo(this, 1041, 385, textureX, textureY); // Box 398
		breakActionModel[27] = new ModelRendererTurbo(this, 569, 393, textureX, textureY); // Box 399
		breakActionModel[28] = new ModelRendererTurbo(this, 985, 393, textureX, textureY); // Box 400
		breakActionModel[29] = new ModelRendererTurbo(this, 1929, 401, textureX, textureY); // Box 401
		breakActionModel[30] = new ModelRendererTurbo(this, 2009, 401, textureX, textureY); // Box 402
		breakActionModel[31] = new ModelRendererTurbo(this, 2009, 425, textureX, textureY); // Box 403
		breakActionModel[32] = new ModelRendererTurbo(this, 1985, 457, textureX, textureY); // Box 404
		breakActionModel[33] = new ModelRendererTurbo(this, 497, 465, textureX, textureY); // Box 405
		breakActionModel[34] = new ModelRendererTurbo(this, 569, 465, textureX, textureY); // Box 406
		breakActionModel[35] = new ModelRendererTurbo(this, 673, 465, textureX, textureY); // Box 407
		breakActionModel[36] = new ModelRendererTurbo(this, 1465, 465, textureX, textureY); // Box 408
		breakActionModel[37] = new ModelRendererTurbo(this, 1537, 465, textureX, textureY); // Box 409
		breakActionModel[38] = new ModelRendererTurbo(this, 1609, 465, textureX, textureY); // Box 410
		breakActionModel[39] = new ModelRendererTurbo(this, 1745, 465, textureX, textureY); // Box 411
		breakActionModel[40] = new ModelRendererTurbo(this, 1857, 465, textureX, textureY); // Box 412
		breakActionModel[41] = new ModelRendererTurbo(this, 2009, 465, textureX, textureY); // Box 413
		breakActionModel[42] = new ModelRendererTurbo(this, 1249, 481, textureX, textureY); // Box 414
		breakActionModel[43] = new ModelRendererTurbo(this, 969, 497, textureX, textureY); // Box 415
		breakActionModel[44] = new ModelRendererTurbo(this, 1185, 497, textureX, textureY); // Box 416
		breakActionModel[45] = new ModelRendererTurbo(this, 1225, 497, textureX, textureY); // Box 417
		breakActionModel[46] = new ModelRendererTurbo(this, 1489, 497, textureX, textureY); // Box 418
		breakActionModel[47] = new ModelRendererTurbo(this, 1529, 497, textureX, textureY); // Box 419
		breakActionModel[48] = new ModelRendererTurbo(this, 1569, 497, textureX, textureY); // Box 420
		breakActionModel[49] = new ModelRendererTurbo(this, 1609, 497, textureX, textureY); // Box 421
		breakActionModel[50] = new ModelRendererTurbo(this, 1249, 505, textureX, textureY); // Box 422
		breakActionModel[51] = new ModelRendererTurbo(this, 1633, 505, textureX, textureY); // Box 423
		breakActionModel[52] = new ModelRendererTurbo(this, 1673, 505, textureX, textureY); // Box 424
		breakActionModel[53] = new ModelRendererTurbo(this, 1713, 505, textureX, textureY); // Box 425
		breakActionModel[54] = new ModelRendererTurbo(this, 2009, 513, textureX, textureY); // Box 426
		breakActionModel[55] = new ModelRendererTurbo(this, 825, 521, textureX, textureY); // Box 427
		breakActionModel[56] = new ModelRendererTurbo(this, 865, 521, textureX, textureY); // Box 428
		breakActionModel[57] = new ModelRendererTurbo(this, 905, 521, textureX, textureY); // Box 429
		breakActionModel[58] = new ModelRendererTurbo(this, 945, 521, textureX, textureY); // Box 430
		breakActionModel[59] = new ModelRendererTurbo(this, 985, 521, textureX, textureY); // Box 431
		breakActionModel[60] = new ModelRendererTurbo(this, 1169, 521, textureX, textureY); // Box 432
		breakActionModel[61] = new ModelRendererTurbo(this, 1209, 521, textureX, textureY); // Box 433
		breakActionModel[62] = new ModelRendererTurbo(this, 1097, 529, textureX, textureY); // Box 434
		breakActionModel[63] = new ModelRendererTurbo(this, 1809, 185, textureX, textureY); // Box 453
		breakActionModel[64] = new ModelRendererTurbo(this, 1785, 633, textureX, textureY); // Box 524
		breakActionModel[65] = new ModelRendererTurbo(this, 1, 649, textureX, textureY); // Box 525
		breakActionModel[66] = new ModelRendererTurbo(this, 105, 649, textureX, textureY); // Box 526
		breakActionModel[67] = new ModelRendererTurbo(this, 185, 649, textureX, textureY); // Box 527
		breakActionModel[68] = new ModelRendererTurbo(this, 257, 649, textureX, textureY); // Box 528
		breakActionModel[69] = new ModelRendererTurbo(this, 1049, 345, textureX, textureY); // Box 529
		breakActionModel[70] = new ModelRendererTurbo(this, 1561, 217, textureX, textureY); // Box 530
		breakActionModel[71] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Box 531
		breakActionModel[72] = new ModelRendererTurbo(this, 1097, 433, textureX, textureY); // Box 532
		breakActionModel[73] = new ModelRendererTurbo(this, 1065, 1, textureX, textureY); // Box 621
		breakActionModel[74] = new ModelRendererTurbo(this, 1161, 1, textureX, textureY); // Box 625
		breakActionModel[75] = new ModelRendererTurbo(this, 1265, 1, textureX, textureY); // Box 641
		breakActionModel[76] = new ModelRendererTurbo(this, 1321, 1, textureX, textureY); // Box 642
		breakActionModel[77] = new ModelRendererTurbo(this, 1369, 1, textureX, textureY); // Box 643
		breakActionModel[78] = new ModelRendererTurbo(this, 1473, 1, textureX, textureY); // Box 644
		breakActionModel[79] = new ModelRendererTurbo(this, 1529, 1, textureX, textureY); // Box 645
		breakActionModel[80] = new ModelRendererTurbo(this, 1553, 1, textureX, textureY); // Box 646
		breakActionModel[81] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Box 647
		breakActionModel[82] = new ModelRendererTurbo(this, 1737, 1, textureX, textureY); // Box 648
		breakActionModel[83] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 649
		breakActionModel[84] = new ModelRendererTurbo(this, 1953, 1, textureX, textureY); // Box 650
		breakActionModel[85] = new ModelRendererTurbo(this, 1961, 9, textureX, textureY); // Box 651
		breakActionModel[86] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 652
		breakActionModel[87] = new ModelRendererTurbo(this, 1857, 1, textureX, textureY); // Box 653
		breakActionModel[88] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Box 654
		breakActionModel[89] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Box 549
		breakActionModel[90] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 550
		breakActionModel[91] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 551
		breakActionModel[92] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 552
		breakActionModel[93] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Box 553
		breakActionModel[94] = new ModelRendererTurbo(this, 1961, 65, textureX, textureY); // Box 554
		breakActionModel[95] = new ModelRendererTurbo(this, 1809, 33, textureX, textureY); // Box 555
		breakActionModel[96] = new ModelRendererTurbo(this, 1873, 33, textureX, textureY); // Box 556
		breakActionModel[97] = new ModelRendererTurbo(this, 1273, 433, textureX, textureY); // Box 803
		breakActionModel[98] = new ModelRendererTurbo(this, 1097, 457, textureX, textureY); // Box 804
		breakActionModel[99] = new ModelRendererTurbo(this, 1337, 433, textureX, textureY); // Box 805
		breakActionModel[100] = new ModelRendererTurbo(this, 521, 465, textureX, textureY); // Box 806
		breakActionModel[101] = new ModelRendererTurbo(this, 593, 465, textureX, textureY); // Box 807
		breakActionModel[102] = new ModelRendererTurbo(this, 1385, 465, textureX, textureY); // Box 808
		breakActionModel[103] = new ModelRendererTurbo(this, 1489, 465, textureX, textureY); // Box 809
		breakActionModel[104] = new ModelRendererTurbo(this, 1561, 465, textureX, textureY); // Box 810
		breakActionModel[105] = new ModelRendererTurbo(this, 1633, 465, textureX, textureY); // Box 811
		breakActionModel[106] = new ModelRendererTurbo(this, 1769, 465, textureX, textureY); // Box 812
		breakActionModel[107] = new ModelRendererTurbo(this, 993, 497, textureX, textureY); // Box 813
		breakActionModel[108] = new ModelRendererTurbo(this, 2025, 561, textureX, textureY); // Box 814
		breakActionModel[109] = new ModelRendererTurbo(this, 825, 473, textureX, textureY); // Box 815
		breakActionModel[110] = new ModelRendererTurbo(this, 1097, 473, textureX, textureY); // Box 816
		breakActionModel[111] = new ModelRendererTurbo(this, 793, 569, textureX, textureY); // Box 817
		breakActionModel[112] = new ModelRendererTurbo(this, 2025, 577, textureX, textureY); // Box 818
		breakActionModel[113] = new ModelRendererTurbo(this, 1737, 505, textureX, textureY); // Box 819
		breakActionModel[114] = new ModelRendererTurbo(this, 553, 809, textureX, textureY); // Box 827
		breakActionModel[115] = new ModelRendererTurbo(this, 89, 689, textureX, textureY); // Box 828

		breakActionModel[0].addShapeBox(0F, 0F, 1F, 156, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		breakActionModel[0].setRotationPoint(-245F, -237F, -15F);

		breakActionModel[1].addShapeBox(0F, 0F, 1F, 15, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 350
		breakActionModel[1].setRotationPoint(-260F, -237F, -15F);

		breakActionModel[2].addShapeBox(0F, 0F, 1F, 40, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		breakActionModel[2].setRotationPoint(-88F, -237F, -19F);

		breakActionModel[3].addShapeBox(0F, 0F, 1F, 27, 26, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		breakActionModel[3].setRotationPoint(-48F, -237F, -19F);

		breakActionModel[4].addShapeBox(0F, 0F, 1F, 12, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		breakActionModel[4].setRotationPoint(-21F, -237F, -19F);

		breakActionModel[5].addShapeBox(0F, 0F, 1F, 4, 11, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 354
		breakActionModel[5].setRotationPoint(-9F, -237F, -19F);

		breakActionModel[6].addShapeBox(0F, 0F, 1F, 9, 23, 4, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		breakActionModel[6].setRotationPoint(-97F, -237F, -19F);

		breakActionModel[7].addShapeBox(0F, 0F, 1F, 119, 1, 28, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		breakActionModel[7].setRotationPoint(-264F, -238F, -15F);

		breakActionModel[8].addShapeBox(0F, 0F, 1F, 15, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 371
		breakActionModel[8].setRotationPoint(-260F, -237F, 11F);

		breakActionModel[9].addShapeBox(0F, 0F, 1F, 154, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		breakActionModel[9].setRotationPoint(-245F, -237F, 11F);

		breakActionModel[10].addShapeBox(0F, 0F, 1F, 10, 12, 28, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		breakActionModel[10].setRotationPoint(-270F, -237F, -15F);

		breakActionModel[11].addShapeBox(0F, 0F, 1F, 54, 23, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -48F, 0F, 0F); // Box 383
		breakActionModel[11].setRotationPoint(-145F, -237F, 13F);

		breakActionModel[12].addShapeBox(0F, 0F, 1F, 12, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		breakActionModel[12].setRotationPoint(-21F, -237F, 11F);

		breakActionModel[13].addShapeBox(0F, 0F, 1F, 4, 11, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 385
		breakActionModel[13].setRotationPoint(-9F, -237F, 11F);

		breakActionModel[14].addShapeBox(0F, 0F, 1F, 70, 11, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		breakActionModel[14].setRotationPoint(-91F, -237F, 11F);

		breakActionModel[15].addShapeBox(0F, 0F, 1F, 48, 1, 36, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 388
		breakActionModel[15].setRotationPoint(-145F, -238F, -15F);

		breakActionModel[16].addShapeBox(0F, 0F, 1F, 70, 1, 11, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		breakActionModel[16].setRotationPoint(-91F, -238F, 19F);

		breakActionModel[17].addShapeBox(0F, 0F, 1F, 6, 1, 40, 0F,0F, 0F, -5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 393
		breakActionModel[17].setRotationPoint(-97F, -238F, -19F);

		breakActionModel[18].addShapeBox(0F, 0F, 1F, 69, 1, 38, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 394
		breakActionModel[18].setRotationPoint(-91F, -238F, -19F);

		breakActionModel[19].addShapeBox(0F, 0F, 1F, 13, 1, 39, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		breakActionModel[19].setRotationPoint(-22F, -238F, -19F);

		breakActionModel[20].addShapeBox(0F, 0F, 1F, 70, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 396
		breakActionModel[20].setRotationPoint(-91F, -237F, 30F);

		breakActionModel[21].addShapeBox(0F, 0F, 1F, 70, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 397
		breakActionModel[21].setRotationPoint(-91F, -236F, 32F);

		breakActionModel[22].addShapeBox(0F, 0F, 1F, 70, 7, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 398
		breakActionModel[22].setRotationPoint(-91F, -235F, 34F);

		breakActionModel[23].addShapeBox(0F, 0F, 0F, 225, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 395
		breakActionModel[23].setRotationPoint(-256F, -242F, -8F);

		breakActionModel[24].addShapeBox(0F, 0F, 0F, 225, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 396
		breakActionModel[24].setRotationPoint(-256F, -240F, -7F);

		breakActionModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		breakActionModel[25].setRotationPoint(-34F, -244F, -8F);

		breakActionModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		breakActionModel[26].setRotationPoint(-46F, -244F, -8F);

		breakActionModel[27].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		breakActionModel[27].setRotationPoint(-40F, -244F, -8F);

		breakActionModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		breakActionModel[28].setRotationPoint(-70F, -244F, -8F);

		breakActionModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		breakActionModel[29].setRotationPoint(-64F, -244F, -8F);

		breakActionModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		breakActionModel[30].setRotationPoint(-58F, -244F, -8F);

		breakActionModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		breakActionModel[31].setRotationPoint(-52F, -244F, -8F);

		breakActionModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		breakActionModel[32].setRotationPoint(-118F, -244F, -8F);

		breakActionModel[33].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		breakActionModel[33].setRotationPoint(-112F, -244F, -8F);

		breakActionModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		breakActionModel[34].setRotationPoint(-106F, -244F, -8F);

		breakActionModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		breakActionModel[35].setRotationPoint(-100F, -244F, -8F);

		breakActionModel[36].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		breakActionModel[36].setRotationPoint(-94F, -244F, -8F);

		breakActionModel[37].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		breakActionModel[37].setRotationPoint(-88F, -244F, -8F);

		breakActionModel[38].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		breakActionModel[38].setRotationPoint(-82F, -244F, -8F);

		breakActionModel[39].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		breakActionModel[39].setRotationPoint(-76F, -244F, -8F);

		breakActionModel[40].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		breakActionModel[40].setRotationPoint(-214F, -244F, -8F);

		breakActionModel[41].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		breakActionModel[41].setRotationPoint(-208F, -244F, -8F);

		breakActionModel[42].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		breakActionModel[42].setRotationPoint(-202F, -244F, -8F);

		breakActionModel[43].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		breakActionModel[43].setRotationPoint(-196F, -244F, -8F);

		breakActionModel[44].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		breakActionModel[44].setRotationPoint(-190F, -244F, -8F);

		breakActionModel[45].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		breakActionModel[45].setRotationPoint(-184F, -244F, -8F);

		breakActionModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		breakActionModel[46].setRotationPoint(-178F, -244F, -8F);

		breakActionModel[47].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		breakActionModel[47].setRotationPoint(-172F, -244F, -8F);

		breakActionModel[48].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		breakActionModel[48].setRotationPoint(-166F, -244F, -8F);

		breakActionModel[49].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		breakActionModel[49].setRotationPoint(-160F, -244F, -8F);

		breakActionModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		breakActionModel[50].setRotationPoint(-154F, -244F, -8F);

		breakActionModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		breakActionModel[51].setRotationPoint(-148F, -244F, -8F);

		breakActionModel[52].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		breakActionModel[52].setRotationPoint(-142F, -244F, -8F);

		breakActionModel[53].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		breakActionModel[53].setRotationPoint(-136F, -244F, -8F);

		breakActionModel[54].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		breakActionModel[54].setRotationPoint(-130F, -244F, -8F);

		breakActionModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		breakActionModel[55].setRotationPoint(-124F, -244F, -8F);

		breakActionModel[56].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		breakActionModel[56].setRotationPoint(-244F, -244F, -8F);

		breakActionModel[57].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		breakActionModel[57].setRotationPoint(-238F, -244F, -8F);

		breakActionModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		breakActionModel[58].setRotationPoint(-232F, -244F, -8F);

		breakActionModel[59].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		breakActionModel[59].setRotationPoint(-226F, -244F, -8F);

		breakActionModel[60].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		breakActionModel[60].setRotationPoint(-220F, -244F, -8F);

		breakActionModel[61].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		breakActionModel[61].setRotationPoint(-250F, -244F, -8F);

		breakActionModel[62].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		breakActionModel[62].setRotationPoint(-256F, -244F, -8F);

		breakActionModel[63].addShapeBox(0F, 0F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		breakActionModel[63].setRotationPoint(-34F, -242F, -3F);

		breakActionModel[64].addShapeBox(0F, 0F, 0F, 39, 6, 22, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		breakActionModel[64].setRotationPoint(-245F, -244F, -11F);

		breakActionModel[65].addShapeBox(0F, 0F, 0F, 38, 2, 22, 0F,-1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		breakActionModel[65].setRotationPoint(-244F, -246F, -11F);

		breakActionModel[66].addShapeBox(0F, 0F, 0F, 37, 11, 2, 0F,-14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		breakActionModel[66].setRotationPoint(-243F, -257F, -9F);

		breakActionModel[67].addShapeBox(0F, 0F, 0F, 37, 11, 2, 0F,-14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		breakActionModel[67].setRotationPoint(-243F, -257F, 7F);

		breakActionModel[68].addShapeBox(0F, 0F, 0F, 28, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		breakActionModel[68].setRotationPoint(-237F, -257F, -7F);

		breakActionModel[69].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 529
		breakActionModel[69].setRotationPoint(-239F, -257F, -7F);

		breakActionModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 530
		breakActionModel[70].setRotationPoint(-240F, -256F, -7F);

		breakActionModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 531
		breakActionModel[71].setRotationPoint(-207F, -256F, -7F);

		breakActionModel[72].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 532
		breakActionModel[72].setRotationPoint(-209F, -257F, -7F);

		breakActionModel[73].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.3F, -2.05F, 0F, -2.3F, -2.05F); // Box 621
		breakActionModel[73].setRotationPoint(-241.05F, -264F, 0F);

		breakActionModel[74].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -0.525F, -2.475F, 0F, -0.525F, -2.475F, 0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, -1.75F, -1.75F, 0F, -1.75F, -1.75F, 0F, -0.95F, -1.7F, 0F, -0.95F, -1.7F); // Box 625
		breakActionModel[74].setRotationPoint(-241.05F, -263F, 0F);

		breakActionModel[75].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, -1.7F, -0.95F, 0F, -1.7F, -0.95F, 0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, -1.75F, -1.75F, 0F, -1.75F, -1.75F, 0F, -2.475F, -0.525F, 0F, -2.475F, -0.525F); // Box 641
		breakActionModel[75].setRotationPoint(-241.05F, -264F, 0F);

		breakActionModel[76].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -2.05F, -2.3F, 0F, -2.05F, -2.3F, 0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 642
		breakActionModel[76].setRotationPoint(-241.05F, -263F, 0F);

		breakActionModel[77].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.05F, -2.3F, 0F, -2.05F, -2.3F, 0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F); // Box 643
		breakActionModel[77].setRotationPoint(-241.05F, -260F, 0F);

		breakActionModel[78].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -1.75F, -1.75F, 0F, -1.75F, -1.75F, 0F, -0.95F, -1.7F, 0F, -0.95F, -1.7F, 0F, -0.525F, -2.475F, 0F, -0.525F, -2.475F, 0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F); // Box 644
		breakActionModel[78].setRotationPoint(-241.05F, -260F, 0F);

		breakActionModel[79].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, -1.75F, -1.75F, 0F, -1.75F, -1.75F, 0F, -2.475F, -0.525F, 0F, -2.475F, -0.525F, 0F, -1.7F, -0.95F, 0F, -1.7F, -0.95F, 0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F); // Box 645
		breakActionModel[79].setRotationPoint(-241.05F, -260F, 0F);

		breakActionModel[80].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.3F, -2.05F, 0F, -2.3F, -2.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F); // Box 646
		breakActionModel[80].setRotationPoint(-241.05F, -260F, 0F);

		breakActionModel[81].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, -2.475F, -0.525F, 0F, -2.475F, -0.525F, 0F, -1.75F, -1.75F, 0F, -1.75F, -1.75F, 0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, -1.7F, -0.95F, 0F, -1.7F, -0.95F); // Box 647
		breakActionModel[81].setRotationPoint(-241.05F, -260F, -3F);

		breakActionModel[82].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, -2.3F, -2.05F, 0F, -2.3F, -2.05F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 648
		breakActionModel[82].setRotationPoint(-241.05F, -260F, -3F);

		breakActionModel[83].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -0.95F, -1.7F, 0F, -0.95F, -1.7F, 0F, -1.75F, -1.75F, 0F, -1.75F, -1.75F, 0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, -0.525F, -2.475F, 0F, -0.525F, -2.475F); // Box 649
		breakActionModel[83].setRotationPoint(-241.05F, -260F, -4F);

		breakActionModel[84].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, -2.05F, -2.3F, 0F, -2.05F, -2.3F); // Box 650
		breakActionModel[84].setRotationPoint(-241.05F, -260F, -4F);

		breakActionModel[85].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, -2.05F, -2.3F, 0F, -2.05F, -2.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 651
		breakActionModel[85].setRotationPoint(-241.05F, -263F, -4F);

		breakActionModel[86].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, -0.525F, -2.475F, 0F, -0.525F, -2.475F, 0F, -0.95F, -1.7F, 0F, -0.95F, -1.7F, 0F, -1.75F, -1.75F, 0F, -1.75F, -1.75F); // Box 652
		breakActionModel[86].setRotationPoint(-241.05F, -263F, -4F);

		breakActionModel[87].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, -1.7F, -0.95F, 0F, -1.7F, -0.95F, 0F, -2.475F, -0.525F, 0F, -2.475F, -0.525F, 0F, -1.75F, -1.75F, 0F, -1.75F, -1.75F); // Box 653
		breakActionModel[87].setRotationPoint(-241.05F, -264F, -3F);

		breakActionModel[88].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.3F, -2.05F, 0F, -2.3F, -2.05F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 654
		breakActionModel[88].setRotationPoint(-241.05F, -264F, -3F);

		breakActionModel[89].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 549
		breakActionModel[89].setRotationPoint(-241F, -259F, 1F);

		breakActionModel[90].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		breakActionModel[90].setRotationPoint(-241F, -259F, -7F);

		breakActionModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		breakActionModel[91].setRotationPoint(-241F, -258F, -2F);

		breakActionModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 552
		breakActionModel[92].setRotationPoint(-241F, -258F, 0F);

		breakActionModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 553
		breakActionModel[93].setRotationPoint(-239F, -258F, -7F);

		breakActionModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 554
		breakActionModel[94].setRotationPoint(-236F, -258F, -7F);

		breakActionModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		breakActionModel[95].setRotationPoint(-241F, -256F, -4F);

		breakActionModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 556
		breakActionModel[96].setRotationPoint(-241F, -254F, -4F);

		breakActionModel[97].addShapeBox(0F, -2F, 0F, 8, 6, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F); // Box 803
		breakActionModel[97].setRotationPoint(-237F, -249F, 11F);

		breakActionModel[98].addShapeBox(0F, -2F, 0F, 6, 8, 3, 0F,-3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F); // Box 804
		breakActionModel[98].setRotationPoint(-235F, -257F, 11F);

		breakActionModel[99].addShapeBox(0F, -2F, 0F, 8, 6, 3, 0F,-1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 805
		breakActionModel[99].setRotationPoint(-237F, -255F, 11F);

		breakActionModel[100].addShapeBox(0F, -2F, 0F, 6, 8, 3, 0F,0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F); // Box 806
		breakActionModel[100].setRotationPoint(-229F, -257F, 11F);

		breakActionModel[101].addShapeBox(0F, -2F, 0F, 8, 6, 3, 0F,-5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 807
		breakActionModel[101].setRotationPoint(-229F, -255F, 11F);

		breakActionModel[102].addShapeBox(0F, -2F, 0F, 8, 6, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F); // Box 808
		breakActionModel[102].setRotationPoint(-229F, -249F, 11F);

		breakActionModel[103].addShapeBox(0F, -2F, 0F, 6, 8, 3, 0F,0F, 0F, 0F, -0.75F, -5.25F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F); // Box 809
		breakActionModel[103].setRotationPoint(-229F, -249F, 11F);

		breakActionModel[104].addShapeBox(0F, -2F, 0F, 6, 8, 3, 0F,-0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F); // Box 810
		breakActionModel[104].setRotationPoint(-235F, -249F, 11F);

		breakActionModel[105].addShapeBox(0F, -2F, 0F, 6, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 811
		breakActionModel[105].setRotationPoint(-232F, -252F, 8F);

		breakActionModel[106].addShapeBox(0F, -2F, 0F, 6, 8, 3, 0F,0F, 0F, 0F, -0.75F, -5.25F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F); // Box 812
		breakActionModel[106].setRotationPoint(-229F, -249F, -12F);

		breakActionModel[107].addShapeBox(0F, -2F, 0F, 8, 6, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F); // Box 813
		breakActionModel[107].setRotationPoint(-229F, -249F, -12F);

		breakActionModel[108].addShapeBox(0F, -2F, 0F, 8, 6, 3, 0F,-5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 814
		breakActionModel[108].setRotationPoint(-229F, -255F, -12F);

		breakActionModel[109].addShapeBox(0F, -2F, 0F, 6, 8, 3, 0F,0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F); // Box 815
		breakActionModel[109].setRotationPoint(-229F, -257F, -12F);

		breakActionModel[110].addShapeBox(0F, -2F, 0F, 6, 8, 3, 0F,-3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F); // Box 816
		breakActionModel[110].setRotationPoint(-235F, -257F, -12F);

		breakActionModel[111].addShapeBox(0F, -2F, 0F, 8, 6, 3, 0F,-1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 817
		breakActionModel[111].setRotationPoint(-237F, -255F, -12F);

		breakActionModel[112].addShapeBox(0F, -2F, 0F, 8, 6, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F); // Box 818
		breakActionModel[112].setRotationPoint(-237F, -249F, -12F);

		breakActionModel[113].addShapeBox(0F, -2F, 0F, 6, 8, 3, 0F,-0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F); // Box 819
		breakActionModel[113].setRotationPoint(-235F, -249F, -12F);

		breakActionModel[114].addShapeBox(0F, 0F, 1F, 6, 6, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 827
		breakActionModel[114].setRotationPoint(-18F, -235F, -21F);

		breakActionModel[115].addShapeBox(0F, 0F, 1F, 9, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 828
		breakActionModel[115].setRotationPoint(-84F, -239F, 8F);
	}
}