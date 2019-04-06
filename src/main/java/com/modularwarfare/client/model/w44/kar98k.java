//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.04.2017 - 16:40:49
// Last changed on: 22.04.2017 - 16:40:49

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class kar98k extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public kar98k() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[99];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 81
		gunModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 8
		gunModel[6] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 12
		gunModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 13
		gunModel[8] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 14
		gunModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
		gunModel[10] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 16
		gunModel[11] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 23
		gunModel[12] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 25
		gunModel[13] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 26
		gunModel[14] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 27
		gunModel[15] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 28
		gunModel[16] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 29
		gunModel[17] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 30
		gunModel[18] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 31
		gunModel[19] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 32
		gunModel[20] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 33
		gunModel[21] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 34
		gunModel[22] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 35
		gunModel[23] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 36
		gunModel[24] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 37
		gunModel[25] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 38
		gunModel[26] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 40
		gunModel[27] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 42
		gunModel[28] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 43
		gunModel[29] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 44
		gunModel[30] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 46
		gunModel[31] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 48
		gunModel[32] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 49
		gunModel[33] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 50
		gunModel[34] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 51
		gunModel[35] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 53
		gunModel[36] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 54
		gunModel[37] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 55
		gunModel[38] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 56
		gunModel[39] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 58
		gunModel[40] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 60
		gunModel[41] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 61
		gunModel[42] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 62
		gunModel[43] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 64
		gunModel[44] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 65
		gunModel[45] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 66
		gunModel[46] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 67
		gunModel[47] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 68
		gunModel[48] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 69
		gunModel[49] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 70
		gunModel[50] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 71
		gunModel[51] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 72
		gunModel[52] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 73
		gunModel[53] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 77
		gunModel[54] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 78
		gunModel[55] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 80
		gunModel[56] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 81
		gunModel[57] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 82
		gunModel[58] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 83
		gunModel[59] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 85
		gunModel[60] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 86
		gunModel[61] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 87
		gunModel[62] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 88
		gunModel[63] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 89
		gunModel[64] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 90
		gunModel[65] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 91
		gunModel[66] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 93
		gunModel[67] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 94
		gunModel[68] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 95
		gunModel[69] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 96
		gunModel[70] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 97
		gunModel[71] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 98
		gunModel[72] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 99
		gunModel[73] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 100
		gunModel[74] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 101
		gunModel[75] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 102
		gunModel[76] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 103
		gunModel[77] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 104
		gunModel[78] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 105
		gunModel[79] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 106
		gunModel[80] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 108
		gunModel[81] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 109
		gunModel[82] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 110
		gunModel[83] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 111
		gunModel[84] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 112
		gunModel[85] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 113
		gunModel[86] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 107
		gunModel[87] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 108
		gunModel[88] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 109
		gunModel[89] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 110
		gunModel[90] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 140
		gunModel[91] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 141
		gunModel[92] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 142
		gunModel[93] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 143
		gunModel[94] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 144
		gunModel[95] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 145
		gunModel[96] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 158
		gunModel[97] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 159
		gunModel[98] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 160

		gunModel[0].addShapeBox(0F, 0F, 0F, 43, 5, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[0].setRotationPoint(18F, -13F, -1.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 43, 5, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 1
		gunModel[1].setRotationPoint(18F, -13F, 0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 43, 5, 1, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(18F, -13F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[3].setRotationPoint(42F, -15F, 0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[4].setRotationPoint(42F, -15F, -1.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[5].setRotationPoint(42F, -15F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 12
		gunModel[6].setRotationPoint(10F, -13F, 0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0.5F, 0F, -0.7F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[7].setRotationPoint(3F, -13F, -1.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[8].setRotationPoint(10F, -13F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[9].setRotationPoint(3F, -13F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[10].setRotationPoint(10F, -8F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[11].setRotationPoint(61F, -15F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 25
		gunModel[12].setRotationPoint(61F, -15F, 0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[13].setRotationPoint(61F, -15F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 27
		gunModel[14].setRotationPoint(61F, -11F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 28
		gunModel[15].setRotationPoint(61F, -11F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F); // Box 29
		gunModel[16].setRotationPoint(61F, -11F, 0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 30
		gunModel[17].setRotationPoint(61F, -13F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[18].setRotationPoint(62F, -14.8F, 0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[19].setRotationPoint(62F, -14.8F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[20].setRotationPoint(62F, -14.8F, -1.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 34
		gunModel[21].setRotationPoint(62F, -12.2F, 0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[22].setRotationPoint(62F, -12.2F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[23].setRotationPoint(62F, -12.2F, -1.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 37
		gunModel[24].setRotationPoint(62F, -13F, -1.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, -2F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 38
		gunModel[25].setRotationPoint(-4F, -13F, -1.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 40
		gunModel[26].setRotationPoint(-4F, -13F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 42
		gunModel[27].setRotationPoint(3F, -13F, 0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[28].setRotationPoint(-6F, -10F, -1.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[29].setRotationPoint(-6F, -11F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 46
		gunModel[30].setRotationPoint(-6F, -10F, 0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 48
		gunModel[31].setRotationPoint(-9F, -10F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 49
		gunModel[32].setRotationPoint(-9F, -9F, -1.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 50
		gunModel[33].setRotationPoint(-9F, -9F, 0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 51
		gunModel[34].setRotationPoint(-4F, -13F, 0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 53
		gunModel[35].setRotationPoint(-14F, -10F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 54
		gunModel[36].setRotationPoint(-14F, -9F, -1.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[37].setRotationPoint(-14F, -9F, 0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 21, 12, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 56
		gunModel[38].setRotationPoint(-35F, -10F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 21, 11, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 58
		gunModel[39].setRotationPoint(-35F, -9F, -1.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 21, 11, 1, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 1F, 0F); // Box 60
		gunModel[40].setRotationPoint(-35F, -9F, 0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F, 0F, -0.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.9F, 0.1F, -2F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -2F, 0.1F, 0.1F); // Box 61
		gunModel[41].setRotationPoint(-39F, -9F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F, 0F, -2F, 0.1F, 0F, -1F, 0.1F, 0F, 0.1F, -0.1F, 0F, -0.9F, -0.1F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0.1F, -0.1F, -2F, 0.1F, -0.1F); // Box 62
		gunModel[42].setRotationPoint(-39F, -9F, -1.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[43].setRotationPoint(19F, -15F, -1F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[44].setRotationPoint(19F, -16F, -1F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[45].setRotationPoint(25F, -15F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		gunModel[46].setRotationPoint(25F, -15F, -1.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68
		gunModel[47].setRotationPoint(25F, -15F, 0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[48].setRotationPoint(31F, -15F, -1F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		gunModel[49].setRotationPoint(31F, -16F, -1F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[50].setRotationPoint(4.5F, -15F, -1.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		gunModel[51].setRotationPoint(4.5F, -15F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 9.5F, 0F, 0F, 9.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 9.5F, 0F, 0F, 9.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 73
		gunModel[52].setRotationPoint(4.5F, -15F, 0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		gunModel[53].setRotationPoint(10F, -14F, 0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		gunModel[54].setRotationPoint(41F, -14F, 0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		gunModel[55].setRotationPoint(21F, -14F, -1.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[56].setRotationPoint(41F, -14F, -1.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		gunModel[57].setRotationPoint(20F, -14F, -1.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		gunModel[58].setRotationPoint(4F, -14F, 0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.9F, 0F); // Box 85
		gunModel[59].setRotationPoint(4F, -14F, -1.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.7F, 0F); // Box 86
		gunModel[60].setRotationPoint(5F, -14F, -1.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.3F, 0F); // Box 87
		gunModel[61].setRotationPoint(8F, -14F, -1.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0.9F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.9F, 0F); // Box 88
		gunModel[62].setRotationPoint(4F, -14F, 0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.7F, 0F); // Box 89
		gunModel[63].setRotationPoint(5F, -14F, 0.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.3F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F); // Box 90
		gunModel[64].setRotationPoint(8F, -14F, 0.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -0.3F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		gunModel[65].setRotationPoint(8F, -13F, -1.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		gunModel[66].setRotationPoint(5F, -12F, -1.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.7F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -1F, 0.35F, 0F, -1F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		gunModel[67].setRotationPoint(5F, -13F, -1.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		gunModel[68].setRotationPoint(72F, -14F, -1.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		gunModel[69].setRotationPoint(72F, -15F, -1.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 97
		gunModel[70].setRotationPoint(72F, -11F, -1.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		gunModel[71].setRotationPoint(75F, -15F, -1.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 99
		gunModel[72].setRotationPoint(75F, -11F, -1.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		gunModel[73].setRotationPoint(75F, -14F, -1.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		gunModel[74].setRotationPoint(74F, -14F, -1F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 102
		gunModel[75].setRotationPoint(67F, -14F, -0.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gunModel[76].setRotationPoint(77F, -13F, -0.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 104
		gunModel[77].setRotationPoint(82F, -12F, -0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 105
		gunModel[78].setRotationPoint(87F, -12F, -0.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F); // Box 106
		gunModel[79].setRotationPoint(87F, -14F, -0.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 108
		gunModel[80].setRotationPoint(6F, -6F, -0.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 109
		gunModel[81].setRotationPoint(-1F, -6F, -0.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[82].setRotationPoint(-1F, -8F, -0.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[83].setRotationPoint(6F, -8F, -0.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[84].setRotationPoint(0.5F, -4F, -0.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.15F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 113
		gunModel[85].setRotationPoint(1.5F, -7.5F, -0.5F);
		gunModel[85].rotateAngleZ = 0.26179939F;

		gunModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 107
		gunModel[86].setRotationPoint(-31F, -4F, -1.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1F, 0F, 0.15F, -1F, 0F, 0.15F, -1F, 0F, 0.15F, -1F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 108
		gunModel[87].setRotationPoint(-31F, -5F, -1.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -1F, 0F, 0.15F, -1F, 0F, 0.15F, -1F, 0F, 0.15F, -1F, 0F, 0.15F); // Box 109
		gunModel[88].setRotationPoint(-31F, -3F, -1.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, 1.15F); // Box 110
		gunModel[89].setRotationPoint(31F, -12F, -0.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F); // Box 140
		gunModel[90].setRotationPoint(62F, -12.75F, -1.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F); // Box 141
		gunModel[91].setRotationPoint(88.5F, -14F, -0.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F); // Box 142
		gunModel[92].setRotationPoint(90F, -14F, -0.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F); // Box 143
		gunModel[93].setRotationPoint(-24F, -6F, -2F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F, 0F, -0.9F, -0.1F, 0F, 0.1F, -0.1F, 0F, -1F, 0.1F, 0F, -2F, 0.1F, -2F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -2F, 0F, -2F, -2F, 0F); // Box 144
		gunModel[94].setRotationPoint(-39F, -9F, 0.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.15F, 0.15F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0.15F, 0.15F, -0.3F); // Box 145
		gunModel[95].setRotationPoint(-22.7F, -6F, -2F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 158
		gunModel[96].setRotationPoint(77F, -12.5F, -0.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F); // Box 159
		gunModel[97].setRotationPoint(19.5F, -15F, -1F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F); // Box 160
		gunModel[98].setRotationPoint(19.5F, -14.25F, -1F);


		defaultScopeModel = new ModelRendererTurbo[21];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 91
		defaultScopeModel[1] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 92
		defaultScopeModel[2] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 94
		defaultScopeModel[3] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 95
		defaultScopeModel[4] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 96
		defaultScopeModel[5] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 97
		defaultScopeModel[6] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 98
		defaultScopeModel[7] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 99
		defaultScopeModel[8] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 100
		defaultScopeModel[9] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 101
		defaultScopeModel[10] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 103
		defaultScopeModel[11] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 104
		defaultScopeModel[12] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 105
		defaultScopeModel[13] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 106
		defaultScopeModel[14] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 146
		defaultScopeModel[15] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 147
		defaultScopeModel[16] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 148
		defaultScopeModel[17] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 150
		defaultScopeModel[18] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 151
		defaultScopeModel[19] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 152
		defaultScopeModel[20] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 153

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.8F, -0.35F, -0.2F, 0.8F, -0.35F, -0.2F, 0.8F, -0.35F, -0.2F, 0.8F, -0.35F); // Box 91
		defaultScopeModel[0].setRotationPoint(88.5F, -17F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		defaultScopeModel[1].setRotationPoint(88.5F, -17.1F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 94
		defaultScopeModel[2].setRotationPoint(88.5F, -17.3F, -0.7F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		defaultScopeModel[3].setRotationPoint(88.5F, -18.7F, -0.5F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		defaultScopeModel[4].setRotationPoint(88.5F, -17.3F, -0.3F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 97
		defaultScopeModel[5].setRotationPoint(34F, -16F, -1F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F); // Box 98
		defaultScopeModel[6].setRotationPoint(35F, -15.8F, -1F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F); // Box 99
		defaultScopeModel[7].setRotationPoint(39F, -15.8F, -1F);

		defaultScopeModel[8].addShapeBox(-6F, -0.7F, 0F, 6, 1, 2, 0F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F); // Box 100
		defaultScopeModel[8].setRotationPoint(40.5F, -15.7F, -1F);
		defaultScopeModel[8].rotateAngleZ = -0.06981317F;

		defaultScopeModel[9].addShapeBox(-0.5F, -0.7F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F); // Box 101
		defaultScopeModel[9].setRotationPoint(40.5F, -15.7F, -1F);
		defaultScopeModel[9].rotateAngleZ = -0.06981317F;

		defaultScopeModel[10].addShapeBox(-6F, -1.1F, -0.1F, 2, 1, 1, 0F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 103
		defaultScopeModel[10].setRotationPoint(40.5F, -15.7F, -0.9F);
		defaultScopeModel[10].rotateAngleZ = -0.06981317F;

		defaultScopeModel[11].addShapeBox(-6F, -1.1F, 0.1F, 2, 1, 1, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.25F, -0.2F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 104
		defaultScopeModel[11].setRotationPoint(40.5F, -15.7F, -0.1F);
		defaultScopeModel[11].rotateAngleZ = -0.06981317F;

		defaultScopeModel[12].addShapeBox(-6F, -0.9F, 0F, 6, 1, 2, 0F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F); // Box 105
		defaultScopeModel[12].setRotationPoint(40.5F, -15.7F, -1F);
		defaultScopeModel[12].rotateAngleZ = -0.06981317F;

		defaultScopeModel[13].addShapeBox(-6F, -0.8F, 0F, 6, 1, 2, 0F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F); // Box 106
		defaultScopeModel[13].setRotationPoint(40.5F, -15.7F, -1F);
		defaultScopeModel[13].rotateAngleZ = -0.06981317F;

		defaultScopeModel[14].addShapeBox(-5.5F, -0.95F, 0F, 1, 1, 2, 0F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F); // Box 146
		defaultScopeModel[14].setRotationPoint(40.5F, -15.7F, -1F);
		defaultScopeModel[14].rotateAngleZ = -0.06981317F;

		defaultScopeModel[15].addShapeBox(-3.5F, -0.95F, 0F, 1, 1, 2, 0F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F); // Box 147
		defaultScopeModel[15].setRotationPoint(40.5F, -15.7F, -1F);
		defaultScopeModel[15].rotateAngleZ = -0.06981317F;

		defaultScopeModel[16].addShapeBox(-1.5F, -0.95F, 0F, 1, 1, 2, 0F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F); // Box 148
		defaultScopeModel[16].setRotationPoint(40.5F, -15.7F, -1F);
		defaultScopeModel[16].rotateAngleZ = -0.06981317F;

		defaultScopeModel[17].addShapeBox(-2.5F, -0.95F, 0F, 1, 1, 2, 0F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F); // Box 150
		defaultScopeModel[17].setRotationPoint(40.5F, -15.7F, -1F);
		defaultScopeModel[17].rotateAngleZ = -0.06981317F;

		defaultScopeModel[18].addShapeBox(-4.5F, -0.95F, 0F, 1, 1, 2, 0F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F); // Box 151
		defaultScopeModel[18].setRotationPoint(40.5F, -15.7F, -1F);
		defaultScopeModel[18].rotateAngleZ = -0.06981317F;

		defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F); // Box 152
		defaultScopeModel[19].setRotationPoint(39F, -15.8F, -1F);

		defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F); // Box 153
		defaultScopeModel[20].setRotationPoint(35F, -15.8F, -1F);


		ammoModel = new ModelRendererTurbo[20];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 120
		ammoModel[1] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 121
		ammoModel[2] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 122
		ammoModel[3] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 123
		ammoModel[4] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 124
		ammoModel[5] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 125
		ammoModel[6] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 126
		ammoModel[7] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 127
		ammoModel[8] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 128
		ammoModel[9] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 129
		ammoModel[10] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 130
		ammoModel[11] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 131
		ammoModel[12] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 132
		ammoModel[13] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 133
		ammoModel[14] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 134
		ammoModel[15] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 135
		ammoModel[16] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 136
		ammoModel[17] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 137
		ammoModel[18] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 138
		ammoModel[19] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 139

		ammoModel[0].addShapeBox(-15F, -8.05F, -0.5F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 120
		ammoModel[0].setRotationPoint(27F, -6F, 0F);

		ammoModel[1].addShapeBox(-12F, -8.05F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 121
		ammoModel[1].setRotationPoint(27F, -6F, 0F);

		ammoModel[2].addShapeBox(-15.6F, -8.05F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 122
		ammoModel[2].setRotationPoint(27F, -6F, 0F);

		ammoModel[3].addShapeBox(-16.3F, -8.05F, -0.5F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 123
		ammoModel[3].setRotationPoint(27F, -6F, 0F);

		ammoModel[4].addShapeBox(-16.3F, -7.05F, -0.5F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 124
		ammoModel[4].setRotationPoint(27F, -6F, 0F);

		ammoModel[5].addShapeBox(-15.6F, -7.05F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 125
		ammoModel[5].setRotationPoint(27F, -6F, 0F);

		ammoModel[6].addShapeBox(-15F, -7.05F, -0.5F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 126
		ammoModel[6].setRotationPoint(27F, -6F, 0F);

		ammoModel[7].addShapeBox(-12F, -7.05F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 127
		ammoModel[7].setRotationPoint(27F, -6F, 0F);

		ammoModel[8].addShapeBox(-16.3F, -6.05F, -0.5F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 128
		ammoModel[8].setRotationPoint(27F, -6F, 0F);

		ammoModel[9].addShapeBox(-15.6F, -6.05F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 129
		ammoModel[9].setRotationPoint(27F, -6F, 0F);

		ammoModel[10].addShapeBox(-15F, -6.05F, -0.5F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 130
		ammoModel[10].setRotationPoint(27F, -6F, 0F);

		ammoModel[11].addShapeBox(-12F, -6.05F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 131
		ammoModel[11].setRotationPoint(27F, -6F, 0F);

		ammoModel[12].addShapeBox(-16.3F, -5.05F, -0.5F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 132
		ammoModel[12].setRotationPoint(27F, -6F, 0F);

		ammoModel[13].addShapeBox(-15.6F, -5.05F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 133
		ammoModel[13].setRotationPoint(27F, -6F, 0F);

		ammoModel[14].addShapeBox(-15F, -5.05F, -0.5F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 134
		ammoModel[14].setRotationPoint(27F, -6F, 0F);

		ammoModel[15].addShapeBox(-12F, -5.05F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 135
		ammoModel[15].setRotationPoint(27F, -6F, 0F);

		ammoModel[16].addShapeBox(-16.3F, -4.05F, -0.5F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 136
		ammoModel[16].setRotationPoint(27F, -6F, 0F);

		ammoModel[17].addShapeBox(-15.6F, -4.05F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 137
		ammoModel[17].setRotationPoint(27F, -6F, 0F);

		ammoModel[18].addShapeBox(-15F, -4.05F, -0.5F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 138
		ammoModel[18].setRotationPoint(27F, -6F, 0F);

		ammoModel[19].addShapeBox(-12F, -4.05F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 139
		ammoModel[19].setRotationPoint(27F, -6F, 0F);


		pumpModel = new ModelRendererTurbo[11];
		pumpModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 74
		pumpModel[1] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 75
		pumpModel[2] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 76
		pumpModel[3] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 114
		pumpModel[4] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 118
		pumpModel[5] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 119
		pumpModel[6] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 154
		pumpModel[7] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 155
		pumpModel[8] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 156
		pumpModel[9] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 157
		pumpModel[10] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 153

		pumpModel[0].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 74
		pumpModel[0].setRotationPoint(1.5F, -14.55F, -1F);

		pumpModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 75
		pumpModel[1].setRotationPoint(0.5F, -14.55F, -1F);

		pumpModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F); // Box 76
		pumpModel[2].setRotationPoint(-1F, -14.55F, -1F);

		pumpModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F); // Box 114
		pumpModel[3].setRotationPoint(2F, -14.55F, -1.5F);

		pumpModel[4].addShapeBox(0F, -1F, -2F, 2, 2, 2, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F); // Box 118
		pumpModel[4].setRotationPoint(2F, -13.65F, -1.49F);
		pumpModel[4].rotateAngleX = 0.73303829F;

		pumpModel[5].addShapeBox(0F, -1F, -3F, 2, 2, 2, 0F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F); // Box 119
		pumpModel[5].setRotationPoint(2F, -13.65F, -1.49F);
		pumpModel[5].rotateAngleX = 0.73303829F;

		pumpModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F); // Box 154
		pumpModel[6].setRotationPoint(-1F, -13.55F, -1F);

		pumpModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.25F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, -0.25F, -0.15F, -0.4F, -0.25F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, -0.25F, -0.15F, -0.4F); // Box 155
		pumpModel[7].setRotationPoint(-0.799999999999997F, -14.05F, -1F);

		pumpModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, -0.25F, -0.15F, -0.35F, -0.25F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, -0.25F, -0.15F, -0.35F); // Box 156
		pumpModel[8].setRotationPoint(-1F, -14.05F, -1F);

		pumpModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, -0.25F, -0.15F, -0.35F, -0.25F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, -0.25F, -0.15F, -0.35F); // Box 157
		pumpModel[9].setRotationPoint(-1F, -14.05F, 0F);

		pumpModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F); // Box 153
		pumpModel[10].setRotationPoint(2F, -14.55F, 0.5F);
		pumpModel[10].rotateAngleX = 0.2268928F;

		this.modelScale = 0.25F;

//		scopeAttachPoint = new Vector3f(15 /16F, 48F /16F, 0F /16F);
		translateAll = new Vector3f(0F, -8.7F, -0.15F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.05F, 0F);//forward/up/? 

	    actionArm = EnumArm.Right;
	    actionType = EnumAction.Bolt;
		rotationHelper = new Vector3f(0, 0.85F, 0);
		boltRotationPoint = new Vector3f(0, 0.85F, 0);
		boltRotation = -45F;
		
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
        
        leftArmPos = new Vector3f(0.450F, -0.62F, 0.07F);
        leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.0F, -0.70F, 0.02F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);
 
        rightArmPos = new Vector3f(0.41F, -0.62F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.27F, -0.59F, 0.04F);
        rightArmReloadRot = new Vector3f(15F, 15F, -90.0F);
        rightArmChargePos = new Vector3f(0.4F, -0.39F, 0.13F);
        rightArmChargeRot = new Vector3f(-0.0F, 4.95F, -70.0F);
        
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