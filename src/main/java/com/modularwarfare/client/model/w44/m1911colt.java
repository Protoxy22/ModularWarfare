//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.05.2017 - 14:37:47
// Last changed on: 18.05.2017 - 14:37:47

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class m1911colt extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public m1911colt() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[52];
		gunModel[0] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 24
		gunModel[1] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 25
		gunModel[2] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 26
		gunModel[3] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 27
		gunModel[4] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 28
		gunModel[5] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 29
		gunModel[6] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 30
		gunModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 31
		gunModel[8] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 32
		gunModel[9] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 33
		gunModel[10] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 34
		gunModel[11] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 35
		gunModel[12] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 36
		gunModel[13] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 37
		gunModel[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 38
		gunModel[15] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 39
		gunModel[16] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 40
		gunModel[17] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 41
		gunModel[18] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 42
		gunModel[19] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 43
		gunModel[20] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 44
		gunModel[21] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 45
		gunModel[22] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 46
		gunModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 47
		gunModel[24] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 48
		gunModel[25] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 50
		gunModel[26] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 51
		gunModel[27] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 52
		gunModel[28] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 58
		gunModel[29] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 59
		gunModel[30] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 60
		gunModel[31] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 61
		gunModel[32] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 62
		gunModel[33] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 63
		gunModel[34] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 64
		gunModel[35] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 65
		gunModel[36] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 66
		gunModel[37] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 67
		gunModel[38] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 68
		gunModel[39] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 69
		gunModel[40] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 70
		gunModel[41] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 71
		gunModel[42] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 72
		gunModel[43] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 73
		gunModel[44] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 74
		gunModel[45] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 75
		gunModel[46] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 76
		gunModel[47] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 77
		gunModel[48] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 78
		gunModel[49] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 79
		gunModel[50] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 87
		gunModel[51] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 88

		gunModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.1F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 24
		gunModel[0].setRotationPoint(2.45F, -3.9F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.1F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.1F, 0F, -0.3F); // Box 25
		gunModel[1].setRotationPoint(2.45F, -3.6F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, -0.6F, -0.7F, -0.1F, -0.6F, 0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.6F, 0.2F, -0.1F); // Box 26
		gunModel[2].setRotationPoint(1.55F, -3.9F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.2F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0.2F, -0.7F, -0.1F, 0.8F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0.8F, 0.2F, -0.1F); // Box 27
		gunModel[3].setRotationPoint(-1.85F, -3.9F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.8F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.8F, 0F, -0.1F, 0.2F, -0.6F, -0.1F, 0.1F, -0.6F, -0.1F, 0.1F, -0.6F, -0.1F, 0.2F, -0.6F, -0.1F); // Box 28
		gunModel[4].setRotationPoint(-1.85F, -2.7F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.2F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.1F, -0.6F, -0.1F, 0.1F, -0.6F, -0.1F, 0.1F, -0.6F, -0.1F, 0.1F, -0.6F, -0.1F); // Box 29
		gunModel[5].setRotationPoint(-1.85F, -2.3F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.15F, -0.8F, -0.1F, 0.3F, -0.8F, -0.1F, 0.3F, -0.8F, -0.1F, 0.15F, -0.8F, -0.1F, 0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.2F, 0F, -0.1F); // Box 30
		gunModel[6].setRotationPoint(-1.85F, -2.3F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.1F, -0.8F, -0.1F, 0.1F, -0.8F, -0.1F, 0.1F, -0.8F, -0.1F, 0.1F, -0.8F, -0.1F, 0.1F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 31
		gunModel[7].setRotationPoint(-1.85F, -2.7F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.1F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0.1F, -0.7F, -0.1F, 0.2F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.2F, 0F, -0.1F); // Box 32
		gunModel[8].setRotationPoint(-1.95F, -2F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0.9F, 0.2F, -0.1F, -1F, 0.5F, -0.1F, -1F, 0.5F, -0.1F, 0.9F, 0.2F, -0.1F); // Box 33
		gunModel[9].setRotationPoint(-2.15F, -1F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.1F, -0.8F, -0.1F, 0.3F, -0.8F, -0.1F, 0.3F, -0.8F, -0.1F, 0.1F, -0.8F, -0.1F, 0.15F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.15F, 0F, -0.1F); // Box 34
		gunModel[10].setRotationPoint(-1.85F, -2.5F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, -0.9F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, -0.6F, -0.9F, -0.1F, -0.7F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.7F, 0.1F, -0.3F); // Box 35
		gunModel[11].setRotationPoint(1.55F, -3.6F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0.5F, -0.7F, -0.1F, 0.3F, -0.1F, -0.3F, 0.1F, -0.1F, -0.3F, 0.1F, -0.1F, -0.3F, 0.3F, -0.1F, -0.3F); // Box 36
		gunModel[12].setRotationPoint(1.15F, -3.4F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0F, 0F, -0.1F, 0F, -0.6F, -0.1F, -0.7F, -0.6F, -0.3F, -0.7F, -0.6F, -0.3F, 0F, -0.6F, -0.1F); // Box 37
		gunModel[13].setRotationPoint(0.25F, -2.3F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.6F, -0.1F, -0.4F, -0.8F, -0.3F, -0.4F, -0.8F, -0.3F, -0.4F, -0.6F, -0.1F, 0F, 0F, -0.1F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0F, 0F, -0.1F); // Box 38
		gunModel[14].setRotationPoint(0.25F, -3.3F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0F, -0.1F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.1F, 0F, -0.1F, -0.1F, -0.8F, -0.1F, -0.7F, -0.8F, -0.3F, -0.7F, -0.8F, -0.3F, -0.1F, -0.8F, -0.1F); // Box 39
		gunModel[15].setRotationPoint(0.35F, -1.7F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, -0.1F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0.1F, 0F, -0.1F, -0.1F, -0.8F, -0.1F, -0.7F, -0.8F, -0.3F, -0.7F, -0.8F, -0.3F, -0.1F, -0.8F, -0.1F); // Box 40
		gunModel[16].setRotationPoint(0.35F, -1.9F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.8F, -0.1F, -0.7F, -0.8F, -0.3F, -0.7F, -0.8F, -0.3F, -0.1F, -0.8F, -0.1F, 0.3F, 0F, -0.1F, -1.1F, 0F, -0.3F, -1.1F, 0F, -0.3F, 0.3F, 0F, -0.1F); // Box 41
		gunModel[17].setRotationPoint(0.35F, -2.3F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.7F, -0.1F, -0.7F, -0.7F, -0.3F, -0.7F, -0.7F, -0.3F, -0.1F, -0.7F, -0.1F, 0.3F, 0F, -0.1F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0.3F, 0F, -0.1F); // Box 42
		gunModel[18].setRotationPoint(-0.05F, -2F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.3F, 0F, -0.1F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0.3F, 0F, -0.1F, 1.1F, -0.5F, -0.1F, -1.8F, -0.45F, -0.3F, -1.8F, -0.45F, -0.3F, 1.1F, -0.5F, -0.1F); // Box 43
		gunModel[19].setRotationPoint(-0.05F, -1F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.7F, -0.7F, -0.35F, -0.1F, -0.7F, -0.35F, -0.1F, -0.7F, -0.35F, -0.7F, -0.7F, -0.35F); // Box 44
		gunModel[20].setRotationPoint(1.25F, -2.5F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.7F, -0.35F, -0.1F, -0.7F, -0.35F, -0.1F, -0.7F, -0.35F, -0.7F, -0.7F, -0.35F, -0.7F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.7F, 0F, -0.35F); // Box 45
		gunModel[21].setRotationPoint(1.25F, -2.9F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, -0.35F, 0F, -0.8F, -0.35F, 0F, -0.8F, -0.35F, 0F, -0.8F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 46
		gunModel[22].setRotationPoint(-0.35F, -2.4F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.3F, -0.5F, -0.35F, -0.2F, -0.3F, -0.35F, -0.7F, -0.1F, -0.35F, -0.7F, -0.1F, -0.35F, -0.2F, -0.3F, -0.35F); // Box 47
		gunModel[23].setRotationPoint(1.65F, -2.4F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.35F, -0.8F, -0.7F, -0.35F, -0.8F, -0.7F, -0.35F, 0F, -0.8F, -0.35F, 0F, 0F, -0.35F, -0.7F, -0.1F, -0.35F, -0.7F, -0.1F, -0.35F, 0F, 0F, -0.35F); // Box 48
		gunModel[24].setRotationPoint(1.65F, -2.4F, -0.5F);

		gunModel[25].addShapeBox(0.3F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.4F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.25F, 0.1F); // Box 50
		gunModel[25].setRotationPoint(-1.25F, -3.4F, -0.5F);
		gunModel[25].rotateAngleZ = -0.33161256F;

		gunModel[26].addShapeBox(1.3F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.1F, 0.1F, -0.6F, -0.2F, -0.05F, -0.6F, -0.2F, -0.05F, 0F, -0.1F, 0.1F, 0F, -0.4F, 0.1F, -0.7F, -0.5F, -0.05F, -0.7F, -0.5F, -0.05F, 0F, -0.4F, 0.1F); // Box 51
		gunModel[26].setRotationPoint(-1.25F, -3.4F, -0.5F);
		gunModel[26].rotateAngleZ = -0.33161256F;

		gunModel[27].addShapeBox(-0.7F, 0.3F, 0F, 1, 5, 1, 0F, -0.7F, -0.3F, -0.05F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, -0.7F, -0.3F, -0.05F, -0.7F, -0.7F, -0.05F, 0F, -0.55F, 0.1F, 0F, -0.55F, 0.1F, -0.7F, -0.7F, -0.05F); // Box 52
		gunModel[27].setRotationPoint(-1.25F, -3.4F, -0.5F);
		gunModel[27].rotateAngleZ = -0.33161256F;

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.2F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.2F, 0.9F, 0.15F, -0.2F, -1.8F, 0.2F, -0.1F, -1.8F, 0.2F, -0.1F, 0.9F, 0.15F, -0.2F); // Box 58
		gunModel[28].setRotationPoint(-2.25F, -1F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.7F, -0.2F, -0.8F, -0.7F, -0.1F, -0.8F, -0.7F, -0.1F, -0.1F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.1F, 0F, 0F, -0.2F); // Box 59
		gunModel[29].setRotationPoint(-2.25F, -2F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.8F, -0.2F, -0.8F, -0.8F, -0.1F, -0.8F, -0.8F, -0.1F, -0.1F, -0.8F, -0.2F, -0.05F, 0F, -0.2F, -0.85F, 0F, -0.1F, -0.85F, 0F, -0.1F, -0.05F, 0F, -0.2F); // Box 60
		gunModel[30].setRotationPoint(-2.2F, -2.3F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.8F, -0.2F, -0.8F, -0.8F, -0.1F, -0.8F, -0.8F, -0.1F, -0.1F, -0.8F, -0.2F, -0.05F, 0F, -0.2F, -0.85F, 0F, -0.1F, -0.85F, 0F, -0.1F, -0.05F, 0F, -0.2F); // Box 61
		gunModel[31].setRotationPoint(-2.15F, -2.5F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.8F, -0.2F, -0.8F, -0.8F, -0.1F, -0.8F, -0.8F, -0.1F, -0.1F, -0.8F, -0.2F, -0.1F, 0F, -0.2F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.1F, 0F, -0.2F); // Box 62
		gunModel[32].setRotationPoint(-2.15F, -2.7F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.65F, -0.2F, -0.9F, -0.6F, -0.1F, -0.9F, -0.6F, -0.1F, 0F, -0.65F, -0.2F, -0.1F, 0F, -0.2F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.1F, 0F, -0.2F); // Box 63
		gunModel[33].setRotationPoint(-2.15F, -2.9F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.2F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.4F, -0.2F, -0.2F, -0.9F, -0.55F, -0.2F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, -0.9F, -0.55F, -0.2F); // Box 64
		gunModel[34].setRotationPoint(-3.05F, -2.7F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F); // Box 65
		gunModel[35].setRotationPoint(-3.05F, -2.7F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F); // Box 66
		gunModel[36].setRotationPoint(-3.05F, -2.9F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.4F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.4F, -1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.9F, 0.15F, -0.3F, -0.9F, 0.15F, -0.3F, -0.1F, -0.1F, -0.3F); // Box 67
		gunModel[37].setRotationPoint(-3.25F, -1F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, -0.1F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.7F, -0.1F, -0.35F, -0.6F, -0.7F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.6F, -0.7F, -0.35F); // Box 68
		gunModel[38].setRotationPoint(-2.85F, -4.1F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.6F, 0.1F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.6F, 0.1F, -0.35F, -0.5F, -1F, -0.35F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F, -0.35F, -0.5F, -1F, -0.35F); // Box 69
		gunModel[39].setRotationPoint(-3.15F, -4F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, 0.2F, -0.15F, -0.35F, 0.2F, -0.65F, -0.15F, 0F, -0.65F, -0.15F, 0F, -0.65F, -0.15F, 0.2F, -0.65F, -0.15F); // Box 70
		gunModel[40].setRotationPoint(3.35F, -4.3F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F); // Box 71
		gunModel[41].setRotationPoint(5.35F, -3.6F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0.2F, -0.35F, -0.15F, 0.2F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0F, -0.35F, -0.15F, 0.2F, -0.35F, -0.15F); // Box 72
		gunModel[42].setRotationPoint(3.35F, -4.3F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, -0.65F, -0.15F, 0F, -0.65F, -0.15F, 0F, -0.65F, -0.15F, 0.2F, -0.65F, -0.15F, 0.2F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, 0F, -0.15F, -0.35F, 0.2F, -0.15F, -0.35F); // Box 73
		gunModel[43].setRotationPoint(3.35F, -4.3F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, -0.4F, -0.7F, -0.6F, -0.4F, -0.7F, -0.6F, -0.4F, 0F, -0.6F, -0.4F); // Box 74
		gunModel[44].setRotationPoint(0.45F, -2.3F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, 0F, -0.6F, -0.4F); // Box 75
		gunModel[45].setRotationPoint(0.45F, -1.9F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 76
		gunModel[46].setRotationPoint(0.45F, -3.3F, -0.5F);

		gunModel[47].addShapeBox(0F, -0.4F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.7F, -0.8F, -0.3F, -0.7F, -0.8F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.7F, -0.8F, -0.3F, -0.7F, -0.8F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 77
		gunModel[47].setRotationPoint(-2.95F, 1.1F, -0.5F);
		gunModel[47].rotateAngleZ = -0.15707963F;

		gunModel[48].addShapeBox(0F, -0.3F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.2F, -0.8F, -0.6F, -0.2F, -0.8F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 78
		gunModel[48].setRotationPoint(-2.95F, 1.1F, -0.5F);
		gunModel[48].rotateAngleZ = -0.15707963F;

		gunModel[49].addShapeBox(0F, -0.4F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.7F, 0F, -0.3F, -0.7F); // Box 79
		gunModel[49].setRotationPoint(-2.95F, 1.1F, -0.5F);
		gunModel[49].rotateAngleZ = -0.15707963F;

		gunModel[50].addShapeBox(0.4F, 0.1F, 0F, 1, 1, 1, 0F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F); // Box 87
		gunModel[50].setRotationPoint(-1.45F, -3.2F, -0.5F);
		gunModel[50].rotateAngleZ = -0.29670597F;

		gunModel[51].addShapeBox(0.4F, 3.5F, 0F, 1, 1, 1, 0F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F); // Box 88
		gunModel[51].setRotationPoint(-1.45F, -3.2F, -0.5F);
		gunModel[51].rotateAngleZ = -0.29670597F;


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 80
		ammoModel[1] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 81
		ammoModel[2] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 82

		ammoModel[0].addShapeBox(0.3F, 0.0499999999999998F, 0F, 1, 4, 1, 0F, -0.3F, 0F, -0.2F, 0.6F, 0F, -0.2F, 0.6F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 80
		ammoModel[0].setRotationPoint(-2.05F, -2.7F, -0.5F);
		ammoModel[0].rotateAngleZ = -0.17453293F;

		ammoModel[1].addShapeBox(0.3F, 5.05F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.9F, -0.1F, 0.3F, -0.9F, -0.1F, 0.3F, -0.9F, -0.1F, 0F, -0.9F, -0.1F); // Box 81
		ammoModel[1].setRotationPoint(-2.05F, -3.7F, -0.5F);
		ammoModel[1].rotateAngleZ = -0.17453293F;

		ammoModel[2].addShapeBox(1.3F, 5.05F, 0F, 1, 1, 1, 0F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, -0.9F, -0.1F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.1F); // Box 82
		ammoModel[2].setRotationPoint(-2.05F, -3.7F, -0.5F);
		ammoModel[2].rotateAngleZ = -0.17453293F;


		slideModel = new ModelRendererTurbo[34];
		slideModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		slideModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		slideModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		slideModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		slideModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		slideModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 5
		slideModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 6
		slideModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 7
		slideModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 8
		slideModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 10
		slideModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 12
		slideModel[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 14
		slideModel[12] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 15
		slideModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 16
		slideModel[14] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 17
		slideModel[15] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 18
		slideModel[16] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 19
		slideModel[17] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 20
		slideModel[18] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 21
		slideModel[19] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 22
		slideModel[20] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 53
		slideModel[21] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 54
		slideModel[22] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 55
		slideModel[23] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 56
		slideModel[24] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 57
		slideModel[25] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 58
		slideModel[26] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 59
		slideModel[27] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 55
		slideModel[28] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 56
		slideModel[29] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 57
		slideModel[30] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 83
		slideModel[31] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 84
		slideModel[32] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 85
		slideModel[33] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 86

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 0
		slideModel[0].setRotationPoint(0.05F, -4F, -0.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.1F, -0.15F, 0F, -0.1F, -0.15F, 0F, -0.1F, -0.15F, 0.2F, -0.1F, -0.15F, 0.2F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0.2F, -0.5F, -0.15F); // Box 1
		slideModel[1].setRotationPoint(5.25F, -3.5F, -0.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 2
		slideModel[2].setRotationPoint(2.25F, -4F, -0.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0.1F, -0.6F, 0F); // Box 3
		slideModel[3].setRotationPoint(-1.95F, -4F, -0.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 4
		slideModel[4].setRotationPoint(-1.95F, -4F, -0.5F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 5
		slideModel[5].setRotationPoint(5.25F, -4F, -0.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.2F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, -0.7F, -0.2F, 0F); // Box 6
		slideModel[6].setRotationPoint(3.75F, -4F, -0.5F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F); // Box 7
		slideModel[7].setRotationPoint(1.25F, -4F, -0.5F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, -0.5F, -0.2F, -0.05F); // Box 8
		slideModel[8].setRotationPoint(-1.95F, -4F, -0.5F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, 0F, 0.5F, -0.7F, 0F); // Box 10
		slideModel[9].setRotationPoint(1.25F, -4F, -0.5F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.1F, -0.8F, -0.15F, -0.3F, -0.8F, -0.15F, -0.3F, -0.8F, -0.15F, -0.1F, -0.8F, -0.15F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 12
		slideModel[10].setRotationPoint(-1.95F, -5F, -0.5F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.15F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.15F, -0.9F, -0.3F, -0.1F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.1F, 0F, -0.15F); // Box 14
		slideModel[11].setRotationPoint(-1.95F, -5.2F, -0.5F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.8F, -0.15F, 0F, -0.8F, -0.15F, 0F, -0.8F, -0.15F, 0F, -0.8F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		slideModel[12].setRotationPoint(2.25F, -5F, -0.5F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 16
		slideModel[13].setRotationPoint(2.25F, -5.2F, -0.5F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.8F, -0.7F, 0F, -0.8F, -0.7F, 0F, -0.8F, -0.15F, -0.5F, -0.8F, -0.15F, -0.5F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 17
		slideModel[14].setRotationPoint(0.25F, -5F, -0.5F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, -0.9F, -0.7F, 0F, -0.9F, -0.7F, 0F, -0.9F, -0.3F, -0.5F, -0.9F, -0.3F, -0.5F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F); // Box 18
		slideModel[15].setRotationPoint(0.25F, -5.2F, -0.5F);

		slideModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, -0.15F, -0.2F, -0.1F, -0.15F, -0.2F, -0.1F, -0.15F, -0.2F, -0.3F, -0.15F, -0.2F, -0.5F, -0.15F, -0.2F, -0.5F, -0.15F, -0.2F, -0.5F, -0.15F, -0.2F, -0.5F, -0.15F); // Box 19
		slideModel[16].setRotationPoint(4.25F, -3.5F, -0.5F);

		slideModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.8F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0.8F, -0.5F, -0.15F, 0.8F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0.8F, -0.2F, -0.3F); // Box 20
		slideModel[17].setRotationPoint(5.25F, -3.5F, -0.5F);

		slideModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.15F, 0F, -0.9F, -0.15F, 0F, -0.9F, -0.15F, 0.2F, -0.9F, -0.15F); // Box 21
		slideModel[18].setRotationPoint(5.25F, -3.5F, -0.5F);

		slideModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.9F, -0.15F, -0.2F, -0.9F, -0.15F, -0.2F, -0.7F, 0F); // Box 22
		slideModel[19].setRotationPoint(4.25F, -3.5F, -0.5F);

		slideModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 53
		slideModel[20].setRotationPoint(-0.15F, -4F, -0.5F);

		slideModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 54
		slideModel[21].setRotationPoint(-0.35F, -4F, -0.5F);

		slideModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 55
		slideModel[22].setRotationPoint(-0.55F, -4F, -0.5F);

		slideModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 56
		slideModel[23].setRotationPoint(-0.75F, -4F, -0.5F);

		slideModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 57
		slideModel[24].setRotationPoint(-0.95F, -4F, -0.5F);

		slideModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 58
		slideModel[25].setRotationPoint(-1.15F, -4F, -0.5F);

		slideModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.9F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 59
		slideModel[26].setRotationPoint(-1.35F, -4F, -0.5F);

		slideModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.8F, -0.15F, -0.3F, -0.8F, -0.15F, -0.3F, -0.8F, -0.15F, -0.2F, -0.8F, -0.15F, -0.2F, 0F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 55
		slideModel[27].setRotationPoint(0.55F, -4.95F, -0.5F);

		slideModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.2F, -0.9F, -0.3F, -0.2F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.2F, 0F, -0.15F); // Box 56
		slideModel[28].setRotationPoint(0.55F, -5.15F, -0.5F);

		slideModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.5F, 0F, -0.05F, 0.5F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0.5F, -0.7F, -0.05F); // Box 57
		slideModel[29].setRotationPoint(1.25F, -3.95F, -0.5F);

		slideModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.8F, -0.2F, -0.45F, -0.8F, -0.2F, -0.45F, -0.8F, -0.2F, -0.45F, -0.8F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F); // Box 83
		slideModel[30].setRotationPoint(-1.75F, -5.2F, -0.5F);

		slideModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.7F, -0.55F, -0.45F, -0.7F, -0.55F, -0.45F, -0.7F, -0.25F, -0.45F, -0.7F, -0.25F, -0.45F, -0.2F, -0.55F, -0.45F, -0.2F, -0.55F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F); // Box 84
		slideModel[31].setRotationPoint(-1.75F, -5.2F, -0.5F);

		slideModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.7F, -0.25F, -0.45F, -0.7F, -0.25F, -0.45F, -0.7F, -0.55F, -0.45F, -0.7F, -0.55F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.55F, -0.45F, -0.2F, -0.55F); // Box 85
		slideModel[32].setRotationPoint(-1.75F, -5.2F, -0.5F);

		slideModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.8F, -0.45F, -0.45F, -0.8F, -0.45F, -0.45F, -0.8F, -0.45F, -0.45F, -0.8F, -0.45F, -0.2F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.2F, 0F, -0.45F); // Box 86
		slideModel[33].setRotationPoint(5.45F, -5.3F, -0.5F);

		this.modelScale = 0.9F;

		translateAll = new Vector3f(2.5F, -2.75F, 0.0F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = 0.15F;
	    reloadAnimation = WeaponAnimations.PISTOL;
	    
		hasFlash = false;
	    
        leftArmPos = new Vector3f(-0.15F, -0.65F, 0.12F);
        leftArmRot = new Vector3f(75.0F, 15.0F, -45.0F);
		leftArmReloadPos = new Vector3f(-0.1F, -0.60F, 0.1F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -35.0F);
 
        leftArmChargePos = new Vector3f(-0.27F, -0.40F, 0.07F);
        leftArmChargeRot = new Vector3f(75.0F, 15.0F, -45.0F);       
        
        rightArmPos = new Vector3f(0.53F, -0.5F, 0.0F);
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