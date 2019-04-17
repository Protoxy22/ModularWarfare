//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.05.2017 - 22:42:01
// Last changed on: 06.05.2017 - 22:42:01

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class winchestermodel70 extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public winchestermodel70() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[80];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 81
		gunModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 12
		gunModel[6] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 13
		gunModel[7] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 14
		gunModel[8] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 15
		gunModel[9] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 16
		gunModel[10] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 38
		gunModel[11] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 40
		gunModel[12] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 42
		gunModel[13] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 43
		gunModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 44
		gunModel[15] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 46
		gunModel[16] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 48
		gunModel[17] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 49
		gunModel[18] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 50
		gunModel[19] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 51
		gunModel[20] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 53
		gunModel[21] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 54
		gunModel[22] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 55
		gunModel[23] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 56
		gunModel[24] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 58
		gunModel[25] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 60
		gunModel[26] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 61
		gunModel[27] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 62
		gunModel[28] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 64
		gunModel[29] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 65
		gunModel[30] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 66
		gunModel[31] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 67
		gunModel[32] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 68
		gunModel[33] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 69
		gunModel[34] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 70
		gunModel[35] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 71
		gunModel[36] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 72
		gunModel[37] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 73
		gunModel[38] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 77
		gunModel[39] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 78
		gunModel[40] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 80
		gunModel[41] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 81
		gunModel[42] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 82
		gunModel[43] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 83
		gunModel[44] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 85
		gunModel[45] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 86
		gunModel[46] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 87
		gunModel[47] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 88
		gunModel[48] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 89
		gunModel[49] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 90
		gunModel[50] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 91
		gunModel[51] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 93
		gunModel[52] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 94
		gunModel[53] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 102
		gunModel[54] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 106
		gunModel[55] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 108
		gunModel[56] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 109
		gunModel[57] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 110
		gunModel[58] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 111
		gunModel[59] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 112
		gunModel[60] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 113
		gunModel[61] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 141
		gunModel[62] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 142
		gunModel[63] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 144
		gunModel[64] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 160
		gunModel[65] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 150
		gunModel[66] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 151
		gunModel[67] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 152
		gunModel[68] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 153
		gunModel[69] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 154
		gunModel[70] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 156
		gunModel[71] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 157
		gunModel[72] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 158
		gunModel[73] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 160
		gunModel[74] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 161
		gunModel[75] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 162
		gunModel[76] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 164
		gunModel[77] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 166
		gunModel[78] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 167
		gunModel[79] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 168

		gunModel[0].addShapeBox(0F, 0F, 0F, 41, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[0].setRotationPoint(16F, -14F, -1.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 41, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 1
		gunModel[1].setRotationPoint(16F, -14F, 0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 41, 5, 1, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(16F, -14F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[3].setRotationPoint(40F, -15F, 0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[4].setRotationPoint(40F, -15F, -1.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 12
		gunModel[5].setRotationPoint(8F, -14F, 0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[6].setRotationPoint(1F, -14F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[7].setRotationPoint(8F, -14F, -1.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[8].setRotationPoint(1F, -14F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[9].setRotationPoint(8F, -9F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 38
		gunModel[10].setRotationPoint(-3F, -14F, -1.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 40
		gunModel[11].setRotationPoint(-3F, -14F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 42
		gunModel[12].setRotationPoint(1F, -14F, 0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[13].setRotationPoint(-5F, -11F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[14].setRotationPoint(-5F, -12F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 46
		gunModel[15].setRotationPoint(-5F, -11F, 0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 48
		gunModel[16].setRotationPoint(-7F, -11F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 49
		gunModel[17].setRotationPoint(-7F, -10F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 50
		gunModel[18].setRotationPoint(-7F, -10F, 0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 51
		gunModel[19].setRotationPoint(-3F, -14F, 0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 53
		gunModel[20].setRotationPoint(-14F, -9F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 54
		gunModel[21].setRotationPoint(-14F, -8F, -1.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[22].setRotationPoint(-14F, -8F, 0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 21, 12, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 56
		gunModel[23].setRotationPoint(-35F, -9F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 21, 11, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 58
		gunModel[24].setRotationPoint(-35F, -8F, -1.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 21, 11, 1, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 1F, 0F); // Box 60
		gunModel[25].setRotationPoint(-35F, -8F, 0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F, -2F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -2F, 0.1F, 0.1F, -2F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -2F, 0.1F, 0.1F); // Box 61
		gunModel[26].setRotationPoint(-41F, -8F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F, -2F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, 0.1F, -0.1F, -2F, 0.1F, -0.1F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0.1F, -0.1F, -2F, 0.1F, -0.1F); // Box 62
		gunModel[27].setRotationPoint(-41F, -8F, -1.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[28].setRotationPoint(7.5F, -16F, -1F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[29].setRotationPoint(7.5F, -17F, -1F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[30].setRotationPoint(21.5F, -16F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		gunModel[31].setRotationPoint(21.5F, -16F, -1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68
		gunModel[32].setRotationPoint(21.5F, -16F, 0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[33].setRotationPoint(18.5F, -16F, -1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		gunModel[34].setRotationPoint(18.5F, -17F, -1F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[35].setRotationPoint(2.5F, -16F, -1.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		gunModel[36].setRotationPoint(2.5F, -16F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 73
		gunModel[37].setRotationPoint(2.5F, -16F, 0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		gunModel[38].setRotationPoint(8F, -15F, 0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		gunModel[39].setRotationPoint(39F, -15F, 0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		gunModel[40].setRotationPoint(20F, -15F, -1.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[41].setRotationPoint(39F, -15F, -1.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		gunModel[42].setRotationPoint(19F, -15F, -1.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		gunModel[43].setRotationPoint(2F, -15F, 0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.9F, 0F); // Box 85
		gunModel[44].setRotationPoint(2F, -15F, -1.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.7F, 0F); // Box 86
		gunModel[45].setRotationPoint(3F, -15F, -1.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.3F, 0F); // Box 87
		gunModel[46].setRotationPoint(6F, -15F, -1.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0.9F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.9F, 0F); // Box 88
		gunModel[47].setRotationPoint(2F, -15F, 0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.7F, 0F); // Box 89
		gunModel[48].setRotationPoint(3F, -15F, 0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.3F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F); // Box 90
		gunModel[49].setRotationPoint(6F, -15F, 0.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		gunModel[50].setRotationPoint(6F, -14F, -1.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		gunModel[51].setRotationPoint(3F, -13F, -1.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		gunModel[52].setRotationPoint(3F, -14F, -1.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 102
		gunModel[53].setRotationPoint(29.5F, -15.5F, -0.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F); // Box 106
		gunModel[54].setRotationPoint(85.5F, -15.5F, -0.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 108
		gunModel[55].setRotationPoint(7F, -7F, -0.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 109
		gunModel[56].setRotationPoint(0F, -7F, -0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[57].setRotationPoint(0F, -9F, -0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[58].setRotationPoint(7F, -9F, -0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[59].setRotationPoint(1.5F, -5F, -0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.15F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 113
		gunModel[60].setRotationPoint(2.5F, -8.5F, -0.5F);
		gunModel[60].rotateAngleZ = 0.26179939F;

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F); // Box 141
		gunModel[61].setRotationPoint(87F, -15.5F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F); // Box 142
		gunModel[62].setRotationPoint(88.5F, -15.5F, -0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F, -2F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -1F, 0.1F, -2F, -1F, 0.1F, -2F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -2F, 0F, -2F, -2F, 0F); // Box 144
		gunModel[63].setRotationPoint(-41F, -8F, 0.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F); // Box 160
		gunModel[64].setRotationPoint(18.5F, -15.5F, -1F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 150
		gunModel[65].setRotationPoint(-8F, -9F, -1.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 151
		gunModel[66].setRotationPoint(-8F, -10F, -0.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 152
		gunModel[67].setRotationPoint(-8F, -9F, 0.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 153
		gunModel[68].setRotationPoint(-10F, -8F, 0.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 154
		gunModel[69].setRotationPoint(-10F, -9F, -0.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 156
		gunModel[70].setRotationPoint(-10F, -8F, -1.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 157
		gunModel[71].setRotationPoint(-13F, -8F, -1.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 158
		gunModel[72].setRotationPoint(-13F, -9F, -0.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 160
		gunModel[73].setRotationPoint(-13F, -8F, 0.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 161
		gunModel[74].setRotationPoint(57F, -14F, 0.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F); // Box 162
		gunModel[75].setRotationPoint(57F, -14F, -0.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		gunModel[76].setRotationPoint(57F, -15F, 0.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -2F, 0F); // Box 166
		gunModel[77].setRotationPoint(57F, -14F, -1.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		gunModel[78].setRotationPoint(57F, -15F, -1.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		gunModel[79].setRotationPoint(57F, -15F, -0.5F);


		defaultScopeModel = new ModelRendererTurbo[4];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 91
		defaultScopeModel[1] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 95
		defaultScopeModel[2] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 169
		defaultScopeModel[3] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 170

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -2.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -2.2F, 0.2F, -0.35F, -0.2F, 0.8F, -0.35F, -0.2F, 0.8F, -0.35F, -0.2F, 0.8F, -0.35F, -0.2F, 0.8F, -0.35F); // Box 91
		defaultScopeModel[0].setRotationPoint(85F, -17.25F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		defaultScopeModel[1].setRotationPoint(87F, -17.5F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 169
		defaultScopeModel[2].setRotationPoint(8.5F, -17F, -0.85F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 170
		defaultScopeModel[3].setRotationPoint(8.5F, -17F, -0.15F);


		ammoModel = new ModelRendererTurbo[20];
		ammoModel[0] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 120
		ammoModel[1] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 121
		ammoModel[2] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 122
		ammoModel[3] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 123
		ammoModel[4] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 124
		ammoModel[5] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 125
		ammoModel[6] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 126
		ammoModel[7] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 127
		ammoModel[8] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 128
		ammoModel[9] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 129
		ammoModel[10] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 130
		ammoModel[11] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 131
		ammoModel[12] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 132
		ammoModel[13] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 133
		ammoModel[14] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 134
		ammoModel[15] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 135
		ammoModel[16] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 136
		ammoModel[17] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 137
		ammoModel[18] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 138
		ammoModel[19] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 139

		ammoModel[0].addShapeBox(-15F, -7.05F, -0.5F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 120
		ammoModel[0].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[1].addShapeBox(-12F, -7.05F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 121
		ammoModel[1].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[2].addShapeBox(-15.6F, -7.05F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 122
		ammoModel[2].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[3].addShapeBox(-16.3F, -7.05F, -0.5F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 123
		ammoModel[3].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[4].addShapeBox(-16.3F, -6.05F, -0.5F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 124
		ammoModel[4].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[5].addShapeBox(-15.6F, -6.05F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 125
		ammoModel[5].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[6].addShapeBox(-15F, -6.05F, -0.5F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 126
		ammoModel[6].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[7].addShapeBox(-12F, -6.05F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 127
		ammoModel[7].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[8].addShapeBox(-16.3F, -5.05F, -0.5F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 128
		ammoModel[8].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[9].addShapeBox(-15.6F, -5.05F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 129
		ammoModel[9].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[10].addShapeBox(-15F, -5.05F, -0.5F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 130
		ammoModel[10].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[11].addShapeBox(-12F, -5.05F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 131
		ammoModel[11].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[12].addShapeBox(-16.3F, -4.05F, -0.5F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 132
		ammoModel[12].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[13].addShapeBox(-15.6F, -4.05F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 133
		ammoModel[13].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[14].addShapeBox(-15F, -4.05F, -0.5F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 134
		ammoModel[14].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[15].addShapeBox(-12F, -4.05F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 135
		ammoModel[15].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[16].addShapeBox(-16.3F, -3.05F, -0.5F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 136
		ammoModel[16].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[17].addShapeBox(-15.6F, -3.05F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 137
		ammoModel[17].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[18].addShapeBox(-15F, -3.05F, -0.5F, 3, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 138
		ammoModel[18].setRotationPoint(27.25F, -8F, 0F);

		ammoModel[19].addShapeBox(-12F, -3.05F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, 0F); // Box 139
		ammoModel[19].setRotationPoint(27.25F, -8F, 0F);


		pumpModel = new ModelRendererTurbo[5];
		pumpModel[0] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 74
		pumpModel[1] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 75
		pumpModel[2] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 114
		pumpModel[3] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 118
		pumpModel[4] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 119

		pumpModel[0].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 74
		pumpModel[0].setRotationPoint(0.5F, -15.55F, -1F);

		pumpModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 75
		pumpModel[1].setRotationPoint(-0.5F, -15.55F, -1F);

		pumpModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F); // Box 114
		pumpModel[2].setRotationPoint(0F, -15.55F, -1.5F);

		pumpModel[3].addShapeBox(0F, -1F, -3F, 2, 2, 3, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F); // Box 118
		pumpModel[3].setRotationPoint(0F, -14.65F, -1.49F);
		pumpModel[3].rotateAngleX = 0.73303829F;

		pumpModel[4].addShapeBox(0F, -1F, -4.5F, 2, 2, 2, 0F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F); // Box 119
		pumpModel[4].setRotationPoint(0F, -14.65F, -1.49F);
		pumpModel[4].rotateAngleX = 0.73303829F;

		this.modelScale = 0.25F;

//		scopeAttachPoint = new Vector3f(15 /16F, 48F /16F, 0F /16F);
		translateAll = new Vector3f(0F, -8.7F, -0.15F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.05F, 0F);//forward/up/? 

	    actionArm = EnumArm.Right;
	    actionType = EnumAction.Bolt;
		rotationHelper = new Vector3f(0, 0.9F, 0);
		boltRotationPoint = new Vector3f(0, 0.9F, 0);
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
        rightArmReloadPos = new Vector3f(0.41F, -0.62F, 0.0F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);
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