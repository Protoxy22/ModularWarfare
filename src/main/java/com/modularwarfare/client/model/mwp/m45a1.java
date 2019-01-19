//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: m45a1
// Model Creator: 
// Created on: 16.01.2019 - 19:16:41
// Last changed on: 16.01.2019 - 19:16:41

package com.modularwarfare.client.model.mwp; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class m45a1 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public m45a1() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[349];
		ammoModel = new ModelRendererTurbo[6];
		slideModel = new ModelRendererTurbo[169];

		modelScale = 0.07F;
		renderPreset = 3;
				//Advanced configuration - Allows you to change how the gun is held without effecting the sight alignment
				//public Vector3f rotateCarryPosition = new Vector3f(-80F, -36F, 40F);
				//Advanced configuration - Allows you to change how the gun is held without effecting the sight alignment
				//public Vector3f translateCarryPosition = new Vector3f(0.3F, 0.3F, 1.8F);

		initgunModel_1();
		initammoModel_1();
		initslideModel_1();

		gripAttachPoint = new Vector3f(40F /16F, 65F /16F, 0F /16F);
		barrelAttachPoint = new Vector3f(83F /16F, 80F /16F, 0F /16F);
		translateAll(0F, -37.3F, 0.00F);//forward/down/right
		//translateAll(15F, 13F, 0.15F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.15F, 0F);//forward/up/? 


		gunSlideDistance = 1.6F;
		//animationType = EnumAnimationType.CUSTOM;
		tiltGunTime = 0.15F;
		unloadClipTime = 0.35F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.15F;
		rotateGunVertical = 20F;
		rotateGunHorizontal = 10F;
		tiltGun = 20F;
		translateGun = new Vector3f(3 /16F, 2F /16F, 1F /16F);
		rotateClipVertical = 1F;
		rotateClipHorizontal = 1F;
		tiltClip = 25F;


		translateClip = new Vector3f(-6 /16F, -20F /16F, 0F /16F);
		hasArms = true;
        
        leftArmPos = new Vector3f(-0.40F, -0.70F, -0.16F);
        leftArmRot = new Vector3f(80.0F, 35.0F, 0.0F);
        leftArmChargePos = new Vector3f(0.43F, 0.61F, 0.29F);
        leftArmChargeRot = new Vector3f(60.0F, 40.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.40F, -0.55F, 0.1F);
        leftArmReloadRot = new Vector3f(80.0F, 35.0F, 0.0F);
 
        rightArmPos = new Vector3f(0.17F, -0.6F, 0.00F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.17F, -0.62F, 0.06F);
        rightArmReloadRot = new Vector3f(-0.0F, 0.0F, -100.0F);
        
        leftHandAmmo = true;
        
        rightArmScale = new Vector3f(0.8F, 0.8F, 0.8F);
        leftArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
		//RecoilSlideDistance = 0.1F;
		//RotateSlideDistance = -2F;

		scopeIsOnSlide = true;
		slideLockOnEmpty = true;
		
		casingAnimDistance = new Vector3f(0, 1, 12);
	    casingAnimSpread = new Vector3f(2, 2, 0);
	    casingAnimTime = 6;  
	    casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);

		crouchZoom = -0.10F;
		fancyStance = true;
		//sprintRotate = new Vector3f(-5.0F, 0.0F, 40.0F);
		//sprintTranslate = new Vector3f(0.4F, -0.2F, -0.1F);
		
	    chargeHandleDistance = 1.6F;
	    chargeDelay = 0;
	    chargeDelayAfterReload = 40;
	    chargeTime = 8;
	    
	    leftHandCharge = true;
	    chargeModifier = new Vector3f (8.0F, 8.0F, 20.0F);

		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Import ImportBox1
		gunModel[1] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Import ImportBox1
		gunModel[2] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Import ImportBox1
		gunModel[3] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Import ImportBox1
		gunModel[4] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Import ImportBox1
		gunModel[5] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Import ImportBox1
		gunModel[6] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Import ImportBox1
		gunModel[7] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Import ImportBox1
		gunModel[8] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import ImportBox1
		gunModel[9] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Import ImportBox1
		gunModel[10] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Import ImportBox1
		gunModel[11] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Import ImportBox1
		gunModel[12] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Import ImportBox1
		gunModel[13] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Import ImportBox1
		gunModel[14] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import ImportBox1
		gunModel[15] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Import ImportBox1
		gunModel[16] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Import ImportBox1
		gunModel[17] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Import ImportBox1
		gunModel[18] = new ModelRendererTurbo(this, 897, 41, textureX, textureY); // Import ImportBox1
		gunModel[19] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Import ImportBox1
		gunModel[20] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Import ImportBox1
		gunModel[21] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Import ImportBox1
		gunModel[22] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import ImportBox1
		gunModel[23] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Import ImportBox1
		gunModel[24] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Import ImportBox1
		gunModel[25] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportBox1
		gunModel[26] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Import ImportBox1
		gunModel[27] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Import ImportBox1
		gunModel[28] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Import ImportBox1
		gunModel[29] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Import ImportBox1
		gunModel[30] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import ImportBox1
		gunModel[31] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Import ImportBox1
		gunModel[32] = new ModelRendererTurbo(this, 921, 41, textureX, textureY); // Import ImportBox1
		gunModel[33] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import ImportBox1
		gunModel[34] = new ModelRendererTurbo(this, 865, 49, textureX, textureY); // Import ImportBox1
		gunModel[35] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Import ImportBox1
		gunModel[36] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Import ImportBox1
		gunModel[37] = new ModelRendererTurbo(this, 649, 57, textureX, textureY); // Import ImportBox1
		gunModel[38] = new ModelRendererTurbo(this, 673, 57, textureX, textureY); // Import ImportBox1
		gunModel[39] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Import ImportBox1
		gunModel[40] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Import ImportBox1
		gunModel[41] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Import ImportBox1
		gunModel[42] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Import ImportBox1
		gunModel[43] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Import ImportBox1
		gunModel[44] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Import ImportBox1
		gunModel[45] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Import ImportBox1
		gunModel[46] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Import ImportBox1
		gunModel[47] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Import ImportBox1
		gunModel[48] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Import ImportBox1
		gunModel[49] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Import ImportBox1
		gunModel[50] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Import ImportBox1
		gunModel[51] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Import ImportBox1
		gunModel[52] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Import ImportBox1
		gunModel[53] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Import ImportBox1
		gunModel[54] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Import ImportBox1
		gunModel[55] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Import ImportBox1
		gunModel[56] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Import ImportBox1
		gunModel[57] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Import ImportBox1
		gunModel[58] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Import ImportBox1
		gunModel[59] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Import ImportBox1
		gunModel[60] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Import ImportBox1
		gunModel[61] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Import ImportBox1
		gunModel[62] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import ImportBox1
		gunModel[63] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Import ImportBox1
		gunModel[64] = new ModelRendererTurbo(this, 521, 73, textureX, textureY); // Import ImportBox1
		gunModel[65] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Import ImportBox1
		gunModel[66] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); // Import ImportBox1
		gunModel[67] = new ModelRendererTurbo(this, 625, 73, textureX, textureY); // Import ImportBox1
		gunModel[68] = new ModelRendererTurbo(this, 657, 73, textureX, textureY); // Import ImportBox1
		gunModel[69] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Import ImportBox1
		gunModel[70] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Import ImportBox1
		gunModel[71] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Import ImportBox1
		gunModel[72] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Import ImportBox1
		gunModel[73] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Import ImportBox1
		gunModel[74] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Import ImportBox1
		gunModel[75] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Import ImportBox1
		gunModel[76] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Import ImportBox1
		gunModel[77] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Import ImportBox1
		gunModel[78] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Import ImportBox1
		gunModel[79] = new ModelRendererTurbo(this, 689, 73, textureX, textureY); // Import ImportBox1
		gunModel[80] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Import ImportBox1
		gunModel[81] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Import ImportBox1
		gunModel[82] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Import ImportBox1
		gunModel[83] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Import ImportBox1
		gunModel[84] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Import ImportBox1
		gunModel[85] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Import ImportBox1
		gunModel[86] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Import ImportBox1
		gunModel[87] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Import ImportBox1
		gunModel[88] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Import ImportBox1
		gunModel[89] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Import ImportBox1
		gunModel[90] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Import ImportBox1
		gunModel[91] = new ModelRendererTurbo(this, 585, 73, textureX, textureY); // Import ImportBox1
		gunModel[92] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Import ImportBox1
		gunModel[93] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Import ImportBox1
		gunModel[94] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Import ImportBox1
		gunModel[95] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import ImportBox1
		gunModel[96] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Import ImportBox1
		gunModel[97] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Import ImportBox1
		gunModel[98] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Import ImportBox1
		gunModel[99] = new ModelRendererTurbo(this, 569, 89, textureX, textureY); // Import ImportBox1
		gunModel[100] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Import ImportBox1
		gunModel[101] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Import ImportBox1
		gunModel[102] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Import ImportBox1
		gunModel[103] = new ModelRendererTurbo(this, 601, 57, textureX, textureY); // Import ImportBox1
		gunModel[104] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Import ImportBox1
		gunModel[105] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Import ImportBox1
		gunModel[106] = new ModelRendererTurbo(this, 697, 97, textureX, textureY); // Import ImportBox1
		gunModel[107] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Import ImportBox1
		gunModel[108] = new ModelRendererTurbo(this, 897, 89, textureX, textureY); // Import ImportBox1
		gunModel[109] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import ImportBox1
		gunModel[110] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Import ImportBox1
		gunModel[111] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Import ImportBox1
		gunModel[112] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Import ImportBox1
		gunModel[113] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Import ImportBox1
		gunModel[114] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Import ImportBox1
		gunModel[115] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Import ImportBox1
		gunModel[116] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Import ImportBox1
		gunModel[117] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Import ImportBox1
		gunModel[118] = new ModelRendererTurbo(this, 665, 25, textureX, textureY); // Import ImportBox1
		gunModel[119] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Import ImportBox1
		gunModel[120] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Import ImportBox1
		gunModel[121] = new ModelRendererTurbo(this, 865, 25, textureX, textureY); // Import ImportBox1
		gunModel[122] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Import ImportBox1
		gunModel[123] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import ImportBox1
		gunModel[124] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Import ImportBox1
		gunModel[125] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Import ImportBox1
		gunModel[126] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Import ImportBox1
		gunModel[127] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Import ImportBox1
		gunModel[128] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Import ImportBox1
		gunModel[129] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import ImportBox1
		gunModel[130] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Import ImportBox1
		gunModel[131] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Import ImportBox1
		gunModel[132] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Import ImportBox1
		gunModel[133] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Import ImportBox1
		gunModel[134] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Import ImportBox1
		gunModel[135] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Import ImportBox1
		gunModel[136] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Import ImportBox1
		gunModel[137] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Import ImportBox1
		gunModel[138] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Import ImportBox1
		gunModel[139] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Import ImportBox1
		gunModel[140] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Import ImportBox1
		gunModel[141] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Import ImportBox1
		gunModel[142] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Import ImportBox1
		gunModel[143] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Import ImportBox1
		gunModel[144] = new ModelRendererTurbo(this, 649, 73, textureX, textureY); // Import ImportBox1
		gunModel[145] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Import ImportBox1
		gunModel[146] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Import ImportBox1
		gunModel[147] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Import ImportBox1
		gunModel[148] = new ModelRendererTurbo(this, 601, 89, textureX, textureY); // Import ImportBox1
		gunModel[149] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Import ImportBox1
		gunModel[150] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Import ImportBox1
		gunModel[151] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Import ImportBox1
		gunModel[152] = new ModelRendererTurbo(this, 529, 105, textureX, textureY); // Import ImportBox1
		gunModel[153] = new ModelRendererTurbo(this, 553, 105, textureX, textureY); // Import ImportBox1
		gunModel[154] = new ModelRendererTurbo(this, 577, 105, textureX, textureY); // Import ImportBox1
		gunModel[155] = new ModelRendererTurbo(this, 601, 105, textureX, textureY); // Import ImportBox1
		gunModel[156] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Import ImportBox1
		gunModel[157] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Import ImportBox1
		gunModel[158] = new ModelRendererTurbo(this, 673, 105, textureX, textureY); // Import ImportBox1
		gunModel[159] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Import ImportBox1
		gunModel[160] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import ImportBox1
		gunModel[161] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Import ImportBox1
		gunModel[162] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Import ImportBox1
		gunModel[163] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Import ImportBox1
		gunModel[164] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Import ImportBox1
		gunModel[165] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Import ImportBox1
		gunModel[166] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Import ImportBox1
		gunModel[167] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Import ImportBox1
		gunModel[168] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Import ImportBox1
		gunModel[169] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Import ImportBox1
		gunModel[170] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import ImportBox1
		gunModel[171] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import ImportBox1
		gunModel[172] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Import ImportBox1
		gunModel[173] = new ModelRendererTurbo(this, 745, 49, textureX, textureY); // Import ImportBox1
		gunModel[174] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Import ImportBox1
		gunModel[175] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Import ImportBox1
		gunModel[176] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Import ImportBox1
		gunModel[177] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Import ImportBox1
		gunModel[178] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Import ImportBox1
		gunModel[179] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Import ImportBox1
		gunModel[180] = new ModelRendererTurbo(this, 569, 57, textureX, textureY); // Import ImportBox1
		gunModel[181] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Import ImportBox1
		gunModel[182] = new ModelRendererTurbo(this, 537, 105, textureX, textureY); // Import ImportBox1
		gunModel[183] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Import ImportBox1
		gunModel[184] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Import ImportBox1
		gunModel[185] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Import ImportBox1
		gunModel[186] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import ImportBox1
		gunModel[187] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox1
		gunModel[188] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Import ImportBox1
		gunModel[189] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Import ImportBox1
		gunModel[190] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportBox1
		gunModel[191] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import ImportBox1
		gunModel[192] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Import ImportBox1
		gunModel[193] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Import ImportBox1
		gunModel[194] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportBox1
		gunModel[195] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Import ImportBox1
		gunModel[196] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Import ImportBox1
		gunModel[197] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Import ImportBox1
		gunModel[198] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Import ImportBox1
		gunModel[199] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Import ImportBox1
		gunModel[200] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportBox1
		gunModel[201] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Import ImportBox1
		gunModel[202] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Import ImportBox1
		gunModel[203] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Import ImportBox1
		gunModel[204] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Import ImportBox1
		gunModel[205] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Import ImportBox1
		gunModel[206] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Import ImportBox1
		gunModel[207] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Import ImportBox1
		gunModel[208] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Import ImportBox1
		gunModel[209] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Import ImportBox1
		gunModel[210] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Import ImportBox1
		gunModel[211] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Import ImportBox1
		gunModel[212] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); // Import ImportBox1
		gunModel[213] = new ModelRendererTurbo(this, 961, 113, textureX, textureY); // Import ImportBox1
		gunModel[214] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import ImportBox1
		gunModel[215] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Import ImportBox1
		gunModel[216] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Import ImportBox1
		gunModel[217] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Import ImportBox1
		gunModel[218] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Import ImportBox1
		gunModel[219] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Import ImportBox1
		gunModel[220] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Import ImportBox1
		gunModel[221] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Import ImportBox1
		gunModel[222] = new ModelRendererTurbo(this, 969, 113, textureX, textureY); // Import ImportBox1
		gunModel[223] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Import ImportBox1
		gunModel[224] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Import ImportBox1
		gunModel[225] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Import ImportBox1
		gunModel[226] = new ModelRendererTurbo(this, 569, 121, textureX, textureY); // Import ImportBox1
		gunModel[227] = new ModelRendererTurbo(this, 609, 121, textureX, textureY); // Import ImportBox1
		gunModel[228] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Import ImportBox1
		gunModel[229] = new ModelRendererTurbo(this, 817, 121, textureX, textureY); // Import ImportBox1
		gunModel[230] = new ModelRendererTurbo(this, 857, 121, textureX, textureY); // Import ImportBox1
		gunModel[231] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Import ImportBox1
		gunModel[232] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Import ImportBox1
		gunModel[233] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Import ImportBox1
		gunModel[234] = new ModelRendererTurbo(this, 881, 121, textureX, textureY); // Import ImportBox1
		gunModel[235] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Import ImportBox1
		gunModel[236] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Import ImportBox1
		gunModel[237] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Import ImportBox1
		gunModel[238] = new ModelRendererTurbo(this, 745, 129, textureX, textureY); // Import ImportBox1
		gunModel[239] = new ModelRendererTurbo(this, 785, 129, textureX, textureY); // Import ImportBox1
		gunModel[240] = new ModelRendererTurbo(this, 913, 129, textureX, textureY); // Import ImportBox1
		gunModel[241] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import ImportBox1
		gunModel[242] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Import ImportBox1
		gunModel[243] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Import ImportBox1
		gunModel[244] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import ImportBox1
		gunModel[245] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Import ImportBox1
		gunModel[246] = new ModelRendererTurbo(this, 633, 137, textureX, textureY); // Import ImportBox1
		gunModel[247] = new ModelRendererTurbo(this, 673, 137, textureX, textureY); // Import ImportBox1
		gunModel[248] = new ModelRendererTurbo(this, 713, 137, textureX, textureY); // Import ImportBox1
		gunModel[249] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Import ImportBox1
		gunModel[250] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import ImportBox1
		gunModel[251] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import ImportBox1
		gunModel[252] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Import ImportBox1
		gunModel[253] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Import ImportBox1
		gunModel[254] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Import ImportBox1
		gunModel[255] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Import ImportBox1
		gunModel[256] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Import ImportBox1
		gunModel[257] = new ModelRendererTurbo(this, 809, 137, textureX, textureY); // Import ImportBox1
		gunModel[258] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Import ImportBox1
		gunModel[259] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Import ImportBox1
		gunModel[260] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import ImportBox1
		gunModel[261] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Import ImportBox1
		gunModel[262] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import ImportBox1
		gunModel[263] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Import ImportBox1
		gunModel[264] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Import ImportBox1
		gunModel[265] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Import ImportBox1
		gunModel[266] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Import ImportBox1
		gunModel[267] = new ModelRendererTurbo(this, 921, 33, textureX, textureY); // Import ImportBox1
		gunModel[268] = new ModelRendererTurbo(this, 697, 9, textureX, textureY); // Import ImportBox1
		gunModel[269] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Import ImportBox1
		gunModel[270] = new ModelRendererTurbo(this, 729, 9, textureX, textureY); // Import ImportBox1
		gunModel[271] = new ModelRendererTurbo(this, 761, 9, textureX, textureY); // Import ImportBox1
		gunModel[272] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import ImportBox1
		gunModel[273] = new ModelRendererTurbo(this, 697, 33, textureX, textureY); // Import ImportBox1
		gunModel[274] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Import ImportBox1
		gunModel[275] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Import ImportBox1
		gunModel[276] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import ImportBox1
		gunModel[277] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Import ImportBox1
		gunModel[278] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Import ImportBox1
		gunModel[279] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import ImportBox1
		gunModel[280] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import ImportBox1
		gunModel[281] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import ImportBox1
		gunModel[282] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Import ImportBox1
		gunModel[283] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // Import ImportBox1
		gunModel[284] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import ImportBox1
		gunModel[285] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Import ImportBox1
		gunModel[286] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import ImportBox1
		gunModel[287] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportBox1
		gunModel[288] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Import ImportBox1
		gunModel[289] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Import ImportBox1
		gunModel[290] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Import ImportBox1
		gunModel[291] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Import ImportBox1
		gunModel[292] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Import ImportBox1
		gunModel[293] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Import ImportBox1
		gunModel[294] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Import ImportBox1
		gunModel[295] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Import ImportBox1
		gunModel[296] = new ModelRendererTurbo(this, 841, 41, textureX, textureY); // Import ImportBox1
		gunModel[297] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Import ImportBox1
		gunModel[298] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Import ImportBox1
		gunModel[299] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Import ImportBox1
		gunModel[300] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Import ImportBox1
		gunModel[301] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Import ImportBox1
		gunModel[302] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Import ImportBox1
		gunModel[303] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Import ImportBox1
		gunModel[304] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Import ImportBox1
		gunModel[305] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import ImportBox1
		gunModel[306] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Import ImportBox1
		gunModel[307] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import ImportBox1
		gunModel[308] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import ImportBox1
		gunModel[309] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import ImportBox1
		gunModel[310] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Import ImportBox1
		gunModel[311] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Import ImportBox1
		gunModel[312] = new ModelRendererTurbo(this, 881, 89, textureX, textureY); // Import ImportBox1
		gunModel[313] = new ModelRendererTurbo(this, 921, 89, textureX, textureY); // Import ImportBox1
		gunModel[314] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Import ImportBox1
		gunModel[315] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Import ImportBox1
		gunModel[316] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Import ImportBox1
		gunModel[317] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Import ImportBox1
		gunModel[318] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Import ImportBox1
		gunModel[319] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Import ImportBox1
		gunModel[320] = new ModelRendererTurbo(this, 833, 153, textureX, textureY); // Import ImportBox1
		gunModel[321] = new ModelRendererTurbo(this, 897, 153, textureX, textureY); // Import ImportBox1
		gunModel[322] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import ImportBox1
		gunModel[323] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Import ImportBox1
		gunModel[324] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Import ImportBox1
		gunModel[325] = new ModelRendererTurbo(this, 609, 169, textureX, textureY); // Import ImportBox1
		gunModel[326] = new ModelRendererTurbo(this, 673, 169, textureX, textureY); // Import ImportBox1
		gunModel[327] = new ModelRendererTurbo(this, 737, 169, textureX, textureY); // Import ImportBox1
		gunModel[328] = new ModelRendererTurbo(this, 825, 169, textureX, textureY); // Import ImportBox1
		gunModel[329] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import ImportBox1
		gunModel[330] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import ImportBox1
		gunModel[331] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import ImportBox1
		gunModel[332] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Import ImportBox1
		gunModel[333] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Import ImportBox1
		gunModel[334] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Import ImportBox1
		gunModel[335] = new ModelRendererTurbo(this, 897, 169, textureX, textureY); // Import ImportBox1
		gunModel[336] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Import ImportBox1
		gunModel[337] = new ModelRendererTurbo(this, 929, 177, textureX, textureY); // Import ImportBox1
		gunModel[338] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Import ImportBox1
		gunModel[339] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Import ImportBox1
		gunModel[340] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Import ImportBox1
		gunModel[341] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box177
		gunModel[342] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Import Box178
		gunModel[343] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Import Box179
		gunModel[344] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Import Box180
		gunModel[345] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Import Box181
		gunModel[346] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Import Box182
		gunModel[347] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Import Box183
		gunModel[348] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Import Box184

		gunModel[0].addShapeBox(0F, 0F, 0F, 5, 8, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import ImportBox1
		gunModel[0].setRotationPoint(-22F, -49F, -2.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 35, 4, 13, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		gunModel[1].setRotationPoint(23F, -38F, -6.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 13, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Import ImportBox1
		gunModel[2].setRotationPoint(23F, -34F, -6.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,-0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -3.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, -3.25F, 0.75F, 0F); // Import ImportBox1
		gunModel[3].setRotationPoint(23F, -32F, -6.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 8, 1, 13, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Import ImportBox1
		gunModel[4].setRotationPoint(28.25F, -32F, -6.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,0F, -0.5F, 0F, -2.75F, -0.5F, 0F, -2.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[5].setRotationPoint(28.25F, -32F, -6.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -3F, 0.25F, 0F, -3F, 0.25F, 0F, 0F, 0.25F, 0F); // Import ImportBox1
		gunModel[6].setRotationPoint(28.25F, -34F, -6.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[7].setRotationPoint(28.25F, -32.5F, -6.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0F, 0.75F, 0F); // Import ImportBox1
		gunModel[8].setRotationPoint(39.5F, -32F, -6.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0F, 0.75F, 0F); // Import ImportBox1
		gunModel[9].setRotationPoint(45F, -32F, -6.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0F, 0.75F, 0F); // Import ImportBox1
		gunModel[10].setRotationPoint(50.5F, -32F, -6.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0F, 0.75F, 0F); // Import ImportBox1
		gunModel[11].setRotationPoint(56F, -32F, -6.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 25, 1, 13, 0F,0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, -0.75F); // Import ImportBox1
		gunModel[12].setRotationPoint(32.75F, -33F, -6.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,-0.25F, -1F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, -0.75F, -0.25F, -1F, -0.75F, -0.25F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -0.25F, 0.5F, 0F); // Import ImportBox1
		gunModel[13].setRotationPoint(30.25F, -33F, -6.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0.75F, -0.25F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.75F, -0.5F, 0F); // Import ImportBox1
		gunModel[14].setRotationPoint(29F, -33F, -6.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 25, 1, 13, 0F,0F, -1F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F); // Import ImportBox1
		gunModel[15].setRotationPoint(32.75F, -33F, -6.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0.5F, -0.25F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.75F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -0.75F, -0.75F); // Import ImportBox1
		gunModel[16].setRotationPoint(28.75F, -33F, -6.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 30, 1, 13, 0F,0F, -1F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 1F, -0.75F, 0.5F, 1F, -0.75F, 0.5F, 1F, -0.75F, 0F, 1F, -0.75F); // Import ImportBox1
		gunModel[17].setRotationPoint(27.75F, -34F, -6.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportBox1
		gunModel[18].setRotationPoint(56F, -31F, -6.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportBox1
		gunModel[19].setRotationPoint(50.5F, -31F, -6.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportBox1
		gunModel[20].setRotationPoint(45F, -31F, -6.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportBox1
		gunModel[21].setRotationPoint(39.5F, -31F, -6.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 9, 2, 13, 0F,0.25F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.25F, 0F, -1.5F); // Import ImportBox1
		gunModel[22].setRotationPoint(26.5F, -31F, -6.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F,0F, 0.5F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, -2.75F, 0.75F, 0F, -2.75F, 0.75F, 0F, -2.75F, 0F, -1.25F, -2.75F); // Import ImportBox1
		gunModel[23].setRotationPoint(23.5F, -31F, -6.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 26, 6, 11, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F); // Import ImportBox1
		gunModel[24].setRotationPoint(-3F, -38F, -5.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0.5F, -0.5F, 0.25F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, -0.5F, 0.25F, 0.5F); // Import ImportBox1
		gunModel[25].setRotationPoint(22.5F, -38F, -5.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,0.25F, -1F, 0.5F, 0.75F, -1F, 0.5F, 0.75F, -1F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F); // Import ImportBox1
		gunModel[26].setRotationPoint(26.5F, -30F, -4.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F,3F, 1.25F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, 3F, 1.25F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[27].setRotationPoint(26.5F, -28F, -4F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 1.25F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 1.25F, -0.5F, 0F); // Import ImportBox1
		gunModel[28].setRotationPoint(28.5F, -26F, -4F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,1.25F, 0.5F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 1.25F, -0.5F, 0F); // Import ImportBox1
		gunModel[29].setRotationPoint(28.5F, -24F, -4F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,1.25F, 0.5F, 0F, -2.75F, 0.5F, 0F, -2.75F, 0.5F, 0F, 1.25F, 0.5F, 0F, 2.75F, -0.5F, 0F, -2.75F, -0.5F, 0F, -2.75F, -0.5F, 0F, 2.75F, -0.5F, 0F); // Import ImportBox1
		gunModel[30].setRotationPoint(28.5F, -21F, -4F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, 1.75F, 0.5F, 0F, 3.5F, -0.5F, 0F, -3.25F, -0.5F, 0F, -3.25F, -0.5F, 0F, 3.5F, -0.5F, 0F); // Import ImportBox1
		gunModel[31].setRotationPoint(27.5F, -18F, -4F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,1.75F, 0.5F, 0F, -2.75F, 0.5F, 0F, -2.75F, 0.5F, 0F, 1.75F, 0.5F, 0F, 1.75F, -0.5F, 0F, -3.25F, -0.5F, 0F, -3.25F, -0.5F, 0F, 1.75F, -0.5F, 0F); // Import ImportBox1
		gunModel[32].setRotationPoint(29.5F, -21F, -4F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,1.75F, 0.5F, 0F, -3.25F, 0.5F, 0F, -3.25F, 0.5F, 0F, 1.75F, 0.5F, 0F, 1.75F, -0.5F, 0F, -3.75F, -0.5F, 0F, -3.75F, -0.5F, 0F, 1.75F, -0.5F, 0F); // Import ImportBox1
		gunModel[33].setRotationPoint(29.5F, -19F, -4F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,2F, 0.5F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 2F, -0.5F, 0F); // Import ImportBox1
		gunModel[34].setRotationPoint(26F, -16F, -4F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox1
		gunModel[35].setRotationPoint(22F, -16F, -4F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import ImportBox1
		gunModel[36].setRotationPoint(13F, -15.5F, -4F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import ImportBox1
		gunModel[37].setRotationPoint(11F, -15.5F, -4F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, -1F, 0F); // Import ImportBox1
		gunModel[38].setRotationPoint(10F, -15.5F, -4F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.75F, 0F); // Import ImportBox1
		gunModel[39].setRotationPoint(8.5F, -16.5F, -4F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -1F); // Import ImportBox1
		gunModel[40].setRotationPoint(22F, -15F, -4F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Import ImportBox1
		gunModel[41].setRotationPoint(11F, -14.5F, -4F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -1.25F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, -0.5F, -1.25F, -1F); // Import ImportBox1
		gunModel[42].setRotationPoint(9F, -14.5F, -4F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.75F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, -0.5F, -1.75F, -1F); // Import ImportBox1
		gunModel[43].setRotationPoint(6.5F, -14.75F, -4F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[44].setRotationPoint(29F, -29F, -4F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -1.5F, 0F); // Import ImportBox1
		gunModel[45].setRotationPoint(31F, -29F, -4F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		gunModel[46].setRotationPoint(3F, -31.75F, -6F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,-0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -3.25F, 0.5F, 0F, -3.25F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Import ImportBox1
		gunModel[47].setRotationPoint(3F, -30.75F, -6F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 5, 2, 12, 0F,-0.5F, 1F, 0F, -4.5F, 1F, 0F, -4.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox1
		gunModel[48].setRotationPoint(3F, -23F, -6F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 10, 18, 12, 0F,-0.5F, -0.75F, 0F, -3.5F, -0.75F, 0F, -3.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 1.5F, 0F, -3.5F, 1.5F, 0F, -3.5F, 1.5F, 0F, -0.5F, 1.5F, 0F); // Import ImportBox1
		gunModel[49].setRotationPoint(-9F, -38.75F, -6F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 5, 2, 12, 0F,-0.5F, -0.5F, 0F, -3.25F, -0.5F, 0F, -3.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 1F, 0F, -4.5F, 1F, 0F, -4.5F, 1F, 0F, -0.5F, 1F, 0F); // Import ImportBox1
		gunModel[50].setRotationPoint(3F, -29.75F, -6F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,-0.5F, 1F, 0F, -4.5F, 1F, 0F, -4.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0.25F, 0F, -2.75F, 0.25F, 0F, -2.75F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Import ImportBox1
		gunModel[51].setRotationPoint(3F, -20.5F, -6F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		gunModel[52].setRotationPoint(3.25F, -19.5F, -6F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 7, 2, 12, 0F,-0.5F, 1.25F, 0F, -2.5F, 1.25F, -1F, -2.5F, 1.25F, -1F, -0.5F, 1.25F, 0F, -0.5F, -0.5F, 0F, -3.75F, -0.5F, -1F, -3.75F, -0.5F, -1F, -0.5F, -0.5F, 0F); // Import ImportBox1
		gunModel[53].setRotationPoint(3F, -25.5F, -6F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 7, 2, 12, 0F,-1.75F, 1.25F, 0F, -0.25F, 1.25F, -1F, -0.25F, 1.25F, -1F, -1.75F, 1.25F, 0F, -0.5F, -0.75F, 0F, -2.5F, -0.75F, -1F, -2.5F, -0.75F, -1F, -0.5F, -0.75F, 0F); // Import ImportBox1
		gunModel[54].setRotationPoint(3F, -28F, -6F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 7, 2, 12, 0F,-0.5F, 1.25F, 0F, -3.75F, 1.25F, -1F, -3.75F, 1.25F, -1F, -0.5F, 1.25F, 0F, -1.5F, -0.75F, 0F, -3.75F, -0.75F, -1F, -3.75F, -0.75F, -1F, -1.5F, -0.75F, 0F); // Import ImportBox1
		gunModel[55].setRotationPoint(3F, -22.75F, -6F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 7, 2, 12, 0F,-1.5F, 1F, 0F, -3.75F, 1F, -1F, -3.75F, 1F, -1F, -1.5F, 1F, 0F, -3.25F, -0.75F, 0F, -3.75F, -0.75F, 0F, -3.75F, -0.75F, 0F, -3.25F, -0.75F, 0F); // Import ImportBox1
		gunModel[56].setRotationPoint(3F, -20.5F, -6F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,-3.75F, 1.25F, 0F, -0.25F, 1.25F, -1F, -0.25F, 1.25F, -1F, -3.75F, 1.25F, 0F, -1.75F, -0.75F, 0F, -2.25F, -0.75F, -1F, -2.25F, -0.75F, -1F, -1.75F, -0.75F, 0F); // Import ImportBox1
		gunModel[57].setRotationPoint(3F, -29.5F, -6F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,-5F, 1.25F, 0F, 2F, 1.25F, 0F, 2F, 1.25F, 0F, -5F, 1.25F, 0F, -1.75F, -1.25F, 0F, -0.25F, -1.25F, -1F, -0.25F, -1.25F, -1F, -1.75F, -1.25F, 0F); // Import ImportBox1
		gunModel[58].setRotationPoint(5F, -30.5F, -6F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, -3.25F, -0.5F, 0.25F, -2.25F, -0.5F, 0.25F, -2.25F, 0F, 0.25F, -3.25F); // Import ImportBox1
		gunModel[59].setRotationPoint(23F, -31.5F, -6F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 9, 2, 12, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3.25F, 0F, 0.25F, -3.25F, 0F, 0.25F, -3.25F, 0F, 0.25F, -3.25F); // Import ImportBox1
		gunModel[60].setRotationPoint(14F, -31.5F, -6F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-0.75F, -0.75F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, -0.75F, -1F, -0.75F, -0.25F, -1F, 0F, -0.25F, -1.3F, 0F, -0.25F, -1.3F, -0.75F, -0.25F, -1F); // Import ImportBox1
		gunModel[61].setRotationPoint(11F, -31.5F, -6F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-0.75F, 0.25F, -1F, 0F, 0.25F, -1.3F, 0F, 0.25F, -1.3F, -0.75F, 0.25F, -1F, 1.25F, 0.25F, -1F, 0F, 0.25F, -3.25F, 0F, 0.25F, -3.25F, 1.25F, 0.25F, -1F); // Import ImportBox1
		gunModel[62].setRotationPoint(11F, -30.5F, -6F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,-0.75F, 0.25F, -1F, -0.25F, 0.25F, -2.6F, -0.25F, 0.25F, -2.6F, -0.75F, 0.25F, -1F, 1.5F, 0.25F, -1F, -3F, 0.25F, -2.75F, -3F, 0.25F, -2.75F, 1.5F, 0.25F, -1F); // Import ImportBox1
		gunModel[63].setRotationPoint(9F, -29F, -6F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,-0.5F, 0.25F, -1F, -1F, 0.25F, -2.75F, -1F, 0.25F, -2.75F, -0.5F, 0.25F, -1F, 0.75F, 0.5F, -1F, -2.75F, 0.5F, -2.75F, -2.75F, 0.5F, -2.75F, 0.75F, 0.5F, -1F); // Import ImportBox1
		gunModel[64].setRotationPoint(7F, -26.5F, -6F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0.25F, -1F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -1F); // Import ImportBox1
		gunModel[65].setRotationPoint(6.25F, -23.75F, -6F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0.75F, -1F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0.75F, -1F, 0F, 0.5F, 0F, 0.25F, 0.5F, -2.5F, 0.25F, 0.5F, -2.5F, 0F, 0.5F, 0F); // Import ImportBox1
		gunModel[66].setRotationPoint(6.25F, -20.75F, -6F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0.75F, 0F, 0.25F, 0.75F, -2.5F, 0.25F, 0.75F, -2.5F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, -2F, 0.25F, -0.5F, -2F, 0F, -0.5F, 0F); // Import ImportBox1
		gunModel[67].setRotationPoint(6.25F, -18.5F, -6F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0.5F, 0F, 0.25F, 0.5F, -2F, 0.25F, 0.5F, -2F, 0F, 0.5F, 0F, 1F, -0.75F, 0F, -0.7F, -0.75F, -2F, -0.7F, -0.75F, -2F, 1F, -0.75F, 0F); // Import ImportBox1
		gunModel[68].setRotationPoint(6.25F, -17.5F, -6F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0.5F, 0F, 0.3F, 0.5F, -2F, 0.3F, 0.5F, -2F, 0F, 0.5F, 0F, 1.5F, -0.5F, 0F, -0.2F, -0.5F, -2F, -0.2F, -0.5F, -2F, 1.5F, -0.5F, 0F); // Import ImportBox1
		gunModel[69].setRotationPoint(5.25F, -15.75F, -6F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox1
		gunModel[70].setRotationPoint(3.25F, -18F, -6F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox1
		gunModel[71].setRotationPoint(3.25F, -16F, -6F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 21, 4, 12, 0F,0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0F, 0.75F, 0F); // Import ImportBox1
		gunModel[72].setRotationPoint(-18F, -20F, -6F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F); // Import ImportBox1
		gunModel[73].setRotationPoint(5F, -15.5F, -4F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.25F, -0.25F, 2F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0.25F, -0.25F, 2F, 0.25F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, -0.75F, 0F); // Import ImportBox1
		gunModel[74].setRotationPoint(4F, -15.5F, -4F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0.25F, -1F, 2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, 0.25F, -1F, 2F, 0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[75].setRotationPoint(2F, -15.5F, -4F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, 0.25F, -0.25F, 2F, 0.25F, -1F, 2F, -0.25F, -1.75F, 2F, -0.25F, -1.75F, 2F, 0.25F, -1F, 2F); // Import ImportBox1
		gunModel[76].setRotationPoint(2F, -15.5F, -4F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0.25F, -0.5F, 2F, -0.25F, -0.5F, 2F, -0.25F, -0.5F, 2F, 0.25F, -0.5F, 2F, 0.25F, -0.75F, 2F, -0.25F, -1.75F, 2F, -0.25F, -1.75F, 2F, 0.25F, -0.75F, 2F); // Import ImportBox1
		gunModel[77].setRotationPoint(0F, -15.75F, -4F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.25F, -0.5F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, 0.25F, -0.5F, 2F, 0.25F, 1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, 1F, 0F); // Import ImportBox1
		gunModel[78].setRotationPoint(1F, -14.5F, -4F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,0.25F, -0.5F, 2F, -0.25F, -0.5F, 2F, -0.25F, -0.5F, 2F, 0.25F, -0.5F, 2F, 0.25F, 0.25F, 2F, -0.25F, -1.75F, 2F, -0.25F, -1.75F, 2F, 0.25F, 0.25F, 2F); // Import ImportBox1
		gunModel[79].setRotationPoint(-2F, -15.75F, -4F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox1
		gunModel[80].setRotationPoint(-4.25F, -11.5F, -6F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 2, 31, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0.2F, 0F, -10F, 0.2F, 0F, 10F, 0F, 0F); // Import ImportBox1
		gunModel[81].setRotationPoint(-5.25F, -9.5F, -6F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 6, 12, 11, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import ImportBox1
		gunModel[82].setRotationPoint(-2.5F, -31.75F, -5.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.25F, -0.5F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, 0.25F, -0.5F, 2F, 0.25F, 0.5F, 0.65F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.5F, 0.65F); // Import ImportBox1
		gunModel[83].setRotationPoint(0F, -14F, -4F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0.25F, -2.5F, 2F, -0.25F, -0.5F, 2F, -0.25F, -0.5F, 2F, 0.25F, -2.5F, 2F, 0.25F, 0.5F, 2F, -0.25F, 0.5F, 0.65F, -0.25F, 0.5F, 0.65F, 0.25F, 0.5F, 0F); // Import ImportBox1
		gunModel[84].setRotationPoint(-2F, -14F, -4F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F); // Import ImportBox1
		gunModel[85].setRotationPoint(-2.25F, -11.5F, -6F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 3, 31, 12, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 10F, 0.2F, 0F, -10F, 0.6F, -2F, -10F, 0.6F, -2F, 10F, 0.2F, 0F); // Import ImportBox1
		gunModel[86].setRotationPoint(-3.25F, -9.5F, -6F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[87].setRotationPoint(-4.25F, -14.5F, -6F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 20, 32, 12, 0F,-3F, -0.25F, 0F, -10.5F, -0.25F, 0F, -10.5F, -0.25F, 0F, -3F, -0.25F, 0F, 10.5F, 0F, 0F, -10.5F, 0F, 0F, -10.5F, 0F, 0F, 10.5F, 0F, 0F); // Import ImportBox1
		gunModel[88].setRotationPoint(-27.25F, -15.5F, -6F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 31, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 10F, 0.6F, 0F, -10F, -0.15F, -2F, -10F, -0.15F, -2F, 10F, 0.6F, 0F); // Import ImportBox1
		gunModel[89].setRotationPoint(-0.25F, -9.5F, -4F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-1F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[90].setRotationPoint(-0.25F, -11.5F, -4F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-1F, -0.25F, 0F, 1F, -0.25F, -2F, 1F, -0.25F, -2F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[91].setRotationPoint(0.75F, -13.5F, -4F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-1F, -1.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[92].setRotationPoint(1.75F, -15.25F, -4F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 9, 19, 12, 0F,0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0F, 0.75F, 0F); // Import ImportBox1
		gunModel[93].setRotationPoint(-18F, -39F, -6F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 6, 3, 12, 0F,-1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[94].setRotationPoint(-24.25F, -18.25F, -6F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 5, 2, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[95].setRotationPoint(-23F, -20.25F, -6F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 5, 2, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		gunModel[96].setRotationPoint(-23F, -22.25F, -6F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 5, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		gunModel[97].setRotationPoint(-23F, -24.25F, -6F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox1
		gunModel[98].setRotationPoint(-24F, -26.25F, -6F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 7, 2, 12, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox1
		gunModel[99].setRotationPoint(-25F, -28.25F, -6F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 9, 2, 12, 0F,1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Import ImportBox1
		gunModel[100].setRotationPoint(-27F, -30.25F, -6F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 11, 2, 12, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Import ImportBox1
		gunModel[101].setRotationPoint(-29F, -32.25F, -6F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Import ImportBox1
		gunModel[102].setRotationPoint(-29.25F, -32.25F, -6F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -1F, 0F); // Import ImportBox1
		gunModel[103].setRotationPoint(-30.25F, -32.25F, -6F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Import ImportBox1
		gunModel[104].setRotationPoint(-31.75F, -32.25F, -6F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 14, 1, 12, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[105].setRotationPoint(-31.75F, -33.25F, -6F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 14, 1, 12, 0F,-1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[106].setRotationPoint(-31.75F, -34.25F, -6F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 32, 12, 0F,0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 13.5F, 0F, -1.5F, -13.5F, 0F, 0F, -13.5F, 0F, 0F, 13.5F, 0F, -1.5F); // Import ImportBox1
		gunModel[107].setRotationPoint(-25.25F, -15.5F, -6F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,-1.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportBox1
		gunModel[108].setRotationPoint(-25.25F, -18.25F, -6F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,-0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportBox1
		gunModel[109].setRotationPoint(-24F, -20.25F, -6F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,-0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1.5F); // Import ImportBox1
		gunModel[110].setRotationPoint(-24F, -22.25F, -6F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1.5F); // Import ImportBox1
		gunModel[111].setRotationPoint(-24F, -24.25F, -6F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F); // Import ImportBox1
		gunModel[112].setRotationPoint(-25F, -26.25F, -6F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0.5F, 0F, -1.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F); // Import ImportBox1
		gunModel[113].setRotationPoint(-26F, -28.25F, -6F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,1.25F, 0F, -1.5F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 1.25F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, -1.5F); // Import ImportBox1
		gunModel[114].setRotationPoint(-28F, -30.25F, -6F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,-1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox1
		gunModel[115].setRotationPoint(-28.75F, -35.25F, -6F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,-1.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[116].setRotationPoint(-28.75F, -35.25F, 3F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,-1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Import ImportBox1
		gunModel[117].setRotationPoint(-27.75F, -36.25F, -6F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Import ImportBox1
		gunModel[118].setRotationPoint(-26.75F, -37.25F, -6F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,-1.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		gunModel[119].setRotationPoint(-27.75F, -36.25F, 3F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -1F, 0F, 0.5F); // Import ImportBox1
		gunModel[120].setRotationPoint(-26.75F, -38.25F, -6F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-1F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		gunModel[121].setRotationPoint(-26.75F, -37.25F, 3F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-1.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox1
		gunModel[122].setRotationPoint(-26.75F, -38.25F, 3F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-1.35F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0F, -1.35F, -0.5F, 0F, -1.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -1.25F, 0F, 0F); // Import ImportBox1
		gunModel[123].setRotationPoint(-26.75F, -39F, 3F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1.4F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0F, -1.4F, -0.5F, 0F, -1.35F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -1.35F, 0F, 0F); // Import ImportBox1
		gunModel[124].setRotationPoint(-26.75F, -39.5F, 3F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-1.5F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -1.5F, -0.5F, 0.5F, -1.4F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -1.4F, 0F, 0.5F); // Import ImportBox1
		gunModel[125].setRotationPoint(-26.75F, -40F, 3F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-1.6F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0F, -1.6F, -0.5F, 0F, -1.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -1.5F, 0F, 0F); // Import ImportBox1
		gunModel[126].setRotationPoint(-26.75F, -40.5F, 3F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-1.4F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -1.4F, -0.25F, 0.5F, -1.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -1.25F, 0F, 0.5F); // Import ImportBox1
		gunModel[127].setRotationPoint(-26.75F, -39F, -4F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1.5F, -0.15F, 0.5F, -0.25F, -0.15F, 0.5F, -0.25F, -0.15F, 0.5F, -1.5F, -0.15F, 0.5F, -1.4F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -1.4F, 0F, 0.5F); // Import ImportBox1
		gunModel[128].setRotationPoint(-26.75F, -39.75F, -5F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 5, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[129].setRotationPoint(-22F, -42F, -2.5F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 1, 32, 9, 0F,0F, -0.25F, -3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3F, 13.5F, 0F, -3F, -13.5F, 0F, 0F, -13.5F, 0F, 0F, 13.5F, 0F, -3F); // Import ImportBox1
		gunModel[130].setRotationPoint(-26.25F, -15.5F, -4.5F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,-1.25F, 0F, -3F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F); // Import ImportBox1
		gunModel[131].setRotationPoint(-26.25F, -18.25F, -4.5F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import ImportBox1
		gunModel[132].setRotationPoint(-25F, -20.25F, -4.5F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -3F); // Import ImportBox1
		gunModel[133].setRotationPoint(-25F, -22.25F, -4.5F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -3F); // Import ImportBox1
		gunModel[134].setRotationPoint(-25F, -24.25F, -4.5F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -3F, -0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -3F); // Import ImportBox1
		gunModel[135].setRotationPoint(-25.5F, -26.25F, -4.5F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -3F, -0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -3F); // Import ImportBox1
		gunModel[136].setRotationPoint(-26.5F, -28.25F, -4.5F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,1F, -0.5F, -1F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, 1F, -0.5F, -1F, -1.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, -3F); // Import ImportBox1
		gunModel[137].setRotationPoint(-29F, -29.25F, -4.5F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,-0.45F, -0.5F, 0F, 1.12F, -0.5F, 0F, 1.12F, -0.5F, 0F, -0.45F, -0.5F, 0F, -1F, 0F, -1F, 1.85F, 0F, 0F, 1.85F, 0F, 0F, -1F, 0F, -1F); // Import ImportBox1
		gunModel[138].setRotationPoint(-31F, -29.75F, -4.5F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.45F, 0.5F, 0F, 1.13F, 0.5F, 0F, 1.13F, 0.5F, 0F, -0.45F, 0.5F, 0F); // Import ImportBox1
		gunModel[139].setRotationPoint(-31F, -30.75F, -4.5F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F); // Import ImportBox1
		gunModel[140].setRotationPoint(-29.25F, -30.75F, -6F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,-0.5F, 0F, 1.5F, 0F, -0.75F, 1.5F, 0F, -0.75F, 1.5F, -0.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[141].setRotationPoint(-31.25F, -31.25F, -4.5F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,-0.5F, 0F, 1.5F, -0.5F, -1F, 1.5F, -0.5F, -1F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -2F, -1F, 1F, 0F, -1F, 1F, 0F, -0.5F, 0F, -2F); // Import ImportBox1
		gunModel[142].setRotationPoint(-32.25F, -32.25F, -4.5F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		gunModel[143].setRotationPoint(-27.25F, -18.25F, -4F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F); // Import ImportBox1
		gunModel[144].setRotationPoint(-26.75F, -20.25F, -4F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[145].setRotationPoint(-24.75F, -22.25F, -4F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[146].setRotationPoint(-24.75F, -24.25F, -4F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[147].setRotationPoint(-25.25F, -26.25F, -4F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,1.5F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[148].setRotationPoint(-26.25F, -28.25F, -4F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F,-2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import ImportBox1
		gunModel[149].setRotationPoint(-28.75F, -15.25F, -4F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-2F, 0F, -2F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -2F, 0F, -2F, -1.5F, 0F, -2F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1.5F, 0F, -2F); // Import ImportBox1
		gunModel[150].setRotationPoint(-28F, -20.25F, -4F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox1
		gunModel[151].setRotationPoint(-26F, -22.25F, -4F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,1F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -2F, 0.25F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -2F); // Import ImportBox1
		gunModel[152].setRotationPoint(-25.75F, -24.25F, -4F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,2F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F); // Import ImportBox1
		gunModel[153].setRotationPoint(-26.25F, -26.25F, -4F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,3.5F, -0.5F, -2F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 3.5F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox1
		gunModel[154].setRotationPoint(-28.25F, -28.25F, -4F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, -2F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -2F, 0F, -2F, -0.5F, -0.25F, -2F, -0.13F, -0.25F, 0F, -0.13F, -0.25F, 0F, -0.5F, -0.25F, -2F); // Import ImportBox1
		gunModel[155].setRotationPoint(-28.5F, -18.25F, -4F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-1.5F, 0F, -2F, 0.88F, 0F, 0F, 0.88F, 0F, 0F, -1.5F, 0F, -2F, -0.25F, -0.75F, -2F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, -0.25F, -0.75F, -2F); // Import ImportBox1
		gunModel[156].setRotationPoint(-29.5F, -15.5F, -4F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F,-1.5F, 0F, -2F, 2F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, -2F, 1F, -0.5F, -2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 1F, -0.5F, -2F); // Import ImportBox1
		gunModel[157].setRotationPoint(-30.75F, -15.25F, -4F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-1.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0.25F, 0F, 1.25F, 0.25F, 0F, 1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[158].setRotationPoint(-30.75F, -10.75F, -4F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-1F, 0F, -2F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1F, 0F, -2F, -1F, -0.5F, -2F, 1.55F, -0.5F, 0F, 1.55F, -0.5F, 0F, -1F, -0.5F, -2F); // Import ImportBox1
		gunModel[159].setRotationPoint(-32.75F, -10.75F, -4F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-1F, 0F, -2F, 1.55F, 0F, 0F, 1.55F, 0F, 0F, -1F, 0F, -2F, -1.5F, -0.5F, -2F, 1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, -1.5F, -0.5F, -2F); // Import ImportBox1
		gunModel[160].setRotationPoint(-32.75F, -10.25F, -4F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 22, 5, 12, 0F,0F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -3F, 0F); // Import ImportBox1
		gunModel[161].setRotationPoint(-37.75F, 16.5F, -6F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,4F, 0F, -2F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 4F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F); // Import ImportBox1
		gunModel[162].setRotationPoint(-30.75F, -28.75F, -4F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,2.25F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 2.25F, 0F, -2F, 0.5F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -3F); // Import ImportBox1
		gunModel[163].setRotationPoint(-34.25F, -29.75F, -5F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,2F, -1F, 0F, -1.75F, -1F, 0F, -1.75F, -1F, 0F, 2F, -1F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		gunModel[164].setRotationPoint(-28.25F, -29.75F, -4F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,2.25F, 0F, 1F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, 2.25F, 0F, 1F, 1.25F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 1.25F, 0F, 0F); // Import ImportBox1
		gunModel[165].setRotationPoint(-35.25F, -30.75F, -3F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,3F, 1.25F, -2.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 3F, 1.25F, -2.5F, 1.75F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.75F, 0F, -2.5F); // Import ImportBox1
		gunModel[166].setRotationPoint(-35.75F, -31.75F, -6.5F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F,-0.75F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -2F, -1F, -0.25F, -2F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -1F, -0.25F, -2F); // Import ImportBox1
		gunModel[167].setRotationPoint(-39.75F, -33.75F, -6F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,1.75F, 0F, -2F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Import ImportBox1
		gunModel[168].setRotationPoint(-35.75F, -29.75F, -3F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,1F, 0F, -1F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox1
		gunModel[169].setRotationPoint(-37.5F, -30.75F, -3F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,1.5F, 0.25F, -1F, -1.5F, 0.25F, 1F, -1.5F, 0.25F, 1F, 1.5F, 0.25F, -1F, 0.25F, 0F, -1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0.25F, 0F, -1F); // Import ImportBox1
		gunModel[170].setRotationPoint(-38.25F, -32.75F, -3F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0.25F, 0F, -1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F, 0.25F, 0F, -1F, 0.25F, -0.25F, -1F, -1.25F, -0.25F, 1F, -1.25F, -0.25F, 1F, 0.25F, -0.25F, -1F); // Import ImportBox1
		gunModel[171].setRotationPoint(-39.5F, -33.75F, -3F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -0.25F, -0.5F, -1F, -0.25F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1F); // Import ImportBox1
		gunModel[172].setRotationPoint(-40F, -34.75F, -3F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1.28F, 0F, 0F, 1.28F, 0F, 0F, 1F); // Import ImportBox1
		gunModel[173].setRotationPoint(-39F, -35.25F, -3F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, -1F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -0.25F, -1F, -1F, -0.25F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, -1F); // Import ImportBox1
		gunModel[174].setRotationPoint(-40F, -35.25F, -3F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, -0.7F, 0F, 0F, -1.75F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0.15F, 0F, -0.5F, -0.72F); // Import ImportBox1
		gunModel[175].setRotationPoint(-38F, -34.75F, 1F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0.28F, 0F, -0.5F, 0.28F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.28F, 0F, 0F, 0.28F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[176].setRotationPoint(-39F, -34.75F, -4F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, -0.72F, 0F, -1F, 0.15F, 0F, -1F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.72F, 0F, 0F, 0.15F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox1
		gunModel[177].setRotationPoint(-38F, -34.75F, -5F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[178].setRotationPoint(-35F, -34.75F, -5F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.15F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.15F); // Import ImportBox1
		gunModel[179].setRotationPoint(-35F, -34.75F, 2F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, -1.75F, 0F, -0.75F, -0.7F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.72F, 0F, 0F, 0.15F, 0F, 0F, -1F, 0F, -0.5F, -1F); // Import ImportBox1
		gunModel[180].setRotationPoint(-38F, -34.75F, -5F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, -1F, 0F, -1F, -1F, 0F, -1F, 0.15F, 0F, -0.5F, -0.72F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.15F, 0F, 0F, -0.72F); // Import ImportBox1
		gunModel[181].setRotationPoint(-38F, -34.75F, 1F);

		gunModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox1
		gunModel[182].setRotationPoint(-32.25F, -33.75F, -6F);

		gunModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox1
		gunModel[183].setRotationPoint(-32.25F, -34.5F, -6F);

		gunModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.75F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.7F); // Import ImportBox1
		gunModel[184].setRotationPoint(-33F, -34.75F, 2F);

		gunModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.75F, -0.15F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.7F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[185].setRotationPoint(-33F, -34.75F, -5F);

		gunModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		gunModel[186].setRotationPoint(-28.5F, -44F, -2F);

		gunModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.75F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		gunModel[187].setRotationPoint(-29.5F, -44.75F, -2F);

		gunModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0.75F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox1
		gunModel[188].setRotationPoint(-30.5F, -45.5F, -2F);

		gunModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F); // Import ImportBox1
		gunModel[189].setRotationPoint(-30F, -46.5F, -2F);

		gunModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[190].setRotationPoint(-30F, -47.5F, -2F);

		gunModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.15F, -0.75F, 0F, 1F, -0.75F, 0F, 1F, -0.75F, 0F, -0.15F, -0.75F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[191].setRotationPoint(-29.5F, -48.5F, -2F);

		gunModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -0.15F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.15F, 0F, 0F); // Import ImportBox1
		gunModel[192].setRotationPoint(-29.5F, -48.75F, -2F);

		gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		gunModel[193].setRotationPoint(-26.5F, -43.25F, -2F);

		gunModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F); // Import ImportBox1
		gunModel[194].setRotationPoint(-25.5F, -43.25F, -2F);

		gunModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[195].setRotationPoint(-26.5F, -48.75F, -2F);

		gunModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[196].setRotationPoint(-24.5F, -47.75F, -2F);

		gunModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[197].setRotationPoint(-24.25F, -47.75F, -2F);

		gunModel[198].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		gunModel[198].setRotationPoint(-23.25F, -48.75F, -2F);

		gunModel[199].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1.25F, -0.25F, 0F); // Import ImportBox1
		gunModel[199].setRotationPoint(-23.25F, -46.25F, -2F);

		gunModel[200].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.5F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, 1.5F, 0F); // Import ImportBox1
		gunModel[200].setRotationPoint(-24.5F, -43.25F, -2F);

		gunModel[201].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[201].setRotationPoint(-22.5F, -40F, -2.5F);

		gunModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[202].setRotationPoint(-24.5F, -40.75F, -2F);

		gunModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportBox1
		gunModel[203].setRotationPoint(-24.5F, -39.75F, -2F);

		gunModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F); // Import ImportBox1
		gunModel[204].setRotationPoint(-24.75F, -38.75F, -2F);

		gunModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[205].setRotationPoint(-26F, -36.75F, -2F);

		gunModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		gunModel[206].setRotationPoint(-26F, -35.75F, -2F);

		gunModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox1
		gunModel[207].setRotationPoint(-25.5F, -34.75F, -2F);

		gunModel[208].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Import ImportBox1
		gunModel[208].setRotationPoint(7.25F, -23.75F, -4F);

		gunModel[209].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox1
		gunModel[209].setRotationPoint(7.25F, -25.75F, -4F);

		gunModel[210].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-2F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox1
		gunModel[210].setRotationPoint(8.25F, -27.75F, -4F);

		gunModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-2F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox1
		gunModel[211].setRotationPoint(10F, -28.75F, -4F);

		gunModel[212].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox1
		gunModel[212].setRotationPoint(7.25F, -20.25F, -4F);

		gunModel[213].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox1
		gunModel[213].setRotationPoint(8.5F, -18.25F, -4F);

		gunModel[214].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -0.5F, 0.5F, 0F); // Import ImportBox1
		gunModel[214].setRotationPoint(8.75F, -23.75F, -4F);

		gunModel[215].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-1.25F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F); // Import ImportBox1
		gunModel[215].setRotationPoint(8.75F, -25.75F, -4F);

		gunModel[216].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-2F, 0F, 0F, 1.5F, 0F, -1F, 1.5F, 0F, -1F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F); // Import ImportBox1
		gunModel[216].setRotationPoint(9.5F, -27.75F, -4F);

		gunModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-2.25F, 0F, 0F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, -2.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F); // Import ImportBox1
		gunModel[217].setRotationPoint(11F, -28.75F, -4F);

		gunModel[218].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -1.75F, 0F, 0F, 1.25F, 0F, -1F, 1.25F, 0F, -1F, -1.75F, 0F, 0F); // Import ImportBox1
		gunModel[218].setRotationPoint(8.75F, -20.25F, -4F);

		gunModel[219].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -2.75F, 0F, 0F, 2F, -0.25F, -1F, 2F, -0.25F, -1F, -2.75F, 0F, 0F); // Import ImportBox1
		gunModel[219].setRotationPoint(10F, -18.25F, -4F);

		gunModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,-0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -1F, 0F, -1.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1.5F); // Import ImportBox1
		gunModel[220].setRotationPoint(-39.25F, 16.5F, -6F);

		gunModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -3F, -1F, 0F, -3F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -3F); // Import ImportBox1
		gunModel[221].setRotationPoint(-40.25F, 16.5F, -4.5F);

		gunModel[222].addShapeBox(0F, 0F, 0F, 2, 48, 14, 0F,-20.5F, -0.25F, -1F, 20.5F, -0.25F, 0F, 20.5F, -0.25F, 0F, -20.5F, -0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox1
		gunModel[222].setRotationPoint(-36.25F, -33.5F, -7F);

		gunModel[223].addShapeBox(0F, 0F, 0F, 3, 48, 14, 0F,-20.5F, -0.25F, 0F, 20.5F, -0.25F, 1F, 20.5F, -0.25F, 1F, -20.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[223].setRotationPoint(-34.25F, -33.5F, -7F);

		gunModel[224].addShapeBox(0F, 0F, 0F, 8, 48, 16, 0F,-20.5F, -0.25F, 0F, 22F, -0.25F, 0F, 22F, -0.25F, 0F, -20.5F, -0.25F, 0F, 0F, 0F, 0F, 5.25F, 0F, 0F, 5.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[224].setRotationPoint(-31.25F, -33.5F, -8F);

		gunModel[225].addShapeBox(0F, 0F, 0F, 3, 48, 14, 0F,-20F, -0.25F, 1F, 20F, -0.25F, 0F, 20F, -0.25F, 0F, -20F, -0.25F, 1F, -3.25F, 0F, 1F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, -3.25F, 0F, 1F); // Import ImportBox1
		gunModel[225].setRotationPoint(-21.25F, -33.5F, -7F);

		gunModel[226].addShapeBox(0F, 0F, 0F, 2, 48, 14, 0F,-21F, -0.25F, 0F, 20F, -1.25F, -1F, 20F, -1.25F, -1F, -21F, -0.25F, 0F, -4.25F, 0F, 0F, 4.5F, 0F, -1F, 4.5F, 0F, -1F, -4.25F, 0F, 0F); // Import ImportBox1
		gunModel[226].setRotationPoint(-19.25F, -33.5F, -7F);

		gunModel[227].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,-1F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1F, -0.25F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F); // Import ImportBox1
		gunModel[227].setRotationPoint(-15.75F, -34.5F, -7F);

		gunModel[228].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, -0.25F, -0.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 0F); // Import ImportBox1
		gunModel[228].setRotationPoint(-13.75F, -34.5F, -7F);

		gunModel[229].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0.75F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 1F, 0.5F, 0.25F, 1F, 0.5F, 0.25F, 1F, 0F, 0.25F, 1F); // Import ImportBox1
		gunModel[229].setRotationPoint(-10.75F, -34.5F, -7F);

		gunModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F); // Import ImportBox1
		gunModel[230].setRotationPoint(-7.25F, -34.5F, -7F);

		gunModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F); // Import ImportBox1
		gunModel[231].setRotationPoint(-5.25F, -34.5F, -7F);

		gunModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F); // Import ImportBox1
		gunModel[232].setRotationPoint(-3.25F, -34.5F, -7F);

		gunModel[233].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 1F); // Import ImportBox1
		gunModel[233].setRotationPoint(-1.25F, -34.5F, -7F);

		gunModel[234].addShapeBox(0F, 0F, 0F, 6, 3, 16, 0F,0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, -0.65F, -2F, 0F, 0.15F, -2F, 0F, 0.15F, -2F, 0F, -0.65F, -2F); // Import ImportBox1
		gunModel[234].setRotationPoint(-27.25F, 17.5F, -8F);

		gunModel[235].addShapeBox(0F, 0F, 0F, 4, 3, 16, 0F,1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -1.4F, -2F, 0F, -0.65F, -2F, 0F, -0.65F, -2F, 1.25F, -1.4F, -2F); // Import ImportBox1
		gunModel[235].setRotationPoint(-31.25F, 17.5F, -8F);

		gunModel[236].addShapeBox(0F, 0F, 0F, 14, 3, 16, 0F,-1F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.97F, 0.25F, 0F, -0.97F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[236].setRotationPoint(-32.25F, 14.25F, -8F);

		gunModel[237].addShapeBox(0F, 0F, 0F, 6, 3, 16, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -2F, 0F); // Import ImportBox1
		gunModel[237].setRotationPoint(-27.25F, 16.5F, -8F);

		gunModel[238].addShapeBox(0F, 0F, 0F, 3, 5, 14, 0F,-20F, -0.25F, 1F, 20F, -0.25F, 0F, 20F, -0.25F, 0F, -20F, -0.25F, 1F, -17.98F, 0.1F, 1F, 18F, 1.5F, 0F, 18F, 1.5F, 0F, -17.98F, 0.1F, 1F); // Import ImportBox1
		gunModel[238].setRotationPoint(-38F, 14.25F, -7F);

		gunModel[239].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F,-21F, 0F, 0F, 21.25F, 0F, -1F, 21.25F, 0F, -1F, -21F, 0F, 0F, -19F, 0.25F, 0F, 19F, 0.75F, -1F, 19F, 0.75F, -1F, -19F, 0.25F, 0F); // Import ImportBox1
		gunModel[239].setRotationPoint(-36F, 14.5F, -7F);

		gunModel[240].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,0F, -0.5F, 0F, -0.75F, -1.1F, 0.05F, -0.75F, -1.1F, 0.05F, 0F, -0.5F, 0F, 0F, -0.6F, -2F, -0.75F, -0.45F, -2F, -0.75F, -0.45F, -2F, 0F, -0.6F, -2F); // Import ImportBox1
		gunModel[240].setRotationPoint(-21.25F, 18.25F, -8F);

		gunModel[241].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,0F, -1.25F, 0F, 0.03F, -1.25F, 0F, 0.03F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		gunModel[241].setRotationPoint(-21.25F, 16.25F, -8F);

		gunModel[242].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,0F, -1.1F, 0F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, -1.1F, 0F, 0F, -0.45F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.45F, -2F); // Import ImportBox1
		gunModel[242].setRotationPoint(-20F, 18.25F, -8F);

		gunModel[243].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,0F, -1.5F, -1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -1.5F, -1F, 0F, -1F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, -1F, -2F); // Import ImportBox1
		gunModel[243].setRotationPoint(-17F, 19.25F, -8F);

		gunModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F); // Import ImportBox1
		gunModel[244].setRotationPoint(-36.25F, 14.25F, -7F);

		gunModel[245].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.25F, 0F, 1F, -1.25F, 0F, 1F, 0F, -1.75F, 0F); // Import ImportBox1
		gunModel[245].setRotationPoint(-34.25F, 14.5F, -7F);

		gunModel[246].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[246].setRotationPoint(1F, -20F, -6.25F);

		gunModel[247].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,-1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[247].setRotationPoint(1F, -21.5F, -6.25F);

		gunModel[248].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[248].setRotationPoint(1F, -18.5F, -6.25F);

		gunModel[249].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -1.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -1.75F, 0F); // Import ImportBox1
		gunModel[249].setRotationPoint(3F, -37.5F, 6F);

		gunModel[250].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F); // Import ImportBox1
		gunModel[250].setRotationPoint(20.5F, -36.5F, 6F);

		gunModel[251].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0.25F, 0F); // Import ImportBox1
		gunModel[251].setRotationPoint(21.5F, -36F, 6F);

		gunModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.25F, 0F); // Import ImportBox1
		gunModel[252].setRotationPoint(3F, -37.75F, 6F);

		gunModel[253].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.6F, 0F, 0.5F, -1.1F, -0.25F, 0F, -1.1F, -0.25F, 0F, -1.75F, 0F, 0.5F, -1.38F, 0F, 0.5F, -2.25F, -0.25F, 0F, -2.25F, -0.25F); // Import ImportBox1
		gunModel[253].setRotationPoint(3F, -37.5F, 7F);

		gunModel[254].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, -1.1F, 0F, 0.5F, -1.1F, 0F, 0.5F, -2.1F, -0.5F, 0F, -2.1F, -0.5F, 0F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -2.25F, -0.5F, 0F, -2.25F, -0.5F); // Import ImportBox1
		gunModel[254].setRotationPoint(3F, -37.5F, 7.75F);

		gunModel[255].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		gunModel[255].setRotationPoint(-16F, -37.5F, 5.5F);

		gunModel[256].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.9F, -0.5F, 0F, -0.9F, -0.5F); // Import ImportBox1
		gunModel[256].setRotationPoint(-16F, -37.5F, 6.5F);

		gunModel[257].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.9F, 0F, 0.5F, -0.9F, 0F, 0.5F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Import ImportBox1
		gunModel[257].setRotationPoint(-16F, -37.5F, 7F);

		gunModel[258].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1.5F, 0F, 0F, 0.25F, 0.25F, 0F, -3F, 0.25F, 0F, -3F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[258].setRotationPoint(-22F, -28.25F, 6F);

		gunModel[259].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Import ImportBox1
		gunModel[259].setRotationPoint(-22F, -28.25F, 6F);

		gunModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		gunModel[260].setRotationPoint(-20F, -28.25F, 6F);

		gunModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F); // Import ImportBox1
		gunModel[261].setRotationPoint(-19F, -28.25F, 6F);

		gunModel[262].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[262].setRotationPoint(-19F, -33.25F, 6F);

		gunModel[263].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		gunModel[263].setRotationPoint(-23F, -33.25F, 6F);

		gunModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[264].setRotationPoint(-19F, -34.25F, 6F);

		gunModel[265].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[265].setRotationPoint(-19F, -35.25F, 6F);

		gunModel[266].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		gunModel[266].setRotationPoint(-18F, -38.25F, 6F);

		gunModel[267].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		gunModel[267].setRotationPoint(-27F, -38.25F, 6F);

		gunModel[268].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		gunModel[268].setRotationPoint(-23F, -34.25F, 6F);

		gunModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox1
		gunModel[269].setRotationPoint(-24.5F, -29.25F, 6F);

		gunModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Import ImportBox1
		gunModel[270].setRotationPoint(-25.5F, -30.25F, 6F);

		gunModel[271].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Import ImportBox1
		gunModel[271].setRotationPoint(-27.5F, -31.25F, 6F);

		gunModel[272].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox1
		gunModel[272].setRotationPoint(-29.5F, -32F, 6F);

		gunModel[273].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		gunModel[273].setRotationPoint(-29.5F, -33F, 6F);

		gunModel[274].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		gunModel[274].setRotationPoint(-29.5F, -34F, 6F);

		gunModel[275].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[275].setRotationPoint(-29.5F, -35F, 6F);

		gunModel[276].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 2F, 0F, -0.75F, 0.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 0.25F, 0.25F, -0.75F); // Import ImportBox1
		gunModel[276].setRotationPoint(-23F, -28.25F, 6F);

		gunModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, -0.75F); // Import ImportBox1
		gunModel[277].setRotationPoint(-25.5F, -29.25F, 6F);

		gunModel[278].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.75F, -1.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.5F, 0F, -0.75F); // Import ImportBox1
		gunModel[278].setRotationPoint(-27.5F, -30.25F, 6F);

		gunModel[279].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, -0.75F); // Import ImportBox1
		gunModel[279].setRotationPoint(-29.5F, -31.25F, 6F);

		gunModel[280].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1.5F, 0F, 0F, 0.25F, 0.25F, 0F, -3F, 0.25F, 0F, -3F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[280].setRotationPoint(-22F, -28.25F, -7F);

		gunModel[281].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Import ImportBox1
		gunModel[281].setRotationPoint(-22F, -28.25F, -7F);

		gunModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		gunModel[282].setRotationPoint(-20F, -28.25F, -7F);

		gunModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F); // Import ImportBox1
		gunModel[283].setRotationPoint(-19F, -28.25F, -7F);

		gunModel[284].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[284].setRotationPoint(-19F, -33.25F, -7F);

		gunModel[285].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		gunModel[285].setRotationPoint(-23F, -33.25F, -7F);

		gunModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[286].setRotationPoint(-19F, -34.25F, -7F);

		gunModel[287].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[287].setRotationPoint(-19F, -35.25F, -7F);

		gunModel[288].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		gunModel[288].setRotationPoint(-18F, -38.25F, -7F);

		gunModel[289].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		gunModel[289].setRotationPoint(-27F, -38.25F, -7F);

		gunModel[290].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		gunModel[290].setRotationPoint(-23F, -34.25F, -7F);

		gunModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox1
		gunModel[291].setRotationPoint(-24.5F, -29.25F, -7F);

		gunModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Import ImportBox1
		gunModel[292].setRotationPoint(-25.5F, -30.25F, -7F);

		gunModel[293].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Import ImportBox1
		gunModel[293].setRotationPoint(-27.5F, -31.25F, -7F);

		gunModel[294].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox1
		gunModel[294].setRotationPoint(-29.5F, -32F, -7F);

		gunModel[295].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		gunModel[295].setRotationPoint(-29.5F, -33F, -7F);

		gunModel[296].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		gunModel[296].setRotationPoint(-29.5F, -34F, -7F);

		gunModel[297].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[297].setRotationPoint(-29.5F, -35F, -7F);

		gunModel[298].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 2F, 0F, -0.75F, 0.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, -2.25F, 0.25F, 0F, 0.25F, 0.25F, -0.75F); // Import ImportBox1
		gunModel[298].setRotationPoint(-23F, -28.25F, -7F);

		gunModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, -0.75F); // Import ImportBox1
		gunModel[299].setRotationPoint(-25.5F, -29.25F, -7F);

		gunModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.75F, -1.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.5F, 0F, -0.75F); // Import ImportBox1
		gunModel[300].setRotationPoint(-27.5F, -30.25F, -7F);

		gunModel[301].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, -0.75F); // Import ImportBox1
		gunModel[301].setRotationPoint(-29.5F, -31.25F, -7F);

		gunModel[302].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		gunModel[302].setRotationPoint(-23F, -35.25F, 7F);

		gunModel[303].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -1F, 0F, -0.5F, -1F); // Import ImportBox1
		gunModel[303].setRotationPoint(-23F, -34.75F, 7F);

		gunModel[304].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		gunModel[304].setRotationPoint(-23F, -36.25F, 7F);

		gunModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -1F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, -1F); // Import ImportBox1
		gunModel[305].setRotationPoint(-24F, -34.75F, 7F);

		gunModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.85F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, -1F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.15F, -1F); // Import ImportBox1
		gunModel[306].setRotationPoint(-24F, -34.25F, 7F);

		gunModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, -1F); // Import ImportBox1
		gunModel[307].setRotationPoint(-24F, -35.75F, 7F);

		gunModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.35F, 0F); // Import ImportBox1
		gunModel[308].setRotationPoint(-13F, -38.1F, 7F);

		gunModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.35F, -1F, 0F, -0.1F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.75F, 0F, -0.1F, 0F); // Import ImportBox1
		gunModel[309].setRotationPoint(-13F, -38.65F, 7F);

		gunModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, -0.1F, 0F, 0F, -0.35F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, -1F, 0F, -0.35F, -1F); // Import ImportBox1
		gunModel[310].setRotationPoint(-13F, -36.85F, 7F);

		gunModel[311].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		gunModel[311].setRotationPoint(-23F, -35.25F, -8F);

		gunModel[312].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, -3.5F, -1F, 0F, -3.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		gunModel[312].setRotationPoint(-23F, -34.75F, -8F);

		gunModel[313].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -1F, -1F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		gunModel[313].setRotationPoint(-23F, -36.25F, -8F);

		gunModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F); // Import ImportBox1
		gunModel[314].setRotationPoint(-24F, -34.75F, -8F);

		gunModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.85F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.85F, 0F, 0F, -0.15F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.15F, 0F); // Import ImportBox1
		gunModel[315].setRotationPoint(-24F, -34.25F, -8F);

		gunModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.25F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, 0.35F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Import ImportBox1
		gunModel[316].setRotationPoint(-24F, -35.75F, -8F);

		gunModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0.35F, 0F); // Import ImportBox1
		gunModel[317].setRotationPoint(-13F, -38.1F, -8F);

		gunModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.35F, 0F, 0F, -0.1F, 0F, 0F, -0.45F, -0.75F, 0F, -0.45F, 0F, 0F, -0.1F, 0F); // Import ImportBox1
		gunModel[318].setRotationPoint(-13F, -38.65F, -8F);

		gunModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, -0.1F, 0F, 0F, -0.35F, -1F, 0F, -1.2F, -1F, 0F, -1.2F, 0F, 0F, -0.35F, 0F); // Import ImportBox1
		gunModel[319].setRotationPoint(-13F, -36.85F, -8F);

		gunModel[320].addShapeBox(0F, 0F, 0F, 21, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[320].setRotationPoint(14F, -45.5F, -6F);

		gunModel[321].addShapeBox(0F, 0F, 0F, 21, 3, 8, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[321].setRotationPoint(14F, -48.5F, -6F);

		gunModel[322].addShapeBox(0F, 0F, 0F, 21, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[322].setRotationPoint(14F, -50F, -5F);

		gunModel[323].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[323].setRotationPoint(14F, -51F, -2F);

		gunModel[324].addShapeBox(0F, 0F, 0F, 25, 2, 6, 0F,0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[324].setRotationPoint(56.4F, -38F, -3F);

		gunModel[325].addShapeBox(0F, 0F, 0F, 25, 2, 6, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[325].setRotationPoint(56.4F, -36F, -3F);

		gunModel[326].addShapeBox(0F, 0F, 0F, 25, 2, 6, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox1
		gunModel[326].setRotationPoint(56.4F, -34F, -3F);

		gunModel[327].addShapeBox(0F, 0F, 0F, 37, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox1
		gunModel[327].setRotationPoint(45F, -43F, -3F);

		gunModel[328].addShapeBox(0F, 0F, 0F, 37, 2, 6, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[328].setRotationPoint(45F, -47F, -3F);

		gunModel[329].addShapeBox(0F, 0F, 0F, 37, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[329].setRotationPoint(45F, -45F, -3F);

		gunModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F); // Import ImportBox1
		gunModel[330].setRotationPoint(-34F, -34.75F, -2F);

		gunModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -1F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		gunModel[331].setRotationPoint(-34F, -34.75F, 1F);

		gunModel[332].addShapeBox(0F, 0F, 0F, 4, 1, 17, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[332].setRotationPoint(-9.5F, -30F, -8.5F);

		gunModel[333].addShapeBox(0F, 0F, 0F, 4, 1, 17, 0F,-1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[333].setRotationPoint(-9.5F, -31.5F, -8.5F);

		gunModel[334].addShapeBox(0F, 0F, 0F, 4, 1, 17, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[334].setRotationPoint(-9.5F, -28.5F, -8.5F);

		gunModel[335].addShapeBox(0F, 0F, 0F, 4, 1, 17, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[335].setRotationPoint(-25.5F, 10F, -8.5F);

		gunModel[336].addShapeBox(0F, 0F, 0F, 4, 1, 17, 0F,-1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[336].setRotationPoint(-25.5F, 8.5F, -8.5F);

		gunModel[337].addShapeBox(0F, 0F, 0F, 4, 1, 17, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F); // Import ImportBox1
		gunModel[337].setRotationPoint(-25.5F, 11.5F, -8.5F);

		gunModel[338].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[338].setRotationPoint(18F, -35F, -6.5F);

		gunModel[339].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox1
		gunModel[339].setRotationPoint(18F, -34F, -6.5F);

		gunModel[340].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		gunModel[340].setRotationPoint(18F, -36F, -6.5F);

		gunModel[341].addShapeBox(-9F, -3F, 0F, 1, 3, 4, 0F,0F, -0.55F, -2.45F, 0F, -0.55F, -2.45F, 0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box177
		gunModel[341].setRotationPoint(-9F, -25F, 0F);

		gunModel[342].addShapeBox(-9F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.55F, -2.45F, 0F, -0.55F, -2.45F, 0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F); // Import Box178
		gunModel[342].setRotationPoint(-9F, -25F, 0F);

		gunModel[343].addShapeBox(-9F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.45F, -0.55F, 0F, -2.45F, -0.55F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F); // Import Box179
		gunModel[343].setRotationPoint(-9F, -25F, 0F);

		gunModel[344].addShapeBox(-9F, 0F, -3F, 1, 4, 3, 0F,0F, -2.45F, -0.55F, 0F, -2.45F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box180
		gunModel[344].setRotationPoint(-9F, -25F, 0F);

		gunModel[345].addShapeBox(-9F, 0F, -4F, 1, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, -0.55F, -2.45F, 0F, -0.55F, -2.45F); // Import Box181
		gunModel[345].setRotationPoint(-9F, -25F, 0F);

		gunModel[346].addShapeBox(-9F, -3F, -4F, 1, 3, 4, 0F,0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, -0.55F, -2.45F, 0F, -0.55F, -2.45F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box182
		gunModel[346].setRotationPoint(-9F, -25F, 0F);

		gunModel[347].addShapeBox(-9F, -4F, -3F, 1, 4, 3, 0F,0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.45F, -0.55F, 0F, -2.45F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box183
		gunModel[347].setRotationPoint(-9F, -25F, 0F);

		gunModel[348].addShapeBox(-9F, -4F, 0F, 1, 4, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.45F, -0.55F, 0F, -2.45F, -0.55F); // Import Box184
		gunModel[348].setRotationPoint(-9F, -25F, 0F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Import ImportBox1
		ammoModel[1] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Import ImportBox1
		ammoModel[2] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Import ImportBox1
		ammoModel[3] = new ModelRendererTurbo(this, 937, 129, textureX, textureY); // Import ImportBox1
		ammoModel[4] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Import ImportBox1
		ammoModel[5] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Import ImportBox1

		ammoModel[0].addShapeBox(0F, 0F, 0F, 20, 4, 11, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Import ImportBox1
		ammoModel[0].setRotationPoint(-33.75F, 20F, -5.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 20, 48, 11, 0F,-13F, 0F, 0F, 13F, -3F, 0F, 13F, -3F, 0F, -13F, 0F, 0F, 1F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, -2F, 0F); // Import ImportBox1
		ammoModel[1].setRotationPoint(-32.75F, -26F, -5.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0F, 0F); // Import ImportBox1
		ammoModel[2].setRotationPoint(-13.75F, 23F, -5.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -0.5F, 0F, -0.15F, -2.5F, 0F, -0.15F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.15F, -2.5F, 0F, 0.15F, -2.5F, 0F, 0F, -0.5F); // Import ImportBox1
		ammoModel[3].setRotationPoint(-11.75F, 23.25F, -4.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 2, 48, 11, 0F,-13F, 0F, 0F, 13F, -3F, -1.5F, 13F, -3F, -1.5F, -13F, 0F, 0F, 1F, -2F, 0F, -1F, -1.75F, -1.5F, -1F, -1.75F, -1.5F, 1F, -2F, 0F); // Import ImportBox1
		ammoModel[4].setRotationPoint(-12.75F, -23F, -5.5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 48, 9, 0F,-13F, 0F, -0.5F, 13F, -3F, -2.5F, 13F, -3F, -2.5F, -13F, 0F, -0.5F, 1F, -1.75F, -0.5F, -1F, -1.5F, -2.5F, -1F, -1.5F, -2.5F, 1F, -1.75F, -0.5F); // Import ImportBox1
		ammoModel[5].setRotationPoint(-10.75F, -23F, -4.5F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox1
		slideModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import ImportBox1
		slideModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import ImportBox1
		slideModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import ImportBox1
		slideModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import ImportBox1
		slideModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import ImportBox1
		slideModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import ImportBox1
		slideModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportBox1
		slideModel[8] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportBox1
		slideModel[9] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import ImportBox1
		slideModel[10] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import ImportBox1
		slideModel[11] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import ImportBox1
		slideModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import ImportBox1
		slideModel[13] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import ImportBox1
		slideModel[14] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import ImportBox1
		slideModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import ImportBox1
		slideModel[16] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import ImportBox1
		slideModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import ImportBox1
		slideModel[18] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import ImportBox1
		slideModel[19] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import ImportBox1
		slideModel[20] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import ImportBox1
		slideModel[21] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import ImportBox1
		slideModel[22] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import ImportBox1
		slideModel[23] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import ImportBox1
		slideModel[24] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import ImportBox1
		slideModel[25] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import ImportBox1
		slideModel[26] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import ImportBox1
		slideModel[27] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import ImportBox1
		slideModel[28] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import ImportBox1
		slideModel[29] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import ImportBox1
		slideModel[30] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import ImportBox1
		slideModel[31] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import ImportBox1
		slideModel[32] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import ImportBox1
		slideModel[33] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import ImportBox1
		slideModel[34] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import ImportBox1
		slideModel[35] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import ImportBox1
		slideModel[36] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import ImportBox1
		slideModel[37] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import ImportBox1
		slideModel[38] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Import ImportBox1
		slideModel[39] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import ImportBox1
		slideModel[40] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox1
		slideModel[41] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import ImportBox1
		slideModel[42] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import ImportBox1
		slideModel[43] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import ImportBox1
		slideModel[44] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Import ImportBox1
		slideModel[45] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import ImportBox1
		slideModel[46] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import ImportBox1
		slideModel[47] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Import ImportBox1
		slideModel[48] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Import ImportBox1
		slideModel[49] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Import ImportBox1
		slideModel[50] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import ImportBox1
		slideModel[51] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import ImportBox1
		slideModel[52] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import ImportBox1
		slideModel[53] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Import ImportBox1
		slideModel[54] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Import ImportBox1
		slideModel[55] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Import ImportBox1
		slideModel[56] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Import ImportBox1
		slideModel[57] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Import ImportBox1
		slideModel[58] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Import ImportBox1
		slideModel[59] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import ImportBox1
		slideModel[60] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import ImportBox1
		slideModel[61] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Import ImportBox1
		slideModel[62] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Import ImportBox1
		slideModel[63] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Import ImportBox1
		slideModel[64] = new ModelRendererTurbo(this, 921, 17, textureX, textureY); // Import ImportBox1
		slideModel[65] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Import ImportBox1
		slideModel[66] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import ImportBox1
		slideModel[67] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Import ImportBox1
		slideModel[68] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Import ImportBox1
		slideModel[69] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Import ImportBox1
		slideModel[70] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Import ImportBox1
		slideModel[71] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Import ImportBox1
		slideModel[72] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Import ImportBox1
		slideModel[73] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Import ImportBox1
		slideModel[74] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import ImportBox1
		slideModel[75] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox1
		slideModel[76] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportBox1
		slideModel[77] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import ImportBox1
		slideModel[78] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Import ImportBox1
		slideModel[79] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import ImportBox1
		slideModel[80] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import ImportBox1
		slideModel[81] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import ImportBox1
		slideModel[82] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import ImportBox1
		slideModel[83] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Import ImportBox1
		slideModel[84] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import ImportBox1
		slideModel[85] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportBox1
		slideModel[86] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Import ImportBox1
		slideModel[87] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import ImportBox1
		slideModel[88] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import ImportBox1
		slideModel[89] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import ImportBox1
		slideModel[90] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import ImportBox1
		slideModel[91] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import ImportBox1
		slideModel[92] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import ImportBox1
		slideModel[93] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import ImportBox1
		slideModel[94] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import ImportBox1
		slideModel[95] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import ImportBox1
		slideModel[96] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Import ImportBox1
		slideModel[97] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import ImportBox1
		slideModel[98] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Import ImportBox1
		slideModel[99] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import ImportBox1
		slideModel[100] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import ImportBox1
		slideModel[101] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import ImportBox1
		slideModel[102] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import ImportBox1
		slideModel[103] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Import ImportBox1
		slideModel[104] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Import ImportBox1
		slideModel[105] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Import ImportBox1
		slideModel[106] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Import ImportBox1
		slideModel[107] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportBox1
		slideModel[108] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import ImportBox1
		slideModel[109] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import ImportBox1
		slideModel[110] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Import ImportBox1
		slideModel[111] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Import ImportBox1
		slideModel[112] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Import ImportBox1
		slideModel[113] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import ImportBox1
		slideModel[114] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import ImportBox1
		slideModel[115] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import ImportBox1
		slideModel[116] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import ImportBox1
		slideModel[117] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import ImportBox1
		slideModel[118] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import ImportBox1
		slideModel[119] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import ImportBox1
		slideModel[120] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import ImportBox1
		slideModel[121] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import ImportBox1
		slideModel[122] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Import ImportBox1
		slideModel[123] = new ModelRendererTurbo(this, 865, 9, textureX, textureY); // Import ImportBox1
		slideModel[124] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Import ImportBox1
		slideModel[125] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Import ImportBox1
		slideModel[126] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import ImportBox1
		slideModel[127] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Import ImportBox1
		slideModel[128] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import ImportBox1
		slideModel[129] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import ImportBox1
		slideModel[130] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import ImportBox1
		slideModel[131] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import ImportBox1
		slideModel[132] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import ImportBox1
		slideModel[133] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Import ImportBox1
		slideModel[134] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import ImportBox1
		slideModel[135] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Import ImportBox1
		slideModel[136] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Import ImportBox1
		slideModel[137] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Import ImportBox1
		slideModel[138] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import ImportBox1
		slideModel[139] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import ImportBox1
		slideModel[140] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import ImportBox1
		slideModel[141] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import ImportBox1
		slideModel[142] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Import ImportBox1
		slideModel[143] = new ModelRendererTurbo(this, 673, 9, textureX, textureY); // Import ImportBox1
		slideModel[144] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Import ImportBox1
		slideModel[145] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import ImportBox1
		slideModel[146] = new ModelRendererTurbo(this, 585, 105, textureX, textureY); // Import ImportBox1
		slideModel[147] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Import ImportBox1
		slideModel[148] = new ModelRendererTurbo(this, 841, 137, textureX, textureY); // Import ImportBox1
		slideModel[149] = new ModelRendererTurbo(this, 553, 121, textureX, textureY); // Import ImportBox1
		slideModel[150] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Import ImportBox1
		slideModel[151] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Import ImportBox1
		slideModel[152] = new ModelRendererTurbo(this, 609, 153, textureX, textureY); // Import ImportBox1
		slideModel[153] = new ModelRendererTurbo(this, 697, 153, textureX, textureY); // Import ImportBox1
		slideModel[154] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Import ImportBox1
		slideModel[155] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Import ImportBox1
		slideModel[156] = new ModelRendererTurbo(this, 785, 153, textureX, textureY); // Import ImportBox1
		slideModel[157] = new ModelRendererTurbo(this, 633, 121, textureX, textureY); // Import ImportBox1
		slideModel[158] = new ModelRendererTurbo(this, 841, 121, textureX, textureY); // Import ImportBox1
		slideModel[159] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Import ImportBox1
		slideModel[160] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Import ImportBox1
		slideModel[161] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Import ImportBox1
		slideModel[162] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Import ImportBox1
		slideModel[163] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Import ImportBox1
		slideModel[164] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Import ImportBox1
		slideModel[165] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import ImportBox1
		slideModel[166] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import ImportBox1
		slideModel[167] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Import ImportBox1
		slideModel[168] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Import ImportBox1

		slideModel[0].addShapeBox(0F, 0F, 0F, 14, 9, 5, 0F,0F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.1F, 0.5F, -0.25F, -0.1F, 0.5F, -0.25F, -0.1F, 0F, 0F, -0.1F, 0F); // Import ImportBox1
		slideModel[0].setRotationPoint(17F, -47F, 1.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 21, 9, 13, 0F,0F, 0.5F, 0F, 2.75F, 0.5F, 0F, 2.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import ImportBox1
		slideModel[1].setRotationPoint(35F, -47F, -6.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F,0.25F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox1
		slideModel[2].setRotationPoint(31F, -47F, 1.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1.5F, -0.1F, 0F); // Import ImportBox1
		slideModel[3].setRotationPoint(33F, -39F, -6.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox1
		slideModel[4].setRotationPoint(33F, -40F, -6.5F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Import ImportBox1
		slideModel[5].setRotationPoint(32F, -40.5F, -6.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox1
		slideModel[6].setRotationPoint(31F, -39.75F, -6.5F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.9F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, 0.9F, 0F); // Import ImportBox1
		slideModel[7].setRotationPoint(30.5F, -40F, -6.5F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 8, 6, 13, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 1.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.75F, 0F, 0F); // Import ImportBox1
		slideModel[8].setRotationPoint(72F, -47F, -6.5F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 10, 2, 13, 0F,0F, -0.5F, -1F, 0.75F, -0.5F, -1F, 0.75F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		slideModel[9].setRotationPoint(4F, -49.5F, -6.5F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 23, 1, 11, 0F,0.5F, 0F, -2F, -1.25F, 0F, -2F, -1.25F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		slideModel[10].setRotationPoint(-7F, -50.5F, -5.5F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 22, 1, 8, 0F,0.75F, -0.5F, -2.75F, -0.25F, -0.5F, -2.75F, -0.25F, -0.5F, -2.75F, 0.75F, -0.5F, -2.75F, 0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import ImportBox1
		slideModel[11].setRotationPoint(-7F, -51.5F, -4F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, -2.75F, 0.25F, -0.5F, -2.75F, 0.25F, -0.5F, -2.75F, 0F, -0.5F, -2.75F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox1
		slideModel[12].setRotationPoint(77F, -51.5F, -4F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 8, 2, 13, 0F,0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		slideModel[13].setRotationPoint(72.5F, -49.5F, -6.5F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		slideModel[14].setRotationPoint(72.5F, -50.5F, -5.5F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-1F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox1
		slideModel[15].setRotationPoint(70F, -51.75F, -1F);

		slideModel[16].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.25F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		slideModel[16].setRotationPoint(71F, -54.25F, -1F);

		slideModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F); // Import ImportBox1
		slideModel[17].setRotationPoint(72F, -51.25F, -2.5F);

		slideModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,-0.5F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, -0.5F, -0.6F, -0.25F, -0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F); // Import ImportBox1
		slideModel[18].setRotationPoint(72F, -51.5F, -1.5F);

		slideModel[19].addShapeBox(0F, 0F, 0F, 14, 9, 13, 0F,-2.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0.75F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, 0.75F, -0.1F, 0F); // Import ImportBox1
		slideModel[19].setRotationPoint(1F, -47F, -6.5F);

		slideModel[20].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0.25F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox1
		slideModel[20].setRotationPoint(15F, -47F, 1.5F);

		slideModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.25F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.9F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.9F, 0F); // Import ImportBox1
		slideModel[21].setRotationPoint(14.5F, -40F, -5.5F);

		slideModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.9F, 0F, -0.25F, 0.9F, 0F, -0.25F, 0.5F, 0F); // Import ImportBox1
		slideModel[22].setRotationPoint(16.25F, -40F, -5.5F);

		slideModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F); // Import ImportBox1
		slideModel[23].setRotationPoint(15.75F, -40F, -5.5F);

		slideModel[24].addShapeBox(0F, 0F, 0F, 4, 9, 13, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.1F, 0F, -3F, -0.1F, 0F, -3F, -0.1F, 0F, 0F, -0.1F, 0F); // Import ImportBox1
		slideModel[24].setRotationPoint(-17F, -47F, -6.5F);

		slideModel[25].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import ImportBox1
		slideModel[25].setRotationPoint(-22F, -47F, -6.5F);

		slideModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.9F, 0F, -3.5F, 0.9F, 0F, -3.5F, 0.9F, 0F, -0.5F, 0.9F, 0F); // Import ImportBox1
		slideModel[26].setRotationPoint(-23F, -40F, 5.5F);

		slideModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, -1F, 0.9F, 0F); // Import ImportBox1
		slideModel[27].setRotationPoint(-18F, -40F, -4.5F);

		slideModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[28].setRotationPoint(-18F, -41F, -4.5F);

		slideModel[29].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Import ImportBox1
		slideModel[29].setRotationPoint(-22F, -49.5F, -6.5F);

		slideModel[30].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0.75F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0.75F, 0F, -2F, 1.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1.5F, 0.5F, 0F); // Import ImportBox1
		slideModel[30].setRotationPoint(-21F, -50.5F, -5.5F);

		slideModel[31].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-0.5F, -0.5F, -2.75F, 1.25F, -0.5F, -2.75F, 1.25F, -0.5F, -2.75F, -0.5F, -0.5F, -2.75F, -0.25F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Import ImportBox1
		slideModel[31].setRotationPoint(-22F, -51.5F, -4F);

		slideModel[32].addShapeBox(0F, 0F, 0F, 14, 1, 13, 0F,-0.75F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.75F, -0.5F, -1F, -0.57F, 0F, -0.65F, -0.33F, 0F, -0.65F, -0.33F, 0F, -0.65F, -0.57F, 0F, -0.65F); // Import ImportBox1
		slideModel[32].setRotationPoint(58.5F, -49.5F, -6.5F);

		slideModel[33].addShapeBox(0F, 0F, 0F, 2, 9, 12, 0F,0F, 0F, -0.15F, 0.5F, 0F, -0.15F, 0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.1F, -0.15F, 0.5F, -0.1F, -0.15F, 0.5F, -0.1F, -0.15F, 0F, -0.1F, -0.15F); // Import ImportBox1
		slideModel[33].setRotationPoint(56F, -47F, -6F);

		slideModel[34].addShapeBox(0F, 0F, 0F, 2, 10, 12, 0F,0.5F, 0.5F, -0.15F, 0F, 0.5F, -0.15F, 0F, 0.5F, -0.15F, 0.5F, 0.5F, -0.15F, 0.5F, -0.1F, -0.15F, 0F, -1.1F, -0.15F, 0F, -1.1F, -0.15F, 0.5F, -0.1F, -0.15F); // Import ImportBox1
		slideModel[34].setRotationPoint(59F, -48F, -6F);

		slideModel[35].addShapeBox(0F, 0F, 0F, 4, 9, 12, 0F,0.5F, 0.5F, -0.15F, 0F, 0.5F, -0.15F, 0F, 0.5F, -0.15F, 0.5F, 0.5F, -0.15F, 0.5F, -0.1F, -0.15F, 0F, -1.35F, -0.15F, 0F, -1.35F, -0.15F, 0.5F, -0.1F, -0.15F); // Import ImportBox1
		slideModel[35].setRotationPoint(61.5F, -48F, -6F);

		slideModel[36].addShapeBox(0F, 0F, 0F, 5, 8, 12, 0F,0.5F, 0.5F, -0.15F, 0F, 0.5F, -0.15F, 0F, 0.5F, -0.15F, 0.5F, 0.5F, -0.15F, 0.5F, -0.35F, -0.15F, 0F, -1.1F, -0.15F, 0F, -1.1F, -0.15F, 0.5F, -0.35F, -0.15F); // Import ImportBox1
		slideModel[36].setRotationPoint(66F, -48F, -6F);

		slideModel[37].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F); // Import ImportBox1
		slideModel[37].setRotationPoint(71F, -47F, -6F);

		slideModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F); // Import ImportBox1
		slideModel[38].setRotationPoint(71F, -48.5F, -6F);

		slideModel[39].addShapeBox(0F, 0F, 0F, 19, 11, 12, 0F,-3F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, -0.1F, -0.5F, -2.75F, -0.1F, -0.5F, -2.75F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Import ImportBox1
		slideModel[39].setRotationPoint(-16F, -49F, -6F);

		slideModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0.35F, -1F, -0.7F, -0.15F, -1F, -0.7F, -0.15F, -1F, -0.7F, 0.35F, -1F, -0.7F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import ImportBox1
		slideModel[40].setRotationPoint(-14F, -50.5F, -5.5F);

		slideModel[41].addShapeBox(0F, 0F, 0F, 1, 9, 13, 0F,-2.5F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0.25F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0.25F, -0.1F, 0F); // Import ImportBox1
		slideModel[41].setRotationPoint(57F, -47F, -6.5F);

		slideModel[42].addShapeBox(0F, 0F, 0F, 1, 9, 13, 0F,-2.5F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0.25F, -0.1F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0.25F, -0.1F, 0F); // Import ImportBox1
		slideModel[42].setRotationPoint(58.25F, -47F, -6.5F);

		slideModel[43].addShapeBox(0F, 0F, 0F, 1, 8, 13, 0F,-2.75F, 0.5F, 0F, 2.25F, 0.5F, 0F, 2.25F, 0.5F, 0F, -2.75F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		slideModel[43].setRotationPoint(59.5F, -47F, -6.5F);

		slideModel[44].addShapeBox(0F, 0F, 0F, 1, 7, 13, 0F,-2.75F, 0.5F, 0F, 2.25F, 0.5F, 0F, 2.25F, 0.5F, 0F, -2.75F, 0.5F, 0F, -0.25F, 0.9F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.9F, 0F); // Import ImportBox1
		slideModel[44].setRotationPoint(60.75F, -47F, -6.5F);

		slideModel[45].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,-2.75F, 0.5F, 0F, 2.25F, 0.5F, 0F, 2.25F, 0.5F, 0F, -2.75F, 0.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.35F, 0F, -0.25F, 1.35F, 0F, -0.25F, 1.5F, 0F); // Import ImportBox1
		slideModel[45].setRotationPoint(62.25F, -47F, -6.5F);

		slideModel[46].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,-2.75F, 0.5F, 0F, 2.25F, 0.5F, 0F, 2.25F, 0.5F, 0F, -2.75F, 0.5F, 0F, -0.25F, 1.05F, 0F, -0.25F, 0.9F, 0F, -0.25F, 0.9F, 0F, -0.25F, 1.05F, 0F); // Import ImportBox1
		slideModel[46].setRotationPoint(63.75F, -47F, -6.5F);

		slideModel[47].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,-2.75F, 0.5F, 0F, 2.25F, 0.5F, 0F, 2.25F, 0.5F, 0F, -2.75F, 0.5F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.6F, 0F, -0.25F, 0.6F, 0F, -0.25F, 0.65F, 0F); // Import ImportBox1
		slideModel[47].setRotationPoint(65.25F, -47F, -6.5F);

		slideModel[48].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,-2.5F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -2.5F, 0.5F, 0F, -0.25F, 0.45F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.45F, 0F); // Import ImportBox1
		slideModel[48].setRotationPoint(66.75F, -47F, -6.5F);

		slideModel[49].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,-2.5F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -2.5F, 0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.25F, 0F); // Import ImportBox1
		slideModel[49].setRotationPoint(68.25F, -47F, -6.5F);

		slideModel[50].addShapeBox(0F, 0F, 0F, 3, 9, 13, 0F,-2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0.75F, -0.1F, 0F, -3.25F, -0.1F, 0F, -3.25F, -0.1F, 0F, 0.75F, -0.1F, 0F); // Import ImportBox1
		slideModel[50].setRotationPoint(-0.5F, -47F, -6.5F);

		slideModel[51].addShapeBox(0F, 0F, 0F, 3, 9, 13, 0F,-2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0.75F, -0.1F, 0F, -3.25F, -0.1F, 0F, -3.25F, -0.1F, 0F, 0.75F, -0.1F, 0F); // Import ImportBox1
		slideModel[51].setRotationPoint(-1.75F, -47F, -6.5F);

		slideModel[52].addShapeBox(0F, 0F, 0F, 3, 9, 13, 0F,-2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0.75F, -0.1F, 0F, -3.25F, -0.1F, 0F, -3.25F, -0.1F, 0F, 0.75F, -0.1F, 0F); // Import ImportBox1
		slideModel[52].setRotationPoint(-3F, -47F, -6.5F);

		slideModel[53].addShapeBox(0F, 0F, 0F, 3, 9, 13, 0F,-2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0.75F, -0.1F, 0F, -3.25F, -0.1F, 0F, -3.25F, -0.1F, 0F, 0.75F, -0.1F, 0F); // Import ImportBox1
		slideModel[53].setRotationPoint(-4.5F, -47F, -6.5F);

		slideModel[54].addShapeBox(0F, 0F, 0F, 3, 9, 13, 0F,-2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0.75F, -0.1F, 0F, -3.25F, -0.1F, 0F, -3.25F, -0.1F, 0F, 0.75F, -0.1F, 0F); // Import ImportBox1
		slideModel[54].setRotationPoint(-6F, -47F, -6.5F);

		slideModel[55].addShapeBox(0F, 0F, 0F, 3, 9, 13, 0F,-2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0.75F, -0.1F, 0F, -3.25F, -0.1F, 0F, -3.25F, -0.1F, 0F, 0.75F, -0.1F, 0F); // Import ImportBox1
		slideModel[55].setRotationPoint(-7.5F, -47F, -6.5F);

		slideModel[56].addShapeBox(0F, 0F, 0F, 3, 9, 13, 0F,-2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0.75F, -0.1F, 0F, -3.25F, -0.1F, 0F, -3.25F, -0.1F, 0F, 0.75F, -0.1F, 0F); // Import ImportBox1
		slideModel[56].setRotationPoint(-8.75F, -47F, -6.5F);

		slideModel[57].addShapeBox(0F, 0F, 0F, 3, 9, 13, 0F,-2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0.75F, -0.1F, 0F, -3.25F, -0.1F, 0F, -3.25F, -0.1F, 0F, 0.75F, -0.1F, 0F); // Import ImportBox1
		slideModel[57].setRotationPoint(-10.25F, -47F, -6.5F);

		slideModel[58].addShapeBox(0F, 0F, 0F, 3, 9, 13, 0F,-2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0.75F, -0.1F, 0F, -3.25F, -0.1F, 0F, -3.25F, -0.1F, 0F, 0.75F, -0.1F, 0F); // Import ImportBox1
		slideModel[58].setRotationPoint(-11.75F, -47F, -6.5F);

		slideModel[59].addShapeBox(0F, 0F, 0F, 3, 9, 13, 0F,-2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0.75F, -0.1F, 0F, -3.25F, -0.1F, 0F, -3.25F, -0.1F, 0F, 0.75F, -0.1F, 0F); // Import ImportBox1
		slideModel[59].setRotationPoint(-13F, -47F, -6.5F);

		slideModel[60].addShapeBox(0F, 0F, 0F, 3, 9, 13, 0F,-2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0.75F, -0.1F, 0F, -3.25F, -0.1F, 0F, -3.25F, -0.1F, 0F, 0.75F, -0.1F, 0F); // Import ImportBox1
		slideModel[60].setRotationPoint(-14.5F, -47F, -6.5F);

		slideModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-1F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, -1F, 0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[61].setRotationPoint(-12.5F, -48.5F, -6.5F);

		slideModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-1F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, -1F, 0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[62].setRotationPoint(-11F, -48.5F, -6.5F);

		slideModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-1F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, -1F, 0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[63].setRotationPoint(-9.75F, -48.5F, -6.5F);

		slideModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-1F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, -1F, 0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[64].setRotationPoint(-8.25F, -48.5F, -6.5F);

		slideModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-1F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, -1F, 0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[65].setRotationPoint(-6.75F, -48.5F, -6.5F);

		slideModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-1F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, -1F, 0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[66].setRotationPoint(-5.5F, -48.5F, -6.5F);

		slideModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-1F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, -1F, 0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[67].setRotationPoint(-4F, -48.5F, -6.5F);

		slideModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-1F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, -1F, 0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[68].setRotationPoint(-2.5F, -48.5F, -6.5F);

		slideModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-1F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, -1F, 0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[69].setRotationPoint(-1F, -48.5F, -6.5F);

		slideModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-1F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, -1F, 0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[70].setRotationPoint(0.25F, -48.5F, -6.5F);

		slideModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-1F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, -1F, 0.5F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[71].setRotationPoint(1.5F, -48.5F, -6.5F);

		slideModel[72].addShapeBox(0F, 0F, 0F, 13, 1, 8, 0F,0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import ImportBox1
		slideModel[72].setRotationPoint(-20F, -50.5F, -4F);

		slideModel[73].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0.5F, 0F, 0F, 0.25F, -2.5F, 0F, 0.25F, -2.5F, 0.5F, 0.5F, 0F, 0.5F, 2.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 2.25F, 0F, 0.5F); // Import ImportBox1
		slideModel[73].setRotationPoint(-18F, -54F, -3.75F);

		slideModel[74].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0.5F, 0F, -1F, 0.25F, -2.5F, -1F, 0.25F, -2.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -2F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0.5F, 0.5F, -2F, 0.5F); // Import ImportBox1
		slideModel[74].setRotationPoint(-18F, -55F, -3.75F);

		slideModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 2.25F, 0F, -1F, -2.25F, 0F, 0F, -2.25F, 0F, 0.5F, 2.25F, 0F, 0.5F); // Import ImportBox1
		slideModel[75].setRotationPoint(-19F, -54F, -3.75F);

		slideModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import ImportBox1
		slideModel[76].setRotationPoint(-19F, -55F, -3.75F);

		slideModel[77].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0.5F, 0F, 0.5F, 0.25F, -2.5F, 0.5F, 0.25F, -2.5F, 0F, 0.5F, 0F, 0F, 2.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 2.25F, 0F, 0F); // Import ImportBox1
		slideModel[77].setRotationPoint(-18F, -54F, 2.75F);

		slideModel[78].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0.5F, 0F, 0.5F, 0.25F, -2.5F, 0.5F, 0.25F, -2.5F, -1F, 0.5F, 0F, -1F, 0.5F, -2F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0F, 0.5F, -2F, 0F); // Import ImportBox1
		slideModel[78].setRotationPoint(-18F, -55F, 2.75F);

		slideModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, -1F, 2.25F, 0F, 0.5F, -2.25F, 0F, 0.5F, -2.25F, 0F, 0F, 2.25F, 0F, -1F); // Import ImportBox1
		slideModel[79].setRotationPoint(-19F, -54F, 2.75F);

		slideModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -0.25F, 0F, -1F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, -1F); // Import ImportBox1
		slideModel[80].setRotationPoint(-19F, -55F, 2.75F);

		slideModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		slideModel[81].setRotationPoint(-8.75F, -53F, 2.75F);

		slideModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1.5F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[82].setRotationPoint(-8.75F, -53F, 2.75F);

		slideModel[83].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F); // Import ImportBox1
		slideModel[83].setRotationPoint(-20F, -51F, -4.5F);

		slideModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import ImportBox1
		slideModel[84].setRotationPoint(-8.75F, -53F, -3.25F);

		slideModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1.5F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[85].setRotationPoint(-8.75F, -53F, -3.25F);

		slideModel[86].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,1.65F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0.5F, 1.65F, 0F, 0.5F, 2.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 2.25F, 0F, 0.5F); // Import ImportBox1
		slideModel[86].setRotationPoint(-19F, -52F, -2.25F);

		slideModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -1.75F); // Import ImportBox1
		slideModel[87].setRotationPoint(-21.25F, -51F, -4.5F);

		slideModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox1
		slideModel[88].setRotationPoint(-19F, -53F, -2.25F);

		slideModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[89].setRotationPoint(-19F, -54.5F, -2.25F);

		slideModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[90].setRotationPoint(-19F, -54.5F, 1.25F);

		slideModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import ImportBox1
		slideModel[91].setRotationPoint(-19F, -54.5F, -1.25F);

		slideModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[92].setRotationPoint(-19F, -54.5F, 0.25F);

		slideModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import ImportBox1
		slideModel[93].setRotationPoint(-19.35F, -54.5F, -2.25F);

		slideModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import ImportBox1
		slideModel[94].setRotationPoint(-19.35F, -54.5F, 1.25F);

		slideModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import ImportBox1
		slideModel[95].setRotationPoint(70.65F, -54.7F, -0.5F);

		slideModel[96].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0.5F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox1
		slideModel[96].setRotationPoint(-18F, -53F, -2.25F);

		slideModel[97].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0.35F, 0F, 0F, -1.17F, 0F, 0F, -1.17F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[97].setRotationPoint(-18F, -54.5F, 1.25F);

		slideModel[98].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0.35F, 0F, 0F, -1.17F, 0F, 0F, -1.17F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[98].setRotationPoint(-18F, -54.5F, -2.25F);

		slideModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.17F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.75F, 0F, -0.17F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.75F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[99].setRotationPoint(-12F, -53.5F, -2.25F);

		slideModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.17F, 0F, 0F, -0.45F, -0.75F, 0F, -0.45F, 0F, 0F, -0.17F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[100].setRotationPoint(-12F, -53.5F, 1.25F);

		slideModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.45F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, -1F, 0F, -0.45F, -0.75F, 0F, 0.1F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -1F, 0F, 0.1F, -0.75F); // Import ImportBox1
		slideModel[101].setRotationPoint(-11F, -53.5F, -2.25F);

		slideModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.45F, -0.75F, 0F, -0.95F, -1F, 0F, -0.95F, 0F, 0F, -0.45F, 0F, 0F, 0.1F, -0.75F, 0F, 0.4F, -1F, 0F, 0.4F, 0F, 0F, 0.1F, 0F); // Import ImportBox1
		slideModel[102].setRotationPoint(-11F, -53.5F, 1.25F);

		slideModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, -0.5F, -1.45F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.45F); // Import ImportBox1
		slideModel[103].setRotationPoint(-21.25F, -50.5F, -4.5F);

		slideModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, -0.75F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[104].setRotationPoint(59F, -48.5F, -6.5F);

		slideModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, -0.75F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[105].setRotationPoint(60.25F, -48.5F, -6.5F);

		slideModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, -0.75F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[106].setRotationPoint(61.75F, -48.5F, -6.5F);

		slideModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, -0.75F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[107].setRotationPoint(63F, -48.5F, -6.5F);

		slideModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, -0.75F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[108].setRotationPoint(64.5F, -48.5F, -6.5F);

		slideModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, -0.75F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[109].setRotationPoint(66F, -48.5F, -6.5F);

		slideModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, -0.75F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[110].setRotationPoint(67.5F, -48.5F, -6.5F);

		slideModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, -0.75F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[111].setRotationPoint(68.75F, -48.5F, -6.5F);

		slideModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.75F, 0F, -0.65F, 0.25F, 0F, -0.65F, 0.25F, 0F, -0.65F, -0.75F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox1
		slideModel[112].setRotationPoint(70.25F, -48.5F, -6.5F);

		slideModel[113].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,-1.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import ImportBox1
		slideModel[113].setRotationPoint(-24.5F, -47F, -6.5F);

		slideModel[114].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 1F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 1F, 0.9F, 0F); // Import ImportBox1
		slideModel[114].setRotationPoint(-24.5F, -42F, -6.5F);

		slideModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportBox1
		slideModel[115].setRotationPoint(-23F, -49.5F, -6.5F);

		slideModel[116].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,-1.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import ImportBox1
		slideModel[116].setRotationPoint(-24.5F, -47F, 2.5F);

		slideModel[117].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 1F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 1F, 0.9F, 0F); // Import ImportBox1
		slideModel[117].setRotationPoint(-24.5F, -42F, 5.5F);

		slideModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportBox1
		slideModel[118].setRotationPoint(-23F, -49.5F, 2.5F);

		slideModel[119].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		slideModel[119].setRotationPoint(-22F, -49.5F, 1.5F);

		slideModel[120].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import ImportBox1
		slideModel[120].setRotationPoint(-22F, -47F, 2.5F);

		slideModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.67F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.67F, 1F, 0F); // Import ImportBox1
		slideModel[121].setRotationPoint(-24.5F, -42F, 2.5F);

		slideModel[122].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0.67F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.67F, 0F, 0F, 0.75F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0.75F, -0.5F, 0F); // Import ImportBox1
		slideModel[122].setRotationPoint(-24.5F, -40F, 4.5F);

		slideModel[123].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.85F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.85F, -0.5F, 0F); // Import ImportBox1
		slideModel[123].setRotationPoint(-24.5F, -39.5F, 4.5F);

		slideModel[124].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.85F, 0F, 0F, 0.92F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.92F, -0.5F, 0F); // Import ImportBox1
		slideModel[124].setRotationPoint(-24.5F, -39F, 4.5F);

		slideModel[125].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0.92F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.92F, 0F, 0F, 1F, -0.6F, 0.5F, -0.5F, -0.6F, 0.5F, -0.5F, -0.6F, 0F, 1F, -0.6F, 0F); // Import ImportBox1
		slideModel[125].setRotationPoint(-24.5F, -38.5F, 4.5F);

		slideModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.67F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.67F, 1F, 0F); // Import ImportBox1
		slideModel[126].setRotationPoint(-24.5F, -42F, -5.5F);

		slideModel[127].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0.87F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.87F, -0.25F, 0F, 1F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 1F, -0.1F, 0F); // Import ImportBox1
		slideModel[127].setRotationPoint(-24.5F, -39F, -5.5F);

		slideModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.67F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.67F, -0.25F, 0F, 0.75F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0.75F, -0.35F, 0F); // Import ImportBox1
		slideModel[128].setRotationPoint(-24.5F, -40.25F, -5.5F);

		slideModel[129].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F); // Import ImportBox1
		slideModel[129].setRotationPoint(-22.5F, -40.5F, 5F);

		slideModel[130].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.6F, 0F, -0.25F, -0.6F, 0F); // Import ImportBox1
		slideModel[130].setRotationPoint(14.5F, -40.5F, 5F);

		slideModel[131].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F,-0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.6F, -0.5F, -1F, -0.6F, -0.5F, -1F, -0.6F, 0F, -0.25F, -0.6F, 0F); // Import ImportBox1
		slideModel[131].setRotationPoint(30.5F, -40.5F, -1F);

		slideModel[132].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[132].setRotationPoint(-22.5F, -41F, 2.5F);

		slideModel[133].addShapeBox(0F, 0F, 0F, 24, 4, 9, 0F,-0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Import ImportBox1
		slideModel[133].setRotationPoint(56.25F, -38F, -4.5F);

		slideModel[134].addShapeBox(0F, 0F, 0F, 24, 2, 9, 0F,-0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import ImportBox1
		slideModel[134].setRotationPoint(56.25F, -34F, -4.5F);

		slideModel[135].addShapeBox(0F, 0F, 0F, 24, 1, 9, 0F,-0.5F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.75F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.75F, -0.5F, 0F, -1.75F); // Import ImportBox1
		slideModel[135].setRotationPoint(56.25F, -32F, -4.5F);

		slideModel[136].addShapeBox(0F, 0F, 0F, 24, 1, 7, 0F,-0.5F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, -2.75F, 0.25F, -0.5F, -2.75F, 0.25F, -0.5F, -2.75F, -0.5F, -0.5F, -2.75F); // Import ImportBox1
		slideModel[136].setRotationPoint(56.25F, -31F, -3.5F);

		slideModel[137].addShapeBox(0F, 0F, 0F, 24, 3, 9, 0F,-0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Import ImportBox1
		slideModel[137].setRotationPoint(56.25F, -41F, -4.5F);

		slideModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import ImportBox1
		slideModel[138].setRotationPoint(79.25F, -41F, 5.5F);

		slideModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F); // Import ImportBox1
		slideModel[139].setRotationPoint(79.25F, -40F, 5.5F);

		slideModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import ImportBox1
		slideModel[140].setRotationPoint(79.25F, -41F, -6.5F);

		slideModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, -0.5F, -1.5F, 0.25F, -0.5F, -1.5F, 0.25F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F); // Import ImportBox1
		slideModel[141].setRotationPoint(79.25F, -40F, -6.5F);

		slideModel[142].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.5F, -0.1F, 0F, -1.5F, -0.1F, 0F, -1.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox1
		slideModel[142].setRotationPoint(31.5F, -39.1F, -6.5F);

		slideModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, 0.1F, 0F, -0.5F, -1.1F, 0F, -0.25F, -1.1F, 0F, -0.25F, -1.1F, 0F, -0.5F, -1.1F, 0F); // Import ImportBox1
		slideModel[143].setRotationPoint(30.25F, -38F, -6.5F);

		slideModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportBox1
		slideModel[144].setRotationPoint(32F, -40F, -6.5F);

		slideModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.25F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportBox1
		slideModel[145].setRotationPoint(32F, -40.5F, -6.5F);

		slideModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox1
		slideModel[146].setRotationPoint(30.75F, -40F, -6.5F);

		slideModel[147].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.25F, 0.9F, 0F); // Import ImportBox1
		slideModel[147].setRotationPoint(14.5F, -40F, -6.5F);

		slideModel[148].addShapeBox(0F, 0F, 0F, 14, 3, 8, 0F,0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, 0F, -0.1F, 0F); // Import ImportBox1
		slideModel[148].setRotationPoint(17F, -41F, -6.5F);

		slideModel[149].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox1
		slideModel[149].setRotationPoint(15F, -41F, -6.5F);

		slideModel[150].addShapeBox(0F, 0F, 0F, 23, 2, 13, 0F,0F, -0.5F, -1F, 1.25F, -0.5F, -1F, 1.25F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[150].setRotationPoint(35F, -49.5F, -6.5F);

		slideModel[151].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox1
		slideModel[151].setRotationPoint(31F, -41F, -6.5F);

		slideModel[152].addShapeBox(0F, 0F, 0F, 38, 1, 11, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		slideModel[152].setRotationPoint(35F, -50.5F, -5.5F);

		slideModel[153].addShapeBox(0F, 0F, 0F, 37, 1, 8, 0F,0F, -0.5F, -2.75F, 0.5F, -0.5F, -2.75F, 0.5F, -0.5F, -2.75F, 0F, -0.5F, -2.75F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox1
		slideModel[153].setRotationPoint(35F, -51.5F, -4F);

		slideModel[154].addShapeBox(0F, 0F, 0F, 20, 2, 5, 0F,0.25F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportBox1
		slideModel[154].setRotationPoint(15F, -49.5F, 1.5F);

		slideModel[155].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0.25F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -2F, 0.25F, -0.5F, -2F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportBox1
		slideModel[155].setRotationPoint(15F, -51F, 1.5F);

		slideModel[156].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0.25F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -4.25F, 0.25F, -1F, -4.25F, 0.25F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -2F, 0.25F, 0.5F, -2F); // Import ImportBox1
		slideModel[156].setRotationPoint(15F, -52F, 1.5F);

		slideModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		slideModel[157].setRotationPoint(14.75F, -44F, -6.5F);

		slideModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		slideModel[158].setRotationPoint(15.75F, -43F, -6.5F);

		slideModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		slideModel[159].setRotationPoint(34F, -44F, -6.5F);

		slideModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox1
		slideModel[160].setRotationPoint(32F, -43F, -6.5F);

		slideModel[161].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0.5F, 0.9F, 0F); // Import ImportBox1
		slideModel[161].setRotationPoint(-22F, -40F, -6.5F);

		slideModel[162].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[162].setRotationPoint(79.5F, -49F, -1.5F);

		slideModel[163].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[163].setRotationPoint(79.5F, -46F, -4.5F);

		slideModel[164].addShapeBox(0F, 0F, 0F, 2, 7, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox1
		slideModel[164].setRotationPoint(79.5F, -43F, -4.5F);

		slideModel[165].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[165].setRotationPoint(79.5F, -49F, -3.5F);

		slideModel[166].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[166].setRotationPoint(79.5F, -48F, -4.5F);

		slideModel[167].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[167].setRotationPoint(79.5F, -49F, 1.5F);

		slideModel[168].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		slideModel[168].setRotationPoint(79.5F, -48F, 3.5F);
	}
}