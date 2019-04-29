//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.12.2017 - 01:34:08
// Last changed on: 06.12.2017 - 01:34:08

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class sten extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 256;

	public sten() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[75];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 19
		gunModel[19] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 20
		gunModel[20] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 21
		gunModel[21] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 22
		gunModel[22] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 23
		gunModel[23] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 24
		gunModel[24] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 25
		gunModel[25] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 26
		gunModel[26] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 27
		gunModel[27] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 28
		gunModel[28] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 29
		gunModel[29] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 30
		gunModel[30] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 31
		gunModel[31] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 32
		gunModel[32] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 33
		gunModel[33] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 34
		gunModel[34] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 40
		gunModel[35] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 55
		gunModel[36] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 56
		gunModel[37] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 64
		gunModel[38] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 65
		gunModel[39] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 66
		gunModel[40] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 67
		gunModel[41] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 70
		gunModel[42] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 71
		gunModel[43] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 73
		gunModel[44] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 74
		gunModel[45] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 78
		gunModel[46] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 94
		gunModel[47] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 95
		gunModel[48] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 96
		gunModel[49] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 97
		gunModel[50] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 98
		gunModel[51] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 99
		gunModel[52] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 100
		gunModel[53] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 101
		gunModel[54] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 102
		gunModel[55] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 103
		gunModel[56] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 104
		gunModel[57] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 105
		gunModel[58] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 106
		gunModel[59] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 107
		gunModel[60] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 108
		gunModel[61] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 109
		gunModel[62] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 110
		gunModel[63] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 111
		gunModel[64] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 112
		gunModel[65] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 113
		gunModel[66] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 114
		gunModel[67] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 115
		gunModel[68] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 116
		gunModel[69] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 117
		gunModel[70] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 118
		gunModel[71] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 119
		gunModel[72] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 120
		gunModel[73] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 121
		gunModel[74] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 122

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Box 0
		gunModel[0].setRotationPoint(10F, -4F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 1
		gunModel[1].setRotationPoint(3F, 0F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Box 2
		gunModel[2].setRotationPoint(2F, -4F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(1F, -6F, -1.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 17, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(1F, -10F, -1.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(1F, -7F, -1.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F); // Box 6
		gunModel[6].setRotationPoint(4F, -4.5F, -1F);
		gunModel[6].rotateAngleZ = 0.08726646F;

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 7
		gunModel[7].setRotationPoint(0F, -10F, -1.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(12F, -6F, -1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F); // Box 9
		gunModel[9].setRotationPoint(12F, -4F, -1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[10].setRotationPoint(12F, -8F, -1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[11].setRotationPoint(18F, -10F, -1F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 36, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[12].setRotationPoint(0.5F, -12F, -2F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 36, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 13
		gunModel[13].setRotationPoint(0.5F, -10F, -2F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 36, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[14].setRotationPoint(0.5F, -13F, -2F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 15
		gunModel[15].setRotationPoint(-0.5F, -9.5F, -2.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[16].setRotationPoint(-0.5F, -12.5F, -2.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[17].setRotationPoint(-0.5F, -13.5F, -2.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[18].setRotationPoint(-1.5F, -13.5F, 1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, -0.6F, 0F, -0.01F, -0.6F, 0F, -0.01F, -0.6F, 0F, -0.01F, -0.6F, 0F); // Box 20
		gunModel[19].setRotationPoint(-1.5F, -13.5F, -1.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 21
		gunModel[20].setRotationPoint(-1.5F, -13.5F, -2.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 22
		gunModel[21].setRotationPoint(11F, -8F, -2.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F); // Box 23
		gunModel[22].setRotationPoint(36.5F, -9.5F, -2.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 24
		gunModel[23].setRotationPoint(36.5F, -12.5F, -2.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 25
		gunModel[24].setRotationPoint(36.5F, -13.5F, -2.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[25].setRotationPoint(45.5F, -12F, -1F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 27
		gunModel[26].setRotationPoint(38.5F, -12F, 2.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 28
		gunModel[27].setRotationPoint(37.5F, -12F, 2.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 29
		gunModel[28].setRotationPoint(37.5F, -11F, 2.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[29].setRotationPoint(46.5F, -12.5F, -2.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[30].setRotationPoint(46.5F, -10.5F, -2.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[31].setRotationPoint(46.5F, -12.5F, 1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[32].setRotationPoint(46.5F, -10.5F, 1.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 34
		gunModel[33].setRotationPoint(46.5F, -13.5F, -1.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[34].setRotationPoint(46.5F, -11.5F, -2.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 55
		gunModel[35].setRotationPoint(47.5F, -13.5F, -1.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 56
		gunModel[36].setRotationPoint(47.5F, -13.5F, 0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[37].setRotationPoint(45.25F, -11.5F, 2.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F, 0.25F, 0.25F, -0.1F); // Box 65
		gunModel[38].setRotationPoint(45.25F, -11.5F, 8.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[39].setRotationPoint(37.75F, -12.5F, 6.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 67
		gunModel[40].setRotationPoint(38.75F, -12.4F, 6.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		gunModel[41].setRotationPoint(2F, -9F, -2F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[42].setRotationPoint(1F, -8F, -2F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		gunModel[43].setRotationPoint(3F, -10F, -2F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 74
		gunModel[44].setRotationPoint(-0.9F, -12.5F, -1.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		gunModel[45].setRotationPoint(-0.5F, -8.5F, -1.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 94
		gunModel[46].setRotationPoint(50.5F, -13.5F, -1.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 95
		gunModel[47].setRotationPoint(50.5F, -13.5F, 0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 96
		gunModel[48].setRotationPoint(48.5F, -13.5F, -1.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 97
		gunModel[49].setRotationPoint(51.5F, -13.5F, -1.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 98
		gunModel[50].setRotationPoint(53.5F, -13.5F, 0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 99
		gunModel[51].setRotationPoint(53.5F, -13.5F, -1.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 100
		gunModel[52].setRotationPoint(54.5F, -13.5F, -1.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		gunModel[53].setRotationPoint(48.5F, -11.5F, -2.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		gunModel[54].setRotationPoint(54.5F, -11.5F, -2.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gunModel[55].setRotationPoint(51.5F, -11.5F, -2.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		gunModel[56].setRotationPoint(46.5F, -11.5F, 1.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		gunModel[57].setRotationPoint(48.5F, -11.5F, 1.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		gunModel[58].setRotationPoint(54.5F, -11.5F, 1.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[59].setRotationPoint(51.5F, -11.5F, 1.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gunModel[60].setRotationPoint(48.5F, -9.5F, -1.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		gunModel[61].setRotationPoint(47.5F, -9.5F, -1.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[62].setRotationPoint(47.5F, -9.5F, 0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[63].setRotationPoint(46.5F, -9.5F, -1.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[64].setRotationPoint(50.5F, -9.5F, -1.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		gunModel[65].setRotationPoint(50.5F, -9.5F, 0.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		gunModel[66].setRotationPoint(51.5F, -9.5F, -1.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		gunModel[67].setRotationPoint(53.5F, -9.5F, 0.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		gunModel[68].setRotationPoint(54.5F, -9.5F, -1.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		gunModel[69].setRotationPoint(53.5F, -9.5F, -1.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		gunModel[70].setRotationPoint(46F, -15F, -0.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F); // Box 119
		gunModel[71].setRotationPoint(-0.5F, -15F, -1F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F); // Box 120
		gunModel[72].setRotationPoint(-0.5F, -15F, -1F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F); // Box 121
		gunModel[73].setRotationPoint(-0.5F, -15F, 0F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F); // Box 122
		gunModel[74].setRotationPoint(-0.5F, -16F, -1F);


		defaultStockModel = new ModelRendererTurbo[11];
		defaultStockModel[0] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 79
		defaultStockModel[1] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 80
		defaultStockModel[2] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 81
		defaultStockModel[3] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 82
		defaultStockModel[4] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 83
		defaultStockModel[5] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 84
		defaultStockModel[6] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 85
		defaultStockModel[7] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 86
		defaultStockModel[8] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 87
		defaultStockModel[9] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 88
		defaultStockModel[10] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 89

		defaultStockModel[0].addShapeBox(0F, 0F, 0F, 35, 1, 3, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F); // Box 79
		defaultStockModel[0].setRotationPoint(-35.5F, -6.5F, -1.5F);

		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 35, 1, 3, 0F, 0F, -10F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -10F, -1F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F); // Box 80
		defaultStockModel[1].setRotationPoint(-35.5F, -7.5F, -1.5F);

		defaultStockModel[2].addShapeBox(0F, 0F, 0F, 35, 1, 3, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 10F, -1F); // Box 81
		defaultStockModel[2].setRotationPoint(-35.5F, -5.5F, -1.5F);

		defaultStockModel[3].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 82
		defaultStockModel[3].setRotationPoint(-36.5F, -1.5F, -2F);

		defaultStockModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0.65F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.65F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 83
		defaultStockModel[4].setRotationPoint(-36.5F, -3.5F, -2F);

		defaultStockModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0.65F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.65F, 0F, 0F); // Box 84
		defaultStockModel[5].setRotationPoint(-36.5F, 9.5F, -2F);

		defaultStockModel[6].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 85
		defaultStockModel[6].setRotationPoint(-36.5F, -1.5F, 1F);

		defaultStockModel[7].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 86
		defaultStockModel[7].setRotationPoint(-36.5F, 0F, -1F);

		defaultStockModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0.65F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0.65F, 0F, -1F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 87
		defaultStockModel[8].setRotationPoint(-37.5F, -4.5F, -2F);

		defaultStockModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0.65F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0.65F, 0F, -1F); // Box 88
		defaultStockModel[9].setRotationPoint(-37.5F, 11.5F, -2F);

		defaultStockModel[10].addShapeBox(0F, 0F, 0F, 14, 7, 1, 0F, 1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 1F, 0F, -0.15F, -1F, -1F, -0.15F, -3F, -2F, -0.15F, -3F, -2F, -0.15F, -1F, -1F, -0.15F); // Box 89
		defaultStockModel[10].setRotationPoint(-12.5F, -1.5F, -0.5F);
		defaultStockModel[10].rotateAngleZ = 0.26179939F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 63

		ammoModel[0].addShapeBox(0F, 0F, 0F, 4, 2, 32, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 63
		ammoModel[0].setRotationPoint(39.5F, -12F, 2.5F);
		ammoModel[0].rotateAngleY = -0.03490659F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 68
		slideModel[1] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 69

		slideModel[0].addShapeBox(0F, -0.5F, -3F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		slideModel[0].setRotationPoint(30.5F, -12.2F, -1F);
		slideModel[0].rotateAngleX = -0.40142573F;

		slideModel[1].addShapeBox(0F, -0.5F, -3F, 1, 1, 1, 0F, 0.3F, 0.3F, -0.15F, 0.3F, 0.3F, -0.15F, 0.3F, 0.3F, -0.15F, 0.3F, 0.3F, -0.15F, 0.3F, 0.3F, -0.15F, 0.3F, 0.3F, -0.15F, 0.3F, 0.3F, -0.15F, 0.3F, 0.3F, -0.15F); // Box 69
		slideModel[1].setRotationPoint(30.5F, -12.2F, -1F);
		slideModel[1].rotateAngleX = -0.40142573F;

		this.modelScale = 0.22F;

		translateAll = new Vector3f(-2F, -14.35F, -0.01F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.SIDE_CLIP;
	    
		hasFlash = false;
	    
	    leftArmPos = new Vector3f(0.280F, -0.65F, 0.02F);
	    leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.385F, -0.585F, -0.2F);
	    leftArmReloadRot = new Vector3f(25.0F, 0.0F, -55.0F);
	    
	    rightArmPos = new Vector3f(0.28F, -0.58F, 0.0F);
	    rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    rightArmReloadPos = new Vector3f(0.28F, -0.58F, 0.0F);
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
	    
		crouchZoom = -0.3F;
		fancyStance = true;
		sprintRotate = new Vector3f(10.0F, 30.0F, -0.0F);
		sprintTranslate = new Vector3f(0.9F, -0.10F, -0.65F);
		
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