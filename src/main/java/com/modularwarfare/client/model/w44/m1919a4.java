//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 13.02.2016 - 18:17:10
// Last changed on: 13.02.2016 - 18:17:10

package com.modularwarfare.client.model.w44; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.model.ModelGun.EnumAction;
import com.modularwarfare.client.model.ModelGun.EnumArm;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class m1919a4 extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 256;

	public m1919a4() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[17];
		gunModel[0] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 88
		gunModel[1] = new ModelRendererTurbo(this, 19, 1, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 7
		gunModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 10
		gunModel[8] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 11
		gunModel[9] = new ModelRendererTurbo(this, 30, 9, textureX, textureY); // Box 16
		gunModel[10] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 17
		gunModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		gunModel[12] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 56
		gunModel[13] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 57
		gunModel[14] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 58
		gunModel[15] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 60
		gunModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 65

		gunModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.252F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 88
		gunModel[0].setRotationPoint(7.5F, -3.1F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F, -0.5F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, -0.5F, -0.8F, -0.75F); // Box 3
		gunModel[1].setRotationPoint(1F, -4F, -1.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F); // Box 4
		gunModel[2].setRotationPoint(7.5F, -2.4F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 5
		gunModel[3].setRotationPoint(7.5F, -2.75F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F, 0F, -1F, -2.8F, 0F, -1F, -2.8F, 0F, -1F, -2.8F, 0F, -1F, -2.8F, 0F, -0.8F, -2.8F, 0F, -0.8F, -2.8F, 0F, -0.8F, -2.8F, 0F, -0.8F, -2.8F); // Box 6
		gunModel[4].setRotationPoint(2F, -4.2F, -3.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 7
		gunModel[5].setRotationPoint(15.5F, -2.75F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F); // Box 8
		gunModel[6].setRotationPoint(1.5F, -4.2F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 10
		gunModel[7].setRotationPoint(6.4F, -3.45F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F, -0.38F, -0.44F, -0.38F); // Box 11
		gunModel[8].setRotationPoint(6.4F, -3.95F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F, -0.2F, -0.15F, -0.15F); // Box 16
		gunModel[9].setRotationPoint(-0.8F, -2.5F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -1F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -0.2F, -0.85F, -0.2F, -1F, -0.65F, -0.2F, -1F, -0.65F, -0.2F, -0.2F, -0.85F, -0.2F); // Box 17
		gunModel[10].setRotationPoint(-1.2F, -1.9F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F); // Box 22
		gunModel[11].setRotationPoint(4.4F, -2.9F, -1.2F);

		gunModel[12].addShapeBox(0F, 0.05F, -1.5F, 1, 2, 2, 0F, 0.2F, -1F, -0.3F, 0.2F, -1F, -0.3F, 0.2F, -1F, -0.3F, 0.2F, -1F, -0.3F, 0.2F, -0.9F, -0.3F, 0.2F, -0.9F, -0.3F, 0.2F, -0.9F, -0.3F, 0.2F, -0.9F, -0.3F); // Box 56
		gunModel[12].setRotationPoint(5.5F, -4.2F, 0.5F);
		gunModel[12].rotateAngleX = 0.36651914F;

		gunModel[13].addShapeBox(-0.2F, 0.2F, 0F, 1, 1, 1, 0F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F); // Box 57
		gunModel[13].setRotationPoint(0.8F, -1.5F, -0.5F);
		gunModel[13].rotateAngleZ = 0.45378561F;

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F); // Box 58
		gunModel[14].setRotationPoint(-1.2F, -2.5F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F, 0.65F, -0.95F, -3F); // Box 60
		gunModel[15].setRotationPoint(4.5F, -4.2F, -3.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -1F, -0.3F, -0.4F, -1F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -1F, -0.3F, -0.4F); // Box 65
		gunModel[16].setRotationPoint(4.4F, -3.4F, 0.2F);


		defaultScopeModel = new ModelRendererTurbo[7];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 23, 34, textureX, textureY); // Box 15
		defaultScopeModel[1] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 19
		defaultScopeModel[2] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 20
		defaultScopeModel[3] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 21
		defaultScopeModel[4] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 59
		defaultScopeModel[5] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 61
		defaultScopeModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 62

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F); // Box 15
		defaultScopeModel[0].setRotationPoint(7.5F, -3.8F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.3F, -0.41F, -0.45F, -0.3F, -0.41F, -0.45F, -0.3F, -0.41F, -0.45F, -0.3F, -0.41F, -0.45F, -0.3F, -0.41F, -0.45F, -0.3F, -0.41F, -0.45F, -0.3F, -0.41F, -0.45F, -0.3F, -0.41F); // Box 19
		defaultScopeModel[1].setRotationPoint(2F, -4.3F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.45F, 0.2F, -0.42F, -0.45F, 0.2F, -0.42F, -0.45F, 0.2F, -0.42F, -0.45F, 0.2F, -0.42F, -0.45F, 0F, -0.42F, -0.45F, 0F, -0.42F, -0.45F, 0F, -0.42F, -0.45F, 0F, -0.42F); // Box 20
		defaultScopeModel[2].setRotationPoint(2F, -4.6F, -0.67F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.45F, 0.2F, -0.42F, -0.45F, 0.2F, -0.42F, -0.45F, 0.2F, -0.42F, -0.45F, 0.2F, -0.42F, -0.45F, 0F, -0.42F, -0.45F, 0F, -0.42F, -0.45F, 0F, -0.42F, -0.45F, 0F, -0.42F); // Box 21
		defaultScopeModel[3].setRotationPoint(2F, -4.6F, -0.33F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F); // Box 59
		defaultScopeModel[4].setRotationPoint(2.3F, -4.4F, -1F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.46F, -0.15F, -0.48F, -0.46F, -0.15F, -0.48F, -0.46F, -0.15F, -0.48F, -0.46F, -0.15F, -0.48F, -0.46F, -0.15F, -0.48F, -0.46F, -0.15F, -0.48F, -0.46F, -0.15F, -0.48F, -0.46F, -0.15F, -0.48F); // Box 61
		defaultScopeModel[5].setRotationPoint(7.5F, -4.5F, -0.5F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.35F, -0.41F, -0.45F, -0.35F, -0.41F, -0.45F, -0.35F, -0.41F, -0.45F, -0.35F, -0.41F, -0.45F, -0.47F, -0.41F, -0.45F, -0.47F, -0.41F, -0.45F, -0.47F, -0.41F, -0.45F, -0.47F, -0.41F); // Box 62
		defaultScopeModel[6].setRotationPoint(2F, -5.15F, -0.5F);


		ammoModel = new ModelRendererTurbo[25];
		ammoModel[0] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 18
		ammoModel[1] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 23
		ammoModel[2] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 24
		ammoModel[3] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 25
		ammoModel[4] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 27
		ammoModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 28
		ammoModel[6] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 29
		ammoModel[7] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 30
		ammoModel[8] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 31
		ammoModel[9] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 32
		ammoModel[10] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 33
		ammoModel[11] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 34
		ammoModel[12] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 35
		ammoModel[13] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 36
		ammoModel[14] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 37
		ammoModel[15] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 39
		ammoModel[16] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 40
		ammoModel[17] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 47
		ammoModel[18] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 48
		ammoModel[19] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 49
		ammoModel[20] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 50
		ammoModel[21] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 52
		ammoModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 53
		ammoModel[23] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 54
		ammoModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 55

		ammoModel[0].addShapeBox(5F, -4.2F, -0.2F, 6, 5, 8, 0F, 0F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, 0F, -1.5F, -3.9F, 0F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, 0F, -1.5F, -3.9F); // Box 18
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		ammoModel[0].rotateAngleX = -0.06981317F;

		ammoModel[1].addShapeBox(3.7F, -4.2F, -1.8F, 6, 5, 8, 0F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F); // Box 23
		ammoModel[1].setRotationPoint(0F, 0F, 0F);
		ammoModel[1].rotateAngleX = -0.06981317F;

		ammoModel[2].addShapeBox(2.1F, -4.2F, -1.8F, 6, 5, 8, 0F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.7F, -2.9F, -1.5F, -2.5F, -2.9F, -1.5F, -2.5F); // Box 24
		ammoModel[2].setRotationPoint(0F, 0F, 0F);
		ammoModel[2].rotateAngleX = -0.06981317F;

		ammoModel[3].addShapeBox(5F, -4.2F, -3.2F, 6, 5, 8, 0F, 0F, -2F, -3.9F, -4.2F, -2F, -3.9F, -4.2F, -2F, -3.9F, 0F, -2F, -3.9F, 0F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, -4.2F, -1.5F, -3.9F, 0F, -1.5F, -3.9F); // Box 25
		ammoModel[3].setRotationPoint(0F, 0F, 0F);
		ammoModel[3].rotateAngleX = -0.06981317F;

		ammoModel[4].addShapeBox(5F, -4.2F, -1.7F, 6, 5, 8, 0F, -0.2F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -0.2F, -3.3F, -2.6F, -0.2F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -0.2F, -1.5F, -2.6F); // Box 27
		ammoModel[4].setRotationPoint(0F, 0F, 0F);
		ammoModel[4].rotateAngleX = -0.06981317F;

		ammoModel[5].addShapeBox(3.7F, -3.15F, -2.4F, 6, 1, 6, 0F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F); // Box 28
		ammoModel[5].setRotationPoint(0F, 0F, 0F);
		ammoModel[5].rotateAngleX = -0.15707963F;

		ammoModel[6].addShapeBox(2.1F, -3.15F, -2.4F, 6, 1, 6, 0F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.7F, -2.85F, -0.285F, -2.5F, -2.85F, -0.285F, -2.5F); // Box 29
		ammoModel[6].setRotationPoint(0F, 0F, 0F);
		ammoModel[6].rotateAngleX = -0.15707963F;

		ammoModel[7].addShapeBox(5F, -5.45F, -1.7F, 6, 5, 8, 0F, -0.2F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -4.4F, -3.3F, -2.6F, -0.2F, -3.3F, -2.6F, -0.2F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -4.4F, -1.5F, -2.6F, -0.2F, -1.5F, -2.6F); // Box 30
		ammoModel[7].setRotationPoint(0F, 0F, 0F);
		ammoModel[7].rotateAngleX = -0.06981317F;

		ammoModel[8].addShapeBox(3.39F, -7F, -1.7F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 31
		ammoModel[8].setRotationPoint(0F, 0F, 0F);
		ammoModel[8].rotateAngleX = -0.26179939F;

		ammoModel[9].addShapeBox(3.39F, -7F, -1.3F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 32
		ammoModel[9].setRotationPoint(0F, 0F, 0F);
		ammoModel[9].rotateAngleX = -0.26179939F;

		ammoModel[10].addShapeBox(3.39F, -7F, -2.1F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 33
		ammoModel[10].setRotationPoint(0F, 0F, 0F);
		ammoModel[10].rotateAngleX = -0.26179939F;

		ammoModel[11].addShapeBox(3.39F, -7F, -2.5F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 34
		ammoModel[11].setRotationPoint(0F, 0F, 0F);
		ammoModel[11].rotateAngleX = -0.26179939F;

		ammoModel[12].addShapeBox(3.39F, -7F, -3.3F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 35
		ammoModel[12].setRotationPoint(0F, 0F, 0F);
		ammoModel[12].rotateAngleX = -0.26179939F;

		ammoModel[13].addShapeBox(3.39F, -7F, -3.7F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 36
		ammoModel[13].setRotationPoint(0F, 0F, 0F);
		ammoModel[13].rotateAngleX = -0.26179939F;

		ammoModel[14].addShapeBox(3.39F, -7F, -2.9F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 37
		ammoModel[14].setRotationPoint(0F, 0F, 0F);
		ammoModel[14].rotateAngleX = -0.26179939F;

		ammoModel[15].addShapeBox(3.39F, -7F, -4F, 5, 8, 11, 0F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F, -2.05F, -3.95F, -3.9F); // Box 39
		ammoModel[15].setRotationPoint(0F, 0F, 0F);
		ammoModel[15].rotateAngleX = -0.26179939F;

		ammoModel[16].addShapeBox(4.98F, -7F, -3.7F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 40
		ammoModel[16].setRotationPoint(0F, 0F, 0F);
		ammoModel[16].rotateAngleX = -0.26179939F;

		ammoModel[17].addShapeBox(4.98F, -7F, -3.3F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 47
		ammoModel[17].setRotationPoint(0F, 0F, 0F);
		ammoModel[17].rotateAngleX = -0.26179939F;

		ammoModel[18].addShapeBox(4.98F, -7F, -1.3F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 48
		ammoModel[18].setRotationPoint(0F, 0F, 0F);
		ammoModel[18].rotateAngleX = -0.26179939F;

		ammoModel[19].addShapeBox(4.98F, -7F, -1.7F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 49
		ammoModel[19].setRotationPoint(0F, 0F, 0F);
		ammoModel[19].rotateAngleX = -0.26179939F;

		ammoModel[20].addShapeBox(4.98F, -7F, -2.9F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 50
		ammoModel[20].setRotationPoint(0F, 0F, 0F);
		ammoModel[20].rotateAngleX = -0.26179939F;

		ammoModel[21].addShapeBox(4.98F, -7F, -2.5F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 52
		ammoModel[21].setRotationPoint(0F, 0F, 0F);
		ammoModel[21].rotateAngleX = -0.26179939F;

		ammoModel[22].addShapeBox(4.98F, -7F, -2.1F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 53
		ammoModel[22].setRotationPoint(0F, 0F, 0F);
		ammoModel[22].rotateAngleX = -0.26179939F;

		ammoModel[23].addShapeBox(3.39F, -7F, -4.1F, 5, 8, 8, 0F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F, -2F, -3.9F, -3.9F); // Box 54
		ammoModel[23].setRotationPoint(0F, 0F, 0F);
		ammoModel[23].rotateAngleX = -0.26179939F;

		ammoModel[24].addShapeBox(4.98F, -7F, -4.1F, 3, 8, 8, 0F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F, -1.4F, -3.92F, -3.92F, -1.4F, -4F, -4F, -1.4F, -4F, -4F, -1.4F, -3.92F, -3.92F); // Box 55
		ammoModel[24].setRotationPoint(0F, 0F, 0F);
		ammoModel[24].rotateAngleX = -0.26179939F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 1, 60, textureX, textureY); // Box 13
		slideModel[1] = new ModelRendererTurbo(this, 9, 60, textureX, textureY); // Box 14

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 13
		slideModel[0].setRotationPoint(6.4F, -2.9F, -1.2F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.37F, -0.37F, -0.4F, -0.37F, -0.37F, -0.4F, -0.32F, -0.32F, -0.4F, -0.32F, -0.32F, -0.4F, -0.37F, -0.37F, -0.4F, -0.37F, -0.37F, -0.4F, -0.32F, -0.32F, -0.4F, -0.32F, -0.32F, -0.4F); // Box 14
		slideModel[1].setRotationPoint(6.4F, -2.9F, -1.7F);

		this.modelScale = 1.15F;

		translateAll = new Vector3f(0F, -1.25F, -0.05F);
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .15F;
	    reloadAnimation = WeaponAnimations.SIDE_CLIP;
	    
		hasFlash = false;
	    
	    leftArmPos = new Vector3f(0.480F, -0.58F, 0.02F);
	    leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.2F, -0.62F, -0.2F);
	    leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);
	    
	    rightArmPos = new Vector3f(0.32F, -0.63F, 0.0F);
	    rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
	    rightArmReloadPos = new Vector3f(0.32F, -0.58F, 0.0F);
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