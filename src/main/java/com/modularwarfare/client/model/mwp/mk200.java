//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MK200
// Model Creator: 
// Created on: 21.02.2017 - 19:12:03
// Last changed on: 21.02.2017 - 19:12:03

package com.modularwarfare.client.model.mwp; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class mk200 extends ModelGun //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public mk200() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[535];
		ammoModel = new ModelRendererTurbo[84];
		breakActionModel = new ModelRendererTurbo[16];

		initgunModel_1();
		initgunModel_2();
		initammoModel_1();
		initbreakActionModel_1();

		thirdPersonOffset = new Vector3f(4 /16F, -1F /16F, 0F /16F);

        modelScale = 0.045F;
		//gunSlideDistance = 5.25F;

        leftArmPos = new Vector3f(0.10F, -0.18F, -0.45F);
        leftArmRot = new Vector3f(0.0F, -45.0F, -40.0F);
        leftArmReloadPos = new Vector3f(-0.07F, -0.37F, -0.42F);
        leftArmReloadRot = new Vector3f(0.0F, -45.0F, -40.0F);
        
 
        rightArmPos = new Vector3f(-0.67F, -0.07F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(-0.67F, -0.07F, 0.03F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmChargePos = new Vector3f(-0.20F, 0.42F, -0.31F);
        rightArmChargeRot = new Vector3f(-30.0F, -0.0F, -60.0F);
        
        rightArmScale = new Vector3f(0.60F, 1.0F, 0.60F);
        leftArmScale = new Vector3f(0.60F, 1.0F, 0.60F);
 
        leftHandAmmo = true;
		//animationType = EnumAnimationType.CUSTOM;


		//tiltGunTime = 0.2F;


		//unloadClipTime = 0.3F;


		//loadClipTime = 0.35F;


		//untiltGunTime = 0.15F;


		barrelBreakPoint = new Vector3f(79 /16F, 117F /16F, 1F /16F);


		breakAngle = 110F;


		rotateGunVertical = 1F;


		rotateGunHorizontal = 1F;


		tiltGun = 1F;


		translateGun = new Vector3f(1 /16F, 0F /16F, 0F /16F);


		rotateClipVertical = -10F;


		rotateClipHorizontal = 1F;


		tiltClip = -100F;


		translateClip = new Vector3f(1 /16F, -50F /16F, -100F /16F);


		translateAll(70F, 7.5F, -0.25F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 80
		gunModel[1] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 81
		gunModel[2] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 82
		gunModel[3] = new ModelRendererTurbo(this, 1273, 1, textureX, textureY); // Box 83
		gunModel[4] = new ModelRendererTurbo(this, 1489, 9, textureX, textureY); // Box 84
		gunModel[5] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 85
		gunModel[6] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 86
		gunModel[7] = new ModelRendererTurbo(this, 849, 217, textureX, textureY); // Box 87
		gunModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 32
		gunModel[9] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 33
		gunModel[10] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Box 34
		gunModel[11] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Box 35
		gunModel[12] = new ModelRendererTurbo(this, 649, 217, textureX, textureY); // Box 36
		gunModel[13] = new ModelRendererTurbo(this, 1065, 217, textureX, textureY); // Box 37
		gunModel[14] = new ModelRendererTurbo(this, 1265, 225, textureX, textureY); // Box 38
		gunModel[15] = new ModelRendererTurbo(this, 1657, 225, textureX, textureY); // Box 39
		gunModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 18
		gunModel[19] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 19
		gunModel[20] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 20
		gunModel[21] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Box 21
		gunModel[22] = new ModelRendererTurbo(this, 1273, 1, textureX, textureY); // Box 22
		gunModel[23] = new ModelRendererTurbo(this, 1489, 1, textureX, textureY); // Box 23
		gunModel[24] = new ModelRendererTurbo(this, 1705, 1, textureX, textureY); // Box 56
		gunModel[25] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 57
		gunModel[26] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 58
		gunModel[27] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 59
		gunModel[28] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 67
		gunModel[29] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 68
		gunModel[30] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 69
		gunModel[31] = new ModelRendererTurbo(this, 1705, 65, textureX, textureY); // Box 73
		gunModel[32] = new ModelRendererTurbo(this, 1705, 105, textureX, textureY); // Box 77
		gunModel[33] = new ModelRendererTurbo(this, 1761, 1, textureX, textureY); // Box 85
		gunModel[34] = new ModelRendererTurbo(this, 1761, 17, textureX, textureY); // Box 86
		gunModel[35] = new ModelRendererTurbo(this, 1793, 33, textureX, textureY); // Box 87
		gunModel[36] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 88
		gunModel[37] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 89
		gunModel[38] = new ModelRendererTurbo(this, 1705, 145, textureX, textureY); // Box 90
		gunModel[39] = new ModelRendererTurbo(this, 1705, 161, textureX, textureY); // Box 91
		gunModel[40] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 92
		gunModel[41] = new ModelRendererTurbo(this, 1401, 1, textureX, textureY); // Box 93
		gunModel[42] = new ModelRendererTurbo(this, 1233, 425, textureX, textureY); // Box 94
		gunModel[43] = new ModelRendererTurbo(this, 1, 433, textureX, textureY); // Box 95
		gunModel[44] = new ModelRendererTurbo(this, 1561, 1, textureX, textureY); // Box 96
		gunModel[45] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Box 97
		gunModel[46] = new ModelRendererTurbo(this, 1153, 1, textureX, textureY); // Box 98
		gunModel[47] = new ModelRendererTurbo(this, 945, 41, textureX, textureY); // Box 99
		gunModel[48] = new ModelRendererTurbo(this, 1585, 41, textureX, textureY); // Box 100
		gunModel[49] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 101
		gunModel[50] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 102
		gunModel[51] = new ModelRendererTurbo(this, 1073, 65, textureX, textureY); // Box 103
		gunModel[52] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Box 104
		gunModel[53] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 105
		gunModel[54] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 106
		gunModel[55] = new ModelRendererTurbo(this, 1345, 1, textureX, textureY); // Box 107
		gunModel[56] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 108
		gunModel[57] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 109
		gunModel[58] = new ModelRendererTurbo(this, 593, 433, textureX, textureY); // Box 110
		gunModel[59] = new ModelRendererTurbo(this, 1705, 177, textureX, textureY); // Box 135
		gunModel[60] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 136
		gunModel[61] = new ModelRendererTurbo(this, 1465, 225, textureX, textureY); // Box 137
		gunModel[62] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 140
		gunModel[63] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 141
		gunModel[64] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 142
		gunModel[65] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 143
		gunModel[66] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 144
		gunModel[67] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 145
		gunModel[68] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Box 146
		gunModel[69] = new ModelRendererTurbo(this, 1273, 1, textureX, textureY); // Box 148
		gunModel[70] = new ModelRendererTurbo(this, 1217, 1, textureX, textureY); // Box 149
		gunModel[71] = new ModelRendererTurbo(this, 1489, 1, textureX, textureY); // Box 150
		gunModel[72] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 151
		gunModel[73] = new ModelRendererTurbo(this, 1345, 17, textureX, textureY); // Box 152
		gunModel[74] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 153
		gunModel[75] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 154
		gunModel[76] = new ModelRendererTurbo(this, 1465, 249, textureX, textureY); // Box 155
		gunModel[77] = new ModelRendererTurbo(this, 1465, 273, textureX, textureY); // Box 156
		gunModel[78] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 157
		gunModel[79] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Box 158
		gunModel[80] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 159
		gunModel[81] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 160
		gunModel[82] = new ModelRendererTurbo(this, 1073, 25, textureX, textureY); // Box 161
		gunModel[83] = new ModelRendererTurbo(this, 1273, 25, textureX, textureY); // Box 162
		gunModel[84] = new ModelRendererTurbo(this, 1489, 25, textureX, textureY); // Box 163
		gunModel[85] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 164
		gunModel[86] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 165
		gunModel[87] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 166
		gunModel[88] = new ModelRendererTurbo(this, 1641, 41, textureX, textureY); // Box 167
		gunModel[89] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 168
		gunModel[90] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 169
		gunModel[91] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 170
		gunModel[92] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 171
		gunModel[93] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Box 172
		gunModel[94] = new ModelRendererTurbo(this, 2001, 9, textureX, textureY); // Box 173
		gunModel[95] = new ModelRendererTurbo(this, 1985, 65, textureX, textureY); // Box 174
		gunModel[96] = new ModelRendererTurbo(this, 649, 73, textureX, textureY); // Box 175
		gunModel[97] = new ModelRendererTurbo(this, 697, 73, textureX, textureY); // Box 176
		gunModel[98] = new ModelRendererTurbo(this, 1273, 73, textureX, textureY); // Box 177
		gunModel[99] = new ModelRendererTurbo(this, 1321, 73, textureX, textureY); // Box 178
		gunModel[100] = new ModelRendererTurbo(this, 1369, 73, textureX, textureY); // Box 179
		gunModel[101] = new ModelRendererTurbo(this, 1489, 73, textureX, textureY); // Box 180
		gunModel[102] = new ModelRendererTurbo(this, 1537, 73, textureX, textureY); // Box 181
		gunModel[103] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Box 182
		gunModel[104] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 183
		gunModel[105] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 184
		gunModel[106] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Box 185
		gunModel[107] = new ModelRendererTurbo(this, 1569, 81, textureX, textureY); // Box 186
		gunModel[108] = new ModelRendererTurbo(this, 1465, 297, textureX, textureY); // Box 188
		gunModel[109] = new ModelRendererTurbo(this, 1465, 321, textureX, textureY); // Box 189
		gunModel[110] = new ModelRendererTurbo(this, 1465, 345, textureX, textureY); // Box 190
		gunModel[111] = new ModelRendererTurbo(this, 1465, 369, textureX, textureY); // Box 200
		gunModel[112] = new ModelRendererTurbo(this, 1753, 425, textureX, textureY); // Box 207
		gunModel[113] = new ModelRendererTurbo(this, 1785, 449, textureX, textureY); // Box 208
		gunModel[114] = new ModelRendererTurbo(this, 1169, 465, textureX, textureY); // Box 223
		gunModel[115] = new ModelRendererTurbo(this, 1377, 465, textureX, textureY); // Box 224
		gunModel[116] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 225
		gunModel[117] = new ModelRendererTurbo(this, 1617, 81, textureX, textureY); // Box 226
		gunModel[118] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 228
		gunModel[119] = new ModelRendererTurbo(this, 1425, 89, textureX, textureY); // Box 229
		gunModel[120] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Box 231
		gunModel[121] = new ModelRendererTurbo(this, 1489, 97, textureX, textureY); // Box 232
		gunModel[122] = new ModelRendererTurbo(this, 2001, 89, textureX, textureY); // Box 233
		gunModel[123] = new ModelRendererTurbo(this, 1153, 1, textureX, textureY); // Box 234
		gunModel[124] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 235
		gunModel[125] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 236
		gunModel[126] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 237
		gunModel[127] = new ModelRendererTurbo(this, 529, 105, textureX, textureY); // Box 238
		gunModel[128] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Box 239
		gunModel[129] = new ModelRendererTurbo(this, 577, 105, textureX, textureY); // Box 240
		gunModel[130] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Box 241
		gunModel[131] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Box 242
		gunModel[132] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 243
		gunModel[133] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 244
		gunModel[134] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 245
		gunModel[135] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 246
		gunModel[136] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 247
		gunModel[137] = new ModelRendererTurbo(this, 1521, 97, textureX, textureY); // Box 248
		gunModel[138] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 249
		gunModel[139] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 250
		gunModel[140] = new ModelRendererTurbo(this, 1225, 49, textureX, textureY); // Box 251
		gunModel[141] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 252
		gunModel[142] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 253
		gunModel[143] = new ModelRendererTurbo(this, 1729, 473, textureX, textureY); // Box 254
		gunModel[144] = new ModelRendererTurbo(this, 1, 481, textureX, textureY); // Box 255
		gunModel[145] = new ModelRendererTurbo(this, 1073, 105, textureX, textureY); // Box 256
		gunModel[146] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Box 257
		gunModel[147] = new ModelRendererTurbo(this, 1129, 105, textureX, textureY); // Box 258
		gunModel[148] = new ModelRendererTurbo(this, 1177, 105, textureX, textureY); // Box 259
		gunModel[149] = new ModelRendererTurbo(this, 1561, 105, textureX, textureY); // Box 260
		gunModel[150] = new ModelRendererTurbo(this, 1617, 105, textureX, textureY); // Box 261
		gunModel[151] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 262
		gunModel[152] = new ModelRendererTurbo(this, 849, 113, textureX, textureY); // Box 263
		gunModel[153] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 264
		gunModel[154] = new ModelRendererTurbo(this, 1985, 113, textureX, textureY); // Box 265
		gunModel[155] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 266
		gunModel[156] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 267
		gunModel[157] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 268
		gunModel[158] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 269
		gunModel[159] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Box 271
		gunModel[160] = new ModelRendererTurbo(this, 1273, 121, textureX, textureY); // Box 272
		gunModel[161] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 273
		gunModel[162] = new ModelRendererTurbo(this, 1201, 105, textureX, textureY); // Box 274
		gunModel[163] = new ModelRendererTurbo(this, 1417, 113, textureX, textureY); // Box 275
		gunModel[164] = new ModelRendererTurbo(this, 1361, 121, textureX, textureY); // Box 276
		gunModel[165] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 277
		gunModel[166] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 278
		gunModel[167] = new ModelRendererTurbo(this, 521, 129, textureX, textureY); // Box 279
		gunModel[168] = new ModelRendererTurbo(this, 929, 129, textureX, textureY); // Box 280
		gunModel[169] = new ModelRendererTurbo(this, 1561, 1, textureX, textureY); // Box 281
		gunModel[170] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 282
		gunModel[171] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 283
		gunModel[172] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 284
		gunModel[173] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 285
		gunModel[174] = new ModelRendererTurbo(this, 1657, 1, textureX, textureY); // Box 286
		gunModel[175] = new ModelRendererTurbo(this, 313, 481, textureX, textureY); // Box 290
		gunModel[176] = new ModelRendererTurbo(this, 505, 489, textureX, textureY); // Box 291
		gunModel[177] = new ModelRendererTurbo(this, 1145, 129, textureX, textureY); // Box 292
		gunModel[178] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 294
		gunModel[179] = new ModelRendererTurbo(this, 1705, 1, textureX, textureY); // Box 295
		gunModel[180] = new ModelRendererTurbo(this, 1561, 17, textureX, textureY); // Box 296
		gunModel[181] = new ModelRendererTurbo(this, 1377, 17, textureX, textureY); // Box 297
		gunModel[182] = new ModelRendererTurbo(this, 1657, 17, textureX, textureY); // Box 298
		gunModel[183] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 299
		gunModel[184] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 300
		gunModel[185] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 301
		gunModel[186] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 302
		gunModel[187] = new ModelRendererTurbo(this, 1945, 169, textureX, textureY); // Box 310
		gunModel[188] = new ModelRendererTurbo(this, 649, 137, textureX, textureY); // Box 311
		gunModel[189] = new ModelRendererTurbo(this, 1633, 129, textureX, textureY); // Box 312
		gunModel[190] = new ModelRendererTurbo(this, 1193, 137, textureX, textureY); // Box 313
		gunModel[191] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 314
		gunModel[192] = new ModelRendererTurbo(this, 569, 145, textureX, textureY); // Box 315
		gunModel[193] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 316
		gunModel[194] = new ModelRendererTurbo(this, 1073, 145, textureX, textureY); // Box 317
		gunModel[195] = new ModelRendererTurbo(this, 1329, 121, textureX, textureY); // Box 318
		gunModel[196] = new ModelRendererTurbo(this, 985, 129, textureX, textureY); // Box 319
		gunModel[197] = new ModelRendererTurbo(this, 1489, 169, textureX, textureY); // Box 320
		gunModel[198] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 322
		gunModel[199] = new ModelRendererTurbo(this, 2017, 1, textureX, textureY); // Box 323
		gunModel[200] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 324
		gunModel[201] = new ModelRendererTurbo(this, 785, 121, textureX, textureY); // Box 328
		gunModel[202] = new ModelRendererTurbo(this, 1417, 145, textureX, textureY); // Box 329
		gunModel[203] = new ModelRendererTurbo(this, 697, 137, textureX, textureY); // Box 330
		gunModel[204] = new ModelRendererTurbo(this, 849, 137, textureX, textureY); // Box 331
		gunModel[205] = new ModelRendererTurbo(this, 1961, 145, textureX, textureY); // Box 332
		gunModel[206] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 333
		gunModel[207] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 334
		gunModel[208] = new ModelRendererTurbo(this, 729, 153, textureX, textureY); // Box 335
		gunModel[209] = new ModelRendererTurbo(this, 785, 153, textureX, textureY); // Box 336
		gunModel[210] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 337
		gunModel[211] = new ModelRendererTurbo(this, 1273, 153, textureX, textureY); // Box 338
		gunModel[212] = new ModelRendererTurbo(this, 1321, 153, textureX, textureY); // Box 339
		gunModel[213] = new ModelRendererTurbo(this, 1377, 153, textureX, textureY); // Box 340
		gunModel[214] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 341
		gunModel[215] = new ModelRendererTurbo(this, 929, 161, textureX, textureY); // Box 342
		gunModel[216] = new ModelRendererTurbo(this, 977, 161, textureX, textureY); // Box 343
		gunModel[217] = new ModelRendererTurbo(this, 2017, 137, textureX, textureY); // Box 344
		gunModel[218] = new ModelRendererTurbo(this, 65, 217, textureX, textureY); // Box 345
		gunModel[219] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 347
		gunModel[220] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 348
		gunModel[221] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 349
		gunModel[222] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Box 350
		gunModel[223] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Box 351
		gunModel[224] = new ModelRendererTurbo(this, 1681, 1, textureX, textureY); // Box 352
		gunModel[225] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Box 353
		gunModel[226] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 97
		gunModel[227] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Box 98
		gunModel[228] = new ModelRendererTurbo(this, 561, 217, textureX, textureY); // Box 99
		gunModel[229] = new ModelRendererTurbo(this, 649, 217, textureX, textureY); // Box 100
		gunModel[230] = new ModelRendererTurbo(this, 721, 217, textureX, textureY); // Box 101
		gunModel[231] = new ModelRendererTurbo(this, 849, 217, textureX, textureY); // Box 102
		gunModel[232] = new ModelRendererTurbo(this, 921, 217, textureX, textureY); // Box 103
		gunModel[233] = new ModelRendererTurbo(this, 993, 217, textureX, textureY); // Box 104
		gunModel[234] = new ModelRendererTurbo(this, 1857, 201, textureX, textureY); // Box 441
		gunModel[235] = new ModelRendererTurbo(this, 1065, 217, textureX, textureY); // Box 442
		gunModel[236] = new ModelRendererTurbo(this, 1265, 217, textureX, textureY); // Box 445
		gunModel[237] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Box 446
		gunModel[238] = new ModelRendererTurbo(this, 649, 241, textureX, textureY); // Box 447
		gunModel[239] = new ModelRendererTurbo(this, 849, 241, textureX, textureY); // Box 448
		gunModel[240] = new ModelRendererTurbo(this, 49, 249, textureX, textureY); // Box 449
		gunModel[241] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 450
		gunModel[242] = new ModelRendererTurbo(this, 1161, 217, textureX, textureY); // Box 331
		gunModel[243] = new ModelRendererTurbo(this, 1361, 217, textureX, textureY); // Box 332
		gunModel[244] = new ModelRendererTurbo(this, 1065, 217, textureX, textureY); // Box 333
		gunModel[245] = new ModelRendererTurbo(this, 1265, 217, textureX, textureY); // Box 334
		gunModel[246] = new ModelRendererTurbo(this, 729, 489, textureX, textureY); // Box 335
		gunModel[247] = new ModelRendererTurbo(this, 993, 489, textureX, textureY); // Box 336
		gunModel[248] = new ModelRendererTurbo(this, 1729, 225, textureX, textureY); // Box 337
		gunModel[249] = new ModelRendererTurbo(this, 1857, 281, textureX, textureY); // Box 338
		gunModel[250] = new ModelRendererTurbo(this, 513, 241, textureX, textureY); // Box 339
		gunModel[251] = new ModelRendererTurbo(this, 737, 241, textureX, textureY); // Box 340
		gunModel[252] = new ModelRendererTurbo(this, 1065, 297, textureX, textureY); // Box 341
		gunModel[253] = new ModelRendererTurbo(this, 1265, 297, textureX, textureY); // Box 342
		gunModel[254] = new ModelRendererTurbo(this, 1185, 513, textureX, textureY); // Box 345
		gunModel[255] = new ModelRendererTurbo(this, 1529, 513, textureX, textureY); // Box 328
		gunModel[256] = new ModelRendererTurbo(this, 1465, 393, textureX, textureY); // Box 329
		gunModel[257] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 330
		gunModel[258] = new ModelRendererTurbo(this, 649, 193, textureX, textureY); // Box 331
		gunModel[259] = new ModelRendererTurbo(this, 1777, 513, textureX, textureY); // Box 332
		gunModel[260] = new ModelRendererTurbo(this, 729, 529, textureX, textureY); // Box 333
		gunModel[261] = new ModelRendererTurbo(this, 1273, 417, textureX, textureY); // Box 334
		gunModel[262] = new ModelRendererTurbo(this, 1777, 529, textureX, textureY); // Box 335
		gunModel[263] = new ModelRendererTurbo(this, 313, 537, textureX, textureY); // Box 336
		gunModel[264] = new ModelRendererTurbo(this, 1777, 537, textureX, textureY); // Box 337
		gunModel[265] = new ModelRendererTurbo(this, 569, 545, textureX, textureY); // Box 338
		gunModel[266] = new ModelRendererTurbo(this, 825, 545, textureX, textureY); // Box 339
		gunModel[267] = new ModelRendererTurbo(this, 1081, 545, textureX, textureY); // Box 340
		gunModel[268] = new ModelRendererTurbo(this, 1337, 545, textureX, textureY); // Box 341
		gunModel[269] = new ModelRendererTurbo(this, 1593, 545, textureX, textureY); // Box 342
		gunModel[270] = new ModelRendererTurbo(this, 313, 553, textureX, textureY); // Box 343
		gunModel[271] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Box 344
		gunModel[272] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 345
		gunModel[273] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 346
		gunModel[274] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 347
		gunModel[275] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 348
		gunModel[276] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 349
		gunModel[277] = new ModelRendererTurbo(this, 1857, 225, textureX, textureY); // Box 366
		gunModel[278] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Box 367
		gunModel[279] = new ModelRendererTurbo(this, 1145, 153, textureX, textureY); // Box 368
		gunModel[280] = new ModelRendererTurbo(this, 649, 241, textureX, textureY); // Box 380
		gunModel[281] = new ModelRendererTurbo(this, 945, 241, textureX, textureY); // Box 382
		gunModel[282] = new ModelRendererTurbo(this, 849, 241, textureX, textureY); // Box 383
		gunModel[283] = new ModelRendererTurbo(this, 1985, 257, textureX, textureY); // Box 384
		gunModel[284] = new ModelRendererTurbo(this, 313, 265, textureX, textureY); // Box 385
		gunModel[285] = new ModelRendererTurbo(this, 33, 273, textureX, textureY); // Box 386
		gunModel[286] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 387
		gunModel[287] = new ModelRendererTurbo(this, 945, 273, textureX, textureY); // Box 362
		gunModel[288] = new ModelRendererTurbo(this, 1769, 289, textureX, textureY); // Box 390
		gunModel[289] = new ModelRendererTurbo(this, 553, 297, textureX, textureY); // Box 391
		gunModel[290] = new ModelRendererTurbo(this, 1185, 297, textureX, textureY); // Box 392
		gunModel[291] = new ModelRendererTurbo(this, 313, 297, textureX, textureY); // Box 393
		gunModel[292] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 394
		gunModel[293] = new ModelRendererTurbo(this, 1561, 553, textureX, textureY); // Box 395
		gunModel[294] = new ModelRendererTurbo(this, 561, 561, textureX, textureY); // Box 398
		gunModel[295] = new ModelRendererTurbo(this, 865, 561, textureX, textureY); // Box 399
		gunModel[296] = new ModelRendererTurbo(this, 1169, 561, textureX, textureY); // Box 402
		gunModel[297] = new ModelRendererTurbo(this, 417, 593, textureX, textureY); // Box 403
		gunModel[298] = new ModelRendererTurbo(this, 1385, 297, textureX, textureY); // Box 177
		gunModel[299] = new ModelRendererTurbo(this, 985, 305, textureX, textureY); // Box 178
		gunModel[300] = new ModelRendererTurbo(this, 1977, 305, textureX, textureY); // Box 179
		gunModel[301] = new ModelRendererTurbo(this, 425, 321, textureX, textureY); // Box 180
		gunModel[302] = new ModelRendererTurbo(this, 489, 321, textureX, textureY); // Box 181
		gunModel[303] = new ModelRendererTurbo(this, 649, 321, textureX, textureY); // Box 182
		gunModel[304] = new ModelRendererTurbo(this, 721, 321, textureX, textureY); // Box 183
		gunModel[305] = new ModelRendererTurbo(this, 849, 321, textureX, textureY); // Box 184
		gunModel[306] = new ModelRendererTurbo(this, 1217, 25, textureX, textureY); // Box 420
		gunModel[307] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 421
		gunModel[308] = new ModelRendererTurbo(this, 1153, 25, textureX, textureY); // Box 422
		gunModel[309] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 423
		gunModel[310] = new ModelRendererTurbo(this, 721, 41, textureX, textureY); // Box 429
		gunModel[311] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 430
		gunModel[312] = new ModelRendererTurbo(this, 1345, 41, textureX, textureY); // Box 431
		gunModel[313] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 432
		gunModel[314] = new ModelRendererTurbo(this, 1561, 41, textureX, textureY); // Box 433
		gunModel[315] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 434
		gunModel[316] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Box 435
		gunModel[317] = new ModelRendererTurbo(this, 1073, 65, textureX, textureY); // Box 436
		gunModel[318] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 437
		gunModel[319] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 438
		gunModel[320] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Box 439
		gunModel[321] = new ModelRendererTurbo(this, 1705, 65, textureX, textureY); // Box 440
		gunModel[322] = new ModelRendererTurbo(this, 721, 593, textureX, textureY); // Box 441
		gunModel[323] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 442
		gunModel[324] = new ModelRendererTurbo(this, 1641, 65, textureX, textureY); // Box 443
		gunModel[325] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 444
		gunModel[326] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Box 445
		gunModel[327] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 446
		gunModel[328] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 447
		gunModel[329] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 448
		gunModel[330] = new ModelRendererTurbo(this, 1305, 73, textureX, textureY); // Box 449
		gunModel[331] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Box 450
		gunModel[332] = new ModelRendererTurbo(this, 1353, 73, textureX, textureY); // Box 451
		gunModel[333] = new ModelRendererTurbo(this, 1521, 73, textureX, textureY); // Box 452
		gunModel[334] = new ModelRendererTurbo(this, 561, 129, textureX, textureY); // Box 453
		gunModel[335] = new ModelRendererTurbo(this, 913, 321, textureX, textureY); // Box 454
		gunModel[336] = new ModelRendererTurbo(this, 753, 321, textureX, textureY); // Box 455
		gunModel[337] = new ModelRendererTurbo(this, 1705, 321, textureX, textureY); // Box 456
		gunModel[338] = new ModelRendererTurbo(this, 41, 329, textureX, textureY); // Box 457
		gunModel[339] = new ModelRendererTurbo(this, 1753, 329, textureX, textureY); // Box 458
		gunModel[340] = new ModelRendererTurbo(this, 1241, 49, textureX, textureY); // Box 459
		gunModel[341] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 460
		gunModel[342] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 461
		gunModel[343] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 462
		gunModel[344] = new ModelRendererTurbo(this, 2017, 65, textureX, textureY); // Box 463
		gunModel[345] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 464
		gunModel[346] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 465
		gunModel[347] = new ModelRendererTurbo(this, 1857, 329, textureX, textureY); // Box 473
		gunModel[348] = new ModelRendererTurbo(this, 553, 337, textureX, textureY); // Box 474
		gunModel[349] = new ModelRendererTurbo(this, 1065, 337, textureX, textureY); // Box 475
		gunModel[350] = new ModelRendererTurbo(this, 1145, 337, textureX, textureY); // Box 476
		gunModel[351] = new ModelRendererTurbo(this, 1265, 337, textureX, textureY); // Box 477
		gunModel[352] = new ModelRendererTurbo(this, 785, 217, textureX, textureY); // Box 445
		gunModel[353] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Box 446
		gunModel[354] = new ModelRendererTurbo(this, 153, 233, textureX, textureY); // Box 447
		gunModel[355] = new ModelRendererTurbo(this, 577, 241, textureX, textureY); // Box 448
		gunModel[356] = new ModelRendererTurbo(this, 1105, 1, textureX, textureY); // Box 514
		gunModel[357] = new ModelRendererTurbo(this, 1305, 1, textureX, textureY); // Box 515
		gunModel[358] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 476
		gunModel[359] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Box 477
		gunModel[360] = new ModelRendererTurbo(this, 545, 193, textureX, textureY); // Box 478
		gunModel[361] = new ModelRendererTurbo(this, 905, 193, textureX, textureY); // Box 479
		gunModel[362] = new ModelRendererTurbo(this, 977, 193, textureX, textureY); // Box 480
		gunModel[363] = new ModelRendererTurbo(this, 1609, 193, textureX, textureY); // Box 481
		gunModel[364] = new ModelRendererTurbo(this, 1705, 201, textureX, textureY); // Box 482
		gunModel[365] = new ModelRendererTurbo(this, 1777, 201, textureX, textureY); // Box 483
		gunModel[366] = new ModelRendererTurbo(this, 977, 593, textureX, textureY); // Box 525
		gunModel[367] = new ModelRendererTurbo(this, 1489, 121, textureX, textureY); // Box 526
		gunModel[368] = new ModelRendererTurbo(this, 225, 345, textureX, textureY); // Box 527
		gunModel[369] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Box 528
		gunModel[370] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Box 529
		gunModel[371] = new ModelRendererTurbo(this, 393, 625, textureX, textureY); // Box 530
		gunModel[372] = new ModelRendererTurbo(this, 1609, 129, textureX, textureY); // Box 531
		gunModel[373] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 532
		gunModel[374] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 533
		gunModel[375] = new ModelRendererTurbo(this, 1585, 169, textureX, textureY); // Box 534
		gunModel[376] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 536
		gunModel[377] = new ModelRendererTurbo(this, 1561, 593, textureX, textureY); // Box 537
		gunModel[378] = new ModelRendererTurbo(this, 425, 361, textureX, textureY); // Box 538
		gunModel[379] = new ModelRendererTurbo(this, 545, 81, textureX, textureY); // Box 539
		gunModel[380] = new ModelRendererTurbo(this, 993, 241, textureX, textureY); // Box 540
		gunModel[381] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Box 541
		gunModel[382] = new ModelRendererTurbo(this, 1945, 241, textureX, textureY); // Box 542
		gunModel[383] = new ModelRendererTurbo(this, 1561, 625, textureX, textureY); // Box 543
		gunModel[384] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 544
		gunModel[385] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 545
		gunModel[386] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 546
		gunModel[387] = new ModelRendererTurbo(this, 1849, 201, textureX, textureY); // Box 547
		gunModel[388] = new ModelRendererTurbo(this, 153, 217, textureX, textureY); // Box 548
		gunModel[389] = new ModelRendererTurbo(this, 345, 241, textureX, textureY); // Box 549
		gunModel[390] = new ModelRendererTurbo(this, 1969, 241, textureX, textureY); // Box 550
		gunModel[391] = new ModelRendererTurbo(this, 1065, 257, textureX, textureY); // Box 551
		gunModel[392] = new ModelRendererTurbo(this, 1161, 257, textureX, textureY); // Box 564
		gunModel[393] = new ModelRendererTurbo(this, 1265, 257, textureX, textureY); // Box 565
		gunModel[394] = new ModelRendererTurbo(this, 1361, 257, textureX, textureY); // Box 568
		gunModel[395] = new ModelRendererTurbo(this, 993, 273, textureX, textureY); // Box 569
		gunModel[396] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 570
		gunModel[397] = new ModelRendererTurbo(this, 425, 281, textureX, textureY); // Box 571
		gunModel[398] = new ModelRendererTurbo(this, 513, 281, textureX, textureY); // Box 572
		gunModel[399] = new ModelRendererTurbo(this, 569, 281, textureX, textureY); // Box 573
		gunModel[400] = new ModelRendererTurbo(this, 1321, 345, textureX, textureY); // Box 574
		gunModel[401] = new ModelRendererTurbo(this, 849, 361, textureX, textureY); // Box 575
		gunModel[402] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 577
		gunModel[403] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 578
		gunModel[404] = new ModelRendererTurbo(this, 1073, 105, textureX, textureY); // Box 579
		gunModel[405] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Box 580
		gunModel[406] = new ModelRendererTurbo(this, 1217, 1, textureX, textureY); // Box 581
		gunModel[407] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 582
		gunModel[408] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 583
		gunModel[409] = new ModelRendererTurbo(this, 1521, 1, textureX, textureY); // Box 584
		gunModel[410] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 585
		gunModel[411] = new ModelRendererTurbo(this, 1953, 337, textureX, textureY); // Box 586
		gunModel[412] = new ModelRendererTurbo(this, 649, 353, textureX, textureY); // Box 587
		gunModel[413] = new ModelRendererTurbo(this, 713, 361, textureX, textureY); // Box 588
		gunModel[414] = new ModelRendererTurbo(this, 1961, 361, textureX, textureY); // Box 589
		gunModel[415] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 592
		gunModel[416] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Box 593
		gunModel[417] = new ModelRendererTurbo(this, 1, 521, textureX, textureY); // Box 598
		gunModel[418] = new ModelRendererTurbo(this, 89, 521, textureX, textureY); // Box 599
		gunModel[419] = new ModelRendererTurbo(this, 1857, 561, textureX, textureY); // Box 600
		gunModel[420] = new ModelRendererTurbo(this, 1073, 81, textureX, textureY); // Box 601
		gunModel[421] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 602
		gunModel[422] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 603
		gunModel[423] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 604
		gunModel[424] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 606
		gunModel[425] = new ModelRendererTurbo(this, 1321, 177, textureX, textureY); // Box 609
		gunModel[426] = new ModelRendererTurbo(this, 361, 257, textureX, textureY); // Box 610
		gunModel[427] = new ModelRendererTurbo(this, 1201, 257, textureX, textureY); // Box 611
		gunModel[428] = new ModelRendererTurbo(this, 849, 281, textureX, textureY); // Box 612
		gunModel[429] = new ModelRendererTurbo(this, 961, 337, textureX, textureY); // Box 613
		gunModel[430] = new ModelRendererTurbo(this, 49, 369, textureX, textureY); // Box 614
		gunModel[431] = new ModelRendererTurbo(this, 1065, 369, textureX, textureY); // Box 617
		gunModel[432] = new ModelRendererTurbo(this, 545, 369, textureX, textureY); // Box 618
		gunModel[433] = new ModelRendererTurbo(this, 1441, 25, textureX, textureY); // Box 619
		gunModel[434] = new ModelRendererTurbo(this, 1409, 1, textureX, textureY); // Box 620
		gunModel[435] = new ModelRendererTurbo(this, 1265, 369, textureX, textureY); // Box 621
		gunModel[436] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Box 622
		gunModel[437] = new ModelRendererTurbo(this, 1705, 105, textureX, textureY); // Box 623
		gunModel[438] = new ModelRendererTurbo(this, 1025, 81, textureX, textureY); // Box 624
		gunModel[439] = new ModelRendererTurbo(this, 1105, 25, textureX, textureY); // Box 625
		gunModel[440] = new ModelRendererTurbo(this, 1305, 25, textureX, textureY); // Box 626
		gunModel[441] = new ModelRendererTurbo(this, 2025, 241, textureX, textureY); // Box 627
		gunModel[442] = new ModelRendererTurbo(this, 1521, 25, textureX, textureY); // Box 628
		gunModel[443] = new ModelRendererTurbo(this, 1129, 369, textureX, textureY); // Box 629
		gunModel[444] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 630
		gunModel[445] = new ModelRendererTurbo(this, 1425, 257, textureX, textureY); // Box 631
		gunModel[446] = new ModelRendererTurbo(this, 1721, 369, textureX, textureY); // Box 644
		gunModel[447] = new ModelRendererTurbo(this, 377, 289, textureX, textureY); // Box 645
		gunModel[448] = new ModelRendererTurbo(this, 625, 673, textureX, textureY); // Box 733
		gunModel[449] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 734
		gunModel[450] = new ModelRendererTurbo(this, 1225, 281, textureX, textureY); // Box 735
		gunModel[451] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 736
		gunModel[452] = new ModelRendererTurbo(this, 801, 305, textureX, textureY); // Box 737
		gunModel[453] = new ModelRendererTurbo(this, 721, 97, textureX, textureY); // Box 738
		gunModel[454] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 739
		gunModel[455] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 740
		gunModel[456] = new ModelRendererTurbo(this, 1777, 641, textureX, textureY); // Box 741
		gunModel[457] = new ModelRendererTurbo(this, 681, 673, textureX, textureY); // Box 742
		gunModel[458] = new ModelRendererTurbo(this, 753, 673, textureX, textureY); // Box 743
		gunModel[459] = new ModelRendererTurbo(this, 833, 673, textureX, textureY); // Box 744
		gunModel[460] = new ModelRendererTurbo(this, 1, 681, textureX, textureY); // Box 745
		gunModel[461] = new ModelRendererTurbo(this, 81, 681, textureX, textureY); // Box 746
		gunModel[462] = new ModelRendererTurbo(this, 161, 329, textureX, textureY); // Box 747
		gunModel[463] = new ModelRendererTurbo(this, 1745, 321, textureX, textureY); // Box 748
		gunModel[464] = new ModelRendererTurbo(this, 1801, 321, textureX, textureY); // Box 749
		gunModel[465] = new ModelRendererTurbo(this, 161, 369, textureX, textureY); // Box 750
		gunModel[466] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 751
		gunModel[467] = new ModelRendererTurbo(this, 1601, 105, textureX, textureY); // Box 752
		gunModel[468] = new ModelRendererTurbo(this, 1017, 161, textureX, textureY); // Box 753
		gunModel[469] = new ModelRendererTurbo(this, 1273, 121, textureX, textureY); // Box 754
		gunModel[470] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Box 755
		gunModel[471] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Box 756
		gunModel[472] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 757
		gunModel[473] = new ModelRendererTurbo(this, 1945, 673, textureX, textureY); // Box 758
		gunModel[474] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 759
		gunModel[475] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 760
		gunModel[476] = new ModelRendererTurbo(this, 1073, 49, textureX, textureY); // Box 761
		gunModel[477] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 762
		gunModel[478] = new ModelRendererTurbo(this, 1409, 17, textureX, textureY); // Box 764
		gunModel[479] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Box 765
		gunModel[480] = new ModelRendererTurbo(this, 1153, 49, textureX, textureY); // Box 766
		gunModel[481] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 767
		gunModel[482] = new ModelRendererTurbo(this, 1273, 49, textureX, textureY); // Box 768
		gunModel[483] = new ModelRendererTurbo(this, 1417, 217, textureX, textureY); // Box 769
		gunModel[484] = new ModelRendererTurbo(this, 1489, 49, textureX, textureY); // Box 770
		gunModel[485] = new ModelRendererTurbo(this, 1665, 105, textureX, textureY); // Box 585
		gunModel[486] = new ModelRendererTurbo(this, 1857, 393, textureX, textureY); // Box 586
		gunModel[487] = new ModelRendererTurbo(this, 721, 113, textureX, textureY); // Box 587
		gunModel[488] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Box 588
		gunModel[489] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 589
		gunModel[490] = new ModelRendererTurbo(this, 465, 321, textureX, textureY); // Box 590
		gunModel[491] = new ModelRendererTurbo(this, 697, 321, textureX, textureY); // Box 591
		gunModel[492] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 592
		gunModel[493] = new ModelRendererTurbo(this, 1201, 49, textureX, textureY); // Box 593
		gunModel[494] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 594
		gunModel[495] = new ModelRendererTurbo(this, 1377, 49, textureX, textureY); // Box 595
		gunModel[496] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 596
		gunModel[497] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 597
		gunModel[498] = new ModelRendererTurbo(this, 1225, 89, textureX, textureY); // Box 598
		gunModel[499] = new ModelRendererTurbo(this, 1985, 89, textureX, textureY); // Box 599

		gunModel[0].addShapeBox(0F, 0F, 0F, 5, 7, 203, 0F,-2.5F, -1.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, -1.05F, 0F, -0.4F, -4.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -4.6F, 0F); // Box 80
		gunModel[0].setRotationPoint(55F, -112F, 5F);
		gunModel[0].rotateAngleY = -1.57079633F;

		gunModel[1].addShapeBox(0F, 0F, 0F, 7, 5, 203, 0F,-1.05F, -2.5F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, -1.05F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 81
		gunModel[1].setRotationPoint(55F, -110F, 7F);
		gunModel[1].rotateAngleY = -1.57079633F;

		gunModel[2].addShapeBox(0F, 0F, 0F, 7, 5, 203, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.05F, -2.5F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, -1.05F, -2.5F, 0F); // Box 82
		gunModel[2].setRotationPoint(55F, -105F, 7F);
		gunModel[2].rotateAngleY = -1.57079633F;

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 7, 203, 0F,-0.4F, -4.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -4.6F, 0F, -2.5F, -1.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, -1.05F, 0F); // Box 83
		gunModel[3].setRotationPoint(55F, -105F, 5F);
		gunModel[3].rotateAngleY = -1.57079633F;

		gunModel[4].addShapeBox(0F, 0F, 0F, 5, 7, 203, 0F,0F, 0F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, 0F, -0.5F, 0F); // Box 84
		gunModel[4].setRotationPoint(55F, -105F, 0F);
		gunModel[4].rotateAngleY = -1.57079633F;

		gunModel[5].addShapeBox(0F, 0F, 0F, 7, 5, 203, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -4.6F, -0.4F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -4.6F, -0.4F, 0F); // Box 85
		gunModel[5].setRotationPoint(55F, -105F, 0F);
		gunModel[5].rotateAngleY = -1.57079633F;

		gunModel[6].addShapeBox(0F, 0F, 0F, 7, 5, 203, 0F,-4.6F, -0.4F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -4.6F, -0.4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 86
		gunModel[6].setRotationPoint(55F, -110F, 0F);
		gunModel[6].rotateAngleY = -1.57079633F;

		gunModel[7].addShapeBox(0F, 0F, 0F, 5, 7, 203, 0F,0F, -0.5F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, 0F, 0F, 0F); // Box 87
		gunModel[7].setRotationPoint(55F, -112F, 0F);
		gunModel[7].rotateAngleY = -1.57079633F;

		gunModel[8].addShapeBox(0F, 0F, 0F, 7, 5, 185, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.05F, -2.5F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, -1.05F, -2.5F, 0F); // Box 32
		gunModel[8].setRotationPoint(42F, -83F, 7F);
		gunModel[8].rotateAngleY = -1.57079633F;

		gunModel[9].addShapeBox(0F, 0F, 0F, 7, 5, 185, 0F,-1.05F, -2.5F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, -1.05F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		gunModel[9].setRotationPoint(42F, -88F, 7F);
		gunModel[9].rotateAngleY = -1.57079633F;

		gunModel[10].addShapeBox(0F, 0F, 0F, 5, 7, 185, 0F,-2.5F, -1.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, -1.05F, 0F, -0.4F, -4.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -4.6F, 0F); // Box 34
		gunModel[10].setRotationPoint(42F, -90F, 5F);
		gunModel[10].rotateAngleY = -1.57079633F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 5, 7, 185, 0F,-0.4F, -4.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -4.6F, 0F, -2.5F, -1.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, -1.05F, 0F); // Box 35
		gunModel[11].setRotationPoint(42F, -83F, 5F);
		gunModel[11].rotateAngleY = -1.57079633F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 5, 7, 185, 0F,0F, -0.5F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[12].setRotationPoint(42F, -90F, 0F);
		gunModel[12].rotateAngleY = -1.57079633F;

		gunModel[13].addShapeBox(0F, 0F, 0F, 7, 5, 185, 0F,-4.6F, -0.4F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -4.6F, -0.4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[13].setRotationPoint(42F, -88F, 0F);
		gunModel[13].rotateAngleY = -1.57079633F;

		gunModel[14].addShapeBox(0F, 0F, 0F, 7, 5, 185, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -4.6F, -0.4F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -4.6F, -0.4F, 0F); // Box 38
		gunModel[14].setRotationPoint(42F, -83F, 0F);
		gunModel[14].rotateAngleY = -1.57079633F;

		gunModel[15].addShapeBox(0F, 0F, 0F, 5, 7, 185, 0F,0F, 0F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, 0F, -0.5F, 0F); // Box 39
		gunModel[15].setRotationPoint(42F, -83F, 0F);
		gunModel[15].rotateAngleY = -1.57079633F;

		gunModel[16].addShapeBox(0F, 0F, 1F, 9, 7, 55, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -3.55F, 0F, -6.35F, -0.65F, 0F, -6.35F, -0.65F, 0F, -0.7F, -3.55F, 0F); // Box 16
		gunModel[16].setRotationPoint(148F, -83F, 9F);
		gunModel[16].rotateAngleY = -1.57079633F;

		gunModel[17].addShapeBox(0F, 0F, 1F, 9, 7, 55, 0F,-0.7F, -3.55F, 0F, -6.35F, -0.65F, 0F, -6.35F, -0.65F, 0F, -0.7F, -3.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[17].setRotationPoint(148F, -90F, 9F);
		gunModel[17].rotateAngleY = -1.57079633F;

		gunModel[18].addShapeBox(0F, 0F, 1F, 7, 9, 55, 0F,-3.55F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -0.7F, 0F, -0.65F, -6.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -6.35F, 0F); // Box 18
		gunModel[18].setRotationPoint(148F, -92F, 7F);
		gunModel[18].rotateAngleY = -1.57079633F;

		gunModel[19].addShapeBox(0F, 0F, 1F, 7, 9, 55, 0F,0F, 0F, 0F, -3.55F, -0.7F, 0F, -3.55F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -6.35F, 0F, -0.65F, -6.35F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[19].setRotationPoint(148F, -92F, 0F);
		gunModel[19].rotateAngleY = -1.57079633F;

		gunModel[20].addShapeBox(0F, 0F, 1F, 9, 7, 55, 0F,-6.35F, -0.65F, 0F, -0.7F, -3.55F, 0F, -0.7F, -3.55F, 0F, -6.35F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[20].setRotationPoint(148F, -90F, 0F);
		gunModel[20].rotateAngleY = -1.57079633F;

		gunModel[21].addShapeBox(0F, 0F, 1F, 9, 7, 55, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.35F, -0.65F, 0F, -0.7F, -3.55F, 0F, -0.7F, -3.55F, 0F, -6.35F, -0.65F, 0F); // Box 21
		gunModel[21].setRotationPoint(148F, -83F, 0F);
		gunModel[21].rotateAngleY = -1.57079633F;

		gunModel[22].addShapeBox(0F, 0F, 1F, 7, 9, 55, 0F,0F, 0F, 0F, -0.65F, -6.35F, 0F, -0.65F, -6.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -0.7F, 0F, -3.55F, -0.7F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[22].setRotationPoint(148F, -83F, 0F);
		gunModel[22].rotateAngleY = -1.57079633F;

		gunModel[23].addShapeBox(0F, 0F, 1F, 7, 9, 55, 0F,-0.65F, -6.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -6.35F, 0F, -3.55F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -0.7F, 0F); // Box 23
		gunModel[23].setRotationPoint(148F, -83F, 7F);
		gunModel[23].rotateAngleY = -1.57079633F;

		gunModel[24].addShapeBox(0F, -2F, 0F, 10, 27, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[24].setRotationPoint(174F, -105F, -16F);

		gunModel[25].addShapeBox(0F, -2F, 0F, 10, 4, 26, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[25].setRotationPoint(174F, -117F, -13F);

		gunModel[26].addShapeBox(0F, -2F, 0F, 10, 4, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		gunModel[26].setRotationPoint(174F, -113F, -15F);

		gunModel[27].addShapeBox(0F, -2F, 0F, 10, 4, 32, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[27].setRotationPoint(174F, -109F, -16F);

		gunModel[28].addShapeBox(0F, -2F, 0F, 10, 4, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 67
		gunModel[28].setRotationPoint(174F, -70F, -13F);

		gunModel[29].addShapeBox(0F, -2F, 0F, 10, 4, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 68
		gunModel[29].setRotationPoint(174F, -74F, -15F);

		gunModel[30].addShapeBox(0F, -2F, 0F, 10, 4, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 69
		gunModel[30].setRotationPoint(174F, -78F, -16F);

		gunModel[31].addShapeBox(0F, -2F, 0F, 121, 4, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 73
		gunModel[31].setRotationPoint(53F, -67F, -16F);

		gunModel[32].addShapeBox(0F, -2F, 0F, 121, 4, 32, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		gunModel[32].setRotationPoint(53F, -120F, -16F);

		gunModel[33].addShapeBox(0F, -2F, 0F, 121, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		gunModel[33].setRotationPoint(53F, -75F, -19F);

		gunModel[34].addShapeBox(0F, -2F, 0F, 121, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		gunModel[34].setRotationPoint(53F, -71F, -18F);

		gunModel[35].addShapeBox(0F, -2F, 0F, 121, 25, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		gunModel[35].setRotationPoint(53F, -100F, 16F);

		gunModel[36].addShapeBox(0F, -2F, 0F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 88
		gunModel[36].setRotationPoint(53F, -116F, 13F);

		gunModel[37].addShapeBox(0F, -2F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 89
		gunModel[37].setRotationPoint(53F, -112F, 15F);

		gunModel[38].addShapeBox(0F, -2F, 0F, 121, 4, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 90
		gunModel[38].setRotationPoint(53F, -75F, 15F);

		gunModel[39].addShapeBox(0F, -2F, 0F, 121, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 91
		gunModel[39].setRotationPoint(53F, -71F, 13F);

		gunModel[40].addShapeBox(0F, -2F, 0F, 6, 49, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		gunModel[40].setRotationPoint(50F, -116F, -16F);

		gunModel[41].addShapeBox(0F, -2F, 0F, 3, 49, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		gunModel[41].setRotationPoint(171F, -116F, -16F);

		gunModel[42].addShapeBox(0F, -2F, 0F, 242, 6, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 94
		gunModel[42].setRotationPoint(-212F, -81F, -15F);

		gunModel[43].addShapeBox(0F, -2F, 0F, 258, 6, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		gunModel[43].setRotationPoint(-205F, -76F, -17F);

		gunModel[44].addShapeBox(0F, -2F, 0F, 28, 1, 35, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		gunModel[44].setRotationPoint(25F, -77F, -17F);

		gunModel[45].addShapeBox(0F, -2F, 0F, 18, 2, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 97
		gunModel[45].setRotationPoint(-106F, -70F, -17F);

		gunModel[46].addShapeBox(0F, -2F, 0F, 12, 5, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		gunModel[46].setRotationPoint(-103F, -68F, -17F);

		gunModel[47].addShapeBox(0F, -2F, 0F, 12, 3, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 99
		gunModel[47].setRotationPoint(-103F, -63F, -17F);

		gunModel[48].addShapeBox(0F, -2F, 0F, 10, 3, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 100
		gunModel[48].setRotationPoint(-8F, -64F, -17F);

		gunModel[49].addShapeBox(0F, -2F, 0F, 12, 4, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 101
		gunModel[49].setRotationPoint(-9F, -68F, -17F);

		gunModel[50].addShapeBox(0F, -2F, 0F, 18, 2, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 102
		gunModel[50].setRotationPoint(-12F, -70F, -17F);

		gunModel[51].addShapeBox(0F, -2F, 0F, 55, 3, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 103
		gunModel[51].setRotationPoint(-69F, -70F, -17F);

		gunModel[52].addShapeBox(0F, -2F, 0F, 11, 5, 35, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 104
		gunModel[52].setRotationPoint(-28F, -67F, -17F);

		gunModel[53].addShapeBox(0F, -2F, 0F, 11, 5, 35, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 105
		gunModel[53].setRotationPoint(-66F, -67F, -17F);

		gunModel[54].addShapeBox(0F, -2F, 0F, 27, 4, 35, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		gunModel[54].setRotationPoint(26F, -81F, -17F);

		gunModel[55].addShapeBox(0F, -2F, 0F, 25, 3, 9, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[55].setRotationPoint(-212F, -84F, 9F);

		gunModel[56].addShapeBox(0F, -2F, 0F, 22, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gunModel[56].setRotationPoint(-212F, -88F, 9F);

		gunModel[57].addShapeBox(0F, -2F, 0F, 7, 38, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		gunModel[57].setRotationPoint(-212F, -126F, -17F);

		gunModel[58].addShapeBox(0F, -2F, 0F, 259, 22, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[58].setRotationPoint(-205F, -103F, -10F);

		gunModel[59].addShapeBox(0F, -2F, 0F, 117, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		gunModel[59].setRotationPoint(54F, -124F, -7F);

		gunModel[60].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		gunModel[60].setRotationPoint(54F, -128F, -8F);

		gunModel[61].addShapeBox(0F, -2F, 0F, 117, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 137
		gunModel[61].setRotationPoint(54F, -126F, -8F);

		gunModel[62].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		gunModel[62].setRotationPoint(62F, -128F, -8F);

		gunModel[63].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		gunModel[63].setRotationPoint(78F, -128F, -8F);

		gunModel[64].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		gunModel[64].setRotationPoint(70F, -128F, -8F);

		gunModel[65].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		gunModel[65].setRotationPoint(110F, -128F, -8F);

		gunModel[66].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		gunModel[66].setRotationPoint(102F, -128F, -8F);

		gunModel[67].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		gunModel[67].setRotationPoint(94F, -128F, -8F);

		gunModel[68].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		gunModel[68].setRotationPoint(86F, -128F, -8F);

		gunModel[69].addShapeBox(0F, -2F, 0F, 5, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		gunModel[69].setRotationPoint(166F, -128F, -8F);

		gunModel[70].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		gunModel[70].setRotationPoint(158F, -128F, -8F);

		gunModel[71].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		gunModel[71].setRotationPoint(150F, -128F, -8F);

		gunModel[72].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		gunModel[72].setRotationPoint(142F, -128F, -8F);

		gunModel[73].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		gunModel[73].setRotationPoint(134F, -128F, -8F);

		gunModel[74].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		gunModel[74].setRotationPoint(126F, -128F, -8F);

		gunModel[75].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		gunModel[75].setRotationPoint(118F, -128F, -8F);

		gunModel[76].addShapeBox(0F, -2F, 0F, 117, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		gunModel[76].setRotationPoint(54F, -63F, -7F);

		gunModel[77].addShapeBox(0F, -2F, 0F, 117, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		gunModel[77].setRotationPoint(54F, -59F, -8F);

		gunModel[78].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 157
		gunModel[78].setRotationPoint(78F, -57F, -8F);

		gunModel[79].addShapeBox(0F, -2F, 0F, 5, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 158
		gunModel[79].setRotationPoint(166F, -57F, -8F);

		gunModel[80].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 159
		gunModel[80].setRotationPoint(158F, -57F, -8F);

		gunModel[81].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 160
		gunModel[81].setRotationPoint(150F, -57F, -8F);

		gunModel[82].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 161
		gunModel[82].setRotationPoint(142F, -57F, -8F);

		gunModel[83].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 162
		gunModel[83].setRotationPoint(134F, -57F, -8F);

		gunModel[84].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 163
		gunModel[84].setRotationPoint(126F, -57F, -8F);

		gunModel[85].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 164
		gunModel[85].setRotationPoint(118F, -57F, -8F);

		gunModel[86].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 165
		gunModel[86].setRotationPoint(110F, -57F, -8F);

		gunModel[87].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 166
		gunModel[87].setRotationPoint(102F, -57F, -8F);

		gunModel[88].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		gunModel[88].setRotationPoint(94F, -57F, -8F);

		gunModel[89].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 168
		gunModel[89].setRotationPoint(86F, -57F, -8F);

		gunModel[90].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 169
		gunModel[90].setRotationPoint(70F, -57F, -8F);

		gunModel[91].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 170
		gunModel[91].setRotationPoint(62F, -57F, -8F);

		gunModel[92].addShapeBox(0F, -2F, 0F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 171
		gunModel[92].setRotationPoint(54F, -57F, -8F);

		gunModel[93].addShapeBox(0F, -2F, 0F, 2, 38, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		gunModel[93].setRotationPoint(216F, -119F, -6F);

		gunModel[94].addShapeBox(0F, -2F, 0F, 4, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		gunModel[94].setRotationPoint(-192F, -128F, -9F);

		gunModel[95].addShapeBox(0F, -2F, 0F, 4, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		gunModel[95].setRotationPoint(-184F, -128F, -9F);

		gunModel[96].addShapeBox(0F, -2F, 0F, 4, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		gunModel[96].setRotationPoint(-176F, -128F, -9F);

		gunModel[97].addShapeBox(0F, -2F, 0F, 4, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		gunModel[97].setRotationPoint(-168F, -128F, -9F);

		gunModel[98].addShapeBox(0F, -2F, 0F, 4, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		gunModel[98].setRotationPoint(-160F, -128F, -9F);

		gunModel[99].addShapeBox(0F, -2F, 0F, 4, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		gunModel[99].setRotationPoint(-152F, -128F, -9F);

		gunModel[100].addShapeBox(0F, -2F, 0F, 4, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		gunModel[100].setRotationPoint(-144F, -128F, -9F);

		gunModel[101].addShapeBox(0F, -2F, 0F, 4, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		gunModel[101].setRotationPoint(-136F, -128F, -9F);

		gunModel[102].addShapeBox(0F, -2F, 0F, 4, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		gunModel[102].setRotationPoint(-128F, -128F, -9F);

		gunModel[103].addShapeBox(0F, -2F, 0F, 4, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		gunModel[103].setRotationPoint(-120F, -128F, -9F);

		gunModel[104].addShapeBox(0F, -2F, 0F, 4, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		gunModel[104].setRotationPoint(-112F, -128F, -9F);

		gunModel[105].addShapeBox(0F, -2F, 0F, 4, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		gunModel[105].setRotationPoint(-104F, -128F, -9F);

		gunModel[106].addShapeBox(0F, -2F, 0F, 4, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		gunModel[106].setRotationPoint(-96F, -128F, -9F);

		gunModel[107].addShapeBox(0F, -2F, 0F, 4, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		gunModel[107].setRotationPoint(-88F, -128F, -9F);

		gunModel[108].addShapeBox(0F, -2F, 0F, 130, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 188
		gunModel[108].setRotationPoint(-205F, -126F, -9F);

		gunModel[109].addShapeBox(0F, -2F, 0F, 117, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		gunModel[109].setRotationPoint(54F, -94F, 19F);

		gunModel[110].addShapeBox(0F, -2F, 0F, 117, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		gunModel[110].setRotationPoint(54F, -95F, 23F);

		gunModel[111].addShapeBox(0F, -2F, 0F, 117, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 200
		gunModel[111].setRotationPoint(54F, -95F, 25F);

		gunModel[112].addShapeBox(0F, -2F, 0F, 117, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		gunModel[112].setRotationPoint(54F, -94F, -23F);

		gunModel[113].addShapeBox(0F, -2F, 0F, 117, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 208
		gunModel[113].setRotationPoint(54F, -95F, -25F);

		gunModel[114].addShapeBox(0F, -2F, 0F, 117, 16, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		gunModel[114].setRotationPoint(54F, -95F, -27F);

		gunModel[115].addShapeBox(0F, -2F, 0F, 141, 11, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		gunModel[115].setRotationPoint(-205F, -114F, -15F);

		gunModel[116].addShapeBox(0F, -2F, 0F, 5, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		gunModel[116].setRotationPoint(-141F, -122F, -6F);

		gunModel[117].addShapeBox(0F, -2F, 0F, 15, 2, 18, 0F,-4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		gunModel[117].setRotationPoint(-146F, -116F, -9F);

		gunModel[118].addShapeBox(0F, -2F, 0F, 7, 2, 14, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		gunModel[118].setRotationPoint(-142F, -118F, -7F);

		gunModel[119].addShapeBox(0F, -2F, 0F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 229
		gunModel[119].setRotationPoint(-142F, -124F, -7F);

		gunModel[120].addShapeBox(0F, -2F, 0F, 15, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F); // Box 231
		gunModel[120].setRotationPoint(-146F, -125F, -8F);

		gunModel[121].addShapeBox(0F, -2F, 0F, 15, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F); // Box 232
		gunModel[121].setRotationPoint(-116F, -125F, -8F);

		gunModel[122].addShapeBox(0F, -2F, 0F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 233
		gunModel[122].setRotationPoint(-112F, -124F, -7F);

		gunModel[123].addShapeBox(0F, -2F, 0F, 5, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		gunModel[123].setRotationPoint(-111F, -122F, -6F);

		gunModel[124].addShapeBox(0F, -2F, 0F, 7, 2, 14, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		gunModel[124].setRotationPoint(-112F, -118F, -7F);

		gunModel[125].addShapeBox(0F, -2F, 0F, 15, 2, 18, 0F,-4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		gunModel[125].setRotationPoint(-116F, -116F, -9F);

		gunModel[126].addShapeBox(0F, -2F, 0F, 15, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F); // Box 237
		gunModel[126].setRotationPoint(-176F, -125F, -8F);

		gunModel[127].addShapeBox(0F, -2F, 0F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 238
		gunModel[127].setRotationPoint(-172F, -124F, -7F);

		gunModel[128].addShapeBox(0F, -2F, 0F, 5, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		gunModel[128].setRotationPoint(-171F, -122F, -6F);

		gunModel[129].addShapeBox(0F, -2F, 0F, 7, 2, 14, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		gunModel[129].setRotationPoint(-172F, -118F, -7F);

		gunModel[130].addShapeBox(0F, -2F, 0F, 15, 2, 18, 0F,-4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		gunModel[130].setRotationPoint(-176F, -116F, -9F);

		gunModel[131].addShapeBox(0F, -2F, 0F, 3, 4, 32, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		gunModel[131].setRotationPoint(50F, -120F, -16F);

		gunModel[132].addShapeBox(0F, -2F, 0F, 3, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 243
		gunModel[132].setRotationPoint(50F, -116F, -18F);

		gunModel[133].addShapeBox(0F, -2F, 0F, 3, 4, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 244
		gunModel[133].setRotationPoint(50F, -112F, -19F);

		gunModel[134].addShapeBox(0F, -2F, 0F, 3, 33, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		gunModel[134].setRotationPoint(50F, -108F, -19F);

		gunModel[135].addShapeBox(0F, -2F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		gunModel[135].setRotationPoint(50F, -75F, -19F);

		gunModel[136].addShapeBox(0F, -2F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		gunModel[136].setRotationPoint(50F, -71F, -18F);

		gunModel[137].addShapeBox(0F, -2F, 0F, 3, 4, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 248
		gunModel[137].setRotationPoint(50F, -67F, -16F);

		gunModel[138].addShapeBox(0F, -2F, 0F, 3, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 249
		gunModel[138].setRotationPoint(50F, -71F, 13F);

		gunModel[139].addShapeBox(0F, -2F, 0F, 3, 4, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 250
		gunModel[139].setRotationPoint(50F, -75F, 15F);

		gunModel[140].addShapeBox(0F, -2F, 0F, 3, 33, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		gunModel[140].setRotationPoint(50F, -108F, 16F);

		gunModel[141].addShapeBox(0F, -2F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		gunModel[141].setRotationPoint(50F, -112F, 15F);

		gunModel[142].addShapeBox(0F, -2F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		gunModel[142].setRotationPoint(50F, -116F, 13F);

		gunModel[143].addShapeBox(0F, -2F, 0F, 103, 7, 27, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 254
		gunModel[143].setRotationPoint(-167F, -70F, -13F);

		gunModel[144].addShapeBox(0F, -2F, 0F, 86, 7, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F); // Box 255
		gunModel[144].setRotationPoint(-161F, -63F, -13F);

		gunModel[145].addShapeBox(0F, -2F, 0F, 12, 7, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		gunModel[145].setRotationPoint(-19F, -70F, -15F);

		gunModel[146].addShapeBox(0F, -2F, 0F, 15, 2, 14, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		gunModel[146].setRotationPoint(-207F, -116F, -5F);

		gunModel[147].addShapeBox(0F, -2F, 0F, 9, 2, 14, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		gunModel[147].setRotationPoint(-205F, -118F, -5F);

		gunModel[148].addShapeBox(0F, -2F, 0F, 8, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		gunModel[148].setRotationPoint(-205F, -122F, -5F);

		gunModel[149].addShapeBox(0F, -2F, 0F, 9, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
		gunModel[149].setRotationPoint(-205F, -124F, -8F);

		gunModel[150].addShapeBox(0F, -2F, 0F, 15, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 261
		gunModel[150].setRotationPoint(-207F, -126F, -8F);

		gunModel[151].addShapeBox(0F, -2F, 0F, 15, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 262
		gunModel[151].setRotationPoint(-86F, -126F, -9F);

		gunModel[152].addShapeBox(0F, -2F, 0F, 11, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 263
		gunModel[152].setRotationPoint(-82F, -124F, -9F);

		gunModel[153].addShapeBox(0F, -2F, 0F, 10, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		gunModel[153].setRotationPoint(-81F, -122F, -9F);

		gunModel[154].addShapeBox(0F, -2F, 0F, 11, 2, 18, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		gunModel[154].setRotationPoint(-82F, -118F, -9F);

		gunModel[155].addShapeBox(0F, -2F, 0F, 15, 2, 18, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		gunModel[155].setRotationPoint(-86F, -116F, -9F);

		gunModel[156].addShapeBox(0F, -2F, 0F, 10, 7, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 267
		gunModel[156].setRotationPoint(-135F, -56F, -13F);

		gunModel[157].addShapeBox(0F, -2F, 0F, 7, 7, 27, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		gunModel[157].setRotationPoint(-135F, -49F, -13F);

		gunModel[158].addShapeBox(0F, -2F, 0F, 13, 1, 27, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		gunModel[158].setRotationPoint(-135F, -38F, -13F);

		gunModel[159].addShapeBox(0F, -2F, 0F, 11, 4, 27, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 271
		gunModel[159].setRotationPoint(-135F, -42F, -13F);

		gunModel[160].addShapeBox(0F, -2F, 0F, 13, 3, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 272
		gunModel[160].setRotationPoint(-135F, -37F, -13F);

		gunModel[161].addShapeBox(0F, -2F, 0F, 17, 3, 21, 0F,0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F); // Box 273
		gunModel[161].setRotationPoint(-122F, -37F, -10F);

		gunModel[162].addShapeBox(0F, -2F, 0F, 6, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		gunModel[162].setRotationPoint(-105F, -32.5F, -10F);

		gunModel[163].addShapeBox(0F, -2F, 0F, 7, 3, 21, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 275
		gunModel[163].setRotationPoint(-99F, -32.5F, -10F);

		gunModel[164].addShapeBox(0F, -2F, 0F, 8, 4, 27, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 276
		gunModel[164].setRotationPoint(-92F, -37.5F, -13F);

		gunModel[165].addShapeBox(0F, -2F, 0F, 8, 5, 27, 0F,-3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 277
		gunModel[165].setRotationPoint(-92F, -42.5F, -13F);

		gunModel[166].addShapeBox(0F, -2F, 0F, 5, 5, 27, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 278
		gunModel[166].setRotationPoint(-89F, -47.5F, -13F);

		gunModel[167].addShapeBox(0F, -2F, 0F, 5, 5, 27, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 279
		gunModel[167].setRotationPoint(-89F, -52.5F, -13F);

		gunModel[168].addShapeBox(0F, -2F, 0F, 11, 4, 27, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -5F, 0F, 0F); // Box 280
		gunModel[168].setRotationPoint(-94F, -56.5F, -13F);

		gunModel[169].addShapeBox(0F, -2F, 0F, 9, 3, 7, 0F,-1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 281
		gunModel[169].setRotationPoint(-123F, -56F, -3F);

		gunModel[170].addShapeBox(0F, -2F, 0F, 6, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 282
		gunModel[170].setRotationPoint(-123F, -53F, -3F);

		gunModel[171].addShapeBox(0F, -2F, 0F, 6, 3, 7, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 283
		gunModel[171].setRotationPoint(-123F, -50F, -3F);

		gunModel[172].addShapeBox(0F, -2F, 0F, 6, 3, 7, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.5F, 0F, 0F); // Box 284
		gunModel[172].setRotationPoint(-123F, -47F, -3F);

		gunModel[173].addShapeBox(0F, -2F, 0F, 5, 3, 7, 0F,-0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -2.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.25F, 0F, 0F); // Box 285
		gunModel[173].setRotationPoint(-122F, -44F, -3F);

		gunModel[174].addShapeBox(0F, -2F, 0F, 6, 3, 7, 0F,-0.25F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.25F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F); // Box 286
		gunModel[174].setRotationPoint(-120F, -41F, -3F);

		gunModel[175].addShapeBox(0F, -2F, 0F, 75, 6, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		gunModel[175].setRotationPoint(-25F, -109F, -17F);

		gunModel[176].addShapeBox(0F, -2F, 0F, 75, 7, 35, 0F,-3F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		gunModel[176].setRotationPoint(-25F, -116F, -17F);

		gunModel[177].addShapeBox(0F, -2F, 0F, 16, 2, 18, 0F,-2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		gunModel[177].setRotationPoint(-212F, -128F, -9F);

		gunModel[178].addShapeBox(0F, -2F, 0F, 8, 6, 8, 0F,-5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 294
		gunModel[178].setRotationPoint(258F, -109F, 0F);
		gunModel[178].rotateAngleY = -1.57079633F;

		gunModel[179].addShapeBox(0F, -2F, 0F, 6, 8, 8, 0F,0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F); // Box 295
		gunModel[179].setRotationPoint(258F, -111F, 0F);
		gunModel[179].rotateAngleY = -1.57079633F;

		gunModel[180].addShapeBox(0F, -2F, 0F, 6, 8, 8, 0F,-3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F); // Box 296
		gunModel[180].setRotationPoint(258F, -111F, 6F);
		gunModel[180].rotateAngleY = -1.57079633F;

		gunModel[181].addShapeBox(0F, -2F, 0F, 8, 6, 8, 0F,-1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 297
		gunModel[181].setRotationPoint(258F, -109F, 8F);
		gunModel[181].rotateAngleY = -1.57079633F;

		gunModel[182].addShapeBox(0F, -2F, 0F, 8, 6, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F); // Box 298
		gunModel[182].setRotationPoint(258F, -103F, 8F);
		gunModel[182].rotateAngleY = -1.57079633F;

		gunModel[183].addShapeBox(0F, -2F, 0F, 6, 8, 8, 0F,-0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F); // Box 299
		gunModel[183].setRotationPoint(258F, -103F, 6F);
		gunModel[183].rotateAngleY = -1.57079633F;

		gunModel[184].addShapeBox(0F, -2F, 0F, 6, 8, 8, 0F,0F, 0F, 0F, -0.75F, -5.25F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F); // Box 300
		gunModel[184].setRotationPoint(258F, -103F, 0F);
		gunModel[184].rotateAngleY = -1.57079633F;

		gunModel[185].addShapeBox(0F, -2F, 0F, 8, 6, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F); // Box 301
		gunModel[185].setRotationPoint(258F, -103F, 0F);
		gunModel[185].rotateAngleY = -1.57079633F;

		gunModel[186].addShapeBox(0F, -2F, 0F, 27, 21, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		gunModel[186].setRotationPoint(-162F, -56F, -13F);

		gunModel[187].addShapeBox(0F, -2F, 0F, 20, 37, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 21F, 0F, 0F); // Box 310
		gunModel[187].setRotationPoint(-162F, -35F, -13F);

		gunModel[188].addShapeBox(0F, -2F, 0F, 7, 14, 27, 0F,12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		gunModel[188].setRotationPoint(-162F, -70F, -13F);

		gunModel[189].addShapeBox(0F, -2F, 0F, 7, 37, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 21F, 0F, 0F); // Box 312
		gunModel[189].setRotationPoint(-169F, -35F, -10F);

		gunModel[190].addShapeBox(0F, -2F, 0F, 7, 14, 21, 0F,5F, -8F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 5F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		gunModel[190].setRotationPoint(-169F, -70F, -10F);

		gunModel[191].addShapeBox(0F, -2F, 0F, 7, 11, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 314
		gunModel[191].setRotationPoint(-169F, -56F, -10F);

		gunModel[192].addShapeBox(0F, -2F, 0F, 7, 10, 21, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		gunModel[192].setRotationPoint(-169F, -45F, -10F);

		gunModel[193].addShapeBox(0F, -2F, 0F, 7, 37, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 21F, 0F, 0F); // Box 316
		gunModel[193].setRotationPoint(-142F, -35F, -10F);

		gunModel[194].addShapeBox(0F, -2F, 0F, 20, 5, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		gunModel[194].setRotationPoint(-183F, 2F, -13F);

		gunModel[195].addShapeBox(0F, -2F, 0F, 7, 5, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		gunModel[195].setRotationPoint(-190F, 2F, -10F);

		gunModel[196].addShapeBox(0F, -2F, 0F, 7, 5, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 319
		gunModel[196].setRotationPoint(-163F, 2F, -10F);

		gunModel[197].addShapeBox(0F, 0F, 0F, 37, 12, 21, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -30F, 0F, 0F); // Box 320
		gunModel[197].setRotationPoint(-190F, 5F, -10F);

		gunModel[198].addShapeBox(0F, 0F, 0F, 9, 23, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		gunModel[198].setRotationPoint(-3F, -124F, -18F);

		gunModel[199].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		gunModel[199].setRotationPoint(-3F, -126F, -18F);

		gunModel[200].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F,-2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		gunModel[200].setRotationPoint(-2F, -128F, -18F);

		gunModel[201].addShapeBox(0F, -2F, 0F, 6, 8, 16, 0F,-0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F); // Box 328
		gunModel[201].setRotationPoint(216F, -81F, 6F);
		gunModel[201].rotateAngleY = -1.57079633F;

		gunModel[202].addShapeBox(0F, -2F, 0F, 8, 6, 16, 0F,-5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 329
		gunModel[202].setRotationPoint(216F, -87F, 0F);
		gunModel[202].rotateAngleY = -1.57079633F;

		gunModel[203].addShapeBox(0F, -2F, 0F, 6, 8, 16, 0F,0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F); // Box 330
		gunModel[203].setRotationPoint(216F, -89F, 0F);
		gunModel[203].rotateAngleY = -1.57079633F;

		gunModel[204].addShapeBox(0F, -2F, 0F, 6, 8, 16, 0F,-3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F); // Box 331
		gunModel[204].setRotationPoint(216F, -89F, 6F);
		gunModel[204].rotateAngleY = -1.57079633F;

		gunModel[205].addShapeBox(0F, -2F, 0F, 8, 6, 16, 0F,-1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 332
		gunModel[205].setRotationPoint(216F, -87F, 8F);
		gunModel[205].rotateAngleY = -1.57079633F;

		gunModel[206].addShapeBox(0F, -2F, 0F, 8, 6, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F); // Box 333
		gunModel[206].setRotationPoint(216F, -81F, 8F);
		gunModel[206].rotateAngleY = -1.57079633F;

		gunModel[207].addShapeBox(0F, -2F, 0F, 6, 8, 16, 0F,0F, 0F, 0F, -0.75F, -5.25F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F); // Box 334
		gunModel[207].setRotationPoint(216F, -81F, 0F);
		gunModel[207].rotateAngleY = -1.57079633F;

		gunModel[208].addShapeBox(0F, -2F, 0F, 8, 6, 16, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F); // Box 335
		gunModel[208].setRotationPoint(216F, -81F, 0F);
		gunModel[208].rotateAngleY = -1.57079633F;

		gunModel[209].addShapeBox(0F, -2F, 0F, 8, 6, 16, 0F,-5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 336
		gunModel[209].setRotationPoint(216F, -109F, 0F);
		gunModel[209].rotateAngleY = -1.57079633F;

		gunModel[210].addShapeBox(0F, -2F, 0F, 6, 8, 16, 0F,0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F); // Box 337
		gunModel[210].setRotationPoint(216F, -111F, 0F);
		gunModel[210].rotateAngleY = -1.57079633F;

		gunModel[211].addShapeBox(0F, -2F, 0F, 6, 8, 16, 0F,-3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F); // Box 338
		gunModel[211].setRotationPoint(216F, -111F, 6F);
		gunModel[211].rotateAngleY = -1.57079633F;

		gunModel[212].addShapeBox(0F, -2F, 0F, 8, 6, 16, 0F,-1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 339
		gunModel[212].setRotationPoint(216F, -109F, 8F);
		gunModel[212].rotateAngleY = -1.57079633F;

		gunModel[213].addShapeBox(0F, -2F, 0F, 8, 6, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F); // Box 340
		gunModel[213].setRotationPoint(216F, -103F, 8F);
		gunModel[213].rotateAngleY = -1.57079633F;

		gunModel[214].addShapeBox(0F, -2F, 0F, 6, 8, 16, 0F,-0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -5.25F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F); // Box 341
		gunModel[214].setRotationPoint(216F, -103F, 6F);
		gunModel[214].rotateAngleY = -1.57079633F;

		gunModel[215].addShapeBox(0F, -2F, 0F, 6, 8, 16, 0F,0F, 0F, 0F, -0.75F, -5.25F, 0F, -0.75F, -5.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.1F, -1.1F, 0F, -3.1F, -1.1F, 0F, 0F, -0.5F, 0F); // Box 342
		gunModel[215].setRotationPoint(216F, -103F, 0F);
		gunModel[215].rotateAngleY = -1.57079633F;

		gunModel[216].addShapeBox(0F, -2F, 0F, 8, 6, 16, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -5.25F, -0.75F, 0F, -1.1F, -3.1F, 0F, -1.1F, -3.1F, 0F, -5.25F, -0.75F, 0F); // Box 343
		gunModel[216].setRotationPoint(216F, -103F, 0F);
		gunModel[216].rotateAngleY = -1.57079633F;

		gunModel[217].addShapeBox(0F, -2F, 0F, 2, 38, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		gunModel[217].setRotationPoint(230F, -119F, -6F);

		gunModel[218].addShapeBox(0F, -2F, 0F, 12, 38, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		gunModel[218].setRotationPoint(218F, -119F, -5F);

		gunModel[219].addShapeBox(0F, -2F, 0F, 16, 5, 12, 0F,-2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		gunModel[219].setRotationPoint(216F, -124F, -6F);

		gunModel[220].addShapeBox(0F, -2F, 0F, 12, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		gunModel[220].setRotationPoint(218F, -135F, 6F);

		gunModel[221].addShapeBox(0F, -2F, 0F, 12, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		gunModel[221].setRotationPoint(218F, -135F, -8F);

		gunModel[222].addShapeBox(0F, -2F, 0F, 12, 14, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		gunModel[222].setRotationPoint(218F, -139F, -6F);

		gunModel[223].addShapeBox(0F, -2F, 0F, 12, 9, 12, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		gunModel[223].setRotationPoint(218F, -148F, -6F);

		gunModel[224].addShapeBox(0F, -2F, 0F, 12, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		gunModel[224].setRotationPoint(218F, -155F, -7F);

		gunModel[225].addShapeBox(0F, -2F, 0F, 10, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		gunModel[225].setRotationPoint(219F, -157F, -7F);

		gunModel[226].addShapeBox(0F, 0F, 0F, 19, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -5F, 0F, -1.05F, -5F, 0F, 0F, 0F, 12F, 0F, 0F, 0F, -9.2F, -0.8F, 0F, -9.2F, -0.8F); // Box 97
		gunModel[226].setRotationPoint(68F, 26F, 0F);
		gunModel[226].rotateAngleZ = 1.57079633F;

		gunModel[227].addShapeBox(0F, 0F, 0F, 19, 10, 13, 0F,0F, -0.8F, -9.2F, 0F, -0.8F, -9.2F, 0F, -5F, -1.05F, 0F, -5F, -1.05F, 0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		gunModel[227].setRotationPoint(71F, 26F, 0F);
		gunModel[227].rotateAngleZ = 1.57079633F;

		gunModel[228].addShapeBox(0F, 0F, 0F, 19, 13, 10, 0F,0F, 0F, 0F, 12F, 0F, 0F, 0F, -9.2F, -0.8F, 0F, -9.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -5F, 0F, -1.05F, -5F); // Box 99
		gunModel[228].setRotationPoint(81F, 26F, 0F);
		gunModel[228].rotateAngleZ = 1.57079633F;

		gunModel[229].addShapeBox(0F, 0F, 0F, 19, 10, 13, 0F,0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -9.2F, 0F, -0.8F, -9.2F, 0F, -5F, -1.05F, 0F, -5F, -1.05F); // Box 100
		gunModel[229].setRotationPoint(81F, 26F, 0F);
		gunModel[229].rotateAngleZ = 1.57079633F;

		gunModel[230].addShapeBox(0F, 0F, 0F, 19, 13, 10, 0F,0F, -9.2F, -0.8F, 0F, -9.2F, -0.8F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -5F, 0F, -1.05F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		gunModel[230].setRotationPoint(81F, 26F, -10F);
		gunModel[230].rotateAngleZ = 1.57079633F;

		gunModel[231].addShapeBox(0F, 0F, 0F, 19, 10, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1.05F, 0F, -5F, -1.05F, 0F, -0.8F, -9.2F, 0F, -0.8F, -9.2F); // Box 102
		gunModel[231].setRotationPoint(81F, 26F, -13F);
		gunModel[231].rotateAngleZ = 1.57079633F;

		gunModel[232].addShapeBox(0F, 0F, 0F, 19, 10, 13, 0F,0F, -5F, -1.05F, 0F, -5F, -1.05F, 0F, -0.8F, -9.2F, 0F, -0.8F, -9.2F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gunModel[232].setRotationPoint(71F, 26F, -13F);
		gunModel[232].rotateAngleZ = 1.57079633F;

		gunModel[233].addShapeBox(0F, 0F, 0F, 19, 13, 10, 0F,0F, -1.05F, -5F, 0F, -1.05F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.2F, -0.8F, 0F, -9.2F, -0.8F, 12F, 0F, 0F, 0F, 0F, 0F); // Box 104
		gunModel[233].setRotationPoint(68F, 26F, -10F);
		gunModel[233].rotateAngleZ = 1.57079633F;

		gunModel[234].addShapeBox(0F, 0F, 0F, 9, 12, 64, 0F,-4.55F, -1.45F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.55F, -1.45F, 0F, -0.9F, -8.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -8.1F, 0F); // Box 441
		gunModel[234].setRotationPoint(72F, -50F, 12F);
		gunModel[234].rotateAngleX = -1.57079633F;

		gunModel[235].addShapeBox(0F, 0F, 0F, 12, 9, 64, 0F,-1.45F, -4.55F, 0F, -8.1F, -0.9F, 0F, -8.1F, -0.9F, 0F, -1.45F, -4.55F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		gunModel[235].setRotationPoint(69F, -50F, 9F);
		gunModel[235].rotateAngleX = -1.57079633F;

		gunModel[236].addShapeBox(0F, 0F, 0F, 12, 9, 64, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.45F, -4.55F, 0F, -8.1F, -0.9F, 0F, -8.1F, -0.9F, 0F, -1.45F, -4.55F, 0F); // Box 445
		gunModel[236].setRotationPoint(69F, -50F, 0F);
		gunModel[236].rotateAngleX = -1.57079633F;

		gunModel[237].addShapeBox(0F, 0F, 0F, 9, 12, 64, 0F,-0.9F, -8.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -8.1F, 0F, -4.55F, -1.45F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.55F, -1.45F, 0F); // Box 446
		gunModel[237].setRotationPoint(72F, -50F, 0F);
		gunModel[237].rotateAngleX = -1.57079633F;

		gunModel[238].addShapeBox(0F, 0F, 0F, 9, 12, 64, 0F,0F, 0F, 0F, -0.9F, -8.1F, 0F, -0.9F, -8.1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.55F, -1.45F, 0F, -4.55F, -1.45F, 0F, 0F, -0.5F, 0F); // Box 447
		gunModel[238].setRotationPoint(81F, -50F, 0F);
		gunModel[238].rotateAngleX = -1.57079633F;

		gunModel[239].addShapeBox(0F, 0F, 0F, 12, 9, 64, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -8.1F, -0.9F, 0F, -1.45F, -4.55F, 0F, -1.45F, -4.55F, 0F, -8.1F, -0.9F, 0F); // Box 448
		gunModel[239].setRotationPoint(81F, -50F, 0F);
		gunModel[239].rotateAngleX = -1.57079633F;

		gunModel[240].addShapeBox(0F, 0F, 0F, 12, 9, 64, 0F,-8.1F, -0.9F, 0F, -1.45F, -4.55F, 0F, -1.45F, -4.55F, 0F, -8.1F, -0.9F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 449
		gunModel[240].setRotationPoint(81F, -50F, 9F);
		gunModel[240].rotateAngleX = -1.57079633F;

		gunModel[241].addShapeBox(0F, 0F, 0F, 9, 12, 64, 0F,0F, -0.5F, 0F, -4.55F, -1.45F, 0F, -4.55F, -1.45F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.9F, -8.1F, 0F, -0.9F, -8.1F, 0F, 0F, 0F, 0F); // Box 450
		gunModel[241].setRotationPoint(81F, -50F, 12F);
		gunModel[241].rotateAngleX = -1.57079633F;

		gunModel[242].addShapeBox(0F, -2F, 0F, 16, 15, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 331
		gunModel[242].setRotationPoint(65F, -62F, -11.5F);

		gunModel[243].addShapeBox(0F, -2F, 0F, 16, 15, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 332
		gunModel[243].setRotationPoint(81F, -62F, -11.5F);

		gunModel[244].addShapeBox(0F, -2F, 0F, 2, 14, 23, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 333
		gunModel[244].setRotationPoint(63F, -62F, -11.5F);

		gunModel[245].addShapeBox(0F, -2F, 0F, 2, 14, 23, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 334
		gunModel[245].setRotationPoint(97F, -62F, -11.5F);

		gunModel[246].addShapeBox(0F, 0F, 0F, 101, 11, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		gunModel[246].setRotationPoint(-352F, -89F, -14F);

		gunModel[247].addShapeBox(0F, 0F, 0F, 77, 11, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -48F, 0F, 0F, -48F, 0F, 0F, -6F, 0F, 0F); // Box 336
		gunModel[247].setRotationPoint(-328F, -78F, -14F);

		gunModel[248].addShapeBox(0F, 0F, 0F, 23, 35, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 32F, 0F, 0F, -38F, 0F, 0F, -38F, 0F, 0F, 32F, 0F, 0F); // Box 337
		gunModel[248].setRotationPoint(-322F, -67F, -14F);

		gunModel[249].addShapeBox(0F, 0F, 0F, 39, 14, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -14F, 0F, -2F, -14F, 0F, -2F, 0F, 0F, -2F); // Box 338
		gunModel[249].setRotationPoint(-376F, -32F, -14F);

		gunModel[250].addShapeBox(0F, 0F, 0F, 17, 5, 28, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		gunModel[250].setRotationPoint(-376F, -37F, -14F);

		gunModel[251].addShapeBox(0F, 0F, 0F, 15, 33, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 340
		gunModel[251].setRotationPoint(-380F, -70F, -14F);

		gunModel[252].addShapeBox(0F, 0F, 0F, 29, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -1F, 0F, 0F); // Box 341
		gunModel[252].setRotationPoint(-381F, -78F, -14F);

		gunModel[253].addShapeBox(0F, 0F, 0F, 31, 11, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 342
		gunModel[253].setRotationPoint(-383F, -89F, -14F);

		gunModel[254].addShapeBox(0F, 0F, 0F, 149, 8, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		gunModel[254].setRotationPoint(-359F, -94F, -10F);

		gunModel[255].addShapeBox(0F, -2F, 0F, 113, 20, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		gunModel[255].setRotationPoint(56F, -97F, 22F);

		gunModel[256].addShapeBox(0F, -2F, 0F, 121, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		gunModel[256].setRotationPoint(52F, -92F, 29F);

		gunModel[257].addShapeBox(0F, -2F, 0F, 121, 6, 3, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		gunModel[257].setRotationPoint(52F, -98F, 29F);

		gunModel[258].addShapeBox(0F, -2F, 0F, 121, 6, 3, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		gunModel[258].setRotationPoint(52F, -104F, 27.5F);

		gunModel[259].addShapeBox(0F, -2F, 0F, 121, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 332
		gunModel[259].setRotationPoint(52F, -78F, 27.5F);

		gunModel[260].addShapeBox(0F, -2F, 0F, 121, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 333
		gunModel[260].setRotationPoint(52F, -84F, 29F);

		gunModel[261].addShapeBox(0F, -2F, 0F, 121, 3, 3, 0F,-3F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		gunModel[261].setRotationPoint(52F, -107F, 25.5F);

		gunModel[262].addShapeBox(0F, -2F, 0F, 121, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -1F, -3F, 0F, -1F); // Box 335
		gunModel[262].setRotationPoint(52F, -72F, 25.5F);

		gunModel[263].addShapeBox(0F, -2F, 0F, 121, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		gunModel[263].setRotationPoint(52F, -92F, -32F);

		gunModel[264].addShapeBox(0F, -2F, 0F, 121, 3, 3, 0F,-3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		gunModel[264].setRotationPoint(52F, -107F, -28.5F);

		gunModel[265].addShapeBox(0F, -2F, 0F, 121, 6, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		gunModel[265].setRotationPoint(52F, -104F, -30.5F);

		gunModel[266].addShapeBox(0F, -2F, 0F, 121, 6, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		gunModel[266].setRotationPoint(52F, -98F, -32F);

		gunModel[267].addShapeBox(0F, -2F, 0F, 121, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 340
		gunModel[267].setRotationPoint(52F, -84F, -32F);

		gunModel[268].addShapeBox(0F, -2F, 0F, 121, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 341
		gunModel[268].setRotationPoint(52F, -78F, -30.5F);

		gunModel[269].addShapeBox(0F, -2F, 0F, 121, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 1F, -3F, 0F, 1F); // Box 342
		gunModel[269].setRotationPoint(52F, -72F, -28.5F);

		gunModel[270].addShapeBox(0F, -2F, 0F, 113, 20, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		gunModel[270].setRotationPoint(56F, -97F, -29F);

		gunModel[271].addShapeBox(0F, -2F, 0F, 12, 5, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		gunModel[271].setRotationPoint(218F, -153F, -6.5F);

		gunModel[272].addShapeBox(0F, -2F, 0F, 12, 5, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		gunModel[272].setRotationPoint(218F, -153F, 4.5F);

		gunModel[273].addShapeBox(0F, -2F, 0F, 12, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		gunModel[273].setRotationPoint(218F, -155F, 5F);

		gunModel[274].addShapeBox(0F, -2F, 0F, 10, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		gunModel[274].setRotationPoint(219F, -157F, 5F);

		gunModel[275].addShapeBox(0F, -2F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		gunModel[275].setRotationPoint(222F, -150F, -2F);

		gunModel[276].addShapeBox(0F, -2F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		gunModel[276].setRotationPoint(223F, -155F, -1F);

		gunModel[277].addShapeBox(0F, 0F, 0F, 5, 7, 26, 0F,-2.5F, -1.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -2.5F, -1.05F, 0F, -3.075F, -4.6F, 0F, 0F, -5F, 0F, 0F, -5F, 1F, -3.075F, -4.6F, 0F); // Box 366
		gunModel[277].setRotationPoint(266F, -112F, 5F);
		gunModel[277].rotateAngleY = -1.57079633F;

		gunModel[278].addShapeBox(0F, 0F, 0F, 5, 7, 26, 0F,-2.5F, -1.05F, 0F, -1.925F, -2.4F, 0F, -1.925F, -2.4F, 0F, -2.5F, -1.05F, 0F, -0.4F, -4.6F, 0F, -3.55F, -3.55F, 0F, -3.55F, -3.55F, -3F, -0.4F, -4.6F, -3F); // Box 367
		gunModel[278].setRotationPoint(266F, -112F, 5F);
		gunModel[278].rotateAngleY = -1.57079633F;

		gunModel[279].addShapeBox(0F, 0F, 0F, 7, 5, 26, 0F,-1.05F, -2.5F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, -3F, -1.05F, -2.5F, 0F, -2.4F, -1.925F, 0F, -3.55F, -3.55F, 0F, -3.55F, -3.55F, -3F, -2.4F, -1.925F, 0F); // Box 368
		gunModel[279].setRotationPoint(266F, -110F, 7F);
		gunModel[279].rotateAngleY = -1.57079633F;

		gunModel[280].addShapeBox(0F, 0F, 0F, 5, 7, 26, 0F,0F, -0.5F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, 0F, -0.5F, 1F, 0F, -5F, 0F, -3.075F, -4.6F, 0F, -3.075F, -4.6F, 0F, 0F, -5F, 1F); // Box 380
		gunModel[280].setRotationPoint(266F, -112F, 0F);
		gunModel[280].rotateAngleY = -1.57079633F;

		gunModel[281].addShapeBox(0F, 0F, 0F, 7, 5, 26, 0F,-2.4F, -1.925F, 0F, -3.55F, -3.55F, 0F, -3.55F, -3.55F, -3F, -2.4F, -1.925F, 0F, -1.05F, -2.5F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, -3F, -1.05F, -2.5F, 0F); // Box 382
		gunModel[281].setRotationPoint(266F, -105F, 7F);
		gunModel[281].rotateAngleY = -1.57079633F;

		gunModel[282].addShapeBox(0F, 0F, 0F, 5, 7, 26, 0F,-0.4F, -4.6F, 0F, -3.55F, -3.55F, 0F, -3.55F, -3.55F, -3F, -0.4F, -4.6F, -3F, -2.5F, -1.05F, 0F, -1.925F, -2.4F, 0F, -1.925F, -2.4F, 0F, -2.5F, -1.05F, 0F); // Box 383
		gunModel[282].setRotationPoint(266F, -105F, 5F);
		gunModel[282].rotateAngleY = -1.57079633F;

		gunModel[283].addShapeBox(0F, 0F, 0F, 5, 7, 26, 0F,-3.55F, -3.55F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, -3F, -3.55F, -3.55F, -3F, -1.925F, -2.4F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, -1.925F, -2.4F, 0F); // Box 384
		gunModel[283].setRotationPoint(266F, -105F, 0F);
		gunModel[283].rotateAngleY = -1.57079633F;

		gunModel[284].addShapeBox(0F, 0F, 0F, 7, 5, 26, 0F,-3.55F, -3.55F, 0F, -2.4F, -1.925F, 0F, -2.4F, -1.925F, 0F, -3.55F, -3.55F, -3F, -4.6F, -0.4F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -4.6F, -0.4F, -3F); // Box 385
		gunModel[284].setRotationPoint(266F, -105F, 0F);
		gunModel[284].rotateAngleY = -1.57079633F;

		gunModel[285].addShapeBox(0F, 0F, 0F, 7, 5, 26, 0F,-4.6F, -0.4F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -4.6F, -0.4F, -3F, -3.55F, -3.55F, 0F, -2.4F, -1.925F, 0F, -2.4F, -1.925F, 0F, -3.55F, -3.55F, -3F); // Box 386
		gunModel[285].setRotationPoint(266F, -110F, 0F);
		gunModel[285].rotateAngleY = -1.57079633F;

		gunModel[286].addShapeBox(0F, 0F, 0F, 5, 7, 26, 0F,-1.925F, -2.4F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, -1.925F, -2.4F, 0F, -3.55F, -3.55F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, -3F, -3.55F, -3.55F, -3F); // Box 387
		gunModel[286].setRotationPoint(266F, -112F, 0F);
		gunModel[286].rotateAngleY = -1.57079633F;

		gunModel[287].addShapeBox(0F, 0F, 0F, 7, 5, 26, 0F,-1.05F, -2.5F, 0F, -4.6F, -3.075F, 0F, -4.6F, -3.075F, 0F, -1.05F, -2.5F, 0F, -0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 1F, -0.5F, 0F, 1F); // Box 362
		gunModel[287].setRotationPoint(266F, -110F, 7F);
		gunModel[287].rotateAngleY = -1.57079633F;

		gunModel[288].addShapeBox(0F, 0F, 0F, 7, 5, 26, 0F,-0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 1F, -0.5F, 0F, 1F, -1.05F, -2.5F, 0F, -4.6F, -3.075F, 0F, -4.6F, -3.075F, 0F, -1.05F, -2.5F, 0F); // Box 390
		gunModel[288].setRotationPoint(266F, -105F, 7F);
		gunModel[288].rotateAngleY = -1.57079633F;

		gunModel[289].addShapeBox(0F, 0F, 0F, 5, 7, 26, 0F,0F, -5F, 0F, -3.075F, -4.6F, 0F, -3.075F, -4.6F, 0F, 0F, -5F, 1F, 0F, -0.5F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, 0F, -0.5F, 1F); // Box 391
		gunModel[289].setRotationPoint(266F, -105F, 0F);
		gunModel[289].rotateAngleY = -1.57079633F;

		gunModel[290].addShapeBox(0F, 0F, 0F, 5, 7, 26, 0F,-3.075F, -4.6F, 0F, 0F, -5F, 0F, 0F, -5F, 1F, -3.075F, -4.6F, 0F, -2.5F, -1.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -2.5F, -1.05F, 0F); // Box 392
		gunModel[290].setRotationPoint(266F, -105F, 5F);
		gunModel[290].rotateAngleY = -1.57079633F;

		gunModel[291].addShapeBox(0F, 0F, 0F, 7, 5, 26, 0F,-5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -5F, 0F, 1F, -4.6F, -3.075F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -4.6F, -3.075F, 0F); // Box 393
		gunModel[291].setRotationPoint(266F, -105F, 0F);
		gunModel[291].rotateAngleY = -1.57079633F;

		gunModel[292].addShapeBox(0F, 0F, 0F, 7, 5, 26, 0F,-4.6F, -3.075F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -4.6F, -3.075F, 0F, -5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -5F, 0F, 1F); // Box 394
		gunModel[292].setRotationPoint(266F, -110F, 0F);
		gunModel[292].rotateAngleY = -1.57079633F;

		gunModel[293].addShapeBox(0F, 0F, 0F, 134, 7, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, -2F); // Box 395
		gunModel[293].setRotationPoint(-333F, -97F, -16F);

		gunModel[294].addShapeBox(0F, 0F, 0F, 134, 11, 15, 0F,5F, -0.4F, -10.6F, 0F, -0.4F, -10.6F, 0F, -5.2F, -1.25F, 0F, -5.2F, -1.25F, -9F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 1F, -9F, 4F, 1F); // Box 398
		gunModel[294].setRotationPoint(-342F, -112F, 0F);

		gunModel[295].addShapeBox(0F, 0F, 0F, 140, 15, 11, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -5.2F, -2F, -1.25F, -5.2F, -19F, 4F, 0F, 0F, 0F, 0F, 0F, -10.6F, -0.4F, -5F, -10.6F, -0.4F); // Box 399
		gunModel[295].setRotationPoint(-352F, -116F, 0F);

		gunModel[296].addShapeBox(0F, 0F, 0F, 134, 11, 15, 0F,0F, -5.2F, -1.25F, 0F, -5.2F, -1.25F, 0F, -0.4F, -10.6F, 5F, -0.4F, -10.6F, -9F, 4F, 1F, 0F, 4F, 1F, 0F, 4F, 0F, -9F, 4F, 0F); // Box 402
		gunModel[296].setRotationPoint(-342F, -112F, -15F);

		gunModel[297].addShapeBox(0F, 0F, 0F, 140, 15, 11, 0F,-2F, -1.25F, -5.2F, 0F, -1.25F, -5.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -5F, -10.6F, -0.4F, 0F, -10.6F, -0.4F, 0F, 0F, 0F, -19F, 4F, 0F); // Box 403
		gunModel[297].setRotationPoint(-352F, -116F, -11F);

		gunModel[298].addShapeBox(0F, 0F, 0F, 8, 10, 22, 0F,0F, 0F, 0F, -4.15F, -0.85F, 0F, -4.15F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -7.05F, 0F, -0.95F, -7.05F, 0F, 0F, 0F, 0F); // Box 177
		gunModel[298].setRotationPoint(-353F, -114F, 0F);
		gunModel[298].rotateAngleY = -1.57079633F;

		gunModel[299].addShapeBox(0F, 0F, 0F, 10, 8, 22, 0F,-7.05F, -0.95F, 0F, -0.85F, -4.15F, 0F, -0.85F, -4.15F, 0F, -7.05F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		gunModel[299].setRotationPoint(-353F, -112F, 0F);
		gunModel[299].rotateAngleY = -1.57079633F;

		gunModel[300].addShapeBox(0F, 0F, 0F, 10, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.05F, -0.95F, 0F, -0.85F, -4.15F, 0F, -0.85F, -4.15F, 0F, -7.05F, -0.95F, 0F); // Box 179
		gunModel[300].setRotationPoint(-353F, -104F, 0F);
		gunModel[300].rotateAngleY = -1.57079633F;

		gunModel[301].addShapeBox(0F, 0F, 0F, 8, 10, 22, 0F,0F, 0F, 0F, -0.95F, -7.05F, 0F, -0.95F, -7.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.15F, -0.85F, 0F, -4.15F, -0.85F, 0F, 0F, 0F, 0F); // Box 180
		gunModel[301].setRotationPoint(-353F, -104F, 0F);
		gunModel[301].rotateAngleY = -1.57079633F;

		gunModel[302].addShapeBox(0F, 0F, 0F, 8, 10, 22, 0F,-0.95F, -7.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -7.05F, 0F, -4.15F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.15F, -0.85F, 0F); // Box 181
		gunModel[302].setRotationPoint(-353F, -104F, 8F);
		gunModel[302].rotateAngleY = -1.57079633F;

		gunModel[303].addShapeBox(0F, 0F, 0F, 10, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -4.15F, 0F, -7.05F, -0.95F, 0F, -7.05F, -0.95F, 0F, -0.85F, -4.15F, 0F); // Box 182
		gunModel[303].setRotationPoint(-353F, -104F, 10F);
		gunModel[303].rotateAngleY = -1.57079633F;

		gunModel[304].addShapeBox(0F, 0F, 0F, 10, 8, 22, 0F,-0.85F, -4.15F, 0F, -7.05F, -0.95F, 0F, -7.05F, -0.95F, 0F, -0.85F, -4.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		gunModel[304].setRotationPoint(-353F, -112F, 10F);
		gunModel[304].rotateAngleY = -1.57079633F;

		gunModel[305].addShapeBox(0F, 0F, 0F, 8, 10, 22, 0F,-4.15F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.15F, -0.85F, 0F, -0.95F, -7.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -7.05F, 0F); // Box 184
		gunModel[305].setRotationPoint(-353F, -114F, 8F);
		gunModel[305].rotateAngleY = -1.57079633F;

		gunModel[306].addShapeBox(0F, -2F, 0F, 14, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 420
		gunModel[306].setRotationPoint(80F, -116F, 13F);

		gunModel[307].addShapeBox(0F, -2F, 0F, 14, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 421
		gunModel[307].setRotationPoint(108F, -116F, 13F);

		gunModel[308].addShapeBox(0F, -2F, 0F, 10, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 422
		gunModel[308].setRotationPoint(164F, -116F, 13F);

		gunModel[309].addShapeBox(0F, -2F, 0F, 14, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 423
		gunModel[309].setRotationPoint(136F, -116F, 13F);

		gunModel[310].addShapeBox(0F, -2F, 0F, 12, 4, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 429
		gunModel[310].setRotationPoint(81F, -112F, 15F);

		gunModel[311].addShapeBox(0F, -2F, 0F, 12, 4, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 430
		gunModel[311].setRotationPoint(109F, -112F, 15F);

		gunModel[312].addShapeBox(0F, -2F, 0F, 12, 4, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 431
		gunModel[312].setRotationPoint(137F, -112F, 15F);

		gunModel[313].addShapeBox(0F, -2F, 0F, 9, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 432
		gunModel[313].setRotationPoint(165F, -112F, 15F);

		gunModel[314].addShapeBox(0F, -2F, 0F, 13, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 433
		gunModel[314].setRotationPoint(53F, -108F, 16F);

		gunModel[315].addShapeBox(0F, -2F, 0F, 14, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 434
		gunModel[315].setRotationPoint(80F, -108F, 16F);

		gunModel[316].addShapeBox(0F, -2F, 0F, 14, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 435
		gunModel[316].setRotationPoint(108F, -108F, 16F);

		gunModel[317].addShapeBox(0F, -2F, 0F, 14, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 436
		gunModel[317].setRotationPoint(136F, -108F, 16F);

		gunModel[318].addShapeBox(0F, -2F, 0F, 10, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 437
		gunModel[318].setRotationPoint(164F, -108F, 16F);

		gunModel[319].addShapeBox(0F, -2F, 0F, 10, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F); // Box 438
		gunModel[319].setRotationPoint(164F, -116F, -18F);

		gunModel[320].addShapeBox(0F, -2F, 0F, 9, 4, 4, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 439
		gunModel[320].setRotationPoint(165F, -112F, -19F);

		gunModel[321].addShapeBox(0F, -2F, 0F, 10, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 440
		gunModel[321].setRotationPoint(164F, -108F, -19F);

		gunModel[322].addShapeBox(0F, -2F, 0F, 121, 25, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		gunModel[322].setRotationPoint(53F, -100F, -19F);

		gunModel[323].addShapeBox(0F, -2F, 0F, 14, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 442
		gunModel[323].setRotationPoint(136F, -108F, -19F);

		gunModel[324].addShapeBox(0F, -2F, 0F, 12, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F); // Box 443
		gunModel[324].setRotationPoint(137F, -112F, -19F);

		gunModel[325].addShapeBox(0F, -2F, 0F, 14, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 444
		gunModel[325].setRotationPoint(136F, -116F, -18F);

		gunModel[326].addShapeBox(0F, -2F, 0F, 14, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 445
		gunModel[326].setRotationPoint(108F, -116F, -18F);

		gunModel[327].addShapeBox(0F, -2F, 0F, 12, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F); // Box 446
		gunModel[327].setRotationPoint(109F, -112F, -19F);

		gunModel[328].addShapeBox(0F, -2F, 0F, 14, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 447
		gunModel[328].setRotationPoint(108F, -108F, -19F);

		gunModel[329].addShapeBox(0F, -2F, 0F, 14, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 448
		gunModel[329].setRotationPoint(80F, -116F, -18F);

		gunModel[330].addShapeBox(0F, -2F, 0F, 12, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F); // Box 449
		gunModel[330].setRotationPoint(81F, -112F, -19F);

		gunModel[331].addShapeBox(0F, -2F, 0F, 14, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 450
		gunModel[331].setRotationPoint(80F, -108F, -19F);

		gunModel[332].addShapeBox(0F, -2F, 0F, 13, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 451
		gunModel[332].setRotationPoint(53F, -108F, -19F);

		gunModel[333].addShapeBox(0F, -2F, 0F, 12, 4, 4, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F); // Box 452
		gunModel[333].setRotationPoint(53F, -112F, -19F);

		gunModel[334].addShapeBox(0F, -2F, 0F, 13, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 453
		gunModel[334].setRotationPoint(53F, -116F, -18F);

		gunModel[335].addShapeBox(0F, -2F, 0F, 8, 4, 30, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		gunModel[335].setRotationPoint(-82F, -85F, -12F);

		gunModel[336].addShapeBox(0F, -2F, 0F, 4, 4, 33, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		gunModel[336].setRotationPoint(-206F, -107F, -16F);

		gunModel[337].addShapeBox(0F, -2F, 0F, 4, 4, 31, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		gunModel[337].setRotationPoint(-206F, -118F, -15F);

		gunModel[338].addShapeBox(0F, -2F, 0F, 43, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 457
		gunModel[338].setRotationPoint(7F, -103F, -12F);

		gunModel[339].addShapeBox(0F, -2F, 0F, 8, 4, 28, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		gunModel[339].setRotationPoint(-82F, -107F, -11F);

		gunModel[340].addShapeBox(0F, -2F, 0F, 4, 30, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		gunModel[340].setRotationPoint(-80F, -111F, 15F);

		gunModel[341].addShapeBox(0F, -2F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 460
		gunModel[341].setRotationPoint(-80F, -81F, 15F);

		gunModel[342].addShapeBox(0F, -2F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 461
		gunModel[342].setRotationPoint(-80F, -114F, 15F);

		gunModel[343].addShapeBox(0F, -2F, 0F, 17, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		gunModel[343].setRotationPoint(-80F, -117F, 15F);

		gunModel[344].addShapeBox(0F, -2F, 0F, 8, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		gunModel[344].setRotationPoint(-74F, -126F, 15F);

		gunModel[345].addShapeBox(0F, -2F, 0F, 6, 29, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		gunModel[345].setRotationPoint(-204F, -99F, 18F);

		gunModel[346].addShapeBox(0F, -2F, 0F, 2, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		gunModel[346].setRotationPoint(-198F, -88F, 18F);

		gunModel[347].addShapeBox(0F, 0F, 0F, 28, 8, 32, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 473
		gunModel[347].setRotationPoint(-383F, -97F, -16F);

		gunModel[348].addShapeBox(0F, 0F, 0F, 22, 15, 11, 0F,0F, 0F, 0F, -12F, 0F, 0F, -11F, -1.25F, -5.2F, 0F, -1.25F, -5.2F, 0F, 4F, 0F, 0F, 4F, 0F, -9F, -10.6F, -0.4F, 0F, -10.6F, -0.4F); // Box 474
		gunModel[348].setRotationPoint(-383F, -116F, 0F);

		gunModel[349].addShapeBox(0F, 0F, 0F, 22, 11, 15, 0F,0F, -0.4F, -10.6F, -9F, -0.4F, -10.6F, -6F, -5.2F, -1.25F, 0F, -5.2F, -1.25F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 1F, 0F, 4F, 1F); // Box 475
		gunModel[349].setRotationPoint(-383F, -112F, 0F);

		gunModel[350].addShapeBox(0F, 0F, 0F, 22, 15, 11, 0F,0F, -1.25F, -5.2F, -11F, -1.25F, -5.2F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -10.6F, -0.4F, -9F, -10.6F, -0.4F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 476
		gunModel[350].setRotationPoint(-383F, -116F, -11F);

		gunModel[351].addShapeBox(0F, 0F, 0F, 22, 11, 15, 0F,0F, -5.2F, -1.25F, -6F, -5.2F, -1.25F, -9F, -0.4F, -10.6F, 0F, -0.4F, -10.6F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 477
		gunModel[351].setRotationPoint(-383F, -112F, -15F);

		gunModel[352].addShapeBox(0F, 0F, 0F, 12, 9, 12, 0F,-0.5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -1.45F, -4.55F, 0F, -8.1F, -0.9F, 0F, -8.1F, -0.9F, 0F, -1.45F, -4.55F, 0F); // Box 445
		gunModel[352].setRotationPoint(-224F, -88F, 12F);
		gunModel[352].rotateAngleY = -1.57079633F;

		gunModel[353].addShapeBox(0F, 0F, 0F, 9, 12, 12, 0F,-0.9F, -8.1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.9F, -8.1F, 0F, -4.55F, -1.45F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.55F, -1.45F, 0F); // Box 446
		gunModel[353].setRotationPoint(-224F, -88F, 9F);
		gunModel[353].rotateAngleY = -1.57079633F;

		gunModel[354].addShapeBox(0F, 0F, 0F, 9, 12, 12, 0F,0F, 2F, 0F, -0.9F, -8.1F, 0F, -0.9F, -8.1F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, -4.55F, -1.45F, 0F, -4.55F, -1.45F, 0F, 0F, -0.5F, 0F); // Box 447
		gunModel[354].setRotationPoint(-224F, -88F, 0F);
		gunModel[354].rotateAngleY = -1.57079633F;

		gunModel[355].addShapeBox(0F, 0F, 0F, 12, 9, 12, 0F,0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F, -8.1F, -0.9F, 0F, -1.45F, -4.55F, 0F, -1.45F, -4.55F, 0F, -8.1F, -0.9F, 0F); // Box 448
		gunModel[355].setRotationPoint(-224F, -88F, 0F);
		gunModel[355].rotateAngleY = -1.57079633F;

		gunModel[356].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 514
		gunModel[356].setRotationPoint(-215F, -124F, 2F);
		gunModel[356].rotateAngleY = -1.57079633F;

		gunModel[357].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		gunModel[357].setRotationPoint(-215F, -127F, 2F);
		gunModel[357].rotateAngleY = -1.57079633F;

		gunModel[358].addShapeBox(9F, 0F, 0F, 28, 4, 5, 0F,0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		gunModel[358].setRotationPoint(-214F, -87F, -23F);
		gunModel[358].rotateAngleY = 1.57079633F;

		gunModel[359].addShapeBox(9F, 0F, 0F, 28, 5, 4, 0F,0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		gunModel[359].setRotationPoint(-215F, -88F, -23F);
		gunModel[359].rotateAngleY = 1.57079633F;

		gunModel[360].addShapeBox(9F, 0F, 0F, 28, 5, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F); // Box 478
		gunModel[360].setRotationPoint(-219F, -88F, -23F);
		gunModel[360].rotateAngleY = 1.57079633F;

		gunModel[361].addShapeBox(9F, 0F, 0F, 28, 4, 5, 0F,0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 479
		gunModel[361].setRotationPoint(-219F, -87F, -23F);
		gunModel[361].rotateAngleY = 1.57079633F;

		gunModel[362].addShapeBox(9F, 0F, 0F, 28, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F); // Box 480
		gunModel[362].setRotationPoint(-219F, -83F, -23F);
		gunModel[362].rotateAngleY = 1.57079633F;

		gunModel[363].addShapeBox(9F, 0F, 0F, 28, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F); // Box 481
		gunModel[363].setRotationPoint(-219F, -83F, -23F);
		gunModel[363].rotateAngleY = 1.57079633F;

		gunModel[364].addShapeBox(9F, 0F, 0F, 28, 5, 4, 0F,0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 482
		gunModel[364].setRotationPoint(-215F, -83F, -23F);
		gunModel[364].rotateAngleY = 1.57079633F;

		gunModel[365].addShapeBox(9F, 0F, 0F, 28, 4, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F); // Box 483
		gunModel[365].setRotationPoint(-214F, -83F, -23F);
		gunModel[365].rotateAngleY = 1.57079633F;

		gunModel[366].addShapeBox(0F, -2F, 0F, 264, 22, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		gunModel[366].setRotationPoint(-212F, -103F, -15F);

		gunModel[367].addShapeBox(0F, -2F, 0F, 7, 35, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		gunModel[367].setRotationPoint(-205F, -123F, -17F);

		gunModel[368].addShapeBox(0F, -2F, 0F, 50, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 527
		gunModel[368].setRotationPoint(-20F, -81F, -17F);

		gunModel[369].addShapeBox(0F, -2F, 0F, 4, 7, 15, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		gunModel[369].setRotationPoint(-24F, -83F, -17F);

		gunModel[370].addShapeBox(0F, -2F, 0F, 7, 12, 15, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		gunModel[370].setRotationPoint(-31F, -88F, -17F);

		gunModel[371].addShapeBox(0F, -2F, 0F, 257, 6, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		gunModel[371].setRotationPoint(-205F, -94F, -6F);

		gunModel[372].addShapeBox(0F, -2F, 0F, 7, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 531
		gunModel[372].setRotationPoint(-38F, -88F, -17F);

		gunModel[373].addShapeBox(0F, -2F, 0F, 4, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 532
		gunModel[373].setRotationPoint(-35F, -85F, -17F);

		gunModel[374].addShapeBox(0F, -2F, 0F, 4, 3, 15, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		gunModel[374].setRotationPoint(-35F, -82F, -17F);

		gunModel[375].addShapeBox(0F, -2F, 0F, 7, 3, 15, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		gunModel[375].setRotationPoint(-38F, -79F, -17F);

		gunModel[376].addShapeBox(0F, -2F, 0F, 12, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		gunModel[376].setRotationPoint(-76F, -114F, -17F);

		gunModel[377].addShapeBox(0F, -2F, 0F, 122, 5, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		gunModel[377].setRotationPoint(-198F, -93F, -17F);

		gunModel[378].addShapeBox(0F, -2F, 0F, 45, 2, 24, 0F,0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		gunModel[378].setRotationPoint(-76F, -90F, -17F);

		gunModel[379].addShapeBox(0F, -2F, 0F, 1, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 539
		gunModel[379].setRotationPoint(-76F, -96F, -17F);

		gunModel[380].addShapeBox(0F, -2F, 0F, 4, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 540
		gunModel[380].setRotationPoint(-76F, -98F, -17F);

		gunModel[381].addShapeBox(0F, -2F, 0F, 1, 2, 15, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		gunModel[381].setRotationPoint(-76F, -94F, -17F);

		gunModel[382].addShapeBox(0F, -2F, 0F, 4, 2, 15, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		gunModel[382].setRotationPoint(-76F, -92F, -17F);

		gunModel[383].addShapeBox(0F, -2F, 0F, 113, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		gunModel[383].setRotationPoint(-146F, -88F, -16F);

		gunModel[384].addShapeBox(9F, 0F, 0F, 20, 4, 5, 0F,0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 544
		gunModel[384].setRotationPoint(-39F, -88F, -30F);
		gunModel[384].rotateAngleY = 1.57079633F;

		gunModel[385].addShapeBox(9F, 0F, 0F, 20, 4, 5, 0F,0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		gunModel[385].setRotationPoint(-34F, -88F, -30F);
		gunModel[385].rotateAngleY = 1.57079633F;

		gunModel[386].addShapeBox(9F, 0F, 0F, 20, 5, 4, 0F,0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		gunModel[386].setRotationPoint(-35F, -89F, -30F);
		gunModel[386].rotateAngleY = 1.57079633F;

		gunModel[387].addShapeBox(9F, 0F, 0F, 20, 5, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F); // Box 547
		gunModel[387].setRotationPoint(-39F, -89F, -30F);
		gunModel[387].rotateAngleY = 1.57079633F;

		gunModel[388].addShapeBox(9F, 0F, 0F, 20, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F); // Box 548
		gunModel[388].setRotationPoint(-39F, -84F, -30F);
		gunModel[388].rotateAngleY = 1.57079633F;

		gunModel[389].addShapeBox(9F, 0F, 0F, 20, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F); // Box 549
		gunModel[389].setRotationPoint(-39F, -84F, -30F);
		gunModel[389].rotateAngleY = 1.57079633F;

		gunModel[390].addShapeBox(9F, 0F, 0F, 20, 5, 4, 0F,0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 550
		gunModel[390].setRotationPoint(-35F, -84F, -30F);
		gunModel[390].rotateAngleY = 1.57079633F;

		gunModel[391].addShapeBox(9F, 0F, 0F, 20, 4, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F); // Box 551
		gunModel[391].setRotationPoint(-34F, -84F, -30F);
		gunModel[391].rotateAngleY = 1.57079633F;

		gunModel[392].addShapeBox(9F, 0F, 0F, 22, 5, 4, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2.55F, 0F, -0.85F, -2.25F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -2.7F, -1.3F, 0F, -3.2F, -0.8F); // Box 564
		gunModel[392].setRotationPoint(-101F, -89F, -44F);
		gunModel[392].rotateAngleY = 1.57079633F;

		gunModel[393].addShapeBox(9F, 0F, 0F, 22, 4, 5, 0F,0F, -0.8F, -3.2F, 0F, -1.3F, -2.7F, 0F, -2.5F, -1.35F, 0F, -2.25F, -0.85F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 565
		gunModel[393].setRotationPoint(-101F, -88F, -44F);
		gunModel[393].rotateAngleY = 1.57079633F;

		gunModel[394].addShapeBox(9F, 0F, 0F, 22, 5, 4, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, -2.7F, -1.3F, 0F, -3.2F, -0.8F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2.55F, 0F, -0.85F, -2.25F); // Box 568
		gunModel[394].setRotationPoint(-101F, -84F, -44F);
		gunModel[394].rotateAngleY = 1.57079633F;

		gunModel[395].addShapeBox(9F, 0F, 0F, 22, 4, 5, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.8F, -3.2F, 0F, -1.3F, -2.7F, 0F, -2.5F, -1.35F, 0F, -2.25F, -0.85F); // Box 569
		gunModel[395].setRotationPoint(-101F, -84F, -44F);
		gunModel[395].rotateAngleY = 1.57079633F;

		gunModel[396].addShapeBox(9F, 0F, 0F, 22, 5, 4, 0F,0F, -3.2F, -0.8F, 0F, -2.7F, -1.3F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -0.85F, -2.25F, 0F, -1.5F, -2.55F, 0F, -1.5F, 0F, 0F, -0.5F, 0F); // Box 570
		gunModel[396].setRotationPoint(-97F, -84F, -44F);
		gunModel[396].rotateAngleY = 1.57079633F;

		gunModel[397].addShapeBox(9F, 0F, 0F, 22, 4, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -2.25F, -0.85F, 0F, -2.5F, -1.35F, 0F, -1.3F, -2.7F, 0F, -0.8F, -3.2F); // Box 571
		gunModel[397].setRotationPoint(-96F, -84F, -44F);
		gunModel[397].rotateAngleY = 1.57079633F;

		gunModel[398].addShapeBox(9F, 0F, 0F, 22, 4, 5, 0F,0F, -2.25F, -0.85F, 0F, -2.5F, -1.35F, 0F, -1.3F, -2.7F, 0F, -0.8F, -3.2F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 572
		gunModel[398].setRotationPoint(-96F, -88F, -44F);
		gunModel[398].rotateAngleY = 1.57079633F;

		gunModel[399].addShapeBox(9F, 0F, 0F, 22, 5, 4, 0F,0F, -0.85F, -2.25F, 0F, -1.5F, -2.55F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, -0.8F, 0F, -2.7F, -1.3F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 573
		gunModel[399].setRotationPoint(-97F, -89F, -44F);
		gunModel[399].rotateAngleY = 1.57079633F;

		gunModel[400].addShapeBox(0F, -2F, 0F, 40, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 574
		gunModel[400].setRotationPoint(-64F, -99F, -17F);

		gunModel[401].addShapeBox(0F, 0F, 0F, 78, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		gunModel[401].setRotationPoint(-25F, -105F, -17F);

		gunModel[402].addShapeBox(0F, 0F, 0F, 3, 12, 3, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		gunModel[402].setRotationPoint(6F, -113F, -18F);

		gunModel[403].addShapeBox(0F, 0F, 0F, 3, 12, 3, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		gunModel[403].setRotationPoint(-6F, -113F, -18F);

		gunModel[404].addShapeBox(0F, 0F, 0F, 9, 19, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		gunModel[404].setRotationPoint(-3F, -124F, 14F);

		gunModel[405].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 580
		gunModel[405].setRotationPoint(6F, -113F, 16F);

		gunModel[406].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 581
		gunModel[406].setRotationPoint(-6F, -113F, 16F);

		gunModel[407].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		gunModel[407].setRotationPoint(-3F, -126F, 14F);

		gunModel[408].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F,-2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		gunModel[408].setRotationPoint(-2F, -128F, 14F);

		gunModel[409].addShapeBox(0F, -2F, 0F, 8, 9, 3, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		gunModel[409].setRotationPoint(-198F, -102F, -17F);

		gunModel[410].addShapeBox(0F, -2F, 0F, 24, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		gunModel[410].setRotationPoint(-212F, -119F, -18F);

		gunModel[411].addShapeBox(0F, -2F, 0F, 27, 2, 18, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		gunModel[411].setRotationPoint(-209F, -116F, -15F);

		gunModel[412].addShapeBox(0F, -2F, 0F, 21, 2, 18, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		gunModel[412].setRotationPoint(-207F, -118F, -15F);

		gunModel[413].addShapeBox(0F, -2F, 0F, 20, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		gunModel[413].setRotationPoint(-207F, -123F, -15F);

		gunModel[414].addShapeBox(0F, 0F, 0F, 19, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		gunModel[414].setRotationPoint(-3F, -131F, -8F);

		gunModel[415].addShapeBox(0F, 0F, 0F, 3, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 592
		gunModel[415].setRotationPoint(16F, -131F, -8F);

		gunModel[416].addShapeBox(0F, 0F, 0F, 3, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 593
		gunModel[416].setRotationPoint(19F, -131F, -6F);

		gunModel[417].addShapeBox(0F, -2F, 0F, 2, 12, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		gunModel[417].setRotationPoint(-65F, -117F, -9F);

		gunModel[418].addShapeBox(0F, -2F, 0F, 2, 12, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		gunModel[418].setRotationPoint(-22F, -117F, -9F);

		gunModel[419].addShapeBox(0F, -2F, 0F, 41, 2, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		gunModel[419].setRotationPoint(-63F, -107F, -9F);

		gunModel[420].addShapeBox(0F, -2F, 0F, 10, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 601
		gunModel[420].setRotationPoint(-74F, -124F, -17F);

		gunModel[421].addShapeBox(0F, -2F, 0F, 14, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		gunModel[421].setRotationPoint(-76F, -116F, -17F);

		gunModel[422].addShapeBox(0F, -2F, 0F, 4, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		gunModel[422].setRotationPoint(-64F, -114F, -17F);

		gunModel[423].addShapeBox(0F, -2F, 0F, 8, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 604
		gunModel[423].setRotationPoint(-25F, -117F, 30F);

		gunModel[424].addShapeBox(0F, -2F, 0F, 8, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 606
		gunModel[424].setRotationPoint(-68F, -117F, 30F);

		gunModel[425].addShapeBox(0F, -2F, 0F, 51, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 609
		gunModel[425].setRotationPoint(-68F, -107F, 30F);

		gunModel[426].addShapeBox(0F, -2F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		gunModel[426].setRotationPoint(-21F, -117F, 12F);

		gunModel[427].addShapeBox(0F, -2F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		gunModel[427].setRotationPoint(-68F, -117F, 12F);

		gunModel[428].addShapeBox(0F, 0F, 0F, 23, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		gunModel[428].setRotationPoint(-16F, -127F, 12F);

		gunModel[429].addShapeBox(0F, 0F, 0F, 35, 8, 2, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		gunModel[429].setRotationPoint(-28F, -127F, -13F);

		gunModel[430].addShapeBox(0F, -2F, 0F, 41, 2, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		gunModel[430].setRotationPoint(-63F, -105F, -11F);

		gunModel[431].addShapeBox(0F, 0F, 0F, 21, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 617
		gunModel[431].setRotationPoint(-44F, -119F, -15F);

		gunModel[432].addShapeBox(0F, 0F, 0F, 14, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
		gunModel[432].setRotationPoint(-58F, -111F, -21F);

		gunModel[433].addShapeBox(0F, 0F, 0F, 14, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 619
		gunModel[433].setRotationPoint(-58F, -115F, -21F);

		gunModel[434].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		gunModel[434].setRotationPoint(-44F, -111F, -21F);

		gunModel[435].addShapeBox(0F, -2F, 0F, 40, 8, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 621
		gunModel[435].setRotationPoint(-64F, -107F, -16F);

		gunModel[436].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		gunModel[436].setRotationPoint(-40F, -111F, -17F);

		gunModel[437].addShapeBox(0F, 0F, 0F, 7, 12, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 623
		gunModel[437].setRotationPoint(9F, -130F, -3F);

		gunModel[438].addShapeBox(0F, -2F, 0F, 7, 14, 3, 0F,3F, -8F, -1F, -12F, 0F, 0F, -12F, 0F, 0F, 5F, -8F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 624
		gunModel[438].setRotationPoint(-169F, -70F, -13F);

		gunModel[439].addShapeBox(0F, -2F, 0F, 7, 11, 3, 0F,-2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 625
		gunModel[439].setRotationPoint(-169F, -56F, -13F);

		gunModel[440].addShapeBox(0F, -2F, 0F, 7, 10, 3, 0F,-5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		gunModel[440].setRotationPoint(-169F, -45F, -13F);

		gunModel[441].addShapeBox(0F, -2F, 0F, 7, 37, 3, 0F,-2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 19F, 0F, -1F, -21F, 0F, 0F, -21F, 0F, 0F, 21F, 0F, 0F); // Box 627
		gunModel[441].setRotationPoint(-169F, -35F, -13F);

		gunModel[442].addShapeBox(0F, -2F, 0F, 7, 5, 3, 0F,-2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628
		gunModel[442].setRotationPoint(-190F, 2F, -13F);

		gunModel[443].addShapeBox(0F, 0F, 0F, 37, 12, 3, 0F,-2F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -30F, -2F, -1F, -2F, -4F, -1F, 0F, -3F, 0F, -30F, 0F, 0F); // Box 629
		gunModel[443].setRotationPoint(-190F, 5F, -13F);

		gunModel[444].addShapeBox(0F, -2F, 0F, 7, 5, 3, 0F,0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 630
		gunModel[444].setRotationPoint(-163F, 2F, -13F);

		gunModel[445].addShapeBox(0F, -2F, 0F, 7, 37, 3, 0F,0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, -23F, 0F, -1F, -21F, 0F, 0F, 21F, 0F, 0F); // Box 631
		gunModel[445].setRotationPoint(-142F, -35F, -13F);

		gunModel[446].addShapeBox(0F, 0F, 0F, 41, 19, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 644
		gunModel[446].setRotationPoint(-41F, -104F, 14F);

		gunModel[447].addShapeBox(0F, 0F, 0F, 6, 23, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		gunModel[447].setRotationPoint(-3F, -106F, 14F);

		gunModel[448].addShapeBox(0F, 0F, 0F, 37, 12, 3, 0F,0F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -30F, 0F, 0F, 0F, -3F, 0F, -2F, -4F, -1F, -30F, -2F, -1F); // Box 733
		gunModel[448].setRotationPoint(-190F, 5F, 11F);

		gunModel[449].addShapeBox(0F, -2F, 0F, 7, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 734
		gunModel[449].setRotationPoint(-190F, 2F, 11F);

		gunModel[450].addShapeBox(0F, -2F, 0F, 7, 37, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 19F, 0F, -1F); // Box 735
		gunModel[450].setRotationPoint(-169F, -35F, 11F);

		gunModel[451].addShapeBox(0F, -2F, 0F, 7, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 736
		gunModel[451].setRotationPoint(-163F, 2F, 11F);

		gunModel[452].addShapeBox(0F, -2F, 0F, 7, 37, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 21F, 0F, 0F, -21F, 0F, 0F, -23F, 0F, -1F, 21F, 0F, 0F); // Box 737
		gunModel[452].setRotationPoint(-142F, -35F, 11F);

		gunModel[453].addShapeBox(0F, -2F, 0F, 7, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F); // Box 738
		gunModel[453].setRotationPoint(-169F, -56F, 11F);

		gunModel[454].addShapeBox(0F, -2F, 0F, 7, 10, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F); // Box 739
		gunModel[454].setRotationPoint(-169F, -45F, 11F);

		gunModel[455].addShapeBox(0F, -2F, 0F, 7, 14, 3, 0F,5F, -8F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 3F, -8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F); // Box 740
		gunModel[455].setRotationPoint(-169F, -70F, 11F);

		gunModel[456].addShapeBox(0F, 0F, 0F, 6, 14, 28, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -4F); // Box 741
		gunModel[456].setRotationPoint(-382F, -32F, -14F);

		gunModel[457].addShapeBox(0F, 0F, 0F, 6, 5, 28, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 742
		gunModel[457].setRotationPoint(-382F, -37F, -14F);

		gunModel[458].addShapeBox(0F, 0F, 0F, 10, 33, 28, 0F,0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F); // Box 743
		gunModel[458].setRotationPoint(-386F, -70F, -14F);

		gunModel[459].addShapeBox(0F, 0F, 0F, 7, 8, 28, 0F,0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F); // Box 744
		gunModel[459].setRotationPoint(-387F, -78F, -14F);

		gunModel[460].addShapeBox(0F, 0F, 0F, 8, 11, 28, 0F,0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 745
		gunModel[460].setRotationPoint(-389F, -89F, -14F);

		gunModel[461].addShapeBox(0F, 0F, 0F, 6, 8, 32, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F); // Box 746
		gunModel[461].setRotationPoint(-389F, -97F, -16F);

		gunModel[462].addShapeBox(0F, 0F, 0F, 6, 11, 15, 0F,0F, -7.2F, -2.25F, 0F, -5.2F, -1.25F, 0F, -0.4F, -10.6F, 0F, -2.4F, -10.6F, 0F, 4F, -1F, 0F, 4F, 1F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 747
		gunModel[462].setRotationPoint(-389F, -112F, -15F);

		gunModel[463].addShapeBox(0F, 0F, 0F, 6, 15, 11, 0F,0F, -3.25F, -5.2F, 0F, -1.25F, -5.2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8.6F, -0.4F, 0F, -10.6F, -0.4F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 748
		gunModel[463].setRotationPoint(-389F, -116F, -11F);

		gunModel[464].addShapeBox(0F, 0F, 0F, 6, 15, 11, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -1.25F, -5.2F, 0F, -3.25F, -5.2F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -10.6F, -0.4F, 0F, -8.6F, -0.4F); // Box 749
		gunModel[464].setRotationPoint(-389F, -116F, 0F);

		gunModel[465].addShapeBox(0F, 0F, 0F, 6, 11, 15, 0F,0F, -2.4F, -10.6F, 0F, -0.4F, -10.6F, 0F, -5.2F, -1.25F, 0F, -7.2F, -2.25F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 1F, 0F, 4F, -1F); // Box 750
		gunModel[465].setRotationPoint(-389F, -112F, 0F);

		gunModel[466].addShapeBox(0F, 0F, 0F, 3, 19, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 19F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 19F, 0F, 0F); // Box 751
		gunModel[466].setRotationPoint(-327F, -37F, -4F);

		gunModel[467].addShapeBox(0F, 0F, 0F, 3, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 752
		gunModel[467].setRotationPoint(-327F, -44F, -4F);

		gunModel[468].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 753
		gunModel[468].setRotationPoint(-351F, -21F, -4F);

		gunModel[469].addShapeBox(0F, 0F, 0F, 4, 9, 8, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 754
		gunModel[469].setRotationPoint(-275F, -75F, -4F);
		gunModel[469].rotateAngleZ = 0.34906585F;

		gunModel[470].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 755
		gunModel[470].setRotationPoint(-218F, -127F, 2F);
		gunModel[470].rotateAngleY = -1.57079633F;

		gunModel[471].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 756
		gunModel[471].setRotationPoint(-218F, -122F, 2F);
		gunModel[471].rotateAngleY = -1.57079633F;

		gunModel[472].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 757
		gunModel[472].setRotationPoint(-218F, -126F, 2F);
		gunModel[472].rotateAngleY = -1.57079633F;

		gunModel[473].addShapeBox(0F, -2F, 0F, 21, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 758
		gunModel[473].setRotationPoint(-189F, -130F, -11F);

		gunModel[474].addShapeBox(0F, -2F, 0F, 21, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 759
		gunModel[474].setRotationPoint(-189F, -129F, -14F);

		gunModel[475].addShapeBox(0F, -2F, 0F, 18, 3, 3, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		gunModel[475].setRotationPoint(-186F, -129F, -17F);

		gunModel[476].addShapeBox(0F, -2F, 0F, 16, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 761
		gunModel[476].setRotationPoint(-185F, -129F, -20F);

		gunModel[477].addShapeBox(0F, -2F, 0F, 10, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		gunModel[477].setRotationPoint(-182F, -129F, -22F);

		gunModel[478].addShapeBox(0F, -2F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 764
		gunModel[478].setRotationPoint(-180.5F, -131F, -16F);

		gunModel[479].addShapeBox(0F, -2F, 0F, 7, 3, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 765
		gunModel[479].setRotationPoint(-180.5F, -131F, -19F);

		gunModel[480].addShapeBox(0F, -2F, 0F, 19, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 766
		gunModel[480].setRotationPoint(-188F, -126F, -20F);

		gunModel[481].addShapeBox(0F, -2F, 0F, 13, 1, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		gunModel[481].setRotationPoint(-185F, -126F, -22F);

		gunModel[482].addShapeBox(0F, -2F, 0F, 18, 1, 3, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 768
		gunModel[482].setRotationPoint(-186F, -126F, -17F);

		gunModel[483].addShapeBox(0F, -2F, 0F, 21, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 769
		gunModel[483].setRotationPoint(-189F, -126F, -14F);

		gunModel[484].addShapeBox(0F, -2F, 0F, 21, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 770
		gunModel[484].setRotationPoint(-189F, -126F, 8F);

		gunModel[485].addShapeBox(0F, -2F, 0F, 4, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		gunModel[485].setRotationPoint(-172F, -136F, -4F);

		gunModel[486].addShapeBox(0F, -2F, 0F, 17, 3, 12, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		gunModel[486].setRotationPoint(-185F, -139F, -6F);

		gunModel[487].addShapeBox(0F, -2F, 0F, 10, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		gunModel[487].setRotationPoint(-185F, -147F, -8F);

		gunModel[488].addShapeBox(0F, -2F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 588
		gunModel[488].setRotationPoint(-185F, -134F, -8F);

		gunModel[489].addShapeBox(0F, -2F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 589
		gunModel[489].setRotationPoint(-184F, -132F, -8F);

		gunModel[490].addShapeBox(0F, -2F, 0F, 10, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 590
		gunModel[490].setRotationPoint(-185F, -142F, -6F);

		gunModel[491].addShapeBox(0F, -2F, 0F, 10, 1, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		gunModel[491].setRotationPoint(-185F, -143F, -6F);

		gunModel[492].addShapeBox(0F, -2F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		gunModel[492].setRotationPoint(-185F, -149F, -8F);

		gunModel[493].addShapeBox(0F, -2F, 0F, 9, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		gunModel[493].setRotationPoint(-185F, -151F, -8F);

		gunModel[494].addShapeBox(0F, -2F, 0F, 7, 2, 2, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		gunModel[494].setRotationPoint(-184F, -153F, -8F);

		gunModel[495].addShapeBox(0F, -2F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 595
		gunModel[495].setRotationPoint(-184F, -132F, 6F);

		gunModel[496].addShapeBox(0F, -2F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 596
		gunModel[496].setRotationPoint(-185F, -134F, 6F);

		gunModel[497].addShapeBox(0F, -2F, 0F, 10, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 597
		gunModel[497].setRotationPoint(-185F, -147F, 6F);

		gunModel[498].addShapeBox(0F, -2F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		gunModel[498].setRotationPoint(-185F, -149F, 6F);

		gunModel[499].addShapeBox(0F, -2F, 0F, 9, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		gunModel[499].setRotationPoint(-185F, -151F, 6F);
	}

	private void initgunModel_2()
	{
		gunModel[500] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 600
		gunModel[501] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Box 601
		gunModel[502] = new ModelRendererTurbo(this, 1601, 41, textureX, textureY); // Box 602
		gunModel[503] = new ModelRendererTurbo(this, 1489, 1, textureX, textureY); // Box 603
		gunModel[504] = new ModelRendererTurbo(this, 2033, 9, textureX, textureY); // Box 604
		gunModel[505] = new ModelRendererTurbo(this, 1673, 41, textureX, textureY); // Box 605
		gunModel[506] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 606
		gunModel[507] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 607
		gunModel[508] = new ModelRendererTurbo(this, 1345, 17, textureX, textureY); // Box 608
		gunModel[509] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 609
		gunModel[510] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 610
		gunModel[511] = new ModelRendererTurbo(this, 769, 153, textureX, textureY); // Box 611
		gunModel[512] = new ModelRendererTurbo(this, 1041, 1, textureX, textureY); // Box 634
		gunModel[513] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 635
		gunModel[514] = new ModelRendererTurbo(this, 1153, 1, textureX, textureY); // Box 636
		gunModel[515] = new ModelRendererTurbo(this, 1273, 9, textureX, textureY); // Box 637
		gunModel[516] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 638
		gunModel[517] = new ModelRendererTurbo(this, 1177, 1, textureX, textureY); // Box 639
		gunModel[518] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Box 618
		gunModel[519] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 619
		gunModel[520] = new ModelRendererTurbo(this, 593, 129, textureX, textureY); // Box 620
		gunModel[521] = new ModelRendererTurbo(this, 889, 321, textureX, textureY); // Box 621
		gunModel[522] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 622
		gunModel[523] = new ModelRendererTurbo(this, 1169, 105, textureX, textureY); // Box 623
		gunModel[524] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 624
		gunModel[525] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 626
		gunModel[526] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Box 627
		gunModel[527] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 628
		gunModel[528] = new ModelRendererTurbo(this, 1113, 17, textureX, textureY); // Box 629
		gunModel[529] = new ModelRendererTurbo(this, 1329, 121, textureX, textureY); // Box 630
		gunModel[530] = new ModelRendererTurbo(this, 1409, 121, textureX, textureY); // Box 632
		gunModel[531] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 633
		gunModel[532] = new ModelRendererTurbo(this, 1985, 65, textureX, textureY); // Box 634
		gunModel[533] = new ModelRendererTurbo(this, 1465, 1, textureX, textureY); // Box 635
		gunModel[534] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 636

		gunModel[500].addShapeBox(0F, -2F, 0F, 7, 2, 2, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		gunModel[500].setRotationPoint(-184F, -153F, 6F);

		gunModel[501].addShapeBox(9F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F); // Box 601
		gunModel[501].setRotationPoint(-176F, -145F, -20F);
		gunModel[501].rotateAngleY = 1.57079633F;

		gunModel[502].addShapeBox(9F, 0F, 0F, 3, 4, 5, 0F,0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		gunModel[502].setRotationPoint(-176F, -149F, -20F);
		gunModel[502].rotateAngleY = 1.57079633F;

		gunModel[503].addShapeBox(9F, 0F, 0F, 3, 5, 4, 0F,0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		gunModel[503].setRotationPoint(-177F, -150F, -20F);
		gunModel[503].rotateAngleY = 1.57079633F;

		gunModel[504].addShapeBox(9F, 0F, 0F, 3, 5, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F); // Box 604
		gunModel[504].setRotationPoint(-181F, -150F, -20F);
		gunModel[504].rotateAngleY = 1.57079633F;

		gunModel[505].addShapeBox(9F, 0F, 0F, 3, 4, 5, 0F,0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 605
		gunModel[505].setRotationPoint(-181F, -149F, -20F);
		gunModel[505].rotateAngleY = 1.57079633F;

		gunModel[506].addShapeBox(9F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F); // Box 606
		gunModel[506].setRotationPoint(-181F, -145F, -20F);
		gunModel[506].rotateAngleY = 1.57079633F;

		gunModel[507].addShapeBox(9F, 0F, 0F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F); // Box 607
		gunModel[507].setRotationPoint(-181F, -145F, -20F);
		gunModel[507].rotateAngleY = 1.57079633F;

		gunModel[508].addShapeBox(9F, 0F, 0F, 3, 5, 4, 0F,0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 608
		gunModel[508].setRotationPoint(-177F, -145F, -20F);
		gunModel[508].rotateAngleY = 1.57079633F;

		gunModel[509].addShapeBox(0F, -2F, 0F, 1, 8, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 609
		gunModel[509].setRotationPoint(-186F, -147F, -8F);

		gunModel[510].addShapeBox(0F, -2F, 0F, 13, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		gunModel[510].setRotationPoint(-181F, -136F, -6F);

		gunModel[511].addShapeBox(0F, -2F, 0F, 13, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		gunModel[511].setRotationPoint(-181F, -136F, 4F);

		gunModel[512].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-0.25F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.75F, 0F, -1.05F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.05F, -0.7F, 0F); // Box 634
		gunModel[512].setRotationPoint(-182F, -136F, 8F);

		gunModel[513].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, -1.05F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -0.7F, -1.05F, 0F); // Box 635
		gunModel[513].setRotationPoint(-183F, -136F, 8F);

		gunModel[514].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.05F, -0.7F, 0F, -1.05F, -0.7F, 0F, 0F, -0.5F, 0F); // Box 636
		gunModel[514].setRotationPoint(-180F, -136F, 8F);

		gunModel[515].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.75F, -0.25F, 0F, -0.7F, -1.05F, 0F, -0.7F, -1.05F, 0F, -1.75F, -0.25F, 0F); // Box 637
		gunModel[515].setRotationPoint(-180F, -136F, 8F);

		gunModel[516].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-1.75F, -0.25F, 0F, -0.7F, -1.05F, 0F, -0.7F, -1.05F, 0F, -1.75F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 638
		gunModel[516].setRotationPoint(-180F, -138F, 8F);

		gunModel[517].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.5F, 0F, -1.05F, -0.7F, 0F, -1.05F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, 0F, 0F, 0F); // Box 639
		gunModel[517].setRotationPoint(-180F, -139F, 8F);

		gunModel[518].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1.05F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.05F, -0.7F, 0F, -0.25F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.75F, 0F); // Box 618
		gunModel[518].setRotationPoint(-182F, -139F, 8F);

		gunModel[519].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.7F, -1.05F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -0.7F, -1.05F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 619
		gunModel[519].setRotationPoint(-183F, -138F, 8F);

		gunModel[520].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		gunModel[520].setRotationPoint(-181.1F, -137F, -6F);

		gunModel[521].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 621
		gunModel[521].setRotationPoint(-182F, -147F, -10F);

		gunModel[522].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 622
		gunModel[522].setRotationPoint(-182F, -149F, -4F);

		gunModel[523].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F); // Box 623
		gunModel[523].setRotationPoint(-182F, -147F, -4F);

		gunModel[524].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 624
		gunModel[524].setRotationPoint(-182F, -154F, -4F);

		gunModel[525].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 626
		gunModel[525].setRotationPoint(-182F, -152F, 0F);

		gunModel[526].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 627
		gunModel[526].setRotationPoint(-182F, -151F, 0F);

		gunModel[527].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628
		gunModel[527].setRotationPoint(-182F, -151F, -4F);

		gunModel[528].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 629
		gunModel[528].setRotationPoint(-182F, -152F, -4F);

		gunModel[529].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 630
		gunModel[529].setRotationPoint(-182F, -153F, -4F);

		gunModel[530].addShapeBox(0F, -2F, 0F, 6, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 632
		gunModel[530].setRotationPoint(-188F, -129F, -22F);

		gunModel[531].addShapeBox(0F, -2F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 633
		gunModel[531].setRotationPoint(-191F, -129F, -22F);

		gunModel[532].addShapeBox(0F, -2F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		gunModel[532].setRotationPoint(-195F, -129F, -22F);

		gunModel[533].addShapeBox(0F, -2F, 0F, 1, 4, 4, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 635
		gunModel[533].setRotationPoint(-196F, -129F, -22F);

		gunModel[534].addShapeBox(0F, -2F, 0F, 1, 4, 4, 0F,0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 636
		gunModel[534].setRotationPoint(-197F, -129F, -22F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 129, 481, textureX, textureY); // Box 287
		ammoModel[1] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Box 321
		ammoModel[2] = new ModelRendererTurbo(this, 1761, 609, textureX, textureY); // Box 646
		ammoModel[3] = new ModelRendererTurbo(this, 1497, 641, textureX, textureY); // Box 647
		ammoModel[4] = new ModelRendererTurbo(this, 1, 577, textureX, textureY); // Box 649
		ammoModel[5] = new ModelRendererTurbo(this, 857, 625, textureX, textureY); // Box 650
		ammoModel[6] = new ModelRendererTurbo(this, 1617, 641, textureX, textureY); // Box 651
		ammoModel[7] = new ModelRendererTurbo(this, 97, 649, textureX, textureY); // Box 655
		ammoModel[8] = new ModelRendererTurbo(this, 969, 649, textureX, textureY); // Box 656
		ammoModel[9] = new ModelRendererTurbo(this, 209, 649, textureX, textureY); // Box 657
		ammoModel[10] = new ModelRendererTurbo(this, 1857, 377, textureX, textureY); // Box 658
		ammoModel[11] = new ModelRendererTurbo(this, 225, 385, textureX, textureY); // Box 659
		ammoModel[12] = new ModelRendererTurbo(this, 1929, 385, textureX, textureY); // Box 660
		ammoModel[13] = new ModelRendererTurbo(this, 1369, 369, textureX, textureY); // Box 662
		ammoModel[14] = new ModelRendererTurbo(this, 649, 385, textureX, textureY); // Box 663
		ammoModel[15] = new ModelRendererTurbo(this, 729, 385, textureX, textureY); // Box 664
		ammoModel[16] = new ModelRendererTurbo(this, 1145, 385, textureX, textureY); // Box 665
		ammoModel[17] = new ModelRendererTurbo(this, 89, 401, textureX, textureY); // Box 666
		ammoModel[18] = new ModelRendererTurbo(this, 1065, 409, textureX, textureY); // Box 667
		ammoModel[19] = new ModelRendererTurbo(this, 1145, 409, textureX, textureY); // Box 668
		ammoModel[20] = new ModelRendererTurbo(this, 1145, 433, textureX, textureY); // Box 669
		ammoModel[21] = new ModelRendererTurbo(this, 1145, 449, textureX, textureY); // Box 670
		ammoModel[22] = new ModelRendererTurbo(this, 1969, 473, textureX, textureY); // Box 671
		ammoModel[23] = new ModelRendererTurbo(this, 1177, 489, textureX, textureY); // Box 672
		ammoModel[24] = new ModelRendererTurbo(this, 1257, 489, textureX, textureY); // Box 673
		ammoModel[25] = new ModelRendererTurbo(this, 1969, 489, textureX, textureY); // Box 674
		ammoModel[26] = new ModelRendererTurbo(this, 49, 521, textureX, textureY); // Box 675
		ammoModel[27] = new ModelRendererTurbo(this, 137, 521, textureX, textureY); // Box 676
		ammoModel[28] = new ModelRendererTurbo(this, 985, 529, textureX, textureY); // Box 677
		ammoModel[29] = new ModelRendererTurbo(this, 1065, 529, textureX, textureY); // Box 678
		ammoModel[30] = new ModelRendererTurbo(this, 49, 537, textureX, textureY); // Box 679
		ammoModel[31] = new ModelRendererTurbo(this, 137, 537, textureX, textureY); // Box 680
		ammoModel[32] = new ModelRendererTurbo(this, 1865, 545, textureX, textureY); // Box 681
		ammoModel[33] = new ModelRendererTurbo(this, 1945, 545, textureX, textureY); // Box 682
		ammoModel[34] = new ModelRendererTurbo(this, 1457, 561, textureX, textureY); // Box 683
		ammoModel[35] = new ModelRendererTurbo(this, 1, 577, textureX, textureY); // Box 684
		ammoModel[36] = new ModelRendererTurbo(this, 1473, 577, textureX, textureY); // Box 685
		ammoModel[37] = new ModelRendererTurbo(this, 1, 593, textureX, textureY); // Box 686
		ammoModel[38] = new ModelRendererTurbo(this, 1, 609, textureX, textureY); // Box 687
		ammoModel[39] = new ModelRendererTurbo(this, 1945, 609, textureX, textureY); // Box 688
		ammoModel[40] = new ModelRendererTurbo(this, 1, 625, textureX, textureY); // Box 689
		ammoModel[41] = new ModelRendererTurbo(this, 1945, 625, textureX, textureY); // Box 690
		ammoModel[42] = new ModelRendererTurbo(this, 1, 641, textureX, textureY); // Box 691
		ammoModel[43] = new ModelRendererTurbo(this, 1729, 641, textureX, textureY); // Box 692
		ammoModel[44] = new ModelRendererTurbo(this, 1945, 641, textureX, textureY); // Box 693
		ammoModel[45] = new ModelRendererTurbo(this, 105, 649, textureX, textureY); // Box 694
		ammoModel[46] = new ModelRendererTurbo(this, 209, 649, textureX, textureY); // Box 695
		ammoModel[47] = new ModelRendererTurbo(this, 313, 649, textureX, textureY); // Box 696
		ammoModel[48] = new ModelRendererTurbo(this, 969, 649, textureX, textureY); // Box 697
		ammoModel[49] = new ModelRendererTurbo(this, 1081, 649, textureX, textureY); // Box 698
		ammoModel[50] = new ModelRendererTurbo(this, 1161, 649, textureX, textureY); // Box 699
		ammoModel[51] = new ModelRendererTurbo(this, 1241, 649, textureX, textureY); // Box 700
		ammoModel[52] = new ModelRendererTurbo(this, 1321, 649, textureX, textureY); // Box 701
		ammoModel[53] = new ModelRendererTurbo(this, 1401, 649, textureX, textureY); // Box 702
		ammoModel[54] = new ModelRendererTurbo(this, 1481, 649, textureX, textureY); // Box 703
		ammoModel[55] = new ModelRendererTurbo(this, 1, 657, textureX, textureY); // Box 704
		ammoModel[56] = new ModelRendererTurbo(this, 385, 657, textureX, textureY); // Box 705
		ammoModel[57] = new ModelRendererTurbo(this, 465, 657, textureX, textureY); // Box 706
		ammoModel[58] = new ModelRendererTurbo(this, 545, 657, textureX, textureY); // Box 707
		ammoModel[59] = new ModelRendererTurbo(this, 625, 657, textureX, textureY); // Box 708
		ammoModel[60] = new ModelRendererTurbo(this, 705, 657, textureX, textureY); // Box 709
		ammoModel[61] = new ModelRendererTurbo(this, 785, 657, textureX, textureY); // Box 710
		ammoModel[62] = new ModelRendererTurbo(this, 865, 657, textureX, textureY); // Box 711
		ammoModel[63] = new ModelRendererTurbo(this, 1729, 657, textureX, textureY); // Box 712
		ammoModel[64] = new ModelRendererTurbo(this, 1945, 657, textureX, textureY); // Box 713
		ammoModel[65] = new ModelRendererTurbo(this, 209, 665, textureX, textureY); // Box 714
		ammoModel[66] = new ModelRendererTurbo(this, 313, 665, textureX, textureY); // Box 715
		ammoModel[67] = new ModelRendererTurbo(this, 969, 665, textureX, textureY); // Box 716
		ammoModel[68] = new ModelRendererTurbo(this, 1081, 665, textureX, textureY); // Box 717
		ammoModel[69] = new ModelRendererTurbo(this, 1161, 665, textureX, textureY); // Box 718
		ammoModel[70] = new ModelRendererTurbo(this, 1241, 665, textureX, textureY); // Box 719
		ammoModel[71] = new ModelRendererTurbo(this, 1321, 665, textureX, textureY); // Box 720
		ammoModel[72] = new ModelRendererTurbo(this, 1401, 665, textureX, textureY); // Box 721
		ammoModel[73] = new ModelRendererTurbo(this, 1481, 665, textureX, textureY); // Box 722
		ammoModel[74] = new ModelRendererTurbo(this, 385, 673, textureX, textureY); // Box 723
		ammoModel[75] = new ModelRendererTurbo(this, 465, 673, textureX, textureY); // Box 724
		ammoModel[76] = new ModelRendererTurbo(this, 545, 673, textureX, textureY); // Box 725
		ammoModel[77] = new ModelRendererTurbo(this, 993, 289, textureX, textureY); // Box 726
		ammoModel[78] = new ModelRendererTurbo(this, 1745, 289, textureX, textureY); // Box 727
		ammoModel[79] = new ModelRendererTurbo(this, 529, 177, textureX, textureY); // Box 728
		ammoModel[80] = new ModelRendererTurbo(this, 1153, 297, textureX, textureY); // Box 729
		ammoModel[81] = new ModelRendererTurbo(this, 1361, 297, textureX, textureY); // Box 730
		ammoModel[82] = new ModelRendererTurbo(this, 225, 305, textureX, textureY); // Box 731
		ammoModel[83] = new ModelRendererTurbo(this, 1745, 305, textureX, textureY); // Box 732

		ammoModel[0].addShapeBox(0F, -2F, 0F, 40, 65, 100, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		ammoModel[0].setRotationPoint(-63F, -51F, -38F);

		ammoModel[1].addShapeBox(0F, -2F, 0F, 37, 5, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 321
		ammoModel[1].setRotationPoint(-60F, -67F, -19F);

		ammoModel[2].addShapeBox(0F, -2F, 0F, 40, 6, 100, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		ammoModel[2].setRotationPoint(-63F, -57F, -38F);

		ammoModel[3].addShapeBox(0F, -2F, 0F, 40, 5, 68, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
		ammoModel[3].setRotationPoint(-63F, -62F, -35F);

		ammoModel[4].addShapeBox(0F, -2F, 0F, 3, 5, 94, 0F,0F, -1F, -8F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, -8F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 649
		ammoModel[4].setRotationPoint(-66F, -62F, -35F);

		ammoModel[5].addShapeBox(0F, -2F, 0F, 3, 6, 100, 0F,0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 650
		ammoModel[5].setRotationPoint(-66F, -57F, -38F);

		ammoModel[6].addShapeBox(0F, -2F, 0F, 3, 65, 100, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 651
		ammoModel[6].setRotationPoint(-66F, -51F, -38F);

		ammoModel[7].addShapeBox(0F, -2F, 0F, 3, 65, 100, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 655
		ammoModel[7].setRotationPoint(-23F, -51F, -38F);

		ammoModel[8].addShapeBox(0F, -2F, 0F, 3, 6, 100, 0F,0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 656
		ammoModel[8].setRotationPoint(-23F, -57F, -38F);

		ammoModel[9].addShapeBox(0F, -2F, 0F, 3, 5, 94, 0F,0F, 0F, -6F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 657
		ammoModel[9].setRotationPoint(-23F, -62F, -35F);

		ammoModel[10].addShapeBox(0F, -2F, 0F, 40, 11, 2, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 658
		ammoModel[10].setRotationPoint(-63F, -72F, 51F);

		ammoModel[11].addShapeBox(0F, -2F, 0F, 40, 7, 2, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		ammoModel[11].setRotationPoint(-63F, -69F, 27F);

		ammoModel[12].addShapeBox(0F, -2F, 0F, 40, 5, 14, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		ammoModel[12].setRotationPoint(-63F, -62F, 45F);

		ammoModel[13].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F); // Box 662
		ammoModel[13].setRotationPoint(-68F, -114F, 16F);

		ammoModel[14].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F); // Box 663
		ammoModel[14].setRotationPoint(-68F, -119F, 16F);

		ammoModel[15].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 664
		ammoModel[15].setRotationPoint(-68F, -119F, 12F);

		ammoModel[16].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 665
		ammoModel[16].setRotationPoint(-68F, -118F, 11F);

		ammoModel[17].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F); // Box 666
		ammoModel[17].setRotationPoint(-68F, -114F, 11F);

		ammoModel[18].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 667
		ammoModel[18].setRotationPoint(-68F, -114F, 12F);

		ammoModel[19].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F); // Box 668
		ammoModel[19].setRotationPoint(-68F, -114F, 16F);

		ammoModel[20].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 669
		ammoModel[20].setRotationPoint(-68F, -118F, 16F);

		ammoModel[21].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670
		ammoModel[21].setRotationPoint(-68F, -117F, 33F);

		ammoModel[22].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F); // Box 671
		ammoModel[22].setRotationPoint(-68F, -113F, 33F);

		ammoModel[23].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 672
		ammoModel[23].setRotationPoint(-68F, -118F, 34F);

		ammoModel[24].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F); // Box 673
		ammoModel[24].setRotationPoint(-68F, -118F, 38F);

		ammoModel[25].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 674
		ammoModel[25].setRotationPoint(-68F, -117F, 38F);

		ammoModel[26].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F); // Box 675
		ammoModel[26].setRotationPoint(-68F, -113F, 38F);

		ammoModel[27].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F); // Box 676
		ammoModel[27].setRotationPoint(-68F, -113F, 38F);

		ammoModel[28].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 677
		ammoModel[28].setRotationPoint(-68F, -113F, 34F);

		ammoModel[29].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		ammoModel[29].setRotationPoint(-68F, -107F, 38F);

		ammoModel[30].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F); // Box 679
		ammoModel[30].setRotationPoint(-68F, -103F, 38F);

		ammoModel[31].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
		ammoModel[31].setRotationPoint(-68F, -108F, 39F);

		ammoModel[32].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F); // Box 681
		ammoModel[32].setRotationPoint(-68F, -108F, 43F);

		ammoModel[33].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 682
		ammoModel[33].setRotationPoint(-68F, -107F, 43F);

		ammoModel[34].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F); // Box 683
		ammoModel[34].setRotationPoint(-68F, -103F, 43F);

		ammoModel[35].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F); // Box 684
		ammoModel[35].setRotationPoint(-68F, -103F, 43F);

		ammoModel[36].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 685
		ammoModel[36].setRotationPoint(-68F, -103F, 39F);

		ammoModel[37].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 686
		ammoModel[37].setRotationPoint(-68F, -97F, 39F);

		ammoModel[38].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F); // Box 687
		ammoModel[38].setRotationPoint(-68F, -93F, 39F);

		ammoModel[39].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 688
		ammoModel[39].setRotationPoint(-68F, -98F, 40F);

		ammoModel[40].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F); // Box 689
		ammoModel[40].setRotationPoint(-68F, -98F, 44F);

		ammoModel[41].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 690
		ammoModel[41].setRotationPoint(-68F, -97F, 44F);

		ammoModel[42].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F); // Box 691
		ammoModel[42].setRotationPoint(-68F, -93F, 44F);

		ammoModel[43].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F); // Box 692
		ammoModel[43].setRotationPoint(-68F, -93F, 44F);

		ammoModel[44].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 693
		ammoModel[44].setRotationPoint(-68F, -93F, 40F);

		ammoModel[45].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 694
		ammoModel[45].setRotationPoint(-68F, -87F, 37F);

		ammoModel[46].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F); // Box 695
		ammoModel[46].setRotationPoint(-68F, -83F, 37F);

		ammoModel[47].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 696
		ammoModel[47].setRotationPoint(-68F, -88F, 38F);

		ammoModel[48].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F); // Box 697
		ammoModel[48].setRotationPoint(-68F, -88F, 42F);

		ammoModel[49].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 698
		ammoModel[49].setRotationPoint(-68F, -87F, 42F);

		ammoModel[50].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F); // Box 699
		ammoModel[50].setRotationPoint(-68F, -83F, 42F);

		ammoModel[51].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F); // Box 700
		ammoModel[51].setRotationPoint(-68F, -83F, 42F);

		ammoModel[52].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 701
		ammoModel[52].setRotationPoint(-68F, -83F, 38F);

		ammoModel[53].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 702
		ammoModel[53].setRotationPoint(-68F, -77F, 35F);

		ammoModel[54].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F); // Box 703
		ammoModel[54].setRotationPoint(-68F, -73F, 35F);

		ammoModel[55].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704
		ammoModel[55].setRotationPoint(-68F, -78F, 36F);

		ammoModel[56].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F); // Box 705
		ammoModel[56].setRotationPoint(-68F, -78F, 40F);

		ammoModel[57].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 706
		ammoModel[57].setRotationPoint(-68F, -77F, 40F);

		ammoModel[58].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F); // Box 707
		ammoModel[58].setRotationPoint(-68F, -73F, 40F);

		ammoModel[59].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F); // Box 708
		ammoModel[59].setRotationPoint(-68F, -73F, 40F);

		ammoModel[60].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 709
		ammoModel[60].setRotationPoint(-68F, -73F, 36F);

		ammoModel[61].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 710
		ammoModel[61].setRotationPoint(-68F, -67F, 40F);

		ammoModel[62].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F); // Box 711
		ammoModel[62].setRotationPoint(-68F, -68F, 40F);

		ammoModel[63].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 712
		ammoModel[63].setRotationPoint(-68F, -68F, 36F);

		ammoModel[64].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 713
		ammoModel[64].setRotationPoint(-68F, -67F, 35F);

		ammoModel[65].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F); // Box 714
		ammoModel[65].setRotationPoint(-68F, -63F, 35F);

		ammoModel[66].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 715
		ammoModel[66].setRotationPoint(-68F, -63F, 36F);

		ammoModel[67].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F); // Box 716
		ammoModel[67].setRotationPoint(-68F, -63F, 40F);

		ammoModel[68].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F); // Box 717
		ammoModel[68].setRotationPoint(-68F, -63F, 40F);

		ammoModel[69].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F); // Box 718
		ammoModel[69].setRotationPoint(-68F, -115F, 27F);

		ammoModel[70].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		ammoModel[70].setRotationPoint(-68F, -120F, 23F);

		ammoModel[71].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F); // Box 720
		ammoModel[71].setRotationPoint(-68F, -120F, 27F);

		ammoModel[72].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 721
		ammoModel[72].setRotationPoint(-68F, -119F, 27F);

		ammoModel[73].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F); // Box 722
		ammoModel[73].setRotationPoint(-68F, -115F, 27F);

		ammoModel[74].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 723
		ammoModel[74].setRotationPoint(-68F, -119F, 22F);

		ammoModel[75].addShapeBox(9F, 0F, 0F, 33, 4, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -0.85F, 0F, -2.25F, -0.85F, 0F, -0.8F, -3.2F, 0F, -0.8F, -3.2F); // Box 724
		ammoModel[75].setRotationPoint(-68F, -115F, 22F);

		ammoModel[76].addShapeBox(9F, 0F, 0F, 33, 5, 4, 0F,0F, -3.2F, -0.8F, 0F, -3.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, -2.25F, 0F, -0.85F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 725
		ammoModel[76].setRotationPoint(-68F, -115F, 23F);

		ammoModel[77].addShapeBox(9F, 0F, 0F, 19, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		ammoModel[77].setRotationPoint(-61F, -102F, 42F);

		ammoModel[78].addShapeBox(9F, 0F, 0F, 19, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 727
		ammoModel[78].setRotationPoint(-61F, -112F, 38F);

		ammoModel[79].addShapeBox(9F, 0F, 0F, 19, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 728
		ammoModel[79].setRotationPoint(-61F, -116F, 31F);

		ammoModel[80].addShapeBox(9F, 0F, 0F, 19, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		ammoModel[80].setRotationPoint(-61F, -116F, 19F);

		ammoModel[81].addShapeBox(9F, 0F, 0F, 19, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 730
		ammoModel[81].setRotationPoint(-61F, -91F, 42F);

		ammoModel[82].addShapeBox(9F, 0F, 0F, 19, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 731
		ammoModel[82].setRotationPoint(-61F, -80F, 41F);

		ammoModel[83].addShapeBox(9F, 0F, 0F, 19, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 732
		ammoModel[83].setRotationPoint(-61F, -70F, 39F);
	}

	private void initbreakActionModel_1()
	{
		breakActionModel[0] = new ModelRendererTurbo(this, 1273, 97, textureX, textureY); // Box 187
		breakActionModel[1] = new ModelRendererTurbo(this, 1489, 137, textureX, textureY); // Box 289
		breakActionModel[2] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 590
		breakActionModel[3] = new ModelRendererTurbo(this, 649, 281, textureX, textureY); // Box 591
		breakActionModel[4] = new ModelRendererTurbo(this, 1273, 1, textureX, textureY); // Box 594
		breakActionModel[5] = new ModelRendererTurbo(this, 321, 345, textureX, textureY); // Box 596
		breakActionModel[6] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 597
		breakActionModel[7] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 605
		breakActionModel[8] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 607
		breakActionModel[9] = new ModelRendererTurbo(this, 721, 177, textureX, textureY); // Box 608
		breakActionModel[10] = new ModelRendererTurbo(this, 225, 369, textureX, textureY); // Box 615
		breakActionModel[11] = new ModelRendererTurbo(this, 145, 297, textureX, textureY); // Box 616
		breakActionModel[12] = new ModelRendererTurbo(this, 1601, 81, textureX, textureY); // Box 640
		breakActionModel[13] = new ModelRendererTurbo(this, 1705, 81, textureX, textureY); // Box 641
		breakActionModel[14] = new ModelRendererTurbo(this, 1705, 25, textureX, textureY); // Box 642
		breakActionModel[15] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 643

		breakActionModel[0].addShapeBox(0F, -2F, 0F, 64, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		breakActionModel[0].setRotationPoint(-80F, -128F, -9F);

		breakActionModel[1].addShapeBox(0F, -2F, 0F, 45, 4, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		breakActionModel[1].setRotationPoint(-65F, -128F, 9F);

		breakActionModel[2].addShapeBox(0F, -2F, 0F, 29, 11, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		breakActionModel[2].setRotationPoint(-21F, -128F, -11F);

		breakActionModel[3].addShapeBox(0F, -2F, 0F, 26, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		breakActionModel[3].setRotationPoint(-18F, -128F, 9F);

		breakActionModel[4].addShapeBox(0F, -2F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, -2F, 0F, 9F, 0F); // Box 594
		breakActionModel[4].setRotationPoint(-20F, -128F, 9F);

		breakActionModel[5].addShapeBox(0F, -2F, 0F, 2, 7, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
		breakActionModel[5].setRotationPoint(-65F, -124F, -9F);

		breakActionModel[6].addShapeBox(0F, -2F, 0F, 2, 7, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 597
		breakActionModel[6].setRotationPoint(-22F, -124F, -9F);

		breakActionModel[7].addShapeBox(0F, -2F, 0F, 8, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 605
		breakActionModel[7].setRotationPoint(-25F, -124F, 30F);

		breakActionModel[8].addShapeBox(0F, -2F, 0F, 8, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 607
		breakActionModel[8].setRotationPoint(-68F, -124F, 30F);

		breakActionModel[9].addShapeBox(0F, -2F, 0F, 51, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 608
		breakActionModel[9].setRotationPoint(-68F, -129F, 30F);

		breakActionModel[10].addShapeBox(0F, -2F, 0F, 53, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		breakActionModel[10].setRotationPoint(-71F, -128F, -9F);

		breakActionModel[11].addShapeBox(0F, -2F, 0F, 23, 8, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		breakActionModel[11].setRotationPoint(-48F, -128F, -11F);

		breakActionModel[12].addShapeBox(0F, -2F, 0F, 8, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		breakActionModel[12].setRotationPoint(-74F, -129F, -13F);

		breakActionModel[13].addShapeBox(0F, -2F, 0F, 8, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		breakActionModel[13].setRotationPoint(-74F, -129F, 9F);

		breakActionModel[14].addShapeBox(0F, -2F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
		breakActionModel[14].setRotationPoint(-74F, -129F, 15F);

		breakActionModel[15].addShapeBox(0F, -2F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643
		breakActionModel[15].setRotationPoint(-74F, -129F, -17F);
	}
}