//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ak
// Model Creator: 
// Created on: 01.08.2018 - 14:24:49
// Last changed on: 01.08.2018 - 14:24:49

package com.modularwarfare.client.model.mwp; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

//import com.flansmod.client.model.EnumAnimationType;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class akm extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public akm() //Same as Filename
	{
		modelScale = 0.18F;
		gunModel = new ModelRendererTurbo[507];
		defaultBarrelModel = new ModelRendererTurbo[18];
		ammoModel = new ModelRendererTurbo[180];
		slideModel = new ModelRendererTurbo[16];
		fullammoModel = new ModelRendererTurbo[16];

		initgunModel_1();
		initgunModel_2();
		initdefaultBarrelModel_1();
		initammoModel_1();
		initslideModel_1();
		initfullammoModel_1();

		gripAttachPoint = new Vector3f(55 /16F, 16F /16F, 0F /16F);


		translateAll(0F, -12.0F, -0.1F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.12F, 0F);//forward/up/?

		gunSlideDistance = .75F;
		//animationType = EnumAnimationType.CUSTOM;

		rotateGunVertical = 20F;
		rotateGunHorizontal = 1F;
		tiltGun = 20F;
		tiltGunTime = 0.15F;
		unloadClipTime = 0.35F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.15F;
		translateGun = new Vector3f(1 /16F, 1F /16F, -1F /16F);
		rotateClipVertical = -80F;
		rotateClipHorizontal = 1F;
		tiltClip = 0F;
		translateClip = new Vector3f(-5 /16F, -30F /16F, 5F /16F);
		

		hasFlash = false;
        hasArms = true;
        
        leftArmPos = new Vector3f(-0.01F, -0.30F, 0.01F);
        leftArmRot = new Vector3f(60.0F, 45.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.20F, -0.38F, 0.04F);
        leftArmReloadRot = new Vector3f(60.0F, 55.0F, -0.0F);
        
 
        rightArmPos = new Vector3f(0.23F, -0.75F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.23F, -0.75F, 0.05F);
        rightArmReloadRot = new Vector3f(-0.0F, 0.0F, -90.0F);
        rightArmChargePos = new Vector3f(-0.20F, 0.42F, -0.31F);
        rightArmChargeRot = new Vector3f(-30.0F, -0.0F, -60.0F);
        
        rightArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
        leftArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
 
        leftHandAmmo = true;
        
		//RecoilSlideDistance = 0.15F;
		//RotateSlideDistance = -2F;
		
		casingAnimDistance = new Vector3f(-5, -1, 12);
	    casingAnimSpread = new Vector3f(2, 2, 0);
	    casingAnimTime = 8;  
	    casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);
	    
		crouchZoom = -0.25F;
		fancyStance = true;
		sprintRotate = new Vector3f(40.0F, 0.0F, -0.0F);
		sprintTranslate = new Vector3f(0.4F, 0.0F, 0.0F);
		
	    chargeHandleDistance = 0.9F;
	    chargeDelay = 0;
	    chargeDelayAfterReload = 65;
	    chargeTime = 7;
	    
	    rightHandCharge = true;
	    chargeModifier = new Vector3f (16.0F, 8.0F, 16.0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		gunModel[34] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import Box0
		gunModel[35] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		gunModel[36] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import Box0
		gunModel[37] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Box0
		gunModel[38] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box0
		gunModel[39] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box0
		gunModel[40] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box0
		gunModel[41] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import Box0
		gunModel[42] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box0
		gunModel[43] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Box0
		gunModel[44] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box0
		gunModel[45] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		gunModel[46] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box0
		gunModel[47] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import Box0
		gunModel[48] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box0
		gunModel[49] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import Box0
		gunModel[50] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box0
		gunModel[51] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		gunModel[52] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		gunModel[53] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Import Box0
		gunModel[54] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Import Box0
		gunModel[55] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Import Box0
		gunModel[56] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Import Box0
		gunModel[57] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Import Box0
		gunModel[58] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Box0
		gunModel[59] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box0
		gunModel[60] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Import Box0
		gunModel[61] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box0
		gunModel[62] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box0
		gunModel[63] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Import Box0
		gunModel[64] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box0
		gunModel[65] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box0
		gunModel[66] = new ModelRendererTurbo(this, 665, 9, textureX, textureY); // Import Box0
		gunModel[67] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box0
		gunModel[68] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Import Box0
		gunModel[69] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Import Box0
		gunModel[70] = new ModelRendererTurbo(this, 713, 9, textureX, textureY); // Import Box0
		gunModel[71] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Import Box0
		gunModel[72] = new ModelRendererTurbo(this, 753, 9, textureX, textureY); // Import Box0
		gunModel[73] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Import Box0
		gunModel[74] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Import Box0
		gunModel[75] = new ModelRendererTurbo(this, 921, 9, textureX, textureY); // Import Box0
		gunModel[76] = new ModelRendererTurbo(this, 937, 9, textureX, textureY); // Import Box0
		gunModel[77] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Import Box0
		gunModel[78] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Import Box0
		gunModel[79] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import Box0
		gunModel[80] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import Box0
		gunModel[81] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import Box0
		gunModel[82] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import Box0
		gunModel[83] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[84] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import Box0
		gunModel[85] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[86] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Import Box0
		gunModel[87] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Import Box0
		gunModel[88] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Import Box0
		gunModel[89] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import Box0
		gunModel[90] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box0
		gunModel[91] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import Box0
		gunModel[92] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import Box0
		gunModel[93] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Import Box0
		gunModel[94] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Import Box0
		gunModel[95] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Import Box0
		gunModel[96] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Import Box0
		gunModel[97] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Import Box0
		gunModel[98] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Import Box0
		gunModel[99] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Import Box0
		gunModel[100] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Import Box0
		gunModel[101] = new ModelRendererTurbo(this, 969, 17, textureX, textureY); // Import Box0
		gunModel[102] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box0
		gunModel[103] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import Box0
		gunModel[104] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box0
		gunModel[105] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import Box0
		gunModel[106] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import Box0
		gunModel[107] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import Box0
		gunModel[108] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Import Box0
		gunModel[109] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import Box0
		gunModel[110] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import Box0
		gunModel[111] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Import Box0
		gunModel[112] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Import Box0
		gunModel[113] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Import Box0
		gunModel[114] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Import Box0
		gunModel[115] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Import Box0
		gunModel[116] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Import Box0
		gunModel[117] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Import Box0
		gunModel[118] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Import Box0
		gunModel[119] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Import Box0
		gunModel[120] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Import Box0
		gunModel[121] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box0
		gunModel[122] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		gunModel[123] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Import Box0
		gunModel[124] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Import Box0
		gunModel[125] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Import Box0
		gunModel[126] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Import Box0
		gunModel[127] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Import Box0
		gunModel[128] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Import Box0
		gunModel[129] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Import Box0
		gunModel[130] = new ModelRendererTurbo(this, 673, 25, textureX, textureY); // Import Box0
		gunModel[131] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Import Box0
		gunModel[132] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Import Box0
		gunModel[133] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Import Box0
		gunModel[134] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Import Box0
		gunModel[135] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Box0
		gunModel[136] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import Box0
		gunModel[137] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import Box0
		gunModel[138] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import Box0
		gunModel[139] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import Box0
		gunModel[140] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Import Box0
		gunModel[141] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box0
		gunModel[142] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import Box0
		gunModel[143] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import Box0
		gunModel[144] = new ModelRendererTurbo(this, 825, 25, textureX, textureY); // Import Box152
		gunModel[145] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Import Box153
		gunModel[146] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Import Box154
		gunModel[147] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box155
		gunModel[148] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Box156
		gunModel[149] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Import Box0
		gunModel[150] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Import Box0
		gunModel[151] = new ModelRendererTurbo(this, 961, 25, textureX, textureY); // Import Box0
		gunModel[152] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Import Box0
		gunModel[153] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Import Box0
		gunModel[154] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Import Box0
		gunModel[155] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box0
		gunModel[156] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import Box0
		gunModel[157] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Import Box0
		gunModel[158] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import Box0
		gunModel[159] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import Box0
		gunModel[160] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import Box0
		gunModel[161] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import Box0
		gunModel[162] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Import Box0
		gunModel[163] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Import Box0
		gunModel[164] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Import Box0
		gunModel[165] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import Box0
		gunModel[166] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Import Box0
		gunModel[167] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Import Box0
		gunModel[168] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Import Box0
		gunModel[169] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Import Box0
		gunModel[170] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Import Box0
		gunModel[171] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Import Box0
		gunModel[172] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import Box0
		gunModel[173] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import Box0
		gunModel[174] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box0
		gunModel[175] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Import Box0
		gunModel[176] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Import Box0
		gunModel[177] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Import Box0
		gunModel[178] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import Box220
		gunModel[179] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import Box221
		gunModel[180] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Import Box0
		gunModel[181] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Import Box0
		gunModel[182] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Import Box0
		gunModel[183] = new ModelRendererTurbo(this, 609, 25, textureX, textureY); // Import Box0
		gunModel[184] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Import Box0
		gunModel[185] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Import Box0
		gunModel[186] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Import Box0
		gunModel[187] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Import Box0
		gunModel[188] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Import Box0
		gunModel[189] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Import Box0
		gunModel[190] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Import Box0
		gunModel[191] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Import Box0
		gunModel[192] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box0
		gunModel[193] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Import Box0
		gunModel[194] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Import Box0
		gunModel[195] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Import Box0
		gunModel[196] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Import Box0
		gunModel[197] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import Box0
		gunModel[198] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Import Box0
		gunModel[199] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Import Box0
		gunModel[200] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Import Box0
		gunModel[201] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Import Box0
		gunModel[202] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Import Box0
		gunModel[203] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Import Box0
		gunModel[204] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Import Box0
		gunModel[205] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Import Box0
		gunModel[206] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Import Box0
		gunModel[207] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Import Box0
		gunModel[208] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Import Box0
		gunModel[209] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Import Box0
		gunModel[210] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Import Box0
		gunModel[211] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Import Box0
		gunModel[212] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Import Box0
		gunModel[213] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Import Box0
		gunModel[214] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Import Box0
		gunModel[215] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Import Box0
		gunModel[216] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Import Box0
		gunModel[217] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Import Box0
		gunModel[218] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import Box0
		gunModel[219] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Import Box0
		gunModel[220] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Import Box0
		gunModel[221] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Import Box0
		gunModel[222] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Import Box0
		gunModel[223] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Import Box0
		gunModel[224] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Import Box0
		gunModel[225] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Import Box0
		gunModel[226] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Import Box0
		gunModel[227] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Import Box0
		gunModel[228] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Import Box0
		gunModel[229] = new ModelRendererTurbo(this, 545, 41, textureX, textureY); // Import Box0
		gunModel[230] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Import Box0
		gunModel[231] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Import Box0
		gunModel[232] = new ModelRendererTurbo(this, 617, 41, textureX, textureY); // Import Box0
		gunModel[233] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Import Box0
		gunModel[234] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Import Box0
		gunModel[235] = new ModelRendererTurbo(this, 689, 41, textureX, textureY); // Import Box0
		gunModel[236] = new ModelRendererTurbo(this, 713, 41, textureX, textureY); // Import Box0
		gunModel[237] = new ModelRendererTurbo(this, 737, 41, textureX, textureY); // Import Box0
		gunModel[238] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Import Box0
		gunModel[239] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import Box0
		gunModel[240] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Import Box0
		gunModel[241] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Import Box0
		gunModel[242] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Import Box0
		gunModel[243] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Import Box0
		gunModel[244] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Import Box0
		gunModel[245] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Import Box0
		gunModel[246] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Import Box0
		gunModel[247] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Import Box297
		gunModel[248] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Import Box298
		gunModel[249] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Import Box299
		gunModel[250] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Import Box0
		gunModel[251] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Import Box301
		gunModel[252] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Import Box0
		gunModel[253] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Import Box303
		gunModel[254] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box0
		gunModel[255] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[256] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Import Box0
		gunModel[257] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Import Box0
		gunModel[258] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Import Box0
		gunModel[259] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Import Box0
		gunModel[260] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Import Box0
		gunModel[261] = new ModelRendererTurbo(this, 905, 41, textureX, textureY); // Import Box0
		gunModel[262] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Import Box0
		gunModel[263] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Import Box0
		gunModel[264] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Import Box0
		gunModel[265] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Import Box0
		gunModel[266] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[267] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Import Box0
		gunModel[268] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Import Box0
		gunModel[269] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Import Box0
		gunModel[270] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box0
		gunModel[271] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import Box0
		gunModel[272] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Import Box0
		gunModel[273] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import Box0
		gunModel[274] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Import Box0
		gunModel[275] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import Box0
		gunModel[276] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Import Box0
		gunModel[277] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Import Box0
		gunModel[278] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Import Box0
		gunModel[279] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Import Box0
		gunModel[280] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import Box0
		gunModel[281] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Import Box0
		gunModel[282] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[283] = new ModelRendererTurbo(this, 657, 41, textureX, textureY); // Import Box0
		gunModel[284] = new ModelRendererTurbo(this, 801, 49, textureX, textureY); // Import Box0
		gunModel[285] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Import Box0
		gunModel[286] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Import Box0
		gunModel[287] = new ModelRendererTurbo(this, 865, 49, textureX, textureY); // Import Box0
		gunModel[288] = new ModelRendererTurbo(this, 889, 49, textureX, textureY); // Import Box0
		gunModel[289] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Import Box0
		gunModel[290] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Import Box0
		gunModel[291] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Import Box0
		gunModel[292] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Import Box0
		gunModel[293] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box0
		gunModel[294] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Import Box0
		gunModel[295] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		gunModel[296] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box348
		gunModel[297] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Import Box0
		gunModel[298] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Import Box0
		gunModel[299] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Import Box0
		gunModel[300] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Import Box0
		gunModel[301] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Import Box0
		gunModel[302] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Import Box0
		gunModel[303] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Import Box0
		gunModel[304] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Import Box0
		gunModel[305] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import Box0
		gunModel[306] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Import Box0
		gunModel[307] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Import Box0
		gunModel[308] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import Box0
		gunModel[309] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Import Box0
		gunModel[310] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Import Box0
		gunModel[311] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Import Box0
		gunModel[312] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Import Box0
		gunModel[313] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Import Box0
		gunModel[314] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Import Box0
		gunModel[315] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Import Box0
		gunModel[316] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Import Box0
		gunModel[317] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Import Box0
		gunModel[318] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Import Box0
		gunModel[319] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Import Box0
		gunModel[320] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Import Box0
		gunModel[321] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Import Box0
		gunModel[322] = new ModelRendererTurbo(this, 705, 41, textureX, textureY); // Import Box0
		gunModel[323] = new ModelRendererTurbo(this, 729, 41, textureX, textureY); // Import Box0
		gunModel[324] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import Box0
		gunModel[325] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import Box0
		gunModel[326] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Import Box0
		gunModel[327] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Import Box0
		gunModel[328] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Import Box0
		gunModel[329] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Import Box0
		gunModel[330] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Import Box0
		gunModel[331] = new ModelRendererTurbo(this, 897, 41, textureX, textureY); // Import Box0
		gunModel[332] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Import Box0
		gunModel[333] = new ModelRendererTurbo(this, 689, 41, textureX, textureY); // Import Box0
		gunModel[334] = new ModelRendererTurbo(this, 713, 41, textureX, textureY); // Import Box0
		gunModel[335] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Import Box0
		gunModel[336] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Import Box0
		gunModel[337] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Import Box0
		gunModel[338] = new ModelRendererTurbo(this, 737, 41, textureX, textureY); // Import Box0
		gunModel[339] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Import Box0
		gunModel[340] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Import Box0
		gunModel[341] = new ModelRendererTurbo(this, 545, 41, textureX, textureY); // Import Box0
		gunModel[342] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Import Box0
		gunModel[343] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import Box0
		gunModel[344] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Import Box0
		gunModel[345] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Import Box0
		gunModel[346] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Import Box0
		gunModel[347] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Import Box0
		gunModel[348] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Import Box0
		gunModel[349] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Import Box0
		gunModel[350] = new ModelRendererTurbo(this, 817, 49, textureX, textureY); // Import Box0
		gunModel[351] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // Import Box0
		gunModel[352] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Import Box0
		gunModel[353] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import Box0
		gunModel[354] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Import Box0
		gunModel[355] = new ModelRendererTurbo(this, 905, 49, textureX, textureY); // Import Box0
		gunModel[356] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Import Box0
		gunModel[357] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Import Box0
		gunModel[358] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Import Box0
		gunModel[359] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Import Box0
		gunModel[360] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Import Box0
		gunModel[361] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Import Box0
		gunModel[362] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Import Box0
		gunModel[363] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Import Box0
		gunModel[364] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Import Box0
		gunModel[365] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Import Box0
		gunModel[366] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Import Box0
		gunModel[367] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Import Box0
		gunModel[368] = new ModelRendererTurbo(this, 585, 49, textureX, textureY); // Import Box0
		gunModel[369] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Import Box0
		gunModel[370] = new ModelRendererTurbo(this, 633, 49, textureX, textureY); // Import Box0
		gunModel[371] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Import Box0
		gunModel[372] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Import Box0
		gunModel[373] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Import Box0
		gunModel[374] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Import Box0
		gunModel[375] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import Box0
		gunModel[376] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import Box0
		gunModel[377] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Import Box0
		gunModel[378] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Import Box0
		gunModel[379] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Import Box0
		gunModel[380] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Import Box0
		gunModel[381] = new ModelRendererTurbo(this, 529, 57, textureX, textureY); // Import Box0
		gunModel[382] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box0
		gunModel[383] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[384] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		gunModel[385] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[386] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Import Box0
		gunModel[387] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Import Box0
		gunModel[388] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Import Box0
		gunModel[389] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Import Box0
		gunModel[390] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Import Box0
		gunModel[391] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Import Box0
		gunModel[392] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box0
		gunModel[393] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0
		gunModel[394] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		gunModel[395] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[396] = new ModelRendererTurbo(this, 961, 81, textureX, textureY); // Import Box0
		gunModel[397] = new ModelRendererTurbo(this, 625, 57, textureX, textureY); // Import Box0
		gunModel[398] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Import Box596
		gunModel[399] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Import Box0
		gunModel[400] = new ModelRendererTurbo(this, 673, 57, textureX, textureY); // Import Box0
		gunModel[401] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Import Box0
		gunModel[402] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Import Box0
		gunModel[403] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		gunModel[404] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box604
		gunModel[405] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[406] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box606
		gunModel[407] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box596
		gunModel[408] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box596
		gunModel[409] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box596
		gunModel[410] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box596
		gunModel[411] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box596
		gunModel[412] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box596
		gunModel[413] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box614
		gunModel[414] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box615
		gunModel[415] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box616
		gunModel[416] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box617
		gunModel[417] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import Box618
		gunModel[418] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box619
		gunModel[419] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Import Box0
		gunModel[420] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Import Box0
		gunModel[421] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Import Box0
		gunModel[422] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Import Box0
		gunModel[423] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import Box0
		gunModel[424] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		gunModel[425] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import Box0
		gunModel[426] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		gunModel[427] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import Box0
		gunModel[428] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Box0
		gunModel[429] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Import Box0
		gunModel[430] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Import Box0
		gunModel[431] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Import Box0
		gunModel[432] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box0
		gunModel[433] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box0
		gunModel[434] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box0
		gunModel[435] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import Box0
		gunModel[436] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box0
		gunModel[437] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Box0
		gunModel[438] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Import Box641
		gunModel[439] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Import Box642
		gunModel[440] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Import Box643
		gunModel[441] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box644
		gunModel[442] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box645
		gunModel[443] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box646
		gunModel[444] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import Box647
		gunModel[445] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box648
		gunModel[446] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import Box649
		gunModel[447] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Import Box0
		gunModel[448] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import Box0
		gunModel[449] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Import Box0
		gunModel[450] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Import Box0
		gunModel[451] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Import Box0
		gunModel[452] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Import Box0
		gunModel[453] = new ModelRendererTurbo(this, 601, 89, textureX, textureY); // Import Box0
		gunModel[454] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Import Box0
		gunModel[455] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Import Box0
		gunModel[456] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Import Box0
		gunModel[457] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Import Box0
		gunModel[458] = new ModelRendererTurbo(this, 729, 65, textureX, textureY); // Import Box0
		gunModel[459] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Import Box0
		gunModel[460] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Import Box0
		gunModel[461] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Import Box0
		gunModel[462] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Import Box0
		gunModel[463] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Import Box0
		gunModel[464] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Import Box0
		gunModel[465] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Import Box0
		gunModel[466] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Import Box0
		gunModel[467] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Import Box0
		gunModel[468] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); // Import Box0
		gunModel[469] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Import Box0
		gunModel[470] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Import Box0
		gunModel[471] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Import Box0
		gunModel[472] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Import Box0
		gunModel[473] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Import Box0
		gunModel[474] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Import Box0
		gunModel[475] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Import Box0
		gunModel[476] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Import Box0
		gunModel[477] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import Box0
		gunModel[478] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Import Box0
		gunModel[479] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Import Box0
		gunModel[480] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Import Box0
		gunModel[481] = new ModelRendererTurbo(this, 961, 89, textureX, textureY); // Import Box0
		gunModel[482] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Import Box0
		gunModel[483] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Import Box0
		gunModel[484] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Import Box0
		gunModel[485] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Import Box0
		gunModel[486] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Import Box0
		gunModel[487] = new ModelRendererTurbo(this, 985, 89, textureX, textureY); // Import Box0
		gunModel[488] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Import Box0
		gunModel[489] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Import Box0
		gunModel[490] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box0
		gunModel[491] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Import Box0
		gunModel[492] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Import Box0
		gunModel[493] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Import Box0
		gunModel[494] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Import Box0
		gunModel[495] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Import Box0
		gunModel[496] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Import Box0
		gunModel[497] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Import Box0
		gunModel[498] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import Box0
		gunModel[499] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Import Box0

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,-5.25F, 0F, 0F, 5F, 0F, -1F, 5F, 0F, -1F, -5.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F); // Import Box0
		gunModel[0].setRotationPoint(-3.5F, -4.5F, -2.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-5.5F, 0F, 0F, 5.25F, 0F, -0.5F, 5.25F, 0F, -0.5F, -5.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F); // Import Box0
		gunModel[1].setRotationPoint(-4.5F, -4.5F, -3F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[2].setRotationPoint(2.5F, -5.5F, -2.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F); // Import Box0
		gunModel[3].setRotationPoint(3.5F, -5.5F, -2.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[4].setRotationPoint(2.5F, -6.25F, -3F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F); // Import Box0
		gunModel[5].setRotationPoint(3.5F, -6.25F, -3F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[6].setRotationPoint(1.5F, -5.5F, -2.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F); // Import Box0
		gunModel[7].setRotationPoint(0.75F, -5.5F, -3F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[8].setRotationPoint(1.5F, -6.25F, -3F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, 0F); // Import Box0
		gunModel[9].setRotationPoint(3.5F, -7.75F, -3F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Import Box0
		gunModel[10].setRotationPoint(-3.5F, -7.75F, -3F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,-4.5F, 0F, -1F, 4.25F, 0F, 0F, 4.25F, 0F, 0F, -4.5F, 0F, -1F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -1F); // Import Box0
		gunModel[11].setRotationPoint(-10.5F, -3.5F, -2.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,-4.25F, 0F, -0.5F, 4.25F, 0F, 0F, 4.25F, 0F, 0F, -4.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F); // Import Box0
		gunModel[12].setRotationPoint(-9.5F, -3.5F, -3F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F); // Import Box0
		gunModel[13].setRotationPoint(-6.25F, -5.5F, -2.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box0
		gunModel[14].setRotationPoint(-5.25F, -5.5F, -3F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F); // Import Box0
		gunModel[15].setRotationPoint(-6.25F, -7.5F, -2.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box0
		gunModel[16].setRotationPoint(-5.25F, -7.5F, -3F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[17].setRotationPoint(-4.25F, -5.5F, -3F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 5, 10, 6, 0F,-4.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[18].setRotationPoint(-8.5F, -3.5F, -3F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1.5F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F); // Import Box0
		gunModel[19].setRotationPoint(-5.5F, -4.5F, -3F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box0
		gunModel[20].setRotationPoint(-3.75F, -5.5F, -3F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[21].setRotationPoint(-3F, -6.25F, -3F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[22].setRotationPoint(-4.25F, -7.5F, -3F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -0.25F, -0.25F, 0F); // Import Box0
		gunModel[23].setRotationPoint(-3.5F, 7.5F, -2.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0F); // Import Box0
		gunModel[24].setRotationPoint(-4.25F, 7.5F, -3F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F); // Import Box0
		gunModel[25].setRotationPoint(3.5F, -8.5F, -3F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[26].setRotationPoint(-5F, -8.5F, -3F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.5F); // Import Box0
		gunModel[27].setRotationPoint(-5.75F, -8.5F, -3F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F); // Import Box0
		gunModel[28].setRotationPoint(-6.75F, -8.5F, -2.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F); // Import Box0
		gunModel[29].setRotationPoint(3.5F, -9.25F, -3F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[30].setRotationPoint(-5F, -9.25F, -3F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box0
		gunModel[31].setRotationPoint(-5.75F, -9.25F, -3F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F); // Import Box0
		gunModel[32].setRotationPoint(-6.75F, -9.25F, -3F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0.25F, 0.25F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0.25F, 0.25F, 0F); // Import Box0
		gunModel[33].setRotationPoint(-3.5F, 8.75F, -2.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0.25F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F); // Import Box0
		gunModel[34].setRotationPoint(-4.25F, 8.75F, -3F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.25F, -0.5F, 0F); // Import Box0
		gunModel[35].setRotationPoint(-3.25F, 8.75F, -2.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, 0F); // Import Box0
		gunModel[36].setRotationPoint(-4F, 8.75F, -3F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -1F, -0.5F, -0.5F, 0F); // Import Box0
		gunModel[37].setRotationPoint(-3.5F, 8.25F, -2.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.5F, -0.5F, 0F); // Import Box0
		gunModel[38].setRotationPoint(-4.25F, 8.25F, -3F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Import Box0
		gunModel[39].setRotationPoint(-5F, 8.75F, -3F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-0.75F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 1F, 0F, -0.75F, -1.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.75F, -1.25F, -0.5F); // Import Box0
		gunModel[40].setRotationPoint(-9F, 8.75F, -3F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-0.75F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.75F, 1.25F, 0F, -0.75F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, -1F, 0F); // Import Box0
		gunModel[41].setRotationPoint(-9F, 7.75F, -3F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[42].setRotationPoint(-5F, 8.75F, -3F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box0
		gunModel[43].setRotationPoint(-5.25F, 8.25F, -3F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[44].setRotationPoint(-5F, 6.75F, -3F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, -1F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1F, -1F); // Import Box0
		gunModel[45].setRotationPoint(-10.25F, 6.5F, -2.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.5F); // Import Box0
		gunModel[46].setRotationPoint(-9.25F, 6.5F, -3F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -0.5F, 0F, -0.75F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -1F); // Import Box0
		gunModel[47].setRotationPoint(-9.25F, 7.5F, -3F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.25F, -1F, -0.25F, -0.75F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, -1F); // Import Box0
		gunModel[48].setRotationPoint(-10.25F, 6.75F, -2.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 45, 1, 6, 0F,0F, -0.25F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, -2.25F, -0.5F, -0.5F, -2.25F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[49].setRotationPoint(-8.5F, -9.25F, -3F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 45, 3, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[50].setRotationPoint(-8.5F, -15.25F, -3F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box0
		gunModel[51].setRotationPoint(-9.5F, -15.25F, -3F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[52].setRotationPoint(-9.5F, -9.25F, -3F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[53].setRotationPoint(-8.5F, -16.25F, -3F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box0
		gunModel[54].setRotationPoint(-8.5F, -17.25F, -3F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 27, 2, 6, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 1F, -0.25F, 0.5F); // Import Box0
		gunModel[55].setRotationPoint(-7.5F, -19.25F, -3F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 24, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 2.5F, 0.5F, 0.5F); // Import Box0
		gunModel[56].setRotationPoint(-4.5F, -20.25F, -2F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 37, 1, 4, 0F,-1.25F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.25F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[57].setRotationPoint(-4.5F, -21.25F, -2F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[58].setRotationPoint(24.5F, -16.25F, 0F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0F); // Import Box0
		gunModel[59].setRotationPoint(-9F, -17.25F, -3F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1.5F, 0F, -1F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1.5F, 0F, -1F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, 0F, 0.25F, 0F); // Import Box0
		gunModel[60].setRotationPoint(-9F, -18.75F, -3F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-2F, 0F, -0.5F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0F); // Import Box0
		gunModel[61].setRotationPoint(-7.5F, -20.25F, -2F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1.75F, 0F, -1.75F, 1.25F, 0F, -1.5F, 1.25F, 0F, -1.5F, -1.75F, 0F, -1.75F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F); // Import Box0
		gunModel[62].setRotationPoint(-5.5F, -21.25F, -2F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F); // Import Box0
		gunModel[63].setRotationPoint(-9F, -16F, -3F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F); // Import Box0
		gunModel[64].setRotationPoint(24.5F, -16.75F, 0F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F); // Import Box0
		gunModel[65].setRotationPoint(24.5F, -17.75F, 0F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[66].setRotationPoint(25F, -17.75F, 0F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[67].setRotationPoint(32F, -17.75F, 0F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[68].setRotationPoint(22.5F, -17.75F, 0F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box0
		gunModel[69].setRotationPoint(24.5F, -17.75F, 0F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[70].setRotationPoint(25F, -17.25F, 0F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[71].setRotationPoint(32.5F, -16.25F, -3F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[72].setRotationPoint(23.5F, -15.75F, 0F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 29, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.25F, 0F); // Import Box0
		gunModel[73].setRotationPoint(-8.5F, -12.25F, -3F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, -0.4F, 0F); // Import Box0
		gunModel[74].setRotationPoint(24.5F, -12.25F, -3F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[75].setRotationPoint(20.5F, -11.45F, -3F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Import Box0
		gunModel[76].setRotationPoint(23F, -11.64F, -3F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[77].setRotationPoint(20.5F, -12.25F, -3F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Import Box0
		gunModel[78].setRotationPoint(23F, -12.25F, -3F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 11, 6, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[79].setRotationPoint(32.5F, -21.25F, -2F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0.25F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[80].setRotationPoint(32.5F, -18.25F, -2.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Import Box0
		gunModel[81].setRotationPoint(32.5F, -16.25F, -2.75F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.75F, -1.25F, -0.5F, -0.75F, -1.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[82].setRotationPoint(32.5F, -17.25F, -3.75F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, -0.5F, -1.5F, 0.15F, -0.5F, -1.5F, 0.15F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[83].setRotationPoint(32.5F, -18.25F, 2.25F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[84].setRotationPoint(32.5F, -16.75F, -2.75F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, -0.5F, -1.5F, 0.15F, -0.5F, -1.5F, 0.15F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[85].setRotationPoint(32.5F, -18.25F, -3.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[86].setRotationPoint(36F, -11.25F, -2.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[87].setRotationPoint(36F, -11.75F, -3F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[88].setRotationPoint(38F, -10F, -2.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[89].setRotationPoint(38F, -10.5F, -3F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[90].setRotationPoint(40F, -10F, -2.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[91].setRotationPoint(40F, -10.5F, -3F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[92].setRotationPoint(40F, -16.5F, -3F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F); // Import Box0
		gunModel[93].setRotationPoint(36F, -16.5F, -3F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, 0F, 0.4F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.25F, -0.15F, 0.4F, -0.25F, -0.15F, 0.4F, 0F, 0F, 0.4F); // Import Box0
		gunModel[94].setRotationPoint(20.5F, -12.45F, -2.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[95].setRotationPoint(38F, -16.5F, -3F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 19, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[96].setRotationPoint(44F, -12F, -2.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 19, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[97].setRotationPoint(44F, -12.5F, -3F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 19, 3, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[98].setRotationPoint(44F, -15.5F, -3F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 18, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[99].setRotationPoint(45F, -19.5F, -3F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 18, 2, 6, 0F,0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[100].setRotationPoint(45F, -21.5F, -3F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F,0F, 0F, -2.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[101].setRotationPoint(45F, -22F, -3F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F); // Import Box0
		gunModel[102].setRotationPoint(51.5F, -17.5F, -3F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box0
		gunModel[103].setRotationPoint(44.5F, -18F, -3F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[104].setRotationPoint(36.5F, -17.5F, -3F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F); // Import Box0
		gunModel[105].setRotationPoint(60F, -17.5F, -3F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[106].setRotationPoint(51.5F, -18F, -3F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[107].setRotationPoint(60F, -18F, -3F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[108].setRotationPoint(44F, -19.5F, -3F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[109].setRotationPoint(44F, -21.5F, -3F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[110].setRotationPoint(44F, -22F, -3F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[111].setRotationPoint(44.75F, -19.5F, -3F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.5F, -1F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[112].setRotationPoint(44.75F, -21.5F, -3F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, -2.35F, -0.75F, -0.25F, -2.35F, -0.75F, -0.25F, -2.35F, 0F, -0.25F, -2.35F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[113].setRotationPoint(44.75F, -22F, -3F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.5F, -2.25F, -0.5F, -0.5F, -2.25F, -0.5F, -0.5F, -2.25F, 0F, -0.5F, -2.25F); // Import Box0
		gunModel[114].setRotationPoint(43.5F, -18.75F, -3F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.5F, -2.25F, -0.5F, -0.5F, -2.25F, -0.5F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, 0F, -0.25F, -1.25F); // Import Box0
		gunModel[115].setRotationPoint(43.5F, -21.5F, -3F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.5F, -1.25F, -0.5F, -0.5F, -1.25F, -0.5F, -0.5F, -1.25F, 0F, -0.5F, -1.25F); // Import Box0
		gunModel[116].setRotationPoint(43.5F, -20F, -3F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[117].setRotationPoint(35.5F, -17.5F, -3F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[118].setRotationPoint(47F, -14.5F, 2.5F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.5F, 2F, 0F, -0.5F); // Import Box0
		gunModel[119].setRotationPoint(47F, -13.5F, 2.5F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[120].setRotationPoint(47F, -15.5F, 2.5F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, 0.25F); // Import Box0
		gunModel[121].setRotationPoint(56.5F, -14.5F, 2.5F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 1F, -0.5F); // Import Box0
		gunModel[122].setRotationPoint(45F, -14.5F, 2.5F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[123].setRotationPoint(44F, -16.5F, -3F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[124].setRotationPoint(59.25F, -16.5F, -3F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[125].setRotationPoint(47.25F, -16.5F, -3F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[126].setRotationPoint(48.25F, -16.5F, -3F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[127].setRotationPoint(58.25F, -16.5F, -3F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[128].setRotationPoint(48.25F, -17F, -3F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[129].setRotationPoint(58.25F, -17F, -3F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[130].setRotationPoint(47.25F, -17F, -3F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[131].setRotationPoint(32.5F, -22.25F, -2F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -1.5F, 0F); // Import Box0
		gunModel[132].setRotationPoint(42.5F, -22.25F, -2F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[133].setRotationPoint(42F, -23.75F, -2F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[134].setRotationPoint(41F, -22.25F, -2F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.25F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F); // Import Box0
		gunModel[135].setRotationPoint(43F, -22.25F, -2F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.25F, 0F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.75F, 0F); // Import Box0
		gunModel[136].setRotationPoint(43F, -22.5F, -2F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F); // Import Box0
		gunModel[137].setRotationPoint(43.25F, -21.25F, -2F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[138].setRotationPoint(42.25F, -22.25F, -2F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[139].setRotationPoint(41.75F, -22.25F, -2F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.25F, -1F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[140].setRotationPoint(40.75F, -22.25F, -2F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		gunModel[141].setRotationPoint(33.5F, -17.65F, 1.9F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Import Box0
		gunModel[142].setRotationPoint(33.5F, -17.15F, 1.9F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		gunModel[143].setRotationPoint(33.5F, -18.15F, 1.9F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box152
		gunModel[144].setRotationPoint(47F, -14.5F, -3.5F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 2F, 0F, 0F); // Import Box153
		gunModel[145].setRotationPoint(47F, -13.5F, -3.5F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,2F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box154
		gunModel[146].setRotationPoint(47F, -15.5F, -3.5F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box155
		gunModel[147].setRotationPoint(56.5F, -14.5F, -3.5F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box156
		gunModel[148].setRotationPoint(45F, -14.5F, -3.5F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[149].setRotationPoint(62.5F, -12F, -2.5F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[150].setRotationPoint(62.5F, -12.5F, -3F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[151].setRotationPoint(62.5F, -16.5F, -3F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[152].setRotationPoint(62.5F, -19.5F, -3F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[153].setRotationPoint(62.5F, -21.5F, -3F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[154].setRotationPoint(62.5F, -22F, -3F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F); // Import Box0
		gunModel[155].setRotationPoint(60.5F, -17.5F, -3F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 35, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[156].setRotationPoint(63.5F, -14.5F, -1.5F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 35, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[157].setRotationPoint(63.5F, -15.5F, -1.5F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 35, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[158].setRotationPoint(63.5F, -16.5F, -1.5F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[159].setRotationPoint(63.5F, -15.35F, -1.65F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Import Box0
		gunModel[160].setRotationPoint(63.5F, -14.35F, -1.65F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[161].setRotationPoint(63.5F, -16.6F, -1.65F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[162].setRotationPoint(63.5F, -17.6F, -1F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.5F, -0.25F, -1F); // Import Box0
		gunModel[163].setRotationPoint(97.5F, -14.5F, -1.5F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[164].setRotationPoint(97.5F, -15.5F, -1.5F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[165].setRotationPoint(97.5F, -16.5F, -1.5F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[166].setRotationPoint(94F, -15.35F, -1.65F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Import Box0
		gunModel[167].setRotationPoint(94F, -14.35F, -1.65F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[168].setRotationPoint(94F, -16.6F, -1.65F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[169].setRotationPoint(77F, -15.35F, -1.65F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, -1F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Import Box0
		gunModel[170].setRotationPoint(77F, -14.35F, -1.65F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0.25F, -1F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[171].setRotationPoint(77F, -16.6F, -1.65F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 0F, -0.65F, 0F); // Import Box0
		gunModel[172].setRotationPoint(77.25F, -14.5F, -1F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[173].setRotationPoint(79.75F, -14.5F, -1F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Import Box0
		gunModel[174].setRotationPoint(79.75F, -12F, -1F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.35F, -0.5F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.5F, 0F, 0.35F, -0.5F, 0F); // Import Box0
		gunModel[175].setRotationPoint(77.75F, -13.4F, -1F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Import Box0
		gunModel[176].setRotationPoint(95.75F, -14.5F, 0F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[177].setRotationPoint(95.75F, -13F, 0F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 1.5F, -0.5F, -0.5F, 0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F); // Import Box220
		gunModel[178].setRotationPoint(95.75F, -14.5F, -1F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Import Box221
		gunModel[179].setRotationPoint(95.75F, -13F, -1F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box0
		gunModel[180].setRotationPoint(62.75F, -13F, -0.65F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		gunModel[181].setRotationPoint(62.75F, -13F, -0.65F);

		gunModel[182].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,-0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box0
		gunModel[182].setRotationPoint(62.75F, -13.25F, -0.65F);

		gunModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		gunModel[183].setRotationPoint(95.25F, -13F, -1F);

		gunModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		gunModel[184].setRotationPoint(95.25F, -13.5F, -1F);

		gunModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Import Box0
		gunModel[185].setRotationPoint(95.25F, -12.5F, -1F);

		gunModel[186].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.25F, 0F, -1F, 1.25F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[186].setRotationPoint(72.5F, -18.75F, -1.5F);

		gunModel[187].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[187].setRotationPoint(72.5F, -19.75F, -1.5F);

		gunModel[188].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[188].setRotationPoint(72.5F, -20.75F, -1.5F);

		gunModel[189].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[189].setRotationPoint(65.5F, -19.75F, -1.5F);

		gunModel[190].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Import Box0
		gunModel[190].setRotationPoint(65.5F, -20.75F, -1.5F);

		gunModel[191].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Import Box0
		gunModel[191].setRotationPoint(65.5F, -20.75F, -1.5F);

		gunModel[192].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, 0F, -0.75F, -1F); // Import Box0
		gunModel[192].setRotationPoint(65.5F, -20F, -2.5F);

		gunModel[193].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, 0F, -0.25F, -1F); // Import Box0
		gunModel[193].setRotationPoint(65.5F, -18.75F, -1.5F);

		gunModel[194].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[194].setRotationPoint(65.5F, -18.75F, -1.5F);

		gunModel[195].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, 0F, 0F, -1.25F); // Import Box0
		gunModel[195].setRotationPoint(65.5F, -19.5F, -2.5F);

		gunModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Import Box0
		gunModel[196].setRotationPoint(71.5F, -19.75F, -1.5F);

		gunModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -0.75F, -0.25F, -1F); // Import Box0
		gunModel[197].setRotationPoint(71.5F, -18.75F, -1.5F);

		gunModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -0.75F, -0.25F, -1F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Import Box0
		gunModel[198].setRotationPoint(71.5F, -20.75F, -1.5F);

		gunModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Import Box0
		gunModel[199].setRotationPoint(64.5F, -19.75F, -1.5F);

		gunModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -0.75F, -0.25F, -1F); // Import Box0
		gunModel[200].setRotationPoint(64.5F, -18.75F, -1.5F);

		gunModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -0.75F, -0.25F, -1F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Import Box0
		gunModel[201].setRotationPoint(64.5F, -20.75F, -1.5F);

		gunModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[202].setRotationPoint(63.5F, -18.75F, -1.5F);

		gunModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[203].setRotationPoint(63.5F, -19.75F, -1.5F);

		gunModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[204].setRotationPoint(63.5F, -20.75F, -1.5F);

		gunModel[205].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0.2F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.65F, 0F, -0.8F, -0.65F, 0F, -0.8F, -0.65F, 0F, 0.2F, -0.65F, 0F); // Import Box0
		gunModel[205].setRotationPoint(77.25F, -17.5F, -1F);

		gunModel[206].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0.2F, -0.65F, 0F, -0.25F, -0.65F, 0F, -0.25F, -0.65F, 0F, 0.2F, -0.65F, 0F); // Import Box0
		gunModel[206].setRotationPoint(77.25F, -18.25F, -1F);

		gunModel[207].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,1F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[207].setRotationPoint(75.75F, -18.5F, -1F);

		gunModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[208].setRotationPoint(-8F, -14.75F, -3.5F);

		gunModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F); // Import Box0
		gunModel[209].setRotationPoint(-8F, -14.25F, -3.5F);

		gunModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[210].setRotationPoint(-8F, -15.25F, -3.5F);

		gunModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[211].setRotationPoint(-2F, -12.75F, -0.5F);

		gunModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F); // Import Box0
		gunModel[212].setRotationPoint(-2F, -12.25F, -0.5F);

		gunModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[213].setRotationPoint(-2F, -13.25F, -0.5F);

		gunModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[214].setRotationPoint(1.5F, -13.75F, -0.5F);

		gunModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F); // Import Box0
		gunModel[215].setRotationPoint(1.5F, -13.25F, -0.5F);

		gunModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[216].setRotationPoint(1.5F, -14.25F, -0.5F);

		gunModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[217].setRotationPoint(30.25F, -14.9F, -3.5F);

		gunModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F); // Import Box0
		gunModel[218].setRotationPoint(30.25F, -14.4F, -3.5F);

		gunModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[219].setRotationPoint(30.25F, -15.4F, -3.5F);

		gunModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[220].setRotationPoint(33.25F, -14.9F, -3.5F);

		gunModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F); // Import Box0
		gunModel[221].setRotationPoint(33.25F, -14.4F, -3.5F);

		gunModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[222].setRotationPoint(33.25F, -15.4F, -3.5F);

		gunModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[223].setRotationPoint(25F, -12F, -3.5F);

		gunModel[224].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F); // Import Box0
		gunModel[224].setRotationPoint(25F, -11.5F, -3.5F);

		gunModel[225].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[225].setRotationPoint(25F, -12.5F, -3.5F);

		gunModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[226].setRotationPoint(5.5F, -11F, -0.5F);

		gunModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F); // Import Box0
		gunModel[227].setRotationPoint(5.5F, -10.5F, -0.5F);

		gunModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[228].setRotationPoint(5.5F, -11.5F, -0.5F);

		gunModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F); // Import Box0
		gunModel[229].setRotationPoint(11.75F, -12F, -3.5F);

		gunModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F); // Import Box0
		gunModel[230].setRotationPoint(11.75F, -11.5F, -3.5F);

		gunModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F); // Import Box0
		gunModel[231].setRotationPoint(11.75F, -12.5F, -3.5F);

		gunModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F); // Import Box0
		gunModel[232].setRotationPoint(14.75F, -11.5F, -3.5F);

		gunModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F); // Import Box0
		gunModel[233].setRotationPoint(14.75F, -11F, -3.5F);

		gunModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F); // Import Box0
		gunModel[234].setRotationPoint(14.75F, -12F, -3.5F);

		gunModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F); // Import Box0
		gunModel[235].setRotationPoint(14.75F, -13.5F, -3.5F);

		gunModel[236].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F); // Import Box0
		gunModel[236].setRotationPoint(14.75F, -13F, -3.5F);

		gunModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F); // Import Box0
		gunModel[237].setRotationPoint(14.75F, -14F, -3.5F);

		gunModel[238].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0.2F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 0.2F, -0.65F, 0F); // Import Box0
		gunModel[238].setRotationPoint(94.25F, -17.5F, -1F);

		gunModel[239].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.2F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 0.2F, -0.65F, 0F); // Import Box0
		gunModel[239].setRotationPoint(97.25F, -19.5F, -1F);

		gunModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0.2F, -0.35F, 0F, 0.2F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 0.2F, -0.65F, 0F); // Import Box0
		gunModel[240].setRotationPoint(94.25F, -18.5F, -1F);

		gunModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.1F, -0.35F, 0F, 0.1F, -0.35F, 0F, 0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, 0.2F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 0.2F, -0.65F, 0F); // Import Box0
		gunModel[241].setRotationPoint(94.25F, -19.5F, -1F);

		gunModel[242].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0.25F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0.25F, -0.35F, 0F, 0.9F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 0.9F, -0.65F, 0F); // Import Box0
		gunModel[242].setRotationPoint(95.25F, -21.5F, -1F);

		gunModel[243].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,1F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 1F, -0.35F, 0F, 1.25F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 1.25F, -0.65F, 0F); // Import Box0
		gunModel[243].setRotationPoint(96.25F, -22.5F, -1F);

		gunModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0.5F, -1F, -0.9F, 0.5F, -1F, -0.9F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0.85F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0.85F, -1F, 0F); // Import Box0
		gunModel[244].setRotationPoint(96.25F, -23.5F, -1.9F);

		gunModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.85F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, -1F, 0.85F, 0.25F, -1F, 1F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, -0.5F, 1F, -0.65F, -0.5F); // Import Box0
		gunModel[245].setRotationPoint(96.25F, -22.5F, -1F);

		gunModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.85F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0.85F, 0.25F, 0F, 0.85F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0.85F, -0.75F, 0F); // Import Box0
		gunModel[246].setRotationPoint(96.25F, -23F, -2F);

		gunModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0.5F, 0.5F, -0.9F, 0.5F, 0.5F, -0.9F, 0.5F, -1F, 0.3F, 0.5F, -1F, 0.85F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0.85F, -1F, -0.5F); // Import Box297
		gunModel[247].setRotationPoint(96.25F, -23.5F, 0.9F);

		gunModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.85F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, 0.5F, 0.85F, 0.25F, 0.5F, 1F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, 0F, 1F, -0.65F, 0F); // Import Box298
		gunModel[248].setRotationPoint(96.25F, -22.5F, 0F);

		gunModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.85F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, 0.85F, 0.25F, -0.5F, 0.85F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0.85F, -0.75F, -0.5F); // Import Box299
		gunModel[249].setRotationPoint(96.25F, -23F, 1F);

		gunModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.95F, -0.25F, 0.1F, -0.5F, -0.25F, 0.1F, -0.5F, -0.25F, -1.1F, 0.95F, -0.25F, -1.1F, 1F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, -0.65F, 1F, -0.65F, -0.65F); // Import Box0
		gunModel[250].setRotationPoint(96.25F, -22.5F, -0.5F);

		gunModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.95F, -0.25F, -1.1F, -0.5F, -0.25F, -1.1F, -0.5F, -0.25F, 0.1F, 0.95F, -0.25F, 0.1F, 1F, -0.65F, -0.65F, -0.5F, -0.65F, -0.65F, -0.5F, -0.65F, 0F, 1F, -0.65F, 0F); // Import Box301
		gunModel[251].setRotationPoint(96.25F, -22.5F, -0.5F);

		gunModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.85F, 0.25F, -0.6F, -0.5F, 0.25F, -0.6F, -0.5F, 0.25F, 0.1F, 0.85F, 0.25F, 0.1F, 0.85F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0.85F, -1F, 0F); // Import Box0
		gunModel[252].setRotationPoint(96.25F, -23.25F, -2F);

		gunModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.85F, 0.25F, 0.1F, -0.5F, 0.25F, 0.1F, -0.5F, 0.25F, -0.6F, 0.85F, 0.25F, -0.6F, 0.85F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0.85F, -1F, -0.5F); // Import Box303
		gunModel[253].setRotationPoint(96.25F, -23.25F, 1F);

		gunModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Import Box0
		gunModel[254].setRotationPoint(96F, -22.5F, -0.5F);

		gunModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box0
		gunModel[255].setRotationPoint(96F, -23.5F, -0.5F);

		gunModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[256].setRotationPoint(-51F, 1.5F, -3F);

		gunModel[257].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, -0.25F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, -3.5F, -1F, 0F, -3.5F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[257].setRotationPoint(-50F, 1.5F, -2.5F);

		gunModel[258].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, -0.25F, -0.5F, 0F, 2.75F, -0.5F, 0F, 2.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -1.5F, 0F, -3F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[258].setRotationPoint(-35F, -2F, -3F);

		gunModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0.5F, -0.25F, -1F, 0.5F, -0.25F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[259].setRotationPoint(-11F, -9F, -2.5F);

		gunModel[260].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, -0.25F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -3.25F, -0.5F, 0F, -3.25F, -0.5F, 0F, 0.25F, -0.5F); // Import Box0
		gunModel[260].setRotationPoint(-50F, 0.5F, -3F);

		gunModel[261].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, -0.25F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -2.75F, -0.5F, 0F, -2.75F, -0.5F, 0F, 0.25F, -0.5F); // Import Box0
		gunModel[261].setRotationPoint(-35F, -3F, -3F);

		gunModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F); // Import Box0
		gunModel[262].setRotationPoint(-11F, -10F, -3F);

		gunModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[263].setRotationPoint(95.5F, -21.5F, -1.5F);

		gunModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F); // Import Box0
		gunModel[264].setRotationPoint(95.5F, -21F, -1.5F);

		gunModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[265].setRotationPoint(95.5F, -22F, -1.5F);

		gunModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0.75F, 0F, 0F, 0.75F); // Import Box0
		gunModel[266].setRotationPoint(-11F, -16F, -3F);

		gunModel[267].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, -1.25F, 0.5F, 0F, -1F, 0.5F, 0F, 0.75F, 0F, -0.75F, 1F, 0F, 0.5F, -0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0.75F, 0F, 0.5F, 1F); // Import Box0
		gunModel[267].setRotationPoint(-14.5F, -15.75F, -3F);

		gunModel[268].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.25F, -1.5F); // Import Box0
		gunModel[268].setRotationPoint(-22F, -6F, -2.5F);

		gunModel[269].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[269].setRotationPoint(-22F, -7F, -2.5F);

		gunModel[270].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, -0.75F, -0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.75F, -0.5F, 0F, 0.5F, -1.5F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0.5F, -1.5F); // Import Box0
		gunModel[270].setRotationPoint(-19F, -7.5F, -2.5F);

		gunModel[271].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, -0.75F, -0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.75F, -0.5F, 0F, 0.75F, -1F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0.75F, -1F); // Import Box0
		gunModel[271].setRotationPoint(-19F, -8.5F, -3F);

		gunModel[272].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,-0.5F, -0.75F, -1.5F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, -0.5F, -0.75F, -1.5F, -0.5F, 0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0.5F, -0.5F); // Import Box0
		gunModel[272].setRotationPoint(-19.5F, -14.75F, -3F);

		gunModel[273].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[273].setRotationPoint(-22F, -14.25F, -2.5F);

		gunModel[274].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 1.5F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 1.5F, -1.5F, 0F, -1.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.75F, -0.5F); // Import Box0
		gunModel[274].setRotationPoint(-26F, -14.25F, -3F);

		gunModel[275].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.5F); // Import Box0
		gunModel[275].setRotationPoint(-35F, -15.25F, -3F);

		gunModel[276].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[276].setRotationPoint(-50F, -14.75F, -2.5F);

		gunModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[277].setRotationPoint(-52F, -15F, -2.5F);

		gunModel[278].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0F, 0.25F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[278].setRotationPoint(-35F, -14.25F, -3F);

		gunModel[279].addShapeBox(0F, 0F, 0F, 15, 2, 6, 0F,0F, 0.25F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[279].setRotationPoint(-50F, -13.75F, -3F);

		gunModel[280].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[280].setRotationPoint(-52F, -14F, -3F);

		gunModel[281].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 1.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.75F, -0.5F, 0F, -1.25F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1.25F, 0F); // Import Box0
		gunModel[281].setRotationPoint(-26F, -13.25F, -3F);

		gunModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[282].setRotationPoint(-11F, -16F, 2F);

		gunModel[283].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 1F, 0.5F, 0F, 0.75F, 0.5F, 0F, -1F, 0F, -0.75F, -1.25F, 0F, 0.5F, 1F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0F, 0F, 0.5F, -0.25F); // Import Box0
		gunModel[283].setRotationPoint(-14.5F, -15.75F, 2F);

		gunModel[284].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.25F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -0.25F, -0.5F, 0F, 0F, -1.5F, 0F, -1.25F, -2F, 0F, -1.25F, -2F, 0F, 0F, -1.5F); // Import Box0
		gunModel[284].setRotationPoint(-26F, -5F, -3F);

		gunModel[285].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.25F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0.25F, -0.5F); // Import Box0
		gunModel[285].setRotationPoint(-26F, -6F, -3F);

		gunModel[286].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.25F, 0F); // Import Box0
		gunModel[286].setRotationPoint(-11F, -15F, -3F);

		gunModel[287].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F,0F, -0.5F, -0.25F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, -0.5F, -0.25F, 0F, 0.9F, -0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.9F, -0.2F); // Import Box0
		gunModel[287].setRotationPoint(-14.5F, -14.75F, -3F);

		gunModel[288].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F,0F, -0.5F, -0.5F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0F, 1F, -0.5F); // Import Box0
		gunModel[288].setRotationPoint(-19F, -13.75F, -3F);

		gunModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F); // Import Box0
		gunModel[289].setRotationPoint(-9.5F, -10.25F, -3F);

		gunModel[290].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 1.75F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1.75F, -0.5F); // Import Box0
		gunModel[290].setRotationPoint(-22F, -13.75F, -3F);

		gunModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F); // Import Box0
		gunModel[291].setRotationPoint(-51F, 0.5F, -3.5F);

		gunModel[292].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F,0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 2F, 0F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 2F, 0F); // Import Box0
		gunModel[292].setRotationPoint(-26F, -13.75F, -3F);

		gunModel[293].addShapeBox(0F, 0F, 0F, 9, 9, 6, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Import Box0
		gunModel[293].setRotationPoint(-35F, -13.75F, -3F);

		gunModel[294].addShapeBox(0F, 0F, 0F, 15, 7, 6, 0F,0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F); // Import Box0
		gunModel[294].setRotationPoint(-50F, -12.75F, -3F);

		gunModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[295].setRotationPoint(-9.5F, -16.25F, 2F);

		gunModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Import Box348
		gunModel[296].setRotationPoint(-9.5F, -16.25F, -3F);

		gunModel[297].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[297].setRotationPoint(-52F, -12.5F, -3F);

		gunModel[298].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Import Box0
		gunModel[298].setRotationPoint(-52F, -8.5F, -3F);

		gunModel[299].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Import Box0
		gunModel[299].setRotationPoint(-52F, -4.5F, -3F);

		gunModel[300].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F); // Import Box0
		gunModel[300].setRotationPoint(-53F, -8.5F, -3F);

		gunModel[301].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[301].setRotationPoint(-53F, -12.5F, -3F);

		gunModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -1F, -0.25F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[302].setRotationPoint(-53F, -15F, -2.5F);

		gunModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box0
		gunModel[303].setRotationPoint(-53F, -14F, -3F);

		gunModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -1.5F); // Import Box0
		gunModel[304].setRotationPoint(-52F, 1.5F, -3F);

		gunModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, 0.25F, -1F); // Import Box0
		gunModel[305].setRotationPoint(-52F, 0.5F, -3.5F);

		gunModel[306].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,-1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F); // Import Box0
		gunModel[306].setRotationPoint(-53F, -4.5F, -3F);

		gunModel[307].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,-0.5F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F); // Import Box0
		gunModel[307].setRotationPoint(-53.5F, -12.5F, -3F);

		gunModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.5F, -2F, 0.5F, -0.25F, -1F, 0.5F, -0.25F, -1F, -1F, -0.5F, -2F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Import Box0
		gunModel[308].setRotationPoint(-53.5F, -15F, -2.5F);

		gunModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -1F); // Import Box0
		gunModel[309].setRotationPoint(-53.5F, -14F, -3F);

		gunModel[310].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,-1F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, -1F); // Import Box0
		gunModel[310].setRotationPoint(-53.5F, -8.5F, -3F);

		gunModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -1.5F, -1F, -0.25F, -2.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, -1F, -0.25F, -2.5F); // Import Box0
		gunModel[311].setRotationPoint(-52.5F, 1.5F, -3F);

		gunModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.5F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -1.5F, -0.5F, 0.25F, -2F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.5F, 0.25F, -2F); // Import Box0
		gunModel[312].setRotationPoint(-52.5F, 0.5F, -3.5F);

		gunModel[313].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,-1.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, -1F, -1.5F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, -1F); // Import Box0
		gunModel[313].setRotationPoint(-53.5F, -4.5F, -3F);

		gunModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F); // Import Box0
		gunModel[314].setRotationPoint(4F, -20.25F, -2.5F);

		gunModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, 0F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.25F, 0.5F, 0F); // Import Box0
		gunModel[315].setRotationPoint(3.75F, -20.25F, -2.5F);

		gunModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, 0.5F, 0.25F); // Import Box0
		gunModel[316].setRotationPoint(4.5F, -20.25F, -2.5F);

		gunModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0.25F, -2F, -0.25F, 0.25F, -2F, -0.25F, 0.25F, -2F, -0.25F, 0.25F, -2F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box0
		gunModel[317].setRotationPoint(4F, -21.25F, -2.5F);

		gunModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, -2.25F, -0.5F, 0.25F, -2F, -0.5F, 0.25F, -2F, -0.25F, 0F, -2.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Import Box0
		gunModel[318].setRotationPoint(3.75F, -21.25F, -2.5F);

		gunModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0.25F, -2F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2.25F, -0.25F, 0.25F, -2F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F); // Import Box0
		gunModel[319].setRotationPoint(4.5F, -21.25F, -2.5F);

		gunModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F); // Import Box0
		gunModel[320].setRotationPoint(4F, -18.75F, -2.5F);

		gunModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, 0.5F, 0.25F); // Import Box0
		gunModel[321].setRotationPoint(4.5F, -18.75F, -2.5F);

		gunModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.5F, 0.5F, 0F); // Import Box0
		gunModel[322].setRotationPoint(3.5F, -18.75F, -2.5F);

		gunModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F); // Import Box0
		gunModel[323].setRotationPoint(16F, -20.25F, -2.5F);

		gunModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, 0F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.25F, 0.5F, 0F); // Import Box0
		gunModel[324].setRotationPoint(15.75F, -20.25F, -2.5F);

		gunModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, 0.5F, 0.25F); // Import Box0
		gunModel[325].setRotationPoint(16.5F, -20.25F, -2.5F);

		gunModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0.25F, -2F, -0.25F, 0.25F, -2F, -0.25F, 0.25F, -2F, -0.25F, 0.25F, -2F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box0
		gunModel[326].setRotationPoint(16F, -21.25F, -2.5F);

		gunModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, -2.25F, -0.5F, 0.25F, -2F, -0.5F, 0.25F, -2F, -0.25F, 0F, -2.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Import Box0
		gunModel[327].setRotationPoint(15.75F, -21.25F, -2.5F);

		gunModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0.25F, -2F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2.25F, -0.25F, 0.25F, -2F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F); // Import Box0
		gunModel[328].setRotationPoint(16.5F, -21.25F, -2.5F);

		gunModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F); // Import Box0
		gunModel[329].setRotationPoint(16F, -18.75F, -0.5F);

		gunModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, 0.5F, 0.25F); // Import Box0
		gunModel[330].setRotationPoint(16.5F, -18.75F, -0.5F);

		gunModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.5F, 0.5F, 0F); // Import Box0
		gunModel[331].setRotationPoint(15.5F, -18.75F, -0.5F);

		gunModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F); // Import Box0
		gunModel[332].setRotationPoint(27.25F, -20.25F, 0.5F);

		gunModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, 0F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.25F, 0.5F, 0F); // Import Box0
		gunModel[333].setRotationPoint(27F, -20.25F, 0.5F);

		gunModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, 0.5F, 0.25F); // Import Box0
		gunModel[334].setRotationPoint(27.75F, -20.25F, 0.5F);

		gunModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0.25F, -2F, -0.25F, 0.25F, -2F, -0.25F, 0.25F, -2F, -0.25F, 0.25F, -2F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box0
		gunModel[335].setRotationPoint(27.25F, -21.25F, -2.5F);

		gunModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, -2.25F, -0.5F, 0.25F, -2F, -0.5F, 0.25F, -2F, -0.25F, 0F, -2.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.5F); // Import Box0
		gunModel[336].setRotationPoint(27F, -21.25F, -2.5F);

		gunModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0.25F, -2F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2.25F, -0.25F, 0.25F, -2F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.25F); // Import Box0
		gunModel[337].setRotationPoint(27.75F, -21.25F, -2.5F);

		gunModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F); // Import Box0
		gunModel[338].setRotationPoint(27.25F, -18.75F, 0.5F);

		gunModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, 0.5F, 0.25F); // Import Box0
		gunModel[339].setRotationPoint(27.75F, -18.75F, 0.5F);

		gunModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.5F, 0.5F, 0F); // Import Box0
		gunModel[340].setRotationPoint(26.75F, -18.75F, 0.5F);

		gunModel[341].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.5F, -0.45F, 0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -1.5F, -0.45F, -0.65F, -1.5F, 0.5F, 0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, -1.5F, 0.5F, -0.25F); // Import Box0
		gunModel[341].setRotationPoint(-14.5F, -15.75F, 0.75F);

		gunModel[342].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.5F, -0.45F, -0.65F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -1.5F, -0.45F, 0.5F, -1.5F, 0.5F, -0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, -1.5F, 0.5F, 0.5F); // Import Box0
		gunModel[342].setRotationPoint(-14.5F, -15.75F, -1.75F);

		gunModel[343].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1.5F, -0.5F, -1F, 0F, -0.2F, -0.9F, 0F, -0.2F, 0.15F, -1.5F, -0.5F, 0F, -1.5F, 0.5F, -0.5F, 0F, -0.05F, -0.25F, 0F, -0.05F, 0.5F, -1.5F, 0.5F, 0.5F); // Import Box0
		gunModel[343].setRotationPoint(-16F, -15.5F, -2F);

		gunModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[344].setRotationPoint(-11F, -16F, -1.5F);

		gunModel[345].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[345].setRotationPoint(-14.5F, -15.75F, -1.5F);

		gunModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box0
		gunModel[346].setRotationPoint(-10F, -16F, -1.5F);

		gunModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.75F, 0.25F, 0F, 1.5F, 0.25F, 0F, 1.5F, 0.25F, 0F, -1.75F, 0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[347].setRotationPoint(-9.05F, -19F, -1F);

		gunModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.75F, 0.25F, -0.25F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -1.75F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F); // Import Box0
		gunModel[348].setRotationPoint(-9.3F, -19F, -1F);

		gunModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.6F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, -1.6F, 0F, 0F, -1.25F, -0.75F, 0F, 0.55F, -0.75F, 0F, 0.55F, -0.75F, 0F, -1.25F, -0.75F, 0F); // Import Box0
		gunModel[349].setRotationPoint(-9.3F, -19.15F, -1F);

		gunModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.6F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, -1.6F, 0F, 0F, -1.25F, -0.75F, 0F, 0.55F, -0.75F, 0F, 0.55F, -0.75F, 0F, -1.25F, -0.75F, 0F); // Import Box0
		gunModel[350].setRotationPoint(-9.7F, -18.8F, -1F);

		gunModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.6F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, -1.6F, 0F, 0F, -1.25F, -0.75F, 0F, 0.55F, -0.75F, 0F, 0.55F, -0.75F, 0F, -1.25F, -0.75F, 0F); // Import Box0
		gunModel[351].setRotationPoint(-10.2F, -18.4F, -1F);

		gunModel[352].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[352].setRotationPoint(6.5F, -21.5F, -0.5F);

		gunModel[353].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[353].setRotationPoint(18.5F, -21.5F, -0.5F);

		gunModel[354].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[354].setRotationPoint(-2.5F, -21.5F, -0.5F);

		gunModel[355].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.1F, -0.15F, -0.15F, -0.1F, -0.15F, -0.15F, -0.1F, -0.15F, -0.15F, -0.1F, -0.15F, -0.15F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Import Box0
		gunModel[355].setRotationPoint(-2.5F, -21.65F, -0.5F);

		gunModel[356].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.1F, -0.15F, -0.15F, -0.1F, -0.15F, -0.15F, -0.1F, -0.15F, -0.15F, -0.1F, -0.15F, -0.15F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Import Box0
		gunModel[356].setRotationPoint(6.5F, -21.65F, -0.5F);

		gunModel[357].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.1F, -0.15F, -0.15F, -0.1F, -0.15F, -0.15F, -0.1F, -0.15F, -0.15F, -0.1F, -0.15F, -0.15F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Import Box0
		gunModel[357].setRotationPoint(18.5F, -21.65F, -0.5F);

		gunModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Import Box0
		gunModel[358].setRotationPoint(5.5F, -7.75F, -1F);

		gunModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F); // Import Box0
		gunModel[359].setRotationPoint(5.5F, -6.25F, -1F);

		gunModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.75F, 0F, -0.25F, 1F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, -1.75F, 0F, -0.25F); // Import Box0
		gunModel[360].setRotationPoint(6F, -5.25F, -1F);

		gunModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Import Box0
		gunModel[361].setRotationPoint(5.5F, -8.25F, -1F);

		gunModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, 1.75F, 0F, -0.25F, 1.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[362].setRotationPoint(5.5F, -9.25F, -1F);

		gunModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box0
		gunModel[363].setRotationPoint(3.5F, -4.5F, -1.5F);

		gunModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[364].setRotationPoint(3.5F, -4F, -1.5F);

		gunModel[365].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box0
		gunModel[365].setRotationPoint(5.5F, -2.75F, -1.5F);

		gunModel[366].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F); // Import Box0
		gunModel[366].setRotationPoint(10F, -2.75F, -1.5F);

		gunModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import Box0
		gunModel[367].setRotationPoint(4.25F, -3F, -1.5F);

		gunModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[368].setRotationPoint(5F, -2.75F, -1.5F);

		gunModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.75F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.75F, 0F, 0F); // Import Box0
		gunModel[369].setRotationPoint(11F, -3.75F, -1.5F);

		gunModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box0
		gunModel[370].setRotationPoint(12.25F, -4.5F, -1.5F);

		gunModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F); // Import Box0
		gunModel[371].setRotationPoint(12.25F, -4F, -1.5F);

		gunModel[372].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F); // Import Box0
		gunModel[372].setRotationPoint(12.25F, -8.5F, -1.5F);

		gunModel[373].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box0
		gunModel[373].setRotationPoint(12.25F, -9.5F, -2F);

		gunModel[374].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,-0.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[374].setRotationPoint(12.75F, -8.5F, -1.5F);

		gunModel[375].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.35F, 0F, -0.75F, -0.35F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[375].setRotationPoint(13F, -5.5F, -1.5F);

		gunModel[376].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.1F, -0.5F, 0F); // Import Box0
		gunModel[376].setRotationPoint(15F, -5.5F, -1F);

		gunModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.1F, 0F, 0F); // Import Box0
		gunModel[377].setRotationPoint(15F, -3F, -1F);

		gunModel[378].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Import Box0
		gunModel[378].setRotationPoint(12.25F, -9.25F, -2F);

		gunModel[379].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,-0.75F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F); // Import Box0
		gunModel[379].setRotationPoint(37.25F, -22.25F, -1.5F);

		gunModel[380].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Import Box0
		gunModel[380].setRotationPoint(40.25F, -22.75F, -1.5F);

		gunModel[381].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F); // Import Box0
		gunModel[381].setRotationPoint(37.75F, -22.75F, -1.5F);

		gunModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.25F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, -0.5F, -0.25F, -1F, -0.5F); // Import Box0
		gunModel[382].setRotationPoint(39.25F, -22.75F, -1.5F);

		gunModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, -1.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.5F, -1.5F, 0F); // Import Box0
		gunModel[383].setRotationPoint(39.75F, -22.75F, -1.5F);

		gunModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Import Box0
		gunModel[384].setRotationPoint(39.5F, -23.25F, -1.5F);

		gunModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[385].setRotationPoint(39.5F, -23F, -1.5F);

		gunModel[386].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[386].setRotationPoint(36.25F, -22.25F, -1.5F);

		gunModel[387].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[387].setRotationPoint(34.5F, -22.25F, -1.5F);

		gunModel[388].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -0.5F, -0.25F, 0F, -0.5F); // Import Box0
		gunModel[388].setRotationPoint(36.25F, -22.75F, -1.5F);

		gunModel[389].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.75F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.75F, -0.5F, 0F); // Import Box0
		gunModel[389].setRotationPoint(33.75F, -21.75F, -1.5F);

		gunModel[390].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Import Box0
		gunModel[390].setRotationPoint(40.25F, -22.75F, 0.5F);

		gunModel[391].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Import Box0
		gunModel[391].setRotationPoint(37.75F, -22.75F, 0.5F);

		gunModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.25F, -0.5F, -0.5F, 0.75F, -0.5F, -0.5F, 0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -1F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, 0F, -0.25F, -1F, 0F); // Import Box0
		gunModel[392].setRotationPoint(39.25F, -22.75F, 0.5F);

		gunModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, -1.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.5F, -1.5F, 0F); // Import Box0
		gunModel[393].setRotationPoint(39.75F, -22.75F, 0.5F);

		gunModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F); // Import Box0
		gunModel[394].setRotationPoint(39.5F, -23.25F, 0.5F);

		gunModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[395].setRotationPoint(39.5F, -23F, 0.5F);

		gunModel[396].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F); // Import Box0
		gunModel[396].setRotationPoint(33.25F, -23F, -1F);

		gunModel[397].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.75F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[397].setRotationPoint(36.25F, -22.75F, 0.5F);

		gunModel[398].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box596
		gunModel[398].setRotationPoint(33.25F, -23F, -0.25F);

		gunModel[399].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[399].setRotationPoint(33.25F, -23F, -0.25F);

		gunModel[400].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[400].setRotationPoint(31.25F, -23F, -1F);

		gunModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[401].setRotationPoint(30.75F, -23.5F, -1.5F);

		gunModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, -1F, -0.25F); // Import Box0
		gunModel[402].setRotationPoint(30.75F, -22.25F, -1.5F);

		gunModel[403].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, 0.15F, 0F, -0.5F, 0.15F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.15F, 0F, -1F, 0.15F); // Import Box0
		gunModel[403].setRotationPoint(30.75F, -24F, -1.5F);

		gunModel[404].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0.15F, -1F, -0.5F, 0.15F, -1F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, 0.15F, -0.5F, -1F, 0.15F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Import Box604
		gunModel[404].setRotationPoint(30.75F, -24F, 0.5F);

		gunModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.9F, 0F, -0.65F, -0.9F, 0F, -0.65F, -0.9F, -1F, 0F, -0.9F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F); // Import Box0
		gunModel[405].setRotationPoint(30.75F, -24F, -0.35F);

		gunModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.9F, -1F, -0.65F, -0.9F, -1F, -0.65F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box606
		gunModel[406].setRotationPoint(30.75F, -24F, -0.65F);

		gunModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.65F, -0.4F, -0.2F, -0.65F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, 0.1F); // Import Box596
		gunModel[407].setRotationPoint(34.25F, -23.25F, -0.25F);

		gunModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.65F, -0.4F, -0.2F, -0.65F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, 0.1F); // Import Box596
		gunModel[408].setRotationPoint(35.25F, -23.25F, -0.25F);

		gunModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.65F, -0.4F, -0.2F, -0.65F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, 0.1F); // Import Box596
		gunModel[409].setRotationPoint(36.25F, -23.25F, -0.25F);

		gunModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.65F, -0.4F, -0.2F, -0.65F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, 0.1F); // Import Box596
		gunModel[410].setRotationPoint(37.25F, -23.25F, -0.25F);

		gunModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.65F, -0.4F, -0.2F, -0.65F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, 0.1F); // Import Box596
		gunModel[411].setRotationPoint(38.25F, -23.25F, -0.25F);

		gunModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.65F, -0.4F, -0.2F, -0.65F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, 0.1F); // Import Box596
		gunModel[412].setRotationPoint(33.25F, -23.25F, -0.25F);

		gunModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, -0.65F, -0.4F, -0.2F, -0.65F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, -0.65F); // Import Box614
		gunModel[413].setRotationPoint(34.25F, -23.25F, -0.75F);

		gunModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, -0.65F, -0.4F, -0.2F, -0.65F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, -0.65F); // Import Box615
		gunModel[414].setRotationPoint(35.25F, -23.25F, -0.75F);

		gunModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, -0.65F, -0.4F, -0.2F, -0.65F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, -0.65F); // Import Box616
		gunModel[415].setRotationPoint(36.25F, -23.25F, -0.75F);

		gunModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, -0.65F, -0.4F, -0.2F, -0.65F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, -0.65F); // Import Box617
		gunModel[416].setRotationPoint(37.25F, -23.25F, -0.75F);

		gunModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, -0.65F, -0.4F, -0.2F, -0.65F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, -0.65F); // Import Box618
		gunModel[417].setRotationPoint(38.25F, -23.25F, -0.75F);

		gunModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.2F, 0.1F, -0.4F, -0.2F, 0.1F, -0.4F, -0.2F, -0.65F, -0.4F, -0.2F, -0.65F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, 0.1F, -0.4F, -0.75F, -0.65F, -0.4F, -0.75F, -0.65F); // Import Box619
		gunModel[418].setRotationPoint(33.25F, -23.25F, -0.75F);

		gunModel[419].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[419].setRotationPoint(31.5F, -23.5F, 0.5F);

		gunModel[420].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[420].setRotationPoint(31.5F, -23F, -2.5F);

		gunModel[421].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F); // Import Box0
		gunModel[421].setRotationPoint(31.5F, -22.5F, -2.5F);

		gunModel[422].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Import Box0
		gunModel[422].setRotationPoint(31.5F, -23.5F, -2.5F);

		gunModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		gunModel[423].setRotationPoint(31.87F, -23.13F, 1.25F);

		gunModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box0
		gunModel[424].setRotationPoint(31.87F, -22.63F, 1.25F);

		gunModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		gunModel[425].setRotationPoint(31.87F, -23.38F, 1.25F);

		gunModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		gunModel[426].setRotationPoint(31.87F, -23.13F, -2.25F);

		gunModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box0
		gunModel[427].setRotationPoint(31.87F, -22.63F, -2.25F);

		gunModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		gunModel[428].setRotationPoint(31.87F, -23.38F, -2.25F);

		gunModel[429].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[429].setRotationPoint(-7.5F, -17.1F, 2.75F);

		gunModel[430].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		gunModel[430].setRotationPoint(-7.5F, -16.85F, 2.75F);

		gunModel[431].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[431].setRotationPoint(-7.5F, -17.35F, 2.75F);

		gunModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F); // Import Box0
		gunModel[432].setRotationPoint(-7.75F, -17.1F, 2.75F);

		gunModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.5F); // Import Box0
		gunModel[433].setRotationPoint(-7.75F, -16.85F, 2.75F);

		gunModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[434].setRotationPoint(-7.75F, -17.35F, 2.75F);

		gunModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F); // Import Box0
		gunModel[435].setRotationPoint(20.75F, -17.1F, 2.75F);

		gunModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F); // Import Box0
		gunModel[436].setRotationPoint(20.75F, -16.85F, 2.75F);

		gunModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, 0F); // Import Box0
		gunModel[437].setRotationPoint(20.75F, -17.35F, 2.75F);

		gunModel[438].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box641
		gunModel[438].setRotationPoint(-7.5F, -17.1F, -3.75F);

		gunModel[439].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box642
		gunModel[439].setRotationPoint(-7.5F, -16.85F, -3.75F);

		gunModel[440].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box643
		gunModel[440].setRotationPoint(-7.5F, -17.35F, -3.75F);

		gunModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box644
		gunModel[441].setRotationPoint(-7.75F, -17.1F, -3.75F);

		gunModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box645
		gunModel[442].setRotationPoint(-7.75F, -16.85F, -3.75F);

		gunModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box646
		gunModel[443].setRotationPoint(-7.75F, -17.35F, -3.75F);

		gunModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Import Box647
		gunModel[444].setRotationPoint(3.25F, -17.1F, -3.75F);

		gunModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Import Box648
		gunModel[445].setRotationPoint(3.25F, -16.85F, -3.75F);

		gunModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import Box649
		gunModel[446].setRotationPoint(3.25F, -17.35F, -3.75F);

		gunModel[447].addShapeBox(0F, 0F, 0F, 14, 2, 3, 0F,-1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -1F, -0.25F, 0.5F); // Import Box0
		gunModel[447].setRotationPoint(18.5F, -19.25F, 0F);

		gunModel[448].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 2F, 0.5F, 0.5F); // Import Box0
		gunModel[448].setRotationPoint(21.5F, -20.25F, 1F);

		gunModel[449].addShapeBox(0F, 0F, 0F, 18, 1, 3, 0F,0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box0
		gunModel[449].setRotationPoint(4.5F, -17.25F, 0F);

		gunModel[450].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[450].setRotationPoint(4.5F, -16.25F, 0F);

		gunModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[451].setRotationPoint(19.5F, -19.25F, -3F);

		gunModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, -0.7F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[452].setRotationPoint(19.5F, -19.75F, -3F);

		gunModel[453].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[453].setRotationPoint(19.5F, -20.75F, -2.5F);

		gunModel[454].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.25F, 0.5F, 1.25F, 0.25F, 0.5F, 1.25F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box0
		gunModel[454].setRotationPoint(4.5F, -17.25F, -3F);

		gunModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[455].setRotationPoint(4.5F, -16.25F, -3F);

		gunModel[456].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1.1F, -0.25F, 0.75F, 0.05F, -0.25F, 1F, 0.05F, -0.25F, 0.5F, -1.1F, -0.25F, 0.5F, 0.5F, 0.5F, 0.75F, -1.5F, 0.5F, 1F, -1.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Import Box0
		gunModel[456].setRotationPoint(6F, -17.25F, -3F);

		gunModel[457].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0.75F, -1F, -1F, 1F, -1F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, 0.5F, 0F, -1.5F, 0.5F, 0.75F, -1.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Import Box0
		gunModel[457].setRotationPoint(5.5F, -16.75F, -3F);

		gunModel[458].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.75F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.1F, -0.25F, 0.75F, -1F, -0.25F, 1F, -1F, -0.25F, 0.5F, -0.1F, -0.25F, 0.5F); // Import Box0
		gunModel[458].setRotationPoint(7F, -17.75F, -3F);

		gunModel[459].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,-1F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, 0F, -0.25F, 1F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Import Box0
		gunModel[459].setRotationPoint(8F, -17.75F, -3F);

		gunModel[460].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[460].setRotationPoint(6F, -17.75F, -2.75F);

		gunModel[461].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[461].setRotationPoint(1.5F, -13.75F, -4F);

		gunModel[462].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F); // Import Box0
		gunModel[462].setRotationPoint(1.5F, -12.75F, -4F);

		gunModel[463].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[463].setRotationPoint(1.5F, -14.75F, -4F);

		gunModel[464].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[464].setRotationPoint(3.5F, -14.75F, -4F);

		gunModel[465].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[465].setRotationPoint(6.5F, -14.75F, -4F);

		gunModel[466].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[466].setRotationPoint(0.5F, -13.5F, -3.25F);

		gunModel[467].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Import Box0
		gunModel[467].setRotationPoint(0.5F, -12.25F, -3.25F);

		gunModel[468].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Import Box0
		gunModel[468].setRotationPoint(0.5F, -14.75F, -3.25F);

		gunModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[469].setRotationPoint(2.5F, -12.25F, -3.25F);

		gunModel[470].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0.25F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[470].setRotationPoint(3.5F, -12.25F, -3.25F);

		gunModel[471].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-1F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, -1F, 2.75F, 0F, 0.5F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0.5F, -2F, 0F); // Import Box0
		gunModel[471].setRotationPoint(7.5F, -13.75F, -3.25F);

		gunModel[472].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[472].setRotationPoint(1.25F, -13.75F, -4F);

		gunModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F); // Import Box0
		gunModel[473].setRotationPoint(1.25F, -12.75F, -4F);

		gunModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[474].setRotationPoint(1.25F, -14.75F, -4F);

		gunModel[475].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -1F, -0.25F, 0F); // Import Box0
		gunModel[475].setRotationPoint(1.5F, -12.5F, -4F);

		gunModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -0.5F, -0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -1.25F, -1F, -0.5F, -1.25F, -1.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -1.25F, -1.25F, -0.25F, -1.25F); // Import Box0
		gunModel[476].setRotationPoint(1.25F, -12.5F, -4F);

		gunModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -1.25F, -1.25F, -0.25F, -1.25F, -1F, -0.5F, -0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -1.25F, -1F, -0.5F, -1.25F); // Import Box0
		gunModel[477].setRotationPoint(1.25F, -15F, -4F);

		gunModel[478].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import Box0
		gunModel[478].setRotationPoint(1.5F, -15F, -4F);

		gunModel[479].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, -1F, -0.25F, 0F); // Import Box0
		gunModel[479].setRotationPoint(2.5F, -12.5F, -4F);

		gunModel[480].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,-1F, -0.5F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, -1F, -0.5F, 0F, -1F, -0.25F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, 0F, -1F, -0.25F, 0F); // Import Box0
		gunModel[480].setRotationPoint(5.5F, -13.25F, -4F);

		gunModel[481].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,-1F, -0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, -1F, -0.25F, 0F, -1F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -1F, -0.5F, 0F); // Import Box0
		gunModel[481].setRotationPoint(5.5F, -15F, -4F);

		gunModel[482].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F); // Import Box0
		gunModel[482].setRotationPoint(15.5F, -16.25F, -3.5F);

		gunModel[483].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[483].setRotationPoint(15.5F, -17.25F, -3.5F);

		gunModel[484].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[484].setRotationPoint(15.5F, -17.5F, -3.5F);

		gunModel[485].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[485].setRotationPoint(15.5F, -14.5F, -3.5F);

		gunModel[486].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0.25F, -1.5F, 0F, -0.75F, -1.5F, 0F, -0.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1F, -1.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[486].setRotationPoint(15.5F, -14.5F, -3.5F);

		gunModel[487].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,-0.25F, -0.5F, 0.25F, -0.25F, 0.75F, 0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, -1.25F, 0.25F, -0.25F, -1.25F, -0.25F, -0.25F, 0F, -0.25F); // Import Box0
		gunModel[487].setRotationPoint(-46F, -2.25F, -2.15F);

		gunModel[488].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, -0.5F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[488].setRotationPoint(-40.75F, -3.5F, -2.15F);

		gunModel[489].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.25F, -0.75F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		gunModel[489].setRotationPoint(-46.25F, -2.25F, -2.15F);

		gunModel[490].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[490].setRotationPoint(-50F, -3F, -3F);

		gunModel[491].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.6F, 0F); // Import Box0
		gunModel[491].setRotationPoint(-40F, -3F, -3F);

		gunModel[492].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[492].setRotationPoint(-45.75F, -3F, -3F);

		gunModel[493].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[493].setRotationPoint(-46F, -3F, -3F);

		gunModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.15F, 0F); // Import Box0
		gunModel[494].setRotationPoint(-46F, -1F, -3F);

		gunModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.85F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.85F, 0F, 0F, -0.15F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.15F, 0F); // Import Box0
		gunModel[495].setRotationPoint(-40.25F, -2.35F, -3F);

		gunModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -1F, 0F); // Import Box0
		gunModel[496].setRotationPoint(-41F, -3F, -3F);

		gunModel[497].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.5F, -0.25F, 0.3F, -0.3F, -0.25F, 0.3F, -0.3F, -0.5F, -0.3F, -0.5F, -0.5F, -0.75F, -0.05F, -0.25F, 0.75F, -0.3F, -0.25F, 0.75F, -0.3F, -0.5F, -0.75F, -0.05F, -0.5F); // Import Box0
		gunModel[497].setRotationPoint(-44F, -2.75F, 2.5F);

		gunModel[498].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		gunModel[498].setRotationPoint(41F, -21.65F, -2.5F);

		gunModel[499].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Import Box0
		gunModel[499].setRotationPoint(41F, -21.15F, -2.5F);
	}

	private void initgunModel_2()
	{
		gunModel[500] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Import Box0
		gunModel[501] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import Box0
		gunModel[502] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Import Box0
		gunModel[503] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Import Box0
		gunModel[504] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Import Box0
		gunModel[505] = new ModelRendererTurbo(this, 921, 9, textureX, textureY); // Import Box0
		gunModel[506] = new ModelRendererTurbo(this, 937, 9, textureX, textureY); // Import Box0

		gunModel[500].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		gunModel[500].setRotationPoint(41F, -22.15F, -2.5F);

		gunModel[501].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.75F, 0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, 0.5F, 0F); // Import Box0
		gunModel[501].setRotationPoint(39.5F, -21.65F, -2.25F);

		gunModel[502].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.5F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.25F, -0.5F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[502].setRotationPoint(38.5F, -20.65F, -2.75F);

		gunModel[503].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.6F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.5F, -0.6F, 0F, -1.25F, 0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0.1F, 0F); // Import Box0
		gunModel[503].setRotationPoint(38F, -20.65F, -2.75F);

		gunModel[504].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.6F, -0.75F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.6F, -0.75F, 0F, -1.25F, -0.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, -0.05F, 0F); // Import Box0
		gunModel[504].setRotationPoint(37.75F, -20.55F, -2.75F);

		gunModel[505].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[505].setRotationPoint(41.25F, -21.65F, -2.25F);

		gunModel[506].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.5F, -0.25F, 0.3F, -0.3F, -0.25F, 0.3F, -0.3F, -0.5F, -0.3F, -0.5F, -0.5F, -0.75F, -0.05F, -0.25F, 0.75F, -0.3F, -0.25F, 0.75F, -0.3F, -0.5F, -0.75F, -0.05F, -0.5F); // Import Box0
		gunModel[506].setRotationPoint(-44F, -2.75F, -3.25F);
	}

	private void initdefaultBarrelModel_1()
	{
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Import Box0
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Import Box0
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box0
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import Box0
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Import Box0
		defaultBarrelModel[6] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import Box0
		defaultBarrelModel[7] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Import Box0
		defaultBarrelModel[8] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Import Box189
		defaultBarrelModel[9] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import Box190
		defaultBarrelModel[10] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import Box191
		defaultBarrelModel[11] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Import Box0
		defaultBarrelModel[12] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Import Box0
		defaultBarrelModel[13] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Import Box0
		defaultBarrelModel[14] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Import Box199
		defaultBarrelModel[15] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Import Box200
		defaultBarrelModel[16] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import Box201
		defaultBarrelModel[17] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Import Box0

		defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		defaultBarrelModel[0].setRotationPoint(98.25F, -14.5F, 0.5F);

		defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		defaultBarrelModel[1].setRotationPoint(98.25F, -15.5F, -1.5F);

		defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		defaultBarrelModel[2].setRotationPoint(102.75F, -15.5F, -1.5F);

		defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultBarrelModel[3].setRotationPoint(102.75F, -15.5F, 0.5F);

		defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultBarrelModel[4].setRotationPoint(98.25F, -15.5F, 0.5F);

		defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultBarrelModel[5].setRotationPoint(98.25F, -14.5F, -0.5F);

		defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		defaultBarrelModel[6].setRotationPoint(98.25F, -14.5F, 0F);

		defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		defaultBarrelModel[7].setRotationPoint(98.25F, -15F, 1F);

		defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box189
		defaultBarrelModel[8].setRotationPoint(98.25F, -14.5F, -1.5F);

		defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box190
		defaultBarrelModel[9].setRotationPoint(98.25F, -14.5F, -1F);

		defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box191
		defaultBarrelModel[10].setRotationPoint(98.25F, -15F, -2F);

		defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F); // Import Box0
		defaultBarrelModel[11].setRotationPoint(98.25F, -16.5F, -1.5F);

		defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F); // Import Box0
		defaultBarrelModel[12].setRotationPoint(98.25F, -16F, -2F);

		defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Import Box0
		defaultBarrelModel[13].setRotationPoint(98.25F, -16F, -1.5F);

		defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box199
		defaultBarrelModel[14].setRotationPoint(98.25F, -16.5F, -0.5F);

		defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box200
		defaultBarrelModel[15].setRotationPoint(98.25F, -16F, 0F);

		defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box201
		defaultBarrelModel[16].setRotationPoint(98.25F, -16F, -0.5F);

		defaultBarrelModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultBarrelModel[17].setRotationPoint(98.25F, -17F, -0.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 601, 57, textureX, textureY); // Import Box0
		ammoModel[6] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Import Box0
		ammoModel[7] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Import Box0
		ammoModel[8] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Import Box0
		ammoModel[9] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Import Box0
		ammoModel[10] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Import Box0
		ammoModel[11] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Import Box0
		ammoModel[12] = new ModelRendererTurbo(this, 713, 57, textureX, textureY); // Import Box0
		ammoModel[13] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Import Box0
		ammoModel[14] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Import Box0
		ammoModel[15] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Import Box0
		ammoModel[16] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Import Box0
		ammoModel[17] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Import Box0
		ammoModel[18] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import Box0
		ammoModel[19] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Import Box0
		ammoModel[20] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Import Box0
		ammoModel[21] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Import Box0
		ammoModel[22] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Import Box0
		ammoModel[23] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import Box0
		ammoModel[24] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Import Box0
		ammoModel[25] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Import Box0
		ammoModel[26] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Import Box0
		ammoModel[27] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Import Box0
		ammoModel[28] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Import Box0
		ammoModel[29] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Import Box0
		ammoModel[30] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Import Box0
		ammoModel[31] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Import Box0
		ammoModel[32] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Import Box0
		ammoModel[33] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Import Box0
		ammoModel[34] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Import Box0
		ammoModel[35] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Import Box0
		ammoModel[36] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Import Box0
		ammoModel[37] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Import Box0
		ammoModel[38] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import Box0
		ammoModel[39] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Import Box0
		ammoModel[40] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Import Box0
		ammoModel[41] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Import Box0
		ammoModel[42] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Import Box0
		ammoModel[43] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Import Box0
		ammoModel[44] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Import Box0
		ammoModel[45] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Import Box0
		ammoModel[46] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Import Box0
		ammoModel[47] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Import Box0
		ammoModel[48] = new ModelRendererTurbo(this, 553, 65, textureX, textureY); // Import Box0
		ammoModel[49] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // Import Box0
		ammoModel[50] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Import Box0
		ammoModel[51] = new ModelRendererTurbo(this, 609, 65, textureX, textureY); // Import Box0
		ammoModel[52] = new ModelRendererTurbo(this, 625, 65, textureX, textureY); // Import Box0
		ammoModel[53] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Import Box0
		ammoModel[54] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Import Box0
		ammoModel[55] = new ModelRendererTurbo(this, 697, 65, textureX, textureY); // Import Box0
		ammoModel[56] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Import Box0
		ammoModel[57] = new ModelRendererTurbo(this, 745, 65, textureX, textureY); // Import Box0
		ammoModel[58] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Import Box0
		ammoModel[59] = new ModelRendererTurbo(this, 777, 65, textureX, textureY); // Import Box0
		ammoModel[60] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Import Box0
		ammoModel[61] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Import Box0
		ammoModel[62] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Import Box0
		ammoModel[63] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Import Box0
		ammoModel[64] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Import Box0
		ammoModel[65] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Import Box0
		ammoModel[66] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Import Box0
		ammoModel[67] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Import Box0
		ammoModel[68] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Import Box0
		ammoModel[69] = new ModelRendererTurbo(this, 1001, 65, textureX, textureY); // Import Box0
		ammoModel[70] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box0
		ammoModel[71] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Import Box0
		ammoModel[72] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import Box0
		ammoModel[73] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import Box0
		ammoModel[74] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Import Box0
		ammoModel[75] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Import Box0
		ammoModel[76] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Import Box0
		ammoModel[77] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Import Box0
		ammoModel[78] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Import Box0
		ammoModel[79] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Import Box0
		ammoModel[80] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Import Box0
		ammoModel[81] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Import Box0
		ammoModel[82] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Import Box0
		ammoModel[83] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Import Box0
		ammoModel[84] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Import Box0
		ammoModel[85] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Import Box0
		ammoModel[86] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Import Box0
		ammoModel[87] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Import Box0
		ammoModel[88] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Import Box0
		ammoModel[89] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Import Box0
		ammoModel[90] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Import Box0
		ammoModel[91] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Import Box0
		ammoModel[92] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Import Box0
		ammoModel[93] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Import Box0
		ammoModel[94] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Import Box0
		ammoModel[95] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Import Box0
		ammoModel[96] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Import Box0
		ammoModel[97] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Import Box0
		ammoModel[98] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Import Box0
		ammoModel[99] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Import Box0
		ammoModel[100] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Import Box0
		ammoModel[101] = new ModelRendererTurbo(this, 521, 73, textureX, textureY); // Import Box0
		ammoModel[102] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Import Box0
		ammoModel[103] = new ModelRendererTurbo(this, 553, 73, textureX, textureY); // Import Box0
		ammoModel[104] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Import Box0
		ammoModel[105] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); // Import Box0
		ammoModel[106] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Import Box0
		ammoModel[107] = new ModelRendererTurbo(this, 633, 73, textureX, textureY); // Import Box0
		ammoModel[108] = new ModelRendererTurbo(this, 657, 73, textureX, textureY); // Import Box0
		ammoModel[109] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Import Box0
		ammoModel[110] = new ModelRendererTurbo(this, 689, 73, textureX, textureY); // Import Box0
		ammoModel[111] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Import Box0
		ammoModel[112] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Import Box0
		ammoModel[113] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Import Box0
		ammoModel[114] = new ModelRendererTurbo(this, 769, 73, textureX, textureY); // Import Box0
		ammoModel[115] = new ModelRendererTurbo(this, 785, 73, textureX, textureY); // Import Box0
		ammoModel[116] = new ModelRendererTurbo(this, 801, 73, textureX, textureY); // Import Box0
		ammoModel[117] = new ModelRendererTurbo(this, 817, 73, textureX, textureY); // Import Box0
		ammoModel[118] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Import Box0
		ammoModel[119] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Import Box0
		ammoModel[120] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Import Box0
		ammoModel[121] = new ModelRendererTurbo(this, 937, 73, textureX, textureY); // Import Box0
		ammoModel[122] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box0
		ammoModel[123] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Import Box0
		ammoModel[124] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Import Box0
		ammoModel[125] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Import Box0
		ammoModel[126] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Import Box0
		ammoModel[127] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Import Box0
		ammoModel[128] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Import Box0
		ammoModel[129] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Import Box0
		ammoModel[130] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Import Box0
		ammoModel[131] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Import Box0
		ammoModel[132] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Import Box0
		ammoModel[133] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Import Box0
		ammoModel[134] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Import Box0
		ammoModel[135] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Import Box0
		ammoModel[136] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Import Box0
		ammoModel[137] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Import Box0
		ammoModel[138] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Import Box0
		ammoModel[139] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Import Box0
		ammoModel[140] = new ModelRendererTurbo(this, 961, 73, textureX, textureY); // Import Box0
		ammoModel[141] = new ModelRendererTurbo(this, 977, 73, textureX, textureY); // Import Box0
		ammoModel[142] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Import Box0
		ammoModel[143] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Import Box0
		ammoModel[144] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Import Box0
		ammoModel[145] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Import Box0
		ammoModel[146] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Import Box0
		ammoModel[147] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Import Box0
		ammoModel[148] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Import Box0
		ammoModel[149] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Import Box0
		ammoModel[150] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Import Box0
		ammoModel[151] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Import Box0
		ammoModel[152] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Import Box0
		ammoModel[153] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Import Box0
		ammoModel[154] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Import Box0
		ammoModel[155] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Import Box0
		ammoModel[156] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Import Box0
		ammoModel[157] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Import Box0
		ammoModel[158] = new ModelRendererTurbo(this, 545, 81, textureX, textureY); // Import Box0
		ammoModel[159] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Import Box0
		ammoModel[160] = new ModelRendererTurbo(this, 577, 81, textureX, textureY); // Import Box0
		ammoModel[161] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Import Box0
		ammoModel[162] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Import Box0
		ammoModel[163] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Import Box0
		ammoModel[164] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Import Box0
		ammoModel[165] = new ModelRendererTurbo(this, 681, 81, textureX, textureY); // Import Box0
		ammoModel[166] = new ModelRendererTurbo(this, 697, 81, textureX, textureY); // Import Box0
		ammoModel[167] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Import Box0
		ammoModel[168] = new ModelRendererTurbo(this, 737, 81, textureX, textureY); // Import Box0
		ammoModel[169] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Import Box0
		ammoModel[170] = new ModelRendererTurbo(this, 769, 81, textureX, textureY); // Import Box0
		ammoModel[171] = new ModelRendererTurbo(this, 785, 81, textureX, textureY); // Import Box0
		ammoModel[172] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Import Box0
		ammoModel[173] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Import Box0
		ammoModel[174] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Import Box0
		ammoModel[175] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Import Box0
		ammoModel[176] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Import Box0
		ammoModel[177] = new ModelRendererTurbo(this, 889, 81, textureX, textureY); // Import Box0
		ammoModel[178] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Import Box0
		ammoModel[179] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Import Box0

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.25F); // Import Box0
		ammoModel[0].setRotationPoint(16.75F, -11.5F, -2F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -1F, 0F, -0.25F); // Import Box0
		ammoModel[1].setRotationPoint(16.75F, -6.5F, -2F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.25F, -2.5F, 0F, -0.25F, 2F, 0F, 0.25F, 2F, 0F, 0.25F, -2.5F, 0F, -0.25F); // Import Box0
		ammoModel[2].setRotationPoint(17.75F, -2.5F, -2F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, 2.5F, 0F, 0.25F, 2.5F, 0F, 0.25F, -3F, 0F, -0.25F); // Import Box0
		ammoModel[3].setRotationPoint(20.25F, 3.5F, -2F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.25F, -3.75F, 0F, -0.25F, 3.25F, 0F, 0.25F, 3.25F, 0F, 0.25F, -3.75F, 0F, -0.25F); // Import Box0
		ammoModel[4].setRotationPoint(23.25F, 8.5F, -2F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0.25F, 0F, -0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0.25F, 0F, -0.25F, -5F, 0F, -0.25F, 4.5F, 0F, 0.25F, 4.5F, 0F, 0.25F, -5F, 0F, -0.25F); // Import Box0
		ammoModel[5].setRotationPoint(27.25F, 13.5F, -2F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.25F, 0F, -0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0.25F, 0F, -0.25F, -2.5F, 0F, -0.25F, 1.75F, -0.25F, 0.25F, 1.75F, -0.25F, 0.25F, -2.5F, 0F, -0.25F); // Import Box0
		ammoModel[6].setRotationPoint(32.5F, 18.5F, -2F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 6, 5, 4, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		ammoModel[7].setRotationPoint(19.25F, -11.5F, -2F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 1.5F, 0F, 0.25F, 1.5F, 0F, 0.25F, -1F, 0F, 0.25F); // Import Box0
		ammoModel[8].setRotationPoint(19.25F, -6.5F, -2F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, -2.5F, 0F, 0.25F, 3.5F, 0F, 0.25F, 3.5F, 0F, 0.25F, -2.5F, 0F, 0.25F); // Import Box0
		ammoModel[9].setRotationPoint(20.25F, -2.5F, -2F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 7, 5, 4, 0F,0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, 2.75F, 0F, 0.25F, 2.75F, 0F, 0.25F, -3F, 0F, 0.25F); // Import Box0
		ammoModel[10].setRotationPoint(22.75F, 3.5F, -2F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 7, 5, 4, 0F,0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, -3.75F, 0F, 0.25F, 5.25F, 0F, 0.25F, 5.25F, 0F, 0.25F, -3.75F, 0F, 0.25F); // Import Box0
		ammoModel[11].setRotationPoint(25.75F, 8.5F, -2F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -5F, 0F, 0.25F, 3F, -1.25F, 0.25F, 3F, -1.25F, 0.25F, -5F, 0F, 0.25F); // Import Box0
		ammoModel[12].setRotationPoint(27.75F, 13.5F, -2F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F); // Import Box0
		ammoModel[13].setRotationPoint(24.75F, -11.5F, -2F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0F, 0.25F); // Import Box0
		ammoModel[14].setRotationPoint(24.75F, -6.5F, -2F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, 2.5F, 0F, -0.25F, 2.5F, 0F, -0.25F, -3F, 0F, 0.25F); // Import Box0
		ammoModel[15].setRotationPoint(25.75F, -2.5F, -2F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, -3.75F, 0F, 0.25F, 3.25F, 0F, -0.25F, 3.25F, 0F, -0.25F, -3.75F, 0F, 0.25F); // Import Box0
		ammoModel[16].setRotationPoint(28.75F, 3.5F, -2F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0.25F, 0F, 0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, 0.25F, -5.25F, 0F, 0.25F, 4.75F, 0F, -0.25F, 4.75F, 0F, -0.25F, -5.25F, 0F, 0.25F); // Import Box0
		ammoModel[17].setRotationPoint(32.75F, 8.5F, -2F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.25F, 0F, 0.25F, 3.8F, 2.25F, 0.25F, 3.8F, 2.25F, 0.25F, 0.25F, 0F, 0.25F, -2.25F, -0.25F, 0.25F, 3.75F, -3.75F, 0.25F, 3.75F, -3.75F, 0.25F, -2.25F, -0.25F, 0.25F); // Import Box0
		ammoModel[18].setRotationPoint(33F, 18.5F, -2F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, 0F, 0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, 0.25F, -1F, -0.25F, 0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -1F, -0.25F, 0.25F); // Import Box0
		ammoModel[19].setRotationPoint(38.25F, 13.5F, -2F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, 0.5F, 0.25F, -1.25F, 0.5F, 0.25F, -1.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.5F, 1.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0.5F, 1.75F, 0.25F); // Import Box0
		ammoModel[20].setRotationPoint(38.25F, 14F, -2F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		ammoModel[21].setRotationPoint(25.25F, -11.5F, -1.5F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F); // Import Box0
		ammoModel[22].setRotationPoint(26.75F, -11.5F, -1.5F);

		ammoModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0.25F); // Import Box0
		ammoModel[23].setRotationPoint(26.75F, -8.5F, -1.5F);

		ammoModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.25F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0.25F); // Import Box0
		ammoModel[24].setRotationPoint(27.75F, -5.5F, -1.5F);

		ammoModel[25].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0.25F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0.25F, -3F, 0F, 0.25F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0.25F); // Import Box0
		ammoModel[25].setRotationPoint(28.75F, -2.5F, -1.5F);

		ammoModel[26].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -4.25F, 0F, 0.25F, 3.75F, 0F, 0F, 3.75F, 0F, 0F, -4.25F, 0F, 0.25F); // Import Box0
		ammoModel[26].setRotationPoint(31.75F, 3.5F, -1.5F);

		ammoModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -4.25F, 0F, 0.25F, 3.75F, 0F, 0F, 3.75F, 0F, 0F, -4.25F, 0F, 0.25F); // Import Box0
		ammoModel[27].setRotationPoint(36F, 8.5F, -1.5F);

		ammoModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0.25F); // Import Box0
		ammoModel[28].setRotationPoint(40.25F, 11.5F, -1.5F);

		ammoModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 1.25F, -0.25F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, 0.25F, 1.25F, -0.25F, 0.25F); // Import Box0
		ammoModel[29].setRotationPoint(40.25F, 12F, -1.5F);

		ammoModel[30].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, -3.75F, 0F, 0.25F, 3.75F, 0F, 0.25F, 3.75F, 0F, 0.25F, -3.75F, 0F, 0.25F); // Import Box0
		ammoModel[30].setRotationPoint(29.25F, 3.5F, -1.5F);

		ammoModel[31].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, 2.5F, 0F, 0.25F, 2.5F, 0F, 0.25F, -3F, 0F, 0.25F); // Import Box0
		ammoModel[31].setRotationPoint(26.25F, -2.5F, -1.5F);

		ammoModel[32].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, -1F, 0.25F); // Import Box0
		ammoModel[32].setRotationPoint(25.25F, -8.5F, -1.5F);

		ammoModel[33].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,1F, 1F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 1F, 1F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		ammoModel[33].setRotationPoint(26.25F, -5.5F, -1.5F);

		ammoModel[34].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -5F, 2F, 0.25F, 3.75F, 0F, 0.25F, 3.75F, 0F, 0.25F, -5F, 2F, 0.25F); // Import Box0
		ammoModel[34].setRotationPoint(33.5F, 8.5F, -1.5F);

		ammoModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.05F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.05F, -0.5F, 0.25F); // Import Box0
		ammoModel[35].setRotationPoint(39.75F, 11.5F, -1.5F);

		ammoModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.05F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.05F, 0F, 0.25F, 1.25F, -0.5F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F, -0.25F, 0.25F, 1.25F, -0.5F, 0.25F); // Import Box0
		ammoModel[36].setRotationPoint(39.75F, 12F, -1.5F);

		ammoModel[37].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[37].setRotationPoint(16.25F, -11.5F, -1F);

		ammoModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F); // Import Box0
		ammoModel[38].setRotationPoint(16.25F, -6.5F, -1F);

		ammoModel[39].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -2.25F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.25F, 0F, 0F); // Import Box0
		ammoModel[39].setRotationPoint(17.25F, -2.5F, -1F);

		ammoModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -2.75F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.75F, 0F, 0F); // Import Box0
		ammoModel[40].setRotationPoint(19.75F, 3.5F, -1F);

		ammoModel[41].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -3.5F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, -3.5F, 0F, 0F); // Import Box0
		ammoModel[41].setRotationPoint(22.75F, 8.5F, -1F);

		ammoModel[42].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, -4.75F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, -4.75F, 0F, 0F); // Import Box0
		ammoModel[42].setRotationPoint(26.75F, 13.5F, -1F);

		ammoModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, -2.25F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.25F, 0F, 0F); // Import Box0
		ammoModel[43].setRotationPoint(32F, 18.5F, -1F);

		ammoModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[44].setRotationPoint(20F, -7.5F, -2.5F);

		ammoModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[45].setRotationPoint(21.5F, -7.5F, -2.5F);

		ammoModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[46].setRotationPoint(23F, -7.5F, -2.5F);

		ammoModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F); // Import Box0
		ammoModel[47].setRotationPoint(22.5F, -7.5F, -2.5F);

		ammoModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F); // Import Box0
		ammoModel[48].setRotationPoint(23.25F, -7.5F, -2.5F);

		ammoModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		ammoModel[49].setRotationPoint(23F, -6.5F, -2.5F);

		ammoModel[50].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F); // Import Box0
		ammoModel[50].setRotationPoint(23.25F, -4.5F, -2.5F);

		ammoModel[51].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		ammoModel[51].setRotationPoint(24.5F, -0.5F, -2.5F);

		ammoModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -2.75F, 0F, 0F); // Import Box0
		ammoModel[52].setRotationPoint(26.5F, 3.5F, -2.5F);

		ammoModel[53].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -3.75F, 0.5F, 0F, 3.25F, 0.5F, 0F, 3.25F, 0.5F, 0F, -3.75F, 0.5F, 0F); // Import Box0
		ammoModel[53].setRotationPoint(29.5F, 7.5F, -2.5F);

		ammoModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		ammoModel[54].setRotationPoint(21.5F, -6.5F, -2.5F);

		ammoModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F); // Import Box0
		ammoModel[55].setRotationPoint(21.75F, -4.5F, -2.5F);

		ammoModel[56].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		ammoModel[56].setRotationPoint(23F, -0.5F, -2.5F);

		ammoModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		ammoModel[57].setRotationPoint(20F, -6.5F, -2.5F);

		ammoModel[58].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F); // Import Box0
		ammoModel[58].setRotationPoint(20.25F, -4.5F, -2.5F);

		ammoModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		ammoModel[59].setRotationPoint(21.5F, -0.5F, -2.5F);

		ammoModel[60].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -2.75F, 0F, 0F); // Import Box0
		ammoModel[60].setRotationPoint(25F, 3.5F, -2.5F);

		ammoModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Import Box0
		ammoModel[61].setRotationPoint(23.5F, 3.5F, -2.5F);

		ammoModel[62].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0.5F, 0F, 2.5F, 0.5F, 0F, 2.5F, 0.5F, 0F, -3F, 0.5F, 0F); // Import Box0
		ammoModel[62].setRotationPoint(26.5F, 7.5F, -2.5F);

		ammoModel[63].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -2.75F, -0.25F, 0F, 2.25F, -0.25F, 0F, 2.25F, -0.25F, 0F, -2.75F, -0.25F, 0F); // Import Box0
		ammoModel[63].setRotationPoint(28F, 7.5F, -2.5F);

		ammoModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1F, 0.5F, 0F); // Import Box0
		ammoModel[64].setRotationPoint(30F, 12F, -2.5F);

		ammoModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F); // Import Box0
		ammoModel[65].setRotationPoint(23.25F, -6.5F, -2.5F);

		ammoModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.5F, 0F, 0F); // Import Box0
		ammoModel[66].setRotationPoint(23.5F, -4.5F, -2.5F);

		ammoModel[67].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -2.25F, 0F, 0F); // Import Box0
		ammoModel[67].setRotationPoint(24.75F, -0.5F, -2.5F);

		ammoModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -3F, 0F, 0F, 2.25F, 0F, -0.25F, 2.25F, 0F, -0.25F, -3F, 0F, 0F); // Import Box0
		ammoModel[68].setRotationPoint(26.75F, 3.5F, -2.5F);

		ammoModel[69].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -4.25F, -0.5F, 0F, 3.5F, -0.5F, -0.25F, 3.5F, -0.5F, -0.25F, -4.25F, -0.5F, 0F); // Import Box0
		ammoModel[69].setRotationPoint(29.5F, 7.5F, -2.5F);

		ammoModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		ammoModel[70].setRotationPoint(23F, -8F, -2.5F);

		ammoModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.25F); // Import Box0
		ammoModel[71].setRotationPoint(22.5F, -8F, -2.5F);

		ammoModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, 0F); // Import Box0
		ammoModel[72].setRotationPoint(23.25F, -8F, -2.5F);

		ammoModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		ammoModel[73].setRotationPoint(33.25F, 11.5F, -2.5F);

		ammoModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F); // Import Box0
		ammoModel[74].setRotationPoint(32.75F, 11.5F, -2.5F);

		ammoModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		ammoModel[75].setRotationPoint(33.5F, 11.5F, -2.5F);

		ammoModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F); // Import Box0
		ammoModel[76].setRotationPoint(22.5F, -6.5F, -2.5F);

		ammoModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.5F, 0F, -0.25F); // Import Box0
		ammoModel[77].setRotationPoint(22.75F, -4.5F, -2.5F);

		ammoModel[78].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -2.25F, 0F, -0.25F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2.25F, 0F, -0.25F); // Import Box0
		ammoModel[78].setRotationPoint(24F, -0.5F, -2.5F);

		ammoModel[79].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -3F, 0F, -0.25F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -3F, 0F, -0.25F); // Import Box0
		ammoModel[79].setRotationPoint(26F, 3.5F, -2.5F);

		ammoModel[80].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -4.25F, -0.5F, -0.25F, 3.5F, -0.5F, 0F, 3.5F, -0.5F, 0F, -4.25F, -0.5F, -0.25F); // Import Box0
		ammoModel[80].setRotationPoint(28.75F, 7.5F, -2.5F);

		ammoModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		ammoModel[81].setRotationPoint(21.5F, -8F, -2.5F);

		ammoModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.25F); // Import Box0
		ammoModel[82].setRotationPoint(21F, -8F, -2.5F);

		ammoModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, 0F); // Import Box0
		ammoModel[83].setRotationPoint(21.75F, -8F, -2.5F);

		ammoModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F); // Import Box0
		ammoModel[84].setRotationPoint(21F, -7.5F, -2.5F);

		ammoModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F); // Import Box0
		ammoModel[85].setRotationPoint(21.75F, -7.5F, -2.5F);

		ammoModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F); // Import Box0
		ammoModel[86].setRotationPoint(21.75F, -6.5F, -2.5F);

		ammoModel[87].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.5F, 0F, 0F); // Import Box0
		ammoModel[87].setRotationPoint(22F, -4.5F, -2.5F);

		ammoModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -2.25F, 0F, 0F); // Import Box0
		ammoModel[88].setRotationPoint(23.25F, -0.5F, -2.5F);

		ammoModel[89].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -3F, 0F, 0F, 2.25F, 0F, -0.25F, 2.25F, 0F, -0.25F, -3F, 0F, 0F); // Import Box0
		ammoModel[89].setRotationPoint(25.25F, 3.5F, -2.5F);

		ammoModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F); // Import Box0
		ammoModel[90].setRotationPoint(21F, -6.5F, -2.5F);

		ammoModel[91].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.5F, 0F, -0.25F); // Import Box0
		ammoModel[91].setRotationPoint(21.25F, -4.5F, -2.5F);

		ammoModel[92].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -2.25F, 0F, -0.25F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2.25F, 0F, -0.25F); // Import Box0
		ammoModel[92].setRotationPoint(22.5F, -0.5F, -2.5F);

		ammoModel[93].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -3F, 0F, -0.25F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -3F, 0F, -0.25F); // Import Box0
		ammoModel[93].setRotationPoint(24.5F, 3.5F, -2.5F);

		ammoModel[94].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, 0F, -2.75F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, -0.25F, -2.75F, -0.25F, 0F); // Import Box0
		ammoModel[94].setRotationPoint(28.5F, 7.5F, -2.5F);

		ammoModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -0.25F, -2.75F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, -0.25F, 0F, -2.75F, -0.25F, -0.25F); // Import Box0
		ammoModel[95].setRotationPoint(27.75F, 7.5F, -2.5F);

		ammoModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		ammoModel[96].setRotationPoint(30.75F, 10.75F, -2.5F);

		ammoModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F); // Import Box0
		ammoModel[97].setRotationPoint(30.25F, 10.75F, -2.5F);

		ammoModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		ammoModel[98].setRotationPoint(31F, 10.75F, -2.5F);

		ammoModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		ammoModel[99].setRotationPoint(20F, -8F, -2.5F);

		ammoModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.25F); // Import Box0
		ammoModel[100].setRotationPoint(19.5F, -8F, -2.5F);

		ammoModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, 0F); // Import Box0
		ammoModel[101].setRotationPoint(20.25F, -8F, -2.5F);

		ammoModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F); // Import Box0
		ammoModel[102].setRotationPoint(19.5F, -7.5F, -2.5F);

		ammoModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F); // Import Box0
		ammoModel[103].setRotationPoint(20.25F, -7.5F, -2.5F);

		ammoModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F); // Import Box0
		ammoModel[104].setRotationPoint(20.25F, -6.5F, -2.5F);

		ammoModel[105].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.5F, 0F, 0F); // Import Box0
		ammoModel[105].setRotationPoint(20.5F, -4.5F, -2.5F);

		ammoModel[106].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -2.25F, 0F, 0F); // Import Box0
		ammoModel[106].setRotationPoint(21.75F, -0.5F, -2.5F);

		ammoModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F); // Import Box0
		ammoModel[107].setRotationPoint(19.5F, -6.5F, -2.5F);

		ammoModel[108].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.5F, 0F, -0.25F); // Import Box0
		ammoModel[108].setRotationPoint(19.75F, -4.5F, -2.5F);

		ammoModel[109].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -2.25F, 0F, -0.25F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2.25F, 0F, -0.25F); // Import Box0
		ammoModel[109].setRotationPoint(21F, -0.5F, -2.5F);

		ammoModel[110].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -2.75F, 0F, 0F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, -2.75F, 0F, 0F); // Import Box0
		ammoModel[110].setRotationPoint(23.75F, 3.5F, -2.5F);

		ammoModel[111].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -2.75F, 0F, -0.25F, 2F, 0F, 0F, 2F, 0F, 0F, -2.75F, 0F, -0.25F); // Import Box0
		ammoModel[111].setRotationPoint(23F, 3.5F, -2.5F);

		ammoModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, -0.25F, -3F, 0.5F, 0F, 2.25F, 0.5F, 0F, 2.25F, 0.5F, 0F, -3F, 0.5F, -0.25F); // Import Box0
		ammoModel[112].setRotationPoint(26.25F, 7.5F, -2.5F);

		ammoModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, 0F, -3.25F, 0.5F, 0F, 2.5F, 0.5F, 0F, 2.5F, 0.5F, -0.25F, -3.25F, 0.5F, 0F); // Import Box0
		ammoModel[113].setRotationPoint(26.75F, 7.5F, -2.5F);

		ammoModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, 0F, -1.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.25F, -1.25F, 0.5F, 0F); // Import Box0
		ammoModel[114].setRotationPoint(30.25F, 12F, -2.5F);

		ammoModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -0.25F, -1.25F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1.25F, 0.5F, -0.25F); // Import Box0
		ammoModel[115].setRotationPoint(29.5F, 12F, -2.5F);

		ammoModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		ammoModel[116].setRotationPoint(31F, 13F, -2.5F);

		ammoModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F); // Import Box0
		ammoModel[117].setRotationPoint(30.5F, 13F, -2.5F);

		ammoModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		ammoModel[118].setRotationPoint(31.25F, 13F, -2.5F);

		ammoModel[119].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		ammoModel[119].setRotationPoint(17.25F, -11.5F, -2F);

		ammoModel[120].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, -1F, 0F, 0.25F); // Import Box0
		ammoModel[120].setRotationPoint(17.25F, -6.5F, -2F);

		ammoModel[121].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2.5F, 0F, 0.25F, 2.5F, 0F, 0.25F, 2.5F, 0F, 0.25F, -2.5F, 0F, 0.25F); // Import Box0
		ammoModel[121].setRotationPoint(18.25F, -2.5F, -2F);

		ammoModel[122].addShapeBox(0F, 0F, 0F, 3, 5, 4, 0F,0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, -3F, 0F, 0.25F); // Import Box0
		ammoModel[122].setRotationPoint(20.75F, 3.5F, -2F);

		ammoModel[123].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, -3.75F, 0F, 0.25F, 2.75F, 0F, 0.25F, 2.75F, 0F, 0.25F, -3.75F, 0F, 0.25F); // Import Box0
		ammoModel[123].setRotationPoint(23.75F, 8.5F, -2F);

		ammoModel[124].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 2F, 0.25F, 0.05F, -0.25F, 0.25F, 0.05F, -0.25F, 0.25F, 0F, 2F, 0.25F); // Import Box0
		ammoModel[124].setRotationPoint(32.75F, 13.5F, -2F);

		ammoModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F); // Import Box0
		ammoModel[125].setRotationPoint(29.75F, 13.5F, -2F);

		ammoModel[126].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0.1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.1F, 0F, 0.25F, -3F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -3F, -0.25F, 0.25F); // Import Box0
		ammoModel[126].setRotationPoint(29.75F, 14.5F, -2F);

		ammoModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Import Box0
		ammoModel[127].setRotationPoint(29.75F, 14F, -2F);

		ammoModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.1F, -0.25F, 0.25F, -0.9F, -0.25F, 0.25F, -0.9F, -0.25F, 0.25F, -0.1F, -0.25F, 0.25F, -0.4F, -0.5F, 0.25F, -0.3F, -0.5F, 0.25F, -0.3F, -0.5F, 0.25F, -0.4F, -0.5F, 0.25F); // Import Box0
		ammoModel[128].setRotationPoint(29.25F, 14F, -2F);

		ammoModel[129].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -5F, 0F, 0.5F, 3F, -1.25F, 0.5F, 3F, -1.25F, 0.5F, -5F, 0F, 0.5F); // Import Box0
		ammoModel[129].setRotationPoint(28.75F, 13.5F, -1.5F);

		ammoModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		ammoModel[130].setRotationPoint(18.25F, -11.5F, -1.5F);

		ammoModel[131].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0.5F); // Import Box0
		ammoModel[131].setRotationPoint(18.25F, -6.5F, -1.5F);

		ammoModel[132].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F); // Import Box0
		ammoModel[132].setRotationPoint(19.25F, -2.5F, -1.5F);

		ammoModel[133].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -3F, 0F, 0.5F); // Import Box0
		ammoModel[133].setRotationPoint(21.75F, 3.5F, -1.5F);

		ammoModel[134].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, -3.75F, 0F, 0.5F, 2.75F, 0F, 0.5F, 2.75F, 0F, 0.5F, -3.75F, 0F, 0.5F); // Import Box0
		ammoModel[134].setRotationPoint(24.75F, 8.5F, -1.5F);

		ammoModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -3.5F, 0F, -0.25F, -3.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		ammoModel[135].setRotationPoint(33.25F, 15F, -2.5F);

		ammoModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -0.25F, 0F, -0.25F, 2.75F, 0F, -0.25F, 2.75F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -3.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		ammoModel[136].setRotationPoint(33.25F, 15.25F, -2.5F);

		ammoModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -0.25F, -0.25F, -0.25F, 2.75F, -0.25F, -0.25F, 2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.25F, -3.5F, 0F, -0.25F, -3.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		ammoModel[137].setRotationPoint(33.25F, 14.5F, -2.5F);

		ammoModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, 0F); // Import Box0
		ammoModel[138].setRotationPoint(36F, 11.75F, -2.5F);

		ammoModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		ammoModel[139].setRotationPoint(36F, 12F, -2.5F);

		ammoModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F); // Import Box0
		ammoModel[140].setRotationPoint(36F, 11.5F, -2.5F);

		ammoModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F); // Import Box0
		ammoModel[141].setRotationPoint(33F, 14.75F, -2.5F);

		ammoModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F); // Import Box0
		ammoModel[142].setRotationPoint(32.25F, 15F, -2.5F);

		ammoModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F); // Import Box0
		ammoModel[143].setRotationPoint(32.25F, 14.5F, -2.5F);

		ammoModel[144].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		ammoModel[144].setRotationPoint(35.25F, 16.5F, -2.5F);

		ammoModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -0.25F, 0F, -0.5F, 2.75F, 0F, -0.5F, 2.75F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, -0.5F, -3.5F, -0.25F, -0.5F, -3.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		ammoModel[145].setRotationPoint(35.25F, 16.75F, -2.5F);

		ammoModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -0.25F, -0.25F, -0.5F, 2.75F, -0.25F, -0.5F, 2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		ammoModel[146].setRotationPoint(35.25F, 16F, -2.5F);

		ammoModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, 0F); // Import Box0
		ammoModel[147].setRotationPoint(37.75F, 13.25F, -2.5F);

		ammoModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		ammoModel[148].setRotationPoint(37.75F, 13.5F, -2.5F);

		ammoModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F); // Import Box0
		ammoModel[149].setRotationPoint(37.75F, 13F, -2.5F);

		ammoModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F); // Import Box0
		ammoModel[150].setRotationPoint(35F, 16.25F, -2.5F);

		ammoModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F); // Import Box0
		ammoModel[151].setRotationPoint(34.25F, 16.5F, -2.5F);

		ammoModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F); // Import Box0
		ammoModel[152].setRotationPoint(34.25F, 16F, -2.5F);

		ammoModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, -0.25F, 2.25F, 0F, -0.25F, 2.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, 0F, -0.5F, 0F); // Import Box0
		ammoModel[153].setRotationPoint(33F, 17.5F, -2.5F);

		ammoModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.25F, 0F, -0.25F, 2F, 0F, -0.25F, 2F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, -0.25F, -2.75F, -0.25F, -0.25F, -2.75F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		ammoModel[154].setRotationPoint(33F, 17.75F, -2.5F);

		ammoModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.25F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, 0F, -0.5F, 0F); // Import Box0
		ammoModel[155].setRotationPoint(33F, 17F, -2.5F);

		ammoModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F); // Import Box0
		ammoModel[156].setRotationPoint(32.75F, 17.25F, -2.5F);

		ammoModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F); // Import Box0
		ammoModel[157].setRotationPoint(32F, 17.5F, -2.5F);

		ammoModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F); // Import Box0
		ammoModel[158].setRotationPoint(32F, 17F, -2.5F);

		ammoModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, 0F); // Import Box0
		ammoModel[159].setRotationPoint(34.75F, 15F, -2.5F);

		ammoModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		ammoModel[160].setRotationPoint(34.75F, 15.25F, -2.5F);

		ammoModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F); // Import Box0
		ammoModel[161].setRotationPoint(34.75F, 14.75F, -2.5F);

		ammoModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F); // Import Box0
		ammoModel[162].setRotationPoint(31.75F, 15.75F, -2.5F);

		ammoModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		ammoModel[163].setRotationPoint(32.5F, 16F, -2.5F);

		ammoModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F); // Import Box0
		ammoModel[164].setRotationPoint(32.5F, 15.5F, -2.5F);

		ammoModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F); // Import Box0
		ammoModel[165].setRotationPoint(31.75F, 16F, -2.5F);

		ammoModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F); // Import Box0
		ammoModel[166].setRotationPoint(31F, 16.25F, -2.5F);

		ammoModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F); // Import Box0
		ammoModel[167].setRotationPoint(31F, 15.75F, -2.5F);

		ammoModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F); // Import Box0
		ammoModel[168].setRotationPoint(32F, 16F, -2.5F);

		ammoModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		ammoModel[169].setRotationPoint(32F, 16.25F, -2.5F);

		ammoModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F); // Import Box0
		ammoModel[170].setRotationPoint(32F, 15.5F, -2.5F);

		ammoModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F); // Import Box0
		ammoModel[171].setRotationPoint(33.75F, 17.5F, -2.5F);

		ammoModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		ammoModel[172].setRotationPoint(34.5F, 17.75F, -2.5F);

		ammoModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F); // Import Box0
		ammoModel[173].setRotationPoint(34.5F, 17.25F, -2.5F);

		ammoModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.25F); // Import Box0
		ammoModel[174].setRotationPoint(33.75F, 17.75F, -2.5F);

		ammoModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F); // Import Box0
		ammoModel[175].setRotationPoint(33F, 18F, -2.5F);

		ammoModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.25F); // Import Box0
		ammoModel[176].setRotationPoint(33F, 17.5F, -2.5F);

		ammoModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F); // Import Box0
		ammoModel[177].setRotationPoint(34F, 17.75F, -2.5F);

		ammoModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		ammoModel[178].setRotationPoint(34F, 18F, -2.5F);

		ammoModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F); // Import Box0
		ammoModel[179].setRotationPoint(34F, 17.25F, -2.5F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 673, 89, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 713, 89, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Import Box0
		slideModel[3] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		slideModel[4] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		slideModel[5] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box0
		slideModel[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box0
		slideModel[7] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Import Box0
		slideModel[8] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Import Box0
		slideModel[9] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Import Box0
		slideModel[10] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Import Box0
		slideModel[11] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Import Box0
		slideModel[12] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Import Box0
		slideModel[13] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Import Box0
		slideModel[14] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Import Box0
		slideModel[15] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Import Box0

		slideModel[0].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		slideModel[0].setRotationPoint(19F, -17.75F, -2.75F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		slideModel[1].setRotationPoint(19F, -18.75F, -2.75F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		slideModel[2].setRotationPoint(19F, -19.25F, -2.25F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import Box0
		slideModel[3].setRotationPoint(30.5F, -17.75F, -3.75F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box0
		slideModel[4].setRotationPoint(31.5F, -17.75F, -3.25F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box0
		slideModel[5].setRotationPoint(30.5F, -17.75F, -4.25F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.15F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box0
		slideModel[6].setRotationPoint(31.5F, -17.75F, -4.25F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box0
		slideModel[7].setRotationPoint(30.5F, -17.75F, -6.25F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import Box0
		slideModel[8].setRotationPoint(30.75F, -17.75F, -6.25F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.75F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import Box0
		slideModel[9].setRotationPoint(31F, -17.75F, -7.25F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box0
		slideModel[10].setRotationPoint(32.25F, -17.75F, -7.25F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import Box0
		slideModel[11].setRotationPoint(31F, -17.75F, -7.75F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.5F, 0.75F, -0.75F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box0
		slideModel[12].setRotationPoint(32F, -17.75F, -7.75F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 0F, -0.15F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.15F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box0
		slideModel[13].setRotationPoint(31.5F, -17.75F, -3.75F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		slideModel[14].setRotationPoint(32F, -17.75F, -6.25F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import Box0
		slideModel[15].setRotationPoint(30.75F, -17.75F, -5.25F);
	}


	private void initfullammoModel_1()
	{
		fullammoModel[0] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 0
		fullammoModel[1] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 1
		fullammoModel[2] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 8
		fullammoModel[3] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 9
		fullammoModel[4] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 791
		fullammoModel[5] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 792
		fullammoModel[6] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 797
		fullammoModel[7] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 798
		fullammoModel[8] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 799
		fullammoModel[9] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 800
		fullammoModel[10] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 811
		fullammoModel[11] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 812
		fullammoModel[12] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 813
		fullammoModel[13] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 814
		fullammoModel[14] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 819
		fullammoModel[15] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 820

		fullammoModel[0].addShapeBox(-3F, -1F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.08F, -0.61F, 0F, -0.08F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F); // Box 0
		fullammoModel[0].setRotationPoint(21F, -11.5F, 0F);

		fullammoModel[1].addShapeBox(-3F, -1F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.61F, -0.08F, 0F, -0.61F, -0.08F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		fullammoModel[1].setRotationPoint(21F, -11.5F, 0F);

		fullammoModel[2].addShapeBox(-3F, -1F, -1F, 5, 1, 1, 0F,0F, -0.61F, -0.08F, 0F, -0.61F, -0.08F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		fullammoModel[2].setRotationPoint(21F, -11.5F, 0F);

		fullammoModel[3].addShapeBox(-3F, -1F, -1F, 5, 1, 1, 0F,0F, -0.08F, -0.6F, 0F, -0.08F, -0.61F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		fullammoModel[3].setRotationPoint(21F, -11.5F, 0F);

		fullammoModel[4].addShapeBox(-3.5F, -1F, 0F, 6, 1, 1, 0F,0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.66F, -0.13F, 0F, -0.66F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 791
		fullammoModel[4].setRotationPoint(21F, -11.5F, 0F);

		fullammoModel[5].addShapeBox(-3.5F, -1F, 0F, 6, 1, 1, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.13F, -0.66F, 0F, -0.13F, -0.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F); // Box 792
		fullammoModel[5].setRotationPoint(21F, -11.5F, 0F);

		fullammoModel[6].addShapeBox(-3.5F, -1F, -1F, 6, 1, 1, 0F,0F, -0.66F, -0.13F, 0F, -0.66F, -0.13F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 797
		fullammoModel[6].setRotationPoint(21F, -11.5F, 0F);

		fullammoModel[7].addShapeBox(-3.5F, -1F, -1F, 6, 1, 1, 0F,0F, -0.13F, -0.66F, 0F, -0.13F, -0.66F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 798
		fullammoModel[7].setRotationPoint(21F, -11.5F, 0F);

		fullammoModel[8].addShapeBox(-4.5F, -1F, 0F, 1, 1, 1, 0F,-0.5F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.61F, -0.08F, -0.5F, -0.61F, -0.08F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 799
		fullammoModel[8].setRotationPoint(21F, -11.5F, 0F);

		fullammoModel[9].addShapeBox(-4.5F, -1F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.08F, -0.61F, -0.5F, -0.08F, -0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.3F, -0.5F, -0.7F, -0.3F); // Box 800
		fullammoModel[9].setRotationPoint(21F, -11.5F, 0F);

		fullammoModel[10].addShapeBox(-4.5F, -1F, -1F, 1, 1, 1, 0F,-0.5F, -0.61F, -0.08F, 0F, -0.61F, -0.08F, 0F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 811
		fullammoModel[10].setRotationPoint(21F, -11.5F, 0F);

		fullammoModel[11].addShapeBox(-4.5F, -1F, -1F, 1, 1, 1, 0F,-0.5F, -0.08F, -0.6F, 0F, -0.08F, -0.61F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 812
		fullammoModel[11].setRotationPoint(21F, -11.5F, 0F);

		fullammoModel[12].addShapeBox(2.5F, -1F, 0F, 3, 1, 1, 0F,0F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.33F, -0.71F, 0F, -0.13F, -0.66F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F); // Box 813
		fullammoModel[12].setRotationPoint(21F, -11.5F, 0F);

		fullammoModel[13].addShapeBox(2.5F, -1F, 0F, 3, 1, 1, 0F,0F, -0.35F, -0.65F, 0F, -0.5F, -0.5F, 0F, -0.71F, -0.33F, 0F, -0.66F, -0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.05F); // Box 814
		fullammoModel[13].setRotationPoint(21F, -11.5F, 0F);

		fullammoModel[14].addShapeBox(2.5F, -1F, -1F, 3, 1, 1, 0F,0F, -0.66F, -0.13F, 0F, -0.71F, -0.33F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.65F, 0F, 0F, -0.05F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 819
		fullammoModel[14].setRotationPoint(21F, -11.5F, 0F);

		fullammoModel[15].addShapeBox(2.5F, -1F, -1F, 3, 1, 1, 0F,0F, -0.13F, -0.66F, 0F, -0.33F, -0.71F, 0F, -0.3F, 0F, 0F, -0.05F, 0F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 820
		fullammoModel[15].setRotationPoint(21F, -11.5F, 0F);
	}
}