//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ump9
// Model Creator: 
// Created on: 11.01.2019 - 13:04:20
// Last changed on: 11.01.2019 - 13:04:20

package com.modularwarfare.client.model.mwp.ammo; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.client.model.ModelAmmo;
import com.modularwarfare.client.model.objects.RenderVariables;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class tripleump9mag extends ModelAmmo //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public tripleump9mag() //Same as Filename
	{
		ammoModel = new ModelRendererTurbo[69];

		initammoModel_1();

		translateAll(0F, -10.5F, -0.1F);

		magCountOffset.put(1, new RenderVariables(new Vector3f(0f, 0f, 0f)));
		magCountOffset.put(2, new RenderVariables(new Vector3f(0f, 0.3f, -1f)));
		magCountOffset.put(3, new RenderVariables(new Vector3f(0f, 0f, 0f)));
		

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
		ammoModel[23] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 23
		ammoModel[24] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 24
		ammoModel[25] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 25
		ammoModel[26] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 26
		ammoModel[27] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 27
		ammoModel[28] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 28
		ammoModel[29] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 29
		ammoModel[30] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 30
		ammoModel[31] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 31
		ammoModel[32] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 32
		ammoModel[33] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 33
		ammoModel[34] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 34
		ammoModel[35] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 35
		ammoModel[36] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 36
		ammoModel[37] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 37
		ammoModel[38] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 38
		ammoModel[39] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 39
		ammoModel[40] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Box 40
		ammoModel[41] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 41
		ammoModel[42] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 42
		ammoModel[43] = new ModelRendererTurbo(this, 969, 193, textureX, textureY); // Box 43
		ammoModel[44] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 44
		ammoModel[45] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 45
		ammoModel[46] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 46
		ammoModel[47] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 47
		ammoModel[48] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 48
		ammoModel[49] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 49
		ammoModel[50] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 50
		ammoModel[51] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 51
		ammoModel[52] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 52
		ammoModel[53] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 53
		ammoModel[54] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 54
		ammoModel[55] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 55
		ammoModel[56] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 56
		ammoModel[57] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 57
		ammoModel[58] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 58
		ammoModel[59] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 59
		ammoModel[60] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 60
		ammoModel[61] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 61
		ammoModel[62] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 62
		ammoModel[63] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Box 63
		ammoModel[64] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 64
		ammoModel[65] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 65
		ammoModel[66] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 66
		ammoModel[67] = new ModelRendererTurbo(this, 969, 193, textureX, textureY); // Box 67
		ammoModel[68] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 68

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

		ammoModel[23].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 5F, -0.25F, 0F, 5F, -0.25F, 0F, -5F, 0F, 0F); // Box 23
		ammoModel[23].setRotationPoint(35F, -4F, 9F);

		ammoModel[24].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,-1.75F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1.75F, 0F, 0F, -4.75F, -0.25F, 0F, 5F, -0.5F, 0F, 5F, -0.5F, 0F, -4.75F, -0.25F, 0F); // Box 24
		ammoModel[24].setRotationPoint(38F, -4F, 9.5F);

		ammoModel[25].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -5F, -0.5F, 0F, 5F, -0.75F, 0F, 5F, -0.75F, 0F, -5F, -0.5F, 0F); // Box 25
		ammoModel[25].setRotationPoint(40F, -4F, 9F);

		ammoModel[26].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, -5F, -0.75F, 0F, 5F, -0.75F, -1F, 5F, -0.75F, -1F, -5F, -0.75F, 0F); // Box 26
		ammoModel[26].setRotationPoint(44F, -4F, 9F);

		ammoModel[27].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -5F, 0F, -1F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, -1F); // Box 27
		ammoModel[27].setRotationPoint(34F, -4F, 9F);

		ammoModel[28].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2F, 0F, 0F, 2F, 0.25F, 0F, 2F, 0.25F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 6F, -0.5F, 0F, 6F, -0.5F, 0F, -6F, 0F, 0F); // Box 28
		ammoModel[28].setRotationPoint(38F, 8F, 9F);

		ammoModel[29].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -6F, 0F, -1F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, -1F); // Box 29
		ammoModel[29].setRotationPoint(37F, 8F, 9F);

		ammoModel[30].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,-1.75F, 0.25F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -1.75F, 0.25F, 0F, -5.75F, -0.5F, 0F, 6F, -0.75F, 0F, 6F, -0.75F, 0F, -5.75F, -0.5F, 0F); // Box 30
		ammoModel[30].setRotationPoint(41F, 8F, 9.5F);

		ammoModel[31].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,-2F, 0.5F, 0F, 2F, 0.75F, 0F, 2F, 0.75F, 0F, -2F, 0.5F, 0F, -6F, -0.75F, 0F, 6F, -1.25F, 0F, 6F, -1.25F, 0F, -6F, -0.75F, 0F); // Box 31
		ammoModel[31].setRotationPoint(43F, 8F, 9F);

		ammoModel[32].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0.75F, 0F, 2F, 0.75F, -1F, 2F, 0.75F, -1F, -2F, 0.75F, 0F, -6F, -1.25F, 0F, 6F, -1.25F, -1F, 6F, -1.25F, -1F, -6F, -1.25F, 0F); // Box 32
		ammoModel[32].setRotationPoint(47F, 8F, 9F);

		ammoModel[33].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -7F, 0F, -1F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, -1F); // Box 33
		ammoModel[33].setRotationPoint(41F, 20F, 9F);

		ammoModel[34].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2F, 0F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, 7F, -0.75F, 0F, 7F, -0.75F, 0F, -7F, 0F, 0F); // Box 34
		ammoModel[34].setRotationPoint(42F, 20F, 9F);

		ammoModel[35].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,-1.75F, 0.5F, 0F, 2F, 0.75F, 0F, 2F, 0.75F, 0F, -1.75F, 0.5F, 0F, -6.75F, -0.65F, 0F, 7F, -1.25F, 0F, 7F, -1.25F, 0F, -6.75F, -0.65F, 0F); // Box 35
		ammoModel[35].setRotationPoint(45F, 20F, 9.5F);

		ammoModel[36].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,-2F, 0.75F, 0F, 2F, 1.25F, 0F, 2F, 1.25F, 0F, -2F, 0.75F, 0F, -7F, -1.25F, 0F, 7F, -2F, 0F, 7F, -2F, 0F, -7F, -1.25F, 0F); // Box 36
		ammoModel[36].setRotationPoint(47F, 20F, 9F);

		ammoModel[37].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 1.25F, 0F, 2F, 1.25F, -1F, 2F, 1.25F, -1F, -2F, 1.25F, 0F, -7F, -2F, 0F, 7F, -2.25F, -1F, 7F, -2.25F, -1F, -7F, -2F, 0F); // Box 37
		ammoModel[37].setRotationPoint(51F, 20F, 9F);

		ammoModel[38].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -8F, 0F, -1F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, -1F); // Box 38
		ammoModel[38].setRotationPoint(46F, 32F, 9F);

		ammoModel[39].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2F, 0F, 0F, 2F, 0.75F, 0F, 2F, 0.75F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, 8F, -0.75F, 0F, 8F, -0.75F, 0F, -8F, 0F, 0F); // Box 39
		ammoModel[39].setRotationPoint(47F, 32F, 9F);

		ammoModel[40].addShapeBox(0F, 0F, 0F, 2, 12, 10, 0F,-2F, 0.75F, 0F, 2F, 1.25F, 0F, 2F, 1.25F, 0F, -2F, 0.75F, 0F, -8F, -0.75F, 0F, 8F, -1.5F, 0F, 8F, -1.5F, 0F, -8F, -0.75F, 0F); // Box 40
		ammoModel[40].setRotationPoint(50F, 32F, 9F);

		ammoModel[41].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,-2F, 1.25F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -2F, 1.25F, 0F, -8F, -1.5F, 0F, 8F, -2.75F, 0F, 8F, -2.75F, 0F, -8F, -1.5F, 0F); // Box 41
		ammoModel[41].setRotationPoint(52F, 32F, 9F);

		ammoModel[42].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 2F, 0F, 2F, 2.25F, -1F, 2F, 2.25F, -1F, -2F, 2F, 0F, -8F, -2.75F, 0F, 8F, -3F, -1F, 8F, -3F, -1F, -8F, -2.75F, 0F); // Box 42
		ammoModel[42].setRotationPoint(56F, 32F, 9F);

		ammoModel[43].addShapeBox(0F, 0F, 0F, 9, 2, 12, 0F,0F, 0F, -1F, 0F, 2.75F, -1F, 0F, 2.75F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 1.5F, -2.75F, 0F, 1.5F, -2.75F, 0F, -1F, 0F, 0F); // Box 43
		ammoModel[43].setRotationPoint(55F, 44F, 8F);

		ammoModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F); // Box 44
		ammoModel[44].setRotationPoint(54F, 44F, 8F);

		ammoModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -0.25F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, -1F, -1.5F, 0.25F, 0F, 1.5F, 0F, -1F, 1.5F, 0F, -1F, -1.5F, 0.25F, 0F); // Box 45
		ammoModel[45].setRotationPoint(64F, 41F, 8F);

		ammoModel[46].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -5F, -0.5F, 0F, 5F, -0.75F, 0F, 5F, -0.75F, 0F, -5F, -0.5F, 0F); // Box 46
		ammoModel[46].setRotationPoint(40F, -4F, -19F);

		ammoModel[47].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 5F, -0.25F, 0F, 5F, -0.25F, 0F, -5F, 0F, 0F); // Box 47
		ammoModel[47].setRotationPoint(35F, -4F, -19F);

		ammoModel[48].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,-1.75F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1.75F, 0F, 0F, -4.75F, -0.25F, 0F, 5F, -0.5F, 0F, 5F, -0.5F, 0F, -4.75F, -0.25F, 0F); // Box 48
		ammoModel[48].setRotationPoint(38F, -4F, -18.5F);

		ammoModel[49].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -5F, 0F, -1F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, -1F); // Box 49
		ammoModel[49].setRotationPoint(34F, -4F, -19F);

		ammoModel[50].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, -5F, -0.75F, 0F, 5F, -0.75F, -1F, 5F, -0.75F, -1F, -5F, -0.75F, 0F); // Box 50
		ammoModel[50].setRotationPoint(44F, -4F, -19F);

		ammoModel[51].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0.75F, 0F, 2F, 0.75F, -1F, 2F, 0.75F, -1F, -2F, 0.75F, 0F, -6F, -1.25F, 0F, 6F, -1.25F, -1F, 6F, -1.25F, -1F, -6F, -1.25F, 0F); // Box 51
		ammoModel[51].setRotationPoint(47F, 8F, -19F);

		ammoModel[52].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,-2F, 0.5F, 0F, 2F, 0.75F, 0F, 2F, 0.75F, 0F, -2F, 0.5F, 0F, -6F, -0.75F, 0F, 6F, -1.25F, 0F, 6F, -1.25F, 0F, -6F, -0.75F, 0F); // Box 52
		ammoModel[52].setRotationPoint(43F, 8F, -19F);

		ammoModel[53].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,-1.75F, 0.25F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -1.75F, 0.25F, 0F, -5.75F, -0.5F, 0F, 6F, -0.75F, 0F, 6F, -0.75F, 0F, -5.75F, -0.5F, 0F); // Box 53
		ammoModel[53].setRotationPoint(41F, 8F, -18.5F);

		ammoModel[54].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2F, 0F, 0F, 2F, 0.25F, 0F, 2F, 0.25F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 6F, -0.5F, 0F, 6F, -0.5F, 0F, -6F, 0F, 0F); // Box 54
		ammoModel[54].setRotationPoint(38F, 8F, -19F);

		ammoModel[55].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -6F, 0F, -1F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, -1F); // Box 55
		ammoModel[55].setRotationPoint(37F, 8F, -19F);

		ammoModel[56].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -7F, 0F, -1F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, -1F); // Box 56
		ammoModel[56].setRotationPoint(41F, 20F, -19F);

		ammoModel[57].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2F, 0F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, 7F, -0.75F, 0F, 7F, -0.75F, 0F, -7F, 0F, 0F); // Box 57
		ammoModel[57].setRotationPoint(42F, 20F, -19F);

		ammoModel[58].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,-1.75F, 0.5F, 0F, 2F, 0.75F, 0F, 2F, 0.75F, 0F, -1.75F, 0.5F, 0F, -6.75F, -0.65F, 0F, 7F, -1.25F, 0F, 7F, -1.25F, 0F, -6.75F, -0.65F, 0F); // Box 58
		ammoModel[58].setRotationPoint(45F, 20F, -18.5F);

		ammoModel[59].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,-2F, 0.75F, 0F, 2F, 1.25F, 0F, 2F, 1.25F, 0F, -2F, 0.75F, 0F, -7F, -1.25F, 0F, 7F, -2F, 0F, 7F, -2F, 0F, -7F, -1.25F, 0F); // Box 59
		ammoModel[59].setRotationPoint(47F, 20F, -19F);

		ammoModel[60].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 1.25F, 0F, 2F, 1.25F, -1F, 2F, 1.25F, -1F, -2F, 1.25F, 0F, -7F, -2F, 0F, 7F, -2.25F, -1F, 7F, -2.25F, -1F, -7F, -2F, 0F); // Box 60
		ammoModel[60].setRotationPoint(51F, 20F, -19F);

		ammoModel[61].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 2F, 0F, 2F, 2.25F, -1F, 2F, 2.25F, -1F, -2F, 2F, 0F, -8F, -2.75F, 0F, 8F, -3F, -1F, 8F, -3F, -1F, -8F, -2.75F, 0F); // Box 61
		ammoModel[61].setRotationPoint(56F, 32F, -19F);

		ammoModel[62].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,-2F, 1.25F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -2F, 1.25F, 0F, -8F, -1.5F, 0F, 8F, -2.75F, 0F, 8F, -2.75F, 0F, -8F, -1.5F, 0F); // Box 62
		ammoModel[62].setRotationPoint(52F, 32F, -19F);

		ammoModel[63].addShapeBox(0F, 0F, 0F, 2, 12, 10, 0F,-2F, 0.75F, 0F, 2F, 1.25F, 0F, 2F, 1.25F, 0F, -2F, 0.75F, 0F, -8F, -0.75F, 0F, 8F, -1.5F, 0F, 8F, -1.5F, 0F, -8F, -0.75F, 0F); // Box 63
		ammoModel[63].setRotationPoint(50F, 32F, -19F);

		ammoModel[64].addShapeBox(0F, 0F, 0F, 3, 12, 10, 0F,-2F, 0F, 0F, 2F, 0.75F, 0F, 2F, 0.75F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, 8F, -0.75F, 0F, 8F, -0.75F, 0F, -8F, 0F, 0F); // Box 64
		ammoModel[64].setRotationPoint(47F, 32F, -19F);

		ammoModel[65].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-2F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -8F, 0F, -1F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, -1F); // Box 65
		ammoModel[65].setRotationPoint(46F, 32F, -19F);

		ammoModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F); // Box 66
		ammoModel[66].setRotationPoint(54F, 44F, -20F);

		ammoModel[67].addShapeBox(0F, 0F, 0F, 9, 2, 12, 0F,0F, 0F, -1F, 0F, 2.75F, -1F, 0F, 2.75F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 1.5F, -2.75F, 0F, 1.5F, -2.75F, 0F, -1F, 0F, 0F); // Box 67
		ammoModel[67].setRotationPoint(55F, 44F, -20F);

		ammoModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -0.25F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, -1F, -1.5F, 0.25F, 0F, 1.5F, 0F, -1F, 1.5F, 0F, -1F, -1.5F, 0.25F, 0F); // Box 68
		ammoModel[68].setRotationPoint(64F, 41F, -20F);
	}
}