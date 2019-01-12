//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ump9
// Model Creator: 
// Created on: -
// Last changed on: -

package com.modularwarfare.client.model.test.ammo; //Path where the model is located

import com.modularwarfare.client.model.ModelAmmo;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class ump9mag extends ModelAmmo //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ump9mag() //Same as Filename
	{
		ammoModel = new ModelRendererTurbo[23];

		initammoModel_1();

		translateAll(0F, -10.5F, -0.1F);


		flipAll();
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Import Box883
		ammoModel[1] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Import Box884
		ammoModel[2] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Import Box885
		ammoModel[3] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Import Box886
		ammoModel[4] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Import Box887
		ammoModel[5] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Import Box888
		ammoModel[6] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Import Box889
		ammoModel[7] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Import Box890
		ammoModel[8] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Import Box891
		ammoModel[9] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Import Box892
		ammoModel[10] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Import Box903
		ammoModel[11] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Import Box904
		ammoModel[12] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Import Box905
		ammoModel[13] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Import Box906
		ammoModel[14] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Import Box907
		ammoModel[15] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Import Box908
		ammoModel[16] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Import Box909
		ammoModel[17] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Import Box910
		ammoModel[18] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Import Box911
		ammoModel[19] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Import Box912
		ammoModel[20] = new ModelRendererTurbo(this, 969, 193, textureX, textureY); // Import Box914
		ammoModel[21] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Import Box915
		ammoModel[22] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Import Box916

		ammoModel[0].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 5F, -0.25F, 0F, 5F, -0.25F, 0F, -5F, 0F, 0F); // Import Box883
		ammoModel[0].setRotationPoint(31F, -16F, -5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,-1.75F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1.75F, 0F, 0F, -4.75F, -0.25F, 0F, 5F, -0.5F, 0F, 5F, -0.5F, 0F, -4.75F, -0.25F, 0F); // Import Box884
		ammoModel[1].setRotationPoint(34F, -16F, -4.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -5F, -0.5F, 0F, 5F, -0.75F, 0F, 5F, -0.75F, 0F, -5F, -0.5F, 0F); // Import Box885
		ammoModel[2].setRotationPoint(36F, -16F, -5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, -5F, -0.75F, 0F, 5F, -0.75F, -1F, 5F, -0.75F, -1F, -5F, -0.75F, 0F); // Import Box886
		ammoModel[3].setRotationPoint(40F, -16F, -5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -5F, 0F, -1F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, -1F); // Import Box887
		ammoModel[4].setRotationPoint(30F, -16F, -5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2F, 0F, 0F, 2F, 0.25F, 0F, 2F, 0.25F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 6F, -0.5F, 0F, 6F, -0.5F, 0F, -6F, 0F, 0F); // Import Box888
		ammoModel[5].setRotationPoint(34F, -4F, -5F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -6F, 0F, -1F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, -1F); // Import Box889
		ammoModel[6].setRotationPoint(33F, -4F, -5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,-1.75F, 0.25F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -1.75F, 0.25F, 0F, -5.75F, -0.5F, 0F, 6F, -0.75F, 0F, 6F, -0.75F, 0F, -5.75F, -0.5F, 0F); // Import Box890
		ammoModel[7].setRotationPoint(37F, -4F, -4.5F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,-2F, 0.5F, 0F, 2F, 0.75F, 0F, 2F, 0.75F, 0F, -2F, 0.5F, 0F, -6F, -0.75F, 0F, 6F, -1.25F, 0F, 6F, -1.25F, 0F, -6F, -0.75F, 0F); // Import Box891
		ammoModel[8].setRotationPoint(39F, -4F, -5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0.75F, 0F, 2F, 0.75F, -1F, 2F, 0.75F, -1F, -2F, 0.75F, 0F, -6F, -1.25F, 0F, 6F, -1.25F, -1F, 6F, -1.25F, -1F, -6F, -1.25F, 0F); // Import Box892
		ammoModel[9].setRotationPoint(43F, -4F, -5F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -7F, 0F, -1F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, -1F); // Import Box903
		ammoModel[10].setRotationPoint(37F, 8F, -5F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2F, 0F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, 7F, -0.75F, 0F, 7F, -0.75F, 0F, -7F, 0F, 0F); // Import Box904
		ammoModel[11].setRotationPoint(38F, 8F, -5F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,-1.75F, 0.5F, 0F, 2F, 0.75F, 0F, 2F, 0.75F, 0F, -1.75F, 0.5F, 0F, -6.75F, -0.65F, 0F, 7F, -1.25F, 0F, 7F, -1.25F, 0F, -6.75F, -0.65F, 0F); // Import Box905
		ammoModel[12].setRotationPoint(41F, 8F, -4.5F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,-2F, 0.75F, 0F, 2F, 1.25F, 0F, 2F, 1.25F, 0F, -2F, 0.75F, 0F, -7F, -1.25F, 0F, 7F, -2F, 0F, 7F, -2F, 0F, -7F, -1.25F, 0F); // Import Box906
		ammoModel[13].setRotationPoint(43F, 8F, -5F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 1.25F, 0F, 2F, 1.25F, -1F, 2F, 1.25F, -1F, -2F, 1.25F, 0F, -7F, -2F, 0F, 7F, -2.25F, -1F, 7F, -2.25F, -1F, -7F, -2F, 0F); // Import Box907
		ammoModel[14].setRotationPoint(47F, 8F, -5F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -8F, 0F, -1F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, -1F); // Import Box908
		ammoModel[15].setRotationPoint(42F, 20F, -5F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2F, 0F, 0F, 2F, 0.75F, 0F, 2F, 0.75F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, 8F, -0.75F, 0F, 8F, -0.75F, 0F, -8F, 0F, 0F); // Import Box909
		ammoModel[16].setRotationPoint(43F, 20F, -5F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 2, 12, 10, 0F,-2F, 0.75F, 0F, 2F, 1.25F, 0F, 2F, 1.25F, 0F, -2F, 0.75F, 0F, -8F, -0.75F, 0F, 8F, -1.5F, 0F, 8F, -1.5F, 0F, -8F, -0.75F, 0F); // Import Box910
		ammoModel[17].setRotationPoint(46F, 20F, -5F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,-2F, 1.25F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -2F, 1.25F, 0F, -8F, -1.5F, 0F, 8F, -2.75F, 0F, 8F, -2.75F, 0F, -8F, -1.5F, 0F); // Import Box911
		ammoModel[18].setRotationPoint(48F, 20F, -5F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 2F, 0F, 2F, 2.25F, -1F, 2F, 2.25F, -1F, -2F, 2F, 0F, -8F, -2.75F, 0F, 8F, -3F, -1F, 8F, -3F, -1F, -8F, -2.75F, 0F); // Import Box912
		ammoModel[19].setRotationPoint(52F, 20F, -5F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 9, 2, 12, 0F,0F, 0F, -1F, 0F, 2.75F, -1F, 0F, 2.75F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 1.5F, -2.75F, 0F, 1.5F, -2.75F, 0F, -1F, 0F, 0F); // Import Box914
		ammoModel[20].setRotationPoint(51F, 32F, -6F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F); // Import Box915
		ammoModel[21].setRotationPoint(50F, 32F, -6F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -0.25F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, -1F, -1.5F, 0.25F, 0F, 1.5F, 0F, -1F, 1.5F, 0F, -1F, -1.5F, 0.25F, 0F); // Import Box916
		ammoModel[22].setRotationPoint(60F, 29F, -6F);
	}
}