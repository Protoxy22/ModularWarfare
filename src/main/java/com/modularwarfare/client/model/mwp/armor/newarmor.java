//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Armor
// Model Creator: 
// Created on: 09.02.2019 - 13:22:35
// Last changed on: 09.02.2019 - 13:22:35

package com.modularwarfare.client.model.mwp.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class newarmor extends ModelArmor //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public newarmor() //Same as Filename
	{
		headModel = new ModelRendererTurbo[88];
		bodyModel = new ModelRendererTurbo[1];
		leftArmModel = new ModelRendererTurbo[7];
		rightArmModel = new ModelRendererTurbo[7];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[4];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		
		modelScale = 0.25f;
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 2
		headModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 3
		headModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 4
		headModel[4] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 10
		headModel[5] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 11
		headModel[6] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 12
		headModel[7] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 13
		headModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 14
		headModel[9] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 15
		headModel[10] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 16
		headModel[11] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 17
		headModel[12] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 18
		headModel[13] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 19
		headModel[14] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 35
		headModel[15] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 36
		headModel[16] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 37
		headModel[17] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 42
		headModel[18] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 43
		headModel[19] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 44
		headModel[20] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 45
		headModel[21] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 46
		headModel[22] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 45
		headModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46
		headModel[24] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 47
		headModel[25] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 48
		headModel[26] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 49
		headModel[27] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 50
		headModel[28] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 51
		headModel[29] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 52
		headModel[30] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 53
		headModel[31] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 54
		headModel[32] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 55
		headModel[33] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 56
		headModel[34] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 57
		headModel[35] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 58
		headModel[36] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 59
		headModel[37] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 60
		headModel[38] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 61
		headModel[39] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 62
		headModel[40] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 63
		headModel[41] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 73
		headModel[42] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 74
		headModel[43] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 75
		headModel[44] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 76
		headModel[45] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 77
		headModel[46] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 78
		headModel[47] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 79
		headModel[48] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 80
		headModel[49] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 81
		headModel[50] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 82
		headModel[51] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 83
		headModel[52] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 84
		headModel[53] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 85
		headModel[54] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 86
		headModel[55] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 87
		headModel[56] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 88
		headModel[57] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 89
		headModel[58] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 90
		headModel[59] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 91
		headModel[60] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 92
		headModel[61] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 93
		headModel[62] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 94
		headModel[63] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 95
		headModel[64] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 101
		headModel[65] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 102
		headModel[66] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 103
		headModel[67] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 104
		headModel[68] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 105
		headModel[69] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 106
		headModel[70] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 107
		headModel[71] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 108
		headModel[72] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 109
		headModel[73] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 110
		headModel[74] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 111
		headModel[75] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 112
		headModel[76] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 113
		headModel[77] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 114
		headModel[78] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 115
		headModel[79] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 107
		headModel[80] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 108
		headModel[81] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 109
		headModel[82] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 110
		headModel[83] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 111
		headModel[84] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 112
		headModel[85] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 113
		headModel[86] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 114
		headModel[87] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 115

		headModel[0].addShapeBox(-19F, -68F, -16F, 38, 12, 35, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-16F, -72F, -16F, 32, 4, 32, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-19F, -68F, -19F, 38, 12, 3, 0F,-5F, 0F, -2F, -5F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-16F, -72F, -17F, 32, 4, 1, 0F,-6F, 0F, -4F, -6F, 0F, -4F, -4F, 0F, 4F, -4F, 0F, 4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-20F, -68F, -16F, 4, 12, 35, 0F,-3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -5F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F); // Box 10
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-17F, -72F, -16F, 5, 4, 32, 0F,-4F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -6F, 0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F); // Box 11
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(12F, -72F, -16F, 5, 4, 32, 0F,0F, 0F, -4F, -4F, 0F, -6F, -4F, 0F, -6F, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F); // Box 12
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(16F, -68F, -16F, 4, 12, 35, 0F,0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -5F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F); // Box 13
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(19F, -56F, -16F, 2, 8, 36, 0F,0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -3F, 0F, 0F, -1F, -1F, 0F, -6F, 0F, -1F, -8F, 0F, -1F, -5.5F, -1F, 0F, -0.5F); // Box 14
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(16F, -56F, -16F, 4, 8, 36, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 15
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-17F, -56F, 17F, 34, 8, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 16
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-20F, -48F, 17F, 40, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 17
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-21F, -56F, -16F, 2, 8, 36, 0F,-1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, 0F, -1F, -8F, -1F, 0F, -6F, -1F, 0F, -0.5F, 0F, -1F, -5.5F); // Box 18
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-20F, -56F, -16F, 4, 8, 36, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -62F, -20F, 8, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, 1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 35
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -68F, -19F, 8, 6, 1, 0F,-3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-2F, -65F, -20F, 4, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(20F, -55F, -8F, 1, 4, 19, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(17.25F, -66F, -4F, 2, 7, 11, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 43
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-3F, -73F, -8F, 6, 1, 16, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-19.25F, -66F, -4F, 2, 7, 11, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 45
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-21F, -55F, -8F, 1, 4, 19, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(108F, -51.5F, -17.5F, 1, 4, 35, 0F,-0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 45
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(109F, -54F, -18F, 2, 9, 2, 0F,-0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F); // Box 46
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(109F, -51.5F, -17.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(111F, -55F, -18F, 2, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 48
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(111F, -47F, -18F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(113F, -46F, -18F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(120F, -49F, -18F, 3, 5, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 51
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(123F, -49F, -18F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(127F, -49F, -18F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 53
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(130F, -46F, -18F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(137F, -47F, -18F, 2, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 55
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(139F, -54F, -18F, 2, 9, 2, 0F,0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F); // Box 56
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(137F, -55F, -18F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 57
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(113F, -55F, -18F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(111F, -53F, -18F, 28, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(127F, -49F, -18F, 12, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 60
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(111F, -49F, -18F, 12, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 61
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(140F, -51.5F, -17.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(141F, -51.5F, -17.5F, 1, 4, 35, 0F,0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 63
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(2F, -53F, -19F, 3, 7, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 73
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-2F, -53F, -19F, 4, 4, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(5F, -53F, -19F, 7, 7, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(12F, -53F, -19F, 2, 7, 1, 0F,0F, -0.75F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 76
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(12F, -55F, -18F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 77
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(14F, -54F, -18F, 2, 9, 2, 0F,0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F); // Box 78
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(5F, -46F, -18F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(2F, -49F, -18F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 80
		headModel[48].setRotationPoint(0F, 0F, 0F);

		headModel[49].addShapeBox(-2F, -49F, -18F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		headModel[49].setRotationPoint(0F, 0F, 0F);

		headModel[50].addShapeBox(12F, -47F, -18F, 2, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 82
		headModel[50].setRotationPoint(0F, 0F, 0F);

		headModel[51].addShapeBox(-5F, -49F, -18F, 3, 5, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 83
		headModel[51].setRotationPoint(0F, 0F, 0F);

		headModel[52].addShapeBox(-12F, -46F, -18F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		headModel[52].setRotationPoint(0F, 0F, 0F);

		headModel[53].addShapeBox(-5F, -53F, -19F, 3, 7, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -3.75F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 85
		headModel[53].setRotationPoint(0F, 0F, 0F);

		headModel[54].addShapeBox(-12F, -55F, -18F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		headModel[54].setRotationPoint(0F, 0F, 0F);

		headModel[55].addShapeBox(-12F, -53F, -19F, 7, 7, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		headModel[55].setRotationPoint(0F, 0F, 0F);

		headModel[56].addShapeBox(-14F, -53F, -19F, 2, 7, 1, 0F,-0.5F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 88
		headModel[56].setRotationPoint(0F, 0F, 0F);

		headModel[57].addShapeBox(-14F, -55F, -18F, 2, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 89
		headModel[57].setRotationPoint(0F, 0F, 0F);

		headModel[58].addShapeBox(-16F, -54F, -18F, 2, 9, 2, 0F,-0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F); // Box 90
		headModel[58].setRotationPoint(0F, 0F, 0F);

		headModel[59].addShapeBox(-14F, -47F, -18F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 91
		headModel[59].setRotationPoint(0F, 0F, 0F);

		headModel[60].addShapeBox(-16F, -51.5F, -17.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		headModel[60].setRotationPoint(0F, 0F, 0F);

		headModel[61].addShapeBox(-17F, -51.5F, -17.5F, 1, 4, 35, 0F,-0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 93
		headModel[61].setRotationPoint(0F, 0F, 0F);

		headModel[62].addShapeBox(16F, -51.5F, -17.5F, 1, 4, 35, 0F,0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 94
		headModel[62].setRotationPoint(0F, 0F, 0F);

		headModel[63].addShapeBox(15F, -51.5F, -17.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		headModel[63].setRotationPoint(0F, 0F, 0F);

		headModel[64].addShapeBox(111F, -40F, -17F, 28, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		headModel[64].setRotationPoint(0F, 0F, 0F);

		headModel[65].addShapeBox(108F, -40.5F, -17.5F, 1, 3, 35, 0F,-0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 102
		headModel[65].setRotationPoint(0F, 0F, 0F);

		headModel[66].addShapeBox(109F, -40.5F, -17.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		headModel[66].setRotationPoint(0F, 0F, 0F);

		headModel[67].addShapeBox(109F, -42F, -18F, 2, 11, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 104
		headModel[67].setRotationPoint(0F, 0F, 0F);

		headModel[68].addShapeBox(111F, -42F, -18F, 28, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		headModel[68].setRotationPoint(0F, 0F, 0F);

		headModel[69].addShapeBox(123F, -40F, -18F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		headModel[69].setRotationPoint(0F, 0F, 0F);

		headModel[70].addShapeBox(111F, -36F, -17F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 107
		headModel[70].setRotationPoint(0F, 0F, 0F);

		headModel[71].addShapeBox(111F, -33F, -18F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		headModel[71].setRotationPoint(0F, 0F, 0F);

		headModel[72].addShapeBox(121F, -36F, -18F, 2, 5, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 109
		headModel[72].setRotationPoint(0F, 0F, 0F);

		headModel[73].addShapeBox(127F, -36F, -18F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 110
		headModel[73].setRotationPoint(0F, 0F, 0F);

		headModel[74].addShapeBox(129F, -33F, -18F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		headModel[74].setRotationPoint(0F, 0F, 0F);

		headModel[75].addShapeBox(127F, -36F, -17F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 112
		headModel[75].setRotationPoint(0F, 0F, 0F);

		headModel[76].addShapeBox(139F, -42F, -18F, 2, 11, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 113
		headModel[76].setRotationPoint(0F, 0F, 0F);

		headModel[77].addShapeBox(140F, -40.5F, -17.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		headModel[77].setRotationPoint(0F, 0F, 0F);

		headModel[78].addShapeBox(141F, -40.5F, -17.5F, 1, 3, 35, 0F,0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 115
		headModel[78].setRotationPoint(0F, 0F, 0F);

		headModel[79].addShapeBox(16F, -50F, -5F, 2, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		headModel[79].setRotationPoint(0F, 0F, 0F);

		headModel[80].addShapeBox(18F, -48F, -5F, 2, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 108
		headModel[80].setRotationPoint(0F, 0F, 0F);

		headModel[81].addShapeBox(20F, -46F, -4F, 2, 5, 10, 0F,0F, 0F, 0F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, 0F, 0F); // Box 109
		headModel[81].setRotationPoint(0F, 0F, 0F);

		headModel[82].addShapeBox(16F, -41F, -5F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 110
		headModel[82].setRotationPoint(0F, 0F, 0F);

		headModel[83].addShapeBox(18F, -41F, -5F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2F); // Box 111
		headModel[83].setRotationPoint(0F, 0F, 0F);

		headModel[84].addShapeBox(17F, -44F, -6F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		headModel[84].setRotationPoint(0F, 0F, 0F);

		headModel[85].addShapeBox(17.5F, -43.5F, -17F, 1, 1, 11, 0F,1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		headModel[85].setRotationPoint(0F, 0F, 0F);

		headModel[86].addShapeBox(10.5F, -41.5F, -18F, 7, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		headModel[86].setRotationPoint(0F, 0F, 0F);

		headModel[87].addShapeBox(8.5F, -42F, -18.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		headModel[87].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 98

		bodyModel[0].addShapeBox(-16F, -36F, -9F, 32, 40, 18, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 98
		bodyModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 133
		leftArmModel[1] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 96
		leftArmModel[2] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 97
		leftArmModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 99
		leftArmModel[4] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 100
		leftArmModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 101
		leftArmModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 102

		leftArmModel[0].addShapeBox(10F, -1F, -9F, 18, 12, 18, 0F,-0.99F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.99F, -0.75F, -0.75F, -0.99F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.99F, -0.75F, -0.75F); // Box 133
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(10F, -39F, -9F, 18, 15, 18, 0F,-0.99F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.99F, -0.75F, -0.75F, -0.99F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.99F, -0.25F, -0.75F); // Box 96
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(10F, -25F, -9F, 18, 10, 18, 0F,-0.99F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.99F, -0.75F, -0.5F, -0.99F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.99F, 0F, -0.5F); // Box 97
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(27F, -37F, -3F, 1, 4, 6, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 99
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(27F, -32.5F, -5F, 1, 8, 10, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 100
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(27F, -32.5F, -5.5F, 1, 3, 11, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 101
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(27F, -29.5F, -1F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 102
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 116
		rightArmModel[1] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 123
		rightArmModel[2] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 95
		rightArmModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 103
		rightArmModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 104
		rightArmModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 105
		rightArmModel[6] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 106

		rightArmModel[0].addShapeBox(-28F, -39F, -9F, 18, 15, 18, 0F,-0.75F, -0.75F, -0.75F, -0.99F, -0.75F, -0.75F, -0.99F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.25F, -0.75F, -0.99F, -0.25F, -0.75F, -0.99F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F); // Box 116
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-28F, -1F, -9F, 18, 12, 18, 0F,-0.75F, -0.75F, -0.75F, -0.99F, -0.75F, -0.75F, -0.99F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.99F, -0.75F, -0.75F, -0.99F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F); // Box 123
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-28F, -25F, -9F, 18, 10, 18, 0F,-0.5F, -0.75F, -0.5F, -0.99F, -0.75F, -0.5F, -0.99F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.99F, 0F, -0.5F, -0.99F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 95
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-28F, -37F, -3F, 1, 4, 6, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 103
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-28F, -32.5F, -5.5F, 1, 3, 11, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 104
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-28F, -29.5F, -1F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 105
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-28F, -32.5F, -5F, 1, 8, 10, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 106
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 129
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 130
		leftLegModel[2] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 131
		leftLegModel[3] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 117

		leftLegModel[0].addShapeBox(-3F, 38F, -19F, 18, 11, 12, 0F,-2.99F, -3.75F, -0.75F, -2.75F, -3.75F, -0.75F, -0.75F, -0.75F, -1.25F, -0.99F, -0.75F, -1.25F, -2.99F, -0.75F, -0.75F, -2.75F, -0.75F, -0.75F, -0.75F, -0.75F, -1.25F, -0.99F, -0.75F, -1.25F); // Box 129
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-3F, 32F, -9F, 18, 17, 18, 0F,-0.99F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.99F, -0.25F, -0.5F, -0.99F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.99F, -0.75F, -0.5F); // Box 130
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-3F, -9F, -9F, 18, 42, 18, 0F,-0.99F, -0.75F, -0.875F, -0.875F, -0.75F, -0.875F, -0.875F, -0.75F, -0.875F, -0.99F, -0.75F, -0.875F, -0.99F, -0.75F, -0.875F, -0.875F, -0.75F, -0.875F, -0.875F, -0.75F, -0.875F, -0.99F, -0.75F, -0.875F); // Box 131
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-3F, 29F, -9F, 18, 4, 2, 0F,-1.99F, -0.25F, -0.625F, -1.5F, -0.25F, -0.625F, -1.5F, -0.25F, -0.5F, -1.99F, -0.25F, -0.5F, -0.99F, -0.75F, -0.625F, -0.5F, -0.75F, -0.625F, -0.5F, -0.75F, -0.5F, -0.99F, -0.75F, -0.5F); // Box 117
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 124
		rightLegModel[1] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 125
		rightLegModel[2] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 126
		rightLegModel[3] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 116

		rightLegModel[0].addShapeBox(-15F, -9F, -9F, 18, 42, 18, 0F,-0.875F, -0.75F, -0.875F, -0.99F, -0.75F, -0.875F, -0.99F, -0.75F, -0.875F, -0.875F, -0.75F, -0.875F, -0.875F, -0.75F, -0.875F, -0.99F, -0.75F, -0.875F, -0.99F, -0.75F, -0.875F, -0.875F, -0.75F, -0.875F); // Box 124
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-15F, 32F, -9F, 18, 17, 18, 0F,-0.5F, -0.25F, -0.5F, -0.99F, -0.25F, -0.5F, -0.99F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, -0.5F, -0.99F, -0.75F, -0.5F, -0.99F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 125
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-15F, 38F, -19F, 18, 11, 12, 0F,-2.75F, -3.75F, -0.75F, -2.99F, -3.75F, -0.75F, -0.99F, -0.75F, -1.25F, -0.75F, -0.75F, -1.25F, -2.75F, -0.75F, -0.75F, -2.99F, -0.75F, -0.75F, -0.99F, -0.75F, -1.25F, -0.75F, -0.75F, -1.25F); // Box 126
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-15F, 29F, -9F, 18, 4, 2, 0F,-1.5F, -0.25F, -0.625F, -1.99F, -0.25F, -0.625F, -1.99F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, -0.5F, -0.75F, -0.625F, -0.99F, -0.75F, -0.625F, -0.99F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 116
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}