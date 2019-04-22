//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.09.2015 - 19:18:09
// Last changed on: 25.09.2015 - 19:18:09

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class tt33 extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public tt33() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[47];
		gunModel[0] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 42
		gunModel[1] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 43
		gunModel[2] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 44
		gunModel[3] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 45
		gunModel[4] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 46
		gunModel[5] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 47
		gunModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 48
		gunModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 49
		gunModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 50
		gunModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 51
		gunModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 52
		gunModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 53
		gunModel[12] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 54
		gunModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 55
		gunModel[14] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 56
		gunModel[15] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 57
		gunModel[16] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 58
		gunModel[17] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 59
		gunModel[18] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 60
		gunModel[19] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 61
		gunModel[20] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 62
		gunModel[21] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 63
		gunModel[22] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 63
		gunModel[23] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 64
		gunModel[24] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 65
		gunModel[25] = new ModelRendererTurbo(this, 0, 19, textureX, textureY); // Box 66
		gunModel[26] = new ModelRendererTurbo(this, 15, 13, textureX, textureY); // Box 67
		gunModel[27] = new ModelRendererTurbo(this, 20, 13, textureX, textureY); // Box 68
		gunModel[28] = new ModelRendererTurbo(this, 20, 13, textureX, textureY); // Box 69
		gunModel[29] = new ModelRendererTurbo(this, 15, 13, textureX, textureY); // Box 70
		gunModel[30] = new ModelRendererTurbo(this, 15, 13, textureX, textureY); // Box 71
		gunModel[31] = new ModelRendererTurbo(this, 20, 13, textureX, textureY); // Box 72
		gunModel[32] = new ModelRendererTurbo(this, 20, 13, textureX, textureY); // Box 73
		gunModel[33] = new ModelRendererTurbo(this, 20, 13, textureX, textureY); // Box 74
		gunModel[34] = new ModelRendererTurbo(this, 20, 13, textureX, textureY); // Box 75
		gunModel[35] = new ModelRendererTurbo(this, 9, 6, textureX, textureY); // Box 76
		gunModel[36] = new ModelRendererTurbo(this, 9, 6, textureX, textureY); // Box 77
		gunModel[37] = new ModelRendererTurbo(this, 9, 6, textureX, textureY); // Box 78
		gunModel[38] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 79
		gunModel[39] = new ModelRendererTurbo(this, 5, 22, textureX, textureY); // Box 89
		gunModel[40] = new ModelRendererTurbo(this, 5, 22, textureX, textureY); // Box 90
		gunModel[41] = new ModelRendererTurbo(this, 9, 3, textureX, textureY); // Box 92
		gunModel[42] = new ModelRendererTurbo(this, 9, 3, textureX, textureY); // Box 93
		gunModel[43] = new ModelRendererTurbo(this, 9, 3, textureX, textureY); // Box 95
		gunModel[44] = new ModelRendererTurbo(this, 9, 3, textureX, textureY); // Box 96
		gunModel[45] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 102
		gunModel[46] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 103

		gunModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.4F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F); // Box 42
		gunModel[0].setRotationPoint(-1F, -3.4F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0.2F, -0.4F, -0.1F, 0.2F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F); // Box 43
		gunModel[1].setRotationPoint(4F, -3.1F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.4F, -0.9F, -0.1F, 0.8F, -0.9F, -0.1F, 0.8F, -0.9F, -0.1F, -0.4F, -0.9F, -0.1F, -0.4F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.4F, 0F, -0.1F); // Box 44
		gunModel[2].setRotationPoint(-1F, -3.6F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.5F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.7F, -0.5F, -0.1F, -0.8F, -0.35F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.8F, -0.35F, -0.3F); // Box 45
		gunModel[3].setRotationPoint(2.8F, -3.1F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.3F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0.3F, -0.45F, -0.1F, 0.3F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F); // Box 46
		gunModel[4].setRotationPoint(2.5F, -3.05F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.45F, -0.1F, 0.8F, -0.45F, -0.1F, 0.8F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.4F, -0.1F, 0.5F, -0.4F, -0.1F, 0.5F, -0.4F, -0.1F, 0F, -0.4F, -0.1F); // Box 47
		gunModel[5].setRotationPoint(-0.6F, -3.05F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.1F, 0.5F, -0.5F, -0.1F, 0.5F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.2F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0F, 0.2F, -0.1F); // Box 48
		gunModel[6].setRotationPoint(-0.6F, -2.95F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.2F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 49
		gunModel[7].setRotationPoint(-0.6F, -1.95F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 50
		gunModel[8].setRotationPoint(-0.6F, -1.95F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F); // Box 51
		gunModel[9].setRotationPoint(-0.6F, -1.05F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0F, 0F, -0.1F, -0.05F, -0.65F, -0.1F, 0F, -0.65F, -0.1F, 0F, -0.65F, -0.1F, -0.05F, -0.65F, -0.1F); // Box 52
		gunModel[10].setRotationPoint(-1.1F, 0.75F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, -0.6F, -0.35F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1F, 0F, -0.1F); // Box 53
		gunModel[11].setRotationPoint(-1.6F, -2.75F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, -0.35F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F); // Box 54
		gunModel[12].setRotationPoint(-1.6F, -3.4F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, -0.35F, -0.8F, -0.1F, -0.6F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.6F, -0.1F, -0.1F); // Box 55
		gunModel[13].setRotationPoint(-1.6F, -3.3F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.1F, -0.25F, -0.8F, -0.1F, -0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F); // Box 56
		gunModel[14].setRotationPoint(-1.6F, -3.6F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.25F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.1F, -0.25F, -0.8F, -0.1F); // Box 57
		gunModel[15].setRotationPoint(-1.6F, -3F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.7F, -0.25F, -0.8F, -0.7F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.7F, -0.3F, 0F, -0.7F); // Box 58
		gunModel[16].setRotationPoint(-1.6F, -3.6F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.25F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.7F, -0.25F, -0.8F, -0.7F); // Box 59
		gunModel[17].setRotationPoint(-1.6F, -3F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.7F, -0.2F, -0.3F, -0.15F, -0.2F, -0.3F, -0.15F, -0.2F, -0.3F, -0.7F, -0.2F, -0.3F); // Box 60
		gunModel[18].setRotationPoint(2.6F, -2.85F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.2F, -0.3F, -0.15F, -0.2F, -0.3F, -0.15F, -0.2F, -0.3F, -0.7F, -0.2F, -0.3F, -0.6F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F); // Box 61
		gunModel[19].setRotationPoint(2.6F, -2.25F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.2F, -0.3F, -0.15F, -0.2F, -0.3F, -0.15F, -0.2F, -0.3F, -0.7F, -0.2F, -0.3F, -0.3F, -0.5F, -0.3F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 62
		gunModel[20].setRotationPoint(2.5F, -1.85F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 63
		gunModel[21].setRotationPoint(2.1F, -2.25F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.8F, -0.1F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, -0.6F, -0.8F, -0.1F, -0.3F, 0.2F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0.2F, -0.1F); // Box 63
		gunModel[22].setRotationPoint(1.1F, -2.25F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, -0.85F, 0F, -0.3F, -0.85F, 0F, -0.3F, 0F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.1F, -0.5F, -0.1F); // Box 64
		gunModel[23].setRotationPoint(1.6F, -1.95F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, -0.1F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.3F, -0.5F, -0.1F, 0F, 0F, -0.1F, -0.85F, 0F, -0.3F, -0.85F, 0F, -0.3F, 0F, 0F, -0.1F); // Box 65
		gunModel[24].setRotationPoint(1.6F, -2.95F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.85F, -0.1F, -0.7F, -0.85F, -0.1F, -0.7F, -0.85F, -0.1F, -0.3F, -0.85F, -0.1F, 0F, 0F, -0.1F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0F, 0F, -0.1F); // Box 66
		gunModel[25].setRotationPoint(1.9F, -3.45F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.5F, 0.3F, 0.1F, -0.5F, 0.3F, 0.1F, -0.5F, 0.3F, 0.1F, 0.5F, 0.3F, 0.1F); // Box 67
		gunModel[26].setRotationPoint(1.11022302462516E-16F, -1.95F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.1F, -0.8F, 0F, -0.05F, -0.8F, 0F, -0.05F, 0F, 0F, 0.1F, 0.5F, 0.3F, 0.1F, -1.3F, 0.3F, -0.05F, -1.3F, 0.3F, -0.05F, 0.5F, 0.3F, 0.1F); // Box 68
		gunModel[27].setRotationPoint(1F, -1.95F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1.3F, 0.3F, -0.05F, 0.5F, 0.3F, 0.1F, 0.5F, 0.3F, 0.1F, -1.3F, 0.3F, -0.05F, -0.8F, 0F, -0.05F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.8F, 0F, -0.05F); // Box 69
		gunModel[28].setRotationPoint(-1.5F, -1.65F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 70
		gunModel[29].setRotationPoint(1.11022302462516E-16F, -2.95F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F); // Box 71
		gunModel[30].setRotationPoint(-0.5F, 0.35F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.4F, -0.1F, -0.7F, -0.6F, -0.05F, -0.7F, -0.6F, -0.05F, -0.1F, -0.4F, -0.1F, 0F, 0F, 0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0F, 0F, 0.1F); // Box 72
		gunModel[31].setRotationPoint(1F, -2.95F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.6F, -0.1F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.1F, -0.9F, -0.6F, -0.1F, -0.8F, 0F, -0.05F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.8F, 0F, -0.05F); // Box 73
		gunModel[32].setRotationPoint(-1F, -2.95F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.1F, -0.8F, 0F, -0.05F, -0.8F, 0F, -0.05F, 0F, 0F, 0.1F, 0.1F, -0.4F, -0.1F, -0.9F, -0.6F, -0.1F, -0.9F, -0.6F, -0.1F, 0.1F, -0.4F, -0.1F); // Box 74
		gunModel[33].setRotationPoint(0.5F, 0.35F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, -0.05F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, -0.8F, 0F, -0.9F, -0.7F, -0.6F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.9F, -0.7F, -0.6F, -0.9F); // Box 75
		gunModel[34].setRotationPoint(-1.5F, 0.35F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, -0.4F, 0F, -0.8F, -0.4F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, -0.9F, -0.4F, -0.9F, -0.8F); // Box 76
		gunModel[35].setRotationPoint(-0.8F, 0.65F, 0.4F);
		gunModel[35].rotateAngleZ = -0.62831853F;

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.8F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, -0.8F, 0F, -0.9F, -0.9F); // Box 77
		gunModel[36].setRotationPoint(-0.8F, 0.65F, 0.4F);
		gunModel[36].rotateAngleZ = -0.62831853F;

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, -0.9F, 0F, -0.6F, -0.9F, 0F, -0.6F, -0.9F, -0.9F, -0.1F, -0.9F, -0.9F); // Box 78
		gunModel[37].setRotationPoint(-0.8F, 0.65F, 0.5F);
		gunModel[37].rotateAngleZ = -0.62831853F;

		gunModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 79
		gunModel[38].setRotationPoint(4.05F, -3.98F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.2F, 0.4F, -0.8F, -0.2F, 0.4F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 89
		gunModel[39].setRotationPoint(2.2F, -4.65F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, -0.9F, -0.2F, 0F, -0.9F, -0.2F); // Box 90
		gunModel[40].setRotationPoint(2.2F, -3.95F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.27F, -0.4F, -0.3F, -0.27F, -0.4F, -0.3F, -0.27F, -0.4F, -0.3F, -0.27F, -0.4F, -0.3F, -0.27F, -0.4F, -0.3F, -0.27F, -0.4F, -0.3F, -0.27F, -0.4F, -0.3F, -0.27F, -0.4F, -0.3F); // Box 92
		gunModel[41].setRotationPoint(-1.3F, -4.4F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.7F, 0F, -0.3F); // Box 93
		gunModel[42].setRotationPoint(-1.3F, -3.67F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.27F, -0.3F, -0.4F, -0.27F, -0.3F, -0.4F, -0.27F, -0.3F, -0.4F, -0.27F, -0.3F, -0.27F, -0.6F, -0.3F, -0.27F, -0.6F, -0.3F, -0.27F, -0.6F, -0.3F, -0.27F, -0.6F, -0.3F); // Box 95
		gunModel[43].setRotationPoint(-1.3F, -4.4F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.27F, -0.6F, -0.3F, -0.27F, -0.6F, -0.3F, -0.27F, -0.6F, -0.3F, -0.27F, -0.6F, -0.3F, -0.4F, -0.27F, -0.3F, -0.4F, -0.27F, -0.3F, -0.4F, -0.27F, -0.3F, -0.4F, -0.27F, -0.3F); // Box 96
		gunModel[44].setRotationPoint(-1.3F, -4.4F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 102
		gunModel[45].setRotationPoint(1.2F, -2.35F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.7F, -0.4F, -1F, -0.7F, -0.4F, -1F, -0.7F, -0.4F, 0F, -0.7F, -0.4F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 103
		gunModel[46].setRotationPoint(2.2F, -2.35F, -0.5F);


		ammoModel = new ModelRendererTurbo[6];
		ammoModel[0] = new ModelRendererTurbo(this, 15, 0, textureX, textureY); // Box 104
		ammoModel[1] = new ModelRendererTurbo(this, 15, 7, textureX, textureY); // Box 105
		ammoModel[2] = new ModelRendererTurbo(this, 20, 10, textureX, textureY); // Box 106
		ammoModel[3] = new ModelRendererTurbo(this, 20, 10, textureX, textureY); // Box 107
		ammoModel[4] = new ModelRendererTurbo(this, 15, 10, textureX, textureY); // Box 108
		ammoModel[5] = new ModelRendererTurbo(this, 15, 10, textureX, textureY); // Box 109

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -1F, 0F, -0.2F, 1.6F, 0F, -0.2F, 1.6F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0.6F, -0.5F, -0.2F, 0.6F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 104
		ammoModel[0].setRotationPoint(-0.9F, -3.35F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.1F, 0.8F, -0.9F, -0.1F, 0.8F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F, 0F, -0.1F, 0.8F, 0F, -0.1F, 0.8F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 105
		ammoModel[1].setRotationPoint(-0.9F, 0.2F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.1F, 0F, -0.25F, 0.7F, 0F, -0.25F, 0.7F, 0F, -0.25F, -1.1F, 0F, -0.25F, -1.1F, -0.5F, -0.25F, 0.7F, -0.5F, -0.25F, 0.7F, -0.5F, -0.25F, -1.1F, -0.5F, -0.25F); // Box 106
		ammoModel[2].setRotationPoint(-0.9F, -3.65F, -0.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.1F, 0F, -0.25F, 0.3F, -0.05F, -0.3F, 0.3F, -0.05F, -0.3F, -1.1F, 0F, -0.25F, -1.1F, -0.5F, -0.25F, 0.3F, -0.55F, -0.3F, 0.3F, -0.55F, -0.3F, -1.1F, -0.5F, -0.25F); // Box 107
		ammoModel[3].setRotationPoint(-0.3F, -3.65F, -0.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.1F, -0.05F, -0.3F, 0.6F, -0.05F, -0.3F, 0.6F, -0.05F, -0.3F, -1.1F, -0.05F, -0.3F, -1.1F, -0.55F, -0.3F, 0.6F, -0.55F, -0.3F, 0.6F, -0.55F, -0.3F, -1.1F, -0.55F, -0.3F); // Box 108
		ammoModel[4].setRotationPoint(-0.1F, -3.65F, -0.5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1.1F, -0.05F, -0.3F, 0.25F, -0.1F, -0.35F, 0.25F, -0.1F, -0.35F, -1.1F, -0.05F, -0.3F, -1.1F, -0.55F, -0.3F, 0.25F, -0.6F, -0.35F, 0.25F, -0.6F, -0.35F, -1.1F, -0.55F, -0.3F); // Box 109
		ammoModel[5].setRotationPoint(0.4F, -3.65F, -0.5F);


		slideModel = new ModelRendererTurbo[55];
		slideModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[1] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 1
		slideModel[2] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 2
		slideModel[3] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 3
		slideModel[4] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 4
		slideModel[5] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 5
		slideModel[6] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 6
		slideModel[7] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 7
		slideModel[8] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 8
		slideModel[9] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 9
		slideModel[10] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 10
		slideModel[11] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 11
		slideModel[12] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 12
		slideModel[13] = new ModelRendererTurbo(this, 0, 13, textureX, textureY); // Box 13
		slideModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 14
		slideModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 15
		slideModel[16] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 16
		slideModel[17] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 17
		slideModel[18] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 18
		slideModel[19] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 19
		slideModel[20] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 20
		slideModel[21] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 21
		slideModel[22] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 22
		slideModel[23] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 23
		slideModel[24] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 24
		slideModel[25] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 25
		slideModel[26] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 26
		slideModel[27] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 27
		slideModel[28] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 28
		slideModel[29] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 30
		slideModel[30] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 31
		slideModel[31] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 32
		slideModel[32] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 33
		slideModel[33] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 34
		slideModel[34] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 35
		slideModel[35] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Box 36
		slideModel[36] = new ModelRendererTurbo(this, 5, 19, textureX, textureY); // Box 37
		slideModel[37] = new ModelRendererTurbo(this, 5, 19, textureX, textureY); // Box 38
		slideModel[38] = new ModelRendererTurbo(this, 20, 0, textureX, textureY); // Box 39
		slideModel[39] = new ModelRendererTurbo(this, 20, 3, textureX, textureY); // Box 40
		slideModel[40] = new ModelRendererTurbo(this, 20, 6, textureX, textureY); // Box 41
		slideModel[41] = new ModelRendererTurbo(this, 10, 19, textureX, textureY); // Box 80
		slideModel[42] = new ModelRendererTurbo(this, 10, 19, textureX, textureY); // Box 81
		slideModel[43] = new ModelRendererTurbo(this, 10, 19, textureX, textureY); // Box 83
		slideModel[44] = new ModelRendererTurbo(this, 10, 19, textureX, textureY); // Box 84
		slideModel[45] = new ModelRendererTurbo(this, 10, 19, textureX, textureY); // Box 85
		slideModel[46] = new ModelRendererTurbo(this, 10, 19, textureX, textureY); // Box 86
		slideModel[47] = new ModelRendererTurbo(this, 10, 19, textureX, textureY); // Box 87
		slideModel[48] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 88
		slideModel[49] = new ModelRendererTurbo(this, 9, 0, textureX, textureY); // Box 97
		slideModel[50] = new ModelRendererTurbo(this, 9, 0, textureX, textureY); // Box 98
		slideModel[51] = new ModelRendererTurbo(this, 9, 0, textureX, textureY); // Box 99
		slideModel[52] = new ModelRendererTurbo(this, 9, 0, textureX, textureY); // Box 100
		slideModel[53] = new ModelRendererTurbo(this, 9, 0, textureX, textureY); // Box 101
		slideModel[54] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 107

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.7F, -0.6F, -0.35F, -0.7F, -0.6F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, 0F, -0.7F, -0.6F, 0F, -0.7F, -0.6F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 0
		slideModel[0].setRotationPoint(-1F, -4F, -0.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.35F, -0.35F, -0.05F, 0.1F, -0.35F, -0.05F, 0.1F, -0.35F, -0.05F, 0.35F, -0.35F, -0.05F, 0.35F, 0F, -0.05F, 0.1F, 0F, -0.05F, 0.1F, 0F, -0.05F, 0.35F, 0F, -0.05F); // Box 1
		slideModel[1].setRotationPoint(1F, -4F, -0.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.05F, -0.8F, -0.35F, -0.05F, -0.8F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, 0F, -0.05F, -0.8F, -0.3F, -0.05F, -0.8F, -0.3F, -0.05F, 0F, 0F, -0.05F); // Box 2
		slideModel[2].setRotationPoint(5.1F, -4F, -0.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.05F, 0.6F, -0.35F, -0.05F, 0.6F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.3F, -0.05F, 0.6F, -0.3F, -0.05F, 0.6F, -0.3F, -0.05F, 0F, -0.3F, -0.05F); // Box 3
		slideModel[3].setRotationPoint(5.3F, -4F, -0.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.8F, -0.15F, 0.3F, -0.8F, -0.15F, 0.3F, -0.8F, -0.15F, 0F, -0.8F, -0.15F, 0F, 0F, -0.05F, 0.3F, 0F, -0.05F, 0.3F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 4
		slideModel[4].setRotationPoint(3.6F, -4.65F, -0.5F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.85F, -0.15F, 0.3F, -0.85F, -0.15F, 0.3F, -0.85F, -0.15F, 0F, -0.85F, -0.15F); // Box 5
		slideModel[5].setRotationPoint(3.6F, -4F, -0.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.25F, -0.8F, -0.7F, 0.2F, -0.8F, -0.7F, 0.2F, -0.8F, -0.15F, -0.25F, -0.8F, -0.15F, 0F, 0F, -0.7F, 0.2F, 0F, -0.7F, 0.2F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 6
		slideModel[6].setRotationPoint(-1F, -4.65F, -0.5F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.25F, -0.85F, -0.15F, 0.2F, -0.85F, -0.15F, 0.2F, -0.85F, -0.15F, -0.25F, -0.85F, -0.15F); // Box 7
		slideModel[7].setRotationPoint(-1F, -4F, -0.5F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.6F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.85F, -0.6F, 0.4F, -0.85F, -0.6F, 0.4F, -0.85F, -0.15F, 0F, -0.85F, -0.15F); // Box 8
		slideModel[8].setRotationPoint(2.2F, -4F, -0.5F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.6F, 0.4F, -0.8F, -0.6F, 0.4F, -0.8F, -0.15F, 0F, -0.8F, -0.15F, 0F, 0F, -0.6F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 9
		slideModel[9].setRotationPoint(2.2F, -4.65F, -0.5F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -0.35F, -0.7F, 0F, -0.35F, -0.7F, 0F, -0.35F, -0.05F, -1F, -0.35F, -0.05F, -0.75F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.05F, -0.75F, -0.3F, -0.05F); // Box 10
		slideModel[10].setRotationPoint(-2F, -4F, -0.5F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.7F, -1F, -0.35F, -0.7F, -0.75F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.7F, -0.75F, -0.3F, -0.7F); // Box 11
		slideModel[11].setRotationPoint(-2F, -4F, -0.5F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.7F, -0.75F, -0.3F, -0.7F, -0.7F, -0.4F, -0.05F, 0F, -0.4F, -0.05F, 0F, -0.4F, -0.7F, -0.7F, -0.4F, -0.7F); // Box 12
		slideModel[12].setRotationPoint(-2F, -3.6F, -0.5F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.05F, -0.75F, -0.3F, -0.05F, -0.7F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.05F, -0.7F, -0.4F, -0.05F); // Box 13
		slideModel[13].setRotationPoint(-2F, -3.6F, -0.5F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.1F, 0.25F, -0.35F, -0.1F, 0.25F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 14
		slideModel[14].setRotationPoint(-0.6F, -4F, -0.5F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.1F, -0.6F, -0.35F, -0.1F, -0.6F, -0.35F, -0.7F, 0F, -0.35F, -0.7F, 0F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 15
		slideModel[15].setRotationPoint(-1F, -4F, -0.5F);

		slideModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.95F, -0.95F, -0.35F, -0.95F, -0.95F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F, -0.95F, 0F, 0F, 0F, 0F, 0F); // Box 16
		slideModel[16].setRotationPoint(-0.95F, -4F, -0.55F);

		slideModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.95F, -0.95F, -0.35F, -0.95F, -0.95F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F, -0.95F, 0F, 0F, 0F, 0F, 0F); // Box 17
		slideModel[17].setRotationPoint(-0.85F, -4F, -0.55F);

		slideModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.95F, -0.95F, -0.35F, -0.95F, -0.95F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F, -0.95F, 0F, 0F, 0F, 0F, 0F); // Box 18
		slideModel[18].setRotationPoint(-0.75F, -4F, -0.55F);

		slideModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.95F, -0.95F, -0.35F, -0.95F, -0.95F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F, -0.95F, 0F, 0F, 0F, 0F, 0F); // Box 19
		slideModel[19].setRotationPoint(-0.65F, -4F, -0.55F);

		slideModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, 0F, -0.95F, -0.35F, 0F, -0.95F, -0.35F, -0.95F, 0F, -0.35F, -0.95F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 20
		slideModel[20].setRotationPoint(-0.95F, -4F, -0.45F);

		slideModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, 0F, -0.95F, -0.35F, 0F, -0.95F, -0.35F, -0.95F, 0F, -0.35F, -0.95F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 21
		slideModel[21].setRotationPoint(-0.85F, -4F, -0.45F);

		slideModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, 0F, -0.95F, -0.35F, 0F, -0.95F, -0.35F, -0.95F, 0F, -0.35F, -0.95F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 22
		slideModel[22].setRotationPoint(-0.75F, -4F, -0.45F);

		slideModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, 0F, -0.95F, -0.35F, 0F, -0.95F, -0.35F, -0.95F, 0F, -0.35F, -0.95F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 23
		slideModel[23].setRotationPoint(-0.65F, -4F, -0.45F);

		slideModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, 0F, -0.05F, -0.95F, 0F, -0.05F, -0.95F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 24
		slideModel[24].setRotationPoint(-0.55F, -4F, -0.5F);

		slideModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, 0F, -0.05F, -0.95F, 0F, -0.05F, -0.95F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 25
		slideModel[25].setRotationPoint(-0.45F, -4F, -0.5F);

		slideModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, 0F, -0.05F, -0.95F, 0F, -0.05F, -0.95F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 26
		slideModel[26].setRotationPoint(-0.35F, -4F, -0.5F);

		slideModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, 0F, -0.05F, -0.95F, 0F, -0.05F, -0.95F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 27
		slideModel[27].setRotationPoint(-0.25F, -4F, -0.5F);

		slideModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, 0F, -0.05F, -0.95F, 0F, -0.05F, -0.95F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 28
		slideModel[28].setRotationPoint(-0.15F, -4F, -0.5F);

		slideModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, 0F, -0.05F, -0.95F, 0F, -0.05F, -0.95F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 30
		slideModel[29].setRotationPoint(0.55F, -4F, -0.5F);

		slideModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, 0F, -0.05F, -0.95F, 0F, -0.05F, -0.95F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 31
		slideModel[30].setRotationPoint(0.45F, -4F, -0.5F);

		slideModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, 0F, -0.05F, -0.95F, 0F, -0.05F, -0.95F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 32
		slideModel[31].setRotationPoint(0.35F, -4F, -0.5F);

		slideModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, 0F, -0.05F, -0.95F, 0F, -0.05F, -0.95F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 33
		slideModel[32].setRotationPoint(0.25F, -4F, -0.5F);

		slideModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, 0F, -0.05F, -0.95F, 0F, -0.05F, -0.95F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 34
		slideModel[33].setRotationPoint(-0.0499999999999999F, -4F, -0.5F);

		slideModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, 0F, -0.05F, -0.95F, 0F, -0.05F, -0.95F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 35
		slideModel[34].setRotationPoint(0.0500000000000002F, -4F, -0.5F);

		slideModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, -0.95F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, 0F, -0.05F, -0.95F, 0F, -0.05F, -0.95F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 36
		slideModel[35].setRotationPoint(0.15F, -4F, -0.5F);

		slideModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.05F, 0.6F, -0.4F, -0.05F, 0.6F, -0.4F, -0.05F, 0F, -0.4F, -0.05F, 0F, -0.3F, -0.2F, 0.6F, -0.3F, -0.2F, 0.6F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 37
		slideModel[36].setRotationPoint(5.3F, -3.7F, -0.5F);

		slideModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.05F, -0.8F, -0.4F, -0.05F, -0.8F, -0.4F, -0.05F, -0.2F, -0.4F, -0.05F, 0F, -0.3F, -0.05F, -0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, 0F, -0.3F, -0.05F); // Box 38
		slideModel[37].setRotationPoint(5.1F, -3.7F, -0.5F);

		slideModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 39
		slideModel[38].setRotationPoint(5F, -3.4F, -0.5F);

		slideModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.25F, -0.1F, -0.45F, -0.25F, -0.1F, -0.45F, -0.25F, 0F, -0.45F, -0.25F); // Box 40
		slideModel[39].setRotationPoint(5F, -3.25F, -0.5F);

		slideModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.45F, -0.25F, -0.1F, -0.45F, -0.25F, -0.1F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.43F, -0.4F, -0.1F, -0.43F, -0.4F, -0.1F, -0.43F, -0.4F, 0F, -0.43F, -0.4F); // Box 41
		slideModel[40].setRotationPoint(5F, -3.15F, -0.5F);

		slideModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, -0.9F, -0.2F, -0.1F, -0.9F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, -0.9F, -0.6F, -0.1F); // Box 80
		slideModel[41].setRotationPoint(5.95F, -3.8F, -0.5F);

		slideModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, -0.9F, -0.2F, -0.1F, -0.9F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, -0.9F, -0.4F, -0.25F); // Box 81
		slideModel[42].setRotationPoint(5.95F, -3.6F, -0.5F);

		slideModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F, -0.9F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, -0.9F, -0.6F, -0.1F); // Box 83
		slideModel[43].setRotationPoint(5.95F, -4F, -0.5F);

		slideModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.65F, -0.45F, 0F, -0.65F, -0.45F, 0F, -0.65F, -0.45F, -0.9F, -0.65F, -0.45F, -0.9F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F); // Box 84
		slideModel[44].setRotationPoint(5.95F, -4.6F, -0.5F);

		slideModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, -0.9F, -0.2F, -0.25F, -0.9F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, -0.9F, -0.6F, -0.25F); // Box 85
		slideModel[45].setRotationPoint(5.95F, -3.2F, -0.5F);

		slideModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, -0.9F, -0.2F, -0.25F, -0.9F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, -0.9F, -0.7F, -0.3F); // Box 86
		slideModel[46].setRotationPoint(5.95F, -3F, -0.5F);

		slideModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.9F, -0.2F, -0.3F, -0.9F, -0.72F, -0.4F, 0F, -0.72F, -0.4F, 0F, -0.72F, -0.4F, -0.9F, -0.72F, -0.4F); // Box 87
		slideModel[47].setRotationPoint(5.95F, -2.9F, -0.5F);

		slideModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 88
		slideModel[48].setRotationPoint(5F, -3.4F, -0.5F);

		slideModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.92F, -0.45F, -0.78F, -0.97F, -0.45F, -0.78F, -0.97F, -0.45F, 0F, -0.92F, -0.45F, 0F, 0.1F, -0.45F, -0.76F, 0.1F, -0.45F, -0.76F, 0.1F, -0.45F, 0F, 0.1F, -0.45F); // Box 97
		slideModel[49].setRotationPoint(6.52F, -5.1F, -0.5F);

		slideModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.85F, -0.15F, -0.8F, -0.85F, -0.15F, -0.8F, -0.85F, -0.15F, 0F, -0.85F, -0.15F, 0F, 0F, -0.15F, -0.8F, 0F, -0.15F, -0.8F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 98
		slideModel[50].setRotationPoint(-0.3F, -4.85F, -0.5F);

		slideModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.85F, -0.25F, -0.85F, -0.85F, -0.25F, -0.85F, -0.85F, -0.25F, -0.05F, -0.85F, -0.25F, 0F, 0F, -0.15F, -0.8F, 0F, -0.15F, -0.8F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 99
		slideModel[51].setRotationPoint(-0.3F, -5F, -0.5F);

		slideModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.93F, -0.25F, -0.85F, -0.93F, -0.25F, -0.85F, -0.93F, -0.55F, -0.05F, -0.93F, -0.55F, -0.05F, 0F, -0.25F, -0.85F, 0F, -0.25F, -0.85F, 0F, -0.55F, -0.05F, 0F, -0.55F); // Box 100
		slideModel[52].setRotationPoint(-0.3F, -5.15F, -0.5F);

		slideModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.93F, -0.55F, -0.85F, -0.93F, -0.55F, -0.85F, -0.93F, -0.25F, -0.05F, -0.93F, -0.25F, -0.05F, 0F, -0.55F, -0.85F, 0F, -0.55F, -0.85F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 101
		slideModel[53].setRotationPoint(-0.3F, -5.15F, -0.5F);

		slideModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.25F, -0.8F, -0.15F, 0.2F, -0.8F, -0.15F, 0.2F, -0.8F, -0.7F, -0.25F, -0.8F, -0.7F, 0F, 0F, -0.05F, 0.2F, 0F, -0.05F, 0.2F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 107
		slideModel[54].setRotationPoint(-1F, -4.65F, -0.5F);


		this.modelScale = 0.9F;

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