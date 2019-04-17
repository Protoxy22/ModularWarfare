//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.05.2017 - 19:04:35
// Last changed on: 20.05.2017 - 19:04:35

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class m1a1carbine extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public m1a1carbine() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[96];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 14
		gunModel[11] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 16
		gunModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 19
		gunModel[13] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 20
		gunModel[14] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 21
		gunModel[15] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 23
		gunModel[16] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 24
		gunModel[17] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 25
		gunModel[18] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 26
		gunModel[19] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 27
		gunModel[20] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 28
		gunModel[21] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 29
		gunModel[22] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 30
		gunModel[23] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 31
		gunModel[24] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 32
		gunModel[25] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 33
		gunModel[26] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 34
		gunModel[27] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 35
		gunModel[28] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 36
		gunModel[29] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 37
		gunModel[30] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 38
		gunModel[31] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 39
		gunModel[32] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 40
		gunModel[33] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 41
		gunModel[34] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 42
		gunModel[35] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 43
		gunModel[36] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 44
		gunModel[37] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 46
		gunModel[38] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 47
		gunModel[39] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 48
		gunModel[40] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 49
		gunModel[41] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 50
		gunModel[42] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 53
		gunModel[43] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 54
		gunModel[44] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 55
		gunModel[45] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 56
		gunModel[46] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 57
		gunModel[47] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 58
		gunModel[48] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 59
		gunModel[49] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 60
		gunModel[50] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 61
		gunModel[51] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 62
		gunModel[52] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 63
		gunModel[53] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 64
		gunModel[54] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 65
		gunModel[55] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 66
		gunModel[56] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 67
		gunModel[57] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 68
		gunModel[58] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 69
		gunModel[59] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 70
		gunModel[60] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 71
		gunModel[61] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 72
		gunModel[62] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 73
		gunModel[63] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 74
		gunModel[64] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 75
		gunModel[65] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 81
		gunModel[66] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 82
		gunModel[67] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 83
		gunModel[68] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 84
		gunModel[69] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 85
		gunModel[70] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 86
		gunModel[71] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 87
		gunModel[72] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 88
		gunModel[73] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 89
		gunModel[74] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 90
		gunModel[75] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 98
		gunModel[76] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 99
		gunModel[77] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 100
		gunModel[78] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 102
		gunModel[79] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 103
		gunModel[80] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 104
		gunModel[81] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 105
		gunModel[82] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 106
		gunModel[83] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 107
		gunModel[84] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 108
		gunModel[85] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 109
		gunModel[86] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 110
		gunModel[87] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 111
		gunModel[88] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 112
		gunModel[89] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 122
		gunModel[90] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 123
		gunModel[91] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 125
		gunModel[92] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 126
		gunModel[93] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 127
		gunModel[94] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 128
		gunModel[95] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 129

		gunModel[0].addShapeBox(0F, 0F, 0F, 44, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 2F, 0F, 0F, -1.15F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(25F, -18F, 2F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(-7F, -16F, -2F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 17, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -1F, -1F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-2F, -18F, 2F);

		gunModel[3].addShapeBox(0F, -1F, 0F, 21, 3, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 1F, 1F); // Box 3
		gunModel[3].setRotationPoint(48F, -21F, 1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, 1F); // Box 4
		gunModel[4].setRotationPoint(30F, -21F, 1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.15F, 0F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 6
		gunModel[5].setRotationPoint(71F, -18F, 0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[6].setRotationPoint(68F, -18F, -2.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 8
		gunModel[7].setRotationPoint(68F, -14F, -2.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[8].setRotationPoint(68F, -20F, -2.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 44, 7, 1, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1.15F, 0F, 0F, 2F, 0F); // Box 10
		gunModel[9].setRotationPoint(25F, -18F, -3F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2.15F, 0F, 0F, -1.5F, 0F); // Box 14
		gunModel[10].setRotationPoint(71F, -18F, -1.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 16
		gunModel[11].setRotationPoint(48F, -21F, -1F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F); // Box 19
		gunModel[12].setRotationPoint(30F, -21F, -1F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[13].setRotationPoint(30F, -20F, -1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 44, 7, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 2F, 1F); // Box 21
		gunModel[14].setRotationPoint(25F, -18F, -1F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.15F, 0F, 0F, -2.15F, 0F, 0F, -1.5F, 0F); // Box 23
		gunModel[15].setRotationPoint(71F, -18F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 35, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[16].setRotationPoint(71F, -18.5F, -1F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 17, 7, 1, 0F, -1F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 25
		gunModel[17].setRotationPoint(-2F, -18F, -3F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 17, 9, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 26
		gunModel[18].setRotationPoint(-2F, -18F, -1F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F); // Box 27
		gunModel[19].setRotationPoint(-7F, -11F, -1F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 28
		gunModel[20].setRotationPoint(-7F, -8F, -1F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1.5F, 0F, 0F); // Box 29
		gunModel[21].setRotationPoint(-7F, -5F, -1F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F, 1.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1.5F, 0F, 0F, 2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.5F, 0F, 0F); // Box 30
		gunModel[22].setRotationPoint(-7F, -2F, -1F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.5F, 0F, 0F, 3.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 3.5F, 0F, 0F); // Box 31
		gunModel[23].setRotationPoint(-7F, 2F, -1F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 3.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 3.5F, 0F, 0F, 2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.5F, 0F, 0F); // Box 32
		gunModel[24].setRotationPoint(-7F, 4F, -1F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 3.5F, 0F, 0F, -1.75F, 0F, 0F, -2.75F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2F, 0F, 0F, -3F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Box 33
		gunModel[25].setRotationPoint(-7F, 4F, 1F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 2.5F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 1.5F, 0F, 0F, 3.5F, 0F, 0F, -1.75F, 0F, 0F, -2.75F, 0F, 0F, 2.5F, 0F, 0F); // Box 34
		gunModel[26].setRotationPoint(-7F, 2F, 1F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 1.5F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 1.5F, 0F, 0F); // Box 35
		gunModel[27].setRotationPoint(-7F, -2F, 1F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0.5F, 0F, 0F); // Box 36
		gunModel[28].setRotationPoint(-7F, -5F, 1F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[29].setRotationPoint(-7F, -8F, 1F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		gunModel[30].setRotationPoint(-7F, -11F, 1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 2.5F, 0F, 0F, -2.75F, 0F, 0F, -1.75F, 0F, 0F, 3.5F, 0F, 0F, 1.5F, -0.5F, 0F, -3F, -0.5F, 0F, -2F, 0F, 0F, 2.5F, 0F, 0F); // Box 39
		gunModel[31].setRotationPoint(-7F, 4F, -2F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 1.5F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.75F, 0F, 0F, -1.75F, 0F, 0F, 3.5F, 0F, 0F); // Box 40
		gunModel[32].setRotationPoint(-7F, 2F, -2F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0.5F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 2.5F, 0F, 0F); // Box 41
		gunModel[33].setRotationPoint(-7F, -2F, -2F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 1.5F, 0F, 0F); // Box 42
		gunModel[34].setRotationPoint(-7F, -5F, -2F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 43
		gunModel[35].setRotationPoint(-7F, -8F, -2F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F); // Box 44
		gunModel[36].setRotationPoint(-7F, -11F, -2F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, -0.02F, 1F, 0F, -0.02F, 1F, 0F, -0.02F, 1F, 0F, -0.02F, 1F); // Box 46
		gunModel[37].setRotationPoint(26F, -19.5F, -2F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 47
		gunModel[38].setRotationPoint(24F, -21.5F, -1F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.02F, 1F, 0F, -0.02F, 1F, 0F, -0.02F, 1F, 0F, -0.02F, 1F); // Box 48
		gunModel[39].setRotationPoint(24F, -19.5F, -2F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 49
		gunModel[40].setRotationPoint(22F, -19.5F, -1.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 50
		gunModel[41].setRotationPoint(-2F, -19.5F, -1.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 53
		gunModel[42].setRotationPoint(21F, -19.5F, -1.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[43].setRotationPoint(21F, -21.5F, -1.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, -0.25F, -0.25F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0F, 1F); // Box 55
		gunModel[44].setRotationPoint(-7F, -17.5F, -1F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F); // Box 56
		gunModel[45].setRotationPoint(106F, -18.5F, -1F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F); // Box 57
		gunModel[46].setRotationPoint(109F, -18.5F, -1F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		gunModel[47].setRotationPoint(-12F, -16.5F, -1F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[48].setRotationPoint(-15F, 4.5F, -1F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 60
		gunModel[49].setRotationPoint(-17F, -16.5F, -1F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 61
		gunModel[50].setRotationPoint(-22F, 4.5F, -1F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 40, 2, 2, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 62
		gunModel[51].setRotationPoint(-57F, -9.5F, -1F);
		gunModel[51].rotateAngleZ = 0.12391838F;

		gunModel[52].addShapeBox(19F, 0F, 0F, 17, 2, 2, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 63
		gunModel[52].setRotationPoint(-57F, -9.5F, -1F);
		gunModel[52].rotateAngleZ = 0.12391838F;

		gunModel[53].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 64
		gunModel[53].setRotationPoint(-26F, -3.5F, -1F);

		gunModel[54].addShapeBox(1F, -2F, 0F, 12, 2, 2, 0F, 0F, 0F, 0F, 0.355F, 0F, 0F, 0.355F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, -0.05F, 0F, 0.05F, -0.05F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[54].setRotationPoint(-38.9F, -3.5F, -1F);
		gunModel[54].rotateAngleZ = 0.15097098F;

		gunModel[55].addShapeBox(4F, -2F, 0F, 8, 2, 2, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 66
		gunModel[55].setRotationPoint(-38.9F, -3.5F, -1F);
		gunModel[55].rotateAngleZ = 0.15097098F;

		gunModel[56].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, -1F, 0F, -0.2F, 3.88F, 0F, -0.2F, 3.88F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0.1F, -3.9F, 0F, 0.1F, -3.9F, 0F, 0F, 1F, 0F); // Box 67
		gunModel[56].setRotationPoint(-41F, -1.75F, -1F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[57].setRotationPoint(-47F, 4.5F, -1F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 69
		gunModel[58].setRotationPoint(-56F, 4.5F, -1F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 70
		gunModel[59].setRotationPoint(-58F, -9.5F, -1F);

		gunModel[60].addShapeBox(1F, -2F, 0F, 10, 8, 2, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, -0.4F, 0F, -1.5F, -0.4F, 0F, -1.5F, -0.4F, 0F, 0.5F, -0.4F); // Box 71
		gunModel[60].setRotationPoint(-37.5F, -9.8F, -1F);

		gunModel[61].addShapeBox(1F, -2F, 0F, 4, 8, 2, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.5F, -0.4F, 0F, 2F, -0.4F, 0F, 2F, -0.4F, 0F, -1.5F, -0.4F); // Box 72
		gunModel[61].setRotationPoint(-27.5F, -9.8F, -1F);

		gunModel[62].addShapeBox(1F, -2F, 0F, 5, 8, 2, 0F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, 1F, -0.4F, 0F, 0F, -0.4F, 0F, 2F, -0.4F, 0F, -3.5F, -0.4F, 0F, -3.5F, -0.4F, 0F, 2F, -0.4F); // Box 73
		gunModel[62].setRotationPoint(-23.5F, -9.8F, -1F);

		gunModel[63].addShapeBox(1F, -2F, 0F, 1, 4, 2, 0F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, 1F, -0.4F, 0F, 0F, -0.4F, 0F, 2F, -0.4F, 0F, -3.5F, -0.4F, 0F, -3.5F, -0.4F, 0F, 2F, -0.4F); // Box 74
		gunModel[63].setRotationPoint(-18.5F, -11.2F, -1F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		gunModel[64].setRotationPoint(-8F, 4F, -1.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[65].setRotationPoint(24F, -18F, -1F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		gunModel[66].setRotationPoint(24F, -18F, 2F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 83
		gunModel[67].setRotationPoint(24F, -18F, -3F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 9, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[68].setRotationPoint(15F, -18F, -1F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 85
		gunModel[69].setRotationPoint(16F, -18F, 2F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F); // Box 86
		gunModel[70].setRotationPoint(15F, -18F, 2F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F); // Box 87
		gunModel[71].setRotationPoint(23F, -18F, 2F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 88
		gunModel[72].setRotationPoint(16F, -18F, -3F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, 4F, 0F); // Box 89
		gunModel[73].setRotationPoint(15F, -18F, -3F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F); // Box 90
		gunModel[74].setRotationPoint(23F, -18F, -3F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 2F); // Box 98
		gunModel[75].setRotationPoint(26F, -21.5F, 0F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		gunModel[76].setRotationPoint(48F, -21F, 0F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		gunModel[77].setRotationPoint(30F, -21F, 0F);

		gunModel[78].addShapeBox(1F, -2F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 102
		gunModel[78].setRotationPoint(-36.5F, -6.8F, -1F);

		gunModel[79].addShapeBox(1F, -2F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 103
		gunModel[79].setRotationPoint(-21.5F, -4.8F, -1F);

		gunModel[80].addShapeBox(1F, -2F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 104
		gunModel[80].setRotationPoint(-21.5F, -8.8F, -1F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 105
		gunModel[81].setRotationPoint(9.5F, -9F, -1F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, 0.2F, 0.1F); // Box 106
		gunModel[82].setRotationPoint(9.5F, -8F, -1F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[83].setRotationPoint(1F, -9F, -1F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 108
		gunModel[84].setRotationPoint(1F, -8F, -1F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 109
		gunModel[85].setRotationPoint(9.5F, -7F, -1F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 110
		gunModel[86].setRotationPoint(2F, -5F, -1F);

		gunModel[87].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 111
		gunModel[87].setRotationPoint(3.5F, -9.5F, 0F);
		gunModel[87].rotateAngleZ = 0.20943951F;

		gunModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 112
		gunModel[88].setRotationPoint(24F, -21.5F, 0F);

		gunModel[89].addShapeBox(0F, -1F, 0F, 21, 3, 1, 0F, 0F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		gunModel[89].setRotationPoint(48F, -21F, -2F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 123
		gunModel[90].setRotationPoint(26F, -21.5F, -1F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, 0F, -1.5F, 1.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 125
		gunModel[91].setRotationPoint(30F, -21F, -2F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 126
		gunModel[92].setRotationPoint(-3F, 5F, -1F);
		gunModel[92].rotateAngleZ = -0.26179939F;

		gunModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F); // Box 127
		gunModel[93].setRotationPoint(-5F, 5F, -1.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F); // Box 128
		gunModel[94].setRotationPoint(-5F, 7F, -1.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 129
		gunModel[95].setRotationPoint(-5F, 6F, -1.5F);


		defaultScopeModel = new ModelRendererTurbo[12];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 51
		defaultScopeModel[1] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 91
		defaultScopeModel[2] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 92
		defaultScopeModel[3] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 93
		defaultScopeModel[4] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 94
		defaultScopeModel[5] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 95
		defaultScopeModel[6] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 96
		defaultScopeModel[7] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 117
		defaultScopeModel[8] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 118
		defaultScopeModel[9] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 119
		defaultScopeModel[10] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 120
		defaultScopeModel[11] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 121

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 51
		defaultScopeModel[0].setRotationPoint(3F, -20.5F, -1F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 91
		defaultScopeModel[1].setRotationPoint(106F, -23F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 2.5F, -0.3F, 0F, 2.5F, -0.3F, 0F, 2.5F, -0.3F, 0F, 2.5F, -0.3F); // Box 92
		defaultScopeModel[2].setRotationPoint(106F, -22F, -0.5F);

		defaultScopeModel[3].addShapeBox(0F, 0.5F, 0F, 3, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.3F); // Box 93
		defaultScopeModel[3].setRotationPoint(106F, -23.25F, 0.75F);
		defaultScopeModel[3].rotateAngleX = -0.08726646F;

		defaultScopeModel[4].addShapeBox(0F, -0.5F, 0F, 3, 1, 1, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 94
		defaultScopeModel[4].setRotationPoint(106F, -23.25F, 0.75F);
		defaultScopeModel[4].rotateAngleX = -0.08726646F;

		defaultScopeModel[5].addShapeBox(0F, -0.5F, -1F, 3, 1, 1, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 95
		defaultScopeModel[5].setRotationPoint(106F, -23.25F, -0.75F);
		defaultScopeModel[5].rotateAngleX = 0.08726646F;

		defaultScopeModel[6].addShapeBox(0F, 0.5F, -1F, 3, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.3F); // Box 96
		defaultScopeModel[6].setRotationPoint(106F, -23.25F, -0.75F);
		defaultScopeModel[6].rotateAngleX = 0.08726646F;

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -1F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 117
		defaultScopeModel[7].setRotationPoint(4F, -21.25F, -0.5F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0.35F, -1.1F, 0F, 0.35F, -1.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 118
		defaultScopeModel[8].setRotationPoint(5.5F, -22.5F, -0.55F);

		defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0.35F, -1.1F, 0F, 0.35F, -1.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1.1F, 0F, 0F, -1.1F); // Box 119
		defaultScopeModel[9].setRotationPoint(5.5F, -22.5F, -1.45F);

		defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F); // Box 120
		defaultScopeModel[10].setRotationPoint(5.5F, -22.85F, -1F);

		defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F); // Box 121
		defaultScopeModel[11].setRotationPoint(5.5F, -21.6F, -1F);


		ammoModel = new ModelRendererTurbo[6];
		ammoModel[0] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 5
		ammoModel[1] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 76
		ammoModel[2] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 77
		ammoModel[3] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 78
		ammoModel[4] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 79
		ammoModel[5] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 80

		ammoModel[0].addShapeBox(0F, 0F, 0F, 8, 14, 3, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 5
		ammoModel[0].setRotationPoint(15F, -12.5F, -1.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 14, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		ammoModel[1].setRotationPoint(14.99F, -12.49F, -1.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		ammoModel[2].setRotationPoint(16.5F, -12.49F, -1.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 2, 14, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		ammoModel[3].setRotationPoint(20F, -12.49F, -1.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 2, 14, 3, 0F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0F, -0.34F, 0F, 0.19F, -0.34F, 0F, 0.19F, -0.34F, 0F, 0.19F, -0.34F, 0F, 0.19F, -0.34F); // Box 79
		ammoModel[4].setRotationPoint(22F, -12.52F, -1.5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 80
		ammoModel[5].setRotationPoint(15F, 1.5F, -1.5F);


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 52
		slideModel[1] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 120
		slideModel[2] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 121

		slideModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 52
		slideModel[0].setRotationPoint(10F, -19F, -1F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 120
		slideModel[1].setRotationPoint(16F, -19F, -3F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F); // Box 121
		slideModel[2].setRotationPoint(16F, -19F, -4.5F);

		this.modelScale = 0.17F;

		translateAll = new Vector3f(0F, -15.9F, -0.05F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.SNIPER;
	    
		hasFlash = false;
	    
        leftArmPos = new Vector3f(0.250F, -0.6F, 0.02F);
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