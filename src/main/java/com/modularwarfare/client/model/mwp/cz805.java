//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: cz805
// Model Creator: 
// Created on: 28.09.2018 - 00:37:46
// Last changed on: 28.09.2018 - 00:37:46

package com.modularwarfare.client.model.mwp; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import com.modularwarfare.common.guns.AttachmentEnum;

public class cz805 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public cz805() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[710];
		defaultScopeModel = new ModelRendererTurbo[87];
		ammoModel = new ModelRendererTurbo[22];
		slideModel = new ModelRendererTurbo[13];

		initgunModel_1();
		initgunModel_2();
		initdefaultScopeModel_1();
		initammoModel_1();
		initslideModel_1();
		
		modelScale = 0.05F;
//		barrelAttachPoint = new Vector3f(325F /16F, 70F /16F, 0F /16F);
//		scopeAttachPoint = new Vector3f(05F /16F, 103F /16F, 0.5F /16F);
//		gripAttachPoint = new Vector3f(195 /16F, 48F /16F, 0F /16F);
		attachmentPointMap.put(AttachmentEnum.Sight, new Vector3f(05F /16F, 103F /16F, 0.5F /16F));

		translateAll(2F, -9F, -0.225F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.06F, 0F);//forward/up/?

		gunSlideDistance = 5F;

		rotateGunVertical = 25F;
		rotateGunHorizontal = 1F;
		tiltGun = 25F;
		tiltGunTime = 0.15F;
		unloadClipTime = 0.35F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.15F;
		translateGun = new Vector3f(1 /16F, -1F /16F, -1F /16F);
		rotateClipVertical = -91F;
		rotateClipHorizontal = 1F;
		tiltClip = 28F;
		translateClip = new Vector3f(1 /16F, -20F /16F, 1F /16F);

		hasFlash = false;
        hasArms = true;
             
        
		sprintRotate = new Vector3f(-20.0F, 30.0F, -0.0F);
		sprintTranslate = new Vector3f(0.5F, -0.10F, -0.65F);
		
        leftArmPos = new Vector3f(0.05F, -0.38F, -0.14F);
        leftArmRot = new Vector3f(40.0F, 45.0F, 0.0F);
        leftArmReloadPos = new Vector3f(0.05F, -0.37F, -0.14F);
        leftArmReloadRot = new Vector3f(40.0F, 45.0F, 0.0F);
        leftArmChargePos = new Vector3f(0.18F, 0.45F, 0.06F);
        leftArmChargeRot = new Vector3f(50.0F, 55.0F, -0.0F);
 
        rightArmPos = new Vector3f(-0.37F, -0.20F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(-0.47F, -0.20F, 0.0F);
        rightArmReloadRot = new Vector3f(-0.0F, 0.0F, -90.0F);
        
        rightArmScale = new Vector3f(0.6F, 0.6F, 0.6F);
        leftArmScale = new Vector3f(0.6F, 1.0F, 0.6F);
 
        leftHandAmmo = true;
        
		
		casingAnimDistance = new Vector3f(3, 1, 12);
	    casingAnimSpread = new Vector3f(2, 2, 0);
	    casingAnimTime = 3;  
	    casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);
		
		slideLockOnEmpty = true;

		crouchZoom = -0.10F;
		//fancyStance = true;
		//stanceRotate = new Vector3f(40.0F, 0.0F, -20.0F);
		//stanceTranslate = new Vector3f(0.4F, 0.0F, 0.0F);
		
	    chargeHandleDistance = 5.6F;
	    chargeDelay = 0;
	    chargeDelayAfterReload = 50;
	    chargeTime = 10;
	    
	    leftHandCharge = true;
	    //chargeModifier = new Vector3f (8.0F, 8.0F, 10.0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Import Box0
		gunModel[34] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import Box0
		gunModel[35] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0
		gunModel[36] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Import Box0
		gunModel[37] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		gunModel[38] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box0
		gunModel[39] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Import Box0
		gunModel[40] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Import Box0
		gunModel[41] = new ModelRendererTurbo(this, 697, 81, textureX, textureY); // Import Box0
		gunModel[42] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Import Box0
		gunModel[43] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		gunModel[44] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Import Box0
		gunModel[45] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Import Box0
		gunModel[46] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Import Box0
		gunModel[47] = new ModelRendererTurbo(this, 593, 113, textureX, textureY); // Import Box0
		gunModel[48] = new ModelRendererTurbo(this, 729, 113, textureX, textureY); // Import Box0
		gunModel[49] = new ModelRendererTurbo(this, 809, 113, textureX, textureY); // Import Box0
		gunModel[50] = new ModelRendererTurbo(this, 865, 113, textureX, textureY); // Import Box0
		gunModel[51] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box0
		gunModel[52] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Import Box0
		gunModel[53] = new ModelRendererTurbo(this, 657, 145, textureX, textureY); // Import Box0
		gunModel[54] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box0
		gunModel[55] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box0
		gunModel[56] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import Box0
		gunModel[57] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box0
		gunModel[58] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import Box0
		gunModel[59] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Import Box0
		gunModel[60] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import Box0
		gunModel[61] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Import Box0
		gunModel[62] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Import Box0
		gunModel[63] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Import Box0
		gunModel[64] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Import Box0
		gunModel[65] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Import Box0
		gunModel[66] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Import Box0
		gunModel[67] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import Box0
		gunModel[68] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Import Box0
		gunModel[69] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Import Box0
		gunModel[70] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Import Box0
		gunModel[71] = new ModelRendererTurbo(this, 785, 113, textureX, textureY); // Import Box0
		gunModel[72] = new ModelRendererTurbo(this, 945, 113, textureX, textureY); // Import Box0
		gunModel[73] = new ModelRendererTurbo(this, 841, 113, textureX, textureY); // Import Box0
		gunModel[74] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Import Box0
		gunModel[75] = new ModelRendererTurbo(this, 961, 153, textureX, textureY); // Import Box0
		gunModel[76] = new ModelRendererTurbo(this, 537, 177, textureX, textureY); // Import Box0
		gunModel[77] = new ModelRendererTurbo(this, 585, 177, textureX, textureY); // Import Box0
		gunModel[78] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Import Box0
		gunModel[79] = new ModelRendererTurbo(this, 633, 177, textureX, textureY); // Import Box0
		gunModel[80] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[81] = new ModelRendererTurbo(this, 673, 81, textureX, textureY); // Import Box0
		gunModel[82] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Import Box0
		gunModel[83] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Import Box0
		gunModel[84] = new ModelRendererTurbo(this, 841, 177, textureX, textureY); // Import Box0
		gunModel[85] = new ModelRendererTurbo(this, 889, 177, textureX, textureY); // Import Box0
		gunModel[86] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import Box0
		gunModel[87] = new ModelRendererTurbo(this, 633, 201, textureX, textureY); // Import Box0
		gunModel[88] = new ModelRendererTurbo(this, 913, 177, textureX, textureY); // Import Box0
		gunModel[89] = new ModelRendererTurbo(this, 945, 193, textureX, textureY); // Import Box0
		gunModel[90] = new ModelRendererTurbo(this, 601, 225, textureX, textureY); // Import Box0
		gunModel[91] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box0
		gunModel[92] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		gunModel[93] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import Box0
		gunModel[94] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import Box0
		gunModel[95] = new ModelRendererTurbo(this, 873, 201, textureX, textureY); // Import Box0
		gunModel[96] = new ModelRendererTurbo(this, 905, 225, textureX, textureY); // Import Box0
		gunModel[97] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Import Box0
		gunModel[98] = new ModelRendererTurbo(this, 153, 233, textureX, textureY); // Import Box0
		gunModel[99] = new ModelRendererTurbo(this, 209, 233, textureX, textureY); // Import Box0
		gunModel[100] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Import Box0
		gunModel[101] = new ModelRendererTurbo(this, 297, 241, textureX, textureY); // Import Box0
		gunModel[102] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Import Box0
		gunModel[103] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box0
		gunModel[104] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import Box0
		gunModel[105] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box0
		gunModel[106] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Import Box0
		gunModel[107] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Import Box0
		gunModel[108] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box0
		gunModel[109] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import Box0
		gunModel[110] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box0
		gunModel[111] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Import Box0
		gunModel[112] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		gunModel[113] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Import Box0
		gunModel[114] = new ModelRendererTurbo(this, 241, 273, textureX, textureY); // Import Box0
		gunModel[115] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Import Box0
		gunModel[116] = new ModelRendererTurbo(this, 393, 273, textureX, textureY); // Import Box0
		gunModel[117] = new ModelRendererTurbo(this, 881, 41, textureX, textureY); // Import Box0
		gunModel[118] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import Box0
		gunModel[119] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import Box0
		gunModel[120] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box0
		gunModel[121] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Import Box0
		gunModel[122] = new ModelRendererTurbo(this, 545, 273, textureX, textureY); // Import Box0
		gunModel[123] = new ModelRendererTurbo(this, 697, 273, textureX, textureY); // Import Box0
		gunModel[124] = new ModelRendererTurbo(this, 633, 145, textureX, textureY); // Import Box0
		gunModel[125] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import Box0
		gunModel[126] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box0
		gunModel[127] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box0
		gunModel[128] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Import Box0
		gunModel[129] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box0
		gunModel[130] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box0
		gunModel[131] = new ModelRendererTurbo(this, 849, 273, textureX, textureY); // Import Box0
		gunModel[132] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Import Box0
		gunModel[133] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Import Box0
		gunModel[134] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Import Box0
		gunModel[135] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Import Box0
		gunModel[136] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Import Box0
		gunModel[137] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Import Box0
		gunModel[138] = new ModelRendererTurbo(this, 985, 177, textureX, textureY); // Import Box0
		gunModel[139] = new ModelRendererTurbo(this, 793, 201, textureX, textureY); // Import Box0
		gunModel[140] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Import Box0
		gunModel[141] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Import Box0
		gunModel[142] = new ModelRendererTurbo(this, 665, 289, textureX, textureY); // Import Box0
		gunModel[143] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Import Box0
		gunModel[144] = new ModelRendererTurbo(this, 777, 289, textureX, textureY); // Import Box0
		gunModel[145] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Import Box0
		gunModel[146] = new ModelRendererTurbo(this, 945, 241, textureX, textureY); // Import Box0
		gunModel[147] = new ModelRendererTurbo(this, 985, 273, textureX, textureY); // Import Box0
		gunModel[148] = new ModelRendererTurbo(this, 921, 41, textureX, textureY); // Import Box0
		gunModel[149] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Import Box0
		gunModel[150] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Import Box0
		gunModel[151] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Import Box0
		gunModel[152] = new ModelRendererTurbo(this, 865, 289, textureX, textureY); // Import Box0
		gunModel[153] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Import Box0
		gunModel[154] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Import Box0
		gunModel[155] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box0
		gunModel[156] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Import Box0
		gunModel[157] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Import Box0
		gunModel[158] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import Box0
		gunModel[159] = new ModelRendererTurbo(this, 705, 129, textureX, textureY); // Import Box0
		gunModel[160] = new ModelRendererTurbo(this, 921, 297, textureX, textureY); // Import Box0
		gunModel[161] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Import Box0
		gunModel[162] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import Box0
		gunModel[163] = new ModelRendererTurbo(this, 865, 305, textureX, textureY); // Import Box0
		gunModel[164] = new ModelRendererTurbo(this, 977, 305, textureX, textureY); // Import Box0
		gunModel[165] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Import Box0
		gunModel[166] = new ModelRendererTurbo(this, 513, 177, textureX, textureY); // Import Box0
		gunModel[167] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box0
		gunModel[168] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import Box0
		gunModel[169] = new ModelRendererTurbo(this, 817, 177, textureX, textureY); // Import Box0
		gunModel[170] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Import Box0
		gunModel[171] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Import Box0
		gunModel[172] = new ModelRendererTurbo(this, 657, 313, textureX, textureY); // Import Box0
		gunModel[173] = new ModelRendererTurbo(this, 569, 233, textureX, textureY); // Import Box0
		gunModel[174] = new ModelRendererTurbo(this, 945, 177, textureX, textureY); // Import Box0
		gunModel[175] = new ModelRendererTurbo(this, 185, 233, textureX, textureY); // Import Box0
		gunModel[176] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Import Box0
		gunModel[177] = new ModelRendererTurbo(this, 985, 249, textureX, textureY); // Import Box0
		gunModel[178] = new ModelRendererTurbo(this, 721, 313, textureX, textureY); // Import Box0
		gunModel[179] = new ModelRendererTurbo(this, 745, 321, textureX, textureY); // Import Box0
		gunModel[180] = new ModelRendererTurbo(this, 785, 321, textureX, textureY); // Import Box0
		gunModel[181] = new ModelRendererTurbo(this, 825, 321, textureX, textureY); // Import Box0
		gunModel[182] = new ModelRendererTurbo(this, 713, 9, textureX, textureY); // Import Box0
		gunModel[183] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Import Box0
		gunModel[184] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Import Box0
		gunModel[185] = new ModelRendererTurbo(this, 769, 9, textureX, textureY); // Import Box0
		gunModel[186] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Import Box0
		gunModel[187] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0
		gunModel[188] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		gunModel[189] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box0
		gunModel[190] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		gunModel[191] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import Box0
		gunModel[192] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box0
		gunModel[193] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box0
		gunModel[194] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Import Box0
		gunModel[195] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Import Box0
		gunModel[196] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import Box0
		gunModel[197] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Box0
		gunModel[198] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Import Box0
		gunModel[199] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Import Box0
		gunModel[200] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Import Box0
		gunModel[201] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		gunModel[202] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Import Box0
		gunModel[203] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Import Box0
		gunModel[204] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[205] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		gunModel[206] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Import Box0
		gunModel[207] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Import Box0
		gunModel[208] = new ModelRendererTurbo(this, 873, 233, textureX, textureY); // Import Box0
		gunModel[209] = new ModelRendererTurbo(this, 665, 337, textureX, textureY); // Import Box0
		gunModel[210] = new ModelRendererTurbo(this, 729, 345, textureX, textureY); // Import Box0
		gunModel[211] = new ModelRendererTurbo(this, 657, 361, textureX, textureY); // Import Box0
		gunModel[212] = new ModelRendererTurbo(this, 657, 377, textureX, textureY); // Import Box0
		gunModel[213] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Import Box0
		gunModel[214] = new ModelRendererTurbo(this, 929, 321, textureX, textureY); // Import Box0
		gunModel[215] = new ModelRendererTurbo(this, 569, 177, textureX, textureY); // Import Box0
		gunModel[216] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Import Box0
		gunModel[217] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box0
		gunModel[218] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Import Box0
		gunModel[219] = new ModelRendererTurbo(this, 873, 177, textureX, textureY); // Import Box0
		gunModel[220] = new ModelRendererTurbo(this, 777, 201, textureX, textureY); // Import Box0
		gunModel[221] = new ModelRendererTurbo(this, 889, 257, textureX, textureY); // Import Box0
		gunModel[222] = new ModelRendererTurbo(this, 921, 257, textureX, textureY); // Import Box0
		gunModel[223] = new ModelRendererTurbo(this, 57, 273, textureX, textureY); // Import Box0
		gunModel[224] = new ModelRendererTurbo(this, 577, 305, textureX, textureY); // Import Box0
		gunModel[225] = new ModelRendererTurbo(this, 609, 305, textureX, textureY); // Import Box0
		gunModel[226] = new ModelRendererTurbo(this, 641, 305, textureX, textureY); // Import Box0
		gunModel[227] = new ModelRendererTurbo(this, 937, 361, textureX, textureY); // Import Box0
		gunModel[228] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import Box0
		gunModel[229] = new ModelRendererTurbo(this, 953, 361, textureX, textureY); // Import Box0
		gunModel[230] = new ModelRendererTurbo(this, 249, 385, textureX, textureY); // Import Box0
		gunModel[231] = new ModelRendererTurbo(this, 321, 385, textureX, textureY); // Import Box0
		gunModel[232] = new ModelRendererTurbo(this, 921, 377, textureX, textureY); // Import Box0
		gunModel[233] = new ModelRendererTurbo(this, 393, 385, textureX, textureY); // Import Box0
		gunModel[234] = new ModelRendererTurbo(this, 449, 385, textureX, textureY); // Import Box0
		gunModel[235] = new ModelRendererTurbo(this, 505, 385, textureX, textureY); // Import Box0
		gunModel[236] = new ModelRendererTurbo(this, 561, 385, textureX, textureY); // Import Box0
		gunModel[237] = new ModelRendererTurbo(this, 617, 385, textureX, textureY); // Import Box0
		gunModel[238] = new ModelRendererTurbo(this, 953, 393, textureX, textureY); // Import Box0
		gunModel[239] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Import Box0
		gunModel[240] = new ModelRendererTurbo(this, 57, 401, textureX, textureY); // Import Box0
		gunModel[241] = new ModelRendererTurbo(this, 113, 401, textureX, textureY); // Import Box0
		gunModel[242] = new ModelRendererTurbo(this, 185, 401, textureX, textureY); // Import Box0
		gunModel[243] = new ModelRendererTurbo(this, 649, 401, textureX, textureY); // Import Box0
		gunModel[244] = new ModelRendererTurbo(this, 705, 401, textureX, textureY); // Import Box0
		gunModel[245] = new ModelRendererTurbo(this, 761, 401, textureX, textureY); // Import Box0
		gunModel[246] = new ModelRendererTurbo(this, 817, 401, textureX, textureY); // Import Box0
		gunModel[247] = new ModelRendererTurbo(this, 873, 401, textureX, textureY); // Import Box0
		gunModel[248] = new ModelRendererTurbo(this, 913, 409, textureX, textureY); // Import Box0
		gunModel[249] = new ModelRendererTurbo(this, 217, 417, textureX, textureY); // Import Box0
		gunModel[250] = new ModelRendererTurbo(this, 281, 417, textureX, textureY); // Import Box0
		gunModel[251] = new ModelRendererTurbo(this, 905, 321, textureX, textureY); // Import Box0
		gunModel[252] = new ModelRendererTurbo(this, 329, 417, textureX, textureY); // Import Box0
		gunModel[253] = new ModelRendererTurbo(this, 393, 417, textureX, textureY); // Import Box0
		gunModel[254] = new ModelRendererTurbo(this, 297, 385, textureX, textureY); // Import Box0
		gunModel[255] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Import Box0
		gunModel[256] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Import Box0
		gunModel[257] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Import Box0
		gunModel[258] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Import Box0
		gunModel[259] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Import Box0
		gunModel[260] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Import Box0
		gunModel[261] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Import Box0
		gunModel[262] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Import Box0
		gunModel[263] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Import Box0
		gunModel[264] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Import Box0
		gunModel[265] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Import Box0
		gunModel[266] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Import Box0
		gunModel[267] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Import Box0
		gunModel[268] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Import Box0
		gunModel[269] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Import Box0
		gunModel[270] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Import Box0
		gunModel[271] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Import Box0
		gunModel[272] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Import Box0
		gunModel[273] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Import Box0
		gunModel[274] = new ModelRendererTurbo(this, 673, 81, textureX, textureY); // Import Box0
		gunModel[275] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Import Box0
		gunModel[276] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Import Box0
		gunModel[277] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Import Box0
		gunModel[278] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Import Box0
		gunModel[279] = new ModelRendererTurbo(this, 697, 81, textureX, textureY); // Import Box0
		gunModel[280] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Import Box0
		gunModel[281] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Import Box0
		gunModel[282] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Import Box0
		gunModel[283] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Import Box0
		gunModel[284] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Import Box0
		gunModel[285] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box0
		gunModel[286] = new ModelRendererTurbo(this, 697, 89, textureX, textureY); // Import Box0
		gunModel[287] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Import Box0
		gunModel[288] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Import Box0
		gunModel[289] = new ModelRendererTurbo(this, 625, 97, textureX, textureY); // Import Box0
		gunModel[290] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Import Box0
		gunModel[291] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Import Box0
		gunModel[292] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Import Box0
		gunModel[293] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Import Box0
		gunModel[294] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Import Box0
		gunModel[295] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Import Box0
		gunModel[296] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Import Box0
		gunModel[297] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Import Box0
		gunModel[298] = new ModelRendererTurbo(this, 993, 97, textureX, textureY); // Import Box0
		gunModel[299] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Import Box0
		gunModel[300] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Import Box0
		gunModel[301] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Import Box0
		gunModel[302] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import Box0
		gunModel[303] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Import Box0
		gunModel[304] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Import Box0
		gunModel[305] = new ModelRendererTurbo(this, 1009, 97, textureX, textureY); // Import Box0
		gunModel[306] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Import Box0
		gunModel[307] = new ModelRendererTurbo(this, 601, 105, textureX, textureY); // Import Box0
		gunModel[308] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Import Box0
		gunModel[309] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import Box0
		gunModel[310] = new ModelRendererTurbo(this, 785, 113, textureX, textureY); // Import Box0
		gunModel[311] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Import Box0
		gunModel[312] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Import Box0
		gunModel[313] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Import Box0
		gunModel[314] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Import Box0
		gunModel[315] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Import Box0
		gunModel[316] = new ModelRendererTurbo(this, 841, 113, textureX, textureY); // Import Box0
		gunModel[317] = new ModelRendererTurbo(this, 873, 113, textureX, textureY); // Import Box0
		gunModel[318] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Import Box0
		gunModel[319] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Import Box0
		gunModel[320] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Import Box0
		gunModel[321] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Import Box0
		gunModel[322] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // Import Box0
		gunModel[323] = new ModelRendererTurbo(this, 945, 113, textureX, textureY); // Import Box0
		gunModel[324] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Import Box0
		gunModel[325] = new ModelRendererTurbo(this, 977, 113, textureX, textureY); // Import Box0
		gunModel[326] = new ModelRendererTurbo(this, 993, 113, textureX, textureY); // Import Box0
		gunModel[327] = new ModelRendererTurbo(this, 433, 417, textureX, textureY); // Import Box0
		gunModel[328] = new ModelRendererTurbo(this, 465, 449, textureX, textureY); // Import Box0
		gunModel[329] = new ModelRendererTurbo(this, 969, 457, textureX, textureY); // Import Box0
		gunModel[330] = new ModelRendererTurbo(this, 641, 465, textureX, textureY); // Import Box0
		gunModel[331] = new ModelRendererTurbo(this, 697, 465, textureX, textureY); // Import Box0
		gunModel[332] = new ModelRendererTurbo(this, 1, 473, textureX, textureY); // Import Box0
		gunModel[333] = new ModelRendererTurbo(this, 593, 385, textureX, textureY); // Import Box0
		gunModel[334] = new ModelRendererTurbo(this, 33, 401, textureX, textureY); // Import Box0
		gunModel[335] = new ModelRendererTurbo(this, 505, 473, textureX, textureY); // Import Box0
		gunModel[336] = new ModelRendererTurbo(this, 585, 473, textureX, textureY); // Import Box0
		gunModel[337] = new ModelRendererTurbo(this, 377, 473, textureX, textureY); // Import Box0
		gunModel[338] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Import Box0
		gunModel[339] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Import Box0
		gunModel[340] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box0
		gunModel[341] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Import Box0
		gunModel[342] = new ModelRendererTurbo(this, 697, 121, textureX, textureY); // Import Box0
		gunModel[343] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Import Box0
		gunModel[344] = new ModelRendererTurbo(this, 841, 121, textureX, textureY); // Import Box0
		gunModel[345] = new ModelRendererTurbo(this, 729, 473, textureX, textureY); // Import Box0
		gunModel[346] = new ModelRendererTurbo(this, 785, 473, textureX, textureY); // Import Box0
		gunModel[347] = new ModelRendererTurbo(this, 841, 473, textureX, textureY); // Import Box0
		gunModel[348] = new ModelRendererTurbo(this, 81, 481, textureX, textureY); // Import Box0
		gunModel[349] = new ModelRendererTurbo(this, 137, 481, textureX, textureY); // Import Box0
		gunModel[350] = new ModelRendererTurbo(this, 193, 481, textureX, textureY); // Import Box0
		gunModel[351] = new ModelRendererTurbo(this, 425, 489, textureX, textureY); // Import Box0
		gunModel[352] = new ModelRendererTurbo(this, 897, 489, textureX, textureY); // Import Box0
		gunModel[353] = new ModelRendererTurbo(this, 233, 489, textureX, textureY); // Import Box0
		gunModel[354] = new ModelRendererTurbo(this, 265, 497, textureX, textureY); // Import Box0
		gunModel[355] = new ModelRendererTurbo(this, 649, 505, textureX, textureY); // Import Box0
		gunModel[356] = new ModelRendererTurbo(this, 121, 513, textureX, textureY); // Import Box0
		gunModel[357] = new ModelRendererTurbo(this, 321, 497, textureX, textureY); // Import Box0
		gunModel[358] = new ModelRendererTurbo(this, 1, 505, textureX, textureY); // Import Box0
		gunModel[359] = new ModelRendererTurbo(this, 465, 505, textureX, textureY); // Import Box0
		gunModel[360] = new ModelRendererTurbo(this, 753, 505, textureX, textureY); // Import Box0
		gunModel[361] = new ModelRendererTurbo(this, 353, 513, textureX, textureY); // Import Box0
		gunModel[362] = new ModelRendererTurbo(this, 521, 513, textureX, textureY); // Import Box0
		gunModel[363] = new ModelRendererTurbo(this, 577, 513, textureX, textureY); // Import Box0
		gunModel[364] = new ModelRendererTurbo(this, 809, 513, textureX, textureY); // Import Box0
		gunModel[365] = new ModelRendererTurbo(this, 33, 521, textureX, textureY); // Import Box0
		gunModel[366] = new ModelRendererTurbo(this, 841, 521, textureX, textureY); // Import Box0
		gunModel[367] = new ModelRendererTurbo(this, 209, 529, textureX, textureY); // Import Box0
		gunModel[368] = new ModelRendererTurbo(this, 385, 529, textureX, textureY); // Import Box0
		gunModel[369] = new ModelRendererTurbo(this, 921, 529, textureX, textureY); // Import Box0
		gunModel[370] = new ModelRendererTurbo(this, 737, 537, textureX, textureY); // Import Box0
		gunModel[371] = new ModelRendererTurbo(this, 121, 545, textureX, textureY); // Import Box0
		gunModel[372] = new ModelRendererTurbo(this, 281, 545, textureX, textureY); // Import Box0
		gunModel[373] = new ModelRendererTurbo(this, 457, 545, textureX, textureY); // Import Box0
		gunModel[374] = new ModelRendererTurbo(this, 561, 545, textureX, textureY); // Import Box0
		gunModel[375] = new ModelRendererTurbo(this, 825, 545, textureX, textureY); // Import Box0
		gunModel[376] = new ModelRendererTurbo(this, 1, 553, textureX, textureY); // Import Box0
		gunModel[377] = new ModelRendererTurbo(this, 369, 553, textureX, textureY); // Import Box0
		gunModel[378] = new ModelRendererTurbo(this, 641, 553, textureX, textureY); // Import Box0
		gunModel[379] = new ModelRendererTurbo(this, 905, 553, textureX, textureY); // Import Box0
		gunModel[380] = new ModelRendererTurbo(this, 209, 561, textureX, textureY); // Import Box0
		gunModel[381] = new ModelRendererTurbo(this, 89, 401, textureX, textureY); // Import Box0
		gunModel[382] = new ModelRendererTurbo(this, 161, 401, textureX, textureY); // Import Box0
		gunModel[383] = new ModelRendererTurbo(this, 681, 401, textureX, textureY); // Import Box0
		gunModel[384] = new ModelRendererTurbo(this, 737, 401, textureX, textureY); // Import Box0
		gunModel[385] = new ModelRendererTurbo(this, 793, 401, textureX, textureY); // Import Box0
		gunModel[386] = new ModelRendererTurbo(this, 849, 401, textureX, textureY); // Import Box0
		gunModel[387] = new ModelRendererTurbo(this, 505, 449, textureX, textureY); // Import Box0
		gunModel[388] = new ModelRendererTurbo(this, 673, 465, textureX, textureY); // Import Box0
		gunModel[389] = new ModelRendererTurbo(this, 561, 473, textureX, textureY); // Import Box0
		gunModel[390] = new ModelRendererTurbo(this, 81, 561, textureX, textureY); // Import Box0
		gunModel[391] = new ModelRendererTurbo(this, 721, 561, textureX, textureY); // Import Box0
		gunModel[392] = new ModelRendererTurbo(this, 769, 561, textureX, textureY); // Import Box0
		gunModel[393] = new ModelRendererTurbo(this, 977, 561, textureX, textureY); // Import Box0
		gunModel[394] = new ModelRendererTurbo(this, 113, 569, textureX, textureY); // Import Box0
		gunModel[395] = new ModelRendererTurbo(this, 161, 569, textureX, textureY); // Import Box0
		gunModel[396] = new ModelRendererTurbo(this, 281, 569, textureX, textureY); // Import Box0
		gunModel[397] = new ModelRendererTurbo(this, 329, 569, textureX, textureY); // Import Box0
		gunModel[398] = new ModelRendererTurbo(this, 449, 569, textureX, textureY); // Import Box0
		gunModel[399] = new ModelRendererTurbo(this, 497, 569, textureX, textureY); // Import Box0
		gunModel[400] = new ModelRendererTurbo(this, 545, 569, textureX, textureY); // Import Box0
		gunModel[401] = new ModelRendererTurbo(this, 593, 569, textureX, textureY); // Import Box0
		gunModel[402] = new ModelRendererTurbo(this, 801, 569, textureX, textureY); // Import Box0
		gunModel[403] = new ModelRendererTurbo(this, 849, 569, textureX, textureY); // Import Box0
		gunModel[404] = new ModelRendererTurbo(this, 1, 577, textureX, textureY); // Import Box0
		gunModel[405] = new ModelRendererTurbo(this, 49, 577, textureX, textureY); // Import Box0
		gunModel[406] = new ModelRendererTurbo(this, 361, 577, textureX, textureY); // Import Box0
		gunModel[407] = new ModelRendererTurbo(this, 625, 577, textureX, textureY); // Import Box0
		gunModel[408] = new ModelRendererTurbo(this, 881, 577, textureX, textureY); // Import Box0
		gunModel[409] = new ModelRendererTurbo(this, 193, 585, textureX, textureY); // Import Box0
		gunModel[410] = new ModelRendererTurbo(this, 409, 577, textureX, textureY); // Import Box0
		gunModel[411] = new ModelRendererTurbo(this, 697, 585, textureX, textureY); // Import Box0
		gunModel[412] = new ModelRendererTurbo(this, 73, 593, textureX, textureY); // Import Box0
		gunModel[413] = new ModelRendererTurbo(this, 145, 593, textureX, textureY); // Import Box0
		gunModel[414] = new ModelRendererTurbo(this, 289, 593, textureX, textureY); // Import Box0
		gunModel[415] = new ModelRendererTurbo(this, 441, 593, textureX, textureY); // Import Box0
		gunModel[416] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Import Box0
		gunModel[417] = new ModelRendererTurbo(this, 537, 137, textureX, textureY); // Import Box0
		gunModel[418] = new ModelRendererTurbo(this, 505, 593, textureX, textureY); // Import Box0
		gunModel[419] = new ModelRendererTurbo(this, 961, 585, textureX, textureY); // Import Box0
		gunModel[420] = new ModelRendererTurbo(this, 777, 593, textureX, textureY); // Import Box0
		gunModel[421] = new ModelRendererTurbo(this, 593, 593, textureX, textureY); // Import Box0
		gunModel[422] = new ModelRendererTurbo(this, 841, 593, textureX, textureY); // Import Box0
		gunModel[423] = new ModelRendererTurbo(this, 1, 601, textureX, textureY); // Import Box0
		gunModel[424] = new ModelRendererTurbo(this, 377, 601, textureX, textureY); // Import Box0
		gunModel[425] = new ModelRendererTurbo(this, 33, 609, textureX, textureY); // Import Box0
		gunModel[426] = new ModelRendererTurbo(this, 593, 409, textureX, textureY); // Import Box0
		gunModel[427] = new ModelRendererTurbo(this, 625, 609, textureX, textureY); // Import Box0
		gunModel[428] = new ModelRendererTurbo(this, 409, 609, textureX, textureY); // Import Box0
		gunModel[429] = new ModelRendererTurbo(this, 873, 609, textureX, textureY); // Import Box0
		gunModel[430] = new ModelRendererTurbo(this, 193, 617, textureX, textureY); // Import Box0
		gunModel[431] = new ModelRendererTurbo(this, 249, 617, textureX, textureY); // Import Box0
		gunModel[432] = new ModelRendererTurbo(this, 905, 609, textureX, textureY); // Import Box0
		gunModel[433] = new ModelRendererTurbo(this, 889, 457, textureX, textureY); // Import Box0
		gunModel[434] = new ModelRendererTurbo(this, 745, 593, textureX, textureY); // Import Box0
		gunModel[435] = new ModelRendererTurbo(this, 465, 625, textureX, textureY); // Import Box0
		gunModel[436] = new ModelRendererTurbo(this, 537, 625, textureX, textureY); // Import Box0
		gunModel[437] = new ModelRendererTurbo(this, 673, 625, textureX, textureY); // Import Box0
		gunModel[438] = new ModelRendererTurbo(this, 745, 625, textureX, textureY); // Import Box0
		gunModel[439] = new ModelRendererTurbo(this, 817, 625, textureX, textureY); // Import Box0
		gunModel[440] = new ModelRendererTurbo(this, 625, 641, textureX, textureY); // Import Box0
		gunModel[441] = new ModelRendererTurbo(this, 865, 641, textureX, textureY); // Import Box0
		gunModel[442] = new ModelRendererTurbo(this, 921, 641, textureX, textureY); // Import Box0
		gunModel[443] = new ModelRendererTurbo(this, 25, 649, textureX, textureY); // Import Box0
		gunModel[444] = new ModelRendererTurbo(this, 641, 433, textureX, textureY); // Import Box0
		gunModel[445] = new ModelRendererTurbo(this, 185, 649, textureX, textureY); // Import Box0
		gunModel[446] = new ModelRendererTurbo(this, 953, 649, textureX, textureY); // Import Box0
		gunModel[447] = new ModelRendererTurbo(this, 81, 273, textureX, textureY); // Import Box0
		gunModel[448] = new ModelRendererTurbo(this, 377, 273, textureX, textureY); // Import Box0
		gunModel[449] = new ModelRendererTurbo(this, 681, 273, textureX, textureY); // Import Box0
		gunModel[450] = new ModelRendererTurbo(this, 89, 657, textureX, textureY); // Import Box0
		gunModel[451] = new ModelRendererTurbo(this, 281, 657, textureX, textureY); // Import Box0
		gunModel[452] = new ModelRendererTurbo(this, 393, 657, textureX, textureY); // Import Box0
		gunModel[453] = new ModelRendererTurbo(this, 513, 657, textureX, textureY); // Import Box0
		gunModel[454] = new ModelRendererTurbo(this, 569, 657, textureX, textureY); // Import Box0
		gunModel[455] = new ModelRendererTurbo(this, 681, 657, textureX, textureY); // Import Box0
		gunModel[456] = new ModelRendererTurbo(this, 737, 657, textureX, textureY); // Import Box0
		gunModel[457] = new ModelRendererTurbo(this, 793, 657, textureX, textureY); // Import Box0
		gunModel[458] = new ModelRendererTurbo(this, 249, 665, textureX, textureY); // Import Box0
		gunModel[459] = new ModelRendererTurbo(this, 313, 665, textureX, textureY); // Import Box0
		gunModel[460] = new ModelRendererTurbo(this, 425, 673, textureX, textureY); // Import Box0
		gunModel[461] = new ModelRendererTurbo(this, 129, 665, textureX, textureY); // Import Box0
		gunModel[462] = new ModelRendererTurbo(this, 361, 673, textureX, textureY); // Import Box0
		gunModel[463] = new ModelRendererTurbo(this, 489, 689, textureX, textureY); // Import Box0
		gunModel[464] = new ModelRendererTurbo(this, 1, 689, textureX, textureY); // Import Box0
		gunModel[465] = new ModelRendererTurbo(this, 897, 681, textureX, textureY); // Import Box0
		gunModel[466] = new ModelRendererTurbo(this, 657, 689, textureX, textureY); // Import Box0
		gunModel[467] = new ModelRendererTurbo(this, 729, 689, textureX, textureY); // Import Box0
		gunModel[468] = new ModelRendererTurbo(this, 225, 697, textureX, textureY); // Import Box0
		gunModel[469] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Import Box0
		gunModel[470] = new ModelRendererTurbo(this, 921, 185, textureX, textureY); // Import Box0
		gunModel[471] = new ModelRendererTurbo(this, 73, 713, textureX, textureY); // Import Box0
		gunModel[472] = new ModelRendererTurbo(this, 913, 713, textureX, textureY); // Import Box0
		gunModel[473] = new ModelRendererTurbo(this, 1, 721, textureX, textureY); // Import Box0
		gunModel[474] = new ModelRendererTurbo(this, 473, 721, textureX, textureY); // Import Box0
		gunModel[475] = new ModelRendererTurbo(this, 625, 705, textureX, textureY); // Import Box0
		gunModel[476] = new ModelRendererTurbo(this, 545, 721, textureX, textureY); // Import Box0
		gunModel[477] = new ModelRendererTurbo(this, 657, 721, textureX, textureY); // Import Box0
		gunModel[478] = new ModelRendererTurbo(this, 73, 689, textureX, textureY); // Import Box0
		gunModel[479] = new ModelRendererTurbo(this, 217, 729, textureX, textureY); // Import Box0
		gunModel[480] = new ModelRendererTurbo(this, 281, 729, textureX, textureY); // Import Box0
		gunModel[481] = new ModelRendererTurbo(this, 777, 729, textureX, textureY); // Import Box0
		gunModel[482] = new ModelRendererTurbo(this, 329, 737, textureX, textureY); // Import Box0
		gunModel[483] = new ModelRendererTurbo(this, 417, 737, textureX, textureY); // Import Box0
		gunModel[484] = new ModelRendererTurbo(this, 601, 737, textureX, textureY); // Import Box0
		gunModel[485] = new ModelRendererTurbo(this, 73, 745, textureX, textureY); // Import Box0
		gunModel[486] = new ModelRendererTurbo(this, 129, 745, textureX, textureY); // Import Box0
		gunModel[487] = new ModelRendererTurbo(this, 865, 745, textureX, textureY); // Import Box0
		gunModel[488] = new ModelRendererTurbo(this, 921, 745, textureX, textureY); // Import Box0
		gunModel[489] = new ModelRendererTurbo(this, 1, 753, textureX, textureY); // Import Box0
		gunModel[490] = new ModelRendererTurbo(this, 897, 641, textureX, textureY); // Import Box0
		gunModel[491] = new ModelRendererTurbo(this, 545, 657, textureX, textureY); // Import Box0
		gunModel[492] = new ModelRendererTurbo(this, 713, 657, textureX, textureY); // Import Box0
		gunModel[493] = new ModelRendererTurbo(this, 769, 657, textureX, textureY); // Import Box0
		gunModel[494] = new ModelRendererTurbo(this, 169, 753, textureX, textureY); // Import Box0
		gunModel[495] = new ModelRendererTurbo(this, 481, 761, textureX, textureY); // Import Box0
		gunModel[496] = new ModelRendererTurbo(this, 649, 753, textureX, textureY); // Import Box0
		gunModel[497] = new ModelRendererTurbo(this, 705, 753, textureX, textureY); // Import Box0
		gunModel[498] = new ModelRendererTurbo(this, 41, 753, textureX, textureY); // Import Box0
		gunModel[499] = new ModelRendererTurbo(this, 961, 753, textureX, textureY); // Import Box0

		gunModel[0].addBox(71F, -39F, -12F, 10, 43, 23, 0F); // Import Box0
		gunModel[0].setRotationPoint(-27F, -9F, 0.5F);

		gunModel[1].addShapeBox(71F, -39F, -12F, 9, 11, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[1].setRotationPoint(-17F, -9F, 0.5F);

		gunModel[2].addShapeBox(71F, -39F, -12F, 4, 11, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[2].setRotationPoint(-8F, -9F, 0.5F);

		gunModel[3].addShapeBox(71F, -39F, -12F, 3, 8, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[3].setRotationPoint(-4F, -9F, 0.5F);

		gunModel[4].addShapeBox(71F, -39F, -12F, 37, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[4].setRotationPoint(-1F, -9F, 0.5F);

		gunModel[5].addShapeBox(71F, -39F, -12F, 5, 8, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[5].setRotationPoint(-17F, 26F, 0.5F);

		gunModel[6].addShapeBox(71F, -39F, -12F, 5, 1, 23, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[6].setRotationPoint(-17F, 25F, 0.5F);

		gunModel[7].addShapeBox(71F, -39F, -12F, 2, 4, 23, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[7].setRotationPoint(-12F, 26F, 0.5F);

		gunModel[8].addShapeBox(71F, -39F, -12F, 1, 2, 23, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[8].setRotationPoint(-10F, 28F, 0.5F);

		gunModel[9].addShapeBox(71F, -39F, -12F, 3, 4, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[9].setRotationPoint(-12F, 30F, 0.5F);

		gunModel[10].addShapeBox(71F, -39F, -12F, 3, 32, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[10].setRotationPoint(36F, -9F, 0.5F);

		gunModel[11].addShapeBox(71F, -39F, -12F, 3, 6, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F); // Import Box0
		gunModel[11].setRotationPoint(39F, 16F, 0.5F);

		gunModel[12].addShapeBox(71F, -39F, -12F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[12].setRotationPoint(42F, 16F, 0.5F);

		gunModel[13].addShapeBox(71F, -39F, -12F, 3, 7, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[13].setRotationPoint(41F, 9F, 0.5F);

		gunModel[14].addShapeBox(71F, -39F, -12F, 3, 1, 3, 0F,1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[14].setRotationPoint(41F, 8.5F, 0.5F);

		gunModel[15].addShapeBox(71F, -39F, -12F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[15].setRotationPoint(39F, 7.5F, 0.5F);

		gunModel[16].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[16].setRotationPoint(39F, 8.5F, 0.5F);

		gunModel[17].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[17].setRotationPoint(39F, 6.5F, 0.5F);

		gunModel[18].addShapeBox(71F, -39F, -12F, 4, 1, 3, 0F,0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[18].setRotationPoint(42F, 6.5F, 0.5F);

		gunModel[19].addShapeBox(71F, -39F, -12F, 5, 2, 3, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[19].setRotationPoint(42F, 4.5F, 0.5F);

		gunModel[20].addShapeBox(71F, -39F, -12F, 5, 1, 3, 0F,-1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[20].setRotationPoint(42F, 3.5F, 0.5F);

		gunModel[21].addShapeBox(71F, -39F, -12F, 5, 2, 3, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[21].setRotationPoint(43.5F, 1.5F, 0.5F);

		gunModel[22].addShapeBox(71F, -39F, -12F, 142, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[22].setRotationPoint(-103F, -13F, 0F);

		gunModel[23].addShapeBox(71F, -39F, -12F, 55, 38, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[23].setRotationPoint(-17F, -6F, 2F);

		gunModel[24].addShapeBox(71F, -39F, -12F, 142, 1, 22, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[24].setRotationPoint(-103F, -10F, 1F);

		gunModel[25].addShapeBox(71F, -39F, -12F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[25].setRotationPoint(-21F, -2.5F, 20.5F);

		gunModel[26].addShapeBox(71F, -39F, -12F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[26].setRotationPoint(-7F, -2.5F, 20.5F);

		gunModel[27].addShapeBox(71F, -39F, -12F, 2, 2, 4, 0F,0F, 0F, 0F, 0.25F, 4F, 0F, 0.25F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[27].setRotationPoint(-5F, -4.5F, 20.5F);

		gunModel[28].addShapeBox(71F, -39F, -12F, 10, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[28].setRotationPoint(-18F, -8F, 20F);

		gunModel[29].addShapeBox(71F, -39F, -12F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[29].setRotationPoint(-8F, -8F, 20F);

		gunModel[30].addShapeBox(71F, -39F, -12F, 1, 2, 5, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Import Box0
		gunModel[30].setRotationPoint(-20F, -7F, 20F);

		gunModel[31].addShapeBox(71F, -39F, -12F, 1, 4, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[31].setRotationPoint(-19F, -8F, 20F);

		gunModel[32].addShapeBox(71F, -39F, -12F, 1, 2, 5, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[32].setRotationPoint(-7F, -7F, 20F);

		gunModel[33].addShapeBox(71F, -39F, -12F, 45, 1, 23, 0F,0F, 0F, -1.5F, 0F, 11F, -1.5F, 0F, 11F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[33].setRotationPoint(-9F, 30F, 0.5F);

		gunModel[34].addShapeBox(71F, -39F, -12F, 148, 14, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[34].setRotationPoint(-106F, -27F, 6.5F);

		gunModel[35].addShapeBox(71F, -39F, -12F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[35].setRotationPoint(38F, -16.5F, 0F);

		gunModel[36].addShapeBox(71F, -39F, -12F, 4, 4, 24, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[36].setRotationPoint(39F, -13F, 0F);

		gunModel[37].addShapeBox(71F, -39F, -12F, 8, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[37].setRotationPoint(38F, -19F, 0F);

		gunModel[38].addShapeBox(71F, -39F, -12F, 12, 16, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[38].setRotationPoint(46F, -29.5F, 0F);

		gunModel[39].addShapeBox(71F, -39F, -12F, 3, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[39].setRotationPoint(43F, -16.5F, 0F);

		gunModel[40].addShapeBox(71F, -39F, -12F, 1, 1, 24, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[40].setRotationPoint(43F, -13.5F, 0F);

		gunModel[41].addShapeBox(71F, -39F, -12F, 5, 11, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[41].setRotationPoint(42F, -27F, 1.5F);

		gunModel[42].addShapeBox(71F, -39F, -12F, 159, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[42].setRotationPoint(-113F, -29.5F, 6F);

		gunModel[43].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F); // Import Box0
		gunModel[43].setRotationPoint(44F, -27F, 4F);

		gunModel[44].addShapeBox(71F, -39F, -12F, 4, 1, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[44].setRotationPoint(39F, -13F, 0F);

		gunModel[45].addShapeBox(71F, -39F, -12F, 74, 3, 24, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[45].setRotationPoint(-107F, -32.5F, 0F);

		gunModel[46].addShapeBox(71F, -39F, -12F, 78, 15, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[46].setRotationPoint(-107F, -47.5F, 2F);

		gunModel[47].addShapeBox(71F, -39F, -12F, 39, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[47].setRotationPoint(-66F, 4F, 0.5F);

		gunModel[48].addShapeBox(71F, -39F, -12F, 16, 5, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[48].setRotationPoint(-53F, -6F, 0.5F);

		gunModel[49].addShapeBox(71F, -39F, -12F, 2, 5, 23, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[49].setRotationPoint(-37F, -6F, 0.5F);

		gunModel[50].addShapeBox(71F, -39F, -12F, 16, 5, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[50].setRotationPoint(-66F, -1F, 0.5F);

		gunModel[51].addBox(71F, -39F, -12F, 76, 1, 23, 0F); // Import Box0
		gunModel[51].setRotationPoint(-103F, -9F, 0.5F);

		gunModel[52].addShapeBox(71F, -39F, -12F, 213, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[52].setRotationPoint(-29F, -47.5F, 2F);

		gunModel[53].addShapeBox(71F, -39F, -12F, 140, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[53].setRotationPoint(-29F, -37.5F, 2F);

		gunModel[54].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[54].setRotationPoint(-28F, -43.5F, 2F);

		gunModel[55].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[55].setRotationPoint(-28F, -39.5F, 2F);

		gunModel[56].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[56].setRotationPoint(-24F, -43.5F, 2F);

		gunModel[57].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[57].setRotationPoint(-24F, -39.5F, 2F);

		gunModel[58].addShapeBox(71F, -39F, -12F, 1, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[58].setRotationPoint(-29F, -43.5F, 2F);

		gunModel[59].addShapeBox(71F, -39F, -12F, 89, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[59].setRotationPoint(-22F, -39.5F, 2F);

		gunModel[60].addShapeBox(71F, -39F, -12F, 89, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[60].setRotationPoint(-22F, -43.5F, 2F);

		gunModel[61].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[61].setRotationPoint(67F, -43.5F, 2F);

		gunModel[62].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[62].setRotationPoint(67F, -39.5F, 2F);

		gunModel[63].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[63].setRotationPoint(71F, -43.5F, 2F);

		gunModel[64].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[64].setRotationPoint(71F, -39.5F, 2F);

		gunModel[65].addShapeBox(71F, -39F, -12F, 38, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[65].setRotationPoint(73F, -43.5F, 2F);

		gunModel[66].addShapeBox(71F, -39F, -12F, 73, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[66].setRotationPoint(111F, -43.5F, 2F);

		gunModel[67].addShapeBox(71F, -39F, -12F, 73, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[67].setRotationPoint(111F, -34.5F, 2F);

		gunModel[68].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F); // Import Box0
		gunModel[68].setRotationPoint(137F, -39.5F, 2F);

		gunModel[69].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[69].setRotationPoint(137F, -36.5F, 2F);

		gunModel[70].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[70].setRotationPoint(111F, -39.5F, 2F);

		gunModel[71].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[71].setRotationPoint(111F, -36.5F, 2F);

		gunModel[72].addShapeBox(71F, -39F, -12F, 5, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[72].setRotationPoint(139F, -39.5F, 2F);

		gunModel[73].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[73].setRotationPoint(170F, -36.5F, 2F);

		gunModel[74].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F); // Import Box0
		gunModel[74].setRotationPoint(170F, -39.5F, 2F);

		gunModel[75].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[75].setRotationPoint(144F, -36.5F, 2F);

		gunModel[76].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[76].setRotationPoint(144F, -39.5F, 2F);

		gunModel[77].addShapeBox(71F, -39F, -12F, 12, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[77].setRotationPoint(172F, -39.5F, 2F);

		gunModel[78].addShapeBox(71F, -39F, -12F, 4, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[78].setRotationPoint(-22F, -41.5F, 3.5F);

		gunModel[79].addShapeBox(71F, -39F, -12F, 83, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[79].setRotationPoint(-16F, -41.5F, 3.5F);

		gunModel[80].addShapeBox(71F, -39F, -12F, 1, 1, 17, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import Box0
		gunModel[80].setRotationPoint(-17F, -41.5F, 3.5F);

		gunModel[81].addShapeBox(71F, -39F, -12F, 1, 1, 17, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[81].setRotationPoint(-17F, -40.5F, 3.5F);

		gunModel[82].addShapeBox(71F, -39F, -12F, 1, 1, 17, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[82].setRotationPoint(-18F, -41.5F, 3.5F);

		gunModel[83].addShapeBox(71F, -39F, -12F, 1, 1, 17, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[83].setRotationPoint(-18F, -40.5F, 3.5F);

		gunModel[84].addShapeBox(71F, -39F, -12F, 6, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[84].setRotationPoint(-28F, -43.5F, 3.5F);

		gunModel[85].addShapeBox(71F, -39F, -12F, 6, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[85].setRotationPoint(67F, -43.5F, 3.5F);

		gunModel[86].addShapeBox(71F, -39F, -12F, 291, 2, 20, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[86].setRotationPoint(-107F, -49.5F, 2F);

		gunModel[87].addShapeBox(71F, -39F, -12F, 62, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[87].setRotationPoint(111F, -39.5F, 3.5F);

		gunModel[88].addShapeBox(71F, -39F, -12F, 2, 16, 24, 0F,0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box0
		gunModel[88].setRotationPoint(58F, -29.5F, 0F);

		gunModel[89].addShapeBox(71F, -39F, -12F, 3, 17, 28, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[89].setRotationPoint(60F, -30.5F, -2F);

		gunModel[90].addShapeBox(71F, -39F, -12F, 121, 15, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[90].setRotationPoint(63F, -28.5F, -2F);

		gunModel[91].addShapeBox(71F, -39F, -12F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F); // Import Box0
		gunModel[91].setRotationPoint(168F, -13.5F, -2F);

		gunModel[92].addShapeBox(71F, -39F, -12F, 2, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Import Box0
		gunModel[92].setRotationPoint(170F, -13.5F, -2F);

		gunModel[93].addShapeBox(71F, -39F, -12F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[93].setRotationPoint(172F, -13.5F, -2F);

		gunModel[94].addShapeBox(71F, -39F, -12F, 25, 12, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[94].setRotationPoint(-52F, -8F, 1.5F);

		gunModel[95].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[95].setRotationPoint(-28F, -8F, 0.5F);

		gunModel[96].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[96].setRotationPoint(-50F, -1F, 0.5F);

		gunModel[97].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[97].setRotationPoint(-28F, 3F, 0.5F);

		gunModel[98].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[98].setRotationPoint(-50F, 3F, 0.5F);

		gunModel[99].addShapeBox(71F, -39F, -12F, 2, 3, 24, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F); // Import Box0
		gunModel[99].setRotationPoint(58F, -32.5F, 0F);

		gunModel[100].addShapeBox(71F, -39F, -12F, 3, 2, 24, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 2F); // Import Box0
		gunModel[100].setRotationPoint(60F, -32.5F, 0F);

		gunModel[101].addShapeBox(71F, -39F, -12F, 121, 4, 24, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import Box0
		gunModel[101].setRotationPoint(63F, -32.5F, 0F);

		gunModel[102].addShapeBox(71F, -39F, -12F, 16, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[102].setRotationPoint(71F, -27.5F, 26F);

		gunModel[103].addShapeBox(71F, -39F, -12F, 3, 10, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[103].setRotationPoint(68F, -27.5F, 26F);

		gunModel[104].addShapeBox(71F, -39F, -12F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[104].setRotationPoint(101F, -23.5F, 28.5F);

		gunModel[105].addShapeBox(71F, -39F, -12F, 6, 10, 2, 0F,0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[105].setRotationPoint(87F, -27.5F, -4F);

		gunModel[106].addShapeBox(71F, -39F, -12F, 7, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[106].setRotationPoint(93F, -29.5F, 26F);

		gunModel[107].addShapeBox(71F, -39F, -12F, 2, 8, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box0
		gunModel[107].setRotationPoint(66F, -26.5F, 26F);

		gunModel[108].addShapeBox(71F, -39F, -12F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[108].setRotationPoint(101F, -21.5F, 28.5F);

		gunModel[109].addShapeBox(71F, -39F, -12F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[109].setRotationPoint(101F, -25.5F, 28.5F);

		gunModel[110].addShapeBox(71F, -39F, -12F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[110].setRotationPoint(170F, -23.5F, 29F);

		gunModel[111].addShapeBox(71F, -39F, -12F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[111].setRotationPoint(170F, -21.5F, 29F);

		gunModel[112].addShapeBox(71F, -39F, -12F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[112].setRotationPoint(170F, -25.5F, 29F);

		gunModel[113].addShapeBox(71F, -39F, -12F, 68, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[113].setRotationPoint(100F, -29.5F, 26F);

		gunModel[114].addShapeBox(71F, -39F, -12F, 68, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[114].setRotationPoint(100F, -19.5F, 26F);

		gunModel[115].addShapeBox(71F, -39F, -12F, 15, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[115].setRotationPoint(168F, -29.5F, 26F);

		gunModel[116].addShapeBox(71F, -39F, -12F, 70, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[116].setRotationPoint(98F, -25.5F, 26F);

		gunModel[117].addShapeBox(71F, -39F, -12F, 16, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[117].setRotationPoint(71F, -27.5F, -4F);

		gunModel[118].addShapeBox(71F, -39F, -12F, 3, 10, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[118].setRotationPoint(68F, -27.5F, -4F);

		gunModel[119].addShapeBox(71F, -39F, -12F, 2, 8, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box0
		gunModel[119].setRotationPoint(66F, -26.5F, -4F);

		gunModel[120].addShapeBox(71F, -39F, -12F, 6, 10, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 2F, 0F, 0F, 0F); // Import Box0
		gunModel[120].setRotationPoint(87F, -27.5F, 26F);

		gunModel[121].addShapeBox(71F, -39F, -12F, 7, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[121].setRotationPoint(93F, -29.5F, -6F);

		gunModel[122].addShapeBox(71F, -39F, -12F, 68, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[122].setRotationPoint(100F, -29.5F, -6F);

		gunModel[123].addShapeBox(71F, -39F, -12F, 68, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[123].setRotationPoint(100F, -19.5F, -6F);

		gunModel[124].addShapeBox(71F, -39F, -12F, 15, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[124].setRotationPoint(168F, -29.5F, -6F);

		gunModel[125].addShapeBox(71F, -39F, -12F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[125].setRotationPoint(101F, -23.5F, -6.5F);

		gunModel[126].addShapeBox(71F, -39F, -12F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[126].setRotationPoint(101F, -21.5F, -6.5F);

		gunModel[127].addShapeBox(71F, -39F, -12F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[127].setRotationPoint(101F, -25.5F, -6.5F);

		gunModel[128].addShapeBox(71F, -39F, -12F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[128].setRotationPoint(170F, -23.5F, -7F);

		gunModel[129].addShapeBox(71F, -39F, -12F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[129].setRotationPoint(170F, -21.5F, -7F);

		gunModel[130].addShapeBox(71F, -39F, -12F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[130].setRotationPoint(170F, -25.5F, -7F);

		gunModel[131].addShapeBox(71F, -39F, -12F, 68, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[131].setRotationPoint(100F, -25.5F, -5F);

		gunModel[132].addShapeBox(71F, -39F, -12F, 316, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[132].setRotationPoint(-132F, -52.5F, 6F);

		gunModel[133].addShapeBox(71F, -39F, -12F, 291, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[133].setRotationPoint(-107F, -50.5F, 4F);

		gunModel[134].addShapeBox(71F, -39F, -12F, 291, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[134].setRotationPoint(-107F, -50.5F, 18F);

		gunModel[135].addShapeBox(71F, -39F, -12F, 316, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[135].setRotationPoint(-132F, -54.5F, 3.5F);

		gunModel[136].addShapeBox(71F, -39F, -12F, 316, 1, 12, 0F,0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[136].setRotationPoint(-132F, -53.5F, 6F);

		gunModel[137].addShapeBox(71F, -39F, -12F, 316, 1, 17, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[137].setRotationPoint(-132F, -55.5F, 3.5F);

		gunModel[138].addShapeBox(71F, -39F, -12F, 2, 8, 16, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[138].setRotationPoint(-29F, 22F, 4F);

		gunModel[139].addShapeBox(71F, -39F, -12F, 30, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[139].setRotationPoint(-57F, 30F, 4F);

		gunModel[140].addShapeBox(71F, -39F, -12F, 4, 3, 16, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[140].setRotationPoint(-33F, 27F, 4F);

		gunModel[141].addShapeBox(71F, -39F, -12F, 6, 4, 16, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box0
		gunModel[141].setRotationPoint(-63F, 30F, 4F);

		gunModel[142].addShapeBox(71F, -39F, -12F, 46, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[142].setRotationPoint(221F, -26.5F, 8F);

		gunModel[143].addShapeBox(71F, -39F, -12F, 2, 8, 8, 0F,0F, 2F, 2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 2F, 2F); // Import Box0
		gunModel[143].setRotationPoint(219F, -26F, 8.5F);

		gunModel[144].addShapeBox(71F, -39F, -12F, 36, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[144].setRotationPoint(183F, -28F, 6.5F);

		gunModel[145].addShapeBox(71F, -39F, -12F, 8, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[145].setRotationPoint(239F, -27.5F, 7F);

		gunModel[146].addShapeBox(71F, -39F, -12F, 13, 11, 11, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[146].setRotationPoint(265F, -27.5F, 7F);

		gunModel[147].addShapeBox(71F, -39F, -12F, 6, 13, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[147].setRotationPoint(269.5F, -28.5F, 6F);

		gunModel[148].addShapeBox(71F, -39F, -12F, 27, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[148].setRotationPoint(278.5F, -28.5F, 6F);

		gunModel[149].addShapeBox(71F, -39F, -12F, 27, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[149].setRotationPoint(278.5F, -19.5F, 6F);

		gunModel[150].addShapeBox(71F, -39F, -12F, 27, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[150].setRotationPoint(278.5F, -23.5F, 6F);

		gunModel[151].addShapeBox(71F, -39F, -12F, 27, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[151].setRotationPoint(278.5F, -19.5F, 14F);

		gunModel[152].addShapeBox(71F, -39F, -12F, 27, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[152].setRotationPoint(278.5F, -28.5F, 14F);

		gunModel[153].addShapeBox(71F, -39F, -12F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[153].setRotationPoint(278.5F, -28.5F, 11F);

		gunModel[154].addShapeBox(71F, -39F, -12F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[154].setRotationPoint(278.5F, -25.5F, 6F);

		gunModel[155].addShapeBox(71F, -39F, -12F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[155].setRotationPoint(301.5F, -28.5F, 11F);

		gunModel[156].addShapeBox(71F, -39F, -12F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[156].setRotationPoint(301.5F, -25.5F, 6F);

		gunModel[157].addShapeBox(71F, -39F, -12F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[157].setRotationPoint(301.5F, -21.5F, 6F);

		gunModel[158].addShapeBox(71F, -39F, -12F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[158].setRotationPoint(301.5F, -19.5F, 11F);

		gunModel[159].addShapeBox(71F, -39F, -12F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[159].setRotationPoint(278.5F, -21.5F, 6F);

		gunModel[160].addShapeBox(71F, -39F, -12F, 23, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[160].setRotationPoint(183F, -41.5F, 7.5F);

		gunModel[161].addShapeBox(71F, -39F, -12F, 4, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[161].setRotationPoint(209F, -40.5F, 8.5F);

		gunModel[162].addShapeBox(71F, -39F, -12F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[162].setRotationPoint(213F, -38.5F, 10.5F);

		gunModel[163].addShapeBox(71F, -39F, -12F, 15, 17, 14, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[163].setRotationPoint(192F, -32F, 5.5F);

		gunModel[164].addShapeBox(71F, -39F, -12F, 2, 13, 14, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[164].setRotationPoint(207F, -28F, 5.5F);

		gunModel[165].addShapeBox(71F, -39F, -12F, 2, 1, 14, 0F,0F, 0F, 0.3F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[165].setRotationPoint(207F, -29F, 5.5F);

		gunModel[166].addShapeBox(71F, -39F, -12F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[166].setRotationPoint(192F, -15F, 9.5F);

		gunModel[167].addShapeBox(71F, -39F, -12F, 15, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[167].setRotationPoint(192F, -15F, 5.5F);

		gunModel[168].addShapeBox(71F, -39F, -12F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box0
		gunModel[168].setRotationPoint(192F, -15F, 15.5F);

		gunModel[169].addShapeBox(71F, -39F, -12F, 10, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[169].setRotationPoint(192F, -10F, 8F);

		gunModel[170].addShapeBox(71F, -39F, -12F, 4, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[170].setRotationPoint(204F, -10F, 8F);

		gunModel[171].addShapeBox(71F, -39F, -12F, 2, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[171].setRotationPoint(202F, -10F, 9.5F);

		gunModel[172].addShapeBox(71F, -39F, -12F, 13, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[172].setRotationPoint(196F, -39F, 5F);

		gunModel[173].addShapeBox(71F, -39F, -12F, 13, 2, 15, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[173].setRotationPoint(196F, -41F, 5F);

		gunModel[174].addShapeBox(71F, -39F, -12F, 13, 2, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box0
		gunModel[174].setRotationPoint(196F, -43F, 7F);

		gunModel[175].addShapeBox(71F, -39F, -12F, 4, 1, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[175].setRotationPoint(192F, -33F, 5F);

		gunModel[176].addShapeBox(71F, -39F, -12F, 3, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[176].setRotationPoint(194F, -22F, 5F);

		gunModel[177].addShapeBox(71F, -39F, -12F, 3, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[177].setRotationPoint(194F, -23F, 5F);

		gunModel[178].addShapeBox(71F, -39F, -12F, 3, 1, 15, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[178].setRotationPoint(194F, -24F, 5F);

		gunModel[179].addShapeBox(71F, -39F, -12F, 3, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[179].setRotationPoint(204F, -22F, 5F);

		gunModel[180].addShapeBox(71F, -39F, -12F, 3, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[180].setRotationPoint(204F, -23F, 5F);

		gunModel[181].addShapeBox(71F, -39F, -12F, 3, 1, 15, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[181].setRotationPoint(204F, -24F, 5F);

		gunModel[182].addShapeBox(71F, -39F, -12F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[182].setRotationPoint(278.5F, -19.5F, 11F);

		gunModel[183].addShapeBox(71F, -39F, -12F, 2, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[183].setRotationPoint(182F, -44.5F, 23.5F);

		gunModel[184].addShapeBox(71F, -39F, -12F, 2, 16, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import Box0
		gunModel[184].setRotationPoint(182F, -46.5F, 21.5F);

		gunModel[185].addShapeBox(71F, -39F, -12F, 2, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F); // Import Box0
		gunModel[185].setRotationPoint(182F, -48.5F, 21.5F);

		gunModel[186].addShapeBox(71F, -39F, -12F, 2, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Import Box0
		gunModel[186].setRotationPoint(182F, -46.5F, 25.5F);

		gunModel[187].addShapeBox(71F, -39F, -12F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[187].setRotationPoint(182F, -31.5F, 29.5F);

		gunModel[188].addShapeBox(71F, -39F, -12F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[188].setRotationPoint(182F, -30.5F, 29.5F);

		gunModel[189].addShapeBox(71F, -39F, -12F, 2, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[189].setRotationPoint(182F, -44.5F, 1.5F);

		gunModel[190].addShapeBox(71F, -39F, -12F, 2, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[190].setRotationPoint(182F, -42.5F, 1.5F);

		gunModel[191].addShapeBox(71F, -39F, -12F, 2, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[191].setRotationPoint(182F, -40.5F, -0.5F);

		gunModel[192].addShapeBox(71F, -39F, -12F, 2, 2, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[192].setRotationPoint(182F, -46.5F, 1.5F);

		gunModel[193].addShapeBox(71F, -39F, -12F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[193].setRotationPoint(182F, -48.5F, -2.5F);

		gunModel[194].addShapeBox(71F, -39F, -12F, 2, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[194].setRotationPoint(182F, -46.5F, -5F);

		gunModel[195].addShapeBox(71F, -39F, -12F, 2, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Import Box0
		gunModel[195].setRotationPoint(182F, -44.5F, -5F);

		gunModel[196].addShapeBox(71F, -39F, -12F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Import Box0
		gunModel[196].setRotationPoint(182F, -30.5F, -7.5F);

		gunModel[197].addShapeBox(71F, -39F, -12F, 2, 1, 1, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[197].setRotationPoint(182F, -29.5F, 25F);

		gunModel[198].addShapeBox(71F, -39F, -12F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[198].setRotationPoint(182F, -31.5F, -7.5F);

		gunModel[199].addShapeBox(71F, -39F, -12F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[199].setRotationPoint(182F, -29.5F, -2F);

		gunModel[200].addShapeBox(71F, -39F, -12F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box0
		gunModel[200].setRotationPoint(182F, -40.5F, -0.5F);

		gunModel[201].addShapeBox(71F, -39F, -12F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[201].setRotationPoint(182F, -48.5F, 2.5F);

		gunModel[202].addShapeBox(71F, -39F, -12F, 1, 15, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[202].setRotationPoint(183F, -29.5F, -6F);

		gunModel[203].addShapeBox(71F, -39F, -12F, 1, 15, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[203].setRotationPoint(183F, -29.5F, 26F);

		gunModel[204].addShapeBox(71F, -39F, -12F, 2, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[204].setRotationPoint(182F, -30.5F, 23.5F);

		gunModel[205].addShapeBox(71F, -39F, -12F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[205].setRotationPoint(182F, -48.5F, 20.5F);

		gunModel[206].addShapeBox(71F, -39F, -12F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F); // Import Box0
		gunModel[206].setRotationPoint(168F, -13.5F, 17F);

		gunModel[207].addShapeBox(71F, -39F, -12F, 2, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Import Box0
		gunModel[207].setRotationPoint(170F, -13.5F, 17F);

		gunModel[208].addShapeBox(71F, -39F, -12F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[208].setRotationPoint(172F, -13.5F, 17F);

		gunModel[209].addShapeBox(71F, -39F, -12F, 23, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[209].setRotationPoint(161F, -13.5F, 7F);

		gunModel[210].addShapeBox(71F, -39F, -12F, 130, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[210].setRotationPoint(54F, -7.5F, 7F);

		gunModel[211].addShapeBox(71F, -39F, -12F, 125, 1, 14, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[211].setRotationPoint(59F, -1.5F, 5F);

		gunModel[212].addShapeBox(71F, -39F, -12F, 125, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[212].setRotationPoint(59F, -3.5F, 3F);

		gunModel[213].addShapeBox(71F, -39F, -12F, 125, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Import Box0
		gunModel[213].setRotationPoint(59F, -4.5F, 7F);

		gunModel[214].addShapeBox(71F, -39F, -12F, 7, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[214].setRotationPoint(90F, -13.5F, 6.5F);

		gunModel[215].addShapeBox(71F, -39F, -12F, 6, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[215].setRotationPoint(68F, -13.5F, 6.5F);

		gunModel[216].addShapeBox(71F, -39F, -12F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[216].setRotationPoint(74F, -9.5F, 8F);

		gunModel[217].addShapeBox(71F, -39F, -12F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Import Box0
		gunModel[217].setRotationPoint(65F, -9.5F, 8F);

		gunModel[218].addShapeBox(71F, -39F, -12F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[218].setRotationPoint(92F, -10F, 6F);

		gunModel[219].addShapeBox(71F, -39F, -12F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[219].setRotationPoint(92F, -11F, 6F);

		gunModel[220].addShapeBox(71F, -39F, -12F, 3, 1, 12, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[220].setRotationPoint(92F, -12F, 6F);

		gunModel[221].addShapeBox(71F, -39F, -12F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[221].setRotationPoint(69.5F, -10F, 6F);

		gunModel[222].addShapeBox(71F, -39F, -12F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[222].setRotationPoint(69.5F, -11F, 6F);

		gunModel[223].addShapeBox(71F, -39F, -12F, 3, 1, 12, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[223].setRotationPoint(69.5F, -12F, 6F);

		gunModel[224].addShapeBox(71F, -39F, -12F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[224].setRotationPoint(165F, -10F, 6F);

		gunModel[225].addShapeBox(71F, -39F, -12F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[225].setRotationPoint(165F, -11F, 6F);

		gunModel[226].addShapeBox(71F, -39F, -12F, 3, 1, 12, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[226].setRotationPoint(165F, -12F, 6F);

		gunModel[227].addShapeBox(71F, -39F, -12F, 6, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[227].setRotationPoint(53F, -4.5F, 7F);

		gunModel[228].addShapeBox(71F, -39F, -12F, 4, 2, 3, 0F,-3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[228].setRotationPoint(46.5F, -0.5F, 0.5F);

		gunModel[229].addShapeBox(71F, -39F, -12F, 9, 3, 23, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[229].setRotationPoint(42F, -9.5F, 0.5F);

		gunModel[230].addShapeBox(71F, -39F, -12F, 9, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[230].setRotationPoint(42F, -6.5F, 0.5F);

		gunModel[231].addShapeBox(71F, -39F, -12F, 9, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box0
		gunModel[231].setRotationPoint(42F, -3.5F, 0.5F);

		gunModel[232].addShapeBox(71F, -39F, -12F, 2, 2, 23, 0F,-0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[232].setRotationPoint(50.5F, -2.5F, 0.5F);

		gunModel[233].addShapeBox(71F, -39F, -12F, 2, 1, 23, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[233].setRotationPoint(49F, -2.5F, 0.5F);

		gunModel[234].addShapeBox(71F, -39F, -12F, 2, 4, 23, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[234].setRotationPoint(52.5F, -7.5F, 0.5F);

		gunModel[235].addShapeBox(71F, -39F, -12F, 2, 1, 23, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1.5F, 0F, 0F); // Import Box0
		gunModel[235].setRotationPoint(52.5F, -3.5F, 0.5F);

		gunModel[236].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Import Box0
		gunModel[236].setRotationPoint(51.5F, -3.5F, 0.5F);

		gunModel[237].addShapeBox(71F, -39F, -12F, 2, 4, 23, 0F,-4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[237].setRotationPoint(38F, -11.5F, 0.5F);

		gunModel[238].addShapeBox(71F, -39F, -12F, 3, 2, 23, 0F,-1.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[238].setRotationPoint(41.5F, -9.5F, 0.5F);

		gunModel[239].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import Box0
		gunModel[239].setRotationPoint(51F, -7.5F, 0.5F);

		gunModel[240].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Import Box0
		gunModel[240].setRotationPoint(50F, -7.5F, 0.5F);

		gunModel[241].addShapeBox(71F, -39F, -12F, 9, 1, 23, 0F,-4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[241].setRotationPoint(41.5F, -12.5F, 0.5F);

		gunModel[242].addShapeBox(71F, -39F, -12F, 3, 2, 23, 0F,0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F); // Import Box0
		gunModel[242].setRotationPoint(48.5F, -9.5F, 0.5F);

		gunModel[243].addShapeBox(71F, -39F, -12F, 2, 4, 23, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[243].setRotationPoint(52.5F, -11.5F, 0.5F);

		gunModel[244].addShapeBox(71F, -39F, -12F, 2, 1, 23, 0F,0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, -1.9F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.9F, 0F, 0F); // Import Box0
		gunModel[244].setRotationPoint(47.5F, -11.5F, 0.5F);

		gunModel[245].addShapeBox(71F, -39F, -12F, 2, 1, 23, 0F,-1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, -0.1F, 0F, 0F); // Import Box0
		gunModel[245].setRotationPoint(43.5F, -11.5F, 0.5F);

		gunModel[246].addShapeBox(71F, -39F, -12F, 2, 4, 23, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[246].setRotationPoint(39.5F, -7.5F, 0.5F);

		gunModel[247].addShapeBox(71F, -39F, -12F, 6, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[247].setRotationPoint(43.5F, -6F, 0F);

		gunModel[248].addShapeBox(71F, -39F, -12F, 6, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[248].setRotationPoint(43.5F, -4F, 0F);

		gunModel[249].addShapeBox(71F, -39F, -12F, 6, 2, 24, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[249].setRotationPoint(43.5F, -8F, 0F);

		gunModel[250].addShapeBox(71F, -39F, -12F, 3, 24, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[250].setRotationPoint(39F, -7F, 2.5F);

		gunModel[251].addShapeBox(71F, -39F, -12F, 2, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[251].setRotationPoint(40F, -8F, 2.5F);

		gunModel[252].addShapeBox(71F, -39F, -12F, 11, 13, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[252].setRotationPoint(42F, -8F, 2.5F);

		gunModel[253].addShapeBox(71F, -39F, -12F, 9, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[253].setRotationPoint(42F, -11F, 2.5F);

		gunModel[254].addShapeBox(71F, -39F, -12F, 4, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[254].setRotationPoint(44.5F, -12F, 2.5F);

		gunModel[255].addShapeBox(71F, -39F, -12F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[255].setRotationPoint(42F, 16F, 5.5F);

		gunModel[256].addShapeBox(71F, -39F, -12F, 3, 7, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[256].setRotationPoint(41F, 9F, 5.5F);

		gunModel[257].addShapeBox(71F, -39F, -12F, 3, 1, 3, 0F,1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[257].setRotationPoint(41F, 8.5F, 5.5F);

		gunModel[258].addShapeBox(71F, -39F, -12F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[258].setRotationPoint(39F, 7.5F, 5.5F);

		gunModel[259].addShapeBox(71F, -39F, -12F, 4, 1, 3, 0F,0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[259].setRotationPoint(42F, 6.5F, 5.5F);

		gunModel[260].addShapeBox(71F, -39F, -12F, 5, 2, 3, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[260].setRotationPoint(42F, 4.5F, 5.5F);

		gunModel[261].addShapeBox(71F, -39F, -12F, 5, 1, 3, 0F,-1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[261].setRotationPoint(42F, 3.5F, 5.5F);

		gunModel[262].addShapeBox(71F, -39F, -12F, 5, 2, 3, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[262].setRotationPoint(43.5F, 1.5F, 5.5F);

		gunModel[263].addShapeBox(71F, -39F, -12F, 4, 2, 3, 0F,-3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[263].setRotationPoint(46.5F, -0.5F, 5.5F);

		gunModel[264].addShapeBox(71F, -39F, -12F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[264].setRotationPoint(42F, 16F, 10.5F);

		gunModel[265].addShapeBox(71F, -39F, -12F, 3, 7, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[265].setRotationPoint(41F, 9F, 10.5F);

		gunModel[266].addShapeBox(71F, -39F, -12F, 3, 1, 3, 0F,1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[266].setRotationPoint(41F, 8.5F, 10.5F);

		gunModel[267].addShapeBox(71F, -39F, -12F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[267].setRotationPoint(39F, 7.5F, 10.5F);

		gunModel[268].addShapeBox(71F, -39F, -12F, 4, 1, 3, 0F,0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[268].setRotationPoint(42F, 6.5F, 10.5F);

		gunModel[269].addShapeBox(71F, -39F, -12F, 5, 2, 3, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[269].setRotationPoint(42F, 4.5F, 10.5F);

		gunModel[270].addShapeBox(71F, -39F, -12F, 5, 1, 3, 0F,-1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[270].setRotationPoint(42F, 3.5F, 10.5F);

		gunModel[271].addShapeBox(71F, -39F, -12F, 5, 2, 3, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[271].setRotationPoint(43.5F, 1.5F, 10.5F);

		gunModel[272].addShapeBox(71F, -39F, -12F, 4, 2, 3, 0F,-3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[272].setRotationPoint(46.5F, -0.5F, 10.5F);

		gunModel[273].addShapeBox(71F, -39F, -12F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[273].setRotationPoint(42F, 16F, 15.5F);

		gunModel[274].addShapeBox(71F, -39F, -12F, 3, 7, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[274].setRotationPoint(41F, 9F, 15.5F);

		gunModel[275].addShapeBox(71F, -39F, -12F, 3, 1, 3, 0F,1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[275].setRotationPoint(41F, 8.5F, 15.5F);

		gunModel[276].addShapeBox(71F, -39F, -12F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[276].setRotationPoint(39F, 7.5F, 15.5F);

		gunModel[277].addShapeBox(71F, -39F, -12F, 4, 1, 3, 0F,0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[277].setRotationPoint(42F, 6.5F, 15.5F);

		gunModel[278].addShapeBox(71F, -39F, -12F, 5, 2, 3, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[278].setRotationPoint(42F, 4.5F, 15.5F);

		gunModel[279].addShapeBox(71F, -39F, -12F, 5, 1, 3, 0F,-1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[279].setRotationPoint(42F, 3.5F, 15.5F);

		gunModel[280].addShapeBox(71F, -39F, -12F, 5, 2, 3, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[280].setRotationPoint(43.5F, 1.5F, 15.5F);

		gunModel[281].addShapeBox(71F, -39F, -12F, 4, 2, 3, 0F,-3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[281].setRotationPoint(46.5F, -0.5F, 15.5F);

		gunModel[282].addShapeBox(71F, -39F, -12F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[282].setRotationPoint(42F, 16F, 20.5F);

		gunModel[283].addShapeBox(71F, -39F, -12F, 3, 7, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[283].setRotationPoint(41F, 9F, 20.5F);

		gunModel[284].addShapeBox(71F, -39F, -12F, 3, 1, 3, 0F,1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[284].setRotationPoint(41F, 8.5F, 20.5F);

		gunModel[285].addShapeBox(71F, -39F, -12F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[285].setRotationPoint(39F, 7.5F, 20.5F);

		gunModel[286].addShapeBox(71F, -39F, -12F, 4, 1, 3, 0F,0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[286].setRotationPoint(42F, 6.5F, 20.5F);

		gunModel[287].addShapeBox(71F, -39F, -12F, 5, 2, 3, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[287].setRotationPoint(42F, 4.5F, 20.5F);

		gunModel[288].addShapeBox(71F, -39F, -12F, 5, 1, 3, 0F,-1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[288].setRotationPoint(42F, 3.5F, 20.5F);

		gunModel[289].addShapeBox(71F, -39F, -12F, 5, 2, 3, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[289].setRotationPoint(43.5F, 1.5F, 20.5F);

		gunModel[290].addShapeBox(71F, -39F, -12F, 4, 2, 3, 0F,-3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[290].setRotationPoint(46.5F, -0.5F, 20.5F);

		gunModel[291].addShapeBox(71F, -39F, -12F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[291].setRotationPoint(42F, 16F, 18.5F);

		gunModel[292].addShapeBox(71F, -39F, -12F, 2, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[292].setRotationPoint(41F, 9F, 18.5F);

		gunModel[293].addShapeBox(71F, -39F, -12F, 2, 1, 2, 0F,1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[293].setRotationPoint(41F, 8.5F, 18.5F);

		gunModel[294].addShapeBox(71F, -39F, -12F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[294].setRotationPoint(39F, 7.5F, 18.5F);

		gunModel[295].addShapeBox(71F, -39F, -12F, 3, 1, 2, 0F,0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[295].setRotationPoint(42F, 6.5F, 18.5F);

		gunModel[296].addShapeBox(71F, -39F, -12F, 4, 2, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[296].setRotationPoint(42F, 4.5F, 18.5F);

		gunModel[297].addShapeBox(71F, -39F, -12F, 4, 1, 2, 0F,-1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[297].setRotationPoint(42F, 3.5F, 18.5F);

		gunModel[298].addShapeBox(71F, -39F, -12F, 4, 2, 2, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[298].setRotationPoint(43.5F, 1.5F, 18.5F);

		gunModel[299].addShapeBox(71F, -39F, -12F, 3, 2, 2, 0F,-3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[299].setRotationPoint(46.5F, -0.5F, 18.5F);

		gunModel[300].addShapeBox(71F, -39F, -12F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[300].setRotationPoint(42F, 16F, 13.5F);

		gunModel[301].addShapeBox(71F, -39F, -12F, 2, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[301].setRotationPoint(41F, 9F, 13.5F);

		gunModel[302].addShapeBox(71F, -39F, -12F, 2, 1, 2, 0F,1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[302].setRotationPoint(41F, 8.5F, 13.5F);

		gunModel[303].addShapeBox(71F, -39F, -12F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[303].setRotationPoint(39F, 7.5F, 13.5F);

		gunModel[304].addShapeBox(71F, -39F, -12F, 3, 1, 2, 0F,0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[304].setRotationPoint(42F, 6.5F, 13.5F);

		gunModel[305].addShapeBox(71F, -39F, -12F, 4, 2, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[305].setRotationPoint(42F, 4.5F, 13.5F);

		gunModel[306].addShapeBox(71F, -39F, -12F, 4, 1, 2, 0F,-1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[306].setRotationPoint(42F, 3.5F, 13.5F);

		gunModel[307].addShapeBox(71F, -39F, -12F, 4, 2, 2, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[307].setRotationPoint(43.5F, 1.5F, 13.5F);

		gunModel[308].addShapeBox(71F, -39F, -12F, 3, 2, 2, 0F,-3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[308].setRotationPoint(46.5F, -0.5F, 13.5F);

		gunModel[309].addShapeBox(71F, -39F, -12F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[309].setRotationPoint(42F, 16F, 8.5F);

		gunModel[310].addShapeBox(71F, -39F, -12F, 2, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[310].setRotationPoint(41F, 9F, 8.5F);

		gunModel[311].addShapeBox(71F, -39F, -12F, 2, 1, 2, 0F,1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[311].setRotationPoint(41F, 8.5F, 8.5F);

		gunModel[312].addShapeBox(71F, -39F, -12F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[312].setRotationPoint(39F, 7.5F, 8.5F);

		gunModel[313].addShapeBox(71F, -39F, -12F, 3, 1, 2, 0F,0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[313].setRotationPoint(42F, 6.5F, 8.5F);

		gunModel[314].addShapeBox(71F, -39F, -12F, 4, 2, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[314].setRotationPoint(42F, 4.5F, 8.5F);

		gunModel[315].addShapeBox(71F, -39F, -12F, 4, 1, 2, 0F,-1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[315].setRotationPoint(42F, 3.5F, 8.5F);

		gunModel[316].addShapeBox(71F, -39F, -12F, 4, 2, 2, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[316].setRotationPoint(43.5F, 1.5F, 8.5F);

		gunModel[317].addShapeBox(71F, -39F, -12F, 3, 2, 2, 0F,-3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[317].setRotationPoint(46.5F, -0.5F, 8.5F);

		gunModel[318].addShapeBox(71F, -39F, -12F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[318].setRotationPoint(42F, 16F, 3.5F);

		gunModel[319].addShapeBox(71F, -39F, -12F, 2, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[319].setRotationPoint(41F, 9F, 3.5F);

		gunModel[320].addShapeBox(71F, -39F, -12F, 2, 1, 2, 0F,1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[320].setRotationPoint(41F, 8.5F, 3.5F);

		gunModel[321].addShapeBox(71F, -39F, -12F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[321].setRotationPoint(39F, 7.5F, 3.5F);

		gunModel[322].addShapeBox(71F, -39F, -12F, 3, 1, 2, 0F,0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[322].setRotationPoint(42F, 6.5F, 3.5F);

		gunModel[323].addShapeBox(71F, -39F, -12F, 4, 2, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[323].setRotationPoint(42F, 4.5F, 3.5F);

		gunModel[324].addShapeBox(71F, -39F, -12F, 4, 1, 2, 0F,-1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[324].setRotationPoint(42F, 3.5F, 3.5F);

		gunModel[325].addShapeBox(71F, -39F, -12F, 4, 2, 2, 0F,-2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[325].setRotationPoint(43.5F, 1.5F, 3.5F);

		gunModel[326].addShapeBox(71F, -39F, -12F, 3, 2, 2, 0F,-3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[326].setRotationPoint(46.5F, -0.5F, 3.5F);

		gunModel[327].addShapeBox(71F, -39F, -12F, 45, 3, 23, 0F,0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[327].setRotationPoint(-9F, 31F, 0.5F);

		gunModel[328].addShapeBox(71F, -39F, -12F, 7, 17, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[328].setRotationPoint(-113F, -27F, 0F);

		gunModel[329].addShapeBox(71F, -39F, -12F, 3, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[329].setRotationPoint(-106F, -13F, 0F);

		gunModel[330].addShapeBox(71F, -39F, -12F, 1, 1, 24, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[330].setRotationPoint(-106F, -14.5F, 0F);

		gunModel[331].addShapeBox(71F, -39F, -12F, 1, 2, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[331].setRotationPoint(-53F, -8F, 0.5F);

		gunModel[332].addShapeBox(71F, -39F, -12F, 13, 7, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[332].setRotationPoint(-66F, -8F, 0.5F);

		gunModel[333].addShapeBox(71F, -39F, -12F, 4, 4, 16, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box0
		gunModel[333].setRotationPoint(-67F, 28.5F, 4F);

		gunModel[334].addShapeBox(71F, -39F, -12F, 4, 4, 16, 0F,-0.5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 3F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F); // Import Box0
		gunModel[334].setRotationPoint(-71F, 27F, 4F);

		gunModel[335].addShapeBox(71F, -39F, -12F, 15, 15, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F); // Import Box0
		gunModel[335].setRotationPoint(-81F, -8F, 0.5F);

		gunModel[336].addShapeBox(71F, -39F, -12F, 15, 10, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F); // Import Box0
		gunModel[336].setRotationPoint(-96F, -8F, 0.5F);

		gunModel[337].addShapeBox(71F, -39F, -12F, 7, 9, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[337].setRotationPoint(-103F, -8F, 0.5F);

		gunModel[338].addShapeBox(71F, -39F, -12F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[338].setRotationPoint(-58F, 7F, 8.5F);

		gunModel[339].addShapeBox(71F, -39F, -12F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[339].setRotationPoint(-50F, 7F, 8.5F);

		gunModel[340].addShapeBox(71F, -39F, -12F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[340].setRotationPoint(-49F, 7F, 8.5F);

		gunModel[341].addShapeBox(71F, -39F, -12F, 3, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[341].setRotationPoint(-53F, 11F, 8.5F);

		gunModel[342].addShapeBox(71F, -39F, -12F, 3, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[342].setRotationPoint(-53F, 18F, 8.5F);

		gunModel[343].addShapeBox(71F, -39F, -12F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Import Box0
		gunModel[343].setRotationPoint(-51F, 23F, 8.5F);

		gunModel[344].addShapeBox(71F, -39F, -12F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -3F, 0F, 0F); // Import Box0
		gunModel[344].setRotationPoint(-48F, 26F, 8.5F);

		gunModel[345].addShapeBox(71F, -39F, -12F, 6, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F); // Import Box0
		gunModel[345].setRotationPoint(-66F, 7F, 2F);

		gunModel[346].addShapeBox(71F, -39F, -12F, 6, 14, 20, 0F,1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, -2F, -10F, 0F, -2F, 10F, 0F, 0F); // Import Box0
		gunModel[346].setRotationPoint(-66F, 12F, 2F);

		gunModel[347].addShapeBox(71F, -39F, -12F, 6, 16, 20, 0F,1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, -2F, -10F, 0F, -2F, 10F, 0F, 0F); // Import Box0
		gunModel[347].setRotationPoint(-75F, 26F, 2F);

		gunModel[348].addShapeBox(71F, -39F, -12F, 6, 16, 20, 0F,1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, -2F, -8F, 0F, -2F, 8F, 0F, 0F); // Import Box0
		gunModel[348].setRotationPoint(-84F, 42F, 2F);

		gunModel[349].addShapeBox(71F, -39F, -12F, 6, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, -2F, 1.5F, 0F, 0F); // Import Box0
		gunModel[349].setRotationPoint(-92F, 58F, 2F);

		gunModel[350].addShapeBox(71F, -39F, -12F, 6, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box0
		gunModel[350].setRotationPoint(-93.5F, 63F, 2F);

		gunModel[351].addShapeBox(71F, -39F, -12F, 6, 12, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -2F, 3F, 0F, -2F, -3F, 0F, 0F); // Import Box0
		gunModel[351].setRotationPoint(-93.5F, 67F, 2F);

		gunModel[352].addShapeBox(71F, -39F, -12F, 31, 5, 20, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[352].setRotationPoint(-97F, 7F, 2F);

		gunModel[353].addShapeBox(71F, -39F, -12F, 5, 5, 20, 0F,1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F); // Import Box0
		gunModel[353].setRotationPoint(-104F, 7F, 2F);

		gunModel[354].addShapeBox(71F, -39F, -12F, 6, 7, 20, 0F,6.5F, -0.5F, -2F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 6.5F, -0.5F, -2F, -0.5F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, -2F); // Import Box0
		gunModel[354].setRotationPoint(-106F, 0F, 2F);

		gunModel[355].addShapeBox(71F, -39F, -12F, 30, 12, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -11F, 0F); // Import Box0
		gunModel[355].setRotationPoint(-123.5F, 67F, 2F);

		gunModel[356].addShapeBox(71F, -39F, -12F, 30, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[356].setRotationPoint(-123.5F, 64F, 2F);

		gunModel[357].addShapeBox(71F, -39F, -12F, 5, 4, 20, 0F,-0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F); // Import Box0
		gunModel[357].setRotationPoint(-128.5F, 63F, 2F);

		gunModel[358].addShapeBox(71F, -39F, -12F, 5, 8, 20, 0F,-3.5F, 0F, -2F, 3F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F); // Import Box0
		gunModel[358].setRotationPoint(-128.5F, 55F, 2F);

		gunModel[359].addShapeBox(71F, -39F, -12F, 5, 9, 20, 0F,-6F, 0F, -2F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F); // Import Box0
		gunModel[359].setRotationPoint(-125.5F, 46F, 2F);

		gunModel[360].addShapeBox(71F, -39F, -12F, 5, 9, 20, 0F,-7F, 0F, -2F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box0
		gunModel[360].setRotationPoint(-119.5F, 37F, 2F);

		gunModel[361].addShapeBox(71F, -39F, -12F, 5, 6, 20, 0F,-6F, 0F, -2F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box0
		gunModel[361].setRotationPoint(-112.5F, 31F, 2F);

		gunModel[362].addShapeBox(71F, -39F, -12F, 5, 8, 20, 0F,-4F, 0F, -2F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box0
		gunModel[362].setRotationPoint(-106.5F, 23F, 2F);

		gunModel[363].addShapeBox(71F, -39F, -12F, 5, 8, 20, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box0
		gunModel[363].setRotationPoint(-102.5F, 15F, 2F);

		gunModel[364].addShapeBox(71F, -39F, -12F, 5, 3, 20, 0F,0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box0
		gunModel[364].setRotationPoint(-102.5F, 12F, 2F);

		gunModel[365].addShapeBox(71F, -39F, -12F, 32, 7, 20, 0F,6.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 6.5F, -0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[365].setRotationPoint(-99.5F, 0F, 2F);

		gunModel[366].addShapeBox(71F, -39F, -12F, 29, 3, 20, 0F,0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[366].setRotationPoint(-97.5F, 12F, 2F);

		gunModel[367].addShapeBox(71F, -39F, -12F, 24, 8, 20, 0F,0F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[367].setRotationPoint(-97.5F, 15F, 2F);

		gunModel[368].addShapeBox(71F, -39F, -12F, 24, 3, 20, 0F,-2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[368].setRotationPoint(-99.5F, 23F, 2F);

		gunModel[369].addShapeBox(71F, -39F, -12F, 22, 3, 20, 0F,-2.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 1.85F, 0F, 0F, 1.85F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[369].setRotationPoint(-101.5F, 26F, 2F);

		gunModel[370].addShapeBox(71F, -39F, -12F, 30, 1, 20, 0F,-0.75F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.75F, 0F, 0F, -0.35F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.35F, 0F, 0F); // Import Box0
		gunModel[370].setRotationPoint(-123.5F, 61F, 2F);

		gunModel[371].addShapeBox(71F, -39F, -12F, 30, 1, 20, 0F,-0.85F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.85F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[371].setRotationPoint(-122.5F, 58F, 2F);

		gunModel[372].addShapeBox(71F, -39F, -12F, 30, 1, 20, 0F,-1F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.6F, 0F, 0F); // Import Box0
		gunModel[372].setRotationPoint(-121.5F, 55F, 2F);

		gunModel[373].addShapeBox(71F, -39F, -12F, 29, 1, 20, 0F,-1F, 0F, 0F, 1.15F, 0F, 0F, 1.15F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.35F, 0F, 0F); // Import Box0
		gunModel[373].setRotationPoint(-119.5F, 52F, 2F);

		gunModel[374].addShapeBox(71F, -39F, -12F, 28, 1, 20, 0F,-1F, 0F, 0F, 1.45F, 0F, 0F, 1.45F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.3F, 0F, 0F); // Import Box0
		gunModel[374].setRotationPoint(-117.5F, 49F, 2F);

		gunModel[375].addShapeBox(71F, -39F, -12F, 27, 1, 20, 0F,-1F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F); // Import Box0
		gunModel[375].setRotationPoint(-115.5F, 46F, 2F);

		gunModel[376].addShapeBox(71F, -39F, -12F, 26, 1, 20, 0F,-1.35F, 0F, 0F, 2.05F, 0F, 0F, 2.05F, 0F, 0F, -1.35F, 0F, 0F, -0.55F, 0F, 0F, 1.65F, 0F, 0F, 1.65F, 0F, 0F, -0.55F, 0F, 0F); // Import Box0
		gunModel[376].setRotationPoint(-113.5F, 43F, 2F);

		gunModel[377].addShapeBox(71F, -39F, -12F, 26, 1, 20, 0F,-1.65F, 0F, 0F, 1.65F, 0F, 0F, 1.65F, 0F, 0F, -1.65F, 0F, 0F, -0.9F, 0F, 0F, 1.1F, 0F, 0F, 1.1F, 0F, 0F, -0.9F, 0F, 0F); // Import Box0
		gunModel[377].setRotationPoint(-111.5F, 40F, 2F);

		gunModel[378].addShapeBox(71F, -39F, -12F, 26, 1, 20, 0F,-2F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, -2F, 0F, 0F, -1.2F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.2F, 0F, 0F); // Import Box0
		gunModel[378].setRotationPoint(-109.5F, 37F, 2F);

		gunModel[379].addShapeBox(71F, -39F, -12F, 25, 1, 20, 0F,-2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[379].setRotationPoint(-106.5F, 34F, 2F);

		gunModel[380].addShapeBox(71F, -39F, -12F, 25, 1, 20, 0F,-3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[380].setRotationPoint(-104.5F, 31F, 2F);

		gunModel[381].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-2.5F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, -1.5F, 0F, 0F); // Import Box0
		gunModel[381].setRotationPoint(-82.5F, 29F, 2F);

		gunModel[382].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-2.75F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -2.75F, 0F, 0F, -1.75F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, -1.75F, 0F, 0F); // Import Box0
		gunModel[382].setRotationPoint(-84.2F, 32F, 2F);

		gunModel[383].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-2.75F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -2.75F, 0F, 0F, -1.75F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, -1.75F, 0F, 0F); // Import Box0
		gunModel[383].setRotationPoint(-85.9F, 35F, 2F);

		gunModel[384].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-3F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[384].setRotationPoint(-87.6F, 38F, 2F);

		gunModel[385].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-3F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[385].setRotationPoint(-89.15F, 41F, 2F);

		gunModel[386].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-3F, 0F, 0F, 2.8F, 0F, 0F, 2.8F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[386].setRotationPoint(-90.65F, 44F, 2F);

		gunModel[387].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-3F, 0F, 0F, 2.8F, 0F, 0F, 2.8F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[387].setRotationPoint(-91.95F, 47F, 2F);

		gunModel[388].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-3F, 0F, 0F, 2.8F, 0F, 0F, 2.8F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[388].setRotationPoint(-93.3F, 50F, 2F);

		gunModel[389].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-3F, 0F, 0F, 2.8F, 0F, 0F, 2.8F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[389].setRotationPoint(-94.55F, 53F, 2F);

		gunModel[390].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-3F, 0F, 0F, 2.8F, 0F, 0F, 2.8F, 0F, 0F, -3F, 0F, 0F, -2.15F, 0F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, 0F, -2.15F, 0F, 0F); // Import Box0
		gunModel[390].setRotationPoint(-95.9F, 56F, 2F);

		gunModel[391].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-3F, 0F, 0F, 2.6F, 0F, 0F, 2.6F, 0F, 0F, -3F, 0F, 0F, -2.15F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.15F, 0F, 0F); // Import Box0
		gunModel[391].setRotationPoint(-96.9F, 59F, 2F);

		gunModel[392].addShapeBox(71F, -39F, -12F, 2, 1, 20, 0F,-3F, 0F, 0F, 2.6F, 0F, 0F, 2.6F, 0F, 0F, -3F, 0F, 0F, -2.7F, 0F, 0F, 2.3F, 0F, 0F, 2.3F, 0F, 0F, -2.7F, 0F, 0F); // Import Box0
		gunModel[392].setRotationPoint(-97.8F, 62F, 2F);

		gunModel[393].addShapeBox(71F, -39F, -12F, 2, 1, 20, 0F,-2.7F, 0F, 0F, 2.3F, 0F, 0F, 2.3F, 0F, 0F, -2.7F, 0F, 0F, -2.4F, 0F, 0F, 2.3F, 0F, 0F, 2.3F, 0F, 0F, -2.4F, 0F, 0F); // Import Box0
		gunModel[393].setRotationPoint(-97.8F, 63F, 2F);

		gunModel[394].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-2.5F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, -1.5F, 0F, 0F); // Import Box0
		gunModel[394].setRotationPoint(-103F, 29F, 2F);

		gunModel[395].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-2.5F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[395].setRotationPoint(-105F, 32F, 2F);

		gunModel[396].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-2.5F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[396].setRotationPoint(-108F, 35F, 2F);

		gunModel[397].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-2.45F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -2.45F, 0F, 0F, -0.9F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, -0.9F, 0F, 0F); // Import Box0
		gunModel[397].setRotationPoint(-110.75F, 38F, 2F);

		gunModel[398].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-2.45F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -2.45F, 0F, 0F, -0.9F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, -0.9F, 0F, 0F); // Import Box0
		gunModel[398].setRotationPoint(-113.05F, 41F, 2F);

		gunModel[399].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-2.45F, 0F, 0F, 2.85F, 0F, 0F, 2.85F, 0F, 0F, -2.45F, 0F, 0F, -0.9F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, -0.9F, 0F, 0F); // Import Box0
		gunModel[399].setRotationPoint(-115.4F, 44F, 2F);

		gunModel[400].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-2.25F, 0F, 0F, 2.7F, 0F, 0F, 2.7F, 0F, 0F, -2.25F, 0F, 0F, -0.9F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, -0.9F, 0F, 0F); // Import Box0
		gunModel[400].setRotationPoint(-117.4F, 47F, 2F);

		gunModel[401].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-2.25F, 0F, 0F, 2.7F, 0F, 0F, 2.7F, 0F, 0F, -2.25F, 0F, 0F, -0.9F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, -0.9F, 0F, 0F); // Import Box0
		gunModel[401].setRotationPoint(-119.4F, 50F, 2F);

		gunModel[402].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-2.25F, 0F, 0F, 2.7F, 0F, 0F, 2.7F, 0F, 0F, -2.25F, 0F, 0F, -0.9F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, -0.9F, 0F, 0F); // Import Box0
		gunModel[402].setRotationPoint(-121.4F, 53F, 2F);

		gunModel[403].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-1.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, 0F); // Import Box0
		gunModel[403].setRotationPoint(-122.4F, 56F, 2F);

		gunModel[404].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,-1.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, 0F); // Import Box0
		gunModel[404].setRotationPoint(-123.5F, 59F, 2F);

		gunModel[405].addShapeBox(71F, -39F, -12F, 2, 1, 20, 0F,-1.4F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, -1.4F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[405].setRotationPoint(-124.5F, 62F, 2F);

		gunModel[406].addShapeBox(71F, -39F, -12F, 2, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[406].setRotationPoint(-123.5F, 63F, 2F);

		gunModel[407].addShapeBox(71F, -39F, -12F, 31, 12, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[407].setRotationPoint(-122.5F, 52F, 4F);

		gunModel[408].addShapeBox(71F, -39F, -12F, 32, 12, 16, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[408].setRotationPoint(-116.5F, 40F, 4F);

		gunModel[409].addShapeBox(71F, -39F, -12F, 28, 12, 16, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[409].setRotationPoint(-107.5F, 28F, 4F);

		gunModel[410].addShapeBox(71F, -39F, -12F, 6, 11, 16, 0F,-5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 2F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[410].setRotationPoint(-76.5F, 24F, 4F);

		gunModel[411].addShapeBox(71F, -39F, -12F, 12, 10, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -11F, 0.5F, 0F, -11F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[411].setRotationPoint(-116F, -9.5F, 0F);

		gunModel[412].addShapeBox(71F, -39F, -12F, 12, 10, 22, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0.5F, 0F, -11F, 0.5F, 0F, -11F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[412].setRotationPoint(-115F, -9.5F, 1F);

		gunModel[413].addShapeBox(71F, -39F, -12F, 9, 10, 23, 0F,-8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, 0F, 0F, 1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Import Box0
		gunModel[413].setRotationPoint(-112F, -9F, 0.5F);

		gunModel[414].addShapeBox(71F, -39F, -12F, 22, 15, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[414].setRotationPoint(-132F, -47.5F, 2F);

		gunModel[415].addShapeBox(71F, -39F, -12F, 22, 2, 20, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[415].setRotationPoint(-132F, -49.5F, 2F);

		gunModel[416].addShapeBox(71F, -39F, -12F, 22, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[416].setRotationPoint(-132F, -50.5F, 4F);

		gunModel[417].addShapeBox(71F, -39F, -12F, 22, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[417].setRotationPoint(-132F, -50.5F, 18F);

		gunModel[418].addShapeBox(71F, -39F, -12F, 18, 5, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[418].setRotationPoint(-134F, -4.5F, 0F);

		gunModel[419].addShapeBox(71F, -39F, -12F, 6, 25, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[419].setRotationPoint(-134F, -29.5F, 0F);

		gunModel[420].addShapeBox(71F, -39F, -12F, 6, 3, 24, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[420].setRotationPoint(-134F, -32.5F, 0F);

		gunModel[421].addShapeBox(71F, -39F, -12F, 3, 3, 24, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[421].setRotationPoint(-113F, -32.5F, 0F);

		gunModel[422].addShapeBox(71F, -39F, -12F, 3, 1, 24, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[422].setRotationPoint(-110F, -30.5F, 0F);

		gunModel[423].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,-1F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Import Box0
		gunModel[423].setRotationPoint(-108F, -31F, 0.5F);

		gunModel[424].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,0F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, -1F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Import Box0
		gunModel[424].setRotationPoint(-110F, -31F, 0.5F);

		gunModel[425].addShapeBox(71F, -39F, -12F, 3, 17, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[425].setRotationPoint(-110F, -47.5F, 3.5F);

		gunModel[426].addShapeBox(71F, -39F, -12F, 3, 2, 17, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[426].setRotationPoint(-110F, -49.5F, 3.5F);

		gunModel[427].addShapeBox(71F, -39F, -12F, 9, 3, 24, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import Box0
		gunModel[427].setRotationPoint(-125F, -32.5F, 0F);

		gunModel[428].addShapeBox(71F, -39F, -12F, 3, 20, 24, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box0
		gunModel[428].setRotationPoint(-128F, -29.5F, 0F);

		gunModel[429].addShapeBox(71F, -39F, -12F, 3, 3, 24, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box0
		gunModel[429].setRotationPoint(-128F, -32.5F, 0F);

		gunModel[430].addShapeBox(71F, -39F, -12F, 3, 3, 24, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import Box0
		gunModel[430].setRotationPoint(-116F, -32.5F, 0F);

		gunModel[431].addShapeBox(71F, -39F, -12F, 3, 20, 24, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import Box0
		gunModel[431].setRotationPoint(-116F, -29.5F, 0F);

		gunModel[432].addShapeBox(71F, -39F, -12F, 9, 3, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[432].setRotationPoint(-125F, -29.5F, -2F);

		gunModel[433].addShapeBox(71F, -39F, -12F, 1, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[433].setRotationPoint(-117F, -26.5F, -2F);

		gunModel[434].addShapeBox(71F, -39F, -12F, 1, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[434].setRotationPoint(-125F, -26.5F, -2F);

		gunModel[435].addShapeBox(71F, -39F, -12F, 9, 17, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[435].setRotationPoint(-125F, -27F, 0F);

		gunModel[436].addShapeBox(71F, -39F, -12F, 12, 5, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[436].setRotationPoint(-128F, -9.5F, 0F);

		gunModel[437].addShapeBox(71F, -39F, -12F, 6, 2, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[437].setRotationPoint(-123.5F, -11F, -1F);

		gunModel[438].addShapeBox(71F, -39F, -12F, 6, 2, 26, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[438].setRotationPoint(-123.5F, -15F, -1F);

		gunModel[439].addShapeBox(71F, -39F, -12F, 6, 2, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[439].setRotationPoint(-123.5F, -13F, -1F);

		gunModel[440].addShapeBox(71F, -39F, -12F, 3, 34, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[440].setRotationPoint(-137F, -32.5F, 0F);

		gunModel[441].addShapeBox(71F, -39F, -12F, 3, 34, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[441].setRotationPoint(-143F, -32.5F, 0F);

		gunModel[442].addShapeBox(71F, -39F, -12F, 3, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[442].setRotationPoint(-140F, -2.5F, 0F);

		gunModel[443].addShapeBox(71F, -39F, -12F, 4, 11, 24, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[443].setRotationPoint(-138F, -46.5F, 0F);

		gunModel[444].addShapeBox(71F, -39F, -12F, 4, 3, 14, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[444].setRotationPoint(-138F, -49.5F, 5F);

		gunModel[445].addShapeBox(71F, -39F, -12F, 4, 34, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[445].setRotationPoint(-151F, -32.5F, 0F);

		gunModel[446].addShapeBox(71F, -39F, -12F, 4, 9, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[446].setRotationPoint(-147F, -7.5F, 0F);

		gunModel[447].addShapeBox(71F, -39F, -12F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[447].setRotationPoint(-140F, -42.5F, 7F);

		gunModel[448].addShapeBox(71F, -39F, -12F, 2, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[448].setRotationPoint(-140F, -45.5F, 7F);

		gunModel[449].addShapeBox(71F, -39F, -12F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[449].setRotationPoint(-140F, -44.5F, 7F);

		gunModel[450].addShapeBox(71F, -39F, -12F, 4, 7, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[450].setRotationPoint(-147F, -32.5F, 0F);

		gunModel[451].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[451].setRotationPoint(-147F, -26F, 1F);

		gunModel[452].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[452].setRotationPoint(-147F, -8.5F, 1F);

		gunModel[453].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[453].setRotationPoint(-144F, -8.5F, 1F);

		gunModel[454].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[454].setRotationPoint(-144F, -26F, 1F);

		gunModel[455].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[455].setRotationPoint(-140F, -3.5F, 1F);

		gunModel[456].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[456].setRotationPoint(-138F, -3.5F, 1F);

		gunModel[457].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[457].setRotationPoint(-140F, -32.5F, 1F);

		gunModel[458].addShapeBox(71F, -39F, -12F, 1, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[458].setRotationPoint(-138F, -32.5F, 1F);

		gunModel[459].addShapeBox(71F, -39F, -12F, 11, 5, 24, 0F,0F, -2F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -2F, -4F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Import Box0
		gunModel[459].setRotationPoint(-172F, -36.5F, 0F);

		gunModel[460].addShapeBox(71F, -39F, -12F, 17, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[460].setRotationPoint(-151F, -36F, 0F);

		gunModel[461].addShapeBox(71F, -39F, -12F, 3, 2, 24, 0F,-3F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -3F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[461].setRotationPoint(-142F, -37.5F, 0F);

		gunModel[462].addShapeBox(71F, -39F, -12F, 1, 3, 24, 0F,0F, -1F, -0.9F, 0F, 1F, -1.7F, 0F, 1F, -1.7F, 0F, -1F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[462].setRotationPoint(-139F, -38.5F, 0F);

		gunModel[463].addShapeBox(71F, -39F, -12F, 54, 5, 24, 0F,0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, 3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3.5F, 0F); // Import Box0
		gunModel[463].setRotationPoint(-239F, -33.5F, 0F);

		gunModel[464].addShapeBox(71F, -39F, -12F, 23, 5, 24, 0F,0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F); // Import Box0
		gunModel[464].setRotationPoint(-262F, -29.5F, 0F);

		gunModel[465].addShapeBox(71F, -39F, -12F, 8, 5, 24, 0F,-2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -2F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[465].setRotationPoint(-296F, -27.5F, 0F);

		gunModel[466].addShapeBox(71F, -39F, -12F, 10, 5, 24, 0F,0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[466].setRotationPoint(-161F, -36.5F, 0F);

		gunModel[467].addShapeBox(71F, -39F, -12F, 10, 34, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[467].setRotationPoint(-147F, -32.5F, 1F);

		gunModel[468].addShapeBox(71F, -39F, -12F, 54, 5, 24, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Box0
		gunModel[468].setRotationPoint(-239F, -29F, 0F);

		gunModel[469].addShapeBox(71F, -39F, -12F, 27, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[469].setRotationPoint(278.5F, -23.5F, 14F);

		gunModel[470].addShapeBox(71F, -39F, -12F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[470].setRotationPoint(301.5F, -23.5F, 11F);

		gunModel[471].addShapeBox(71F, -39F, -12F, 57, 5, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[471].setRotationPoint(-253F, -23F, 0F);

		gunModel[472].addShapeBox(71F, -39F, -12F, 14, 3, 24, 0F,0F, -3.15F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3.15F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Box0
		gunModel[472].setRotationPoint(-253F, -27F, 0F);

		gunModel[473].addShapeBox(71F, -39F, -12F, 15, 5, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F); // Import Box0
		gunModel[473].setRotationPoint(-276F, -23F, 0F);

		gunModel[474].addShapeBox(71F, -39F, -12F, 8, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F); // Import Box0
		gunModel[474].setRotationPoint(-261F, -23F, 0F);

		gunModel[475].addShapeBox(71F, -39F, -12F, 3, 6, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F); // Import Box0
		gunModel[475].setRotationPoint(-279F, -23F, 0F);

		gunModel[476].addShapeBox(71F, -39F, -12F, 3, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box0
		gunModel[476].setRotationPoint(-282F, -23F, 0F);

		gunModel[477].addShapeBox(71F, -39F, -12F, 9, 1, 24, 0F,0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[477].setRotationPoint(-262F, -24F, 0F);

		gunModel[478].addShapeBox(71F, -39F, -12F, 17, 3, 14, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F); // Import Box0
		gunModel[478].setRotationPoint(-257F, -18F, 5F);

		gunModel[479].addShapeBox(71F, -39F, -12F, 6, 12, 24, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[479].setRotationPoint(-287F, -23F, 0F);

		gunModel[480].addShapeBox(71F, -39F, -12F, 9, 7, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[480].setRotationPoint(-296F, -23F, 0F);

		gunModel[481].addShapeBox(71F, -39F, -12F, 26, 5, 24, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[481].setRotationPoint(-288F, -27.5F, 0F);

		gunModel[482].addShapeBox(71F, -39F, -12F, 5, 35, 24, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F); // Import Box0
		gunModel[482].setRotationPoint(-296F, -16F, 0F);

		gunModel[483].addShapeBox(71F, -39F, -12F, 5, 35, 24, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F); // Import Box0
		gunModel[483].setRotationPoint(-292F, 19F, 0F);

		gunModel[484].addShapeBox(71F, -39F, -12F, 12, 2, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F); // Import Box0
		gunModel[484].setRotationPoint(-255F, -15F, 5F);

		gunModel[485].addShapeBox(71F, -39F, -12F, 10, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[485].setRotationPoint(-253.5F, -13F, 5F);

		gunModel[486].addShapeBox(71F, -39F, -12F, 10, 2, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[486].setRotationPoint(-253.5F, -11F, 5F);

		gunModel[487].addShapeBox(71F, -39F, -12F, 10, 3, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[487].setRotationPoint(-253.5F, -9F, 5F);

		gunModel[488].addShapeBox(71F, -39F, -12F, 14, 6, 14, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 2F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 1.5F, 0F); // Import Box0
		gunModel[488].setRotationPoint(-253.5F, -6F, 5F);

		gunModel[489].addShapeBox(71F, -39F, -12F, 14, 2, 14, 0F,1.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F); // Import Box0
		gunModel[489].setRotationPoint(-229F, -20F, 5F);

		gunModel[490].addShapeBox(71F, -39F, -12F, 9, 2, 14, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[490].setRotationPoint(-227F, -18F, 5F);

		gunModel[491].addShapeBox(71F, -39F, -12F, 7, 2, 14, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[491].setRotationPoint(-225.5F, -16F, 5F);

		gunModel[492].addShapeBox(71F, -39F, -12F, 7, 2, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[492].setRotationPoint(-225.5F, -14F, 5F);

		gunModel[493].addShapeBox(71F, -39F, -12F, 7, 3, 14, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[493].setRotationPoint(-225.5F, -12F, 5F);

		gunModel[494].addShapeBox(71F, -39F, -12F, 11, 2, 14, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 1F, 2F, 0F); // Import Box0
		gunModel[494].setRotationPoint(-225.5F, -9F, 5F);

		gunModel[495].addShapeBox(71F, -39F, -12F, 61, 10, 20, 0F,0F, -1F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 3F, 0F); // Import Box0
		gunModel[495].setRotationPoint(-255F, 0F, 2F);

		gunModel[496].addShapeBox(71F, -39F, -12F, 7, 12, 20, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Import Box0
		gunModel[496].setRotationPoint(-262F, 1F, 2F);

		gunModel[497].addShapeBox(71F, -39F, -12F, 7, 12, 20, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 16F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 16F, 0F); // Import Box0
		gunModel[497].setRotationPoint(-269F, 4F, 2F);

		gunModel[498].addShapeBox(71F, -39F, -12F, 3, 21, 20, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 23F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 23F, 0F); // Import Box0
		gunModel[498].setRotationPoint(-272F, 9F, 2F);

		gunModel[499].addShapeBox(71F, -39F, -12F, 4, 21, 20, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 13F, 0F); // Import Box0
		gunModel[499].setRotationPoint(-276F, 12F, 2F);
	}

	private void initgunModel_2()
	{
		gunModel[500] = new ModelRendererTurbo(this, 265, 761, textureX, textureY); // Import Box0
		gunModel[501] = new ModelRendererTurbo(this, 761, 761, textureX, textureY); // Import Box0
		gunModel[502] = new ModelRendererTurbo(this, 817, 761, textureX, textureY); // Import Box0
		gunModel[503] = new ModelRendererTurbo(this, 89, 769, textureX, textureY); // Import Box0
		gunModel[504] = new ModelRendererTurbo(this, 137, 769, textureX, textureY); // Import Box0
		gunModel[505] = new ModelRendererTurbo(this, 201, 769, textureX, textureY); // Import Box0
		gunModel[506] = new ModelRendererTurbo(this, 865, 769, textureX, textureY); // Import Box0
		gunModel[507] = new ModelRendererTurbo(this, 897, 769, textureX, textureY); // Import Box0
		gunModel[508] = new ModelRendererTurbo(this, 1, 777, textureX, textureY); // Import Box0
		gunModel[509] = new ModelRendererTurbo(this, 369, 777, textureX, textureY); // Import Box0
		gunModel[510] = new ModelRendererTurbo(this, 225, 785, textureX, textureY); // Import Box0
		gunModel[511] = new ModelRendererTurbo(this, 177, 785, textureX, textureY); // Import Box0
		gunModel[512] = new ModelRendererTurbo(this, 457, 793, textureX, textureY); // Import Box0
		gunModel[513] = new ModelRendererTurbo(this, 521, 793, textureX, textureY); // Import Box0
		gunModel[514] = new ModelRendererTurbo(this, 585, 793, textureX, textureY); // Import Box0
		gunModel[515] = new ModelRendererTurbo(this, 225, 649, textureX, textureY); // Import Box0
		gunModel[516] = new ModelRendererTurbo(this, 281, 793, textureX, textureY); // Import Box0
		gunModel[517] = new ModelRendererTurbo(this, 825, 657, textureX, textureY); // Import Box0
		gunModel[518] = new ModelRendererTurbo(this, 673, 793, textureX, textureY); // Import Box0
		gunModel[519] = new ModelRendererTurbo(this, 841, 793, textureX, textureY); // Import Box0
		gunModel[520] = new ModelRendererTurbo(this, 41, 801, textureX, textureY); // Import Box0
		gunModel[521] = new ModelRendererTurbo(this, 113, 801, textureX, textureY); // Import Box0
		gunModel[522] = new ModelRendererTurbo(this, 945, 801, textureX, textureY); // Import Box0
		gunModel[523] = new ModelRendererTurbo(this, 193, 801, textureX, textureY); // Import Box0
		gunModel[524] = new ModelRendererTurbo(this, 329, 801, textureX, textureY); // Import Box0
		gunModel[525] = new ModelRendererTurbo(this, 705, 689, textureX, textureY); // Import Box0
		gunModel[526] = new ModelRendererTurbo(this, 521, 721, textureX, textureY); // Import Box0
		gunModel[527] = new ModelRendererTurbo(this, 257, 729, textureX, textureY); // Import Box0
		gunModel[528] = new ModelRendererTurbo(this, 793, 761, textureX, textureY); // Import Box0
		gunModel[529] = new ModelRendererTurbo(this, 577, 721, textureX, textureY); // Import Box0
		gunModel[530] = new ModelRendererTurbo(this, 385, 809, textureX, textureY); // Import Box0
		gunModel[531] = new ModelRendererTurbo(this, 193, 433, textureX, textureY); // Import Box0
		gunModel[532] = new ModelRendererTurbo(this, 121, 481, textureX, textureY); // Import Box0
		gunModel[533] = new ModelRendererTurbo(this, 721, 801, textureX, textureY); // Import Box0
		gunModel[534] = new ModelRendererTurbo(this, 1, 817, textureX, textureY); // Import Box0
		gunModel[535] = new ModelRendererTurbo(this, 521, 817, textureX, textureY); // Import Box0
		gunModel[536] = new ModelRendererTurbo(this, 161, 817, textureX, textureY); // Import Box0
		gunModel[537] = new ModelRendererTurbo(this, 793, 817, textureX, textureY); // Import Box0
		gunModel[538] = new ModelRendererTurbo(this, 881, 817, textureX, textureY); // Import Box0
		gunModel[539] = new ModelRendererTurbo(this, 225, 825, textureX, textureY); // Import Box0
		gunModel[540] = new ModelRendererTurbo(this, 425, 817, textureX, textureY); // Import Box0
		gunModel[541] = new ModelRendererTurbo(this, 289, 825, textureX, textureY); // Import Box0
		gunModel[542] = new ModelRendererTurbo(this, 457, 825, textureX, textureY); // Import Box0
		gunModel[543] = new ModelRendererTurbo(this, 561, 825, textureX, textureY); // Import Box0
		gunModel[544] = new ModelRendererTurbo(this, 617, 825, textureX, textureY); // Import Box0
		gunModel[545] = new ModelRendererTurbo(this, 833, 825, textureX, textureY); // Import Box0
		gunModel[546] = new ModelRendererTurbo(this, 921, 825, textureX, textureY); // Import Box0
		gunModel[547] = new ModelRendererTurbo(this, 65, 833, textureX, textureY); // Import Box0
		gunModel[548] = new ModelRendererTurbo(this, 121, 833, textureX, textureY); // Import Box0
		gunModel[549] = new ModelRendererTurbo(this, 321, 833, textureX, textureY); // Import Box0
		gunModel[550] = new ModelRendererTurbo(this, 649, 833, textureX, textureY); // Import Box0
		gunModel[551] = new ModelRendererTurbo(this, 977, 825, textureX, textureY); // Import Box0
		gunModel[552] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Import Box0
		gunModel[553] = new ModelRendererTurbo(this, 177, 849, textureX, textureY); // Import Box0
		gunModel[554] = new ModelRendererTurbo(this, 385, 849, textureX, textureY); // Import Box0
		gunModel[555] = new ModelRendererTurbo(this, 497, 849, textureX, textureY); // Import Box0
		gunModel[556] = new ModelRendererTurbo(this, 649, 793, textureX, textureY); // Import Box0
		gunModel[557] = new ModelRendererTurbo(this, 89, 801, textureX, textureY); // Import Box0
		gunModel[558] = new ModelRendererTurbo(this, 265, 825, textureX, textureY); // Import Box0
		gunModel[559] = new ModelRendererTurbo(this, 33, 505, textureX, textureY); // Import Box0
		gunModel[560] = new ModelRendererTurbo(this, 769, 849, textureX, textureY); // Import Box0
		gunModel[561] = new ModelRendererTurbo(this, 1009, 329, textureX, textureY); // Import Box0
		gunModel[562] = new ModelRendererTurbo(this, 1001, 361, textureX, textureY); // Import Box0
		gunModel[563] = new ModelRendererTurbo(this, 593, 825, textureX, textureY); // Import Box0
		gunModel[564] = new ModelRendererTurbo(this, 297, 385, textureX, textureY); // Import Box0
		gunModel[565] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Import Box0
		gunModel[566] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Import Box0
		gunModel[567] = new ModelRendererTurbo(this, 721, 121, textureX, textureY); // Import Box0
		gunModel[568] = new ModelRendererTurbo(this, 929, 121, textureX, textureY); // Import Box0
		gunModel[569] = new ModelRendererTurbo(this, 425, 849, textureX, textureY); // Import Box0
		gunModel[570] = new ModelRendererTurbo(this, 265, 849, textureX, textureY); // Import Box0
		gunModel[571] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Import Box0
		gunModel[572] = new ModelRendererTurbo(this, 401, 385, textureX, textureY); // Import Box0
		gunModel[573] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Import Box0
		gunModel[574] = new ModelRendererTurbo(this, 329, 385, textureX, textureY); // Import Box0
		gunModel[575] = new ModelRendererTurbo(this, 993, 153, textureX, textureY); // Import Box0
		gunModel[576] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Import Box0
		gunModel[577] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Import Box0
		gunModel[578] = new ModelRendererTurbo(this, 913, 257, textureX, textureY); // Import Box0
		gunModel[579] = new ModelRendererTurbo(this, 601, 305, textureX, textureY); // Import Box0
		gunModel[580] = new ModelRendererTurbo(this, 633, 209, textureX, textureY); // Import Box0
		gunModel[581] = new ModelRendererTurbo(this, 1009, 209, textureX, textureY); // Import Box0
		gunModel[582] = new ModelRendererTurbo(this, 105, 233, textureX, textureY); // Import Box0
		gunModel[583] = new ModelRendererTurbo(this, 1009, 185, textureX, textureY); // Import Box0
		gunModel[584] = new ModelRendererTurbo(this, 1009, 225, textureX, textureY); // Import Box0
		gunModel[585] = new ModelRendererTurbo(this, 161, 233, textureX, textureY); // Import Box0
		gunModel[586] = new ModelRendererTurbo(this, 185, 233, textureX, textureY); // Import Box0
		gunModel[587] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Import Box0
		gunModel[588] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Import Box0
		gunModel[589] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Import Box0
		gunModel[590] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Import Box0
		gunModel[591] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Import Box0
		gunModel[592] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Import Box0
		gunModel[593] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Import Box0
		gunModel[594] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Import Box0
		gunModel[595] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Import Box0
		gunModel[596] = new ModelRendererTurbo(this, 513, 233, textureX, textureY); // Import Box0
		gunModel[597] = new ModelRendererTurbo(this, 529, 233, textureX, textureY); // Import Box0
		gunModel[598] = new ModelRendererTurbo(this, 545, 233, textureX, textureY); // Import Box0
		gunModel[599] = new ModelRendererTurbo(this, 561, 233, textureX, textureY); // Import Box0
		gunModel[600] = new ModelRendererTurbo(this, 913, 233, textureX, textureY); // Import Box0
		gunModel[601] = new ModelRendererTurbo(this, 185, 241, textureX, textureY); // Import Box0
		gunModel[602] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Import Box0
		gunModel[603] = new ModelRendererTurbo(this, 569, 241, textureX, textureY); // Import Box0
		gunModel[604] = new ModelRendererTurbo(this, 937, 241, textureX, textureY); // Import Box0
		gunModel[605] = new ModelRendererTurbo(this, 985, 241, textureX, textureY); // Import Box0
		gunModel[606] = new ModelRendererTurbo(this, 297, 249, textureX, textureY); // Import Box0
		gunModel[607] = new ModelRendererTurbo(this, 1009, 249, textureX, textureY); // Import Box0
		gunModel[608] = new ModelRendererTurbo(this, 569, 257, textureX, textureY); // Import Box0
		gunModel[609] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Import Box0
		gunModel[610] = new ModelRendererTurbo(this, 873, 249, textureX, textureY); // Import Box0
		gunModel[611] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Import Box0
		gunModel[612] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Import Box0
		gunModel[613] = new ModelRendererTurbo(this, 569, 177, textureX, textureY); // Import Box0
		gunModel[614] = new ModelRendererTurbo(this, 1009, 257, textureX, textureY); // Import Box0
		gunModel[615] = new ModelRendererTurbo(this, 273, 265, textureX, textureY); // Import Box0
		gunModel[616] = new ModelRendererTurbo(this, 593, 177, textureX, textureY); // Import Box0
		gunModel[617] = new ModelRendererTurbo(this, 649, 385, textureX, textureY); // Import Box0
		gunModel[618] = new ModelRendererTurbo(this, 633, 305, textureX, textureY); // Import Box0
		gunModel[619] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box0
		gunModel[620] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import Box0
		gunModel[621] = new ModelRendererTurbo(this, 953, 265, textureX, textureY); // Import Box0
		gunModel[622] = new ModelRendererTurbo(this, 969, 265, textureX, textureY); // Import Box0
		gunModel[623] = new ModelRendererTurbo(this, 105, 281, textureX, textureY); // Import Box0
		gunModel[624] = new ModelRendererTurbo(this, 873, 177, textureX, textureY); // Import Box0
		gunModel[625] = new ModelRendererTurbo(this, 993, 425, textureX, textureY); // Import Box0
		gunModel[626] = new ModelRendererTurbo(this, 449, 385, textureX, textureY); // Import Box0
		gunModel[627] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Box0
		gunModel[628] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box0
		gunModel[629] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Import Box0
		gunModel[630] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Import Box0
		gunModel[631] = new ModelRendererTurbo(this, 153, 281, textureX, textureY); // Import Box0
		gunModel[632] = new ModelRendererTurbo(this, 825, 857, textureX, textureY); // Import Box0
		gunModel[633] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Import Box0
		gunModel[634] = new ModelRendererTurbo(this, 385, 873, textureX, textureY); // Import Box0
		gunModel[635] = new ModelRendererTurbo(this, 569, 857, textureX, textureY); // Import Box0
		gunModel[636] = new ModelRendererTurbo(this, 697, 857, textureX, textureY); // Import Box0
		gunModel[637] = new ModelRendererTurbo(this, 761, 433, textureX, textureY); // Import Box0
		gunModel[638] = new ModelRendererTurbo(this, 385, 513, textureX, textureY); // Import Box0
		gunModel[639] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Import Box0
		gunModel[640] = new ModelRendererTurbo(this, 177, 873, textureX, textureY); // Import Box0
		gunModel[641] = new ModelRendererTurbo(this, 257, 889, textureX, textureY); // Import Box0
		gunModel[642] = new ModelRendererTurbo(this, 577, 417, textureX, textureY); // Import Box0
		gunModel[643] = new ModelRendererTurbo(this, 169, 281, textureX, textureY); // Import Box0
		gunModel[644] = new ModelRendererTurbo(this, 201, 281, textureX, textureY); // Import Box0
		gunModel[645] = new ModelRendererTurbo(this, 649, 289, textureX, textureY); // Import Box0
		gunModel[646] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Import Box0
		gunModel[647] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Import Box0
		gunModel[648] = new ModelRendererTurbo(this, 929, 289, textureX, textureY); // Import Box0
		gunModel[649] = new ModelRendererTurbo(this, 745, 313, textureX, textureY); // Import Box0
		gunModel[650] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Import Box0
		gunModel[651] = new ModelRendererTurbo(this, 273, 249, textureX, textureY); // Import Box0
		gunModel[652] = new ModelRendererTurbo(this, 833, 273, textureX, textureY); // Import Box0
		gunModel[653] = new ModelRendererTurbo(this, 649, 345, textureX, textureY); // Import Box0
		gunModel[654] = new ModelRendererTurbo(this, 505, 385, textureX, textureY); // Import Box0
		gunModel[655] = new ModelRendererTurbo(this, 721, 889, textureX, textureY); // Import Box0
		gunModel[656] = new ModelRendererTurbo(this, 817, 177, textureX, textureY); // Import Box0
		gunModel[657] = new ModelRendererTurbo(this, 849, 177, textureX, textureY); // Import Box0
		gunModel[658] = new ModelRendererTurbo(this, 897, 177, textureX, textureY); // Import Box0
		gunModel[659] = new ModelRendererTurbo(this, 945, 177, textureX, textureY); // Import Box0
		gunModel[660] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Import Box0
		gunModel[661] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Import Box0
		gunModel[662] = new ModelRendererTurbo(this, 569, 185, textureX, textureY); // Import Box0
		gunModel[663] = new ModelRendererTurbo(this, 593, 185, textureX, textureY); // Import Box0
		gunModel[664] = new ModelRendererTurbo(this, 873, 185, textureX, textureY); // Import Box0
		gunModel[665] = new ModelRendererTurbo(this, 897, 185, textureX, textureY); // Import Box0
		gunModel[666] = new ModelRendererTurbo(this, 945, 185, textureX, textureY); // Import Box0
		gunModel[667] = new ModelRendererTurbo(this, 985, 185, textureX, textureY); // Import Box0
		gunModel[668] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Import Box0
		gunModel[669] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Import Box0
		gunModel[670] = new ModelRendererTurbo(this, 777, 201, textureX, textureY); // Import Box0
		gunModel[671] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Import Box0
		gunModel[672] = new ModelRendererTurbo(this, 985, 209, textureX, textureY); // Import Box0
		gunModel[673] = new ModelRendererTurbo(this, 905, 217, textureX, textureY); // Import Box0
		gunModel[674] = new ModelRendererTurbo(this, 609, 225, textureX, textureY); // Import Box0
		gunModel[675] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Import Box0
		gunModel[676] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Import Box0
		gunModel[677] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Import Box0
		gunModel[678] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Import Box0
		gunModel[679] = new ModelRendererTurbo(this, 617, 233, textureX, textureY); // Import Box0
		gunModel[680] = new ModelRendererTurbo(this, 769, 289, textureX, textureY); // Import Box0
		gunModel[681] = new ModelRendererTurbo(this, 961, 289, textureX, textureY); // Import Box0
		gunModel[682] = new ModelRendererTurbo(this, 865, 337, textureX, textureY); // Import Box0
		gunModel[683] = new ModelRendererTurbo(this, 969, 337, textureX, textureY); // Import Box0
		gunModel[684] = new ModelRendererTurbo(this, 953, 377, textureX, textureY); // Import Box0
		gunModel[685] = new ModelRendererTurbo(this, 561, 385, textureX, textureY); // Import Box0
		gunModel[686] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Import Box0
		gunModel[687] = new ModelRendererTurbo(this, 657, 321, textureX, textureY); // Import Box0
		gunModel[688] = new ModelRendererTurbo(this, 873, 233, textureX, textureY); // Import Box0
		gunModel[689] = new ModelRendererTurbo(this, 913, 409, textureX, textureY); // Import Box0
		gunModel[690] = new ModelRendererTurbo(this, 849, 321, textureX, textureY); // Import Box0
		gunModel[691] = new ModelRendererTurbo(this, 561, 393, textureX, textureY); // Import Box0
		gunModel[692] = new ModelRendererTurbo(this, 433, 417, textureX, textureY); // Import Box0
		gunModel[693] = new ModelRendererTurbo(this, 449, 449, textureX, textureY); // Import Box0
		gunModel[694] = new ModelRendererTurbo(this, 1001, 441, textureX, textureY); // Import Box0
		gunModel[695] = new ModelRendererTurbo(this, 865, 433, textureX, textureY); // Import Box0
		gunModel[696] = new ModelRendererTurbo(this, 497, 513, textureX, textureY); // Import Box0
		gunModel[697] = new ModelRendererTurbo(this, 409, 441, textureX, textureY); // Import Box0
		gunModel[698] = new ModelRendererTurbo(this, 465, 457, textureX, textureY); // Import Box0
		gunModel[699] = new ModelRendererTurbo(this, 969, 457, textureX, textureY); // Import Box0
		gunModel[700] = new ModelRendererTurbo(this, 177, 481, textureX, textureY); // Import Box0
		gunModel[701] = new ModelRendererTurbo(this, 305, 497, textureX, textureY); // Import Box0
		gunModel[702] = new ModelRendererTurbo(this, 57, 873, textureX, textureY); // Import Box0
		gunModel[703] = new ModelRendererTurbo(this, 729, 465, textureX, textureY); // Import Box0
		gunModel[704] = new ModelRendererTurbo(this, 1, 537, textureX, textureY); // Import Box0
		gunModel[705] = new ModelRendererTurbo(this, 737, 505, textureX, textureY); // Import Box0
		gunModel[706] = new ModelRendererTurbo(this, 417, 481, textureX, textureY); // Import Box0
		gunModel[707] = new ModelRendererTurbo(this, 753, 561, textureX, textureY); // Import Box0
		gunModel[708] = new ModelRendererTurbo(this, 209, 513, textureX, textureY); // Import Box0
		gunModel[709] = new ModelRendererTurbo(this, 145, 569, textureX, textureY); // Import Box0

		gunModel[500].addShapeBox(71F, -39F, -12F, 4, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box0
		gunModel[500].setRotationPoint(-276F, 46F, 2F);

		gunModel[501].addShapeBox(71F, -39F, -12F, 4, 37, 20, 0F,-1F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import Box0
		gunModel[501].setRotationPoint(-282F, 12F, 2F);

		gunModel[502].addShapeBox(71F, -39F, -12F, 2, 32, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[502].setRotationPoint(-278F, 15F, 2F);

		gunModel[503].addShapeBox(71F, -39F, -12F, 2, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[503].setRotationPoint(-278F, 47F, 2F);

		gunModel[504].addShapeBox(71F, -39F, -12F, 2, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[504].setRotationPoint(-194F, -23F, 0F);

		gunModel[505].addShapeBox(71F, -39F, -12F, 2, 10, 20, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[505].setRotationPoint(-194F, -12F, 2F);

		gunModel[506].addShapeBox(71F, -39F, -12F, 2, 0, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1.5F, 0F); // Import Box0
		gunModel[506].setRotationPoint(-196F, -23F, 0F);

		gunModel[507].addShapeBox(71F, -39F, -12F, 6, 21, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[507].setRotationPoint(-192F, -23F, 0F);

		gunModel[508].addShapeBox(71F, -39F, -12F, 5, 9, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[508].setRotationPoint(-186F, -12F, 0F);

		gunModel[509].addShapeBox(71F, -39F, -12F, 9, 9, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F); // Import Box0
		gunModel[509].setRotationPoint(-181F, -12F, 2F);

		gunModel[510].addShapeBox(71F, -39F, -12F, 5, 11, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[510].setRotationPoint(-172F, -12F, 2F);

		gunModel[511].addShapeBox(71F, -39F, -12F, 3, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[511].setRotationPoint(-170F, -22F, 8F);

		gunModel[512].addShapeBox(71F, -39F, -12F, 18, 6, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[512].setRotationPoint(-185F, -29F, 0F);

		gunModel[513].addShapeBox(71F, -39F, -12F, 19, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[513].setRotationPoint(-186F, -23F, 2F);

		gunModel[514].addShapeBox(71F, -39F, -12F, 16, 7, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[514].setRotationPoint(-167F, -7F, 0F);

		gunModel[515].addShapeBox(71F, -39F, -12F, 4, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box0
		gunModel[515].setRotationPoint(-167F, -29F, 10F);

		gunModel[516].addShapeBox(71F, -39F, -12F, 8, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[516].setRotationPoint(-163F, -29F, 0F);

		gunModel[517].addShapeBox(71F, -39F, -12F, 4, 3, 14, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[517].setRotationPoint(-167F, -10F, 10F);

		gunModel[518].addShapeBox(71F, -39F, -12F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[518].setRotationPoint(-163F, -10F, 0F);

		gunModel[519].addShapeBox(71F, -39F, -12F, 4, 1, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[519].setRotationPoint(-155F, -29F, 0F);

		gunModel[520].addShapeBox(71F, -39F, -12F, 10, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[520].setRotationPoint(-161F, -32F, 0F);

		gunModel[521].addShapeBox(71F, -39F, -12F, 11, 3, 24, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[521].setRotationPoint(-172F, -32F, 0F);

		gunModel[522].addShapeBox(71F, -39F, -12F, 13, 6, 16, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[522].setRotationPoint(-185F, -35F, 4F);

		gunModel[523].addShapeBox(71F, -39F, -12F, 2, 2, 24, 0F,0F, -0.5F, -1.35F, -2F, -0.5F, -1.35F, -2F, -0.5F, -1.35F, 0F, -0.5F, -1.35F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[523].setRotationPoint(-185F, -31F, 0F);

		gunModel[524].addShapeBox(71F, -39F, -12F, 2, 2, 24, 0F,-2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[524].setRotationPoint(-174F, -31F, 0F);

		gunModel[525].addShapeBox(71F, -39F, -12F, 2, 2, 16, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[525].setRotationPoint(-175.5F, -14F, 8F);

		gunModel[526].addShapeBox(71F, -39F, -12F, 3, 2, 16, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[526].setRotationPoint(-176.5F, -16F, 8F);

		gunModel[527].addShapeBox(71F, -39F, -12F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[527].setRotationPoint(-177F, -18F, 8F);

		gunModel[528].addShapeBox(71F, -39F, -12F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[528].setRotationPoint(-176.5F, -20F, 8F);

		gunModel[529].addShapeBox(71F, -39F, -12F, 2, 2, 16, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[529].setRotationPoint(-175.5F, -22F, 8F);

		gunModel[530].addShapeBox(71F, -39F, -12F, 16, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[530].setRotationPoint(-186F, -22F, 9F);

		gunModel[531].addShapeBox(71F, -39F, -12F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[531].setRotationPoint(-186F, -22F, 8F);

		gunModel[532].addShapeBox(71F, -39F, -12F, 1, 1, 16, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[532].setRotationPoint(-186F, -13F, 8F);

		gunModel[533].addShapeBox(71F, -39F, -12F, 6, 27, 24, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F); // Import Box0
		gunModel[533].setRotationPoint(-287F, -11F, 0F);

		gunModel[534].addShapeBox(71F, -39F, -12F, 4, 34, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F); // Import Box0
		gunModel[534].setRotationPoint(-284.5F, 16F, 0F);

		gunModel[535].addShapeBox(71F, -39F, -12F, 4, 7, 24, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[535].setRotationPoint(-281F, 50F, 0F);

		gunModel[536].addShapeBox(71F, -39F, -12F, 1, 5, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[536].setRotationPoint(-288F, -16F, 0F);

		gunModel[537].addShapeBox(71F, -39F, -12F, 6, 3, 24, 0F,2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[537].setRotationPoint(-286F, 54F, 0F);

		gunModel[538].addShapeBox(71F, -39F, -12F, 4, 1, 24, 0F,0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[538].setRotationPoint(-288F, 18F, 0F);

		gunModel[539].addShapeBox(71F, -39F, -12F, 4, 2, 24, 0F,0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Import Box0
		gunModel[539].setRotationPoint(-287.9F, 19F, 0F);

		gunModel[540].addShapeBox(71F, -39F, -12F, 1, 1, 24, 0F,-1.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -1.15F, 0F, 0F, -0.4F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.4F, 0F, 0F); // Import Box0
		gunModel[540].setRotationPoint(-285.55F, 17F, 0F);

		gunModel[541].addShapeBox(71F, -39F, -12F, 1, 1, 24, 0F,-0.2F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.2F, 0F, 0F, -0.9F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.9F, 0F, 0F); // Import Box0
		gunModel[541].setRotationPoint(-284.8F, 21F, 0F);

		gunModel[542].addShapeBox(71F, -39F, -12F, 1, 1, 24, 0F,0.15F, 0F, 0F, -1.15F, 0F, 0F, -1.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[542].setRotationPoint(-288.1F, 17F, 0F);

		gunModel[543].addShapeBox(71F, -39F, -12F, 1, 1, 24, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.1F, 0F, 0F); // Import Box0
		gunModel[543].setRotationPoint(-287.8F, 21F, 0F);

		gunModel[544].addShapeBox(71F, -39F, -12F, 1, 1, 24, 0F,-1.25F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -1.25F, 0F, 0F, -0.4F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, -0.4F, 0F, 0F); // Import Box0
		gunModel[544].setRotationPoint(-282.05F, 53F, 0F);

		gunModel[545].addShapeBox(71F, -39F, -12F, 1, 1, 24, 0F,0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.05F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F); // Import Box0
		gunModel[545].setRotationPoint(-284.1F, 53F, 0F);

		gunModel[546].addShapeBox(71F, -39F, -12F, 1, 1, 24, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[546].setRotationPoint(-288.8F, -16F, 0F);

		gunModel[547].addShapeBox(71F, -39F, -12F, 1, 1, 24, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.1F, 0F, 0F); // Import Box0
		gunModel[547].setRotationPoint(-292F, -16F, 0F);

		gunModel[548].addShapeBox(71F, -39F, -12F, 7, 70, 20, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Import Box0
		gunModel[548].setRotationPoint(-293F, -16F, 2F);

		gunModel[549].addShapeBox(71F, -39F, -12F, 4, 21, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[549].setRotationPoint(-155F, -28F, 0F);

		gunModel[550].addShapeBox(71F, -39F, -12F, 8, 21, 25, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box0
		gunModel[550].setRotationPoint(-163F, -28F, 0F);

		gunModel[551].addShapeBox(71F, -39F, -12F, 4, 15, 15, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Import Box0
		gunModel[551].setRotationPoint(-167F, -25F, 10F);

		gunModel[552].addShapeBox(71F, -39F, -12F, 3, 12, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[552].setRotationPoint(-169F, -24F, 24F);

		gunModel[553].addShapeBox(71F, -39F, -12F, 15, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[553].setRotationPoint(-282F, -18F, 5F);

		gunModel[554].addShapeBox(71F, -39F, -12F, 15, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[554].setRotationPoint(-283F, -14F, 5F);

		gunModel[555].addShapeBox(71F, -39F, -12F, 12, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[555].setRotationPoint(-283F, -10F, 5F);

		gunModel[556].addShapeBox(71F, -39F, -12F, 7, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[556].setRotationPoint(-283F, -5F, 5F);

		gunModel[557].addShapeBox(71F, -39F, -12F, 6, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[557].setRotationPoint(-283F, -3F, 5F);

		gunModel[558].addShapeBox(71F, -39F, -12F, 6, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[558].setRotationPoint(-283F, 0F, 5F);

		gunModel[559].addShapeBox(71F, -39F, -12F, 9, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[559].setRotationPoint(-283F, 3F, 5F);

		gunModel[560].addShapeBox(71F, -39F, -12F, 22, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[560].setRotationPoint(-283F, 4F, 5F);

		gunModel[561].addShapeBox(71F, -39F, -12F, 2, 16, 4, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[561].setRotationPoint(-134F, -52F, -1.5F);

		gunModel[562].addShapeBox(71F, -39F, -12F, 2, 19, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import Box0
		gunModel[562].setRotationPoint(-134F, -54F, 19.5F);

		gunModel[563].addShapeBox(71F, -39F, -12F, 2, 2, 20, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[563].setRotationPoint(-134F, -56F, 0.5F);

		gunModel[564].addShapeBox(71F, -39F, -12F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Import Box0
		gunModel[564].setRotationPoint(-134F, -53F, -2.5F);

		gunModel[565].addShapeBox(71F, -39F, -12F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[565].setRotationPoint(-134F, -37F, 28F);

		gunModel[566].addShapeBox(71F, -39F, -12F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[566].setRotationPoint(-134F, -36F, 28F);

		gunModel[567].addShapeBox(71F, -39F, -12F, 2, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[567].setRotationPoint(-134F, -36F, -1.5F);

		gunModel[568].addShapeBox(71F, -39F, -12F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[568].setRotationPoint(-134F, -54F, -2.5F);

		gunModel[569].addShapeBox(71F, -39F, -12F, 2, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[569].setRotationPoint(-134F, -35.5F, 2F);

		gunModel[570].addShapeBox(71F, -39F, -12F, 2, 20, 18, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import Box0
		gunModel[570].setRotationPoint(-134F, -54F, 2F);

		gunModel[571].addShapeBox(71F, -39F, -12F, 2, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Import Box0
		gunModel[571].setRotationPoint(-134F, -56F, 19.5F);

		gunModel[572].addShapeBox(71F, -39F, -12F, 2, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[572].setRotationPoint(-134F, -52F, 21.5F);

		gunModel[573].addShapeBox(71F, -39F, -12F, 2, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[573].setRotationPoint(-134F, -54F, 24.5F);

		gunModel[574].addShapeBox(71F, -39F, -12F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Import Box0
		gunModel[574].setRotationPoint(-134F, -53F, 24.5F);

		gunModel[575].addShapeBox(71F, -39F, -12F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[575].setRotationPoint(-134F, -37F, -6F);

		gunModel[576].addShapeBox(71F, -39F, -12F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Import Box0
		gunModel[576].setRotationPoint(-134F, -36F, -6F);

		gunModel[577].addShapeBox(71F, -39F, -12F, 2, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[577].setRotationPoint(-134F, -36F, 21.5F);

		gunModel[578].addShapeBox(71F, -39F, -12F, 2, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[578].setRotationPoint(-134F, -35F, -4.5F);

		gunModel[579].addShapeBox(71F, -39F, -12F, 2, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F); // Import Box0
		gunModel[579].setRotationPoint(-134F, -35F, 21.5F);

		gunModel[580].addShapeBox(71F, -39F, -12F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[580].setRotationPoint(-134.75F, -51.25F, 9F);

		gunModel[581].addShapeBox(71F, -39F, -12F, 1, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[581].setRotationPoint(-134.75F, -55.25F, 9F);

		gunModel[582].addShapeBox(71F, -39F, -12F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[582].setRotationPoint(-134.75F, -53.25F, 9F);

		gunModel[583].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[583].setRotationPoint(-39.5F, -2.5F, 19.75F);

		gunModel[584].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[584].setRotationPoint(-39.5F, -3.5F, 19.75F);

		gunModel[585].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[585].setRotationPoint(-39.5F, -4.5F, 19.75F);

		gunModel[586].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[586].setRotationPoint(-44F, -2.5F, 19.75F);

		gunModel[587].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[587].setRotationPoint(-44F, -3.5F, 19.75F);

		gunModel[588].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[588].setRotationPoint(-44F, -4.5F, 19.75F);

		gunModel[589].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[589].setRotationPoint(-48.5F, -2.5F, 19.75F);

		gunModel[590].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[590].setRotationPoint(-48.5F, -3.5F, 19.75F);

		gunModel[591].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[591].setRotationPoint(-48.5F, -4.5F, 19.75F);

		gunModel[592].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[592].setRotationPoint(-53F, -2.5F, 19.75F);

		gunModel[593].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[593].setRotationPoint(-53F, -3.5F, 19.75F);

		gunModel[594].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[594].setRotationPoint(-53F, -4.5F, 19.75F);

		gunModel[595].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[595].setRotationPoint(-54F, 3F, 19.75F);

		gunModel[596].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[596].setRotationPoint(-54F, 2F, 19.75F);

		gunModel[597].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[597].setRotationPoint(-54F, 1F, 19.75F);

		gunModel[598].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[598].setRotationPoint(-60F, 3F, 19.75F);

		gunModel[599].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[599].setRotationPoint(-60F, 2F, 19.75F);

		gunModel[600].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[600].setRotationPoint(-60F, 1F, 19.75F);

		gunModel[601].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[601].setRotationPoint(-57F, 0F, 19.75F);

		gunModel[602].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[602].setRotationPoint(-57F, -1F, 19.75F);

		gunModel[603].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[603].setRotationPoint(-57F, -2F, 19.75F);

		gunModel[604].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[604].setRotationPoint(-64.5F, 2.5F, 19.75F);

		gunModel[605].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[605].setRotationPoint(-64.5F, 1.5F, 19.75F);

		gunModel[606].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[606].setRotationPoint(-64.5F, 0.5F, 19.75F);

		gunModel[607].addShapeBox(71F, -39F, -12F, 5, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[607].setRotationPoint(-65F, -3F, 23F);

		gunModel[608].addShapeBox(71F, -39F, -12F, 8, 3, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[608].setRotationPoint(-67F, -6F, 23F);

		gunModel[609].addShapeBox(71F, -39F, -12F, 8, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[609].setRotationPoint(-67F, -8F, 23F);

		gunModel[610].addShapeBox(71F, -39F, -12F, 9, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[610].setRotationPoint(-68F, -9F, 23F);

		gunModel[611].addShapeBox(71F, -39F, -12F, 9, 2, 2, 0F,0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[611].setRotationPoint(-68F, -11F, 23F);

		gunModel[612].addShapeBox(71F, -39F, -12F, 7, 1, 2, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[612].setRotationPoint(-68F, -12F, 23F);

		gunModel[613].addShapeBox(71F, -39F, -12F, 2, 3, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[613].setRotationPoint(-70.5F, -12F, -1F);

		gunModel[614].addShapeBox(71F, -39F, -12F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[614].setRotationPoint(-74.5F, -11F, 23F);

		gunModel[615].addShapeBox(71F, -39F, -12F, 4, 1, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[615].setRotationPoint(-74.5F, -12F, 23F);

		gunModel[616].addShapeBox(71F, -39F, -12F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[616].setRotationPoint(-92.5F, -9F, 23.5F);

		gunModel[617].addShapeBox(71F, -39F, -12F, 11, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[617].setRotationPoint(-103.5F, -9F, 23.5F);

		gunModel[618].addShapeBox(71F, -39F, -12F, 8, 8, 1, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -8F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import Box0
		gunModel[618].setRotationPoint(-111.5F, -9F, 23.5F);

		gunModel[619].addShapeBox(71F, -39F, -12F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[619].setRotationPoint(-92.5F, -3F, 23.5F);

		gunModel[620].addShapeBox(71F, -39F, -12F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, -0.5F, -0.5F); // Import Box0
		gunModel[620].setRotationPoint(-90.5F, -3F, 23.5F);

		gunModel[621].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[621].setRotationPoint(-98.5F, -4.5F, 20.25F);

		gunModel[622].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[622].setRotationPoint(-98.5F, -5.5F, 20.25F);

		gunModel[623].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[623].setRotationPoint(-98.5F, -6.5F, 20.25F);

		gunModel[624].addShapeBox(71F, -39F, -12F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[624].setRotationPoint(-92.5F, -9F, 0F);

		gunModel[625].addShapeBox(71F, -39F, -12F, 11, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[625].setRotationPoint(-103.5F, -9F, 0F);

		gunModel[626].addShapeBox(71F, -39F, -12F, 8, 8, 1, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -8F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import Box0
		gunModel[626].setRotationPoint(-111.5F, -9F, 0F);

		gunModel[627].addShapeBox(71F, -39F, -12F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[627].setRotationPoint(-92.5F, -3F, 0F);

		gunModel[628].addShapeBox(71F, -39F, -12F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, -0.5F, -0.5F); // Import Box0
		gunModel[628].setRotationPoint(-90.5F, -3F, 0F);

		gunModel[629].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[629].setRotationPoint(-98.5F, -4.5F, -0.25F);

		gunModel[630].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[630].setRotationPoint(-98.5F, -5.5F, -0.25F);

		gunModel[631].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[631].setRotationPoint(-98.5F, -6.5F, -0.25F);

		gunModel[632].addShapeBox(71F, -39F, -12F, 67, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Import Box0
		gunModel[632].setRotationPoint(-113F, -29.5F, 0F);

		gunModel[633].addShapeBox(71F, -39F, -12F, 4, 14, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[633].setRotationPoint(-50F, -27F, 0F);

		gunModel[634].addShapeBox(71F, -39F, -12F, 84, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[634].setRotationPoint(-46F, -20F, 0F);

		gunModel[635].addShapeBox(71F, -39F, -12F, 5, 4, 24, 0F,-4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[635].setRotationPoint(38F, -17F, 0F);

		gunModel[636].addShapeBox(71F, -39F, -12F, 4, 3, 24, 0F,-4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[636].setRotationPoint(42F, -19.5F, 0F);

		gunModel[637].addShapeBox(71F, -39F, -12F, 8, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[637].setRotationPoint(38F, -29.5F, 0F);

		gunModel[638].addShapeBox(71F, -39F, -12F, 13, 9, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[638].setRotationPoint(-46F, -29F, 0F);

		gunModel[639].addShapeBox(71F, -39F, -12F, 2, 9, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[639].setRotationPoint(36F, -29F, 0F);

		gunModel[640].addShapeBox(71F, -39F, -12F, 22, 3, 24, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[640].setRotationPoint(36F, -32.5F, 0F);

		gunModel[641].addShapeBox(71F, -39F, -12F, 69, 3, 18, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[641].setRotationPoint(-33F, -32.5F, 6F);

		gunModel[642].addShapeBox(71F, -39F, -12F, 13, 6, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[642].setRotationPoint(-46F, -27.5F, -1.5F);

		gunModel[643].addShapeBox(71F, -39F, -12F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[643].setRotationPoint(-45F, -21.5F, -2.5F);

		gunModel[644].addShapeBox(71F, -39F, -12F, 11, 1, 1, 0F,0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[644].setRotationPoint(-45F, -29F, -2.5F);

		gunModel[645].addShapeBox(71F, -39F, -12F, 11, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[645].setRotationPoint(-45F, -28F, -2.5F);

		gunModel[646].addShapeBox(71F, -39F, -12F, 1, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[646].setRotationPoint(-46F, -28F, -2.5F);

		gunModel[647].addShapeBox(71F, -39F, -12F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 2F, 0F); // Import Box0
		gunModel[647].setRotationPoint(-34F, -28F, -2.5F);

		gunModel[648].addShapeBox(71F, -39F, -12F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F); // Import Box0
		gunModel[648].setRotationPoint(-46F, -21.5F, -1.5F);

		gunModel[649].addShapeBox(71F, -39F, -12F, 13, 1, 2, 0F,-1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[649].setRotationPoint(-46F, -29F, -1.5F);

		gunModel[650].addShapeBox(71F, -39F, -12F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[650].setRotationPoint(-33F, -21F, 0F);

		gunModel[651].addShapeBox(71F, -39F, -12F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[651].setRotationPoint(35F, -21F, 0F);

		gunModel[652].addShapeBox(71F, -39F, -12F, 1, 1, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[652].setRotationPoint(-51F, -14.5F, 0F);

		gunModel[653].addShapeBox(71F, -39F, -12F, 1, 1, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[653].setRotationPoint(-106F, -26.5F, 0F);

		gunModel[654].addShapeBox(71F, -39F, -12F, 1, 1, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[654].setRotationPoint(-51F, -26.5F, 0F);

		gunModel[655].addShapeBox(71F, -39F, -12F, 56, 14, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[655].setRotationPoint(-106F, -27F, 1F);

		gunModel[656].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[656].setRotationPoint(-39.5F, -2.5F, 0.25F);

		gunModel[657].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[657].setRotationPoint(-39.5F, -3.5F, 0.25F);

		gunModel[658].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[658].setRotationPoint(-39.5F, -4.5F, 0.25F);

		gunModel[659].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[659].setRotationPoint(-44F, -2.5F, 0.25F);

		gunModel[660].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[660].setRotationPoint(-44F, -3.5F, 0.25F);

		gunModel[661].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[661].setRotationPoint(-44F, -4.5F, 0.25F);

		gunModel[662].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[662].setRotationPoint(-48.5F, -2.5F, 0.25F);

		gunModel[663].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[663].setRotationPoint(-48.5F, -3.5F, 0.25F);

		gunModel[664].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[664].setRotationPoint(-48.5F, -4.5F, 0.25F);

		gunModel[665].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[665].setRotationPoint(-53F, -2.5F, 0.25F);

		gunModel[666].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[666].setRotationPoint(-53F, -3.5F, 0.25F);

		gunModel[667].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[667].setRotationPoint(-53F, -4.5F, 0.25F);

		gunModel[668].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[668].setRotationPoint(-54F, 3F, 0.25F);

		gunModel[669].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[669].setRotationPoint(-54F, 2F, 0.25F);

		gunModel[670].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[670].setRotationPoint(-54F, 1F, 0.25F);

		gunModel[671].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[671].setRotationPoint(-60F, 3F, 0.25F);

		gunModel[672].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[672].setRotationPoint(-60F, 2F, 0.25F);

		gunModel[673].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[673].setRotationPoint(-60F, 1F, 0.25F);

		gunModel[674].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[674].setRotationPoint(-57F, 0F, 0.25F);

		gunModel[675].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[675].setRotationPoint(-57F, -1F, 0.25F);

		gunModel[676].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[676].setRotationPoint(-57F, -2F, 0.25F);

		gunModel[677].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[677].setRotationPoint(-64.5F, 2.5F, 0.25F);

		gunModel[678].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[678].setRotationPoint(-64.5F, 1.5F, 0.25F);

		gunModel[679].addShapeBox(71F, -39F, -12F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[679].setRotationPoint(-64.5F, 0.5F, 0.25F);

		gunModel[680].addShapeBox(71F, -39F, -12F, 5, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[680].setRotationPoint(-65F, -3F, -1F);

		gunModel[681].addShapeBox(71F, -39F, -12F, 8, 3, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[681].setRotationPoint(-67F, -6F, -1F);

		gunModel[682].addShapeBox(71F, -39F, -12F, 8, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[682].setRotationPoint(-67F, -8F, -1F);

		gunModel[683].addShapeBox(71F, -39F, -12F, 9, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[683].setRotationPoint(-68F, -9F, -1F);

		gunModel[684].addShapeBox(71F, -39F, -12F, 9, 2, 2, 0F,0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[684].setRotationPoint(-68F, -11F, -1F);

		gunModel[685].addShapeBox(71F, -39F, -12F, 7, 1, 2, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[685].setRotationPoint(-68F, -12F, -1F);

		gunModel[686].addShapeBox(71F, -39F, -12F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[686].setRotationPoint(-74.5F, -11F, -2F);

		gunModel[687].addShapeBox(71F, -39F, -12F, 4, 1, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[687].setRotationPoint(-74.5F, -12F, -2F);

		gunModel[688].addShapeBox(71F, -39F, -12F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box0
		gunModel[688].setRotationPoint(-70.5F, -12F, 23F);

		gunModel[689].addShapeBox(71F, -39F, -12F, 9, 9, 2, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F); // Import Box0
		gunModel[689].setRotationPoint(-181F, -12F, 0F);

		gunModel[690].addShapeBox(71F, -39F, -12F, 5, 11, 2, 0F,0F, -1.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[690].setRotationPoint(-172F, -12F, 0F);

		gunModel[691].addShapeBox(71F, -39F, -12F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[691].setRotationPoint(-164F, -24F, 0F);

		gunModel[692].addShapeBox(71F, -39F, -12F, 1, 2, 10, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[692].setRotationPoint(-167F, -9F, 0F);

		gunModel[693].addShapeBox(71F, -39F, -12F, 2, 2, 10, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[693].setRotationPoint(-166F, -9F, 0F);

		gunModel[694].addShapeBox(71F, -39F, -12F, 2, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[694].setRotationPoint(-186F, -21F, 0F);

		gunModel[695].addShapeBox(71F, -39F, -12F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[695].setRotationPoint(-186F, -23F, 0F);

		gunModel[696].addShapeBox(71F, -39F, -12F, 9, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[696].setRotationPoint(-184F, -23F, 0F);

		gunModel[697].addShapeBox(71F, -39F, -12F, 1, 1, 9, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[697].setRotationPoint(-184F, -13F, 0F);

		gunModel[698].addShapeBox(71F, -39F, -12F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[698].setRotationPoint(-184F, -21F, 0F);

		gunModel[699].addShapeBox(71F, -39F, -12F, 1, 2, 10, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[699].setRotationPoint(-164F, -9F, 0F);

		gunModel[700].addShapeBox(71F, -39F, -12F, 3, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[700].setRotationPoint(-167F, -24F, 0F);

		gunModel[701].addShapeBox(71F, -39F, -12F, 4, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[701].setRotationPoint(-167F, -29F, 0F);

		gunModel[702].addShapeBox(71F, -39F, -12F, 21, 17, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[702].setRotationPoint(-184F, -24F, 1.5F);

		gunModel[703].addShapeBox(71F, -39F, -12F, 4, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[703].setRotationPoint(-147F, -26F, 0F);

		gunModel[704].addShapeBox(71F, -39F, -12F, 3, 30, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[704].setRotationPoint(-140F, -32.5F, 0F);

		gunModel[705].addShapeBox(71F, -39F, -12F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[705].setRotationPoint(-149.5F, -44.5F, -4F);
		gunModel[705].rotateAngleZ = -0.13962634F;

		gunModel[706].addShapeBox(71F, -39F, -12F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[706].setRotationPoint(-149.5F, -36.5F, -3F);
		gunModel[706].rotateAngleZ = -0.13962634F;

		gunModel[707].addShapeBox(71F, -39F, -12F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[707].setRotationPoint(-151.5F, -30.5F, -4F);
		gunModel[707].rotateAngleZ = -0.13962634F;

		gunModel[708].addShapeBox(71F, -39F, -12F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[708].setRotationPoint(-151.5F, -22.5F, -3F);
		gunModel[708].rotateAngleZ = -0.13962634F;

		gunModel[709].addShapeBox(71F, -39F, -12F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[709].setRotationPoint(-153.5F, -16.5F, -4F);
		gunModel[709].rotateAngleZ = -0.13962634F;
	}

	private void initdefaultScopeModel_1()
	{
		defaultScopeModel[0] = new ModelRendererTurbo(this, 961, 145, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 873, 201, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 553, 513, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 993, 161, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 945, 121, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import Box0
		defaultScopeModel[8] = new ModelRendererTurbo(this, 609, 209, textureX, textureY); // Import Box0
		defaultScopeModel[9] = new ModelRendererTurbo(this, 985, 393, textureX, textureY); // Import Box0
		defaultScopeModel[10] = new ModelRendererTurbo(this, 537, 545, textureX, textureY); // Import Box0
		defaultScopeModel[11] = new ModelRendererTurbo(this, 121, 593, textureX, textureY); // Import Box0
		defaultScopeModel[12] = new ModelRendererTurbo(this, 569, 593, textureX, textureY); // Import Box0
		defaultScopeModel[13] = new ModelRendererTurbo(this, 817, 593, textureX, textureY); // Import Box0
		defaultScopeModel[14] = new ModelRendererTurbo(this, 945, 193, textureX, textureY); // Import Box0
		defaultScopeModel[15] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box0
		defaultScopeModel[16] = new ModelRendererTurbo(this, 313, 417, textureX, textureY); // Import Box0
		defaultScopeModel[17] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Import Box0
		defaultScopeModel[18] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Import Box0
		defaultScopeModel[19] = new ModelRendererTurbo(this, 985, 209, textureX, textureY); // Import Box0
		defaultScopeModel[20] = new ModelRendererTurbo(this, 377, 417, textureX, textureY); // Import Box0
		defaultScopeModel[21] = new ModelRendererTurbo(this, 705, 313, textureX, textureY); // Import Box0
		defaultScopeModel[22] = new ModelRendererTurbo(this, 225, 617, textureX, textureY); // Import Box0
		defaultScopeModel[23] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import Box0
		defaultScopeModel[24] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import Box0
		defaultScopeModel[25] = new ModelRendererTurbo(this, 209, 233, textureX, textureY); // Import Box0
		defaultScopeModel[26] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Import Box0
		defaultScopeModel[27] = new ModelRendererTurbo(this, 593, 625, textureX, textureY); // Import Box0
		defaultScopeModel[28] = new ModelRendererTurbo(this, 713, 625, textureX, textureY); // Import Box0
		defaultScopeModel[29] = new ModelRendererTurbo(this, 785, 625, textureX, textureY); // Import Box0
		defaultScopeModel[30] = new ModelRendererTurbo(this, 785, 129, textureX, textureY); // Import Box0
		defaultScopeModel[31] = new ModelRendererTurbo(this, 817, 129, textureX, textureY); // Import Box0
		defaultScopeModel[32] = new ModelRendererTurbo(this, 873, 129, textureX, textureY); // Import Box0
		defaultScopeModel[33] = new ModelRendererTurbo(this, 977, 129, textureX, textureY); // Import Box0
		defaultScopeModel[34] = new ModelRendererTurbo(this, 1009, 129, textureX, textureY); // Import Box0
		defaultScopeModel[35] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Import Box0
		defaultScopeModel[36] = new ModelRendererTurbo(this, 553, 417, textureX, textureY); // Import Box0
		defaultScopeModel[37] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import Box0
		defaultScopeModel[38] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Import Box0
		defaultScopeModel[39] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Import Box0
		defaultScopeModel[40] = new ModelRendererTurbo(this, 1009, 137, textureX, textureY); // Import Box0
		defaultScopeModel[41] = new ModelRendererTurbo(this, 961, 161, textureX, textureY); // Import Box0
		defaultScopeModel[42] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box0
		defaultScopeModel[43] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Import Box0
		defaultScopeModel[44] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Import Box0
		defaultScopeModel[45] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Import Box0
		defaultScopeModel[46] = new ModelRendererTurbo(this, 1001, 233, textureX, textureY); // Import Box0
		defaultScopeModel[47] = new ModelRendererTurbo(this, 985, 489, textureX, textureY); // Import Box0
		defaultScopeModel[48] = new ModelRendererTurbo(this, 633, 177, textureX, textureY); // Import Box0
		defaultScopeModel[49] = new ModelRendererTurbo(this, 1001, 305, textureX, textureY); // Import Box0
		defaultScopeModel[50] = new ModelRendererTurbo(this, 513, 625, textureX, textureY); // Import Box0
		defaultScopeModel[51] = new ModelRendererTurbo(this, 769, 321, textureX, textureY); // Import Box0
		defaultScopeModel[52] = new ModelRendererTurbo(this, 921, 177, textureX, textureY); // Import Box0
		defaultScopeModel[53] = new ModelRendererTurbo(this, 985, 177, textureX, textureY); // Import Box0
		defaultScopeModel[54] = new ModelRendererTurbo(this, 1009, 177, textureX, textureY); // Import Box0
		defaultScopeModel[55] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import Box0
		defaultScopeModel[56] = new ModelRendererTurbo(this, 809, 321, textureX, textureY); // Import Box0
		defaultScopeModel[57] = new ModelRendererTurbo(this, 993, 513, textureX, textureY); // Import Box0
		defaultScopeModel[58] = new ModelRendererTurbo(this, 81, 633, textureX, textureY); // Import Box0
		defaultScopeModel[59] = new ModelRendererTurbo(this, 1, 633, textureX, textureY); // Import Box0
		defaultScopeModel[60] = new ModelRendererTurbo(this, 129, 633, textureX, textureY); // Import Box0
		defaultScopeModel[61] = new ModelRendererTurbo(this, 305, 633, textureX, textureY); // Import Box0
		defaultScopeModel[62] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Import Box0
		defaultScopeModel[63] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Import Box0
		defaultScopeModel[64] = new ModelRendererTurbo(this, 769, 473, textureX, textureY); // Import Box0
		defaultScopeModel[65] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Import Box0
		defaultScopeModel[66] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import Box0
		defaultScopeModel[67] = new ModelRendererTurbo(this, 825, 473, textureX, textureY); // Import Box0
		defaultScopeModel[68] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import Box0
		defaultScopeModel[69] = new ModelRendererTurbo(this, 153, 633, textureX, textureY); // Import Box0
		defaultScopeModel[70] = new ModelRendererTurbo(this, 329, 633, textureX, textureY); // Import Box0
		defaultScopeModel[71] = new ModelRendererTurbo(this, 361, 641, textureX, textureY); // Import Box0
		defaultScopeModel[72] = new ModelRendererTurbo(this, 609, 513, textureX, textureY); // Import Box0
		defaultScopeModel[73] = new ModelRendererTurbo(this, 89, 433, textureX, textureY); // Import Box0
		defaultScopeModel[74] = new ModelRendererTurbo(this, 217, 401, textureX, textureY); // Import Box0
		defaultScopeModel[75] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Import Box0
		defaultScopeModel[76] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Import Box0
		defaultScopeModel[77] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Import Box0
		defaultScopeModel[78] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Import Box0
		defaultScopeModel[79] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Import Box0
		defaultScopeModel[80] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Import Box0
		defaultScopeModel[81] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Import Box0
		defaultScopeModel[82] = new ModelRendererTurbo(this, 537, 201, textureX, textureY); // Import Box0
		defaultScopeModel[83] = new ModelRendererTurbo(this, 561, 201, textureX, textureY); // Import Box0
		defaultScopeModel[84] = new ModelRendererTurbo(this, 537, 193, textureX, textureY); // Import Box0
		defaultScopeModel[85] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Import Box0
		defaultScopeModel[86] = new ModelRendererTurbo(this, 881, 473, textureX, textureY); // Import Box0

		defaultScopeModel[0].addShapeBox(71F, -39F, -12F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(-119F, -62.5F, 17F);

		defaultScopeModel[1].addShapeBox(71F, -39F, -12F, 6, 9, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(-115F, -62.5F, 17F);

		defaultScopeModel[2].addShapeBox(71F, -39F, -12F, 4, 2, 16, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[2].setRotationPoint(-119F, -64.5F, 3F);

		defaultScopeModel[3].addShapeBox(71F, -39F, -12F, 10, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(-129F, -64.5F, 17F);

		defaultScopeModel[4].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(-125.5F, -60.5F, 19F);

		defaultScopeModel[5].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[5].setRotationPoint(-125.5F, -62.5F, 19F);

		defaultScopeModel[6].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[6].setRotationPoint(-125.5F, -61.5F, 19F);

		defaultScopeModel[7].addShapeBox(71F, -39F, -12F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[7].setRotationPoint(-119F, -62.5F, 3F);

		defaultScopeModel[8].addShapeBox(71F, -39F, -12F, 6, 9, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[8].setRotationPoint(-115F, -62.5F, 3F);

		defaultScopeModel[9].addShapeBox(71F, -39F, -12F, 1, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[9].setRotationPoint(-120F, -64.5F, 3F);

		defaultScopeModel[10].addShapeBox(71F, -39F, -12F, 11, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[10].setRotationPoint(-130F, -61.5F, 7F);

		defaultScopeModel[11].addShapeBox(71F, -39F, -12F, 6, 2, 15, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[11].setRotationPoint(-128F, -64.5F, 2F);

		defaultScopeModel[12].addShapeBox(71F, -39F, -12F, 6, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[12].setRotationPoint(-128F, -62.5F, 2F);

		defaultScopeModel[13].addShapeBox(71F, -39F, -12F, 6, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		defaultScopeModel[13].setRotationPoint(-128F, -60.5F, 2F);

		defaultScopeModel[14].addShapeBox(71F, -39F, -12F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[14].setRotationPoint(-129F, -58.5F, 3F);

		defaultScopeModel[15].addShapeBox(71F, -39F, -12F, 4, 2, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[15].setRotationPoint(-124F, -60.5F, 3F);

		defaultScopeModel[16].addShapeBox(71F, -39F, -12F, 2, 4, 14, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[16].setRotationPoint(-122F, -64.5F, 3F);

		defaultScopeModel[17].addShapeBox(71F, -39F, -12F, 3, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[17].setRotationPoint(-129F, -60.5F, 3F);

		defaultScopeModel[18].addShapeBox(71F, -39F, -12F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[18].setRotationPoint(-129F, -61.5F, 3F);

		defaultScopeModel[19].addShapeBox(71F, -39F, -12F, 6, 1, 9, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[19].setRotationPoint(-127F, -66.5F, 7.5F);

		defaultScopeModel[20].addShapeBox(71F, -39F, -12F, 7, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[20].setRotationPoint(-127F, -70.5F, 7.5F);

		defaultScopeModel[21].addShapeBox(71F, -39F, -12F, 6, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[21].setRotationPoint(-127F, -65.5F, 7.5F);

		defaultScopeModel[22].addShapeBox(71F, -39F, -12F, 7, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box0
		defaultScopeModel[22].setRotationPoint(-127F, -71.5F, 4.5F);

		defaultScopeModel[23].addShapeBox(71F, -39F, -12F, 7, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[23].setRotationPoint(-127F, -82.5F, 4.5F);

		defaultScopeModel[24].addShapeBox(71F, -39F, -12F, 7, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[24].setRotationPoint(-127F, -83.5F, 4.5F);

		defaultScopeModel[25].addShapeBox(71F, -39F, -12F, 7, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[25].setRotationPoint(-127F, -82.5F, 16.5F);

		defaultScopeModel[26].addShapeBox(71F, -39F, -12F, 7, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[26].setRotationPoint(-127F, -83.5F, 16.5F);

		defaultScopeModel[27].addShapeBox(71F, -39F, -12F, 6, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		defaultScopeModel[27].setRotationPoint(-117.5F, -57F, 2.5F);

		defaultScopeModel[28].addShapeBox(71F, -39F, -12F, 6, 2, 19, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[28].setRotationPoint(-117.5F, -61F, 2.5F);

		defaultScopeModel[29].addShapeBox(71F, -39F, -12F, 6, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[29].setRotationPoint(-117.5F, -59F, 2.5F);

		defaultScopeModel[30].addShapeBox(71F, -39F, -12F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		defaultScopeModel[30].setRotationPoint(-126.5F, -76.5F, 19F);

		defaultScopeModel[31].addShapeBox(71F, -39F, -12F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[31].setRotationPoint(-126.5F, -80.5F, 19F);

		defaultScopeModel[32].addShapeBox(71F, -39F, -12F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[32].setRotationPoint(-126.5F, -78.5F, 19F);

		defaultScopeModel[33].addShapeBox(71F, -39F, -12F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		defaultScopeModel[33].setRotationPoint(-126.5F, -76.5F, 4F);

		defaultScopeModel[34].addShapeBox(71F, -39F, -12F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[34].setRotationPoint(-126.5F, -80.5F, 4F);

		defaultScopeModel[35].addShapeBox(71F, -39F, -12F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[35].setRotationPoint(-126.5F, -78.5F, 4F);

		defaultScopeModel[36].addShapeBox(71F, -39F, -12F, 7, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[36].setRotationPoint(-127F, -73.5F, 7.5F);

		defaultScopeModel[37].addShapeBox(71F, -39F, -12F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[37].setRotationPoint(-126F, -77.5F, 10F);

		defaultScopeModel[38].addShapeBox(71F, -39F, -12F, 5, 2, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[38].setRotationPoint(-126F, -79.5F, 12F);

		defaultScopeModel[39].addShapeBox(71F, -39F, -12F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[39].setRotationPoint(-126F, -79.5F, 10F);

		defaultScopeModel[40].addShapeBox(71F, -39F, -12F, 5, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[40].setRotationPoint(-126F, -80.5F, 12F);

		defaultScopeModel[41].addShapeBox(71F, -39F, -12F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		defaultScopeModel[41].setRotationPoint(-126F, -80.5F, 10F);

		defaultScopeModel[42].addShapeBox(71F, -39F, -12F, 5, 1, 2, 0F,0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[42].setRotationPoint(-126F, -81.5F, 12F);

		defaultScopeModel[43].addShapeBox(71F, -39F, -12F, 5, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		defaultScopeModel[43].setRotationPoint(-126F, -81.5F, 10F);

		defaultScopeModel[44].addShapeBox(71F, -39F, -12F, 2, 1, 9, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Import Box0
		defaultScopeModel[44].setRotationPoint(-124.5F, -75F, 7.5F);

		defaultScopeModel[45].addShapeBox(71F, -39F, -12F, 2, 1, 9, 0F,-0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		defaultScopeModel[45].setRotationPoint(-124.5F, -76F, 7.5F);

		defaultScopeModel[46].addShapeBox(71F, -39F, -12F, 2, 1, 9, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		defaultScopeModel[46].setRotationPoint(-124.5F, -75.5F, 7.5F);

		defaultScopeModel[47].addShapeBox(71F, -39F, -12F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		defaultScopeModel[47].setRotationPoint(-120F, -57.5F, 3F);

		defaultScopeModel[48].addShapeBox(71F, -39F, -12F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[48].setRotationPoint(164F, -62.5F, 17F);

		defaultScopeModel[49].addShapeBox(71F, -39F, -12F, 6, 9, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[49].setRotationPoint(168F, -62.5F, 17F);

		defaultScopeModel[50].addShapeBox(71F, -39F, -12F, 4, 2, 16, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[50].setRotationPoint(164F, -64.5F, 3F);

		defaultScopeModel[51].addShapeBox(71F, -39F, -12F, 10, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[51].setRotationPoint(154F, -64.5F, 17F);

		defaultScopeModel[52].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		defaultScopeModel[52].setRotationPoint(157.5F, -60.5F, 19F);

		defaultScopeModel[53].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[53].setRotationPoint(157.5F, -62.5F, 19F);

		defaultScopeModel[54].addShapeBox(71F, -39F, -12F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[54].setRotationPoint(157.5F, -61.5F, 19F);

		defaultScopeModel[55].addShapeBox(71F, -39F, -12F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[55].setRotationPoint(164F, -62.5F, 3F);

		defaultScopeModel[56].addShapeBox(71F, -39F, -12F, 6, 9, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[56].setRotationPoint(168F, -62.5F, 3F);

		defaultScopeModel[57].addShapeBox(71F, -39F, -12F, 1, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[57].setRotationPoint(163F, -64.5F, 3F);

		defaultScopeModel[58].addShapeBox(71F, -39F, -12F, 11, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[58].setRotationPoint(153F, -61.5F, 7F);

		defaultScopeModel[59].addShapeBox(71F, -39F, -12F, 6, 2, 15, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[59].setRotationPoint(155F, -64.5F, 2F);

		defaultScopeModel[60].addShapeBox(71F, -39F, -12F, 6, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[60].setRotationPoint(155F, -62.5F, 2F);

		defaultScopeModel[61].addShapeBox(71F, -39F, -12F, 6, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		defaultScopeModel[61].setRotationPoint(155F, -60.5F, 2F);

		defaultScopeModel[62].addShapeBox(71F, -39F, -12F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[62].setRotationPoint(154F, -58.5F, 3F);

		defaultScopeModel[63].addShapeBox(71F, -39F, -12F, 4, 2, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[63].setRotationPoint(159F, -60.5F, 3F);

		defaultScopeModel[64].addShapeBox(71F, -39F, -12F, 2, 4, 14, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[64].setRotationPoint(161F, -64.5F, 3F);

		defaultScopeModel[65].addShapeBox(71F, -39F, -12F, 3, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[65].setRotationPoint(154F, -60.5F, 3F);

		defaultScopeModel[66].addShapeBox(71F, -39F, -12F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[66].setRotationPoint(154F, -61.5F, 3F);

		defaultScopeModel[67].addShapeBox(71F, -39F, -12F, 7, 11, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[67].setRotationPoint(156F, -75.5F, 8.5F);

		defaultScopeModel[68].addShapeBox(71F, -39F, -12F, 6, 1, 2, 0F,-1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[68].setRotationPoint(156.5F, -83.5F, 7.5F);

		defaultScopeModel[69].addShapeBox(71F, -39F, -12F, 6, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		defaultScopeModel[69].setRotationPoint(165.5F, -57F, 2.5F);

		defaultScopeModel[70].addShapeBox(71F, -39F, -12F, 6, 2, 19, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[70].setRotationPoint(165.5F, -61F, 2.5F);

		defaultScopeModel[71].addShapeBox(71F, -39F, -12F, 6, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[71].setRotationPoint(165.5F, -59F, 2.5F);

		defaultScopeModel[72].addShapeBox(71F, -39F, -12F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		defaultScopeModel[72].setRotationPoint(163F, -57.5F, 3F);

		defaultScopeModel[73].addShapeBox(71F, -39F, -12F, 7, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[73].setRotationPoint(-127F, -64.5F, 7.5F);

		defaultScopeModel[74].addShapeBox(71F, -39F, -12F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[74].setRotationPoint(156F, -64.5F, 8.5F);

		defaultScopeModel[75].addShapeBox(71F, -39F, -12F, 7, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[75].setRotationPoint(156F, -77.5F, 13.5F);

		defaultScopeModel[76].addShapeBox(71F, -39F, -12F, 7, 2, 2, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[76].setRotationPoint(156F, -77.5F, 8.5F);

		defaultScopeModel[77].addShapeBox(71F, -39F, -12F, 7, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[77].setRotationPoint(156F, -79.5F, 7F);

		defaultScopeModel[78].addShapeBox(71F, -39F, -12F, 7, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[78].setRotationPoint(156F, -79.5F, 15F);

		defaultScopeModel[79].addShapeBox(71F, -39F, -12F, 7, 1, 3, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[79].setRotationPoint(156F, -76.5F, 10.5F);

		defaultScopeModel[80].addShapeBox(71F, -39F, -12F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[80].setRotationPoint(156F, -80.5F, 15.5F);

		defaultScopeModel[81].addShapeBox(71F, -39F, -12F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[81].setRotationPoint(156F, -80.5F, 6.5F);

		defaultScopeModel[82].addShapeBox(71F, -39F, -12F, 7, 2, 2, 0F,-0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[82].setRotationPoint(156F, -82.5F, 15.5F);

		defaultScopeModel[83].addShapeBox(71F, -39F, -12F, 7, 2, 2, 0F,-0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[83].setRotationPoint(156F, -82.5F, 6.5F);

		defaultScopeModel[84].addShapeBox(71F, -39F, -12F, 6, 1, 2, 0F,-1.5F, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[84].setRotationPoint(156.5F, -83.5F, 14.5F);

		defaultScopeModel[85].addShapeBox(71F, -39F, -12F, 3, 4, 2, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		defaultScopeModel[85].setRotationPoint(158F, -80.5F, 11F);

		defaultScopeModel[86].addShapeBox(71F, -39F, -12F, 5, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[86].setRotationPoint(158F, -63.5F, 8.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 1, 433, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 105, 433, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 553, 433, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 665, 433, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 777, 433, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 969, 425, textureX, textureY); // Import Box0
		ammoModel[6] = new ModelRendererTurbo(this, 881, 433, textureX, textureY); // Import Box0
		ammoModel[7] = new ModelRendererTurbo(this, 385, 441, textureX, textureY); // Import Box0
		ammoModel[8] = new ModelRendererTurbo(this, 921, 441, textureX, textureY); // Import Box0
		ammoModel[9] = new ModelRendererTurbo(this, 217, 449, textureX, textureY); // Import Box0
		ammoModel[10] = new ModelRendererTurbo(this, 369, 385, textureX, textureY); // Import Box0
		ammoModel[11] = new ModelRendererTurbo(this, 249, 449, textureX, textureY); // Import Box0
		ammoModel[12] = new ModelRendererTurbo(this, 425, 385, textureX, textureY); // Import Box0
		ammoModel[13] = new ModelRendererTurbo(this, 481, 385, textureX, textureY); // Import Box0
		ammoModel[14] = new ModelRendererTurbo(this, 425, 449, textureX, textureY); // Import Box0
		ammoModel[15] = new ModelRendererTurbo(this, 537, 385, textureX, textureY); // Import Box0
		ammoModel[16] = new ModelRendererTurbo(this, 265, 465, textureX, textureY); // Import Box0
		ammoModel[17] = new ModelRendererTurbo(this, 801, 689, textureX, textureY); // Import Box0
		ammoModel[18] = new ModelRendererTurbo(this, 969, 689, textureX, textureY); // Import Box0
		ammoModel[19] = new ModelRendererTurbo(this, 385, 705, textureX, textureY); // Import Box0
		ammoModel[20] = new ModelRendererTurbo(this, 441, 705, textureX, textureY); // Import Box0
		ammoModel[21] = new ModelRendererTurbo(this, 857, 705, textureX, textureY); // Import Box0

		ammoModel[0].addShapeBox(71F, -39F, -12F, 33, 18, 18, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F); // Import Box0
		ammoModel[0].setRotationPoint(-5F, 32F, 3F);

		ammoModel[1].addShapeBox(71F, -39F, -12F, 34, 27, 18, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -5F, 0F, 0F); // Import Box0
		ammoModel[1].setRotationPoint(-1F, 50F, 3F);

		ammoModel[2].addShapeBox(71F, -39F, -12F, 34, 18, 18, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -4F, 0F, 0F); // Import Box0
		ammoModel[2].setRotationPoint(5F, 77F, 3F);

		ammoModel[3].addShapeBox(71F, -39F, -12F, 35, 12, 18, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9F, 16F, 0F, 6F, 4F, 0F, 6F, 4F, 0F, -9F, 16F, 0F); // Import Box0
		ammoModel[3].setRotationPoint(10F, 95F, 3F);

		ammoModel[4].addShapeBox(71F, -39F, -12F, 33, 18, 18, 0F,-1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F); // Import Box0
		ammoModel[4].setRotationPoint(-9F, 14F, 3F);

		ammoModel[5].addShapeBox(71F, -39F, -12F, 3, 18, 12, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F); // Import Box0
		ammoModel[5].setRotationPoint(-8F, 32F, 6F);

		ammoModel[6].addShapeBox(71F, -39F, -12F, 4, 27, 12, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -5F, 0F, 0F); // Import Box0
		ammoModel[6].setRotationPoint(-4F, 50F, 6F);

		ammoModel[7].addShapeBox(71F, -39F, -12F, 4, 18, 12, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -4F, 0F, 0F); // Import Box0
		ammoModel[7].setRotationPoint(2F, 77F, 6F);

		ammoModel[8].addShapeBox(71F, -39F, -12F, 8, 29, 12, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -9.5F, 0F, 0F); // Import Box0
		ammoModel[8].setRotationPoint(7F, 95F, 6F);

		ammoModel[9].addShapeBox(71F, -39F, -12F, 3, 18, 12, 0F,-1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F); // Import Box0
		ammoModel[9].setRotationPoint(-12F, 23F, 6F);

		ammoModel[10].addShapeBox(71F, -39F, -12F, 1, 3, 14, 0F,0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F); // Import Box0
		ammoModel[10].setRotationPoint(44F, 52F, 5F);

		ammoModel[11].addShapeBox(71F, -39F, -12F, 2, 17, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -4F, 0F, 0F); // Import Box0
		ammoModel[11].setRotationPoint(41F, 35F, 5F);

		ammoModel[12].addShapeBox(71F, -39F, -12F, 1, 3, 14, 0F,1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0.35F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.35F, 0F, 0F); // Import Box0
		ammoModel[12].setRotationPoint(40F, 32F, 5F);

		ammoModel[13].addShapeBox(71F, -39F, -12F, 1, 3, 14, 0F,0.65F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.65F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F); // Import Box0
		ammoModel[13].setRotationPoint(56F, 93F, 5F);

		ammoModel[14].addShapeBox(71F, -39F, -12F, 2, 17, 14, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, -5F, 0F, 0F); // Import Box0
		ammoModel[14].setRotationPoint(52F, 76F, 5F);

		ammoModel[15].addShapeBox(71F, -39F, -12F, 1, 3, 14, 0F,1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0.35F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.35F, 0F, 0F); // Import Box0
		ammoModel[15].setRotationPoint(50F, 73F, 5F);

		ammoModel[16].addShapeBox(71F, -39F, -12F, 47, 4, 20, 0F,0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, -5F, 21F, 0F, 2F, 3F, 0F, 2F, 3F, 0F, -5F, 21F, 0F); // Import Box0
		ammoModel[16].setRotationPoint(15F, 106F, 2F);

		ammoModel[17].addShapeBox(71F, -39F, -12F, 10, 18, 14, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F); // Import Box0
		ammoModel[17].setRotationPoint(29F, 32F, 5F);

		ammoModel[18].addShapeBox(71F, -39F, -12F, 11, 27, 14, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -5F, 0F, 0F); // Import Box0
		ammoModel[18].setRotationPoint(33F, 50F, 5F);

		ammoModel[19].addShapeBox(71F, -39F, -12F, 11, 18, 14, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -4F, 0F, 0F); // Import Box0
		ammoModel[19].setRotationPoint(39F, 77F, 5F);

		ammoModel[20].addShapeBox(71F, -39F, -12F, 12, 12, 14, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9F, 9F, 0F, 6F, 4F, 0F, 6F, 4F, 0F, -9F, 9F, 0F); // Import Box0
		ammoModel[20].setRotationPoint(44F, 95F, 5F);

		ammoModel[21].addShapeBox(71F, -39F, -12F, 10, 18, 14, 0F,-1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F); // Import Box0
		ammoModel[21].setRotationPoint(25F, 14F, 5F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 257, 417, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 57, 473, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Import Box0
		slideModel[3] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Import Box0
		slideModel[4] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Import Box0
		slideModel[5] = new ModelRendererTurbo(this, 601, 113, textureX, textureY); // Import Box0
		slideModel[6] = new ModelRendererTurbo(this, 713, 121, textureX, textureY); // Import Box0
		slideModel[7] = new ModelRendererTurbo(this, 793, 121, textureX, textureY); // Import Box0
		slideModel[8] = new ModelRendererTurbo(this, 817, 121, textureX, textureY); // Import Box0
		slideModel[9] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Import Box0
		slideModel[10] = new ModelRendererTurbo(this, 641, 97, textureX, textureY); // Import Box0
		slideModel[11] = new ModelRendererTurbo(this, 417, 889, textureX, textureY); // Import Box0
		slideModel[12] = new ModelRendererTurbo(this, 569, 889, textureX, textureY); // Import Box0

		slideModel[0].addShapeBox(71F, -39F, -12F, 4, 1, 17, 0F,-1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		slideModel[0].setRotationPoint(68F, -42.5F, 22.5F);

		slideModel[1].addShapeBox(71F, -39F, -12F, 4, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F); // Import Box0
		slideModel[1].setRotationPoint(68F, -39.5F, 22.5F);

		slideModel[2].addShapeBox(71F, -39F, -12F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		slideModel[2].setRotationPoint(68F, -41.5F, 38.5F);

		slideModel[3].addShapeBox(71F, -39F, -12F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		slideModel[3].setRotationPoint(68F, -41.5F, 37.5F);

		slideModel[4].addShapeBox(71F, -39F, -12F, 4, 1, 1, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		slideModel[4].setRotationPoint(68F, -40.5F, 37.5F);

		slideModel[5].addShapeBox(71F, -39F, -12F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		slideModel[5].setRotationPoint(68F, -41.5F, 22.5F);

		slideModel[6].addShapeBox(71F, -39F, -12F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		slideModel[6].setRotationPoint(68.5F, -40F, 20.5F);

		slideModel[7].addShapeBox(71F, -39F, -12F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		slideModel[7].setRotationPoint(68.5F, -41F, 20.5F);

		slideModel[8].addShapeBox(71F, -39F, -12F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		slideModel[8].setRotationPoint(68.5F, -42F, 20.5F);

		slideModel[9].addShapeBox(71F, -39F, -12F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		slideModel[9].setRotationPoint(68F, -40.5F, 24F);

		slideModel[10].addShapeBox(71F, -39F, -12F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box0
		slideModel[10].setRotationPoint(68F, -41.5F, 24F);

		slideModel[11].addShapeBox(71F, -39F, -12F, 69, 9, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		slideModel[11].setRotationPoint(-33F, -29F, 1.5F);

		slideModel[12].addShapeBox(71F, -39F, -12F, 69, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		slideModel[12].setRotationPoint(-33F, -32F, 1.5F);
	}
}