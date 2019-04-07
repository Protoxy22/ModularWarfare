//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.04.2017 - 20:58:17
// Last changed on: 24.04.2017 - 20:58:17

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class modell1915 extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public modell1915() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[92];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 81
		gunModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 8
		gunModel[6] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 12
		gunModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 13
		gunModel[8] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 14
		gunModel[9] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 15
		gunModel[10] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 16
		gunModel[11] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 23
		gunModel[12] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 25
		gunModel[13] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 26
		gunModel[14] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 27
		gunModel[15] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 28
		gunModel[16] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 29
		gunModel[17] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 30
		gunModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 38
		gunModel[19] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 40
		gunModel[20] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 42
		gunModel[21] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 43
		gunModel[22] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 44
		gunModel[23] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 46
		gunModel[24] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 48
		gunModel[25] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 49
		gunModel[26] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 50
		gunModel[27] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 51
		gunModel[28] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 56
		gunModel[29] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 58
		gunModel[30] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 60
		gunModel[31] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 61
		gunModel[32] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 62
		gunModel[33] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 64
		gunModel[34] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 65
		gunModel[35] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 66
		gunModel[36] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 67
		gunModel[37] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 68
		gunModel[38] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 69
		gunModel[39] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 70
		gunModel[40] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 71
		gunModel[41] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 72
		gunModel[42] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 73
		gunModel[43] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 77
		gunModel[44] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 78
		gunModel[45] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 80
		gunModel[46] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 81
		gunModel[47] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 82
		gunModel[48] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 91
		gunModel[49] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 93
		gunModel[50] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 94
		gunModel[51] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 98
		gunModel[52] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 99
		gunModel[53] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 100
		gunModel[54] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 101
		gunModel[55] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 102
		gunModel[56] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 103
		gunModel[57] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 104
		gunModel[58] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 105
		gunModel[59] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 108
		gunModel[60] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 109
		gunModel[61] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 110
		gunModel[62] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 111
		gunModel[63] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 112
		gunModel[64] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 113
		gunModel[65] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 141
		gunModel[66] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 142
		gunModel[67] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 144
		gunModel[68] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 158
		gunModel[69] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 159
		gunModel[70] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 160
		gunModel[71] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 156
		gunModel[72] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 157
		gunModel[73] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 158
		gunModel[74] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 159
		gunModel[75] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 160
		gunModel[76] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 161
		gunModel[77] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 162
		gunModel[78] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 163
		gunModel[79] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 164
		gunModel[80] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 165
		gunModel[81] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 166
		gunModel[82] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 167
		gunModel[83] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 169
		gunModel[84] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 175
		gunModel[85] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 176
		gunModel[86] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 177
		gunModel[87] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 178
		gunModel[88] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 186
		gunModel[89] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 187
		gunModel[90] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 188
		gunModel[91] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 119

		gunModel[0].addShapeBox(0F, 0F, 0F, 38, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[0].setRotationPoint(18F, -13F, -1.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 38, 5, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 1
		gunModel[1].setRotationPoint(18F, -13F, 0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 38, 5, 1, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(18F, -13F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[3].setRotationPoint(42F, -15F, 0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[4].setRotationPoint(42F, -15F, -1.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[5].setRotationPoint(42F, -15F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 12
		gunModel[6].setRotationPoint(10F, -13F, 0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -1F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[7].setRotationPoint(3F, -13F, -1.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[8].setRotationPoint(10F, -13F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[9].setRotationPoint(3F, -13F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[10].setRotationPoint(10F, -8F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[11].setRotationPoint(80F, -15F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 25
		gunModel[12].setRotationPoint(80F, -15F, 0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[13].setRotationPoint(80F, -15F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 27
		gunModel[14].setRotationPoint(80F, -11F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 28
		gunModel[15].setRotationPoint(80F, -11F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F); // Box 29
		gunModel[16].setRotationPoint(80F, -11F, 0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 30
		gunModel[17].setRotationPoint(80F, -13F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 38
		gunModel[18].setRotationPoint(-4F, -13F, -1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 40
		gunModel[19].setRotationPoint(-4F, -13F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 7, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 42
		gunModel[20].setRotationPoint(3F, -13F, 0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[21].setRotationPoint(-6F, -10F, -1.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[22].setRotationPoint(-6F, -11F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 46
		gunModel[23].setRotationPoint(-6F, -10F, 0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 48
		gunModel[24].setRotationPoint(-9F, -10F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 49
		gunModel[25].setRotationPoint(-9F, -9F, -1.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 50
		gunModel[26].setRotationPoint(-9F, -9F, 0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 51
		gunModel[27].setRotationPoint(-4F, -13F, 0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 26, 12, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 56
		gunModel[28].setRotationPoint(-35F, -9F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 26, 11, 1, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 3F, 0F); // Box 58
		gunModel[29].setRotationPoint(-35F, -8F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 26, 11, 1, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 1F, 0F); // Box 60
		gunModel[30].setRotationPoint(-35F, -8F, 0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F, -2F, -0.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -2F, -0.9F, 0.1F, -2F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -2F, 0.1F, 0.1F); // Box 61
		gunModel[31].setRotationPoint(-39F, -8F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F, -2F, -2F, 0.1F, 0F, -1F, 0.1F, 0F, 0.1F, -0.1F, -2F, -0.9F, -0.1F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0.1F, -0.1F, -2F, 0.1F, -0.1F); // Box 62
		gunModel[32].setRotationPoint(-39F, -8F, -1.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[33].setRotationPoint(19F, -15F, -1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[34].setRotationPoint(19F, -16F, -1F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[35].setRotationPoint(25F, -15F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		gunModel[36].setRotationPoint(25F, -15F, -1.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68
		gunModel[37].setRotationPoint(25F, -15F, 0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[38].setRotationPoint(31F, -15F, -1F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		gunModel[39].setRotationPoint(31F, -16F, -1F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[40].setRotationPoint(3.51F, -15.4F, -1.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		gunModel[41].setRotationPoint(3.51F, -15.4F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 73
		gunModel[42].setRotationPoint(3.51F, -15.4F, 0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		gunModel[43].setRotationPoint(20F, -14F, 0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		gunModel[44].setRotationPoint(41F, -14F, 0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		gunModel[45].setRotationPoint(21F, -14F, -1.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[46].setRotationPoint(41F, -14F, -1.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		gunModel[47].setRotationPoint(20F, -14F, -1.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		gunModel[48].setRotationPoint(8F, -13F, -1.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		gunModel[49].setRotationPoint(5F, -12F, -1.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		gunModel[50].setRotationPoint(5F, -13F, -1.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		gunModel[51].setRotationPoint(82F, -15F, -1.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 99
		gunModel[52].setRotationPoint(82F, -11F, -1.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		gunModel[53].setRotationPoint(82F, -14F, -1.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		gunModel[54].setRotationPoint(84F, -14F, -1F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 102
		gunModel[55].setRotationPoint(77F, -14F, -0.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gunModel[56].setRotationPoint(85F, -13F, -0.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 104
		gunModel[57].setRotationPoint(90F, -12F, -0.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 105
		gunModel[58].setRotationPoint(92F, -12F, -0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 108
		gunModel[59].setRotationPoint(6F, -6F, -0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 109
		gunModel[60].setRotationPoint(-1F, -6F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[61].setRotationPoint(-1F, -8F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[62].setRotationPoint(6F, -8F, -0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[63].setRotationPoint(0.5F, -4F, -0.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.15F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 113
		gunModel[64].setRotationPoint(1.5F, -7.5F, -0.5F);
		gunModel[64].rotateAngleZ = 0.26179939F;

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F); // Box 141
		gunModel[65].setRotationPoint(94.5F, -14F, -0.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F, 0F, 0.42F, 0.42F); // Box 142
		gunModel[66].setRotationPoint(96F, -14F, -0.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 4, 14, 1, 0F, -2F, -0.9F, -0.1F, 0F, 0.1F, -0.1F, 0F, -1F, 0.1F, -2F, -2F, 0.1F, -2F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -2F, 0F, -2F, -2F, 0F); // Box 144
		gunModel[67].setRotationPoint(-39F, -8F, 0.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 158
		gunModel[68].setRotationPoint(85F, -12.5F, -0.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F); // Box 159
		gunModel[69].setRotationPoint(19.5F, -15F, -1F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F); // Box 160
		gunModel[70].setRotationPoint(19.5F, -14.25F, -1F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		gunModel[71].setRotationPoint(56F, -15F, -0.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 157
		gunModel[72].setRotationPoint(56F, -15F, 0.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 158
		gunModel[73].setRotationPoint(56F, -13F, -1.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		gunModel[74].setRotationPoint(56F, -15F, -1.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 160
		gunModel[75].setRotationPoint(56F, -11F, -1.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 161
		gunModel[76].setRotationPoint(56F, -11F, -0.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F); // Box 162
		gunModel[77].setRotationPoint(56F, -11F, 0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 163
		gunModel[78].setRotationPoint(57F, -14.8F, 0.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F, 0F, -0.2F, 0F, 10F, -0.2F, 0F, 10F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 10F, -0.2F, 0F, 10F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 164
		gunModel[79].setRotationPoint(57F, -13F, -1.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, -1F, 0F, 0F, -1F); // Box 165
		gunModel[80].setRotationPoint(57F, -12.2F, 0.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, -1F, 10F, 0F, -1F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 166
		gunModel[81].setRotationPoint(57F, -14.8F, -1.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 167
		gunModel[82].setRotationPoint(57F, -14.8F, -0.5F);

		gunModel[83].addShapeBox(23.25F, -10F, -1.5F, 10, 6, 3, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1.5F, -0.1F, 0F, -1.5F, -0.1F, 0F, 0F, -0.1F); // Box 169
		gunModel[83].setRotationPoint(-7F, 0F, 0F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 175
		gunModel[84].setRotationPoint(57F, -12.2F, -0.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 10F, 0F, -1F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 176
		gunModel[85].setRotationPoint(57F, -12.2F, -1.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 16, 2, 3, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 177
		gunModel[86].setRotationPoint(3.5F, -13.4F, -1.5F);

		gunModel[87].addShapeBox(23.25F, -10F, -1.5F, 10, 6, 3, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 178
		gunModel[87].setRotationPoint(-7.6F, -0.4F, 0F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 186
		gunModel[88].setRotationPoint(95F, -13.5F, -0.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0.5F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 187
		gunModel[89].setRotationPoint(7F, -8F, -0.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		gunModel[90].setRotationPoint(20F, -14F, 0.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 2.75F, 0F, -0.275F, 2.75F, 0F, -0.275F, 2.75F, 0F, -0.275F, 2.75F, 0F, -0.275F, 2.75F, 0F, -0.275F, 2.75F, 0F, -0.275F, 2.75F, 0F, -0.275F, 2.75F, 0F, -0.275F); // Box 119
		gunModel[91].setRotationPoint(14.25F, -13.5F, -1F);


		defaultScopeModel = new ModelRendererTurbo[8];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 91
		defaultScopeModel[1] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 98
		defaultScopeModel[2] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 99
		defaultScopeModel[3] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 152
		defaultScopeModel[4] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 153
		defaultScopeModel[5] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 103
		defaultScopeModel[6] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 104
		defaultScopeModel[7] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 105

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 1F, -0.35F, -0.2F, 1F, -0.35F, -0.2F, 1F, -0.35F, -0.2F, 1F, -0.35F); // Box 91
		defaultScopeModel[0].setRotationPoint(94.5F, -17.2F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F); // Box 98
		defaultScopeModel[1].setRotationPoint(35F, -15F, -1F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F); // Box 99
		defaultScopeModel[2].setRotationPoint(39F, -15F, -1F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F); // Box 152
		defaultScopeModel[3].setRotationPoint(39F, -15F, -1F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F, -0.2F, -0.2F, 0.25F); // Box 153
		defaultScopeModel[4].setRotationPoint(35F, -15F, -1F);

		defaultScopeModel[5].addShapeBox(0F, -1.1F, -0.1F, 2, 1, 1, 0F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 103
		defaultScopeModel[5].setRotationPoint(39.5F, -16F, -1F);

		defaultScopeModel[6].addShapeBox(0F, -1.1F, 0.1F, 2, 1, 1, 0F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 104
		defaultScopeModel[6].setRotationPoint(39.5F, -16F, 0F);

		defaultScopeModel[7].addShapeBox(0F, -0.9F, 0F, 2, 2, 2, 0F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F); // Box 105
		defaultScopeModel[7].setRotationPoint(39.5F, -16F, -1F);



		ammoModel = new ModelRendererTurbo[8];
		ammoModel[0] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 171
		ammoModel[1] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 172
		ammoModel[2] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 173
		ammoModel[3] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 174
		ammoModel[4] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 179
		ammoModel[5] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 180
		ammoModel[6] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 181
		ammoModel[7] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 182

		ammoModel[0].addShapeBox(24.5F, -1F, -1.6F, 9, 4, 3, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 171
		ammoModel[0].setRotationPoint(-7F, 1F, 0F);
		ammoModel[0].rotateAngleX = -0.08726646F;
		ammoModel[0].rotateAngleZ = 0.20943951F;

		ammoModel[1].addShapeBox(24F, 3F, -9.6F, 10, 7, 3, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 172
		ammoModel[1].setRotationPoint(-7F, 1F, 0F);
		ammoModel[1].rotateAngleX = -0.08726646F;
		ammoModel[1].rotateAngleZ = 0.20943951F;

		ammoModel[2].addShapeBox(24F, 1F, -9.6F, 10, 2, 11, 0F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 173
		ammoModel[2].setRotationPoint(-7F, 1F, 0F);
		ammoModel[2].rotateAngleX = -0.08726646F;
		ammoModel[2].rotateAngleZ = 0.20943951F;

		ammoModel[3].addShapeBox(24F, 10F, -9.6F, 10, 2, 11, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F); // Box 174
		ammoModel[3].setRotationPoint(-7F, 1F, 0F);
		ammoModel[3].rotateAngleX = -0.08726646F;
		ammoModel[3].rotateAngleZ = 0.20943951F;

		ammoModel[4].addShapeBox(24F, 3F, -1.6F, 10, 7, 3, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 179
		ammoModel[4].setRotationPoint(-7F, 1F, 0F);
		ammoModel[4].rotateAngleX = -0.08726646F;
		ammoModel[4].rotateAngleZ = 0.20943951F;

		ammoModel[5].addShapeBox(24.5F, 3F, -7.1F, 9, 7, 6, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 180
		ammoModel[5].setRotationPoint(-7F, 1F, 0F);
		ammoModel[5].rotateAngleX = -0.08726646F;
		ammoModel[5].rotateAngleZ = 0.20943951F;

		ammoModel[6].addShapeBox(24F, 3F, -7.1F, 10, 1, 6, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 181
		ammoModel[6].setRotationPoint(-7F, 1F, 0F);
		ammoModel[6].rotateAngleX = -0.08726646F;
		ammoModel[6].rotateAngleZ = 0.20943951F;

		ammoModel[7].addShapeBox(24F, 9F, -7.1F, 10, 1, 6, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 182
		ammoModel[7].setRotationPoint(-7F, 1F, 0F);
		ammoModel[7].rotateAngleX = -0.08726646F;
		ammoModel[7].rotateAngleZ = 0.20943951F;


		pumpModel = new ModelRendererTurbo[9];
		pumpModel[0] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 74
		pumpModel[1] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 75
		pumpModel[2] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 76
		pumpModel[3] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 114
		pumpModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 154
		pumpModel[5] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 155
		pumpModel[6] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 156
		pumpModel[7] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 157
		pumpModel[8] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 168

		pumpModel[0].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 74
		pumpModel[0].setRotationPoint(1.5F, -15F, -1F);

		pumpModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 75
		pumpModel[1].setRotationPoint(0.5F, -15F, -1F);

		pumpModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F); // Box 76
		pumpModel[2].setRotationPoint(-1F, -15F, -1F);

		pumpModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F); // Box 114
		pumpModel[3].setRotationPoint(2F, -15F, -2.5F);

		pumpModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F); // Box 154
		pumpModel[4].setRotationPoint(-1F, -14F, -1F);

		pumpModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.25F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, -0.25F, -0.15F, -0.4F, -0.25F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, 0F, -0.15F, -0.4F, -0.25F, -0.15F, -0.4F); // Box 155
		pumpModel[5].setRotationPoint(-0.799999999999997F, -14.5F, -1F);

		pumpModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, -0.25F, -0.15F, -0.35F, -0.25F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, -0.25F, -0.15F, -0.35F); // Box 156
		pumpModel[6].setRotationPoint(-1F, -14.5F, -1F);

		pumpModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, -0.25F, -0.15F, -0.35F, -0.25F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, -0.25F, -0.15F, -0.35F); // Box 157
		pumpModel[7].setRotationPoint(-1F, -14.5F, 0F);

		pumpModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // Box 168
		pumpModel[8].setRotationPoint(2F, -15F, -3.5F);


		this.modelScale = 0.25F;

		translateAll = new Vector3f(0F, -9.4F, -0.15F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.SNIPER;
	    
		hasFlash = false;
	    
        leftArmPos = new Vector3f(0.450F, -0.6F, 0.02F);
        leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.1F, -0.7F, 0.02F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);
	    
	    rightArmPos = new Vector3f(0.28F, -0.55F, 0.0F);
	    rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    rightArmReloadPos = new Vector3f(0.28F, -0.55F, 0.0F);
	    rightArmReloadRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    
	    rightArmChargePos = new Vector3f(0.32F, -0.39F, 0.14F);
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