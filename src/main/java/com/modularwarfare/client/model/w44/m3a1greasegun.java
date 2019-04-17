//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.05.2017 - 20:51:26
// Last changed on: 19.05.2017 - 20:51:26

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class m3a1greasegun extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 256;

	public m3a1greasegun() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[51];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 10
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 15
		gunModel[3] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 17
		gunModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 19
		gunModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 24
		gunModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 25
		gunModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 27
		gunModel[8] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 28
		gunModel[9] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 29
		gunModel[10] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 33
		gunModel[11] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 36
		gunModel[12] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 38
		gunModel[13] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 84
		gunModel[14] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 85
		gunModel[15] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 89
		gunModel[16] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 90
		gunModel[17] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 91
		gunModel[18] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 92
		gunModel[19] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 94
		gunModel[20] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 95
		gunModel[21] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 99
		gunModel[22] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 100
		gunModel[23] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 101
		gunModel[24] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 105
		gunModel[25] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 106
		gunModel[26] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 114
		gunModel[27] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 147
		gunModel[28] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 148
		gunModel[29] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 149
		gunModel[30] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 151
		gunModel[31] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 152
		gunModel[32] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 122
		gunModel[33] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 123
		gunModel[34] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 124
		gunModel[35] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 125
		gunModel[36] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 126
		gunModel[37] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 127
		gunModel[38] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 128
		gunModel[39] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 129
		gunModel[40] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 131
		gunModel[41] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 132
		gunModel[42] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 133
		gunModel[43] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 148
		gunModel[44] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 149
		gunModel[45] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 158
		gunModel[46] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 161
		gunModel[47] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 162
		gunModel[48] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 163
		gunModel[49] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 164
		gunModel[50] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 165

		gunModel[0].addShapeBox(0F, 0F, 0F, 6, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 3
		gunModel[0].setRotationPoint(-1F, -8F, 0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[1].setRotationPoint(-1F, -7F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 32, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[2].setRotationPoint(-2F, -14F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 26, 4, 3, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 17
		gunModel[3].setRotationPoint(0.5F, -12F, -1.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 23, 3, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 19
		gunModel[4].setRotationPoint(-3F, -13.9F, -2F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 33, 1, 5, 0F, 0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F); // Box 24
		gunModel[5].setRotationPoint(-3F, -17.5F, -2.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 33, 1, 5, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.1F, 0F, -1F); // Box 25
		gunModel[6].setRotationPoint(-3F, -14F, -2.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F); // Box 27
		gunModel[7].setRotationPoint(36F, -16.25F, -2F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F); // Box 28
		gunModel[8].setRotationPoint(36F, -17F, -2F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F); // Box 29
		gunModel[9].setRotationPoint(36F, -14.5F, -2F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[10].setRotationPoint(20F, -13.9F, -2F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[11].setRotationPoint(27F, -14F, -2F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 38
		gunModel[12].setRotationPoint(36F, -16.25F, -1F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, -1F, 0.15F, 0F, -1F, 0.15F, 0F, 0F, 0.15F); // Box 84
		gunModel[13].setRotationPoint(20F, -11.9F, -2F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 23, 1, 4, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 85
		gunModel[14].setRotationPoint(-3F, -10.9F, -2F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, -0.5F); // Box 89
		gunModel[15].setRotationPoint(34F, -14.25F, -2F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F); // Box 90
		gunModel[16].setRotationPoint(34F, -16.25F, -2F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F); // Box 91
		gunModel[17].setRotationPoint(34F, -17.25F, -2F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 92
		gunModel[18].setRotationPoint(-3.4F, -16.25F, -2.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 94
		gunModel[19].setRotationPoint(-3.4F, -17.75F, -2.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 95
		gunModel[20].setRotationPoint(-3.4F, -13.75F, -2.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 99
		gunModel[21].setRotationPoint(31.5F, -13.75F, -2.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 100
		gunModel[22].setRotationPoint(31.5F, -16.25F, -2.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 101
		gunModel[23].setRotationPoint(31.5F, -17.75F, -2.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 105
		gunModel[24].setRotationPoint(30F, -16.25F, -2.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		gunModel[25].setRotationPoint(30F, -17.5F, -2.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 33, 2, 5, 0F, 0.1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F); // Box 114
		gunModel[26].setRotationPoint(-3F, -16F, -2.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 147
		gunModel[27].setRotationPoint(5F, -8.5F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		gunModel[28].setRotationPoint(11.5F, -7F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 149
		gunModel[29].setRotationPoint(9.5F, -5F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 151
		gunModel[30].setRotationPoint(2.5F, -4F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 152
		gunModel[31].setRotationPoint(3.5F, -8.5F, -1F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 122
		gunModel[32].setRotationPoint(30F, -14F, -2.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 123
		gunModel[33].setRotationPoint(31F, -14F, -2F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 124
		gunModel[34].setRotationPoint(26F, -14F, -2F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 6, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F); // Box 125
		gunModel[35].setRotationPoint(-1F, -8F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 6, 11, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F); // Box 126
		gunModel[36].setRotationPoint(-1F, -8F, -1.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 127
		gunModel[37].setRotationPoint(3.5F, -6.5F, -1F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 128
		gunModel[38].setRotationPoint(-1F, 3F, 0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 129
		gunModel[39].setRotationPoint(-1F, 3F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 131
		gunModel[40].setRotationPoint(-1F, 3F, -1.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		gunModel[41].setRotationPoint(-3.5F, -15.75F, -2F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		gunModel[42].setRotationPoint(-3.5F, -15.75F, 1F);

		gunModel[43].addShapeBox(0F, 0F, -3F, 8, 1, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 148
		gunModel[43].setRotationPoint(22F, -17.5F, -1F);
		gunModel[43].rotateAngleX = -0.71558499F;

		gunModel[44].addShapeBox(0F, -0.02F, -1F, 8, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 149
		gunModel[44].setRotationPoint(22F, -19.5F, -3.5F);
		gunModel[44].rotateAngleX = 0.33161256F;

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 158
		gunModel[45].setRotationPoint(-1F, -12F, -1.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 161
		gunModel[46].setRotationPoint(13.5F, -8F, -1.5F);

		gunModel[47].addShapeBox(-10.5F, -0.5F, 3.5F, 8, 1, 1, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 162
		gunModel[47].setRotationPoint(21F, -11.5F, -1.5F);

		gunModel[48].addShapeBox(-10.5F, -0.5F, 3.5F, 8, 1, 1, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 163
		gunModel[48].setRotationPoint(21F, -11.5F, -6.5F);

		gunModel[49].addShapeBox(-10.5F, -0.5F, 3.5F, 6, 1, 1, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 164
		gunModel[49].setRotationPoint(8F, -11.5F, -6.5F);

		gunModel[50].addShapeBox(-10.5F, -0.5F, 3.5F, 6, 1, 1, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 165
		gunModel[50].setRotationPoint(8F, -11.5F, -1.5F);


		defaultScopeModel = new ModelRendererTurbo[9];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 134
		defaultScopeModel[1] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 150
		defaultScopeModel[2] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 151
		defaultScopeModel[3] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 153
		defaultScopeModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 154
		defaultScopeModel[5] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 155
		defaultScopeModel[6] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 156
		defaultScopeModel[7] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 157
		defaultScopeModel[8] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 160

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 134
		defaultScopeModel[0].setRotationPoint(29.25F, -19F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0.4F, -0.15F, -2F, 0.4F, -0.15F, -2F, 0.4F, -0.15F, 0F, 0.4F, -0.15F, 0F, 0F, -0.15F, -1.5F, 0F, -0.15F, -1.5F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 150
		defaultScopeModel[1].setRotationPoint(-2F, -19.5F, -1.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0.4F, -0.15F, -2F, 0.4F, -0.15F, -2F, 0.4F, -0.15F, 0F, 0.4F, -0.15F, 0F, 0F, -0.15F, -1.5F, 0F, -0.15F, -1.5F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 151
		defaultScopeModel[2].setRotationPoint(-2F, -19.5F, 0.5F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, -0.16F, -3F, 0F, -0.16F, -3F, 0F, -0.16F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, -1F, 0F, -0.16F, -1F, 0F, -0.16F, 0F, 0F, -0.16F); // Box 153
		defaultScopeModel[3].setRotationPoint(-1F, -19F, 0.5F);

		defaultScopeModel[4].addShapeBox(0F, -1F, -1F, 1, 1, 1, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 154
		defaultScopeModel[4].setRotationPoint(-2.01F, -20F, 1.5F);
		defaultScopeModel[4].rotateAngleX = 0.64577182F;

		defaultScopeModel[5].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 155
		defaultScopeModel[5].setRotationPoint(-2.01F, -20F, -1.5F);
		defaultScopeModel[5].rotateAngleX = -0.64577182F;

		defaultScopeModel[6].addShapeBox(0F, -1F, -1F, 1, 1, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 156
		defaultScopeModel[6].setRotationPoint(-2F, -19.7F, 0F);

		defaultScopeModel[7].addShapeBox(0F, -1F, -1F, 1, 1, 2, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 157
		defaultScopeModel[7].setRotationPoint(-2F, -17.5F, 0F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, -0.16F, -3F, 0F, -0.16F, -3F, 0F, -0.16F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, -1F, 0F, -0.16F, -1F, 0F, -0.16F, 0F, 0F, -0.16F); // Box 160
		defaultScopeModel[8].setRotationPoint(-1F, -19F, -1.5F);


		defaultStockModel = new ModelRendererTurbo[12];
		defaultStockModel[0] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 57
		defaultStockModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 58
		defaultStockModel[2] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 60
		defaultStockModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 62
		defaultStockModel[4] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 63
		defaultStockModel[5] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 64
		defaultStockModel[6] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 68
		defaultStockModel[7] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 69
		defaultStockModel[8] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 70
		defaultStockModel[9] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 71
		defaultStockModel[10] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 73
		defaultStockModel[11] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 159

		defaultStockModel[0].addShapeBox(-10.5F, -0.5F, 0F, 34, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		defaultStockModel[0].setRotationPoint(0F, -11.5F, -3F);

		defaultStockModel[1].addShapeBox(-1F, -1F, 0.25F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		defaultStockModel[1].setRotationPoint(0F, -10.5F, -2F);

		defaultStockModel[2].addShapeBox(-10.5F, -0.5F, 3.5F, 34, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 60
		defaultStockModel[2].setRotationPoint(0F, -11.5F, -1.5F);

		defaultStockModel[3].addShapeBox(-12.5F, -0.5F, 0F, 2, 1, 1, 0F, -0.25F, -1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0.1F, -1.25F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.1F, 0.1F); // Box 62
		defaultStockModel[3].setRotationPoint(0F, -11.5F, -3F);

		defaultStockModel[4].addShapeBox(-12.25F, 0.7F, 3.5F, 1, 7, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F); // Box 63
		defaultStockModel[4].setRotationPoint(0F, -10.5F, -1.5F);
		defaultStockModel[4].rotateAngleZ = -0.08726646F;

		defaultStockModel[5].addShapeBox(-12.25F, 0.7F, 0F, 1, 7, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F); // Box 64
		defaultStockModel[5].setRotationPoint(0F, -10.5F, -3F);
		defaultStockModel[5].rotateAngleZ = -0.08726646F;

		defaultStockModel[6].addShapeBox(-12.25F, 7.95F, 3.5F, 1, 2, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, 1F, 0.15F, 0.1F, 1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F); // Box 68
		defaultStockModel[6].setRotationPoint(0F, -10.5F, -1.5F);
		defaultStockModel[6].rotateAngleZ = -0.08726646F;

		defaultStockModel[7].addShapeBox(-12.25F, 7.95F, 0F, 1, 2, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, -1F, 0.15F, 0.1F, 1F, 0.15F, 0.1F, 1F, 0.15F, 0.1F, -1F, 0.15F, 0.1F); // Box 69
		defaultStockModel[7].setRotationPoint(0F, -10.5F, -3F);
		defaultStockModel[7].rotateAngleZ = -0.08726646F;

		defaultStockModel[8].addShapeBox(-11.25F, 10.2F, 3.5F, 1, 1, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, -1F, 0.15F, 1.1F, 1F, 0.15F, 1.1F, 1F, 0.15F, -0.9F, -1F, 0.15F, -0.9F); // Box 70
		defaultStockModel[8].setRotationPoint(0F, -10.5F, -1.5F);
		defaultStockModel[8].rotateAngleZ = -0.08726646F;

		defaultStockModel[9].addShapeBox(-11.25F, 10.2F, 0F, 1, 1, 1, 0F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, -1F, 0.15F, -0.9F, 1F, 0.15F, -0.9F, 1F, 0.15F, 1.1F, -1F, 0.15F, 1.1F); // Box 71
		defaultStockModel[9].setRotationPoint(0F, -10.5F, -3F);
		defaultStockModel[9].rotateAngleZ = -0.08726646F;

		defaultStockModel[10].addShapeBox(-10.25F, 11.45F, 1.25F, 1, 1, 4, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 73
		defaultStockModel[10].setRotationPoint(0F, -10.6F, -3.25F);
		defaultStockModel[10].rotateAngleZ = -0.08726646F;

		defaultStockModel[11].addShapeBox(-12.5F, -0.5F, 0F, 2, 1, 1, 0F, -0.25F, -1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0.1F, -1.25F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.1F, 0.1F); // Box 159
		defaultStockModel[11].setRotationPoint(0F, -11.5F, 2F);


		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 46
		ammoModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 47
		ammoModel[2] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 48
		ammoModel[3] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 49
		ammoModel[4] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 50

		ammoModel[0].addShapeBox(13.5F, -5F, -2F, 1, 22, 4, 0F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F); // Box 46
		ammoModel[0].setRotationPoint(13F, -3F, 0F);

		ammoModel[1].addShapeBox(17.5F, -5F, -2F, 1, 22, 4, 0F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F); // Box 47
		ammoModel[1].setRotationPoint(13F, -3F, 0F);

		ammoModel[2].addShapeBox(14F, -5F, -2F, 4, 4, 4, 0F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F); // Box 48
		ammoModel[2].setRotationPoint(13F, -3F, 0F);

		ammoModel[3].addShapeBox(14F, 16F, -2F, 4, 1, 4, 0F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F); // Box 49
		ammoModel[3].setRotationPoint(13F, -3F, 0F);

		ammoModel[4].addShapeBox(14F, -1F, -2F, 4, 17, 4, 0F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F); // Box 50
		ammoModel[4].setRotationPoint(13F, -3F, 0F);


		this.modelScale = 0.25F;

		translateAll = new Vector3f(0F, -6.5F, -0.01F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.RIFLE2;
	    
		hasFlash = false;
	    
	    leftArmPos = new Vector3f(0.18F, -0.64F, 0.05F);
	    leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.350F, -0.80F, 0.02F);
	    leftArmReloadRot = new Vector3f(35.0F, 0.0F, -45.0F);
	    
	    rightArmPos = new Vector3f(0.3F, -0.57F, 0.0F);
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
	    
		flipAll();
	}
}