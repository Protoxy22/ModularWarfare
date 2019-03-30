//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: mk20
// Model Creator: 
// Created on: 30.01.2019 - 19:00:15
// Last changed on: 30.01.2019 - 19:00:15

package com.modularwarfare.client.model.mwp; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class mk20 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public mk20() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[481];
		defaultScopeModel = new ModelRendererTurbo[98];
		ammoModel = new ModelRendererTurbo[14];
		slideModel = new ModelRendererTurbo[21];

		initgunModel_1();
		initdefaultScopeModel_1();
		initammoModel_1();
		initslideModel_1();

		modelScale = 0.06F;
//		barrelAttachPoint = new Vector3f(290F /16F, 67F /16F, 0F /16F);
//		gripAttachPoint = new Vector3f(165 /16F, 54F /16F, 0F /16F);
//		scopeAttachPoint = new Vector3f(10 /16F, 87F /16F, 0F /16F);

		translateAll = new Vector3f(-0.5F, -19.5F, -0.5F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.07F, 0F);//forward/up/?

		gunSlideDistance = 3F;
		reloadAnimation = WeaponAnimations.RIFLE4;

		rotateGunVertical = 35F;
		rotateGunHorizontal = 1F;
		tiltGun = 25F;
		/*tiltGunTime = 0.15F;
		unloadClipTime = 0.35F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.15F;*/
		translateGun = new Vector3f(1 /16F, 2F /16F, -1F /16F);
		rotateClipVertical = -91F;
		rotateClipHorizontal = 1F;
		tiltClip = 28F;
		translateClip = new Vector3f(1 /16F, -40F /16F, 1F /16F);

		hasFlash = false;
        
        leftArmPos = new Vector3f(0.350F, -0.54F, 0.02F);
        leftArmRot = new Vector3f(65.0F, 30.0F, -45.0F);
		leftArmReloadPos = new Vector3f(0.130F, -0.72F, 0.02F);
        leftArmReloadRot = new Vector3f(35.0F, 0.0F, -25.0F);
        
 
        rightArmPos = new Vector3f(-0.72F, -0.11F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(-0.38F, -0.44F, 0.01F);
        rightArmReloadRot = new Vector3f(0.0F, 0.0F, -70.0F);
        rightArmChargePos = new Vector3f(-0.20F, 0.42F, -0.31F);
        rightArmChargeRot = new Vector3f(-30.0F, -0.0F, -60.0F);
        
        rightArmScale = new Vector3f(0.60F, 1.0F, 0.60F);
        leftArmScale = new Vector3f(0.60F, 1.0F, 0.60F);
 
        leftHandAmmo = false;
        
		//RecoilSlideDistance = 0.15F;
		//RotateSlideDistance = -0.5F;
		
		casingAttachPoint = new Vector3f(40F /16F, 73F /16F, 0.05F /16F);
		casingAnimDistance = new Vector3f(3, 1, 12);
	    casingAnimSpread = new Vector3f(2, 2, 0);
	    casingAnimTime = 5;  
		casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);
	    //caseScale = 1.0F;
		
		slideLockOnEmpty = true;

		crouchZoom = -0.15F;
		fancyStance = true;
		sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
		sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);



		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import ImportBox0
		gunModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import ImportBox0
		gunModel[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import ImportBox0
		gunModel[4] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import ImportBox0
		gunModel[5] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import ImportBox0
		gunModel[6] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import ImportBox0
		gunModel[7] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import ImportBox0
		gunModel[8] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import ImportBox0
		gunModel[9] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import ImportBox0
		gunModel[10] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Import ImportBox0
		gunModel[11] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import ImportBox0
		gunModel[12] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import ImportBox0
		gunModel[13] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Import ImportBox0
		gunModel[14] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import ImportBox0
		gunModel[15] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Import ImportBox0
		gunModel[16] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import ImportBox0
		gunModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportBox0
		gunModel[18] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import ImportBox18
		gunModel[19] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Import ImportBox18
		gunModel[20] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Import ImportBox18
		gunModel[21] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Import ImportBox18
		gunModel[22] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import ImportBox0
		gunModel[23] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import ImportBox18
		gunModel[24] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import ImportBox18
		gunModel[25] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Import ImportBox18
		gunModel[26] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import ImportBox18
		gunModel[27] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import ImportBox18
		gunModel[28] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import ImportBox18
		gunModel[29] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Import ImportBox18
		gunModel[30] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportBox18
		gunModel[31] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import ImportBox18
		gunModel[32] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import ImportBox18
		gunModel[33] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import ImportBox18
		gunModel[34] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import ImportBox18
		gunModel[35] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Import ImportBox18
		gunModel[36] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import ImportBox18
		gunModel[37] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import ImportBox0
		gunModel[38] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Import ImportBox0
		gunModel[39] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Import ImportBox0
		gunModel[40] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Import ImportBox0
		gunModel[41] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Import ImportBox0
		gunModel[42] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Import ImportBox0
		gunModel[43] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Import ImportBox0
		gunModel[44] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Import ImportBox0
		gunModel[45] = new ModelRendererTurbo(this, 593, 33, textureX, textureY); // Import ImportBox0
		gunModel[46] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportBox0
		gunModel[47] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Import ImportBox0
		gunModel[48] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Import ImportBox0
		gunModel[49] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Import ImportBox0
		gunModel[50] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import ImportBox0
		gunModel[51] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); // Import ImportBox0
		gunModel[52] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Import ImportBox0
		gunModel[53] = new ModelRendererTurbo(this, 577, 89, textureX, textureY); // Import ImportBox0
		gunModel[54] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import ImportBox0
		gunModel[55] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Import ImportBox0
		gunModel[56] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Import ImportBox0
		gunModel[57] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Import ImportBox0
		gunModel[58] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import ImportBox0
		gunModel[59] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Import ImportBox0
		gunModel[60] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Import ImportBox0
		gunModel[61] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Import ImportBox0
		gunModel[62] = new ModelRendererTurbo(this, 857, 113, textureX, textureY); // Import ImportBox0
		gunModel[63] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Import ImportBox0
		gunModel[64] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import ImportBox0
		gunModel[65] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Import ImportBox0
		gunModel[66] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportBox0
		gunModel[67] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Import ImportBox0
		gunModel[68] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import ImportBox0
		gunModel[69] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Import ImportBox0
		gunModel[70] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import ImportBox0
		gunModel[71] = new ModelRendererTurbo(this, 513, 161, textureX, textureY); // Import ImportBox0
		gunModel[72] = new ModelRendererTurbo(this, 849, 129, textureX, textureY); // Import ImportBox0
		gunModel[73] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Import ImportBox0
		gunModel[74] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Import ImportBox0
		gunModel[75] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Import ImportBox0
		gunModel[76] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import ImportBox0
		gunModel[77] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Import ImportBox0
		gunModel[78] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Import ImportBox0
		gunModel[79] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Import ImportBox0
		gunModel[80] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Import ImportBox0
		gunModel[81] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Import ImportBox0
		gunModel[82] = new ModelRendererTurbo(this, 873, 89, textureX, textureY); // Import ImportBox0
		gunModel[83] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Import ImportBox0
		gunModel[84] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Import ImportBox0
		gunModel[85] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Import ImportBox0
		gunModel[86] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Import ImportBox0
		gunModel[87] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import ImportBox0
		gunModel[88] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Import ImportBox0
		gunModel[89] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Import ImportBox0
		gunModel[90] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[91] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import ImportBox0
		gunModel[92] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import ImportBox0
		gunModel[93] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import ImportBox0
		gunModel[94] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import ImportBox0
		gunModel[95] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Import ImportBox0
		gunModel[96] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import ImportBox0
		gunModel[97] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import ImportBox0
		gunModel[98] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import ImportBox0
		gunModel[99] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Import ImportBox0
		gunModel[100] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import ImportBox0
		gunModel[101] = new ModelRendererTurbo(this, 897, 97, textureX, textureY); // Import ImportBox0
		gunModel[102] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Import ImportBox18
		gunModel[103] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Import ImportBox18
		gunModel[104] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Import ImportBox18
		gunModel[105] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Import ImportBox18
		gunModel[106] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Import ImportBox18
		gunModel[107] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Import ImportBox0
		gunModel[108] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Import ImportBox0
		gunModel[109] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Import ImportBox0
		gunModel[110] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Import ImportBox0
		gunModel[111] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Import ImportBox0
		gunModel[112] = new ModelRendererTurbo(this, 529, 145, textureX, textureY); // Import ImportBox0
		gunModel[113] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Import ImportBox0
		gunModel[114] = new ModelRendererTurbo(this, 593, 145, textureX, textureY); // Import ImportBox0
		gunModel[115] = new ModelRendererTurbo(this, 633, 145, textureX, textureY); // Import ImportBox0
		gunModel[116] = new ModelRendererTurbo(this, 673, 145, textureX, textureY); // Import ImportBox18
		gunModel[117] = new ModelRendererTurbo(this, 713, 145, textureX, textureY); // Import ImportBox18
		gunModel[118] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Import ImportBox18
		gunModel[119] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Import ImportBox18
		gunModel[120] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Import ImportBox18
		gunModel[121] = new ModelRendererTurbo(this, 1001, 105, textureX, textureY); // Import ImportBox18
		gunModel[122] = new ModelRendererTurbo(this, 513, 169, textureX, textureY); // Import ImportBox18
		gunModel[123] = new ModelRendererTurbo(this, 553, 169, textureX, textureY); // Import ImportBox18
		gunModel[124] = new ModelRendererTurbo(this, 577, 169, textureX, textureY); // Import ImportBox18
		gunModel[125] = new ModelRendererTurbo(this, 625, 169, textureX, textureY); // Import ImportBox18
		gunModel[126] = new ModelRendererTurbo(this, 665, 169, textureX, textureY); // Import ImportBox18
		gunModel[127] = new ModelRendererTurbo(this, 745, 145, textureX, textureY); // Import ImportBox18
		gunModel[128] = new ModelRendererTurbo(this, 785, 145, textureX, textureY); // Import ImportBox18
		gunModel[129] = new ModelRendererTurbo(this, 825, 145, textureX, textureY); // Import ImportBox18
		gunModel[130] = new ModelRendererTurbo(this, 865, 145, textureX, textureY); // Import ImportBox18
		gunModel[131] = new ModelRendererTurbo(this, 905, 145, textureX, textureY); // Import ImportBox18
		gunModel[132] = new ModelRendererTurbo(this, 705, 169, textureX, textureY); // Import ImportBox18
		gunModel[133] = new ModelRendererTurbo(this, 777, 169, textureX, textureY); // Import ImportBox18
		gunModel[134] = new ModelRendererTurbo(this, 849, 169, textureX, textureY); // Import ImportBox18
		gunModel[135] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Import ImportBox18
		gunModel[136] = new ModelRendererTurbo(this, 913, 169, textureX, textureY); // Import ImportBox18
		gunModel[137] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import ImportBox18
		gunModel[138] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Import ImportBox18
		gunModel[139] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Import ImportBox18
		gunModel[140] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Import ImportBox18
		gunModel[141] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Import ImportBox18
		gunModel[142] = new ModelRendererTurbo(this, 937, 97, textureX, textureY); // Import ImportBox18
		gunModel[143] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import ImportBox18
		gunModel[144] = new ModelRendererTurbo(this, 953, 169, textureX, textureY); // Import ImportBox18
		gunModel[145] = new ModelRendererTurbo(this, 705, 185, textureX, textureY); // Import ImportBox18
		gunModel[146] = new ModelRendererTurbo(this, 761, 185, textureX, textureY); // Import ImportBox18
		gunModel[147] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Import ImportBox18
		gunModel[148] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox18
		gunModel[149] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Import ImportBox18
		gunModel[150] = new ModelRendererTurbo(this, 617, 145, textureX, textureY); // Import ImportBox18
		gunModel[151] = new ModelRendererTurbo(this, 657, 145, textureX, textureY); // Import ImportBox18
		gunModel[152] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Import ImportBox18
		gunModel[153] = new ModelRendererTurbo(this, 769, 145, textureX, textureY); // Import ImportBox18
		gunModel[154] = new ModelRendererTurbo(this, 809, 145, textureX, textureY); // Import ImportBox18
		gunModel[155] = new ModelRendererTurbo(this, 825, 185, textureX, textureY); // Import ImportBox18
		gunModel[156] = new ModelRendererTurbo(this, 865, 185, textureX, textureY); // Import ImportBox18
		gunModel[157] = new ModelRendererTurbo(this, 897, 185, textureX, textureY); // Import ImportBox18
		gunModel[158] = new ModelRendererTurbo(this, 849, 145, textureX, textureY); // Import ImportBox18
		gunModel[159] = new ModelRendererTurbo(this, 889, 145, textureX, textureY); // Import ImportBox18
		gunModel[160] = new ModelRendererTurbo(this, 961, 145, textureX, textureY); // Import ImportBox18
		gunModel[161] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import ImportBox18
		gunModel[162] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Import ImportBox18
		gunModel[163] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Import ImportBox18
		gunModel[164] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Import ImportBox18
		gunModel[165] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Import ImportBox18
		gunModel[166] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Import ImportBox0
		gunModel[167] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import ImportBox0
		gunModel[168] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import ImportBox0
		gunModel[169] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Import ImportBox0
		gunModel[170] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Import ImportBox0
		gunModel[171] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Import ImportBox0
		gunModel[172] = new ModelRendererTurbo(this, 553, 193, textureX, textureY); // Import ImportBox0
		gunModel[173] = new ModelRendererTurbo(this, 945, 193, textureX, textureY); // Import ImportBox0
		gunModel[174] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Import ImportBox0
		gunModel[175] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import ImportBox0
		gunModel[176] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import ImportBox0
		gunModel[177] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Import ImportBox0
		gunModel[178] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Import ImportBox0
		gunModel[179] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Import ImportBox0
		gunModel[180] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import ImportBox0
		gunModel[181] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import ImportBox0
		gunModel[182] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportBox0
		gunModel[183] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import ImportBox0
		gunModel[184] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import ImportBox0
		gunModel[185] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Import ImportBox0
		gunModel[186] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import ImportBox0
		gunModel[187] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import ImportBox0
		gunModel[188] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Import ImportBox0
		gunModel[189] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Import ImportBox0
		gunModel[190] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Import ImportBox0
		gunModel[191] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Import ImportBox0
		gunModel[192] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Import ImportBox0
		gunModel[193] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Import ImportBox0
		gunModel[194] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import ImportBox0
		gunModel[195] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import ImportBox0
		gunModel[196] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import ImportBox0
		gunModel[197] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import ImportBox0
		gunModel[198] = new ModelRendererTurbo(this, 585, 193, textureX, textureY); // Import ImportBox0
		gunModel[199] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Import ImportBox0
		gunModel[200] = new ModelRendererTurbo(this, 801, 201, textureX, textureY); // Import ImportBox0
		gunModel[201] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import ImportBox0
		gunModel[202] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Import ImportBox0
		gunModel[203] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportBox0
		gunModel[204] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import ImportBox0
		gunModel[205] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import ImportBox0
		gunModel[206] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Import ImportBox0
		gunModel[207] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Import ImportBox0
		gunModel[208] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Import ImportBox0
		gunModel[209] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Import ImportBox0
		gunModel[210] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Import ImportBox0
		gunModel[211] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Import ImportBox0
		gunModel[212] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Import ImportBox0
		gunModel[213] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Import ImportBox0
		gunModel[214] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Import ImportBox0
		gunModel[215] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Import ImportBox0
		gunModel[216] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Import ImportBox0
		gunModel[217] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Import ImportBox0
		gunModel[218] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Import ImportBox0
		gunModel[219] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Import ImportBox18
		gunModel[220] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Import ImportBox18
		gunModel[221] = new ModelRendererTurbo(this, 977, 193, textureX, textureY); // Import ImportBox18
		gunModel[222] = new ModelRendererTurbo(this, 833, 201, textureX, textureY); // Import ImportBox18
		gunModel[223] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Import ImportBox18
		gunModel[224] = new ModelRendererTurbo(this, 865, 201, textureX, textureY); // Import ImportBox18
		gunModel[225] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import ImportBox18
		gunModel[226] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Import ImportBox18
		gunModel[227] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Import ImportBox18
		gunModel[228] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Import ImportBox18
		gunModel[229] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Import ImportBox18
		gunModel[230] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportBox18
		gunModel[231] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Import ImportBox18
		gunModel[232] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Import ImportBox18
		gunModel[233] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Import ImportBox18
		gunModel[234] = new ModelRendererTurbo(this, 641, 193, textureX, textureY); // Import ImportBox18
		gunModel[235] = new ModelRendererTurbo(this, 665, 209, textureX, textureY); // Import ImportBox18
		gunModel[236] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Import ImportBox18
		gunModel[237] = new ModelRendererTurbo(this, 745, 209, textureX, textureY); // Import ImportBox18
		gunModel[238] = new ModelRendererTurbo(this, 233, 209, textureX, textureY); // Import ImportBox18
		gunModel[239] = new ModelRendererTurbo(this, 1017, 121, textureX, textureY); // Import ImportBox18
		gunModel[240] = new ModelRendererTurbo(this, 1009, 169, textureX, textureY); // Import ImportBox18
		gunModel[241] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import ImportBox18
		gunModel[242] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import ImportBox18
		gunModel[243] = new ModelRendererTurbo(this, 897, 209, textureX, textureY); // Import ImportBox0
		gunModel[244] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Import ImportBox0
		gunModel[245] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Import ImportBox0
		gunModel[246] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import ImportBox0
		gunModel[247] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import ImportBox0
		gunModel[248] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import ImportBox0
		gunModel[249] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Import ImportBox0
		gunModel[250] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Import ImportBox0
		gunModel[251] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Import ImportBox0
		gunModel[252] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Import ImportBox0
		gunModel[253] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Import ImportBox0
		gunModel[254] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Import ImportBox18
		gunModel[255] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Import ImportBox18
		gunModel[256] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportBox18
		gunModel[257] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import ImportBox18
		gunModel[258] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Import ImportBox18
		gunModel[259] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import ImportBox18
		gunModel[260] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Import ImportBox18
		gunModel[261] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // Import ImportBox18
		gunModel[262] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import ImportBox18
		gunModel[263] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import ImportBox18
		gunModel[264] = new ModelRendererTurbo(this, 593, 33, textureX, textureY); // Import ImportBox18
		gunModel[265] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportBox18
		gunModel[266] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Import ImportBox18
		gunModel[267] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Import ImportBox18
		gunModel[268] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Import ImportBox18
		gunModel[269] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Import ImportBox18
		gunModel[270] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Import ImportBox18
		gunModel[271] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Import ImportBox18
		gunModel[272] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Import ImportBox18
		gunModel[273] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import ImportBox18
		gunModel[274] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Import ImportBox18
		gunModel[275] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import ImportBox18
		gunModel[276] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Import ImportBox18
		gunModel[277] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Import ImportBox18
		gunModel[278] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Import ImportBox18
		gunModel[279] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Import ImportBox0
		gunModel[280] = new ModelRendererTurbo(this, 777, 225, textureX, textureY); // Import ImportBox0
		gunModel[281] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import ImportBox0
		gunModel[282] = new ModelRendererTurbo(this, 609, 233, textureX, textureY); // Import ImportBox0
		gunModel[283] = new ModelRendererTurbo(this, 521, 145, textureX, textureY); // Import ImportBox0
		gunModel[284] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Import ImportBox0
		gunModel[285] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Import ImportBox0
		gunModel[286] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Import ImportBox0
		gunModel[287] = new ModelRendererTurbo(this, 585, 193, textureX, textureY); // Import ImportBox0
		gunModel[288] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Import ImportBox0
		gunModel[289] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Import ImportBox0
		gunModel[290] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Import ImportBox0
		gunModel[291] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Import ImportBox0
		gunModel[292] = new ModelRendererTurbo(this, 697, 65, textureX, textureY); // Import ImportBox0
		gunModel[293] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Import ImportBox0
		gunModel[294] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Import ImportBox0
		gunModel[295] = new ModelRendererTurbo(this, 889, 73, textureX, textureY); // Import ImportBox0
		gunModel[296] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Import ImportBox0
		gunModel[297] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Import ImportBox0
		gunModel[298] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Import ImportBox0
		gunModel[299] = new ModelRendererTurbo(this, 577, 49, textureX, textureY); // Import ImportBox0
		gunModel[300] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Import ImportBox0
		gunModel[301] = new ModelRendererTurbo(this, 929, 225, textureX, textureY); // Import ImportBox0
		gunModel[302] = new ModelRendererTurbo(this, 977, 225, textureX, textureY); // Import ImportBox0
		gunModel[303] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Import ImportBox0
		gunModel[304] = new ModelRendererTurbo(this, 145, 233, textureX, textureY); // Import ImportBox0
		gunModel[305] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Import ImportBox0
		gunModel[306] = new ModelRendererTurbo(this, 705, 233, textureX, textureY); // Import ImportBox0
		gunModel[307] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Import ImportBox0
		gunModel[308] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Import ImportBox0
		gunModel[309] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Import ImportBox0
		gunModel[310] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Import ImportBox0
		gunModel[311] = new ModelRendererTurbo(this, 545, 41, textureX, textureY); // Import ImportBox0
		gunModel[312] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Import ImportBox0
		gunModel[313] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import ImportBox0
		gunModel[314] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Import ImportBox0
		gunModel[315] = new ModelRendererTurbo(this, 873, 233, textureX, textureY); // Import ImportBox0
		gunModel[316] = new ModelRendererTurbo(this, 305, 241, textureX, textureY); // Import ImportBox0
		gunModel[317] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Import ImportBox0
		gunModel[318] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Import ImportBox0
		gunModel[319] = new ModelRendererTurbo(this, 185, 249, textureX, textureY); // Import ImportBox0
		gunModel[320] = new ModelRendererTurbo(this, 601, 249, textureX, textureY); // Import ImportBox0
		gunModel[321] = new ModelRendererTurbo(this, 905, 233, textureX, textureY); // Import ImportBox0
		gunModel[322] = new ModelRendererTurbo(this, 737, 241, textureX, textureY); // Import ImportBox0
		gunModel[323] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Import ImportBox0
		gunModel[324] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Import ImportBox0
		gunModel[325] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Import ImportBox0
		gunModel[326] = new ModelRendererTurbo(this, 57, 249, textureX, textureY); // Import ImportBox0
		gunModel[327] = new ModelRendererTurbo(this, 665, 249, textureX, textureY); // Import ImportBox0
		gunModel[328] = new ModelRendererTurbo(this, 609, 169, textureX, textureY); // Import ImportBox0
		gunModel[329] = new ModelRendererTurbo(this, 649, 169, textureX, textureY); // Import ImportBox0
		gunModel[330] = new ModelRendererTurbo(this, 689, 169, textureX, textureY); // Import ImportBox0
		gunModel[331] = new ModelRendererTurbo(this, 777, 249, textureX, textureY); // Import ImportBox0
		gunModel[332] = new ModelRendererTurbo(this, 249, 249, textureX, textureY); // Import ImportBox18
		gunModel[333] = new ModelRendererTurbo(this, 929, 249, textureX, textureY); // Import ImportBox18
		gunModel[334] = new ModelRendererTurbo(this, 809, 249, textureX, textureY); // Import ImportBox18
		gunModel[335] = new ModelRendererTurbo(this, 89, 257, textureX, textureY); // Import ImportBox18
		gunModel[336] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Import ImportBox18
		gunModel[337] = new ModelRendererTurbo(this, 265, 257, textureX, textureY); // Import ImportBox18
		gunModel[338] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Import ImportBox18
		gunModel[339] = new ModelRendererTurbo(this, 521, 257, textureX, textureY); // Import ImportBox18
		gunModel[340] = new ModelRendererTurbo(this, 857, 257, textureX, textureY); // Import ImportBox18
		gunModel[341] = new ModelRendererTurbo(this, 137, 257, textureX, textureY); // Import ImportBox18
		gunModel[342] = new ModelRendererTurbo(this, 297, 265, textureX, textureY); // Import ImportBox18
		gunModel[343] = new ModelRendererTurbo(this, 569, 265, textureX, textureY); // Import ImportBox18
		gunModel[344] = new ModelRendererTurbo(this, 641, 265, textureX, textureY); // Import ImportBox18
		gunModel[345] = new ModelRendererTurbo(this, 705, 265, textureX, textureY); // Import ImportBox18
		gunModel[346] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Import ImportBox18
		gunModel[347] = new ModelRendererTurbo(this, 769, 281, textureX, textureY); // Import ImportBox18
		gunModel[348] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Import ImportBox18
		gunModel[349] = new ModelRendererTurbo(this, 145, 289, textureX, textureY); // Import ImportBox18
		gunModel[350] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Import ImportBox18
		gunModel[351] = new ModelRendererTurbo(this, 641, 281, textureX, textureY); // Import ImportBox18
		gunModel[352] = new ModelRendererTurbo(this, 561, 289, textureX, textureY); // Import ImportBox18
		gunModel[353] = new ModelRendererTurbo(this, 697, 297, textureX, textureY); // Import ImportBox18
		gunModel[354] = new ModelRendererTurbo(this, 953, 281, textureX, textureY); // Import ImportBox18
		gunModel[355] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Import ImportBox18
		gunModel[356] = new ModelRendererTurbo(this, 57, 297, textureX, textureY); // Import ImportBox18
		gunModel[357] = new ModelRendererTurbo(this, 609, 289, textureX, textureY); // Import ImportBox18
		gunModel[358] = new ModelRendererTurbo(this, 97, 297, textureX, textureY); // Import ImportBox18
		gunModel[359] = new ModelRendererTurbo(this, 841, 297, textureX, textureY); // Import ImportBox18
		gunModel[360] = new ModelRendererTurbo(this, 329, 305, textureX, textureY); // Import ImportBox18
		gunModel[361] = new ModelRendererTurbo(this, 889, 297, textureX, textureY); // Import ImportBox18
		gunModel[362] = new ModelRendererTurbo(this, 401, 305, textureX, textureY); // Import ImportBox18
		gunModel[363] = new ModelRendererTurbo(this, 457, 305, textureX, textureY); // Import ImportBox18
		gunModel[364] = new ModelRendererTurbo(this, 377, 305, textureX, textureY); // Import ImportBox18
		gunModel[365] = new ModelRendererTurbo(this, 489, 313, textureX, textureY); // Import ImportBox18
		gunModel[366] = new ModelRendererTurbo(this, 553, 313, textureX, textureY); // Import ImportBox18
		gunModel[367] = new ModelRendererTurbo(this, 617, 313, textureX, textureY); // Import ImportBox18
		gunModel[368] = new ModelRendererTurbo(this, 185, 273, textureX, textureY); // Import ImportBox18
		gunModel[369] = new ModelRendererTurbo(this, 617, 209, textureX, textureY); // Import ImportBox18
		gunModel[370] = new ModelRendererTurbo(this, 705, 321, textureX, textureY); // Import ImportBox18
		gunModel[371] = new ModelRendererTurbo(this, 113, 329, textureX, textureY); // Import ImportBox18
		gunModel[372] = new ModelRendererTurbo(this, 217, 329, textureX, textureY); // Import ImportBox18
		gunModel[373] = new ModelRendererTurbo(this, 297, 337, textureX, textureY); // Import ImportBox18
		gunModel[374] = new ModelRendererTurbo(this, 457, 337, textureX, textureY); // Import ImportBox18
		gunModel[375] = new ModelRendererTurbo(this, 913, 321, textureX, textureY); // Import ImportBox18
		gunModel[376] = new ModelRendererTurbo(this, 993, 273, textureX, textureY); // Import ImportBox18
		gunModel[377] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Import ImportBox18
		gunModel[378] = new ModelRendererTurbo(this, 793, 329, textureX, textureY); // Import ImportBox18
		gunModel[379] = new ModelRendererTurbo(this, 897, 257, textureX, textureY); // Import ImportBox18
		gunModel[380] = new ModelRendererTurbo(this, 193, 329, textureX, textureY); // Import ImportBox18
		gunModel[381] = new ModelRendererTurbo(this, 25, 353, textureX, textureY); // Import ImportBox18
		gunModel[382] = new ModelRendererTurbo(this, 561, 337, textureX, textureY); // Import ImportBox18
		gunModel[383] = new ModelRendererTurbo(this, 169, 353, textureX, textureY); // Import ImportBox18
		gunModel[384] = new ModelRendererTurbo(this, 929, 337, textureX, textureY); // Import ImportBox18
		gunModel[385] = new ModelRendererTurbo(this, 577, 345, textureX, textureY); // Import ImportBox18
		gunModel[386] = new ModelRendererTurbo(this, 969, 337, textureX, textureY); // Import ImportBox18
		gunModel[387] = new ModelRendererTurbo(this, 705, 345, textureX, textureY); // Import ImportBox18
		gunModel[388] = new ModelRendererTurbo(this, 833, 353, textureX, textureY); // Import ImportBox18
		gunModel[389] = new ModelRendererTurbo(this, 313, 361, textureX, textureY); // Import ImportBox18
		gunModel[390] = new ModelRendererTurbo(this, 369, 361, textureX, textureY); // Import ImportBox18
		gunModel[391] = new ModelRendererTurbo(this, 425, 361, textureX, textureY); // Import ImportBox18
		gunModel[392] = new ModelRendererTurbo(this, 745, 345, textureX, textureY); // Import ImportBox18
		gunModel[393] = new ModelRendererTurbo(this, 873, 353, textureX, textureY); // Import ImportBox18
		gunModel[394] = new ModelRendererTurbo(this, 465, 361, textureX, textureY); // Import ImportBox18
		gunModel[395] = new ModelRendererTurbo(this, 513, 361, textureX, textureY); // Import ImportBox18
		gunModel[396] = new ModelRendererTurbo(this, 681, 361, textureX, textureY); // Import ImportBox18
		gunModel[397] = new ModelRendererTurbo(this, 793, 361, textureX, textureY); // Import ImportBox18
		gunModel[398] = new ModelRendererTurbo(this, 433, 305, textureX, textureY); // Import ImportBox0
		gunModel[399] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Import ImportBox0
		gunModel[400] = new ModelRendererTurbo(this, 545, 369, textureX, textureY); // Import ImportBox0
		gunModel[401] = new ModelRendererTurbo(this, 593, 369, textureX, textureY); // Import ImportBox0
		gunModel[402] = new ModelRendererTurbo(this, 641, 369, textureX, textureY); // Import ImportBox0
		gunModel[403] = new ModelRendererTurbo(this, 825, 369, textureX, textureY); // Import ImportBox0
		gunModel[404] = new ModelRendererTurbo(this, 969, 369, textureX, textureY); // Import ImportBox18
		gunModel[405] = new ModelRendererTurbo(this, 25, 377, textureX, textureY); // Import ImportBox18
		gunModel[406] = new ModelRendererTurbo(this, 81, 377, textureX, textureY); // Import ImportBox18
		gunModel[407] = new ModelRendererTurbo(this, 145, 361, textureX, textureY); // Import ImportBox18
		gunModel[408] = new ModelRendererTurbo(this, 569, 369, textureX, textureY); // Import ImportBox18
		gunModel[409] = new ModelRendererTurbo(this, 193, 377, textureX, textureY); // Import ImportBox18
		gunModel[410] = new ModelRendererTurbo(this, 769, 265, textureX, textureY); // Import ImportBox18
		gunModel[411] = new ModelRendererTurbo(this, 273, 377, textureX, textureY); // Import ImportBox18
		gunModel[412] = new ModelRendererTurbo(this, 337, 289, textureX, textureY); // Import ImportBox18
		gunModel[413] = new ModelRendererTurbo(this, 33, 297, textureX, textureY); // Import ImportBox18
		gunModel[414] = new ModelRendererTurbo(this, 961, 225, textureX, textureY); // Import ImportBox18
		gunModel[415] = new ModelRendererTurbo(this, 321, 377, textureX, textureY); // Import ImportBox0
		gunModel[416] = new ModelRendererTurbo(this, 369, 377, textureX, textureY); // Import ImportBox0
		gunModel[417] = new ModelRendererTurbo(this, 417, 377, textureX, textureY); // Import ImportBox0
		gunModel[418] = new ModelRendererTurbo(this, 449, 385, textureX, textureY); // Import ImportBox0
		gunModel[419] = new ModelRendererTurbo(this, 497, 385, textureX, textureY); // Import ImportBox0
		gunModel[420] = new ModelRendererTurbo(this, 665, 385, textureX, textureY); // Import ImportBox0
		gunModel[421] = new ModelRendererTurbo(this, 689, 385, textureX, textureY); // Import ImportBox0
		gunModel[422] = new ModelRendererTurbo(this, 793, 385, textureX, textureY); // Import ImportBox0
		gunModel[423] = new ModelRendererTurbo(this, 193, 393, textureX, textureY); // Import ImportBox0
		gunModel[424] = new ModelRendererTurbo(this, 617, 393, textureX, textureY); // Import ImportBox0
		gunModel[425] = new ModelRendererTurbo(this, 57, 401, textureX, textureY); // Import ImportBox0
		gunModel[426] = new ModelRendererTurbo(this, 113, 401, textureX, textureY); // Import ImportBox0
		gunModel[427] = new ModelRendererTurbo(this, 225, 393, textureX, textureY); // Import ImportBox0
		gunModel[428] = new ModelRendererTurbo(this, 825, 393, textureX, textureY); // Import ImportBox0
		gunModel[429] = new ModelRendererTurbo(this, 921, 393, textureX, textureY); // Import ImportBox0
		gunModel[430] = new ModelRendererTurbo(this, 89, 401, textureX, textureY); // Import ImportBox0
		gunModel[431] = new ModelRendererTurbo(this, 297, 401, textureX, textureY); // Import ImportBox0
		gunModel[432] = new ModelRendererTurbo(this, 345, 401, textureX, textureY); // Import ImportBox0
		gunModel[433] = new ModelRendererTurbo(this, 369, 265, textureX, textureY); // Box 1
		gunModel[434] = new ModelRendererTurbo(this, 705, 441, textureX, textureY); // Box 2
		gunModel[435] = new ModelRendererTurbo(this, 233, 433, textureX, textureY); // Box 3
		gunModel[436] = new ModelRendererTurbo(this, 41, 449, textureX, textureY); // Box 4
		gunModel[437] = new ModelRendererTurbo(this, 177, 457, textureX, textureY); // Box 5
		gunModel[438] = new ModelRendererTurbo(this, 377, 457, textureX, textureY); // Box 6
		gunModel[439] = new ModelRendererTurbo(this, 617, 145, textureX, textureY); // Box 14
		gunModel[440] = new ModelRendererTurbo(this, 545, 337, textureX, textureY); // Box 16
		gunModel[441] = new ModelRendererTurbo(this, 993, 353, textureX, textureY); // Box 19
		gunModel[442] = new ModelRendererTurbo(this, 713, 361, textureX, textureY); // Box 20
		gunModel[443] = new ModelRendererTurbo(this, 617, 369, textureX, textureY); // Box 21
		gunModel[444] = new ModelRendererTurbo(this, 57, 377, textureX, textureY); // Box 22
		gunModel[445] = new ModelRendererTurbo(this, 113, 377, textureX, textureY); // Box 23
		gunModel[446] = new ModelRendererTurbo(this, 353, 377, textureX, textureY); // Box 24
		gunModel[447] = new ModelRendererTurbo(this, 401, 377, textureX, textureY); // Box 25
		gunModel[448] = new ModelRendererTurbo(this, 481, 385, textureX, textureY); // Box 26
		gunModel[449] = new ModelRendererTurbo(this, 329, 401, textureX, textureY); // Box 27
		gunModel[450] = new ModelRendererTurbo(this, 705, 409, textureX, textureY); // Box 28
		gunModel[451] = new ModelRendererTurbo(this, 793, 409, textureX, textureY); // Box 29
		gunModel[452] = new ModelRendererTurbo(this, 249, 417, textureX, textureY); // Box 30
		gunModel[453] = new ModelRendererTurbo(this, 601, 417, textureX, textureY); // Box 31
		gunModel[454] = new ModelRendererTurbo(this, 633, 417, textureX, textureY); // Box 32
		gunModel[455] = new ModelRendererTurbo(this, 817, 417, textureX, textureY); // Box 33
		gunModel[456] = new ModelRendererTurbo(this, 921, 417, textureX, textureY); // Box 34
		gunModel[457] = new ModelRendererTurbo(this, 569, 425, textureX, textureY); // Box 35
		gunModel[458] = new ModelRendererTurbo(this, 705, 425, textureX, textureY); // Box 36
		gunModel[459] = new ModelRendererTurbo(this, 785, 425, textureX, textureY); // Box 37
		gunModel[460] = new ModelRendererTurbo(this, 841, 425, textureX, textureY); // Box 38
		gunModel[461] = new ModelRendererTurbo(this, 593, 433, textureX, textureY); // Box 39
		gunModel[462] = new ModelRendererTurbo(this, 625, 433, textureX, textureY); // Box 40
		gunModel[463] = new ModelRendererTurbo(this, 905, 433, textureX, textureY); // Box 41
		gunModel[464] = new ModelRendererTurbo(this, 937, 433, textureX, textureY); // Box 42
		gunModel[465] = new ModelRendererTurbo(this, 537, 441, textureX, textureY); // Box 43
		gunModel[466] = new ModelRendererTurbo(this, 569, 441, textureX, textureY); // Box 44
		gunModel[467] = new ModelRendererTurbo(this, 1, 449, textureX, textureY); // Box 45
		gunModel[468] = new ModelRendererTurbo(this, 593, 449, textureX, textureY); // Box 46
		gunModel[469] = new ModelRendererTurbo(this, 625, 449, textureX, textureY); // Box 47
		gunModel[470] = new ModelRendererTurbo(this, 905, 449, textureX, textureY); // Box 48
		gunModel[471] = new ModelRendererTurbo(this, 937, 449, textureX, textureY); // Box 49
		gunModel[472] = new ModelRendererTurbo(this, 353, 457, textureX, textureY); // Box 50
		gunModel[473] = new ModelRendererTurbo(this, 553, 457, textureX, textureY); // Box 51
		gunModel[474] = new ModelRendererTurbo(this, 649, 457, textureX, textureY); // Box 52
		gunModel[475] = new ModelRendererTurbo(this, 961, 457, textureX, textureY); // Box 53
		gunModel[476] = new ModelRendererTurbo(this, 993, 457, textureX, textureY); // Box 54
		gunModel[477] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Box 55
		gunModel[478] = new ModelRendererTurbo(this, 577, 465, textureX, textureY); // Box 56
		gunModel[479] = new ModelRendererTurbo(this, 609, 465, textureX, textureY); // Box 57
		gunModel[480] = new ModelRendererTurbo(this, 673, 465, textureX, textureY); // Box 58

		gunModel[0].addBox(0F, 0F, 0F, 88, 5, 13, 0F); // Import ImportBox0
		gunModel[0].setRotationPoint(-14F, -42F, -6F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[1].setRotationPoint(74F, -42F, -6F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F); // Import ImportBox0
		gunModel[2].setRotationPoint(74F, -37F, -6F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, -2F); // Import ImportBox0
		gunModel[3].setRotationPoint(73F, -35F, -6F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, -2F); // Import ImportBox0
		gunModel[4].setRotationPoint(70F, -35F, -6F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 1.5F, 0F, 0F); // Import ImportBox0
		gunModel[5].setRotationPoint(69F, -35F, -6F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.5F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, -0.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 1F, 0F, 0F); // Import ImportBox0
		gunModel[6].setRotationPoint(67F, -34F, -6F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 1.5F, 0F, 0F); // Import ImportBox0
		gunModel[7].setRotationPoint(66F, -33F, -6F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 88, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[8].setRotationPoint(-14F, -37F, -6F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 82, 1, 13, 0F,0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[9].setRotationPoint(-14F, -35F, -6F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 80, 1, 13, 0F,1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox0
		gunModel[10].setRotationPoint(-13F, -34F, -6F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 80, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[11].setRotationPoint(-14F, -33F, -6F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F); // Import ImportBox0
		gunModel[12].setRotationPoint(64.5F, -31F, -6F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F); // Import ImportBox0
		gunModel[13].setRotationPoint(64.5F, -29F, -6F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 35, 10, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 9F, 0F); // Import ImportBox0
		gunModel[14].setRotationPoint(29F, -29F, -6F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 78, 2, 13, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox0
		gunModel[15].setRotationPoint(-13.5F, -31F, -6F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 35, 2, 15, 0F,0F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, 5.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 5.5F, 0F); // Import ImportBox0
		gunModel[16].setRotationPoint(29F, -16F, -7F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 35, 1, 15, 0F,0F, -6.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6.5F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Import ImportBox0
		gunModel[17].setRotationPoint(29F, -15F, -7F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox18
		gunModel[18].setRotationPoint(27F, -21F, -6F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox18
		gunModel[19].setRotationPoint(25F, -22F, -6F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 43, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[20].setRotationPoint(-14F, -29F, -6F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 19, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox18
		gunModel[21].setRotationPoint(-14F, -22F, -6F);

		gunModel[22].addBox(0F, 0F, 0F, 16, 9, 13, 0F); // Import ImportBox0
		gunModel[22].setRotationPoint(-30F, -42F, -6F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Import ImportBox18
		gunModel[23].setRotationPoint(27F, -11F, -4F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox18
		gunModel[24].setRotationPoint(25F, -9F, -4F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 25, 3, 9, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox18
		gunModel[25].setRotationPoint(0F, -9F, -4F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[26].setRotationPoint(2F, -11F, -4F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[27].setRotationPoint(3F, -9F, -4F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[28].setRotationPoint(0F, -19F, -4F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[29].setRotationPoint(-3F, -22F, -4F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[30].setRotationPoint(8F, -22F, -1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox18
		gunModel[31].setRotationPoint(9F, -21F, -1F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox18
		gunModel[32].setRotationPoint(9F, -19F, -1F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox18
		gunModel[33].setRotationPoint(9F, -17F, -1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[34].setRotationPoint(9F, -14F, -1F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,1F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox18
		gunModel[35].setRotationPoint(10F, -12F, -1F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0.75F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, -0.25F, 0F, 0F); // Import ImportBox18
		gunModel[36].setRotationPoint(11F, -10F, -1F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, -0.5F, 0F, 0F); // Import ImportBox0
		gunModel[37].setRotationPoint(64.5F, -19F, -6F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F); // Import ImportBox0
		gunModel[38].setRotationPoint(65.5F, -17F, -6F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[39].setRotationPoint(64F, -19F, -6F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[40].setRotationPoint(64F, -17F, -6F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[41].setRotationPoint(64F, -15F, -7F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 1F); // Import ImportBox0
		gunModel[42].setRotationPoint(64F, -16F, -6F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0.1F, 0.2F, 0.5F, -0.5F, -2F, 0.5F, -0.5F, -2F, 0F, 0.1F, 0.2F); // Import ImportBox0
		gunModel[43].setRotationPoint(65F, -16F, -6F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -0.5F, 0.25F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0.5F, -1F, -2F, 0.5F, -1F, -2F, 0F, 0F, 0.25F); // Import ImportBox0
		gunModel[44].setRotationPoint(65F, -15.5F, -6F);

		gunModel[45].addBox(0F, 0F, 0F, 52, 11, 17, 0F); // Import ImportBox0
		gunModel[45].setRotationPoint(-33F, -54F, -8F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 58, 3, 17, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[46].setRotationPoint(-33F, -57F, -8F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 110, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox0
		gunModel[47].setRotationPoint(-33F, -43F, -8F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 58, 2, 15, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox0
		gunModel[48].setRotationPoint(-33F, -59F, -7F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 139, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[49].setRotationPoint(80F, -43F, -7.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 139, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[50].setRotationPoint(80F, -38.5F, -3F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 139, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[51].setRotationPoint(80F, -36.5F, -4.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 139, 1, 11, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F); // Import ImportBox0
		gunModel[52].setRotationPoint(80F, -40F, -5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 139, 2, 14, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox0
		gunModel[53].setRotationPoint(80F, -42F, -6.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 139, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox0
		gunModel[54].setRotationPoint(80F, -35.5F, -4.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 61, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		gunModel[55].setRotationPoint(-33F, -67F, -4.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 14, 8, 10, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import ImportBox0
		gunModel[56].setRotationPoint(148F, -67F, -4.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 46, 7, 10, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox0
		gunModel[57].setRotationPoint(102F, -67F, -4.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 74, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox0
		gunModel[58].setRotationPoint(28F, -67F, -4.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[59].setRotationPoint(28F, -64.5F, -4.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[60].setRotationPoint(28F, -60.5F, -4.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 195, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import ImportBox0
		gunModel[61].setRotationPoint(-33F, -59.5F, -4.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 66, 1, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[62].setRotationPoint(31F, -60.5F, -4.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 75, 5, 7, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import ImportBox0
		gunModel[63].setRotationPoint(27.75F, -64.5F, -3F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[64].setRotationPoint(101F, -60.5F, -4.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F); // Import ImportBox0
		gunModel[65].setRotationPoint(101F, -64.5F, -4.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 66, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[66].setRotationPoint(31F, -64.5F, -4.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 251, 3, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		gunModel[67].setRotationPoint(-33F, -69.5F, -3.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 251, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportBox0
		gunModel[68].setRotationPoint(-33F, -70F, -5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,-0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox0
		gunModel[69].setRotationPoint(-33F, -72F, -5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 251, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		gunModel[70].setRotationPoint(-33F, -67.5F, 4.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 251, 1, 1, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		gunModel[71].setRotationPoint(-33F, -67.5F, -4.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 74, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[72].setRotationPoint(203F, -51F, -3F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F,0F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[73].setRotationPoint(277F, -51F, -3F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F); // Import ImportBox0
		gunModel[74].setRotationPoint(279F, -51F, -3F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 1.5F, 1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1.5F, 1.5F); // Import ImportBox0
		gunModel[75].setRotationPoint(282F, -51F, -3F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 9, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[76].setRotationPoint(283F, -52F, -4F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 17, 6, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox0
		gunModel[77].setRotationPoint(292F, -49F, -4F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 17, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox0
		gunModel[78].setRotationPoint(292F, -52F, -4F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 17, 6, 4, 0F,0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[79].setRotationPoint(292F, -49F, 1F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[80].setRotationPoint(153F, -65F, -5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[81].setRotationPoint(153F, -63F, -5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[82].setRotationPoint(153F, -64F, -5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 17, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[83].setRotationPoint(218F, -57F, -8F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox0
		gunModel[84].setRotationPoint(218F, -59F, -7F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import ImportBox0
		gunModel[85].setRotationPoint(218F, -59.5F, -4.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		gunModel[86].setRotationPoint(218F, -67F, -4.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		gunModel[87].setRotationPoint(218F, -69.5F, -3.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportBox0
		gunModel[88].setRotationPoint(218F, -70F, -5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox0
		gunModel[89].setRotationPoint(218F, -71F, -5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		gunModel[90].setRotationPoint(218F, -67.5F, 4.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		gunModel[91].setRotationPoint(218F, -67.5F, -4.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F); // Import ImportBox0
		gunModel[92].setRotationPoint(215.5F, -65F, 7.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import ImportBox0
		gunModel[93].setRotationPoint(215.5F, -62F, 6F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Import ImportBox0
		gunModel[94].setRotationPoint(215.5F, -62F, 4.25F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,-0.5F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import ImportBox0
		gunModel[95].setRotationPoint(215.5F, -60.5F, -6.5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Import ImportBox0
		gunModel[96].setRotationPoint(215.5F, -62F, -8F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F); // Import ImportBox0
		gunModel[97].setRotationPoint(215.5F, -65F, -8.5F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import ImportBox0
		gunModel[98].setRotationPoint(215.5F, -65.25F, -8.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F); // Import ImportBox0
		gunModel[99].setRotationPoint(215.5F, -66.5F, -7F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import ImportBox0
		gunModel[100].setRotationPoint(215.5F, -62F, -6.25F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox0
		gunModel[101].setRotationPoint(215.5F, -65.25F, -5.5F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 2, 6, 16, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[102].setRotationPoint(0F, -36F, -7.5F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 2, 6, 16, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox18
		gunModel[103].setRotationPoint(-4F, -36F, -7.5F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 2, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[104].setRotationPoint(-2F, -36F, -7.5F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,-0.99F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[105].setRotationPoint(-2F, -37F, -7.5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[106].setRotationPoint(-2F, -30F, -7.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[107].setRotationPoint(7.5F, -27.5F, -6.5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[108].setRotationPoint(7.5F, -25.5F, -6.5F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[109].setRotationPoint(7.5F, -26.5F, -6.5F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[110].setRotationPoint(18F, -34.5F, -4.5F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[111].setRotationPoint(18F, -32.5F, -4.5F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[112].setRotationPoint(18F, -33.5F, -4.5F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[113].setRotationPoint(-8.5F, -40F, -6.5F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[114].setRotationPoint(-8.5F, -38F, -6.5F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[115].setRotationPoint(-8.5F, -39F, -6.5F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, -0.75F, 0F, -2F, -0.75F, 0F, -2F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox18
		gunModel[116].setRotationPoint(-14F, -22F, -6F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import ImportBox18
		gunModel[117].setRotationPoint(-14F, -22.5F, -4F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 1, 15, 13, 0F,0F, -0.5F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F); // Import ImportBox18
		gunModel[118].setRotationPoint(-1F, -21F, -6F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 13, 15, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[119].setRotationPoint(-14F, -20.5F, -6F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 3, 5, 13, 0F,0F, 0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox18
		gunModel[120].setRotationPoint(-17F, -21F, -6F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0.25F, -3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import ImportBox18
		gunModel[121].setRotationPoint(-18F, -21F, -4F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 3, 35, 13, 0F,0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 24F, 0F, -2F, -24F, 0F, 0F, -24F, 0F, 0F, 24F, 0F, -2F); // Import ImportBox18
		gunModel[122].setRotationPoint(-17F, -15.5F, -6F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 1, 35, 9, 0F,0F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 24F, 0F, -3F, -24F, 0F, 0F, -24F, 0F, 0F, 24F, 0F, -3F); // Import ImportBox18
		gunModel[123].setRotationPoint(-18F, -15.5F, -4F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 7, 10, 13, 0F,-7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -7F, 0.5F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F); // Import ImportBox18
		gunModel[124].setRotationPoint(-21F, -15.5F, -6F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 3, 24, 13, 0F,-2F, 0F, 0F, 3F, 0F, -2F, 3F, 0F, -2F, -2F, 0F, 0F, 11F, 0F, 0F, -10F, 0F, -2F, -10F, 0F, -2F, 11F, 0F, 0F); // Import ImportBox18
		gunModel[125].setRotationPoint(-7.5F, -5.5F, -6F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 3, 24, 13, 0F,-2.4F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, -2.4F, 0F, 0F, 13.85F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 13.85F, 0F, 0F); // Import ImportBox18
		gunModel[126].setRotationPoint(-23.5F, -5.5F, -6F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[127].setRotationPoint(-18.5F, 18.5F, -6F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F); // Import ImportBox18
		gunModel[128].setRotationPoint(-18.5F, 19.5F, -6F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[129].setRotationPoint(-16.5F, 21.5F, -6F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F); // Import ImportBox18
		gunModel[130].setRotationPoint(-16.5F, 23.5F, -6F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 21, 2, 13, 0F,-1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, -4.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4.5F, 0F); // Import ImportBox18
		gunModel[131].setRotationPoint(-37.5F, 23.5F, -6F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 20, 2, 13, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Import ImportBox18
		gunModel[132].setRotationPoint(-36.5F, 21.5F, -6F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 20, 2, 13, 0F,0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import ImportBox18
		gunModel[133].setRotationPoint(-36.5F, 19.5F, -6F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 18, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox18
		gunModel[134].setRotationPoint(-36.5F, 18.5F, -6F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F); // Import ImportBox18
		gunModel[135].setRotationPoint(-38.5F, 19.5F, -6F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, -2F); // Import ImportBox18
		gunModel[136].setRotationPoint(-41F, 19.5F, -6F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -3F); // Import ImportBox18
		gunModel[137].setRotationPoint(-42F, 19.5F, -4F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox18
		gunModel[138].setRotationPoint(-37.5F, 18.5F, -6F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[139].setRotationPoint(-8.5F, 1F, -4F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 6, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[140].setRotationPoint(-8.5F, 3F, -4F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[141].setRotationPoint(-8.5F, 5F, -4F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[142].setRotationPoint(-8.5F, 6F, -4F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[143].setRotationPoint(-5.5F, 0F, -4F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 11, 4, 14, 0F,-5F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[144].setRotationPoint(-18F, -11.5F, -6.5F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 11, 21, 14, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 14F, 0F, 0F); // Import ImportBox18
		gunModel[145].setRotationPoint(-18F, -7.5F, -6.5F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 16, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, -2F, 0F); // Import ImportBox18
		gunModel[146].setRotationPoint(-32F, 13.5F, -6.5F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F); // Import ImportBox18
		gunModel[147].setRotationPoint(-17F, -22.5F, -4F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, -1F, -2F, -0.25F, 0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, -2F); // Import ImportBox18
		gunModel[148].setRotationPoint(-18F, -22.5F, -2F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 3, 3, 17, 0F,0.5F, 0F, -4F, -1.5F, 0F, -2F, -1.5F, 0F, -2F, 0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -4F); // Import ImportBox18
		gunModel[149].setRotationPoint(-17F, -24.5F, -8F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -3F, -0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -3F); // Import ImportBox18
		gunModel[150].setRotationPoint(-18F, -24.5F, -4F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -3F, -0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -3F); // Import ImportBox18
		gunModel[151].setRotationPoint(-19F, -26.5F, -4F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 3, 2, 17, 0F,1F, 0F, -4F, -2F, 0F, -2F, -2F, 0F, -2F, 1F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -4F); // Import ImportBox18
		gunModel[152].setRotationPoint(-18F, -26.5F, -8F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -3F, -0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -3F); // Import ImportBox18
		gunModel[153].setRotationPoint(-20.5F, -27.5F, -4F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,2F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, -0.5F, 0F, 0F); // Import ImportBox18
		gunModel[154].setRotationPoint(-19.5F, -27.5F, -4F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 11, 2, 13, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox18
		gunModel[155].setRotationPoint(-32.5F, -30.5F, -6F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 10, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportBox18
		gunModel[156].setRotationPoint(-32.5F, -28.5F, -4F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 19, 3, 13, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[157].setRotationPoint(-32.5F, -33.5F, -6F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F); // Import ImportBox18
		gunModel[158].setRotationPoint(-23F, -28.5F, -4F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[159].setRotationPoint(-21.5F, -28.5F, -4F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[160].setRotationPoint(-21.5F, -30.5F, -4F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 5, 3, 13, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[161].setRotationPoint(-19.5F, -30.5F, -6F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F); // Import ImportBox18
		gunModel[162].setRotationPoint(-19.5F, -27.5F, -6F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox18
		gunModel[163].setRotationPoint(-17.5F, -26.5F, -6F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 3, 3, 13, 0F,-2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F); // Import ImportBox18
		gunModel[164].setRotationPoint(-17.5F, -24.5F, -6F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox18
		gunModel[165].setRotationPoint(-21.5F, -30.5F, -6F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 51, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[166].setRotationPoint(162F, -53F, 9.5F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		gunModel[167].setRotationPoint(161F, -53F, 9.5F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[168].setRotationPoint(213F, -53F, 9.5F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 3, 1, 23, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[169].setRotationPoint(207F, -49.5F, -11F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[170].setRotationPoint(207F, -47.5F, -11F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 3, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[171].setRotationPoint(207F, -48.5F, -11F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 23, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[172].setRotationPoint(165F, -49.5F, -11F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[173].setRotationPoint(165F, -47.5F, -11F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 3, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[174].setRotationPoint(165F, -48.5F, -11F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 45, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[175].setRotationPoint(165F, -51F, 8.5F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 45, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[176].setRotationPoint(165F, -51F, -8.5F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 51, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[177].setRotationPoint(162F, -53F, -10.5F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		gunModel[178].setRotationPoint(161F, -53F, -10.5F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[179].setRotationPoint(213F, -53F, -10.5F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 20, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[180].setRotationPoint(69F, -51.5F, 8.5F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox0
		gunModel[181].setRotationPoint(66F, -51.5F, 8.5F);

		gunModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[182].setRotationPoint(65F, -49.5F, 8.5F);

		gunModel[183].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox0
		gunModel[183].setRotationPoint(89F, -50.5F, 8.5F);

		gunModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox0
		gunModel[184].setRotationPoint(91F, -49.5F, 8.5F);

		gunModel[185].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[185].setRotationPoint(92F, -49.5F, 8.5F);

		gunModel[186].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F); // Import ImportBox0
		gunModel[186].setRotationPoint(92F, -48.5F, 8.5F);

		gunModel[187].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, 0F); // Import ImportBox0
		gunModel[187].setRotationPoint(91F, -47.5F, 8.5F);

		gunModel[188].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[188].setRotationPoint(89F, -52.5F, -9.5F);

		gunModel[189].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[189].setRotationPoint(92F, -50.5F, 8.5F);

		gunModel[190].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[190].setRotationPoint(91F, -51.5F, 8.5F);

		gunModel[191].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox0
		gunModel[191].setRotationPoint(89F, -46.5F, 8.5F);

		gunModel[192].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[192].setRotationPoint(69F, -52.5F, 8.5F);

		gunModel[193].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox0
		gunModel[193].setRotationPoint(69F, -46.5F, 8.5F);

		gunModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox0
		gunModel[194].setRotationPoint(66F, -52.5F, 8.5F);

		gunModel[195].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F); // Import ImportBox0
		gunModel[195].setRotationPoint(66F, -46.5F, 8.5F);

		gunModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[196].setRotationPoint(65F, -51.5F, 8.5F);

		gunModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox0
		gunModel[197].setRotationPoint(65F, -48.5F, 8.5F);

		gunModel[198].addShapeBox(0F, 0F, 0F, 3, 1, 21, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[198].setRotationPoint(70F, -50.5F, -10F);

		gunModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[199].setRotationPoint(70F, -48.5F, -10F);

		gunModel[200].addShapeBox(0F, 0F, 0F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[200].setRotationPoint(70F, -49.5F, -10F);

		gunModel[201].addShapeBox(0F, 0F, 0F, 20, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[201].setRotationPoint(69F, -51.5F, -9.5F);

		gunModel[202].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[202].setRotationPoint(66F, -51.5F, -9.5F);

		gunModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[203].setRotationPoint(65F, -49.5F, -8.5F);

		gunModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[204].setRotationPoint(65F, -51.5F, -8.5F);

		gunModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox0
		gunModel[205].setRotationPoint(65F, -48.5F, -8.5F);

		gunModel[206].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[206].setRotationPoint(66F, -52.5F, -9.5F);

		gunModel[207].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[207].setRotationPoint(69F, -52.5F, -9.5F);

		gunModel[208].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox0
		gunModel[208].setRotationPoint(89F, -50.5F, -9.5F);

		gunModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox0
		gunModel[209].setRotationPoint(91F, -49.5F, -9.5F);

		gunModel[210].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[210].setRotationPoint(89F, -52.5F, 8.5F);

		gunModel[211].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[211].setRotationPoint(91F, -51.5F, -9.5F);

		gunModel[212].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[212].setRotationPoint(92F, -50.5F, -9.5F);

		gunModel[213].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[213].setRotationPoint(92F, -49.5F, -9.5F);

		gunModel[214].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox0
		gunModel[214].setRotationPoint(92F, -48.5F, -9.5F);

		gunModel[215].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 2F, 0F, 0F); // Import ImportBox0
		gunModel[215].setRotationPoint(91F, -47.5F, -9.5F);

		gunModel[216].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[216].setRotationPoint(89F, -46.5F, -9.5F);

		gunModel[217].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[217].setRotationPoint(69F, -46.5F, -9.5F);

		gunModel[218].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox0
		gunModel[218].setRotationPoint(66F, -46.5F, -9.5F);

		gunModel[219].addShapeBox(0F, 0F, 0F, 2, 10, 18, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[219].setRotationPoint(-32.5F, -43F, -8.5F);

		gunModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,-2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[220].setRotationPoint(-32.5F, -34F, -6F);

		gunModel[221].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox18
		gunModel[221].setRotationPoint(-34.5F, -68.5F, -6.25F);

		gunModel[222].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,-0.75F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.75F, 0F, 1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportBox18
		gunModel[222].setRotationPoint(-42.5F, -69.5F, -5.5F);

		gunModel[223].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Import ImportBox18
		gunModel[223].setRotationPoint(-39.5F, -71.5F, -5.5F);

		gunModel[224].addShapeBox(0F, 0F, 0F, 7, 1, 14, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F); // Import ImportBox18
		gunModel[224].setRotationPoint(-39.5F, -70.5F, -6.5F);

		gunModel[225].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[225].setRotationPoint(-34.5F, -66F, 9.5F);

		gunModel[226].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[226].setRotationPoint(-34.5F, -65F, 10.5F);

		gunModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox18
		gunModel[227].setRotationPoint(-34.5F, -60F, 9.5F);

		gunModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[228].setRotationPoint(-34.5F, -52F, 9.5F);

		gunModel[229].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[229].setRotationPoint(-34.5F, -51F, 10.5F);

		gunModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox18
		gunModel[230].setRotationPoint(-34.5F, -46F, 9.5F);

		gunModel[231].addShapeBox(0F, 0F, 0F, 12, 5, 15, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox18
		gunModel[231].setRotationPoint(-44.5F, -32.5F, -7F);

		gunModel[232].addShapeBox(0F, 0F, 0F, 11, 18, 18, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Import ImportBox18
		gunModel[232].setRotationPoint(-43.5F, -50F, -8.5F);

		gunModel[233].addShapeBox(0F, 0F, 0F, 5, 17, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[233].setRotationPoint(-37.5F, -67F, -8.5F);

		gunModel[234].addShapeBox(0F, 0F, 0F, 2, 15, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import ImportBox18
		gunModel[234].setRotationPoint(-39.5F, -67F, -8.5F);

		gunModel[235].addShapeBox(0F, 0F, 0F, 4, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox18
		gunModel[235].setRotationPoint(-43.5F, -52F, -8.5F);

		gunModel[236].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[236].setRotationPoint(-39.5F, -52F, -8.5F);

		gunModel[237].addShapeBox(0F, 0F, 0F, 4, 8, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[237].setRotationPoint(-43.5F, -60F, -8.5F);

		gunModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[238].setRotationPoint(-37.4F, -68.5F, -6.5F);

		gunModel[239].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Import ImportBox18
		gunModel[239].setRotationPoint(-43.5F, -50F, 9.5F);

		gunModel[240].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 1F, -2.5F, 0F); // Import ImportBox18
		gunModel[240].setRotationPoint(-43.5F, -50F, 10.5F);

		gunModel[241].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[241].setRotationPoint(-42.5F, -47F, 9F);

		gunModel[242].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[242].setRotationPoint(-43F, -41F, 9F);

		gunModel[243].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,-1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[243].setRotationPoint(8F, -52.5F, -8.75F);

		gunModel[244].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[244].setRotationPoint(8F, -50.5F, -8.75F);

		gunModel[245].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[245].setRotationPoint(8F, -51.5F, -8.75F);

		gunModel[246].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[246].setRotationPoint(-20F, -52.5F, 8.25F);

		gunModel[247].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[247].setRotationPoint(-20F, -50.5F, 8.25F);

		gunModel[248].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[248].setRotationPoint(-20F, -51.5F, 8.25F);

		gunModel[249].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[249].setRotationPoint(41F, -52.5F, 8.25F);

		gunModel[250].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[250].setRotationPoint(41F, -50.5F, 8.25F);

		gunModel[251].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[251].setRotationPoint(41F, -51.5F, 8.25F);

		gunModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Import ImportBox0
		gunModel[252].setRotationPoint(70.75F, -38.5F, -6.5F);

		gunModel[253].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,-1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox0
		gunModel[253].setRotationPoint(70F, -39.25F, -6.5F);

		gunModel[254].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[254].setRotationPoint(25F, -25.5F, 6F);

		gunModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[255].setRotationPoint(29F, -25.5F, 6F);

		gunModel[256].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[256].setRotationPoint(31F, -27.5F, 6F);

		gunModel[257].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[257].setRotationPoint(31F, -35.5F, 6F);

		gunModel[258].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[258].setRotationPoint(25F, -35.5F, 6F);

		gunModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[259].setRotationPoint(29F, -35.5F, 6F);

		gunModel[260].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox18
		gunModel[260].setRotationPoint(32F, -31.5F, 6.5F);

		gunModel[261].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[261].setRotationPoint(42F, -31.5F, 6.5F);

		gunModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[262].setRotationPoint(43.5F, -31F, 6.5F);

		gunModel[263].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[263].setRotationPoint(26F, -34.5F, 6.25F);

		gunModel[264].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[264].setRotationPoint(29F, -34.5F, 6.25F);

		gunModel[265].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import ImportBox18
		gunModel[265].setRotationPoint(23F, -34.5F, 6.25F);

		gunModel[266].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Import ImportBox18
		gunModel[266].setRotationPoint(33F, -40F, 6.5F);

		gunModel[267].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[267].setRotationPoint(24.5F, -42F, 6F);

		gunModel[268].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[268].setRotationPoint(25.5F, -42F, 6.5F);

		gunModel[269].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox18
		gunModel[269].setRotationPoint(25.5F, -38F, 6.5F);

		gunModel[270].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox18
		gunModel[270].setRotationPoint(26F, -36.5F, 6.5F);

		gunModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[271].setRotationPoint(27F, -38F, 8.25F);

		gunModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox18
		gunModel[272].setRotationPoint(27F, -41F, 8.25F);

		gunModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox18
		gunModel[273].setRotationPoint(27F, -39F, 8.25F);

		gunModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[274].setRotationPoint(27F, -43F, 8.25F);

		gunModel[275].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportBox18
		gunModel[275].setRotationPoint(26.5F, -44F, 8.5F);

		gunModel[276].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[276].setRotationPoint(26.5F, -46F, 8.5F);

		gunModel[277].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[277].setRotationPoint(25.5F, -49F, 8.5F);

		gunModel[278].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox18
		gunModel[278].setRotationPoint(26.5F, -50F, 8.5F);

		gunModel[279].addBox(0F, 0F, 0F, 74, 11, 17, 0F); // Import ImportBox0
		gunModel[279].setRotationPoint(65F, -54F, -8F);

		gunModel[280].addBox(0F, 0F, 0F, 46, 11, 9, 0F); // Import ImportBox0
		gunModel[280].setRotationPoint(19F, -54F, 0F);

		gunModel[281].addBox(0F, 0F, 0F, 46, 3, 8, 0F); // Import ImportBox0
		gunModel[281].setRotationPoint(19F, -46F, -8F);

		gunModel[282].addBox(0F, 0F, 0F, 46, 2, 8, 0F); // Import ImportBox0
		gunModel[282].setRotationPoint(19F, -54F, -8F);

		gunModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[283].setRotationPoint(19F, -52F, -8F);

		gunModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[284].setRotationPoint(19F, -47F, -8F);

		gunModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[285].setRotationPoint(63F, -47F, -8F);

		gunModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F); // Import ImportBox0
		gunModel[286].setRotationPoint(63F, -52F, -8F);

		gunModel[287].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[287].setRotationPoint(64F, -52F, -8F);

		gunModel[288].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[288].setRotationPoint(29.5F, -26.5F, -8.5F);

		gunModel[289].addShapeBox(0F, 0F, 0F, 2, 12, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[289].setRotationPoint(32.5F, -36.5F, -8.5F);

		gunModel[290].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[290].setRotationPoint(29.5F, -36.5F, -8.5F);

		gunModel[291].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[291].setRotationPoint(24.5F, -36.5F, -7F);

		gunModel[292].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[292].setRotationPoint(18.5F, -36.5F, -7F);

		gunModel[293].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[293].setRotationPoint(18.5F, -34.5F, -7F);

		gunModel[294].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox0
		gunModel[294].setRotationPoint(18.5F, -31.5F, -7F);

		gunModel[295].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[295].setRotationPoint(25.5F, -31.5F, -7.5F);

		gunModel[296].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[296].setRotationPoint(25.5F, -33.5F, -7.5F);

		gunModel[297].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox0
		gunModel[297].setRotationPoint(25.5F, -29.5F, -7.5F);

		gunModel[298].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[298].setRotationPoint(20F, -34.5F, -7.5F);

		gunModel[299].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[299].setRotationPoint(20F, -32.5F, -7.5F);

		gunModel[300].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[300].setRotationPoint(20F, -33.5F, -7.5F);

		gunModel[301].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[301].setRotationPoint(-25F, -51F, -8.5F);

		gunModel[302].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[302].setRotationPoint(-25F, -49F, -8.5F);

		gunModel[303].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[303].setRotationPoint(-25F, -50F, -8.5F);

		gunModel[304].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[304].setRotationPoint(-30.5F, -51F, -8.5F);

		gunModel[305].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[305].setRotationPoint(-30.5F, -49F, -8.5F);

		gunModel[306].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[306].setRotationPoint(-30.5F, -50F, -8.5F);

		gunModel[307].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[307].setRotationPoint(14F, -51F, -8.5F);

		gunModel[308].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[308].setRotationPoint(14F, -49F, -8.5F);

		gunModel[309].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[309].setRotationPoint(14F, -50F, -8.5F);

		gunModel[310].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[310].setRotationPoint(17F, -51F, -10F);

		gunModel[311].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[311].setRotationPoint(17F, -53F, -10F);

		gunModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[312].setRotationPoint(17F, -54F, -9F);

		gunModel[313].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[313].setRotationPoint(17F, -47F, -9F);

		gunModel[314].addShapeBox(0F, 0F, 0F, 3, 1, 21, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[314].setRotationPoint(87F, -50.5F, -10F);

		gunModel[315].addShapeBox(0F, 0F, 0F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[315].setRotationPoint(87F, -48.5F, -10F);

		gunModel[316].addShapeBox(0F, 0F, 0F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[316].setRotationPoint(87F, -49.5F, -10F);

		gunModel[317].addShapeBox(0F, 0F, 0F, 18, 3, 17, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[317].setRotationPoint(200F, -57F, -8F);

		gunModel[318].addShapeBox(0F, 0F, 0F, 18, 2, 15, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox0
		gunModel[318].setRotationPoint(200F, -59F, -7F);

		gunModel[319].addShapeBox(0F, 0F, 0F, 18, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		gunModel[319].setRotationPoint(200F, -67F, -4.5F);

		gunModel[320].addShapeBox(0F, 0F, 0F, 18, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import ImportBox0
		gunModel[320].setRotationPoint(200F, -59.5F, -4.5F);

		gunModel[321].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0F, 0F, -0.85F, 0.5F, -1.95F, 0F, 0.5F, -1.95F, 0F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[321].setRotationPoint(162F, -56F, -8F);

		gunModel[322].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0.5F, -1.95F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0.5F, -1.95F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox0
		gunModel[322].setRotationPoint(199F, -56F, -8F);

		gunModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.99F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.99F, -0.5F, 0F); // Import ImportBox0
		gunModel[323].setRotationPoint(199F, -67F, -4.5F);

		gunModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.99F, -0.5F, 0F, -0.99F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		gunModel[324].setRotationPoint(162F, -67F, -4.5F);

		gunModel[325].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[325].setRotationPoint(160F, -63F, -4F);

		gunModel[326].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[326].setRotationPoint(160F, -60F, -4F);

		gunModel[327].addShapeBox(0F, 0F, 0F, 13, 2, 9, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Import ImportBox0
		gunModel[327].setRotationPoint(160F, -56F, -4F);

		gunModel[328].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[328].setRotationPoint(166F, -59.5F, -5F);

		gunModel[329].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[329].setRotationPoint(166F, -57.5F, -5F);

		gunModel[330].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[330].setRotationPoint(166F, -58.5F, -5F);

		gunModel[331].addShapeBox(0F, 0F, 0F, 13, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox0
		gunModel[331].setRotationPoint(160F, -57F, -4F);

		gunModel[332].addShapeBox(0F, 0F, 0F, 3, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[332].setRotationPoint(-42.75F, -68.5F, -5.5F);

		gunModel[333].addShapeBox(0F, 0F, 0F, 31, 4, 15, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox18
		gunModel[333].setRotationPoint(-75.5F, -32.5F, -7F);

		gunModel[334].addShapeBox(0F, 0F, 0F, 16, 4, 15, 0F,0F, -14F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -14F, 1.5F, 0F, 14F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 14F, -2F); // Import ImportBox18
		gunModel[334].setRotationPoint(-91.5F, -32.5F, -7F);

		gunModel[335].addShapeBox(0F, 0F, 0F, 15, 22, 17, 0F,-8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -8F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox18
		gunModel[335].setRotationPoint(-58.5F, -57.5F, -8F);

		gunModel[336].addShapeBox(0F, 0F, 0F, 16, 3, 17, 0F,-2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox18
		gunModel[336].setRotationPoint(-60.5F, -35.5F, -8F);

		gunModel[337].addShapeBox(0F, 0F, 0F, 7, 3, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox18
		gunModel[337].setRotationPoint(-50.5F, -60.5F, -8F);

		gunModel[338].addShapeBox(0F, 0F, 0F, 8, 3, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Import ImportBox18
		gunModel[338].setRotationPoint(-51.5F, -63.5F, -8F);

		gunModel[339].addShapeBox(0F, 0F, 0F, 13, 2, 17, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox18
		gunModel[339].setRotationPoint(-56.5F, -67.5F, -8F);

		gunModel[340].addShapeBox(0F, 0F, 0F, 13, 2, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox18
		gunModel[340].setRotationPoint(-56.5F, -65.5F, -8F);

		gunModel[341].addShapeBox(0F, 0F, 0F, 13, 1, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[341].setRotationPoint(-56.5F, -68.5F, -7F);

		gunModel[342].addShapeBox(0F, 0F, 0F, 26, 2, 17, 0F,0F, -22F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -22F, 0.5F, 0F, 22F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 22F, 0.5F); // Import ImportBox18
		gunModel[342].setRotationPoint(-82.5F, -65.5F, -8F);

		gunModel[343].addShapeBox(0F, 0F, 0F, 26, 2, 17, 0F,0F, -22F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -22F, -1F, 0F, 22F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 22F, 0.5F); // Import ImportBox18
		gunModel[343].setRotationPoint(-82.5F, -67.5F, -8F);

		gunModel[344].addShapeBox(0F, 0F, 0F, 26, 1, 13, 0F,0F, -22F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -22F, -1F, 0F, 22F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 22F, 1F); // Import ImportBox18
		gunModel[344].setRotationPoint(-82.5F, -68.5F, -6F);

		gunModel[345].addShapeBox(0F, 0F, 0F, 22, 2, 15, 0F,0F, -19F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -19F, 0.5F, 0F, 19F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 19F, 0.5F); // Import ImportBox18
		gunModel[345].setRotationPoint(-82.5F, -67.5F, -7F);

		gunModel[346].addShapeBox(0F, 0F, 0F, 87, 2, 15, 0F,-0.5F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox18
		gunModel[346].setRotationPoint(-145.5F, -69.5F, -7F);

		gunModel[347].addShapeBox(0F, 0F, 0F, 87, 2, 13, 0F,-1.5F, 0F, -2.5F, 6F, 0F, -2.5F, 6F, 0F, -2.5F, -1.5F, 0F, -2.5F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox18
		gunModel[347].setRotationPoint(-145.5F, -71.5F, -6F);

		gunModel[348].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, -2F, 0.5F, 0.5F, -2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import ImportBox18
		gunModel[348].setRotationPoint(-60.5F, -67.5F, -7F);

		gunModel[349].addShapeBox(0F, 0F, 0F, 85, 19, 15, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -22F, 0F, 0.5F, -22F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox18
		gunModel[349].setRotationPoint(-145.5F, -67.5F, -7F);

		gunModel[350].addShapeBox(0F, 0F, 0F, 10, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 8F, 0F); // Import ImportBox18
		gunModel[350].setRotationPoint(-92.5F, -43.5F, -8.5F);

		gunModel[351].addShapeBox(0F, 0F, 0F, 18, 2, 17, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox18
		gunModel[351].setRotationPoint(-100.5F, -45.5F, -8F);

		gunModel[352].addShapeBox(0F, 0F, 0F, 18, 1, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[352].setRotationPoint(-100.5F, -46.5F, -7F);

		gunModel[353].addShapeBox(0F, 0F, 0F, 63, 2, 15, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox18
		gunModel[353].setRotationPoint(-145.5F, -48.5F, -7F);

		gunModel[354].addShapeBox(0F, 0F, 0F, 8, 32, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[354].setRotationPoint(-100.5F, -43.5F, -8.5F);

		gunModel[355].addShapeBox(0F, 0F, 0F, 6, 8, 18, 0F,0F, 1F, 0F, -0.4F, -4F, 0F, -0.4F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[355].setRotationPoint(-92.5F, -26.5F, -8.5F);

		gunModel[356].addShapeBox(0F, 0F, 0F, 6, 32, 20, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[356].setRotationPoint(-106.5F, -43.5F, -9.5F);

		gunModel[357].addShapeBox(0F, 0F, 0F, 6, 2, 19, 0F,0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 4F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 4F, 0.5F); // Import ImportBox18
		gunModel[357].setRotationPoint(-106.5F, -45.5F, -9F);

		gunModel[358].addShapeBox(0F, 0F, 0F, 6, 1, 17, 0F,0F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import ImportBox18
		gunModel[358].setRotationPoint(-106.5F, -46.5F, -8F);

		gunModel[359].addShapeBox(0F, 0F, 0F, 13, 28, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[359].setRotationPoint(-119.5F, -39.5F, -9.5F);

		gunModel[360].addShapeBox(0F, 0F, 0F, 13, 2, 19, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox18
		gunModel[360].setRotationPoint(-119.5F, -41.5F, -9F);

		gunModel[361].addShapeBox(0F, 0F, 0F, 13, 1, 17, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[361].setRotationPoint(-119.5F, -42.5F, -8F);

		gunModel[362].addShapeBox(0F, 0F, 0F, 4, 32, 20, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[362].setRotationPoint(-123.5F, -43.5F, -9.5F);

		gunModel[363].addShapeBox(0F, 0F, 0F, 4, 2, 19, 0F,0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 4F, 0.5F, 0F, 4F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox18
		gunModel[363].setRotationPoint(-123.5F, -45.5F, -9F);

		gunModel[364].addShapeBox(0F, 0F, 0F, 4, 1, 17, 0F,0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[364].setRotationPoint(-123.5F, -46.5F, -8F);

		gunModel[365].addShapeBox(0F, 0F, 0F, 22, 2, 17, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox18
		gunModel[365].setRotationPoint(-145.5F, -45.5F, -8F);

		gunModel[366].addShapeBox(0F, 0F, 0F, 22, 1, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[366].setRotationPoint(-145.5F, -46.5F, -7F);

		gunModel[367].addShapeBox(0F, 0F, 0F, 22, 32, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[367].setRotationPoint(-145.5F, -43.5F, -8.5F);

		gunModel[368].addShapeBox(0F, 0F, 0F, 23, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[368].setRotationPoint(-123.5F, -46.5F, -4.5F);

		gunModel[369].addShapeBox(0F, 0F, 0F, 2, 4, 18, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3.5F, -1F, 0F, -3.5F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[369].setRotationPoint(-92.5F, -18.5F, -8.5F);

		gunModel[370].addShapeBox(0F, 0F, 0F, 33, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[370].setRotationPoint(-88.5F, -42.5F, -7F);

		gunModel[371].addShapeBox(0F, 0F, 0F, 33, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[371].setRotationPoint(-88.5F, -39.5F, -7F);

		gunModel[372].addShapeBox(0F, 0F, 0F, 33, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[372].setRotationPoint(-88.5F, -41.5F, -6F);

		gunModel[373].addShapeBox(0F, 0F, 0F, 33, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox18
		gunModel[373].setRotationPoint(-88.5F, -38.5F, -7F);

		gunModel[374].addShapeBox(0F, 0F, 0F, 33, 1, 15, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[374].setRotationPoint(-88.5F, -43.5F, -7F);

		gunModel[375].addShapeBox(0F, 0F, 0F, 1, 9, 15, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F); // Import ImportBox18
		gunModel[375].setRotationPoint(-78.5F, -38.5F, -7F);

		gunModel[376].addShapeBox(0F, 0F, 0F, 2, 9, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0.5F, 0F, 1.1F, 0.5F, 0F, 1.1F, 0.5F, 0F, -1.1F, 0.5F, 0F); // Import ImportBox18
		gunModel[376].setRotationPoint(-80.5F, -38.5F, -6F);

		gunModel[377].addShapeBox(0F, 0F, 0F, 1, 10, 15, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.2F, 0.15F, -1F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -1.2F, 0.25F, -1F); // Import ImportBox18
		gunModel[377].setRotationPoint(-81.5F, -38.5F, -7F);

		gunModel[378].addShapeBox(0F, 0F, 0F, 13, 19, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[378].setRotationPoint(-92.5F, -37.5F, -4F);

		gunModel[379].addShapeBox(0F, 0F, 0F, 5, 2, 21, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox18
		gunModel[379].setRotationPoint(-139.5F, -10.5F, -10F);

		gunModel[380].addShapeBox(0F, 0F, 0F, 2, 3, 18, 0F,0F, 0F, 0F, -1F, 0F, -3.5F, -1F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3.5F, -1F, 0F, -3.5F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[380].setRotationPoint(-92.5F, -14.5F, -8.5F);

		gunModel[381].addShapeBox(0F, 0F, 0F, 54, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[381].setRotationPoint(-145.5F, -11.5F, -7F);

		gunModel[382].addShapeBox(0F, 0F, 0F, 2, 6, 15, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[382].setRotationPoint(-91.5F, -11.5F, -7F);

		gunModel[383].addShapeBox(0F, 0F, 0F, 54, 2, 16, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[383].setRotationPoint(-145.5F, -5.5F, -7.5F);

		gunModel[384].addShapeBox(0F, 0F, 0F, 7, 28, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[384].setRotationPoint(-139.5F, -38.5F, -10F);

		gunModel[385].addShapeBox(0F, 0F, 0F, 5, 2, 21, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[385].setRotationPoint(-139.5F, -40.5F, -10F);

		gunModel[386].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox18
		gunModel[386].setRotationPoint(-165.5F, -35.5F, -2.5F);

		gunModel[387].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[387].setRotationPoint(-165.5F, -37.5F, -2.5F);

		gunModel[388].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[388].setRotationPoint(-165.5F, -39.5F, -2.5F);

		gunModel[389].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox18
		gunModel[389].setRotationPoint(-165.5F, -10.5F, -2.5F);

		gunModel[390].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[390].setRotationPoint(-165.5F, -12.5F, -2.5F);

		gunModel[391].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[391].setRotationPoint(-165.5F, -14.5F, -2.5F);

		gunModel[392].addShapeBox(0F, 0F, 0F, 5, 67, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[392].setRotationPoint(-173.5F, -57.5F, -8.5F);

		gunModel[393].addShapeBox(0F, 0F, 0F, 3, 67, 18, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[393].setRotationPoint(-168.5F, -57.5F, -8.5F);

		gunModel[394].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox18
		gunModel[394].setRotationPoint(-173.5F, 9.5F, -8.5F);

		gunModel[395].addShapeBox(0F, 0F, 0F, 3, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox18
		gunModel[395].setRotationPoint(-168.5F, 9.5F, -8.5F);

		gunModel[396].addShapeBox(0F, 0F, 0F, 5, 4, 18, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[396].setRotationPoint(-173.5F, -61.5F, -8.5F);

		gunModel[397].addShapeBox(0F, 0F, 0F, 3, 4, 18, 0F,0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[397].setRotationPoint(-168.5F, -61.5F, -8.5F);

		gunModel[398].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[398].setRotationPoint(-87F, -50.5F, -8F);

		gunModel[399].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[399].setRotationPoint(-87F, -48.5F, -8F);

		gunModel[400].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[400].setRotationPoint(-87F, -49.5F, -8F);

		gunModel[401].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[401].setRotationPoint(-142F, -50.5F, -8F);

		gunModel[402].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[402].setRotationPoint(-142F, -48.5F, -8F);

		gunModel[403].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[403].setRotationPoint(-142F, -49.5F, -8F);

		gunModel[404].addShapeBox(0F, 0F, 0F, 5, 67, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		gunModel[404].setRotationPoint(-178.5F, -57.5F, -9.5F);

		gunModel[405].addShapeBox(0F, 0F, 0F, 5, 4, 20, 0F,3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 3F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox18
		gunModel[405].setRotationPoint(-178.5F, -61.5F, -9.5F);

		gunModel[406].addShapeBox(0F, 0F, 0F, 5, 3, 20, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 3F, 0F, -2F); // Import ImportBox18
		gunModel[406].setRotationPoint(-178.5F, 9.5F, -9.5F);

		gunModel[407].addShapeBox(0F, 0F, 0F, 1, 34, 20, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox18
		gunModel[407].setRotationPoint(-179.5F, -24.5F, -9.5F);

		gunModel[408].addShapeBox(0F, 0F, 0F, 1, 35, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox18
		gunModel[408].setRotationPoint(-179.5F, -57.5F, -9.5F);

		gunModel[409].addShapeBox(0F, 0F, 0F, 26, 2, 11, 0F,0F, -22F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -22F, 0.5F, 0F, 22F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 22F, 0.5F); // Import ImportBox18
		gunModel[409].setRotationPoint(-82.5F, -63.5F, -5F);

		gunModel[410].addShapeBox(0F, 0F, 0F, 6, 2, 11, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox18
		gunModel[410].setRotationPoint(-56.5F, -63.5F, -5F);

		gunModel[411].addShapeBox(0F, 0F, 0F, 10, 22, 11, 0F,-8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox18
		gunModel[411].setRotationPoint(-60.5F, -57.5F, -5F);

		gunModel[412].addShapeBox(0F, 0F, 0F, 8, 3, 11, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox18
		gunModel[412].setRotationPoint(-52.5F, -60.5F, -5F);

		gunModel[413].addShapeBox(0F, 0F, 0F, 8, 1, 11, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Import ImportBox18
		gunModel[413].setRotationPoint(-53.5F, -61.5F, -5F);

		gunModel[414].addShapeBox(0F, 0F, 0F, 5, 3, 11, 0F,-2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox18
		gunModel[414].setRotationPoint(-62.5F, -35.5F, -5F);

		gunModel[415].addShapeBox(0F, 0F, 0F, 3, 1, 19, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[415].setRotationPoint(-97F, -16.5F, -9F);

		gunModel[416].addShapeBox(0F, 0F, 0F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[416].setRotationPoint(-97F, -14.5F, -9F);

		gunModel[417].addShapeBox(0F, 0F, 0F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[417].setRotationPoint(-97F, -15.5F, -9F);

		gunModel[418].addShapeBox(0F, 0F, 0F, 3, 1, 19, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[418].setRotationPoint(-144F, -16.5F, -9F);

		gunModel[419].addShapeBox(0F, 0F, 0F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[419].setRotationPoint(-144F, -14.5F, -9F);

		gunModel[420].addShapeBox(0F, 0F, 0F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[420].setRotationPoint(-144F, -15.5F, -9F);

		gunModel[421].addShapeBox(0F, 0F, 0F, 3, 1, 21, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[421].setRotationPoint(-122F, -16.5F, -10F);

		gunModel[422].addShapeBox(0F, 0F, 0F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[422].setRotationPoint(-122F, -14.5F, -10F);

		gunModel[423].addShapeBox(0F, 0F, 0F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[423].setRotationPoint(-122F, -15.5F, -10F);

		gunModel[424].addShapeBox(0F, 0F, 0F, 3, 1, 21, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[424].setRotationPoint(-105F, -16.5F, -10F);

		gunModel[425].addShapeBox(0F, 0F, 0F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[425].setRotationPoint(-105F, -14.5F, -10F);

		gunModel[426].addShapeBox(0F, 0F, 0F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[426].setRotationPoint(-105F, -15.5F, -10F);

		gunModel[427].addShapeBox(0F, 0F, 0F, 3, 1, 19, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[427].setRotationPoint(-48F, -39.5F, -9F);

		gunModel[428].addShapeBox(0F, 0F, 0F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[428].setRotationPoint(-48F, -37.5F, -9F);

		gunModel[429].addShapeBox(0F, 0F, 0F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[429].setRotationPoint(-48F, -38.5F, -9F);

		gunModel[430].addShapeBox(0F, 0F, 0F, 3, 1, 19, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[430].setRotationPoint(-48F, -62.5F, -9F);

		gunModel[431].addShapeBox(0F, 0F, 0F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[431].setRotationPoint(-48F, -60.5F, -9F);

		gunModel[432].addShapeBox(0F, 0F, 0F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[432].setRotationPoint(-48F, -61.5F, -9F);

		gunModel[433].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,-0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F); // Box 1
		gunModel[433].setRotationPoint(70F, -38F, -6.5F);

		gunModel[434].addBox(0F, 0F, 0F, 80, 11, 17, 0F); // Box 2
		gunModel[434].setRotationPoint(139F, -54F, -8F);

		gunModel[435].addShapeBox(0F, 0F, 0F, 58, 3, 17, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[435].setRotationPoint(25F, -57F, -8F);

		gunModel[436].addShapeBox(0F, 0F, 0F, 58, 2, 15, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 4
		gunModel[436].setRotationPoint(25F, -59F, -7F);

		gunModel[437].addShapeBox(0F, 0F, 0F, 79, 3, 17, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[437].setRotationPoint(83F, -57F, -8F);

		gunModel[438].addShapeBox(0F, 0F, 0F, 79, 2, 15, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 6
		gunModel[438].setRotationPoint(83F, -59F, -7F);

		gunModel[439].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 14
		gunModel[439].setRotationPoint(215.5F, -65.25F, 7.5F);

		gunModel[440].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[440].setRotationPoint(-27F, -72F, -5F);

		gunModel[441].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[441].setRotationPoint(-21F, -72F, -5F);

		gunModel[442].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[442].setRotationPoint(-15F, -72F, -5F);

		gunModel[443].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[443].setRotationPoint(-9F, -72F, -5F);

		gunModel[444].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[444].setRotationPoint(-3F, -72F, -5F);

		gunModel[445].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[445].setRotationPoint(3F, -72F, -5F);

		gunModel[446].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[446].setRotationPoint(9F, -72F, -5F);

		gunModel[447].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[447].setRotationPoint(15F, -72F, -5F);

		gunModel[448].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[448].setRotationPoint(21F, -72F, -5F);

		gunModel[449].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[449].setRotationPoint(27F, -72F, -5F);

		gunModel[450].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[450].setRotationPoint(33F, -72F, -5F);

		gunModel[451].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[451].setRotationPoint(39F, -72F, -5F);

		gunModel[452].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[452].setRotationPoint(45F, -72F, -5F);

		gunModel[453].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[453].setRotationPoint(51F, -72F, -5F);

		gunModel[454].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[454].setRotationPoint(57F, -72F, -5F);

		gunModel[455].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[455].setRotationPoint(63F, -72F, -5F);

		gunModel[456].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[456].setRotationPoint(69F, -72F, -5F);

		gunModel[457].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[457].setRotationPoint(75F, -72F, -5F);

		gunModel[458].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[458].setRotationPoint(81F, -72F, -5F);

		gunModel[459].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[459].setRotationPoint(87F, -72F, -5F);

		gunModel[460].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[460].setRotationPoint(93F, -72F, -5F);

		gunModel[461].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		gunModel[461].setRotationPoint(99F, -72F, -5F);

		gunModel[462].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[462].setRotationPoint(105F, -72F, -5F);

		gunModel[463].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[463].setRotationPoint(111F, -72F, -5F);

		gunModel[464].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[464].setRotationPoint(117F, -72F, -5F);

		gunModel[465].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[465].setRotationPoint(123F, -72F, -5F);

		gunModel[466].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[466].setRotationPoint(129F, -72F, -5F);

		gunModel[467].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[467].setRotationPoint(135F, -72F, -5F);

		gunModel[468].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[468].setRotationPoint(141F, -72F, -5F);

		gunModel[469].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[469].setRotationPoint(147F, -72F, -5F);

		gunModel[470].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[470].setRotationPoint(153F, -72F, -5F);

		gunModel[471].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[471].setRotationPoint(159F, -72F, -5F);

		gunModel[472].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[472].setRotationPoint(165F, -72F, -5F);

		gunModel[473].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		gunModel[473].setRotationPoint(171F, -72F, -5F);

		gunModel[474].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		gunModel[474].setRotationPoint(177F, -72F, -5F);

		gunModel[475].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[475].setRotationPoint(183F, -72F, -5F);

		gunModel[476].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[476].setRotationPoint(189F, -72F, -5F);

		gunModel[477].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[477].setRotationPoint(195F, -72F, -5F);

		gunModel[478].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[478].setRotationPoint(201F, -72F, -5F);

		gunModel[479].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[479].setRotationPoint(207F, -72F, -5F);

		gunModel[480].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		gunModel[480].setRotationPoint(213F, -72F, -5F);
	}

	private void initdefaultScopeModel_1()
	{
		defaultScopeModel[0] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Import ImportBox18
		defaultScopeModel[1] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Import ImportBox18
		defaultScopeModel[2] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Import ImportBox18
		defaultScopeModel[3] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Import ImportBox18
		defaultScopeModel[4] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Import ImportBox18
		defaultScopeModel[5] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Import ImportBox18
		defaultScopeModel[6] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Import ImportBox18
		defaultScopeModel[7] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Import ImportBox18
		defaultScopeModel[8] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Import ImportBox18
		defaultScopeModel[9] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Import ImportBox18
		defaultScopeModel[10] = new ModelRendererTurbo(this, 849, 113, textureX, textureY); // Import ImportBox18
		defaultScopeModel[11] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Import ImportBox18
		defaultScopeModel[12] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Import ImportBox18
		defaultScopeModel[13] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Import ImportBox18
		defaultScopeModel[14] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Import ImportBox18
		defaultScopeModel[15] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Import ImportBox18
		defaultScopeModel[16] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Import ImportBox18
		defaultScopeModel[17] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import ImportBox18
		defaultScopeModel[18] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Import ImportBox18
		defaultScopeModel[19] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Import ImportBox18
		defaultScopeModel[20] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Import ImportBox18
		defaultScopeModel[21] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Import ImportBox18
		defaultScopeModel[22] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Import ImportBox18
		defaultScopeModel[23] = new ModelRendererTurbo(this, 881, 105, textureX, textureY); // Import ImportBox18
		defaultScopeModel[24] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Import ImportBox18
		defaultScopeModel[25] = new ModelRendererTurbo(this, 761, 169, textureX, textureY); // Import ImportBox18
		defaultScopeModel[26] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Import ImportBox18
		defaultScopeModel[27] = new ModelRendererTurbo(this, 833, 169, textureX, textureY); // Import ImportBox18
		defaultScopeModel[28] = new ModelRendererTurbo(this, 873, 89, textureX, textureY); // Import ImportBox18
		defaultScopeModel[29] = new ModelRendererTurbo(this, 65, 273, textureX, textureY); // Import ImportBox18
		defaultScopeModel[30] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Import ImportBox18
		defaultScopeModel[31] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Import ImportBox18
		defaultScopeModel[32] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Import ImportBox18
		defaultScopeModel[33] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import ImportBox0
		defaultScopeModel[34] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Import ImportBox0
		defaultScopeModel[35] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Import ImportBox18
		defaultScopeModel[36] = new ModelRendererTurbo(this, 537, 169, textureX, textureY); // Import ImportBox18
		defaultScopeModel[37] = new ModelRendererTurbo(this, 569, 169, textureX, textureY); // Import ImportBox18
		defaultScopeModel[38] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Import ImportBox18
		defaultScopeModel[39] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Import ImportBox18
		defaultScopeModel[40] = new ModelRendererTurbo(this, 721, 41, textureX, textureY); // Import ImportBox18
		defaultScopeModel[41] = new ModelRendererTurbo(this, 937, 97, textureX, textureY); // Import ImportBox18
		defaultScopeModel[42] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Import ImportBox18
		defaultScopeModel[43] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Import ImportBox18
		defaultScopeModel[44] = new ModelRendererTurbo(this, 841, 129, textureX, textureY); // Import ImportBox18
		defaultScopeModel[45] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Import ImportBox18
		defaultScopeModel[46] = new ModelRendererTurbo(this, 545, 49, textureX, textureY); // Import ImportBox18
		defaultScopeModel[47] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Import ImportBox18
		defaultScopeModel[48] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import ImportBox18
		defaultScopeModel[49] = new ModelRendererTurbo(this, 905, 169, textureX, textureY); // Import ImportBox18
		defaultScopeModel[50] = new ModelRendererTurbo(this, 937, 169, textureX, textureY); // Import ImportBox18
		defaultScopeModel[51] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Import ImportBox18
		defaultScopeModel[52] = new ModelRendererTurbo(this, 937, 177, textureX, textureY); // Import ImportBox18
		defaultScopeModel[53] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Import ImportBox18
		defaultScopeModel[54] = new ModelRendererTurbo(this, 745, 185, textureX, textureY); // Import ImportBox18
		defaultScopeModel[55] = new ModelRendererTurbo(this, 809, 185, textureX, textureY); // Import ImportBox18
		defaultScopeModel[56] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Import ImportBox18
		defaultScopeModel[57] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Import ImportBox18
		defaultScopeModel[58] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Import ImportBox18
		defaultScopeModel[59] = new ModelRendererTurbo(this, 745, 193, textureX, textureY); // Import ImportBox18
		defaultScopeModel[60] = new ModelRendererTurbo(this, 809, 193, textureX, textureY); // Import ImportBox18
		defaultScopeModel[61] = new ModelRendererTurbo(this, 1001, 193, textureX, textureY); // Import ImportBox18
		defaultScopeModel[62] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Import ImportBox18
		defaultScopeModel[63] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Import ImportBox18
		defaultScopeModel[64] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Import ImportBox18
		defaultScopeModel[65] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Import ImportBox18
		defaultScopeModel[66] = new ModelRendererTurbo(this, 425, 201, textureX, textureY); // Import ImportBox18
		defaultScopeModel[67] = new ModelRendererTurbo(this, 1001, 201, textureX, textureY); // Import ImportBox18
		defaultScopeModel[68] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Import ImportBox18
		defaultScopeModel[69] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Import ImportBox18
		defaultScopeModel[70] = new ModelRendererTurbo(this, 425, 209, textureX, textureY); // Import ImportBox18
		defaultScopeModel[71] = new ModelRendererTurbo(this, 929, 209, textureX, textureY); // Import ImportBox18
		defaultScopeModel[72] = new ModelRendererTurbo(this, 609, 217, textureX, textureY); // Import ImportBox18
		defaultScopeModel[73] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Import ImportBox18
		defaultScopeModel[74] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Import ImportBox18
		defaultScopeModel[75] = new ModelRendererTurbo(this, 505, 257, textureX, textureY); // Import ImportBox18
		defaultScopeModel[76] = new ModelRendererTurbo(this, 25, 329, textureX, textureY); // Import ImportBox18
		defaultScopeModel[77] = new ModelRendererTurbo(this, 497, 361, textureX, textureY); // Import ImportBox18
		defaultScopeModel[78] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Import ImportBox18
		defaultScopeModel[79] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportBox18
		defaultScopeModel[80] = new ModelRendererTurbo(this, 905, 233, textureX, textureY); // Import ImportBox18
		defaultScopeModel[81] = new ModelRendererTurbo(this, 593, 225, textureX, textureY); // Import ImportBox18
		defaultScopeModel[82] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Import ImportBox18
		defaultScopeModel[83] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import ImportBox18
		defaultScopeModel[84] = new ModelRendererTurbo(this, 1001, 105, textureX, textureY); // Import ImportBox0
		defaultScopeModel[85] = new ModelRendererTurbo(this, 881, 217, textureX, textureY); // Import ImportBox18
		defaultScopeModel[86] = new ModelRendererTurbo(this, 929, 217, textureX, textureY); // Import ImportBox18
		defaultScopeModel[87] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Import ImportBox18
		defaultScopeModel[88] = new ModelRendererTurbo(this, 993, 169, textureX, textureY); // Import ImportBox18
		defaultScopeModel[89] = new ModelRendererTurbo(this, 993, 177, textureX, textureY); // Import ImportBox18
		defaultScopeModel[90] = new ModelRendererTurbo(this, 585, 209, textureX, textureY); // Import ImportBox18
		defaultScopeModel[91] = new ModelRendererTurbo(this, 617, 209, textureX, textureY); // Import ImportBox18
		defaultScopeModel[92] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import ImportBox18
		defaultScopeModel[93] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Import ImportBox18
		defaultScopeModel[94] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 12
		defaultScopeModel[95] = new ModelRendererTurbo(this, 673, 145, textureX, textureY); // Box 15
		defaultScopeModel[96] = new ModelRendererTurbo(this, 745, 145, textureX, textureY); // Box 17
		defaultScopeModel[97] = new ModelRendererTurbo(this, 785, 145, textureX, textureY); // Box 18

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[0].setRotationPoint(-29.5F, -78F, -5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[1].setRotationPoint(-29.5F, -75F, -5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[2].setRotationPoint(-29.5F, -78F, 5F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[3].setRotationPoint(-29.5F, -75F, 5F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[4].setRotationPoint(-28F, -74.5F, 6F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[5].setRotationPoint(-28F, -76.5F, 6F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[6].setRotationPoint(-28F, -72.5F, 6F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import ImportBox18
		defaultScopeModel[7].setRotationPoint(-26F, -78F, 6F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,-1.8F, -6.55F, 0F, -0.25F, -1.55F, 0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3F, 5.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, -0.25F, -3F, 5.75F, -0.25F); // Import ImportBox18
		defaultScopeModel[8].setRotationPoint(-30.75F, -78F, 6F);

		defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,-0.25F, -1.55F, 0F, -1.8F, -6.55F, 0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1F, 0.75F, 0F, -3F, 5.75F, 0F, -3F, 5.75F, -0.25F, 1F, 0.75F, -0.25F); // Import ImportBox18
		defaultScopeModel[9].setRotationPoint(-28.25F, -78F, 6F);

		defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[10].setRotationPoint(-28F, -74.5F, -7F);

		defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[11].setRotationPoint(-28F, -76.5F, -7F);

		defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[12].setRotationPoint(-28F, -72.5F, -7F);

		defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import ImportBox18
		defaultScopeModel[13].setRotationPoint(-26F, -78F, -6.7F);

		defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,-1.8F, -6.55F, 0F, -0.25F, -1.55F, 0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3F, 5.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, -0.25F, -3F, 5.75F, -0.25F); // Import ImportBox18
		defaultScopeModel[14].setRotationPoint(-30.75F, -78F, -6.7F);

		defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,-0.25F, -1.55F, 0F, -1.8F, -6.55F, 0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1F, 0.75F, 0F, -3F, 5.75F, 0F, -3F, 5.75F, -0.25F, 1F, 0.75F, -0.25F); // Import ImportBox18
		defaultScopeModel[15].setRotationPoint(-28.25F, -78F, -6.7F);

		defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,-3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[16].setRotationPoint(-29.5F, -77F, 3F);

		defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[17].setRotationPoint(-29.5F, -74F, 3F);

		defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[18].setRotationPoint(-29.5F, -72F, 3F);

		defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox18
		defaultScopeModel[19].setRotationPoint(-29.5F, -77F, -4F);

		defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox18
		defaultScopeModel[20].setRotationPoint(-29.5F, -74F, -4F);

		defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F); // Import ImportBox18
		defaultScopeModel[21].setRotationPoint(-29.5F, -72F, -5F);

		defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 6, 15, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[22].setRotationPoint(-28F, -85F, -2.5F);

		defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[23].setRotationPoint(-21.5F, -75F, -2.5F);

		defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[24].setRotationPoint(-22.5F, -74F, -4.5F);

		defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, -1.45F, 0F, 0F, -1.45F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox18
		defaultScopeModel[25].setRotationPoint(-19.5F, -74F, -4.5F);

		defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 6, 2, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[26].setRotationPoint(-19.5F, -72F, -4.5F);

		defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[27].setRotationPoint(-13.5F, -72F, -4.5F);

		defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[28].setRotationPoint(-13.5F, -72F, 3.5F);

		defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 6, 15, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[29].setRotationPoint(-28F, -85F, -0.5F);

		defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 6, 15, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[30].setRotationPoint(-28F, -85F, 1.5F);

		defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[31].setRotationPoint(-18F, -73F, 4.5F);

		defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox18
		defaultScopeModel[32].setRotationPoint(-18F, -70F, 4.5F);

		defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Import ImportBox0
		defaultScopeModel[33].setRotationPoint(-17.15F, -72.25F, 5F);

		defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox0
		defaultScopeModel[34].setRotationPoint(-17.9F, -73F, 5F);

		defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import ImportBox18
		defaultScopeModel[35].setRotationPoint(-28.15F, -82F, -0.65F);

		defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1.5F, 0.5F, 0.25F, -1.75F, 0.5F, 0.25F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.25F, -1.75F, 0F, 0.25F); // Import ImportBox18
		defaultScopeModel[36].setRotationPoint(-28.15F, -82F, 1.6F);

		defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,-1.75F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, -1.75F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import ImportBox18
		defaultScopeModel[37].setRotationPoint(-28.15F, -82F, -2.9F);

		defaultScopeModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F); // Import ImportBox18
		defaultScopeModel[38].setRotationPoint(-27F, -86.5F, -1F);

		defaultScopeModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Import ImportBox18
		defaultScopeModel[39].setRotationPoint(-27F, -88F, -1.5F);

		defaultScopeModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Import ImportBox18
		defaultScopeModel[40].setRotationPoint(-27F, -88F, 1.5F);

		defaultScopeModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[41].setRotationPoint(-27F, -89.5F, -0.5F);

		defaultScopeModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, -0.25F, 0F, -0.99F); // Import ImportBox18
		defaultScopeModel[42].setRotationPoint(-27F, -89F, -0.5F);

		defaultScopeModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[43].setRotationPoint(-27F, -89F, 0.5F);

		defaultScopeModel[44].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,-1F, 0.5F, 0F, -1F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[44].setRotationPoint(-28F, -88.5F, 2.5F);

		defaultScopeModel[45].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[45].setRotationPoint(-28F, -88.5F, -2.5F);

		defaultScopeModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import ImportBox18
		defaultScopeModel[46].setRotationPoint(-27F, -87F, 0.5F);

		defaultScopeModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, -0.25F, 0F, -0.99F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Import ImportBox18
		defaultScopeModel[47].setRotationPoint(-27F, -87F, -0.5F);

		defaultScopeModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F); // Import ImportBox18
		defaultScopeModel[48].setRotationPoint(-25.25F, -86.5F, -1F);

		defaultScopeModel[49].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[49].setRotationPoint(196.5F, -78F, -5F);

		defaultScopeModel[50].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[50].setRotationPoint(196.5F, -75F, -5F);

		defaultScopeModel[51].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[51].setRotationPoint(196.5F, -72F, -5F);

		defaultScopeModel[52].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[52].setRotationPoint(196.5F, -78F, 5F);

		defaultScopeModel[53].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[53].setRotationPoint(196.5F, -75F, 5F);

		defaultScopeModel[54].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[54].setRotationPoint(196.5F, -72F, 5F);

		defaultScopeModel[55].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[55].setRotationPoint(198F, -74.5F, 6F);

		defaultScopeModel[56].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[56].setRotationPoint(198F, -76.5F, 6F);

		defaultScopeModel[57].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[57].setRotationPoint(198F, -72.5F, 6F);

		defaultScopeModel[58].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Import ImportBox18
		defaultScopeModel[58].setRotationPoint(200F, -77.5F, 6F);

		defaultScopeModel[59].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,-1.8F, -6.55F, 0F, -0.25F, -1.55F, 0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3F, 5.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, -0.25F, -3F, 5.75F, -0.25F); // Import ImportBox18
		defaultScopeModel[59].setRotationPoint(195.25F, -78F, 6F);

		defaultScopeModel[60].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,-0.25F, -1.55F, 0F, -1.8F, -6.55F, 0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1F, 0.75F, 0F, -3F, 5.75F, 0F, -3F, 5.75F, -0.25F, 1F, 0.75F, -0.25F); // Import ImportBox18
		defaultScopeModel[60].setRotationPoint(197.75F, -78F, 6F);

		defaultScopeModel[61].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[61].setRotationPoint(198F, -74.5F, -7F);

		defaultScopeModel[62].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[62].setRotationPoint(198F, -76.5F, -7F);

		defaultScopeModel[63].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[63].setRotationPoint(198F, -72.5F, -7F);

		defaultScopeModel[64].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Import ImportBox18
		defaultScopeModel[64].setRotationPoint(200F, -77.5F, -6.7F);

		defaultScopeModel[65].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,-1.8F, -6.55F, 0F, -0.25F, -1.55F, 0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3F, 5.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, -0.25F, -3F, 5.75F, -0.25F); // Import ImportBox18
		defaultScopeModel[65].setRotationPoint(195.25F, -78F, -6.7F);

		defaultScopeModel[66].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,-0.25F, -1.55F, 0F, -1.8F, -6.55F, 0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1F, 0.75F, 0F, -3F, 5.75F, 0F, -3F, 5.75F, -0.25F, 1F, 0.75F, -0.25F); // Import ImportBox18
		defaultScopeModel[66].setRotationPoint(197.75F, -78F, -6.7F);

		defaultScopeModel[67].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,-3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[67].setRotationPoint(196.5F, -77F, 3F);

		defaultScopeModel[68].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[68].setRotationPoint(196.5F, -74F, 3F);

		defaultScopeModel[69].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[69].setRotationPoint(196.5F, -72F, 3F);

		defaultScopeModel[70].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox18
		defaultScopeModel[70].setRotationPoint(196.5F, -77F, -4F);

		defaultScopeModel[71].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox18
		defaultScopeModel[71].setRotationPoint(196.5F, -74F, -4F);

		defaultScopeModel[72].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F); // Import ImportBox18
		defaultScopeModel[72].setRotationPoint(196.5F, -72F, -4F);

		defaultScopeModel[73].addShapeBox(0F, 0F, 0F, 6, 13, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[73].setRotationPoint(198F, -83F, -2.5F);

		defaultScopeModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[74].setRotationPoint(204.5F, -75F, -2.5F);

		defaultScopeModel[75].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[75].setRotationPoint(203.5F, -74F, -4.5F);

		defaultScopeModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, -1.45F, 0F, 0F, -1.45F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox18
		defaultScopeModel[76].setRotationPoint(206.5F, -74F, -4.5F);

		defaultScopeModel[77].addShapeBox(0F, 0F, 0F, 6, 2, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[77].setRotationPoint(206.5F, -72F, -4.5F);

		defaultScopeModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[78].setRotationPoint(212.5F, -72F, -4.5F);

		defaultScopeModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[79].setRotationPoint(212.5F, -72F, 3.5F);

		defaultScopeModel[80].addShapeBox(0F, 0F, 0F, 6, 14, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[80].setRotationPoint(198F, -84F, -0.5F);

		defaultScopeModel[81].addShapeBox(0F, 0F, 0F, 6, 13, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[81].setRotationPoint(198F, -83F, 1.5F);

		defaultScopeModel[82].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[82].setRotationPoint(208F, -73F, 4.5F);

		defaultScopeModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox18
		defaultScopeModel[83].setRotationPoint(208F, -70F, 4.5F);

		defaultScopeModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Import ImportBox0
		defaultScopeModel[84].setRotationPoint(208.85F, -72.25F, 5F);

		defaultScopeModel[85].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import ImportBox18
		defaultScopeModel[85].setRotationPoint(197.85F, -80F, -0.65F);

		defaultScopeModel[86].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1.5F, 0.5F, 0.25F, -1.75F, 0.5F, 0.25F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.25F, -1.75F, 0F, 0.25F); // Import ImportBox18
		defaultScopeModel[86].setRotationPoint(197.85F, -80F, 1.6F);

		defaultScopeModel[87].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,-1.75F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, -1.75F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import ImportBox18
		defaultScopeModel[87].setRotationPoint(197.85F, -80F, -2.9F);

		defaultScopeModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Import ImportBox18
		defaultScopeModel[88].setRotationPoint(200F, -85.5F, -2F);

		defaultScopeModel[89].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -1.35F, 0.5F, 0F, -1.35F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.35F, 0F, 0F, -1.35F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[89].setRotationPoint(198F, -88.5F, -3.5F);

		defaultScopeModel[90].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-2F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[90].setRotationPoint(198F, -84.5F, -2.5F);

		defaultScopeModel[91].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[91].setRotationPoint(198F, -84.5F, 1.5F);

		defaultScopeModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import ImportBox18
		defaultScopeModel[92].setRotationPoint(200.5F, -86.5F, 0F);

		defaultScopeModel[93].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,-1.35F, 0.5F, 0F, -1.35F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -1.35F, 0F, 0F, -1.35F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox18
		defaultScopeModel[93].setRotationPoint(198F, -88.5F, 3.5F);

		defaultScopeModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		defaultScopeModel[94].setRotationPoint(200.5F, -88.5F, 0F);

		defaultScopeModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F); // Box 15
		defaultScopeModel[95].setRotationPoint(-17.9F, -71.75F, 5F);

		defaultScopeModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 17
		defaultScopeModel[96].setRotationPoint(208.1F, -73F, 5F);

		defaultScopeModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F); // Box 18
		defaultScopeModel[97].setRotationPoint(208.1F, -71.75F, 5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 393, 409, textureX, textureY); // Import ImportBox0
		ammoModel[1] = new ModelRendererTurbo(this, 153, 417, textureX, textureY); // Import ImportBox0
		ammoModel[2] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Import ImportBox0
		ammoModel[3] = new ModelRendererTurbo(this, 545, 393, textureX, textureY); // Import ImportBox0
		ammoModel[4] = new ModelRendererTurbo(this, 25, 409, textureX, textureY); // Import ImportBox0
		ammoModel[5] = new ModelRendererTurbo(this, 41, 409, textureX, textureY); // Import ImportBox0
		ammoModel[6] = new ModelRendererTurbo(this, 593, 145, textureX, textureY); // Import ImportBox0
		ammoModel[7] = new ModelRendererTurbo(this, 537, 209, textureX, textureY); // Import ImportBox0
		ammoModel[8] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Import ImportBox0
		ammoModel[9] = new ModelRendererTurbo(this, 489, 409, textureX, textureY); // Import ImportBox0
		ammoModel[10] = new ModelRendererTurbo(this, 513, 409, textureX, textureY); // Import ImportBox0
		ammoModel[11] = new ModelRendererTurbo(this, 673, 409, textureX, textureY); // Import ImportBox0
		ammoModel[12] = new ModelRendererTurbo(this, 689, 409, textureX, textureY); // Import ImportBox0
		ammoModel[13] = new ModelRendererTurbo(this, 633, 145, textureX, textureY); // Import ImportBox0

		ammoModel[0].addShapeBox(0F, 0F, 0F, 34, 29, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		ammoModel[0].setRotationPoint(30F, -23F, -5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 34, 17, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 5F, 0F); // Import ImportBox0
		ammoModel[1].setRotationPoint(30F, 6F, -5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 7, 44, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.25F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 1.25F, -0.5F); // Import ImportBox0
		ammoModel[2].setRotationPoint(57F, -23F, -5.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 8, 46, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 1.6F, -0.5F); // Import ImportBox0
		ammoModel[3].setRotationPoint(46F, -23F, -5.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 6, 48, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.45F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, -0.5F, 1.45F, -0.5F); // Import ImportBox0
		ammoModel[4].setRotationPoint(37F, -23F, -5.5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 4, 51, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F); // Import ImportBox0
		ammoModel[5].setRotationPoint(29.5F, -23F, -5.5F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.3F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -0.5F, -0.5F, 1.3F, -0.5F); // Import ImportBox0
		ammoModel[6].setRotationPoint(42.5F, 22F, -5.5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox0
		ammoModel[7].setRotationPoint(42.5F, 21F, -5.5F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		ammoModel[8].setRotationPoint(46F, 21F, -5.5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 7, 44, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.25F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 1.25F, -0.5F); // Import ImportBox0
		ammoModel[9].setRotationPoint(57F, -23F, 6F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 8, 46, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 1.6F, -0.5F); // Import ImportBox0
		ammoModel[10].setRotationPoint(46F, -23F, 6F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 6, 48, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.45F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, -0.5F, 1.45F, -0.5F); // Import ImportBox0
		ammoModel[11].setRotationPoint(37F, -23F, 6F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 4, 51, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -1.5F, 0F, -0.5F); // Import ImportBox0
		ammoModel[12].setRotationPoint(29.5F, -23F, 6F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.3F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -0.5F, -0.5F, 1.3F, -0.5F); // Import ImportBox0
		ammoModel[13].setRotationPoint(42.5F, 22F, 6F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Import ImportBox0
		slideModel[1] = new ModelRendererTurbo(this, 857, 217, textureX, textureY); // Import ImportBox0
		slideModel[2] = new ModelRendererTurbo(this, 993, 217, textureX, textureY); // Import ImportBox0
		slideModel[3] = new ModelRendererTurbo(this, 25, 225, textureX, textureY); // Import ImportBox0
		slideModel[4] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Import ImportBox0
		slideModel[5] = new ModelRendererTurbo(this, 873, 97, textureX, textureY); // Import ImportBox0
		slideModel[6] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import ImportBox0
		slideModel[7] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import ImportBox0
		slideModel[8] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Import ImportBox0
		slideModel[9] = new ModelRendererTurbo(this, 953, 193, textureX, textureY); // Import ImportBox0
		slideModel[10] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Import ImportBox0
		slideModel[11] = new ModelRendererTurbo(this, 57, 425, textureX, textureY); // Import ImportBox0
		slideModel[12] = new ModelRendererTurbo(this, 553, 105, textureX, textureY); // Box 689
		slideModel[13] = new ModelRendererTurbo(this, 913, 105, textureX, textureY); // Box 695
		slideModel[14] = new ModelRendererTurbo(this, 825, 145, textureX, textureY); // Box 696
		slideModel[15] = new ModelRendererTurbo(this, 865, 145, textureX, textureY); // Box 697
		slideModel[16] = new ModelRendererTurbo(this, 905, 145, textureX, textureY); // Box 698
		slideModel[17] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 699
		slideModel[18] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 700
		slideModel[19] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Box 701
		slideModel[20] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 702

		slideModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Import ImportBox0
		slideModel[0].setRotationPoint(97F, -62.5F, 5.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[1].setRotationPoint(97.6F, -62.65F, 6.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		slideModel[2].setRotationPoint(97.6F, -61.65F, 6.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[3].setRotationPoint(97.6F, -63.65F, 6.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[4].setRotationPoint(98.1F, -63.15F, 3.5F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Import ImportBox0
		slideModel[5].setRotationPoint(97F, -62.5F, 12.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox0
		slideModel[6].setRotationPoint(98.5F, -62.5F, 10.5F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, -1F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox0
		slideModel[7].setRotationPoint(96.75F, -62.5F, 11.5F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.25F, 0.5F, -1F, 0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Import ImportBox0
		slideModel[8].setRotationPoint(100.5F, -62.5F, 11.5F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -2.25F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, -1.5F, 0F, 0F); // Import ImportBox0
		slideModel[9].setRotationPoint(96.5F, -63.25F, 6.5F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportBox0
		slideModel[10].setRotationPoint(98.5F, -62.5F, 6.5F);

		slideModel[11].addBox(0F, 0F, 0F, 46, 7, 1, 0F); // Import ImportBox0
		slideModel[11].setRotationPoint(19F, -53F, -7F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.75F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.75F, 0.5F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 689
		slideModel[12].setRotationPoint(96.5F, -64.25F, 12.5F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.75F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0.5F, 0F, -1.75F, 0.5F, 0F, -1.5F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 695
		slideModel[13].setRotationPoint(96.5F, -64.25F, 11.5F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, -1.75F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.75F, 0.5F, 0F); // Box 696
		slideModel[14].setRotationPoint(96.5F, -61F, 12.5F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.5F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, -1.75F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0.5F, 0F, -1.75F, 0.5F, 0F); // Box 697
		slideModel[15].setRotationPoint(96.5F, -61F, 11.5F);

		slideModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.75F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.75F, 0.5F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 698
		slideModel[16].setRotationPoint(96.5F, -64.25F, 5.5F);

		slideModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, -1.75F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.75F, 0.5F, 0F); // Box 699
		slideModel[17].setRotationPoint(96.5F, -61F, 5.5F);

		slideModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.75F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, -1F, 0F, -1.75F, -1F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.5F, 0.25F, 0F); // Box 700
		slideModel[18].setRotationPoint(96.5F, -64.25F, 6.5F);

		slideModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.75F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, -1F, 0F, -1.75F, -1F, 0F); // Box 701
		slideModel[19].setRotationPoint(96.5F, -61F, 6.5F);

		slideModel[20].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-1.5F, -0.25F, 0F, -2.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, -1.5F, 0F, 0F, -2.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 702
		slideModel[20].setRotationPoint(96.5F, -63.25F, 11.5F);
	}
}