//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.01.2019 - 22:31:43
// Last changed on: 25.01.2019 - 22:31:43

package com.modularwarfare.client.model.mwp.ammo; //Path where the model is located

import com.modularwarfare.client.model.ModelAmmo;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class ump45triplemag extends ModelAmmo //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ump45triplemag() //Same as Filename
	{
		ammoModel = new ModelRendererTurbo[81];

		initammoModel_1();
		modelScale = 0.12F;
		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		ammoModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox0
		ammoModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportBox0
		ammoModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import ImportBox0
		ammoModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import ImportBox0
		ammoModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import ImportBox0
		ammoModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportBox0
		ammoModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportBox0
		ammoModel[8] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import ImportBox0
		ammoModel[9] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import ImportBox0
		ammoModel[10] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import ImportBox0
		ammoModel[11] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import ImportBox0
		ammoModel[12] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import ImportBox0
		ammoModel[13] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import ImportBox0
		ammoModel[14] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import ImportBox0
		ammoModel[15] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import ImportBox0
		ammoModel[16] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import ImportBox0
		ammoModel[17] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import ImportBox0
		ammoModel[18] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Import ImportBox0
		ammoModel[19] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import ImportBox0
		ammoModel[20] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import ImportBox0
		ammoModel[21] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Import ImportBox0
		ammoModel[22] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Import ImportBox0
		ammoModel[23] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Import ImportBox0
		ammoModel[24] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import ImportBox0
		ammoModel[25] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 25
		ammoModel[26] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 26
		ammoModel[27] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 27
		ammoModel[28] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 28
		ammoModel[29] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 29
		ammoModel[30] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 30
		ammoModel[31] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 31
		ammoModel[32] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 32
		ammoModel[33] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 33
		ammoModel[34] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 34
		ammoModel[35] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 35
		ammoModel[36] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 36
		ammoModel[37] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 37
		ammoModel[38] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 38
		ammoModel[39] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 39
		ammoModel[40] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 40
		ammoModel[41] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 41
		ammoModel[42] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 42
		ammoModel[43] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 43
		ammoModel[44] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 44
		ammoModel[45] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 45
		ammoModel[46] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 46
		ammoModel[47] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 47
		ammoModel[48] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 48
		ammoModel[49] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 49
		ammoModel[50] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 50
		ammoModel[51] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 51
		ammoModel[52] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 52
		ammoModel[53] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 53
		ammoModel[54] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 54
		ammoModel[55] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 55
		ammoModel[56] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 56
		ammoModel[57] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 57
		ammoModel[58] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 58
		ammoModel[59] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 59
		ammoModel[60] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 60
		ammoModel[61] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 61
		ammoModel[62] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 62
		ammoModel[63] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 63
		ammoModel[64] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 64
		ammoModel[65] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 65
		ammoModel[66] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 66
		ammoModel[67] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 67
		ammoModel[68] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 68
		ammoModel[69] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Box 69
		ammoModel[70] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Box 70
		ammoModel[71] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 71
		ammoModel[72] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 72
		ammoModel[73] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 73
		ammoModel[74] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 74
		ammoModel[75] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 75
		ammoModel[76] = new ModelRendererTurbo(this, 137, 217, textureX, textureY); // Box 76
		ammoModel[77] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Box 77
		ammoModel[78] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 78
		ammoModel[79] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 79
		ammoModel[80] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 80

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 47, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -9.75F, 0F, -1F, 9.75F, 0F, 0F, 9.75F, 0F, 0F, -9.75F, 0F, -1F); // Import ImportBox0
		ammoModel[0].setRotationPoint(34F, -9.25F, -5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 47, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -9.5F, 0F, 0F, 9.5F, 0F, -1F, 9.5F, 0F, -1F, -9.5F, 0F, 0F); // Import ImportBox0
		ammoModel[1].setRotationPoint(44F, -9.25F, -5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 4, 47, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, 0F, 0F, 9.5F, 0F, 0F, 9.5F, 0F, 0F, -9.5F, 0F, 0F); // Import ImportBox0
		ammoModel[2].setRotationPoint(40F, -9.25F, -5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, -0.25F, -1F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, -0.25F, -1F, 1F); // Import ImportBox0
		ammoModel[3].setRotationPoint(45.5F, 42.75F, -5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,-0.25F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, -0.25F, 0.5F, 0F, -0.35F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.35F, -1F, 0F); // Import ImportBox0
		ammoModel[4].setRotationPoint(45.5F, 44.25F, -6F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.5F, -1F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.75F, -0.5F, -1F); // Import ImportBox0
		ammoModel[5].setRotationPoint(43.75F, 37.75F, -5F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.75F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, -1F, -1F, -0.5F, 0F, 1F, -0.5F, 1F, 1F, -0.5F, 1F, -1F, -0.5F, 0F); // Import ImportBox0
		ammoModel[6].setRotationPoint(43.75F, 42.25F, -5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -1.1F, -0.5F, -1F, 1.1F, -0.5F, 0F, 1.1F, -0.5F, 0F, -1.1F, -0.5F, -1F); // Import ImportBox0
		ammoModel[7].setRotationPoint(43.75F, 43.75F, -6F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0.25F, 0F, 0F, -1.25F, -0.5F, 0F, 1.25F, -0.5F, -1F, 1.25F, -0.5F, -1F, -1.25F, -0.5F, 0F); // Import ImportBox0
		ammoModel[8].setRotationPoint(53.75F, 37.75F, -5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.5F, 0F, -0.5F, 0.65F, 0F, -0.5F, 0.65F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, -1.15F, 0F, -0.5F, -1.15F, 0F, 0F, -1F, 0F); // Import ImportBox0
		ammoModel[9].setRotationPoint(54.5F, 42.25F, -6F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, -0.65F, 1F, 0.75F, -0.95F, 0F, 0.75F, -0.95F, 0F, -0.75F, -0.65F, 1F); // Import ImportBox0
		ammoModel[10].setRotationPoint(54.25F, 40.25F, -5F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.65F, 0F, 0F, 0.95F, -1F, 0F, 0.95F, -1F, 0F, 0.65F, 0F, 0F, -1.15F, 0F, 0F, -1.6F, -1F, 0F, -1.6F, -1F, 0F, -1.15F, 0F); // Import ImportBox0
		ammoModel[11].setRotationPoint(55F, 42.25F, -6F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 1F, 0.25F, -0.65F, 1F, 0.25F, -0.65F, 1F, -0.75F, -0.5F, 1F); // Import ImportBox0
		ammoModel[12].setRotationPoint(53.75F, 40.25F, -5F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.75F, 1.5F, 0F); // Import ImportBox0
		ammoModel[13].setRotationPoint(44.75F, 37.75F, -5F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import ImportBox0
		ammoModel[14].setRotationPoint(53.75F, 37.75F, -5F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 3, 15, 10, 0F,-0.65F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.65F, 0F, 0F, -3.75F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.75F, 0F, 0F); // Import ImportBox0
		ammoModel[15].setRotationPoint(44F, 22.75F, -5F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, 0F, 0F); // Import ImportBox0
		ammoModel[16].setRotationPoint(44.5F, 21.75F, -5F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.4F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		ammoModel[17].setRotationPoint(46F, 21.75F, -5F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 2, 47, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.75F, 0F, 0F, 9.75F, 0F, 0F, 9.75F, 0F, 0F, -9.75F, 0F, 0F); // Import ImportBox0
		ammoModel[18].setRotationPoint(38F, -9.25F, -4.5F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 3, 47, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.75F, 0F, 0F, 9.75F, 0F, 0F, 9.75F, 0F, 0F, -9.75F, 0F, 0F); // Import ImportBox0
		ammoModel[19].setRotationPoint(35F, -9.25F, -5F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox0
		ammoModel[20].setRotationPoint(31F, -21.25F, -5F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,-1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox0
		ammoModel[21].setRotationPoint(36F, -21.25F, -5F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,-1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox0
		ammoModel[22].setRotationPoint(34F, -21.25F, -4.5F);

		ammoModel[23].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-1.75F, 0F, 0F, 1.75F, 0F, -1F, 1.75F, 0F, -1F, -1.75F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 0F); // Import ImportBox0
		ammoModel[23].setRotationPoint(40F, -21.25F, -5F);

		ammoModel[24].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F); // Import ImportBox0
		ammoModel[24].setRotationPoint(30F, -21.25F, -5F);

		ammoModel[25].addShapeBox(0F, 0F, 0F, 1, 47, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -9.75F, 0F, -1F, 9.75F, 0F, 0F, 9.75F, 0F, 0F, -9.75F, 0F, -1F); // Box 25
		ammoModel[25].setRotationPoint(35F, -2.25F, 7F);

		ammoModel[26].addShapeBox(0F, 0F, 0F, 1, 47, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -9.5F, 0F, 0F, 9.5F, 0F, -1F, 9.5F, 0F, -1F, -9.5F, 0F, 0F); // Box 26
		ammoModel[26].setRotationPoint(45F, -2.25F, 7F);

		ammoModel[27].addShapeBox(0F, 0F, 0F, 4, 47, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, 0F, 0F, 9.5F, 0F, 0F, 9.5F, 0F, 0F, -9.5F, 0F, 0F); // Box 27
		ammoModel[27].setRotationPoint(41F, -2.25F, 7F);

		ammoModel[28].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, -0.25F, -1F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, -0.25F, -1F, 1F); // Box 28
		ammoModel[28].setRotationPoint(46.5F, 49.75F, 7F);

		ammoModel[29].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,-0.25F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, -0.25F, 0.5F, 0F, -0.35F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.35F, -1F, 0F); // Box 29
		ammoModel[29].setRotationPoint(46.5F, 51.25F, 6F);

		ammoModel[30].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.5F, -1F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.75F, -0.5F, -1F); // Box 30
		ammoModel[30].setRotationPoint(44.75F, 44.75F, 7F);

		ammoModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.75F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, -1F, -1F, -0.5F, 0F, 1F, -0.5F, 1F, 1F, -0.5F, 1F, -1F, -0.5F, 0F); // Box 31
		ammoModel[31].setRotationPoint(44.75F, 49.25F, 7F);

		ammoModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -1.1F, -0.5F, -1F, 1.1F, -0.5F, 0F, 1.1F, -0.5F, 0F, -1.1F, -0.5F, -1F); // Box 32
		ammoModel[32].setRotationPoint(44.75F, 50.75F, 6F);

		ammoModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0.25F, 0F, 0F, -1.25F, -0.5F, 0F, 1.25F, -0.5F, -1F, 1.25F, -0.5F, -1F, -1.25F, -0.5F, 0F); // Box 33
		ammoModel[33].setRotationPoint(54.75F, 44.75F, 7F);

		ammoModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.5F, 0F, -0.5F, 0.65F, 0F, -0.5F, 0.65F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, -1.15F, 0F, -0.5F, -1.15F, 0F, 0F, -1F, 0F); // Box 34
		ammoModel[34].setRotationPoint(55.5F, 49.25F, 6F);

		ammoModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, -0.65F, 1F, 0.75F, -0.95F, 0F, 0.75F, -0.95F, 0F, -0.75F, -0.65F, 1F); // Box 35
		ammoModel[35].setRotationPoint(55.25F, 47.25F, 7F);

		ammoModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.65F, 0F, 0F, 0.95F, -1F, 0F, 0.95F, -1F, 0F, 0.65F, 0F, 0F, -1.15F, 0F, 0F, -1.6F, -1F, 0F, -1.6F, -1F, 0F, -1.15F, 0F); // Box 36
		ammoModel[36].setRotationPoint(56F, 49.25F, 6F);

		ammoModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 1F, 0.25F, -0.65F, 1F, 0.25F, -0.65F, 1F, -0.75F, -0.5F, 1F); // Box 37
		ammoModel[37].setRotationPoint(54.75F, 47.25F, 7F);

		ammoModel[38].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.75F, 1.5F, 0F); // Box 38
		ammoModel[38].setRotationPoint(45.75F, 44.75F, 7F);

		ammoModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 39
		ammoModel[39].setRotationPoint(54.75F, 44.75F, 7F);

		ammoModel[40].addShapeBox(0F, 0F, 0F, 3, 15, 10, 0F,-0.65F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.65F, 0F, 0F, -3.75F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.75F, 0F, 0F); // Box 40
		ammoModel[40].setRotationPoint(45F, 29.75F, 7F);

		ammoModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, 0F, 0F); // Box 41
		ammoModel[41].setRotationPoint(45.5F, 28.75F, 7F);

		ammoModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.4F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 42
		ammoModel[42].setRotationPoint(47F, 28.75F, 7F);

		ammoModel[43].addShapeBox(0F, 0F, 0F, 2, 47, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.75F, 0F, 0F, 9.75F, 0F, 0F, 9.75F, 0F, 0F, -9.75F, 0F, 0F); // Box 43
		ammoModel[43].setRotationPoint(39F, -2.25F, 7.5F);

		ammoModel[44].addShapeBox(0F, 0F, 0F, 3, 47, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.75F, 0F, 0F, 9.75F, 0F, 0F, 9.75F, 0F, 0F, -9.75F, 0F, 0F); // Box 44
		ammoModel[44].setRotationPoint(36F, -2.25F, 7F);

		ammoModel[45].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 45
		ammoModel[45].setRotationPoint(32F, -14.25F, 7F);

		ammoModel[46].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,-1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 46
		ammoModel[46].setRotationPoint(37F, -14.25F, 7F);

		ammoModel[47].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,-1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 47
		ammoModel[47].setRotationPoint(35F, -14.25F, 7.5F);

		ammoModel[48].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-1.75F, 0F, 0F, 1.75F, 0F, -1F, 1.75F, 0F, -1F, -1.75F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 0F); // Box 48
		ammoModel[48].setRotationPoint(41F, -14.25F, 7F);

		ammoModel[49].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F); // Box 49
		ammoModel[49].setRotationPoint(31F, -14.25F, 7F);

		ammoModel[50].addShapeBox(0F, 0F, 0F, 1, 8, 36, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1.6F, 0F, 0F, 1.6F, 0F, -1F, 1.6F, 0F, -1F, -1.6F, 0F, 0F); // Box 50
		ammoModel[50].setRotationPoint(46F, -2.25F, -18F);

		ammoModel[51].addShapeBox(0F, 0F, 0F, 1, 8, 36, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.6F, 0F, -1F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, -1.6F, 0F, -1F); // Box 51
		ammoModel[51].setRotationPoint(34.5F, -2.25F, -18F);

		ammoModel[52].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -1.6F, 0F, 0F); // Box 52
		ammoModel[52].setRotationPoint(35.5F, -2.25F, -18F);

		ammoModel[53].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -1.6F, 0F, 0F); // Box 53
		ammoModel[53].setRotationPoint(35.5F, -2.25F, 17F);

		ammoModel[54].addShapeBox(0F, 0F, 0F, 11, 8, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -1.6F, 0F, 0F); // Box 54
		ammoModel[54].setRotationPoint(35.5F, -2.25F, 5F);

		ammoModel[55].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-1.75F, 0F, 0F, 1.75F, 0F, -1F, 1.75F, 0F, -1F, -1.75F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 0F); // Box 55
		ammoModel[55].setRotationPoint(41F, -14.25F, -17F);

		ammoModel[56].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,-1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 56
		ammoModel[56].setRotationPoint(37F, -14.25F, -17F);

		ammoModel[57].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,-1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 57
		ammoModel[57].setRotationPoint(35F, -14.25F, -16.5F);

		ammoModel[58].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 58
		ammoModel[58].setRotationPoint(32F, -14.25F, -17F);

		ammoModel[59].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F); // Box 59
		ammoModel[59].setRotationPoint(31F, -14.25F, -17F);

		ammoModel[60].addShapeBox(0F, 0F, 0F, 2, 47, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.75F, 0F, 0F, 9.75F, 0F, 0F, 9.75F, 0F, 0F, -9.75F, 0F, 0F); // Box 60
		ammoModel[60].setRotationPoint(39F, -2.25F, -16.5F);

		ammoModel[61].addShapeBox(0F, 0F, 0F, 3, 47, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.75F, 0F, 0F, 9.75F, 0F, 0F, 9.75F, 0F, 0F, -9.75F, 0F, 0F); // Box 61
		ammoModel[61].setRotationPoint(36F, -2.25F, -17F);

		ammoModel[62].addShapeBox(0F, 0F, 0F, 4, 47, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, 0F, 0F, 9.5F, 0F, 0F, 9.5F, 0F, 0F, -9.5F, 0F, 0F); // Box 62
		ammoModel[62].setRotationPoint(41F, -2.25F, -17F);

		ammoModel[63].addShapeBox(0F, 0F, 0F, 1, 47, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -9.5F, 0F, 0F, 9.5F, 0F, -1F, 9.5F, 0F, -1F, -9.5F, 0F, 0F); // Box 63
		ammoModel[63].setRotationPoint(45F, -2.25F, -17F);

		ammoModel[64].addShapeBox(0F, 0F, 0F, 1, 47, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -9.75F, 0F, -1F, 9.75F, 0F, 0F, 9.75F, 0F, 0F, -9.75F, 0F, -1F); // Box 64
		ammoModel[64].setRotationPoint(35F, -2.25F, -17F);

		ammoModel[65].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,-0.25F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, -0.25F, 0.5F, 0F, -0.35F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.35F, -1F, 0F); // Box 65
		ammoModel[65].setRotationPoint(46.5F, 51.25F, -18F);

		ammoModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.65F, 0F, 0F, 0.95F, -1F, 0F, 0.95F, -1F, 0F, 0.65F, 0F, 0F, -1.15F, 0F, 0F, -1.6F, -1F, 0F, -1.6F, -1F, 0F, -1.15F, 0F); // Box 66
		ammoModel[66].setRotationPoint(56F, 49.25F, -18F);

		ammoModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, -0.65F, 1F, 0.75F, -0.95F, 0F, 0.75F, -0.95F, 0F, -0.75F, -0.65F, 1F); // Box 67
		ammoModel[67].setRotationPoint(55.25F, 47.25F, -17F);

		ammoModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0.25F, 0F, 0F, -1.25F, -0.5F, 0F, 1.25F, -0.5F, -1F, 1.25F, -0.5F, -1F, -1.25F, -0.5F, 0F); // Box 68
		ammoModel[68].setRotationPoint(54.75F, 44.75F, -17F);

		ammoModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 69
		ammoModel[69].setRotationPoint(54.75F, 44.75F, -17F);

		ammoModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.5F, 0F, -0.5F, 0.65F, 0F, -0.5F, 0.65F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, -1.15F, 0F, -0.5F, -1.15F, 0F, 0F, -1F, 0F); // Box 70
		ammoModel[70].setRotationPoint(55.5F, 49.25F, -18F);

		ammoModel[71].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, -0.25F, -1F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, -0.25F, -1F, 1F); // Box 71
		ammoModel[71].setRotationPoint(46.5F, 49.75F, -17F);

		ammoModel[72].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.75F, 1.5F, 0F); // Box 72
		ammoModel[72].setRotationPoint(45.75F, 44.75F, -17F);

		ammoModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 1F, 0.25F, -0.65F, 1F, 0.25F, -0.65F, 1F, -0.75F, -0.5F, 1F); // Box 73
		ammoModel[73].setRotationPoint(54.75F, 47.25F, -17F);

		ammoModel[74].addShapeBox(0F, 0F, 0F, 3, 15, 10, 0F,-0.65F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.65F, 0F, 0F, -3.75F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.75F, 0F, 0F); // Box 74
		ammoModel[74].setRotationPoint(45F, 29.75F, -17F);

		ammoModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -1.1F, -0.5F, -1F, 1.1F, -0.5F, 0F, 1.1F, -0.5F, 0F, -1.1F, -0.5F, -1F); // Box 75
		ammoModel[75].setRotationPoint(44.75F, 50.75F, -18F);

		ammoModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.75F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, -1F, -1F, -0.5F, 0F, 1F, -0.5F, 1F, 1F, -0.5F, 1F, -1F, -0.5F, 0F); // Box 76
		ammoModel[76].setRotationPoint(44.75F, 49.25F, -17F);

		ammoModel[77].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.5F, -1F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.75F, -0.5F, -1F); // Box 77
		ammoModel[77].setRotationPoint(44.75F, 44.75F, -17F);

		ammoModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.4F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		ammoModel[78].setRotationPoint(47F, 28.75F, -17F);

		ammoModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, 0F, 0F); // Box 79
		ammoModel[79].setRotationPoint(45.5F, 28.75F, -17F);

		ammoModel[80].addShapeBox(0F, 0F, 0F, 11, 8, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -1.6F, 0F, 0F); // Box 80
		ammoModel[80].setRotationPoint(35.5F, -2.25F, -7F);
	}
}