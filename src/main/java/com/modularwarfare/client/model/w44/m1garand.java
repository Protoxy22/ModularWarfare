//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M1Garand
// Model Creator: 
// Created on: 24.05.2017 - 14:16:18
// Last changed on: 24.05.2017 - 14:16:18

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class m1garand extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 256;

	public m1garand() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[101];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 8
		gunModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 12
		gunModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 15
		gunModel[6] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 16
		gunModel[7] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 42
		gunModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 80
		gunModel[9] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 81
		gunModel[10] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 86
		gunModel[11] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 95
		gunModel[12] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 96
		gunModel[13] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 97
		gunModel[14] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 102
		gunModel[15] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 106
		gunModel[16] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 108
		gunModel[17] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 109
		gunModel[18] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 110
		gunModel[19] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 111
		gunModel[20] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 112
		gunModel[21] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 113
		gunModel[22] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 157
		gunModel[23] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 161
		gunModel[24] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 162
		gunModel[25] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 163
		gunModel[26] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 165
		gunModel[27] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 166
		gunModel[28] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 167
		gunModel[29] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 168
		gunModel[30] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 171
		gunModel[31] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 184
		gunModel[32] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 187
		gunModel[33] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 188
		gunModel[34] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 189
		gunModel[35] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 151
		gunModel[36] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 152
		gunModel[37] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 174
		gunModel[38] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 40
		gunModel[39] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 44
		gunModel[40] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 46
		gunModel[41] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 48
		gunModel[42] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 50
		gunModel[43] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 51
		gunModel[44] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 53
		gunModel[45] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 55
		gunModel[46] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 56
		gunModel[47] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 60
		gunModel[48] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 61
		gunModel[49] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 144
		gunModel[50] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 151
		gunModel[51] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 152
		gunModel[52] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 153
		gunModel[53] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 154
		gunModel[54] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 158
		gunModel[55] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 160
		gunModel[56] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 205
		gunModel[57] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 206
		gunModel[58] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 207
		gunModel[59] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 210
		gunModel[60] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 211
		gunModel[61] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 213
		gunModel[62] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 91
		gunModel[63] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 92
		gunModel[64] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 93
		gunModel[65] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 94
		gunModel[66] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 95
		gunModel[67] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 96
		gunModel[68] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 118
		gunModel[69] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 119
		gunModel[70] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 120
		gunModel[71] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 121
		gunModel[72] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 227
		gunModel[73] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 228
		gunModel[74] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 229
		gunModel[75] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 230
		gunModel[76] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 231
		gunModel[77] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 232
		gunModel[78] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // Box 233
		gunModel[79] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 234
		gunModel[80] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 235
		gunModel[81] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 236
		gunModel[82] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 237
		gunModel[83] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 238
		gunModel[84] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 239
		gunModel[85] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 240
		gunModel[86] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 241
		gunModel[87] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 242
		gunModel[88] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 243
		gunModel[89] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 244
		gunModel[90] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 245
		gunModel[91] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 246
		gunModel[92] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 247
		gunModel[93] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 248
		gunModel[94] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 249
		gunModel[95] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 252
		gunModel[96] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 253
		gunModel[97] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 254
		gunModel[98] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 255
		gunModel[99] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 256
		gunModel[100] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 257

		gunModel[0].addShapeBox(0F, 0F, 0F, 37, 3, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 1
		gunModel[0].setRotationPoint(20F, -9.5F, 1.25F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 37, 5, 1, 0F, 0F, -0.25F, 1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.25F, 1.25F, 0F, 0F, 1.25F, 0F, -2F, 0.75F, 0F, -2F, 0.75F, 0F, 0F, 1.25F); // Box 2
		gunModel[1].setRotationPoint(20F, -11.5F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[2].setRotationPoint(19F, -13.5F, 1.25F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F, 0F, 1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 8
		gunModel[3].setRotationPoint(19F, -13.5F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 12
		gunModel[4].setRotationPoint(6F, -11.5F, 1.25F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.75F); // Box 15
		gunModel[5].setRotationPoint(-1F, -11.5F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F); // Box 16
		gunModel[6].setRotationPoint(6F, -6.5F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 42
		gunModel[7].setRotationPoint(-1F, -11.5F, 1.25F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 80
		gunModel[8].setRotationPoint(14F, -13.5F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		gunModel[9].setRotationPoint(15F, -13.5F, -1.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F); // Box 86
		gunModel[10].setRotationPoint(-1F, -12.5F, -1.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		gunModel[11].setRotationPoint(62F, -12.5F, -1F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		gunModel[12].setRotationPoint(62F, -13.5F, -1F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 97
		gunModel[13].setRotationPoint(62F, -9.5F, -1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 102
		gunModel[14].setRotationPoint(63F, -12F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F); // Box 106
		gunModel[15].setRotationPoint(73.75F, -12F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 108
		gunModel[16].setRotationPoint(9F, -4.3F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 109
		gunModel[17].setRotationPoint(1F, -4.3F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[18].setRotationPoint(1F, -6.3F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[19].setRotationPoint(9F, -6.3F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[20].setRotationPoint(2.5F, -2.3F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.15F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 113
		gunModel[21].setRotationPoint(3.5F, -5.8F, -0.5F);
		gunModel[21].rotateAngleZ = 0.26179939F;

		gunModel[22].addShapeBox(0F, 0F, 0F, 34, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		gunModel[22].setRotationPoint(14F, -11.5F, 1.25F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		gunModel[23].setRotationPoint(49F, -11.5F, 1.25F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		gunModel[24].setRotationPoint(49F, -13.5F, 1.25F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 163
		gunModel[25].setRotationPoint(49F, -13.5F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F); // Box 165
		gunModel[26].setRotationPoint(48F, -9F, 1.25F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0.5F, 0.45F, 0F, 0.5F, 0.45F, 0F, 0.5F, 0.45F, 0F, 0.5F, 0.45F); // Box 166
		gunModel[27].setRotationPoint(48F, -11.5F, -2F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 167
		gunModel[28].setRotationPoint(48F, -13.5F, 1.25F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0.2F, 0.75F, 0F, 0.2F, 0.75F, 0F, 0.2F, 0.75F, 0F, 0.2F, 0.75F); // Box 168
		gunModel[29].setRotationPoint(48F, -9F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.2F, 0.75F, 0F, 0.2F, 0.75F, 0F, 0.2F, 0.75F, 0F, 0.2F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 171
		gunModel[30].setRotationPoint(48F, -13.5F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		gunModel[31].setRotationPoint(57F, -11.5F, 1.25F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		gunModel[32].setRotationPoint(57F, -13.5F, 1.25F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 188
		gunModel[33].setRotationPoint(57F, -13.5F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 189
		gunModel[34].setRotationPoint(57F, -11.5F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F); // Box 151
		gunModel[35].setRotationPoint(62F, -10.5F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.35F, 0.1F, 0F, 0.35F, 0.1F, 0F, 0.35F, 0.1F, 0F, 0.35F, 0.1F, 0F, 0.35F, 0.1F, 0F, 0.35F, 0.1F, 0F, 0.35F, 0.1F, 0F, 0.35F, 0.1F); // Box 152
		gunModel[36].setRotationPoint(74.75F, -10.75F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 174
		gunModel[37].setRotationPoint(14F, -9.5F, 1.25F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, 1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 1F, 0.75F); // Box 40
		gunModel[38].setRotationPoint(-5F, -11.5F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0.75F); // Box 44
		gunModel[39].setRotationPoint(-7F, -9.5F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 46
		gunModel[40].setRotationPoint(-7F, -8.5F, 1.25F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, 0F, 0.75F, 0F, 2F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, 0.75F, 0F, 2F, 0.75F); // Box 48
		gunModel[41].setRotationPoint(-9F, -8.5F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 50
		gunModel[42].setRotationPoint(-9F, -7.5F, 1.25F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 51
		gunModel[43].setRotationPoint(-5F, -11.5F, 1.25F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, 2F, 0.75F, 0F, 2F, 0.75F, 0F, 1F, 0.75F); // Box 53
		gunModel[44].setRotationPoint(-16F, -6.5F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[45].setRotationPoint(-16F, -5.5F, 1.25F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 21, 12, 1, 0F, 0F, -1F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, -1F, 0.75F, 0F, 3F, 0.75F, 0F, -5F, 0.75F, 0F, -5F, 0.75F, 0F, 3F, 0.75F); // Box 56
		gunModel[46].setRotationPoint(-37F, -6.5F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 21, 11, 1, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 1F, 0F); // Box 60
		gunModel[47].setRotationPoint(-37F, -5.5F, 1.25F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F, -2F, 0.1F, 0.85F, 0F, 0.1F, 0.85F, 0F, 0.1F, 0.85F, -2F, 0.1F, 0.85F, -2F, 0.1F, 0.85F, 0F, 0.1F, 0.85F, 0F, 0.1F, 0.85F, -2F, 0.1F, 0.85F); // Box 61
		gunModel[48].setRotationPoint(-43F, -5.5F, -0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F, -2F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -1F, 0.1F, -2F, -1F, 0.1F, -2F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -2F, 0F, -2F, -2F, 0F); // Box 144
		gunModel[49].setRotationPoint(-43F, -5.5F, 1.25F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, 0F, 0.75F, 0F, 2F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, 0.75F, 0F, 2F, 0.75F); // Box 151
		gunModel[50].setRotationPoint(-10F, -7.5F, -0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 152
		gunModel[51].setRotationPoint(-10F, -6.5F, 1.25F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 153
		gunModel[52].setRotationPoint(-12F, -5.5F, 1.25F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, 0F, 0.75F, 0F, 1.5F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, 1.5F, 0.75F); // Box 154
		gunModel[53].setRotationPoint(-12F, -6.5F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 1.5F, 0.75F, 0F, 1.5F, 0.75F, 0F, 0F, 0.75F); // Box 158
		gunModel[54].setRotationPoint(-15F, -6.5F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 160
		gunModel[55].setRotationPoint(-15F, -5.5F, 1.25F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -1F, 1.25F, 0F, -1F, 1.25F, 0F, 0F, 1.25F); // Box 205
		gunModel[56].setRotationPoint(14F, -6.5F, -0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 206
		gunModel[57].setRotationPoint(16F, -13.5F, 0.75F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 207
		gunModel[58].setRotationPoint(16F, -13.5F, -0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F); // Box 210
		gunModel[59].setRotationPoint(-1F, -12.5F, 0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -0.25F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 211
		gunModel[60].setRotationPoint(-1F, -13.5F, -1F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.1F, 0F, 0F, -0.8F, 0F, 0F, -0.65F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 213
		gunModel[61].setRotationPoint(6F, -12.5F, 1.4F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 91
		gunModel[62].setRotationPoint(74F, -15.3F, -0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 1F, -0.3F, 0.2F, 1F, -0.3F, 0.2F, 1F, -0.3F); // Box 92
		gunModel[63].setRotationPoint(74F, -14.3F, -0.5F);

		gunModel[64].addShapeBox(0F, 1.25F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 93
		gunModel[64].setRotationPoint(74F, -16.05F, 0.3F);
		gunModel[64].rotateAngleX = -0.08726646F;

		gunModel[65].addShapeBox(0F, 0.25F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 94
		gunModel[65].setRotationPoint(74F, -16.05F, 0.3F);
		gunModel[65].rotateAngleX = -0.08726646F;

		gunModel[66].addShapeBox(0F, 0.25F, -1F, 2, 1, 1, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 95
		gunModel[66].setRotationPoint(74F, -16.05F, -0.3F);
		gunModel[66].rotateAngleX = 0.08726646F;

		gunModel[67].addShapeBox(0F, 1.25F, -1F, 2, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 96
		gunModel[67].setRotationPoint(74F, -16.05F, -0.3F);
		gunModel[67].rotateAngleX = 0.08726646F;

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0.35F, -1.1F, 0F, 0.35F, -1.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0.35F, -1.1F, 0F, 0.35F, -1.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 118
		gunModel[68].setRotationPoint(1.5F, -15.5F, -0.55F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0.35F, -1.1F, 0F, 0.35F, -1.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0.35F, -1.1F, 0F, 0.35F, -1.1F); // Box 119
		gunModel[69].setRotationPoint(1.5F, -15.5F, -1.45F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F); // Box 120
		gunModel[70].setRotationPoint(1.5F, -15.85F, -1F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F); // Box 121
		gunModel[71].setRotationPoint(1.5F, -14.6F, -1F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 227
		gunModel[72].setRotationPoint(1F, -14.25F, -1F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 228
		gunModel[73].setRotationPoint(1F, -15.25F, 0.75F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F); // Box 229
		gunModel[74].setRotationPoint(1F, -13.25F, 0.75F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 230
		gunModel[75].setRotationPoint(1F, -15.25F, -1.75F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F); // Box 231
		gunModel[76].setRotationPoint(1F, -13.25F, -1.75F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 232
		gunModel[77].setRotationPoint(1F, -15.25F, 1.25F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 233
		gunModel[78].setRotationPoint(1F, -15.25F, -2.25F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 37, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F); // Box 234
		gunModel[79].setRotationPoint(20F, -9.5F, -2.25F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 235
		gunModel[80].setRotationPoint(6F, -11.5F, -2.25F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 236
		gunModel[81].setRotationPoint(-1F, -11.5F, -2.25F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 34, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		gunModel[82].setRotationPoint(14F, -11.5F, -2.25F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		gunModel[83].setRotationPoint(49F, -11.5F, -2.25F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		gunModel[84].setRotationPoint(49F, -13.5F, -2.25F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 240
		gunModel[85].setRotationPoint(57F, -11.5F, -2.25F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		gunModel[86].setRotationPoint(57F, -13.5F, -2.25F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F); // Box 242
		gunModel[87].setRotationPoint(14F, -9.5F, -2.25F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 243
		gunModel[88].setRotationPoint(-7F, -8.5F, -2.25F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 244
		gunModel[89].setRotationPoint(-9F, -7.5F, -2.25F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 245
		gunModel[90].setRotationPoint(-5F, -11.5F, -2.25F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 246
		gunModel[91].setRotationPoint(-16F, -5.5F, -2.25F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 21, 11, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 247
		gunModel[92].setRotationPoint(-37F, -5.5F, -2.25F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F, -2F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, 0.1F, -0.1F, -2F, 0.1F, -0.1F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0.1F, -0.1F, -2F, 0.1F, -0.1F); // Box 248
		gunModel[93].setRotationPoint(-43F, -5.5F, -2.25F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 249
		gunModel[94].setRotationPoint(-10F, -6.5F, -2.25F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		gunModel[95].setRotationPoint(19F, -13.5F, -2.25F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 253
		gunModel[96].setRotationPoint(48F, -9F, -2.25F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		gunModel[97].setRotationPoint(48F, -13.5F, -2.25F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 255
		gunModel[98].setRotationPoint(16F, -13.5F, -1.75F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F); // Box 256
		gunModel[99].setRotationPoint(-12F, -5.5F, -2.25F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 257
		gunModel[100].setRotationPoint(-15F, -5.5F, -2.25F);


		ammoModel = new ModelRendererTurbo[29];
		ammoModel[0] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 120
		ammoModel[1] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 121
		ammoModel[2] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 122
		ammoModel[3] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 125
		ammoModel[4] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 126
		ammoModel[5] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 127
		ammoModel[6] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 129
		ammoModel[7] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 130
		ammoModel[8] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 131
		ammoModel[9] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 134
		ammoModel[10] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 135
		ammoModel[11] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 138
		ammoModel[12] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 139
		ammoModel[13] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 153
		ammoModel[14] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 154
		ammoModel[15] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 155
		ammoModel[16] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 158
		ammoModel[17] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 159
		ammoModel[18] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 160
		ammoModel[19] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 161
		ammoModel[20] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 163
		ammoModel[21] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 165
		ammoModel[22] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 166
		ammoModel[23] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 167
		ammoModel[24] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 168
		ammoModel[25] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 169
		ammoModel[26] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 170
		ammoModel[27] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 171
		ammoModel[28] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 172

		ammoModel[0].addShapeBox(-15F, 4.7F, -1F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 120
		ammoModel[0].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[1].addShapeBox(-12F, 4.7F, -1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 121
		ammoModel[1].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[2].addShapeBox(-15.6F, 4.7F, -1F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 122
		ammoModel[2].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[3].addShapeBox(-15.6F, 5.7F, -1F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 125
		ammoModel[3].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[4].addShapeBox(-15F, 5.7F, -1F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 126
		ammoModel[4].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[5].addShapeBox(-12F, 5.7F, -1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 127
		ammoModel[5].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[6].addShapeBox(-15.6F, 6.7F, -1F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 129
		ammoModel[6].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[7].addShapeBox(-15F, 4.2F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 130
		ammoModel[7].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[8].addShapeBox(-12F, 4.2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 131
		ammoModel[8].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[9].addShapeBox(-15F, 5.2F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 134
		ammoModel[9].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[10].addShapeBox(-12F, 5.2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 135
		ammoModel[10].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[11].addShapeBox(-15F, 6.2F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 138
		ammoModel[11].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[12].addShapeBox(-12F, 6.2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 139
		ammoModel[12].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[13].addShapeBox(-15F, 6.7F, -1F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 153
		ammoModel[13].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[14].addShapeBox(-12F, 6.7F, -1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 154
		ammoModel[14].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[15].addShapeBox(-16.3F, 2.9F, -1F, 1, 5, 2, 0F, -0.8F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, 0F); // Box 155
		ammoModel[15].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[16].addShapeBox(-15.6F, 4.2F, 0F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 158
		ammoModel[16].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[17].addShapeBox(-15.6F, 6.2F, 0F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 159
		ammoModel[17].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[18].addShapeBox(-15.6F, 5.2F, 0F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 160
		ammoModel[18].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[19].addShapeBox(-15.6F, 3.7F, -1F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 161
		ammoModel[19].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[20].addShapeBox(-15.6F, 3.2F, 0F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 163
		ammoModel[20].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[21].addShapeBox(-15F, 3.2F, 0F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 165
		ammoModel[21].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[22].addShapeBox(-15F, 3.7F, -1F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 166
		ammoModel[22].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[23].addShapeBox(-12F, 3.7F, -1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 167
		ammoModel[23].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[24].addShapeBox(-12F, 3.2F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 168
		ammoModel[24].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[25].addShapeBox(-16.1F, 2.9F, -1F, 3, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.8F, -0.8F, 0F); // Box 169
		ammoModel[25].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[26].addShapeBox(-16.1F, 7.7F, -1F, 3, 1, 2, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.8F, -0.8F, 0F); // Box 170
		ammoModel[26].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[27].addShapeBox(-16.1F, 2.9F, -2F, 3, 6, 1, 0F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -1F, 0F, -0.8F, -1F, 0F); // Box 171
		ammoModel[27].setRotationPoint(23F, -14.5F, 0F);

		ammoModel[28].addShapeBox(-16.1F, 2.9F, 0.2F, 3, 6, 1, 0F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -1F, 0F, -0.8F, -1F, 0F); // Box 172
		ammoModel[28].setRotationPoint(23F, -14.5F, 0F);


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 212
		slideModel[1] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 120
		slideModel[2] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 121

		slideModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 212
		slideModel[0].setRotationPoint(6F, -12.5F, -1.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F); // Box 120
		slideModel[1].setRotationPoint(11F, -12.5F, -3F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 121
		slideModel[2].setRotationPoint(11F, -12.5F, -3.5F);

		this.modelScale = 0.25F;

		translateAll = new Vector3f(0F, -10.5F, -0.15F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.TOP_RIFLE;
	    
		hasFlash = false;
	    
        leftArmPos = new Vector3f(0.40F, -0.625F, 0.02F);
        leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.1F, -0.7F, 0.02F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);
	    
	    rightArmPos = new Vector3f(0.28F, -0.55F, 0.0F);
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