//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.12.2017 - 18:16:33
// Last changed on: 07.12.2017 - 18:16:33

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class leeenfield4 extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public leeenfield4() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[77];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 3
		gunModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 10
		gunModel[8] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 11
		gunModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 12
		gunModel[10] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 13
		gunModel[11] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 14
		gunModel[12] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 15
		gunModel[13] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 16
		gunModel[14] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 17
		gunModel[15] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 19
		gunModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20
		gunModel[17] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 21
		gunModel[18] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 22
		gunModel[19] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 23
		gunModel[20] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 24
		gunModel[21] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 29
		gunModel[22] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 30
		gunModel[23] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 63
		gunModel[24] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 64
		gunModel[25] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 65
		gunModel[26] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 75
		gunModel[27] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 92
		gunModel[28] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 94
		gunModel[29] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 95
		gunModel[30] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 96
		gunModel[31] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 98
		gunModel[32] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 99
		gunModel[33] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 100
		gunModel[34] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 101
		gunModel[35] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 102
		gunModel[36] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 103
		gunModel[37] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 104
		gunModel[38] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 105
		gunModel[39] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 106
		gunModel[40] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 107
		gunModel[41] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 108
		gunModel[42] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 109
		gunModel[43] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 110
		gunModel[44] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 112
		gunModel[45] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 113
		gunModel[46] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 114
		gunModel[47] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 115
		gunModel[48] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 116
		gunModel[49] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 119
		gunModel[50] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 125
		gunModel[51] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 127
		gunModel[52] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 128
		gunModel[53] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 129
		gunModel[54] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 130
		gunModel[55] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 131
		gunModel[56] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 132
		gunModel[57] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 133
		gunModel[58] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 134
		gunModel[59] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 135
		gunModel[60] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 136
		gunModel[61] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 137
		gunModel[62] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 138
		gunModel[63] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 139
		gunModel[64] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 231
		gunModel[65] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 233
		gunModel[66] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 234
		gunModel[67] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 198
		gunModel[68] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 199
		gunModel[69] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 200
		gunModel[70] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 206
		gunModel[71] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 207
		gunModel[72] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 208
		gunModel[73] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 209
		gunModel[74] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 210
		gunModel[75] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 212
		gunModel[76] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 216

		gunModel[0].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0F, 0.8F, 0.1F); // Box 0
		gunModel[0].setRotationPoint(6.4F, -2.75F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F); // Box 0
		gunModel[1].setRotationPoint(5.4F, -2.75F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.8F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.8F, -0.5F, 0.1F, 0.8F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0.8F, -0.1F, 0.1F); // Box 1
		gunModel[2].setRotationPoint(4.4F, -2.75F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.4F, 0.1F); // Box 2
		gunModel[3].setRotationPoint(2.6F, -2.4F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1.1F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 1.1F, -0.2F, 0.1F, 0.7F, -0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0.7F, -0.1F, 0.1F); // Box 3
		gunModel[4].setRotationPoint(1.6F, -2.6F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 6
		gunModel[5].setRotationPoint(17.8F, -3.75F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F); // Box 8
		gunModel[6].setRotationPoint(17.8F, -3.8F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -0.2F, -0.5F, -0.1F, 0.95F, -0.5F, -0.1F, 0.95F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, 0F, 0.1F, 0.95F, 0F, 0.1F, 0.95F, 0F, 0.1F, -0.2F, 0F, 0.1F); // Box 10
		gunModel[7].setRotationPoint(6.45F, -3.75F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -0.2F, -0.4F, -0.3F, 0.95F, -0.4F, -0.3F, 0.95F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.45F, -0.1F, 0.95F, -0.45F, -0.1F, 0.95F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F); // Box 11
		gunModel[8].setRotationPoint(6.45F, -3.8F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, -0.5F, 0.05F, -1.1F, -0.2F, 0.05F, -1.1F, -0.2F, 0.05F, 1F, -0.5F, 0.05F, 0.6F, -0.05F, 0.05F, -0.7F, -0.1F, 0.05F, -0.7F, -0.1F, 0.05F, 0.6F, -0.05F, 0.05F); // Box 12
		gunModel[9].setRotationPoint(0.6F, -2.6F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 1F, -1.3F, -0.25F, -1.1F, -0.4F, 0.1F, -1.1F, -0.4F, 0.1F, 1F, -1.3F, -0.25F, 0.6F, 0.93F, 0.1F, -0.7F, -0.1F, 0.1F, -0.7F, -0.1F, 0.1F, 0.6F, 0.93F, 0.1F); // Box 13
		gunModel[10].setRotationPoint(-2.3F, -2.53F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 1F, -1.35F, -0.25F, -1.1F, -1.25F, -0.25F, -1.1F, -1.25F, -0.25F, 1F, -1.35F, -0.25F, 1F, 0.95F, 0.1F, -0.7F, 0.9F, 0.1F, -0.7F, 0.9F, 0.1F, 1F, 0.9F, 0.1F); // Box 14
		gunModel[11].setRotationPoint(-5.2F, -2.5F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 1.25F, -1.8F, -0.25F, -1.4F, -1.35F, -0.25F, -1.4F, -1.35F, -0.25F, 1.25F, -1.8F, -0.25F, 1F, 0.95F, 0.1F, -1.4F, 0.9F, 0.1F, -1.4F, 0.9F, 0.1F, 1F, 0.9F, 0.1F); // Box 15
		gunModel[12].setRotationPoint(-10.8F, -2.5F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 1F, -1.7F, 0.1F, -1.4F, -1.7F, 0.1F, -1.4F, -1.7F, 0.1F, 1F, -1.7F, 0.1F, 0.7F, 3F, 0.1F, -1.4F, 0.9F, 0.1F, -1.4F, 0.9F, 0.1F, 0.7F, 3F, 0.1F); // Box 16
		gunModel[13].setRotationPoint(-10.8F, -1.3F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0.4F, -1.7F, 0.1F, -1.1F, -1.7F, 0.1F, -1.1F, -1.7F, 0.1F, 0.4F, -1.7F, 0.1F, 0.4F, 0.9F, 0.1F, -1.4F, 0.3F, 0.1F, -1.4F, 0.3F, 0.1F, 0.4F, 0.9F, 0.1F); // Box 17
		gunModel[14].setRotationPoint(-5.8F, -1.3F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F); // Box 19
		gunModel[15].setRotationPoint(17.1F, -3.8F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 20
		gunModel[16].setRotationPoint(17.1F, -3.75F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.15F); // Box 21
		gunModel[17].setRotationPoint(17.1F, -2.75F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 22
		gunModel[18].setRotationPoint(17.8F, -3.25F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F); // Box 23
		gunModel[19].setRotationPoint(17.1F, -3.25F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 24
		gunModel[20].setRotationPoint(6.4F, -3.25F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 1.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.1F, -0.5F, 0F, 1.1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 1.1F, -0.1F, 0F); // Box 29
		gunModel[21].setRotationPoint(3.45F, -2.2F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1.1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1.1F, -0.4F, 0F, 1.1F, 0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, 1.1F, 0.45F, 0F); // Box 30
		gunModel[22].setRotationPoint(3.45F, -0.7F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0.15F); // Box 63
		gunModel[23].setRotationPoint(26.8F, -3.8F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, 0.15F, -0.5F, -0.5F, 0.15F, -0.5F, -0.5F, 0.15F, -0.5F, -0.5F, 0.15F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0.15F); // Box 64
		gunModel[24].setRotationPoint(26.8F, -3.3F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, 0.15F, -0.5F, -0.5F, 0.15F, -0.5F, -0.5F, 0.15F, -0.5F, -0.5F, 0.15F, -0.5F, -0.05F, -0.1F, -0.5F, -0.05F, -0.1F, -0.5F, -0.05F, -0.1F, -0.5F, -0.05F, -0.1F); // Box 65
		gunModel[25].setRotationPoint(26.8F, -2.8F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0.2F, -0.15F, 0F, -0.05F, -0.15F, 0F, -0.05F, -0.15F, 0F, 0.2F, -0.15F); // Box 75
		gunModel[26].setRotationPoint(17.8F, -2.75F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F); // Box 92
		gunModel[27].setRotationPoint(28.8F, -3.35F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F); // Box 94
		gunModel[28].setRotationPoint(27.3F, -2.5F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F); // Box 95
		gunModel[29].setRotationPoint(27.3F, -2.3F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.28F, -0.2F, -0.45F, -0.28F, -0.2F, -0.45F, -0.28F, -0.2F, -0.45F, -0.28F, -0.2F, -0.45F, -0.28F, -0.2F, -0.45F, -0.28F, -0.2F, -0.45F, -0.28F, -0.2F, -0.45F, -0.28F); // Box 96
		gunModel[30].setRotationPoint(27.3F, -2F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 98
		gunModel[31].setRotationPoint(5.8F, -3.75F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 99
		gunModel[32].setRotationPoint(5.8F, -3.25F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F); // Box 100
		gunModel[33].setRotationPoint(5.8F, -3.8F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.4F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.2F, 0.4F, -0.5F, -0.2F, 0.4F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.2F, 0.4F, -0.2F, -0.23F); // Box 101
		gunModel[34].setRotationPoint(2.4F, -3.05F, -0.2F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 102
		gunModel[35].setRotationPoint(2.6F, -2.6F, -0.1F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.45F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.25F, 0.5F, -0.45F, -0.25F, 0.5F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.25F, 0.5F, -0.35F, -0.25F); // Box 103
		gunModel[36].setRotationPoint(1F, -3.05F, -0.2F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.25F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.15F, -0.3F, -0.25F, -0.15F); // Box 104
		gunModel[37].setRotationPoint(-0.2F, -3.05F, -0.2F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.55F, -0.2F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.2F, -0.55F, -0.2F, -0.2F); // Box 105
		gunModel[38].setRotationPoint(-0.2F, -2.6F, -0.18F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.35F, -0.1F, -0.5F, -0.35F, 0.3F, 0.2F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.35F, 0.3F, 0.2F, -0.35F); // Box 106
		gunModel[39].setRotationPoint(0.0499999999999998F, -3.25F, -0.2F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.3F, -0.6F, -0.7F, -0.1F, -0.6F, -0.7F, -0.1F, -0.6F, -0.15F, -0.3F, -0.6F, -0.15F, -0.1F, 0F, -0.85F, -0.1F, 0F, -0.85F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 107
		gunModel[40].setRotationPoint(0.0499999999999998F, -3.75F, -0.55F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.3F, -0.6F, -0.7F, -0.1F, -0.6F, -0.7F, -0.1F, -0.6F, -0.15F, -0.3F, -0.6F, -0.15F, 0F, 0F, -0.85F, -0.1F, 0F, -0.85F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gunModel[41].setRotationPoint(4.05F, -3.75F, -0.55F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.6F, -0.7F, -0.3F, -0.6F, -0.7F, -0.3F, -0.6F, -0.15F, -0.1F, -0.6F, -0.15F, -0.1F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 109
		gunModel[42].setRotationPoint(2.6F, -3.75F, -0.55F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.8F, -0.8F, -0.1F, -0.8F, -0.8F, -0.1F, -0.8F, -0.08F, -0.1F, -0.8F, -0.08F, 0F, 0F, -0.85F, -0.1F, 0F, -0.85F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[43].setRotationPoint(3.3F, -3.75F, -0.55F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F); // Box 112
		gunModel[44].setRotationPoint(-0.05F, -2.15F, -0.05F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, 0.2F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.35F, -0.5F, 0.2F, -0.35F); // Box 113
		gunModel[45].setRotationPoint(0F, -3.25F, -1F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.6F, -0.6F, -0.15F, -0.4F, -0.6F, -0.15F, -0.4F, -0.6F, -0.7F, -0.6F, -0.6F, -0.7F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.85F, -0.5F, 0F, -0.85F); // Box 114
		gunModel[46].setRotationPoint(0F, -3.75F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.35F, -0.4F, -0.1F, -0.35F); // Box 115
		gunModel[47].setRotationPoint(5F, -3.35F, -1.05F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, -0.85F, -0.3F, -0.8F, -0.85F, -0.3F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -0.95F, -0.3F, 0F, -0.95F); // Box 116
		gunModel[48].setRotationPoint(5F, -3.85F, -0.45F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 119
		gunModel[49].setRotationPoint(1.1F, -2.9F, -0.6F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -0.7F, -0.2F, -0.25F, -0.7F, -0.2F, -0.25F, -0.7F, -0.5F, -0.25F, -0.7F, -0.5F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 125
		gunModel[50].setRotationPoint(2.4F, -3.18F, -0.75F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.7F, -0.2F, -0.25F, -0.7F, -0.2F, -0.25F, -0.7F, -0.5F, -0.4F, -0.7F, -0.5F, -0.4F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F); // Box 127
		gunModel[51].setRotationPoint(2.75F, -3F, -0.75F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Box 128
		gunModel[52].setRotationPoint(1.7F, -1.8F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Box 129
		gunModel[53].setRotationPoint(-0.35F, -0.8F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, -0.5F, -0.5F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F); // Box 130
		gunModel[54].setRotationPoint(-0.35F, -1.2F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.6F, -0.1F, -0.15F, -0.2F, -0.1F, -0.15F, -0.2F, -0.1F, -0.15F, -0.6F, -0.1F, -0.15F); // Box 131
		gunModel[55].setRotationPoint(-0.35F, -0.4F, -0.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.9F, -0.2F, -0.15F, 0.4F, -0.2F, -0.15F, 0.4F, -0.2F, -0.15F, -0.9F, -0.2F, -0.15F); // Box 132
		gunModel[56].setRotationPoint(-0.15F, 0F, -0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, 0.4F, -0.2F, -0.15F, -0.9F, -0.2F, -0.15F, -0.9F, -0.2F, -0.15F, 0.4F, -0.2F, -0.15F); // Box 133
		gunModel[57].setRotationPoint(1.5F, 0F, -0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.2F, -0.1F, -0.15F, -0.6F, -0.1F, -0.15F, -0.6F, -0.1F, -0.15F, -0.2F, -0.1F, -0.15F); // Box 134
		gunModel[58].setRotationPoint(1.7F, -0.4F, -0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.42F, -0.15F, -0.15F, -0.42F, -0.15F, -0.15F, -0.42F, -0.15F, -0.15F, -0.42F, -0.15F, -0.15F, -0.42F, -0.15F, -0.15F, -0.42F, -0.15F, -0.15F, -0.42F, -0.15F, -0.15F, -0.42F, -0.15F); // Box 135
		gunModel[59].setRotationPoint(0.7F, 0.25F, -0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.3F, -0.5F, -0.15F, -0.6F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.15F, -0.6F, -0.1F, -0.15F); // Box 136
		gunModel[60].setRotationPoint(1.5F, -1.4F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.5F, -0.2F, 0.1F, -0.45F, -0.2F, 0.1F, -0.45F, -0.2F, -0.35F, -0.5F, -0.2F, -0.3F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F); // Box 137
		gunModel[61].setRotationPoint(0.4F, -1.25F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.42F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.42F, -0.5F, -0.2F, -0.2F, -0.05F, -0.2F, -0.6F, -0.05F, -0.2F, -0.6F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F); // Box 138
		gunModel[62].setRotationPoint(0.3F, -0.85F, -0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.55F, -0.2F, -0.2F, -0.3F, -0.05F, -0.2F, -0.3F, -0.05F, -0.2F, -0.55F, -0.2F, -0.2F); // Box 139
		gunModel[63].setRotationPoint(0.1F, -0.4F, -0.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1.3F, -2F, -0.25F, -2.05F, -1.8F, -0.25F, -2.05F, -1.8F, -0.25F, 1.3F, -2F, -0.25F, 1F, 0.95F, 0.1F, -1.8F, 0.9F, 0.1F, -1.8F, 0.9F, 0.1F, 1F, 0.9F, 0.1F); // Box 231
		gunModel[64].setRotationPoint(-11F, -2.5F, -0.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 1.3F, -2F, 0.1F, -2.1F, -2F, 0.1F, -2.1F, -2F, 0.1F, 1.3F, -2F, 0.1F, 1F, 1.1F, 0.1F, -1.8F, 1.3F, 0.1F, -1.8F, 1.3F, 0.1F, 1F, 1.1F, 0.1F); // Box 233
		gunModel[65].setRotationPoint(-10.7F, -1.6F, -0.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F, -0.15F, -0.35F, -0.3F, -0.15F); // Box 234
		gunModel[66].setRotationPoint(5.25F, -1.3F, -0.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F); // Box 198
		gunModel[67].setRotationPoint(0.2F, -3.5F, -0.7F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F); // Box 199
		gunModel[68].setRotationPoint(0.2F, -3.55F, -0.35F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F); // Box 200
		gunModel[69].setRotationPoint(0.2F, -3.55F, -0.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 206
		gunModel[70].setRotationPoint(25.8F, -3.75F, -0.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.15F, 0F, -0.45F, -0.15F, 0F, -0.45F, -0.15F, 0F, -0.45F, -0.15F); // Box 207
		gunModel[71].setRotationPoint(26.8F, -3.8F, -0.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 208
		gunModel[72].setRotationPoint(24.8F, -3.25F, -0.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.1F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.2F, 0F, -0.1F, -0.2F); // Box 209
		gunModel[73].setRotationPoint(26.8F, -2.75F, -0.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F); // Box 210
		gunModel[74].setRotationPoint(26.8F, -3.85F, -0.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F); // Box 212
		gunModel[75].setRotationPoint(26.8F, -2.3F, -0.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.35F, -0.15F, -0.1F, -0.35F, -0.15F, -0.1F, -0.35F, -0.15F, -0.1F, -0.35F, -0.15F, -0.1F, -0.5F, -0.35F, -0.1F, -0.5F, -0.35F, -0.1F, -0.5F, -0.35F, -0.1F, -0.5F, -0.35F); // Box 216
		gunModel[76].setRotationPoint(28.7F, -2.9F, -0.5F);


		defaultScopeModel = new ModelRendererTurbo[22];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 51
		defaultScopeModel[1] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 89
		defaultScopeModel[2] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 90
		defaultScopeModel[3] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 111
		defaultScopeModel[4] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 124
		defaultScopeModel[5] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 126
		defaultScopeModel[6] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 201
		defaultScopeModel[7] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 202
		defaultScopeModel[8] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 203
		defaultScopeModel[9] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 204
		defaultScopeModel[10] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 205
		defaultScopeModel[11] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 214
		defaultScopeModel[12] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 215
		defaultScopeModel[13] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 217
		defaultScopeModel[14] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 218
		defaultScopeModel[15] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 219
		defaultScopeModel[16] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 220
		defaultScopeModel[17] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 221
		defaultScopeModel[18] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 222
		defaultScopeModel[19] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 223
		defaultScopeModel[20] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 224
		defaultScopeModel[21] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 225

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F); // Box 51
		defaultScopeModel[0].setRotationPoint(28.7F, -4.45F, -0.2F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F); // Box 89
		defaultScopeModel[1].setRotationPoint(28.7F, -4.1F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.42F, -0.4F, -0.5F, -0.42F, -0.4F, -0.5F, -0.42F, -0.4F, -0.5F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F); // Box 90
		defaultScopeModel[2].setRotationPoint(28.7F, -4.3F, -0.5F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.65F, -0.8F, -0.3F, -0.65F, -0.8F, -0.3F, -0.65F, -0.05F, -0.05F, -0.65F, -0.05F, 0F, -0.05F, -0.85F, -0.15F, -0.05F, -0.85F, -0.15F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 111
		defaultScopeModel[3].setRotationPoint(2.45F, -4.1F, -0.7F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -0.53F, -0.4F, -0.25F, -0.53F, -0.4F, -0.25F, -0.53F, -0.4F, -0.25F, -0.53F, -0.4F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.6F, -0.25F, -0.5F, -0.6F); // Box 124
		defaultScopeModel[4].setRotationPoint(2.4F, -3.98F, -0.8F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.33F, -0.25F, -0.4F, -0.33F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F); // Box 126
		defaultScopeModel[5].setRotationPoint(2.4F, -3.85F, -0.55F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F); // Box 201
		defaultScopeModel[6].setRotationPoint(0.9F, -3.8F, -0.55F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F); // Box 202
		defaultScopeModel[7].setRotationPoint(0.45F, -3.85F, -0.55F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.8F, -0.5F, -0.3F, -0.8F, -0.5F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.1F, -0.35F, -0.85F, -0.5F, -0.35F, -0.85F, -0.5F, -0.35F, 0F, -0.1F, -0.35F, 0F); // Box 203
		defaultScopeModel[8].setRotationPoint(0.25F, -3.8F, -0.7F);

		defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F); // Box 204
		defaultScopeModel[9].setRotationPoint(0.25F, -3.8F, -0.8F);

		defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F); // Box 205
		defaultScopeModel[10].setRotationPoint(0.25F, -3.7F, -0.9F);

		defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, 0.5F, -0.45F, -0.1F, 0.5F, -0.45F, -0.1F, 0.5F, -0.45F, -0.1F, 0.5F, -0.45F); // Box 214
		defaultScopeModel[11].setRotationPoint(28.7F, -4.05F, -0.8F);

		defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.1F, 0.5F, -0.45F, -0.1F, 0.5F, -0.45F, -0.1F, 0.5F, -0.45F, -0.1F, 0.5F, -0.45F); // Box 215
		defaultScopeModel[12].setRotationPoint(28.7F, -4.05F, -0.2F);

		defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 217
		defaultScopeModel[13].setRotationPoint(28.4F, -4.2F, -0.8F);

		defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 218
		defaultScopeModel[14].setRotationPoint(29F, -4.2F, -0.8F);

		defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 219
		defaultScopeModel[15].setRotationPoint(29F, -4.2F, -0.2F);

		defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 220
		defaultScopeModel[16].setRotationPoint(28.4F, -4.2F, -0.2F);

		defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F); // Box 221
		defaultScopeModel[17].setRotationPoint(28.7F, -4.45F, -0.8F);

		defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Box 222
		defaultScopeModel[18].setRotationPoint(0.11F, -4.2F, -0.4F);

		defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Box 223
		defaultScopeModel[19].setRotationPoint(0.11F, -4.2F, -0.65F);

		defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.43F, -0.45F, -0.45F, -0.43F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.43F, -0.45F, -0.45F, -0.43F); // Box 224
		defaultScopeModel[20].setRotationPoint(0.11F, -4.3F, -0.52F);

		defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.32F, -0.45F, -0.45F, -0.32F, -0.45F, -0.45F, -0.32F, -0.45F, -0.45F, -0.32F, -0.45F, -0.45F, -0.32F, -0.45F, -0.45F, -0.32F, -0.45F, -0.45F, -0.32F, -0.45F, -0.45F, -0.32F); // Box 225
		defaultScopeModel[21].setRotationPoint(0.11F, -4F, -0.53F);


		ammoModel = new ModelRendererTurbo[76];
		ammoModel[0] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 107
		ammoModel[1] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 107
		ammoModel[2] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 107
		ammoModel[3] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 107
		ammoModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 107
		ammoModel[5] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 107
		ammoModel[6] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 107
		ammoModel[7] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 107
		ammoModel[8] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 107
		ammoModel[9] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 107
		ammoModel[10] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 107
		ammoModel[11] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 107
		ammoModel[12] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 107
		ammoModel[13] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 107
		ammoModel[14] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 107
		ammoModel[15] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 107
		ammoModel[16] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 107
		ammoModel[17] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 107
		ammoModel[18] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 107
		ammoModel[19] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 107
		ammoModel[20] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 107
		ammoModel[21] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 107
		ammoModel[22] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 107
		ammoModel[23] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 107
		ammoModel[24] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 107
		ammoModel[25] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 107
		ammoModel[26] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 107
		ammoModel[27] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 107
		ammoModel[28] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 107
		ammoModel[29] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 107
		ammoModel[30] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 170
		ammoModel[31] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 171
		ammoModel[32] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 172
		ammoModel[33] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 173
		ammoModel[34] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 174
		ammoModel[35] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 175
		ammoModel[36] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 176
		ammoModel[37] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 177
		ammoModel[38] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 178
		ammoModel[39] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 179
		ammoModel[40] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 180
		ammoModel[41] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 181
		ammoModel[42] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 182
		ammoModel[43] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 183
		ammoModel[44] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 184
		ammoModel[45] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 185
		ammoModel[46] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 186
		ammoModel[47] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 187
		ammoModel[48] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 188
		ammoModel[49] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 189
		ammoModel[50] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 190
		ammoModel[51] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 191
		ammoModel[52] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 192
		ammoModel[53] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 193
		ammoModel[54] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 194
		ammoModel[55] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 195
		ammoModel[56] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 196
		ammoModel[57] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 197
		ammoModel[58] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 198
		ammoModel[59] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 199
		ammoModel[60] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 107
		ammoModel[61] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 107
		ammoModel[62] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 107
		ammoModel[63] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 107
		ammoModel[64] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 107
		ammoModel[65] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 107
		ammoModel[66] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 107
		ammoModel[67] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 107
		ammoModel[68] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 107
		ammoModel[69] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 107
		ammoModel[70] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 107
		ammoModel[71] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 107
		ammoModel[72] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 107
		ammoModel[73] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 107
		ammoModel[74] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 107
		ammoModel[75] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 230

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 107
		ammoModel[0].setRotationPoint(3.1F, -2.45F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 107
		ammoModel[1].setRotationPoint(3.1F, -2.55F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 107
		ammoModel[2].setRotationPoint(3.92F, -2.55F, -0.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 107
		ammoModel[3].setRotationPoint(3.92F, -2.45F, -0.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 107
		ammoModel[4].setRotationPoint(4.05F, -2.55F, -0.5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 107
		ammoModel[5].setRotationPoint(4.05F, -2.35F, -0.5F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 107
		ammoModel[6].setRotationPoint(4.05F, -2.45F, -0.5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 107
		ammoModel[7].setRotationPoint(4.25F, -2.5F, -0.5F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 107
		ammoModel[8].setRotationPoint(4.25F, -2.4F, -0.5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 107
		ammoModel[9].setRotationPoint(4.5F, -2.5F, -0.5F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 107
		ammoModel[10].setRotationPoint(4.5F, -2.4F, -0.5F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 107
		ammoModel[11].setRotationPoint(3.1F, -2.35F, -0.5F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 107
		ammoModel[12].setRotationPoint(3.92F, -2.35F, -0.5F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 107
		ammoModel[13].setRotationPoint(4.25F, -2.45F, -0.5F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 107
		ammoModel[14].setRotationPoint(4.5F, -2.45F, -0.5F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 107
		ammoModel[15].setRotationPoint(3.1F, -2.2F, -0.5F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 107
		ammoModel[16].setRotationPoint(3.1F, -2.3F, -0.5F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 107
		ammoModel[17].setRotationPoint(3.92F, -2.3F, -0.5F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 107
		ammoModel[18].setRotationPoint(3.92F, -2.2F, -0.5F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 107
		ammoModel[19].setRotationPoint(4.05F, -2.3F, -0.5F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 107
		ammoModel[20].setRotationPoint(4.05F, -2.1F, -0.5F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 107
		ammoModel[21].setRotationPoint(4.05F, -2.2F, -0.5F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 107
		ammoModel[22].setRotationPoint(4.25F, -2.25F, -0.5F);

		ammoModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 107
		ammoModel[23].setRotationPoint(4.25F, -2.15F, -0.5F);

		ammoModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 107
		ammoModel[24].setRotationPoint(4.5F, -2.25F, -0.5F);

		ammoModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 107
		ammoModel[25].setRotationPoint(4.5F, -2.15F, -0.5F);

		ammoModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 107
		ammoModel[26].setRotationPoint(3.1F, -2.1F, -0.5F);

		ammoModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 107
		ammoModel[27].setRotationPoint(3.92F, -2.1F, -0.5F);

		ammoModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 107
		ammoModel[28].setRotationPoint(4.25F, -2.2F, -0.5F);

		ammoModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 107
		ammoModel[29].setRotationPoint(4.5F, -2.2F, -0.5F);

		ammoModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 170
		ammoModel[30].setRotationPoint(3.1F, -1.95F, -0.5F);

		ammoModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 171
		ammoModel[31].setRotationPoint(3.1F, -2.05F, -0.5F);

		ammoModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 172
		ammoModel[32].setRotationPoint(3.92F, -2.05F, -0.5F);

		ammoModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 173
		ammoModel[33].setRotationPoint(3.92F, -1.95F, -0.5F);

		ammoModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 174
		ammoModel[34].setRotationPoint(4.05F, -2.05F, -0.5F);

		ammoModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 175
		ammoModel[35].setRotationPoint(4.05F, -1.85F, -0.5F);

		ammoModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 176
		ammoModel[36].setRotationPoint(4.05F, -1.95F, -0.5F);

		ammoModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 177
		ammoModel[37].setRotationPoint(4.25F, -2F, -0.5F);

		ammoModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 178
		ammoModel[38].setRotationPoint(4.25F, -1.9F, -0.5F);

		ammoModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 179
		ammoModel[39].setRotationPoint(4.5F, -2F, -0.5F);

		ammoModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 180
		ammoModel[40].setRotationPoint(4.5F, -1.9F, -0.5F);

		ammoModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 181
		ammoModel[41].setRotationPoint(3.1F, -1.85F, -0.5F);

		ammoModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 182
		ammoModel[42].setRotationPoint(3.92F, -1.85F, -0.5F);

		ammoModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 183
		ammoModel[43].setRotationPoint(4.25F, -1.95F, -0.5F);

		ammoModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 184
		ammoModel[44].setRotationPoint(4.5F, -1.95F, -0.5F);

		ammoModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 185
		ammoModel[45].setRotationPoint(3.1F, -1.7F, -0.5F);

		ammoModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 186
		ammoModel[46].setRotationPoint(3.1F, -1.8F, -0.5F);

		ammoModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 187
		ammoModel[47].setRotationPoint(3.92F, -1.8F, -0.5F);

		ammoModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 188
		ammoModel[48].setRotationPoint(3.92F, -1.7F, -0.5F);

		ammoModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 189
		ammoModel[49].setRotationPoint(4.05F, -1.8F, -0.5F);

		ammoModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 190
		ammoModel[50].setRotationPoint(4.05F, -1.6F, -0.5F);

		ammoModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 191
		ammoModel[51].setRotationPoint(4.05F, -1.7F, -0.5F);

		ammoModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 192
		ammoModel[52].setRotationPoint(4.25F, -1.75F, -0.5F);

		ammoModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 193
		ammoModel[53].setRotationPoint(4.25F, -1.65F, -0.5F);

		ammoModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 194
		ammoModel[54].setRotationPoint(4.5F, -1.75F, -0.5F);

		ammoModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 195
		ammoModel[55].setRotationPoint(4.5F, -1.65F, -0.5F);

		ammoModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 196
		ammoModel[56].setRotationPoint(3.1F, -1.6F, -0.5F);

		ammoModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 197
		ammoModel[57].setRotationPoint(3.92F, -1.6F, -0.5F);

		ammoModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 198
		ammoModel[58].setRotationPoint(4.25F, -1.7F, -0.5F);

		ammoModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 199
		ammoModel[59].setRotationPoint(4.5F, -1.7F, -0.5F);

		ammoModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 107
		ammoModel[60].setRotationPoint(3.1F, -1.45F, -0.5F);

		ammoModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F); // Box 107
		ammoModel[61].setRotationPoint(3.1F, -1.55F, -0.5F);

		ammoModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.45F, -0.45F, -0.52F, -0.45F, -0.4F, -0.49F, -0.44F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 107
		ammoModel[62].setRotationPoint(3.92F, -1.55F, -0.5F);

		ammoModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F); // Box 107
		ammoModel[63].setRotationPoint(3.92F, -1.45F, -0.5F);

		ammoModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 107
		ammoModel[64].setRotationPoint(4.05F, -1.55F, -0.5F);

		ammoModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F, -0.4F, -0.52F, -0.45F); // Box 107
		ammoModel[65].setRotationPoint(4.05F, -1.35F, -0.5F);

		ammoModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F, -0.4F, -0.45F, -0.42F); // Box 107
		ammoModel[66].setRotationPoint(4.05F, -1.45F, -0.5F);

		ammoModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F); // Box 107
		ammoModel[67].setRotationPoint(4.25F, -1.5F, -0.5F);

		ammoModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.425F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F, -0.4F, -0.48F, -0.46F); // Box 107
		ammoModel[68].setRotationPoint(4.25F, -1.4F, -0.5F);

		ammoModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F); // Box 107
		ammoModel[69].setRotationPoint(4.5F, -1.5F, -0.5F);

		ammoModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.48F, -0.425F, -0.35F, -0.46F, -0.49F, -0.35F, -0.46F, -0.49F, -0.35F, -0.48F, -0.425F, -0.35F, -0.48F, -0.46F, -0.35F, -0.54F, -0.49F, -0.35F, -0.54F, -0.49F, -0.35F, -0.48F, -0.46F); // Box 107
		ammoModel[70].setRotationPoint(4.5F, -1.4F, -0.5F);

		ammoModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0.22F, -0.45F, -0.38F, 0F, -0.45F, -0.38F, 0F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0.22F, -0.49F, -0.45F, 0F, -0.49F, -0.45F); // Box 107
		ammoModel[71].setRotationPoint(3.1F, -1.35F, -0.5F);

		ammoModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.38F, -0.45F, -0.45F, -0.42F, -0.45F, -0.45F, -0.42F, -0.4F, -0.45F, -0.38F, -0.4F, -0.49F, -0.44F, -0.45F, -0.52F, -0.46F, -0.45F, -0.52F, -0.46F, -0.4F, -0.49F, -0.44F); // Box 107
		ammoModel[72].setRotationPoint(3.92F, -1.35F, -0.5F);

		ammoModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F, -0.4F, -0.47F, -0.425F); // Box 107
		ammoModel[73].setRotationPoint(4.25F, -1.45F, -0.5F);

		ammoModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F, -0.35F, -0.47F, -0.425F, -0.35F, -0.49F, -0.49F, -0.35F, -0.49F, -0.49F, -0.35F, -0.47F, -0.425F); // Box 107
		ammoModel[74].setRotationPoint(4.5F, -1.45F, -0.5F);

		ammoModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F); // Box 230
		ammoModel[75].setRotationPoint(2.6F, -2.45F, -0.5F);


		pumpModel = new ModelRendererTurbo[6];
		pumpModel[0] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 117
		pumpModel[1] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 118
		pumpModel[2] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 120
		pumpModel[3] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 121
		pumpModel[4] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 122
		pumpModel[5] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 123

		pumpModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 117
		pumpModel[0].setRotationPoint(0.1F, -3.15F, -0.5F);

		pumpModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 118
		pumpModel[1].setRotationPoint(0.1F, -3.4F, -0.5F);

		pumpModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 120
		pumpModel[2].setRotationPoint(0.1F, -2.95F, -0.5F);

		pumpModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.13F, -0.3F, -0.15F, -0.13F, -0.3F, -0.15F, -0.13F, -0.3F, -0.15F, -0.13F, -0.3F, -0.15F, -0.05F, -0.3F, -0.15F, -0.25F, -0.3F, -0.15F, -0.25F, -0.3F, -0.15F, -0.05F, -0.3F); // Box 121
		pumpModel[3].setRotationPoint(-0.75F, -3.15F, -0.5F);

		pumpModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.35F, -0.7F, -0.5F, -0.35F, -0.7F, -0.5F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, -0.7F, -0.35F, -0.4F, -0.7F); // Box 122
		pumpModel[4].setRotationPoint(-0.15F, -3.4F, -1.1F);

		pumpModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 123
		pumpModel[5].setRotationPoint(-0.15F, -2.05F, -1.5F);

		this.modelScale = 0.85F;

//		scopeAttachPoint = new Vector3f(15 /16F, 48F /16F, 0F /16F);
		translateAll = new Vector3f(0F, -3.9F, 0.005F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.05F, 0F);//forward/up/? 

	    actionArm = EnumArm.Right;
	    actionType = EnumAction.Bolt;
		rotationHelper = new Vector3f(0, 0.2F, 0);
		boltRotationPoint = new Vector3f(0, 0.2F, 0);
		boltRotation = -15F;
		
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
        
        leftArmPos = new Vector3f(0.450F, -0.65F, 0.07F);
        leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.0F, -0.70F, 0.02F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);
 
        rightArmPos = new Vector3f(0.48F, -0.62F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.27F, -0.59F, 0.04F);
        rightArmReloadRot = new Vector3f(15F, 15F, -90.0F);
        
        rightArmChargePos = new Vector3f(0.4F, -0.5F, 0.17F);
        rightArmChargeRot = new Vector3f(-0.0F, 0F, -81.0F);
        
        rightArmScale = new Vector3f(0.7F, 0.8F, 0.7F);
        leftArmScale = new Vector3f(0.7F, 1.0F, 0.7F);
 
        leftHandAmmo = true;
        
		//RecoilSlideDistance = 0.16F;
		//RotateSlideDistance = -1F;
        
		pumpDelayAfterReload = 65;
		pumpDelay = 10;
		pumpTime = 20;
		gripIsOnPump = false;
		pumpHandleDistance = 0.15F;
		
		chargeModifier = new Vector3f (0.05F, 0.05F, -0.075F);
		
		crouchZoom = -0.45F;
		fancyStance = true;
		sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
		sprintTranslate = new Vector3f(0.5F, -0.10F, -0.55F);

		flipAll();
	}
}