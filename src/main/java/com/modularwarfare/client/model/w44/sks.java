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
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class sks extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public sks() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[112];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 12
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 44
		gunModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 46
		gunModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 48
		gunModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 50
		gunModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 53
		gunModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 54
		gunModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 55
		gunModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 56
		gunModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 60
		gunModel[11] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 102
		gunModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 106
		gunModel[13] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 108
		gunModel[14] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 109
		gunModel[15] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 110
		gunModel[16] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 111
		gunModel[17] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 112
		gunModel[18] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 113
		gunModel[19] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 142
		gunModel[20] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 143
		gunModel[21] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 145
		gunModel[22] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 72
		gunModel[23] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 73
		gunModel[24] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 75
		gunModel[25] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 97
		gunModel[26] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 204
		gunModel[27] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 205
		gunModel[28] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 182
		gunModel[29] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 183
		gunModel[30] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 185
		gunModel[31] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 186
		gunModel[32] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 187
		gunModel[33] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 188
		gunModel[34] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 189
		gunModel[35] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 190
		gunModel[36] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 191
		gunModel[37] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 192
		gunModel[38] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 193
		gunModel[39] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 194
		gunModel[40] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 195
		gunModel[41] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 196
		gunModel[42] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 197
		gunModel[43] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 198
		gunModel[44] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 199
		gunModel[45] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 204
		gunModel[46] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 205
		gunModel[47] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 208
		gunModel[48] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 209
		gunModel[49] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 210
		gunModel[50] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 211
		gunModel[51] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 212
		gunModel[52] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 213
		gunModel[53] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 214
		gunModel[54] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 215
		gunModel[55] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 216
		gunModel[56] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 217
		gunModel[57] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 218
		gunModel[58] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 219
		gunModel[59] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 220
		gunModel[60] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 221
		gunModel[61] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 222
		gunModel[62] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 223
		gunModel[63] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 224
		gunModel[64] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 225
		gunModel[65] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 226
		gunModel[66] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 227
		gunModel[67] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 228
		gunModel[68] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 229
		gunModel[69] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 230
		gunModel[70] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 231
		gunModel[71] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 232
		gunModel[72] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 234
		gunModel[73] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 235
		gunModel[74] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 236
		gunModel[75] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 237
		gunModel[76] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 238
		gunModel[77] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 239
		gunModel[78] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 240
		gunModel[79] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 241
		gunModel[80] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 242
		gunModel[81] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 243
		gunModel[82] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 244
		gunModel[83] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 245
		gunModel[84] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 246
		gunModel[85] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 247
		gunModel[86] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 248
		gunModel[87] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 249
		gunModel[88] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 250
		gunModel[89] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 251
		gunModel[90] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 252
		gunModel[91] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 253
		gunModel[92] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 254
		gunModel[93] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 256
		gunModel[94] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 257
		gunModel[95] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 258
		gunModel[96] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 259
		gunModel[97] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 260
		gunModel[98] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 261
		gunModel[99] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 262
		gunModel[100] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 275
		gunModel[101] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 276
		gunModel[102] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 277
		gunModel[103] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 278
		gunModel[104] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 279
		gunModel[105] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 280
		gunModel[106] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 281
		gunModel[107] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 282
		gunModel[108] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 283
		gunModel[109] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 284
		gunModel[110] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 285
		gunModel[111] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 137

		gunModel[0].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 8
		gunModel[0].setRotationPoint(31F, -15F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[1].setRotationPoint(13F, -11.99F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F); // Box 44
		gunModel[2].setRotationPoint(-9F, -11F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 46
		gunModel[3].setRotationPoint(-9F, -10F, 1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 48
		gunModel[4].setRotationPoint(-12F, -8.5F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 50
		gunModel[5].setRotationPoint(-12F, -7.5F, 1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 53
		gunModel[6].setRotationPoint(-16F, -8.5F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 54
		gunModel[7].setRotationPoint(-16F, -7.5F, -2F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 55
		gunModel[8].setRotationPoint(-16F, -7.5F, 1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 18, 12, 2, 0F, 2F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, -1F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, 0F); // Box 56
		gunModel[9].setRotationPoint(-34F, -8.5F, -1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 18, 11, 1, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 1.5F, -1F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 1F, 0F); // Box 60
		gunModel[10].setRotationPoint(-34F, -7.5F, 1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 102
		gunModel[11].setRotationPoint(46F, -12.4F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 106
		gunModel[12].setRotationPoint(69F, -12.4F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gunModel[13].setRotationPoint(4.5F, -5F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 109
		gunModel[14].setRotationPoint(-2F, -5F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[15].setRotationPoint(-2F, -7F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[16].setRotationPoint(4.5F, -7F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[17].setRotationPoint(-0.5F, -3F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.15F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 113
		gunModel[18].setRotationPoint(0F, -6.5F, -0.5F);
		gunModel[18].rotateAngleZ = 0.26179939F;

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F); // Box 142
		gunModel[19].setRotationPoint(70F, -12.4F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F); // Box 143
		gunModel[20].setRotationPoint(-20F, -6.5F, -2.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0.15F, 0.15F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0.15F, 0.15F, -0.3F); // Box 145
		gunModel[21].setRotationPoint(-18.7F, -6.5F, -2.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 72
		gunModel[22].setRotationPoint(-13F, -6.5F, -2F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 73
		gunModel[23].setRotationPoint(-13F, -7.5F, -1F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		gunModel[24].setRotationPoint(-13F, -6.5F, 1F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 97
		gunModel[25].setRotationPoint(22F, -15.25F, -1F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F, 0F, -0.9F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F); // Box 204
		gunModel[26].setRotationPoint(46F, -11.6F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.24F, 0F, -0.2F, 0.24F, 0F, -0.2F, 0.24F, 0F, -0.2F, 0.24F, 0F, -0.2F, 0.24F, 0F, -0.2F, 0.24F, 0F, -0.2F, 0.24F, 0F, -0.2F, 0.24F, 0F); // Box 205
		gunModel[27].setRotationPoint(75F, -11.4F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F); // Box 182
		gunModel[28].setRotationPoint(-9F, -10F, -2F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 18, 11, 1, 0F, 1.5F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 3F, 0F); // Box 183
		gunModel[29].setRotationPoint(-34F, -7.5F, -2F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 185
		gunModel[30].setRotationPoint(-12F, -7.5F, -2F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 17, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		gunModel[31].setRotationPoint(-4F, -12F, -1F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F); // Box 187
		gunModel[32].setRotationPoint(13F, -12F, 1F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 17, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 188
		gunModel[33].setRotationPoint(-4F, -11F, 1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		gunModel[34].setRotationPoint(-2F, -12F, 1F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		gunModel[35].setRotationPoint(-4F, -12F, 1F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 17, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		gunModel[36].setRotationPoint(-4F, -11F, -2F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		gunModel[37].setRotationPoint(-2F, -12F, -2F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		gunModel[38].setRotationPoint(-4F, -12F, -2F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 194
		gunModel[39].setRotationPoint(13F, -11F, -2F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 195
		gunModel[40].setRotationPoint(20F, -12F, -2F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 196
		gunModel[41].setRotationPoint(24F, -12F, 1F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 197
		gunModel[42].setRotationPoint(26F, -12F, 1F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 198
		gunModel[43].setRotationPoint(28.5F, -10F, 1F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 199
		gunModel[44].setRotationPoint(28.5F, -12F, 1F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 204
		gunModel[45].setRotationPoint(24F, -12F, -2F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 205
		gunModel[46].setRotationPoint(26F, -12F, -2F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 14, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		gunModel[47].setRotationPoint(28F, -12F, -1F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 209
		gunModel[48].setRotationPoint(26F, -12F, -1F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 210
		gunModel[49].setRotationPoint(24F, -12F, -1F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 24, 1, 4, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		gunModel[50].setRotationPoint(20F, -13F, -2F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 212
		gunModel[51].setRotationPoint(45F, -15F, -1F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 213
		gunModel[52].setRotationPoint(31F, -13F, -2F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 214
		gunModel[53].setRotationPoint(35F, -13F, -2F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 215
		gunModel[54].setRotationPoint(39F, -13F, -2F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 216
		gunModel[55].setRotationPoint(43F, -13F, -2F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 217
		gunModel[56].setRotationPoint(42F, -12F, -1F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 218
		gunModel[57].setRotationPoint(42F, -12F, 1F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 219
		gunModel[58].setRotationPoint(42F, -12F, -2F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 14, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 220
		gunModel[59].setRotationPoint(28F, -11.5F, -1.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 221
		gunModel[60].setRotationPoint(28F, -12F, 1F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 222
		gunModel[61].setRotationPoint(41F, -12F, 1F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 223
		gunModel[62].setRotationPoint(28F, -12F, -2F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 224
		gunModel[63].setRotationPoint(41F, -12F, -2F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 225
		gunModel[64].setRotationPoint(28.5F, -12F, -2F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 226
		gunModel[65].setRotationPoint(28F, -10.5F, 1F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 227
		gunModel[66].setRotationPoint(41F, -10.5F, 1F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 228
		gunModel[67].setRotationPoint(46F, -14.4F, -0.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 229
		gunModel[68].setRotationPoint(57F, -14.4F, -0.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 230
		gunModel[69].setRotationPoint(57F, -13.9F, -0.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F); // Box 231
		gunModel[70].setRotationPoint(75F, -12.4F, -0.5F);

		gunModel[71].addShapeBox(6.5F, -3.4F, 0F, 1, 1, 1, 0F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F); // Box 232
		gunModel[71].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[71].rotateAngleZ = -3.10668607F;

		gunModel[72].addShapeBox(1.7F, -0.5F, 0F, 6, 1, 1, 0F, 0.9F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.9F, 0.3F, 0.3F, 0.9F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.9F, 0.3F, 0.3F); // Box 234
		gunModel[72].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[72].rotateAngleZ = -3.10668607F;

		gunModel[73].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 235
		gunModel[73].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[73].rotateAngleZ = -3.10668607F;

		gunModel[74].addShapeBox(7.7F, -0.5F, 0F, 2, 1, 1, 0F, 0F, 0.3F, 0.3F, -0.5F, 0.3F, -0.3F, -0.5F, 0.3F, -0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.5F, 0.3F, -0.3F, -0.5F, 0.3F, -0.3F, 0F, 0.3F, 0.3F); // Box 236
		gunModel[74].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[74].rotateAngleZ = -3.10668607F;

		gunModel[75].addShapeBox(8.7F, -1F, 0F, 16, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 237
		gunModel[75].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[75].rotateAngleZ = -3.10668607F;

		gunModel[76].addShapeBox(8.7F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 238
		gunModel[76].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[76].rotateAngleZ = -3.10668607F;

		gunModel[77].addShapeBox(8.7F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F); // Box 239
		gunModel[77].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[77].rotateAngleZ = -3.10668607F;

		gunModel[78].addShapeBox(8.7F, -1F, 0F, 16, 1, 1, 0F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 240
		gunModel[78].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[78].rotateAngleZ = -3.10668607F;

		gunModel[79].addShapeBox(30.2F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0.0F, -0.5F, 0F, 0.0F, -0.3F, 0F, -0.6F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.6F, -0.5F); // Box 241
		gunModel[79].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[79].rotateAngleZ = -3.10668607F;

		gunModel[80].addShapeBox(24.2F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 242
		gunModel[80].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[80].rotateAngleZ = -3.10668607F;

		gunModel[81].addShapeBox(24.2F, -1F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, -0.3F, -0.3F); // Box 243
		gunModel[81].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[81].rotateAngleZ = -3.10668607F;

		gunModel[82].addShapeBox(24.7F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.7F, -0.3F, -0.5F, -1F, -0.3F, -0.5F, -1F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.4F); // Box 244
		gunModel[82].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[82].rotateAngleZ = -3.10668607F;

		gunModel[83].addShapeBox(24.7F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.4F, 0F, -0.7F, -0.3F, -0.5F, -1F, -0.3F, -0.5F, -1F, -0.3F, 0F, -0.7F, -0.3F); // Box 245
		gunModel[83].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[83].rotateAngleZ = -3.10668607F;

		gunModel[84].addShapeBox(25.2F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.0F, -0.3F, 0F, 0.0F, -0.3F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0.0F, -0.5F); // Box 246
		gunModel[84].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[84].rotateAngleZ = -3.10668607F;

		gunModel[85].addShapeBox(25.2F, -1F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 247
		gunModel[85].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[85].rotateAngleZ = -3.10668607F;

		gunModel[86].addShapeBox(28.2F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.0F, -0.3F, 0F, 0.0F, -0.3F, 0F, -0.3F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, -0.5F); // Box 248
		gunModel[86].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[86].rotateAngleZ = -3.10668607F;

		gunModel[87].addShapeBox(30.2F, -1F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F); // Box 249
		gunModel[87].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[87].rotateAngleZ = -3.10668607F;

		gunModel[88].addShapeBox(28.2F, -1F, 0F, 2, 1, 1, 0F, 0F, -0.3F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 250
		gunModel[88].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[88].rotateAngleZ = -3.10668607F;

		gunModel[89].addShapeBox(-0.5F, -1.4F, 0F, 1, 1, 1, 0F, 0.2F, 0.7F, -0.1F, 0.2F, 0.7F, -0.1F, 0.2F, 0.7F, -0.1F, 0.2F, 0.7F, -0.1F, 0.2F, 0.3F, -0.1F, 0.2F, 0.3F, -0.1F, 0.2F, 0.3F, -0.1F, 0.2F, 0.3F, -0.1F); // Box 251
		gunModel[89].setRotationPoint(70.5F, -9F, -0.5F);

		gunModel[90].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 252
		gunModel[90].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[90].rotateAngleZ = -3.10668607F;

		gunModel[91].addShapeBox(6.5F, -0.5F, 0F, 1, 1, 1, 0F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F); // Box 253
		gunModel[91].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[91].rotateAngleZ = -3.10668607F;

		gunModel[92].addShapeBox(6.5F, -1.9F, 0F, 1, 1, 1, 0F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 254
		gunModel[92].setRotationPoint(70.5F, -9F, -0.5F);
		gunModel[92].rotateAngleZ = -3.10668607F;

		gunModel[93].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 256
		gunModel[93].setRotationPoint(22F, -13F, -0.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 257
		gunModel[94].setRotationPoint(30F, -15F, -1F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		gunModel[95].setRotationPoint(30F, -13F, -2F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F, 0F, 0.3F, 0.5F, -1F, 0.3F, 0.5F, -1F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 259
		gunModel[96].setRotationPoint(-4F, -13F, -1F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F); // Box 260
		gunModel[97].setRotationPoint(-4F, -15F, -1F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 261
		gunModel[98].setRotationPoint(-4F, -14.3F, -1F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0.3F, 1F, -1F, 0.3F, 1F, -1F, 0.3F, 0.5F, -1F, 0.3F, 0.5F); // Box 262
		gunModel[99].setRotationPoint(13F, -13.3F, 0F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 7, 8, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F); // Box 275
		gunModel[100].setRotationPoint(13F, -10.5F, -1F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0.5F, 0F); // Box 276
		gunModel[101].setRotationPoint(20F, -10.5F, -1F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		gunModel[102].setRotationPoint(28.5F, -10F, -2F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 278
		gunModel[103].setRotationPoint(28F, -10.5F, -2F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 279
		gunModel[104].setRotationPoint(41F, -10.5F, -2F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 280
		gunModel[105].setRotationPoint(20F, -13F, -2F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 281
		gunModel[106].setRotationPoint(-4F, -12F, -1F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 282
		gunModel[107].setRotationPoint(13F, -12F, -1F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F); // Box 283
		gunModel[108].setRotationPoint(46F, -15F, -1F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 284
		gunModel[109].setRotationPoint(46F, -13F, -2F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 285
		gunModel[110].setRotationPoint(46F, -10F, -2F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		gunModel[111].setRotationPoint(-4.2F, -13.5F, -0.5F);


		defaultScopeModel = new ModelRendererTurbo[22];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 91
		defaultScopeModel[1] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 92
		defaultScopeModel[2] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 94
		defaultScopeModel[3] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 95
		defaultScopeModel[4] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 96
		defaultScopeModel[5] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 98
		defaultScopeModel[6] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 99
		defaultScopeModel[7] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 100
		defaultScopeModel[8] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 101
		defaultScopeModel[9] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 105
		defaultScopeModel[10] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 106
		defaultScopeModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 147
		defaultScopeModel[12] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 148
		defaultScopeModel[13] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 150
		defaultScopeModel[14] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 151
		defaultScopeModel[15] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 152
		defaultScopeModel[16] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 153
		defaultScopeModel[17] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 150
		defaultScopeModel[18] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 266
		defaultScopeModel[19] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 267
		defaultScopeModel[20] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 268
		defaultScopeModel[21] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 269

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.1F, 0.2F, -0.35F, -0.1F, 0.2F, -0.35F, -0.1F, 0.2F, -0.35F, -0.1F, 0.2F, -0.35F, -0.1F, 0.8F, -0.35F, -0.1F, 0.8F, -0.35F, -0.1F, 0.8F, -0.35F, -0.1F, 0.8F, -0.35F); // Box 91
		defaultScopeModel[0].setRotationPoint(74.5F, -14.5F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 92
		defaultScopeModel[1].setRotationPoint(74.5F, -15.6F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F); // Box 94
		defaultScopeModel[2].setRotationPoint(74.5F, -16.1F, -1F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 95
		defaultScopeModel[3].setRotationPoint(74.5F, -17.5F, -0.5F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		defaultScopeModel[4].setRotationPoint(74.5F, -16.1F, 0F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F); // Box 98
		defaultScopeModel[5].setRotationPoint(24F, -15.05F, -1F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F); // Box 99
		defaultScopeModel[6].setRotationPoint(28F, -15.05F, -1F);

		defaultScopeModel[7].addShapeBox(-7F, -0.7F, 0F, 7, 1, 2, 0F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F); // Box 100
		defaultScopeModel[7].setRotationPoint(29.5F, -14.95F, -1F);
		defaultScopeModel[7].rotateAngleZ = -0.03490659F;

		defaultScopeModel[8].addShapeBox(-0.5F, -0.7F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F); // Box 101
		defaultScopeModel[8].setRotationPoint(29.5F, -14.95F, -1F);
		defaultScopeModel[8].rotateAngleZ = -0.06981317F;

		defaultScopeModel[9].addShapeBox(-7F, -0.9F, 0F, 7, 1, 2, 0F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F); // Box 105
		defaultScopeModel[9].setRotationPoint(29.5F, -14.95F, -1F);
		defaultScopeModel[9].rotateAngleZ = -0.03490659F;

		defaultScopeModel[10].addShapeBox(-7F, -0.8F, 0F, 7, 1, 2, 0F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F); // Box 106
		defaultScopeModel[10].setRotationPoint(29.5F, -14.95F, -1F);
		defaultScopeModel[10].rotateAngleZ = -0.03490659F;

		defaultScopeModel[11].addShapeBox(-3.5F, -0.95F, 0F, 1, 1, 2, 0F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F); // Box 147
		defaultScopeModel[11].setRotationPoint(29.5F, -14.95F, -1F);
		defaultScopeModel[11].rotateAngleZ = -0.03490659F;

		defaultScopeModel[12].addShapeBox(-1.5F, -0.95F, 0F, 1, 1, 2, 0F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F); // Box 148
		defaultScopeModel[12].setRotationPoint(29.5F, -14.95F, -1F);
		defaultScopeModel[12].rotateAngleZ = -0.03490659F;

		defaultScopeModel[13].addShapeBox(-2.5F, -0.95F, 0F, 1, 1, 2, 0F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F); // Box 150
		defaultScopeModel[13].setRotationPoint(29.5F, -14.95F, -1F);
		defaultScopeModel[13].rotateAngleZ = -0.03490659F;

		defaultScopeModel[14].addShapeBox(-4.5F, -0.95F, 0F, 1, 1, 2, 0F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F); // Box 151
		defaultScopeModel[14].setRotationPoint(29.5F, -14.95F, -1F);
		defaultScopeModel[14].rotateAngleZ = -0.03490659F;

		defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F); // Box 152
		defaultScopeModel[15].setRotationPoint(28F, -15.05F, -1F);

		defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F); // Box 153
		defaultScopeModel[16].setRotationPoint(24F, -15.05F, -1F);

		defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F); // Box 150
		defaultScopeModel[17].setRotationPoint(74.5F, -15.5F, -0.5F);

		defaultScopeModel[18].addShapeBox(-6.5F, -0.8F, 0F, 1, 1, 1, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 266
		defaultScopeModel[18].setRotationPoint(29.5F, -14.95F, -1F);
		defaultScopeModel[18].rotateAngleZ = -0.03490659F;

		defaultScopeModel[19].addShapeBox(-6.5F, -0.8F, 0F, 1, 1, 1, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F); // Box 267
		defaultScopeModel[19].setRotationPoint(29.5F, -14.95F, -1F);
		defaultScopeModel[19].rotateAngleZ = -0.03490659F;

		defaultScopeModel[20].addShapeBox(-6.5F, -0.8F, 0F, 1, 1, 1, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 268
		defaultScopeModel[20].setRotationPoint(29.5F, -14.95F, 0F);
		defaultScopeModel[20].rotateAngleZ = -0.03490659F;

		defaultScopeModel[21].addShapeBox(-6.5F, -0.8F, 0F, 1, 1, 1, 0F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F); // Box 269
		defaultScopeModel[21].setRotationPoint(29.5F, -14.95F, 0F);
		defaultScopeModel[21].rotateAngleZ = -0.03490659F;


		ammoModel = new ModelRendererTurbo[20];
		ammoModel[0] = new ModelRendererTurbo(this, 50, 99, textureX, textureY); // Box 120
		ammoModel[1] = new ModelRendererTurbo(this, 32, 91, textureX, textureY); // Box 121
		ammoModel[2] = new ModelRendererTurbo(this, 50, 91, textureX, textureY); // Box 122
		ammoModel[3] = new ModelRendererTurbo(this, 40, 91, textureX, textureY); // Box 123
		ammoModel[4] = new ModelRendererTurbo(this, 40, 91, textureX, textureY); // Box 124
		ammoModel[5] = new ModelRendererTurbo(this, 50, 91, textureX, textureY); // Box 125
		ammoModel[6] = new ModelRendererTurbo(this, 50, 99, textureX, textureY); // Box 126
		ammoModel[7] = new ModelRendererTurbo(this, 32, 91, textureX, textureY); // Box 127
		ammoModel[8] = new ModelRendererTurbo(this, 40, 91, textureX, textureY); // Box 128
		ammoModel[9] = new ModelRendererTurbo(this, 50, 91, textureX, textureY); // Box 129
		ammoModel[10] = new ModelRendererTurbo(this, 50, 99, textureX, textureY); // Box 130
		ammoModel[11] = new ModelRendererTurbo(this, 32, 91, textureX, textureY); // Box 131
		ammoModel[12] = new ModelRendererTurbo(this, 40, 91, textureX, textureY); // Box 132
		ammoModel[13] = new ModelRendererTurbo(this, 50, 91, textureX, textureY); // Box 133
		ammoModel[14] = new ModelRendererTurbo(this, 50, 99, textureX, textureY); // Box 134
		ammoModel[15] = new ModelRendererTurbo(this, 32, 91, textureX, textureY); // Box 135
		ammoModel[16] = new ModelRendererTurbo(this, 40, 91, textureX, textureY); // Box 136
		ammoModel[17] = new ModelRendererTurbo(this, 50, 91, textureX, textureY); // Box 137
		ammoModel[18] = new ModelRendererTurbo(this, 50, 99, textureX, textureY); // Box 138
		ammoModel[19] = new ModelRendererTurbo(this, 32, 91, textureX, textureY); // Box 139

		ammoModel[0].addShapeBox(-15F, -8.05F, -0.5F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 120
		ammoModel[0].setRotationPoint(30F, -5F, 0F);

		ammoModel[1].addShapeBox(-12F, -8.05F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 121
		ammoModel[1].setRotationPoint(30F, -5F, 0F);

		ammoModel[2].addShapeBox(-15.6F, -8.05F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 122
		ammoModel[2].setRotationPoint(30F, -5F, 0F);

		ammoModel[3].addShapeBox(-16.3F, -8.05F, -0.5F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 123
		ammoModel[3].setRotationPoint(30F, -5F, 0F);

		ammoModel[4].addShapeBox(-16.3F, -7.05F, -0.5F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 124
		ammoModel[4].setRotationPoint(30F, -5F, 0F);

		ammoModel[5].addShapeBox(-15.6F, -7.05F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 125
		ammoModel[5].setRotationPoint(30F, -5F, 0F);

		ammoModel[6].addShapeBox(-15F, -7.05F, -0.5F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 126
		ammoModel[6].setRotationPoint(30F, -5F, 0F);

		ammoModel[7].addShapeBox(-12F, -7.05F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 127
		ammoModel[7].setRotationPoint(30F, -5F, 0F);

		ammoModel[8].addShapeBox(-16.3F, -6.05F, -0.5F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 128
		ammoModel[8].setRotationPoint(30F, -5F, 0F);

		ammoModel[9].addShapeBox(-15.6F, -6.05F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 129
		ammoModel[9].setRotationPoint(30F, -5F, 0F);

		ammoModel[10].addShapeBox(-15F, -6.05F, -0.5F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 130
		ammoModel[10].setRotationPoint(30F, -5F, 0F);

		ammoModel[11].addShapeBox(-12F, -6.05F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 131
		ammoModel[11].setRotationPoint(30F, -5F, 0F);

		ammoModel[12].addShapeBox(-16.3F, -5.05F, -0.5F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 132
		ammoModel[12].setRotationPoint(30F, -5F, 0F);

		ammoModel[13].addShapeBox(-15.6F, -5.05F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 133
		ammoModel[13].setRotationPoint(30F, -5F, 0F);

		ammoModel[14].addShapeBox(-15F, -5.05F, -0.5F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 134
		ammoModel[14].setRotationPoint(30F, -5F, 0F);

		ammoModel[15].addShapeBox(-12F, -5.05F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 135
		ammoModel[15].setRotationPoint(30F, -5F, 0F);

		ammoModel[16].addShapeBox(-16.3F, -4.05F, -0.5F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 136
		ammoModel[16].setRotationPoint(30F, -5F, 0F);

		ammoModel[17].addShapeBox(-15.6F, -4.05F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 137
		ammoModel[17].setRotationPoint(30F, -5F, 0F);

		ammoModel[18].addShapeBox(-15F, -4.05F, -0.5F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 138
		ammoModel[18].setRotationPoint(30F, -5F, 0F);

		ammoModel[19].addShapeBox(-12F, -4.05F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 139
		ammoModel[19].setRotationPoint(30F, -5F, 0F);


		slideModel = new ModelRendererTurbo[4];
		slideModel[0] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 270
		slideModel[1] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 271
		slideModel[2] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 273
		slideModel[3] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 274

		slideModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 2, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 270
		slideModel[0].setRotationPoint(8F, -14.25F, -1F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 271
		slideModel[1].setRotationPoint(8F, -14.65F, -1F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		slideModel[2].setRotationPoint(20F, -14.25F, -3F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 274
		slideModel[3].setRotationPoint(20F, -14.25F, -3.5F);

		this.modelScale = 0.28F;

		translateAll = new Vector3f(0F, -7F, -0.15F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.SNIPER;
	    
		hasFlash = false;
	    
        leftArmPos = new Vector3f(0.450F, -0.6F, 0.02F);
        leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.1F, -0.7F, 0.02F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);
	    
	    rightArmPos = new Vector3f(0.28F, -0.6F, 0.0F);
	    rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    rightArmReloadPos = new Vector3f(0.28F, -0.55F, 0.0F);
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