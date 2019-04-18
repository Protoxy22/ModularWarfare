//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.08.2017 - 20:09:46
// Last changed on: 04.08.2017 - 20:09:46

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class dp28 extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public dp28() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[104];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 196
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 197
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 198
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 199
		gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 50
		gunModel[5] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 53
		gunModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 55
		gunModel[7] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 56
		gunModel[8] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 58
		gunModel[9] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 59
		gunModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 60
		gunModel[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 61
		gunModel[12] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 62
		gunModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 63
		gunModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 64
		gunModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 65
		gunModel[16] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 66
		gunModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 67
		gunModel[18] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 69
		gunModel[19] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 70
		gunModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 71
		gunModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 72
		gunModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 73
		gunModel[23] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 74
		gunModel[24] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 75
		gunModel[25] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 76
		gunModel[26] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 77
		gunModel[27] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 78
		gunModel[28] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 79
		gunModel[29] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 80
		gunModel[30] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 81
		gunModel[31] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 85
		gunModel[32] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 86
		gunModel[33] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 87
		gunModel[34] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 88
		gunModel[35] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 48
		gunModel[36] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 53
		gunModel[37] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 54
		gunModel[38] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 55
		gunModel[39] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 56
		gunModel[40] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 60
		gunModel[41] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 72
		gunModel[42] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 73
		gunModel[43] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 185
		gunModel[44] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 112
		gunModel[45] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 113
		gunModel[46] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 114
		gunModel[47] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 115
		gunModel[48] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 116
		gunModel[49] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 69
		gunModel[50] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 70
		gunModel[51] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 71
		gunModel[52] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 72
		gunModel[53] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 73
		gunModel[54] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 74
		gunModel[55] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 75
		gunModel[56] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 76
		gunModel[57] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 77
		gunModel[58] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 78
		gunModel[59] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 79
		gunModel[60] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 80
		gunModel[61] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 81
		gunModel[62] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 83
		gunModel[63] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 84
		gunModel[64] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 85
		gunModel[65] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 86
		gunModel[66] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 87
		gunModel[67] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 88
		gunModel[68] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 89
		gunModel[69] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 90
		gunModel[70] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 91
		gunModel[71] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 93
		gunModel[72] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 94
		gunModel[73] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 95
		gunModel[74] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 96
		gunModel[75] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 97
		gunModel[76] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 98
		gunModel[77] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 99
		gunModel[78] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 100
		gunModel[79] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 101
		gunModel[80] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 102
		gunModel[81] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 103
		gunModel[82] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 104
		gunModel[83] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 105
		gunModel[84] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 106
		gunModel[85] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 107
		gunModel[86] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 108
		gunModel[87] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 109
		gunModel[88] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 110
		gunModel[89] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 111
		gunModel[90] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 112
		gunModel[91] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 91
		gunModel[92] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 92
		gunModel[93] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 94
		gunModel[94] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 96
		gunModel[95] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 117
		gunModel[96] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 118
		gunModel[97] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 120
		gunModel[98] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 121
		gunModel[99] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 122
		gunModel[100] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 123
		gunModel[101] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 124
		gunModel[102] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 125
		gunModel[103] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 126

		gunModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 196
		gunModel[0].setRotationPoint(0F, -3F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		gunModel[1].setRotationPoint(0F, -5F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		gunModel[2].setRotationPoint(5F, -5F, -0.5F);

		gunModel[3].addShapeBox(0F, -0.2F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		gunModel[3].setRotationPoint(1.75F, -7F, -0.5F);
		gunModel[3].rotateAngleZ = 0.26179939F;

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 50
		gunModel[4].setRotationPoint(-4F, -10F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 31, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F); // Box 53
		gunModel[5].setRotationPoint(-1F, -9F, -1.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[6].setRotationPoint(30F, -10.5F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 56
		gunModel[7].setRotationPoint(30F, -7.25F, -2F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 58
		gunModel[8].setRotationPoint(30F, -9.5F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 59
		gunModel[9].setRotationPoint(30F, -8.5F, -2F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 60
		gunModel[10].setRotationPoint(30F, -8F, -2F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 61
		gunModel[11].setRotationPoint(30F, -9F, -2F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 62
		gunModel[12].setRotationPoint(33F, -9F, -2F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 63
		gunModel[13].setRotationPoint(33F, -8F, -2F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 64
		gunModel[14].setRotationPoint(37F, -9F, -2F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 65
		gunModel[15].setRotationPoint(37F, -8F, -2F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 66
		gunModel[16].setRotationPoint(41F, -9F, -2F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 67
		gunModel[17].setRotationPoint(41F, -8F, -2F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 69
		gunModel[18].setRotationPoint(30F, -9.5F, 0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 70
		gunModel[19].setRotationPoint(30F, -8.5F, 1F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 71
		gunModel[20].setRotationPoint(30F, -8F, 1F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 72
		gunModel[21].setRotationPoint(30F, -9F, 1F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 73
		gunModel[22].setRotationPoint(33F, -9F, 1F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 74
		gunModel[23].setRotationPoint(33F, -8F, 1F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 75
		gunModel[24].setRotationPoint(37F, -9F, 1F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 76
		gunModel[25].setRotationPoint(37F, -8F, 1F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 77
		gunModel[26].setRotationPoint(41F, -9F, 1F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 78
		gunModel[27].setRotationPoint(41F, -8F, 1F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 31, 1, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		gunModel[28].setRotationPoint(-1F, -10F, -1.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 31, 2, 3, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 80
		gunModel[29].setRotationPoint(-1F, -7F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 81
		gunModel[30].setRotationPoint(-4F, -10F, -1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 85
		gunModel[31].setRotationPoint(45F, -8F, 1F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 86
		gunModel[32].setRotationPoint(45F, -9F, 1F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 87
		gunModel[33].setRotationPoint(45F, -8F, -2F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 88
		gunModel[34].setRotationPoint(45F, -9F, -2F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 48
		gunModel[35].setRotationPoint(-7F, -6F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[36].setRotationPoint(-11F, -8F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[37].setRotationPoint(-11F, -7F, -1.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 55
		gunModel[38].setRotationPoint(-11F, -7F, 0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F); // Box 56
		gunModel[39].setRotationPoint(-24F, -7F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 2F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 1.5F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 60
		gunModel[40].setRotationPoint(-24F, -6F, 0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 72
		gunModel[41].setRotationPoint(-9F, -6F, -1.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 73
		gunModel[42].setRotationPoint(-9F, -7F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 185
		gunModel[43].setRotationPoint(-7F, -5F, -1.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 112
		gunModel[44].setRotationPoint(54F, -9.5F, -2F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113
		gunModel[45].setRotationPoint(54F, -11F, -2F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 114
		gunModel[46].setRotationPoint(54F, -8F, -2F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		gunModel[47].setRotationPoint(54.5F, -9.5F, -1F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 38, 2, 2, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 116
		gunModel[48].setRotationPoint(30.5F, -9.5F, -1F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 69
		gunModel[49].setRotationPoint(-23F, -6F, 0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 70
		gunModel[50].setRotationPoint(46F, -9F, -2F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 71
		gunModel[51].setRotationPoint(46F, -10.5F, -2F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 72
		gunModel[52].setRotationPoint(46F, -7.5F, -2F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 73
		gunModel[53].setRotationPoint(30F, -6.2F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		gunModel[54].setRotationPoint(52F, -6.2F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		gunModel[55].setRotationPoint(55.1F, -6.2F, -0.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F); // Box 76
		gunModel[56].setRotationPoint(-23F, -6F, -0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 1.5F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 3F, 0F); // Box 77
		gunModel[57].setRotationPoint(-24F, -6F, -1.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F); // Box 78
		gunModel[58].setRotationPoint(-23F, -6F, -1.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 79
		gunModel[59].setRotationPoint(-16F, -6F, 0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F); // Box 80
		gunModel[60].setRotationPoint(-16F, -6F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 3F, 0F); // Box 81
		gunModel[61].setRotationPoint(-16F, -6F, -1.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 83
		gunModel[62].setRotationPoint(-15F, -8F, -0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 84
		gunModel[63].setRotationPoint(-15F, -7F, 0.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 85
		gunModel[64].setRotationPoint(-15F, -7F, -1.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 3F, 0F); // Box 86
		gunModel[65].setRotationPoint(-22F, -6F, -1.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 3F, 0F); // Box 87
		gunModel[66].setRotationPoint(-22F, -6F, -0.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 88
		gunModel[67].setRotationPoint(-22F, -6F, 0.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 89
		gunModel[68].setRotationPoint(-18F, -6F, 0.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 4F, 0F); // Box 90
		gunModel[69].setRotationPoint(-18F, -6F, -0.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 4F, 0F); // Box 91
		gunModel[70].setRotationPoint(-18F, -6F, -1.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 93
		gunModel[71].setRotationPoint(-20F, -6F, -0.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 94
		gunModel[72].setRotationPoint(-20F, -6F, 0.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 95
		gunModel[73].setRotationPoint(-20F, -6F, -1.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, -0.27F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.27F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F); // Box 96
		gunModel[74].setRotationPoint(-2F, -7F, -1.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.25F); // Box 97
		gunModel[75].setRotationPoint(-2F, -9F, -1.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		gunModel[76].setRotationPoint(-2F, -10F, -1.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, -0.3F, -0.3F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.3F, -0.3F); // Box 99
		gunModel[77].setRotationPoint(68.5F, -9.5F, -1F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 100
		gunModel[78].setRotationPoint(67.5F, -9.5F, -1F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 101
		gunModel[79].setRotationPoint(3F, -12F, -0.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F); // Box 102
		gunModel[80].setRotationPoint(3F, -12.35F, -0.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0.1F, -0.7F, 0.3F, 0.1F, -0.7F, 0.3F, 0.1F, -0.7F, 0.3F, 0.1F, -0.7F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F); // Box 103
		gunModel[81].setRotationPoint(3F, -11F, -0.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, -0.4F, 0.1F, -0.5F, -0.4F, 0.1F, -0.5F, -0.4F, 0.5F, 0F, -0.4F, 0.1F, 0F, -0.4F, 1.1F, 0F, -0.4F, 1.1F, 0F, -0.4F, 0.1F, 0F, -0.4F); // Box 104
		gunModel[82].setRotationPoint(3F, -13.35F, 0.2F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, -0.4F, 0.1F, -0.5F, -0.4F, 0.1F, -0.5F, -0.4F, 0.5F, 0F, -0.4F, 0.1F, 0F, -0.4F, 1.1F, 0F, -0.4F, 1.1F, 0F, -0.4F, 0.1F, 0F, -0.4F); // Box 105
		gunModel[83].setRotationPoint(3F, -13.35F, -1.2F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 106
		gunModel[84].setRotationPoint(46F, -6F, -0.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 107
		gunModel[85].setRotationPoint(46.5F, -5.25F, -1.5F);

		gunModel[86].addShapeBox(-0.45F, -0.25F, 0F, 1, 20, 1, 0F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F); // Box 108
		gunModel[86].setRotationPoint(47F, -4.75F, -1.5F);
		gunModel[86].rotateAngleX = -0.12217305F;
		gunModel[86].rotateAngleZ = -1.48352986F;

		gunModel[87].addShapeBox(-0.45F, -0.25F, -1F, 1, 20, 1, 0F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F); // Box 109
		gunModel[87].setRotationPoint(47F, -4.75F, 1.5F);
		gunModel[87].rotateAngleX = 0.12217305F;
		gunModel[87].rotateAngleZ = -1.48352986F;

		gunModel[88].addShapeBox(-1F, 19.3F, -1F, 3, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -1.1F, -0.2F, 0F, -1.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 110
		gunModel[88].setRotationPoint(47F, -4.75F, 1.5F);
		gunModel[88].rotateAngleX = 0.12217305F;
		gunModel[88].rotateAngleZ = -1.48352986F;

		gunModel[89].addShapeBox(-1F, 19.3F, 0F, 3, 1, 1, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -1.1F, -0.2F, 0F, -1.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 111
		gunModel[89].setRotationPoint(47F, -4.75F, -1.5F);
		gunModel[89].rotateAngleX = -0.12217305F;
		gunModel[89].rotateAngleZ = -1.48352986F;

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F); // Box 112
		gunModel[90].setRotationPoint(9F, -12.35F, -0.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.8F, -0.35F, -0.2F, 0.8F, -0.35F, -0.2F, 0.8F, -0.35F, -0.2F, 0.8F, -0.35F); // Box 91
		gunModel[91].setRotationPoint(52.5F, -12.8F, -0.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 92
		gunModel[92].setRotationPoint(52.5F, -12.4F, -0.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.6F, -0.7F, 0F, 0.6F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.7F, 0F, 0.5F, -0.7F); // Box 94
		gunModel[93].setRotationPoint(52.5F, -12.9F, -0.9F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.6F, -0.7F, 0F, 0.6F, -0.7F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, -0.7F, 0F, 0.5F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		gunModel[94].setRotationPoint(52.5F, -12.9F, -0.1F);

		gunModel[95].addShapeBox(-0.45F, 19.2F, 0F, 1, 2, 1, 0F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 117
		gunModel[95].setRotationPoint(47F, -4.75F, -1.5F);
		gunModel[95].rotateAngleX = -0.12217305F;
		gunModel[95].rotateAngleZ = -1.48352986F;

		gunModel[96].addShapeBox(-0.45F, 19.2F, -1F, 1, 2, 1, 0F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 118
		gunModel[96].setRotationPoint(47F, -4.75F, 1.5F);
		gunModel[96].rotateAngleX = 0.12217305F;
		gunModel[96].rotateAngleZ = -1.48352986F;

		gunModel[97].addShapeBox(0F, 0F, 0F, 31, 1, 3, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F); // Box 120
		gunModel[97].setRotationPoint(-1F, -9F, -1.5F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, 0F); // Box 121
		gunModel[98].setRotationPoint(-4F, -10F, 0.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		gunModel[99].setRotationPoint(-9F, -6F, 0.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 123
		gunModel[100].setRotationPoint(-7F, -5F, 0.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F); // Box 124
		gunModel[101].setRotationPoint(46.5F, -5.25F, -1.5F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F); // Box 125
		gunModel[102].setRotationPoint(46F, -9F, -2F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F); // Box 126
		gunModel[103].setRotationPoint(46F, -8.5F, -2F);


		ammoModel = new ModelRendererTurbo[10];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		ammoModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 5
		ammoModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 188
		ammoModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 189
		ammoModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 190
		ammoModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 191
		ammoModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 192
		ammoModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 163
		ammoModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 170
		ammoModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 171

		ammoModel[0].addShapeBox(0.2F, -3.25F, -9F, 2, 8, 18, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 4
		ammoModel[0].setRotationPoint(21F, -9.85F, 0F);
		ammoModel[0].rotateAngleZ = 1.57079633F;

		ammoModel[1].addShapeBox(0.2F, -8.25F, -6.5F, 2, 1, 13, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		ammoModel[1].setRotationPoint(21F, -9.85F, 0F);
		ammoModel[1].rotateAngleZ = 1.57079633F;

		ammoModel[2].addShapeBox(0.2F, -7.25F, -8.5F, 2, 2, 17, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		ammoModel[2].setRotationPoint(21F, -9.85F, 0F);
		ammoModel[2].rotateAngleZ = 1.57079633F;

		ammoModel[3].addShapeBox(0.2F, -5.25F, -8.5F, 2, 2, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 189
		ammoModel[3].setRotationPoint(21F, -9.85F, 0F);
		ammoModel[3].rotateAngleZ = 1.57079633F;

		ammoModel[4].addShapeBox(0.2F, 4.75F, -8.5F, 2, 2, 17, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		ammoModel[4].setRotationPoint(21F, -9.85F, 0F);
		ammoModel[4].rotateAngleZ = 1.57079633F;

		ammoModel[5].addShapeBox(0.2F, 6.75F, -8.5F, 2, 2, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 191
		ammoModel[5].setRotationPoint(21F, -9.85F, 0F);
		ammoModel[5].rotateAngleZ = 1.57079633F;

		ammoModel[6].addShapeBox(0.2F, 8.75F, -6.5F, 2, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 192
		ammoModel[6].setRotationPoint(21F, -9.85F, 0F);
		ammoModel[6].rotateAngleZ = 1.57079633F;

		ammoModel[7].addShapeBox(-0.25F, -2F, -4F, 2, 5, 8, 0F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F); // Box 163
		ammoModel[7].setRotationPoint(21F, -10.6F, 0F);
		ammoModel[7].rotateAngleZ = 1.57079633F;

		ammoModel[8].addShapeBox(-0.25F, 0F, -2F, 2, 1, 4, 0F, 0.1F, 0.16F, 0.2F, 0.1F, 0.16F, 0.2F, 0.1F, 0.16F, 0.2F, 0.1F, 0.16F, 0.2F, 0.1F, 0.16F, 0.2F, 0.1F, 0.16F, 0.2F, 0.1F, 0.16F, 0.2F, 0.1F, 0.16F, 0.2F); // Box 170
		ammoModel[8].setRotationPoint(21F, -10.6F, 0F);
		ammoModel[8].rotateAngleZ = 1.57079633F;

		ammoModel[9].addShapeBox(-0.25F, 0F, -4.4F, 2, 1, 9, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 171
		ammoModel[9].setRotationPoint(21F, -10.6F, 0F);
		ammoModel[9].rotateAngleZ = 1.57079633F;

	
		this.modelScale = 0.35F;

		translateAll = new Vector3f(0F, -5.65F, 0.0F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.TOP_RIFLE;
	    
		hasFlash = false;
	    
	    leftArmPos = new Vector3f(0.2F, -0.5F, 0.02F);
	    leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.10F, -0.52F, 0.02F);
	    leftArmReloadRot = new Vector3f(65.0F, 12.0F, -55.0F);
	    
	    rightArmPos = new Vector3f(0.28F, -0.7F, 0.0F);
	    rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    rightArmReloadPos = new Vector3f(0.65F, -0.5F, 0.1F);
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