//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: dsr
// Model Creator: 
// Created on: 01.08.2018 - 18:40:03
// Last changed on: 01.08.2018 - 18:40:03

package com.modularwarfare.client.model.test; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

//import com.flansmod.client.model.EnumAnimationType;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class dsr1 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public dsr1() //Same as Filename
	{
		modelScale = 0.09F;
		gunModel = new ModelRendererTurbo[550];
		defaultScopeModel = new ModelRendererTurbo[124];
		ammoModel = new ModelRendererTurbo[16];
		pumpModel = new ModelRendererTurbo[23];
		fullammoModel = new ModelRendererTurbo[16];

		initgunModel_1();
		initgunModel_2();
		initdefaultScopeModel_1();
		initammoModel_1();
		initpumpModel_1();
		initfullammoModel_1();

		translateAll(0F, -13F, 0F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.05F, 0F);//forward/up/? 

		gunSlideDistance = 0F;
		//animationType = EnumAnimationType.CUSTOM;

		rotateGunVertical = 45F;
		rotateGunHorizontal = 1F;
		tiltGun = 25F;
		tiltGunTime = 0.20F;
		unloadClipTime = 0.30F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.15F;
		translateGun = new Vector3f(7 /16F, 1F /16F, -2F /16F);
		rotateClipVertical = 1F;
		rotateClipHorizontal = 1F;
		tiltClip = 28F;
		translateClip = new Vector3f(-4 /16F, -30F /16F, 1F /16F);

		hasFlash = false;
        hasArms = true;
        
        leftArmPos = new Vector3f(0.08F, -0.25F,- 0.03F);
        leftArmRot = new Vector3f(80.0F, 45.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.54F, -0.80F, 0.01F);
        leftArmReloadRot = new Vector3f(80.0F, 45.0F, -0.0F);
 
        rightArmPos = new Vector3f(0.3F, -0.5F, 0.03F);
        rightArmRot = new Vector3f(-30.0F, 0.0F, -80.0F);
        rightArmReloadPos = new Vector3f(0.3F, -0.55F, 0.03F);
        rightArmReloadRot = new Vector3f(-30.0F, 0.0F, -80.0F);
        
        rightArmScale = new Vector3f(0.8F, 0.8F, 0.8F);
        leftArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
 
        rightHandAmmo = false;
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
		stanceRotate = new Vector3f(40.0F, 0.0F, -0.0F);
		stanceTranslate = new Vector3f(0.4F, 0.0F, 0.0F);
		
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
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box1
		gunModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box2
		gunModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box2
		gunModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box2
		gunModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box1
		gunModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box1
		gunModel[6] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box1
		gunModel[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box2
		gunModel[8] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box2
		gunModel[9] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box2
		gunModel[10] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box2
		gunModel[11] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box2
		gunModel[12] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box2
		gunModel[13] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box2
		gunModel[14] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import Box1
		gunModel[15] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Box1
		gunModel[16] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box1
		gunModel[17] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box1
		gunModel[18] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box1
		gunModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box1
		gunModel[20] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box1
		gunModel[21] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Import Box1
		gunModel[22] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box1
		gunModel[23] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Import Box1
		gunModel[24] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box1
		gunModel[25] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Import Box1
		gunModel[26] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box1
		gunModel[27] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import Box1
		gunModel[28] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import Box1
		gunModel[29] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box1
		gunModel[30] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Import Box1
		gunModel[31] = new ModelRendererTurbo(this, 585, 25, textureX, textureY); // Import Box8
		gunModel[32] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import Box8
		gunModel[33] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); // Import Box8
		gunModel[34] = new ModelRendererTurbo(this, 633, 25, textureX, textureY); // Import Box8
		gunModel[35] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Import Box8
		gunModel[36] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Import Box8
		gunModel[37] = new ModelRendererTurbo(this, 809, 33, textureX, textureY); // Import Box8
		gunModel[38] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Import Box8
		gunModel[39] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Import Box8
		gunModel[40] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Import Box8
		gunModel[41] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Import Box8
		gunModel[42] = new ModelRendererTurbo(this, 737, 41, textureX, textureY); // Import Box8
		gunModel[43] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import Box8
		gunModel[44] = new ModelRendererTurbo(this, 617, 41, textureX, textureY); // Import Box8
		gunModel[45] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import Box8
		gunModel[46] = new ModelRendererTurbo(this, 585, 49, textureX, textureY); // Import Box8
		gunModel[47] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Import Box8
		gunModel[48] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box8
		gunModel[49] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Import Box8
		gunModel[50] = new ModelRendererTurbo(this, 889, 49, textureX, textureY); // Import Box8
		gunModel[51] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import Box8
		gunModel[52] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import Box8
		gunModel[53] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Import Box8
		gunModel[54] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box8
		gunModel[55] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Import Box8
		gunModel[56] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Import Box8
		gunModel[57] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import Box8
		gunModel[58] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Import Box8
		gunModel[59] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Import Box8
		gunModel[60] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Import Box8
		gunModel[61] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Import Box8
		gunModel[62] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Import Box8
		gunModel[63] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Import Box8
		gunModel[64] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Import Box8
		gunModel[65] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Import Box8
		gunModel[66] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Import Box8
		gunModel[67] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Import Box8
		gunModel[68] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box8
		gunModel[69] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box8
		gunModel[70] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box8
		gunModel[71] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box8
		gunModel[72] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box8
		gunModel[73] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box8
		gunModel[74] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box8
		gunModel[75] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Import Box8
		gunModel[76] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box8
		gunModel[77] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Import Box8
		gunModel[78] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Import Box8
		gunModel[79] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Import Box8
		gunModel[80] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Box8
		gunModel[81] = new ModelRendererTurbo(this, 849, 57, textureX, textureY); // Import Box8
		gunModel[82] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Import Box8
		gunModel[83] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Import Box8
		gunModel[84] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Import Box8
		gunModel[85] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Import Box8
		gunModel[86] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Import Box8
		gunModel[87] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Import Box8
		gunModel[88] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Import Box8
		gunModel[89] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Import Box8
		gunModel[90] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Import Box8
		gunModel[91] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Import Box8
		gunModel[92] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); // Import Box8
		gunModel[93] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Import Box8
		gunModel[94] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Import Box8
		gunModel[95] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Import Box8
		gunModel[96] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Import Box8
		gunModel[97] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Import Box1
		gunModel[98] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Import Box1
		gunModel[99] = new ModelRendererTurbo(this, 745, 65, textureX, textureY); // Import Box1
		gunModel[100] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box1
		gunModel[101] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import Box1
		gunModel[102] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Import Box1
		gunModel[103] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Import Box16
		gunModel[104] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Import Box8
		gunModel[105] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Import Box8
		gunModel[106] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Import Box8
		gunModel[107] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Import Box8
		gunModel[108] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Import Box1
		gunModel[109] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Import Box1
		gunModel[110] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Import Box1
		gunModel[111] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Import Box1
		gunModel[112] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Import Box1
		gunModel[113] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Import Box1
		gunModel[114] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Import Box8
		gunModel[115] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Import Box8
		gunModel[116] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Import Box8
		gunModel[117] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Import Box8
		gunModel[118] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Import Box31
		gunModel[119] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Import Box31
		gunModel[120] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Import Box0
		gunModel[121] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box1
		gunModel[122] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Import Box2
		gunModel[123] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Import Box1
		gunModel[124] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Import Box1
		gunModel[125] = new ModelRendererTurbo(this, 889, 81, textureX, textureY); // Import Box1
		gunModel[126] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Import Box1
		gunModel[127] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Import Box1
		gunModel[128] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Import Box31
		gunModel[129] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Import Box31
		gunModel[130] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Import Box31
		gunModel[131] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Import Box31
		gunModel[132] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Import Box31
		gunModel[133] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Import Box31
		gunModel[134] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import Box31
		gunModel[135] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Import Box31
		gunModel[136] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Import Box31
		gunModel[137] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Import Box31
		gunModel[138] = new ModelRendererTurbo(this, 769, 81, textureX, textureY); // Import Box31
		gunModel[139] = new ModelRendererTurbo(this, 537, 89, textureX, textureY); // Import Box31
		gunModel[140] = new ModelRendererTurbo(this, 569, 89, textureX, textureY); // Import Box31
		gunModel[141] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Import Box31
		gunModel[142] = new ModelRendererTurbo(this, 785, 89, textureX, textureY); // Import Box31
		gunModel[143] = new ModelRendererTurbo(this, 825, 89, textureX, textureY); // Import Box31
		gunModel[144] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Import Box31
		gunModel[145] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Import Box31
		gunModel[146] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Import Box31
		gunModel[147] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Import Box31
		gunModel[148] = new ModelRendererTurbo(this, 513, 97, textureX, textureY); // Import Box31
		gunModel[149] = new ModelRendererTurbo(this, 673, 97, textureX, textureY); // Import Box31
		gunModel[150] = new ModelRendererTurbo(this, 729, 97, textureX, textureY); // Import Box31
		gunModel[151] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Import Box31
		gunModel[152] = new ModelRendererTurbo(this, 865, 97, textureX, textureY); // Import Box31
		gunModel[153] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Import Box31
		gunModel[154] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Import Box31
		gunModel[155] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Import Box31
		gunModel[156] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Import Box31
		gunModel[157] = new ModelRendererTurbo(this, 529, 105, textureX, textureY); // Import Box31
		gunModel[158] = new ModelRendererTurbo(this, 569, 105, textureX, textureY); // Import Box31
		gunModel[159] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Import Box31
		gunModel[160] = new ModelRendererTurbo(this, 657, 105, textureX, textureY); // Import Box31
		gunModel[161] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Import Box31
		gunModel[162] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Import Box31
		gunModel[163] = new ModelRendererTurbo(this, 713, 105, textureX, textureY); // Import Box31
		gunModel[164] = new ModelRendererTurbo(this, 881, 105, textureX, textureY); // Import Box31
		gunModel[165] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Import Box31
		gunModel[166] = new ModelRendererTurbo(this, 961, 105, textureX, textureY); // Import Box31
		gunModel[167] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box31
		gunModel[168] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Import Box31
		gunModel[169] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Import Box31
		gunModel[170] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Import Box31
		gunModel[171] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Import Box31
		gunModel[172] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Import Box31
		gunModel[173] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Import Box31
		gunModel[174] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Import Box31
		gunModel[175] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Import Box31
		gunModel[176] = new ModelRendererTurbo(this, 585, 113, textureX, textureY); // Import Box31
		gunModel[177] = new ModelRendererTurbo(this, 673, 113, textureX, textureY); // Import Box31
		gunModel[178] = new ModelRendererTurbo(this, 729, 113, textureX, textureY); // Import Box31
		gunModel[179] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Import Box31
		gunModel[180] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Import Box31
		gunModel[181] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Import Box31
		gunModel[182] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Import Box31
		gunModel[183] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Import Box31
		gunModel[184] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Import Box31
		gunModel[185] = new ModelRendererTurbo(this, 809, 113, textureX, textureY); // Import Box31
		gunModel[186] = new ModelRendererTurbo(this, 865, 113, textureX, textureY); // Import Box31
		gunModel[187] = new ModelRendererTurbo(this, 897, 113, textureX, textureY); // Import Box31
		gunModel[188] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Import Box31
		gunModel[189] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Import Box31
		gunModel[190] = new ModelRendererTurbo(this, 521, 121, textureX, textureY); // Import Box31
		gunModel[191] = new ModelRendererTurbo(this, 769, 121, textureX, textureY); // Import Box31
		gunModel[192] = new ModelRendererTurbo(this, 825, 121, textureX, textureY); // Import Box31
		gunModel[193] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Import Box31
		gunModel[194] = new ModelRendererTurbo(this, 921, 121, textureX, textureY); // Import Box31
		gunModel[195] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Import Box31
		gunModel[196] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box31
		gunModel[197] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Import Box31
		gunModel[198] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Import Box31
		gunModel[199] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Import Box31
		gunModel[200] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Import Box31
		gunModel[201] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Import Box1
		gunModel[202] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Import Box1
		gunModel[203] = new ModelRendererTurbo(this, 593, 129, textureX, textureY); // Import Box1
		gunModel[204] = new ModelRendererTurbo(this, 633, 129, textureX, textureY); // Import Box1
		gunModel[205] = new ModelRendererTurbo(this, 673, 129, textureX, textureY); // Import Box1
		gunModel[206] = new ModelRendererTurbo(this, 713, 129, textureX, textureY); // Import Box1
		gunModel[207] = new ModelRendererTurbo(this, 865, 129, textureX, textureY); // Import Box1
		gunModel[208] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Import Box1
		gunModel[209] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Import Box1
		gunModel[210] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Import Box1
		gunModel[211] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box1
		gunModel[212] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import Box1
		gunModel[213] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Import Box1
		gunModel[214] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box1
		gunModel[215] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import Box1
		gunModel[216] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box1
		gunModel[217] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box1
		gunModel[218] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import Box1
		gunModel[219] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import Box1
		gunModel[220] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Import Box1
		gunModel[221] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Import Box31
		gunModel[222] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Import Box31
		gunModel[223] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Import Box31
		gunModel[224] = new ModelRendererTurbo(this, 545, 129, textureX, textureY); // Import Box31
		gunModel[225] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Import Box31
		gunModel[226] = new ModelRendererTurbo(this, 617, 129, textureX, textureY); // Import Box31
		gunModel[227] = new ModelRendererTurbo(this, 657, 129, textureX, textureY); // Import Box31
		gunModel[228] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Import Box31
		gunModel[229] = new ModelRendererTurbo(this, 737, 137, textureX, textureY); // Import Box31
		gunModel[230] = new ModelRendererTurbo(this, 697, 129, textureX, textureY); // Import Box31
		gunModel[231] = new ModelRendererTurbo(this, 809, 129, textureX, textureY); // Import Box31
		gunModel[232] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import Box31
		gunModel[233] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Import Box31
		gunModel[234] = new ModelRendererTurbo(this, 825, 137, textureX, textureY); // Import Box31
		gunModel[235] = new ModelRendererTurbo(this, 889, 137, textureX, textureY); // Import Box31
		gunModel[236] = new ModelRendererTurbo(this, 785, 137, textureX, textureY); // Import Box31
		gunModel[237] = new ModelRendererTurbo(this, 937, 137, textureX, textureY); // Import Box31
		gunModel[238] = new ModelRendererTurbo(this, 969, 137, textureX, textureY); // Import Box31
		gunModel[239] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Import Box31
		gunModel[240] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Import Box31
		gunModel[241] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Import Box31
		gunModel[242] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Import Box31
		gunModel[243] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Import Box31
		gunModel[244] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Import Box31
		gunModel[245] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box31
		gunModel[246] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Import Box31
		gunModel[247] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Import Box31
		gunModel[248] = new ModelRendererTurbo(this, 601, 145, textureX, textureY); // Import Box31
		gunModel[249] = new ModelRendererTurbo(this, 633, 145, textureX, textureY); // Import Box31
		gunModel[250] = new ModelRendererTurbo(this, 665, 145, textureX, textureY); // Import Box31
		gunModel[251] = new ModelRendererTurbo(this, 697, 145, textureX, textureY); // Import Box31
		gunModel[252] = new ModelRendererTurbo(this, 801, 145, textureX, textureY); // Import Box31
		gunModel[253] = new ModelRendererTurbo(this, 865, 145, textureX, textureY); // Import Box31
		gunModel[254] = new ModelRendererTurbo(this, 953, 145, textureX, textureY); // Import Box31
		gunModel[255] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Import Box31
		gunModel[256] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import Box31
		gunModel[257] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Import Box31
		gunModel[258] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Import Box31
		gunModel[259] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Import Box31
		gunModel[260] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Import Box31
		gunModel[261] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Import Box31
		gunModel[262] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Import Box31
		gunModel[263] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Import Box31
		gunModel[264] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Import Box31
		gunModel[265] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Import Box31
		gunModel[266] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Import Box31
		gunModel[267] = new ModelRendererTurbo(this, 617, 153, textureX, textureY); // Import Box31
		gunModel[268] = new ModelRendererTurbo(this, 713, 153, textureX, textureY); // Import Box31
		gunModel[269] = new ModelRendererTurbo(this, 761, 153, textureX, textureY); // Import Box31
		gunModel[270] = new ModelRendererTurbo(this, 649, 153, textureX, textureY); // Import Box31
		gunModel[271] = new ModelRendererTurbo(this, 681, 153, textureX, textureY); // Import Box31
		gunModel[272] = new ModelRendererTurbo(this, 817, 153, textureX, textureY); // Import Box31
		gunModel[273] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box31
		gunModel[274] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Import Box1
		gunModel[275] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY); // Import Box1
		gunModel[276] = new ModelRendererTurbo(this, 889, 153, textureX, textureY); // Import Box1
		gunModel[277] = new ModelRendererTurbo(this, 921, 153, textureX, textureY); // Import Box1
		gunModel[278] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Import Box1
		gunModel[279] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Import Box1
		gunModel[280] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box1
		gunModel[281] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box1
		gunModel[282] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Import Box1
		gunModel[283] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Import Box1
		gunModel[284] = new ModelRendererTurbo(this, 705, 169, textureX, textureY); // Import Box1
		gunModel[285] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Import Box1
		gunModel[286] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Import Box1
		gunModel[287] = new ModelRendererTurbo(this, 673, 177, textureX, textureY); // Import Box1
		gunModel[288] = new ModelRendererTurbo(this, 945, 161, textureX, textureY); // Import Box31
		gunModel[289] = new ModelRendererTurbo(this, 1001, 137, textureX, textureY); // Import Box31
		gunModel[290] = new ModelRendererTurbo(this, 977, 161, textureX, textureY); // Import Box31
		gunModel[291] = new ModelRendererTurbo(this, 1001, 161, textureX, textureY); // Import Box31
		gunModel[292] = new ModelRendererTurbo(this, 913, 169, textureX, textureY); // Import Box31
		gunModel[293] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Import Box31
		gunModel[294] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import Box31
		gunModel[295] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Import Box31
		gunModel[296] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Import Box31
		gunModel[297] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box31
		gunModel[298] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box31
		gunModel[299] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box31
		gunModel[300] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box31
		gunModel[301] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box31
		gunModel[302] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import Box31
		gunModel[303] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Import Box31
		gunModel[304] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Import Box31
		gunModel[305] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Import Box1
		gunModel[306] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Import Box1
		gunModel[307] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Import Box1
		gunModel[308] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Import Box1
		gunModel[309] = new ModelRendererTurbo(this, 921, 177, textureX, textureY); // Import Box1
		gunModel[310] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Import Box1
		gunModel[311] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Import Box1
		gunModel[312] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Import Box1
		gunModel[313] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Import Box1
		gunModel[314] = new ModelRendererTurbo(this, 577, 185, textureX, textureY); // Import Box1
		gunModel[315] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Import Box1
		gunModel[316] = new ModelRendererTurbo(this, 657, 185, textureX, textureY); // Import Box1
		gunModel[317] = new ModelRendererTurbo(this, 697, 185, textureX, textureY); // Import Box1
		gunModel[318] = new ModelRendererTurbo(this, 737, 185, textureX, textureY); // Import Box1
		gunModel[319] = new ModelRendererTurbo(this, 801, 185, textureX, textureY); // Import Box1
		gunModel[320] = new ModelRendererTurbo(this, 841, 185, textureX, textureY); // Import Box1
		gunModel[321] = new ModelRendererTurbo(this, 945, 185, textureX, textureY); // Import Box1
		gunModel[322] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Import Box1
		gunModel[323] = new ModelRendererTurbo(this, 865, 201, textureX, textureY); // Import Box1
		gunModel[324] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import Box1
		gunModel[325] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Import Box1
		gunModel[326] = new ModelRendererTurbo(this, 953, 161, textureX, textureY); // Import Box1
		gunModel[327] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Import Box1
		gunModel[328] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Import Box1
		gunModel[329] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Import Box1
		gunModel[330] = new ModelRendererTurbo(this, 553, 185, textureX, textureY); // Import Box1
		gunModel[331] = new ModelRendererTurbo(this, 633, 185, textureX, textureY); // Import Box1
		gunModel[332] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Import Box1
		gunModel[333] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Import Box1
		gunModel[334] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Import Box1
		gunModel[335] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Import Box1
		gunModel[336] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Import Box1
		gunModel[337] = new ModelRendererTurbo(this, 593, 193, textureX, textureY); // Import Box1
		gunModel[338] = new ModelRendererTurbo(this, 673, 193, textureX, textureY); // Import Box1
		gunModel[339] = new ModelRendererTurbo(this, 969, 193, textureX, textureY); // Import Box1
		gunModel[340] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box1
		gunModel[341] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Import Box1
		gunModel[342] = new ModelRendererTurbo(this, 905, 201, textureX, textureY); // Import Box1
		gunModel[343] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Import Box1
		gunModel[344] = new ModelRendererTurbo(this, 721, 185, textureX, textureY); // Import Box1
		gunModel[345] = new ModelRendererTurbo(this, 713, 209, textureX, textureY); // Import Box1
		gunModel[346] = new ModelRendererTurbo(this, 993, 185, textureX, textureY); // Import Box1
		gunModel[347] = new ModelRendererTurbo(this, 785, 185, textureX, textureY); // Import Box1
		gunModel[348] = new ModelRendererTurbo(this, 409, 209, textureX, textureY); // Import Box1
		gunModel[349] = new ModelRendererTurbo(this, 825, 185, textureX, textureY); // Import Box1
		gunModel[350] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Import Box1
		gunModel[351] = new ModelRendererTurbo(this, 545, 209, textureX, textureY); // Import Box1
		gunModel[352] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import Box1
		gunModel[353] = new ModelRendererTurbo(this, 625, 209, textureX, textureY); // Import Box1
		gunModel[354] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Import Box1
		gunModel[355] = new ModelRendererTurbo(this, 577, 209, textureX, textureY); // Import Box1
		gunModel[356] = new ModelRendererTurbo(this, 865, 185, textureX, textureY); // Import Box1
		gunModel[357] = new ModelRendererTurbo(this, 937, 209, textureX, textureY); // Import Box1
		gunModel[358] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Import Box1
		gunModel[359] = new ModelRendererTurbo(this, 657, 217, textureX, textureY); // Import Box1
		gunModel[360] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Import Box1
		gunModel[361] = new ModelRendererTurbo(this, 673, 225, textureX, textureY); // Import Box1
		gunModel[362] = new ModelRendererTurbo(this, 833, 217, textureX, textureY); // Import Box1
		gunModel[363] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Import Box1
		gunModel[364] = new ModelRendererTurbo(this, 913, 217, textureX, textureY); // Import Box1
		gunModel[365] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Import Box1
		gunModel[366] = new ModelRendererTurbo(this, 969, 217, textureX, textureY); // Import Box1
		gunModel[367] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Import Box1
		gunModel[368] = new ModelRendererTurbo(this, 609, 217, textureX, textureY); // Import Box1
		gunModel[369] = new ModelRendererTurbo(this, 361, 225, textureX, textureY); // Import Box1
		gunModel[370] = new ModelRendererTurbo(this, 521, 225, textureX, textureY); // Import Box1
		gunModel[371] = new ModelRendererTurbo(this, 625, 225, textureX, textureY); // Import Box1
		gunModel[372] = new ModelRendererTurbo(this, 753, 225, textureX, textureY); // Import Box1
		gunModel[373] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import Box1
		gunModel[374] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Import Box1
		gunModel[375] = new ModelRendererTurbo(this, 801, 225, textureX, textureY); // Import Box1
		gunModel[376] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import Box1
		gunModel[377] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Import Box1
		gunModel[378] = new ModelRendererTurbo(this, 873, 225, textureX, textureY); // Import Box1
		gunModel[379] = new ModelRendererTurbo(this, 993, 225, textureX, textureY); // Import Box1
		gunModel[380] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Import Box1
		gunModel[381] = new ModelRendererTurbo(this, 537, 225, textureX, textureY); // Import Box1
		gunModel[382] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Import Box1
		gunModel[383] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Import Box1
		gunModel[384] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Import Box1
		gunModel[385] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Import Box1
		gunModel[386] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Import Box1
		gunModel[387] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Import Box1
		gunModel[388] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box1
		gunModel[389] = new ModelRendererTurbo(this, 265, 241, textureX, textureY); // Import Box1
		gunModel[390] = new ModelRendererTurbo(this, 609, 241, textureX, textureY); // Import Box1
		gunModel[391] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Import Box1
		gunModel[392] = new ModelRendererTurbo(this, 505, 241, textureX, textureY); // Import Box1
		gunModel[393] = new ModelRendererTurbo(this, 945, 241, textureX, textureY); // Import Box1
		gunModel[394] = new ModelRendererTurbo(this, 193, 249, textureX, textureY); // Import Box1
		gunModel[395] = new ModelRendererTurbo(this, 713, 249, textureX, textureY); // Import Box1
		gunModel[396] = new ModelRendererTurbo(this, 113, 257, textureX, textureY); // Import Box1
		gunModel[397] = new ModelRendererTurbo(this, 873, 249, textureX, textureY); // Import Box1
		gunModel[398] = new ModelRendererTurbo(this, 241, 257, textureX, textureY); // Import Box1
		gunModel[399] = new ModelRendererTurbo(this, 497, 257, textureX, textureY); // Import Box1
		gunModel[400] = new ModelRendererTurbo(this, 913, 257, textureX, textureY); // Import Box1
		gunModel[401] = new ModelRendererTurbo(this, 345, 257, textureX, textureY); // Import Box1
		gunModel[402] = new ModelRendererTurbo(this, 777, 257, textureX, textureY); // Import Box1
		gunModel[403] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box1
		gunModel[404] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box1
		gunModel[405] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Import Box1
		gunModel[406] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import Box1
		gunModel[407] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Import Box1
		gunModel[408] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Import Box1
		gunModel[409] = new ModelRendererTurbo(this, 433, 257, textureX, textureY); // Import Box1
		gunModel[410] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Import Box1
		gunModel[411] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Import Box1
		gunModel[412] = new ModelRendererTurbo(this, 169, 265, textureX, textureY); // Import Box1
		gunModel[413] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import Box1
		gunModel[414] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Import Box1
		gunModel[415] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Import Box1
		gunModel[416] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Import Box1
		gunModel[417] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box1
		gunModel[418] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import Box1
		gunModel[419] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Import Box1
		gunModel[420] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import Box1
		gunModel[421] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Import Box1
		gunModel[422] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Import Box1
		gunModel[423] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Import Box1
		gunModel[424] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Import Box1
		gunModel[425] = new ModelRendererTurbo(this, 729, 41, textureX, textureY); // Import Box1
		gunModel[426] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Import Box1
		gunModel[427] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Import Box1
		gunModel[428] = new ModelRendererTurbo(this, 937, 49, textureX, textureY); // Import Box1
		gunModel[429] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Import Box1
		gunModel[430] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Import Box1
		gunModel[431] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Import Box1
		gunModel[432] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Import Box1
		gunModel[433] = new ModelRendererTurbo(this, 457, 265, textureX, textureY); // Import Box1
		gunModel[434] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import Box1
		gunModel[435] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Import Box1
		gunModel[436] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Import Box1
		gunModel[437] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Import Box1
		gunModel[438] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Import Box1
		gunModel[439] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Import Box1
		gunModel[440] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box1
		gunModel[441] = new ModelRendererTurbo(this, 585, 265, textureX, textureY); // Import Box1
		gunModel[442] = new ModelRendererTurbo(this, 625, 265, textureX, textureY); // Import Box1
		gunModel[443] = new ModelRendererTurbo(this, 657, 265, textureX, textureY); // Import Box1
		gunModel[444] = new ModelRendererTurbo(this, 825, 265, textureX, textureY); // Import Box1
		gunModel[445] = new ModelRendererTurbo(this, 97, 273, textureX, textureY); // Import Box1
		gunModel[446] = new ModelRendererTurbo(this, 337, 273, textureX, textureY); // Import Box1
		gunModel[447] = new ModelRendererTurbo(this, 521, 161, textureX, textureY); // Import Box1
		gunModel[448] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Import Box1
		gunModel[449] = new ModelRendererTurbo(this, 153, 281, textureX, textureY); // Import Box1
		gunModel[450] = new ModelRendererTurbo(this, 753, 281, textureX, textureY); // Import Box1
		gunModel[451] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Import Box1
		gunModel[452] = new ModelRendererTurbo(this, 969, 273, textureX, textureY); // Import Box1
		gunModel[453] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Import Box1
		gunModel[454] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box1
		gunModel[455] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box1
		gunModel[456] = new ModelRendererTurbo(this, 785, 241, textureX, textureY); // Import Box1
		gunModel[457] = new ModelRendererTurbo(this, 393, 249, textureX, textureY); // Import Box1
		gunModel[458] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Import Box8
		gunModel[459] = new ModelRendererTurbo(this, 441, 281, textureX, textureY); // Import Box8
		gunModel[460] = new ModelRendererTurbo(this, 393, 281, textureX, textureY); // Import Box8
		gunModel[461] = new ModelRendererTurbo(this, 1001, 273, textureX, textureY); // Import Box8
		gunModel[462] = new ModelRendererTurbo(this, 81, 281, textureX, textureY); // Import Box8
		gunModel[463] = new ModelRendererTurbo(this, 921, 281, textureX, textureY); // Import Box8
		gunModel[464] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Import Box8
		gunModel[465] = new ModelRendererTurbo(this, 129, 289, textureX, textureY); // Import Box8
		gunModel[466] = new ModelRendererTurbo(this, 177, 289, textureX, textureY); // Import Box8
		gunModel[467] = new ModelRendererTurbo(this, 209, 289, textureX, textureY); // Import Box8
		gunModel[468] = new ModelRendererTurbo(this, 249, 289, textureX, textureY); // Import Box8
		gunModel[469] = new ModelRendererTurbo(this, 289, 289, textureX, textureY); // Import Box8
		gunModel[470] = new ModelRendererTurbo(this, 745, 289, textureX, textureY); // Import Box8
		gunModel[471] = new ModelRendererTurbo(this, 785, 289, textureX, textureY); // Import Box8
		gunModel[472] = new ModelRendererTurbo(this, 553, 273, textureX, textureY); // Import Box8
		gunModel[473] = new ModelRendererTurbo(this, 561, 289, textureX, textureY); // Import Box8
		gunModel[474] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Import Box8
		gunModel[475] = new ModelRendererTurbo(this, 553, 73, textureX, textureY); // Import Box8
		gunModel[476] = new ModelRendererTurbo(this, 825, 289, textureX, textureY); // Import Box8
		gunModel[477] = new ModelRendererTurbo(this, 857, 289, textureX, textureY); // Import Box8
		gunModel[478] = new ModelRendererTurbo(this, 393, 337, textureX, textureY); // Import Box1
		gunModel[479] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box1
		gunModel[480] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box1
		gunModel[481] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box1
		gunModel[482] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Import Box1
		gunModel[483] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import Box1
		gunModel[484] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import Box1
		gunModel[485] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Import Box1
		gunModel[486] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box1
		gunModel[487] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Import Box1
		gunModel[488] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import Box1
		gunModel[489] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Import Box1
		gunModel[490] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import Box1
		gunModel[491] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Import Box1
		gunModel[492] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Import Box1
		gunModel[493] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Import Box1
		gunModel[494] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Import Box1
		gunModel[495] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Import Box1
		gunModel[496] = new ModelRendererTurbo(this, 553, 329, textureX, textureY); // Import Box1
		gunModel[497] = new ModelRendererTurbo(this, 449, 337, textureX, textureY); // Import Box1
		gunModel[498] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Import Box1
		gunModel[499] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Import Box1

		gunModel[0].addShapeBox(0F, 0F, 0F, 34, 5, 12, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Import Box1
		gunModel[0].setRotationPoint(23F, -36.5F, -6F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F); // Import Box2
		gunModel[1].setRotationPoint(24.1F, -33.75F, -6.25F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F); // Import Box2
		gunModel[2].setRotationPoint(23.1F, -33.75F, -6.25F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Import Box2
		gunModel[3].setRotationPoint(23.1F, -32.85F, -6.25F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 4, 5, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 3.5F, 0F); // Import Box1
		gunModel[4].setRotationPoint(19F, -36.5F, -6F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 5, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, -0.5F, 0.25F, 0F); // Import Box1
		gunModel[5].setRotationPoint(11F, -36.5F, -6F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 4, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box1
		gunModel[6].setRotationPoint(15F, -36.5F, -6F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Import Box2
		gunModel[7].setRotationPoint(8.7F, -32.85F, -6.25F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-1.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.75F, 0.5F, 0.5F, -1.75F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -1.75F, -0.25F, 0.5F); // Import Box2
		gunModel[8].setRotationPoint(8.45F, -33.35F, -6.25F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Import Box2
		gunModel[9].setRotationPoint(8.7F, -33.85F, -6.25F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-1.75F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.5F, -1.75F, -0.2F, 0.5F, -1.75F, -0.1F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0.5F, -1.75F, -0.1F, 0.5F); // Import Box2
		gunModel[10].setRotationPoint(7.45F, -32.75F, -6.25F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Import Box2
		gunModel[11].setRotationPoint(8.7F, -31.85F, -6.25F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-1.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, -1.25F, 0.25F, 0.5F, -1.25F, -0.75F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, -1.25F, -0.75F, 0.5F); // Import Box2
		gunModel[12].setRotationPoint(8.95F, -31.85F, -6.25F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-0.5F, -1F, 0F, -1.25F, -0.75F, 0F, -1.25F, -0.75F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F); // Import Box2
		gunModel[13].setRotationPoint(8.7F, -34.6F, -6.25F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 50, 5, 12, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Import Box1
		gunModel[14].setRotationPoint(-38F, -36.5F, -6F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 5, 13, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box1
		gunModel[15].setRotationPoint(16.5F, -34.5F, -6.25F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[16].setRotationPoint(15.5F, -29.5F, -5.25F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[17].setRotationPoint(15.5F, -28.5F, -5.25F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Import Box1
		gunModel[18].setRotationPoint(15.5F, -27.5F, -5.25F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -2.5F, 0.25F, 0.25F, -2.5F, 0.25F); // Import Box1
		gunModel[19].setRotationPoint(16.5F, -34.5F, 6.75F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Import Box1
		gunModel[20].setRotationPoint(16.5F, -34.25F, -2.75F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 95, 5, 12, 0F,0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box1
		gunModel[21].setRotationPoint(-38F, -41.5F, -6F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 113, 1, 4, 0F,0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F); // Import Box1
		gunModel[22].setRotationPoint(-28.75F, -42.5F, -2F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 72, 1, 8, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		gunModel[23].setRotationPoint(-28.75F, -44F, -4F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 27, 1, 4, 0F,0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import Box1
		gunModel[24].setRotationPoint(57.25F, -41.5F, -2F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 53, 9, 12, 0F,0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import Box1
		gunModel[25].setRotationPoint(23F, -31.25F, -6F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 4, 9, 12, 0F,0F, -3.25F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -3.25F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box1
		gunModel[26].setRotationPoint(19F, -31.25F, -6F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 4, 9, 12, 0F,-0.5F, 0F, 0.5F, 0F, -3.25F, 0.5F, 0F, -3.25F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Import Box1
		gunModel[27].setRotationPoint(11F, -31.25F, -6F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 4, 9, 12, 0F,0F, -3.25F, 0.5F, 0F, -3.25F, 0.5F, 0F, -3.25F, 0.5F, 0F, -3.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box1
		gunModel[28].setRotationPoint(15F, -31.25F, -6F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 74, 9, 12, 0F,0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 18.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 18.5F, 0F, 0.5F); // Import Box1
		gunModel[29].setRotationPoint(-62F, -31.25F, -6F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 156, 2, 12, 0F,0.5F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.25F, -1.5F, -2.25F, -0.25F, -1.5F, -2.25F, -0.25F, -1.5F, 0.5F, -0.25F, -1.5F); // Import Box1
		gunModel[30].setRotationPoint(-80F, -22.25F, -6F);

		gunModel[31].addBox(0F, 0F, 0F, 9, 5, 11, 0F); // Import Box8
		gunModel[31].setRotationPoint(-6F, -2F, -5.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[32].setRotationPoint(-6F, 3F, -5.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 12, 3, 11, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[33].setRotationPoint(-6F, -5F, -5.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[34].setRotationPoint(6.75F, -6F, -5.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0.5F, 0F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F); // Import Box8
		gunModel[35].setRotationPoint(6.75F, -7F, -5.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0.5F, 0F, -2.25F, 0.5F, 0F, -2.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F); // Import Box8
		gunModel[36].setRotationPoint(6.75F, -8.5F, -5.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.25F, 0.5F, 0F, -2.25F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box8
		gunModel[37].setRotationPoint(6.75F, -10.5F, -5.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 13, 6, 11, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[38].setRotationPoint(-6F, -11F, -5.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 15, 1, 11, 0F,0F, 0.5F, 0F, -2.75F, 0.5F, 0F, -2.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box8
		gunModel[39].setRotationPoint(-5.25F, -12.5F, -5.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 15, 1, 11, 0F,0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.75F, 0.5F, 0F, -2.75F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box8
		gunModel[40].setRotationPoint(-5.25F, -14.5F, -5.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 16, 1, 11, 0F,0F, 0.5F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box8
		gunModel[41].setRotationPoint(-5.25F, -16.5F, -5.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 16, 1, 11, 0F,0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box8
		gunModel[42].setRotationPoint(-5.25F, -18.5F, -5.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 16, 1, 11, 0F,0F, 1F, 0F, 0.75F, 1F, 0F, 0.75F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box8
		gunModel[43].setRotationPoint(-5.25F, -20.5F, -5.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 8, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[44].setRotationPoint(-6F, 6F, -5.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 8, 7, 11, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[45].setRotationPoint(-6F, 9F, -5.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 8, 2, 11, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[46].setRotationPoint(-6F, 16F, -5.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 8, 1, 11, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[47].setRotationPoint(-6F, 18F, -5.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[48].setRotationPoint(1F, 19F, -5.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F); // Import Box8
		gunModel[49].setRotationPoint(-4F, 19F, -5.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 17, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Import Box8
		gunModel[50].setRotationPoint(-21F, 19F, -5.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F); // Import Box8
		gunModel[51].setRotationPoint(-23F, 19F, -5.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, -2F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[52].setRotationPoint(-23F, 17F, -5.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 12, 1, 11, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box8
		gunModel[53].setRotationPoint(-17.25F, -20.5F, -5.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 12, 1, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F); // Import Box8
		gunModel[54].setRotationPoint(-17.25F, -18.5F, -5.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 9, 2, 11, 0F,-0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F); // Import Box8
		gunModel[55].setRotationPoint(-14.25F, -17F, -5.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Import Box8
		gunModel[56].setRotationPoint(-10.25F, -14.5F, -5.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,-1.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Import Box8
		gunModel[57].setRotationPoint(-10.25F, -12F, -5.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,-1.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F); // Import Box8
		gunModel[58].setRotationPoint(-10.25F, -10.5F, -5.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,-0.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0.5F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F); // Import Box8
		gunModel[59].setRotationPoint(-10.25F, -9F, -5.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,1F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 1F, 0.5F, 0F, 2.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 2.75F, 0F, 0F); // Import Box8
		gunModel[60].setRotationPoint(-10.25F, -6.5F, -5.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,1.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 1.75F, 0.5F, 0F, 3.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 3.75F, 0F, 0F); // Import Box8
		gunModel[61].setRotationPoint(-11.25F, -4F, -5.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,3.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 3.75F, 0.5F, 0F, 5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 5F, 0F, 0F); // Import Box8
		gunModel[62].setRotationPoint(-11.25F, -1.5F, -5.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 5, 6, 11, 0F,5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 5F, 0.5F, 0F, 7.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 7.25F, 0F, 0F); // Import Box8
		gunModel[63].setRotationPoint(-11.25F, 1F, -5.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 7, 6, 11, 0F,5.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 5.25F, 0.5F, 0F, 6.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 6.75F, 0F, 0F); // Import Box8
		gunModel[64].setRotationPoint(-13.25F, 7.5F, -5.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,6.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 6.75F, 0.5F, 0F, 7.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 7.75F, 0.25F, 0F); // Import Box8
		gunModel[65].setRotationPoint(-13.25F, 14F, -5.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,7.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 7.75F, 0.5F, 0F, 7.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 7.75F, 0.25F, 0F); // Import Box8
		gunModel[66].setRotationPoint(-13.25F, 16.75F, -5.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 13, 1, 10, 0F,0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[67].setRotationPoint(11.5F, -7F, -5.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F); // Import Box8
		gunModel[68].setRotationPoint(14F, -20F, -2F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import Box8
		gunModel[69].setRotationPoint(14F, -18.5F, -2F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import Box8
		gunModel[70].setRotationPoint(14F, -16.5F, -2F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import Box8
		gunModel[71].setRotationPoint(16F, -16.5F, -2F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box8
		gunModel[72].setRotationPoint(16.5F, -16.5F, -2F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2.25F, -0.25F, 0F, 1F, -0.75F, 0F, 1F, -0.75F, 0F, -2.25F, -0.25F, 0F); // Import Box8
		gunModel[73].setRotationPoint(13.5F, -13F, -2F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[74].setRotationPoint(24.25F, -7F, -5.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box8
		gunModel[75].setRotationPoint(23.75F, -9F, -5.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box8
		gunModel[76].setRotationPoint(24.75F, -10.5F, -5.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box8
		gunModel[77].setRotationPoint(25.75F, -13F, -5.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Import Box8
		gunModel[78].setRotationPoint(25.75F, -15.5F, -5.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box8
		gunModel[79].setRotationPoint(25.75F, -17.5F, -5.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box8
		gunModel[80].setRotationPoint(24.75F, -19F, -5.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import Box8
		gunModel[81].setRotationPoint(23.75F, -20F, -5.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 2, 13, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box8
		gunModel[82].setRotationPoint(27.75F, -20F, -4.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 3, 13, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F); // Import Box8
		gunModel[83].setRotationPoint(29.75F, -20F, -4.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 2, 14, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F); // Import Box8
		gunModel[84].setRotationPoint(32.75F, -20F, -4.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 22, 14, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Import Box8
		gunModel[85].setRotationPoint(34.75F, -20F, -4.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 14, 3, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, -3.45F, 0F, 0F, -3.45F, 0F, 0F, 1.25F, 0F); // Import Box8
		gunModel[86].setRotationPoint(56.75F, -20F, -4.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 6, 9, 8, 0F,0F, 0.75F, 0.5F, 1F, 3.15F, 0F, 1F, 3.15F, 0F, 0F, 0.75F, 0.5F, 0F, 1.25F, 0.5F, 1F, -6F, 0F, 1F, -6F, 0F, 0F, 1.25F, 0.5F); // Import Box8
		gunModel[87].setRotationPoint(56.75F, -15F, -4F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 4, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[88].setRotationPoint(63.75F, -21F, -4F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 2, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[89].setRotationPoint(67.75F, -21F, -4F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -2F, 0F); // Import Box8
		gunModel[90].setRotationPoint(69.75F, -21F, -4F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, -5.5F, 0F, 0.5F, -5.5F, 0F, 0F, -2.5F, 0F); // Import Box8
		gunModel[91].setRotationPoint(70.75F, -21F, -4F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 10, 2, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Import Box8
		gunModel[92].setRotationPoint(39.75F, -10F, -5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F); // Import Box8
		gunModel[93].setRotationPoint(49.75F, -10F, -5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.25F, 0F); // Import Box8
		gunModel[94].setRotationPoint(51.75F, -9F, -5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F); // Import Box8
		gunModel[95].setRotationPoint(37.75F, -10F, -5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.5F, 0F); // Import Box8
		gunModel[96].setRotationPoint(36.75F, -9F, -5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import Box1
		gunModel[97].setRotationPoint(39.5F, -9F, -5.25F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import Box1
		gunModel[98].setRotationPoint(39.5F, -9.5F, -5.25F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import Box1
		gunModel[99].setRotationPoint(39.5F, -8.5F, -5.25F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import Box1
		gunModel[100].setRotationPoint(49F, -9F, -5.25F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import Box1
		gunModel[101].setRotationPoint(49F, -9.5F, -5.25F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import Box1
		gunModel[102].setRotationPoint(49F, -8.5F, -5.25F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 10, 2, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Import Box16
		gunModel[103].setRotationPoint(-61.25F, -15.5F, -5F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F); // Import Box8
		gunModel[104].setRotationPoint(-51.25F, -15.5F, -5F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.25F, 0F); // Import Box8
		gunModel[105].setRotationPoint(-49.25F, -14.5F, -5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0F); // Import Box8
		gunModel[106].setRotationPoint(-63.25F, -15.5F, -5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.5F, 0F); // Import Box8
		gunModel[107].setRotationPoint(-64.25F, -14.5F, -5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import Box1
		gunModel[108].setRotationPoint(-61.5F, -14.5F, -5.25F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import Box1
		gunModel[109].setRotationPoint(-61.5F, -15F, -5.25F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import Box1
		gunModel[110].setRotationPoint(-61.5F, -14F, -5.25F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import Box1
		gunModel[111].setRotationPoint(-52F, -14.5F, -5.25F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F); // Import Box1
		gunModel[112].setRotationPoint(-52F, -15F, -5.25F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import Box1
		gunModel[113].setRotationPoint(-52F, -14F, -5.25F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 11, 7, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 1.25F, 0F); // Import Box8
		gunModel[114].setRotationPoint(-44.25F, -18F, -4.5F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 28, 7, 9, 0F,0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0.25F, 1.25F, 0F); // Import Box8
		gunModel[115].setRotationPoint(-72.25F, -18F, -4.5F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 28, 1, 9, 0F,2.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Import Box8
		gunModel[116].setRotationPoint(-72.25F, -20F, -4.5F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F,0.25F, 0.5F, 0F, 1.75F, 0.5F, 0F, 1.75F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.5F, 0.25F, 0.5F, 0F); // Import Box8
		gunModel[117].setRotationPoint(-44F, -20F, -4.5F);

		gunModel[118].addBox(0F, 0F, 0F, 3, 4, 12, 0F); // Import Box31
		gunModel[118].setRotationPoint(162.5F, -36F, -6F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[119].setRotationPoint(154F, -40F, -6F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 24, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box0
		gunModel[120].setRotationPoint(56.5F, -32F, -6F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 18, 4, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box1
		gunModel[121].setRotationPoint(56F, -36F, -6F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 24, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		gunModel[122].setRotationPoint(56.5F, -40F, -6F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box1
		gunModel[123].setRotationPoint(86F, -36F, -6F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box1
		gunModel[124].setRotationPoint(101.5F, -36F, -6F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box1
		gunModel[125].setRotationPoint(116.75F, -36F, -6F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box1
		gunModel[126].setRotationPoint(132F, -36F, -6F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box1
		gunModel[127].setRotationPoint(147.25F, -36F, -6F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[128].setRotationPoint(170F, -40F, -6F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[129].setRotationPoint(170F, -32F, -6F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[130].setRotationPoint(171F, -36F, -6F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[131].setRotationPoint(124F, -40F, -6F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[132].setRotationPoint(124F, -32F, -6F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box31
		gunModel[133].setRotationPoint(165.5F, -36F, -6F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box31
		gunModel[134].setRotationPoint(165.5F, -32.5F, -6F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[135].setRotationPoint(165.5F, -33.5F, -6F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box31
		gunModel[136].setRotationPoint(165.5F, -35.5F, -6F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Import Box31
		gunModel[137].setRotationPoint(170F, -35.5F, -6F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box31
		gunModel[138].setRotationPoint(170F, -33.5F, -6F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[139].setRotationPoint(150.25F, -33.5F, -6F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box31
		gunModel[140].setRotationPoint(150.25F, -35.5F, -6F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Import Box31
		gunModel[141].setRotationPoint(161.5F, -35.5F, -6F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box31
		gunModel[142].setRotationPoint(161.5F, -33.5F, -6F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import Box31
		gunModel[143].setRotationPoint(150.5F, -36F, -6F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import Box31
		gunModel[144].setRotationPoint(150.5F, -32.5F, -6F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[145].setRotationPoint(135F, -33.5F, -6F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box31
		gunModel[146].setRotationPoint(135F, -35.5F, -6F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Import Box31
		gunModel[147].setRotationPoint(146.75F, -35.5F, -6F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box31
		gunModel[148].setRotationPoint(146.75F, -33.5F, -6F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import Box31
		gunModel[149].setRotationPoint(135.5F, -36F, -6F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import Box31
		gunModel[150].setRotationPoint(135.5F, -32.5F, -6F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[151].setRotationPoint(119.75F, -33.5F, -6F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box31
		gunModel[152].setRotationPoint(119.75F, -35.5F, -6F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Import Box31
		gunModel[153].setRotationPoint(131.5F, -35.5F, -6F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box31
		gunModel[154].setRotationPoint(131.5F, -33.5F, -6F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import Box31
		gunModel[155].setRotationPoint(120F, -36F, -6F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import Box31
		gunModel[156].setRotationPoint(120F, -32.5F, -6F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[157].setRotationPoint(104.5F, -33.5F, -6F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box31
		gunModel[158].setRotationPoint(104.5F, -35.5F, -6F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Import Box31
		gunModel[159].setRotationPoint(116.25F, -35.5F, -6F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box31
		gunModel[160].setRotationPoint(116.25F, -33.5F, -6F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import Box31
		gunModel[161].setRotationPoint(104.75F, -36F, -6F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import Box31
		gunModel[162].setRotationPoint(104.75F, -32.5F, -6F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[163].setRotationPoint(89F, -33.5F, -6F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box31
		gunModel[164].setRotationPoint(89F, -35.5F, -6F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Import Box31
		gunModel[165].setRotationPoint(101F, -35.5F, -6F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box31
		gunModel[166].setRotationPoint(101F, -33.5F, -6F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import Box31
		gunModel[167].setRotationPoint(89.25F, -36F, -6F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import Box31
		gunModel[168].setRotationPoint(89.25F, -32.5F, -6F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[169].setRotationPoint(74F, -33.5F, -6F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box31
		gunModel[170].setRotationPoint(74F, -35.5F, -6F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Import Box31
		gunModel[171].setRotationPoint(85.5F, -35.5F, -6F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box31
		gunModel[172].setRotationPoint(85.5F, -33.5F, -6F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import Box31
		gunModel[173].setRotationPoint(74.25F, -36F, -6F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import Box31
		gunModel[174].setRotationPoint(74.25F, -32.5F, -6F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[175].setRotationPoint(154F, -32F, -6F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box31
		gunModel[176].setRotationPoint(158F, -32F, -6F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[177].setRotationPoint(158F, -29F, -6F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[178].setRotationPoint(158F, -37F, -6F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box31
		gunModel[179].setRotationPoint(158F, -40F, -6F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Import Box31
		gunModel[180].setRotationPoint(157F, -32F, -6F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F); // Import Box31
		gunModel[181].setRotationPoint(169F, -32F, -6F);

		gunModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[182].setRotationPoint(157F, -29F, -6F);

		gunModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[183].setRotationPoint(169F, -29F, -6F);

		gunModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[184].setRotationPoint(169F, -37F, -6F);

		gunModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F); // Import Box31
		gunModel[185].setRotationPoint(157F, -40F, -6F);

		gunModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F); // Import Box31
		gunModel[186].setRotationPoint(169F, -40F, -6F);

		gunModel[187].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[187].setRotationPoint(139F, -32F, -6F);

		gunModel[188].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box31
		gunModel[188].setRotationPoint(143F, -32F, -6F);

		gunModel[189].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[189].setRotationPoint(143F, -29F, -6F);

		gunModel[190].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[190].setRotationPoint(108F, -32F, -6F);

		gunModel[191].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box31
		gunModel[191].setRotationPoint(112F, -32F, -6F);

		gunModel[192].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[192].setRotationPoint(112F, -29F, -6F);

		gunModel[193].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[193].setRotationPoint(93.5F, -32F, -6F);

		gunModel[194].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Import Box31
		gunModel[194].setRotationPoint(97F, -32F, -6F);

		gunModel[195].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,-0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, -4F); // Import Box31
		gunModel[195].setRotationPoint(97F, -29F, -6F);

		gunModel[196].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[196].setRotationPoint(93.5F, -40F, -6F);

		gunModel[197].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[197].setRotationPoint(108F, -40F, -6F);

		gunModel[198].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[198].setRotationPoint(139F, -40F, -6F);

		gunModel[199].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[199].setRotationPoint(143F, -37F, -6F);

		gunModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[200].setRotationPoint(153F, -37F, -6F);

		gunModel[201].addShapeBox(0F, 0F, 0F, 38, 1, 8, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		gunModel[201].setRotationPoint(43.25F, -44F, -4F);

		gunModel[202].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		gunModel[202].setRotationPoint(82.25F, -44F, -4F);

		gunModel[203].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		gunModel[203].setRotationPoint(92.25F, -44F, -4F);

		gunModel[204].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		gunModel[204].setRotationPoint(102.25F, -44F, -4F);

		gunModel[205].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		gunModel[205].setRotationPoint(112.25F, -44F, -4F);

		gunModel[206].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		gunModel[206].setRotationPoint(122.25F, -44F, -4F);

		gunModel[207].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		gunModel[207].setRotationPoint(132.25F, -44F, -4F);

		gunModel[208].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		gunModel[208].setRotationPoint(142.25F, -44F, -4F);

		gunModel[209].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		gunModel[209].setRotationPoint(152.25F, -44F, -4F);

		gunModel[210].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		gunModel[210].setRotationPoint(162.25F, -44F, -4F);

		gunModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		gunModel[211].setRotationPoint(172.25F, -44F, -4F);

		gunModel[212].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0.75F, 1F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import Box1
		gunModel[212].setRotationPoint(89.25F, -41.5F, -2F);

		gunModel[213].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0.75F, 1F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import Box1
		gunModel[213].setRotationPoint(99.25F, -41.5F, -2F);

		gunModel[214].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0.75F, 1F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import Box1
		gunModel[214].setRotationPoint(109.25F, -41.5F, -2F);

		gunModel[215].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0.75F, 1F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import Box1
		gunModel[215].setRotationPoint(119.25F, -41.5F, -2F);

		gunModel[216].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0.75F, 1F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import Box1
		gunModel[216].setRotationPoint(129.25F, -41.5F, -2F);

		gunModel[217].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0.75F, 1F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import Box1
		gunModel[217].setRotationPoint(139.25F, -41.5F, -2F);

		gunModel[218].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0.75F, 1F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import Box1
		gunModel[218].setRotationPoint(149.25F, -41.5F, -2F);

		gunModel[219].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0.75F, 1F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import Box1
		gunModel[219].setRotationPoint(159.25F, -41.5F, -2F);

		gunModel[220].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0.75F, 1F, 0F, 0.75F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.75F, 0.5F, 0F); // Import Box1
		gunModel[220].setRotationPoint(169.25F, -41.5F, -2F);

		gunModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[221].setRotationPoint(157F, -37F, -6F);

		gunModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F); // Import Box31
		gunModel[222].setRotationPoint(153F, -40F, -6F);

		gunModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F); // Import Box31
		gunModel[223].setRotationPoint(142F, -40F, -6F);

		gunModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[224].setRotationPoint(142F, -37F, -6F);

		gunModel[225].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box31
		gunModel[225].setRotationPoint(143F, -40F, -6F);

		gunModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[226].setRotationPoint(138F, -37F, -6F);

		gunModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F); // Import Box31
		gunModel[227].setRotationPoint(138F, -40F, -6F);

		gunModel[228].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[228].setRotationPoint(128F, -37F, -6F);

		gunModel[229].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box31
		gunModel[229].setRotationPoint(128F, -40F, -6F);

		gunModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F); // Import Box31
		gunModel[230].setRotationPoint(127F, -40F, -6F);

		gunModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[231].setRotationPoint(127F, -37F, -6F);

		gunModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[232].setRotationPoint(123F, -37F, -6F);

		gunModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F); // Import Box31
		gunModel[233].setRotationPoint(123F, -40F, -6F);

		gunModel[234].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[234].setRotationPoint(112F, -37F, -6F);

		gunModel[235].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box31
		gunModel[235].setRotationPoint(112F, -40F, -6F);

		gunModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F); // Import Box31
		gunModel[236].setRotationPoint(111F, -40F, -6F);

		gunModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[237].setRotationPoint(111F, -37F, -6F);

		gunModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[238].setRotationPoint(107F, -37F, -6F);

		gunModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F); // Import Box31
		gunModel[239].setRotationPoint(107F, -40F, -6F);

		gunModel[240].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box31
		gunModel[240].setRotationPoint(97F, -37F, -6F);

		gunModel[241].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,-0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, -3F); // Import Box31
		gunModel[241].setRotationPoint(97F, -40F, -6F);

		gunModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F); // Import Box31
		gunModel[242].setRotationPoint(96.5F, -40F, -6F);

		gunModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[243].setRotationPoint(96.5F, -37F, -6F);

		gunModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[244].setRotationPoint(92.5F, -37F, -6F);

		gunModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F); // Import Box31
		gunModel[245].setRotationPoint(92.5F, -40F, -6F);

		gunModel[246].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,-0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box31
		gunModel[246].setRotationPoint(81F, -37F, -6F);

		gunModel[247].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,-0.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, -0.5F, 0F, -3F); // Import Box31
		gunModel[247].setRotationPoint(81F, -40F, -6F);

		gunModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F); // Import Box31
		gunModel[248].setRotationPoint(80.5F, -40F, -6F);

		gunModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[249].setRotationPoint(80.5F, -37F, -6F);

		gunModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F); // Import Box31
		gunModel[250].setRotationPoint(153F, -32F, -6F);

		gunModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[251].setRotationPoint(153F, -29F, -6F);

		gunModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Import Box31
		gunModel[252].setRotationPoint(142F, -32F, -6F);

		gunModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[253].setRotationPoint(142F, -29F, -6F);

		gunModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F); // Import Box31
		gunModel[254].setRotationPoint(138F, -32F, -6F);

		gunModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[255].setRotationPoint(138F, -29F, -6F);

		gunModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Import Box31
		gunModel[256].setRotationPoint(127F, -32F, -6F);

		gunModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[257].setRotationPoint(127F, -29F, -6F);

		gunModel[258].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box31
		gunModel[258].setRotationPoint(128F, -32F, -6F);

		gunModel[259].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[259].setRotationPoint(128F, -29F, -6F);

		gunModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F); // Import Box31
		gunModel[260].setRotationPoint(123F, -32F, -6F);

		gunModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[261].setRotationPoint(123F, -29F, -6F);

		gunModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Import Box31
		gunModel[262].setRotationPoint(111F, -32F, -6F);

		gunModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[263].setRotationPoint(111F, -29F, -6F);

		gunModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F); // Import Box31
		gunModel[264].setRotationPoint(107F, -32F, -6F);

		gunModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[265].setRotationPoint(107F, -29F, -6F);

		gunModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Import Box31
		gunModel[266].setRotationPoint(96.5F, -32F, -6F);

		gunModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[267].setRotationPoint(96.5F, -29F, -6F);

		gunModel[268].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.5F, 0F, -2F); // Import Box31
		gunModel[268].setRotationPoint(81F, -32F, -6F);

		gunModel[269].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,-0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, -0.5F, 0F, -4F); // Import Box31
		gunModel[269].setRotationPoint(81F, -29F, -6F);

		gunModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F); // Import Box31
		gunModel[270].setRotationPoint(92.5F, -32F, -6F);

		gunModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box31
		gunModel[271].setRotationPoint(92.5F, -29F, -6F);

		gunModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Import Box31
		gunModel[272].setRotationPoint(80.5F, -32F, -6F);

		gunModel[273].addShapeBox(0F, 0F, 0F, 111, 7, 7, 0F,0F, -0.05F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[273].setRotationPoint(73F, -37F, -3.5F);

		gunModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -1F, 1F, -2.5F, -1F, 1F, -2.5F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box1
		gunModel[274].setRotationPoint(174.25F, -44F, -4.5F);

		gunModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2.75F, 0.5F, 0F, 2.75F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box1
		gunModel[275].setRotationPoint(174.25F, -41.5F, -4.5F);

		gunModel[276].addShapeBox(0F, 0F, 0F, 3, 6, 9, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[276].setRotationPoint(174.25F, -39F, -4.5F);

		gunModel[277].addShapeBox(0F, 0F, 0F, 5, 4, 9, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box1
		gunModel[277].setRotationPoint(174.25F, -33F, -4.5F);

		gunModel[278].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[278].setRotationPoint(174.25F, -29F, -3F);

		gunModel[279].addShapeBox(0F, 0F, 0F, 7, 5, 9, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[279].setRotationPoint(174.25F, -26F, -4.5F);

		gunModel[280].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0.5F, 1.75F, -0.25F, 0.5F, 1.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[280].setRotationPoint(174.25F, -27F, 3.5F);

		gunModel[281].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -1F, 0F, 1.75F, -1F, 0F, 1.75F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box1
		gunModel[281].setRotationPoint(174.25F, -27F, -4.5F);

		gunModel[282].addShapeBox(0F, 0F, 0F, 104, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[282].setRotationPoint(72.25F, -24.5F, 1F);

		gunModel[283].addShapeBox(0F, 0F, 0F, 104, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[283].setRotationPoint(72.25F, -23.5F, 1F);

		gunModel[284].addShapeBox(0F, 0F, 0F, 104, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box1
		gunModel[284].setRotationPoint(72.25F, -22.5F, 1F);

		gunModel[285].addShapeBox(0F, 0F, 0F, 104, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[285].setRotationPoint(72.25F, -24.5F, -4F);

		gunModel[286].addShapeBox(0F, 0F, 0F, 104, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[286].setRotationPoint(72.25F, -23.5F, -4F);

		gunModel[287].addShapeBox(0F, 0F, 0F, 104, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box1
		gunModel[287].setRotationPoint(72.25F, -22.5F, -4F);

		gunModel[288].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[288].setRotationPoint(181F, -38F, -4F);

		gunModel[289].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[289].setRotationPoint(185F, -37.5F, -3.5F);

		gunModel[290].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[290].setRotationPoint(186F, -38F, -4F);

		gunModel[291].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[291].setRotationPoint(189F, -38F, -4F);

		gunModel[292].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[292].setRotationPoint(188F, -38F, -4F);

		gunModel[293].addShapeBox(0F, 0F, 0F, 7, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[293].setRotationPoint(191F, -38F, -4F);

		gunModel[294].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[294].setRotationPoint(201F, -38F, -4F);

		gunModel[295].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[295].setRotationPoint(206F, -38F, -4F);

		gunModel[296].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[296].setRotationPoint(211F, -38F, -4F);

		gunModel[297].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box31
		gunModel[297].setRotationPoint(198F, -38F, -3F);

		gunModel[298].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box31
		gunModel[298].setRotationPoint(198F, -32F, -3F);

		gunModel[299].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box31
		gunModel[299].setRotationPoint(203F, -38F, -3F);

		gunModel[300].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box31
		gunModel[300].setRotationPoint(203F, -32F, -3F);

		gunModel[301].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box31
		gunModel[301].setRotationPoint(208F, -38F, -3F);

		gunModel[302].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box31
		gunModel[302].setRotationPoint(208F, -32F, -3F);

		gunModel[303].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[303].setRotationPoint(212.5F, -38F, -4F);

		gunModel[304].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		gunModel[304].setRotationPoint(212.5F, -34F, -4F);

		gunModel[305].addShapeBox(0F, 0F, 0F, 16, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[305].setRotationPoint(75.25F, -25F, -8F);

		gunModel[306].addShapeBox(0F, 0F, 0F, 9, 3, 16, 0F,-2.25F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, -2.25F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[306].setRotationPoint(75.25F, -28F, -8F);

		gunModel[307].addShapeBox(0F, 0F, 0F, 7, 2, 16, 0F,-3.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3.5F, 0F, -2F, -0.25F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, -0.25F, 0F, -1.2F); // Import Box1
		gunModel[307].setRotationPoint(77.25F, -30F, -8F);

		gunModel[308].addShapeBox(0F, 0F, 0F, 49, 2, 16, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -1F); // Import Box1
		gunModel[308].setRotationPoint(75.25F, -21F, -8F);

		gunModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[309].setRotationPoint(91.25F, -25F, -8F);

		gunModel[310].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[310].setRotationPoint(91.25F, -23F, -8F);

		gunModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[311].setRotationPoint(99.25F, -23F, -8F);

		gunModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box1
		gunModel[312].setRotationPoint(99.25F, -25F, -8F);

		gunModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[313].setRotationPoint(103.25F, -25F, -8F);

		gunModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[314].setRotationPoint(103.25F, -23F, -8F);

		gunModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[315].setRotationPoint(111.25F, -23F, -8F);

		gunModel[316].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box1
		gunModel[316].setRotationPoint(111.25F, -25F, -8F);

		gunModel[317].addShapeBox(0F, 0F, 0F, 3, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[317].setRotationPoint(100.25F, -25F, -8F);

		gunModel[318].addShapeBox(0F, 0F, 0F, 15, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[318].setRotationPoint(112.25F, -25F, -8F);

		gunModel[319].addShapeBox(0F, 0F, 0F, 3, 5, 16, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[319].setRotationPoint(93.75F, -30F, -8F);

		gunModel[320].addShapeBox(0F, 0F, 0F, 3, 5, 16, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[320].setRotationPoint(106.25F, -30F, -8F);

		gunModel[321].addShapeBox(0F, 0F, 0F, 4, 5, 16, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[321].setRotationPoint(118.75F, -30F, -8F);

		gunModel[322].addShapeBox(0F, 0F, 0F, 10, 1, 16, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, 0F, 0.5F, -1.4F); // Import Box1
		gunModel[322].setRotationPoint(84.25F, -30F, -8F);

		gunModel[323].addShapeBox(0F, 0F, 0F, 10, 1, 16, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, 0F, 0.5F, -1.4F); // Import Box1
		gunModel[323].setRotationPoint(109.25F, -30F, -8F);

		gunModel[324].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, -2.4F, -0.5F, 0F, -2.4F, -0.5F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Import Box1
		gunModel[324].setRotationPoint(109.25F, -26F, -10F);

		gunModel[325].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, -2.4F, -0.5F, 0F, -2.4F, -0.5F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Import Box1
		gunModel[325].setRotationPoint(84.25F, -26F, -10F);

		gunModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, 0F, 0.25F, -2.9F); // Import Box1
		gunModel[326].setRotationPoint(109.25F, -28.5F, -10F);

		gunModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F); // Import Box1
		gunModel[327].setRotationPoint(109.25F, -27F, -10F);

		gunModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-1F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F); // Import Box1
		gunModel[328].setRotationPoint(117.75F, -27F, -10F);

		gunModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, -1F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, -1F, 0.25F, -2.9F); // Import Box1
		gunModel[329].setRotationPoint(117.75F, -28.5F, -10F);

		gunModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, 0F, 0.25F, -2.9F); // Import Box1
		gunModel[330].setRotationPoint(84.25F, -28.5F, -10F);

		gunModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F); // Import Box1
		gunModel[331].setRotationPoint(84.25F, -27F, -10F);

		gunModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-1F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F); // Import Box1
		gunModel[332].setRotationPoint(92.75F, -27F, -10F);

		gunModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, -1F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, -1F, 0.25F, -2.9F); // Import Box1
		gunModel[333].setRotationPoint(92.75F, -28.5F, -10F);

		gunModel[334].addShapeBox(0F, 0F, 0F, 10, 1, 16, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, 0F, 0.5F, -1.4F); // Import Box1
		gunModel[334].setRotationPoint(96.75F, -30F, -8F);

		gunModel[335].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, -2.4F, -0.5F, 0F, -2.4F, -0.5F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -2F); // Import Box1
		gunModel[335].setRotationPoint(96.75F, -26F, -10F);

		gunModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, 0F, 0.25F, -2.9F); // Import Box1
		gunModel[336].setRotationPoint(96.75F, -28.5F, -10F);

		gunModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F); // Import Box1
		gunModel[337].setRotationPoint(96.75F, -27F, -10F);

		gunModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-1F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, -1F, 0.25F, -2.9F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, -2.4F); // Import Box1
		gunModel[338].setRotationPoint(105.25F, -27F, -10F);

		gunModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, -1F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, 0F, 0.25F, -2.9F, -1F, 0.25F, -2.9F); // Import Box1
		gunModel[339].setRotationPoint(105.25F, -28.5F, -10F);

		gunModel[340].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2.5F, 0.25F, 0.25F, -2.5F, 0.25F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import Box1
		gunModel[340].setRotationPoint(16.5F, -34.5F, -8.75F);

		gunModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Import Box1
		gunModel[341].setRotationPoint(16.5F, -34.25F, -9.25F);

		gunModel[342].addShapeBox(0F, 0F, 0F, 9, 5, 8, 0F,0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Import Box1
		gunModel[342].setRotationPoint(-69F, -31.5F, -2F);

		gunModel[343].addShapeBox(0F, 0F, 0F, 55, 5, 9, 0F,0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box1
		gunModel[343].setRotationPoint(-122F, -41.5F, -3F);

		gunModel[344].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F,1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -3.5F, 1F, 0F, -3.5F, 1F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Import Box1
		gunModel[344].setRotationPoint(-124F, -41.5F, -3F);

		gunModel[345].addShapeBox(0F, 0F, 0F, 55, 5, 9, 0F,0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Import Box1
		gunModel[345].setRotationPoint(-122F, -36.5F, -3F);

		gunModel[346].addShapeBox(0F, 0F, 0F, 2, 14, 12, 0F,1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 1F, 0.25F, 0F); // Import Box1
		gunModel[346].setRotationPoint(-124F, -36.5F, -6F);

		gunModel[347].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F,0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box1
		gunModel[347].setRotationPoint(-126.5F, -41.5F, -3F);

		gunModel[348].addShapeBox(0F, 0F, 0F, 2, 39, 12, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Import Box1
		gunModel[348].setRotationPoint(-126.5F, -36.5F, -6F);

		gunModel[349].addShapeBox(0F, 0F, 0F, 4, 5, 9, 0F,1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -3.5F, 1F, 0F, -3.5F, 2F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, 2F, 0F, 0F); // Import Box1
		gunModel[349].setRotationPoint(-130.5F, -41.5F, -3F);

		gunModel[350].addShapeBox(0F, 0F, 0F, 5, 39, 12, 0F,1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 1F, 0.25F, 0F); // Import Box1
		gunModel[350].setRotationPoint(-131.5F, -36.5F, -6F);

		gunModel[351].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F); // Import Box1
		gunModel[351].setRotationPoint(-126.5F, 2.5F, -6F);

		gunModel[352].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F); // Import Box1
		gunModel[352].setRotationPoint(-126.5F, 4.25F, -4.5F);

		gunModel[353].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0.5F, 0F, -1.5F); // Import Box1
		gunModel[353].setRotationPoint(-132F, 2.5F, -6F);

		gunModel[354].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F); // Import Box1
		gunModel[354].setRotationPoint(-132F, 4.25F, -4.5F);

		gunModel[355].addShapeBox(0F, 0F, 0F, 1, 33, 12, 0F,1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 1F, 0.25F, 0F); // Import Box1
		gunModel[355].setRotationPoint(-124F, -22.5F, -6F);

		gunModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F); // Import Box1
		gunModel[356].setRotationPoint(-123.5F, -22.25F, -6F);

		gunModel[357].addShapeBox(0F, 0F, 0F, 10, 7, 9, 0F,0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box1
		gunModel[357].setRotationPoint(-122F, -31F, -3F);

		gunModel[358].addShapeBox(0F, 0F, 0F, 3, 5, 9, 0F,0.5F, 0.75F, -0.5F, -0.5F, -2.25F, -0.5F, -0.5F, -2.25F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box1
		gunModel[358].setRotationPoint(-112F, -28F, -4F);

		gunModel[359].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0.5F, -0.25F, -0.5F, -0.5F, -3F, -0.5F, -0.5F, -3F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box1
		gunModel[359].setRotationPoint(-109F, -27F, -3F);

		gunModel[360].addShapeBox(0F, 0F, 0F, 26, 1, 12, 0F,1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 1F, 0.25F, 0F); // Import Box1
		gunModel[360].setRotationPoint(-121.5F, -23.5F, -6F);

		gunModel[361].addShapeBox(0F, 0F, 0F, 26, 3, 12, 0F,1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, 0.25F, 0F); // Import Box1
		gunModel[361].setRotationPoint(-122F, 7.5F, -6F);

		gunModel[362].addShapeBox(0F, 0F, 0F, 7, 30, 12, 0F,1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, 0.25F, 0F); // Import Box1
		gunModel[362].setRotationPoint(-103F, -22.5F, -6F);

		gunModel[363].addShapeBox(0F, 0F, 0F, 2, 30, 12, 0F,1.25F, -0.25F, -3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.25F, -0.25F, -3F, 1.25F, 0.25F, -3F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, 0.25F, -3F); // Import Box1
		gunModel[363].setRotationPoint(-106F, -22.5F, -6F);

		gunModel[364].addShapeBox(0F, 0F, 0F, 2, 23, 12, 0F,-0.25F, -0.25F, 0F, 1.25F, -0.25F, -2F, 1.25F, -0.25F, -2F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, 0.25F, -2F, 1.25F, 0.25F, -2F, -0.25F, 0.25F, 0F); // Import Box1
		gunModel[364].setRotationPoint(-96.5F, -15.5F, -6F);

		gunModel[365].addShapeBox(0F, 0F, 0F, 1, 25, 8, 0F,-0.25F, -0.25F, 0F, 1.25F, -0.25F, -3F, 1.25F, -0.25F, -3F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, 0.25F, -3F, 1.25F, 0.25F, -3F, -0.25F, 0.25F, 0F); // Import Box1
		gunModel[365].setRotationPoint(-93.5F, -17.5F, -4F);

		gunModel[366].addShapeBox(0F, 0F, 0F, 2, 7, 12, 0F,1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, 0.25F, 0F); // Import Box1
		gunModel[366].setRotationPoint(-95F, -22.5F, -6F);

		gunModel[367].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.25F, 0.25F, 0F); // Import Box1
		gunModel[367].setRotationPoint(-91F, -22.5F, -6F);

		gunModel[368].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Import Box1
		gunModel[368].setRotationPoint(-93F, -22.5F, -6F);

		gunModel[369].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,1.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, 0.25F, -1F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, 1.25F, 0.25F, -1F); // Import Box1
		gunModel[369].setRotationPoint(-91F, -18.5F, -6F);

		gunModel[370].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, 0.25F, 0.25F, 0F); // Import Box1
		gunModel[370].setRotationPoint(-93F, -18.5F, -6F);

		gunModel[371].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,1.25F, 0.25F, 0F, 1.75F, 0.25F, 0F, 1.75F, 0.25F, 0F, 1.25F, 0.25F, 0F, 1.25F, -0.25F, -2F, 0.5F, -0.25F, -2F, 0.5F, -0.25F, -2F, 1.25F, -0.25F, -2F); // Import Box1
		gunModel[371].setRotationPoint(-87F, -18.5F, -6F);

		gunModel[372].addShapeBox(0F, 0F, 0F, 9, 4, 12, 0F,1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F); // Import Box1
		gunModel[372].setRotationPoint(-87F, -22.5F, -6F);

		gunModel[373].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,2.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 2.25F, -0.25F, 0F, 1.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Import Box1
		gunModel[373].setRotationPoint(-122F, 10.5F, -6F);

		gunModel[374].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,1.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 1.75F, -0.25F, 0F, 0.5F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0.5F, -0.75F, 0F); // Import Box1
		gunModel[374].setRotationPoint(-122F, 12.5F, -6F);

		gunModel[375].addShapeBox(0F, 0F, 0F, 2, 10, 12, 0F,-0.25F, -0.25F, 0F, 1.25F, -0.25F, -2F, 1.25F, -0.25F, -2F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, 0F, -2F, 1.25F, 0F, -2F, -0.25F, 0.25F, 0F); // Import Box1
		gunModel[375].setRotationPoint(-96.5F, 7.5F, -6F);

		gunModel[376].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,-0.25F, -0.25F, 0F, 1.25F, -0.25F, -3F, 1.25F, -0.25F, -3F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 1.25F, -0.25F, -3F, 1.25F, -0.25F, -3F, -0.25F, 0F, 0F); // Import Box1
		gunModel[376].setRotationPoint(-93.5F, 7.5F, -4F);

		gunModel[377].addShapeBox(0F, 0F, 0F, 12, 2, 12, 0F,-0.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 1.25F, 0.25F, 0F, 1.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Import Box1
		gunModel[377].setRotationPoint(-109.5F, 15.5F, -6F);

		gunModel[378].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box1
		gunModel[378].setRotationPoint(-111.25F, 15.75F, -6F);

		gunModel[379].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[379].setRotationPoint(-111.25F, 13.75F, -6F);

		gunModel[380].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box1
		gunModel[380].setRotationPoint(-113.25F, 13.75F, -6F);

		gunModel[381].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,-0.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F); // Import Box1
		gunModel[381].setRotationPoint(-108.5F, 11.25F, -4.5F);

		gunModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-0.25F, -0.25F, -2F, 1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, -0.25F, -0.25F, -2F, -0.25F, 0F, -2F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, -2F); // Import Box1
		gunModel[382].setRotationPoint(-110.5F, 11.25F, -4.5F);

		gunModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1.25F, -0.25F, 0F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, 1.25F, -0.25F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 1.25F, 0F, 0F); // Import Box1
		gunModel[383].setRotationPoint(-97.5F, 11.25F, -4.5F);

		gunModel[384].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,-0.25F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Import Box1
		gunModel[384].setRotationPoint(-108.5F, 13.25F, -4.5F);

		gunModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-0.25F, -0.5F, -2F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, -0.25F, -0.5F, -2F, -0.25F, 0.25F, -2F, 1.25F, 0.25F, 0F, 1.25F, 0.25F, 0F, -0.25F, 0.25F, -2F); // Import Box1
		gunModel[385].setRotationPoint(-110.5F, 13.25F, -4.5F);

		gunModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1.25F, -0.5F, 0F, -0.25F, -0.5F, -2F, -0.25F, -0.5F, -2F, 1.25F, -0.5F, 0F, 1.25F, 0.25F, 0F, -0.25F, 0.25F, -2F, -0.25F, 0.25F, -2F, 1.25F, 0.25F, 0F); // Import Box1
		gunModel[386].setRotationPoint(-97.5F, 13.25F, -4.5F);

		gunModel[387].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[387].setRotationPoint(-104.25F, 9.25F, -2F);

		gunModel[388].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[388].setRotationPoint(-100.25F, 9.25F, -2F);

		gunModel[389].addShapeBox(0F, 0F, 0F, 46, 5, 9, 0F,0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -7.5F, -1.5F, 0F, -7.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import Box1
		gunModel[389].setRotationPoint(-112F, -41.5F, -1.5F);

		gunModel[390].addShapeBox(0F, 0F, 0F, 46, 7, 9, 0F,0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0.5F, 0F, -4F); // Import Box1
		gunModel[390].setRotationPoint(-112F, -36.5F, 2F);

		gunModel[391].addShapeBox(0F, 0F, 0F, 46, 1, 11, 0F,0.5F, 0F, -4.5F, -1.5F, 0F, -4.5F, -1.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -4.5F, -1.5F, 0F, -4.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import Box1
		gunModel[391].setRotationPoint(-112F, -42.5F, -7F);

		gunModel[392].addShapeBox(0F, 0F, 0F, 23, 3, 9, 0F,0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0.5F, 0F, -4F, -2.5F, -0.25F, -3.5F, -1.5F, -0.25F, -3.5F, -1.5F, -0.25F, -4F, -2.5F, -0.25F, -4F); // Import Box1
		gunModel[392].setRotationPoint(-112F, -29.5F, 2F);

		gunModel[393].addShapeBox(0F, 0F, 0F, 24, 3, 9, 0F,-1.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, -0.25F, -3.5F, -2.5F, -0.25F, -3.5F, -2.5F, -0.25F, -4F, -1.5F, -0.25F, -4F); // Import Box1
		gunModel[393].setRotationPoint(-92F, -29.5F, 2F);

		gunModel[394].addShapeBox(0F, 0F, 0F, 17, 3, 9, 0F,0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0.5F, 0F, -4F, -3.5F, -0.25F, -3.5F, -1.5F, -0.25F, -3.5F, -1.5F, -0.25F, -4F, -3.5F, -0.25F, -4F); // Import Box1
		gunModel[394].setRotationPoint(-109F, -26.75F, 2F);

		gunModel[395].addShapeBox(0F, 0F, 0F, 24, 3, 9, 0F,-1.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, -0.25F, -3.5F, -3.5F, -0.25F, -3.5F, -3.5F, -0.25F, -4F, -1.5F, -0.25F, -4F); // Import Box1
		gunModel[395].setRotationPoint(-95F, -26.75F, 2F);

		gunModel[396].addShapeBox(0F, 0F, 0F, 18, 2, 9, 0F,-1.5F, 0.25F, -4F, 0.5F, 0.25F, -4F, 0.5F, 0.25F, -4F, -1.5F, 0.25F, -4F, -1.5F, -0.25F, -3.5F, -6.5F, -0.25F, -3.5F, -6.5F, -0.25F, -4F, -1.5F, -0.25F, -4F); // Import Box1
		gunModel[396].setRotationPoint(-93F, -23.75F, 2F);

		gunModel[397].addShapeBox(0F, 0F, 0F, 15, 2, 9, 0F,0.5F, 0.25F, -4F, -1.5F, 0.25F, -4F, -1.5F, 0.25F, -4F, 0.5F, 0.25F, -4F, -6.5F, -0.25F, -3.5F, -1.5F, -0.25F, -3.5F, -1.5F, -0.25F, -4F, -6.5F, -0.25F, -4F); // Import Box1
		gunModel[397].setRotationPoint(-105F, -23.75F, 2F);

		gunModel[398].addShapeBox(0F, 0F, 0F, 40, 7, 9, 0F,0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, -0.5F, -4F, -1.5F, -0.5F, -4F, -1.5F, -0.5F, -4F, 0.5F, -0.5F, -4F); // Import Box1
		gunModel[398].setRotationPoint(-109F, -36.5F, 2.5F);

		gunModel[399].addShapeBox(0F, 0F, 0F, 40, 5, 9, 0F,0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -7.5F, -1.5F, 0F, -7.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import Box1
		gunModel[399].setRotationPoint(-109F, -41.5F, -1F);

		gunModel[400].addShapeBox(0F, 0F, 0F, 40, 1, 11, 0F,0.5F, 0.25F, -4.5F, -1.5F, 0.25F, -4.5F, -1.5F, 0.25F, -4F, 0.5F, 0.25F, -4F, 0.5F, 0F, -4.5F, -1.5F, 0F, -4.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import Box1
		gunModel[400].setRotationPoint(-109F, -42.5F, -6.5F);

		gunModel[401].addShapeBox(0F, 0F, 0F, 18, 3, 9, 0F,0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -3.75F, 0.5F, 0F, -3.75F, 0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -3.75F, 0.5F, 0F, -3.75F); // Import Box1
		gunModel[401].setRotationPoint(-98F, -29F, 2.5F);

		gunModel[402].addShapeBox(0F, 0F, 0F, 18, 2, 9, 0F,0.5F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, -3.75F, 0.5F, 0F, -3.75F, -2.5F, 0.5F, -4F, -4.5F, 0.5F, -4F, -4.5F, 0.5F, -3.75F, -2.5F, 0.5F, -3.75F); // Import Box1
		gunModel[402].setRotationPoint(-98F, -26F, 2.5F);

		gunModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[403].setRotationPoint(-96F, -28F, 7F);

		gunModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[404].setRotationPoint(-85.5F, -28F, 7F);

		gunModel[405].addShapeBox(0F, 0F, 0F, 29, 5, 9, 0F,0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Import Box1
		gunModel[405].setRotationPoint(-67F, -36.5F, -3F);

		gunModel[406].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[406].setRotationPoint(-103F, 17.5F, -2.5F);

		gunModel[407].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[407].setRotationPoint(-104F, 19.5F, -3.5F);

		gunModel[408].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[408].setRotationPoint(-103.5F, 20.5F, -3F);

		gunModel[409].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[409].setRotationPoint(-104F, 21.5F, -3.5F);

		gunModel[410].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[410].setRotationPoint(-103.5F, 22.5F, -3F);

		gunModel[411].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[411].setRotationPoint(-104F, 23.5F, -3.5F);

		gunModel[412].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[412].setRotationPoint(-108F, 24.5F, -3F);

		gunModel[413].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[413].setRotationPoint(-108F, 20.5F, -3F);

		gunModel[414].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Import Box1
		gunModel[414].setRotationPoint(-114F, 20.5F, -3F);

		gunModel[415].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[415].setRotationPoint(-112F, 20.5F, -3F);

		gunModel[416].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[416].setRotationPoint(-112F, 25.5F, -3F);

		gunModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[417].setRotationPoint(-112F, 21.5F, -3F);

		gunModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[418].setRotationPoint(-112F, 24F, -3F);

		gunModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[419].setRotationPoint(-109F, 24F, -3F);

		gunModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box1
		gunModel[420].setRotationPoint(-109F, 21.5F, -3F);

		gunModel[421].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[421].setRotationPoint(-102.5F, 26.5F, -2F);

		gunModel[422].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[422].setRotationPoint(-106.5F, 34.5F, -6F);

		gunModel[423].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[423].setRotationPoint(-106.5F, 34.5F, -2F);

		gunModel[424].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import Box1
		gunModel[424].setRotationPoint(-106.5F, 34.5F, 2F);

		gunModel[425].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[425].setRotationPoint(-102.5F, 34.5F, -6F);

		gunModel[426].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[426].setRotationPoint(-102.5F, 34.5F, -2F);

		gunModel[427].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[427].setRotationPoint(-102.5F, 34.5F, 2F);

		gunModel[428].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[428].setRotationPoint(-98.5F, 34.5F, -6F);

		gunModel[429].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[429].setRotationPoint(-98.5F, 34.5F, -2F);

		gunModel[430].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box1
		gunModel[430].setRotationPoint(-98.5F, 34.5F, 2F);

		gunModel[431].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0.25F, 0F, -2.75F, 0.25F, 0F, -2.75F, 0.25F, 0F, 1F, 0.25F, 0F); // Import Box1
		gunModel[431].setRotationPoint(-122.5F, -22.5F, -4F);

		gunModel[432].addShapeBox(0F, 0F, 0F, 6, 4, 8, 0F,1F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0.25F, 0F, -2.75F, 0.25F, 0F, -2.75F, 0.25F, 0F, 1F, 0.25F, 0F); // Import Box1
		gunModel[432].setRotationPoint(-122.5F, -19.5F, -4F);

		gunModel[433].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,1F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0.25F, -1F, -2.75F, 0.25F, -1F, -2.75F, 0.25F, -1F, 1F, 0.25F, -1F); // Import Box1
		gunModel[433].setRotationPoint(-122.5F, -15.5F, -4F);

		gunModel[434].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box1
		gunModel[434].setRotationPoint(-119F, -15.5F, -2F);

		gunModel[435].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[435].setRotationPoint(-119F, -17.5F, -2F);

		gunModel[436].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[436].setRotationPoint(-119F, -16.5F, -2F);

		gunModel[437].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box1
		gunModel[437].setRotationPoint(-119F, -14.5F, -2F);

		gunModel[438].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, -1F); // Import Box1
		gunModel[438].setRotationPoint(-119F, -12.5F, -2F);

		gunModel[439].addShapeBox(0F, 0F, 0F, 3, 10, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box1
		gunModel[439].setRotationPoint(-121F, -9.5F, -2F);

		gunModel[440].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[440].setRotationPoint(-120F, -17F, -1F);

		gunModel[441].addShapeBox(0F, 0F, 0F, 5, 12, 12, 0F,1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 1F, 1F, 0F); // Import Box1
		gunModel[441].setRotationPoint(-121.5F, -36.5F, -6F);

		gunModel[442].addShapeBox(0F, 0F, 0F, 3, 12, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 1F, 0F); // Import Box1
		gunModel[442].setRotationPoint(-117F, -36.5F, -6F);

		gunModel[443].addShapeBox(0F, 0F, 0F, 34, 12, 12, 0F,2F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 2F, 1F, 0F, 0F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, -2F, 0F); // Import Box1
		gunModel[443].setRotationPoint(-111.75F, -33.5F, -6F);

		gunModel[444].addShapeBox(0F, 0F, 0F, 35, 3, 12, 0F,0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 2F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 2F, 1F, 0F); // Import Box1
		gunModel[444].setRotationPoint(-111.75F, -38.5F, -6F);

		gunModel[445].addShapeBox(0F, 0F, 0F, 19, 1, 8, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F); // Import Box1
		gunModel[445].setRotationPoint(-95.5F, -23.5F, -6F);

		gunModel[446].addShapeBox(0F, 0F, 0F, 18, 9, 9, 0F,-3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -9F, 0.5F, 0F, -9F, 0.5F, 0F, 0F, 0.5F); // Import Box1
		gunModel[446].setRotationPoint(-80.5F, -31.25F, -6F);

		gunModel[447].addShapeBox(0F, 0F, 0F, 35, 3, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box1
		gunModel[447].setRotationPoint(-76.5F, -31.5F, -6F);

		gunModel[448].addShapeBox(0F, 0F, 0F, 29, 5, 12, 0F,0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box1
		gunModel[448].setRotationPoint(-67F, -41.5F, -6F);

		gunModel[449].addShapeBox(0F, 0F, 0F, 84, 1, 1, 0F,1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0.5F, 0.55F, -1F, 0.5F, 0.55F, -1F, 0.5F, 0F, 1F, 0.5F, 0F); // Import Box1
		gunModel[449].setRotationPoint(-121.5F, -41.5F, -3F);

		gunModel[450].addShapeBox(0F, 0F, 0F, 84, 1, 1, 0F,1F, 0.5F, 0.55F, -1F, 0.5F, 0.55F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F); // Import Box1
		gunModel[450].setRotationPoint(-121.5F, -39.5F, -3F);

		gunModel[451].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[451].setRotationPoint(-109F, -28.5F, -6.5F);

		gunModel[452].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[452].setRotationPoint(-84F, -28.5F, -6.5F);

		gunModel[453].addShapeBox(0F, 0F, 0F, 8, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[453].setRotationPoint(-99.5F, -30F, -6.5F);

		gunModel[454].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box1
		gunModel[454].setRotationPoint(-101.5F, -30F, -6.5F);

		gunModel[455].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[455].setRotationPoint(-91.5F, -30F, -6.5F);

		gunModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[456].setRotationPoint(-101F, -28F, -6.75F);

		gunModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[457].setRotationPoint(-91F, -28F, -6.75F);

		gunModel[458].addShapeBox(0F, 0F, 0F, 35, 15, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Import Box8
		gunModel[458].setRotationPoint(29.75F, -20F, -3.5F);

		gunModel[459].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[459].setRotationPoint(28.75F, -3.75F, -4F);

		gunModel[460].addShapeBox(0F, 0F, 0F, 4, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[460].setRotationPoint(35.75F, -1.75F, -4F);

		gunModel[461].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0F, 1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[461].setRotationPoint(39.75F, 3.25F, -4F);

		gunModel[462].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box8
		gunModel[462].setRotationPoint(50.75F, 3.25F, -4F);

		gunModel[463].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[463].setRotationPoint(41.25F, 3.75F, -4F);

		gunModel[464].addShapeBox(0F, 0F, 0F, 4, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[464].setRotationPoint(51.75F, -1.75F, -4F);

		gunModel[465].addShapeBox(0F, 0F, 0F, 14, 2, 7, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[465].setRotationPoint(51.75F, -3.75F, -3F);

		gunModel[466].addShapeBox(0F, 0F, 0F, 7, 11, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[466].setRotationPoint(28.75F, -1.75F, -3.5F);

		gunModel[467].addShapeBox(0F, 0F, 0F, 10, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[467].setRotationPoint(40.75F, 4.25F, -3.5F);

		gunModel[468].addShapeBox(0F, 0F, 0F, 10, 11, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[468].setRotationPoint(55.75F, -1.75F, -3.5F);

		gunModel[469].addShapeBox(0F, 0F, 0F, 12, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[469].setRotationPoint(39.75F, -3.75F, -3.5F);

		gunModel[470].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[470].setRotationPoint(41.25F, -3.25F, -3F);

		gunModel[471].addShapeBox(0F, 0F, 0F, 9, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[471].setRotationPoint(41.25F, -1.25F, -3F);

		gunModel[472].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[472].setRotationPoint(41.75F, -1.25F, -2.65F);

		gunModel[473].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[473].setRotationPoint(41.75F, 0.75F, -2.65F);

		gunModel[474].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[474].setRotationPoint(41.25F, -3.25F, -4F);

		gunModel[475].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[475].setRotationPoint(41.25F, -1.25F, -4F);

		gunModel[476].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[476].setRotationPoint(41.75F, -1.25F, -4.35F);

		gunModel[477].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[477].setRotationPoint(41.75F, 0.75F, -4.35F);

		gunModel[478].addShapeBox(0F, 0F, 0F, 18, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[478].setRotationPoint(109.25F, -50F, -4.5F);

		gunModel[479].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Import Box1
		gunModel[479].setRotationPoint(109.25F, -50F, 4.5F);

		gunModel[480].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[480].setRotationPoint(109.25F, -48F, 6.5F);

		gunModel[481].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[481].setRotationPoint(109.25F, -48F, 5.5F);

		gunModel[482].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[482].setRotationPoint(109.25F, -47F, 5.5F);

		gunModel[483].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box1
		gunModel[483].setRotationPoint(109.25F, -47F, 6.5F);

		gunModel[484].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[484].setRotationPoint(109.25F, -46F, 6F);

		gunModel[485].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box1
		gunModel[485].setRotationPoint(109.25F, -46F, 7F);

		gunModel[486].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[486].setRotationPoint(109.25F, -48F, 4.5F);

		gunModel[487].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[487].setRotationPoint(109.25F, -50F, -5.5F);

		gunModel[488].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[488].setRotationPoint(109.25F, -48F, -7.5F);

		gunModel[489].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[489].setRotationPoint(109.25F, -48F, -6.5F);

		gunModel[490].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box1
		gunModel[490].setRotationPoint(109.25F, -48F, -5.5F);

		gunModel[491].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box1
		gunModel[491].setRotationPoint(109.25F, -47F, -6.5F);

		gunModel[492].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box1
		gunModel[492].setRotationPoint(109.25F, -47F, -8F);

		gunModel[493].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box1
		gunModel[493].setRotationPoint(109.25F, -46F, -7F);

		gunModel[494].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[494].setRotationPoint(109.25F, -46F, -8F);

		gunModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[495].setRotationPoint(122.25F, -48F, -3F);

		gunModel[496].addShapeBox(0F, 0F, 0F, 11, 3, 9, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Import Box1
		gunModel[496].setRotationPoint(127.75F, -50F, -4.5F);

		gunModel[497].addShapeBox(0F, 0F, 0F, 11, 4, 9, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[497].setRotationPoint(127.25F, -46F, -4.5F);

		gunModel[498].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box1
		gunModel[498].setRotationPoint(127.75F, -47F, 7.5F);

		gunModel[499].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0.75F, -2F, 0F, 0.75F, -2F, 0F, -0.75F, -2F, 0F, -0.75F); // Import Box1
		gunModel[499].setRotationPoint(127.75F, -43F, 9.75F);
	}

	private void initgunModel_2()
	{
		gunModel[500] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Import Box1
		gunModel[501] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Import Box1
		gunModel[502] = new ModelRendererTurbo(this, 985, 329, textureX, textureY); // Import Box1
		gunModel[503] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Import Box1
		gunModel[504] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Import Box1
		gunModel[505] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Import Box1
		gunModel[506] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Import Box1
		gunModel[507] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Import Box1
		gunModel[508] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Import Box1
		gunModel[509] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Import Box1
		gunModel[510] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Import Box1
		gunModel[511] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Import Box1
		gunModel[512] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Import Box1
		gunModel[513] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Import Box1
		gunModel[514] = new ModelRendererTurbo(this, 625, 329, textureX, textureY); // Import Box1
		gunModel[515] = new ModelRendererTurbo(this, 601, 337, textureX, textureY); // Import Box1
		gunModel[516] = new ModelRendererTurbo(this, 641, 337, textureX, textureY); // Import Box1
		gunModel[517] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Import Box1
		gunModel[518] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Import Box1
		gunModel[519] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Import Box1
		gunModel[520] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Import Box1
		gunModel[521] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Import Box1
		gunModel[522] = new ModelRendererTurbo(this, 577, 185, textureX, textureY); // Import Box1
		gunModel[523] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Import Box1
		gunModel[524] = new ModelRendererTurbo(this, 657, 185, textureX, textureY); // Import Box1
		gunModel[525] = new ModelRendererTurbo(this, 697, 185, textureX, textureY); // Import Box1
		gunModel[526] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box1
		gunModel[527] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box1
		gunModel[528] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Import Box1
		gunModel[529] = new ModelRendererTurbo(this, 1009, 249, textureX, textureY); // Import Box1
		gunModel[530] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Import Box1
		gunModel[531] = new ModelRendererTurbo(this, 657, 337, textureX, textureY); // Import Box1
		gunModel[532] = new ModelRendererTurbo(this, 673, 337, textureX, textureY); // Import Box1
		gunModel[533] = new ModelRendererTurbo(this, 689, 337, textureX, textureY); // Import Box1
		gunModel[534] = new ModelRendererTurbo(this, 337, 329, textureX, textureY); // Import Box1
		gunModel[535] = new ModelRendererTurbo(this, 841, 329, textureX, textureY); // Import Box1
		gunModel[536] = new ModelRendererTurbo(this, 953, 329, textureX, textureY); // Import Box1
		gunModel[537] = new ModelRendererTurbo(this, 833, 153, textureX, textureY); // Import Box1
		gunModel[538] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Import Box1
		gunModel[539] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Import Box1
		gunModel[540] = new ModelRendererTurbo(this, 377, 337, textureX, textureY); // Import Box1
		gunModel[541] = new ModelRendererTurbo(this, 705, 337, textureX, textureY); // Import Box1
		gunModel[542] = new ModelRendererTurbo(this, 721, 337, textureX, textureY); // Import Box1
		gunModel[543] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Import Box1
		gunModel[544] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Import Box1
		gunModel[545] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box1
		gunModel[546] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box1
		gunModel[547] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box1
		gunModel[548] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box1
		gunModel[549] = new ModelRendererTurbo(this, 825, 321, textureX, textureY); // Box 736

		gunModel[500].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box1
		gunModel[500].setRotationPoint(127.75F, -47F, -9.5F);

		gunModel[501].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, -0.75F, -2F, 0F, -0.75F, -2F, 0F, 0.75F, -2F, 0F, 0.75F); // Import Box1
		gunModel[501].setRotationPoint(127.75F, -43F, -11.75F);

		gunModel[502].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box1
		gunModel[502].setRotationPoint(127.25F, -47F, -4F);

		gunModel[503].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[503].setRotationPoint(109.25F, -45F, 6.5F);

		gunModel[504].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box1
		gunModel[504].setRotationPoint(109.25F, -45F, 7.5F);

		gunModel[505].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[505].setRotationPoint(109.25F, -44F, 7F);

		gunModel[506].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box1
		gunModel[506].setRotationPoint(109.25F, -44F, 8F);

		gunModel[507].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box1
		gunModel[507].setRotationPoint(109.25F, -45F, -7.5F);

		gunModel[508].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[508].setRotationPoint(109.25F, -45F, -8.5F);

		gunModel[509].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box1
		gunModel[509].setRotationPoint(109.25F, -44F, -8F);

		gunModel[510].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[510].setRotationPoint(109.25F, -44F, -9F);

		gunModel[511].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box1
		gunModel[511].setRotationPoint(128.75F, 29F, 20.75F);

		gunModel[512].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[512].setRotationPoint(131.75F, 29F, 20.75F);

		gunModel[513].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box1
		gunModel[513].setRotationPoint(134.75F, 29F, 20.75F);

		gunModel[514].addShapeBox(0F, 0F, 0F, 1, 68, 3, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -17.75F, 0.25F, 0F, -17.75F, 0.25F, 0F, 18.25F, 0.25F, 0F, 18.25F); // Import Box1
		gunModel[514].setRotationPoint(132.75F, -39.25F, 6.25F);

		gunModel[515].addShapeBox(0F, 0F, 0F, 1, 68, 3, 0F,0F, 0F, 0.25F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, -17.75F, 0.25F, 0F, -19F, 0.25F, 0F, 17F, 0F, 0F, 18.25F); // Import Box1
		gunModel[515].setRotationPoint(134F, -39.25F, 6.25F);

		gunModel[516].addShapeBox(0F, 0F, 0F, 1, 68, 3, 0F,0.25F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, -1F, 0.25F, 0F, -19F, 0F, 0F, -17.75F, 0F, 0F, 18.25F, 0.25F, 0F, 17F); // Import Box1
		gunModel[516].setRotationPoint(131.5F, -39.25F, 6.25F);

		gunModel[517].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, 1.75F); // Import Box1
		gunModel[517].setRotationPoint(132.25F, -46F, 3.25F);

		gunModel[518].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -3.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 1.75F); // Import Box1
		gunModel[518].setRotationPoint(133.75F, -46F, 3.25F);

		gunModel[519].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -3.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, 0.25F); // Import Box1
		gunModel[519].setRotationPoint(130.75F, -46F, 3.25F);

		gunModel[520].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 1.5F); // Import Box1
		gunModel[520].setRotationPoint(132.25F, -19F, 10.75F);

		gunModel[521].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1.5F); // Import Box1
		gunModel[521].setRotationPoint(133.75F, -19F, 10.75F);

		gunModel[522].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0F); // Import Box1
		gunModel[522].setRotationPoint(130.75F, -19F, 10.75F);

		gunModel[523].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 1.5F); // Import Box1
		gunModel[523].setRotationPoint(132.25F, 22.25F, 21.5F);

		gunModel[524].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1.5F); // Import Box1
		gunModel[524].setRotationPoint(133.75F, 22.25F, 21.5F);

		gunModel[525].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0F); // Import Box1
		gunModel[525].setRotationPoint(130.75F, 22.25F, 21.5F);

		gunModel[526].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.25F, -5.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -5.25F, 1.25F, -0.25F, -0.25F, -1.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 2F); // Import Box1
		gunModel[526].setRotationPoint(129.25F, 22.25F, 23F);

		gunModel[527].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box1
		gunModel[527].setRotationPoint(129.25F, 23F, 24F);

		gunModel[528].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F); // Import Box1
		gunModel[528].setRotationPoint(132.25F, -46F, -8.25F);

		gunModel[529].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -3.75F, -0.25F, -0.25F, -2.25F); // Import Box1
		gunModel[529].setRotationPoint(133.75F, -46F, -8.25F);

		gunModel[530].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 1.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -3.75F); // Import Box1
		gunModel[530].setRotationPoint(130.75F, -46F, -8.25F);

		gunModel[531].addShapeBox(0F, 0F, 0F, 1, 68, 3, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 18.25F, 0.25F, 0F, 18.25F, 0.25F, 0F, -17.75F, 0.25F, 0F, -17.75F); // Import Box1
		gunModel[531].setRotationPoint(132.75F, -39.25F, -9.25F);

		gunModel[532].addShapeBox(0F, 0F, 0F, 1, 68, 3, 0F,0F, 0F, 0.25F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 18.25F, 0.25F, 0F, 17F, 0.25F, 0F, -19F, 0F, 0F, -17.75F); // Import Box1
		gunModel[532].setRotationPoint(134F, -39.25F, -9.25F);

		gunModel[533].addShapeBox(0F, 0F, 0F, 1, 68, 3, 0F,0.25F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, -1F, 0.25F, 0F, 17F, 0F, 0F, 18.25F, 0F, 0F, -17.75F, 0.25F, 0F, -19F); // Import Box1
		gunModel[533].setRotationPoint(131.5F, -39.25F, -9.25F);

		gunModel[534].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F); // Import Box1
		gunModel[534].setRotationPoint(132.25F, -19F, -15.75F);

		gunModel[535].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -2F); // Import Box1
		gunModel[535].setRotationPoint(133.75F, -19F, -15.75F);

		gunModel[536].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -3.5F); // Import Box1
		gunModel[536].setRotationPoint(130.75F, -19F, -15.75F);

		gunModel[537].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box1
		gunModel[537].setRotationPoint(128.75F, 29F, -29.75F);

		gunModel[538].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[538].setRotationPoint(131.75F, 29F, -29.75F);

		gunModel[539].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box1
		gunModel[539].setRotationPoint(134.75F, 29F, -29.75F);

		gunModel[540].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F); // Import Box1
		gunModel[540].setRotationPoint(132.25F, 22.25F, -26.5F);

		gunModel[541].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -2F); // Import Box1
		gunModel[541].setRotationPoint(133.75F, 22.25F, -26.5F);

		gunModel[542].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,-0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -3.5F); // Import Box1
		gunModel[542].setRotationPoint(130.75F, 22.25F, -26.5F);

		gunModel[543].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.25F, -5.25F, 1.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -5.25F, -0.75F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -1.5F); // Import Box1
		gunModel[543].setRotationPoint(129.25F, 22.25F, -25F);

		gunModel[544].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box1
		gunModel[544].setRotationPoint(129.25F, 23F, -25F);

		gunModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[545].setRotationPoint(137F, -49F, 6F);

		gunModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[546].setRotationPoint(128.5F, -49F, 6F);

		gunModel[547].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[547].setRotationPoint(128.5F, -49F, -7F);

		gunModel[548].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		gunModel[548].setRotationPoint(137F, -49F, -7F);

		gunModel[549].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F,0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 736
		gunModel[549].setRotationPoint(-43.75F, -59F, -5F);
	}

	private void initdefaultScopeModel_1()
	{
		defaultScopeModel[0] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Import Box1
		defaultScopeModel[1] = new ModelRendererTurbo(this, 377, 305, textureX, textureY); // Import Box1
		defaultScopeModel[2] = new ModelRendererTurbo(this, 745, 305, textureX, textureY); // Import Box1
		defaultScopeModel[3] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Import Box1
		defaultScopeModel[4] = new ModelRendererTurbo(this, 977, 305, textureX, textureY); // Import Box1
		defaultScopeModel[5] = new ModelRendererTurbo(this, 73, 313, textureX, textureY); // Import Box1
		defaultScopeModel[6] = new ModelRendererTurbo(this, 233, 313, textureX, textureY); // Import Box1
		defaultScopeModel[7] = new ModelRendererTurbo(this, 585, 89, textureX, textureY); // Import Box1
		defaultScopeModel[8] = new ModelRendererTurbo(this, 561, 313, textureX, textureY); // Import Box1
		defaultScopeModel[9] = new ModelRendererTurbo(this, 585, 313, textureX, textureY); // Import Box1
		defaultScopeModel[10] = new ModelRendererTurbo(this, 617, 313, textureX, textureY); // Import Box1
		defaultScopeModel[11] = new ModelRendererTurbo(this, 705, 313, textureX, textureY); // Import Box1
		defaultScopeModel[12] = new ModelRendererTurbo(this, 641, 313, textureX, textureY); // Import Box1
		defaultScopeModel[13] = new ModelRendererTurbo(this, 257, 321, textureX, textureY); // Import Box1
		defaultScopeModel[14] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Import Box1
		defaultScopeModel[15] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Import Box1
		defaultScopeModel[16] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Import Box1
		defaultScopeModel[17] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Import Box1
		defaultScopeModel[18] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Import Box1
		defaultScopeModel[19] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Import Box1
		defaultScopeModel[20] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Import Box1
		defaultScopeModel[21] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Import Box1
		defaultScopeModel[22] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Import Box1
		defaultScopeModel[23] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box1
		defaultScopeModel[24] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box1
		defaultScopeModel[25] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Box1
		defaultScopeModel[26] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Import Box1
		defaultScopeModel[27] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import Box1
		defaultScopeModel[28] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Import Box1
		defaultScopeModel[29] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Import Box1
		defaultScopeModel[30] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Import Box1
		defaultScopeModel[31] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Import Box1
		defaultScopeModel[32] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import Box1
		defaultScopeModel[33] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box1
		defaultScopeModel[34] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Import Box1
		defaultScopeModel[35] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Import Box1
		defaultScopeModel[36] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Import Box1
		defaultScopeModel[37] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Import Box1
		defaultScopeModel[38] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); // Import Box1
		defaultScopeModel[39] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box1
		defaultScopeModel[40] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import Box1
		defaultScopeModel[41] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Import Box1
		defaultScopeModel[42] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Import Box1
		defaultScopeModel[43] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Import Box1
		defaultScopeModel[44] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Import Box1
		defaultScopeModel[45] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Import Box1
		defaultScopeModel[46] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Import Box1
		defaultScopeModel[47] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Import Box1
		defaultScopeModel[48] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Import Box1
		defaultScopeModel[49] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Import Box1
		defaultScopeModel[50] = new ModelRendererTurbo(this, 1001, 297, textureX, textureY); // Import Box1
		defaultScopeModel[51] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Import Box1
		defaultScopeModel[52] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Import Box1
		defaultScopeModel[53] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Import Box1
		defaultScopeModel[54] = new ModelRendererTurbo(this, 865, 89, textureX, textureY); // Import Box1
		defaultScopeModel[55] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Import Box1
		defaultScopeModel[56] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Import Box1
		defaultScopeModel[57] = new ModelRendererTurbo(this, 281, 321, textureX, textureY); // Import Box1
		defaultScopeModel[58] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Import Box1
		defaultScopeModel[59] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Import Box1
		defaultScopeModel[60] = new ModelRendererTurbo(this, 809, 105, textureX, textureY); // Import Box1
		defaultScopeModel[61] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 567
		defaultScopeModel[62] = new ModelRendererTurbo(this, 313, 313, textureX, textureY); // Box 568
		defaultScopeModel[63] = new ModelRendererTurbo(this, 929, 313, textureX, textureY); // Box 569
		defaultScopeModel[64] = new ModelRendererTurbo(this, 121, 321, textureX, textureY); // Box 570
		defaultScopeModel[65] = new ModelRendererTurbo(this, 161, 321, textureX, textureY); // Box 571
		defaultScopeModel[66] = new ModelRendererTurbo(this, 25, 321, textureX, textureY); // Box 572
		defaultScopeModel[67] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 573
		defaultScopeModel[68] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Box 574
		defaultScopeModel[69] = new ModelRendererTurbo(this, 393, 321, textureX, textureY); // Box 0
		defaultScopeModel[70] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 1
		defaultScopeModel[71] = new ModelRendererTurbo(this, 153, 337, textureX, textureY); // Box 2
		defaultScopeModel[72] = new ModelRendererTurbo(this, 737, 345, textureX, textureY); // Box 3
		defaultScopeModel[73] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 4
		defaultScopeModel[74] = new ModelRendererTurbo(this, 153, 353, textureX, textureY); // Box 5
		defaultScopeModel[75] = new ModelRendererTurbo(this, 449, 353, textureX, textureY); // Box 6
		defaultScopeModel[76] = new ModelRendererTurbo(this, 305, 361, textureX, textureY); // Box 7
		defaultScopeModel[77] = new ModelRendererTurbo(this, 737, 321, textureX, textureY); // Box 709
		defaultScopeModel[78] = new ModelRendererTurbo(this, 857, 329, textureX, textureY); // Box 716
		defaultScopeModel[79] = new ModelRendererTurbo(this, 889, 345, textureX, textureY); // Box 717
		defaultScopeModel[80] = new ModelRendererTurbo(this, 705, 361, textureX, textureY); // Box 718
		defaultScopeModel[81] = new ModelRendererTurbo(this, 793, 361, textureX, textureY); // Box 719
		defaultScopeModel[82] = new ModelRendererTurbo(this, 889, 361, textureX, textureY); // Box 720
		defaultScopeModel[83] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 721
		defaultScopeModel[84] = new ModelRendererTurbo(this, 97, 369, textureX, textureY); // Box 722
		defaultScopeModel[85] = new ModelRendererTurbo(this, 497, 337, textureX, textureY); // Box 418
		defaultScopeModel[86] = new ModelRendererTurbo(this, 297, 345, textureX, textureY); // Box 419
		defaultScopeModel[87] = new ModelRendererTurbo(this, 337, 345, textureX, textureY); // Box 420
		defaultScopeModel[88] = new ModelRendererTurbo(this, 977, 361, textureX, textureY); // Box 421
		defaultScopeModel[89] = new ModelRendererTurbo(this, 185, 369, textureX, textureY); // Box 422
		defaultScopeModel[90] = new ModelRendererTurbo(this, 985, 345, textureX, textureY); // Box 423
		defaultScopeModel[91] = new ModelRendererTurbo(this, 929, 297, textureX, textureY); // Box 731
		defaultScopeModel[92] = new ModelRendererTurbo(this, 121, 305, textureX, textureY); // Box 732
		defaultScopeModel[93] = new ModelRendererTurbo(this, 1001, 313, textureX, textureY); // Box 733
		defaultScopeModel[94] = new ModelRendererTurbo(this, 689, 321, textureX, textureY); // Box 734
		defaultScopeModel[95] = new ModelRendererTurbo(this, 969, 321, textureX, textureY); // Box 735
		defaultScopeModel[96] = new ModelRendererTurbo(this, 313, 329, textureX, textureY); // Box 737
		defaultScopeModel[97] = new ModelRendererTurbo(this, 233, 369, textureX, textureY); // Box 738
		defaultScopeModel[98] = new ModelRendererTurbo(this, 969, 337, textureX, textureY); // Box 749
		defaultScopeModel[99] = new ModelRendererTurbo(this, 57, 313, textureX, textureY); // Box 750
		defaultScopeModel[100] = new ModelRendererTurbo(this, 257, 369, textureX, textureY); // Box 751
		defaultScopeModel[101] = new ModelRendererTurbo(this, 545, 321, textureX, textureY); // Box 752
		defaultScopeModel[102] = new ModelRendererTurbo(this, 281, 369, textureX, textureY); // Box 753
		defaultScopeModel[103] = new ModelRendererTurbo(this, 449, 369, textureX, textureY); // Box 754
		defaultScopeModel[104] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 755
		defaultScopeModel[105] = new ModelRendererTurbo(this, 489, 369, textureX, textureY); // Box 756
		defaultScopeModel[106] = new ModelRendererTurbo(this, 513, 369, textureX, textureY); // Box 757
		defaultScopeModel[107] = new ModelRendererTurbo(this, 553, 369, textureX, textureY); // Box 758
		defaultScopeModel[108] = new ModelRendererTurbo(this, 289, 377, textureX, textureY); // Box 759
		defaultScopeModel[109] = new ModelRendererTurbo(this, 321, 377, textureX, textureY); // Box 760
		defaultScopeModel[110] = new ModelRendererTurbo(this, 345, 377, textureX, textureY); // Box 761
		defaultScopeModel[111] = new ModelRendererTurbo(this, 369, 377, textureX, textureY); // Box 762
		defaultScopeModel[112] = new ModelRendererTurbo(this, 401, 377, textureX, textureY); // Box 763
		defaultScopeModel[113] = new ModelRendererTurbo(this, 433, 377, textureX, textureY); // Box 764
		defaultScopeModel[114] = new ModelRendererTurbo(this, 705, 377, textureX, textureY); // Box 765
		defaultScopeModel[115] = new ModelRendererTurbo(this, 729, 377, textureX, textureY); // Box 766
		defaultScopeModel[116] = new ModelRendererTurbo(this, 761, 377, textureX, textureY); // Box 767
		defaultScopeModel[117] = new ModelRendererTurbo(this, 785, 377, textureX, textureY); // Box 768
		defaultScopeModel[118] = new ModelRendererTurbo(this, 801, 377, textureX, textureY); // Box 769
		defaultScopeModel[119] = new ModelRendererTurbo(this, 817, 377, textureX, textureY); // Box 770
		defaultScopeModel[120] = new ModelRendererTurbo(this, 841, 377, textureX, textureY); // Box 771
		defaultScopeModel[121] = new ModelRendererTurbo(this, 865, 377, textureX, textureY); // Box 772
		defaultScopeModel[122] = new ModelRendererTurbo(this, 881, 377, textureX, textureY); // Box 773
		defaultScopeModel[123] = new ModelRendererTurbo(this, 897, 377, textureX, textureY); // Box 774

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 8, 5, 10, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		defaultScopeModel[0].setRotationPoint(-5.75F, -47F, -5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 8, 5, 10, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		defaultScopeModel[1].setRotationPoint(19.25F, -47F, -5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 42, 5, 10, 0F,0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box1
		defaultScopeModel[2].setRotationPoint(-10.75F, -52F, -5F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		defaultScopeModel[3].setRotationPoint(-6.75F, -53.5F, -3F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, 0.5F, 0F, 3F, 0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F); // Import Box1
		defaultScopeModel[4].setRotationPoint(-6.75F, -57F, -3F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		defaultScopeModel[5].setRotationPoint(-6.75F, -61.5F, -6F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, 0.5F, 0F, 3F); // Import Box1
		defaultScopeModel[6].setRotationPoint(-6.75F, -64.5F, -3F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		defaultScopeModel[7].setRotationPoint(20.25F, -53.5F, -3F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, 0.5F, 0F, 3F, 0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F); // Import Box1
		defaultScopeModel[8].setRotationPoint(20.25F, -57F, -3F);

		defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		defaultScopeModel[9].setRotationPoint(20.25F, -61.5F, -6F);

		defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, 0.5F, 0F, 3F); // Import Box1
		defaultScopeModel[10].setRotationPoint(20.25F, -64.5F, -3F);

		defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, 0.5F, 0F, 3F, -0.5F, 0.5F, 1F, -1.5F, 0.5F, 1F, -1.5F, 0.5F, 1F, -0.5F, 0.5F, 1F); // Import Box1
		defaultScopeModel[11].setRotationPoint(6.25F, -57F, -3F);

		defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 9, 4, 12, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box1
		defaultScopeModel[12].setRotationPoint(6.25F, -61.5F, -6F);

		defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,-0.5F, 0.5F, 1F, -1.5F, 0.5F, 1F, -1.5F, 0.5F, 1F, -0.5F, 0.5F, 1F, 0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, 0.5F, 0F, 3F); // Import Box1
		defaultScopeModel[13].setRotationPoint(6.25F, -64.5F, -3F);

		defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-2.75F, -0.25F, 1F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[14].setRotationPoint(6.25F, -63F, 6F);

		defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.25F, -0.25F, 1F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[15].setRotationPoint(8.75F, -63F, 6F);

		defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.25F, -0.25F, 1F, -2.75F, -0.25F, 1F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[16].setRotationPoint(11.25F, -63F, 6F);

		defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[17].setRotationPoint(8.75F, -60.5F, 6F);

		defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[18].setRotationPoint(6.25F, -60.5F, 6F);

		defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[19].setRotationPoint(11.25F, -60.5F, 6F);

		defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1F, -2.75F, -0.25F, 1F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[20].setRotationPoint(11.25F, -58F, 6F);

		defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 1F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F); // Import Box1
		defaultScopeModel[21].setRotationPoint(6.25F, -58F, 6F);

		defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[22].setRotationPoint(8.75F, -58F, 6F);

		defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[23].setRotationPoint(6.25F, -63F, 10F);

		defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[24].setRotationPoint(8.75F, -63F, 10F);

		defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[25].setRotationPoint(11.25F, -63F, 10F);

		defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[26].setRotationPoint(8.75F, -60.5F, 10F);

		defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[27].setRotationPoint(6.25F, -60.5F, 10F);

		defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[28].setRotationPoint(11.25F, -60.5F, 10F);

		defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[29].setRotationPoint(11.25F, -58F, 10F);

		defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F); // Import Box1
		defaultScopeModel[30].setRotationPoint(6.25F, -58F, 10F);

		defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[31].setRotationPoint(8.75F, -58F, 10F);

		defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		defaultScopeModel[32].setRotationPoint(7.25F, -62.25F, 9F);

		defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		defaultScopeModel[33].setRotationPoint(7.25F, -60.25F, 9F);

		defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box1
		defaultScopeModel[34].setRotationPoint(7.25F, -58.25F, 9F);

		defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		defaultScopeModel[35].setRotationPoint(7.25F, -62.25F, -8F);

		defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		defaultScopeModel[36].setRotationPoint(7.25F, -60.25F, -8F);

		defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box1
		defaultScopeModel[37].setRotationPoint(7.25F, -58.25F, -8F);

		defaultScopeModel[38].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[38].setRotationPoint(6.25F, -63F, -9F);

		defaultScopeModel[39].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[39].setRotationPoint(8.75F, -63F, -9F);

		defaultScopeModel[40].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[40].setRotationPoint(11.25F, -63F, -9F);

		defaultScopeModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[41].setRotationPoint(8.75F, -60.5F, -9F);

		defaultScopeModel[42].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[42].setRotationPoint(6.25F, -60.5F, -9F);

		defaultScopeModel[43].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[43].setRotationPoint(11.25F, -60.5F, -9F);

		defaultScopeModel[44].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[44].setRotationPoint(11.25F, -58F, -9F);

		defaultScopeModel[45].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F); // Import Box1
		defaultScopeModel[45].setRotationPoint(6.25F, -58F, -9F);

		defaultScopeModel[46].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box1
		defaultScopeModel[46].setRotationPoint(8.75F, -58F, -9F);

		defaultScopeModel[47].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box1
		defaultScopeModel[47].setRotationPoint(6.25F, -70F, -1.5F);

		defaultScopeModel[48].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.25F, 0.5F, -2.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box1
		defaultScopeModel[48].setRotationPoint(6.25F, -70F, -4F);

		defaultScopeModel[49].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F); // Import Box1
		defaultScopeModel[49].setRotationPoint(6.25F, -70F, 1F);

		defaultScopeModel[50].addShapeBox(0F, 0F, 0F, 3, 5, 8, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box1
		defaultScopeModel[50].setRotationPoint(8.75F, -70F, -4F);

		defaultScopeModel[51].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -2.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box1
		defaultScopeModel[51].setRotationPoint(11.25F, -70F, -4F);

		defaultScopeModel[52].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box1
		defaultScopeModel[52].setRotationPoint(11.25F, -70F, -1.5F);

		defaultScopeModel[53].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -2.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F); // Import Box1
		defaultScopeModel[53].setRotationPoint(11.25F, -70F, 1F);

		defaultScopeModel[54].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box1
		defaultScopeModel[54].setRotationPoint(4.75F, -72F, -2F);

		defaultScopeModel[55].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.25F, 0.5F, -3.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -3.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box1
		defaultScopeModel[55].setRotationPoint(4.75F, -72F, -5.5F);

		defaultScopeModel[56].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -3.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -3.75F); // Import Box1
		defaultScopeModel[56].setRotationPoint(4.75F, -72F, 1.5F);

		defaultScopeModel[57].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box1
		defaultScopeModel[57].setRotationPoint(8.25F, -72F, -5.5F);

		defaultScopeModel[58].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -3.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -3.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box1
		defaultScopeModel[58].setRotationPoint(11.75F, -72F, -5.5F);

		defaultScopeModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box1
		defaultScopeModel[59].setRotationPoint(11.75F, -72F, -2F);

		defaultScopeModel[60].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -3.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -3.75F, -0.25F, 0F, -0.25F); // Import Box1
		defaultScopeModel[60].setRotationPoint(11.75F, -72F, 1.5F);

		defaultScopeModel[61].addShapeBox(0F, 0F, 0F, 10, 9, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, -2.75F, 0F, -1.2F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 567
		defaultScopeModel[61].setRotationPoint(66.25F, -68F, 0F);

		defaultScopeModel[62].addShapeBox(0F, 0F, 0F, 10, 6, 9, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, -2.75F, -1.2F, 0F, -2.75F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 568
		defaultScopeModel[62].setRotationPoint(66.25F, -65F, 0F);

		defaultScopeModel[63].addShapeBox(0F, 0F, 0F, 10, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -2.75F, -1.2F, 0F, -2.75F, -1.2F); // Box 569
		defaultScopeModel[63].setRotationPoint(66.25F, -59F, 0F);

		defaultScopeModel[64].addShapeBox(0F, 0F, 0F, 10, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, -2.75F, 0F, -1.2F, -2.75F); // Box 570
		defaultScopeModel[64].setRotationPoint(66.25F, -59F, 0F);

		defaultScopeModel[65].addShapeBox(0F, 0F, 0F, 10, 9, 6, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -2.75F, 0F, -1.2F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 571
		defaultScopeModel[65].setRotationPoint(66.25F, -59F, -6F);

		defaultScopeModel[66].addShapeBox(0F, 0F, 0F, 10, 6, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, -1.2F, 0F, -2.75F, -1.2F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 572
		defaultScopeModel[66].setRotationPoint(66.25F, -59F, -9F);

		defaultScopeModel[67].addShapeBox(0F, 0F, 0F, 10, 6, 9, 0F,0F, -2.75F, -1.2F, 0F, -2.75F, -1.2F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		defaultScopeModel[67].setRotationPoint(66.25F, -65F, -9F);

		defaultScopeModel[68].addShapeBox(0F, 0F, 0F, 10, 9, 6, 0F,0F, -1.2F, -2.75F, 0F, -1.2F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		defaultScopeModel[68].setRotationPoint(66.25F, -68F, -6F);

		defaultScopeModel[69].addShapeBox(0F, 0F, 0F, 69, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -2.05F, 0F, -0.4F, -2.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -0.45F, 0F, -3.55F, -0.45F); // Box 0
		defaultScopeModel[69].setRotationPoint(-37.75F, -64F, 0F);

		defaultScopeModel[70].addShapeBox(0F, 0F, 0F, 69, 4, 5, 0F,0F, -0.45F, -3.55F, 0F, -0.45F, -3.55F, 0F, -2.05F, -0.4F, 0F, -2.05F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		defaultScopeModel[70].setRotationPoint(-37.75F, -63F, 0F);

		defaultScopeModel[71].addShapeBox(0F, 0F, 0F, 69, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -0.45F, 0F, -3.55F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -2.05F, 0F, -0.4F, -2.05F); // Box 2
		defaultScopeModel[71].setRotationPoint(-37.75F, -59F, 0F);

		defaultScopeModel[72].addShapeBox(0F, 0F, 0F, 69, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -3.55F, 0F, -0.45F, -3.55F, 0F, -2.05F, -0.4F, 0F, -2.05F, -0.4F); // Box 3
		defaultScopeModel[72].setRotationPoint(-37.75F, -59F, 0F);

		defaultScopeModel[73].addShapeBox(0F, 0F, 0F, 69, 5, 4, 0F,0F, -3.55F, -0.45F, 0F, -3.55F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -2.05F, 0F, -0.4F, -2.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		defaultScopeModel[73].setRotationPoint(-37.75F, -59F, -4F);

		defaultScopeModel[74].addShapeBox(0F, 0F, 0F, 69, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.05F, -0.4F, 0F, -2.05F, -0.4F, 0F, -0.45F, -3.55F, 0F, -0.45F, -3.55F); // Box 5
		defaultScopeModel[74].setRotationPoint(-37.75F, -59F, -5F);

		defaultScopeModel[75].addShapeBox(0F, 0F, 0F, 69, 4, 5, 0F,0F, -2.05F, -0.4F, 0F, -2.05F, -0.4F, 0F, -0.45F, -3.55F, 0F, -0.45F, -3.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		defaultScopeModel[75].setRotationPoint(-37.75F, -63F, -5F);

		defaultScopeModel[76].addShapeBox(0F, 0F, 0F, 69, 5, 4, 0F,0F, -0.4F, -2.05F, 0F, -0.4F, -2.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -0.45F, 0F, -3.55F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		defaultScopeModel[76].setRotationPoint(-37.75F, -64F, -4F);

		defaultScopeModel[77].addShapeBox(0F, 0F, 0F, 35, 9, 6, 0F,0F, -4F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, -2.75F, 0F, -4.4F, -4.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3.55F, -2.45F); // Box 709
		defaultScopeModel[77].setRotationPoint(31.25F, -68F, 0F);

		defaultScopeModel[78].addShapeBox(0F, 0F, 0F, 35, 6, 9, 0F,0F, -2.45F, -3.55F, 0F, 0F, -6F, 0F, -2.75F, -1.2F, 0F, -4.05F, -4.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F); // Box 716
		defaultScopeModel[78].setRotationPoint(31.25F, -65F, 0F);

		defaultScopeModel[79].addShapeBox(0F, 0F, 0F, 35, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, -2.45F, -3.55F, 0F, 0F, -6F, 0F, -2.75F, -1.2F, 0F, -4.05F, -4.4F); // Box 717
		defaultScopeModel[79].setRotationPoint(31.25F, -59F, 0F);

		defaultScopeModel[80].addShapeBox(0F, 0F, 0F, 35, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3.55F, -2.45F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, -1.2F, -2.75F, 0F, -4.4F, -4.05F); // Box 718
		defaultScopeModel[80].setRotationPoint(31.25F, -59F, 0F);

		defaultScopeModel[81].addShapeBox(0F, 0F, 0F, 35, 6, 9, 0F,0F, -4.05F, -4.4F, 0F, -2.75F, -1.2F, 0F, 0F, -6F, 0F, -2.45F, -3.55F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		defaultScopeModel[81].setRotationPoint(31.25F, -65F, -9F);

		defaultScopeModel[82].addShapeBox(0F, 0F, 0F, 35, 9, 6, 0F,0F, -4.4F, -4.05F, 0F, -1.2F, -2.75F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, -3.55F, -2.45F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 720
		defaultScopeModel[82].setRotationPoint(31.25F, -68F, -6F);

		defaultScopeModel[83].addShapeBox(0F, 0F, 0F, 35, 6, 9, 0F,0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.05F, -4.4F, 0F, -2.75F, -1.2F, 0F, 0F, -6F, 0F, -2.45F, -3.55F); // Box 721
		defaultScopeModel[83].setRotationPoint(31.25F, -59F, -9F);

		defaultScopeModel[84].addShapeBox(0F, 0F, 0F, 35, 9, 6, 0F,0F, -3.55F, -2.45F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.4F, -4.05F, 0F, -1.2F, -2.75F, 0F, -0.5F, 0F, 0F, -4F, 0F); // Box 722
		defaultScopeModel[84].setRotationPoint(31.25F, -59F, -6F);

		defaultScopeModel[85].addShapeBox(0F, 0F, 0F, 14, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F); // Box 418
		defaultScopeModel[85].setRotationPoint(-34.75F, -59F, 0F);

		defaultScopeModel[86].addShapeBox(0F, 0F, 0F, 14, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F); // Box 419
		defaultScopeModel[86].setRotationPoint(-34.75F, -59F, 0F);

		defaultScopeModel[87].addShapeBox(0F, 0F, 0F, 14, 7, 5, 0F,0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 420
		defaultScopeModel[87].setRotationPoint(-34.75F, -59F, -5F);

		defaultScopeModel[88].addShapeBox(0F, 0F, 0F, 14, 5, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F); // Box 421
		defaultScopeModel[88].setRotationPoint(-34.75F, -59F, -7F);

		defaultScopeModel[89].addShapeBox(0F, 0F, 0F, 14, 5, 7, 0F,0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		defaultScopeModel[89].setRotationPoint(-34.75F, -64F, -7F);

		defaultScopeModel[90].addShapeBox(0F, 0F, 0F, 14, 7, 5, 0F,0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		defaultScopeModel[90].setRotationPoint(-34.75F, -66F, -5F);

		defaultScopeModel[91].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F); // Box 731
		defaultScopeModel[91].setRotationPoint(-43.75F, -59F, 0F);

		defaultScopeModel[92].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F,0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 732
		defaultScopeModel[92].setRotationPoint(-43.75F, -64F, 0F);

		defaultScopeModel[93].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F); // Box 733
		defaultScopeModel[93].setRotationPoint(-43.75F, -66F, 0F);

		defaultScopeModel[94].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F,0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 734
		defaultScopeModel[94].setRotationPoint(-43.75F, -66F, -5F);

		defaultScopeModel[95].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F,0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 735
		defaultScopeModel[95].setRotationPoint(-43.75F, -64F, -7F);

		defaultScopeModel[96].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F); // Box 737
		defaultScopeModel[96].setRotationPoint(-43.75F, -59F, 0F);

		defaultScopeModel[97].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F); // Box 738
		defaultScopeModel[97].setRotationPoint(-43.75F, -59F, -7F);

		defaultScopeModel[98].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, -0.4F, -4.6F, 0F, -1.45F, -3.55F, 0F, -3.05F, -2.4F, 0F, -2.5F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Box 749
		defaultScopeModel[98].setRotationPoint(-39.75F, -64F, 0F);

		defaultScopeModel[99].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2.4F, -3.05F, 0F, -1.05F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -1.45F, 0F, -4.6F, -0.4F); // Box 750
		defaultScopeModel[99].setRotationPoint(-39.75F, -66F, 0F);

		defaultScopeModel[100].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -0.4F, -4.6F, 0F, -1.45F, -3.55F, 0F, -3.05F, -2.4F, 0F, -2.5F, -1.05F); // Box 751
		defaultScopeModel[100].setRotationPoint(-39.75F, -59F, 0F);

		defaultScopeModel[101].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -1.45F, 0F, -4.6F, -0.4F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2.4F, -3.05F, 0F, -1.05F, -2.5F); // Box 752
		defaultScopeModel[101].setRotationPoint(-39.75F, -59F, 0F);

		defaultScopeModel[102].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -4.6F, -0.4F, 0F, -3.55F, -1.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -2.5F, 0F, -2.4F, -3.05F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 753
		defaultScopeModel[102].setRotationPoint(-39.75F, -59F, -5F);

		defaultScopeModel[103].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, -2.5F, -1.05F, 0F, -3.05F, -2.4F, 0F, -1.45F, -3.55F, 0F, -0.4F, -4.6F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		defaultScopeModel[103].setRotationPoint(-39.75F, -64F, -7F);

		defaultScopeModel[104].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.05F, -2.5F, 0F, -2.4F, -3.05F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -4.6F, -0.4F, 0F, -3.55F, -1.45F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 755
		defaultScopeModel[104].setRotationPoint(-39.75F, -66F, -5F);

		defaultScopeModel[105].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.05F, 0F, -3.05F, -2.4F, 0F, -1.45F, -3.55F, 0F, -0.4F, -4.6F); // Box 756
		defaultScopeModel[105].setRotationPoint(-39.75F, -59F, -7F);

		defaultScopeModel[106].addShapeBox(0F, 0F, 0F, 14, 7, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.05F, -2.5F, 0F, -1.05F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.6F, -0.4F, 0F, -4.6F, -0.4F); // Box 757
		defaultScopeModel[106].setRotationPoint(-34.75F, -66F, 0F);

		defaultScopeModel[107].addShapeBox(0F, 0F, 0F, 14, 5, 7, 0F,0F, -0.4F, -4.6F, 0F, -0.4F, -4.6F, 0F, -2.5F, -1.05F, 0F, -2.5F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 758
		defaultScopeModel[107].setRotationPoint(-34.75F, -64F, 0F);

		defaultScopeModel[108].addShapeBox(0F, 0F, 0F, 5, 5, 7, 0F,0F, -0.4F, -4.6F, 0F, -1.45F, -3.55F, 0F, -3.05F, -2.4F, 0F, -2.5F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Box 759
		defaultScopeModel[108].setRotationPoint(-20.75F, -64F, 0F);

		defaultScopeModel[109].addShapeBox(0F, 0F, 0F, 5, 7, 5, 0F,0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2.4F, -3.05F, 0F, -1.05F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -1.45F, 0F, -4.6F, -0.4F); // Box 760
		defaultScopeModel[109].setRotationPoint(-20.75F, -66F, 0F);

		defaultScopeModel[110].addShapeBox(0F, 0F, 0F, 5, 7, 5, 0F,0F, -1.05F, -2.5F, 0F, -2.4F, -3.05F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -4.6F, -0.4F, 0F, -3.55F, -1.45F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 761
		defaultScopeModel[110].setRotationPoint(-20.75F, -66F, -5F);

		defaultScopeModel[111].addShapeBox(0F, 0F, 0F, 5, 5, 7, 0F,0F, -2.5F, -1.05F, 0F, -3.05F, -2.4F, 0F, -1.45F, -3.55F, 0F, -0.4F, -4.6F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		defaultScopeModel[111].setRotationPoint(-20.75F, -64F, -7F);

		defaultScopeModel[112].addShapeBox(0F, 0F, 0F, 5, 5, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.05F, 0F, -3.05F, -2.4F, 0F, -1.45F, -3.55F, 0F, -0.4F, -4.6F); // Box 763
		defaultScopeModel[112].setRotationPoint(-20.75F, -59F, -7F);

		defaultScopeModel[113].addShapeBox(0F, 0F, 0F, 5, 7, 5, 0F,0F, -4.6F, -0.4F, 0F, -3.55F, -1.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -2.5F, 0F, -2.4F, -3.05F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 764
		defaultScopeModel[113].setRotationPoint(-20.75F, -59F, -5F);

		defaultScopeModel[114].addShapeBox(0F, 0F, 0F, 5, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.55F, -1.45F, 0F, -4.6F, -0.4F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2.4F, -3.05F, 0F, -1.05F, -2.5F); // Box 765
		defaultScopeModel[114].setRotationPoint(-20.75F, -59F, 0F);

		defaultScopeModel[115].addShapeBox(0F, 0F, 0F, 5, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -0.4F, -4.6F, 0F, -1.45F, -3.55F, 0F, -3.05F, -2.4F, 0F, -2.5F, -1.05F); // Box 766
		defaultScopeModel[115].setRotationPoint(-20.75F, -59F, 0F);

		defaultScopeModel[116].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, -1.45F, -3.55F, 0F, -0.4F, -4.6F, 0F, -2.5F, -1.05F, 0F, -3.05F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 767
		defaultScopeModel[116].setRotationPoint(-36.75F, -64F, 0F);

		defaultScopeModel[117].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -1.05F, -2.5F, 0F, -2.4F, -3.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.6F, -0.4F, 0F, -3.55F, -1.45F); // Box 768
		defaultScopeModel[117].setRotationPoint(-36.75F, -66F, 0F);

		defaultScopeModel[118].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -2.4F, -3.05F, 0F, -1.05F, -2.5F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -3.55F, -1.45F, 0F, -4.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 769
		defaultScopeModel[118].setRotationPoint(-36.75F, -66F, -5F);

		defaultScopeModel[119].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, -3.05F, -2.4F, 0F, -2.5F, -1.05F, 0F, -0.4F, -4.6F, 0F, -1.45F, -3.55F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 770
		defaultScopeModel[119].setRotationPoint(-36.75F, -64F, -7F);

		defaultScopeModel[120].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.05F, -2.4F, 0F, -2.5F, -1.05F, 0F, -0.4F, -4.6F, 0F, -1.45F, -3.55F); // Box 771
		defaultScopeModel[120].setRotationPoint(-36.75F, -59F, -7F);

		defaultScopeModel[121].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -3.55F, -1.45F, 0F, -4.6F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, -3.05F, 0F, -1.05F, -2.5F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 772
		defaultScopeModel[121].setRotationPoint(-36.75F, -59F, -5F);

		defaultScopeModel[122].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.6F, -0.4F, 0F, -3.55F, -1.45F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -1.05F, -2.5F, 0F, -2.4F, -3.05F); // Box 773
		defaultScopeModel[122].setRotationPoint(-36.75F, -59F, 0F);

		defaultScopeModel[123].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -1.45F, -3.55F, 0F, -0.4F, -4.6F, 0F, -2.5F, -1.05F, 0F, -3.05F, -2.4F); // Box 774
		defaultScopeModel[123].setRotationPoint(-36.75F, -59F, 0F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 417, 297, textureX, textureY); // Import Box8
		ammoModel[1] = new ModelRendererTurbo(this, 889, 289, textureX, textureY); // Import Box8
		ammoModel[2] = new ModelRendererTurbo(this, 953, 289, textureX, textureY); // Import Box8
		ammoModel[3] = new ModelRendererTurbo(this, 985, 289, textureX, textureY); // Import Box8
		ammoModel[4] = new ModelRendererTurbo(this, 321, 297, textureX, textureY); // Import Box8
		ammoModel[5] = new ModelRendererTurbo(this, 345, 297, textureX, textureY); // Import Box8
		ammoModel[6] = new ModelRendererTurbo(this, 505, 297, textureX, textureY); // Import Box8
		ammoModel[7] = new ModelRendererTurbo(this, 585, 297, textureX, textureY); // Import Box8
		ammoModel[8] = new ModelRendererTurbo(this, 537, 297, textureX, textureY); // Import Box8
		ammoModel[9] = new ModelRendererTurbo(this, 633, 297, textureX, textureY); // Import Box8
		ammoModel[10] = new ModelRendererTurbo(this, 673, 297, textureX, textureY); // Import Box8
		ammoModel[11] = new ModelRendererTurbo(this, 713, 297, textureX, textureY); // Import Box8
		ammoModel[12] = new ModelRendererTurbo(this, 201, 305, textureX, textureY); // Import Box8
		ammoModel[13] = new ModelRendererTurbo(this, 281, 305, textureX, textureY); // Import Box8
		ammoModel[14] = new ModelRendererTurbo(this, 857, 305, textureX, textureY); // Import Box8
		ammoModel[15] = new ModelRendererTurbo(this, 897, 305, textureX, textureY); // Import Box8

		ammoModel[0].addShapeBox(0F, 0F, 0F, 35, 15, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F); // Import Box8
		ammoModel[0].setRotationPoint(-70.25F, -25.5F, -3.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		ammoModel[1].setRotationPoint(-71.25F, -9.25F, -4F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 4, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		ammoModel[2].setRotationPoint(-64.25F, -7.25F, -4F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0F, 1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		ammoModel[3].setRotationPoint(-60.25F, -2.25F, -4F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box8
		ammoModel[4].setRotationPoint(-49.25F, -2.25F, -4F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		ammoModel[5].setRotationPoint(-58.75F, -1.75F, -4F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 4, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		ammoModel[6].setRotationPoint(-48.25F, -7.25F, -4F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 14, 2, 7, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		ammoModel[7].setRotationPoint(-48.25F, -9.25F, -3F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 7, 11, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		ammoModel[8].setRotationPoint(-71.25F, -7.25F, -3.5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 10, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		ammoModel[9].setRotationPoint(-59.25F, -1.25F, -3.5F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 10, 11, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		ammoModel[10].setRotationPoint(-44.25F, -7.25F, -3.5F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 12, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		ammoModel[11].setRotationPoint(-60.25F, -9.25F, -3.5F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		ammoModel[12].setRotationPoint(-58.75F, -8.75F, -4F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 9, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		ammoModel[13].setRotationPoint(-58.75F, -6.75F, -4F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		ammoModel[14].setRotationPoint(-58.25F, -6.75F, -4.5F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		ammoModel[15].setRotationPoint(-58.25F, -4.75F, -4.5F);
	}

	private void initpumpModel_1()
	{
		pumpModel[0] = new ModelRendererTurbo(this, 753, 273, textureX, textureY); // Import Box1
		pumpModel[1] = new ModelRendererTurbo(this, 921, 273, textureX, textureY); // Import Box1
		pumpModel[2] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Import Box1
		pumpModel[3] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Import Box1
		pumpModel[4] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Import Box1
		pumpModel[5] = new ModelRendererTurbo(this, 833, 209, textureX, textureY); // Import Box1
		pumpModel[6] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Import Box1
		pumpModel[7] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Import Box1
		pumpModel[8] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Import Box1
		pumpModel[9] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Import Box1
		pumpModel[10] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Import Box1
		pumpModel[11] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Import Box1
		pumpModel[12] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Import Box1
		pumpModel[13] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Import Box1
		pumpModel[14] = new ModelRendererTurbo(this, 721, 57, textureX, textureY); // Import Box1
		pumpModel[15] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import Box1
		pumpModel[16] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Import Box1
		pumpModel[17] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Import Box1
		pumpModel[18] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import Box1
		pumpModel[19] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Import Box1
		pumpModel[20] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Import Box1
		pumpModel[21] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Import Box1
		pumpModel[22] = new ModelRendererTurbo(this, 521, 73, textureX, textureY); // Import Box1

		pumpModel[0].addShapeBox(0F, 0F, 0F, 25, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		pumpModel[0].setRotationPoint(-81.5F, -40F, -5.75F);

		pumpModel[1].addShapeBox(0F, 0F, 0F, 25, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		pumpModel[1].setRotationPoint(-81.5F, -37F, -5.75F);

		pumpModel[2].addShapeBox(0F, 0F, 0F, 25, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		pumpModel[2].setRotationPoint(-81.5F, -34F, -5.75F);

		pumpModel[3].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, -0.25F, -3.25F, 0F, -0.25F, -3.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box1
		pumpModel[3].setRotationPoint(-56.5F, -39.5F, -5.75F);

		pumpModel[4].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box1
		pumpModel[4].setRotationPoint(-56.5F, -37F, -5.75F);

		pumpModel[5].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -3.25F, 0F, -0.25F, -3.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box1
		pumpModel[5].setRotationPoint(-56.5F, -34.5F, -5.75F);

		pumpModel[6].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		pumpModel[6].setRotationPoint(-44.5F, -40F, -5.75F);

		pumpModel[7].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		pumpModel[7].setRotationPoint(-44.5F, -37F, -5.75F);

		pumpModel[8].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		pumpModel[8].setRotationPoint(-44.5F, -34F, -5.75F);

		pumpModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		pumpModel[9].setRotationPoint(-41.5F, -35.75F, -8.75F);

		pumpModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		pumpModel[10].setRotationPoint(-41.5F, -32.75F, -8.75F);

		pumpModel[11].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Import Box1
		pumpModel[11].setRotationPoint(-41.5F, -31.75F, -8.75F);

		pumpModel[12].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		pumpModel[12].setRotationPoint(-41.5F, -35.75F, -5.75F);

		pumpModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box1
		pumpModel[13].setRotationPoint(-41.5F, -32.75F, -5.75F);

		pumpModel[14].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		pumpModel[14].setRotationPoint(-42.5F, -37.68F, -9.75F);
		pumpModel[14].rotateAngleX = 0.57595865F;

		pumpModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		pumpModel[15].setRotationPoint(-42.5F, -36F, -8.65F);
		pumpModel[15].rotateAngleX = 0.57595865F;

		pumpModel[16].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box1
		pumpModel[16].setRotationPoint(-42.5F, -35.17F, -8.1F);
		pumpModel[16].rotateAngleX = 0.57595865F;

		pumpModel[17].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,-1F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		pumpModel[17].setRotationPoint(-42.5F, -34.95F, -13.91F);
		pumpModel[17].rotateAngleX = 0.57595865F;

		pumpModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		pumpModel[18].setRotationPoint(-42.48F, -33.28F, -12.83F);
		pumpModel[18].rotateAngleX = 0.57595865F;

		pumpModel[19].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box1
		pumpModel[19].setRotationPoint(-42.5F, -32.45F, -12.3F);
		pumpModel[19].rotateAngleX = 0.57595865F;

		pumpModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box1
		pumpModel[20].setRotationPoint(-42.5F, -30.55F, -17.03F);
		pumpModel[20].rotateAngleX = 0.57595865F;

		pumpModel[21].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box1
		pumpModel[21].setRotationPoint(-42.5F, -32.25F, -18.1F);
		pumpModel[21].rotateAngleX = 0.57595865F;

		pumpModel[22].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F); // Import Box1
		pumpModel[22].setRotationPoint(-42.5F, -29.72F, -16.48F);
		pumpModel[22].rotateAngleX = 0.57595865F;
	}

	private void initfullammoModel_1()
	{
		fullammoModel[0] = new ModelRendererTurbo(this, 713, 241, textureX, textureY); // Box 430
		fullammoModel[1] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Box 431
		fullammoModel[2] = new ModelRendererTurbo(this, 849, 321, textureX, textureY); // Box 436
		fullammoModel[3] = new ModelRendererTurbo(this, 737, 337, textureX, textureY); // Box 437
		fullammoModel[4] = new ModelRendererTurbo(this, 785, 337, textureX, textureY); // Box 440
		fullammoModel[5] = new ModelRendererTurbo(this, 545, 345, textureX, textureY); // Box 441
		fullammoModel[6] = new ModelRendererTurbo(this, 913, 377, textureX, textureY); // Box 446
		fullammoModel[7] = new ModelRendererTurbo(this, 969, 377, textureX, textureY); // Box 447
		fullammoModel[8] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 128
		fullammoModel[9] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 133
		fullammoModel[10] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Box 134
		fullammoModel[11] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Box 135
		fullammoModel[12] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 136
		fullammoModel[13] = new ModelRendererTurbo(this, 745, 129, textureX, textureY); // Box 137
		fullammoModel[14] = new ModelRendererTurbo(this, 985, 137, textureX, textureY); // Box 148
		fullammoModel[15] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 149

		fullammoModel[0].addShapeBox(-4F, -3F, 0F, 18, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, -1.05F, 0F, -0.7F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, -0.23F, 0F, -1.77F, -0.23F); // Box 430
		fullammoModel[0].setRotationPoint(-63F, -26F, 0F);

		fullammoModel[1].addShapeBox(-4F, -2F, 0F, 18, 2, 3, 0F,0F, -0.23F, -1.77F, 0F, -0.23F, -1.77F, 0F, -1.05F, -0.7F, 0F, -1.05F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 431
		fullammoModel[1].setRotationPoint(-63F, -26F, 0F);

		fullammoModel[2].addShapeBox(-4F, -2F, -3F, 18, 2, 3, 0F,0F, -1.05F, -0.7F, 0F, -1.05F, -0.7F, 0F, -0.23F, -1.77F, 0F, -0.23F, -1.77F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		fullammoModel[2].setRotationPoint(-63F, -26F, 0F);

		fullammoModel[3].addShapeBox(-4F, -3F, -2F, 18, 3, 2, 0F,0F, -0.7F, -1.05F, 0F, -0.7F, -1.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.77F, -0.23F, 0F, -1.77F, -0.23F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		fullammoModel[3].setRotationPoint(-63F, -26F, 0F);

		fullammoModel[4].addShapeBox(-5F, -2F, 0F, 23, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -1.23F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.42F, -0.58F); // Box 440
		fullammoModel[4].setRotationPoint(-63F, -26F, 0F);

		fullammoModel[5].addShapeBox(-5F, -2F, 0F, 23, 2, 2, 0F,0F, -0.58F, -1.42F, 0F, -0.58F, -1.42F, 0F, -1.23F, -0.15F, 0F, -1.23F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		fullammoModel[5].setRotationPoint(-63F, -26F, 0F);

		fullammoModel[6].addShapeBox(-5F, -2F, -2F, 23, 2, 2, 0F,0F, -0.15F, -1.23F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.42F, -0.58F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		fullammoModel[6].setRotationPoint(-63F, -26F, 0F);

		fullammoModel[7].addShapeBox(-5F, -2F, -2F, 23, 2, 2, 0F,0F, -1.23F, -0.15F, 0F, -1.23F, -0.15F, 0F, -0.58F, -1.42F, 0F, -0.58F, -1.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		fullammoModel[7].setRotationPoint(-63F, -26F, 0F);

		fullammoModel[8].addShapeBox(-6F, -2F, 0F, 1, 2, 3, 0F,0F, -0.23F, -1.77F, 0F, -0.23F, -1.77F, 0F, -1.05F, -0.7F, 0F, -1.05F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		fullammoModel[8].setRotationPoint(-63F, -26F, 0F);

		fullammoModel[9].addShapeBox(-6F, -2F, -3F, 1, 2, 3, 0F,0F, -1.05F, -0.7F, 0F, -1.05F, -0.7F, 0F, -0.23F, -1.77F, 0F, -0.23F, -1.77F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		fullammoModel[9].setRotationPoint(-63F, -26F, 0F);

		fullammoModel[10].addShapeBox(-6F, -3F, -2F, 1, 3, 2, 0F,0F, -0.7F, -1.05F, 0F, -0.7F, -1.05F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.77F, -0.23F, 0F, -1.77F, -0.23F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		fullammoModel[10].setRotationPoint(-63F, -26F, 0F);

		fullammoModel[11].addShapeBox(-6F, -3F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, -1.05F, 0F, -0.7F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.77F, -0.23F, 0F, -1.77F, -0.23F); // Box 135
		fullammoModel[11].setRotationPoint(-63F, -26F, 0F);

		fullammoModel[12].addShapeBox(5F, -2F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.575F, -1.405F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.095F, -0.905F, 0F, -1.42F, -0.58F); // Box 136
		fullammoModel[12].setRotationPoint(-50F, -26F, 0F);

		fullammoModel[13].addShapeBox(5F, -2F, 0F, 9, 2, 2, 0F,0F, -0.58F, -1.42F, 0F, -0.905F, -1.095F, 0F, -1.405F, -0.575F, 0F, -1.23F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 137
		fullammoModel[13].setRotationPoint(-50F, -26F, 0F);

		fullammoModel[14].addShapeBox(5F, -2F, -2F, 9, 2, 2, 0F,0F, -1.23F, -0.15F, 0F, -1.405F, -0.575F, 0F, -0.905F, -1.095F, 0F, -0.58F, -1.42F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		fullammoModel[14].setRotationPoint(-50F, -26F, 0F);

		fullammoModel[15].addShapeBox(5F, -2F, -2F, 9, 2, 2, 0F,0F, -0.15F, -1.23F, 0F, -0.575F, -1.405F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.095F, -0.905F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		fullammoModel[15].setRotationPoint(-50F, -26F, 0F);
	}
}