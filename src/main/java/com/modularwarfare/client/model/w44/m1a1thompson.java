//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.05.2017 - 22:22:40
// Last changed on: 14.05.2017 - 22:22:40

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.model.objects.RenderVariables;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class m1a1thompson extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 256;

	public m1a1thompson() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[95];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 18
		gunModel[19] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 19
		gunModel[20] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 20
		gunModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 21
		gunModel[22] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 22
		gunModel[23] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 23
		gunModel[24] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 25
		gunModel[25] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 26
		gunModel[26] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 27
		gunModel[27] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 28
		gunModel[28] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 29
		gunModel[29] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 31
		gunModel[30] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 32
		gunModel[31] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 33
		gunModel[32] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 34
		gunModel[33] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 35
		gunModel[34] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 36
		gunModel[35] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 37
		gunModel[36] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 38
		gunModel[37] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 39
		gunModel[38] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 41
		gunModel[39] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 42
		gunModel[40] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 43
		gunModel[41] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 45
		gunModel[42] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 46
		gunModel[43] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 47
		gunModel[44] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 48
		gunModel[45] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 49
		gunModel[46] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 50
		gunModel[47] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 51
		gunModel[48] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 52
		gunModel[49] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 53
		gunModel[50] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 54
		gunModel[51] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 55
		gunModel[52] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 56
		gunModel[53] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 57
		gunModel[54] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 58
		gunModel[55] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 59
		gunModel[56] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 60
		gunModel[57] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 61
		gunModel[58] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 62
		gunModel[59] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 63
		gunModel[60] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 64
		gunModel[61] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 65
		gunModel[62] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 66
		gunModel[63] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 67
		gunModel[64] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 68
		gunModel[65] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 69
		gunModel[66] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 70
		gunModel[67] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 71
		gunModel[68] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 72
		gunModel[69] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 73
		gunModel[70] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 74
		gunModel[71] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 75
		gunModel[72] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 76
		gunModel[73] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 77
		gunModel[74] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 78
		gunModel[75] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 79
		gunModel[76] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 80
		gunModel[77] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 81
		gunModel[78] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 80
		gunModel[79] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 82
		gunModel[80] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 83
		gunModel[81] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 84
		gunModel[82] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 85
		gunModel[83] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 86
		gunModel[84] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 87
		gunModel[85] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 89
		gunModel[86] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 90
		gunModel[87] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 91
		gunModel[88] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 92
		gunModel[89] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 93
		gunModel[90] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 94
		gunModel[91] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 99
		gunModel[92] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 100
		gunModel[93] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 101
		gunModel[94] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 102

		gunModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(-3F, -2F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(-3F, -1F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-3F, 0F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -0.2F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(-3F, 1F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.2F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -0.2F, 0F, 0F, -1.7F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.7F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(-3F, 2F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(-3F, -3F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 6
		gunModel[6].setRotationPoint(-1F, -5F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(1F, -6F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.1F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(-1F, -6F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 9
		gunModel[9].setRotationPoint(0.95F, -8F, -1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0.8F, 0F, -0.2F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.8F, 0F, -0.2F, -1F, -1F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, -1F, -1F, -0.1F); // Box 10
		gunModel[10].setRotationPoint(-11.65F, -8F, -1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, -0.8F, 0.4F, -0.1F, -0.4F, 0.4F, -0.1F, -0.4F, 0.4F, -0.1F, -0.8F, 0.4F, -0.1F); // Box 11
		gunModel[11].setRotationPoint(-1.65F, -7F, -1F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, -0.1F, 0.7F, 0F, -0.1F, 0.7F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 12
		gunModel[12].setRotationPoint(1.2F, -6F, -1F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.3F, -0.1F, 1F, -0.3F, -0.1F, 1F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 13
		gunModel[13].setRotationPoint(1.2F, -4F, -1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 14
		gunModel[14].setRotationPoint(1.2F, -5F, -1F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, -0.35F, -0.1F, 0.25F, -0.35F, -0.1F, 0.25F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0.25F, -0.35F, -0.1F, 0.25F, -0.35F, -0.1F, 0F, -0.35F, -0.1F); // Box 15
		gunModel[15].setRotationPoint(2.2F, -3.65F, -1F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.7F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.7F, 0F, -0.1F, 0F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 16
		gunModel[16].setRotationPoint(8.45F, -6F, -1F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, 0F, -0.1F); // Box 17
		gunModel[17].setRotationPoint(8.45F, -5F, -1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.2F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, 0F, -0.1F, 1F, -0.3F, -0.1F, -1F, -0.3F, -0.1F, -1F, -0.3F, -0.1F, 1F, -0.3F, -0.1F); // Box 18
		gunModel[18].setRotationPoint(8.45F, -4F, -1F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 19
		gunModel[19].setRotationPoint(-11.5F, -9F, -1F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 20
		gunModel[20].setRotationPoint(-11.5F, -11F, -1F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 21
		gunModel[21].setRotationPoint(7.5F, -11F, -1F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 22
		gunModel[22].setRotationPoint(-1.5F, -11F, -1F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 23
		gunModel[23].setRotationPoint(-1.5F, -10F, -1F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 25
		gunModel[24].setRotationPoint(12.5F, -10F, -1F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0.2F, 0.1F, 0.5F, 0.2F, 0.1F, 0.5F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 26
		gunModel[25].setRotationPoint(15F, -11F, -1F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 27
		gunModel[26].setRotationPoint(9.5F, -10F, -1F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 28
		gunModel[27].setRotationPoint(9.5F, -11F, -1F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, -0.8F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 29
		gunModel[28].setRotationPoint(14F, -11F, -1F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 51, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 31
		gunModel[29].setRotationPoint(-12F, -10.8F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0.5F, -0.2F); // Box 32
		gunModel[30].setRotationPoint(20.5F, -9.3F, -1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F); // Box 33
		gunModel[31].setRotationPoint(17.5F, -10.3F, -1F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F); // Box 34
		gunModel[32].setRotationPoint(20.5F, -10.5F, -1F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F); // Box 35
		gunModel[33].setRotationPoint(30.5F, -10.5F, -1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F); // Box 36
		gunModel[34].setRotationPoint(22.5F, -10.5F, -1F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 37
		gunModel[35].setRotationPoint(22.5F, -10.2F, -1F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0.1F, -0.01F, 0F, 0.1F, -0.01F, 0F, 0.1F, -0.01F, 0F, 0.1F, -0.01F); // Box 38
		gunModel[36].setRotationPoint(16.5F, -11.2F, -1F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.8F, 0.1F, 0.5F, -0.8F, 0.1F, 0.5F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 39
		gunModel[37].setRotationPoint(10.5F, -11F, -1F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 41
		gunModel[38].setRotationPoint(39F, -10.8F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 42
		gunModel[39].setRotationPoint(-2.05F, -8F, -1F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 43
		gunModel[40].setRotationPoint(-1F, -6F, 0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0.8F, 0F, -0.5F); // Box 45
		gunModel[41].setRotationPoint(-1F, -5F, 0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 1.8F, 0F, -0.5F, -1.2F, 0F, -0.5F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 46
		gunModel[42].setRotationPoint(-3F, -3F, 0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 47
		gunModel[43].setRotationPoint(-3F, -2F, 0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 48
		gunModel[44].setRotationPoint(-3F, -1F, 0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, 0F, -0.5F, 0.2F, 0F, -0.5F); // Box 49
		gunModel[45].setRotationPoint(-3F, 0F, 0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -1.8F, 0F, 0F, -2F, 0F, -0.5F, -0.4F, 0F, -0.5F); // Box 50
		gunModel[46].setRotationPoint(-3F, 1F, 0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.2F, 0F, 0F, -1.8F, 0F, 0F, -2F, 0F, -0.5F, -0.4F, 0F, -0.5F, -1.7F, 0F, 0F, -2F, 0F, 0F, -2.2F, -0.3F, -0.5F, -1.9F, -0.3F, -0.5F); // Box 51
		gunModel[47].setRotationPoint(-3F, 2F, 0.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		gunModel[48].setRotationPoint(1F, -6F, 0.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 53
		gunModel[49].setRotationPoint(-1F, -6F, -1.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 54
		gunModel[50].setRotationPoint(-1F, -5F, -1.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1.2F, 0F, -0.5F, 1.8F, 0F, -0.5F, 2F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, -0.5F, 0.6F, 0F, -0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[51].setRotationPoint(-3F, -3F, -1.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.2F, 0F, -0.5F, 0.6F, 0F, -0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 56
		gunModel[52].setRotationPoint(-3F, -2F, -1.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.3F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 57
		gunModel[53].setRotationPoint(-3F, -1F, -1.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.3F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 58
		gunModel[54].setRotationPoint(-3F, 0F, -1.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -2F, 0F, -0.5F, -1.8F, 0F, 0F, -0.2F, 0F, 0F); // Box 59
		gunModel[55].setRotationPoint(-3F, 1F, -1.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.4F, 0F, -0.5F, -2F, 0F, -0.5F, -1.8F, 0F, 0F, -0.2F, 0F, 0F, -1.9F, -0.3F, -0.5F, -2.2F, -0.3F, -0.5F, -2F, 0F, 0F, -1.7F, 0F, 0F); // Box 60
		gunModel[56].setRotationPoint(-3F, 2F, -1.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.5F, -1.2F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[57].setRotationPoint(1F, -6F, -1.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F); // Box 62
		gunModel[58].setRotationPoint(-10.65F, -8F, -1F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 2F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F); // Box 63
		gunModel[59].setRotationPoint(-10.65F, -7F, -1F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[60].setRotationPoint(-10.65F, -5F, -1F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[61].setRotationPoint(-15.65F, -3F, -1F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[62].setRotationPoint(-15.65F, -5F, -1F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		gunModel[63].setRotationPoint(-14.65F, -6F, -1F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[64].setRotationPoint(-15.65F, -7F, -1F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 15, 7, 2, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F, 7F, 0F, -6F, 3F, 0F, -6F, 3F, 0F, 0F, 7F, 0F); // Box 69
		gunModel[65].setRotationPoint(-31.65F, -7F, -1F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 4F, 0F); // Box 70
		gunModel[66].setRotationPoint(-16.65F, -7F, -1F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 71
		gunModel[67].setRotationPoint(-32.65F, -3F, -1F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, 1.2F, -0.3F, -3.5F, 1.5F, -0.3F, -3.5F, 1.5F, -0.3F, -1F, 1.2F, -0.3F, 0F, -0.5F, -0.3F, 0.5F, -0.5F, -0.3F, 0.5F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 72
		gunModel[68].setRotationPoint(-10.5F, -12F, 0.25F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F); // Box 73
		gunModel[69].setRotationPoint(-10.5F, -11.8F, -1F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, 1.2F, -0.3F, -3.5F, 1.5F, -0.3F, -3.5F, 1.5F, -0.3F, -1F, 1.2F, -0.3F, 0F, -0.5F, -0.3F, 0.5F, -0.5F, -0.3F, 0.5F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 74
		gunModel[70].setRotationPoint(-10.5F, -12F, -1.25F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 75
		gunModel[71].setRotationPoint(39.3F, -11.8F, -0.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		gunModel[72].setRotationPoint(39.3F, -12.8F, -0.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0.1F, -0.25F, -0.45F, 0.1F, -0.25F, -0.45F, 0.1F, -0.25F, -0.45F, 0.1F, -0.25F, -0.45F, 0.1F, -0.25F, -0.45F, 0.1F, -0.25F, -0.45F, 0.1F, -0.25F, -0.45F, 0.1F, -0.25F, -0.45F); // Box 77
		gunModel[73].setRotationPoint(-9.5F, -12.3F, -1F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.24F, -0.25F, -0.75F, -0.24F, -0.25F, -0.75F, -0.24F, -0.25F, -0.75F, -0.24F, -0.25F, -0.75F, -0.24F, -0.5F, -0.75F, -0.24F, -0.5F, -0.75F, -0.24F, -0.5F, -0.75F, -0.24F, -0.5F, -0.75F); // Box 78
		gunModel[74].setRotationPoint(-9.5F, -13.3F, -1F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.24F, -0.25F, -0.75F, -0.24F, -0.25F, -0.75F, -0.24F, -0.25F, -0.75F, -0.24F, -0.25F, -0.75F, -0.24F, -0.5F, -0.75F, -0.24F, -0.5F, -0.75F, -0.24F, -0.5F, -0.75F, -0.24F, -0.5F, -0.75F); // Box 79
		gunModel[75].setRotationPoint(-9.5F, -12.5F, -1F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -1.1F, -0.25F, 0F, -1.1F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -1.1F, -0.25F, 0F, -1.1F); // Box 80
		gunModel[76].setRotationPoint(-9.5F, -13.05F, -1.15F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.25F, 0F, -1.1F, -0.25F, 0F, -1.1F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -1.1F, -0.25F, 0F, -1.1F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F); // Box 81
		gunModel[77].setRotationPoint(-9.5F, -13.05F, -0.85F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.2F, 0.1F, 0.5F, 0.2F, 0.1F, 0.5F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 80
		gunModel[78].setRotationPoint(9.5F, -11F, 0F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 82
		gunModel[79].setRotationPoint(-1.5F, -10.5F, 0F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 83
		gunModel[80].setRotationPoint(-9F, -7.25F, -1.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 84
		gunModel[81].setRotationPoint(-9F, -8.25F, -1.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F); // Box 85
		gunModel[82].setRotationPoint(-9F, -6.25F, -1.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 86
		gunModel[83].setRotationPoint(33F, -7.5F, -1F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F, -0.5F); // Box 87
		gunModel[84].setRotationPoint(33F, -6.9F, -1F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F); // Box 89
		gunModel[85].setRotationPoint(33F, -6.9F, 0F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 90
		gunModel[86].setRotationPoint(33F, -6F, -1F);

		gunModel[87].addShapeBox(-34F, 7.5F, -1F, 1, 1, 2, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 91
		gunModel[87].setRotationPoint(0F, -14.55F, 0F);
		gunModel[87].rotateAngleZ = 0.38397244F;

		gunModel[88].addShapeBox(-34F, 8.1F, -1F, 1, 1, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F, -0.5F); // Box 92
		gunModel[88].setRotationPoint(0F, -14.55F, 0F);
		gunModel[88].rotateAngleZ = 0.38397244F;

		gunModel[89].addShapeBox(-34F, 9F, -1F, 1, 1, 2, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 93
		gunModel[89].setRotationPoint(0F, -14.55F, 0F);
		gunModel[89].rotateAngleZ = 0.38397244F;

		gunModel[90].addShapeBox(-34F, 8.1F, 0F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F); // Box 94
		gunModel[90].setRotationPoint(0F, -14.55F, 0F);
		gunModel[90].rotateAngleZ = 0.38397244F;

		gunModel[91].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.2F, 0.1F, 0.5F, 0.2F, 0.1F, 0.5F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, -0.2F, -1F, 0.1F, 0.3F, -1F, 0.1F, 0.3F, -1F, -0.1F, -0.2F, -1F, -0.1F); // Box 99
		gunModel[91].setRotationPoint(9.5F, -11F, -1F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0.1F, -0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F); // Box 100
		gunModel[92].setRotationPoint(-12.5F, -11F, -1F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		gunModel[93].setRotationPoint(-12.6F, -10.7F, -0.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.15F, 0.5F, -0.75F, -0.15F, 0.5F, -0.75F, -0.15F, 0.5F, -0.75F, -0.15F, 0.5F, -0.75F, -0.15F, 0.5F, -0.75F, -0.15F, 0.5F, -0.75F, -0.15F, 0.5F, -0.75F, -0.15F, 0.5F, -0.75F); // Box 102
		gunModel[94].setRotationPoint(5F, -5.5F, -1F);
		gunModel[94].rotateAngleZ = 0.15707963F;


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 30
		ammoModel[1] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 40
		ammoModel[2] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 81

		ammoModel[0].addShapeBox(0F, 0F, 0F, 4, 19, 2, 0F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 30
		ammoModel[0].setRotationPoint(8.5F, -9.01F, -1F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 19, 2, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 40
		ammoModel[1].setRotationPoint(8.47F, -9.02F, -1F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 19, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 81
		ammoModel[2].setRotationPoint(10.5F, -8.99F, -1F);


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 95
		slideModel[1] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 96
		slideModel[2] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 98

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 95
		slideModel[0].setRotationPoint(6.5F, -10.55F, -2F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F); // Box 96
		slideModel[1].setRotationPoint(6.5F, -10.55F, -2.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 98
		slideModel[2].setRotationPoint(4.5F, -10.5F, -1.1F);

		this.modelScale = 0.3F;

		translateAll = new Vector3f(0F, -9F, -0.01F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.RIFLE2;
	    
		hasFlash = false;
	    
	    leftArmPos = new Vector3f(0.3F, -0.64F, 0.05F);
	    leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.0F, -0.70F, 0.02F);
	    leftArmReloadRot = new Vector3f(35.0F, 0.0F, -45.0F);
	    
	    rightArmPos = new Vector3f(0.33F, -0.55F, 0.0F);
	    rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    rightArmReloadPos = new Vector3f(0.3F, -0.57F, 0.0F);
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
	    
		crouchZoom = -0.15F;
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
	    
        ammoMap.put("w44.m1a1thompsondrumammo", new RenderVariables(new Vector3f(0.6F, 0.12F, 0F), 0.3F));
	    
		flipAll();
	}
}