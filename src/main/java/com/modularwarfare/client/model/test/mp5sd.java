//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: mp5sd
// Model Creator: 
// Created on: 13.10.2018 - 15:27:02
// Last changed on: 13.10.2018 - 15:27:02

package com.modularwarfare.client.model.test; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

//import com.flansmod.client.model.EnumAnimationType;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class mp5sd extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public mp5sd() //Same as Filename
	{
		modelScale = 0.24F;
		gunModel = new ModelRendererTurbo[664];
		ammoModel = new ModelRendererTurbo[42];
		slideModel = new ModelRendererTurbo[6];

		initgunModel_1();
		initgunModel_2();
		initammoModel_1();
		initslideModel_1();

		gripAttachPoint = new Vector3f(70 /16F, 30F /16F, 0F /16F);

		translateAll(4F, 23F, 0F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.10F, 0F);//forward/up/? 


		gunSlideDistance = 0F;
		//animationType = EnumAnimationType.CUSTOM;

		rotateGunVertical = 35F;
		rotateGunHorizontal = 1F;
		tiltGun = 25F;
		translateGun = new Vector3f(1 /16F, 1F /16F, -1F /16F);
		rotateClipVertical = -91F;
		rotateClipHorizontal = 1F;
		tiltClip = 28F;
		translateClip = new Vector3f(1 /16F, -10F /16F, 1F /16F);

		hasFlash = false;
        hasArms = true;
        
        leftArmPos = new Vector3f(-0.03F, -0.33F, 0.05F);
        leftArmRot = new Vector3f(60.0F, 45.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.20F, -0.35F, 0.26F);
        leftArmReloadRot = new Vector3f(60.0F, 65.0F, -0.0F);
 
        rightArmPos = new Vector3f(0.23F, -0.6F, 0.0F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.23F, -0.55F, 0.05F);
        rightArmReloadRot = new Vector3f(-0.0F, 0.0F, -90.0F);
        
        rightArmScale = new Vector3f(0.8F, 0.8F, 0.8F);
        leftArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
 
        rightHandAmmo = false;
        leftHandAmmo = true;
        
		//RecoilSlideDistance = 0.16F;
		//RotateSlideDistance = -1F;
		
		casingAnimDistance = new Vector3f(0, 1, 12);
	    casingAnimSpread = new Vector3f(2, 2, 0);
	    casingAnimTime = 4;  
	    casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);
	    
		crouchZoom = -0.15F;
		fancyStance = true;
		stanceRotate = new Vector3f(60.0F, -0.0F, 10.0F);
		stanceTranslate = new Vector3f(0.7F, -0.0F, 0.25F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Box0
		gunModel[34] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box0
		gunModel[35] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import Box0
		gunModel[36] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import Box0
		gunModel[37] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Import Box0
		gunModel[38] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Import Box0
		gunModel[39] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import Box0
		gunModel[40] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Import Box0
		gunModel[41] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import Box0
		gunModel[42] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Import Box0
		gunModel[43] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box0
		gunModel[44] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box0
		gunModel[45] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Import Box0
		gunModel[46] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box0
		gunModel[47] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import Box0
		gunModel[48] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[49] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box0
		gunModel[50] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box0
		gunModel[51] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Import Box0
		gunModel[52] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box0
		gunModel[53] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box0
		gunModel[54] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Import Box0
		gunModel[55] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		gunModel[56] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box0
		gunModel[57] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box0
		gunModel[58] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import Box0
		gunModel[59] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import Box0
		gunModel[60] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Import Box0
		gunModel[61] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Import Box0
		gunModel[62] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Import Box0
		gunModel[63] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import Box0
		gunModel[64] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Import Box0
		gunModel[65] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Import Box0
		gunModel[66] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import Box0
		gunModel[67] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Import Box0
		gunModel[68] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Import Box0
		gunModel[69] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Import Box0
		gunModel[70] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box0
		gunModel[71] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Import Box0
		gunModel[72] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Import Box0
		gunModel[73] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import Box0
		gunModel[74] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Import Box0
		gunModel[75] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Import Box0
		gunModel[76] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Import Box0
		gunModel[77] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box0
		gunModel[78] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Import Box0
		gunModel[79] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import Box0
		gunModel[80] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import Box0
		gunModel[81] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Import Box0
		gunModel[82] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box0
		gunModel[83] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Import Box0
		gunModel[84] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Import Box0
		gunModel[85] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Import Box0
		gunModel[86] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Import Box0
		gunModel[87] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box0
		gunModel[88] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Import Box0
		gunModel[89] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Import Box0
		gunModel[90] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Import Box0
		gunModel[91] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import Box0
		gunModel[92] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Import Box0
		gunModel[93] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Import Box0
		gunModel[94] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Import Box0
		gunModel[95] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Import Box0
		gunModel[96] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import Box0
		gunModel[97] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import Box0
		gunModel[98] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Import Box0
		gunModel[99] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Import Box0
		gunModel[100] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Import Box0
		gunModel[101] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Import Box0
		gunModel[102] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box0
		gunModel[103] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Import Box0
		gunModel[104] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Import Box0
		gunModel[105] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Import Box0
		gunModel[106] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Import Box0
		gunModel[107] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Import Box0
		gunModel[108] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box0
		gunModel[109] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box0
		gunModel[110] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Import Box0
		gunModel[111] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Import Box0
		gunModel[112] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box0
		gunModel[113] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box0
		gunModel[114] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Import Box0
		gunModel[115] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Import Box0
		gunModel[116] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Import Box0
		gunModel[117] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box0
		gunModel[118] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Import Box0
		gunModel[119] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Import Box0
		gunModel[120] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Import Box0
		gunModel[121] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import Box0
		gunModel[122] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Import Box0
		gunModel[123] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Import Box0
		gunModel[124] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Import Box0
		gunModel[125] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import Box0
		gunModel[126] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import Box0
		gunModel[127] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[128] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box0
		gunModel[129] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[130] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Import Box0
		gunModel[131] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Import Box0
		gunModel[132] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Import Box0
		gunModel[133] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Import Box0
		gunModel[134] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Import Box0
		gunModel[135] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Import Box0
		gunModel[136] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Import Box0
		gunModel[137] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Import Box0
		gunModel[138] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import Box0
		gunModel[139] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import Box0
		gunModel[140] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Import Box0
		gunModel[141] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Import Box0
		gunModel[142] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Import Box0
		gunModel[143] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Import Box0
		gunModel[144] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box0
		gunModel[145] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Import Box0
		gunModel[146] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Import Box0
		gunModel[147] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Import Box0
		gunModel[148] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Import Box0
		gunModel[149] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import Box0
		gunModel[150] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Import Box0
		gunModel[151] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Import Box0
		gunModel[152] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Import Box0
		gunModel[153] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import Box0
		gunModel[154] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Import Box0
		gunModel[155] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import Box0
		gunModel[156] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import Box0
		gunModel[157] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box0
		gunModel[158] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import Box0
		gunModel[159] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Import Box0
		gunModel[160] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import Box0
		gunModel[161] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import Box0
		gunModel[162] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Import Box0
		gunModel[163] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import Box0
		gunModel[164] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Import Box0
		gunModel[165] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Import Box0
		gunModel[166] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Import Box0
		gunModel[167] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Import Box0
		gunModel[168] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box0
		gunModel[169] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import Box0
		gunModel[170] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Import Box0
		gunModel[171] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Import Box0
		gunModel[172] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Import Box0
		gunModel[173] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import Box0
		gunModel[174] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import Box0
		gunModel[175] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box0
		gunModel[176] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0
		gunModel[177] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Import Box0
		gunModel[178] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Import Box0
		gunModel[179] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Import Box0
		gunModel[180] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box0
		gunModel[181] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Import Box0
		gunModel[182] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Import Box0
		gunModel[183] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Import Box0
		gunModel[184] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Import Box0
		gunModel[185] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Import Box0
		gunModel[186] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Import Box0
		gunModel[187] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Import Box0
		gunModel[188] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Import Box0
		gunModel[189] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box0
		gunModel[190] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Import Box0
		gunModel[191] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Import Box0
		gunModel[192] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Import Box0
		gunModel[193] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Import Box0
		gunModel[194] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import Box0
		gunModel[195] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Import Box0
		gunModel[196] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Import Box0
		gunModel[197] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Import Box0
		gunModel[198] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Import Box0
		gunModel[199] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Import Box0
		gunModel[200] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Import Box0
		gunModel[201] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Import Box0
		gunModel[202] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Import Box0
		gunModel[203] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Import Box0
		gunModel[204] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Import Box0
		gunModel[205] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Import Box0
		gunModel[206] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Import Box0
		gunModel[207] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Import Box0
		gunModel[208] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Import Box0
		gunModel[209] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Import Box0
		gunModel[210] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Import Box0
		gunModel[211] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Import Box0
		gunModel[212] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Import Box0
		gunModel[213] = new ModelRendererTurbo(this, 369, 193, textureX, textureY); // Import Box0
		gunModel[214] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Import Box0
		gunModel[215] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Import Box0
		gunModel[216] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Import Box0
		gunModel[217] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import Box0
		gunModel[218] = new ModelRendererTurbo(this, 33, 201, textureX, textureY); // Import Box0
		gunModel[219] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Import Box0
		gunModel[220] = new ModelRendererTurbo(this, 161, 201, textureX, textureY); // Import Box0
		gunModel[221] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Import Box0
		gunModel[222] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Import Box0
		gunModel[223] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Import Box0
		gunModel[224] = new ModelRendererTurbo(this, 17, 209, textureX, textureY); // Import Box0
		gunModel[225] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Import Box0
		gunModel[226] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Import Box0
		gunModel[227] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Import Box0
		gunModel[228] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Import Box0
		gunModel[229] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Import Box0
		gunModel[230] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Import Box0
		gunModel[231] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Import Box0
		gunModel[232] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Import Box0
		gunModel[233] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Import Box0
		gunModel[234] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Import Box0
		gunModel[235] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Import Box0
		gunModel[236] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Import Box0
		gunModel[237] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Import Box0
		gunModel[238] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Import Box0
		gunModel[239] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Import Box0
		gunModel[240] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Import Box0
		gunModel[241] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import Box0
		gunModel[242] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Import Box0
		gunModel[243] = new ModelRendererTurbo(this, 17, 201, textureX, textureY); // Import Box0
		gunModel[244] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Import Box0
		gunModel[245] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Import Box0
		gunModel[246] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Import Box0
		gunModel[247] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Import Box0
		gunModel[248] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Import Box0
		gunModel[249] = new ModelRendererTurbo(this, 297, 209, textureX, textureY); // Import Box0
		gunModel[250] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Import Box0
		gunModel[251] = new ModelRendererTurbo(this, 121, 217, textureX, textureY); // Import Box0
		gunModel[252] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Import Box0
		gunModel[253] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Import Box0
		gunModel[254] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Import Box0
		gunModel[255] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Import Box0
		gunModel[256] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Import Box0
		gunModel[257] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Import Box0
		gunModel[258] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Import Box0
		gunModel[259] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Import Box0
		gunModel[260] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Import Box0
		gunModel[261] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Import Box0
		gunModel[262] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Import Box0
		gunModel[263] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Import Box0
		gunModel[264] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Import Box0
		gunModel[265] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Import Box0
		gunModel[266] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Import Box0
		gunModel[267] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Import Box0
		gunModel[268] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Import Box0
		gunModel[269] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Import Box0
		gunModel[270] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box0
		gunModel[271] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Import Box0
		gunModel[272] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Import Box0
		gunModel[273] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box0
		gunModel[274] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Import Box0
		gunModel[275] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Import Box0
		gunModel[276] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Import Box0
		gunModel[277] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Import Box0
		gunModel[278] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box0
		gunModel[279] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Import Box0
		gunModel[280] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Box0
		gunModel[281] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Import Box0
		gunModel[282] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Import Box0
		gunModel[283] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Import Box0
		gunModel[284] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		gunModel[285] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box0
		gunModel[286] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Import Box0
		gunModel[287] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Import Box0
		gunModel[288] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box0
		gunModel[289] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Import Box0
		gunModel[290] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[291] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box0
		gunModel[292] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box0
		gunModel[293] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Import Box0
		gunModel[294] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box0
		gunModel[295] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box0
		gunModel[296] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Import Box0
		gunModel[297] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box0
		gunModel[298] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box0
		gunModel[299] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Import Box0
		gunModel[300] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import Box0
		gunModel[301] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Import Box0
		gunModel[302] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import Box0
		gunModel[303] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Import Box0
		gunModel[304] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Import Box0
		gunModel[305] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box0
		gunModel[306] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Import Box0
		gunModel[307] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box0
		gunModel[308] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import Box0
		gunModel[309] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Import Box0
		gunModel[310] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import Box0
		gunModel[311] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Import Box0
		gunModel[312] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Import Box0
		gunModel[313] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Import Box0
		gunModel[314] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Import Box0
		gunModel[315] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Import Box0
		gunModel[316] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import Box0
		gunModel[317] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import Box0
		gunModel[318] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Import Box0
		gunModel[319] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box0
		gunModel[320] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Import Box0
		gunModel[321] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Import Box0
		gunModel[322] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Import Box0
		gunModel[323] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Import Box0
		gunModel[324] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Import Box0
		gunModel[325] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Import Box0
		gunModel[326] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Import Box0
		gunModel[327] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import Box0
		gunModel[328] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box0
		gunModel[329] = new ModelRendererTurbo(this, 57, 233, textureX, textureY); // Import Box0
		gunModel[330] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Import Box0
		gunModel[331] = new ModelRendererTurbo(this, 185, 233, textureX, textureY); // Import Box0
		gunModel[332] = new ModelRendererTurbo(this, 209, 233, textureX, textureY); // Import Box0
		gunModel[333] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Import Box0
		gunModel[334] = new ModelRendererTurbo(this, 425, 209, textureX, textureY); // Import Box0
		gunModel[335] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Import Box0
		gunModel[336] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import Box0
		gunModel[337] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Import Box0
		gunModel[338] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import Box0
		gunModel[339] = new ModelRendererTurbo(this, 369, 233, textureX, textureY); // Import Box0
		gunModel[340] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Import Box0
		gunModel[341] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Import Box0
		gunModel[342] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Import Box0
		gunModel[343] = new ModelRendererTurbo(this, 473, 233, textureX, textureY); // Import Box0
		gunModel[344] = new ModelRendererTurbo(this, 297, 193, textureX, textureY); // Import Box0
		gunModel[345] = new ModelRendererTurbo(this, 33, 241, textureX, textureY); // Import Box0
		gunModel[346] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Import Box0
		gunModel[347] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Import Box0
		gunModel[348] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Import Box0
		gunModel[349] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Import Box0
		gunModel[350] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Import Box0
		gunModel[351] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Import Box0
		gunModel[352] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		gunModel[353] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Import Box0
		gunModel[354] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Import Box0
		gunModel[355] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Import Box0
		gunModel[356] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Import Box0
		gunModel[357] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Import Box0
		gunModel[358] = new ModelRendererTurbo(this, 297, 241, textureX, textureY); // Import Box0
		gunModel[359] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Import Box0
		gunModel[360] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Import Box0
		gunModel[361] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Import Box0
		gunModel[362] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Import Box0
		gunModel[363] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Import Box0
		gunModel[364] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Import Box0
		gunModel[365] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Import Box0
		gunModel[366] = new ModelRendererTurbo(this, 249, 249, textureX, textureY); // Import Box0
		gunModel[367] = new ModelRendererTurbo(this, 297, 249, textureX, textureY); // Import Box0
		gunModel[368] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Import Box0
		gunModel[369] = new ModelRendererTurbo(this, 425, 249, textureX, textureY); // Import Box0
		gunModel[370] = new ModelRendererTurbo(this, 57, 257, textureX, textureY); // Import Box0
		gunModel[371] = new ModelRendererTurbo(this, 105, 257, textureX, textureY); // Import Box0
		gunModel[372] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Import Box0
		gunModel[373] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Import Box0
		gunModel[374] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Import Box0
		gunModel[375] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Import Box0
		gunModel[376] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import Box0
		gunModel[377] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Import Box0
		gunModel[378] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Import Box0
		gunModel[379] = new ModelRendererTurbo(this, 153, 257, textureX, textureY); // Import Box0
		gunModel[380] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Import Box0
		gunModel[381] = new ModelRendererTurbo(this, 321, 225, textureX, textureY); // Import Box0
		gunModel[382] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Import Box0
		gunModel[383] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box0
		gunModel[384] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box0
		gunModel[385] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Import Box0
		gunModel[386] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Import Box0
		gunModel[387] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Import Box0
		gunModel[388] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Import Box0
		gunModel[389] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Import Box0
		gunModel[390] = new ModelRendererTurbo(this, 201, 257, textureX, textureY); // Import Box0
		gunModel[391] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Import Box0
		gunModel[392] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Import Box0
		gunModel[393] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Import Box0
		gunModel[394] = new ModelRendererTurbo(this, 249, 257, textureX, textureY); // Import Box0
		gunModel[395] = new ModelRendererTurbo(this, 489, 241, textureX, textureY); // Import Box0
		gunModel[396] = new ModelRendererTurbo(this, 465, 249, textureX, textureY); // Import Box0
		gunModel[397] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Import Box0
		gunModel[398] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Import Box0
		gunModel[399] = new ModelRendererTurbo(this, 201, 233, textureX, textureY); // Import Box0
		gunModel[400] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Import Box0
		gunModel[401] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Import Box0
		gunModel[402] = new ModelRendererTurbo(this, 313, 257, textureX, textureY); // Import Box0
		gunModel[403] = new ModelRendererTurbo(this, 385, 249, textureX, textureY); // Import Box0
		gunModel[404] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box0
		gunModel[405] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box0
		gunModel[406] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Import Box0
		gunModel[407] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Import Box0
		gunModel[408] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Import Box0
		gunModel[409] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Import Box0
		gunModel[410] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Import Box0
		gunModel[411] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Import Box0
		gunModel[412] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box0
		gunModel[413] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Import Box0
		gunModel[414] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import Box0
		gunModel[415] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Import Box0
		gunModel[416] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Import Box0
		gunModel[417] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Import Box0
		gunModel[418] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Import Box0
		gunModel[419] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Import Box0
		gunModel[420] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Import Box0
		gunModel[421] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Import Box0
		gunModel[422] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Import Box0
		gunModel[423] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Import Box0
		gunModel[424] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Import Box0
		gunModel[425] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Import Box0
		gunModel[426] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Import Box0
		gunModel[427] = new ModelRendererTurbo(this, 57, 265, textureX, textureY); // Import Box0
		gunModel[428] = new ModelRendererTurbo(this, 137, 265, textureX, textureY); // Import Box0
		gunModel[429] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Import Box0
		gunModel[430] = new ModelRendererTurbo(this, 329, 265, textureX, textureY); // Import Box0
		gunModel[431] = new ModelRendererTurbo(this, 57, 273, textureX, textureY); // Import Box0
		gunModel[432] = new ModelRendererTurbo(this, 185, 249, textureX, textureY); // Import Box0
		gunModel[433] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Import Box0
		gunModel[434] = new ModelRendererTurbo(this, 329, 241, textureX, textureY); // Import Box0
		gunModel[435] = new ModelRendererTurbo(this, 225, 273, textureX, textureY); // Import Box0
		gunModel[436] = new ModelRendererTurbo(this, 305, 273, textureX, textureY); // Import Box0
		gunModel[437] = new ModelRendererTurbo(this, 121, 249, textureX, textureY); // Import Box0
		gunModel[438] = new ModelRendererTurbo(this, 57, 249, textureX, textureY); // Import Box0
		gunModel[439] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Import Box0
		gunModel[440] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Import Box0
		gunModel[441] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Import Box0
		gunModel[442] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Import Box0
		gunModel[443] = new ModelRendererTurbo(this, 153, 233, textureX, textureY); // Import Box0
		gunModel[444] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Import Box0
		gunModel[445] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Import Box0
		gunModel[446] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Import Box0
		gunModel[447] = new ModelRendererTurbo(this, 441, 273, textureX, textureY); // Import Box0
		gunModel[448] = new ModelRendererTurbo(this, 457, 273, textureX, textureY); // Import Box0
		gunModel[449] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Import Box0
		gunModel[450] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Import Box0
		gunModel[451] = new ModelRendererTurbo(this, 473, 273, textureX, textureY); // Import Box0
		gunModel[452] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Import Box0
		gunModel[453] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Import Box0
		gunModel[454] = new ModelRendererTurbo(this, 57, 225, textureX, textureY); // Import Box0
		gunModel[455] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Import Box0
		gunModel[456] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Import Box0
		gunModel[457] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Import Box0
		gunModel[458] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Import Box0
		gunModel[459] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box0
		gunModel[460] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Import Box0
		gunModel[461] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box0
		gunModel[462] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Import Box0
		gunModel[463] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Import Box0
		gunModel[464] = new ModelRendererTurbo(this, 353, 241, textureX, textureY); // Import Box0
		gunModel[465] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Import Box0
		gunModel[466] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Import Box0
		gunModel[467] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Import Box0
		gunModel[468] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Import Box0
		gunModel[469] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Box0
		gunModel[470] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Import Box0
		gunModel[471] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Import Box0
		gunModel[472] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Import Box0
		gunModel[473] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Import Box0
		gunModel[474] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Import Box0
		gunModel[475] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Import Box0
		gunModel[476] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import Box0
		gunModel[477] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Import Box0
		gunModel[478] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Import Box0
		gunModel[479] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Import Box0
		gunModel[480] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Import Box0
		gunModel[481] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Import Box0
		gunModel[482] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Import Box0
		gunModel[483] = new ModelRendererTurbo(this, 305, 257, textureX, textureY); // Import Box0
		gunModel[484] = new ModelRendererTurbo(this, 497, 273, textureX, textureY); // Import Box0
		gunModel[485] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Import Box0
		gunModel[486] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Import Box0
		gunModel[487] = new ModelRendererTurbo(this, 81, 281, textureX, textureY); // Import Box0
		gunModel[488] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import Box0
		gunModel[489] = new ModelRendererTurbo(this, 97, 281, textureX, textureY); // Import Box0
		gunModel[490] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Import Box0
		gunModel[491] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Import Box0
		gunModel[492] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import Box0
		gunModel[493] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Import Box0
		gunModel[494] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Import Box0
		gunModel[495] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Import Box0
		gunModel[496] = new ModelRendererTurbo(this, 249, 281, textureX, textureY); // Import Box0
		gunModel[497] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Import Box0
		gunModel[498] = new ModelRendererTurbo(this, 361, 289, textureX, textureY); // Import Box0
		gunModel[499] = new ModelRendererTurbo(this, 113, 297, textureX, textureY); // Import Box0

		gunModel[0].addShapeBox(14F, -8F, -4F, 25, 12, 8, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Import Box0
		gunModel[0].setRotationPoint(-19F, -15F, 0F);

		gunModel[1].addShapeBox(14F, -8F, -4F, 8, 6, 8, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[1].setRotationPoint(-27F, -15F, 0F);

		gunModel[2].addShapeBox(14F, -8F, -4F, 7, 1, 8, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F); // Import Box0
		gunModel[2].setRotationPoint(-26F, -9.5F, 0F);

		gunModel[3].addShapeBox(14F, -8F, -4F, 4, 2, 8, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2F, 0F, 0.25F); // Import Box0
		gunModel[3].setRotationPoint(-23F, -8.5F, 0F);

		gunModel[4].addShapeBox(14F, -8F, -4F, 2, 4, 8, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.75F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -1.75F, -0.75F, 0.25F); // Import Box0
		gunModel[4].setRotationPoint(-21F, -6.5F, 0F);

		gunModel[5].addShapeBox(14F, -8F, -4F, 9, 3, 7, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[5].setRotationPoint(-19F, -3F, 0.5F);

		gunModel[6].addShapeBox(14F, -8F, -4F, 7, 3, 7, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F); // Import Box0
		gunModel[6].setRotationPoint(-19.5F, 0F, 0.5F);

		gunModel[7].addShapeBox(14F, -8F, -4F, 6, 2, 7, 0F,-0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, 0F); // Import Box0
		gunModel[7].setRotationPoint(-20.5F, 3F, 0.5F);

		gunModel[8].addShapeBox(14F, -8F, -4F, 4, 1, 7, 0F,0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[8].setRotationPoint(-20.5F, 5F, 0.5F);

		gunModel[9].addShapeBox(14F, -8F, -4F, 2, 3, 7, 0F,-2.5F, 0F, 0F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, -2.5F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, 0F); // Import Box0
		gunModel[9].setRotationPoint(-12F, -3F, 0.5F);

		gunModel[10].addShapeBox(14F, -8F, -4F, 2, 3, 7, 0F,-2.25F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -2.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F); // Import Box0
		gunModel[10].setRotationPoint(-14F, 0F, 0.5F);

		gunModel[11].addShapeBox(14F, -8F, -4F, 2, 2, 7, 0F,-2.25F, 0F, 0F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F); // Import Box0
		gunModel[11].setRotationPoint(-16F, 3F, 0.5F);

		gunModel[12].addShapeBox(14F, -8F, -4F, 3, 1, 7, 0F,-2F, 0F, 0F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F); // Import Box0
		gunModel[12].setRotationPoint(-18F, 5F, 0.5F);

		gunModel[13].addShapeBox(14F, -8F, -4F, 3, 16, 7, 0F,0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 7F, 0F, 0F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, 7F, 0F, 0F); // Import Box0
		gunModel[13].setRotationPoint(-18F, 6F, 0.5F);

		gunModel[14].addShapeBox(14F, -8F, -4F, 1, 16, 6, 0F,0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 7F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, 7F, 0F, 0F); // Import Box0
		gunModel[14].setRotationPoint(-14F, 6F, 1F);

		gunModel[15].addShapeBox(14F, -8F, -4F, 2, 1, 6, 0F,-1.5F, 0F, 0F, 1.5F, 0F, -2F, 1.5F, 0F, -2F, -1.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F); // Import Box0
		gunModel[15].setRotationPoint(-15F, 5F, 1F);

		gunModel[16].addShapeBox(14F, -8F, -4F, 2, 2, 6, 0F,-1.5F, 0F, 0F, 1.5F, 0F, -2F, 1.5F, 0F, -2F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, -0.5F, 0F, 0F); // Import Box0
		gunModel[16].setRotationPoint(-14F, 3F, 1F);

		gunModel[17].addShapeBox(14F, -8F, -4F, 3, 3, 6, 0F,-2F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F); // Import Box0
		gunModel[17].setRotationPoint(-13F, 0F, 1F);

		gunModel[18].addShapeBox(14F, -8F, -4F, 3, 3, 6, 0F,-1.75F, 0F, 0F, 0.75F, 0F, -2F, 0.75F, 0F, -2F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F); // Import Box0
		gunModel[18].setRotationPoint(-11F, -3F, 1F);

		gunModel[19].addShapeBox(14F, -8F, -4F, 25, 1, 8, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Import Box0
		gunModel[19].setRotationPoint(-19F, -3.25F, 0F);

		gunModel[20].addShapeBox(14F, -8F, -4F, 1, 1, 8, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -1F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -1F, -0.75F, -0.5F); // Import Box0
		gunModel[20].setRotationPoint(-20F, -3.25F, 0F);

		gunModel[21].addShapeBox(14F, -8F, -4F, 1, 3, 7, 0F,-1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, -0.5F); // Import Box0
		gunModel[21].setRotationPoint(-21.5F, 0F, 0.5F);

		gunModel[22].addShapeBox(14F, -8F, -4F, 1, 3, 7, 0F,-1F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box0
		gunModel[22].setRotationPoint(-20.5F, -3F, 0.5F);

		gunModel[23].addShapeBox(14F, -8F, -4F, 1, 2, 7, 0F,-0.25F, 0F, -0.5F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, -0.5F, 1F, 0F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, -0.5F); // Import Box0
		gunModel[23].setRotationPoint(-22.5F, 3F, 0.5F);

		gunModel[24].addShapeBox(14F, -8F, -4F, 1, 1, 7, 0F,1F, 0F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, -0.5F, 1.75F, 0F, -0.5F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.75F, 0F, -0.5F); // Import Box0
		gunModel[24].setRotationPoint(-22.5F, 5F, 0.5F);

		gunModel[25].addShapeBox(14F, -8F, -4F, 1, 10, 7, 0F,1.75F, 0F, -0.5F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.75F, 0F, -0.5F, 8.5F, 0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 8.5F, 0F, -0.5F); // Import Box0
		gunModel[25].setRotationPoint(-22.5F, 6F, 0.5F);

		gunModel[26].addShapeBox(14F, -8F, -4F, 1, 10, 6, 0F,1.75F, 0F, -2F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1.75F, 0F, -2F, 8.5F, 0F, -2F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 8.5F, 0F, -2F); // Import Box0
		gunModel[26].setRotationPoint(-24.5F, 6F, 1F);

		gunModel[27].addShapeBox(14F, -8F, -4F, 1, 2, 6, 0F,-0.25F, 0F, -2F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F); // Import Box0
		gunModel[27].setRotationPoint(-24.5F, 3F, 1F);

		gunModel[28].addShapeBox(14F, -8F, -4F, 1, 1, 6, 0F,1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1.75F, 0F, -2F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1.75F, 0F, -2F); // Import Box0
		gunModel[28].setRotationPoint(-24.5F, 5F, 1F);

		gunModel[29].addShapeBox(14F, -8F, -4F, 1, 3, 6, 0F,-1F, 0F, -2F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -2F, 0.75F, 0F, -2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, -2F); // Import Box0
		gunModel[29].setRotationPoint(-23.5F, 0F, 1F);

		gunModel[30].addShapeBox(14F, -8F, -4F, 1, 3, 6, 0F,-1F, 0F, -2F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F); // Import Box0
		gunModel[30].setRotationPoint(-22.5F, -3F, 1F);

		gunModel[31].addShapeBox(14F, -8F, -4F, 1, 10, 7, 0F,1.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0F, 0F, 8.5F, 0F, 0F, -4.85F, 0F, 0F, -4.85F, 0F, 0F, 8.5F, 0F, 0F); // Import Box0
		gunModel[31].setRotationPoint(-18.5F, 6F, 0.5F);

		gunModel[32].addShapeBox(14F, -8F, -4F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, -2F); // Import Box0
		gunModel[32].setRotationPoint(-33F, 16F, 1F);

		gunModel[33].addShapeBox(14F, -8F, -4F, 4, 3, 7, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -0.75F, -0.5F); // Import Box0
		gunModel[33].setRotationPoint(-31F, 16F, 0.5F);

		gunModel[34].addShapeBox(14F, -8F, -4F, 5, 3, 7, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 0F, 1.75F, 0F); // Import Box0
		gunModel[34].setRotationPoint(-27F, 16F, 0.5F);

		gunModel[35].addShapeBox(14F, -8F, -4F, 4, 1, 6, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0.5F); // Import Box0
		gunModel[35].setRotationPoint(-25F, 22F, 1F);

		gunModel[36].addShapeBox(14F, -8F, -4F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F); // Import Box0
		gunModel[36].setRotationPoint(-21F, 22F, 1F);

		gunModel[37].addShapeBox(14F, -8F, -4F, 3, 1, 6, 0F,0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.75F, -2F, -1F, 0.75F, -2F, 0F, 0F, 0F); // Import Box0
		gunModel[37].setRotationPoint(-21F, 23F, 1F);

		gunModel[38].addShapeBox(14F, -8F, -4F, 3, 1, 6, 0F,0F, -0.5F, 0F, -1F, -0.5F, -2F, -1F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F); // Import Box0
		gunModel[38].setRotationPoint(-21F, 22F, 1F);

		gunModel[39].addShapeBox(14F, -8F, -4F, 33, 1, 8, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Import Box0
		gunModel[39].setRotationPoint(-27F, -15.75F, 0F);

		gunModel[40].addShapeBox(14F, -8F, -4F, 1, 1, 7, 0F,-0.25F, -0.75F, 0F, -0.25F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.25F, -0.75F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Import Box0
		gunModel[40].setRotationPoint(-20F, -4F, 0.5F);

		gunModel[41].addShapeBox(14F, -8F, -4F, 1, 1, 7, 0F,0.5F, -0.75F, -2.25F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.5F, -0.75F, -2.25F, 0.5F, 0F, -2.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -2.5F); // Import Box0
		gunModel[41].setRotationPoint(-21F, -4F, 0.5F);

		gunModel[42].addShapeBox(14F, -8F, -4F, 1, 4, 7, 0F,-0.5F, -0.75F, 0F, -0.25F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.5F, -0.75F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0.75F, 1.5F, 0F, 0.75F, -2F, 0F, 0F); // Import Box0
		gunModel[42].setRotationPoint(-21.75F, -7.25F, 0.5F);

		gunModel[43].addShapeBox(14F, -8F, -4F, 2, 2, 3, 0F,-1.75F, -0.5F, 0.25F, 0.8F, -0.5F, 2F, 0.8F, -0.5F, 2F, -1.75F, -0.5F, 0.25F, -1.75F, 0F, -0.25F, 1.5F, 0F, 2F, 1.5F, 0F, 2F, -1.75F, 0F, -0.25F); // Import Box0
		gunModel[43].setRotationPoint(-23.25F, -5.25F, 2.5F);

		gunModel[44].addShapeBox(14F, -8F, -4F, 2, 2, 3, 0F,-1F, -0.25F, 0.25F, 0F, -0.25F, 2F, 0F, -0.25F, 2F, -1F, -0.25F, 0.25F, -1.75F, 0F, 0.25F, 0.8F, 0F, 2F, 0.8F, 0F, 2F, -1.75F, 0F, 0.25F); // Import Box0
		gunModel[44].setRotationPoint(-23.25F, -6.75F, 2.5F);

		gunModel[45].addShapeBox(14F, -8F, -4F, 1, 2, 7, 0F,-0.5F, -0.75F, 0F, -0.25F, -0.75F, 0.75F, -0.25F, -0.75F, 0.75F, -0.5F, -0.75F, 0F, -2.5F, 0.75F, 0F, 1.75F, 0.75F, 0.75F, 1.75F, 0.75F, 0.75F, -2.5F, 0.75F, 0F); // Import Box0
		gunModel[45].setRotationPoint(-23.75F, -9.25F, 0.5F);

		gunModel[46].addShapeBox(14F, -8F, -4F, 2, 2, 3, 0F,-0.5F, -0.25F, 0.25F, -1F, -0.25F, 2F, -1F, -0.25F, 2F, -0.5F, -0.25F, 0.25F, -2F, 0.25F, 0.25F, 1F, 0.25F, 2F, 1F, 0.25F, 2F, -2F, 0.25F, 0.25F); // Import Box0
		gunModel[46].setRotationPoint(-24.25F, -8.75F, 2.5F);

		gunModel[47].addShapeBox(14F, -8F, -4F, 1, 1, 7, 0F,0.5F, -0.75F, 0.75F, -1.25F, -0.75F, 0.75F, -1.25F, -0.75F, 0.75F, 0.5F, -0.75F, 0.75F, -2.5F, 0.75F, 0F, 1.75F, 0.75F, 0.75F, 1.75F, 0.75F, 0.75F, -2.5F, 0.75F, 0F); // Import Box0
		gunModel[47].setRotationPoint(-25.75F, -10.25F, 0.5F);

		gunModel[48].addShapeBox(14F, -8F, -4F, 2, 2, 3, 0F,-0.25F, -1.25F, 0.5F, -1F, -1.25F, 2.75F, -1F, -1.25F, 2.75F, -0.25F, -1.25F, 0.5F, -3.5F, 0.25F, 0.25F, 2F, 0.25F, 2F, 2F, 0.25F, 2F, -3.5F, 0.25F, 0.25F); // Import Box0
		gunModel[48].setRotationPoint(-27.25F, -10.75F, 2.5F);

		gunModel[49].addShapeBox(14F, -8F, -4F, 2, 2, 4, 0F,0F, 1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[49].setRotationPoint(-11F, 4F, 2F);

		gunModel[50].addShapeBox(14F, -8F, -4F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[50].setRotationPoint(-9F, 4.75F, 2F);

		gunModel[51].addShapeBox(14F, -8F, -4F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[51].setRotationPoint(-6F, 6.5F, 2F);

		gunModel[52].addShapeBox(14F, -8F, -4F, 2, 1, 4, 0F,0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[52].setRotationPoint(2F, 6.5F, 2F);

		gunModel[53].addShapeBox(14F, -8F, -4F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[53].setRotationPoint(3.5F, 5.5F, 2F);

		gunModel[54].addShapeBox(14F, -8F, -4F, 1, 4, 4, 0F,-1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[54].setRotationPoint(4.5F, 0F, 2F);

		gunModel[55].addShapeBox(14F, -8F, -4F, 1, 1, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[55].setRotationPoint(4.5F, 4F, 2F);

		gunModel[56].addShapeBox(14F, -8F, -4F, 1, 1, 4, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[56].setRotationPoint(5.5F, -1F, 2F);

		gunModel[57].addShapeBox(14F, -8F, -4F, 1, 1, 4, 0F,0.5F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[57].setRotationPoint(5.5F, -2F, 2F);

		gunModel[58].addShapeBox(14F, -8F, -4F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.75F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.75F, -0.5F, 0F); // Import Box0
		gunModel[58].setRotationPoint(-12F, 3F, 2F);

		gunModel[59].addShapeBox(14F, -8F, -4F, 1, 12, 8, 0F,0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.25F); // Import Box0
		gunModel[59].setRotationPoint(6F, -15F, 0F);

		gunModel[60].addShapeBox(14F, -8F, -4F, 2, 12, 8, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Import Box0
		gunModel[60].setRotationPoint(7F, -15F, 0F);

		gunModel[61].addShapeBox(14F, -8F, -4F, 2, 3, 8, 0F,0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[61].setRotationPoint(8.5F, -15F, 0F);

		gunModel[62].addShapeBox(14F, -8F, -4F, 2, 1, 9, 0F,0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[62].setRotationPoint(8.5F, -8F, -0.5F);

		gunModel[63].addShapeBox(14F, -8F, -4F, 2, 1, 9, 0F,0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[63].setRotationPoint(8.5F, -8.5F, -0.5F);

		gunModel[64].addShapeBox(14F, -8F, -4F, 2, 1, 9, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[64].setRotationPoint(8.5F, -11.5F, -0.5F);

		gunModel[65].addShapeBox(14F, -8F, -4F, 2, 1, 9, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[65].setRotationPoint(8.5F, -12F, -0.5F);

		gunModel[66].addShapeBox(14F, -8F, -4F, 2, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[66].setRotationPoint(8.5F, -7F, -0.5F);

		gunModel[67].addShapeBox(14F, -8F, -4F, 1, 4, 9, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[67].setRotationPoint(10.5F, -7F, -0.5F);

		gunModel[68].addShapeBox(14F, -8F, -4F, 1, 4, 9, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[68].setRotationPoint(11.5F, -7F, -0.5F);

		gunModel[69].addShapeBox(14F, -8F, -4F, 1, 4, 9, 0F,0F, -1F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[69].setRotationPoint(12.5F, -7F, -0.5F);

		gunModel[70].addShapeBox(14F, -8F, -4F, 1, 1, 8, 0F,0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F); // Import Box0
		gunModel[70].setRotationPoint(6F, -3.25F, 0F);

		gunModel[71].addShapeBox(14F, -8F, -4F, 3, 1, 8, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Import Box0
		gunModel[71].setRotationPoint(7F, -3.25F, 0F);

		gunModel[72].addShapeBox(14F, -8F, -4F, 1, 1, 8, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Import Box0
		gunModel[72].setRotationPoint(10F, -3.25F, 0F);

		gunModel[73].addShapeBox(14F, -8F, -4F, 3, 1, 8, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Import Box0
		gunModel[73].setRotationPoint(7F, -15.75F, 0F);

		gunModel[74].addShapeBox(14F, -8F, -4F, 1, 1, 8, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.25F); // Import Box0
		gunModel[74].setRotationPoint(6F, -15.75F, 0F);

		gunModel[75].addShapeBox(14F, -8F, -4F, 4, 7, 7, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[75].setRotationPoint(8.5F, -11F, 0.5F);

		gunModel[76].addShapeBox(14F, -8F, -4F, 38, 5, 8, 0F,0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.75F, 0F, -0.25F, 1.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[76].setRotationPoint(-27.5F, -16F, 0F);

		gunModel[77].addShapeBox(14F, -8F, -4F, 11, 3, 9, 0F,1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 1F, 0F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F); // Import Box0
		gunModel[77].setRotationPoint(12.5F, -16F, -0.5F);

		gunModel[78].addShapeBox(14F, -8F, -4F, 4, 2, 9, 0F,0.5F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Import Box0
		gunModel[78].setRotationPoint(12.5F, -13F, -0.5F);

		gunModel[79].addShapeBox(14F, -8F, -4F, 2, 1, 7, 0F,0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box0
		gunModel[79].setRotationPoint(10.5F, -4F, 0.5F);

		gunModel[80].addShapeBox(14F, -8F, -4F, 1, 3, 9, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Import Box0
		gunModel[80].setRotationPoint(16.25F, -11F, -0.5F);

		gunModel[81].addShapeBox(14F, -8F, -4F, 4, 4, 9, 0F,0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[81].setRotationPoint(12.5F, -11.5F, -1F);

		gunModel[82].addShapeBox(14F, -8F, -4F, 3, 1, 4, 0F,0.5F, 0F, 0.5F, 2.25F, 0F, 0.5F, 2.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[82].setRotationPoint(4.5F, -3F, 2F);

		gunModel[83].addShapeBox(14F, -8F, -4F, 2, 4, 9, 0F,0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Import Box0
		gunModel[83].setRotationPoint(13F, -8F, -0.5F);

		gunModel[84].addShapeBox(14F, -8F, -4F, 7, 5, 9, 0F,0F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Import Box0
		gunModel[84].setRotationPoint(16.75F, -13F, -0.5F);

		gunModel[85].addShapeBox(14F, -8F, -4F, 10, 5, 9, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, -3.5F, -0.25F, -0.25F, 0F, -0.25F); // Import Box0
		gunModel[85].setRotationPoint(14.5F, -8F, -0.5F);

		gunModel[86].addShapeBox(14F, -8F, -4F, 2, 1, 9, 0F,-0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F); // Import Box0
		gunModel[86].setRotationPoint(13F, -4F, -0.5F);

		gunModel[87].addShapeBox(14F, -8F, -4F, 1, 1, 9, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 1F, -0.25F); // Import Box0
		gunModel[87].setRotationPoint(24F, -16F, -0.5F);

		gunModel[88].addShapeBox(14F, -8F, -4F, 1, 1, 9, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[88].setRotationPoint(25F, -16F, -0.5F);

		gunModel[89].addShapeBox(14F, -8F, -4F, 10, 4, 9, 0F,0F, -3.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3.5F, 0F, 0F, -0.25F, 0.5F, -0.5F, -3.75F, 0.5F, -0.5F, -3.75F, 0.5F, 0F, -0.25F, 0.5F); // Import Box0
		gunModel[89].setRotationPoint(14.75F, -7F, -0.75F);

		gunModel[90].addShapeBox(14F, -8F, -4F, 10, 4, 9, 0F,0F, -3.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -3.5F, 0.5F, 0F, -0.25F, 0.5F, -0.5F, -3.75F, 0.5F, -0.5F, -3.75F, 0.5F, 0F, -0.25F, 0.5F); // Import Box0
		gunModel[90].setRotationPoint(14.75F, -6.75F, -0.75F);

		gunModel[91].addShapeBox(14F, -8F, -4F, 10, 4, 9, 0F,0F, -3.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -3.5F, 0.5F, 0F, -0.25F, 0F, -0.5F, -3.75F, 0F, -0.5F, -3.75F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[91].setRotationPoint(14.75F, -6.5F, -0.75F);

		gunModel[92].addShapeBox(14F, -8F, -4F, 1, 4, 9, 0F,-0.75F, -3.75F, -0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -0.75F, -3.75F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.5F, 0F, 0F); // Import Box0
		gunModel[92].setRotationPoint(13.75F, -7F, -0.75F);

		gunModel[93].addShapeBox(14F, -8F, -4F, 1, 4, 9, 0F,-0.5F, -3.75F, 0F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, -0.5F, -3.75F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.5F, 0F, 0F); // Import Box0
		gunModel[93].setRotationPoint(13.75F, -6.75F, -0.75F);

		gunModel[94].addShapeBox(14F, -8F, -4F, 1, 4, 9, 0F,-0.5F, -3.75F, 0F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, -0.5F, -3.75F, 0F, -0.75F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, -1F); // Import Box0
		gunModel[94].setRotationPoint(13.75F, -6.5F, -0.75F);

		gunModel[95].addShapeBox(14F, -8F, -4F, 1, 4, 9, 0F,0F, -3.5F, 0F, -0.75F, -3.25F, -0.5F, -0.75F, -3.25F, -0.5F, 0F, -3.5F, 0F, 0F, -0.25F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0.5F); // Import Box0
		gunModel[95].setRotationPoint(24.25F, -10.5F, -0.75F);

		gunModel[96].addShapeBox(14F, -8F, -4F, 1, 4, 9, 0F,0F, -3.5F, 0.5F, -0.5F, -3.25F, 0F, -0.5F, -3.25F, 0F, 0F, -3.5F, 0.5F, 0F, -0.25F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0.5F); // Import Box0
		gunModel[96].setRotationPoint(24.25F, -10.25F, -0.75F);

		gunModel[97].addShapeBox(14F, -8F, -4F, 1, 4, 9, 0F,0F, -3.5F, 0.5F, -0.5F, -3.25F, 0F, -0.5F, -3.25F, 0F, 0F, -3.5F, 0.5F, 0F, -0.25F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.25F, 0F); // Import Box0
		gunModel[97].setRotationPoint(24.25F, -10F, -0.75F);

		gunModel[98].addShapeBox(14F, -8F, -4F, 55, 3, 7, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[98].setRotationPoint(-28F, -19F, 0.5F);

		gunModel[99].addShapeBox(14F, -8F, -4F, 55, 1, 1, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[99].setRotationPoint(-28F, -17F, -0.75F);

		gunModel[100].addShapeBox(14F, -8F, -4F, 55, 1, 1, 0F,0F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[100].setRotationPoint(-28F, -18.5F, -0.75F);

		gunModel[101].addShapeBox(14F, -8F, -4F, 55, 1, 1, 0F,0F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[101].setRotationPoint(-28F, -18.75F, -0.75F);

		gunModel[102].addShapeBox(14F, -8F, -4F, 42, 3, 8, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[102].setRotationPoint(-25F, -22F, 0F);

		gunModel[103].addShapeBox(14F, -8F, -4F, 55, 1, 1, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[103].setRotationPoint(-28F, -17F, 7.75F);

		gunModel[104].addShapeBox(14F, -8F, -4F, 55, 1, 1, 0F,0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[104].setRotationPoint(-28F, -18.5F, 7.75F);

		gunModel[105].addShapeBox(14F, -8F, -4F, 52, 1, 1, 0F,0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0.5F, 0F, -1F, 0.5F); // Import Box0
		gunModel[105].setRotationPoint(-25F, -18.75F, 7.75F);

		gunModel[106].addShapeBox(14F, -8F, -4F, 10, 3, 10, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[106].setRotationPoint(17.5F, -22F, -1F);

		gunModel[107].addShapeBox(14F, -8F, -4F, 51, 1, 10, 0F,0F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[107].setRotationPoint(-24F, -22F, -0.75F);

		gunModel[108].addShapeBox(14F, -8F, -4F, 52, 1, 10, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Import Box0
		gunModel[108].setRotationPoint(-25F, -23.5F, -1.25F);

		gunModel[109].addShapeBox(14F, -8F, -4F, 52, 1, 6, 0F,0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[109].setRotationPoint(-25F, -24.5F, 2.25F);

		gunModel[110].addShapeBox(14F, -8F, -4F, 54, 1, 5, 0F,0F, 0F, -1F, 0.5F, 0F, -1.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F); // Import Box0
		gunModel[110].setRotationPoint(-27F, -25.5F, 2.25F);

		gunModel[111].addShapeBox(14F, -8F, -4F, 62, 1, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 1F, 0F, 0.5F, 1F); // Import Box0
		gunModel[111].setRotationPoint(-27F, -28.75F, 3.65F);

		gunModel[112].addShapeBox(14F, -8F, -4F, 1, 2, 3, 0F,0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[112].setRotationPoint(-5F, 0.5F, 2.5F);

		gunModel[113].addShapeBox(14F, -8F, -4F, 1, 2, 3, 0F,-0.25F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[113].setRotationPoint(-5F, -1.5F, 2.5F);

		gunModel[114].addShapeBox(14F, -8F, -4F, 1, 1, 3, 0F,0.25F, 0.5F, -0.25F, 1.5F, 0.5F, -0.25F, 1.5F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.75F, 0F, -0.25F); // Import Box0
		gunModel[114].setRotationPoint(-4F, -2.5F, 2.5F);

		gunModel[115].addShapeBox(14F, -8F, -4F, 1, 2, 3, 0F,0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Import Box0
		gunModel[115].setRotationPoint(-5F, 2.5F, 2.5F);

		gunModel[116].addShapeBox(14F, -8F, -4F, 1, 2, 3, 0F,0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, -1.25F, -0.25F, -0.25F, 1.25F, -0.75F, -0.25F, 1.25F, -0.75F, -0.25F, -1.25F, -0.25F, -0.25F); // Import Box0
		gunModel[116].setRotationPoint(-4F, 4.5F, 2.5F);

		gunModel[117].addShapeBox(14F, -8F, -4F, 87, 1, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[117].setRotationPoint(-27F, -27F, 3.65F);

		gunModel[118].addShapeBox(14F, -8F, -4F, 54, 2, 3, 0F,0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[118].setRotationPoint(-27F, -27F, 3.5F);

		gunModel[119].addShapeBox(14F, -8F, -4F, 62, 1, 4, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F); // Import Box0
		gunModel[119].setRotationPoint(-27F, -30.25F, 1.65F);

		gunModel[120].addShapeBox(14F, -8F, -4F, 62, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[120].setRotationPoint(-27F, -31.25F, 2.15F);

		gunModel[121].addShapeBox(14F, -8F, -4F, 3, 1, 4, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 1F, 0F, 0.5F, 1F); // Import Box0
		gunModel[121].setRotationPoint(57F, -28.75F, 1.65F);

		gunModel[122].addShapeBox(14F, -8F, -4F, 20, 1, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[122].setRotationPoint(40F, -31.25F, 2.15F);

		gunModel[123].addShapeBox(14F, -8F, -4F, 20, 1, 4, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F); // Import Box0
		gunModel[123].setRotationPoint(40F, -30.25F, 1.65F);

		gunModel[124].addShapeBox(14F, -8F, -4F, 22, 1, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box0
		gunModel[124].setRotationPoint(35F, -28.75F, 1.65F);

		gunModel[125].addShapeBox(14F, -8F, -4F, 5, 1, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Import Box0
		gunModel[125].setRotationPoint(35F, -30.25F, 1.65F);

		gunModel[126].addShapeBox(14F, -8F, -4F, 5, 1, 1, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box0
		gunModel[126].setRotationPoint(35F, -31.25F, 2.15F);

		gunModel[127].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[127].setRotationPoint(39F, -31.25F, 4.15F);

		gunModel[128].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F); // Import Box0
		gunModel[128].setRotationPoint(35F, -31.25F, 4.15F);

		gunModel[129].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,-1F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.35F, -0.5F, -0.5F, -0.1F, -1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.35F, -0.5F, 0F, -0.1F); // Import Box0
		gunModel[129].setRotationPoint(39F, -31.25F, 4F);

		gunModel[130].addShapeBox(14F, -8F, -4F, 22, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Import Box0
		gunModel[130].setRotationPoint(35F, -28.75F, 4.15F);

		gunModel[131].addShapeBox(14F, -8F, -4F, 22, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Import Box0
		gunModel[131].setRotationPoint(35F, -30.25F, 4.15F);

		gunModel[132].addShapeBox(14F, -8F, -4F, 7, 1, 4, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Import Box0
		gunModel[132].setRotationPoint(60F, -28.65F, 2F);

		gunModel[133].addShapeBox(14F, -8F, -4F, 7, 1, 4, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Import Box0
		gunModel[133].setRotationPoint(60F, -27.15F, 2F);

		gunModel[134].addShapeBox(14F, -8F, -4F, 7, 1, 2, 0F,0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Import Box0
		gunModel[134].setRotationPoint(60F, -26.15F, 3F);

		gunModel[135].addShapeBox(14F, -8F, -4F, 7, 1, 4, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Import Box0
		gunModel[135].setRotationPoint(60F, -30.15F, 2F);

		gunModel[136].addShapeBox(14F, -8F, -4F, 7, 1, 2, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Import Box0
		gunModel[136].setRotationPoint(60F, -31.15F, 3F);

		gunModel[137].addShapeBox(14F, -8F, -4F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F); // Import Box0
		gunModel[137].setRotationPoint(69F, -28.75F, 2.13F);

		gunModel[138].addShapeBox(14F, -8F, -4F, 2, 1, 4, 0F,0F, 0.25F, 0.25F, 0F, 0.1F, -0.13F, 0F, 0.1F, -0.13F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.15F, -0.13F, 0F, 0.15F, -0.13F, 0F, 0.25F, 0.25F); // Import Box0
		gunModel[138].setRotationPoint(67F, -28.65F, 2F);

		gunModel[139].addShapeBox(14F, -8F, -4F, 2, 1, 4, 0F,0F, -0.25F, -0.5F, 0F, -0.65F, -0.63F, 0F, -0.65F, -0.63F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.4F, -0.13F, 0F, 0.4F, -0.13F, 0F, 0.25F, 0.25F); // Import Box0
		gunModel[139].setRotationPoint(67F, -30.15F, 2F);

		gunModel[140].addShapeBox(14F, -8F, -4F, 2, 1, 2, 0F,0F, -0.75F, -0.25F, 0F, -1.15F, -0.37F, 0F, -1.15F, -0.37F, 0F, -0.75F, -0.25F, 0F, 0.25F, 0.5F, 0F, 0.65F, 0.37F, 0F, 0.65F, 0.37F, 0F, 0.25F, 0.5F); // Import Box0
		gunModel[140].setRotationPoint(67F, -31.15F, 3F);

		gunModel[141].addShapeBox(14F, -8F, -4F, 7, 1, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F); // Import Box0
		gunModel[141].setRotationPoint(69F, -30F, 2.13F);

		gunModel[142].addShapeBox(14F, -8F, -4F, 7, 1, 3, 0F,0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[142].setRotationPoint(69F, -30.5F, 2.13F);

		gunModel[143].addShapeBox(14F, -8F, -4F, 7, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[143].setRotationPoint(69F, -27.25F, 2.13F);

		gunModel[144].addShapeBox(14F, -8F, -4F, 7, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box0
		gunModel[144].setRotationPoint(69F, -26.75F, 2.13F);

		gunModel[145].addShapeBox(14F, -8F, -4F, 2, 1, 4, 0F,0F, 0.3F, 0.25F, 0F, 0.4F, -0.13F, 0F, 0.4F, -0.13F, 0F, 0.3F, 0.25F, 0F, -0.3F, -0.5F, 0F, -0.65F, -0.63F, 0F, -0.65F, -0.63F, 0F, -0.3F, -0.5F); // Import Box0
		gunModel[145].setRotationPoint(67F, -27.1F, 2F);

		gunModel[146].addShapeBox(14F, -8F, -4F, 2, 1, 2, 0F,0F, 0.3F, 0.45F, 0F, 0.65F, 0.37F, 0F, 0.65F, 0.37F, 0F, 0.3F, 0.45F, 0F, -0.8F, -0.25F, 0F, -1.15F, -0.37F, 0F, -1.15F, -0.37F, 0F, -0.8F, -0.25F); // Import Box0
		gunModel[146].setRotationPoint(67F, -26.1F, 3F);

		gunModel[147].addShapeBox(14F, -8F, -4F, 1, 6, 8, 0F,-0.5F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, -0.25F); // Import Box0
		gunModel[147].setRotationPoint(-28F, -15F, 0F);

		gunModel[148].addShapeBox(14F, -8F, -4F, 1, 1, 8, 0F,-1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, -0.25F); // Import Box0
		gunModel[148].setRotationPoint(-28F, -15.75F, 0F);

		gunModel[149].addShapeBox(14F, -8F, -4F, 4, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[149].setRotationPoint(75F, -25F, 2.5F);

		gunModel[150].addShapeBox(14F, -8F, -4F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[150].setRotationPoint(75F, -28.5F, 1F);

		gunModel[151].addShapeBox(14F, -8F, -4F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[151].setRotationPoint(75F, -26.5F, 1F);

		gunModel[152].addShapeBox(14F, -8F, -4F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[152].setRotationPoint(75F, -25.5F, 1.5F);

		gunModel[153].addShapeBox(14F, -8F, -4F, 4, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[153].setRotationPoint(75F, -29.5F, 1F);

		gunModel[154].addShapeBox(14F, -8F, -4F, 4, 1, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[154].setRotationPoint(75F, -30.5F, 1.5F);

		gunModel[155].addShapeBox(14F, -8F, -4F, 4, 1, 1, 0F,0F, -0.65F, -1F, 0F, -0.65F, -1F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[155].setRotationPoint(75F, -25.5F, 4.5F);

		gunModel[156].addShapeBox(14F, -8F, -4F, 4, 1, 1, 0F,0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, -1F, 0F, -0.65F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[156].setRotationPoint(75F, -25.5F, 2.5F);

		gunModel[157].addShapeBox(14F, -8F, -4F, 4, 2, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[157].setRotationPoint(75F, -32.5F, 2.5F);

		gunModel[158].addShapeBox(14F, -8F, -4F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -1F, 0F, -0.65F, -1F, 0F, -0.65F, 0F, 0F, -0.65F, 0F); // Import Box0
		gunModel[158].setRotationPoint(75F, -30.5F, 4.5F);

		gunModel[159].addShapeBox(14F, -8F, -4F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, -1F, 0F, -0.65F, -1F); // Import Box0
		gunModel[159].setRotationPoint(75F, -30.5F, 2.5F);

		gunModel[160].addShapeBox(14F, -8F, -4F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[160].setRotationPoint(75F, -36F, 1F);

		gunModel[161].addShapeBox(14F, -8F, -4F, 4, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[161].setRotationPoint(75F, -35F, 5F);

		gunModel[162].addShapeBox(14F, -8F, -4F, 4, 1, 3, 0F,0F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, -0.15F, 0F, -2F, -0.15F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[162].setRotationPoint(75F, -38F, 3.5F);

		gunModel[163].addShapeBox(14F, -8F, -4F, 4, 1, 1, 0F,0F, -0.65F, -1F, 0F, -0.65F, -1F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[163].setRotationPoint(75F, -34F, 4.5F);

		gunModel[164].addShapeBox(14F, -8F, -4F, 4, 1, 1, 0F,0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, -1F, 0F, -0.65F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[164].setRotationPoint(75F, -34F, 2.5F);

		gunModel[165].addShapeBox(14F, -8F, -4F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[165].setRotationPoint(75F, -35F, 1F);

		gunModel[166].addShapeBox(14F, -8F, -4F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[166].setRotationPoint(75F, -36F, 6F);

		gunModel[167].addShapeBox(14F, -8F, -4F, 4, 1, 2, 0F,0F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[167].setRotationPoint(75F, -37F, 5F);

		gunModel[168].addShapeBox(14F, -8F, -4F, 4, 1, 2, 0F,0F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[168].setRotationPoint(75F, -37F, 1F);

		gunModel[169].addShapeBox(14F, -8F, -4F, 4, 1, 3, 0F,0F, 0F, -1.5F, -0.45F, 0F, -1.5F, -0.45F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[169].setRotationPoint(75F, -38F, 1.5F);

		gunModel[170].addShapeBox(14F, -8F, -4F, 4, 1, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[170].setRotationPoint(75F, -34F, 3.5F);

		gunModel[171].addShapeBox(14F, -8F, -4F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[171].setRotationPoint(75F, -34F, 1.5F);

		gunModel[172].addShapeBox(14F, -8F, -4F, 4, 1, 3, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -1.49F, 0F, 0F, -1.49F, 0F, 0F, -1.49F, 0F, 0F, -1.49F); // Import Box0
		gunModel[172].setRotationPoint(75F, -34F, 2.5F);

		gunModel[173].addShapeBox(14F, -8F, -4F, 4, 1, 3, 0F,0F, 0F, -1.49F, -0.45F, 0F, -1.49F, -0.45F, 0F, -1.49F, 0F, 0F, -1.49F, 0F, -0.5F, -0.75F, -0.3F, -0.5F, -0.75F, -0.3F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Import Box0
		gunModel[173].setRotationPoint(75F, -38F, 2.5F);

		gunModel[174].addShapeBox(14F, -8F, -4F, 1, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[174].setRotationPoint(76.5F, -34F, 2.5F);

		gunModel[175].addShapeBox(14F, -8F, -4F, 1, 1, 2, 0F,0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[175].setRotationPoint(76.5F, -34.5F, 3F);

		gunModel[176].addShapeBox(14F, -8F, -4F, 1, 2, 2, 0F,0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F); // Import Box0
		gunModel[176].setRotationPoint(76.5F, -36.5F, 3F);

		gunModel[177].addShapeBox(14F, -8F, -4F, 3, 4, 1, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[177].setRotationPoint(70.5F, -29F, 2F);

		gunModel[178].addShapeBox(14F, -8F, -4F, 3, 1, 4, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Import Box0
		gunModel[178].setRotationPoint(70.5F, -30F, 2F);

		gunModel[179].addShapeBox(14F, -8F, -4F, 3, 1, 4, 0F,0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Import Box0
		gunModel[179].setRotationPoint(70.5F, -31F, 2F);

		gunModel[180].addShapeBox(14F, -8F, -4F, 3, 4, 1, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[180].setRotationPoint(70.5F, -29F, 5F);

		gunModel[181].addShapeBox(14F, -8F, -4F, 11, 5, 9, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[181].setRotationPoint(-38F, -15F, -0.5F);

		gunModel[182].addShapeBox(14F, -8F, -4F, 11, 1, 9, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[182].setRotationPoint(-38F, -10.5F, -0.5F);

		gunModel[183].addShapeBox(14F, -8F, -4F, 45, 2, 9, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[183].setRotationPoint(-96F, -19F, -0.5F);

		gunModel[184].addShapeBox(14F, -8F, -4F, 15, 24, 9, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -5.5F, 0.25F, -0.5F, -5.5F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[184].setRotationPoint(-96F, -17.5F, -0.5F);

		gunModel[185].addShapeBox(14F, -8F, -4F, 2, 5, 9, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -2F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -2F, 0.25F); // Import Box0
		gunModel[185].setRotationPoint(-40F, -15F, -0.5F);

		gunModel[186].addShapeBox(14F, -8F, -4F, 2, 3, 9, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F); // Import Box0
		gunModel[186].setRotationPoint(-42F, -15F, -0.5F);

		gunModel[187].addShapeBox(14F, -8F, -4F, 9, 7, 9, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, -3F, 0.25F, 0F, -3F, 0.25F, 0F, 0.5F, 0.25F); // Import Box0
		gunModel[187].setRotationPoint(-81.5F, -6.5F, -0.5F);

		gunModel[188].addShapeBox(14F, -8F, -4F, 27, 15, 9, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -10.5F, 0.25F, 0F, -10.5F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[188].setRotationPoint(-72.5F, -17.5F, -0.5F);

		gunModel[189].addShapeBox(14F, -8F, -4F, 45, 2, 9, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[189].setRotationPoint(-96F, -21F, -0.5F);

		gunModel[190].addShapeBox(14F, -8F, -4F, 45, 1, 9, 0F,0F, 0F, -2.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[190].setRotationPoint(-96F, -22F, -0.5F);

		gunModel[191].addShapeBox(14F, -8F, -4F, 2, 2, 9, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[191].setRotationPoint(-44F, -15F, -0.5F);

		gunModel[192].addShapeBox(14F, -8F, -4F, 2, 2, 9, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box0
		gunModel[192].setRotationPoint(-46F, -15F, -0.5F);

		gunModel[193].addShapeBox(14F, -8F, -4F, 27, 2, 9, 0F,0F, 0F, 0.25F, 0F, 10.5F, 0.25F, 0F, 10.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -10.5F, -0.25F, 0F, -10.5F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[193].setRotationPoint(-72.5F, -2.5F, -0.5F);

		gunModel[194].addShapeBox(14F, -8F, -4F, 27, 2, 8, 0F,0F, 0F, 0.25F, 0F, 10.5F, 0.25F, 0F, 10.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -10.5F, -0.75F, 0F, -10.5F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[194].setRotationPoint(-72.5F, -0.5F, 0F);

		gunModel[195].addShapeBox(14F, -8F, -4F, 27, 1, 6, 0F,0F, 0F, 0.25F, 0F, 10.5F, 0.25F, 0F, 10.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, -10.5F, -1.25F, 0F, -10.5F, -1.25F, 0F, 0F, -1.25F); // Import Box0
		gunModel[195].setRotationPoint(-72.5F, 1.5F, 1F);

		gunModel[196].addShapeBox(14F, -8F, -4F, 9, 2, 9, 0F,0F, 0F, 0.25F, 0F, 3.5F, 0.25F, 0F, 3.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[196].setRotationPoint(-81.5F, 1F, -0.5F);

		gunModel[197].addShapeBox(14F, -8F, -4F, 9, 2, 8, 0F,0F, 0F, 0.25F, 0F, 3.5F, 0.25F, 0F, 3.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -3.5F, -0.75F, 0F, -3.5F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[197].setRotationPoint(-81.5F, 3F, 0F);

		gunModel[198].addShapeBox(14F, -8F, -4F, 9, 1, 6, 0F,0F, 0F, 0.25F, 0F, 3.5F, 0.25F, 0F, 3.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, -3.5F, -1.25F, 0F, -3.5F, -1.25F, 0F, 0F, -1.25F); // Import Box0
		gunModel[198].setRotationPoint(-81.5F, 5F, 1F);

		gunModel[199].addShapeBox(14F, -8F, -4F, 14, 2, 9, 0F,0F, -0.5F, 0.25F, 0.5F, 5F, 0.25F, 0.5F, 5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.25F, 0.5F, -5F, -0.25F, 0.5F, -5F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[199].setRotationPoint(-96F, 6F, -0.5F);

		gunModel[200].addShapeBox(14F, -8F, -4F, 14, 2, 8, 0F,0F, 0F, 0.25F, 0.5F, 5F, 0.25F, 0.5F, 5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0.5F, -5F, -0.75F, 0.5F, -5F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[200].setRotationPoint(-96F, 8F, 0F);

		gunModel[201].addShapeBox(14F, -8F, -4F, 14, 1, 6, 0F,0F, 0F, 0.25F, 0.5F, 5F, 0.25F, 0.5F, 5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0.5F, -5F, -1.25F, 0.5F, -5F, -1.25F, 0F, 0F, -1.25F); // Import Box0
		gunModel[201].setRotationPoint(-96F, 10F, 1F);

		gunModel[202].addShapeBox(14F, -8F, -4F, 2, 1, 9, 0F,0F, 1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1.5F, 0.25F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F); // Import Box0
		gunModel[202].setRotationPoint(-40F, -10.5F, -0.5F);

		gunModel[203].addShapeBox(14F, -8F, -4F, 2, 1, 9, 0F,0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F); // Import Box0
		gunModel[203].setRotationPoint(-42F, -12F, -0.5F);

		gunModel[204].addShapeBox(14F, -8F, -4F, 2, 1, 8, 0F,0F, 1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1.5F, 0.25F, 0F, -2F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -2F, -0.25F); // Import Box0
		gunModel[204].setRotationPoint(-40F, -9.5F, 0F);

		gunModel[205].addShapeBox(14F, -8F, -4F, 2, 1, 9, 0F,0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[205].setRotationPoint(-44F, -12.5F, -0.5F);

		gunModel[206].addShapeBox(14F, -8F, -4F, 2, 1, 9, 0F,-0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.5F, -0.25F); // Import Box0
		gunModel[206].setRotationPoint(-46F, -12.5F, -0.5F);

		gunModel[207].addShapeBox(14F, -8F, -4F, 2, 1, 8, 0F,0F, 1F, 0.25F, 0F, 1.25F, 0.25F, 0F, 1.25F, 0.25F, 0F, 1F, 0.25F, 0F, -0.75F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.75F, -0.25F); // Import Box0
		gunModel[207].setRotationPoint(-44F, -10.5F, 0F);

		gunModel[208].addShapeBox(14F, -8F, -4F, 2, 1, 8, 0F,0F, 1.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 1.25F, 0.25F, 0F, -1.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1.5F, -0.25F); // Import Box0
		gunModel[208].setRotationPoint(-42F, -10.5F, 0F);

		gunModel[209].addShapeBox(14F, -8F, -4F, 2, 1, 8, 0F,-0.5F, 1F, 0.25F, 0F, 1.5F, 0.25F, 0F, 1.5F, 0.25F, -0.5F, 1F, 0.25F, -0.5F, 0F, -0.75F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[209].setRotationPoint(-46F, -10F, 0F);

		gunModel[210].addShapeBox(14F, -8F, -4F, 2, 1, 8, 0F,0F, 1.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 1.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.25F, -1.25F); // Import Box0
		gunModel[210].setRotationPoint(-42F, -9.75F, 0F);

		gunModel[211].addShapeBox(14F, -8F, -4F, 2, 1, 8, 0F,0F, 0.5F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, -1.75F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -0.25F, -1.75F); // Import Box0
		gunModel[211].setRotationPoint(-44F, -9.75F, 0F);

		gunModel[212].addShapeBox(14F, -8F, -4F, 2, 1, 8, 0F,-0.5F, 0.25F, -0.75F, 0F, 1.5F, -0.25F, 0F, 1.5F, -0.25F, -0.5F, 0.25F, -0.75F, -0.5F, -0.25F, -2.25F, 0F, -1.25F, -1.75F, 0F, -1.25F, -1.75F, -0.5F, -0.25F, -2.25F); // Import Box0
		gunModel[212].setRotationPoint(-46F, -8.75F, 0F);

		gunModel[213].addShapeBox(14F, -8F, -4F, 9, 11, 8, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[213].setRotationPoint(-81.5F, -17.5F, -0.5F);

		gunModel[214].addShapeBox(14F, -8F, -4F, 4, 2, 9, 0F,0F, 0F, 0.25F, -0.5F, 1F, 0.25F, -0.5F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[214].setRotationPoint(-51.5F, -19F, -0.5F);

		gunModel[215].addShapeBox(14F, -8F, -4F, 4, 2, 9, 0F,0F, 0F, -0.75F, -0.5F, 1F, -0.75F, -0.5F, 1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[215].setRotationPoint(-51.5F, -21F, -0.5F);

		gunModel[216].addShapeBox(14F, -8F, -4F, 3, 3, 9, 0F,0F, 0F, 0.25F, -0.5F, 1.5F, 0.25F, -0.5F, 1.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[216].setRotationPoint(-48F, -20F, -0.5F);

		gunModel[217].addShapeBox(14F, -8F, -4F, 3, 2, 9, 0F,0F, 0F, -0.75F, -0.5F, 1.5F, -0.75F, -0.5F, 1.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, -1.5F, 0.25F, -0.5F, -1.5F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[217].setRotationPoint(-48F, -22F, -0.5F);

		gunModel[218].addShapeBox(14F, -8F, -4F, 4, 1, 9, 0F,0F, 0F, -2.25F, -0.5F, 1F, -2.25F, -0.5F, 1F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, -1F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[218].setRotationPoint(-51.5F, -22F, -0.5F);

		gunModel[219].addShapeBox(14F, -8F, -4F, 3, 1, 9, 0F,-0.5F, -0.25F, -2.25F, 0F, 1.25F, -2.25F, 0F, 1.25F, -2.25F, -0.5F, -0.25F, -2.25F, -0.5F, 0.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, -1.25F, -0.75F, -0.5F, 0.25F, -0.75F); // Import Box0
		gunModel[219].setRotationPoint(-48.5F, -23.25F, -0.5F);

		gunModel[220].addShapeBox(14F, -8F, -4F, 3, 7, 9, 0F,0F, 0.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Import Box0
		gunModel[220].setRotationPoint(-45.5F, -21F, -0.5F);

		gunModel[221].addShapeBox(14F, -8F, -4F, 6, 2, 9, 0F,0F, 0F, -0.75F, 0F, 4F, -0.75F, 0F, 4F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, -4F, 0.25F, 0F, -4F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[221].setRotationPoint(-45.5F, -23.5F, -0.5F);

		gunModel[222].addShapeBox(14F, -8F, -4F, 6, 1, 9, 0F,0F, -0.25F, -2.25F, 0F, 3.75F, -2.25F, 0F, 3.75F, -2.25F, 0F, -0.25F, -2.25F, 0F, 0.25F, -0.75F, 0F, -3.75F, -0.75F, 0F, -3.75F, -0.75F, 0F, 0.25F, -0.75F); // Import Box0
		gunModel[222].setRotationPoint(-45.5F, -24.75F, -0.5F);

		gunModel[223].addShapeBox(14F, -8F, -4F, 3, 9, 9, 0F,0F, 0.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Import Box0
		gunModel[223].setRotationPoint(-42.5F, -23F, -0.5F);

		gunModel[224].addShapeBox(14F, -8F, -4F, 3, 11, 9, 0F,0F, 0.5F, 0.25F, 0F, 2F, 0.25F, 0F, 2F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Import Box0
		gunModel[224].setRotationPoint(-39.5F, -25F, -0.5F);

		gunModel[225].addShapeBox(14F, -8F, -4F, 3, 2, 9, 0F,0F, 0F, -0.75F, 0F, 1.5F, -0.75F, 0F, 1.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[225].setRotationPoint(-39.5F, -27.5F, -0.5F);

		gunModel[226].addShapeBox(14F, -8F, -4F, 3, 1, 9, 0F,0F, -0.25F, -2.25F, 0F, 1.25F, -2.25F, 0F, 1.25F, -2.25F, 0F, -0.25F, -2.25F, 0F, 0.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, 0.25F, -0.75F); // Import Box0
		gunModel[226].setRotationPoint(-39.5F, -28.75F, -0.5F);

		gunModel[227].addShapeBox(14F, -8F, -4F, 3, 13, 9, 0F,0F, 0.5F, 0.25F, 0.5F, 2F, 0.25F, 0.5F, 2F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1.5F, 0.25F, 0.5F, -1.5F, 0.25F, 0.5F, -1.5F, 0.25F, 0F, -1.5F, 0.25F); // Import Box0
		gunModel[227].setRotationPoint(-36.5F, -26.5F, -0.5F);

		gunModel[228].addShapeBox(14F, -8F, -4F, 3, 2, 9, 0F,0F, 0F, -0.75F, 0.5F, 1.5F, -0.75F, 0.5F, 1.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0.5F, -1.5F, 0.25F, 0.5F, -1.5F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[228].setRotationPoint(-36.5F, -29F, -0.5F);

		gunModel[229].addShapeBox(14F, -8F, -4F, 3, 1, 9, 0F,0F, -0.25F, -2.25F, 0.5F, 1.25F, -2.25F, 0.5F, 1.25F, -2.25F, 0F, -0.25F, -2.25F, 0F, 0.25F, -0.75F, 0.5F, -1.25F, -0.75F, 0.5F, -1.25F, -0.75F, 0F, 0.25F, -0.75F); // Import Box0
		gunModel[229].setRotationPoint(-36.5F, -30.25F, -0.5F);

		gunModel[230].addShapeBox(14F, -8F, -4F, 6, 13, 9, 0F,-0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box0
		gunModel[230].setRotationPoint(-33.5F, -28F, -0.5F);

		gunModel[231].addShapeBox(14F, -8F, -4F, 5, 2, 9, 0F,0F, 0.5F, -0.75F, 0.5F, 0.5F, -0.75F, 0.5F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[231].setRotationPoint(-33F, -30F, -0.5F);

		gunModel[232].addShapeBox(14F, -8F, -4F, 5, 1, 9, 0F,0F, 0.25F, -2.25F, 0.5F, 0.25F, -2.25F, 0.5F, 0.25F, -2.25F, 0F, 0.25F, -2.25F, 0F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Import Box0
		gunModel[232].setRotationPoint(-33F, -31.25F, -0.5F);

		gunModel[233].addShapeBox(14F, -8F, -4F, 1, 2, 9, 0F,0F, 0.5F, -0.75F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[233].setRotationPoint(-27.5F, -30F, -0.5F);

		gunModel[234].addShapeBox(14F, -8F, -4F, 1, 1, 9, 0F,0F, 0.25F, -2.25F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, 0.25F, -2.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.75F); // Import Box0
		gunModel[234].setRotationPoint(-27.5F, -31.25F, -0.5F);

		gunModel[235].addShapeBox(14F, -8F, -4F, 1, 3, 9, 0F,0F, 0.5F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[235].setRotationPoint(-27.5F, -28F, -0.5F);

		gunModel[236].addShapeBox(14F, -8F, -4F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[236].setRotationPoint(-35.5F, -22.5F, -2.75F);

		gunModel[237].addShapeBox(14F, -8F, -4F, 10, 1, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[237].setRotationPoint(-35.5F, -23.5F, -2.75F);

		gunModel[238].addShapeBox(14F, -8F, -4F, 10, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[238].setRotationPoint(-35.5F, -24.5F, -2.75F);

		gunModel[239].addShapeBox(14F, -8F, -4F, 7, 1, 2, 0F,-1.25F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[239].setRotationPoint(-42.5F, -23.5F, -2.75F);

		gunModel[240].addShapeBox(14F, -8F, -4F, 7, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[240].setRotationPoint(-42.5F, -22.5F, -2.75F);

		gunModel[241].addShapeBox(14F, -8F, -4F, 6, 1, 2, 0F,-6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -6F, 0F, 0F, -0.25F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[241].setRotationPoint(-41.5F, -24.5F, -2.75F);

		gunModel[242].addShapeBox(14F, -8F, -4F, 6, 1, 2, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -2F); // Import Box0
		gunModel[242].setRotationPoint(-41.5F, -24.5F, 8.75F);

		gunModel[243].addShapeBox(14F, -8F, -4F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[243].setRotationPoint(-35.5F, -18.5F, -2.75F);

		gunModel[244].addShapeBox(14F, -8F, -4F, 10, 1, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[244].setRotationPoint(-35.5F, -17.5F, -2.75F);

		gunModel[245].addShapeBox(14F, -8F, -4F, 7, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Import Box0
		gunModel[245].setRotationPoint(-42.5F, -18.5F, -2.75F);

		gunModel[246].addShapeBox(14F, -8F, -4F, 6, 1, 2, 0F,-0.25F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -6F, 0F, 0F); // Import Box0
		gunModel[246].setRotationPoint(-41.5F, -17.5F, -2.75F);

		gunModel[247].addShapeBox(14F, -8F, -4F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[247].setRotationPoint(-35.5F, -22.5F, 8.75F);

		gunModel[248].addShapeBox(14F, -8F, -4F, 7, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box0
		gunModel[248].setRotationPoint(-42.5F, -22.5F, 8.75F);

		gunModel[249].addShapeBox(14F, -8F, -4F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[249].setRotationPoint(-35.5F, -23.5F, 8.75F);

		gunModel[250].addShapeBox(14F, -8F, -4F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[250].setRotationPoint(-35.5F, -24.5F, 8.75F);

		gunModel[251].addShapeBox(14F, -8F, -4F, 7, 1, 2, 0F,-1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.25F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box0
		gunModel[251].setRotationPoint(-42.5F, -23.5F, 8.75F);

		gunModel[252].addShapeBox(14F, -8F, -4F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[252].setRotationPoint(-35.5F, -18.5F, 8.75F);

		gunModel[253].addShapeBox(14F, -8F, -4F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box0
		gunModel[253].setRotationPoint(-35.5F, -17.5F, 8.75F);

		gunModel[254].addShapeBox(14F, -8F, -4F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.25F, 0F, -2F); // Import Box0
		gunModel[254].setRotationPoint(-42.5F, -18.5F, 8.75F);

		gunModel[255].addShapeBox(14F, -8F, -4F, 6, 1, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, -2F); // Import Box0
		gunModel[255].setRotationPoint(-41.5F, -17.5F, 8.75F);

		gunModel[256].addShapeBox(14F, -8F, -4F, 2, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[256].setRotationPoint(-25.5F, -22.5F, -2.75F);

		gunModel[257].addShapeBox(14F, -8F, -4F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -1.25F); // Import Box0
		gunModel[257].setRotationPoint(-25.5F, -18.5F, -2.75F);

		gunModel[258].addShapeBox(14F, -8F, -4F, 2, 1, 13, 0F,0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, -1.5F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.75F, 0F, 0F, -2F); // Import Box0
		gunModel[258].setRotationPoint(-25.5F, -17.5F, -2.25F);

		gunModel[259].addShapeBox(14F, -8F, -4F, 2, 1, 14, 0F,0F, 0F, -0.75F, -0.5F, 0F, -1.5F, -0.5F, 0F, -2F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[259].setRotationPoint(-25.5F, -23.5F, -2.75F);

		gunModel[260].addShapeBox(14F, -8F, -4F, 2, 1, 12, 0F,0F, 0F, -1F, -1.25F, 0F, -1.5F, -1.25F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -0.25F); // Import Box0
		gunModel[260].setRotationPoint(-25.5F, -24.5F, -1.75F);

		gunModel[261].addShapeBox(14F, -8F, -4F, 1, 1, 9, 0F,0F, 0.5F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.25F, 0F, -1F, 0.25F, 1F, -1F, 0.25F, 1F, -1F, 0.25F, 0F, -1F, 0.25F); // Import Box0
		gunModel[261].setRotationPoint(-27.5F, -24.5F, -0.5F);

		gunModel[262].addShapeBox(14F, -8F, -4F, 9, 2, 9, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Import Box0
		gunModel[262].setRotationPoint(-81.5F, -17.5F, -0.5F);

		gunModel[263].addShapeBox(14F, -8F, -4F, 52, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Import Box0
		gunModel[263].setRotationPoint(-24F, -29.25F, 6.65F);

		gunModel[264].addShapeBox(14F, -8F, -4F, 30, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[264].setRotationPoint(-24F, -29.25F, 1.15F);

		gunModel[265].addShapeBox(14F, -8F, -4F, 10, 1, 6, 0F,0F, -0.25F, 0.9F, 0F, -0.25F, 0.9F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[265].setRotationPoint(-24F, -30F, 1.65F);

		gunModel[266].addShapeBox(14F, -8F, -4F, 1, 1, 6, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[266].setRotationPoint(-24F, -30.75F, 1F);

		gunModel[267].addShapeBox(14F, -8F, -4F, 1, 1, 6, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[267].setRotationPoint(-15F, -30.75F, 1F);

		gunModel[268].addShapeBox(14F, -8F, -4F, 6, 1, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[268].setRotationPoint(-21F, -30.75F, 1F);

		gunModel[269].addShapeBox(14F, -8F, -4F, 6, 1, 6, 0F,0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[269].setRotationPoint(-21F, -31F, 1F);

		gunModel[270].addShapeBox(14F, -8F, -4F, 1, 1, 6, 0F,0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Import Box0
		gunModel[270].setRotationPoint(-21F, -30.5F, 1F);

		gunModel[271].addShapeBox(14F, -8F, -4F, 1, 1, 6, 0F,0F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[271].setRotationPoint(-21F, -30.75F, 1F);

		gunModel[272].addShapeBox(14F, -8F, -4F, 1, 1, 6, 0F,-1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -0.75F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F); // Import Box0
		gunModel[272].setRotationPoint(-16F, -30.5F, 1F);

		gunModel[273].addShapeBox(14F, -8F, -4F, 1, 1, 6, 0F,-0.75F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F); // Import Box0
		gunModel[273].setRotationPoint(-16F, -30.75F, 1F);

		gunModel[274].addShapeBox(14F, -8F, -4F, 1, 3, 5, 0F,-0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // Import Box0
		gunModel[274].setRotationPoint(-24F, -33.25F, 1.5F);

		gunModel[275].addShapeBox(14F, -8F, -4F, 2, 3, 5, 0F,0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[275].setRotationPoint(-21.5F, -33.25F, 1.5F);

		gunModel[276].addShapeBox(14F, -8F, -4F, 2, 1, 5, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[276].setRotationPoint(-23F, -33.25F, 1.5F);

		gunModel[277].addShapeBox(14F, -8F, -4F, 1, 1, 5, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -1F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -0.75F, -1F, 0.25F); // Import Box0
		gunModel[277].setRotationPoint(-22.5F, -32.75F, 1.5F);

		gunModel[278].addShapeBox(14F, -8F, -4F, 1, 1, 5, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, -0.75F, -1F, 0.25F, -0.75F, -1F, 0.25F, 0F, -0.75F, 0.25F); // Import Box0
		gunModel[278].setRotationPoint(-23F, -32.75F, 1.5F);

		gunModel[279].addShapeBox(14F, -8F, -4F, 2, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[279].setRotationPoint(-23F, -32.75F, 1.5F);

		gunModel[280].addShapeBox(14F, -8F, -4F, 1, 1, 6, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box0
		gunModel[280].setRotationPoint(-22F, -30.75F, 1F);

		gunModel[281].addShapeBox(14F, -8F, -4F, 1, 1, 6, 0F,0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[281].setRotationPoint(-23F, -30.75F, 1F);

		gunModel[282].addShapeBox(14F, -8F, -4F, 1, 1, 6, 0F,-0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import Box0
		gunModel[282].setRotationPoint(-22.5F, -30.75F, 1F);

		gunModel[283].addShapeBox(14F, -8F, -4F, 1, 1, 6, 0F,0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[283].setRotationPoint(-22.5F, -30.75F, 1F);

		gunModel[284].addShapeBox(14F, -8F, -4F, 2, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Import Box0
		gunModel[284].setRotationPoint(-23F, -32.75F, 6.5F);

		gunModel[285].addShapeBox(14F, -8F, -4F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Import Box0
		gunModel[285].setRotationPoint(-23F, -33F, 6.5F);

		gunModel[286].addShapeBox(14F, -8F, -4F, 3, 3, 5, 0F,0F, -0.75F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[286].setRotationPoint(-19.5F, -33.25F, 1.5F);

		gunModel[287].addShapeBox(14F, -8F, -4F, 2, 3, 5, 0F,0F, -1.75F, 0.25F, 0F, -2.45F, 0.25F, 0F, -2.45F, 0.25F, 0F, -1.75F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[287].setRotationPoint(-16.5F, -33.25F, 1.5F);

		gunModel[288].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,-0.95F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.95F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[288].setRotationPoint(-24F, -33.75F, 1.5F);

		gunModel[289].addShapeBox(14F, -8F, -4F, 1, 2, 5, 0F,-0.5F, -1.45F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, -0.5F, -1.45F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // Import Box0
		gunModel[289].setRotationPoint(-24.5F, -32.25F, 1.5F);

		gunModel[290].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,-0.95F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.95F, 0F, -0.25F, 0.05F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0.05F, 0F, -0.25F); // Import Box0
		gunModel[290].setRotationPoint(-23F, -34.75F, 1.5F);

		gunModel[291].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,-0.95F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.95F, 0F, 0.25F, 0.05F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0.05F, 0F, 0.25F); // Import Box0
		gunModel[291].setRotationPoint(-23F, -34.75F, 5.5F);

		gunModel[292].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[292].setRotationPoint(-22F, -34.75F, 1.5F);

		gunModel[293].addShapeBox(14F, -8F, -4F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[293].setRotationPoint(-23F, -33.75F, 1.5F);

		gunModel[294].addShapeBox(14F, -8F, -4F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[294].setRotationPoint(-23F, -33.75F, 6F);

		gunModel[295].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[295].setRotationPoint(-22F, -34.75F, 6F);

		gunModel[296].addShapeBox(14F, -8F, -4F, 1, 1, 6, 0F,-0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // Import Box0
		gunModel[296].setRotationPoint(-15F, -31.25F, 1F);

		gunModel[297].addShapeBox(14F, -8F, -4F, 2, 1, 1, 0F,-1F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -0.8F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, 0.25F, -1F, -0.8F, 0.25F); // Import Box0
		gunModel[297].setRotationPoint(-22F, -33.25F, 1F);

		gunModel[298].addShapeBox(14F, -8F, -4F, 1, 2, 1, 0F,0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[298].setRotationPoint(-21F, -34.75F, 1.5F);

		gunModel[299].addShapeBox(14F, -8F, -4F, 1, 2, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[299].setRotationPoint(-21F, -34.75F, 6F);

		gunModel[300].addShapeBox(14F, -8F, -4F, 2, 1, 1, 0F,-1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -1F, 0F, -0.25F, -1F, -0.8F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, -0.25F, -1F, -0.8F, -0.25F); // Import Box0
		gunModel[300].setRotationPoint(-22F, -33.25F, 6F);

		gunModel[301].addShapeBox(14F, -8F, -4F, 2, 1, 1, 0F,-1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, -1F, 0.25F, 0F, -0.8F, 0.25F, 0F, -0.8F, -0.25F, -1.5F, -1F, -0.25F); // Import Box0
		gunModel[301].setRotationPoint(-23F, -33.25F, 6F);

		gunModel[302].addShapeBox(14F, -8F, -4F, 2, 1, 1, 0F,-1.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, -1F, 0.25F, 0F, -0.8F, 0.25F, 0F, -0.8F, -0.25F, -1.5F, -1F, -0.25F); // Import Box0
		gunModel[302].setRotationPoint(-23F, -33.25F, 1.5F);

		gunModel[303].addShapeBox(14F, -8F, -4F, 3, 25, 9, 0F,0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Import Box0
		gunModel[303].setRotationPoint(-99F, -19F, -0.5F);

		gunModel[304].addShapeBox(14F, -8F, -4F, 1, 25, 9, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.25F); // Import Box0
		gunModel[304].setRotationPoint(-100F, -19F, -0.5F);

		gunModel[305].addShapeBox(14F, -8F, -4F, 1, 3, 1, 0F,0F, -0.75F, 0.25F, 0F, -1.1F, 0.25F, 0F, -1.1F, -1F, 0F, -0.75F, -1.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1.25F); // Import Box0
		gunModel[305].setRotationPoint(-19.5F, -33.25F, 7F);

		gunModel[306].addShapeBox(14F, -8F, -4F, 1, 3, 1, 0F,0F, -1.1F, 0.25F, 0F, -1.4F, 0.25F, 0F, -1.4F, -1F, 0F, -1.1F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Import Box0
		gunModel[306].setRotationPoint(-18.5F, -33.25F, 7F);

		gunModel[307].addShapeBox(14F, -8F, -4F, 1, 3, 1, 0F,0F, -1.4F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.75F, -1.25F, 0F, -1.4F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1F); // Import Box0
		gunModel[307].setRotationPoint(-17.5F, -33.25F, 7F);

		gunModel[308].addShapeBox(14F, -8F, -4F, 1, 3, 1, 0F,0F, -0.75F, -1.25F, 0F, -1.1F, -1F, 0F, -1.1F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[308].setRotationPoint(-19.5F, -33.25F, 0F);

		gunModel[309].addShapeBox(14F, -8F, -4F, 1, 3, 1, 0F,0F, -1.1F, -1F, 0F, -1.4F, -1F, 0F, -1.4F, 0.25F, 0F, -1.1F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[309].setRotationPoint(-18.5F, -33.25F, 0F);

		gunModel[310].addShapeBox(14F, -8F, -4F, 1, 3, 1, 0F,0F, -1.4F, -1F, 0F, -1.75F, -1.25F, 0F, -1.75F, 0.25F, 0F, -1.4F, 0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import Box0
		gunModel[310].setRotationPoint(-17.5F, -33.25F, 0F);

		gunModel[311].addShapeBox(14F, -8F, -4F, 4, 1, 1, 0F,0.25F, 2.25F, 0.25F, 0.25F, 2.25F, 0.25F, 0.25F, 2.25F, 0.25F, 0.25F, 2.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import Box0
		gunModel[311].setRotationPoint(-22.45F, -39.25F, 3.5F);
		gunModel[311].rotateAngleZ = -0.43633231F;

		gunModel[312].addShapeBox(14F, -8F, -4F, 4, 3, 1, 0F,-1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import Box0
		gunModel[312].setRotationPoint(-21.5F, -41.25F, 2F);
		gunModel[312].rotateAngleZ = -0.43633231F;

		gunModel[313].addShapeBox(14F, -8F, -4F, 4, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F); // Import Box0
		gunModel[313].setRotationPoint(-21.5F, -41.25F, 5F);
		gunModel[313].rotateAngleZ = -0.43633231F;

		gunModel[314].addShapeBox(14F, -8F, -4F, 4, 3, 1, 0F,-1F, 1F, 0.5F, -1F, 1F, 0.5F, 0.5F, 1F, 0.25F, 0.5F, 1F, 0.25F, -1F, -3F, 0.5F, -1F, -3F, 0.5F, 0.5F, -3F, 0.25F, 0.5F, -3F, 0.25F); // Import Box0
		gunModel[314].setRotationPoint(-21.5F, -41.25F, 2F);
		gunModel[314].rotateAngleZ = -0.43633231F;

		gunModel[315].addShapeBox(14F, -8F, -4F, 4, 3, 1, 0F,0.5F, 1F, 0.25F, 0.5F, 1F, 0.25F, -1F, 1F, 0.5F, -1F, 1F, 0.5F, 0.5F, -3F, 0.25F, 0.5F, -3F, 0.25F, -1F, -3F, 0.5F, -1F, -3F, 0.5F); // Import Box0
		gunModel[315].setRotationPoint(-21.5F, -41.25F, 5F);
		gunModel[315].rotateAngleZ = -0.43633231F;

		gunModel[316].addShapeBox(14F, -8F, -4F, 2, 1, 2, 0F,-1F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Import Box0
		gunModel[316].setRotationPoint(-18.35F, -40.9F, 3.25F);
		gunModel[316].rotateAngleZ = -0.43633231F;

		gunModel[317].addShapeBox(14F, -8F, -4F, 2, 1, 2, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, -1F, -0.75F, -0.5F); // Import Box0
		gunModel[317].setRotationPoint(-18.35F, -40.9F, 3.25F);
		gunModel[317].rotateAngleZ = -0.43633231F;

		gunModel[318].addShapeBox(14F, -8F, -4F, 2, 1, 2, 0F,-1F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -1F, -0.25F, -0.5F); // Import Box0
		gunModel[318].setRotationPoint(-18.35F, -40.9F, 3.25F);
		gunModel[318].rotateAngleZ = -0.43633231F;

		gunModel[319].addShapeBox(14F, -8F, -4F, 2, 1, 2, 0F,-1F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -1F, -0.25F, -0.5F); // Import Box0
		gunModel[319].setRotationPoint(-18.35F, -40.9F, 2.25F);
		gunModel[319].rotateAngleZ = -0.43633231F;

		gunModel[320].addShapeBox(14F, -8F, -4F, 2, 1, 2, 0F,-1F, -0.6F, -1F, -0.5F, -0.6F, -1F, -0.5F, -0.75F, -0.85F, -1F, -0.75F, -0.85F, -1F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.85F, -1F, -0.25F, -0.85F); // Import Box0
		gunModel[320].setRotationPoint(-18.35F, -40.9F, 2.75F);
		gunModel[320].rotateAngleZ = -0.43633231F;

		gunModel[321].addShapeBox(14F, -8F, -4F, 2, 1, 2, 0F,-1F, -0.75F, -0.85F, -0.5F, -0.75F, -0.85F, -0.5F, -0.6F, -1F, -1F, -0.6F, -1F, -1F, -0.25F, -0.85F, -0.5F, -0.25F, -0.85F, -0.5F, -0.25F, -1F, -1F, -0.25F, -1F); // Import Box0
		gunModel[321].setRotationPoint(-18.35F, -40.9F, 3.25F);
		gunModel[321].rotateAngleZ = -0.43633231F;

		gunModel[322].addShapeBox(14F, -8F, -4F, 2, 1, 2, 0F,-1F, -0.25F, -0.85F, -0.5F, -0.25F, -0.85F, -0.5F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.75F, -0.85F, -0.5F, -0.75F, -0.85F, -0.5F, -0.6F, -1F, -1F, -0.6F, -1F); // Import Box0
		gunModel[322].setRotationPoint(-18.35F, -40.9F, 3.25F);
		gunModel[322].rotateAngleZ = -0.43633231F;

		gunModel[323].addShapeBox(14F, -8F, -4F, 2, 1, 2, 0F,-1F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.85F, -1F, -0.25F, -0.85F, -1F, -0.6F, -1F, -0.5F, -0.6F, -1F, -0.5F, -0.75F, -0.85F, -1F, -0.75F, -0.85F); // Import Box0
		gunModel[323].setRotationPoint(-18.35F, -40.9F, 2.75F);
		gunModel[323].rotateAngleZ = -0.43633231F;

		gunModel[324].addShapeBox(14F, -8F, -4F, 11, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[324].setRotationPoint(-12F, -31.5F, 3.15F);

		gunModel[325].addShapeBox(14F, -8F, -4F, 22, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[325].setRotationPoint(6.5F, -31.5F, 3.15F);

		gunModel[326].addShapeBox(14F, -8F, -4F, 5, 1, 2, 0F,0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Import Box0
		gunModel[326].setRotationPoint(0F, -31.5F, 3.15F);

		gunModel[327].addShapeBox(14F, -8F, -4F, 1, 1, 2, 0F,-0.25F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Import Box0
		gunModel[327].setRotationPoint(4.5F, -32F, 3.15F);

		gunModel[328].addShapeBox(14F, -8F, -4F, 1, 1, 2, 0F,-0.5F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[328].setRotationPoint(0F, -32F, 3.15F);

		gunModel[329].addShapeBox(14F, -8F, -4F, 3, 2, 9, 0F,0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[329].setRotationPoint(-99F, -21F, -0.5F);

		gunModel[330].addShapeBox(14F, -8F, -4F, 3, 1, 9, 0F,0F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[330].setRotationPoint(-99F, -22F, -0.5F);

		gunModel[331].addShapeBox(14F, -8F, -4F, 1, 2, 9, 0F,-0.25F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[331].setRotationPoint(-100F, -21F, -0.5F);

		gunModel[332].addShapeBox(14F, -8F, -4F, 1, 1, 9, 0F,-0.5F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.5F, 0F, -2.25F, 0F, 0F, -1.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -1.25F); // Import Box0
		gunModel[332].setRotationPoint(-99.75F, -22F, -0.5F);

		gunModel[333].addShapeBox(14F, -8F, -4F, 4, 1, 2, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		gunModel[333].setRotationPoint(20.5F, -31.75F, 3.15F);

		gunModel[334].addShapeBox(14F, -10F, -4F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[334].setRotationPoint(32F, -27.15F, 1F);

		gunModel[335].addShapeBox(14F, -10F, -4F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[335].setRotationPoint(32F, -25.15F, 1F);

		gunModel[336].addShapeBox(14F, -10F, -4F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[336].setRotationPoint(32F, -24.15F, 1.5F);

		gunModel[337].addShapeBox(14F, -10F, -4F, 1, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[337].setRotationPoint(32F, -28.15F, 1F);

		gunModel[338].addShapeBox(14F, -10F, -4F, 1, 1, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[338].setRotationPoint(32F, -29.15F, 1.5F);

		gunModel[339].addShapeBox(14F, -8F, -4F, 3, 1, 9, 0F,0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Import Box0
		gunModel[339].setRotationPoint(-99F, 6.5F, -0.5F);

		gunModel[340].addShapeBox(14F, -8F, -4F, 3, 2, 8, 0F,0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Import Box0
		gunModel[340].setRotationPoint(-99F, 7.75F, 0F);

		gunModel[341].addShapeBox(14F, -8F, -4F, 3, 1, 6, 0F,0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, -1.25F, -0.25F, 0.25F, -1.25F, -0.25F, 0.25F, -1.25F, 0F, 0.25F, -1.25F); // Import Box0
		gunModel[341].setRotationPoint(-99F, 9.75F, 1F);

		gunModel[342].addShapeBox(14F, -8F, -4F, 1, 1, 9, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.75F); // Import Box0
		gunModel[342].setRotationPoint(-100F, 6.5F, -0.5F);

		gunModel[343].addShapeBox(14F, -8F, -4F, 1, 2, 8, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, -0.25F, 0.25F, -1.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.25F, 0.25F, -1.25F); // Import Box0
		gunModel[343].setRotationPoint(-100F, 7.75F, 0F);

		gunModel[344].addShapeBox(14F, -8F, -4F, 1, 1, 6, 0F,-0.25F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.75F, 0.25F, -1.75F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, -0.75F, 0.25F, -1.75F); // Import Box0
		gunModel[344].setRotationPoint(-100F, 9.75F, 1F);

		gunModel[345].addShapeBox(14F, -8F, -4F, 3, 25, 7, 0F,0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Import Box0
		gunModel[345].setRotationPoint(-98F, -19F, 0.5F);

		gunModel[346].addShapeBox(14F, -8F, -4F, 3, 2, 7, 0F,0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[346].setRotationPoint(-98F, -21F, 0.5F);

		gunModel[347].addShapeBox(14F, -8F, -4F, 3, 1, 7, 0F,0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Import Box0
		gunModel[347].setRotationPoint(-98F, 6.5F, 0.5F);

		gunModel[348].addShapeBox(14F, -8F, -4F, 3, 2, 6, 0F,0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Import Box0
		gunModel[348].setRotationPoint(-98F, 7.75F, 1F);

		gunModel[349].addShapeBox(14F, -8F, -4F, 3, 1, 7, 0F,0F, -0.1F, -2.25F, -0.25F, -0.1F, -2.25F, -0.25F, -0.1F, -2.25F, 0F, -0.1F, -2.25F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[349].setRotationPoint(-98F, -22F, 0.5F);

		gunModel[350].addShapeBox(14F, -8F, -4F, 3, 1, 4, 0F,-0.5F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, 0.15F, -1.25F, -1F, 0.15F, -1.25F, -1F, 0.15F, -1.25F, -0.5F, 0.15F, -1.25F); // Import Box0
		gunModel[350].setRotationPoint(-98F, 9.75F, 2F);

		gunModel[351].addShapeBox(14F, -8F, -4F, 5, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Import Box0
		gunModel[351].setRotationPoint(0F, -29.25F, 6.9F);

		gunModel[352].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,-0.95F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.95F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[352].setRotationPoint(-24F, -33.75F, 6F);

		gunModel[353].addShapeBox(14F, -8F, -4F, 1, 1, 4, 0F,-0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[353].setRotationPoint(-24F, -33.75F, 2.5F);

		gunModel[354].addShapeBox(14F, -8F, -4F, 5, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Import Box0
		gunModel[354].setRotationPoint(20.5F, -29.25F, 6.9F);

		gunModel[355].addShapeBox(14F, -8F, -4F, 2, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[355].setRotationPoint(22F, -27.5F, 5.4F);

		gunModel[356].addShapeBox(14F, -8F, -4F, 2, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[356].setRotationPoint(1.5F, -27.5F, 5.4F);

		gunModel[357].addShapeBox(14F, -8F, -4F, 24, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[357].setRotationPoint(-24F, -28.25F, 6.65F);

		gunModel[358].addShapeBox(14F, -8F, -4F, 15, 1, 1, 0F,0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[358].setRotationPoint(5F, -28.25F, 6.65F);

		gunModel[359].addShapeBox(14F, -8F, -4F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[359].setRotationPoint(25.5F, -28.25F, 6.65F);

		gunModel[360].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F); // Import Box0
		gunModel[360].setRotationPoint(0F, -28.25F, 6.65F);

		gunModel[361].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F); // Import Box0
		gunModel[361].setRotationPoint(4F, -28.25F, 6.65F);

		gunModel[362].addShapeBox(14F, -8F, -4F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[362].setRotationPoint(1F, -28.25F, 6.65F);

		gunModel[363].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F); // Import Box0
		gunModel[363].setRotationPoint(20.5F, -28.25F, 6.65F);

		gunModel[364].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F); // Import Box0
		gunModel[364].setRotationPoint(24.5F, -28.25F, 6.65F);

		gunModel[365].addShapeBox(14F, -8F, -4F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[365].setRotationPoint(21.5F, -28.25F, 6.65F);

		gunModel[366].addShapeBox(14F, -8F, -4F, 20, 1, 1, 0F,-0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.2F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F); // Import Box0
		gunModel[366].setRotationPoint(40F, -30.85F, 2.1F);

		gunModel[367].addShapeBox(14F, -8F, -4F, 20, 1, 1, 0F,-0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.65F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.35F); // Import Box0
		gunModel[367].setRotationPoint(40F, -30.85F, 4.9F);

		gunModel[368].addShapeBox(14F, -8F, -4F, 20, 1, 1, 0F,-0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.35F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.65F); // Import Box0
		gunModel[368].setRotationPoint(40F, -27.35F, 5.9F);

		gunModel[369].addShapeBox(14F, -8F, -4F, 20, 1, 1, 0F,-0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.2F); // Import Box0
		gunModel[369].setRotationPoint(40F, -27.35F, 1.1F);

		gunModel[370].addShapeBox(14F, -8F, -4F, 20, 1, 1, 0F,-0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.65F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.35F); // Import Box0
		gunModel[370].setRotationPoint(40F, -29.85F, 5.9F);

		gunModel[371].addShapeBox(14F, -8F, -4F, 20, 1, 1, 0F,-0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.2F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.35F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F); // Import Box0
		gunModel[371].setRotationPoint(40F, -29.85F, 1.1F);

		gunModel[372].addShapeBox(14F, -8F, -4F, 2, 4, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[372].setRotationPoint(-0.9F, -2.8F, 8F);
		gunModel[372].rotateAngleZ = 0.78539816F;

		gunModel[373].addShapeBox(14F, -8F, -4F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[373].setRotationPoint(0.499999999999999F, -3.5F, 8F);
		gunModel[373].rotateAngleZ = 0.78539816F;

		gunModel[374].addShapeBox(14F, -8F, -4F, 2, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0.5F); // Import Box0
		gunModel[374].setRotationPoint(-2.3F, -1.4F, 8F);
		gunModel[374].rotateAngleZ = 0.78539816F;

		gunModel[375].addShapeBox(14F, -8F, -4F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.75F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0.5F, 0F, -2.75F, 0.5F); // Import Box0
		gunModel[375].setRotationPoint(-3.7F, 2.22044604925031E-16F, 8F);
		gunModel[375].rotateAngleZ = 0.78539816F;

		gunModel[376].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F); // Import Box0
		gunModel[376].setRotationPoint(-4.4F, 0.700000000000003F, 8F);
		gunModel[376].rotateAngleZ = 0.78539816F;

		gunModel[377].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, -0.25F, 0F, 0.5F); // Import Box0
		gunModel[377].setRotationPoint(-4.57F, 0.870000000000005F, 8F);
		gunModel[377].rotateAngleZ = 0.78539816F;

		gunModel[378].addShapeBox(14F, -8F, -4F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[378].setRotationPoint(-1.25F, -2.45F, 8F);
		gunModel[378].rotateAngleZ = 0.78539816F;

		gunModel[379].addShapeBox(14F, -8F, -4F, 20, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[379].setRotationPoint(-17.5F, -13.5F, 7.35F);

		gunModel[380].addShapeBox(14F, -8F, -4F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[380].setRotationPoint(-5.5F, -6.75F, 7.35F);

		gunModel[381].addShapeBox(14F, -8F, -4F, 10, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[381].setRotationPoint(-5.5F, -10.75F, 7.35F);

		gunModel[382].addShapeBox(14F, -8F, -4F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[382].setRotationPoint(-9.5F, -5.75F, 7.35F);

		gunModel[383].addShapeBox(14F, -8F, -4F, 2, 4, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[383].setRotationPoint(-0.9F, -2.8F, -1F);
		gunModel[383].rotateAngleZ = 0.78539816F;

		gunModel[384].addShapeBox(14F, -8F, -4F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[384].setRotationPoint(0.499999999999999F, -3.5F, -1F);
		gunModel[384].rotateAngleZ = 0.78539816F;

		gunModel[385].addShapeBox(14F, -8F, -4F, 2, 4, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0F); // Import Box0
		gunModel[385].setRotationPoint(-2.3F, -1.4F, -1F);
		gunModel[385].rotateAngleZ = 0.78539816F;

		gunModel[386].addShapeBox(14F, -8F, -4F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.75F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0.5F, 0F, -2.75F, 0.5F); // Import Box0
		gunModel[386].setRotationPoint(-3.7F, 2.22044604925031E-16F, -1.5F);
		gunModel[386].rotateAngleZ = 0.78539816F;

		gunModel[387].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F); // Import Box0
		gunModel[387].setRotationPoint(-4.4F, 0.700000000000003F, -1.5F);
		gunModel[387].rotateAngleZ = 0.78539816F;

		gunModel[388].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, -0.25F, 0F, 0.5F); // Import Box0
		gunModel[388].setRotationPoint(-4.57F, 0.870000000000005F, -1.5F);
		gunModel[388].rotateAngleZ = 0.78539816F;

		gunModel[389].addShapeBox(14F, -8F, -4F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[389].setRotationPoint(-1.25F, -2.45F, -1F);
		gunModel[389].rotateAngleZ = 0.78539816F;

		gunModel[390].addShapeBox(14F, -8F, -4F, 20, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[390].setRotationPoint(-17.5F, -13.5F, -0.35F);

		gunModel[391].addShapeBox(14F, -8F, -4F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[391].setRotationPoint(-5.5F, -6.75F, -0.35F);

		gunModel[392].addShapeBox(14F, -8F, -4F, 10, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[392].setRotationPoint(-5.5F, -10.75F, -0.35F);

		gunModel[393].addShapeBox(14F, -8F, -4F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[393].setRotationPoint(-9.5F, -5.75F, -0.35F);

		gunModel[394].addShapeBox(14F, -8F, -4F, 20, 1, 1, 0F,-0.05F, -0.5F, -0.65F, -0.05F, -0.5F, -0.65F, -0.05F, -0.5F, -0.2F, -0.05F, -0.5F, -0.2F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.65F, -0.05F, -0.25F, -0.2F, -0.05F, -0.25F, -0.2F); // Import Box0
		gunModel[394].setRotationPoint(40F, -28.75F, 0.6F);

		gunModel[395].addShapeBox(14F, -8F, -4F, 1, 1, 8, 0F,0F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[395].setRotationPoint(15.75F, -8.5F, 0.5F);

		gunModel[396].addShapeBox(14F, -8F, -4F, 1, 1, 8, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -1F, -0.25F); // Import Box0
		gunModel[396].setRotationPoint(15.75F, -11F, 0.5F);

		gunModel[397].addShapeBox(14F, -8F, -4F, 1, 2, 6, 0F,0F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0.5F, -0.25F); // Import Box0
		gunModel[397].setRotationPoint(15.5F, -10.25F, 2.5F);

		gunModel[398].addShapeBox(14F, -8F, -4F, 2, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[398].setRotationPoint(13.5F, -10.75F, 2.5F);

		gunModel[399].addShapeBox(14F, -8F, -4F, 2, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[399].setRotationPoint(13.5F, -8.25F, 2.5F);

		gunModel[400].addShapeBox(14F, -8F, -4F, 2, 2, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[400].setRotationPoint(13.5F, -10.25F, 2.5F);

		gunModel[401].addShapeBox(14F, -8F, -4F, 1, 3, 6, 0F,0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[401].setRotationPoint(12.5F, -10.75F, 2.5F);

		gunModel[402].addShapeBox(14F, -8F, -4F, 2, 3, 6, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[402].setRotationPoint(10.5F, -10.75F, 2.5F);

		gunModel[403].addShapeBox(14F, -8F, -4F, 1, 3, 6, 0F,0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F); // Import Box0
		gunModel[403].setRotationPoint(9.5F, -10.75F, 2.5F);

		gunModel[404].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[404].setRotationPoint(10.5F, -9.75F, 7.5F);

		gunModel[405].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Import Box0
		gunModel[405].setRotationPoint(10.5F, -8.75F, 7.5F);

		gunModel[406].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[406].setRotationPoint(10.5F, -10.75F, 7.5F);

		gunModel[407].addShapeBox(14F, -8F, -4F, 6, 7, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1.37F, 0F, 0.5F, -1.37F, 0F, 0F, 1F, 0F); // Import Box0
		gunModel[407].setRotationPoint(16.75F, -12F, 7.75F);

		gunModel[408].addShapeBox(14F, -8F, -4F, 6, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[408].setRotationPoint(16.75F, -13F, 7.75F);

		gunModel[409].addShapeBox(14F, -8F, -4F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[409].setRotationPoint(17.75F, -12F, 8F);

		gunModel[410].addShapeBox(14F, -8F, -4F, 1, 6, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, -0.25F, 0F); // Import Box0
		gunModel[410].setRotationPoint(16.75F, -12F, 8F);

		gunModel[411].addShapeBox(14F, -8F, -4F, 1, 4, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[411].setRotationPoint(21.75F, -12F, 8F);

		gunModel[412].addShapeBox(14F, -8F, -4F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F); // Import Box0
		gunModel[412].setRotationPoint(22.75F, -12F, 8F);

		gunModel[413].addShapeBox(14F, -8F, -4F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Import Box0
		gunModel[413].setRotationPoint(22.75F, -12F, 9F);

		gunModel[414].addShapeBox(14F, -8F, -4F, 1, 4, 1, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import Box0
		gunModel[414].setRotationPoint(21.75F, -12F, 9.5F);

		gunModel[415].addShapeBox(14F, -8F, -4F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F); // Import Box0
		gunModel[415].setRotationPoint(19.75F, -12F, 9.5F);

		gunModel[416].addShapeBox(14F, -8F, -4F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[416].setRotationPoint(20.75F, -12F, 9.5F);

		gunModel[417].addShapeBox(14F, -8F, -4F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[417].setRotationPoint(20.75F, -9F, 9.5F);

		gunModel[418].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Import Box0
		gunModel[418].setRotationPoint(21.75F, -11F, 9.5F);

		gunModel[419].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box0
		gunModel[419].setRotationPoint(21.75F, -10F, 9.5F);

		gunModel[420].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box0
		gunModel[420].setRotationPoint(20.75F, -11F, 9.5F);

		gunModel[421].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[421].setRotationPoint(20.75F, -10F, 9.5F);

		gunModel[422].addShapeBox(14F, -8F, -4F, 6, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1.37F, 0F, 0.5F, -1.37F, 0F, 0F, 1F, 0F); // Import Box0
		gunModel[422].setRotationPoint(15F, -13F, -0.5F);

		gunModel[423].addShapeBox(14F, -8F, -4F, 6, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[423].setRotationPoint(15F, -14F, -0.5F);

		gunModel[424].addShapeBox(14F, -8F, -4F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[424].setRotationPoint(9F, -9F, 0F);

		gunModel[425].addShapeBox(14F, -8F, -4F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[425].setRotationPoint(9F, -11F, 0F);

		gunModel[426].addShapeBox(14F, -8F, -4F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[426].setRotationPoint(9F, -10F, 0F);

		gunModel[427].addShapeBox(14F, -8F, -4F, 34, 1, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 1F, 0F, 0.5F, 1F); // Import Box0
		gunModel[427].setRotationPoint(-27F, -28.75F, 1.65F);

		gunModel[428].addShapeBox(14F, -8F, -4F, 34, 1, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[428].setRotationPoint(-27F, -27F, 1.65F);

		gunModel[429].addShapeBox(14F, -8F, -4F, 34, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[429].setRotationPoint(-27F, -26F, 2.15F);

		gunModel[430].addShapeBox(14F, -8F, -4F, 87, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[430].setRotationPoint(-27F, -26F, 3.15F);

		gunModel[431].addShapeBox(14F, -8F, -4F, 34, 2, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[431].setRotationPoint(-27F, -27F, 1.5F);

		gunModel[432].addShapeBox(14F, -8F, -4F, 17, 1, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 1F, 0F, 0.5F, 1F); // Import Box0
		gunModel[432].setRotationPoint(18F, -28.75F, 1.65F);

		gunModel[433].addShapeBox(14F, -8F, -4F, 42, 1, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[433].setRotationPoint(18F, -27F, 1.65F);

		gunModel[434].addShapeBox(14F, -8F, -4F, 10, 2, 3, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box0
		gunModel[434].setRotationPoint(18F, -27F, 1.5F);

		gunModel[435].addShapeBox(14F, -8F, -4F, 32, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[435].setRotationPoint(-25F, -24.5F, -0.25F);

		gunModel[436].addShapeBox(14F, -8F, -4F, 34, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[436].setRotationPoint(-27F, -25.5F, 0.75F);

		gunModel[437].addShapeBox(14F, -8F, -4F, 9, 1, 6, 0F,0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[437].setRotationPoint(18F, -24.5F, -0.25F);

		gunModel[438].addShapeBox(14F, -8F, -4F, 9, 1, 5, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[438].setRotationPoint(18F, -25.5F, 0.75F);

		gunModel[439].addShapeBox(14F, -8F, -4F, 1, 1, 6, 0F,0F, -0.5F, 0.15F, -1F, -0.5F, 0.15F, -1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[439].setRotationPoint(7F, -24.5F, -0.25F);

		gunModel[440].addShapeBox(14F, -8F, -4F, 1, 1, 6, 0F,-1F, -0.5F, 0.15F, 0F, -0.5F, 0.15F, 0F, -0.5F, -1F, -1F, -0.5F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Import Box0
		gunModel[440].setRotationPoint(17F, -24.5F, -0.25F);

		gunModel[441].addShapeBox(14F, -8F, -4F, 1, 1, 2, 0F,0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -0.5F, 1F, 0F, -0.5F, 1F); // Import Box0
		gunModel[441].setRotationPoint(7F, -28.75F, 1.65F);

		gunModel[442].addShapeBox(14F, -8F, -4F, 1, 1, 2, 0F,-0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 1F, -0.5F, 0.25F, 1F, -1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 1F, -1F, -0.5F, 1F); // Import Box0
		gunModel[442].setRotationPoint(17F, -28.75F, 1.65F);

		gunModel[443].addShapeBox(14F, -8F, -4F, 8, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		gunModel[443].setRotationPoint(19F, -29.25F, 1.15F);

		gunModel[444].addShapeBox(14F, -8F, -4F, 5, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F); // Import Box0
		gunModel[444].setRotationPoint(1F, -29F, 0.9F);

		gunModel[445].addShapeBox(14F, -8F, -4F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F); // Import Box0
		gunModel[445].setRotationPoint(20.5F, -29F, 0.9F);

		gunModel[446].addShapeBox(14F, -8F, -4F, 7, 1, 1, 0F,0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.65F, 0F, -0.25F, -0.65F, 0F, 0.5F, 1.35F, 0F, 0.5F, 1.35F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F); // Import Box0
		gunModel[446].setRotationPoint(-1F, -25.75F, 0.9F);

		gunModel[447].addShapeBox(14F, -8F, -4F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[447].setRotationPoint(-72.5F, -17.5F, 8.25F);

		gunModel[448].addShapeBox(14F, -8F, -4F, 6, 12, 1, 0F,0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F); // Import Box0
		gunModel[448].setRotationPoint(-87.5F, -17.5F, 8.25F);

		gunModel[449].addShapeBox(14F, -8F, -4F, 2, 8, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F); // Import Box0
		gunModel[449].setRotationPoint(-74.5F, -15.5F, 7.5F);

		gunModel[450].addShapeBox(14F, -8F, -4F, 2, 8, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.25F); // Import Box0
		gunModel[450].setRotationPoint(-81.5F, -15.5F, 7.5F);

		gunModel[451].addShapeBox(14F, -8F, -4F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -5F, 0F, 0F); // Import Box0
		gunModel[451].setRotationPoint(-81.5F, -17.5F, 9.25F);

		gunModel[452].addShapeBox(14F, -8F, -4F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -5F, 0F, 0F); // Import Box0
		gunModel[452].setRotationPoint(-81.5F, -7.5F, 9.25F);

		gunModel[453].addShapeBox(14F, -8F, -4F, 9, 2, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Import Box0
		gunModel[453].setRotationPoint(-81.5F, -7.5F, 6.5F);

		gunModel[454].addShapeBox(14F, -8F, -4F, 6, 1, 1, 0F,0F, 0.5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[454].setRotationPoint(-72.5F, -6.5F, 9.25F);

		gunModel[455].addShapeBox(14F, -8F, -4F, 6, 1, 1, 0F,0F, -0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[455].setRotationPoint(-72.5F, -17.5F, 9.25F);

		gunModel[456].addShapeBox(14F, -8F, -4F, 1, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[456].setRotationPoint(-67.5F, -12.5F, 9.25F);

		gunModel[457].addShapeBox(14F, -8F, -4F, 5, 1, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0.5F, 0F, 0F); // Import Box0
		gunModel[457].setRotationPoint(-81F, -17F, 9.25F);

		gunModel[458].addShapeBox(14F, -8F, -4F, 3, 1, 1, 0F,-0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F); // Import Box0
		gunModel[458].setRotationPoint(-75.5F, -17F, 9.25F);

		gunModel[459].addShapeBox(14F, -8F, -4F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[459].setRotationPoint(-77F, -17F, 11.25F);

		gunModel[460].addShapeBox(14F, -8F, -4F, 5, 1, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 2F, 0.5F, 0F, 0F); // Import Box0
		gunModel[460].setRotationPoint(-81F, -7F, 9.25F);

		gunModel[461].addShapeBox(14F, -8F, -4F, 3, 1, 1, 0F,-0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F); // Import Box0
		gunModel[461].setRotationPoint(-75.5F, -7F, 9.25F);

		gunModel[462].addShapeBox(14F, -8F, -4F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[462].setRotationPoint(-77F, -7F, 11.25F);

		gunModel[463].addShapeBox(14F, -8F, -4F, 6, 1, 1, 0F,0F, 5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -5F, 0F); // Import Box0
		gunModel[463].setRotationPoint(-87.5F, -6.5F, 9.25F);

		gunModel[464].addShapeBox(14F, -8F, -4F, 6, 1, 1, 0F,0F, -5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 5F, 0F); // Import Box0
		gunModel[464].setRotationPoint(-87.5F, -17.5F, 9.25F);

		gunModel[465].addShapeBox(14F, -8F, -4F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[465].setRotationPoint(-87.5F, -12.5F, 9.25F);

		gunModel[466].addShapeBox(14F, -8F, -4F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[466].setRotationPoint(-75.75F, -16F, 10.5F);

		gunModel[467].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[467].setRotationPoint(-68.5F, -12F, 9.25F);

		gunModel[468].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[468].setRotationPoint(-71.5F, -11F, 9.25F);

		gunModel[469].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[469].setRotationPoint(-70.5F, -13F, 9.25F);

		gunModel[470].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[470].setRotationPoint(-70.5F, -11F, 9.25F);

		gunModel[471].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[471].setRotationPoint(-71.5F, -13F, 9.25F);

		gunModel[472].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[472].setRotationPoint(-69.5F, -11F, 9.25F);

		gunModel[473].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[473].setRotationPoint(-69.5F, -13F, 9.25F);

		gunModel[474].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[474].setRotationPoint(-86.5F, -12F, 9.25F);

		gunModel[475].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[475].setRotationPoint(-85.5F, -11F, 9.25F);

		gunModel[476].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[476].setRotationPoint(-84.5F, -13F, 9.25F);

		gunModel[477].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[477].setRotationPoint(-84.5F, -11F, 9.25F);

		gunModel[478].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[478].setRotationPoint(-85.5F, -13F, 9.25F);

		gunModel[479].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[479].setRotationPoint(-83.5F, -11F, 9.25F);

		gunModel[480].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[480].setRotationPoint(-83.5F, -13F, 9.25F);

		gunModel[481].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[481].setRotationPoint(-82.5F, -12F, 9.25F);

		gunModel[482].addShapeBox(14F, -8F, -4F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[482].setRotationPoint(-72.25F, -12F, 9.25F);

		gunModel[483].addShapeBox(14F, -8F, -4F, 2, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F); // Import Box0
		gunModel[483].setRotationPoint(57F, -28.75F, 7F);

		gunModel[484].addShapeBox(14F, -8F, -4F, 2, 1, 4, 0F,0F, 0F, -1F, -1.5F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F); // Import Box0
		gunModel[484].setRotationPoint(57F, -29.75F, 7F);

		gunModel[485].addShapeBox(14F, -8F, -4F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[485].setRotationPoint(55F, -28.75F, 7F);

		gunModel[486].addShapeBox(14F, -8F, -4F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[486].setRotationPoint(55F, -27.75F, 7F);

		gunModel[487].addShapeBox(14F, -8F, -4F, 2, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1F); // Import Box0
		gunModel[487].setRotationPoint(57F, -27.75F, 7F);

		gunModel[488].addShapeBox(14F, -8F, -4F, 1, 1, 4, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import Box0
		gunModel[488].setRotationPoint(54F, -28.75F, 7F);

		gunModel[489].addShapeBox(14F, -8F, -4F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[489].setRotationPoint(55F, -29.75F, 7F);

		gunModel[490].addShapeBox(14F, -8F, -4F, 1, 1, 4, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import Box0
		gunModel[490].setRotationPoint(54F, -29.75F, 7F);

		gunModel[491].addShapeBox(14F, -8F, -4F, 1, 1, 4, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1.5F); // Import Box0
		gunModel[491].setRotationPoint(54F, -27.75F, 7F);

		gunModel[492].addShapeBox(14F, -8F, -4F, 2, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box0
		gunModel[492].setRotationPoint(55F, -28.75F, 5.5F);

		gunModel[493].addShapeBox(14F, -8F, -4F, 2, 2, 3, 0F,-1.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[493].setRotationPoint(9.5F, -3F, 2.5F);

		gunModel[494].addShapeBox(14F, -8F, -4F, 2, 3, 4, 0F,-1.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[494].setRotationPoint(8.5F, -1F, 2F);

		gunModel[495].addShapeBox(14F, -8F, -4F, 48, 2, 12, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[495].setRotationPoint(27F, -24F, -2F);

		gunModel[496].addShapeBox(14F, -8F, -4F, 48, 4, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[496].setRotationPoint(27F, -22F, -2F);

		gunModel[497].addShapeBox(14F, -8F, -4F, 48, 2, 10, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Import Box0
		gunModel[497].setRotationPoint(27F, -26F, -1F);

		gunModel[498].addShapeBox(14F, -8F, -4F, 48, 2, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box0
		gunModel[498].setRotationPoint(27F, -18F, -2F);

		gunModel[499].addShapeBox(14F, -8F, -4F, 48, 2, 10, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Import Box0
		gunModel[499].setRotationPoint(27F, -16F, -1F);
	}

	private void initgunModel_2()
	{
		gunModel[500] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Import Box0
		gunModel[501] = new ModelRendererTurbo(this, 225, 305, textureX, textureY); // Import Box0
		gunModel[502] = new ModelRendererTurbo(this, 297, 305, textureX, textureY); // Import Box0
		gunModel[503] = new ModelRendererTurbo(this, 369, 305, textureX, textureY); // Import Box0
		gunModel[504] = new ModelRendererTurbo(this, 81, 313, textureX, textureY); // Import Box0
		gunModel[505] = new ModelRendererTurbo(this, 153, 321, textureX, textureY); // Import Box0
		gunModel[506] = new ModelRendererTurbo(this, 257, 321, textureX, textureY); // Import Box0
		gunModel[507] = new ModelRendererTurbo(this, 361, 321, textureX, textureY); // Import Box0
		gunModel[508] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Import Box0
		gunModel[509] = new ModelRendererTurbo(this, 473, 281, textureX, textureY); // Import Box0
		gunModel[510] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Import Box0
		gunModel[511] = new ModelRendererTurbo(this, 169, 241, textureX, textureY); // Import Box0
		gunModel[512] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Import Box0
		gunModel[513] = new ModelRendererTurbo(this, 281, 241, textureX, textureY); // Import Box0
		gunModel[514] = new ModelRendererTurbo(this, 457, 305, textureX, textureY); // Import Box0
		gunModel[515] = new ModelRendererTurbo(this, 89, 249, textureX, textureY); // Import Box0
		gunModel[516] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Import Box0
		gunModel[517] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Import Box0
		gunModel[518] = new ModelRendererTurbo(this, 481, 313, textureX, textureY); // Import Box0
		gunModel[519] = new ModelRendererTurbo(this, 241, 321, textureX, textureY); // Import Box0
		gunModel[520] = new ModelRendererTurbo(this, 17, 265, textureX, textureY); // Import Box0
		gunModel[521] = new ModelRendererTurbo(this, 345, 321, textureX, textureY); // Import Box0
		gunModel[522] = new ModelRendererTurbo(this, 401, 273, textureX, textureY); // Import Box0
		gunModel[523] = new ModelRendererTurbo(this, 89, 329, textureX, textureY); // Import Box0
		gunModel[524] = new ModelRendererTurbo(this, 121, 329, textureX, textureY); // Import Box0
		gunModel[525] = new ModelRendererTurbo(this, 153, 329, textureX, textureY); // Import Box0
		gunModel[526] = new ModelRendererTurbo(this, 185, 329, textureX, textureY); // Import Box0
		gunModel[527] = new ModelRendererTurbo(this, 217, 329, textureX, textureY); // Import Box0
		gunModel[528] = new ModelRendererTurbo(this, 265, 329, textureX, textureY); // Import Box0
		gunModel[529] = new ModelRendererTurbo(this, 297, 329, textureX, textureY); // Import Box0
		gunModel[530] = new ModelRendererTurbo(this, 329, 329, textureX, textureY); // Import Box0
		gunModel[531] = new ModelRendererTurbo(this, 361, 329, textureX, textureY); // Import Box0
		gunModel[532] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Import Box0
		gunModel[533] = new ModelRendererTurbo(this, 425, 329, textureX, textureY); // Import Box0
		gunModel[534] = new ModelRendererTurbo(this, 457, 329, textureX, textureY); // Import Box0
		gunModel[535] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Import Box0
		gunModel[536] = new ModelRendererTurbo(this, 33, 337, textureX, textureY); // Import Box0
		gunModel[537] = new ModelRendererTurbo(this, 65, 337, textureX, textureY); // Import Box0
		gunModel[538] = new ModelRendererTurbo(this, 105, 337, textureX, textureY); // Import Box0
		gunModel[539] = new ModelRendererTurbo(this, 137, 337, textureX, textureY); // Import Box0
		gunModel[540] = new ModelRendererTurbo(this, 169, 337, textureX, textureY); // Import Box0
		gunModel[541] = new ModelRendererTurbo(this, 201, 337, textureX, textureY); // Import Box0
		gunModel[542] = new ModelRendererTurbo(this, 281, 337, textureX, textureY); // Import Box0
		gunModel[543] = new ModelRendererTurbo(this, 377, 337, textureX, textureY); // Import Box0
		gunModel[544] = new ModelRendererTurbo(this, 313, 337, textureX, textureY); // Import Box0
		gunModel[545] = new ModelRendererTurbo(this, 345, 337, textureX, textureY); // Import Box0
		gunModel[546] = new ModelRendererTurbo(this, 441, 337, textureX, textureY); // Import Box0
		gunModel[547] = new ModelRendererTurbo(this, 409, 337, textureX, textureY); // Import Box0
		gunModel[548] = new ModelRendererTurbo(this, 481, 337, textureX, textureY); // Import Box0
		gunModel[549] = new ModelRendererTurbo(this, 17, 345, textureX, textureY); // Import Box0
		gunModel[550] = new ModelRendererTurbo(this, 49, 345, textureX, textureY); // Import Box0
		gunModel[551] = new ModelRendererTurbo(this, 89, 345, textureX, textureY); // Import Box0
		gunModel[552] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Import Box0
		gunModel[553] = new ModelRendererTurbo(this, 217, 345, textureX, textureY); // Import Box0
		gunModel[554] = new ModelRendererTurbo(this, 185, 345, textureX, textureY); // Import Box0
		gunModel[555] = new ModelRendererTurbo(this, 249, 345, textureX, textureY); // Import Box0
		gunModel[556] = new ModelRendererTurbo(this, 393, 345, textureX, textureY); // Import Box0
		gunModel[557] = new ModelRendererTurbo(this, 329, 345, textureX, textureY); // Import Box0
		gunModel[558] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Import Box0
		gunModel[559] = new ModelRendererTurbo(this, 361, 345, textureX, textureY); // Import Box0
		gunModel[560] = new ModelRendererTurbo(this, 425, 345, textureX, textureY); // Import Box0
		gunModel[561] = new ModelRendererTurbo(this, 73, 353, textureX, textureY); // Import Box0
		gunModel[562] = new ModelRendererTurbo(this, 33, 353, textureX, textureY); // Import Box0
		gunModel[563] = new ModelRendererTurbo(this, 105, 353, textureX, textureY); // Import Box0
		gunModel[564] = new ModelRendererTurbo(this, 169, 353, textureX, textureY); // Import Box0
		gunModel[565] = new ModelRendererTurbo(this, 201, 353, textureX, textureY); // Import Box0
		gunModel[566] = new ModelRendererTurbo(this, 233, 353, textureX, textureY); // Import Box0
		gunModel[567] = new ModelRendererTurbo(this, 265, 353, textureX, textureY); // Import Box0
		gunModel[568] = new ModelRendererTurbo(this, 297, 353, textureX, textureY); // Import Box0
		gunModel[569] = new ModelRendererTurbo(this, 345, 353, textureX, textureY); // Import Box0
		gunModel[570] = new ModelRendererTurbo(this, 377, 353, textureX, textureY); // Import Box0
		gunModel[571] = new ModelRendererTurbo(this, 409, 353, textureX, textureY); // Import Box0
		gunModel[572] = new ModelRendererTurbo(this, 441, 353, textureX, textureY); // Import Box0
		gunModel[573] = new ModelRendererTurbo(this, 473, 353, textureX, textureY); // Import Box0
		gunModel[574] = new ModelRendererTurbo(this, 49, 361, textureX, textureY); // Import Box0
		gunModel[575] = new ModelRendererTurbo(this, 89, 361, textureX, textureY); // Import Box0
		gunModel[576] = new ModelRendererTurbo(this, 121, 361, textureX, textureY); // Import Box0
		gunModel[577] = new ModelRendererTurbo(this, 153, 361, textureX, textureY); // Import Box0
		gunModel[578] = new ModelRendererTurbo(this, 249, 361, textureX, textureY); // Import Box0
		gunModel[579] = new ModelRendererTurbo(this, 217, 361, textureX, textureY); // Import Box0
		gunModel[580] = new ModelRendererTurbo(this, 281, 361, textureX, textureY); // Import Box0
		gunModel[581] = new ModelRendererTurbo(this, 313, 361, textureX, textureY); // Import Box0
		gunModel[582] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Import Box0
		gunModel[583] = new ModelRendererTurbo(this, 425, 361, textureX, textureY); // Import Box0
		gunModel[584] = new ModelRendererTurbo(this, 457, 361, textureX, textureY); // Import Box0
		gunModel[585] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Import Box0
		gunModel[586] = new ModelRendererTurbo(this, 33, 369, textureX, textureY); // Import Box0
		gunModel[587] = new ModelRendererTurbo(this, 65, 369, textureX, textureY); // Import Box0
		gunModel[588] = new ModelRendererTurbo(this, 137, 369, textureX, textureY); // Import Box0
		gunModel[589] = new ModelRendererTurbo(this, 105, 369, textureX, textureY); // Import Box0
		gunModel[590] = new ModelRendererTurbo(this, 185, 369, textureX, textureY); // Import Box0
		gunModel[591] = new ModelRendererTurbo(this, 265, 369, textureX, textureY); // Import Box0
		gunModel[592] = new ModelRendererTurbo(this, 233, 369, textureX, textureY); // Import Box0
		gunModel[593] = new ModelRendererTurbo(this, 329, 369, textureX, textureY); // Import Box0
		gunModel[594] = new ModelRendererTurbo(this, 297, 369, textureX, textureY); // Import Box0
		gunModel[595] = new ModelRendererTurbo(this, 361, 369, textureX, textureY); // Import Box0
		gunModel[596] = new ModelRendererTurbo(this, 441, 369, textureX, textureY); // Import Box0
		gunModel[597] = new ModelRendererTurbo(this, 409, 369, textureX, textureY); // Import Box0
		gunModel[598] = new ModelRendererTurbo(this, 481, 369, textureX, textureY); // Import Box0
		gunModel[599] = new ModelRendererTurbo(this, 17, 377, textureX, textureY); // Import Box0
		gunModel[600] = new ModelRendererTurbo(this, 81, 377, textureX, textureY); // Import Box0
		gunModel[601] = new ModelRendererTurbo(this, 153, 377, textureX, textureY); // Import Box0
		gunModel[602] = new ModelRendererTurbo(this, 121, 377, textureX, textureY); // Import Box0
		gunModel[603] = new ModelRendererTurbo(this, 281, 377, textureX, textureY); // Import Box0
		gunModel[604] = new ModelRendererTurbo(this, 201, 377, textureX, textureY); // Import Box0
		gunModel[605] = new ModelRendererTurbo(this, 249, 377, textureX, textureY); // Import Box0
		gunModel[606] = new ModelRendererTurbo(this, 345, 377, textureX, textureY); // Import Box0
		gunModel[607] = new ModelRendererTurbo(this, 313, 377, textureX, textureY); // Import Box0
		gunModel[608] = new ModelRendererTurbo(this, 385, 377, textureX, textureY); // Import Box0
		gunModel[609] = new ModelRendererTurbo(this, 425, 377, textureX, textureY); // Import Box0
		gunModel[610] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Import Box0
		gunModel[611] = new ModelRendererTurbo(this, 41, 385, textureX, textureY); // Import Box0
		gunModel[612] = new ModelRendererTurbo(this, 137, 385, textureX, textureY); // Import Box0
		gunModel[613] = new ModelRendererTurbo(this, 169, 385, textureX, textureY); // Import Box0
		gunModel[614] = new ModelRendererTurbo(this, 217, 385, textureX, textureY); // Import Box0
		gunModel[615] = new ModelRendererTurbo(this, 265, 385, textureX, textureY); // Import Box0
		gunModel[616] = new ModelRendererTurbo(this, 361, 385, textureX, textureY); // Import Box0
		gunModel[617] = new ModelRendererTurbo(this, 329, 385, textureX, textureY); // Import Box0
		gunModel[618] = new ModelRendererTurbo(this, 401, 385, textureX, textureY); // Import Box0
		gunModel[619] = new ModelRendererTurbo(this, 441, 385, textureX, textureY); // Import Box0
		gunModel[620] = new ModelRendererTurbo(this, 473, 385, textureX, textureY); // Import Box0
		gunModel[621] = new ModelRendererTurbo(this, 57, 393, textureX, textureY); // Import Box0
		gunModel[622] = new ModelRendererTurbo(this, 89, 393, textureX, textureY); // Import Box0
		gunModel[623] = new ModelRendererTurbo(this, 121, 393, textureX, textureY); // Import Box0
		gunModel[624] = new ModelRendererTurbo(this, 153, 393, textureX, textureY); // Import Box0
		gunModel[625] = new ModelRendererTurbo(this, 185, 393, textureX, textureY); // Import Box0
		gunModel[626] = new ModelRendererTurbo(this, 241, 393, textureX, textureY); // Import Box0
		gunModel[627] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Import Box0
		gunModel[628] = new ModelRendererTurbo(this, 313, 393, textureX, textureY); // Import Box0
		gunModel[629] = new ModelRendererTurbo(this, 345, 393, textureX, textureY); // Import Box0
		gunModel[630] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Import Box0
		gunModel[631] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Import Box0
		gunModel[632] = new ModelRendererTurbo(this, 457, 393, textureX, textureY); // Import Box0
		gunModel[633] = new ModelRendererTurbo(this, 33, 401, textureX, textureY); // Import Box0
		gunModel[634] = new ModelRendererTurbo(this, 73, 401, textureX, textureY); // Import Box0
		gunModel[635] = new ModelRendererTurbo(this, 105, 401, textureX, textureY); // Import Box0
		gunModel[636] = new ModelRendererTurbo(this, 137, 401, textureX, textureY); // Import Box0
		gunModel[637] = new ModelRendererTurbo(this, 169, 401, textureX, textureY); // Import Box0
		gunModel[638] = new ModelRendererTurbo(this, 257, 401, textureX, textureY); // Import Box0
		gunModel[639] = new ModelRendererTurbo(this, 201, 401, textureX, textureY); // Import Box0
		gunModel[640] = new ModelRendererTurbo(this, 297, 401, textureX, textureY); // Import Box0
		gunModel[641] = new ModelRendererTurbo(this, 329, 401, textureX, textureY); // Import Box0
		gunModel[642] = new ModelRendererTurbo(this, 361, 401, textureX, textureY); // Import Box0
		gunModel[643] = new ModelRendererTurbo(this, 401, 401, textureX, textureY); // Import Box0
		gunModel[644] = new ModelRendererTurbo(this, 473, 401, textureX, textureY); // Import Box0
		gunModel[645] = new ModelRendererTurbo(this, 17, 409, textureX, textureY); // Import Box0
		gunModel[646] = new ModelRendererTurbo(this, 49, 409, textureX, textureY); // Import Box0
		gunModel[647] = new ModelRendererTurbo(this, 89, 409, textureX, textureY); // Import Box0
		gunModel[648] = new ModelRendererTurbo(this, 225, 409, textureX, textureY); // Import Box0
		gunModel[649] = new ModelRendererTurbo(this, 121, 409, textureX, textureY); // Import Box0
		gunModel[650] = new ModelRendererTurbo(this, 185, 409, textureX, textureY); // Import Box0
		gunModel[651] = new ModelRendererTurbo(this, 273, 409, textureX, textureY); // Import Box0
		gunModel[652] = new ModelRendererTurbo(this, 313, 409, textureX, textureY); // Import Box0
		gunModel[653] = new ModelRendererTurbo(this, 385, 409, textureX, textureY); // Import Box0
		gunModel[654] = new ModelRendererTurbo(this, 417, 409, textureX, textureY); // Import Box0
		gunModel[655] = new ModelRendererTurbo(this, 449, 409, textureX, textureY); // Import Box0
		gunModel[656] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Import Box0
		gunModel[657] = new ModelRendererTurbo(this, 33, 417, textureX, textureY); // Import Box0
		gunModel[658] = new ModelRendererTurbo(this, 145, 417, textureX, textureY); // Import Box0
		gunModel[659] = new ModelRendererTurbo(this, 105, 417, textureX, textureY); // Import Box0
		gunModel[660] = new ModelRendererTurbo(this, 241, 417, textureX, textureY); // Import Box0
		gunModel[661] = new ModelRendererTurbo(this, 289, 417, textureX, textureY); // Import Box0
		gunModel[662] = new ModelRendererTurbo(this, 329, 417, textureX, textureY); // Import Box0
		gunModel[663] = new ModelRendererTurbo(this, 361, 417, textureX, textureY); // Import Box0

		gunModel[500].addShapeBox(14F, -8F, -4F, 31, 3, 9, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[500].setRotationPoint(74.5F, -21.5F, -0.5F);

		gunModel[501].addShapeBox(14F, -8F, -4F, 31, 2, 9, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[501].setRotationPoint(74.5F, -23.5F, -0.5F);

		gunModel[502].addShapeBox(14F, -8F, -4F, 31, 1, 7, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[502].setRotationPoint(74.5F, -24.5F, 0.5F);

		gunModel[503].addShapeBox(14F, -8F, -4F, 31, 2, 9, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Import Box0
		gunModel[503].setRotationPoint(74.5F, -18.5F, -0.5F);

		gunModel[504].addShapeBox(14F, -8F, -4F, 31, 1, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, -2F); // Import Box0
		gunModel[504].setRotationPoint(74.5F, -16.5F, 0.5F);

		gunModel[505].addShapeBox(14F, -8F, -4F, 43, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[505].setRotationPoint(30F, -14F, 1.5F);

		gunModel[506].addShapeBox(14F, -8F, -4F, 43, 1, 5, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[506].setRotationPoint(30F, -13F, 1.5F);

		gunModel[507].addShapeBox(14F, -8F, -4F, 43, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Import Box0
		gunModel[507].setRotationPoint(30F, -13.5F, 1.5F);

		gunModel[508].addShapeBox(14F, -8F, -4F, 43, 1, 5, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box0
		gunModel[508].setRotationPoint(30F, -13.5F, 1.5F);

		gunModel[509].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[509].setRotationPoint(28F, -22F, -2.5F);

		gunModel[510].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[510].setRotationPoint(28F, -24F, -2.5F);

		gunModel[511].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[511].setRotationPoint(28F, -26F, -2F);

		gunModel[512].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[512].setRotationPoint(28F, -18F, -2.5F);

		gunModel[513].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[513].setRotationPoint(28F, -16F, -2F);

		gunModel[514].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[514].setRotationPoint(29.5F, -22F, -2.5F);

		gunModel[515].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[515].setRotationPoint(29.5F, -24F, -2.5F);

		gunModel[516].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[516].setRotationPoint(29.5F, -26F, -2F);

		gunModel[517].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[517].setRotationPoint(29.5F, -18F, -2.5F);

		gunModel[518].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[518].setRotationPoint(29.5F, -16F, -2F);

		gunModel[519].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[519].setRotationPoint(31F, -22F, -2.5F);

		gunModel[520].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[520].setRotationPoint(31F, -24F, -2.5F);

		gunModel[521].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[521].setRotationPoint(31F, -26F, -2F);

		gunModel[522].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[522].setRotationPoint(31F, -18F, -2.5F);

		gunModel[523].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[523].setRotationPoint(31F, -16F, -2F);

		gunModel[524].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[524].setRotationPoint(32.5F, -22F, -2.5F);

		gunModel[525].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[525].setRotationPoint(32.5F, -24F, -2.5F);

		gunModel[526].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[526].setRotationPoint(32.5F, -26F, -2F);

		gunModel[527].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[527].setRotationPoint(32.5F, -18F, -2.5F);

		gunModel[528].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[528].setRotationPoint(32.5F, -16F, -2F);

		gunModel[529].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[529].setRotationPoint(34F, -22F, -2.5F);

		gunModel[530].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[530].setRotationPoint(34F, -24F, -2.5F);

		gunModel[531].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[531].setRotationPoint(34F, -26F, -2F);

		gunModel[532].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[532].setRotationPoint(34F, -18F, -2.5F);

		gunModel[533].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[533].setRotationPoint(34F, -16F, -2F);

		gunModel[534].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[534].setRotationPoint(35.5F, -22F, -2.5F);

		gunModel[535].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[535].setRotationPoint(35.5F, -24F, -2.5F);

		gunModel[536].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[536].setRotationPoint(35.5F, -26F, -2F);

		gunModel[537].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[537].setRotationPoint(35.5F, -18F, -2.5F);

		gunModel[538].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[538].setRotationPoint(35.5F, -16F, -2F);

		gunModel[539].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[539].setRotationPoint(37F, -22F, -2.5F);

		gunModel[540].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[540].setRotationPoint(37F, -24F, -2.5F);

		gunModel[541].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[541].setRotationPoint(37F, -26F, -2F);

		gunModel[542].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[542].setRotationPoint(37F, -18F, -2.5F);

		gunModel[543].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[543].setRotationPoint(37F, -16F, -2F);

		gunModel[544].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[544].setRotationPoint(38.5F, -22F, -2.5F);

		gunModel[545].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[545].setRotationPoint(38.5F, -24F, -2.5F);

		gunModel[546].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[546].setRotationPoint(38.5F, -26F, -2F);

		gunModel[547].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[547].setRotationPoint(38.5F, -18F, -2.5F);

		gunModel[548].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[548].setRotationPoint(38.5F, -16F, -2F);

		gunModel[549].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[549].setRotationPoint(40F, -22F, -2.5F);

		gunModel[550].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[550].setRotationPoint(40F, -24F, -2.5F);

		gunModel[551].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[551].setRotationPoint(40F, -26F, -2F);

		gunModel[552].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[552].setRotationPoint(40F, -18F, -2.5F);

		gunModel[553].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[553].setRotationPoint(40F, -16F, -2F);

		gunModel[554].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[554].setRotationPoint(41.5F, -22F, -2.5F);

		gunModel[555].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[555].setRotationPoint(41.5F, -24F, -2.5F);

		gunModel[556].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[556].setRotationPoint(41.5F, -26F, -2F);

		gunModel[557].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[557].setRotationPoint(41.5F, -18F, -2.5F);

		gunModel[558].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[558].setRotationPoint(41.5F, -16F, -2F);

		gunModel[559].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[559].setRotationPoint(43F, -22F, -2.5F);

		gunModel[560].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[560].setRotationPoint(43F, -24F, -2.5F);

		gunModel[561].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[561].setRotationPoint(43F, -26F, -2F);

		gunModel[562].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[562].setRotationPoint(43F, -18F, -2.5F);

		gunModel[563].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[563].setRotationPoint(43F, -16F, -2F);

		gunModel[564].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[564].setRotationPoint(44.5F, -22F, -2.5F);

		gunModel[565].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[565].setRotationPoint(44.5F, -24F, -2.5F);

		gunModel[566].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[566].setRotationPoint(44.5F, -26F, -2F);

		gunModel[567].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[567].setRotationPoint(44.5F, -18F, -2.5F);

		gunModel[568].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[568].setRotationPoint(44.5F, -16F, -2F);

		gunModel[569].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[569].setRotationPoint(46F, -22F, -2.5F);

		gunModel[570].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[570].setRotationPoint(46F, -24F, -2.5F);

		gunModel[571].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[571].setRotationPoint(46F, -26F, -2F);

		gunModel[572].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[572].setRotationPoint(46F, -18F, -2.5F);

		gunModel[573].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[573].setRotationPoint(46F, -16F, -2F);

		gunModel[574].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[574].setRotationPoint(47.5F, -22F, -2.5F);

		gunModel[575].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[575].setRotationPoint(47.5F, -24F, -2.5F);

		gunModel[576].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[576].setRotationPoint(47.5F, -26F, -2F);

		gunModel[577].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[577].setRotationPoint(47.5F, -18F, -2.5F);

		gunModel[578].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[578].setRotationPoint(47.5F, -16F, -2F);

		gunModel[579].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[579].setRotationPoint(49F, -22F, -2.5F);

		gunModel[580].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[580].setRotationPoint(49F, -24F, -2.5F);

		gunModel[581].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[581].setRotationPoint(49F, -26F, -2F);

		gunModel[582].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[582].setRotationPoint(49F, -18F, -2.5F);

		gunModel[583].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[583].setRotationPoint(49F, -16F, -2F);

		gunModel[584].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[584].setRotationPoint(50.5F, -22F, -2.5F);

		gunModel[585].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[585].setRotationPoint(50.5F, -24F, -2.5F);

		gunModel[586].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[586].setRotationPoint(50.5F, -26F, -2F);

		gunModel[587].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[587].setRotationPoint(50.5F, -18F, -2.5F);

		gunModel[588].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[588].setRotationPoint(50.5F, -16F, -2F);

		gunModel[589].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[589].setRotationPoint(52F, -22F, -2.5F);

		gunModel[590].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[590].setRotationPoint(52F, -24F, -2.5F);

		gunModel[591].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[591].setRotationPoint(52F, -26F, -2F);

		gunModel[592].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[592].setRotationPoint(52F, -18F, -2.5F);

		gunModel[593].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[593].setRotationPoint(52F, -16F, -2F);

		gunModel[594].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[594].setRotationPoint(53.5F, -22F, -2.5F);

		gunModel[595].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[595].setRotationPoint(53.5F, -24F, -2.5F);

		gunModel[596].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[596].setRotationPoint(53.5F, -26F, -2F);

		gunModel[597].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[597].setRotationPoint(53.5F, -18F, -2.5F);

		gunModel[598].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[598].setRotationPoint(53.5F, -16F, -2F);

		gunModel[599].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[599].setRotationPoint(55F, -22F, -2.5F);

		gunModel[600].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[600].setRotationPoint(55F, -24F, -2.5F);

		gunModel[601].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[601].setRotationPoint(55F, -26F, -2F);

		gunModel[602].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[602].setRotationPoint(55F, -18F, -2.5F);

		gunModel[603].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[603].setRotationPoint(55F, -16F, -2F);

		gunModel[604].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[604].setRotationPoint(56.5F, -22F, -2.5F);

		gunModel[605].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[605].setRotationPoint(56.5F, -24F, -2.5F);

		gunModel[606].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[606].setRotationPoint(56.5F, -26F, -2F);

		gunModel[607].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[607].setRotationPoint(56.5F, -18F, -2.5F);

		gunModel[608].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[608].setRotationPoint(56.5F, -16F, -2F);

		gunModel[609].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[609].setRotationPoint(58F, -22F, -2.5F);

		gunModel[610].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[610].setRotationPoint(58F, -24F, -2.5F);

		gunModel[611].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[611].setRotationPoint(58F, -26F, -2F);

		gunModel[612].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[612].setRotationPoint(58F, -18F, -2.5F);

		gunModel[613].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[613].setRotationPoint(58F, -16F, -2F);

		gunModel[614].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[614].setRotationPoint(59.5F, -22F, -2.5F);

		gunModel[615].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[615].setRotationPoint(59.5F, -24F, -2.5F);

		gunModel[616].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[616].setRotationPoint(59.5F, -26F, -2F);

		gunModel[617].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[617].setRotationPoint(59.5F, -18F, -2.5F);

		gunModel[618].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[618].setRotationPoint(59.5F, -16F, -2F);

		gunModel[619].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[619].setRotationPoint(61F, -22F, -2.5F);

		gunModel[620].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[620].setRotationPoint(61F, -24F, -2.5F);

		gunModel[621].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[621].setRotationPoint(61F, -26F, -2F);

		gunModel[622].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[622].setRotationPoint(61F, -18F, -2.5F);

		gunModel[623].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[623].setRotationPoint(61F, -16F, -2F);

		gunModel[624].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[624].setRotationPoint(62.5F, -22F, -2.5F);

		gunModel[625].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[625].setRotationPoint(62.5F, -24F, -2.5F);

		gunModel[626].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[626].setRotationPoint(62.5F, -26F, -2F);

		gunModel[627].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[627].setRotationPoint(62.5F, -18F, -2.5F);

		gunModel[628].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[628].setRotationPoint(62.5F, -16F, -2F);

		gunModel[629].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[629].setRotationPoint(64F, -22F, -2.5F);

		gunModel[630].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[630].setRotationPoint(64F, -24F, -2.5F);

		gunModel[631].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[631].setRotationPoint(64F, -26F, -2F);

		gunModel[632].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[632].setRotationPoint(64F, -18F, -2.5F);

		gunModel[633].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[633].setRotationPoint(64F, -16F, -2F);

		gunModel[634].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[634].setRotationPoint(65.5F, -22F, -2.5F);

		gunModel[635].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[635].setRotationPoint(65.5F, -24F, -2.5F);

		gunModel[636].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[636].setRotationPoint(65.5F, -26F, -2F);

		gunModel[637].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[637].setRotationPoint(65.5F, -18F, -2.5F);

		gunModel[638].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[638].setRotationPoint(65.5F, -16F, -2F);

		gunModel[639].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[639].setRotationPoint(67F, -22F, -2.5F);

		gunModel[640].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[640].setRotationPoint(67F, -24F, -2.5F);

		gunModel[641].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[641].setRotationPoint(67F, -26F, -2F);

		gunModel[642].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[642].setRotationPoint(67F, -18F, -2.5F);

		gunModel[643].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[643].setRotationPoint(67F, -16F, -2F);

		gunModel[644].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[644].setRotationPoint(68.5F, -22F, -2.5F);

		gunModel[645].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[645].setRotationPoint(68.5F, -24F, -2.5F);

		gunModel[646].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[646].setRotationPoint(68.5F, -26F, -2F);

		gunModel[647].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[647].setRotationPoint(68.5F, -18F, -2.5F);

		gunModel[648].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[648].setRotationPoint(68.5F, -16F, -2F);

		gunModel[649].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[649].setRotationPoint(70F, -22F, -2.5F);

		gunModel[650].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[650].setRotationPoint(70F, -24F, -2.5F);

		gunModel[651].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[651].setRotationPoint(70F, -26F, -2F);

		gunModel[652].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[652].setRotationPoint(70F, -18F, -2.5F);

		gunModel[653].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[653].setRotationPoint(70F, -16F, -2F);

		gunModel[654].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[654].setRotationPoint(71.5F, -22F, -2.5F);

		gunModel[655].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[655].setRotationPoint(71.5F, -24F, -2.5F);

		gunModel[656].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[656].setRotationPoint(71.5F, -26F, -2F);

		gunModel[657].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[657].setRotationPoint(71.5F, -18F, -2.5F);

		gunModel[658].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[658].setRotationPoint(71.5F, -16F, -2F);

		gunModel[659].addShapeBox(14F, -8F, -4F, 1, 4, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[659].setRotationPoint(73F, -22F, -2.5F);

		gunModel[660].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[660].setRotationPoint(73F, -24F, -2.5F);

		gunModel[661].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box0
		gunModel[661].setRotationPoint(73F, -26F, -2F);

		gunModel[662].addShapeBox(14F, -8F, -4F, 1, 2, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Import Box0
		gunModel[662].setRotationPoint(73F, -18F, -2.5F);

		gunModel[663].addShapeBox(14F, -8F, -4F, 1, 2, 12, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F); // Import Box0
		gunModel[663].setRotationPoint(73F, -16F, -2F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Import Box0
		ammoModel[5] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Import Box0
		ammoModel[6] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Import Box0
		ammoModel[7] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Import Box0
		ammoModel[8] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Import Box0
		ammoModel[9] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Import Box0
		ammoModel[10] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Import Box0
		ammoModel[11] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Import Box0
		ammoModel[12] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Import Box0
		ammoModel[13] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Import Box0
		ammoModel[14] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Import Box0
		ammoModel[15] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Import Box0
		ammoModel[16] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Import Box0
		ammoModel[17] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Import Box0
		ammoModel[18] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box0
		ammoModel[19] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Import Box0
		ammoModel[20] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Import Box0
		ammoModel[21] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Import Box0
		ammoModel[22] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Import Box0
		ammoModel[23] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Import Box0
		ammoModel[24] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Import Box0
		ammoModel[25] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import Box0
		ammoModel[26] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Import Box0
		ammoModel[27] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Import Box0
		ammoModel[28] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Import Box0
		ammoModel[29] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Import Box0
		ammoModel[30] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Import Box0
		ammoModel[31] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Import Box0
		ammoModel[32] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Import Box0
		ammoModel[33] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Import Box0
		ammoModel[34] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Import Box0
		ammoModel[35] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Import Box0
		ammoModel[36] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Import Box0
		ammoModel[37] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Import Box0
		ammoModel[38] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box0
		ammoModel[39] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Import Box0
		ammoModel[40] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Import Box0
		ammoModel[41] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Import Box0

		ammoModel[0].addShapeBox(14F, -8F, -4F, 6, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F); // Import Box0
		ammoModel[0].setRotationPoint(14.75F, -3.5F, 0.25F);

		ammoModel[1].addShapeBox(14F, -8F, -4F, 6, 4, 7, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F); // Import Box0
		ammoModel[1].setRotationPoint(15.75F, 0.5F, 0.25F);

		ammoModel[2].addShapeBox(14F, -8F, -4F, 6, 7, 7, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F); // Import Box0
		ammoModel[2].setRotationPoint(16.75F, 4.5F, 0.25F);

		ammoModel[3].addShapeBox(14F, -8F, -4F, 6, 7, 7, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, 0F, 0F); // Import Box0
		ammoModel[3].setRotationPoint(18.75F, 11.5F, 0.25F);

		ammoModel[4].addShapeBox(14F, -8F, -4F, 6, 7, 7, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2.75F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -2.75F, 0F, 0F); // Import Box0
		ammoModel[4].setRotationPoint(21.25F, 18.5F, 0.25F);

		ammoModel[5].addShapeBox(14F, -8F, -4F, 6, 7, 7, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3F, 0F, 0F); // Import Box0
		ammoModel[5].setRotationPoint(24.5F, 25.5F, 0.25F);

		ammoModel[6].addShapeBox(14F, -8F, -4F, 6, 6, 7, 0F,1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -2.5F, 0F, 0F, 1F, -3.75F, 0F, 1F, -3.75F, 0F, -2.5F, 0F, 0F); // Import Box0
		ammoModel[6].setRotationPoint(28.5F, 32.5F, 0.25F);

		ammoModel[7].addShapeBox(14F, -8F, -4F, 6, 4, 7, 0F,-1.5F, -4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.5F, -4F, 0F, -2F, 0.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, -2F, 0.25F, 0F); // Import Box0
		ammoModel[7].setRotationPoint(29.5F, 34.5F, 0.25F);

		ammoModel[8].addShapeBox(14F, -8F, -4F, 4, 2, 7, 0F,0F, -0.5F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[8].setRotationPoint(35.5F, 34.25F, 0.25F);

		ammoModel[9].addShapeBox(14F, -8F, -4F, 1, 2, 7, 0F,0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.1F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.1F, 0F); // Import Box0
		ammoModel[9].setRotationPoint(37.5F, 32.5F, 0.25F);

		ammoModel[10].addShapeBox(14F, -8F, -4F, 1, 7, 7, 0F,1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 3.35F, 0F, 0F, 3.35F, 0F, 0F, -3F, 0F, 0F); // Import Box0
		ammoModel[10].setRotationPoint(34F, 25.5F, 0.25F);

		ammoModel[11].addShapeBox(14F, -8F, -4F, 1, 7, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.75F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, -2.75F, 0F, 0F); // Import Box0
		ammoModel[11].setRotationPoint(30.25F, 18.5F, 0.25F);

		ammoModel[12].addShapeBox(14F, -8F, -4F, 2, 7, 7, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F); // Import Box0
		ammoModel[12].setRotationPoint(25.5F, 4.5F, 0.25F);

		ammoModel[13].addShapeBox(14F, -8F, -4F, 2, 7, 7, 0F,0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, -2.25F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -2.25F, 0F, 0F); // Import Box0
		ammoModel[13].setRotationPoint(27.5F, 11.5F, 0.25F);

		ammoModel[14].addShapeBox(14F, -8F, -4F, 1, 4, 7, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.75F, 0F, 0F); // Import Box0
		ammoModel[14].setRotationPoint(23.25F, -3.5F, 0.25F);

		ammoModel[15].addShapeBox(14F, -8F, -4F, 1, 4, 7, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.75F, 0F, 0F); // Import Box0
		ammoModel[15].setRotationPoint(24.25F, 0.5F, 0.25F);

		ammoModel[16].addShapeBox(14F, -8F, -4F, 1, 4, 7, 0F,1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box0
		ammoModel[16].setRotationPoint(23.25F, -7.5F, 0.25F);

		ammoModel[17].addShapeBox(14F, -8F, -4F, 6, 4, 7, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F); // Import Box0
		ammoModel[17].setRotationPoint(14F, -7.5F, 0.25F);

		ammoModel[18].addShapeBox(14F, -8F, -4F, 1, 7, 7, 0F,0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, -0.5F, 2.25F, 0F, -0.5F, -2.25F, 0F, 0F); // Import Box0
		ammoModel[18].setRotationPoint(24.75F, 11.5F, 0.25F);

		ammoModel[19].addShapeBox(14F, -8F, -4F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, -0.75F, 0F, 0F); // Import Box0
		ammoModel[19].setRotationPoint(20.75F, -3.5F, 0.25F);

		ammoModel[20].addShapeBox(14F, -8F, -4F, 1, 4, 7, 0F,0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, -0.75F, 0F, 0F); // Import Box0
		ammoModel[20].setRotationPoint(21.75F, 0.5F, 0.25F);

		ammoModel[21].addShapeBox(14F, -8F, -4F, 1, 7, 7, 0F,0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, -1.75F, 0F, 0F); // Import Box0
		ammoModel[21].setRotationPoint(22.75F, 4.5F, 0.25F);

		ammoModel[22].addShapeBox(14F, -8F, -4F, 1, 7, 7, 0F,0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -2.75F, 0F, 0F, 2.75F, 0F, -0.5F, 2.75F, 0F, -0.5F, -2.75F, 0F, 0F); // Import Box0
		ammoModel[22].setRotationPoint(27.25F, 18.5F, 0.25F);

		ammoModel[23].addShapeBox(14F, -8F, -4F, 1, 7, 7, 0F,0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, -0.5F, 3.5F, 0F, -0.5F, -3.5F, 0F, 0F); // Import Box0
		ammoModel[23].setRotationPoint(30.5F, 25.5F, 0.25F);

		ammoModel[24].addShapeBox(14F, -8F, -4F, 1, 7, 7, 0F,0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F); // Import Box0
		ammoModel[24].setRotationPoint(25.75F, 11.5F, 0.25F);

		ammoModel[25].addShapeBox(14F, -8F, -4F, 1, 4, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Import Box0
		ammoModel[25].setRotationPoint(21.75F, -3.5F, 0.25F);

		ammoModel[26].addShapeBox(14F, -8F, -4F, 1, 4, 7, 0F,0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Import Box0
		ammoModel[26].setRotationPoint(22.75F, 0.5F, 0.25F);

		ammoModel[27].addShapeBox(14F, -8F, -4F, 1, 7, 7, 0F,0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, 1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F); // Import Box0
		ammoModel[27].setRotationPoint(23.75F, 4.5F, 0.25F);

		ammoModel[28].addShapeBox(14F, -8F, -4F, 1, 7, 7, 0F,0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -2.75F, 0F, -0.5F, 2.75F, 0F, -0.5F, 2.75F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Import Box0
		ammoModel[28].setRotationPoint(28.25F, 18.5F, 0.25F);

		ammoModel[29].addShapeBox(14F, -8F, -4F, 1, 7, 7, 0F,0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 3.5F, 0F, -0.5F, 3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Import Box0
		ammoModel[29].setRotationPoint(31.5F, 25.5F, 0.25F);

		ammoModel[30].addShapeBox(14F, -8F, -4F, 1, 2, 7, 0F,0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0.25F, 0F, 1F, -0.4F, 0F, 1F, -0.4F, 0F, -1F, 0.25F, 0F); // Import Box0
		ammoModel[30].setRotationPoint(34.5F, 32.5F, 0.25F);

		ammoModel[31].addShapeBox(14F, -8F, -4F, 1, 7, 7, 0F,1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F, -3F, 0F, -0.5F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, -0.5F); // Import Box0
		ammoModel[31].setRotationPoint(33F, 25.5F, 0.25F);

		ammoModel[32].addShapeBox(14F, -8F, -4F, 1, 7, 7, 0F,0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -2.75F, 0F, -0.5F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -2.75F, 0F, -0.5F); // Import Box0
		ammoModel[32].setRotationPoint(29.25F, 18.5F, 0.25F);

		ammoModel[33].addShapeBox(14F, -8F, -4F, 2, 7, 7, 0F,0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.75F, 0F, -0.5F); // Import Box0
		ammoModel[33].setRotationPoint(24.5F, 4.5F, 0.25F);

		ammoModel[34].addShapeBox(14F, -8F, -4F, 2, 7, 7, 0F,0.25F, 0F, -0.5F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -2.25F, 0F, -0.5F); // Import Box0
		ammoModel[34].setRotationPoint(26.5F, 11.5F, 0.25F);

		ammoModel[35].addShapeBox(14F, -8F, -4F, 1, 4, 7, 0F,0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, -0.5F); // Import Box0
		ammoModel[35].setRotationPoint(22.25F, -3.5F, 0.25F);

		ammoModel[36].addShapeBox(14F, -8F, -4F, 1, 4, 7, 0F,0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, -0.5F); // Import Box0
		ammoModel[36].setRotationPoint(23.25F, 0.5F, 0.25F);

		ammoModel[37].addShapeBox(14F, -8F, -4F, 1, 2, 7, 0F,0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -0.4F, 0F); // Import Box0
		ammoModel[37].setRotationPoint(36.5F, 32.5F, 0.25F);

		ammoModel[38].addShapeBox(14F, -8F, -4F, 1, 2, 7, 0F,0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, -0.4F, 0F, 1F, -1.1F, 0F, 1F, -1.1F, 0F, -1F, -0.4F, 0F); // Import Box0
		ammoModel[38].setRotationPoint(35.5F, 32.5F, 0.25F);

		ammoModel[39].addShapeBox(14F, -8F, -4F, 1, 4, 7, 0F,0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Import Box0
		ammoModel[39].setRotationPoint(20.75F, -7.5F, 0.25F);

		ammoModel[40].addShapeBox(14F, -8F, -4F, 1, 4, 7, 0F,0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box0
		ammoModel[40].setRotationPoint(22F, -7.5F, 0.25F);

		ammoModel[41].addShapeBox(14F, -8F, -4F, 1, 4, 7, 0F,0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		ammoModel[41].setRotationPoint(21.75F, -7.5F, 0.25F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Import Box0
		slideModel[1] = new ModelRendererTurbo(this, 425, 257, textureX, textureY); // Import Box0
		slideModel[2] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Import Box0
		slideModel[3] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Import Box0
		slideModel[4] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Import Box0
		slideModel[5] = new ModelRendererTurbo(this, 385, 273, textureX, textureY); // Import Box0

		slideModel[0].addShapeBox(14F, -8F, -4F, 11, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		slideModel[0].setRotationPoint(7F, -24.5F, 0F);

		slideModel[1].addShapeBox(14F, -8F, -4F, 11, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		slideModel[1].setRotationPoint(7F, -25.5F, 1F);

		slideModel[2].addShapeBox(14F, -8F, -4F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		slideModel[2].setRotationPoint(7F, -26.5F, 2F);

		slideModel[3].addShapeBox(14F, -8F, -4F, 11, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		slideModel[3].setRotationPoint(7F, -27.5F, 2F);

		slideModel[4].addShapeBox(14F, -8F, -4F, 11, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		slideModel[4].setRotationPoint(7F, -28.5F, 2F);

		slideModel[5].addShapeBox(14F, -8F, -4F, 11, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		slideModel[5].setRotationPoint(7F, -29.5F, 2F);
	}
}