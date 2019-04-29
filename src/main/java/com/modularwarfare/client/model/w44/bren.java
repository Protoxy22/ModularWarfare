//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.12.2017 - 06:32:17
// Last changed on: 06.12.2017 - 06:32:17

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class bren extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public bren() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[88];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 18
		gunModel[18] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 25
		gunModel[19] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 92
		gunModel[20] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 93
		gunModel[21] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 94
		gunModel[22] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 95
		gunModel[23] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 96
		gunModel[24] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 97
		gunModel[25] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 98
		gunModel[26] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 100
		gunModel[27] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 101
		gunModel[28] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 102
		gunModel[29] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 103
		gunModel[30] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 105
		gunModel[31] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 121
		gunModel[32] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 122
		gunModel[33] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 123
		gunModel[34] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 124
		gunModel[35] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 125
		gunModel[36] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 126
		gunModel[37] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 127
		gunModel[38] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 128
		gunModel[39] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 129
		gunModel[40] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 130
		gunModel[41] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 131
		gunModel[42] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 132
		gunModel[43] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 133
		gunModel[44] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 134
		gunModel[45] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 135
		gunModel[46] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 136
		gunModel[47] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 137
		gunModel[48] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 138
		gunModel[49] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 139
		gunModel[50] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 140
		gunModel[51] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 141
		gunModel[52] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 142
		gunModel[53] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 143
		gunModel[54] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 144
		gunModel[55] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 145
		gunModel[56] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 24
		gunModel[57] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 25
		gunModel[58] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 26
		gunModel[59] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 27
		gunModel[60] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 28
		gunModel[61] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 29
		gunModel[62] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 65
		gunModel[63] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 66
		gunModel[64] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 67
		gunModel[65] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 68
		gunModel[66] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 69
		gunModel[67] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 70
		gunModel[68] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 71
		gunModel[69] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 72
		gunModel[70] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 73
		gunModel[71] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 74
		gunModel[72] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 75
		gunModel[73] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 177
		gunModel[74] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 178
		gunModel[75] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 179
		gunModel[76] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 180
		gunModel[77] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 185
		gunModel[78] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 186
		gunModel[79] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 187
		gunModel[80] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 206
		gunModel[81] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 207
		gunModel[82] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 208
		gunModel[83] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 209
		gunModel[84] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 210
		gunModel[85] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 184
		gunModel[86] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 185
		gunModel[87] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 107

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

		gunModel[17].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 18
		gunModel[17].setRotationPoint(18.25F, -8.8F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F, -0.35F, 0.4F, 0.4F); // Box 25
		gunModel[18].setRotationPoint(17.75F, -8.8F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.45F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.45F, 0.15F); // Box 92
		gunModel[19].setRotationPoint(24.75F, -6.5F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F, 0F, 0F, -0.11F, 0.5F, 0F, -0.11F, 0.5F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 1F, -0.11F, 0.5F, -0.5F, -0.11F, 0.5F, -0.5F, -0.11F, 0F, 1F, -0.11F); // Box 93
		gunModel[20].setRotationPoint(18.25F, -7.5F, -1F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, -0.75F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 0F, -0.11F, -0.75F, 0F, -0.11F, -0.75F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 0F, -0.11F, -0.75F, 0F, -0.11F); // Box 94
		gunModel[21].setRotationPoint(14.25F, -7.5F, -1F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F); // Box 95
		gunModel[22].setRotationPoint(25.75F, -7.68F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 96
		gunModel[23].setRotationPoint(-5.75F, -9F, -1F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0F, -0.1F); // Box 97
		gunModel[24].setRotationPoint(3.25F, -10.55F, 0F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0F, -0.1F); // Box 98
		gunModel[25].setRotationPoint(3.25F, -10.55F, -1F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.68F, 0F, 0F, -0.68F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.68F, 0F, -0.25F, -0.68F); // Box 100
		gunModel[26].setRotationPoint(5.25F, -10.3F, -1F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 101
		gunModel[27].setRotationPoint(5.25F, -10.3F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.8F, -0.25F, 0F); // Box 102
		gunModel[28].setRotationPoint(11.25F, -10.3F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 103
		gunModel[29].setRotationPoint(12.25F, -10.3F, -1F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 105
		gunModel[30].setRotationPoint(4.25F, -10.3F, -1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.2F, 0.2F); // Box 121
		gunModel[31].setRotationPoint(50.25F, -8.8F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, 0.1F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.1F, 0.1F); // Box 122
		gunModel[32].setRotationPoint(52.25F, -8.8F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F); // Box 123
		gunModel[33].setRotationPoint(54.25F, -8.8F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 124
		gunModel[34].setRotationPoint(4.25F, -9.55F, -1F);

		gunModel[35].addShapeBox(-2.75F, -2.2F, -0.5F, 4, 1, 1, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 125
		gunModel[35].setRotationPoint(0F, 0F, 0F);
		gunModel[35].rotateAngleZ = -0.13962634F;

		gunModel[36].addShapeBox(-2.75F, -4.2F, -0.5F, 4, 2, 1, 0F, 0.6F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.6F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 126
		gunModel[36].setRotationPoint(0F, 0F, 0F);
		gunModel[36].rotateAngleZ = -0.13962634F;

		gunModel[37].addShapeBox(-2.75F, -1.2F, -0.5F, 4, 2, 1, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.1F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.1F, 0F, 0.05F, 0.1F, 0F, 0.05F); // Box 127
		gunModel[37].setRotationPoint(0F, 0F, 0F);
		gunModel[37].rotateAngleZ = -0.13962634F;

		gunModel[38].addShapeBox(-2.75F, 0.8F, -0.5F, 4, 3, 1, 0F, 0.1F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.1F, 0F, 0.05F, 0.1F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 128
		gunModel[38].setRotationPoint(0F, 0F, 0F);
		gunModel[38].rotateAngleZ = -0.13962634F;

		gunModel[39].addShapeBox(-2.75F, -4.2F, 0.25F, 4, 2, 1, 0F, 0.6F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 129
		gunModel[39].setRotationPoint(0F, 0F, 0F);
		gunModel[39].rotateAngleZ = -0.13962634F;

		gunModel[40].addShapeBox(-2.75F, -2.2F, 0.25F, 4, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 130
		gunModel[40].setRotationPoint(0F, 0F, 0F);
		gunModel[40].rotateAngleZ = -0.13962634F;

		gunModel[41].addShapeBox(-2.75F, -1.2F, 0.25F, 4, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -1.1F, 0F, -0.3F, -0.9F, 0F, -0.3F); // Box 131
		gunModel[41].setRotationPoint(0F, 0F, 0F);
		gunModel[41].rotateAngleZ = -0.13962634F;

		gunModel[42].addShapeBox(-2.75F, 0.8F, 0.25F, 4, 3, 1, 0F, 0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -1.1F, 0F, -0.3F, -0.9F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, -1F, -0.3F, -1F, -1F, -0.3F); // Box 132
		gunModel[42].setRotationPoint(0F, 0F, 0F);
		gunModel[42].rotateAngleZ = -0.13962634F;

		gunModel[43].addShapeBox(-2.75F, -4.2F, -1.25F, 4, 2, 1, 0F, -0.4F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0.6F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 133
		gunModel[43].setRotationPoint(0F, 0F, 0F);
		gunModel[43].rotateAngleZ = -0.13962634F;

		gunModel[44].addShapeBox(-2.75F, -2.2F, -1.25F, 4, 1, 1, 0F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 134
		gunModel[44].setRotationPoint(0F, 0F, 0F);
		gunModel[44].rotateAngleZ = -0.13962634F;

		gunModel[45].addShapeBox(-2.75F, -1.2F, -1.25F, 4, 2, 1, 0F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.9F, 0F, -0.3F, -1.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Box 135
		gunModel[45].setRotationPoint(0F, 0F, 0F);
		gunModel[45].rotateAngleZ = -0.13962634F;

		gunModel[46].addShapeBox(-2.75F, 0.8F, -1.25F, 4, 3, 1, 0F, -0.9F, 0F, -0.3F, -1.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, -1F, -1F, -0.3F, -1F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 136
		gunModel[46].setRotationPoint(0F, 0F, 0F);
		gunModel[46].rotateAngleZ = -0.13962634F;

		gunModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0.05F, 0.6F, 0F, 0.05F, 0.6F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0.5F, 0.05F, 0F, 0.5F, 0.05F, 0F, 0.5F, 0.05F, 0F, 0.5F, 0.05F); // Box 137
		gunModel[47].setRotationPoint(1.25F, -4F, -0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.05F, 0.6F, -0.5F, 0.05F, 0.6F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 138
		gunModel[48].setRotationPoint(1.25F, -3F, -0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, 0.05F, 0.4F, 0F, 0.05F, -0.6F, -0.5F, 0.05F, 0.6F, -0.5F, 0.05F, 0.6F, -0.5F, 0.05F, -0.6F, -0.5F, 0.05F); // Box 139
		gunModel[49].setRotationPoint(1.25F, -1F, -0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 140
		gunModel[50].setRotationPoint(1.25F, -2F, -0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.4F, -0.5F, 0.05F, 0.6F, -0.5F, 0.05F, 0.6F, -0.5F, 0.05F, 0.4F, -0.5F, 0.05F, -0.6F, 0F, 0.05F, -0.4F, 0F, -0.95F, -0.4F, 0F, 0.05F, -0.6F, 0F, 0.05F); // Box 141
		gunModel[51].setRotationPoint(2.25F, -1F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.4F, 0F, 0.05F, -0.4F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.4F, 0F, 0.05F); // Box 142
		gunModel[52].setRotationPoint(4.25F, -2F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.4F, 0F, 0.05F, 0F, -0.5F, 0.05F, -0.4F, -0.5F, 0.05F, -0.4F, -0.5F, 0.05F, 0F, -0.5F, 0.05F); // Box 143
		gunModel[53].setRotationPoint(4.25F, -1F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.6F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0.6F, -0.5F, 0.05F, -0.4F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.4F, 0F, 0.05F); // Box 144
		gunModel[54].setRotationPoint(4.25F, -3F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F); // Box 145
		gunModel[55].setRotationPoint(2F, -3F, -0.5F);
		gunModel[55].rotateAngleZ = 0.15707963F;

		gunModel[56].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -1.5F, 0F); // Box 24
		gunModel[56].setRotationPoint(-23.75F, -1F, 0F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F); // Box 25
		gunModel[57].setRotationPoint(-23.75F, -1F, 0F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[58].setRotationPoint(-23.75F, -7F, 0F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[59].setRotationPoint(-12.75F, -7.5F, 0F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 28
		gunModel[60].setRotationPoint(-9.75F, -8.5F, 0F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[61].setRotationPoint(-7.75F, -8.5F, 0F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[62].setRotationPoint(31.25F, -9.25F, -1F);

		gunModel[63].addShapeBox(0.5F, -4.05F, -0.5F, 1, 1, 1, 0F, 0.1F, 0.15F, -0.25F, -0.5F, 0.15F, -0.25F, -0.5F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F); // Box 66
		gunModel[63].setRotationPoint(31.25F, -8.25F, 1F);
		gunModel[63].rotateAngleX = 1.34390352F;

		gunModel[64].addShapeBox(0.5F, -2.75F, -0.5F, 2, 1, 1, 0F, 0.1F, 0.15F, -0.25F, -0.5F, 0.15F, -0.25F, -0.5F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F, 0.1F, 0.15F, -0.25F); // Box 67
		gunModel[64].setRotationPoint(31.25F, -8.25F, 1F);
		gunModel[64].rotateAngleX = 1.34390352F;

		gunModel[65].addShapeBox(-5.5F, -5.5F, -0.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[65].setRotationPoint(32.5F, -8.25F, 1.5F);
		gunModel[65].rotateAngleX = 1.34390352F;
		gunModel[65].rotateAngleY = -0.01745329F;

		gunModel[66].addShapeBox(-1.5F, -5.5F, -0.5F, 1, 1, 1, 0F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F); // Box 69
		gunModel[66].setRotationPoint(32.5F, -8.25F, 1.5F);
		gunModel[66].rotateAngleX = 1.34390352F;
		gunModel[66].rotateAngleY = -0.01745329F;

		gunModel[67].addShapeBox(-2F, -5.5F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F); // Box 70
		gunModel[67].setRotationPoint(32.5F, -8.25F, 1.5F);
		gunModel[67].rotateAngleX = 1.34390352F;
		gunModel[67].rotateAngleY = -0.01745329F;

		gunModel[68].addShapeBox(-1F, -5.5F, -0.5F, 1, 1, 1, 0F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F); // Box 71
		gunModel[68].setRotationPoint(32.5F, -8.25F, 1.5F);
		gunModel[68].rotateAngleX = 1.34390352F;
		gunModel[68].rotateAngleY = -0.01745329F;

		gunModel[69].addShapeBox(-6F, -5.5F, -0.5F, 1, 1, 1, 0F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F); // Box 72
		gunModel[69].setRotationPoint(32.5F, -8.25F, 1.5F);
		gunModel[69].rotateAngleX = 1.34390352F;
		gunModel[69].rotateAngleY = -0.01745329F;

		gunModel[70].addShapeBox(-6.5F, -5.5F, -0.5F, 1, 1, 1, 0F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F); // Box 73
		gunModel[70].setRotationPoint(32.5F, -8.25F, 1.5F);
		gunModel[70].rotateAngleX = 1.34390352F;
		gunModel[70].rotateAngleY = -0.01745329F;

		gunModel[71].addShapeBox(-7F, -5.5F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F); // Box 74
		gunModel[71].setRotationPoint(32.5F, -8.25F, 1.5F);
		gunModel[71].rotateAngleX = 1.34390352F;
		gunModel[71].rotateAngleY = -0.01745329F;

		gunModel[72].addShapeBox(0.75F, -2.75F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Box 75
		gunModel[72].setRotationPoint(31.25F, -8.25F, 1F);
		gunModel[72].rotateAngleX = 1.34390352F;

		gunModel[73].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -0.5F, 0F); // Box 177
		gunModel[73].setRotationPoint(-23.75F, -1F, -1F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3F, 0F); // Box 178
		gunModel[74].setRotationPoint(-23.75F, -1F, -1F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		gunModel[75].setRotationPoint(-23.75F, -7F, -1F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 180
		gunModel[76].setRotationPoint(-12.75F, -7.5F, -1F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.5F); // Box 185
		gunModel[77].setRotationPoint(-7.75F, -8.5F, -0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 186
		gunModel[78].setRotationPoint(-9.75F, -8.5F, -1F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 187
		gunModel[79].setRotationPoint(-7.75F, -8.5F, -1F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 206
		gunModel[80].setRotationPoint(37.75F, -6.3F, -0.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 207
		gunModel[81].setRotationPoint(39.75F, -6F, 0F);
		gunModel[81].rotateAngleX = 0.26179939F;
		gunModel[81].rotateAngleZ = -0.45378561F;

		gunModel[82].addShapeBox(-0.2F, 16F, 0F, 2, 1, 1, 0F, 0F, 0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 208
		gunModel[82].setRotationPoint(39.75F, -6F, 0F);
		gunModel[82].rotateAngleX = 0.26179939F;
		gunModel[82].rotateAngleZ = -0.45378561F;

		gunModel[83].addShapeBox(-0.2F, 16F, -1F, 2, 1, 1, 0F, 0F, 0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, -0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 209
		gunModel[83].setRotationPoint(39.75F, -6F, 0F);
		gunModel[83].rotateAngleX = -0.26179939F;
		gunModel[83].rotateAngleZ = -0.45378561F;

		gunModel[84].addShapeBox(0F, 0F, -1F, 1, 16, 1, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 210
		gunModel[84].setRotationPoint(39.75F, -6F, 0F);
		gunModel[84].rotateAngleX = -0.26179939F;
		gunModel[84].rotateAngleZ = -0.45378561F;

		gunModel[85].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		gunModel[85].setRotationPoint(-19.75F, -7F, -1F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		gunModel[86].setRotationPoint(-19.75F, -7F, 0F);

		gunModel[87].addShapeBox(-22F, -4F, 0.7F, 1, 2, 2, 0F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, -1.7F, -0.45F, -0.35F, -1.7F, -0.45F, -0.35F, -1.7F, -0.45F, -0.35F, -1.7F, -0.45F); // Box 107
		gunModel[87].setRotationPoint(22.25F, -9.5F, -1.7F);



		defaultScopeModel = new ModelRendererTurbo[14];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 189
		defaultScopeModel[1] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 190
		defaultScopeModel[2] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 191
		defaultScopeModel[3] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 192
		defaultScopeModel[4] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 195
		defaultScopeModel[5] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box 99
		defaultScopeModel[6] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box 100
		defaultScopeModel[7] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box 101
		defaultScopeModel[8] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box 102
		defaultScopeModel[9] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 103
		defaultScopeModel[10] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 104
		defaultScopeModel[11] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 105
		defaultScopeModel[12] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 106
		defaultScopeModel[13] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box 108

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 189
		defaultScopeModel[0].setRotationPoint(47.25F, -10.15F, 1.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 190
		defaultScopeModel[1].setRotationPoint(47.25F, -10.65F, 1.9F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 191
		defaultScopeModel[2].setRotationPoint(47.25F, -10.65F, 0.9F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 192
		defaultScopeModel[3].setRotationPoint(47.25F, -10.65F, 1.4F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.15F, -1.2F, 0F, -0.15F, -1.2F, 0F, -0.7F, 0.2F, 0F, -0.7F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 195
		defaultScopeModel[4].setRotationPoint(47.25F, -10F, 0.1F);

		defaultScopeModel[5].addShapeBox(-3F, 0F, 1.45F, 1, 2, 1, 0F, 0F, -0.85F, 0.15F, 0F, -0.85F, 0.15F, 0F, -0.85F, 0.15F, 0F, -0.85F, 0.15F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F); // Box 99
		defaultScopeModel[5].setRotationPoint(3.25F, -10.5F, 0F);

		defaultScopeModel[6].addShapeBox(-3F, -1F, 1.45F, 1, 2, 1, 0F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, -0.85F, 0.15F, 0F, -0.85F, 0.15F, 0F, -0.85F, 0.15F, 0F, -0.85F, 0.15F); // Box 100
		defaultScopeModel[6].setRotationPoint(3.25F, -10.5F, 0F);

		defaultScopeModel[7].addShapeBox(-2.99F, -0.5F, 1.95F, 1, 2, 1, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 101
		defaultScopeModel[7].setRotationPoint(3.25F, -10.5F, 0F);

		defaultScopeModel[8].addShapeBox(-2.99F, -0.5F, 0.95F, 1, 2, 1, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 102
		defaultScopeModel[8].setRotationPoint(3.25F, -10.5F, 0F);

		defaultScopeModel[9].addShapeBox(-22F, -4F, 0.7F, 1, 2, 2, 0F, -0.35F, 3F, -0.85F, -0.35F, 3F, -0.85F, -0.35F, 3F, -0.85F, -0.35F, 3F, -0.85F, -0.35F, 0F, -0.85F, -0.35F, 0F, -0.85F, -0.35F, 0F, -0.85F, -0.35F, 0F, -0.85F); // Box 103
		defaultScopeModel[9].setRotationPoint(22.25F, -6.5F, -1F);

		defaultScopeModel[10].addShapeBox(-22F, -4F, -0.7F, 1, 2, 2, 0F, -0.35F, 3F, -0.85F, -0.35F, 3F, -0.85F, -0.35F, 3F, -0.85F, -0.35F, 3F, -0.85F, -0.35F, 0F, -0.85F, -0.35F, 0F, -0.85F, -0.35F, 0F, -0.85F, -0.35F, 0F, -0.85F); // Box 104
		defaultScopeModel[10].setRotationPoint(22.25F, -6.5F, -1F);

		defaultScopeModel[11].addShapeBox(-2.5F, -7F, -0.1F, 4, 1, 1, 0F, -1.9F, -0.3F, 0.25F, -1.9F, -0.3F, 0.25F, -1.9F, -0.3F, 0.8F, -1.9F, -0.3F, 0.8F, -1.9F, -0.3F, 0.25F, -1.9F, -0.3F, 0.25F, -1.9F, -0.3F, 0.8F, -1.9F, -0.3F, 0.8F); // Box 105
		defaultScopeModel[11].setRotationPoint(1.25F, -3.5F, -0.4F);

		defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -1.8F, 3.75F, -0.8F, -1.8F, 3.75F, -0.8F, -1.8F, 3.75F, -0.8F, -1.8F, 3.75F, -0.8F, -1.8F, 0F, -0.8F, -1.8F, 0F, -0.8F, -1.8F, 0F, -0.8F, -1.8F, 0F, -0.8F); // Box 106
		defaultScopeModel[12].setRotationPoint(1.75F, -10F, -2F);
		defaultScopeModel[12].rotateAngleY = 1.57079633F;

		defaultScopeModel[13].addShapeBox(-3F, 0F, 0F, 1, 2, 1, 0F, 0.25F, -0.8F, 0.45F, 0.25F, -0.8F, 0.45F, 0.25F, -0.8F, 0.45F, 0.25F, -0.8F, 0.45F, 0.25F, 0.2F, 0.45F, 0.25F, 0F, 0.45F, 0.25F, 0F, 0.45F, 0.25F, 0.2F, 0.45F); // Box 108
		defaultScopeModel[13].setRotationPoint(3.25F, -9.65F, -0.5F);



		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 104
		ammoModel[1] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 182
		ammoModel[2] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 183

		ammoModel[0].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, -0.2F, 1.5F, 0.1F, -0.2F, 0.25F, 0.1F, -0.2F, 0.25F, 0.1F, -0.2F, 1.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 104
		ammoModel[0].setRotationPoint(5.25F, -12.55F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, -2F, 0F, 0.1F, 1.25F, -2F, 0.1F, 1.25F, -2F, 0.1F, -2F, 0F, 0.1F, -0.2F, 0.25F, 0.1F, -0.2F, 1.5F, 0.1F, -0.2F, 1.5F, 0.1F, -0.2F, 0.25F, 0.1F); // Box 182
		ammoModel[1].setRotationPoint(5.25F, -18.3F, -0.5F);

		ammoModel[2].addShapeBox(2.25F, 0F, 0F, 7, 4, 1, 0F, -3.2F, 1.75F, 0.1F, 0.8F, -2.25F, 0.1F, 0.8F, -2.25F, 0.1F, -3.2F, 1.75F, 0.1F, 1.25F, -2F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, 0.1F, 1.25F, -2F, 0.1F); // Box 183
		ammoModel[2].setRotationPoint(6.25F, -20.3F, -0.5F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 188

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 188
		slideModel[0].setRotationPoint(13.15F, -6F, -2.5F);

	
		this.modelScale = 0.4F;

		translateAimPosition = new Vector3f(0F, 0F, -0.05F);
		
		translateAll = new Vector3f(0F, -6.2F, 0F);
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