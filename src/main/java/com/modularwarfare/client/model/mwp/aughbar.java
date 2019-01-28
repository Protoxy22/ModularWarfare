//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: aughbar
// Model Creator: 
// Created on: 24.01.2019 - 23:01:12
// Last changed on: 24.01.2019 - 23:01:12

package com.modularwarfare.client.model.mwp; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

import com.modularwarfare.api.WeaponAnimations;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class aughbar extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public aughbar() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[441];
		defaultBarrelModel = new ModelRendererTurbo[9];
		defaultScopeModel = new ModelRendererTurbo[106];
		ammoModel = new ModelRendererTurbo[85];
		slideModel = new ModelRendererTurbo[10];

		initgunModel_1();
		initdefaultBarrelModel_1();
		initdefaultScopeModel_1();
		initammoModel_1();
		initslideModel_1();

		modelScale = 0.12F;
//		barrelAttachPoint = new Vector3f(105F /16F, 33F /16F, 0F /16F);
//		scopeAttachPoint = new Vector3f(8F /16F, 44.5F /16F, 0F /16F);
//		gripAttachPoint = new Vector3f(58F /16F, 25F /16F, 0F /16F);

		translateAll(-.5F, -7F, -0.1F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.1F, -0.0F);//forward/up/?

		gunSlideDistance = 1F;
		altgunSlideDistance = 0F;
		reloadAnimation = WeaponAnimations.RIFLE3;

		rotateGunVertical = 35F;
		rotateGunHorizontal = -15F;
		tiltGun = 15F;
		/*tiltGunTime = 0.15F;
		unloadClipTime = 0.35F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.15F;*/
		translateGun = new Vector3f(9 /16F, 2F /16F, 0.5F /16F);
		rotateClipVertical = -90F;
		rotateClipHorizontal = -20F;
		tiltClip = 20F;

		translateClip = new Vector3f(0 /16F, -25F /16F, 0F /16F);

		hasFlash = false;

		leftArmPos = new Vector3f(-0.27F, -0.20F, -0.20F);
		leftArmRot = new Vector3f(70.0F, 45.0F, 0.0F);
		leftArmReloadPos = new Vector3f(-0.95F, -0.20F, 0.02F);
		leftArmReloadRot = new Vector3f(80.0F, 60.0F, 0.0F);
		leftArmChargePos = new Vector3f(0.20F, 0.50F, 0.15F);
		leftArmChargeRot = new Vector3f(50.0F, 55.0F, -0.0F);

		rightArmPos = new Vector3f(-0.53F, -0.28F, 0.33F);
		rightArmRot = new Vector3f(-30.0F, 0.0F, -90.0F);
		rightArmReloadPos = new Vector3f(-0.59F, -0.3F, 0.36F);
		rightArmReloadRot = new Vector3f(-30.0F, 0.0F, -90.0F);

		rightArmScale = new Vector3f(0.8F, 1.0F, 0.8F);
		leftArmScale = new Vector3f(0.8F, 1.0F, 0.8F);

		leftHandAmmo = true;

		//RecoilSlideDistance = 0.05F;
		//RotateSlideDistance = -0.05F;

		crouchZoom = -0.10F;
		fancyStance = true;
		sprintRotate = new Vector3f(-10.0F, 60.0F, 10.0F);
		sprintTranslate = new Vector3f(1.9F, -0.2F, -0.9F);

		chargeHandleDistance = 1.6F;
		chargeDelay = 0;
		chargeDelayAfterReload = 85;
		chargeTime = 10;
		leftHandCharge = true;
		chargeModifier = new Vector3f (8.0F, 8.0F, 20.0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[8] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[9] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[10] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[11] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[12] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[13] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[14] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[15] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[16] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[17] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[18] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[19] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[20] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[21] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[22] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[23] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[24] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[25] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[26] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[27] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[28] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[29] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[30] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[31] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[32] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[33] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[34] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[35] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[36] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[37] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[38] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Import ImportImportBox0
		gunModel[39] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Import ImportImportBox0
		gunModel[40] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Import ImportImportBox0
		gunModel[41] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[42] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Import ImportImportBox0
		gunModel[43] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[44] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[45] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[46] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[47] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[48] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[49] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[50] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[51] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[52] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[53] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[54] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[55] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[56] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[57] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[58] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[59] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[60] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[61] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[62] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[63] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[64] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[65] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[66] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[67] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[68] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[69] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[70] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[71] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[72] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[73] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[74] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[75] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[76] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[77] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[78] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[79] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[80] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[81] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[82] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[83] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[84] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[85] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[86] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Import ImportImportBox0
		gunModel[87] = new ModelRendererTurbo(this, 577, 41, textureX, textureY); // Import ImportImportBox0
		gunModel[88] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[89] = new ModelRendererTurbo(this, 737, 41, textureX, textureY); // Import ImportImportBox0
		gunModel[90] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[91] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Import ImportImportBox0
		gunModel[92] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Import ImportImportBox0
		gunModel[93] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Import ImportImportBox0
		gunModel[94] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Import ImportImportBox0
		gunModel[95] = new ModelRendererTurbo(this, 881, 41, textureX, textureY); // Import ImportImportBox0
		gunModel[96] = new ModelRendererTurbo(this, 905, 41, textureX, textureY); // Import ImportImportBox0
		gunModel[97] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Import ImportImportBox0
		gunModel[98] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[99] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[100] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[101] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[102] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[103] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Import ImportImportBox104
		gunModel[104] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[105] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[106] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[107] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[108] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[109] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Import ImportImportBox0
		gunModel[110] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[111] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[112] = new ModelRendererTurbo(this, 673, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[113] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[114] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[115] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Import ImportImportBox0
		gunModel[116] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Import ImportImportBox0
		gunModel[117] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Import ImportImportBox0
		gunModel[118] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Import ImportImportBox0
		gunModel[119] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Import ImportImportBox0
		gunModel[120] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[121] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[122] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[123] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[124] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[125] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[126] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Import ImportImportBox0
		gunModel[127] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[128] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[129] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[130] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[131] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[132] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[133] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[134] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[135] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[136] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[137] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[138] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[139] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[140] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[141] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[142] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[143] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Import ImportImportBox0
		gunModel[144] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[145] = new ModelRendererTurbo(this, 545, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[146] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Import ImportImportBox0
		gunModel[147] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[148] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[149] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[150] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[151] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[152] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[153] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[154] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[155] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[156] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[157] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[158] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[159] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[160] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[161] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[162] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[163] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[164] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[165] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[166] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[167] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[168] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[169] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[170] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[171] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[172] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[173] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[174] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[175] = new ModelRendererTurbo(this, 713, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[176] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[177] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[178] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[179] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[180] = new ModelRendererTurbo(this, 697, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[181] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[182] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[183] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[184] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[185] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[186] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[187] = new ModelRendererTurbo(this, 577, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[188] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[189] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[190] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[191] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Import ImportImportBox0
		gunModel[192] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[193] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Import ImportImportBox0
		gunModel[194] = new ModelRendererTurbo(this, 785, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[195] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Import ImportImportBox0
		gunModel[196] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Import ImportImportBox0
		gunModel[197] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[198] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Import ImportImportBox0
		gunModel[199] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Import ImportImportBox0
		gunModel[200] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Import ImportImportBox0
		gunModel[201] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[202] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[203] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[204] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[205] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Import ImportImportBox0
		gunModel[206] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Import ImportImportBox0
		gunModel[207] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[208] = new ModelRendererTurbo(this, 969, 89, textureX, textureY); // Import ImportImportBox0
		gunModel[209] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Import ImportImportBox0
		gunModel[210] = new ModelRendererTurbo(this, 809, 89, textureX, textureY); // Import ImportImportBox0
		gunModel[211] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Import ImportImportBox0
		gunModel[212] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Import ImportImportBox0
		gunModel[213] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Import ImportImportBox0
		gunModel[214] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[215] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[216] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[217] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[218] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[219] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[220] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[221] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[222] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[223] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[224] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[225] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[226] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Import ImportImportBox0
		gunModel[227] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[228] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[229] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[230] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY); // Import ImportImportBox0
		gunModel[231] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[232] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Import ImportImportBox0
		gunModel[233] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[234] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[235] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[236] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[237] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[238] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Import ImportImportBox0
		gunModel[239] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[240] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Import ImportImportBox0
		gunModel[241] = new ModelRendererTurbo(this, 881, 97, textureX, textureY); // Import ImportImportBox0
		gunModel[242] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Import ImportImportBox0
		gunModel[243] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[244] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[245] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[246] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[247] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[248] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[249] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[250] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[251] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[252] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Import ImportImportBox0
		gunModel[253] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[254] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[255] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Import ImportImportBox0
		gunModel[256] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[257] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[258] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[259] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[260] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[261] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[262] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[263] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[264] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Import ImportImportBox0
		gunModel[265] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import ImportImportBox0
		gunModel[266] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Import ImportImportBox0
		gunModel[267] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[268] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[269] = new ModelRendererTurbo(this, 625, 97, textureX, textureY); // Import ImportImportBox0
		gunModel[270] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[271] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Import ImportImportBox0
		gunModel[272] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Import ImportImportBox0
		gunModel[273] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[274] = new ModelRendererTurbo(this, 873, 41, textureX, textureY); // Import ImportImportBox0
		gunModel[275] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[276] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[277] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[278] = new ModelRendererTurbo(this, 897, 41, textureX, textureY); // Import ImportImportBox0
		gunModel[279] = new ModelRendererTurbo(this, 569, 97, textureX, textureY); // Import ImportImportBox0
		gunModel[280] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import ImportImportBox0
		gunModel[281] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Import ImportImportBox0
		gunModel[282] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Import ImportImportBox0
		gunModel[283] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Import ImportImportBox0
		gunModel[284] = new ModelRendererTurbo(this, 833, 97, textureX, textureY); // Import ImportImportBox0
		gunModel[285] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Import ImportImportBox0
		gunModel[286] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[287] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[288] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); // Import ImportImportBox0
		gunModel[289] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Import ImportImportBox0
		gunModel[290] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Import ImportImportBox0
		gunModel[291] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Import ImportImportBox0
		gunModel[292] = new ModelRendererTurbo(this, 945, 41, textureX, textureY); // Import ImportImportBox0
		gunModel[293] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Import ImportImportBox0
		gunModel[294] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Import ImportImportBox0
		gunModel[295] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Import ImportImportBox0
		gunModel[296] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Import ImportImportBox0
		gunModel[297] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[298] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Import ImportImportBox0
		gunModel[299] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Import ImportImportBox0
		gunModel[300] = new ModelRendererTurbo(this, 585, 25, textureX, textureY); // Import ImportImportBox0
		gunModel[301] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[302] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Import ImportImportBox0
		gunModel[303] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[304] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Import ImportImportBox0
		gunModel[305] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import ImportImportBox0
		gunModel[306] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Import ImportImportBox0
		gunModel[307] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Import ImportImportBox0
		gunModel[308] = new ModelRendererTurbo(this, 609, 25, textureX, textureY); // Import ImportImportBox0
		gunModel[309] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[310] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Import ImportImportBox0
		gunModel[311] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[312] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[313] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[314] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[315] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[316] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Import ImportImportBox0
		gunModel[317] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Import ImportImportBox0
		gunModel[318] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Import ImportImportBox0
		gunModel[319] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Import ImportImportBox0
		gunModel[320] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Import ImportImportBox0
		gunModel[321] = new ModelRendererTurbo(this, 529, 105, textureX, textureY); // Import ImportImportBox0
		gunModel[322] = new ModelRendererTurbo(this, 969, 105, textureX, textureY); // Import ImportImportBox0
		gunModel[323] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[324] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[325] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[326] = new ModelRendererTurbo(this, 577, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[327] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Import ImportImportBox0
		gunModel[328] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[329] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[330] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Import ImportImportBox0
		gunModel[331] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[332] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[333] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[334] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[335] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[336] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[337] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[338] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import ImportImportBox0
		gunModel[339] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[340] = new ModelRendererTurbo(this, 553, 113, textureX, textureY); // Import ImportImportBox0
		gunModel[341] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Import ImportImportBox0
		gunModel[342] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Import ImportImportBox0
		gunModel[343] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Import ImportImportBox0
		gunModel[344] = new ModelRendererTurbo(this, 913, 121, textureX, textureY); // Import ImportImportBox0
		gunModel[345] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Import ImportImportBox0
		gunModel[346] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[347] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[348] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Import ImportImportBox0
		gunModel[349] = new ModelRendererTurbo(this, 857, 113, textureX, textureY); // Import ImportImportBox0
		gunModel[350] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Import ImportImportBox0
		gunModel[351] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box581
		gunModel[352] = new ModelRendererTurbo(this, 633, 145, textureX, textureY); // Import Box582
		gunModel[353] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Import Box583
		gunModel[354] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Import Box580
		gunModel[355] = new ModelRendererTurbo(this, 665, 89, textureX, textureY); // Import Box581
		gunModel[356] = new ModelRendererTurbo(this, 689, 89, textureX, textureY); // Import Box582
		gunModel[357] = new ModelRendererTurbo(this, 665, 89, textureX, textureY); // Import Box583
		gunModel[358] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Import Box584
		gunModel[359] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Import Box586
		gunModel[360] = new ModelRendererTurbo(this, 665, 89, textureX, textureY); // Import Box587
		gunModel[361] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Import Box588
		gunModel[362] = new ModelRendererTurbo(this, 705, 89, textureX, textureY); // Import Box589
		gunModel[363] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Import Box590
		gunModel[364] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box591
		gunModel[365] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box592
		gunModel[366] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Import Box593
		gunModel[367] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box594
		gunModel[368] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Import Box595
		gunModel[369] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Import Box596
		gunModel[370] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Import Box597
		gunModel[371] = new ModelRendererTurbo(this, 825, 145, textureX, textureY); // Import Box607
		gunModel[372] = new ModelRendererTurbo(this, 857, 145, textureX, textureY); // Import Box609
		gunModel[373] = new ModelRendererTurbo(this, 889, 145, textureX, textureY); // Import Box610
		gunModel[374] = new ModelRendererTurbo(this, 921, 145, textureX, textureY); // Import Box611
		gunModel[375] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Import Box612
		gunModel[376] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Import Box613
		gunModel[377] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Import Box0
		gunModel[378] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import Box1
		gunModel[379] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Import Box2
		gunModel[380] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Import Box3
		gunModel[381] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Import Box4
		gunModel[382] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Import Box5
		gunModel[383] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Import Box6
		gunModel[384] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Import Box7
		gunModel[385] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Import Box622
		gunModel[386] = new ModelRendererTurbo(this, 921, 153, textureX, textureY); // Import Box623
		gunModel[387] = new ModelRendererTurbo(this, 945, 153, textureX, textureY); // Import Box624
		gunModel[388] = new ModelRendererTurbo(this, 961, 153, textureX, textureY); // Import Box625
		gunModel[389] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Import Box626
		gunModel[390] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Import Box627
		gunModel[391] = new ModelRendererTurbo(this, 625, 145, textureX, textureY); // Import Box628
		gunModel[392] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Import Box629
		gunModel[393] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Import Box630
		gunModel[394] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Import Box631
		gunModel[395] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Import Box632
		gunModel[396] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Import Box633
		gunModel[397] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Import Box634
		gunModel[398] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Import Box635
		gunModel[399] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Import Box636
		gunModel[400] = new ModelRendererTurbo(this, 537, 161, textureX, textureY); // Import Box637
		gunModel[401] = new ModelRendererTurbo(this, 553, 161, textureX, textureY); // Import Box638
		gunModel[402] = new ModelRendererTurbo(this, 569, 161, textureX, textureY); // Import Box639
		gunModel[403] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Import Box640
		gunModel[404] = new ModelRendererTurbo(this, 601, 161, textureX, textureY); // Import Box641
		gunModel[405] = new ModelRendererTurbo(this, 617, 161, textureX, textureY); // Import Box642
		gunModel[406] = new ModelRendererTurbo(this, 633, 161, textureX, textureY); // Import Box643
		gunModel[407] = new ModelRendererTurbo(this, 649, 161, textureX, textureY); // Import Box644
		gunModel[408] = new ModelRendererTurbo(this, 665, 161, textureX, textureY); // Import Box668
		gunModel[409] = new ModelRendererTurbo(this, 697, 161, textureX, textureY); // Import Box669
		gunModel[410] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box670
		gunModel[411] = new ModelRendererTurbo(this, 689, 161, textureX, textureY); // Import Box671
		gunModel[412] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box672
		gunModel[413] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Import Box673
		gunModel[414] = new ModelRendererTurbo(this, 737, 161, textureX, textureY); // Import Box674
		gunModel[415] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box675
		gunModel[416] = new ModelRendererTurbo(this, 729, 161, textureX, textureY); // Import Box676
		gunModel[417] = new ModelRendererTurbo(this, 777, 161, textureX, textureY); // Import Box677
		gunModel[418] = new ModelRendererTurbo(this, 769, 161, textureX, textureY); // Import Box678
		gunModel[419] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Import Box679
		gunModel[420] = new ModelRendererTurbo(this, 897, 137, textureX, textureY); // Import ImportImportBox0
		gunModel[421] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Box 0
		gunModel[422] = new ModelRendererTurbo(this, 633, 121, textureX, textureY); // Box 1
		gunModel[423] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 2
		gunModel[424] = new ModelRendererTurbo(this, 657, 121, textureX, textureY); // Box 3
		gunModel[425] = new ModelRendererTurbo(this, 673, 121, textureX, textureY); // Box 4
		gunModel[426] = new ModelRendererTurbo(this, 681, 121, textureX, textureY); // Box 5
		gunModel[427] = new ModelRendererTurbo(this, 697, 121, textureX, textureY); // Box 6
		gunModel[428] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Box 7
		gunModel[429] = new ModelRendererTurbo(this, 721, 121, textureX, textureY); // Box 8
		gunModel[430] = new ModelRendererTurbo(this, 809, 121, textureX, textureY); // Box 9
		gunModel[431] = new ModelRendererTurbo(this, 825, 121, textureX, textureY); // Box 10
		gunModel[432] = new ModelRendererTurbo(this, 833, 121, textureX, textureY); // Box 11
		gunModel[433] = new ModelRendererTurbo(this, 849, 121, textureX, textureY); // Box 12
		gunModel[434] = new ModelRendererTurbo(this, 857, 121, textureX, textureY); // Box 13
		gunModel[435] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 14
		gunModel[436] = new ModelRendererTurbo(this, 881, 121, textureX, textureY); // Box 15
		gunModel[437] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 16
		gunModel[438] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 17
		gunModel[439] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 18
		gunModel[440] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 19

		gunModel[0].addShapeBox(11F, 10F, -5F, 17, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[0].setRotationPoint(-24F, 2F, 0F);

		gunModel[1].addShapeBox(11F, 10F, -5F, 17, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[1].setRotationPoint(-24F, 1F, 0F);

		gunModel[2].addShapeBox(11F, 10F, -5F, 5, 1, 10, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[2].setRotationPoint(-11F, 0F, 0F);

		gunModel[3].addShapeBox(11F, 10F, -5F, 2, 1, 10, 0F,0F, 1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportImportBox0
		gunModel[3].setRotationPoint(-13F, 0F, 0F);

		gunModel[4].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, 1.25F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F); // Import ImportImportBox0
		gunModel[4].setRotationPoint(-14F, -1F, 0F);

		gunModel[5].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, 0.25F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.25F, 0F); // Import ImportImportBox0
		gunModel[5].setRotationPoint(-14F, -2F, 0F);

		gunModel[6].addShapeBox(11F, 10F, -5F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.25F, 0F); // Import ImportImportBox0
		gunModel[6].setRotationPoint(-14F, -4F, 0F);

		gunModel[7].addShapeBox(11F, 10F, -5F, 1, 1, 7, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[7].setRotationPoint(-13F, -2F, 1.5F);

		gunModel[8].addShapeBox(11F, 10F, -5F, 1, 13, 10, 0F,-6F, 0F, 0F, 6F, 0F, -1.5F, 6F, 0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[8].setRotationPoint(-14F, -17F, 0F);

		gunModel[9].addShapeBox(11F, 10F, -5F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[9].setRotationPoint(-13F, 0F, 0F);

		gunModel[10].addShapeBox(11F, 10F, -5F, 1, 2, 10, 0F,0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[10].setRotationPoint(-14F, -1F, 0F);

		gunModel[11].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,-1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[11].setRotationPoint(-8F, -18F, 0F);

		gunModel[12].addShapeBox(11F, 10F, -5F, 3, 1, 10, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[12].setRotationPoint(-7F, -19F, 0F);

		gunModel[13].addShapeBox(11F, 10F, -5F, 1, 1, 7, 0F,-1F, 0F, 1F, 0.75F, 0F, 0.6F, 0.75F, 0F, 0.6F, -1F, 0F, 1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F); // Import ImportImportBox0
		gunModel[13].setRotationPoint(-7F, -18F, 1.5F);

		gunModel[14].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[14].setRotationPoint(-4F, -19F, 0F);

		gunModel[15].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[15].setRotationPoint(-4F, -20F, 0F);

		gunModel[16].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[16].setRotationPoint(-4F, -21F, 0F);

		gunModel[17].addShapeBox(11F, 10F, -5F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[17].setRotationPoint(-4.5F, -24F, 0F);

		gunModel[18].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[18].setRotationPoint(-4.5F, -25F, 0F);

		gunModel[19].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,-1.25F, 0F, 0F, 1.25F, 0F, -1.5F, 1.25F, 0F, -1.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[19].setRotationPoint(-4F, -26F, 0F);

		gunModel[20].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,-1.25F, -0.5F, 0F, 2F, -0.5F, -1.5F, 2F, -0.5F, -1.5F, -1.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[20].setRotationPoint(-2.75F, -27F, 0F);

		gunModel[21].addShapeBox(11F, 10F, -5F, 2, 1, 10, 0F,0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[21].setRotationPoint(-6F, 0F, 0F);

		gunModel[22].addShapeBox(11F, 10F, -5F, 2, 1, 10, 0F,0F, 0F, -1.5F, 0F, 2.5F, -1.5F, 0F, 2.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[22].setRotationPoint(-4F, -0.5F, 0F);

		gunModel[23].addShapeBox(11F, 10F, -5F, 13, 1, 10, 0F,0F, 0.5F, -1.5F, 0F, 18F, -1.5F, 0F, 18F, -1.5F, 0F, 0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[23].setRotationPoint(-2F, -2.5F, 0F);

		gunModel[24].addShapeBox(11F, 10F, -5F, 1, 2, 10, 0F,0F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[24].setRotationPoint(11.25F, -23F, 0F);

		gunModel[25].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,-0.25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.5F, 0F, -0.5F, -1.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, -1.5F); // Import ImportImportBox0
		gunModel[25].setRotationPoint(11F, -21F, 0F);

		gunModel[26].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[26].setRotationPoint(11F, -20.5F, 0F);

		gunModel[27].addShapeBox(11F, 10F, -5F, 1, 2, 10, 0F,0.75F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[27].setRotationPoint(11.25F, -25F, 0F);

		gunModel[28].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,1.75F, 0.5F, -1.5F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1.75F, 0.5F, -1.5F, 0F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[28].setRotationPoint(10.5F, -26F, 0F);

		gunModel[29].addShapeBox(11F, 10F, -5F, 8, 1, 10, 0F,-2F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[29].setRotationPoint(0.25F, -27.5F, 0F);

		gunModel[30].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,-1.5F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0.75F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0.75F, 0F, 0F); // Import ImportImportBox0
		gunModel[30].setRotationPoint(-0.75F, -27.5F, 0F);

		gunModel[31].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,-0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[31].setRotationPoint(8.5F, -27.5F, 0F);

		gunModel[32].addShapeBox(11F, 10F, -5F, 1, 1, 7, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.85F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.85F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[32].setRotationPoint(8.5F, -26.5F, 1.5F);

		gunModel[33].addShapeBox(11F, 10F, -5F, 13, 1, 10, 0F,0F, 0.5F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -18F, -1.5F, 0F, -18F, -1.5F, 0F, -0.5F, -1.5F); // Import ImportImportBox0
		gunModel[33].setRotationPoint(-0.5F, -1F, 0F);

		gunModel[34].addShapeBox(11F, 10F, -5F, 1, 17, 10, 0F,-12.65F, 0F, 0F, 13.5F, 0F, 0F, 13.5F, 0F, 0F, -12.65F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[34].setRotationPoint(-2F, -19F, 0F);

		gunModel[35].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[35].setRotationPoint(12.5F, -19F, 0F);

		gunModel[36].addShapeBox(11F, 10F, -5F, 1, 5, 10, 0F,-5F, 0.5F, 0F, 4.75F, 0.5F, -1.5F, 4.75F, 0.5F, -1.5F, -5F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[36].setRotationPoint(12.5F, -24F, 0F);

		gunModel[37].addShapeBox(11F, 10F, -5F, 2, 1, 10, 0F,-0.75F, 0F, 0F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[37].setRotationPoint(11F, -20.5F, 0F);

		gunModel[38].addShapeBox(11F, 10F, -5F, 2, 1, 10, 0F,-1F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, -1F, 0F, 0F, -0.65F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.65F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[38].setRotationPoint(10F, -19.5F, 0F);

		gunModel[39].addShapeBox(11F, 10F, -5F, 2, 2, 10, 0F,0.25F, 0F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[39].setRotationPoint(12.25F, -23F, 0F);

		gunModel[40].addShapeBox(11F, 10F, -5F, 2, 1, 10, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[40].setRotationPoint(12F, -21F, 0F);

		gunModel[41].addShapeBox(11F, 10F, -5F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[41].setRotationPoint(-7F, 2F, 0F);

		gunModel[42].addShapeBox(11F, 10F, -5F, 2, 1, 10, 0F,0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0.25F, -1.5F); // Import ImportImportBox0
		gunModel[42].setRotationPoint(-4F, 1F, 0F);

		gunModel[43].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, -1.5F, -1.5F, 0.5F, -1.5F, -1.5F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[43].setRotationPoint(-2F, 0F, 0F);

		gunModel[44].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[44].setRotationPoint(-7F, 1F, 0F);

		gunModel[45].addShapeBox(11F, 10F, -5F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Import ImportImportBox0
		gunModel[45].setRotationPoint(-6F, 1F, 0F);

		gunModel[46].addShapeBox(11F, 10F, -5F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F); // Import ImportImportBox0
		gunModel[46].setRotationPoint(-4F, 0.5F, 0F);

		gunModel[47].addShapeBox(11F, 10F, -5F, 2, 1, 10, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F); // Import ImportImportBox0
		gunModel[47].setRotationPoint(-2.5F, -1.5F, 0F);

		gunModel[48].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,-0.5F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.1F, -1.49F, 0F, -0.1F, -1.49F, 0F, -0.5F, -1F, 0F); // Import ImportImportBox0
		gunModel[48].setRotationPoint(-1F, -1.5F, 0F);

		gunModel[49].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, -1F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, -2F); // Import ImportImportBox0
		gunModel[49].setRotationPoint(-25F, 2F, 0F);

		gunModel[50].addShapeBox(11F, 10F, -5F, 1, 5, 10, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F); // Import ImportImportBox0
		gunModel[50].setRotationPoint(-25F, -3F, 0F);

		gunModel[51].addShapeBox(11F, 10F, -5F, 1, 5, 10, 0F,-1F, 0F, -1.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[51].setRotationPoint(-25F, -8F, 0F);

		gunModel[52].addShapeBox(11F, 10F, -5F, 1, 5, 10, 0F,-2F, 0F, -1.5F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[52].setRotationPoint(-24F, -13F, 0F);

		gunModel[53].addShapeBox(11F, 10F, -5F, 1, 3, 10, 0F,-2F, 0F, -1.5F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[53].setRotationPoint(-22F, -16F, 0F);

		gunModel[54].addShapeBox(11F, 10F, -5F, 1, 4, 10, 0F,-3.5F, 0F, -1.5F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[54].setRotationPoint(-20F, -20F, 0F);

		gunModel[55].addShapeBox(11F, 10F, -5F, 1, 3, 10, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[55].setRotationPoint(-16.5F, -23F, 0F);

		gunModel[56].addShapeBox(11F, 10F, -5F, 1, 2, 10, 0F,1.5F, 0F, -1.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[56].setRotationPoint(-16.5F, -25F, 0F);

		gunModel[57].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,2F, 0F, -1.5F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1.5F, 0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[57].setRotationPoint(-17.5F, -26F, 0F);

		gunModel[58].addShapeBox(11F, 10F, -5F, 11, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[58].setRotationPoint(-15.5F, -23F, 0F);

		gunModel[59].addShapeBox(11F, 10F, -5F, 5, 4, 10, 0F,-3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[59].setRotationPoint(-19F, -20F, 0F);

		gunModel[60].addShapeBox(11F, 10F, -5F, 10, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[60].setRotationPoint(-24F, -3F, 0F);

		gunModel[61].addShapeBox(11F, 10F, -5F, 10, 5, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[61].setRotationPoint(-24F, -8F, 0F);

		gunModel[62].addShapeBox(11F, 10F, -5F, 9, 5, 10, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[62].setRotationPoint(-23F, -13F, 0F);

		gunModel[63].addShapeBox(11F, 10F, -5F, 7, 3, 10, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[63].setRotationPoint(-21F, -16F, 0F);

		gunModel[64].addShapeBox(11F, 10F, -5F, 6, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[64].setRotationPoint(-14F, -17F, 0F);

		gunModel[65].addShapeBox(11F, 10F, -5F, 6, 1, 10, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[65].setRotationPoint(-14F, -18F, 0F);

		gunModel[66].addShapeBox(11F, 10F, -5F, 9, 1, 10, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[66].setRotationPoint(-14F, -19F, 0F);

		gunModel[67].addShapeBox(11F, 10F, -5F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[67].setRotationPoint(-14F, -20F, 0F);

		gunModel[68].addShapeBox(11F, 10F, -5F, 11, 1, 10, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[68].setRotationPoint(-15F, -21F, 0F);

		gunModel[69].addShapeBox(11F, 10F, -5F, 66, 4, 10, 0F,0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[69].setRotationPoint(-34.5F, -31F, 0F);

		gunModel[70].addShapeBox(11F, 10F, -5F, 1, 7, 12, 0F,0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Import ImportImportBox0
		gunModel[70].setRotationPoint(-63.5F, -40F, -1F);

		gunModel[71].addShapeBox(11F, 10F, -5F, 63, 4, 10, 0F,0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[71].setRotationPoint(-102.5F, -31F, 0F);

		gunModel[72].addShapeBox(11F, 10F, -5F, 63, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[72].setRotationPoint(-102.5F, -33F, -2.5F);

		gunModel[73].addShapeBox(11F, 10F, -5F, 95, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[73].setRotationPoint(-99.5F, -41.5F, 2F);

		gunModel[74].addShapeBox(11F, 10F, -5F, 11, 2, 10, 0F,1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[74].setRotationPoint(-15.5F, -25F, 0F);

		gunModel[75].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportBox0
		gunModel[75].setRotationPoint(-5.5F, -25F, 0F);

		gunModel[76].addShapeBox(11F, 10F, -5F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[76].setRotationPoint(-3.5F, -24F, 2.5F);

		gunModel[77].addShapeBox(11F, 10F, -5F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[77].setRotationPoint(-3.5F, -22F, 2.5F);

		gunModel[78].addShapeBox(11F, 10F, -5F, 3, 1, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[78].setRotationPoint(-3.5F, -21F, 2.5F);

		gunModel[79].addShapeBox(11F, 10F, -5F, 3, 2, 5, 0F,0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[79].setRotationPoint(-3.5F, -26F, 2.5F);

		gunModel[80].addShapeBox(11F, 10F, -5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[80].setRotationPoint(-0.5F, -24F, 2.5F);

		gunModel[81].addShapeBox(11F, 10F, -5F, 1, 3, 5, 0F,-1F, -0.5F, 0F, 1F, -0.5F, -1F, 1F, -0.5F, -1F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[81].setRotationPoint(-0.5F, -27F, 2.5F);

		gunModel[82].addShapeBox(11F, 10F, -5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[82].setRotationPoint(-0.5F, -22F, 2.5F);

		gunModel[83].addShapeBox(11F, 10F, -5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, -0.75F, 0F, 0F); // Import ImportImportBox0
		gunModel[83].setRotationPoint(0F, -21F, 2.5F);

		gunModel[84].addShapeBox(11F, 10F, -5F, 13, 1, 10, 0F,0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[84].setRotationPoint(-17F, -26F, 0F);

		gunModel[85].addShapeBox(11F, 10F, -5F, 14, 1, 10, 0F,0.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[85].setRotationPoint(-16.75F, -27F, 0F);

		gunModel[86].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[86].setRotationPoint(-17.5F, -26F, 0F);

		gunModel[87].addShapeBox(11F, 10F, -5F, 39, 3, 12, 0F,0F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Import ImportImportBox0
		gunModel[87].setRotationPoint(-102.5F, -36F, -1F);

		gunModel[88].addShapeBox(11F, 10F, -5F, 26, 1, 10, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[88].setRotationPoint(-17F, -27.5F, 0F);

		gunModel[89].addShapeBox(11F, 10F, -5F, 16, 1, 10, 0F,0F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[89].setRotationPoint(-17F, -27F, 0F);

		gunModel[90].addShapeBox(11F, 10F, -5F, 4, 2, 10, 0F,1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[90].setRotationPoint(12.25F, -25F, 0F);

		gunModel[91].addShapeBox(11F, 10F, -5F, 1, 2, 10, 0F,-4.75F, 0F, 0F, 4.5F, 0F, -1.5F, 4.5F, 0F, -1.5F, -4.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[91].setRotationPoint(17.5F, -26.5F, 0F);

		gunModel[92].addShapeBox(11F, 10F, -5F, 1, 2, 10, 0F,-0.15F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.15F, 0F, 0F); // Import ImportImportBox0
		gunModel[92].setRotationPoint(16F, -25F, 0F);

		gunModel[93].addShapeBox(11F, 10F, -5F, 2, 2, 10, 0F,-0.65F, 0F, 0F, 4.75F, 0F, 0F, 4.75F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F); // Import ImportImportBox0
		gunModel[93].setRotationPoint(15.5F, -26.5F, 0F);

		gunModel[94].addShapeBox(11F, 10F, -5F, 5, 1, 10, 0F,2F, 0.5F, 0F, -0.35F, 0.5F, 0F, -0.35F, 0.5F, 0F, 2F, 0.5F, 0F, 0.25F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[94].setRotationPoint(11.5F, -26F, 0F);

		gunModel[95].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[95].setRotationPoint(8.75F, -27.5F, 0F);

		gunModel[96].addShapeBox(11F, 10F, -5F, 13, 1, 10, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[96].setRotationPoint(9.5F, -27.5F, 0F);

		gunModel[97].addShapeBox(11F, 10F, -5F, 9, 1, 10, 0F,-2F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[97].setRotationPoint(23F, -27.5F, 0F);

		gunModel[98].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,-1.25F, -0.5F, 0F, 1.5F, -0.5F, -0.5F, 1.5F, -0.5F, -0.5F, -1.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[98].setRotationPoint(22.5F, -27.5F, 0F);

		gunModel[99].addShapeBox(11F, 10F, -5F, 7, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Import ImportImportBox0
		gunModel[99].setRotationPoint(24.5F, -27.5F, 0F);

		gunModel[100].addShapeBox(11F, 10F, -5F, 2, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[100].setRotationPoint(21.75F, -27.5F, 0F);

		gunModel[101].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,-0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.25F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[101].setRotationPoint(23.5F, -27.5F, 0F);

		gunModel[102].addShapeBox(11F, 10F, -5F, 4, 1, 10, 0F,0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[102].setRotationPoint(-23.5F, -27F, 0F);

		gunModel[103].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,1F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import ImportImportBox104
		gunModel[103].setRotationPoint(-19.5F, -27F, 0F);

		gunModel[104].addShapeBox(11F, 10F, -5F, 3, 1, 10, 0F,1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportBox0
		gunModel[104].setRotationPoint(-19.5F, -27F, 0F);

		gunModel[105].addShapeBox(11F, 10F, -5F, 12, 1, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 3F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 3F, -1.5F); // Import ImportImportBox0
		gunModel[105].setRotationPoint(-35.5F, -27F, 0F);

		gunModel[106].addShapeBox(11F, 10F, -5F, 2, 1, 10, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 4F, -1.5F, 0F, 3F, -1.5F, 0F, 3F, -1.5F, -0.5F, 4F, -1.5F); // Import ImportImportBox0
		gunModel[106].setRotationPoint(-37.5F, -27F, 0F);

		gunModel[107].addShapeBox(11F, 10F, -5F, 1, 2, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 5F, -1.5F, 0F, 3F, -1.5F, 0F, 3F, -1.5F, 0F, 5F, -1.5F); // Import ImportImportBox0
		gunModel[107].setRotationPoint(-38F, -27F, 0F);

		gunModel[108].addShapeBox(11F, 10F, -5F, 1, 2, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 5.75F, -1.5F, 0F, 5F, -1.5F, 0F, 5F, -1.5F, 0F, 5.75F, -1.5F); // Import ImportImportBox0
		gunModel[108].setRotationPoint(-39F, -27F, 0F);

		gunModel[109].addShapeBox(11F, 10F, -5F, 65, 4, 12, 0F,1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Import ImportImportBox0
		gunModel[109].setRotationPoint(-105F, -30F, -1F);

		gunModel[110].addShapeBox(11F, 10F, -5F, 19, 10, 9, 0F,0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.75F, 0F, -3F, 0.75F, 0F, -3F, 0.75F, 0F, 0F, 0.75F); // Import ImportImportBox0
		gunModel[110].setRotationPoint(-59F, -26F, 0.5F);

		gunModel[111].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, 0.5F, 0.75F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.75F, 0F, 5.5F, 0.25F, 0F, 5.25F, -1.5F, 0F, 5.25F, -1.5F, 0F, 5.5F, 0.25F); // Import ImportImportBox0
		gunModel[111].setRotationPoint(-40F, -25.5F, 0F);

		gunModel[112].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, 1F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.75F); // Import ImportImportBox0
		gunModel[112].setRotationPoint(-40F, -27.5F, 0F);

		gunModel[113].addShapeBox(11F, 10F, -5F, 1, 10, 9, 0F,0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Import ImportImportBox0
		gunModel[113].setRotationPoint(-60F, -26F, 0.5F);

		gunModel[114].addShapeBox(11F, 10F, -5F, 2, 10, 9, 0F,-0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, -1.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F, -1.5F, 0.75F); // Import ImportImportBox0
		gunModel[114].setRotationPoint(-62F, -26F, 0.5F);

		gunModel[115].addShapeBox(11F, 10F, -5F, 43, 10, 9, 0F,2F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 1.25F, 2F, 0F, 1.25F, -0.5F, -1.5F, 0.75F, -1F, -1.5F, 0.75F, -1F, -1.5F, 0.75F, -0.5F, -1.5F, 0.75F); // Import ImportImportBox0
		gunModel[115].setRotationPoint(-103.5F, -26F, 0.5F);

		gunModel[116].addShapeBox(11F, 10F, -5F, 25, 10, 8, 0F,2.5F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 1.25F, 2.5F, 0F, 1.25F, -0.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[116].setRotationPoint(-100.5F, -17.5F, 1F);

		gunModel[117].addShapeBox(11F, 10F, -5F, 16, 7, 6, 0F,3F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 1.25F, 3F, 0F, 1.25F, 0.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[117].setRotationPoint(-97F, -7.5F, 2F);

		gunModel[118].addShapeBox(11F, 10F, -5F, 18, 2, 4, 0F,0F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 1.25F, 0F, 0F, 1.25F, -0.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.75F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[118].setRotationPoint(-97.5F, -0.5F, 3F);

		gunModel[119].addShapeBox(11F, 10F, -5F, 15, 1, 2, 0F,0.25F, 0F, 1.25F, 1.5F, 0F, 1.25F, 1.5F, 0F, 1.25F, 0.25F, 0F, 1.25F, -0.25F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[119].setRotationPoint(-96.5F, 1.5F, 4F);

		gunModel[120].addShapeBox(11F, 10F, -5F, 2, 1, 4, 0F,-0.5F, 0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[120].setRotationPoint(-80.5F, 0.5F, 3F);

		gunModel[121].addShapeBox(11F, 10F, -5F, 2, 1, 4, 0F,-0.5F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, 0.75F, -0.5F, 0F, 0.75F); // Import ImportImportBox0
		gunModel[121].setRotationPoint(-80.5F, -0.5F, 3F);

		gunModel[122].addShapeBox(11F, 10F, -5F, 4, 2, 6, 0F,-0.5F, 0F, 0.55F, -2F, 0F, 0.55F, -2F, 0F, 0.55F, -0.5F, 0F, 0.55F, -0.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[122].setRotationPoint(-82.5F, -2.5F, 2F);

		gunModel[123].addShapeBox(11F, 10F, -5F, 4, 1, 6, 0F,-0.5F, 0.5F, 0.75F, -2F, 0.5F, 0.75F, -2F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, -0.5F, 0F, 0.55F, -2F, 0F, 0.55F, -2F, 0F, 0.55F, -0.5F, 0F, 0.55F); // Import ImportImportBox0
		gunModel[123].setRotationPoint(-82.5F, -3.5F, 2F);

		gunModel[124].addShapeBox(11F, 10F, -5F, 4, 3, 6, 0F,-0.5F, 0F, 1.25F, 2F, 0F, 1.25F, 2F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, 0.5F, 0.75F, -2F, 0.5F, 0.75F, -2F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F); // Import ImportImportBox0
		gunModel[124].setRotationPoint(-82.5F, -7.5F, 2F);

		gunModel[125].addShapeBox(11F, 10F, -5F, 7, 6, 8, 0F,0F, 0F, 0.85F, 1F, 0F, 0.85F, 1F, 0F, 0.85F, 0F, 0F, 0.85F, 0F, 0F, 0.25F, -7F, 0F, 0.25F, -7F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[125].setRotationPoint(-76.5F, -13.5F, 1F);

		gunModel[126].addShapeBox(11F, 10F, -5F, 13, 4, 8, 0F,0F, 0F, 1.25F, 1F, 0F, 1.25F, 1F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.85F, -5F, 0F, 0.85F, -5F, 0F, 0.85F, 0F, 0F, 0.85F); // Import ImportImportBox0
		gunModel[126].setRotationPoint(-76.5F, -17.5F, 1F);

		gunModel[127].addShapeBox(11F, 10F, -5F, 9, 4, 3, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[127].setRotationPoint(35.65F, -16.5F, 3.5F);

		gunModel[128].addShapeBox(11F, 10F, -5F, 10, 4, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[128].setRotationPoint(34.65F, -12.5F, 3.5F);

		gunModel[129].addShapeBox(11F, 10F, -5F, 10, 4, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[129].setRotationPoint(34.65F, -8.5F, 3.5F);

		gunModel[130].addShapeBox(11F, 10F, -5F, 10, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[130].setRotationPoint(34.65F, -4.5F, 3.5F);

		gunModel[131].addShapeBox(11F, 10F, -5F, 10, 2, 3, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[131].setRotationPoint(34.65F, -2.5F, 3.5F);

		gunModel[132].addShapeBox(11F, 10F, -5F, 10, 1, 3, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[132].setRotationPoint(34.65F, -0.5F, 3.5F);

		gunModel[133].addShapeBox(11F, 10F, -5F, 8, 4, 3, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[133].setRotationPoint(36.65F, -20.5F, 3.5F);

		gunModel[134].addShapeBox(11F, 10F, -5F, 8, 3, 3, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[134].setRotationPoint(36.65F, -23.5F, 3.5F);

		gunModel[135].addShapeBox(11F, 10F, -5F, 8, 2, 3, 0F,0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[135].setRotationPoint(36.65F, -25.5F, 3.5F);

		gunModel[136].addShapeBox(11F, 10F, -5F, 8, 1, 3, 0F,0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F); // Import ImportImportBox0
		gunModel[136].setRotationPoint(36.65F, -26.5F, 3.5F);

		gunModel[137].addShapeBox(11F, 10F, -5F, 9, 4, 3, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -2.75F, 0F, 0F, -3F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2.75F, 0F, 0F); // Import ImportImportBox0
		gunModel[137].setRotationPoint(35.65F, -16.5F, 6.5F);

		gunModel[138].addShapeBox(11F, 10F, -5F, 10, 4, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[138].setRotationPoint(34.65F, -12.5F, 6.5F);

		gunModel[139].addShapeBox(11F, 10F, -5F, 10, 4, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F); // Import ImportImportBox0
		gunModel[139].setRotationPoint(34.65F, -8.5F, 6.5F);

		gunModel[140].addShapeBox(11F, 10F, -5F, 10, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[140].setRotationPoint(34.65F, -4.5F, 6.5F);

		gunModel[141].addShapeBox(11F, 10F, -5F, 10, 2, 3, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.25F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -2.75F, 0F, 0.5F, -3.5F, 0F, 0.5F); // Import ImportImportBox0
		gunModel[141].setRotationPoint(34.65F, -2.5F, 6.5F);

		gunModel[142].addShapeBox(11F, 10F, -5F, 10, 1, 3, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, -2.75F, 0F, 0.5F, -3.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0.25F, 0F, 0F, -2.75F, 0F, 0.5F, -5.5F, 0F, 0.5F); // Import ImportImportBox0
		gunModel[142].setRotationPoint(34.65F, -0.5F, 6.5F);

		gunModel[143].addShapeBox(11F, 10F, -5F, 8, 4, 3, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.75F, 0F, 0F, -2.25F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -2.75F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportBox0
		gunModel[143].setRotationPoint(36.65F, -20.5F, 6.5F);

		gunModel[144].addShapeBox(11F, 10F, -5F, 8, 3, 3, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.75F, 0F, 0F, -2.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[144].setRotationPoint(36.65F, -23.5F, 6.5F);

		gunModel[145].addShapeBox(11F, 10F, -5F, 8, 2, 3, 0F,0.75F, 0F, 0F, -0.25F, 0F, 0F, -2.75F, 0F, 0F, -1.75F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportBox0
		gunModel[145].setRotationPoint(36.65F, -25.5F, 6.5F);

		gunModel[146].addShapeBox(11F, 10F, -5F, 8, 1, 3, 0F,0.75F, 0F, 0F, -0.25F, 0F, 0F, -2.75F, 0F, 0F, -1.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -2.75F, 0F, 0F, -1.75F, 0F, 0F); // Import ImportImportBox0
		gunModel[146].setRotationPoint(36.65F, -26.5F, 6.5F);

		gunModel[147].addShapeBox(11F, 10F, -5F, 1, 1, 15, 0F,0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[147].setRotationPoint(-3.5F, -32F, -2.5F);

		gunModel[148].addShapeBox(11F, 10F, -5F, 1, 2, 15, 0F,-0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[148].setRotationPoint(-4.5F, -33F, -2.5F);

		gunModel[149].addShapeBox(11F, 10F, -5F, 1, 1, 15, 0F,0F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[149].setRotationPoint(-2.5F, -32F, -2.5F);

		gunModel[150].addShapeBox(11F, 10F, -5F, 1, 2, 15, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[150].setRotationPoint(-4.75F, -33F, -2.5F);

		gunModel[151].addShapeBox(11F, 10F, -5F, 1, 1, 15, 0F,-0.25F, 0F, -0.6F, -0.5F, -1F, -0.6F, -0.5F, -1F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[151].setRotationPoint(-4.75F, -34F, -2.5F);

		gunModel[152].addShapeBox(11F, 10F, -5F, 9, 4, 3, 0F,-3F, 0F, 0F, -2.75F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -2.75F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[152].setRotationPoint(35.65F, -16.5F, 0.5F);

		gunModel[153].addShapeBox(11F, 10F, -5F, 10, 4, 3, 0F,-3.75F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[153].setRotationPoint(34.65F, -12.5F, 0.5F);

		gunModel[154].addShapeBox(11F, 10F, -5F, 10, 4, 3, 0F,-3.25F, 0F, 0F, -3.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[154].setRotationPoint(34.65F, -8.5F, 0.5F);

		gunModel[155].addShapeBox(11F, 10F, -5F, 10, 2, 3, 0F,-3F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[155].setRotationPoint(34.65F, -4.5F, 0.5F);

		gunModel[156].addShapeBox(11F, 10F, -5F, 10, 2, 3, 0F,-3.25F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -3.5F, 0F, 0.5F, -2.75F, 0F, 0.5F, 0.25F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[156].setRotationPoint(34.65F, -2.5F, 0.5F);

		gunModel[157].addShapeBox(11F, 10F, -5F, 10, 1, 3, 0F,-3.5F, 0F, 0.5F, -2.75F, 0F, 0.5F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -5.5F, 0F, 0.5F, -2.75F, 0F, 0.5F, 0.25F, 0F, 0F, -2.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[157].setRotationPoint(34.65F, -0.5F, 0.5F);

		gunModel[158].addShapeBox(11F, 10F, -5F, 8, 4, 3, 0F,-2.25F, 0F, 0F, -2.75F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2.75F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[158].setRotationPoint(36.65F, -20.5F, 0.5F);

		gunModel[159].addShapeBox(11F, 10F, -5F, 8, 3, 3, 0F,-2F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.25F, 0F, 0F, -2.75F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[159].setRotationPoint(36.65F, -23.5F, 0.5F);

		gunModel[160].addShapeBox(11F, 10F, -5F, 8, 2, 3, 0F,-1.75F, 0F, 0F, -2.75F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[160].setRotationPoint(36.65F, -25.5F, 0.5F);

		gunModel[161].addShapeBox(11F, 10F, -5F, 8, 1, 3, 0F,-1.75F, 0F, 0F, -2.75F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, -1.75F, 0F, 0F, -2.75F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F); // Import ImportImportBox0
		gunModel[161].setRotationPoint(36.65F, -26.5F, 0.5F);

		gunModel[162].addShapeBox(11F, 10F, -5F, 4, 4, 10, 0F,0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 1F, -0.25F, -3F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -3F, 0.75F); // Import ImportImportBox0
		gunModel[162].setRotationPoint(-106.5F, -31F, 0F);

		gunModel[163].addShapeBox(11F, 10F, -5F, 4, 2, 10, 0F,0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 1F); // Import ImportImportBox0
		gunModel[163].setRotationPoint(-106.5F, -33F, 0F);

		gunModel[164].addShapeBox(11F, 10F, -5F, 4, 3, 10, 0F,0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 1F); // Import ImportImportBox0
		gunModel[164].setRotationPoint(-106.5F, -36F, 0F);

		gunModel[165].addShapeBox(11F, 10F, -5F, 1, 5, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[165].setRotationPoint(39.75F, -31.5F, 3.85F);

		gunModel[166].addShapeBox(11F, 10F, -5F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 1.25F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 1.25F, 0F, 0F, 0.5F); // Import ImportImportBox0
		gunModel[166].setRotationPoint(39.25F, -31.5F, 3.85F);

		gunModel[167].addShapeBox(11F, 10F, -5F, 1, 5, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, -0.25F, 0F, 1.25F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, -0.25F, 0F, 1.25F); // Import ImportImportBox0
		gunModel[167].setRotationPoint(40.5F, -31.5F, 3.85F);

		gunModel[168].addShapeBox(11F, 10F, -5F, 37, 1, 15, 0F,0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[168].setRotationPoint(-1F, -32F, -2.5F);

		gunModel[169].addShapeBox(11F, 10F, -5F, 29, 2, 15, 0F,0F, 0F, -2.25F, 0.5F, 0F, -2.25F, 0.5F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Import ImportImportBox0
		gunModel[169].setRotationPoint(-2.5F, -34F, -2.5F);

		gunModel[170].addShapeBox(11F, 10F, -5F, 1, 2, 15, 0F,0F, 0F, -2.25F, 0.5F, 0F, -2.25F, 0.5F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Import ImportImportBox0
		gunModel[170].setRotationPoint(35F, -34F, -2.5F);

		gunModel[171].addShapeBox(11F, 10F, -5F, 12, 2, 10, 0F,0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import ImportImportBox0
		gunModel[171].setRotationPoint(-3F, -37.5F, 0F);

		gunModel[172].addShapeBox(11F, 10F, -5F, 12, 1, 8, 0F,0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import ImportImportBox0
		gunModel[172].setRotationPoint(-3F, -38.5F, 1F);

		gunModel[173].addShapeBox(11F, 10F, -5F, 39, 1, 6, 0F,0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import ImportImportBox0
		gunModel[173].setRotationPoint(-3F, -39.5F, 2F);

		gunModel[174].addShapeBox(11F, 10F, -5F, 1, 2, 10, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportImportBox0
		gunModel[174].setRotationPoint(19F, -37.5F, 0F);

		gunModel[175].addShapeBox(11F, 10F, -5F, 1, 1, 8, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportImportBox0
		gunModel[175].setRotationPoint(19F, -38.5F, 1F);

		gunModel[176].addShapeBox(11F, 10F, -5F, 6, 2, 10, 0F,0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportImportBox0
		gunModel[176].setRotationPoint(30F, -37.5F, 0F);

		gunModel[177].addShapeBox(11F, 10F, -5F, 6, 1, 8, 0F,0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportImportBox0
		gunModel[177].setRotationPoint(30F, -38.5F, 1F);

		gunModel[178].addShapeBox(11F, 10F, -5F, 10, 2, 10, 0F,0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportImportBox0
		gunModel[178].setRotationPoint(9F, -37.5F, 0F);

		gunModel[179].addShapeBox(11F, 10F, -5F, 10, 2, 10, 0F,0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportImportBox0
		gunModel[179].setRotationPoint(20F, -37.5F, 0F);

		gunModel[180].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,-0.99F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, -0.99F, -0.5F, -1.5F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F); // Import ImportImportBox0
		gunModel[180].setRotationPoint(18F, -38F, 0F);

		gunModel[181].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, -0.5F, -1.5F, -0.99F, -0.5F, -1.5F, -0.99F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F); // Import ImportImportBox0
		gunModel[181].setRotationPoint(9F, -38F, 0F);

		gunModel[182].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,-0.99F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, -0.99F, -0.5F, -1.5F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F); // Import ImportImportBox0
		gunModel[182].setRotationPoint(29F, -38F, 0F);

		gunModel[183].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, -0.5F, -1.5F, -0.99F, -0.5F, -1.5F, -0.99F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F); // Import ImportImportBox0
		gunModel[183].setRotationPoint(20F, -38F, 0F);

		gunModel[184].addShapeBox(11F, 10F, -5F, 1, 1, 8, 0F,0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, -0.5F, -1F); // Import ImportImportBox0
		gunModel[184].setRotationPoint(20F, -38.5F, 1F);

		gunModel[185].addShapeBox(11F, 10F, -5F, 1, 1, 8, 0F,-0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -1F, -0.5F, -1F); // Import ImportImportBox0
		gunModel[185].setRotationPoint(29F, -38.5F, 1F);

		gunModel[186].addShapeBox(11F, 10F, -5F, 1, 1, 8, 0F,0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, -0.5F, -1F); // Import ImportImportBox0
		gunModel[186].setRotationPoint(9F, -38.5F, 1F);

		gunModel[187].addShapeBox(11F, 10F, -5F, 1, 1, 8, 0F,-0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -1F, -0.5F, -1F); // Import ImportImportBox0
		gunModel[187].setRotationPoint(18F, -38.5F, 1F);

		gunModel[188].addShapeBox(11F, 10F, -5F, 1, 7, 12, 0F,0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Import ImportImportBox0
		gunModel[188].setRotationPoint(-4.5F, -40F, -1F);

		gunModel[189].addShapeBox(11F, 10F, -5F, 14, 2, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[189].setRotationPoint(38F, -37F, 2F);

		gunModel[190].addShapeBox(11F, 10F, -5F, 14, 2, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, -2F); // Import ImportImportBox0
		gunModel[190].setRotationPoint(38F, -35F, 2F);

		gunModel[191].addShapeBox(11F, 10F, -5F, 15, 2, 6, 0F,0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[191].setRotationPoint(37F, -39F, 2F);

		gunModel[192].addShapeBox(11F, 10F, -5F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportImportBox0
		gunModel[192].setRotationPoint(-4.5F, -43F, 2F);

		gunModel[193].addShapeBox(11F, 10F, -5F, 35, 4, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import ImportImportBox0
		gunModel[193].setRotationPoint(-98.5F, -40.5F, 2F);

		gunModel[194].addShapeBox(11F, 10F, -5F, 1, 1, 15, 0F,0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[194].setRotationPoint(-2.5F, -32F, -2.5F);

		gunModel[195].addShapeBox(11F, 10F, -5F, 1, 1, 15, 0F,0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[195].setRotationPoint(-3.5F, -32F, -2.5F);

		gunModel[196].addShapeBox(11F, 10F, -5F, 1, 2, 15, 0F,0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F); // Import ImportImportBox0
		gunModel[196].setRotationPoint(-3.5F, -34F, -2.5F);

		gunModel[197].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[197].setRotationPoint(-3.5F, -35F, 0F);

		gunModel[198].addShapeBox(11F, 10F, -5F, 1, 1, 15, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F); // Import ImportImportBox0
		gunModel[198].setRotationPoint(-4.5F, -33F, -2.5F);

		gunModel[199].addShapeBox(11F, 10F, -5F, 21, 1, 8, 0F,0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Import ImportImportBox0
		gunModel[199].setRotationPoint(9F, -38.5F, 1F);

		gunModel[200].addShapeBox(11F, 10F, -5F, 1, 2, 15, 0F,0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -2.25F, 0.5F, -0.5F, -2.25F, 0.5F, -0.5F, -2.25F, 0F, -0.5F, -2.25F); // Import ImportImportBox0
		gunModel[200].setRotationPoint(35F, -35.5F, -2.5F);

		gunModel[201].addShapeBox(11F, 10F, -5F, 1, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[201].setRotationPoint(-4.5F, -45F, 2F);

		gunModel[202].addShapeBox(11F, 10F, -5F, 5, 3, 1, 0F,0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[202].setRotationPoint(37.75F, -33.5F, 2.75F);

		gunModel[203].addShapeBox(11F, 10F, -5F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[203].setRotationPoint(37.75F, -30.5F, 2.75F);

		gunModel[204].addShapeBox(11F, 10F, -5F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[204].setRotationPoint(37.75F, -28.5F, 2.75F);

		gunModel[205].addShapeBox(11F, 10F, -5F, 5, 4, 10, 0F,0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[205].setRotationPoint(31.5F, -31F, 0F);

		gunModel[206].addShapeBox(11F, 10F, -5F, 1, 4, 15, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0.25F, -0.5F, -2.5F); // Import ImportImportBox0
		gunModel[206].setRotationPoint(36.75F, -31F, -2.5F);

		gunModel[207].addShapeBox(11F, 10F, -5F, 1, 2, 13, 0F,0.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[207].setRotationPoint(36.75F, -34F, -1.5F);

		gunModel[208].addShapeBox(11F, 10F, -5F, 9, 1, 10, 0F,-2F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[208].setRotationPoint(29.5F, -27.5F, 0F);

		gunModel[209].addShapeBox(11F, 10F, -5F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import ImportImportBox0
		gunModel[209].setRotationPoint(31.5F, -27.5F, 0F);

		gunModel[210].addShapeBox(11F, 10F, -5F, 1, 1, 15, 0F,0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[210].setRotationPoint(36.75F, -32F, -2.5F);

		gunModel[211].addShapeBox(11F, 10F, -5F, 5, 1, 10, 0F,-2F, -0.5F, -0.5F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, -2F, 0F, -1.5F, -1.75F, 0F, -1.5F, -1.75F, 0F, -1.5F, -2F, 0F, -1.5F); // Import ImportImportBox0
		gunModel[211].setRotationPoint(34.5F, -27.5F, 0F);

		gunModel[212].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import ImportImportBox0
		gunModel[212].setRotationPoint(36.5F, -27.5F, 0F);

		gunModel[213].addShapeBox(11F, 10F, -5F, 1, 2, 10, 0F,0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[213].setRotationPoint(36.75F, -36F, 0F);

		gunModel[214].addShapeBox(11F, 10F, -5F, 1, 1, 6, 0F,0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0.25F, 0F, 1F); // Import ImportImportBox0
		gunModel[214].setRotationPoint(36.75F, -37F, 2F);

		gunModel[215].addShapeBox(11F, 10F, -5F, 5, 3, 1, 0F,0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[215].setRotationPoint(37.75F, -33.5F, 6.25F);

		gunModel[216].addShapeBox(11F, 10F, -5F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[216].setRotationPoint(37.75F, -30.5F, 6.25F);

		gunModel[217].addShapeBox(11F, 10F, -5F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[217].setRotationPoint(37.75F, -28.5F, 6.25F);

		gunModel[218].addShapeBox(11F, 10F, -5F, 5, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportImportBox0
		gunModel[218].setRotationPoint(37.75F, -34.5F, 6.25F);

		gunModel[219].addShapeBox(11F, 10F, -5F, 5, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Import ImportImportBox0
		gunModel[219].setRotationPoint(37.75F, -34.5F, 2.75F);

		gunModel[220].addShapeBox(11F, 10F, -5F, 5, 1, 2, 0F,0F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0.15F, 0F, 0.5F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[220].setRotationPoint(37.75F, -33.5F, 4.25F);

		gunModel[221].addShapeBox(11F, 10F, -5F, 3, 3, 2, 0F,2F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 2F, -0.5F, 0.25F, 1F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 1F, 0.5F, 0.25F); // Import ImportImportBox0
		gunModel[221].setRotationPoint(-2.5F, -45F, 4F);

		gunModel[222].addShapeBox(11F, 10F, -5F, 3, 3, 2, 0F,2F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, 2F, -0.5F, 0.25F, 2F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 2F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[222].setRotationPoint(-1.5F, -42F, 4F);

		gunModel[223].addShapeBox(11F, 10F, -5F, 1, 1, 6, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[223].setRotationPoint(27.25F, -44.5F, 2F);

		gunModel[224].addShapeBox(11F, 10F, -5F, 1, 3, 6, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -4.25F, 0F, 0F, 4.25F, 0F, 0F, 4.25F, 0F, 0F, -4.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[224].setRotationPoint(32.25F, -43.5F, 2F);

		gunModel[225].addShapeBox(11F, 10F, -5F, 1, 1, 6, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[225].setRotationPoint(38F, -40.5F, 2F);

		gunModel[226].addShapeBox(11F, 10F, -5F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[226].setRotationPoint(36.5F, -39.5F, 2F);

		gunModel[227].addShapeBox(11F, 10F, -5F, 1, 1, 6, 0F,1.5F, 0F, 0F, -2.25F, 0F, -1.5F, -2.25F, 0F, -1.5F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[227].setRotationPoint(39F, -40.5F, 2F);

		gunModel[228].addShapeBox(11F, 10F, -5F, 1, 1, 6, 0F,-0.75F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, -0.75F, 0F, 0F, -1.25F, -0.5F, 0F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, -1.25F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[228].setRotationPoint(38.75F, -39.5F, 2F);

		gunModel[229].addShapeBox(11F, 10F, -5F, 1, 1, 6, 0F,0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[229].setRotationPoint(36.5F, -40.5F, 2F);

		gunModel[230].addShapeBox(11F, 10F, -5F, 3, 2, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import ImportImportBox0
		gunModel[230].setRotationPoint(36.5F, -39F, 2F);

		gunModel[231].addShapeBox(11F, 10F, -5F, 1, 2, 6, 0F,-0.5F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Import ImportImportBox0
		gunModel[231].setRotationPoint(39.5F, -39F, 2F);

		gunModel[232].addShapeBox(11F, 10F, -5F, 37, 4, 11, 0F,0F, 0F, -2.25F, 0.5F, 0F, -2.25F, 0.5F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportImportBox0
		gunModel[232].setRotationPoint(-2.5F, -36F, -0.5F);

		gunModel[233].addShapeBox(11F, 10F, -5F, 5, 1, 2, 0F,-1.5F, 0F, 0.25F, 1.5F, 0F, 0.25F, 1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -3F, 0F, 0.25F, 3.5F, 0F, 0.25F, 3.5F, 0F, 0.25F, -3F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[233].setRotationPoint(22.25F, -44.5F, 4F);

		gunModel[234].addShapeBox(11F, 10F, -5F, 6, 1, 2, 0F,1.25F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, 1.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[234].setRotationPoint(26.5F, -43.5F, 4F);

		gunModel[235].addShapeBox(11F, 10F, -5F, 6, 2, 2, 0F,1F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0.25F, 1F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[235].setRotationPoint(27.5F, -42.5F, 4F);

		gunModel[236].addShapeBox(11F, 10F, -5F, 6, 1, 2, 0F,1F, 0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0.25F, 1F, 0F, 0.25F, 2F, 0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0.25F, 2F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[236].setRotationPoint(27.5F, -40.5F, 4F);

		gunModel[237].addShapeBox(11F, 10F, -5F, 6, 1, 2, 0F,2F, 0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0.25F, 2F, 0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[237].setRotationPoint(27.5F, -39.5F, 4F);

		gunModel[238].addShapeBox(11F, 10F, -5F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[238].setRotationPoint(38F, -33F, -0.25F);

		gunModel[239].addShapeBox(11F, 10F, -5F, 11, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[239].setRotationPoint(38F, -34F, -0.25F);

		gunModel[240].addShapeBox(11F, 10F, -5F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportImportBox0
		gunModel[240].setRotationPoint(38F, -32F, -0.25F);

		gunModel[241].addShapeBox(11F, 10F, -5F, 38, 1, 2, 0F,0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[241].setRotationPoint(-2.5F, -35F, 0F);

		gunModel[242].addShapeBox(11F, 10F, -5F, 7, 2, 9, 0F,0.5F, 0F, -2.25F, 0.5F, 0F, -2.25F, 0.5F, 0F, -2.25F, 0.5F, 0F, -2.25F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F); // Import ImportImportBox0
		gunModel[242].setRotationPoint(27.5F, -34F, -2.5F);

		gunModel[243].addShapeBox(11F, 10F, -5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[243].setRotationPoint(50.5F, -33F, -0.25F);

		gunModel[244].addShapeBox(11F, 10F, -5F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[244].setRotationPoint(50.5F, -34F, -0.25F);

		gunModel[245].addShapeBox(11F, 10F, -5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import ImportImportBox0
		gunModel[245].setRotationPoint(50.5F, -32F, -0.25F);

		gunModel[246].addShapeBox(11F, 10F, -5F, 3, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import ImportImportBox0
		gunModel[246].setRotationPoint(48F, -33F, 0.25F);

		gunModel[247].addShapeBox(11F, 10F, -5F, 3, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Import ImportImportBox0
		gunModel[247].setRotationPoint(48F, -32.5F, 0.25F);

		gunModel[248].addShapeBox(11F, 10F, -5F, 3, 1, 2, 0F,-0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import ImportImportBox0
		gunModel[248].setRotationPoint(48F, -33.5F, 0.25F);

		gunModel[249].addShapeBox(11F, 10F, -5F, 1, 3, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F); // Import ImportImportBox0
		gunModel[249].setRotationPoint(34F, -45F, 4F);

		gunModel[250].addShapeBox(11F, 10F, -5F, 1, 3, 2, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, -0.5F, -0.5F, -0.25F, 0.75F, -0.25F, -0.25F, -1.25F, -0.2F, -0.75F, -1.25F, -0.2F, -0.75F, 0.75F, -0.25F, -0.25F); // Import ImportImportBox0
		gunModel[250].setRotationPoint(34.5F, -45F, 4F);

		gunModel[251].addShapeBox(11F, 10F, -5F, 1, 3, 2, 0F,-0.5F, -0.05F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.05F, -0.75F, 1F, -0.25F, -0.75F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, 1F, -0.25F, -0.75F); // Import ImportImportBox0
		gunModel[251].setRotationPoint(33.5F, -45F, 4F);

		gunModel[252].addShapeBox(11F, 10F, -5F, 1, 1, 9, 0F,-0.25F, 0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F); // Import ImportImportBox0
		gunModel[252].setRotationPoint(33.35F, -43.65F, 0.5F);

		gunModel[253].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[253].setRotationPoint(34.35F, -43.65F, 0.5F);

		gunModel[254].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[254].setRotationPoint(34.35F, -43.65F, 8.5F);

		gunModel[255].addShapeBox(11F, 10F, -5F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[255].setRotationPoint(37.35F, -42.4F, 0.5F);

		gunModel[256].addShapeBox(11F, 10F, -5F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[256].setRotationPoint(-10.5F, -30F, 10.5F);

		gunModel[257].addShapeBox(11F, 10F, -5F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[257].setRotationPoint(-10.5F, -28F, 10.5F);

		gunModel[258].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[258].setRotationPoint(-10.5F, -29F, 11.5F);

		gunModel[259].addShapeBox(11F, 10F, -5F, 3, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[259].setRotationPoint(-10.5F, -29F, 9.5F);

		gunModel[260].addShapeBox(11F, 10F, -5F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, -0.75F, 1.5F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[260].setRotationPoint(-7.5F, -29F, 9.5F);

		gunModel[261].addShapeBox(11F, 10F, -5F, 2, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -0.75F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportBox0
		gunModel[261].setRotationPoint(-12.5F, -29F, 9.5F);

		gunModel[262].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import ImportImportBox0
		gunModel[262].setRotationPoint(-10.5F, -29F, 10.5F);

		gunModel[263].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import ImportImportBox0
		gunModel[263].setRotationPoint(-10.5F, -29F, 10.5F);

		gunModel[264].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[264].setRotationPoint(-10.5F, -29F, 10.5F);

		gunModel[265].addShapeBox(11F, 10F, -5F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportImportBox0
		gunModel[265].setRotationPoint(3F, -46F, 3.5F);

		gunModel[266].addShapeBox(11F, 10F, -5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[266].setRotationPoint(4F, -46F, 3.5F);

		gunModel[267].addShapeBox(11F, 10F, -5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[267].setRotationPoint(5F, -46F, 3.5F);

		gunModel[268].addShapeBox(11F, 10F, -5F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[268].setRotationPoint(-62F, -18F, 2F);

		gunModel[269].addShapeBox(11F, 10F, -5F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F); // Import ImportImportBox0
		gunModel[269].setRotationPoint(-66F, -18F, 2F);

		gunModel[270].addShapeBox(11F, 10F, -5F, 2, 2, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.5F, 1.5F, 0F); // Import ImportImportBox0
		gunModel[270].setRotationPoint(-70F, -16F, 2F);

		gunModel[271].addShapeBox(11F, 10F, -5F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 3F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.25F, 3F, 0F); // Import ImportImportBox0
		gunModel[271].setRotationPoint(-68F, -16F, 2F);

		gunModel[272].addShapeBox(11F, 10F, -5F, 2, 3, 6, 0F,0F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[272].setRotationPoint(-68F, -14F, 2F);

		gunModel[273].addShapeBox(11F, 10F, -5F, 3, 1, 3, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[273].setRotationPoint(-7.5F, -42.5F, 3.5F);

		gunModel[274].addShapeBox(11F, 10F, -5F, 3, 1, 3, 0F,-1F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportImportBox0
		gunModel[274].setRotationPoint(-7.5F, -43.5F, 3.5F);

		gunModel[275].addShapeBox(11F, 10F, -5F, 1, 1, 3, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[275].setRotationPoint(51.5F, -34F, -0.25F);

		gunModel[276].addShapeBox(11F, 10F, -5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Import ImportImportBox0
		gunModel[276].setRotationPoint(51.5F, -32F, -0.25F);

		gunModel[277].addShapeBox(11F, 10F, -5F, 1, 1, 3, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[277].setRotationPoint(51.5F, -33F, -0.25F);

		gunModel[278].addShapeBox(11F, 10F, -5F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Import ImportImportBox0
		gunModel[278].setRotationPoint(51.5F, -33F, -0.25F);

		gunModel[279].addShapeBox(11F, 10F, -5F, 6, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportImportBox0
		gunModel[279].setRotationPoint(28F, -29.85F, 14F);
		gunModel[279].rotateAngleX = -0.62831853F;
		gunModel[279].rotateAngleZ = 0.01745329F;

		gunModel[280].addShapeBox(11F, 10F, -5F, 22, 4, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[280].setRotationPoint(-62.5F, -41F, 9F);

		gunModel[281].addShapeBox(11F, 10F, -5F, 22, 4, 1, 0F,0F, 0F, 2.25F, 0F, 0F, 2.25F, -0.25F, -0.25F, -2.75F, -0.25F, -0.25F, -2.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Import ImportImportBox0
		gunModel[281].setRotationPoint(-62.5F, -41F, 10F);

		gunModel[282].addShapeBox(11F, 10F, -5F, 3, 7, 6, 0F,2.75F, 0F, 1.25F, -3.5F, 0F, 1.25F, -3.5F, 0F, 1.25F, 2.75F, 0F, 1.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[282].setRotationPoint(-99.5F, -7.5F, 2F);

		gunModel[283].addShapeBox(11F, 10F, -5F, 3, 10, 8, 0F,2F, 0F, 1.25F, -3.5F, 0F, 1.25F, -3.5F, 0F, 1.25F, 2F, 0F, 1.25F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[283].setRotationPoint(-102.5F, -17.5F, 1F);

		gunModel[284].addShapeBox(11F, 10F, -5F, 3, 10, 9, 0F,1F, 0F, 1.25F, -3F, 0F, 1.25F, -3F, 0F, 1.25F, 1F, 0F, 1.25F, -1F, -1.5F, 0.75F, -0.5F, -1.5F, 0.75F, -0.5F, -1.5F, 0.75F, -1F, -1.5F, 0.75F); // Import ImportImportBox0
		gunModel[284].setRotationPoint(-105.5F, -26F, 0.5F);

		gunModel[285].addShapeBox(11F, 10F, -5F, 1, 4, 12, 0F,1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Import ImportImportBox0
		gunModel[285].setRotationPoint(-106F, -30F, -1F);

		gunModel[286].addShapeBox(11F, 10F, -5F, 1, 2, 12, 0F,1F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.25F, 0.65F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.65F, 0F, -0.25F); // Import ImportImportBox0
		gunModel[286].setRotationPoint(-106.75F, -33F, -1F);

		gunModel[287].addShapeBox(11F, 10F, -5F, 1, 1, 12, 0F,0.65F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.65F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Import ImportImportBox0
		gunModel[287].setRotationPoint(-106.75F, -31F, -1F);

		gunModel[288].addShapeBox(11F, 10F, -5F, 1, 3, 12, 0F,1F, 0F, -0.75F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.6F, 1F, 0F, -0.75F, 1F, 0.5F, -0.25F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 1F, 0.5F, -0.25F); // Import ImportImportBox0
		gunModel[288].setRotationPoint(-106.75F, -36.5F, -1F);

		gunModel[289].addShapeBox(11F, 10F, -5F, 3, 1, 6, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[289].setRotationPoint(-102.5F, -41.5F, 2F);

		gunModel[290].addShapeBox(11F, 10F, -5F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, 2.4F); // Import ImportImportBox0
		gunModel[290].setRotationPoint(-102.5F, -40.5F, 2F);

		gunModel[291].addShapeBox(11F, 10F, -5F, 3, 4, 6, 0F,0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, 2.4F); // Import ImportImportBox0
		gunModel[291].setRotationPoint(-105.5F, -40.5F, 2F);

		gunModel[292].addShapeBox(11F, 10F, -5F, 1, 2, 6, 0F,0F, -2F, 2.4F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -2F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, 2.4F); // Import ImportImportBox0
		gunModel[292].setRotationPoint(-106.5F, -38.5F, 2F);

		gunModel[293].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,-0.75F, 0.5F, -1.05F, 0.8F, 0.5F, -0.9F, 0.8F, 0.5F, -0.9F, -0.75F, 0.5F, -1.05F, 0F, 0F, 0.25F, 0.25F, 0F, 0.4F, 0.25F, 0F, 0.4F, 0F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[293].setRotationPoint(-107.75F, -37.5F, 0F);

		gunModel[294].addShapeBox(11F, 10F, -5F, 1, 1, 8, 0F,-1.75F, 0.25F, -1F, 0.75F, 0.25F, -1F, 0.75F, 0.25F, -1F, -1.75F, 0.25F, -1F, -0.25F, 0F, -0.05F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, -0.25F, 0F, -0.05F); // Import ImportImportBox0
		gunModel[294].setRotationPoint(-107.25F, -39F, 1F);

		gunModel[295].addShapeBox(11F, 10F, -5F, 33, 1, 6, 0F,0F, 0F, 1.35F, 0F, 0F, 1.35F, 0F, 0F, 1.35F, 0F, 0F, 1.35F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, 2.4F); // Import ImportImportBox0
		gunModel[295].setRotationPoint(-97.5F, -37.5F, 2F);

		gunModel[296].addShapeBox(11F, 10F, -5F, 1, 1, 6, 0F,0F, 0F, 1.35F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, 1.35F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, 2.4F); // Import ImportImportBox0
		gunModel[296].setRotationPoint(-64.5F, -37.5F, 2F);

		gunModel[297].addShapeBox(11F, 10F, -5F, 1, 1, 6, 0F,0F, 0F, 1.8F, 0F, 0F, 1.35F, 0F, 0F, 1.35F, 0F, 0F, 1.8F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, 2.4F); // Import ImportImportBox0
		gunModel[297].setRotationPoint(-98.5F, -37.5F, 2F);

		gunModel[298].addShapeBox(11F, 10F, -5F, 1, 1, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2.6F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, 0F, 0F, 2.6F); // Import ImportImportBox0
		gunModel[298].setRotationPoint(-98.5F, -40.5F, 4F);

		gunModel[299].addShapeBox(11F, 10F, -5F, 1, 2, 2, 0F,0F, 0F, 3.6F, 0F, 0F, 3.1F, 0F, 0F, 1.1F, 0F, 0F, 1.6F, 0F, 0F, 4.8F, 0F, 0F, 4.35F, 0F, 0F, 2.35F, 0F, 0F, 2.8F); // Import ImportImportBox0
		gunModel[299].setRotationPoint(-98.5F, -39.5F, 5F);

		gunModel[300].addShapeBox(11F, 10F, -5F, 1, 1, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2.1F, 0F, 0F, 2.6F, 0F, 0F, 2.6F, 0F, 0F, 2.1F); // Import ImportImportBox0
		gunModel[300].setRotationPoint(-64.5F, -40.5F, 4F);

		gunModel[301].addShapeBox(11F, 10F, -5F, 1, 2, 2, 0F,0F, 0F, 3.1F, 0F, 0F, 3.6F, 0F, 0F, 1.6F, 0F, 0F, 1.1F, 0F, 0F, 4.35F, 0F, 0F, 4.8F, 0F, 0F, 2.8F, 0F, 0F, 2.35F); // Import ImportImportBox0
		gunModel[301].setRotationPoint(-64.5F, -39.5F, 5F);

		gunModel[302].addShapeBox(11F, 10F, -5F, 33, 1, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, 0F, 0F, 2.1F); // Import ImportImportBox0
		gunModel[302].setRotationPoint(-97.5F, -40.5F, 4F);

		gunModel[303].addShapeBox(11F, 10F, -5F, 4, 2, 4, 0F,-0.25F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, 1.25F, -0.25F, 0F, 1.25F, -1.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -1.25F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[303].setRotationPoint(-100.5F, -0.5F, 3F);

		gunModel[304].addShapeBox(11F, 10F, -5F, 1, 1, 2, 0F,0.75F, 0F, 1.25F, 0.75F, 0F, 1.25F, 0.75F, 0F, 1.25F, 0.75F, 0F, 1.25F, -0.25F, 0F, 0.25F, 1.25F, 0F, 0.25F, 1.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[304].setRotationPoint(-98.5F, 1.5F, 4F);

		gunModel[305].addShapeBox(11F, 10F, -5F, 36, 7, 12, 0F,0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Import ImportImportBox0
		gunModel[305].setRotationPoint(-40.5F, -40F, -1F);

		gunModel[306].addShapeBox(11F, 10F, -5F, 22, 7, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Import ImportImportBox0
		gunModel[306].setRotationPoint(-62.5F, -40F, 4F);

		gunModel[307].addShapeBox(11F, 10F, -5F, 22, 3, 5, 0F,0F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[307].setRotationPoint(-62.5F, -36F, -1F);

		gunModel[308].addShapeBox(11F, 10F, -5F, 1, 1, 2, 0F,-1F, -0.5F, 2.1F, 0F, -0.5F, 2.1F, 0F, -0.5F, 1.8F, -1F, -0.5F, 1.6F, -0.5F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, -0.5F, 0F, 2.4F); // Import ImportImportBox0
		gunModel[308].setRotationPoint(-41.5F, -37.5F, 2F);

		gunModel[309].addShapeBox(11F, 10F, -5F, 1, 1, 2, 0F,0F, -0.5F, 2.1F, -1F, -0.5F, 2.1F, -1F, -0.5F, 1.6F, 0F, -0.5F, 1.8F, 0F, 0F, 2.4F, -0.5F, 0F, 2.4F, -0.5F, 0F, 2.4F, 0F, 0F, 2.4F); // Import ImportImportBox0
		gunModel[309].setRotationPoint(-62.5F, -37.5F, 2F);

		gunModel[310].addShapeBox(11F, 10F, -5F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[310].setRotationPoint(-62.5F, -41F, 2F);

		gunModel[311].addShapeBox(11F, 10F, -5F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportBox0
		gunModel[311].setRotationPoint(-41.5F, -41F, 2F);

		gunModel[312].addShapeBox(11F, 10F, -5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F); // Import ImportImportBox0
		gunModel[312].setRotationPoint(-10.5F, -29F, -0.5F);

		gunModel[313].addShapeBox(11F, 10F, -5F, 2, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -0.75F, 1.5F, -0.5F, 0F, 1.5F, -0.5F); // Import ImportImportBox0
		gunModel[313].setRotationPoint(-7.5F, -29F, -0.5F);

		gunModel[314].addShapeBox(11F, 10F, -5F, 2, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, -0.75F, 1.5F, -0.5F); // Import ImportImportBox0
		gunModel[314].setRotationPoint(-12.5F, -29F, -0.5F);

		gunModel[315].addShapeBox(11F, 10F, -5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[315].setRotationPoint(-10.5F, -30F, -1.5F);

		gunModel[316].addShapeBox(11F, 10F, -5F, 5, 4, 15, 0F,-0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, -2.5F, -0.25F, -0.5F, -2.5F); // Import ImportImportBox0
		gunModel[316].setRotationPoint(-39.5F, -32F, -2F);

		gunModel[317].addShapeBox(11F, 10F, -5F, 30, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[317].setRotationPoint(-34.5F, -33F, -2.5F);

		gunModel[318].addShapeBox(11F, 10F, -5F, 5, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[318].setRotationPoint(-39.5F, -33F, -2.5F);

		gunModel[319].addShapeBox(11F, 10F, -5F, 5, 1, 10, 0F,0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[319].setRotationPoint(-39.5F, -28F, 0F);

		gunModel[320].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,-1F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -1F, 0F, 0.7F, -0.5F, -0.5F, 0.35F, 0F, -0.5F, 0.35F, 0F, -0.5F, 0.35F, -0.5F, -0.5F, 0.35F); // Import ImportImportBox0
		gunModel[320].setRotationPoint(-35.5F, -28.5F, 0F);

		gunModel[321].addShapeBox(11F, 10F, -5F, 1, 1, 10, 0F,0F, 0F, 0.7F, -1F, 0F, 0.7F, -1F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.5F, 0.35F, -0.5F, -0.5F, 0.35F, -0.5F, -0.5F, 0.35F, 0F, -0.5F, 0.35F); // Import ImportImportBox0
		gunModel[321].setRotationPoint(-39.5F, -28.5F, 0F);

		gunModel[322].addShapeBox(11F, 10F, -5F, 1, 1, 14, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportImportBox0
		gunModel[322].setRotationPoint(-37.5F, -31F, -2F);

		gunModel[323].addShapeBox(11F, 10F, -5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportImportBox0
		gunModel[323].setRotationPoint(6.5F, -37.5F, 8F);

		gunModel[324].addShapeBox(11F, 10F, -5F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportBox0
		gunModel[324].setRotationPoint(-101F, -25.5F, 10.5F);

		gunModel[325].addShapeBox(11F, 10F, -5F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[325].setRotationPoint(-101F, -27.5F, 10.5F);

		gunModel[326].addShapeBox(11F, 10F, -5F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[326].setRotationPoint(-101F, -26.5F, 10.5F);

		gunModel[327].addShapeBox(11F, 10F, -5F, 9, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[327].setRotationPoint(-104F, -22.5F, 11F);

		gunModel[328].addShapeBox(11F, 10F, -5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[328].setRotationPoint(-105F, -25.5F, 11F);

		gunModel[329].addShapeBox(11F, 10F, -5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[329].setRotationPoint(-95F, -25.5F, 11F);

		gunModel[330].addShapeBox(11F, 10F, -5F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import ImportImportBox0
		gunModel[330].setRotationPoint(-104F, -26.5F, 11F);

		gunModel[331].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[331].setRotationPoint(-104F, -23.5F, 11F);

		gunModel[332].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[332].setRotationPoint(-104F, -25.5F, 11F);

		gunModel[333].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportImportBox0
		gunModel[333].setRotationPoint(-96F, -23.5F, 11F);

		gunModel[334].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[334].setRotationPoint(-96F, -25.5F, 11F);

		gunModel[335].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -1F, 0F, 0F, -0.5F); // Import ImportImportBox0
		gunModel[335].setRotationPoint(34.35F, -43.65F, 1.5F);

		gunModel[336].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, -0.2F, -1F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.2F, -1F, -0.5F, 0.2F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[336].setRotationPoint(34.35F, -43.65F, 7.5F);

		gunModel[337].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, 0F, 0F, -1F); // Import ImportImportBox0
		gunModel[337].setRotationPoint(36.85F, -42.6F, 1.5F);

		gunModel[338].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0F, 0F, -1F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[338].setRotationPoint(36.85F, -42.6F, 7.5F);

		gunModel[339].addShapeBox(11F, 10F, -5F, 1, 3, 2, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1F, 0.25F, 0F, -2.5F, 0.25F, 0F, -2.5F, 0.25F, 0F, -1F, 0.25F); // Import ImportImportBox0
		gunModel[339].setRotationPoint(0F, -45F, 4F);

		gunModel[340].addShapeBox(11F, 10F, -5F, 34, 2, 6, 0F,0F, -0.5F, 0.25F, 3F, -0.5F, 0.25F, 3F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 6.25F, 0F, 0.25F, 6.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[340].setRotationPoint(-11.5F, -47F, 2F);

		gunModel[341].addShapeBox(11F, 10F, -5F, 40, 1, 6, 0F,0F, -0.5F, -0.5F, 4.5F, -0.5F, -0.5F, 4.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0.25F, 6F, 0F, 0.25F, 6F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Import ImportImportBox0
		gunModel[341].setRotationPoint(-20.5F, -47.5F, 2F);

		gunModel[342].addShapeBox(11F, 10F, -5F, 2, 1, 6, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import ImportImportBox0
		gunModel[342].setRotationPoint(-20.5F, -48F, 2F);

		gunModel[343].addShapeBox(11F, 10F, -5F, 2, 1, 4, 0F,-1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Import ImportImportBox0
		gunModel[343].setRotationPoint(-20.5F, -48.5F, 3F);

		gunModel[344].addShapeBox(11F, 10F, -5F, 44, 1, 4, 0F,0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import ImportImportBox0
		gunModel[344].setRotationPoint(-20.5F, -47.5F, 3F);

		gunModel[345].addShapeBox(11F, 10F, -5F, 34, 1, 6, 0F,0F, 0F, 0.25F, 6.25F, 0F, 0.25F, 6.25F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, -0.5F, 0F, 7.25F, -0.5F, 0F, 7.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import ImportImportBox0
		gunModel[345].setRotationPoint(-11.5F, -45F, 2F);

		gunModel[346].addShapeBox(11F, 10F, -5F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import ImportImportBox0
		gunModel[346].setRotationPoint(-9F, -46F, 3.5F);

		gunModel[347].addShapeBox(11F, 10F, -5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[347].setRotationPoint(-8F, -46F, 3.5F);

		gunModel[348].addShapeBox(11F, 10F, -5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportImportBox0
		gunModel[348].setRotationPoint(-7F, -46F, 3.5F);

		gunModel[349].addShapeBox(11F, 10F, -5F, 10, 1, 6, 0F,-1.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -1.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -1.5F, -0.25F, 0.25F); // Import ImportImportBox0
		gunModel[349].setRotationPoint(-21.5F, -47F, 2F);

		gunModel[350].addShapeBox(11F, 10F, -5F, 2, 1, 6, 0F,-1.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -1.75F, -0.5F, 0.25F, -2F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -2F, -0.25F, 0.25F); // Import ImportImportBox0
		gunModel[350].setRotationPoint(-13.5F, -46.75F, 2F);

		gunModel[351].addShapeBox(11F, 10F, -5F, 87, 2, 6, 0F,0.5F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0.5F, -0.25F, -2F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Import Box581
		gunModel[351].setRotationPoint(52F, -39F, 2F);

		gunModel[352].addShapeBox(11F, 10F, -5F, 87, 2, 6, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Import Box582
		gunModel[352].setRotationPoint(52F, -37F, 2F);

		gunModel[353].addShapeBox(11F, 10F, -5F, 87, 2, 6, 0F,0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0.5F, -0.25F, -2F); // Import Box583
		gunModel[353].setRotationPoint(52F, -35F, 2F);

		gunModel[354].addShapeBox(11F, 10F, -5F, 3, 2, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box580
		gunModel[354].setRotationPoint(139.5F, -37F, 2F);

		gunModel[355].addShapeBox(11F, 10F, -5F, 3, 2, 6, 0F,0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box581
		gunModel[355].setRotationPoint(139.5F, -39F, 2F);

		gunModel[356].addShapeBox(11F, 10F, -5F, 3, 2, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, -2F); // Import Box582
		gunModel[356].setRotationPoint(139.5F, -35F, 2F);

		gunModel[357].addShapeBox(11F, 10F, -5F, 1, 2, 6, 0F,0.5F, 0.05F, -1.95F, 0F, 0.05F, -1.95F, 0F, 0.05F, -1.95F, 0.5F, 0.05F, -1.95F, 0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.5F, 0F, 0.05F); // Import Box583
		gunModel[357].setRotationPoint(132.5F, -39F, 2F);

		gunModel[358].addShapeBox(11F, 10F, -5F, 1, 2, 6, 0F,0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.5F, 0F, 0.05F); // Import Box584
		gunModel[358].setRotationPoint(132.5F, -37F, 2F);

		gunModel[359].addShapeBox(11F, 10F, -5F, 1, 2, 6, 0F,0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.5F, 0F, 0.05F); // Import Box586
		gunModel[359].setRotationPoint(126.5F, -37F, 2F);

		gunModel[360].addShapeBox(11F, 10F, -5F, 1, 2, 6, 0F,0.5F, 0.05F, -1.95F, 0F, 0.05F, -1.95F, 0F, 0.05F, -1.95F, 0.5F, 0.05F, -1.95F, 0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.5F, 0F, 0.05F); // Import Box587
		gunModel[360].setRotationPoint(126.5F, -39F, 2F);

		gunModel[361].addShapeBox(11F, 10F, -5F, 7, 2, 6, 0F,0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.5F, 0F, 0.05F, 0.5F, 0.05F, -1.95F, 0F, 0.05F, -1.95F, 0F, 0.05F, -1.95F, 0.5F, 0.05F, -1.95F); // Import Box588
		gunModel[361].setRotationPoint(126.5F, -35F, 2F);

		gunModel[362].addShapeBox(-3.5F, 0F, 0.5F, 8, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box589
		gunModel[362].setRotationPoint(140F, -24F, -2F);
		gunModel[362].rotateAngleX = -0.52359878F;

		gunModel[363].addShapeBox(-3.5F, 3F, 0.5F, 8, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Import Box590
		gunModel[363].setRotationPoint(140F, -24F, -2F);
		gunModel[363].rotateAngleX = -0.52359878F;

		gunModel[364].addShapeBox(-3.5F, 5F, 0.5F, 6, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box591
		gunModel[364].setRotationPoint(140F, -24F, -2F);
		gunModel[364].rotateAngleX = -0.52359878F;

		gunModel[365].addShapeBox(-3.5F, 5F, -0.5F, 6, 3, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box592
		gunModel[365].setRotationPoint(140F, -24F, -2F);
		gunModel[365].rotateAngleX = -0.52359878F;

		gunModel[366].addShapeBox(-3.5F, 3F, -0.5F, 8, 2, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Import Box593
		gunModel[366].setRotationPoint(140F, -24F, -2F);
		gunModel[366].rotateAngleX = -0.52359878F;

		gunModel[367].addShapeBox(-3.5F, 0F, -0.5F, 8, 3, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box594
		gunModel[367].setRotationPoint(140F, -24F, -2F);
		gunModel[367].rotateAngleX = -0.52359878F;

		gunModel[368].addShapeBox(-2F, 1F, -2.5F, 4, 1, 2, 0F,-1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box595
		gunModel[368].setRotationPoint(140F, -24F, -2F);
		gunModel[368].rotateAngleX = -0.52359878F;

		gunModel[369].addShapeBox(-2F, 2F, -2.5F, 4, 2, 2, 0F,-0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box596
		gunModel[369].setRotationPoint(140F, -24F, -2F);
		gunModel[369].rotateAngleX = -0.52359878F;

		gunModel[370].addShapeBox(-2F, 3.75F, -2.5F, 4, 1, 2, 0F,-0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box597
		gunModel[370].setRotationPoint(140F, -24F, -2F);
		gunModel[370].rotateAngleX = -0.52359878F;

		gunModel[371].addShapeBox(-8F, 6F, -2.5F, 10, 16, 2, 0F,-0.5F, -6F, -0.25F, -0.5F, -0.65F, -0.25F, 0F, 0F, 0F, 0F, -6F, -1F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -1F); // Import Box607
		gunModel[371].setRotationPoint(140F, -24F, -2F);
		gunModel[371].rotateAngleX = -0.52359878F;

		gunModel[372].addShapeBox(-8F, 24F, -2.5F, 10, 12, 2, 0F,-0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -1F); // Import Box609
		gunModel[372].setRotationPoint(140F, -24F, -2F);
		gunModel[372].rotateAngleX = -0.52359878F;

		gunModel[373].addShapeBox(-8F, 38F, -2.5F, 10, 14, 2, 0F,-0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -4F, -0.25F, -0.5F, -1.3F, -0.25F, 0F, -0.25F, 0F, 0F, -3.25F, -1F); // Import Box610
		gunModel[373].setRotationPoint(140F, -24F, -2F);
		gunModel[373].rotateAngleX = -0.52359878F;

		gunModel[374].addShapeBox(-8F, 21.5F, -2.5F, 10, 3, 2, 0F,-0.55F, 0F, -0.45F, -0.55F, 0F, -0.45F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, -1F, -0.55F, -0.25F, -0.45F, -0.55F, -0.25F, -0.45F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, -1F); // Import Box611
		gunModel[374].setRotationPoint(140F, -24F, -2F);
		gunModel[374].rotateAngleX = -0.52359878F;

		gunModel[375].addShapeBox(-8F, 35.5F, -2.5F, 10, 3, 2, 0F,-0.55F, 0F, -0.45F, -0.55F, 0F, -0.45F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, -1F, -0.55F, -0.25F, -0.45F, -0.55F, -0.25F, -0.45F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, -1F); // Import Box612
		gunModel[375].setRotationPoint(140F, -24F, -2F);
		gunModel[375].rotateAngleX = -0.52359878F;

		gunModel[376].addShapeBox(1F, 40.5F, -1.5F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box613
		gunModel[376].setRotationPoint(140F, -24F, -2F);
		gunModel[376].rotateAngleX = -0.52359878F;

		gunModel[377].addShapeBox(-2F, 3F, -2.5F, 2, 52, 2, 0F,-0.6F, 0F, -1.4F, -1.05F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, 0F, -1.4F, -1.05F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box0
		gunModel[377].setRotationPoint(140F, -24F, -2F);
		gunModel[377].rotateAngleX = -0.52359878F;

		gunModel[378].addShapeBox(-2F, 3F, -2.5F, 2, 52, 2, 0F,-1.4F, 0F, -0.6F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.95F, 0F, -1.05F, -1.4F, 0F, -0.6F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.95F, 0F, -1.05F); // Import Box1
		gunModel[378].setRotationPoint(140F, -24F, -2F);
		gunModel[378].rotateAngleX = -0.52359878F;

		gunModel[379].addShapeBox(-2F, 3F, -0.5F, 2, 52, 2, 0F,-0.95F, 0F, -1.05F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.4F, 0F, -0.6F, -0.95F, 0F, -1.05F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.4F, 0F, -0.6F); // Import Box2
		gunModel[379].setRotationPoint(140F, -24F, -2F);
		gunModel[379].rotateAngleX = -0.52359878F;

		gunModel[380].addShapeBox(-2F, 3F, -0.5F, 2, 52, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -1.05F, 0F, -0.95F, -0.6F, 0F, -1.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.05F, 0F, -0.95F, -0.6F, 0F, -1.4F); // Import Box3
		gunModel[380].setRotationPoint(140F, -24F, -2F);
		gunModel[380].rotateAngleX = -0.52359878F;

		gunModel[381].addShapeBox(0F, 3F, -0.5F, 2, 52, 2, 0F,0F, 0F, 0F, -0.95F, 0F, -1.05F, -1.4F, 0F, -0.6F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.95F, 0F, -1.05F, -1.4F, 0F, -0.6F, 0F, 0F, -0.5F); // Import Box4
		gunModel[381].setRotationPoint(140F, -24F, -2F);
		gunModel[381].rotateAngleX = -0.52359878F;

		gunModel[382].addShapeBox(0F, 3F, -0.5F, 2, 52, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, 0F, -1.4F, -1.05F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, 0F, -1.4F, -1.05F, 0F, -0.95F); // Import Box5
		gunModel[382].setRotationPoint(140F, -24F, -2F);
		gunModel[382].rotateAngleX = -0.52359878F;

		gunModel[383].addShapeBox(0F, 3F, -2.5F, 2, 52, 2, 0F,-1.05F, 0F, -0.95F, -0.6F, 0F, -1.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.05F, 0F, -0.95F, -0.6F, 0F, -1.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		gunModel[383].setRotationPoint(140F, -24F, -2F);
		gunModel[383].rotateAngleX = -0.52359878F;

		gunModel[384].addShapeBox(0F, 3F, -2.5F, 2, 52, 2, 0F,0F, 0F, -0.5F, -1.4F, 0F, -0.6F, -0.95F, 0F, -1.05F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.4F, 0F, -0.6F, -0.95F, 0F, -1.05F, 0F, 0F, 0F); // Import Box7
		gunModel[384].setRotationPoint(140F, -24F, -2F);
		gunModel[384].rotateAngleX = -0.52359878F;

		gunModel[385].addShapeBox(-3.5F, 0F, -1.5F, 8, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box622
		gunModel[385].setRotationPoint(140F, -24F, 2F);
		gunModel[385].rotateAngleX = 0.52359878F;

		gunModel[386].addShapeBox(-3.5F, 3F, -1.5F, 8, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Import Box623
		gunModel[386].setRotationPoint(140F, -24F, 2F);
		gunModel[386].rotateAngleX = 0.52359878F;

		gunModel[387].addShapeBox(-3.5F, 5F, -1.5F, 6, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box624
		gunModel[387].setRotationPoint(140F, -24F, 2F);
		gunModel[387].rotateAngleX = 0.52359878F;

		gunModel[388].addShapeBox(-3.5F, 5F, -0.5F, 6, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Import Box625
		gunModel[388].setRotationPoint(140F, -24F, 2F);
		gunModel[388].rotateAngleX = 0.52359878F;

		gunModel[389].addShapeBox(-3.5F, 3F, -0.5F, 8, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F); // Import Box626
		gunModel[389].setRotationPoint(140F, -24F, 2F);
		gunModel[389].rotateAngleX = 0.52359878F;

		gunModel[390].addShapeBox(-3.5F, 0F, -0.5F, 8, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Import Box627
		gunModel[390].setRotationPoint(140F, -24F, 2F);
		gunModel[390].rotateAngleX = 0.52359878F;

		gunModel[391].addShapeBox(-2F, 1F, 0.5F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box628
		gunModel[391].setRotationPoint(140F, -24F, 2F);
		gunModel[391].rotateAngleX = 0.52359878F;

		gunModel[392].addShapeBox(-2F, 2F, 0.5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Import Box629
		gunModel[392].setRotationPoint(140F, -24F, 2F);
		gunModel[392].rotateAngleX = 0.52359878F;

		gunModel[393].addShapeBox(-2F, 3.75F, 0.5F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F); // Import Box630
		gunModel[393].setRotationPoint(140F, -24F, 2F);
		gunModel[393].rotateAngleX = 0.52359878F;

		gunModel[394].addShapeBox(-8F, 6F, 0.5F, 10, 16, 2, 0F,0F, -6F, -1F, 0F, 0F, 0F, -0.5F, -0.65F, -0.25F, -0.5F, -6F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Import Box631
		gunModel[394].setRotationPoint(140F, -24F, 2F);
		gunModel[394].rotateAngleX = 0.52359878F;

		gunModel[395].addShapeBox(-8F, 24F, 0.5F, 10, 12, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Import Box632
		gunModel[395].setRotationPoint(140F, -24F, 2F);
		gunModel[395].rotateAngleX = 0.52359878F;

		gunModel[396].addShapeBox(-8F, 38F, 0.5F, 10, 14, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -3.25F, -1F, 0F, -0.25F, 0F, -0.5F, -1.3F, -0.25F, -0.5F, -4F, -0.25F); // Import Box633
		gunModel[396].setRotationPoint(140F, -24F, 2F);
		gunModel[396].rotateAngleX = 0.52359878F;

		gunModel[397].addShapeBox(-8F, 21.5F, 0.5F, 10, 3, 2, 0F,-0.05F, -0.25F, -1F, -0.05F, -0.25F, 0F, -0.55F, 0F, -0.45F, -0.55F, 0F, -0.45F, -0.05F, -0.5F, -1F, -0.05F, -0.5F, 0F, -0.55F, -0.25F, -0.45F, -0.55F, -0.25F, -0.45F); // Import Box634
		gunModel[397].setRotationPoint(140F, -24F, 2F);
		gunModel[397].rotateAngleX = 0.52359878F;

		gunModel[398].addShapeBox(-8F, 35.5F, 0.5F, 10, 3, 2, 0F,-0.05F, -0.25F, -1F, -0.05F, -0.25F, 0F, -0.55F, 0F, -0.45F, -0.55F, 0F, -0.45F, -0.05F, -0.5F, -1F, -0.05F, -0.5F, 0F, -0.55F, -0.25F, -0.45F, -0.55F, -0.25F, -0.45F); // Import Box635
		gunModel[398].setRotationPoint(140F, -24F, 2F);
		gunModel[398].rotateAngleX = 0.52359878F;

		gunModel[399].addShapeBox(1F, 40.5F, -0.5F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box636
		gunModel[399].setRotationPoint(140F, -24F, 2F);
		gunModel[399].rotateAngleX = 0.52359878F;

		gunModel[400].addShapeBox(-2F, 3F, 0.5F, 2, 52, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -1.05F, 0F, -0.95F, -0.6F, 0F, -1.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.05F, 0F, -0.95F, -0.6F, 0F, -1.4F); // Import Box637
		gunModel[400].setRotationPoint(140F, -24F, 2F);
		gunModel[400].rotateAngleX = 0.52359878F;

		gunModel[401].addShapeBox(-2F, 3F, 0.5F, 2, 52, 2, 0F,-0.95F, 0F, -1.05F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.4F, 0F, -0.6F, -0.95F, 0F, -1.05F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.4F, 0F, -0.6F); // Import Box638
		gunModel[401].setRotationPoint(140F, -24F, 2F);
		gunModel[401].rotateAngleX = 0.52359878F;

		gunModel[402].addShapeBox(-2F, 3F, -1.5F, 2, 52, 2, 0F,-1.4F, 0F, -0.6F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.95F, 0F, -1.05F, -1.4F, 0F, -0.6F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.95F, 0F, -1.05F); // Import Box639
		gunModel[402].setRotationPoint(140F, -24F, 2F);
		gunModel[402].rotateAngleX = 0.52359878F;

		gunModel[403].addShapeBox(-2F, 3F, -1.5F, 2, 52, 2, 0F,-0.6F, 0F, -1.4F, -1.05F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, 0F, -1.4F, -1.05F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box640
		gunModel[403].setRotationPoint(140F, -24F, 2F);
		gunModel[403].rotateAngleX = 0.52359878F;

		gunModel[404].addShapeBox(0F, 3F, -1.5F, 2, 52, 2, 0F,0F, 0F, -0.5F, -1.4F, 0F, -0.6F, -0.95F, 0F, -1.05F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.4F, 0F, -0.6F, -0.95F, 0F, -1.05F, 0F, 0F, 0F); // Import Box641
		gunModel[404].setRotationPoint(140F, -24F, 2F);
		gunModel[404].rotateAngleX = 0.52359878F;

		gunModel[405].addShapeBox(0F, 3F, -1.5F, 2, 52, 2, 0F,-1.05F, 0F, -0.95F, -0.6F, 0F, -1.4F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.05F, 0F, -0.95F, -0.6F, 0F, -1.4F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box642
		gunModel[405].setRotationPoint(140F, -24F, 2F);
		gunModel[405].rotateAngleX = 0.52359878F;

		gunModel[406].addShapeBox(0F, 3F, 0.5F, 2, 52, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, 0F, -1.4F, -1.05F, 0F, -0.95F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, 0F, -1.4F, -1.05F, 0F, -0.95F); // Import Box643
		gunModel[406].setRotationPoint(140F, -24F, 2F);
		gunModel[406].rotateAngleX = 0.52359878F;

		gunModel[407].addShapeBox(0F, 3F, 0.5F, 2, 52, 2, 0F,0F, 0F, 0F, -0.95F, 0F, -1.05F, -1.4F, 0F, -0.6F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.95F, 0F, -1.05F, -1.4F, 0F, -0.6F, 0F, 0F, -0.5F); // Import Box644
		gunModel[407].setRotationPoint(140F, -24F, 2F);
		gunModel[407].rotateAngleX = 0.52359878F;

		gunModel[408].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box668
		gunModel[408].setRotationPoint(138F, 22.5F, 26.5F);

		gunModel[409].addShapeBox(0F, 0F, 0F, 7, 2, 10, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box669
		gunModel[409].setRotationPoint(131F, 22.5F, 26.5F);

		gunModel[410].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F); // Import Box670
		gunModel[410].setRotationPoint(142F, 22.5F, 26.5F);

		gunModel[411].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F); // Import Box671
		gunModel[411].setRotationPoint(131F, 22.5F, 36.5F);

		gunModel[412].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box672
		gunModel[412].setRotationPoint(130F, 22.5F, 30.5F);

		gunModel[413].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box673
		gunModel[413].setRotationPoint(138F, 22.5F, 25.5F);

		gunModel[414].addShapeBox(0F, 0F, 0F, 7, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import Box674
		gunModel[414].setRotationPoint(131F, 22.5F, -36.5F);

		gunModel[415].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box675
		gunModel[415].setRotationPoint(130F, 22.5F, -36.5F);

		gunModel[416].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box676
		gunModel[416].setRotationPoint(131F, 22.5F, -37.5F);

		gunModel[417].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box677
		gunModel[417].setRotationPoint(138F, 22.5F, -36.5F);

		gunModel[418].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F); // Import Box678
		gunModel[418].setRotationPoint(142F, 22.5F, -33.5F);

		gunModel[419].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Import Box679
		gunModel[419].setRotationPoint(138F, 22.5F, -26.5F);

		gunModel[420].addShapeBox(11F, 10F, -5F, 22, 3, 2, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import ImportImportBox0
		gunModel[420].setRotationPoint(-62.5F, -40F, 2F);

		gunModel[421].addShapeBox(11F, 10F, -5F, 2, 1, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Box 0
		gunModel[421].setRotationPoint(-16.5F, -48.5F, 3F);

		gunModel[422].addShapeBox(11F, 10F, -5F, 2, 1, 6, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 1
		gunModel[422].setRotationPoint(-16.5F, -48F, 2F);

		gunModel[423].addShapeBox(11F, 10F, -5F, 2, 1, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Box 2
		gunModel[423].setRotationPoint(-12.5F, -48.5F, 3F);

		gunModel[424].addShapeBox(11F, 10F, -5F, 2, 1, 6, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 3
		gunModel[424].setRotationPoint(-12.5F, -48F, 2F);

		gunModel[425].addShapeBox(11F, 10F, -5F, 2, 1, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Box 4
		gunModel[425].setRotationPoint(-8.5F, -48.5F, 3F);

		gunModel[426].addShapeBox(11F, 10F, -5F, 2, 1, 6, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 5
		gunModel[426].setRotationPoint(-8.5F, -48F, 2F);

		gunModel[427].addShapeBox(11F, 10F, -5F, 2, 1, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Box 6
		gunModel[427].setRotationPoint(-4.5F, -48.5F, 3F);

		gunModel[428].addShapeBox(11F, 10F, -5F, 2, 1, 6, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 7
		gunModel[428].setRotationPoint(-4.5F, -48F, 2F);

		gunModel[429].addShapeBox(11F, 10F, -5F, 2, 1, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Box 8
		gunModel[429].setRotationPoint(-0.5F, -48.5F, 3F);

		gunModel[430].addShapeBox(11F, 10F, -5F, 2, 1, 6, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 9
		gunModel[430].setRotationPoint(-0.5F, -48F, 2F);

		gunModel[431].addShapeBox(11F, 10F, -5F, 2, 1, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Box 10
		gunModel[431].setRotationPoint(3.5F, -48.5F, 3F);

		gunModel[432].addShapeBox(11F, 10F, -5F, 2, 1, 6, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 11
		gunModel[432].setRotationPoint(3.5F, -48F, 2F);

		gunModel[433].addShapeBox(11F, 10F, -5F, 2, 1, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Box 12
		gunModel[433].setRotationPoint(7.5F, -48.5F, 3F);

		gunModel[434].addShapeBox(11F, 10F, -5F, 2, 1, 6, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 13
		gunModel[434].setRotationPoint(7.5F, -48F, 2F);

		gunModel[435].addShapeBox(11F, 10F, -5F, 2, 1, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Box 14
		gunModel[435].setRotationPoint(11.5F, -48.5F, 3F);

		gunModel[436].addShapeBox(11F, 10F, -5F, 2, 1, 6, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 15
		gunModel[436].setRotationPoint(11.5F, -48F, 2F);

		gunModel[437].addShapeBox(11F, 10F, -5F, 2, 1, 4, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Box 16
		gunModel[437].setRotationPoint(15.5F, -48.5F, 3F);

		gunModel[438].addShapeBox(11F, 10F, -5F, 2, 1, 6, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 17
		gunModel[438].setRotationPoint(15.5F, -48F, 2F);

		gunModel[439].addShapeBox(11F, 10F, -5F, 4, 1, 4, 0F,0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F); // Box 18
		gunModel[439].setRotationPoint(19.5F, -48.5F, 3F);

		gunModel[440].addShapeBox(11F, 10F, -5F, 4, 1, 6, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 19
		gunModel[440].setRotationPoint(19.5F, -48F, 2F);
	}

	private void initdefaultBarrelModel_1()
	{
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Import ImportImportBox0
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Import ImportImportBox0
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import ImportImportBox0
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import ImportImportBox0
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Import ImportImportBox0
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 817, 25, textureX, textureY); // Import ImportImportBox0
		defaultBarrelModel[6] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Import ImportImportBox0
		defaultBarrelModel[7] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Import ImportImportBox0
		defaultBarrelModel[8] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Import ImportImportBox0

		defaultBarrelModel[0].addShapeBox(11F, 10F, -5F, 7, 2, 4, 0F,0F, -0.25F, 0.25F, 1F, -0.25F, 0.25F, 1F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportImportBox0
		defaultBarrelModel[0].setRotationPoint(143.5F, -35.75F, 3F);

		defaultBarrelModel[1].addShapeBox(11F, 10F, -5F, 7, 2, 4, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 1F, -0.25F, 0.25F, 1F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Import ImportImportBox0
		defaultBarrelModel[1].setRotationPoint(143.5F, -38.25F, 3F);

		defaultBarrelModel[2].addShapeBox(11F, 10F, -5F, 1, 5, 4, 0F,-0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // Import ImportImportBox0
		defaultBarrelModel[2].setRotationPoint(142F, -38.25F, 3F);

		defaultBarrelModel[3].addShapeBox(11F, 10F, -5F, 1, 2, 4, 0F,0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 1F, -0.25F, 0.5F); // Import ImportImportBox0
		defaultBarrelModel[3].setRotationPoint(152F, -35.5F, 3F);

		defaultBarrelModel[4].addShapeBox(11F, 10F, -5F, 1, 1, 4, 0F,1.75F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 1.75F, 0F, 0.5F, 1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F); // Import ImportImportBox0
		defaultBarrelModel[4].setRotationPoint(152F, -33.75F, 3F);

		defaultBarrelModel[5].addShapeBox(11F, 10F, -5F, 1, 2, 4, 0F,1F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import ImportImportBox0
		defaultBarrelModel[5].setRotationPoint(152F, -38.5F, 3F);

		defaultBarrelModel[6].addShapeBox(11F, 10F, -5F, 1, 1, 4, 0F,1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1.75F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 1.75F, 0F, 0.5F); // Import ImportImportBox0
		defaultBarrelModel[6].setRotationPoint(152F, -39.25F, 3F);

		defaultBarrelModel[7].addShapeBox(11F, 10F, -5F, 1, 1, 4, 0F,0F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Import ImportImportBox0
		defaultBarrelModel[7].setRotationPoint(143.5F, -37F, 3F);

		defaultBarrelModel[8].addShapeBox(11F, 10F, -5F, 1, 1, 4, 0F,0F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, -1F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import ImportImportBox0
		defaultBarrelModel[8].setRotationPoint(143.5F, -36F, 3F);
	}

	private void initdefaultScopeModel_1()
	{
		defaultScopeModel[0] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[1] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[2] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[3] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[4] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[5] = new ModelRendererTurbo(this, 553, 73, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[6] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[7] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[8] = new ModelRendererTurbo(this, 697, 73, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[9] = new ModelRendererTurbo(this, 945, 137, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[10] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[11] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[12] = new ModelRendererTurbo(this, 945, 41, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[13] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[14] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[15] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[16] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[17] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[18] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[19] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[20] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[21] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[22] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[23] = new ModelRendererTurbo(this, 969, 137, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[24] = new ModelRendererTurbo(this, 993, 137, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[25] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[26] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[27] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[28] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[29] = new ModelRendererTurbo(this, 809, 89, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[30] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[31] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[32] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[33] = new ModelRendererTurbo(this, 633, 113, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[34] = new ModelRendererTurbo(this, 729, 113, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[35] = new ModelRendererTurbo(this, 961, 113, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[36] = new ModelRendererTurbo(this, 993, 113, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[37] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[38] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[39] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[40] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[41] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[42] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[43] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[44] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[45] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[46] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[47] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[48] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[49] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[50] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[51] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[52] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[53] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[54] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[55] = new ModelRendererTurbo(this, 577, 81, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[56] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[57] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[58] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[59] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[60] = new ModelRendererTurbo(this, 881, 81, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[61] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[62] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[63] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[64] = new ModelRendererTurbo(this, 777, 97, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[65] = new ModelRendererTurbo(this, 833, 97, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[66] = new ModelRendererTurbo(this, 569, 129, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[67] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[68] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[69] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[70] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[71] = new ModelRendererTurbo(this, 641, 129, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[72] = new ModelRendererTurbo(this, 689, 129, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[73] = new ModelRendererTurbo(this, 809, 129, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[74] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[75] = new ModelRendererTurbo(this, 593, 129, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[76] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[77] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[78] = new ModelRendererTurbo(this, 617, 129, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[79] = new ModelRendererTurbo(this, 841, 129, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[80] = new ModelRendererTurbo(this, 865, 129, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[81] = new ModelRendererTurbo(this, 545, 121, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[82] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[83] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[84] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[85] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[86] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[87] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[88] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[89] = new ModelRendererTurbo(this, 985, 137, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[90] = new ModelRendererTurbo(this, 1009, 137, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[91] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[92] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[93] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[94] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[95] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[96] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[97] = new ModelRendererTurbo(this, 849, 161, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[98] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[99] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[100] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Import ImportImportBox1
		defaultScopeModel[101] = new ModelRendererTurbo(this, 513, 89, textureX, textureY); // Import Box581
		defaultScopeModel[102] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Import Box582
		defaultScopeModel[103] = new ModelRendererTurbo(this, 745, 89, textureX, textureY); // Import Box583
		defaultScopeModel[104] = new ModelRendererTurbo(this, 913, 161, textureX, textureY); // Import Box584
		defaultScopeModel[105] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Import Box644

		defaultScopeModel[0].addShapeBox(11F, 10F, -5F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[0].setRotationPoint(15.5F, -49.5F, 1F);

		defaultScopeModel[1].addShapeBox(11F, 10F, -5F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportImportBox1
		defaultScopeModel[1].setRotationPoint(16F, -49.5F, 1F);

		defaultScopeModel[2].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[2].setRotationPoint(16.5F, -48.5F, 1F);

		defaultScopeModel[3].addShapeBox(11F, 10F, -5F, 3, 5, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportImportBox1
		defaultScopeModel[3].setRotationPoint(18F, -52F, 1.5F);

		defaultScopeModel[4].addShapeBox(11F, 10F, -5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportImportBox1
		defaultScopeModel[4].setRotationPoint(17F, -52F, 1.5F);

		defaultScopeModel[5].addShapeBox(11F, 10F, -5F, 1, 5, 1, 0F,0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportImportBox1
		defaultScopeModel[5].setRotationPoint(16F, -52F, 1.5F);

		defaultScopeModel[6].addShapeBox(11F, 10F, -5F, 1, 2, 1, 0F,-0.5F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F); // Import ImportImportBox1
		defaultScopeModel[6].setRotationPoint(15F, -51F, 1.5F);

		defaultScopeModel[7].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[7].setRotationPoint(19.5F, -48.5F, 1F);

		defaultScopeModel[8].addShapeBox(11F, 10F, -5F, 1, 2, 2, 0F,-0.5F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import ImportImportBox1
		defaultScopeModel[8].setRotationPoint(20F, -49.5F, 1F);

		defaultScopeModel[9].addShapeBox(11F, 10F, -5F, 4, 1, 8, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[9].setRotationPoint(21F, -48.5F, 1F);

		defaultScopeModel[10].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,-0.5F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[10].setRotationPoint(18.5F, -48.5F, 1F);

		defaultScopeModel[11].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[11].setRotationPoint(17.5F, -48.5F, 1F);

		defaultScopeModel[12].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 1.75F, 0.25F, -0.5F, 1.75F, 0.25F, -0.5F, 1.75F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Import ImportImportBox1
		defaultScopeModel[12].setRotationPoint(18F, -52F, 0.5F);

		defaultScopeModel[13].addShapeBox(11F, 10F, -5F, 4, 1, 1, 0F,0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportImportBox1
		defaultScopeModel[13].setRotationPoint(16.5F, -50.5F, 0.5F);

		defaultScopeModel[14].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,1.75F, 0.25F, -0.5F, 1.75F, 0.25F, -0.5F, 1.75F, 0.25F, 0F, 1.75F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportImportBox1
		defaultScopeModel[14].setRotationPoint(18F, -49F, 0.5F);

		defaultScopeModel[15].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.75F, 0.25F, 0F, 1.75F, 0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportImportBox1
		defaultScopeModel[15].setRotationPoint(18F, -49F, 0F);

		defaultScopeModel[16].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.75F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Import ImportImportBox1
		defaultScopeModel[16].setRotationPoint(18F, -52F, 0F);

		defaultScopeModel[17].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.75F, 0.25F, 0F, 1.75F, 0.25F, 0F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.75F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Import ImportImportBox1
		defaultScopeModel[17].setRotationPoint(18F, -50.5F, 0F);

		defaultScopeModel[18].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[18].setRotationPoint(21.5F, -48F, 0.25F);

		defaultScopeModel[19].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[19].setRotationPoint(21.5F, -50F, 0.25F);

		defaultScopeModel[20].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[20].setRotationPoint(21.5F, -49F, 0.25F);

		defaultScopeModel[21].addShapeBox(11F, 10F, -5F, 4, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Import ImportImportBox1
		defaultScopeModel[21].setRotationPoint(21F, -47F, 7F);

		defaultScopeModel[22].addShapeBox(11F, 10F, -5F, 4, 2, 5, 0F,0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[22].setRotationPoint(16.5F, -51F, 2.5F);

		defaultScopeModel[23].addShapeBox(11F, 10F, -5F, 4, 1, 5, 0F,0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[23].setRotationPoint(16.5F, -49.5F, 2.5F);

		defaultScopeModel[24].addShapeBox(11F, 10F, -5F, 4, 1, 5, 0F,0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[24].setRotationPoint(16.5F, -52F, 2.5F);

		defaultScopeModel[25].addShapeBox(11F, 10F, -5F, 4, 2, 4, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox1
		defaultScopeModel[25].setRotationPoint(16.5F, -54F, 3F);

		defaultScopeModel[26].addShapeBox(11F, 10F, -5F, 4, 1, 1, 0F,0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox1
		defaultScopeModel[26].setRotationPoint(16.5F, -55F, 6F);

		defaultScopeModel[27].addShapeBox(11F, 10F, -5F, 4, 1, 1, 0F,0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import ImportImportBox1
		defaultScopeModel[27].setRotationPoint(16.5F, -56F, 6.5F);

		defaultScopeModel[28].addShapeBox(11F, 10F, -5F, 4, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[28].setRotationPoint(16.5F, -57F, 7F);

		defaultScopeModel[29].addShapeBox(11F, 10F, -5F, 4, 1, 1, 0F,-0.75F, 0.5F, 0.5F, -0.75F, 0.5F, 0.5F, -0.75F, 0.25F, -0.6F, -0.75F, 0.25F, -0.6F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Import ImportImportBox1
		defaultScopeModel[29].setRotationPoint(16.5F, -57.75F, 6.5F);

		defaultScopeModel[30].addShapeBox(11F, 10F, -5F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox1
		defaultScopeModel[30].setRotationPoint(16.5F, -55.5F, 6.5F);

		defaultScopeModel[31].addShapeBox(11F, 10F, -5F, 4, 1, 1, 0F,0F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import ImportImportBox1
		defaultScopeModel[31].setRotationPoint(16.5F, -56F, 2.5F);

		defaultScopeModel[32].addShapeBox(11F, 10F, -5F, 4, 1, 1, 0F,0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox1
		defaultScopeModel[32].setRotationPoint(16.5F, -57F, 2F);

		defaultScopeModel[33].addShapeBox(11F, 10F, -5F, 4, 1, 1, 0F,-0.75F, 0.25F, -0.6F, -0.75F, 0.25F, -0.6F, -0.75F, 0.5F, 0.5F, -0.75F, 0.5F, 0.5F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[33].setRotationPoint(16.5F, -57.75F, 2.5F);

		defaultScopeModel[34].addShapeBox(11F, 10F, -5F, 4, 1, 1, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[34].setRotationPoint(16.5F, -55.5F, 2.5F);

		defaultScopeModel[35].addShapeBox(11F, 10F, -5F, 4, 1, 1, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Import ImportImportBox1
		defaultScopeModel[35].setRotationPoint(16.5F, -55F, 3F);

		defaultScopeModel[36].addShapeBox(11F, 10F, -5F, 5, 2, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[36].setRotationPoint(16F, -50.5F, 7F);

		defaultScopeModel[37].addShapeBox(11F, 10F, -5F, 5, 1, 2, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[37].setRotationPoint(16F, -51.5F, 7F);

		defaultScopeModel[38].addShapeBox(11F, 10F, -5F, 5, 1, 2, 0F,-1.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[38].setRotationPoint(16F, -52.5F, 7F);

		defaultScopeModel[39].addShapeBox(11F, 10F, -5F, 1, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[39].setRotationPoint(18.25F, -55F, 4F);

		defaultScopeModel[40].addShapeBox(11F, 10F, -5F, 1, 1, 2, 0F,-0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F); // Import ImportImportBox1
		defaultScopeModel[40].setRotationPoint(17.75F, -55F, 4F);

		defaultScopeModel[41].addShapeBox(11F, 10F, -5F, 1, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[41].setRotationPoint(18.75F, -55F, 4F);

		defaultScopeModel[42].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,-0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Import ImportImportBox1
		defaultScopeModel[42].setRotationPoint(18.25F, -56F, 4.5F);

		defaultScopeModel[43].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[43].setRotationPoint(18.25F, -57F, 4.5F);

		defaultScopeModel[44].addShapeBox(11F, 10F, -5F, 9, 1, 2, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import ImportImportBox1
		defaultScopeModel[44].setRotationPoint(16F, -47F, 1F);

		defaultScopeModel[45].addShapeBox(11F, 10F, -5F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[45].setRotationPoint(-19.5F, -49.5F, 1F);

		defaultScopeModel[46].addShapeBox(11F, 10F, -5F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportImportBox1
		defaultScopeModel[46].setRotationPoint(-19F, -49.5F, 1F);

		defaultScopeModel[47].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[47].setRotationPoint(-18.5F, -48.5F, 1F);

		defaultScopeModel[48].addShapeBox(11F, 10F, -5F, 3, 5, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportImportBox1
		defaultScopeModel[48].setRotationPoint(-17F, -52F, 1.5F);

		defaultScopeModel[49].addShapeBox(11F, 10F, -5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import ImportImportBox1
		defaultScopeModel[49].setRotationPoint(-18F, -52F, 1.5F);

		defaultScopeModel[50].addShapeBox(11F, 10F, -5F, 1, 5, 1, 0F,0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.25F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import ImportImportBox1
		defaultScopeModel[50].setRotationPoint(-19F, -52F, 1.5F);

		defaultScopeModel[51].addShapeBox(11F, 10F, -5F, 1, 2, 1, 0F,-0.5F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F); // Import ImportImportBox1
		defaultScopeModel[51].setRotationPoint(-20F, -51F, 1.5F);

		defaultScopeModel[52].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[52].setRotationPoint(-15.5F, -48.5F, 1F);

		defaultScopeModel[53].addShapeBox(11F, 10F, -5F, 1, 2, 2, 0F,-0.5F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import ImportImportBox1
		defaultScopeModel[53].setRotationPoint(-15F, -49.5F, 1F);

		defaultScopeModel[54].addShapeBox(11F, 10F, -5F, 4, 1, 8, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[54].setRotationPoint(-14F, -48.5F, 1F);

		defaultScopeModel[55].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,-0.5F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[55].setRotationPoint(-16.5F, -48.5F, 1F);

		defaultScopeModel[56].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[56].setRotationPoint(-17.5F, -48.5F, 1F);

		defaultScopeModel[57].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 1.75F, 0.25F, -0.5F, 1.75F, 0.25F, -0.5F, 1.75F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Import ImportImportBox1
		defaultScopeModel[57].setRotationPoint(-17F, -52F, 0.5F);

		defaultScopeModel[58].addShapeBox(11F, 10F, -5F, 4, 1, 1, 0F,0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportImportBox1
		defaultScopeModel[58].setRotationPoint(-18.5F, -50.5F, 0.5F);

		defaultScopeModel[59].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,1.75F, 0.25F, -0.5F, 1.75F, 0.25F, -0.5F, 1.75F, 0.25F, 0F, 1.75F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportImportBox1
		defaultScopeModel[59].setRotationPoint(-17F, -49F, 0.5F);

		defaultScopeModel[60].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.75F, 0.25F, 0F, 1.75F, 0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportImportBox1
		defaultScopeModel[60].setRotationPoint(-17F, -49F, 0F);

		defaultScopeModel[61].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.75F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Import ImportImportBox1
		defaultScopeModel[61].setRotationPoint(-17F, -52F, 0F);

		defaultScopeModel[62].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.75F, 0.25F, 0F, 1.75F, 0.25F, 0F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, -0.5F, 1.75F, 0.25F, 0F, 1.75F, 0.25F, 0F); // Import ImportImportBox1
		defaultScopeModel[62].setRotationPoint(-17F, -50.5F, 0F);

		defaultScopeModel[63].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[63].setRotationPoint(-13.5F, -48F, 0.25F);

		defaultScopeModel[64].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[64].setRotationPoint(-13.5F, -50F, 0.25F);

		defaultScopeModel[65].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[65].setRotationPoint(-13.5F, -49F, 0.25F);

		defaultScopeModel[66].addShapeBox(11F, 10F, -5F, 4, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Import ImportImportBox1
		defaultScopeModel[66].setRotationPoint(-14F, -47F, 7F);

		defaultScopeModel[67].addShapeBox(11F, 10F, -5F, 4, 1, 5, 0F,0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[67].setRotationPoint(-18.5F, -50F, 2.5F);

		defaultScopeModel[68].addShapeBox(11F, 10F, -5F, 4, 1, 5, 0F,0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[68].setRotationPoint(-18.5F, -49.5F, 2.5F);

		defaultScopeModel[69].addShapeBox(11F, 10F, -5F, 4, 1, 5, 0F,0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[69].setRotationPoint(-18.5F, -51F, 2.5F);

		defaultScopeModel[70].addShapeBox(11F, 10F, -5F, 4, 1, 4, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox1
		defaultScopeModel[70].setRotationPoint(-18.5F, -52F, 3F);

		defaultScopeModel[71].addShapeBox(11F, 10F, -5F, 5, 2, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[71].setRotationPoint(-19F, -50.5F, 7F);

		defaultScopeModel[72].addShapeBox(11F, 10F, -5F, 5, 1, 2, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[72].setRotationPoint(-19F, -51.5F, 7F);

		defaultScopeModel[73].addShapeBox(11F, 10F, -5F, 5, 1, 2, 0F,-1.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[73].setRotationPoint(-19F, -52.5F, 7F);

		defaultScopeModel[74].addShapeBox(11F, 10F, -5F, 9, 1, 2, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Import ImportImportBox1
		defaultScopeModel[74].setRotationPoint(-19F, -47F, 1F);

		defaultScopeModel[75].addShapeBox(11F, 10F, -5F, 4, 1, 1, 0F,0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox1
		defaultScopeModel[75].setRotationPoint(-18.5F, -54.5F, 1.75F);

		defaultScopeModel[76].addShapeBox(11F, 10F, -5F, 3, 2, 1, 0F,0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F); // Import ImportImportBox1
		defaultScopeModel[76].setRotationPoint(-17.5F, -56.5F, 1.75F);

		defaultScopeModel[77].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, 0F); // Import ImportImportBox1
		defaultScopeModel[77].setRotationPoint(-18.5F, -57.5F, 1.75F);

		defaultScopeModel[78].addShapeBox(11F, 10F, -5F, 4, 1, 1, 0F,0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox1
		defaultScopeModel[78].setRotationPoint(-18.5F, -54.5F, 7.25F);

		defaultScopeModel[79].addShapeBox(11F, 10F, -5F, 4, 1, 1, 0F,0F, 1F, 0.25F, 0.5F, 1F, 0.25F, 0.5F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, 1F, 0F, -0.5F, 1F); // Import ImportImportBox1
		defaultScopeModel[79].setRotationPoint(-18.5F, -53F, 2F);

		defaultScopeModel[80].addShapeBox(11F, 10F, -5F, 4, 1, 1, 0F,0F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.5F, 1F, 0.5F, -0.5F, 1F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F); // Import ImportImportBox1
		defaultScopeModel[80].setRotationPoint(-18.5F, -53F, 7F);

		defaultScopeModel[81].addShapeBox(11F, 10F, -5F, 3, 2, 1, 0F,0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F); // Import ImportImportBox1
		defaultScopeModel[81].setRotationPoint(-17.5F, -56.5F, 7.25F);

		defaultScopeModel[82].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, 0F); // Import ImportImportBox1
		defaultScopeModel[82].setRotationPoint(-18.5F, -57.5F, 7.25F);

		defaultScopeModel[83].addShapeBox(11F, 10F, -5F, 1, 2, 1, 0F,0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0.5F, -1F, 0F); // Import ImportImportBox1
		defaultScopeModel[83].setRotationPoint(-18F, -56.5F, 7.25F);

		defaultScopeModel[84].addShapeBox(11F, 10F, -5F, 1, 1, 5, 0F,-0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F, -0.5F); // Import ImportImportBox1
		defaultScopeModel[84].setRotationPoint(-17F, -55.15F, 2.75F);

		defaultScopeModel[85].addShapeBox(11F, 10F, -5F, 1, 1, 3, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, 0F, -0.15F, 0.15F, -0.5F, -0.15F, 0.15F, -0.5F); // Import ImportImportBox1
		defaultScopeModel[85].setRotationPoint(-17F, -56.15F, 3.75F);

		defaultScopeModel[86].addShapeBox(11F, 10F, -5F, 1, 1, 3, 0F,-0.15F, -0.5F, -0.25F, -0.15F, -0.5F, -0.25F, -0.15F, -0.5F, -0.75F, -0.15F, -0.5F, -0.75F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F); // Import ImportImportBox1
		defaultScopeModel[86].setRotationPoint(-17F, -58.15F, 3.75F);

		defaultScopeModel[87].addShapeBox(11F, 10F, -5F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import ImportImportBox1
		defaultScopeModel[87].setRotationPoint(-17.85F, -55.15F, 3.75F);

		defaultScopeModel[88].addShapeBox(11F, 10F, -5F, 4, 1, 2, 0F,0F, 0.5F, -0.15F, 0.5F, 0.5F, -0.15F, 0.5F, 0.5F, 1.85F, 0F, 0.5F, 1.85F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, 1F, 0F, -0.5F, 1F); // Import ImportImportBox1
		defaultScopeModel[88].setRotationPoint(-18.5F, -53F, 3F);

		defaultScopeModel[89].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import ImportImportBox1
		defaultScopeModel[89].setRotationPoint(-18F, -56F, 8.25F);

		defaultScopeModel[90].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F); // Import ImportImportBox1
		defaultScopeModel[90].setRotationPoint(-18F, -55F, 8.25F);

		defaultScopeModel[91].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import ImportImportBox1
		defaultScopeModel[91].setRotationPoint(-18F, -57F, 8.25F);

		defaultScopeModel[92].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import ImportImportBox1
		defaultScopeModel[92].setRotationPoint(-18F, -56F, 1.5F);

		defaultScopeModel[93].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F); // Import ImportImportBox1
		defaultScopeModel[93].setRotationPoint(-18F, -55F, 1.5F);

		defaultScopeModel[94].addShapeBox(11F, 10F, -5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import ImportImportBox1
		defaultScopeModel[94].setRotationPoint(-18F, -57F, 1.5F);

		defaultScopeModel[95].addShapeBox(11F, 10F, -5F, 4, 1, 4, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox1
		defaultScopeModel[95].setRotationPoint(-18.5F, -32F, 4F);

		defaultScopeModel[96].addShapeBox(11F, 10F, -5F, 4, 1, 4, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Import ImportImportBox1
		defaultScopeModel[96].setRotationPoint(-53.5F, -31F, 4F);

		defaultScopeModel[97].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox1
		defaultScopeModel[97].setRotationPoint(-3F, -41F, -4F);

		defaultScopeModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F); // Import ImportImportBox1
		defaultScopeModel[98].setRotationPoint(-6F, -47.15F, -1.25F);

		defaultScopeModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.25F, 0.25F, -0.15F, -0.25F, 0.25F, -0.15F, -0.25F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.25F, 0.25F, -0.15F, -0.25F, 0.25F, -0.15F, -0.25F, -0.5F, -0.15F, -0.25F, -0.5F); // Import ImportImportBox1
		defaultScopeModel[99].setRotationPoint(-6F, -47.15F, 0.75F);

		defaultScopeModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.15F, -0.75F, 0F, -0.15F, -0.75F, 0F, -0.15F, -0.75F, -1.25F, -0.15F, -0.75F, -1.25F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -1F, -0.15F, 0F, -1F); // Import ImportImportBox1
		defaultScopeModel[100].setRotationPoint(-6F, -47.15F, -1.25F);

		defaultScopeModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -1F, -0.15F, 0F, -1F, -0.15F, -0.75F, 0F, -0.15F, -0.75F, 0F, -0.15F, -0.75F, -1.25F, -0.15F, -0.75F, -1.25F); // Import Box581
		defaultScopeModel[101].setRotationPoint(-6F, -47.15F, -1.25F);

		defaultScopeModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.15F, 0F, -1F, -0.15F, 0F, -1F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.75F, -1.25F, -0.15F, -0.75F, -1.25F, -0.15F, -0.75F, 0F, -0.15F, -0.75F, 0F); // Import Box582
		defaultScopeModel[102].setRotationPoint(-6F, -47.15F, -0.75F);

		defaultScopeModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.15F, -0.75F, -1.25F, -0.15F, -0.75F, -1.25F, -0.15F, -0.75F, 0F, -0.15F, -0.75F, 0F, -0.15F, 0F, -1F, -0.15F, 0F, -1F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Import Box583
		defaultScopeModel[103].setRotationPoint(-6F, -47.15F, -0.75F);

		defaultScopeModel[104].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 0.5F, 0F, -4.5F, 0.5F, 0F, -4.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box584
		defaultScopeModel[104].setRotationPoint(32F, -41F, -4F);

		defaultScopeModel[105].addShapeBox(11F, 10F, -5F, 1, 2, 1, 0F,0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0.5F, -1F, 0F); // Import Box644
		defaultScopeModel[105].setRotationPoint(-18F, -56.5F, 1.75F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Import ImportImportBox0
		ammoModel[1] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Import ImportImportBox0
		ammoModel[2] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Import ImportImportBox0
		ammoModel[3] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Import ImportImportBox0
		ammoModel[4] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Import ImportImportBox0
		ammoModel[5] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Import ImportImportBox0
		ammoModel[6] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Import ImportImportBox0
		ammoModel[7] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Import ImportImportBox0
		ammoModel[8] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Import ImportImportBox0
		ammoModel[9] = new ModelRendererTurbo(this, 553, 129, textureX, textureY); // Import ImportImportBox0
		ammoModel[10] = new ModelRendererTurbo(this, 577, 129, textureX, textureY); // Import ImportImportBox0
		ammoModel[11] = new ModelRendererTurbo(this, 601, 129, textureX, textureY); // Import ImportImportBox0
		ammoModel[12] = new ModelRendererTurbo(this, 625, 129, textureX, textureY); // Import ImportImportBox0
		ammoModel[13] = new ModelRendererTurbo(this, 649, 129, textureX, textureY); // Import ImportImportBox0
		ammoModel[14] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Import ImportImportBox0
		ammoModel[15] = new ModelRendererTurbo(this, 697, 129, textureX, textureY); // Import ImportImportBox0
		ammoModel[16] = new ModelRendererTurbo(this, 817, 129, textureX, textureY); // Import ImportImportBox0
		ammoModel[17] = new ModelRendererTurbo(this, 849, 129, textureX, textureY); // Import ImportImportBox0
		ammoModel[18] = new ModelRendererTurbo(this, 873, 129, textureX, textureY); // Import ImportImportBox0
		ammoModel[19] = new ModelRendererTurbo(this, 889, 113, textureX, textureY); // Import ImportImportBox0
		ammoModel[20] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Import ImportImportBox0
		ammoModel[21] = new ModelRendererTurbo(this, 889, 129, textureX, textureY); // Import ImportImportBox0
		ammoModel[22] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Import ImportImportBox0
		ammoModel[23] = new ModelRendererTurbo(this, 921, 129, textureX, textureY); // Import ImportImportBox0
		ammoModel[24] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Import ImportImportBox0
		ammoModel[25] = new ModelRendererTurbo(this, 985, 129, textureX, textureY); // Import ImportImportBox0
		ammoModel[26] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import ImportImportBox0
		ammoModel[27] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Import ImportImportBox0
		ammoModel[28] = new ModelRendererTurbo(this, 905, 41, textureX, textureY); // Import ImportImportBox0
		ammoModel[29] = new ModelRendererTurbo(this, 673, 49, textureX, textureY); // Import ImportImportBox0
		ammoModel[30] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Import ImportImportBox0
		ammoModel[31] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import ImportImportBox0
		ammoModel[32] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Import ImportImportBox0
		ammoModel[33] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // Import ImportImportBox0
		ammoModel[34] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Import ImportImportBox0
		ammoModel[35] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Import ImportImportBox0
		ammoModel[36] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Import ImportImportBox0
		ammoModel[37] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Import ImportImportBox0
		ammoModel[38] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Import ImportImportBox0
		ammoModel[39] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Import ImportImportBox0
		ammoModel[40] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Import ImportImportBox0
		ammoModel[41] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Import ImportImportBox0
		ammoModel[42] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Import ImportImportBox0
		ammoModel[43] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import ImportImportBox0
		ammoModel[44] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import ImportImportBox0
		ammoModel[45] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Import ImportImportBox0
		ammoModel[46] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Import ImportImportBox0
		ammoModel[47] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import ImportImportBox0
		ammoModel[48] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Import ImportImportBox0
		ammoModel[49] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Import ImportImportBox0
		ammoModel[50] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Import ImportImportBox0
		ammoModel[51] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import ImportImportBox0
		ammoModel[52] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Import ImportImportBox416
		ammoModel[53] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Import ImportImportBox417
		ammoModel[54] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Import ImportImportBox418
		ammoModel[55] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Import ImportImportBox419
		ammoModel[56] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Import ImportImportBox420
		ammoModel[57] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Import ImportImportBox421
		ammoModel[58] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Import ImportImportBox422
		ammoModel[59] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Import ImportImportBox423
		ammoModel[60] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Import ImportImportBox424
		ammoModel[61] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import ImportImportBox425
		ammoModel[62] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Import ImportImportBox426
		ammoModel[63] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Import ImportImportBox427
		ammoModel[64] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Import ImportImportBox428
		ammoModel[65] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Import ImportImportBox429
		ammoModel[66] = new ModelRendererTurbo(this, 1017, 121, textureX, textureY); // Import ImportImportBox430
		ammoModel[67] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Import ImportImportBox431
		ammoModel[68] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Import ImportImportBox432
		ammoModel[69] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Import ImportImportBox433
		ammoModel[70] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Import ImportImportBox434
		ammoModel[71] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Import ImportImportBox435
		ammoModel[72] = new ModelRendererTurbo(this, 713, 73, textureX, textureY); // Import ImportImportBox436
		ammoModel[73] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Import ImportImportBox437
		ammoModel[74] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Import ImportImportBox438
		ammoModel[75] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Import ImportImportBox439
		ammoModel[76] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import ImportImportBox440
		ammoModel[77] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import ImportImportBox441
		ammoModel[78] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import ImportImportBox442
		ammoModel[79] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import ImportImportBox443
		ammoModel[80] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import ImportImportBox444
		ammoModel[81] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import ImportImportBox445
		ammoModel[82] = new ModelRendererTurbo(this, 729, 137, textureX, textureY); // Import ImportImportBox446
		ammoModel[83] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Import ImportImportBox447
		ammoModel[84] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import ImportImportBox448

		ammoModel[0].addShapeBox(11F, 10F, -5F, 6, 5, 8, 0F,0.75F, 0F, 0F, -1.75F, 0F, -1F, -1.75F, 0F, -1F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F); // Import ImportImportBox0
		ammoModel[0].setRotationPoint(-42.5F, -13F, 1F);

		ammoModel[1].addShapeBox(11F, 10F, -5F, 5, 9, 8, 0F,2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, 0.75F, 0F, 0F); // Import ImportImportBox0
		ammoModel[1].setRotationPoint(-42.5F, -22F, 1F);

		ammoModel[2].addShapeBox(11F, 10F, -5F, 6, 8, 8, 0F,0.5F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, 0.5F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, -2F, 0F, 0F); // Import ImportImportBox0
		ammoModel[2].setRotationPoint(-41.5F, -8F, 1F);

		ammoModel[3].addShapeBox(11F, 10F, -5F, 6, 6, 8, 0F,0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, -1F, -1F, 1F, -1F, -1F, -2.5F, 0F, 0F); // Import ImportImportBox0
		ammoModel[3].setRotationPoint(-39.5F, 0F, 1F);

		ammoModel[4].addShapeBox(11F, 10F, -5F, 13, 9, 8, 0F,2.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 2.5F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F); // Import ImportImportBox0
		ammoModel[4].setRotationPoint(-56F, -22F, 1F);

		ammoModel[5].addShapeBox(11F, 10F, -5F, 14, 5, 8, 0F,0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportImportBox0
		ammoModel[5].setRotationPoint(-56F, -13F, 1F);

		ammoModel[6].addShapeBox(11F, 10F, -5F, 14, 8, 8, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.25F, 0F, 0F); // Import ImportImportBox0
		ammoModel[6].setRotationPoint(-55F, -8F, 1F);

		ammoModel[7].addShapeBox(11F, 10F, -5F, 14, 6, 8, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -1.75F, 0F, 0F); // Import ImportImportBox0
		ammoModel[7].setRotationPoint(-53.5F, 0F, 1F);

		ammoModel[8].addShapeBox(11F, 10F, -5F, 1, 9, 6, 0F,2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.5F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F); // Import ImportImportBox0
		ammoModel[8].setRotationPoint(-57.5F, -22F, 2F);

		ammoModel[9].addShapeBox(11F, 10F, -5F, 2, 5, 6, 0F,0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportImportBox0
		ammoModel[9].setRotationPoint(-57.5F, -13F, 2F);

		ammoModel[10].addShapeBox(11F, 10F, -5F, 2, 8, 6, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Import ImportImportBox0
		ammoModel[10].setRotationPoint(-56.75F, -8F, 2F);

		ammoModel[11].addShapeBox(11F, 10F, -5F, 2, 6, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -2.25F, 0F, 0F); // Import ImportImportBox0
		ammoModel[11].setRotationPoint(-55.5F, 0F, 2F);

		ammoModel[12].addShapeBox(11F, 10F, -5F, 2, 6, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Import ImportImportBox0
		ammoModel[12].setRotationPoint(-53.5F, 6F, 2F);

		ammoModel[13].addShapeBox(11F, 10F, -5F, 15, 6, 8, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2.5F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -2.5F, 0F, 0F); // Import ImportImportBox0
		ammoModel[13].setRotationPoint(-52F, 6F, 1F);

		ammoModel[14].addShapeBox(11F, 10F, -5F, 12, 6, 8, 0F,0F, -3F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0F, -3F, 0.25F, -1.5F, 0F, 0.25F, 0.5F, -4.5F, 0.25F, 0.5F, -4.5F, 0.25F, -1.5F, 0F, 0.25F); // Import ImportImportBox0
		ammoModel[14].setRotationPoint(-49.5F, 9F, 1F);

		ammoModel[15].addShapeBox(11F, 10F, -5F, 4, 2, 8, 0F,0F, 0F, 0F, 0.5F, 1F, -1F, 0.5F, 1F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -2.5F, -1F, 1F, -2.5F, -1F, 0F, -0.5F, 0F); // Import ImportImportBox0
		ammoModel[15].setRotationPoint(-37F, 6F, 1F);

		ammoModel[16].addShapeBox(11F, 10F, -5F, 4, 3, 8, 0F,0F, 0.5F, 0.25F, 1F, 2.5F, -0.25F, 1F, 2.5F, -0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 1F, -2.75F, -0.25F, 1F, -2.75F, -0.25F, 0F, -0.5F, 0.25F); // Import ImportImportBox0
		ammoModel[16].setRotationPoint(-37F, 8F, 1F);

		ammoModel[17].addShapeBox(11F, 10F, -5F, 2, 3, 8, 0F,0F, 0F, -0.25F, -0.5F, -1F, -0.75F, -0.5F, -1F, -0.75F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F, -0.75F, 0F, -0.25F, -0.25F); // Import ImportImportBox0
		ammoModel[17].setRotationPoint(-32F, 5.5F, 1F);

		ammoModel[18].addShapeBox(11F, 10F, -5F, 2, 3, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -1F, 0F, 0F); // Import ImportImportBox0
		ammoModel[18].setRotationPoint(-50.5F, 12F, 1F);

		ammoModel[19].addShapeBox(11F, 10F, -5F, 14, 1, 1, 0F,0F, -0.25F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.25F, 0F); // Import ImportImportBox0
		ammoModel[19].setRotationPoint(-55F, -8F, 8.5F);

		ammoModel[20].addShapeBox(11F, 10F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F); // Import ImportImportBox0
		ammoModel[20].setRotationPoint(-41F, -11F, 8.5F);

		ammoModel[21].addShapeBox(11F, 10F, -5F, 14, 1, 1, 0F,0F, -0.25F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0.25F, 0F); // Import ImportImportBox0
		ammoModel[21].setRotationPoint(-56F, -12.5F, 8.5F);

		ammoModel[22].addShapeBox(11F, 10F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F); // Import ImportImportBox0
		ammoModel[22].setRotationPoint(-42F, -15.25F, 8.5F);

		ammoModel[23].addShapeBox(11F, 10F, -5F, 14, 1, 1, 0F,0F, -0.25F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0.25F, 0F); // Import ImportImportBox0
		ammoModel[23].setRotationPoint(-54F, -3.5F, 8.5F);

		ammoModel[24].addShapeBox(11F, 10F, -5F, 14, 1, 1, 0F,0F, -0.25F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.25F, 0F); // Import ImportImportBox0
		ammoModel[24].setRotationPoint(-53F, 1F, 8.5F);

		ammoModel[25].addShapeBox(11F, 10F, -5F, 14, 1, 1, 0F,0F, -0.75F, 0F, 0F, 4.25F, 0F, 0F, 4.25F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, 0.75F, 0F); // Import ImportImportBox0
		ammoModel[25].setRotationPoint(-51F, 5F, 8.5F);

		ammoModel[26].addShapeBox(11F, 10F, -5F, 14, 1, 1, 0F,0F, -0.75F, 0F, 0F, 4.75F, 0F, 0F, 4.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, 0.75F, 0F); // Import ImportImportBox0
		ammoModel[26].setRotationPoint(-49.5F, 9.5F, 8.5F);

		ammoModel[27].addShapeBox(11F, 10F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F); // Import ImportImportBox0
		ammoModel[27].setRotationPoint(-40F, -7F, 8.5F);

		ammoModel[28].addShapeBox(11F, 10F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.6F, 0.75F, 0F, 0.6F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0.75F, 0F, -0.6F, -0.75F, 0F, 0F, 0F); // Import ImportImportBox0
		ammoModel[28].setRotationPoint(-39F, -3F, 8.5F);

		ammoModel[29].addShapeBox(11F, 10F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0.6F, 0.75F, -0.25F, 0.6F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.6F, 0.75F, -0.25F, -0.6F, -0.75F, 0F, 0F, 0F); // Import ImportImportBox0
		ammoModel[29].setRotationPoint(-37F, 0.75F, 8.5F);

		ammoModel[30].addShapeBox(11F, 10F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0.75F, 0.75F, -0.25F, 0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0.75F, -0.25F, -0.75F, -0.75F, 0F, 0F, 0F); // Import ImportImportBox0
		ammoModel[30].setRotationPoint(-35.5F, 4.75F, 8.5F);

		ammoModel[31].addShapeBox(11F, 10F, -5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F); // Import ImportImportBox0
		ammoModel[31].setRotationPoint(-52.5F, -16.5F, 8.45F);

		ammoModel[32].addShapeBox(11F, 10F, -5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F); // Import ImportImportBox0
		ammoModel[32].setRotationPoint(-51.25F, -9.5F, 8.45F);

		ammoModel[33].addShapeBox(11F, 10F, -5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0.25F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3.25F, 0.25F, 0F); // Import ImportImportBox0
		ammoModel[33].setRotationPoint(-48.75F, -0.5F, 8.45F);

		ammoModel[34].addShapeBox(11F, 10F, -5F, 1, 8, 1, 0F,0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.25F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F); // Import ImportImportBox0
		ammoModel[34].setRotationPoint(-48F, -17.5F, 8.45F);

		ammoModel[35].addShapeBox(11F, 10F, -5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F); // Import ImportImportBox0
		ammoModel[35].setRotationPoint(-46.75F, -9.5F, 8.45F);

		ammoModel[36].addShapeBox(11F, 10F, -5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0.75F, 0F, 2.75F, 0.5F, 0F, 2.75F, 0.5F, 0F, -2.75F, 0.75F, 0F); // Import ImportImportBox0
		ammoModel[36].setRotationPoint(-44.25F, -0.5F, 8.45F);

		ammoModel[37].addShapeBox(11F, 10F, -5F, 1, 8, 1, 0F,0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Import ImportImportBox0
		ammoModel[37].setRotationPoint(-43.5F, -17.5F, 8.45F);

		ammoModel[38].addShapeBox(11F, 10F, -5F, 1, 9, 1, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.75F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -2.75F, 0F, 0F); // Import ImportImportBox0
		ammoModel[38].setRotationPoint(-42.25F, -9.5F, 8.45F);

		ammoModel[39].addShapeBox(11F, 10F, -5F, 1, 6, 1, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.75F, 0.5F, 0F, 2.75F, 0.25F, 0F, 2.75F, 0.25F, 0F, -2.75F, 0.5F, 0F); // Import ImportImportBox0
		ammoModel[39].setRotationPoint(-39.75F, -0.5F, 8.45F);

		ammoModel[40].addShapeBox(11F, 10F, -5F, 1, 9, 1, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportBox0
		ammoModel[40].setRotationPoint(-55.25F, -9.5F, 8.45F);

		ammoModel[41].addShapeBox(11F, 10F, -5F, 1, 6, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F); // Import ImportImportBox0
		ammoModel[41].setRotationPoint(-57.25F, -15.5F, 8.45F);

		ammoModel[42].addShapeBox(11F, 10F, -5F, 1, 11, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.25F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, -3.25F, 0F, 0F); // Import ImportImportBox0
		ammoModel[42].setRotationPoint(-52.75F, -0.5F, 8.45F);

		ammoModel[43].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0.5F, 0.15F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.15F, -1F, 0.5F, -0.15F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.15F, -1F); // Import ImportImportBox0
		ammoModel[43].setRotationPoint(-57F, -11.75F, 8.5F);

		ammoModel[44].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0.5F, 0.15F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.15F, -1F, 0.5F, -0.15F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.15F, -1F); // Import ImportImportBox0
		ammoModel[44].setRotationPoint(-56F, -7.25F, 8.5F);

		ammoModel[45].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0.5F, 0.15F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.15F, -1F, 0.5F, -0.15F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.15F, -1F); // Import ImportImportBox0
		ammoModel[45].setRotationPoint(-55F, -2.75F, 8.5F);

		ammoModel[46].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0F, 0.15F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.15F, -1F, 0F, -0.15F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -1F); // Import ImportImportBox0
		ammoModel[46].setRotationPoint(-54F, 1.75F, 8.5F);

		ammoModel[47].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0.5F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -1F); // Import ImportImportBox0
		ammoModel[47].setRotationPoint(-52F, 6.25F, 8.5F);

		ammoModel[48].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0.5F, -0.1F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.1F, -1F, 0.5F, 0.1F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.1F, -1F); // Import ImportImportBox0
		ammoModel[48].setRotationPoint(-50.5F, 10.75F, 8.5F);

		ammoModel[49].addShapeBox(11F, 10F, -5F, 15, 1, 1, 0F,0F, -0.25F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.25F, 0F); // Import ImportImportBox0
		ammoModel[49].setRotationPoint(-57F, -16F, 8.5F);

		ammoModel[50].addShapeBox(11F, 10F, -5F, 2, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.65F, 0.75F, 0F, 0.65F, -0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.65F, 0.75F, 0F, -0.65F, -0.75F, 0F, -0.25F, 0F); // Import ImportImportBox0
		ammoModel[50].setRotationPoint(-42F, -18.25F, 8.5F);

		ammoModel[51].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0.5F, 0.15F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.15F, -1F, 0.5F, -0.15F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.15F, -1F); // Import ImportImportBox0
		ammoModel[51].setRotationPoint(-58F, -15.25F, 8.5F);

		ammoModel[52].addShapeBox(11F, 10F, -5F, 14, 1, 1, 0F,0F, -0.25F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.25F, 0F); // Import ImportImportBox416
		ammoModel[52].setRotationPoint(-55F, -8F, 0.5F);

		ammoModel[53].addShapeBox(11F, 10F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0F); // Import ImportImportBox417
		ammoModel[53].setRotationPoint(-41F, -11F, 0.5F);

		ammoModel[54].addShapeBox(11F, 10F, -5F, 14, 1, 1, 0F,0F, -0.25F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0.25F, 0F); // Import ImportImportBox418
		ammoModel[54].setRotationPoint(-56F, -12.5F, 0.5F);

		ammoModel[55].addShapeBox(11F, 10F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0F); // Import ImportImportBox419
		ammoModel[55].setRotationPoint(-42F, -15.25F, 0.5F);

		ammoModel[56].addShapeBox(11F, 10F, -5F, 14, 1, 1, 0F,0F, -0.25F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0.25F, 0F); // Import ImportImportBox420
		ammoModel[56].setRotationPoint(-54F, -3.5F, 0.5F);

		ammoModel[57].addShapeBox(11F, 10F, -5F, 14, 1, 1, 0F,0F, -0.25F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.25F, 0F); // Import ImportImportBox421
		ammoModel[57].setRotationPoint(-53F, 1F, 0.5F);

		ammoModel[58].addShapeBox(11F, 10F, -5F, 14, 1, 1, 0F,0F, -0.75F, 0F, 0F, 4.25F, 0F, 0F, 4.25F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, 0.75F, 0F); // Import ImportImportBox422
		ammoModel[58].setRotationPoint(-51F, 5F, 0.5F);

		ammoModel[59].addShapeBox(11F, 10F, -5F, 14, 1, 1, 0F,0F, -0.75F, 0F, 0F, 4.75F, 0F, 0F, 4.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, 0.75F, 0F); // Import ImportImportBox423
		ammoModel[59].setRotationPoint(-49.5F, 9.5F, 0.5F);

		ammoModel[60].addShapeBox(11F, 10F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0F); // Import ImportImportBox424
		ammoModel[60].setRotationPoint(-40F, -7F, 0.5F);

		ammoModel[61].addShapeBox(11F, 10F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.6F, -0.75F, 0F, 0.6F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.75F, 0F, -0.6F, 0.75F, 0F, 0F, 0F); // Import ImportImportBox425
		ammoModel[61].setRotationPoint(-39F, -3F, 0.5F);

		ammoModel[62].addShapeBox(11F, 10F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0.6F, -0.75F, -0.25F, 0.6F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.6F, -0.75F, -0.25F, -0.6F, 0.75F, 0F, 0F, 0F); // Import ImportImportBox426
		ammoModel[62].setRotationPoint(-37F, 0.75F, 0.5F);

		ammoModel[63].addShapeBox(11F, 10F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0.75F, 0F, 0F, 0F); // Import ImportImportBox427
		ammoModel[63].setRotationPoint(-35.5F, 4.75F, 0.5F);

		ammoModel[64].addShapeBox(11F, 10F, -5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F); // Import ImportImportBox428
		ammoModel[64].setRotationPoint(-52.5F, -16.5F, 0.550000000000001F);

		ammoModel[65].addShapeBox(11F, 10F, -5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F); // Import ImportImportBox429
		ammoModel[65].setRotationPoint(-51.25F, -9.5F, 0.550000000000001F);

		ammoModel[66].addShapeBox(11F, 10F, -5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0.25F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3.25F, 0.25F, 0F); // Import ImportImportBox430
		ammoModel[66].setRotationPoint(-48.75F, -0.5F, 0.550000000000001F);

		ammoModel[67].addShapeBox(11F, 10F, -5F, 1, 8, 1, 0F,0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.25F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F); // Import ImportImportBox431
		ammoModel[67].setRotationPoint(-48F, -17.5F, 0.550000000000001F);

		ammoModel[68].addShapeBox(11F, 10F, -5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F); // Import ImportImportBox432
		ammoModel[68].setRotationPoint(-46.75F, -9.5F, 0.550000000000001F);

		ammoModel[69].addShapeBox(11F, 10F, -5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0.75F, 0F, 2.75F, 0.5F, 0F, 2.75F, 0.5F, 0F, -2.75F, 0.75F, 0F); // Import ImportImportBox433
		ammoModel[69].setRotationPoint(-44.25F, -0.5F, 0.550000000000001F);

		ammoModel[70].addShapeBox(11F, 10F, -5F, 1, 8, 1, 0F,0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Import ImportImportBox434
		ammoModel[70].setRotationPoint(-43.5F, -17.5F, 0.550000000000001F);

		ammoModel[71].addShapeBox(11F, 10F, -5F, 1, 9, 1, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.75F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -2.75F, 0F, 0F); // Import ImportImportBox435
		ammoModel[71].setRotationPoint(-42.25F, -9.5F, 0.550000000000001F);

		ammoModel[72].addShapeBox(11F, 10F, -5F, 1, 6, 1, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.75F, 0.5F, 0F, 2.75F, 0.25F, 0F, 2.75F, 0.25F, 0F, -2.75F, 0.5F, 0F); // Import ImportImportBox436
		ammoModel[72].setRotationPoint(-39.75F, -0.5F, 0.550000000000001F);

		ammoModel[73].addShapeBox(11F, 10F, -5F, 1, 9, 1, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Import ImportImportBox437
		ammoModel[73].setRotationPoint(-55.25F, -9.5F, 0.550000000000001F);

		ammoModel[74].addShapeBox(11F, 10F, -5F, 1, 6, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, -1.75F, 0F, 0F); // Import ImportImportBox438
		ammoModel[74].setRotationPoint(-57.25F, -15.5F, 0.550000000000001F);

		ammoModel[75].addShapeBox(11F, 10F, -5F, 1, 11, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.25F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, -3.25F, 0F, 0F); // Import ImportImportBox439
		ammoModel[75].setRotationPoint(-52.75F, -0.5F, 0.550000000000001F);

		ammoModel[76].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0.5F, 0.15F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.15F, 1F, 0.5F, -0.15F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.15F, 1F); // Import ImportImportBox440
		ammoModel[76].setRotationPoint(-57F, -11.75F, 0.5F);

		ammoModel[77].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0.5F, 0.15F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.15F, 1F, 0.5F, -0.15F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.15F, 1F); // Import ImportImportBox441
		ammoModel[77].setRotationPoint(-56F, -7.25F, 0.5F);

		ammoModel[78].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0.5F, 0.15F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.15F, 1F, 0.5F, -0.15F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.15F, 1F); // Import ImportImportBox442
		ammoModel[78].setRotationPoint(-55F, -2.75F, 0.5F);

		ammoModel[79].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0F, 0.15F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.15F, 1F, 0F, -0.15F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, 1F); // Import ImportImportBox443
		ammoModel[79].setRotationPoint(-54F, 1.75F, 0.5F);

		ammoModel[80].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0.5F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 1F); // Import ImportImportBox444
		ammoModel[80].setRotationPoint(-52F, 6.25F, 0.5F);

		ammoModel[81].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0.5F, -0.1F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.1F, 1F, 0.5F, 0.1F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.1F, 1F); // Import ImportImportBox445
		ammoModel[81].setRotationPoint(-50.5F, 10.75F, 0.5F);

		ammoModel[82].addShapeBox(11F, 10F, -5F, 15, 1, 1, 0F,0F, -0.25F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.25F, 0F); // Import ImportImportBox446
		ammoModel[82].setRotationPoint(-57F, -16F, 0.5F);

		ammoModel[83].addShapeBox(11F, 10F, -5F, 2, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.65F, -0.75F, 0F, 0.65F, 0.75F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.65F, -0.75F, 0F, -0.65F, 0.75F, 0F, -0.25F, 0F); // Import ImportImportBox447
		ammoModel[83].setRotationPoint(-42F, -18.25F, 0.5F);

		ammoModel[84].addShapeBox(11F, 10F, -5F, 1, 1, 1, 0F,0.5F, 0.15F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.15F, 1F, 0.5F, -0.15F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.15F, 1F); // Import ImportImportBox448
		ammoModel[84].setRotationPoint(-58F, -15.25F, 0.5F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Import ImportImportBox0
		slideModel[1] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Import ImportImportBox0
		slideModel[2] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Import ImportImportBox0
		slideModel[3] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Import ImportImportBox0
		slideModel[4] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Import ImportImportBox0
		slideModel[5] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Import ImportImportBox0
		slideModel[6] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import ImportBox0
		slideModel[7] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import ImportBox0
		slideModel[8] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Import ImportBox0
		slideModel[9] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Import ImportBox0

		slideModel[0].addShapeBox(11F, 10F, -5F, 6, 6, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportImportBox0
		slideModel[0].setRotationPoint(28F, -34.35F, 17.5F);
		slideModel[0].rotateAngleX = -0.62831853F;
		slideModel[0].rotateAngleZ = 0.01745329F;

		slideModel[1].addShapeBox(11F, 10F, -5F, 5, 2, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.5F, -0.25F, 0F, 1.25F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 1.25F, -0.25F); // Import ImportImportBox0
		slideModel[1].setRotationPoint(28.75F, -35.85F, 18F);
		slideModel[1].rotateAngleX = -0.62831853F;
		slideModel[1].rotateAngleZ = 0.01745329F;

		slideModel[2].addShapeBox(11F, 10F, -5F, 1, 2, 4, 0F,0F, 0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0.5F, -0.25F); // Import ImportImportBox0
		slideModel[2].setRotationPoint(33.75F, -35.95F, 18F);
		slideModel[2].rotateAngleX = -0.62831853F;
		slideModel[2].rotateAngleZ = 0.01745329F;

		slideModel[3].addShapeBox(11F, 10F, -5F, 1, 4, 4, 0F,0F, -0.75F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, 0F, -0.5F, -0.25F); // Import ImportImportBox0
		slideModel[3].setRotationPoint(26.75F, -36.25F, 18.3F);
		slideModel[3].rotateAngleX = -0.62831853F;
		slideModel[3].rotateAngleZ = 0.01745329F;

		slideModel[4].addShapeBox(11F, 10F, -5F, 1, 2, 4, 0F,0F, 0.45F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.45F, -0.25F, 0.25F, 1.4F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, -0.25F, 0.25F, 1.4F, -0.25F); // Import ImportImportBox0
		slideModel[4].setRotationPoint(27.75F, -35.85F, 18F);
		slideModel[4].rotateAngleX = -0.62831853F;
		slideModel[4].rotateAngleZ = 0.01745329F;

		slideModel[5].addShapeBox(11F, 10F, -5F, 1, 4, 3, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.5F); // Import ImportImportBox0
		slideModel[5].setRotationPoint(27F, -34.35F, 17.5F);
		slideModel[5].rotateAngleX = -0.62831853F;
		slideModel[5].rotateAngleZ = 0.01745329F;

		slideModel[6].addShapeBox(14F, 10F, -5F, 1, 2, 3, 0F,0F, 1F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportBox0
		slideModel[6].setRotationPoint(31.05F, -31.2F, 15.15F);
		slideModel[6].rotateAngleX = -0.62831853F;
		slideModel[6].rotateAngleZ = 0.01745329F;

		slideModel[7].addShapeBox(14F, 10F, -5F, 1, 2, 3, 0F,-0.25F, -0.25F, -0.25F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import ImportBox0
		slideModel[7].setRotationPoint(32.05F, -31.2F, 15.15F);
		slideModel[7].rotateAngleX = -0.62831853F;
		slideModel[7].rotateAngleZ = 0.01745329F;

		slideModel[8].addShapeBox(14F, 10F, -5F, 1, 2, 3, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import ImportBox0
		slideModel[8].setRotationPoint(24.07F, -31.1F, 15.15F);
		slideModel[8].rotateAngleX = -0.62831853F;
		slideModel[8].rotateAngleZ = 0.01745329F;

		slideModel[9].addShapeBox(14F, 10F, -5F, 1, 2, 3, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F); // Import ImportBox0
		slideModel[9].setRotationPoint(23.57F, -31.1F, 15.15F);
		slideModel[9].rotateAngleX = -0.62831853F;
		slideModel[9].rotateAngleZ = 0.01745329F;
	}
}