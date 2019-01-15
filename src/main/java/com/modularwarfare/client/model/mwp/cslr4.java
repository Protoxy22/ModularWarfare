//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: cslr4
// Model Creator: 
// Created on: 08.10.2018 - 16:38:23
// Last changed on: 08.10.2018 - 16:38:23

package com.modularwarfare.client.model.mwp; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

//import com.flansmod.client.model.EnumAnimationType;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class cslr4 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public cslr4() //Same as Filename
	{
		modelScale = 0.11F;
		gunModel = new ModelRendererTurbo[271];
		defaultScopeModel = new ModelRendererTurbo[67];
		ammoModel = new ModelRendererTurbo[20];
		pumpModel = new ModelRendererTurbo[11];

		initgunModel_1();
		initdefaultScopeModel_1();
		initammoModel_1();
		initpumpModel_1();

		scopeAttachPoint = new Vector3f(15 /16F, 48F /16F, 0F /16F);

		translateAll(0F, -10F, -.35F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.05F, 0F);//forward/up/? 

		gunSlideDistance = 0F;
		//animationType = EnumAnimationType.CUSTOM;

		rotateGunVertical = 05F;
		rotateGunHorizontal = 21F;
		tiltGun = -05F;
		tiltGunTime = 0.20F;
		unloadClipTime = 0.30F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.15F;
		translateGun = new Vector3f(3 /16F, -1F /16F, -2F /16F);
		rotateClipVertical = -90F;
		rotateClipHorizontal = -1F;
		tiltClip = -08F;
		translateClip = new Vector3f(-0 /16F, -20F /16F, 1F /16F);

		hasFlash = false;
        hasArms = true;
        
        leftArmPos = new Vector3f(0.08F, -0.28F, 0.11F);
        leftArmRot = new Vector3f(60.0F, 45.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.23F, -0.48F, 0.11F);
        leftArmReloadRot = new Vector3f(60.0F, 65.0F, 0.0F);
 
        rightArmPos = new Vector3f(0.23F, -0.5F, 0.02F);
        rightArmRot = new Vector3f(-30.0F, 0.0F, -80.0F);
        rightArmReloadPos = new Vector3f(0.23F, -0.65F, -0.07F);
        rightArmReloadRot = new Vector3f(-30.0F, 0.0F, -80.0F);
        rightArmChargePos = new Vector3f(0.11F, -0.58F, 0.12F);
        rightArmChargeRot = new Vector3f(-0.0F, 0.0F, -70.0F);
        
        rightArmScale = new Vector3f(0.7F, 0.8F, 0.7F);
        leftArmScale = new Vector3f(0.7F, 1.0F, 0.7F);
 
        rightHandAmmo = false;
        leftHandAmmo = true;
        
		//RecoilSlideDistance = 0.16F;
		//RotateSlideDistance = -1F;

		pumpDelayAfterReload = 65;
		pumpDelay = 10;
		pumpTime = 20;
		gripIsOnPump = false;
		pumpHandleDistance = 0.50F;
		
		rightHandBolt = true;
	    chargeModifier = new Vector3f (16.0F, 8.0F, 4.0F);
		
		crouchZoom = -0.25F;
		fancyStance = true;
		sprintRotate = new Vector3f(40.0F, 0.0F, -0.0F);
		sprintTranslate = new Vector3f(0.4F, 0.0F, 0.0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import Box0
		gunModel[34] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box0
		gunModel[35] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Import Box0
		gunModel[36] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import Box0
		gunModel[37] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Import Box0
		gunModel[38] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Import Box0
		gunModel[39] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import Box0
		gunModel[40] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Import Box0
		gunModel[41] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Import Box0
		gunModel[42] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Import Box0
		gunModel[43] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Import Box0
		gunModel[44] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box0
		gunModel[45] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import Box0
		gunModel[46] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import Box0
		gunModel[47] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Import Box0
		gunModel[48] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import Box0
		gunModel[49] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Import Box0
		gunModel[50] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box0
		gunModel[51] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Import Box0
		gunModel[52] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Import Box0
		gunModel[53] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Import Box0
		gunModel[54] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Import Box0
		gunModel[55] = new ModelRendererTurbo(this, 769, 25, textureX, textureY); // Import Box0
		gunModel[56] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Import Box0
		gunModel[57] = new ModelRendererTurbo(this, 881, 41, textureX, textureY); // Import Box0
		gunModel[58] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Import Box0
		gunModel[59] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Import Box0
		gunModel[60] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Import Box0
		gunModel[61] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Import Box0
		gunModel[62] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Import Box0
		gunModel[63] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Import Box0
		gunModel[64] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Import Box0
		gunModel[65] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box0
		gunModel[66] = new ModelRendererTurbo(this, 721, 57, textureX, textureY); // Import Box0
		gunModel[67] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Import Box0
		gunModel[68] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Import Box0
		gunModel[69] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Import Box0
		gunModel[70] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Import Box0
		gunModel[71] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Import Box0
		gunModel[72] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Import Box0
		gunModel[73] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box0
		gunModel[74] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import Box0
		gunModel[75] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import Box0
		gunModel[76] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		gunModel[77] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[78] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		gunModel[79] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Import Box0
		gunModel[80] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Import Box0
		gunModel[81] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Import Box0
		gunModel[82] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		gunModel[83] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import Box0
		gunModel[84] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Import Box0
		gunModel[85] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Import Box0
		gunModel[86] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box0
		gunModel[87] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Import Box0
		gunModel[88] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Import Box0
		gunModel[89] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // Import Box0
		gunModel[90] = new ModelRendererTurbo(this, 753, 73, textureX, textureY); // Import Box0
		gunModel[91] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Import Box0
		gunModel[92] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Import Box0
		gunModel[93] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Import Box0
		gunModel[94] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Import Box0
		gunModel[95] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Import Box0
		gunModel[96] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Import Box0
		gunModel[97] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box0
		gunModel[98] = new ModelRendererTurbo(this, 889, 73, textureX, textureY); // Import Box0
		gunModel[99] = new ModelRendererTurbo(this, 697, 81, textureX, textureY); // Import Box0
		gunModel[100] = new ModelRendererTurbo(this, 737, 81, textureX, textureY); // Import Box0
		gunModel[101] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Import Box0
		gunModel[102] = new ModelRendererTurbo(this, 769, 81, textureX, textureY); // Import Box0
		gunModel[103] = new ModelRendererTurbo(this, 809, 81, textureX, textureY); // Import Box0
		gunModel[104] = new ModelRendererTurbo(this, 913, 81, textureX, textureY); // Import Box0
		gunModel[105] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Import Box0
		gunModel[106] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Import Box0
		gunModel[107] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Import Box0
		gunModel[108] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Import Box0
		gunModel[109] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Import Box0
		gunModel[110] = new ModelRendererTurbo(this, 841, 89, textureX, textureY); // Import Box0
		gunModel[111] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Import Box0
		gunModel[112] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Import Box0
		gunModel[113] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Import Box0
		gunModel[114] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Import Box0
		gunModel[115] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Import Box0
		gunModel[116] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Import Box0
		gunModel[117] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Import Box0
		gunModel[118] = new ModelRendererTurbo(this, 665, 97, textureX, textureY); // Import Box0
		gunModel[119] = new ModelRendererTurbo(this, 865, 97, textureX, textureY); // Import Box0
		gunModel[120] = new ModelRendererTurbo(this, 937, 97, textureX, textureY); // Import Box0
		gunModel[121] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Import Box0
		gunModel[122] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Import Box0
		gunModel[123] = new ModelRendererTurbo(this, 569, 105, textureX, textureY); // Import Box0
		gunModel[124] = new ModelRendererTurbo(this, 993, 97, textureX, textureY); // Import Box0
		gunModel[125] = new ModelRendererTurbo(this, 617, 105, textureX, textureY); // Import Box0
		gunModel[126] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Import Box0
		gunModel[127] = new ModelRendererTurbo(this, 721, 105, textureX, textureY); // Import Box0
		gunModel[128] = new ModelRendererTurbo(this, 729, 25, textureX, textureY); // Import Box0
		gunModel[129] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Import Box0
		gunModel[130] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		gunModel[131] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Import Box0
		gunModel[132] = new ModelRendererTurbo(this, 785, 105, textureX, textureY); // Import Box0
		gunModel[133] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Import Box0
		gunModel[134] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Import Box0
		gunModel[135] = new ModelRendererTurbo(this, 961, 105, textureX, textureY); // Import Box0
		gunModel[136] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box0
		gunModel[137] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		gunModel[138] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box0
		gunModel[139] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[140] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		gunModel[141] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box0
		gunModel[142] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box0
		gunModel[143] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box0
		gunModel[144] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Import Box0
		gunModel[145] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Import Box0
		gunModel[146] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Import Box0
		gunModel[147] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Import Box0
		gunModel[148] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Import Box0
		gunModel[149] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Import Box0
		gunModel[150] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Import Box0
		gunModel[151] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Import Box0
		gunModel[152] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Import Box0
		gunModel[153] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Import Box0
		gunModel[154] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Import Box0
		gunModel[155] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Import Box0
		gunModel[156] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Import Box0
		gunModel[157] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Import Box0
		gunModel[158] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Import Box0
		gunModel[159] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // Import Box0
		gunModel[160] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Import Box0
		gunModel[161] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box0
		gunModel[162] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Import Box0
		gunModel[163] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		gunModel[164] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Import Box0
		gunModel[165] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Import Box0
		gunModel[166] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Import Box0
		gunModel[167] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Import Box0
		gunModel[168] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Import Box0
		gunModel[169] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Import Box0
		gunModel[170] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Import Box0
		gunModel[171] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Import Box0
		gunModel[172] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import Box0
		gunModel[173] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Import Box0
		gunModel[174] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Import Box0
		gunModel[175] = new ModelRendererTurbo(this, 553, 121, textureX, textureY); // Import Box0
		gunModel[176] = new ModelRendererTurbo(this, 577, 121, textureX, textureY); // Import Box0
		gunModel[177] = new ModelRendererTurbo(this, 601, 121, textureX, textureY); // Import Box0
		gunModel[178] = new ModelRendererTurbo(this, 633, 121, textureX, textureY); // Import Box0
		gunModel[179] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Import Box0
		gunModel[180] = new ModelRendererTurbo(this, 713, 121, textureX, textureY); // Import Box0
		gunModel[181] = new ModelRendererTurbo(this, 737, 121, textureX, textureY); // Import Box0
		gunModel[182] = new ModelRendererTurbo(this, 945, 121, textureX, textureY); // Import Box0
		gunModel[183] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Import Box0
		gunModel[184] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box0
		gunModel[185] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Import Box0
		gunModel[186] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import Box0
		gunModel[187] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Import Box0
		gunModel[188] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Import Box0
		gunModel[189] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Import Box0
		gunModel[190] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Import Box0
		gunModel[191] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Import Box0
		gunModel[192] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Import Box0
		gunModel[193] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Import Box0
		gunModel[194] = new ModelRendererTurbo(this, 649, 129, textureX, textureY); // Import Box0
		gunModel[195] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Import Box0
		gunModel[196] = new ModelRendererTurbo(this, 753, 129, textureX, textureY); // Import Box0
		gunModel[197] = new ModelRendererTurbo(this, 809, 129, textureX, textureY); // Import Box0
		gunModel[198] = new ModelRendererTurbo(this, 841, 129, textureX, textureY); // Import Box0
		gunModel[199] = new ModelRendererTurbo(this, 889, 129, textureX, textureY); // Import Box0
		gunModel[200] = new ModelRendererTurbo(this, 921, 129, textureX, textureY); // Import Box0
		gunModel[201] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box0
		gunModel[202] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Import Box0
		gunModel[203] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); // Import Box0
		gunModel[204] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Import Box0
		gunModel[205] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Import Box0
		gunModel[206] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Import Box0
		gunModel[207] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Import Box0
		gunModel[208] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Import Box0
		gunModel[209] = new ModelRendererTurbo(this, 513, 137, textureX, textureY); // Import Box0
		gunModel[210] = new ModelRendererTurbo(this, 785, 57, textureX, textureY); // Import Box0
		gunModel[211] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Import Box0
		gunModel[212] = new ModelRendererTurbo(this, 577, 137, textureX, textureY); // Import Box0
		gunModel[213] = new ModelRendererTurbo(this, 609, 137, textureX, textureY); // Import Box0
		gunModel[214] = new ModelRendererTurbo(this, 689, 137, textureX, textureY); // Import Box0
		gunModel[215] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Import Box0
		gunModel[216] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Import Box0
		gunModel[217] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import Box0
		gunModel[218] = new ModelRendererTurbo(this, 729, 137, textureX, textureY); // Import Box0
		gunModel[219] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Import Box0
		gunModel[220] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Import Box0
		gunModel[221] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Import Box0
		gunModel[222] = new ModelRendererTurbo(this, 641, 145, textureX, textureY); // Import Box0
		gunModel[223] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Import Box0
		gunModel[224] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Import Box0
		gunModel[225] = new ModelRendererTurbo(this, 873, 145, textureX, textureY); // Import Box0
		gunModel[226] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Import Box0
		gunModel[227] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import Box0
		gunModel[228] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Import Box0
		gunModel[229] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Import Box0
		gunModel[230] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Import Box0
		gunModel[231] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import Box0
		gunModel[232] = new ModelRendererTurbo(this, 913, 145, textureX, textureY); // Import Box0
		gunModel[233] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Import Box0
		gunModel[234] = new ModelRendererTurbo(this, 657, 153, textureX, textureY); // Import Box0
		gunModel[235] = new ModelRendererTurbo(this, 561, 161, textureX, textureY); // Import Box0
		gunModel[236] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Import Box0
		gunModel[237] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Import Box0
		gunModel[238] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Import Box0
		gunModel[239] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Import Box0
		gunModel[240] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		gunModel[241] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Import Box0
		gunModel[242] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Import Box0
		gunModel[243] = new ModelRendererTurbo(this, 513, 153, textureX, textureY); // Import Box0
		gunModel[244] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box0
		gunModel[245] = new ModelRendererTurbo(this, 777, 153, textureX, textureY); // Import Box0
		gunModel[246] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import Box0
		gunModel[247] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import Box0
		gunModel[248] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Import Box0
		gunModel[249] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		gunModel[250] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import Box0
		gunModel[251] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import Box0
		gunModel[252] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Import Box0
		gunModel[253] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box0
		gunModel[254] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Box0
		gunModel[255] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import Box0
		gunModel[256] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import Box0
		gunModel[257] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box0
		gunModel[258] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		gunModel[259] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Import Box0
		gunModel[260] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Import Box0
		gunModel[261] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box0
		gunModel[262] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box0
		gunModel[263] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Box0
		gunModel[264] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Import Box0
		gunModel[265] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Import Box0
		gunModel[266] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Import Box0
		gunModel[267] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import Box0
		gunModel[268] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Import Box0
		gunModel[269] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import Box0
		gunModel[270] = new ModelRendererTurbo(this, 897, 153, textureX, textureY); // Import Box0

		gunModel[0].addShapeBox(0F, 0F, 0F, 48, 4, 12, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[0].setRotationPoint(18.5F, -30F, -5.75F);

		gunModel[1].addBox(0F, 0F, 0F, 2, 11, 12, 0F); // Import Box0
		gunModel[1].setRotationPoint(26F, -26F, -5.75F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[2].setRotationPoint(28F, -26F, -5.75F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[3].setRotationPoint(30F, -26F, -5.75F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 9, 2, 12, 0F,3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Import Box0
		gunModel[4].setRotationPoint(17F, -26F, -5.75F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-1.99F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.99F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[5].setRotationPoint(24F, -19F, -5.75F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0.5F, 0F, -1.99F, 0.5F, 0F, -1.99F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[6].setRotationPoint(21F, -19F, -5.75F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F,1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[7].setRotationPoint(18F, -24F, -5.75F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F); // Import Box0
		gunModel[8].setRotationPoint(24F, -23F, -5.75F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[9].setRotationPoint(21F, -23F, -5.75F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box0
		gunModel[10].setRotationPoint(20F, -18F, -5.75F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Import Box0
		gunModel[11].setRotationPoint(23F, -17F, -5.75F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box0
		gunModel[12].setRotationPoint(37F, -26F, -5.75F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[13].setRotationPoint(35F, -26F, -5.75F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 7, 12, 0F,-2F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Import Box0
		gunModel[14].setRotationPoint(37F, -22F, -5.75F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[15].setRotationPoint(39F, -26F, -5.75F);

		gunModel[16].addBox(0F, 0F, 0F, 10, 4, 3, 0F); // Import Box0
		gunModel[16].setRotationPoint(-12.5F, -30F, -5.75F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // Import Box0
		gunModel[17].setRotationPoint(35F, -15F, -5.75F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 14, 1, 12, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[18].setRotationPoint(25.5F, -14F, -5.75F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import Box0
		gunModel[19].setRotationPoint(26F, -15F, -5.75F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 5, 12, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[20].setRotationPoint(18F, -23F, -5.75F);

		gunModel[21].addBox(0F, 0F, 0F, 8, 1, 12, 0F); // Import Box0
		gunModel[21].setRotationPoint(10.5F, -27F, -5.75F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[22].setRotationPoint(15.5F, -29F, -5.75F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[23].setRotationPoint(10.5F, -29F, -5.75F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[24].setRotationPoint(10.5F, -30F, -5.75F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[25].setRotationPoint(17.5F, -30F, -5.75F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 4, 8, 12, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[26].setRotationPoint(-12.5F, -26F, -5.75F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[27].setRotationPoint(-8F, -21F, -5.75F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[28].setRotationPoint(-8F, -26F, -5.75F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 16, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[29].setRotationPoint(-8F, -19F, -5.75F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[30].setRotationPoint(8F, -19F, -5.75F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[31].setRotationPoint(10F, -19F, -5.75F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[32].setRotationPoint(14F, -12F, -5.75F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F); // Import Box0
		gunModel[33].setRotationPoint(12F, -12F, -5.75F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[34].setRotationPoint(23F, -12F, -5.75F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[35].setRotationPoint(25F, -13F, -5.75F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[36].setRotationPoint(25.5F, -13.5F, -5.75F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 28, 7, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[37].setRotationPoint(-40.5F, -25F, -5.75F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 13, 8, 12, 0F,0F, -7F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, 4F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 4F, -1F); // Import Box0
		gunModel[38].setRotationPoint(45F, -20F, -5.75F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 3, 5, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[39].setRotationPoint(42F, -13F, -5.75F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, -1F); // Import Box0
		gunModel[40].setRotationPoint(39F, -12F, -5.75F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,-0.25F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[41].setRotationPoint(39F, -14F, -5.75F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F,0F, -1F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, -1F, 0F, 0F, -2.5F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, -2.5F, -1F); // Import Box0
		gunModel[42].setRotationPoint(35F, -14F, -5.75F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[43].setRotationPoint(35F, -14F, -5.75F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 7, 8, 12, 0F,0F, -7F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -7F, 0F, 0F, 4F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 4F, -1F); // Import Box0
		gunModel[44].setRotationPoint(58F, -25F, -5.75F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, -6.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -6.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F); // Import Box0
		gunModel[45].setRotationPoint(65F, -27F, -5.75F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 11, 12, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F); // Import Box0
		gunModel[46].setRotationPoint(67F, -34F, -5.75F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[47].setRotationPoint(65F, -26F, -5.75F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 180, 2, 7, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Import Box0
		gunModel[48].setRotationPoint(63.5F, -32.5F, -3.25F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 180, 2, 7, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F); // Import Box0
		gunModel[49].setRotationPoint(63.5F, -30F, -3.25F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 180, 2, 7, 0F,0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, -2.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Import Box0
		gunModel[50].setRotationPoint(63.5F, -35F, -3.25F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 3, 7, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[51].setRotationPoint(65F, -21F, -5.75F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, -1F, 0.5F, 0F, -1F); // Import Box0
		gunModel[52].setRotationPoint(26F, -13.5F, -5.75F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 5, 2, 12, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Import Box0
		gunModel[53].setRotationPoint(28F, -13.5F, -5.75F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[54].setRotationPoint(33F, -14F, -5.75F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Import Box0
		gunModel[55].setRotationPoint(33F, -13.5F, -5.75F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 12, 12, 11, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[56].setRotationPoint(27F, -26F, -5.25F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 9, 14, 11, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[57].setRotationPoint(42F, -26F, -5.25F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 3, 14, 11, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[58].setRotationPoint(39F, -26F, -5.25F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 16, 11, 11, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -6F, -0.25F, 0F, -6F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[59].setRotationPoint(51F, -26F, -5.25F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 11, 14, 11, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[60].setRotationPoint(14F, -26F, -5.25F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 5, 14, 11, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -6.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -6.5F, -0.25F); // Import Box0
		gunModel[61].setRotationPoint(9F, -26F, -5.25F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 17, 7, 11, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[62].setRotationPoint(-8F, -26F, -5.25F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 65, 2, 2, 0F,1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0F, 4F, 0F, 0F); // Import Box0
		gunModel[63].setRotationPoint(-8.5F, -32F, 3.25F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[64].setRotationPoint(10.5F, -30F, -4.75F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.25F, 4F, 0F, 0.25F); // Import Box0
		gunModel[65].setRotationPoint(-8.5F, -32F, -4.75F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 13, 11, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[66].setRotationPoint(25F, -26F, -5.25F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, -1.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0.5F, -1F); // Import Box0
		gunModel[67].setRotationPoint(25F, -13.5F, -5.75F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, -1F); // Import Box0
		gunModel[68].setRotationPoint(23F, -11F, -5.75F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 9, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[69].setRotationPoint(14F, -11F, -5.75F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[70].setRotationPoint(12F, -11F, -5.75F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 2, 6, 12, 0F,0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F); // Import Box0
		gunModel[71].setRotationPoint(10F, -14F, -5.75F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 2, 6, 12, 0F,0F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -6F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -6F, -1F); // Import Box0
		gunModel[72].setRotationPoint(8F, -15F, -5.75F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 15, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[73].setRotationPoint(-7F, -18F, -5.75F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 4, 3, 10, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Import Box0
		gunModel[74].setRotationPoint(57.75F, -33F, -4.75F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 4, 3, 10, 0F,0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, -3.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Import Box0
		gunModel[75].setRotationPoint(57.75F, -36.5F, -4.75F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0.75F, 1.75F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0F, 0.75F, 1.75F, 0F, 0.75F, 1.75F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0F, 0.75F, 1.75F); // Import Box0
		gunModel[76].setRotationPoint(62F, -32.5F, -3.25F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-0.5F, -0.25F, 1.75F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.5F, -0.25F, 1.75F, -0.5F, 1.75F, -1.75F, -0.25F, 0.25F, -2.25F, -0.25F, 0.25F, -2.25F, -0.5F, 1.75F, -1.75F); // Import Box0
		gunModel[77].setRotationPoint(61.5F, -30F, -3.25F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-0.5F, 1.75F, -1.75F, -0.25F, 0.25F, -2.25F, -0.25F, 0.25F, -2.25F, -0.5F, 1.75F, -1.75F, -0.5F, -0.25F, 1.75F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.5F, -0.25F, 1.75F); // Import Box0
		gunModel[78].setRotationPoint(61.5F, -35F, -3.25F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 55, 3, 3, 0F,0F, 0.5F, -2F, 1F, 0.5F, -2F, 1F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[79].setRotationPoint(1.5F, -35F, -4.75F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 61, 3, 3, 0F,0F, 0.5F, -0.5F, 1F, 0.5F, -0.5F, 1F, 0.5F, -2F, 0F, 0.5F, -2F, 5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 5F, 0F, 0F); // Import Box0
		gunModel[80].setRotationPoint(-4.5F, -35F, 2.25F);

		gunModel[81].addBox(0F, 0F, 0F, 23, 4, 3, 0F); // Import Box0
		gunModel[81].setRotationPoint(-12.5F, -30F, 3.25F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,-2.5F, 0F, -1.15F, 1F, 0F, -1.15F, 1F, 0F, -0.5F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[82].setRotationPoint(-9.5F, -34F, -4.75F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 56, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[83].setRotationPoint(1.5F, -32F, -4.75F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 55, 1, 5, 0F,0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[84].setRotationPoint(1.5F, -35F, -2.25F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 54, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[85].setRotationPoint(3.5F, -37.5F, -2.25F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 54, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Import Box0
		gunModel[86].setRotationPoint(3.5F, -39F, -2.25F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 54, 1, 5, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[87].setRotationPoint(3.5F, -38.5F, -2.25F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 54, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[88].setRotationPoint(3.5F, -39F, -3.25F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 36, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[89].setRotationPoint(109.5F, -36.5F, -2.25F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Import Box0
		gunModel[90].setRotationPoint(109.5F, -38F, -2.25F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 36, 1, 5, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[91].setRotationPoint(109.5F, -37.5F, -2.25F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 36, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[92].setRotationPoint(109.5F, -38F, -3.25F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -3.75F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, -3.75F, -1F); // Import Box0
		gunModel[93].setRotationPoint(68F, -18.5F, -5.75F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import Box0
		gunModel[94].setRotationPoint(70F, -34F, -5.75F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 2, 7, 12, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Import Box0
		gunModel[95].setRotationPoint(68F, -34F, -5.75F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 67, 8, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 3F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 3F, 2F); // Import Box0
		gunModel[96].setRotationPoint(79F, -31F, -5.75F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 61, 4, 12, 0F,0F, -1F, 2F, 0F, 1.85F, 2F, 0F, 1.85F, 2F, 0F, -1F, 2F, 0F, 1F, -1F, 0F, -1.85F, -1F, 0F, -1.85F, -1F, 0F, 1F, -1F); // Import Box0
		gunModel[97].setRotationPoint(79F, -21F, -5.75F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, -0.15F, 2F, 0F, -0.1F, 2F, 0F, -0.1F, 2F, 0F, -0.15F, 2F, 0F, 0.15F, -1F, 0F, -1.1F, -1F, 0F, -1.1F, -1F, 0F, 0.15F, -1F); // Import Box0
		gunModel[98].setRotationPoint(140F, -23F, -5.75F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, -0.1F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.1F, 2F, 0F, -1.1F, -1F, 0F, -3.1F, -1F, 0F, -3.1F, -1F, 0F, -1.1F, -1F); // Import Box0
		gunModel[99].setRotationPoint(143F, -23F, -5.75F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F,0F, 0F, 2F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 2F, 0F, -3.1F, -1F, -2F, -3.1F, -1F, -2F, -3.1F, -1F, 0F, -3.1F, -1F); // Import Box0
		gunModel[100].setRotationPoint(146F, -23F, -5.75F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F,0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F); // Import Box0
		gunModel[101].setRotationPoint(146F, -31F, -5.75F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 4, 11, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, 2F); // Import Box0
		gunModel[102].setRotationPoint(75F, -31F, -5.75F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 2, 12, 12, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0.3F, 1.15F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0.3F, 1.15F); // Import Box0
		gunModel[103].setRotationPoint(73F, -31F, -5.75F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 3, 11, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0.3F, 1.15F, 0F, 0.3F, 1.15F, 0F, 1.5F, 0F); // Import Box0
		gunModel[104].setRotationPoint(70F, -30F, -5.75F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[105].setRotationPoint(68F, -28F, -5.75F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, -0.5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 2F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -1F); // Import Box0
		gunModel[106].setRotationPoint(75F, -20F, -5.75F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F); // Import Box0
		gunModel[107].setRotationPoint(70F, -19.5F, -5.75F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[108].setRotationPoint(-40.5F, -18F, -5.75F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Import Box0
		gunModel[109].setRotationPoint(-44.5F, -18F, -5.75F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 4, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[110].setRotationPoint(-48.5F, -18F, -5.75F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Import Box0
		gunModel[111].setRotationPoint(-10F, -6F, -5.75F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 3, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box0
		gunModel[112].setRotationPoint(-13F, -13F, -5.75F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box0
		gunModel[113].setRotationPoint(-13F, -8F, -5.75F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box0
		gunModel[114].setRotationPoint(-13F, -16F, -5.75F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -2F); // Import Box0
		gunModel[115].setRotationPoint(-10F, -18F, -5.75F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, -1F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[116].setRotationPoint(5F, -6F, -5.75F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 3, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[117].setRotationPoint(-16F, -13F, -5.75F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[118].setRotationPoint(-16F, -8F, -5.75F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[119].setRotationPoint(-16F, -18F, -5.75F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[120].setRotationPoint(-16F, -16F, -5.75F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[121].setRotationPoint(-16F, -5F, -5.75F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 21, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[122].setRotationPoint(-16F, -4F, -5.75F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 9, 2, 12, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[123].setRotationPoint(-4F, -6F, -5.75F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[124].setRotationPoint(-7F, -6F, -5.75F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[125].setRotationPoint(5F, -5F, -5.75F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[126].setRotationPoint(8F, -6.5F, -5.75F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, -1F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[127].setRotationPoint(8F, -7.5F, -5.75F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Import Box0
		gunModel[128].setRotationPoint(11F, -8.5F, -5.75F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Import Box0
		gunModel[129].setRotationPoint(11F, -7.5F, -5.75F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[130].setRotationPoint(12F, -8.5F, -4.75F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box0
		gunModel[131].setRotationPoint(-19F, -7F, -5.75F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 3, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[132].setRotationPoint(-22F, -18F, -5.75F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[133].setRotationPoint(-23F, -18F, -5.75F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[134].setRotationPoint(-25F, -18F, -5.75F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[135].setRotationPoint(-27F, -18F, -5.75F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[136].setRotationPoint(-29F, -18F, -5.75F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[137].setRotationPoint(-2F, -15F, -1.75F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[138].setRotationPoint(-2F, -14F, -1.75F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[139].setRotationPoint(-2F, -13F, -1.75F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[140].setRotationPoint(-2.5F, -9F, -1.75F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[141].setRotationPoint(-2.5F, -11F, -1.75F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[142].setRotationPoint(-2.5F, -12F, -1.75F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -1.5F, 0F, 0F); // Import Box0
		gunModel[143].setRotationPoint(-2F, -8F, -1.75F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 3, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[144].setRotationPoint(-19F, -18F, -5.75F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, -1F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F); // Import Box0
		gunModel[145].setRotationPoint(-22F, -6F, -5.75F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, -0.75F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F); // Import Box0
		gunModel[146].setRotationPoint(-26F, -5F, -5.75F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 4, 17, 10, 0F,-1F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, -2F, -7F, 0F, -2F, 7F, 0F, 0F); // Import Box0
		gunModel[147].setRotationPoint(-17F, -3F, -4.75F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[148].setRotationPoint(-24F, 14F, -4.75F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[149].setRotationPoint(-32F, 14F, -4.75F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 11, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[150].setRotationPoint(-37F, 10F, -4.75F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 4, 17, 10, 0F,5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 5F, 0F, 0F); // Import Box0
		gunModel[151].setRotationPoint(-21F, -3F, -4.75F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 15, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import Box0
		gunModel[152].setRotationPoint(-41F, 6F, -4.75F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 19, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import Box0
		gunModel[153].setRotationPoint(-45F, 3F, -4.75F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[154].setRotationPoint(-45F, 2F, -4.75F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[155].setRotationPoint(-28F, -3F, -4.75F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[156].setRotationPoint(-45F, -2F, -4.75F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Import Box0
		gunModel[157].setRotationPoint(-28F, 1F, -4.75F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[158].setRotationPoint(-46F, -6F, -4.75F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F,1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[159].setRotationPoint(-48F, -8F, -4.75F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F,4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[160].setRotationPoint(-49F, -10F, -4.75F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[161].setRotationPoint(-51.5F, -11F, -4.75F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 4, 3, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[162].setRotationPoint(-48.5F, -13F, -4.75F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[163].setRotationPoint(-44.5F, -14F, -4.75F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 6, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[164].setRotationPoint(-22F, -12F, -4.75F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box0
		gunModel[165].setRotationPoint(-24F, -12F, -4.75F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -2F); // Import Box0
		gunModel[166].setRotationPoint(-24F, -9F, -4.75F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,2F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box0
		gunModel[167].setRotationPoint(-24F, -15F, -4.75F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 2F, 0F, -2F); // Import Box0
		gunModel[168].setRotationPoint(-25F, -6F, -4.75F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[169].setRotationPoint(-22F, -9F, -4.75F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F); // Import Box0
		gunModel[170].setRotationPoint(-24F, -6F, -4.75F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,2F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F); // Import Box0
		gunModel[171].setRotationPoint(-26F, -17F, -4.75F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,2F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F); // Import Box0
		gunModel[172].setRotationPoint(-28F, -18F, -4.75F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,-2F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -2F, -0.5F, 0F, -2F, -1F, 1F, 0F, -1F, 1F, 0F, -0.5F, 0F, -2F); // Import Box0
		gunModel[173].setRotationPoint(-29F, -3F, -4.75F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,1F, -1F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 1F, -1F, -2F, 1F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[174].setRotationPoint(-30F, 0F, -4.75F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[175].setRotationPoint(-33F, 1F, -4.75F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,1F, 0F, -2F, 1F, -1F, -2F, 1F, -1F, -2F, 1F, 0F, -2F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F); // Import Box0
		gunModel[176].setRotationPoint(-36F, 0F, -4.75F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,1F, 1F, -2F, 1F, -3F, -2F, 1F, -3F, -2F, 1F, 1F, -2F, 1F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F); // Import Box0
		gunModel[177].setRotationPoint(-40F, -3F, -4.75F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 1F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 1F, -2F, 1F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -2F, 0F); // Import Box0
		gunModel[178].setRotationPoint(-42F, -7F, -4.75F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[179].setRotationPoint(-44F, -8F, -4.75F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F); // Import Box0
		gunModel[180].setRotationPoint(-43.5F, -12F, -4.75F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 2.5F, 0F, -2F, 2.5F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F); // Import Box0
		gunModel[181].setRotationPoint(-43.5F, -14F, -4.75F);

		gunModel[182].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,-5F, 0F, 0F, 5.5F, 0F, -2F, 5.5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F); // Import Box0
		gunModel[182].setRotationPoint(-42.5F, -17F, -4.75F);

		gunModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,-3F, 0F, 0F, 3.5F, 0F, -2F, 3.5F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F); // Import Box0
		gunModel[183].setRotationPoint(-37.5F, -18F, -4.75F);

		gunModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[184].setRotationPoint(-44.5F, -14F, -4.75F);

		gunModel[185].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-5F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[185].setRotationPoint(-44F, -17F, -4.75F);

		gunModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[186].setRotationPoint(-39.5F, -18F, -4.75F);

		gunModel[187].addShapeBox(0F, 0F, 0F, 3, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[187].setRotationPoint(-51.5F, -18F, -5.75F);

		gunModel[188].addShapeBox(0F, 0F, 0F, 4, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[188].setRotationPoint(-55.5F, -18F, -5.75F);

		gunModel[189].addShapeBox(0F, 0F, 0F, 4, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Import Box0
		gunModel[189].setRotationPoint(-59.5F, -18F, -5.75F);

		gunModel[190].addShapeBox(0F, 0F, 0F, 4, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F); // Import Box0
		gunModel[190].setRotationPoint(-63.5F, -18F, -5.75F);

		gunModel[191].addShapeBox(0F, 0F, 0F, 4, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 5F, 0F); // Import Box0
		gunModel[191].setRotationPoint(-67.5F, -18F, -5.75F);

		gunModel[192].addShapeBox(0F, 0F, 0F, 3, 15, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Import Box0
		gunModel[192].setRotationPoint(-70.5F, -18F, -5.75F);

		gunModel[193].addShapeBox(0F, 0F, 0F, 13, 24, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[193].setRotationPoint(-83.5F, -18F, -5.75F);

		gunModel[194].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box0
		gunModel[194].setRotationPoint(-83.5F, 9F, -3.75F);

		gunModel[195].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[195].setRotationPoint(-70.5F, 2F, -5.75F);

		gunModel[196].addShapeBox(0F, 0F, 0F, 15, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[196].setRotationPoint(-83.5F, 6F, -5.75F);

		gunModel[197].addShapeBox(0F, 0F, 0F, 4, 31, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[197].setRotationPoint(-87.5F, -25F, -4.75F);

		gunModel[198].addShapeBox(0F, 0F, 0F, 3, 31, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[198].setRotationPoint(-90.5F, -25F, -5.75F);

		gunModel[199].addShapeBox(0F, 0F, 0F, 4, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[199].setRotationPoint(-87.5F, 6F, -4.75F);

		gunModel[200].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[200].setRotationPoint(-90.5F, 6F, -5.75F);

		gunModel[201].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F); // Import Box0
		gunModel[201].setRotationPoint(-87.5F, 9F, -2.75F);

		gunModel[202].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box0
		gunModel[202].setRotationPoint(-90.5F, 9F, -3.75F);

		gunModel[203].addShapeBox(0F, 0F, 0F, 3, 31, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[203].setRotationPoint(-93.5F, -25F, -5.75F);

		gunModel[204].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[204].setRotationPoint(-93.5F, 6F, -5.75F);

		gunModel[205].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box0
		gunModel[205].setRotationPoint(-93.5F, 9F, -3.75F);

		gunModel[206].addShapeBox(0F, 0F, 0F, 2, 31, 12, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[206].setRotationPoint(-96.5F, -25F, -5.75F);

		gunModel[207].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 2F, 0F, -2F); // Import Box0
		gunModel[207].setRotationPoint(-97.5F, 6F, -5.75F);

		gunModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 1F, 0F, -3F); // Import Box0
		gunModel[208].setRotationPoint(-99.5F, 9F, -3.75F);

		gunModel[209].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.75F, 0F, -2F, 0.75F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[209].setRotationPoint(-96.5F, 6F, -5.75F);

		gunModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.75F, 0F, -3F, 0.75F, 0F, -3F, 0F, 0F, -3F); // Import Box0
		gunModel[210].setRotationPoint(-96.5F, 9F, -3.75F);

		gunModel[211].addShapeBox(0F, 0F, 0F, 3, 15, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[211].setRotationPoint(-99.5F, -19F, -5.75F);

		gunModel[212].addShapeBox(0F, 0F, 0F, 2, 10, 12, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[212].setRotationPoint(-98.5F, -4F, -5.75F);

		gunModel[213].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		gunModel[213].setRotationPoint(-101.5F, -23F, -5.75F);

		gunModel[214].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[214].setRotationPoint(-100.5F, -25F, -5.75F);

		gunModel[215].addShapeBox(0F, 0F, 0F, 1, 31, 10, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[215].setRotationPoint(-94F, -25F, -4.75F);

		gunModel[216].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[216].setRotationPoint(-94F, 6F, -4.75F);

		gunModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.25F, 0F, -3F); // Import Box0
		gunModel[217].setRotationPoint(-94F, 9F, -2.75F);

		gunModel[218].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[218].setRotationPoint(-90.5F, -27F, -5.75F);

		gunModel[219].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[219].setRotationPoint(-93.5F, -27F, -5.75F);

		gunModel[220].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[220].setRotationPoint(-96.5F, -27F, -5.75F);

		gunModel[221].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[221].setRotationPoint(-100.5F, -27F, -5.75F);

		gunModel[222].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[222].setRotationPoint(-87.5F, -27F, -4.75F);

		gunModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.75F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.75F, 0F, -2F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Import Box0
		gunModel[223].setRotationPoint(-94.5F, -27F, -4.75F);

		gunModel[224].addShapeBox(0F, 0F, 0F, 5, 7, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[224].setRotationPoint(-83.5F, -25F, -5.75F);

		gunModel[225].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[225].setRotationPoint(-83.5F, -27F, -5.75F);

		gunModel[226].addShapeBox(0F, 0F, 0F, 20, 3, 12, 0F,0F, -1F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[226].setRotationPoint(-40.5F, -27F, -5.75F);

		gunModel[227].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, -1.5F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F, 0.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.3F, 0F); // Import Box0
		gunModel[227].setRotationPoint(-20.5F, -28F, -5.75F);

		gunModel[228].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, -2.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F); // Import Box0
		gunModel[228].setRotationPoint(-20.5F, -27F, 3.25F);

		gunModel[229].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1.5F, -2F, 0F, 0.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.3F, 0F); // Import Box0
		gunModel[229].setRotationPoint(-20.5F, -28F, 3.25F);

		gunModel[230].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, -2.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F); // Import Box0
		gunModel[230].setRotationPoint(-20.5F, -27F, -5.75F);

		gunModel[231].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[231].setRotationPoint(-20.5F, -26F, -2.75F);

		gunModel[232].addShapeBox(0F, 0F, 0F, 3, 5, 12, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[232].setRotationPoint(-43.5F, -23F, -5.75F);

		gunModel[233].addShapeBox(0F, 0F, 0F, 35, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[233].setRotationPoint(-78.5F, -24F, -7.25F);

		gunModel[234].addShapeBox(0F, 0F, 0F, 35, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[234].setRotationPoint(-78.5F, -18F, -7.25F);

		gunModel[235].addShapeBox(0F, 0F, 0F, 35, 3, 15, 0F,0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[235].setRotationPoint(-78.5F, -27F, -7.25F);

		gunModel[236].addShapeBox(0F, 0F, 0F, 37, 1, 15, 0F,0F, 0.5F, -5F, 2F, 0.5F, -5F, 2F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[236].setRotationPoint(-78.5F, -28F, -7.25F);

		gunModel[237].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[237].setRotationPoint(-43.5F, -25F, -4.25F);

		gunModel[238].addShapeBox(0F, 0F, 0F, 1, 31, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[238].setRotationPoint(-87F, -25F, -5.75F);

		gunModel[239].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[239].setRotationPoint(-87F, 6F, -5.75F);

		gunModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box0
		gunModel[240].setRotationPoint(-87F, 9F, -3.75F);

		gunModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[241].setRotationPoint(-87F, -27F, -5.75F);

		gunModel[242].addShapeBox(0F, 0F, 0F, 1, 31, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[242].setRotationPoint(-85F, -25F, -5.75F);

		gunModel[243].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[243].setRotationPoint(-85F, 6F, -5.75F);

		gunModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box0
		gunModel[244].setRotationPoint(-85F, 9F, -3.75F);

		gunModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[245].setRotationPoint(-85F, -27F, -5.75F);

		gunModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[246].setRotationPoint(10.5F, -34F, -2.25F);

		gunModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[247].setRotationPoint(10.5F, -32F, -2.25F);

		gunModel[248].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,2.15F, 1F, -0.5F, 1F, 1F, -0.5F, 1F, 1F, 0F, 2.15F, 1F, 0F, 5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 5F, 0F, 0F); // Import Box0
		gunModel[248].setRotationPoint(-4.5F, -33F, 1.75F);

		gunModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,3F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.5F, 0F, 3F, 0.5F, 0F, 5.15F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, 5.15F, 0F, 0F); // Import Box0
		gunModel[249].setRotationPoint(-1.5F, -35F, 0.75F);

		gunModel[250].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, -2.65F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -2.65F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[250].setRotationPoint(-18.5F, -30F, -3F);

		gunModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -0.5F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[251].setRotationPoint(-20.5F, -27F, -2.75F);

		gunModel[252].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, -2.65F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -2.65F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[252].setRotationPoint(-18.5F, -30F, 2.25F);

		gunModel[253].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -1.35F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.35F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Import Box0
		gunModel[253].setRotationPoint(-15.5F, -30F, -2F);

		gunModel[254].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -1.35F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.35F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[254].setRotationPoint(-15.5F, -30F, 1.5F);

		gunModel[255].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -1.65F, 1F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -1.65F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[255].setRotationPoint(-18.5F, -29F, 1.5F);

		gunModel[256].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -1.65F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -1.65F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F); // Import Box0
		gunModel[256].setRotationPoint(-18.5F, -29F, -2F);

		gunModel[257].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1.75F, 0F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1F, 0F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, -0.5F); // Import Box0
		gunModel[257].setRotationPoint(-18.5F, -27.5F, 0F);

		gunModel[258].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1.5F, 1.5F, 0F, -0.25F, 2F, 0F, -0.25F, 1.5F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[258].setRotationPoint(-15.5F, -28.75F, 0F);

		gunModel[259].addShapeBox(0F, 0F, 0F, 23, 2, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[259].setRotationPoint(-12.5F, -28.75F, -2.75F);

		gunModel[260].addBox(0F, 0F, 0F, 9, 4, 3, 0F); // Import Box0
		gunModel[260].setRotationPoint(1.5F, -30F, -5.75F);

		gunModel[261].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Import Box0
		gunModel[261].setRotationPoint(-2.5F, -27F, -5.75F);

		gunModel[262].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box0
		gunModel[262].setRotationPoint(12.5F, -30.5F, 4.25F);

		gunModel[263].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F); // Import Box0
		gunModel[263].setRotationPoint(12F, -29F, 4F);

		gunModel[264].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		gunModel[264].setRotationPoint(12F, -32F, 4F);

		gunModel[265].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		gunModel[265].setRotationPoint(12F, -30.5F, 4F);

		gunModel[266].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F); // Import Box0
		gunModel[266].setRotationPoint(12F, -29F, -5.5F);

		gunModel[267].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		gunModel[267].setRotationPoint(12F, -32F, -5.5F);

		gunModel[268].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		gunModel[268].setRotationPoint(12F, -30.5F, -5.5F);

		gunModel[269].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box0
		gunModel[269].setRotationPoint(12.5F, -30.5F, -5.75F);

		gunModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0.25F, -0.75F, -3F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0.25F, -0.75F, -3F, 0.25F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0.25F, 0F, -3F); // Import Box0
		gunModel[270].setRotationPoint(-27F, -5F, -5.75F);
	}

	private void initdefaultScopeModel_1()
	{
		defaultScopeModel[0] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Import Box0
		defaultScopeModel[1] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Import Box0
		defaultScopeModel[2] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Import Box0
		defaultScopeModel[3] = new ModelRendererTurbo(this, 713, 57, textureX, textureY); // Import Box0
		defaultScopeModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box0
		defaultScopeModel[5] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Import Box0
		defaultScopeModel[6] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import Box0
		defaultScopeModel[7] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Import Box0
		defaultScopeModel[8] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Import Box0
		defaultScopeModel[9] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Import Box0
		defaultScopeModel[10] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Import Box0
		defaultScopeModel[11] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import Box0
		defaultScopeModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box0
		defaultScopeModel[13] = new ModelRendererTurbo(this, 961, 25, textureX, textureY); // Import Box0
		defaultScopeModel[14] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Import Box0
		defaultScopeModel[15] = new ModelRendererTurbo(this, 905, 169, textureX, textureY); // Import Box0
		defaultScopeModel[16] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import Box0
		defaultScopeModel[17] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Import Box0
		defaultScopeModel[18] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Import Box0
		defaultScopeModel[19] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Import Box0
		defaultScopeModel[20] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Import Box0
		defaultScopeModel[21] = new ModelRendererTurbo(this, 657, 65, textureX, textureY); // Import Box0
		defaultScopeModel[22] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Import Box0
		defaultScopeModel[23] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Import Box0
		defaultScopeModel[24] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Import Box0
		defaultScopeModel[25] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Import Box0
		defaultScopeModel[26] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Import Box0
		defaultScopeModel[27] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Import Box0
		defaultScopeModel[28] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Import Box0
		defaultScopeModel[29] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Import Box0
		defaultScopeModel[30] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Import Box0
		defaultScopeModel[31] = new ModelRendererTurbo(this, 697, 73, textureX, textureY); // Import Box0
		defaultScopeModel[32] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Import Box0
		defaultScopeModel[33] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Import Box0
		defaultScopeModel[34] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Import Box0
		defaultScopeModel[35] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Import Box0
		defaultScopeModel[36] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Import Box0
		defaultScopeModel[37] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Import Box0
		defaultScopeModel[38] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Import Box0
		defaultScopeModel[39] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Import Box0
		defaultScopeModel[40] = new ModelRendererTurbo(this, 617, 121, textureX, textureY); // Import Box0
		defaultScopeModel[41] = new ModelRendererTurbo(this, 713, 137, textureX, textureY); // Import Box0
		defaultScopeModel[42] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Import Box0
		defaultScopeModel[43] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Import Box0
		defaultScopeModel[44] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Import Box0
		defaultScopeModel[45] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Import Box0
		defaultScopeModel[46] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Import Box0
		defaultScopeModel[47] = new ModelRendererTurbo(this, 745, 9, textureX, textureY); // Import Box0
		defaultScopeModel[48] = new ModelRendererTurbo(this, 777, 9, textureX, textureY); // Import Box0
		defaultScopeModel[49] = new ModelRendererTurbo(this, 889, 9, textureX, textureY); // Import Box0
		defaultScopeModel[50] = new ModelRendererTurbo(this, 921, 9, textureX, textureY); // Import Box0
		defaultScopeModel[51] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Import Box0
		defaultScopeModel[52] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Import Box0
		defaultScopeModel[53] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Import Box0
		defaultScopeModel[54] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Import Box0
		defaultScopeModel[55] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Import Box0
		defaultScopeModel[56] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		defaultScopeModel[57] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box0
		defaultScopeModel[58] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import Box0
		defaultScopeModel[59] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import Box0
		defaultScopeModel[60] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Box0
		defaultScopeModel[61] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import Box0
		defaultScopeModel[62] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box0
		defaultScopeModel[63] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Import Box0
		defaultScopeModel[64] = new ModelRendererTurbo(this, 865, 89, textureX, textureY); // Import Box0
		defaultScopeModel[65] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY); // Import Box0
		defaultScopeModel[66] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Import Box0

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[0].setRotationPoint(135.5F, -42F, -1.75F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[1].setRotationPoint(135.5F, -44F, -1.75F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		defaultScopeModel[2].setRotationPoint(135.5F, -46F, -1.75F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[3].setRotationPoint(135.5F, -47F, -1.75F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[4].setRotationPoint(135.5F, -50F, -3.25F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		defaultScopeModel[5].setRotationPoint(135.5F, -48F, -2.75F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		defaultScopeModel[6].setRotationPoint(135.5F, -51F, 1.75F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[7].setRotationPoint(135.5F, -48F, -3.75F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[8].setRotationPoint(135.5F, -50F, 2.75F);

		defaultScopeModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[9].setRotationPoint(135.5F, -48F, 2.25F);

		defaultScopeModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		defaultScopeModel[10].setRotationPoint(135.5F, -48F, 3.25F);

		defaultScopeModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		defaultScopeModel[11].setRotationPoint(135.5F, -51F, -4.25F);

		defaultScopeModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[12].setRotationPoint(136.5F, -50F, -0.25F);

		defaultScopeModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[13].setRotationPoint(137.5F, -41F, -1.75F);

		defaultScopeModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box0
		defaultScopeModel[14].setRotationPoint(136.5F, -41F, -1.75F);

		defaultScopeModel[15].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[15].setRotationPoint(140.5F, -41F, -3.75F);

		defaultScopeModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[16].setRotationPoint(143.5F, -41F, -3.75F);

		defaultScopeModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[17].setRotationPoint(140.5F, -43F, -3.75F);

		defaultScopeModel[18].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[18].setRotationPoint(134.5F, -40F, -2.75F);

		defaultScopeModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[19].setRotationPoint(134.5F, -40.5F, -2.75F);

		defaultScopeModel[20].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[20].setRotationPoint(135.5F, -39F, -4.75F);

		defaultScopeModel[21].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,-1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[21].setRotationPoint(135.5F, -42F, -4.75F);

		defaultScopeModel[22].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[22].setRotationPoint(135.5F, -40.5F, -4.75F);

		defaultScopeModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[23].setRotationPoint(136.75F, -40F, 2.75F);

		defaultScopeModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[24].setRotationPoint(136.75F, -40.5F, 2.75F);

		defaultScopeModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[25].setRotationPoint(136.75F, -41F, 2.75F);

		defaultScopeModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[26].setRotationPoint(142.25F, -40F, 2.75F);

		defaultScopeModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[27].setRotationPoint(142.25F, -40.5F, 2.75F);

		defaultScopeModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[28].setRotationPoint(142.25F, -41F, 2.75F);

		defaultScopeModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[29].setRotationPoint(139.5F, -43F, -1.75F);

		defaultScopeModel[30].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[30].setRotationPoint(7.5F, -43F, -1.25F);

		defaultScopeModel[31].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[31].setRotationPoint(7.5F, -45F, -1.25F);

		defaultScopeModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[32].setRotationPoint(7.5F, -46F, -1.25F);

		defaultScopeModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		defaultScopeModel[33].setRotationPoint(7.5F, -47F, -2.25F);

		defaultScopeModel[34].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[34].setRotationPoint(7.5F, -50F, -3.25F);

		defaultScopeModel[35].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		defaultScopeModel[35].setRotationPoint(7.5F, -50F, 1.75F);

		defaultScopeModel[36].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[36].setRotationPoint(9.5F, -42F, -1.75F);

		defaultScopeModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box0
		defaultScopeModel[37].setRotationPoint(8.5F, -42F, -1.75F);

		defaultScopeModel[38].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[38].setRotationPoint(12.5F, -42F, -3.75F);

		defaultScopeModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[39].setRotationPoint(15.5F, -42F, -3.75F);

		defaultScopeModel[40].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[40].setRotationPoint(12.5F, -44F, -3.75F);

		defaultScopeModel[41].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[41].setRotationPoint(6.5F, -41F, -2.75F);

		defaultScopeModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[42].setRotationPoint(6.5F, -41.5F, -2.75F);

		defaultScopeModel[43].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[43].setRotationPoint(7.5F, -40F, -4.75F);

		defaultScopeModel[44].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,-1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[44].setRotationPoint(7.5F, -43F, -4.75F);

		defaultScopeModel[45].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[45].setRotationPoint(7.5F, -41.5F, -4.75F);

		defaultScopeModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[46].setRotationPoint(8.75F, -41F, 2.75F);

		defaultScopeModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[47].setRotationPoint(8.75F, -41.5F, 2.75F);

		defaultScopeModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[48].setRotationPoint(8.75F, -42F, 2.75F);

		defaultScopeModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[49].setRotationPoint(14.25F, -41F, 2.75F);

		defaultScopeModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[50].setRotationPoint(14.25F, -41.5F, 2.75F);

		defaultScopeModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[51].setRotationPoint(14.25F, -42F, 2.75F);

		defaultScopeModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[52].setRotationPoint(11.5F, -44F, -1.75F);

		defaultScopeModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		defaultScopeModel[53].setRotationPoint(7.5F, -51F, -3.25F);

		defaultScopeModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		defaultScopeModel[54].setRotationPoint(7.5F, -51F, 1.75F);

		defaultScopeModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		defaultScopeModel[55].setRotationPoint(9F, -48.2F, -1.25F);

		defaultScopeModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		defaultScopeModel[56].setRotationPoint(9F, -48.2F, -0.25F);

		defaultScopeModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Import Box0
		defaultScopeModel[57].setRotationPoint(9F, -49.7F, -0.75F);

		defaultScopeModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Import Box0
		defaultScopeModel[58].setRotationPoint(9F, -49.7F, 0.75F);

		defaultScopeModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box0
		defaultScopeModel[59].setRotationPoint(9F, -49.7F, 0.25F);

		defaultScopeModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.25F, -1.49F, 0F, -1.25F, -1.49F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box0
		defaultScopeModel[60].setRotationPoint(9F, -49.7F, -0.75F);

		defaultScopeModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, -1.49F, 0F, -1.25F, -1.49F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); // Import Box0
		defaultScopeModel[61].setRotationPoint(9F, -49.7F, 0.25F);

		defaultScopeModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1.25F, -1.49F, 0F, -1.25F, -1.49F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F); // Import Box0
		defaultScopeModel[62].setRotationPoint(9F, -48.7F, -0.75F);

		defaultScopeModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, -1.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, -1.49F, 0F, -1.25F, -1.49F); // Import Box0
		defaultScopeModel[63].setRotationPoint(9F, -48.7F, 0.25F);

		defaultScopeModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[64].setRotationPoint(8.5F, -44.75F, -1.75F);

		defaultScopeModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[65].setRotationPoint(8.5F, -45.25F, -1.75F);

		defaultScopeModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box0
		defaultScopeModel[66].setRotationPoint(8.5F, -45.75F, -1.75F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 873, 161, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 993, 161, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 937, 161, textureX, textureY); // Import Box0
		ammoModel[6] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Import Box0
		ammoModel[7] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Import Box0
		ammoModel[8] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Import Box0
		ammoModel[9] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Import Box0
		ammoModel[10] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Import Box0
		ammoModel[11] = new ModelRendererTurbo(this, 553, 105, textureX, textureY); // Import Box0
		ammoModel[12] = new ModelRendererTurbo(this, 601, 105, textureX, textureY); // Import Box0
		ammoModel[13] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Import Box0
		ammoModel[14] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Import Box0
		ammoModel[15] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Import Box0
		ammoModel[16] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Import Box0
		ammoModel[17] = new ModelRendererTurbo(this, 513, 169, textureX, textureY); // Import Box0
		ammoModel[18] = new ModelRendererTurbo(this, 753, 169, textureX, textureY); // Import Box0
		ammoModel[19] = new ModelRendererTurbo(this, 777, 169, textureX, textureY); // Import Box0

		ammoModel[0].addShapeBox(0F, 0F, 0F, 21, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[0].setRotationPoint(22F, -4.5F, -4.25F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 15, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[1].setRotationPoint(22F, -19.5F, -4.25F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 3, 15, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[2].setRotationPoint(25F, -19.5F, -4.25F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 5, 15, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[3].setRotationPoint(30F, -19.5F, -4.25F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 7, 15, 9, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		ammoModel[4].setRotationPoint(36F, -19.5F, -4.25F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 2, 15, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[5].setRotationPoint(34.5F, -19.5F, -3.25F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 2, 15, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[6].setRotationPoint(28F, -19.5F, -3.25F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 2, 15, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[7].setRotationPoint(23F, -19.5F, -3.25F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		ammoModel[8].setRotationPoint(29F, -5.5F, -4.25F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[9].setRotationPoint(28F, -5.5F, -4.25F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		ammoModel[10].setRotationPoint(24F, -5.5F, -4.25F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[11].setRotationPoint(23F, -5.5F, -4.25F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		ammoModel[12].setRotationPoint(35.5F, -5.5F, -4.25F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[13].setRotationPoint(34.5F, -5.5F, -4.25F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F, 0F); // Import Box0
		ammoModel[14].setRotationPoint(24F, -2.5F, -5.25F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F, 0F); // Import Box0
		ammoModel[15].setRotationPoint(24F, -3F, -5.25F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		ammoModel[16].setRotationPoint(24F, -2.5F, 4.75F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		ammoModel[17].setRotationPoint(24F, -3F, 4.75F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 1, 18, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box0
		ammoModel[18].setRotationPoint(21F, -19.5F, -4.25F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 1, 18, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box0
		ammoModel[19].setRotationPoint(43F, -19.5F, -4.25F);
	}

	private void initpumpModel_1()
	{
		pumpModel[0] = new ModelRendererTurbo(this, 657, 177, textureX, textureY); // Import Box0
		pumpModel[1] = new ModelRendererTurbo(this, 801, 177, textureX, textureY); // Import Box0
		pumpModel[2] = new ModelRendererTurbo(this, 513, 185, textureX, textureY); // Import Box0
		pumpModel[3] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import Box0
		pumpModel[4] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import Box0
		pumpModel[5] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import Box0
		pumpModel[6] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import Box0
		pumpModel[7] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import Box0
		pumpModel[8] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Import Box0
		pumpModel[9] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Import Box0
		pumpModel[10] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Import Box0

		pumpModel[0].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		pumpModel[0].setRotationPoint(-7.5F, -30F, -2.75F);

		pumpModel[1].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		pumpModel[1].setRotationPoint(-7.5F, -32F, -2.75F);

		pumpModel[2].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		pumpModel[2].setRotationPoint(-7.5F, -34F, -2.75F);

		pumpModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		pumpModel[3].setRotationPoint(-8F, -31.5F, -1.25F);

		pumpModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		pumpModel[4].setRotationPoint(-8F, -32.5F, -1.25F);

		pumpModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		pumpModel[5].setRotationPoint(-8F, -30.5F, -1.25F);

		pumpModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		pumpModel[6].setRotationPoint(-2F, -34F, -4.75F);

		pumpModel[7].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -0.5F, 0F, -2F); // Import Box0
		pumpModel[7].setRotationPoint(-2F, -32F, -6.75F);

		pumpModel[8].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Import Box0
		pumpModel[8].setRotationPoint(-1.5F, -28F, -8.75F);

		pumpModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, -3.25F, 0F, 1F, -3.25F); // Import Box0
		pumpModel[9].setRotationPoint(-1.5F, -24F, -11.25F);

		pumpModel[10].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,-0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F, -0.65F); // Import Box0
		pumpModel[10].setRotationPoint(-2.5F, -23F, -11.5F);
		pumpModel[10].rotateAngleX = -0.78539816F;
	}
}