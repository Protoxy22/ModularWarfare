//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.modularwarfare.client.model.omw.armor; //Path where the model is located

import com.modularwarfare.client.model.ModelArmor;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class ghillie extends ModelArmor //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ghillie() //Same as Filename
	{
		headModel = new ModelRendererTurbo[18];
		bodyModel = new ModelRendererTurbo[10];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[2];
		rightLegModel = new ModelRendererTurbo[2];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 13
		headModel[1] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 14
		headModel[2] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 0
		headModel[3] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 111
		headModel[5] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 11
		headModel[6] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 113
		headModel[7] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 115
		headModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 133
		headModel[9] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 131
		headModel[10] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 12
		headModel[11] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 131
		headModel[12] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 132
		headModel[13] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 134
		headModel[14] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 137
		headModel[15] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 138
		headModel[16] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 139
		headModel[17] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 108

		headModel[0].addShapeBox(-4.5F, -4F, -4.5F, 9, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Box 13
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Box 14
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -8F, -4.5F, 9, 2, 9, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 0
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F,-1F, 0.1F, -1F, -1F, 0.1F, -1F, -1F, 0.1F, -1F, -1F, 0.1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4.5F, -6.5F, -4.5F, 9, 2, 9, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F); // Box 111
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(0F, -4.4F, 3.7F, 4, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.15F, 0F, 0.12F, 0.45F, 0F, 0F, 0.1F, 0F, 0F, -0.3F, 0F); // Box 11
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -4.5F, 0F, 1, 2, 3, 0F,-0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0.4F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 113
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5F, -4.5F, -2.5F, 1, 2, 2, 0F,-0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0.2F, -1.4F, 0F, -0.3F, -1.4F, 0F, -0.5F, 0.2F, 0F, 0.4F, 0.2F, 0F); // Box 115
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.5F, -5.5F, -5.7F, 9, 1, 1, 0F,0.16F, -0.8F, -0.4F, 0.16F, -0.8F, -0.4F, 0.2F, 0F, 0.03F, 0.2F, 0F, 0.03F, 0.2F, -0.05F, -0.4F, 0.2F, -0.05F, -0.4F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F); // Box 133
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5F, -4.5F, -4.5F, 1, 1, 2, 0F,-0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1F, 0F, 0F, -1F, 0F, -0.3F, -0.4F, 0F, 0.2F, -0.4F, 0F); // Box 131
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5F, -6.2F, -5.1F, 10, 1, 10, 0F,-0.37F, 0F, -0.4F, -0.37F, 0F, -0.4F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F); // Box 12
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(4F, -4.5F, -4.5F, 1, 1, 2, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.1F, -1F, 0F, 0.2F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 131
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(4F, -4.5F, -2.5F, 1, 2, 2, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1.4F, 0F, 0.2F, -1.4F, 0F, 0.4F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 132
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-5F, -4.5F, 3F, 1, 2, 2, 0F,-0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.8F, -0.3F, -0.1F, -0.8F, -0.3F); // Box 134
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(4F, -4.5F, 0F, 1, 2, 3, 0F,0F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 137
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(4F, -4.5F, 3F, 1, 2, 2, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.1F, -0.8F, -0.3F, 0F, -0.8F, -0.3F); // Box 138
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -4.4F, 3.7F, 4, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.12F, 0.45F, 0F, 0F, 0.15F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, 0F); // Box 139
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-1.5F, 0F, -4F, 3, 1, 1, 0F,-0.4F, 0.05F, 0.1F, -0.4F, 0.05F, 0.1F, -0.4F, 0.05F, 0.1F, -0.4F, 0.05F, 0.1F, -0.6F, -0.75F, 0.1F, -0.6F, -0.75F, 0.1F, -0.6F, -0.75F, 0.1F, -0.6F, -0.75F, 0.1F); // Box 108
		headModel[17].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 11
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 50
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 51
		bodyModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 52
		bodyModel[7] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 53
		bodyModel[8] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 39
		bodyModel[9] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 33

		bodyModel[0].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-0.5F, -0.1F, -2.15F, 2, 2, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-1.5F, -0.1F, -2.12F, 2, 2, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 12
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,-1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addBox(0.9F, 2.5F, -2.2F, 3, 1, 1, 0F); // Box 50
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.9F, 2.5F, -2.2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(-3.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 52
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addBox(0.9F, 3.5F, -2.15F, 3, 2, 1, 0F); // Box 53
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-0.5F, 1.4F, -2.15F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 39
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 33
		bodyModel[9].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 1

		leftArmModel[0].addShapeBox(-1F, 6.5F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 142

		rightArmModel[0].addShapeBox(-3F, 6.5F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -2.1F, -3F, 4, 9, 0, 0F,0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 0
		leftLegModel[1] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 24

		leftLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7.1F, -2.4F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 5
		rightLegModel[1] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 25

		rightLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 12, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 7.1F, -2.4F, 4, 5, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);
	}
}