//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: DT28
// Model Creator: 
// Created on: 13.03.2018 - 13:42:41
// Last changed on: 13.03.2018 - 13:42:41

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class dt28 extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public dt28() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[38];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		gunModel[4] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 0
		gunModel[5] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 0
		gunModel[6] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 0
		gunModel[7] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 0
		gunModel[8] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 0
		gunModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		gunModel[10] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 0
		gunModel[11] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 0
		gunModel[12] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 0
		gunModel[13] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 0
		gunModel[14] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 0
		gunModel[15] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 0
		gunModel[16] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		gunModel[17] = new ModelRendererTurbo(this, 12, 60, textureX, textureY); // Box 0
		gunModel[18] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 24
		gunModel[19] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 25
		gunModel[20] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 27
		gunModel[21] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 0
		gunModel[22] = new ModelRendererTurbo(this, 43, 54, textureX, textureY); // Box 0
		gunModel[23] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 1
		gunModel[24] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 3
		gunModel[25] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 4
		gunModel[26] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 5
		gunModel[27] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 6
		gunModel[28] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 7
		gunModel[29] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 11
		gunModel[30] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 12
		gunModel[31] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 13
		gunModel[32] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 14
		gunModel[33] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 15
		gunModel[34] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 42
		gunModel[35] = new ModelRendererTurbo(this, 41, 61, textureX, textureY); // Box 46
		gunModel[36] = new ModelRendererTurbo(this, 30, 61, textureX, textureY); // Box 57
		gunModel[37] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 54

		gunModel[0].addShapeBox(-7.5F, -1.5F, -0.5F, 7, 2, 1, 0F, 0.25F, -0.5F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F, -0.5F, -0.1F, 0.25F, -0.5F, -0.1F); // Box 0
		gunModel[0].setRotationPoint(7.2F, -2F, 0F);

		gunModel[1].addShapeBox(-7.25F, -1.75F, -0.5F, 7, 1, 1, 0F, 0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.5F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F); // Box 0
		gunModel[1].setRotationPoint(7.2F, -2F, 0F);

		gunModel[2].addShapeBox(0.25F, -3.75F, -3F, 5, 6, 6, 0F, 0F, -2.85F, -2.6F, 0F, -2.85F, -2.6F, 0F, -2.85F, -2.6F, 0F, -2.85F, -2.6F, 0F, -2.85F, -2.6F, 0F, -2.85F, -2.6F, 0F, -2.85F, -2.6F, 0F, -2.85F, -2.6F); // Box 0
		gunModel[2].setRotationPoint(7.2F, -2F, 0F);

		gunModel[3].addShapeBox(0.25F, -1.25F, -0.5F, 10, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		gunModel[3].setRotationPoint(7.2F, -2F, 0F);

		gunModel[4].addShapeBox(0.25F, -0.5F, -0.5F, 4, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 0
		gunModel[4].setRotationPoint(7.2F, -2F, 0F);

		gunModel[5].addShapeBox(-0.24F, -1.25F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[5].setRotationPoint(7.2F, -2F, 0F);

		gunModel[6].addShapeBox(-0.24F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		gunModel[6].setRotationPoint(7.2F, -2F, 0F);

		gunModel[7].addShapeBox(-0.24F, -2F, -0.5F, 1, 1, 1, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 0
		gunModel[7].setRotationPoint(7.2F, -2F, 0F);

		gunModel[8].addShapeBox(-7.5F, -2F, -0.5F, 2, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F); // Box 0
		gunModel[8].setRotationPoint(7.2F, -2F, 0F);

		gunModel[9].addShapeBox(-12.5F, -0.75F, 0F, 4, 1, 1, 0F, 0F, -1.05F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -1.05F, -0.4F, 0F, 0.45F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, 0.45F, -0.4F); // Box 0
		gunModel[9].setRotationPoint(7.2F, -2F, 0F);

		gunModel[10].addShapeBox(-12.5F, -0.75F, -1F, 4, 1, 1, 0F, 0F, -1.05F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -1.05F, -0.4F, 0F, 0.45F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, 0.45F, -0.4F); // Box 0
		gunModel[10].setRotationPoint(7.2F, -2F, 0F);

		gunModel[11].addShapeBox(-9.25F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 0
		gunModel[11].setRotationPoint(7.2F, -2F, 0F);

		gunModel[12].addShapeBox(-13.25F, 0F, -0.5F, 1, 1, 1, 0F, -0.45F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.45F, 0F, 0.15F, -0.45F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.45F, 0F, 0.15F); // Box 0
		gunModel[12].setRotationPoint(7.2F, -2F, 0F);

		gunModel[13].addShapeBox(-13.25F, -1F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.5F, 0.15F, -0.75F, 0F, 0.15F, -0.75F, 0F, 0.15F, -0.2F, -0.5F, 0.15F, -0.45F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.45F, 0F, 0.15F); // Box 0
		gunModel[13].setRotationPoint(7.2F, -2F, 0F);

		gunModel[14].addShapeBox(-13.25F, 1F, -0.5F, 1, 1, 1, 0F, -0.45F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.45F, 0F, 0.15F, -0.2F, -0.25F, 0.15F, -0.5F, -0.25F, 0.15F, -0.5F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F); // Box 0
		gunModel[14].setRotationPoint(7.2F, -2F, 0F);

		gunModel[15].addShapeBox(-12.75F, 1.5F, -0.5F, 2, 1, 1, 0F, 0F, -0.25F, 0.15F, 0F, 0.15F, -0.25F, 0F, 0.15F, -0.25F, 0F, -0.25F, 0.15F, 0F, -0.55F, -0.15F, 0F, -0.95F, -0.25F, 0F, -0.95F, -0.25F, 0F, -0.55F, 0.15F); // Box 0
		gunModel[15].setRotationPoint(7.2F, -2F, 0F);

		gunModel[16].addShapeBox(-13.5F, 1.5F, -0.5F, 1, 1, 1, 0F, -0.45F, -0.25F, 0.15F, -0.25F, -0.25F, 0.15F, -0.25F, -0.25F, 0.15F, -0.45F, -0.25F, 0.15F, -0.55F, -0.6F, 0.15F, -0.25F, -0.55F, 0.15F, -0.25F, -0.55F, 0.15F, -0.55F, -0.65F, 0.15F); // Box 0
		gunModel[16].setRotationPoint(7.2F, -2F, 0F);

		gunModel[17].addShapeBox(-8.5F, -1.5F, -0.5F, 1, 2, 1, 0F, -0.25F, -1F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -1F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F); // Box 0
		gunModel[17].setRotationPoint(7.2F, -2F, 0F);

		gunModel[18].addShapeBox(0.25F, -4F, -3F, 5, 6, 6, 0F, 0F, -2.9F, -2.85F, 0F, -2.9F, -2.85F, 0F, -2.9F, -2.85F, 0F, -2.9F, -2.85F, 0F, -2.9F, -2.6F, 0F, -2.9F, -2.6F, 0F, -2.9F, -2.6F, 0F, -2.9F, -2.6F); // Box 24
		gunModel[18].setRotationPoint(7.2F, -2F, 0F);

		gunModel[19].addShapeBox(0.25F, -3.5F, -3F, 5, 6, 6, 0F, 0F, -2.9F, -2.6F, 0F, -2.9F, -2.6F, 0F, -2.9F, -2.6F, 0F, -2.9F, -2.6F, 0F, -2.9F, -2.85F, 0F, -2.9F, -2.85F, 0F, -2.9F, -2.85F, 0F, -2.9F, -2.85F); // Box 25
		gunModel[19].setRotationPoint(7.2F, -2F, 0F);

		gunModel[20].addShapeBox(-7.75F, -0.25F, -0.5F, 8, 1, 1, 0F, 0F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 27
		gunModel[20].setRotationPoint(7.2F, -2F, 0F);

		gunModel[21].addShapeBox(-6.5F, 0F, -0.5F, 1, 1, 1, 0F, -0.15F, 0F, -0.4F, -0.75F, 0F, -0.4F, -0.75F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.25F, -0.3F, -0.4F, -0.65F, -0.3F, -0.4F, -0.65F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F); // Box 0
		gunModel[21].setRotationPoint(7.2F, -2F, 0F);

		gunModel[22].addShapeBox(-7.5F, 2F, -0.5F, 1, 1, 1, 0F, -0.05F, 0.2F, -0.5F, -0.15F, 0.6F, -0.5F, -0.25F, 0.6F, -0.25F, -0.15F, 0.2F, -0.25F, 0.05F, -0.65F, -0.5F, -0.25F, -0.65F, -0.5F, -0.35F, -0.65F, -0.25F, -0.05F, -0.65F, -0.25F); // Box 0
		gunModel[22].setRotationPoint(7.2F, -2F, 0F);

		gunModel[23].addShapeBox(-7.5F, 0F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.15F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F); // Box 1
		gunModel[23].setRotationPoint(7.2F, -2F, 0F);

		gunModel[24].addShapeBox(-6.5F, 0F, -0.5F, 1, 1, 1, 0F, 0.2F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0.2F, 0F, -0.3F); // Box 3
		gunModel[24].setRotationPoint(7.2F, -2F, 0F);

		gunModel[25].addShapeBox(-6.5F, 0F, -0.5F, 1, 1, 1, 0F, 0.2F, -0.9F, -0.3F, -0.2F, -0.9F, -0.3F, -0.2F, -0.9F, -0.3F, 0.2F, -0.9F, -0.3F, 0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F); // Box 4
		gunModel[25].setRotationPoint(7.2F, -2F, 0F);

		gunModel[26].addShapeBox(-6.5F, 0F, -0.5F, 1, 1, 1, 0F, -0.7F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F); // Box 5
		gunModel[26].setRotationPoint(7.2F, -2F, 0F);

		gunModel[27].addShapeBox(-6.5F, 0F, -0.5F, 1, 1, 1, 0F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0.2F, -0.75F, -0.3F); // Box 6
		gunModel[27].setRotationPoint(7.2F, -2F, 0F);

		gunModel[28].addShapeBox(-6.5F, 0.05F, -0.5F, 1, 1, 1, 0F, -0.55F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.55F, -0.2F, -0.3F, -0.6F, -0.7F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.6F, -0.7F, -0.3F); // Box 7
		gunModel[28].setRotationPoint(7.2F, -2F, 0F);

		gunModel[29].addShapeBox(-7.5F, 0.999999999999999F, -0.5F, 1, 1, 1, 0F, -0.1F, 0F, -0.5F, 0.05F, 0F, -0.5F, -0.05F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.05F, -0.2F, -0.5F, -0.15F, -0.6F, -0.5F, -0.25F, -0.6F, -0.25F, -0.15F, -0.2F, -0.25F); // Box 11
		gunModel[29].setRotationPoint(7.2F, -2F, 0F);

		gunModel[30].addShapeBox(-7.5F, 0.999999999999999F, -0.5F, 1, 1, 1, 0F, -0.2F, 0F, -0.25F, -0.05F, 0F, -0.25F, 0.05F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.15F, -0.2F, -0.25F, -0.25F, -0.6F, -0.25F, -0.15F, -0.6F, -0.5F, -0.05F, 0F, -0.5F); // Box 12
		gunModel[30].setRotationPoint(7.2F, -2F, 0F);

		gunModel[31].addShapeBox(-7.5F, 2F, -0.5F, 1, 1, 1, 0F, -0.15F, 0.2F, -0.25F, -0.25F, 0.6F, -0.25F, -0.15F, 0.6F, -0.5F, -0.05F, 0.2F, -0.5F, -0.05F, -0.65F, -0.25F, -0.35F, -0.65F, -0.25F, -0.25F, -0.65F, -0.5F, 0.05F, -0.65F, -0.5F); // Box 13
		gunModel[31].setRotationPoint(7.2F, -2F, 0F);

		gunModel[32].addShapeBox(-7.5F, 0F, -0.5F, 1, 1, 1, 0F, -0.05F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.5F, -0.15F, 0F, -0.5F); // Box 14
		gunModel[32].setRotationPoint(7.2F, -2F, 0F);

		gunModel[33].addShapeBox(-7.5F, 0F, -0.5F, 1, 1, 1, 0F, 0.15F, -0.2F, -0.26F, -0.5F, -0.2F, -0.26F, -0.5F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -0.2F, 0F, -0.26F, -0.2F, 0F, -0.26F, -0.2F, 0F, -0.5F, -0.15F, 0F, -0.5F); // Box 15
		gunModel[33].setRotationPoint(7.2F, -2F, 0F);

		gunModel[34].addShapeBox(-7.5F, 0F, -0.5F, 1, 1, 1, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.26F, 0.15F, -0.2F, -0.26F, -0.15F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.26F, -0.2F, 0F, -0.26F); // Box 42
		gunModel[34].setRotationPoint(7.2F, -2F, 0F);

		gunModel[35].addShapeBox(-2F, -1F, -1.25F, 1, 1, 1, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F, -0.32F, -0.32F, 0F); // Box 46
		gunModel[35].setRotationPoint(7.2F, -2F, 0F);

		gunModel[36].addShapeBox(8.5F, -1.25F, -0.5F, 2, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 57
		gunModel[36].setRotationPoint(7.2F, -2F, 0F);

		gunModel[37].addShapeBox(-3F, -1F, -0.5F, 1, 1, 1, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, -0.8F, 1F, -0.3F, -0.8F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, -0.8F, 1F, -0.3F, -0.8F); // Box 54
		gunModel[37].setRotationPoint(7.2F, -2F, 0F);


		defaultScopeModel = new ModelRendererTurbo[13];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 59
		defaultScopeModel[2] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 60
		defaultScopeModel[3] = new ModelRendererTurbo(this, 5, 35, textureX, textureY); // Box 47
		defaultScopeModel[4] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 48
		defaultScopeModel[5] = new ModelRendererTurbo(this, 29, 52, textureX, textureY); // Box 83
		defaultScopeModel[6] = new ModelRendererTurbo(this, 19, 53, textureX, textureY); // Box 84
		defaultScopeModel[7] = new ModelRendererTurbo(this, 27, 35, textureX, textureY); // Box 85
		defaultScopeModel[8] = new ModelRendererTurbo(this, 27, 35, textureX, textureY); // Box 86
		defaultScopeModel[9] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 87
		defaultScopeModel[10] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 88
		defaultScopeModel[11] = new ModelRendererTurbo(this, 20, 61, textureX, textureY); // Box 89
		defaultScopeModel[12] = new ModelRendererTurbo(this, 36, 53, textureX, textureY); // Box 90

		defaultScopeModel[0].addShapeBox(-7.5F, -2.25F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.18F, -0.5F, -0.25F, -0.18F, -0.5F, -0.25F, -0.18F, -0.2F, -0.25F, -0.18F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 0
		defaultScopeModel[0].setRotationPoint(7.2F, -2F, 0F);

		defaultScopeModel[1].addShapeBox(-7.7F, -3.6F, -0.7F, 1, 2, 1, 0F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F); // Box 59
		defaultScopeModel[1].setRotationPoint(7.2F, -2F, 0F);

		defaultScopeModel[2].addShapeBox(-7.7F, -3.6F, -0.3F, 1, 2, 1, 0F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F, -0.45F, -0.4F, -0.45F); // Box 60
		defaultScopeModel[2].setRotationPoint(7.2F, -2F, 0F);

		defaultScopeModel[3].addShapeBox(-7.7F, -3.65F, -0.5F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F); // Box 47
		defaultScopeModel[3].setRotationPoint(7.2F, -2F, 0F);

		defaultScopeModel[4].addShapeBox(-7.7F, -3F, -0.5F, 1, 1, 1, 0F, -0.42F, -0.42F, -0.2F, -0.42F, -0.42F, -0.2F, -0.42F, -0.42F, -0.2F, -0.42F, -0.42F, -0.2F, -0.42F, -0.42F, -0.2F, -0.42F, -0.42F, -0.2F, -0.42F, -0.42F, -0.2F, -0.42F, -0.42F, -0.2F); // Box 48
		defaultScopeModel[4].setRotationPoint(7.2F, -2F, 0F);

		defaultScopeModel[5].addShapeBox(8.9F, -1.45F, -0.2F, 1, 1, 1, 0F, -0.1F, -0.35F, -0.5F, -0.1F, -0.35F, -0.5F, -0.1F, -0.35F, -0.4F, -0.1F, -0.35F, -0.4F, -0.1F, 1F, -0.45F, -0.1F, 1F, -0.45F, -0.1F, 1F, -0.45F, -0.1F, 1F, -0.45F); // Box 83
		defaultScopeModel[5].setRotationPoint(7.2F, -3.5F, 0F);

		defaultScopeModel[6].addShapeBox(8.9F, -1.45F, -0.8F, 1, 1, 1, 0F, -0.1F, -0.35F, -0.4F, -0.1F, -0.35F, -0.4F, -0.1F, -0.35F, -0.5F, -0.1F, -0.35F, -0.5F, -0.1F, 1F, -0.45F, -0.1F, 1F, -0.45F, -0.1F, 1F, -0.45F, -0.1F, 1F, -0.45F); // Box 84
		defaultScopeModel[6].setRotationPoint(7.2F, -3.5F, 0F);

		defaultScopeModel[7].addShapeBox(8.9F, -1.7F, -0.85F, 1, 1, 1, 0F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F); // Box 85
		defaultScopeModel[7].setRotationPoint(7.2F, -3.5F, 0F);

		defaultScopeModel[8].addShapeBox(8.9F, -1.7F, -0.15F, 1, 1, 1, 0F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F); // Box 86
		defaultScopeModel[8].setRotationPoint(7.2F, -3.5F, 0F);

		defaultScopeModel[9].addShapeBox(8.9F, -1.95F, -0.15F, 1, 1, 1, 0F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F); // Box 87
		defaultScopeModel[9].setRotationPoint(7.2F, -3.5F, 0F);

		defaultScopeModel[10].addShapeBox(8.9F, -1.95F, -0.85F, 1, 1, 1, 0F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.4F, -0.3F, -0.35F, -0.4F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F); // Box 88
		defaultScopeModel[10].setRotationPoint(7.2F, -3.5F, 0F);

		defaultScopeModel[11].addShapeBox(9F, -1.65F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 89
		defaultScopeModel[11].setRotationPoint(7.2F, -3.5F, 0F);

		defaultScopeModel[12].addShapeBox(9F, -1.9F, -0.5F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.42F, -0.4F, -0.5F, -0.42F, -0.4F, -0.5F, -0.42F, -0.4F, -0.5F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F); // Box 90
		defaultScopeModel[12].setRotationPoint(7.2F, -3.5F, 0F);


		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		ammoModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		ammoModel[2] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 0
		ammoModel[3] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 55
		ammoModel[4] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 57

		ammoModel[0].addShapeBox(-2.95F, -2.25F, -2F, 1, 1, 4, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 0
		ammoModel[0].setRotationPoint(7.2F, -2F, 0F);

		ammoModel[1].addShapeBox(-1.7F, -2.25F, -2F, 1, 1, 4, 0F, 0F, 0F, 0F, 0.3F, 0F, -1.25F, 0.3F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -1.25F, 0.3F, 0F, -1.25F, 0F, 0F, 0F); // Box 0
		ammoModel[1].setRotationPoint(7.2F, -2F, 0F);

		ammoModel[2].addShapeBox(-4.2F, -2.25F, -2F, 1, 1, 4, 0F, 0.3F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -1.25F, 0.3F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -1.25F); // Box 0
		ammoModel[2].setRotationPoint(7.2F, -2F, 0F);

		ammoModel[3].addShapeBox(-2.7F, -2.8F, -0.5F, 1, 1, 1, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F); // Box 55
		ammoModel[3].setRotationPoint(7.2F, -2F, 0F);

		ammoModel[4].addShapeBox(-3.5F, -2.6F, -0.5F, 2, 1, 1, 0F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F); // Box 57
		ammoModel[4].setRotationPoint(7.2F, -2F, 0F);

		this.modelScale = 1.15F;

		translateAll = new Vector3f(0F, -0.75F, 0.0F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
	    reloadAnimation = WeaponAnimations.TOP_RIFLE;
	    
		hasFlash = false;
	    
	    leftArmPos = new Vector3f(0.2F, -0.55F, 0.02F);
	    leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.10F, -0.55F, 0.02F);
	    leftArmReloadRot = new Vector3f(65.0F, 12.0F, -55.0F);
	    
	    rightArmPos = new Vector3f(0.28F, -0.7F, 0.0F);
	    rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    rightArmReloadPos = new Vector3f(0.6F, -0.45F, 0.1F);
	    rightArmReloadRot = new Vector3f(5.0F, 15.0F, -100.0F);
	    
	    rightArmChargePos = new Vector3f(0.47F, -0.39F, 0.14F);
	    rightArmChargeRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    
	    rightArmScale = new Vector3f(0.60F, 1.0F, 0.60F);
	    leftArmScale = new Vector3f(0.60F, 1.0F, 0.60F);

	    leftHandAmmo = false;
	    
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