//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AA12
// Model Creator: 
// Created on: 01.08.2018 - 20:17:07
// Last changed on: 01.08.2018 - 20:17:07

package com.modularwarfare.client.model.test; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

//import com.flansmod.client.model.EnumAnimationType;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class aa12 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public aa12() //Same as Filename
	{
		modelScale = 0.12F;
		gunModel = new ModelRendererTurbo[290];
		defaultScopeModel = new ModelRendererTurbo[79];
		ammoModel = new ModelRendererTurbo[19];
		slideModel = new ModelRendererTurbo[29];
		fullammoModel = new ModelRendererTurbo[5];

		initgunModel_1();
		initdefaultScopeModel_1();
		initammoModel_1();
		initslideModel_1();
		initfullammoModel_1();

		translateAll(0F, -1.5F, -0.1F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.06F, 0F);//forward/up/?

		gunSlideDistance = 2F;
		//animationType = EnumAnimationType.CUSTOM;

		rotateGunVertical = 35F;
		rotateGunHorizontal = 1F;
		tiltGun = 25F;
		tiltGunTime = 0.15F;
		unloadClipTime = 0.35F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.15F;
		translateGun = new Vector3f(3 /16F, 1F /16F, 1F /16F);
		rotateClipVertical = -90F;
		rotateClipHorizontal = 1F;
		tiltClip = 0F;
		translateClip = new Vector3f(-0 /16F, -20F /16F, 01F /16F);

		barrelAttachPoint = new Vector3f (143F /16F, 26F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(-5F /16F, 45F /16F, 0.05F /16F);
		
		hasFlash = false;
        hasArms = true;
        
        leftArmPos = new Vector3f(0.05F, -0.28F, 0.09F);
        leftArmRot = new Vector3f(60.0F, 45.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.14F, -0.55F, 0.2F);
        leftArmReloadRot = new Vector3f(60.0F, 55.0F, -0.0F);
        leftArmChargePos = new Vector3f(0.15F, 0.43F, 0.14F);
        leftArmChargeRot = new Vector3f(60.0F, 45.0F, 0.0F);
        
	    chargeHandleDistance = 1.6F;
	    chargeDelay = 0;
	    chargeDelayAfterReload = 85;
	    chargeTime = 8;
	    
	    leftHandCharge = true;
	    chargeModifier = new Vector3f (8.0F, 8.0F, 20.0F);
 
        rightArmPos = new Vector3f(0.30F, -0.55F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.35F, -0.565F, 0.05F);
        rightArmReloadRot = new Vector3f(-0.0F, 0.0F, -90.0F);
        
        rightArmScale = new Vector3f(0.8F, 0.8F, 0.8F);
        leftArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
 
        rightHandAmmo = false;
        leftHandAmmo = true;
        
		//RecoilSlideDistance = 0.1F;
		//RotateSlideDistance = -0.5F;
		
		casingAnimDistance = new Vector3f(0, 1, 12);
	    casingAnimSpread = new Vector3f(2, 2, 0);
	    casingAnimTime = 6;  
	    casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);
	    
		crouchZoom = -0.15F;
		fancyStance = true;
		stanceRotate = new Vector3f(40.0F, -0.0F, 10.0F);
		stanceTranslate = new Vector3f(0.5F, 0.0F, 0.0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox0
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportBox0
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import ImportBox0
		gunModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import ImportBox0
		gunModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import ImportBox0
		gunModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import ImportBox0
		gunModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import ImportBox0
		gunModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportBox0
		gunModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportBox0
		gunModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import ImportBox0
		gunModel[11] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import ImportBox0
		gunModel[12] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import ImportBox0
		gunModel[13] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import ImportBox0
		gunModel[14] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import ImportBox0
		gunModel[15] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import ImportBox0
		gunModel[16] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import ImportBox0
		gunModel[17] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import ImportBox0
		gunModel[18] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import ImportBox0
		gunModel[19] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import ImportBox0
		gunModel[20] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import ImportBox0
		gunModel[21] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import ImportBox0
		gunModel[22] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import ImportBox0
		gunModel[23] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import ImportBox0
		gunModel[24] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import ImportBox0
		gunModel[25] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import ImportBox0
		gunModel[26] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import ImportBox0
		gunModel[27] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import ImportBox0
		gunModel[28] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import ImportBox0
		gunModel[29] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Import ImportBox0
		gunModel[30] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import ImportBox0
		gunModel[31] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import ImportBox0
		gunModel[32] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import ImportBox0
		gunModel[33] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Import ImportBox0
		gunModel[34] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import ImportBox0
		gunModel[35] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import ImportBox0
		gunModel[36] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import ImportBox0
		gunModel[37] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import ImportBox0
		gunModel[38] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox0
		gunModel[39] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import ImportBox0
		gunModel[40] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import ImportBox0
		gunModel[41] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import ImportBox0
		gunModel[42] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import ImportBox0
		gunModel[43] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import ImportBox0
		gunModel[44] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import ImportBox0
		gunModel[45] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import ImportBox0
		gunModel[46] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import ImportBox0
		gunModel[47] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import ImportBox0
		gunModel[48] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import ImportBox0
		gunModel[49] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Import ImportBox0
		gunModel[50] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import ImportBox0
		gunModel[51] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import ImportBox0
		gunModel[52] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import ImportBox0
		gunModel[53] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import ImportBox0
		gunModel[54] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import ImportBox0
		gunModel[55] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import ImportBox0
		gunModel[56] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Import ImportBox0
		gunModel[57] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import ImportBox0
		gunModel[58] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Import ImportBox0
		gunModel[59] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Import ImportBox0
		gunModel[60] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Import ImportBox0
		gunModel[61] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Import ImportBox0
		gunModel[62] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Import ImportBox0
		gunModel[63] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Import ImportBox0
		gunModel[64] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Import ImportBox0
		gunModel[65] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Import ImportBox0
		gunModel[66] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Import ImportBox0
		gunModel[67] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Import ImportBox0
		gunModel[68] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Import ImportBox0
		gunModel[69] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Import ImportBox0
		gunModel[70] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Import ImportBox0
		gunModel[71] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Import ImportBox0
		gunModel[72] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Import ImportBox0
		gunModel[73] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Import ImportBox0
		gunModel[74] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportBox0
		gunModel[75] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Import ImportBox0
		gunModel[76] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Import ImportBox0
		gunModel[77] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import ImportBox0
		gunModel[78] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Import ImportBox0
		gunModel[79] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Import ImportBox0
		gunModel[80] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Import ImportBox0
		gunModel[81] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Import ImportBox0
		gunModel[82] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Import ImportBox0
		gunModel[83] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Import ImportBox0
		gunModel[84] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportBox0
		gunModel[85] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Import ImportBox0
		gunModel[86] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Import ImportBox0
		gunModel[87] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Import ImportBox0
		gunModel[88] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Import ImportBox0
		gunModel[89] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Import ImportBox0
		gunModel[90] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Import ImportBox0
		gunModel[91] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Import ImportBox0
		gunModel[92] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Import ImportBox103
		gunModel[93] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Import ImportBox0
		gunModel[94] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Import ImportBox105
		gunModel[95] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Import ImportBox0
		gunModel[96] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Import ImportBox0
		gunModel[97] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Import ImportBox0
		gunModel[98] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Import ImportBox0
		gunModel[99] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Import ImportBox0
		gunModel[100] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Import ImportBox0
		gunModel[101] = new ModelRendererTurbo(this, 625, 73, textureX, textureY); // Import ImportBox0
		gunModel[102] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Import ImportBox0
		gunModel[103] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Import ImportBox0
		gunModel[104] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Import ImportBox0
		gunModel[105] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import ImportBox0
		gunModel[106] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Import ImportBox0
		gunModel[107] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Import ImportBox0
		gunModel[108] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Import ImportBox0
		gunModel[109] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import ImportBox0
		gunModel[110] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Import ImportBox0
		gunModel[111] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Import ImportBox0
		gunModel[112] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Import ImportBox0
		gunModel[113] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Import ImportBox0
		gunModel[114] = new ModelRendererTurbo(this, 777, 81, textureX, textureY); // Import ImportBox0
		gunModel[115] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Import ImportBox0
		gunModel[116] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Import ImportBox0
		gunModel[117] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportBox0
		gunModel[118] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Import ImportBox0
		gunModel[119] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Import ImportBox0
		gunModel[120] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Import ImportBox0
		gunModel[121] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Import ImportBox0
		gunModel[122] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Import ImportBox0
		gunModel[123] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import ImportBox0
		gunModel[124] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Import ImportBox0
		gunModel[125] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Import ImportBox0
		gunModel[126] = new ModelRendererTurbo(this, 537, 89, textureX, textureY); // Import ImportBox0
		gunModel[127] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Import ImportBox148
		gunModel[128] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Import ImportBox0
		gunModel[129] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Import ImportBox148
		gunModel[130] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Import ImportBox0
		gunModel[131] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Import ImportBox152
		gunModel[132] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Import ImportBox0
		gunModel[133] = new ModelRendererTurbo(this, 737, 97, textureX, textureY); // Import ImportBox152
		gunModel[134] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Import ImportBox0
		gunModel[135] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import ImportBox0
		gunModel[136] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import ImportBox0
		gunModel[137] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import ImportBox0
		gunModel[138] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import ImportBox0
		gunModel[139] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import ImportBox0
		gunModel[140] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import ImportBox0
		gunModel[141] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import ImportBox0
		gunModel[142] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Import ImportBox0
		gunModel[143] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Import ImportBox0
		gunModel[144] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Import ImportBox0
		gunModel[145] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Import ImportBox0
		gunModel[146] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Import ImportBox0
		gunModel[147] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Import ImportBox0
		gunModel[148] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import ImportBox0
		gunModel[149] = new ModelRendererTurbo(this, 721, 97, textureX, textureY); // Import ImportBox0
		gunModel[150] = new ModelRendererTurbo(this, 937, 49, textureX, textureY); // Import ImportBox0
		gunModel[151] = new ModelRendererTurbo(this, 809, 97, textureX, textureY); // Import ImportBox0
		gunModel[152] = new ModelRendererTurbo(this, 897, 97, textureX, textureY); // Import ImportBox0
		gunModel[153] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Import ImportBox0
		gunModel[154] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import ImportBox0
		gunModel[155] = new ModelRendererTurbo(this, 929, 97, textureX, textureY); // Import ImportBox0
		gunModel[156] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Import ImportBox0
		gunModel[157] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Import ImportBox0
		gunModel[158] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Import ImportBox0
		gunModel[159] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Import ImportBox0
		gunModel[160] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		gunModel[161] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import ImportBox0
		gunModel[162] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import ImportBox0
		gunModel[163] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Import ImportBox0
		gunModel[164] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Import ImportBox0
		gunModel[165] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Import ImportBox0
		gunModel[166] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Import ImportBox0
		gunModel[167] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Import ImportBox0
		gunModel[168] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Import ImportBox0
		gunModel[169] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Import ImportBox0
		gunModel[170] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Import ImportBox0
		gunModel[171] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Import ImportBox0
		gunModel[172] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Import ImportBox0
		gunModel[173] = new ModelRendererTurbo(this, 1001, 65, textureX, textureY); // Import ImportBox0
		gunModel[174] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Import ImportBox0
		gunModel[175] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // Import ImportBox0
		gunModel[176] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Import ImportBox0
		gunModel[177] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Import ImportBox0
		gunModel[178] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Import ImportBox0
		gunModel[179] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import ImportBox0
		gunModel[180] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportBox0
		gunModel[181] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import ImportBox0
		gunModel[182] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Import ImportBox0
		gunModel[183] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import ImportBox0
		gunModel[184] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import ImportBox0
		gunModel[185] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import ImportBox0
		gunModel[186] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import ImportBox0
		gunModel[187] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import ImportBox0
		gunModel[188] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Import ImportBox0
		gunModel[189] = new ModelRendererTurbo(this, 513, 105, textureX, textureY); // Import ImportBox0
		gunModel[190] = new ModelRendererTurbo(this, 577, 105, textureX, textureY); // Import ImportBox0
		gunModel[191] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import ImportBox0
		gunModel[192] = new ModelRendererTurbo(this, 721, 113, textureX, textureY); // Import ImportBox0
		gunModel[193] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import ImportBox0
		gunModel[194] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import ImportBox0
		gunModel[195] = new ModelRendererTurbo(this, 841, 105, textureX, textureY); // Import ImportBox0
		gunModel[196] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Import ImportBox0
		gunModel[197] = new ModelRendererTurbo(this, 585, 137, textureX, textureY); // Import ImportBox0
		gunModel[198] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Import ImportBox0
		gunModel[199] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Import ImportBox0
		gunModel[200] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Import ImportBox0
		gunModel[201] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Import ImportBox0
		gunModel[202] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Import ImportBox0
		gunModel[203] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Import ImportBox0
		gunModel[204] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Import ImportBox0
		gunModel[205] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Import ImportBox0
		gunModel[206] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Import ImportBox0
		gunModel[207] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import ImportBox0
		gunModel[208] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import ImportBox0
		gunModel[209] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Import ImportBox0
		gunModel[210] = new ModelRendererTurbo(this, 729, 33, textureX, textureY); // Import ImportBox0
		gunModel[211] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Import ImportBox0
		gunModel[212] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Import ImportBox0
		gunModel[213] = new ModelRendererTurbo(this, 729, 129, textureX, textureY); // Import ImportBox0
		gunModel[214] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Import ImportBox0
		gunModel[215] = new ModelRendererTurbo(this, 585, 145, textureX, textureY); // Import ImportBox0
		gunModel[216] = new ModelRendererTurbo(this, 857, 145, textureX, textureY); // Import ImportBox0
		gunModel[217] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Import ImportBox0
		gunModel[218] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Import ImportBox0
		gunModel[219] = new ModelRendererTurbo(this, 681, 121, textureX, textureY); // Import ImportBox0
		gunModel[220] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Import ImportBox0
		gunModel[221] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Import ImportBox0
		gunModel[222] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Import ImportBox0
		gunModel[223] = new ModelRendererTurbo(this, 633, 129, textureX, textureY); // Import ImportBox0
		gunModel[224] = new ModelRendererTurbo(this, 537, 137, textureX, textureY); // Import ImportBox0
		gunModel[225] = new ModelRendererTurbo(this, 993, 137, textureX, textureY); // Import ImportBox0
		gunModel[226] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Import ImportBox0
		gunModel[227] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Import ImportBox0
		gunModel[228] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Import ImportBox0
		gunModel[229] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Import ImportBox0
		gunModel[230] = new ModelRendererTurbo(this, 825, 121, textureX, textureY); // Import ImportBox0
		gunModel[231] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import ImportBox0
		gunModel[232] = new ModelRendererTurbo(this, 729, 137, textureX, textureY); // Import ImportBox0
		gunModel[233] = new ModelRendererTurbo(this, 617, 145, textureX, textureY); // Import ImportBox0
		gunModel[234] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import ImportBox0
		gunModel[235] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Import ImportBox0
		gunModel[236] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Import ImportBox0
		gunModel[237] = new ModelRendererTurbo(this, 753, 153, textureX, textureY); // Import ImportBox0
		gunModel[238] = new ModelRendererTurbo(this, 785, 153, textureX, textureY); // Import ImportBox0
		gunModel[239] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import ImportBox0
		gunModel[240] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Import ImportBox0
		gunModel[241] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportBox0
		gunModel[242] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Import ImportBox0
		gunModel[243] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Import ImportBox0
		gunModel[244] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Import ImportBox0
		gunModel[245] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import ImportBox0
		gunModel[246] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import ImportBox0
		gunModel[247] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import ImportBox0
		gunModel[248] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import ImportBox0
		gunModel[249] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import ImportBox0
		gunModel[250] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 449
		gunModel[251] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 450
		gunModel[252] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 451
		gunModel[253] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Box 452
		gunModel[254] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 453
		gunModel[255] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 454
		gunModel[256] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 455
		gunModel[257] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 456
		gunModel[258] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 457
		gunModel[259] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 458
		gunModel[260] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 459
		gunModel[261] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 460
		gunModel[262] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Box 461
		gunModel[263] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 462
		gunModel[264] = new ModelRendererTurbo(this, 953, 113, textureX, textureY); // Box 463
		gunModel[265] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 464
		gunModel[266] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 465
		gunModel[267] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 466
		gunModel[268] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 467
		gunModel[269] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 468
		gunModel[270] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 469
		gunModel[271] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Box 470
		gunModel[272] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 471
		gunModel[273] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 472
		gunModel[274] = new ModelRendererTurbo(this, 905, 129, textureX, textureY); // Box 473
		gunModel[275] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 474
		gunModel[276] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 475
		gunModel[277] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 476
		gunModel[278] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 477
		gunModel[279] = new ModelRendererTurbo(this, 633, 145, textureX, textureY); // Box 478
		gunModel[280] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 481
		gunModel[281] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 482
		gunModel[282] = new ModelRendererTurbo(this, 657, 113, textureX, textureY); // Box 483
		gunModel[283] = new ModelRendererTurbo(this, 841, 113, textureX, textureY); // Box 484
		gunModel[284] = new ModelRendererTurbo(this, 657, 113, textureX, textureY); // Box 485
		gunModel[285] = new ModelRendererTurbo(this, 841, 113, textureX, textureY); // Box 486
		gunModel[286] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 487
		gunModel[287] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 488
		gunModel[288] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 489
		gunModel[289] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 490

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportBox0
		gunModel[0].setRotationPoint(-7.5F, -11.5F, -4.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1.5F, 0F, -1.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -1.5F); // Import ImportBox0
		gunModel[1].setRotationPoint(-7.5F, -8.5F, -4.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0.25F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 2.5F, 0F, -1.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, -1.5F); // Import ImportBox0
		gunModel[2].setRotationPoint(-8.75F, -5.5F, -4.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1.5F, 1.75F, 0F, -1.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, -1.5F); // Import ImportBox0
		gunModel[3].setRotationPoint(-11.5F, -2.5F, -4.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,-0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1.5F, 2F, 0F, -1.5F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1.5F); // Import ImportBox0
		gunModel[4].setRotationPoint(-13.5F, 0.5F, -4.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1.5F); // Import ImportBox0
		gunModel[5].setRotationPoint(-15.5F, 5.5F, -4.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportBox0
		gunModel[6].setRotationPoint(-16.5F, 9.5F, -4.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, -1.5F); // Import ImportBox0
		gunModel[7].setRotationPoint(-16.5F, 12.5F, -4.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[8].setRotationPoint(-6.5F, -11.5F, -5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -0.5F); // Import ImportBox0
		gunModel[9].setRotationPoint(-6.5F, -8.5F, -5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, -0.5F); // Import ImportBox0
		gunModel[10].setRotationPoint(-7.75F, -5.5F, -5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 1.75F, 0F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, -0.5F); // Import ImportBox0
		gunModel[11].setRotationPoint(-10.5F, -2.5F, -5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F,-0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -0.5F); // Import ImportBox0
		gunModel[12].setRotationPoint(-12.5F, 0.5F, -5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F); // Import ImportBox0
		gunModel[13].setRotationPoint(-14.5F, 5.5F, -5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[14].setRotationPoint(-15.5F, 9.5F, -5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, -0.5F); // Import ImportBox0
		gunModel[15].setRotationPoint(-15.5F, 12.5F, -5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 7, 3, 10, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[16].setRotationPoint(-5.5F, -11.5F, -5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 10, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F); // Import ImportBox0
		gunModel[17].setRotationPoint(-5.5F, -8.5F, -5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F,0.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0.25F, 0F, 0F, 2.5F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 2.5F, 0F, 0F); // Import ImportBox0
		gunModel[18].setRotationPoint(-6.75F, -5.5F, -5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 3, 10, 0F,-0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, 1.75F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.75F, 0F, 0F); // Import ImportBox0
		gunModel[19].setRotationPoint(-9.5F, -2.5F, -5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 4, 5, 10, 0F,-0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F); // Import ImportBox0
		gunModel[20].setRotationPoint(-11.5F, 0.5F, -5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox0
		gunModel[21].setRotationPoint(-13.5F, 5.5F, -5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[22].setRotationPoint(-14.5F, 9.5F, -5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 7, 2, 10, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Import ImportBox0
		gunModel[23].setRotationPoint(-14.5F, 12.5F, -5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[24].setRotationPoint(-5.5F, 12.5F, -4.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[25].setRotationPoint(-6.5F, 12.5F, -5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[26].setRotationPoint(-5.5F, 9.5F, -4.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[27].setRotationPoint(-6.5F, 9.5F, -5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 12, 9, 0F,-5F, -0.5F, 0F, 5F, -0.5F, -1.5F, 5F, -0.5F, -1.5F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[28].setRotationPoint(-5F, -2.5F, -4.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,-5F, -0.5F, 0F, 5F, -0.5F, -0.5F, 5F, -0.5F, -0.5F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[29].setRotationPoint(-6F, -2.5F, -5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-1F, 0F, 0F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[30].setRotationPoint(0F, -3F, -4.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[31].setRotationPoint(-1F, -3F, -5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportBox0
		gunModel[32].setRotationPoint(2F, -4F, -4.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[33].setRotationPoint(1F, -4F, -4.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[34].setRotationPoint(0F, -4F, -5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,0F, -0.5F, 0F, 5F, -0.5F, 0F, 5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[35].setRotationPoint(-7F, -2.5F, -5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[36].setRotationPoint(-7.5F, 9.5F, -5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[37].setRotationPoint(-2F, -3F, -5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[38].setRotationPoint(-1F, -4F, -5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, 0F, 5F, -0.5F, 0F, 5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[39].setRotationPoint(-7F, -3F, -5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[40].setRotationPoint(4F, -5F, -4.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 1F, 0F, -1.5F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, -1.5F); // Import ImportBox0
		gunModel[41].setRotationPoint(4F, -4F, -4.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, -1.5F, 1F, -0.5F, -1.5F, -1F, -0.5F, 0F); // Import ImportBox0
		gunModel[42].setRotationPoint(-5.5F, 14.5F, -4.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F); // Import ImportBox0
		gunModel[43].setRotationPoint(-4.5F, 16F, -4.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.5F, 0F, 0F); // Import ImportBox0
		gunModel[44].setRotationPoint(-4.5F, 16.5F, -4.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import ImportBox0
		gunModel[45].setRotationPoint(-5.5F, 16.5F, -5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F); // Import ImportBox0
		gunModel[46].setRotationPoint(-13F, 16.5F, -5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -2F, 0F, -1F); // Import ImportBox0
		gunModel[47].setRotationPoint(-15F, 14.5F, -4.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -1.5F); // Import ImportBox0
		gunModel[48].setRotationPoint(-14F, 14.5F, -5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F); // Import ImportBox0
		gunModel[49].setRotationPoint(-13F, 15.5F, -5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.1F, -0.5F, 0F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, -1.1F, -0.5F, 0F); // Import ImportBox0
		gunModel[50].setRotationPoint(-6.5F, 14.5F, -5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.1F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F); // Import ImportBox0
		gunModel[51].setRotationPoint(-5.5F, 16F, -5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[52].setRotationPoint(4F, -7F, -4.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[53].setRotationPoint(3F, -9F, -4.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-0.75F, 0F, 0F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[54].setRotationPoint(3F, -11F, -4.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-1F, 0F, 0F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, -1F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, 0.25F, 0F, 0F); // Import ImportBox0
		gunModel[55].setRotationPoint(4F, -12F, -4.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[56].setRotationPoint(3F, -5F, -5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[57].setRotationPoint(3F, -7F, -5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[58].setRotationPoint(2F, -9F, -5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[59].setRotationPoint(2F, -11F, -5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F); // Import ImportBox0
		gunModel[60].setRotationPoint(3F, -12F, -5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[61].setRotationPoint(-1F, -5F, -5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[62].setRotationPoint(-1F, -7F, -5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[63].setRotationPoint(-1F, -9F, -5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[64].setRotationPoint(1F, -11F, -5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[65].setRotationPoint(2F, -12F, -5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 26, 1, 11, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[66].setRotationPoint(-5.5F, -13F, -5.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Import ImportBox0
		gunModel[67].setRotationPoint(-6.5F, -13F, -5.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.5F, 0F, -2F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2.5F); // Import ImportBox0
		gunModel[68].setRotationPoint(-7.5F, -13F, -5.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F,2.75F, 0F, -2F, -2.75F, 0F, -0.5F, -2.75F, 0F, -0.5F, 2.75F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Import ImportBox0
		gunModel[69].setRotationPoint(-8F, -16F, -5.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F,2.75F, 0F, -0.5F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 2.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[70].setRotationPoint(-7F, -16F, -5.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportBox0
		gunModel[71].setRotationPoint(-16.75F, -18.5F, -5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, -1.5F); // Import ImportBox0
		gunModel[72].setRotationPoint(-13.75F, -18.5F, -5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[73].setRotationPoint(-16.75F, -19.5F, -5.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[74].setRotationPoint(-13.75F, -19.5F, -5.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportBox0
		gunModel[75].setRotationPoint(-10.75F, -17F, -5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 1F, -0.5F, -1F, 1F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[76].setRotationPoint(-10.75F, -18F, -5.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 59, 1, 10, 0F,0F, -13.5F, -1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -13.5F, -1.5F, 0F, 13.5F, -3F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 13.5F, -3F); // Import ImportBox0
		gunModel[77].setRotationPoint(-76.25F, -18.5F, -5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 59, 1, 11, 0F,0F, -13.5F, -1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -13.5F, -1.5F, 0F, 13.5F, -2F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 13.5F, -2F); // Import ImportBox0
		gunModel[78].setRotationPoint(-76.25F, -19.5F, -5.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 59, 8, 11, 0F,0F, -13.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -13.5F, 0F, 0F, 13.5F, -1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 13.5F, -1.5F); // Import ImportBox0
		gunModel[79].setRotationPoint(-76.25F, -27.5F, -5.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 80, 2, 11, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[80].setRotationPoint(-76.25F, -37F, -5.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 84, 1, 9, 0F,-1.25F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1.25F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox0
		gunModel[81].setRotationPoint(-76.25F, -38F, -4.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[82].setRotationPoint(1F, -5F, -5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[83].setRotationPoint(2F, -5F, -5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 59, 21, 11, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -13.5F, 0F, 0.5F, -13.5F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[84].setRotationPoint(-76.25F, -35F, -5.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 53, 2, 11, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[85].setRotationPoint(54.75F, -37F, -5.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 53, 1, 9, 0F,0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[86].setRotationPoint(54.75F, -38F, -4.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 69, 9, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 3F, 0F); // Import ImportBox0
		gunModel[87].setRotationPoint(38.75F, -35F, -5.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 69, 1, 8, 0F,0F, 0F, 0.5F, -0.5F, 3.25F, 0F, -0.5F, 3.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -1F, -3.25F, -1.5F, -1F, -3.25F, -1.5F, 0F, 0F, -1F); // Import ImportBox0
		gunModel[88].setRotationPoint(38.75F, -18F, -4F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 69, 2, 10, 0F,0F, 0F, 0.5F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, -3.25F, -1F, -0.5F, -3.25F, -1F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[89].setRotationPoint(38.75F, -20F, -5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 69, 3, 11, 0F,0F, 0F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, -0.5F, 0F, -3.25F, -0.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[90].setRotationPoint(38.75F, -23F, -5.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 51, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[91].setRotationPoint(3.75F, -37F, 2.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 51, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox103
		gunModel[92].setRotationPoint(3.75F, -37F, -5.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 47, 1, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox0
		gunModel[93].setRotationPoint(7.75F, -38F, -4.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 47, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox105
		gunModel[94].setRotationPoint(7.75F, -38F, 1.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 55, 12, 8, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox0
		gunModel[95].setRotationPoint(-16.25F, -35F, -2.5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 26, 3, 11, 0F,3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox0
		gunModel[96].setRotationPoint(-5.5F, -16F, -5.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 28, 2, 11, 0F,3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Import ImportBox0
		gunModel[97].setRotationPoint(-7.5F, -18F, -5.5F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 30, 1, 11, 0F,4.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 4.25F, 0.5F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Import ImportBox0
		gunModel[98].setRotationPoint(-9.5F, -19F, -5.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 37, 3, 11, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import ImportBox0
		gunModel[99].setRotationPoint(-16.5F, -23F, -5.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 18, 3, 11, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0.5F, 0F); // Import ImportBox0
		gunModel[100].setRotationPoint(20.75F, -23F, -5.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 47, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[101].setRotationPoint(7.75F, -37.5F, -2.5F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 47, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[102].setRotationPoint(7.75F, -37.75F, -1.5F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 43, 7, 12, 0F,0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // Import ImportBox0
		gunModel[103].setRotationPoint(52.5F, -32F, -6F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 44, 1, 12, 0F,-1F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -1F, 0.5F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F); // Import ImportBox0
		gunModel[104].setRotationPoint(52F, -33F, -6F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 44, 2, 12, 0F,-0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -1F, 0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -1F, 0.5F, -0.25F); // Import ImportBox0
		gunModel[105].setRotationPoint(52F, -25F, -6F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 9, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox0
		gunModel[106].setRotationPoint(107.75F, -35F, -5.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[107].setRotationPoint(107.75F, -26.25F, -5.5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 7, 12, 0F,0F, 0F, -0.1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.1F); // Import ImportBox0
		gunModel[108].setRotationPoint(96F, -32F, -6F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 7, 12, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.5F); // Import ImportBox0
		gunModel[109].setRotationPoint(51.5F, -32F, -6F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.5F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.1F, 0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.5F); // Import ImportBox0
		gunModel[110].setRotationPoint(51.5F, -25F, -6F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.5F, 0.5F, -0.5F); // Import ImportBox0
		gunModel[111].setRotationPoint(51.5F, -33.5F, -6F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0.5F, 0F, -0.1F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.1F); // Import ImportBox0
		gunModel[112].setRotationPoint(96F, -33F, -6F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, -0.1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.1F, 0.75F, 0F, -0.1F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.75F, 0.75F, 0F, -0.5F); // Import ImportBox0
		gunModel[113].setRotationPoint(96F, -25F, -6F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[114].setRotationPoint(107.75F, -37F, -5.5F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,1F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 1F, 0F, -1.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox0
		gunModel[115].setRotationPoint(107.75F, -38F, -4.5F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import ImportBox0
		gunModel[116].setRotationPoint(107.75F, -23.25F, -4.5F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F); // Import ImportBox0
		gunModel[117].setRotationPoint(107.25F, -21.25F, -3.5F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[118].setRotationPoint(108.75F, -26.25F, -5.5F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 1, 9, 11, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Import ImportBox0
		gunModel[119].setRotationPoint(108.75F, -35F, -5.5F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0.5F, 0F, -1F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[120].setRotationPoint(108.75F, -37F, -5.5F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,1F, 0F, -1.5F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, 1F, 0F, -1.5F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F); // Import ImportBox0
		gunModel[121].setRotationPoint(108.75F, -38F, -4.5F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.5F, 0F, -0.5F); // Import ImportBox0
		gunModel[122].setRotationPoint(108.75F, -23.25F, -4.5F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -1F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0.5F, 0F, -1F); // Import ImportBox0
		gunModel[123].setRotationPoint(108.25F, -21.25F, -3.5F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 38, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[124].setRotationPoint(105.75F, -26F, -3F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 38, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[125].setRotationPoint(105.75F, -26F, 2F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[126].setRotationPoint(105.75F, -24F, 2F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox148
		gunModel[127].setRotationPoint(105.75F, -24F, -3F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[128].setRotationPoint(105.75F, -27F, 2F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox148
		gunModel[129].setRotationPoint(105.75F, -27F, -3F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 38, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[130].setRotationPoint(105.75F, -23F, -2F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 38, 1, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox152
		gunModel[131].setRotationPoint(105.75F, -23F, 0F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 38, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportBox0
		gunModel[132].setRotationPoint(105.75F, -28F, -2F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 38, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportBox152
		gunModel[133].setRotationPoint(105.75F, -28F, 0F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 38, 1, 2, 0F,0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportBox0
		gunModel[134].setRotationPoint(105.75F, -23F, -1F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 38, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F); // Import ImportBox0
		gunModel[135].setRotationPoint(105.75F, -28F, -1F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, -0.25F, -1.5F, -1.5F, -0.25F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.5F, -1.5F, -0.25F, -1.5F, -1.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[136].setRotationPoint(110F, -34.5F, -1.5F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, -0.25F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Import ImportBox0
		gunModel[137].setRotationPoint(109.75F, -35F, -1.5F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Import ImportBox0
		gunModel[138].setRotationPoint(109.25F, -35.5F, -1.5F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import ImportBox0
		gunModel[139].setRotationPoint(109.25F, -35.75F, -1.5F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Import ImportBox0
		gunModel[140].setRotationPoint(109.25F, -31.5F, -1.5F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportBox0
		gunModel[141].setRotationPoint(109.25F, -31.25F, -1.5F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Import ImportBox0
		gunModel[142].setRotationPoint(20.5F, -13F, -5.5F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 1, 6, 11, 0F,0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[143].setRotationPoint(20.5F, -19F, -5.5F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0.25F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F); // Import ImportBox0
		gunModel[144].setRotationPoint(20.5F, -19.25F, -5.5F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 1, 21, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[145].setRotationPoint(-77.25F, -35F, -5.5F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportBox0
		gunModel[146].setRotationPoint(-77.25F, -14F, -5.5F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Import ImportBox0
		gunModel[147].setRotationPoint(-77.25F, -6F, -4F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -1.5F); // Import ImportBox0
		gunModel[148].setRotationPoint(-77.25F, -5F, -3.5F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[149].setRotationPoint(-77.25F, -37F, -5.5F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-1.25F, 0F, -1.5F, 1.25F, 0F, -1.5F, 1.25F, 0F, -1.5F, -1.25F, 0F, -1.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox0
		gunModel[150].setRotationPoint(-77.25F, -38F, -4.5F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 1, 21, 11, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox0
		gunModel[151].setRotationPoint(-78.25F, -35F, -5.5F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2.5F); // Import ImportBox0
		gunModel[152].setRotationPoint(-78.25F, -14F, -5.5F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -1.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -1.5F); // Import ImportBox0
		gunModel[153].setRotationPoint(-78.25F, -6F, -4F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1F, -1F, -0.5F, -2.5F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, -1F, -0.5F, -2.5F); // Import ImportBox0
		gunModel[154].setRotationPoint(-78.25F, -5F, -3.5F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.5F, 0F, -2F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox0
		gunModel[155].setRotationPoint(-78.25F, -37F, -5.5F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.75F, -0.5F, -2.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, -0.75F, -0.5F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox0
		gunModel[156].setRotationPoint(-77.75F, -38F, -4.5F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 15, 1, 7, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[157].setRotationPoint(6F, -4F, -3.5F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox0
		gunModel[158].setRotationPoint(4F, -4F, -3.5F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 1, 32, 7, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[159].setRotationPoint(21F, -12F, -3.5F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[160].setRotationPoint(10.25F, -3F, -3.5F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Import ImportBox0
		gunModel[161].setRotationPoint(10.25F, -1F, -3.5F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F); // Import ImportBox0
		gunModel[162].setRotationPoint(10.25F, -0.75F, -3.5F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -1F, 0F, -2.25F, -1F, 0F, -2.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[163].setRotationPoint(-3.5F, 17F, -3.5F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 9, 1, 7, 0F,0F, 0F, -1F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[164].setRotationPoint(10.5F, 19.25F, -3.5F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.75F, 0F); // Import ImportBox0
		gunModel[165].setRotationPoint(-3.5F, 18F, -3.5F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -4.75F, 2.25F, 0F, -4.75F, 2.25F, 0F, 0F, -0.75F, 0F); // Import ImportBox0
		gunModel[166].setRotationPoint(-3.5F, 19.75F, -3.5F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		gunModel[167].setRotationPoint(-6.5F, 18F, -3.5F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[168].setRotationPoint(-6.5F, 17F, -3.5F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[169].setRotationPoint(-10.5F, 16F, -3.5F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1.5F, 0F); // Import ImportBox0
		gunModel[170].setRotationPoint(-13.5F, 15F, -3.5F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 9, 1, 7, 0F,0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 2F, 0F); // Import ImportBox0
		gunModel[171].setRotationPoint(10.5F, 20.25F, -3.5F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -0.25F, 1.75F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.25F, 1.75F, 0F); // Import ImportBox0
		gunModel[172].setRotationPoint(5.5F, 20.25F, -3.5F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[173].setRotationPoint(19.5F, 20.5F, -3.5F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[174].setRotationPoint(20.5F, 20.5F, -3.5F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[175].setRotationPoint(19.5F, 21.5F, -3.5F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[176].setRotationPoint(20.5F, 21.5F, -3.5F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[177].setRotationPoint(22F, 20F, -3.5F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[178].setRotationPoint(22F, 21F, -3.5F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[179].setRotationPoint(-76.25F, -26.5F, 4.75F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Import ImportBox0
		gunModel[180].setRotationPoint(-77.25F, -26.5F, 4.75F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[181].setRotationPoint(-72.25F, -26.5F, 4.75F);

		gunModel[182].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,-2.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox0
		gunModel[182].setRotationPoint(-76F, -39F, -1.5F);

		gunModel[183].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-2.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox0
		gunModel[183].setRotationPoint(-74F, -40.5F, -1.5F);

		gunModel[184].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2.5F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, -0.75F, -0.5F, 0F, -0.75F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -0.75F); // Import ImportBox0
		gunModel[184].setRotationPoint(-76.5F, -39F, -1.5F);

		gunModel[185].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0.5F, 0F, -1.5F, 0.5F, -0.75F, -1.5F, 0.5F, -0.75F, -1F, 0.5F, 0F, -1F, 0F, 0F, -1.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[185].setRotationPoint(-71.5F, -39F, -1.5F);

		gunModel[186].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-2.5F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, -0.75F); // Import ImportBox0
		gunModel[186].setRotationPoint(-74.5F, -40.5F, -1.5F);

		gunModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.5F, 0F, -2.5F, 0.5F, -0.75F, -2.5F, 0.5F, -0.75F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1.5F, -0.5F, -0.75F, -1.5F, -0.5F, -0.75F, -1F, -0.5F, 0F); // Import ImportBox0
		gunModel[187].setRotationPoint(-71.5F, -40F, -1.5F);

		gunModel[188].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Import ImportBox0
		gunModel[188].setRotationPoint(105.5F, -29.5F, -6F);

		gunModel[189].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, -0.35F); // Import ImportBox0
		gunModel[189].setRotationPoint(105.5F, -28.5F, -6F);

		gunModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-1F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, -0.35F, -1F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Import ImportBox0
		gunModel[190].setRotationPoint(105.5F, -30.5F, -6F);

		gunModel[191].addShapeBox(0F, 0F, 0F, 24, 1, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox0
		gunModel[191].setRotationPoint(-16.25F, -42F, -2.5F);

		gunModel[192].addShapeBox(0F, 0F, 0F, 24, 1, 5, 0F,0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox0
		gunModel[192].setRotationPoint(-16.25F, -43F, -2.5F);

		gunModel[193].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import ImportBox0
		gunModel[193].setRotationPoint(-16.25F, -41F, -2.5F);

		gunModel[194].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import ImportBox0
		gunModel[194].setRotationPoint(5.75F, -41F, -2.5F);

		gunModel[195].addShapeBox(0F, 0F, 0F, 24, 1, 2, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import ImportBox0
		gunModel[195].setRotationPoint(-16F, -35F, 4.5F);

		gunModel[196].addShapeBox(0F, 0F, 0F, 24, 3, 4, 0F,0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportBox0
		gunModel[196].setRotationPoint(-16F, -38F, 2.5F);

		gunModel[197].addShapeBox(0F, 0F, 0F, 24, 1, 2, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F); // Import ImportBox0
		gunModel[197].setRotationPoint(-16F, -29F, 4.5F);

		gunModel[198].addShapeBox(0F, 0F, 0F, 24, 1, 2, 0F,0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportBox0
		gunModel[198].setRotationPoint(-16F, -30F, 4.5F);

		gunModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportBox0
		gunModel[199].setRotationPoint(-16F, -32.5F, 4.5F);

		gunModel[200].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[200].setRotationPoint(0.25F, -32.5F, 4.5F);

		gunModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[201].setRotationPoint(-5.75F, -32.5F, 4.5F);

		gunModel[202].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[202].setRotationPoint(-6.75F, -33.5F, 4.5F);

		gunModel[203].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[203].setRotationPoint(-11.75F, -32.5F, 4.5F);

		gunModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox0
		gunModel[204].setRotationPoint(-16.75F, -33.5F, 4.5F);

		gunModel[205].addShapeBox(0F, 0F, 0F, 20, 1, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F); // Import ImportBox0
		gunModel[205].setRotationPoint(-14.25F, -41F, -2.5F);

		gunModel[206].addShapeBox(0F, 0F, 0F, 20, 1, 7, 0F,0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, -0.5F, 0.65F, 0F, -0.5F, 0.65F, 0F, -0.5F, 0.65F, 0F, -0.5F, 0.65F); // Import ImportBox0
		gunModel[206].setRotationPoint(-14.25F, -38.5F, -3.5F);

		gunModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.5F, 0.4F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F, 0F, -0.5F, 0.4F); // Import ImportBox0
		gunModel[207].setRotationPoint(-15.25F, -40.5F, -2.5F);

		gunModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F, 0F, -0.5F, 0.85F); // Import ImportBox0
		gunModel[208].setRotationPoint(-15.25F, -39F, -3F);

		gunModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F); // Import ImportBox0
		gunModel[209].setRotationPoint(-7.25F, -40.5F, -2.5F);

		gunModel[210].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F); // Import ImportBox0
		gunModel[210].setRotationPoint(-13.25F, -39F, -3F);

		gunModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -1F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, -1F, -0.5F, 0.4F); // Import ImportBox0
		gunModel[211].setRotationPoint(4.75F, -40.5F, -2.5F);

		gunModel[212].addShapeBox(0F, 0F, 0F, 20, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[212].setRotationPoint(82.75F, -30F, -7F);

		gunModel[213].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Import ImportBox0
		gunModel[213].setRotationPoint(82.75F, -30F, -8.5F);

		gunModel[214].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F,0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[214].setRotationPoint(82.75F, -30F, -8F);

		gunModel[215].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Import ImportBox0
		gunModel[215].setRotationPoint(82.75F, -30F, -8F);

		gunModel[216].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[216].setRotationPoint(-16.25F, -38F, -4.5F);

		gunModel[217].addShapeBox(0F, 0F, 0F, 5, 6, 12, 0F,0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F); // Import ImportBox0
		gunModel[217].setRotationPoint(-3F, -20F, -6F);

		gunModel[218].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F,0F, -0.75F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.75F, -0.35F, 0F, -0.75F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.75F, -0.35F); // Import ImportBox0
		gunModel[218].setRotationPoint(-4F, -20F, -6F);

		gunModel[219].addShapeBox(0F, 0F, 0F, 2, 6, 12, 0F,0F, -0.25F, -0.35F, 0F, -1F, -0.35F, 0F, -1F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -1F, -0.35F, 0F, -1F, -0.35F, 0F, -0.25F, -0.35F); // Import ImportBox0
		gunModel[219].setRotationPoint(2F, -20F, -6F);

		gunModel[220].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F,0F, -1F, -0.35F, 0F, -2.25F, -0.35F, 0F, -2.25F, -0.35F, 0F, -1F, -0.35F, 0F, -1F, -0.35F, 0F, -2.25F, -0.35F, 0F, -2.25F, -0.35F, 0F, -1F, -0.35F); // Import ImportBox0
		gunModel[220].setRotationPoint(4F, -20F, -6F);

		gunModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox0
		gunModel[221].setRotationPoint(-0.5F, -18F, -6.5F);

		gunModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Import ImportBox0
		gunModel[222].setRotationPoint(-0.5F, -17.5F, -6.5F);

		gunModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,-0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox0
		gunModel[223].setRotationPoint(-0.5F, -18.5F, -6.5F);

		gunModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,-0.25F, -1.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 1.5F, 0F); // Import ImportBox0
		gunModel[224].setRotationPoint(-3F, -18F, -6.5F);

		gunModel[225].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,-1.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, 0F, 0F); // Import ImportBox0
		gunModel[225].setRotationPoint(-1.5F, -17.5F, -6.5F);

		gunModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F); // Import ImportBox0
		gunModel[226].setRotationPoint(-3.5F, -16.5F, -6.5F);

		gunModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F); // Import ImportBox0
		gunModel[227].setRotationPoint(44.75F, -30F, -6F);

		gunModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F); // Import ImportBox0
		gunModel[228].setRotationPoint(44.75F, -28.25F, -6F);

		gunModel[229].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Import ImportBox0
		gunModel[229].setRotationPoint(43.25F, -30.25F, -6F);

		gunModel[230].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, -1.5F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.5F, -0.25F); // Import ImportBox0
		gunModel[230].setRotationPoint(42.5F, -30.25F, -6F);

		gunModel[231].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0.5F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F); // Import ImportBox0
		gunModel[231].setRotationPoint(48.75F, -30F, -6F);

		gunModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0.5F, -0.5F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F); // Import ImportBox0
		gunModel[232].setRotationPoint(47.25F, -30F, -6F);

		gunModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0.25F, -0.25F); // Import ImportBox0
		gunModel[233].setRotationPoint(47.25F, -28.25F, -6F);

		gunModel[234].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, -0.75F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.25F, -0.25F); // Import ImportBox0
		gunModel[234].setRotationPoint(49.5F, -30F, -6F);

		gunModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.75F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -1F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -1F, -1F, -0.25F); // Import ImportBox0
		gunModel[235].setRotationPoint(47.25F, -28.5F, -6F);

		gunModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -1F, -1F, -0.25F, -0.75F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F); // Import ImportBox0
		gunModel[236].setRotationPoint(47.25F, -29F, -6F);

		gunModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, 0F, -1F, -0.25F); // Import ImportBox0
		gunModel[237].setRotationPoint(44.25F, -28.5F, -6F);

		gunModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, -1F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Import ImportBox0
		gunModel[238].setRotationPoint(44.25F, -29F, -6F);

		gunModel[239].addShapeBox(0F, 0F, 0F, 28, 12, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox0
		gunModel[239].setRotationPoint(-16.25F, -35F, -5.5F);

		gunModel[240].addShapeBox(0F, 0F, 0F, 27, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[240].setRotationPoint(11.75F, -35F, -5.5F);

		gunModel[241].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportBox0
		gunModel[241].setRotationPoint(37.75F, -30F, -5.5F);

		gunModel[242].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[242].setRotationPoint(106.75F, -26F, -2.5F);

		gunModel[243].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F); // Import ImportBox0
		gunModel[243].setRotationPoint(106.75F, -24F, -2.5F);

		gunModel[244].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[244].setRotationPoint(106.75F, -28F, -2.5F);

		gunModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[245].setRotationPoint(7.25F, -9.5F, -1.25F);

		gunModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[246].setRotationPoint(7.25F, -11.5F, -1.25F);

		gunModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		gunModel[247].setRotationPoint(7.25F, -7.5F, -1.25F);

		gunModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox0
		gunModel[248].setRotationPoint(8.25F, -5.5F, -1.25F);

		gunModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		gunModel[249].setRotationPoint(7.25F, -12F, -1.25F);

		gunModel[250].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 449
		gunModel[250].setRotationPoint(-12.75F, -33.5F, 4.5F);

		gunModel[251].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 450
		gunModel[251].setRotationPoint(-0.75F, -33.5F, 4.5F);

		gunModel[252].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		gunModel[252].setRotationPoint(-0.75F, -31.5F, 4.5F);

		gunModel[253].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		gunModel[253].setRotationPoint(-12.75F, -31.5F, 4.5F);

		gunModel[254].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 453
		gunModel[254].setRotationPoint(-16.75F, -31.5F, 4.5F);

		gunModel[255].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 454
		gunModel[255].setRotationPoint(5.25F, -31.5F, 4.5F);

		gunModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 455
		gunModel[256].setRotationPoint(6.5F, -32.5F, 4.5F);

		gunModel[257].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 456
		gunModel[257].setRotationPoint(5.25F, -33.5F, 4.5F);

		gunModel[258].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F); // Box 457
		gunModel[258].setRotationPoint(-4.25F, -39F, -3F);

		gunModel[259].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F); // Box 458
		gunModel[259].setRotationPoint(-10.25F, -39F, -3F);

		gunModel[260].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F); // Box 459
		gunModel[260].setRotationPoint(1.75F, -39F, -3F);

		gunModel[261].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F); // Box 460
		gunModel[261].setRotationPoint(-1.25F, -39F, -3F);

		gunModel[262].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F); // Box 461
		gunModel[262].setRotationPoint(-7.25F, -39F, -3F);

		gunModel[263].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F); // Box 462
		gunModel[263].setRotationPoint(-10.25F, -40.5F, -2.5F);

		gunModel[264].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F); // Box 463
		gunModel[264].setRotationPoint(-1.25F, -40.5F, -2.5F);

		gunModel[265].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F); // Box 464
		gunModel[265].setRotationPoint(-4.25F, -40.5F, -2.5F);

		gunModel[266].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F); // Box 465
		gunModel[266].setRotationPoint(1.75F, -40.5F, -2.5F);

		gunModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, -0.5F, 0.85F, 0F, -0.5F, 0.85F, 0F, -0.5F, 0.85F, -0.5F, -0.5F, 0.85F); // Box 466
		gunModel[267].setRotationPoint(4.75F, -39F, -3F);

		gunModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		gunModel[268].setRotationPoint(-9.25F, -41F, -3.5F);

		gunModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		gunModel[269].setRotationPoint(-6.25F, -41F, -3.5F);

		gunModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		gunModel[270].setRotationPoint(-3.25F, -41F, -3.5F);

		gunModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		gunModel[271].setRotationPoint(-0.25F, -41F, -3.5F);

		gunModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		gunModel[272].setRotationPoint(2.75F, -41F, -3.5F);

		gunModel[273].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F, -1F, -0.5F, 0.4F); // Box 472
		gunModel[273].setRotationPoint(-13.25F, -40.5F, -2.5F);

		gunModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		gunModel[274].setRotationPoint(-12.25F, -41F, -3.5F);

		gunModel[275].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		gunModel[275].setRotationPoint(-6.75F, -31.5F, 4.5F);

		gunModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F); // Box 475
		gunModel[276].setRotationPoint(-16.25F, -43.5F, -2.5F);

		gunModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 476
		gunModel[277].setRotationPoint(-16.25F, -43F, -3.5F);

		gunModel[278].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F); // Box 477
		gunModel[278].setRotationPoint(-13.25F, -43.5F, -2.5F);

		gunModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 478
		gunModel[279].setRotationPoint(-13.25F, -43F, -3.5F);

		gunModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F); // Box 481
		gunModel[280].setRotationPoint(-9.25F, -43.5F, -2.5F);

		gunModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 482
		gunModel[281].setRotationPoint(-9.25F, -43F, -3.5F);

		gunModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F); // Box 483
		gunModel[282].setRotationPoint(-5.25F, -43.5F, -2.5F);

		gunModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 484
		gunModel[283].setRotationPoint(-5.25F, -43F, -3.5F);

		gunModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F); // Box 485
		gunModel[284].setRotationPoint(-1.25F, -43.5F, -2.5F);

		gunModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 486
		gunModel[285].setRotationPoint(-1.25F, -43F, -3.5F);

		gunModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F); // Box 487
		gunModel[286].setRotationPoint(1.75F, -43.5F, -2.5F);

		gunModel[287].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 488
		gunModel[287].setRotationPoint(1.75F, -43F, -3.5F);

		gunModel[288].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F); // Box 489
		gunModel[288].setRotationPoint(5.75F, -43.5F, -2.5F);

		gunModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 490
		gunModel[289].setRotationPoint(5.75F, -43F, -3.5F);
	}

	private void initdefaultScopeModel_1()
	{
		defaultScopeModel[0] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Import ImportBox0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Import ImportBox0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 521, 73, textureX, textureY); // Import ImportBox0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Import ImportBox0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Import ImportBox0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Import ImportBox0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Import ImportBox0
		defaultScopeModel[8] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[9] = new ModelRendererTurbo(this, 601, 105, textureX, textureY); // Import ImportBox0
		defaultScopeModel[10] = new ModelRendererTurbo(this, 665, 105, textureX, textureY); // Import ImportBox0
		defaultScopeModel[11] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[12] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[13] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[14] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[15] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[16] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[17] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[18] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Import ImportBox0
		defaultScopeModel[19] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Import ImportBox0
		defaultScopeModel[20] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[21] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[22] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Import ImportBox0
		defaultScopeModel[23] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[24] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[25] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[26] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[27] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Import ImportBox0
		defaultScopeModel[28] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[29] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[30] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Import ImportBox668
		defaultScopeModel[31] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Import ImportBox669
		defaultScopeModel[32] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Import ImportBox668
		defaultScopeModel[33] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import ImportBox671
		defaultScopeModel[34] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Import ImportBox672
		defaultScopeModel[35] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import ImportBox673
		defaultScopeModel[36] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import ImportBox674
		defaultScopeModel[37] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Import ImportBox671
		defaultScopeModel[38] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import ImportBox671
		defaultScopeModel[39] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import ImportBox671
		defaultScopeModel[40] = new ModelRendererTurbo(this, 673, 9, textureX, textureY); // Import ImportBox672
		defaultScopeModel[41] = new ModelRendererTurbo(this, 697, 9, textureX, textureY); // Import ImportBox672
		defaultScopeModel[42] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import ImportBox672
		defaultScopeModel[43] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import ImportBox672
		defaultScopeModel[44] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import ImportBox672
		defaultScopeModel[45] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import ImportBox672
		defaultScopeModel[46] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Import ImportBox672
		defaultScopeModel[47] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import ImportBox672
		defaultScopeModel[48] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import ImportBox672
		defaultScopeModel[49] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import ImportBox672
		defaultScopeModel[50] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import ImportBox672
		defaultScopeModel[51] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import ImportBox672
		defaultScopeModel[52] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import ImportBox672
		defaultScopeModel[53] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import ImportBox672
		defaultScopeModel[54] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import ImportBox672
		defaultScopeModel[55] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[56] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Import ImportBox0
		defaultScopeModel[57] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Import ImportBox0
		defaultScopeModel[58] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[59] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[60] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[61] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import ImportBox0
		defaultScopeModel[62] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[63] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[64] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[65] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[66] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[67] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[68] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Import ImportBox0
		defaultScopeModel[69] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[70] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[71] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[72] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[73] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import ImportBox255
		defaultScopeModel[74] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[75] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import ImportBox257
		defaultScopeModel[76] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import ImportBox0
		defaultScopeModel[77] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Import ImportBox257
		defaultScopeModel[78] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import ImportBox0

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		defaultScopeModel[0].setRotationPoint(-6F, -45.5F, -4F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		defaultScopeModel[1].setRotationPoint(-6F, -46F, -4F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import ImportBox0
		defaultScopeModel[2].setRotationPoint(-6F, -46.5F, -4F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox0
		defaultScopeModel[3].setRotationPoint(-6F, -47F, -4F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox0
		defaultScopeModel[4].setRotationPoint(-5.5F, -47.5F, -4F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		defaultScopeModel[5].setRotationPoint(-6F, -46F, 2F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import ImportBox0
		defaultScopeModel[6].setRotationPoint(-6F, -46.5F, 2F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox0
		defaultScopeModel[7].setRotationPoint(-6F, -47F, 2F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox0
		defaultScopeModel[8].setRotationPoint(-5.5F, -47.5F, 2F);

		defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox0
		defaultScopeModel[9].setRotationPoint(-6F, -45.5F, 2F);

		defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		defaultScopeModel[10].setRotationPoint(-6F, -44.5F, -2F);

		defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		defaultScopeModel[11].setRotationPoint(-2F, -45.5F, -2F);

		defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		defaultScopeModel[12].setRotationPoint(-2F, -46F, -2F);

		defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		defaultScopeModel[13].setRotationPoint(-2F, -46.5F, -2F);

		defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		defaultScopeModel[14].setRotationPoint(-2F, -47F, -2F);

		defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox0
		defaultScopeModel[15].setRotationPoint(-0.25F, -44.75F, 3.25F);

		defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox0
		defaultScopeModel[16].setRotationPoint(-0.25F, -44.25F, 3.25F);

		defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Import ImportBox0
		defaultScopeModel[17].setRotationPoint(-0.25F, -43.75F, 3.25F);

		defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		defaultScopeModel[18].setRotationPoint(-6F, -42.5F, -4F);

		defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox0
		defaultScopeModel[19].setRotationPoint(-6F, -42.5F, 2F);

		defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportBox0
		defaultScopeModel[20].setRotationPoint(-4.5F, -48.5F, -1.5F);

		defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox0
		defaultScopeModel[21].setRotationPoint(-4.5F, -45.5F, -1.5F);

		defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import ImportBox0
		defaultScopeModel[22].setRotationPoint(-4.25F, -45.85F, -2.75F);

		defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1.5F, 0F, 0.25F, 1.25F, 0F, 0.25F, 1.25F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, -0.4F, 1F, 0F, -0.4F); // Import ImportBox0
		defaultScopeModel[23].setRotationPoint(-5F, -50F, 2.5F);

		defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1.5F, 0.5F, 0.25F, 1.25F, 0.5F, 0.25F, 1.25F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0F, 0.25F, 1.25F, 0F, 0.25F, 1.25F, 0F, 0F, 1.5F, 0F, 0F); // Import ImportBox0
		defaultScopeModel[24].setRotationPoint(-5F, -51F, 2.5F);

		defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.75F, 0.5F, 0.25F, 0.75F, 0.5F, 0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 1.5F, -0.5F, 0.25F, 1.25F, -0.5F, 0.25F, 1.25F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Import ImportBox0
		defaultScopeModel[25].setRotationPoint(-5F, -52F, 2.5F);

		defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F); // Import ImportBox0
		defaultScopeModel[26].setRotationPoint(-5F, -53F, 2.5F);

		defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,1F, -0.5F, 0.1F, 0.75F, -0.5F, 0.1F, 0.75F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Import ImportBox0
		defaultScopeModel[27].setRotationPoint(-5F, -49.5F, -3F);

		defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F); // Import ImportBox0
		defaultScopeModel[28].setRotationPoint(-5.5F, -48.5F, 1F);

		defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -1F, -1.25F, -0.25F, -1F, -1.25F); // Import ImportBox0
		defaultScopeModel[29].setRotationPoint(-5.5F, -48.5F, 2F);

		defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Import ImportBox668
		defaultScopeModel[30].setRotationPoint(-5.5F, -48.5F, -3F);

		defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -1F, -1.25F, -0.25F, -1F, -1.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F); // Import ImportBox669
		defaultScopeModel[31].setRotationPoint(-5.5F, -48.5F, -4F);

		defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Import ImportBox668
		defaultScopeModel[32].setRotationPoint(-5.5F, -48.5F, -2F);

		defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0.25F, 1.5F, 0F, 0.25F, 1F, 0F, -0.4F, 0.75F, 0F, -0.4F, 0.75F, 0F, 0.25F, 1F, 0F, 0.25F); // Import ImportBox671
		defaultScopeModel[33].setRotationPoint(-5F, -50F, -3.5F);

		defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1.5F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0.25F, 1.5F, 0F, 0.25F); // Import ImportBox672
		defaultScopeModel[34].setRotationPoint(-5F, -51F, -3.5F);

		defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 0.25F, 0.75F, 0.5F, 0.25F, 1.5F, -0.5F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F); // Import ImportBox673
		defaultScopeModel[35].setRotationPoint(-5F, -52F, -3.5F);

		defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F); // Import ImportBox674
		defaultScopeModel[36].setRotationPoint(-5F, -53F, -3.5F);

		defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0.37F, -0.25F, 0.25F, 0.12F, -0.25F, 0.25F, 0.12F, -0.25F, 0.25F, 0.37F, -0.25F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportBox671
		defaultScopeModel[37].setRotationPoint(-6F, -50F, -2F);

		defaultScopeModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.5F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.37F, -0.25F, -0.75F, 0.12F, -0.25F, -0.75F, 0.12F, -0.25F, 0F, 0.37F, -0.25F, 0F); // Import ImportBox671
		defaultScopeModel[38].setRotationPoint(-6F, -50.5F, 1.25F);

		defaultScopeModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.37F, -0.25F, 0F, 0.12F, -0.25F, 0F, 0.12F, -0.25F, -0.75F, 0.37F, -0.25F, -0.75F); // Import ImportBox671
		defaultScopeModel[39].setRotationPoint(-6F, -50.5F, -2.25F);

		defaultScopeModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Import ImportBox672
		defaultScopeModel[40].setRotationPoint(-4.5F, -50.5F, -2.5F);

		defaultScopeModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox672
		defaultScopeModel[41].setRotationPoint(-4.5F, -51.25F, -2.5F);

		defaultScopeModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import ImportBox672
		defaultScopeModel[42].setRotationPoint(-4.5F, -50.75F, -2.5F);

		defaultScopeModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F); // Import ImportBox672
		defaultScopeModel[43].setRotationPoint(-4.1F, -51.75F, -1F);

		defaultScopeModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F); // Import ImportBox672
		defaultScopeModel[44].setRotationPoint(-4.6F, -50.75F, -1F);

		defaultScopeModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F); // Import ImportBox672
		defaultScopeModel[45].setRotationPoint(-5.1F, -50.75F, -1F);

		defaultScopeModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox672
		defaultScopeModel[46].setRotationPoint(-4.1F, -53.5F, -1F);

		defaultScopeModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Import ImportBox672
		defaultScopeModel[47].setRotationPoint(-4.1F, -52.5F, -1F);

		defaultScopeModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Import ImportBox672
		defaultScopeModel[48].setRotationPoint(-4.1F, -52.5F, 0.5F);

		defaultScopeModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox672
		defaultScopeModel[49].setRotationPoint(-4.1F, -52.5F, -0.5F);

		defaultScopeModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Import ImportBox672
		defaultScopeModel[50].setRotationPoint(-4.1F, -52.5F, -0.5F);

		defaultScopeModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Import ImportBox672
		defaultScopeModel[51].setRotationPoint(-4.1F, -52.5F, -0.5F);

		defaultScopeModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F); // Import ImportBox672
		defaultScopeModel[52].setRotationPoint(-4.1F, -52.5F, -0.5F);

		defaultScopeModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F); // Import ImportBox672
		defaultScopeModel[53].setRotationPoint(-3.6F, -50.75F, -1F);

		defaultScopeModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.25F, -0.1F, 0F); // Import ImportBox672
		defaultScopeModel[54].setRotationPoint(-3.1F, -50.75F, -1F);

		defaultScopeModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import ImportBox0
		defaultScopeModel[55].setRotationPoint(101.75F, -39.5F, -2F);

		defaultScopeModel[56].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F,-2.5F, -0.5F, -0.5F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import ImportBox0
		defaultScopeModel[56].setRotationPoint(101.75F, -50.5F, -2F);

		defaultScopeModel[57].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import ImportBox0
		defaultScopeModel[57].setRotationPoint(107.75F, -50.5F, -2F);

		defaultScopeModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.5F, 0F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import ImportBox0
		defaultScopeModel[58].setRotationPoint(107.75F, -51F, -2F);

		defaultScopeModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, -0.75F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import ImportBox0
		defaultScopeModel[59].setRotationPoint(104.25F, -51F, -2F);

		defaultScopeModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		defaultScopeModel[60].setRotationPoint(105.25F, -51F, -2F);

		defaultScopeModel[61].addShapeBox(0F, 0F, 0F, 2, 11, 3, 0F,-2.5F, -0.5F, 0.25F, 2.25F, -0.5F, 0.25F, 2.25F, -0.5F, 0.25F, -2.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 2.25F, 0F, 0.25F, 2.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportBox0
		defaultScopeModel[61].setRotationPoint(102.75F, -50.5F, -1.5F);

		defaultScopeModel[62].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportBox0
		defaultScopeModel[62].setRotationPoint(102.75F, -39.5F, -1.5F);

		defaultScopeModel[63].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Import ImportBox0
		defaultScopeModel[63].setRotationPoint(106.75F, -44.5F, -1.5F);

		defaultScopeModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Import ImportBox0
		defaultScopeModel[64].setRotationPoint(106.75F, -50.5F, -1.5F);

		defaultScopeModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0.25F, -1F, -0.75F, 0.25F, -1F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportBox0
		defaultScopeModel[65].setRotationPoint(107F, -45.5F, -1.5F);

		defaultScopeModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -1F, -0.75F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F); // Import ImportBox0
		defaultScopeModel[66].setRotationPoint(106.75F, -45.5F, -1.5F);

		defaultScopeModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, -1F, -0.75F, 0.25F, -1F, -0.75F, 0.25F, 0F, -0.75F, 0.25F); // Import ImportBox0
		defaultScopeModel[67].setRotationPoint(107F, -48.5F, -1.5F);

		defaultScopeModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -1F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -1F, -0.75F, 0.25F); // Import ImportBox0
		defaultScopeModel[68].setRotationPoint(106.75F, -48.5F, -1.5F);

		defaultScopeModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import ImportBox0
		defaultScopeModel[69].setRotationPoint(106.25F, -52.5F, -0.5F);

		defaultScopeModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import ImportBox0
		defaultScopeModel[70].setRotationPoint(106.25F, -52.25F, -0.5F);

		defaultScopeModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import ImportBox0
		defaultScopeModel[71].setRotationPoint(106.25F, -53F, -0.5F);

		defaultScopeModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import ImportBox0
		defaultScopeModel[72].setRotationPoint(106.25F, -52.5F, 0F);

		defaultScopeModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import ImportBox255
		defaultScopeModel[73].setRotationPoint(106.25F, -52.5F, -1F);

		defaultScopeModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F); // Import ImportBox0
		defaultScopeModel[74].setRotationPoint(106.25F, -52F, 0F);

		defaultScopeModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Import ImportBox257
		defaultScopeModel[75].setRotationPoint(106.25F, -52F, -1F);

		defaultScopeModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import ImportBox0
		defaultScopeModel[76].setRotationPoint(106.25F, -53F, 0F);

		defaultScopeModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import ImportBox257
		defaultScopeModel[77].setRotationPoint(106.25F, -53F, -1F);

		defaultScopeModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import ImportBox0
		defaultScopeModel[78].setRotationPoint(106.25F, -51.75F, -0.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Import ImportBox0
		ammoModel[1] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Import ImportBox0
		ammoModel[2] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Import ImportBox0
		ammoModel[3] = new ModelRendererTurbo(this, 745, 105, textureX, textureY); // Import ImportBox0
		ammoModel[4] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import ImportBox0
		ammoModel[5] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Import ImportBox0
		ammoModel[6] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Import ImportBox0
		ammoModel[7] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Import ImportBox0
		ammoModel[8] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Import ImportBox0
		ammoModel[9] = new ModelRendererTurbo(this, 593, 113, textureX, textureY); // Import ImportBox0
		ammoModel[10] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Import ImportBox0
		ammoModel[11] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Import ImportBox0
		ammoModel[12] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Import ImportBox0
		ammoModel[13] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Import ImportBox0
		ammoModel[14] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Import ImportBox0
		ammoModel[15] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Import ImportBox0
		ammoModel[16] = new ModelRendererTurbo(this, 681, 121, textureX, textureY); // Import ImportBox0
		ammoModel[17] = new ModelRendererTurbo(this, 817, 137, textureX, textureY); // Import ImportBox0
		ammoModel[18] = new ModelRendererTurbo(this, 857, 129, textureX, textureY); // Import ImportBox0

		ammoModel[0].addShapeBox(0F, 0F, 0F, 13, 1, 20, 0F,0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0F, -4F, -0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Import ImportBox0
		ammoModel[0].setRotationPoint(25F, -20F, -10F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 13, 14, 42, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.75F, 0F, 0F); // Import ImportBox0
		ammoModel[1].setRotationPoint(26.5F, -6F, -21F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 13, 6, 42, 0F,0F, 0F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, -3F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F); // Import ImportBox0
		ammoModel[2].setRotationPoint(26F, -12F, -21F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 13, 5, 36, 0F,-0.5F, 0F, -4F, 0.5F, 0.5F, -4F, 0.5F, 0.5F, -4F, -0.5F, 0F, -4F, -1F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F); // Import ImportBox0
		ammoModel[3].setRotationPoint(25F, -17F, -18F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 13, 2, 28, 0F,-0.25F, 0F, -4F, 0.25F, 0.5F, -4F, 0.25F, 0.5F, -4F, -0.25F, 0F, -4F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F); // Import ImportBox0
		ammoModel[4].setRotationPoint(25F, -19F, -14F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 13, 1, 20, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, -4F); // Import ImportBox0
		ammoModel[5].setRotationPoint(28.25F, 21F, -10F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 13, 6, 42, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, 0.5F, -0.5F, -3F, 0.5F, -0.5F, -3F, -0.5F, 0F, -3F); // Import ImportBox0
		ammoModel[6].setRotationPoint(27.25F, 8F, -21F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 13, 5, 36, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, -4F, 0.25F, -0.5F, -4F, 0.25F, -0.5F, -4F, -0.25F, 0F, -4F); // Import ImportBox0
		ammoModel[7].setRotationPoint(27.75F, 14F, -18F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 13, 2, 28, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, -4F, 0.25F, -0.5F, -4F, 0.25F, -0.5F, -4F, -0.25F, 0F, -4F); // Import ImportBox0
		ammoModel[8].setRotationPoint(28F, 19F, -14F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 20, 0F,0F, 0.25F, -3.5F, 0F, 0.25F, -3.5F, 0F, 0.25F, -3.5F, 0F, 0.25F, -3.5F, -0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F); // Import ImportBox0
		ammoModel[9].setRotationPoint(21F, -20F, -10F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 4, 14, 42, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F); // Import ImportBox0
		ammoModel[10].setRotationPoint(22.5F, -6F, -21F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 4, 6, 42, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Import ImportBox0
		ammoModel[11].setRotationPoint(22F, -12F, -21F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 4, 5, 36, 0F,-0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0.5F); // Import ImportBox0
		ammoModel[12].setRotationPoint(21F, -17F, -18F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 28, 0F,-0.25F, 0F, -3.5F, 0.25F, 0F, -3.5F, 0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Import ImportBox0
		ammoModel[13].setRotationPoint(21F, -19F, -14F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 20, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, -3.5F, 0F, 0.25F, -3.5F, 0F, 0.25F, -3.5F, 0F, 0.25F, -3.5F); // Import ImportBox0
		ammoModel[14].setRotationPoint(24.25F, 21F, -10F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 4, 6, 42, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F); // Import ImportBox0
		ammoModel[15].setRotationPoint(23.25F, 8F, -21F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 4, 5, 36, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -3.5F, 0.25F, 0F, -3.5F, 0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F); // Import ImportBox0
		ammoModel[16].setRotationPoint(23.75F, 14F, -18F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 28, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -3.5F, 0.25F, 0F, -3.5F, 0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F); // Import ImportBox0
		ammoModel[17].setRotationPoint(24F, 19F, -14F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 17, 2, 10, 0F,-0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F); // Import ImportBox0
		ammoModel[18].setRotationPoint(21F, -22F, -5F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import ImportBox0
		slideModel[1] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import ImportBox0
		slideModel[2] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import ImportBox0
		slideModel[3] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import ImportBox0
		slideModel[4] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import ImportBox0
		slideModel[5] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import ImportBox0
		slideModel[6] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import ImportBox0
		slideModel[7] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import ImportBox0
		slideModel[8] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import ImportBox0
		slideModel[9] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import ImportBox0
		slideModel[10] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Import ImportBox0
		slideModel[11] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import ImportBox0
		slideModel[12] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import ImportBox0
		slideModel[13] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import ImportBox0
		slideModel[14] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import ImportBox0
		slideModel[15] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Import ImportBox0
		slideModel[16] = new ModelRendererTurbo(this, 585, 121, textureX, textureY); // Import ImportBox0
		slideModel[17] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Import ImportBox0
		slideModel[18] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Import ImportBox0
		slideModel[19] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Import ImportBox0
		slideModel[20] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Import ImportBox0
		slideModel[21] = new ModelRendererTurbo(this, 713, 113, textureX, textureY); // Import ImportBox0
		slideModel[22] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Import ImportBox0
		slideModel[23] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Import ImportBox0
		slideModel[24] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Import ImportBox0
		slideModel[25] = new ModelRendererTurbo(this, 953, 145, textureX, textureY); // Import ImportBox0
		slideModel[26] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Import ImportBox0
		slideModel[27] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Import ImportBox0
		slideModel[28] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Import ImportBox0

		slideModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[0].setRotationPoint(46.75F, -39F, -2F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[1].setRotationPoint(51.75F, -39F, -2F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[2].setRotationPoint(52.75F, -39F, -2F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Import ImportBox0
		slideModel[3].setRotationPoint(44.75F, -40F, -2F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, -0.25F, 0F); // Import ImportBox0
		slideModel[4].setRotationPoint(43.75F, -40F, -2F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[5].setRotationPoint(45.75F, -40F, -2F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[6].setRotationPoint(46.75F, -40.5F, -1.5F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[7].setRotationPoint(46.75F, -42.5F, -1.5F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportBox0
		slideModel[8].setRotationPoint(48.25F, -44.5F, -1.5F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox0
		slideModel[9].setRotationPoint(49.25F, -45.5F, -1.5F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[10].setRotationPoint(50.75F, -44.5F, -1.5F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox0
		slideModel[11].setRotationPoint(50.75F, -41.5F, -1.5F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Import ImportBox0
		slideModel[12].setRotationPoint(51.75F, -38.5F, -1.5F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[13].setRotationPoint(47.75F, -39.5F, -1.5F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[14].setRotationPoint(45.75F, -38.75F, -1.5F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 27, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[15].setRotationPoint(11.75F, -30F, -4.25F);

		slideModel[16].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[16].setRotationPoint(23.75F, -29F, -5F);

		slideModel[17].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[17].setRotationPoint(15.75F, -29F, -5F);

		slideModel[18].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[18].setRotationPoint(27.75F, -28F, -5F);

		slideModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[19].setRotationPoint(33.75F, -28F, -5F);

		slideModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[20].setRotationPoint(32.75F, -28F, -5F);

		slideModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[21].setRotationPoint(32.75F, -30F, -4.6F);

		slideModel[22].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[22].setRotationPoint(15.75F, -29F, -5F);

		slideModel[23].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[23].setRotationPoint(11.75F, -30F, -5F);

		slideModel[24].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[24].setRotationPoint(11.75F, -26F, -5.25F);

		slideModel[25].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[25].setRotationPoint(15.75F, -24F, -5.25F);

		slideModel[26].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		slideModel[26].setRotationPoint(15.75F, -25F, -5.25F);

		slideModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportBox0
		slideModel[27].setRotationPoint(11.75F, -26.25F, -5.25F);

		slideModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		slideModel[28].setRotationPoint(27.75F, -29F, -5F);
	}

	private void initfullammoModel_1()
	{
		fullammoModel[0] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 33
		fullammoModel[1] = new ModelRendererTurbo(this, 841, 169, textureX, textureY); // Box 62
		fullammoModel[2] = new ModelRendererTurbo(this, 881, 169, textureX, textureY); // Box 63
		fullammoModel[3] = new ModelRendererTurbo(this, 921, 169, textureX, textureY); // Box 64
		fullammoModel[4] = new ModelRendererTurbo(this, 961, 169, textureX, textureY); // Box 65

		fullammoModel[0].addShapeBox(-3.6F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		fullammoModel[0].setRotationPoint(26F, -22F, 0F);

		fullammoModel[1].addShapeBox(-7F, -3F, -4F, 14, 3, 4, 0F,0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, -0.55F, -2.45F, 0F, -0.55F, -2.45F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		fullammoModel[1].setRotationPoint(29.5F, -22F, 0F);

		fullammoModel[2].addShapeBox(-7F, -4F, -3F, 14, 4, 3, 0F,0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.45F, -0.55F, 0F, -2.45F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		fullammoModel[2].setRotationPoint(29.5F, -22F, 0F);

		fullammoModel[3].addShapeBox(-7F, -4F, 0F, 14, 4, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -1.65F, 0F, -0.8F, -1.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.45F, -0.55F, 0F, -2.45F, -0.55F); // Box 64
		fullammoModel[3].setRotationPoint(29.5F, -22F, 0F);

		fullammoModel[4].addShapeBox(-7F, -3F, 0F, 14, 3, 4, 0F,0F, -0.55F, -2.45F, 0F, -0.55F, -2.45F, 0F, -1.65F, -0.8F, 0F, -1.65F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 65
		fullammoModel[4].setRotationPoint(29.5F, -22F, 0F);
	}
}