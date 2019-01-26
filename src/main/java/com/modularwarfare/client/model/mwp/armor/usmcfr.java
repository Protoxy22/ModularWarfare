//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.modularwarfare.client.model.mwp.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class usmcfr extends ModelArmor //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public usmcfr() //Same as Filename
	{
		headModel = new ModelRendererTurbo[19];
		bodyModel = new ModelRendererTurbo[46];
		leftArmModel = new ModelRendererTurbo[4];
		rightArmModel = new ModelRendererTurbo[4];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[8];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 116
		headModel[1] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 117
		headModel[2] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 118
		headModel[3] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 119
		headModel[4] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 120
		headModel[5] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 121
		headModel[6] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 122
		headModel[7] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 123
		headModel[8] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 3
		headModel[9] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 111
		headModel[10] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 95
		headModel[11] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 104
		headModel[12] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 105
		headModel[13] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 106
		headModel[14] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 107
		headModel[15] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 108
		headModel[16] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 109
		headModel[17] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 110
		headModel[18] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 111

		headModel[0].addShapeBox(2F, -2F, -5F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 116
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(2.2F, -2F, -5F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 117
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -4.4F, 3.75F, 9, 1, 1, 0F,-0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F); // Box 118
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(3.6F, -4.4F, -0.85F, 1, 1, 5, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 119
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(3.6F, -4F, -1.45F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F); // Box 120
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(3.6F, -3F, -4.85F, 1, 2, 4, 0F,-0.4F, -1.4F, -0.45F, -0.4F, -1.4F, -0.45F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -1.5F, 0F, -0.4F, -1.5F, 0F); // Box 121
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.6F, -4.4F, -0.85F, 1, 1, 5, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 122
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.6F, -4F, -1.45F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F); // Box 123
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -8F, -4F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F); // Box 3
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F,-1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-6F, -5F, -4F, 2, 1, 8, 0F,0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 95
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -6.5F, -4F, 8, 2, 8, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F); // Box 104
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(4F, -5F, -4F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 105
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -5F, -6F, 8, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 106
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -5F, 4F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(4F, -5F, -6F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, -2F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 108
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-6F, -5F, -6F, 2, 1, 2, 0F,0F, -0.75F, -2F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 109
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-6F, -5F, 4F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -2F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 110
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(4F, -5F, 4F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, -2F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 111
		headModel[18].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 62
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 64
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 3
		bodyModel[7] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 5
		bodyModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		bodyModel[9] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 41
		bodyModel[12] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 1
		bodyModel[13] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 11
		bodyModel[16] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 12
		bodyModel[17] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 13
		bodyModel[18] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 14
		bodyModel[19] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 15
		bodyModel[20] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 16
		bodyModel[21] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 17
		bodyModel[22] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 1
		bodyModel[23] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 10
		bodyModel[24] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 11
		bodyModel[25] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 12
		bodyModel[26] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 14
		bodyModel[27] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 15
		bodyModel[28] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 16
		bodyModel[29] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 17
		bodyModel[30] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 18
		bodyModel[31] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 19
		bodyModel[32] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 20
		bodyModel[33] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 21
		bodyModel[34] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 22
		bodyModel[35] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 33
		bodyModel[36] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 1
		bodyModel[37] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 11
		bodyModel[38] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 12
		bodyModel[39] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 34
		bodyModel[40] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 96
		bodyModel[41] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 97
		bodyModel[42] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 98
		bodyModel[43] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 99
		bodyModel[44] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 102
		bodyModel[45] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 103

		bodyModel[0].addShapeBox(-4F, 7F, -2F, 8, 4, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 62
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 2.8F, -2F, 8, 4, 4, 0F,-0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 64
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, -0.2F, -2F, 4, 3, 4, 0F,0F, 0F, 0.3F, 0F, -0.7F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F); // Box 0
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, -0.2F, -2F, 4, 3, 4, 0F,0F, -0.7F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 1
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.5F, 1F, -2.6F, 7, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Box 0
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.5F, 1.1F, -2.7F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 1
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3.5F, 2.7F, -2.7F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 3
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3.5F, 4.3F, -2.7F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 5
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.5F, 5.9F, -2.7F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 7
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.5F, 7.5F, -2.7F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 9
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3.5F, 9.1F, -2.7F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 10
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(1.2F, 6F, -3.4F, 2, 4, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 41
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1F, 6F, -3.4F, 2, 4, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 1
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.2F, 6F, -3.4F, 2, 4, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 2
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(1.9F, 2F, -3F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 0
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.5F, 1F, 1.5F, 7, 9, 1, 0F,0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.5F, 4.3F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 12
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.5F, 2.7F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 13
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3.5F, 1.1F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 14
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-3.5F, 5.9F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 15
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-3.5F, 7.5F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 16
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-3.5F, 9.1F, 1.6F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 17
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0.7F, 2F, -3F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 1
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-3.2F, 5.9F, -3.6F, 2, 2, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F); // Box 10
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-1F, 5.9F, -3.6F, 2, 2, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F); // Box 11
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(1.2F, 5.9F, -3.6F, 2, 2, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F, 0.05F, -0.5F, 0.3F); // Box 12
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(0.7F, 1.9F, -3.1F, 1, 1, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F); // Box 14
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(1.9F, 1.9F, -3.1F, 1, 1, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F); // Box 15
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-2F, 1F, 2.3F, 4, 9, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 16
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-1.5F, 7.5F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 17
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-1.5F, 5.9F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 18
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-1.5F, 4.3F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 19
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-1.5F, 2.7F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 20
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-1.5F, 1.25F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 21
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-1.5F, 8.95F, 2.35F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 22
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 33
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 1
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-0.5F, -0.1F, -2.15F, 2, 2, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-1.5F, -0.1F, -2.12F, 2, 2, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 12
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,-1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-1.7F, 2F, -3F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 96
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-1.7F, 1.9F, -3.1F, 1, 1, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F); // Box 97
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-0.5F, 2F, -3F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 98
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-0.5F, 1.9F, -3.1F, 1, 1, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F); // Box 99
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-2.9F, 2F, -3F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 102
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-2.9F, 1.9F, -3.1F, 1, 1, 1, 0F,0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F); // Box 103
		bodyModel[45].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 3
		leftArmModel[2] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 59
		leftArmModel[3] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 60

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 3
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(2.05F, 1F, -1.5F, 1, 2, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 59
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.1F, 0F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 60
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 2
		rightArmModel[2] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 61
		rightArmModel[3] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 62

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 6.5F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.1F, 0F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 61
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.05F, 1F, -1.5F, 1, 2, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 62
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 0
		leftLegModel[1] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 24
		leftLegModel[2] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 63
		leftLegModel[3] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 64

		leftLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 8, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7F, -2.4F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(1.1F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 63
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(1.05F, 2F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 64
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 5
		rightLegModel[1] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 25
		rightLegModel[2] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 67
		rightLegModel[3] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 68
		rightLegModel[4] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 116
		rightLegModel[5] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 117
		rightLegModel[6] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 118
		rightLegModel[7] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 122

		rightLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 8, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 7F, -2.4F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.1F, 1F, -1.5F, 1, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 67
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.05F, 2F, -1.5F, 1, 3, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 68
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-1.5F, 2.5F, -2.3F, 3, 2, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 116
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-1.5F, 1.5F, -2.3F, 3, 1, 1, 0F,-0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 117
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-1.5F, 4.5F, -2.3F, 3, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F); // Box 118
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2F, 3F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 122
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);
	}
}