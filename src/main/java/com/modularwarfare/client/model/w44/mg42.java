//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MG42
// Model Creator: 
// Created on: 14.02.2016 - 08:52:51
// Last changed on: 14.02.2016 - 08:52:51

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class mg42 extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public mg42() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[66];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 7
		gunModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 20
		gunModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 21
		gunModel[14] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 22
		gunModel[15] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 23
		gunModel[16] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 24
		gunModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 25
		gunModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 26
		gunModel[19] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 27
		gunModel[20] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 28
		gunModel[21] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 29
		gunModel[22] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 30
		gunModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 31
		gunModel[24] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 32
		gunModel[25] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 33
		gunModel[26] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 34
		gunModel[27] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 45
		gunModel[28] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 46
		gunModel[29] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 47
		gunModel[30] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 48
		gunModel[31] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 49
		gunModel[32] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 50
		gunModel[33] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 51
		gunModel[34] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 52
		gunModel[35] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 53
		gunModel[36] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 55
		gunModel[37] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 56
		gunModel[38] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 57
		gunModel[39] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 58
		gunModel[40] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 59
		gunModel[41] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 60
		gunModel[42] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 61
		gunModel[43] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 73
		gunModel[44] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 74
		gunModel[45] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 75
		gunModel[46] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 76
		gunModel[47] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 77
		gunModel[48] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 78
		gunModel[49] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 79
		gunModel[50] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 80
		gunModel[51] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 81
		gunModel[52] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 82
		gunModel[53] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 104
		gunModel[54] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 105
		gunModel[55] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 106
		gunModel[56] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 147
		gunModel[57] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 148
		gunModel[58] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 149
		gunModel[59] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 150
		gunModel[60] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 151
		gunModel[61] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 152
		gunModel[62] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 153
		gunModel[63] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 154
		gunModel[64] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 155
		gunModel[65] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 156

		gunModel[0].addShapeBox(0F, -0.5F, 0F, 2, 4, 2, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		gunModel[0].setRotationPoint(0F, -3F, -1F);
		gunModel[0].rotateAngleZ = -0.34906585F;

		gunModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 3
		gunModel[1].setRotationPoint(-1F, -4F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, -0.8F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F); // Box 4
		gunModel[2].setRotationPoint(-6F, -4F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, -0.4F, 0.6F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.6F, 0F, -0.4F, 0.5F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, 0.5F); // Box 5
		gunModel[3].setRotationPoint(6F, -2.6F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F, 0F, -0.4F, -2.5F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -2.5F, 0F, -0.4F, -2.4F, 0F, -0.4F, -2.9F, 0F, -0.4F, -2.9F, 0F, -0.4F, -2.4F); // Box 6
		gunModel[4].setRotationPoint(6F, -4F, -3.5F);

		gunModel[5].addShapeBox(1F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 7
		gunModel[5].setRotationPoint(5F, -3.3F, 0.5F);
		gunModel[5].rotateAngleY = -0.03490659F;

		gunModel[6].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 8
		gunModel[6].setRotationPoint(5F, -3.3F, 0.5F);
		gunModel[6].rotateAngleY = -0.03490659F;

		gunModel[7].addShapeBox(4F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 9
		gunModel[7].setRotationPoint(5F, -3.3F, 0.5F);
		gunModel[7].rotateAngleY = -0.03490659F;

		gunModel[8].addShapeBox(10F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 10
		gunModel[8].setRotationPoint(5F, -3.3F, 0.5F);
		gunModel[8].rotateAngleY = -0.03490659F;

		gunModel[9].addShapeBox(8F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 11
		gunModel[9].setRotationPoint(5F, -3.3F, 0.5F);
		gunModel[9].rotateAngleY = -0.03490659F;

		gunModel[10].addShapeBox(13.5F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 12
		gunModel[10].setRotationPoint(5F, -3.3F, 0.5F);
		gunModel[10].rotateAngleY = -0.03490659F;

		gunModel[11].addShapeBox(12F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 13
		gunModel[11].setRotationPoint(5F, -3.3F, 0.5F);
		gunModel[11].rotateAngleY = -0.03490659F;

		gunModel[12].addShapeBox(13.5F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 20
		gunModel[12].setRotationPoint(5F, -3.3F, -1.5F);
		gunModel[12].rotateAngleY = 0.03490659F;

		gunModel[13].addShapeBox(3F, -0.4F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 21
		gunModel[13].setRotationPoint(5F, -3.3F, 0.5F);
		gunModel[13].rotateAngleY = -0.03490659F;

		gunModel[14].addShapeBox(3F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 22
		gunModel[14].setRotationPoint(5F, -3.4F, 0.5F);
		gunModel[14].rotateAngleY = -0.03490659F;

		gunModel[15].addShapeBox(5F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 23
		gunModel[15].setRotationPoint(5F, -3.4F, 0.5F);
		gunModel[15].rotateAngleY = -0.03490659F;

		gunModel[16].addShapeBox(5F, -0.4F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 24
		gunModel[16].setRotationPoint(5F, -3.3F, 0.5F);
		gunModel[16].rotateAngleY = -0.03490659F;

		gunModel[17].addShapeBox(9F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 25
		gunModel[17].setRotationPoint(5F, -3.4F, 0.5F);
		gunModel[17].rotateAngleY = -0.03490659F;

		gunModel[18].addShapeBox(9F, -0.4F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 26
		gunModel[18].setRotationPoint(5F, -3.3F, 0.5F);
		gunModel[18].rotateAngleY = -0.03490659F;

		gunModel[19].addShapeBox(7F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 27
		gunModel[19].setRotationPoint(5F, -3.4F, 0.5F);
		gunModel[19].rotateAngleY = -0.03490659F;

		gunModel[20].addShapeBox(7F, -0.4F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 28
		gunModel[20].setRotationPoint(5F, -3.3F, 0.5F);
		gunModel[20].rotateAngleY = -0.03490659F;

		gunModel[21].addShapeBox(12.75F, 0.5F, 0F, 1, 1, 1, 0F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F); // Box 29
		gunModel[21].setRotationPoint(5F, -3.4F, 0.5F);
		gunModel[21].rotateAngleY = -0.03490659F;

		gunModel[22].addShapeBox(12.75F, -0.4F, 0F, 1, 1, 1, 0F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F); // Box 30
		gunModel[22].setRotationPoint(5F, -3.3F, 0.5F);
		gunModel[22].rotateAngleY = -0.03490659F;

		gunModel[23].addShapeBox(11F, 0.5F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 31
		gunModel[23].setRotationPoint(5F, -3.4F, 0.5F);
		gunModel[23].rotateAngleY = -0.03490659F;

		gunModel[24].addShapeBox(11F, -0.4F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 32
		gunModel[24].setRotationPoint(5F, -3.3F, 0.5F);
		gunModel[24].rotateAngleY = -0.03490659F;

		gunModel[25].addShapeBox(0.5F, -0.4F, 0F, 13, 1, 1, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 33
		gunModel[25].setRotationPoint(5F, -3.3F, -1.5F);
		gunModel[25].rotateAngleY = 0.03490659F;

		gunModel[26].addShapeBox(0.5F, 0.5F, 0F, 13, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 34
		gunModel[26].setRotationPoint(5F, -3.4F, -1.5F);
		gunModel[26].rotateAngleY = 0.03490659F;

		gunModel[27].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 45
		gunModel[27].setRotationPoint(-1F, -4.5F, -1F);

		gunModel[28].addShapeBox(-3F, 0F, 0F, 3, 1, 2, 0F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F); // Box 46
		gunModel[28].setRotationPoint(-1F, -4.5F, -1F);
		gunModel[28].rotateAngleZ = 0.13962634F;

		gunModel[29].addShapeBox(-3.4F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.2F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.3F, -0.2F, 0.2F, -0.5F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F); // Box 47
		gunModel[29].setRotationPoint(-1F, -4.5F, -0.5F);
		gunModel[29].rotateAngleZ = 0.13962634F;

		gunModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F); // Box 48
		gunModel[30].setRotationPoint(-6F, -3F, -1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 49
		gunModel[31].setRotationPoint(-1F, -3F, -1F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0.3F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0.3F); // Box 50
		gunModel[32].setRotationPoint(-9F, -3F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 1F, 0.3F, 0F, 1F, 0.3F, 0F, 1F, 0.3F, -0.5F, 1F, 0.3F, -0.2F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.2F, -0.5F, 0F); // Box 51
		gunModel[33].setRotationPoint(-11F, -1F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.2F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.5F, 0F, -0.5F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, -0.5F, -1F, 0.3F); // Box 52
		gunModel[34].setRotationPoint(-11F, -3F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 1F, 0.3F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0.3F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 53
		gunModel[35].setRotationPoint(-9F, -1F, -0.5F);

		gunModel[36].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F, -0.25F, 0.1F, 0.1F); // Box 55
		gunModel[36].setRotationPoint(19F, -3.3F, -0.5F);

		gunModel[37].addShapeBox(0.25F, 0F, 0F, 14, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 56
		gunModel[37].setRotationPoint(6F, -3.3F, -0.5F);

		gunModel[38].addShapeBox(0.25F, 0F, 0F, 4, 1, 1, 0F, -0.3F, 0.05F, 0.05F, -0.3F, 0.05F, 0.05F, -0.3F, 0.05F, 0.05F, -0.3F, 0.05F, 0.05F, -0.3F, 0.05F, 0.05F, -0.3F, 0.05F, 0.05F, -0.3F, 0.05F, 0.05F, -0.3F, 0.05F, 0.05F); // Box 57
		gunModel[38].setRotationPoint(19F, -3.3F, -0.5F);

		gunModel[39].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.1F, -0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, -0.1F, -0.1F); // Box 58
		gunModel[39].setRotationPoint(22.5F, -3.3F, -0.5F);

		gunModel[40].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F); // Box 59
		gunModel[40].setRotationPoint(20.6F, -3.3F, -0.5F);

		gunModel[41].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F); // Box 60
		gunModel[41].setRotationPoint(20.6F, -4.5F, -0.5F);

		gunModel[42].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 61
		gunModel[42].setRotationPoint(20.6F, -3F, -0.5F);

		gunModel[43].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F); // Box 73
		gunModel[43].setRotationPoint(20.3F, -4.5F, -0.5F);

		gunModel[44].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F); // Box 74
		gunModel[44].setRotationPoint(20.3F, -3.3F, -0.5F);

		gunModel[45].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 75
		gunModel[45].setRotationPoint(20.3F, -3F, -0.5F);

		gunModel[46].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F); // Box 76
		gunModel[46].setRotationPoint(20F, -4.5F, -0.5F);

		gunModel[47].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F); // Box 77
		gunModel[47].setRotationPoint(20F, -3.3F, -0.5F);

		gunModel[48].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 78
		gunModel[48].setRotationPoint(20F, -3F, -0.5F);

		gunModel[49].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, -0.9F, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F); // Box 79
		gunModel[49].setRotationPoint(19.7F, -4.5F, -0.5F);

		gunModel[50].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F, -0.4F, 0.1F, 0.2F); // Box 80
		gunModel[50].setRotationPoint(19.7F, -3.3F, -0.5F);

		gunModel[51].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 81
		gunModel[51].setRotationPoint(19.7F, -3F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F); // Box 82
		gunModel[52].setRotationPoint(22F, -4.5F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 104
		gunModel[53].setRotationPoint(4F, -4F, -1F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F); // Box 105
		gunModel[54].setRotationPoint(2F, -4F, -1F);

		gunModel[55].addShapeBox(0F, -0.5F, 0F, 2, 4, 2, 0F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.2F, -0.1F, -0.4F, -0.8F, -0.1F, -0.4F, -0.8F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F); // Box 106
		gunModel[55].setRotationPoint(0F, -3F, -1F);
		gunModel[55].rotateAngleZ = -0.34906585F;

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 147
		gunModel[56].setRotationPoint(1F, -4.5F, -2.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F, -0.4F, -0.8F, -0.2F); // Box 148
		gunModel[57].setRotationPoint(1F, -4.5F, -1.9F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 149
		gunModel[58].setRotationPoint(3.7F, -4F, 0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 150
		gunModel[59].setRotationPoint(1.3F, -4F, 0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 151
		gunModel[60].setRotationPoint(4F, -4.25F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 152
		gunModel[61].setRotationPoint(3.5F, -4.25F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F); // Box 153
		gunModel[62].setRotationPoint(3F, -4.15F, -0.5F);

		gunModel[63].addShapeBox(-2.9F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 154
		gunModel[63].setRotationPoint(-1F, -4.2F, -0.5F);
		gunModel[63].rotateAngleZ = 0.13962634F;

		gunModel[64].addShapeBox(0F, -0.5F, 0F, 3, 1, 2, 0F, -0.3F, 0F, -0.6F, 0.7F, 0F, -0.6F, 0.7F, 0F, -0.6F, -0.3F, 0F, -0.6F, 0F, 0F, -0.6F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 155
		gunModel[64].setRotationPoint(0F, -1.5F, -1F);

		gunModel[65].addShapeBox(0.3F, -1F, 0F, 1, 1, 1, 0F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F); // Box 156
		gunModel[65].setRotationPoint(1F, -1.5F, -0.5F);
		gunModel[65].rotateAngleZ = -0.26179939F;


		defaultScopeModel = new ModelRendererTurbo[4];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 83
		defaultScopeModel[1] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 84
		defaultScopeModel[2] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 85
		defaultScopeModel[3] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 86

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F); // Box 83
		defaultScopeModel[0].setRotationPoint(7F, -4F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 84
		defaultScopeModel[1].setRotationPoint(7F, -4.25F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F); // Box 85
		defaultScopeModel[2].setRotationPoint(7F, -4.35F, -0.8F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0.1F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 86
		defaultScopeModel[3].setRotationPoint(7F, -4.35F, -0.2F);


		defaultGripModel = new ModelRendererTurbo[6];
		defaultGripModel[0] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 134
		defaultGripModel[1] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 135
		defaultGripModel[2] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 136
		defaultGripModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 137
		defaultGripModel[4] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 159
		defaultGripModel[5] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 160

		defaultGripModel[0].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 134
		defaultGripModel[0].setRotationPoint(19F, -2F, 0F);
		defaultGripModel[0].rotateAngleZ = -0.99483767F;

		defaultGripModel[1].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Box 135
		defaultGripModel[1].setRotationPoint(19F, -2F, 0F);
		defaultGripModel[1].rotateAngleZ = -0.99483767F;

		defaultGripModel[2].addShapeBox(-0.5F, 0.5F, -0.5F, 1, 8, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 1.7F, 0F, -1.3F, -2.3F, 0F, -1.3F, -2.3F, 0F, 0.7F, 1.7F, 0F, 0.7F); // Box 136
		defaultGripModel[2].setRotationPoint(19F, -2F, 0F);
		defaultGripModel[2].rotateAngleZ = -0.99483767F;

		defaultGripModel[3].addShapeBox(-0.5F, 0.5F, -0.5F, 1, 8, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 1.7F, 0F, 0.7F, -2.3F, 0F, 0.7F, -2.3F, 0F, -1.3F, 1.7F, 0F, -1.3F); // Box 137
		defaultGripModel[3].setRotationPoint(19F, -2F, 0F);
		defaultGripModel[3].rotateAngleZ = -0.99483767F;

		defaultGripModel[4].addShapeBox(-2.5F, 8.5F, 0.5F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F, -0.8F, 0.2F, -0.3F, -0.8F, 0.2F); // Box 159
		defaultGripModel[4].setRotationPoint(19F, -2F, 0F);
		defaultGripModel[4].rotateAngleZ = -0.99483767F;

		defaultGripModel[5].addShapeBox(-2.5F, 8.5F, -1.5F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.8F, 0.2F, -0.3F, -0.8F, 0.2F, -0.3F, -0.8F, -0.3F, -0.3F, -0.8F, -0.3F); // Box 160
		defaultGripModel[5].setRotationPoint(19F, -2F, 0F);
		defaultGripModel[5].rotateAngleZ = -0.99483767F;


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 14, 89, textureX, textureY); // Box 105
		ammoModel[1] = new ModelRendererTurbo(this, 0, 89, textureX, textureY); // Box 106
		ammoModel[2] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 107

		ammoModel[0].addShapeBox(2F, -3.5F, 1.4F, 2, 1, 3, 0F, 0.5F, 0F, 0.35F, 0.5F, 0F, 0.35F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.35F, 0.5F, 0F, 0.35F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 105
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		ammoModel[0].rotateAngleX = -0.05235988F;
		ammoModel[0].rotateAngleY = -0.08726646F;

		ammoModel[1].addShapeBox(2F, -4.5F, 1.4F, 2, 1, 3, 0F, 0.5F, 0F, -1F, 0.5F, -0.2F, -1F, 0.5F, -0.2F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 106
		ammoModel[1].setRotationPoint(0F, 0F, 0F);
		ammoModel[1].rotateAngleX = -0.05235988F;
		ammoModel[1].rotateAngleY = -0.08726646F;

		ammoModel[2].addShapeBox(2F, -2.5F, 1.4F, 2, 1, 3, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, -1F, 0.5F, -0.2F, -1F, 0.5F, -0.2F, -1F, 0.5F, 0.2F, -1F); // Box 107
		ammoModel[2].setRotationPoint(0F, 0F, 0F);
		ammoModel[2].rotateAngleX = -0.05235988F;
		ammoModel[2].rotateAngleY = -0.08726646F;

		this.modelScale = 0.85F;

		translateAll = new Vector3f(0F, -3.1F, 0.0F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.RIFLE;
	    
		hasFlash = false;
	    
	    leftArmPos = new Vector3f(0.480F, -0.68F, 0.02F);
	    leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.150F, -0.72F, 0.02F);
	    leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);
	    
	    rightArmPos = new Vector3f(0.28F, -0.55F, 0.0F);
	    rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    rightArmReloadPos = new Vector3f(0.27F, -0.59F, 0.04F);
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