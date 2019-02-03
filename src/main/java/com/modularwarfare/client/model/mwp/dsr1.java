//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: dsr1
// Model Creator: 
// Created on: 31.01.2019 - 11:22:54
// Last changed on: 31.01.2019 - 11:22:54

package com.modularwarfare.client.model.mwp; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class dsr1 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public dsr1() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[519];
		defaultScopeModel = new ModelRendererTurbo[101];
		ammoModel = new ModelRendererTurbo[16];
		pumpModel = new ModelRendererTurbo[23];
		triggerModel = new ModelRendererTurbo[6];

		initgunModel_1();
		initgunModel_2();
		initdefaultScopeModel_1();
		initammoModel_1();
		initpumpModel_1();
		inittriggerModel_1();

		modelScale = 0.09F;
		translateAll(0F, -13F, 0F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.05F, 0F);//forward/up/?
		rightHandBolt = true;

		gunSlideDistance = 0F;
		reloadAnimation = WeaponAnimations.RIFLE3;
		rotateHipPosition = new Vector3f(0F, 05F, 0F);
		translateHipPosition = new Vector3f(0.15F, 0.0F, -0.05F);
		rotateGunVertical = 45F;
		rotateGunHorizontal = 1F;
		tiltGun = 25F;
		/*tiltGunTime = 0.20F;
		unloadClipTime = 0.30F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.15F;*/
		translateGun = new Vector3f(7 /16F, 1F /16F, -2F /16F);
		rotateClipVertical = 1F;
		rotateClipHorizontal = 1F;
		tiltClip = 28F;
		translateClip = new Vector3f(-4 /16F, -30F /16F, 1F /16F);

		hasFlash = false;
        
		boltRotationPoint = new Vector3f(0, -0.25F, 0);
		boltRotation = -90F;
		chargeModifier = new Vector3f (1.0F, -1.0F, 0.0F);
		
        leftArmPos = new Vector3f(0.0F, -0.05F, -0.30F);
        leftArmRot = new Vector3f(0.0F, -25.0F, -60.0F);
        leftArmReloadPos = new Vector3f(-0.77F, -0.47F, -0.53F);
        leftArmReloadRot = new Vector3f(0.0F, -45.0F, -40.0F);


        rightArmPos = new Vector3f(-0.62F, -0.19F, 0.20F);
        rightArmRot = new Vector3f(10.0F, 20.0F, -90.0F);
        rightArmReloadPos = new Vector3f(-0.65F, -0.2F, 0.205F);
        rightArmReloadRot = new Vector3f(10.0F, 20.0F, -90.0F);
        rightArmChargePos = new Vector3f(-0.49F, -0.14F, 0.15F);
        rightArmChargeRot = new Vector3f(-0.0F, 0.0F, -70.0F);
        
        rightArmScale = new Vector3f(0.60F, 1.0F, 0.60F);
        leftArmScale = new Vector3f(0.60F, 1.0F, 0.60F);
 
        leftHandAmmo = true;
        
		//RecoilSlideDistance = 0.16F;
		//RotateSlideDistance = -1F;

		pumpDelayAfterReload = 50;
		pumpDelay = 10;
		pumpTime = 34;
		gripIsOnPump = false;
		pumpHandleDistance = 0.50F;
		
		crouchZoom = -0.25F;
		fancyStance = true;
		sprintRotate = new Vector3f(-10.0F, 40.0F, 15.0F);
		sprintTranslate = new Vector3f(1.3F, -0.05F, -0.7F);
		
		casingAttachPoint = new Vector3f(15F /16F, 45F /16F, 0.05F /16F);
		casingAnimDistance = new Vector3f(3, 1, 12);
	    casingAnimSpread = new Vector3f(2, 2, 0);
	    casingAnimTime = 6;
	    casingDelay = 12;
	    casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);
	    //caseScale = 1.0F;


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox1
		gunModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import ImportBox2
		gunModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import ImportBox2
		gunModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import ImportBox2
		gunModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportBox1
		gunModel[5] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import ImportBox2
		gunModel[6] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import ImportBox2
		gunModel[7] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import ImportBox2
		gunModel[8] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import ImportBox2
		gunModel[9] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import ImportBox2
		gunModel[10] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import ImportBox2
		gunModel[11] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import ImportBox2
		gunModel[12] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import ImportBox1
		gunModel[13] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import ImportBox1
		gunModel[14] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Import ImportBox1
		gunModel[15] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import ImportBox1
		gunModel[16] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import ImportBox1
		gunModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox1
		gunModel[18] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import ImportBox1
		gunModel[19] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import ImportBox1
		gunModel[20] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import ImportBox1
		gunModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportBox1
		gunModel[22] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import ImportBox1
		gunModel[23] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Import ImportBox1
		gunModel[24] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Import ImportBox1
		gunModel[25] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import ImportBox1
		gunModel[26] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Import ImportBox1
		gunModel[27] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Import ImportBox1
		gunModel[28] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Import ImportBox1
		gunModel[29] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Import ImportBox8
		gunModel[30] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Import ImportBox8
		gunModel[31] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Import ImportBox8
		gunModel[32] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Import ImportBox8
		gunModel[33] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Import ImportBox8
		gunModel[34] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Import ImportBox8
		gunModel[35] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Import ImportBox8
		gunModel[36] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Import ImportBox8
		gunModel[37] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import ImportBox8
		gunModel[38] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Import ImportBox8
		gunModel[39] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Import ImportBox8
		gunModel[40] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Import ImportBox8
		gunModel[41] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Import ImportBox8
		gunModel[42] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Import ImportBox8
		gunModel[43] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Import ImportBox8
		gunModel[44] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Import ImportBox8
		gunModel[45] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import ImportBox8
		gunModel[46] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Import ImportBox8
		gunModel[47] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Import ImportBox8
		gunModel[48] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import ImportBox8
		gunModel[49] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Import ImportBox8
		gunModel[50] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Import ImportBox8
		gunModel[51] = new ModelRendererTurbo(this, 801, 49, textureX, textureY); // Import ImportBox8
		gunModel[52] = new ModelRendererTurbo(this, 865, 49, textureX, textureY); // Import ImportBox8
		gunModel[53] = new ModelRendererTurbo(this, 905, 49, textureX, textureY); // Import ImportBox8
		gunModel[54] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Import ImportBox8
		gunModel[55] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Import ImportBox8
		gunModel[56] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import ImportBox8
		gunModel[57] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Import ImportBox8
		gunModel[58] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import ImportBox8
		gunModel[59] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Import ImportBox8
		gunModel[60] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Import ImportBox8
		gunModel[61] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import ImportBox8
		gunModel[62] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import ImportBox8
		gunModel[63] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Import ImportBox8
		gunModel[64] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import ImportBox8
		gunModel[65] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import ImportBox8
		gunModel[66] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Import ImportBox8
		gunModel[67] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Import ImportBox8
		gunModel[68] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Import ImportBox8
		gunModel[69] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import ImportBox8
		gunModel[70] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Import ImportBox8
		gunModel[71] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Import ImportBox8
		gunModel[72] = new ModelRendererTurbo(this, 625, 57, textureX, textureY); // Import ImportBox8
		gunModel[73] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Import ImportBox8
		gunModel[74] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Import ImportBox8
		gunModel[75] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Import ImportBox8
		gunModel[76] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Import ImportBox8
		gunModel[77] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import ImportBox8
		gunModel[78] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Import ImportBox8
		gunModel[79] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Import ImportBox8
		gunModel[80] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Import ImportBox8
		gunModel[81] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Import ImportBox8
		gunModel[82] = new ModelRendererTurbo(this, 889, 57, textureX, textureY); // Import ImportBox8
		gunModel[83] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Import ImportBox8
		gunModel[84] = new ModelRendererTurbo(this, 929, 57, textureX, textureY); // Import ImportBox8
		gunModel[85] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import ImportBox8
		gunModel[86] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import ImportBox1
		gunModel[87] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Import ImportBox1
		gunModel[88] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Import ImportBox1
		gunModel[89] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Import ImportBox1
		gunModel[90] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Import ImportBox1
		gunModel[91] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Import ImportBox1
		gunModel[92] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Import ImportBox16
		gunModel[93] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Import ImportBox8
		gunModel[94] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Import ImportBox8
		gunModel[95] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Import ImportBox8
		gunModel[96] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import ImportBox8
		gunModel[97] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import ImportBox1
		gunModel[98] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Import ImportBox1
		gunModel[99] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Import ImportBox1
		gunModel[100] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Import ImportBox1
		gunModel[101] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Import ImportBox1
		gunModel[102] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Import ImportBox1
		gunModel[103] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Import ImportBox8
		gunModel[104] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Import ImportBox8
		gunModel[105] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Import ImportBox8
		gunModel[106] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Import ImportBox8
		gunModel[107] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Import ImportBox31
		gunModel[108] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Import ImportBox0
		gunModel[109] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Import ImportBox1
		gunModel[110] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Import ImportBox2
		gunModel[111] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Import ImportBox31
		gunModel[112] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Import ImportBox31
		gunModel[113] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Import ImportBox31
		gunModel[114] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Import ImportBox31
		gunModel[115] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Import ImportBox31
		gunModel[116] = new ModelRendererTurbo(this, 769, 73, textureX, textureY); // Import ImportBox31
		gunModel[117] = new ModelRendererTurbo(this, 801, 73, textureX, textureY); // Import ImportBox31
		gunModel[118] = new ModelRendererTurbo(this, 849, 73, textureX, textureY); // Import ImportBox31
		gunModel[119] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import ImportBox31
		gunModel[120] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Import ImportBox31
		gunModel[121] = new ModelRendererTurbo(this, 769, 97, textureX, textureY); // Import ImportBox31
		gunModel[122] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import ImportBox31
		gunModel[123] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Import ImportBox31
		gunModel[124] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import ImportBox31
		gunModel[125] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Import ImportBox31
		gunModel[126] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Import ImportBox31
		gunModel[127] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Import ImportBox31
		gunModel[128] = new ModelRendererTurbo(this, 785, 81, textureX, textureY); // Import ImportBox31
		gunModel[129] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Import ImportBox31
		gunModel[130] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Import ImportBox31
		gunModel[131] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Import ImportBox31
		gunModel[132] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Import ImportBox31
		gunModel[133] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Import ImportBox31
		gunModel[134] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Import ImportBox31
		gunModel[135] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Import ImportBox31
		gunModel[136] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Import ImportBox31
		gunModel[137] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Import ImportBox31
		gunModel[138] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Import ImportBox31
		gunModel[139] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Import ImportBox31
		gunModel[140] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Import ImportBox31
		gunModel[141] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Import ImportBox31
		gunModel[142] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Import ImportBox31
		gunModel[143] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Import ImportBox31
		gunModel[144] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Import ImportBox31
		gunModel[145] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Import ImportBox31
		gunModel[146] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Import ImportBox31
		gunModel[147] = new ModelRendererTurbo(this, 673, 105, textureX, textureY); // Import ImportBox31
		gunModel[148] = new ModelRendererTurbo(this, 625, 89, textureX, textureY); // Import ImportBox31
		gunModel[149] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import ImportBox1
		gunModel[150] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Import ImportBox1
		gunModel[151] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import ImportBox1
		gunModel[152] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import ImportBox1
		gunModel[153] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Import ImportBox1
		gunModel[154] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Import ImportBox1
		gunModel[155] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Import ImportBox1
		gunModel[156] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Import ImportBox1
		gunModel[157] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Import ImportBox1
		gunModel[158] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Import ImportBox1
		gunModel[159] = new ModelRendererTurbo(this, 721, 105, textureX, textureY); // Import ImportBox31
		gunModel[160] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Import ImportBox31
		gunModel[161] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Import ImportBox31
		gunModel[162] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Import ImportBox31
		gunModel[163] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Import ImportBox31
		gunModel[164] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Import ImportBox31
		gunModel[165] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Import ImportBox31
		gunModel[166] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Import ImportBox31
		gunModel[167] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Import ImportBox31
		gunModel[168] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Import ImportBox31
		gunModel[169] = new ModelRendererTurbo(this, 737, 113, textureX, textureY); // Import ImportBox31
		gunModel[170] = new ModelRendererTurbo(this, 865, 113, textureX, textureY); // Import ImportBox31
		gunModel[171] = new ModelRendererTurbo(this, 897, 113, textureX, textureY); // Import ImportBox31
		gunModel[172] = new ModelRendererTurbo(this, 929, 113, textureX, textureY); // Import ImportBox31
		gunModel[173] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import ImportBox31
		gunModel[174] = new ModelRendererTurbo(this, 993, 113, textureX, textureY); // Import ImportBox31
		gunModel[175] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Import ImportBox31
		gunModel[176] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Import ImportBox31
		gunModel[177] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Import ImportBox31
		gunModel[178] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Import ImportBox31
		gunModel[179] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Import ImportBox31
		gunModel[180] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Import ImportBox31
		gunModel[181] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Import ImportBox31
		gunModel[182] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Import ImportBox31
		gunModel[183] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Import ImportBox31
		gunModel[184] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Import ImportBox31
		gunModel[185] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Import ImportBox31
		gunModel[186] = new ModelRendererTurbo(this, 553, 121, textureX, textureY); // Import ImportBox31
		gunModel[187] = new ModelRendererTurbo(this, 585, 121, textureX, textureY); // Import ImportBox31
		gunModel[188] = new ModelRendererTurbo(this, 665, 121, textureX, textureY); // Import ImportBox31
		gunModel[189] = new ModelRendererTurbo(this, 697, 121, textureX, textureY); // Import ImportBox31
		gunModel[190] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Import ImportBox31
		gunModel[191] = new ModelRendererTurbo(this, 881, 121, textureX, textureY); // Import ImportBox31
		gunModel[192] = new ModelRendererTurbo(this, 913, 121, textureX, textureY); // Import ImportBox31
		gunModel[193] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Import ImportBox31
		gunModel[194] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Import ImportBox31
		gunModel[195] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Import ImportBox31
		gunModel[196] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Import ImportBox31
		gunModel[197] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Import ImportBox31
		gunModel[198] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Import ImportBox31
		gunModel[199] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Import ImportBox31
		gunModel[200] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Import ImportBox31
		gunModel[201] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Import ImportBox31
		gunModel[202] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Import ImportBox31
		gunModel[203] = new ModelRendererTurbo(this, 569, 129, textureX, textureY); // Import ImportBox31
		gunModel[204] = new ModelRendererTurbo(this, 601, 129, textureX, textureY); // Import ImportBox31
		gunModel[205] = new ModelRendererTurbo(this, 633, 129, textureX, textureY); // Import ImportBox31
		gunModel[206] = new ModelRendererTurbo(this, 713, 129, textureX, textureY); // Import ImportBox31
		gunModel[207] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Import ImportBox31
		gunModel[208] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Import ImportBox31
		gunModel[209] = new ModelRendererTurbo(this, 817, 129, textureX, textureY); // Import ImportBox31
		gunModel[210] = new ModelRendererTurbo(this, 849, 129, textureX, textureY); // Import ImportBox31
		gunModel[211] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import ImportBox31
		gunModel[212] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Import ImportBox1
		gunModel[213] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Import ImportBox1
		gunModel[214] = new ModelRendererTurbo(this, 937, 129, textureX, textureY); // Import ImportBox1
		gunModel[215] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Import ImportBox1
		gunModel[216] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Import ImportBox1
		gunModel[217] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Import ImportBox1
		gunModel[218] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import ImportBox1
		gunModel[219] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import ImportBox1
		gunModel[220] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Import ImportBox1
		gunModel[221] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Import ImportBox1
		gunModel[222] = new ModelRendererTurbo(this, 705, 145, textureX, textureY); // Import ImportBox1
		gunModel[223] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Import ImportBox1
		gunModel[224] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Import ImportBox1
		gunModel[225] = new ModelRendererTurbo(this, 673, 153, textureX, textureY); // Import ImportBox1
		gunModel[226] = new ModelRendererTurbo(this, 961, 137, textureX, textureY); // Import ImportBox31
		gunModel[227] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Import ImportBox31
		gunModel[228] = new ModelRendererTurbo(this, 921, 137, textureX, textureY); // Import ImportBox31
		gunModel[229] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Import ImportBox31
		gunModel[230] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Import ImportBox31
		gunModel[231] = new ModelRendererTurbo(this, 937, 153, textureX, textureY); // Import ImportBox31
		gunModel[232] = new ModelRendererTurbo(this, 905, 153, textureX, textureY); // Import ImportBox31
		gunModel[233] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import ImportBox31
		gunModel[234] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Import ImportBox31
		gunModel[235] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import ImportBox31
		gunModel[236] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import ImportBox31
		gunModel[237] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import ImportBox31
		gunModel[238] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import ImportBox31
		gunModel[239] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Import ImportBox31
		gunModel[240] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Import ImportBox31
		gunModel[241] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Import ImportBox31
		gunModel[242] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Import ImportBox31
		gunModel[243] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Import ImportBox1
		gunModel[244] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Import ImportBox1
		gunModel[245] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Import ImportBox1
		gunModel[246] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Import ImportBox1
		gunModel[247] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Import ImportBox1
		gunModel[248] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Import ImportBox1
		gunModel[249] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Import ImportBox1
		gunModel[250] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Import ImportBox1
		gunModel[251] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Import ImportBox1
		gunModel[252] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Import ImportBox1
		gunModel[253] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Import ImportBox1
		gunModel[254] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Import ImportBox1
		gunModel[255] = new ModelRendererTurbo(this, 689, 161, textureX, textureY); // Import ImportBox1
		gunModel[256] = new ModelRendererTurbo(this, 745, 161, textureX, textureY); // Import ImportBox1
		gunModel[257] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import ImportBox1
		gunModel[258] = new ModelRendererTurbo(this, 897, 129, textureX, textureY); // Import ImportBox1
		gunModel[259] = new ModelRendererTurbo(this, 673, 161, textureX, textureY); // Import ImportBox1
		gunModel[260] = new ModelRendererTurbo(this, 793, 177, textureX, textureY); // Import ImportBox1
		gunModel[261] = new ModelRendererTurbo(this, 961, 169, textureX, textureY); // Import ImportBox1
		gunModel[262] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Import ImportBox1
		gunModel[263] = new ModelRendererTurbo(this, 721, 161, textureX, textureY); // Import ImportBox1
		gunModel[264] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import ImportBox1
		gunModel[265] = new ModelRendererTurbo(this, 777, 161, textureX, textureY); // Import ImportBox1
		gunModel[266] = new ModelRendererTurbo(this, 809, 161, textureX, textureY); // Import ImportBox1
		gunModel[267] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Import ImportBox1
		gunModel[268] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Import ImportBox1
		gunModel[269] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Import ImportBox1
		gunModel[270] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Import ImportBox1
		gunModel[271] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Import ImportBox1
		gunModel[272] = new ModelRendererTurbo(this, 929, 177, textureX, textureY); // Import ImportBox1
		gunModel[273] = new ModelRendererTurbo(this, 345, 185, textureX, textureY); // Import ImportBox1
		gunModel[274] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Import ImportBox1
		gunModel[275] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Import ImportBox1
		gunModel[276] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Import ImportBox1
		gunModel[277] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Import ImportBox1
		gunModel[278] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Import ImportBox1
		gunModel[279] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Import ImportBox1
		gunModel[280] = new ModelRendererTurbo(this, 833, 161, textureX, textureY); // Import ImportBox1
		gunModel[281] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Import ImportBox1
		gunModel[282] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Import ImportBox1
		gunModel[283] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Import ImportBox1
		gunModel[284] = new ModelRendererTurbo(this, 585, 185, textureX, textureY); // Import ImportBox1
		gunModel[285] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Import ImportBox1
		gunModel[286] = new ModelRendererTurbo(this, 641, 185, textureX, textureY); // Import ImportBox1
		gunModel[287] = new ModelRendererTurbo(this, 697, 185, textureX, textureY); // Import ImportBox1
		gunModel[288] = new ModelRendererTurbo(this, 721, 185, textureX, textureY); // Import ImportBox1
		gunModel[289] = new ModelRendererTurbo(this, 961, 81, textureX, textureY); // Import ImportBox1
		gunModel[290] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Import ImportBox1
		gunModel[291] = new ModelRendererTurbo(this, 761, 185, textureX, textureY); // Import ImportBox1
		gunModel[292] = new ModelRendererTurbo(this, 617, 129, textureX, textureY); // Import ImportBox1
		gunModel[293] = new ModelRendererTurbo(this, 649, 129, textureX, textureY); // Import ImportBox1
		gunModel[294] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import ImportBox1
		gunModel[295] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import ImportBox1
		gunModel[296] = new ModelRendererTurbo(this, 793, 193, textureX, textureY); // Import ImportBox1
		gunModel[297] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Import ImportBox1
		gunModel[298] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Import ImportBox1
		gunModel[299] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Import ImportBox1
		gunModel[300] = new ModelRendererTurbo(this, 585, 209, textureX, textureY); // Import ImportBox1
		gunModel[301] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Import ImportBox1
		gunModel[302] = new ModelRendererTurbo(this, 689, 209, textureX, textureY); // Import ImportBox1
		gunModel[303] = new ModelRendererTurbo(this, 793, 209, textureX, textureY); // Import ImportBox1
		gunModel[304] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Import ImportBox1
		gunModel[305] = new ModelRendererTurbo(this, 961, 193, textureX, textureY); // Import ImportBox1
		gunModel[306] = new ModelRendererTurbo(this, 961, 209, textureX, textureY); // Import ImportBox1
		gunModel[307] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import ImportBox1
		gunModel[308] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import ImportBox1
		gunModel[309] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Import ImportBox1
		gunModel[310] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import ImportBox1
		gunModel[311] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Import ImportBox1
		gunModel[312] = new ModelRendererTurbo(this, 833, 129, textureX, textureY); // Import ImportBox1
		gunModel[313] = new ModelRendererTurbo(this, 897, 193, textureX, textureY); // Import ImportBox1
		gunModel[314] = new ModelRendererTurbo(this, 889, 209, textureX, textureY); // Import ImportBox1
		gunModel[315] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Import ImportBox1
		gunModel[316] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Import ImportBox1
		gunModel[317] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Import ImportBox1
		gunModel[318] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Import ImportBox1
		gunModel[319] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Import ImportBox1
		gunModel[320] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Import ImportBox1
		gunModel[321] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Import ImportBox1
		gunModel[322] = new ModelRendererTurbo(this, 337, 225, textureX, textureY); // Import ImportBox1
		gunModel[323] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Import ImportBox1
		gunModel[324] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Import ImportBox1
		gunModel[325] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Import ImportBox1
		gunModel[326] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Import ImportBox1
		gunModel[327] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Import ImportBox1
		gunModel[328] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Import ImportBox1
		gunModel[329] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Import ImportBox1
		gunModel[330] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import ImportBox1
		gunModel[331] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Import ImportBox1
		gunModel[332] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Import ImportBox1
		gunModel[333] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Import ImportBox1
		gunModel[334] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Import ImportBox1
		gunModel[335] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Import ImportBox1
		gunModel[336] = new ModelRendererTurbo(this, 561, 225, textureX, textureY); // Import ImportBox1
		gunModel[337] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Import ImportBox1
		gunModel[338] = new ModelRendererTurbo(this, 617, 225, textureX, textureY); // Import ImportBox1
		gunModel[339] = new ModelRendererTurbo(this, 793, 225, textureX, textureY); // Import ImportBox1
		gunModel[340] = new ModelRendererTurbo(this, 689, 233, textureX, textureY); // Import ImportBox1
		gunModel[341] = new ModelRendererTurbo(this, 953, 225, textureX, textureY); // Import ImportBox1
		gunModel[342] = new ModelRendererTurbo(this, 985, 225, textureX, textureY); // Import ImportBox1
		gunModel[343] = new ModelRendererTurbo(this, 641, 57, textureX, textureY); // Import ImportBox1
		gunModel[344] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import ImportBox1
		gunModel[345] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Import ImportBox1
		gunModel[346] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportBox1
		gunModel[347] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import ImportBox1
		gunModel[348] = new ModelRendererTurbo(this, 857, 233, textureX, textureY); // Import ImportBox8
		gunModel[349] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Import ImportBox8
		gunModel[350] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import ImportBox8
		gunModel[351] = new ModelRendererTurbo(this, 921, 169, textureX, textureY); // Import ImportBox8
		gunModel[352] = new ModelRendererTurbo(this, 33, 241, textureX, textureY); // Import ImportBox8
		gunModel[353] = new ModelRendererTurbo(this, 57, 241, textureX, textureY); // Import ImportBox8
		gunModel[354] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Import ImportBox8
		gunModel[355] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Import ImportBox8
		gunModel[356] = new ModelRendererTurbo(this, 177, 241, textureX, textureY); // Import ImportBox8
		gunModel[357] = new ModelRendererTurbo(this, 209, 241, textureX, textureY); // Import ImportBox8
		gunModel[358] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Import ImportBox8
		gunModel[359] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Import ImportBox8
		gunModel[360] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Import ImportBox1
		gunModel[361] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import ImportBox1
		gunModel[362] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import ImportBox1
		gunModel[363] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import ImportBox1
		gunModel[364] = new ModelRendererTurbo(this, 361, 241, textureX, textureY); // Import ImportBox1
		gunModel[365] = new ModelRendererTurbo(this, 697, 241, textureX, textureY); // Import ImportBox1
		gunModel[366] = new ModelRendererTurbo(this, 889, 49, textureX, textureY); // Import ImportBox1
		gunModel[367] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Import ImportBox1
		gunModel[368] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Import ImportBox1
		gunModel[369] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import ImportBox1
		gunModel[370] = new ModelRendererTurbo(this, 745, 241, textureX, textureY); // Import ImportBox1
		gunModel[371] = new ModelRendererTurbo(this, 865, 129, textureX, textureY); // Import ImportBox1
		gunModel[372] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); // Import ImportBox1
		gunModel[373] = new ModelRendererTurbo(this, 681, 185, textureX, textureY); // Import ImportBox1
		gunModel[374] = new ModelRendererTurbo(this, 417, 241, textureX, textureY); // Import ImportBox1
		gunModel[375] = new ModelRendererTurbo(this, 553, 241, textureX, textureY); // Import ImportBox1
		gunModel[376] = new ModelRendererTurbo(this, 785, 241, textureX, textureY); // Import ImportBox1
		gunModel[377] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Import ImportBox1
		gunModel[378] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Import ImportBox1
		gunModel[379] = new ModelRendererTurbo(this, 681, 201, textureX, textureY); // Import ImportBox1
		gunModel[380] = new ModelRendererTurbo(this, 801, 241, textureX, textureY); // Import ImportBox1
		gunModel[381] = new ModelRendererTurbo(this, 817, 241, textureX, textureY); // Import ImportBox1
		gunModel[382] = new ModelRendererTurbo(this, 833, 241, textureX, textureY); // Import ImportBox1
		gunModel[383] = new ModelRendererTurbo(this, 945, 241, textureX, textureY); // Import ImportBox1
		gunModel[384] = new ModelRendererTurbo(this, 961, 241, textureX, textureY); // Import ImportBox1
		gunModel[385] = new ModelRendererTurbo(this, 977, 241, textureX, textureY); // Import ImportBox1
		gunModel[386] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import ImportBox1
		gunModel[387] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Import ImportBox1
		gunModel[388] = new ModelRendererTurbo(this, 993, 241, textureX, textureY); // Import ImportBox1
		gunModel[389] = new ModelRendererTurbo(this, 1009, 241, textureX, textureY); // Import ImportBox1
		gunModel[390] = new ModelRendererTurbo(this, 289, 249, textureX, textureY); // Import ImportBox1
		gunModel[391] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Import ImportBox1
		gunModel[392] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Import ImportBox1
		gunModel[393] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Import ImportBox1
		gunModel[394] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Import ImportBox1
		gunModel[395] = new ModelRendererTurbo(this, 465, 249, textureX, textureY); // Import ImportBox1
		gunModel[396] = new ModelRendererTurbo(this, 481, 249, textureX, textureY); // Import ImportBox1
		gunModel[397] = new ModelRendererTurbo(this, 569, 249, textureX, textureY); // Import ImportBox1
		gunModel[398] = new ModelRendererTurbo(this, 601, 249, textureX, textureY); // Import ImportBox1
		gunModel[399] = new ModelRendererTurbo(this, 633, 249, textureX, textureY); // Import ImportBox1
		gunModel[400] = new ModelRendererTurbo(this, 665, 249, textureX, textureY); // Import ImportBox1
		gunModel[401] = new ModelRendererTurbo(this, 681, 249, textureX, textureY); // Import ImportBox1
		gunModel[402] = new ModelRendererTurbo(this, 25, 257, textureX, textureY); // Import ImportBox1
		gunModel[403] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import ImportBox1
		gunModel[404] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Import ImportBox1
		gunModel[405] = new ModelRendererTurbo(this, 905, 209, textureX, textureY); // Import ImportBox1
		gunModel[406] = new ModelRendererTurbo(this, 33, 257, textureX, textureY); // Import ImportBox1
		gunModel[407] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Import Box430
		gunModel[408] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Import Box431
		gunModel[409] = new ModelRendererTurbo(this, 465, 297, textureX, textureY); // Import Box436
		gunModel[410] = new ModelRendererTurbo(this, 809, 329, textureX, textureY); // Import Box437
		gunModel[411] = new ModelRendererTurbo(this, 857, 329, textureX, textureY); // Import Box440
		gunModel[412] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Import Box441
		gunModel[413] = new ModelRendererTurbo(this, 481, 337, textureX, textureY); // Import Box446
		gunModel[414] = new ModelRendererTurbo(this, 817, 337, textureX, textureY); // Import Box447
		gunModel[415] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Import Box128
		gunModel[416] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Import Box133
		gunModel[417] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box134
		gunModel[418] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Import Box135
		gunModel[419] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Import Box136
		gunModel[420] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Import Box137
		gunModel[421] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Import Box148
		gunModel[422] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Import Box149
		gunModel[423] = new ModelRendererTurbo(this, 785, 57, textureX, textureY); // Box 0
		gunModel[424] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 1
		gunModel[425] = new ModelRendererTurbo(this, 953, 329, textureX, textureY); // Box 12
		gunModel[426] = new ModelRendererTurbo(this, 985, 329, textureX, textureY); // Box 13
		gunModel[427] = new ModelRendererTurbo(this, 521, 337, textureX, textureY); // Box 14
		gunModel[428] = new ModelRendererTurbo(this, 865, 337, textureX, textureY); // Box 15
		gunModel[429] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 16
		gunModel[430] = new ModelRendererTurbo(this, 169, 345, textureX, textureY); // Box 17
		gunModel[431] = new ModelRendererTurbo(this, 209, 345, textureX, textureY); // Box 18
		gunModel[432] = new ModelRendererTurbo(this, 289, 345, textureX, textureY); // Box 19
		gunModel[433] = new ModelRendererTurbo(this, 233, 345, textureX, textureY); // Box 20
		gunModel[434] = new ModelRendererTurbo(this, 369, 345, textureX, textureY); // Box 21
		gunModel[435] = new ModelRendererTurbo(this, 441, 345, textureX, textureY); // Box 22
		gunModel[436] = new ModelRendererTurbo(this, 753, 337, textureX, textureY); // Box 23
		gunModel[437] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 24
		gunModel[438] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 25
		gunModel[439] = new ModelRendererTurbo(this, 497, 345, textureX, textureY); // Box 26
		gunModel[440] = new ModelRendererTurbo(this, 569, 345, textureX, textureY); // Box 27
		gunModel[441] = new ModelRendererTurbo(this, 609, 345, textureX, textureY); // Box 28
		gunModel[442] = new ModelRendererTurbo(this, 649, 345, textureX, textureY); // Box 29
		gunModel[443] = new ModelRendererTurbo(this, 689, 345, textureX, textureY); // Box 30
		gunModel[444] = new ModelRendererTurbo(this, 729, 345, textureX, textureY); // Box 31
		gunModel[445] = new ModelRendererTurbo(this, 777, 345, textureX, textureY); // Box 32
		gunModel[446] = new ModelRendererTurbo(this, 817, 345, textureX, textureY); // Box 33
		gunModel[447] = new ModelRendererTurbo(this, 833, 345, textureX, textureY); // Box 34
		gunModel[448] = new ModelRendererTurbo(this, 889, 345, textureX, textureY); // Box 35
		gunModel[449] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 36
		gunModel[450] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Box 37
		gunModel[451] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Box 38
		gunModel[452] = new ModelRendererTurbo(this, 425, 345, textureX, textureY); // Box 39
		gunModel[453] = new ModelRendererTurbo(this, 593, 345, textureX, textureY); // Box 40
		gunModel[454] = new ModelRendererTurbo(this, 633, 345, textureX, textureY); // Box 41
		gunModel[455] = new ModelRendererTurbo(this, 673, 345, textureX, textureY); // Box 42
		gunModel[456] = new ModelRendererTurbo(this, 713, 345, textureX, textureY); // Box 43
		gunModel[457] = new ModelRendererTurbo(this, 801, 345, textureX, textureY); // Box 44
		gunModel[458] = new ModelRendererTurbo(this, 921, 345, textureX, textureY); // Box 45
		gunModel[459] = new ModelRendererTurbo(this, 945, 345, textureX, textureY); // Box 46
		gunModel[460] = new ModelRendererTurbo(this, 969, 345, textureX, textureY); // Box 47
		gunModel[461] = new ModelRendererTurbo(this, 993, 345, textureX, textureY); // Box 48
		gunModel[462] = new ModelRendererTurbo(this, 33, 353, textureX, textureY); // Box 49
		gunModel[463] = new ModelRendererTurbo(this, 57, 353, textureX, textureY); // Box 50
		gunModel[464] = new ModelRendererTurbo(this, 81, 353, textureX, textureY); // Box 51
		gunModel[465] = new ModelRendererTurbo(this, 529, 353, textureX, textureY); // Box 52
		gunModel[466] = new ModelRendererTurbo(this, 553, 353, textureX, textureY); // Box 53
		gunModel[467] = new ModelRendererTurbo(this, 761, 353, textureX, textureY); // Box 54
		gunModel[468] = new ModelRendererTurbo(this, 865, 353, textureX, textureY); // Box 55
		gunModel[469] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 56
		gunModel[470] = new ModelRendererTurbo(this, 97, 361, textureX, textureY); // Box 57
		gunModel[471] = new ModelRendererTurbo(this, 121, 361, textureX, textureY); // Box 58
		gunModel[472] = new ModelRendererTurbo(this, 145, 361, textureX, textureY); // Box 59
		gunModel[473] = new ModelRendererTurbo(this, 169, 361, textureX, textureY); // Box 60
		gunModel[474] = new ModelRendererTurbo(this, 193, 361, textureX, textureY); // Box 61
		gunModel[475] = new ModelRendererTurbo(this, 217, 361, textureX, textureY); // Box 62
		gunModel[476] = new ModelRendererTurbo(this, 273, 361, textureX, textureY); // Box 63
		gunModel[477] = new ModelRendererTurbo(this, 353, 361, textureX, textureY); // Box 64
		gunModel[478] = new ModelRendererTurbo(this, 505, 361, textureX, textureY); // Box 65
		gunModel[479] = new ModelRendererTurbo(this, 569, 361, textureX, textureY); // Box 66
		gunModel[480] = new ModelRendererTurbo(this, 593, 361, textureX, textureY); // Box 67
		gunModel[481] = new ModelRendererTurbo(this, 617, 361, textureX, textureY); // Box 68
		gunModel[482] = new ModelRendererTurbo(this, 641, 361, textureX, textureY); // Box 69
		gunModel[483] = new ModelRendererTurbo(this, 665, 361, textureX, textureY); // Box 70
		gunModel[484] = new ModelRendererTurbo(this, 689, 361, textureX, textureY); // Box 71
		gunModel[485] = new ModelRendererTurbo(this, 369, 369, textureX, textureY); // Box 72
		gunModel[486] = new ModelRendererTurbo(this, 705, 369, textureX, textureY); // Box 73
		gunModel[487] = new ModelRendererTurbo(this, 793, 369, textureX, textureY); // Box 74
		gunModel[488] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 75
		gunModel[489] = new ModelRendererTurbo(this, 977, 361, textureX, textureY); // Box 76
		gunModel[490] = new ModelRendererTurbo(this, 1001, 361, textureX, textureY); // Box 77
		gunModel[491] = new ModelRendererTurbo(this, 233, 369, textureX, textureY); // Box 78
		gunModel[492] = new ModelRendererTurbo(this, 257, 369, textureX, textureY); // Box 79
		gunModel[493] = new ModelRendererTurbo(this, 289, 369, textureX, textureY); // Box 80
		gunModel[494] = new ModelRendererTurbo(this, 313, 369, textureX, textureY); // Box 81
		gunModel[495] = new ModelRendererTurbo(this, 337, 369, textureX, textureY); // Box 82
		gunModel[496] = new ModelRendererTurbo(this, 465, 369, textureX, textureY); // Box 83
		gunModel[497] = new ModelRendererTurbo(this, 489, 369, textureX, textureY); // Box 84
		gunModel[498] = new ModelRendererTurbo(this, 521, 369, textureX, textureY); // Box 85
		gunModel[499] = new ModelRendererTurbo(this, 545, 369, textureX, textureY); // Box 86

		gunModel[0].addShapeBox(0F, 0F, 0F, 34, 5, 12, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Import ImportBox1
		gunModel[0].setRotationPoint(23F, -36.5F, -6F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F); // Import ImportBox2
		gunModel[1].setRotationPoint(24.1F, -33.75F, -6.25F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F); // Import ImportBox2
		gunModel[2].setRotationPoint(23.1F, -33.75F, -6.25F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Import ImportBox2
		gunModel[3].setRotationPoint(23.1F, -32.85F, -6.25F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 11, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[4].setRotationPoint(11.5F, -36.5F, -6F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Import ImportBox2
		gunModel[5].setRotationPoint(8.7F, -32.85F, -6.25F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-1.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.75F, 0.5F, 0.5F, -1.75F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -1.75F, -0.25F, 0.5F); // Import ImportBox2
		gunModel[6].setRotationPoint(8.45F, -33.35F, -6.25F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Import ImportBox2
		gunModel[7].setRotationPoint(8.7F, -33.85F, -6.25F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-1.75F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.5F, -1.75F, -0.2F, 0.5F, -1.75F, -0.1F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0.5F, -1.75F, -0.1F, 0.5F); // Import ImportBox2
		gunModel[8].setRotationPoint(7.45F, -32.75F, -6.25F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Import ImportBox2
		gunModel[9].setRotationPoint(8.7F, -31.85F, -6.25F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-1.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, -1.25F, 0.25F, 0.5F, -1.25F, -0.75F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, -1.25F, -0.75F, 0.5F); // Import ImportBox2
		gunModel[10].setRotationPoint(8.95F, -31.85F, -6.25F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-0.5F, -1F, 0F, -1.25F, -0.75F, 0F, -1.25F, -0.75F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F); // Import ImportBox2
		gunModel[11].setRotationPoint(8.7F, -34.6F, -6.25F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 50, 5, 12, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Import ImportBox1
		gunModel[12].setRotationPoint(-38F, -36.5F, -6F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 5, 13, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportBox1
		gunModel[13].setRotationPoint(16.5F, -34.5F, -6.25F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[14].setRotationPoint(15.5F, -29.5F, -7.25F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[15].setRotationPoint(15.5F, -28.5F, -7.25F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Import ImportBox1
		gunModel[16].setRotationPoint(15.5F, -27.5F, -7.25F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -2.5F, 0.25F, 0.25F, -2.5F, 0.25F); // Import ImportBox1
		gunModel[17].setRotationPoint(16.5F, -34.5F, 6.75F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Import ImportBox1
		gunModel[18].setRotationPoint(16.5F, -34.25F, -2.75F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 95, 5, 12, 0F,0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		gunModel[19].setRotationPoint(-38F, -41.5F, -6F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 108, 1, 5, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		gunModel[20].setRotationPoint(-27.75F, -42.5F, -2.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 109, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Import ImportBox1
		gunModel[21].setRotationPoint(-28.75F, -42.75F, -4F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 27, 1, 4, 0F,0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import ImportBox1
		gunModel[22].setRotationPoint(57.25F, -41.5F, -2F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 53, 9, 12, 0F,0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import ImportBox1
		gunModel[23].setRotationPoint(23F, -31.25F, -6F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 4, 9, 12, 0F,0F, -3.25F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -3.25F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox1
		gunModel[24].setRotationPoint(19F, -31.25F, -6F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 4, 9, 12, 0F,-0.5F, 0F, 0.5F, 0F, -3.25F, 0.5F, 0F, -3.25F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Import ImportBox1
		gunModel[25].setRotationPoint(11F, -31.25F, -6F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 4, 9, 12, 0F,0F, -3.25F, 0.5F, 0F, -3.25F, 0.5F, 0F, -3.25F, 0.5F, 0F, -3.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox1
		gunModel[26].setRotationPoint(15F, -31.25F, -6F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 74, 9, 12, 0F,0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 18.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 18.5F, 0F, 0.5F); // Import ImportBox1
		gunModel[27].setRotationPoint(-62F, -31.25F, -6F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 156, 2, 12, 0F,0.5F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.25F, -1.5F, -2.25F, -0.25F, -1.5F, -2.25F, -0.25F, -1.5F, 0.5F, -0.25F, -1.5F); // Import ImportBox1
		gunModel[28].setRotationPoint(-80F, -22.25F, -6F);

		gunModel[29].addBox(0F, 0F, 0F, 9, 5, 11, 0F); // Import ImportBox8
		gunModel[29].setRotationPoint(-6F, -2F, -5.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[30].setRotationPoint(-6F, 3F, -5.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 12, 3, 11, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[31].setRotationPoint(-6F, -5F, -5.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,0F, 0.5F, 0F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[32].setRotationPoint(6.75F, -7F, -5.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0.5F, 0F, -2.25F, 0.5F, 0F, -2.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[33].setRotationPoint(6.75F, -8.5F, -5.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.25F, 0.5F, 0F, -2.25F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox8
		gunModel[34].setRotationPoint(6.75F, -10.5F, -5.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 13, 6, 11, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[35].setRotationPoint(-6F, -11F, -5.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 15, 1, 11, 0F,0F, 0.5F, 0F, -2.75F, 0.5F, 0F, -2.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox8
		gunModel[36].setRotationPoint(-5.25F, -12.5F, -5.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 15, 1, 11, 0F,0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.75F, 0.5F, 0F, -2.75F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox8
		gunModel[37].setRotationPoint(-5.25F, -14.5F, -5.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 16, 1, 11, 0F,0F, 0.5F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox8
		gunModel[38].setRotationPoint(-5.25F, -16.5F, -5.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 16, 1, 11, 0F,0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox8
		gunModel[39].setRotationPoint(-5.25F, -18.5F, -5.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 16, 1, 11, 0F,0F, 1F, 0F, 0.75F, 1F, 0F, 0.75F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox8
		gunModel[40].setRotationPoint(-5.25F, -20.5F, -5.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 8, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[41].setRotationPoint(-6F, 6F, -5.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 8, 7, 11, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[42].setRotationPoint(-6F, 9F, -5.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 8, 2, 11, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[43].setRotationPoint(-6F, 16F, -5.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 8, 1, 11, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[44].setRotationPoint(-6F, 18F, -5.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[45].setRotationPoint(1F, 19F, -5.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F); // Import ImportBox8
		gunModel[46].setRotationPoint(-4F, 19F, -5.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 17, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Import ImportBox8
		gunModel[47].setRotationPoint(-21F, 19F, -5.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F); // Import ImportBox8
		gunModel[48].setRotationPoint(-23F, 19F, -5.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 12, 1, 11, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox8
		gunModel[49].setRotationPoint(-17.25F, -20.5F, -5.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 12, 1, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F); // Import ImportBox8
		gunModel[50].setRotationPoint(-17.25F, -18.5F, -5.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 9, 2, 11, 0F,-0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F); // Import ImportBox8
		gunModel[51].setRotationPoint(-14.25F, -17F, -5.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Import ImportBox8
		gunModel[52].setRotationPoint(-10.25F, -14.5F, -5.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,-1.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Import ImportBox8
		gunModel[53].setRotationPoint(-10.25F, -12F, -5.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,-1.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Import ImportBox8
		gunModel[54].setRotationPoint(-10.25F, -10.5F, -5.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,-0.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0.5F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox8
		gunModel[55].setRotationPoint(-10.25F, -9F, -5.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 1F, 0.5F, 0F, 2.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 2.75F, 0F, 0F); // Import ImportBox8
		gunModel[56].setRotationPoint(-10.25F, -6.5F, -5.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,1.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 1.75F, 0.5F, 0F, 3.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 3.75F, 0F, 0F); // Import ImportBox8
		gunModel[57].setRotationPoint(-11.25F, -4F, -5.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,3.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 3.75F, 0.5F, 0F, 5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 5F, 0F, 0F); // Import ImportBox8
		gunModel[58].setRotationPoint(-11.25F, -1.5F, -5.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 5, 6, 11, 0F,5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 5F, 0.5F, 0F, 7.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 7.25F, 0F, 0F); // Import ImportBox8
		gunModel[59].setRotationPoint(-11.25F, 1F, -5.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 7, 6, 11, 0F,5.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 5.25F, 0.5F, 0F, 6.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 6.75F, 0F, 0F); // Import ImportBox8
		gunModel[60].setRotationPoint(-13.25F, 7.5F, -5.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,6.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 6.75F, 0.5F, 0F, 7.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 7.75F, 0.25F, 0F); // Import ImportBox8
		gunModel[61].setRotationPoint(-13.25F, 14F, -5.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 9, 2, 11, 0F,5.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 5.75F, 0.5F, 0F, 7.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 7.75F, 0.25F, 0F); // Import ImportBox8
		gunModel[62].setRotationPoint(-15.25F, 16.75F, -5.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[63].setRotationPoint(11.5F, -7F, -5.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox8
		gunModel[64].setRotationPoint(23.75F, -9F, -5.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox8
		gunModel[65].setRotationPoint(24.75F, -10.5F, -5.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox8
		gunModel[66].setRotationPoint(25.75F, -13F, -5.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Import ImportBox8
		gunModel[67].setRotationPoint(25.75F, -15.5F, -5.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox8
		gunModel[68].setRotationPoint(25.75F, -17.5F, -5.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox8
		gunModel[69].setRotationPoint(24.75F, -19F, -5.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import ImportBox8
		gunModel[70].setRotationPoint(23.75F, -20F, -5.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 2, 13, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox8
		gunModel[71].setRotationPoint(27.75F, -20F, -4.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 3, 13, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F); // Import ImportBox8
		gunModel[72].setRotationPoint(29.75F, -20F, -4.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 2, 14, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox8
		gunModel[73].setRotationPoint(32.75F, -20F, -4.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 22, 14, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Import ImportBox8
		gunModel[74].setRotationPoint(34.75F, -20F, -4.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 14, 3, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, -3.45F, 0F, 0F, -3.45F, 0F, 0F, 1.25F, 0F); // Import ImportBox8
		gunModel[75].setRotationPoint(56.75F, -20F, -4.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 6, 9, 8, 0F,0F, 0.75F, 0.5F, 1F, 3.15F, 0F, 1F, 3.15F, 0F, 0F, 0.75F, 0.5F, 0F, 1.25F, 0.5F, 1F, -6F, 0F, 1F, -6F, 0F, 0F, 1.25F, 0.5F); // Import ImportBox8
		gunModel[76].setRotationPoint(56.75F, -15F, -4F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 4, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[77].setRotationPoint(63.75F, -21F, -4F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[78].setRotationPoint(67.75F, -21F, -4F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -2F, 0F); // Import ImportBox8
		gunModel[79].setRotationPoint(69.75F, -21F, -4F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, -5.5F, 0F, 0.5F, -5.5F, 0F, 0F, -2.5F, 0F); // Import ImportBox8
		gunModel[80].setRotationPoint(70.75F, -21F, -4F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 10, 2, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Import ImportBox8
		gunModel[81].setRotationPoint(39.75F, -10F, -5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F); // Import ImportBox8
		gunModel[82].setRotationPoint(49.75F, -10F, -5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.25F, 0F); // Import ImportBox8
		gunModel[83].setRotationPoint(51.75F, -9F, -5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F); // Import ImportBox8
		gunModel[84].setRotationPoint(37.75F, -10F, -5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox8
		gunModel[85].setRotationPoint(36.75F, -9F, -5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import ImportBox1
		gunModel[86].setRotationPoint(39.5F, -9F, -5.25F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import ImportBox1
		gunModel[87].setRotationPoint(39.5F, -9.5F, -5.25F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import ImportBox1
		gunModel[88].setRotationPoint(39.5F, -8.5F, -5.25F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import ImportBox1
		gunModel[89].setRotationPoint(49F, -9F, -5.25F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import ImportBox1
		gunModel[90].setRotationPoint(49F, -9.5F, -5.25F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import ImportBox1
		gunModel[91].setRotationPoint(49F, -8.5F, -5.25F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 10, 2, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Import ImportBox16
		gunModel[92].setRotationPoint(-61.25F, -15.5F, -5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F); // Import ImportBox8
		gunModel[93].setRotationPoint(-51.25F, -15.5F, -5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.25F, 0F); // Import ImportBox8
		gunModel[94].setRotationPoint(-49.25F, -14.5F, -5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F); // Import ImportBox8
		gunModel[95].setRotationPoint(-63.25F, -15.5F, -5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox8
		gunModel[96].setRotationPoint(-64.25F, -14.5F, -5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import ImportBox1
		gunModel[97].setRotationPoint(-61.5F, -14.5F, -5.25F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import ImportBox1
		gunModel[98].setRotationPoint(-61.5F, -15F, -5.25F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import ImportBox1
		gunModel[99].setRotationPoint(-61.5F, -14F, -5.25F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import ImportBox1
		gunModel[100].setRotationPoint(-52F, -14.5F, -5.25F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import ImportBox1
		gunModel[101].setRotationPoint(-52F, -15F, -5.25F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import ImportBox1
		gunModel[102].setRotationPoint(-52F, -14F, -5.25F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 11, 7, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 1.25F, 0F); // Import ImportBox8
		gunModel[103].setRotationPoint(-44.25F, -18F, -4.5F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 28, 7, 9, 0F,0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0.25F, 1.25F, 0F); // Import ImportBox8
		gunModel[104].setRotationPoint(-72.25F, -18F, -4.5F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 28, 1, 9, 0F,2.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import ImportBox8
		gunModel[105].setRotationPoint(-72.25F, -20F, -4.5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F,0.25F, 0.5F, 0F, 1.75F, 0.5F, 0F, 1.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.5F, 0.25F, 0.5F, 0F); // Import ImportBox8
		gunModel[106].setRotationPoint(-44F, -20F, -4.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[107].setRotationPoint(154F, -40F, -6F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 24, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox0
		gunModel[108].setRotationPoint(56.5F, -32F, -6F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 18, 4, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		gunModel[109].setRotationPoint(56F, -36F, -6F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 24, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2
		gunModel[110].setRotationPoint(56.5F, -40F, -6F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[111].setRotationPoint(170F, -40F, -6F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[112].setRotationPoint(170F, -32F, -6F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[113].setRotationPoint(171F, -36F, -6F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[114].setRotationPoint(124F, -40F, -6F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[115].setRotationPoint(124F, -32F, -6F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Import ImportBox31
		gunModel[116].setRotationPoint(170F, -35.5F, -6F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox31
		gunModel[117].setRotationPoint(170F, -33.5F, -6F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[118].setRotationPoint(74F, -33.5F, -6F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox31
		gunModel[119].setRotationPoint(74F, -35.5F, -6F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,-1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox31
		gunModel[120].setRotationPoint(85.5F, -33.5F, -6F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 97, 1, 12, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import ImportBox31
		gunModel[121].setRotationPoint(74.25F, -36F, -6F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 97, 1, 12, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import ImportBox31
		gunModel[122].setRotationPoint(74.25F, -32.5F, -6F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[123].setRotationPoint(154F, -32F, -6F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox31
		gunModel[124].setRotationPoint(158F, -32F, -6F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[125].setRotationPoint(158F, -29F, -6F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[126].setRotationPoint(158F, -37F, -6F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox31
		gunModel[127].setRotationPoint(158F, -40F, -6F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Import ImportBox31
		gunModel[128].setRotationPoint(157F, -32F, -6F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F); // Import ImportBox31
		gunModel[129].setRotationPoint(169F, -32F, -6F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[130].setRotationPoint(157F, -29F, -6F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[131].setRotationPoint(169F, -29F, -6F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[132].setRotationPoint(169F, -37F, -6F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F); // Import ImportBox31
		gunModel[133].setRotationPoint(157F, -40F, -6F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F); // Import ImportBox31
		gunModel[134].setRotationPoint(169F, -40F, -6F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[135].setRotationPoint(139F, -32F, -6F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox31
		gunModel[136].setRotationPoint(143F, -32F, -6F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[137].setRotationPoint(143F, -29F, -6F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[138].setRotationPoint(108F, -32F, -6F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox31
		gunModel[139].setRotationPoint(112F, -32F, -6F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[140].setRotationPoint(112F, -29F, -6F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[141].setRotationPoint(93.5F, -32F, -6F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Import ImportBox31
		gunModel[142].setRotationPoint(97F, -32F, -6F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,-0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, -4F); // Import ImportBox31
		gunModel[143].setRotationPoint(97F, -29F, -6F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[144].setRotationPoint(93.5F, -40F, -6F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[145].setRotationPoint(108F, -40F, -6F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[146].setRotationPoint(139F, -40F, -6F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[147].setRotationPoint(143F, -37F, -6F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[148].setRotationPoint(153F, -37F, -6F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import ImportBox1
		gunModel[149].setRotationPoint(172.25F, -44F, -4F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import ImportBox1
		gunModel[150].setRotationPoint(89.25F, -41.5F, -2F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import ImportBox1
		gunModel[151].setRotationPoint(99.25F, -41.5F, -2F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import ImportBox1
		gunModel[152].setRotationPoint(109.25F, -41.5F, -2F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import ImportBox1
		gunModel[153].setRotationPoint(119.25F, -41.5F, -2F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import ImportBox1
		gunModel[154].setRotationPoint(129.25F, -41.5F, -2F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import ImportBox1
		gunModel[155].setRotationPoint(139.25F, -41.5F, -2F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import ImportBox1
		gunModel[156].setRotationPoint(149.25F, -41.5F, -2F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import ImportBox1
		gunModel[157].setRotationPoint(159.25F, -41.5F, -2F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0.75F, 1F, 0F, 0.75F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import ImportBox1
		gunModel[158].setRotationPoint(169.25F, -41.5F, -2F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[159].setRotationPoint(157F, -37F, -6F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F); // Import ImportBox31
		gunModel[160].setRotationPoint(153F, -40F, -6F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F); // Import ImportBox31
		gunModel[161].setRotationPoint(142F, -40F, -6F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[162].setRotationPoint(142F, -37F, -6F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox31
		gunModel[163].setRotationPoint(143F, -40F, -6F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[164].setRotationPoint(138F, -37F, -6F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F); // Import ImportBox31
		gunModel[165].setRotationPoint(138F, -40F, -6F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[166].setRotationPoint(128F, -37F, -6F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox31
		gunModel[167].setRotationPoint(128F, -40F, -6F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F); // Import ImportBox31
		gunModel[168].setRotationPoint(127F, -40F, -6F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[169].setRotationPoint(127F, -37F, -6F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[170].setRotationPoint(123F, -37F, -6F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F); // Import ImportBox31
		gunModel[171].setRotationPoint(123F, -40F, -6F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[172].setRotationPoint(112F, -37F, -6F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox31
		gunModel[173].setRotationPoint(112F, -40F, -6F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F); // Import ImportBox31
		gunModel[174].setRotationPoint(111F, -40F, -6F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[175].setRotationPoint(111F, -37F, -6F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[176].setRotationPoint(107F, -37F, -6F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F); // Import ImportBox31
		gunModel[177].setRotationPoint(107F, -40F, -6F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox31
		gunModel[178].setRotationPoint(97F, -37F, -6F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, -3F); // Import ImportBox31
		gunModel[179].setRotationPoint(97F, -40F, -6F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F); // Import ImportBox31
		gunModel[180].setRotationPoint(96.5F, -40F, -6F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[181].setRotationPoint(96.5F, -37F, -6F);

		gunModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[182].setRotationPoint(92.5F, -37F, -6F);

		gunModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F); // Import ImportBox31
		gunModel[183].setRotationPoint(92.5F, -40F, -6F);

		gunModel[184].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,-0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox31
		gunModel[184].setRotationPoint(81F, -37F, -6F);

		gunModel[185].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,-0.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, -0.5F, 0F, -3F); // Import ImportBox31
		gunModel[185].setRotationPoint(81F, -40F, -6F);

		gunModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F); // Import ImportBox31
		gunModel[186].setRotationPoint(80.5F, -40F, -6F);

		gunModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[187].setRotationPoint(80.5F, -37F, -6F);

		gunModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F); // Import ImportBox31
		gunModel[188].setRotationPoint(153F, -32F, -6F);

		gunModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[189].setRotationPoint(153F, -29F, -6F);

		gunModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Import ImportBox31
		gunModel[190].setRotationPoint(142F, -32F, -6F);

		gunModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[191].setRotationPoint(142F, -29F, -6F);

		gunModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F); // Import ImportBox31
		gunModel[192].setRotationPoint(138F, -32F, -6F);

		gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[193].setRotationPoint(138F, -29F, -6F);

		gunModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Import ImportBox31
		gunModel[194].setRotationPoint(127F, -32F, -6F);

		gunModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[195].setRotationPoint(127F, -29F, -6F);

		gunModel[196].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox31
		gunModel[196].setRotationPoint(128F, -32F, -6F);

		gunModel[197].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[197].setRotationPoint(128F, -29F, -6F);

		gunModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F); // Import ImportBox31
		gunModel[198].setRotationPoint(123F, -32F, -6F);

		gunModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[199].setRotationPoint(123F, -29F, -6F);

		gunModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Import ImportBox31
		gunModel[200].setRotationPoint(111F, -32F, -6F);

		gunModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[201].setRotationPoint(111F, -29F, -6F);

		gunModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F); // Import ImportBox31
		gunModel[202].setRotationPoint(107F, -32F, -6F);

		gunModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[203].setRotationPoint(107F, -29F, -6F);

		gunModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Import ImportBox31
		gunModel[204].setRotationPoint(96.5F, -32F, -6F);

		gunModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[205].setRotationPoint(96.5F, -29F, -6F);

		gunModel[206].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.5F, 0F, -2F); // Import ImportBox31
		gunModel[206].setRotationPoint(81F, -32F, -6F);

		gunModel[207].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,-0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, -0.5F, 0F, -4F); // Import ImportBox31
		gunModel[207].setRotationPoint(81F, -29F, -6F);

		gunModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F); // Import ImportBox31
		gunModel[208].setRotationPoint(92.5F, -32F, -6F);

		gunModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import ImportBox31
		gunModel[209].setRotationPoint(92.5F, -29F, -6F);

		gunModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Import ImportBox31
		gunModel[210].setRotationPoint(80.5F, -32F, -6F);

		gunModel[211].addShapeBox(0F, 0F, 0F, 111, 7, 7, 0F,0F, -0.05F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[211].setRotationPoint(73F, -37F, -3.5F);

		gunModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -1F, 1F, -2.5F, -1F, 1F, -2.5F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		gunModel[212].setRotationPoint(174.25F, -44F, -4.5F);

		gunModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2.75F, 0.5F, 0F, 2.75F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		gunModel[213].setRotationPoint(174.25F, -41.5F, -4.5F);

		gunModel[214].addShapeBox(0F, 0F, 0F, 3, 6, 9, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[214].setRotationPoint(174.25F, -39F, -4.5F);

		gunModel[215].addShapeBox(0F, 0F, 0F, 5, 4, 9, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportBox1
		gunModel[215].setRotationPoint(174.25F, -33F, -4.5F);

		gunModel[216].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[216].setRotationPoint(174.25F, -29F, -3F);

		gunModel[217].addShapeBox(0F, 0F, 0F, 7, 5, 9, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[217].setRotationPoint(174.25F, -26F, -4.5F);

		gunModel[218].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0.5F, 1.75F, -0.25F, 0.5F, 1.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[218].setRotationPoint(174.25F, -27F, 3.5F);

		gunModel[219].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -1F, 0F, 1.75F, -1F, 0F, 1.75F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox1
		gunModel[219].setRotationPoint(174.25F, -27F, -4.5F);

		gunModel[220].addShapeBox(0F, 0F, 0F, 104, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[220].setRotationPoint(72.25F, -24.5F, 1F);

		gunModel[221].addShapeBox(0F, 0F, 0F, 104, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[221].setRotationPoint(72.25F, -23.5F, 1F);

		gunModel[222].addShapeBox(0F, 0F, 0F, 104, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox1
		gunModel[222].setRotationPoint(72.25F, -22.5F, 1F);

		gunModel[223].addShapeBox(0F, 0F, 0F, 104, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[223].setRotationPoint(72.25F, -24.5F, -4F);

		gunModel[224].addShapeBox(0F, 0F, 0F, 104, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[224].setRotationPoint(72.25F, -23.5F, -4F);

		gunModel[225].addShapeBox(0F, 0F, 0F, 104, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox1
		gunModel[225].setRotationPoint(72.25F, -22.5F, -4F);

		gunModel[226].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[226].setRotationPoint(181F, -38F, -4F);

		gunModel[227].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[227].setRotationPoint(185F, -37.5F, -3.5F);

		gunModel[228].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[228].setRotationPoint(186F, -38F, -4F);

		gunModel[229].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[229].setRotationPoint(189F, -38F, -4F);

		gunModel[230].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[230].setRotationPoint(188F, -38F, -4F);

		gunModel[231].addShapeBox(0F, 0F, 0F, 7, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[231].setRotationPoint(191F, -38F, -4F);

		gunModel[232].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[232].setRotationPoint(201F, -38F, -4F);

		gunModel[233].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[233].setRotationPoint(206F, -38F, -4F);

		gunModel[234].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[234].setRotationPoint(211F, -38F, -4F);

		gunModel[235].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox31
		gunModel[235].setRotationPoint(198F, -38F, -3F);

		gunModel[236].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import ImportBox31
		gunModel[236].setRotationPoint(198F, -32F, -3F);

		gunModel[237].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox31
		gunModel[237].setRotationPoint(203F, -38F, -3F);

		gunModel[238].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import ImportBox31
		gunModel[238].setRotationPoint(203F, -32F, -3F);

		gunModel[239].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox31
		gunModel[239].setRotationPoint(208F, -38F, -3F);

		gunModel[240].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import ImportBox31
		gunModel[240].setRotationPoint(208F, -32F, -3F);

		gunModel[241].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[241].setRotationPoint(212.5F, -38F, -4F);

		gunModel[242].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		gunModel[242].setRotationPoint(212.5F, -34F, -4F);

		gunModel[243].addShapeBox(0F, 0F, 0F, 17, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[243].setRotationPoint(75.25F, -25F, -8F);

		gunModel[244].addShapeBox(0F, 0F, 0F, 9, 3, 16, 0F,-2.25F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, -2.25F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[244].setRotationPoint(75.25F, -28F, -8F);

		gunModel[245].addShapeBox(0F, 0F, 0F, 7, 2, 16, 0F,-3.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3.5F, 0F, -2F, -0.25F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, -0.25F, 0F, -1.2F); // Import ImportBox1
		gunModel[245].setRotationPoint(77.25F, -30F, -8F);

		gunModel[246].addShapeBox(0F, 0F, 0F, 49, 2, 16, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -1F); // Import ImportBox1
		gunModel[246].setRotationPoint(75.25F, -21F, -8F);

		gunModel[247].addShapeBox(0F, 0F, 0F, 5, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox1
		gunModel[247].setRotationPoint(99.25F, -25F, -8F);

		gunModel[248].addShapeBox(0F, 0F, 0F, 4, 5, 16, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[248].setRotationPoint(118.75F, -30F, -8F);

		gunModel[249].addShapeBox(0F, 0F, 0F, 35, 1, 16, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, 0F, 0.5F, -1.4F); // Import ImportBox1
		gunModel[249].setRotationPoint(84.25F, -30F, -8F);

		gunModel[250].addShapeBox(0F, 0F, 0F, 35, 1, 20, 0F,0F, 0F, -2.4F, -0.5F, 0F, -2.4F, -0.5F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox1
		gunModel[250].setRotationPoint(84.25F, -26F, -10F);

		gunModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-1F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F); // Import ImportBox1
		gunModel[251].setRotationPoint(117.75F, -27F, -10F);

		gunModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, -1F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, -1F, 0.25F, -2.9F); // Import ImportBox1
		gunModel[252].setRotationPoint(117.75F, -28.5F, -10F);

		gunModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, 0F, 0.25F, -2.9F); // Import ImportBox1
		gunModel[253].setRotationPoint(84.25F, -28.5F, -10F);

		gunModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F); // Import ImportBox1
		gunModel[254].setRotationPoint(84.25F, -27F, -10F);

		gunModel[255].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,-1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F); // Import ImportBox1
		gunModel[255].setRotationPoint(92.75F, -27F, -10F);

		gunModel[256].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F); // Import ImportBox1
		gunModel[256].setRotationPoint(92.75F, -28.5F, -10F);

		gunModel[257].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2.5F, 0.25F, 0.25F, -2.5F, 0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import ImportBox1
		gunModel[257].setRotationPoint(16.5F, -34.5F, -8.75F);

		gunModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Import ImportBox1
		gunModel[258].setRotationPoint(16.5F, -34.25F, -9.25F);

		gunModel[259].addShapeBox(0F, 0F, 0F, 9, 5, 8, 0F,0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Import ImportBox1
		gunModel[259].setRotationPoint(-69F, -31.5F, -2F);

		gunModel[260].addShapeBox(0F, 0F, 0F, 55, 5, 9, 0F,0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		gunModel[260].setRotationPoint(-122F, -41.5F, -3F);

		gunModel[261].addShapeBox(0F, 0F, 0F, 20, 13, 9, 0F,0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		gunModel[261].setRotationPoint(-122F, -36.5F, -3F);

		gunModel[262].addShapeBox(0F, 0F, 0F, 2, 14, 12, 0F,1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 1F, 0.25F, 0F); // Import ImportBox1
		gunModel[262].setRotationPoint(-124F, -36.5F, -6F);

		gunModel[263].addShapeBox(0F, 0F, 0F, 10, 5, 9, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, -1F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[263].setRotationPoint(-132.5F, -41.5F, -3F);

		gunModel[264].addShapeBox(0F, 0F, 0F, 8, 39, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Import ImportBox1
		gunModel[264].setRotationPoint(-132.5F, -36.5F, -6F);

		gunModel[265].addShapeBox(0F, 0F, 0F, 7, 2, 12, 0F,0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F); // Import ImportBox1
		gunModel[265].setRotationPoint(-132F, 2.5F, -6F);

		gunModel[266].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F); // Import ImportBox1
		gunModel[266].setRotationPoint(-132F, 4.25F, -4.5F);

		gunModel[267].addShapeBox(0F, 0F, 0F, 1, 33, 12, 0F,1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 1F, 0.25F, 0F); // Import ImportBox1
		gunModel[267].setRotationPoint(-124F, -22.5F, -6F);

		gunModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F); // Import ImportBox1
		gunModel[268].setRotationPoint(-123.5F, -22.25F, -6F);

		gunModel[269].addShapeBox(0F, 0F, 0F, 26, 1, 12, 0F,1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 1F, 0.25F, 0F); // Import ImportBox1
		gunModel[269].setRotationPoint(-121.5F, -23.5F, -6F);

		gunModel[270].addShapeBox(0F, 0F, 0F, 26, 3, 12, 0F,1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[270].setRotationPoint(-122F, 7.5F, -6F);

		gunModel[271].addShapeBox(0F, 0F, 0F, 7, 30, 12, 0F,1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[271].setRotationPoint(-103F, -22.5F, -6F);

		gunModel[272].addShapeBox(0F, 0F, 0F, 2, 30, 12, 0F,1.25F, -0.25F, -3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.25F, -0.25F, -3F, 1.25F, 0.25F, -3F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, 0.25F, -3F); // Import ImportBox1
		gunModel[272].setRotationPoint(-106F, -22.5F, -6F);

		gunModel[273].addShapeBox(0F, 0F, 0F, 2, 23, 12, 0F,-0.25F, -0.25F, 0F, 1.25F, -0.25F, -2F, 1.25F, -0.25F, -2F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, 0.25F, -2F, 1.25F, 0.25F, -2F, -0.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[273].setRotationPoint(-96.5F, -15.5F, -6F);

		gunModel[274].addShapeBox(0F, 0F, 0F, 1, 25, 8, 0F,-0.25F, -0.25F, 0F, 1.25F, -0.25F, -3F, 1.25F, -0.25F, -3F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, 0.25F, -3F, 1.25F, 0.25F, -3F, -0.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[274].setRotationPoint(-93.5F, -17.5F, -4F);

		gunModel[275].addShapeBox(0F, 0F, 0F, 2, 7, 12, 0F,1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[275].setRotationPoint(-95F, -22.5F, -6F);

		gunModel[276].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[276].setRotationPoint(-91F, -22.5F, -6F);

		gunModel[277].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Import ImportBox1
		gunModel[277].setRotationPoint(-93F, -22.5F, -6F);

		gunModel[278].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,1.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, 0.25F, -1F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, 1.25F, 0.25F, -1F); // Import ImportBox1
		gunModel[278].setRotationPoint(-91F, -18.5F, -6F);

		gunModel[279].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, 0.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[279].setRotationPoint(-93F, -18.5F, -6F);

		gunModel[280].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,1.25F, 0.25F, 0F, 1.75F, 0.25F, 0F, 1.75F, 0.25F, 0F, 1.25F, 0.25F, 0F, 1.25F, -0.25F, -2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F, -2F, 1.25F, -0.25F, -2F); // Import ImportBox1
		gunModel[280].setRotationPoint(-87F, -18.5F, -6F);

		gunModel[281].addShapeBox(0F, 0F, 0F, 9, 4, 12, 0F,1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F); // Import ImportBox1
		gunModel[281].setRotationPoint(-87F, -22.5F, -6F);

		gunModel[282].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,2.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 2.25F, -0.25F, 0F, 1.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Import ImportBox1
		gunModel[282].setRotationPoint(-122F, 10.5F, -6F);

		gunModel[283].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,1.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 1.75F, -0.25F, 0F, 0.5F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0.5F, -0.75F, 0F); // Import ImportBox1
		gunModel[283].setRotationPoint(-122F, 12.5F, -6F);

		gunModel[284].addShapeBox(0F, 0F, 0F, 2, 10, 12, 0F,-0.25F, -0.25F, 0F, 1.25F, -0.25F, -2F, 1.25F, -0.25F, -2F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, 0F, -2F, 1.25F, 0F, -2F, -0.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[284].setRotationPoint(-96.5F, 7.5F, -6F);

		gunModel[285].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.25F, -0.25F, 0F, 1.25F, -0.25F, -3F, 1.25F, -0.25F, -3F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 1.25F, -0.25F, -3F, 1.25F, -0.25F, -3F, -0.25F, 0F, 0F); // Import ImportBox1
		gunModel[285].setRotationPoint(-93.5F, 7.5F, -4F);

		gunModel[286].addShapeBox(0F, 0F, 0F, 12, 2, 12, 0F,-0.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, 0.25F, 0F, 1.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[286].setRotationPoint(-109.5F, 15.5F, -6F);

		gunModel[287].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,-2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Import ImportBox1
		gunModel[287].setRotationPoint(-113.25F, 13.75F, -6F);

		gunModel[288].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,-0.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox1
		gunModel[288].setRotationPoint(-108.5F, 11.25F, -4.5F);

		gunModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-0.25F, -0.25F, -2F, 1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, -0.25F, -0.25F, -2F, -0.25F, 0F, -2F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, -2F); // Import ImportBox1
		gunModel[289].setRotationPoint(-110.5F, 11.25F, -4.5F);

		gunModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1.25F, -0.25F, 0F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, 1.25F, -0.25F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 1.25F, 0F, 0F); // Import ImportBox1
		gunModel[290].setRotationPoint(-97.5F, 11.25F, -4.5F);

		gunModel[291].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,-0.25F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[291].setRotationPoint(-108.5F, 13.25F, -4.5F);

		gunModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-0.25F, -0.5F, -2F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, -0.25F, -0.5F, -2F, -0.25F, 0.25F, -2F, 1.25F, 0.25F, 0F, 1.25F, 0.25F, 0F, -0.25F, 0.25F, -2F); // Import ImportBox1
		gunModel[292].setRotationPoint(-110.5F, 13.25F, -4.5F);

		gunModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1.25F, -0.5F, 0F, -0.25F, -0.5F, -2F, -0.25F, -0.5F, -2F, 1.25F, -0.5F, 0F, 1.25F, 0.25F, 0F, -0.25F, 0.25F, -2F, -0.25F, 0.25F, -2F, 1.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[293].setRotationPoint(-97.5F, 13.25F, -4.5F);

		gunModel[294].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[294].setRotationPoint(-104.25F, 9.25F, -2F);

		gunModel[295].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[295].setRotationPoint(-100.25F, 9.25F, -2F);

		gunModel[296].addShapeBox(0F, 0F, 0F, 46, 5, 9, 0F,0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -7.5F, -1.5F, 0F, -7.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import ImportBox1
		gunModel[296].setRotationPoint(-112F, -41.5F, -1.5F);

		gunModel[297].addShapeBox(0F, 0F, 0F, 46, 7, 9, 0F,0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0.5F, 0F, -4F); // Import ImportBox1
		gunModel[297].setRotationPoint(-112F, -36.5F, 2F);

		gunModel[298].addShapeBox(0F, 0F, 0F, 46, 1, 11, 0F,0.5F, 0F, -4.5F, -1.5F, 0F, -4.5F, -1.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -4.5F, -1.5F, 0F, -4.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import ImportBox1
		gunModel[298].setRotationPoint(-112F, -42.5F, -7F);

		gunModel[299].addShapeBox(0F, 0F, 0F, 46, 3, 9, 0F,0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0.5F, 0F, -4F, -2.5F, -0.25F, -3.5F, -4.5F, -0.25F, -3.5F, -4.5F, -0.25F, -4F, -2.5F, -0.25F, -4F); // Import ImportBox1
		gunModel[299].setRotationPoint(-112F, -29.5F, 2F);

		gunModel[300].addShapeBox(0F, 0F, 0F, 40, 3, 9, 0F,0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0.5F, 0F, -4F, -3.5F, -0.25F, -3.5F, -5.5F, -0.25F, -3.5F, -5.5F, -0.25F, -4F, -3.5F, -0.25F, -4F); // Import ImportBox1
		gunModel[300].setRotationPoint(-109F, -26.75F, 2F);

		gunModel[301].addShapeBox(0F, 0F, 0F, 32, 2, 9, 0F,0.5F, 0.25F, -4F, -1.5F, 0.25F, -4F, -1.5F, 0.25F, -4F, 0.5F, 0.25F, -4F, -6.5F, -0.25F, -3.5F, -8.5F, -0.25F, -3.5F, -8.5F, -0.25F, -4F, -6.5F, -0.25F, -4F); // Import ImportBox1
		gunModel[301].setRotationPoint(-105F, -23.75F, 2F);

		gunModel[302].addShapeBox(0F, 0F, 0F, 40, 7, 9, 0F,0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, -0.5F, -4F, -1.5F, -0.5F, -4F, -1.5F, -0.5F, -4F, 0.5F, -0.5F, -4F); // Import ImportBox1
		gunModel[302].setRotationPoint(-109F, -36.5F, 2.5F);

		gunModel[303].addShapeBox(0F, 0F, 0F, 40, 5, 9, 0F,0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -7.5F, -1.5F, 0F, -7.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import ImportBox1
		gunModel[303].setRotationPoint(-109F, -41.5F, -1F);

		gunModel[304].addShapeBox(0F, 0F, 0F, 40, 1, 11, 0F,0.5F, 0.25F, -4.5F, -1.5F, 0.25F, -4.5F, -1.5F, 0.25F, -4F, 0.5F, 0.25F, -4F, 0.5F, 0F, -4.5F, -1.5F, 0F, -4.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import ImportBox1
		gunModel[304].setRotationPoint(-109F, -42.5F, -6.5F);

		gunModel[305].addShapeBox(0F, 0F, 0F, 18, 3, 9, 0F,0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -3.75F, 0.5F, 0F, -3.75F, 0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -3.75F, 0.5F, 0F, -3.75F); // Import ImportBox1
		gunModel[305].setRotationPoint(-98F, -29F, 2.5F);

		gunModel[306].addShapeBox(0F, 0F, 0F, 18, 2, 9, 0F,0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -3.75F, 0.5F, 0F, -3.75F, -2.5F, 0.5F, -4F, -4.5F, 0.5F, -4F, -4.5F, 0.5F, -3.75F, -2.5F, 0.5F, -3.75F); // Import ImportBox1
		gunModel[306].setRotationPoint(-98F, -26F, 2.5F);

		gunModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[307].setRotationPoint(-96F, -28F, 7F);

		gunModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[308].setRotationPoint(-85.5F, -28F, 7F);

		gunModel[309].addShapeBox(0F, 0F, 0F, 29, 5, 9, 0F,0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Import ImportBox1
		gunModel[309].setRotationPoint(-67F, -36.5F, -3F);

		gunModel[310].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[310].setRotationPoint(-103F, 17.5F, -2.5F);

		gunModel[311].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[311].setRotationPoint(-104F, 19.5F, -3.5F);

		gunModel[312].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[312].setRotationPoint(-103.5F, 20.5F, -3F);

		gunModel[313].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[313].setRotationPoint(-104F, 21.5F, -3.5F);

		gunModel[314].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[314].setRotationPoint(-104F, 23.5F, -3.5F);

		gunModel[315].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[315].setRotationPoint(-108F, 24.5F, -3F);

		gunModel[316].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[316].setRotationPoint(-108F, 20.5F, -3F);

		gunModel[317].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Import ImportBox1
		gunModel[317].setRotationPoint(-114F, 20.5F, -3F);

		gunModel[318].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[318].setRotationPoint(-112F, 20.5F, -3F);

		gunModel[319].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[319].setRotationPoint(-112F, 25.5F, -3F);

		gunModel[320].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[320].setRotationPoint(-102.5F, 26.5F, -2F);

		gunModel[321].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0.25F, 0F, -2.75F, 0.25F, 0F, -2.75F, 0.25F, 0F, 1F, 0.25F, 0F); // Import ImportBox1
		gunModel[321].setRotationPoint(-122.5F, -22.5F, -4F);

		gunModel[322].addShapeBox(0F, 0F, 0F, 6, 4, 8, 0F,1F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0.25F, 0F, -2.75F, 0.25F, 0F, -2.75F, 0.25F, 0F, 1F, 0.25F, 0F); // Import ImportBox1
		gunModel[322].setRotationPoint(-122.5F, -19.5F, -4F);

		gunModel[323].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,1F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0.25F, -1F, -2.75F, 0.25F, -1F, -2.75F, 0.25F, -1F, 1F, 0.25F, -1F); // Import ImportBox1
		gunModel[323].setRotationPoint(-122.5F, -15.5F, -4F);

		gunModel[324].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox1
		gunModel[324].setRotationPoint(-119F, -15.5F, -2F);

		gunModel[325].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[325].setRotationPoint(-119F, -17.5F, -2F);

		gunModel[326].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[326].setRotationPoint(-119F, -16.5F, -2F);

		gunModel[327].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox1
		gunModel[327].setRotationPoint(-119F, -14.5F, -2F);

		gunModel[328].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, -1F); // Import ImportBox1
		gunModel[328].setRotationPoint(-119F, -12.5F, -2F);

		gunModel[329].addShapeBox(0F, 0F, 0F, 3, 10, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox1
		gunModel[329].setRotationPoint(-121F, -9.5F, -2F);

		gunModel[330].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[330].setRotationPoint(-120F, -17F, -1F);

		gunModel[331].addShapeBox(0F, 0F, 0F, 5, 12, 4, 0F,1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 1F, 1F, 0F); // Import ImportBox1
		gunModel[331].setRotationPoint(-121.5F, -36.5F, -6F);

		gunModel[332].addShapeBox(0F, 0F, 0F, 3, 12, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 1F, 0F); // Import ImportBox1
		gunModel[332].setRotationPoint(-117F, -36.5F, -6F);

		gunModel[333].addShapeBox(0F, 0F, 0F, 34, 12, 4, 0F,2F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 2F, 1F, 0F, 0F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, -2F, 0F); // Import ImportBox1
		gunModel[333].setRotationPoint(-111.75F, -33.5F, -6F);

		gunModel[334].addShapeBox(0F, 0F, 0F, 35, 3, 4, 0F,0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 2F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 2F, 1F, 0F); // Import ImportBox1
		gunModel[334].setRotationPoint(-111.75F, -38.5F, -6F);

		gunModel[335].addShapeBox(0F, 0F, 0F, 19, 1, 8, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F); // Import ImportBox1
		gunModel[335].setRotationPoint(-95.5F, -23.5F, -6F);

		gunModel[336].addShapeBox(0F, 0F, 0F, 18, 9, 9, 0F,-3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -8.99F, 0.5F, 0F, -8.99F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox1
		gunModel[336].setRotationPoint(-80.5F, -31.25F, -6F);

		gunModel[337].addShapeBox(0F, 0F, 0F, 35, 3, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import ImportBox1
		gunModel[337].setRotationPoint(-76.5F, -31.5F, -6F);

		gunModel[338].addShapeBox(0F, 0F, 0F, 29, 5, 12, 0F,0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		gunModel[338].setRotationPoint(-67F, -41.5F, -6F);

		gunModel[339].addShapeBox(0F, 0F, 0F, 84, 1, 1, 0F,1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0.5F, 0.55F, -1F, 0.5F, 0.55F, -1F, 0.5F, 0F, 1F, 0.5F, 0F); // Import ImportBox1
		gunModel[339].setRotationPoint(-121.5F, -41.5F, -3F);

		gunModel[340].addShapeBox(0F, 0F, 0F, 84, 1, 1, 0F,1F, 0.5F, 0.55F, -1F, 0.5F, 0.55F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F); // Import ImportBox1
		gunModel[340].setRotationPoint(-121.5F, -39.5F, -3F);

		gunModel[341].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[341].setRotationPoint(-109F, -28.5F, -6.5F);

		gunModel[342].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[342].setRotationPoint(-84F, -28.5F, -6.5F);

		gunModel[343].addShapeBox(0F, 0F, 0F, 8, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[343].setRotationPoint(-99.5F, -30F, -6.5F);

		gunModel[344].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import ImportBox1
		gunModel[344].setRotationPoint(-101.5F, -30F, -6.5F);

		gunModel[345].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[345].setRotationPoint(-91.5F, -30F, -6.5F);

		gunModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[346].setRotationPoint(-101F, -28F, -6.75F);

		gunModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[347].setRotationPoint(-91F, -28F, -6.75F);

		gunModel[348].addShapeBox(0F, 0F, 0F, 35, 15, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Import ImportBox8
		gunModel[348].setRotationPoint(29.75F, -20F, -3.5F);

		gunModel[349].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[349].setRotationPoint(28.75F, -3.75F, -4F);

		gunModel[350].addShapeBox(0F, 0F, 0F, 4, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[350].setRotationPoint(35.75F, -1.75F, -4F);

		gunModel[351].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0F, 1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[351].setRotationPoint(39.75F, 3.25F, -4F);

		gunModel[352].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox8
		gunModel[352].setRotationPoint(50.75F, 3.25F, -4F);

		gunModel[353].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[353].setRotationPoint(41.25F, 3.75F, -4F);

		gunModel[354].addShapeBox(0F, 0F, 0F, 4, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[354].setRotationPoint(51.75F, -1.75F, -4F);

		gunModel[355].addShapeBox(0F, 0F, 0F, 14, 2, 7, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[355].setRotationPoint(51.75F, -3.75F, -3F);

		gunModel[356].addShapeBox(0F, 0F, 0F, 7, 11, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[356].setRotationPoint(28.75F, -1.75F, -3.5F);

		gunModel[357].addShapeBox(0F, 0F, 0F, 10, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[357].setRotationPoint(40.75F, 4.25F, -3.5F);

		gunModel[358].addShapeBox(0F, 0F, 0F, 10, 11, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[358].setRotationPoint(55.75F, -1.75F, -3.5F);

		gunModel[359].addShapeBox(0F, 0F, 0F, 12, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		gunModel[359].setRotationPoint(39.75F, -3.75F, -3.5F);

		gunModel[360].addShapeBox(0F, 0F, 0F, 18, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[360].setRotationPoint(109.25F, -51F, -4.5F);

		gunModel[361].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Import ImportBox1
		gunModel[361].setRotationPoint(109.25F, -50F, 4.5F);

		gunModel[362].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[362].setRotationPoint(109.25F, -50F, -5.5F);

		gunModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox1
		gunModel[363].setRotationPoint(122.25F, -48F, 4.5F);

		gunModel[364].addShapeBox(0F, 0F, 0F, 11, 3, 9, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Import ImportBox1
		gunModel[364].setRotationPoint(127.75F, -50F, -4.5F);

		gunModel[365].addShapeBox(0F, 0F, 0F, 11, 4, 9, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[365].setRotationPoint(127.25F, -46F, -4.5F);

		gunModel[366].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportBox1
		gunModel[366].setRotationPoint(127.75F, -47F, 7.5F);

		gunModel[367].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0.75F, -2F, 0F, 0.75F, -2F, 0F, -0.75F, -2F, 0F, -0.75F); // Import ImportBox1
		gunModel[367].setRotationPoint(127.75F, -43F, 9.75F);

		gunModel[368].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox1
		gunModel[368].setRotationPoint(127.75F, -47F, -9.5F);

		gunModel[369].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, 0.75F, -2F, 0F, 0.75F); // Import ImportBox1
		gunModel[369].setRotationPoint(127.75F, -43F, -11.75F);

		gunModel[370].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		gunModel[370].setRotationPoint(127.25F, -47F, -4F);

		gunModel[371].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox1
		gunModel[371].setRotationPoint(128.75F, 29F, 20.75F);

		gunModel[372].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[372].setRotationPoint(131.75F, 29F, 20.75F);

		gunModel[373].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[373].setRotationPoint(134.75F, 29F, 20.75F);

		gunModel[374].addShapeBox(0F, 0F, 0F, 1, 68, 3, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -17.75F, 0.25F, 0F, -17.75F, 0.25F, 0F, 18.25F, 0.25F, 0F, 18.25F); // Import ImportBox1
		gunModel[374].setRotationPoint(132.75F, -39.25F, 6.25F);

		gunModel[375].addShapeBox(0F, 0F, 0F, 1, 68, 3, 0F,0F, 0F, 0.25F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, -17.75F, 0.25F, 0F, -19F, 0.25F, 0F, 17F, 0F, 0F, 18.25F); // Import ImportBox1
		gunModel[375].setRotationPoint(134F, -39.25F, 6.25F);

		gunModel[376].addShapeBox(0F, 0F, 0F, 1, 68, 3, 0F,0.25F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, -1F, 0.25F, 0F, -19F, 0F, 0F, -17.75F, 0F, 0F, 18.25F, 0.25F, 0F, 17F); // Import ImportBox1
		gunModel[376].setRotationPoint(131.5F, -39.25F, 6.25F);

		gunModel[377].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, 1.75F); // Import ImportBox1
		gunModel[377].setRotationPoint(132.25F, -46F, 3.25F);

		gunModel[378].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -3.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 1.75F); // Import ImportBox1
		gunModel[378].setRotationPoint(133.75F, -46F, 3.25F);

		gunModel[379].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -3.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, 0.25F); // Import ImportBox1
		gunModel[379].setRotationPoint(130.75F, -46F, 3.25F);

		gunModel[380].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 1.5F); // Import ImportBox1
		gunModel[380].setRotationPoint(132.25F, -19F, 10.75F);

		gunModel[381].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1.5F); // Import ImportBox1
		gunModel[381].setRotationPoint(133.75F, -19F, 10.75F);

		gunModel[382].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0F); // Import ImportBox1
		gunModel[382].setRotationPoint(130.75F, -19F, 10.75F);

		gunModel[383].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 1.5F); // Import ImportBox1
		gunModel[383].setRotationPoint(132.25F, 22.25F, 21.5F);

		gunModel[384].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1.5F); // Import ImportBox1
		gunModel[384].setRotationPoint(133.75F, 22.25F, 21.5F);

		gunModel[385].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0F); // Import ImportBox1
		gunModel[385].setRotationPoint(130.75F, 22.25F, 21.5F);

		gunModel[386].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.25F, -5.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -5.25F, 1.25F, -0.25F, -0.25F, -1.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 2F); // Import ImportBox1
		gunModel[386].setRotationPoint(129.25F, 22.25F, 23F);

		gunModel[387].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox1
		gunModel[387].setRotationPoint(129.25F, 23F, 24F);

		gunModel[388].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F); // Import ImportBox1
		gunModel[388].setRotationPoint(132.25F, -46F, -8.25F);

		gunModel[389].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -3.75F, -0.25F, -0.25F, -2.25F); // Import ImportBox1
		gunModel[389].setRotationPoint(133.75F, -46F, -8.25F);

		gunModel[390].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -3.75F); // Import ImportBox1
		gunModel[390].setRotationPoint(130.75F, -46F, -8.25F);

		gunModel[391].addShapeBox(0F, 0F, 0F, 1, 68, 3, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 18.25F, 0.25F, 0F, 18.25F, 0.25F, 0F, -17.75F, 0.25F, 0F, -17.75F); // Import ImportBox1
		gunModel[391].setRotationPoint(132.75F, -39.25F, -9.25F);

		gunModel[392].addShapeBox(0F, 0F, 0F, 1, 68, 3, 0F,0F, 0F, 0.25F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 18.25F, 0.25F, 0F, 17F, 0.25F, 0F, -19F, 0F, 0F, -17.75F); // Import ImportBox1
		gunModel[392].setRotationPoint(134F, -39.25F, -9.25F);

		gunModel[393].addShapeBox(0F, 0F, 0F, 1, 68, 3, 0F,0.25F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, -1F, 0.25F, 0F, 17F, 0F, 0F, 18.25F, 0F, 0F, -17.75F, 0.25F, 0F, -19F); // Import ImportBox1
		gunModel[393].setRotationPoint(131.5F, -39.25F, -9.25F);

		gunModel[394].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F); // Import ImportBox1
		gunModel[394].setRotationPoint(132.25F, -19F, -15.75F);

		gunModel[395].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -2F); // Import ImportBox1
		gunModel[395].setRotationPoint(133.75F, -19F, -15.75F);

		gunModel[396].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -3.5F); // Import ImportBox1
		gunModel[396].setRotationPoint(130.75F, -19F, -15.75F);

		gunModel[397].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox1
		gunModel[397].setRotationPoint(128.75F, 29F, -29.75F);

		gunModel[398].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[398].setRotationPoint(131.75F, 29F, -29.75F);

		gunModel[399].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[399].setRotationPoint(134.75F, 29F, -29.75F);

		gunModel[400].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F); // Import ImportBox1
		gunModel[400].setRotationPoint(132.25F, 22.25F, -26.5F);

		gunModel[401].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -2F); // Import ImportBox1
		gunModel[401].setRotationPoint(133.75F, 22.25F, -26.5F);

		gunModel[402].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -3.5F); // Import ImportBox1
		gunModel[402].setRotationPoint(130.75F, 22.25F, -26.5F);

		gunModel[403].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.25F, -5.25F, 1.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -5.25F, -0.75F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -1.5F); // Import ImportBox1
		gunModel[403].setRotationPoint(129.25F, 22.25F, -25F);

		gunModel[404].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox1
		gunModel[404].setRotationPoint(129.25F, 23F, -25F);

		gunModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[405].setRotationPoint(128.5F, -49F, -7F);

		gunModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[406].setRotationPoint(137F, -49F, -7F);

		gunModel[407].addShapeBox(-4F, -3F, 0F, 18, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, -1.05F, 0F, -0.7F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, -0.23F, 0F, -1.77F, -0.23F); // Import Box430
		gunModel[407].setRotationPoint(-63F, -26F, 0F);

		gunModel[408].addShapeBox(-4F, -2F, 0F, 18, 2, 3, 0F,0F, -0.23F, -1.77F, 0F, -0.23F, -1.77F, 0F, -1.05F, -0.7F, 0F, -1.05F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box431
		gunModel[408].setRotationPoint(-63F, -26F, 0F);

		gunModel[409].addShapeBox(-4F, -2F, -3F, 18, 2, 3, 0F,0F, -1.05F, -0.7F, 0F, -1.05F, -0.7F, 0F, -0.23F, -1.77F, 0F, -0.23F, -1.77F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box436
		gunModel[409].setRotationPoint(-63F, -26F, 0F);

		gunModel[410].addShapeBox(-4F, -3F, -2F, 18, 3, 2, 0F,0F, -0.7F, -1.05F, 0F, -0.7F, -1.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.77F, -0.23F, 0F, -1.77F, -0.23F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box437
		gunModel[410].setRotationPoint(-63F, -26F, 0F);

		gunModel[411].addShapeBox(-5F, -2F, 0F, 23, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -1.23F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.42F, -0.58F); // Import Box440
		gunModel[411].setRotationPoint(-63F, -26F, 0F);

		gunModel[412].addShapeBox(-5F, -2F, 0F, 23, 2, 2, 0F,0F, -0.58F, -1.42F, 0F, -0.58F, -1.42F, 0F, -1.23F, -0.15F, 0F, -1.23F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box441
		gunModel[412].setRotationPoint(-63F, -26F, 0F);

		gunModel[413].addShapeBox(-5F, -2F, -2F, 23, 2, 2, 0F,0F, -0.15F, -1.23F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.42F, -0.58F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box446
		gunModel[413].setRotationPoint(-63F, -26F, 0F);

		gunModel[414].addShapeBox(-5F, -2F, -2F, 23, 2, 2, 0F,0F, -1.23F, -0.15F, 0F, -1.23F, -0.15F, 0F, -0.58F, -1.42F, 0F, -0.58F, -1.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box447
		gunModel[414].setRotationPoint(-63F, -26F, 0F);

		gunModel[415].addShapeBox(-6F, -2F, 0F, 1, 2, 3, 0F,0F, -0.23F, -1.77F, 0F, -0.23F, -1.77F, 0F, -1.05F, -0.7F, 0F, -1.05F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box128
		gunModel[415].setRotationPoint(-63F, -26F, 0F);

		gunModel[416].addShapeBox(-6F, -2F, -3F, 1, 2, 3, 0F,0F, -1.05F, -0.7F, 0F, -1.05F, -0.7F, 0F, -0.23F, -1.77F, 0F, -0.23F, -1.77F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		gunModel[416].setRotationPoint(-63F, -26F, 0F);

		gunModel[417].addShapeBox(-6F, -3F, -2F, 1, 3, 2, 0F,0F, -0.7F, -1.05F, 0F, -0.7F, -1.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.77F, -0.23F, 0F, -1.77F, -0.23F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box134
		gunModel[417].setRotationPoint(-63F, -26F, 0F);

		gunModel[418].addShapeBox(-6F, -3F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, -1.05F, 0F, -0.7F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, -0.23F, 0F, -1.77F, -0.23F); // Import Box135
		gunModel[418].setRotationPoint(-63F, -26F, 0F);

		gunModel[419].addShapeBox(5F, -2F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.575F, -1.405F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.095F, -0.905F, 0F, -1.42F, -0.58F); // Import Box136
		gunModel[419].setRotationPoint(-50F, -26F, 0F);

		gunModel[420].addShapeBox(5F, -2F, 0F, 9, 2, 2, 0F,0F, -0.58F, -1.42F, 0F, -0.905F, -1.095F, 0F, -1.405F, -0.575F, 0F, -1.23F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import Box137
		gunModel[420].setRotationPoint(-50F, -26F, 0F);

		gunModel[421].addShapeBox(5F, -2F, -2F, 9, 2, 2, 0F,0F, -1.23F, -0.15F, 0F, -1.405F, -0.575F, 0F, -0.905F, -1.095F, 0F, -0.58F, -1.42F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
		gunModel[421].setRotationPoint(-50F, -26F, 0F);

		gunModel[422].addShapeBox(5F, -2F, -2F, 9, 2, 2, 0F,0F, -0.15F, -1.23F, 0F, -0.575F, -1.405F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.095F, -0.905F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box149
		gunModel[422].setRotationPoint(-50F, -26F, 0F);

		gunModel[423].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		gunModel[423].setRotationPoint(109.25F, -48F, -9F);

		gunModel[424].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1
		gunModel[424].setRotationPoint(109.25F, -48F, 7F);

		gunModel[425].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 12
		gunModel[425].setRotationPoint(-102.75F, 33F, -5.5F);

		gunModel[426].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,-0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -4.5F, -0.25F, 0.5F, -4.5F, -0.25F, 0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -4.5F, -0.25F, 0F, -4.5F, -0.25F, 0F, -0.75F); // Box 13
		gunModel[426].setRotationPoint(-99.25F, 33F, -6F);

		gunModel[427].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,-0.25F, 0.5F, -4.5F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -4.5F, -0.25F, 0F, -4.5F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -4.5F); // Box 14
		gunModel[427].setRotationPoint(-106.25F, 33F, -6F);

		gunModel[428].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[428].setRotationPoint(41.75F, -1.5F, -4.5F);

		gunModel[429].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[429].setRotationPoint(41.25F, -3.5F, -4F);

		gunModel[430].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[430].setRotationPoint(41.75F, 0.5F, -4.5F);

		gunModel[431].addShapeBox(0F, 0F, 0F, 9, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[431].setRotationPoint(41.25F, -1.5F, -4F);

		gunModel[432].addShapeBox(0F, 0F, 0F, 17, 2, 16, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[432].setRotationPoint(75.25F, -23F, -8F);

		gunModel[433].addShapeBox(0F, 0F, 0F, 5, 2, 16, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[433].setRotationPoint(99.25F, -23F, -8F);

		gunModel[434].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 21
		gunModel[434].setRotationPoint(111.25F, -25F, -8F);

		gunModel[435].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[435].setRotationPoint(111.25F, -23F, -8F);

		gunModel[436].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 23
		gunModel[436].setRotationPoint(85.5F, -35.5F, -6F);

		gunModel[437].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 24
		gunModel[437].setRotationPoint(101F, -35.5F, -6F);

		gunModel[438].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,-1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 25
		gunModel[438].setRotationPoint(101F, -33.5F, -6F);

		gunModel[439].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 26
		gunModel[439].setRotationPoint(116F, -35.5F, -6F);

		gunModel[440].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,-1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		gunModel[440].setRotationPoint(116F, -33.5F, -6F);

		gunModel[441].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 28
		gunModel[441].setRotationPoint(131.5F, -35.5F, -6F);

		gunModel[442].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,-1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 29
		gunModel[442].setRotationPoint(131.5F, -33.5F, -6F);

		gunModel[443].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 30
		gunModel[443].setRotationPoint(146.5F, -35.5F, -6F);

		gunModel[444].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,-1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 31
		gunModel[444].setRotationPoint(146.5F, -33.5F, -6F);

		gunModel[445].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 32
		gunModel[445].setRotationPoint(161.5F, -35.5F, -6F);

		gunModel[446].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,-1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		gunModel[446].setRotationPoint(161.5F, -33.5F, -6F);

		gunModel[447].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F); // Box 34
		gunModel[447].setRotationPoint(105.75F, -28.5F, -10F);

		gunModel[448].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,-1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F); // Box 35
		gunModel[448].setRotationPoint(105.75F, -27F, -10F);

		gunModel[449].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[449].setRotationPoint(-28.75F, -44.25F, -4F);

		gunModel[450].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[450].setRotationPoint(-28.75F, -43.75F, -4F);

		gunModel[451].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[451].setRotationPoint(-24.75F, -43.75F, -4F);

		gunModel[452].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		gunModel[452].setRotationPoint(-24.75F, -44.25F, -4F);

		gunModel[453].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[453].setRotationPoint(-20.75F, -43.75F, -4F);

		gunModel[454].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[454].setRotationPoint(-20.75F, -44.25F, -4F);

		gunModel[455].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[455].setRotationPoint(-16.75F, -44.25F, -4F);

		gunModel[456].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[456].setRotationPoint(-16.75F, -43.75F, -4F);

		gunModel[457].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[457].setRotationPoint(-12.75F, -44.25F, -4F);

		gunModel[458].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[458].setRotationPoint(-12.75F, -43.75F, -4F);

		gunModel[459].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[459].setRotationPoint(-8.75F, -44.25F, -4F);

		gunModel[460].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[460].setRotationPoint(-8.75F, -43.75F, -4F);

		gunModel[461].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[461].setRotationPoint(-4.75F, -44.25F, -4F);

		gunModel[462].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[462].setRotationPoint(-4.75F, -43.75F, -4F);

		gunModel[463].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[463].setRotationPoint(-0.75F, -44.25F, -4F);

		gunModel[464].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		gunModel[464].setRotationPoint(-0.75F, -43.75F, -4F);

		gunModel[465].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		gunModel[465].setRotationPoint(3.25F, -44.25F, -4F);

		gunModel[466].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[466].setRotationPoint(3.25F, -43.75F, -4F);

		gunModel[467].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[467].setRotationPoint(7.25F, -44.25F, -4F);

		gunModel[468].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[468].setRotationPoint(7.25F, -43.75F, -4F);

		gunModel[469].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[469].setRotationPoint(11.25F, -44.25F, -4F);

		gunModel[470].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[470].setRotationPoint(11.25F, -43.75F, -4F);

		gunModel[471].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		gunModel[471].setRotationPoint(15.25F, -44.25F, -4F);

		gunModel[472].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[472].setRotationPoint(15.25F, -43.75F, -4F);

		gunModel[473].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		gunModel[473].setRotationPoint(19.25F, -44.25F, -4F);

		gunModel[474].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[474].setRotationPoint(19.25F, -43.75F, -4F);

		gunModel[475].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		gunModel[475].setRotationPoint(23.25F, -44.25F, -4F);

		gunModel[476].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		gunModel[476].setRotationPoint(23.25F, -43.75F, -4F);

		gunModel[477].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[477].setRotationPoint(27.25F, -44.25F, -4F);

		gunModel[478].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[478].setRotationPoint(27.25F, -43.75F, -4F);

		gunModel[479].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[479].setRotationPoint(31.25F, -44.25F, -4F);

		gunModel[480].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		gunModel[480].setRotationPoint(31.25F, -43.75F, -4F);

		gunModel[481].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[481].setRotationPoint(35.25F, -44.25F, -4F);

		gunModel[482].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[482].setRotationPoint(35.25F, -43.75F, -4F);

		gunModel[483].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		gunModel[483].setRotationPoint(39.25F, -44.25F, -4F);

		gunModel[484].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[484].setRotationPoint(39.25F, -43.75F, -4F);

		gunModel[485].addShapeBox(0F, 0F, 0F, 37, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		gunModel[485].setRotationPoint(43.25F, -44.25F, -4F);

		gunModel[486].addShapeBox(0F, 0F, 0F, 37, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		gunModel[486].setRotationPoint(43.25F, -43.75F, -4F);

		gunModel[487].addShapeBox(0F, 0F, 0F, 89, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		gunModel[487].setRotationPoint(80.25F, -42.5F, -2.5F);

		gunModel[488].addShapeBox(0F, 0F, 0F, 89, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 75
		gunModel[488].setRotationPoint(80.25F, -42.75F, -4F);

		gunModel[489].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		gunModel[489].setRotationPoint(82.25F, -44.25F, -4F);

		gunModel[490].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		gunModel[490].setRotationPoint(82.25F, -43.75F, -4F);

		gunModel[491].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		gunModel[491].setRotationPoint(86.25F, -44.25F, -4F);

		gunModel[492].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		gunModel[492].setRotationPoint(86.25F, -43.75F, -4F);

		gunModel[493].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		gunModel[493].setRotationPoint(90.25F, -44.25F, -4F);

		gunModel[494].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[494].setRotationPoint(90.25F, -43.75F, -4F);

		gunModel[495].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		gunModel[495].setRotationPoint(94.25F, -44.25F, -4F);

		gunModel[496].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		gunModel[496].setRotationPoint(94.25F, -43.75F, -4F);

		gunModel[497].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[497].setRotationPoint(98.25F, -44.25F, -4F);

		gunModel[498].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		gunModel[498].setRotationPoint(98.25F, -43.75F, -4F);

		gunModel[499].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		gunModel[499].setRotationPoint(102.25F, -44.25F, -4F);
	}

	private void initgunModel_2()
	{
		gunModel[500] = new ModelRendererTurbo(this, 201, 377, textureX, textureY); // Box 87
		gunModel[501] = new ModelRendererTurbo(this, 273, 377, textureX, textureY); // Box 88
		gunModel[502] = new ModelRendererTurbo(this, 353, 377, textureX, textureY); // Box 89
		gunModel[503] = new ModelRendererTurbo(this, 585, 377, textureX, textureY); // Box 92
		gunModel[504] = new ModelRendererTurbo(this, 609, 377, textureX, textureY); // Box 93
		gunModel[505] = new ModelRendererTurbo(this, 633, 377, textureX, textureY); // Box 94
		gunModel[506] = new ModelRendererTurbo(this, 657, 377, textureX, textureY); // Box 95
		gunModel[507] = new ModelRendererTurbo(this, 681, 377, textureX, textureY); // Box 96
		gunModel[508] = new ModelRendererTurbo(this, 793, 377, textureX, textureY); // Box 97
		gunModel[509] = new ModelRendererTurbo(this, 817, 377, textureX, textureY); // Box 98
		gunModel[510] = new ModelRendererTurbo(this, 841, 377, textureX, textureY); // Box 99
		gunModel[511] = new ModelRendererTurbo(this, 865, 377, textureX, textureY); // Box 100
		gunModel[512] = new ModelRendererTurbo(this, 889, 377, textureX, textureY); // Box 101
		gunModel[513] = new ModelRendererTurbo(this, 913, 377, textureX, textureY); // Box 102
		gunModel[514] = new ModelRendererTurbo(this, 937, 377, textureX, textureY); // Box 103
		gunModel[515] = new ModelRendererTurbo(this, 961, 377, textureX, textureY); // Box 104
		gunModel[516] = new ModelRendererTurbo(this, 985, 377, textureX, textureY); // Box 105
		gunModel[517] = new ModelRendererTurbo(this, 217, 385, textureX, textureY); // Box 106
		gunModel[518] = new ModelRendererTurbo(this, 241, 385, textureX, textureY); // Box 107

		gunModel[500].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		gunModel[500].setRotationPoint(102.25F, -43.75F, -4F);

		gunModel[501].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		gunModel[501].setRotationPoint(106.25F, -44.25F, -4F);

		gunModel[502].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		gunModel[502].setRotationPoint(106.25F, -43.75F, -4F);

		gunModel[503].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		gunModel[503].setRotationPoint(167.25F, -44.25F, -4F);

		gunModel[504].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		gunModel[504].setRotationPoint(167.25F, -43.75F, -4F);

		gunModel[505].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		gunModel[505].setRotationPoint(163.25F, -44.25F, -4F);

		gunModel[506].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		gunModel[506].setRotationPoint(163.25F, -43.75F, -4F);

		gunModel[507].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		gunModel[507].setRotationPoint(159.25F, -44.25F, -4F);

		gunModel[508].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		gunModel[508].setRotationPoint(159.25F, -43.75F, -4F);

		gunModel[509].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		gunModel[509].setRotationPoint(155.25F, -44.25F, -4F);

		gunModel[510].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		gunModel[510].setRotationPoint(155.25F, -43.75F, -4F);

		gunModel[511].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		gunModel[511].setRotationPoint(151.25F, -44.25F, -4F);

		gunModel[512].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		gunModel[512].setRotationPoint(151.25F, -43.75F, -4F);

		gunModel[513].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		gunModel[513].setRotationPoint(147.25F, -44.25F, -4F);

		gunModel[514].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gunModel[514].setRotationPoint(147.25F, -43.75F, -4F);

		gunModel[515].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		gunModel[515].setRotationPoint(143.25F, -44.25F, -4F);

		gunModel[516].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		gunModel[516].setRotationPoint(143.25F, -43.75F, -4F);

		gunModel[517].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		gunModel[517].setRotationPoint(139.25F, -44.25F, -4F);

		gunModel[518].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[518].setRotationPoint(139.25F, -43.75F, -4F);
	}

	private void initdefaultScopeModel_1()
	{
		defaultScopeModel[0] = new ModelRendererTurbo(this, 57, 257, textureX, textureY); // Import Box736
		defaultScopeModel[1] = new ModelRendererTurbo(this, 113, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[2] = new ModelRendererTurbo(this, 201, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[3] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Import ImportBox1
		defaultScopeModel[4] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[5] = new ModelRendererTurbo(this, 321, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[6] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[7] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Import ImportBox1
		defaultScopeModel[8] = new ModelRendererTurbo(this, 697, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[9] = new ModelRendererTurbo(this, 721, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[10] = new ModelRendererTurbo(this, 753, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[11] = new ModelRendererTurbo(this, 801, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[12] = new ModelRendererTurbo(this, 825, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[13] = new ModelRendererTurbo(this, 857, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[14] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import ImportBox1
		defaultScopeModel[15] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Import ImportBox1
		defaultScopeModel[16] = new ModelRendererTurbo(this, 65, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[17] = new ModelRendererTurbo(this, 217, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[18] = new ModelRendererTurbo(this, 873, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[19] = new ModelRendererTurbo(this, 385, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[20] = new ModelRendererTurbo(this, 905, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[21] = new ModelRendererTurbo(this, 937, 257, textureX, textureY); // Import ImportBox1
		defaultScopeModel[22] = new ModelRendererTurbo(this, 977, 257, textureX, textureY); // Import Box567
		defaultScopeModel[23] = new ModelRendererTurbo(this, 169, 265, textureX, textureY); // Import Box568
		defaultScopeModel[24] = new ModelRendererTurbo(this, 465, 265, textureX, textureY); // Import Box569
		defaultScopeModel[25] = new ModelRendererTurbo(this, 505, 265, textureX, textureY); // Import Box570
		defaultScopeModel[26] = new ModelRendererTurbo(this, 569, 265, textureX, textureY); // Import Box571
		defaultScopeModel[27] = new ModelRendererTurbo(this, 609, 265, textureX, textureY); // Import Box572
		defaultScopeModel[28] = new ModelRendererTurbo(this, 649, 265, textureX, textureY); // Import Box573
		defaultScopeModel[29] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Import Box574
		defaultScopeModel[30] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Import Box0
		defaultScopeModel[31] = new ModelRendererTurbo(this, 569, 281, textureX, textureY); // Import Box1
		defaultScopeModel[32] = new ModelRendererTurbo(this, 801, 281, textureX, textureY); // Import Box2
		defaultScopeModel[33] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Import Box3
		defaultScopeModel[34] = new ModelRendererTurbo(this, 153, 297, textureX, textureY); // Import Box4
		defaultScopeModel[35] = new ModelRendererTurbo(this, 569, 297, textureX, textureY); // Import Box5
		defaultScopeModel[36] = new ModelRendererTurbo(this, 801, 297, textureX, textureY); // Import Box6
		defaultScopeModel[37] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Import Box7
		defaultScopeModel[38] = new ModelRendererTurbo(this, 193, 281, textureX, textureY); // Import Box709
		defaultScopeModel[39] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Import Box716
		defaultScopeModel[40] = new ModelRendererTurbo(this, 321, 297, textureX, textureY); // Import Box717
		defaultScopeModel[41] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Import Box718
		defaultScopeModel[42] = new ModelRendererTurbo(this, 465, 305, textureX, textureY); // Import Box719
		defaultScopeModel[43] = new ModelRendererTurbo(this, 153, 313, textureX, textureY); // Import Box720
		defaultScopeModel[44] = new ModelRendererTurbo(this, 305, 313, textureX, textureY); // Import Box721
		defaultScopeModel[45] = new ModelRendererTurbo(this, 561, 313, textureX, textureY); // Import Box722
		defaultScopeModel[46] = new ModelRendererTurbo(this, 953, 273, textureX, textureY); // Import Box418
		defaultScopeModel[47] = new ModelRendererTurbo(this, 721, 281, textureX, textureY); // Import Box419
		defaultScopeModel[48] = new ModelRendererTurbo(this, 945, 289, textureX, textureY); // Import Box420
		defaultScopeModel[49] = new ModelRendererTurbo(this, 721, 297, textureX, textureY); // Import Box421
		defaultScopeModel[50] = new ModelRendererTurbo(this, 977, 297, textureX, textureY); // Import Box422
		defaultScopeModel[51] = new ModelRendererTurbo(this, 241, 313, textureX, textureY); // Import Box423
		defaultScopeModel[52] = new ModelRendererTurbo(this, 273, 265, textureX, textureY); // Import Box731
		defaultScopeModel[53] = new ModelRendererTurbo(this, 761, 273, textureX, textureY); // Import Box732
		defaultScopeModel[54] = new ModelRendererTurbo(this, 1001, 273, textureX, textureY); // Import Box733
		defaultScopeModel[55] = new ModelRendererTurbo(this, 281, 281, textureX, textureY); // Import Box734
		defaultScopeModel[56] = new ModelRendererTurbo(this, 761, 289, textureX, textureY); // Import Box735
		defaultScopeModel[57] = new ModelRendererTurbo(this, 761, 305, textureX, textureY); // Import Box737
		defaultScopeModel[58] = new ModelRendererTurbo(this, 945, 305, textureX, textureY); // Import Box738
		defaultScopeModel[59] = new ModelRendererTurbo(this, 281, 313, textureX, textureY); // Import Box749
		defaultScopeModel[60] = new ModelRendererTurbo(this, 401, 273, textureX, textureY); // Import Box750
		defaultScopeModel[61] = new ModelRendererTurbo(this, 401, 313, textureX, textureY); // Import Box751
		defaultScopeModel[62] = new ModelRendererTurbo(this, 649, 313, textureX, textureY); // Import Box752
		defaultScopeModel[63] = new ModelRendererTurbo(this, 665, 313, textureX, textureY); // Import Box753
		defaultScopeModel[64] = new ModelRendererTurbo(this, 681, 313, textureX, textureY); // Import Box754
		defaultScopeModel[65] = new ModelRendererTurbo(this, 705, 313, textureX, textureY); // Import Box755
		defaultScopeModel[66] = new ModelRendererTurbo(this, 721, 313, textureX, textureY); // Import Box756
		defaultScopeModel[67] = new ModelRendererTurbo(this, 777, 313, textureX, textureY); // Import Box757
		defaultScopeModel[68] = new ModelRendererTurbo(this, 817, 313, textureX, textureY); // Import Box758
		defaultScopeModel[69] = new ModelRendererTurbo(this, 865, 313, textureX, textureY); // Import Box759
		defaultScopeModel[70] = new ModelRendererTurbo(this, 745, 313, textureX, textureY); // Import Box760
		defaultScopeModel[71] = new ModelRendererTurbo(this, 897, 313, textureX, textureY); // Import Box761
		defaultScopeModel[72] = new ModelRendererTurbo(this, 921, 313, textureX, textureY); // Import Box762
		defaultScopeModel[73] = new ModelRendererTurbo(this, 961, 313, textureX, textureY); // Import Box763
		defaultScopeModel[74] = new ModelRendererTurbo(this, 993, 313, textureX, textureY); // Import Box764
		defaultScopeModel[75] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Import Box765
		defaultScopeModel[76] = new ModelRendererTurbo(this, 441, 321, textureX, textureY); // Import Box766
		defaultScopeModel[77] = new ModelRendererTurbo(this, 473, 321, textureX, textureY); // Import Box767
		defaultScopeModel[78] = new ModelRendererTurbo(this, 497, 321, textureX, textureY); // Import Box768
		defaultScopeModel[79] = new ModelRendererTurbo(this, 513, 321, textureX, textureY); // Import Box769
		defaultScopeModel[80] = new ModelRendererTurbo(this, 529, 321, textureX, textureY); // Import Box770
		defaultScopeModel[81] = new ModelRendererTurbo(this, 761, 321, textureX, textureY); // Import Box771
		defaultScopeModel[82] = new ModelRendererTurbo(this, 945, 321, textureX, textureY); // Import Box772
		defaultScopeModel[83] = new ModelRendererTurbo(this, 1009, 321, textureX, textureY); // Import Box773
		defaultScopeModel[84] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Import Box774
		defaultScopeModel[85] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 2
		defaultScopeModel[86] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 3
		defaultScopeModel[87] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Box 4
		defaultScopeModel[88] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 5
		defaultScopeModel[89] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 6
		defaultScopeModel[90] = new ModelRendererTurbo(this, 697, 81, textureX, textureY); // Box 7
		defaultScopeModel[91] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 8
		defaultScopeModel[92] = new ModelRendererTurbo(this, 729, 329, textureX, textureY); // Box 9
		defaultScopeModel[93] = new ModelRendererTurbo(this, 905, 329, textureX, textureY); // Box 10
		defaultScopeModel[94] = new ModelRendererTurbo(this, 929, 329, textureX, textureY); // Box 11
		defaultScopeModel[95] = new ModelRendererTurbo(this, 289, 385, textureX, textureY); // Box 108
		defaultScopeModel[96] = new ModelRendererTurbo(this, 369, 385, textureX, textureY); // Box 109
		defaultScopeModel[97] = new ModelRendererTurbo(this, 409, 385, textureX, textureY); // Box 110
		defaultScopeModel[98] = new ModelRendererTurbo(this, 449, 385, textureX, textureY); // Box 111
		defaultScopeModel[99] = new ModelRendererTurbo(this, 521, 385, textureX, textureY); // Box 112
		defaultScopeModel[100] = new ModelRendererTurbo(this, 697, 385, textureX, textureY); // Box 113

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F,0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box736
		defaultScopeModel[0].setRotationPoint(-45.75F, -59F, -5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		defaultScopeModel[1].setRotationPoint(-9.75F, -45F, -5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 9, 5, 7, 0F,-2.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		defaultScopeModel[2].setRotationPoint(-9.75F, -52F, -3.5F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, -1.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1.5F, 0.5F, 0F); // Import ImportBox1
		defaultScopeModel[3].setRotationPoint(-8.75F, -53.5F, -3F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, 0.5F, 0F, 3F, 0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F); // Import ImportBox1
		defaultScopeModel[4].setRotationPoint(-8.75F, -57F, -3F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import ImportBox1
		defaultScopeModel[5].setRotationPoint(-8.75F, -61.5F, -6F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, 0.5F, 0F, 3F); // Import ImportBox1
		defaultScopeModel[6].setRotationPoint(-8.75F, -64.5F, -3F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import ImportBox1
		defaultScopeModel[7].setRotationPoint(18.25F, -53.5F, -3F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, 0.5F, 0F, 3F, 0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F); // Import ImportBox1
		defaultScopeModel[8].setRotationPoint(18.25F, -57F, -3F);

		defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import ImportBox1
		defaultScopeModel[9].setRotationPoint(18.25F, -61.5F, -6F);

		defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, 0.5F, 0F, 3F); // Import ImportBox1
		defaultScopeModel[10].setRotationPoint(18.25F, -64.5F, -3F);

		defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, 0.5F, 0F, 3F, -0.5F, 0.5F, 1F, -1.5F, 0.5F, 1F, -1.5F, 0.5F, 1F, -0.5F, 0.5F, 1F); // Import ImportBox1
		defaultScopeModel[11].setRotationPoint(4.25F, -57F, -3F);

		defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 9, 4, 12, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import ImportBox1
		defaultScopeModel[12].setRotationPoint(4.25F, -61.5F, -6F);

		defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,-0.5F, 0.5F, 1F, -1.5F, 0.5F, 1F, -1.5F, 0.5F, 1F, -0.5F, 0.5F, 1F, 0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, 0.5F, 0F, 3F); // Import ImportBox1
		defaultScopeModel[13].setRotationPoint(4.25F, -64.5F, -3F);

		defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,-2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox1
		defaultScopeModel[14].setRotationPoint(4.25F, -63F, 10F);

		defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox1
		defaultScopeModel[15].setRotationPoint(4.25F, -60.5F, 10F);

		defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 6, 2, 18, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		defaultScopeModel[16].setRotationPoint(5.25F, -62.25F, -8F);

		defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 6, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		defaultScopeModel[17].setRotationPoint(5.25F, -60.25F, -8F);

		defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 6, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox1
		defaultScopeModel[18].setRotationPoint(5.25F, -58.25F, -8F);

		defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 3, 5, 8, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import ImportBox1
		defaultScopeModel[19].setRotationPoint(6.75F, -70F, -4F);

		defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import ImportBox1
		defaultScopeModel[20].setRotationPoint(6.25F, -72F, -5.5F);

		defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,-0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -4.5F, -0.25F, 0.5F, -4.5F, -0.25F, 0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -4.5F, -0.25F, 0F, -4.5F, -0.25F, 0F, -0.75F); // Import ImportBox1
		defaultScopeModel[21].setRotationPoint(9.75F, -72F, -6F);

		defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 10, 9, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, -2.75F, 0F, -1.2F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Import Box567
		defaultScopeModel[22].setRotationPoint(64.25F, -68F, 0F);

		defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 10, 6, 9, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, -2.75F, -1.2F, 0F, -2.75F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box568
		defaultScopeModel[23].setRotationPoint(64.25F, -65F, 0F);

		defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 10, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -2.75F, -1.2F, 0F, -2.75F, -1.2F); // Import Box569
		defaultScopeModel[24].setRotationPoint(64.25F, -59F, 0F);

		defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 10, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, -2.75F, 0F, -1.2F, -2.75F); // Import Box570
		defaultScopeModel[25].setRotationPoint(64.25F, -59F, 0F);

		defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 10, 9, 6, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -2.75F, 0F, -1.2F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box571
		defaultScopeModel[26].setRotationPoint(64.25F, -59F, -6F);

		defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 10, 6, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, -1.2F, 0F, -2.75F, -1.2F, 0F, 0F, -6F, 0F, 0F, -6F); // Import Box572
		defaultScopeModel[27].setRotationPoint(64.25F, -59F, -9F);

		defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 10, 6, 9, 0F,0F, -2.75F, -1.2F, 0F, -2.75F, -1.2F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box573
		defaultScopeModel[28].setRotationPoint(64.25F, -65F, -9F);

		defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 10, 9, 6, 0F,0F, -1.2F, -2.75F, 0F, -1.2F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box574
		defaultScopeModel[29].setRotationPoint(64.25F, -68F, -6F);

		defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 69, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -2.05F, 0F, -0.4F, -2.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -0.45F, 0F, -3.55F, -0.45F); // Import Box0
		defaultScopeModel[30].setRotationPoint(-39.75F, -64F, 0F);

		defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 69, 4, 5, 0F,0F, -0.45F, -3.55F, 0F, -0.45F, -3.55F, 0F, -2.05F, -0.4F, 0F, -2.05F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		defaultScopeModel[31].setRotationPoint(-39.75F, -63F, 0F);

		defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 69, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -0.45F, 0F, -3.55F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -2.05F, 0F, -0.4F, -2.05F); // Import Box2
		defaultScopeModel[32].setRotationPoint(-39.75F, -59F, 0F);

		defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 69, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -3.55F, 0F, -0.45F, -3.55F, 0F, -2.05F, -0.4F, 0F, -2.05F, -0.4F); // Import Box3
		defaultScopeModel[33].setRotationPoint(-39.75F, -59F, 0F);

		defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 69, 5, 4, 0F,0F, -3.55F, -0.45F, 0F, -3.55F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -2.05F, 0F, -0.4F, -2.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		defaultScopeModel[34].setRotationPoint(-39.75F, -59F, -4F);

		defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 69, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.05F, -0.4F, 0F, -2.05F, -0.4F, 0F, -0.45F, -3.55F, 0F, -0.45F, -3.55F); // Import Box5
		defaultScopeModel[35].setRotationPoint(-39.75F, -59F, -5F);

		defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 69, 4, 5, 0F,0F, -2.05F, -0.4F, 0F, -2.05F, -0.4F, 0F, -0.45F, -3.55F, 0F, -0.45F, -3.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		defaultScopeModel[36].setRotationPoint(-39.75F, -63F, -5F);

		defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 69, 5, 4, 0F,0F, -0.4F, -2.05F, 0F, -0.4F, -2.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -0.45F, 0F, -3.55F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		defaultScopeModel[37].setRotationPoint(-39.75F, -64F, -4F);

		defaultScopeModel[38].addShapeBox(0F, 0F, 0F, 35, 9, 6, 0F,0F, -4F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, -2.75F, 0F, -4.4F, -4.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3.55F, -2.45F); // Import Box709
		defaultScopeModel[38].setRotationPoint(29.25F, -68F, 0F);

		defaultScopeModel[39].addShapeBox(0F, 0F, 0F, 35, 6, 9, 0F,0F, -2.45F, -3.55F, 0F, 0F, -6F, 0F, -2.75F, -1.2F, 0F, -4.05F, -4.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F); // Import Box716
		defaultScopeModel[39].setRotationPoint(29.25F, -65F, 0F);

		defaultScopeModel[40].addShapeBox(0F, 0F, 0F, 35, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, -2.45F, -3.55F, 0F, 0F, -6F, 0F, -2.75F, -1.2F, 0F, -4.05F, -4.4F); // Import Box717
		defaultScopeModel[40].setRotationPoint(29.25F, -59F, 0F);

		defaultScopeModel[41].addShapeBox(0F, 0F, 0F, 35, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3.55F, -2.45F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, -2.75F, 0F, -4.4F, -4.05F); // Import Box718
		defaultScopeModel[41].setRotationPoint(29.25F, -59F, 0F);

		defaultScopeModel[42].addShapeBox(0F, 0F, 0F, 35, 6, 9, 0F,0F, -4.05F, -4.4F, 0F, -2.75F, -1.2F, 0F, 0F, -6F, 0F, -2.45F, -3.55F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box719
		defaultScopeModel[42].setRotationPoint(29.25F, -65F, -9F);

		defaultScopeModel[43].addShapeBox(0F, 0F, 0F, 35, 9, 6, 0F,0F, -4.4F, -4.05F, 0F, -1.2F, -2.75F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, -3.55F, -2.45F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box720
		defaultScopeModel[43].setRotationPoint(29.25F, -68F, -6F);

		defaultScopeModel[44].addShapeBox(0F, 0F, 0F, 35, 6, 9, 0F,0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.05F, -4.4F, 0F, -2.75F, -1.2F, 0F, 0F, -6F, 0F, -2.45F, -3.55F); // Import Box721
		defaultScopeModel[44].setRotationPoint(29.25F, -59F, -9F);

		defaultScopeModel[45].addShapeBox(0F, 0F, 0F, 35, 9, 6, 0F,0F, -3.55F, -2.45F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.4F, -4.05F, 0F, -1.2F, -2.75F, 0F, -0.5F, 0F, 0F, -4F, 0F); // Import Box722
		defaultScopeModel[45].setRotationPoint(29.25F, -59F, -6F);

		defaultScopeModel[46].addShapeBox(0F, 0F, 0F, 14, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F); // Import Box418
		defaultScopeModel[46].setRotationPoint(-36.75F, -59F, 0F);

		defaultScopeModel[47].addShapeBox(0F, 0F, 0F, 14, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F); // Import Box419
		defaultScopeModel[47].setRotationPoint(-36.75F, -59F, 0F);

		defaultScopeModel[48].addShapeBox(0F, 0F, 0F, 14, 7, 5, 0F,0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box420
		defaultScopeModel[48].setRotationPoint(-36.75F, -59F, -5F);

		defaultScopeModel[49].addShapeBox(0F, 0F, 0F, 14, 5, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F); // Import Box421
		defaultScopeModel[49].setRotationPoint(-36.75F, -59F, -7F);

		defaultScopeModel[50].addShapeBox(0F, 0F, 0F, 14, 5, 7, 0F,0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box422
		defaultScopeModel[50].setRotationPoint(-36.75F, -64F, -7F);

		defaultScopeModel[51].addShapeBox(0F, 0F, 0F, 14, 7, 5, 0F,0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box423
		defaultScopeModel[51].setRotationPoint(-36.75F, -66F, -5F);

		defaultScopeModel[52].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F); // Import Box731
		defaultScopeModel[52].setRotationPoint(-45.75F, -59F, 0F);

		defaultScopeModel[53].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F,0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box732
		defaultScopeModel[53].setRotationPoint(-45.75F, -64F, 0F);

		defaultScopeModel[54].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F); // Import Box733
		defaultScopeModel[54].setRotationPoint(-45.75F, -66F, 0F);

		defaultScopeModel[55].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F,0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box734
		defaultScopeModel[55].setRotationPoint(-45.75F, -66F, -5F);

		defaultScopeModel[56].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F,0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box735
		defaultScopeModel[56].setRotationPoint(-45.75F, -64F, -7F);

		defaultScopeModel[57].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F); // Import Box737
		defaultScopeModel[57].setRotationPoint(-45.75F, -59F, 0F);

		defaultScopeModel[58].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F); // Import Box738
		defaultScopeModel[58].setRotationPoint(-45.75F, -59F, -7F);

		defaultScopeModel[59].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, -0.4F, -4.6F, 0F, -1.45F, -3.55F, 0F, -3.05F, -2.4F, 0F, -2.5F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Import Box749
		defaultScopeModel[59].setRotationPoint(-41.75F, -64F, 0F);

		defaultScopeModel[60].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2.4F, -3.05F, 0F, -1.05F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -1.45F, 0F, -4.6F, -0.4F); // Import Box750
		defaultScopeModel[60].setRotationPoint(-41.75F, -66F, 0F);

		defaultScopeModel[61].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -0.4F, -4.6F, 0F, -1.45F, -3.55F, 0F, -3.05F, -2.4F, 0F, -2.5F, -1.05F); // Import Box751
		defaultScopeModel[61].setRotationPoint(-41.75F, -59F, 0F);

		defaultScopeModel[62].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -1.45F, 0F, -4.6F, -0.4F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2.4F, -3.05F, 0F, -1.05F, -2.5F); // Import Box752
		defaultScopeModel[62].setRotationPoint(-41.75F, -59F, 0F);

		defaultScopeModel[63].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -4.6F, -0.4F, 0F, -3.55F, -1.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -2.5F, 0F, -2.4F, -3.05F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Import Box753
		defaultScopeModel[63].setRotationPoint(-41.75F, -59F, -5F);

		defaultScopeModel[64].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, -2.5F, -1.05F, 0F, -3.05F, -2.4F, 0F, -1.45F, -3.55F, 0F, -0.4F, -4.6F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box754
		defaultScopeModel[64].setRotationPoint(-41.75F, -64F, -7F);

		defaultScopeModel[65].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.05F, -2.5F, 0F, -2.4F, -3.05F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -4.6F, -0.4F, 0F, -3.55F, -1.45F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box755
		defaultScopeModel[65].setRotationPoint(-41.75F, -66F, -5F);

		defaultScopeModel[66].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.05F, 0F, -3.05F, -2.4F, 0F, -1.45F, -3.55F, 0F, -0.4F, -4.6F); // Import Box756
		defaultScopeModel[66].setRotationPoint(-41.75F, -59F, -7F);

		defaultScopeModel[67].addShapeBox(0F, 0F, 0F, 14, 7, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F); // Import Box757
		defaultScopeModel[67].setRotationPoint(-36.75F, -66F, 0F);

		defaultScopeModel[68].addShapeBox(0F, 0F, 0F, 14, 5, 7, 0F,0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box758
		defaultScopeModel[68].setRotationPoint(-36.75F, -64F, 0F);

		defaultScopeModel[69].addShapeBox(0F, 0F, 0F, 5, 5, 7, 0F,0F, -0.4F, -4.6F, 0F, -1.45F, -3.55F, 0F, -3.05F, -2.4F, 0F, -2.5F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Import Box759
		defaultScopeModel[69].setRotationPoint(-22.75F, -64F, 0F);

		defaultScopeModel[70].addShapeBox(0F, 0F, 0F, 5, 7, 5, 0F,0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2.4F, -3.05F, 0F, -1.05F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -1.45F, 0F, -4.6F, -0.4F); // Import Box760
		defaultScopeModel[70].setRotationPoint(-22.75F, -66F, 0F);

		defaultScopeModel[71].addShapeBox(0F, 0F, 0F, 5, 7, 5, 0F,0F, -1.05F, -2.5F, 0F, -2.4F, -3.05F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -4.6F, -0.4F, 0F, -3.55F, -1.45F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box761
		defaultScopeModel[71].setRotationPoint(-22.75F, -66F, -5F);

		defaultScopeModel[72].addShapeBox(0F, 0F, 0F, 5, 5, 7, 0F,0F, -2.5F, -1.05F, 0F, -3.05F, -2.4F, 0F, -1.45F, -3.55F, 0F, -0.4F, -4.6F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box762
		defaultScopeModel[72].setRotationPoint(-22.75F, -64F, -7F);

		defaultScopeModel[73].addShapeBox(0F, 0F, 0F, 5, 5, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.05F, 0F, -3.05F, -2.4F, 0F, -1.45F, -3.55F, 0F, -0.4F, -4.6F); // Import Box763
		defaultScopeModel[73].setRotationPoint(-22.75F, -59F, -7F);

		defaultScopeModel[74].addShapeBox(0F, 0F, 0F, 5, 7, 5, 0F,0F, -4.6F, -0.4F, 0F, -3.55F, -1.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -2.5F, 0F, -2.4F, -3.05F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Import Box764
		defaultScopeModel[74].setRotationPoint(-22.75F, -59F, -5F);

		defaultScopeModel[75].addShapeBox(0F, 0F, 0F, 5, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -1.45F, 0F, -4.6F, -0.4F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2.4F, -3.05F, 0F, -1.05F, -2.5F); // Import Box765
		defaultScopeModel[75].setRotationPoint(-22.75F, -59F, 0F);

		defaultScopeModel[76].addShapeBox(0F, 0F, 0F, 5, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -0.4F, -4.6F, 0F, -1.45F, -3.55F, 0F, -3.05F, -2.4F, 0F, -2.5F, -1.05F); // Import Box766
		defaultScopeModel[76].setRotationPoint(-22.75F, -59F, 0F);

		defaultScopeModel[77].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, -1.45F, -3.55F, 0F, -0.4F, -4.6F, 0F, -2.5F, -1.05F, 0F, -3.05F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Import Box767
		defaultScopeModel[77].setRotationPoint(-38.75F, -64F, 0F);

		defaultScopeModel[78].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -1.05F, -2.5F, 0F, -2.4F, -3.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.6F, -0.4F, 0F, -3.55F, -1.45F); // Import Box768
		defaultScopeModel[78].setRotationPoint(-38.75F, -66F, 0F);

		defaultScopeModel[79].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -2.4F, -3.05F, 0F, -1.05F, -2.5F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -3.55F, -1.45F, 0F, -4.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box769
		defaultScopeModel[79].setRotationPoint(-38.75F, -66F, -5F);

		defaultScopeModel[80].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, -3.05F, -2.4F, 0F, -2.5F, -1.05F, 0F, -0.4F, -4.6F, 0F, -1.45F, -3.55F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box770
		defaultScopeModel[80].setRotationPoint(-38.75F, -64F, -7F);

		defaultScopeModel[81].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.05F, -2.4F, 0F, -2.5F, -1.05F, 0F, -0.4F, -4.6F, 0F, -1.45F, -3.55F); // Import Box771
		defaultScopeModel[81].setRotationPoint(-38.75F, -59F, -7F);

		defaultScopeModel[82].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -3.55F, -1.45F, 0F, -4.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, -3.05F, 0F, -1.05F, -2.5F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Import Box772
		defaultScopeModel[82].setRotationPoint(-38.75F, -59F, -5F);

		defaultScopeModel[83].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.6F, -0.4F, 0F, -3.55F, -1.45F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -1.05F, -2.5F, 0F, -2.4F, -3.05F); // Import Box773
		defaultScopeModel[83].setRotationPoint(-38.75F, -59F, 0F);

		defaultScopeModel[84].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -1.45F, -3.55F, 0F, -0.4F, -4.6F, 0F, -2.5F, -1.05F, 0F, -3.05F, -2.4F); // Import Box774
		defaultScopeModel[84].setRotationPoint(-38.75F, -59F, 0F);

		defaultScopeModel[85].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F); // Box 2
		defaultScopeModel[85].setRotationPoint(4.25F, -58F, 10F);

		defaultScopeModel[86].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,-2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 3
		defaultScopeModel[86].setRotationPoint(4.25F, -63F, 5F);

		defaultScopeModel[87].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 4
		defaultScopeModel[87].setRotationPoint(4.25F, -60.5F, 5F);

		defaultScopeModel[88].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F); // Box 5
		defaultScopeModel[88].setRotationPoint(4.25F, -58F, 5F);

		defaultScopeModel[89].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,-2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 6
		defaultScopeModel[89].setRotationPoint(4.25F, -63F, -9F);

		defaultScopeModel[90].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 7
		defaultScopeModel[90].setRotationPoint(4.25F, -60.5F, -9F);

		defaultScopeModel[91].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F); // Box 8
		defaultScopeModel[91].setRotationPoint(4.25F, -58F, -9F);

		defaultScopeModel[92].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,-0.25F, 0.5F, -4.5F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -4.5F, -0.25F, 0F, -4.5F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -4.5F); // Box 9
		defaultScopeModel[92].setRotationPoint(2.75F, -72F, -6F);

		defaultScopeModel[93].addShapeBox(0F, 0F, 0F, 3, 5, 8, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -2.75F, -0.25F, 0.5F, -2.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F); // Box 10
		defaultScopeModel[93].setRotationPoint(9.25F, -70F, -4F);

		defaultScopeModel[94].addShapeBox(0F, 0F, 0F, 3, 5, 8, 0F,-0.25F, 0.5F, -2.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F); // Box 11
		defaultScopeModel[94].setRotationPoint(4.25F, -70F, -4F);

		defaultScopeModel[95].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		defaultScopeModel[95].setRotationPoint(-9.75F, -47F, -5F);

		defaultScopeModel[96].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 109
		defaultScopeModel[96].setRotationPoint(-9.75F, -43F, -5F);

		defaultScopeModel[97].addShapeBox(0F, 0F, 0F, 11, 5, 7, 0F,-0.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 110
		defaultScopeModel[97].setRotationPoint(17.25F, -52F, -3.5F);

		defaultScopeModel[98].addShapeBox(0F, 0F, 0F, 11, 2, 10, 0F,-2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		defaultScopeModel[98].setRotationPoint(17.25F, -47F, -5F);

		defaultScopeModel[99].addShapeBox(0F, 0F, 0F, 11, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		defaultScopeModel[99].setRotationPoint(17.25F, -45F, -5F);

		defaultScopeModel[100].addShapeBox(0F, 0F, 0F, 11, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 113
		defaultScopeModel[100].setRotationPoint(17.25F, -43F, -5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 25, 329, textureX, textureY); // Import ImportBox8
		ammoModel[1] = new ModelRendererTurbo(this, 113, 329, textureX, textureY); // Import ImportBox8
		ammoModel[2] = new ModelRendererTurbo(this, 153, 329, textureX, textureY); // Import ImportBox8
		ammoModel[3] = new ModelRendererTurbo(this, 185, 329, textureX, textureY); // Import ImportBox8
		ammoModel[4] = new ModelRendererTurbo(this, 209, 329, textureX, textureY); // Import ImportBox8
		ammoModel[5] = new ModelRendererTurbo(this, 233, 329, textureX, textureY); // Import ImportBox8
		ammoModel[6] = new ModelRendererTurbo(this, 273, 329, textureX, textureY); // Import ImportBox8
		ammoModel[7] = new ModelRendererTurbo(this, 305, 329, textureX, textureY); // Import ImportBox8
		ammoModel[8] = new ModelRendererTurbo(this, 353, 329, textureX, textureY); // Import ImportBox8
		ammoModel[9] = new ModelRendererTurbo(this, 385, 329, textureX, textureY); // Import ImportBox8
		ammoModel[10] = new ModelRendererTurbo(this, 545, 329, textureX, textureY); // Import ImportBox8
		ammoModel[11] = new ModelRendererTurbo(this, 585, 329, textureX, textureY); // Import ImportBox8
		ammoModel[12] = new ModelRendererTurbo(this, 625, 329, textureX, textureY); // Import ImportBox8
		ammoModel[13] = new ModelRendererTurbo(this, 665, 329, textureX, textureY); // Import ImportBox8
		ammoModel[14] = new ModelRendererTurbo(this, 705, 329, textureX, textureY); // Import ImportBox8
		ammoModel[15] = new ModelRendererTurbo(this, 777, 329, textureX, textureY); // Import ImportBox8

		ammoModel[0].addShapeBox(0F, 0F, 0F, 35, 15, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Import ImportBox8
		ammoModel[0].setRotationPoint(-70.25F, -25.5F, -3.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		ammoModel[1].setRotationPoint(-71.25F, -9.25F, -4F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 4, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		ammoModel[2].setRotationPoint(-64.25F, -7.25F, -4F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0F, 1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		ammoModel[3].setRotationPoint(-60.25F, -2.25F, -4F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox8
		ammoModel[4].setRotationPoint(-49.25F, -2.25F, -4F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		ammoModel[5].setRotationPoint(-58.75F, -1.75F, -4F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 4, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		ammoModel[6].setRotationPoint(-48.25F, -7.25F, -4F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 14, 2, 7, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		ammoModel[7].setRotationPoint(-48.25F, -9.25F, -3F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 7, 11, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		ammoModel[8].setRotationPoint(-71.25F, -7.25F, -3.5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 10, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		ammoModel[9].setRotationPoint(-59.25F, -1.25F, -3.5F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 10, 11, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		ammoModel[10].setRotationPoint(-44.25F, -7.25F, -3.5F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 12, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		ammoModel[11].setRotationPoint(-60.25F, -9.25F, -3.5F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		ammoModel[12].setRotationPoint(-58.75F, -8.75F, -4F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 9, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		ammoModel[13].setRotationPoint(-58.75F, -6.75F, -4F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		ammoModel[14].setRotationPoint(-58.25F, -6.75F, -4.5F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		ammoModel[15].setRotationPoint(-58.25F, -4.75F, -4.5F);
	}

	private void initpumpModel_1()
	{
		pumpModel[0] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import ImportBox1
		pumpModel[1] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Import ImportBox1
		pumpModel[2] = new ModelRendererTurbo(this, 729, 201, textureX, textureY); // Import ImportBox1
		pumpModel[3] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import ImportBox1
		pumpModel[4] = new ModelRendererTurbo(this, 633, 201, textureX, textureY); // Import ImportBox1
		pumpModel[5] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Import ImportBox1
		pumpModel[6] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Import ImportBox1
		pumpModel[7] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Import ImportBox1
		pumpModel[8] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Import ImportBox1
		pumpModel[9] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Import ImportBox1
		pumpModel[10] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Import ImportBox1
		pumpModel[11] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Import ImportBox1
		pumpModel[12] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Import ImportBox1
		pumpModel[13] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Import ImportBox1
		pumpModel[14] = new ModelRendererTurbo(this, 673, 57, textureX, textureY); // Import ImportBox1
		pumpModel[15] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import ImportBox1
		pumpModel[16] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Import ImportBox1
		pumpModel[17] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Import ImportBox1
		pumpModel[18] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Import ImportBox1
		pumpModel[19] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Import ImportBox1
		pumpModel[20] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Import ImportBox1
		pumpModel[21] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Import ImportBox1
		pumpModel[22] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Import ImportBox1

		pumpModel[0].addShapeBox(0F, 0F, 0F, 25, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		pumpModel[0].setRotationPoint(-81.5F, -40F, -5.75F);

		pumpModel[1].addShapeBox(0F, 0F, 0F, 25, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		pumpModel[1].setRotationPoint(-81.5F, -37F, -5.75F);

		pumpModel[2].addShapeBox(0F, 0F, 0F, 25, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		pumpModel[2].setRotationPoint(-81.5F, -34F, -5.75F);

		pumpModel[3].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, -0.25F, -3.25F, 0F, -0.25F, -3.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import ImportBox1
		pumpModel[3].setRotationPoint(-56.5F, -39.5F, -5.75F);

		pumpModel[4].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import ImportBox1
		pumpModel[4].setRotationPoint(-56.5F, -37F, -5.75F);

		pumpModel[5].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -3.25F, 0F, -0.25F, -3.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import ImportBox1
		pumpModel[5].setRotationPoint(-56.5F, -34.5F, -5.75F);

		pumpModel[6].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		pumpModel[6].setRotationPoint(-44.5F, -40F, -5.75F);

		pumpModel[7].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		pumpModel[7].setRotationPoint(-44.5F, -37F, -5.75F);

		pumpModel[8].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		pumpModel[8].setRotationPoint(-44.5F, -34F, -5.75F);

		pumpModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		pumpModel[9].setRotationPoint(-41.5F, -35.75F, -8.75F);

		pumpModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		pumpModel[10].setRotationPoint(-41.5F, -32.75F, -8.75F);

		pumpModel[11].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Import ImportBox1
		pumpModel[11].setRotationPoint(-41.5F, -31.75F, -8.75F);

		pumpModel[12].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		pumpModel[12].setRotationPoint(-41.5F, -35.75F, -5.75F);

		pumpModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import ImportBox1
		pumpModel[13].setRotationPoint(-41.5F, -32.75F, -5.75F);

		pumpModel[14].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		pumpModel[14].setRotationPoint(-42.5F, -32.68F, -10.75F);
		pumpModel[14].rotateAngleX = 0.57595865F;

		pumpModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		pumpModel[15].setRotationPoint(-42.5F, -31F, -9.65F);
		pumpModel[15].rotateAngleX = 0.57595865F;

		pumpModel[16].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox1
		pumpModel[16].setRotationPoint(-42.5F, -30.17F, -9.1F);
		pumpModel[16].rotateAngleX = 0.57595865F;

		pumpModel[17].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,-1F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		pumpModel[17].setRotationPoint(-42.5F, -29.95F, -14.91F);
		pumpModel[17].rotateAngleX = 0.57595865F;

		pumpModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		pumpModel[18].setRotationPoint(-42.48F, -28.28F, -13.83F);
		pumpModel[18].rotateAngleX = 0.57595865F;

		pumpModel[19].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox1
		pumpModel[19].setRotationPoint(-42.5F, -27.45F, -13.3F);
		pumpModel[19].rotateAngleX = 0.57595865F;

		pumpModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox1
		pumpModel[20].setRotationPoint(-42.5F, -25.55F, -18.03F);
		pumpModel[20].rotateAngleX = 0.57595865F;

		pumpModel[21].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox1
		pumpModel[21].setRotationPoint(-42.5F, -27.25F, -19.1F);
		pumpModel[21].rotateAngleX = 0.57595865F;

		pumpModel[22].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F); // Import ImportBox1
		pumpModel[22].setRotationPoint(-42.5F, -24.72F, -17.48F);
		pumpModel[22].rotateAngleX = 0.57595865F;
	}

	private void inittriggerModel_1()
	{
		triggerModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import ImportBox8
		triggerModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import ImportBox8
		triggerModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import ImportBox8
		triggerModel[3] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import ImportBox8
		triggerModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import ImportBox8
		triggerModel[5] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import ImportBox8

		triggerModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportBox8
		triggerModel[0].setRotationPoint(14F, -20F, -2F);

		triggerModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import ImportBox8
		triggerModel[1].setRotationPoint(14F, -18.5F, -2F);

		triggerModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import ImportBox8
		triggerModel[2].setRotationPoint(14F, -16.5F, -2F);

		triggerModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import ImportBox8
		triggerModel[3].setRotationPoint(16F, -16.5F, -2F);

		triggerModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.99F, 0.5F, 0F, -0.99F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox8
		triggerModel[4].setRotationPoint(16.5F, -16.5F, -2F);

		triggerModel[5].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2.25F, -0.25F, 0F, 1F, -0.75F, 0F, 1F, -0.75F, 0F, -2.25F, -0.25F, 0F); // Import ImportBox8
		triggerModel[5].setRotationPoint(13.5F, -13F, -2F);
	}
}