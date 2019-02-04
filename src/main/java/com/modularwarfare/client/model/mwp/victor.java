//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: victor
// Model Creator: 
// Created on: 04.02.2019 - 00:05:54
// Last changed on: 04.02.2019 - 00:05:54

package com.modularwarfare.client.model.mwp; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class victor extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public victor() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[119];
		defaultScopeModel = new ModelRendererTurbo[40];
		ammoModel = new ModelRendererTurbo[15];
		slideModel = new ModelRendererTurbo[110];
		switchModel = new ModelRendererTurbo[6];
		triggerModel = new ModelRendererTurbo[17];

		initgunModel_1();
		initdefaultScopeModel_1();
		initammoModel_1();
		initslideModel_1();
		initswitchModel_1();
		inittriggerModel_1();

		modelScale = 0.12F;
		translateAll = new Vector3f(0F, -23.5F, -0.0F);//forward/down/right
		scopeIsOnSlide = true;
		switchIsOnSlide = true;
		gunSlideDistance = 0.5F;
		reloadAnimation = WeaponAnimations.PISTOL;


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox0
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import ImportBox0
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import ImportBox0
		gunModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import ImportBox0
		gunModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import ImportBox0
		gunModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import ImportBox0
		gunModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import ImportBox0
		gunModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import ImportBox0
		gunModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import ImportBox0
		gunModel[10] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportBox0
		gunModel[11] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import ImportBox0
		gunModel[12] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import ImportBox0
		gunModel[13] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import ImportBox0
		gunModel[14] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import ImportBox0
		gunModel[15] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import ImportBox0
		gunModel[16] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import ImportBox0
		gunModel[17] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportBox0
		gunModel[18] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import ImportBox0
		gunModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox0
		gunModel[20] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import ImportBox0
		gunModel[21] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import ImportBox0
		gunModel[22] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import ImportBox0
		gunModel[23] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import ImportBox0
		gunModel[24] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import ImportBox0
		gunModel[25] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Import ImportBox0
		gunModel[26] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Import ImportBox0
		gunModel[27] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import ImportBox0
		gunModel[28] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import ImportBox0
		gunModel[29] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import ImportBox0
		gunModel[30] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Import ImportBox0
		gunModel[31] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Import ImportBox0
		gunModel[32] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import ImportBox0
		gunModel[33] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import ImportBox0
		gunModel[34] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import ImportBox0
		gunModel[35] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Import ImportBox0
		gunModel[36] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Import ImportBox0
		gunModel[37] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Import ImportBox0
		gunModel[38] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportBox0
		gunModel[39] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import ImportBox0
		gunModel[40] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import ImportBox0
		gunModel[41] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Import ImportBox0
		gunModel[42] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import ImportBox0
		gunModel[43] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import ImportBox0
		gunModel[44] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Import ImportBox0
		gunModel[45] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Import ImportBox0
		gunModel[46] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Import ImportBox0
		gunModel[47] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Import ImportBox0
		gunModel[48] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Import ImportBox0
		gunModel[49] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import ImportBox0
		gunModel[50] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Import ImportBox0
		gunModel[51] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Import ImportBox0
		gunModel[52] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import ImportBox0
		gunModel[53] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Import ImportBox0
		gunModel[54] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Import ImportBox0
		gunModel[55] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Import ImportBox0
		gunModel[56] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Import ImportBox0
		gunModel[57] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Import ImportBox0
		gunModel[58] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import ImportBox0
		gunModel[59] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Import ImportBox0
		gunModel[60] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportBox0
		gunModel[61] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Import ImportBox0
		gunModel[62] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Import ImportBox0
		gunModel[63] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import ImportBox0
		gunModel[64] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import ImportBox0
		gunModel[65] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import ImportBox0
		gunModel[66] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Import ImportBox0
		gunModel[67] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Import ImportBox0
		gunModel[68] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Import ImportBox0
		gunModel[69] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Import ImportBox0
		gunModel[70] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Import ImportBox0
		gunModel[71] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Import ImportBox0
		gunModel[72] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Import ImportBox0
		gunModel[73] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import ImportBox0
		gunModel[74] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Import ImportBox0
		gunModel[75] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Import ImportBox0
		gunModel[76] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Import ImportBox0
		gunModel[77] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Import ImportBox0
		gunModel[78] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Import ImportBox0
		gunModel[79] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Import ImportBox0
		gunModel[80] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import ImportBox0
		gunModel[81] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Import ImportBox0
		gunModel[82] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import ImportBox0
		gunModel[83] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import ImportBox0
		gunModel[84] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import ImportBox0
		gunModel[85] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import ImportBox0
		gunModel[86] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportBox0
		gunModel[87] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import ImportBox0
		gunModel[88] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import ImportBox0
		gunModel[89] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import ImportBox0
		gunModel[90] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import ImportBox0
		gunModel[91] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import ImportBox0
		gunModel[92] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportBox0
		gunModel[93] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportBox0
		gunModel[94] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import ImportBox0
		gunModel[95] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Import ImportBox0
		gunModel[96] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Import ImportBox0
		gunModel[97] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Import ImportBox0
		gunModel[98] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Import ImportBox0
		gunModel[99] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Import ImportBox0
		gunModel[100] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Import ImportBox0
		gunModel[101] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Import ImportBox0
		gunModel[102] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Import ImportBox0
		gunModel[103] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Import ImportBox0
		gunModel[104] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Import ImportBox0
		gunModel[105] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Import ImportBox0
		gunModel[106] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Import ImportBox0
		gunModel[107] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Import ImportBox0
		gunModel[108] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Import ImportBox0
		gunModel[109] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Import ImportBox0
		gunModel[110] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Import ImportBox0
		gunModel[111] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import ImportBox772
		gunModel[112] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Import ImportBox773
		gunModel[113] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Import ImportBox774
		gunModel[114] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 7
		gunModel[115] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 8
		gunModel[116] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 9
		gunModel[117] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 10
		gunModel[118] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 362

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1.5F, 1F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1.5F); // Import ImportBox0
		gunModel[0].setRotationPoint(-14F, -11F, -4.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F); // Import ImportBox0
		gunModel[1].setRotationPoint(-13F, -11F, -5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1.5F, 1.5F, 0F, -1.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -1.5F); // Import ImportBox0
		gunModel[2].setRotationPoint(-15.25F, -9F, -4.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,-0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1.5F, 1.5F, 0F, -1.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -1.5F); // Import ImportBox0
		gunModel[3].setRotationPoint(-17F, -6F, -4.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,-0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1.5F, 1.5F, 0F, -1.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -1.5F); // Import ImportBox0
		gunModel[4].setRotationPoint(-18.75F, -2F, -4.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,-0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1.5F, 0.75F, 0F, -1.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, -1.5F); // Import ImportBox0
		gunModel[5].setRotationPoint(-20.5F, 3F, -4.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1.5F, 0.25F, -0.25F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.25F, -1.5F); // Import ImportBox0
		gunModel[6].setRotationPoint(-21.5F, 7F, -4.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1.5F); // Import ImportBox0
		gunModel[7].setRotationPoint(-12.75F, -13F, -4.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportBox0
		gunModel[8].setRotationPoint(-12.75F, -15F, -4.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportBox0
		gunModel[9].setRotationPoint(-12.75F, -16F, -4.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,1.5F, 0F, -1.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportBox0
		gunModel[10].setRotationPoint(-13.25F, -17F, -4.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,-0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -0.5F); // Import ImportBox0
		gunModel[11].setRotationPoint(-14.25F, -9F, -5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,-0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -0.5F); // Import ImportBox0
		gunModel[12].setRotationPoint(-16F, -6F, -5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,-0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -0.5F); // Import ImportBox0
		gunModel[13].setRotationPoint(-17.75F, -2F, -5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,-0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, -0.5F); // Import ImportBox0
		gunModel[14].setRotationPoint(-19.5F, 3F, -5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F); // Import ImportBox0
		gunModel[15].setRotationPoint(-11.75F, -13F, -5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[16].setRotationPoint(-11.75F, -15F, -5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[17].setRotationPoint(-11.75F, -16F, -5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[18].setRotationPoint(-12.25F, -17F, -5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 7, 2, 10, 0F,-0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox0
		gunModel[19].setRotationPoint(-11F, -11F, -5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 7, 3, 10, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Import ImportBox0
		gunModel[20].setRotationPoint(-12.25F, -9F, -5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 7, 4, 10, 0F,-0.25F, 0F, 0F, 2.6F, 0F, 0F, 2.6F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F); // Import ImportBox0
		gunModel[21].setRotationPoint(-14F, -6F, -5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 7, 5, 10, 0F,-0.25F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F, 0F); // Import ImportBox0
		gunModel[22].setRotationPoint(-15.75F, -2F, -5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 9, 4, 10, 0F,-0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0.75F, 0F, 0F); // Import ImportBox0
		gunModel[23].setRotationPoint(-17.5F, 3F, -5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 7, 2, 10, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox0
		gunModel[24].setRotationPoint(-9.75F, -13F, -5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 15, 9, 0F,-6F, 0F, 0F, 6F, 0F, -1.5F, 6F, 0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[25].setRotationPoint(-8F, -7F, -4.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 15, 10, 0F,-6F, 0F, 0F, 6F, 0F, -0.5F, 6F, 0F, -0.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[26].setRotationPoint(-10F, -7F, -5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,-0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0F, -0.5F); // Import ImportBox0
		gunModel[27].setRotationPoint(-20.5F, 7F, -5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 7, 2, 10, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[28].setRotationPoint(-9.75F, -15F, -5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,0.5F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[29].setRotationPoint(-9.75F, -16F, -5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[30].setRotationPoint(-10.25F, -17F, -5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-2.5F, 0F, 0F, 2.5F, 0F, -1.5F, 2.5F, 0F, -1.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, -2F, 0F, 0F); // Import ImportBox0
		gunModel[31].setRotationPoint(-4F, -10F, -4.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-2.5F, 0F, 0F, 2.5F, 0F, -1.5F, 2.5F, 0F, -1.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, -2F, 0F, 0F); // Import ImportBox0
		gunModel[32].setRotationPoint(-3.5F, -13F, -4.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,-3F, 0F, 0F, 3F, 0F, -1.5F, 3F, 0F, -1.5F, -3F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, -1.5F, 1.75F, 0F, -1.5F, -1.75F, 0F, 0F); // Import ImportBox0
		gunModel[33].setRotationPoint(-2.75F, -17F, -4.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,-2.5F, 0F, 0F, 2.5F, 0F, -0.5F, 2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, -2F, 0F, 0F); // Import ImportBox0
		gunModel[34].setRotationPoint(-6F, -10F, -5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,-2.5F, 0F, 0F, 2.5F, 0F, -0.5F, 2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, -2F, 0F, 0F); // Import ImportBox0
		gunModel[35].setRotationPoint(-5.5F, -13F, -5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,-3F, 0F, 0F, 3F, 0F, -0.5F, 3F, 0F, -0.5F, -3F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, -1.75F, 0F, 0F); // Import ImportBox0
		gunModel[36].setRotationPoint(-4.75F, -17F, -5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[37].setRotationPoint(-5.25F, -7F, -5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.25F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.25F, 0F, 0F, -0.1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.1F, 0F, 0F); // Import ImportBox0
		gunModel[38].setRotationPoint(-5.25F, -9F, -5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox0
		gunModel[39].setRotationPoint(-5.25F, -10F, -5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.25F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox0
		gunModel[40].setRotationPoint(-5.25F, -11F, -5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-2.5F, 0F, 0F, 2.5F, 0F, -1.5F, 2.5F, 0F, -1.5F, -2.5F, 0F, 0F, -1.25F, -0.75F, 0F, 1.25F, -0.25F, -1.5F, 1.25F, -0.25F, -1.5F, -1.25F, -0.75F, 0F); // Import ImportBox0
		gunModel[41].setRotationPoint(-10.5F, 8F, -4.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,-2.5F, 0F, 0F, 2.5F, 0F, -0.5F, 2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -1.75F, -1.5F, 0F, 1.25F, -0.75F, -0.5F, 1.25F, -0.75F, -0.5F, -1.75F, -1.5F, 0F); // Import ImportBox0
		gunModel[42].setRotationPoint(-12.5F, 8F, -5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,-0.25F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[43].setRotationPoint(-18.5F, 7F, -5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.3F, 0F, 0F); // Import ImportBox0
		gunModel[44].setRotationPoint(-19F, 8F, -5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-0.25F, -0.25F, 0F, 0.25F, -0.75F, -1.5F, 0.25F, -0.75F, -1.5F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 0.25F, -0.25F, 0.5F); // Import ImportBox0
		gunModel[45].setRotationPoint(-9.5F, 10F, -4.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0.25F, 0.5F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0.5F, 0F, 0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0.25F, -0.25F, 0F); // Import ImportBox0
		gunModel[46].setRotationPoint(-10.5F, 10F, -5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0.25F, 0.55F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.55F, 0F, 0.25F, -1.55F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -1.55F, 0F); // Import ImportBox0
		gunModel[47].setRotationPoint(-11.5F, 10F, -5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Import ImportBox0
		gunModel[48].setRotationPoint(-9.75F, 12.75F, -5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Import ImportBox0
		gunModel[49].setRotationPoint(-10.75F, 12.25F, -5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 2.3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2.3F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Import ImportBox0
		gunModel[50].setRotationPoint(-11.75F, 11.75F, -5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, -0.15F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.15F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F); // Import ImportBox0
		gunModel[51].setRotationPoint(-16F, 9F, -5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-0.25F, 2.6F, 0F, 0F, 2.55F, 0F, 0F, 2.55F, 0F, -0.25F, 2.6F, 0F, -0.25F, -2.1F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -0.25F, -2.1F, 0F); // Import ImportBox0
		gunModel[52].setRotationPoint(-12.75F, 12F, -5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.25F, 2.65F, 0F, -0.25F, 2.6F, 0F, -0.25F, 2.6F, 0F, -0.25F, 2.65F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1.5F, 0F); // Import ImportBox0
		gunModel[53].setRotationPoint(-13.25F, 12F, -5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.1F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.15F, 0.25F, 0F, -0.15F, 0.25F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[54].setRotationPoint(-17.25F, 9F, -5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0.45F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.45F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Import ImportBox0
		gunModel[55].setRotationPoint(-18.25F, 9F, -5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0.75F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.75F, -0.5F, 0F); // Import ImportBox0
		gunModel[56].setRotationPoint(-18.25F, 10F, -5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,0F, 1F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[57].setRotationPoint(-8.75F, 13.75F, -5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,0F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 3F, -1F, 0.5F, 3F, -1F, 0F, 0F, -1F); // Import ImportBox0
		gunModel[58].setRotationPoint(-8.75F, 14.75F, -5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-0.25F, -0.15F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, -0.15F, 0F, -0.25F, 0.3F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, -0.25F, 0.3F, -1F); // Import ImportBox0
		gunModel[59].setRotationPoint(-12.75F, 12.75F, -5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[60].setRotationPoint(-1.25F, 15.75F, -5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0.4F, 0.25F, 0F, 0.4F, 0.25F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.85F, 0.25F, 0F, 0.85F, 0.25F, 0F, 0.4F, 0F); // Import ImportBox0
		gunModel[61].setRotationPoint(-0.25F, 15.75F, -5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0.4F, 0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.4F, 0.25F, 0F, 0.85F, 0.25F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, 0.85F, 0.25F); // Import ImportBox0
		gunModel[62].setRotationPoint(0.75F, 15.75F, -5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 1F, 0F, 0F, 1.45F, -0.5F, 0F, 1.45F, -0.5F, 0F, 1F, 0F, 0F, 1.3F, 0F, 0F, 1.6F, -0.5F, 0F, 1.6F, -0.5F, 0F, 1.3F, 0F); // Import ImportBox0
		gunModel[63].setRotationPoint(1.75F, 15.75F, -5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 1.45F, 0F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 1.45F, 0F, 0F, 1.6F, 0F, 0F, 2.05F, -0.5F, 0F, 2.05F, -0.5F, 0F, 1.6F, 0F); // Import ImportBox0
		gunModel[64].setRotationPoint(2.75F, 15.75F, -4.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, 1.45F, 0F, 0.5F, 3.25F, 0F, 0.5F, 3.25F, 0F, 0F, 1.45F, 0F, 0F, 2.05F, 0F, 0F, 2.05F, 0F, 0F, 2.05F, 0F, 0F, 2.05F, 0F); // Import ImportBox0
		gunModel[65].setRotationPoint(4.75F, 14.75F, -4F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 5, 24, 8, 0F,-8.25F, 0F, 0F, 7.75F, 0F, 0F, 7.75F, 0F, 0F, -8.25F, 0F, 0F, 0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Import ImportBox0
		gunModel[66].setRotationPoint(8.75F, -12.25F, -4F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,-1F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Import ImportBox0
		gunModel[67].setRotationPoint(16.75F, -14.25F, -4.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox0
		gunModel[68].setRotationPoint(17.75F, -15.25F, -4.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 34, 1, 10, 0F,0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[69].setRotationPoint(17.75F, -16.25F, -5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 35, 1, 11, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Import ImportBox0
		gunModel[70].setRotationPoint(17.75F, -17.5F, -5.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 35, 1, 11, 0F,2.5F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 2.5F, -0.25F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox0
		gunModel[71].setRotationPoint(17.75F, -18.5F, -5.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, -2.5F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, -1F, 0.25F, 0.25F, -2.5F); // Import ImportBox0
		gunModel[72].setRotationPoint(-14.5F, -19.25F, -5.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 8, 2, 11, 0F,0.25F, -0.15F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, -0.15F, 0F, 0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F); // Import ImportBox0
		gunModel[73].setRotationPoint(-11.5F, -19.25F, -5.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, -1F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -1F); // Import ImportBox0
		gunModel[74].setRotationPoint(-13.5F, -19.25F, -5.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Import ImportBox0
		gunModel[75].setRotationPoint(-3.5F, -19.25F, -5.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -0.5F); // Import ImportBox0
		gunModel[76].setRotationPoint(-1.75F, -19.25F, -5.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -2.5F, 0F, 0.25F, -2.5F, 0F, 0.25F, -1F); // Import ImportBox0
		gunModel[77].setRotationPoint(0.25F, -19.25F, -5.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 14, 2, 11, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, -2.5F, 0F, 0.25F, -2.5F, 0F, 0.25F, -2.5F, 0F, 0.25F, -2.5F); // Import ImportBox0
		gunModel[78].setRotationPoint(1.25F, -19.25F, -5.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, -1F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0.25F, -2.5F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0.25F, -2.5F); // Import ImportBox0
		gunModel[79].setRotationPoint(15.25F, -19.25F, -5.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, -1.75F, 0F, -1F, -1.75F, 0F, -1F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.25F, -1F, -0.62F, 0.25F, -0.25F, -0.62F, 0.25F, -0.25F, 0F, 0.25F, -1F); // Import ImportBox0
		gunModel[80].setRotationPoint(16.75F, -19.25F, -5.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0.05F, -0.25F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0.05F, -0.25F, 0F, 0.05F, 0.15F, -1F, 0F, 2.3F, -1F, 0F, 2.3F, -1F, 0.05F, 0.15F, -1F); // Import ImportBox0
		gunModel[81].setRotationPoint(-17.5F, 10.75F, -5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[82].setRotationPoint(7F, -7.25F, -3F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Import ImportBox0
		gunModel[83].setRotationPoint(1F, -7.25F, -3F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import ImportBox0
		gunModel[84].setRotationPoint(7F, -6.25F, -3F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -3F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -3F, -0.5F); // Import ImportBox0
		gunModel[85].setRotationPoint(1F, -6.25F, -3F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[86].setRotationPoint(-1F, -9.75F, -3F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[87].setRotationPoint(0F, -10.75F, -3F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.7F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0.5F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F); // Import ImportBox0
		gunModel[88].setRotationPoint(-1F, -10.75F, -3F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[89].setRotationPoint(0F, -9.25F, -3F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[90].setRotationPoint(-1F, -9.25F, -3F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[91].setRotationPoint(-1F, -8.75F, -3F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0.75F, 1.5F, 0F, 0.75F, 1.5F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F); // Import ImportBox0
		gunModel[92].setRotationPoint(13F, -7.25F, -3F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, 1.25F, -0.5F, -0.75F, 1.25F, -0.5F, 0F, -0.5F, -0.5F); // Import ImportBox0
		gunModel[93].setRotationPoint(13F, -6.25F, -3F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.95F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, -0.75F, 1.57F, 0F, -0.75F, 1.57F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[94].setRotationPoint(13F, -7.25F, -3F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,-0.55F, -0.6F, 0F, -0.3F, -2.2F, 0F, -0.3F, -2.2F, 0F, -0.55F, -0.6F, 0F, 0.05F, 0.25F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0.05F, 0.25F, 0F); // Import ImportBox0
		gunModel[95].setRotationPoint(-17.5F, 9.75F, -5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0.05F, -0.25F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0.05F, -0.25F, 0F, 0.05F, 0.15F, 0F, 0F, 2.55F, 0F, 0F, 2.55F, 0F, 0.05F, 0.15F, 0F); // Import ImportBox0
		gunModel[96].setRotationPoint(-17.5F, 7.75F, -4.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0.5F, -1.75F, 0F, -0.05F, -2.25F, 0F, -0.05F, -2.25F, 0F, 0.5F, -1.75F, 0F, 0.5F, 1.5F, -1F, -0.05F, 2.15F, -1F, -0.05F, 2.15F, -1F, 0.5F, 1.5F, -1F); // Import ImportBox0
		gunModel[97].setRotationPoint(-18.5F, 8.75F, -5F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0.25F, -1.75F, -0.5F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, 0.25F, -1.75F, -0.5F, 0.25F, 1.25F, -1.5F, -0.5F, 2F, -1F, -0.5F, 2F, -1F, 0.25F, 1.25F, -1.5F); // Import ImportBox0
		gunModel[98].setRotationPoint(-20.5F, 8.25F, -5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0.25F, -2F, -2F, -0.25F, -2.25F, -0.5F, -0.25F, -2.25F, -0.5F, 0.25F, -2F, -2F, 0.25F, 1.25F, -2F, -0.25F, 1.75F, -1.5F, -0.25F, 1.75F, -1.5F, 0.25F, 1.25F, -2F); // Import ImportBox0
		gunModel[99].setRotationPoint(-21.5F, 7.75F, -5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.4F, -1F, 0F, 0.4F, -1F, 0F, 0F, -1F); // Import ImportBox0
		gunModel[100].setRotationPoint(-1.25F, 17.75F, -5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.4F, 0F, 0F, -0.8F, 0.25F, 0F, -0.8F, 0.25F, 0F, -0.4F, 0F, 0F, 0.4F, -1F, 0F, 0.85F, -0.75F, 0F, 0.85F, -0.75F, 0F, 0.4F, -1F); // Import ImportBox0
		gunModel[101].setRotationPoint(-0.25F, 17.75F, -5F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.85F, 0.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.85F, 0.25F, 0F, 0.85F, -0.75F, 0F, 1.3F, -1F, 0F, 1.3F, -1F, 0F, 0.85F, -0.75F); // Import ImportBox0
		gunModel[102].setRotationPoint(0.75F, 17.75F, -5F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1.3F, 0F, 0F, -1.6F, -0.5F, 0F, -1.6F, -0.5F, 0F, -1.3F, 0F, 0F, 1.3F, -1F, 0F, 1.6F, -1.5F, 0F, 1.6F, -1.5F, 0F, 1.3F, -1F); // Import ImportBox0
		gunModel[103].setRotationPoint(1.75F, 17.75F, -5F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -1.35F, 0F, 0F, -1.8F, -0.5F, 0F, -1.8F, -0.5F, 0F, -1.35F, 0F, 0F, 1.35F, -1F, 0F, 1.9F, -1.5F, 0F, 1.9F, -1.5F, 0F, 1.35F, -1F); // Import ImportBox0
		gunModel[104].setRotationPoint(2.75F, 18F, -4.5F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -1F, 0F, 0.05F, -1F, 0F, 0.05F, -1F, 0F, 0.05F, -1F); // Import ImportBox0
		gunModel[105].setRotationPoint(4.75F, 19.85F, -4F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 10, 24, 8, 0F,-8.75F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -8.75F, -0.25F, 0F, 0F, 0F, 0F, -8.75F, 0F, -1F, -8.75F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[106].setRotationPoint(12.75F, -12.5F, -4F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,-1.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, -0.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, -1.25F, 0F, 0F, -0.25F); // Import ImportBox0
		gunModel[107].setRotationPoint(23F, -15.25F, -4.5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox0
		gunModel[108].setRotationPoint(4.5F, 15.75F, -4.5F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Import ImportBox0
		gunModel[109].setRotationPoint(4.5F, 17.25F, -4.5F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,-1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox0
		gunModel[110].setRotationPoint(4.5F, 14.25F, -4.5F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox772
		gunModel[111].setRotationPoint(-3F, -22F, -5.6F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox773
		gunModel[112].setRotationPoint(-3F, -21.5F, -5.6F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Import ImportBox774
		gunModel[113].setRotationPoint(-3F, -21F, -5.6F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,-1.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.5F, -1.75F, 0F, -1.5F, -1.75F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 7
		gunModel[114].setRotationPoint(21.5F, -14.25F, -4.5F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 5, 9, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.7F, 0F, -3F, -0.7F, 0F, -3F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 8
		gunModel[115].setRotationPoint(7.75F, 11.5F, -4F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 5, 9, 8, 0F,-3F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -3F, 0F, 0F, 0F, -0.7F, 0F, -4F, -0.7F, -1F, -4F, -0.7F, -1F, 0F, -0.7F, 0F); // Box 9
		gunModel[116].setRotationPoint(9.75F, 11.5F, -4F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0.05F, 0F, 0F, 0.05F, -1F, 0F, 0.05F, -1F, 0F, 0.05F, 0F, 0F, 0.05F, -1F, -0.5F, 0.05F, -2F, -0.5F, 0.05F, -2F, 0F, 0.05F, -1F); // Box 10
		gunModel[117].setRotationPoint(9.75F, 19.85F, -4F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		gunModel[118].setRotationPoint(28F, -24.75F, 3.75F);
	}

	private void initdefaultScopeModel_1()
	{
		defaultScopeModel[0] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Import ImportBox0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Import ImportBox0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Import ImportBox0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import ImportBox0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Import ImportBox0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Import ImportBox0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Import ImportBox0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Import ImportBox0
		defaultScopeModel[8] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Import ImportBox0
		defaultScopeModel[9] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Import ImportBox0
		defaultScopeModel[10] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Import ImportBox0
		defaultScopeModel[11] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Import ImportBox725
		defaultScopeModel[12] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import ImportBox727
		defaultScopeModel[13] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import ImportBox728
		defaultScopeModel[14] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Import ImportBox729
		defaultScopeModel[15] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import ImportBox0
		defaultScopeModel[16] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Import ImportBox0
		defaultScopeModel[17] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Import ImportBox0
		defaultScopeModel[18] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Import ImportBox0
		defaultScopeModel[19] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportBox0
		defaultScopeModel[20] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Import ImportBox0
		defaultScopeModel[21] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Import ImportBox0
		defaultScopeModel[22] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Import ImportBox0
		defaultScopeModel[23] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Import ImportBox824
		defaultScopeModel[24] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Import ImportBox825
		defaultScopeModel[25] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Import ImportBox826
		defaultScopeModel[26] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Import ImportBox672
		defaultScopeModel[27] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Import ImportBox672
		defaultScopeModel[28] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Import ImportBox672
		defaultScopeModel[29] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Import ImportBox672
		defaultScopeModel[30] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Import ImportBox672
		defaultScopeModel[31] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Import ImportBox672
		defaultScopeModel[32] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Import ImportBox672
		defaultScopeModel[33] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Import ImportBox672
		defaultScopeModel[34] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import ImportBox672
		defaultScopeModel[35] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Import ImportBox672
		defaultScopeModel[36] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 378
		defaultScopeModel[37] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 379
		defaultScopeModel[38] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 380
		defaultScopeModel[39] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 381

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		defaultScopeModel[0].setRotationPoint(-10F, -28.5F, 2F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Import ImportBox0
		defaultScopeModel[1].setRotationPoint(-10F, -29F, 2F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -1F, 0F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Import ImportBox0
		defaultScopeModel[2].setRotationPoint(-10F, -29.5F, 2F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.25F, -1.25F, 0F, -1.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Import ImportBox0
		defaultScopeModel[3].setRotationPoint(-9.5F, -30F, 2F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		defaultScopeModel[4].setRotationPoint(-10F, -28F, -4F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox0
		defaultScopeModel[5].setRotationPoint(-6.75F, -29.25F, 3.25F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox0
		defaultScopeModel[6].setRotationPoint(-6.75F, -28.75F, 3.25F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Import ImportBox0
		defaultScopeModel[7].setRotationPoint(-6.75F, -28.25F, 3.25F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.25F, -0.5F, -0.25F, -1.65F, -0.5F, -0.25F, -1.65F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, 0F, 0F, -1.35F, 0F, 0F, -1.35F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		defaultScopeModel[8].setRotationPoint(46F, -30F, -3F);

		defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, -0.5F, -0.25F, -2.4F, -0.5F, -0.25F, -2.4F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.25F, 0F, 0F, -1.65F, 0F, 0F, -1.65F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox0
		defaultScopeModel[9].setRotationPoint(46F, -30.5F, -2.75F);

		defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.25F, -0.35F, 0F, 0.25F, -0.35F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		defaultScopeModel[10].setRotationPoint(46F, -29F, -2.75F);

		defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox725
		defaultScopeModel[11].setRotationPoint(46F, -28F, 1F);

		defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.25F, -0.5F, 0.25F, -1.65F, -0.5F, 0.25F, -1.65F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, 0F, 0F, -1.35F, 0F, 0F, -1.35F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox727
		defaultScopeModel[12].setRotationPoint(46F, -30F, 2F);

		defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, -0.5F, 0.25F, -2.4F, -0.5F, 0.25F, -2.4F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.25F, 0F, 0F, -1.65F, 0F, 0F, -1.65F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox728
		defaultScopeModel[13].setRotationPoint(46F, -30.5F, 1.75F);

		defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox729
		defaultScopeModel[14].setRotationPoint(46F, -29F, 1.75F);

		defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		defaultScopeModel[15].setRotationPoint(46F, -28.25F, 1.25F);

		defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		defaultScopeModel[16].setRotationPoint(46F, -28.25F, 0.75F);

		defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import ImportBox0
		defaultScopeModel[17].setRotationPoint(47.5F, -28.25F, -1F);

		defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F); // Import ImportBox0
		defaultScopeModel[18].setRotationPoint(47F, -28.25F, -1F);

		defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F); // Import ImportBox0
		defaultScopeModel[19].setRotationPoint(48F, -28.25F, -1F);

		defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F); // Import ImportBox0
		defaultScopeModel[20].setRotationPoint(47.85F, -29.25F, -0.38F);

		defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import ImportBox0
		defaultScopeModel[21].setRotationPoint(47.35F, -29.25F, -0.38F);

		defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.5F); // Import ImportBox0
		defaultScopeModel[22].setRotationPoint(47.1F, -29.25F, -0.38F);

		defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Import ImportBox824
		defaultScopeModel[23].setRotationPoint(46F, -28F, -2F);

		defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox825
		defaultScopeModel[24].setRotationPoint(46F, -28.25F, -2.25F);

		defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox826
		defaultScopeModel[25].setRotationPoint(46F, -28.25F, -1.75F);

		defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F); // Import ImportBox672
		defaultScopeModel[26].setRotationPoint(-6.6F, -29F, -2F);

		defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F); // Import ImportBox672
		defaultScopeModel[27].setRotationPoint(-7.1F, -29F, -2F);

		defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox672
		defaultScopeModel[28].setRotationPoint(-6.1F, -30.75F, -1F);

		defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Import ImportBox672
		defaultScopeModel[29].setRotationPoint(-6.1F, -29.75F, -1F);

		defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Import ImportBox672
		defaultScopeModel[30].setRotationPoint(-6.1F, -29.75F, 0.5F);

		defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.99F, -0.25F, -0.75F, -0.99F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox672
		defaultScopeModel[31].setRotationPoint(-6.1F, -29.75F, -0.5F);

		defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.99F, -0.25F, -0.75F, -0.99F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Import ImportBox672
		defaultScopeModel[32].setRotationPoint(-6.1F, -29.75F, -0.5F);

		defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.99F, -0.25F, -0.75F, -0.99F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Import ImportBox672
		defaultScopeModel[33].setRotationPoint(-6.1F, -29.75F, -0.5F);

		defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.99F, -0.25F, -0.75F, -0.99F); // Import ImportBox672
		defaultScopeModel[34].setRotationPoint(-6.1F, -29.75F, -0.5F);

		defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.25F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.25F, -0.1F, 0F); // Import ImportBox672
		defaultScopeModel[35].setRotationPoint(-5.1F, -29F, -2F);

		defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1.25F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 378
		defaultScopeModel[36].setRotationPoint(-9.5F, -30F, -4F);

		defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 379
		defaultScopeModel[37].setRotationPoint(-10F, -28.5F, -4F);

		defaultScopeModel[38].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 380
		defaultScopeModel[38].setRotationPoint(-10F, -29F, -4F);

		defaultScopeModel[39].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-1F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 381
		defaultScopeModel[39].setRotationPoint(-10F, -29.5F, -4F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Import Box303
		ammoModel[1] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Import Box304
		ammoModel[2] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box305
		ammoModel[3] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Import Box306
		ammoModel[4] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Import Box307
		ammoModel[5] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Import Box308
		ammoModel[6] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Import Box309
		ammoModel[7] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Import Box310
		ammoModel[8] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Import Box311
		ammoModel[9] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Import Box312
		ammoModel[10] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Import Box313
		ammoModel[11] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Import Box314
		ammoModel[12] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Import Box315
		ammoModel[13] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import Box316
		ammoModel[14] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Import Box317

		ammoModel[0].addShapeBox(0F, 0F, 0F, 16, 26, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Import Box303
		ammoModel[0].setRotationPoint(-21F, -10.5F, 2F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 10, 26, 6, 0F,-9F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -0.5F, 0F, 0F, -0.5F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -0.5F); // Import Box304
		ammoModel[1].setRotationPoint(-22F, -10.5F, -3F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 10, 26, 6, 0F,-9F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -0.5F, -9F, 0F, -0.5F, 0F, 0F, 0F); // Import Box305
		ammoModel[2].setRotationPoint(-14F, -10.5F, -3F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 16, 26, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Import Box306
		ammoModel[3].setRotationPoint(-21F, -10.5F, -3F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box307
		ammoModel[4].setRotationPoint(-22F, 15.5F, -4F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F); // Import Box308
		ammoModel[5].setRotationPoint(-13F, 15.5F, -4F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.25F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.75F); // Import Box309
		ammoModel[6].setRotationPoint(-23F, 15.5F, -4F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -0.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Import Box310
		ammoModel[7].setRotationPoint(-12.5F, 15.5F, -4F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box311
		ammoModel[8].setRotationPoint(-12F, -12.5F, 2F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.5F, -0.5F, -2.5F, -0.5F, -0.5F, -2.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box312
		ammoModel[9].setRotationPoint(-12F, -12.5F, -3F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.55F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.55F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box313
		ammoModel[10].setRotationPoint(-13F, -12.5F, -3F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,-1F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box314
		ammoModel[11].setRotationPoint(-22F, 14.5F, -4F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.5F, -0.75F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, -0.5F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F); // Import Box315
		ammoModel[12].setRotationPoint(-13F, 14.5F, -4F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.5F, -1F, -0.75F, -0.5F, -2F, -0.75F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, 0F, 0F, -0.5F); // Import Box316
		ammoModel[13].setRotationPoint(-12.5F, 14.5F, -4F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, -0.5F, -1.25F, 1F, -0.5F, -0.75F, 1F, -0.5F, -0.75F, -1F, -0.5F, -1.25F, -0.25F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.75F); // Import Box317
		ammoModel[14].setRotationPoint(-23F, 14.5F, -4F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Import ImportBox0
		slideModel[1] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import ImportBox0
		slideModel[2] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Import ImportBox0
		slideModel[3] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import ImportBox0
		slideModel[4] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Import ImportBox0
		slideModel[5] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Import ImportBox0
		slideModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportBox0
		slideModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import ImportBox0
		slideModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import ImportBox0
		slideModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import ImportBox0
		slideModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import ImportBox0
		slideModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import ImportBox0
		slideModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import ImportBox0
		slideModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportBox0
		slideModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportBox0
		slideModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import ImportBox0
		slideModel[16] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import ImportBox0
		slideModel[17] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Import ImportBox0
		slideModel[18] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import ImportBox0
		slideModel[19] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import ImportBox0
		slideModel[20] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Import ImportBox0
		slideModel[21] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import ImportBox0
		slideModel[22] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import ImportBox0
		slideModel[23] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import ImportBox0
		slideModel[24] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import ImportBox0
		slideModel[25] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Import ImportBox0
		slideModel[26] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import ImportBox0
		slideModel[27] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import ImportBox0
		slideModel[28] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import ImportBox0
		slideModel[29] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import ImportBox0
		slideModel[30] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Import ImportBox0
		slideModel[31] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Import ImportBox0
		slideModel[32] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Import ImportBox0
		slideModel[33] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Import ImportBox0
		slideModel[34] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Import ImportBox0
		slideModel[35] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import ImportBox0
		slideModel[36] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportBox0
		slideModel[37] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Import ImportBox0
		slideModel[38] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import ImportBox0
		slideModel[39] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import ImportBox0
		slideModel[40] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import ImportBox0
		slideModel[41] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import ImportBox0
		slideModel[42] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Import ImportBox0
		slideModel[43] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Import ImportBox0
		slideModel[44] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Import ImportBox0
		slideModel[45] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Import ImportBox0
		slideModel[46] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import ImportBox0
		slideModel[47] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Import ImportBox0
		slideModel[48] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Import ImportBox0
		slideModel[49] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Import ImportBox0
		slideModel[50] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Import ImportBox0
		slideModel[51] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import ImportBox0
		slideModel[52] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Import ImportBox0
		slideModel[53] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import ImportBox0
		slideModel[54] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Import ImportBox0
		slideModel[55] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Import ImportBox0
		slideModel[56] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Import ImportBox0
		slideModel[57] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Import ImportBox0
		slideModel[58] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Import ImportBox0
		slideModel[59] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Import ImportBox0
		slideModel[60] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Import ImportBox0
		slideModel[61] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Import ImportBox0
		slideModel[62] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Import ImportBox0
		slideModel[63] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Import ImportBox0
		slideModel[64] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Import ImportBox0
		slideModel[65] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Import ImportBox0
		slideModel[66] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import ImportBox0
		slideModel[67] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 0
		slideModel[68] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 2
		slideModel[69] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 3
		slideModel[70] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 4
		slideModel[71] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 5
		slideModel[72] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 6
		slideModel[73] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Import ImportBox0
		slideModel[74] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Import ImportBox0
		slideModel[75] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Import ImportBox0
		slideModel[76] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Import ImportBox0
		slideModel[77] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import ImportBox0
		slideModel[78] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Import ImportBox0
		slideModel[79] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Import ImportBox0
		slideModel[80] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Import ImportBox0
		slideModel[81] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import ImportBox0
		slideModel[82] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Import ImportBox0
		slideModel[83] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Import ImportBox0
		slideModel[84] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import ImportBox0
		slideModel[85] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Import ImportBox0
		slideModel[86] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Import ImportBox0
		slideModel[87] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Import ImportBox0
		slideModel[88] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Import ImportBox0
		slideModel[89] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Import ImportBox0
		slideModel[90] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 342
		slideModel[91] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 343
		slideModel[92] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 344
		slideModel[93] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 345
		slideModel[94] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 346
		slideModel[95] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 347
		slideModel[96] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 348
		slideModel[97] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 349
		slideModel[98] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 350
		slideModel[99] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 351
		slideModel[100] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 352
		slideModel[101] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 353
		slideModel[102] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 354
		slideModel[103] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 355
		slideModel[104] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 356
		slideModel[105] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 357
		slideModel[106] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 358
		slideModel[107] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 359
		slideModel[108] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 360
		slideModel[109] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 361

		slideModel[0].addShapeBox(0F, 0F, 0F, 31, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[0].setRotationPoint(-3.5F, -25.25F, -3.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 2, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[1].setRotationPoint(-15.5F, -25.25F, -5.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 10, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[2].setRotationPoint(-13.5F, -25.25F, -5.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 69, 1, 11, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[3].setRotationPoint(-15.5F, -26.25F, -5.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, 0.75F, 1.5F, 0F, 0.75F, 1.5F, 0F, 0.75F, 1.5F, -0.25F, 0.75F, 1.5F, -0.25F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F); // Import ImportBox0
		slideModel[4].setRotationPoint(-15.75F, -18.5F, -4F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, -0.25F, 0.5F, 0.1F, -0.25F, -0.8F, -0.8F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.25F, -0.8F, -0.8F); // Import ImportBox0
		slideModel[5].setRotationPoint(-15.75F, -17.5F, -4F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox0
		slideModel[6].setRotationPoint(13F, -24.65F, 4.6F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F); // Import ImportBox0
		slideModel[7].setRotationPoint(14F, -24.65F, 4.6F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox0
		slideModel[8].setRotationPoint(16.85F, -19F, 4.6F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F); // Import ImportBox0
		slideModel[9].setRotationPoint(17.85F, -19F, 4.6F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox0
		slideModel[10].setRotationPoint(18.75F, -19F, 4.6F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F); // Import ImportBox0
		slideModel[11].setRotationPoint(19.75F, -19F, 4.6F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox0
		slideModel[12].setRotationPoint(20.65F, -19F, 4.6F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F); // Import ImportBox0
		slideModel[13].setRotationPoint(21.65F, -19F, 4.6F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox0
		slideModel[14].setRotationPoint(22.35F, -19.1F, 4.6F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox0
		slideModel[15].setRotationPoint(23.75F, -19.1F, 4.6F);

		slideModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox0
		slideModel[16].setRotationPoint(23.05F, -19.1F, 4.6F);

		slideModel[17].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[17].setRotationPoint(-10.5F, -24.5F, 5.5F);

		slideModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox0
		slideModel[18].setRotationPoint(-10.5F, -23.5F, 5.5F);

		slideModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.95F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[19].setRotationPoint(4F, -24.5F, 5.5F);

		slideModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.95F); // Import ImportBox0
		slideModel[20].setRotationPoint(-15F, -24.5F, 5.5F);

		slideModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.95F); // Import ImportBox0
		slideModel[21].setRotationPoint(-14F, -22.5F, 5.5F);

		slideModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.95F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.95F); // Import ImportBox0
		slideModel[22].setRotationPoint(-13F, -20.5F, 5.5F);

		slideModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		slideModel[23].setRotationPoint(-10.5F, -20.5F, 5.5F);

		slideModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.95F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.95F); // Import ImportBox0
		slideModel[24].setRotationPoint(-13F, -20F, 5.5F);

		slideModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Import ImportBox0
		slideModel[25].setRotationPoint(-4.5F, -22F, 5.25F);

		slideModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0.5F, 0F); // Import ImportBox0
		slideModel[26].setRotationPoint(-9F, -22F, 5.5F);

		slideModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F); // Import ImportBox0
		slideModel[27].setRotationPoint(-5.5F, -22F, 5.5F);

		slideModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F); // Import ImportBox0
		slideModel[28].setRotationPoint(-9F, -22F, 5.5F);

		slideModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0.5F, 0F, -0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, -0.5F, 1F, 0F); // Import ImportBox0
		slideModel[29].setRotationPoint(-5F, -22F, 5.5F);

		slideModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F); // Import ImportBox0
		slideModel[30].setRotationPoint(1.75F, -22.5F, 5.5F);

		slideModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.5F, 1F, 0F); // Import ImportBox0
		slideModel[31].setRotationPoint(-0.5F, -22.5F, 5.5F);

		slideModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0.5F, -0.25F); // Import ImportBox0
		slideModel[32].setRotationPoint(-0.5F, -22.5F, 5.5F);

		slideModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.9F, -0.5F, 0.5F, -0.9F, -0.5F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.9F, -0.5F, 1F, -0.9F); // Import ImportBox0
		slideModel[33].setRotationPoint(-0.5F, -22.5F, 6.5F);

		slideModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.9F, -0.5F, 0.5F, -0.9F, -0.5F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.9F, -0.5F, 1F, -0.9F); // Import ImportBox0
		slideModel[34].setRotationPoint(0F, -22.5F, 6.5F);

		slideModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.9F, -0.5F, 0.5F, -0.9F, -0.5F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.9F, -0.5F, 1F, -0.9F); // Import ImportBox0
		slideModel[35].setRotationPoint(0.5F, -22.5F, 6.5F);

		slideModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.9F, -0.5F, 0.5F, -0.9F, -0.5F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.9F, -0.5F, 1F, -0.9F); // Import ImportBox0
		slideModel[36].setRotationPoint(1F, -22.5F, 6.5F);

		slideModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.9F, -0.5F, 0.5F, -0.9F, -0.5F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.9F, -0.5F, 1F, -0.9F); // Import ImportBox0
		slideModel[37].setRotationPoint(1.5F, -22.5F, 6.5F);

		slideModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.9F, -0.5F, 0.5F, -0.9F, -0.5F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.9F, -0.5F, 1F, -0.9F); // Import ImportBox0
		slideModel[38].setRotationPoint(-7.5F, -22F, 6.5F);

		slideModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.9F, -0.5F, 0.5F, -0.9F, -0.5F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.9F, -0.5F, 1F, -0.9F); // Import ImportBox0
		slideModel[39].setRotationPoint(-7F, -22F, 6.5F);

		slideModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.9F, -0.5F, 0.5F, -0.9F, -0.5F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.9F, -0.5F, 1F, -0.9F); // Import ImportBox0
		slideModel[40].setRotationPoint(-6.5F, -22F, 6.5F);

		slideModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.9F, -0.5F, 0.5F, -0.9F, -0.5F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.9F, -0.5F, 1F, -0.9F); // Import ImportBox0
		slideModel[41].setRotationPoint(-6F, -22F, 6.5F);

		slideModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.9F, -0.5F, 0.5F, -0.9F, -0.5F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.9F, -0.5F, 1F, -0.9F); // Import ImportBox0
		slideModel[42].setRotationPoint(-5.5F, -22F, 6.5F);

		slideModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.9F, -0.5F, 0.5F, -0.9F, -0.5F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.9F, -0.5F, 1F, -0.9F); // Import ImportBox0
		slideModel[43].setRotationPoint(-8F, -22F, 6.5F);

		slideModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.9F, -0.5F, 0.5F, -0.9F, -0.5F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.9F, -0.5F, 1F, -0.9F); // Import ImportBox0
		slideModel[44].setRotationPoint(-8.5F, -22F, 6.5F);

		slideModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.9F, -0.5F, 0.5F, -0.9F, -0.5F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, -0.9F, -0.5F, 1F, -0.9F); // Import ImportBox0
		slideModel[45].setRotationPoint(-9F, -22F, 6.5F);

		slideModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox0
		slideModel[46].setRotationPoint(-3.5F, -23F, 5F);

		slideModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[47].setRotationPoint(-3.5F, -23F, 5F);

		slideModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox0
		slideModel[48].setRotationPoint(-3.5F, -23.5F, 5F);

		slideModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox0
		slideModel[49].setRotationPoint(-3.5F, -20.5F, 5F);

		slideModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		slideModel[50].setRotationPoint(-3.5F, -20F, 5F);

		slideModel[51].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox0
		slideModel[51].setRotationPoint(45F, -21.5F, -6F);

		slideModel[52].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox0
		slideModel[52].setRotationPoint(45F, -19.5F, -6F);

		slideModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox0
		slideModel[53].setRotationPoint(47.5F, -21F, -6F);

		slideModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox0
		slideModel[54].setRotationPoint(50F, -21F, -6F);

		slideModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox0
		slideModel[55].setRotationPoint(45F, -21F, -6F);

		slideModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,-1F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F); // Import ImportBox0
		slideModel[56].setRotationPoint(50.5F, -21F, -6F);

		slideModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,-0.5F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox0
		slideModel[57].setRotationPoint(44.5F, -21F, -6F);

		slideModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[58].setRotationPoint(49F, -20.5F, -6F);

		slideModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		slideModel[59].setRotationPoint(49F, -21F, -6F);

		slideModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox0
		slideModel[60].setRotationPoint(49.5F, -20.5F, -6F);

		slideModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import ImportBox0
		slideModel[61].setRotationPoint(49.5F, -21F, -6F);

		slideModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[62].setRotationPoint(46.5F, -20.5F, -6F);

		slideModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		slideModel[63].setRotationPoint(46.5F, -21F, -6F);

		slideModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox0
		slideModel[64].setRotationPoint(47F, -20.5F, -6F);

		slideModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import ImportBox0
		slideModel[65].setRotationPoint(47F, -21F, -6F);

		slideModel[66].addShapeBox(0F, 0F, 0F, 57, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[66].setRotationPoint(-3.5F, -25.25F, -5.5F);

		slideModel[67].addShapeBox(0F, 0F, 0F, 68, 1, 9, 0F,-0.5F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[67].setRotationPoint(-15.5F, -27.25F, -4.5F);

		slideModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 2
		slideModel[68].setRotationPoint(3F, -23.5F, 5.5F);

		slideModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.5F, 0F, 0F); // Box 3
		slideModel[69].setRotationPoint(3.5F, -22.5F, 5.5F);

		slideModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		slideModel[70].setRotationPoint(3F, -20.5F, 5.5F);

		slideModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.95F, -0.5F, -0.5F, -0.5F); // Box 5
		slideModel[71].setRotationPoint(3.5F, -20F, 5.5F);

		slideModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.95F, -0.5F, -0.5F, 0F); // Box 6
		slideModel[72].setRotationPoint(3.5F, -20.5F, 5.5F);

		slideModel[73].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[73].setRotationPoint(51.25F, -24.25F, -2.5F);

		slideModel[74].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[74].setRotationPoint(51.25F, -20.25F, -2.5F);

		slideModel[75].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[75].setRotationPoint(51.25F, -23.25F, -2.5F);

		slideModel[76].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[76].setRotationPoint(51.25F, -23.25F, 1.5F);

		slideModel[77].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Import ImportBox0
		slideModel[77].setRotationPoint(56.25F, -24.75F, -3F);

		slideModel[78].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox0
		slideModel[78].setRotationPoint(56.25F, -24.75F, 2F);

		slideModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Import ImportBox0
		slideModel[79].setRotationPoint(56.25F, -24.75F, -2F);

		slideModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		slideModel[80].setRotationPoint(56.25F, -19.75F, -2F);

		slideModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Import ImportBox0
		slideModel[81].setRotationPoint(56.25F, -19.5F, -3F);

		slideModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import ImportBox0
		slideModel[82].setRotationPoint(56.25F, -19.5F, 2F);

		slideModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import ImportBox0
		slideModel[83].setRotationPoint(56.25F, -25F, -3F);

		slideModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		slideModel[84].setRotationPoint(56.25F, -25F, 2F);

		slideModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox0
		slideModel[85].setRotationPoint(-16.5F, -21.25F, -3F);

		slideModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.75F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.75F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox0
		slideModel[86].setRotationPoint(-16.5F, -25.25F, -3F);

		slideModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox0
		slideModel[87].setRotationPoint(-16.5F, -23.25F, -3F);

		slideModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Import ImportBox0
		slideModel[88].setRotationPoint(-16.5F, -23.5F, -0.5F);

		slideModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Import ImportBox0
		slideModel[89].setRotationPoint(-16.5F, -23.5F, -0.5F);

		slideModel[90].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 342
		slideModel[90].setRotationPoint(45F, -24.5F, -6F);

		slideModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,-0.5F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 343
		slideModel[91].setRotationPoint(44.5F, -24F, -6F);

		slideModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 344
		slideModel[92].setRotationPoint(45F, -24F, -6F);

		slideModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 345
		slideModel[93].setRotationPoint(47F, -24F, -6F);

		slideModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 346
		slideModel[94].setRotationPoint(47F, -23.5F, -6F);

		slideModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 347
		slideModel[95].setRotationPoint(46.5F, -23.5F, -6F);

		slideModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 348
		slideModel[96].setRotationPoint(46.5F, -24F, -6F);

		slideModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 349
		slideModel[97].setRotationPoint(47.5F, -24F, -6F);

		slideModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 350
		slideModel[98].setRotationPoint(49F, -24F, -6F);

		slideModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 351
		slideModel[99].setRotationPoint(49F, -23.5F, -6F);

		slideModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 352
		slideModel[100].setRotationPoint(49.5F, -23.5F, -6F);

		slideModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 353
		slideModel[101].setRotationPoint(49.5F, -24F, -6F);

		slideModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 354
		slideModel[102].setRotationPoint(50F, -24F, -6F);

		slideModel[103].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,-1F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F); // Box 355
		slideModel[103].setRotationPoint(50.5F, -24F, -6F);

		slideModel[104].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 356
		slideModel[104].setRotationPoint(45F, -22.5F, -6F);

		slideModel[105].addShapeBox(0F, 0F, 0F, 14, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		slideModel[105].setRotationPoint(39.5F, -25.25F, -3.5F);

		slideModel[106].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 358
		slideModel[106].setRotationPoint(38.5F, -25.25F, -3.5F);

		slideModel[107].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 359
		slideModel[107].setRotationPoint(27.5F, -25.25F, -3.5F);

		slideModel[108].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 360
		slideModel[108].setRotationPoint(27.5F, -25.25F, -3.5F);

		slideModel[109].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		slideModel[109].setRotationPoint(27.5F, -19.25F, -3.5F);
	}

	private void initswitchModel_1()
	{
		switchModel[0] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import ImportBox0
		switchModel[1] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import ImportBox0
		switchModel[2] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import ImportBox0
		switchModel[3] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import ImportBox0
		switchModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox0
		switchModel[5] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import ImportBox0

		switchModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		switchModel[0].setRotationPoint(17.75F, -23.5F, 4F);

		switchModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		switchModel[1].setRotationPoint(17.75F, -24.5F, 4F);

		switchModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		switchModel[2].setRotationPoint(17.75F, -25.5F, 4F);

		switchModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Import ImportBox0
		switchModel[3].setRotationPoint(18.75F, -22.5F, 4.5F);

		switchModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		switchModel[4].setRotationPoint(18.75F, -20.5F, 4.5F);

		switchModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import ImportBox0
		switchModel[5].setRotationPoint(18.75F, -23.5F, 5F);
	}

	private void inittriggerModel_1()
	{
		triggerModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		triggerModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import ImportBox0
		triggerModel[2] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import ImportBox0
		triggerModel[3] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import ImportBox0
		triggerModel[4] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import ImportBox0
		triggerModel[5] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import ImportBox0
		triggerModel[6] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import ImportBox0
		triggerModel[7] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Import ImportBox0
		triggerModel[8] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import ImportBox0
		triggerModel[9] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import ImportBox0
		triggerModel[10] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import ImportBox0
		triggerModel[11] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import ImportBox0
		triggerModel[12] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import ImportBox0
		triggerModel[13] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Import ImportBox0
		triggerModel[14] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Import ImportBox0
		triggerModel[15] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Import ImportBox0
		triggerModel[16] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import ImportBox0

		triggerModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Import ImportBox0
		triggerModel[0].setRotationPoint(5F, -15.25F, -1.5F);

		triggerModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.75F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportBox0
		triggerModel[1].setRotationPoint(5F, -16.25F, -1.5F);

		triggerModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,2F, -0.25F, 0.5F, 1.5F, -0.25F, 0.5F, 1.5F, -0.25F, 0.5F, 2F, -0.25F, 0.5F, 0.75F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Import ImportBox0
		triggerModel[2].setRotationPoint(5F, -17.25F, -1.5F);

		triggerModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		triggerModel[3].setRotationPoint(5F, -11.75F, -2F);

		triggerModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		triggerModel[4].setRotationPoint(5F, -10.25F, -2F);

		triggerModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		triggerModel[5].setRotationPoint(5F, -9.25F, -2F);

		triggerModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import ImportBox0
		triggerModel[6].setRotationPoint(4F, -10.25F, -2F);

		triggerModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		triggerModel[7].setRotationPoint(3F, -10.25F, -2F);

		triggerModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox0
		triggerModel[8].setRotationPoint(1F, -10.75F, -2F);

		triggerModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		triggerModel[9].setRotationPoint(-0.5F, -11.75F, -2F);

		triggerModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		triggerModel[10].setRotationPoint(-0.5F, -13.75F, -2F);

		triggerModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.05F, -0.75F, 0F, -0.75F, -0.99F, 0F, -0.75F, -0.99F, 0F, 0.05F, -0.75F, 0F); // Import ImportBox0
		triggerModel[11].setRotationPoint(-0.05F, -12.75F, -2F);

		triggerModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F); // Import ImportBox0
		triggerModel[12].setRotationPoint(1F, -12.75F, -2F);

		triggerModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.75F, 0F, -0.75F, -0.99F, 0F, -0.75F, -0.99F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		triggerModel[13].setRotationPoint(-0.1F, -12.75F, -2F);

		triggerModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.99F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.99F, 0F); // Import ImportBox0
		triggerModel[14].setRotationPoint(0F, -12.75F, -2F);

		triggerModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.75F, -0.99F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.99F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Import ImportBox0
		triggerModel[15].setRotationPoint(0F, -12.75F, -2F);

		triggerModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		triggerModel[16].setRotationPoint(-0.6F, -12.75F, -2F);
	}
}