//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: g18
// Model Creator: 
// Created on: 30.07.2018 - 19:52:59
// Last changed on: 30.07.2018 - 19:52:59

package com.modularwarfare.client.model.test; //Path where the model is located

import org.lwjgl.util.vector.Vector3f;

//import com.flansmod.client.model.EnumAnimationType;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.client.tmt.ModelRendererTurbo;

public class glock18 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public glock18() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[190];
		defaultBarrelModel = new ModelRendererTurbo[8];
		defaultScopeModel = new ModelRendererTurbo[8];
		ammoModel = new ModelRendererTurbo[15];
		slideModel = new ModelRendererTurbo[83];

		initgunModel_1();
		initdefaultBarrelModel_1();
		initdefaultScopeModel_1();
		initammoModel_1();
		initslideModel_1();

		translateAll(-10.0F, -17.75F, -0.05F);//forward/down/right
		thirdPersonOffset = new Vector3f(0F, -.15F, 0F);//forward/up/? 


		gunSlideDistance = 0.5F;
		//animationType = EnumAnimationType.CUSTOM;
		tiltGunTime = 0.15F;
		unloadClipTime = 0.35F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.15F;
		rotateGunVertical = 20F;
		rotateGunHorizontal = 10F;
		tiltGun = 20F;
		translateGun = new Vector3f(3 /16F, 2F /16F, 1F /16F);
		rotateClipVertical = 1F;
		rotateClipHorizontal = 1F;
		tiltClip = 25F;


		translateClip = new Vector3f(-6 /16F, -20F /16F, 0F /16F);
		hasArms = true;
        
        leftArmPos = new Vector3f(-0.40F, -0.55F, -0.19F);
        leftArmRot = new Vector3f(80.0F, 35.0F, 0.0F);
        leftArmReloadPos = new Vector3f(-0.40F, -0.55F, 0.1F);
        leftArmReloadPos = new Vector3f(-0.45F, -0.55F, -0.05F);
        leftArmChargePos = new Vector3f(0.40F, 0.53F, 0.31F);
        leftArmChargeRot = new Vector3f(60.0F, 40.0F, 0.0F);
 
        rightArmPos = new Vector3f(0.13F, -0.60F, 0.00F);
        rightArmRot = new Vector3f(0.0F, 0.0F, -90.0F);
        rightArmReloadPos = new Vector3f(0.13F, -0.64F, 0.06F);
        rightArmReloadRot = new Vector3f(-0.0F, 0.0F, -100.0F);
        
        rightHandAmmo = false;
        leftHandAmmo = true;
        rightArmScale = new Vector3f(0.8F, 0.8F, 0.8F);
        leftArmScale = new Vector3f(0.8F, 0.8F, 0.8F);
		//RecoilSlideDistance = 0.1F;
		//RotateSlideDistance = -2F;

		scopeIsOnSlide = true;
		slideLockOnEmpty = true;
		
		casingAnimDistance = new Vector3f(0, 1, 12);
	    casingAnimSpread = new Vector3f(2, 2, 0);
	    casingAnimTime = 6;  
	    casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);

		crouchZoom = -0.10F;
		fancyStance = true;
		stanceRotate = new Vector3f(-5.0F, 0.0F, 40.0F);
		stanceTranslate = new Vector3f(0.4F, -0.2F, -0.1F);
		
	    chargeHandleDistance = 0.5F;
	    chargeDelay = 0;
	    chargeDelayAfterReload = 43;
	    chargeTime = 8;
	    
	    leftHandCharge = true;
	    chargeModifier = new Vector3f (8.0F, 8.0F, 20.0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 128
		gunModel[1] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 130
		gunModel[2] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 131
		gunModel[3] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 134
		gunModel[4] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 135
		gunModel[5] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 136
		gunModel[6] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 156
		gunModel[7] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 157
		gunModel[8] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 158
		gunModel[9] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 159
		gunModel[10] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 160
		gunModel[11] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Box 161
		gunModel[12] = new ModelRendererTurbo(this, 665, 9, textureX, textureY); // Box 162
		gunModel[13] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Box 163
		gunModel[14] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Box 164
		gunModel[15] = new ModelRendererTurbo(this, 721, 9, textureX, textureY); // Box 165
		gunModel[16] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Box 167
		gunModel[17] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Box 168
		gunModel[18] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Box 169
		gunModel[19] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Box 170
		gunModel[20] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 175
		gunModel[21] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 176
		gunModel[22] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Box 177
		gunModel[23] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 178
		gunModel[24] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 179
		gunModel[25] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 180
		gunModel[26] = new ModelRendererTurbo(this, 921, 9, textureX, textureY); // Box 181
		gunModel[27] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 182
		gunModel[28] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 183
		gunModel[29] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 184
		gunModel[30] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Box 185
		gunModel[31] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 186
		gunModel[32] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 187
		gunModel[33] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box 188
		gunModel[34] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 189
		gunModel[35] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 190
		gunModel[36] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Box 191
		gunModel[37] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 192
		gunModel[38] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Box 193
		gunModel[39] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 194
		gunModel[40] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 195
		gunModel[41] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 196
		gunModel[42] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 197
		gunModel[43] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 198
		gunModel[44] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 200
		gunModel[45] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 201
		gunModel[46] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); // Box 202
		gunModel[47] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Box 203
		gunModel[48] = new ModelRendererTurbo(this, 593, 25, textureX, textureY); // Box 204
		gunModel[49] = new ModelRendererTurbo(this, 665, 25, textureX, textureY); // Box 205
		gunModel[50] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 206
		gunModel[51] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Box 210
		gunModel[52] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 220
		gunModel[53] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 221
		gunModel[54] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 222
		gunModel[55] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 223
		gunModel[56] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 224
		gunModel[57] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Box 225
		gunModel[58] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 226
		gunModel[59] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 227
		gunModel[60] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 228
		gunModel[61] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 229
		gunModel[62] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 230
		gunModel[63] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 231
		gunModel[64] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 232
		gunModel[65] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 233
		gunModel[66] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 234
		gunModel[67] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 235
		gunModel[68] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Box 237
		gunModel[69] = new ModelRendererTurbo(this, 889, 9, textureX, textureY); // Box 238
		gunModel[70] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 239
		gunModel[71] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Box 240
		gunModel[72] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 241
		gunModel[73] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 243
		gunModel[74] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 244
		gunModel[75] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 245
		gunModel[76] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 246
		gunModel[77] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Box 248
		gunModel[78] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 249
		gunModel[79] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 250
		gunModel[80] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 251
		gunModel[81] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 252
		gunModel[82] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 253
		gunModel[83] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 254
		gunModel[84] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Box 255
		gunModel[85] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 256
		gunModel[86] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 257
		gunModel[87] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 258
		gunModel[88] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 259
		gunModel[89] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 236
		gunModel[90] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Box 237
		gunModel[91] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 238
		gunModel[92] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 239
		gunModel[93] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 240
		gunModel[94] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 241
		gunModel[95] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 242
		gunModel[96] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 243
		gunModel[97] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 244
		gunModel[98] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 245
		gunModel[99] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Box 246
		gunModel[100] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Box 247
		gunModel[101] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 248
		gunModel[102] = new ModelRendererTurbo(this, 705, 41, textureX, textureY); // Box 249
		gunModel[103] = new ModelRendererTurbo(this, 737, 41, textureX, textureY); // Box 250
		gunModel[104] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Box 251
		gunModel[105] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 252
		gunModel[106] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 253
		gunModel[107] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 254
		gunModel[108] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Box 255
		gunModel[109] = new ModelRendererTurbo(this, 945, 41, textureX, textureY); // Box 257
		gunModel[110] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Box 258
		gunModel[111] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 259
		gunModel[112] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 260
		gunModel[113] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 267
		gunModel[114] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 268
		gunModel[115] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 269
		gunModel[116] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 270
		gunModel[117] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Box 271
		gunModel[118] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 272
		gunModel[119] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 273
		gunModel[120] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 274
		gunModel[121] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 275
		gunModel[122] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 276
		gunModel[123] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 277
		gunModel[124] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 278
		gunModel[125] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 279
		gunModel[126] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Box 280
		gunModel[127] = new ModelRendererTurbo(this, 585, 25, textureX, textureY); // Box 286
		gunModel[128] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Box 287
		gunModel[129] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 288
		gunModel[130] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 289
		gunModel[131] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Box 290
		gunModel[132] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Box 291
		gunModel[133] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 292
		gunModel[134] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 293
		gunModel[135] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box 294
		gunModel[136] = new ModelRendererTurbo(this, 969, 25, textureX, textureY); // Box 295
		gunModel[137] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 296
		gunModel[138] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 297
		gunModel[139] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 298
		gunModel[140] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 299
		gunModel[141] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 301
		gunModel[142] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 302
		gunModel[143] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Box 318
		gunModel[144] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Box 319
		gunModel[145] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Box 344
		gunModel[146] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 345
		gunModel[147] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 346
		gunModel[148] = new ModelRendererTurbo(this, 785, 57, textureX, textureY); // Box 338
		gunModel[149] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 340
		gunModel[150] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 344
		gunModel[151] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Box 346
		gunModel[152] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 347
		gunModel[153] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Box 348
		gunModel[154] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Box 350
		gunModel[155] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Box 351
		gunModel[156] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Box 352
		gunModel[157] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 353
		gunModel[158] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 354
		gunModel[159] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 355
		gunModel[160] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 360
		gunModel[161] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 361
		gunModel[162] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 362
		gunModel[163] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 363
		gunModel[164] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 364
		gunModel[165] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Box 365
		gunModel[166] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 366
		gunModel[167] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Box 367
		gunModel[168] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 368
		gunModel[169] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 369
		gunModel[170] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 370
		gunModel[171] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 371
		gunModel[172] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 372
		gunModel[173] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 373
		gunModel[174] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 374
		gunModel[175] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 387
		gunModel[176] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 389
		gunModel[177] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 391
		gunModel[178] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 392
		gunModel[179] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 393
		gunModel[180] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 394
		gunModel[181] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 395
		gunModel[182] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 396
		gunModel[183] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 397
		gunModel[184] = new ModelRendererTurbo(this, 705, 41, textureX, textureY); // Box 398
		gunModel[185] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 399
		gunModel[186] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 400
		gunModel[187] = new ModelRendererTurbo(this, 905, 41, textureX, textureY); // Box 401
		gunModel[188] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Box 402
		gunModel[189] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 404

		gunModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 128
		gunModel[0].setRotationPoint(21.5F, -21F, -2F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 130
		gunModel[1].setRotationPoint(13.5F, -17F, -2F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -1.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 131
		gunModel[2].setRotationPoint(19.5F, -18F, -2F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.25F, -0.5F, -0.6F, -0.25F, -0.5F, -0.6F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -1.2F, -0.35F, -0.5F, -1.2F, -0.35F, -0.5F, 0F, -0.25F, -0.5F); // Box 134
		gunModel[3].setRotationPoint(20.5F, -16F, -2F);

		gunModel[4].addShapeBox(1F, 0F, 0F, 4, 1, 4, 0F,0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.6F, -0.25F, -0.5F, -0.6F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 135
		gunModel[4].setRotationPoint(19.5F, -16.5F, -2F);

		gunModel[5].addShapeBox(1F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 136
		gunModel[5].setRotationPoint(19.5F, -17F, -2F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F); // Box 156
		gunModel[6].setRotationPoint(20.5F, -23F, -2F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 157
		gunModel[7].setRotationPoint(20.5F, -23.5F, -2F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-0.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1.25F, 0F, -0.5F, -1.35F, 0F, -0.5F, -1.35F, 0F, -0.5F, -1.25F, 0F, -0.5F); // Box 158
		gunModel[8].setRotationPoint(19.5F, -24F, -2F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 36, 1, 8, 0F,0F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 159
		gunModel[9].setRotationPoint(-8F, -28.5F, -4F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 16, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F); // Box 160
		gunModel[10].setRotationPoint(-7F, -27.5F, -4F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F); // Box 161
		gunModel[11].setRotationPoint(27F, -27.5F, -4F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, -0.3F, -0.25F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, -0.5F, -0.3F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F); // Box 162
		gunModel[12].setRotationPoint(27F, -28.5F, -4F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -1F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -1F); // Box 163
		gunModel[13].setRotationPoint(20F, -24.5F, -4F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, -1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1F, 0F, -0.5F, -1.75F, -0.5F, -0.5F, -1.25F, -0.5F, -0.5F, -1.25F, 0F, -0.5F, -1.75F); // Box 164
		gunModel[14].setRotationPoint(20F, -24F, -4F);

		gunModel[15].addShapeBox(1F, 0F, 0F, 4, 1, 4, 0F,-0.9F, 0F, -0.5F, -1.05F, 0F, -0.5F, -1.05F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, -0.25F, -0.5F, -0.9F, -0.25F, -0.5F, -0.9F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 165
		gunModel[15].setRotationPoint(19.5F, -17.75F, -2F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.1F, -0.75F, -0.5F, -0.05F, -0.75F, -0.5F, -0.05F, -0.75F, -0.5F, 0.1F, -0.75F, -0.5F); // Box 167
		gunModel[16].setRotationPoint(21.5F, -19F, -2F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, -0.25F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -1.25F, -1F, -0.5F, -1.75F, -1F, -0.5F, -1.75F, -0.5F, -0.5F, -1.25F); // Box 168
		gunModel[17].setRotationPoint(27F, -24F, -4F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F); // Box 169
		gunModel[18].setRotationPoint(27F, -24.5F, -4F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		gunModel[19].setRotationPoint(-11F, -1.5F, -4F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F,0F, -0.15F, 0.1F, -0.5F, -0.15F, 0.1F, -0.5F, -0.15F, 0.1F, 0F, -0.15F, 0.1F, 0F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, -0.5F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 175
		gunModel[20].setRotationPoint(29F, -25.5F, -2.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, -0.35F, -0.9F, -0.5F, -0.35F, -0.9F, -0.5F, -0.35F, -0.9F, 0F, -0.35F, -0.9F, 0F, -0.05F, -0.3F, -0.5F, -0.05F, -0.3F, -0.5F, -0.05F, -0.3F, 0F, -0.05F, -0.3F); // Box 176
		gunModel[21].setRotationPoint(29F, -25.35F, -3.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 177
		gunModel[22].setRotationPoint(29F, -24.45F, -3.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.45F, -1.3F, 0F, -0.45F, -1.3F, 0F, -0.45F, -1.3F, 0F, -0.45F, -1.3F); // Box 178
		gunModel[23].setRotationPoint(29F, -24.1F, -3.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,-0.25F, -0.05F, -0.3F, -0.5F, -0.05F, -0.3F, -0.5F, -0.05F, -0.3F, -0.25F, -0.05F, -0.3F, -0.25F, -0.6F, -0.5F, -0.75F, -0.6F, -0.5F, -0.75F, -0.6F, -0.5F, -0.25F, -0.6F, -0.5F); // Box 179
		gunModel[24].setRotationPoint(37F, -24.45F, -3.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,-0.25F, -0.05F, -0.5F, -0.75F, -0.05F, -0.5F, -0.75F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F, -0.45F, -1.3F, -1.5F, -0.45F, -1.3F, -1.5F, -0.45F, -1.3F, -0.25F, -0.45F, -1.3F); // Box 180
		gunModel[25].setRotationPoint(37F, -24.1F, -3.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -0.05F, -0.3F, -0.75F, -0.05F, -0.3F, -0.75F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, 0F, -0.7F, -0.5F, -0.75F, -0.7F, -0.5F, -0.75F, -0.7F, -0.5F, 0F, -0.7F, -0.5F); // Box 181
		gunModel[26].setRotationPoint(36F, -24.45F, -3.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 12, 24, 8, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 182
		gunModel[27].setRotationPoint(-2F, -22.5F, -4F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 9, 7, 8, 0F,-2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		gunModel[28].setRotationPoint(-11F, -8.5F, -4F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 184
		gunModel[29].setRotationPoint(-9F, -11.5F, -4F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F,-3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 185
		gunModel[30].setRotationPoint(-7F, -16.5F, -4F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,-1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 186
		gunModel[31].setRotationPoint(-4F, -20.5F, -4F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 187
		gunModel[32].setRotationPoint(-3F, -23.5F, -4F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,-1F, -0.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -0.5F, -1F, -0.5F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -1F); // Box 188
		gunModel[33].setRotationPoint(-13F, -2.5F, -4F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 5, 7, 8, 0F,-3.5F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3.5F, 0F, -1F, -1F, -0.5F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, -0.5F, -1F); // Box 189
		gunModel[34].setRotationPoint(-13F, -8.5F, -4F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 5, 4, 8, 0F,-3.5F, -0.5F, -1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -3.5F, -0.5F, -1F, -1.5F, 0F, -1F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -1.5F, 0F, -1F); // Box 190
		gunModel[35].setRotationPoint(-11F, -12.5F, -4F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F,-2.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -2.75F, 0F, -1F, -0.5F, -0.5F, -1F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, -0.5F, -1F); // Box 191
		gunModel[36].setRotationPoint(-8F, -16.5F, -4F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,-1.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, -1F, -0.75F, 0F, -1F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, -1F); // Box 192
		gunModel[37].setRotationPoint(-6F, -20.5F, -4F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,-0.75F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F); // Box 193
		gunModel[38].setRotationPoint(-5F, -23.5F, -4F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,-1F, -0.5F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -0.5F, -2F, -0.5F, -0.75F, -2F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, -2F); // Box 194
		gunModel[39].setRotationPoint(-14F, -3F, -3F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F,-4F, -0.5F, -2F, -1F, -1F, 0F, -1F, -1F, 0F, -4F, -0.5F, -2F, -1.5F, -1F, -2F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -1.5F, -1F, -2F); // Box 195
		gunModel[40].setRotationPoint(-14.5F, -9.5F, -3F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,-4.25F, -0.5F, -2F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -4.25F, -0.5F, -2F, -2F, -0.5F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, -0.5F, -2F); // Box 196
		gunModel[41].setRotationPoint(-12.5F, -13.5F, -3F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,-3.5F, 0F, -2F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -3.5F, 0F, -2F, -1.75F, -1.5F, -2F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -1.75F, -1.5F, -2F); // Box 197
		gunModel[42].setRotationPoint(-10F, -16.5F, -3F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,-2.75F, 0F, -2F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -2.75F, 0F, -2F, -1.5F, 0F, -2F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -1.5F, 0F, -2F); // Box 198
		gunModel[43].setRotationPoint(-8F, -20.5F, -3F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 200
		gunModel[44].setRotationPoint(-4F, -25.5F, -4F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F); // Box 201
		gunModel[45].setRotationPoint(20F, -25.5F, -4F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-1F, -0.75F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.75F, -1F, -1.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1F); // Box 202
		gunModel[46].setRotationPoint(-6F, -25.5F, -4F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,-1F, -1.25F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, -1.25F, -1F, -3F, -0.25F, -1F, -1F, -1F, 0F, -1F, -1F, 0F, -3F, -0.25F, -1F); // Box 203
		gunModel[47].setRotationPoint(-8F, -27.5F, -4F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 11, 24, 8, 0F,-9.5F, 0F, 0F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -9.5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -0.5F, -10F, 0F, -0.5F, 0F, 0F, 0F); // Box 204
		gunModel[48].setRotationPoint(-1F, -22.5F, -4F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 11, 24, 7, 0F,-9F, -1F, 0F, -1.5F, -2F, -1F, -1.5F, -2F, -1F, -9F, -1F, 0F, 0F, 0F, 0F, -10F, 0F, -1F, -10F, 0F, -1F, 0F, 0F, 0F); // Box 205
		gunModel[49].setRotationPoint(0F, -22.5F, -3.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 11, 24, 5, 0F,-8.5F, -2F, 0F, -2.25F, -2.5F, -1F, -2.25F, -2.5F, -1F, -8.5F, -2F, 0F, 0F, 0F, 0F, -10.5F, 0F, -1F, -10.5F, 0F, -1F, 0F, 0F, 0F); // Box 206
		gunModel[50].setRotationPoint(1F, -22.5F, -2.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 11, 3, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 210
		gunModel[51].setRotationPoint(-2F, -25.5F, -4F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F); // Box 220
		gunModel[52].setRotationPoint(17F, -25.5F, -4F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -1F); // Box 221
		gunModel[53].setRotationPoint(17F, -24.5F, -3.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0.25F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0F, 0F, -0.75F, -1F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, -1F); // Box 222
		gunModel[54].setRotationPoint(17F, -23.5F, -2.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, -0.5F, -0.5F, -1F); // Box 223
		gunModel[55].setRotationPoint(14F, -23.5F, -2.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, -0.5F, 0F, -1F); // Box 224
		gunModel[56].setRotationPoint(14F, -24.5F, -3.5F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 225
		gunModel[57].setRotationPoint(14F, -25.5F, -4F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,-0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.75F, 0.25F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.75F, 0.25F, -1F); // Box 226
		gunModel[58].setRotationPoint(11F, -23.5F, -2.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,-0.25F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.75F, 0F, -0.5F, 0.75F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0.75F, -1F); // Box 227
		gunModel[59].setRotationPoint(11F, -24.5F, -3.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, 0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0.75F, -0.5F); // Box 228
		gunModel[60].setRotationPoint(11F, -25.5F, -4F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-1F, -2.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, -2.25F, 0F, -1.25F, 1.75F, -1F, -1.75F, -0.5F, -1F, -1.75F, -0.5F, -1F, -1.25F, 1.75F, -1F); // Box 229
		gunModel[61].setRotationPoint(8.5F, -22.75F, -2.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-0.5F, -2.25F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.5F, -2.25F, 0F, -1F, 2.25F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -1F, 2.25F, -1F); // Box 230
		gunModel[62].setRotationPoint(8.5F, -23.75F, -3.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, -2.25F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, -2.25F, 0F, -0.5F, 2.25F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, -0.5F, 2.25F, -0.5F); // Box 231
		gunModel[63].setRotationPoint(8.5F, -24.75F, -4F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 3, 5, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, 0F, 0F, 0F); // Box 232
		gunModel[64].setRotationPoint(8.5F, -27.5F, -4F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.25F, 0F); // Box 233
		gunModel[65].setRotationPoint(11F, -27.5F, -4F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, -1F, 0F); // Box 234
		gunModel[66].setRotationPoint(14.5F, -27.5F, -4F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 235
		gunModel[67].setRotationPoint(17F, -27.5F, -4F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.125F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.125F, -0.5F, 0.25F, -0.375F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.25F, -0.375F, -0.5F); // Box 237
		gunModel[68].setRotationPoint(12.5F, -17F, -2F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 238
		gunModel[69].setRotationPoint(11.5F, -17.25F, -2F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-0.75F, 0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.75F, 0.25F, -0.5F, 0F, -0.875F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.875F, -0.5F); // Box 239
		gunModel[70].setRotationPoint(9.5F, -18.25F, -2F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -1F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -1F, 0.5F); // Box 240
		gunModel[71].setRotationPoint(8.5F, -21.25F, -2F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,-1F, -2F, 0F, -0.25F, -2.75F, -0.5F, -0.25F, -2.75F, -0.5F, -1F, -2F, 0F, 0F, -1.5F, 0F, -1F, -1.875F, -0.5F, -1F, -1.875F, -0.5F, 0F, -1.5F, 0F); // Box 241
		gunModel[72].setRotationPoint(7.5F, -21.25F, -2F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-0.5F, -1.65F, 0F, -1.45F, -0.7F, 0F, -1.45F, -0.7F, 0F, -0.5F, -1.65F, 0F, -1.15F, -0.15F, 0F, -1.3F, -0.75F, 0F, -1.3F, -0.75F, 0F, -1.15F, -0.15F, 0F); // Box 243
		gunModel[73].setRotationPoint(11.5F, -22F, -1F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, -3F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, -3F, 0F, -2.5F, -0.35F, 0F, -0.45F, -1.3F, 0F, -0.45F, -1.3F, 0F, -2.5F, -0.35F, 0F); // Box 244
		gunModel[74].setRotationPoint(9.5F, -24F, -1F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.15F, -0.85F, 0F, -1.3F, -0.25F, 0F, -1.3F, -0.25F, 0F, -0.15F, -0.85F, 0F, -1.25F, 0F, 0F, -0.75F, -0.45F, 0F, -0.75F, -0.45F, 0F, -1.25F, 0F, 0F); // Box 245
		gunModel[75].setRotationPoint(12.5F, -20F, -1F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.25F, -1F, 0F, -1.75F, -0.55F, 0F, -1.75F, -0.55F, 0F, -0.25F, -1F, 0F, -1.75F, 0F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -1.75F, 0F, 0F); // Box 246
		gunModel[76].setRotationPoint(13.5F, -19F, -1F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 248
		gunModel[77].setRotationPoint(29F, -28F, 2.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.05F, -0.25F, -0.5F, -0.05F, -0.25F, -0.75F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 249
		gunModel[78].setRotationPoint(29F, -28.5F, 2.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, -1.25F, -0.5F, 0F, -1.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.35F, -0.9F, -0.5F, -0.35F, -0.9F, -0.5F, -0.35F, -0.9F, 0F, -0.35F, -0.9F); // Box 250
		gunModel[79].setRotationPoint(29F, -26F, 1.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.35F, -0.9F, -0.5F, -0.35F, -0.9F, -0.5F, -0.35F, -0.9F, 0F, -0.35F, -0.9F); // Box 251
		gunModel[80].setRotationPoint(29F, -26F, -3.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1F, -0.25F, -0.75F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 252
		gunModel[81].setRotationPoint(29F, -28F, -3.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.05F, 0F, -0.75F, -0.05F, 0F, -0.5F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 253
		gunModel[82].setRotationPoint(29F, -28.5F, -3.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 254
		gunModel[83].setRotationPoint(41.5F, -28.5F, -3F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.35F, -0.6F, 0F, -0.35F, -0.6F, 0F, -0.35F, -0.6F, 0F, -0.35F, -0.6F); // Box 255
		gunModel[84].setRotationPoint(41.5F, -26F, -3F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 256
		gunModel[85].setRotationPoint(42F, -28.25F, -2.5F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.25F, -0.65F, 0F, -0.25F, -0.65F, 0F, -0.25F, -0.65F, 0F, -0.25F, -0.65F); // Box 257
		gunModel[86].setRotationPoint(42F, -27.5F, -2.5F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, -0.25F, -1.2F, 0F, -0.25F, -1.2F, 0F, -0.25F, -1.2F, 0F, -0.25F, -1.2F); // Box 258
		gunModel[87].setRotationPoint(42F, -26.75F, -2.5F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.55F, -1.5F, 0F, -0.55F, -1.5F, 0F, -0.55F, -1.5F, 0F, -0.55F, -1.5F); // Box 259
		gunModel[88].setRotationPoint(42F, -26F, -2F);

		gunModel[89].addShapeBox(-1.5F, 1F, -4F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 236
		gunModel[89].setRotationPoint(4.4F, -8F, 0F);
		gunModel[89].rotateAngleZ = -0.38397244F;

		gunModel[90].addShapeBox(0F, 1F, -3.5F, 2, 1, 7, 0F,0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, 0F); // Box 237
		gunModel[90].setRotationPoint(4.4F, -8F, 0F);
		gunModel[90].rotateAngleZ = -0.38397244F;

		gunModel[91].addShapeBox(-1.5F, 0F, -4F, 2, 1, 8, 0F,0F, 0.25F, -0.5F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 238
		gunModel[91].setRotationPoint(4.4F, -8F, 0F);
		gunModel[91].rotateAngleZ = -0.38397244F;

		gunModel[92].addShapeBox(0F, 0F, -3.5F, 2, 1, 7, 0F,0F, 0.25F, -0.5F, -0.75F, -0.25F, -2.5F, -0.75F, -0.25F, -2.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, 0F); // Box 239
		gunModel[92].setRotationPoint(4.4F, -8F, 0F);
		gunModel[92].rotateAngleZ = -0.38397244F;

		gunModel[93].addShapeBox(0F, 2F, -3.5F, 2, 1, 7, 0F,0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, -0.75F, -0.5F, -2.5F, -0.75F, -0.5F, -2.5F, 0F, -0.1F, -0.5F); // Box 240
		gunModel[93].setRotationPoint(4.4F, -8F, 0F);
		gunModel[93].rotateAngleZ = -0.38397244F;

		gunModel[94].addShapeBox(-1.5F, 2F, -4F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, -1F, 0F, -0.1F, -0.5F); // Box 241
		gunModel[94].setRotationPoint(4.4F, -8F, 0F);
		gunModel[94].rotateAngleZ = -0.38397244F;

		gunModel[95].addShapeBox(0.5F, 2F, -3.5F, 2, 1, 7, 0F,0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -2.5F, -0.75F, -0.5F, -2.5F, 0F, -0.5F, -0.5F); // Box 242
		gunModel[95].setRotationPoint(1F, -1F, 0F);
		gunModel[95].rotateAngleZ = -0.36651914F;

		gunModel[96].addShapeBox(-1F, 2F, -4F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, -0.5F, -0.5F); // Box 243
		gunModel[96].setRotationPoint(1F, -1F, 0F);
		gunModel[96].rotateAngleZ = -0.36651914F;

		gunModel[97].addShapeBox(-1F, -1F, -4F, 2, 1, 8, 0F,0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 244
		gunModel[97].setRotationPoint(1F, -1F, 0F);
		gunModel[97].rotateAngleZ = -0.36651914F;

		gunModel[98].addShapeBox(-1F, 0F, -4F, 2, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 245
		gunModel[98].setRotationPoint(1F, -1F, 0F);
		gunModel[98].rotateAngleZ = -0.36651914F;

		gunModel[99].addShapeBox(0.5F, -1F, -3.5F, 2, 1, 7, 0F,0F, 0F, -0.5F, -0.75F, -0.5F, -2.5F, -0.75F, -0.5F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, 0F); // Box 246
		gunModel[99].setRotationPoint(1F, -1F, 0F);
		gunModel[99].rotateAngleZ = -0.36651914F;

		gunModel[100].addShapeBox(0.5F, 0F, -3.5F, 2, 2, 7, 0F,0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, 0F); // Box 247
		gunModel[100].setRotationPoint(1F, -1F, 0F);
		gunModel[100].rotateAngleZ = -0.36651914F;

		gunModel[101].addShapeBox(0F, 1F, -3.5F, 2, 1, 7, 0F,0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, 0F); // Box 248
		gunModel[101].setRotationPoint(6.35F, -13F, 0F);
		gunModel[101].rotateAngleZ = -0.38397244F;

		gunModel[102].addShapeBox(-1.5F, 0F, -4F, 2, 1, 8, 0F,0F, 0.25F, -0.5F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 249
		gunModel[102].setRotationPoint(6.35F, -13F, 0F);
		gunModel[102].rotateAngleZ = -0.38397244F;

		gunModel[103].addShapeBox(0F, 0F, -3.5F, 2, 1, 7, 0F,0F, 0.25F, -0.5F, -0.75F, -0.25F, -2.5F, -0.75F, -0.25F, -2.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, 0F); // Box 250
		gunModel[103].setRotationPoint(6.35F, -13F, 0F);
		gunModel[103].rotateAngleZ = -0.38397244F;

		gunModel[104].addShapeBox(-1.5F, 1F, -4F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 251
		gunModel[104].setRotationPoint(6.35F, -13F, 0F);
		gunModel[104].rotateAngleZ = -0.38397244F;

		gunModel[105].addShapeBox(-1.5F, 2F, -4F, 2, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, -1F, 0F, -0.1F, -0.5F); // Box 252
		gunModel[105].setRotationPoint(6.35F, -13F, 0F);
		gunModel[105].rotateAngleZ = -0.38397244F;

		gunModel[106].addShapeBox(0F, 2F, -3.5F, 2, 1, 7, 0F,0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, -0.75F, -0.5F, -2.5F, -0.75F, -0.5F, -2.5F, 0F, -0.1F, -0.5F); // Box 253
		gunModel[106].setRotationPoint(6.35F, -13F, 0F);
		gunModel[106].rotateAngleZ = -0.38397244F;

		gunModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-1F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -1F, -0.3F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 254
		gunModel[107].setRotationPoint(-10.5F, -28.5F, -4F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.75F, -1F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -1F, -0.25F, -0.75F, -1F); // Box 255
		gunModel[108].setRotationPoint(-10.5F, -27.5F, -4F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-0.75F, -0.5F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.5F, -2F, -0.75F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -2F); // Box 257
		gunModel[109].setRotationPoint(-6F, -23.5F, -3F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,-0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -1F, -1F, -2.5F, -0.5F, -0.75F, -2.5F, -0.5F, -0.75F, -2.5F, -1F, -1F, -2.5F); // Box 258
		gunModel[110].setRotationPoint(-10.5F, -26.5F, -3.5F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,-0.25F, -1.75F, -2F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -0.25F, -1.75F, -2F, -0.75F, 0F, -2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, -2F); // Box 259
		gunModel[111].setRotationPoint(-6F, -26F, -3F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -0.25F, -0.5F, -1F, -1.75F, -0.5F, -1F, -1.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -2.5F, -1.75F, 0.25F, -2.5F, -1.75F, 0.25F, -2.5F, 0F, -0.75F, -2.5F); // Box 260
		gunModel[112].setRotationPoint(-7F, -26.5F, -3.5F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.75F, 0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1.25F, -1F, -0.65F, 0F, -1F, 0F, -0.875F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.75F, -1F, 0F, -1.125F, -1F); // Box 267
		gunModel[113].setRotationPoint(9.5F, -18.25F, 1F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.625F, -1F, 0F, -0.25F, -1F, 0.5F, -0.5F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.375F, -1F, 0.5F, -0.75F, -1F); // Box 268
		gunModel[114].setRotationPoint(11.5F, -17.25F, 1F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.125F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -1F, 0F, -0.375F, -1F, 0.25F, -0.375F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -1F, 0.25F, -0.625F, -1F); // Box 269
		gunModel[115].setRotationPoint(12.5F, -17F, 1F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 270
		gunModel[116].setRotationPoint(13.5F, -17F, 1F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1.25F, -0.5F, 0F, -1F, -0.5F, 0.25F, -1F, -1F, 0F, -1.5F, -1F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 271
		gunModel[117].setRotationPoint(19.5F, -18F, 1F);

		gunModel[118].addShapeBox(1F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.875F, -0.25F, -1F, -0.25F, -0.25F, -1F, 0F, -0.25F, -0.5F, -0.6F, -0.25F, -0.5F, -0.975F, -0.25F, -1F, -0.25F, -0.25F, -1F); // Box 272
		gunModel[118].setRotationPoint(19.5F, -16.5F, 1F);

		gunModel[119].addShapeBox(1F, 0F, 0F, 4, 1, 2, 0F,-0.9F, 0F, -0.5F, -1.05F, 0F, -0.5F, -1.3F, 0F, -1F, -1.15F, 0F, -1F, 0F, -0.25F, -0.5F, -0.9F, -0.25F, -0.5F, -1.15F, -0.25F, -1F, -0.25F, -0.25F, -1F); // Box 273
		gunModel[119].setRotationPoint(19.5F, -17.75F, 1F);

		gunModel[120].addShapeBox(1F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -1.15F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.875F, -0.25F, -1F, -0.25F, -0.25F, -1F); // Box 274
		gunModel[120].setRotationPoint(19.5F, -17F, 1F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, -0.5F, -0.6F, -0.25F, -0.5F, -0.975F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -0.5F, -1.2F, -0.35F, -0.5F, -1.45F, -0.475F, -1F, -0.25F, -0.5F, -1F); // Box 275
		gunModel[121].setRotationPoint(20.5F, -16F, 1F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.1F, -0.75F, -0.5F, -0.05F, -0.75F, -0.5F, -0.3F, -0.75F, -1F, -0.15F, -0.75F, -1F); // Box 276
		gunModel[122].setRotationPoint(21.5F, -19F, 1F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 277
		gunModel[123].setRotationPoint(21.5F, -21F, 1F);

		gunModel[124].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.5F, 0F, -1F, -1.5F, 0F, -1F); // Box 278
		gunModel[124].setRotationPoint(20.5F, -23F, 1F);

		gunModel[125].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.25F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.6F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 279
		gunModel[125].setRotationPoint(20.5F, -23.5F, 1F);

		gunModel[126].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -1F, -0.75F, -0.5F, -1F, -1.25F, 0F, -0.5F, -1.35F, 0F, -0.5F, -1.6F, 0F, -1F, -1.5F, 0F, -1F); // Box 280
		gunModel[126].setRotationPoint(19.5F, -24F, 1F);

		gunModel[127].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.65F, 0F, -1F, 0F, -1.25F, -1F, 0F, -1F, -0.5F, -0.75F, 0.25F, -0.5F, 0F, -1.125F, -1F, -0.5F, -0.75F, -1F, -0.5F, -0.5F, -0.5F, 0F, -0.875F, -0.5F); // Box 286
		gunModel[127].setRotationPoint(9.5F, -18.25F, -3F);

		gunModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -1F, 0F, -0.625F, -1F, 0F, -0.375F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.75F, -1F, -0.25F, -0.375F, -1F, -0.25F, -0.125F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 287
		gunModel[128].setRotationPoint(11.5F, -17.25F, -3F);

		gunModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.375F, -1F, 0F, -0.5F, -1F, 0F, -0.25F, -0.5F, 0F, -0.125F, -0.5F, 0.25F, -0.625F, -1F, 0F, -0.5F, -1F, 0F, -0.25F, -0.5F, 0.25F, -0.375F, -0.5F); // Box 288
		gunModel[129].setRotationPoint(12.5F, -17F, -3F);

		gunModel[130].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 289
		gunModel[130].setRotationPoint(13.5F, -17F, -3F);

		gunModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1.5F, -1F, 0.25F, -1F, -1F, 0F, -1F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 290
		gunModel[131].setRotationPoint(19.5F, -18F, -3F);

		gunModel[132].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.25F, -0.25F, -1F, -0.975F, -0.25F, -1F, -0.6F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.5F, -1F, -1.45F, -0.475F, -1F, -1.2F, -0.35F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 291
		gunModel[132].setRotationPoint(20.5F, -16F, -3F);

		gunModel[133].addShapeBox(1F, 0F, 0F, 4, 1, 2, 0F,-0.25F, -0.25F, -1F, -0.875F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -1F, -0.975F, -0.25F, -1F, -0.6F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 292
		gunModel[133].setRotationPoint(19.5F, -16.5F, -3F);

		gunModel[134].addShapeBox(1F, 0F, 0F, 4, 1, 2, 0F,-0.25F, 0F, -1F, -1.15F, 0F, -1F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1F, -0.875F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 293
		gunModel[134].setRotationPoint(19.5F, -17F, -3F);

		gunModel[135].addShapeBox(1F, 0F, 0F, 4, 1, 2, 0F,-1.15F, 0F, -1F, -1.3F, 0F, -1F, -1.05F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.25F, -0.25F, -1F, -1.15F, -0.25F, -1F, -0.9F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 294
		gunModel[135].setRotationPoint(19.5F, -17.75F, -3F);

		gunModel[136].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.15F, -0.75F, -1F, -0.3F, -0.75F, -1F, -0.05F, -0.75F, -0.5F, 0.1F, -0.75F, -0.5F); // Box 295
		gunModel[136].setRotationPoint(21.5F, -19F, -3F);

		gunModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 296
		gunModel[137].setRotationPoint(21.5F, -21F, -3F);

		gunModel[138].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, -0.5F, -1F, -1F, -0.5F, -1F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F); // Box 297
		gunModel[138].setRotationPoint(20.5F, -23F, -3F);

		gunModel[139].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.5F, -1F, -0.6F, -0.5F, -1F, -0.35F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -1F, 0F, -1F, -1F, 0F, -1F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 298
		gunModel[139].setRotationPoint(20.5F, -23.5F, -3F);

		gunModel[140].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.75F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1.5F, 0F, -1F, -1.6F, 0F, -1F, -1.35F, 0F, -0.5F, -1.25F, 0F, -0.5F); // Box 299
		gunModel[140].setRotationPoint(19.5F, -24F, -3F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 3, 7, 2, 0F,-1F, -2F, -1F, -0.25F, -2.75F, -0.5F, -0.25F, -2.75F, -1F, -1F, -2F, -0.5F, 0F, -1.5F, -1F, -1F, -1.875F, -0.5F, -1F, -2.125F, -1F, 0F, -1.75F, -0.5F); // Box 301
		gunModel[141].setRotationPoint(7.5F, -21.25F, 1F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 3, 7, 2, 0F,-1F, -2F, -0.5F, -0.25F, -2.75F, -1F, -0.25F, -2.75F, -0.5F, -1F, -2F, -1F, 0F, -1.75F, -0.5F, -1F, -2.125F, -1F, -1F, -1.875F, -0.5F, 0F, -1.5F, -1F); // Box 302
		gunModel[142].setRotationPoint(7.5F, -21.25F, -3F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 318
		gunModel[143].setRotationPoint(-9.5F, -29.5F, -3.5F);

		gunModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -0.4F, -0.75F, 0F, -0.4F, -0.75F, 0F, -0.4F, -0.75F, 0F, -0.4F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 319
		gunModel[144].setRotationPoint(-9.5F, -29.1F, -3.5F);

		gunModel[145].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.2F, -0.65F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.2F, -0.5F, 0F, -1.85F, -0.65F, 0F, -1.85F, -0.5F, 0F, -1.85F, -0.5F, 0F, -1.85F, -0.5F); // Box 344
		gunModel[145].setRotationPoint(-9.5F, -30.25F, -2.65F);

		gunModel[146].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -1.85F, -0.5F, 0F, -1.85F, -0.5F, 0F, -1.85F, -0.5F, 0F, -1.85F, -0.5F); // Box 345
		gunModel[146].setRotationPoint(-9.5F, -30.25F, 0.649999999999999F);

		gunModel[147].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 346
		gunModel[147].setRotationPoint(-9F, -33.5F, -3F);

		gunModel[148].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 338
		gunModel[148].setRotationPoint(12.5F, -34.5F, 2F);

		gunModel[149].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,-0.5F, -0.05F, -1.25F, -0.5F, -0.05F, -1.25F, -0.5F, -0.05F, -0.75F, -0.5F, -0.05F, -0.75F, -0.5F, -0.5F, -1.25F, -0.5F, -0.5F, -1.25F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 340
		gunModel[149].setRotationPoint(11F, -34.5F, -3F);

		gunModel[150].addShapeBox(0F, 0F, 0F, 9, 6, 2, 0F,-0.5F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F, -0.5F, -0.05F, -0.75F, -0.5F, -0.05F, -0.75F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F); // Box 344
		gunModel[150].setRotationPoint(12F, -34.5F, -3F);

		gunModel[151].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, -1F, -0.25F); // Box 346
		gunModel[151].setRotationPoint(15F, -27.5F, -4F);

		gunModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 347
		gunModel[152].setRotationPoint(15.5F, -25.5F, -4F);

		gunModel[153].addShapeBox(0F, 0F, -2F, 1, 1, 1, 0F,-0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.15F, -0.25F, 0.25F, -0.15F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 348
		gunModel[153].setRotationPoint(15.25F, -26.5F, -2F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.8F, -0.5F, -0.25F, -0.8F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 350
		gunModel[154].setRotationPoint(4.25F, -26.5F, -5F);

		gunModel[155].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 351
		gunModel[155].setRotationPoint(5F, -28F, -5F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.75F, -1F, -0.125F, -0.75F, -1F, -0.125F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F, -0.75F, -1F, 0.375F, -0.75F, -1F, 0.375F, 0F, -0.75F, 0.5F, 0F); // Box 352
		gunModel[156].setRotationPoint(6.5F, -28F, -5F);

		gunModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -0.125F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -1F, -0.125F, 0F, -1F, 0.375F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, 0F, -1F, 0.375F, 0F); // Box 353
		gunModel[157].setRotationPoint(4F, -28F, -5F);

		gunModel[158].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 354
		gunModel[158].setRotationPoint(5F, -28.25F, -5F);

		gunModel[159].addShapeBox(0F, 0F, -2F, 1, 1, 1, 0F,-0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.15F, -0.25F, 0.25F, -0.15F); // Box 355
		gunModel[159].setRotationPoint(15.25F, -26.5F, 5F);

		gunModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.875F, -0.75F, -0.75F, -0.875F, -0.75F, -0.75F, -0.875F, 0F, -0.25F, -0.875F, 0F); // Box 360
		gunModel[160].setRotationPoint(5F, -27.25F, -5.05F);

		gunModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.875F, -0.75F, -0.75F, -0.875F, -0.75F, -0.75F, -0.875F, 0F, -0.25F, -0.875F, 0F); // Box 361
		gunModel[161].setRotationPoint(5F, -27F, -5.05F);

		gunModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.875F, -0.75F, -0.75F, -0.875F, -0.75F, -0.75F, -0.875F, 0F, -0.25F, -0.875F, 0F); // Box 362
		gunModel[162].setRotationPoint(5F, -27.5F, -5.05F);

		gunModel[163].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.875F, -0.75F, -0.75F, -0.875F, -0.75F, -0.75F, -0.875F, 0F, -0.25F, -0.875F, 0F); // Box 363
		gunModel[163].setRotationPoint(5F, -27.75F, -5.05F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.875F, -0.75F, -0.75F, -0.875F, -0.75F, -0.75F, -0.875F, 0F, -0.25F, -0.875F, 0F); // Box 364
		gunModel[164].setRotationPoint(5F, -26.75F, -5.05F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, 0F, -1F, -0.125F, 0F, -1F, -0.125F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, 0F, -1F, 0.375F, 0F, -1F, 0.375F, -0.75F, -0.75F, 0.5F, -0.75F); // Box 365
		gunModel[165].setRotationPoint(6.5F, -28F, 4F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, -0.75F, -0.25F, 0.5F, -0.75F); // Box 366
		gunModel[166].setRotationPoint(5F, -28F, 4F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.875F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.75F, -0.25F, -0.875F, -0.75F); // Box 367
		gunModel[167].setRotationPoint(5F, -27.75F, 4.05F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.875F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.75F, -0.25F, -0.875F, -0.75F); // Box 368
		gunModel[168].setRotationPoint(5F, -27.5F, 4.05F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.875F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.75F, -0.25F, -0.875F, -0.75F); // Box 369
		gunModel[169].setRotationPoint(5F, -27.25F, 4.05F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.875F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.75F, -0.25F, -0.875F, -0.75F); // Box 370
		gunModel[170].setRotationPoint(5F, -27F, 4.05F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.875F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.75F, -0.25F, -0.875F, -0.75F); // Box 371
		gunModel[171].setRotationPoint(5F, -26.75F, 4.05F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -0.125F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -1F, -0.125F, -0.75F, -1F, 0.375F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, -0.75F, -1F, 0.375F, -0.75F); // Box 372
		gunModel[172].setRotationPoint(4F, -28F, 4F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F); // Box 373
		gunModel[173].setRotationPoint(5F, -28.25F, 3F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, -0.8F, -0.5F, -0.25F, -0.8F); // Box 374
		gunModel[174].setRotationPoint(4.25F, -26.5F, 4F);

		gunModel[175].addShapeBox(-1F, 0F, 2.22044604925031E-16F, 3, 1, 2, 0F,0.25F, 0.5F, 0F, -0.15F, 0.5F, 0F, -0.15F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, 0F, -0.15F, 0.5F, 0F, -0.15F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F); // Box 387
		gunModel[175].setRotationPoint(6F, -19F, 3F);
		gunModel[175].rotateAngleZ = -0.29670597F;

		gunModel[176].addShapeBox(-0.9F, 0F, 0.05F, 1, 1, 1, 0F,0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F, 0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F); // Box 389
		gunModel[176].setRotationPoint(6F, -19F, 4F);
		gunModel[176].rotateAngleZ = -0.29670597F;

		gunModel[177].addShapeBox(-0.65F, 0F, 0.05F, 1, 1, 1, 0F,0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F, 0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F); // Box 391
		gunModel[177].setRotationPoint(6F, -19F, 4F);
		gunModel[177].rotateAngleZ = -0.29670597F;

		gunModel[178].addShapeBox(-0.4F, 0F, 0.05F, 1, 1, 1, 0F,0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F, 0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F); // Box 392
		gunModel[178].setRotationPoint(6F, -19F, 4F);
		gunModel[178].rotateAngleZ = -0.29670597F;

		gunModel[179].addShapeBox(-0.15F, 0F, 0.05F, 1, 1, 1, 0F,0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F, 0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F); // Box 393
		gunModel[179].setRotationPoint(6F, -19F, 4F);
		gunModel[179].rotateAngleZ = -0.29670597F;

		gunModel[180].addShapeBox(0.0999999999999996F, 0F, 0.05F, 1, 1, 1, 0F,0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F, 0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F); // Box 394
		gunModel[180].setRotationPoint(6F, -19F, 4F);
		gunModel[180].rotateAngleZ = -0.29670597F;

		gunModel[181].addShapeBox(0.35F, 0F, 0.05F, 1, 1, 1, 0F,0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F, 0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F); // Box 395
		gunModel[181].setRotationPoint(6F, -19F, 4F);
		gunModel[181].rotateAngleZ = -0.29670597F;

		gunModel[182].addShapeBox(0.6F, 0F, 0.05F, 1, 1, 1, 0F,0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F, 0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F); // Box 396
		gunModel[182].setRotationPoint(6F, -19F, 4F);
		gunModel[182].rotateAngleZ = -0.29670597F;

		gunModel[183].addShapeBox(0.85F, 0F, 0.05F, 1, 1, 1, 0F,0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F, 0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F); // Box 397
		gunModel[183].setRotationPoint(6F, -19F, 4F);
		gunModel[183].rotateAngleZ = -0.29670597F;

		gunModel[184].addShapeBox(1.1F, 0F, 0.05F, 1, 1, 1, 0F,0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F, 0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F); // Box 398
		gunModel[184].setRotationPoint(6F, -19F, 4F);
		gunModel[184].rotateAngleZ = -0.29670597F;

		gunModel[185].addShapeBox(1.35F, 0F, 0.05F, 1, 1, 1, 0F,0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F, 0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F); // Box 399
		gunModel[185].setRotationPoint(6F, -19F, 4F);
		gunModel[185].rotateAngleZ = -0.29670597F;

		gunModel[186].addShapeBox(1.6F, 0F, 0.05F, 1, 1, 1, 0F,0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F, 0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F); // Box 400
		gunModel[186].setRotationPoint(6F, -19F, 4F);
		gunModel[186].rotateAngleZ = -0.29670597F;

		gunModel[187].addShapeBox(1.85F, 0F, 0.05F, 1, 1, 1, 0F,0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F, 0.25F, 0.45F, 0F, -1.1F, 0.45F, 0F, -1.1F, 0.45F, -0.75F, 0.25F, 0.45F, -0.75F); // Box 401
		gunModel[187].setRotationPoint(6F, -19F, 4F);
		gunModel[187].rotateAngleZ = -0.29670597F;

		gunModel[188].addShapeBox(0F, 0F, 0F, 35, 1, 6, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 402
		gunModel[188].setRotationPoint(-9F, -28.5F, -3F);

		gunModel[189].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 404
		gunModel[189].setRotationPoint(-8F, -28.5F, -3F);
	}

	private void initdefaultBarrelModel_1()
	{
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 440
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 441
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 442
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 443
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 444
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 445
		defaultBarrelModel[6] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 446
		defaultBarrelModel[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 447

		defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -1.23F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.42F, -0.58F); // Box 440
		defaultBarrelModel[0].setRotationPoint(18F, -33.5F, 0F);

		defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, -0.58F, -1.42F, 0F, -0.58F, -1.42F, 0F, -1.23F, -0.15F, 0F, -1.23F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		defaultBarrelModel[1].setRotationPoint(18F, -33.5F, 0F);

		defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.58F, -1.42F, 0F, -0.58F, -1.42F, 0F, -1.23F, -0.15F, 0F, -1.23F, -0.15F); // Box 442
		defaultBarrelModel[2].setRotationPoint(18F, -31.5F, 0F);

		defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.42F, -0.58F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -1.23F, 0F, -0.15F, -1.23F); // Box 443
		defaultBarrelModel[3].setRotationPoint(18F, -31.5F, 0F);

		defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.23F, -0.15F, 0F, -1.23F, -0.15F, 0F, -0.58F, -1.42F, 0F, -0.58F, -1.42F); // Box 444
		defaultBarrelModel[4].setRotationPoint(18F, -31.5F, -2F);

		defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, -1.42F, -0.58F, 0F, -1.42F, -0.58F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -1.23F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		defaultBarrelModel[5].setRotationPoint(18F, -31.5F, -2F);

		defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, -0.15F, -1.23F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.42F, -0.58F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		defaultBarrelModel[6].setRotationPoint(18F, -33.5F, -2F);

		defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, -1.23F, -0.15F, 0F, -1.23F, -0.15F, 0F, -0.58F, -1.42F, 0F, -0.58F, -1.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		defaultBarrelModel[7].setRotationPoint(18F, -33.5F, -2F);
	}

	private void initdefaultScopeModel_1()
	{
		defaultScopeModel[0] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 117
		defaultScopeModel[1] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 118
		defaultScopeModel[2] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 119
		defaultScopeModel[3] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 120
		defaultScopeModel[4] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 121
		defaultScopeModel[5] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Box 379
		defaultScopeModel[6] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 380
		defaultScopeModel[7] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 381

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.25F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 117
		defaultScopeModel[0].setRotationPoint(37.5F, -36F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		defaultScopeModel[1].setRotationPoint(40.5F, -35.5F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		defaultScopeModel[2].setRotationPoint(-7F, -35.2F, -2.5F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.85F, -0.25F, -1.1F, 0F, -0.25F, -1.1F, 0F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.5F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 120
		defaultScopeModel[3].setRotationPoint(-7F, -36.2F, -2.5F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.85F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.1F, -0.85F, -0.25F, -1.1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F); // Box 121
		defaultScopeModel[4].setRotationPoint(-7F, -36.2F, 0.5F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F); // Box 379
		defaultScopeModel[5].setRotationPoint(38F, -35.85F, -0.5F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F); // Box 380
		defaultScopeModel[6].setRotationPoint(-7F, -35.85F, -1.6F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.6F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.35F, -0.25F, -0.25F); // Box 381
		defaultScopeModel[7].setRotationPoint(-7F, -35.85F, 0.6F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 303
		ammoModel[1] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 304
		ammoModel[2] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 305
		ammoModel[3] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 306
		ammoModel[4] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 307
		ammoModel[5] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 308
		ammoModel[6] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 309
		ammoModel[7] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 310
		ammoModel[8] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 311
		ammoModel[9] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 312
		ammoModel[10] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 313
		ammoModel[11] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 314
		ammoModel[12] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 315
		ammoModel[13] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 316
		ammoModel[14] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 317

		ammoModel[0].addShapeBox(0F, 0F, 0F, 16, 26, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 303
		ammoModel[0].setRotationPoint(-9F, -24.5F, 2F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 10, 26, 6, 0F,-9F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -0.5F, 0F, 0F, -0.5F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -0.5F); // Box 304
		ammoModel[1].setRotationPoint(-10F, -24.5F, -3F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 10, 26, 6, 0F,-9F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -0.5F, -9F, 0F, -0.5F, 0F, 0F, 0F); // Box 305
		ammoModel[2].setRotationPoint(-2F, -24.5F, -3F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 16, 26, 1, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 306
		ammoModel[3].setRotationPoint(-9F, -24.5F, -3F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 307
		ammoModel[4].setRotationPoint(-10F, 1.5F, -4F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F); // Box 308
		ammoModel[5].setRotationPoint(-1F, 1.5F, -4F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-0.25F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.75F); // Box 309
		ammoModel[6].setRotationPoint(-11F, 1.5F, -4F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -0.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 310
		ammoModel[7].setRotationPoint(-0.5F, 1.5F, -4F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		ammoModel[8].setRotationPoint(0F, -26.5F, 2F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.5F, -0.5F, -2.5F, -0.5F, -0.5F, -2.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		ammoModel[9].setRotationPoint(0F, -26.5F, -3F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.55F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.55F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 313
		ammoModel[10].setRotationPoint(-1F, -26.5F, -3F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,-1F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 314
		ammoModel[11].setRotationPoint(-10F, 0.5F, -4F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.5F, -0.75F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, -0.5F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F); // Box 315
		ammoModel[12].setRotationPoint(-1F, 0.5F, -4F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.5F, -1F, -0.75F, -0.5F, -2F, -0.75F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 316
		ammoModel[13].setRotationPoint(-0.5F, 0.5F, -4F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, -0.5F, -1.25F, 1F, -0.5F, -0.75F, 1F, -0.5F, -0.75F, -1F, -0.5F, -1.25F, -0.25F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.75F); // Box 317
		ammoModel[14].setRotationPoint(-11F, 0.5F, -4F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 106
		slideModel[1] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 108
		slideModel[2] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 109
		slideModel[3] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 112
		slideModel[4] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 113
		slideModel[5] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 114
		slideModel[6] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 115
		slideModel[7] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 116
		slideModel[8] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 122
		slideModel[9] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 123
		slideModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 124
		slideModel[11] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 125
		slideModel[12] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 126
		slideModel[13] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 127
		slideModel[14] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 129
		slideModel[15] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 136
		slideModel[16] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 139
		slideModel[17] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 141
		slideModel[18] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 149
		slideModel[19] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 151
		slideModel[20] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 153
		slideModel[21] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 155
		slideModel[22] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 159
		slideModel[23] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 320
		slideModel[24] = new ModelRendererTurbo(this, 753, 33, textureX, textureY); // Box 322
		slideModel[25] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 324
		slideModel[26] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 325
		slideModel[27] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 327
		slideModel[28] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 328
		slideModel[29] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 329
		slideModel[30] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 330
		slideModel[31] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 331
		slideModel[32] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 332
		slideModel[33] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 333
		slideModel[34] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 334
		slideModel[35] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 335
		slideModel[36] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 336
		slideModel[37] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 337
		slideModel[38] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 338
		slideModel[39] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 339
		slideModel[40] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 340
		slideModel[41] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 341
		slideModel[42] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 342
		slideModel[43] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 343
		slideModel[44] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 347
		slideModel[45] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 348
		slideModel[46] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 349
		slideModel[47] = new ModelRendererTurbo(this, 905, 41, textureX, textureY); // Box 350
		slideModel[48] = new ModelRendererTurbo(this, 529, 57, textureX, textureY); // Box 351
		slideModel[49] = new ModelRendererTurbo(this, 673, 57, textureX, textureY); // Box 326
		slideModel[50] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 328
		slideModel[51] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 329
		slideModel[52] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Box 330
		slideModel[53] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 331
		slideModel[54] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Box 332
		slideModel[55] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 333
		slideModel[56] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 335
		slideModel[57] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 336
		slideModel[58] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 339
		slideModel[59] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Box 338
		slideModel[60] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 339
		slideModel[61] = new ModelRendererTurbo(this, 545, 41, textureX, textureY); // Box 342
		slideModel[62] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 343
		slideModel[63] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Box 345
		slideModel[64] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Box 356
		slideModel[65] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 357
		slideModel[66] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 358
		slideModel[67] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // Box 403
		slideModel[68] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 440
		slideModel[69] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 441
		slideModel[70] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 442
		slideModel[71] = new ModelRendererTurbo(this, 961, 49, textureX, textureY); // Box 443
		slideModel[72] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 444
		slideModel[73] = new ModelRendererTurbo(this, 713, 57, textureX, textureY); // Box 445
		slideModel[74] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 446
		slideModel[75] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 447
		slideModel[76] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 307
		slideModel[77] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 308
		slideModel[78] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 309
		slideModel[79] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 310
		slideModel[80] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 311
		slideModel[81] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 312
		slideModel[82] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 313

		slideModel[0].addShapeBox(0F, 0F, 0F, 22, 7, 1, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 106
		slideModel[0].setRotationPoint(20F, -34.5F, -3.75F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 22, 1, 6, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 108
		slideModel[1].setRotationPoint(20F, -34.5F, -3F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 22, 7, 1, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 109
		slideModel[2].setRotationPoint(20F, -34.5F, -3.75F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 38, 6, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 112
		slideModel[3].setRotationPoint(4F, -34.5F, 2.75F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 51, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 113
		slideModel[4].setRotationPoint(-9F, -34.5F, 2.75F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 21, 1, 6, 0F,-0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 114
		slideModel[5].setRotationPoint(-9F, -34.5F, -3F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F); // Box 115
		slideModel[6].setRotationPoint(6.5F, -34.5F, -3.75F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 116
		slideModel[7].setRotationPoint(4F, -34.5F, -3.75F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 122
		slideModel[8].setRotationPoint(42F, -34.5F, -3.75F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, -0.5F, -1.5F, 0F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 123
		slideModel[9].setRotationPoint(42F, -34.5F, -3.75F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 124
		slideModel[10].setRotationPoint(42F, -34.5F, -3F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 125
		slideModel[11].setRotationPoint(42F, -34.5F, 2.75F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 126
		slideModel[12].setRotationPoint(42F, -34.5F, 2.75F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 127
		slideModel[13].setRotationPoint(42F, -33.5F, -3F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 45, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 129
		slideModel[14].setRotationPoint(-3F, -28.5F, -3F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 136
		slideModel[15].setRotationPoint(2F, -34.5F, 2.75F);

		slideModel[16].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 139
		slideModel[16].setRotationPoint(-4F, -34.5F, 2.75F);

		slideModel[17].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 141
		slideModel[17].setRotationPoint(-9F, -34.5F, 2.75F);

		slideModel[18].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 149
		slideModel[18].setRotationPoint(2F, -34.5F, -3.75F);

		slideModel[19].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 151
		slideModel[19].setRotationPoint(0F, -34.5F, -3.75F);

		slideModel[20].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 153
		slideModel[20].setRotationPoint(-2F, -34.5F, -3.75F);

		slideModel[21].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 155
		slideModel[21].setRotationPoint(-4F, -34.5F, -3.75F);

		slideModel[22].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 159
		slideModel[22].setRotationPoint(-9F, -34.5F, -3.75F);

		slideModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 320
		slideModel[23].setRotationPoint(-9.5F, -34.5F, -3F);

		slideModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2.15F, -0.25F, 0F, -2.15F, -0.25F, 0F, -2.15F, -0.25F, 0F, -2.15F, -0.25F); // Box 322
		slideModel[24].setRotationPoint(-9.5F, -33.5F, -2.5F);

		slideModel[25].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.65F, -0.45F, 0F, -1.65F, -0.5F, 0F, -1.65F, 0F, 0F, -1.65F, 0F); // Box 324
		slideModel[25].setRotationPoint(-9.5F, -34.5F, -3.75F);

		slideModel[26].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.55F); // Box 325
		slideModel[26].setRotationPoint(-9.5F, -34.5F, -3.75F);

		slideModel[27].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 327
		slideModel[27].setRotationPoint(-6F, -34.5F, 2.75F);

		slideModel[28].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 328
		slideModel[28].setRotationPoint(-7F, -34.5F, 2.75F);

		slideModel[29].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 329
		slideModel[29].setRotationPoint(-6F, -34.5F, -3.75F);

		slideModel[30].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 330
		slideModel[30].setRotationPoint(-7F, -34.5F, -3.75F);

		slideModel[31].addShapeBox(0F, 2F, 0F, 1, 2, 1, 0F,-0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.55F, 0F, -0.1F, -0.55F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.55F, 0F, -1F, -0.55F); // Box 331
		slideModel[31].setRotationPoint(-9.5F, -31.25F, -3.75F);

		slideModel[32].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.15F, -0.2F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F); // Box 332
		slideModel[32].setRotationPoint(-9.5F, -31.1F, -3.5F);

		slideModel[33].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, 0F, -0.65F, -0.55F, 0F, -0.65F, -0.5F, 0F, -0.65F, 0F, -0.5F, -0.65F, 0F); // Box 333
		slideModel[33].setRotationPoint(-9.5F, -34.5F, 2.75F);

		slideModel[34].addShapeBox(0F, 2F, 0F, 1, 2, 1, 0F,0F, -0.1F, -0.55F, 0F, -0.1F, -0.55F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -1F, -0.55F, 0F, -1F, -0.55F, 0F, -1F, 0F, -0.5F, -1F, 0F); // Box 334
		slideModel[34].setRotationPoint(-9.5F, -31.25F, 2.75F);

		slideModel[35].addShapeBox(0F, 2F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.2F); // Box 335
		slideModel[35].setRotationPoint(-9.5F, -31.1F, 2.5F);

		slideModel[36].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1.65F, 0F, 0F, -1.65F, 0F, 0F, -1.65F, -0.5F, 0F, -1.65F, -0.45F); // Box 336
		slideModel[36].setRotationPoint(-9.5F, -34.5F, 2.75F);

		slideModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F); // Box 337
		slideModel[37].setRotationPoint(-9.5F, -30.25F, -3F);

		slideModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1.15F, -0.25F, 0F, -1.15F, -0.25F); // Box 338
		slideModel[38].setRotationPoint(-9.5F, -33.5F, -3F);

		slideModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.15F, -0.25F, 0F, -1.15F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 339
		slideModel[39].setRotationPoint(-9.5F, -33.5F, 2F);

		slideModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.05F, -0.75F, 0F, -0.05F, -0.75F, 0F, -0.05F, -0.75F, 0F, -0.05F, -0.75F, 0F, -1.6F, -0.3F, 0F, -1.6F, -0.3F, 0F, -1.6F, -0.3F, 0F, -1.6F, -0.3F); // Box 340
		slideModel[40].setRotationPoint(-9.5F, -32.65F, -3F);

		slideModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F, 0F, -1.9F, -0.3F); // Box 341
		slideModel[41].setRotationPoint(-9.5F, -30.25F, 2F);

		slideModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, -2F, -0.3F, 0F, -2F, -0.3F, 0F, -2F, -0.3F); // Box 342
		slideModel[42].setRotationPoint(-9.5F, -32.25F, -3F);

		slideModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.9F, -0.5F, 0F, -1.9F, -0.5F, 0F, -1.9F, -0.5F, 0F, -1.9F, -0.5F); // Box 343
		slideModel[43].setRotationPoint(-9.5F, -30.25F, -1.5F);

		slideModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F); // Box 347
		slideModel[44].setRotationPoint(-9.5F, -30.6F, -3F);

		slideModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F); // Box 348
		slideModel[45].setRotationPoint(-9.5F, -31.2F, -3F);

		slideModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F); // Box 349
		slideModel[46].setRotationPoint(-9.5F, -30.9F, -3F);

		slideModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F); // Box 350
		slideModel[47].setRotationPoint(-9.5F, -31.5F, -3F);

		slideModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F); // Box 351
		slideModel[48].setRotationPoint(-9.5F, -31.8F, -3F);

		slideModel[49].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 326
		slideModel[49].setRotationPoint(7F, -31.5F, -3.75F);

		slideModel[50].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, -1.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 328
		slideModel[50].setRotationPoint(20F, -32.5F, -3.75F);

		slideModel[51].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, -1.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 329
		slideModel[51].setRotationPoint(19.5F, -32.5F, -3.75F);

		slideModel[52].addShapeBox(0F, 0F, 0F, 16, 7, 1, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 330
		slideModel[52].setRotationPoint(-9F, -34.5F, -3.75F);

		slideModel[53].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 331
		slideModel[53].setRotationPoint(7F, -34.5F, -3.75F);

		slideModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 332
		slideModel[54].setRotationPoint(7F, -33.5F, -3.75F);

		slideModel[55].addShapeBox(0F, -2F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1.6F, -0.5F, 0F, -1.6F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 333
		slideModel[55].setRotationPoint(7.25F, -31F, -3.75F);

		slideModel[56].addShapeBox(0F, -2F, 0F, 7, 1, 2, 0F,0F, -0.5F, 0F, -1.8F, -0.5F, 0F, -1.8F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 335
		slideModel[56].setRotationPoint(7.25F, -30F, -3.75F);

		slideModel[57].addShapeBox(0F, -2F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, -1.6F, -0.5F, 0F, -1.6F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 336
		slideModel[57].setRotationPoint(7.25F, -31F, -3.75F);

		slideModel[58].addShapeBox(0F, -2F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, -1.6F, -0.5F, 0F, -1.6F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 339
		slideModel[58].setRotationPoint(7.25F, -30.5F, -3.75F);

		slideModel[59].addShapeBox(0F, -2F, 0F, 6, 2, 2, 0F,-0.5F, -0.52F, -0.05F, -1.6F, -0.52F, -0.05F, -1.6F, -0.52F, -0.5F, -0.5F, -0.52F, -0.5F, -0.5F, -0.02F, -0.05F, -1.6F, -0.02F, -0.05F, -1.6F, -0.02F, -0.5F, -0.5F, -0.02F, -0.5F); // Box 338
		slideModel[59].setRotationPoint(8F, -31.5F, -3.75F);

		slideModel[60].addShapeBox(0F, -2F, 0F, 2, 2, 2, 0F,-0.5F, -0.52F, -0.05F, -1.725F, -0.77F, -0.05F, -1.725F, -0.77F, -0.5F, -0.5F, -0.52F, -0.5F, -0.5F, -0.02F, -0.05F, -1.725F, -0.27F, -0.05F, -1.725F, -0.27F, -0.5F, -0.5F, -0.02F, -0.5F); // Box 339
		slideModel[60].setRotationPoint(8F, -31.5F, -3.75F);

		slideModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 342
		slideModel[61].setRotationPoint(11F, -34.5F, -3.5F);

		slideModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 343
		slideModel[62].setRotationPoint(11F, -34.5F, 2F);

		slideModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 345
		slideModel[63].setRotationPoint(20F, -33.5F, -3F);

		slideModel[64].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 356
		slideModel[64].setRotationPoint(4F, -29.5F, 2.75F);

		slideModel[65].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.15F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -1.15F, 0F); // Box 357
		slideModel[65].setRotationPoint(17F, -29.5F, 2.75F);

		slideModel[66].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 358
		slideModel[66].setRotationPoint(23F, -29.5F, 2.75F);

		slideModel[67].addShapeBox(0F, 0F, 0F, 35, 1, 6, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 403
		slideModel[67].setRotationPoint(6F, -28.5F, -3F);

		slideModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -1.23F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.42F, -0.58F); // Box 440
		slideModel[68].setRotationPoint(-4F, -33F, 2F);
		slideModel[68].rotateAngleY = 1.57079633F;

		slideModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.58F, -1.42F, 0F, -0.58F, -1.42F, 0F, -1.23F, -0.15F, 0F, -1.23F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		slideModel[69].setRotationPoint(-4F, -33F, 2F);
		slideModel[69].rotateAngleY = 1.57079633F;

		slideModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.58F, -1.42F, 0F, -0.58F, -1.42F, 0F, -1.23F, -0.15F, 0F, -1.23F, -0.15F); // Box 442
		slideModel[70].setRotationPoint(-4F, -31F, 2F);
		slideModel[70].rotateAngleY = 1.57079633F;

		slideModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.42F, -0.58F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -1.23F, 0F, -0.15F, -1.23F); // Box 443
		slideModel[71].setRotationPoint(-4F, -31F, 2F);
		slideModel[71].rotateAngleY = 1.57079633F;

		slideModel[72].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.23F, -0.15F, 0F, -1.23F, -0.15F, 0F, -0.58F, -1.42F, 0F, -0.58F, -1.42F); // Box 444
		slideModel[72].setRotationPoint(-2F, -31F, 2F);
		slideModel[72].rotateAngleY = 1.57079633F;

		slideModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1.42F, -0.58F, 0F, -1.42F, -0.58F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -1.23F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		slideModel[73].setRotationPoint(-2F, -31F, 2F);
		slideModel[73].rotateAngleY = 1.57079633F;

		slideModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.15F, -1.23F, 0F, -0.15F, -1.23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.42F, -0.58F, 0F, -1.42F, -0.58F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		slideModel[74].setRotationPoint(-2F, -33F, 2F);
		slideModel[74].rotateAngleY = 1.57079633F;

		slideModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1.23F, -0.15F, 0F, -1.23F, -0.15F, 0F, -0.58F, -1.42F, 0F, -0.58F, -1.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		slideModel[75].setRotationPoint(-2F, -33F, 2F);
		slideModel[75].rotateAngleY = 1.57079633F;

		slideModel[76].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 307
		slideModel[76].setRotationPoint(0F, -34.5F, 2.75F);

		slideModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F); // Box 308
		slideModel[77].setRotationPoint(-1.5F, -33.5F, 2.75F);

		slideModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F); // Box 309
		slideModel[78].setRotationPoint(-1F, -29.75F, 2.75F);

		slideModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F); // Box 310
		slideModel[79].setRotationPoint(-1.75F, -29.75F, 2.75F);

		slideModel[80].addShapeBox(0F, -0.500000000000003F, -3F, 1, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 311
		slideModel[80].setRotationPoint(-4F, -31F, 4F);
		slideModel[80].rotateAngleX = 0.52359878F;
		slideModel[80].rotateAngleY = 1.57079633F;

		slideModel[81].addShapeBox(0F, -1.05F, -3F, 1, 1, 5, 0F,0F, -0.65F, -0.1F, -0.1F, -0.65F, -0.1F, -0.95F, -0.65F, -0.15F, 0F, -0.65F, -0.15F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.9F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 312
		slideModel[81].setRotationPoint(-4F, -31F, 4F);
		slideModel[81].rotateAngleX = 0.52359878F;
		slideModel[81].rotateAngleY = 1.57079633F;

		slideModel[82].addShapeBox(0F, 0.0499999999999943F, -3F, 1, 1, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.9F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.65F, -0.1F, -0.1F, -0.65F, -0.1F, -0.95F, -0.65F, -0.15F, 0F, -0.65F, -0.15F); // Box 313
		slideModel[82].setRotationPoint(-4F, -31F, 4F);
		slideModel[82].rotateAngleX = 0.52359878F;
		slideModel[82].rotateAngleY = 1.57079633F;
	}
}