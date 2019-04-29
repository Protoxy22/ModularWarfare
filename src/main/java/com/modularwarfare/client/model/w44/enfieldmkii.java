//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.03.2018 - 10:37:34
// Last changed on: 22.03.2018 - 10:37:34

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class enfieldmkii extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public enfieldmkii() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[49];
		gunModel[0] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 29
		gunModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 30
		gunModel[2] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 31
		gunModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 32
		gunModel[4] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 33
		gunModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 34
		gunModel[6] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 35
		gunModel[7] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 36
		gunModel[8] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 37
		gunModel[9] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 38
		gunModel[10] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 39
		gunModel[11] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 40
		gunModel[12] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 41
		gunModel[13] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 42
		gunModel[14] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 39
		gunModel[15] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 72
		gunModel[16] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 73
		gunModel[17] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 74
		gunModel[18] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 75
		gunModel[19] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 76
		gunModel[20] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 77
		gunModel[21] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 78
		gunModel[22] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 79
		gunModel[23] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 80
		gunModel[24] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 81
		gunModel[25] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 82
		gunModel[26] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 87
		gunModel[27] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 88
		gunModel[28] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 92
		gunModel[29] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 93
		gunModel[30] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 94
		gunModel[31] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 95
		gunModel[32] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 96
		gunModel[33] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 97
		gunModel[34] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 98
		gunModel[35] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 99
		gunModel[36] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 37
		gunModel[37] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 102
		gunModel[38] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 103
		gunModel[39] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 107
		gunModel[40] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 108
		gunModel[41] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 109
		gunModel[42] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 110
		gunModel[43] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 111
		gunModel[44] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 112
		gunModel[45] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 114
		gunModel[46] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 115
		gunModel[47] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 116
		gunModel[48] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 117

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.1F, 0F); // Box 29
		gunModel[0].setRotationPoint(1.15F, -2.35F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[1].setRotationPoint(2.15F, -2.35F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 31
		gunModel[2].setRotationPoint(-1.05F, -3.25F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.75F, 0F, -0.2F, 0.1F, 0.05F, -0.2F, 0.1F, 0.05F, -0.2F, -0.75F, 0F, -0.2F); // Box 32
		gunModel[3].setRotationPoint(-0.3F, -0.75F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.25F, 0F, -1.1F, -0.25F, 0F, -1.1F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -0.2F, -0.25F, 0F); // Box 33
		gunModel[4].setRotationPoint(-0.85F, -1.5F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -1.2F, -0.25F, 0F, -1.2F, 0.1F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -1.2F, 0.1F, 0F); // Box 34
		gunModel[5].setRotationPoint(-2.45F, -1.5F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.05F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -1.05F, -0.25F, 0F, -0.4F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.4F, 0.1F, 0F); // Box 35
		gunModel[6].setRotationPoint(-4.05F, -1.5F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0.4F, -0.25F, 0F, -1F, -0.25F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0.1F, 0F); // Box 36
		gunModel[7].setRotationPoint(-4.65F, -0.65F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.55F, 0F, -0.2F, -0.55F, 0F, -0.2F, -0.75F, 0F, 0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.1F, -0.1F, 0F); // Box 37
		gunModel[8].setRotationPoint(-4.65F, 0.7F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.1F, 0F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0.1F, 0F, 0F, 0F, -0.5F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, 0F, -0.5F, 0F); // Box 38
		gunModel[9].setRotationPoint(-4.65F, 2.6F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Box 39
		gunModel[10].setRotationPoint(-2.25F, -2.25F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.5F, -0.15F, 0F, 0.4F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.4F, -0.15F, 0F); // Box 40
		gunModel[11].setRotationPoint(-2.25F, -2.9F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 41
		gunModel[12].setRotationPoint(-1.05F, -3.75F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.4F, 0.05F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F); // Box 42
		gunModel[13].setRotationPoint(-0.05F, -4.25F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.4F, -0.4F, 0F, 0.45F, -0.35F, 0F, 0.45F, -0.35F, 0F, 0.4F, -0.4F, 0F, 0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0.5F, -0.45F, 0F); // Box 39
		gunModel[14].setRotationPoint(-2.25F, -3.3F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1F, -0.25F, -0.3F, 0.4F, -0.25F, -0.3F, 0.2F, -0.25F, -0.3F, -1.4F, -0.25F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.5F, 0.1F, -0.3F); // Box 72
		gunModel[15].setRotationPoint(-4.65F, -0.65F, 0.2F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.2F, -0.75F, -0.3F, -0.2F, -0.55F, -0.3F, -0.4F, -0.55F, -0.3F, -0.5F, -0.75F, -0.3F, 0.1F, -0.1F, -0.3F, -0.2F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.3F, -0.1F, -0.3F); // Box 73
		gunModel[16].setRotationPoint(-4.65F, 0.7F, 0.2F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.1F, 0F, -0.3F, -0.2F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.3F, 0F, -0.3F, 0F, -0.5F, -0.3F, -0.3F, -0.7F, -0.3F, -0.6F, -0.8F, -0.3F, -0.5F, -0.7F, -0.3F); // Box 74
		gunModel[17].setRotationPoint(-4.65F, 2.6F, 0.2F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.05F, -0.25F, -0.3F, -0.1F, -0.25F, -0.3F, -0.3F, -0.25F, -0.35F, -1.3F, -0.25F, -0.35F, -0.4F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.8F, 0.1F, -0.3F); // Box 75
		gunModel[18].setRotationPoint(-4.05F, -1.5F, 0.2F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.35F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.65F, -0.35F, -0.35F, -0.7F, -0.35F, -0.35F, -0.1F, -0.25F, -0.3F, -0.05F, -0.25F, -0.3F, -0.25F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F); // Box 76
		gunModel[19].setRotationPoint(-3.1F, -2F, 0.2F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.5F, -0.75F, -0.3F, -0.4F, -0.55F, -0.3F, -0.2F, -0.55F, -0.3F, -0.2F, -0.75F, -0.3F, -0.3F, -0.1F, -0.3F, -0.4F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, 0.1F, -0.1F, -0.3F); // Box 77
		gunModel[20].setRotationPoint(-4.65F, 0.7F, -1.2F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.4F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, 0.1F, 0F, -0.3F, -0.5F, -0.7F, -0.3F, -0.6F, -0.8F, -0.3F, -0.3F, -0.7F, -0.3F, 0F, -0.5F, -0.3F); // Box 78
		gunModel[21].setRotationPoint(-4.65F, 2.6F, -1.2F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -1.4F, -0.25F, -0.3F, 0.2F, -0.25F, -0.3F, 0.4F, -0.25F, -0.3F, -1F, -0.25F, -0.3F, -0.5F, 0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, 0.1F, -0.3F); // Box 79
		gunModel[22].setRotationPoint(-4.65F, -0.65F, -1.2F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.1F, -0.25F, -0.3F, -1.05F, -0.25F, -0.3F, -0.8F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F); // Box 80
		gunModel[23].setRotationPoint(-4.05F, -1.5F, -1.2F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.7F, -0.35F, -0.35F, -0.65F, -0.35F, -0.35F, -0.3F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.25F, -0.35F, -0.25F, -0.25F, -0.35F, -0.05F, -0.25F, -0.3F, -0.1F, -0.25F, -0.3F); // Box 81
		gunModel[24].setRotationPoint(-3.1F, -2F, -1.2F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1.1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.1F, -0.25F, 0F, -1.1F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -1.1F, 0F, 0F); // Box 82
		gunModel[25].setRotationPoint(-1.05F, -1.5F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.4F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 87
		gunModel[26].setRotationPoint(2.5F, -1.3F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.1F, 0.5F, 0F); // Box 88
		gunModel[27].setRotationPoint(2.95F, -2.35F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -0.3F, 0.1F, 0.05F, -0.3F, 0.1F, 0.05F, -0.3F, 0.1F, 0.05F, -0.3F, 0.1F, 0.05F, -0.3F, 0.1F, 0.05F, -0.3F, 0.1F, 0.05F, -0.3F, 0.1F, 0.05F, -0.3F, 0.1F); // Box 92
		gunModel[28].setRotationPoint(3.15F, -2.45F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.35F, 0.1F, -0.3F, -0.35F, 0.1F, -0.3F, -0.35F, 0.1F, -0.3F, -0.35F, 0.1F, 0.05F, -0.3F, 0.1F, 0.05F, -0.3F, 0.1F, 0.05F, -0.3F, 0.1F, 0.05F, -0.3F, 0.1F); // Box 93
		gunModel[29].setRotationPoint(3.15F, -2.85F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -0.3F, 0.1F, 0.05F, -0.3F, 0.1F, 0.05F, -0.3F, 0.1F, 0.05F, -0.3F, 0.1F, -0.3F, -0.35F, 0.1F, -0.3F, -0.35F, 0.1F, -0.3F, -0.35F, 0.1F, -0.3F, -0.35F, 0.1F); // Box 94
		gunModel[30].setRotationPoint(3.15F, -2.05F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0.15F, -0.3F, -0.3F, 0.15F, -0.3F, -0.3F, 0.15F, -0.3F, -0.3F, 0.15F, -0.3F, -0.3F, 0.15F, -0.3F, -0.3F, 0.15F, -0.3F, -0.3F, 0.15F, -0.3F, -0.3F, 0.15F); // Box 95
		gunModel[31].setRotationPoint(3.15F, -2.45F, -0.5F);

		gunModel[32].addShapeBox(-0.5F, -0.25F, 0F, 1, 1, 1, 0F, -0.4F, -0.25F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.4F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 96
		gunModel[32].setRotationPoint(3.03F, -0.4F, -0.5F);
		gunModel[32].rotateAngleZ = -0.59341195F;

		gunModel[33].addShapeBox(-0.5F, -0.2F, 0F, 1, 1, 1, 0F, -0.4F, -0.25F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.4F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 97
		gunModel[33].setRotationPoint(2.7F, 0.15F, -0.5F);
		gunModel[33].rotateAngleZ = -1.11701072F;

		gunModel[34].addShapeBox(-0.5F, -0.2F, 0F, 1, 1, 1, 0F, -0.41F, -0.25F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.25F, -0.2F, -0.41F, -0.25F, -0.2F, -0.4F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 98
		gunModel[34].setRotationPoint(0.45F, 0.15F, -0.5F);
		gunModel[34].rotateAngleZ = 1.02974426F;

		gunModel[35].addShapeBox(-0.5F, -0.2F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F); // Box 99
		gunModel[35].setRotationPoint(1.55F, 0.19F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.8F, -0.1F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, 0.8F, -0.1F, -0.3F, 0.3F, -0.3F, -0.35F, -1F, -0.3F, -0.35F, -1F, -0.3F, -0.35F, 0.3F, -0.3F, -0.35F); // Box 37
		gunModel[36].setRotationPoint(1.5F, -1.35F, -0.45F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F); // Box 102
		gunModel[37].setRotationPoint(0.9F, -0.9F, -0.45F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.65F, -0.25F, -0.35F, -0.2F, -0.25F, -0.35F, -0.2F, -0.25F, -0.35F, -0.65F, -0.25F, -0.35F); // Box 103
		gunModel[38].setRotationPoint(0.9F, -0.45F, -0.45F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0.15F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0.15F, -0.15F, -0.3F); // Box 107
		gunModel[39].setRotationPoint(-0.45F, -4.1F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.3F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, -0.15F, -0.3F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 108
		gunModel[40].setRotationPoint(-0.45F, -4.5F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.3F, -0.4F, -0.3F, -0.15F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.15F, -0.4F, -0.3F); // Box 109
		gunModel[41].setRotationPoint(-0.45F, -4.8F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.1F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F); // Box 110
		gunModel[42].setRotationPoint(-1.2F, -3.55F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 111
		gunModel[43].setRotationPoint(-1.75F, -3.45F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, 0.15F, 0.1F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F, 0.1F, -0.35F, 0.15F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F); // Box 112
		gunModel[44].setRotationPoint(-0.05F, -4.6F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.45F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.15F, -0.35F, -0.4F, -0.15F); // Box 114
		gunModel[45].setRotationPoint(-0.05F, -5.35F, -0.85F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.45F, -0.4F, -0.25F, -0.35F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F); // Box 115
		gunModel[46].setRotationPoint(-0.05F, -5.35F, -0.15F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, 0.7F, -0.3F, -0.1F, -1.5F, -0.1F, -0.1F, -1.5F, -0.1F, -0.1F, 0.7F, -0.3F, -0.1F); // Box 116
		gunModel[47].setRotationPoint(-0.05F, -3.5F, -0.3F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0.2F, -0.4F, -0.1F, 0.2F, -0.45F, -0.1F, 0.2F, -0.45F, -0.1F, 0.2F, -0.4F, -0.1F); // Box 117
		gunModel[48].setRotationPoint(-1.75F, -3.15F, -0.3F);


		ammoModel = new ModelRendererTurbo[18];
		ammoModel[0] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 53
		ammoModel[1] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 54
		ammoModel[2] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 55
		ammoModel[3] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 56
		ammoModel[4] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 57
		ammoModel[5] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 58
		ammoModel[6] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 59
		ammoModel[7] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 60
		ammoModel[8] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 61
		ammoModel[9] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 62
		ammoModel[10] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 63
		ammoModel[11] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 64
		ammoModel[12] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 65
		ammoModel[13] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 66
		ammoModel[14] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 67
		ammoModel[15] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 68
		ammoModel[16] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 69
		ammoModel[17] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 70

		ammoModel[0].addShapeBox(-1F, -0.45F, -0.5F, 2, 1, 1, 0F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F); // Box 53
		ammoModel[0].setRotationPoint(1.7F, -3.95F, 0F);

		ammoModel[1].addShapeBox(-1.2F, -0.45F, -0.5F, 1, 1, 1, 0F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F); // Box 54
		ammoModel[1].setRotationPoint(1.75F, -3.95F, 0F);

		ammoModel[2].addShapeBox(0.55F, -0.45F, -0.5F, 1, 1, 1, 0F, -0.15F, -0.27F, -0.27F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.27F, -0.27F, -0.15F, -0.27F, -0.27F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.27F, -0.27F); // Box 55
		ammoModel[2].setRotationPoint(1.6F, -3.95F, 0F);

		ammoModel[3].addShapeBox(-1.2F, -0.45F, -0.5F, 1, 1, 1, 0F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F); // Box 56
		ammoModel[3].setRotationPoint(1.75F, -2.3F, 0F);

		ammoModel[4].addShapeBox(-1F, -0.45F, -0.5F, 2, 1, 1, 0F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F); // Box 57
		ammoModel[4].setRotationPoint(1.7F, -2.3F, 0F);

		ammoModel[5].addShapeBox(0.55F, -0.45F, -0.5F, 1, 1, 1, 0F, -0.15F, -0.27F, -0.27F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.27F, -0.27F, -0.15F, -0.27F, -0.27F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.27F, -0.27F); // Box 58
		ammoModel[5].setRotationPoint(1.6F, -2.3F, 0F);

		ammoModel[6].addShapeBox(-1.2F, -1.3F, -0.2F, 1, 1, 1, 0F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F); // Box 59
		ammoModel[6].setRotationPoint(1.75F, -2.3F, 0F);
		ammoModel[6].rotateAngleX = -0.78539816F;

		ammoModel[7].addShapeBox(-1F, -1.3F, -0.2F, 2, 1, 1, 0F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F); // Box 60
		ammoModel[7].setRotationPoint(1.7F, -2.3F, 0F);
		ammoModel[7].rotateAngleX = -0.78539816F;

		ammoModel[8].addShapeBox(0.55F, -1.3F, -0.2F, 1, 1, 1, 0F, -0.15F, -0.27F, -0.27F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.27F, -0.27F, -0.15F, -0.27F, -0.27F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.27F, -0.27F); // Box 61
		ammoModel[8].setRotationPoint(1.6F, -2.3F, 0F);
		ammoModel[8].rotateAngleX = -0.78539816F;

		ammoModel[9].addShapeBox(-1.2F, -1.85F, -0.85F, 1, 1, 1, 0F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F); // Box 62
		ammoModel[9].setRotationPoint(1.75F, -2.3F, 0F);
		ammoModel[9].rotateAngleX = -0.82030475F;

		ammoModel[10].addShapeBox(-1F, -1.85F, -0.85F, 2, 1, 1, 0F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F); // Box 63
		ammoModel[10].setRotationPoint(1.7F, -2.3F, 0F);
		ammoModel[10].rotateAngleX = -0.82030475F;

		ammoModel[11].addShapeBox(0.55F, -1.85F, -0.85F, 1, 1, 1, 0F, -0.15F, -0.27F, -0.27F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.27F, -0.27F, -0.15F, -0.27F, -0.27F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.27F, -0.27F); // Box 64
		ammoModel[11].setRotationPoint(1.6F, -2.3F, 0F);
		ammoModel[11].rotateAngleX = -0.82030475F;

		ammoModel[12].addShapeBox(-1.2F, -1.3F, -0.18F, 1, 1, 1, 0F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F); // Box 65
		ammoModel[12].setRotationPoint(1.75F, -2.3F, -1.5F);
		ammoModel[12].rotateAngleX = -0.78539816F;

		ammoModel[13].addShapeBox(-1F, -1.3F, -0.18F, 2, 1, 1, 0F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F); // Box 66
		ammoModel[13].setRotationPoint(1.7F, -2.3F, -1.5F);
		ammoModel[13].rotateAngleX = -0.78539816F;

		ammoModel[14].addShapeBox(0.55F, -1.3F, -0.18F, 1, 1, 1, 0F, -0.15F, -0.27F, -0.27F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.27F, -0.27F, -0.15F, -0.27F, -0.27F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.27F, -0.27F); // Box 67
		ammoModel[14].setRotationPoint(1.6F, -2.3F, -1.5F);
		ammoModel[14].rotateAngleX = -0.78539816F;

		ammoModel[15].addShapeBox(0.55F, -1.83F, -0.83F, 1, 1, 1, 0F, -0.15F, -0.27F, -0.27F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.27F, -0.27F, -0.15F, -0.27F, -0.27F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.27F, -0.27F); // Box 68
		ammoModel[15].setRotationPoint(1.6F, -2.3F, -1.45F);
		ammoModel[15].rotateAngleX = -0.82030475F;

		ammoModel[16].addShapeBox(-1F, -1.83F, -0.83F, 2, 1, 1, 0F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F); // Box 69
		ammoModel[16].setRotationPoint(1.7F, -2.3F, -1.45F);
		ammoModel[16].rotateAngleX = -0.82030475F;

		ammoModel[17].addShapeBox(-1.2F, -1.83F, -0.83F, 1, 1, 1, 0F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F, -0.42F, -0.22F, -0.22F); // Box 70
		ammoModel[17].setRotationPoint(1.75F, -2.3F, -1.45F);
		ammoModel[17].rotateAngleX = -0.82030475F;


		breakActionModel = new ModelRendererTurbo[44];
		breakActionModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		breakActionModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		breakActionModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		breakActionModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		breakActionModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		breakActionModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
		breakActionModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 9
		breakActionModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 11
		breakActionModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 12
		breakActionModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 13
		breakActionModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 14
		breakActionModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 16
		breakActionModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 17
		breakActionModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 18
		breakActionModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 19
		breakActionModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 20
		breakActionModel[16] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 21
		breakActionModel[17] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 22
		breakActionModel[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 23
		breakActionModel[19] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 24
		breakActionModel[20] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 25
		breakActionModel[21] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 27
		breakActionModel[22] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 28
		breakActionModel[23] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 43
		breakActionModel[24] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 40
		breakActionModel[25] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 41
		breakActionModel[26] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 42
		breakActionModel[27] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 43
		breakActionModel[28] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 44
		breakActionModel[29] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 45
		breakActionModel[30] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 46
		breakActionModel[31] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 47
		breakActionModel[32] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 48
		breakActionModel[33] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 49
		breakActionModel[34] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 71
		breakActionModel[35] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 69
		breakActionModel[36] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 70
		breakActionModel[37] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 71
		breakActionModel[38] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 105
		breakActionModel[39] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 106
		breakActionModel[40] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 118
		breakActionModel[41] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 119
		breakActionModel[42] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 120
		breakActionModel[43] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 125

		breakActionModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 0
		breakActionModel[0].setRotationPoint(6.15F, -4.35F, -0.5F);

		breakActionModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, 0F, -0.1F); // Box 1
		breakActionModel[1].setRotationPoint(5.15F, -4.35F, -0.5F);

		breakActionModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.1F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0.1F, -0.2F, -0.1F, 0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 2
		breakActionModel[2].setRotationPoint(3.15F, -4.35F, -0.5F);

		breakActionModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, -0.05F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.7F, -0.05F, -0.1F); // Box 3
		breakActionModel[3].setRotationPoint(3.15F, -3.35F, -0.5F);

		breakActionModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F); // Box 4
		breakActionModel[4].setRotationPoint(6.15F, -4.05F, -0.5F);

		breakActionModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.7F, -0.1F, -0.2F, -0.15F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, -0.2F, -0.15F, -0.35F); // Box 5
		breakActionModel[5].setRotationPoint(5.15F, -4.05F, -0.5F);

		breakActionModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, -0.1F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, -0.8F, 0F, -0.1F, -0.05F, 0.5F, -0.1F, -0.75F, 0.35F, -0.35F, -0.75F, 0.35F, -0.35F, -0.05F, 0.5F, -0.1F); // Box 9
		breakActionModel[6].setRotationPoint(4.35F, -3.35F, -0.5F);

		breakActionModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F); // Box 11
		breakActionModel[7].setRotationPoint(4.15F, -4.75F, -0.5F);

		breakActionModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 12
		breakActionModel[8].setRotationPoint(4.15F, -4.9F, -0.5F);

		breakActionModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.35F, 0.25F, -0.3F, -0.35F, 0.25F, -0.3F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.3F, 0.25F, -0.4F, -0.3F, 0.25F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 13
		breakActionModel[9].setRotationPoint(8.15F, -4.9F, -0.5F);

		breakActionModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 14
		breakActionModel[10].setRotationPoint(9.1F, -4.9F, -0.5F);

		breakActionModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.15F, -0.35F, 0F, 0F, -0.35F, 0F, 0.2F, -0.35F, -0.5F, 0.15F, -0.35F, -0.5F, 0.15F, -0.3F, 0F, 0F, -0.3F, 0F, 0.2F, -0.3F, -0.5F, 0.15F, -0.3F, -0.5F); // Box 16
		breakActionModel[11].setRotationPoint(0.8F, -5F, -0.5F);

		breakActionModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.15F, -0.35F, -0.1F, 0.2F, -0.35F, -0.1F, 0F, -0.35F, -0.4F, 0.15F, -0.35F, -0.4F, 0.15F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0F, -0.3F, -0.4F, 0.15F, -0.3F, -0.4F); // Box 17
		breakActionModel[12].setRotationPoint(0.8F, -5F, -0.1F);

		breakActionModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, 0F, -0.5F, -0.45F, -0.1F, -0.5F, -0.45F, -0.5F, -0.2F, -0.35F, -0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, -0.1F, -0.5F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F); // Box 18
		breakActionModel[13].setRotationPoint(1.8F, -5F, -0.5F);

		breakActionModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.1F, 0.2F, -0.4F, -0.1F, 0.2F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.35F, -0.1F, 0.5F, -0.35F, -0.1F, 0.5F, -0.35F, -0.1F, 0F, -0.35F, -0.1F); // Box 19
		breakActionModel[14].setRotationPoint(2.3F, -4.95F, -0.5F);

		breakActionModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.35F, -0.5F, -0.5F, -0.45F, -0.5F, -0.5F, -0.45F, -0.1F, 0F, -0.35F, 0F, -0.2F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.1F, 0F, -0.3F, 0F); // Box 20
		breakActionModel[15].setRotationPoint(1.8F, -5F, -0.5F);

		breakActionModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.45F, -0.1F, -0.15F, -0.45F, -0.1F, -0.15F, -0.45F, -0.1F, -0.1F, -0.45F, -0.1F, -0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F); // Box 21
		breakActionModel[16].setRotationPoint(2.95F, -4.75F, -0.5F);

		breakActionModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.35F, -0.1F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.15F, -0.35F, -0.1F, -0.45F, -0.4F, -0.1F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.45F, -0.4F, -0.1F); // Box 22
		breakActionModel[17].setRotationPoint(3.35F, -4.9F, -0.5F);

		breakActionModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.45F, -0.1F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.35F, -0.45F, -0.1F, -0.6F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.6F, -0.4F, -0.1F); // Box 23
		breakActionModel[18].setRotationPoint(3.45F, -4.75F, -0.5F);

		breakActionModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, -0.25F, -0.45F, -0.1F, 0.5F, -0.45F, -0.1F, 0.5F, -0.45F, -0.1F, -0.25F, -0.45F, -0.1F); // Box 24
		breakActionModel[19].setRotationPoint(2.05F, -5.1F, -0.5F);

		breakActionModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, -0.75F, 0.5F, -0.1F, -0.75F, 0.5F, -0.1F, 0F, 0.5F, -0.1F); // Box 25
		breakActionModel[20].setRotationPoint(4.15F, -3.35F, -0.5F);

		breakActionModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, -0.7F, -0.05F, -0.1F, -0.7F, -0.05F, -0.1F, 0F, 0.5F, -0.1F); // Box 27
		breakActionModel[21].setRotationPoint(3.05F, -3.35F, -0.5F);

		breakActionModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, -0.05F, -0.1F, -0.25F, -0.05F, -0.1F, -0.25F, -0.05F, -0.1F, -0.25F, -0.05F, -0.1F); // Box 28
		breakActionModel[22].setRotationPoint(3.1F, -3.35F, -0.5F);

		breakActionModel[23].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, -0.4F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, -0.4F, -0.1F, 0.25F, -0.4F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, -0.4F, -0.1F, 0.25F); // Box 43
		breakActionModel[23].setRotationPoint(0.65F, -3.55F, 0F);

		breakActionModel[24].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, -0.4F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, -0.4F, -0.1F, 0.25F, -0.4F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F); // Box 40
		breakActionModel[24].setRotationPoint(0.65F, -2.75F, 0F);

		breakActionModel[25].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, -0.4F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, -0.4F, -0.1F, 0.25F); // Box 41
		breakActionModel[25].setRotationPoint(0.65F, -4.35F, 0F);

		breakActionModel[26].addShapeBox(0F, 0F, -1F, 2, 1, 2, 0F, -0.4F, -0.15F, 0.05F, -0.2F, -0.15F, 0.05F, -0.2F, -0.15F, 0.05F, -0.4F, -0.15F, 0.05F, -0.4F, -0.15F, 0.05F, -0.2F, -0.15F, 0.05F, -0.2F, -0.15F, 0.05F, -0.4F, -0.15F, 0.05F); // Box 42
		breakActionModel[26].setRotationPoint(1.25F, -3.55F, 0F);

		breakActionModel[27].addShapeBox(0F, 0F, -1F, 2, 1, 2, 0F, -0.4F, -0.1F, -0.65F, -0.2F, -0.1F, -0.65F, -0.2F, -0.1F, -0.65F, -0.4F, -0.1F, -0.65F, -0.4F, -0.15F, 0.05F, -0.2F, -0.15F, 0.05F, -0.2F, -0.15F, 0.05F, -0.4F, -0.15F, 0.05F); // Box 43
		breakActionModel[27].setRotationPoint(1.25F, -4.25F, 0F);

		breakActionModel[28].addShapeBox(0F, 0F, -1F, 2, 1, 2, 0F, -0.4F, -0.15F, 0.05F, -0.2F, -0.15F, 0.05F, -0.2F, -0.15F, 0.05F, -0.4F, -0.15F, 0.05F, -0.4F, -0.1F, -0.65F, -0.2F, -0.1F, -0.65F, -0.2F, -0.1F, -0.65F, -0.4F, -0.1F, -0.65F); // Box 44
		breakActionModel[28].setRotationPoint(1.25F, -2.85F, 0F);

		breakActionModel[29].addShapeBox(-1F, -1.25F, -1F, 2, 3, 2, 0F, -0.3F, -0.1F, -0.65F, -0.3F, -0.1F, -0.65F, -0.3F, -0.1F, -0.65F, -0.3F, -0.1F, -0.65F, -0.3F, -0.5F, -0.65F, -0.3F, -0.5F, -0.65F, -0.3F, -0.5F, -0.65F, -0.3F, -0.5F, -0.65F); // Box 45
		breakActionModel[29].setRotationPoint(2.35F, -3.1F, 0F);

		breakActionModel[30].addShapeBox(-1F, -0.45F, -1.2F, 2, 2, 2, 0F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.65F, -0.3F, -0.3F, -0.65F, -0.3F, -0.32F, -0.7F, -0.3F, -0.32F, -0.7F, -0.3F, -0.32F, -0.65F, -0.3F, -0.32F, -0.65F); // Box 46
		breakActionModel[30].setRotationPoint(2.35F, -3.1F, 0F);
		breakActionModel[30].rotateAngleX = -0.82030475F;

		breakActionModel[31].addShapeBox(-1F, -1.45F, -1.3F, 2, 2, 2, 0F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.65F, -0.3F, -0.3F, -0.65F, -0.3F, -0.32F, -0.7F, -0.3F, -0.32F, -0.7F, -0.3F, -0.32F, -0.65F, -0.3F, -0.32F, -0.65F); // Box 47
		breakActionModel[31].setRotationPoint(2.35F, -3.1F, 0F);
		breakActionModel[31].rotateAngleX = 0.82030475F;

		breakActionModel[32].addShapeBox(-1F, -1.45F, -0.7F, 2, 2, 2, 0F, -0.3F, -0.3F, -0.65F, -0.3F, -0.3F, -0.65F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, -0.3F, -0.32F, -0.65F, -0.3F, -0.32F, -0.65F, -0.3F, -0.32F, -0.7F, -0.3F, -0.32F, -0.7F); // Box 48
		breakActionModel[32].setRotationPoint(2.35F, -3.1F, 0F);
		breakActionModel[32].rotateAngleX = -0.82030475F;

		breakActionModel[33].addShapeBox(-1F, -0.45F, -0.8F, 2, 2, 2, 0F, -0.3F, -0.3F, -0.65F, -0.3F, -0.3F, -0.65F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, -0.7F, -0.3F, -0.32F, -0.65F, -0.3F, -0.32F, -0.65F, -0.3F, -0.32F, -0.7F, -0.3F, -0.32F, -0.7F); // Box 49
		breakActionModel[33].setRotationPoint(2.35F, -3.1F, 0F);
		breakActionModel[33].rotateAngleX = 0.82030475F;

		breakActionModel[34].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 71
		breakActionModel[34].setRotationPoint(0.6F, -3.55F, 0.5F);

		breakActionModel[35].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, -0.35F, -0.15F, 0.05F, -0.35F, -0.15F, 0.05F, -0.35F, -0.15F, 0.05F, -0.35F, -0.15F, 0.05F, -0.35F, -0.15F, 0.05F, -0.35F, -0.15F, 0.05F, -0.35F, -0.15F, 0.05F, -0.35F, -0.15F, 0.05F); // Box 69
		breakActionModel[35].setRotationPoint(0.3F, -3.55F, 0F);

		breakActionModel[36].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, -0.35F, -0.1F, -0.7F, -0.35F, -0.1F, -0.7F, -0.35F, -0.1F, -0.7F, -0.35F, -0.1F, -0.7F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F); // Box 70
		breakActionModel[36].setRotationPoint(0.3F, -4.3F, 0F);

		breakActionModel[37].addShapeBox(0F, 0F, -1F, 1, 1, 2, 0F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, -0.7F, -0.35F, -0.1F, -0.7F, -0.35F, -0.1F, -0.7F, -0.35F, -0.1F, -0.7F); // Box 71
		breakActionModel[37].setRotationPoint(0.3F, -2.8F, 0F);

		breakActionModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, 0.2F, -0.3F, -0.45F, 0.1F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F); // Box 105
		breakActionModel[38].setRotationPoint(9.95F, -5.4F, -0.5F);

		breakActionModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F); // Box 106
		breakActionModel[39].setRotationPoint(10.35F, -5.4F, -0.5F);

		breakActionModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.15F, 0.15F, -0.4F, -0.15F, 0.15F, -0.4F, -0.15F, 0.15F, -0.4F, -0.15F, 0.15F, -0.4F, -0.15F, 0.15F, -0.4F, -0.15F, 0.15F, -0.4F, -0.15F, 0.15F, -0.4F, -0.15F, 0.15F); // Box 118
		breakActionModel[40].setRotationPoint(3.5F, -3.2F, -0.5F);

		breakActionModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.4F, 0.5F, -0.15F, -0.4F, 0.15F, -0.15F, -0.4F, 0.15F, -0.15F, -0.4F, 0.5F, -0.15F, -0.4F, 0.5F, -0.15F, -0.4F, 0.15F, -0.15F, -0.4F, 0.15F, -0.15F, -0.4F, 0.5F); // Box 119
		breakActionModel[41].setRotationPoint(3.25F, -3.65F, -0.5F);

		breakActionModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, 0.5F, -0.35F, -0.4F, 0.5F, -0.35F, -0.4F, 0.5F, -0.35F, -0.4F, 0.5F, -0.35F, -0.4F, 0.5F, -0.35F, -0.4F, 0.5F, -0.35F, -0.4F, 0.5F, -0.35F, -0.4F, 0.5F); // Box 120
		breakActionModel[42].setRotationPoint(2.75F, -3.65F, -0.5F);

		breakActionModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.15F, -0.1F, -0.35F, 0.15F, -0.1F, -0.35F, 0.15F, -0.1F, -0.35F, 0.15F, -0.1F, -0.35F, 0.15F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.15F, -0.4F, -0.3F); // Box 125
		breakActionModel[43].setRotationPoint(9.95F, -4.9F, -0.5F);


		this.modelScale = 0.65F;

		translateAll = new Vector3f(0F, -2.95F, 0.0F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = 0.15F;
	    reloadAnimation = WeaponAnimations.PISTOL;
	    
		hasFlash = false;
	    
        leftArmPos = new Vector3f(0F, -0.65F, 0.12F);
        leftArmRot = new Vector3f(75.0F, 15.0F, -45.0F);
		leftArmReloadPos = new Vector3f(-0.1F, -0.60F, 0.1F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -35.0F);
 
        leftArmChargePos = new Vector3f(-0.27F, -0.40F, 0.07F);
        leftArmChargeRot = new Vector3f(75.0F, 15.0F, -45.0F);       
        
        rightArmPos = new Vector3f(0.5F, -0.52F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -85.0F);
        rightArmReloadPos = new Vector3f(0.53F, -0.5F, 0.015F);
        rightArmReloadRot = new Vector3f(0.0F, 8.0F, -85.0F);
        
        leftHandAmmo = true;
        
        rightArmScale = new Vector3f(0.6F, 0.8F, 0.6F);
        leftArmScale = new Vector3f(0.6F, 0.8F, 0.6F);
		//RecoilSlideDistance = 0.1F;
		//RotateSlideDistance = -2F;

		scopeIsOnSlide = false;
		slideLockOnEmpty = false;
	    
		casingAnimDistance = new Vector3f(-5, -1, 12);
	    casingAnimSpread = new Vector3f(2, 2, 0);
	    casingAnimTime = 8;  
	    casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);
	    
		crouchZoom = -0.15F;
		fancyStance = true;
		sprintRotate = new Vector3f(0.0F, -10.0F, 30.0F);
		sprintTranslate = new Vector3f(0.7F, 0.60F, 0.1F);
		
	    chargeHandleDistance = 0.15F;
	    chargeDelay = 0;
	    chargeDelayAfterReload = 65;
	    chargeTime = 20;
	    
	    actionArm = EnumArm.Left;
	    actionType = EnumAction.Charge;
	    
	    chargeModifier = new Vector3f (0.0F, 0.0F, 0.0F);
	    
		flipAll();
	}
}