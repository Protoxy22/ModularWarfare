//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ragingjudge
// Model Creator: 
// Created on: 01.02.2019 - 17:44:30
// Last changed on: 01.02.2019 - 17:44:30

package com.modularwarfare.client.model.mwp; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class ragingjudge extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ragingjudge() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[394];
		ammoModel = new ModelRendererTurbo[85];
		leverActionModel = new ModelRendererTurbo[8];
		revolverBarrelModel = new ModelRendererTurbo[82];
		hammerModel = new ModelRendererTurbo[15];

		initgunModel_1();
		initammoModel_1();
		initleverActionModel_1();
		initrevolverBarrelModel_1();
		inithammerModel_1();

		modelScale = 0.09F;
		translateAll = new Vector3f(17F, -20F, 0F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.10F, 0F);//forward/up/? 
		
		hammerSpinPoint = new Vector3f(0.5F, 2.1F, 0F);
		rotationHelper = new Vector3f(0.5F, 2.1F, 0F);
		revolverFlipAngle = 15F;

		gunSlideDistance = 0F;
		///animationType = EnumAnimationType.CUSTOM;

		tiltGun = 0F;
		rotateGunVertical = 0F;
		translateGun = new Vector3f(0F, -2, 0F);

		rotateClipVertical = 0F;
		translateClip = new Vector3f(0F, -3F, 0F);
		
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
        
        rightArmScale = new Vector3f(0.8F, 0.8F, 0.8F);
        leftArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
       // hasArms = true;
        
		crouchZoom = -0.10F;
		fancyStance = true;
		//sprintRotate = new Vector3f(-5.0F, 0.0F, 40.0F);
		//sprintTranslate = new Vector3f(0.4F, -0.2F, -0.1F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box0
		gunModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box0
		gunModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box0
		gunModel[11] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box0
		gunModel[12] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box0
		gunModel[13] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Import Box0
		gunModel[14] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box0
		gunModel[15] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Import Box0
		gunModel[16] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box0
		gunModel[17] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Import Box0
		gunModel[18] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Import Box0
		gunModel[19] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Import Box0
		gunModel[20] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box0
		gunModel[21] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Import Box0
		gunModel[22] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import Box0
		gunModel[23] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Import Box0
		gunModel[24] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import Box0
		gunModel[25] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import Box0
		gunModel[26] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box0
		gunModel[27] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import Box0
		gunModel[28] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import Box0
		gunModel[29] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import Box0
		gunModel[30] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import Box0
		gunModel[31] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import Box0
		gunModel[32] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Import Box0
		gunModel[33] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Import Box0
		gunModel[34] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import Box0
		gunModel[35] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Import Box0
		gunModel[36] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box0
		gunModel[37] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import Box0
		gunModel[38] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Import Box0
		gunModel[39] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import Box0
		gunModel[40] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import Box0
		gunModel[41] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Import Box0
		gunModel[42] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import Box0
		gunModel[43] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Import Box0
		gunModel[44] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Import Box0
		gunModel[45] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Import Box0
		gunModel[46] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Import Box0
		gunModel[47] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Import Box0
		gunModel[48] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Import Box0
		gunModel[49] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Import Box0
		gunModel[50] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import Box0
		gunModel[51] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Import Box0
		gunModel[52] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Import Box0
		gunModel[53] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Import Box0
		gunModel[54] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Import Box0
		gunModel[55] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Import Box0
		gunModel[56] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import Box0
		gunModel[57] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Import Box0
		gunModel[58] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Import Box0
		gunModel[59] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Import Box0
		gunModel[60] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Import Box0
		gunModel[61] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import Box0
		gunModel[62] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Import Box0
		gunModel[63] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Import Box0
		gunModel[64] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Import Box0
		gunModel[65] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box0
		gunModel[66] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box0
		gunModel[67] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box0
		gunModel[68] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box0
		gunModel[69] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box0
		gunModel[70] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import Box0
		gunModel[71] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import Box0
		gunModel[72] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import Box0
		gunModel[73] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box0
		gunModel[74] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Import Box0
		gunModel[75] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Import Box0
		gunModel[76] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Import Box0
		gunModel[77] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Import Box0
		gunModel[78] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box0
		gunModel[79] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Import Box0
		gunModel[80] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Import Box0
		gunModel[81] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Import Box0
		gunModel[82] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Import Box0
		gunModel[83] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Import Box0
		gunModel[84] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Import Box0
		gunModel[85] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Import Box0
		gunModel[86] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Import Box0
		gunModel[87] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Import Box0
		gunModel[88] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Import Box0
		gunModel[89] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Import Box0
		gunModel[90] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Import Box0
		gunModel[91] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Import Box0
		gunModel[92] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Import Box0
		gunModel[93] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import Box0
		gunModel[94] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Import Box0
		gunModel[95] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Import Box0
		gunModel[96] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Import Box0
		gunModel[97] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Import Box0
		gunModel[98] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Import Box0
		gunModel[99] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box0
		gunModel[100] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Import Box0
		gunModel[101] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Import Box0
		gunModel[102] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Import Box0
		gunModel[103] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Import Box0
		gunModel[104] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Import Box0
		gunModel[105] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Import Box0
		gunModel[106] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Import Box0
		gunModel[107] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Import Box0
		gunModel[108] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Import Box0
		gunModel[109] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Import Box0
		gunModel[110] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Import Box0
		gunModel[111] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Import Box0
		gunModel[112] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import Box0
		gunModel[113] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Import Box0
		gunModel[114] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Import Box0
		gunModel[115] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import Box0
		gunModel[116] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import Box0
		gunModel[117] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Import Box0
		gunModel[118] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Import Box0
		gunModel[119] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Import Box0
		gunModel[120] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Import Box0
		gunModel[121] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Import Box0
		gunModel[122] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box0
		gunModel[123] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Import Box0
		gunModel[124] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Import Box0
		gunModel[125] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Import Box0
		gunModel[126] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Import Box0
		gunModel[127] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Import Box0
		gunModel[128] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Import Box0
		gunModel[129] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Import Box0
		gunModel[130] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Import Box0
		gunModel[131] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Import Box0
		gunModel[132] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box0
		gunModel[133] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Import Box0
		gunModel[134] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Import Box0
		gunModel[135] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Import Box0
		gunModel[136] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Import Box0
		gunModel[137] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Import Box0
		gunModel[138] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Import Box0
		gunModel[139] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Import Box0
		gunModel[140] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Import Box0
		gunModel[141] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Import Box0
		gunModel[142] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Import Box0
		gunModel[143] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Import Box0
		gunModel[144] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Import Box0
		gunModel[145] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Import Box0
		gunModel[146] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box0
		gunModel[147] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Import Box0
		gunModel[148] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Import Box0
		gunModel[149] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import Box0
		gunModel[150] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Import Box0
		gunModel[151] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Import Box0
		gunModel[152] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Import Box0
		gunModel[153] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Import Box0
		gunModel[154] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Import Box0
		gunModel[155] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Import Box0
		gunModel[156] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import Box341
		gunModel[157] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import Box342
		gunModel[158] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import Box344
		gunModel[159] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Import Box345
		gunModel[160] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Import Box346
		gunModel[161] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box347
		gunModel[162] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box348
		gunModel[163] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box349
		gunModel[164] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import Box350
		gunModel[165] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import Box351
		gunModel[166] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Import Box0
		gunModel[167] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import Box0
		gunModel[168] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Import Box0
		gunModel[169] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box0
		gunModel[170] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Import Box0
		gunModel[171] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import Box0
		gunModel[172] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Import Box99
		gunModel[173] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Import Box99
		gunModel[174] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import Box99
		gunModel[175] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Import Box99
		gunModel[176] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Import Box99
		gunModel[177] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Import Box99
		gunModel[178] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import Box0
		gunModel[179] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import Box0
		gunModel[180] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Import Box0
		gunModel[181] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import Box0
		gunModel[182] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Import Box0
		gunModel[183] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Import Box0
		gunModel[184] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Import Box0
		gunModel[185] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Import Box0
		gunModel[186] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Import Box0
		gunModel[187] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import Box0
		gunModel[188] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Import Box0
		gunModel[189] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Import Box0
		gunModel[190] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Import Box0
		gunModel[191] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Import Box0
		gunModel[192] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Import Box0
		gunModel[193] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Import Box0
		gunModel[194] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Import Box0
		gunModel[195] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Import Box0
		gunModel[196] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Import Box0
		gunModel[197] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Import Box0
		gunModel[198] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Import Box0
		gunModel[199] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Import Box0
		gunModel[200] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import Box0
		gunModel[201] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Import Box0
		gunModel[202] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Import Box0
		gunModel[203] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Import Box0
		gunModel[204] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Import Box0
		gunModel[205] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Import Box0
		gunModel[206] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Import Box0
		gunModel[207] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Import Box0
		gunModel[208] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Import Box0
		gunModel[209] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Import Box0
		gunModel[210] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Import Box0
		gunModel[211] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Import Box0
		gunModel[212] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Import Box0
		gunModel[213] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Import Box0
		gunModel[214] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Import Box0
		gunModel[215] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Import Box0
		gunModel[216] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Import Box0
		gunModel[217] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Import Box0
		gunModel[218] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import Box0
		gunModel[219] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Import Box0
		gunModel[220] = new ModelRendererTurbo(this, 33, 201, textureX, textureY); // Import Box0
		gunModel[221] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Import Box0
		gunModel[222] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Import Box0
		gunModel[223] = new ModelRendererTurbo(this, 337, 209, textureX, textureY); // Import Box0
		gunModel[224] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box0
		gunModel[225] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Import Box0
		gunModel[226] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Import Box0
		gunModel[227] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Import Box0
		gunModel[228] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Import Box411
		gunModel[229] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Import Box412
		gunModel[230] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Import Box0
		gunModel[231] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import Box0
		gunModel[232] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Import Box443
		gunModel[233] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Import Box444
		gunModel[234] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Import Box445
		gunModel[235] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Import Box446
		gunModel[236] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Import Box447
		gunModel[237] = new ModelRendererTurbo(this, 145, 233, textureX, textureY); // Import Box457
		gunModel[238] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Import Box99
		gunModel[239] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Import Box459
		gunModel[240] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Import Box460
		gunModel[241] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Import Box446
		gunModel[242] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Import Box447
		gunModel[243] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Import Box459
		gunModel[244] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Import Box460
		gunModel[245] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Import Box446
		gunModel[246] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Import Box447
		gunModel[247] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Import Box459
		gunModel[248] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Import Box460
		gunModel[249] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Import Box472
		gunModel[250] = new ModelRendererTurbo(this, 153, 249, textureX, textureY); // Import Box475
		gunModel[251] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Import Box476
		gunModel[252] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Import Box99
		gunModel[253] = new ModelRendererTurbo(this, 113, 257, textureX, textureY); // Import Box99
		gunModel[254] = new ModelRendererTurbo(this, 225, 257, textureX, textureY); // Import Box99
		gunModel[255] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Import Box99
		gunModel[256] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Import Box0
		gunModel[257] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import Box99
		gunModel[258] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Import Box99
		gunModel[259] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import Box99
		gunModel[260] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import Box99
		gunModel[261] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Import Box0
		gunModel[262] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import Box0
		gunModel[263] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import Box0
		gunModel[264] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import Box0
		gunModel[265] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Import Box0
		gunModel[266] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Import Box0
		gunModel[267] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import Box0
		gunModel[268] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import Box0
		gunModel[269] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Import Box0
		gunModel[270] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Import Box0
		gunModel[271] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box0
		gunModel[272] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Import Box0
		gunModel[273] = new ModelRendererTurbo(this, 473, 233, textureX, textureY); // Import Box0
		gunModel[274] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Import Box0
		gunModel[275] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Import Box0
		gunModel[276] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Import Box452
		gunModel[277] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Import Box453
		gunModel[278] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Import Box454
		gunModel[279] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Import Box455
		gunModel[280] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Import Box456
		gunModel[281] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Import Box457
		gunModel[282] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Import Box0
		gunModel[283] = new ModelRendererTurbo(this, 17, 273, textureX, textureY); // Import Box0
		gunModel[284] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Import Box0
		gunModel[285] = new ModelRendererTurbo(this, 81, 273, textureX, textureY); // Import Box0
		gunModel[286] = new ModelRendererTurbo(this, 105, 273, textureX, textureY); // Import Box0
		gunModel[287] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Import Box0
		gunModel[288] = new ModelRendererTurbo(this, 169, 273, textureX, textureY); // Import Box0
		gunModel[289] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Import Box0
		gunModel[290] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Import Box0
		gunModel[291] = new ModelRendererTurbo(this, 225, 273, textureX, textureY); // Import Box0
		gunModel[292] = new ModelRendererTurbo(this, 257, 273, textureX, textureY); // Import Box0
		gunModel[293] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Import Box0
		gunModel[294] = new ModelRendererTurbo(this, 321, 273, textureX, textureY); // Import Box0
		gunModel[295] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Import Box0
		gunModel[296] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box0
		gunModel[297] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Import Box0
		gunModel[298] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Import Box0
		gunModel[299] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Import Box0
		gunModel[300] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Import Box0
		gunModel[301] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Import Box0
		gunModel[302] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Import Box0
		gunModel[303] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import Box0
		gunModel[304] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Import Box0
		gunModel[305] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Import Box0
		gunModel[306] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import Box0
		gunModel[307] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import Box0
		gunModel[308] = new ModelRendererTurbo(this, 353, 273, textureX, textureY); // Import Box0
		gunModel[309] = new ModelRendererTurbo(this, 385, 273, textureX, textureY); // Import Box0
		gunModel[310] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Import Box0
		gunModel[311] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import Box0
		gunModel[312] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import Box0
		gunModel[313] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Import Box499
		gunModel[314] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Import Box500
		gunModel[315] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Import Box0
		gunModel[316] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Import Box0
		gunModel[317] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Import Box0
		gunModel[318] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Import Box508
		gunModel[319] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Import Box509
		gunModel[320] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Import Box510
		gunModel[321] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import Box511
		gunModel[322] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Import Box512
		gunModel[323] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Import Box513
		gunModel[324] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Import Box513
		gunModel[325] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box513
		gunModel[326] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Import Box513
		gunModel[327] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Import Box513
		gunModel[328] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Import Box518
		gunModel[329] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Import Box513
		gunModel[330] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Import Box513
		gunModel[331] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box0
		gunModel[332] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box0
		gunModel[333] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Import Box0
		gunModel[334] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Import Box0
		gunModel[335] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import Box0
		gunModel[336] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import Box0
		gunModel[337] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Import Box0
		gunModel[338] = new ModelRendererTurbo(this, 449, 273, textureX, textureY); // Import Box0
		gunModel[339] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Import Box0
		gunModel[340] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Import Box0
		gunModel[341] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Import Box0
		gunModel[342] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Import Box0
		gunModel[343] = new ModelRendererTurbo(this, 241, 273, textureX, textureY); // Import Box0
		gunModel[344] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Import Box0
		gunModel[345] = new ModelRendererTurbo(this, 489, 273, textureX, textureY); // Import Box0
		gunModel[346] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Import Box0
		gunModel[347] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Import Box0
		gunModel[348] = new ModelRendererTurbo(this, 153, 281, textureX, textureY); // Import Box0
		gunModel[349] = new ModelRendererTurbo(this, 337, 281, textureX, textureY); // Import Box0
		gunModel[350] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Import Box0
		gunModel[351] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Import Box509
		gunModel[352] = new ModelRendererTurbo(this, 433, 281, textureX, textureY); // Import Box0
		gunModel[353] = new ModelRendererTurbo(this, 49, 289, textureX, textureY); // Import Box0
		gunModel[354] = new ModelRendererTurbo(this, 81, 289, textureX, textureY); // Import Box0
		gunModel[355] = new ModelRendererTurbo(this, 105, 289, textureX, textureY); // Import Box0
		gunModel[356] = new ModelRendererTurbo(this, 129, 289, textureX, textureY); // Import Box0
		gunModel[357] = new ModelRendererTurbo(this, 169, 289, textureX, textureY); // Import Box0
		gunModel[358] = new ModelRendererTurbo(this, 193, 289, textureX, textureY); // Import Box0
		gunModel[359] = new ModelRendererTurbo(this, 217, 289, textureX, textureY); // Import Box0
		gunModel[360] = new ModelRendererTurbo(this, 241, 289, textureX, textureY); // Import Box0
		gunModel[361] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Import Box0
		gunModel[362] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Import Box342
		gunModel[363] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import Box0
		gunModel[364] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import Box565
		gunModel[365] = new ModelRendererTurbo(this, 265, 289, textureX, textureY); // Import Box0
		gunModel[366] = new ModelRendererTurbo(this, 289, 289, textureX, textureY); // Import Box0
		gunModel[367] = new ModelRendererTurbo(this, 313, 289, textureX, textureY); // Import Box0
		gunModel[368] = new ModelRendererTurbo(this, 353, 289, textureX, textureY); // Import Box0
		gunModel[369] = new ModelRendererTurbo(this, 377, 289, textureX, textureY); // Import Box0
		gunModel[370] = new ModelRendererTurbo(this, 401, 289, textureX, textureY); // Import Box0
		gunModel[371] = new ModelRendererTurbo(this, 449, 289, textureX, textureY); // Import Box0
		gunModel[372] = new ModelRendererTurbo(this, 489, 289, textureX, textureY); // Import Box0
		gunModel[373] = new ModelRendererTurbo(this, 17, 201, textureX, textureY); // Import Box578
		gunModel[374] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Import Box0
		gunModel[375] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box0
		gunModel[376] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Import Box0
		gunModel[377] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import Box0
		gunModel[378] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box0
		gunModel[379] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Import Box0
		gunModel[380] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Import Box0
		gunModel[381] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Import Box0
		gunModel[382] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Import Box0
		gunModel[383] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Import Box0
		gunModel[384] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Import Box0
		gunModel[385] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Import Box0
		gunModel[386] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import Box0
		gunModel[387] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import Box0
		gunModel[388] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Import Box0
		gunModel[389] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Import Box0
		gunModel[390] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Import Box0
		gunModel[391] = new ModelRendererTurbo(this, 25, 297, textureX, textureY); // Import Box0
		gunModel[392] = new ModelRendererTurbo(this, 137, 297, textureX, textureY); // Import Box0
		gunModel[393] = new ModelRendererTurbo(this, 321, 297, textureX, textureY); // Import Box0

		gunModel[0].addShapeBox(0F, 0F, 0F, 47, 3, 9, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[0].setRotationPoint(22F, -50F, -4.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 28, 1, 9, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[1].setRotationPoint(40.5F, -50.5F, -4.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, -1F, 0.5F); // Import Box0
		gunModel[2].setRotationPoint(37.5F, -50.5F, -4.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 23, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[3].setRotationPoint(19F, -46.5F, -5.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 40, 4, 11, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[4].setRotationPoint(19F, -24F, -5.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 37, 1, 11, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[5].setRotationPoint(22F, -24.5F, -5.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 37, 1, 11, 0F,0F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[6].setRotationPoint(22F, -25.5F, -5.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[7].setRotationPoint(7.75F, -34F, 2.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import Box0
		gunModel[8].setRotationPoint(16.5F, -46F, -5.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.75F, 0F, -0.5F); // Import Box0
		gunModel[9].setRotationPoint(15.5F, -43F, -5.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,-0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, -0.5F, 0F, -0.5F, 1.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 1.75F, 0F, -0.5F); // Import Box0
		gunModel[10].setRotationPoint(14.25F, -40F, -5.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,-0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 3.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 3.25F, 0F, -0.5F); // Import Box0
		gunModel[11].setRotationPoint(12F, -37F, -5.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1.25F, 0F, -0.5F, 2.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 2.75F, 0F, -0.5F); // Import Box0
		gunModel[12].setRotationPoint(10F, -34F, -5.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.75F, 0F, -0.5F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 3F, 0F, -0.5F); // Import Box0
		gunModel[13].setRotationPoint(8F, -33F, -5.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 17, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[14].setRotationPoint(2F, -32F, -5.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[15].setRotationPoint(-1F, -32F, -5.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[16].setRotationPoint(-2F, -32F, -5.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[17].setRotationPoint(-2F, -31F, -6.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[18].setRotationPoint(1F, -31F, -6.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, -1F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[19].setRotationPoint(4F, -30.5F, -6.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box0
		gunModel[20].setRotationPoint(5.5F, -29.75F, -6.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0.5F, -0.25F, 0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, 0F); // Import Box0
		gunModel[21].setRotationPoint(6F, -29F, -6.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0.5F, -0.25F, 0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0.5F, -0.25F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F); // Import Box0
		gunModel[22].setRotationPoint(7F, -25.25F, -6.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0.5F, -0.25F, 0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0.5F, -0.25F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, -1F, 2.5F, 0F, -1F, -2.5F, 0F, 0F); // Import Box0
		gunModel[23].setRotationPoint(8.5F, -21.5F, -6.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, -1F, 2.25F, 0F, -1F, -2.25F, 0F, 0F); // Import Box0
		gunModel[24].setRotationPoint(11.5F, -17.5F, -6.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, -1.5F, -0.5F, 0F, 1.5F, -0.5F, -1F, 1.5F, -0.5F, -1F, -1.5F, -0.5F, 0F); // Import Box0
		gunModel[25].setRotationPoint(14.25F, -15.5F, -6.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[26].setRotationPoint(-4.5F, -31.5F, -6.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[27].setRotationPoint(-2.5F, -31.5F, -6.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[28].setRotationPoint(-5.5F, -31.5F, -6.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import Box0
		gunModel[29].setRotationPoint(-6.5F, -30F, -6.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -1F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, -2.5F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1.5F); // Import Box0
		gunModel[30].setRotationPoint(-6.5F, -31F, -6.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1.5F); // Import Box0
		gunModel[31].setRotationPoint(-6.5F, -24F, -6.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1.5F, 0F, -1.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -1.5F); // Import Box0
		gunModel[32].setRotationPoint(-7.5F, -21F, -6.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 5, 13, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 3.5F, 0F, -1.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, -1.5F); // Import Box0
		gunModel[33].setRotationPoint(-9F, -18F, -6.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 3.25F, 0F, -1.5F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 3.25F, 0F, -1.5F); // Import Box0
		gunModel[34].setRotationPoint(-12.5F, -13F, -6.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,-0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1.5F, 3.5F, 0F, -1.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, -1.5F); // Import Box0
		gunModel[35].setRotationPoint(-16F, -7F, -6.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 9, 13, 0F,-0.25F, 0F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1.5F, 2.5F, 0F, -1.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, -1.5F); // Import Box0
		gunModel[36].setRotationPoint(-19.75F, 3F, -6.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import Box0
		gunModel[37].setRotationPoint(-22.25F, 12F, -6.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1.5F); // Import Box0
		gunModel[38].setRotationPoint(-22.25F, 13F, -6.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 10, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[39].setRotationPoint(-16.25F, 17.5F, -6.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F); // Import Box0
		gunModel[40].setRotationPoint(-18.25F, 17.5F, -6.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, -1.5F); // Import Box0
		gunModel[41].setRotationPoint(-20.25F, 17F, -6.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -1.5F); // Import Box0
		gunModel[42].setRotationPoint(-21.25F, 16F, -6.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[43].setRotationPoint(-6.25F, 17.5F, -6.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[44].setRotationPoint(-4.25F, 17F, -6.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, -1.5F); // Import Box0
		gunModel[45].setRotationPoint(-3.25F, 16.5F, -6.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F); // Import Box0
		gunModel[46].setRotationPoint(-3.25F, 13.5F, -6.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,-1.25F, 0F, 0F, 1.25F, 0F, -1.5F, 1.25F, 0F, -1.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import Box0
		gunModel[47].setRotationPoint(-3.25F, 11.5F, -6.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,-3F, -0.5F, 0F, 3F, -0.5F, -1.5F, 3F, -0.5F, -1.5F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import Box0
		gunModel[48].setRotationPoint(-2F, 8.5F, -6.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import Box0
		gunModel[49].setRotationPoint(1F, 8F, -6.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,-1.25F, 0F, 0F, 1.25F, 0F, -1.5F, 1.25F, 0F, -1.5F, -1.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.5F, -1.5F, 0.25F, 0.5F, -1.5F, -0.25F, 0.5F, 0F); // Import Box0
		gunModel[50].setRotationPoint(1F, 4.5F, -6.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,-1.75F, 0F, 0F, 1.75F, 0F, -1.5F, 1.75F, 0F, -1.5F, -1.75F, 0F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.5F, -1.5F, 0.25F, 0.5F, -1.5F, -0.25F, 0.5F, 0F); // Import Box0
		gunModel[51].setRotationPoint(2F, 2F, -6.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,-1.75F, 0F, 0F, 1.75F, -0.5F, -1.5F, 1.75F, -0.5F, -1.5F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, -0.25F, 0F, 0F); // Import Box0
		gunModel[52].setRotationPoint(3.5F, 0F, -6.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F); // Import Box0
		gunModel[53].setRotationPoint(5.25F, -3F, -6.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,-0.75F, 0F, 0F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import Box0
		gunModel[54].setRotationPoint(5.25F, -5F, -6.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,-2F, 0F, 0F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import Box0
		gunModel[55].setRotationPoint(6F, -7F, -6.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-2.25F, 0.5F, 0F, 2F, -0.5F, -1.5F, 2F, -0.5F, -1.5F, -2.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import Box0
		gunModel[56].setRotationPoint(8F, -8F, -6.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, -1.5F, -0.5F, -1F, 1.5F, -0.5F, -2F, 1.5F, -0.5F, -2F, -1.5F, -0.5F, -1F); // Import Box0
		gunModel[57].setRotationPoint(16.25F, -14F, -6.5F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 13, 0F,-0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, -1F, 0F, -1.5F); // Import Box0
		gunModel[58].setRotationPoint(10F, -8.5F, -6.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0.5F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -0.25F, 0.25F, -1.5F, -0.25F, 0.25F, -1.5F, 0.5F, 0F, -1.5F); // Import Box0
		gunModel[59].setRotationPoint(15F, -8.5F, -6.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.75F, -2.5F, 0F, 0.75F, -2.5F, 0F, 0F, -1.5F); // Import Box0
		gunModel[60].setRotationPoint(15.75F, -8.25F, -6.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, -0.75F, -0.4F, -0.5F, -0.75F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.75F, 0.25F, -2F, -0.75F, 0.25F, -2F, 0F, 0F, -1.5F); // Import Box0
		gunModel[61].setRotationPoint(17.75F, -7.5F, -5.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.75F, -0.6F, -0.5F, 0.75F, -0.25F, -1.5F, 0.75F, -0.25F, -1.5F, -0.75F, -0.6F, -0.5F); // Import Box0
		gunModel[62].setRotationPoint(18.25F, -8.5F, -5.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 14, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box0
		gunModel[63].setRotationPoint(5F, -30F, -5.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 10, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F); // Import Box0
		gunModel[64].setRotationPoint(8.5F, -22F, -5.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, -1F, -0.25F, -0.5F, -2F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, -1F); // Import Box0
		gunModel[65].setRotationPoint(16.5F, -50F, 2.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 1.5F, 0.75F, 0F, 1.5F); // Import Box0
		gunModel[66].setRotationPoint(17.5F, -51.5F, -4.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, -1F); // Import Box0
		gunModel[67].setRotationPoint(15.5F, -46F, 2.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0.75F, 0F, -1F); // Import Box0
		gunModel[68].setRotationPoint(14.5F, -43F, 2.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 1.75F, 0F, 0.5F, -1.75F, 0F, 0.5F, -1.75F, 0F, 0F, 1.75F, 0F, -1F); // Import Box0
		gunModel[69].setRotationPoint(13.25F, -40F, 2.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 3.25F, 0F, 0.5F, -3.25F, 0F, 0.5F, -3.25F, 0F, 0F, 3.25F, 0F, -1F); // Import Box0
		gunModel[70].setRotationPoint(11F, -37F, 2.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[71].setRotationPoint(2F, -33F, 2.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[72].setRotationPoint(-1F, -33F, 2.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Import Box0
		gunModel[73].setRotationPoint(-2F, -32.5F, 2.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0.5F, -0.25F, 1F, 0.5F, -0.25F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.75F, -1F, 0.5F, -0.75F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[74].setRotationPoint(5F, -33F, 2.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 6, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F); // Import Box0
		gunModel[75].setRotationPoint(12.5F, -17F, -5.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 0F); // Import Box0
		gunModel[76].setRotationPoint(-5.5F, -24F, -6.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 1.5F, 0F, 0F); // Import Box0
		gunModel[77].setRotationPoint(-6.5F, -21F, -6.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0.5F, 3.5F, 0F, 0F); // Import Box0
		gunModel[78].setRotationPoint(-8F, -18F, -6.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 3.25F, 0F, 0F, -3.25F, 0F, 0.5F, -3.25F, 0F, 0.5F, 3.25F, 0F, 0F); // Import Box0
		gunModel[79].setRotationPoint(-11.5F, -13F, -6.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 2, 10, 13, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0.5F, 3.5F, 0F, 0F); // Import Box0
		gunModel[80].setRotationPoint(-15F, -7F, -6.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 2, 9, 13, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 2.5F, 0F, 0F); // Import Box0
		gunModel[81].setRotationPoint(-18.75F, 3F, -6.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box0
		gunModel[82].setRotationPoint(-21.25F, 12F, -6.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0.5F, 1F, -1F, 0.5F, -1F, 0F, 0F); // Import Box0
		gunModel[83].setRotationPoint(-21.25F, 13F, -6.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 10, 2, 13, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[84].setRotationPoint(-16.25F, 15.5F, -6.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[85].setRotationPoint(-18.25F, 15.5F, -6.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0F, 0F, 0.5F, -0.55F, 0.5F, 0.5F, -0.55F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[86].setRotationPoint(-6.25F, 15.5F, -6.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 2, 5, 13, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box0
		gunModel[87].setRotationPoint(-5.5F, -29F, -6.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Import Box0
		gunModel[88].setRotationPoint(-2F, -30F, -6.5F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[89].setRotationPoint(1F, -30F, -6.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Import Box0
		gunModel[90].setRotationPoint(-4.5F, -30.5F, -6.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[91].setRotationPoint(-2.5F, -30.5F, -6.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F); // Import Box0
		gunModel[92].setRotationPoint(-5.5F, -30.5F, -6.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 2, 4, 13, 0F,0.5F, -1F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, -1F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F); // Import Box0
		gunModel[93].setRotationPoint(4F, -29F, -6.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 2, 4, 13, 0F,0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0.5F); // Import Box0
		gunModel[94].setRotationPoint(5F, -25.25F, -6.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 2, 4, 13, 0F,0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0.5F, -2.5F, 0F, 0.5F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0.5F); // Import Box0
		gunModel[95].setRotationPoint(6.5F, -21.5F, -6.5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -2.25F, 0F, 0.5F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, 0F, 0.5F); // Import Box0
		gunModel[96].setRotationPoint(9.5F, -17.5F, -6.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -1.5F, -0.5F, 0.5F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -1.5F, -0.5F, 0.5F); // Import Box0
		gunModel[97].setRotationPoint(12.25F, -15.5F, -6.5F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,-1.25F, 0F, 0.65F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0.65F, 0F, 0F, 0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.85F); // Import Box0
		gunModel[98].setRotationPoint(-5.25F, 11.5F, -6.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F,-3F, -0.5F, 0.5F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3F, -0.5F, 0.5F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F); // Import Box0
		gunModel[99].setRotationPoint(-4F, 8.5F, -6.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,-0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Import Box0
		gunModel[100].setRotationPoint(-1F, 8F, -6.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F,-1.25F, 0F, 0.5F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0.5F, -0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.25F, 0.5F, 0.5F); // Import Box0
		gunModel[101].setRotationPoint(-1F, 4.5F, -6.5F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,-1.75F, 0F, 0.5F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0.5F, -0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.25F, 0.5F, 0.5F); // Import Box0
		gunModel[102].setRotationPoint(0F, 2F, -6.5F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,-1.75F, 0F, 0.5F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0.5F); // Import Box0
		gunModel[103].setRotationPoint(1.5F, 0F, -6.5F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Import Box0
		gunModel[104].setRotationPoint(3.25F, -3F, -6.5F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,-0.75F, 0F, 0.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Import Box0
		gunModel[105].setRotationPoint(3.25F, -5F, -6.5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,-2F, 0F, 0.5F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Import Box0
		gunModel[106].setRotationPoint(4F, -7F, -6.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F,0F, 0.5F, 0.85F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.85F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[107].setRotationPoint(-5.25F, 14F, -6.5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,-2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[108].setRotationPoint(-20.25F, 15F, -6.5F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Import Box0
		gunModel[109].setRotationPoint(21F, -44.5F, 5.5F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F,-3.25F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, -3.25F, -0.5F, 0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[110].setRotationPoint(10F, -10.5F, -6.5F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F,0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -1.5F, -0.5F, -0.5F, 1.5F, -0.5F, -1F, 1.5F, -0.5F, -1F, -1.5F, -0.5F, -0.5F); // Import Box0
		gunModel[111].setRotationPoint(14.25F, -14F, -6.5F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-0.25F, -0.15F, -0.5F, -0.75F, -0.5F, -1.5F, -0.75F, -0.5F, -1.5F, -0.25F, -0.15F, -0.5F, -0.25F, 0F, -2F, -1.5F, 0F, -2.25F, -1.5F, 0F, -2.25F, -0.25F, 0F, -2F); // Import Box0
		gunModel[112].setRotationPoint(18.75F, -7.25F, -5.5F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F,-2.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -2.5F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0.5F); // Import Box0
		gunModel[113].setRotationPoint(5.75F, -9F, -6.5F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,-3.25F, -0.5F, 0.5F, 3.25F, -0.5F, 0.5F, 3.25F, -0.5F, 0.5F, -3.25F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0.5F); // Import Box0
		gunModel[114].setRotationPoint(8F, -10.5F, -6.5F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, -0.75F, -1.4F, -0.5F, -0.75F, -1.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.4F, -0.5F, -0.75F, 0.4F, -0.5F, 0F, 0F, 0F); // Import Box0
		gunModel[115].setRotationPoint(17.75F, -8.5F, -5.5F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1F); // Import Box0
		gunModel[116].setRotationPoint(15.75F, -8.5F, -5.5F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,-0.5F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.5F); // Import Box0
		gunModel[117].setRotationPoint(3.5F, -30F, -6.5F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,-0.5F, -0.5F, 0.5F, -0.25F, -2F, -0.5F, -0.25F, -2F, -0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[118].setRotationPoint(14F, -10.5F, -6.5F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-1F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 1F, 0F, 0F); // Import Box0
		gunModel[119].setRotationPoint(19.5F, -52.5F, 2.5F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F,0F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[120].setRotationPoint(19.5F, -50.5F, 1.5F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[121].setRotationPoint(19.5F, -51.5F, 2.5F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, -0.1F, -2.5F, -0.5F, -0.1F, -2.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[122].setRotationPoint(25.5F, -51.5F, 2.5F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, -0.25F, -2.5F, -0.5F, -0.25F, -2.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[123].setRotationPoint(25.5F, -52F, 2.5F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 5, 3, 13, 0F,0.75F, -0.5F, 0.5F, 3F, -0.5F, 0.5F, 3F, -0.5F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, 0F, 0.5F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0.75F, 0F, 0.5F); // Import Box0
		gunModel[124].setRotationPoint(-9F, 8.5F, -6.5F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 5, 4, 13, 0F,0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[125].setRotationPoint(-1.5F, -29F, -6.5F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[126].setRotationPoint(-2.5F, -29F, -6.5F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 1, 5, 13, 0F,0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box0
		gunModel[127].setRotationPoint(-3.5F, -29F, -6.5F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // Import Box0
		gunModel[128].setRotationPoint(-3.5F, -24F, -6.5F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 9, 4, 13, 0F,-0.5F, -0.25F, 0.5F, -1.5F, -0.25F, 0.5F, -1.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Import Box0
		gunModel[129].setRotationPoint(-3F, -25.25F, -6.5F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,1F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 1F, 0F, 0.5F); // Import Box0
		gunModel[130].setRotationPoint(-1.5F, -21.5F, -6.5F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 11, 2, 13, 0F,1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 2.25F, 0F, 0.5F, 2.25F, 0F, 0.5F, 1F, 0F, 0.5F); // Import Box0
		gunModel[131].setRotationPoint(-1.5F, -17.5F, -6.5F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 14, 2, 13, 0F,1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, -0.5F, 0.5F, 1.25F, -0.5F, 0.5F, 1.25F, -0.5F, 0.5F, 1F, -0.5F, 0.5F); // Import Box0
		gunModel[132].setRotationPoint(-1.5F, -15.5F, -6.5F);

		gunModel[133].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F); // Import Box0
		gunModel[133].setRotationPoint(-4.5F, -21F, -6.5F);

		gunModel[134].addShapeBox(0F, 0F, 0F, 6, 5, 13, 0F,-2.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // Import Box0
		gunModel[134].setRotationPoint(-8.5F, -18F, -6.5F);

		gunModel[135].addShapeBox(0F, 0F, 0F, 14, 5, 13, 0F,1F, -0.5F, 0.5F, 0.6F, -0.5F, 0.5F, 0.6F, -0.5F, 0.5F, 1F, -0.5F, 0.5F, 1F, -0.5F, 0.5F, 2F, -0.5F, 0.5F, 2F, -0.5F, 0.5F, 1F, -0.5F, 0.5F); // Import Box0
		gunModel[135].setRotationPoint(-1.5F, -14.5F, -6.5F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 1, 4, 13, 0F,0.15F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.15F, 0F, 0.5F, -1.25F, 0F, 0.5F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, -1.25F, 0F, 0.5F); // Import Box0
		gunModel[136].setRotationPoint(13.25F, -14F, -6.5F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,-0.5F, -0.5F, 0.5F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.5F, -0.5F, 0.5F, -1.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1.75F, 0F, -0.5F); // Import Box0
		gunModel[137].setRotationPoint(14F, -10.5F, -6.5F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 12, 2, 13, 0F,-1.5F, -0.5F, 0.5F, 3.25F, -0.5F, 0.5F, 3.25F, -0.5F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -1.5F, 0F, 0.5F); // Import Box0
		gunModel[138].setRotationPoint(-4F, -10.5F, -6.5F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 9, 2, 13, 0F,-1.5F, -0.5F, 0.5F, 3.25F, -0.5F, 0.5F, 3.25F, -0.5F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -1.5F, 0F, 0.5F); // Import Box0
		gunModel[139].setRotationPoint(-4F, -9F, -6.5F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 7, 2, 13, 0F,-1.5F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -1.5F, 0F, 0.5F); // Import Box0
		gunModel[140].setRotationPoint(-4F, -7F, -6.5F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 5, 2, 13, 0F,-1.5F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 2.25F, 0F, 0.5F, 2.25F, 0F, 0.5F, -1.5F, 0F, 0.5F); // Import Box0
		gunModel[141].setRotationPoint(-4F, -5F, -6.5F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 5, 3, 13, 0F,-1.5F, 0F, 0.5F, 2.25F, 0F, 0.5F, 2.25F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 2.25F, 0F, 0.5F, 2.25F, 0F, 0.5F, -1.5F, 0F, 0.5F); // Import Box0
		gunModel[142].setRotationPoint(-4F, -3F, -6.5F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 10, 6, 13, 0F,-2.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0.75F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.75F, 0F, 0.5F); // Import Box0
		gunModel[143].setRotationPoint(-12F, -13F, -6.5F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 13, 10, 13, 0F,-2.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -2.25F, 0F, 0.5F, 1.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 1.5F, 0F, 0.5F); // Import Box0
		gunModel[144].setRotationPoint(-15F, -7F, -6.5F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 5, 2, 13, 0F,-1.5F, 0F, 0.5F, 2.25F, 0F, 0.5F, 2.25F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, -1.5F, 0F, 0.5F); // Import Box0
		gunModel[145].setRotationPoint(-4F, 0F, -6.5F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F,-1.5F, 0F, 0.5F, 1.75F, 0F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F); // Import Box0
		gunModel[146].setRotationPoint(-4F, 2F, -6.5F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 10, 3, 13, 0F,-1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, -1.25F, 0.5F, 0.5F); // Import Box0
		gunModel[147].setRotationPoint(-11F, 4.5F, -6.5F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 7, 9, 14, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F); // Import Box0
		gunModel[148].setRotationPoint(-16.75F, 3F, -7F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 8, 1, 13, 0F,0.75F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.75F, 0F, 0.5F); // Import Box0
		gunModel[149].setRotationPoint(-9F, 8F, -6.5F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,-1.25F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0.5F, 0.5F, 2.5F, 0.5F, 0.5F, 2.5F, 0.5F, 0.5F, -1.25F, 0.5F, 0.5F); // Import Box0
		gunModel[150].setRotationPoint(-11F, 3F, -6.5F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[151].setRotationPoint(-19.25F, 12F, -7F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 5, 2, 14, 0F,0.5F, 0F, 0F, 0.25F, 0F, 0.15F, 0.25F, 0F, 0.15F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.35F, -1F, 0F, 0.35F, 0.5F, 0F, 0F); // Import Box0
		gunModel[152].setRotationPoint(-9.25F, 11.5F, -7F);

		gunModel[153].addShapeBox(0F, 0F, 0F, 10, 2, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[153].setRotationPoint(-19.25F, 13F, -7F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0.5F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.45F, 0.5F, 0F, 0.45F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Import Box0
		gunModel[154].setRotationPoint(-9.25F, 13.5F, -7F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,2F, 0F, 0F, 1.45F, 0F, 0F, 1.45F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[155].setRotationPoint(-16.25F, 15F, -7F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import Box341
		gunModel[156].setRotationPoint(7.75F, -34F, -5.5F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.25F, -0.5F, -2F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import Box342
		gunModel[157].setRotationPoint(16.5F, -50F, -5.5F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import Box344
		gunModel[158].setRotationPoint(15.5F, -46F, -5.5F);

		gunModel[159].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F); // Import Box345
		gunModel[159].setRotationPoint(14.5F, -43F, -5.5F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 1.75F, 0F, -1F, -1.75F, 0F, 0F, -1.75F, 0F, 0.5F, 1.75F, 0F, 0.5F); // Import Box346
		gunModel[160].setRotationPoint(13.25F, -40F, -5.5F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 3.25F, 0F, -1F, -3.25F, 0F, 0F, -3.25F, 0F, 0.5F, 3.25F, 0F, 0.5F); // Import Box347
		gunModel[161].setRotationPoint(11F, -37F, -5.5F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box348
		gunModel[162].setRotationPoint(2F, -33F, -5.5F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F); // Import Box349
		gunModel[163].setRotationPoint(-1F, -33F, -5.5F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F); // Import Box350
		gunModel[164].setRotationPoint(-2F, -32.5F, -5.5F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, -0.25F, 1F, -1F, -0.25F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0.5F, 0F, 0F, 0.5F); // Import Box351
		gunModel[165].setRotationPoint(5F, -33F, -5.5F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 9, 8, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[166].setRotationPoint(59.5F, -38.5F, -4.5F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[167].setRotationPoint(59.5F, -47.5F, -4.5F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[168].setRotationPoint(59.5F, -39F, -4F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 73, 4, 1, 0F,0F, -2.875F, 0F, -0.6F, -2.875F, 0F, -0.2F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Import Box0
		gunModel[169].setRotationPoint(59.5F, -42.75F, 2.5F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 73, 2, 1, 0F,0F, -1.5F, 0.25F, -0.85F, -1.5F, 0.25F, -0.6F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[170].setRotationPoint(59.5F, -40.5F, 1.75F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 73, 1, 1, 0F,0F, -0.99F, 0.25F, -1F, -0.99F, 0.25F, -0.85F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[171].setRotationPoint(59.5F, -39.5F, 0.75F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 73, 2, 1, 0F,0F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F); // Import Box99
		gunModel[172].setRotationPoint(59.5F, -45F, 1.75F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 73, 1, 1, 0F,0F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.99F, 0.25F, 0F, -0.99F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box99
		gunModel[173].setRotationPoint(59.5F, -45F, 0.75F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 73, 2, 1, 0F,0F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F); // Import Box99
		gunModel[174].setRotationPoint(59.5F, -45F, -2.75F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 73, 1, 1, 0F,0F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.99F, 0.25F, 0F, -0.99F, 0.25F); // Import Box99
		gunModel[175].setRotationPoint(59.5F, -45F, -1.75F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 73, 3, 1, 0F,0F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.65F, 0.25F, 0F, -1.65F, 0.25F); // Import Box99
		gunModel[176].setRotationPoint(59.5F, -45F, -3.75F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 73, 3, 1, 0F,0F, 0F, 0.25F, -0.15F, 0F, 0.25F, -0.15F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.65F, 0.25F, 0F, -1.65F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Import Box99
		gunModel[177].setRotationPoint(59.5F, -45F, 2.75F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[178].setRotationPoint(59.5F, -47.5F, 3.25F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Import Box0
		gunModel[179].setRotationPoint(59.5F, -47.5F, -2.5F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import Box0
		gunModel[180].setRotationPoint(16.5F, -46F, 2F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.75F, 0F, -0.5F); // Import Box0
		gunModel[181].setRotationPoint(15.5F, -43F, 2F);

		gunModel[182].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,-0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, -0.5F, 0F, -0.5F, 1.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 1.75F, 0F, -0.5F); // Import Box0
		gunModel[182].setRotationPoint(14.25F, -40F, 2F);

		gunModel[183].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,-0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 3.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 3.25F, 0F, -0.5F); // Import Box0
		gunModel[183].setRotationPoint(12F, -37F, 2F);

		gunModel[184].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1.25F, 0F, -0.5F, 2.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 2.75F, 0F, -0.5F); // Import Box0
		gunModel[184].setRotationPoint(10F, -34F, 2F);

		gunModel[185].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.75F, 0F, -0.5F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 3F, 0F, -0.5F); // Import Box0
		gunModel[185].setRotationPoint(8F, -33F, 2F);

		gunModel[186].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[186].setRotationPoint(17.5F, -46F, -2F);

		gunModel[187].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F); // Import Box0
		gunModel[187].setRotationPoint(16.5F, -43F, -2F);

		gunModel[188].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.75F, 0F, 0F); // Import Box0
		gunModel[188].setRotationPoint(15.25F, -40F, -2F);

		gunModel[189].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,-0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 3.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3.25F, 0F, 0F); // Import Box0
		gunModel[189].setRotationPoint(13F, -37F, -2F);

		gunModel[190].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.25F, 0F, 0F, 2.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2.75F, 0F, 0F); // Import Box0
		gunModel[190].setRotationPoint(11F, -34F, -2F);

		gunModel[191].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.75F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F); // Import Box0
		gunModel[191].setRotationPoint(9F, -33F, -2F);

		gunModel[192].addShapeBox(0F, 0F, 0F, 22, 1, 11, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[192].setRotationPoint(43F, -20F, -5.5F);

		gunModel[193].addShapeBox(0F, 0F, 0F, 22, 1, 11, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Import Box0
		gunModel[193].setRotationPoint(43F, -19F, -5.5F);

		gunModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0.5F, -1F); // Import Box0
		gunModel[194].setRotationPoint(41F, -19F, -5.5F);

		gunModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, 1.5F, -1F); // Import Box0
		gunModel[195].setRotationPoint(40F, -18F, -5.5F);

		gunModel[196].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, -0.75F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, -0.5F, 0F); // Import Box0
		gunModel[196].setRotationPoint(39.5F, -15.5F, -5.5F);

		gunModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0.25F, 0F); // Import Box0
		gunModel[197].setRotationPoint(39.5F, -16F, -5.5F);

		gunModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 1.25F, 0F, 0F, -1.75F, 0F, -1F, -1.75F, 0F, -1F, 1.25F, 0F, 0F); // Import Box0
		gunModel[198].setRotationPoint(39.5F, -12F, -5F);

		gunModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.75F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, -0.75F, 0F, 0F, 1.25F, 0F, 0F, -1.75F, 0F, -1F, -1.75F, 0F, -1F, 1.25F, 0F, 0F); // Import Box0
		gunModel[199].setRotationPoint(37.5F, -10F, -5F);

		gunModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.75F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, -0.75F, 0F, 0F, 2.75F, -0.25F, 0F, -3.25F, 0F, -1F, -3.25F, 0F, -1F, 2.75F, -0.25F, 0F); // Import Box0
		gunModel[200].setRotationPoint(35.5F, -8F, -5F);

		gunModel[201].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[201].setRotationPoint(24.5F, -5.5F, -5F);

		gunModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[202].setRotationPoint(28.5F, -5.5F, -5F);

		gunModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, -1F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1F, 0.75F, -0.5F, -1F, 0.75F, -0.5F, -1F, 0F, 0.5F, -1F); // Import Box0
		gunModel[203].setRotationPoint(30.5F, -6.5F, -5F);

		gunModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.25F, -1F); // Import Box0
		gunModel[204].setRotationPoint(21.5F, -5.5F, -5F);

		gunModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F); // Import Box0
		gunModel[205].setRotationPoint(19.5F, -6.75F, -5F);

		gunModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0.75F, 0F, -1.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.75F, 0F, -1.25F, -0.5F, 0.25F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0.25F, -1.5F); // Import Box0
		gunModel[206].setRotationPoint(18.5F, -10.75F, -5.5F);

		gunModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -1.25F); // Import Box0
		gunModel[207].setRotationPoint(17.5F, -13.25F, -5.5F);

		gunModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F); // Import Box0
		gunModel[208].setRotationPoint(16.75F, -14.25F, -5.5F);

		gunModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.25F, -0.25F, -1.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -1.5F, -0.75F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.75F, 0F, -1.5F); // Import Box0
		gunModel[209].setRotationPoint(18.75F, -8.75F, -5.5F);

		gunModel[210].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[210].setRotationPoint(41F, -20F, -5.5F);

		gunModel[211].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F); // Import Box0
		gunModel[211].setRotationPoint(40F, -20F, -5.5F);

		gunModel[212].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F); // Import Box0
		gunModel[212].setRotationPoint(39F, -20F, -5.5F);

		gunModel[213].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box0
		gunModel[213].setRotationPoint(38.5F, -20F, -5.5F);

		gunModel[214].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F); // Import Box0
		gunModel[214].setRotationPoint(37.5F, -20F, -5.5F);

		gunModel[215].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Import Box0
		gunModel[215].setRotationPoint(35.5F, -20F, -5.5F);

		gunModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F); // Import Box0
		gunModel[216].setRotationPoint(33.5F, -20F, -5.5F);

		gunModel[217].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[217].setRotationPoint(38.5F, -15F, -5.5F);

		gunModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, 1.5F, 0F, -0.5F); // Import Box0
		gunModel[218].setRotationPoint(38.5F, -12F, -5.5F);

		gunModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, 1.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1.75F, 0F, 0F); // Import Box0
		gunModel[219].setRotationPoint(36.5F, -10F, -5F);

		gunModel[220].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[220].setRotationPoint(24.5F, -6F, -5F);

		gunModel[221].addShapeBox(0F, 0F, 0F, 64, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[221].setRotationPoint(68.5F, -43F, 3.25F);

		gunModel[222].addShapeBox(0F, 0F, 0F, 46, 7, 3, 0F,0F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F); // Import Box0
		gunModel[222].setRotationPoint(84.5F, -41.5F, 3.25F);

		gunModel[223].addShapeBox(0F, 0F, 0F, 64, 4, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		gunModel[223].setRotationPoint(68.5F, -47F, 3.25F);

		gunModel[224].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[224].setRotationPoint(59.5F, -43F, 4.75F);

		gunModel[225].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[225].setRotationPoint(59.5F, -47F, 3.75F);

		gunModel[226].addShapeBox(0F, 0F, 0F, 16, 4, 3, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Import Box0
		gunModel[226].setRotationPoint(68.5F, -41.5F, 3.25F);

		gunModel[227].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Import Box0
		gunModel[227].setRotationPoint(59.5F, -41.5F, 3.75F);

		gunModel[228].addShapeBox(0F, 0F, 0F, 64, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box411
		gunModel[228].setRotationPoint(68.5F, -43F, -6.25F);

		gunModel[229].addShapeBox(0F, 0F, 0F, 62, 7, 3, 0F,0F, 0.5F, 0.25F, 2F, 0.5F, 0.25F, 2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box412
		gunModel[229].setRotationPoint(68.5F, -41.5F, -6.25F);

		gunModel[230].addShapeBox(0F, 0F, 0F, 16, 2, 8, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[230].setRotationPoint(115.5F, -49F, -3.5F);

		gunModel[231].addShapeBox(0F, 0F, 0F, 62, 1, 7, 0F,0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[231].setRotationPoint(68.5F, -50F, -3.25F);

		gunModel[232].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box443
		gunModel[232].setRotationPoint(101.5F, -49F, -4.5F);

		gunModel[233].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box444
		gunModel[233].setRotationPoint(87.5F, -49F, -4.5F);

		gunModel[234].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box445
		gunModel[234].setRotationPoint(68.5F, -49F, -4.5F);

		gunModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.99F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.99F, -0.5F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box446
		gunModel[235].setRotationPoint(114.5F, -48F, -4.5F);

		gunModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.99F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.3F, -0.99F, -0.5F, -0.3F); // Import Box447
		gunModel[236].setRotationPoint(114.5F, -49F, -3.75F);

		gunModel[237].addShapeBox(0F, 0F, 0F, 64, 4, 3, 0F,0F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box457
		gunModel[237].setRotationPoint(68.5F, -47F, -6.25F);

		gunModel[238].addShapeBox(0F, 0F, 0F, 73, 2, 6, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box99
		gunModel[238].setRotationPoint(59.5F, -47F, -3.25F);

		gunModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.5F, -0.2F, -0.99F, -0.5F, -0.2F, -0.99F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box459
		gunModel[239].setRotationPoint(105.5F, -48F, -4.5F);

		gunModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, -0.99F, -0.5F, -0.3F, -0.99F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box460
		gunModel[240].setRotationPoint(105.5F, -49F, -4.25F);

		gunModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.99F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.99F, -0.5F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box446
		gunModel[241].setRotationPoint(100.5F, -48F, -4.5F);

		gunModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.99F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.3F, -0.99F, -0.5F, -0.3F); // Import Box447
		gunModel[242].setRotationPoint(100.5F, -49F, -3.75F);

		gunModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.5F, -0.2F, -0.99F, -0.5F, -0.2F, -0.99F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box459
		gunModel[243].setRotationPoint(91.5F, -48F, -4.5F);

		gunModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, -0.99F, -0.5F, -0.3F, -0.99F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box460
		gunModel[244].setRotationPoint(91.5F, -49F, -4.25F);

		gunModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.99F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.99F, -0.5F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box446
		gunModel[245].setRotationPoint(86.5F, -48F, -4.5F);

		gunModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.99F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.3F, -0.99F, -0.5F, -0.3F); // Import Box447
		gunModel[246].setRotationPoint(86.5F, -49F, -3.75F);

		gunModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.5F, -0.2F, -0.99F, -0.5F, -0.2F, -0.99F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box459
		gunModel[247].setRotationPoint(77.5F, -48F, -4.5F);

		gunModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, -0.99F, -0.5F, -0.3F, -0.99F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Import Box460
		gunModel[248].setRotationPoint(77.5F, -49F, -4.25F);

		gunModel[249].addShapeBox(0F, 0F, 0F, 73, 4, 1, 0F,0F, -1.5F, -0.25F, -0.2F, -1.5F, -0.25F, -0.6F, -2.875F, 0F, 0F, -2.875F, 0F, 0F, 0.25F, -0.25F, -1F, 0.25F, -0.25F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box472
		gunModel[249].setRotationPoint(59.5F, -42.75F, -3.5F);

		gunModel[250].addShapeBox(0F, 0F, 0F, 73, 2, 1, 0F,0F, -0.625F, -0.25F, -0.6F, -0.625F, -0.25F, -0.85F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box475
		gunModel[250].setRotationPoint(59.5F, -40.5F, -2.75F);

		gunModel[251].addShapeBox(0F, 0F, 0F, 73, 1, 1, 0F,0F, -0.5F, -0.25F, -0.85F, -0.5F, -0.25F, -1F, -0.99F, 0.25F, 0F, -0.99F, 0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box476
		gunModel[251].setRotationPoint(59.5F, -39.5F, -1.75F);

		gunModel[252].addShapeBox(0F, 0F, 0F, 48, 3, 6, 0F,0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box99
		gunModel[252].setRotationPoint(84.5F, -38F, -3.25F);

		gunModel[253].addShapeBox(0F, 0F, 0F, 46, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		gunModel[253].setRotationPoint(84.5F, -35F, -4.5F);

		gunModel[254].addShapeBox(0F, 0F, 0F, 61, 1, 9, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, -0.15F, 0.25F, -1F, -0.15F, 0.25F, -1F, 0F, 0.25F, -1F); // Import Box99
		gunModel[254].setRotationPoint(68.5F, -34F, -4.5F);

		gunModel[255].addShapeBox(0F, 0F, 0F, 61, 1, 9, 0F,0F, 0F, -1F, -0.15F, 0F, -1F, -0.15F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2.25F, -0.65F, 0F, -2.25F, -0.65F, 0F, -2.25F, 0F, 0F, -2.25F); // Import Box99
		gunModel[255].setRotationPoint(68.5F, -32.75F, -4.5F);

		gunModel[256].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[256].setRotationPoint(59.5F, -30.5F, -4.5F);

		gunModel[257].addShapeBox(0F, 0F, 0F, 16, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		gunModel[257].setRotationPoint(68.5F, -35F, -4.5F);

		gunModel[258].addShapeBox(0F, 0F, 0F, 16, 3, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		gunModel[258].setRotationPoint(68.5F, -38F, -2.5F);

		gunModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.99F, 0F, -0.4F); // Import Box99
		gunModel[259].setRotationPoint(83.5F, -38F, 1.5F);

		gunModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		gunModel[260].setRotationPoint(83.5F, -35F, 1.5F);

		gunModel[261].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[261].setRotationPoint(68.5F, -38.5F, 1.5F);

		gunModel[262].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		gunModel[262].setRotationPoint(67F, -36.5F, 2.5F);

		gunModel[263].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box0
		gunModel[263].setRotationPoint(67F, -37F, 2.5F);

		gunModel[264].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Import Box0
		gunModel[264].setRotationPoint(67F, -36F, 2.5F);

		gunModel[265].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		gunModel[265].setRotationPoint(74F, -35.5F, 2F);

		gunModel[266].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[266].setRotationPoint(74F, -36.5F, 2F);

		gunModel[267].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[267].setRotationPoint(74F, -37.5F, 2F);

		gunModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 0F, -1F); // Import Box0
		gunModel[268].setRotationPoint(81F, -35.5F, 2F);

		gunModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Import Box0
		gunModel[269].setRotationPoint(81F, -36.5F, 2F);

		gunModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Import Box0
		gunModel[270].setRotationPoint(81F, -37.5F, 2F);

		gunModel[271].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box0
		gunModel[271].setRotationPoint(21F, -43.5F, 8F);

		gunModel[272].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Import Box0
		gunModel[272].setRotationPoint(21F, -42.5F, 10F);

		gunModel[273].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -2F, -0.5F); // Import Box0
		gunModel[273].setRotationPoint(20F, -44.5F, 5.5F);

		gunModel[274].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -0.5F); // Import Box0
		gunModel[274].setRotationPoint(20F, -43.5F, 8F);

		gunModel[275].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, -2.5F, 0.5F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 0F, -4.5F, -0.5F, 0F, -2F, 0.5F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -4F, -0.5F); // Import Box0
		gunModel[275].setRotationPoint(20F, -42.5F, 10F);

		gunModel[276].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box452
		gunModel[276].setRotationPoint(21F, -44.5F, -8.5F);

		gunModel[277].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box453
		gunModel[277].setRotationPoint(21F, -43.5F, -10F);

		gunModel[278].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box454
		gunModel[278].setRotationPoint(21F, -42.5F, -11F);

		gunModel[279].addShapeBox(0F, 0F, 0F, 1, 17, 3, 0F,0F, -2.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box455
		gunModel[279].setRotationPoint(20F, -44.5F, -8.5F);

		gunModel[280].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -3.5F, -0.5F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box456
		gunModel[280].setRotationPoint(20F, -43.5F, -10F);

		gunModel[281].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, -4.5F, -0.5F, 0F, -3.5F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0.5F, 0F, -4F, -0.5F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0.5F); // Import Box457
		gunModel[281].setRotationPoint(20F, -42.5F, -11F);

		gunModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Import Box0
		gunModel[282].setRotationPoint(28.5F, -6.5F, -5F);

		gunModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, -1F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 1F, 0F); // Import Box0
		gunModel[283].setRotationPoint(30.5F, -7.5F, -5F);

		gunModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0.25F, -1.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, -1.25F, 0F, 0.25F, 1.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 1.25F, 0F); // Import Box0
		gunModel[284].setRotationPoint(33F, -8.5F, -5F);

		gunModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, 1.25F, 0F, 0.25F, 0.51F, 0F, 0.25F, 0.51F, 0F, 0.25F, 1.25F, 0F); // Import Box0
		gunModel[285].setRotationPoint(35F, -9.5F, -5F);

		gunModel[286].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F); // Import Box0
		gunModel[286].setRotationPoint(21.5F, -6.5F, -5F);

		gunModel[287].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,-0.5F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F); // Import Box0
		gunModel[287].setRotationPoint(19.5F, -7.75F, -5F);

		gunModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, -1F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0.5F, 0F); // Import Box0
		gunModel[288].setRotationPoint(18.5F, -10.75F, -5F);

		gunModel[289].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F); // Import Box0
		gunModel[289].setRotationPoint(18F, -13.25F, -5.5F);

		gunModel[290].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[290].setRotationPoint(17.25F, -14.25F, -5.5F);

		gunModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box0
		gunModel[291].setRotationPoint(18.5F, -16.25F, -5.5F);

		gunModel[292].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[292].setRotationPoint(18.5F, -18.25F, -5.5F);

		gunModel[293].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, -0.25F, 0F, 2.5F, -0.25F, 0F, 2.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[293].setRotationPoint(18.5F, -20.25F, -5.5F);

		gunModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[294].setRotationPoint(18.5F, -22F, -5.5F);

		gunModel[295].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.25F, -0.5F, -1F, 1F, -0.5F, -1F, 1F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import Box0
		gunModel[295].setRotationPoint(17.5F, -50F, -5.5F);

		gunModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Import Box0
		gunModel[296].setRotationPoint(18.5F, -51.5F, 3.5F);

		gunModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0.75F, 0F, 1.5F, -0.75F, 0F, 1.5F, -0.75F, 0F, 0F, 0.75F, 0F, -1F); // Import Box0
		gunModel[297].setRotationPoint(17.5F, -51.5F, 3.5F);

		gunModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box0
		gunModel[298].setRotationPoint(17.5F, -52.5F, 2.5F);

		gunModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[299].setRotationPoint(17.5F, -52.5F, -4.5F);

		gunModel[300].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,-3.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -3.75F, 0.25F, 0F, 2F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 2F, 0.25F, 0F); // Import Box0
		gunModel[300].setRotationPoint(115.5F, -51F, -2.5F);

		gunModel[301].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Import Box0
		gunModel[301].setRotationPoint(120.75F, -53F, -1F);

		gunModel[302].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[302].setRotationPoint(122.75F, -53F, -1F);

		gunModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Import Box0
		gunModel[303].setRotationPoint(127.25F, -53F, -1F);

		gunModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box0
		gunModel[304].setRotationPoint(129.75F, -53F, -1F);

		gunModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box0
		gunModel[305].setRotationPoint(129.25F, -53F, -1F);

		gunModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[306].setRotationPoint(122.75F, -53.5F, -1F);

		gunModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, -0.95F, -1F, 0F, -0.95F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		gunModel[307].setRotationPoint(122.75F, -54F, -1F);

		gunModel[308].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0.5F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0.5F, -0.5F, -0.3F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import Box0
		gunModel[308].setRotationPoint(20F, -47.5F, -5.5F);

		gunModel[309].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Import Box0
		gunModel[309].setRotationPoint(19.5F, -49.5F, -5.5F);

		gunModel[310].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-0.25F, -0.5F, 0.5F, 1F, -0.5F, 0.5F, 1F, -0.5F, -1F, -0.25F, -0.5F, -1F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[310].setRotationPoint(17.5F, -50F, 2.5F);

		gunModel[311].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[311].setRotationPoint(18.5F, -49F, -2F);

		gunModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[312].setRotationPoint(18.5F, -50F, -2F);

		gunModel[313].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F,0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box499
		gunModel[313].setRotationPoint(59.5F, -47F, -6.75F);

		gunModel[314].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box500
		gunModel[314].setRotationPoint(59.5F, -43F, -6.75F);

		gunModel[315].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Import Box0
		gunModel[315].setRotationPoint(120.25F, -53.15F, -1F);

		gunModel[316].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Import Box0
		gunModel[316].setRotationPoint(120.25F, -52.65F, -1F);

		gunModel[317].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F); // Import Box0
		gunModel[317].setRotationPoint(120.25F, -52.15F, -1F);

		gunModel[318].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-1F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 1F, 0F, -0.25F); // Import Box508
		gunModel[318].setRotationPoint(19.5F, -52.5F, -4.5F);

		gunModel[319].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box509
		gunModel[319].setRotationPoint(19.5F, -50.5F, -4.5F);

		gunModel[320].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Import Box510
		gunModel[320].setRotationPoint(19.5F, -51.5F, -4.5F);

		gunModel[321].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Import Box511
		gunModel[321].setRotationPoint(25.5F, -51.5F, -4.5F);

		gunModel[322].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.1F, 0F, 0F, -0.1F); // Import Box512
		gunModel[322].setRotationPoint(25.5F, -52F, -4.5F);

		gunModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.75F, 0F, 1.5F); // Import Box513
		gunModel[323].setRotationPoint(18.5F, -51.5F, -4.5F);

		gunModel[324].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box513
		gunModel[324].setRotationPoint(20F, -50.5F, -2.5F);

		gunModel[325].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box513
		gunModel[325].setRotationPoint(20F, -52F, -3F);

		gunModel[326].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box513
		gunModel[326].setRotationPoint(20F, -52F, 1F);

		gunModel[327].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box513
		gunModel[327].setRotationPoint(20F, -52F, -3F);

		gunModel[328].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box518
		gunModel[328].setRotationPoint(20F, -52F, 1F);

		gunModel[329].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, -0.99F, 0F, -1F, -0.99F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box513
		gunModel[329].setRotationPoint(20F, -52F, 0F);

		gunModel[330].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.99F, 0F, -1F, -0.99F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Import Box513
		gunModel[330].setRotationPoint(20F, -52F, -1F);

		gunModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import Box0
		gunModel[331].setRotationPoint(19.15F, -51.65F, -2.5F);

		gunModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Import Box0
		gunModel[332].setRotationPoint(19.15F, -51.65F, -2.5F);

		gunModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import Box0
		gunModel[333].setRotationPoint(19.15F, -51.9F, -2.5F);

		gunModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import Box0
		gunModel[334].setRotationPoint(19.15F, -51.65F, 1.25F);

		gunModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Import Box0
		gunModel[335].setRotationPoint(19.15F, -51.65F, 1.25F);

		gunModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import Box0
		gunModel[336].setRotationPoint(19.15F, -51.9F, 1.25F);

		gunModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[337].setRotationPoint(59.5F, -21F, -5.5F);

		gunModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -0.75F, 0F, -1F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F); // Import Box0
		gunModel[338].setRotationPoint(59.5F, -21.5F, -5.5F);

		gunModel[339].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box0
		gunModel[339].setRotationPoint(59.5F, -29.5F, -4.5F);

		gunModel[340].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F); // Import Box0
		gunModel[340].setRotationPoint(59.5F, -26.5F, -3.5F);

		gunModel[341].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, 0.5F, 1.75F, -0.75F, 0.5F, 1.75F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, 1.75F, 0F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 1.25F, 0F, 0F, 1.25F); // Import Box0
		gunModel[341].setRotationPoint(59.5F, -21.75F, -3.5F);

		gunModel[342].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 1.75F, -0.75F, 0.5F, 1.75F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, 1.75F); // Import Box0
		gunModel[342].setRotationPoint(59.5F, -25F, -3.5F);

		gunModel[343].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, 0.5F, 1.75F, -0.75F, 0.5F, 1.75F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, 1.75F, 0F, -0.25F, 1.75F, -0.75F, -0.25F, 1.75F, -0.75F, -0.25F, 1.75F, 0F, -0.25F, 1.75F); // Import Box0
		gunModel[343].setRotationPoint(59.5F, -23F, -3.5F);

		gunModel[344].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,-0.5F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[344].setRotationPoint(59.25F, -21F, -5.5F);

		gunModel[345].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-0.5F, 0F, 0F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.75F, 0F, -1.75F, -0.75F, 0F, -1.75F, 0.5F, 0F, -0.5F); // Import Box0
		gunModel[345].setRotationPoint(66.5F, -29.5F, -4.5F);

		gunModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-0.5F, 0F, -0.5F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.75F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, -1.25F, -0.25F, -0.5F, -1.25F, 0F, -0.5F, 0F); // Import Box0
		gunModel[346].setRotationPoint(65.5F, -26.5F, -4.5F);

		gunModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-0.5F, 0F, -0.5F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.75F, -0.5F, 0F, -0.5F, 0.25F, -0.5F, 0.25F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0.25F, -0.5F, 0.25F); // Import Box0
		gunModel[347].setRotationPoint(65F, -25F, -5F);

		gunModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, 0F, -0.75F, 0.25F); // Import Box0
		gunModel[348].setRotationPoint(64.75F, -23.5F, -5F);

		gunModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0.25F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -0.25F); // Import Box0
		gunModel[349].setRotationPoint(64.75F, -22.25F, -5F);

		gunModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.75F, 0F, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, -1.25F, -0.75F, 0F, -1.25F, 0.75F, 0F, 0F); // Import Box0
		gunModel[350].setRotationPoint(67.75F, -30.5F, -4.5F);

		gunModel[351].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0.15F, 0.5F, 0F, 0.15F, 0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.9F, 0F, 0F, -0.9F); // Import Box509
		gunModel[351].setRotationPoint(24.5F, -50.5F, -2.25F);

		gunModel[352].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 1.25F, 0F, -1.5F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, -1.5F); // Import Box0
		gunModel[352].setRotationPoint(-8.5F, -24F, -4.5F);

		gunModel[353].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-0.75F, 0F, -1.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, -1.5F, 1.25F, 0F, -1.5F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, -1.5F); // Import Box0
		gunModel[353].setRotationPoint(-10.5F, -21F, -4.5F);

		gunModel[354].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F,-0.75F, 0F, -1.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, -1.5F, 2.5F, 0F, -1.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, -1.5F); // Import Box0
		gunModel[354].setRotationPoint(-12.5F, -18F, -4.5F);

		gunModel[355].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F,-0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 2.5F, 0F, -1.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, -1.5F); // Import Box0
		gunModel[355].setRotationPoint(-15.5F, -12F, -4.5F);

		gunModel[356].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F,-0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 2.5F, 0F, -1.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, -1.5F); // Import Box0
		gunModel[356].setRotationPoint(-18.5F, -6F, -4.5F);

		gunModel[357].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,-0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 1.25F, 0F, -1.5F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, -1.5F); // Import Box0
		gunModel[357].setRotationPoint(-21.5F, 3F, -4.5F);

		gunModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1.25F, 0F, -1.5F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, -1.5F, 0.5F, 0.75F, -1.5F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0.5F, 0.75F, -1.5F); // Import Box0
		gunModel[358].setRotationPoint(-21.5F, 10F, -4.5F);

		gunModel[359].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -1.5F); // Import Box0
		gunModel[359].setRotationPoint(-7.5F, -26F, -4.5F);

		gunModel[360].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import Box0
		gunModel[360].setRotationPoint(-7.5F, -28F, -4.5F);

		gunModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-1F, 0F, -1.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import Box0
		gunModel[361].setRotationPoint(-7.5F, -29F, -4.5F);

		gunModel[362].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.25F, 0F, 0F); // Import Box342
		gunModel[362].setRotationPoint(16.5F, -50F, -2F);

		gunModel[363].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.45F, -0.25F, -1.2F, 0F, -0.25F, -1.2F, 0F, -0.25F, 0.21F, 0.45F, -0.25F, 0.21F, 0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0.75F, 0F, 1.5F); // Import Box0
		gunModel[363].setRotationPoint(17.5F, -50.5F, -3.5F);

		gunModel[364].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.45F, -0.25F, 0.21F, 0F, -0.25F, 0.21F, 0F, -0.25F, -1.2F, 0.45F, -0.25F, -1.2F, 0.75F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0.75F, 0F, -1.5F); // Import Box565
		gunModel[364].setRotationPoint(17.5F, -50.5F, 2.5F);

		gunModel[365].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F); // Import Box0
		gunModel[365].setRotationPoint(-14.5F, -12F, -4.5F);

		gunModel[366].addShapeBox(0F, 0F, 0F, 2, 6, 9, 0F,-0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F); // Import Box0
		gunModel[366].setRotationPoint(-11.5F, -18F, -4.5F);

		gunModel[367].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1.25F, 0F, 0F); // Import Box0
		gunModel[367].setRotationPoint(-7.5F, -24F, -4.5F);

		gunModel[368].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,-0.75F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.75F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0F); // Import Box0
		gunModel[368].setRotationPoint(-9.5F, -21F, -4.5F);

		gunModel[369].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box0
		gunModel[369].setRotationPoint(-6.5F, -26F, -4.5F);

		gunModel[370].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F); // Import Box0
		gunModel[370].setRotationPoint(-17.5F, -6F, -4.5F);

		gunModel[371].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F); // Import Box0
		gunModel[371].setRotationPoint(-20.5F, 3F, -4.5F);

		gunModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F); // Import Box0
		gunModel[372].setRotationPoint(-20.5F, 10F, -4.5F);

		gunModel[373].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box578
		gunModel[373].setRotationPoint(59.5F, -41.5F, -6.75F);

		gunModel[374].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[374].setRotationPoint(18F, -33F, 5F);

		gunModel[375].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F); // Import Box0
		gunModel[375].setRotationPoint(16F, -34F, 5F);

		gunModel[376].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.25F, 0F); // Import Box0
		gunModel[376].setRotationPoint(14F, -34F, 5F);

		gunModel[377].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, -0.25F); // Import Box0
		gunModel[377].setRotationPoint(11.5F, -34F, 5.5F);

		gunModel[378].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		gunModel[378].setRotationPoint(10.5F, -33F, 5.5F);

		gunModel[379].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F); // Import Box0
		gunModel[379].setRotationPoint(9.5F, -32F, 5.5F);

		gunModel[380].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[380].setRotationPoint(13.75F, -31F, 5.25F);

		gunModel[381].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[381].setRotationPoint(13.75F, -32F, 5.25F);

		gunModel[382].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		gunModel[382].setRotationPoint(13.75F, -33F, 5.25F);

		gunModel[383].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[383].setRotationPoint(62.75F, -35F, 3.5F);

		gunModel[384].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F); // Import Box0
		gunModel[384].setRotationPoint(62.75F, -34F, 3.5F);

		gunModel[385].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Import Box0
		gunModel[385].setRotationPoint(62.75F, -33F, 3.5F);

		gunModel[386].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[386].setRotationPoint(62.75F, -37F, 4F);

		gunModel[387].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F); // Import Box0
		gunModel[387].setRotationPoint(62.75F, -36F, 4F);

		gunModel[388].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box0
		gunModel[388].setRotationPoint(62.75F, -35.5F, 3.5F);

		gunModel[389].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box0
		gunModel[389].setRotationPoint(62.75F, -38F, 4F);

		gunModel[390].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.75F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		gunModel[390].setRotationPoint(62.75F, -39F, 4F);

		gunModel[391].addShapeBox(0F, 0F, 0F, 4, 1, 15, 0F,0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		gunModel[391].setRotationPoint(-17.75F, 11.5F, -7.75F);

		gunModel[392].addShapeBox(0F, 0F, 0F, 4, 1, 15, 0F,0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -1.25F, 0.25F, -0.5F, -1.25F, 0.25F, -0.5F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F); // Import Box0
		gunModel[392].setRotationPoint(-17.75F, 13F, -7.75F);

		gunModel[393].addShapeBox(0F, 0F, 0F, 4, 1, 15, 0F,-1.25F, 0.25F, -0.5F, -1.25F, 0.25F, -0.5F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import Box0
		gunModel[393].setRotationPoint(-17.75F, 10F, -7.75F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Import Box0
		ammoModel[1] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Import Box0
		ammoModel[3] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Import Box0
		ammoModel[4] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Import Box616
		ammoModel[5] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Import Box617
		ammoModel[6] = new ModelRendererTurbo(this, 153, 241, textureX, textureY); // Import Box618
		ammoModel[7] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Import Box619
		ammoModel[8] = new ModelRendererTurbo(this, 185, 305, textureX, textureY); // Import Box620
		ammoModel[9] = new ModelRendererTurbo(this, 65, 313, textureX, textureY); // Import Box621
		ammoModel[10] = new ModelRendererTurbo(this, 257, 305, textureX, textureY); // Import Box622
		ammoModel[11] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Import Box0
		ammoModel[12] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box0
		ammoModel[13] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Import Box0
		ammoModel[14] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Import Box0
		ammoModel[15] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Import Box0
		ammoModel[16] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Import Box0
		ammoModel[17] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Import Box0
		ammoModel[18] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Import Box0
		ammoModel[19] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import Box0
		ammoModel[20] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Import Box0
		ammoModel[21] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Import Box0
		ammoModel[22] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Import Box0
		ammoModel[23] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Import Box0
		ammoModel[24] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Import Box0
		ammoModel[25] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Import Box0
		ammoModel[26] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 6
		ammoModel[27] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 7
		ammoModel[28] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 8
		ammoModel[29] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 9
		ammoModel[30] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 10
		ammoModel[31] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 11
		ammoModel[32] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 12
		ammoModel[33] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 13
		ammoModel[34] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 14
		ammoModel[35] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 15
		ammoModel[36] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 16
		ammoModel[37] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 17
		ammoModel[38] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 18
		ammoModel[39] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 19
		ammoModel[40] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 20
		ammoModel[41] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 21
		ammoModel[42] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 22
		ammoModel[43] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 23
		ammoModel[44] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 24
		ammoModel[45] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 25
		ammoModel[46] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 26
		ammoModel[47] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 27
		ammoModel[48] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 28
		ammoModel[49] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 29
		ammoModel[50] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 30
		ammoModel[51] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 31
		ammoModel[52] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 32
		ammoModel[53] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 33
		ammoModel[54] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 34
		ammoModel[55] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 35
		ammoModel[56] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 36
		ammoModel[57] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 556
		ammoModel[58] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Box 557
		ammoModel[59] = new ModelRendererTurbo(this, 185, 305, textureX, textureY); // Box 558
		ammoModel[60] = new ModelRendererTurbo(this, 65, 313, textureX, textureY); // Box 559
		ammoModel[61] = new ModelRendererTurbo(this, 257, 305, textureX, textureY); // Box 560
		ammoModel[62] = new ModelRendererTurbo(this, 153, 241, textureX, textureY); // Box 561
		ammoModel[63] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Box 562
		ammoModel[64] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 563
		ammoModel[65] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Box 564
		ammoModel[66] = new ModelRendererTurbo(this, 185, 305, textureX, textureY); // Box 565
		ammoModel[67] = new ModelRendererTurbo(this, 65, 313, textureX, textureY); // Box 566
		ammoModel[68] = new ModelRendererTurbo(this, 257, 305, textureX, textureY); // Box 567
		ammoModel[69] = new ModelRendererTurbo(this, 153, 241, textureX, textureY); // Box 568
		ammoModel[70] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Box 569
		ammoModel[71] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 570
		ammoModel[72] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Box 571
		ammoModel[73] = new ModelRendererTurbo(this, 185, 305, textureX, textureY); // Box 572
		ammoModel[74] = new ModelRendererTurbo(this, 65, 313, textureX, textureY); // Box 573
		ammoModel[75] = new ModelRendererTurbo(this, 257, 305, textureX, textureY); // Box 574
		ammoModel[76] = new ModelRendererTurbo(this, 153, 241, textureX, textureY); // Box 575
		ammoModel[77] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Box 576
		ammoModel[78] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 577
		ammoModel[79] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Box 578
		ammoModel[80] = new ModelRendererTurbo(this, 185, 305, textureX, textureY); // Box 579
		ammoModel[81] = new ModelRendererTurbo(this, 65, 313, textureX, textureY); // Box 580
		ammoModel[82] = new ModelRendererTurbo(this, 257, 305, textureX, textureY); // Box 581
		ammoModel[83] = new ModelRendererTurbo(this, 153, 241, textureX, textureY); // Box 582
		ammoModel[84] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Box 583

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		ammoModel[0].setRotationPoint(26F, -40.5F, -6.25F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box0
		ammoModel[1].setRotationPoint(26F, -40.5F, -7.25F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Import Box0
		ammoModel[2].setRotationPoint(26F, -40.5F, -8F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F); // Import Box0
		ammoModel[3].setRotationPoint(26F, -39.5F, -9F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box616
		ammoModel[4].setRotationPoint(28F, -37.5F, -8.75F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box617
		ammoModel[5].setRotationPoint(28F, -36.5F, -8.75F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F); // Import Box618
		ammoModel[6].setRotationPoint(28F, -35.5F, -8.75F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Import Box619
		ammoModel[7].setRotationPoint(28F, -34.75F, -7.75F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box620
		ammoModel[8].setRotationPoint(28F, -38.5F, -8.75F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box621
		ammoModel[9].setRotationPoint(28F, -39.5F, -8.75F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box622
		ammoModel[10].setRotationPoint(28F, -40.25F, -7.75F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[11].setRotationPoint(25.75F, -37.5F, 4.75F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		ammoModel[12].setRotationPoint(25.75F, -36.5F, 4.75F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[13].setRotationPoint(25.75F, -38.5F, 4.75F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[14].setRotationPoint(25.75F, -37.5F, -7.25F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		ammoModel[15].setRotationPoint(25.75F, -36.5F, -7.25F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[16].setRotationPoint(25.75F, -38.5F, -7.25F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[17].setRotationPoint(25.75F, -42.25F, -1.25F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		ammoModel[18].setRotationPoint(25.75F, -41.25F, -1.25F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[19].setRotationPoint(25.75F, -43.25F, -1.25F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[20].setRotationPoint(25.75F, -30.5F, 2.75F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		ammoModel[21].setRotationPoint(25.75F, -29.5F, 2.75F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[22].setRotationPoint(25.75F, -31.5F, 2.75F);

		ammoModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[23].setRotationPoint(25.75F, -30.5F, -5.25F);

		ammoModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box0
		ammoModel[24].setRotationPoint(25.75F, -29.5F, -5.25F);

		ammoModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		ammoModel[25].setRotationPoint(25.75F, -31.5F, -5.25F);

		ammoModel[26].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 6
		ammoModel[26].setRotationPoint(26F, -39.5F, -3.5F);

		ammoModel[27].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F); // Box 7
		ammoModel[27].setRotationPoint(26F, -40.5F, -4.5F);

		ammoModel[28].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 8
		ammoModel[28].setRotationPoint(26F, -40.5F, -5.25F);

		ammoModel[29].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 9
		ammoModel[29].setRotationPoint(26F, -40.5F, 5.75F);

		ammoModel[30].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 10
		ammoModel[30].setRotationPoint(26F, -40.5F, 4.75F);

		ammoModel[31].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 11
		ammoModel[31].setRotationPoint(26F, -40.5F, 4F);

		ammoModel[32].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F); // Box 12
		ammoModel[32].setRotationPoint(26F, -39.5F, 3F);

		ammoModel[33].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 13
		ammoModel[33].setRotationPoint(26F, -40.5F, 6.75F);

		ammoModel[34].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F); // Box 14
		ammoModel[34].setRotationPoint(26F, -40.5F, 7.5F);

		ammoModel[35].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 15
		ammoModel[35].setRotationPoint(26F, -39.5F, 8.5F);

		ammoModel[36].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 16
		ammoModel[36].setRotationPoint(26F, -45.25F, -0.25F);

		ammoModel[37].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 17
		ammoModel[37].setRotationPoint(26F, -45.25F, -1.25F);

		ammoModel[38].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 18
		ammoModel[38].setRotationPoint(26F, -45.25F, -2F);

		ammoModel[39].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F); // Box 19
		ammoModel[39].setRotationPoint(26F, -44.25F, -3F);

		ammoModel[40].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 20
		ammoModel[40].setRotationPoint(26F, -45.25F, 0.75F);

		ammoModel[41].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F); // Box 21
		ammoModel[41].setRotationPoint(26F, -45.25F, 1.5F);

		ammoModel[42].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 22
		ammoModel[42].setRotationPoint(26F, -44.25F, 2.5F);

		ammoModel[43].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 23
		ammoModel[43].setRotationPoint(26F, -33.5F, -4.25F);

		ammoModel[44].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 24
		ammoModel[44].setRotationPoint(26F, -33.5F, -5.25F);

		ammoModel[45].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 25
		ammoModel[45].setRotationPoint(26F, -33.5F, -6F);

		ammoModel[46].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F); // Box 26
		ammoModel[46].setRotationPoint(26F, -32.5F, -7F);

		ammoModel[47].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 27
		ammoModel[47].setRotationPoint(26F, -33.5F, -3.25F);

		ammoModel[48].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F); // Box 28
		ammoModel[48].setRotationPoint(26F, -33.5F, -2.5F);

		ammoModel[49].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 29
		ammoModel[49].setRotationPoint(26F, -32.5F, -1.5F);

		ammoModel[50].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 30
		ammoModel[50].setRotationPoint(26F, -33.5F, 3.75F);

		ammoModel[51].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 31
		ammoModel[51].setRotationPoint(26F, -33.5F, 2.75F);

		ammoModel[52].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 32
		ammoModel[52].setRotationPoint(26F, -33.5F, 2F);

		ammoModel[53].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F); // Box 33
		ammoModel[53].setRotationPoint(26F, -32.5F, 1F);

		ammoModel[54].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 34
		ammoModel[54].setRotationPoint(26F, -33.5F, 4.75F);

		ammoModel[55].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.625F, 0.25F, 0F, -1.625F, 0.25F); // Box 35
		ammoModel[55].setRotationPoint(26F, -33.5F, 5.5F);

		ammoModel[56].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 36
		ammoModel[56].setRotationPoint(26F, -32.5F, 6.5F);

		ammoModel[57].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 556
		ammoModel[57].setRotationPoint(28F, -36.5F, 3.25F);

		ammoModel[58].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 557
		ammoModel[58].setRotationPoint(28F, -37.5F, 3.25F);

		ammoModel[59].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 558
		ammoModel[59].setRotationPoint(28F, -38.5F, 3.25F);

		ammoModel[60].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 559
		ammoModel[60].setRotationPoint(28F, -39.5F, 3.25F);

		ammoModel[61].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 560
		ammoModel[61].setRotationPoint(28F, -40.25F, 4.25F);

		ammoModel[62].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F); // Box 561
		ammoModel[62].setRotationPoint(28F, -35.5F, 3.25F);

		ammoModel[63].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 562
		ammoModel[63].setRotationPoint(28F, -34.75F, 4.25F);

		ammoModel[64].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 563
		ammoModel[64].setRotationPoint(28F, -29.5F, 1.25F);

		ammoModel[65].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 564
		ammoModel[65].setRotationPoint(28F, -30.5F, 1.25F);

		ammoModel[66].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 565
		ammoModel[66].setRotationPoint(28F, -31.5F, 1.25F);

		ammoModel[67].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 566
		ammoModel[67].setRotationPoint(28F, -32.5F, 1.25F);

		ammoModel[68].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 567
		ammoModel[68].setRotationPoint(28F, -33.25F, 2.25F);

		ammoModel[69].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F); // Box 568
		ammoModel[69].setRotationPoint(28F, -28.5F, 1.25F);

		ammoModel[70].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 569
		ammoModel[70].setRotationPoint(28F, -27.75F, 2.25F);

		ammoModel[71].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 570
		ammoModel[71].setRotationPoint(28F, -29.5F, -6.75F);

		ammoModel[72].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 571
		ammoModel[72].setRotationPoint(28F, -30.5F, -6.75F);

		ammoModel[73].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 572
		ammoModel[73].setRotationPoint(28F, -31.5F, -6.75F);

		ammoModel[74].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 573
		ammoModel[74].setRotationPoint(28F, -32.5F, -6.75F);

		ammoModel[75].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 574
		ammoModel[75].setRotationPoint(28F, -33.25F, -5.75F);

		ammoModel[76].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F); // Box 575
		ammoModel[76].setRotationPoint(28F, -28.5F, -6.75F);

		ammoModel[77].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 576
		ammoModel[77].setRotationPoint(28F, -27.75F, -5.75F);

		ammoModel[78].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 577
		ammoModel[78].setRotationPoint(28F, -41.25F, -2.75F);

		ammoModel[79].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 578
		ammoModel[79].setRotationPoint(28F, -42.25F, -2.75F);

		ammoModel[80].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 579
		ammoModel[80].setRotationPoint(28F, -43.25F, -2.75F);

		ammoModel[81].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 580
		ammoModel[81].setRotationPoint(28F, -44.25F, -2.75F);

		ammoModel[82].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 581
		ammoModel[82].setRotationPoint(28F, -45F, -1.75F);

		ammoModel[83].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F); // Box 582
		ammoModel[83].setRotationPoint(28F, -40.25F, -2.75F);

		ammoModel[84].addShapeBox(0F, 0F, 0F, 30, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 583
		ammoModel[84].setRotationPoint(28F, -39.5F, -1.75F);
	}

	private void initleverActionModel_1()
	{
		leverActionModel[0] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Import Box0
		leverActionModel[1] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Import Box0
		leverActionModel[2] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Import Box0
		leverActionModel[3] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Import Box0
		leverActionModel[4] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Import Box0
		leverActionModel[5] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Import Box0
		leverActionModel[6] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Import Box0
		leverActionModel[7] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Import Box0

		leverActionModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F); // Import Box0
		leverActionModel[0].setRotationPoint(21F, -19.25F, -3F);

		leverActionModel[1].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, 0F, 1.25F, 0F); // Import Box0
		leverActionModel[1].setRotationPoint(23F, -20.25F, -3F);

		leverActionModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 2F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, -0.5F, 2F, 0F); // Import Box0
		leverActionModel[2].setRotationPoint(25F, -20.25F, -3F);

		leverActionModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 2.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.75F, 2.25F, 0F); // Import Box0
		leverActionModel[3].setRotationPoint(27F, -20.25F, -3F);

		leverActionModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0.5F, 0F, 1.55F, 0.5F, 0F, 1.55F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		leverActionModel[4].setRotationPoint(25.5F, -15.25F, -2.5F);

		leverActionModel[5].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F); // Import Box0
		leverActionModel[5].setRotationPoint(25.5F, -13.25F, -2.5F);

		leverActionModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1F, 0F, 0F); // Import Box0
		leverActionModel[6].setRotationPoint(27F, -10.25F, -2.5F);

		leverActionModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -1.75F, -0.25F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -1.75F, -0.25F, 0F); // Import Box0
		leverActionModel[7].setRotationPoint(28F, -9.25F, -2.5F);
	}

	private void initrevolverBarrelModel_1()
	{
		revolverBarrelModel[0] = new ModelRendererTurbo(this, 177, 313, textureX, textureY); // Import Box0
		revolverBarrelModel[1] = new ModelRendererTurbo(this, 353, 313, textureX, textureY); // Import Box0
		revolverBarrelModel[2] = new ModelRendererTurbo(this, 433, 313, textureX, textureY); // Import Box0
		revolverBarrelModel[3] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Import Box0
		revolverBarrelModel[4] = new ModelRendererTurbo(this, 81, 321, textureX, textureY); // Import Box0
		revolverBarrelModel[5] = new ModelRendererTurbo(this, 257, 321, textureX, textureY); // Import Box0
		revolverBarrelModel[6] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Import Box0
		revolverBarrelModel[7] = new ModelRendererTurbo(this, 81, 329, textureX, textureY); // Import Box0
		revolverBarrelModel[8] = new ModelRendererTurbo(this, 161, 329, textureX, textureY); // Import Box93
		revolverBarrelModel[9] = new ModelRendererTurbo(this, 241, 329, textureX, textureY); // Import Box94
		revolverBarrelModel[10] = new ModelRendererTurbo(this, 321, 329, textureX, textureY); // Import Box95
		revolverBarrelModel[11] = new ModelRendererTurbo(this, 401, 329, textureX, textureY); // Import Box96
		revolverBarrelModel[12] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Import Box98
		revolverBarrelModel[13] = new ModelRendererTurbo(this, 81, 337, textureX, textureY); // Import Box99
		revolverBarrelModel[14] = new ModelRendererTurbo(this, 161, 337, textureX, textureY); // Import Box99
		revolverBarrelModel[15] = new ModelRendererTurbo(this, 241, 337, textureX, textureY); // Import Box99
		revolverBarrelModel[16] = new ModelRendererTurbo(this, 321, 337, textureX, textureY); // Import Box99
		revolverBarrelModel[17] = new ModelRendererTurbo(this, 401, 337, textureX, textureY); // Import Box99
		revolverBarrelModel[18] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Import Box93
		revolverBarrelModel[19] = new ModelRendererTurbo(this, 81, 345, textureX, textureY); // Import Box93
		revolverBarrelModel[20] = new ModelRendererTurbo(this, 161, 345, textureX, textureY); // Import Box99
		revolverBarrelModel[21] = new ModelRendererTurbo(this, 241, 345, textureX, textureY); // Import Box99
		revolverBarrelModel[22] = new ModelRendererTurbo(this, 321, 345, textureX, textureY); // Import Box99
		revolverBarrelModel[23] = new ModelRendererTurbo(this, 401, 345, textureX, textureY); // Import Box99
		revolverBarrelModel[24] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Import Box99
		revolverBarrelModel[25] = new ModelRendererTurbo(this, 81, 353, textureX, textureY); // Import Box93
		revolverBarrelModel[26] = new ModelRendererTurbo(this, 161, 353, textureX, textureY); // Import Box93
		revolverBarrelModel[27] = new ModelRendererTurbo(this, 241, 353, textureX, textureY); // Import Box99
		revolverBarrelModel[28] = new ModelRendererTurbo(this, 321, 353, textureX, textureY); // Import Box99
		revolverBarrelModel[29] = new ModelRendererTurbo(this, 401, 353, textureX, textureY); // Import Box93
		revolverBarrelModel[30] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Import Box93
		revolverBarrelModel[31] = new ModelRendererTurbo(this, 81, 361, textureX, textureY); // Import Box99
		revolverBarrelModel[32] = new ModelRendererTurbo(this, 161, 361, textureX, textureY); // Import Box99
		revolverBarrelModel[33] = new ModelRendererTurbo(this, 241, 361, textureX, textureY); // Import Box99
		revolverBarrelModel[34] = new ModelRendererTurbo(this, 321, 361, textureX, textureY); // Import Box99
		revolverBarrelModel[35] = new ModelRendererTurbo(this, 401, 361, textureX, textureY); // Import Box99
		revolverBarrelModel[36] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Import Box93
		revolverBarrelModel[37] = new ModelRendererTurbo(this, 81, 369, textureX, textureY); // Import Box99
		revolverBarrelModel[38] = new ModelRendererTurbo(this, 161, 369, textureX, textureY); // Import Box99
		revolverBarrelModel[39] = new ModelRendererTurbo(this, 241, 369, textureX, textureY); // Import Box93
		revolverBarrelModel[40] = new ModelRendererTurbo(this, 305, 369, textureX, textureY); // Import Box0
		revolverBarrelModel[41] = new ModelRendererTurbo(this, 393, 369, textureX, textureY); // Import Box0
		revolverBarrelModel[42] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Import Box0
		revolverBarrelModel[43] = new ModelRendererTurbo(this, 73, 377, textureX, textureY); // Import Box130
		revolverBarrelModel[44] = new ModelRendererTurbo(this, 153, 377, textureX, textureY); // Import Box0
		revolverBarrelModel[45] = new ModelRendererTurbo(this, 161, 385, textureX, textureY); // Import Box0
		revolverBarrelModel[46] = new ModelRendererTurbo(this, 249, 385, textureX, textureY); // Import Box0
		revolverBarrelModel[47] = new ModelRendererTurbo(this, 337, 385, textureX, textureY); // Import Box130
		revolverBarrelModel[48] = new ModelRendererTurbo(this, 233, 377, textureX, textureY); // Import Box0
		revolverBarrelModel[49] = new ModelRendererTurbo(this, 425, 385, textureX, textureY); // Import Box144
		revolverBarrelModel[50] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Import Box145
		revolverBarrelModel[51] = new ModelRendererTurbo(this, 89, 393, textureX, textureY); // Import Box146
		revolverBarrelModel[52] = new ModelRendererTurbo(this, 169, 393, textureX, textureY); // Import Box0
		revolverBarrelModel[53] = new ModelRendererTurbo(this, 249, 393, textureX, textureY); // Import Box99
		revolverBarrelModel[54] = new ModelRendererTurbo(this, 329, 393, textureX, textureY); // Import Box99
		revolverBarrelModel[55] = new ModelRendererTurbo(this, 409, 393, textureX, textureY); // Import Box99
		revolverBarrelModel[56] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Import Box99
		revolverBarrelModel[57] = new ModelRendererTurbo(this, 81, 401, textureX, textureY); // Import Box99
		revolverBarrelModel[58] = new ModelRendererTurbo(this, 249, 401, textureX, textureY); // Import Box99
		revolverBarrelModel[59] = new ModelRendererTurbo(this, 329, 401, textureX, textureY); // Import Box99
		revolverBarrelModel[60] = new ModelRendererTurbo(this, 409, 401, textureX, textureY); // Import Box93
		revolverBarrelModel[61] = new ModelRendererTurbo(this, 1, 409, textureX, textureY); // Import Box99
		revolverBarrelModel[62] = new ModelRendererTurbo(this, 81, 409, textureX, textureY); // Import Box99
		revolverBarrelModel[63] = new ModelRendererTurbo(this, 161, 409, textureX, textureY); // Import Box99
		revolverBarrelModel[64] = new ModelRendererTurbo(this, 241, 409, textureX, textureY); // Import Box99
		revolverBarrelModel[65] = new ModelRendererTurbo(this, 409, 409, textureX, textureY); // Import Box99
		revolverBarrelModel[66] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Import Box99
		revolverBarrelModel[67] = new ModelRendererTurbo(this, 81, 417, textureX, textureY); // Import Box99
		revolverBarrelModel[68] = new ModelRendererTurbo(this, 161, 417, textureX, textureY); // Import Box0
		revolverBarrelModel[69] = new ModelRendererTurbo(this, 241, 417, textureX, textureY); // Import Box99
		revolverBarrelModel[70] = new ModelRendererTurbo(this, 321, 417, textureX, textureY); // Import Box0
		revolverBarrelModel[71] = new ModelRendererTurbo(this, 401, 417, textureX, textureY); // Import Box0
		revolverBarrelModel[72] = new ModelRendererTurbo(this, 1, 425, textureX, textureY); // Import Box0
		revolverBarrelModel[73] = new ModelRendererTurbo(this, 81, 425, textureX, textureY); // Import Box0
		revolverBarrelModel[74] = new ModelRendererTurbo(this, 161, 425, textureX, textureY); // Import Box177
		revolverBarrelModel[75] = new ModelRendererTurbo(this, 241, 425, textureX, textureY); // Import Box178
		revolverBarrelModel[76] = new ModelRendererTurbo(this, 321, 425, textureX, textureY); // Import Box178
		revolverBarrelModel[77] = new ModelRendererTurbo(this, 401, 425, textureX, textureY); // Import Box182
		revolverBarrelModel[78] = new ModelRendererTurbo(this, 1, 433, textureX, textureY); // Box 1
		revolverBarrelModel[79] = new ModelRendererTurbo(this, 81, 433, textureX, textureY); // Box 2
		revolverBarrelModel[80] = new ModelRendererTurbo(this, 161, 433, textureX, textureY); // Box 3
		revolverBarrelModel[81] = new ModelRendererTurbo(this, 233, 433, textureX, textureY); // Box 5

		revolverBarrelModel[0].addShapeBox(0F, 0F, 0F, 36, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box0
		revolverBarrelModel[0].setRotationPoint(22.5F, -39.5F, -10.25F);

		revolverBarrelModel[1].addShapeBox(0F, 0F, 0F, 36, 5, 7, 0F,0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Import Box0
		revolverBarrelModel[1].setRotationPoint(22.5F, -39.5F, -3.25F);

		revolverBarrelModel[2].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -2.875F, 0F, 0F, -2.875F, 0F); // Import Box0
		revolverBarrelModel[2].setRotationPoint(22.5F, -39F, 2.75F);

		revolverBarrelModel[3].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, -2.875F, 0F, 0F, -2.875F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F); // Import Box0
		revolverBarrelModel[3].setRotationPoint(22.5F, -42.75F, 2.75F);

		revolverBarrelModel[4].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		revolverBarrelModel[4].setRotationPoint(22.5F, -40.5F, 2F);

		revolverBarrelModel[5].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box0
		revolverBarrelModel[5].setRotationPoint(22.5F, -39.5F, 2.75F);

		revolverBarrelModel[6].addShapeBox(0F, 0F, 0F, 36, 6, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Import Box0
		revolverBarrelModel[6].setRotationPoint(22.5F, -45.25F, 3.5F);

		revolverBarrelModel[7].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box0
		revolverBarrelModel[7].setRotationPoint(22.5F, -39.5F, 1F);

		revolverBarrelModel[8].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2.875F, 0F, 0F, -2.875F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Import Box93
		revolverBarrelModel[8].setRotationPoint(22.5F, -39F, -3.25F);

		revolverBarrelModel[9].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -2.875F, 0F, 0F, -2.875F, 0F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Import Box94
		revolverBarrelModel[9].setRotationPoint(22.5F, -42.75F, -3.25F);

		revolverBarrelModel[10].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box95
		revolverBarrelModel[10].setRotationPoint(22.5F, -40.5F, -2.5F);

		revolverBarrelModel[11].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box96
		revolverBarrelModel[11].setRotationPoint(22.5F, -39.5F, -3.25F);

		revolverBarrelModel[12].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box98
		revolverBarrelModel[12].setRotationPoint(22.5F, -39.5F, -1.5F);

		revolverBarrelModel[13].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Import Box99
		revolverBarrelModel[13].setRotationPoint(22.5F, -40.5F, -4F);

		revolverBarrelModel[14].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box99
		revolverBarrelModel[14].setRotationPoint(22.5F, -40.5F, -5F);

		revolverBarrelModel[15].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Import Box99
		revolverBarrelModel[15].setRotationPoint(22.5F, -40.5F, -6F);

		revolverBarrelModel[16].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F); // Import Box99
		revolverBarrelModel[16].setRotationPoint(22.5F, -40.5F, -8.5F);

		revolverBarrelModel[17].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F); // Import Box99
		revolverBarrelModel[17].setRotationPoint(22.5F, -40.5F, -7.5F);

		revolverBarrelModel[18].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -2.875F, 0F, 0F, -2.875F, 0F); // Import Box93
		revolverBarrelModel[18].setRotationPoint(22.5F, -39F, -9.25F);

		revolverBarrelModel[19].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, -2.875F, 0F, 0F, -2.875F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box93
		revolverBarrelModel[19].setRotationPoint(22.5F, -38F, -3.25F);

		revolverBarrelModel[20].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Import Box99
		revolverBarrelModel[20].setRotationPoint(22.5F, -35.5F, -4F);

		revolverBarrelModel[21].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Import Box99
		revolverBarrelModel[21].setRotationPoint(22.5F, -34.5F, -5F);

		revolverBarrelModel[22].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 1.625F, 0.25F, 0F, 1.625F, 0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F); // Import Box99
		revolverBarrelModel[22].setRotationPoint(22.5F, -34.5F, -6F);

		revolverBarrelModel[23].addShapeBox(0F, 0F, 0F, 36, 6, 1, 0F,0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import Box99
		revolverBarrelModel[23].setRotationPoint(22.5F, -35.5F, -8.5F);

		revolverBarrelModel[24].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.625F, -0.25F, 0F, 0.625F, -0.25F, 0F, 0.625F, 0.25F, 0F, 0.625F, 0.25F); // Import Box99
		revolverBarrelModel[24].setRotationPoint(22.5F, -34.5F, -7.5F);

		revolverBarrelModel[25].addShapeBox(0F, 0F, 0F, 36, 6, 1, 0F,0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -2.875F, 0F, 0F, -2.875F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box93
		revolverBarrelModel[25].setRotationPoint(22.5F, -38F, -9.25F);

		revolverBarrelModel[26].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F); // Import Box93
		revolverBarrelModel[26].setRotationPoint(22.5F, -32F, -7.25F);

		revolverBarrelModel[27].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F); // Import Box99
		revolverBarrelModel[27].setRotationPoint(22.5F, -34.5F, -3.5F);

		revolverBarrelModel[28].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 1.625F, 0.25F, 0F, 1.625F, 0.25F); // Import Box99
		revolverBarrelModel[28].setRotationPoint(22.5F, -35.5F, -2.5F);

		revolverBarrelModel[29].addShapeBox(0F, 0F, 0F, 36, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2.875F, 0F, 0F, -2.875F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F); // Import Box93
		revolverBarrelModel[29].setRotationPoint(22.5F, -35F, -1.25F);

		revolverBarrelModel[30].addShapeBox(0F, 0F, 0F, 36, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -2.875F, 0F, 0F, -2.875F, 0F); // Import Box93
		revolverBarrelModel[30].setRotationPoint(22.5F, -35F, 0.75F);

		revolverBarrelModel[31].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Import Box99
		revolverBarrelModel[31].setRotationPoint(22.5F, -35.5F, 3.5F);

		revolverBarrelModel[32].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F); // Import Box99
		revolverBarrelModel[32].setRotationPoint(22.5F, -34.5F, 4.5F);

		revolverBarrelModel[33].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 1.625F, 0.25F, 0F, 1.625F, 0.25F); // Import Box99
		revolverBarrelModel[33].setRotationPoint(22.5F, -34.5F, 5.5F);

		revolverBarrelModel[34].addShapeBox(0F, 0F, 0F, 36, 6, 1, 0F,0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box99
		revolverBarrelModel[34].setRotationPoint(22.5F, -35.5F, 8F);

		revolverBarrelModel[35].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.625F, 0.25F, 0F, 0.625F, 0.25F, 0F, 0.625F, -0.25F, 0F, 0.625F, -0.25F); // Import Box99
		revolverBarrelModel[35].setRotationPoint(22.5F, -34.5F, 7F);

		revolverBarrelModel[36].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Import Box93
		revolverBarrelModel[36].setRotationPoint(22.5F, -32F, 6.75F);

		revolverBarrelModel[37].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Import Box99
		revolverBarrelModel[37].setRotationPoint(22.5F, -34.5F, 3F);

		revolverBarrelModel[38].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 1.625F, 0.25F, 0F, 1.625F, 0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F); // Import Box99
		revolverBarrelModel[38].setRotationPoint(22.5F, -35.5F, 2F);

		revolverBarrelModel[39].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -2.875F, 0F, 0F, -2.875F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box93
		revolverBarrelModel[39].setRotationPoint(22.5F, -38F, 2.75F);

		revolverBarrelModel[40].addShapeBox(0F, 0F, 0F, 36, 1, 14, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box0
		revolverBarrelModel[40].setRotationPoint(22.5F, -46.5F, -6.75F);

		revolverBarrelModel[41].addShapeBox(0F, 0F, 0F, 36, 3, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box0
		revolverBarrelModel[41].setRotationPoint(22.5F, -45.5F, 3.75F);

		revolverBarrelModel[42].addShapeBox(0F, 0F, 0F, 36, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		revolverBarrelModel[42].setRotationPoint(22.5F, -42.5F, 8.75F);

		revolverBarrelModel[43].addShapeBox(0F, 0F, 0F, 36, 3, 7, 0F,0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box130
		revolverBarrelModel[43].setRotationPoint(22.5F, -45.5F, -10.25F);

		revolverBarrelModel[44].addShapeBox(0F, 0F, 0F, 36, 3, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		revolverBarrelModel[44].setRotationPoint(22.5F, -42.5F, -10.25F);

		revolverBarrelModel[45].addShapeBox(0F, 0F, 0F, 36, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Import Box0
		revolverBarrelModel[45].setRotationPoint(22.5F, -42.5F, 3.75F);

		revolverBarrelModel[46].addShapeBox(0F, 0F, 0F, 36, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		revolverBarrelModel[46].setRotationPoint(22.5F, -42.5F, -8.25F);

		revolverBarrelModel[47].addShapeBox(0F, 0F, 0F, 36, 3, 4, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box130
		revolverBarrelModel[47].setRotationPoint(22.5F, -29.5F, -10.25F);

		revolverBarrelModel[48].addShapeBox(0F, 0F, 0F, 36, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		revolverBarrelModel[48].setRotationPoint(22.5F, -32.5F, -10.25F);

		revolverBarrelModel[49].addShapeBox(0F, 0F, 0F, 36, 2, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.45F, 0F, -1.5F, -0.45F); // Import Box144
		revolverBarrelModel[49].setRotationPoint(22.5F, -27.5F, 3.75F);

		revolverBarrelModel[50].addShapeBox(0F, 0F, 0F, 36, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F); // Import Box145
		revolverBarrelModel[50].setRotationPoint(22.5F, -29.5F, 6.75F);

		revolverBarrelModel[51].addShapeBox(0F, 0F, 0F, 36, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Box146
		revolverBarrelModel[51].setRotationPoint(22.5F, -32.5F, 8.75F);

		revolverBarrelModel[52].addShapeBox(0F, 0F, 0F, 36, 7, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		revolverBarrelModel[52].setRotationPoint(22.5F, -39.5F, 9.75F);

		revolverBarrelModel[53].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F); // Import Box99
		revolverBarrelModel[53].setRotationPoint(22.5F, -45F, 2F);

		revolverBarrelModel[54].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box99
		revolverBarrelModel[54].setRotationPoint(22.5F, -45F, 1F);

		revolverBarrelModel[55].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F); // Import Box99
		revolverBarrelModel[55].setRotationPoint(22.5F, -45F, -2.5F);

		revolverBarrelModel[56].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Import Box99
		revolverBarrelModel[56].setRotationPoint(22.5F, -45F, -1.5F);

		revolverBarrelModel[57].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box99
		revolverBarrelModel[57].setRotationPoint(22.5F, -28.25F, -2F);

		revolverBarrelModel[58].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box99
		revolverBarrelModel[58].setRotationPoint(22.5F, -27.25F, -3F);

		revolverBarrelModel[59].addShapeBox(0F, 0F, 0F, 36, 10, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box99
		revolverBarrelModel[59].setRotationPoint(22.5F, -35.5F, -0.5F);

		revolverBarrelModel[60].addShapeBox(0F, 0F, 0F, 36, 5, 1, 0F,0F, -1.875F, 0F, 0F, -1.875F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box93
		revolverBarrelModel[60].setRotationPoint(22.5F, -30F, -1.25F);

		revolverBarrelModel[61].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F); // Import Box99
		revolverBarrelModel[61].setRotationPoint(22.5F, -40.25F, 8F);

		revolverBarrelModel[62].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box99
		revolverBarrelModel[62].setRotationPoint(22.5F, -40.25F, 7F);

		revolverBarrelModel[63].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F); // Import Box99
		revolverBarrelModel[63].setRotationPoint(22.5F, -40.25F, 3.5F);

		revolverBarrelModel[64].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F); // Import Box99
		revolverBarrelModel[64].setRotationPoint(22.5F, -40.25F, 4.5F);

		revolverBarrelModel[65].addShapeBox(0F, 0F, 0F, 36, 4, 1, 0F,0F, -1.65F, 0.25F, 0F, -1.65F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Import Box99
		revolverBarrelModel[65].setRotationPoint(22.5F, -36.75F, 9F);

		revolverBarrelModel[66].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -1.6F, 0.25F, 0F, -1.6F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Import Box99
		revolverBarrelModel[66].setRotationPoint(22.5F, -39.25F, 9F);

		revolverBarrelModel[67].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F); // Import Box99
		revolverBarrelModel[67].setRotationPoint(22.5F, -45F, -3.5F);

		revolverBarrelModel[68].addShapeBox(0F, 0F, 0F, 36, 6, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Import Box0
		revolverBarrelModel[68].setRotationPoint(22.5F, -45.25F, -3.25F);

		revolverBarrelModel[69].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Import Box99
		revolverBarrelModel[69].setRotationPoint(22.5F, -45F, 3F);

		revolverBarrelModel[70].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Import Box0
		revolverBarrelModel[70].setRotationPoint(22.5F, -30.75F, 7.5F);

		revolverBarrelModel[71].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Import Box0
		revolverBarrelModel[71].setRotationPoint(22.5F, -30.75F, -7.25F);

		revolverBarrelModel[72].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.6F, 0.725F, 0F, 0.6F, 0.725F, 0F, 0.6F, -1.3F, 0F, 0.6F, -1.3F); // Import Box0
		revolverBarrelModel[72].setRotationPoint(22.5F, -29.75F, 7.5F);

		revolverBarrelModel[73].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.6F, -0.275F, 0F, -0.6F, -0.275F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, -0.65F, 0F, 0.5F, -0.65F); // Import Box0
		revolverBarrelModel[73].setRotationPoint(22.5F, -28.75F, 6.5F);

		revolverBarrelModel[74].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.6F, -1.3F, 0F, 0.6F, -1.3F, 0F, 0.6F, 0.725F, 0F, 0.6F, 0.725F); // Import Box177
		revolverBarrelModel[74].setRotationPoint(22.5F, -29.75F, -8F);

		revolverBarrelModel[75].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.275F, 0F, -0.6F, -0.275F, 0F, 0.5F, -0.65F, 0F, 0.5F, -0.65F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F); // Import Box178
		revolverBarrelModel[75].setRotationPoint(22.5F, -28.75F, -7F);

		revolverBarrelModel[76].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -1.25F, -0.65F, 0F, -1.25F, -0.65F, 0F, -1.25F, 0.75F, 0F, -1.25F, 0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F); // Import Box178
		revolverBarrelModel[76].setRotationPoint(22.5F, -28.5F, -7F);

		revolverBarrelModel[77].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -1.25F, 0.75F, 0F, -1.25F, 0.75F, 0F, -1.25F, -0.65F, 0F, -1.25F, -0.65F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F); // Import Box182
		revolverBarrelModel[77].setRotationPoint(22.5F, -28.5F, 6.5F);

		revolverBarrelModel[78].addShapeBox(0F, 0F, 0F, 36, 5, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.875F, 0F, 0F, -1.875F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1
		revolverBarrelModel[78].setRotationPoint(22.5F, -30F, 0.75F);

		revolverBarrelModel[79].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 2
		revolverBarrelModel[79].setRotationPoint(22.5F, -28.25F, 1.5F);

		revolverBarrelModel[80].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 3
		revolverBarrelModel[80].setRotationPoint(22.5F, -27.25F, 2.5F);

		revolverBarrelModel[81].addShapeBox(0F, 0F, 0F, 36, 2, 4, 0F,0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.5F, -0.45F, 0F, -1.5F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		revolverBarrelModel[81].setRotationPoint(22.5F, -27.5F, -7.25F);
	}

	private void inithammerModel_1()
	{
		hammerModel[0] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Import Box345
		hammerModel[1] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Import Box345
		hammerModel[2] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Import Box345
		hammerModel[3] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Import Box345
		hammerModel[4] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Import Box345
		hammerModel[5] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Import Box345
		hammerModel[6] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Import Box345
		hammerModel[7] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Import Box345
		hammerModel[8] = new ModelRendererTurbo(this, 297, 193, textureX, textureY); // Import Box345
		hammerModel[9] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Import Box345
		hammerModel[10] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Import Box345
		hammerModel[11] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import Box345
		hammerModel[12] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import Box345
		hammerModel[13] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Import Box345
		hammerModel[14] = new ModelRendererTurbo(this, 185, 273, textureX, textureY); // Box 0

		hammerModel[0].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box345
		hammerModel[0].setRotationPoint(12.5F, -46F, -2F);

		hammerModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box345
		hammerModel[1].setRotationPoint(11.5F, -43.5F, -2F);

		hammerModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,-1.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box345
		hammerModel[2].setRotationPoint(12.5F, -47F, -2F);

		hammerModel[3].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box345
		hammerModel[3].setRotationPoint(9.5F, -41.5F, -2F);

		hammerModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-1.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Import Box345
		hammerModel[4].setRotationPoint(10.5F, -42F, -2F);

		hammerModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F); // Import Box345
		hammerModel[5].setRotationPoint(9.5F, -37.5F, -2F);

		hammerModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F); // Import Box345
		hammerModel[6].setRotationPoint(9.5F, -36.5F, -2F);

		hammerModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Import Box345
		hammerModel[7].setRotationPoint(7.5F, -35.5F, -2F);

		hammerModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2.25F, 0.5F, 0F); // Import Box345
		hammerModel[8].setRotationPoint(6.5F, -34.5F, -2F);

		hammerModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F); // Import Box345
		hammerModel[9].setRotationPoint(6.5F, -33F, -2F);

		hammerModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.25F, -0.5F, 0F, 0F, -1.49F, 0F, 0F, -1.49F, 0F, -0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import Box345
		hammerModel[10].setRotationPoint(9F, -42.5F, -2F);

		hammerModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -1.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -1.75F, 0F); // Import Box345
		hammerModel[11].setRotationPoint(8.5F, -41.5F, -2F);

		hammerModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.75F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.75F, 0.5F, 1F, -1F, 0.5F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, -1F, 0.5F); // Import Box345
		hammerModel[12].setRotationPoint(8F, -42F, -2F);

		hammerModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.625F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F); // Import Box345
		hammerModel[13].setRotationPoint(4.5F, -43.75F, -2.5F);

		hammerModel[14].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,-1.5F, -0.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -1.5F, -0.5F, 0F, 0F, -1.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.75F, 0F); // Box 0
		hammerModel[14].setRotationPoint(4.5F, -44F, -2.5F);
	}
	
}