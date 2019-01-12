//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: mk20ssr
// Model Creator: 
// Created on: 10.10.2018 - 21:37:01
// Last changed on: 10.10.2018 - 21:37:01

package com.modularwarfare.client.model.test; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

//import com.flansmod.client.model.EnumAnimationType;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class mk20 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public mk20() //Same as Filename
	{
		modelScale = 0.06F;
		gunModel = new ModelRendererTurbo[488];
		defaultScopeModel = new ModelRendererTurbo[123];
		ammoModel = new ModelRendererTurbo[14];
		slideModel = new ModelRendererTurbo[37];

		initgunModel_1();
		initdefaultScopeModel_1();
		initammoModel_1();
		initslideModel_1();

		barrelAttachPoint = new Vector3f(290F /16F, 67F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(165 /16F, 54F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(10 /16F, 87F /16F, 0F /16F);

		translateAll(-0.5F, -18F, -0.7F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.07F, 0F);//forward/up/?

		gunSlideDistance = 3F;
		//animationType = EnumAnimationType.CUSTOM;

		rotateGunVertical = 35F;
		rotateGunHorizontal = 1F;
		tiltGun = 25F;
		tiltGunTime = 0.15F;
		unloadClipTime = 0.35F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.15F;
		translateGun = new Vector3f(1 /16F, 2F /16F, -1F /16F);
		rotateClipVertical = -91F;
		rotateClipHorizontal = 1F;
		tiltClip = 28F;
		translateClip = new Vector3f(1 /16F, -40F /16F, 1F /16F);

		hasFlash = false;
        hasArms = true;
        
        
        leftArmPos = new Vector3f(0.01F, -0.31F, 0.08F);
        leftArmRot = new Vector3f(60.0F, 45.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.22F, -0.5F, 0.22F);
        leftArmReloadRot = new Vector3f(60.0F, 55.0F, -0.0F);
 
        rightArmPos = new Vector3f(0.28F, -0.55F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.28F, -0.55F, 0.05F);
        rightArmReloadRot = new Vector3f(-0.0F, 0.0F, -90.0F);
        
        rightArmScale = new Vector3f(0.8F, 0.8F, 0.8F);
        leftArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
 
        rightHandAmmo = false;
        leftHandAmmo = true;
        
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
		stanceRotate = new Vector3f(40.0F, 0.0F, -20.0F);
		stanceTranslate = new Vector3f(0.4F, 0.0F, 0.0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import Box18
		gunModel[19] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Import Box18
		gunModel[20] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Import Box18
		gunModel[21] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Import Box18
		gunModel[22] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box18
		gunModel[24] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box18
		gunModel[25] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Import Box18
		gunModel[26] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box18
		gunModel[27] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box18
		gunModel[28] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import Box18
		gunModel[29] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box18
		gunModel[30] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box18
		gunModel[31] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box18
		gunModel[32] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Import Box18
		gunModel[33] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box18
		gunModel[34] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box18
		gunModel[35] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Import Box18
		gunModel[36] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import Box18
		gunModel[37] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import Box18
		gunModel[38] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box18
		gunModel[39] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Import Box18
		gunModel[40] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import Box0
		gunModel[41] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Import Box0
		gunModel[42] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Import Box0
		gunModel[43] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Import Box0
		gunModel[44] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Import Box0
		gunModel[45] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Import Box0
		gunModel[46] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Import Box0
		gunModel[47] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Import Box0
		gunModel[48] = new ModelRendererTurbo(this, 593, 33, textureX, textureY); // Import Box0
		gunModel[49] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box0
		gunModel[50] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Import Box0
		gunModel[51] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Import Box0
		gunModel[52] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box0
		gunModel[53] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Import Box0
		gunModel[54] = new ModelRendererTurbo(this, 593, 97, textureX, textureY); // Import Box0
		gunModel[55] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box0
		gunModel[56] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Import Box0
		gunModel[57] = new ModelRendererTurbo(this, 585, 113, textureX, textureY); // Import Box0
		gunModel[58] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Import Box0
		gunModel[59] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Import Box0
		gunModel[60] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Import Box0
		gunModel[61] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Import Box0
		gunModel[62] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box0
		gunModel[63] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Import Box0
		gunModel[64] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import Box0
		gunModel[65] = new ModelRendererTurbo(this, 593, 129, textureX, textureY); // Import Box0
		gunModel[66] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box0
		gunModel[67] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import Box0
		gunModel[68] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Import Box0
		gunModel[69] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Import Box0
		gunModel[70] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Import Box0
		gunModel[71] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Import Box0
		gunModel[72] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Box0
		gunModel[73] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import Box0
		gunModel[74] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import Box0
		gunModel[75] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Import Box0
		gunModel[76] = new ModelRendererTurbo(this, 529, 161, textureX, textureY); // Import Box0
		gunModel[77] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Import Box0
		gunModel[78] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Import Box0
		gunModel[79] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Import Box0
		gunModel[80] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Import Box0
		gunModel[81] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Import Box0
		gunModel[82] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Import Box0
		gunModel[83] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Import Box0
		gunModel[84] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Import Box0
		gunModel[85] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Import Box0
		gunModel[86] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Import Box0
		gunModel[87] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Import Box0
		gunModel[88] = new ModelRendererTurbo(this, 961, 97, textureX, textureY); // Import Box0
		gunModel[89] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import Box0
		gunModel[90] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Import Box0
		gunModel[91] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import Box0
		gunModel[92] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Import Box0
		gunModel[93] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Import Box0
		gunModel[94] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[95] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Box0
		gunModel[96] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0
		gunModel[97] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		gunModel[98] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		gunModel[99] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[100] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box0
		gunModel[101] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[102] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		gunModel[103] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		gunModel[104] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box0
		gunModel[105] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[106] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box0
		gunModel[107] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		gunModel[108] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box0
		gunModel[109] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import Box0
		gunModel[110] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import Box0
		gunModel[111] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		gunModel[112] = new ModelRendererTurbo(this, 889, 105, textureX, textureY); // Import Box18
		gunModel[113] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Import Box18
		gunModel[114] = new ModelRendererTurbo(this, 681, 161, textureX, textureY); // Import Box18
		gunModel[115] = new ModelRendererTurbo(this, 721, 161, textureX, textureY); // Import Box18
		gunModel[116] = new ModelRendererTurbo(this, 761, 161, textureX, textureY); // Import Box18
		gunModel[117] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Import Box0
		gunModel[118] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Import Box0
		gunModel[119] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Import Box0
		gunModel[120] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Import Box0
		gunModel[121] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Import Box0
		gunModel[122] = new ModelRendererTurbo(this, 705, 161, textureX, textureY); // Import Box0
		gunModel[123] = new ModelRendererTurbo(this, 785, 161, textureX, textureY); // Import Box0
		gunModel[124] = new ModelRendererTurbo(this, 825, 161, textureX, textureY); // Import Box0
		gunModel[125] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); // Import Box0
		gunModel[126] = new ModelRendererTurbo(this, 745, 161, textureX, textureY); // Import Box18
		gunModel[127] = new ModelRendererTurbo(this, 905, 161, textureX, textureY); // Import Box18
		gunModel[128] = new ModelRendererTurbo(this, 945, 161, textureX, textureY); // Import Box18
		gunModel[129] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Import Box18
		gunModel[130] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Import Box18
		gunModel[131] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import Box18
		gunModel[132] = new ModelRendererTurbo(this, 977, 169, textureX, textureY); // Import Box18
		gunModel[133] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Import Box18
		gunModel[134] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Import Box18
		gunModel[135] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Import Box18
		gunModel[136] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Import Box18
		gunModel[137] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Import Box18
		gunModel[138] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Import Box18
		gunModel[139] = new ModelRendererTurbo(this, 513, 177, textureX, textureY); // Import Box18
		gunModel[140] = new ModelRendererTurbo(this, 553, 177, textureX, textureY); // Import Box18
		gunModel[141] = new ModelRendererTurbo(this, 593, 177, textureX, textureY); // Import Box18
		gunModel[142] = new ModelRendererTurbo(this, 633, 177, textureX, textureY); // Import Box18
		gunModel[143] = new ModelRendererTurbo(this, 785, 177, textureX, textureY); // Import Box18
		gunModel[144] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Import Box18
		gunModel[145] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Import Box18
		gunModel[146] = new ModelRendererTurbo(this, 321, 201, textureX, textureY); // Import Box18
		gunModel[147] = new ModelRendererTurbo(this, 929, 177, textureX, textureY); // Import Box18
		gunModel[148] = new ModelRendererTurbo(this, 385, 201, textureX, textureY); // Import Box18
		gunModel[149] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Import Box18
		gunModel[150] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Import Box18
		gunModel[151] = new ModelRendererTurbo(this, 657, 177, textureX, textureY); // Import Box18
		gunModel[152] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Import Box18
		gunModel[153] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Import Box18
		gunModel[154] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Import Box18
		gunModel[155] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Import Box18
		gunModel[156] = new ModelRendererTurbo(this, 529, 201, textureX, textureY); // Import Box18
		gunModel[157] = new ModelRendererTurbo(this, 585, 201, textureX, textureY); // Import Box18
		gunModel[158] = new ModelRendererTurbo(this, 641, 201, textureX, textureY); // Import Box18
		gunModel[159] = new ModelRendererTurbo(this, 809, 161, textureX, textureY); // Import Box18
		gunModel[160] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box18
		gunModel[161] = new ModelRendererTurbo(this, 705, 201, textureX, textureY); // Import Box18
		gunModel[162] = new ModelRendererTurbo(this, 849, 161, textureX, textureY); // Import Box18
		gunModel[163] = new ModelRendererTurbo(this, 889, 161, textureX, textureY); // Import Box18
		gunModel[164] = new ModelRendererTurbo(this, 753, 201, textureX, textureY); // Import Box18
		gunModel[165] = new ModelRendererTurbo(this, 1001, 169, textureX, textureY); // Import Box18
		gunModel[166] = new ModelRendererTurbo(this, 537, 177, textureX, textureY); // Import Box18
		gunModel[167] = new ModelRendererTurbo(this, 777, 201, textureX, textureY); // Import Box18
		gunModel[168] = new ModelRendererTurbo(this, 729, 201, textureX, textureY); // Import Box18
		gunModel[169] = new ModelRendererTurbo(this, 833, 201, textureX, textureY); // Import Box18
		gunModel[170] = new ModelRendererTurbo(this, 577, 177, textureX, textureY); // Import Box18
		gunModel[171] = new ModelRendererTurbo(this, 617, 177, textureX, textureY); // Import Box18
		gunModel[172] = new ModelRendererTurbo(this, 841, 177, textureX, textureY); // Import Box18
		gunModel[173] = new ModelRendererTurbo(this, 905, 201, textureX, textureY); // Import Box18
		gunModel[174] = new ModelRendererTurbo(this, 945, 201, textureX, textureY); // Import Box18
		gunModel[175] = new ModelRendererTurbo(this, 985, 201, textureX, textureY); // Import Box18
		gunModel[176] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Import Box18
		gunModel[177] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Import Box18
		gunModel[178] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Import Box0
		gunModel[179] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Import Box0
		gunModel[180] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Import Box0
		gunModel[181] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Import Box0
		gunModel[182] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import Box0
		gunModel[183] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box0
		gunModel[184] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box0
		gunModel[185] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Import Box0
		gunModel[186] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Import Box0
		gunModel[187] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box0
		gunModel[188] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Import Box0
		gunModel[189] = new ModelRendererTurbo(this, 641, 225, textureX, textureY); // Import Box0
		gunModel[190] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box0
		gunModel[191] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Import Box0
		gunModel[192] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import Box0
		gunModel[193] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import Box0
		gunModel[194] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import Box0
		gunModel[195] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import Box0
		gunModel[196] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Import Box0
		gunModel[197] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Import Box0
		gunModel[198] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Import Box0
		gunModel[199] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Import Box0
		gunModel[200] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import Box0
		gunModel[201] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Import Box0
		gunModel[202] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Import Box0
		gunModel[203] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Import Box0
		gunModel[204] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Import Box0
		gunModel[205] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Import Box0
		gunModel[206] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Import Box0
		gunModel[207] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Import Box0
		gunModel[208] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Import Box0
		gunModel[209] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Import Box0
		gunModel[210] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import Box0
		gunModel[211] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Import Box0
		gunModel[212] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Import Box0
		gunModel[213] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Import Box0
		gunModel[214] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Import Box0
		gunModel[215] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import Box0
		gunModel[216] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import Box0
		gunModel[217] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import Box0
		gunModel[218] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Import Box0
		gunModel[219] = new ModelRendererTurbo(this, 641, 65, textureX, textureY); // Import Box0
		gunModel[220] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Import Box0
		gunModel[221] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import Box0
		gunModel[222] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import Box0
		gunModel[223] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Import Box0
		gunModel[224] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Import Box0
		gunModel[225] = new ModelRendererTurbo(this, 929, 73, textureX, textureY); // Import Box0
		gunModel[226] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Import Box0
		gunModel[227] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Import Box0
		gunModel[228] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Import Box0
		gunModel[229] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Import Box0
		gunModel[230] = new ModelRendererTurbo(this, 689, 65, textureX, textureY); // Import Box0
		gunModel[231] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Import Box0
		gunModel[232] = new ModelRendererTurbo(this, 841, 89, textureX, textureY); // Import Box0
		gunModel[233] = new ModelRendererTurbo(this, 865, 89, textureX, textureY); // Import Box0
		gunModel[234] = new ModelRendererTurbo(this, 985, 97, textureX, textureY); // Import Box0
		gunModel[235] = new ModelRendererTurbo(this, 929, 121, textureX, textureY); // Import Box0
		gunModel[236] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Import Box0
		gunModel[237] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import Box0
		gunModel[238] = new ModelRendererTurbo(this, 593, 33, textureX, textureY); // Import Box0
		gunModel[239] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Import Box0
		gunModel[240] = new ModelRendererTurbo(this, 809, 201, textureX, textureY); // Import Box18
		gunModel[241] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Import Box18
		gunModel[242] = new ModelRendererTurbo(this, 881, 201, textureX, textureY); // Import Box18
		gunModel[243] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Import Box18
		gunModel[244] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Import Box18
		gunModel[245] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import Box18
		gunModel[246] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Import Box18
		gunModel[247] = new ModelRendererTurbo(this, 937, 217, textureX, textureY); // Import Box18
		gunModel[248] = new ModelRendererTurbo(this, 985, 217, textureX, textureY); // Import Box18
		gunModel[249] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Import Box18
		gunModel[250] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Import Box18
		gunModel[251] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Import Box18
		gunModel[252] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Import Box18
		gunModel[253] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Import Box18
		gunModel[254] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Import Box18
		gunModel[255] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Import Box18
		gunModel[256] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Import Box18
		gunModel[257] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Import Box18
		gunModel[258] = new ModelRendererTurbo(this, 777, 217, textureX, textureY); // Import Box18
		gunModel[259] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Import Box18
		gunModel[260] = new ModelRendererTurbo(this, 537, 225, textureX, textureY); // Import Box18
		gunModel[261] = new ModelRendererTurbo(this, 833, 225, textureX, textureY); // Import Box18
		gunModel[262] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import Box18
		gunModel[263] = new ModelRendererTurbo(this, 153, 233, textureX, textureY); // Import Box18
		gunModel[264] = new ModelRendererTurbo(this, 961, 177, textureX, textureY); // Import Box18
		gunModel[265] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Import Box18
		gunModel[266] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Import Box18
		gunModel[267] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Import Box18
		gunModel[268] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Import Box18
		gunModel[269] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Import Box18
		gunModel[270] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Import Box18
		gunModel[271] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Import Box0
		gunModel[272] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Import Box0
		gunModel[273] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Import Box0
		gunModel[274] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import Box0
		gunModel[275] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box0
		gunModel[276] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Import Box0
		gunModel[277] = new ModelRendererTurbo(this, 545, 49, textureX, textureY); // Import Box0
		gunModel[278] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box0
		gunModel[279] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box0
		gunModel[280] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Import Box0
		gunModel[281] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box0
		gunModel[282] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Import Box0
		gunModel[283] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Import Box0
		gunModel[284] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box0
		gunModel[285] = new ModelRendererTurbo(this, 985, 89, textureX, textureY); // Import Box0
		gunModel[286] = new ModelRendererTurbo(this, 521, 225, textureX, textureY); // Import Box0
		gunModel[287] = new ModelRendererTurbo(this, 737, 225, textureX, textureY); // Import Box0
		gunModel[288] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Import Box0
		gunModel[289] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Import Box0
		gunModel[290] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Import Box0
		gunModel[291] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Import Box0
		gunModel[292] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Import Box0
		gunModel[293] = new ModelRendererTurbo(this, 961, 97, textureX, textureY); // Import Box18
		gunModel[294] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box18
		gunModel[295] = new ModelRendererTurbo(this, 713, 65, textureX, textureY); // Import Box18
		gunModel[296] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Import Box18
		gunModel[297] = new ModelRendererTurbo(this, 913, 105, textureX, textureY); // Import Box18
		gunModel[298] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box18
		gunModel[299] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Import Box18
		gunModel[300] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Import Box18
		gunModel[301] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Import Box18
		gunModel[302] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Import Box18
		gunModel[303] = new ModelRendererTurbo(this, 745, 161, textureX, textureY); // Import Box18
		gunModel[304] = new ModelRendererTurbo(this, 785, 161, textureX, textureY); // Import Box18
		gunModel[305] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Import Box18
		gunModel[306] = new ModelRendererTurbo(this, 585, 49, textureX, textureY); // Import Box18
		gunModel[307] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Import Box18
		gunModel[308] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Import Box18
		gunModel[309] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Import Box18
		gunModel[310] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Import Box18
		gunModel[311] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Import Box18
		gunModel[312] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Import Box18
		gunModel[313] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Import Box18
		gunModel[314] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Import Box18
		gunModel[315] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Import Box18
		gunModel[316] = new ModelRendererTurbo(this, 593, 97, textureX, textureY); // Import Box18
		gunModel[317] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Import Box18
		gunModel[318] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Import Box18
		gunModel[319] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Import Box0
		gunModel[320] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Import Box0
		gunModel[321] = new ModelRendererTurbo(this, 713, 257, textureX, textureY); // Import Box0
		gunModel[322] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Import Box0
		gunModel[323] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Import Box0
		gunModel[324] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Import Box0
		gunModel[325] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Import Box0
		gunModel[326] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Import Box0
		gunModel[327] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); // Import Box0
		gunModel[328] = new ModelRendererTurbo(this, 825, 161, textureX, textureY); // Import Box0
		gunModel[329] = new ModelRendererTurbo(this, 705, 161, textureX, textureY); // Import Box0
		gunModel[330] = new ModelRendererTurbo(this, 929, 177, textureX, textureY); // Import Box0
		gunModel[331] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); // Import Box0
		gunModel[332] = new ModelRendererTurbo(this, 905, 161, textureX, textureY); // Import Box0
		gunModel[333] = new ModelRendererTurbo(this, 689, 185, textureX, textureY); // Import Box0
		gunModel[334] = new ModelRendererTurbo(this, 705, 185, textureX, textureY); // Import Box0
		gunModel[335] = new ModelRendererTurbo(this, 729, 185, textureX, textureY); // Import Box0
		gunModel[336] = new ModelRendererTurbo(this, 753, 185, textureX, textureY); // Import Box0
		gunModel[337] = new ModelRendererTurbo(this, 777, 185, textureX, textureY); // Import Box0
		gunModel[338] = new ModelRendererTurbo(this, 433, 201, textureX, textureY); // Import Box0
		gunModel[339] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Import Box0
		gunModel[340] = new ModelRendererTurbo(this, 1009, 185, textureX, textureY); // Import Box0
		gunModel[341] = new ModelRendererTurbo(this, 569, 201, textureX, textureY); // Import Box0
		gunModel[342] = new ModelRendererTurbo(this, 625, 201, textureX, textureY); // Import Box0
		gunModel[343] = new ModelRendererTurbo(this, 705, 169, textureX, textureY); // Import Box0
		gunModel[344] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import Box0
		gunModel[345] = new ModelRendererTurbo(this, 553, 177, textureX, textureY); // Import Box0
		gunModel[346] = new ModelRendererTurbo(this, 593, 177, textureX, textureY); // Import Box0
		gunModel[347] = new ModelRendererTurbo(this, 633, 177, textureX, textureY); // Import Box0
		gunModel[348] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Import Box0
		gunModel[349] = new ModelRendererTurbo(this, 977, 177, textureX, textureY); // Import Box0
		gunModel[350] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import Box0
		gunModel[351] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Import Box0
		gunModel[352] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Import Box0
		gunModel[353] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Import Box0
		gunModel[354] = new ModelRendererTurbo(this, 321, 201, textureX, textureY); // Import Box0
		gunModel[355] = new ModelRendererTurbo(this, 809, 161, textureX, textureY); // Import Box0
		gunModel[356] = new ModelRendererTurbo(this, 849, 161, textureX, textureY); // Import Box0
		gunModel[357] = new ModelRendererTurbo(this, 729, 161, textureX, textureY); // Import Box0
		gunModel[358] = new ModelRendererTurbo(this, 769, 161, textureX, textureY); // Import Box0
		gunModel[359] = new ModelRendererTurbo(this, 529, 201, textureX, textureY); // Import Box0
		gunModel[360] = new ModelRendererTurbo(this, 585, 201, textureX, textureY); // Import Box0
		gunModel[361] = new ModelRendererTurbo(this, 641, 201, textureX, textureY); // Import Box0
		gunModel[362] = new ModelRendererTurbo(this, 889, 161, textureX, textureY); // Import Box0
		gunModel[363] = new ModelRendererTurbo(this, 945, 161, textureX, textureY); // Import Box0
		gunModel[364] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box0
		gunModel[365] = new ModelRendererTurbo(this, 873, 257, textureX, textureY); // Import Box0
		gunModel[366] = new ModelRendererTurbo(this, 673, 273, textureX, textureY); // Import Box0
		gunModel[367] = new ModelRendererTurbo(this, 745, 273, textureX, textureY); // Import Box0
		gunModel[368] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Import Box0
		gunModel[369] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Import Box0
		gunModel[370] = new ModelRendererTurbo(this, 673, 249, textureX, textureY); // Import Box0
		gunModel[371] = new ModelRendererTurbo(this, 929, 201, textureX, textureY); // Import Box0
		gunModel[372] = new ModelRendererTurbo(this, 969, 201, textureX, textureY); // Import Box0
		gunModel[373] = new ModelRendererTurbo(this, 721, 241, textureX, textureY); // Import Box0
		gunModel[374] = new ModelRendererTurbo(this, 537, 249, textureX, textureY); // Import Box0
		gunModel[375] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Import Box0
		gunModel[376] = new ModelRendererTurbo(this, 33, 249, textureX, textureY); // Import Box0
		gunModel[377] = new ModelRendererTurbo(this, 449, 273, textureX, textureY); // Import Box0
		gunModel[378] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Import Box0
		gunModel[379] = new ModelRendererTurbo(this, 473, 281, textureX, textureY); // Import Box0
		gunModel[380] = new ModelRendererTurbo(this, 513, 281, textureX, textureY); // Import Box18
		gunModel[381] = new ModelRendererTurbo(this, 873, 281, textureX, textureY); // Import Box18
		gunModel[382] = new ModelRendererTurbo(this, 529, 289, textureX, textureY); // Import Box18
		gunModel[383] = new ModelRendererTurbo(this, 953, 289, textureX, textureY); // Import Box18
		gunModel[384] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Import Box18
		gunModel[385] = new ModelRendererTurbo(this, 785, 281, textureX, textureY); // Import Box18
		gunModel[386] = new ModelRendererTurbo(this, 81, 289, textureX, textureY); // Import Box18
		gunModel[387] = new ModelRendererTurbo(this, 449, 297, textureX, textureY); // Import Box18
		gunModel[388] = new ModelRendererTurbo(this, 577, 297, textureX, textureY); // Import Box18
		gunModel[389] = new ModelRendererTurbo(this, 657, 297, textureX, textureY); // Import Box18
		gunModel[390] = new ModelRendererTurbo(this, 697, 297, textureX, textureY); // Import Box18
		gunModel[391] = new ModelRendererTurbo(this, 121, 305, textureX, textureY); // Import Box18
		gunModel[392] = new ModelRendererTurbo(this, 193, 305, textureX, textureY); // Import Box18
		gunModel[393] = new ModelRendererTurbo(this, 257, 305, textureX, textureY); // Import Box18
		gunModel[394] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box18
		gunModel[395] = new ModelRendererTurbo(this, 529, 321, textureX, textureY); // Import Box18
		gunModel[396] = new ModelRendererTurbo(this, 825, 297, textureX, textureY); // Import Box18
		gunModel[397] = new ModelRendererTurbo(this, 737, 321, textureX, textureY); // Import Box18
		gunModel[398] = new ModelRendererTurbo(this, 49, 313, textureX, textureY); // Import Box18
		gunModel[399] = new ModelRendererTurbo(this, 193, 321, textureX, textureY); // Import Box18
		gunModel[400] = new ModelRendererTurbo(this, 97, 329, textureX, textureY); // Import Box18
		gunModel[401] = new ModelRendererTurbo(this, 513, 337, textureX, textureY); // Import Box18
		gunModel[402] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Import Box18
		gunModel[403] = new ModelRendererTurbo(this, 153, 329, textureX, textureY); // Import Box18
		gunModel[404] = new ModelRendererTurbo(this, 249, 329, textureX, textureY); // Import Box18
		gunModel[405] = new ModelRendererTurbo(this, 841, 297, textureX, textureY); // Import Box18
		gunModel[406] = new ModelRendererTurbo(this, 289, 329, textureX, textureY); // Import Box18
		gunModel[407] = new ModelRendererTurbo(this, 945, 329, textureX, textureY); // Import Box18
		gunModel[408] = new ModelRendererTurbo(this, 657, 337, textureX, textureY); // Import Box18
		gunModel[409] = new ModelRendererTurbo(this, 185, 345, textureX, textureY); // Import Box18
		gunModel[410] = new ModelRendererTurbo(this, 57, 337, textureX, textureY); // Import Box18
		gunModel[411] = new ModelRendererTurbo(this, 321, 345, textureX, textureY); // Import Box18
		gunModel[412] = new ModelRendererTurbo(this, 353, 345, textureX, textureY); // Import Box18
		gunModel[413] = new ModelRendererTurbo(this, 401, 345, textureX, textureY); // Import Box18
		gunModel[414] = new ModelRendererTurbo(this, 113, 361, textureX, textureY); // Import Box18
		gunModel[415] = new ModelRendererTurbo(this, 465, 353, textureX, textureY); // Import Box18
		gunModel[416] = new ModelRendererTurbo(this, 705, 345, textureX, textureY); // Import Box18
		gunModel[417] = new ModelRendererTurbo(this, 321, 305, textureX, textureY); // Import Box18
		gunModel[418] = new ModelRendererTurbo(this, 521, 361, textureX, textureY); // Import Box18
		gunModel[419] = new ModelRendererTurbo(this, 569, 361, textureX, textureY); // Import Box18
		gunModel[420] = new ModelRendererTurbo(this, 593, 361, textureX, textureY); // Import Box18
		gunModel[421] = new ModelRendererTurbo(this, 761, 361, textureX, textureY); // Import Box18
		gunModel[422] = new ModelRendererTurbo(this, 289, 369, textureX, textureY); // Import Box18
		gunModel[423] = new ModelRendererTurbo(this, 849, 369, textureX, textureY); // Import Box18
		gunModel[424] = new ModelRendererTurbo(this, 97, 385, textureX, textureY); // Import Box18
		gunModel[425] = new ModelRendererTurbo(this, 185, 369, textureX, textureY); // Import Box18
		gunModel[426] = new ModelRendererTurbo(this, 225, 369, textureX, textureY); // Import Box18
		gunModel[427] = new ModelRendererTurbo(this, 385, 369, textureX, textureY); // Import Box18
		gunModel[428] = new ModelRendererTurbo(this, 425, 369, textureX, textureY); // Import Box18
		gunModel[429] = new ModelRendererTurbo(this, 513, 305, textureX, textureY); // Import Box18
		gunModel[430] = new ModelRendererTurbo(this, 545, 369, textureX, textureY); // Import Box18
		gunModel[431] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Import Box18
		gunModel[432] = new ModelRendererTurbo(this, 201, 377, textureX, textureY); // Import Box18
		gunModel[433] = new ModelRendererTurbo(this, 673, 377, textureX, textureY); // Import Box18
		gunModel[434] = new ModelRendererTurbo(this, 401, 377, textureX, textureY); // Import Box18
		gunModel[435] = new ModelRendererTurbo(this, 241, 385, textureX, textureY); // Import Box18
		gunModel[436] = new ModelRendererTurbo(this, 521, 385, textureX, textureY); // Import Box18
		gunModel[437] = new ModelRendererTurbo(this, 545, 393, textureX, textureY); // Import Box18
		gunModel[438] = new ModelRendererTurbo(this, 737, 385, textureX, textureY); // Import Box18
		gunModel[439] = new ModelRendererTurbo(this, 761, 385, textureX, textureY); // Import Box18
		gunModel[440] = new ModelRendererTurbo(this, 929, 385, textureX, textureY); // Import Box18
		gunModel[441] = new ModelRendererTurbo(this, 385, 305, textureX, textureY); // Import Box18
		gunModel[442] = new ModelRendererTurbo(this, 769, 305, textureX, textureY); // Import Box18
		gunModel[443] = new ModelRendererTurbo(this, 873, 305, textureX, textureY); // Import Box18
		gunModel[444] = new ModelRendererTurbo(this, 801, 385, textureX, textureY); // Import Box18
		gunModel[445] = new ModelRendererTurbo(this, 961, 385, textureX, textureY); // Import Box18
		gunModel[446] = new ModelRendererTurbo(this, 849, 393, textureX, textureY); // Import Box18
		gunModel[447] = new ModelRendererTurbo(this, 41, 393, textureX, textureY); // Import Box18
		gunModel[448] = new ModelRendererTurbo(this, 889, 393, textureX, textureY); // Import Box18
		gunModel[449] = new ModelRendererTurbo(this, 177, 401, textureX, textureY); // Import Box18
		gunModel[450] = new ModelRendererTurbo(this, 369, 401, textureX, textureY); // Import Box18
		gunModel[451] = new ModelRendererTurbo(this, 417, 401, textureX, textureY); // Import Box18
		gunModel[452] = new ModelRendererTurbo(this, 673, 401, textureX, textureY); // Import Box18
		gunModel[453] = new ModelRendererTurbo(this, 825, 401, textureX, textureY); // Import Box0
		gunModel[454] = new ModelRendererTurbo(this, 969, 401, textureX, textureY); // Import Box0
		gunModel[455] = new ModelRendererTurbo(this, 89, 409, textureX, textureY); // Import Box0
		gunModel[456] = new ModelRendererTurbo(this, 137, 409, textureX, textureY); // Import Box0
		gunModel[457] = new ModelRendererTurbo(this, 209, 409, textureX, textureY); // Import Box0
		gunModel[458] = new ModelRendererTurbo(this, 257, 409, textureX, textureY); // Import Box0
		gunModel[459] = new ModelRendererTurbo(this, 281, 409, textureX, textureY); // Import Box18
		gunModel[460] = new ModelRendererTurbo(this, 337, 409, textureX, textureY); // Import Box18
		gunModel[461] = new ModelRendererTurbo(this, 449, 409, textureX, textureY); // Import Box18
		gunModel[462] = new ModelRendererTurbo(this, 113, 409, textureX, textureY); // Import Box18
		gunModel[463] = new ModelRendererTurbo(this, 233, 409, textureX, textureY); // Import Box18
		gunModel[464] = new ModelRendererTurbo(this, 481, 409, textureX, textureY); // Import Box18
		gunModel[465] = new ModelRendererTurbo(this, 929, 321, textureX, textureY); // Import Box18
		gunModel[466] = new ModelRendererTurbo(this, 937, 409, textureX, textureY); // Import Box18
		gunModel[467] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Import Box18
		gunModel[468] = new ModelRendererTurbo(this, 705, 401, textureX, textureY); // Import Box18
		gunModel[469] = new ModelRendererTurbo(this, 313, 409, textureX, textureY); // Import Box18
		gunModel[470] = new ModelRendererTurbo(this, 537, 417, textureX, textureY); // Import Box0
		gunModel[471] = new ModelRendererTurbo(this, 585, 417, textureX, textureY); // Import Box0
		gunModel[472] = new ModelRendererTurbo(this, 633, 417, textureX, textureY); // Import Box0
		gunModel[473] = new ModelRendererTurbo(this, 697, 417, textureX, textureY); // Import Box0
		gunModel[474] = new ModelRendererTurbo(this, 161, 425, textureX, textureY); // Import Box0
		gunModel[475] = new ModelRendererTurbo(this, 369, 425, textureX, textureY); // Import Box0
		gunModel[476] = new ModelRendererTurbo(this, 721, 417, textureX, textureY); // Import Box0
		gunModel[477] = new ModelRendererTurbo(this, 393, 425, textureX, textureY); // Import Box0
		gunModel[478] = new ModelRendererTurbo(this, 481, 425, textureX, textureY); // Import Box0
		gunModel[479] = new ModelRendererTurbo(this, 657, 425, textureX, textureY); // Import Box0
		gunModel[480] = new ModelRendererTurbo(this, 801, 425, textureX, textureY); // Import Box0
		gunModel[481] = new ModelRendererTurbo(this, 961, 425, textureX, textureY); // Import Box0
		gunModel[482] = new ModelRendererTurbo(this, 833, 425, textureX, textureY); // Import Box0
		gunModel[483] = new ModelRendererTurbo(this, 425, 433, textureX, textureY); // Import Box0
		gunModel[484] = new ModelRendererTurbo(this, 337, 441, textureX, textureY); // Import Box0
		gunModel[485] = new ModelRendererTurbo(this, 513, 441, textureX, textureY); // Import Box0
		gunModel[486] = new ModelRendererTurbo(this, 561, 441, textureX, textureY); // Import Box0
		gunModel[487] = new ModelRendererTurbo(this, 609, 441, textureX, textureY); // Import Box0

		gunModel[0].addBox(44F, -20F, -6F, 88, 5, 13, 0F); // Import Box0
		gunModel[0].setRotationPoint(-58F, -22F, 0F);

		gunModel[1].addShapeBox(44F, -20F, -6F, 1, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box0
		gunModel[1].setRotationPoint(30F, -22F, 0F);

		gunModel[2].addShapeBox(44F, -20F, -6F, 1, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F); // Import Box0
		gunModel[2].setRotationPoint(30F, -17F, 0F);

		gunModel[3].addShapeBox(44F, -20F, -6F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, -2F); // Import Box0
		gunModel[3].setRotationPoint(29F, -15F, 0F);

		gunModel[4].addShapeBox(44F, -20F, -6F, 3, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, -2F); // Import Box0
		gunModel[4].setRotationPoint(26F, -15F, 0F);

		gunModel[5].addShapeBox(44F, -20F, -6F, 1, 1, 13, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 1.5F, 0F, 0F); // Import Box0
		gunModel[5].setRotationPoint(25F, -15F, 0F);

		gunModel[6].addShapeBox(44F, -20F, -6F, 1, 1, 13, 0F,-0.5F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, -0.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 1F, 0F, 0F); // Import Box0
		gunModel[6].setRotationPoint(23F, -14F, 0F);

		gunModel[7].addShapeBox(44F, -20F, -6F, 1, 2, 13, 0F,0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 1.5F, 0F, 0F); // Import Box0
		gunModel[7].setRotationPoint(22F, -13F, 0F);

		gunModel[8].addShapeBox(44F, -20F, -6F, 88, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[8].setRotationPoint(-58F, -17F, 0F);

		gunModel[9].addShapeBox(44F, -20F, -6F, 82, 1, 13, 0F,0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[9].setRotationPoint(-58F, -15F, 0F);

		gunModel[10].addShapeBox(44F, -20F, -6F, 80, 1, 13, 0F,1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[10].setRotationPoint(-57F, -14F, 0F);

		gunModel[11].addShapeBox(44F, -20F, -6F, 80, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[11].setRotationPoint(-58F, -13F, 0F);

		gunModel[12].addShapeBox(44F, -20F, -6F, 1, 2, 13, 0F,0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F); // Import Box0
		gunModel[12].setRotationPoint(20.5F, -11F, 0F);

		gunModel[13].addShapeBox(44F, -20F, -6F, 1, 10, 13, 0F,0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F); // Import Box0
		gunModel[13].setRotationPoint(20.5F, -9F, 0F);

		gunModel[14].addShapeBox(44F, -20F, -6F, 35, 10, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 9F, 0F); // Import Box0
		gunModel[14].setRotationPoint(-15F, -9F, 0F);

		gunModel[15].addShapeBox(44F, -20F, -6F, 78, 2, 13, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[15].setRotationPoint(-57.5F, -11F, 0F);

		gunModel[16].addShapeBox(44F, -20F, -6F, 35, 2, 15, 0F,0F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, 5.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 5.5F, 0F); // Import Box0
		gunModel[16].setRotationPoint(-15F, 4F, -1F);

		gunModel[17].addShapeBox(44F, -20F, -6F, 35, 1, 15, 0F,0F, -6.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6.5F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Import Box0
		gunModel[17].setRotationPoint(-15F, 5F, -1F);

		gunModel[18].addShapeBox(44F, -20F, -6F, 2, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		gunModel[18].setRotationPoint(-17F, -1F, 0F);

		gunModel[19].addShapeBox(44F, -20F, -6F, 4, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		gunModel[19].setRotationPoint(-19F, -2F, 0F);

		gunModel[20].addShapeBox(44F, -20F, -6F, 43, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[20].setRotationPoint(-58F, -9F, 0F);

		gunModel[21].addShapeBox(44F, -20F, -6F, 19, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box18
		gunModel[21].setRotationPoint(-58F, -2F, 0F);

		gunModel[22].addBox(44F, -20F, -6F, 16, 9, 13, 0F); // Import Box0
		gunModel[22].setRotationPoint(-74F, -22F, 0F);

		gunModel[23].addShapeBox(44F, -20F, -6F, 2, 3, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Import Box18
		gunModel[23].setRotationPoint(-17F, 9F, 2F);

		gunModel[24].addShapeBox(44F, -20F, -6F, 2, 3, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Import Box18
		gunModel[24].setRotationPoint(-19F, 11F, 2F);

		gunModel[25].addShapeBox(44F, -20F, -6F, 25, 3, 9, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box18
		gunModel[25].setRotationPoint(-44F, 11F, 2F);

		gunModel[26].addShapeBox(44F, -20F, -6F, 1, 3, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[26].setRotationPoint(-42F, 9F, 2F);

		gunModel[27].addShapeBox(44F, -20F, -6F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[27].setRotationPoint(-41F, 11F, 2F);

		gunModel[28].addShapeBox(44F, -20F, -6F, 2, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[28].setRotationPoint(-44F, 1F, 2F);

		gunModel[29].addShapeBox(44F, -20F, -6F, 2, 2, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[29].setRotationPoint(-42F, -1F, 2F);

		gunModel[30].addShapeBox(44F, -20F, -6F, 2, 2, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[30].setRotationPoint(-44F, -1F, 2F);

		gunModel[31].addShapeBox(44F, -20F, -6F, 1, 2, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box18
		gunModel[31].setRotationPoint(-45F, -1F, 2F);

		gunModel[32].addShapeBox(44F, -20F, -6F, 2, 1, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0F); // Import Box18
		gunModel[32].setRotationPoint(-47F, -1F, 2F);

		gunModel[33].addShapeBox(44F, -20F, -6F, 9, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[33].setRotationPoint(-36F, -2F, 5F);

		gunModel[34].addShapeBox(44F, -20F, -6F, 6, 2, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F); // Import Box18
		gunModel[34].setRotationPoint(-35F, -1F, 5F);

		gunModel[35].addShapeBox(44F, -20F, -6F, 4, 2, 3, 0F,1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Import Box18
		gunModel[35].setRotationPoint(-35F, 1F, 5F);

		gunModel[36].addShapeBox(44F, -20F, -6F, 4, 3, 3, 0F,1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Import Box18
		gunModel[36].setRotationPoint(-35F, 3F, 5F);

		gunModel[37].addShapeBox(44F, -20F, -6F, 4, 2, 3, 0F,1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[37].setRotationPoint(-35F, 6F, 5F);

		gunModel[38].addShapeBox(44F, -20F, -6F, 4, 2, 3, 0F,1F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F); // Import Box18
		gunModel[38].setRotationPoint(-34F, 8F, 5F);

		gunModel[39].addShapeBox(44F, -20F, -6F, 4, 1, 3, 0F,0.75F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, -0.25F, 0F, 0F); // Import Box18
		gunModel[39].setRotationPoint(-33F, 10F, 5F);

		gunModel[40].addShapeBox(44F, -20F, -6F, 1, 2, 13, 0F,0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, -0.5F, 0F, 0F); // Import Box0
		gunModel[40].setRotationPoint(20.5F, 1F, 0F);

		gunModel[41].addShapeBox(44F, -20F, -6F, 1, 1, 13, 0F,0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F); // Import Box0
		gunModel[41].setRotationPoint(21.5F, 3F, 0F);

		gunModel[42].addShapeBox(44F, -20F, -6F, 1, 2, 13, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[42].setRotationPoint(20F, 1F, 0F);

		gunModel[43].addShapeBox(44F, -20F, -6F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[43].setRotationPoint(20F, 3F, 0F);

		gunModel[44].addShapeBox(44F, -20F, -6F, 1, 1, 15, 0F,0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F); // Import Box0
		gunModel[44].setRotationPoint(20F, 5F, -1F);

		gunModel[45].addShapeBox(44F, -20F, -6F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 1F); // Import Box0
		gunModel[45].setRotationPoint(20F, 4F, 0F);

		gunModel[46].addShapeBox(44F, -20F, -6F, 1, 1, 13, 0F,0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0.1F, 0.2F, 0.5F, -0.5F, -2F, 0.5F, -0.5F, -2F, 0F, 0.1F, 0.2F); // Import Box0
		gunModel[46].setRotationPoint(21F, 4F, 0F);

		gunModel[47].addShapeBox(44F, -20F, -6F, 1, 1, 13, 0F,0F, -0.5F, 0.25F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0.5F, -1F, -2F, 0.5F, -1F, -2F, 0F, 0F, 0.25F); // Import Box0
		gunModel[47].setRotationPoint(21F, 4.5F, 0F);

		gunModel[48].addBox(44F, -20F, -6F, 52, 11, 17, 0F); // Import Box0
		gunModel[48].setRotationPoint(-77F, -34F, -2F);

		gunModel[49].addShapeBox(44F, -20F, -6F, 195, 3, 17, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[49].setRotationPoint(-77F, -37F, -2F);

		gunModel[50].addShapeBox(44F, -20F, -6F, 110, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[50].setRotationPoint(-77F, -23F, -2F);

		gunModel[51].addShapeBox(44F, -20F, -6F, 195, 2, 15, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[51].setRotationPoint(-77F, -39F, -1F);

		gunModel[52].addShapeBox(44F, -20F, -6F, 139, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[52].setRotationPoint(36F, -23F, -1.5F);

		gunModel[53].addShapeBox(44F, -20F, -6F, 139, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[53].setRotationPoint(36F, -18.5F, 3F);

		gunModel[54].addShapeBox(44F, -20F, -6F, 139, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[54].setRotationPoint(36F, -16.5F, 1.5F);

		gunModel[55].addShapeBox(44F, -20F, -6F, 139, 1, 11, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F); // Import Box0
		gunModel[55].setRotationPoint(36F, -20F, 1F);

		gunModel[56].addShapeBox(44F, -20F, -6F, 139, 2, 14, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[56].setRotationPoint(36F, -22F, -0.5F);

		gunModel[57].addShapeBox(44F, -20F, -6F, 139, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[57].setRotationPoint(36F, -15.5F, 1.5F);

		gunModel[58].addShapeBox(44F, -20F, -6F, 61, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[58].setRotationPoint(-77F, -47F, 1.5F);

		gunModel[59].addShapeBox(44F, -20F, -6F, 14, 8, 10, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box0
		gunModel[59].setRotationPoint(104F, -47F, 1.5F);

		gunModel[60].addShapeBox(44F, -20F, -6F, 46, 3, 10, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[60].setRotationPoint(58F, -47F, 1.5F);

		gunModel[61].addShapeBox(44F, -20F, -6F, 46, 4, 10, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[61].setRotationPoint(58F, -43.5F, 1.5F);

		gunModel[62].addShapeBox(44F, -20F, -6F, 74, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[62].setRotationPoint(-16F, -47F, 1.5F);

		gunModel[63].addShapeBox(44F, -20F, -6F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[63].setRotationPoint(-16F, -44.5F, 1.5F);

		gunModel[64].addShapeBox(44F, -20F, -6F, 1, 1, 10, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[64].setRotationPoint(-16F, -40.5F, 1.5F);

		gunModel[65].addShapeBox(44F, -20F, -6F, 195, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box0
		gunModel[65].setRotationPoint(-77F, -39.5F, 1.5F);

		gunModel[66].addShapeBox(44F, -20F, -6F, 66, 1, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[66].setRotationPoint(-13F, -40.5F, 1.5F);

		gunModel[67].addShapeBox(44F, -20F, -6F, 75, 5, 7, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import Box0
		gunModel[67].setRotationPoint(-16.25F, -44.5F, 3F);

		gunModel[68].addShapeBox(44F, -20F, -6F, 1, 1, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[68].setRotationPoint(57F, -40.5F, 1.5F);

		gunModel[69].addShapeBox(44F, -20F, -6F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[69].setRotationPoint(57F, -44.5F, 1.5F);

		gunModel[70].addShapeBox(44F, -20F, -6F, 66, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[70].setRotationPoint(-13F, -44.5F, 1.5F);

		gunModel[71].addShapeBox(44F, -20F, -6F, 251, 3, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[71].setRotationPoint(-77F, -49.5F, 2.5F);

		gunModel[72].addShapeBox(44F, -20F, -6F, 251, 1, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[72].setRotationPoint(-77F, -50F, 1F);

		gunModel[73].addShapeBox(44F, -20F, -6F, 251, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[73].setRotationPoint(-77F, -51F, 1F);

		gunModel[74].addShapeBox(44F, -20F, -6F, 251, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[74].setRotationPoint(-77F, -47.5F, 10.5F);

		gunModel[75].addShapeBox(44F, -20F, -6F, 251, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[75].setRotationPoint(-77F, -47.5F, 1.5F);

		gunModel[76].addShapeBox(44F, -20F, -6F, 74, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[76].setRotationPoint(159F, -31F, 3F);

		gunModel[77].addShapeBox(44F, -20F, -6F, 2, 7, 7, 0F,0F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 0F, 0F); // Import Box0
		gunModel[77].setRotationPoint(233F, -31F, 3F);

		gunModel[78].addShapeBox(44F, -20F, -6F, 3, 7, 7, 0F,0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F); // Import Box0
		gunModel[78].setRotationPoint(235F, -31F, 3F);

		gunModel[79].addShapeBox(44F, -20F, -6F, 1, 7, 7, 0F,0F, 1.5F, 1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1.5F, 1.5F); // Import Box0
		gunModel[79].setRotationPoint(238F, -31F, 3F);

		gunModel[80].addShapeBox(44F, -20F, -6F, 9, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[80].setRotationPoint(239F, -32F, 2F);

		gunModel[81].addShapeBox(44F, -20F, -6F, 17, 6, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[81].setRotationPoint(248F, -29F, 2F);

		gunModel[82].addShapeBox(44F, -20F, -6F, 17, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[82].setRotationPoint(248F, -32F, 2F);

		gunModel[83].addShapeBox(44F, -20F, -6F, 17, 6, 4, 0F,0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[83].setRotationPoint(248F, -29F, 7F);

		gunModel[84].addShapeBox(44F, -20F, -6F, 3, 1, 11, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[84].setRotationPoint(109F, -45F, 1F);

		gunModel[85].addShapeBox(44F, -20F, -6F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[85].setRotationPoint(109F, -43F, 1F);

		gunModel[86].addShapeBox(44F, -20F, -6F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[86].setRotationPoint(109F, -44F, 1F);

		gunModel[87].addShapeBox(44F, -20F, -6F, 1, 3, 17, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[87].setRotationPoint(174F, -37F, -2F);

		gunModel[88].addShapeBox(44F, -20F, -6F, 1, 2, 15, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[88].setRotationPoint(174F, -39F, -1F);

		gunModel[89].addShapeBox(44F, -20F, -6F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box0
		gunModel[89].setRotationPoint(174F, -39.5F, 1.5F);

		gunModel[90].addShapeBox(44F, -20F, -6F, 1, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[90].setRotationPoint(174F, -47F, 1.5F);

		gunModel[91].addShapeBox(44F, -20F, -6F, 1, 3, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[91].setRotationPoint(174F, -49.5F, 2.5F);

		gunModel[92].addShapeBox(44F, -20F, -6F, 1, 1, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[92].setRotationPoint(174F, -50F, 1F);

		gunModel[93].addShapeBox(44F, -20F, -6F, 1, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[93].setRotationPoint(174F, -51F, 1F);

		gunModel[94].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[94].setRotationPoint(174F, -47.5F, 10.5F);

		gunModel[95].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[95].setRotationPoint(174F, -47.5F, 1.5F);

		gunModel[96].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[96].setRotationPoint(171.5F, -45.25F, 14.5F);

		gunModel[97].addShapeBox(44F, -20F, -6F, 2, 3, 1, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F); // Import Box0
		gunModel[97].setRotationPoint(171.5F, -45F, 13.5F);

		gunModel[98].addShapeBox(44F, -20F, -6F, 2, 2, 3, 0F,-0.5F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box0
		gunModel[98].setRotationPoint(171.5F, -42F, 12F);

		gunModel[99].addShapeBox(44F, -20F, -6F, 2, 2, 2, 0F,-0.5F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[99].setRotationPoint(171.5F, -40.5F, 11.5F);

		gunModel[100].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Import Box0
		gunModel[100].setRotationPoint(171.5F, -45.25F, 12.75F);

		gunModel[101].addShapeBox(44F, -20F, -6F, 2, 1, 4, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F); // Import Box0
		gunModel[101].setRotationPoint(171.5F, -46.5F, 10F);

		gunModel[102].addShapeBox(44F, -20F, -6F, 2, 2, 3, 0F,-0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Import Box0
		gunModel[102].setRotationPoint(171.5F, -42F, 10.25F);

		gunModel[103].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Import Box0
		gunModel[103].setRotationPoint(171.5F, -45.25F, 11.5F);

		gunModel[104].addShapeBox(44F, -20F, -6F, 2, 2, 2, 0F,-0.5F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, -0.5F, 0F, 0.75F); // Import Box0
		gunModel[104].setRotationPoint(171.5F, -40.5F, -0.5F);

		gunModel[105].addShapeBox(44F, -20F, -6F, 2, 2, 3, 0F,-0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Import Box0
		gunModel[105].setRotationPoint(171.5F, -42F, -2F);

		gunModel[106].addShapeBox(44F, -20F, -6F, 2, 3, 1, 0F,-0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F); // Import Box0
		gunModel[106].setRotationPoint(171.5F, -45F, -2.5F);

		gunModel[107].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Import Box0
		gunModel[107].setRotationPoint(171.5F, -45.25F, -0.75F);

		gunModel[108].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box0
		gunModel[108].setRotationPoint(171.5F, -45.25F, -2.5F);

		gunModel[109].addShapeBox(44F, -20F, -6F, 2, 1, 4, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F); // Import Box0
		gunModel[109].setRotationPoint(171.5F, -46.5F, -1F);

		gunModel[110].addShapeBox(44F, -20F, -6F, 2, 2, 3, 0F,-0.5F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box0
		gunModel[110].setRotationPoint(171.5F, -42F, -0.25F);

		gunModel[111].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Import Box0
		gunModel[111].setRotationPoint(171.5F, -45.25F, 0.5F);

		gunModel[112].addShapeBox(44F, -20F, -6F, 2, 6, 16, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[112].setRotationPoint(-44F, -16F, -1.5F);

		gunModel[113].addShapeBox(44F, -20F, -6F, 2, 6, 16, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box18
		gunModel[113].setRotationPoint(-48F, -16F, -1.5F);

		gunModel[114].addShapeBox(44F, -20F, -6F, 2, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[114].setRotationPoint(-46F, -16F, -1.5F);

		gunModel[115].addShapeBox(44F, -20F, -6F, 2, 1, 16, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[115].setRotationPoint(-46F, -17F, -1.5F);

		gunModel[116].addShapeBox(44F, -20F, -6F, 2, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[116].setRotationPoint(-46F, -10F, -1.5F);

		gunModel[117].addShapeBox(44F, -20F, -6F, 3, 1, 14, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[117].setRotationPoint(-36.5F, -7.5F, -0.5F);

		gunModel[118].addShapeBox(44F, -20F, -6F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[118].setRotationPoint(-36.5F, -5.5F, -0.5F);

		gunModel[119].addShapeBox(44F, -20F, -6F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[119].setRotationPoint(-36.5F, -6.5F, -0.5F);

		gunModel[120].addShapeBox(44F, -20F, -6F, 3, 1, 12, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[120].setRotationPoint(-26F, -14.5F, 1.5F);

		gunModel[121].addShapeBox(44F, -20F, -6F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[121].setRotationPoint(-26F, -12.5F, 1.5F);

		gunModel[122].addShapeBox(44F, -20F, -6F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[122].setRotationPoint(-26F, -13.5F, 1.5F);

		gunModel[123].addShapeBox(44F, -20F, -6F, 3, 1, 14, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[123].setRotationPoint(-52.5F, -20F, -0.5F);

		gunModel[124].addShapeBox(44F, -20F, -6F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[124].setRotationPoint(-52.5F, -18F, -0.5F);

		gunModel[125].addShapeBox(44F, -20F, -6F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[125].setRotationPoint(-52.5F, -19F, -0.5F);

		gunModel[126].addShapeBox(44F, -20F, -6F, 2, 1, 13, 0F,0F, -0.75F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box18
		gunModel[126].setRotationPoint(-47F, -2F, 0F);

		gunModel[127].addShapeBox(44F, -20F, -6F, 11, 1, 13, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box18
		gunModel[127].setRotationPoint(-58F, -2F, 0F);

		gunModel[128].addShapeBox(44F, -20F, -6F, 11, 1, 9, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box18
		gunModel[128].setRotationPoint(-58F, -2.5F, 2F);

		gunModel[129].addShapeBox(44F, -20F, -6F, 1, 2, 13, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box18
		gunModel[129].setRotationPoint(-45F, -0.5F, 0F);

		gunModel[130].addShapeBox(44F, -20F, -6F, 1, 13, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box18
		gunModel[130].setRotationPoint(-45F, 1F, 0F);

		gunModel[131].addShapeBox(44F, -20F, -6F, 13, 15, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[131].setRotationPoint(-58F, -0.5F, 0F);

		gunModel[132].addShapeBox(44F, -20F, -6F, 3, 5, 13, 0F,0F, 0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box18
		gunModel[132].setRotationPoint(-61F, -1F, 0F);

		gunModel[133].addShapeBox(44F, -20F, -6F, 1, 5, 9, 0F,0F, 0.25F, -3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box18
		gunModel[133].setRotationPoint(-62F, -1F, 2F);

		gunModel[134].addShapeBox(44F, -20F, -6F, 3, 35, 13, 0F,0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 24F, 0F, -2F, -24F, 0F, 0F, -24F, 0F, 0F, 24F, 0F, -2F); // Import Box18
		gunModel[134].setRotationPoint(-61F, 4.5F, 0F);

		gunModel[135].addShapeBox(44F, -20F, -6F, 1, 35, 9, 0F,0F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 24F, 0F, -3F, -24F, 0F, 0F, -24F, 0F, 0F, 24F, 0F, -3F); // Import Box18
		gunModel[135].setRotationPoint(-62F, 4.5F, 2F);

		gunModel[136].addShapeBox(44F, -20F, -6F, 7, 10, 13, 0F,-7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -7F, 0.5F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F); // Import Box18
		gunModel[136].setRotationPoint(-65F, 4.5F, 0F);

		gunModel[137].addShapeBox(44F, -20F, -6F, 3, 24, 13, 0F,-2F, 0F, 0F, 3F, 0F, -2F, 3F, 0F, -2F, -2F, 0F, 0F, 11F, 0F, 0F, -10F, 0F, -2F, -10F, 0F, -2F, 11F, 0F, 0F); // Import Box18
		gunModel[137].setRotationPoint(-51.5F, 14.5F, 0F);

		gunModel[138].addShapeBox(44F, -20F, -6F, 3, 24, 13, 0F,-2.4F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, -2.4F, 0F, 0F, 13.85F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 13.85F, 0F, 0F); // Import Box18
		gunModel[138].setRotationPoint(-67.5F, 14.5F, 0F);

		gunModel[139].addShapeBox(44F, -20F, -6F, 4, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box18
		gunModel[139].setRotationPoint(-62.5F, 38.5F, 0F);

		gunModel[140].addShapeBox(44F, -20F, -6F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F); // Import Box18
		gunModel[140].setRotationPoint(-62.5F, 39.5F, 0F);

		gunModel[141].addShapeBox(44F, -20F, -6F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box18
		gunModel[141].setRotationPoint(-60.5F, 41.5F, 0F);

		gunModel[142].addShapeBox(44F, -20F, -6F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F); // Import Box18
		gunModel[142].setRotationPoint(-60.5F, 43.5F, 0F);

		gunModel[143].addShapeBox(44F, -20F, -6F, 21, 2, 13, 0F,-1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, -4.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4.5F, 0F); // Import Box18
		gunModel[143].setRotationPoint(-81.5F, 43.5F, 0F);

		gunModel[144].addShapeBox(44F, -20F, -6F, 20, 2, 13, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Import Box18
		gunModel[144].setRotationPoint(-80.5F, 41.5F, 0F);

		gunModel[145].addShapeBox(44F, -20F, -6F, 20, 2, 13, 0F,0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box18
		gunModel[145].setRotationPoint(-80.5F, 39.5F, 0F);

		gunModel[146].addShapeBox(44F, -20F, -6F, 18, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box18
		gunModel[146].setRotationPoint(-80.5F, 38.5F, 0F);

		gunModel[147].addShapeBox(44F, -20F, -6F, 2, 2, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F); // Import Box18
		gunModel[147].setRotationPoint(-82.5F, 39.5F, 0F);

		gunModel[148].addShapeBox(44F, -20F, -6F, 3, 2, 13, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, -2F); // Import Box18
		gunModel[148].setRotationPoint(-85F, 39.5F, 0F);

		gunModel[149].addShapeBox(44F, -20F, -6F, 1, 2, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -3F); // Import Box18
		gunModel[149].setRotationPoint(-86F, 39.5F, 2F);

		gunModel[150].addShapeBox(44F, -20F, -6F, 1, 1, 13, 0F,-0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box18
		gunModel[150].setRotationPoint(-81.5F, 38.5F, 0F);

		gunModel[151].addShapeBox(44F, -20F, -6F, 6, 2, 9, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[151].setRotationPoint(-52.5F, 21F, 2F);

		gunModel[152].addShapeBox(44F, -20F, -6F, 6, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[152].setRotationPoint(-52.5F, 23F, 2F);

		gunModel[153].addShapeBox(44F, -20F, -6F, 6, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[153].setRotationPoint(-52.5F, 25F, 2F);

		gunModel[154].addShapeBox(44F, -20F, -6F, 4, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[154].setRotationPoint(-52.5F, 26F, 2F);

		gunModel[155].addShapeBox(44F, -20F, -6F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[155].setRotationPoint(-49.5F, 20F, 2F);

		gunModel[156].addShapeBox(44F, -20F, -6F, 11, 4, 14, 0F,-5F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[156].setRotationPoint(-62F, 8.5F, -0.5F);

		gunModel[157].addShapeBox(44F, -20F, -6F, 11, 21, 14, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 14F, 0F, 0F); // Import Box18
		gunModel[157].setRotationPoint(-62F, 12.5F, -0.5F);

		gunModel[158].addShapeBox(44F, -20F, -6F, 16, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, -2F, 0F); // Import Box18
		gunModel[158].setRotationPoint(-76F, 33.5F, -0.5F);

		gunModel[159].addShapeBox(44F, -20F, -6F, 3, 1, 9, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F); // Import Box18
		gunModel[159].setRotationPoint(-61F, -2.5F, 2F);

		gunModel[160].addShapeBox(44F, -20F, -6F, 1, 1, 5, 0F,-0.25F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, -1F, -2F, -0.25F, 0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, -2F); // Import Box18
		gunModel[160].setRotationPoint(-62F, -2.5F, 4F);

		gunModel[161].addShapeBox(44F, -20F, -6F, 3, 3, 17, 0F,0.5F, 0F, -4F, -1.5F, 0F, -2F, -1.5F, 0F, -2F, 0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -4F); // Import Box18
		gunModel[161].setRotationPoint(-61F, -4.5F, -2F);

		gunModel[162].addShapeBox(44F, -20F, -6F, 1, 3, 9, 0F,0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -3F, -0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -3F); // Import Box18
		gunModel[162].setRotationPoint(-62F, -4.5F, 2F);

		gunModel[163].addShapeBox(44F, -20F, -6F, 1, 2, 9, 0F,1F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -3F, -0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -3F); // Import Box18
		gunModel[163].setRotationPoint(-63F, -6.5F, 2F);

		gunModel[164].addShapeBox(44F, -20F, -6F, 3, 2, 17, 0F,1F, 0F, -4F, -2F, 0F, -2F, -2F, 0F, -2F, 1F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -4F); // Import Box18
		gunModel[164].setRotationPoint(-62F, -6.5F, -2F);

		gunModel[165].addShapeBox(44F, -20F, -6F, 1, 1, 9, 0F,2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -3F, -0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -3F); // Import Box18
		gunModel[165].setRotationPoint(-64.5F, -7.5F, 2F);

		gunModel[166].addShapeBox(44F, -20F, -6F, 2, 1, 9, 0F,2F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, -0.5F, 0F, 0F); // Import Box18
		gunModel[166].setRotationPoint(-63.5F, -7.5F, 2F);

		gunModel[167].addShapeBox(44F, -20F, -6F, 11, 2, 13, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box18
		gunModel[167].setRotationPoint(-76.5F, -10.5F, 0F);

		gunModel[168].addShapeBox(44F, -20F, -6F, 10, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box18
		gunModel[168].setRotationPoint(-76.5F, -8.5F, 2F);

		gunModel[169].addShapeBox(44F, -20F, -6F, 19, 3, 13, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[169].setRotationPoint(-76.5F, -13.5F, 0F);

		gunModel[170].addShapeBox(44F, -20F, -6F, 2, 1, 9, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F); // Import Box18
		gunModel[170].setRotationPoint(-67F, -8.5F, 2F);

		gunModel[171].addShapeBox(44F, -20F, -6F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box18
		gunModel[171].setRotationPoint(-65.5F, -8.5F, 2F);

		gunModel[172].addShapeBox(44F, -20F, -6F, 2, 2, 9, 0F,2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box18
		gunModel[172].setRotationPoint(-65.5F, -10.5F, 2F);

		gunModel[173].addShapeBox(44F, -20F, -6F, 5, 3, 13, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[173].setRotationPoint(-63.5F, -10.5F, 0F);

		gunModel[174].addShapeBox(44F, -20F, -6F, 5, 1, 13, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F); // Import Box18
		gunModel[174].setRotationPoint(-63.5F, -7.5F, 0F);

		gunModel[175].addShapeBox(44F, -20F, -6F, 3, 2, 13, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		gunModel[175].setRotationPoint(-61.5F, -6.5F, 0F);

		gunModel[176].addShapeBox(44F, -20F, -6F, 3, 3, 13, 0F,-2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F); // Import Box18
		gunModel[176].setRotationPoint(-61.5F, -4.5F, 0F);

		gunModel[177].addShapeBox(44F, -20F, -6F, 2, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		gunModel[177].setRotationPoint(-65.5F, -10.5F, 0F);

		gunModel[178].addShapeBox(44F, -20F, -6F, 51, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[178].setRotationPoint(118F, -33F, 15.5F);

		gunModel[179].addShapeBox(44F, -20F, -6F, 1, 10, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[179].setRotationPoint(117F, -33F, 15.5F);

		gunModel[180].addShapeBox(44F, -20F, -6F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[180].setRotationPoint(169F, -33F, 15.5F);

		gunModel[181].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[181].setRotationPoint(163F, -29.5F, 16F);

		gunModel[182].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[182].setRotationPoint(163F, -27.5F, 16F);

		gunModel[183].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[183].setRotationPoint(163F, -28.5F, 16F);

		gunModel[184].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[184].setRotationPoint(121F, -29.5F, 16F);

		gunModel[185].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[185].setRotationPoint(121F, -27.5F, 16F);

		gunModel[186].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[186].setRotationPoint(121F, -28.5F, 16F);

		gunModel[187].addShapeBox(44F, -20F, -6F, 45, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[187].setRotationPoint(121F, -31F, 14.5F);

		gunModel[188].addShapeBox(44F, -20F, -6F, 45, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[188].setRotationPoint(121F, -31F, -2.5F);

		gunModel[189].addShapeBox(44F, -20F, -6F, 51, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[189].setRotationPoint(118F, -33F, -4.5F);

		gunModel[190].addShapeBox(44F, -20F, -6F, 1, 10, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[190].setRotationPoint(117F, -33F, -4.5F);

		gunModel[191].addShapeBox(44F, -20F, -6F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[191].setRotationPoint(169F, -33F, -4.5F);

		gunModel[192].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[192].setRotationPoint(163F, -29.5F, -5F);

		gunModel[193].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[193].setRotationPoint(163F, -27.5F, -5F);

		gunModel[194].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[194].setRotationPoint(163F, -28.5F, -5F);

		gunModel[195].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[195].setRotationPoint(121F, -29.5F, -5F);

		gunModel[196].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[196].setRotationPoint(121F, -27.5F, -5F);

		gunModel[197].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[197].setRotationPoint(121F, -28.5F, -5F);

		gunModel[198].addShapeBox(44F, -20F, -6F, 20, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[198].setRotationPoint(25F, -31.5F, 14.5F);

		gunModel[199].addShapeBox(44F, -20F, -6F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box0
		gunModel[199].setRotationPoint(22F, -31.5F, 14.5F);

		gunModel[200].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[200].setRotationPoint(21F, -29.5F, 14.5F);

		gunModel[201].addShapeBox(44F, -20F, -6F, 2, 3, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box0
		gunModel[201].setRotationPoint(45F, -30.5F, 14.5F);

		gunModel[202].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box0
		gunModel[202].setRotationPoint(47F, -29.5F, 14.5F);

		gunModel[203].addShapeBox(44F, -20F, -6F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box0
		gunModel[203].setRotationPoint(48F, -29.5F, 14.5F);

		gunModel[204].addShapeBox(44F, -20F, -6F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F); // Import Box0
		gunModel[204].setRotationPoint(48F, -28.5F, 14.5F);

		gunModel[205].addShapeBox(44F, -20F, -6F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, 0F); // Import Box0
		gunModel[205].setRotationPoint(47F, -27.5F, 14.5F);

		gunModel[206].addShapeBox(44F, -20F, -6F, 7, 1, 2, 0F,0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[206].setRotationPoint(45F, -32.5F, -3.5F);

		gunModel[207].addShapeBox(44F, -20F, -6F, 7, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box0
		gunModel[207].setRotationPoint(48F, -30.5F, 14.5F);

		gunModel[208].addShapeBox(44F, -20F, -6F, 7, 1, 2, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box0
		gunModel[208].setRotationPoint(47F, -31.5F, 14.5F);

		gunModel[209].addShapeBox(44F, -20F, -6F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[209].setRotationPoint(45F, -26.5F, 14.5F);

		gunModel[210].addShapeBox(44F, -20F, -6F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[210].setRotationPoint(25F, -32.5F, 14.5F);

		gunModel[211].addShapeBox(44F, -20F, -6F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[211].setRotationPoint(25F, -26.5F, 14.5F);

		gunModel[212].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box0
		gunModel[212].setRotationPoint(22F, -32.5F, 14.5F);

		gunModel[213].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F); // Import Box0
		gunModel[213].setRotationPoint(22F, -26.5F, 14.5F);

		gunModel[214].addShapeBox(44F, -20F, -6F, 1, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[214].setRotationPoint(21F, -31.5F, 14.5F);

		gunModel[215].addShapeBox(44F, -20F, -6F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box0
		gunModel[215].setRotationPoint(21F, -28.5F, 14.5F);

		gunModel[216].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[216].setRotationPoint(26F, -30.5F, 15F);

		gunModel[217].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[217].setRotationPoint(26F, -28.5F, 15F);

		gunModel[218].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[218].setRotationPoint(26F, -29.5F, 15F);

		gunModel[219].addShapeBox(44F, -20F, -6F, 20, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[219].setRotationPoint(25F, -31.5F, -3.5F);

		gunModel[220].addShapeBox(44F, -20F, -6F, 3, 5, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[220].setRotationPoint(22F, -31.5F, -3.5F);

		gunModel[221].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[221].setRotationPoint(21F, -29.5F, -2.5F);

		gunModel[222].addShapeBox(44F, -20F, -6F, 1, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[222].setRotationPoint(21F, -31.5F, -2.5F);

		gunModel[223].addShapeBox(44F, -20F, -6F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box0
		gunModel[223].setRotationPoint(21F, -28.5F, -2.5F);

		gunModel[224].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[224].setRotationPoint(22F, -32.5F, -3.5F);

		gunModel[225].addShapeBox(44F, -20F, -6F, 20, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[225].setRotationPoint(25F, -32.5F, -3.5F);

		gunModel[226].addShapeBox(44F, -20F, -6F, 2, 3, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box0
		gunModel[226].setRotationPoint(45F, -30.5F, -3.5F);

		gunModel[227].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box0
		gunModel[227].setRotationPoint(47F, -29.5F, -3.5F);

		gunModel[228].addShapeBox(44F, -20F, -6F, 7, 1, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box0
		gunModel[228].setRotationPoint(45F, -32.5F, 14.5F);

		gunModel[229].addShapeBox(44F, -20F, -6F, 7, 1, 2, 0F,2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[229].setRotationPoint(47F, -31.5F, -3.5F);

		gunModel[230].addShapeBox(44F, -20F, -6F, 7, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[230].setRotationPoint(48F, -30.5F, -3.5F);

		gunModel[231].addShapeBox(44F, -20F, -6F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[231].setRotationPoint(48F, -29.5F, -3.5F);

		gunModel[232].addShapeBox(44F, -20F, -6F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[232].setRotationPoint(48F, -28.5F, -3.5F);

		gunModel[233].addShapeBox(44F, -20F, -6F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 2F, 0F, 0F); // Import Box0
		gunModel[233].setRotationPoint(47F, -27.5F, -3.5F);

		gunModel[234].addShapeBox(44F, -20F, -6F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[234].setRotationPoint(45F, -26.5F, -3.5F);

		gunModel[235].addShapeBox(44F, -20F, -6F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[235].setRotationPoint(25F, -26.5F, -3.5F);

		gunModel[236].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[236].setRotationPoint(22F, -26.5F, -3.5F);

		gunModel[237].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[237].setRotationPoint(26F, -30.5F, -4F);

		gunModel[238].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[238].setRotationPoint(26F, -28.5F, -4F);

		gunModel[239].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[239].setRotationPoint(26F, -29.5F, -4F);

		gunModel[240].addShapeBox(44F, -20F, -6F, 2, 10, 18, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[240].setRotationPoint(-76.5F, -23F, -2.5F);

		gunModel[241].addShapeBox(44F, -20F, -6F, 2, 1, 13, 0F,-2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[241].setRotationPoint(-76.5F, -14F, 0F);

		gunModel[242].addShapeBox(44F, -20F, -6F, 2, 35, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box18
		gunModel[242].setRotationPoint(-78.5F, -47F, -2.5F);

		gunModel[243].addShapeBox(44F, -20F, -6F, 2, 5, 15, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box18
		gunModel[243].setRotationPoint(-78.5F, -12.5F, -1F);

		gunModel[244].addShapeBox(44F, -20F, -6F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box18
		gunModel[244].setRotationPoint(-78.5F, -48.5F, 0.5F);

		gunModel[245].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[245].setRotationPoint(-78.5F, -48F, 12.5F);

		gunModel[246].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[246].setRotationPoint(-78.5F, -48F, -0.5F);

		gunModel[247].addShapeBox(44F, -20F, -6F, 10, 1, 12, 0F,-0.75F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.75F, 0F, 1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Import Box18
		gunModel[247].setRotationPoint(-86.5F, -49.5F, 0.5F);

		gunModel[248].addShapeBox(44F, -20F, -6F, 7, 1, 12, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Import Box18
		gunModel[248].setRotationPoint(-83.5F, -51.5F, 0.5F);

		gunModel[249].addShapeBox(44F, -20F, -6F, 7, 1, 14, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F); // Import Box18
		gunModel[249].setRotationPoint(-83.5F, -50.5F, -0.5F);

		gunModel[250].addShapeBox(44F, -20F, -6F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[250].setRotationPoint(-78.5F, -46F, 15.5F);

		gunModel[251].addShapeBox(44F, -20F, -6F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[251].setRotationPoint(-78.5F, -45F, 16.5F);

		gunModel[252].addShapeBox(44F, -20F, -6F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box18
		gunModel[252].setRotationPoint(-78.5F, -40F, 15.5F);

		gunModel[253].addShapeBox(44F, -20F, -6F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[253].setRotationPoint(-78.5F, -32F, 15.5F);

		gunModel[254].addShapeBox(44F, -20F, -6F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[254].setRotationPoint(-78.5F, -31F, 16.5F);

		gunModel[255].addShapeBox(44F, -20F, -6F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box18
		gunModel[255].setRotationPoint(-78.5F, -26F, 15.5F);

		gunModel[256].addShapeBox(44F, -20F, -6F, 10, 5, 15, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box18
		gunModel[256].setRotationPoint(-88.5F, -12.5F, -1F);

		gunModel[257].addShapeBox(44F, -20F, -6F, 9, 18, 18, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Import Box18
		gunModel[257].setRotationPoint(-87.5F, -30F, -2.5F);

		gunModel[258].addShapeBox(44F, -20F, -6F, 3, 17, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[258].setRotationPoint(-81.5F, -47F, -2.5F);

		gunModel[259].addShapeBox(44F, -20F, -6F, 2, 15, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box18
		gunModel[259].setRotationPoint(-83.5F, -47F, -2.5F);

		gunModel[260].addShapeBox(44F, -20F, -6F, 4, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box18
		gunModel[260].setRotationPoint(-87.5F, -32F, -2.5F);

		gunModel[261].addShapeBox(44F, -20F, -6F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[261].setRotationPoint(-83.5F, -32F, -2.5F);

		gunModel[262].addShapeBox(44F, -20F, -6F, 4, 8, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[262].setRotationPoint(-87.5F, -40F, -2.5F);

		gunModel[263].addShapeBox(44F, -20F, -6F, 1, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[263].setRotationPoint(-84.75F, -48.5F, 0.5F);

		gunModel[264].addShapeBox(44F, -20F, -6F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[264].setRotationPoint(-81.4F, -48.5F, 0.5F);

		gunModel[265].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[265].setRotationPoint(-81.4F, -48F, 12.5F);

		gunModel[266].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[266].setRotationPoint(-81.4F, -48F, -0.5F);

		gunModel[267].addShapeBox(44F, -20F, -6F, 1, 18, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Import Box18
		gunModel[267].setRotationPoint(-87.5F, -30F, 15.5F);

		gunModel[268].addShapeBox(44F, -20F, -6F, 1, 18, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 1F, -2.5F, 0F); // Import Box18
		gunModel[268].setRotationPoint(-87.5F, -30F, 16.5F);

		gunModel[269].addShapeBox(44F, -20F, -6F, 2, 5, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[269].setRotationPoint(-86.5F, -27F, 15F);

		gunModel[270].addShapeBox(44F, -20F, -6F, 2, 5, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[270].setRotationPoint(-87F, -21F, 15F);

		gunModel[271].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[271].setRotationPoint(-36F, -32.5F, 14.25F);

		gunModel[272].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[272].setRotationPoint(-36F, -30.5F, 14.25F);

		gunModel[273].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[273].setRotationPoint(-36F, -31.5F, 14.25F);

		gunModel[274].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[274].setRotationPoint(-64F, -32.5F, 14.25F);

		gunModel[275].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[275].setRotationPoint(-64F, -30.5F, 14.25F);

		gunModel[276].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[276].setRotationPoint(-64F, -31.5F, 14.25F);

		gunModel[277].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[277].setRotationPoint(-70F, -30.5F, 14.25F);

		gunModel[278].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[278].setRotationPoint(-70F, -28.5F, 14.25F);

		gunModel[279].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[279].setRotationPoint(-70F, -29.5F, 14.25F);

		gunModel[280].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[280].setRotationPoint(-75F, -30.5F, 14.25F);

		gunModel[281].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[281].setRotationPoint(-75F, -28.5F, 14.25F);

		gunModel[282].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[282].setRotationPoint(-75F, -29.5F, 14.25F);

		gunModel[283].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[283].setRotationPoint(-3F, -32.5F, 14.25F);

		gunModel[284].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[284].setRotationPoint(-3F, -30.5F, 14.25F);

		gunModel[285].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[285].setRotationPoint(-3F, -31.5F, 14.25F);

		gunModel[286].addShapeBox(44F, -20F, -6F, 2, 1, 14, 0F,0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Import Box0
		gunModel[286].setRotationPoint(26.75F, -18.5F, -0.5F);

		gunModel[287].addShapeBox(44F, -20F, -6F, 1, 1, 14, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[287].setRotationPoint(27F, -17.75F, -0.5F);

		gunModel[288].addShapeBox(44F, -20F, -6F, 1, 1, 14, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[288].setRotationPoint(27F, -19.25F, -0.5F);

		gunModel[289].addShapeBox(44F, -20F, -6F, 1, 1, 14, 0F,0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[289].setRotationPoint(26.25F, -19.25F, -0.5F);

		gunModel[290].addShapeBox(44F, -20F, -6F, 1, 1, 14, 0F,-0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		gunModel[290].setRotationPoint(27.5F, -19.25F, -0.5F);

		gunModel[291].addShapeBox(44F, -20F, -6F, 1, 1, 14, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[291].setRotationPoint(26.25F, -18F, -0.5F);

		gunModel[292].addShapeBox(44F, -20F, -6F, 1, 1, 14, 0F,-0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[292].setRotationPoint(27.5F, -18F, -0.5F);

		gunModel[293].addShapeBox(44F, -20F, -6F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[293].setRotationPoint(-19F, -5.5F, 12F);

		gunModel[294].addShapeBox(44F, -20F, -6F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[294].setRotationPoint(-15F, -5.5F, 12F);

		gunModel[295].addShapeBox(44F, -20F, -6F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[295].setRotationPoint(-13F, -7.5F, 12F);

		gunModel[296].addShapeBox(44F, -20F, -6F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[296].setRotationPoint(-13F, -15.5F, 12F);

		gunModel[297].addShapeBox(44F, -20F, -6F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[297].setRotationPoint(-19F, -15.5F, 12F);

		gunModel[298].addShapeBox(44F, -20F, -6F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[298].setRotationPoint(-15F, -15.5F, 12F);

		gunModel[299].addShapeBox(44F, -20F, -6F, 10, 3, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box18
		gunModel[299].setRotationPoint(-12F, -11.5F, 12.5F);

		gunModel[300].addShapeBox(44F, -20F, -6F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[300].setRotationPoint(-2F, -11.5F, 12.5F);

		gunModel[301].addShapeBox(44F, -20F, -6F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[301].setRotationPoint(-0.5F, -11F, 12.5F);

		gunModel[302].addShapeBox(44F, -20F, -6F, 3, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[302].setRotationPoint(-18F, -14.5F, 12.25F);

		gunModel[303].addShapeBox(44F, -20F, -6F, 3, 9, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[303].setRotationPoint(-15F, -14.5F, 12.25F);

		gunModel[304].addShapeBox(44F, -20F, -6F, 3, 9, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box18
		gunModel[304].setRotationPoint(-21F, -14.5F, 12.25F);

		gunModel[305].addShapeBox(44F, -20F, -6F, 9, 2, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Import Box18
		gunModel[305].setRotationPoint(-11F, -20F, 12.5F);

		gunModel[306].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[306].setRotationPoint(-19.5F, -22F, 12F);

		gunModel[307].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[307].setRotationPoint(-14.5F, -22F, 12F);

		gunModel[308].addShapeBox(44F, -20F, -6F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[308].setRotationPoint(-18.5F, -22F, 12.5F);

		gunModel[309].addShapeBox(44F, -20F, -6F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box18
		gunModel[309].setRotationPoint(-18.5F, -18F, 12.5F);

		gunModel[310].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box18
		gunModel[310].setRotationPoint(-18F, -16.5F, 12.5F);

		gunModel[311].addShapeBox(44F, -20F, -6F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[311].setRotationPoint(-17F, -18F, 14.25F);

		gunModel[312].addShapeBox(44F, -20F, -6F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box18
		gunModel[312].setRotationPoint(-17F, -21F, 14.25F);

		gunModel[313].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box18
		gunModel[313].setRotationPoint(-17F, -19F, 14.25F);

		gunModel[314].addShapeBox(44F, -20F, -6F, 1, 2, 1, 0F,0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[314].setRotationPoint(-17F, -23F, 14.25F);

		gunModel[315].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box18
		gunModel[315].setRotationPoint(-17.5F, -24F, 14.5F);

		gunModel[316].addShapeBox(44F, -20F, -6F, 2, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[316].setRotationPoint(-17.5F, -26F, 14.5F);

		gunModel[317].addShapeBox(44F, -20F, -6F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[317].setRotationPoint(-18.5F, -29F, 14.5F);

		gunModel[318].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,-0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box18
		gunModel[318].setRotationPoint(-17.5F, -30F, 14.5F);

		gunModel[319].addBox(44F, -20F, -6F, 154, 11, 17, 0F); // Import Box0
		gunModel[319].setRotationPoint(21F, -34F, -2F);

		gunModel[320].addBox(44F, -20F, -6F, 46, 11, 9, 0F); // Import Box0
		gunModel[320].setRotationPoint(-25F, -34F, 6F);

		gunModel[321].addBox(44F, -20F, -6F, 46, 3, 8, 0F); // Import Box0
		gunModel[321].setRotationPoint(-25F, -26F, -2F);

		gunModel[322].addBox(44F, -20F, -6F, 46, 2, 8, 0F); // Import Box0
		gunModel[322].setRotationPoint(-25F, -34F, -2F);

		gunModel[323].addShapeBox(44F, -20F, -6F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[323].setRotationPoint(-25F, -32F, -2F);

		gunModel[324].addShapeBox(44F, -20F, -6F, 1, 1, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[324].setRotationPoint(-25F, -27F, -2F);

		gunModel[325].addShapeBox(44F, -20F, -6F, 1, 1, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[325].setRotationPoint(19F, -27F, -2F);

		gunModel[326].addShapeBox(44F, -20F, -6F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[326].setRotationPoint(19F, -32F, -2F);

		gunModel[327].addShapeBox(44F, -20F, -6F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[327].setRotationPoint(20F, -32F, -2F);

		gunModel[328].addShapeBox(44F, -20F, -6F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[328].setRotationPoint(-14.5F, -6.5F, -2.5F);

		gunModel[329].addShapeBox(44F, -20F, -6F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[329].setRotationPoint(-11.5F, -6.5F, -2.5F);

		gunModel[330].addShapeBox(44F, -20F, -6F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[330].setRotationPoint(-11.5F, -14.5F, -2.5F);

		gunModel[331].addShapeBox(44F, -20F, -6F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[331].setRotationPoint(-11.5F, -16.5F, -2.5F);

		gunModel[332].addShapeBox(44F, -20F, -6F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[332].setRotationPoint(-14.5F, -16.5F, -2.5F);

		gunModel[333].addShapeBox(44F, -20F, -6F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[333].setRotationPoint(-19.5F, -16.5F, -1F);

		gunModel[334].addShapeBox(44F, -20F, -6F, 6, 2, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[334].setRotationPoint(-25.5F, -16.5F, -1F);

		gunModel[335].addShapeBox(44F, -20F, -6F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[335].setRotationPoint(-25.5F, -14.5F, -1F);

		gunModel[336].addShapeBox(44F, -20F, -6F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[336].setRotationPoint(-25.5F, -11.5F, -1F);

		gunModel[337].addShapeBox(44F, -20F, -6F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[337].setRotationPoint(-18.5F, -11.5F, -1.5F);

		gunModel[338].addShapeBox(44F, -20F, -6F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[338].setRotationPoint(-18.5F, -13.5F, -1.5F);

		gunModel[339].addShapeBox(44F, -20F, -6F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[339].setRotationPoint(-18.5F, -9.5F, -1.5F);

		gunModel[340].addShapeBox(44F, -20F, -6F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[340].setRotationPoint(-24F, -14.5F, -1.5F);

		gunModel[341].addShapeBox(44F, -20F, -6F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[341].setRotationPoint(-24F, -12.5F, -1.5F);

		gunModel[342].addShapeBox(44F, -20F, -6F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[342].setRotationPoint(-24F, -13.5F, -1.5F);

		gunModel[343].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[343].setRotationPoint(-69F, -31F, -2.5F);

		gunModel[344].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[344].setRotationPoint(-69F, -29F, -2.5F);

		gunModel[345].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[345].setRotationPoint(-69F, -30F, -2.5F);

		gunModel[346].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[346].setRotationPoint(-74.5F, -31F, -2.5F);

		gunModel[347].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[347].setRotationPoint(-74.5F, -29F, -2.5F);

		gunModel[348].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[348].setRotationPoint(-74.5F, -30F, -2.5F);

		gunModel[349].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[349].setRotationPoint(-30F, -31F, -2.5F);

		gunModel[350].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[350].setRotationPoint(-30F, -29F, -2.5F);

		gunModel[351].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[351].setRotationPoint(-30F, -30F, -2.5F);

		gunModel[352].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[352].setRotationPoint(-35.5F, -31F, -2.5F);

		gunModel[353].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[353].setRotationPoint(-35.5F, -29F, -2.5F);

		gunModel[354].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[354].setRotationPoint(-35.5F, -30F, -2.5F);

		gunModel[355].addShapeBox(44F, -20F, -6F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[355].setRotationPoint(-27F, -31F, -4F);

		gunModel[356].addShapeBox(44F, -20F, -6F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[356].setRotationPoint(-27F, -33F, -4F);

		gunModel[357].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[357].setRotationPoint(-27F, -34F, -3F);

		gunModel[358].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[358].setRotationPoint(-27F, -27F, -3F);

		gunModel[359].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[359].setRotationPoint(43F, -30.5F, 15F);

		gunModel[360].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[360].setRotationPoint(43F, -28.5F, 15F);

		gunModel[361].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[361].setRotationPoint(43F, -29.5F, 15F);

		gunModel[362].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[362].setRotationPoint(43F, -30.5F, -4F);

		gunModel[363].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[363].setRotationPoint(43F, -28.5F, -4F);

		gunModel[364].addShapeBox(44F, -20F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[364].setRotationPoint(43F, -29.5F, -4F);

		gunModel[365].addShapeBox(44F, -20F, -6F, 18, 3, 17, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[365].setRotationPoint(156F, -37F, -2F);

		gunModel[366].addShapeBox(44F, -20F, -6F, 18, 2, 15, 0F,0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[366].setRotationPoint(156F, -39F, -1F);

		gunModel[367].addShapeBox(44F, -20F, -6F, 18, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[367].setRotationPoint(156F, -47F, 1.5F);

		gunModel[368].addShapeBox(44F, -20F, -6F, 18, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box0
		gunModel[368].setRotationPoint(156F, -39.5F, 1.5F);

		gunModel[369].addShapeBox(44F, -20F, -6F, 1, 2, 17, 0F,0F, 0F, -0.85F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[369].setRotationPoint(118F, -36F, -2F);

		gunModel[370].addShapeBox(44F, -20F, -6F, 1, 2, 17, 0F,0.5F, -2F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[370].setRotationPoint(155F, -36F, -2F);

		gunModel[371].addShapeBox(44F, -20F, -6F, 1, 2, 10, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import Box0
		gunModel[371].setRotationPoint(155F, -47F, 1.5F);

		gunModel[372].addShapeBox(44F, -20F, -6F, 1, 2, 10, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[372].setRotationPoint(118F, -47F, 1.5F);

		gunModel[373].addShapeBox(44F, -20F, -6F, 13, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[373].setRotationPoint(116F, -43F, 2F);

		gunModel[374].addShapeBox(44F, -20F, -6F, 13, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[374].setRotationPoint(116F, -40F, 2F);

		gunModel[375].addShapeBox(44F, -20F, -6F, 13, 2, 9, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Import Box0
		gunModel[375].setRotationPoint(116F, -36F, 2F);

		gunModel[376].addShapeBox(44F, -20F, -6F, 3, 1, 11, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[376].setRotationPoint(122F, -39.5F, 1F);

		gunModel[377].addShapeBox(44F, -20F, -6F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[377].setRotationPoint(122F, -37.5F, 1F);

		gunModel[378].addShapeBox(44F, -20F, -6F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[378].setRotationPoint(122F, -38.5F, 1F);

		gunModel[379].addShapeBox(44F, -20F, -6F, 13, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[379].setRotationPoint(116F, -37F, 2F);

		gunModel[380].addShapeBox(44F, -20F, -6F, 2, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[380].setRotationPoint(-86.75F, -48.5F, 0.5F);

		gunModel[381].addShapeBox(44F, -20F, -6F, 31, 4, 15, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box18
		gunModel[381].setRotationPoint(-119.5F, -12.5F, -1F);

		gunModel[382].addShapeBox(44F, -20F, -6F, 16, 4, 15, 0F,0F, -14F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -14F, 1.5F, 0F, 14F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 14F, -2F); // Import Box18
		gunModel[382].setRotationPoint(-135.5F, -12.5F, -1F);

		gunModel[383].addShapeBox(44F, -20F, -6F, 15, 22, 17, 0F,-8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[383].setRotationPoint(-102.5F, -37.5F, -2F);

		gunModel[384].addShapeBox(44F, -20F, -6F, 14, 3, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[384].setRotationPoint(-102.5F, -15.5F, -2F);

		gunModel[385].addShapeBox(44F, -20F, -6F, 7, 3, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[385].setRotationPoint(-94.5F, -40.5F, -2F);

		gunModel[386].addShapeBox(44F, -20F, -6F, 8, 3, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Import Box18
		gunModel[386].setRotationPoint(-95.5F, -43.5F, -2F);

		gunModel[387].addShapeBox(44F, -20F, -6F, 13, 2, 17, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[387].setRotationPoint(-100.5F, -47.5F, -2F);

		gunModel[388].addShapeBox(44F, -20F, -6F, 13, 2, 17, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[388].setRotationPoint(-100.5F, -45.5F, -2F);

		gunModel[389].addShapeBox(44F, -20F, -6F, 13, 1, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[389].setRotationPoint(-100.5F, -48.5F, -1F);

		gunModel[390].addShapeBox(44F, -20F, -6F, 26, 2, 17, 0F,0F, -22F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -22F, 0.5F, 0F, 22F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 22F, 0.5F); // Import Box18
		gunModel[390].setRotationPoint(-126.5F, -45.5F, -2F);

		gunModel[391].addShapeBox(44F, -20F, -6F, 26, 2, 17, 0F,0F, -22F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -22F, -1F, 0F, 22F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 22F, 0.5F); // Import Box18
		gunModel[391].setRotationPoint(-126.5F, -47.5F, -2F);

		gunModel[392].addShapeBox(44F, -20F, -6F, 26, 1, 13, 0F,0F, -22F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -22F, -1F, 0F, 22F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 22F, 1F); // Import Box18
		gunModel[392].setRotationPoint(-126.5F, -48.5F, 0F);

		gunModel[393].addShapeBox(44F, -20F, -6F, 22, 2, 15, 0F,0F, -19F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -19F, 0.5F, 0F, 19F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 19F, 0.5F); // Import Box18
		gunModel[393].setRotationPoint(-126.5F, -47.5F, -1F);

		gunModel[394].addShapeBox(44F, -20F, -6F, 87, 2, 15, 0F,-0.5F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[394].setRotationPoint(-189.5F, -49.5F, -1F);

		gunModel[395].addShapeBox(44F, -20F, -6F, 87, 2, 13, 0F,-1.5F, 0F, -2F, 6F, 0F, -2F, 6F, 0F, -2F, -1.5F, 0F, -2F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F); // Import Box18
		gunModel[395].setRotationPoint(-189.5F, -51.5F, 0F);

		gunModel[396].addShapeBox(44F, -20F, -6F, 2, 2, 15, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, -2F, 0.5F, 0.5F, -2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box18
		gunModel[396].setRotationPoint(-104.5F, -47.5F, -1F);

		gunModel[397].addShapeBox(44F, -20F, -6F, 85, 19, 15, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -22F, 0F, 0.5F, -22F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[397].setRotationPoint(-189.5F, -47.5F, -1F);

		gunModel[398].addShapeBox(44F, -20F, -6F, 10, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 8F, 0F); // Import Box18
		gunModel[398].setRotationPoint(-136.5F, -23.5F, -2.5F);

		gunModel[399].addShapeBox(44F, -20F, -6F, 18, 2, 17, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[399].setRotationPoint(-144.5F, -25.5F, -2F);

		gunModel[400].addShapeBox(44F, -20F, -6F, 18, 1, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[400].setRotationPoint(-144.5F, -26.5F, -1F);

		gunModel[401].addShapeBox(44F, -20F, -6F, 63, 2, 15, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[401].setRotationPoint(-189.5F, -28.5F, -1F);

		gunModel[402].addShapeBox(44F, -20F, -6F, 8, 32, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[402].setRotationPoint(-144.5F, -23.5F, -2.5F);

		gunModel[403].addShapeBox(44F, -20F, -6F, 6, 7, 18, 0F,0F, 1F, 0F, -0.4F, -4F, 0F, -0.4F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3.85F, 0F, 0F, -3.85F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[403].setRotationPoint(-136.5F, -6.5F, -2.5F);

		gunModel[404].addShapeBox(44F, -20F, -6F, 6, 32, 20, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[404].setRotationPoint(-150.5F, -23.5F, -3.5F);

		gunModel[405].addShapeBox(44F, -20F, -6F, 6, 2, 19, 0F,0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 4F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 4F, 0.5F); // Import Box18
		gunModel[405].setRotationPoint(-150.5F, -25.5F, -3F);

		gunModel[406].addShapeBox(44F, -20F, -6F, 6, 1, 17, 0F,0F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box18
		gunModel[406].setRotationPoint(-150.5F, -26.5F, -2F);

		gunModel[407].addShapeBox(44F, -20F, -6F, 13, 28, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[407].setRotationPoint(-163.5F, -19.5F, -3.5F);

		gunModel[408].addShapeBox(44F, -20F, -6F, 13, 2, 19, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[408].setRotationPoint(-163.5F, -21.5F, -3F);

		gunModel[409].addShapeBox(44F, -20F, -6F, 13, 1, 17, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[409].setRotationPoint(-163.5F, -22.5F, -2F);

		gunModel[410].addShapeBox(44F, -20F, -6F, 4, 32, 20, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[410].setRotationPoint(-167.5F, -23.5F, -3.5F);

		gunModel[411].addShapeBox(44F, -20F, -6F, 4, 2, 19, 0F,0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 4F, 0.5F, 0F, 4F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[411].setRotationPoint(-167.5F, -25.5F, -3F);

		gunModel[412].addShapeBox(44F, -20F, -6F, 4, 1, 17, 0F,0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[412].setRotationPoint(-167.5F, -26.5F, -2F);

		gunModel[413].addShapeBox(44F, -20F, -6F, 22, 2, 17, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[413].setRotationPoint(-189.5F, -25.5F, -2F);

		gunModel[414].addShapeBox(44F, -20F, -6F, 22, 1, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[414].setRotationPoint(-189.5F, -26.5F, -1F);

		gunModel[415].addShapeBox(44F, -20F, -6F, 9, 32, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[415].setRotationPoint(-176.5F, -23.5F, -2.5F);

		gunModel[416].addShapeBox(44F, -20F, -6F, 6, 32, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[416].setRotationPoint(-189.5F, -23.5F, -2.5F);

		gunModel[417].addShapeBox(44F, -20F, -6F, 23, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[417].setRotationPoint(-167.5F, -26.5F, 1.5F);

		gunModel[418].addShapeBox(44F, -20F, -6F, 2, 1, 18, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[418].setRotationPoint(-136.5F, 0.5F, -2.5F);

		gunModel[419].addShapeBox(44F, -20F, -6F, 2, 4, 18, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3.5F, -1F, 0F, -3.5F, 0F, 0F, 0F); // Import Box18
		gunModel[419].setRotationPoint(-136.5F, 1.5F, -2.5F);

		gunModel[420].addShapeBox(44F, -20F, -6F, 33, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[420].setRotationPoint(-132.5F, -22.5F, -1F);

		gunModel[421].addShapeBox(44F, -20F, -6F, 33, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[421].setRotationPoint(-132.5F, -19.5F, -1F);

		gunModel[422].addShapeBox(44F, -20F, -6F, 33, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[422].setRotationPoint(-132.5F, -21.5F, 0F);

		gunModel[423].addShapeBox(44F, -20F, -6F, 33, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box18
		gunModel[423].setRotationPoint(-132.5F, -18.5F, -1F);

		gunModel[424].addShapeBox(44F, -20F, -6F, 33, 1, 15, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[424].setRotationPoint(-132.5F, -23.5F, -1F);

		gunModel[425].addShapeBox(44F, -20F, -6F, 1, 9, 15, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F); // Import Box18
		gunModel[425].setRotationPoint(-122.5F, -18.5F, -1F);

		gunModel[426].addShapeBox(44F, -20F, -6F, 2, 9, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0.5F, 0F, 1.1F, 0.5F, 0F, 1.1F, 0.5F, 0F, -1.1F, 0.5F, 0F); // Import Box18
		gunModel[426].setRotationPoint(-124.5F, -18.5F, 0F);

		gunModel[427].addShapeBox(44F, -20F, -6F, 1, 10, 15, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.2F, 0.15F, -1F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -1.2F, 0.25F, -1F); // Import Box18
		gunModel[427].setRotationPoint(-125.5F, -18.5F, -1F);

		gunModel[428].addShapeBox(44F, -20F, -6F, 9, 15, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[428].setRotationPoint(-136.5F, -17.5F, 2F);

		gunModel[429].addShapeBox(44F, -20F, -6F, 3, 15, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[429].setRotationPoint(-127.5F, -17.5F, 2F);

		gunModel[430].addShapeBox(44F, -20F, -6F, 2, 3, 17, 0F,-2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[430].setRotationPoint(-104.5F, -15.5F, -2F);

		gunModel[431].addShapeBox(44F, -20F, -6F, 7, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[431].setRotationPoint(-183.5F, -23.5F, -2.5F);

		gunModel[432].addShapeBox(44F, -20F, -6F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		gunModel[432].setRotationPoint(-178.5F, -20.5F, -2.5F);

		gunModel[433].addShapeBox(44F, -20F, -6F, 5, 2, 21, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		gunModel[433].setRotationPoint(-183.5F, 9.5F, -4F);

		gunModel[434].addShapeBox(44F, -20F, -6F, 2, 3, 18, 0F,0F, 0F, 0F, -1F, 0F, -3.5F, -1F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3.5F, -1F, 0F, -3.5F, 0F, 0F, 0F); // Import Box18
		gunModel[434].setRotationPoint(-136.5F, 5.5F, -2.5F);

		gunModel[435].addShapeBox(44F, -20F, -6F, 54, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[435].setRotationPoint(-189.5F, 8.5F, -1F);

		gunModel[436].addShapeBox(44F, -20F, -6F, 2, 6, 15, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[436].setRotationPoint(-135.5F, 8.5F, -1F);

		gunModel[437].addShapeBox(44F, -20F, -6F, 54, 2, 16, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[437].setRotationPoint(-189.5F, 14.5F, -1.5F);

		gunModel[438].addShapeBox(44F, -20F, -6F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[438].setRotationPoint(-183.5F, -20.5F, -2.5F);

		gunModel[439].addShapeBox(44F, -20F, -6F, 7, 28, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[439].setRotationPoint(-183.5F, -18.5F, -4F);

		gunModel[440].addShapeBox(44F, -20F, -6F, 5, 2, 21, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[440].setRotationPoint(-183.5F, -20.5F, -4F);

		gunModel[441].addShapeBox(44F, -20F, -6F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box18
		gunModel[441].setRotationPoint(-209.5F, -15.5F, 3.5F);

		gunModel[442].addShapeBox(44F, -20F, -6F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[442].setRotationPoint(-209.5F, -17.5F, 3.5F);

		gunModel[443].addShapeBox(44F, -20F, -6F, 20, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[443].setRotationPoint(-209.5F, -19.5F, 3.5F);

		gunModel[444].addShapeBox(44F, -20F, -6F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box18
		gunModel[444].setRotationPoint(-209.5F, 9.5F, 3.5F);

		gunModel[445].addShapeBox(44F, -20F, -6F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[445].setRotationPoint(-209.5F, 7.5F, 3.5F);

		gunModel[446].addShapeBox(44F, -20F, -6F, 20, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[446].setRotationPoint(-209.5F, 5.5F, 3.5F);

		gunModel[447].addShapeBox(44F, -20F, -6F, 5, 67, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[447].setRotationPoint(-217.5F, -37.5F, -2.5F);

		gunModel[448].addShapeBox(44F, -20F, -6F, 3, 67, 18, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box18
		gunModel[448].setRotationPoint(-212.5F, -37.5F, -2.5F);

		gunModel[449].addShapeBox(44F, -20F, -6F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box18
		gunModel[449].setRotationPoint(-217.5F, 29.5F, -2.5F);

		gunModel[450].addShapeBox(44F, -20F, -6F, 3, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F); // Import Box18
		gunModel[450].setRotationPoint(-212.5F, 29.5F, -2.5F);

		gunModel[451].addShapeBox(44F, -20F, -6F, 5, 4, 18, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[451].setRotationPoint(-217.5F, -41.5F, -2.5F);

		gunModel[452].addShapeBox(44F, -20F, -6F, 3, 4, 18, 0F,0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box18
		gunModel[452].setRotationPoint(-212.5F, -41.5F, -2.5F);

		gunModel[453].addShapeBox(44F, -20F, -6F, 3, 1, 17, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[453].setRotationPoint(-131F, -30.5F, -2F);

		gunModel[454].addShapeBox(44F, -20F, -6F, 3, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[454].setRotationPoint(-131F, -28.5F, -2F);

		gunModel[455].addShapeBox(44F, -20F, -6F, 3, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[455].setRotationPoint(-131F, -29.5F, -2F);

		gunModel[456].addShapeBox(44F, -20F, -6F, 3, 1, 17, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[456].setRotationPoint(-186F, -30.5F, -2F);

		gunModel[457].addShapeBox(44F, -20F, -6F, 3, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[457].setRotationPoint(-186F, -28.5F, -2F);

		gunModel[458].addShapeBox(44F, -20F, -6F, 3, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[458].setRotationPoint(-186F, -29.5F, -2F);

		gunModel[459].addShapeBox(44F, -20F, -6F, 5, 67, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		gunModel[459].setRotationPoint(-222.5F, -37.5F, -3.5F);

		gunModel[460].addShapeBox(44F, -20F, -6F, 5, 4, 20, 0F,3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 3F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box18
		gunModel[460].setRotationPoint(-222.5F, -41.5F, -3.5F);

		gunModel[461].addShapeBox(44F, -20F, -6F, 5, 3, 20, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 3F, 0F, -2F); // Import Box18
		gunModel[461].setRotationPoint(-222.5F, 29.5F, -3.5F);

		gunModel[462].addShapeBox(44F, -20F, -6F, 1, 34, 20, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box18
		gunModel[462].setRotationPoint(-223.5F, -4.5F, -3.5F);

		gunModel[463].addShapeBox(44F, -20F, -6F, 1, 35, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box18
		gunModel[463].setRotationPoint(-223.5F, -37.5F, -3.5F);

		gunModel[464].addShapeBox(44F, -20F, -6F, 26, 2, 11, 0F,0F, -22F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -22F, 0.5F, 0F, 22F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 22F, 0.5F); // Import Box18
		gunModel[464].setRotationPoint(-126.5F, -43.5F, 1F);

		gunModel[465].addShapeBox(44F, -20F, -6F, 6, 2, 11, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[465].setRotationPoint(-100.5F, -43.5F, 1F);

		gunModel[466].addShapeBox(44F, -20F, -6F, 10, 22, 11, 0F,-8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[466].setRotationPoint(-104.5F, -37.5F, 1F);

		gunModel[467].addShapeBox(44F, -20F, -6F, 8, 3, 11, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[467].setRotationPoint(-96.5F, -40.5F, 1F);

		gunModel[468].addShapeBox(44F, -20F, -6F, 8, 3, 11, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Import Box18
		gunModel[468].setRotationPoint(-97.5F, -43.5F, 1F);

		gunModel[469].addShapeBox(44F, -20F, -6F, 8, 3, 11, 0F,-2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box18
		gunModel[469].setRotationPoint(-106.5F, -15.5F, 1F);

		gunModel[470].addShapeBox(44F, -20F, -6F, 3, 1, 19, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[470].setRotationPoint(-141F, 3.5F, -3F);

		gunModel[471].addShapeBox(44F, -20F, -6F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[471].setRotationPoint(-141F, 5.5F, -3F);

		gunModel[472].addShapeBox(44F, -20F, -6F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[472].setRotationPoint(-141F, 4.5F, -3F);

		gunModel[473].addShapeBox(44F, -20F, -6F, 3, 1, 19, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[473].setRotationPoint(-188F, 3.5F, -3F);

		gunModel[474].addShapeBox(44F, -20F, -6F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[474].setRotationPoint(-188F, 5.5F, -3F);

		gunModel[475].addShapeBox(44F, -20F, -6F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[475].setRotationPoint(-188F, 4.5F, -3F);

		gunModel[476].addShapeBox(44F, -20F, -6F, 3, 1, 21, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[476].setRotationPoint(-166F, 3.5F, -4F);

		gunModel[477].addShapeBox(44F, -20F, -6F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[477].setRotationPoint(-166F, 5.5F, -4F);

		gunModel[478].addShapeBox(44F, -20F, -6F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[478].setRotationPoint(-166F, 4.5F, -4F);

		gunModel[479].addShapeBox(44F, -20F, -6F, 3, 1, 21, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[479].setRotationPoint(-149F, 3.5F, -4F);

		gunModel[480].addShapeBox(44F, -20F, -6F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[480].setRotationPoint(-149F, 5.5F, -4F);

		gunModel[481].addShapeBox(44F, -20F, -6F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[481].setRotationPoint(-149F, 4.5F, -4F);

		gunModel[482].addShapeBox(44F, -20F, -6F, 3, 1, 19, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[482].setRotationPoint(-92F, -19.5F, -3F);

		gunModel[483].addShapeBox(44F, -20F, -6F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[483].setRotationPoint(-92F, -17.5F, -3F);

		gunModel[484].addShapeBox(44F, -20F, -6F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[484].setRotationPoint(-92F, -18.5F, -3F);

		gunModel[485].addShapeBox(44F, -20F, -6F, 3, 1, 19, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[485].setRotationPoint(-92F, -42.5F, -3F);

		gunModel[486].addShapeBox(44F, -20F, -6F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[486].setRotationPoint(-92F, -40.5F, -3F);

		gunModel[487].addShapeBox(44F, -20F, -6F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[487].setRotationPoint(-92F, -41.5F, -3F);
	}

	private void initdefaultScopeModel_1()
	{
		defaultScopeModel[0] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Import Box18
		defaultScopeModel[1] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Import Box18
		defaultScopeModel[2] = new ModelRendererTurbo(this, 521, 137, textureX, textureY); // Import Box18
		defaultScopeModel[3] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Import Box18
		defaultScopeModel[4] = new ModelRendererTurbo(this, 569, 137, textureX, textureY); // Import Box18
		defaultScopeModel[5] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import Box18
		defaultScopeModel[6] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Import Box18
		defaultScopeModel[7] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Import Box18
		defaultScopeModel[8] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Import Box18
		defaultScopeModel[9] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Import Box18
		defaultScopeModel[10] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Import Box18
		defaultScopeModel[11] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Import Box18
		defaultScopeModel[12] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Import Box18
		defaultScopeModel[13] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Import Box18
		defaultScopeModel[14] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Import Box18
		defaultScopeModel[15] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Import Box18
		defaultScopeModel[16] = new ModelRendererTurbo(this, 585, 113, textureX, textureY); // Import Box18
		defaultScopeModel[17] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box18
		defaultScopeModel[18] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Import Box18
		defaultScopeModel[19] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Import Box18
		defaultScopeModel[20] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Import Box18
		defaultScopeModel[21] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Import Box18
		defaultScopeModel[22] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Import Box18
		defaultScopeModel[23] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Import Box18
		defaultScopeModel[24] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Import Box18
		defaultScopeModel[25] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Import Box18
		defaultScopeModel[26] = new ModelRendererTurbo(this, 857, 225, textureX, textureY); // Import Box18
		defaultScopeModel[27] = new ModelRendererTurbo(this, 913, 177, textureX, textureY); // Import Box18
		defaultScopeModel[28] = new ModelRendererTurbo(this, 889, 105, textureX, textureY); // Import Box18
		defaultScopeModel[29] = new ModelRendererTurbo(this, 641, 241, textureX, textureY); // Import Box18
		defaultScopeModel[30] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Import Box18
		defaultScopeModel[31] = new ModelRendererTurbo(this, 689, 201, textureX, textureY); // Import Box18
		defaultScopeModel[32] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Import Box18
		defaultScopeModel[33] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Import Box18
		defaultScopeModel[34] = new ModelRendererTurbo(this, 673, 241, textureX, textureY); // Import Box18
		defaultScopeModel[35] = new ModelRendererTurbo(this, 697, 241, textureX, textureY); // Import Box18
		defaultScopeModel[36] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Import Box18
		defaultScopeModel[37] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Import Box18
		defaultScopeModel[38] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Import Box0
		defaultScopeModel[39] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Import Box0
		defaultScopeModel[40] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Import Box0
		defaultScopeModel[41] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Import Box0
		defaultScopeModel[42] = new ModelRendererTurbo(this, 1017, 129, textureX, textureY); // Import Box0
		defaultScopeModel[43] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box0
		defaultScopeModel[44] = new ModelRendererTurbo(this, 1017, 137, textureX, textureY); // Import Box0
		defaultScopeModel[45] = new ModelRendererTurbo(this, 953, 177, textureX, textureY); // Import Box18
		defaultScopeModel[46] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Import Box18
		defaultScopeModel[47] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Import Box18
		defaultScopeModel[48] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Import Box18
		defaultScopeModel[49] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Import Box18
		defaultScopeModel[50] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box18
		defaultScopeModel[51] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Import Box18
		defaultScopeModel[52] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Import Box18
		defaultScopeModel[53] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Import Box18
		defaultScopeModel[54] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Import Box18
		defaultScopeModel[55] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Import Box18
		defaultScopeModel[56] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Import Box18
		defaultScopeModel[57] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Box18
		defaultScopeModel[58] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Import Box18
		defaultScopeModel[59] = new ModelRendererTurbo(this, 521, 161, textureX, textureY); // Import Box18
		defaultScopeModel[60] = new ModelRendererTurbo(this, 529, 161, textureX, textureY); // Import Box18
		defaultScopeModel[61] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Import Box18
		defaultScopeModel[62] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Import Box18
		defaultScopeModel[63] = new ModelRendererTurbo(this, 689, 161, textureX, textureY); // Import Box18
		defaultScopeModel[64] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Import Box18
		defaultScopeModel[65] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Import Box18
		defaultScopeModel[66] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Import Box18
		defaultScopeModel[67] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Import Box18
		defaultScopeModel[68] = new ModelRendererTurbo(this, 569, 209, textureX, textureY); // Import Box18
		defaultScopeModel[69] = new ModelRendererTurbo(this, 625, 209, textureX, textureY); // Import Box18
		defaultScopeModel[70] = new ModelRendererTurbo(this, 761, 225, textureX, textureY); // Import Box18
		defaultScopeModel[71] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Import Box18
		defaultScopeModel[72] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Import Box18
		defaultScopeModel[73] = new ModelRendererTurbo(this, 321, 233, textureX, textureY); // Import Box18
		defaultScopeModel[74] = new ModelRendererTurbo(this, 977, 217, textureX, textureY); // Import Box18
		defaultScopeModel[75] = new ModelRendererTurbo(this, 353, 233, textureX, textureY); // Import Box18
		defaultScopeModel[76] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Import Box18
		defaultScopeModel[77] = new ModelRendererTurbo(this, 1001, 169, textureX, textureY); // Import Box18
		defaultScopeModel[78] = new ModelRendererTurbo(this, 537, 177, textureX, textureY); // Import Box18
		defaultScopeModel[79] = new ModelRendererTurbo(this, 825, 233, textureX, textureY); // Import Box18
		defaultScopeModel[80] = new ModelRendererTurbo(this, 337, 249, textureX, textureY); // Import Box18
		defaultScopeModel[81] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Import Box18
		defaultScopeModel[82] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Import Box18
		defaultScopeModel[83] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Import Box18
		defaultScopeModel[84] = new ModelRendererTurbo(this, 577, 177, textureX, textureY); // Import Box18
		defaultScopeModel[85] = new ModelRendererTurbo(this, 617, 177, textureX, textureY); // Import Box18
		defaultScopeModel[86] = new ModelRendererTurbo(this, 65, 257, textureX, textureY); // Import Box18
		defaultScopeModel[87] = new ModelRendererTurbo(this, 89, 257, textureX, textureY); // Import Box18
		defaultScopeModel[88] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Import Box18
		defaultScopeModel[89] = new ModelRendererTurbo(this, 729, 273, textureX, textureY); // Import Box18
		defaultScopeModel[90] = new ModelRendererTurbo(this, 793, 273, textureX, textureY); // Import Box18
		defaultScopeModel[91] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Import Box18
		defaultScopeModel[92] = new ModelRendererTurbo(this, 89, 281, textureX, textureY); // Import Box18
		defaultScopeModel[93] = new ModelRendererTurbo(this, 537, 281, textureX, textureY); // Import Box18
		defaultScopeModel[94] = new ModelRendererTurbo(this, 873, 257, textureX, textureY); // Import Box18
		defaultScopeModel[95] = new ModelRendererTurbo(this, 1009, 201, textureX, textureY); // Import Box18
		defaultScopeModel[96] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Import Box18
		defaultScopeModel[97] = new ModelRendererTurbo(this, 921, 305, textureX, textureY); // Import Box18
		defaultScopeModel[98] = new ModelRendererTurbo(this, 385, 345, textureX, textureY); // Import Box18
		defaultScopeModel[99] = new ModelRendererTurbo(this, 1001, 281, textureX, textureY); // Import Box18
		defaultScopeModel[100] = new ModelRendererTurbo(this, 657, 177, textureX, textureY); // Import Box18
		defaultScopeModel[101] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Import Box18
		defaultScopeModel[102] = new ModelRendererTurbo(this, 89, 313, textureX, textureY); // Import Box18
		defaultScopeModel[103] = new ModelRendererTurbo(this, 777, 201, textureX, textureY); // Import Box18
		defaultScopeModel[104] = new ModelRendererTurbo(this, 833, 201, textureX, textureY); // Import Box18
		defaultScopeModel[105] = new ModelRendererTurbo(this, 841, 177, textureX, textureY); // Import Box0
		defaultScopeModel[106] = new ModelRendererTurbo(this, 977, 161, textureX, textureY); // Import Box0
		defaultScopeModel[107] = new ModelRendererTurbo(this, 729, 169, textureX, textureY); // Import Box0
		defaultScopeModel[108] = new ModelRendererTurbo(this, 769, 169, textureX, textureY); // Import Box0
		defaultScopeModel[109] = new ModelRendererTurbo(this, 1017, 169, textureX, textureY); // Import Box0
		defaultScopeModel[110] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Import Box0
		defaultScopeModel[111] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Import Box0
		defaultScopeModel[112] = new ModelRendererTurbo(this, 345, 257, textureX, textureY); // Import Box18
		defaultScopeModel[113] = new ModelRendererTurbo(this, 953, 281, textureX, textureY); // Import Box18
		defaultScopeModel[114] = new ModelRendererTurbo(this, 577, 289, textureX, textureY); // Import Box18
		defaultScopeModel[115] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Import Box18
		defaultScopeModel[116] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import Box18
		defaultScopeModel[117] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Import Box18
		defaultScopeModel[118] = new ModelRendererTurbo(this, 929, 225, textureX, textureY); // Import Box18
		defaultScopeModel[119] = new ModelRendererTurbo(this, 977, 225, textureX, textureY); // Import Box18
		defaultScopeModel[120] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Import Box18
		defaultScopeModel[121] = new ModelRendererTurbo(this, 873, 161, textureX, textureY); // Import Box18
		defaultScopeModel[122] = new ModelRendererTurbo(this, 761, 233, textureX, textureY); // Import Box18

		defaultScopeModel[0].addShapeBox(44F, -20F, -6F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[0].setRotationPoint(-73.5F, -59F, 1F);

		defaultScopeModel[1].addShapeBox(44F, -20F, -6F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[1].setRotationPoint(-73.5F, -56F, 1F);

		defaultScopeModel[2].addShapeBox(44F, -20F, -6F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box18
		defaultScopeModel[2].setRotationPoint(-73.5F, -53F, 1F);

		defaultScopeModel[3].addShapeBox(44F, -20F, -6F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[3].setRotationPoint(-73.5F, -59F, 11F);

		defaultScopeModel[4].addShapeBox(44F, -20F, -6F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[4].setRotationPoint(-73.5F, -56F, 11F);

		defaultScopeModel[5].addShapeBox(44F, -20F, -6F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box18
		defaultScopeModel[5].setRotationPoint(-73.5F, -53F, 11F);

		defaultScopeModel[6].addShapeBox(44F, -20F, -6F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[6].setRotationPoint(-72F, -55.5F, 12F);

		defaultScopeModel[7].addShapeBox(44F, -20F, -6F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[7].setRotationPoint(-72F, -57.5F, 12F);

		defaultScopeModel[8].addShapeBox(44F, -20F, -6F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		defaultScopeModel[8].setRotationPoint(-72F, -53.5F, 12F);

		defaultScopeModel[9].addShapeBox(44F, -20F, -6F, 2, 1, 2, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box18
		defaultScopeModel[9].setRotationPoint(-70F, -58.5F, 12F);

		defaultScopeModel[10].addShapeBox(44F, -20F, -6F, 2, 1, 2, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box18
		defaultScopeModel[10].setRotationPoint(-70F, -51F, 12F);

		defaultScopeModel[11].addShapeBox(44F, -20F, -6F, 9, 2, 2, 0F,-1.8F, -6.55F, 0F, -0.25F, -1.55F, 0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3F, 5.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, -0.25F, -3F, 5.75F, -0.25F); // Import Box18
		defaultScopeModel[11].setRotationPoint(-74.75F, -59F, 12F);

		defaultScopeModel[12].addShapeBox(44F, -20F, -6F, 9, 2, 2, 0F,-0.25F, -1.55F, 0F, -1.8F, -6.55F, 0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1F, 0.75F, 0F, -3F, 5.75F, 0F, -3F, 5.75F, -0.25F, 1F, 0.75F, -0.25F); // Import Box18
		defaultScopeModel[12].setRotationPoint(-72.25F, -59F, 12F);

		defaultScopeModel[13].addShapeBox(44F, -20F, -6F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[13].setRotationPoint(-72F, -55.5F, -1F);

		defaultScopeModel[14].addShapeBox(44F, -20F, -6F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[14].setRotationPoint(-72F, -57.5F, -1F);

		defaultScopeModel[15].addShapeBox(44F, -20F, -6F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		defaultScopeModel[15].setRotationPoint(-72F, -53.5F, -1F);

		defaultScopeModel[16].addShapeBox(44F, -20F, -6F, 2, 1, 2, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box18
		defaultScopeModel[16].setRotationPoint(-70F, -58.5F, -0.7F);

		defaultScopeModel[17].addShapeBox(44F, -20F, -6F, 2, 1, 2, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box18
		defaultScopeModel[17].setRotationPoint(-70F, -51F, -0.7F);

		defaultScopeModel[18].addShapeBox(44F, -20F, -6F, 9, 2, 2, 0F,-1.8F, -6.55F, 0F, -0.25F, -1.55F, 0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3F, 5.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, -0.25F, -3F, 5.75F, -0.25F); // Import Box18
		defaultScopeModel[18].setRotationPoint(-74.75F, -59F, -0.7F);

		defaultScopeModel[19].addShapeBox(44F, -20F, -6F, 9, 2, 2, 0F,-0.25F, -1.55F, 0F, -1.8F, -6.55F, 0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1F, 0.75F, 0F, -3F, 5.75F, 0F, -3F, 5.75F, -0.25F, 1F, 0.75F, -0.25F); // Import Box18
		defaultScopeModel[19].setRotationPoint(-72.25F, -59F, -0.7F);

		defaultScopeModel[20].addShapeBox(44F, -20F, -6F, 9, 3, 2, 0F,-3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[20].setRotationPoint(-73.5F, -58F, 9F);

		defaultScopeModel[21].addShapeBox(44F, -20F, -6F, 9, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[21].setRotationPoint(-73.5F, -55F, 9F);

		defaultScopeModel[22].addShapeBox(44F, -20F, -6F, 9, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box18
		defaultScopeModel[22].setRotationPoint(-73.5F, -53F, 9F);

		defaultScopeModel[23].addShapeBox(44F, -20F, -6F, 9, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box18
		defaultScopeModel[23].setRotationPoint(-73.5F, -58F, 2F);

		defaultScopeModel[24].addShapeBox(44F, -20F, -6F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box18
		defaultScopeModel[24].setRotationPoint(-73.5F, -55F, 2F);

		defaultScopeModel[25].addShapeBox(44F, -20F, -6F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F); // Import Box18
		defaultScopeModel[25].setRotationPoint(-73.5F, -53F, 2F);

		defaultScopeModel[26].addShapeBox(44F, -20F, -6F, 6, 15, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[26].setRotationPoint(-72F, -66F, 3.5F);

		defaultScopeModel[27].addShapeBox(44F, -20F, -6F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[27].setRotationPoint(-65.5F, -55F, 3.5F);

		defaultScopeModel[28].addShapeBox(44F, -20F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[28].setRotationPoint(-65.5F, -56F, 3.5F);

		defaultScopeModel[29].addShapeBox(44F, -20F, -6F, 3, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[29].setRotationPoint(-66.5F, -55F, 1.5F);

		defaultScopeModel[30].addShapeBox(44F, -20F, -6F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box18
		defaultScopeModel[30].setRotationPoint(-63.5F, -55F, 1.5F);

		defaultScopeModel[31].addShapeBox(44F, -20F, -6F, 6, 2, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[31].setRotationPoint(-63.5F, -53F, 1.5F);

		defaultScopeModel[32].addShapeBox(44F, -20F, -6F, 2, 2, 8, 0F,0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[32].setRotationPoint(-57.5F, -53F, 1.5F);

		defaultScopeModel[33].addShapeBox(44F, -20F, -6F, 2, 2, 2, 0F,0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[33].setRotationPoint(-57.5F, -53F, 9.5F);

		defaultScopeModel[34].addShapeBox(44F, -20F, -6F, 6, 15, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[34].setRotationPoint(-72F, -66F, 5.5F);

		defaultScopeModel[35].addShapeBox(44F, -20F, -6F, 6, 15, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		defaultScopeModel[35].setRotationPoint(-72F, -66F, 7.5F);

		defaultScopeModel[36].addShapeBox(44F, -20F, -6F, 3, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[36].setRotationPoint(-62F, -54F, 10.5F);

		defaultScopeModel[37].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box18
		defaultScopeModel[37].setRotationPoint(-62F, -51F, 10.5F);

		defaultScopeModel[38].addShapeBox(44F, -20F, -6F, 2, 1, 2, 0F,0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Import Box0
		defaultScopeModel[38].setRotationPoint(-61.15F, -53.25F, 11F);

		defaultScopeModel[39].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		defaultScopeModel[39].setRotationPoint(-60.9F, -52.5F, 11F);

		defaultScopeModel[40].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		defaultScopeModel[40].setRotationPoint(-60.9F, -54F, 11F);

		defaultScopeModel[41].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		defaultScopeModel[41].setRotationPoint(-61.65F, -54F, 11F);

		defaultScopeModel[42].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,-0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		defaultScopeModel[42].setRotationPoint(-60.4F, -54F, 11F);

		defaultScopeModel[43].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F); // Import Box0
		defaultScopeModel[43].setRotationPoint(-61.65F, -52.75F, 11F);

		defaultScopeModel[44].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F); // Import Box0
		defaultScopeModel[44].setRotationPoint(-60.4F, -52.75F, 11F);

		defaultScopeModel[45].addShapeBox(44F, -20F, -6F, 6, 6, 2, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import Box18
		defaultScopeModel[45].setRotationPoint(-72.15F, -63F, 5.35F);

		defaultScopeModel[46].addShapeBox(44F, -20F, -6F, 6, 6, 2, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1.5F, 0.5F, 0.25F, -1.75F, 0.5F, 0.25F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.25F, -1.75F, 0F, 0.25F); // Import Box18
		defaultScopeModel[46].setRotationPoint(-72.15F, -63F, 7.6F);

		defaultScopeModel[47].addShapeBox(44F, -20F, -6F, 6, 6, 2, 0F,-1.75F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, -1.75F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import Box18
		defaultScopeModel[47].setRotationPoint(-72.15F, -63F, 3.1F);

		defaultScopeModel[48].addShapeBox(44F, -20F, -6F, 2, 1, 3, 0F,-0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F); // Import Box18
		defaultScopeModel[48].setRotationPoint(-71F, -67.5F, 5F);

		defaultScopeModel[49].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Import Box18
		defaultScopeModel[49].setRotationPoint(-71F, -69F, 4.5F);

		defaultScopeModel[50].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,-0.25F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Import Box18
		defaultScopeModel[50].setRotationPoint(-71F, -69F, 7.5F);

		defaultScopeModel[51].addShapeBox(44F, -20F, -6F, 2, 1, 2, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box18
		defaultScopeModel[51].setRotationPoint(-71F, -70.5F, 5.5F);

		defaultScopeModel[52].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, -0.25F, 0F, -0.99F); // Import Box18
		defaultScopeModel[52].setRotationPoint(-71F, -70F, 5.5F);

		defaultScopeModel[53].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,-0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box18
		defaultScopeModel[53].setRotationPoint(-71F, -70F, 6.5F);

		defaultScopeModel[54].addShapeBox(44F, -20F, -6F, 6, 3, 1, 0F,-1F, 0.5F, 0F, -1F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		defaultScopeModel[54].setRotationPoint(-72F, -69.5F, 8.5F);

		defaultScopeModel[55].addShapeBox(44F, -20F, -6F, 6, 3, 1, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box18
		defaultScopeModel[55].setRotationPoint(-72F, -69.5F, 3.5F);

		defaultScopeModel[56].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,-0.25F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box18
		defaultScopeModel[56].setRotationPoint(-71F, -68F, 6.5F);

		defaultScopeModel[57].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, -0.25F, 0F, -0.99F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Import Box18
		defaultScopeModel[57].setRotationPoint(-71F, -68F, 5.5F);

		defaultScopeModel[58].addShapeBox(44F, -20F, -6F, 1, 1, 3, 0F,-0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F); // Import Box18
		defaultScopeModel[58].setRotationPoint(-69.25F, -67.5F, 5F);

		defaultScopeModel[59].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[59].setRotationPoint(-68.5F, -67.5F, 4.5F);

		defaultScopeModel[60].addShapeBox(44F, -20F, -6F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[60].setRotationPoint(-68.5F, -67.5F, 7.5F);

		defaultScopeModel[61].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, -0.25F, 0F, 0F); // Import Box18
		defaultScopeModel[61].setRotationPoint(-67F, -67.5F, 7.5F);

		defaultScopeModel[62].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box18
		defaultScopeModel[62].setRotationPoint(-67F, -67.5F, 4.5F);

		defaultScopeModel[63].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box18
		defaultScopeModel[63].setRotationPoint(-67F, -67.5F, 5.5F);

		defaultScopeModel[64].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box18
		defaultScopeModel[64].setRotationPoint(-68.75F, -67.5F, 6.5F);

		defaultScopeModel[65].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F); // Import Box18
		defaultScopeModel[65].setRotationPoint(-68.75F, -67.5F, 5.5F);

		defaultScopeModel[66].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,-0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box18
		defaultScopeModel[66].setRotationPoint(-67.5F, -67.5F, 6.5F);

		defaultScopeModel[67].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F); // Import Box18
		defaultScopeModel[67].setRotationPoint(-67.5F, -67.5F, 5.5F);

		defaultScopeModel[68].addShapeBox(44F, -20F, -6F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[68].setRotationPoint(152.5F, -59F, 1F);

		defaultScopeModel[69].addShapeBox(44F, -20F, -6F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[69].setRotationPoint(152.5F, -56F, 1F);

		defaultScopeModel[70].addShapeBox(44F, -20F, -6F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box18
		defaultScopeModel[70].setRotationPoint(152.5F, -53F, 1F);

		defaultScopeModel[71].addShapeBox(44F, -20F, -6F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[71].setRotationPoint(152.5F, -59F, 11F);

		defaultScopeModel[72].addShapeBox(44F, -20F, -6F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[72].setRotationPoint(152.5F, -56F, 11F);

		defaultScopeModel[73].addShapeBox(44F, -20F, -6F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box18
		defaultScopeModel[73].setRotationPoint(152.5F, -53F, 11F);

		defaultScopeModel[74].addShapeBox(44F, -20F, -6F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[74].setRotationPoint(154F, -55.5F, 12F);

		defaultScopeModel[75].addShapeBox(44F, -20F, -6F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[75].setRotationPoint(154F, -57.5F, 12F);

		defaultScopeModel[76].addShapeBox(44F, -20F, -6F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		defaultScopeModel[76].setRotationPoint(154F, -53.5F, 12F);

		defaultScopeModel[77].addShapeBox(44F, -20F, -6F, 2, 1, 2, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box18
		defaultScopeModel[77].setRotationPoint(156F, -58.5F, 12F);

		defaultScopeModel[78].addShapeBox(44F, -20F, -6F, 2, 1, 2, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box18
		defaultScopeModel[78].setRotationPoint(156F, -51F, 12F);

		defaultScopeModel[79].addShapeBox(44F, -20F, -6F, 9, 2, 2, 0F,-1.8F, -6.55F, 0F, -0.25F, -1.55F, 0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3F, 5.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, -0.25F, -3F, 5.75F, -0.25F); // Import Box18
		defaultScopeModel[79].setRotationPoint(151.25F, -59F, 12F);

		defaultScopeModel[80].addShapeBox(44F, -20F, -6F, 9, 2, 2, 0F,-0.25F, -1.55F, 0F, -1.8F, -6.55F, 0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1F, 0.75F, 0F, -3F, 5.75F, 0F, -3F, 5.75F, -0.25F, 1F, 0.75F, -0.25F); // Import Box18
		defaultScopeModel[80].setRotationPoint(153.75F, -59F, 12F);

		defaultScopeModel[81].addShapeBox(44F, -20F, -6F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[81].setRotationPoint(154F, -55.5F, -1F);

		defaultScopeModel[82].addShapeBox(44F, -20F, -6F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[82].setRotationPoint(154F, -57.5F, -1F);

		defaultScopeModel[83].addShapeBox(44F, -20F, -6F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		defaultScopeModel[83].setRotationPoint(154F, -53.5F, -1F);

		defaultScopeModel[84].addShapeBox(44F, -20F, -6F, 2, 1, 2, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box18
		defaultScopeModel[84].setRotationPoint(156F, -58.5F, -0.7F);

		defaultScopeModel[85].addShapeBox(44F, -20F, -6F, 2, 1, 2, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box18
		defaultScopeModel[85].setRotationPoint(156F, -51F, -0.7F);

		defaultScopeModel[86].addShapeBox(44F, -20F, -6F, 9, 2, 2, 0F,-1.8F, -6.55F, 0F, -0.25F, -1.55F, 0F, -0.25F, -1.55F, -0.25F, -1.8F, -6.55F, -0.25F, -3F, 5.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, -0.25F, -3F, 5.75F, -0.25F); // Import Box18
		defaultScopeModel[86].setRotationPoint(151.25F, -59F, -0.7F);

		defaultScopeModel[87].addShapeBox(44F, -20F, -6F, 9, 2, 2, 0F,-0.25F, -1.55F, 0F, -1.8F, -6.55F, 0F, -1.8F, -6.55F, -0.25F, -0.25F, -1.55F, -0.25F, 1F, 0.75F, 0F, -3F, 5.75F, 0F, -3F, 5.75F, -0.25F, 1F, 0.75F, -0.25F); // Import Box18
		defaultScopeModel[87].setRotationPoint(153.75F, -59F, -0.7F);

		defaultScopeModel[88].addShapeBox(44F, -20F, -6F, 9, 3, 2, 0F,-3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[88].setRotationPoint(152.5F, -58F, 9F);

		defaultScopeModel[89].addShapeBox(44F, -20F, -6F, 9, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[89].setRotationPoint(152.5F, -55F, 9F);

		defaultScopeModel[90].addShapeBox(44F, -20F, -6F, 9, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box18
		defaultScopeModel[90].setRotationPoint(152.5F, -53F, 9F);

		defaultScopeModel[91].addShapeBox(44F, -20F, -6F, 9, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box18
		defaultScopeModel[91].setRotationPoint(152.5F, -58F, 2F);

		defaultScopeModel[92].addShapeBox(44F, -20F, -6F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box18
		defaultScopeModel[92].setRotationPoint(152.5F, -55F, 2F);

		defaultScopeModel[93].addShapeBox(44F, -20F, -6F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F); // Import Box18
		defaultScopeModel[93].setRotationPoint(152.5F, -53F, 2F);

		defaultScopeModel[94].addShapeBox(44F, -20F, -6F, 6, 13, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[94].setRotationPoint(154F, -64F, 3.5F);

		defaultScopeModel[95].addShapeBox(44F, -20F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[95].setRotationPoint(160.5F, -56F, 3.5F);

		defaultScopeModel[96].addShapeBox(44F, -20F, -6F, 3, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[96].setRotationPoint(159.5F, -55F, 1.5F);

		defaultScopeModel[97].addShapeBox(44F, -20F, -6F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box18
		defaultScopeModel[97].setRotationPoint(162.5F, -55F, 1.5F);

		defaultScopeModel[98].addShapeBox(44F, -20F, -6F, 6, 2, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[98].setRotationPoint(162.5F, -53F, 1.5F);

		defaultScopeModel[99].addShapeBox(44F, -20F, -6F, 2, 2, 8, 0F,0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[99].setRotationPoint(168.5F, -53F, 1.5F);

		defaultScopeModel[100].addShapeBox(44F, -20F, -6F, 2, 2, 2, 0F,0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[100].setRotationPoint(168.5F, -53F, 9.5F);

		defaultScopeModel[101].addShapeBox(44F, -20F, -6F, 6, 13, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[101].setRotationPoint(154F, -64F, 5.5F);

		defaultScopeModel[102].addShapeBox(44F, -20F, -6F, 6, 13, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		defaultScopeModel[102].setRotationPoint(154F, -64F, 7.5F);

		defaultScopeModel[103].addShapeBox(44F, -20F, -6F, 3, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[103].setRotationPoint(164F, -54F, 10.5F);

		defaultScopeModel[104].addShapeBox(44F, -20F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box18
		defaultScopeModel[104].setRotationPoint(164F, -51F, 10.5F);

		defaultScopeModel[105].addShapeBox(44F, -20F, -6F, 2, 1, 2, 0F,0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Import Box0
		defaultScopeModel[105].setRotationPoint(164.85F, -53.25F, 11F);

		defaultScopeModel[106].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		defaultScopeModel[106].setRotationPoint(165.1F, -52.5F, 11F);

		defaultScopeModel[107].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		defaultScopeModel[107].setRotationPoint(165.1F, -54F, 11F);

		defaultScopeModel[108].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		defaultScopeModel[108].setRotationPoint(164.35F, -54F, 11F);

		defaultScopeModel[109].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,-0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		defaultScopeModel[109].setRotationPoint(165.6F, -54F, 11F);

		defaultScopeModel[110].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F); // Import Box0
		defaultScopeModel[110].setRotationPoint(164.35F, -52.75F, 11F);

		defaultScopeModel[111].addShapeBox(44F, -20F, -6F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F); // Import Box0
		defaultScopeModel[111].setRotationPoint(165.6F, -52.75F, 11F);

		defaultScopeModel[112].addShapeBox(44F, -20F, -6F, 6, 6, 2, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import Box18
		defaultScopeModel[112].setRotationPoint(153.85F, -61F, 5.35F);

		defaultScopeModel[113].addShapeBox(44F, -20F, -6F, 6, 6, 2, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1.5F, 0.5F, 0.25F, -1.75F, 0.5F, 0.25F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.25F, -1.75F, 0F, 0.25F); // Import Box18
		defaultScopeModel[113].setRotationPoint(153.85F, -61F, 7.6F);

		defaultScopeModel[114].addShapeBox(44F, -20F, -6F, 6, 6, 2, 0F,-1.75F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0.5F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, -1.75F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import Box18
		defaultScopeModel[114].setRotationPoint(153.85F, -61F, 3.1F);

		defaultScopeModel[115].addShapeBox(44F, -20F, -6F, 2, 1, 5, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Import Box18
		defaultScopeModel[115].setRotationPoint(156F, -66.5F, 4F);

		defaultScopeModel[116].addShapeBox(44F, -20F, -6F, 6, 4, 1, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -1.35F, 0.5F, 0F, -1.35F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.35F, 0F, 0F, -1.35F, 0F, 0F); // Import Box18
		defaultScopeModel[116].setRotationPoint(154F, -69.5F, 2.5F);

		defaultScopeModel[117].addShapeBox(44F, -20F, -6F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[117].setRotationPoint(156.5F, -70.5F, 6F);

		defaultScopeModel[118].addShapeBox(44F, -20F, -6F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[118].setRotationPoint(154F, -65.5F, 5.5F);

		defaultScopeModel[119].addShapeBox(44F, -20F, -6F, 6, 1, 2, 0F,-2F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		defaultScopeModel[119].setRotationPoint(154F, -65.5F, 3.5F);

		defaultScopeModel[120].addShapeBox(44F, -20F, -6F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		defaultScopeModel[120].setRotationPoint(154F, -65.5F, 7.5F);

		defaultScopeModel[121].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import Box18
		defaultScopeModel[121].setRotationPoint(156.5F, -67.5F, 6F);

		defaultScopeModel[122].addShapeBox(44F, -20F, -6F, 6, 4, 1, 0F,-1.35F, 0.5F, 0F, -1.35F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -1.35F, 0F, 0F, -1.35F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box18
		defaultScopeModel[122].setRotationPoint(154F, -69.5F, 9.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 929, 233, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 585, 241, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 609, 241, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 625, 241, textureX, textureY); // Import Box0
		ammoModel[6] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Import Box0
		ammoModel[7] = new ModelRendererTurbo(this, 569, 225, textureX, textureY); // Import Box0
		ammoModel[8] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Import Box0
		ammoModel[9] = new ModelRendererTurbo(this, 825, 249, textureX, textureY); // Import Box0
		ammoModel[10] = new ModelRendererTurbo(this, 849, 249, textureX, textureY); // Import Box0
		ammoModel[11] = new ModelRendererTurbo(this, 641, 257, textureX, textureY); // Import Box0
		ammoModel[12] = new ModelRendererTurbo(this, 657, 257, textureX, textureY); // Import Box0
		ammoModel[13] = new ModelRendererTurbo(this, 513, 201, textureX, textureY); // Import Box0

		ammoModel[0].addShapeBox(44F, -20F, -6F, 34, 29, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-14F, -3F, 1F);

		ammoModel[1].addShapeBox(44F, -20F, -6F, 34, 17, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 5F, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-14F, 26F, 1F);

		ammoModel[2].addShapeBox(44F, -20F, -6F, 7, 44, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.25F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 1.25F, -0.5F); // Import Box0
		ammoModel[2].setRotationPoint(13F, -3F, 0.5F);

		ammoModel[3].addShapeBox(44F, -20F, -6F, 8, 46, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 1.6F, -0.5F); // Import Box0
		ammoModel[3].setRotationPoint(2F, -3F, 0.5F);

		ammoModel[4].addShapeBox(44F, -20F, -6F, 6, 48, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.45F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, -0.5F, 1.45F, -0.5F); // Import Box0
		ammoModel[4].setRotationPoint(-7F, -3F, 0.5F);

		ammoModel[5].addShapeBox(44F, -20F, -6F, 4, 51, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F); // Import Box0
		ammoModel[5].setRotationPoint(-14.5F, -3F, 0.5F);

		ammoModel[6].addShapeBox(44F, -20F, -6F, 4, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.3F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -0.5F, -0.5F, 1.3F, -0.5F); // Import Box0
		ammoModel[6].setRotationPoint(-1.5F, 42F, 0.5F);

		ammoModel[7].addShapeBox(44F, -20F, -6F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		ammoModel[7].setRotationPoint(-1.5F, 41F, 0.5F);

		ammoModel[8].addShapeBox(44F, -20F, -6F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[8].setRotationPoint(2F, 41F, 0.5F);

		ammoModel[9].addShapeBox(44F, -20F, -6F, 7, 44, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.25F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 1.25F, -0.5F); // Import Box0
		ammoModel[9].setRotationPoint(13F, -3F, 12F);

		ammoModel[10].addShapeBox(44F, -20F, -6F, 8, 46, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 1.6F, -0.5F); // Import Box0
		ammoModel[10].setRotationPoint(2F, -3F, 12F);

		ammoModel[11].addShapeBox(44F, -20F, -6F, 6, 48, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.45F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, -0.5F, 1.45F, -0.5F); // Import Box0
		ammoModel[11].setRotationPoint(-7F, -3F, 12F);

		ammoModel[12].addShapeBox(44F, -20F, -6F, 4, 51, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -1.5F, 0F, -0.5F); // Import Box0
		ammoModel[12].setRotationPoint(-14.5F, -3F, 12F);

		ammoModel[13].addShapeBox(44F, -20F, -6F, 4, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1.3F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -0.5F, -0.5F, 1.3F, -0.5F); // Import Box0
		ammoModel[13].setRotationPoint(-1.5F, 42F, 12F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box0
		slideModel[3] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		slideModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		slideModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box0
		slideModel[6] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box0
		slideModel[7] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import Box0
		slideModel[8] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Import Box0
		slideModel[9] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		slideModel[10] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import Box0
		slideModel[11] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box0
		slideModel[12] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		slideModel[13] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		slideModel[14] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		slideModel[15] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box0
		slideModel[16] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Import Box0
		slideModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box0
		slideModel[18] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import Box0
		slideModel[19] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box0
		slideModel[20] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box0
		slideModel[21] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import Box0
		slideModel[22] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import Box0
		slideModel[23] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Import Box0
		slideModel[24] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Import Box0
		slideModel[25] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Import Box0
		slideModel[26] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import Box0
		slideModel[27] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Import Box0
		slideModel[28] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Import Box0
		slideModel[29] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Import Box0
		slideModel[30] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Import Box0
		slideModel[31] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Import Box0
		slideModel[32] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Import Box0
		slideModel[33] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Import Box0
		slideModel[34] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Import Box0
		slideModel[35] = new ModelRendererTurbo(this, 841, 9, textureX, textureY); // Import Box0
		slideModel[36] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Import Box0

		slideModel[0].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[0].setRotationPoint(54.5F, -44.25F, 11.5F);

		slideModel[1].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,-1.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[1].setRotationPoint(52.75F, -44.25F, 11.5F);

		slideModel[2].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[2].setRotationPoint(56.25F, -44.25F, 11.5F);

		slideModel[3].addShapeBox(44F, -20F, -6F, 4, 1, 1, 0F,0.5F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Import Box0
		slideModel[3].setRotationPoint(53F, -42.5F, 11.5F);

		slideModel[4].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import Box0
		slideModel[4].setRotationPoint(56.25F, -41F, 11.5F);

		slideModel[5].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[5].setRotationPoint(54.5F, -40.75F, 11.5F);

		slideModel[6].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1.5F, 0.5F, 0F); // Import Box0
		slideModel[6].setRotationPoint(52.75F, -41F, 11.5F);

		slideModel[7].addShapeBox(44F, -20F, -6F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		slideModel[7].setRotationPoint(53.6F, -42.65F, 12.5F);

		slideModel[8].addShapeBox(44F, -20F, -6F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		slideModel[8].setRotationPoint(53.6F, -41.65F, 12.5F);

		slideModel[9].addShapeBox(44F, -20F, -6F, 3, 1, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		slideModel[9].setRotationPoint(53.6F, -43.65F, 12.5F);

		slideModel[10].addShapeBox(44F, -20F, -6F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		slideModel[10].setRotationPoint(54.1F, -43.15F, 9.5F);

		slideModel[11].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[11].setRotationPoint(54.5F, -44.25F, 18.5F);

		slideModel[12].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,-1.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[12].setRotationPoint(52.75F, -44.25F, 18.5F);

		slideModel[13].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[13].setRotationPoint(56.25F, -44.25F, 18.5F);

		slideModel[14].addShapeBox(44F, -20F, -6F, 4, 1, 1, 0F,0.5F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Import Box0
		slideModel[14].setRotationPoint(53F, -42.5F, 18.5F);

		slideModel[15].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import Box0
		slideModel[15].setRotationPoint(56.25F, -41F, 18.5F);

		slideModel[16].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[16].setRotationPoint(54.5F, -40.75F, 18.5F);

		slideModel[17].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1.5F, 0.5F, 0F); // Import Box0
		slideModel[17].setRotationPoint(52.75F, -41F, 18.5F);

		slideModel[18].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[18].setRotationPoint(54.5F, -44.25F, 17.5F);

		slideModel[19].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,-1.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0.25F, 0.25F, -1F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[19].setRotationPoint(52.75F, -44.25F, 17.5F);

		slideModel[20].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.5F, -1F, -1.25F, 0.5F, -1F, -1.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[20].setRotationPoint(56.25F, -44.25F, 17.5F);

		slideModel[21].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, -1F, -1.25F, 0.5F, -1F, -1.25F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import Box0
		slideModel[21].setRotationPoint(56.25F, -41F, 17.5F);

		slideModel[22].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, -1F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[22].setRotationPoint(54.5F, -40.75F, 17.5F);

		slideModel[23].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.25F, -1F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, -1.5F, 0.5F, 0F); // Import Box0
		slideModel[23].setRotationPoint(52.75F, -41F, 17.5F);

		slideModel[24].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[24].setRotationPoint(54.5F, -42.5F, 16.5F);

		slideModel[25].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, -1F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[25].setRotationPoint(52.75F, -42.5F, 17.5F);

		slideModel[26].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.25F, 0.5F, -1F, 0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Import Box0
		slideModel[26].setRotationPoint(56.5F, -42.5F, 17.5F);

		slideModel[27].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -1F, 0.5F, 0.25F, 0F); // Import Box0
		slideModel[27].setRotationPoint(56.5F, -42.5F, 12.5F);

		slideModel[28].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, -1F, 0.25F, 0.5F, -1F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -1F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[28].setRotationPoint(56.25F, -44.25F, 12.5F);

		slideModel[29].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[29].setRotationPoint(54.5F, -42.5F, 12.5F);

		slideModel[30].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,-1.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, -1.5F, 0.5F, -1F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, -1F); // Import Box0
		slideModel[30].setRotationPoint(52.75F, -44.25F, 12.5F);

		slideModel[31].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0.25F, 0.5F, -1F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		slideModel[31].setRotationPoint(54.5F, -44.25F, 12.5F);

		slideModel[32].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.5F, -1F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, -1F); // Import Box0
		slideModel[32].setRotationPoint(52.75F, -42.5F, 12.5F);

		slideModel[33].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, -1F, -1.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, -1.5F, 0.5F, -1F); // Import Box0
		slideModel[33].setRotationPoint(52.75F, -41F, 12.5F);

		slideModel[34].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -1F, 0.25F, 0.25F, -1F); // Import Box0
		slideModel[34].setRotationPoint(54.5F, -40.75F, 12.5F);

		slideModel[35].addShapeBox(44F, -20F, -6F, 1, 1, 1, 0F,0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -1F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, -1F, 0.25F, 0.5F, -1F); // Import Box0
		slideModel[35].setRotationPoint(56.25F, -41F, 12.5F);

		slideModel[36].addBox(44F, -20F, -6F, 46, 8, 7, 0F); // Import Box0
		slideModel[36].setRotationPoint(-25F, -34F, -1F);
	}
}