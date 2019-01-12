//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ump
// Model Creator: 
// Created on: 01.08.2018 - 13:36:15
// Last changed on: 01.08.2018 - 13:36:15
package com.modularwarfare.client.model.test.ammo;

import com.modularwarfare.client.model.ModelAmmo;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class ump45mag extends ModelAmmo
{
	int textureX = 1024;
	int textureY = 1024;

	public ump45mag()
	{
		ammoModel = new ModelRendererTurbo[25];
		fullAmmoModel = new ModelRendererTurbo[16];

		initAmmoModel();
		initFullAmmoModel();

		translateAll(0F, -10.5F, -0.1F);

		flipAll();
	}

	private void initAmmoModel()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Import Box0
		ammoModel[6] = new ModelRendererTurbo(this, 705, 89, textureX, textureY); // Import Box0
		ammoModel[7] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Import Box0
		ammoModel[8] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Import Box0
		ammoModel[9] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Import Box0
		ammoModel[10] = new ModelRendererTurbo(this, 977, 89, textureX, textureY); // Import Box0
		ammoModel[11] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Import Box0
		ammoModel[12] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY); // Import Box0
		ammoModel[13] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box0
		ammoModel[14] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Import Box0
		ammoModel[15] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Import Box0
		ammoModel[16] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Import Box0
		ammoModel[17] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Import Box0
		ammoModel[18] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Import Box0
		ammoModel[19] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Import Box0
		ammoModel[20] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Import Box0
		ammoModel[21] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Import Box0
		ammoModel[22] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Import Box0
		ammoModel[23] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Import Box0
		ammoModel[24] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Import Box0

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 47, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -9.75F, 0F, -1F, 9.75F, 0F, 0F, 9.75F, 0F, 0F, -9.75F, 0F, -1F); // Import Box0
		ammoModel[0].setRotationPoint(34F, -9.25F, -5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 47, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -9.5F, 0F, 0F, 9.5F, 0F, -1F, 9.5F, 0F, -1F, -9.5F, 0F, 0F); // Import Box0
		ammoModel[1].setRotationPoint(44F, -9.25F, -5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 4, 47, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, 0F, 0F, 9.5F, 0F, 0F, 9.5F, 0F, 0F, -9.5F, 0F, 0F); // Import Box0
		ammoModel[2].setRotationPoint(40F, -9.25F, -5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, -0.25F, -1F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, -0.25F, -1F, 1F); // Import Box0
		ammoModel[3].setRotationPoint(45.5F, 42.75F, -5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,-0.25F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, -0.25F, 0.5F, 0F, -0.35F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.35F, -1F, 0F); // Import Box0
		ammoModel[4].setRotationPoint(45.5F, 44.25F, -6F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.5F, -1F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.75F, -0.5F, -1F); // Import Box0
		ammoModel[5].setRotationPoint(43.75F, 37.75F, -5F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.75F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, -1F, -1F, -0.5F, 0F, 1F, -0.5F, 1F, 1F, -0.5F, 1F, -1F, -0.5F, 0F); // Import Box0
		ammoModel[6].setRotationPoint(43.75F, 42.25F, -5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -1.1F, -0.5F, -1F, 1.1F, -0.5F, 0F, 1.1F, -0.5F, 0F, -1.1F, -0.5F, -1F); // Import Box0
		ammoModel[7].setRotationPoint(43.75F, 43.75F, -6F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0.25F, 0F, 0F, -1.25F, -0.5F, 0F, 1.25F, -0.5F, -1F, 1.25F, -0.5F, -1F, -1.25F, -0.5F, 0F); // Import Box0
		ammoModel[8].setRotationPoint(53.75F, 37.75F, -5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.5F, 0F, -0.5F, 0.65F, 0F, -0.5F, 0.65F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, -1.15F, 0F, -0.5F, -1.15F, 0F, 0F, -1F, 0F); // Import Box0
		ammoModel[9].setRotationPoint(54.5F, 42.25F, -6F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, -0.65F, 1F, 0.75F, -0.95F, 0F, 0.75F, -0.95F, 0F, -0.75F, -0.65F, 1F); // Import Box0
		ammoModel[10].setRotationPoint(54.25F, 40.25F, -5F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.65F, 0F, 0F, 0.95F, -1F, 0F, 0.95F, -1F, 0F, 0.65F, 0F, 0F, -1.15F, 0F, 0F, -1.6F, -1F, 0F, -1.6F, -1F, 0F, -1.15F, 0F); // Import Box0
		ammoModel[11].setRotationPoint(55F, 42.25F, -6F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 1F, 0.25F, -0.65F, 1F, 0.25F, -0.65F, 1F, -0.75F, -0.5F, 1F); // Import Box0
		ammoModel[12].setRotationPoint(53.75F, 40.25F, -5F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.75F, 1.5F, 0F); // Import Box0
		ammoModel[13].setRotationPoint(44.75F, 37.75F, -5F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import Box0
		ammoModel[14].setRotationPoint(53.75F, 37.75F, -5F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 3, 15, 10, 0F,-0.65F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.65F, 0F, 0F, -3.75F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.75F, 0F, 0F); // Import Box0
		ammoModel[15].setRotationPoint(44F, 22.75F, -5F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, 0F, 0F); // Import Box0
		ammoModel[16].setRotationPoint(44.5F, 21.75F, -5F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.4F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[17].setRotationPoint(46F, 21.75F, -5F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 2, 47, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.75F, 0F, 0F, 9.75F, 0F, 0F, 9.75F, 0F, 0F, -9.75F, 0F, 0F); // Import Box0
		ammoModel[18].setRotationPoint(38F, -9.25F, -4.5F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 3, 47, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.75F, 0F, 0F, 9.75F, 0F, 0F, 9.75F, 0F, 0F, -9.75F, 0F, 0F); // Import Box0
		ammoModel[19].setRotationPoint(35F, -9.25F, -5F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Import Box0
		ammoModel[20].setRotationPoint(31F, -21.25F, -5F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,-1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Import Box0
		ammoModel[21].setRotationPoint(36F, -21.25F, -5F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,-1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Import Box0
		ammoModel[22].setRotationPoint(34F, -21.25F, -4.5F);

		ammoModel[23].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-1.75F, 0F, 0F, 1.75F, 0F, -1F, 1.75F, 0F, -1F, -1.75F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 0F); // Import Box0
		ammoModel[23].setRotationPoint(40F, -21.25F, -5F);

		ammoModel[24].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F); // Import Box0
		ammoModel[24].setRotationPoint(30F, -21.25F, -5F);
	}

	private void initFullAmmoModel()
	{
		fullAmmoModel[0] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 440
		fullAmmoModel[1] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 441
		fullAmmoModel[2] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Box 446
		fullAmmoModel[3] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 447
		fullAmmoModel[4] = new ModelRendererTurbo(this, 977, 177, textureX, textureY); // Box 136
		fullAmmoModel[5] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 137
		fullAmmoModel[6] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 148
		fullAmmoModel[7] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Box 149
		fullAmmoModel[8] = new ModelRendererTurbo(this, 721, 193, textureX, textureY); // Box 174
		fullAmmoModel[9] = new ModelRendererTurbo(this, 745, 193, textureX, textureY); // Box 175
		fullAmmoModel[10] = new ModelRendererTurbo(this, 761, 193, textureX, textureY); // Box 176
		fullAmmoModel[11] = new ModelRendererTurbo(this, 777, 193, textureX, textureY); // Box 177
		fullAmmoModel[12] = new ModelRendererTurbo(this, 801, 193, textureX, textureY); // Box 178
		fullAmmoModel[13] = new ModelRendererTurbo(this, 817, 193, textureX, textureY); // Box 179
		fullAmmoModel[14] = new ModelRendererTurbo(this, 841, 193, textureX, textureY); // Box 180
		fullAmmoModel[15] = new ModelRendererTurbo(this, 857, 193, textureX, textureY); // Box 181

		fullAmmoModel[0].addShapeBox(-5F, -2F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -1.23F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.42F, -0.58F); // Box 440
		fullAmmoModel[0].setRotationPoint(38.5F, -21F, 2F);

		fullAmmoModel[1].addShapeBox(-5F, -2F, 0F, 6, 2, 2, 0F,0F, -0.58F, -1.42F, 0F, -0.58F, -1.42F, 0F, -1.23F, -0.15F, 0F, -1.23F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		fullAmmoModel[1].setRotationPoint(38.5F, -21F, 2F);

		fullAmmoModel[2].addShapeBox(-5F, -2F, -2F, 6, 2, 2, 0F,0F, -0.15F, -1.23F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.42F, -0.58F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		fullAmmoModel[2].setRotationPoint(38.5F, -21F, 2F);

		fullAmmoModel[3].addShapeBox(-5F, -2F, -2F, 6, 2, 2, 0F,0F, -1.23F, -0.15F, 0F, -1.23F, -0.15F, 0F, -0.58F, -1.42F, 0F, -0.58F, -1.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		fullAmmoModel[3].setRotationPoint(38.5F, -21F, 2F);

		fullAmmoModel[4].addShapeBox(5F, -2F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.575F, -1.405F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.095F, -0.905F, 0F, -1.42F, -0.58F); // Box 136
		fullAmmoModel[4].setRotationPoint(34.5F, -21F, 2F);

		fullAmmoModel[5].addShapeBox(5F, -2F, 0F, 2, 2, 2, 0F,0F, -0.58F, -1.42F, 0F, -0.905F, -1.095F, 0F, -1.405F, -0.575F, 0F, -1.23F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 137
		fullAmmoModel[5].setRotationPoint(34.5F, -21F, 2F);

		fullAmmoModel[6].addShapeBox(5F, -2F, -2F, 2, 2, 2, 0F,0F, -1.23F, -0.15F, 0F, -1.405F, -0.575F, 0F, -0.905F, -1.095F, 0F, -0.58F, -1.42F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		fullAmmoModel[6].setRotationPoint(34.5F, -21F, 2F);

		fullAmmoModel[7].addShapeBox(5F, -2F, -2F, 2, 2, 2, 0F,0F, -0.15F, -1.23F, 0F, -0.575F, -1.405F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.095F, -0.905F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		fullAmmoModel[7].setRotationPoint(34.5F, -21F, 2F);

		fullAmmoModel[8].addShapeBox(-5F, -2F, -2F, 6, 2, 2, 0F,0F, -1.23F, -0.15F, 0F, -1.23F, -0.15F, 0F, -0.58F, -1.42F, 0F, -0.58F, -1.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		fullAmmoModel[8].setRotationPoint(38.5F, -20F, -2F);

		fullAmmoModel[9].addShapeBox(5F, -2F, -2F, 2, 2, 2, 0F,0F, -1.23F, -0.15F, 0F, -1.405F, -0.575F, 0F, -0.905F, -1.095F, 0F, -0.58F, -1.42F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		fullAmmoModel[9].setRotationPoint(34.5F, -20F, -2F);

		fullAmmoModel[10].addShapeBox(5F, -2F, -2F, 2, 2, 2, 0F,0F, -0.15F, -1.23F, 0F, -0.575F, -1.405F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.095F, -0.905F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		fullAmmoModel[10].setRotationPoint(34.5F, -20F, -2F);

		fullAmmoModel[11].addShapeBox(-5F, -2F, -2F, 6, 2, 2, 0F,0F, -0.15F, -1.23F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.42F, -0.58F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		fullAmmoModel[11].setRotationPoint(38.5F, -20F, -2F);

		fullAmmoModel[12].addShapeBox(5F, -2F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.575F, -1.405F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.095F, -0.905F, 0F, -1.42F, -0.58F); // Box 178
		fullAmmoModel[12].setRotationPoint(34.5F, -20F, -2F);

		fullAmmoModel[13].addShapeBox(-5F, -2F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -1.23F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.42F, -0.58F); // Box 179
		fullAmmoModel[13].setRotationPoint(38.5F, -20F, -2F);

		fullAmmoModel[14].addShapeBox(5F, -2F, 0F, 2, 2, 2, 0F,0F, -0.58F, -1.42F, 0F, -0.905F, -1.095F, 0F, -1.405F, -0.575F, 0F, -1.23F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 180
		fullAmmoModel[14].setRotationPoint(34.5F, -20F, -2F);

		fullAmmoModel[15].addShapeBox(-5F, -2F, 0F, 6, 2, 2, 0F,0F, -0.58F, -1.42F, 0F, -0.58F, -1.42F, 0F, -1.23F, -0.15F, 0F, -1.23F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		fullAmmoModel[15].setRotationPoint(38.5F, -20F, -2F);
	}
}
